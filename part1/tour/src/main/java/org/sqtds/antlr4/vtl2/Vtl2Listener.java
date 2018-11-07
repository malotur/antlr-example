// Generated from org\sqtds\antlr4\vtl2\Vtl2.g4 by ANTLR 4.2.2
package org.sqtds.antlr4.vtl2;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Vtl2Parser}.
 */
public interface Vtl2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#parameterItem}.
	 * @param ctx the parse tree
	 */
	void enterParameterItem(@NotNull Vtl2Parser.ParameterItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#parameterItem}.
	 * @param ctx the parse tree
	 */
	void exitParameterItem(@NotNull Vtl2Parser.ParameterItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#joinRenameClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinRenameClause(@NotNull Vtl2Parser.JoinRenameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#joinRenameClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinRenameClause(@NotNull Vtl2Parser.JoinRenameClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#definitionExpressions}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionExpressions(@NotNull Vtl2Parser.DefinitionExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#definitionExpressions}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionExpressions(@NotNull Vtl2Parser.DefinitionExpressionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#calcClauseItem}.
	 * @param ctx the parse tree
	 */
	void enterCalcClauseItem(@NotNull Vtl2Parser.CalcClauseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#calcClauseItem}.
	 * @param ctx the parse tree
	 */
	void exitCalcClauseItem(@NotNull Vtl2Parser.CalcClauseItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(@NotNull Vtl2Parser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(@NotNull Vtl2Parser.CallFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#timeShiftExpr}.
	 * @param ctx the parse tree
	 */
	void enterTimeShiftExpr(@NotNull Vtl2Parser.TimeShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#timeShiftExpr}.
	 * @param ctx the parse tree
	 */
	void exitTimeShiftExpr(@NotNull Vtl2Parser.TimeShiftExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#aggrFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggrFunction(@NotNull Vtl2Parser.AggrFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#aggrFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggrFunction(@NotNull Vtl2Parser.AggrFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#pivotExpr}.
	 * @param ctx the parse tree
	 */
	void enterPivotExpr(@NotNull Vtl2Parser.PivotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#pivotExpr}.
	 * @param ctx the parse tree
	 */
	void exitPivotExpr(@NotNull Vtl2Parser.PivotExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#persistentAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPersistentAssignment(@NotNull Vtl2Parser.PersistentAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#persistentAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPersistentAssignment(@NotNull Vtl2Parser.PersistentAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#defineFunction}.
	 * @param ctx the parse tree
	 */
	void enterDefineFunction(@NotNull Vtl2Parser.DefineFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#defineFunction}.
	 * @param ctx the parse tree
	 */
	void exitDefineFunction(@NotNull Vtl2Parser.DefineFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#lcaseAtom}.
	 * @param ctx the parse tree
	 */
	void enterLcaseAtom(@NotNull Vtl2Parser.LcaseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#lcaseAtom}.
	 * @param ctx the parse tree
	 */
	void exitLcaseAtom(@NotNull Vtl2Parser.LcaseAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#refAtom}.
	 * @param ctx the parse tree
	 */
	void enterRefAtom(@NotNull Vtl2Parser.RefAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#refAtom}.
	 * @param ctx the parse tree
	 */
	void exitRefAtom(@NotNull Vtl2Parser.RefAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#parenthesisExprRef}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExprRef(@NotNull Vtl2Parser.ParenthesisExprRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#parenthesisExprRef}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExprRef(@NotNull Vtl2Parser.ParenthesisExprRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#validationDatapoint}.
	 * @param ctx the parse tree
	 */
	void enterValidationDatapoint(@NotNull Vtl2Parser.ValidationDatapointContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#validationDatapoint}.
	 * @param ctx the parse tree
	 */
	void exitValidationDatapoint(@NotNull Vtl2Parser.ValidationDatapointContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(@NotNull Vtl2Parser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(@NotNull Vtl2Parser.OrderByClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#datasetType}.
	 * @param ctx the parse tree
	 */
	void enterDatasetType(@NotNull Vtl2Parser.DatasetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#datasetType}.
	 * @param ctx the parse tree
	 */
	void exitDatasetType(@NotNull Vtl2Parser.DatasetTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#outputParameterType}.
	 * @param ctx the parse tree
	 */
	void enterOutputParameterType(@NotNull Vtl2Parser.OutputParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#outputParameterType}.
	 * @param ctx the parse tree
	 */
	void exitOutputParameterType(@NotNull Vtl2Parser.OutputParameterTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#defineDatapointRuleset}.
	 * @param ctx the parse tree
	 */
	void enterDefineDatapointRuleset(@NotNull Vtl2Parser.DefineDatapointRulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#defineDatapointRuleset}.
	 * @param ctx the parse tree
	 */
	void exitDefineDatapointRuleset(@NotNull Vtl2Parser.DefineDatapointRulesetContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#ruleClauseHierarchical}.
	 * @param ctx the parse tree
	 */
	void enterRuleClauseHierarchical(@NotNull Vtl2Parser.RuleClauseHierarchicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#ruleClauseHierarchical}.
	 * @param ctx the parse tree
	 */
	void exitRuleClauseHierarchical(@NotNull Vtl2Parser.RuleClauseHierarchicalContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(@NotNull Vtl2Parser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(@NotNull Vtl2Parser.IdentifierListContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#exprValidationExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprValidationExpr(@NotNull Vtl2Parser.ExprValidationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#exprValidationExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprValidationExpr(@NotNull Vtl2Parser.ExprValidationExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#getFilterClause}.
	 * @param ctx the parse tree
	 */
	void enterGetFilterClause(@NotNull Vtl2Parser.GetFilterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#getFilterClause}.
	 * @param ctx the parse tree
	 */
	void exitGetFilterClause(@NotNull Vtl2Parser.GetFilterClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#varID}.
	 * @param ctx the parse tree
	 */
	void enterVarID(@NotNull Vtl2Parser.VarIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#varID}.
	 * @param ctx the parse tree
	 */
	void exitVarID(@NotNull Vtl2Parser.VarIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#rulesetType}.
	 * @param ctx the parse tree
	 */
	void enterRulesetType(@NotNull Vtl2Parser.RulesetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#rulesetType}.
	 * @param ctx the parse tree
	 */
	void exitRulesetType(@NotNull Vtl2Parser.RulesetTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#componentType2}.
	 * @param ctx the parse tree
	 */
	void enterComponentType2(@NotNull Vtl2Parser.ComponentType2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#componentType2}.
	 * @param ctx the parse tree
	 */
	void exitComponentType2(@NotNull Vtl2Parser.ComponentType2Context ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#prodVariables}.
	 * @param ctx the parse tree
	 */
	void enterProdVariables(@NotNull Vtl2Parser.ProdVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#prodVariables}.
	 * @param ctx the parse tree
	 */
	void exitProdVariables(@NotNull Vtl2Parser.ProdVariablesContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#validationHierarchical}.
	 * @param ctx the parse tree
	 */
	void enterValidationHierarchical(@NotNull Vtl2Parser.ValidationHierarchicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#validationHierarchical}.
	 * @param ctx the parse tree
	 */
	void exitValidationHierarchical(@NotNull Vtl2Parser.ValidationHierarchicalContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#aggregateClause}.
	 * @param ctx the parse tree
	 */
	void enterAggregateClause(@NotNull Vtl2Parser.AggregateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#aggregateClause}.
	 * @param ctx the parse tree
	 */
	void exitAggregateClause(@NotNull Vtl2Parser.AggregateClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#defDatapoint}.
	 * @param ctx the parse tree
	 */
	void enterDefDatapoint(@NotNull Vtl2Parser.DefDatapointContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#defDatapoint}.
	 * @param ctx the parse tree
	 */
	void exitDefDatapoint(@NotNull Vtl2Parser.DefDatapointContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#castExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterCastExprAtom(@NotNull Vtl2Parser.CastExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#castExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitCastExprAtom(@NotNull Vtl2Parser.CastExprAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#evalExpr}.
	 * @param ctx the parse tree
	 */
	void enterEvalExpr(@NotNull Vtl2Parser.EvalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#evalExpr}.
	 * @param ctx the parse tree
	 */
	void exitEvalExpr(@NotNull Vtl2Parser.EvalExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#setExpr}.
	 * @param ctx the parse tree
	 */
	void enterSetExpr(@NotNull Vtl2Parser.SetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#setExpr}.
	 * @param ctx the parse tree
	 */
	void exitSetExpr(@NotNull Vtl2Parser.SetExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#sqrtAtom}.
	 * @param ctx the parse tree
	 */
	void enterSqrtAtom(@NotNull Vtl2Parser.SqrtAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#sqrtAtom}.
	 * @param ctx the parse tree
	 */
	void exitSqrtAtom(@NotNull Vtl2Parser.SqrtAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#anFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnFunction(@NotNull Vtl2Parser.AnFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#anFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnFunction(@NotNull Vtl2Parser.AnFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#setName}.
	 * @param ctx the parse tree
	 */
	void enterSetName(@NotNull Vtl2Parser.SetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#setName}.
	 * @param ctx the parse tree
	 */
	void exitSetName(@NotNull Vtl2Parser.SetNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#defFunction}.
	 * @param ctx the parse tree
	 */
	void enterDefFunction(@NotNull Vtl2Parser.DefFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#defFunction}.
	 * @param ctx the parse tree
	 */
	void exitDefFunction(@NotNull Vtl2Parser.DefFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#defProcedure}.
	 * @param ctx the parse tree
	 */
	void enterDefProcedure(@NotNull Vtl2Parser.DefProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#defProcedure}.
	 * @param ctx the parse tree
	 */
	void exitDefProcedure(@NotNull Vtl2Parser.DefProcedureContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#procedureArg}.
	 * @param ctx the parse tree
	 */
	void enterProcedureArg(@NotNull Vtl2Parser.ProcedureArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#procedureArg}.
	 * @param ctx the parse tree
	 */
	void exitProcedureArg(@NotNull Vtl2Parser.ProcedureArgContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#validationExpr}.
	 * @param ctx the parse tree
	 */
	void enterValidationExpr(@NotNull Vtl2Parser.ValidationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#validationExpr}.
	 * @param ctx the parse tree
	 */
	void exitValidationExpr(@NotNull Vtl2Parser.ValidationExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#timeExpr}.
	 * @param ctx the parse tree
	 */
	void enterTimeExpr(@NotNull Vtl2Parser.TimeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#timeExpr}.
	 * @param ctx the parse tree
	 */
	void exitTimeExpr(@NotNull Vtl2Parser.TimeExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#ltrimAtom}.
	 * @param ctx the parse tree
	 */
	void enterLtrimAtom(@NotNull Vtl2Parser.LtrimAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#ltrimAtom}.
	 * @param ctx the parse tree
	 */
	void exitLtrimAtom(@NotNull Vtl2Parser.LtrimAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#stockToFlowAtom}.
	 * @param ctx the parse tree
	 */
	void enterStockToFlowAtom(@NotNull Vtl2Parser.StockToFlowAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#stockToFlowAtom}.
	 * @param ctx the parse tree
	 */
	void exitStockToFlowAtom(@NotNull Vtl2Parser.StockToFlowAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#valueDomainName}.
	 * @param ctx the parse tree
	 */
	void enterValueDomainName(@NotNull Vtl2Parser.ValueDomainNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#valueDomainName}.
	 * @param ctx the parse tree
	 */
	void exitValueDomainName(@NotNull Vtl2Parser.ValueDomainNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#trimAtom}.
	 * @param ctx the parse tree
	 */
	void enterTrimAtom(@NotNull Vtl2Parser.TrimAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#trimAtom}.
	 * @param ctx the parse tree
	 */
	void exitTrimAtom(@NotNull Vtl2Parser.TrimAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#datasetClause}.
	 * @param ctx the parse tree
	 */
	void enterDatasetClause(@NotNull Vtl2Parser.DatasetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#datasetClause}.
	 * @param ctx the parse tree
	 */
	void exitDatasetClause(@NotNull Vtl2Parser.DatasetClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#rulesetSignature}.
	 * @param ctx the parse tree
	 */
	void enterRulesetSignature(@NotNull Vtl2Parser.RulesetSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#rulesetSignature}.
	 * @param ctx the parse tree
	 */
	void exitRulesetSignature(@NotNull Vtl2Parser.RulesetSignatureContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#nvlAtom}.
	 * @param ctx the parse tree
	 */
	void enterNvlAtom(@NotNull Vtl2Parser.NvlAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#nvlAtom}.
	 * @param ctx the parse tree
	 */
	void exitNvlAtom(@NotNull Vtl2Parser.NvlAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#hierarchyExpr}.
	 * @param ctx the parse tree
	 */
	void enterHierarchyExpr(@NotNull Vtl2Parser.HierarchyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#hierarchyExpr}.
	 * @param ctx the parse tree
	 */
	void exitHierarchyExpr(@NotNull Vtl2Parser.HierarchyExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#simpleaggregateFunctions}.
	 * @param ctx the parse tree
	 */
	void enterSimpleaggregateFunctions(@NotNull Vtl2Parser.SimpleaggregateFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#simpleaggregateFunctions}.
	 * @param ctx the parse tree
	 */
	void exitSimpleaggregateFunctions(@NotNull Vtl2Parser.SimpleaggregateFunctionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#defOperator}.
	 * @param ctx the parse tree
	 */
	void enterDefOperator(@NotNull Vtl2Parser.DefOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#defOperator}.
	 * @param ctx the parse tree
	 */
	void exitDefOperator(@NotNull Vtl2Parser.DefOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#rtrimAtom}.
	 * @param ctx the parse tree
	 */
	void enterRtrimAtom(@NotNull Vtl2Parser.RtrimAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#rtrimAtom}.
	 * @param ctx the parse tree
	 */
	void exitRtrimAtom(@NotNull Vtl2Parser.RtrimAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#joinKeepClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinKeepClause(@NotNull Vtl2Parser.JoinKeepClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#joinKeepClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinKeepClause(@NotNull Vtl2Parser.JoinKeepClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#varIdRef}.
	 * @param ctx the parse tree
	 */
	void enterVarIdRef(@NotNull Vtl2Parser.VarIdRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#varIdRef}.
	 * @param ctx the parse tree
	 */
	void exitVarIdRef(@NotNull Vtl2Parser.VarIdRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void enterJoinExpr(@NotNull Vtl2Parser.JoinExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void exitJoinExpr(@NotNull Vtl2Parser.JoinExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#timeexpressions}.
	 * @param ctx the parse tree
	 */
	void enterTimeexpressions(@NotNull Vtl2Parser.TimeexpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#timeexpressions}.
	 * @param ctx the parse tree
	 */
	void exitTimeexpressions(@NotNull Vtl2Parser.TimeexpressionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#inBetweenClause}.
	 * @param ctx the parse tree
	 */
	void enterInBetweenClause(@NotNull Vtl2Parser.InBetweenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#inBetweenClause}.
	 * @param ctx the parse tree
	 */
	void exitInBetweenClause(@NotNull Vtl2Parser.InBetweenClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#roundAtom}.
	 * @param ctx the parse tree
	 */
	void enterRoundAtom(@NotNull Vtl2Parser.RoundAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#roundAtom}.
	 * @param ctx the parse tree
	 */
	void exitRoundAtom(@NotNull Vtl2Parser.RoundAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#subspaceExpr}.
	 * @param ctx the parse tree
	 */
	void enterSubspaceExpr(@NotNull Vtl2Parser.SubspaceExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#subspaceExpr}.
	 * @param ctx the parse tree
	 */
	void exitSubspaceExpr(@NotNull Vtl2Parser.SubspaceExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#joinKeyword}.
	 * @param ctx the parse tree
	 */
	void enterJoinKeyword(@NotNull Vtl2Parser.JoinKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#joinKeyword}.
	 * @param ctx the parse tree
	 */
	void exitJoinKeyword(@NotNull Vtl2Parser.JoinKeywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(@NotNull Vtl2Parser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(@NotNull Vtl2Parser.ArgContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#componentExpressionwithAggrClause}.
	 * @param ctx the parse tree
	 */
	void enterComponentExpressionwithAggrClause(@NotNull Vtl2Parser.ComponentExpressionwithAggrClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#componentExpressionwithAggrClause}.
	 * @param ctx the parse tree
	 */
	void exitComponentExpressionwithAggrClause(@NotNull Vtl2Parser.ComponentExpressionwithAggrClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#limitClauseItem}.
	 * @param ctx the parse tree
	 */
	void enterLimitClauseItem(@NotNull Vtl2Parser.LimitClauseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#limitClauseItem}.
	 * @param ctx the parse tree
	 */
	void exitLimitClauseItem(@NotNull Vtl2Parser.LimitClauseItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#logBase}.
	 * @param ctx the parse tree
	 */
	void enterLogBase(@NotNull Vtl2Parser.LogBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#logBase}.
	 * @param ctx the parse tree
	 */
	void exitLogBase(@NotNull Vtl2Parser.LogBaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#componentType}.
	 * @param ctx the parse tree
	 */
	void enterComponentType(@NotNull Vtl2Parser.ComponentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#componentType}.
	 * @param ctx the parse tree
	 */
	void exitComponentType(@NotNull Vtl2Parser.ComponentTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#modAtom}.
	 * @param ctx the parse tree
	 */
	void enterModAtom(@NotNull Vtl2Parser.ModAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#modAtom}.
	 * @param ctx the parse tree
	 */
	void exitModAtom(@NotNull Vtl2Parser.ModAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(@NotNull Vtl2Parser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(@NotNull Vtl2Parser.HavingClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#scalarTypeConstraint}.
	 * @param ctx the parse tree
	 */
	void enterScalarTypeConstraint(@NotNull Vtl2Parser.ScalarTypeConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#scalarTypeConstraint}.
	 * @param ctx the parse tree
	 */
	void exitScalarTypeConstraint(@NotNull Vtl2Parser.ScalarTypeConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#filterClause}.
	 * @param ctx the parse tree
	 */
	void enterFilterClause(@NotNull Vtl2Parser.FilterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#filterClause}.
	 * @param ctx the parse tree
	 */
	void exitFilterClause(@NotNull Vtl2Parser.FilterClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#erLevel}.
	 * @param ctx the parse tree
	 */
	void enterErLevel(@NotNull Vtl2Parser.ErLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#erLevel}.
	 * @param ctx the parse tree
	 */
	void exitErLevel(@NotNull Vtl2Parser.ErLevelContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#joinAggExpr}.
	 * @param ctx the parse tree
	 */
	void enterJoinAggExpr(@NotNull Vtl2Parser.JoinAggExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#joinAggExpr}.
	 * @param ctx the parse tree
	 */
	void exitJoinAggExpr(@NotNull Vtl2Parser.JoinAggExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#procedureBody}.
	 * @param ctx the parse tree
	 */
	void enterProcedureBody(@NotNull Vtl2Parser.ProcedureBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#procedureBody}.
	 * @param ctx the parse tree
	 */
	void exitProcedureBody(@NotNull Vtl2Parser.ProcedureBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#standaloneAggregateFunction}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneAggregateFunction(@NotNull Vtl2Parser.StandaloneAggregateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#standaloneAggregateFunction}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneAggregateFunction(@NotNull Vtl2Parser.StandaloneAggregateFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#joinAggClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinAggClause(@NotNull Vtl2Parser.JoinAggClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#joinAggClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinAggClause(@NotNull Vtl2Parser.JoinAggClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#hierRuleSignature}.
	 * @param ctx the parse tree
	 */
	void enterHierRuleSignature(@NotNull Vtl2Parser.HierRuleSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#hierRuleSignature}.
	 * @param ctx the parse tree
	 */
	void exitHierRuleSignature(@NotNull Vtl2Parser.HierRuleSignatureContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#multModifier}.
	 * @param ctx the parse tree
	 */
	void enterMultModifier(@NotNull Vtl2Parser.MultModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#multModifier}.
	 * @param ctx the parse tree
	 */
	void exitMultModifier(@NotNull Vtl2Parser.MultModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#prodValueDomains}.
	 * @param ctx the parse tree
	 */
	void enterProdValueDomains(@NotNull Vtl2Parser.ProdValueDomainsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#prodValueDomains}.
	 * @param ctx the parse tree
	 */
	void exitProdValueDomains(@NotNull Vtl2Parser.ProdValueDomainsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#defHierarchical}.
	 * @param ctx the parse tree
	 */
	void enterDefHierarchical(@NotNull Vtl2Parser.DefHierarchicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#defHierarchical}.
	 * @param ctx the parse tree
	 */
	void exitDefHierarchical(@NotNull Vtl2Parser.DefHierarchicalContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#flowToStockAtom}.
	 * @param ctx the parse tree
	 */
	void enterFlowToStockAtom(@NotNull Vtl2Parser.FlowToStockAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#flowToStockAtom}.
	 * @param ctx the parse tree
	 */
	void exitFlowToStockAtom(@NotNull Vtl2Parser.FlowToStockAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#dpRuleset}.
	 * @param ctx the parse tree
	 */
	void enterDpRuleset(@NotNull Vtl2Parser.DpRulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#dpRuleset}.
	 * @param ctx the parse tree
	 */
	void exitDpRuleset(@NotNull Vtl2Parser.DpRulesetContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#joinCalcExpr}.
	 * @param ctx the parse tree
	 */
	void enterJoinCalcExpr(@NotNull Vtl2Parser.JoinCalcExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#joinCalcExpr}.
	 * @param ctx the parse tree
	 */
	void exitJoinCalcExpr(@NotNull Vtl2Parser.JoinCalcExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#groupingClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupingClause(@NotNull Vtl2Parser.GroupingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#groupingClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupingClause(@NotNull Vtl2Parser.GroupingClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#persistentDatasetID}.
	 * @param ctx the parse tree
	 */
	void enterPersistentDatasetID(@NotNull Vtl2Parser.PersistentDatasetIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#persistentDatasetID}.
	 * @param ctx the parse tree
	 */
	void exitPersistentDatasetID(@NotNull Vtl2Parser.PersistentDatasetIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(@NotNull Vtl2Parser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(@NotNull Vtl2Parser.ArgListContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull Vtl2Parser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull Vtl2Parser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#retainType}.
	 * @param ctx the parse tree
	 */
	void enterRetainType(@NotNull Vtl2Parser.RetainTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#retainType}.
	 * @param ctx the parse tree
	 */
	void exitRetainType(@NotNull Vtl2Parser.RetainTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#joinBody}.
	 * @param ctx the parse tree
	 */
	void enterJoinBody(@NotNull Vtl2Parser.JoinBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#joinBody}.
	 * @param ctx the parse tree
	 */
	void exitJoinBody(@NotNull Vtl2Parser.JoinBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#joinCalcClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinCalcClause(@NotNull Vtl2Parser.JoinCalcClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#joinCalcClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinCalcClause(@NotNull Vtl2Parser.JoinCalcClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#aggrInvocation}.
	 * @param ctx the parse tree
	 */
	void enterAggrInvocation(@NotNull Vtl2Parser.AggrInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#aggrInvocation}.
	 * @param ctx the parse tree
	 */
	void exitAggrInvocation(@NotNull Vtl2Parser.AggrInvocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#validateDPruleset}.
	 * @param ctx the parse tree
	 */
	void enterValidateDPruleset(@NotNull Vtl2Parser.ValidateDPrulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#validateDPruleset}.
	 * @param ctx the parse tree
	 */
	void exitValidateDPruleset(@NotNull Vtl2Parser.ValidateDPrulesetContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#charsetMatchAtom}.
	 * @param ctx the parse tree
	 */
	void enterCharsetMatchAtom(@NotNull Vtl2Parser.CharsetMatchAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#charsetMatchAtom}.
	 * @param ctx the parse tree
	 */
	void exitCharsetMatchAtom(@NotNull Vtl2Parser.CharsetMatchAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#lnAtom}.
	 * @param ctx the parse tree
	 */
	void enterLnAtom(@NotNull Vtl2Parser.LnAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#lnAtom}.
	 * @param ctx the parse tree
	 */
	void exitLnAtom(@NotNull Vtl2Parser.LnAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#joinApplyClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinApplyClause(@NotNull Vtl2Parser.JoinApplyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#joinApplyClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinApplyClause(@NotNull Vtl2Parser.JoinApplyClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#procedureID}.
	 * @param ctx the parse tree
	 */
	void enterProcedureID(@NotNull Vtl2Parser.ProcedureIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#procedureID}.
	 * @param ctx the parse tree
	 */
	void exitProcedureID(@NotNull Vtl2Parser.ProcedureIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#aggrClause}.
	 * @param ctx the parse tree
	 */
	void enterAggrClause(@NotNull Vtl2Parser.AggrClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#aggrClause}.
	 * @param ctx the parse tree
	 */
	void exitAggrClause(@NotNull Vtl2Parser.AggrClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#returnAll}.
	 * @param ctx the parse tree
	 */
	void enterReturnAll(@NotNull Vtl2Parser.ReturnAllContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#returnAll}.
	 * @param ctx the parse tree
	 */
	void exitReturnAll(@NotNull Vtl2Parser.ReturnAllContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#ucaseAtom}.
	 * @param ctx the parse tree
	 */
	void enterUcaseAtom(@NotNull Vtl2Parser.UcaseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#ucaseAtom}.
	 * @param ctx the parse tree
	 */
	void exitUcaseAtom(@NotNull Vtl2Parser.UcaseAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#endHierarchicalRuleset}.
	 * @param ctx the parse tree
	 */
	void enterEndHierarchicalRuleset(@NotNull Vtl2Parser.EndHierarchicalRulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#endHierarchicalRuleset}.
	 * @param ctx the parse tree
	 */
	void exitEndHierarchicalRuleset(@NotNull Vtl2Parser.EndHierarchicalRulesetContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#hierarchyExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterHierarchyExprAtom(@NotNull Vtl2Parser.HierarchyExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#hierarchyExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitHierarchyExprAtom(@NotNull Vtl2Parser.HierarchyExprAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#endDatapointRuleset}.
	 * @param ctx the parse tree
	 */
	void enterEndDatapointRuleset(@NotNull Vtl2Parser.EndDatapointRulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#endDatapointRuleset}.
	 * @param ctx the parse tree
	 */
	void exitEndDatapointRuleset(@NotNull Vtl2Parser.EndDatapointRulesetContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#standaloneAnalyticFunction}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneAnalyticFunction(@NotNull Vtl2Parser.StandaloneAnalyticFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#standaloneAnalyticFunction}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneAnalyticFunction(@NotNull Vtl2Parser.StandaloneAnalyticFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#valueDomainSignature}.
	 * @param ctx the parse tree
	 */
	void enterValueDomainSignature(@NotNull Vtl2Parser.ValueDomainSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#valueDomainSignature}.
	 * @param ctx the parse tree
	 */
	void exitValueDomainSignature(@NotNull Vtl2Parser.ValueDomainSignatureContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#scalarType}.
	 * @param ctx the parse tree
	 */
	void enterScalarType(@NotNull Vtl2Parser.ScalarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#scalarType}.
	 * @param ctx the parse tree
	 */
	void exitScalarType(@NotNull Vtl2Parser.ScalarTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#floorAtom}.
	 * @param ctx the parse tree
	 */
	void enterFloorAtom(@NotNull Vtl2Parser.FloorAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#floorAtom}.
	 * @param ctx the parse tree
	 */
	void exitFloorAtom(@NotNull Vtl2Parser.FloorAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#joinDropClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinDropClause(@NotNull Vtl2Parser.JoinDropClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#joinDropClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinDropClause(@NotNull Vtl2Parser.JoinDropClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#keepClauseItem}.
	 * @param ctx the parse tree
	 */
	void enterKeepClauseItem(@NotNull Vtl2Parser.KeepClauseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#keepClauseItem}.
	 * @param ctx the parse tree
	 */
	void exitKeepClauseItem(@NotNull Vtl2Parser.KeepClauseItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#defExpr}.
	 * @param ctx the parse tree
	 */
	void enterDefExpr(@NotNull Vtl2Parser.DefExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#defExpr}.
	 * @param ctx the parse tree
	 */
	void exitDefExpr(@NotNull Vtl2Parser.DefExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#exponent}.
	 * @param ctx the parse tree
	 */
	void enterExponent(@NotNull Vtl2Parser.ExponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#exponent}.
	 * @param ctx the parse tree
	 */
	void exitExponent(@NotNull Vtl2Parser.ExponentContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#powerAtom}.
	 * @param ctx the parse tree
	 */
	void enterPowerAtom(@NotNull Vtl2Parser.PowerAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#powerAtom}.
	 * @param ctx the parse tree
	 */
	void exitPowerAtom(@NotNull Vtl2Parser.PowerAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#lenAtom}.
	 * @param ctx the parse tree
	 */
	void enterLenAtom(@NotNull Vtl2Parser.LenAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#lenAtom}.
	 * @param ctx the parse tree
	 */
	void exitLenAtom(@NotNull Vtl2Parser.LenAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#minAtom}.
	 * @param ctx the parse tree
	 */
	void enterMinAtom(@NotNull Vtl2Parser.MinAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#minAtom}.
	 * @param ctx the parse tree
	 */
	void exitMinAtom(@NotNull Vtl2Parser.MinAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#componentRole}.
	 * @param ctx the parse tree
	 */
	void enterComponentRole(@NotNull Vtl2Parser.ComponentRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#componentRole}.
	 * @param ctx the parse tree
	 */
	void exitComponentRole(@NotNull Vtl2Parser.ComponentRoleContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#validateHRruleset}.
	 * @param ctx the parse tree
	 */
	void enterValidateHRruleset(@NotNull Vtl2Parser.ValidateHRrulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#validateHRruleset}.
	 * @param ctx the parse tree
	 */
	void exitValidateHRruleset(@NotNull Vtl2Parser.ValidateHRrulesetContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(@NotNull Vtl2Parser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(@NotNull Vtl2Parser.DataTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#codeItemRelation}.
	 * @param ctx the parse tree
	 */
	void enterCodeItemRelation(@NotNull Vtl2Parser.CodeItemRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#codeItemRelation}.
	 * @param ctx the parse tree
	 */
	void exitCodeItemRelation(@NotNull Vtl2Parser.CodeItemRelationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#setExpressions}.
	 * @param ctx the parse tree
	 */
	void enterSetExpressions(@NotNull Vtl2Parser.SetExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#setExpressions}.
	 * @param ctx the parse tree
	 */
	void exitSetExpressions(@NotNull Vtl2Parser.SetExpressionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#joinFilterClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinFilterClause(@NotNull Vtl2Parser.JoinFilterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#joinFilterClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinFilterClause(@NotNull Vtl2Parser.JoinFilterClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#defineHierarchicalRuleset}.
	 * @param ctx the parse tree
	 */
	void enterDefineHierarchicalRuleset(@NotNull Vtl2Parser.DefineHierarchicalRulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#defineHierarchicalRuleset}.
	 * @param ctx the parse tree
	 */
	void exitDefineHierarchicalRuleset(@NotNull Vtl2Parser.DefineHierarchicalRulesetContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#renameClause}.
	 * @param ctx the parse tree
	 */
	void enterRenameClause(@NotNull Vtl2Parser.RenameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#renameClause}.
	 * @param ctx the parse tree
	 */
	void exitRenameClause(@NotNull Vtl2Parser.RenameClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#functionID}.
	 * @param ctx the parse tree
	 */
	void enterFunctionID(@NotNull Vtl2Parser.FunctionIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#functionID}.
	 * @param ctx the parse tree
	 */
	void exitFunctionID(@NotNull Vtl2Parser.FunctionIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#unpivotExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotExpr(@NotNull Vtl2Parser.UnpivotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#unpivotExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotExpr(@NotNull Vtl2Parser.UnpivotExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#inputParameterType}.
	 * @param ctx the parse tree
	 */
	void enterInputParameterType(@NotNull Vtl2Parser.InputParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#inputParameterType}.
	 * @param ctx the parse tree
	 */
	void exitInputParameterType(@NotNull Vtl2Parser.InputParameterTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#lists}.
	 * @param ctx the parse tree
	 */
	void enterLists(@NotNull Vtl2Parser.ListsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#lists}.
	 * @param ctx the parse tree
	 */
	void exitLists(@NotNull Vtl2Parser.ListsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#timeAggExpr}.
	 * @param ctx the parse tree
	 */
	void enterTimeAggExpr(@NotNull Vtl2Parser.TimeAggExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#timeAggExpr}.
	 * @param ctx the parse tree
	 */
	void exitTimeAggExpr(@NotNull Vtl2Parser.TimeAggExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#periodExpr}.
	 * @param ctx the parse tree
	 */
	void enterPeriodExpr(@NotNull Vtl2Parser.PeriodExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#periodExpr}.
	 * @param ctx the parse tree
	 */
	void exitPeriodExpr(@NotNull Vtl2Parser.PeriodExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#procedureArgList}.
	 * @param ctx the parse tree
	 */
	void enterProcedureArgList(@NotNull Vtl2Parser.ProcedureArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#procedureArgList}.
	 * @param ctx the parse tree
	 */
	void exitProcedureArgList(@NotNull Vtl2Parser.ProcedureArgListContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#callFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void enterCallFunctionExpression(@NotNull Vtl2Parser.CallFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#callFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void exitCallFunctionExpression(@NotNull Vtl2Parser.CallFunctionExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#routineName}.
	 * @param ctx the parse tree
	 */
	void enterRoutineName(@NotNull Vtl2Parser.RoutineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#routineName}.
	 * @param ctx the parse tree
	 */
	void exitRoutineName(@NotNull Vtl2Parser.RoutineNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#constantRef}.
	 * @param ctx the parse tree
	 */
	void enterConstantRef(@NotNull Vtl2Parser.ConstantRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#constantRef}.
	 * @param ctx the parse tree
	 */
	void exitConstantRef(@NotNull Vtl2Parser.ConstantRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#replaceAtom}.
	 * @param ctx the parse tree
	 */
	void enterReplaceAtom(@NotNull Vtl2Parser.ReplaceAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#replaceAtom}.
	 * @param ctx the parse tree
	 */
	void exitReplaceAtom(@NotNull Vtl2Parser.ReplaceAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#dimensionType}.
	 * @param ctx the parse tree
	 */
	void enterDimensionType(@NotNull Vtl2Parser.DimensionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#dimensionType}.
	 * @param ctx the parse tree
	 */
	void exitDimensionType(@NotNull Vtl2Parser.DimensionTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#anFunctionClause}.
	 * @param ctx the parse tree
	 */
	void enterAnFunctionClause(@NotNull Vtl2Parser.AnFunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#anFunctionClause}.
	 * @param ctx the parse tree
	 */
	void exitAnFunctionClause(@NotNull Vtl2Parser.AnFunctionClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#viralAttribute}.
	 * @param ctx the parse tree
	 */
	void enterViralAttribute(@NotNull Vtl2Parser.ViralAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#viralAttribute}.
	 * @param ctx the parse tree
	 */
	void exitViralAttribute(@NotNull Vtl2Parser.ViralAttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#dropClause}.
	 * @param ctx the parse tree
	 */
	void enterDropClause(@NotNull Vtl2Parser.DropClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#dropClause}.
	 * @param ctx the parse tree
	 */
	void exitDropClause(@NotNull Vtl2Parser.DropClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#subscriptExpr}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptExpr(@NotNull Vtl2Parser.SubscriptExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#subscriptExpr}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptExpr(@NotNull Vtl2Parser.SubscriptExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#ruleItemDatapoint}.
	 * @param ctx the parse tree
	 */
	void enterRuleItemDatapoint(@NotNull Vtl2Parser.RuleItemDatapointContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#ruleItemDatapoint}.
	 * @param ctx the parse tree
	 */
	void exitRuleItemDatapoint(@NotNull Vtl2Parser.RuleItemDatapointContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#castExpr}.
	 * @param ctx the parse tree
	 */
	void enterCastExpr(@NotNull Vtl2Parser.CastExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#castExpr}.
	 * @param ctx the parse tree
	 */
	void exitCastExpr(@NotNull Vtl2Parser.CastExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#instrAtom}.
	 * @param ctx the parse tree
	 */
	void enterInstrAtom(@NotNull Vtl2Parser.InstrAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#instrAtom}.
	 * @param ctx the parse tree
	 */
	void exitInstrAtom(@NotNull Vtl2Parser.InstrAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull Vtl2Parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull Vtl2Parser.StatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#validationSimple}.
	 * @param ctx the parse tree
	 */
	void enterValidationSimple(@NotNull Vtl2Parser.ValidationSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#validationSimple}.
	 * @param ctx the parse tree
	 */
	void exitValidationSimple(@NotNull Vtl2Parser.ValidationSimpleContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#groupKeyword}.
	 * @param ctx the parse tree
	 */
	void enterGroupKeyword(@NotNull Vtl2Parser.GroupKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#groupKeyword}.
	 * @param ctx the parse tree
	 */
	void exitGroupKeyword(@NotNull Vtl2Parser.GroupKeywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#isNullAtom}.
	 * @param ctx the parse tree
	 */
	void enterIsNullAtom(@NotNull Vtl2Parser.IsNullAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#isNullAtom}.
	 * @param ctx the parse tree
	 */
	void exitIsNullAtom(@NotNull Vtl2Parser.IsNullAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#joinAggClauseItem}.
	 * @param ctx the parse tree
	 */
	void enterJoinAggClauseItem(@NotNull Vtl2Parser.JoinAggClauseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#joinAggClauseItem}.
	 * @param ctx the parse tree
	 */
	void exitJoinAggClauseItem(@NotNull Vtl2Parser.JoinAggClauseItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#getFiltersClause}.
	 * @param ctx the parse tree
	 */
	void enterGetFiltersClause(@NotNull Vtl2Parser.GetFiltersClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#getFiltersClause}.
	 * @param ctx the parse tree
	 */
	void exitGetFiltersClause(@NotNull Vtl2Parser.GetFiltersClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#ceilAtom}.
	 * @param ctx the parse tree
	 */
	void enterCeilAtom(@NotNull Vtl2Parser.CeilAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#ceilAtom}.
	 * @param ctx the parse tree
	 */
	void exitCeilAtom(@NotNull Vtl2Parser.CeilAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#dropClauseItem}.
	 * @param ctx the parse tree
	 */
	void enterDropClauseItem(@NotNull Vtl2Parser.DropClauseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#dropClauseItem}.
	 * @param ctx the parse tree
	 */
	void exitDropClauseItem(@NotNull Vtl2Parser.DropClauseItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#timeSeriesExpr}.
	 * @param ctx the parse tree
	 */
	void enterTimeSeriesExpr(@NotNull Vtl2Parser.TimeSeriesExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#timeSeriesExpr}.
	 * @param ctx the parse tree
	 */
	void exitTimeSeriesExpr(@NotNull Vtl2Parser.TimeSeriesExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull Vtl2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull Vtl2Parser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#partitionByClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionByClause(@NotNull Vtl2Parser.PartitionByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#partitionByClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionByClause(@NotNull Vtl2Parser.PartitionByClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#ruleClauseDatapoint}.
	 * @param ctx the parse tree
	 */
	void enterRuleClauseDatapoint(@NotNull Vtl2Parser.RuleClauseDatapointContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#ruleClauseDatapoint}.
	 * @param ctx the parse tree
	 */
	void exitRuleClauseDatapoint(@NotNull Vtl2Parser.RuleClauseDatapointContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull Vtl2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull Vtl2Parser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void enterCalcExpr(@NotNull Vtl2Parser.CalcExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void exitCalcExpr(@NotNull Vtl2Parser.CalcExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#windowingClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowingClause(@NotNull Vtl2Parser.WindowingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#windowingClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowingClause(@NotNull Vtl2Parser.WindowingClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#substrAtom}.
	 * @param ctx the parse tree
	 */
	void enterSubstrAtom(@NotNull Vtl2Parser.SubstrAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#substrAtom}.
	 * @param ctx the parse tree
	 */
	void exitSubstrAtom(@NotNull Vtl2Parser.SubstrAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#scalarSetType}.
	 * @param ctx the parse tree
	 */
	void enterScalarSetType(@NotNull Vtl2Parser.ScalarSetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#scalarSetType}.
	 * @param ctx the parse tree
	 */
	void exitScalarSetType(@NotNull Vtl2Parser.ScalarSetTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#ruleItemHierarchical}.
	 * @param ctx the parse tree
	 */
	void enterRuleItemHierarchical(@NotNull Vtl2Parser.RuleItemHierarchicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#ruleItemHierarchical}.
	 * @param ctx the parse tree
	 */
	void exitRuleItemHierarchical(@NotNull Vtl2Parser.RuleItemHierarchicalContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#logAtom}.
	 * @param ctx the parse tree
	 */
	void enterLogAtom(@NotNull Vtl2Parser.LogAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#logAtom}.
	 * @param ctx the parse tree
	 */
	void exitLogAtom(@NotNull Vtl2Parser.LogAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#rulesetID}.
	 * @param ctx the parse tree
	 */
	void enterRulesetID(@NotNull Vtl2Parser.RulesetIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#rulesetID}.
	 * @param ctx the parse tree
	 */
	void exitRulesetID(@NotNull Vtl2Parser.RulesetIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#optionalExpr}.
	 * @param ctx the parse tree
	 */
	void enterOptionalExpr(@NotNull Vtl2Parser.OptionalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#optionalExpr}.
	 * @param ctx the parse tree
	 */
	void exitOptionalExpr(@NotNull Vtl2Parser.OptionalExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#keepClause}.
	 * @param ctx the parse tree
	 */
	void enterKeepClause(@NotNull Vtl2Parser.KeepClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#keepClause}.
	 * @param ctx the parse tree
	 */
	void exitKeepClause(@NotNull Vtl2Parser.KeepClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#componentID}.
	 * @param ctx the parse tree
	 */
	void enterComponentID(@NotNull Vtl2Parser.ComponentIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#componentID}.
	 * @param ctx the parse tree
	 */
	void exitComponentID(@NotNull Vtl2Parser.ComponentIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#codeItemRef}.
	 * @param ctx the parse tree
	 */
	void enterCodeItemRef(@NotNull Vtl2Parser.CodeItemRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#codeItemRef}.
	 * @param ctx the parse tree
	 */
	void exitCodeItemRef(@NotNull Vtl2Parser.CodeItemRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#hrRuleset}.
	 * @param ctx the parse tree
	 */
	void enterHrRuleset(@NotNull Vtl2Parser.HrRulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#hrRuleset}.
	 * @param ctx the parse tree
	 */
	void exitHrRuleset(@NotNull Vtl2Parser.HrRulesetContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#defineDataStructure}.
	 * @param ctx the parse tree
	 */
	void enterDefineDataStructure(@NotNull Vtl2Parser.DefineDataStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#defineDataStructure}.
	 * @param ctx the parse tree
	 */
	void exitDefineDataStructure(@NotNull Vtl2Parser.DefineDataStructureContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#aggrFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterAggrFunctionName(@NotNull Vtl2Parser.AggrFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#aggrFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitAggrFunctionName(@NotNull Vtl2Parser.AggrFunctionNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull Vtl2Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull Vtl2Parser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#betweenAtom}.
	 * @param ctx the parse tree
	 */
	void enterBetweenAtom(@NotNull Vtl2Parser.BetweenAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#betweenAtom}.
	 * @param ctx the parse tree
	 */
	void exitBetweenAtom(@NotNull Vtl2Parser.BetweenAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#expAtom}.
	 * @param ctx the parse tree
	 */
	void enterExpAtom(@NotNull Vtl2Parser.ExpAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#expAtom}.
	 * @param ctx the parse tree
	 */
	void exitExpAtom(@NotNull Vtl2Parser.ExpAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(@NotNull Vtl2Parser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(@NotNull Vtl2Parser.JoinClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#aggrInvocationCompExpr}.
	 * @param ctx the parse tree
	 */
	void enterAggrInvocationCompExpr(@NotNull Vtl2Parser.AggrInvocationCompExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#aggrInvocationCompExpr}.
	 * @param ctx the parse tree
	 */
	void exitAggrInvocationCompExpr(@NotNull Vtl2Parser.AggrInvocationCompExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#joinCalcClauseItem}.
	 * @param ctx the parse tree
	 */
	void enterJoinCalcClauseItem(@NotNull Vtl2Parser.JoinCalcClauseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#joinCalcClauseItem}.
	 * @param ctx the parse tree
	 */
	void exitJoinCalcClauseItem(@NotNull Vtl2Parser.JoinCalcClauseItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#compConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCompConstraint(@NotNull Vtl2Parser.CompConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#compConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCompConstraint(@NotNull Vtl2Parser.CompConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#basicScalarType}.
	 * @param ctx the parse tree
	 */
	void enterBasicScalarType(@NotNull Vtl2Parser.BasicScalarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#basicScalarType}.
	 * @param ctx the parse tree
	 */
	void exitBasicScalarType(@NotNull Vtl2Parser.BasicScalarTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#calcClause}.
	 * @param ctx the parse tree
	 */
	void enterCalcClause(@NotNull Vtl2Parser.CalcClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#calcClause}.
	 * @param ctx the parse tree
	 */
	void exitCalcClause(@NotNull Vtl2Parser.CalcClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#joinExpression}.
	 * @param ctx the parse tree
	 */
	void enterJoinExpression(@NotNull Vtl2Parser.JoinExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#joinExpression}.
	 * @param ctx the parse tree
	 */
	void exitJoinExpression(@NotNull Vtl2Parser.JoinExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#evalExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterEvalExprAtom(@NotNull Vtl2Parser.EvalExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#evalExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitEvalExprAtom(@NotNull Vtl2Parser.EvalExprAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#aggrFunctionClause}.
	 * @param ctx the parse tree
	 */
	void enterAggrFunctionClause(@NotNull Vtl2Parser.AggrFunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#aggrFunctionClause}.
	 * @param ctx the parse tree
	 */
	void exitAggrFunctionClause(@NotNull Vtl2Parser.AggrFunctionClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#datasetID}.
	 * @param ctx the parse tree
	 */
	void enterDatasetID(@NotNull Vtl2Parser.DatasetIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#datasetID}.
	 * @param ctx the parse tree
	 */
	void exitDatasetID(@NotNull Vtl2Parser.DatasetIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#erCode}.
	 * @param ctx the parse tree
	 */
	void enterErCode(@NotNull Vtl2Parser.ErCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#erCode}.
	 * @param ctx the parse tree
	 */
	void exitErCode(@NotNull Vtl2Parser.ErCodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull Vtl2Parser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull Vtl2Parser.CommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#operatorType}.
	 * @param ctx the parse tree
	 */
	void enterOperatorType(@NotNull Vtl2Parser.OperatorTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#operatorType}.
	 * @param ctx the parse tree
	 */
	void exitOperatorType(@NotNull Vtl2Parser.OperatorTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#codeItemRelationClause}.
	 * @param ctx the parse tree
	 */
	void enterCodeItemRelationClause(@NotNull Vtl2Parser.CodeItemRelationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#codeItemRelationClause}.
	 * @param ctx the parse tree
	 */
	void exitCodeItemRelationClause(@NotNull Vtl2Parser.CodeItemRelationClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#operatorID}.
	 * @param ctx the parse tree
	 */
	void enterOperatorID(@NotNull Vtl2Parser.OperatorIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#operatorID}.
	 * @param ctx the parse tree
	 */
	void exitOperatorID(@NotNull Vtl2Parser.OperatorIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link Vtl2Parser#varSignature}.
	 * @param ctx the parse tree
	 */
	void enterVarSignature(@NotNull Vtl2Parser.VarSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Vtl2Parser#varSignature}.
	 * @param ctx the parse tree
	 */
	void exitVarSignature(@NotNull Vtl2Parser.VarSignatureContext ctx);
}