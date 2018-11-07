grammar Vtl2;
  ASSIGN            : ':=';
  MEMBERSHIP		: '#';
  EVAL              : 'eval';
  IF                : 'if';
  THEN              : 'then';
  ELSE              : 'else';
  USING             : 'using';
  WITH              : 'with';
  CURRENT_DATE      : 'current_date';
  ON                : 'on';
  DROP              : 'drop';
  KEEP              : 'keep';
  CALC              : 'calc';
  ATTRCALC          : 'attrcalc';
  RENAME            : 'rename';
  AS                : 'as';
  AND               : 'and';
  OR                : 'or';
  XOR               : 'xor';
  NOT               : 'not';
  BETWEEN           : 'between';
  IN                : 'in';
  NOT_IN			: 'not_in';
  ISNULL            : 'isnull';
  EX                : 'ex';
  UNION             : 'union';
  DIFF              : 'diff';
  SYMDIFF           : 'symdiff';
  INTERSECT         : 'intersect';
  KEYS              : 'keys';
  CARTESIAN_PER     : ',';
  INTYEAR           : 'intyear';
  INTMONTH          : 'intmonth';
  INTDAY            : 'intday';
  CHECK             : 'check';
  EXISTS_IN         : 'exists_in';
  TO                : 'to';
  RETURN            : 'return';
  IMBALANCE         : 'imbalance';
  ERRORCODE         : 'errorcode';
  ALL               : 'all';
  AGGREGATE         : 'aggr';
  ERRORLEVEL        : 'errorlevel';
  ORDER             : 'order';
  BY                : 'by';
  RANK              : 'rank';
  ASC               : 'asc';
  DESC              : 'desc';
  MIN               : 'min';
  MAX               : 'max';
  FIRST             : 'first';
  LAST              : 'last';
  INDEXOF           : 'indexof';
  ABS               : 'abs';
  KEY               : 'key';
  LN                : 'ln';
  LOG               : 'log';
  TRUNC             : 'trunc';
  ROUND             : 'round';
  POWER             : 'power';
  MOD               : 'mod';
  LEN               : 'length';
  CONCAT            : '||';
  TRIM              : 'trim';
  UCASE             : 'upper';
  LCASE             : 'lower';
  SUBSTR            : 'substr';
  SUM               : 'sum';
  AVG               : 'avg';
  MEDIAN            : 'median';
  COUNT             : 'count';
  DIMENSION         : 'identifier';
  MEASURE           : 'measure';
  ATTRIBUTE         : 'attribute';
  FILTER            : 'filter';
  MERGE             : 'merge';
  EXP               : 'exp';
  ROLE              : 'role';
  VIRAL             : 'viral';
  CHARSET_MATCH     : 'match_characters';
  TYPE              : 'type';
  NVL               : 'nvl';
  HIERARCHY         : 'hierarchy';
  OPTIONAL			: '_';
  INVALID			: 'invalid';

  VALUE_DOMAIN			          : 'valuedomain';
  VARIABLE				            : 'variable';
  DATA			                  : 'data';
  STRUCTURE			              : 'structure';
  DATASET				              : 'dataset';
  OPERATOR                    : 'operator';
  DEFINE						          : 'define';
  PUT_SYMBOL                  : '<-';
  DATAPOINT						        : 'datapoint';
  HIERARCHICAL					      : 'hierarchical';
  RULESET						          : 'ruleset';
  RULE									: 'rule';
  END							            : 'end';
  ALTER_DATASET					      : 'alterDataset';
  LTRIM							          : 'ltrim';
  RTRIM							          : 'rtrim';
  INSTR							          : 'instr';
  REPLACE						          : 'replace';
  CEIL							          : 'ceil';
  FLOOR							          : 'floor';
  SQRT							          : 'sqrt';
  ANY							            : 'any';
  SETDIFF						          : 'setdiff';
  STDDEV_POP					        : 'stddev_pop';
  STDDEV_SAMP							: 'stddev_samp';
  VAR_POP						          : 'var_pop';
  VAR_SAMP						        : 'var_samp';
  GROUP									: 'group';
  EXCEPT								: 'except';
  HAVING								: 'having';
  FIRST_VALUE					        : 'first_value';
  LAST_VALUE					        : 'last_value';
  LAG						        	: 'lag';
  LEAD									: 'lead';
  RATIO_TO_REPORT				      : 'ratio_to_report';
  OVER							          : 'over';
  PRECEDING                   : 'preceding';
  FOLLOWING                   : 'following';
  UNBOUNDED					  : 'unbounded';
  PARTITION					          : 'partition';
  ROWS							          : 'rows';
  RANGE							          : 'range';
  CURRENT					        : 'current';
  VALID							          : 'valid';
  FILL_TIME_SERIES				    : 'fill_time_series';
  FLOW_TO_STOCK					      : 'flow_to_stock';
  STOCK_TO_FLOW					      : 'stock_to_flow';
  TIMESHIFT						        : 'timeshift';
  MEASURES						        : 'measures';
  NO_MEASURES							: 'no_measures';
  CONDITION					          : 'condition';
  BOOLEAN							  : 'boolean';
  DATE							          : 'date';
  TIME_PERIOD						 :'time_period';
  NUMBER                      : 'number';
  STRING						          : 'string';
  INTEGER						          : 'integer';
  FLOAT                       : 'float';
  LIST							          : 'list';
  RECORD						          : 'record';
  RESTRICT						        : 'restrict';
  YYYY							          : 'yyyy';
  MM							            : 'mm';
  DD							            : 'dd';
  MAX_LENGTH					        : 'maxLength';
  REGEXP						          : 'regexp';
  IS							            : 'is';
  WHEN							          : 'when';
  FROM							          : 'from';
  AGGREGATES         			    : 'aggregates';
  POINTS						          : 'points';
  POINT									  : 'point';
  TOTAL							          : 'total';
  PARTIAL						          : 'partial';
  ALWAYS								  : 'always';
  INNER_JOIN							    : 'inner_join';
  LEFT_JOIN							      : 'left_join';
  CROSS_JOIN							    : 'cross_join';
  FULL_JOIN                   : 'full_join';
  MAPS_FROM						        : 'maps_from';
  MAPS_TO						          : 'maps_to';
  MAP_TO						          : 'map_to';
  MAP_FROM						        : 'map_from';
  RETURNS						          : 'returns';
  PIVOT                       : 'pivot';
  UNPIVOT                     : 'unpivot';
  SUBSPACE                    : 'sub';
  APPLY                       : 'apply';
  CONDITIONED				  : 'conditioned';
  PERIOD_INDICATOR			  : 'period_indicator';
  SINGLE					  : 'single';
  DURATION					  : 'duration';
  TIME_AGG					  : 'time_agg';
  UNIT						  : 'unit';
  VALUE						  : 'Value';
  VALUEDOMAINS				  : 'valuedomains';
  VARIABLES					  : 'variables';
  INPUT						  : 'input';
  OUTPUT					  : 'output';
  CAST						  : 'cast';
  RULE_PRIORITY			      : 'rule_priority';
  DATASET_PRIORITY			  : 'dataset_priority';
  DEFAULT					  : 'default';
  CHECK_DATAPOINT			  : 'check_datapoint';
  CHECK_HIERARCHY			  : 'check_hierarchy';
  COMPUTED					  : 'computed';
  NON_NULL					  : 'non_null';
  NON_ZERO					  : 'non_zero';
  PARTIAL_NULL				  : 'partial_null';
  PARTIAL_ZERO				  : 'partial_zero';
  ALWAYS_NULL				  : 'always_null';
  ALWAYS_ZERO				  : 'always_zero';
  COMPONENTS				  : 'components';
  ALL_MEASURES				  : 'all_measures';
  SCALAR					  : 'scalar';
  COMPONENT					  : 'component';
  DATAPOINT_ON_VD			  : 'datapoint_on_valuedomains';
  DATAPOINT_ON_VAR			  : 'datapoint_on_variables';
  HIERARCHICAL_ON_VD		  : 'hierarchical_on_valuedomains';
  HIERARCHICAL_ON_VAR		  : 'hierarchical_on_variables';
  SET						  : 'set';
  LANGUAGE					  : 'language';


