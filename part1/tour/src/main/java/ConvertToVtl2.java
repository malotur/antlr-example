/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.sqtds.antlr4.vtl.VtlLexer;
import org.sqtds.antlr4.vtl.VtlParser;
import org.sqtds.antlr4.vtl2.Vtl2Lexer;
import org.sqtds.antlr4.vtl2.Vtl2Parser;

import java.io.File;
import java.util.HashMap;
import java.util.List;

public class ConvertToVtl2 {
    static class ConversionResult {
        // id della trasformazione originale
        String id;
        // expression originale
        String original;
        // expression tradotta
        String converted;
        // esito ed eventuale exception
        boolean success;
        String exceptionMsg;

        public ConversionResult(String id, String original, String converted, boolean success, String exceptionMsg) {
            this.id = id;
            this.original = original;
            this.converted = converted;
            this.success = success;
            this.exceptionMsg = exceptionMsg;
        }
    }

    static class ParseResult {
        // id della trasformazione originale
        String id;
        // expression originale
        String original;
        // expression parsata
        String parsed;
        // esito ed eventuale exception
        boolean success;
        String exceptionMsg;

        public ParseResult(String id, String original, String parsed, boolean success, String exceptionMsg) {
            this.id = id;
            this.original = original;
            this.parsed = parsed;
            this.success = success;
            this.exceptionMsg = exceptionMsg;
        }
    }

    public static void main(String[] args) throws Exception {
        ConversionResult convertedExpr = null;
        ParseResult parsedV2Expr = null;

        // singola espressione di test da convertire
        String expression;

//        expression = "out := dd1 [filter(y in (\"4\", \"5\"))];";

//        expression = "SCRTSTNS_SRVCRS_E := TRNSCTNS_CNTRPRTS [filter(TYP_TRNSCTN in (\"4\", \"5\") and CNTRPRTY_RL in (\"3\"))];";

        expression = "create function D_ACCMLTD_NGTV_CHNGS_FV_CR (ACCMLTD_CHNGS_FV_CR) {\n" +
                "returns \n" +
                "if ACCMLTD_CHNGS_FV_CR < 0 then ACCMLTD_CHNGS_FV_CR else 0\n" +
                "as integer\n" +
                "}";

//        expression = "/*Application of hierarchies and derivation of combinations for the given input dataset*/create function APPLY_HIERARCHIES_AND_AGGREGATION(INPT_CB) {\n" +
//                "returns \n" +
//                "hierarchiesAndAggregation(INPT_CB)\n" +
//                "as dataset\n" +
//                "}";

//        expression = "BT_SCRTS_DBTRS_PRTCTNS_FINREP := DBT_SCRTS_DBTRS_PRTCTNS_FINREP [keep(ACCNTNG_CLSSFCTN role Identifier, DT_RFRNC role Identifier, INSTTTNL_SCTR role Identifier, IS_HFS role Identifier, OBSRVD_AGNT_INTRNL_ID role Identifier, PRFRMNG_STTS role Identifier, PRJCT_FNNC_LN role Identifier, PRPS role Identifier, PRSPCTV_ID role Identifier, RPYMNT_RGHTS role Identifier, TM_PST_DU role Identifier, TYP_ACCNTNG_ITM role Identifier, TYP_CLLTRL_GRNT_GVN role Identifier, TYP_INSTRMNT role Identifier, CRRYNG_AMNT role Measure)]";

        // converte
        convertedExpr = convertExpressionToVTL2("", expression, false);
        // verifica se il parser VTL2 è in grado di gestire correttamente l'espressione
        parsedV2Expr = parseVTL2Expression("", convertedExpr.converted, false);

        if (convertedExpr != null && parsedV2Expr != null) {
            System.out.println(String.format("ORIGINAL : \n%s\n\nTRANSLATED : \n%s\n\nAST V2 (no whitespaces) --->\n%s"
                    , expression, convertedExpr.converted, parsedV2Expr.parsed));
        } else {
            System.out.println(String.format("ERROR : \n%s\n%s\n"
                    , expression, convertedExpr.converted));
        }

        // se è un test singolo, evitiamo il loop su tutte le altre
        if (true)
            return;

        // legge il file .json contenente tutte le transformations estratte dal BIRD database (ignora conversioni di tipo)
        ObjectMapper objectMapper = new ObjectMapper();
        List<Translation> listTrans = objectMapper.readValue(new File("transformations.json"), new TypeReference<List<Translation>>() {});
        HashMap<String, String> errors = new HashMap<>();

        for (Translation translation : listTrans) {
            convertedExpr = null;
            parsedV2Expr = null;

            // converte
            convertedExpr = convertExpressionToVTL2(translation.getTransformationId(), translation.getExpression(), false);
            // verifica se il parser VTL2 è in grado di gestire correttamente l'espressione
            parsedV2Expr = parseVTL2Expression(translation.getTransformationId(), convertedExpr.converted, false);

            //TODO: gestire output ed errori in modo appropriato
            if (convertedExpr != null && convertedExpr.success && parsedV2Expr != null && parsedV2Expr.success) {
//                System.out.println(String.format("PARSED : %s\n%s\n%s\n--->\n%s"
//                        , translation.getTransformationId(), expression, parsedV1.converted, parsedV2.parsed));
            } else {
                errors.put(translation.getTransformationId(), expression);
                System.out.println(String.format("ERROR : %s\n%s\n%s\n"
                        , translation.getTransformationId(), expression, convertedExpr.converted));
            }
        }

        System.out.println("=============================");
        System.out.println(String.format("Errors %d/%d", errors.size(), listTrans.size()));
    }

