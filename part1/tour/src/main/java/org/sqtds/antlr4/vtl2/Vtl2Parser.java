// Generated from org\sqtds\antlr4\vtl2\Vtl2.g4 by ANTLR 4.2.2
package org.sqtds.antlr4.vtl2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Vtl2Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, ASSIGN=19, MEMBERSHIP=20, EVAL=21, IF=22, THEN=23, ELSE=24, 
		USING=25, WITH=26, CURRENT_DATE=27, ON=28, DROP=29, KEEP=30, CALC=31, 
		ATTRCALC=32, RENAME=33, AS=34, AND=35, OR=36, XOR=37, NOT=38, BETWEEN=39, 
		IN=40, NOT_IN=41, ISNULL=42, EX=43, UNION=44, DIFF=45, SYMDIFF=46, INTERSECT=47, 
		KEYS=48, CARTESIAN_PER=49, INTYEAR=50, INTMONTH=51, INTDAY=52, CHECK=53, 
		EXISTS_IN=54, TO=55, RETURN=56, IMBALANCE=57, ERRORCODE=58, ALL=59, AGGREGATE=60, 
		ERRORLEVEL=61, ORDER=62, BY=63, RANK=64, ASC=65, DESC=66, MIN=67, MAX=68, 
		FIRST=69, LAST=70, INDEXOF=71, ABS=72, KEY=73, LN=74, LOG=75, TRUNC=76, 
		ROUND=77, POWER=78, MOD=79, LEN=80, CONCAT=81, TRIM=82, UCASE=83, LCASE=84, 
		SUBSTR=85, SUM=86, AVG=87, MEDIAN=88, COUNT=89, DIMENSION=90, MEASURE=91, 
		ATTRIBUTE=92, FILTER=93, MERGE=94, EXP=95, ROLE=96, VIRAL=97, CHARSET_MATCH=98, 
		TYPE=99, NVL=100, HIERARCHY=101, OPTIONAL=102, INVALID=103, VALUE_DOMAIN=104, 
		VARIABLE=105, DATA=106, STRUCTURE=107, DATASET=108, OPERATOR=109, DEFINE=110, 
		PUT_SYMBOL=111, DATAPOINT=112, HIERARCHICAL=113, RULESET=114, RULE=115, 
		END=116, ALTER_DATASET=117, LTRIM=118, RTRIM=119, INSTR=120, REPLACE=121, 
		CEIL=122, FLOOR=123, SQRT=124, ANY=125, SETDIFF=126, STDDEV_POP=127, STDDEV_SAMP=128, 
		VAR_POP=129, VAR_SAMP=130, GROUP=131, EXCEPT=132, HAVING=133, FIRST_VALUE=134, 
		LAST_VALUE=135, LAG=136, LEAD=137, RATIO_TO_REPORT=138, OVER=139, PRECEDING=140, 
		FOLLOWING=141, UNBOUNDED=142, PARTITION=143, ROWS=144, RANGE=145, CURRENT=146, 
		VALID=147, FILL_TIME_SERIES=148, FLOW_TO_STOCK=149, STOCK_TO_FLOW=150, 
		TIMESHIFT=151, MEASURES=152, NO_MEASURES=153, CONDITION=154, BOOLEAN=155, 
		DATE=156, TIME_PERIOD=157, NUMBER=158, STRING=159, INTEGER=160, FLOAT=161, 
		LIST=162, RECORD=163, RESTRICT=164, YYYY=165, MM=166, DD=167, MAX_LENGTH=168, 
		REGEXP=169, IS=170, WHEN=171, FROM=172, AGGREGATES=173, POINTS=174, POINT=175, 
		TOTAL=176, PARTIAL=177, ALWAYS=178, INNER_JOIN=179, LEFT_JOIN=180, CROSS_JOIN=181, 
		FULL_JOIN=182, MAPS_FROM=183, MAPS_TO=184, MAP_TO=185, MAP_FROM=186, RETURNS=187, 
		PIVOT=188, UNPIVOT=189, SUBSPACE=190, APPLY=191, CONDITIONED=192, PERIOD_INDICATOR=193, 
		SINGLE=194, DURATION=195, TIME_AGG=196, UNIT=197, VALUE=198, VALUEDOMAINS=199, 
		VARIABLES=200, INPUT=201, OUTPUT=202, CAST=203, RULE_PRIORITY=204, DATASET_PRIORITY=205, 
		DEFAULT=206, CHECK_DATAPOINT=207, CHECK_HIERARCHY=208, COMPUTED=209, NON_NULL=210, 
		NON_ZERO=211, PARTIAL_NULL=212, PARTIAL_ZERO=213, ALWAYS_NULL=214, ALWAYS_ZERO=215, 
		COMPONENTS=216, ALL_MEASURES=217, SCALAR=218, COMPONENT=219, DATAPOINT_ON_VD=220, 
		DATAPOINT_ON_VAR=221, HIERARCHICAL_ON_VD=222, HIERARCHICAL_ON_VAR=223, 
		SET=224, LANGUAGE=225, INTEGER_CONSTANT=226, POSITIVE_CONSTANT=227, NEGATIVE_CONSTANT=228, 
		FLOAT_CONSTANT=229, BOOLEAN_CONSTANT=230, NULL_CONSTANT=231, STRING_CONSTANT=232, 
		IDENTIFIER=233, DIGITS0_9=234, MONTH=235, DAY=236, YEAR=237, WEEK=238, 
		HOURS=239, MINUTES=240, SECONDS=241, DATE_FORMAT=242, TIME_FORMAT=243, 
		TIME_UNIT=244, TIME=245, WS=246, EOL=247, ML_COMMENT=248, SL_COMMENT=249, 
		COMPARISON_OP=250, FREQUENCY=251, CREATE_FUNCTION=252, DEFINE_PROCEDURE=253, 
		NL=254;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'->'", "':'", "'{'", "'>='", "'['", "'<'", "'}'", 
		"'='", "']'", "'>'", "'<='", "'<>'", "'('", "')'", "'*'", "'+'", "'-'", 
		"':='", "'#'", "'eval'", "'if'", "'then'", "'else'", "'using'", "'with'", 
		"'current_date'", "'on'", "'drop'", "'keep'", "'calc'", "'attrcalc'", 
		"'rename'", "'as'", "'and'", "'or'", "'xor'", "'not'", "'between'", "'in'", 
		"'not_in'", "'isnull'", "'ex'", "'union'", "'diff'", "'symdiff'", "'intersect'", 
		"'keys'", "','", "'intyear'", "'intmonth'", "'intday'", "'check'", "'exists_in'", 
		"'to'", "'return'", "'imbalance'", "'errorcode'", "'all'", "'aggr'", "'errorlevel'", 
		"'order'", "'by'", "'rank'", "'asc'", "'desc'", "'min'", "'max'", "'first'", 
		"'last'", "'indexof'", "'abs'", "'key'", "'ln'", "'log'", "'trunc'", "'round'", 
		"'power'", "'mod'", "'length'", "'||'", "'trim'", "'upper'", "'lower'", 
		"'substr'", "'sum'", "'avg'", "'median'", "'count'", "'identifier'", "'measure'", 
		"'attribute'", "'filter'", "'merge'", "'exp'", "'role'", "'viral'", "'match_characters'", 
		"'type'", "'nvl'", "'hierarchy'", "'_'", "'invalid'", "'valuedomain'", 
		"'variable'", "'data'", "'structure'", "'dataset'", "'operator'", "'define'", 
		"'<-'", "'datapoint'", "'hierarchical'", "'ruleset'", "'rule'", "'end'", 
		"'alterDataset'", "'ltrim'", "'rtrim'", "'instr'", "'replace'", "'ceil'", 
		"'floor'", "'sqrt'", "'any'", "'setdiff'", "'stddev_pop'", "'stddev_samp'", 
		"'var_pop'", "'var_samp'", "'group'", "'except'", "'having'", "'first_value'", 
		"'last_value'", "'lag'", "'lead'", "'ratio_to_report'", "'over'", "'preceding'", 
		"'following'", "'unbounded'", "'partition'", "'rows'", "'range'", "'current'", 
		"'valid'", "'fill_time_series'", "'flow_to_stock'", "'stock_to_flow'", 
		"'timeshift'", "'measures'", "'no_measures'", "'condition'", "'boolean'", 
		"'date'", "'time_period'", "'number'", "'string'", "'integer'", "'float'", 
		"'list'", "'record'", "'restrict'", "'yyyy'", "'mm'", "'dd'", "'maxLength'", 
		"'regexp'", "'is'", "'when'", "'from'", "'aggregates'", "'points'", "'point'", 
		"'total'", "'partial'", "'always'", "'inner_join'", "'left_join'", "'cross_join'", 
		"'full_join'", "'maps_from'", "'maps_to'", "'map_to'", "'map_from'", "'returns'", 
		"'pivot'", "'unpivot'", "'sub'", "'apply'", "'conditioned'", "'period_indicator'", 
		"'single'", "'duration'", "'time_agg'", "'unit'", "'Value'", "'valuedomains'", 
		"'variables'", "'input'", "'output'", "'cast'", "'rule_priority'", "'dataset_priority'", 
		"'default'", "'check_datapoint'", "'check_hierarchy'", "'computed'", "'non_null'", 
		"'non_zero'", "'partial_null'", "'partial_zero'", "'always_null'", "'always_zero'", 
		"'components'", "'all_measures'", "'scalar'", "'component'", "'datapoint_on_valuedomains'", 
		"'datapoint_on_variables'", "'hierarchical_on_valuedomains'", "'hierarchical_on_variables'", 
		"'set'", "'language'", "INTEGER_CONSTANT", "POSITIVE_CONSTANT", "NEGATIVE_CONSTANT", 
		"FLOAT_CONSTANT", "BOOLEAN_CONSTANT", "'null'", "STRING_CONSTANT", "IDENTIFIER", 
		"DIGITS0_9", "MONTH", "DAY", "YEAR", "WEEK", "HOURS", "MINUTES", "SECONDS", 
		"DATE_FORMAT", "TIME_FORMAT", "TIME_UNIT", "TIME", "WS", "';'", "ML_COMMENT", 
		"SL_COMMENT", "COMPARISON_OP", "FREQUENCY", "CREATE_FUNCTION", "DEFINE_PROCEDURE", 
		"NL"
	};
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_persistentAssignment = 2, RULE_optionalExpr = 3, 
		RULE_expr = 4, RULE_exprComplex = 5, RULE_timeExpr = 6, RULE_defHierarchical = 7, 
		RULE_ruleClauseHierarchical = 8, RULE_ruleItemHierarchical = 9, RULE_hierRuleSignature = 10, 
		RULE_valueDomainSignature = 11, RULE_codeItemRelation = 12, RULE_codeItemRelationClause = 13, 
		RULE_codeItemRef = 14, RULE_defDatapoint = 15, RULE_ruleClauseDatapoint = 16, 
		RULE_ruleItemDatapoint = 17, RULE_rulesetSignature = 18, RULE_varSignature = 19, 
		RULE_defExpr = 20, RULE_defOperator = 21, RULE_parameterItem = 22, RULE_callFunction = 23, 
		RULE_exprAtom = 24, RULE_ref = 25, RULE_identifierList = 26, RULE_lists = 27, 
		RULE_evalExpr = 28, RULE_castExpr = 29, RULE_periodExpr = 30, RULE_timeShiftExpr = 31, 
		RULE_timeSeriesExpr = 32, RULE_timeAggExpr = 33, RULE_validationExpr = 34, 
		RULE_validationDatapoint = 35, RULE_validationHierarchical = 36, RULE_erCode = 37, 
		RULE_erLevel = 38, RULE_hierarchyExpr = 39, RULE_datasetClause = 40, RULE_anFunctionClause = 41, 
		RULE_partitionByClause = 42, RULE_orderByClause = 43, RULE_windowingClause = 44, 
		RULE_limitClauseItem = 45, RULE_joinExpr = 46, RULE_joinClause = 47, RULE_joinBody = 48, 
		RULE_joinCalcClause = 49, RULE_joinCalcClauseItem = 50, RULE_joinCalcExpr = 51, 
		RULE_joinAggClause = 52, RULE_joinAggClauseItem = 53, RULE_joinAggExpr = 54, 
		RULE_joinKeepClause = 55, RULE_joinDropClause = 56, RULE_joinFilterClause = 57, 
		RULE_joinRenameClause = 58, RULE_joinApplyClause = 59, RULE_anFunction = 60, 
		RULE_aggregateClause = 61, RULE_aggrFunctionClause = 62, RULE_getFiltersClause = 63, 
		RULE_getFilterClause = 64, RULE_aggrClause = 65, RULE_filterClause = 66, 
		RULE_renameClause = 67, RULE_aggrFunction = 68, RULE_calcClause = 69, 
		RULE_calcClauseItem = 70, RULE_calcExpr = 71, RULE_dropClause = 72, RULE_dropClauseItem = 73, 
		RULE_keepClause = 74, RULE_keepClauseItem = 75, RULE_unpivotExpr = 76, 
		RULE_pivotExpr = 77, RULE_subspaceExpr = 78, RULE_inBetweenClause = 79, 
		RULE_setExpr = 80, RULE_subscriptExpr = 81, RULE_aggrInvocation = 82, 
		RULE_aggrInvocationCompExpr = 83, RULE_aggrFunctionName = 84, RULE_groupingClause = 85, 
		RULE_havingClause = 86, RULE_returnAll = 87, RULE_componentRole = 88, 
		RULE_viralAttribute = 89, RULE_logBase = 90, RULE_exponent = 91, RULE_persistentDatasetID = 92, 
		RULE_datasetID = 93, RULE_rulesetID = 94, RULE_varID = 95, RULE_componentID = 96, 
		RULE_operatorID = 97, RULE_routineName = 98, RULE_joinKeyword = 99, RULE_groupKeyword = 100, 
		RULE_constant = 101, RULE_componentType2 = 102, RULE_scalarType = 103, 
		RULE_basicScalarType = 104, RULE_valueDomainName = 105, RULE_setName = 106, 
		RULE_scalarTypeConstraint = 107, RULE_dataType = 108, RULE_componentType = 109, 
		RULE_datasetType = 110, RULE_compConstraint = 111, RULE_multModifier = 112, 
		RULE_rulesetType = 113, RULE_dpRuleset = 114, RULE_hrRuleset = 115, RULE_prodValueDomains = 116, 
		RULE_prodVariables = 117, RULE_operatorType = 118, RULE_inputParameterType = 119, 
		RULE_outputParameterType = 120, RULE_scalarSetType = 121, RULE_retainType = 122, 
		RULE_defineDatapointRuleset = 123, RULE_defineHierarchicalRuleset = 124, 
		RULE_endDatapointRuleset = 125, RULE_endHierarchicalRuleset = 126, RULE_defineDataStructure = 127, 
		RULE_defFunction = 128, RULE_defProcedure = 129, RULE_procedureBody = 130, 
		RULE_functionID = 131, RULE_procedureID = 132, RULE_argList = 133, RULE_arg = 134, 
		RULE_procedureArgList = 135, RULE_procedureArg = 136, RULE_dimensionType = 137, 
		RULE_statements = 138, RULE_comment = 139;
	public static final String[] ruleNames = {
		"start", "statement", "persistentAssignment", "optionalExpr", "expr", 
		"exprComplex", "timeExpr", "defHierarchical", "ruleClauseHierarchical", 
		"ruleItemHierarchical", "hierRuleSignature", "valueDomainSignature", "codeItemRelation", 
		"codeItemRelationClause", "codeItemRef", "defDatapoint", "ruleClauseDatapoint", 
		"ruleItemDatapoint", "rulesetSignature", "varSignature", "defExpr", "defOperator", 
		"parameterItem", "callFunction", "exprAtom", "ref", "identifierList", 
		"lists", "evalExpr", "castExpr", "periodExpr", "timeShiftExpr", "timeSeriesExpr", 
		"timeAggExpr", "validationExpr", "validationDatapoint", "validationHierarchical", 
		"erCode", "erLevel", "hierarchyExpr", "datasetClause", "anFunctionClause", 
		"partitionByClause", "orderByClause", "windowingClause", "limitClauseItem", 
		"joinExpr", "joinClause", "joinBody", "joinCalcClause", "joinCalcClauseItem", 
		"joinCalcExpr", "joinAggClause", "joinAggClauseItem", "joinAggExpr", "joinKeepClause", 
		"joinDropClause", "joinFilterClause", "joinRenameClause", "joinApplyClause", 
		"anFunction", "aggregateClause", "aggrFunctionClause", "getFiltersClause", 
		"getFilterClause", "aggrClause", "filterClause", "renameClause", "aggrFunction", 
		"calcClause", "calcClauseItem", "calcExpr", "dropClause", "dropClauseItem", 
		"keepClause", "keepClauseItem", "unpivotExpr", "pivotExpr", "subspaceExpr", 
		"inBetweenClause", "setExpr", "subscriptExpr", "aggrInvocation", "aggrInvocationCompExpr", 
		"aggrFunctionName", "groupingClause", "havingClause", "returnAll", "componentRole", 
		"viralAttribute", "logBase", "exponent", "persistentDatasetID", "datasetID", 
		"rulesetID", "varID", "componentID", "operatorID", "routineName", "joinKeyword", 
		"groupKeyword", "constant", "componentType2", "scalarType", "basicScalarType", 
		"valueDomainName", "setName", "scalarTypeConstraint", "dataType", "componentType", 
		"datasetType", "compConstraint", "multModifier", "rulesetType", "dpRuleset", 
		"hrRuleset", "prodValueDomains", "prodVariables", "operatorType", "inputParameterType", 
		"outputParameterType", "scalarSetType", "retainType", "defineDatapointRuleset", 
		"defineHierarchicalRuleset", "endDatapointRuleset", "endHierarchicalRuleset", 
		"defineDataStructure", "defFunction", "defProcedure", "procedureBody", 
		"functionID", "procedureID", "argList", "arg", "procedureArgList", "procedureArg", 
		"dimensionType", "statements", "comment"
	};

	@Override
	public String getGrammarFileName() { return "Vtl2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Vtl2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode ML_COMMENT(int i) {
			return getToken(Vtl2Parser.ML_COMMENT, i);
		}
		public TerminalNode SL_COMMENT(int i) {
			return getToken(Vtl2Parser.SL_COMMENT, i);
		}
		public List<TerminalNode> EOL() { return getTokens(Vtl2Parser.EOL); }
		public TerminalNode EOF() { return getToken(Vtl2Parser.EOF, 0); }
		public List<TerminalNode> ML_COMMENT() { return getTokens(Vtl2Parser.ML_COMMENT); }
		public TerminalNode EOL(int i) {
			return getToken(Vtl2Parser.EOL, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<TerminalNode> SL_COMMENT() { return getTokens(Vtl2Parser.SL_COMMENT); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			int _alt;
			setState(307);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(281);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << 17) | (1L << 18) | (1L << EVAL) | (1L << IF) | (1L << CURRENT_DATE) | (1L << NOT) | (1L << BETWEEN) | (1L << ISNULL) | (1L << UNION) | (1L << SYMDIFF) | (1L << INTERSECT) | (1L << CHECK) | (1L << EXISTS_IN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANK - 64)) | (1L << (MIN - 64)) | (1L << (MAX - 64)) | (1L << (ABS - 64)) | (1L << (LN - 64)) | (1L << (LOG - 64)) | (1L << (TRUNC - 64)) | (1L << (ROUND - 64)) | (1L << (POWER - 64)) | (1L << (MOD - 64)) | (1L << (LEN - 64)) | (1L << (TRIM - 64)) | (1L << (UCASE - 64)) | (1L << (LCASE - 64)) | (1L << (SUBSTR - 64)) | (1L << (SUM - 64)) | (1L << (AVG - 64)) | (1L << (MEDIAN - 64)) | (1L << (COUNT - 64)) | (1L << (EXP - 64)) | (1L << (CHARSET_MATCH - 64)) | (1L << (NVL - 64)) | (1L << (HIERARCHY - 64)) | (1L << (DEFINE - 64)) | (1L << (LTRIM - 64)) | (1L << (RTRIM - 64)) | (1L << (INSTR - 64)) | (1L << (REPLACE - 64)) | (1L << (CEIL - 64)) | (1L << (FLOOR - 64)) | (1L << (SQRT - 64)) | (1L << (SETDIFF - 64)) | (1L << (STDDEV_POP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (STDDEV_SAMP - 128)) | (1L << (VAR_POP - 128)) | (1L << (VAR_SAMP - 128)) | (1L << (FIRST_VALUE - 128)) | (1L << (LAST_VALUE - 128)) | (1L << (LAG - 128)) | (1L << (LEAD - 128)) | (1L << (RATIO_TO_REPORT - 128)) | (1L << (FILL_TIME_SERIES - 128)) | (1L << (FLOW_TO_STOCK - 128)) | (1L << (STOCK_TO_FLOW - 128)) | (1L << (TIMESHIFT - 128)) | (1L << (INNER_JOIN - 128)) | (1L << (LEFT_JOIN - 128)) | (1L << (CROSS_JOIN - 128)) | (1L << (FULL_JOIN - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (PERIOD_INDICATOR - 193)) | (1L << (TIME_AGG - 193)) | (1L << (CAST - 193)) | (1L << (CHECK_DATAPOINT - 193)) | (1L << (CHECK_HIERARCHY - 193)) | (1L << (INTEGER_CONSTANT - 193)) | (1L << (FLOAT_CONSTANT - 193)) | (1L << (BOOLEAN_CONSTANT - 193)) | (1L << (NULL_CONSTANT - 193)) | (1L << (STRING_CONSTANT - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (CREATE_FUNCTION - 193)))) != 0)) {
							{
							setState(280); statement();
							}
						}

						setState(286);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==ML_COMMENT) {
							{
							{
							setState(283); match(ML_COMMENT);
							}
							}
							setState(288);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(292);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SL_COMMENT) {
							{
							{
							setState(289); match(SL_COMMENT);
							}
							}
							setState(294);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(295); match(EOL);
						}
						} 
					}
					setState(300);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(302);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << 17) | (1L << 18) | (1L << EVAL) | (1L << IF) | (1L << CURRENT_DATE) | (1L << NOT) | (1L << BETWEEN) | (1L << ISNULL) | (1L << UNION) | (1L << SYMDIFF) | (1L << INTERSECT) | (1L << CHECK) | (1L << EXISTS_IN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANK - 64)) | (1L << (MIN - 64)) | (1L << (MAX - 64)) | (1L << (ABS - 64)) | (1L << (LN - 64)) | (1L << (LOG - 64)) | (1L << (TRUNC - 64)) | (1L << (ROUND - 64)) | (1L << (POWER - 64)) | (1L << (MOD - 64)) | (1L << (LEN - 64)) | (1L << (TRIM - 64)) | (1L << (UCASE - 64)) | (1L << (LCASE - 64)) | (1L << (SUBSTR - 64)) | (1L << (SUM - 64)) | (1L << (AVG - 64)) | (1L << (MEDIAN - 64)) | (1L << (COUNT - 64)) | (1L << (EXP - 64)) | (1L << (CHARSET_MATCH - 64)) | (1L << (NVL - 64)) | (1L << (HIERARCHY - 64)) | (1L << (DEFINE - 64)) | (1L << (LTRIM - 64)) | (1L << (RTRIM - 64)) | (1L << (INSTR - 64)) | (1L << (REPLACE - 64)) | (1L << (CEIL - 64)) | (1L << (FLOOR - 64)) | (1L << (SQRT - 64)) | (1L << (SETDIFF - 64)) | (1L << (STDDEV_POP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (STDDEV_SAMP - 128)) | (1L << (VAR_POP - 128)) | (1L << (VAR_SAMP - 128)) | (1L << (FIRST_VALUE - 128)) | (1L << (LAST_VALUE - 128)) | (1L << (LAG - 128)) | (1L << (LEAD - 128)) | (1L << (RATIO_TO_REPORT - 128)) | (1L << (FILL_TIME_SERIES - 128)) | (1L << (FLOW_TO_STOCK - 128)) | (1L << (STOCK_TO_FLOW - 128)) | (1L << (TIMESHIFT - 128)) | (1L << (INNER_JOIN - 128)) | (1L << (LEFT_JOIN - 128)) | (1L << (CROSS_JOIN - 128)) | (1L << (FULL_JOIN - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (PERIOD_INDICATOR - 193)) | (1L << (TIME_AGG - 193)) | (1L << (CAST - 193)) | (1L << (CHECK_DATAPOINT - 193)) | (1L << (CHECK_HIERARCHY - 193)) | (1L << (INTEGER_CONSTANT - 193)) | (1L << (FLOAT_CONSTANT - 193)) | (1L << (BOOLEAN_CONSTANT - 193)) | (1L << (NULL_CONSTANT - 193)) | (1L << (STRING_CONSTANT - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (CREATE_FUNCTION - 193)))) != 0)) {
					{
					setState(301); statement();
					}
				}

				setState(304); match(EOF);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305); match(ML_COMMENT);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306); match(SL_COMMENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(Vtl2Parser.ASSIGN, 0); }
		public PersistentAssignmentContext persistentAssignment() {
			return getRuleContext(PersistentAssignmentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarIDContext varID() {
			return getRuleContext(VarIDContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(316);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(312);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(309); varID();
					setState(310); match(ASSIGN);
					}
					break;
				}
				setState(314); expr(0);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315); persistentAssignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PersistentAssignmentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarIDContext varID() {
			return getRuleContext(VarIDContext.class,0);
		}
		public TerminalNode PUT_SYMBOL() { return getToken(Vtl2Parser.PUT_SYMBOL, 0); }
		public PersistentAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_persistentAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterPersistentAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitPersistentAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitPersistentAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PersistentAssignmentContext persistentAssignment() throws RecognitionException {
		PersistentAssignmentContext _localctx = new PersistentAssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_persistentAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318); varID();
			setState(319); match(PUT_SYMBOL);
			setState(320); expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OPTIONAL() { return getToken(Vtl2Parser.OPTIONAL, 0); }
		public OptionalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterOptionalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitOptionalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitOptionalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalExprContext optionalExpr() throws RecognitionException {
		OptionalExprContext _localctx = new OptionalExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_optionalExpr);
		try {
			setState(324);
			switch (_input.LA(1)) {
			case 14:
			case 17:
			case 18:
			case EVAL:
			case IF:
			case CURRENT_DATE:
			case NOT:
			case BETWEEN:
			case ISNULL:
			case UNION:
			case SYMDIFF:
			case INTERSECT:
			case CHECK:
			case EXISTS_IN:
			case RANK:
			case MIN:
			case MAX:
			case ABS:
			case LN:
			case LOG:
			case TRUNC:
			case ROUND:
			case POWER:
			case MOD:
			case LEN:
			case TRIM:
			case UCASE:
			case LCASE:
			case SUBSTR:
			case SUM:
			case AVG:
			case MEDIAN:
			case COUNT:
			case EXP:
			case CHARSET_MATCH:
			case NVL:
			case HIERARCHY:
			case DEFINE:
			case LTRIM:
			case RTRIM:
			case INSTR:
			case REPLACE:
			case CEIL:
			case FLOOR:
			case SQRT:
			case SETDIFF:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case FIRST_VALUE:
			case LAST_VALUE:
			case LAG:
			case LEAD:
			case RATIO_TO_REPORT:
			case FILL_TIME_SERIES:
			case FLOW_TO_STOCK:
			case STOCK_TO_FLOW:
			case TIMESHIFT:
			case INNER_JOIN:
			case LEFT_JOIN:
			case CROSS_JOIN:
			case FULL_JOIN:
			case PERIOD_INDICATOR:
			case TIME_AGG:
			case CAST:
			case CHECK_DATAPOINT:
			case CHECK_HIERARCHY:
			case INTEGER_CONSTANT:
			case FLOAT_CONSTANT:
			case BOOLEAN_CONSTANT:
			case NULL_CONSTANT:
			case STRING_CONSTANT:
			case IDENTIFIER:
			case CREATE_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(322); expr(0);
				}
				break;
			case OPTIONAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(323); match(OPTIONAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(Vtl2Parser.ELSE, 0); }
		public TerminalNode IF() { return getToken(Vtl2Parser.IF, 0); }
		public TerminalNode XOR() { return getToken(Vtl2Parser.XOR, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT_IN() { return getToken(Vtl2Parser.NOT_IN, 0); }
		public ListsContext lists() {
			return getRuleContext(ListsContext.class,0);
		}
		public RetainTypeContext retainType() {
			return getRuleContext(RetainTypeContext.class,0);
		}
		public TerminalNode ALL() { return getToken(Vtl2Parser.ALL, 0); }
		public TerminalNode NOT() { return getToken(Vtl2Parser.NOT, 0); }
		public TerminalNode ASSIGN(int i) {
			return getToken(Vtl2Parser.ASSIGN, i);
		}
		public TerminalNode EXISTS_IN() { return getToken(Vtl2Parser.EXISTS_IN, 0); }
		public TerminalNode AND() { return getToken(Vtl2Parser.AND, 0); }
		public TerminalNode THEN() { return getToken(Vtl2Parser.THEN, 0); }
		public ExprComplexContext exprComplex() {
			return getRuleContext(ExprComplexContext.class,0);
		}
		public DatasetClauseContext datasetClause(int i) {
			return getRuleContext(DatasetClauseContext.class,i);
		}
		public ExprAtomContext exprAtom() {
			return getRuleContext(ExprAtomContext.class,0);
		}
		public TerminalNode OR() { return getToken(Vtl2Parser.OR, 0); }
		public TerminalNode CONCAT() { return getToken(Vtl2Parser.CONCAT, 0); }
		public TerminalNode IN() { return getToken(Vtl2Parser.IN, 0); }
		public TerminalNode MEMBERSHIP() { return getToken(Vtl2Parser.MEMBERSHIP, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(Vtl2Parser.ASSIGN); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ComponentIDContext componentID() {
			return getRuleContext(ComponentIDContext.class,0);
		}
		public List<DatasetClauseContext> datasetClause() {
			return getRuleContexts(DatasetClauseContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(327);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 17) | (1L << 18) | (1L << NOT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(328); expr(16);
				}
				break;

			case 2:
				{
				setState(329); exprAtom();
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(330); match(6);
						setState(336);
						switch (_input.LA(1)) {
						case DROP:
						case KEEP:
						case CALC:
						case RENAME:
						case AGGREGATE:
						case FILTER:
						case PIVOT:
						case UNPIVOT:
						case SUBSPACE:
							{
							setState(331); datasetClause();
							}
							break;
						case 14:
						case 17:
						case 18:
						case EVAL:
						case IF:
						case CURRENT_DATE:
						case NOT:
						case BETWEEN:
						case ISNULL:
						case UNION:
						case SYMDIFF:
						case INTERSECT:
						case CHECK:
						case EXISTS_IN:
						case RANK:
						case MIN:
						case MAX:
						case ABS:
						case LN:
						case LOG:
						case TRUNC:
						case ROUND:
						case POWER:
						case MOD:
						case LEN:
						case TRIM:
						case UCASE:
						case LCASE:
						case SUBSTR:
						case SUM:
						case AVG:
						case MEDIAN:
						case COUNT:
						case EXP:
						case CHARSET_MATCH:
						case NVL:
						case HIERARCHY:
						case DEFINE:
						case LTRIM:
						case RTRIM:
						case INSTR:
						case REPLACE:
						case CEIL:
						case FLOOR:
						case SQRT:
						case SETDIFF:
						case STDDEV_POP:
						case STDDEV_SAMP:
						case VAR_POP:
						case VAR_SAMP:
						case FIRST_VALUE:
						case LAST_VALUE:
						case LAG:
						case LEAD:
						case RATIO_TO_REPORT:
						case FILL_TIME_SERIES:
						case FLOW_TO_STOCK:
						case STOCK_TO_FLOW:
						case TIMESHIFT:
						case INNER_JOIN:
						case LEFT_JOIN:
						case CROSS_JOIN:
						case FULL_JOIN:
						case PERIOD_INDICATOR:
						case TIME_AGG:
						case CAST:
						case CHECK_DATAPOINT:
						case CHECK_HIERARCHY:
						case INTEGER_CONSTANT:
						case FLOAT_CONSTANT:
						case BOOLEAN_CONSTANT:
						case NULL_CONSTANT:
						case STRING_CONSTANT:
						case IDENTIFIER:
						case CREATE_FUNCTION:
							{
							{
							setState(332); expr(0);
							setState(333); match(ASSIGN);
							setState(334); expr(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(338); match(10);
						}
						} 
					}
					setState(344);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(347);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(345); match(MEMBERSHIP);
					setState(346); componentID();
					}
					break;
				}
				}
				break;

			case 3:
				{
				setState(349); match(EXISTS_IN);
				setState(350); match(14);
				setState(351); expr(0);
				setState(352); match(CARTESIAN_PER);
				setState(353); expr(0);
				setState(356);
				_la = _input.LA(1);
				if (_la==CARTESIAN_PER) {
					{
					setState(354); match(CARTESIAN_PER);
					setState(355); retainType();
					}
				}

				setState(358); match(15);
				}
				break;

			case 4:
				{
				setState(360); match(IF);
				setState(361); expr(0);
				setState(362); match(THEN);
				setState(363); expr(0);
				setState(364); match(ELSE);
				setState(365); expr(0);
				}
				break;

			case 5:
				{
				setState(367); exprComplex();
				}
				break;

			case 6:
				{
				setState(368); exprAtom();
				}
				break;

			case 7:
				{
				setState(369); constant();
				}
				break;

			case 8:
				{
				setState(370); match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(406);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(373);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(374);
						_la = _input.LA(1);
						if ( !(_la==1 || _la==16) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(375); expr(16);
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(376);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(377);
						_la = _input.LA(1);
						if ( !(_la==17 || _la==18) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(378); expr(15);
						}
						break;

					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(379);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(380);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 9) | (1L << 11) | (1L << 12) | (1L << 13))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(381); expr(14);
						}
						break;

					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(382);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(383);
						_la = _input.LA(1);
						if ( !(_la==9 || _la==13) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(384); expr(10);
						}
						break;

					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(385);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(386); match(AND);
						setState(387); expr(9);
						}
						break;

					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(388);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(389);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==XOR) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(390); expr(8);
						}
						break;

					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(391);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(392); match(CONCAT);
						setState(393); expr(4);
						}
						break;

					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(394);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(395);
						_la = _input.LA(1);
						if ( !(_la==IN || _la==NOT_IN) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(398);
						switch (_input.LA(1)) {
						case 4:
						case 14:
							{
							setState(396); lists();
							}
							break;
						case IDENTIFIER:
							{
							setState(397); match(IDENTIFIER);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;

					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(400);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(401); match(EXISTS_IN);
						setState(402); expr(0);
						setState(404);
						switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
						case 1:
							{
							setState(403); match(ALL);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprComplexContext extends ParserRuleContext {
		public ExprComplexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprComplex; }
	 
		public ExprComplexContext() { }
		public void copyFrom(ExprComplexContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleaggregateFunctionsContext extends ExprComplexContext {
		public AggrFunctionContext aggrFunction() {
			return getRuleContext(AggrFunctionContext.class,0);
		}
		public SimpleaggregateFunctionsContext(ExprComplexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterSimpleaggregateFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitSimpleaggregateFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitSimpleaggregateFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StandaloneAggregateFunctionContext extends ExprComplexContext {
		public AggrInvocationContext aggrInvocation() {
			return getRuleContext(AggrInvocationContext.class,0);
		}
		public StandaloneAggregateFunctionContext(ExprComplexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterStandaloneAggregateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitStandaloneAggregateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitStandaloneAggregateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefineFunctionContext extends ExprComplexContext {
		public DefFunctionContext defFunction() {
			return getRuleContext(DefFunctionContext.class,0);
		}
		public DefineFunctionContext(ExprComplexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterDefineFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitDefineFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitDefineFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefinitionExpressionsContext extends ExprComplexContext {
		public DefExprContext defExpr() {
			return getRuleContext(DefExprContext.class,0);
		}
		public DefinitionExpressionsContext(ExprComplexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterDefinitionExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitDefinitionExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitDefinitionExpressions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeexpressionsContext extends ExprComplexContext {
		public TimeExprContext timeExpr() {
			return getRuleContext(TimeExprContext.class,0);
		}
		public TimeexpressionsContext(ExprComplexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterTimeexpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitTimeexpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitTimeexpressions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinExpressionContext extends ExprComplexContext {
		public JoinExprContext joinExpr() {
			return getRuleContext(JoinExprContext.class,0);
		}
		public JoinExpressionContext(ExprComplexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterJoinExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitJoinExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitJoinExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallFunctionExpressionContext extends ExprComplexContext {
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public CallFunctionExpressionContext(ExprComplexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterCallFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitCallFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitCallFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprValidationExprContext extends ExprComplexContext {
		public ValidationExprContext validationExpr() {
			return getRuleContext(ValidationExprContext.class,0);
		}
		public ExprValidationExprContext(ExprComplexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterExprValidationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitExprValidationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitExprValidationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StandaloneAnalyticFunctionContext extends ExprComplexContext {
		public AnFunctionClauseContext anFunctionClause() {
			return getRuleContext(AnFunctionClauseContext.class,0);
		}
		public StandaloneAnalyticFunctionContext(ExprComplexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterStandaloneAnalyticFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitStandaloneAnalyticFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitStandaloneAnalyticFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComponentExpressionwithAggrClauseContext extends ExprComplexContext {
		public AggrInvocationCompExprContext aggrInvocationCompExpr() {
			return getRuleContext(AggrInvocationCompExprContext.class,0);
		}
		public ComponentExpressionwithAggrClauseContext(ExprComplexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterComponentExpressionwithAggrClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitComponentExpressionwithAggrClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitComponentExpressionwithAggrClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetExpressionsContext extends ExprComplexContext {
		public SetExprContext setExpr() {
			return getRuleContext(SetExprContext.class,0);
		}
		public SetExpressionsContext(ExprComplexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterSetExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitSetExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitSetExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprComplexContext exprComplex() throws RecognitionException {
		ExprComplexContext _localctx = new ExprComplexContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exprComplex);
		try {
			setState(422);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ExprValidationExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(411); validationExpr();
				}
				break;

			case 2:
				_localctx = new DefinitionExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(412); defExpr();
				}
				break;

			case 3:
				_localctx = new StandaloneAggregateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(413); aggrInvocation();
				}
				break;

			case 4:
				_localctx = new ComponentExpressionwithAggrClauseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(414); aggrInvocationCompExpr();
				}
				break;

			case 5:
				_localctx = new StandaloneAnalyticFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(415); anFunctionClause();
				}
				break;

			case 6:
				_localctx = new SimpleaggregateFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(416); aggrFunction();
				}
				break;

			case 7:
				_localctx = new TimeexpressionsContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(417); timeExpr();
				}
				break;

			case 8:
				_localctx = new SetExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(418); setExpr();
				}
				break;

			case 9:
				_localctx = new CallFunctionExpressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(419); callFunction();
				}
				break;

			case 10:
				_localctx = new JoinExpressionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(420); joinExpr();
				}
				break;

			case 11:
				_localctx = new DefineFunctionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(421); defFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeExprContext extends ParserRuleContext {
		public Token opComp;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CURRENT_DATE() { return getToken(Vtl2Parser.CURRENT_DATE, 0); }
		public TimeSeriesExprContext timeSeriesExpr() {
			return getRuleContext(TimeSeriesExprContext.class,0);
		}
		public TimeShiftExprContext timeShiftExpr() {
			return getRuleContext(TimeShiftExprContext.class,0);
		}
		public TimeAggExprContext timeAggExpr() {
			return getRuleContext(TimeAggExprContext.class,0);
		}
		public PeriodExprContext periodExpr() {
			return getRuleContext(PeriodExprContext.class,0);
		}
		public TimeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterTimeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitTimeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitTimeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeExprContext timeExpr() throws RecognitionException {
		TimeExprContext _localctx = new TimeExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_timeExpr);
		int _la;
		try {
			setState(433);
			switch (_input.LA(1)) {
			case FILL_TIME_SERIES:
				enterOuterAlt(_localctx, 1);
				{
				setState(424); timeSeriesExpr();
				}
				break;
			case PERIOD_INDICATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(425); periodExpr();
				setState(428);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(426);
					((TimeExprContext)_localctx).opComp = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 9) | (1L << 11) | (1L << 12) | (1L << 13))) != 0)) ) {
						((TimeExprContext)_localctx).opComp = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(427); expr(0);
					}
					break;
				}
				}
				break;
			case TIMESHIFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(430); timeShiftExpr();
				}
				break;
			case TIME_AGG:
				enterOuterAlt(_localctx, 4);
				{
				setState(431); timeAggExpr();
				}
				break;
			case CURRENT_DATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(432); match(CURRENT_DATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefHierarchicalContext extends ParserRuleContext {
		public RuleClauseHierarchicalContext ruleClauseHierarchical() {
			return getRuleContext(RuleClauseHierarchicalContext.class,0);
		}
		public HierRuleSignatureContext hierRuleSignature() {
			return getRuleContext(HierRuleSignatureContext.class,0);
		}
		public TerminalNode IS() { return getToken(Vtl2Parser.IS, 0); }
		public EndHierarchicalRulesetContext endHierarchicalRuleset() {
			return getRuleContext(EndHierarchicalRulesetContext.class,0);
		}
		public RulesetIDContext rulesetID() {
			return getRuleContext(RulesetIDContext.class,0);
		}
		public DefineHierarchicalRulesetContext defineHierarchicalRuleset() {
			return getRuleContext(DefineHierarchicalRulesetContext.class,0);
		}
		public DefHierarchicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defHierarchical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterDefHierarchical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitDefHierarchical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitDefHierarchical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefHierarchicalContext defHierarchical() throws RecognitionException {
		DefHierarchicalContext _localctx = new DefHierarchicalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defHierarchical);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); defineHierarchicalRuleset();
			setState(436); rulesetID();
			setState(437); match(14);
			setState(438); hierRuleSignature();
			setState(439); match(15);
			setState(440); match(IS);
			setState(441); ruleClauseHierarchical();
			setState(442); endHierarchicalRuleset();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleClauseHierarchicalContext extends ParserRuleContext {
		public List<RuleItemHierarchicalContext> ruleItemHierarchical() {
			return getRuleContexts(RuleItemHierarchicalContext.class);
		}
		public RuleItemHierarchicalContext ruleItemHierarchical(int i) {
			return getRuleContext(RuleItemHierarchicalContext.class,i);
		}
		public RuleClauseHierarchicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleClauseHierarchical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterRuleClauseHierarchical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitRuleClauseHierarchical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitRuleClauseHierarchical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleClauseHierarchicalContext ruleClauseHierarchical() throws RecognitionException {
		RuleClauseHierarchicalContext _localctx = new RuleClauseHierarchicalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ruleClauseHierarchical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444); ruleItemHierarchical();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(445); match(EOL);
				setState(446); ruleItemHierarchical();
				}
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleItemHierarchicalContext extends ParserRuleContext {
		public ErLevelContext erLevel() {
			return getRuleContext(ErLevelContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public CodeItemRelationContext codeItemRelation() {
			return getRuleContext(CodeItemRelationContext.class,0);
		}
		public ErCodeContext erCode() {
			return getRuleContext(ErCodeContext.class,0);
		}
		public RuleItemHierarchicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleItemHierarchical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterRuleItemHierarchical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitRuleItemHierarchical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitRuleItemHierarchical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleItemHierarchicalContext ruleItemHierarchical() throws RecognitionException {
		RuleItemHierarchicalContext _localctx = new RuleItemHierarchicalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ruleItemHierarchical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(452); match(IDENTIFIER);
				setState(453); match(3);
				}
				break;
			}
			setState(456); codeItemRelation();
			setState(458);
			_la = _input.LA(1);
			if (_la==ERRORCODE) {
				{
				setState(457); erCode();
				}
			}

			setState(461);
			_la = _input.LA(1);
			if (_la==ERRORLEVEL) {
				{
				setState(460); erLevel();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HierRuleSignatureContext extends ParserRuleContext {
		public TerminalNode RULE() { return getToken(Vtl2Parser.RULE, 0); }
		public ValueDomainSignatureContext valueDomainSignature() {
			return getRuleContext(ValueDomainSignatureContext.class,0);
		}
		public TerminalNode VALUE_DOMAIN() { return getToken(Vtl2Parser.VALUE_DOMAIN, 0); }
		public TerminalNode VARIABLE() { return getToken(Vtl2Parser.VARIABLE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public HierRuleSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hierRuleSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterHierRuleSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitHierRuleSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitHierRuleSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HierRuleSignatureContext hierRuleSignature() throws RecognitionException {
		HierRuleSignatureContext _localctx = new HierRuleSignatureContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_hierRuleSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_la = _input.LA(1);
			if ( !(_la==VALUE_DOMAIN || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(465);
			_la = _input.LA(1);
			if (_la==CONDITION) {
				{
				setState(464); valueDomainSignature();
				}
			}

			setState(467); match(RULE);
			setState(468); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueDomainSignatureContext extends ParserRuleContext {
		public TerminalNode AS(int i) {
			return getToken(Vtl2Parser.AS, i);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Vtl2Parser.IDENTIFIER, i);
		}
		public TerminalNode CONDITION() { return getToken(Vtl2Parser.CONDITION, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Vtl2Parser.IDENTIFIER); }
		public List<TerminalNode> AS() { return getTokens(Vtl2Parser.AS); }
		public ValueDomainSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueDomainSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterValueDomainSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitValueDomainSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitValueDomainSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueDomainSignatureContext valueDomainSignature() throws RecognitionException {
		ValueDomainSignatureContext _localctx = new ValueDomainSignatureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valueDomainSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470); match(CONDITION);
			setState(471); match(IDENTIFIER);
			setState(474);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(472); match(AS);
				setState(473); match(IDENTIFIER);
				}
			}

			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(476); match(CARTESIAN_PER);
				setState(477); match(IDENTIFIER);
				setState(480);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(478); match(AS);
					setState(479); match(IDENTIFIER);
					}
				}

				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeItemRelationContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(Vtl2Parser.THEN, 0); }
		public CodeItemRefContext codeItemRef() {
			return getRuleContext(CodeItemRefContext.class,0);
		}
		public List<CodeItemRelationClauseContext> codeItemRelationClause() {
			return getRuleContexts(CodeItemRelationClauseContext.class);
		}
		public TerminalNode WHEN() { return getToken(Vtl2Parser.WHEN, 0); }
		public CodeItemRelationClauseContext codeItemRelationClause(int i) {
			return getRuleContext(CodeItemRelationClauseContext.class,i);
		}
		public CodeItemRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeItemRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterCodeItemRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitCodeItemRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitCodeItemRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeItemRelationContext codeItemRelation() throws RecognitionException {
		CodeItemRelationContext _localctx = new CodeItemRelationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_codeItemRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(487); match(WHEN);
				setState(488); expr(0);
				setState(489); match(THEN);
				}
			}

			setState(493); codeItemRef();
			setState(494); codeItemRelationClause();
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==17 || _la==18 || _la==IDENTIFIER) {
				{
				{
				setState(495); codeItemRelationClause();
				}
				}
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeItemRelationClauseContext extends ParserRuleContext {
		public Token opAdd;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public CodeItemRelationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeItemRelationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterCodeItemRelationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitCodeItemRelationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitCodeItemRelationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeItemRelationClauseContext codeItemRelationClause() throws RecognitionException {
		CodeItemRelationClauseContext _localctx = new CodeItemRelationClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_codeItemRelationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_la = _input.LA(1);
			if (_la==17 || _la==18) {
				{
				setState(501);
				((CodeItemRelationClauseContext)_localctx).opAdd = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==17 || _la==18) ) {
					((CodeItemRelationClauseContext)_localctx).opAdd = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(504); match(IDENTIFIER);
			setState(509);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(505); match(6);
				setState(506); expr(0);
				setState(507); match(10);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeItemRefContext extends ParserRuleContext {
		public Token opComp;
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public CodeItemRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeItemRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterCodeItemRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitCodeItemRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitCodeItemRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeItemRefContext codeItemRef() throws RecognitionException {
		CodeItemRefContext _localctx = new CodeItemRefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_codeItemRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511); match(IDENTIFIER);
			setState(513);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 9) | (1L << 11) | (1L << 12))) != 0)) {
				{
				setState(512);
				((CodeItemRefContext)_localctx).opComp = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 9) | (1L << 11) | (1L << 12))) != 0)) ) {
					((CodeItemRefContext)_localctx).opComp = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefDatapointContext extends ParserRuleContext {
		public DefineDatapointRulesetContext defineDatapointRuleset() {
			return getRuleContext(DefineDatapointRulesetContext.class,0);
		}
		public TerminalNode IS() { return getToken(Vtl2Parser.IS, 0); }
		public RulesetSignatureContext rulesetSignature() {
			return getRuleContext(RulesetSignatureContext.class,0);
		}
		public RulesetIDContext rulesetID() {
			return getRuleContext(RulesetIDContext.class,0);
		}
		public RuleClauseDatapointContext ruleClauseDatapoint() {
			return getRuleContext(RuleClauseDatapointContext.class,0);
		}
		public EndDatapointRulesetContext endDatapointRuleset() {
			return getRuleContext(EndDatapointRulesetContext.class,0);
		}
		public DefDatapointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defDatapoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterDefDatapoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitDefDatapoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitDefDatapoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefDatapointContext defDatapoint() throws RecognitionException {
		DefDatapointContext _localctx = new DefDatapointContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_defDatapoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515); defineDatapointRuleset();
			setState(516); rulesetID();
			setState(517); match(14);
			setState(518); rulesetSignature();
			setState(519); match(15);
			setState(520); match(IS);
			setState(521); ruleClauseDatapoint();
			setState(522); endDatapointRuleset();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleClauseDatapointContext extends ParserRuleContext {
		public RuleItemDatapointContext ruleItemDatapoint(int i) {
			return getRuleContext(RuleItemDatapointContext.class,i);
		}
		public List<RuleItemDatapointContext> ruleItemDatapoint() {
			return getRuleContexts(RuleItemDatapointContext.class);
		}
		public RuleClauseDatapointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleClauseDatapoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterRuleClauseDatapoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitRuleClauseDatapoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitRuleClauseDatapoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleClauseDatapointContext ruleClauseDatapoint() throws RecognitionException {
		RuleClauseDatapointContext _localctx = new RuleClauseDatapointContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ruleClauseDatapoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524); ruleItemDatapoint();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(525); match(EOL);
				setState(526); ruleItemDatapoint();
				}
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleItemDatapointContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(Vtl2Parser.THEN, 0); }
		public TerminalNode WHEN() { return getToken(Vtl2Parser.WHEN, 0); }
		public ErLevelContext erLevel() {
			return getRuleContext(ErLevelContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public ErCodeContext erCode() {
			return getRuleContext(ErCodeContext.class,0);
		}
		public RuleItemDatapointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleItemDatapoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterRuleItemDatapoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitRuleItemDatapoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitRuleItemDatapoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleItemDatapointContext ruleItemDatapoint() throws RecognitionException {
		RuleItemDatapointContext _localctx = new RuleItemDatapointContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ruleItemDatapoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(532); match(IDENTIFIER);
				setState(533); match(3);
				}
				break;
			}
			setState(540);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(536); match(WHEN);
				setState(537); expr(0);
				setState(538); match(THEN);
				}
			}

			setState(542); expr(0);
			setState(544);
			_la = _input.LA(1);
			if (_la==ERRORCODE) {
				{
				setState(543); erCode();
				}
			}

			setState(547);
			_la = _input.LA(1);
			if (_la==ERRORLEVEL) {
				{
				setState(546); erLevel();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulesetSignatureContext extends ParserRuleContext {
		public TerminalNode VALUE_DOMAIN() { return getToken(Vtl2Parser.VALUE_DOMAIN, 0); }
		public List<VarSignatureContext> varSignature() {
			return getRuleContexts(VarSignatureContext.class);
		}
		public TerminalNode VARIABLE() { return getToken(Vtl2Parser.VARIABLE, 0); }
		public VarSignatureContext varSignature(int i) {
			return getRuleContext(VarSignatureContext.class,i);
		}
		public RulesetSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulesetSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterRulesetSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitRulesetSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitRulesetSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesetSignatureContext rulesetSignature() throws RecognitionException {
		RulesetSignatureContext _localctx = new RulesetSignatureContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rulesetSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			_la = _input.LA(1);
			if ( !(_la==VALUE_DOMAIN || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(550); varSignature();
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(551); match(CARTESIAN_PER);
				setState(552); varSignature();
				}
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarSignatureContext extends ParserRuleContext {
		public VarIDContext varID() {
			return getRuleContext(VarIDContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public TerminalNode AS() { return getToken(Vtl2Parser.AS, 0); }
		public VarSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterVarSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitVarSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitVarSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSignatureContext varSignature() throws RecognitionException {
		VarSignatureContext _localctx = new VarSignatureContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_varSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558); varID();
			setState(561);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(559); match(AS);
				setState(560); match(IDENTIFIER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefExprContext extends ParserRuleContext {
		public DefHierarchicalContext defHierarchical() {
			return getRuleContext(DefHierarchicalContext.class,0);
		}
		public DefOperatorContext defOperator() {
			return getRuleContext(DefOperatorContext.class,0);
		}
		public DefDatapointContext defDatapoint() {
			return getRuleContext(DefDatapointContext.class,0);
		}
		public DefExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterDefExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitDefExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitDefExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefExprContext defExpr() throws RecognitionException {
		DefExprContext _localctx = new DefExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_defExpr);
		try {
			setState(566);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(563); defOperator();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(564); defDatapoint();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(565); defHierarchical();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefOperatorContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(Vtl2Parser.DEFINE, 0); }
		public TerminalNode IS() { return getToken(Vtl2Parser.IS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OPERATOR(int i) {
			return getToken(Vtl2Parser.OPERATOR, i);
		}
		public List<ParameterItemContext> parameterItem() {
			return getRuleContexts(ParameterItemContext.class);
		}
		public TerminalNode END() { return getToken(Vtl2Parser.END, 0); }
		public TerminalNode RETURNS() { return getToken(Vtl2Parser.RETURNS, 0); }
		public ParameterItemContext parameterItem(int i) {
			return getRuleContext(ParameterItemContext.class,i);
		}
		public List<TerminalNode> OPERATOR() { return getTokens(Vtl2Parser.OPERATOR); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public OperatorIDContext operatorID() {
			return getRuleContext(OperatorIDContext.class,0);
		}
		public DefOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterDefOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitDefOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitDefOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefOperatorContext defOperator() throws RecognitionException {
		DefOperatorContext _localctx = new DefOperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_defOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568); match(DEFINE);
			setState(569); match(OPERATOR);
			setState(570); operatorID();
			setState(571); match(14);
			setState(580);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(572); parameterItem();
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CARTESIAN_PER) {
					{
					{
					setState(573); match(CARTESIAN_PER);
					setState(574); parameterItem();
					}
					}
					setState(579);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(582); match(15);
			setState(585);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(583); match(RETURNS);
				setState(584); dataType();
				}
			}

			setState(587); match(IS);
			setState(588); expr(0);
			setState(589); match(END);
			setState(590); match(OPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterItemContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public VarIDContext varID() {
			return getRuleContext(VarIDContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(Vtl2Parser.DEFAULT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ParameterItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterParameterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitParameterItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitParameterItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterItemContext parameterItem() throws RecognitionException {
		ParameterItemContext _localctx = new ParameterItemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameterItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592); varID();
			setState(593); dataType();
			setState(596);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(594); match(DEFAULT);
				setState(595); constant();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallFunctionContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public OperatorIDContext operatorID(int i) {
			return getRuleContext(OperatorIDContext.class,i);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<OperatorIDContext> operatorID() {
			return getRuleContexts(OperatorIDContext.class);
		}
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_callFunction);
		int _la;
		try {
			setState(638);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(598); operatorID();
				setState(599); match(14);
				setState(614);
				_la = _input.LA(1);
				if (_la==OPTIONAL || ((((_la - 226)) & ~0x3f) == 0 && ((1L << (_la - 226)) & ((1L << (INTEGER_CONSTANT - 226)) | (1L << (FLOAT_CONSTANT - 226)) | (1L << (BOOLEAN_CONSTANT - 226)) | (1L << (NULL_CONSTANT - 226)) | (1L << (STRING_CONSTANT - 226)))) != 0)) {
					{
					setState(602);
					switch (_input.LA(1)) {
					case INTEGER_CONSTANT:
					case FLOAT_CONSTANT:
					case BOOLEAN_CONSTANT:
					case NULL_CONSTANT:
					case STRING_CONSTANT:
						{
						setState(600); constant();
						}
						break;
					case OPTIONAL:
						{
						setState(601); match(OPTIONAL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(611);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==CARTESIAN_PER) {
						{
						{
						setState(604); match(CARTESIAN_PER);
						setState(607);
						switch (_input.LA(1)) {
						case INTEGER_CONSTANT:
						case FLOAT_CONSTANT:
						case BOOLEAN_CONSTANT:
						case NULL_CONSTANT:
						case STRING_CONSTANT:
							{
							setState(605); constant();
							}
							break;
						case OPTIONAL:
							{
							setState(606); match(OPTIONAL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						setState(613);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(616); match(15);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(618); operatorID();
				setState(619); match(14);
				setState(634);
				_la = _input.LA(1);
				if (_la==OPTIONAL || _la==IDENTIFIER) {
					{
					setState(622);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(620); operatorID();
						}
						break;
					case OPTIONAL:
						{
						setState(621); match(OPTIONAL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(631);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==CARTESIAN_PER) {
						{
						{
						setState(624); match(CARTESIAN_PER);
						setState(627);
						switch (_input.LA(1)) {
						case IDENTIFIER:
							{
							setState(625); operatorID();
							}
							break;
						case OPTIONAL:
							{
							setState(626); match(OPTIONAL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						setState(633);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(636); match(15);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprAtomContext extends ParserRuleContext {
		public ExprAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAtom; }
	 
		public ExprAtomContext() { }
		public void copyFrom(ExprAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SqrtAtomContext extends ExprAtomContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SQRT() { return getToken(Vtl2Parser.SQRT, 0); }
		public SqrtAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterSqrtAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitSqrtAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitSqrtAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtrimAtomContext extends ExprAtomContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LTRIM() { return getToken(Vtl2Parser.LTRIM, 0); }
		public LtrimAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterLtrimAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitLtrimAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitLtrimAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StockToFlowAtomContext extends ExprAtomContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STOCK_TO_FLOW() { return getToken(Vtl2Parser.STOCK_TO_FLOW, 0); }
		public StockToFlowAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterStockToFlowAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitStockToFlowAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitStockToFlowAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrimAtomContext extends ExprAtomContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TRIM() { return getToken(Vtl2Parser.TRIM, 0); }
		public TrimAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterTrimAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitTrimAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitTrimAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValidateDPrulesetContext extends ExprAtomContext {
		public ValidationDatapointContext validationDatapoint() {
			return getRuleContext(ValidationDatapointContext.class,0);
		}
		public ValidateDPrulesetContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterValidateDPruleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitValidateDPruleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitValidateDPruleset(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstrAtomContext extends ExprAtomContext {
		public List<OptionalExprContext> optionalExpr() {
			return getRuleContexts(OptionalExprContext.class);
		}
		public TerminalNode INSTR() { return getToken(Vtl2Parser.INSTR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OptionalExprContext optionalExpr(int i) {
			return getRuleContext(OptionalExprContext.class,i);
		}
		public InstrAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterInstrAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitInstrAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitInstrAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharsetMatchAtomContext extends ExprAtomContext {
		public TerminalNode CHARSET_MATCH() { return getToken(Vtl2Parser.CHARSET_MATCH, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CharsetMatchAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterCharsetMatchAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitCharsetMatchAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitCharsetMatchAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LnAtomContext extends ExprAtomContext {
		public OptionalExprContext optionalExpr() {
			return getRuleContext(OptionalExprContext.class,0);
		}
		public TerminalNode TRUNC() { return getToken(Vtl2Parser.TRUNC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LN() { return getToken(Vtl2Parser.LN, 0); }
		public LnAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterLnAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitLnAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitLnAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValidationSimpleContext extends ExprAtomContext {
		public ValidationExprContext validationExpr() {
			return getRuleContext(ValidationExprContext.class,0);
		}
		public ValidationSimpleContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterValidationSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitValidationSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitValidationSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsNullAtomContext extends ExprAtomContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ISNULL() { return getToken(Vtl2Parser.ISNULL, 0); }
		public IsNullAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterIsNullAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitIsNullAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitIsNullAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NvlAtomContext extends ExprAtomContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NVL() { return getToken(Vtl2Parser.NVL, 0); }
		public NvlAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterNvlAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitNvlAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitNvlAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CeilAtomContext extends ExprAtomContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CEIL() { return getToken(Vtl2Parser.CEIL, 0); }
		public CeilAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterCeilAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitCeilAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitCeilAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RtrimAtomContext extends ExprAtomContext {
		public TerminalNode RTRIM() { return getToken(Vtl2Parser.RTRIM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RtrimAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterRtrimAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitRtrimAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitRtrimAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RoundAtomContext extends ExprAtomContext {
		public OptionalExprContext optionalExpr() {
			return getRuleContext(OptionalExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ROUND() { return getToken(Vtl2Parser.ROUND, 0); }
		public RoundAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterRoundAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitRoundAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitRoundAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UcaseAtomContext extends ExprAtomContext {
		public TerminalNode UCASE() { return getToken(Vtl2Parser.UCASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UcaseAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterUcaseAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitUcaseAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitUcaseAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LcaseAtomContext extends ExprAtomContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LCASE() { return getToken(Vtl2Parser.LCASE, 0); }
		public LcaseAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterLcaseAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitLcaseAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitLcaseAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HierarchyExprAtomContext extends ExprAtomContext {
		public HierarchyExprContext hierarchyExpr() {
			return getRuleContext(HierarchyExprContext.class,0);
		}
		public HierarchyExprAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterHierarchyExprAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitHierarchyExprAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitHierarchyExprAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefAtomContext extends ExprAtomContext {
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public RefAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterRefAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitRefAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitRefAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloorAtomContext extends ExprAtomContext {
		public TerminalNode FLOOR() { return getToken(Vtl2Parser.FLOOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FloorAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterFloorAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitFloorAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitFloorAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstrAtomContext extends ExprAtomContext {
		public List<OptionalExprContext> optionalExpr() {
			return getRuleContexts(OptionalExprContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OptionalExprContext optionalExpr(int i) {
			return getRuleContext(OptionalExprContext.class,i);
		}
		public TerminalNode SUBSTR() { return getToken(Vtl2Parser.SUBSTR, 0); }
		public SubstrAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterSubstrAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitSubstrAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitSubstrAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogAtomContext extends ExprAtomContext {
		public TerminalNode LOG() { return getToken(Vtl2Parser.LOG, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LogAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterLogAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitLogAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitLogAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerAtomContext extends ExprAtomContext {
		public TerminalNode POWER() { return getToken(Vtl2Parser.POWER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowerAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterPowerAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitPowerAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitPowerAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LenAtomContext extends ExprAtomContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LEN() { return getToken(Vtl2Parser.LEN, 0); }
		public LenAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterLenAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitLenAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitLenAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinAtomContext extends ExprAtomContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ABS() { return getToken(Vtl2Parser.ABS, 0); }
		public MinAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterMinAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitMinAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitMinAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModAtomContext extends ExprAtomContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(Vtl2Parser.MOD, 0); }
		public ModAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterModAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitModAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitModAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValidateHRrulesetContext extends ExprAtomContext {
		public ValidationHierarchicalContext validationHierarchical() {
			return getRuleContext(ValidationHierarchicalContext.class,0);
		}
		public ValidateHRrulesetContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterValidateHRruleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitValidateHRruleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitValidateHRruleset(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenAtomContext extends ExprAtomContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode BETWEEN() { return getToken(Vtl2Parser.BETWEEN, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BetweenAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterBetweenAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitBetweenAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitBetweenAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpAtomContext extends ExprAtomContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EXP() { return getToken(Vtl2Parser.EXP, 0); }
		public ExpAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterExpAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitExpAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitExpAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EvalExprAtomContext extends ExprAtomContext {
		public EvalExprContext evalExpr() {
			return getRuleContext(EvalExprContext.class,0);
		}
		public EvalExprAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterEvalExprAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitEvalExprAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitEvalExprAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastExprAtomContext extends ExprAtomContext {
		public CastExprContext castExpr() {
			return getRuleContext(CastExprContext.class,0);
		}
		public CastExprAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterCastExprAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitCastExprAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitCastExprAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FlowToStockAtomContext extends ExprAtomContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FLOW_TO_STOCK() { return getToken(Vtl2Parser.FLOW_TO_STOCK, 0); }
		public FlowToStockAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterFlowToStockAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitFlowToStockAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitFlowToStockAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReplaceAtomContext extends ExprAtomContext {
		public OptionalExprContext optionalExpr() {
			return getRuleContext(OptionalExprContext.class,0);
		}
		public TerminalNode REPLACE() { return getToken(Vtl2Parser.REPLACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ReplaceAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterReplaceAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitReplaceAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitReplaceAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAtomContext exprAtom() throws RecognitionException {
		ExprAtomContext _localctx = new ExprAtomContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exprAtom);
		int _la;
		try {
			setState(823);
			switch (_input.LA(1)) {
			case ROUND:
				_localctx = new RoundAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(640); match(ROUND);
				setState(641); match(14);
				setState(642); expr(0);
				setState(645);
				_la = _input.LA(1);
				if (_la==CARTESIAN_PER) {
					{
					setState(643); match(CARTESIAN_PER);
					setState(644); optionalExpr();
					}
				}

				setState(647); match(15);
				}
				break;
			case CEIL:
				_localctx = new CeilAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(649); match(CEIL);
				setState(650); match(14);
				setState(651); expr(0);
				setState(652); match(15);
				}
				break;
			case FLOOR:
				_localctx = new FloorAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(654); match(FLOOR);
				setState(655); match(14);
				setState(656); expr(0);
				setState(657); match(15);
				}
				break;
			case ABS:
				_localctx = new MinAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(659); match(ABS);
				setState(660); match(14);
				setState(661); expr(0);
				setState(662); match(15);
				}
				break;
			case EXP:
				_localctx = new ExpAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(664); match(EXP);
				setState(665); match(14);
				setState(666); expr(0);
				setState(667); match(15);
				}
				break;
			case LN:
				_localctx = new LnAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(669); match(LN);
				setState(670); match(14);
				setState(671); expr(0);
				setState(672); match(15);
				}
				break;
			case LOG:
				_localctx = new LogAtomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(674); match(LOG);
				setState(675); match(14);
				setState(676); expr(0);
				setState(677); match(CARTESIAN_PER);
				setState(678); expr(0);
				setState(679); match(15);
				}
				break;
			case TRUNC:
				_localctx = new LnAtomContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(681); match(TRUNC);
				setState(682); match(14);
				setState(683); expr(0);
				setState(686);
				_la = _input.LA(1);
				if (_la==CARTESIAN_PER) {
					{
					setState(684); match(CARTESIAN_PER);
					setState(685); optionalExpr();
					}
				}

				setState(688); match(15);
				}
				break;
			case POWER:
				_localctx = new PowerAtomContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(690); match(POWER);
				setState(691); match(14);
				setState(692); expr(0);
				setState(693); match(CARTESIAN_PER);
				setState(694); expr(0);
				setState(695); match(15);
				}
				break;
			case SQRT:
				_localctx = new SqrtAtomContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(697); match(SQRT);
				setState(698); match(14);
				setState(699); expr(0);
				setState(700); match(15);
				}
				break;
			case LEN:
				_localctx = new LenAtomContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(702); match(LEN);
				setState(703); match(14);
				setState(704); expr(0);
				setState(705); match(15);
				}
				break;
			case BETWEEN:
				_localctx = new BetweenAtomContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(707); match(BETWEEN);
				setState(708); match(14);
				setState(709); expr(0);
				setState(710); match(CARTESIAN_PER);
				setState(711); expr(0);
				setState(712); match(CARTESIAN_PER);
				setState(713); expr(0);
				setState(714); match(15);
				}
				break;
			case TRIM:
				_localctx = new TrimAtomContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(716); match(TRIM);
				setState(717); match(14);
				setState(718); expr(0);
				setState(719); match(15);
				}
				break;
			case LTRIM:
				_localctx = new LtrimAtomContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(721); match(LTRIM);
				setState(722); match(14);
				setState(723); expr(0);
				setState(724); match(15);
				}
				break;
			case RTRIM:
				_localctx = new RtrimAtomContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(726); match(RTRIM);
				setState(727); match(14);
				setState(728); expr(0);
				setState(729); match(15);
				}
				break;
			case UCASE:
				_localctx = new UcaseAtomContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(731); match(UCASE);
				setState(732); match(14);
				setState(733); expr(0);
				setState(734); match(15);
				}
				break;
			case LCASE:
				_localctx = new LcaseAtomContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(736); match(LCASE);
				setState(737); match(14);
				setState(738); expr(0);
				setState(739); match(15);
				}
				break;
			case SUBSTR:
				_localctx = new SubstrAtomContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(741); match(SUBSTR);
				setState(742); match(14);
				setState(743); expr(0);
				setState(746);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(744); match(CARTESIAN_PER);
					setState(745); optionalExpr();
					}
					break;
				}
				setState(750);
				_la = _input.LA(1);
				if (_la==CARTESIAN_PER) {
					{
					setState(748); match(CARTESIAN_PER);
					setState(749); optionalExpr();
					}
				}

				setState(752); match(15);
				}
				break;
			case INSTR:
				_localctx = new InstrAtomContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(754); match(INSTR);
				setState(755); match(14);
				setState(756); expr(0);
				setState(757); match(CARTESIAN_PER);
				setState(758); expr(0);
				setState(761);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(759); match(CARTESIAN_PER);
					setState(760); optionalExpr();
					}
					break;
				}
				setState(765);
				_la = _input.LA(1);
				if (_la==CARTESIAN_PER) {
					{
					setState(763); match(CARTESIAN_PER);
					setState(764); optionalExpr();
					}
				}

				setState(767); match(15);
				}
				break;
			case REPLACE:
				_localctx = new ReplaceAtomContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(769); match(REPLACE);
				setState(770); match(14);
				setState(771); expr(0);
				setState(772); match(CARTESIAN_PER);
				setState(773); expr(0);
				setState(776);
				_la = _input.LA(1);
				if (_la==CARTESIAN_PER) {
					{
					setState(774); match(CARTESIAN_PER);
					setState(775); optionalExpr();
					}
				}

				setState(778); match(15);
				}
				break;
			case CHARSET_MATCH:
				_localctx = new CharsetMatchAtomContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(780); match(CHARSET_MATCH);
				setState(781); match(14);
				setState(782); expr(0);
				setState(783); match(CARTESIAN_PER);
				setState(784); expr(0);
				setState(785); match(15);
				}
				break;
			case ISNULL:
				_localctx = new IsNullAtomContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(787); match(ISNULL);
				setState(788); match(14);
				setState(789); expr(0);
				setState(790); match(15);
				}
				break;
			case NVL:
				_localctx = new NvlAtomContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(792); match(NVL);
				setState(793); match(14);
				setState(794); expr(0);
				setState(795); match(CARTESIAN_PER);
				setState(796); expr(0);
				setState(797); match(15);
				}
				break;
			case MOD:
				_localctx = new ModAtomContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(799); match(MOD);
				setState(800); match(14);
				setState(801); expr(0);
				setState(802); match(CARTESIAN_PER);
				setState(803); expr(0);
				setState(804); match(15);
				}
				break;
			case 14:
			case INTEGER_CONSTANT:
			case FLOAT_CONSTANT:
			case BOOLEAN_CONSTANT:
			case NULL_CONSTANT:
			case STRING_CONSTANT:
			case IDENTIFIER:
				_localctx = new RefAtomContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(806); ref();
				}
				break;
			case EVAL:
				_localctx = new EvalExprAtomContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(807); evalExpr();
				}
				break;
			case CAST:
				_localctx = new CastExprAtomContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(808); castExpr();
				}
				break;
			case HIERARCHY:
				_localctx = new HierarchyExprAtomContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(809); hierarchyExpr();
				}
				break;
			case FLOW_TO_STOCK:
				_localctx = new FlowToStockAtomContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(810); match(FLOW_TO_STOCK);
				setState(811); match(14);
				setState(812); expr(0);
				setState(813); match(15);
				}
				break;
			case STOCK_TO_FLOW:
				_localctx = new StockToFlowAtomContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(815); match(STOCK_TO_FLOW);
				setState(816); match(14);
				setState(817); expr(0);
				setState(818); match(15);
				}
				break;
			case CHECK_DATAPOINT:
				_localctx = new ValidateDPrulesetContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(820); validationDatapoint();
				}
				break;
			case CHECK_HIERARCHY:
				_localctx = new ValidateHRrulesetContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(821); validationHierarchical();
				}
				break;
			case CHECK:
				_localctx = new ValidationSimpleContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(822); validationExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefContext extends ParserRuleContext {
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
	 
		public RefContext() { }
		public void copyFrom(RefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarIdRefContext extends RefContext {
		public VarIDContext varID() {
			return getRuleContext(VarIDContext.class,0);
		}
		public VarIdRefContext(RefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterVarIdRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitVarIdRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitVarIdRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExprRefContext extends RefContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisExprRefContext(RefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterParenthesisExprRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitParenthesisExprRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitParenthesisExprRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantRefContext extends RefContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantRefContext(RefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterConstantRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitConstantRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitConstantRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ref);
		try {
			setState(831);
			switch (_input.LA(1)) {
			case 14:
				_localctx = new ParenthesisExprRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(825); match(14);
				setState(826); expr(0);
				setState(827); match(15);
				}
				break;
			case IDENTIFIER:
				_localctx = new VarIdRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(829); varID();
				}
				break;
			case INTEGER_CONSTANT:
			case FLOAT_CONSTANT:
			case BOOLEAN_CONSTANT:
			case NULL_CONSTANT:
			case STRING_CONSTANT:
				_localctx = new ConstantRefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(830); constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Vtl2Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Vtl2Parser.IDENTIFIER); }
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833); match(6);
			setState(834); match(IDENTIFIER);
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(835); match(CARTESIAN_PER);
				setState(836); match(IDENTIFIER);
				}
				}
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(842); match(10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListsContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ListsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterLists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitLists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitLists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListsContext lists() throws RecognitionException {
		ListsContext _localctx = new ListsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_lists);
		int _la;
		try {
			setState(866);
			switch (_input.LA(1)) {
			case 4:
				enterOuterAlt(_localctx, 1);
				{
				setState(844); match(4);
				setState(845); constant();
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CARTESIAN_PER) {
					{
					{
					setState(846); match(CARTESIAN_PER);
					setState(847); constant();
					}
					}
					setState(852);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(853); match(8);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 2);
				{
				setState(855); match(14);
				setState(856); constant();
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CARTESIAN_PER) {
					{
					{
					setState(857); match(CARTESIAN_PER);
					setState(858); constant();
					}
					}
					setState(863);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(864); match(15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EvalExprContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public List<ComponentIDContext> componentID() {
			return getRuleContexts(ComponentIDContext.class);
		}
		public TerminalNode STRING_CONSTANT() { return getToken(Vtl2Parser.STRING_CONSTANT, 0); }
		public OutputParameterTypeContext outputParameterType() {
			return getRuleContext(OutputParameterTypeContext.class,0);
		}
		public RoutineNameContext routineName() {
			return getRuleContext(RoutineNameContext.class,0);
		}
		public ComponentIDContext componentID(int i) {
			return getRuleContext(ComponentIDContext.class,i);
		}
		public TerminalNode LANGUAGE() { return getToken(Vtl2Parser.LANGUAGE, 0); }
		public TerminalNode RETURNS() { return getToken(Vtl2Parser.RETURNS, 0); }
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode EVAL() { return getToken(Vtl2Parser.EVAL, 0); }
		public EvalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterEvalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitEvalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitEvalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalExprContext evalExpr() throws RecognitionException {
		EvalExprContext _localctx = new EvalExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_evalExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868); match(EVAL);
			setState(869); match(14);
			setState(870); routineName();
			setState(871); match(14);
			setState(874);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(872); componentID();
				}
				break;
			case INTEGER_CONSTANT:
			case FLOAT_CONSTANT:
			case BOOLEAN_CONSTANT:
			case NULL_CONSTANT:
			case STRING_CONSTANT:
				{
				setState(873); constant();
				}
				break;
			case 15:
			case CARTESIAN_PER:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(876); match(CARTESIAN_PER);
				setState(879);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(877); componentID();
					}
					break;
				case INTEGER_CONSTANT:
				case FLOAT_CONSTANT:
				case BOOLEAN_CONSTANT:
				case NULL_CONSTANT:
				case STRING_CONSTANT:
					{
					setState(878); constant();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(886); match(15);
			setState(889);
			_la = _input.LA(1);
			if (_la==LANGUAGE) {
				{
				setState(887); match(LANGUAGE);
				setState(888); match(STRING_CONSTANT);
				}
			}

			setState(893);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(891); match(RETURNS);
				setState(892); outputParameterType();
				}
			}

			setState(895); match(15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExprContext extends ParserRuleContext {
		public BasicScalarTypeContext basicScalarType() {
			return getRuleContext(BasicScalarTypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING_CONSTANT() { return getToken(Vtl2Parser.STRING_CONSTANT, 0); }
		public ValueDomainNameContext valueDomainName() {
			return getRuleContext(ValueDomainNameContext.class,0);
		}
		public TerminalNode CAST() { return getToken(Vtl2Parser.CAST, 0); }
		public CastExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterCastExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitCastExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExprContext castExpr() throws RecognitionException {
		CastExprContext _localctx = new CastExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_castExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897); match(CAST);
			setState(898); match(14);
			setState(899); expr(0);
			setState(900); match(CARTESIAN_PER);
			setState(903);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case DATE:
			case TIME_PERIOD:
			case NUMBER:
			case STRING:
			case INTEGER:
			case DURATION:
			case SCALAR:
			case TIME:
				{
				setState(901); basicScalarType();
				}
				break;
			case IDENTIFIER:
				{
				setState(902); valueDomainName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(907);
			_la = _input.LA(1);
			if (_la==CARTESIAN_PER) {
				{
				setState(905); match(CARTESIAN_PER);
				setState(906); match(STRING_CONSTANT);
				}
			}

			setState(909); match(15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PeriodExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PERIOD_INDICATOR() { return getToken(Vtl2Parser.PERIOD_INDICATOR, 0); }
		public PeriodExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_periodExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterPeriodExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitPeriodExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitPeriodExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeriodExprContext periodExpr() throws RecognitionException {
		PeriodExprContext _localctx = new PeriodExprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_periodExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911); match(PERIOD_INDICATOR);
			setState(912); match(14);
			setState(914);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << 17) | (1L << 18) | (1L << EVAL) | (1L << IF) | (1L << CURRENT_DATE) | (1L << NOT) | (1L << BETWEEN) | (1L << ISNULL) | (1L << UNION) | (1L << SYMDIFF) | (1L << INTERSECT) | (1L << CHECK) | (1L << EXISTS_IN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANK - 64)) | (1L << (MIN - 64)) | (1L << (MAX - 64)) | (1L << (ABS - 64)) | (1L << (LN - 64)) | (1L << (LOG - 64)) | (1L << (TRUNC - 64)) | (1L << (ROUND - 64)) | (1L << (POWER - 64)) | (1L << (MOD - 64)) | (1L << (LEN - 64)) | (1L << (TRIM - 64)) | (1L << (UCASE - 64)) | (1L << (LCASE - 64)) | (1L << (SUBSTR - 64)) | (1L << (SUM - 64)) | (1L << (AVG - 64)) | (1L << (MEDIAN - 64)) | (1L << (COUNT - 64)) | (1L << (EXP - 64)) | (1L << (CHARSET_MATCH - 64)) | (1L << (NVL - 64)) | (1L << (HIERARCHY - 64)) | (1L << (DEFINE - 64)) | (1L << (LTRIM - 64)) | (1L << (RTRIM - 64)) | (1L << (INSTR - 64)) | (1L << (REPLACE - 64)) | (1L << (CEIL - 64)) | (1L << (FLOOR - 64)) | (1L << (SQRT - 64)) | (1L << (SETDIFF - 64)) | (1L << (STDDEV_POP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (STDDEV_SAMP - 128)) | (1L << (VAR_POP - 128)) | (1L << (VAR_SAMP - 128)) | (1L << (FIRST_VALUE - 128)) | (1L << (LAST_VALUE - 128)) | (1L << (LAG - 128)) | (1L << (LEAD - 128)) | (1L << (RATIO_TO_REPORT - 128)) | (1L << (FILL_TIME_SERIES - 128)) | (1L << (FLOW_TO_STOCK - 128)) | (1L << (STOCK_TO_FLOW - 128)) | (1L << (TIMESHIFT - 128)) | (1L << (INNER_JOIN - 128)) | (1L << (LEFT_JOIN - 128)) | (1L << (CROSS_JOIN - 128)) | (1L << (FULL_JOIN - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (PERIOD_INDICATOR - 193)) | (1L << (TIME_AGG - 193)) | (1L << (CAST - 193)) | (1L << (CHECK_DATAPOINT - 193)) | (1L << (CHECK_HIERARCHY - 193)) | (1L << (INTEGER_CONSTANT - 193)) | (1L << (FLOAT_CONSTANT - 193)) | (1L << (BOOLEAN_CONSTANT - 193)) | (1L << (NULL_CONSTANT - 193)) | (1L << (STRING_CONSTANT - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (CREATE_FUNCTION - 193)))) != 0)) {
				{
				setState(913); expr(0);
				}
			}

			setState(916); match(15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeShiftExprContext extends ParserRuleContext {
		public TerminalNode TIMESHIFT() { return getToken(Vtl2Parser.TIMESHIFT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INTEGER_CONSTANT() { return getToken(Vtl2Parser.INTEGER_CONSTANT, 0); }
		public TimeShiftExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeShiftExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterTimeShiftExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitTimeShiftExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitTimeShiftExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeShiftExprContext timeShiftExpr() throws RecognitionException {
		TimeShiftExprContext _localctx = new TimeShiftExprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_timeShiftExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918); match(TIMESHIFT);
			setState(919); match(14);
			setState(920); expr(0);
			setState(921); match(CARTESIAN_PER);
			setState(922); match(INTEGER_CONSTANT);
			setState(923); match(15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeSeriesExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FILL_TIME_SERIES() { return getToken(Vtl2Parser.FILL_TIME_SERIES, 0); }
		public TerminalNode SINGLE() { return getToken(Vtl2Parser.SINGLE, 0); }
		public TerminalNode ALL() { return getToken(Vtl2Parser.ALL, 0); }
		public TimeSeriesExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeSeriesExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterTimeSeriesExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitTimeSeriesExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitTimeSeriesExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeSeriesExprContext timeSeriesExpr() throws RecognitionException {
		TimeSeriesExprContext _localctx = new TimeSeriesExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_timeSeriesExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925); match(FILL_TIME_SERIES);
			setState(926); match(14);
			setState(927); expr(0);
			setState(930);
			_la = _input.LA(1);
			if (_la==CARTESIAN_PER) {
				{
				setState(928); match(CARTESIAN_PER);
				setState(929);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==SINGLE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(932); match(15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeAggExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> STRING_CONSTANT() { return getTokens(Vtl2Parser.STRING_CONSTANT); }
		public TerminalNode STRING_CONSTANT(int i) {
			return getToken(Vtl2Parser.STRING_CONSTANT, i);
		}
		public TerminalNode FIRST() { return getToken(Vtl2Parser.FIRST, 0); }
		public TerminalNode TIME_AGG() { return getToken(Vtl2Parser.TIME_AGG, 0); }
		public TerminalNode LAST() { return getToken(Vtl2Parser.LAST, 0); }
		public TimeAggExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeAggExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterTimeAggExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitTimeAggExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitTimeAggExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeAggExprContext timeAggExpr() throws RecognitionException {
		TimeAggExprContext _localctx = new TimeAggExprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_timeAggExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934); match(TIME_AGG);
			setState(935); match(14);
			setState(936); match(STRING_CONSTANT);
			setState(939);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(937); match(CARTESIAN_PER);
				setState(938);
				_la = _input.LA(1);
				if ( !(_la==OPTIONAL || _la==STRING_CONSTANT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(946);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(941); match(CARTESIAN_PER);
				setState(944);
				switch (_input.LA(1)) {
				case 14:
				case 17:
				case 18:
				case EVAL:
				case IF:
				case CURRENT_DATE:
				case NOT:
				case BETWEEN:
				case ISNULL:
				case UNION:
				case SYMDIFF:
				case INTERSECT:
				case CHECK:
				case EXISTS_IN:
				case RANK:
				case MIN:
				case MAX:
				case ABS:
				case LN:
				case LOG:
				case TRUNC:
				case ROUND:
				case POWER:
				case MOD:
				case LEN:
				case TRIM:
				case UCASE:
				case LCASE:
				case SUBSTR:
				case SUM:
				case AVG:
				case MEDIAN:
				case COUNT:
				case EXP:
				case CHARSET_MATCH:
				case NVL:
				case HIERARCHY:
				case DEFINE:
				case LTRIM:
				case RTRIM:
				case INSTR:
				case REPLACE:
				case CEIL:
				case FLOOR:
				case SQRT:
				case SETDIFF:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case VAR_POP:
				case VAR_SAMP:
				case FIRST_VALUE:
				case LAST_VALUE:
				case LAG:
				case LEAD:
				case RATIO_TO_REPORT:
				case FILL_TIME_SERIES:
				case FLOW_TO_STOCK:
				case STOCK_TO_FLOW:
				case TIMESHIFT:
				case INNER_JOIN:
				case LEFT_JOIN:
				case CROSS_JOIN:
				case FULL_JOIN:
				case PERIOD_INDICATOR:
				case TIME_AGG:
				case CAST:
				case CHECK_DATAPOINT:
				case CHECK_HIERARCHY:
				case INTEGER_CONSTANT:
				case FLOAT_CONSTANT:
				case BOOLEAN_CONSTANT:
				case NULL_CONSTANT:
				case STRING_CONSTANT:
				case IDENTIFIER:
				case CREATE_FUNCTION:
					{
					setState(942); expr(0);
					}
					break;
				case OPTIONAL:
					{
					setState(943); match(OPTIONAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(950);
			_la = _input.LA(1);
			if (_la==CARTESIAN_PER) {
				{
				setState(948); match(CARTESIAN_PER);
				setState(949);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(952); match(15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValidationExprContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(Vtl2Parser.CHECK, 0); }
		public TerminalNode IMBALANCE() { return getToken(Vtl2Parser.IMBALANCE, 0); }
		public TerminalNode INVALID() { return getToken(Vtl2Parser.INVALID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ErLevelContext erLevel() {
			return getRuleContext(ErLevelContext.class,0);
		}
		public ErCodeContext erCode() {
			return getRuleContext(ErCodeContext.class,0);
		}
		public TerminalNode ALL() { return getToken(Vtl2Parser.ALL, 0); }
		public ValidationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validationExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterValidationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitValidationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitValidationExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidationExprContext validationExpr() throws RecognitionException {
		ValidationExprContext _localctx = new ValidationExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_validationExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954); match(CHECK);
			setState(955); match(14);
			setState(956); expr(0);
			setState(958);
			_la = _input.LA(1);
			if (_la==ERRORCODE) {
				{
				setState(957); erCode();
				}
			}

			setState(961);
			_la = _input.LA(1);
			if (_la==ERRORLEVEL) {
				{
				setState(960); erLevel();
				}
			}

			setState(965);
			_la = _input.LA(1);
			if (_la==IMBALANCE) {
				{
				setState(963); match(IMBALANCE);
				setState(964); expr(0);
				}
			}

			setState(968);
			_la = _input.LA(1);
			if (_la==ALL || _la==INVALID) {
				{
				setState(967);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==INVALID) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(970); match(15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValidationDatapointContext extends ParserRuleContext {
		public TerminalNode INVALID() { return getToken(Vtl2Parser.INVALID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ComponentIDContext> componentID() {
			return getRuleContexts(ComponentIDContext.class);
		}
		public TerminalNode ALL_MEASURES() { return getToken(Vtl2Parser.ALL_MEASURES, 0); }
		public ComponentIDContext componentID(int i) {
			return getRuleContext(ComponentIDContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public TerminalNode COMPONENTS() { return getToken(Vtl2Parser.COMPONENTS, 0); }
		public TerminalNode CHECK_DATAPOINT() { return getToken(Vtl2Parser.CHECK_DATAPOINT, 0); }
		public TerminalNode ALL() { return getToken(Vtl2Parser.ALL, 0); }
		public ValidationDatapointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validationDatapoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterValidationDatapoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitValidationDatapoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitValidationDatapoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidationDatapointContext validationDatapoint() throws RecognitionException {
		ValidationDatapointContext _localctx = new ValidationDatapointContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_validationDatapoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972); match(CHECK_DATAPOINT);
			setState(973); match(14);
			setState(974); expr(0);
			setState(975); match(CARTESIAN_PER);
			setState(976); match(IDENTIFIER);
			setState(986);
			_la = _input.LA(1);
			if (_la==COMPONENTS) {
				{
				setState(977); match(COMPONENTS);
				setState(978); componentID();
				setState(983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CARTESIAN_PER) {
					{
					{
					setState(979); match(CARTESIAN_PER);
					setState(980); componentID();
					}
					}
					setState(985);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(989);
			_la = _input.LA(1);
			if (_la==ALL || _la==INVALID || _la==ALL_MEASURES) {
				{
				setState(988);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==INVALID || _la==ALL_MEASURES) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(991); match(15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValidationHierarchicalContext extends ParserRuleContext {
		public TerminalNode RULE() { return getToken(Vtl2Parser.RULE, 0); }
		public TerminalNode PARTIAL_ZERO() { return getToken(Vtl2Parser.PARTIAL_ZERO, 0); }
		public TerminalNode ALL_MEASURES() { return getToken(Vtl2Parser.ALL_MEASURES, 0); }
		public ComponentIDContext componentID(int i) {
			return getRuleContext(ComponentIDContext.class,i);
		}
		public TerminalNode CONDITION() { return getToken(Vtl2Parser.CONDITION, 0); }
		public TerminalNode CHECK_HIERARCHY() { return getToken(Vtl2Parser.CHECK_HIERARCHY, 0); }
		public TerminalNode NON_NULL() { return getToken(Vtl2Parser.NON_NULL, 0); }
		public TerminalNode PARTIAL_NULL() { return getToken(Vtl2Parser.PARTIAL_NULL, 0); }
		public TerminalNode ALWAYS_ZERO() { return getToken(Vtl2Parser.ALWAYS_ZERO, 0); }
		public TerminalNode DATASET_PRIORITY() { return getToken(Vtl2Parser.DATASET_PRIORITY, 0); }
		public TerminalNode NON_ZERO() { return getToken(Vtl2Parser.NON_ZERO, 0); }
		public TerminalNode DATASET() { return getToken(Vtl2Parser.DATASET, 0); }
		public TerminalNode ALL() { return getToken(Vtl2Parser.ALL, 0); }
		public TerminalNode INVALID() { return getToken(Vtl2Parser.INVALID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ComponentIDContext> componentID() {
			return getRuleContexts(ComponentIDContext.class);
		}
		public TerminalNode ALWAYS_NULL() { return getToken(Vtl2Parser.ALWAYS_NULL, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Vtl2Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Vtl2Parser.IDENTIFIER); }
		public ValidationHierarchicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validationHierarchical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterValidationHierarchical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitValidationHierarchical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitValidationHierarchical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidationHierarchicalContext validationHierarchical() throws RecognitionException {
		ValidationHierarchicalContext _localctx = new ValidationHierarchicalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_validationHierarchical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993); match(CHECK_HIERARCHY);
			setState(994); match(14);
			setState(995); expr(0);
			setState(996); match(CARTESIAN_PER);
			setState(997); match(IDENTIFIER);
			setState(1007);
			_la = _input.LA(1);
			if (_la==CONDITION) {
				{
				setState(998); match(CONDITION);
				setState(999); componentID();
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CARTESIAN_PER) {
					{
					{
					setState(1000); match(CARTESIAN_PER);
					setState(1001); componentID();
					}
					}
					setState(1006);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1011);
			_la = _input.LA(1);
			if (_la==RULE) {
				{
				setState(1009); match(RULE);
				setState(1010); match(IDENTIFIER);
				}
			}

			setState(1014);
			_la = _input.LA(1);
			if (((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & ((1L << (NON_NULL - 210)) | (1L << (NON_ZERO - 210)) | (1L << (PARTIAL_NULL - 210)) | (1L << (PARTIAL_ZERO - 210)) | (1L << (ALWAYS_NULL - 210)) | (1L << (ALWAYS_ZERO - 210)))) != 0)) {
				{
				setState(1013);
				_la = _input.LA(1);
				if ( !(((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & ((1L << (NON_NULL - 210)) | (1L << (NON_ZERO - 210)) | (1L << (PARTIAL_NULL - 210)) | (1L << (PARTIAL_ZERO - 210)) | (1L << (ALWAYS_NULL - 210)) | (1L << (ALWAYS_ZERO - 210)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1017);
			_la = _input.LA(1);
			if (_la==DATASET || _la==DATASET_PRIORITY) {
				{
				setState(1016);
				_la = _input.LA(1);
				if ( !(_la==DATASET || _la==DATASET_PRIORITY) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1020);
			_la = _input.LA(1);
			if (_la==ALL || _la==INVALID || _la==ALL_MEASURES) {
				{
				setState(1019);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==INVALID || _la==ALL_MEASURES) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1022); match(15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErCodeContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode ERRORCODE() { return getToken(Vtl2Parser.ERRORCODE, 0); }
		public ErCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_erCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterErCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitErCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitErCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErCodeContext erCode() throws RecognitionException {
		ErCodeContext _localctx = new ErCodeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_erCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024); match(ERRORCODE);
			setState(1025); constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErLevelContext extends ParserRuleContext {
		public TerminalNode ERRORLEVEL() { return getToken(Vtl2Parser.ERRORLEVEL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ErLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_erLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterErLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitErLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitErLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErLevelContext erLevel() throws RecognitionException {
		ErLevelContext _localctx = new ErLevelContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_erLevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027); match(ERRORLEVEL);
			setState(1028); constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HierarchyExprContext extends ParserRuleContext {
		public List<TerminalNode> RULE() { return getTokens(Vtl2Parser.RULE); }
		public TerminalNode PARTIAL_ZERO() { return getToken(Vtl2Parser.PARTIAL_ZERO, 0); }
		public TerminalNode HIERARCHY() { return getToken(Vtl2Parser.HIERARCHY, 0); }
		public ComponentIDContext componentID(int i) {
			return getRuleContext(ComponentIDContext.class,i);
		}
		public TerminalNode CONDITION() { return getToken(Vtl2Parser.CONDITION, 0); }
		public TerminalNode NON_NULL() { return getToken(Vtl2Parser.NON_NULL, 0); }
		public TerminalNode PARTIAL_NULL() { return getToken(Vtl2Parser.PARTIAL_NULL, 0); }
		public TerminalNode ALWAYS_ZERO() { return getToken(Vtl2Parser.ALWAYS_ZERO, 0); }
		public TerminalNode RULE(int i) {
			return getToken(Vtl2Parser.RULE, i);
		}
		public TerminalNode NON_ZERO() { return getToken(Vtl2Parser.NON_ZERO, 0); }
		public TerminalNode RULE_PRIORITY() { return getToken(Vtl2Parser.RULE_PRIORITY, 0); }
		public TerminalNode COMPUTED() { return getToken(Vtl2Parser.COMPUTED, 0); }
		public TerminalNode DATASET() { return getToken(Vtl2Parser.DATASET, 0); }
		public TerminalNode ALL() { return getToken(Vtl2Parser.ALL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ComponentIDContext> componentID() {
			return getRuleContexts(ComponentIDContext.class);
		}
		public TerminalNode ALWAYS_NULL() { return getToken(Vtl2Parser.ALWAYS_NULL, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Vtl2Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Vtl2Parser.IDENTIFIER); }
		public HierarchyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hierarchyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterHierarchyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitHierarchyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitHierarchyExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HierarchyExprContext hierarchyExpr() throws RecognitionException {
		HierarchyExprContext _localctx = new HierarchyExprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_hierarchyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030); match(HIERARCHY);
			setState(1031); match(14);
			setState(1032); expr(0);
			setState(1033); match(CARTESIAN_PER);
			setState(1034); match(IDENTIFIER);
			setState(1044);
			_la = _input.LA(1);
			if (_la==CONDITION) {
				{
				setState(1035); match(CONDITION);
				setState(1036); componentID();
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CARTESIAN_PER) {
					{
					{
					setState(1037); match(CARTESIAN_PER);
					setState(1038); componentID();
					}
					}
					setState(1043);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1048);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(1046); match(RULE);
				setState(1047); match(IDENTIFIER);
				}
				break;
			}
			setState(1052);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(1050);
				_la = _input.LA(1);
				if ( !(((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & ((1L << (NON_NULL - 210)) | (1L << (NON_ZERO - 210)) | (1L << (PARTIAL_NULL - 210)) | (1L << (PARTIAL_ZERO - 210)) | (1L << (ALWAYS_NULL - 210)) | (1L << (ALWAYS_ZERO - 210)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				{
				setState(1051); match(OPTIONAL);
				}
				break;
			}
			setState(1056);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(1054);
				_la = _input.LA(1);
				if ( !(_la==DATASET || _la==RULE || _la==RULE_PRIORITY) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				{
				setState(1055); match(OPTIONAL);
				}
				break;
			}
			setState(1060);
			switch (_input.LA(1)) {
			case ALL:
			case COMPUTED:
				{
				setState(1058);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==COMPUTED) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case OPTIONAL:
				{
				setState(1059); match(OPTIONAL);
				}
				break;
			case 15:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1062); match(15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatasetClauseContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(Vtl2Parser.RENAME, 0); }
		public DropClauseContext dropClause() {
			return getRuleContext(DropClauseContext.class,0);
		}
		public AggrClauseContext aggrClause() {
			return getRuleContext(AggrClauseContext.class,0);
		}
		public PivotExprContext pivotExpr() {
			return getRuleContext(PivotExprContext.class,0);
		}
		public RenameClauseContext renameClause() {
			return getRuleContext(RenameClauseContext.class,0);
		}
		public CalcClauseContext calcClause() {
			return getRuleContext(CalcClauseContext.class,0);
		}
		public SubspaceExprContext subspaceExpr() {
			return getRuleContext(SubspaceExprContext.class,0);
		}
		public KeepClauseContext keepClause() {
			return getRuleContext(KeepClauseContext.class,0);
		}
		public UnpivotExprContext unpivotExpr() {
			return getRuleContext(UnpivotExprContext.class,0);
		}
		public FilterClauseContext filterClause() {
			return getRuleContext(FilterClauseContext.class,0);
		}
		public DatasetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterDatasetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitDatasetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitDatasetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatasetClauseContext datasetClause() throws RecognitionException {
		DatasetClauseContext _localctx = new DatasetClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_datasetClause);
		try {
			setState(1074);
			switch (_input.LA(1)) {
			case RENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1064); match(RENAME);
				setState(1065); renameClause();
				}
				break;
			case AGGREGATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1066); aggrClause();
				}
				break;
			case FILTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1067); filterClause();
				}
				break;
			case CALC:
				enterOuterAlt(_localctx, 4);
				{
				setState(1068); calcClause();
				}
				break;
			case KEEP:
				enterOuterAlt(_localctx, 5);
				{
				setState(1069); keepClause();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1070); dropClause();
				}
				break;
			case PIVOT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1071); pivotExpr();
				}
				break;
			case UNPIVOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1072); unpivotExpr();
				}
				break;
			case SUBSPACE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1073); subspaceExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnFunctionClauseContext extends ParserRuleContext {
		public AggrFunctionNameContext aggrFunctionName() {
			return getRuleContext(AggrFunctionNameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode OVER() { return getToken(Vtl2Parser.OVER, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public WindowingClauseContext windowingClause() {
			return getRuleContext(WindowingClauseContext.class,0);
		}
		public PartitionByClauseContext partitionByClause() {
			return getRuleContext(PartitionByClauseContext.class,0);
		}
		public AnFunctionContext anFunction() {
			return getRuleContext(AnFunctionContext.class,0);
		}
		public AnFunctionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anFunctionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterAnFunctionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitAnFunctionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitAnFunctionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnFunctionClauseContext anFunctionClause() throws RecognitionException {
		AnFunctionClauseContext _localctx = new AnFunctionClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_anFunctionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			switch (_input.LA(1)) {
			case MIN:
			case MAX:
			case SUM:
			case AVG:
			case MEDIAN:
			case COUNT:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
				{
				setState(1076); aggrFunctionName();
				}
				break;
			case RANK:
			case FIRST_VALUE:
			case LAST_VALUE:
			case LAG:
			case LEAD:
			case RATIO_TO_REPORT:
				{
				setState(1077); anFunction();
				}
				break;
			case 14:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1080); match(14);
			setState(1082);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << 17) | (1L << 18) | (1L << EVAL) | (1L << IF) | (1L << CURRENT_DATE) | (1L << NOT) | (1L << BETWEEN) | (1L << ISNULL) | (1L << UNION) | (1L << SYMDIFF) | (1L << INTERSECT) | (1L << CHECK) | (1L << EXISTS_IN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANK - 64)) | (1L << (MIN - 64)) | (1L << (MAX - 64)) | (1L << (ABS - 64)) | (1L << (LN - 64)) | (1L << (LOG - 64)) | (1L << (TRUNC - 64)) | (1L << (ROUND - 64)) | (1L << (POWER - 64)) | (1L << (MOD - 64)) | (1L << (LEN - 64)) | (1L << (TRIM - 64)) | (1L << (UCASE - 64)) | (1L << (LCASE - 64)) | (1L << (SUBSTR - 64)) | (1L << (SUM - 64)) | (1L << (AVG - 64)) | (1L << (MEDIAN - 64)) | (1L << (COUNT - 64)) | (1L << (EXP - 64)) | (1L << (CHARSET_MATCH - 64)) | (1L << (NVL - 64)) | (1L << (HIERARCHY - 64)) | (1L << (DEFINE - 64)) | (1L << (LTRIM - 64)) | (1L << (RTRIM - 64)) | (1L << (INSTR - 64)) | (1L << (REPLACE - 64)) | (1L << (CEIL - 64)) | (1L << (FLOOR - 64)) | (1L << (SQRT - 64)) | (1L << (SETDIFF - 64)) | (1L << (STDDEV_POP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (STDDEV_SAMP - 128)) | (1L << (VAR_POP - 128)) | (1L << (VAR_SAMP - 128)) | (1L << (FIRST_VALUE - 128)) | (1L << (LAST_VALUE - 128)) | (1L << (LAG - 128)) | (1L << (LEAD - 128)) | (1L << (RATIO_TO_REPORT - 128)) | (1L << (FILL_TIME_SERIES - 128)) | (1L << (FLOW_TO_STOCK - 128)) | (1L << (STOCK_TO_FLOW - 128)) | (1L << (TIMESHIFT - 128)) | (1L << (INNER_JOIN - 128)) | (1L << (LEFT_JOIN - 128)) | (1L << (CROSS_JOIN - 128)) | (1L << (FULL_JOIN - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (PERIOD_INDICATOR - 193)) | (1L << (TIME_AGG - 193)) | (1L << (CAST - 193)) | (1L << (CHECK_DATAPOINT - 193)) | (1L << (CHECK_HIERARCHY - 193)) | (1L << (INTEGER_CONSTANT - 193)) | (1L << (FLOAT_CONSTANT - 193)) | (1L << (BOOLEAN_CONSTANT - 193)) | (1L << (NULL_CONSTANT - 193)) | (1L << (STRING_CONSTANT - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (CREATE_FUNCTION - 193)))) != 0)) {
				{
				setState(1081); expr(0);
				}
			}

			setState(1088);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(1084); match(CARTESIAN_PER);
				setState(1085); expr(0);
				}
				}
				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1091); match(OVER);
			setState(1092); match(14);
			setState(1094);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1093); partitionByClause();
				}
			}

			setState(1097);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1096); orderByClause();
				}
			}

			setState(1100);
			_la = _input.LA(1);
			if (_la==DATA || _la==RANGE) {
				{
				setState(1099); windowingClause();
				}
			}

			setState(1102); match(15);
			setState(1103); match(15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionByClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(Vtl2Parser.PARTITION, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Vtl2Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Vtl2Parser.IDENTIFIER); }
		public TerminalNode BY() { return getToken(Vtl2Parser.BY, 0); }
		public PartitionByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterPartitionByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitPartitionByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitPartitionByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionByClauseContext partitionByClause() throws RecognitionException {
		PartitionByClauseContext _localctx = new PartitionByClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_partitionByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105); match(PARTITION);
			setState(1106); match(BY);
			setState(1107); match(IDENTIFIER);
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(1108); match(CARTESIAN_PER);
				setState(1109); match(IDENTIFIER);
				}
				}
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public List<TerminalNode> ASC() { return getTokens(Vtl2Parser.ASC); }
		public List<ComponentIDContext> componentID() {
			return getRuleContexts(ComponentIDContext.class);
		}
		public TerminalNode ORDER() { return getToken(Vtl2Parser.ORDER, 0); }
		public TerminalNode ASC(int i) {
			return getToken(Vtl2Parser.ASC, i);
		}
		public ComponentIDContext componentID(int i) {
			return getRuleContext(ComponentIDContext.class,i);
		}
		public TerminalNode DESC(int i) {
			return getToken(Vtl2Parser.DESC, i);
		}
		public List<TerminalNode> DESC() { return getTokens(Vtl2Parser.DESC); }
		public TerminalNode BY() { return getToken(Vtl2Parser.BY, 0); }
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115); match(ORDER);
			setState(1116); match(BY);
			setState(1117); componentID();
			setState(1119);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1118);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(1121); match(CARTESIAN_PER);
				setState(1122); componentID();
				setState(1124);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(1123);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				}
				}
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowingClauseContext extends ParserRuleContext {
		public TerminalNode POINTS() { return getToken(Vtl2Parser.POINTS, 0); }
		public TerminalNode RANGE() { return getToken(Vtl2Parser.RANGE, 0); }
		public TerminalNode BETWEEN() { return getToken(Vtl2Parser.BETWEEN, 0); }
		public LimitClauseItemContext limitClauseItem(int i) {
			return getRuleContext(LimitClauseItemContext.class,i);
		}
		public TerminalNode AND() { return getToken(Vtl2Parser.AND, 0); }
		public TerminalNode DATA() { return getToken(Vtl2Parser.DATA, 0); }
		public List<LimitClauseItemContext> limitClauseItem() {
			return getRuleContexts(LimitClauseItemContext.class);
		}
		public WindowingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterWindowingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitWindowingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitWindowingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowingClauseContext windowingClause() throws RecognitionException {
		WindowingClauseContext _localctx = new WindowingClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_windowingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			switch (_input.LA(1)) {
			case DATA:
				{
				{
				setState(1131); match(DATA);
				setState(1132); match(POINTS);
				}
				}
				break;
			case RANGE:
				{
				setState(1133); match(RANGE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1136); match(BETWEEN);
			setState(1137); limitClauseItem();
			setState(1138); match(AND);
			setState(1139); limitClauseItem();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseItemContext extends ParserRuleContext {
		public TerminalNode POINT() { return getToken(Vtl2Parser.POINT, 0); }
		public TerminalNode PRECEDING() { return getToken(Vtl2Parser.PRECEDING, 0); }
		public TerminalNode UNBOUNDED() { return getToken(Vtl2Parser.UNBOUNDED, 0); }
		public TerminalNode CURRENT() { return getToken(Vtl2Parser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(Vtl2Parser.DATA, 0); }
		public TerminalNode INTEGER_CONSTANT() { return getToken(Vtl2Parser.INTEGER_CONSTANT, 0); }
		public TerminalNode FOLLOWING() { return getToken(Vtl2Parser.FOLLOWING, 0); }
		public LimitClauseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClauseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterLimitClauseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitLimitClauseItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitLimitClauseItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseItemContext limitClauseItem() throws RecognitionException {
		LimitClauseItemContext _localctx = new LimitClauseItemContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_limitClauseItem);
		try {
			setState(1152);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1141); match(INTEGER_CONSTANT);
				setState(1142); match(PRECEDING);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1143); match(INTEGER_CONSTANT);
				setState(1144); match(FOLLOWING);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1145); match(CURRENT);
				setState(1146); match(DATA);
				setState(1147); match(POINT);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1148); match(UNBOUNDED);
				setState(1149); match(PRECEDING);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1150); match(UNBOUNDED);
				setState(1151); match(FOLLOWING);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinExprContext extends ParserRuleContext {
		public JoinBodyContext joinBody() {
			return getRuleContext(JoinBodyContext.class,0);
		}
		public JoinKeywordContext joinKeyword() {
			return getRuleContext(JoinKeywordContext.class,0);
		}
		public JoinClauseContext joinClause() {
			return getRuleContext(JoinClauseContext.class,0);
		}
		public JoinExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterJoinExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitJoinExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitJoinExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinExprContext joinExpr() throws RecognitionException {
		JoinExprContext _localctx = new JoinExprContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_joinExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154); joinKeyword();
			setState(1155); match(14);
			setState(1156); joinClause();
			setState(1158);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1157); joinBody();
				}
				break;
			}
			setState(1160); match(15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinClauseContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode AS(int i) {
			return getToken(Vtl2Parser.AS, i);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ComponentIDContext> componentID() {
			return getRuleContexts(ComponentIDContext.class);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Vtl2Parser.IDENTIFIER, i);
		}
		public ComponentIDContext componentID(int i) {
			return getRuleContext(ComponentIDContext.class,i);
		}
		public TerminalNode USING() { return getToken(Vtl2Parser.USING, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Vtl2Parser.IDENTIFIER); }
		public List<TerminalNode> AS() { return getTokens(Vtl2Parser.AS); }
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterJoinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitJoinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_joinClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162); expr(0);
			setState(1165);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1163); match(AS);
				setState(1164); match(IDENTIFIER);
				}
			}

			setState(1175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(1167); match(CARTESIAN_PER);
				setState(1168); expr(0);
				setState(1171);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1169); match(AS);
					setState(1170); match(IDENTIFIER);
					}
				}

				}
				}
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1187);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1178); match(USING);
				setState(1179); componentID();
				setState(1184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CARTESIAN_PER) {
					{
					{
					setState(1180); match(CARTESIAN_PER);
					setState(1181); componentID();
					}
					}
					setState(1186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinBodyContext extends ParserRuleContext {
		public JoinAggClauseContext joinAggClause() {
			return getRuleContext(JoinAggClauseContext.class,0);
		}
		public JoinDropClauseContext joinDropClause() {
			return getRuleContext(JoinDropClauseContext.class,0);
		}
		public JoinRenameClauseContext joinRenameClause() {
			return getRuleContext(JoinRenameClauseContext.class,0);
		}
		public JoinFilterClauseContext joinFilterClause() {
			return getRuleContext(JoinFilterClauseContext.class,0);
		}
		public JoinCalcClauseContext joinCalcClause() {
			return getRuleContext(JoinCalcClauseContext.class,0);
		}
		public JoinKeepClauseContext joinKeepClause() {
			return getRuleContext(JoinKeepClauseContext.class,0);
		}
		public JoinApplyClauseContext joinApplyClause() {
			return getRuleContext(JoinApplyClauseContext.class,0);
		}
		public JoinBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterJoinBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitJoinBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitJoinBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinBodyContext joinBody() throws RecognitionException {
		JoinBodyContext _localctx = new JoinBodyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_joinBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			_la = _input.LA(1);
			if (_la==FILTER || _la==IDENTIFIER) {
				{
				setState(1189); joinFilterClause();
				}
			}

			setState(1195);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1192); joinCalcClause();
				}
				break;

			case 2:
				{
				setState(1193); joinApplyClause();
				}
				break;

			case 3:
				{
				setState(1194); joinAggClause();
				}
				break;
			}
			setState(1199);
			switch (_input.LA(1)) {
			case KEEP:
				{
				setState(1197); joinKeepClause();
				}
				break;
			case DROP:
				{
				setState(1198); joinDropClause();
				}
				break;
			case 15:
			case RENAME:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1202);
			_la = _input.LA(1);
			if (_la==RENAME) {
				{
				setState(1201); joinRenameClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCalcClauseContext extends ParserRuleContext {
		public ComponentRoleContext componentRole() {
			return getRuleContext(ComponentRoleContext.class,0);
		}
		public JoinCalcClauseItemContext joinCalcClauseItem(int i) {
			return getRuleContext(JoinCalcClauseItemContext.class,i);
		}
		public List<JoinCalcClauseItemContext> joinCalcClauseItem() {
			return getRuleContexts(JoinCalcClauseItemContext.class);
		}
		public JoinCalcClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCalcClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterJoinCalcClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitJoinCalcClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitJoinCalcClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCalcClauseContext joinCalcClause() throws RecognitionException {
		JoinCalcClauseContext _localctx = new JoinCalcClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_joinCalcClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			_la = _input.LA(1);
			if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (DIMENSION - 90)) | (1L << (MEASURE - 90)) | (1L << (ATTRIBUTE - 90)) | (1L << (VIRAL - 90)))) != 0) || _la==COMPONENT) {
				{
				setState(1204); componentRole();
				}
			}

			setState(1207); joinCalcClauseItem();
			setState(1212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(1208); match(CARTESIAN_PER);
				setState(1209); joinCalcClauseItem();
				}
				}
				setState(1214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCalcClauseItemContext extends ParserRuleContext {
		public TerminalNode CALC() { return getToken(Vtl2Parser.CALC, 0); }
		public List<JoinCalcExprContext> joinCalcExpr() {
			return getRuleContexts(JoinCalcExprContext.class);
		}
		public JoinCalcExprContext joinCalcExpr(int i) {
			return getRuleContext(JoinCalcExprContext.class,i);
		}
		public List<ComponentRoleContext> componentRole() {
			return getRuleContexts(ComponentRoleContext.class);
		}
		public ComponentRoleContext componentRole(int i) {
			return getRuleContext(ComponentRoleContext.class,i);
		}
		public JoinCalcClauseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCalcClauseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterJoinCalcClauseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitJoinCalcClauseItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitJoinCalcClauseItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCalcClauseItemContext joinCalcClauseItem() throws RecognitionException {
		JoinCalcClauseItemContext _localctx = new JoinCalcClauseItemContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_joinCalcClauseItem);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1215); match(CALC);
			setState(1217);
			_la = _input.LA(1);
			if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (DIMENSION - 90)) | (1L << (MEASURE - 90)) | (1L << (ATTRIBUTE - 90)) | (1L << (VIRAL - 90)))) != 0) || _la==COMPONENT) {
				{
				setState(1216); componentRole();
				}
			}

			setState(1219); joinCalcExpr();
			setState(1227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1220); match(CARTESIAN_PER);
					setState(1222);
					_la = _input.LA(1);
					if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (DIMENSION - 90)) | (1L << (MEASURE - 90)) | (1L << (ATTRIBUTE - 90)) | (1L << (VIRAL - 90)))) != 0) || _la==COMPONENT) {
						{
						setState(1221); componentRole();
						}
					}

					setState(1224); joinCalcExpr();
					}
					} 
				}
				setState(1229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCalcExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ComponentIDContext componentID() {
			return getRuleContext(ComponentIDContext.class,0);
		}
		public JoinCalcExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCalcExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterJoinCalcExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitJoinCalcExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitJoinCalcExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCalcExprContext joinCalcExpr() throws RecognitionException {
		JoinCalcExprContext _localctx = new JoinCalcExprContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_joinCalcExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230); componentID();
			setState(1231); match(ASSIGN);
			setState(1232); expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinAggClauseContext extends ParserRuleContext {
		public List<JoinAggClauseItemContext> joinAggClauseItem() {
			return getRuleContexts(JoinAggClauseItemContext.class);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public GroupingClauseContext groupingClause() {
			return getRuleContext(GroupingClauseContext.class,0);
		}
		public JoinAggClauseItemContext joinAggClauseItem(int i) {
			return getRuleContext(JoinAggClauseItemContext.class,i);
		}
		public ComponentRoleContext componentRole() {
			return getRuleContext(ComponentRoleContext.class,0);
		}
		public TerminalNode AGGREGATE() { return getToken(Vtl2Parser.AGGREGATE, 0); }
		public JoinAggClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinAggClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterJoinAggClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitJoinAggClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitJoinAggClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinAggClauseContext joinAggClause() throws RecognitionException {
		JoinAggClauseContext _localctx = new JoinAggClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_joinAggClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			_la = _input.LA(1);
			if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (DIMENSION - 90)) | (1L << (MEASURE - 90)) | (1L << (ATTRIBUTE - 90)) | (1L << (VIRAL - 90)))) != 0) || _la==COMPONENT) {
				{
				setState(1234); componentRole();
				}
			}

			setState(1237); match(AGGREGATE);
			setState(1238); joinAggClauseItem();
			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(1239); match(CARTESIAN_PER);
				setState(1240); joinAggClauseItem();
				}
				}
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1247);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1246); groupingClause();
				}
			}

			setState(1250);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(1249); havingClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinAggClauseItemContext extends ParserRuleContext {
		public List<JoinAggExprContext> joinAggExpr() {
			return getRuleContexts(JoinAggExprContext.class);
		}
		public ComponentRoleContext componentRole() {
			return getRuleContext(ComponentRoleContext.class,0);
		}
		public JoinAggExprContext joinAggExpr(int i) {
			return getRuleContext(JoinAggExprContext.class,i);
		}
		public JoinAggClauseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinAggClauseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterJoinAggClauseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitJoinAggClauseItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitJoinAggClauseItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinAggClauseItemContext joinAggClauseItem() throws RecognitionException {
		JoinAggClauseItemContext _localctx = new JoinAggClauseItemContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_joinAggClauseItem);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			_la = _input.LA(1);
			if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (DIMENSION - 90)) | (1L << (MEASURE - 90)) | (1L << (ATTRIBUTE - 90)) | (1L << (VIRAL - 90)))) != 0) || _la==COMPONENT) {
				{
				setState(1252); componentRole();
				}
			}

			setState(1255); joinAggExpr();
			setState(1260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1256); match(CARTESIAN_PER);
					setState(1257); joinAggExpr();
					}
					} 
				}
				setState(1262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinAggExprContext extends ParserRuleContext {
		public AggrFunctionContext aggrFunction() {
			return getRuleContext(AggrFunctionContext.class,0);
		}
		public ComponentIDContext componentID() {
			return getRuleContext(ComponentIDContext.class,0);
		}
		public JoinAggExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinAggExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterJoinAggExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitJoinAggExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitJoinAggExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinAggExprContext joinAggExpr() throws RecognitionException {
		JoinAggExprContext _localctx = new JoinAggExprContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_joinAggExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263); componentID();
			setState(1264); match(ASSIGN);
			setState(1265); aggrFunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinKeepClauseContext extends ParserRuleContext {
		public KeepClauseItemContext keepClauseItem(int i) {
			return getRuleContext(KeepClauseItemContext.class,i);
		}
		public TerminalNode KEEP() { return getToken(Vtl2Parser.KEEP, 0); }
		public List<KeepClauseItemContext> keepClauseItem() {
			return getRuleContexts(KeepClauseItemContext.class);
		}
		public JoinKeepClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinKeepClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterJoinKeepClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitJoinKeepClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitJoinKeepClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinKeepClauseContext joinKeepClause() throws RecognitionException {
		JoinKeepClauseContext _localctx = new JoinKeepClauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_joinKeepClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267); match(KEEP);
			setState(1268); keepClauseItem();
			setState(1273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(1269); match(CARTESIAN_PER);
				setState(1270); keepClauseItem();
				}
				}
				setState(1275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinDropClauseContext extends ParserRuleContext {
		public DropClauseItemContext dropClauseItem(int i) {
			return getRuleContext(DropClauseItemContext.class,i);
		}
		public List<DropClauseItemContext> dropClauseItem() {
			return getRuleContexts(DropClauseItemContext.class);
		}
		public TerminalNode DROP() { return getToken(Vtl2Parser.DROP, 0); }
		public JoinDropClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinDropClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterJoinDropClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitJoinDropClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitJoinDropClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinDropClauseContext joinDropClause() throws RecognitionException {
		JoinDropClauseContext _localctx = new JoinDropClauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_joinDropClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276); match(DROP);
			setState(1277); dropClauseItem();
			setState(1282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(1278); match(CARTESIAN_PER);
				setState(1279); dropClauseItem();
				}
				}
				setState(1284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinFilterClauseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RulesetIDContext rulesetID() {
			return getRuleContext(RulesetIDContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(Vtl2Parser.FILTER, 0); }
		public JoinFilterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinFilterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterJoinFilterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitJoinFilterClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitJoinFilterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinFilterClauseContext joinFilterClause() throws RecognitionException {
		JoinFilterClauseContext _localctx = new JoinFilterClauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_joinFilterClause);
		try {
			setState(1288);
			switch (_input.LA(1)) {
			case FILTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1285); match(FILTER);
				setState(1286); expr(0);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1287); rulesetID();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinRenameClauseContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(Vtl2Parser.RENAME, 0); }
		public List<VarIDContext> varID() {
			return getRuleContexts(VarIDContext.class);
		}
		public List<ComponentIDContext> componentID() {
			return getRuleContexts(ComponentIDContext.class);
		}
		public TerminalNode MEMBERSHIP(int i) {
			return getToken(Vtl2Parser.MEMBERSHIP, i);
		}
		public TerminalNode TO(int i) {
			return getToken(Vtl2Parser.TO, i);
		}
		public ComponentIDContext componentID(int i) {
			return getRuleContext(ComponentIDContext.class,i);
		}
		public VarIDContext varID(int i) {
			return getRuleContext(VarIDContext.class,i);
		}
		public List<TerminalNode> TO() { return getTokens(Vtl2Parser.TO); }
		public List<TerminalNode> MEMBERSHIP() { return getTokens(Vtl2Parser.MEMBERSHIP); }
		public JoinRenameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRenameClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterJoinRenameClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitJoinRenameClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitJoinRenameClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRenameClauseContext joinRenameClause() throws RecognitionException {
		JoinRenameClauseContext _localctx = new JoinRenameClauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_joinRenameClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1290); match(RENAME);
			setState(1294);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1291); componentID();
				setState(1292); match(MEMBERSHIP);
				}
				break;
			}
			setState(1296); varID();
			setState(1297); match(TO);
			setState(1301);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1298); componentID();
				setState(1299); match(MEMBERSHIP);
				}
				break;
			}
			setState(1303); varID();
			setState(1321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1304); match(CARTESIAN_PER);
					setState(1308);
					switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
					case 1:
						{
						setState(1305); componentID();
						setState(1306); match(MEMBERSHIP);
						}
						break;
					}
					setState(1310); varID();
					setState(1311); match(TO);
					setState(1315);
					switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
					case 1:
						{
						setState(1312); componentID();
						setState(1313); match(MEMBERSHIP);
						}
						break;
					}
					setState(1317); varID();
					}
					} 
				}
				setState(1323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinApplyClauseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode APPLY() { return getToken(Vtl2Parser.APPLY, 0); }
		public JoinApplyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinApplyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterJoinApplyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitJoinApplyClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitJoinApplyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinApplyClauseContext joinApplyClause() throws RecognitionException {
		JoinApplyClauseContext _localctx = new JoinApplyClauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_joinApplyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324); match(APPLY);
			setState(1325); expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnFunctionContext extends ParserRuleContext {
		public TerminalNode LAG() { return getToken(Vtl2Parser.LAG, 0); }
		public TerminalNode RANK() { return getToken(Vtl2Parser.RANK, 0); }
		public TerminalNode RATIO_TO_REPORT() { return getToken(Vtl2Parser.RATIO_TO_REPORT, 0); }
		public TerminalNode FIRST_VALUE() { return getToken(Vtl2Parser.FIRST_VALUE, 0); }
		public TerminalNode LAST_VALUE() { return getToken(Vtl2Parser.LAST_VALUE, 0); }
		public TerminalNode LEAD() { return getToken(Vtl2Parser.LEAD, 0); }
		public AnFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterAnFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitAnFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitAnFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnFunctionContext anFunction() throws RecognitionException {
		AnFunctionContext _localctx = new AnFunctionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_anFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			_la = _input.LA(1);
			if ( !(_la==RANK || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (FIRST_VALUE - 134)) | (1L << (LAST_VALUE - 134)) | (1L << (LAG - 134)) | (1L << (LEAD - 134)) | (1L << (RATIO_TO_REPORT - 134)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregateClauseContext extends ParserRuleContext {
		public List<AggrFunctionClauseContext> aggrFunctionClause() {
			return getRuleContexts(AggrFunctionClauseContext.class);
		}
		public AggrFunctionClauseContext aggrFunctionClause(int i) {
			return getRuleContext(AggrFunctionClauseContext.class,i);
		}
		public AggregateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterAggregateClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitAggregateClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitAggregateClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateClauseContext aggregateClause() throws RecognitionException {
		AggregateClauseContext _localctx = new AggregateClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_aggregateClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329); aggrFunctionClause();
			setState(1334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(1330); match(CARTESIAN_PER);
				setState(1331); aggrFunctionClause();
				}
				}
				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggrFunctionClauseContext extends ParserRuleContext {
		public AggrFunctionContext aggrFunction() {
			return getRuleContext(AggrFunctionContext.class,0);
		}
		public ComponentIDContext componentID() {
			return getRuleContext(ComponentIDContext.class,0);
		}
		public ComponentRoleContext componentRole() {
			return getRuleContext(ComponentRoleContext.class,0);
		}
		public AggrFunctionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggrFunctionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterAggrFunctionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitAggrFunctionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitAggrFunctionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggrFunctionClauseContext aggrFunctionClause() throws RecognitionException {
		AggrFunctionClauseContext _localctx = new AggrFunctionClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_aggrFunctionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			_la = _input.LA(1);
			if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (DIMENSION - 90)) | (1L << (MEASURE - 90)) | (1L << (ATTRIBUTE - 90)) | (1L << (VIRAL - 90)))) != 0) || _la==COMPONENT) {
				{
				setState(1337); componentRole();
				}
			}

			setState(1340); componentID();
			setState(1341); match(ASSIGN);
			setState(1342); aggrFunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetFiltersClauseContext extends ParserRuleContext {
		public List<GetFilterClauseContext> getFilterClause() {
			return getRuleContexts(GetFilterClauseContext.class);
		}
		public GetFilterClauseContext getFilterClause(int i) {
			return getRuleContext(GetFilterClauseContext.class,i);
		}
		public GetFiltersClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getFiltersClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterGetFiltersClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitGetFiltersClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitGetFiltersClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetFiltersClauseContext getFiltersClause() throws RecognitionException {
		GetFiltersClauseContext _localctx = new GetFiltersClauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_getFiltersClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344); getFilterClause();
			setState(1349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(1345); match(CARTESIAN_PER);
				setState(1346); getFilterClause();
				}
				}
				setState(1351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetFilterClauseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(Vtl2Parser.FILTER, 0); }
		public GetFilterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getFilterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterGetFilterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitGetFilterClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitGetFilterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetFilterClauseContext getFilterClause() throws RecognitionException {
		GetFilterClauseContext _localctx = new GetFilterClauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_getFilterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1353);
			_la = _input.LA(1);
			if (_la==FILTER) {
				{
				setState(1352); match(FILTER);
				}
			}

			setState(1355); expr(0);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggrClauseContext extends ParserRuleContext {
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public GroupingClauseContext groupingClause() {
			return getRuleContext(GroupingClauseContext.class,0);
		}
		public TerminalNode AGGREGATE() { return getToken(Vtl2Parser.AGGREGATE, 0); }
		public AggregateClauseContext aggregateClause() {
			return getRuleContext(AggregateClauseContext.class,0);
		}
		public AggrClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggrClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterAggrClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitAggrClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitAggrClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggrClauseContext aggrClause() throws RecognitionException {
		AggrClauseContext _localctx = new AggrClauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_aggrClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357); match(AGGREGATE);
			setState(1358); aggregateClause();
			setState(1360);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1359); groupingClause();
				}
			}

			setState(1363);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(1362); havingClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterClauseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(Vtl2Parser.FILTER, 0); }
		public FilterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterFilterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitFilterClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitFilterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterClauseContext filterClause() throws RecognitionException {
		FilterClauseContext _localctx = new FilterClauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_filterClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365); match(FILTER);
			setState(1366); expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameClauseContext extends ParserRuleContext {
		public List<VarIDContext> varID() {
			return getRuleContexts(VarIDContext.class);
		}
		public TerminalNode TO(int i) {
			return getToken(Vtl2Parser.TO, i);
		}
		public VarIDContext varID(int i) {
			return getRuleContext(VarIDContext.class,i);
		}
		public List<TerminalNode> TO() { return getTokens(Vtl2Parser.TO); }
		public RenameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterRenameClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitRenameClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitRenameClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameClauseContext renameClause() throws RecognitionException {
		RenameClauseContext _localctx = new RenameClauseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_renameClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368); varID();
			setState(1369); match(TO);
			setState(1370); varID();
			setState(1378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(1371); match(CARTESIAN_PER);
				setState(1372); varID();
				setState(1373); match(TO);
				setState(1374); varID();
				}
				}
				setState(1380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggrFunctionContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(Vtl2Parser.COUNT, 0); }
		public TerminalNode MIN() { return getToken(Vtl2Parser.MIN, 0); }
		public TerminalNode VAR_POP() { return getToken(Vtl2Parser.VAR_POP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MAX() { return getToken(Vtl2Parser.MAX, 0); }
		public TerminalNode RANK() { return getToken(Vtl2Parser.RANK, 0); }
		public TerminalNode MEDIAN() { return getToken(Vtl2Parser.MEDIAN, 0); }
		public TerminalNode VAR_SAMP() { return getToken(Vtl2Parser.VAR_SAMP, 0); }
		public TerminalNode AVG() { return getToken(Vtl2Parser.AVG, 0); }
		public TerminalNode SUM() { return getToken(Vtl2Parser.SUM, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(Vtl2Parser.STDDEV_SAMP, 0); }
		public TerminalNode STDDEV_POP() { return getToken(Vtl2Parser.STDDEV_POP, 0); }
		public AggrFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggrFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterAggrFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitAggrFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitAggrFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggrFunctionContext aggrFunction() throws RecognitionException {
		AggrFunctionContext _localctx = new AggrFunctionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_aggrFunction);
		int _la;
		try {
			setState(1437);
			switch (_input.LA(1)) {
			case SUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(1381); match(SUM);
				setState(1382); match(14);
				setState(1383); expr(0);
				setState(1384); match(15);
				}
				break;
			case AVG:
				enterOuterAlt(_localctx, 2);
				{
				setState(1386); match(AVG);
				setState(1387); match(14);
				setState(1388); expr(0);
				setState(1389); match(15);
				}
				break;
			case COUNT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1391); match(COUNT);
				setState(1392); match(14);
				setState(1394);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << 17) | (1L << 18) | (1L << EVAL) | (1L << IF) | (1L << CURRENT_DATE) | (1L << NOT) | (1L << BETWEEN) | (1L << ISNULL) | (1L << UNION) | (1L << SYMDIFF) | (1L << INTERSECT) | (1L << CHECK) | (1L << EXISTS_IN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANK - 64)) | (1L << (MIN - 64)) | (1L << (MAX - 64)) | (1L << (ABS - 64)) | (1L << (LN - 64)) | (1L << (LOG - 64)) | (1L << (TRUNC - 64)) | (1L << (ROUND - 64)) | (1L << (POWER - 64)) | (1L << (MOD - 64)) | (1L << (LEN - 64)) | (1L << (TRIM - 64)) | (1L << (UCASE - 64)) | (1L << (LCASE - 64)) | (1L << (SUBSTR - 64)) | (1L << (SUM - 64)) | (1L << (AVG - 64)) | (1L << (MEDIAN - 64)) | (1L << (COUNT - 64)) | (1L << (EXP - 64)) | (1L << (CHARSET_MATCH - 64)) | (1L << (NVL - 64)) | (1L << (HIERARCHY - 64)) | (1L << (DEFINE - 64)) | (1L << (LTRIM - 64)) | (1L << (RTRIM - 64)) | (1L << (INSTR - 64)) | (1L << (REPLACE - 64)) | (1L << (CEIL - 64)) | (1L << (FLOOR - 64)) | (1L << (SQRT - 64)) | (1L << (SETDIFF - 64)) | (1L << (STDDEV_POP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (STDDEV_SAMP - 128)) | (1L << (VAR_POP - 128)) | (1L << (VAR_SAMP - 128)) | (1L << (FIRST_VALUE - 128)) | (1L << (LAST_VALUE - 128)) | (1L << (LAG - 128)) | (1L << (LEAD - 128)) | (1L << (RATIO_TO_REPORT - 128)) | (1L << (FILL_TIME_SERIES - 128)) | (1L << (FLOW_TO_STOCK - 128)) | (1L << (STOCK_TO_FLOW - 128)) | (1L << (TIMESHIFT - 128)) | (1L << (INNER_JOIN - 128)) | (1L << (LEFT_JOIN - 128)) | (1L << (CROSS_JOIN - 128)) | (1L << (FULL_JOIN - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (PERIOD_INDICATOR - 193)) | (1L << (TIME_AGG - 193)) | (1L << (CAST - 193)) | (1L << (CHECK_DATAPOINT - 193)) | (1L << (CHECK_HIERARCHY - 193)) | (1L << (INTEGER_CONSTANT - 193)) | (1L << (FLOAT_CONSTANT - 193)) | (1L << (BOOLEAN_CONSTANT - 193)) | (1L << (NULL_CONSTANT - 193)) | (1L << (STRING_CONSTANT - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (CREATE_FUNCTION - 193)))) != 0)) {
					{
					setState(1393); expr(0);
					}
				}

				setState(1396); match(15);
				}
				break;
			case MEDIAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1397); match(MEDIAN);
				setState(1398); match(14);
				setState(1399); expr(0);
				setState(1400); match(15);
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(1402); match(MIN);
				setState(1403); match(14);
				setState(1404); expr(0);
				setState(1405); match(15);
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 6);
				{
				setState(1407); match(MAX);
				setState(1408); match(14);
				setState(1409); expr(0);
				setState(1410); match(15);
				}
				break;
			case RANK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1412); match(RANK);
				setState(1413); match(14);
				setState(1414); expr(0);
				setState(1415); match(15);
				}
				break;
			case STDDEV_POP:
				enterOuterAlt(_localctx, 8);
				{
				setState(1417); match(STDDEV_POP);
				setState(1418); match(14);
				setState(1419); expr(0);
				setState(1420); match(15);
				}
				break;
			case STDDEV_SAMP:
				enterOuterAlt(_localctx, 9);
				{
				setState(1422); match(STDDEV_SAMP);
				setState(1423); match(14);
				setState(1424); expr(0);
				setState(1425); match(15);
				}
				break;
			case VAR_POP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1427); match(VAR_POP);
				setState(1428); match(14);
				setState(1429); expr(0);
				setState(1430); match(15);
				}
				break;
			case VAR_SAMP:
				enterOuterAlt(_localctx, 11);
				{
				setState(1432); match(VAR_SAMP);
				setState(1433); match(14);
				setState(1434); expr(0);
				setState(1435); match(15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalcClauseContext extends ParserRuleContext {
		public TerminalNode CALC() { return getToken(Vtl2Parser.CALC, 0); }
		public List<CalcClauseItemContext> calcClauseItem() {
			return getRuleContexts(CalcClauseItemContext.class);
		}
		public CalcClauseItemContext calcClauseItem(int i) {
			return getRuleContext(CalcClauseItemContext.class,i);
		}
		public CalcClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterCalcClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitCalcClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitCalcClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcClauseContext calcClause() throws RecognitionException {
		CalcClauseContext _localctx = new CalcClauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_calcClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439); match(CALC);
			setState(1440); calcClauseItem();
			setState(1445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(1441); match(CARTESIAN_PER);
				setState(1442); calcClauseItem();
				}
				}
				setState(1447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalcClauseItemContext extends ParserRuleContext {
		public ComponentIDContext componentID() {
			return getRuleContext(ComponentIDContext.class,0);
		}
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public ComponentRoleContext componentRole() {
			return getRuleContext(ComponentRoleContext.class,0);
		}
		public CalcClauseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcClauseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterCalcClauseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitCalcClauseItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitCalcClauseItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcClauseItemContext calcClauseItem() throws RecognitionException {
		CalcClauseItemContext _localctx = new CalcClauseItemContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_calcClauseItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			_la = _input.LA(1);
			if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (DIMENSION - 90)) | (1L << (MEASURE - 90)) | (1L << (ATTRIBUTE - 90)) | (1L << (VIRAL - 90)))) != 0) || _la==COMPONENT) {
				{
				setState(1448); componentRole();
				}
			}

			setState(1451); componentID();
			setState(1452); match(ASSIGN);
			setState(1453); calcExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalcExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AggrFunctionContext aggrFunction() {
			return getRuleContext(AggrFunctionContext.class,0);
		}
		public CalcExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterCalcExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitCalcExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitCalcExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcExprContext calcExpr() throws RecognitionException {
		CalcExprContext _localctx = new CalcExprContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_calcExpr);
		try {
			setState(1461);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1455); aggrFunction();
				setState(1456); match(14);
				setState(1457); expr(0);
				setState(1458); match(15);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1460); expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropClauseContext extends ParserRuleContext {
		public DropClauseItemContext dropClauseItem(int i) {
			return getRuleContext(DropClauseItemContext.class,i);
		}
		public List<DropClauseItemContext> dropClauseItem() {
			return getRuleContexts(DropClauseItemContext.class);
		}
		public TerminalNode DROP() { return getToken(Vtl2Parser.DROP, 0); }
		public DropClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterDropClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitDropClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitDropClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropClauseContext dropClause() throws RecognitionException {
		DropClauseContext _localctx = new DropClauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_dropClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463); match(DROP);
			setState(1464); dropClauseItem();
			setState(1469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(1465); match(CARTESIAN_PER);
				setState(1466); dropClauseItem();
				}
				}
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropClauseItemContext extends ParserRuleContext {
		public DatasetIDContext datasetID() {
			return getRuleContext(DatasetIDContext.class,0);
		}
		public ComponentIDContext componentID() {
			return getRuleContext(ComponentIDContext.class,0);
		}
		public TerminalNode MEMBERSHIP() { return getToken(Vtl2Parser.MEMBERSHIP, 0); }
		public DropClauseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropClauseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterDropClauseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitDropClauseItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitDropClauseItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropClauseItemContext dropClauseItem() throws RecognitionException {
		DropClauseItemContext _localctx = new DropClauseItemContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_dropClauseItem);
		try {
			setState(1477);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1472); componentID();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1473); datasetID();
				setState(1474); match(MEMBERSHIP);
				setState(1475); componentID();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeepClauseContext extends ParserRuleContext {
		public KeepClauseItemContext keepClauseItem(int i) {
			return getRuleContext(KeepClauseItemContext.class,i);
		}
		public TerminalNode KEEP() { return getToken(Vtl2Parser.KEEP, 0); }
		public List<KeepClauseItemContext> keepClauseItem() {
			return getRuleContexts(KeepClauseItemContext.class);
		}
		public KeepClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keepClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterKeepClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitKeepClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitKeepClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeepClauseContext keepClause() throws RecognitionException {
		KeepClauseContext _localctx = new KeepClauseContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_keepClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479); match(KEEP);
			setState(1480); keepClauseItem();
			setState(1485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(1481); match(CARTESIAN_PER);
				setState(1482); keepClauseItem();
				}
				}
				setState(1487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeepClauseItemContext extends ParserRuleContext {
		public DatasetIDContext datasetID() {
			return getRuleContext(DatasetIDContext.class,0);
		}
		public ComponentIDContext componentID() {
			return getRuleContext(ComponentIDContext.class,0);
		}
		public TerminalNode MEMBERSHIP() { return getToken(Vtl2Parser.MEMBERSHIP, 0); }
		public KeepClauseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keepClauseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterKeepClauseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitKeepClauseItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitKeepClauseItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeepClauseItemContext keepClauseItem() throws RecognitionException {
		KeepClauseItemContext _localctx = new KeepClauseItemContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_keepClauseItem);
		try {
			setState(1493);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1488); componentID();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1489); datasetID();
				setState(1490); match(MEMBERSHIP);
				setState(1491); componentID();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnpivotExprContext extends ParserRuleContext {
		public List<VarIDContext> varID() {
			return getRuleContexts(VarIDContext.class);
		}
		public VarIDContext varID(int i) {
			return getRuleContext(VarIDContext.class,i);
		}
		public TerminalNode UNPIVOT() { return getToken(Vtl2Parser.UNPIVOT, 0); }
		public UnpivotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterUnpivotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitUnpivotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitUnpivotExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnpivotExprContext unpivotExpr() throws RecognitionException {
		UnpivotExprContext _localctx = new UnpivotExprContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_unpivotExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495); match(UNPIVOT);
			setState(1496); varID();
			setState(1497); match(CARTESIAN_PER);
			setState(1498); varID();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotExprContext extends ParserRuleContext {
		public List<VarIDContext> varID() {
			return getRuleContexts(VarIDContext.class);
		}
		public VarIDContext varID(int i) {
			return getRuleContext(VarIDContext.class,i);
		}
		public TerminalNode PIVOT() { return getToken(Vtl2Parser.PIVOT, 0); }
		public PivotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterPivotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitPivotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitPivotExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotExprContext pivotExpr() throws RecognitionException {
		PivotExprContext _localctx = new PivotExprContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_pivotExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500); match(PIVOT);
			setState(1501); varID();
			setState(1502); match(CARTESIAN_PER);
			setState(1503); varID();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubspaceExprContext extends ParserRuleContext {
		public TerminalNode SUBSPACE() { return getToken(Vtl2Parser.SUBSPACE, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public List<VarIDContext> varID() {
			return getRuleContexts(VarIDContext.class);
		}
		public VarIDContext varID(int i) {
			return getRuleContext(VarIDContext.class,i);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public SubspaceExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subspaceExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterSubspaceExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitSubspaceExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitSubspaceExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubspaceExprContext subspaceExpr() throws RecognitionException {
		SubspaceExprContext _localctx = new SubspaceExprContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_subspaceExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1505); match(SUBSPACE);
			setState(1506); varID();
			setState(1507); match(9);
			setState(1508); constant();
			setState(1516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(1509); match(CARTESIAN_PER);
				setState(1510); varID();
				setState(1511); match(9);
				setState(1512); constant();
				}
				}
				setState(1518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InBetweenClauseContext extends ParserRuleContext {
		public SetExprContext setExpr() {
			return getRuleContext(SetExprContext.class,0);
		}
		public TerminalNode NOT_IN() { return getToken(Vtl2Parser.NOT_IN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(Vtl2Parser.IN, 0); }
		public InBetweenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inBetweenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterInBetweenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitInBetweenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitInBetweenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InBetweenClauseContext inBetweenClause() throws RecognitionException {
		InBetweenClauseContext _localctx = new InBetweenClauseContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_inBetweenClause);
		try {
			setState(1529);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1519); match(IN);
				setState(1522);
				switch (_input.LA(1)) {
				case UNION:
				case SYMDIFF:
				case INTERSECT:
				case SETDIFF:
					{
					setState(1520); setExpr();
					}
					break;
				case IDENTIFIER:
					{
					setState(1521); match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NOT_IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1524); match(NOT_IN);
				setState(1527);
				switch (_input.LA(1)) {
				case UNION:
				case SYMDIFF:
				case INTERSECT:
				case SETDIFF:
					{
					setState(1525); setExpr();
					}
					break;
				case IDENTIFIER:
					{
					setState(1526); match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetExprContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(Vtl2Parser.UNION, 0); }
		public TerminalNode SETDIFF() { return getToken(Vtl2Parser.SETDIFF, 0); }
		public TerminalNode INTERSECT() { return getToken(Vtl2Parser.INTERSECT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SYMDIFF() { return getToken(Vtl2Parser.SYMDIFF, 0); }
		public SetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitSetExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitSetExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetExprContext setExpr() throws RecognitionException {
		SetExprContext _localctx = new SetExprContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_setExpr);
		int _la;
		try {
			setState(1569);
			switch (_input.LA(1)) {
			case UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1531); match(UNION);
				setState(1532); match(14);
				setState(1533); expr(0);
				setState(1538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CARTESIAN_PER) {
					{
					{
					setState(1534); match(CARTESIAN_PER);
					setState(1535); expr(0);
					}
					}
					setState(1540);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1541); match(15);
				}
				break;
			case SYMDIFF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1543); match(SYMDIFF);
				setState(1544); match(14);
				setState(1545); expr(0);
				setState(1546); match(CARTESIAN_PER);
				setState(1547); expr(0);
				setState(1548); match(15);
				}
				break;
			case SETDIFF:
				enterOuterAlt(_localctx, 3);
				{
				setState(1550); match(SETDIFF);
				setState(1551); match(14);
				setState(1552); expr(0);
				setState(1553); match(CARTESIAN_PER);
				setState(1554); expr(0);
				setState(1555); match(15);
				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1557); match(INTERSECT);
				setState(1558); match(14);
				setState(1559); expr(0);
				setState(1564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CARTESIAN_PER) {
					{
					{
					setState(1560); match(CARTESIAN_PER);
					setState(1561); expr(0);
					}
					}
					setState(1566);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1567); match(15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptExprContext extends ParserRuleContext {
		public PersistentDatasetIDContext persistentDatasetID() {
			return getRuleContext(PersistentDatasetIDContext.class,0);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public List<ComponentIDContext> componentID() {
			return getRuleContexts(ComponentIDContext.class);
		}
		public ComponentIDContext componentID(int i) {
			return getRuleContext(ComponentIDContext.class,i);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public SubscriptExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterSubscriptExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitSubscriptExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitSubscriptExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptExprContext subscriptExpr() throws RecognitionException {
		SubscriptExprContext _localctx = new SubscriptExprContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_subscriptExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571); persistentDatasetID();
			setState(1572); match(6);
			setState(1573); componentID();
			setState(1574); match(9);
			setState(1575); constant();
			setState(1581);
			_la = _input.LA(1);
			if (_la==CARTESIAN_PER) {
				{
				setState(1576); match(CARTESIAN_PER);
				setState(1577); componentID();
				setState(1578); match(9);
				setState(1579); constant();
				}
			}

			setState(1583); match(10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggrInvocationContext extends ParserRuleContext {
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public AggrFunctionNameContext aggrFunctionName() {
			return getRuleContext(AggrFunctionNameContext.class,0);
		}
		public TerminalNode MEMBERSHIP(int i) {
			return getToken(Vtl2Parser.MEMBERSHIP, i);
		}
		public List<ComponentIDContext> componentID() {
			return getRuleContexts(ComponentIDContext.class);
		}
		public GroupingClauseContext groupingClause() {
			return getRuleContext(GroupingClauseContext.class,0);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Vtl2Parser.IDENTIFIER, i);
		}
		public ComponentIDContext componentID(int i) {
			return getRuleContext(ComponentIDContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Vtl2Parser.IDENTIFIER); }
		public List<TerminalNode> MEMBERSHIP() { return getTokens(Vtl2Parser.MEMBERSHIP); }
		public AggrInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggrInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterAggrInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitAggrInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitAggrInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggrInvocationContext aggrInvocation() throws RecognitionException {
		AggrInvocationContext _localctx = new AggrInvocationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_aggrInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585); aggrFunctionName();
			setState(1586); match(14);
			setState(1587); match(IDENTIFIER);
			setState(1590);
			_la = _input.LA(1);
			if (_la==MEMBERSHIP) {
				{
				setState(1588); match(MEMBERSHIP);
				setState(1589); componentID();
				}
			}

			setState(1600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(1592); match(CARTESIAN_PER);
				setState(1593); match(IDENTIFIER);
				setState(1596);
				_la = _input.LA(1);
				if (_la==MEMBERSHIP) {
					{
					setState(1594); match(MEMBERSHIP);
					setState(1595); componentID();
					}
				}

				}
				}
				setState(1602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1604);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1603); groupingClause();
				}
			}

			setState(1607);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(1606); havingClause();
				}
			}

			setState(1609); match(15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggrInvocationCompExprContext extends ParserRuleContext {
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public AggrFunctionNameContext aggrFunctionName() {
			return getRuleContext(AggrFunctionNameContext.class,0);
		}
		public TerminalNode MEMBERSHIP(int i) {
			return getToken(Vtl2Parser.MEMBERSHIP, i);
		}
		public List<ComponentIDContext> componentID() {
			return getRuleContexts(ComponentIDContext.class);
		}
		public GroupingClauseContext groupingClause() {
			return getRuleContext(GroupingClauseContext.class,0);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Vtl2Parser.IDENTIFIER, i);
		}
		public ComponentIDContext componentID(int i) {
			return getRuleContext(ComponentIDContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Vtl2Parser.IDENTIFIER); }
		public List<TerminalNode> MEMBERSHIP() { return getTokens(Vtl2Parser.MEMBERSHIP); }
		public AggrInvocationCompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggrInvocationCompExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterAggrInvocationCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitAggrInvocationCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitAggrInvocationCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggrInvocationCompExprContext aggrInvocationCompExpr() throws RecognitionException {
		AggrInvocationCompExprContext _localctx = new AggrInvocationCompExprContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_aggrInvocationCompExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611); aggrFunctionName();
			setState(1612); match(14);
			setState(1613); match(IDENTIFIER);
			setState(1616);
			_la = _input.LA(1);
			if (_la==MEMBERSHIP) {
				{
				setState(1614); match(MEMBERSHIP);
				setState(1615); componentID();
				}
			}

			setState(1626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(1618); match(CARTESIAN_PER);
				setState(1619); match(IDENTIFIER);
				setState(1622);
				_la = _input.LA(1);
				if (_la==MEMBERSHIP) {
					{
					setState(1620); match(MEMBERSHIP);
					setState(1621); componentID();
					}
				}

				}
				}
				setState(1628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1629); match(15);
			setState(1631);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1630); groupingClause();
				}
				break;
			}
			setState(1634);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1633); havingClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggrFunctionNameContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(Vtl2Parser.COUNT, 0); }
		public TerminalNode MIN() { return getToken(Vtl2Parser.MIN, 0); }
		public TerminalNode VAR_POP() { return getToken(Vtl2Parser.VAR_POP, 0); }
		public TerminalNode MAX() { return getToken(Vtl2Parser.MAX, 0); }
		public TerminalNode MEDIAN() { return getToken(Vtl2Parser.MEDIAN, 0); }
		public TerminalNode VAR_SAMP() { return getToken(Vtl2Parser.VAR_SAMP, 0); }
		public TerminalNode AVG() { return getToken(Vtl2Parser.AVG, 0); }
		public TerminalNode SUM() { return getToken(Vtl2Parser.SUM, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(Vtl2Parser.STDDEV_SAMP, 0); }
		public TerminalNode STDDEV_POP() { return getToken(Vtl2Parser.STDDEV_POP, 0); }
		public AggrFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggrFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterAggrFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitAggrFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitAggrFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggrFunctionNameContext aggrFunctionName() throws RecognitionException {
		AggrFunctionNameContext _localctx = new AggrFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_aggrFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1636);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (MIN - 67)) | (1L << (MAX - 67)) | (1L << (SUM - 67)) | (1L << (AVG - 67)) | (1L << (MEDIAN - 67)) | (1L << (COUNT - 67)) | (1L << (STDDEV_POP - 67)) | (1L << (STDDEV_SAMP - 67)) | (1L << (VAR_POP - 67)) | (1L << (VAR_SAMP - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingClauseContext extends ParserRuleContext {
		public GroupKeywordContext groupKeyword() {
			return getRuleContext(GroupKeywordContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Vtl2Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Vtl2Parser.IDENTIFIER); }
		public GroupingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterGroupingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitGroupingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitGroupingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingClauseContext groupingClause() throws RecognitionException {
		GroupingClauseContext _localctx = new GroupingClauseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_groupingClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1638); groupKeyword();
			setState(1648);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				{
				setState(1639); match(IDENTIFIER);
				setState(1644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1640); match(CARTESIAN_PER);
						setState(1641); match(IDENTIFIER);
						}
						} 
					}
					setState(1646);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				}
				}
				}
				break;

			case 2:
				{
				{
				setState(1647); expr(0);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AggrFunctionContext aggrFunction() {
			return getRuleContext(AggrFunctionContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(Vtl2Parser.HAVING, 0); }
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650); match(HAVING);
			setState(1652);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1651); match(14);
				}
				break;
			}
			setState(1655);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1654); aggrFunction();
				}
				break;
			}
			setState(1657); expr(0);
			setState(1659);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1658); match(15);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnAllContext extends ParserRuleContext {
		public TerminalNode POINTS() { return getToken(Vtl2Parser.POINTS, 0); }
		public TerminalNode RETURN() { return getToken(Vtl2Parser.RETURN, 0); }
		public TerminalNode DATA() { return getToken(Vtl2Parser.DATA, 0); }
		public TerminalNode ALL() { return getToken(Vtl2Parser.ALL, 0); }
		public ReturnAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnAll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterReturnAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitReturnAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitReturnAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnAllContext returnAll() throws RecognitionException {
		ReturnAllContext _localctx = new ReturnAllContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_returnAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661); match(RETURN);
			setState(1662); match(ALL);
			setState(1663); match(DATA);
			setState(1664); match(POINTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentRoleContext extends ParserRuleContext {
		public TerminalNode MEASURE() { return getToken(Vtl2Parser.MEASURE, 0); }
		public TerminalNode DIMENSION() { return getToken(Vtl2Parser.DIMENSION, 0); }
		public TerminalNode COMPONENT() { return getToken(Vtl2Parser.COMPONENT, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(Vtl2Parser.ATTRIBUTE, 0); }
		public ViralAttributeContext viralAttribute() {
			return getRuleContext(ViralAttributeContext.class,0);
		}
		public ComponentRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentRole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterComponentRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitComponentRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitComponentRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentRoleContext componentRole() throws RecognitionException {
		ComponentRoleContext _localctx = new ComponentRoleContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_componentRole);
		try {
			setState(1671);
			switch (_input.LA(1)) {
			case MEASURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1666); match(MEASURE);
				}
				break;
			case COMPONENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1667); match(COMPONENT);
				}
				break;
			case DIMENSION:
				enterOuterAlt(_localctx, 3);
				{
				setState(1668); match(DIMENSION);
				}
				break;
			case ATTRIBUTE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1669); match(ATTRIBUTE);
				}
				break;
			case VIRAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1670); viralAttribute();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ViralAttributeContext extends ParserRuleContext {
		public TerminalNode VIRAL() { return getToken(Vtl2Parser.VIRAL, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(Vtl2Parser.ATTRIBUTE, 0); }
		public ViralAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viralAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterViralAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitViralAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitViralAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViralAttributeContext viralAttribute() throws RecognitionException {
		ViralAttributeContext _localctx = new ViralAttributeContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_viralAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673); match(VIRAL);
			setState(1674); match(ATTRIBUTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogBaseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LogBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterLogBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitLogBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitLogBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogBaseContext logBase() throws RecognitionException {
		LogBaseContext _localctx = new LogBaseContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_logBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676); expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExponentContext extends ParserRuleContext {
		public TerminalNode INTEGER_CONSTANT() { return getToken(Vtl2Parser.INTEGER_CONSTANT, 0); }
		public TerminalNode FLOAT_CONSTANT() { return getToken(Vtl2Parser.FLOAT_CONSTANT, 0); }
		public ExponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterExponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitExponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitExponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExponentContext exponent() throws RecognitionException {
		ExponentContext _localctx = new ExponentContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_exponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1678);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_CONSTANT || _la==FLOAT_CONSTANT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PersistentDatasetIDContext extends ParserRuleContext {
		public TerminalNode STRING_CONSTANT() { return getToken(Vtl2Parser.STRING_CONSTANT, 0); }
		public PersistentDatasetIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_persistentDatasetID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterPersistentDatasetID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitPersistentDatasetID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitPersistentDatasetID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PersistentDatasetIDContext persistentDatasetID() throws RecognitionException {
		PersistentDatasetIDContext _localctx = new PersistentDatasetIDContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_persistentDatasetID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680); match(STRING_CONSTANT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatasetIDContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public DatasetIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasetID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterDatasetID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitDatasetID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitDatasetID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatasetIDContext datasetID() throws RecognitionException {
		DatasetIDContext _localctx = new DatasetIDContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_datasetID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulesetIDContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public RulesetIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulesetID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterRulesetID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitRulesetID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitRulesetID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesetIDContext rulesetID() throws RecognitionException {
		RulesetIDContext _localctx = new RulesetIDContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_rulesetID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1684); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarIDContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public VarIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterVarID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitVarID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitVarID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarIDContext varID() throws RecognitionException {
		VarIDContext _localctx = new VarIDContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_varID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1686); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentIDContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public ComponentIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterComponentID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitComponentID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitComponentID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentIDContext componentID() throws RecognitionException {
		ComponentIDContext _localctx = new ComponentIDContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_componentID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorIDContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public OperatorIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterOperatorID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitOperatorID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitOperatorID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorIDContext operatorID() throws RecognitionException {
		OperatorIDContext _localctx = new OperatorIDContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_operatorID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1690); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoutineNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public RoutineNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterRoutineName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitRoutineName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitRoutineName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineNameContext routineName() throws RecognitionException {
		RoutineNameContext _localctx = new RoutineNameContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_routineName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinKeywordContext extends ParserRuleContext {
		public TerminalNode LEFT_JOIN() { return getToken(Vtl2Parser.LEFT_JOIN, 0); }
		public TerminalNode FULL_JOIN() { return getToken(Vtl2Parser.FULL_JOIN, 0); }
		public TerminalNode CROSS_JOIN() { return getToken(Vtl2Parser.CROSS_JOIN, 0); }
		public TerminalNode INNER_JOIN() { return getToken(Vtl2Parser.INNER_JOIN, 0); }
		public JoinKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterJoinKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitJoinKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitJoinKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinKeywordContext joinKeyword() throws RecognitionException {
		JoinKeywordContext _localctx = new JoinKeywordContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_joinKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			_la = _input.LA(1);
			if ( !(((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (INNER_JOIN - 179)) | (1L << (LEFT_JOIN - 179)) | (1L << (CROSS_JOIN - 179)) | (1L << (FULL_JOIN - 179)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupKeywordContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(Vtl2Parser.GROUP, 0); }
		public TerminalNode EXCEPT() { return getToken(Vtl2Parser.EXCEPT, 0); }
		public TerminalNode BY() { return getToken(Vtl2Parser.BY, 0); }
		public TerminalNode ALL() { return getToken(Vtl2Parser.ALL, 0); }
		public GroupKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterGroupKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitGroupKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitGroupKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupKeywordContext groupKeyword() throws RecognitionException {
		GroupKeywordContext _localctx = new GroupKeywordContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_groupKeyword);
		try {
			setState(1702);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1696); match(GROUP);
				setState(1697); match(BY);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1698); match(GROUP);
				setState(1699); match(EXCEPT);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1700); match(GROUP);
				setState(1701); match(ALL);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode STRING_CONSTANT() { return getToken(Vtl2Parser.STRING_CONSTANT, 0); }
		public TerminalNode BOOLEAN_CONSTANT() { return getToken(Vtl2Parser.BOOLEAN_CONSTANT, 0); }
		public TerminalNode INTEGER_CONSTANT() { return getToken(Vtl2Parser.INTEGER_CONSTANT, 0); }
		public TerminalNode NULL_CONSTANT() { return getToken(Vtl2Parser.NULL_CONSTANT, 0); }
		public TerminalNode FLOAT_CONSTANT() { return getToken(Vtl2Parser.FLOAT_CONSTANT, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			_la = _input.LA(1);
			if ( !(((((_la - 226)) & ~0x3f) == 0 && ((1L << (_la - 226)) & ((1L << (INTEGER_CONSTANT - 226)) | (1L << (FLOAT_CONSTANT - 226)) | (1L << (BOOLEAN_CONSTANT - 226)) | (1L << (NULL_CONSTANT - 226)) | (1L << (STRING_CONSTANT - 226)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentType2Context extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(Vtl2Parser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(Vtl2Parser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(Vtl2Parser.BOOLEAN, 0); }
		public TerminalNode DATE() { return getToken(Vtl2Parser.DATE, 0); }
		public TerminalNode FLOAT() { return getToken(Vtl2Parser.FLOAT, 0); }
		public ComponentType2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentType2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterComponentType2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitComponentType2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitComponentType2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentType2Context componentType2() throws RecognitionException {
		ComponentType2Context _localctx = new ComponentType2Context(_ctx, getState());
		enterRule(_localctx, 204, RULE_componentType2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			_la = _input.LA(1);
			if ( !(((((_la - 155)) & ~0x3f) == 0 && ((1L << (_la - 155)) & ((1L << (BOOLEAN - 155)) | (1L << (DATE - 155)) | (1L << (STRING - 155)) | (1L << (INTEGER - 155)) | (1L << (FLOAT - 155)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScalarTypeContext extends ParserRuleContext {
		public ScalarTypeConstraintContext scalarTypeConstraint() {
			return getRuleContext(ScalarTypeConstraintContext.class,0);
		}
		public TerminalNode NOT() { return getToken(Vtl2Parser.NOT, 0); }
		public BasicScalarTypeContext basicScalarType() {
			return getRuleContext(BasicScalarTypeContext.class,0);
		}
		public ValueDomainNameContext valueDomainName() {
			return getRuleContext(ValueDomainNameContext.class,0);
		}
		public SetNameContext setName() {
			return getRuleContext(SetNameContext.class,0);
		}
		public TerminalNode NULL_CONSTANT() { return getToken(Vtl2Parser.NULL_CONSTANT, 0); }
		public ScalarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterScalarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitScalarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitScalarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarTypeContext scalarType() throws RecognitionException {
		ScalarTypeContext _localctx = new ScalarTypeContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_scalarType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1711);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1708); basicScalarType();
				}
				break;

			case 2:
				{
				setState(1709); valueDomainName();
				}
				break;

			case 3:
				{
				setState(1710); setName();
				}
				break;
			}
			setState(1714);
			_la = _input.LA(1);
			if (_la==4 || _la==6) {
				{
				setState(1713); scalarTypeConstraint();
				}
			}

			setState(1720);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL_CONSTANT) {
				{
				setState(1717);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1716); match(NOT);
					}
				}

				setState(1719); match(NULL_CONSTANT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicScalarTypeContext extends ParserRuleContext {
		public TerminalNode DURATION() { return getToken(Vtl2Parser.DURATION, 0); }
		public TerminalNode INTEGER() { return getToken(Vtl2Parser.INTEGER, 0); }
		public TerminalNode TIME_PERIOD() { return getToken(Vtl2Parser.TIME_PERIOD, 0); }
		public TerminalNode TIME() { return getToken(Vtl2Parser.TIME, 0); }
		public TerminalNode STRING() { return getToken(Vtl2Parser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(Vtl2Parser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(Vtl2Parser.BOOLEAN, 0); }
		public TerminalNode DATE() { return getToken(Vtl2Parser.DATE, 0); }
		public TerminalNode SCALAR() { return getToken(Vtl2Parser.SCALAR, 0); }
		public BasicScalarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicScalarType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterBasicScalarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitBasicScalarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitBasicScalarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicScalarTypeContext basicScalarType() throws RecognitionException {
		BasicScalarTypeContext _localctx = new BasicScalarTypeContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_basicScalarType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			_la = _input.LA(1);
			if ( !(((((_la - 155)) & ~0x3f) == 0 && ((1L << (_la - 155)) & ((1L << (BOOLEAN - 155)) | (1L << (DATE - 155)) | (1L << (TIME_PERIOD - 155)) | (1L << (NUMBER - 155)) | (1L << (STRING - 155)) | (1L << (INTEGER - 155)) | (1L << (DURATION - 155)) | (1L << (SCALAR - 155)))) != 0) || _la==TIME) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueDomainNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public ValueDomainNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueDomainName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterValueDomainName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitValueDomainName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitValueDomainName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueDomainNameContext valueDomainName() throws RecognitionException {
		ValueDomainNameContext _localctx = new ValueDomainNameContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_valueDomainName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public SetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterSetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitSetName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitSetName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetNameContext setName() throws RecognitionException {
		SetNameContext _localctx = new SetNameContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_setName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScalarTypeConstraintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ScalarTypeConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarTypeConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterScalarTypeConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitScalarTypeConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitScalarTypeConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarTypeConstraintContext scalarTypeConstraint() throws RecognitionException {
		ScalarTypeConstraintContext _localctx = new ScalarTypeConstraintContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_scalarTypeConstraint);
		int _la;
		try {
			setState(1743);
			switch (_input.LA(1)) {
			case 6:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1728); match(6);
				setState(1729); expr(0);
				setState(1730); match(10);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1732); match(4);
				setState(1733); constant();
				setState(1738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CARTESIAN_PER) {
					{
					{
					setState(1734); match(CARTESIAN_PER);
					setState(1735); constant();
					}
					}
					setState(1740);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1741); match(8);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public DatasetTypeContext datasetType() {
			return getRuleContext(DatasetTypeContext.class,0);
		}
		public RulesetTypeContext rulesetType() {
			return getRuleContext(RulesetTypeContext.class,0);
		}
		public ComponentTypeContext componentType() {
			return getRuleContext(ComponentTypeContext.class,0);
		}
		public ScalarSetTypeContext scalarSetType() {
			return getRuleContext(ScalarSetTypeContext.class,0);
		}
		public OperatorTypeContext operatorType() {
			return getRuleContext(OperatorTypeContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_dataType);
		try {
			setState(1751);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1745); scalarType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1746); componentType();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1747); datasetType();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1748); scalarSetType();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1749); operatorType();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1750); rulesetType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentTypeContext extends ParserRuleContext {
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public ComponentRoleContext componentRole() {
			return getRuleContext(ComponentRoleContext.class,0);
		}
		public ComponentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterComponentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitComponentType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitComponentType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentTypeContext componentType() throws RecognitionException {
		ComponentTypeContext _localctx = new ComponentTypeContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_componentType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1753); componentRole();
			setState(1758);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(1754); match(7);
				setState(1755); scalarType();
				setState(1756); match(11);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatasetTypeContext extends ParserRuleContext {
		public CompConstraintContext compConstraint(int i) {
			return getRuleContext(CompConstraintContext.class,i);
		}
		public List<CompConstraintContext> compConstraint() {
			return getRuleContexts(CompConstraintContext.class);
		}
		public TerminalNode DATASET() { return getToken(Vtl2Parser.DATASET, 0); }
		public DatasetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasetType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterDatasetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitDatasetType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitDatasetType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatasetTypeContext datasetType() throws RecognitionException {
		DatasetTypeContext _localctx = new DatasetTypeContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_datasetType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760); match(DATASET);
			setState(1772);
			_la = _input.LA(1);
			if (_la==4) {
				{
				setState(1761); match(4);
				setState(1762); compConstraint();
				setState(1767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CARTESIAN_PER) {
					{
					{
					setState(1763); match(CARTESIAN_PER);
					setState(1764); compConstraint();
					}
					}
					setState(1769);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1770); match(8);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompConstraintContext extends ParserRuleContext {
		public ComponentIDContext componentID() {
			return getRuleContext(ComponentIDContext.class,0);
		}
		public MultModifierContext multModifier() {
			return getRuleContext(MultModifierContext.class,0);
		}
		public ComponentTypeContext componentType() {
			return getRuleContext(ComponentTypeContext.class,0);
		}
		public CompConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterCompConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitCompConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitCompConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompConstraintContext compConstraint() throws RecognitionException {
		CompConstraintContext _localctx = new CompConstraintContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_compConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774); componentType();
			setState(1777);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(1775); componentID();
				}
				break;
			case OPTIONAL:
				{
				setState(1776); multModifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultModifierContext extends ParserRuleContext {
		public MultModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterMultModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitMultModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitMultModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultModifierContext multModifier() throws RecognitionException {
		MultModifierContext _localctx = new MultModifierContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_multModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779); match(OPTIONAL);
			setState(1781);
			_la = _input.LA(1);
			if (_la==16 || _la==17) {
				{
				setState(1780);
				_la = _input.LA(1);
				if ( !(_la==16 || _la==17) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulesetTypeContext extends ParserRuleContext {
		public HrRulesetContext hrRuleset() {
			return getRuleContext(HrRulesetContext.class,0);
		}
		public TerminalNode RULESET() { return getToken(Vtl2Parser.RULESET, 0); }
		public DpRulesetContext dpRuleset() {
			return getRuleContext(DpRulesetContext.class,0);
		}
		public RulesetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulesetType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterRulesetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitRulesetType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitRulesetType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesetTypeContext rulesetType() throws RecognitionException {
		RulesetTypeContext _localctx = new RulesetTypeContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_rulesetType);
		try {
			setState(1786);
			switch (_input.LA(1)) {
			case RULESET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1783); match(RULESET);
				}
				break;
			case DATAPOINT:
			case DATAPOINT_ON_VD:
			case DATAPOINT_ON_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1784); dpRuleset();
				}
				break;
			case HIERARCHICAL:
			case HIERARCHICAL_ON_VD:
			case HIERARCHICAL_ON_VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1785); hrRuleset();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DpRulesetContext extends ParserRuleContext {
		public TerminalNode DATAPOINT_ON_VD() { return getToken(Vtl2Parser.DATAPOINT_ON_VD, 0); }
		public TerminalNode DATAPOINT_ON_VAR() { return getToken(Vtl2Parser.DATAPOINT_ON_VAR, 0); }
		public ProdVariablesContext prodVariables() {
			return getRuleContext(ProdVariablesContext.class,0);
		}
		public TerminalNode DATAPOINT() { return getToken(Vtl2Parser.DATAPOINT, 0); }
		public ProdValueDomainsContext prodValueDomains() {
			return getRuleContext(ProdValueDomainsContext.class,0);
		}
		public DpRulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dpRuleset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterDpRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitDpRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitDpRuleset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DpRulesetContext dpRuleset() throws RecognitionException {
		DpRulesetContext _localctx = new DpRulesetContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_dpRuleset);
		try {
			setState(1799);
			switch (_input.LA(1)) {
			case DATAPOINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1788); match(DATAPOINT);
				}
				break;
			case DATAPOINT_ON_VD:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1789); match(DATAPOINT_ON_VD);
				setState(1790); match(4);
				setState(1791); prodValueDomains();
				setState(1792); match(8);
				}
				}
				break;
			case DATAPOINT_ON_VAR:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1794); match(DATAPOINT_ON_VAR);
				setState(1795); match(4);
				setState(1796); prodVariables();
				setState(1797); match(8);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HrRulesetContext extends ParserRuleContext {
		public TerminalNode HIERARCHICAL_ON_VAR() { return getToken(Vtl2Parser.HIERARCHICAL_ON_VAR, 0); }
		public VarIDContext varID() {
			return getRuleContext(VarIDContext.class,0);
		}
		public ProdVariablesContext prodVariables() {
			return getRuleContext(ProdVariablesContext.class,0);
		}
		public TerminalNode HIERARCHICAL() { return getToken(Vtl2Parser.HIERARCHICAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public TerminalNode HIERARCHICAL_ON_VD() { return getToken(Vtl2Parser.HIERARCHICAL_ON_VD, 0); }
		public ProdValueDomainsContext prodValueDomains() {
			return getRuleContext(ProdValueDomainsContext.class,0);
		}
		public HrRulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hrRuleset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterHrRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitHrRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitHrRuleset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HrRulesetContext hrRuleset() throws RecognitionException {
		HrRulesetContext _localctx = new HrRulesetContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_hrRuleset);
		int _la;
		try {
			setState(1827);
			switch (_input.LA(1)) {
			case HIERARCHICAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1801); match(HIERARCHICAL);
				}
				break;
			case HIERARCHICAL_ON_VD:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1802); match(HIERARCHICAL_ON_VD);
				setState(1812);
				_la = _input.LA(1);
				if (_la==4) {
					{
					setState(1803); match(4);
					setState(1804); match(IDENTIFIER);
					setState(1809);
					_la = _input.LA(1);
					if (_la==14) {
						{
						setState(1805); match(14);
						setState(1806); prodValueDomains();
						setState(1807); match(15);
						}
					}

					setState(1811); match(8);
					}
				}

				}
				}
				break;
			case HIERARCHICAL_ON_VAR:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1814); match(HIERARCHICAL_ON_VAR);
				setState(1825);
				_la = _input.LA(1);
				if (_la==4) {
					{
					setState(1815); match(4);
					setState(1816); varID();
					setState(1821);
					_la = _input.LA(1);
					if (_la==14) {
						{
						setState(1817); match(14);
						setState(1818); prodVariables();
						setState(1819); match(15);
						}
					}

					setState(1823); match(8);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProdValueDomainsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Vtl2Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Vtl2Parser.IDENTIFIER); }
		public ProdValueDomainsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prodValueDomains; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterProdValueDomains(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitProdValueDomains(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitProdValueDomains(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProdValueDomainsContext prodValueDomains() throws RecognitionException {
		ProdValueDomainsContext _localctx = new ProdValueDomainsContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_prodValueDomains);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829); match(IDENTIFIER);
			setState(1834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==16) {
				{
				{
				setState(1830); match(16);
				setState(1831); match(IDENTIFIER);
				}
				}
				setState(1836);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProdVariablesContext extends ParserRuleContext {
		public List<VarIDContext> varID() {
			return getRuleContexts(VarIDContext.class);
		}
		public VarIDContext varID(int i) {
			return getRuleContext(VarIDContext.class,i);
		}
		public ProdVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prodVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterProdVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitProdVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitProdVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProdVariablesContext prodVariables() throws RecognitionException {
		ProdVariablesContext _localctx = new ProdVariablesContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_prodVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1837); varID();
			setState(1842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==16) {
				{
				{
				setState(1838); match(16);
				setState(1839); varID();
				}
				}
				setState(1844);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorTypeContext extends ParserRuleContext {
		public InputParameterTypeContext inputParameterType(int i) {
			return getRuleContext(InputParameterTypeContext.class,i);
		}
		public List<InputParameterTypeContext> inputParameterType() {
			return getRuleContexts(InputParameterTypeContext.class);
		}
		public OutputParameterTypeContext outputParameterType() {
			return getRuleContext(OutputParameterTypeContext.class,0);
		}
		public OperatorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterOperatorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitOperatorType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitOperatorType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorTypeContext operatorType() throws RecognitionException {
		OperatorTypeContext _localctx = new OperatorTypeContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_operatorType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1845); inputParameterType();
			setState(1850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==16) {
				{
				{
				setState(1846); match(16);
				setState(1847); inputParameterType();
				}
				}
				setState(1852);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1853); match(2);
			setState(1854); outputParameterType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputParameterTypeContext extends ParserRuleContext {
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public DatasetTypeContext datasetType() {
			return getRuleContext(DatasetTypeContext.class,0);
		}
		public ComponentTypeContext componentType() {
			return getRuleContext(ComponentTypeContext.class,0);
		}
		public InputParameterTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputParameterType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterInputParameterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitInputParameterType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitInputParameterType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputParameterTypeContext inputParameterType() throws RecognitionException {
		InputParameterTypeContext _localctx = new InputParameterTypeContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_inputParameterType);
		try {
			setState(1859);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case DATE:
			case TIME_PERIOD:
			case NUMBER:
			case STRING:
			case INTEGER:
			case DURATION:
			case SCALAR:
			case IDENTIFIER:
			case TIME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1856); scalarType();
				}
				break;
			case DATASET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1857); datasetType();
				}
				break;
			case DIMENSION:
			case MEASURE:
			case ATTRIBUTE:
			case VIRAL:
			case COMPONENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1858); componentType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputParameterTypeContext extends ParserRuleContext {
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public DatasetTypeContext datasetType() {
			return getRuleContext(DatasetTypeContext.class,0);
		}
		public RulesetTypeContext rulesetType() {
			return getRuleContext(RulesetTypeContext.class,0);
		}
		public ComponentTypeContext componentType() {
			return getRuleContext(ComponentTypeContext.class,0);
		}
		public ScalarSetTypeContext scalarSetType() {
			return getRuleContext(ScalarSetTypeContext.class,0);
		}
		public OutputParameterTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputParameterType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterOutputParameterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitOutputParameterType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitOutputParameterType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputParameterTypeContext outputParameterType() throws RecognitionException {
		OutputParameterTypeContext _localctx = new OutputParameterTypeContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_outputParameterType);
		try {
			setState(1866);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case DATE:
			case TIME_PERIOD:
			case NUMBER:
			case STRING:
			case INTEGER:
			case DURATION:
			case SCALAR:
			case IDENTIFIER:
			case TIME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1861); scalarType();
				}
				break;
			case DATASET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1862); datasetType();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(1863); scalarSetType();
				}
				break;
			case DATAPOINT:
			case HIERARCHICAL:
			case RULESET:
			case DATAPOINT_ON_VD:
			case DATAPOINT_ON_VAR:
			case HIERARCHICAL_ON_VD:
			case HIERARCHICAL_ON_VAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1864); rulesetType();
				}
				break;
			case DIMENSION:
			case MEASURE:
			case ATTRIBUTE:
			case VIRAL:
			case COMPONENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1865); componentType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScalarSetTypeContext extends ParserRuleContext {
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public TerminalNode SET() { return getToken(Vtl2Parser.SET, 0); }
		public ScalarSetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarSetType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterScalarSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitScalarSetType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitScalarSetType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarSetTypeContext scalarSetType() throws RecognitionException {
		ScalarSetTypeContext _localctx = new ScalarSetTypeContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_scalarSetType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1868); match(SET);
			setState(1873);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(1869); match(7);
				setState(1870); scalarType();
				setState(1871); match(11);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetainTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_CONSTANT() { return getToken(Vtl2Parser.BOOLEAN_CONSTANT, 0); }
		public TerminalNode ALL() { return getToken(Vtl2Parser.ALL, 0); }
		public RetainTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retainType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterRetainType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitRetainType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitRetainType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetainTypeContext retainType() throws RecognitionException {
		RetainTypeContext _localctx = new RetainTypeContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_retainType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1875);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==BOOLEAN_CONSTANT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineDatapointRulesetContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(Vtl2Parser.DEFINE, 0); }
		public TerminalNode DATAPOINT() { return getToken(Vtl2Parser.DATAPOINT, 0); }
		public TerminalNode RULESET() { return getToken(Vtl2Parser.RULESET, 0); }
		public DefineDatapointRulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineDatapointRuleset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterDefineDatapointRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitDefineDatapointRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitDefineDatapointRuleset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineDatapointRulesetContext defineDatapointRuleset() throws RecognitionException {
		DefineDatapointRulesetContext _localctx = new DefineDatapointRulesetContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_defineDatapointRuleset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1877); match(DEFINE);
			setState(1878); match(DATAPOINT);
			setState(1879); match(RULESET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineHierarchicalRulesetContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(Vtl2Parser.DEFINE, 0); }
		public TerminalNode HIERARCHICAL() { return getToken(Vtl2Parser.HIERARCHICAL, 0); }
		public TerminalNode RULESET() { return getToken(Vtl2Parser.RULESET, 0); }
		public DefineHierarchicalRulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineHierarchicalRuleset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterDefineHierarchicalRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitDefineHierarchicalRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitDefineHierarchicalRuleset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineHierarchicalRulesetContext defineHierarchicalRuleset() throws RecognitionException {
		DefineHierarchicalRulesetContext _localctx = new DefineHierarchicalRulesetContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_defineHierarchicalRuleset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1881); match(DEFINE);
			setState(1882); match(HIERARCHICAL);
			setState(1883); match(RULESET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndDatapointRulesetContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(Vtl2Parser.END, 0); }
		public TerminalNode DATAPOINT() { return getToken(Vtl2Parser.DATAPOINT, 0); }
		public TerminalNode RULESET() { return getToken(Vtl2Parser.RULESET, 0); }
		public EndDatapointRulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endDatapointRuleset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterEndDatapointRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitEndDatapointRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitEndDatapointRuleset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndDatapointRulesetContext endDatapointRuleset() throws RecognitionException {
		EndDatapointRulesetContext _localctx = new EndDatapointRulesetContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_endDatapointRuleset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1885); match(END);
			setState(1886); match(DATAPOINT);
			setState(1887); match(RULESET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndHierarchicalRulesetContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(Vtl2Parser.END, 0); }
		public TerminalNode HIERARCHICAL() { return getToken(Vtl2Parser.HIERARCHICAL, 0); }
		public TerminalNode RULESET() { return getToken(Vtl2Parser.RULESET, 0); }
		public EndHierarchicalRulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endHierarchicalRuleset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterEndHierarchicalRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitEndHierarchicalRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitEndHierarchicalRuleset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndHierarchicalRulesetContext endHierarchicalRuleset() throws RecognitionException {
		EndHierarchicalRulesetContext _localctx = new EndHierarchicalRulesetContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_endHierarchicalRuleset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1889); match(END);
			setState(1890); match(HIERARCHICAL);
			setState(1891); match(RULESET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineDataStructureContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(Vtl2Parser.DEFINE, 0); }
		public TerminalNode DATA() { return getToken(Vtl2Parser.DATA, 0); }
		public TerminalNode STRUCTURE() { return getToken(Vtl2Parser.STRUCTURE, 0); }
		public DefineDataStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineDataStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterDefineDataStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitDefineDataStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitDefineDataStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineDataStructureContext defineDataStructure() throws RecognitionException {
		DefineDataStructureContext _localctx = new DefineDataStructureContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_defineDataStructure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1893); match(DEFINE);
			setState(1894); match(DATA);
			setState(1895); match(STRUCTURE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefFunctionContext extends ParserRuleContext {
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode CREATE_FUNCTION() { return getToken(Vtl2Parser.CREATE_FUNCTION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunctionIDContext functionID() {
			return getRuleContext(FunctionIDContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(Vtl2Parser.RETURNS, 0); }
		public DimensionTypeContext dimensionType() {
			return getRuleContext(DimensionTypeContext.class,0);
		}
		public TerminalNode AS() { return getToken(Vtl2Parser.AS, 0); }
		public DefFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterDefFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitDefFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitDefFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefFunctionContext defFunction() throws RecognitionException {
		DefFunctionContext _localctx = new DefFunctionContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_defFunction);
		try {
			setState(1931);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1897); match(CREATE_FUNCTION);
				setState(1898); functionID();
				setState(1899); match(14);
				setState(1900); argList();
				setState(1901); match(15);
				setState(1902); match(RETURNS);
				setState(1903); dimensionType();
				setState(1904); match(AS);
				setState(1905); expr(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1907); match(CREATE_FUNCTION);
				setState(1908); functionID();
				setState(1909); match(14);
				setState(1910); argList();
				setState(1911); match(15);
				setState(1912); match(4);
				setState(1913); match(RETURNS);
				setState(1914); dimensionType();
				setState(1915); match(AS);
				setState(1916); expr(0);
				setState(1917); match(8);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1919); match(CREATE_FUNCTION);
				setState(1920); functionID();
				setState(1921); match(14);
				setState(1922); argList();
				setState(1923); match(15);
				setState(1924); match(4);
				setState(1925); match(RETURNS);
				setState(1926); expr(0);
				setState(1927); match(AS);
				setState(1928); dimensionType();
				setState(1929); match(8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefProcedureContext extends ParserRuleContext {
		public ProcedureIDContext procedureID() {
			return getRuleContext(ProcedureIDContext.class,0);
		}
		public TerminalNode DEFINE_PROCEDURE() { return getToken(Vtl2Parser.DEFINE_PROCEDURE, 0); }
		public ProcedureArgListContext procedureArgList() {
			return getRuleContext(ProcedureArgListContext.class,0);
		}
		public ProcedureBodyContext procedureBody() {
			return getRuleContext(ProcedureBodyContext.class,0);
		}
		public DefProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defProcedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterDefProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitDefProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitDefProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefProcedureContext defProcedure() throws RecognitionException {
		DefProcedureContext _localctx = new DefProcedureContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_defProcedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1933); match(DEFINE_PROCEDURE);
			setState(1934); procedureID();
			setState(1935); match(14);
			setState(1936); procedureArgList();
			setState(1937); match(15);
			setState(1938); procedureBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureBodyContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ProcedureBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterProcedureBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitProcedureBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitProcedureBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureBodyContext procedureBody() throws RecognitionException {
		ProcedureBodyContext _localctx = new ProcedureBodyContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_procedureBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1940); match(4);
			setState(1941); statements();
			setState(1942); match(8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIDContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public FunctionIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterFunctionID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitFunctionID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitFunctionID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIDContext functionID() throws RecognitionException {
		FunctionIDContext _localctx = new FunctionIDContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_functionID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1944); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureIDContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public ProcedureIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterProcedureID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitProcedureID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitProcedureID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureIDContext procedureID() throws RecognitionException {
		ProcedureIDContext _localctx = new ProcedureIDContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_procedureID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1946); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgListContext extends ParserRuleContext {
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1948); arg();
			setState(1953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(1949); match(CARTESIAN_PER);
				setState(1950); arg();
				}
				}
				setState(1955);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(Vtl2Parser.ASSIGN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public DimensionTypeContext dimensionType() {
			return getRuleContext(DimensionTypeContext.class,0);
		}
		public TerminalNode AS() { return getToken(Vtl2Parser.AS, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1956); match(IDENTIFIER);
			setState(1959);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1957); match(AS);
				setState(1958); dimensionType();
				}
			}

			setState(1963);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1961); match(ASSIGN);
				setState(1962); constant();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureArgListContext extends ParserRuleContext {
		public List<ProcedureArgContext> procedureArg() {
			return getRuleContexts(ProcedureArgContext.class);
		}
		public ProcedureArgContext procedureArg(int i) {
			return getRuleContext(ProcedureArgContext.class,i);
		}
		public ProcedureArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterProcedureArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitProcedureArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitProcedureArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureArgListContext procedureArgList() throws RecognitionException {
		ProcedureArgListContext _localctx = new ProcedureArgListContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_procedureArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1965); procedureArg();
			setState(1970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARTESIAN_PER) {
				{
				{
				setState(1966); match(CARTESIAN_PER);
				setState(1967); procedureArg();
				}
				}
				setState(1972);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureArgContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(Vtl2Parser.OUTPUT, 0); }
		public TerminalNode INPUT() { return getToken(Vtl2Parser.INPUT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Vtl2Parser.IDENTIFIER, 0); }
		public DimensionTypeContext dimensionType() {
			return getRuleContext(DimensionTypeContext.class,0);
		}
		public TerminalNode AS() { return getToken(Vtl2Parser.AS, 0); }
		public ProcedureArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterProcedureArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitProcedureArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitProcedureArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureArgContext procedureArg() throws RecognitionException {
		ProcedureArgContext _localctx = new ProcedureArgContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_procedureArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1973);
			_la = _input.LA(1);
			if ( !(_la==INPUT || _la==OUTPUT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1974); match(IDENTIFIER);
			{
			setState(1975); match(AS);
			setState(1976); dimensionType();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionTypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(Vtl2Parser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(Vtl2Parser.STRING, 0); }
		public TerminalNode DATE() { return getToken(Vtl2Parser.DATE, 0); }
		public TerminalNode NUMBER() { return getToken(Vtl2Parser.NUMBER, 0); }
		public TerminalNode DATASET() { return getToken(Vtl2Parser.DATASET, 0); }
		public DimensionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterDimensionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitDimensionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitDimensionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionTypeContext dimensionType() throws RecognitionException {
		DimensionTypeContext _localctx = new DimensionTypeContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_dimensionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1978);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (DATASET - 108)) | (1L << (DATE - 108)) | (1L << (NUMBER - 108)) | (1L << (STRING - 108)) | (1L << (INTEGER - 108)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(Vtl2Parser.NL); }
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(Vtl2Parser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(Vtl2Parser.EOL, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode NL(int i) {
			return getToken(Vtl2Parser.NL, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1981);
			_la = _input.LA(1);
			if (_la==ML_COMMENT) {
				{
				setState(1980); comment();
				}
			}

			setState(1983); statement();
			setState(1985);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(1984); match(EOL);
				}
			}

			setState(1988);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(1987); match(NL);
				}
			}

			setState(2002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << 17) | (1L << 18) | (1L << EVAL) | (1L << IF) | (1L << CURRENT_DATE) | (1L << NOT) | (1L << BETWEEN) | (1L << ISNULL) | (1L << UNION) | (1L << SYMDIFF) | (1L << INTERSECT) | (1L << CHECK) | (1L << EXISTS_IN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANK - 64)) | (1L << (MIN - 64)) | (1L << (MAX - 64)) | (1L << (ABS - 64)) | (1L << (LN - 64)) | (1L << (LOG - 64)) | (1L << (TRUNC - 64)) | (1L << (ROUND - 64)) | (1L << (POWER - 64)) | (1L << (MOD - 64)) | (1L << (LEN - 64)) | (1L << (TRIM - 64)) | (1L << (UCASE - 64)) | (1L << (LCASE - 64)) | (1L << (SUBSTR - 64)) | (1L << (SUM - 64)) | (1L << (AVG - 64)) | (1L << (MEDIAN - 64)) | (1L << (COUNT - 64)) | (1L << (EXP - 64)) | (1L << (CHARSET_MATCH - 64)) | (1L << (NVL - 64)) | (1L << (HIERARCHY - 64)) | (1L << (DEFINE - 64)) | (1L << (LTRIM - 64)) | (1L << (RTRIM - 64)) | (1L << (INSTR - 64)) | (1L << (REPLACE - 64)) | (1L << (CEIL - 64)) | (1L << (FLOOR - 64)) | (1L << (SQRT - 64)) | (1L << (SETDIFF - 64)) | (1L << (STDDEV_POP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (STDDEV_SAMP - 128)) | (1L << (VAR_POP - 128)) | (1L << (VAR_SAMP - 128)) | (1L << (FIRST_VALUE - 128)) | (1L << (LAST_VALUE - 128)) | (1L << (LAG - 128)) | (1L << (LEAD - 128)) | (1L << (RATIO_TO_REPORT - 128)) | (1L << (FILL_TIME_SERIES - 128)) | (1L << (FLOW_TO_STOCK - 128)) | (1L << (STOCK_TO_FLOW - 128)) | (1L << (TIMESHIFT - 128)) | (1L << (INNER_JOIN - 128)) | (1L << (LEFT_JOIN - 128)) | (1L << (CROSS_JOIN - 128)) | (1L << (FULL_JOIN - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (PERIOD_INDICATOR - 193)) | (1L << (TIME_AGG - 193)) | (1L << (CAST - 193)) | (1L << (CHECK_DATAPOINT - 193)) | (1L << (CHECK_HIERARCHY - 193)) | (1L << (INTEGER_CONSTANT - 193)) | (1L << (FLOAT_CONSTANT - 193)) | (1L << (BOOLEAN_CONSTANT - 193)) | (1L << (NULL_CONSTANT - 193)) | (1L << (STRING_CONSTANT - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (ML_COMMENT - 193)) | (1L << (CREATE_FUNCTION - 193)))) != 0)) {
				{
				{
				setState(1991);
				_la = _input.LA(1);
				if (_la==ML_COMMENT) {
					{
					setState(1990); comment();
					}
				}

				setState(1993); statement();
				setState(1995);
				_la = _input.LA(1);
				if (_la==EOL) {
					{
					setState(1994); match(EOL);
					}
				}

				setState(1998);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(1997); match(NL);
					}
				}

				}
				}
				setState(2004);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode ML_COMMENT() { return getToken(Vtl2Parser.ML_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Vtl2Listener ) ((Vtl2Listener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Vtl2Visitor ) return ((Vtl2Visitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2005); match(ML_COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 15);

		case 1: return precpred(_ctx, 14);

		case 2: return precpred(_ctx, 13);

		case 3: return precpred(_ctx, 9);

		case 4: return precpred(_ctx, 8);

		case 5: return precpred(_ctx, 7);

		case 6: return precpred(_ctx, 3);

		case 7: return precpred(_ctx, 12);

		case 8: return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0100\u07da\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\3\2\5"+
		"\2\u011c\n\2\3\2\7\2\u011f\n\2\f\2\16\2\u0122\13\2\3\2\7\2\u0125\n\2\f"+
		"\2\16\2\u0128\13\2\3\2\7\2\u012b\n\2\f\2\16\2\u012e\13\2\3\2\5\2\u0131"+
		"\n\2\3\2\3\2\3\2\5\2\u0136\n\2\3\3\3\3\3\3\5\3\u013b\n\3\3\3\3\3\5\3\u013f"+
		"\n\3\3\4\3\4\3\4\3\4\3\5\3\5\5\5\u0147\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u0153\n\6\3\6\3\6\7\6\u0157\n\6\f\6\16\6\u015a\13\6\3"+
		"\6\3\6\5\6\u015e\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0167\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0176\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u0191\n\6\3\6\3\6\3\6\3\6\5\6\u0197\n\6\7\6\u0199"+
		"\n\6\f\6\16\6\u019c\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u01a9\n\7\3\b\3\b\3\b\3\b\5\b\u01af\n\b\3\b\3\b\3\b\5\b\u01b4\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u01c2\n\n\f\n\16\n"+
		"\u01c5\13\n\3\13\3\13\5\13\u01c9\n\13\3\13\3\13\5\13\u01cd\n\13\3\13\5"+
		"\13\u01d0\n\13\3\f\3\f\5\f\u01d4\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u01dd"+
		"\n\r\3\r\3\r\3\r\3\r\5\r\u01e3\n\r\7\r\u01e5\n\r\f\r\16\r\u01e8\13\r\3"+
		"\16\3\16\3\16\3\16\5\16\u01ee\n\16\3\16\3\16\3\16\7\16\u01f3\n\16\f\16"+
		"\16\16\u01f6\13\16\3\17\5\17\u01f9\n\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0200\n\17\3\20\3\20\5\20\u0204\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\7\22\u0212\n\22\f\22\16\22\u0215\13\22\3"+
		"\23\3\23\5\23\u0219\n\23\3\23\3\23\3\23\3\23\5\23\u021f\n\23\3\23\3\23"+
		"\5\23\u0223\n\23\3\23\5\23\u0226\n\23\3\24\3\24\3\24\3\24\7\24\u022c\n"+
		"\24\f\24\16\24\u022f\13\24\3\25\3\25\3\25\5\25\u0234\n\25\3\26\3\26\3"+
		"\26\5\26\u0239\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0242\n\27"+
		"\f\27\16\27\u0245\13\27\5\27\u0247\n\27\3\27\3\27\3\27\5\27\u024c\n\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0257\n\30\3\31\3\31"+
		"\3\31\3\31\5\31\u025d\n\31\3\31\3\31\3\31\5\31\u0262\n\31\7\31\u0264\n"+
		"\31\f\31\16\31\u0267\13\31\5\31\u0269\n\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\5\31\u0271\n\31\3\31\3\31\3\31\5\31\u0276\n\31\7\31\u0278\n\31\f\31"+
		"\16\31\u027b\13\31\5\31\u027d\n\31\3\31\3\31\5\31\u0281\n\31\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0288\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u02b1\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u02ed\n\32\3\32\3\32\5\32"+
		"\u02f1\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u02fc\n"+
		"\32\3\32\3\32\5\32\u0300\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u030b\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u033a\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u0342\n\33\3\34\3\34\3\34\3\34\7\34\u0348\n\34\f\34\16"+
		"\34\u034b\13\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u0353\n\35\f\35\16"+
		"\35\u0356\13\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u035e\n\35\f\35\16"+
		"\35\u0361\13\35\3\35\3\35\5\35\u0365\n\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u036d\n\36\3\36\3\36\3\36\5\36\u0372\n\36\7\36\u0374\n\36\f\36\16"+
		"\36\u0377\13\36\3\36\3\36\3\36\5\36\u037c\n\36\3\36\3\36\5\36\u0380\n"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u038a\n\37\3\37\3\37"+
		"\5\37\u038e\n\37\3\37\3\37\3 \3 \3 \5 \u0395\n \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u03a5\n\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u03ae"+
		"\n#\3#\3#\3#\5#\u03b3\n#\5#\u03b5\n#\3#\3#\5#\u03b9\n#\3#\3#\3$\3$\3$"+
		"\3$\5$\u03c1\n$\3$\5$\u03c4\n$\3$\3$\5$\u03c8\n$\3$\5$\u03cb\n$\3$\3$"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u03d8\n%\f%\16%\u03db\13%\5%\u03dd\n%\3"+
		"%\5%\u03e0\n%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u03ed\n&\f&\16&\u03f0"+
		"\13&\5&\u03f2\n&\3&\3&\5&\u03f6\n&\3&\5&\u03f9\n&\3&\5&\u03fc\n&\3&\5"+
		"&\u03ff\n&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u0412"+
		"\n)\f)\16)\u0415\13)\5)\u0417\n)\3)\3)\5)\u041b\n)\3)\3)\5)\u041f\n)\3"+
		")\3)\5)\u0423\n)\3)\3)\5)\u0427\n)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\5*\u0435\n*\3+\3+\5+\u0439\n+\3+\3+\5+\u043d\n+\3+\3+\7+\u0441\n+\f"+
		"+\16+\u0444\13+\3+\3+\3+\5+\u0449\n+\3+\5+\u044c\n+\3+\5+\u044f\n+\3+"+
		"\3+\3+\3,\3,\3,\3,\3,\7,\u0459\n,\f,\16,\u045c\13,\3-\3-\3-\3-\5-\u0462"+
		"\n-\3-\3-\3-\5-\u0467\n-\7-\u0469\n-\f-\16-\u046c\13-\3.\3.\3.\5.\u0471"+
		"\n.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0483\n/\3\60\3"+
		"\60\3\60\3\60\5\60\u0489\n\60\3\60\3\60\3\61\3\61\3\61\5\61\u0490\n\61"+
		"\3\61\3\61\3\61\3\61\5\61\u0496\n\61\7\61\u0498\n\61\f\61\16\61\u049b"+
		"\13\61\3\61\3\61\3\61\3\61\7\61\u04a1\n\61\f\61\16\61\u04a4\13\61\5\61"+
		"\u04a6\n\61\3\62\5\62\u04a9\n\62\3\62\3\62\3\62\5\62\u04ae\n\62\3\62\3"+
		"\62\5\62\u04b2\n\62\3\62\5\62\u04b5\n\62\3\63\5\63\u04b8\n\63\3\63\3\63"+
		"\3\63\7\63\u04bd\n\63\f\63\16\63\u04c0\13\63\3\64\3\64\5\64\u04c4\n\64"+
		"\3\64\3\64\3\64\5\64\u04c9\n\64\3\64\7\64\u04cc\n\64\f\64\16\64\u04cf"+
		"\13\64\3\65\3\65\3\65\3\65\3\66\5\66\u04d6\n\66\3\66\3\66\3\66\3\66\7"+
		"\66\u04dc\n\66\f\66\16\66\u04df\13\66\3\66\5\66\u04e2\n\66\3\66\5\66\u04e5"+
		"\n\66\3\67\5\67\u04e8\n\67\3\67\3\67\3\67\7\67\u04ed\n\67\f\67\16\67\u04f0"+
		"\13\67\38\38\38\38\39\39\39\39\79\u04fa\n9\f9\169\u04fd\139\3:\3:\3:\3"+
		":\7:\u0503\n:\f:\16:\u0506\13:\3;\3;\3;\5;\u050b\n;\3<\3<\3<\3<\5<\u0511"+
		"\n<\3<\3<\3<\3<\3<\5<\u0518\n<\3<\3<\3<\3<\3<\5<\u051f\n<\3<\3<\3<\3<"+
		"\3<\5<\u0526\n<\3<\3<\7<\u052a\n<\f<\16<\u052d\13<\3=\3=\3=\3>\3>\3?\3"+
		"?\3?\7?\u0537\n?\f?\16?\u053a\13?\3@\5@\u053d\n@\3@\3@\3@\3@\3A\3A\3A"+
		"\7A\u0546\nA\fA\16A\u0549\13A\3B\5B\u054c\nB\3B\3B\3C\3C\3C\5C\u0553\n"+
		"C\3C\5C\u0556\nC\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\7E\u0563\nE\fE\16E\u0566"+
		"\13E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0575\nF\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u05a0\nF\3G\3G\3G\3G\7G\u05a6"+
		"\nG\fG\16G\u05a9\13G\3H\5H\u05ac\nH\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\5I\u05b8"+
		"\nI\3J\3J\3J\3J\7J\u05be\nJ\fJ\16J\u05c1\13J\3K\3K\3K\3K\3K\5K\u05c8\n"+
		"K\3L\3L\3L\3L\7L\u05ce\nL\fL\16L\u05d1\13L\3M\3M\3M\3M\3M\5M\u05d8\nM"+
		"\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\7P\u05ed\nP"+
		"\fP\16P\u05f0\13P\3Q\3Q\3Q\5Q\u05f5\nQ\3Q\3Q\3Q\5Q\u05fa\nQ\5Q\u05fc\n"+
		"Q\3R\3R\3R\3R\3R\7R\u0603\nR\fR\16R\u0606\13R\3R\3R\3R\3R\3R\3R\3R\3R"+
		"\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\7R\u061d\nR\fR\16R\u0620\13R\3"+
		"R\3R\5R\u0624\nR\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0630\nS\3S\3S\3T\3"+
		"T\3T\3T\3T\5T\u0639\nT\3T\3T\3T\3T\5T\u063f\nT\7T\u0641\nT\fT\16T\u0644"+
		"\13T\3T\5T\u0647\nT\3T\5T\u064a\nT\3T\3T\3U\3U\3U\3U\3U\5U\u0653\nU\3"+
		"U\3U\3U\3U\5U\u0659\nU\7U\u065b\nU\fU\16U\u065e\13U\3U\3U\5U\u0662\nU"+
		"\3U\5U\u0665\nU\3V\3V\3W\3W\3W\3W\7W\u066d\nW\fW\16W\u0670\13W\3W\5W\u0673"+
		"\nW\3X\3X\5X\u0677\nX\3X\5X\u067a\nX\3X\3X\5X\u067e\nX\3Y\3Y\3Y\3Y\3Y"+
		"\3Z\3Z\3Z\3Z\3Z\5Z\u068a\nZ\3[\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3"+
		"a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3f\3f\3f\3f\5f\u06a9\nf\3g\3g\3h\3"+
		"h\3i\3i\3i\5i\u06b2\ni\3i\5i\u06b5\ni\3i\5i\u06b8\ni\3i\5i\u06bb\ni\3"+
		"j\3j\3k\3k\3l\3l\3m\3m\3m\3m\3m\3m\3m\3m\7m\u06cb\nm\fm\16m\u06ce\13m"+
		"\3m\3m\5m\u06d2\nm\3n\3n\3n\3n\3n\3n\5n\u06da\nn\3o\3o\3o\3o\3o\5o\u06e1"+
		"\no\3p\3p\3p\3p\3p\7p\u06e8\np\fp\16p\u06eb\13p\3p\3p\5p\u06ef\np\3q\3"+
		"q\3q\5q\u06f4\nq\3r\3r\5r\u06f8\nr\3s\3s\3s\5s\u06fd\ns\3t\3t\3t\3t\3"+
		"t\3t\3t\3t\3t\3t\3t\5t\u070a\nt\3u\3u\3u\3u\3u\3u\3u\3u\5u\u0714\nu\3"+
		"u\5u\u0717\nu\3u\3u\3u\3u\3u\3u\3u\5u\u0720\nu\3u\3u\5u\u0724\nu\5u\u0726"+
		"\nu\3v\3v\3v\7v\u072b\nv\fv\16v\u072e\13v\3w\3w\3w\7w\u0733\nw\fw\16w"+
		"\u0736\13w\3x\3x\3x\7x\u073b\nx\fx\16x\u073e\13x\3x\3x\3x\3y\3y\3y\5y"+
		"\u0746\ny\3z\3z\3z\3z\3z\5z\u074d\nz\3{\3{\3{\3{\3{\5{\u0754\n{\3|\3|"+
		"\3}\3}\3}\3}\3~\3~\3~\3~\3\177\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\5\u0082\u078e\n\u0082\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085"+
		"\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\7\u0087\u07a2\n\u0087"+
		"\f\u0087\16\u0087\u07a5\13\u0087\3\u0088\3\u0088\3\u0088\5\u0088\u07aa"+
		"\n\u0088\3\u0088\3\u0088\5\u0088\u07ae\n\u0088\3\u0089\3\u0089\3\u0089"+
		"\7\u0089\u07b3\n\u0089\f\u0089\16\u0089\u07b6\13\u0089\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\5\u008c\u07c0\n\u008c"+
		"\3\u008c\3\u008c\5\u008c\u07c4\n\u008c\3\u008c\5\u008c\u07c7\n\u008c\3"+
		"\u008c\5\u008c\u07ca\n\u008c\3\u008c\3\u008c\5\u008c\u07ce\n\u008c\3\u008c"+
		"\5\u008c\u07d1\n\u008c\7\u008c\u07d3\n\u008c\f\u008c\16\u008c\u07d6\13"+
		"\u008c\3\u008d\3\u008d\3\u008d\3\u052b\3\n\u008e\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\2 \4\2\23\24((\4\2\3\3\22\22\3\2"+
		"\23\24\6\2\7\7\t\t\13\13\r\17\4\2\13\13\17\17\3\2&\'\3\2*+\3\2jk\6\2\7"+
		"\7\t\t\13\13\r\16\4\2==\u00c4\u00c4\4\2hh\u00ea\u00ea\3\2GH\4\2==ii\5"+
		"\2==ii\u00db\u00db\3\2\u00d4\u00d9\4\2nn\u00cf\u00cf\5\2nnuu\u00ce\u00ce"+
		"\4\2==\u00d3\u00d3\3\2CD\4\2BB\u0088\u008c\5\2EFX[\u0081\u0084\4\2\u00e4"+
		"\u00e4\u00e7\u00e7\3\2\u00b5\u00b8\4\2\u00e4\u00e4\u00e7\u00ea\4\2\u009d"+
		"\u009e\u00a1\u00a3\6\2\u009d\u00a2\u00c5\u00c5\u00dc\u00dc\u00f7\u00f7"+
		"\3\2\22\23\4\2==\u00e8\u00e8\3\2\u00cb\u00cc\5\2nn\u009e\u009e\u00a0\u00a2"+
		"\u0892\2\u0135\3\2\2\2\4\u013e\3\2\2\2\6\u0140\3\2\2\2\b\u0146\3\2\2\2"+
		"\n\u0175\3\2\2\2\f\u01a8\3\2\2\2\16\u01b3\3\2\2\2\20\u01b5\3\2\2\2\22"+
		"\u01be\3\2\2\2\24\u01c8\3\2\2\2\26\u01d1\3\2\2\2\30\u01d8\3\2\2\2\32\u01ed"+
		"\3\2\2\2\34\u01f8\3\2\2\2\36\u0201\3\2\2\2 \u0205\3\2\2\2\"\u020e\3\2"+
		"\2\2$\u0218\3\2\2\2&\u0227\3\2\2\2(\u0230\3\2\2\2*\u0238\3\2\2\2,\u023a"+
		"\3\2\2\2.\u0252\3\2\2\2\60\u0280\3\2\2\2\62\u0339\3\2\2\2\64\u0341\3\2"+
		"\2\2\66\u0343\3\2\2\28\u0364\3\2\2\2:\u0366\3\2\2\2<\u0383\3\2\2\2>\u0391"+
		"\3\2\2\2@\u0398\3\2\2\2B\u039f\3\2\2\2D\u03a8\3\2\2\2F\u03bc\3\2\2\2H"+
		"\u03ce\3\2\2\2J\u03e3\3\2\2\2L\u0402\3\2\2\2N\u0405\3\2\2\2P\u0408\3\2"+
		"\2\2R\u0434\3\2\2\2T\u0438\3\2\2\2V\u0453\3\2\2\2X\u045d\3\2\2\2Z\u0470"+
		"\3\2\2\2\\\u0482\3\2\2\2^\u0484\3\2\2\2`\u048c\3\2\2\2b\u04a8\3\2\2\2"+
		"d\u04b7\3\2\2\2f\u04c1\3\2\2\2h\u04d0\3\2\2\2j\u04d5\3\2\2\2l\u04e7\3"+
		"\2\2\2n\u04f1\3\2\2\2p\u04f5\3\2\2\2r\u04fe\3\2\2\2t\u050a\3\2\2\2v\u050c"+
		"\3\2\2\2x\u052e\3\2\2\2z\u0531\3\2\2\2|\u0533\3\2\2\2~\u053c\3\2\2\2\u0080"+
		"\u0542\3\2\2\2\u0082\u054b\3\2\2\2\u0084\u054f\3\2\2\2\u0086\u0557\3\2"+
		"\2\2\u0088\u055a\3\2\2\2\u008a\u059f\3\2\2\2\u008c\u05a1\3\2\2\2\u008e"+
		"\u05ab\3\2\2\2\u0090\u05b7\3\2\2\2\u0092\u05b9\3\2\2\2\u0094\u05c7\3\2"+
		"\2\2\u0096\u05c9\3\2\2\2\u0098\u05d7\3\2\2\2\u009a\u05d9\3\2\2\2\u009c"+
		"\u05de\3\2\2\2\u009e\u05e3\3\2\2\2\u00a0\u05fb\3\2\2\2\u00a2\u0623\3\2"+
		"\2\2\u00a4\u0625\3\2\2\2\u00a6\u0633\3\2\2\2\u00a8\u064d\3\2\2\2\u00aa"+
		"\u0666\3\2\2\2\u00ac\u0668\3\2\2\2\u00ae\u0674\3\2\2\2\u00b0\u067f\3\2"+
		"\2\2\u00b2\u0689\3\2\2\2\u00b4\u068b\3\2\2\2\u00b6\u068e\3\2\2\2\u00b8"+
		"\u0690\3\2\2\2\u00ba\u0692\3\2\2\2\u00bc\u0694\3\2\2\2\u00be\u0696\3\2"+
		"\2\2\u00c0\u0698\3\2\2\2\u00c2\u069a\3\2\2\2\u00c4\u069c\3\2\2\2\u00c6"+
		"\u069e\3\2\2\2\u00c8\u06a0\3\2\2\2\u00ca\u06a8\3\2\2\2\u00cc\u06aa\3\2"+
		"\2\2\u00ce\u06ac\3\2\2\2\u00d0\u06b1\3\2\2\2\u00d2\u06bc\3\2\2\2\u00d4"+
		"\u06be\3\2\2\2\u00d6\u06c0\3\2\2\2\u00d8\u06d1\3\2\2\2\u00da\u06d9\3\2"+
		"\2\2\u00dc\u06db\3\2\2\2\u00de\u06e2\3\2\2\2\u00e0\u06f0\3\2\2\2\u00e2"+
		"\u06f5\3\2\2\2\u00e4\u06fc\3\2\2\2\u00e6\u0709\3\2\2\2\u00e8\u0725\3\2"+
		"\2\2\u00ea\u0727\3\2\2\2\u00ec\u072f\3\2\2\2\u00ee\u0737\3\2\2\2\u00f0"+
		"\u0745\3\2\2\2\u00f2\u074c\3\2\2\2\u00f4\u074e\3\2\2\2\u00f6\u0755\3\2"+
		"\2\2\u00f8\u0757\3\2\2\2\u00fa\u075b\3\2\2\2\u00fc\u075f\3\2\2\2\u00fe"+
		"\u0763\3\2\2\2\u0100\u0767\3\2\2\2\u0102\u078d\3\2\2\2\u0104\u078f\3\2"+
		"\2\2\u0106\u0796\3\2\2\2\u0108\u079a\3\2\2\2\u010a\u079c\3\2\2\2\u010c"+
		"\u079e\3\2\2\2\u010e\u07a6\3\2\2\2\u0110\u07af\3\2\2\2\u0112\u07b7\3\2"+
		"\2\2\u0114\u07bc\3\2\2\2\u0116\u07bf\3\2\2\2\u0118\u07d7\3\2\2\2\u011a"+
		"\u011c\5\4\3\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0120\3\2"+
		"\2\2\u011d\u011f\7\u00fa\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0126\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0123\u0125\7\u00fb\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0129\u012b\7\u00f9\2\2\u012a\u011b\3\2\2\2\u012b\u012e\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012f\u0131\5\4\3\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0136\7\2\2\3\u0133\u0136\7\u00fa\2\2\u0134\u0136"+
		"\7\u00fb\2\2\u0135\u012c\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2"+
		"\2\u0136\3\3\2\2\2\u0137\u0138\5\u00c0a\2\u0138\u0139\7\25\2\2\u0139\u013b"+
		"\3\2\2\2\u013a\u0137\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013f\5\n\6\2\u013d\u013f\5\6\4\2\u013e\u013a\3\2\2\2\u013e\u013d\3\2"+
		"\2\2\u013f\5\3\2\2\2\u0140\u0141\5\u00c0a\2\u0141\u0142\7q\2\2\u0142\u0143"+
		"\5\n\6\2\u0143\7\3\2\2\2\u0144\u0147\5\n\6\2\u0145\u0147\7h\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\t\3\2\2\2\u0148\u0149\b\6\1\2"+
		"\u0149\u014a\t\2\2\2\u014a\u0176\5\n\6\22\u014b\u0158\5\62\32\2\u014c"+
		"\u0152\7\b\2\2\u014d\u0153\5R*\2\u014e\u014f\5\n\6\2\u014f\u0150\7\25"+
		"\2\2\u0150\u0151\5\n\6\2\u0151\u0153\3\2\2\2\u0152\u014d\3\2\2\2\u0152"+
		"\u014e\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\7\f\2\2\u0155\u0157\3\2"+
		"\2\2\u0156\u014c\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015d\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7\26"+
		"\2\2\u015c\u015e\5\u00c2b\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u0176\3\2\2\2\u015f\u0160\78\2\2\u0160\u0161\7\20\2\2\u0161\u0162\5\n"+
		"\6\2\u0162\u0163\7\63\2\2\u0163\u0166\5\n\6\2\u0164\u0165\7\63\2\2\u0165"+
		"\u0167\5\u00f6|\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168"+
		"\3\2\2\2\u0168\u0169\7\21\2\2\u0169\u0176\3\2\2\2\u016a\u016b\7\30\2\2"+
		"\u016b\u016c\5\n\6\2\u016c\u016d\7\31\2\2\u016d\u016e\5\n\6\2\u016e\u016f"+
		"\7\32\2\2\u016f\u0170\5\n\6\2\u0170\u0176\3\2\2\2\u0171\u0176\5\f\7\2"+
		"\u0172\u0176\5\62\32\2\u0173\u0176\5\u00ccg\2\u0174\u0176\7\u00eb\2\2"+
		"\u0175\u0148\3\2\2\2\u0175\u014b\3\2\2\2\u0175\u015f\3\2\2\2\u0175\u016a"+
		"\3\2\2\2\u0175\u0171\3\2\2\2\u0175\u0172\3\2\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0174\3\2\2\2\u0176\u019a\3\2\2\2\u0177\u0178\f\21\2\2\u0178\u0179\t"+
		"\3\2\2\u0179\u0199\5\n\6\22\u017a\u017b\f\20\2\2\u017b\u017c\t\4\2\2\u017c"+
		"\u0199\5\n\6\21\u017d\u017e\f\17\2\2\u017e\u017f\t\5\2\2\u017f\u0199\5"+
		"\n\6\20\u0180\u0181\f\13\2\2\u0181\u0182\t\6\2\2\u0182\u0199\5\n\6\f\u0183"+
		"\u0184\f\n\2\2\u0184\u0185\7%\2\2\u0185\u0199\5\n\6\13\u0186\u0187\f\t"+
		"\2\2\u0187\u0188\t\7\2\2\u0188\u0199\5\n\6\n\u0189\u018a\f\5\2\2\u018a"+
		"\u018b\7S\2\2\u018b\u0199\5\n\6\6\u018c\u018d\f\16\2\2\u018d\u0190\t\b"+
		"\2\2\u018e\u0191\58\35\2\u018f\u0191\7\u00eb\2\2\u0190\u018e\3\2\2\2\u0190"+
		"\u018f\3\2\2\2\u0191\u0199\3\2\2\2\u0192\u0193\f\r\2\2\u0193\u0194\78"+
		"\2\2\u0194\u0196\5\n\6\2\u0195\u0197\7=\2\2\u0196\u0195\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u0177\3\2\2\2\u0198\u017a\3\2"+
		"\2\2\u0198\u017d\3\2\2\2\u0198\u0180\3\2\2\2\u0198\u0183\3\2\2\2\u0198"+
		"\u0186\3\2\2\2\u0198\u0189\3\2\2\2\u0198\u018c\3\2\2\2\u0198\u0192\3\2"+
		"\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\13\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u01a9\5F$\2\u019e\u01a9\5*\26\2"+
		"\u019f\u01a9\5\u00a6T\2\u01a0\u01a9\5\u00a8U\2\u01a1\u01a9\5T+\2\u01a2"+
		"\u01a9\5\u008aF\2\u01a3\u01a9\5\16\b\2\u01a4\u01a9\5\u00a2R\2\u01a5\u01a9"+
		"\5\60\31\2\u01a6\u01a9\5^\60\2\u01a7\u01a9\5\u0102\u0082\2\u01a8\u019d"+
		"\3\2\2\2\u01a8\u019e\3\2\2\2\u01a8\u019f\3\2\2\2\u01a8\u01a0\3\2\2\2\u01a8"+
		"\u01a1\3\2\2\2\u01a8\u01a2\3\2\2\2\u01a8\u01a3\3\2\2\2\u01a8\u01a4\3\2"+
		"\2\2\u01a8\u01a5\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9"+
		"\r\3\2\2\2\u01aa\u01b4\5B\"\2\u01ab\u01ae\5> \2\u01ac\u01ad\t\5\2\2\u01ad"+
		"\u01af\5\n\6\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b4\3\2"+
		"\2\2\u01b0\u01b4\5@!\2\u01b1\u01b4\5D#\2\u01b2\u01b4\7\35\2\2\u01b3\u01aa"+
		"\3\2\2\2\u01b3\u01ab\3\2\2\2\u01b3\u01b0\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3"+
		"\u01b2\3\2\2\2\u01b4\17\3\2\2\2\u01b5\u01b6\5\u00fa~\2\u01b6\u01b7\5\u00be"+
		"`\2\u01b7\u01b8\7\20\2\2\u01b8\u01b9\5\26\f\2\u01b9\u01ba\7\21\2\2\u01ba"+
		"\u01bb\7\u00ac\2\2\u01bb\u01bc\5\22\n\2\u01bc\u01bd\5\u00fe\u0080\2\u01bd"+
		"\21\3\2\2\2\u01be\u01c3\5\24\13\2\u01bf\u01c0\7\u00f9\2\2\u01c0\u01c2"+
		"\5\24\13\2\u01c1\u01bf\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2"+
		"\u01c3\u01c4\3\2\2\2\u01c4\23\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c7"+
		"\7\u00eb\2\2\u01c7\u01c9\7\5\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2"+
		"\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\5\32\16\2\u01cb\u01cd\5L\'\2\u01cc"+
		"\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01d0\5N"+
		"(\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\25\3\2\2\2\u01d1\u01d3"+
		"\t\t\2\2\u01d2\u01d4\5\30\r\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2"+
		"\u01d4\u01d5\3\2\2\2\u01d5\u01d6\7u\2\2\u01d6\u01d7\7\u00eb\2\2\u01d7"+
		"\27\3\2\2\2\u01d8\u01d9\7\u009c\2\2\u01d9\u01dc\7\u00eb\2\2\u01da\u01db"+
		"\7$\2\2\u01db\u01dd\7\u00eb\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2"+
		"\2\u01dd\u01e6\3\2\2\2\u01de\u01df\7\63\2\2\u01df\u01e2\7\u00eb\2\2\u01e0"+
		"\u01e1\7$\2\2\u01e1\u01e3\7\u00eb\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3"+
		"\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01de\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\31\3\2\2\2\u01e8\u01e6\3\2\2"+
		"\2\u01e9\u01ea\7\u00ad\2\2\u01ea\u01eb\5\n\6\2\u01eb\u01ec\7\31\2\2\u01ec"+
		"\u01ee\3\2\2\2\u01ed\u01e9\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2"+
		"\2\2\u01ef\u01f0\5\36\20\2\u01f0\u01f4\5\34\17\2\u01f1\u01f3\5\34\17\2"+
		"\u01f2\u01f1\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5"+
		"\3\2\2\2\u01f5\33\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f9\t\4\2\2\u01f8"+
		"\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01ff\7\u00eb"+
		"\2\2\u01fb\u01fc\7\b\2\2\u01fc\u01fd\5\n\6\2\u01fd\u01fe\7\f\2\2\u01fe"+
		"\u0200\3\2\2\2\u01ff\u01fb\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\35\3\2\2"+
		"\2\u0201\u0203\7\u00eb\2\2\u0202\u0204\t\n\2\2\u0203\u0202\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\37\3\2\2\2\u0205\u0206\5\u00f8}\2\u0206\u0207\5\u00be"+
		"`\2\u0207\u0208\7\20\2\2\u0208\u0209\5&\24\2\u0209\u020a\7\21\2\2\u020a"+
		"\u020b\7\u00ac\2\2\u020b\u020c\5\"\22\2\u020c\u020d\5\u00fc\177\2\u020d"+
		"!\3\2\2\2\u020e\u0213\5$\23\2\u020f\u0210\7\u00f9\2\2\u0210\u0212\5$\23"+
		"\2\u0211\u020f\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214"+
		"\3\2\2\2\u0214#\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0217\7\u00eb\2\2\u0217"+
		"\u0219\7\5\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021e\3\2"+
		"\2\2\u021a\u021b\7\u00ad\2\2\u021b\u021c\5\n\6\2\u021c\u021d\7\31\2\2"+
		"\u021d\u021f\3\2\2\2\u021e\u021a\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220"+
		"\3\2\2\2\u0220\u0222\5\n\6\2\u0221\u0223\5L\'\2\u0222\u0221\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0226\5N(\2\u0225\u0224\3\2\2"+
		"\2\u0225\u0226\3\2\2\2\u0226%\3\2\2\2\u0227\u0228\t\t\2\2\u0228\u022d"+
		"\5(\25\2\u0229\u022a\7\63\2\2\u022a\u022c\5(\25\2\u022b\u0229\3\2\2\2"+
		"\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\'\3"+
		"\2\2\2\u022f\u022d\3\2\2\2\u0230\u0233\5\u00c0a\2\u0231\u0232\7$\2\2\u0232"+
		"\u0234\7\u00eb\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234)\3\2"+
		"\2\2\u0235\u0239\5,\27\2\u0236\u0239\5 \21\2\u0237\u0239\5\20\t\2\u0238"+
		"\u0235\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0237\3\2\2\2\u0239+\3\2\2\2"+
		"\u023a\u023b\7p\2\2\u023b\u023c\7o\2\2\u023c\u023d\5\u00c4c\2\u023d\u0246"+
		"\7\20\2\2\u023e\u0243\5.\30\2\u023f\u0240\7\63\2\2\u0240\u0242\5.\30\2"+
		"\u0241\u023f\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244"+
		"\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u023e\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024b\7\21\2\2\u0249\u024a\7"+
		"\u00bd\2\2\u024a\u024c\5\u00dan\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2"+
		"\2\2\u024c\u024d\3\2\2\2\u024d\u024e\7\u00ac\2\2\u024e\u024f\5\n\6\2\u024f"+
		"\u0250\7v\2\2\u0250\u0251\7o\2\2\u0251-\3\2\2\2\u0252\u0253\5\u00c0a\2"+
		"\u0253\u0256\5\u00dan\2\u0254\u0255\7\u00d0\2\2\u0255\u0257\5\u00ccg\2"+
		"\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257/\3\2\2\2\u0258\u0259\5"+
		"\u00c4c\2\u0259\u0268\7\20\2\2\u025a\u025d\5\u00ccg\2\u025b\u025d\7h\2"+
		"\2\u025c\u025a\3\2\2\2\u025c\u025b\3\2\2\2\u025d\u0265\3\2\2\2\u025e\u0261"+
		"\7\63\2\2\u025f\u0262\5\u00ccg\2\u0260\u0262\7h\2\2\u0261\u025f\3\2\2"+
		"\2\u0261\u0260\3\2\2\2\u0262\u0264\3\2\2\2\u0263\u025e\3\2\2\2\u0264\u0267"+
		"\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0269\3\2\2\2\u0267"+
		"\u0265\3\2\2\2\u0268\u025c\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\3\2"+
		"\2\2\u026a\u026b\7\21\2\2\u026b\u0281\3\2\2\2\u026c\u026d\5\u00c4c\2\u026d"+
		"\u027c\7\20\2\2\u026e\u0271\5\u00c4c\2\u026f\u0271\7h\2\2\u0270\u026e"+
		"\3\2\2\2\u0270\u026f\3\2\2\2\u0271\u0279\3\2\2\2\u0272\u0275\7\63\2\2"+
		"\u0273\u0276\5\u00c4c\2\u0274\u0276\7h\2\2\u0275\u0273\3\2\2\2\u0275\u0274"+
		"\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0272\3\2\2\2\u0278\u027b\3\2\2\2\u0279"+
		"\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2"+
		"\2\2\u027c\u0270\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		"\u027f\7\21\2\2\u027f\u0281\3\2\2\2\u0280\u0258\3\2\2\2\u0280\u026c\3"+
		"\2\2\2\u0281\61\3\2\2\2\u0282\u0283\7O\2\2\u0283\u0284\7\20\2\2\u0284"+
		"\u0287\5\n\6\2\u0285\u0286\7\63\2\2\u0286\u0288\5\b\5\2\u0287\u0285\3"+
		"\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\7\21\2\2\u028a"+
		"\u033a\3\2\2\2\u028b\u028c\7|\2\2\u028c\u028d\7\20\2\2\u028d\u028e\5\n"+
		"\6\2\u028e\u028f\7\21\2\2\u028f\u033a\3\2\2\2\u0290\u0291\7}\2\2\u0291"+
		"\u0292\7\20\2\2\u0292\u0293\5\n\6\2\u0293\u0294\7\21\2\2\u0294\u033a\3"+
		"\2\2\2\u0295\u0296\7J\2\2\u0296\u0297\7\20\2\2\u0297\u0298\5\n\6\2\u0298"+
		"\u0299\7\21\2\2\u0299\u033a\3\2\2\2\u029a\u029b\7a\2\2\u029b\u029c\7\20"+
		"\2\2\u029c\u029d\5\n\6\2\u029d\u029e\7\21\2\2\u029e\u033a\3\2\2\2\u029f"+
		"\u02a0\7L\2\2\u02a0\u02a1\7\20\2\2\u02a1\u02a2\5\n\6\2\u02a2\u02a3\7\21"+
		"\2\2\u02a3\u033a\3\2\2\2\u02a4\u02a5\7M\2\2\u02a5\u02a6\7\20\2\2\u02a6"+
		"\u02a7\5\n\6\2\u02a7\u02a8\7\63\2\2\u02a8\u02a9\5\n\6\2\u02a9\u02aa\7"+
		"\21\2\2\u02aa\u033a\3\2\2\2\u02ab\u02ac\7N\2\2\u02ac\u02ad\7\20\2\2\u02ad"+
		"\u02b0\5\n\6\2\u02ae\u02af\7\63\2\2\u02af\u02b1\5\b\5\2\u02b0\u02ae\3"+
		"\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\7\21\2\2\u02b3"+
		"\u033a\3\2\2\2\u02b4\u02b5\7P\2\2\u02b5\u02b6\7\20\2\2\u02b6\u02b7\5\n"+
		"\6\2\u02b7\u02b8\7\63\2\2\u02b8\u02b9\5\n\6\2\u02b9\u02ba\7\21\2\2\u02ba"+
		"\u033a\3\2\2\2\u02bb\u02bc\7~\2\2\u02bc\u02bd\7\20\2\2\u02bd\u02be\5\n"+
		"\6\2\u02be\u02bf\7\21\2\2\u02bf\u033a\3\2\2\2\u02c0\u02c1\7R\2\2\u02c1"+
		"\u02c2\7\20\2\2\u02c2\u02c3\5\n\6\2\u02c3\u02c4\7\21\2\2\u02c4\u033a\3"+
		"\2\2\2\u02c5\u02c6\7)\2\2\u02c6\u02c7\7\20\2\2\u02c7\u02c8\5\n\6\2\u02c8"+
		"\u02c9\7\63\2\2\u02c9\u02ca\5\n\6\2\u02ca\u02cb\7\63\2\2\u02cb\u02cc\5"+
		"\n\6\2\u02cc\u02cd\7\21\2\2\u02cd\u033a\3\2\2\2\u02ce\u02cf\7T\2\2\u02cf"+
		"\u02d0\7\20\2\2\u02d0\u02d1\5\n\6\2\u02d1\u02d2\7\21\2\2\u02d2\u033a\3"+
		"\2\2\2\u02d3\u02d4\7x\2\2\u02d4\u02d5\7\20\2\2\u02d5\u02d6\5\n\6\2\u02d6"+
		"\u02d7\7\21\2\2\u02d7\u033a\3\2\2\2\u02d8\u02d9\7y\2\2\u02d9\u02da\7\20"+
		"\2\2\u02da\u02db\5\n\6\2\u02db\u02dc\7\21\2\2\u02dc\u033a\3\2\2\2\u02dd"+
		"\u02de\7U\2\2\u02de\u02df\7\20\2\2\u02df\u02e0\5\n\6\2\u02e0\u02e1\7\21"+
		"\2\2\u02e1\u033a\3\2\2\2\u02e2\u02e3\7V\2\2\u02e3\u02e4\7\20\2\2\u02e4"+
		"\u02e5\5\n\6\2\u02e5\u02e6\7\21\2\2\u02e6\u033a\3\2\2\2\u02e7\u02e8\7"+
		"W\2\2\u02e8\u02e9\7\20\2\2\u02e9\u02ec\5\n\6\2\u02ea\u02eb\7\63\2\2\u02eb"+
		"\u02ed\5\b\5\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02f0\3\2"+
		"\2\2\u02ee\u02ef\7\63\2\2\u02ef\u02f1\5\b\5\2\u02f0\u02ee\3\2\2\2\u02f0"+
		"\u02f1\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\7\21\2\2\u02f3\u033a\3"+
		"\2\2\2\u02f4\u02f5\7z\2\2\u02f5\u02f6\7\20\2\2\u02f6\u02f7\5\n\6\2\u02f7"+
		"\u02f8\7\63\2\2\u02f8\u02fb\5\n\6\2\u02f9\u02fa\7\63\2\2\u02fa\u02fc\5"+
		"\b\5\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd"+
		"\u02fe\7\63\2\2\u02fe\u0300\5\b\5\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3"+
		"\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302\7\21\2\2\u0302\u033a\3\2\2\2\u0303"+
		"\u0304\7{\2\2\u0304\u0305\7\20\2\2\u0305\u0306\5\n\6\2\u0306\u0307\7\63"+
		"\2\2\u0307\u030a\5\n\6\2\u0308\u0309\7\63\2\2\u0309\u030b\5\b\5\2\u030a"+
		"\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\7\21"+
		"\2\2\u030d\u033a\3\2\2\2\u030e\u030f\7d\2\2\u030f\u0310\7\20\2\2\u0310"+
		"\u0311\5\n\6\2\u0311\u0312\7\63\2\2\u0312\u0313\5\n\6\2\u0313\u0314\7"+
		"\21\2\2\u0314\u033a\3\2\2\2\u0315\u0316\7,\2\2\u0316\u0317\7\20\2\2\u0317"+
		"\u0318\5\n\6\2\u0318\u0319\7\21\2\2\u0319\u033a\3\2\2\2\u031a\u031b\7"+
		"f\2\2\u031b\u031c\7\20\2\2\u031c\u031d\5\n\6\2\u031d\u031e\7\63\2\2\u031e"+
		"\u031f\5\n\6\2\u031f\u0320\7\21\2\2\u0320\u033a\3\2\2\2\u0321\u0322\7"+
		"Q\2\2\u0322\u0323\7\20\2\2\u0323\u0324\5\n\6\2\u0324\u0325\7\63\2\2\u0325"+
		"\u0326\5\n\6\2\u0326\u0327\7\21\2\2\u0327\u033a\3\2\2\2\u0328\u033a\5"+
		"\64\33\2\u0329\u033a\5:\36\2\u032a\u033a\5<\37\2\u032b\u033a\5P)\2\u032c"+
		"\u032d\7\u0097\2\2\u032d\u032e\7\20\2\2\u032e\u032f\5\n\6\2\u032f\u0330"+
		"\7\21\2\2\u0330\u033a\3\2\2\2\u0331\u0332\7\u0098\2\2\u0332\u0333\7\20"+
		"\2\2\u0333\u0334\5\n\6\2\u0334\u0335\7\21\2\2\u0335\u033a\3\2\2\2\u0336"+
		"\u033a\5H%\2\u0337\u033a\5J&\2\u0338\u033a\5F$\2\u0339\u0282\3\2\2\2\u0339"+
		"\u028b\3\2\2\2\u0339\u0290\3\2\2\2\u0339\u0295\3\2\2\2\u0339\u029a\3\2"+
		"\2\2\u0339\u029f\3\2\2\2\u0339\u02a4\3\2\2\2\u0339\u02ab\3\2\2\2\u0339"+
		"\u02b4\3\2\2\2\u0339\u02bb\3\2\2\2\u0339\u02c0\3\2\2\2\u0339\u02c5\3\2"+
		"\2\2\u0339\u02ce\3\2\2\2\u0339\u02d3\3\2\2\2\u0339\u02d8\3\2\2\2\u0339"+
		"\u02dd\3\2\2\2\u0339\u02e2\3\2\2\2\u0339\u02e7\3\2\2\2\u0339\u02f4\3\2"+
		"\2\2\u0339\u0303\3\2\2\2\u0339\u030e\3\2\2\2\u0339\u0315\3\2\2\2\u0339"+
		"\u031a\3\2\2\2\u0339\u0321\3\2\2\2\u0339\u0328\3\2\2\2\u0339\u0329\3\2"+
		"\2\2\u0339\u032a\3\2\2\2\u0339\u032b\3\2\2\2\u0339\u032c\3\2\2\2\u0339"+
		"\u0331\3\2\2\2\u0339\u0336\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u0338\3\2"+
		"\2\2\u033a\63\3\2\2\2\u033b\u033c\7\20\2\2\u033c\u033d\5\n\6\2\u033d\u033e"+
		"\7\21\2\2\u033e\u0342\3\2\2\2\u033f\u0342\5\u00c0a\2\u0340\u0342\5\u00cc"+
		"g\2\u0341\u033b\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0340\3\2\2\2\u0342"+
		"\65\3\2\2\2\u0343\u0344\7\b\2\2\u0344\u0349\7\u00eb\2\2\u0345\u0346\7"+
		"\63\2\2\u0346\u0348\7\u00eb\2\2\u0347\u0345\3\2\2\2\u0348\u034b\3\2\2"+
		"\2\u0349\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034c\3\2\2\2\u034b\u0349"+
		"\3\2\2\2\u034c\u034d\7\f\2\2\u034d\67\3\2\2\2\u034e\u034f\7\6\2\2\u034f"+
		"\u0354\5\u00ccg\2\u0350\u0351\7\63\2\2\u0351\u0353\5\u00ccg\2\u0352\u0350"+
		"\3\2\2\2\u0353\u0356\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355"+
		"\u0357\3\2\2\2\u0356\u0354\3\2\2\2\u0357\u0358\7\n\2\2\u0358\u0365\3\2"+
		"\2\2\u0359\u035a\7\20\2\2\u035a\u035f\5\u00ccg\2\u035b\u035c\7\63\2\2"+
		"\u035c\u035e\5\u00ccg\2\u035d\u035b\3\2\2\2\u035e\u0361\3\2\2\2\u035f"+
		"\u035d\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0362\3\2\2\2\u0361\u035f\3\2"+
		"\2\2\u0362\u0363\7\21\2\2\u0363\u0365\3\2\2\2\u0364\u034e\3\2\2\2\u0364"+
		"\u0359\3\2\2\2\u03659\3\2\2\2\u0366\u0367\7\27\2\2\u0367\u0368\7\20\2"+
		"\2\u0368\u0369\5\u00c6d\2\u0369\u036c\7\20\2\2\u036a\u036d\5\u00c2b\2"+
		"\u036b\u036d\5\u00ccg\2\u036c\u036a\3\2\2\2\u036c\u036b\3\2\2\2\u036c"+
		"\u036d\3\2\2\2\u036d\u0375\3\2\2\2\u036e\u0371\7\63\2\2\u036f\u0372\5"+
		"\u00c2b\2\u0370\u0372\5\u00ccg\2\u0371\u036f\3\2\2\2\u0371\u0370\3\2\2"+
		"\2\u0372\u0374\3\2\2\2\u0373\u036e\3\2\2\2\u0374\u0377\3\2\2\2\u0375\u0373"+
		"\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378\3\2\2\2\u0377\u0375\3\2\2\2\u0378"+
		"\u037b\7\21\2\2\u0379\u037a\7\u00e3\2\2\u037a\u037c\7\u00ea\2\2\u037b"+
		"\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037f\3\2\2\2\u037d\u037e\7\u00bd"+
		"\2\2\u037e\u0380\5\u00f2z\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380"+
		"\u0381\3\2\2\2\u0381\u0382\7\21\2\2\u0382;\3\2\2\2\u0383\u0384\7\u00cd"+
		"\2\2\u0384\u0385\7\20\2\2\u0385\u0386\5\n\6\2\u0386\u0389\7\63\2\2\u0387"+
		"\u038a\5\u00d2j\2\u0388\u038a\5\u00d4k\2\u0389\u0387\3\2\2\2\u0389\u0388"+
		"\3\2\2\2\u038a\u038d\3\2\2\2\u038b\u038c\7\63\2\2\u038c\u038e\7\u00ea"+
		"\2\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\3\2\2\2\u038f"+
		"\u0390\7\21\2\2\u0390=\3\2\2\2\u0391\u0392\7\u00c3\2\2\u0392\u0394\7\20"+
		"\2\2\u0393\u0395\5\n\6\2\u0394\u0393\3\2\2\2\u0394\u0395\3\2\2\2\u0395"+
		"\u0396\3\2\2\2\u0396\u0397\7\21\2\2\u0397?\3\2\2\2\u0398\u0399\7\u0099"+
		"\2\2\u0399\u039a\7\20\2\2\u039a\u039b\5\n\6\2\u039b\u039c\7\63\2\2\u039c"+
		"\u039d\7\u00e4\2\2\u039d\u039e\7\21\2\2\u039eA\3\2\2\2\u039f\u03a0\7\u0096"+
		"\2\2\u03a0\u03a1\7\20\2\2\u03a1\u03a4\5\n\6\2\u03a2\u03a3\7\63\2\2\u03a3"+
		"\u03a5\t\13\2\2\u03a4\u03a2\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a6\3"+
		"\2\2\2\u03a6\u03a7\7\21\2\2\u03a7C\3\2\2\2\u03a8\u03a9\7\u00c6\2\2\u03a9"+
		"\u03aa\7\20\2\2\u03aa\u03ad\7\u00ea\2\2\u03ab\u03ac\7\63\2\2\u03ac\u03ae"+
		"\t\f\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03b4\3\2\2\2\u03af"+
		"\u03b2\7\63\2\2\u03b0\u03b3\5\n\6\2\u03b1\u03b3\7h\2\2\u03b2\u03b0\3\2"+
		"\2\2\u03b2\u03b1\3\2\2\2\u03b3\u03b5\3\2\2\2\u03b4\u03af\3\2\2\2\u03b4"+
		"\u03b5\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b7\7\63\2\2\u03b7\u03b9\t"+
		"\r\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba"+
		"\u03bb\7\21\2\2\u03bbE\3\2\2\2\u03bc\u03bd\7\67\2\2\u03bd\u03be\7\20\2"+
		"\2\u03be\u03c0\5\n\6\2\u03bf\u03c1\5L\'\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1"+
		"\3\2\2\2\u03c1\u03c3\3\2\2\2\u03c2\u03c4\5N(\2\u03c3\u03c2\3\2\2\2\u03c3"+
		"\u03c4\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5\u03c6\7;\2\2\u03c6\u03c8\5\n"+
		"\6\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03ca\3\2\2\2\u03c9"+
		"\u03cb\t\16\2\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc\3"+
		"\2\2\2\u03cc\u03cd\7\21\2\2\u03cdG\3\2\2\2\u03ce\u03cf\7\u00d1\2\2\u03cf"+
		"\u03d0\7\20\2\2\u03d0\u03d1\5\n\6\2\u03d1\u03d2\7\63\2\2\u03d2\u03dc\7"+
		"\u00eb\2\2\u03d3\u03d4\7\u00da\2\2\u03d4\u03d9\5\u00c2b\2\u03d5\u03d6"+
		"\7\63\2\2\u03d6\u03d8\5\u00c2b\2\u03d7\u03d5\3\2\2\2\u03d8\u03db\3\2\2"+
		"\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9"+
		"\3\2\2\2\u03dc\u03d3\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03df\3\2\2\2\u03de"+
		"\u03e0\t\17\2\2\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1\3"+
		"\2\2\2\u03e1\u03e2\7\21\2\2\u03e2I\3\2\2\2\u03e3\u03e4\7\u00d2\2\2\u03e4"+
		"\u03e5\7\20\2\2\u03e5\u03e6\5\n\6\2\u03e6\u03e7\7\63\2\2\u03e7\u03f1\7"+
		"\u00eb\2\2\u03e8\u03e9\7\u009c\2\2\u03e9\u03ee\5\u00c2b\2\u03ea\u03eb"+
		"\7\63\2\2\u03eb\u03ed\5\u00c2b\2\u03ec\u03ea\3\2\2\2\u03ed\u03f0\3\2\2"+
		"\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f2\3\2\2\2\u03f0\u03ee"+
		"\3\2\2\2\u03f1\u03e8\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3"+
		"\u03f4\7u\2\2\u03f4\u03f6\7\u00eb\2\2\u03f5\u03f3\3\2\2\2\u03f5\u03f6"+
		"\3\2\2\2\u03f6\u03f8\3\2\2\2\u03f7\u03f9\t\20\2\2\u03f8\u03f7\3\2\2\2"+
		"\u03f8\u03f9\3\2\2\2\u03f9\u03fb\3\2\2\2\u03fa\u03fc\t\21\2\2\u03fb\u03fa"+
		"\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fe\3\2\2\2\u03fd\u03ff\t\17\2\2"+
		"\u03fe\u03fd\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401"+
		"\7\21\2\2\u0401K\3\2\2\2\u0402\u0403\7<\2\2\u0403\u0404\5\u00ccg\2\u0404"+
		"M\3\2\2\2\u0405\u0406\7?\2\2\u0406\u0407\5\u00ccg\2\u0407O\3\2\2\2\u0408"+
		"\u0409\7g\2\2\u0409\u040a\7\20\2\2\u040a\u040b\5\n\6\2\u040b\u040c\7\63"+
		"\2\2\u040c\u0416\7\u00eb\2\2\u040d\u040e\7\u009c\2\2\u040e\u0413\5\u00c2"+
		"b\2\u040f\u0410\7\63\2\2\u0410\u0412\5\u00c2b\2\u0411\u040f\3\2\2\2\u0412"+
		"\u0415\3\2\2\2\u0413\u0411\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0417\3\2"+
		"\2\2\u0415\u0413\3\2\2\2\u0416\u040d\3\2\2\2\u0416\u0417\3\2\2\2\u0417"+
		"\u041a\3\2\2\2\u0418\u0419\7u\2\2\u0419\u041b\7\u00eb\2\2\u041a\u0418"+
		"\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041e\3\2\2\2\u041c\u041f\t\20\2\2"+
		"\u041d\u041f\7h\2\2\u041e\u041c\3\2\2\2\u041e\u041d\3\2\2\2\u041e\u041f"+
		"\3\2\2\2\u041f\u0422\3\2\2\2\u0420\u0423\t\22\2\2\u0421\u0423\7h\2\2\u0422"+
		"\u0420\3\2\2\2\u0422\u0421\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0426\3\2"+
		"\2\2\u0424\u0427\t\23\2\2\u0425\u0427\7h\2\2\u0426\u0424\3\2\2\2\u0426"+
		"\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0429\7\21"+
		"\2\2\u0429Q\3\2\2\2\u042a\u042b\7#\2\2\u042b\u0435\5\u0088E\2\u042c\u0435"+
		"\5\u0084C\2\u042d\u0435\5\u0086D\2\u042e\u0435\5\u008cG\2\u042f\u0435"+
		"\5\u0096L\2\u0430\u0435\5\u0092J\2\u0431\u0435\5\u009cO\2\u0432\u0435"+
		"\5\u009aN\2\u0433\u0435\5\u009eP\2\u0434\u042a\3\2\2\2\u0434\u042c\3\2"+
		"\2\2\u0434\u042d\3\2\2\2\u0434\u042e\3\2\2\2\u0434\u042f\3\2\2\2\u0434"+
		"\u0430\3\2\2\2\u0434\u0431\3\2\2\2\u0434\u0432\3\2\2\2\u0434\u0433\3\2"+
		"\2\2\u0435S\3\2\2\2\u0436\u0439\5\u00aaV\2\u0437\u0439\5z>\2\u0438\u0436"+
		"\3\2\2\2\u0438\u0437\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\3\2\2\2\u043a"+
		"\u043c\7\20\2\2\u043b\u043d\5\n\6\2\u043c\u043b\3\2\2\2\u043c\u043d\3"+
		"\2\2\2\u043d\u0442\3\2\2\2\u043e\u043f\7\63\2\2\u043f\u0441\5\n\6\2\u0440"+
		"\u043e\3\2\2\2\u0441\u0444\3\2\2\2\u0442\u0440\3\2\2\2\u0442\u0443\3\2"+
		"\2\2\u0443\u0445\3\2\2\2\u0444\u0442\3\2\2\2\u0445\u0446\7\u008d\2\2\u0446"+
		"\u0448\7\20\2\2\u0447\u0449\5V,\2\u0448\u0447\3\2\2\2\u0448\u0449\3\2"+
		"\2\2\u0449\u044b\3\2\2\2\u044a\u044c\5X-\2\u044b\u044a\3\2\2\2\u044b\u044c"+
		"\3\2\2\2\u044c\u044e\3\2\2\2\u044d\u044f\5Z.\2\u044e\u044d\3\2\2\2\u044e"+
		"\u044f\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0451\7\21\2\2\u0451\u0452\7"+
		"\21\2\2\u0452U\3\2\2\2\u0453\u0454\7\u0091\2\2\u0454\u0455\7A\2\2\u0455"+
		"\u045a\7\u00eb\2\2\u0456\u0457\7\63\2\2\u0457\u0459\7\u00eb\2\2\u0458"+
		"\u0456\3\2\2\2\u0459\u045c\3\2\2\2\u045a\u0458\3\2\2\2\u045a\u045b\3\2"+
		"\2\2\u045bW\3\2\2\2\u045c\u045a\3\2\2\2\u045d\u045e\7@\2\2\u045e\u045f"+
		"\7A\2\2\u045f\u0461\5\u00c2b\2\u0460\u0462\t\24\2\2\u0461\u0460\3\2\2"+
		"\2\u0461\u0462\3\2\2\2\u0462\u046a\3\2\2\2\u0463\u0464\7\63\2\2\u0464"+
		"\u0466\5\u00c2b\2\u0465\u0467\t\24\2\2\u0466\u0465\3\2\2\2\u0466\u0467"+
		"\3\2\2\2\u0467\u0469\3\2\2\2\u0468\u0463\3\2\2\2\u0469\u046c\3\2\2\2\u046a"+
		"\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046bY\3\2\2\2\u046c\u046a\3\2\2\2"+
		"\u046d\u046e\7l\2\2\u046e\u0471\7\u00b0\2\2\u046f\u0471\7\u0093\2\2\u0470"+
		"\u046d\3\2\2\2\u0470\u046f\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\7)"+
		"\2\2\u0473\u0474\5\\/\2\u0474\u0475\7%\2\2\u0475\u0476\5\\/\2\u0476[\3"+
		"\2\2\2\u0477\u0478\7\u00e4\2\2\u0478\u0483\7\u008e\2\2\u0479\u047a\7\u00e4"+
		"\2\2\u047a\u0483\7\u008f\2\2\u047b\u047c\7\u0094\2\2\u047c\u047d\7l\2"+
		"\2\u047d\u0483\7\u00b1\2\2\u047e\u047f\7\u0090\2\2\u047f\u0483\7\u008e"+
		"\2\2\u0480\u0481\7\u0090\2\2\u0481\u0483\7\u008f\2\2\u0482\u0477\3\2\2"+
		"\2\u0482\u0479\3\2\2\2\u0482\u047b\3\2\2\2\u0482\u047e\3\2\2\2\u0482\u0480"+
		"\3\2\2\2\u0483]\3\2\2\2\u0484\u0485\5\u00c8e\2\u0485\u0486\7\20\2\2\u0486"+
		"\u0488\5`\61\2\u0487\u0489\5b\62\2\u0488\u0487\3\2\2\2\u0488\u0489\3\2"+
		"\2\2\u0489\u048a\3\2\2\2\u048a\u048b\7\21\2\2\u048b_\3\2\2\2\u048c\u048f"+
		"\5\n\6\2\u048d\u048e\7$\2\2\u048e\u0490\7\u00eb\2\2\u048f\u048d\3\2\2"+
		"\2\u048f\u0490\3\2\2\2\u0490\u0499\3\2\2\2\u0491\u0492\7\63\2\2\u0492"+
		"\u0495\5\n\6\2\u0493\u0494\7$\2\2\u0494\u0496\7\u00eb\2\2\u0495\u0493"+
		"\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0498\3\2\2\2\u0497\u0491\3\2\2\2\u0498"+
		"\u049b\3\2\2\2\u0499\u0497\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u04a5\3\2"+
		"\2\2\u049b\u0499\3\2\2\2\u049c\u049d\7\33\2\2\u049d\u04a2\5\u00c2b\2\u049e"+
		"\u049f\7\63\2\2\u049f\u04a1\5\u00c2b\2\u04a0\u049e\3\2\2\2\u04a1\u04a4"+
		"\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a6\3\2\2\2\u04a4"+
		"\u04a2\3\2\2\2\u04a5\u049c\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6a\3\2\2\2"+
		"\u04a7\u04a9\5t;\2\u04a8\u04a7\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04ad"+
		"\3\2\2\2\u04aa\u04ae\5d\63\2\u04ab\u04ae\5x=\2\u04ac\u04ae\5j\66\2\u04ad"+
		"\u04aa\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ad\u04ac\3\2\2\2\u04ad\u04ae\3\2"+
		"\2\2\u04ae\u04b1\3\2\2\2\u04af\u04b2\5p9\2\u04b0\u04b2\5r:\2\u04b1\u04af"+
		"\3\2\2\2\u04b1\u04b0\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b4\3\2\2\2\u04b3"+
		"\u04b5\5v<\2\u04b4\u04b3\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5c\3\2\2\2\u04b6"+
		"\u04b8\5\u00b2Z\2\u04b7\u04b6\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9"+
		"\3\2\2\2\u04b9\u04be\5f\64\2\u04ba\u04bb\7\63\2\2\u04bb\u04bd\5f\64\2"+
		"\u04bc\u04ba\3\2\2\2\u04bd\u04c0\3\2\2\2\u04be\u04bc\3\2\2\2\u04be\u04bf"+
		"\3\2\2\2\u04bfe\3\2\2\2\u04c0\u04be\3\2\2\2\u04c1\u04c3\7!\2\2\u04c2\u04c4"+
		"\5\u00b2Z\2\u04c3\u04c2\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c5\3\2\2"+
		"\2\u04c5\u04cd\5h\65\2\u04c6\u04c8\7\63\2\2\u04c7\u04c9\5\u00b2Z\2\u04c8"+
		"\u04c7\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cc\5h"+
		"\65\2\u04cb\u04c6\3\2\2\2\u04cc\u04cf\3\2\2\2\u04cd\u04cb\3\2\2\2\u04cd"+
		"\u04ce\3\2\2\2\u04ceg\3\2\2\2\u04cf\u04cd\3\2\2\2\u04d0\u04d1\5\u00c2"+
		"b\2\u04d1\u04d2\7\25\2\2\u04d2\u04d3\5\n\6\2\u04d3i\3\2\2\2\u04d4\u04d6"+
		"\5\u00b2Z\2\u04d5\u04d4\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d7\3\2\2"+
		"\2\u04d7\u04d8\7>\2\2\u04d8\u04dd\5l\67\2\u04d9\u04da\7\63\2\2\u04da\u04dc"+
		"\5l\67\2\u04db\u04d9\3\2\2\2\u04dc\u04df\3\2\2\2\u04dd\u04db\3\2\2\2\u04dd"+
		"\u04de\3\2\2\2\u04de\u04e1\3\2\2\2\u04df\u04dd\3\2\2\2\u04e0\u04e2\5\u00ac"+
		"W\2\u04e1\u04e0\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e4\3\2\2\2\u04e3"+
		"\u04e5\5\u00aeX\2\u04e4\u04e3\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5k\3\2\2"+
		"\2\u04e6\u04e8\5\u00b2Z\2\u04e7\u04e6\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8"+
		"\u04e9\3\2\2\2\u04e9\u04ee\5n8\2\u04ea\u04eb\7\63\2\2\u04eb\u04ed\5n8"+
		"\2\u04ec\u04ea\3\2\2\2\u04ed\u04f0\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ee\u04ef"+
		"\3\2\2\2\u04efm\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f1\u04f2\5\u00c2b\2\u04f2"+
		"\u04f3\7\25\2\2\u04f3\u04f4\5\u008aF\2\u04f4o\3\2\2\2\u04f5\u04f6\7 \2"+
		"\2\u04f6\u04fb\5\u0098M\2\u04f7\u04f8\7\63\2\2\u04f8\u04fa\5\u0098M\2"+
		"\u04f9\u04f7\3\2\2\2\u04fa\u04fd\3\2\2\2\u04fb\u04f9\3\2\2\2\u04fb\u04fc"+
		"\3\2\2\2\u04fcq\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fe\u04ff\7\37\2\2\u04ff"+
		"\u0504\5\u0094K\2\u0500\u0501\7\63\2\2\u0501\u0503\5\u0094K\2\u0502\u0500"+
		"\3\2\2\2\u0503\u0506\3\2\2\2\u0504\u0502\3\2\2\2\u0504\u0505\3\2\2\2\u0505"+
		"s\3\2\2\2\u0506\u0504\3\2\2\2\u0507\u0508\7_\2\2\u0508\u050b\5\n\6\2\u0509"+
		"\u050b\5\u00be`\2\u050a\u0507\3\2\2\2\u050a\u0509\3\2\2\2\u050bu\3\2\2"+
		"\2\u050c\u0510\7#\2\2\u050d\u050e\5\u00c2b\2\u050e\u050f\7\26\2\2\u050f"+
		"\u0511\3\2\2\2\u0510\u050d\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0512\3\2"+
		"\2\2\u0512\u0513\5\u00c0a\2\u0513\u0517\79\2\2\u0514\u0515\5\u00c2b\2"+
		"\u0515\u0516\7\26\2\2\u0516\u0518\3\2\2\2\u0517\u0514\3\2\2\2\u0517\u0518"+
		"\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u052b\5\u00c0a\2\u051a\u051e\7\63\2"+
		"\2\u051b\u051c\5\u00c2b\2\u051c\u051d\7\26\2\2\u051d\u051f\3\2\2\2\u051e"+
		"\u051b\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0521\5\u00c0"+
		"a\2\u0521\u0525\79\2\2\u0522\u0523\5\u00c2b\2\u0523\u0524\7\26\2\2\u0524"+
		"\u0526\3\2\2\2\u0525\u0522\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0527\3\2"+
		"\2\2\u0527\u0528\5\u00c0a\2\u0528\u052a\3\2\2\2\u0529\u051a\3\2\2\2\u052a"+
		"\u052d\3\2\2\2\u052b\u052c\3\2\2\2\u052b\u0529\3\2\2\2\u052cw\3\2\2\2"+
		"\u052d\u052b\3\2\2\2\u052e\u052f\7\u00c1\2\2\u052f\u0530\5\n\6\2\u0530"+
		"y\3\2\2\2\u0531\u0532\t\25\2\2\u0532{\3\2\2\2\u0533\u0538\5~@\2\u0534"+
		"\u0535\7\63\2\2\u0535\u0537\5~@\2\u0536\u0534\3\2\2\2\u0537\u053a\3\2"+
		"\2\2\u0538\u0536\3\2\2\2\u0538\u0539\3\2\2\2\u0539}\3\2\2\2\u053a\u0538"+
		"\3\2\2\2\u053b\u053d\5\u00b2Z\2\u053c\u053b\3\2\2\2\u053c\u053d\3\2\2"+
		"\2\u053d\u053e\3\2\2\2\u053e\u053f\5\u00c2b\2\u053f\u0540\7\25\2\2\u0540"+
		"\u0541\5\u008aF\2\u0541\177\3\2\2\2\u0542\u0547\5\u0082B\2\u0543\u0544"+
		"\7\63\2\2\u0544\u0546\5\u0082B\2\u0545\u0543\3\2\2\2\u0546\u0549\3\2\2"+
		"\2\u0547\u0545\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u0081\3\2\2\2\u0549\u0547"+
		"\3\2\2\2\u054a\u054c\7_\2\2\u054b\u054a\3\2\2\2\u054b\u054c\3\2\2\2\u054c"+
		"\u054d\3\2\2\2\u054d\u054e\5\n\6\2\u054e\u0083\3\2\2\2\u054f\u0550\7>"+
		"\2\2\u0550\u0552\5|?\2\u0551\u0553\5\u00acW\2\u0552\u0551\3\2\2\2\u0552"+
		"\u0553\3\2\2\2\u0553\u0555\3\2\2\2\u0554\u0556\5\u00aeX\2\u0555\u0554"+
		"\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0085\3\2\2\2\u0557\u0558\7_\2\2\u0558"+
		"\u0559\5\n\6\2\u0559\u0087\3\2\2\2\u055a\u055b\5\u00c0a\2\u055b\u055c"+
		"\79\2\2\u055c\u0564\5\u00c0a\2\u055d\u055e\7\63\2\2\u055e\u055f\5\u00c0"+
		"a\2\u055f\u0560\79\2\2\u0560\u0561\5\u00c0a\2\u0561\u0563\3\2\2\2\u0562"+
		"\u055d\3\2\2\2\u0563\u0566\3\2\2\2\u0564\u0562\3\2\2\2\u0564\u0565\3\2"+
		"\2\2\u0565\u0089\3\2\2\2\u0566\u0564\3\2\2\2\u0567\u0568\7X\2\2\u0568"+
		"\u0569\7\20\2\2\u0569\u056a\5\n\6\2\u056a\u056b\7\21\2\2\u056b\u05a0\3"+
		"\2\2\2\u056c\u056d\7Y\2\2\u056d\u056e\7\20\2\2\u056e\u056f\5\n\6\2\u056f"+
		"\u0570\7\21\2\2\u0570\u05a0\3\2\2\2\u0571\u0572\7[\2\2\u0572\u0574\7\20"+
		"\2\2\u0573\u0575\5\n\6\2\u0574\u0573\3\2\2\2\u0574\u0575\3\2\2\2\u0575"+
		"\u0576\3\2\2\2\u0576\u05a0\7\21\2\2\u0577\u0578\7Z\2\2\u0578\u0579\7\20"+
		"\2\2\u0579\u057a\5\n\6\2\u057a\u057b\7\21\2\2\u057b\u05a0\3\2\2\2\u057c"+
		"\u057d\7E\2\2\u057d\u057e\7\20\2\2\u057e\u057f\5\n\6\2\u057f\u0580\7\21"+
		"\2\2\u0580\u05a0\3\2\2\2\u0581\u0582\7F\2\2\u0582\u0583\7\20\2\2\u0583"+
		"\u0584\5\n\6\2\u0584\u0585\7\21\2\2\u0585\u05a0\3\2\2\2\u0586\u0587\7"+
		"B\2\2\u0587\u0588\7\20\2\2\u0588\u0589\5\n\6\2\u0589\u058a\7\21\2\2\u058a"+
		"\u05a0\3\2\2\2\u058b\u058c\7\u0081\2\2\u058c\u058d\7\20\2\2\u058d\u058e"+
		"\5\n\6\2\u058e\u058f\7\21\2\2\u058f\u05a0\3\2\2\2\u0590\u0591\7\u0082"+
		"\2\2\u0591\u0592\7\20\2\2\u0592\u0593\5\n\6\2\u0593\u0594\7\21\2\2\u0594"+
		"\u05a0\3\2\2\2\u0595\u0596\7\u0083\2\2\u0596\u0597\7\20\2\2\u0597\u0598"+
		"\5\n\6\2\u0598\u0599\7\21\2\2\u0599\u05a0\3\2\2\2\u059a\u059b\7\u0084"+
		"\2\2\u059b\u059c\7\20\2\2\u059c\u059d\5\n\6\2\u059d\u059e\7\21\2\2\u059e"+
		"\u05a0\3\2\2\2\u059f\u0567\3\2\2\2\u059f\u056c\3\2\2\2\u059f\u0571\3\2"+
		"\2\2\u059f\u0577\3\2\2\2\u059f\u057c\3\2\2\2\u059f\u0581\3\2\2\2\u059f"+
		"\u0586\3\2\2\2\u059f\u058b\3\2\2\2\u059f\u0590\3\2\2\2\u059f\u0595\3\2"+
		"\2\2\u059f\u059a\3\2\2\2\u05a0\u008b\3\2\2\2\u05a1\u05a2\7!\2\2\u05a2"+
		"\u05a7\5\u008eH\2\u05a3\u05a4\7\63\2\2\u05a4\u05a6\5\u008eH\2\u05a5\u05a3"+
		"\3\2\2\2\u05a6\u05a9\3\2\2\2\u05a7\u05a5\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8"+
		"\u008d\3\2\2\2\u05a9\u05a7\3\2\2\2\u05aa\u05ac\5\u00b2Z\2\u05ab\u05aa"+
		"\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05ae\5\u00c2b"+
		"\2\u05ae\u05af\7\25\2\2\u05af\u05b0\5\u0090I\2\u05b0\u008f\3\2\2\2\u05b1"+
		"\u05b2\5\u008aF\2\u05b2\u05b3\7\20\2\2\u05b3\u05b4\5\n\6\2\u05b4\u05b5"+
		"\7\21\2\2\u05b5\u05b8\3\2\2\2\u05b6\u05b8\5\n\6\2\u05b7\u05b1\3\2\2\2"+
		"\u05b7\u05b6\3\2\2\2\u05b8\u0091\3\2\2\2\u05b9\u05ba\7\37\2\2\u05ba\u05bf"+
		"\5\u0094K\2\u05bb\u05bc\7\63\2\2\u05bc\u05be\5\u0094K\2\u05bd\u05bb\3"+
		"\2\2\2\u05be\u05c1\3\2\2\2\u05bf\u05bd\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0"+
		"\u0093\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c2\u05c8\5\u00c2b\2\u05c3\u05c4"+
		"\5\u00bc_\2\u05c4\u05c5\7\26\2\2\u05c5\u05c6\5\u00c2b\2\u05c6\u05c8\3"+
		"\2\2\2\u05c7\u05c2\3\2\2\2\u05c7\u05c3\3\2\2\2\u05c8\u0095\3\2\2\2\u05c9"+
		"\u05ca\7 \2\2\u05ca\u05cf\5\u0098M\2\u05cb\u05cc\7\63\2\2\u05cc\u05ce"+
		"\5\u0098M\2\u05cd\u05cb\3\2\2\2\u05ce\u05d1\3\2\2\2\u05cf\u05cd\3\2\2"+
		"\2\u05cf\u05d0\3\2\2\2\u05d0\u0097\3\2\2\2\u05d1\u05cf\3\2\2\2\u05d2\u05d8"+
		"\5\u00c2b\2\u05d3\u05d4\5\u00bc_\2\u05d4\u05d5\7\26\2\2\u05d5\u05d6\5"+
		"\u00c2b\2\u05d6\u05d8\3\2\2\2\u05d7\u05d2\3\2\2\2\u05d7\u05d3\3\2\2\2"+
		"\u05d8\u0099\3\2\2\2\u05d9\u05da\7\u00bf\2\2\u05da\u05db\5\u00c0a\2\u05db"+
		"\u05dc\7\63\2\2\u05dc\u05dd\5\u00c0a\2\u05dd\u009b\3\2\2\2\u05de\u05df"+
		"\7\u00be\2\2\u05df\u05e0\5\u00c0a\2\u05e0\u05e1\7\63\2\2\u05e1\u05e2\5"+
		"\u00c0a\2\u05e2\u009d\3\2\2\2\u05e3\u05e4\7\u00c0\2\2\u05e4\u05e5\5\u00c0"+
		"a\2\u05e5\u05e6\7\13\2\2\u05e6\u05ee\5\u00ccg\2\u05e7\u05e8\7\63\2\2\u05e8"+
		"\u05e9\5\u00c0a\2\u05e9\u05ea\7\13\2\2\u05ea\u05eb\5\u00ccg\2\u05eb\u05ed"+
		"\3\2\2\2\u05ec\u05e7\3\2\2\2\u05ed\u05f0\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ee"+
		"\u05ef\3\2\2\2\u05ef\u009f\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f1\u05f4\7*"+
		"\2\2\u05f2\u05f5\5\u00a2R\2\u05f3\u05f5\7\u00eb\2\2\u05f4\u05f2\3\2\2"+
		"\2\u05f4\u05f3\3\2\2\2\u05f5\u05fc\3\2\2\2\u05f6\u05f9\7+\2\2\u05f7\u05fa"+
		"\5\u00a2R\2\u05f8\u05fa\7\u00eb\2\2\u05f9\u05f7\3\2\2\2\u05f9\u05f8\3"+
		"\2\2\2\u05fa\u05fc\3\2\2\2\u05fb\u05f1\3\2\2\2\u05fb\u05f6\3\2\2\2\u05fc"+
		"\u00a1\3\2\2\2\u05fd\u05fe\7.\2\2\u05fe\u05ff\7\20\2\2\u05ff\u0604\5\n"+
		"\6\2\u0600\u0601\7\63\2\2\u0601\u0603\5\n\6\2\u0602\u0600\3\2\2\2\u0603"+
		"\u0606\3\2\2\2\u0604\u0602\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0607\3\2"+
		"\2\2\u0606\u0604\3\2\2\2\u0607\u0608\7\21\2\2\u0608\u0624\3\2\2\2\u0609"+
		"\u060a\7\60\2\2\u060a\u060b\7\20\2\2\u060b\u060c\5\n\6\2\u060c\u060d\7"+
		"\63\2\2\u060d\u060e\5\n\6\2\u060e\u060f\7\21\2\2\u060f\u0624\3\2\2\2\u0610"+
		"\u0611\7\u0080\2\2\u0611\u0612\7\20\2\2\u0612\u0613\5\n\6\2\u0613\u0614"+
		"\7\63\2\2\u0614\u0615\5\n\6\2\u0615\u0616\7\21\2\2\u0616\u0624\3\2\2\2"+
		"\u0617\u0618\7\61\2\2\u0618\u0619\7\20\2\2\u0619\u061e\5\n\6\2\u061a\u061b"+
		"\7\63\2\2\u061b\u061d\5\n\6\2\u061c\u061a\3\2\2\2\u061d\u0620\3\2\2\2"+
		"\u061e\u061c\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0621\3\2\2\2\u0620\u061e"+
		"\3\2\2\2\u0621\u0622\7\21\2\2\u0622\u0624\3\2\2\2\u0623\u05fd\3\2\2\2"+
		"\u0623\u0609\3\2\2\2\u0623\u0610\3\2\2\2\u0623\u0617\3\2\2\2\u0624\u00a3"+
		"\3\2\2\2\u0625\u0626\5\u00ba^\2\u0626\u0627\7\b\2\2\u0627\u0628\5\u00c2"+
		"b\2\u0628\u0629\7\13\2\2\u0629\u062f\5\u00ccg\2\u062a\u062b\7\63\2\2\u062b"+
		"\u062c\5\u00c2b\2\u062c\u062d\7\13\2\2\u062d\u062e\5\u00ccg\2\u062e\u0630"+
		"\3\2\2\2\u062f\u062a\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0631\3\2\2\2\u0631"+
		"\u0632\7\f\2\2\u0632\u00a5\3\2\2\2\u0633\u0634\5\u00aaV\2\u0634\u0635"+
		"\7\20\2\2\u0635\u0638\7\u00eb\2\2\u0636\u0637\7\26\2\2\u0637\u0639\5\u00c2"+
		"b\2\u0638\u0636\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u0642\3\2\2\2\u063a"+
		"\u063b\7\63\2\2\u063b\u063e\7\u00eb\2\2\u063c\u063d\7\26\2\2\u063d\u063f"+
		"\5\u00c2b\2\u063e\u063c\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u0641\3\2\2"+
		"\2\u0640\u063a\3\2\2\2\u0641\u0644\3\2\2\2\u0642\u0640\3\2\2\2\u0642\u0643"+
		"\3\2\2\2\u0643\u0646\3\2\2\2\u0644\u0642\3\2\2\2\u0645\u0647\5\u00acW"+
		"\2\u0646\u0645\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0649\3\2\2\2\u0648\u064a"+
		"\5\u00aeX\2\u0649\u0648\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u064b\3\2\2"+
		"\2\u064b\u064c\7\21\2\2\u064c\u00a7\3\2\2\2\u064d\u064e\5\u00aaV\2\u064e"+
		"\u064f\7\20\2\2\u064f\u0652\7\u00eb\2\2\u0650\u0651\7\26\2\2\u0651\u0653"+
		"\5\u00c2b\2\u0652\u0650\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u065c\3\2\2"+
		"\2\u0654\u0655\7\63\2\2\u0655\u0658\7\u00eb\2\2\u0656\u0657\7\26\2\2\u0657"+
		"\u0659\5\u00c2b\2\u0658\u0656\3\2\2\2\u0658\u0659\3\2\2\2\u0659\u065b"+
		"\3\2\2\2\u065a\u0654\3\2\2\2\u065b\u065e\3\2\2\2\u065c\u065a\3\2\2\2\u065c"+
		"\u065d\3\2\2\2\u065d\u065f\3\2\2\2\u065e\u065c\3\2\2\2\u065f\u0661\7\21"+
		"\2\2\u0660\u0662\5\u00acW\2\u0661\u0660\3\2\2\2\u0661\u0662\3\2\2\2\u0662"+
		"\u0664\3\2\2\2\u0663\u0665\5\u00aeX\2\u0664\u0663\3\2\2\2\u0664\u0665"+
		"\3\2\2\2\u0665\u00a9\3\2\2\2\u0666\u0667\t\26\2\2\u0667\u00ab\3\2\2\2"+
		"\u0668\u0672\5\u00caf\2\u0669\u066e\7\u00eb\2\2\u066a\u066b\7\63\2\2\u066b"+
		"\u066d\7\u00eb\2\2\u066c\u066a\3\2\2\2\u066d\u0670\3\2\2\2\u066e\u066c"+
		"\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0673\3\2\2\2\u0670\u066e\3\2\2\2\u0671"+
		"\u0673\5\n\6\2\u0672\u0669\3\2\2\2\u0672\u0671\3\2\2\2\u0673\u00ad\3\2"+
		"\2\2\u0674\u0676\7\u0087\2\2\u0675\u0677\7\20\2\2\u0676\u0675\3\2\2\2"+
		"\u0676\u0677\3\2\2\2\u0677\u0679\3\2\2\2\u0678\u067a\5\u008aF\2\u0679"+
		"\u0678\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067d\5\n"+
		"\6\2\u067c\u067e\7\21\2\2\u067d\u067c\3\2\2\2\u067d\u067e\3\2\2\2\u067e"+
		"\u00af\3\2\2\2\u067f\u0680\7:\2\2\u0680\u0681\7=\2\2\u0681\u0682\7l\2"+
		"\2\u0682\u0683\7\u00b0\2\2\u0683\u00b1\3\2\2\2\u0684\u068a\7]\2\2\u0685"+
		"\u068a\7\u00dd\2\2\u0686\u068a\7\\\2\2\u0687\u068a\7^\2\2\u0688\u068a"+
		"\5\u00b4[\2\u0689\u0684\3\2\2\2\u0689\u0685\3\2\2\2\u0689\u0686\3\2\2"+
		"\2\u0689\u0687\3\2\2\2\u0689\u0688\3\2\2\2\u068a\u00b3\3\2\2\2\u068b\u068c"+
		"\7c\2\2\u068c\u068d\7^\2\2\u068d\u00b5\3\2\2\2\u068e\u068f\5\n\6\2\u068f"+
		"\u00b7\3\2\2\2\u0690\u0691\t\27\2\2\u0691\u00b9\3\2\2\2\u0692\u0693\7"+
		"\u00ea\2\2\u0693\u00bb\3\2\2\2\u0694\u0695\7\u00eb\2\2\u0695\u00bd\3\2"+
		"\2\2\u0696\u0697\7\u00eb\2\2\u0697\u00bf\3\2\2\2\u0698\u0699\7\u00eb\2"+
		"\2\u0699\u00c1\3\2\2\2\u069a\u069b\7\u00eb\2\2\u069b\u00c3\3\2\2\2\u069c"+
		"\u069d\7\u00eb\2\2\u069d\u00c5\3\2\2\2\u069e\u069f\7\u00eb\2\2\u069f\u00c7"+
		"\3\2\2\2\u06a0\u06a1\t\30\2\2\u06a1\u00c9\3\2\2\2\u06a2\u06a3\7\u0085"+
		"\2\2\u06a3\u06a9\7A\2\2\u06a4\u06a5\7\u0085\2\2\u06a5\u06a9\7\u0086\2"+
		"\2\u06a6\u06a7\7\u0085\2\2\u06a7\u06a9\7=\2\2\u06a8\u06a2\3\2\2\2\u06a8"+
		"\u06a4\3\2\2\2\u06a8\u06a6\3\2\2\2\u06a9\u00cb\3\2\2\2\u06aa\u06ab\t\31"+
		"\2\2\u06ab\u00cd\3\2\2\2\u06ac\u06ad\t\32\2\2\u06ad\u00cf\3\2\2\2\u06ae"+
		"\u06b2\5\u00d2j\2\u06af\u06b2\5\u00d4k\2\u06b0\u06b2\5\u00d6l\2\u06b1"+
		"\u06ae\3\2\2\2\u06b1\u06af\3\2\2\2\u06b1\u06b0\3\2\2\2\u06b2\u06b4\3\2"+
		"\2\2\u06b3\u06b5\5\u00d8m\2\u06b4\u06b3\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5"+
		"\u06ba\3\2\2\2\u06b6\u06b8\7(\2\2\u06b7\u06b6\3\2\2\2\u06b7\u06b8\3\2"+
		"\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06bb\7\u00e9\2\2\u06ba\u06b7\3\2\2\2\u06ba"+
		"\u06bb\3\2\2\2\u06bb\u00d1\3\2\2\2\u06bc\u06bd\t\33\2\2\u06bd\u00d3\3"+
		"\2\2\2\u06be\u06bf\7\u00eb\2\2\u06bf\u00d5\3\2\2\2\u06c0\u06c1\7\u00eb"+
		"\2\2\u06c1\u00d7\3\2\2\2\u06c2\u06c3\7\b\2\2\u06c3\u06c4\5\n\6\2\u06c4"+
		"\u06c5\7\f\2\2\u06c5\u06d2\3\2\2\2\u06c6\u06c7\7\6\2\2\u06c7\u06cc\5\u00cc"+
		"g\2\u06c8\u06c9\7\63\2\2\u06c9\u06cb\5\u00ccg\2\u06ca\u06c8\3\2\2\2\u06cb"+
		"\u06ce\3\2\2\2\u06cc\u06ca\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06cf\3\2"+
		"\2\2\u06ce\u06cc\3\2\2\2\u06cf\u06d0\7\n\2\2\u06d0\u06d2\3\2\2\2\u06d1"+
		"\u06c2\3\2\2\2\u06d1\u06c6\3\2\2\2\u06d2\u00d9\3\2\2\2\u06d3\u06da\5\u00d0"+
		"i\2\u06d4\u06da\5\u00dco\2\u06d5\u06da\5\u00dep\2\u06d6\u06da\5\u00f4"+
		"{\2\u06d7\u06da\5\u00eex\2\u06d8\u06da\5\u00e4s\2\u06d9\u06d3\3\2\2\2"+
		"\u06d9\u06d4\3\2\2\2\u06d9\u06d5\3\2\2\2\u06d9\u06d6\3\2\2\2\u06d9\u06d7"+
		"\3\2\2\2\u06d9\u06d8\3\2\2\2\u06da\u00db\3\2\2\2\u06db\u06e0\5\u00b2Z"+
		"\2\u06dc\u06dd\7\t\2\2\u06dd\u06de\5\u00d0i\2\u06de\u06df\7\r\2\2\u06df"+
		"\u06e1\3\2\2\2\u06e0\u06dc\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u00dd\3\2"+
		"\2\2\u06e2\u06ee\7n\2\2\u06e3\u06e4\7\6\2\2\u06e4\u06e9\5\u00e0q\2\u06e5"+
		"\u06e6\7\63\2\2\u06e6\u06e8\5\u00e0q\2\u06e7\u06e5\3\2\2\2\u06e8\u06eb"+
		"\3\2\2\2\u06e9\u06e7\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06ec\3\2\2\2\u06eb"+
		"\u06e9\3\2\2\2\u06ec\u06ed\7\n\2\2\u06ed\u06ef\3\2\2\2\u06ee\u06e3\3\2"+
		"\2\2\u06ee\u06ef\3\2\2\2\u06ef\u00df\3\2\2\2\u06f0\u06f3\5\u00dco\2\u06f1"+
		"\u06f4\5\u00c2b\2\u06f2\u06f4\5\u00e2r\2\u06f3\u06f1\3\2\2\2\u06f3\u06f2"+
		"\3\2\2\2\u06f4\u00e1\3\2\2\2\u06f5\u06f7\7h\2\2\u06f6\u06f8\t\34\2\2\u06f7"+
		"\u06f6\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u00e3\3\2\2\2\u06f9\u06fd\7t"+
		"\2\2\u06fa\u06fd\5\u00e6t\2\u06fb\u06fd\5\u00e8u\2\u06fc\u06f9\3\2\2\2"+
		"\u06fc\u06fa\3\2\2\2\u06fc\u06fb\3\2\2\2\u06fd\u00e5\3\2\2\2\u06fe\u070a"+
		"\7r\2\2\u06ff\u0700\7\u00de\2\2\u0700\u0701\7\6\2\2\u0701\u0702\5\u00ea"+
		"v\2\u0702\u0703\7\n\2\2\u0703\u070a\3\2\2\2\u0704\u0705\7\u00df\2\2\u0705"+
		"\u0706\7\6\2\2\u0706\u0707\5\u00ecw\2\u0707\u0708\7\n\2\2\u0708\u070a"+
		"\3\2\2\2\u0709\u06fe\3\2\2\2\u0709\u06ff\3\2\2\2\u0709\u0704\3\2\2\2\u070a"+
		"\u00e7\3\2\2\2\u070b\u0726\7s\2\2\u070c\u0716\7\u00e0\2\2\u070d\u070e"+
		"\7\6\2\2\u070e\u0713\7\u00eb\2\2\u070f\u0710\7\20\2\2\u0710\u0711\5\u00ea"+
		"v\2\u0711\u0712\7\21\2\2\u0712\u0714\3\2\2\2\u0713\u070f\3\2\2\2\u0713"+
		"\u0714\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u0717\7\n\2\2\u0716\u070d\3\2"+
		"\2\2\u0716\u0717\3\2\2\2\u0717\u0726\3\2\2\2\u0718\u0723\7\u00e1\2\2\u0719"+
		"\u071a\7\6\2\2\u071a\u071f\5\u00c0a\2\u071b\u071c\7\20\2\2\u071c\u071d"+
		"\5\u00ecw\2\u071d\u071e\7\21\2\2\u071e\u0720\3\2\2\2\u071f\u071b\3\2\2"+
		"\2\u071f\u0720\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u0722\7\n\2\2\u0722\u0724"+
		"\3\2\2\2\u0723\u0719\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u0726\3\2\2\2\u0725"+
		"\u070b\3\2\2\2\u0725\u070c\3\2\2\2\u0725\u0718\3\2\2\2\u0726\u00e9\3\2"+
		"\2\2\u0727\u072c\7\u00eb\2\2\u0728\u0729\7\22\2\2\u0729\u072b\7\u00eb"+
		"\2\2\u072a\u0728\3\2\2\2\u072b\u072e\3\2\2\2\u072c\u072a\3\2\2\2\u072c"+
		"\u072d\3\2\2\2\u072d\u00eb\3\2\2\2\u072e\u072c\3\2\2\2\u072f\u0734\5\u00c0"+
		"a\2\u0730\u0731\7\22\2\2\u0731\u0733\5\u00c0a\2\u0732\u0730\3\2\2\2\u0733"+
		"\u0736\3\2\2\2\u0734\u0732\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u00ed\3\2"+
		"\2\2\u0736\u0734\3\2\2\2\u0737\u073c\5\u00f0y\2\u0738\u0739\7\22\2\2\u0739"+
		"\u073b\5\u00f0y\2\u073a\u0738\3\2\2\2\u073b\u073e\3\2\2\2\u073c\u073a"+
		"\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u073f\3\2\2\2\u073e\u073c\3\2\2\2\u073f"+
		"\u0740\7\4\2\2\u0740\u0741\5\u00f2z\2\u0741\u00ef\3\2\2\2\u0742\u0746"+
		"\5\u00d0i\2\u0743\u0746\5\u00dep\2\u0744\u0746\5\u00dco\2\u0745\u0742"+
		"\3\2\2\2\u0745\u0743\3\2\2\2\u0745\u0744\3\2\2\2\u0746\u00f1\3\2\2\2\u0747"+
		"\u074d\5\u00d0i\2\u0748\u074d\5\u00dep\2\u0749\u074d\5\u00f4{\2\u074a"+
		"\u074d\5\u00e4s\2\u074b\u074d\5\u00dco\2\u074c\u0747\3\2\2\2\u074c\u0748"+
		"\3\2\2\2\u074c\u0749\3\2\2\2\u074c\u074a\3\2\2\2\u074c\u074b\3\2\2\2\u074d"+
		"\u00f3\3\2\2\2\u074e\u0753\7\u00e2\2\2\u074f\u0750\7\t\2\2\u0750\u0751"+
		"\5\u00d0i\2\u0751\u0752\7\r\2\2\u0752\u0754\3\2\2\2\u0753\u074f\3\2\2"+
		"\2\u0753\u0754\3\2\2\2\u0754\u00f5\3\2\2\2\u0755\u0756\t\35\2\2\u0756"+
		"\u00f7\3\2\2\2\u0757\u0758\7p\2\2\u0758\u0759\7r\2\2\u0759\u075a\7t\2"+
		"\2\u075a\u00f9\3\2\2\2\u075b\u075c\7p\2\2\u075c\u075d\7s\2\2\u075d\u075e"+
		"\7t\2\2\u075e\u00fb\3\2\2\2\u075f\u0760\7v\2\2\u0760\u0761\7r\2\2\u0761"+
		"\u0762\7t\2\2\u0762\u00fd\3\2\2\2\u0763\u0764\7v\2\2\u0764\u0765\7s\2"+
		"\2\u0765\u0766\7t\2\2\u0766\u00ff\3\2\2\2\u0767\u0768\7p\2\2\u0768\u0769"+
		"\7l\2\2\u0769\u076a\7m\2\2\u076a\u0101\3\2\2\2\u076b\u076c\7\u00fe\2\2"+
		"\u076c\u076d\5\u0108\u0085\2\u076d\u076e\7\20\2\2\u076e\u076f\5\u010c"+
		"\u0087\2\u076f\u0770\7\21\2\2\u0770\u0771\7\u00bd\2\2\u0771\u0772\5\u0114"+
		"\u008b\2\u0772\u0773\7$\2\2\u0773\u0774\5\n\6\2\u0774\u078e\3\2\2\2\u0775"+
		"\u0776\7\u00fe\2\2\u0776\u0777\5\u0108\u0085\2\u0777\u0778\7\20\2\2\u0778"+
		"\u0779\5\u010c\u0087\2\u0779\u077a\7\21\2\2\u077a\u077b\7\6\2\2\u077b"+
		"\u077c\7\u00bd\2\2\u077c\u077d\5\u0114\u008b\2\u077d\u077e\7$\2\2\u077e"+
		"\u077f\5\n\6\2\u077f\u0780\7\n\2\2\u0780\u078e\3\2\2\2\u0781\u0782\7\u00fe"+
		"\2\2\u0782\u0783\5\u0108\u0085\2\u0783\u0784\7\20\2\2\u0784\u0785\5\u010c"+
		"\u0087\2\u0785\u0786\7\21\2\2\u0786\u0787\7\6\2\2\u0787\u0788\7\u00bd"+
		"\2\2\u0788\u0789\5\n\6\2\u0789\u078a\7$\2\2\u078a\u078b\5\u0114\u008b"+
		"\2\u078b\u078c\7\n\2\2\u078c\u078e\3\2\2\2\u078d\u076b\3\2\2\2\u078d\u0775"+
		"\3\2\2\2\u078d\u0781\3\2\2\2\u078e\u0103\3\2\2\2\u078f\u0790\7\u00ff\2"+
		"\2\u0790\u0791\5\u010a\u0086\2\u0791\u0792\7\20\2\2\u0792\u0793\5\u0110"+
		"\u0089\2\u0793\u0794\7\21\2\2\u0794\u0795\5\u0106\u0084\2\u0795\u0105"+
		"\3\2\2\2\u0796\u0797\7\6\2\2\u0797\u0798\5\u0116\u008c\2\u0798\u0799\7"+
		"\n\2\2\u0799\u0107\3\2\2\2\u079a\u079b\7\u00eb\2\2\u079b\u0109\3\2\2\2"+
		"\u079c\u079d\7\u00eb\2\2\u079d\u010b\3\2\2\2\u079e\u07a3\5\u010e\u0088"+
		"\2\u079f\u07a0\7\63\2\2\u07a0\u07a2\5\u010e\u0088\2\u07a1\u079f\3\2\2"+
		"\2\u07a2\u07a5\3\2\2\2\u07a3\u07a1\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u010d"+
		"\3\2\2\2\u07a5\u07a3\3\2\2\2\u07a6\u07a9\7\u00eb\2\2\u07a7\u07a8\7$\2"+
		"\2\u07a8\u07aa\5\u0114\u008b\2\u07a9\u07a7\3\2\2\2\u07a9\u07aa\3\2\2\2"+
		"\u07aa\u07ad\3\2\2\2\u07ab\u07ac\7\25\2\2\u07ac\u07ae\5\u00ccg\2\u07ad"+
		"\u07ab\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u010f\3\2\2\2\u07af\u07b4\5\u0112"+
		"\u008a\2\u07b0\u07b1\7\63\2\2\u07b1\u07b3\5\u0112\u008a\2\u07b2\u07b0"+
		"\3\2\2\2\u07b3\u07b6\3\2\2\2\u07b4\u07b2\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5"+
		"\u0111\3\2\2\2\u07b6\u07b4\3\2\2\2\u07b7\u07b8\t\36\2\2\u07b8\u07b9\7"+
		"\u00eb\2\2\u07b9\u07ba\7$\2\2\u07ba\u07bb\5\u0114\u008b\2\u07bb\u0113"+
		"\3\2\2\2\u07bc\u07bd\t\37\2\2\u07bd\u0115\3\2\2\2\u07be\u07c0\5\u0118"+
		"\u008d\2\u07bf\u07be\3\2\2\2\u07bf\u07c0\3\2\2\2\u07c0\u07c1\3\2\2\2\u07c1"+
		"\u07c3\5\4\3\2\u07c2\u07c4\7\u00f9\2\2\u07c3\u07c2\3\2\2\2\u07c3\u07c4"+
		"\3\2\2\2\u07c4\u07c6\3\2\2\2\u07c5\u07c7\7\u0100\2\2\u07c6\u07c5\3\2\2"+
		"\2\u07c6\u07c7\3\2\2\2\u07c7\u07d4\3\2\2\2\u07c8\u07ca\5\u0118\u008d\2"+
		"\u07c9\u07c8\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u07cd"+
		"\5\4\3\2\u07cc\u07ce\7\u00f9\2\2\u07cd\u07cc\3\2\2\2\u07cd\u07ce\3\2\2"+
		"\2\u07ce\u07d0\3\2\2\2\u07cf\u07d1\7\u0100\2\2\u07d0\u07cf\3\2\2\2\u07d0"+
		"\u07d1\3\2\2\2\u07d1\u07d3\3\2\2\2\u07d2\u07c9\3\2\2\2\u07d3\u07d6\3\2"+
		"\2\2\u07d4\u07d2\3\2\2\2\u07d4\u07d5\3\2\2\2\u07d5\u0117\3\2\2\2\u07d6"+
		"\u07d4\3\2\2\2\u07d7\u07d8\7\u00fa\2\2\u07d8\u0119\3\2\2\2\u00de\u011b"+
		"\u0120\u0126\u012c\u0130\u0135\u013a\u013e\u0146\u0152\u0158\u015d\u0166"+
		"\u0175\u0190\u0196\u0198\u019a\u01a8\u01ae\u01b3\u01c3\u01c8\u01cc\u01cf"+
		"\u01d3\u01dc\u01e2\u01e6\u01ed\u01f4\u01f8\u01ff\u0203\u0213\u0218\u021e"+
		"\u0222\u0225\u022d\u0233\u0238\u0243\u0246\u024b\u0256\u025c\u0261\u0265"+
		"\u0268\u0270\u0275\u0279\u027c\u0280\u0287\u02b0\u02ec\u02f0\u02fb\u02ff"+
		"\u030a\u0339\u0341\u0349\u0354\u035f\u0364\u036c\u0371\u0375\u037b\u037f"+
		"\u0389\u038d\u0394\u03a4\u03ad\u03b2\u03b4\u03b8\u03c0\u03c3\u03c7\u03ca"+
		"\u03d9\u03dc\u03df\u03ee\u03f1\u03f5\u03f8\u03fb\u03fe\u0413\u0416\u041a"+
		"\u041e\u0422\u0426\u0434\u0438\u043c\u0442\u0448\u044b\u044e\u045a\u0461"+
		"\u0466\u046a\u0470\u0482\u0488\u048f\u0495\u0499\u04a2\u04a5\u04a8\u04ad"+
		"\u04b1\u04b4\u04b7\u04be\u04c3\u04c8\u04cd\u04d5\u04dd\u04e1\u04e4\u04e7"+
		"\u04ee\u04fb\u0504\u050a\u0510\u0517\u051e\u0525\u052b\u0538\u053c\u0547"+
		"\u054b\u0552\u0555\u0564\u0574\u059f\u05a7\u05ab\u05b7\u05bf\u05c7\u05cf"+
		"\u05d7\u05ee\u05f4\u05f9\u05fb\u0604\u061e\u0623\u062f\u0638\u063e\u0642"+
		"\u0646\u0649\u0652\u0658\u065c\u0661\u0664\u066e\u0672\u0676\u0679\u067d"+
		"\u0689\u06a8\u06b1\u06b4\u06b7\u06ba\u06cc\u06d1\u06d9\u06e0\u06e9\u06ee"+
		"\u06f3\u06f7\u06fc\u0709\u0713\u0716\u071f\u0723\u0725\u072c\u0734\u073c"+
		"\u0745\u074c\u0753\u078d\u07a3\u07a9\u07ad\u07b4\u07bf\u07c3\u07c6\u07c9"+
		"\u07cd\u07d0\u07d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}