INTEGER_CONSTANT
  :
  POSITIVE_CONSTANT
  |NEGATIVE_CONSTANT
  ;

POSITIVE_CONSTANT
 :
 ('0'..'9')+
 ;

NEGATIVE_CONSTANT
 :
  '-' ('0'..'9')+
  ;

FLOAT_CONSTANT
  :
  ('0'..'9')+ '.' ('0'..'9')* FLOATEXP?
  | ('0'..'9')+ FLOATEXP
  ;


fragment
FLOATEXP
  :
  (
    'e'
    | 'E'
  )
  (
    '+'
    | '-'
  )?
  ('0'..'9')+
  ;

BOOLEAN_CONSTANT
  :
  'true'
  | 'false'
  ;

NULL_CONSTANT
  :
  'null'
  ;

STRING_CONSTANT
  :
  '"' (~'"')* '"'
  ;

IDENTIFIER
  :
  LETTER
  (
    LETTER
    | '_'
    | '.'
    | '0'..'9'
  )*
  ;

  DIGITS0_9
    :
    '0'..'9'
    ;

  MONTH
    :
    '0' DIGITS0_9
    | '1' '0'|'1'|'2'
    ;

  DAY
    :
    ('0'|'1'|'2' DIGITS0_9)
    | '3' ('0'|'1')
    ;

  YEAR
    :
    DIGITS0_9 DIGITS0_9 DIGITS0_9 DIGITS0_9
    ;

   WEEK
    :
    ('0'|'1'|'2'|'3'|'4' DIGITS0_9)
    | '5' ('0'|'1'|'2'|'3')
    ;

  HOURS
    :
    ('0'|'1' DIGITS0_9)
    | '2' ('0'|'1'|'2'|'3'|'4')
    ;

  MINUTES
    :
    ('0'|'1'|'2'|'3'|'4'|'5' DIGITS0_9)
    | '6' '0'
    ;

  SECONDS
    :
    ('0'|'1'|'2'|'3'|'4'|'5' DIGITS0_9)
    | ('6' '0')
    ;

  DATE_FORMAT
    :
    YEAR
    | (YEAR 'S' '1'|'2')
    | (YEAR 'Q' '1'|'2'|'3'|'4')
    | (YEAR 'M' MONTH)
    | (YEAR 'D' MONTH DAY)
    | (YEAR 'A')
    | (YEAR '-' 'Q' '1'|'2'|'3'|'4')
    | (YEAR '-' MONTH)
    | (YEAR '-' MONTH '-' DAY)
    | (YEAR)
    ;

   TIME_FORMAT
    :
    YEAR ('A')?
    | (YEAR ('-')? 'S' '1'|'2')
    | (YEAR ('-')? 'Q' '1'|'2'|'3'|'4')
    | (YEAR 'M'|'-' MONTH)
    | (YEAR 'W' WEEK)
    | (YEAR 'M' MONTH 'D' DAY)
    | (YEAR '-' MONTH '-' DAY)
    | (DAY '-' MONTH '-' YEAR)
    | (MONTH '-' DAY '-' YEAR)
    ;