    /**
     * Converte una expression (di una transformation) da sintassi VTL1 in una equivalente in VTL2
     * @param id id della transformation originale (nel BIRD database)
     * @param expression expression originale in VTL1
     * @param printAst stampa per debug l'AST
     * @return DTO con l'esito della conversione
     */
    public static ConversionResult convertExpressionToVTL2(String id, String expression, boolean printAst) {
        ANTLRInputStream input = new ANTLRInputStream(expression.replace("\n", " "));

        VtlLexer lexer = new VtlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        VtlParser parser = new VtlParser(tokens);
        ParseTree tree = parser.start(); // parse

        if(printAst)
            printAST(tree);

        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        ConvertToVtl2Listener extractor = new ConvertToVtl2Listener(tokens);
        walker.walk(extractor, tree); // initiate walk of tree with listener

        // print back ALTERED stream
        String output = extractor.rewriter.getText().replaceAll("  ", " ").replaceAll("  ", " ");
        RecognitionException excp = ((VtlParser.StartContext) tree).exception;

        return new ConversionResult(id, expression, output, excp == null, excp != null ? excp.getMessage() : null);
    }

    /**
     * Esegue il parse di una expression scritta in VTL2
     * @param id id della transformation originale (nel BIRD database)
     * @param expression espressione in VTL2
     * @param printAst stampa per debug l'AST
     * @return DTO con l'esito del parse
     */

    public static ParseResult parseVTL2Expression(String id, String expression, boolean printAst) {
        ANTLRInputStream input = new ANTLRInputStream(expression.replace("\n", " "));

        Vtl2Lexer lexer = new Vtl2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Vtl2Parser parser = new Vtl2Parser(tokens);
        ParseTree tree = parser.start(); // parse

        if (((Vtl2Parser.StartContext) tree).exception != null)
            return null;

        if(printAst)
            printAST(tree);

        String output = tree.getText();
        RecognitionException excp = ((Vtl2Parser.StartContext) tree).exception;
        return new ParseResult(id, expression, output, excp == null, excp != null ? excp.getMessage() : null);
    }

    private static void printAST(ParseTree tree) {
        AST ast = new AST(tree);
        System.out.println("* Tree structure of the abstract syntax tree:");
        System.out.println(ast.toString());
        System.out.println("----------------------------------");
    }
}
