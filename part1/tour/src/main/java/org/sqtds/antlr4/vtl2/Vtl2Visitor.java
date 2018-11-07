// Generated from org\sqtds\antlr4\vtl2\Vtl2.g4 by ANTLR 4.2.2
package org.sqtds.antlr4.vtl2;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Vtl2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Vtl2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#parameterItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterItem(@NotNull Vtl2Parser.ParameterItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#joinRenameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRenameClause(@NotNull Vtl2Parser.JoinRenameClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#definitionExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionExpressions(@NotNull Vtl2Parser.DefinitionExpressionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#calcClauseItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcClauseItem(@NotNull Vtl2Parser.CalcClauseItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#callFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(@NotNull Vtl2Parser.CallFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#timeShiftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeShiftExpr(@NotNull Vtl2Parser.TimeShiftExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#aggrFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrFunction(@NotNull Vtl2Parser.AggrFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#pivotExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotExpr(@NotNull Vtl2Parser.PivotExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#persistentAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPersistentAssignment(@NotNull Vtl2Parser.PersistentAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#defineFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineFunction(@NotNull Vtl2Parser.DefineFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#lcaseAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcaseAtom(@NotNull Vtl2Parser.LcaseAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#refAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefAtom(@NotNull Vtl2Parser.RefAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#parenthesisExprRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExprRef(@NotNull Vtl2Parser.ParenthesisExprRefContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#validationDatapoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidationDatapoint(@NotNull Vtl2Parser.ValidationDatapointContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(@NotNull Vtl2Parser.OrderByClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#datasetType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatasetType(@NotNull Vtl2Parser.DatasetTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#outputParameterType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputParameterType(@NotNull Vtl2Parser.OutputParameterTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#defineDatapointRuleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineDatapointRuleset(@NotNull Vtl2Parser.DefineDatapointRulesetContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#ruleClauseHierarchical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleClauseHierarchical(@NotNull Vtl2Parser.RuleClauseHierarchicalContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(@NotNull Vtl2Parser.IdentifierListContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#exprValidationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprValidationExpr(@NotNull Vtl2Parser.ExprValidationExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#getFilterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetFilterClause(@NotNull Vtl2Parser.GetFilterClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#varID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarID(@NotNull Vtl2Parser.VarIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#rulesetType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulesetType(@NotNull Vtl2Parser.RulesetTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#componentType2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentType2(@NotNull Vtl2Parser.ComponentType2Context ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#prodVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProdVariables(@NotNull Vtl2Parser.ProdVariablesContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#validationHierarchical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidationHierarchical(@NotNull Vtl2Parser.ValidationHierarchicalContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#aggregateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateClause(@NotNull Vtl2Parser.AggregateClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#defDatapoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefDatapoint(@NotNull Vtl2Parser.DefDatapointContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#castExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExprAtom(@NotNull Vtl2Parser.CastExprAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#evalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalExpr(@NotNull Vtl2Parser.EvalExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#setExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExpr(@NotNull Vtl2Parser.SetExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#sqrtAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrtAtom(@NotNull Vtl2Parser.SqrtAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#anFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnFunction(@NotNull Vtl2Parser.AnFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#setName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetName(@NotNull Vtl2Parser.SetNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#defFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefFunction(@NotNull Vtl2Parser.DefFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#defProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefProcedure(@NotNull Vtl2Parser.DefProcedureContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#procedureArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureArg(@NotNull Vtl2Parser.ProcedureArgContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#validationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidationExpr(@NotNull Vtl2Parser.ValidationExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#timeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeExpr(@NotNull Vtl2Parser.TimeExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#ltrimAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtrimAtom(@NotNull Vtl2Parser.LtrimAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#stockToFlowAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStockToFlowAtom(@NotNull Vtl2Parser.StockToFlowAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#valueDomainName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueDomainName(@NotNull Vtl2Parser.ValueDomainNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#trimAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimAtom(@NotNull Vtl2Parser.TrimAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#datasetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatasetClause(@NotNull Vtl2Parser.DatasetClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#rulesetSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulesetSignature(@NotNull Vtl2Parser.RulesetSignatureContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#nvlAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNvlAtom(@NotNull Vtl2Parser.NvlAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#hierarchyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchyExpr(@NotNull Vtl2Parser.HierarchyExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#simpleaggregateFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleaggregateFunctions(@NotNull Vtl2Parser.SimpleaggregateFunctionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#defOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefOperator(@NotNull Vtl2Parser.DefOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#rtrimAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRtrimAtom(@NotNull Vtl2Parser.RtrimAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#joinKeepClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinKeepClause(@NotNull Vtl2Parser.JoinKeepClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#varIdRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIdRef(@NotNull Vtl2Parser.VarIdRefContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#joinExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinExpr(@NotNull Vtl2Parser.JoinExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#timeexpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeexpressions(@NotNull Vtl2Parser.TimeexpressionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#inBetweenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInBetweenClause(@NotNull Vtl2Parser.InBetweenClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#roundAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundAtom(@NotNull Vtl2Parser.RoundAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#subspaceExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubspaceExpr(@NotNull Vtl2Parser.SubspaceExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#joinKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinKeyword(@NotNull Vtl2Parser.JoinKeywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(@NotNull Vtl2Parser.ArgContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#componentExpressionwithAggrClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentExpressionwithAggrClause(@NotNull Vtl2Parser.ComponentExpressionwithAggrClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#limitClauseItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClauseItem(@NotNull Vtl2Parser.LimitClauseItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#logBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogBase(@NotNull Vtl2Parser.LogBaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#componentType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentType(@NotNull Vtl2Parser.ComponentTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#modAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModAtom(@NotNull Vtl2Parser.ModAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(@NotNull Vtl2Parser.HavingClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#scalarTypeConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarTypeConstraint(@NotNull Vtl2Parser.ScalarTypeConstraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#filterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterClause(@NotNull Vtl2Parser.FilterClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#erLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErLevel(@NotNull Vtl2Parser.ErLevelContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#joinAggExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinAggExpr(@NotNull Vtl2Parser.JoinAggExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#procedureBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureBody(@NotNull Vtl2Parser.ProcedureBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#standaloneAggregateFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneAggregateFunction(@NotNull Vtl2Parser.StandaloneAggregateFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#joinAggClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinAggClause(@NotNull Vtl2Parser.JoinAggClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#hierRuleSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierRuleSignature(@NotNull Vtl2Parser.HierRuleSignatureContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#multModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultModifier(@NotNull Vtl2Parser.MultModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#prodValueDomains}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProdValueDomains(@NotNull Vtl2Parser.ProdValueDomainsContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#defHierarchical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefHierarchical(@NotNull Vtl2Parser.DefHierarchicalContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#flowToStockAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlowToStockAtom(@NotNull Vtl2Parser.FlowToStockAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#dpRuleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDpRuleset(@NotNull Vtl2Parser.DpRulesetContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#joinCalcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCalcExpr(@NotNull Vtl2Parser.JoinCalcExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#groupingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingClause(@NotNull Vtl2Parser.GroupingClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#persistentDatasetID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPersistentDatasetID(@NotNull Vtl2Parser.PersistentDatasetIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(@NotNull Vtl2Parser.ArgListContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull Vtl2Parser.ConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#retainType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetainType(@NotNull Vtl2Parser.RetainTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#joinBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinBody(@NotNull Vtl2Parser.JoinBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#joinCalcClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCalcClause(@NotNull Vtl2Parser.JoinCalcClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#aggrInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrInvocation(@NotNull Vtl2Parser.AggrInvocationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#validateDPruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidateDPruleset(@NotNull Vtl2Parser.ValidateDPrulesetContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#charsetMatchAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetMatchAtom(@NotNull Vtl2Parser.CharsetMatchAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#lnAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLnAtom(@NotNull Vtl2Parser.LnAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#joinApplyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinApplyClause(@NotNull Vtl2Parser.JoinApplyClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#procedureID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureID(@NotNull Vtl2Parser.ProcedureIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#aggrClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrClause(@NotNull Vtl2Parser.AggrClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#returnAll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnAll(@NotNull Vtl2Parser.ReturnAllContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#ucaseAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUcaseAtom(@NotNull Vtl2Parser.UcaseAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#endHierarchicalRuleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndHierarchicalRuleset(@NotNull Vtl2Parser.EndHierarchicalRulesetContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#hierarchyExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchyExprAtom(@NotNull Vtl2Parser.HierarchyExprAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#endDatapointRuleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndDatapointRuleset(@NotNull Vtl2Parser.EndDatapointRulesetContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#standaloneAnalyticFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneAnalyticFunction(@NotNull Vtl2Parser.StandaloneAnalyticFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#valueDomainSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueDomainSignature(@NotNull Vtl2Parser.ValueDomainSignatureContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#scalarType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarType(@NotNull Vtl2Parser.ScalarTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#floorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloorAtom(@NotNull Vtl2Parser.FloorAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#joinDropClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinDropClause(@NotNull Vtl2Parser.JoinDropClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#keepClauseItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeepClauseItem(@NotNull Vtl2Parser.KeepClauseItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#defExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefExpr(@NotNull Vtl2Parser.DefExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#exponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponent(@NotNull Vtl2Parser.ExponentContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#powerAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerAtom(@NotNull Vtl2Parser.PowerAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#lenAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLenAtom(@NotNull Vtl2Parser.LenAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#minAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinAtom(@NotNull Vtl2Parser.MinAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#componentRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentRole(@NotNull Vtl2Parser.ComponentRoleContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#validateHRruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidateHRruleset(@NotNull Vtl2Parser.ValidateHRrulesetContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(@NotNull Vtl2Parser.DataTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#codeItemRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeItemRelation(@NotNull Vtl2Parser.CodeItemRelationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#setExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExpressions(@NotNull Vtl2Parser.SetExpressionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#joinFilterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinFilterClause(@NotNull Vtl2Parser.JoinFilterClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#defineHierarchicalRuleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineHierarchicalRuleset(@NotNull Vtl2Parser.DefineHierarchicalRulesetContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#renameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameClause(@NotNull Vtl2Parser.RenameClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#functionID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionID(@NotNull Vtl2Parser.FunctionIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#unpivotExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotExpr(@NotNull Vtl2Parser.UnpivotExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#inputParameterType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputParameterType(@NotNull Vtl2Parser.InputParameterTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#lists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLists(@NotNull Vtl2Parser.ListsContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#timeAggExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeAggExpr(@NotNull Vtl2Parser.TimeAggExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#periodExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriodExpr(@NotNull Vtl2Parser.PeriodExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#procedureArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureArgList(@NotNull Vtl2Parser.ProcedureArgListContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#callFunctionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunctionExpression(@NotNull Vtl2Parser.CallFunctionExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#routineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineName(@NotNull Vtl2Parser.RoutineNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#constantRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantRef(@NotNull Vtl2Parser.ConstantRefContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#replaceAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceAtom(@NotNull Vtl2Parser.ReplaceAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#dimensionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionType(@NotNull Vtl2Parser.DimensionTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#anFunctionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnFunctionClause(@NotNull Vtl2Parser.AnFunctionClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#viralAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViralAttribute(@NotNull Vtl2Parser.ViralAttributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#dropClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropClause(@NotNull Vtl2Parser.DropClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#subscriptExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptExpr(@NotNull Vtl2Parser.SubscriptExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#ruleItemDatapoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleItemDatapoint(@NotNull Vtl2Parser.RuleItemDatapointContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#castExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpr(@NotNull Vtl2Parser.CastExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#instrAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrAtom(@NotNull Vtl2Parser.InstrAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull Vtl2Parser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#validationSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidationSimple(@NotNull Vtl2Parser.ValidationSimpleContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#groupKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupKeyword(@NotNull Vtl2Parser.GroupKeywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#isNullAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNullAtom(@NotNull Vtl2Parser.IsNullAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#joinAggClauseItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinAggClauseItem(@NotNull Vtl2Parser.JoinAggClauseItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#getFiltersClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetFiltersClause(@NotNull Vtl2Parser.GetFiltersClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#ceilAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCeilAtom(@NotNull Vtl2Parser.CeilAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#dropClauseItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropClauseItem(@NotNull Vtl2Parser.DropClauseItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#timeSeriesExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeSeriesExpr(@NotNull Vtl2Parser.TimeSeriesExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull Vtl2Parser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#partitionByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionByClause(@NotNull Vtl2Parser.PartitionByClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#ruleClauseDatapoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleClauseDatapoint(@NotNull Vtl2Parser.RuleClauseDatapointContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull Vtl2Parser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#calcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcExpr(@NotNull Vtl2Parser.CalcExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#windowingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowingClause(@NotNull Vtl2Parser.WindowingClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#substrAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstrAtom(@NotNull Vtl2Parser.SubstrAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#scalarSetType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarSetType(@NotNull Vtl2Parser.ScalarSetTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#ruleItemHierarchical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleItemHierarchical(@NotNull Vtl2Parser.RuleItemHierarchicalContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#logAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogAtom(@NotNull Vtl2Parser.LogAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#rulesetID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulesetID(@NotNull Vtl2Parser.RulesetIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#optionalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalExpr(@NotNull Vtl2Parser.OptionalExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#keepClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeepClause(@NotNull Vtl2Parser.KeepClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#componentID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentID(@NotNull Vtl2Parser.ComponentIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#codeItemRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeItemRef(@NotNull Vtl2Parser.CodeItemRefContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#hrRuleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHrRuleset(@NotNull Vtl2Parser.HrRulesetContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#defineDataStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineDataStructure(@NotNull Vtl2Parser.DefineDataStructureContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#aggrFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrFunctionName(@NotNull Vtl2Parser.AggrFunctionNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull Vtl2Parser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#betweenAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenAtom(@NotNull Vtl2Parser.BetweenAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#expAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAtom(@NotNull Vtl2Parser.ExpAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(@NotNull Vtl2Parser.JoinClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#aggrInvocationCompExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrInvocationCompExpr(@NotNull Vtl2Parser.AggrInvocationCompExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#joinCalcClauseItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCalcClauseItem(@NotNull Vtl2Parser.JoinCalcClauseItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#compConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompConstraint(@NotNull Vtl2Parser.CompConstraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#basicScalarType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicScalarType(@NotNull Vtl2Parser.BasicScalarTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#calcClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcClause(@NotNull Vtl2Parser.CalcClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#joinExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinExpression(@NotNull Vtl2Parser.JoinExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#evalExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalExprAtom(@NotNull Vtl2Parser.EvalExprAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#aggrFunctionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrFunctionClause(@NotNull Vtl2Parser.AggrFunctionClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#datasetID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatasetID(@NotNull Vtl2Parser.DatasetIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#erCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErCode(@NotNull Vtl2Parser.ErCodeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(@NotNull Vtl2Parser.CommentContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#operatorType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorType(@NotNull Vtl2Parser.OperatorTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#codeItemRelationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeItemRelationClause(@NotNull Vtl2Parser.CodeItemRelationClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#operatorID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorID(@NotNull Vtl2Parser.OperatorIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link Vtl2Parser#varSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSignature(@NotNull Vtl2Parser.VarSignatureContext ctx);
}