TIME_UNIT
    :
    'A'
    |'S'
    |'M'
    |'Q'
    |'W'
    |'D'
    |'T'
    ;


 /* old
    TIME
    :
    YEAR '-' MONTH '-' DAY ('T' HOURS ':' MINUTES ':' SECONDS 'Z')?
    ; */

 TIME
  :
  (YEAR '-' MONTH '-' DAY)'/'(YEAR '-' MONTH '-' DAY)
  ;

fragment
LETTER
  :
  'A'..'Z'
  | 'a'..'z'
  ;

WS
  :
  (
    ' '
    | '\r'
    | '\t'
    | '\u000C'
    | '\n'
  )->skip
  ;

/* old EOL
  :
    '\r'
    | '\n'
  ; */

EOL
 : ';'
 ;

ML_COMMENT
  :
  ('/*' (.)*? '*/')->skip;

SL_COMMENT
  :
  ('//' (.)*? '\n') ->skip;


COMPARISON_OP
  :
  '='
  | ('<')
  | ('>')
  | ('>=')
  | ('<=')
  | ('<>')
  ;

FREQUENCY
  :
  'A'
  | 'S'
  | 'Q'
  | 'M'
  | 'W'
  | 'D'
  ;


start: (statement? (ML_COMMENT)* (SL_COMMENT)* EOL)* statement? EOF
      | ML_COMMENT
      | SL_COMMENT
      ;

/* Assignment */
statement: ((varID ASSIGN)? expr) | persistentAssignment;

persistentAssignment
  : 
  varID PUT_SYMBOL expr
  ;

/* Conditional */

optionalExpr
 : expr | OPTIONAL
 ;

