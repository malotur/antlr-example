// Generated from org\sqtds\antlr4\vtl\Vtl.g4 by ANTLR 4.2.2
package org.sqtds.antlr4.vtl;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VtlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VtlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VtlParser#setrule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetrule(@NotNull VtlParser.SetruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#betweenRowsClauseItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenRowsClauseItem(@NotNull VtlParser.BetweenRowsClauseItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#calcClauseItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcClauseItem(@NotNull VtlParser.CalcClauseItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#aggrFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrFunction(@NotNull VtlParser.AggrFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#typeAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAtom(@NotNull VtlParser.TypeAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#exprExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprExists(@NotNull VtlParser.ExprExistsContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#procedureCallBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureCallBody(@NotNull VtlParser.ProcedureCallBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#defDataset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefDataset(@NotNull VtlParser.DefDatasetContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#refAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefAtom(@NotNull VtlParser.RefAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#indexofAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexofAtom(@NotNull VtlParser.IndexofAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#validationDatapoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidationDatapoint(@NotNull VtlParser.ValidationDatapointContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(@NotNull VtlParser.OrderByClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#defineDatapointRuleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineDatapointRuleset(@NotNull VtlParser.DefineDatapointRulesetContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#ruleClauseHierarchical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleClauseHierarchical(@NotNull VtlParser.RuleClauseHierarchicalContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#joinRenameArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRenameArgList(@NotNull VtlParser.JoinRenameArgListContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#joinRenameArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRenameArg(@NotNull VtlParser.JoinRenameArgContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#setruleList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetruleList(@NotNull VtlParser.SetruleListContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#setMemberList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetMemberList(@NotNull VtlParser.SetMemberListContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#elseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseExpr(@NotNull VtlParser.ElseExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#varID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarID(@NotNull VtlParser.VarIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#procedureInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureInput(@NotNull VtlParser.ProcedureInputContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#defDatapoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefDatapoint(@NotNull VtlParser.DefDatapointContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#aggrParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrParam(@NotNull VtlParser.AggrParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#ruleID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleID(@NotNull VtlParser.RuleIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#sqrtAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrtAtom(@NotNull VtlParser.SqrtAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#anFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnFunction(@NotNull VtlParser.AnFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#ltrimAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtrimAtom(@NotNull VtlParser.LtrimAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#stockToFlowAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStockToFlowAtom(@NotNull VtlParser.StockToFlowAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#datasetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatasetClause(@NotNull VtlParser.DatasetClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#rulesetSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulesetSignature(@NotNull VtlParser.RulesetSignatureContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#hierarchyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchyExpr(@NotNull VtlParser.HierarchyExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#setExprListRestricted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExprListRestricted(@NotNull VtlParser.SetExprListRestrictedContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#joinKeepClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinKeepClause(@NotNull VtlParser.JoinKeepClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#exprCompIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCompIn(@NotNull VtlParser.ExprCompInContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#joinExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinExpr(@NotNull VtlParser.JoinExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#roundAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundAtom(@NotNull VtlParser.RoundAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(@NotNull VtlParser.ArgContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#exprAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(@NotNull VtlParser.ExprAndContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#ifExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(@NotNull VtlParser.IfExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause(@NotNull VtlParser.ClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#logBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogBase(@NotNull VtlParser.LogBaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#modAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModAtom(@NotNull VtlParser.ModAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#filterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterClause(@NotNull VtlParser.FilterClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#ruleItemMapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleItemMapping(@NotNull VtlParser.RuleItemMappingContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#elseIfExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfExpr(@NotNull VtlParser.ElseIfExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#joinFoldClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinFoldClause(@NotNull VtlParser.JoinFoldClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#mappingExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingExpr(@NotNull VtlParser.MappingExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#flowToStockAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlowToStockAtom(@NotNull VtlParser.FlowToStockAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#dataset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset(@NotNull VtlParser.DatasetContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#persistentDatasetID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPersistentDatasetID(@NotNull VtlParser.PersistentDatasetIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#intersectAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersectAtom(@NotNull VtlParser.IntersectAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#dimClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimClause(@NotNull VtlParser.DimClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#joinCalcClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCalcClause(@NotNull VtlParser.JoinCalcClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#listofCompList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListofCompList(@NotNull VtlParser.ListofCompListContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#componentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentList(@NotNull VtlParser.ComponentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#booleanC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanC(@NotNull VtlParser.BooleanCContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#charsetMatchAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetMatchAtom(@NotNull VtlParser.CharsetMatchAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#exprMultiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultiply(@NotNull VtlParser.ExprMultiplyContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#maxAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxAtom(@NotNull VtlParser.MaxAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#returnAll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnAll(@NotNull VtlParser.ReturnAllContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#attrCalcClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrCalcClause(@NotNull VtlParser.AttrCalcClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#ucaseAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUcaseAtom(@NotNull VtlParser.UcaseAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#endHierarchicalRuleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndHierarchicalRuleset(@NotNull VtlParser.EndHierarchicalRulesetContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#hierarchyExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchyExprAtom(@NotNull VtlParser.HierarchyExprAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#varIDList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIDList(@NotNull VtlParser.VarIDListContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#floorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloorAtom(@NotNull VtlParser.FloorAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#joinDropClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinDropClause(@NotNull VtlParser.JoinDropClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#procedureInputList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureInputList(@NotNull VtlParser.ProcedureInputListContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#keepClauseItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeepClauseItem(@NotNull VtlParser.KeepClauseItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#strExprParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrExprParam(@NotNull VtlParser.StrExprParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#lenAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLenAtom(@NotNull VtlParser.LenAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#exprEq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEq(@NotNull VtlParser.ExprEqContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#codeItemRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeItemRelation(@NotNull VtlParser.CodeItemRelationContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#nrootAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNrootAtom(@NotNull VtlParser.NrootAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(@NotNull VtlParser.ListContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#joinFilterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinFilterClause(@NotNull VtlParser.JoinFilterClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#defineHierarchicalRuleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineHierarchicalRuleset(@NotNull VtlParser.DefineHierarchicalRulesetContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#setExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExprAtom(@NotNull VtlParser.SetExprAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#renameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameClause(@NotNull VtlParser.RenameClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#functionID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionID(@NotNull VtlParser.FunctionIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#mapItemClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapItemClause(@NotNull VtlParser.MapItemClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#exprFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFactor(@NotNull VtlParser.ExprFactorContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#sumExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumExprAtom(@NotNull VtlParser.SumExprAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#dimensionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionType(@NotNull VtlParser.DimensionTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#ruleItemDatapoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleItemDatapoint(@NotNull VtlParser.RuleItemDatapointContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#roleID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleID(@NotNull VtlParser.RoleIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#exprConcatExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprConcatExpr(@NotNull VtlParser.ExprConcatExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#instrAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrAtom(@NotNull VtlParser.InstrAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#renameArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameArg(@NotNull VtlParser.RenameArgContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#aggregategetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregategetClause(@NotNull VtlParser.AggregategetClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#unionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionAtom(@NotNull VtlParser.UnionAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#rulesetBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulesetBody(@NotNull VtlParser.RulesetBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#concatExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatExpr(@NotNull VtlParser.ConcatExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#dedupClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDedupClause(@NotNull VtlParser.DedupClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#timeSeriesExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeSeriesExpr(@NotNull VtlParser.TimeSeriesExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#putExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutExprAtom(@NotNull VtlParser.PutExprAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull VtlParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#diffAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiffAtom(@NotNull VtlParser.DiffAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#partitionByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionByClause(@NotNull VtlParser.PartitionByClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#numberC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberC(@NotNull VtlParser.NumberCContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#mapTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapTo(@NotNull VtlParser.MapToContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#calcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcExpr(@NotNull VtlParser.CalcExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#substrAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstrAtom(@NotNull VtlParser.SubstrAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#logAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogAtom(@NotNull VtlParser.LogAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#anyAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyAtom(@NotNull VtlParser.AnyAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull VtlParser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#negIntegerC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegIntegerC(@NotNull VtlParser.NegIntegerCContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#expAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAtom(@NotNull VtlParser.ExpAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#calcClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcClause(@NotNull VtlParser.CalcClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#dataStructureItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStructureItem(@NotNull VtlParser.DataStructureItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#aggrFunctionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrFunctionClause(@NotNull VtlParser.AggrFunctionClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#erCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErCode(@NotNull VtlParser.ErCodeContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(@NotNull VtlParser.CommentContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#mapFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapFrom(@NotNull VtlParser.MapFromContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#joinRenameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRenameClause(@NotNull VtlParser.JoinRenameClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#compareClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareClause(@NotNull VtlParser.CompareClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#timeShiftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeShiftExpr(@NotNull VtlParser.TimeShiftExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#allAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllAtom(@NotNull VtlParser.AllAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#defValueDomainSubset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefValueDomainSubset(@NotNull VtlParser.DefValueDomainSubsetContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#getExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetExpr(@NotNull VtlParser.GetExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#lcaseAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcaseAtom(@NotNull VtlParser.LcaseAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#parenthesisExprRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExprRef(@NotNull VtlParser.ParenthesisExprRefContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#exprFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFunctionCall(@NotNull VtlParser.ExprFunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#mappingID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingID(@NotNull VtlParser.MappingIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#exprValidationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprValidationExpr(@NotNull VtlParser.ExprValidationExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#getFilterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetFilterClause(@NotNull VtlParser.GetFilterClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#alterExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExpr(@NotNull VtlParser.AlterExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#joinUnfoldClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinUnfoldClause(@NotNull VtlParser.JoinUnfoldClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#validationHierarchical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidationHierarchical(@NotNull VtlParser.ValidationHierarchicalContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull VtlParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#aggregateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateClause(@NotNull VtlParser.AggregateClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#dimensionTypeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionTypeClause(@NotNull VtlParser.DimensionTypeClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#numberClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberClause(@NotNull VtlParser.NumberClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#exprCountAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCountAtom(@NotNull VtlParser.ExprCountAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#evalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalExpr(@NotNull VtlParser.EvalExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#setExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExpr(@NotNull VtlParser.SetExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#integerC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerC(@NotNull VtlParser.IntegerCContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#defFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefFunction(@NotNull VtlParser.DefFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#putExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutExpr(@NotNull VtlParser.PutExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#rulesetArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulesetArg(@NotNull VtlParser.RulesetArgContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#defProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefProcedure(@NotNull VtlParser.DefProcedureContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#procedureArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureArg(@NotNull VtlParser.ProcedureArgContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#validationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidationExpr(@NotNull VtlParser.ValidationExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#ifThenElseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseExpr(@NotNull VtlParser.IfThenElseExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#trimAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimAtom(@NotNull VtlParser.TrimAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#inAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInAtom(@NotNull VtlParser.InAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#ruleClauseMapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleClauseMapping(@NotNull VtlParser.RuleClauseMappingContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#dateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateClause(@NotNull VtlParser.DateClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#listsumAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListsumAtom(@NotNull VtlParser.ListsumAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#datasetAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatasetAlias(@NotNull VtlParser.DatasetAliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#nvlAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNvlAtom(@NotNull VtlParser.NvlAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#rtrimAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRtrimAtom(@NotNull VtlParser.RtrimAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#varIdRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIdRef(@NotNull VtlParser.VarIdRefContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#defVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefVariable(@NotNull VtlParser.DefVariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#floatC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatC(@NotNull VtlParser.FloatCContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#inBetweenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInBetweenClause(@NotNull VtlParser.InBetweenClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#exprCompBetween}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCompBetween(@NotNull VtlParser.ExprCompBetweenContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#valueDomainList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueDomainList(@NotNull VtlParser.ValueDomainListContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#exprIfExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIfExpr(@NotNull VtlParser.ExprIfExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#validationExprContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidationExprContent(@NotNull VtlParser.ValidationExprContentContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#erLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErLevel(@NotNull VtlParser.ErLevelContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#defDataStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefDataStructure(@NotNull VtlParser.DefDataStructureContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#charLengthAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLengthAtom(@NotNull VtlParser.CharLengthAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#procedureBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureBody(@NotNull VtlParser.ProcedureBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#returnAgg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnAgg(@NotNull VtlParser.ReturnAggContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#validationValueDoman}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidationValueDoman(@NotNull VtlParser.ValidationValueDomanContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#dataStructureClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStructureClause(@NotNull VtlParser.DataStructureClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#defineMapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineMapping(@NotNull VtlParser.DefineMappingContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#hierRuleSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierRuleSignature(@NotNull VtlParser.HierRuleSignatureContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#defHierarchical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefHierarchical(@NotNull VtlParser.DefHierarchicalContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#codeListClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeListClause(@NotNull VtlParser.CodeListClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#transcodeExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranscodeExprAtom(@NotNull VtlParser.TranscodeExprAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#getExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetExprAtom(@NotNull VtlParser.GetExprAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(@NotNull VtlParser.ArgListContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#antecedentItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAntecedentItem(@NotNull VtlParser.AntecedentItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#transcodeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranscodeExpr(@NotNull VtlParser.TranscodeExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#exprOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOrExpr(@NotNull VtlParser.ExprOrExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull VtlParser.ConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#stringC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringC(@NotNull VtlParser.StringCContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#defMapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefMapping(@NotNull VtlParser.DefMappingContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#missingAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingAtom(@NotNull VtlParser.MissingAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#joinBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinBody(@NotNull VtlParser.JoinBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#conditionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionClause(@NotNull VtlParser.ConditionClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#lnAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLnAtom(@NotNull VtlParser.LnAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#uniqueAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueAtom(@NotNull VtlParser.UniqueAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#procedureID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureID(@NotNull VtlParser.ProcedureIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#aggrClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrClause(@NotNull VtlParser.AggrClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#exprOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr(@NotNull VtlParser.ExprOrContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#setMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetMember(@NotNull VtlParser.SetMemberContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#exprAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdd(@NotNull VtlParser.ExprAddContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#endDatapointRuleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndDatapointRuleset(@NotNull VtlParser.EndDatapointRulesetContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#setMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetMembers(@NotNull VtlParser.SetMembersContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#date_from_stringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_from_stringAtom(@NotNull VtlParser.Date_from_stringAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#currentDateAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentDateAtom(@NotNull VtlParser.CurrentDateAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#valueDomainID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueDomainID(@NotNull VtlParser.ValueDomainIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#exponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponent(@NotNull VtlParser.ExponentContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#powerAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerAtom(@NotNull VtlParser.PowerAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#minAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinAtom(@NotNull VtlParser.MinAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#string_from_dateAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_from_dateAtom(@NotNull VtlParser.String_from_dateAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#setMemberListAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetMemberListAlias(@NotNull VtlParser.SetMemberListAliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#procedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureCall(@NotNull VtlParser.ProcedureCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#procedureArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureArgList(@NotNull VtlParser.ProcedureArgListContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#renameArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameArgList(@NotNull VtlParser.RenameArgListContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#constantRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantRef(@NotNull VtlParser.ConstantRefContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#codelistMatchAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodelistMatchAtom(@NotNull VtlParser.CodelistMatchAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#replaceAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceAtom(@NotNull VtlParser.ReplaceAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#anFunctionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnFunctionClause(@NotNull VtlParser.AnFunctionClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#endMappingRuleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndMappingRuleset(@NotNull VtlParser.EndMappingRulesetContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#dropClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropClause(@NotNull VtlParser.DropClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#subscriptExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptExpr(@NotNull VtlParser.SubscriptExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#hierarchyInputParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchyInputParameters(@NotNull VtlParser.HierarchyInputParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull VtlParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#isNullAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNullAtom(@NotNull VtlParser.IsNullAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#listRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListRef(@NotNull VtlParser.ListRefContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#restrictClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestrictClause(@NotNull VtlParser.RestrictClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#getFiltersClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetFiltersClause(@NotNull VtlParser.GetFiltersClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#exprMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMember(@NotNull VtlParser.ExprMemberContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#ceilAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCeilAtom(@NotNull VtlParser.CeilAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#dropClauseItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropClauseItem(@NotNull VtlParser.DropClauseItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#notInAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotInAtom(@NotNull VtlParser.NotInAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#nullC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullC(@NotNull VtlParser.NullCContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#ruleClauseDatapoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleClauseDatapoint(@NotNull VtlParser.RuleClauseDatapointContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#dataTypeRestrictionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeRestrictionClause(@NotNull VtlParser.DataTypeRestrictionClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#windowingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowingClause(@NotNull VtlParser.WindowingClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#ruleItemHierarchical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleItemHierarchical(@NotNull VtlParser.RuleItemHierarchicalContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#rulesetID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulesetID(@NotNull VtlParser.RulesetIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#exprComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprComp(@NotNull VtlParser.ExprCompContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#keepClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeepClause(@NotNull VtlParser.KeepClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#componentID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentID(@NotNull VtlParser.ComponentIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#transcodeInputParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranscodeInputParameters(@NotNull VtlParser.TranscodeInputParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#codeItemRelationSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeItemRelationSignature(@NotNull VtlParser.CodeItemRelationSignatureContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#codeItemRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeItemRef(@NotNull VtlParser.CodeItemRefContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#defValueDomain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefValueDomain(@NotNull VtlParser.DefValueDomainContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#dedupList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDedupList(@NotNull VtlParser.DedupListContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#stringClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringClause(@NotNull VtlParser.StringClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(@NotNull VtlParser.JoinClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#rulesetArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulesetArgList(@NotNull VtlParser.RulesetArgListContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#extractAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractAtom(@NotNull VtlParser.ExtractAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#func_depAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_depAtom(@NotNull VtlParser.Func_depAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#joinAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinAtom(@NotNull VtlParser.JoinAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#evalExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalExprAtom(@NotNull VtlParser.EvalExprAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#codeItemRelationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeItemRelationClause(@NotNull VtlParser.CodeItemRelationClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#putInputParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutInputParameters(@NotNull VtlParser.PutInputParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#datasetList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatasetList(@NotNull VtlParser.DatasetListContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#exprExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprExprAtom(@NotNull VtlParser.ExprExprAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link VtlParser#varSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSignature(@NotNull VtlParser.VarSignatureContext ctx);
}