// Generated from org\sqtds\antlr4\vtl\Vtl.g4 by ANTLR 4.2.2
package org.sqtds.antlr4.vtl;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VtlParser}.
 */
public interface VtlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VtlParser#setrule}.
	 * @param ctx the parse tree
	 */
	void enterSetrule(@NotNull VtlParser.SetruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#setrule}.
	 * @param ctx the parse tree
	 */
	void exitSetrule(@NotNull VtlParser.SetruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#betweenRowsClauseItem}.
	 * @param ctx the parse tree
	 */
	void enterBetweenRowsClauseItem(@NotNull VtlParser.BetweenRowsClauseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#betweenRowsClauseItem}.
	 * @param ctx the parse tree
	 */
	void exitBetweenRowsClauseItem(@NotNull VtlParser.BetweenRowsClauseItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#calcClauseItem}.
	 * @param ctx the parse tree
	 */
	void enterCalcClauseItem(@NotNull VtlParser.CalcClauseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#calcClauseItem}.
	 * @param ctx the parse tree
	 */
	void exitCalcClauseItem(@NotNull VtlParser.CalcClauseItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#aggrFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggrFunction(@NotNull VtlParser.AggrFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#aggrFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggrFunction(@NotNull VtlParser.AggrFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#typeAtom}.
	 * @param ctx the parse tree
	 */
	void enterTypeAtom(@NotNull VtlParser.TypeAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#typeAtom}.
	 * @param ctx the parse tree
	 */
	void exitTypeAtom(@NotNull VtlParser.TypeAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#exprExists}.
	 * @param ctx the parse tree
	 */
	void enterExprExists(@NotNull VtlParser.ExprExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprExists}.
	 * @param ctx the parse tree
	 */
	void exitExprExists(@NotNull VtlParser.ExprExistsContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#procedureCallBody}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCallBody(@NotNull VtlParser.ProcedureCallBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#procedureCallBody}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCallBody(@NotNull VtlParser.ProcedureCallBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#defDataset}.
	 * @param ctx the parse tree
	 */
	void enterDefDataset(@NotNull VtlParser.DefDatasetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defDataset}.
	 * @param ctx the parse tree
	 */
	void exitDefDataset(@NotNull VtlParser.DefDatasetContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#refAtom}.
	 * @param ctx the parse tree
	 */
	void enterRefAtom(@NotNull VtlParser.RefAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#refAtom}.
	 * @param ctx the parse tree
	 */
	void exitRefAtom(@NotNull VtlParser.RefAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#indexofAtom}.
	 * @param ctx the parse tree
	 */
	void enterIndexofAtom(@NotNull VtlParser.IndexofAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#indexofAtom}.
	 * @param ctx the parse tree
	 */
	void exitIndexofAtom(@NotNull VtlParser.IndexofAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#validationDatapoint}.
	 * @param ctx the parse tree
	 */
	void enterValidationDatapoint(@NotNull VtlParser.ValidationDatapointContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#validationDatapoint}.
	 * @param ctx the parse tree
	 */
	void exitValidationDatapoint(@NotNull VtlParser.ValidationDatapointContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(@NotNull VtlParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(@NotNull VtlParser.OrderByClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#defineDatapointRuleset}.
	 * @param ctx the parse tree
	 */
	void enterDefineDatapointRuleset(@NotNull VtlParser.DefineDatapointRulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defineDatapointRuleset}.
	 * @param ctx the parse tree
	 */
	void exitDefineDatapointRuleset(@NotNull VtlParser.DefineDatapointRulesetContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#ruleClauseHierarchical}.
	 * @param ctx the parse tree
	 */
	void enterRuleClauseHierarchical(@NotNull VtlParser.RuleClauseHierarchicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ruleClauseHierarchical}.
	 * @param ctx the parse tree
	 */
	void exitRuleClauseHierarchical(@NotNull VtlParser.RuleClauseHierarchicalContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#joinRenameArgList}.
	 * @param ctx the parse tree
	 */
	void enterJoinRenameArgList(@NotNull VtlParser.JoinRenameArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinRenameArgList}.
	 * @param ctx the parse tree
	 */
	void exitJoinRenameArgList(@NotNull VtlParser.JoinRenameArgListContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#joinRenameArg}.
	 * @param ctx the parse tree
	 */
	void enterJoinRenameArg(@NotNull VtlParser.JoinRenameArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinRenameArg}.
	 * @param ctx the parse tree
	 */
	void exitJoinRenameArg(@NotNull VtlParser.JoinRenameArgContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#setruleList}.
	 * @param ctx the parse tree
	 */
	void enterSetruleList(@NotNull VtlParser.SetruleListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#setruleList}.
	 * @param ctx the parse tree
	 */
	void exitSetruleList(@NotNull VtlParser.SetruleListContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#setMemberList}.
	 * @param ctx the parse tree
	 */
	void enterSetMemberList(@NotNull VtlParser.SetMemberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#setMemberList}.
	 * @param ctx the parse tree
	 */
	void exitSetMemberList(@NotNull VtlParser.SetMemberListContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#elseExpr}.
	 * @param ctx the parse tree
	 */
	void enterElseExpr(@NotNull VtlParser.ElseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#elseExpr}.
	 * @param ctx the parse tree
	 */
	void exitElseExpr(@NotNull VtlParser.ElseExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#varID}.
	 * @param ctx the parse tree
	 */
	void enterVarID(@NotNull VtlParser.VarIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#varID}.
	 * @param ctx the parse tree
	 */
	void exitVarID(@NotNull VtlParser.VarIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#procedureInput}.
	 * @param ctx the parse tree
	 */
	void enterProcedureInput(@NotNull VtlParser.ProcedureInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#procedureInput}.
	 * @param ctx the parse tree
	 */
	void exitProcedureInput(@NotNull VtlParser.ProcedureInputContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#defDatapoint}.
	 * @param ctx the parse tree
	 */
	void enterDefDatapoint(@NotNull VtlParser.DefDatapointContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defDatapoint}.
	 * @param ctx the parse tree
	 */
	void exitDefDatapoint(@NotNull VtlParser.DefDatapointContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#aggrParam}.
	 * @param ctx the parse tree
	 */
	void enterAggrParam(@NotNull VtlParser.AggrParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#aggrParam}.
	 * @param ctx the parse tree
	 */
	void exitAggrParam(@NotNull VtlParser.AggrParamContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#ruleID}.
	 * @param ctx the parse tree
	 */
	void enterRuleID(@NotNull VtlParser.RuleIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ruleID}.
	 * @param ctx the parse tree
	 */
	void exitRuleID(@NotNull VtlParser.RuleIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#sqrtAtom}.
	 * @param ctx the parse tree
	 */
	void enterSqrtAtom(@NotNull VtlParser.SqrtAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#sqrtAtom}.
	 * @param ctx the parse tree
	 */
	void exitSqrtAtom(@NotNull VtlParser.SqrtAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#anFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnFunction(@NotNull VtlParser.AnFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#anFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnFunction(@NotNull VtlParser.AnFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#ltrimAtom}.
	 * @param ctx the parse tree
	 */
	void enterLtrimAtom(@NotNull VtlParser.LtrimAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ltrimAtom}.
	 * @param ctx the parse tree
	 */
	void exitLtrimAtom(@NotNull VtlParser.LtrimAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#stockToFlowAtom}.
	 * @param ctx the parse tree
	 */
	void enterStockToFlowAtom(@NotNull VtlParser.StockToFlowAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#stockToFlowAtom}.
	 * @param ctx the parse tree
	 */
	void exitStockToFlowAtom(@NotNull VtlParser.StockToFlowAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#datasetClause}.
	 * @param ctx the parse tree
	 */
	void enterDatasetClause(@NotNull VtlParser.DatasetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#datasetClause}.
	 * @param ctx the parse tree
	 */
	void exitDatasetClause(@NotNull VtlParser.DatasetClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#rulesetSignature}.
	 * @param ctx the parse tree
	 */
	void enterRulesetSignature(@NotNull VtlParser.RulesetSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#rulesetSignature}.
	 * @param ctx the parse tree
	 */
	void exitRulesetSignature(@NotNull VtlParser.RulesetSignatureContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#hierarchyExpr}.
	 * @param ctx the parse tree
	 */
	void enterHierarchyExpr(@NotNull VtlParser.HierarchyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#hierarchyExpr}.
	 * @param ctx the parse tree
	 */
	void exitHierarchyExpr(@NotNull VtlParser.HierarchyExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#setExprListRestricted}.
	 * @param ctx the parse tree
	 */
	void enterSetExprListRestricted(@NotNull VtlParser.SetExprListRestrictedContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#setExprListRestricted}.
	 * @param ctx the parse tree
	 */
	void exitSetExprListRestricted(@NotNull VtlParser.SetExprListRestrictedContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#joinKeepClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinKeepClause(@NotNull VtlParser.JoinKeepClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinKeepClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinKeepClause(@NotNull VtlParser.JoinKeepClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#exprCompIn}.
	 * @param ctx the parse tree
	 */
	void enterExprCompIn(@NotNull VtlParser.ExprCompInContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprCompIn}.
	 * @param ctx the parse tree
	 */
	void exitExprCompIn(@NotNull VtlParser.ExprCompInContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void enterJoinExpr(@NotNull VtlParser.JoinExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void exitJoinExpr(@NotNull VtlParser.JoinExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#roundAtom}.
	 * @param ctx the parse tree
	 */
	void enterRoundAtom(@NotNull VtlParser.RoundAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#roundAtom}.
	 * @param ctx the parse tree
	 */
	void exitRoundAtom(@NotNull VtlParser.RoundAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(@NotNull VtlParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(@NotNull VtlParser.ArgContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#exprAnd}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(@NotNull VtlParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprAnd}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(@NotNull VtlParser.ExprAndContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(@NotNull VtlParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(@NotNull VtlParser.IfExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(@NotNull VtlParser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(@NotNull VtlParser.ClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#logBase}.
	 * @param ctx the parse tree
	 */
	void enterLogBase(@NotNull VtlParser.LogBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#logBase}.
	 * @param ctx the parse tree
	 */
	void exitLogBase(@NotNull VtlParser.LogBaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#modAtom}.
	 * @param ctx the parse tree
	 */
	void enterModAtom(@NotNull VtlParser.ModAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#modAtom}.
	 * @param ctx the parse tree
	 */
	void exitModAtom(@NotNull VtlParser.ModAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#filterClause}.
	 * @param ctx the parse tree
	 */
	void enterFilterClause(@NotNull VtlParser.FilterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#filterClause}.
	 * @param ctx the parse tree
	 */
	void exitFilterClause(@NotNull VtlParser.FilterClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#ruleItemMapping}.
	 * @param ctx the parse tree
	 */
	void enterRuleItemMapping(@NotNull VtlParser.RuleItemMappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ruleItemMapping}.
	 * @param ctx the parse tree
	 */
	void exitRuleItemMapping(@NotNull VtlParser.RuleItemMappingContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#elseIfExpr}.
	 * @param ctx the parse tree
	 */
	void enterElseIfExpr(@NotNull VtlParser.ElseIfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#elseIfExpr}.
	 * @param ctx the parse tree
	 */
	void exitElseIfExpr(@NotNull VtlParser.ElseIfExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#joinFoldClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinFoldClause(@NotNull VtlParser.JoinFoldClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinFoldClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinFoldClause(@NotNull VtlParser.JoinFoldClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#mappingExpr}.
	 * @param ctx the parse tree
	 */
	void enterMappingExpr(@NotNull VtlParser.MappingExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#mappingExpr}.
	 * @param ctx the parse tree
	 */
	void exitMappingExpr(@NotNull VtlParser.MappingExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#flowToStockAtom}.
	 * @param ctx the parse tree
	 */
	void enterFlowToStockAtom(@NotNull VtlParser.FlowToStockAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#flowToStockAtom}.
	 * @param ctx the parse tree
	 */
	void exitFlowToStockAtom(@NotNull VtlParser.FlowToStockAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#dataset}.
	 * @param ctx the parse tree
	 */
	void enterDataset(@NotNull VtlParser.DatasetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dataset}.
	 * @param ctx the parse tree
	 */
	void exitDataset(@NotNull VtlParser.DatasetContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#persistentDatasetID}.
	 * @param ctx the parse tree
	 */
	void enterPersistentDatasetID(@NotNull VtlParser.PersistentDatasetIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#persistentDatasetID}.
	 * @param ctx the parse tree
	 */
	void exitPersistentDatasetID(@NotNull VtlParser.PersistentDatasetIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#intersectAtom}.
	 * @param ctx the parse tree
	 */
	void enterIntersectAtom(@NotNull VtlParser.IntersectAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#intersectAtom}.
	 * @param ctx the parse tree
	 */
	void exitIntersectAtom(@NotNull VtlParser.IntersectAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#dimClause}.
	 * @param ctx the parse tree
	 */
	void enterDimClause(@NotNull VtlParser.DimClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dimClause}.
	 * @param ctx the parse tree
	 */
	void exitDimClause(@NotNull VtlParser.DimClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#joinCalcClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinCalcClause(@NotNull VtlParser.JoinCalcClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinCalcClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinCalcClause(@NotNull VtlParser.JoinCalcClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#listofCompList}.
	 * @param ctx the parse tree
	 */
	void enterListofCompList(@NotNull VtlParser.ListofCompListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#listofCompList}.
	 * @param ctx the parse tree
	 */
	void exitListofCompList(@NotNull VtlParser.ListofCompListContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#componentList}.
	 * @param ctx the parse tree
	 */
	void enterComponentList(@NotNull VtlParser.ComponentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#componentList}.
	 * @param ctx the parse tree
	 */
	void exitComponentList(@NotNull VtlParser.ComponentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#booleanC}.
	 * @param ctx the parse tree
	 */
	void enterBooleanC(@NotNull VtlParser.BooleanCContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#booleanC}.
	 * @param ctx the parse tree
	 */
	void exitBooleanC(@NotNull VtlParser.BooleanCContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#charsetMatchAtom}.
	 * @param ctx the parse tree
	 */
	void enterCharsetMatchAtom(@NotNull VtlParser.CharsetMatchAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#charsetMatchAtom}.
	 * @param ctx the parse tree
	 */
	void exitCharsetMatchAtom(@NotNull VtlParser.CharsetMatchAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#exprMultiply}.
	 * @param ctx the parse tree
	 */
	void enterExprMultiply(@NotNull VtlParser.ExprMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprMultiply}.
	 * @param ctx the parse tree
	 */
	void exitExprMultiply(@NotNull VtlParser.ExprMultiplyContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#maxAtom}.
	 * @param ctx the parse tree
	 */
	void enterMaxAtom(@NotNull VtlParser.MaxAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#maxAtom}.
	 * @param ctx the parse tree
	 */
	void exitMaxAtom(@NotNull VtlParser.MaxAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#returnAll}.
	 * @param ctx the parse tree
	 */
	void enterReturnAll(@NotNull VtlParser.ReturnAllContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#returnAll}.
	 * @param ctx the parse tree
	 */
	void exitReturnAll(@NotNull VtlParser.ReturnAllContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#attrCalcClause}.
	 * @param ctx the parse tree
	 */
	void enterAttrCalcClause(@NotNull VtlParser.AttrCalcClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#attrCalcClause}.
	 * @param ctx the parse tree
	 */
	void exitAttrCalcClause(@NotNull VtlParser.AttrCalcClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#ucaseAtom}.
	 * @param ctx the parse tree
	 */
	void enterUcaseAtom(@NotNull VtlParser.UcaseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ucaseAtom}.
	 * @param ctx the parse tree
	 */
	void exitUcaseAtom(@NotNull VtlParser.UcaseAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#endHierarchicalRuleset}.
	 * @param ctx the parse tree
	 */
	void enterEndHierarchicalRuleset(@NotNull VtlParser.EndHierarchicalRulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#endHierarchicalRuleset}.
	 * @param ctx the parse tree
	 */
	void exitEndHierarchicalRuleset(@NotNull VtlParser.EndHierarchicalRulesetContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#hierarchyExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterHierarchyExprAtom(@NotNull VtlParser.HierarchyExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#hierarchyExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitHierarchyExprAtom(@NotNull VtlParser.HierarchyExprAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#varIDList}.
	 * @param ctx the parse tree
	 */
	void enterVarIDList(@NotNull VtlParser.VarIDListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#varIDList}.
	 * @param ctx the parse tree
	 */
	void exitVarIDList(@NotNull VtlParser.VarIDListContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#floorAtom}.
	 * @param ctx the parse tree
	 */
	void enterFloorAtom(@NotNull VtlParser.FloorAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#floorAtom}.
	 * @param ctx the parse tree
	 */
	void exitFloorAtom(@NotNull VtlParser.FloorAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#joinDropClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinDropClause(@NotNull VtlParser.JoinDropClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinDropClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinDropClause(@NotNull VtlParser.JoinDropClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#procedureInputList}.
	 * @param ctx the parse tree
	 */
	void enterProcedureInputList(@NotNull VtlParser.ProcedureInputListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#procedureInputList}.
	 * @param ctx the parse tree
	 */
	void exitProcedureInputList(@NotNull VtlParser.ProcedureInputListContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#keepClauseItem}.
	 * @param ctx the parse tree
	 */
	void enterKeepClauseItem(@NotNull VtlParser.KeepClauseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#keepClauseItem}.
	 * @param ctx the parse tree
	 */
	void exitKeepClauseItem(@NotNull VtlParser.KeepClauseItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#strExprParam}.
	 * @param ctx the parse tree
	 */
	void enterStrExprParam(@NotNull VtlParser.StrExprParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#strExprParam}.
	 * @param ctx the parse tree
	 */
	void exitStrExprParam(@NotNull VtlParser.StrExprParamContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#lenAtom}.
	 * @param ctx the parse tree
	 */
	void enterLenAtom(@NotNull VtlParser.LenAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#lenAtom}.
	 * @param ctx the parse tree
	 */
	void exitLenAtom(@NotNull VtlParser.LenAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#exprEq}.
	 * @param ctx the parse tree
	 */
	void enterExprEq(@NotNull VtlParser.ExprEqContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprEq}.
	 * @param ctx the parse tree
	 */
	void exitExprEq(@NotNull VtlParser.ExprEqContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#codeItemRelation}.
	 * @param ctx the parse tree
	 */
	void enterCodeItemRelation(@NotNull VtlParser.CodeItemRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#codeItemRelation}.
	 * @param ctx the parse tree
	 */
	void exitCodeItemRelation(@NotNull VtlParser.CodeItemRelationContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#nrootAtom}.
	 * @param ctx the parse tree
	 */
	void enterNrootAtom(@NotNull VtlParser.NrootAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#nrootAtom}.
	 * @param ctx the parse tree
	 */
	void exitNrootAtom(@NotNull VtlParser.NrootAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull VtlParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull VtlParser.ListContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#joinFilterClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinFilterClause(@NotNull VtlParser.JoinFilterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinFilterClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinFilterClause(@NotNull VtlParser.JoinFilterClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#defineHierarchicalRuleset}.
	 * @param ctx the parse tree
	 */
	void enterDefineHierarchicalRuleset(@NotNull VtlParser.DefineHierarchicalRulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defineHierarchicalRuleset}.
	 * @param ctx the parse tree
	 */
	void exitDefineHierarchicalRuleset(@NotNull VtlParser.DefineHierarchicalRulesetContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#setExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterSetExprAtom(@NotNull VtlParser.SetExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#setExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitSetExprAtom(@NotNull VtlParser.SetExprAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#renameClause}.
	 * @param ctx the parse tree
	 */
	void enterRenameClause(@NotNull VtlParser.RenameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#renameClause}.
	 * @param ctx the parse tree
	 */
	void exitRenameClause(@NotNull VtlParser.RenameClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#functionID}.
	 * @param ctx the parse tree
	 */
	void enterFunctionID(@NotNull VtlParser.FunctionIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#functionID}.
	 * @param ctx the parse tree
	 */
	void exitFunctionID(@NotNull VtlParser.FunctionIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#mapItemClause}.
	 * @param ctx the parse tree
	 */
	void enterMapItemClause(@NotNull VtlParser.MapItemClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#mapItemClause}.
	 * @param ctx the parse tree
	 */
	void exitMapItemClause(@NotNull VtlParser.MapItemClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#exprFactor}.
	 * @param ctx the parse tree
	 */
	void enterExprFactor(@NotNull VtlParser.ExprFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprFactor}.
	 * @param ctx the parse tree
	 */
	void exitExprFactor(@NotNull VtlParser.ExprFactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#sumExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterSumExprAtom(@NotNull VtlParser.SumExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#sumExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitSumExprAtom(@NotNull VtlParser.SumExprAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#dimensionType}.
	 * @param ctx the parse tree
	 */
	void enterDimensionType(@NotNull VtlParser.DimensionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dimensionType}.
	 * @param ctx the parse tree
	 */
	void exitDimensionType(@NotNull VtlParser.DimensionTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#ruleItemDatapoint}.
	 * @param ctx the parse tree
	 */
	void enterRuleItemDatapoint(@NotNull VtlParser.RuleItemDatapointContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ruleItemDatapoint}.
	 * @param ctx the parse tree
	 */
	void exitRuleItemDatapoint(@NotNull VtlParser.RuleItemDatapointContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#roleID}.
	 * @param ctx the parse tree
	 */
	void enterRoleID(@NotNull VtlParser.RoleIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#roleID}.
	 * @param ctx the parse tree
	 */
	void exitRoleID(@NotNull VtlParser.RoleIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#exprConcatExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprConcatExpr(@NotNull VtlParser.ExprConcatExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprConcatExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprConcatExpr(@NotNull VtlParser.ExprConcatExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#instrAtom}.
	 * @param ctx the parse tree
	 */
	void enterInstrAtom(@NotNull VtlParser.InstrAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#instrAtom}.
	 * @param ctx the parse tree
	 */
	void exitInstrAtom(@NotNull VtlParser.InstrAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#renameArg}.
	 * @param ctx the parse tree
	 */
	void enterRenameArg(@NotNull VtlParser.RenameArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#renameArg}.
	 * @param ctx the parse tree
	 */
	void exitRenameArg(@NotNull VtlParser.RenameArgContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#aggregategetClause}.
	 * @param ctx the parse tree
	 */
	void enterAggregategetClause(@NotNull VtlParser.AggregategetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#aggregategetClause}.
	 * @param ctx the parse tree
	 */
	void exitAggregategetClause(@NotNull VtlParser.AggregategetClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#unionAtom}.
	 * @param ctx the parse tree
	 */
	void enterUnionAtom(@NotNull VtlParser.UnionAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#unionAtom}.
	 * @param ctx the parse tree
	 */
	void exitUnionAtom(@NotNull VtlParser.UnionAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#rulesetBody}.
	 * @param ctx the parse tree
	 */
	void enterRulesetBody(@NotNull VtlParser.RulesetBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#rulesetBody}.
	 * @param ctx the parse tree
	 */
	void exitRulesetBody(@NotNull VtlParser.RulesetBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#concatExpr}.
	 * @param ctx the parse tree
	 */
	void enterConcatExpr(@NotNull VtlParser.ConcatExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#concatExpr}.
	 * @param ctx the parse tree
	 */
	void exitConcatExpr(@NotNull VtlParser.ConcatExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#dedupClause}.
	 * @param ctx the parse tree
	 */
	void enterDedupClause(@NotNull VtlParser.DedupClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dedupClause}.
	 * @param ctx the parse tree
	 */
	void exitDedupClause(@NotNull VtlParser.DedupClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#timeSeriesExpr}.
	 * @param ctx the parse tree
	 */
	void enterTimeSeriesExpr(@NotNull VtlParser.TimeSeriesExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#timeSeriesExpr}.
	 * @param ctx the parse tree
	 */
	void exitTimeSeriesExpr(@NotNull VtlParser.TimeSeriesExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#putExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterPutExprAtom(@NotNull VtlParser.PutExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#putExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitPutExprAtom(@NotNull VtlParser.PutExprAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull VtlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull VtlParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#diffAtom}.
	 * @param ctx the parse tree
	 */
	void enterDiffAtom(@NotNull VtlParser.DiffAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#diffAtom}.
	 * @param ctx the parse tree
	 */
	void exitDiffAtom(@NotNull VtlParser.DiffAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#partitionByClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionByClause(@NotNull VtlParser.PartitionByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#partitionByClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionByClause(@NotNull VtlParser.PartitionByClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#numberC}.
	 * @param ctx the parse tree
	 */
	void enterNumberC(@NotNull VtlParser.NumberCContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#numberC}.
	 * @param ctx the parse tree
	 */
	void exitNumberC(@NotNull VtlParser.NumberCContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#mapTo}.
	 * @param ctx the parse tree
	 */
	void enterMapTo(@NotNull VtlParser.MapToContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#mapTo}.
	 * @param ctx the parse tree
	 */
	void exitMapTo(@NotNull VtlParser.MapToContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void enterCalcExpr(@NotNull VtlParser.CalcExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void exitCalcExpr(@NotNull VtlParser.CalcExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#substrAtom}.
	 * @param ctx the parse tree
	 */
	void enterSubstrAtom(@NotNull VtlParser.SubstrAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#substrAtom}.
	 * @param ctx the parse tree
	 */
	void exitSubstrAtom(@NotNull VtlParser.SubstrAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#logAtom}.
	 * @param ctx the parse tree
	 */
	void enterLogAtom(@NotNull VtlParser.LogAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#logAtom}.
	 * @param ctx the parse tree
	 */
	void exitLogAtom(@NotNull VtlParser.LogAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#anyAtom}.
	 * @param ctx the parse tree
	 */
	void enterAnyAtom(@NotNull VtlParser.AnyAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#anyAtom}.
	 * @param ctx the parse tree
	 */
	void exitAnyAtom(@NotNull VtlParser.AnyAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull VtlParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull VtlParser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#negIntegerC}.
	 * @param ctx the parse tree
	 */
	void enterNegIntegerC(@NotNull VtlParser.NegIntegerCContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#negIntegerC}.
	 * @param ctx the parse tree
	 */
	void exitNegIntegerC(@NotNull VtlParser.NegIntegerCContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#expAtom}.
	 * @param ctx the parse tree
	 */
	void enterExpAtom(@NotNull VtlParser.ExpAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#expAtom}.
	 * @param ctx the parse tree
	 */
	void exitExpAtom(@NotNull VtlParser.ExpAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#calcClause}.
	 * @param ctx the parse tree
	 */
	void enterCalcClause(@NotNull VtlParser.CalcClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#calcClause}.
	 * @param ctx the parse tree
	 */
	void exitCalcClause(@NotNull VtlParser.CalcClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#dataStructureItem}.
	 * @param ctx the parse tree
	 */
	void enterDataStructureItem(@NotNull VtlParser.DataStructureItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dataStructureItem}.
	 * @param ctx the parse tree
	 */
	void exitDataStructureItem(@NotNull VtlParser.DataStructureItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#aggrFunctionClause}.
	 * @param ctx the parse tree
	 */
	void enterAggrFunctionClause(@NotNull VtlParser.AggrFunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#aggrFunctionClause}.
	 * @param ctx the parse tree
	 */
	void exitAggrFunctionClause(@NotNull VtlParser.AggrFunctionClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#erCode}.
	 * @param ctx the parse tree
	 */
	void enterErCode(@NotNull VtlParser.ErCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#erCode}.
	 * @param ctx the parse tree
	 */
	void exitErCode(@NotNull VtlParser.ErCodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull VtlParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull VtlParser.CommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#mapFrom}.
	 * @param ctx the parse tree
	 */
	void enterMapFrom(@NotNull VtlParser.MapFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#mapFrom}.
	 * @param ctx the parse tree
	 */
	void exitMapFrom(@NotNull VtlParser.MapFromContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#joinRenameClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinRenameClause(@NotNull VtlParser.JoinRenameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinRenameClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinRenameClause(@NotNull VtlParser.JoinRenameClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#compareClause}.
	 * @param ctx the parse tree
	 */
	void enterCompareClause(@NotNull VtlParser.CompareClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#compareClause}.
	 * @param ctx the parse tree
	 */
	void exitCompareClause(@NotNull VtlParser.CompareClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#timeShiftExpr}.
	 * @param ctx the parse tree
	 */
	void enterTimeShiftExpr(@NotNull VtlParser.TimeShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#timeShiftExpr}.
	 * @param ctx the parse tree
	 */
	void exitTimeShiftExpr(@NotNull VtlParser.TimeShiftExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#allAtom}.
	 * @param ctx the parse tree
	 */
	void enterAllAtom(@NotNull VtlParser.AllAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#allAtom}.
	 * @param ctx the parse tree
	 */
	void exitAllAtom(@NotNull VtlParser.AllAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#defValueDomainSubset}.
	 * @param ctx the parse tree
	 */
	void enterDefValueDomainSubset(@NotNull VtlParser.DefValueDomainSubsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defValueDomainSubset}.
	 * @param ctx the parse tree
	 */
	void exitDefValueDomainSubset(@NotNull VtlParser.DefValueDomainSubsetContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#getExpr}.
	 * @param ctx the parse tree
	 */
	void enterGetExpr(@NotNull VtlParser.GetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#getExpr}.
	 * @param ctx the parse tree
	 */
	void exitGetExpr(@NotNull VtlParser.GetExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#lcaseAtom}.
	 * @param ctx the parse tree
	 */
	void enterLcaseAtom(@NotNull VtlParser.LcaseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#lcaseAtom}.
	 * @param ctx the parse tree
	 */
	void exitLcaseAtom(@NotNull VtlParser.LcaseAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#parenthesisExprRef}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExprRef(@NotNull VtlParser.ParenthesisExprRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#parenthesisExprRef}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExprRef(@NotNull VtlParser.ParenthesisExprRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#exprFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterExprFunctionCall(@NotNull VtlParser.ExprFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitExprFunctionCall(@NotNull VtlParser.ExprFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#mappingID}.
	 * @param ctx the parse tree
	 */
	void enterMappingID(@NotNull VtlParser.MappingIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#mappingID}.
	 * @param ctx the parse tree
	 */
	void exitMappingID(@NotNull VtlParser.MappingIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#exprValidationExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprValidationExpr(@NotNull VtlParser.ExprValidationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprValidationExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprValidationExpr(@NotNull VtlParser.ExprValidationExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#getFilterClause}.
	 * @param ctx the parse tree
	 */
	void enterGetFilterClause(@NotNull VtlParser.GetFilterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#getFilterClause}.
	 * @param ctx the parse tree
	 */
	void exitGetFilterClause(@NotNull VtlParser.GetFilterClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#alterExpr}.
	 * @param ctx the parse tree
	 */
	void enterAlterExpr(@NotNull VtlParser.AlterExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#alterExpr}.
	 * @param ctx the parse tree
	 */
	void exitAlterExpr(@NotNull VtlParser.AlterExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#joinUnfoldClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinUnfoldClause(@NotNull VtlParser.JoinUnfoldClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinUnfoldClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinUnfoldClause(@NotNull VtlParser.JoinUnfoldClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#validationHierarchical}.
	 * @param ctx the parse tree
	 */
	void enterValidationHierarchical(@NotNull VtlParser.ValidationHierarchicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#validationHierarchical}.
	 * @param ctx the parse tree
	 */
	void exitValidationHierarchical(@NotNull VtlParser.ValidationHierarchicalContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull VtlParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull VtlParser.FunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#aggregateClause}.
	 * @param ctx the parse tree
	 */
	void enterAggregateClause(@NotNull VtlParser.AggregateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#aggregateClause}.
	 * @param ctx the parse tree
	 */
	void exitAggregateClause(@NotNull VtlParser.AggregateClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#dimensionTypeClause}.
	 * @param ctx the parse tree
	 */
	void enterDimensionTypeClause(@NotNull VtlParser.DimensionTypeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dimensionTypeClause}.
	 * @param ctx the parse tree
	 */
	void exitDimensionTypeClause(@NotNull VtlParser.DimensionTypeClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#numberClause}.
	 * @param ctx the parse tree
	 */
	void enterNumberClause(@NotNull VtlParser.NumberClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#numberClause}.
	 * @param ctx the parse tree
	 */
	void exitNumberClause(@NotNull VtlParser.NumberClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#exprCountAtom}.
	 * @param ctx the parse tree
	 */
	void enterExprCountAtom(@NotNull VtlParser.ExprCountAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprCountAtom}.
	 * @param ctx the parse tree
	 */
	void exitExprCountAtom(@NotNull VtlParser.ExprCountAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#evalExpr}.
	 * @param ctx the parse tree
	 */
	void enterEvalExpr(@NotNull VtlParser.EvalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#evalExpr}.
	 * @param ctx the parse tree
	 */
	void exitEvalExpr(@NotNull VtlParser.EvalExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#setExpr}.
	 * @param ctx the parse tree
	 */
	void enterSetExpr(@NotNull VtlParser.SetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#setExpr}.
	 * @param ctx the parse tree
	 */
	void exitSetExpr(@NotNull VtlParser.SetExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#integerC}.
	 * @param ctx the parse tree
	 */
	void enterIntegerC(@NotNull VtlParser.IntegerCContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#integerC}.
	 * @param ctx the parse tree
	 */
	void exitIntegerC(@NotNull VtlParser.IntegerCContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#defFunction}.
	 * @param ctx the parse tree
	 */
	void enterDefFunction(@NotNull VtlParser.DefFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defFunction}.
	 * @param ctx the parse tree
	 */
	void exitDefFunction(@NotNull VtlParser.DefFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#putExpr}.
	 * @param ctx the parse tree
	 */
	void enterPutExpr(@NotNull VtlParser.PutExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#putExpr}.
	 * @param ctx the parse tree
	 */
	void exitPutExpr(@NotNull VtlParser.PutExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#rulesetArg}.
	 * @param ctx the parse tree
	 */
	void enterRulesetArg(@NotNull VtlParser.RulesetArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#rulesetArg}.
	 * @param ctx the parse tree
	 */
	void exitRulesetArg(@NotNull VtlParser.RulesetArgContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#defProcedure}.
	 * @param ctx the parse tree
	 */
	void enterDefProcedure(@NotNull VtlParser.DefProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defProcedure}.
	 * @param ctx the parse tree
	 */
	void exitDefProcedure(@NotNull VtlParser.DefProcedureContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#procedureArg}.
	 * @param ctx the parse tree
	 */
	void enterProcedureArg(@NotNull VtlParser.ProcedureArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#procedureArg}.
	 * @param ctx the parse tree
	 */
	void exitProcedureArg(@NotNull VtlParser.ProcedureArgContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#validationExpr}.
	 * @param ctx the parse tree
	 */
	void enterValidationExpr(@NotNull VtlParser.ValidationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#validationExpr}.
	 * @param ctx the parse tree
	 */
	void exitValidationExpr(@NotNull VtlParser.ValidationExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#ifThenElseExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseExpr(@NotNull VtlParser.IfThenElseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ifThenElseExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseExpr(@NotNull VtlParser.IfThenElseExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#trimAtom}.
	 * @param ctx the parse tree
	 */
	void enterTrimAtom(@NotNull VtlParser.TrimAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#trimAtom}.
	 * @param ctx the parse tree
	 */
	void exitTrimAtom(@NotNull VtlParser.TrimAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#inAtom}.
	 * @param ctx the parse tree
	 */
	void enterInAtom(@NotNull VtlParser.InAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#inAtom}.
	 * @param ctx the parse tree
	 */
	void exitInAtom(@NotNull VtlParser.InAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#ruleClauseMapping}.
	 * @param ctx the parse tree
	 */
	void enterRuleClauseMapping(@NotNull VtlParser.RuleClauseMappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ruleClauseMapping}.
	 * @param ctx the parse tree
	 */
	void exitRuleClauseMapping(@NotNull VtlParser.RuleClauseMappingContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#dateClause}.
	 * @param ctx the parse tree
	 */
	void enterDateClause(@NotNull VtlParser.DateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dateClause}.
	 * @param ctx the parse tree
	 */
	void exitDateClause(@NotNull VtlParser.DateClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#listsumAtom}.
	 * @param ctx the parse tree
	 */
	void enterListsumAtom(@NotNull VtlParser.ListsumAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#listsumAtom}.
	 * @param ctx the parse tree
	 */
	void exitListsumAtom(@NotNull VtlParser.ListsumAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#datasetAlias}.
	 * @param ctx the parse tree
	 */
	void enterDatasetAlias(@NotNull VtlParser.DatasetAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#datasetAlias}.
	 * @param ctx the parse tree
	 */
	void exitDatasetAlias(@NotNull VtlParser.DatasetAliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#nvlAtom}.
	 * @param ctx the parse tree
	 */
	void enterNvlAtom(@NotNull VtlParser.NvlAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#nvlAtom}.
	 * @param ctx the parse tree
	 */
	void exitNvlAtom(@NotNull VtlParser.NvlAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#rtrimAtom}.
	 * @param ctx the parse tree
	 */
	void enterRtrimAtom(@NotNull VtlParser.RtrimAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#rtrimAtom}.
	 * @param ctx the parse tree
	 */
	void exitRtrimAtom(@NotNull VtlParser.RtrimAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#varIdRef}.
	 * @param ctx the parse tree
	 */
	void enterVarIdRef(@NotNull VtlParser.VarIdRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#varIdRef}.
	 * @param ctx the parse tree
	 */
	void exitVarIdRef(@NotNull VtlParser.VarIdRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#defVariable}.
	 * @param ctx the parse tree
	 */
	void enterDefVariable(@NotNull VtlParser.DefVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defVariable}.
	 * @param ctx the parse tree
	 */
	void exitDefVariable(@NotNull VtlParser.DefVariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#floatC}.
	 * @param ctx the parse tree
	 */
	void enterFloatC(@NotNull VtlParser.FloatCContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#floatC}.
	 * @param ctx the parse tree
	 */
	void exitFloatC(@NotNull VtlParser.FloatCContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#inBetweenClause}.
	 * @param ctx the parse tree
	 */
	void enterInBetweenClause(@NotNull VtlParser.InBetweenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#inBetweenClause}.
	 * @param ctx the parse tree
	 */
	void exitInBetweenClause(@NotNull VtlParser.InBetweenClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#exprCompBetween}.
	 * @param ctx the parse tree
	 */
	void enterExprCompBetween(@NotNull VtlParser.ExprCompBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprCompBetween}.
	 * @param ctx the parse tree
	 */
	void exitExprCompBetween(@NotNull VtlParser.ExprCompBetweenContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#valueDomainList}.
	 * @param ctx the parse tree
	 */
	void enterValueDomainList(@NotNull VtlParser.ValueDomainListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#valueDomainList}.
	 * @param ctx the parse tree
	 */
	void exitValueDomainList(@NotNull VtlParser.ValueDomainListContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#exprIfExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprIfExpr(@NotNull VtlParser.ExprIfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprIfExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprIfExpr(@NotNull VtlParser.ExprIfExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#validationExprContent}.
	 * @param ctx the parse tree
	 */
	void enterValidationExprContent(@NotNull VtlParser.ValidationExprContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#validationExprContent}.
	 * @param ctx the parse tree
	 */
	void exitValidationExprContent(@NotNull VtlParser.ValidationExprContentContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#erLevel}.
	 * @param ctx the parse tree
	 */
	void enterErLevel(@NotNull VtlParser.ErLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#erLevel}.
	 * @param ctx the parse tree
	 */
	void exitErLevel(@NotNull VtlParser.ErLevelContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#defDataStructure}.
	 * @param ctx the parse tree
	 */
	void enterDefDataStructure(@NotNull VtlParser.DefDataStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defDataStructure}.
	 * @param ctx the parse tree
	 */
	void exitDefDataStructure(@NotNull VtlParser.DefDataStructureContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#charLengthAtom}.
	 * @param ctx the parse tree
	 */
	void enterCharLengthAtom(@NotNull VtlParser.CharLengthAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#charLengthAtom}.
	 * @param ctx the parse tree
	 */
	void exitCharLengthAtom(@NotNull VtlParser.CharLengthAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#procedureBody}.
	 * @param ctx the parse tree
	 */
	void enterProcedureBody(@NotNull VtlParser.ProcedureBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#procedureBody}.
	 * @param ctx the parse tree
	 */
	void exitProcedureBody(@NotNull VtlParser.ProcedureBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#returnAgg}.
	 * @param ctx the parse tree
	 */
	void enterReturnAgg(@NotNull VtlParser.ReturnAggContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#returnAgg}.
	 * @param ctx the parse tree
	 */
	void exitReturnAgg(@NotNull VtlParser.ReturnAggContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#validationValueDoman}.
	 * @param ctx the parse tree
	 */
	void enterValidationValueDoman(@NotNull VtlParser.ValidationValueDomanContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#validationValueDoman}.
	 * @param ctx the parse tree
	 */
	void exitValidationValueDoman(@NotNull VtlParser.ValidationValueDomanContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#dataStructureClause}.
	 * @param ctx the parse tree
	 */
	void enterDataStructureClause(@NotNull VtlParser.DataStructureClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dataStructureClause}.
	 * @param ctx the parse tree
	 */
	void exitDataStructureClause(@NotNull VtlParser.DataStructureClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#defineMapping}.
	 * @param ctx the parse tree
	 */
	void enterDefineMapping(@NotNull VtlParser.DefineMappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defineMapping}.
	 * @param ctx the parse tree
	 */
	void exitDefineMapping(@NotNull VtlParser.DefineMappingContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#hierRuleSignature}.
	 * @param ctx the parse tree
	 */
	void enterHierRuleSignature(@NotNull VtlParser.HierRuleSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#hierRuleSignature}.
	 * @param ctx the parse tree
	 */
	void exitHierRuleSignature(@NotNull VtlParser.HierRuleSignatureContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#defHierarchical}.
	 * @param ctx the parse tree
	 */
	void enterDefHierarchical(@NotNull VtlParser.DefHierarchicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defHierarchical}.
	 * @param ctx the parse tree
	 */
	void exitDefHierarchical(@NotNull VtlParser.DefHierarchicalContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#codeListClause}.
	 * @param ctx the parse tree
	 */
	void enterCodeListClause(@NotNull VtlParser.CodeListClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#codeListClause}.
	 * @param ctx the parse tree
	 */
	void exitCodeListClause(@NotNull VtlParser.CodeListClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#transcodeExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterTranscodeExprAtom(@NotNull VtlParser.TranscodeExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#transcodeExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitTranscodeExprAtom(@NotNull VtlParser.TranscodeExprAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#getExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterGetExprAtom(@NotNull VtlParser.GetExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#getExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitGetExprAtom(@NotNull VtlParser.GetExprAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(@NotNull VtlParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(@NotNull VtlParser.ArgListContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#antecedentItem}.
	 * @param ctx the parse tree
	 */
	void enterAntecedentItem(@NotNull VtlParser.AntecedentItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#antecedentItem}.
	 * @param ctx the parse tree
	 */
	void exitAntecedentItem(@NotNull VtlParser.AntecedentItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#transcodeExpr}.
	 * @param ctx the parse tree
	 */
	void enterTranscodeExpr(@NotNull VtlParser.TranscodeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#transcodeExpr}.
	 * @param ctx the parse tree
	 */
	void exitTranscodeExpr(@NotNull VtlParser.TranscodeExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#exprOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprOrExpr(@NotNull VtlParser.ExprOrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprOrExpr(@NotNull VtlParser.ExprOrExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull VtlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull VtlParser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#stringC}.
	 * @param ctx the parse tree
	 */
	void enterStringC(@NotNull VtlParser.StringCContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#stringC}.
	 * @param ctx the parse tree
	 */
	void exitStringC(@NotNull VtlParser.StringCContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#defMapping}.
	 * @param ctx the parse tree
	 */
	void enterDefMapping(@NotNull VtlParser.DefMappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defMapping}.
	 * @param ctx the parse tree
	 */
	void exitDefMapping(@NotNull VtlParser.DefMappingContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#missingAtom}.
	 * @param ctx the parse tree
	 */
	void enterMissingAtom(@NotNull VtlParser.MissingAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#missingAtom}.
	 * @param ctx the parse tree
	 */
	void exitMissingAtom(@NotNull VtlParser.MissingAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#joinBody}.
	 * @param ctx the parse tree
	 */
	void enterJoinBody(@NotNull VtlParser.JoinBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinBody}.
	 * @param ctx the parse tree
	 */
	void exitJoinBody(@NotNull VtlParser.JoinBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#conditionClause}.
	 * @param ctx the parse tree
	 */
	void enterConditionClause(@NotNull VtlParser.ConditionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#conditionClause}.
	 * @param ctx the parse tree
	 */
	void exitConditionClause(@NotNull VtlParser.ConditionClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#lnAtom}.
	 * @param ctx the parse tree
	 */
	void enterLnAtom(@NotNull VtlParser.LnAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#lnAtom}.
	 * @param ctx the parse tree
	 */
	void exitLnAtom(@NotNull VtlParser.LnAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#uniqueAtom}.
	 * @param ctx the parse tree
	 */
	void enterUniqueAtom(@NotNull VtlParser.UniqueAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#uniqueAtom}.
	 * @param ctx the parse tree
	 */
	void exitUniqueAtom(@NotNull VtlParser.UniqueAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#procedureID}.
	 * @param ctx the parse tree
	 */
	void enterProcedureID(@NotNull VtlParser.ProcedureIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#procedureID}.
	 * @param ctx the parse tree
	 */
	void exitProcedureID(@NotNull VtlParser.ProcedureIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#aggrClause}.
	 * @param ctx the parse tree
	 */
	void enterAggrClause(@NotNull VtlParser.AggrClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#aggrClause}.
	 * @param ctx the parse tree
	 */
	void exitAggrClause(@NotNull VtlParser.AggrClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#exprOr}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(@NotNull VtlParser.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprOr}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(@NotNull VtlParser.ExprOrContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#setMember}.
	 * @param ctx the parse tree
	 */
	void enterSetMember(@NotNull VtlParser.SetMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#setMember}.
	 * @param ctx the parse tree
	 */
	void exitSetMember(@NotNull VtlParser.SetMemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#exprAdd}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(@NotNull VtlParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprAdd}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(@NotNull VtlParser.ExprAddContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#endDatapointRuleset}.
	 * @param ctx the parse tree
	 */
	void enterEndDatapointRuleset(@NotNull VtlParser.EndDatapointRulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#endDatapointRuleset}.
	 * @param ctx the parse tree
	 */
	void exitEndDatapointRuleset(@NotNull VtlParser.EndDatapointRulesetContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#setMembers}.
	 * @param ctx the parse tree
	 */
	void enterSetMembers(@NotNull VtlParser.SetMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#setMembers}.
	 * @param ctx the parse tree
	 */
	void exitSetMembers(@NotNull VtlParser.SetMembersContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#date_from_stringAtom}.
	 * @param ctx the parse tree
	 */
	void enterDate_from_stringAtom(@NotNull VtlParser.Date_from_stringAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#date_from_stringAtom}.
	 * @param ctx the parse tree
	 */
	void exitDate_from_stringAtom(@NotNull VtlParser.Date_from_stringAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#currentDateAtom}.
	 * @param ctx the parse tree
	 */
	void enterCurrentDateAtom(@NotNull VtlParser.CurrentDateAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#currentDateAtom}.
	 * @param ctx the parse tree
	 */
	void exitCurrentDateAtom(@NotNull VtlParser.CurrentDateAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#valueDomainID}.
	 * @param ctx the parse tree
	 */
	void enterValueDomainID(@NotNull VtlParser.ValueDomainIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#valueDomainID}.
	 * @param ctx the parse tree
	 */
	void exitValueDomainID(@NotNull VtlParser.ValueDomainIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#exponent}.
	 * @param ctx the parse tree
	 */
	void enterExponent(@NotNull VtlParser.ExponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exponent}.
	 * @param ctx the parse tree
	 */
	void exitExponent(@NotNull VtlParser.ExponentContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#powerAtom}.
	 * @param ctx the parse tree
	 */
	void enterPowerAtom(@NotNull VtlParser.PowerAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#powerAtom}.
	 * @param ctx the parse tree
	 */
	void exitPowerAtom(@NotNull VtlParser.PowerAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#minAtom}.
	 * @param ctx the parse tree
	 */
	void enterMinAtom(@NotNull VtlParser.MinAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#minAtom}.
	 * @param ctx the parse tree
	 */
	void exitMinAtom(@NotNull VtlParser.MinAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#string_from_dateAtom}.
	 * @param ctx the parse tree
	 */
	void enterString_from_dateAtom(@NotNull VtlParser.String_from_dateAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#string_from_dateAtom}.
	 * @param ctx the parse tree
	 */
	void exitString_from_dateAtom(@NotNull VtlParser.String_from_dateAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#setMemberListAlias}.
	 * @param ctx the parse tree
	 */
	void enterSetMemberListAlias(@NotNull VtlParser.SetMemberListAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#setMemberListAlias}.
	 * @param ctx the parse tree
	 */
	void exitSetMemberListAlias(@NotNull VtlParser.SetMemberListAliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCall(@NotNull VtlParser.ProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCall(@NotNull VtlParser.ProcedureCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#procedureArgList}.
	 * @param ctx the parse tree
	 */
	void enterProcedureArgList(@NotNull VtlParser.ProcedureArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#procedureArgList}.
	 * @param ctx the parse tree
	 */
	void exitProcedureArgList(@NotNull VtlParser.ProcedureArgListContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#renameArgList}.
	 * @param ctx the parse tree
	 */
	void enterRenameArgList(@NotNull VtlParser.RenameArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#renameArgList}.
	 * @param ctx the parse tree
	 */
	void exitRenameArgList(@NotNull VtlParser.RenameArgListContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#constantRef}.
	 * @param ctx the parse tree
	 */
	void enterConstantRef(@NotNull VtlParser.ConstantRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#constantRef}.
	 * @param ctx the parse tree
	 */
	void exitConstantRef(@NotNull VtlParser.ConstantRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#codelistMatchAtom}.
	 * @param ctx the parse tree
	 */
	void enterCodelistMatchAtom(@NotNull VtlParser.CodelistMatchAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#codelistMatchAtom}.
	 * @param ctx the parse tree
	 */
	void exitCodelistMatchAtom(@NotNull VtlParser.CodelistMatchAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#replaceAtom}.
	 * @param ctx the parse tree
	 */
	void enterReplaceAtom(@NotNull VtlParser.ReplaceAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#replaceAtom}.
	 * @param ctx the parse tree
	 */
	void exitReplaceAtom(@NotNull VtlParser.ReplaceAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#anFunctionClause}.
	 * @param ctx the parse tree
	 */
	void enterAnFunctionClause(@NotNull VtlParser.AnFunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#anFunctionClause}.
	 * @param ctx the parse tree
	 */
	void exitAnFunctionClause(@NotNull VtlParser.AnFunctionClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#endMappingRuleset}.
	 * @param ctx the parse tree
	 */
	void enterEndMappingRuleset(@NotNull VtlParser.EndMappingRulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#endMappingRuleset}.
	 * @param ctx the parse tree
	 */
	void exitEndMappingRuleset(@NotNull VtlParser.EndMappingRulesetContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#dropClause}.
	 * @param ctx the parse tree
	 */
	void enterDropClause(@NotNull VtlParser.DropClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dropClause}.
	 * @param ctx the parse tree
	 */
	void exitDropClause(@NotNull VtlParser.DropClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#subscriptExpr}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptExpr(@NotNull VtlParser.SubscriptExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#subscriptExpr}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptExpr(@NotNull VtlParser.SubscriptExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#hierarchyInputParameters}.
	 * @param ctx the parse tree
	 */
	void enterHierarchyInputParameters(@NotNull VtlParser.HierarchyInputParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#hierarchyInputParameters}.
	 * @param ctx the parse tree
	 */
	void exitHierarchyInputParameters(@NotNull VtlParser.HierarchyInputParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull VtlParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull VtlParser.StatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#isNullAtom}.
	 * @param ctx the parse tree
	 */
	void enterIsNullAtom(@NotNull VtlParser.IsNullAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#isNullAtom}.
	 * @param ctx the parse tree
	 */
	void exitIsNullAtom(@NotNull VtlParser.IsNullAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#listRef}.
	 * @param ctx the parse tree
	 */
	void enterListRef(@NotNull VtlParser.ListRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#listRef}.
	 * @param ctx the parse tree
	 */
	void exitListRef(@NotNull VtlParser.ListRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#restrictClause}.
	 * @param ctx the parse tree
	 */
	void enterRestrictClause(@NotNull VtlParser.RestrictClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#restrictClause}.
	 * @param ctx the parse tree
	 */
	void exitRestrictClause(@NotNull VtlParser.RestrictClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#getFiltersClause}.
	 * @param ctx the parse tree
	 */
	void enterGetFiltersClause(@NotNull VtlParser.GetFiltersClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#getFiltersClause}.
	 * @param ctx the parse tree
	 */
	void exitGetFiltersClause(@NotNull VtlParser.GetFiltersClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#exprMember}.
	 * @param ctx the parse tree
	 */
	void enterExprMember(@NotNull VtlParser.ExprMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprMember}.
	 * @param ctx the parse tree
	 */
	void exitExprMember(@NotNull VtlParser.ExprMemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#ceilAtom}.
	 * @param ctx the parse tree
	 */
	void enterCeilAtom(@NotNull VtlParser.CeilAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ceilAtom}.
	 * @param ctx the parse tree
	 */
	void exitCeilAtom(@NotNull VtlParser.CeilAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#dropClauseItem}.
	 * @param ctx the parse tree
	 */
	void enterDropClauseItem(@NotNull VtlParser.DropClauseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dropClauseItem}.
	 * @param ctx the parse tree
	 */
	void exitDropClauseItem(@NotNull VtlParser.DropClauseItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#notInAtom}.
	 * @param ctx the parse tree
	 */
	void enterNotInAtom(@NotNull VtlParser.NotInAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#notInAtom}.
	 * @param ctx the parse tree
	 */
	void exitNotInAtom(@NotNull VtlParser.NotInAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#nullC}.
	 * @param ctx the parse tree
	 */
	void enterNullC(@NotNull VtlParser.NullCContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#nullC}.
	 * @param ctx the parse tree
	 */
	void exitNullC(@NotNull VtlParser.NullCContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#ruleClauseDatapoint}.
	 * @param ctx the parse tree
	 */
	void enterRuleClauseDatapoint(@NotNull VtlParser.RuleClauseDatapointContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ruleClauseDatapoint}.
	 * @param ctx the parse tree
	 */
	void exitRuleClauseDatapoint(@NotNull VtlParser.RuleClauseDatapointContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#dataTypeRestrictionClause}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeRestrictionClause(@NotNull VtlParser.DataTypeRestrictionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dataTypeRestrictionClause}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeRestrictionClause(@NotNull VtlParser.DataTypeRestrictionClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#windowingClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowingClause(@NotNull VtlParser.WindowingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#windowingClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowingClause(@NotNull VtlParser.WindowingClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#ruleItemHierarchical}.
	 * @param ctx the parse tree
	 */
	void enterRuleItemHierarchical(@NotNull VtlParser.RuleItemHierarchicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#ruleItemHierarchical}.
	 * @param ctx the parse tree
	 */
	void exitRuleItemHierarchical(@NotNull VtlParser.RuleItemHierarchicalContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#rulesetID}.
	 * @param ctx the parse tree
	 */
	void enterRulesetID(@NotNull VtlParser.RulesetIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#rulesetID}.
	 * @param ctx the parse tree
	 */
	void exitRulesetID(@NotNull VtlParser.RulesetIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#exprComp}.
	 * @param ctx the parse tree
	 */
	void enterExprComp(@NotNull VtlParser.ExprCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprComp}.
	 * @param ctx the parse tree
	 */
	void exitExprComp(@NotNull VtlParser.ExprCompContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#keepClause}.
	 * @param ctx the parse tree
	 */
	void enterKeepClause(@NotNull VtlParser.KeepClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#keepClause}.
	 * @param ctx the parse tree
	 */
	void exitKeepClause(@NotNull VtlParser.KeepClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#componentID}.
	 * @param ctx the parse tree
	 */
	void enterComponentID(@NotNull VtlParser.ComponentIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#componentID}.
	 * @param ctx the parse tree
	 */
	void exitComponentID(@NotNull VtlParser.ComponentIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#transcodeInputParameters}.
	 * @param ctx the parse tree
	 */
	void enterTranscodeInputParameters(@NotNull VtlParser.TranscodeInputParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#transcodeInputParameters}.
	 * @param ctx the parse tree
	 */
	void exitTranscodeInputParameters(@NotNull VtlParser.TranscodeInputParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#codeItemRelationSignature}.
	 * @param ctx the parse tree
	 */
	void enterCodeItemRelationSignature(@NotNull VtlParser.CodeItemRelationSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#codeItemRelationSignature}.
	 * @param ctx the parse tree
	 */
	void exitCodeItemRelationSignature(@NotNull VtlParser.CodeItemRelationSignatureContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#codeItemRef}.
	 * @param ctx the parse tree
	 */
	void enterCodeItemRef(@NotNull VtlParser.CodeItemRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#codeItemRef}.
	 * @param ctx the parse tree
	 */
	void exitCodeItemRef(@NotNull VtlParser.CodeItemRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#defValueDomain}.
	 * @param ctx the parse tree
	 */
	void enterDefValueDomain(@NotNull VtlParser.DefValueDomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#defValueDomain}.
	 * @param ctx the parse tree
	 */
	void exitDefValueDomain(@NotNull VtlParser.DefValueDomainContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#dedupList}.
	 * @param ctx the parse tree
	 */
	void enterDedupList(@NotNull VtlParser.DedupListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#dedupList}.
	 * @param ctx the parse tree
	 */
	void exitDedupList(@NotNull VtlParser.DedupListContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#stringClause}.
	 * @param ctx the parse tree
	 */
	void enterStringClause(@NotNull VtlParser.StringClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#stringClause}.
	 * @param ctx the parse tree
	 */
	void exitStringClause(@NotNull VtlParser.StringClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(@NotNull VtlParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(@NotNull VtlParser.JoinClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#rulesetArgList}.
	 * @param ctx the parse tree
	 */
	void enterRulesetArgList(@NotNull VtlParser.RulesetArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#rulesetArgList}.
	 * @param ctx the parse tree
	 */
	void exitRulesetArgList(@NotNull VtlParser.RulesetArgListContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#extractAtom}.
	 * @param ctx the parse tree
	 */
	void enterExtractAtom(@NotNull VtlParser.ExtractAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#extractAtom}.
	 * @param ctx the parse tree
	 */
	void exitExtractAtom(@NotNull VtlParser.ExtractAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#func_depAtom}.
	 * @param ctx the parse tree
	 */
	void enterFunc_depAtom(@NotNull VtlParser.Func_depAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#func_depAtom}.
	 * @param ctx the parse tree
	 */
	void exitFunc_depAtom(@NotNull VtlParser.Func_depAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#joinAtom}.
	 * @param ctx the parse tree
	 */
	void enterJoinAtom(@NotNull VtlParser.JoinAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#joinAtom}.
	 * @param ctx the parse tree
	 */
	void exitJoinAtom(@NotNull VtlParser.JoinAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#evalExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterEvalExprAtom(@NotNull VtlParser.EvalExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#evalExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitEvalExprAtom(@NotNull VtlParser.EvalExprAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#codeItemRelationClause}.
	 * @param ctx the parse tree
	 */
	void enterCodeItemRelationClause(@NotNull VtlParser.CodeItemRelationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#codeItemRelationClause}.
	 * @param ctx the parse tree
	 */
	void exitCodeItemRelationClause(@NotNull VtlParser.CodeItemRelationClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#putInputParameters}.
	 * @param ctx the parse tree
	 */
	void enterPutInputParameters(@NotNull VtlParser.PutInputParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#putInputParameters}.
	 * @param ctx the parse tree
	 */
	void exitPutInputParameters(@NotNull VtlParser.PutInputParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#datasetList}.
	 * @param ctx the parse tree
	 */
	void enterDatasetList(@NotNull VtlParser.DatasetListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#datasetList}.
	 * @param ctx the parse tree
	 */
	void exitDatasetList(@NotNull VtlParser.DatasetListContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#exprExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterExprExprAtom(@NotNull VtlParser.ExprExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#exprExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitExprExprAtom(@NotNull VtlParser.ExprExprAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link VtlParser#varSignature}.
	 * @param ctx the parse tree
	 */
	void enterVarSignature(@NotNull VtlParser.VarSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link VtlParser#varSignature}.
	 * @param ctx the parse tree
	 */
	void exitVarSignature(@NotNull VtlParser.VarSignatureContext ctx);
}