expr: 
    exprAtom ('[' (datasetClause|(expr ASSIGN expr)) ']')*(MEMBERSHIP componentID)?
    |('+'|'-'|NOT) expr
    |expr ('*'|'/') expr
	|expr ('+'|'-') expr
	|expr ('>'|'<'|'<='|'>='|'='|'<>') expr
	|expr (IN|NOT_IN)(lists|IDENTIFIER)
	|expr EXISTS_IN expr ALL?
	|EXISTS_IN '(' expr ',' expr (',' retainType)? ')'
	|expr ('='|'<>') expr
	|expr AND expr
	|expr (OR|XOR) expr										 
    |IF expr THEN expr ELSE expr	
    |exprComplex	
    |exprAtom
    |expr CONCAT expr
    |constant
  	|IDENTIFIER
    ;
 
exprComplex:
    validationExpr #exprValidationExpr
    |defExpr #definitionExpressions
	|aggrInvocation #standaloneAggregateFunction
	|aggrInvocationCompExpr #componentExpressionwithAggrClause
	|anFunctionClause #standaloneAnalyticFunction
	|aggrFunction #simpleaggregateFunctions
	|timeExpr #timeexpressions
	|setExpr #setExpressions 
	|callFunction #callFunctionExpression
	|joinExpr #joinExpression
	|defFunction #defineFunction // TODO remove
	;

timeExpr
 :timeSeriesExpr
 |periodExpr (opComp=('>'|'<'|'<='|'>='|'='|'<>') expr)?
 |timeShiftExpr
 |timeAggExpr
 |CURRENT_DATE
 ; 

/* Rulesets Definition */       
    
defHierarchical
  :
  defineHierarchicalRuleset rulesetID '(' hierRuleSignature ')' IS ruleClauseHierarchical endHierarchicalRuleset
  ;
ruleClauseHierarchical
  :
  ruleItemHierarchical (';' ruleItemHierarchical)*
  ;
ruleItemHierarchical
  :
  (IDENTIFIER ':')? codeItemRelation (erCode)? (erLevel)?
  ;
  
 hierRuleSignature
  :
  (VALUE_DOMAIN|VARIABLE) valueDomainSignature? RULE IDENTIFIER
  ; 
  
 valueDomainSignature
  :
  CONDITION IDENTIFIER (AS IDENTIFIER)? (',' IDENTIFIER (AS IDENTIFIER)?)*
  ; 
  
codeItemRelation
  :
  ( WHEN expr THEN )? codeItemRef codeItemRelationClause (codeItemRelationClause)*
  ;

codeItemRelationClause
  :
  (opAdd=('+'|'-'))? IDENTIFIER ('[' expr ']')?
  ;
  
codeItemRef
  :
  IDENTIFIER (opComp=('='|'>'|'<'|'>='|'<='))?
  ;
  
defDatapoint
  :
  defineDatapointRuleset rulesetID '(' rulesetSignature ')' IS ruleClauseDatapoint endDatapointRuleset
  ;
ruleClauseDatapoint
  :
  ruleItemDatapoint (';' ruleItemDatapoint)*
  ;
ruleItemDatapoint
  :
  (IDENTIFIER ':')? ( WHEN expr THEN )? expr (erCode)? (erLevel)?
  ;
  
rulesetSignature
  :
  (VALUE_DOMAIN|VARIABLE) varSignature (',' varSignature)*
  ;
varSignature
  :
  varID (AS IDENTIFIER)?
  ;  

/* Artefacts Definition */
defExpr
  :
  defOperator
  |defDatapoint
  |defHierarchical
  ; 
  
defOperator
  :
  DEFINE OPERATOR operatorID '(' (parameterItem (',' parameterItem)*)? ')' (RETURNS dataType)? IS expr END OPERATOR
  ;  
 
parameterItem
  :
  varID dataType (DEFAULT constant)?
  ;
    
callFunction
  :
  operatorID '(' ((constant|'_') (',' (constant|'_'))*)? ')'
  |operatorID '(' ((operatorID|'_') (',' (operatorID|'_'))*)? ')' // TODO: MLT
  ;

