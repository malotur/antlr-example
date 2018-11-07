/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.sqtds.antlr4.vtl.VtlBaseListener;
import org.sqtds.antlr4.vtl.VtlParser;
import org.sqtds.antlr4.vtl2.Vtl2Parser;

import static org.sqtds.antlr4.vtl.VtlParser.*;

public class ConvertToVtl2Listener extends VtlBaseListener {
    TokenStream tokens;
    TokenStreamRewriter rewriter;

    public ConvertToVtl2Listener(TokenStream tokens) {
        this.tokens = tokens;
        rewriter = new TokenStreamRewriter(tokens);
    }

    @Override
    public void enterDefFunction(VtlParser.DefFunctionContext ctx) {
        // create function -> define operator
        rewriter.replace(ctx.start, "define operator ");
        if (ctx.RETURNS() != null) {
            Token retType = findNextNotWhitespace(tokens, ctx.AS().getSymbol().getTokenIndex() + 1);
            rewriter.insertBefore(ctx.expr().start, String.format("%s %s %s ", ctx.RETURNS().getText(), retType.getText(), getTokenName(IS)));
            rewriter.delete(ctx.RETURNS().getSymbol());
            rewriter.delete(ctx.AS().getSymbol());
            rewriter.delete(retType);
        } else {
            rewriter.insertBefore(ctx.expr().start, String.format(" %s ", getTokenName(IS)));
        }

        for (VtlParser.ArgContext arg : ctx.argList().arg()) {
            // TODO: verificare eventuale lettura tipi dal dominio invece di indentifier
            rewriter.insertAfter(arg.stop, String.format(" %s", getTokenName(IDENTIFIER)));
        }

        Token openBracket = findNextNotWhitespace(tokens, ctx.argList().getStop().getTokenIndex() + 2);
        if (openBracket != null)
            rewriter.delete(openBracket);
        rewriter.replace(ctx.stop, String.format(" %s %s", getTokenName(END), getV2TokenName(Vtl2Parser.OPERATOR)));

        rewriter.delete(ctx.AS().getSymbol());
    }

    @Override
    public void enterSetMemberList(VtlParser.SetMemberListContext ctx) {
        // in () -> in {}
        // elimina gli eventuali spazi andando a ritroso finché non trova il token "IN"
        Token in = findPreviousNotWhitespace(tokens, ctx.getStart().getTokenIndex() - 1, "(");
        if (in != null && VtlParser.IN == in.getType() || VtlParser.NOT_IN == in.getType()) {
            // elimina gli eventuali spazi andando in avanti finché non trova la parentesi
            Token openBrk = findNextNotWhitespace(tokens, in.getTokenIndex() + 1);
            if ("(".equals(openBrk.getText())) {
                rewriter.replace(openBrk, "{");
//                Token closeBrk = tokens.get(ctx.getStop().getTokenIndex()+1);
                Token closeBrk = findNextNotWhitespace(tokens, ctx.getStop().getTokenIndex() + 1);
                if (")".equals(closeBrk.getText())) {
                    rewriter.replace(closeBrk, "}");
                }
            }
        }
    }

    @Override
    public void enterKeepClause(KeepClauseContext ctx) {
        // keep(a, b... -> keep a, b
        Token openBrk = findNextNotWhitespace(tokens, ctx.getStart().getTokenIndex() + 1);
        if (openBrk != null && "(".equals(openBrk.getText())) {
            rewriter.replace(openBrk, " ");
            rewriter.replace(ctx.getStop(), " ");
        }

        // remove role xxx
        for (int i = 0; ctx.setMemberListAlias() != null && i < ctx.setMemberListAlias().getChildCount(); ++i) {
            if (ctx.setMemberListAlias().getChild(i) instanceof TerminalNodeImpl) {
                if (((TerminalNodeImpl) ctx.setMemberListAlias().getChild(i)).symbol.getType() == VtlParser.ROLE) {
                    rewriter.delete(((TerminalNodeImpl) ctx.setMemberListAlias().getChild(i)).symbol);
                }
            }
            if (ctx.setMemberListAlias().getChild(i) instanceof VtlParser.RoleIDContext) {
                rewriter.delete(((RoleIDContext) ctx.setMemberListAlias().getChild(i)).start);
            }
        }
    }

    @Override
    public void enterKeepClauseItem(KeepClauseItemContext ctx) {
        super.enterKeepClauseItem(ctx);
    }

    private String getTokenName(int tok) {
        return VtlParser.tokenNames[tok].replaceAll("'", "");
    }

    private String getV2TokenName(int tok) {
        return Vtl2Parser.tokenNames[tok].replaceAll("'", "");
    }

    private Token findPreviousNotWhitespace(TokenStream tokens, int startIdx) {
        return findPreviousNotWhitespace(tokens, startIdx, null);
    }

    private Token findPreviousNotWhitespace(TokenStream tokens, int startIdx, String excludeAlso) {
        while (startIdx >= 0) {
            if (!" ".equals(tokens.get(startIdx).getText())
                    && (excludeAlso == null || !excludeAlso.equals(tokens.get(startIdx).getText()))) {
                return tokens.get(startIdx);
            }
            startIdx--;
        }
        return null;
    }

    private Token findNextNotWhitespace(TokenStream tokens, int startIdx) {
        while (startIdx < tokens.size()) {
            if (!" ".equals(tokens.get(startIdx).getText())) {
                return tokens.get(startIdx);
            }
            startIdx++;
        }
        return null;
    }
}