/* Functions */
exprAtom
  :
  ROUND '(' expr (',' optionalExpr)? ')'							# roundAtom
  | CEIL '(' expr ')'												# ceilAtom
  | FLOOR '(' expr ')'												# floorAtom
  | ABS '(' expr ')'												# minAtom
  | EXP '(' expr ')'												# expAtom
  | LN '(' expr ')'													# lnAtom
  | LOG '(' expr ',' expr ')'										# logAtom
  | TRUNC '(' expr (',' optionalExpr)? ')'							# lnAtom
  | POWER '(' expr ',' expr ')'										# powerAtom
  | SQRT '(' expr ')'												# sqrtAtom
  | LEN '(' expr ')'												# lenAtom
  | BETWEEN '(' expr ',' expr ',' expr ')'							# betweenAtom
  | TRIM '(' expr ')'												# trimAtom
  | LTRIM '(' expr ')'												# ltrimAtom
  | RTRIM '(' expr ')'												# rtrimAtom
  | UCASE '(' expr ')'												# ucaseAtom
  | LCASE '(' expr ')'												# lcaseAtom
  | SUBSTR '(' expr (',' optionalExpr)? (',' optionalExpr)? ')'		# substrAtom
  | INSTR '(' expr ',' expr ( ',' optionalExpr)? (',' optionalExpr)? ')'	# instrAtom
  | REPLACE '(' expr ',' expr ( ',' optionalExpr)? ')'				# replaceAtom
  | CHARSET_MATCH '(' expr ','  expr ')'							# charsetMatchAtom
  | ISNULL '(' expr ')'												# isNullAtom
  | NVL '(' expr ',' expr ')'										# nvlAtom
  | MOD '(' expr ',' expr ')'										# modAtom
  | ref																# refAtom
  | evalExpr														# evalExprAtom
  | castExpr														# castExprAtom
  | hierarchyExpr													# hierarchyExprAtom
  | FLOW_TO_STOCK '(' expr ')'										# flowToStockAtom
  | STOCK_TO_FLOW '(' expr ')'										# stockToFlowAtom
  | validationDatapoint												#validateDPruleset
  | validationHierarchical 											#validateHRruleset
  | validationExpr													#validationSimple
  ;


/* Parentheses */
ref: '(' expr ')'													# parenthesisExprRef
  | varID															# varIdRef
  | constant														# constantRef
  ; 

/* identifier list*/		
  
identifierList
  :
  '[' IDENTIFIER (',' IDENTIFIER)* ']'
  ;			 
  
lists
 :
 '{' constant (',' constant)* '}'
 |'(' constant (',' constant)* ')' // TODO: REMOVE
 ;  

/* eval */
evalExpr
  :
  EVAL '(' routineName '(' (componentID|constant)? (',' (componentID|constant))* ')' (LANGUAGE STRING_CONSTANT)? (RETURNS outputParameterType)? ')'
  ;
  
/* cast */
castExpr
  :  
  CAST '(' expr ',' (basicScalarType|valueDomainName) (',' STRING_CONSTANT)? ')'
  ;

/* Time operators */

periodExpr
  :
  PERIOD_INDICATOR '(' expr? ')'
  ;

/* timeshift */
timeShiftExpr
  :
  TIMESHIFT '(' expr ',' INTEGER_CONSTANT ')'
  ;

/* fill time series */
timeSeriesExpr
  :
  FILL_TIME_SERIES '(' expr (',' (SINGLE|ALL))? ')'
  ;  
  
/* time period agg */
timeAggExpr
  :
  TIME_AGG '(' STRING_CONSTANT (',' (STRING_CONSTANT|'_'))? (',' (expr|'_'))? (',' (FIRST|LAST))? ')' 
  ;

/* check */
validationExpr
  : CHECK '(' expr (erCode)? (erLevel)? (IMBALANCE expr)?  (INVALID|ALL)? ')'  
  ;

validationDatapoint
  :
   CHECK_DATAPOINT '(' expr ',' IDENTIFIER (COMPONENTS componentID (',' componentID)*)? (INVALID|ALL_MEASURES|ALL)? ')'
  ;
  
validationHierarchical
  :
  CHECK_HIERARCHY '(' expr',' IDENTIFIER (CONDITION componentID (',' componentID)*)? (RULE IDENTIFIER)? (NON_NULL|NON_ZERO|PARTIAL_NULL|PARTIAL_ZERO|ALWAYS_NULL|ALWAYS_ZERO)? (DATASET|DATASET_PRIORITY)? (INVALID|ALL|ALL_MEASURES)? ')'
  ;

erCode 
  :
  ERRORCODE  constant
  ;
  
erLevel
  :
  ERRORLEVEL  constant
  ;

/* hierarchy */
hierarchyExpr
  : 
  HIERARCHY '(' expr ',' IDENTIFIER (CONDITION componentID (',' componentID)*)? (RULE IDENTIFIER)? ((NON_NULL|NON_ZERO|PARTIAL_NULL|PARTIAL_ZERO|ALWAYS_NULL|ALWAYS_ZERO)|'_')? ((RULE|DATASET|RULE_PRIORITY)|'_')? ((COMPUTED|ALL)|'_')? ')'
  ;

/* Clauses. */
datasetClause
  :
  RENAME renameClause
  | aggrClause
  | filterClause
  | calcClause
  | keepClause
  | dropClause
  | pivotExpr
  | unpivotExpr
  | subspaceExpr
  ;



anFunctionClause
  :
  (aggrFunctionName|anFunction)? '(' expr? (',' expr)* OVER '(' (partitionByClause)? (orderByClause)? (windowingClause)? ')' ')'
  ;  

partitionByClause
  :
  PARTITION BY IDENTIFIER (',' IDENTIFIER)*
  ;
  
orderByClause
  :
  ORDER BY componentID (ASC|DESC)? (',' componentID (ASC|DESC)?)* 
  ;
  
windowingClause
  :
  ((DATA POINTS)|RANGE) BETWEEN limitClauseItem AND limitClauseItem
  ;
  
limitClauseItem
  :
  (INTEGER_CONSTANT PRECEDING)
  | (INTEGER_CONSTANT FOLLOWING)
  | (CURRENT DATA POINT)
  | (UNBOUNDED PRECEDING) 
  | (UNBOUNDED FOLLOWING)
  ;   

/* Join Expressions*/

joinExpr
  :
  joinKeyword '(' joinClause (joinBody)? ')'
  ;

joinClause
  :
  expr (AS IDENTIFIER)? (',' expr (AS IDENTIFIER)?)* (USING componentID (',' componentID)*)?
  ;

joinBody
  :
  joinFilterClause? (joinCalcClause|joinApplyClause|joinAggClause)? (joinKeepClause|joinDropClause)?   joinRenameClause?
  ;

joinCalcClause
  :
  componentRole? joinCalcClauseItem (',' joinCalcClauseItem)*
  ;

joinCalcClauseItem
  :
  CALC (componentRole)? joinCalcExpr (',' (componentRole)? joinCalcExpr)*
  ;

joinCalcExpr
  :
  componentID ':='  expr
  ;
  
joinAggClause
  :
  componentRole? AGGREGATE joinAggClauseItem (',' joinAggClauseItem)* groupingClause? havingClause?
  ;

joinAggClauseItem
  :
   (componentRole)? joinAggExpr (',' joinAggExpr)*
  ;

joinAggExpr
  :
  componentID ':=' aggrFunction 
  ;
  
joinKeepClause
  :
  KEEP keepClauseItem (',' keepClauseItem)* 
  ;

joinDropClause
  :
  DROP dropClauseItem (',' dropClauseItem)* 
  ;

joinFilterClause
  :
  FILTER expr|rulesetID
  ;

joinRenameClause
  :
  RENAME (componentID MEMBERSHIP)? varID  TO (componentID MEMBERSHIP)? varID (',' (componentID MEMBERSHIP)? varID TO (componentID MEMBERSHIP)? varID)*?
  ;
  
joinApplyClause
  :
  APPLY expr
  ; 


/* Analytic Functions
anFunction
  :
  FIRST_VALUE '(' expr ')'
  | LAG '(' expr ',' INTEGER_CONSTANT ',' INTEGER_CONSTANT ')'
  | LAST_VALUE '(' expr ')'
  | RANK '(' expr ')'
  | RATIO_TO_REPORT '(' expr ')'
  |LEAD '(' expr ')'
  ; */


anFunction
  :
  FIRST_VALUE 
  | LAG 
  | LAST_VALUE 
  | RANK 
  | RATIO_TO_REPORT 
  |LEAD 
  ;

aggregateClause
  :
  aggrFunctionClause (',' aggrFunctionClause)*
  ;

aggrFunctionClause
  :
  (componentRole)? componentID ':=' aggrFunction
  ;

getFiltersClause
  :
    getFilterClause (',' getFilterClause)*
 ;

getFilterClause
  :
    (FILTER? expr)
  ;

aggrClause 
  : 
  AGGREGATE aggregateClause groupingClause? havingClause?
  ;

filterClause
  :
  FILTER expr 
  ;

renameClause
  :
  varID TO varID (',' varID TO varID)* 
  ;

aggrFunction
  :
  SUM '(' expr ')'
  | AVG '(' expr ')'
  | COUNT '(' expr? ')'
  | MEDIAN '(' expr ')'
  | MIN '(' expr ')'
  | MAX '(' expr ')'
  | RANK '(' expr ')'
  | STDDEV_POP '(' expr ')'
  | STDDEV_SAMP '(' expr ')'
  | VAR_POP '(' expr ')'
  | VAR_SAMP '(' expr ')'
  ;

calcClause
  :
  CALC calcClauseItem (',' calcClauseItem)*
  ;

calcClauseItem
  :
  (componentRole)? componentID ':=' calcExpr
  ;

calcExpr
  :
  aggrFunction '(' expr ')'
  | expr
  ;

dropClause
  :
  DROP dropClauseItem (',' dropClauseItem)*
  ;

dropClauseItem
  :
  componentID
  | (datasetID MEMBERSHIP componentID)
  ;

keepClause
  :
  KEEP keepClauseItem (',' keepClauseItem)*
  ;

keepClauseItem
  :
  componentID
  | (datasetID MEMBERSHIP componentID)
  ;

/* pivot/unpivot/subspace expressions */

unpivotExpr
:
UNPIVOT varID ',' varID
;

pivotExpr
 :
  PIVOT varID ',' varID
 ;

subspaceExpr
  : SUBSPACE varID '=' constant (',' varID '=' constant)*
  ;

inBetweenClause
  :
  IN (setExpr|IDENTIFIER)
  | NOT_IN (setExpr|IDENTIFIER)
  ;

/* Set expressions */
setExpr
  :
  UNION '(' expr (',' expr)* ')'
  | SYMDIFF '(' expr ',' expr ')' 
  | SETDIFF '(' expr ',' expr ')'
  | INTERSECT '(' expr (',' expr)* ')'
  ;
  

/* subscript expression*/
subscriptExpr
  :
  persistentDatasetID '[' componentID '=' constant ( ',' componentID '=' constant)? ']' 
  ;

/*Aggregation operators invocation*/
aggrInvocation
  :
  aggrFunctionName '(' IDENTIFIER (MEMBERSHIP componentID)? (',' IDENTIFIER(MEMBERSHIP componentID)?)* (groupingClause)? (havingClause)? ')'
  ;
  
aggrInvocationCompExpr
  :
  aggrFunctionName '(' IDENTIFIER (MEMBERSHIP componentID)? (',' IDENTIFIER(MEMBERSHIP componentID)?)* ')' (groupingClause)? (havingClause)?
  ;  

aggrFunctionName
  :
  SUM 
  | AVG 
  | COUNT 
  | MEDIAN 
  | MIN 
  | MAX
  | STDDEV_POP 
  | STDDEV_SAMP
  | VAR_POP 
  | VAR_SAMP
  ;

groupingClause
  :
  groupKeyword ((IDENTIFIER (',' IDENTIFIER)*)|(expr))
  ;
   
havingClause   
  :
  HAVING '('? aggrFunction? expr ')'?
  ;
  
/* aggregate sequences */
  
returnAll
  :
  RETURN ALL DATA POINTS
  ;

/* Role name*/
componentRole
  :
  MEASURE
  |COMPONENT
  |DIMENSION
  |ATTRIBUTE
  |viralAttribute
  ;
  
 viralAttribute
  : 
  VIRAL ATTRIBUTE
  ; 

/* Arithmetic */
logBase
  :
  expr
  ;

exponent
  :
  INTEGER_CONSTANT|FLOAT_CONSTANT
  ;

/* Variable, identifiers, constants */
persistentDatasetID
  : 
  STRING_CONSTANT
  ;
  
 datasetID
  : 
  IDENTIFIER
  ;

 rulesetID
  :
  IDENTIFIER
  ;

varID
  :
  IDENTIFIER
  ;
  
componentID
  :
  IDENTIFIER
  ;
  
 operatorID
  :
  IDENTIFIER
  ;
  
  
 routineName
  :
  IDENTIFIER
  ; 
  
 joinKeyword
  :
  INNER_JOIN
  |LEFT_JOIN
  |FULL_JOIN
  |CROSS_JOIN
  ;

 groupKeyword
  :
  (GROUP BY)
  |(GROUP EXCEPT)
  |(GROUP ALL)
  ;

constant
  :
  INTEGER_CONSTANT
  | FLOAT_CONSTANT
  | BOOLEAN_CONSTANT
  | STRING_CONSTANT
  | NULL_CONSTANT
  ;
 
  componentType2
  :
  STRING
  | INTEGER
  | FLOAT
  | BOOLEAN
  | DATE
  ;
  
 scalarType
  :
  (basicScalarType|valueDomainName|setName)scalarTypeConstraint?((NOT)? NULL_CONSTANT)?
  ;
  
  basicScalarType
  :
  STRING
  | INTEGER
  | NUMBER
  | BOOLEAN
  | DATE
  | TIME_PERIOD
  | DURATION
  | SCALAR
  | TIME
  ;
  
  valueDomainName
  :
  IDENTIFIER
  ;
  
  setName
  :
  IDENTIFIER
  ;
  
  scalarTypeConstraint
  :
  ('[' expr ']')
  |('{' constant (',' constant)* '}')
  ;
  
 dataType
  :
  scalarType
  |componentType
  |datasetType
  |scalarSetType
  |operatorType
  |rulesetType
  ;
  
  componentType
  :
  componentRole ('<' scalarType '>')?
  ;
  
  datasetType
  :
  DATASET ('{'compConstraint (',' compConstraint)* '}' )?
  ;
  
  compConstraint
  :
  componentType (componentID|multModifier)
  ;
  
  multModifier
  :
  '_' ('+'|'*')?
  ;
  
  rulesetType
  :
  RULESET
  |dpRuleset
  |hrRuleset
  ;
  
  dpRuleset
  :
  DATAPOINT
  |(DATAPOINT_ON_VD '{' prodValueDomains '}')
  |(DATAPOINT_ON_VAR '{' prodVariables '}')
  ;
  
  hrRuleset
  :
  HIERARCHICAL
  |(HIERARCHICAL_ON_VD ('{' IDENTIFIER ('('prodValueDomains')')? '}')? )
  |(HIERARCHICAL_ON_VAR ('{' varID ('('prodVariables')')? '}')? )
  ;
  
  prodValueDomains
  :
   IDENTIFIER ('*' IDENTIFIER)*
  ;
  
  prodVariables
  :
   varID ('*' varID)*
  ;
  
  operatorType
  :
  inputParameterType ('*' inputParameterType)* '->' outputParameterType
  ;
  
  inputParameterType
  :
  scalarType
  |datasetType
  |componentType
  ;
  
  outputParameterType
  :
  scalarType
  |datasetType
  |scalarSetType
  |rulesetType
  |componentType
  ;
  
  scalarSetType
  :
  SET ('<' scalarType '>')?
  ;
  
  retainType
  :
  BOOLEAN_CONSTANT
  | ALL
  ;
  
 defineDatapointRuleset
  :
  DEFINE DATAPOINT RULESET
  ;
  
 defineHierarchicalRuleset
   :
   DEFINE HIERARCHICAL RULESET
   ;
   
 endDatapointRuleset
   :
   END DATAPOINT RULESET
   ;
   
 endHierarchicalRuleset
   :
   END HIERARCHICAL RULESET
   ;
   
   
 defineDataStructure
   :
   DEFINE DATA STRUCTURE
   ; 

// TODO: to remove
    defFunction
      :
      CREATE_FUNCTION functionID '(' argList ')' RETURNS dimensionType AS expr
      // utility of brackets to cover the body of a function
      | CREATE_FUNCTION functionID '(' argList ')' '{' RETURNS dimensionType AS expr '}'
      // adjustment to official grammar in order to handle "as" nodes in a harmonized way (e.g. RETURNS dimensionType AS expr vs. RENAME expr AS IDENTIFIER)
      | CREATE_FUNCTION functionID '(' argList ')' '{' RETURNS expr AS dimensionType'}'
      ;

    // added procedure definition
    defProcedure
      :
      DEFINE_PROCEDURE procedureID '(' procedureArgList ')' procedureBody
      ;

    procedureBody
      :
      '{' statements '}'
      ;

     functionID
      :
      IDENTIFIER
      ;


     procedureID
      :
      IDENTIFIER
      ;

    argList
      : arg (',' arg)*
      ;

    arg
      :
      IDENTIFIER (AS dimensionType)? (ASSIGN constant)?
      ;

    procedureArgList
      :
      procedureArg (',' procedureArg)*
      ;

    procedureArg
      :
      (INPUT | OUTPUT) IDENTIFIER (AS dimensionType)
      ;

    /* Dimension Type */
    dimensionType
      :
      DATE
      | STRING
      | NUMBER
      | INTEGER
      | DATASET
      ;

    statements
     :
     comment? statement EOL? NL? (comment? statement EOL? NL?)*
     ;

     // added comment parser rule
     comment
      :
      ML_COMMENT
      ;
