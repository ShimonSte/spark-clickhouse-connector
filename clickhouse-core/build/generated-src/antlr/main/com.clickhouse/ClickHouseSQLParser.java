// Generated from com.clickhouse/ClickHouseSQL.g4 by ANTLR 4.9.3
package com.clickhouse.spark;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClickHouseSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, AFTER=2, ALIAS=3, ALL=4, ALTER=5, AND=6, ANTI=7, ANY=8, ARRAY=9, 
		AS=10, ASCENDING=11, ASOF=12, AST=13, ASYNC=14, ATTACH=15, BETWEEN=16, 
		BOTH=17, BY=18, CASE=19, CAST=20, CHECK=21, CLEAR=22, CLUSTER=23, CODEC=24, 
		COLLATE=25, COLUMN=26, COMMENT=27, CONSTRAINT=28, CREATE=29, CROSS=30, 
		CUBE=31, CURRENT=32, DATABASE=33, DATABASES=34, DATE=35, DAY=36, DEDUPLICATE=37, 
		DEFAULT=38, DELAY=39, DELETE=40, DESC=41, DESCENDING=42, DESCRIBE=43, 
		DETACH=44, DICTIONARIES=45, DICTIONARY=46, DISK=47, DISTINCT=48, DISTRIBUTED=49, 
		DROP=50, ELSE=51, END=52, ENGINE=53, EVENTS=54, EXISTS=55, EXPLAIN=56, 
		EXPRESSION=57, EXTRACT=58, FETCHES=59, FINAL=60, FIRST=61, FLUSH=62, FOLLOWING=63, 
		FOR=64, FORMAT=65, FREEZE=66, FROM=67, FULL=68, FUNCTION=69, GLOBAL=70, 
		GRANULARITY=71, GROUP=72, HAVING=73, HIERARCHICAL=74, HOUR=75, ID=76, 
		IF=77, ILIKE=78, IN=79, INDEX=80, INF=81, INJECTIVE=82, INNER=83, INSERT=84, 
		INTERVAL=85, INTO=86, IS=87, IS_OBJECT_ID=88, JOIN=89, KEY=90, KILL=91, 
		LAST=92, LAYOUT=93, LEADING=94, LEFT=95, LIFETIME=96, LIKE=97, LIMIT=98, 
		LIVE=99, LOCAL=100, LOGS=101, MATERIALIZE=102, MATERIALIZED=103, MAX=104, 
		MERGES=105, MIN=106, MINUTE=107, MODIFY=108, MONTH=109, MOVE=110, MUTATION=111, 
		NAN_SQL=112, NO=113, NOT=114, NULL_SQL=115, NULLS=116, OFFSET=117, ON=118, 
		OPTIMIZE=119, OR=120, ORDER=121, OUTER=122, OUTFILE=123, OVER=124, PARTITION=125, 
		POPULATE=126, PRECEDING=127, PREWHERE=128, PRIMARY=129, PROJECTION=130, 
		QUARTER=131, RANGE=132, RELOAD=133, REMOVE=134, RENAME=135, REPLACE=136, 
		REPLICA=137, REPLICATED=138, RIGHT=139, ROLLUP=140, ROW=141, ROWS=142, 
		SAMPLE=143, SECOND=144, SELECT=145, SEMI=146, SENDS=147, SET=148, SETTINGS=149, 
		SHOW=150, SOURCE=151, START=152, STOP=153, SUBSTRING=154, SYNC=155, SYNTAX=156, 
		SYSTEM=157, TABLE=158, TABLES=159, TEMPORARY=160, TEST=161, THEN=162, 
		TIES=163, TIMEOUT=164, TIMESTAMP=165, TO=166, TOP=167, TOTALS=168, TRAILING=169, 
		TRIM=170, TRUNCATE=171, TTL=172, TYPE=173, UNBOUNDED=174, UNION=175, UPDATE=176, 
		USE=177, USING=178, UUID=179, VALUES=180, VIEW=181, VOLUME=182, WATCH=183, 
		WEEK=184, WHEN=185, WHERE=186, WINDOW=187, WITH=188, YEAR=189, JSON_FALSE=190, 
		JSON_TRUE=191, IDENTIFIER=192, FLOATING_LITERAL=193, OCTAL_LITERAL=194, 
		DECIMAL_LITERAL=195, HEXADECIMAL_LITERAL=196, STRING_LITERAL=197, ARROW=198, 
		ASTERISK=199, BACKQUOTE=200, BACKSLASH=201, COLON=202, COMMA=203, CONCAT=204, 
		DASH=205, DOT=206, EQ_DOUBLE=207, EQ_SINGLE=208, GE=209, GT=210, LBRACE=211, 
		LBRACKET=212, LE=213, LPAREN=214, LT=215, NOT_EQ=216, PERCENT=217, PLUS=218, 
		QUERY=219, QUOTE_DOUBLE=220, QUOTE_SINGLE=221, RBRACE=222, RBRACKET=223, 
		RPAREN=224, SEMICOLON=225, SLASH=226, UNDERSCORE=227, MULTI_LINE_COMMENT=228, 
		SINGLE_LINE_COMMENT=229, WHITESPACE=230;
	public static final int
		RULE_queryStmt = 0, RULE_query = 1, RULE_alterStmt = 2, RULE_alterTableClause = 3, 
		RULE_assignmentExprList = 4, RULE_assignmentExpr = 5, RULE_tableColumnPropertyType = 6, 
		RULE_partitionClause = 7, RULE_attachStmt = 8, RULE_checkStmt = 9, RULE_createStmt = 10, 
		RULE_dictionarySchemaClause = 11, RULE_dictionaryAttrDfnt = 12, RULE_dictionaryEngineClause = 13, 
		RULE_dictionaryPrimaryKeyClause = 14, RULE_dictionaryArgExpr = 15, RULE_sourceClause = 16, 
		RULE_lifetimeClause = 17, RULE_layoutClause = 18, RULE_rangeClause = 19, 
		RULE_dictionarySettingsClause = 20, RULE_clusterClause = 21, RULE_uuidClause = 22, 
		RULE_destinationClause = 23, RULE_subqueryClause = 24, RULE_tableSchemaClause = 25, 
		RULE_engineClause = 26, RULE_partitionByClause = 27, RULE_primaryKeyClause = 28, 
		RULE_sampleByClause = 29, RULE_ttlClause = 30, RULE_engineExpr = 31, RULE_tableElementExpr = 32, 
		RULE_tableColumnDfnt = 33, RULE_tableColumnPropertyExpr = 34, RULE_tableIndexDfnt = 35, 
		RULE_tableProjectionDfnt = 36, RULE_codecExpr = 37, RULE_codecArgExpr = 38, 
		RULE_ttlExpr = 39, RULE_describeStmt = 40, RULE_dropStmt = 41, RULE_existsStmt = 42, 
		RULE_explainStmt = 43, RULE_insertStmt = 44, RULE_columnsClause = 45, 
		RULE_dataClause = 46, RULE_killStmt = 47, RULE_optimizeStmt = 48, RULE_renameStmt = 49, 
		RULE_projectionSelectStmt = 50, RULE_selectUnionStmt = 51, RULE_selectStmtWithParens = 52, 
		RULE_selectStmt = 53, RULE_withClause = 54, RULE_topClause = 55, RULE_fromClause = 56, 
		RULE_arrayJoinClause = 57, RULE_windowClause = 58, RULE_prewhereClause = 59, 
		RULE_whereClause = 60, RULE_groupByClause = 61, RULE_havingClause = 62, 
		RULE_orderByClause = 63, RULE_projectionOrderByClause = 64, RULE_limitByClause = 65, 
		RULE_limitClause = 66, RULE_settingsClause = 67, RULE_joinExpr = 68, RULE_joinOp = 69, 
		RULE_joinOpCross = 70, RULE_joinConstraintClause = 71, RULE_sampleClause = 72, 
		RULE_limitExpr = 73, RULE_orderExprList = 74, RULE_orderExpr = 75, RULE_ratioExpr = 76, 
		RULE_settingExprList = 77, RULE_settingExpr = 78, RULE_windowExpr = 79, 
		RULE_winPartitionByClause = 80, RULE_winOrderByClause = 81, RULE_winFrameClause = 82, 
		RULE_winFrameExtend = 83, RULE_winFrameBound = 84, RULE_setStmt = 85, 
		RULE_showStmt = 86, RULE_systemStmt = 87, RULE_truncateStmt = 88, RULE_useStmt = 89, 
		RULE_watchStmt = 90, RULE_columnTypeExpr = 91, RULE_columnExprList = 92, 
		RULE_columnsExpr = 93, RULE_columnExpr = 94, RULE_columnArgList = 95, 
		RULE_columnArgExpr = 96, RULE_columnLambdaExpr = 97, RULE_columnIdentifier = 98, 
		RULE_nestedIdentifier = 99, RULE_tableExpr = 100, RULE_tableFunctionExpr = 101, 
		RULE_tableIdentifier = 102, RULE_tableArgList = 103, RULE_tableArgExpr = 104, 
		RULE_databaseIdentifier = 105, RULE_floatingLiteral = 106, RULE_numberLiteral = 107, 
		RULE_literal = 108, RULE_interval = 109, RULE_keyword = 110, RULE_keywordForAlias = 111, 
		RULE_alias = 112, RULE_identifier = 113, RULE_identifierOrNull = 114, 
		RULE_enumValue = 115;
	private static String[] makeRuleNames() {
		return new String[] {
			"queryStmt", "query", "alterStmt", "alterTableClause", "assignmentExprList", 
			"assignmentExpr", "tableColumnPropertyType", "partitionClause", "attachStmt", 
			"checkStmt", "createStmt", "dictionarySchemaClause", "dictionaryAttrDfnt", 
			"dictionaryEngineClause", "dictionaryPrimaryKeyClause", "dictionaryArgExpr", 
			"sourceClause", "lifetimeClause", "layoutClause", "rangeClause", "dictionarySettingsClause", 
			"clusterClause", "uuidClause", "destinationClause", "subqueryClause", 
			"tableSchemaClause", "engineClause", "partitionByClause", "primaryKeyClause", 
			"sampleByClause", "ttlClause", "engineExpr", "tableElementExpr", "tableColumnDfnt", 
			"tableColumnPropertyExpr", "tableIndexDfnt", "tableProjectionDfnt", "codecExpr", 
			"codecArgExpr", "ttlExpr", "describeStmt", "dropStmt", "existsStmt", 
			"explainStmt", "insertStmt", "columnsClause", "dataClause", "killStmt", 
			"optimizeStmt", "renameStmt", "projectionSelectStmt", "selectUnionStmt", 
			"selectStmtWithParens", "selectStmt", "withClause", "topClause", "fromClause", 
			"arrayJoinClause", "windowClause", "prewhereClause", "whereClause", "groupByClause", 
			"havingClause", "orderByClause", "projectionOrderByClause", "limitByClause", 
			"limitClause", "settingsClause", "joinExpr", "joinOp", "joinOpCross", 
			"joinConstraintClause", "sampleClause", "limitExpr", "orderExprList", 
			"orderExpr", "ratioExpr", "settingExprList", "settingExpr", "windowExpr", 
			"winPartitionByClause", "winOrderByClause", "winFrameClause", "winFrameExtend", 
			"winFrameBound", "setStmt", "showStmt", "systemStmt", "truncateStmt", 
			"useStmt", "watchStmt", "columnTypeExpr", "columnExprList", "columnsExpr", 
			"columnExpr", "columnArgList", "columnArgExpr", "columnLambdaExpr", "columnIdentifier", 
			"nestedIdentifier", "tableExpr", "tableFunctionExpr", "tableIdentifier", 
			"tableArgList", "tableArgExpr", "databaseIdentifier", "floatingLiteral", 
			"numberLiteral", "literal", "interval", "keyword", "keywordForAlias", 
			"alias", "identifier", "identifierOrNull", "enumValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'false'", 
			"'true'", null, null, null, null, null, null, "'->'", "'*'", "'`'", "'\\'", 
			"':'", "','", "'||'", "'-'", "'.'", "'=='", "'='", "'>='", "'>'", "'{'", 
			"'['", "'<='", "'('", "'<'", null, "'%'", "'+'", "'?'", "'\"'", "'''", 
			"'}'", "']'", "')'", "';'", "'/'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "AFTER", "ALIAS", "ALL", "ALTER", "AND", "ANTI", "ANY", 
			"ARRAY", "AS", "ASCENDING", "ASOF", "AST", "ASYNC", "ATTACH", "BETWEEN", 
			"BOTH", "BY", "CASE", "CAST", "CHECK", "CLEAR", "CLUSTER", "CODEC", "COLLATE", 
			"COLUMN", "COMMENT", "CONSTRAINT", "CREATE", "CROSS", "CUBE", "CURRENT", 
			"DATABASE", "DATABASES", "DATE", "DAY", "DEDUPLICATE", "DEFAULT", "DELAY", 
			"DELETE", "DESC", "DESCENDING", "DESCRIBE", "DETACH", "DICTIONARIES", 
			"DICTIONARY", "DISK", "DISTINCT", "DISTRIBUTED", "DROP", "ELSE", "END", 
			"ENGINE", "EVENTS", "EXISTS", "EXPLAIN", "EXPRESSION", "EXTRACT", "FETCHES", 
			"FINAL", "FIRST", "FLUSH", "FOLLOWING", "FOR", "FORMAT", "FREEZE", "FROM", 
			"FULL", "FUNCTION", "GLOBAL", "GRANULARITY", "GROUP", "HAVING", "HIERARCHICAL", 
			"HOUR", "ID", "IF", "ILIKE", "IN", "INDEX", "INF", "INJECTIVE", "INNER", 
			"INSERT", "INTERVAL", "INTO", "IS", "IS_OBJECT_ID", "JOIN", "KEY", "KILL", 
			"LAST", "LAYOUT", "LEADING", "LEFT", "LIFETIME", "LIKE", "LIMIT", "LIVE", 
			"LOCAL", "LOGS", "MATERIALIZE", "MATERIALIZED", "MAX", "MERGES", "MIN", 
			"MINUTE", "MODIFY", "MONTH", "MOVE", "MUTATION", "NAN_SQL", "NO", "NOT", 
			"NULL_SQL", "NULLS", "OFFSET", "ON", "OPTIMIZE", "OR", "ORDER", "OUTER", 
			"OUTFILE", "OVER", "PARTITION", "POPULATE", "PRECEDING", "PREWHERE", 
			"PRIMARY", "PROJECTION", "QUARTER", "RANGE", "RELOAD", "REMOVE", "RENAME", 
			"REPLACE", "REPLICA", "REPLICATED", "RIGHT", "ROLLUP", "ROW", "ROWS", 
			"SAMPLE", "SECOND", "SELECT", "SEMI", "SENDS", "SET", "SETTINGS", "SHOW", 
			"SOURCE", "START", "STOP", "SUBSTRING", "SYNC", "SYNTAX", "SYSTEM", "TABLE", 
			"TABLES", "TEMPORARY", "TEST", "THEN", "TIES", "TIMEOUT", "TIMESTAMP", 
			"TO", "TOP", "TOTALS", "TRAILING", "TRIM", "TRUNCATE", "TTL", "TYPE", 
			"UNBOUNDED", "UNION", "UPDATE", "USE", "USING", "UUID", "VALUES", "VIEW", 
			"VOLUME", "WATCH", "WEEK", "WHEN", "WHERE", "WINDOW", "WITH", "YEAR", 
			"JSON_FALSE", "JSON_TRUE", "IDENTIFIER", "FLOATING_LITERAL", "OCTAL_LITERAL", 
			"DECIMAL_LITERAL", "HEXADECIMAL_LITERAL", "STRING_LITERAL", "ARROW", 
			"ASTERISK", "BACKQUOTE", "BACKSLASH", "COLON", "COMMA", "CONCAT", "DASH", 
			"DOT", "EQ_DOUBLE", "EQ_SINGLE", "GE", "GT", "LBRACE", "LBRACKET", "LE", 
			"LPAREN", "LT", "NOT_EQ", "PERCENT", "PLUS", "QUERY", "QUOTE_DOUBLE", 
			"QUOTE_SINGLE", "RBRACE", "RBRACKET", "RPAREN", "SEMICOLON", "SLASH", 
			"UNDERSCORE", "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ClickHouseSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ClickHouseSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QueryStmtContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode INTO() { return getToken(ClickHouseSQLParser.INTO, 0); }
		public TerminalNode OUTFILE() { return getToken(ClickHouseSQLParser.OUTFILE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseSQLParser.STRING_LITERAL, 0); }
		public TerminalNode FORMAT() { return getToken(ClickHouseSQLParser.FORMAT, 0); }
		public IdentifierOrNullContext identifierOrNull() {
			return getRuleContext(IdentifierOrNullContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ClickHouseSQLParser.SEMICOLON, 0); }
		public InsertStmtContext insertStmt() {
			return getRuleContext(InsertStmtContext.class,0);
		}
		public QueryStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterQueryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitQueryStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitQueryStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryStmtContext queryStmt() throws RecognitionException {
		QueryStmtContext _localctx = new QueryStmtContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_queryStmt);
		int _la;
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALTER:
			case ATTACH:
			case CHECK:
			case CREATE:
			case DESC:
			case DESCRIBE:
			case DETACH:
			case DROP:
			case EXISTS:
			case EXPLAIN:
			case KILL:
			case OPTIMIZE:
			case RENAME:
			case REPLACE:
			case SELECT:
			case SET:
			case SHOW:
			case SYSTEM:
			case TRUNCATE:
			case USE:
			case WATCH:
			case WITH:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				query();
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTO) {
					{
					setState(233);
					match(INTO);
					setState(234);
					match(OUTFILE);
					setState(235);
					match(STRING_LITERAL);
					}
				}

				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FORMAT) {
					{
					setState(238);
					match(FORMAT);
					setState(239);
					identifierOrNull();
					}
				}

				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(242);
					match(SEMICOLON);
					}
				}

				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				insertStmt();
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

	public static class QueryContext extends ParserRuleContext {
		public AlterStmtContext alterStmt() {
			return getRuleContext(AlterStmtContext.class,0);
		}
		public AttachStmtContext attachStmt() {
			return getRuleContext(AttachStmtContext.class,0);
		}
		public CheckStmtContext checkStmt() {
			return getRuleContext(CheckStmtContext.class,0);
		}
		public CreateStmtContext createStmt() {
			return getRuleContext(CreateStmtContext.class,0);
		}
		public DescribeStmtContext describeStmt() {
			return getRuleContext(DescribeStmtContext.class,0);
		}
		public DropStmtContext dropStmt() {
			return getRuleContext(DropStmtContext.class,0);
		}
		public ExistsStmtContext existsStmt() {
			return getRuleContext(ExistsStmtContext.class,0);
		}
		public ExplainStmtContext explainStmt() {
			return getRuleContext(ExplainStmtContext.class,0);
		}
		public KillStmtContext killStmt() {
			return getRuleContext(KillStmtContext.class,0);
		}
		public OptimizeStmtContext optimizeStmt() {
			return getRuleContext(OptimizeStmtContext.class,0);
		}
		public RenameStmtContext renameStmt() {
			return getRuleContext(RenameStmtContext.class,0);
		}
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public SetStmtContext setStmt() {
			return getRuleContext(SetStmtContext.class,0);
		}
		public ShowStmtContext showStmt() {
			return getRuleContext(ShowStmtContext.class,0);
		}
		public SystemStmtContext systemStmt() {
			return getRuleContext(SystemStmtContext.class,0);
		}
		public TruncateStmtContext truncateStmt() {
			return getRuleContext(TruncateStmtContext.class,0);
		}
		public UseStmtContext useStmt() {
			return getRuleContext(UseStmtContext.class,0);
		}
		public WatchStmtContext watchStmt() {
			return getRuleContext(WatchStmtContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				alterStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				attachStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				checkStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				createStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
				describeStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(253);
				dropStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(254);
				existsStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(255);
				explainStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(256);
				killStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(257);
				optimizeStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(258);
				renameStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(259);
				selectUnionStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(260);
				setStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(261);
				showStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(262);
				systemStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(263);
				truncateStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(264);
				useStmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(265);
				watchStmt();
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

	public static class AlterStmtContext extends ParserRuleContext {
		public AlterStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStmt; }
	 
		public AlterStmtContext() { }
		public void copyFrom(AlterStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AlterTableStmtContext extends AlterStmtContext {
		public TerminalNode ALTER() { return getToken(ClickHouseSQLParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseSQLParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<AlterTableClauseContext> alterTableClause() {
			return getRuleContexts(AlterTableClauseContext.class);
		}
		public AlterTableClauseContext alterTableClause(int i) {
			return getRuleContext(AlterTableClauseContext.class,i);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseSQLParser.COMMA, i);
		}
		public AlterTableStmtContext(AlterStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterStmtContext alterStmt() throws RecognitionException {
		AlterStmtContext _localctx = new AlterStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterStmt);
		int _la;
		try {
			_localctx = new AlterTableStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(ALTER);
			setState(269);
			match(TABLE);
			setState(270);
			tableIdentifier();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(271);
				clusterClause();
				}
			}

			setState(274);
			alterTableClause();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(275);
				match(COMMA);
				setState(276);
				alterTableClause();
				}
				}
				setState(281);
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

	public static class AlterTableClauseContext extends ParserRuleContext {
		public AlterTableClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableClause; }
	 
		public AlterTableClauseContext() { }
		public void copyFrom(AlterTableClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AlterTableClauseReplaceContext extends AlterTableClauseContext {
		public TerminalNode REPLACE() { return getToken(ClickHouseSQLParser.REPLACE, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseSQLParser.FROM, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public AlterTableClauseReplaceContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseReplace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseReplace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseReplace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyOrderByContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseSQLParser.MODIFY, 0); }
		public TerminalNode ORDER() { return getToken(ClickHouseSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ClickHouseSQLParser.BY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AlterTableClauseModifyOrderByContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseModifyOrderBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseModifyOrderBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseModifyOrderBy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseUpdateContext extends AlterTableClauseContext {
		public TerminalNode UPDATE() { return getToken(ClickHouseSQLParser.UPDATE, 0); }
		public AssignmentExprListContext assignmentExprList() {
			return getRuleContext(AssignmentExprListContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AlterTableClauseUpdateContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseUpdate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseClearProjectionContext extends AlterTableClauseContext {
		public TerminalNode CLEAR() { return getToken(ClickHouseSQLParser.CLEAR, 0); }
		public TerminalNode PROJECTION() { return getToken(ClickHouseSQLParser.PROJECTION, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseSQLParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseClearProjectionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseClearProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseClearProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseClearProjection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyRemoveContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseSQLParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseSQLParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode REMOVE() { return getToken(ClickHouseSQLParser.REMOVE, 0); }
		public TableColumnPropertyTypeContext tableColumnPropertyType() {
			return getRuleContext(TableColumnPropertyTypeContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public AlterTableClauseModifyRemoveContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseModifyRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseModifyRemove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseModifyRemove(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDeleteContext extends AlterTableClauseContext {
		public TerminalNode DELETE() { return getToken(ClickHouseSQLParser.DELETE, 0); }
		public TerminalNode WHERE() { return getToken(ClickHouseSQLParser.WHERE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AlterTableClauseDeleteContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseDelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseCommentContext extends AlterTableClauseContext {
		public TerminalNode COMMENT() { return getToken(ClickHouseSQLParser.COMMENT, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseSQLParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseSQLParser.STRING_LITERAL, 0); }
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public AlterTableClauseCommentContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseComment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDropColumnContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseSQLParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseSQLParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public AlterTableClauseDropColumnContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseDropColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseDropColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseDropColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDetachContext extends AlterTableClauseContext {
		public TerminalNode DETACH() { return getToken(ClickHouseSQLParser.DETACH, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseDetachContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseDetach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseDetach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseDetach(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseAddIndexContext extends AlterTableClauseContext {
		public TerminalNode ADD() { return getToken(ClickHouseSQLParser.ADD, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseSQLParser.INDEX, 0); }
		public TableIndexDfntContext tableIndexDfnt() {
			return getRuleContext(TableIndexDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public TerminalNode AFTER() { return getToken(ClickHouseSQLParser.AFTER, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public AlterTableClauseAddIndexContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseAddIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseAddIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseAddIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDropPartitionContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseSQLParser.DROP, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseDropPartitionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseDropPartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseDropPartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseDropPartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseMaterializeIndexContext extends AlterTableClauseContext {
		public TerminalNode MATERIALIZE() { return getToken(ClickHouseSQLParser.MATERIALIZE, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseSQLParser.INDEX, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseSQLParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseMaterializeIndexContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseMaterializeIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseMaterializeIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseMaterializeIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseMaterializeProjectionContext extends AlterTableClauseContext {
		public TerminalNode MATERIALIZE() { return getToken(ClickHouseSQLParser.MATERIALIZE, 0); }
		public TerminalNode PROJECTION() { return getToken(ClickHouseSQLParser.PROJECTION, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseSQLParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseMaterializeProjectionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseMaterializeProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseMaterializeProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseMaterializeProjection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseMovePartitionContext extends AlterTableClauseContext {
		public TerminalNode MOVE() { return getToken(ClickHouseSQLParser.MOVE, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode TO() { return getToken(ClickHouseSQLParser.TO, 0); }
		public TerminalNode DISK() { return getToken(ClickHouseSQLParser.DISK, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseSQLParser.STRING_LITERAL, 0); }
		public TerminalNode VOLUME() { return getToken(ClickHouseSQLParser.VOLUME, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseSQLParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public AlterTableClauseMovePartitionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseMovePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseMovePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseMovePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseRenameContext extends AlterTableClauseContext {
		public TerminalNode RENAME() { return getToken(ClickHouseSQLParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseSQLParser.COLUMN, 0); }
		public List<NestedIdentifierContext> nestedIdentifier() {
			return getRuleContexts(NestedIdentifierContext.class);
		}
		public NestedIdentifierContext nestedIdentifier(int i) {
			return getRuleContext(NestedIdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(ClickHouseSQLParser.TO, 0); }
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public AlterTableClauseRenameContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseRename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseRename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseRename(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseFreezePartitionContext extends AlterTableClauseContext {
		public TerminalNode FREEZE() { return getToken(ClickHouseSQLParser.FREEZE, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseFreezePartitionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseFreezePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseFreezePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseFreezePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseClearColumnContext extends AlterTableClauseContext {
		public TerminalNode CLEAR() { return getToken(ClickHouseSQLParser.CLEAR, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseSQLParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseSQLParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseClearColumnContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseClearColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseClearColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseClearColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseSQLParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseSQLParser.COLUMN, 0); }
		public TableColumnDfntContext tableColumnDfnt() {
			return getRuleContext(TableColumnDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public AlterTableClauseModifyContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseModify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseModify(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseModify(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseClearIndexContext extends AlterTableClauseContext {
		public TerminalNode CLEAR() { return getToken(ClickHouseSQLParser.CLEAR, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseSQLParser.INDEX, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseSQLParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseClearIndexContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseClearIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseClearIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseClearIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseRemoveTTLContext extends AlterTableClauseContext {
		public TerminalNode REMOVE() { return getToken(ClickHouseSQLParser.REMOVE, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseSQLParser.TTL, 0); }
		public AlterTableClauseRemoveTTLContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseRemoveTTL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseRemoveTTL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseRemoveTTL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyCodecContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseSQLParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseSQLParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public CodecExprContext codecExpr() {
			return getRuleContext(CodecExprContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public AlterTableClauseModifyCodecContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseModifyCodec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseModifyCodec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseModifyCodec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseAttachContext extends AlterTableClauseContext {
		public TerminalNode ATTACH() { return getToken(ClickHouseSQLParser.ATTACH, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseSQLParser.FROM, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public AlterTableClauseAttachContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseAttach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseAttach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseAttach(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDropProjectionContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseSQLParser.DROP, 0); }
		public TerminalNode PROJECTION() { return getToken(ClickHouseSQLParser.PROJECTION, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public AlterTableClauseDropProjectionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseDropProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseDropProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseDropProjection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDropIndexContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseSQLParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseSQLParser.INDEX, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public AlterTableClauseDropIndexContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseDropIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseDropIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseDropIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyCommentContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseSQLParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseSQLParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ClickHouseSQLParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseSQLParser.STRING_LITERAL, 0); }
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public AlterTableClauseModifyCommentContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseModifyComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseModifyComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseModifyComment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyTTLContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseSQLParser.MODIFY, 0); }
		public TtlClauseContext ttlClause() {
			return getRuleContext(TtlClauseContext.class,0);
		}
		public AlterTableClauseModifyTTLContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseModifyTTL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseModifyTTL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseModifyTTL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseAddProjectionContext extends AlterTableClauseContext {
		public TerminalNode ADD() { return getToken(ClickHouseSQLParser.ADD, 0); }
		public TerminalNode PROJECTION() { return getToken(ClickHouseSQLParser.PROJECTION, 0); }
		public TableProjectionDfntContext tableProjectionDfnt() {
			return getRuleContext(TableProjectionDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public TerminalNode AFTER() { return getToken(ClickHouseSQLParser.AFTER, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public AlterTableClauseAddProjectionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseAddProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseAddProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseAddProjection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseAddColumnContext extends AlterTableClauseContext {
		public TerminalNode ADD() { return getToken(ClickHouseSQLParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseSQLParser.COLUMN, 0); }
		public TableColumnDfntContext tableColumnDfnt() {
			return getRuleContext(TableColumnDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public TerminalNode AFTER() { return getToken(ClickHouseSQLParser.AFTER, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public AlterTableClauseAddColumnContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlterTableClauseAddColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlterTableClauseAddColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlterTableClauseAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableClauseContext alterTableClause() throws RecognitionException {
		AlterTableClauseContext _localctx = new AlterTableClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alterTableClause);
		int _la;
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new AlterTableClauseAddColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(ADD);
				setState(283);
				match(COLUMN);
				setState(287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(284);
					match(IF);
					setState(285);
					match(NOT);
					setState(286);
					match(EXISTS);
					}
					break;
				}
				setState(289);
				tableColumnDfnt();
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER) {
					{
					setState(290);
					match(AFTER);
					setState(291);
					nestedIdentifier();
					}
				}

				}
				break;
			case 2:
				_localctx = new AlterTableClauseAddIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(ADD);
				setState(295);
				match(INDEX);
				setState(299);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(296);
					match(IF);
					setState(297);
					match(NOT);
					setState(298);
					match(EXISTS);
					}
					break;
				}
				setState(301);
				tableIndexDfnt();
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER) {
					{
					setState(302);
					match(AFTER);
					setState(303);
					nestedIdentifier();
					}
				}

				}
				break;
			case 3:
				_localctx = new AlterTableClauseAddProjectionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(ADD);
				setState(307);
				match(PROJECTION);
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(308);
					match(IF);
					setState(309);
					match(NOT);
					setState(310);
					match(EXISTS);
					}
					break;
				}
				setState(313);
				tableProjectionDfnt();
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER) {
					{
					setState(314);
					match(AFTER);
					setState(315);
					nestedIdentifier();
					}
				}

				}
				break;
			case 4:
				_localctx = new AlterTableClauseAttachContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				match(ATTACH);
				setState(319);
				partitionClause();
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(320);
					match(FROM);
					setState(321);
					tableIdentifier();
					}
				}

				}
				break;
			case 5:
				_localctx = new AlterTableClauseClearColumnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(324);
				match(CLEAR);
				setState(325);
				match(COLUMN);
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(326);
					match(IF);
					setState(327);
					match(EXISTS);
					}
					break;
				}
				setState(330);
				nestedIdentifier();
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(331);
					match(IN);
					setState(332);
					partitionClause();
					}
				}

				}
				break;
			case 6:
				_localctx = new AlterTableClauseClearIndexContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(335);
				match(CLEAR);
				setState(336);
				match(INDEX);
				setState(339);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(337);
					match(IF);
					setState(338);
					match(EXISTS);
					}
					break;
				}
				setState(341);
				nestedIdentifier();
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(342);
					match(IN);
					setState(343);
					partitionClause();
					}
				}

				}
				break;
			case 7:
				_localctx = new AlterTableClauseClearProjectionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(346);
				match(CLEAR);
				setState(347);
				match(PROJECTION);
				setState(350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(348);
					match(IF);
					setState(349);
					match(EXISTS);
					}
					break;
				}
				setState(352);
				nestedIdentifier();
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(353);
					match(IN);
					setState(354);
					partitionClause();
					}
				}

				}
				break;
			case 8:
				_localctx = new AlterTableClauseCommentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(357);
				match(COMMENT);
				setState(358);
				match(COLUMN);
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(359);
					match(IF);
					setState(360);
					match(EXISTS);
					}
					break;
				}
				setState(363);
				nestedIdentifier();
				setState(364);
				match(STRING_LITERAL);
				}
				break;
			case 9:
				_localctx = new AlterTableClauseDeleteContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(366);
				match(DELETE);
				setState(367);
				match(WHERE);
				setState(368);
				columnExpr(0);
				}
				break;
			case 10:
				_localctx = new AlterTableClauseDetachContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(369);
				match(DETACH);
				setState(370);
				partitionClause();
				}
				break;
			case 11:
				_localctx = new AlterTableClauseDropColumnContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(371);
				match(DROP);
				setState(372);
				match(COLUMN);
				setState(375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(373);
					match(IF);
					setState(374);
					match(EXISTS);
					}
					break;
				}
				setState(377);
				nestedIdentifier();
				}
				break;
			case 12:
				_localctx = new AlterTableClauseDropIndexContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(378);
				match(DROP);
				setState(379);
				match(INDEX);
				setState(382);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(380);
					match(IF);
					setState(381);
					match(EXISTS);
					}
					break;
				}
				setState(384);
				nestedIdentifier();
				}
				break;
			case 13:
				_localctx = new AlterTableClauseDropProjectionContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(385);
				match(DROP);
				setState(386);
				match(PROJECTION);
				setState(389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(387);
					match(IF);
					setState(388);
					match(EXISTS);
					}
					break;
				}
				setState(391);
				nestedIdentifier();
				}
				break;
			case 14:
				_localctx = new AlterTableClauseDropPartitionContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(392);
				match(DROP);
				setState(393);
				partitionClause();
				}
				break;
			case 15:
				_localctx = new AlterTableClauseFreezePartitionContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(394);
				match(FREEZE);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(395);
					partitionClause();
					}
				}

				}
				break;
			case 16:
				_localctx = new AlterTableClauseMaterializeIndexContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(398);
				match(MATERIALIZE);
				setState(399);
				match(INDEX);
				setState(402);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(400);
					match(IF);
					setState(401);
					match(EXISTS);
					}
					break;
				}
				setState(404);
				nestedIdentifier();
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(405);
					match(IN);
					setState(406);
					partitionClause();
					}
				}

				}
				break;
			case 17:
				_localctx = new AlterTableClauseMaterializeProjectionContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(409);
				match(MATERIALIZE);
				setState(410);
				match(PROJECTION);
				setState(413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(411);
					match(IF);
					setState(412);
					match(EXISTS);
					}
					break;
				}
				setState(415);
				nestedIdentifier();
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(416);
					match(IN);
					setState(417);
					partitionClause();
					}
				}

				}
				break;
			case 18:
				_localctx = new AlterTableClauseModifyCodecContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(420);
				match(MODIFY);
				setState(421);
				match(COLUMN);
				setState(424);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(422);
					match(IF);
					setState(423);
					match(EXISTS);
					}
					break;
				}
				setState(426);
				nestedIdentifier();
				setState(427);
				codecExpr();
				}
				break;
			case 19:
				_localctx = new AlterTableClauseModifyCommentContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(429);
				match(MODIFY);
				setState(430);
				match(COLUMN);
				setState(433);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(431);
					match(IF);
					setState(432);
					match(EXISTS);
					}
					break;
				}
				setState(435);
				nestedIdentifier();
				setState(436);
				match(COMMENT);
				setState(437);
				match(STRING_LITERAL);
				}
				break;
			case 20:
				_localctx = new AlterTableClauseModifyRemoveContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(439);
				match(MODIFY);
				setState(440);
				match(COLUMN);
				setState(443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(441);
					match(IF);
					setState(442);
					match(EXISTS);
					}
					break;
				}
				setState(445);
				nestedIdentifier();
				setState(446);
				match(REMOVE);
				setState(447);
				tableColumnPropertyType();
				}
				break;
			case 21:
				_localctx = new AlterTableClauseModifyContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(449);
				match(MODIFY);
				setState(450);
				match(COLUMN);
				setState(453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(451);
					match(IF);
					setState(452);
					match(EXISTS);
					}
					break;
				}
				setState(455);
				tableColumnDfnt();
				}
				break;
			case 22:
				_localctx = new AlterTableClauseModifyOrderByContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(456);
				match(MODIFY);
				setState(457);
				match(ORDER);
				setState(458);
				match(BY);
				setState(459);
				columnExpr(0);
				}
				break;
			case 23:
				_localctx = new AlterTableClauseModifyTTLContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(460);
				match(MODIFY);
				setState(461);
				ttlClause();
				}
				break;
			case 24:
				_localctx = new AlterTableClauseMovePartitionContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(462);
				match(MOVE);
				setState(463);
				partitionClause();
				setState(473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(464);
					match(TO);
					setState(465);
					match(DISK);
					setState(466);
					match(STRING_LITERAL);
					}
					break;
				case 2:
					{
					setState(467);
					match(TO);
					setState(468);
					match(VOLUME);
					setState(469);
					match(STRING_LITERAL);
					}
					break;
				case 3:
					{
					setState(470);
					match(TO);
					setState(471);
					match(TABLE);
					setState(472);
					tableIdentifier();
					}
					break;
				}
				}
				break;
			case 25:
				_localctx = new AlterTableClauseRemoveTTLContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(475);
				match(REMOVE);
				setState(476);
				match(TTL);
				}
				break;
			case 26:
				_localctx = new AlterTableClauseRenameContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(477);
				match(RENAME);
				setState(478);
				match(COLUMN);
				setState(481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(479);
					match(IF);
					setState(480);
					match(EXISTS);
					}
					break;
				}
				setState(483);
				nestedIdentifier();
				setState(484);
				match(TO);
				setState(485);
				nestedIdentifier();
				}
				break;
			case 27:
				_localctx = new AlterTableClauseReplaceContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(487);
				match(REPLACE);
				setState(488);
				partitionClause();
				setState(489);
				match(FROM);
				setState(490);
				tableIdentifier();
				}
				break;
			case 28:
				_localctx = new AlterTableClauseUpdateContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(492);
				match(UPDATE);
				setState(493);
				assignmentExprList();
				setState(494);
				whereClause();
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

	public static class AssignmentExprListContext extends ParserRuleContext {
		public List<AssignmentExprContext> assignmentExpr() {
			return getRuleContexts(AssignmentExprContext.class);
		}
		public AssignmentExprContext assignmentExpr(int i) {
			return getRuleContext(AssignmentExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseSQLParser.COMMA, i);
		}
		public AssignmentExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAssignmentExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAssignmentExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAssignmentExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExprListContext assignmentExprList() throws RecognitionException {
		AssignmentExprListContext _localctx = new AssignmentExprListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignmentExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			assignmentExpr();
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(499);
				match(COMMA);
				setState(500);
				assignmentExpr();
				}
				}
				setState(505);
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

	public static class AssignmentExprContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseSQLParser.EQ_SINGLE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AssignmentExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAssignmentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAssignmentExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAssignmentExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExprContext assignmentExpr() throws RecognitionException {
		AssignmentExprContext _localctx = new AssignmentExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			nestedIdentifier();
			setState(507);
			match(EQ_SINGLE);
			setState(508);
			columnExpr(0);
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

	public static class TableColumnPropertyTypeContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(ClickHouseSQLParser.ALIAS, 0); }
		public TerminalNode CODEC() { return getToken(ClickHouseSQLParser.CODEC, 0); }
		public TerminalNode COMMENT() { return getToken(ClickHouseSQLParser.COMMENT, 0); }
		public TerminalNode DEFAULT() { return getToken(ClickHouseSQLParser.DEFAULT, 0); }
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseSQLParser.MATERIALIZED, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseSQLParser.TTL, 0); }
		public TableColumnPropertyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumnPropertyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTableColumnPropertyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTableColumnPropertyType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTableColumnPropertyType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableColumnPropertyTypeContext tableColumnPropertyType() throws RecognitionException {
		TableColumnPropertyTypeContext _localctx = new TableColumnPropertyTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableColumnPropertyType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << CODEC) | (1L << COMMENT) | (1L << DEFAULT))) != 0) || _la==MATERIALIZED || _la==TTL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PartitionClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(ClickHouseSQLParser.PARTITION, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ClickHouseSQLParser.ID, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseSQLParser.STRING_LITERAL, 0); }
		public PartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterPartitionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitPartitionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitPartitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionClauseContext partitionClause() throws RecognitionException {
		PartitionClauseContext _localctx = new PartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_partitionClause);
		try {
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				match(PARTITION);
				setState(513);
				columnExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				match(PARTITION);
				setState(515);
				match(ID);
				setState(516);
				match(STRING_LITERAL);
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

	public static class AttachStmtContext extends ParserRuleContext {
		public AttachStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attachStmt; }
	 
		public AttachStmtContext() { }
		public void copyFrom(AttachStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttachDictionaryStmtContext extends AttachStmtContext {
		public TerminalNode ATTACH() { return getToken(ClickHouseSQLParser.ATTACH, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseSQLParser.DICTIONARY, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public AttachDictionaryStmtContext(AttachStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAttachDictionaryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAttachDictionaryStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAttachDictionaryStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttachStmtContext attachStmt() throws RecognitionException {
		AttachStmtContext _localctx = new AttachStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attachStmt);
		int _la;
		try {
			_localctx = new AttachDictionaryStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(ATTACH);
			setState(520);
			match(DICTIONARY);
			setState(521);
			tableIdentifier();
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(522);
				clusterClause();
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

	public static class CheckStmtContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(ClickHouseSQLParser.CHECK, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseSQLParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public CheckStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterCheckStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitCheckStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitCheckStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckStmtContext checkStmt() throws RecognitionException {
		CheckStmtContext _localctx = new CheckStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_checkStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(CHECK);
			setState(526);
			match(TABLE);
			setState(527);
			tableIdentifier();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(528);
				partitionClause();
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

	public static class CreateStmtContext extends ParserRuleContext {
		public CreateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStmt; }
	 
		public CreateStmtContext() { }
		public void copyFrom(CreateStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateViewStmtContext extends CreateStmtContext {
		public TerminalNode VIEW() { return getToken(ClickHouseSQLParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseSQLParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseSQLParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(ClickHouseSQLParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(ClickHouseSQLParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public CreateViewStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterCreateViewStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitCreateViewStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitCreateViewStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateDictionaryStmtContext extends CreateStmtContext {
		public TerminalNode DICTIONARY() { return getToken(ClickHouseSQLParser.DICTIONARY, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public DictionarySchemaClauseContext dictionarySchemaClause() {
			return getRuleContext(DictionarySchemaClauseContext.class,0);
		}
		public DictionaryEngineClauseContext dictionaryEngineClause() {
			return getRuleContext(DictionaryEngineClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseSQLParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseSQLParser.CREATE, 0); }
		public TerminalNode REPLACE() { return getToken(ClickHouseSQLParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode OR() { return getToken(ClickHouseSQLParser.OR, 0); }
		public CreateDictionaryStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterCreateDictionaryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitCreateDictionaryStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitCreateDictionaryStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateDatabaseStmtContext extends CreateStmtContext {
		public TerminalNode DATABASE() { return getToken(ClickHouseSQLParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseSQLParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseSQLParser.CREATE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public EngineExprContext engineExpr() {
			return getRuleContext(EngineExprContext.class,0);
		}
		public CreateDatabaseStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterCreateDatabaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitCreateDatabaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitCreateDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateLiveViewStmtContext extends CreateStmtContext {
		public TerminalNode LIVE() { return getToken(ClickHouseSQLParser.LIVE, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseSQLParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseSQLParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseSQLParser.CREATE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode WITH() { return getToken(ClickHouseSQLParser.WITH, 0); }
		public TerminalNode TIMEOUT() { return getToken(ClickHouseSQLParser.TIMEOUT, 0); }
		public DestinationClauseContext destinationClause() {
			return getRuleContext(DestinationClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseSQLParser.DECIMAL_LITERAL, 0); }
		public CreateLiveViewStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterCreateLiveViewStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitCreateLiveViewStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitCreateLiveViewStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateMaterializedViewStmtContext extends CreateStmtContext {
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseSQLParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseSQLParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseSQLParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseSQLParser.CREATE, 0); }
		public DestinationClauseContext destinationClause() {
			return getRuleContext(DestinationClauseContext.class,0);
		}
		public EngineClauseContext engineClause() {
			return getRuleContext(EngineClauseContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public TerminalNode POPULATE() { return getToken(ClickHouseSQLParser.POPULATE, 0); }
		public CreateMaterializedViewStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterCreateMaterializedViewStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitCreateMaterializedViewStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitCreateMaterializedViewStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableStmtContext extends CreateStmtContext {
		public TerminalNode TABLE() { return getToken(ClickHouseSQLParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseSQLParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseSQLParser.CREATE, 0); }
		public TerminalNode REPLACE() { return getToken(ClickHouseSQLParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseSQLParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public EngineClauseContext engineClause() {
			return getRuleContext(EngineClauseContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TerminalNode OR() { return getToken(ClickHouseSQLParser.OR, 0); }
		public CreateTableStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterCreateTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitCreateTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitCreateTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStmtContext createStmt() throws RecognitionException {
		CreateStmtContext _localctx = new CreateStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_createStmt);
		int _la;
		try {
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				_localctx = new CreateDatabaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(532);
				match(DATABASE);
				setState(536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(533);
					match(IF);
					setState(534);
					match(NOT);
					setState(535);
					match(EXISTS);
					}
					break;
				}
				setState(538);
				databaseIdentifier();
				setState(540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(539);
					clusterClause();
					}
					break;
				}
				setState(543);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(542);
					engineExpr();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new CreateDictionaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ATTACH:
					{
					setState(545);
					match(ATTACH);
					}
					break;
				case CREATE:
					{
					setState(546);
					match(CREATE);
					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OR) {
						{
						setState(547);
						match(OR);
						setState(548);
						match(REPLACE);
						}
					}

					}
					break;
				case REPLACE:
					{
					setState(551);
					match(REPLACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(554);
				match(DICTIONARY);
				setState(558);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(555);
					match(IF);
					setState(556);
					match(NOT);
					setState(557);
					match(EXISTS);
					}
					break;
				}
				setState(560);
				tableIdentifier();
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(561);
					uuidClause();
					}
				}

				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(564);
					clusterClause();
					}
				}

				setState(567);
				dictionarySchemaClause();
				setState(568);
				dictionaryEngineClause();
				}
				break;
			case 3:
				_localctx = new CreateLiveViewStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(571);
				match(LIVE);
				setState(572);
				match(VIEW);
				setState(576);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(573);
					match(IF);
					setState(574);
					match(NOT);
					setState(575);
					match(EXISTS);
					}
					break;
				}
				setState(578);
				tableIdentifier();
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(579);
					uuidClause();
					}
				}

				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(582);
					clusterClause();
					}
				}

				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(585);
					match(WITH);
					setState(586);
					match(TIMEOUT);
					setState(588);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DECIMAL_LITERAL) {
						{
						setState(587);
						match(DECIMAL_LITERAL);
						}
					}

					}
				}

				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(592);
					destinationClause();
					}
				}

				setState(596);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(595);
					tableSchemaClause();
					}
					break;
				}
				setState(598);
				subqueryClause();
				}
				break;
			case 4:
				_localctx = new CreateMaterializedViewStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(600);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(601);
				match(MATERIALIZED);
				setState(602);
				match(VIEW);
				setState(606);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(603);
					match(IF);
					setState(604);
					match(NOT);
					setState(605);
					match(EXISTS);
					}
					break;
				}
				setState(608);
				tableIdentifier();
				setState(610);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(609);
					uuidClause();
					}
					break;
				}
				setState(613);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(612);
					clusterClause();
					}
					break;
				}
				setState(616);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(615);
					tableSchemaClause();
					}
					break;
				}
				setState(623);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(618);
					destinationClause();
					}
					break;
				case 2:
					{
					setState(619);
					engineClause();
					setState(621);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==POPULATE) {
						{
						setState(620);
						match(POPULATE);
						}
					}

					}
					break;
				}
				setState(625);
				subqueryClause();
				}
				break;
			case 5:
				_localctx = new CreateTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(634);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ATTACH:
					{
					setState(627);
					match(ATTACH);
					}
					break;
				case CREATE:
					{
					setState(628);
					match(CREATE);
					setState(631);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OR) {
						{
						setState(629);
						match(OR);
						setState(630);
						match(REPLACE);
						}
					}

					}
					break;
				case REPLACE:
					{
					setState(633);
					match(REPLACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(636);
					match(TEMPORARY);
					}
				}

				setState(639);
				match(TABLE);
				setState(643);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(640);
					match(IF);
					setState(641);
					match(NOT);
					setState(642);
					match(EXISTS);
					}
					break;
				}
				setState(645);
				tableIdentifier();
				setState(647);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(646);
					uuidClause();
					}
					break;
				}
				setState(650);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(649);
					clusterClause();
					}
					break;
				}
				setState(653);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(652);
					tableSchemaClause();
					}
					break;
				}
				setState(656);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(655);
					engineClause();
					}
					break;
				}
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(658);
					subqueryClause();
					}
				}

				}
				break;
			case 6:
				_localctx = new CreateViewStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(661);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(662);
					match(OR);
					setState(663);
					match(REPLACE);
					}
				}

				setState(666);
				match(VIEW);
				setState(670);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(667);
					match(IF);
					setState(668);
					match(NOT);
					setState(669);
					match(EXISTS);
					}
					break;
				}
				setState(672);
				tableIdentifier();
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(673);
					uuidClause();
					}
				}

				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(676);
					clusterClause();
					}
				}

				setState(680);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(679);
					tableSchemaClause();
					}
					break;
				}
				setState(682);
				subqueryClause();
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

	public static class DictionarySchemaClauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public List<DictionaryAttrDfntContext> dictionaryAttrDfnt() {
			return getRuleContexts(DictionaryAttrDfntContext.class);
		}
		public DictionaryAttrDfntContext dictionaryAttrDfnt(int i) {
			return getRuleContext(DictionaryAttrDfntContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseSQLParser.COMMA, i);
		}
		public DictionarySchemaClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionarySchemaClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterDictionarySchemaClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitDictionarySchemaClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitDictionarySchemaClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionarySchemaClauseContext dictionarySchemaClause() throws RecognitionException {
		DictionarySchemaClauseContext _localctx = new DictionarySchemaClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dictionarySchemaClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(LPAREN);
			setState(687);
			dictionaryAttrDfnt();
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(688);
				match(COMMA);
				setState(689);
				dictionaryAttrDfnt();
				}
				}
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(695);
			match(RPAREN);
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

	public static class DictionaryAttrDfntContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(ClickHouseSQLParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(ClickHouseSQLParser.DEFAULT, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> EXPRESSION() { return getTokens(ClickHouseSQLParser.EXPRESSION); }
		public TerminalNode EXPRESSION(int i) {
			return getToken(ClickHouseSQLParser.EXPRESSION, i);
		}
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public List<TerminalNode> HIERARCHICAL() { return getTokens(ClickHouseSQLParser.HIERARCHICAL); }
		public TerminalNode HIERARCHICAL(int i) {
			return getToken(ClickHouseSQLParser.HIERARCHICAL, i);
		}
		public List<TerminalNode> INJECTIVE() { return getTokens(ClickHouseSQLParser.INJECTIVE); }
		public TerminalNode INJECTIVE(int i) {
			return getToken(ClickHouseSQLParser.INJECTIVE, i);
		}
		public List<TerminalNode> IS_OBJECT_ID() { return getTokens(ClickHouseSQLParser.IS_OBJECT_ID); }
		public TerminalNode IS_OBJECT_ID(int i) {
			return getToken(ClickHouseSQLParser.IS_OBJECT_ID, i);
		}
		public DictionaryAttrDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryAttrDfnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterDictionaryAttrDfnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitDictionaryAttrDfnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitDictionaryAttrDfnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryAttrDfntContext dictionaryAttrDfnt() throws RecognitionException {
		DictionaryAttrDfntContext _localctx = new DictionaryAttrDfntContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dictionaryAttrDfnt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			identifier();
			setState(698);
			columnTypeExpr();
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (DEFAULT - 38)) | (1L << (EXPRESSION - 38)) | (1L << (HIERARCHICAL - 38)) | (1L << (INJECTIVE - 38)) | (1L << (IS_OBJECT_ID - 38)))) != 0)) {
				{
				setState(706);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEFAULT:
					{
					setState(699);
					match(DEFAULT);
					setState(700);
					literal();
					}
					break;
				case EXPRESSION:
					{
					setState(701);
					match(EXPRESSION);
					setState(702);
					columnExpr(0);
					}
					break;
				case HIERARCHICAL:
					{
					setState(703);
					match(HIERARCHICAL);
					}
					break;
				case INJECTIVE:
					{
					setState(704);
					match(INJECTIVE);
					}
					break;
				case IS_OBJECT_ID:
					{
					setState(705);
					match(IS_OBJECT_ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(710);
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

	public static class DictionaryEngineClauseContext extends ParserRuleContext {
		public DictionaryPrimaryKeyClauseContext dictionaryPrimaryKeyClause() {
			return getRuleContext(DictionaryPrimaryKeyClauseContext.class,0);
		}
		public List<SourceClauseContext> sourceClause() {
			return getRuleContexts(SourceClauseContext.class);
		}
		public SourceClauseContext sourceClause(int i) {
			return getRuleContext(SourceClauseContext.class,i);
		}
		public List<LifetimeClauseContext> lifetimeClause() {
			return getRuleContexts(LifetimeClauseContext.class);
		}
		public LifetimeClauseContext lifetimeClause(int i) {
			return getRuleContext(LifetimeClauseContext.class,i);
		}
		public List<LayoutClauseContext> layoutClause() {
			return getRuleContexts(LayoutClauseContext.class);
		}
		public LayoutClauseContext layoutClause(int i) {
			return getRuleContext(LayoutClauseContext.class,i);
		}
		public List<RangeClauseContext> rangeClause() {
			return getRuleContexts(RangeClauseContext.class);
		}
		public RangeClauseContext rangeClause(int i) {
			return getRuleContext(RangeClauseContext.class,i);
		}
		public List<DictionarySettingsClauseContext> dictionarySettingsClause() {
			return getRuleContexts(DictionarySettingsClauseContext.class);
		}
		public DictionarySettingsClauseContext dictionarySettingsClause(int i) {
			return getRuleContext(DictionarySettingsClauseContext.class,i);
		}
		public DictionaryEngineClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryEngineClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterDictionaryEngineClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitDictionaryEngineClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitDictionaryEngineClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryEngineClauseContext dictionaryEngineClause() throws RecognitionException {
		DictionaryEngineClauseContext _localctx = new DictionaryEngineClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dictionaryEngineClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(711);
				dictionaryPrimaryKeyClause();
				}
			}

			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (LAYOUT - 93)) | (1L << (LIFETIME - 93)) | (1L << (RANGE - 93)) | (1L << (SETTINGS - 93)) | (1L << (SOURCE - 93)))) != 0)) {
				{
				setState(719);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SOURCE:
					{
					setState(714);
					sourceClause();
					}
					break;
				case LIFETIME:
					{
					setState(715);
					lifetimeClause();
					}
					break;
				case LAYOUT:
					{
					setState(716);
					layoutClause();
					}
					break;
				case RANGE:
					{
					setState(717);
					rangeClause();
					}
					break;
				case SETTINGS:
					{
					setState(718);
					dictionarySettingsClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(723);
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

	public static class DictionaryPrimaryKeyClauseContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ClickHouseSQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseSQLParser.KEY, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public DictionaryPrimaryKeyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryPrimaryKeyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterDictionaryPrimaryKeyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitDictionaryPrimaryKeyClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitDictionaryPrimaryKeyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryPrimaryKeyClauseContext dictionaryPrimaryKeyClause() throws RecognitionException {
		DictionaryPrimaryKeyClauseContext _localctx = new DictionaryPrimaryKeyClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dictionaryPrimaryKeyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(PRIMARY);
			setState(725);
			match(KEY);
			setState(726);
			columnExprList();
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

	public static class DictionaryArgExprContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public DictionaryArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryArgExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterDictionaryArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitDictionaryArgExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitDictionaryArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryArgExprContext dictionaryArgExpr() throws RecognitionException {
		DictionaryArgExprContext _localctx = new DictionaryArgExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dictionaryArgExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			identifier();
			setState(735);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case AST:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case CURRENT:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DAY:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOLLOWING:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case HOUR:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZE:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case OVER:
			case PARTITION:
			case POPULATE:
			case PRECEDING:
			case PREWHERE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case ROW:
			case ROWS:
			case SAMPLE:
			case SECOND:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNBOUNDED:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WEEK:
			case WHEN:
			case WHERE:
			case WINDOW:
			case WITH:
			case YEAR:
			case JSON_FALSE:
			case JSON_TRUE:
			case IDENTIFIER:
				{
				setState(729);
				identifier();
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(730);
					match(LPAREN);
					setState(731);
					match(RPAREN);
					}
				}

				}
				break;
			case INF:
			case NAN_SQL:
			case NULL_SQL:
			case FLOATING_LITERAL:
			case OCTAL_LITERAL:
			case DECIMAL_LITERAL:
			case HEXADECIMAL_LITERAL:
			case STRING_LITERAL:
			case DASH:
			case DOT:
			case PLUS:
				{
				setState(734);
				literal();
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

	public static class SourceClauseContext extends ParserRuleContext {
		public TerminalNode SOURCE() { return getToken(ClickHouseSQLParser.SOURCE, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseSQLParser.LPAREN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseSQLParser.RPAREN, i);
		}
		public List<DictionaryArgExprContext> dictionaryArgExpr() {
			return getRuleContexts(DictionaryArgExprContext.class);
		}
		public DictionaryArgExprContext dictionaryArgExpr(int i) {
			return getRuleContext(DictionaryArgExprContext.class,i);
		}
		public SourceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterSourceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitSourceClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitSourceClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceClauseContext sourceClause() throws RecognitionException {
		SourceClauseContext _localctx = new SourceClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sourceClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(SOURCE);
			setState(738);
			match(LPAREN);
			setState(739);
			identifier();
			setState(740);
			match(LPAREN);
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AFTER - 2)) | (1L << (ALIAS - 2)) | (1L << (ALL - 2)) | (1L << (ALTER - 2)) | (1L << (AND - 2)) | (1L << (ANTI - 2)) | (1L << (ANY - 2)) | (1L << (ARRAY - 2)) | (1L << (AS - 2)) | (1L << (ASCENDING - 2)) | (1L << (ASOF - 2)) | (1L << (AST - 2)) | (1L << (ASYNC - 2)) | (1L << (ATTACH - 2)) | (1L << (BETWEEN - 2)) | (1L << (BOTH - 2)) | (1L << (BY - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CHECK - 2)) | (1L << (CLEAR - 2)) | (1L << (CLUSTER - 2)) | (1L << (CODEC - 2)) | (1L << (COLLATE - 2)) | (1L << (COLUMN - 2)) | (1L << (COMMENT - 2)) | (1L << (CONSTRAINT - 2)) | (1L << (CREATE - 2)) | (1L << (CROSS - 2)) | (1L << (CUBE - 2)) | (1L << (CURRENT - 2)) | (1L << (DATABASE - 2)) | (1L << (DATABASES - 2)) | (1L << (DATE - 2)) | (1L << (DAY - 2)) | (1L << (DEDUPLICATE - 2)) | (1L << (DEFAULT - 2)) | (1L << (DELAY - 2)) | (1L << (DELETE - 2)) | (1L << (DESC - 2)) | (1L << (DESCENDING - 2)) | (1L << (DESCRIBE - 2)) | (1L << (DETACH - 2)) | (1L << (DICTIONARIES - 2)) | (1L << (DICTIONARY - 2)) | (1L << (DISK - 2)) | (1L << (DISTINCT - 2)) | (1L << (DISTRIBUTED - 2)) | (1L << (DROP - 2)) | (1L << (ELSE - 2)) | (1L << (END - 2)) | (1L << (ENGINE - 2)) | (1L << (EVENTS - 2)) | (1L << (EXISTS - 2)) | (1L << (EXPLAIN - 2)) | (1L << (EXPRESSION - 2)) | (1L << (EXTRACT - 2)) | (1L << (FETCHES - 2)) | (1L << (FINAL - 2)) | (1L << (FIRST - 2)) | (1L << (FLUSH - 2)) | (1L << (FOLLOWING - 2)) | (1L << (FOR - 2)) | (1L << (FORMAT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FREEZE - 66)) | (1L << (FROM - 66)) | (1L << (FULL - 66)) | (1L << (FUNCTION - 66)) | (1L << (GLOBAL - 66)) | (1L << (GRANULARITY - 66)) | (1L << (GROUP - 66)) | (1L << (HAVING - 66)) | (1L << (HIERARCHICAL - 66)) | (1L << (HOUR - 66)) | (1L << (ID - 66)) | (1L << (IF - 66)) | (1L << (ILIKE - 66)) | (1L << (IN - 66)) | (1L << (INDEX - 66)) | (1L << (INJECTIVE - 66)) | (1L << (INNER - 66)) | (1L << (INSERT - 66)) | (1L << (INTERVAL - 66)) | (1L << (INTO - 66)) | (1L << (IS - 66)) | (1L << (IS_OBJECT_ID - 66)) | (1L << (JOIN - 66)) | (1L << (KEY - 66)) | (1L << (KILL - 66)) | (1L << (LAST - 66)) | (1L << (LAYOUT - 66)) | (1L << (LEADING - 66)) | (1L << (LEFT - 66)) | (1L << (LIFETIME - 66)) | (1L << (LIKE - 66)) | (1L << (LIMIT - 66)) | (1L << (LIVE - 66)) | (1L << (LOCAL - 66)) | (1L << (LOGS - 66)) | (1L << (MATERIALIZE - 66)) | (1L << (MATERIALIZED - 66)) | (1L << (MAX - 66)) | (1L << (MERGES - 66)) | (1L << (MIN - 66)) | (1L << (MINUTE - 66)) | (1L << (MODIFY - 66)) | (1L << (MONTH - 66)) | (1L << (MOVE - 66)) | (1L << (MUTATION - 66)) | (1L << (NO - 66)) | (1L << (NOT - 66)) | (1L << (NULLS - 66)) | (1L << (OFFSET - 66)) | (1L << (ON - 66)) | (1L << (OPTIMIZE - 66)) | (1L << (OR - 66)) | (1L << (ORDER - 66)) | (1L << (OUTER - 66)) | (1L << (OUTFILE - 66)) | (1L << (OVER - 66)) | (1L << (PARTITION - 66)) | (1L << (POPULATE - 66)) | (1L << (PRECEDING - 66)) | (1L << (PREWHERE - 66)) | (1L << (PRIMARY - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (QUARTER - 131)) | (1L << (RANGE - 131)) | (1L << (RELOAD - 131)) | (1L << (REMOVE - 131)) | (1L << (RENAME - 131)) | (1L << (REPLACE - 131)) | (1L << (REPLICA - 131)) | (1L << (REPLICATED - 131)) | (1L << (RIGHT - 131)) | (1L << (ROLLUP - 131)) | (1L << (ROW - 131)) | (1L << (ROWS - 131)) | (1L << (SAMPLE - 131)) | (1L << (SECOND - 131)) | (1L << (SELECT - 131)) | (1L << (SEMI - 131)) | (1L << (SENDS - 131)) | (1L << (SET - 131)) | (1L << (SETTINGS - 131)) | (1L << (SHOW - 131)) | (1L << (SOURCE - 131)) | (1L << (START - 131)) | (1L << (STOP - 131)) | (1L << (SUBSTRING - 131)) | (1L << (SYNC - 131)) | (1L << (SYNTAX - 131)) | (1L << (SYSTEM - 131)) | (1L << (TABLE - 131)) | (1L << (TABLES - 131)) | (1L << (TEMPORARY - 131)) | (1L << (TEST - 131)) | (1L << (THEN - 131)) | (1L << (TIES - 131)) | (1L << (TIMEOUT - 131)) | (1L << (TIMESTAMP - 131)) | (1L << (TO - 131)) | (1L << (TOP - 131)) | (1L << (TOTALS - 131)) | (1L << (TRAILING - 131)) | (1L << (TRIM - 131)) | (1L << (TRUNCATE - 131)) | (1L << (TTL - 131)) | (1L << (TYPE - 131)) | (1L << (UNBOUNDED - 131)) | (1L << (UNION - 131)) | (1L << (UPDATE - 131)) | (1L << (USE - 131)) | (1L << (USING - 131)) | (1L << (UUID - 131)) | (1L << (VALUES - 131)) | (1L << (VIEW - 131)) | (1L << (VOLUME - 131)) | (1L << (WATCH - 131)) | (1L << (WEEK - 131)) | (1L << (WHEN - 131)) | (1L << (WHERE - 131)) | (1L << (WINDOW - 131)) | (1L << (WITH - 131)) | (1L << (YEAR - 131)) | (1L << (JSON_FALSE - 131)) | (1L << (JSON_TRUE - 131)) | (1L << (IDENTIFIER - 131)))) != 0)) {
				{
				{
				setState(741);
				dictionaryArgExpr();
				}
				}
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(747);
			match(RPAREN);
			setState(748);
			match(RPAREN);
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

	public static class LifetimeClauseContext extends ParserRuleContext {
		public TerminalNode LIFETIME() { return getToken(ClickHouseSQLParser.LIFETIME, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(ClickHouseSQLParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(ClickHouseSQLParser.DECIMAL_LITERAL, i);
		}
		public TerminalNode MIN() { return getToken(ClickHouseSQLParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(ClickHouseSQLParser.MAX, 0); }
		public LifetimeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lifetimeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterLifetimeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitLifetimeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitLifetimeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LifetimeClauseContext lifetimeClause() throws RecognitionException {
		LifetimeClauseContext _localctx = new LifetimeClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lifetimeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(LIFETIME);
			setState(751);
			match(LPAREN);
			setState(761);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				{
				setState(752);
				match(DECIMAL_LITERAL);
				}
				break;
			case MIN:
				{
				setState(753);
				match(MIN);
				setState(754);
				match(DECIMAL_LITERAL);
				setState(755);
				match(MAX);
				setState(756);
				match(DECIMAL_LITERAL);
				}
				break;
			case MAX:
				{
				setState(757);
				match(MAX);
				setState(758);
				match(DECIMAL_LITERAL);
				setState(759);
				match(MIN);
				setState(760);
				match(DECIMAL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(763);
			match(RPAREN);
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

	public static class LayoutClauseContext extends ParserRuleContext {
		public TerminalNode LAYOUT() { return getToken(ClickHouseSQLParser.LAYOUT, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseSQLParser.LPAREN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseSQLParser.RPAREN, i);
		}
		public List<DictionaryArgExprContext> dictionaryArgExpr() {
			return getRuleContexts(DictionaryArgExprContext.class);
		}
		public DictionaryArgExprContext dictionaryArgExpr(int i) {
			return getRuleContext(DictionaryArgExprContext.class,i);
		}
		public LayoutClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layoutClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterLayoutClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitLayoutClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitLayoutClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayoutClauseContext layoutClause() throws RecognitionException {
		LayoutClauseContext _localctx = new LayoutClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_layoutClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(LAYOUT);
			setState(766);
			match(LPAREN);
			setState(767);
			identifier();
			setState(768);
			match(LPAREN);
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AFTER - 2)) | (1L << (ALIAS - 2)) | (1L << (ALL - 2)) | (1L << (ALTER - 2)) | (1L << (AND - 2)) | (1L << (ANTI - 2)) | (1L << (ANY - 2)) | (1L << (ARRAY - 2)) | (1L << (AS - 2)) | (1L << (ASCENDING - 2)) | (1L << (ASOF - 2)) | (1L << (AST - 2)) | (1L << (ASYNC - 2)) | (1L << (ATTACH - 2)) | (1L << (BETWEEN - 2)) | (1L << (BOTH - 2)) | (1L << (BY - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CHECK - 2)) | (1L << (CLEAR - 2)) | (1L << (CLUSTER - 2)) | (1L << (CODEC - 2)) | (1L << (COLLATE - 2)) | (1L << (COLUMN - 2)) | (1L << (COMMENT - 2)) | (1L << (CONSTRAINT - 2)) | (1L << (CREATE - 2)) | (1L << (CROSS - 2)) | (1L << (CUBE - 2)) | (1L << (CURRENT - 2)) | (1L << (DATABASE - 2)) | (1L << (DATABASES - 2)) | (1L << (DATE - 2)) | (1L << (DAY - 2)) | (1L << (DEDUPLICATE - 2)) | (1L << (DEFAULT - 2)) | (1L << (DELAY - 2)) | (1L << (DELETE - 2)) | (1L << (DESC - 2)) | (1L << (DESCENDING - 2)) | (1L << (DESCRIBE - 2)) | (1L << (DETACH - 2)) | (1L << (DICTIONARIES - 2)) | (1L << (DICTIONARY - 2)) | (1L << (DISK - 2)) | (1L << (DISTINCT - 2)) | (1L << (DISTRIBUTED - 2)) | (1L << (DROP - 2)) | (1L << (ELSE - 2)) | (1L << (END - 2)) | (1L << (ENGINE - 2)) | (1L << (EVENTS - 2)) | (1L << (EXISTS - 2)) | (1L << (EXPLAIN - 2)) | (1L << (EXPRESSION - 2)) | (1L << (EXTRACT - 2)) | (1L << (FETCHES - 2)) | (1L << (FINAL - 2)) | (1L << (FIRST - 2)) | (1L << (FLUSH - 2)) | (1L << (FOLLOWING - 2)) | (1L << (FOR - 2)) | (1L << (FORMAT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FREEZE - 66)) | (1L << (FROM - 66)) | (1L << (FULL - 66)) | (1L << (FUNCTION - 66)) | (1L << (GLOBAL - 66)) | (1L << (GRANULARITY - 66)) | (1L << (GROUP - 66)) | (1L << (HAVING - 66)) | (1L << (HIERARCHICAL - 66)) | (1L << (HOUR - 66)) | (1L << (ID - 66)) | (1L << (IF - 66)) | (1L << (ILIKE - 66)) | (1L << (IN - 66)) | (1L << (INDEX - 66)) | (1L << (INJECTIVE - 66)) | (1L << (INNER - 66)) | (1L << (INSERT - 66)) | (1L << (INTERVAL - 66)) | (1L << (INTO - 66)) | (1L << (IS - 66)) | (1L << (IS_OBJECT_ID - 66)) | (1L << (JOIN - 66)) | (1L << (KEY - 66)) | (1L << (KILL - 66)) | (1L << (LAST - 66)) | (1L << (LAYOUT - 66)) | (1L << (LEADING - 66)) | (1L << (LEFT - 66)) | (1L << (LIFETIME - 66)) | (1L << (LIKE - 66)) | (1L << (LIMIT - 66)) | (1L << (LIVE - 66)) | (1L << (LOCAL - 66)) | (1L << (LOGS - 66)) | (1L << (MATERIALIZE - 66)) | (1L << (MATERIALIZED - 66)) | (1L << (MAX - 66)) | (1L << (MERGES - 66)) | (1L << (MIN - 66)) | (1L << (MINUTE - 66)) | (1L << (MODIFY - 66)) | (1L << (MONTH - 66)) | (1L << (MOVE - 66)) | (1L << (MUTATION - 66)) | (1L << (NO - 66)) | (1L << (NOT - 66)) | (1L << (NULLS - 66)) | (1L << (OFFSET - 66)) | (1L << (ON - 66)) | (1L << (OPTIMIZE - 66)) | (1L << (OR - 66)) | (1L << (ORDER - 66)) | (1L << (OUTER - 66)) | (1L << (OUTFILE - 66)) | (1L << (OVER - 66)) | (1L << (PARTITION - 66)) | (1L << (POPULATE - 66)) | (1L << (PRECEDING - 66)) | (1L << (PREWHERE - 66)) | (1L << (PRIMARY - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (QUARTER - 131)) | (1L << (RANGE - 131)) | (1L << (RELOAD - 131)) | (1L << (REMOVE - 131)) | (1L << (RENAME - 131)) | (1L << (REPLACE - 131)) | (1L << (REPLICA - 131)) | (1L << (REPLICATED - 131)) | (1L << (RIGHT - 131)) | (1L << (ROLLUP - 131)) | (1L << (ROW - 131)) | (1L << (ROWS - 131)) | (1L << (SAMPLE - 131)) | (1L << (SECOND - 131)) | (1L << (SELECT - 131)) | (1L << (SEMI - 131)) | (1L << (SENDS - 131)) | (1L << (SET - 131)) | (1L << (SETTINGS - 131)) | (1L << (SHOW - 131)) | (1L << (SOURCE - 131)) | (1L << (START - 131)) | (1L << (STOP - 131)) | (1L << (SUBSTRING - 131)) | (1L << (SYNC - 131)) | (1L << (SYNTAX - 131)) | (1L << (SYSTEM - 131)) | (1L << (TABLE - 131)) | (1L << (TABLES - 131)) | (1L << (TEMPORARY - 131)) | (1L << (TEST - 131)) | (1L << (THEN - 131)) | (1L << (TIES - 131)) | (1L << (TIMEOUT - 131)) | (1L << (TIMESTAMP - 131)) | (1L << (TO - 131)) | (1L << (TOP - 131)) | (1L << (TOTALS - 131)) | (1L << (TRAILING - 131)) | (1L << (TRIM - 131)) | (1L << (TRUNCATE - 131)) | (1L << (TTL - 131)) | (1L << (TYPE - 131)) | (1L << (UNBOUNDED - 131)) | (1L << (UNION - 131)) | (1L << (UPDATE - 131)) | (1L << (USE - 131)) | (1L << (USING - 131)) | (1L << (UUID - 131)) | (1L << (VALUES - 131)) | (1L << (VIEW - 131)) | (1L << (VOLUME - 131)) | (1L << (WATCH - 131)) | (1L << (WEEK - 131)) | (1L << (WHEN - 131)) | (1L << (WHERE - 131)) | (1L << (WINDOW - 131)) | (1L << (WITH - 131)) | (1L << (YEAR - 131)) | (1L << (JSON_FALSE - 131)) | (1L << (JSON_TRUE - 131)) | (1L << (IDENTIFIER - 131)))) != 0)) {
				{
				{
				setState(769);
				dictionaryArgExpr();
				}
				}
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(775);
			match(RPAREN);
			setState(776);
			match(RPAREN);
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

	public static class RangeClauseContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(ClickHouseSQLParser.RANGE, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public TerminalNode MIN() { return getToken(ClickHouseSQLParser.MIN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode MAX() { return getToken(ClickHouseSQLParser.MAX, 0); }
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterRangeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitRangeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitRangeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(RANGE);
			setState(779);
			match(LPAREN);
			setState(790);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN:
				{
				setState(780);
				match(MIN);
				setState(781);
				identifier();
				setState(782);
				match(MAX);
				setState(783);
				identifier();
				}
				break;
			case MAX:
				{
				setState(785);
				match(MAX);
				setState(786);
				identifier();
				setState(787);
				match(MIN);
				setState(788);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(792);
			match(RPAREN);
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

	public static class DictionarySettingsClauseContext extends ParserRuleContext {
		public TerminalNode SETTINGS() { return getToken(ClickHouseSQLParser.SETTINGS, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public SettingExprListContext settingExprList() {
			return getRuleContext(SettingExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public DictionarySettingsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionarySettingsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterDictionarySettingsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitDictionarySettingsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitDictionarySettingsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionarySettingsClauseContext dictionarySettingsClause() throws RecognitionException {
		DictionarySettingsClauseContext _localctx = new DictionarySettingsClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dictionarySettingsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(SETTINGS);
			setState(795);
			match(LPAREN);
			setState(796);
			settingExprList();
			setState(797);
			match(RPAREN);
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

	public static class ClusterClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(ClickHouseSQLParser.ON, 0); }
		public TerminalNode CLUSTER() { return getToken(ClickHouseSQLParser.CLUSTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseSQLParser.STRING_LITERAL, 0); }
		public ClusterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterClusterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitClusterClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitClusterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClusterClauseContext clusterClause() throws RecognitionException {
		ClusterClauseContext _localctx = new ClusterClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_clusterClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(ON);
			setState(800);
			match(CLUSTER);
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case AST:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case CURRENT:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DAY:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOLLOWING:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case HOUR:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZE:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case OVER:
			case PARTITION:
			case POPULATE:
			case PRECEDING:
			case PREWHERE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case ROW:
			case ROWS:
			case SAMPLE:
			case SECOND:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNBOUNDED:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WEEK:
			case WHEN:
			case WHERE:
			case WINDOW:
			case WITH:
			case YEAR:
			case JSON_FALSE:
			case JSON_TRUE:
			case IDENTIFIER:
				{
				setState(801);
				identifier();
				}
				break;
			case STRING_LITERAL:
				{
				setState(802);
				match(STRING_LITERAL);
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

	public static class UuidClauseContext extends ParserRuleContext {
		public TerminalNode UUID() { return getToken(ClickHouseSQLParser.UUID, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseSQLParser.STRING_LITERAL, 0); }
		public UuidClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uuidClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterUuidClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitUuidClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitUuidClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UuidClauseContext uuidClause() throws RecognitionException {
		UuidClauseContext _localctx = new UuidClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_uuidClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(UUID);
			setState(806);
			match(STRING_LITERAL);
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

	public static class DestinationClauseContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(ClickHouseSQLParser.TO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public DestinationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destinationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterDestinationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitDestinationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitDestinationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestinationClauseContext destinationClause() throws RecognitionException {
		DestinationClauseContext _localctx = new DestinationClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_destinationClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(TO);
			setState(809);
			tableIdentifier();
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

	public static class SubqueryClauseContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(ClickHouseSQLParser.AS, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public SubqueryClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subqueryClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterSubqueryClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitSubqueryClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitSubqueryClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryClauseContext subqueryClause() throws RecognitionException {
		SubqueryClauseContext _localctx = new SubqueryClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_subqueryClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(AS);
			setState(812);
			selectUnionStmt();
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

	public static class TableSchemaClauseContext extends ParserRuleContext {
		public TableSchemaClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSchemaClause; }
	 
		public TableSchemaClauseContext() { }
		public void copyFrom(TableSchemaClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SchemaAsTableClauseContext extends TableSchemaClauseContext {
		public TerminalNode AS() { return getToken(ClickHouseSQLParser.AS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SchemaAsTableClauseContext(TableSchemaClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterSchemaAsTableClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitSchemaAsTableClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitSchemaAsTableClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SchemaAsFunctionClauseContext extends TableSchemaClauseContext {
		public TerminalNode AS() { return getToken(ClickHouseSQLParser.AS, 0); }
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public SchemaAsFunctionClauseContext(TableSchemaClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterSchemaAsFunctionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitSchemaAsFunctionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitSchemaAsFunctionClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SchemaDescriptionClauseContext extends TableSchemaClauseContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public List<TableElementExprContext> tableElementExpr() {
			return getRuleContexts(TableElementExprContext.class);
		}
		public TableElementExprContext tableElementExpr(int i) {
			return getRuleContext(TableElementExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseSQLParser.COMMA, i);
		}
		public SchemaDescriptionClauseContext(TableSchemaClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterSchemaDescriptionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitSchemaDescriptionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitSchemaDescriptionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSchemaClauseContext tableSchemaClause() throws RecognitionException {
		TableSchemaClauseContext _localctx = new TableSchemaClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tableSchemaClause);
		int _la;
		try {
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				_localctx = new SchemaDescriptionClauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(814);
				match(LPAREN);
				setState(815);
				tableElementExpr();
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(816);
					match(COMMA);
					setState(817);
					tableElementExpr();
					}
					}
					setState(822);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(823);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new SchemaAsTableClauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				match(AS);
				setState(826);
				tableIdentifier();
				}
				break;
			case 3:
				_localctx = new SchemaAsFunctionClauseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(827);
				match(AS);
				setState(828);
				tableFunctionExpr();
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

	public static class EngineClauseContext extends ParserRuleContext {
		public EngineExprContext engineExpr() {
			return getRuleContext(EngineExprContext.class,0);
		}
		public List<OrderByClauseContext> orderByClause() {
			return getRuleContexts(OrderByClauseContext.class);
		}
		public OrderByClauseContext orderByClause(int i) {
			return getRuleContext(OrderByClauseContext.class,i);
		}
		public List<PartitionByClauseContext> partitionByClause() {
			return getRuleContexts(PartitionByClauseContext.class);
		}
		public PartitionByClauseContext partitionByClause(int i) {
			return getRuleContext(PartitionByClauseContext.class,i);
		}
		public List<PrimaryKeyClauseContext> primaryKeyClause() {
			return getRuleContexts(PrimaryKeyClauseContext.class);
		}
		public PrimaryKeyClauseContext primaryKeyClause(int i) {
			return getRuleContext(PrimaryKeyClauseContext.class,i);
		}
		public List<SampleByClauseContext> sampleByClause() {
			return getRuleContexts(SampleByClauseContext.class);
		}
		public SampleByClauseContext sampleByClause(int i) {
			return getRuleContext(SampleByClauseContext.class,i);
		}
		public List<TtlClauseContext> ttlClause() {
			return getRuleContexts(TtlClauseContext.class);
		}
		public TtlClauseContext ttlClause(int i) {
			return getRuleContext(TtlClauseContext.class,i);
		}
		public List<SettingsClauseContext> settingsClause() {
			return getRuleContexts(SettingsClauseContext.class);
		}
		public SettingsClauseContext settingsClause(int i) {
			return getRuleContext(SettingsClauseContext.class,i);
		}
		public EngineClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engineClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterEngineClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitEngineClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitEngineClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EngineClauseContext engineClause() throws RecognitionException {
		EngineClauseContext _localctx = new EngineClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_engineClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			engineExpr();
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (ORDER - 121)) | (1L << (PARTITION - 121)) | (1L << (PRIMARY - 121)) | (1L << (SAMPLE - 121)) | (1L << (SETTINGS - 121)) | (1L << (TTL - 121)))) != 0)) {
				{
				setState(838);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ORDER:
					{
					setState(832);
					orderByClause();
					}
					break;
				case PARTITION:
					{
					setState(833);
					partitionByClause();
					}
					break;
				case PRIMARY:
					{
					setState(834);
					primaryKeyClause();
					}
					break;
				case SAMPLE:
					{
					setState(835);
					sampleByClause();
					}
					break;
				case TTL:
					{
					setState(836);
					ttlClause();
					}
					break;
				case SETTINGS:
					{
					setState(837);
					settingsClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(842);
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

	public static class PartitionByClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(ClickHouseSQLParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(ClickHouseSQLParser.BY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public PartitionByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterPartitionByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitPartitionByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitPartitionByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionByClauseContext partitionByClause() throws RecognitionException {
		PartitionByClauseContext _localctx = new PartitionByClauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_partitionByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			match(PARTITION);
			setState(844);
			match(BY);
			setState(845);
			columnExpr(0);
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

	public static class PrimaryKeyClauseContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ClickHouseSQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseSQLParser.KEY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public PrimaryKeyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterPrimaryKeyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitPrimaryKeyClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitPrimaryKeyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyClauseContext primaryKeyClause() throws RecognitionException {
		PrimaryKeyClauseContext _localctx = new PrimaryKeyClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_primaryKeyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(PRIMARY);
			setState(848);
			match(KEY);
			setState(849);
			columnExpr(0);
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

	public static class SampleByClauseContext extends ParserRuleContext {
		public TerminalNode SAMPLE() { return getToken(ClickHouseSQLParser.SAMPLE, 0); }
		public TerminalNode BY() { return getToken(ClickHouseSQLParser.BY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public SampleByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterSampleByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitSampleByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitSampleByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleByClauseContext sampleByClause() throws RecognitionException {
		SampleByClauseContext _localctx = new SampleByClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sampleByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			match(SAMPLE);
			setState(852);
			match(BY);
			setState(853);
			columnExpr(0);
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

	public static class TtlClauseContext extends ParserRuleContext {
		public TerminalNode TTL() { return getToken(ClickHouseSQLParser.TTL, 0); }
		public List<TtlExprContext> ttlExpr() {
			return getRuleContexts(TtlExprContext.class);
		}
		public TtlExprContext ttlExpr(int i) {
			return getRuleContext(TtlExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseSQLParser.COMMA, i);
		}
		public TtlClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ttlClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTtlClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTtlClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTtlClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TtlClauseContext ttlClause() throws RecognitionException {
		TtlClauseContext _localctx = new TtlClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ttlClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(TTL);
			setState(856);
			ttlExpr();
			setState(861);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(857);
					match(COMMA);
					setState(858);
					ttlExpr();
					}
					} 
				}
				setState(863);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
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

	public static class EngineExprContext extends ParserRuleContext {
		public IdentifierOrNullContext identifierOrNull() {
			return getRuleContext(IdentifierOrNullContext.class,0);
		}
		public TerminalNode ENGINE() { return getToken(ClickHouseSQLParser.ENGINE, 0); }
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseSQLParser.EQ_SINGLE, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public EngineExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engineExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterEngineExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitEngineExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitEngineExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EngineExprContext engineExpr() throws RecognitionException {
		EngineExprContext _localctx = new EngineExprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_engineExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(864);
				match(ENGINE);
				}
				break;
			}
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_SINGLE) {
				{
				setState(867);
				match(EQ_SINGLE);
				}
			}

			setState(870);
			identifierOrNull();
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(871);
				match(LPAREN);
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
					{
					setState(872);
					columnExprList();
					}
				}

				setState(875);
				match(RPAREN);
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

	public static class TableElementExprContext extends ParserRuleContext {
		public TableElementExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElementExpr; }
	 
		public TableElementExprContext() { }
		public void copyFrom(TableElementExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableElementExprProjectionContext extends TableElementExprContext {
		public TerminalNode PROJECTION() { return getToken(ClickHouseSQLParser.PROJECTION, 0); }
		public TableProjectionDfntContext tableProjectionDfnt() {
			return getRuleContext(TableProjectionDfntContext.class,0);
		}
		public TableElementExprProjectionContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTableElementExprProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTableElementExprProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTableElementExprProjection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableElementExprConstraintContext extends TableElementExprContext {
		public TerminalNode CONSTRAINT() { return getToken(ClickHouseSQLParser.CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(ClickHouseSQLParser.CHECK, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TableElementExprConstraintContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTableElementExprConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTableElementExprConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTableElementExprConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableElementExprColumnContext extends TableElementExprContext {
		public TableColumnDfntContext tableColumnDfnt() {
			return getRuleContext(TableColumnDfntContext.class,0);
		}
		public TableElementExprColumnContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTableElementExprColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTableElementExprColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTableElementExprColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableElementExprIndexContext extends TableElementExprContext {
		public TerminalNode INDEX() { return getToken(ClickHouseSQLParser.INDEX, 0); }
		public TableIndexDfntContext tableIndexDfnt() {
			return getRuleContext(TableIndexDfntContext.class,0);
		}
		public TableElementExprIndexContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTableElementExprIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTableElementExprIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTableElementExprIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableElementExprContext tableElementExpr() throws RecognitionException {
		TableElementExprContext _localctx = new TableElementExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tableElementExpr);
		try {
			setState(888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				_localctx = new TableElementExprColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				tableColumnDfnt();
				}
				break;
			case 2:
				_localctx = new TableElementExprConstraintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				match(CONSTRAINT);
				setState(880);
				identifier();
				setState(881);
				match(CHECK);
				setState(882);
				columnExpr(0);
				}
				break;
			case 3:
				_localctx = new TableElementExprIndexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(884);
				match(INDEX);
				setState(885);
				tableIndexDfnt();
				}
				break;
			case 4:
				_localctx = new TableElementExprProjectionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(886);
				match(PROJECTION);
				setState(887);
				tableProjectionDfnt();
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

	public static class TableColumnDfntContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public TableColumnPropertyExprContext tableColumnPropertyExpr() {
			return getRuleContext(TableColumnPropertyExprContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ClickHouseSQLParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseSQLParser.STRING_LITERAL, 0); }
		public CodecExprContext codecExpr() {
			return getRuleContext(CodecExprContext.class,0);
		}
		public TerminalNode TTL() { return getToken(ClickHouseSQLParser.TTL, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TableColumnDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumnDfnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTableColumnDfnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTableColumnDfnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTableColumnDfnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableColumnDfntContext tableColumnDfnt() throws RecognitionException {
		TableColumnDfntContext _localctx = new TableColumnDfntContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tableColumnDfnt);
		int _la;
		try {
			setState(922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				nestedIdentifier();
				setState(891);
				columnTypeExpr();
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIAS || _la==DEFAULT || _la==MATERIALIZED) {
					{
					setState(892);
					tableColumnPropertyExpr();
					}
				}

				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(895);
					match(COMMENT);
					setState(896);
					match(STRING_LITERAL);
					}
				}

				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEC) {
					{
					setState(899);
					codecExpr();
					}
				}

				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TTL) {
					{
					setState(902);
					match(TTL);
					setState(903);
					columnExpr(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(906);
				nestedIdentifier();
				setState(908);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(907);
					columnTypeExpr();
					}
					break;
				}
				setState(910);
				tableColumnPropertyExpr();
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(911);
					match(COMMENT);
					setState(912);
					match(STRING_LITERAL);
					}
				}

				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEC) {
					{
					setState(915);
					codecExpr();
					}
				}

				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TTL) {
					{
					setState(918);
					match(TTL);
					setState(919);
					columnExpr(0);
					}
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

	public static class TableColumnPropertyExprContext extends ParserRuleContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(ClickHouseSQLParser.DEFAULT, 0); }
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseSQLParser.MATERIALIZED, 0); }
		public TerminalNode ALIAS() { return getToken(ClickHouseSQLParser.ALIAS, 0); }
		public TableColumnPropertyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumnPropertyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTableColumnPropertyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTableColumnPropertyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTableColumnPropertyExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableColumnPropertyExprContext tableColumnPropertyExpr() throws RecognitionException {
		TableColumnPropertyExprContext _localctx = new TableColumnPropertyExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tableColumnPropertyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			_la = _input.LA(1);
			if ( !(_la==ALIAS || _la==DEFAULT || _la==MATERIALIZED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(925);
			columnExpr(0);
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

	public static class TableIndexDfntContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(ClickHouseSQLParser.TYPE, 0); }
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public TerminalNode GRANULARITY() { return getToken(ClickHouseSQLParser.GRANULARITY, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseSQLParser.DECIMAL_LITERAL, 0); }
		public TableIndexDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIndexDfnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTableIndexDfnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTableIndexDfnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTableIndexDfnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIndexDfntContext tableIndexDfnt() throws RecognitionException {
		TableIndexDfntContext _localctx = new TableIndexDfntContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tableIndexDfnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			nestedIdentifier();
			setState(928);
			columnExpr(0);
			setState(929);
			match(TYPE);
			setState(930);
			columnTypeExpr();
			setState(931);
			match(GRANULARITY);
			setState(932);
			match(DECIMAL_LITERAL);
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

	public static class TableProjectionDfntContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public ProjectionSelectStmtContext projectionSelectStmt() {
			return getRuleContext(ProjectionSelectStmtContext.class,0);
		}
		public TableProjectionDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProjectionDfnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTableProjectionDfnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTableProjectionDfnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTableProjectionDfnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProjectionDfntContext tableProjectionDfnt() throws RecognitionException {
		TableProjectionDfntContext _localctx = new TableProjectionDfntContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tableProjectionDfnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			nestedIdentifier();
			setState(935);
			projectionSelectStmt();
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

	public static class CodecExprContext extends ParserRuleContext {
		public TerminalNode CODEC() { return getToken(ClickHouseSQLParser.CODEC, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public List<CodecArgExprContext> codecArgExpr() {
			return getRuleContexts(CodecArgExprContext.class);
		}
		public CodecArgExprContext codecArgExpr(int i) {
			return getRuleContext(CodecArgExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseSQLParser.COMMA, i);
		}
		public CodecExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codecExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterCodecExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitCodecExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitCodecExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodecExprContext codecExpr() throws RecognitionException {
		CodecExprContext _localctx = new CodecExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_codecExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(CODEC);
			setState(938);
			match(LPAREN);
			setState(939);
			codecArgExpr();
			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(940);
				match(COMMA);
				setState(941);
				codecArgExpr();
				}
				}
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(947);
			match(RPAREN);
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

	public static class CodecArgExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public CodecArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codecArgExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterCodecArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitCodecArgExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitCodecArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodecArgExprContext codecArgExpr() throws RecognitionException {
		CodecArgExprContext _localctx = new CodecArgExprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_codecArgExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			identifier();
			setState(955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(950);
				match(LPAREN);
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
					{
					setState(951);
					columnExprList();
					}
				}

				setState(954);
				match(RPAREN);
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

	public static class TtlExprContext extends ParserRuleContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(ClickHouseSQLParser.DELETE, 0); }
		public TerminalNode TO() { return getToken(ClickHouseSQLParser.TO, 0); }
		public TerminalNode DISK() { return getToken(ClickHouseSQLParser.DISK, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseSQLParser.STRING_LITERAL, 0); }
		public TerminalNode VOLUME() { return getToken(ClickHouseSQLParser.VOLUME, 0); }
		public TtlExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ttlExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTtlExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTtlExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTtlExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TtlExprContext ttlExpr() throws RecognitionException {
		TtlExprContext _localctx = new TtlExprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ttlExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			columnExpr(0);
			setState(965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(958);
				match(DELETE);
				}
				break;
			case 2:
				{
				setState(959);
				match(TO);
				setState(960);
				match(DISK);
				setState(961);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				{
				setState(962);
				match(TO);
				setState(963);
				match(VOLUME);
				setState(964);
				match(STRING_LITERAL);
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

	public static class DescribeStmtContext extends ParserRuleContext {
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public TerminalNode DESCRIBE() { return getToken(ClickHouseSQLParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(ClickHouseSQLParser.DESC, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseSQLParser.TABLE, 0); }
		public DescribeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterDescribeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitDescribeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitDescribeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeStmtContext describeStmt() throws RecognitionException {
		DescribeStmtContext _localctx = new DescribeStmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_describeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			_la = _input.LA(1);
			if ( !(_la==DESC || _la==DESCRIBE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(968);
				match(TABLE);
				}
				break;
			}
			setState(971);
			tableExpr(0);
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

	public static class DropStmtContext extends ParserRuleContext {
		public DropStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropStmt; }
	 
		public DropStmtContext() { }
		public void copyFrom(DropStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DropDatabaseStmtContext extends DropStmtContext {
		public TerminalNode DATABASE() { return getToken(ClickHouseSQLParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode DETACH() { return getToken(ClickHouseSQLParser.DETACH, 0); }
		public TerminalNode DROP() { return getToken(ClickHouseSQLParser.DROP, 0); }
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public DropDatabaseStmtContext(DropStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterDropDatabaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitDropDatabaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitDropDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableStmtContext extends DropStmtContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DETACH() { return getToken(ClickHouseSQLParser.DETACH, 0); }
		public TerminalNode DROP() { return getToken(ClickHouseSQLParser.DROP, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseSQLParser.DICTIONARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseSQLParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseSQLParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode NO() { return getToken(ClickHouseSQLParser.NO, 0); }
		public TerminalNode DELAY() { return getToken(ClickHouseSQLParser.DELAY, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseSQLParser.TEMPORARY, 0); }
		public DropTableStmtContext(DropStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterDropTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitDropTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitDropTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropStmtContext dropStmt() throws RecognitionException {
		DropStmtContext _localctx = new DropStmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dropStmt);
		int _la;
		try {
			setState(1004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				_localctx = new DropDatabaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(973);
				_la = _input.LA(1);
				if ( !(_la==DETACH || _la==DROP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(974);
				match(DATABASE);
				setState(977);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(975);
					match(IF);
					setState(976);
					match(EXISTS);
					}
					break;
				}
				setState(979);
				databaseIdentifier();
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(980);
					clusterClause();
					}
				}

				}
				break;
			case 2:
				_localctx = new DropTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(983);
				_la = _input.LA(1);
				if ( !(_la==DETACH || _la==DROP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(990);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DICTIONARY:
					{
					setState(984);
					match(DICTIONARY);
					}
					break;
				case TABLE:
				case TEMPORARY:
					{
					setState(986);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TEMPORARY) {
						{
						setState(985);
						match(TEMPORARY);
						}
					}

					setState(988);
					match(TABLE);
					}
					break;
				case VIEW:
					{
					setState(989);
					match(VIEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(994);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(992);
					match(IF);
					setState(993);
					match(EXISTS);
					}
					break;
				}
				setState(996);
				tableIdentifier();
				setState(998);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(997);
					clusterClause();
					}
				}

				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(1000);
					match(NO);
					setState(1001);
					match(DELAY);
					}
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

	public static class ExistsStmtContext extends ParserRuleContext {
		public ExistsStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existsStmt; }
	 
		public ExistsStmtContext() { }
		public void copyFrom(ExistsStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExistsTableStmtContext extends ExistsStmtContext {
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DICTIONARY() { return getToken(ClickHouseSQLParser.DICTIONARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseSQLParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseSQLParser.VIEW, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseSQLParser.TEMPORARY, 0); }
		public ExistsTableStmtContext(ExistsStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterExistsTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitExistsTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitExistsTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsDatabaseStmtContext extends ExistsStmtContext {
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public TerminalNode DATABASE() { return getToken(ClickHouseSQLParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public ExistsDatabaseStmtContext(ExistsStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterExistsDatabaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitExistsDatabaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitExistsDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistsStmtContext existsStmt() throws RecognitionException {
		ExistsStmtContext _localctx = new ExistsStmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_existsStmt);
		int _la;
		try {
			setState(1019);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				_localctx = new ExistsDatabaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1006);
				match(EXISTS);
				setState(1007);
				match(DATABASE);
				setState(1008);
				databaseIdentifier();
				}
				break;
			case 2:
				_localctx = new ExistsTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1009);
				match(EXISTS);
				setState(1016);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1010);
					match(DICTIONARY);
					}
					break;
				case 2:
					{
					setState(1012);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TEMPORARY) {
						{
						setState(1011);
						match(TEMPORARY);
						}
					}

					setState(1014);
					match(TABLE);
					}
					break;
				case 3:
					{
					setState(1015);
					match(VIEW);
					}
					break;
				}
				setState(1018);
				tableIdentifier();
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

	public static class ExplainStmtContext extends ParserRuleContext {
		public ExplainStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explainStmt; }
	 
		public ExplainStmtContext() { }
		public void copyFrom(ExplainStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainSyntaxStmtContext extends ExplainStmtContext {
		public TerminalNode EXPLAIN() { return getToken(ClickHouseSQLParser.EXPLAIN, 0); }
		public TerminalNode SYNTAX() { return getToken(ClickHouseSQLParser.SYNTAX, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExplainSyntaxStmtContext(ExplainStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterExplainSyntaxStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitExplainSyntaxStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitExplainSyntaxStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplainASTStmtContext extends ExplainStmtContext {
		public TerminalNode EXPLAIN() { return getToken(ClickHouseSQLParser.EXPLAIN, 0); }
		public TerminalNode AST() { return getToken(ClickHouseSQLParser.AST, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExplainASTStmtContext(ExplainStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterExplainASTStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitExplainASTStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitExplainASTStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplainStmtContext explainStmt() throws RecognitionException {
		ExplainStmtContext _localctx = new ExplainStmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_explainStmt);
		try {
			setState(1027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				_localctx = new ExplainASTStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1021);
				match(EXPLAIN);
				setState(1022);
				match(AST);
				setState(1023);
				query();
				}
				break;
			case 2:
				_localctx = new ExplainSyntaxStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1024);
				match(EXPLAIN);
				setState(1025);
				match(SYNTAX);
				setState(1026);
				query();
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

	public static class InsertStmtContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(ClickHouseSQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(ClickHouseSQLParser.INTO, 0); }
		public DataClauseContext dataClause() {
			return getRuleContext(DataClauseContext.class,0);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(ClickHouseSQLParser.FUNCTION, 0); }
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(ClickHouseSQLParser.TABLE, 0); }
		public ColumnsClauseContext columnsClause() {
			return getRuleContext(ColumnsClauseContext.class,0);
		}
		public InsertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterInsertStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitInsertStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitInsertStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStmtContext insertStmt() throws RecognitionException {
		InsertStmtContext _localctx = new InsertStmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_insertStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			match(INSERT);
			setState(1030);
			match(INTO);
			setState(1032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1031);
				match(TABLE);
				}
				break;
			}
			setState(1037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1034);
				tableIdentifier();
				}
				break;
			case 2:
				{
				setState(1035);
				match(FUNCTION);
				setState(1036);
				tableFunctionExpr();
				}
				break;
			}
			setState(1040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1039);
				columnsClause();
				}
				break;
			}
			setState(1042);
			dataClause();
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

	public static class ColumnsClauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public List<NestedIdentifierContext> nestedIdentifier() {
			return getRuleContexts(NestedIdentifierContext.class);
		}
		public NestedIdentifierContext nestedIdentifier(int i) {
			return getRuleContext(NestedIdentifierContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseSQLParser.COMMA, i);
		}
		public ColumnsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsClauseContext columnsClause() throws RecognitionException {
		ColumnsClauseContext _localctx = new ColumnsClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_columnsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			match(LPAREN);
			setState(1045);
			nestedIdentifier();
			setState(1050);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1046);
				match(COMMA);
				setState(1047);
				nestedIdentifier();
				}
				}
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1053);
			match(RPAREN);
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

	public static class DataClauseContext extends ParserRuleContext {
		public DataClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataClause; }
	 
		public DataClauseContext() { }
		public void copyFrom(DataClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DataClauseValuesContext extends DataClauseContext {
		public TerminalNode VALUES() { return getToken(ClickHouseSQLParser.VALUES, 0); }
		public DataClauseValuesContext(DataClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterDataClauseValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitDataClauseValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitDataClauseValues(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataClauseFormatContext extends DataClauseContext {
		public TerminalNode FORMAT() { return getToken(ClickHouseSQLParser.FORMAT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataClauseFormatContext(DataClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterDataClauseFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitDataClauseFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitDataClauseFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataClauseSelectContext extends DataClauseContext {
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ClickHouseSQLParser.EOF, 0); }
		public TerminalNode SEMICOLON() { return getToken(ClickHouseSQLParser.SEMICOLON, 0); }
		public DataClauseSelectContext(DataClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterDataClauseSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitDataClauseSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitDataClauseSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataClauseContext dataClause() throws RecognitionException {
		DataClauseContext _localctx = new DataClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_dataClause);
		int _la;
		try {
			setState(1064);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORMAT:
				_localctx = new DataClauseFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1055);
				match(FORMAT);
				setState(1056);
				identifier();
				}
				break;
			case VALUES:
				_localctx = new DataClauseValuesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1057);
				match(VALUES);
				}
				break;
			case SELECT:
			case WITH:
			case LPAREN:
				_localctx = new DataClauseSelectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1058);
				selectUnionStmt();
				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(1059);
					match(SEMICOLON);
					}
				}

				setState(1062);
				match(EOF);
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

	public static class KillStmtContext extends ParserRuleContext {
		public KillStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killStmt; }
	 
		public KillStmtContext() { }
		public void copyFrom(KillStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class KillMutationStmtContext extends KillStmtContext {
		public TerminalNode KILL() { return getToken(ClickHouseSQLParser.KILL, 0); }
		public TerminalNode MUTATION() { return getToken(ClickHouseSQLParser.MUTATION, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode SYNC() { return getToken(ClickHouseSQLParser.SYNC, 0); }
		public TerminalNode ASYNC() { return getToken(ClickHouseSQLParser.ASYNC, 0); }
		public TerminalNode TEST() { return getToken(ClickHouseSQLParser.TEST, 0); }
		public KillMutationStmtContext(KillStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterKillMutationStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitKillMutationStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitKillMutationStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KillStmtContext killStmt() throws RecognitionException {
		KillStmtContext _localctx = new KillStmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_killStmt);
		int _la;
		try {
			_localctx = new KillMutationStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			match(KILL);
			setState(1067);
			match(MUTATION);
			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1068);
				clusterClause();
				}
			}

			setState(1071);
			whereClause();
			setState(1073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC || _la==SYNC || _la==TEST) {
				{
				setState(1072);
				_la = _input.LA(1);
				if ( !(_la==ASYNC || _la==SYNC || _la==TEST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class OptimizeStmtContext extends ParserRuleContext {
		public TerminalNode OPTIMIZE() { return getToken(ClickHouseSQLParser.OPTIMIZE, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseSQLParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(ClickHouseSQLParser.FINAL, 0); }
		public TerminalNode DEDUPLICATE() { return getToken(ClickHouseSQLParser.DEDUPLICATE, 0); }
		public OptimizeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optimizeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterOptimizeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitOptimizeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitOptimizeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptimizeStmtContext optimizeStmt() throws RecognitionException {
		OptimizeStmtContext _localctx = new OptimizeStmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_optimizeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			match(OPTIMIZE);
			setState(1076);
			match(TABLE);
			setState(1077);
			tableIdentifier();
			setState(1079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1078);
				clusterClause();
				}
			}

			setState(1082);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1081);
				partitionClause();
				}
			}

			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(1084);
				match(FINAL);
				}
			}

			setState(1088);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEDUPLICATE) {
				{
				setState(1087);
				match(DEDUPLICATE);
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

	public static class RenameStmtContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(ClickHouseSQLParser.RENAME, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseSQLParser.TABLE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public List<TerminalNode> TO() { return getTokens(ClickHouseSQLParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(ClickHouseSQLParser.TO, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseSQLParser.COMMA, i);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public RenameStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterRenameStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitRenameStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitRenameStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameStmtContext renameStmt() throws RecognitionException {
		RenameStmtContext _localctx = new RenameStmtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_renameStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			match(RENAME);
			setState(1091);
			match(TABLE);
			setState(1092);
			tableIdentifier();
			setState(1093);
			match(TO);
			setState(1094);
			tableIdentifier();
			setState(1102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1095);
				match(COMMA);
				setState(1096);
				tableIdentifier();
				setState(1097);
				match(TO);
				setState(1098);
				tableIdentifier();
				}
				}
				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1105);
				clusterClause();
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

	public static class ProjectionSelectStmtContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public TerminalNode SELECT() { return getToken(ClickHouseSQLParser.SELECT, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public ProjectionOrderByClauseContext projectionOrderByClause() {
			return getRuleContext(ProjectionOrderByClauseContext.class,0);
		}
		public ProjectionSelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionSelectStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterProjectionSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitProjectionSelectStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitProjectionSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionSelectStmtContext projectionSelectStmt() throws RecognitionException {
		ProjectionSelectStmtContext _localctx = new ProjectionSelectStmtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_projectionSelectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			match(LPAREN);
			setState(1110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1109);
				withClause();
				}
			}

			setState(1112);
			match(SELECT);
			setState(1113);
			columnExprList();
			setState(1115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1114);
				groupByClause();
				}
			}

			setState(1118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1117);
				projectionOrderByClause();
				}
			}

			setState(1120);
			match(RPAREN);
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

	public static class SelectUnionStmtContext extends ParserRuleContext {
		public List<SelectStmtWithParensContext> selectStmtWithParens() {
			return getRuleContexts(SelectStmtWithParensContext.class);
		}
		public SelectStmtWithParensContext selectStmtWithParens(int i) {
			return getRuleContext(SelectStmtWithParensContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(ClickHouseSQLParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(ClickHouseSQLParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(ClickHouseSQLParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(ClickHouseSQLParser.ALL, i);
		}
		public SelectUnionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectUnionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterSelectUnionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitSelectUnionStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitSelectUnionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectUnionStmtContext selectUnionStmt() throws RecognitionException {
		SelectUnionStmtContext _localctx = new SelectUnionStmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_selectUnionStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			selectStmtWithParens();
			setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(1123);
				match(UNION);
				setState(1124);
				match(ALL);
				setState(1125);
				selectStmtWithParens();
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

	public static class SelectStmtWithParensContext extends ParserRuleContext {
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public SelectStmtWithParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmtWithParens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterSelectStmtWithParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitSelectStmtWithParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitSelectStmtWithParens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtWithParensContext selectStmtWithParens() throws RecognitionException {
		SelectStmtWithParensContext _localctx = new SelectStmtWithParensContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_selectStmtWithParens);
		try {
			setState(1136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(1131);
				selectStmt();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1132);
				match(LPAREN);
				setState(1133);
				selectUnionStmt();
				setState(1134);
				match(RPAREN);
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

	public static class SelectStmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(ClickHouseSQLParser.SELECT, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(ClickHouseSQLParser.DISTINCT, 0); }
		public TopClauseContext topClause() {
			return getRuleContext(TopClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public ArrayJoinClauseContext arrayJoinClause() {
			return getRuleContext(ArrayJoinClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public PrewhereClauseContext prewhereClause() {
			return getRuleContext(PrewhereClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public List<TerminalNode> WITH() { return getTokens(ClickHouseSQLParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(ClickHouseSQLParser.WITH, i);
		}
		public TerminalNode TOTALS() { return getToken(ClickHouseSQLParser.TOTALS, 0); }
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitByClauseContext limitByClause() {
			return getRuleContext(LimitByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SettingsClauseContext settingsClause() {
			return getRuleContext(SettingsClauseContext.class,0);
		}
		public TerminalNode CUBE() { return getToken(ClickHouseSQLParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(ClickHouseSQLParser.ROLLUP, 0); }
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitSelectStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1138);
				withClause();
				}
			}

			setState(1141);
			match(SELECT);
			setState(1143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1142);
				match(DISTINCT);
				}
				break;
			}
			setState(1146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1145);
				topClause();
				}
				break;
			}
			setState(1148);
			columnExprList();
			setState(1150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1149);
				fromClause();
				}
			}

			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY || _la==INNER || _la==LEFT) {
				{
				setState(1152);
				arrayJoinClause();
				}
			}

			setState(1156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(1155);
				windowClause();
				}
			}

			setState(1159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PREWHERE) {
				{
				setState(1158);
				prewhereClause();
				}
			}

			setState(1162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1161);
				whereClause();
				}
			}

			setState(1165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1164);
				groupByClause();
				}
			}

			setState(1169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1167);
				match(WITH);
				setState(1168);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1171);
				match(WITH);
				setState(1172);
				match(TOTALS);
				}
			}

			setState(1176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(1175);
				havingClause();
				}
			}

			setState(1179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1178);
				orderByClause();
				}
			}

			setState(1182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1181);
				limitByClause();
				}
				break;
			}
			setState(1185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1184);
				limitClause();
				}
			}

			setState(1188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SETTINGS) {
				{
				setState(1187);
				settingsClause();
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

	public static class WithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(ClickHouseSQLParser.WITH, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterWithClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitWithClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitWithClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_withClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			match(WITH);
			setState(1191);
			columnExprList();
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

	public static class TopClauseContext extends ParserRuleContext {
		public TerminalNode TOP() { return getToken(ClickHouseSQLParser.TOP, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseSQLParser.DECIMAL_LITERAL, 0); }
		public TerminalNode WITH() { return getToken(ClickHouseSQLParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(ClickHouseSQLParser.TIES, 0); }
		public TopClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTopClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTopClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTopClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopClauseContext topClause() throws RecognitionException {
		TopClauseContext _localctx = new TopClauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_topClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			match(TOP);
			setState(1194);
			match(DECIMAL_LITERAL);
			setState(1197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1195);
				match(WITH);
				setState(1196);
				match(TIES);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(ClickHouseSQLParser.FROM, 0); }
		public JoinExprContext joinExpr() {
			return getRuleContext(JoinExprContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			match(FROM);
			setState(1200);
			joinExpr(0);
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

	public static class ArrayJoinClauseContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(ClickHouseSQLParser.ARRAY, 0); }
		public TerminalNode JOIN() { return getToken(ClickHouseSQLParser.JOIN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode LEFT() { return getToken(ClickHouseSQLParser.LEFT, 0); }
		public TerminalNode INNER() { return getToken(ClickHouseSQLParser.INNER, 0); }
		public ArrayJoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayJoinClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterArrayJoinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitArrayJoinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitArrayJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayJoinClauseContext arrayJoinClause() throws RecognitionException {
		ArrayJoinClauseContext _localctx = new ArrayJoinClauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_arrayJoinClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INNER || _la==LEFT) {
				{
				setState(1202);
				_la = _input.LA(1);
				if ( !(_la==INNER || _la==LEFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1205);
			match(ARRAY);
			setState(1206);
			match(JOIN);
			setState(1207);
			columnExprList();
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

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(ClickHouseSQLParser.WINDOW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseSQLParser.AS, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public WindowExprContext windowExpr() {
			return getRuleContext(WindowExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitWindowClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_windowClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			match(WINDOW);
			setState(1210);
			identifier();
			setState(1211);
			match(AS);
			setState(1212);
			match(LPAREN);
			setState(1213);
			windowExpr();
			setState(1214);
			match(RPAREN);
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

	public static class PrewhereClauseContext extends ParserRuleContext {
		public TerminalNode PREWHERE() { return getToken(ClickHouseSQLParser.PREWHERE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public PrewhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prewhereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterPrewhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitPrewhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitPrewhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrewhereClauseContext prewhereClause() throws RecognitionException {
		PrewhereClauseContext _localctx = new PrewhereClauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_prewhereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			match(PREWHERE);
			setState(1217);
			columnExpr(0);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ClickHouseSQLParser.WHERE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			match(WHERE);
			setState(1220);
			columnExpr(0);
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(ClickHouseSQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(ClickHouseSQLParser.BY, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public TerminalNode CUBE() { return getToken(ClickHouseSQLParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(ClickHouseSQLParser.ROLLUP, 0); }
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			match(GROUP);
			setState(1223);
			match(BY);
			setState(1230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1224);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1225);
				match(LPAREN);
				setState(1226);
				columnExprList();
				setState(1227);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(1229);
				columnExprList();
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
		public TerminalNode HAVING() { return getToken(ClickHouseSQLParser.HAVING, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			match(HAVING);
			setState(1233);
			columnExpr(0);
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
		public TerminalNode ORDER() { return getToken(ClickHouseSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ClickHouseSQLParser.BY, 0); }
		public OrderExprListContext orderExprList() {
			return getRuleContext(OrderExprListContext.class,0);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_orderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			match(ORDER);
			setState(1236);
			match(BY);
			setState(1237);
			orderExprList();
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

	public static class ProjectionOrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(ClickHouseSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ClickHouseSQLParser.BY, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ProjectionOrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionOrderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterProjectionOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitProjectionOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitProjectionOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionOrderByClauseContext projectionOrderByClause() throws RecognitionException {
		ProjectionOrderByClauseContext _localctx = new ProjectionOrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_projectionOrderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			match(ORDER);
			setState(1240);
			match(BY);
			setState(1241);
			columnExprList();
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

	public static class LimitByClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(ClickHouseSQLParser.LIMIT, 0); }
		public LimitExprContext limitExpr() {
			return getRuleContext(LimitExprContext.class,0);
		}
		public TerminalNode BY() { return getToken(ClickHouseSQLParser.BY, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public LimitByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterLimitByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitLimitByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitLimitByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitByClauseContext limitByClause() throws RecognitionException {
		LimitByClauseContext _localctx = new LimitByClauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_limitByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			match(LIMIT);
			setState(1244);
			limitExpr();
			setState(1245);
			match(BY);
			setState(1246);
			columnExprList();
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

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(ClickHouseSQLParser.LIMIT, 0); }
		public LimitExprContext limitExpr() {
			return getRuleContext(LimitExprContext.class,0);
		}
		public TerminalNode WITH() { return getToken(ClickHouseSQLParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(ClickHouseSQLParser.TIES, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			match(LIMIT);
			setState(1249);
			limitExpr();
			setState(1252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1250);
				match(WITH);
				setState(1251);
				match(TIES);
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

	public static class SettingsClauseContext extends ParserRuleContext {
		public TerminalNode SETTINGS() { return getToken(ClickHouseSQLParser.SETTINGS, 0); }
		public SettingExprListContext settingExprList() {
			return getRuleContext(SettingExprListContext.class,0);
		}
		public SettingsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterSettingsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitSettingsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitSettingsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingsClauseContext settingsClause() throws RecognitionException {
		SettingsClauseContext _localctx = new SettingsClauseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_settingsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			match(SETTINGS);
			setState(1255);
			settingExprList();
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
		public JoinExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinExpr; }
	 
		public JoinExprContext() { }
		public void copyFrom(JoinExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JoinExprOpContext extends JoinExprContext {
		public List<JoinExprContext> joinExpr() {
			return getRuleContexts(JoinExprContext.class);
		}
		public JoinExprContext joinExpr(int i) {
			return getRuleContext(JoinExprContext.class,i);
		}
		public TerminalNode JOIN() { return getToken(ClickHouseSQLParser.JOIN, 0); }
		public JoinConstraintClauseContext joinConstraintClause() {
			return getRuleContext(JoinConstraintClauseContext.class,0);
		}
		public JoinOpContext joinOp() {
			return getRuleContext(JoinOpContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(ClickHouseSQLParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(ClickHouseSQLParser.LOCAL, 0); }
		public JoinExprOpContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterJoinExprOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitJoinExprOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitJoinExprOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinExprTableContext extends JoinExprContext {
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(ClickHouseSQLParser.FINAL, 0); }
		public SampleClauseContext sampleClause() {
			return getRuleContext(SampleClauseContext.class,0);
		}
		public JoinExprTableContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterJoinExprTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitJoinExprTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitJoinExprTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinExprParensContext extends JoinExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public JoinExprContext joinExpr() {
			return getRuleContext(JoinExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public JoinExprParensContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterJoinExprParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitJoinExprParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitJoinExprParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinExprCrossOpContext extends JoinExprContext {
		public List<JoinExprContext> joinExpr() {
			return getRuleContexts(JoinExprContext.class);
		}
		public JoinExprContext joinExpr(int i) {
			return getRuleContext(JoinExprContext.class,i);
		}
		public JoinOpCrossContext joinOpCross() {
			return getRuleContext(JoinOpCrossContext.class,0);
		}
		public JoinExprCrossOpContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterJoinExprCrossOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitJoinExprCrossOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitJoinExprCrossOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinExprContext joinExpr() throws RecognitionException {
		return joinExpr(0);
	}

	private JoinExprContext joinExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JoinExprContext _localctx = new JoinExprContext(_ctx, _parentState);
		JoinExprContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_joinExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				_localctx = new JoinExprTableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1258);
				tableExpr(0);
				setState(1260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1259);
					match(FINAL);
					}
					break;
				}
				setState(1263);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1262);
					sampleClause();
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new JoinExprParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1265);
				match(LPAREN);
				setState(1266);
				joinExpr(0);
				setState(1267);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1286);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
					case 1:
						{
						_localctx = new JoinExprCrossOpContext(new JoinExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_joinExpr);
						setState(1271);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1272);
						joinOpCross();
						setState(1273);
						joinExpr(4);
						}
						break;
					case 2:
						{
						_localctx = new JoinExprOpContext(new JoinExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_joinExpr);
						setState(1275);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1277);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==GLOBAL || _la==LOCAL) {
							{
							setState(1276);
							_la = _input.LA(1);
							if ( !(_la==GLOBAL || _la==LOCAL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
						}

						setState(1280);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (FULL - 68)) | (1L << (INNER - 68)) | (1L << (LEFT - 68)))) != 0) || _la==RIGHT || _la==SEMI) {
							{
							setState(1279);
							joinOp();
							}
						}

						setState(1282);
						match(JOIN);
						setState(1283);
						joinExpr(0);
						setState(1284);
						joinConstraintClause();
						}
						break;
					}
					} 
				}
				setState(1290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
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

	public static class JoinOpContext extends ParserRuleContext {
		public JoinOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinOp; }
	 
		public JoinOpContext() { }
		public void copyFrom(JoinOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JoinOpFullContext extends JoinOpContext {
		public TerminalNode FULL() { return getToken(ClickHouseSQLParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(ClickHouseSQLParser.OUTER, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseSQLParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseSQLParser.ANY, 0); }
		public JoinOpFullContext(JoinOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterJoinOpFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitJoinOpFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitJoinOpFull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinOpInnerContext extends JoinOpContext {
		public TerminalNode INNER() { return getToken(ClickHouseSQLParser.INNER, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseSQLParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseSQLParser.ANY, 0); }
		public TerminalNode ASOF() { return getToken(ClickHouseSQLParser.ASOF, 0); }
		public JoinOpInnerContext(JoinOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterJoinOpInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitJoinOpInner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitJoinOpInner(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinOpLeftRightContext extends JoinOpContext {
		public TerminalNode LEFT() { return getToken(ClickHouseSQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(ClickHouseSQLParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(ClickHouseSQLParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(ClickHouseSQLParser.SEMI, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseSQLParser.ALL, 0); }
		public TerminalNode ANTI() { return getToken(ClickHouseSQLParser.ANTI, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseSQLParser.ANY, 0); }
		public TerminalNode ASOF() { return getToken(ClickHouseSQLParser.ASOF, 0); }
		public JoinOpLeftRightContext(JoinOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterJoinOpLeftRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitJoinOpLeftRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitJoinOpLeftRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinOpContext joinOp() throws RecognitionException {
		JoinOpContext _localctx = new JoinOpContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_joinOp);
		int _la;
		try {
			setState(1334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				_localctx = new JoinOpInnerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1292);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) {
						{
						setState(1291);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1294);
					match(INNER);
					}
					break;
				case 2:
					{
					setState(1295);
					match(INNER);
					setState(1297);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) {
						{
						setState(1296);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					break;
				case 3:
					{
					setState(1299);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new JoinOpLeftRightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1303);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) {
						{
						setState(1302);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1305);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1307);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1306);
						match(OUTER);
						}
					}

					}
					break;
				case 2:
					{
					setState(1309);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1311);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1310);
						match(OUTER);
						}
					}

					setState(1314);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) {
						{
						setState(1313);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new JoinOpFullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1319);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==ANY) {
						{
						setState(1318);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1321);
					match(FULL);
					setState(1323);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1322);
						match(OUTER);
						}
					}

					}
					break;
				case 2:
					{
					setState(1325);
					match(FULL);
					setState(1327);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1326);
						match(OUTER);
						}
					}

					setState(1330);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==ANY) {
						{
						setState(1329);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					break;
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

	public static class JoinOpCrossContext extends ParserRuleContext {
		public TerminalNode CROSS() { return getToken(ClickHouseSQLParser.CROSS, 0); }
		public TerminalNode JOIN() { return getToken(ClickHouseSQLParser.JOIN, 0); }
		public TerminalNode GLOBAL() { return getToken(ClickHouseSQLParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(ClickHouseSQLParser.LOCAL, 0); }
		public TerminalNode COMMA() { return getToken(ClickHouseSQLParser.COMMA, 0); }
		public JoinOpCrossContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinOpCross; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterJoinOpCross(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitJoinOpCross(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitJoinOpCross(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinOpCrossContext joinOpCross() throws RecognitionException {
		JoinOpCrossContext _localctx = new JoinOpCrossContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_joinOpCross);
		int _la;
		try {
			setState(1342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CROSS:
			case GLOBAL:
			case LOCAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==LOCAL) {
					{
					setState(1336);
					_la = _input.LA(1);
					if ( !(_la==GLOBAL || _la==LOCAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1339);
				match(CROSS);
				setState(1340);
				match(JOIN);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(1341);
				match(COMMA);
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

	public static class JoinConstraintClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(ClickHouseSQLParser.ON, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode USING() { return getToken(ClickHouseSQLParser.USING, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public JoinConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinConstraintClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterJoinConstraintClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitJoinConstraintClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitJoinConstraintClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinConstraintClauseContext joinConstraintClause() throws RecognitionException {
		JoinConstraintClauseContext _localctx = new JoinConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_joinConstraintClause);
		try {
			setState(1353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1344);
				match(ON);
				setState(1345);
				columnExprList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1346);
				match(USING);
				setState(1347);
				match(LPAREN);
				setState(1348);
				columnExprList();
				setState(1349);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1351);
				match(USING);
				setState(1352);
				columnExprList();
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

	public static class SampleClauseContext extends ParserRuleContext {
		public TerminalNode SAMPLE() { return getToken(ClickHouseSQLParser.SAMPLE, 0); }
		public List<RatioExprContext> ratioExpr() {
			return getRuleContexts(RatioExprContext.class);
		}
		public RatioExprContext ratioExpr(int i) {
			return getRuleContext(RatioExprContext.class,i);
		}
		public TerminalNode OFFSET() { return getToken(ClickHouseSQLParser.OFFSET, 0); }
		public SampleClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterSampleClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitSampleClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitSampleClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleClauseContext sampleClause() throws RecognitionException {
		SampleClauseContext _localctx = new SampleClauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_sampleClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			match(SAMPLE);
			setState(1356);
			ratioExpr();
			setState(1359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1357);
				match(OFFSET);
				setState(1358);
				ratioExpr();
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

	public static class LimitExprContext extends ParserRuleContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ClickHouseSQLParser.COMMA, 0); }
		public TerminalNode OFFSET() { return getToken(ClickHouseSQLParser.OFFSET, 0); }
		public LimitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterLimitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitLimitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitLimitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitExprContext limitExpr() throws RecognitionException {
		LimitExprContext _localctx = new LimitExprContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_limitExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
			columnExpr(0);
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET || _la==COMMA) {
				{
				setState(1362);
				_la = _input.LA(1);
				if ( !(_la==OFFSET || _la==COMMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1363);
				columnExpr(0);
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

	public static class OrderExprListContext extends ParserRuleContext {
		public List<OrderExprContext> orderExpr() {
			return getRuleContexts(OrderExprContext.class);
		}
		public OrderExprContext orderExpr(int i) {
			return getRuleContext(OrderExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseSQLParser.COMMA, i);
		}
		public OrderExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterOrderExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitOrderExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitOrderExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderExprListContext orderExprList() throws RecognitionException {
		OrderExprListContext _localctx = new OrderExprListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_orderExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			orderExpr();
			setState(1371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1367);
				match(COMMA);
				setState(1368);
				orderExpr();
				}
				}
				setState(1373);
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

	public static class OrderExprContext extends ParserRuleContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(ClickHouseSQLParser.NULLS, 0); }
		public TerminalNode COLLATE() { return getToken(ClickHouseSQLParser.COLLATE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseSQLParser.STRING_LITERAL, 0); }
		public TerminalNode ASCENDING() { return getToken(ClickHouseSQLParser.ASCENDING, 0); }
		public TerminalNode DESCENDING() { return getToken(ClickHouseSQLParser.DESCENDING, 0); }
		public TerminalNode DESC() { return getToken(ClickHouseSQLParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(ClickHouseSQLParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(ClickHouseSQLParser.LAST, 0); }
		public OrderExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterOrderExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitOrderExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitOrderExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderExprContext orderExpr() throws RecognitionException {
		OrderExprContext _localctx = new OrderExprContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_orderExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			columnExpr(0);
			setState(1376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASCENDING) | (1L << DESC) | (1L << DESCENDING))) != 0)) {
				{
				setState(1375);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASCENDING) | (1L << DESC) | (1L << DESCENDING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1378);
				match(NULLS);
				setState(1379);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(1382);
				match(COLLATE);
				setState(1383);
				match(STRING_LITERAL);
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

	public static class RatioExprContext extends ParserRuleContext {
		public List<NumberLiteralContext> numberLiteral() {
			return getRuleContexts(NumberLiteralContext.class);
		}
		public NumberLiteralContext numberLiteral(int i) {
			return getRuleContext(NumberLiteralContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(ClickHouseSQLParser.SLASH, 0); }
		public RatioExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ratioExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterRatioExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitRatioExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitRatioExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RatioExprContext ratioExpr() throws RecognitionException {
		RatioExprContext _localctx = new RatioExprContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_ratioExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			numberLiteral();
			setState(1389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1387);
				match(SLASH);
				setState(1388);
				numberLiteral();
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

	public static class SettingExprListContext extends ParserRuleContext {
		public List<SettingExprContext> settingExpr() {
			return getRuleContexts(SettingExprContext.class);
		}
		public SettingExprContext settingExpr(int i) {
			return getRuleContext(SettingExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseSQLParser.COMMA, i);
		}
		public SettingExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterSettingExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitSettingExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitSettingExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingExprListContext settingExprList() throws RecognitionException {
		SettingExprListContext _localctx = new SettingExprListContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_settingExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			settingExpr();
			setState(1396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1392);
				match(COMMA);
				setState(1393);
				settingExpr();
				}
				}
				setState(1398);
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

	public static class SettingExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseSQLParser.EQ_SINGLE, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public SettingExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterSettingExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitSettingExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitSettingExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingExprContext settingExpr() throws RecognitionException {
		SettingExprContext _localctx = new SettingExprContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_settingExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			identifier();
			setState(1400);
			match(EQ_SINGLE);
			setState(1401);
			literal();
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

	public static class WindowExprContext extends ParserRuleContext {
		public WinPartitionByClauseContext winPartitionByClause() {
			return getRuleContext(WinPartitionByClauseContext.class,0);
		}
		public WinOrderByClauseContext winOrderByClause() {
			return getRuleContext(WinOrderByClauseContext.class,0);
		}
		public WinFrameClauseContext winFrameClause() {
			return getRuleContext(WinFrameClauseContext.class,0);
		}
		public WindowExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterWindowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitWindowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitWindowExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowExprContext windowExpr() throws RecognitionException {
		WindowExprContext _localctx = new WindowExprContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_windowExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1403);
				winPartitionByClause();
				}
			}

			setState(1407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1406);
				winOrderByClause();
				}
			}

			setState(1410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(1409);
				winFrameClause();
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

	public static class WinPartitionByClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(ClickHouseSQLParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(ClickHouseSQLParser.BY, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public WinPartitionByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_winPartitionByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterWinPartitionByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitWinPartitionByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitWinPartitionByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WinPartitionByClauseContext winPartitionByClause() throws RecognitionException {
		WinPartitionByClauseContext _localctx = new WinPartitionByClauseContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_winPartitionByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			match(PARTITION);
			setState(1413);
			match(BY);
			setState(1414);
			columnExprList();
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

	public static class WinOrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(ClickHouseSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ClickHouseSQLParser.BY, 0); }
		public OrderExprListContext orderExprList() {
			return getRuleContext(OrderExprListContext.class,0);
		}
		public WinOrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_winOrderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterWinOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitWinOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitWinOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WinOrderByClauseContext winOrderByClause() throws RecognitionException {
		WinOrderByClauseContext _localctx = new WinOrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_winOrderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			match(ORDER);
			setState(1417);
			match(BY);
			setState(1418);
			orderExprList();
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

	public static class WinFrameClauseContext extends ParserRuleContext {
		public WinFrameExtendContext winFrameExtend() {
			return getRuleContext(WinFrameExtendContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(ClickHouseSQLParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(ClickHouseSQLParser.RANGE, 0); }
		public WinFrameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_winFrameClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterWinFrameClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitWinFrameClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitWinFrameClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WinFrameClauseContext winFrameClause() throws RecognitionException {
		WinFrameClauseContext _localctx = new WinFrameClauseContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_winFrameClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			_la = _input.LA(1);
			if ( !(_la==RANGE || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1421);
			winFrameExtend();
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

	public static class WinFrameExtendContext extends ParserRuleContext {
		public WinFrameExtendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_winFrameExtend; }
	 
		public WinFrameExtendContext() { }
		public void copyFrom(WinFrameExtendContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FrameStartContext extends WinFrameExtendContext {
		public WinFrameBoundContext winFrameBound() {
			return getRuleContext(WinFrameBoundContext.class,0);
		}
		public FrameStartContext(WinFrameExtendContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterFrameStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitFrameStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitFrameStart(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FrameBetweenContext extends WinFrameExtendContext {
		public TerminalNode BETWEEN() { return getToken(ClickHouseSQLParser.BETWEEN, 0); }
		public List<WinFrameBoundContext> winFrameBound() {
			return getRuleContexts(WinFrameBoundContext.class);
		}
		public WinFrameBoundContext winFrameBound(int i) {
			return getRuleContext(WinFrameBoundContext.class,i);
		}
		public TerminalNode AND() { return getToken(ClickHouseSQLParser.AND, 0); }
		public FrameBetweenContext(WinFrameExtendContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterFrameBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitFrameBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitFrameBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WinFrameExtendContext winFrameExtend() throws RecognitionException {
		WinFrameExtendContext _localctx = new WinFrameExtendContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_winFrameExtend);
		try {
			setState(1429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURRENT:
			case INF:
			case NAN_SQL:
			case UNBOUNDED:
			case FLOATING_LITERAL:
			case OCTAL_LITERAL:
			case DECIMAL_LITERAL:
			case HEXADECIMAL_LITERAL:
			case DASH:
			case DOT:
			case PLUS:
				_localctx = new FrameStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1423);
				winFrameBound();
				}
				break;
			case BETWEEN:
				_localctx = new FrameBetweenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1424);
				match(BETWEEN);
				setState(1425);
				winFrameBound();
				setState(1426);
				match(AND);
				setState(1427);
				winFrameBound();
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

	public static class WinFrameBoundContext extends ParserRuleContext {
		public TerminalNode CURRENT() { return getToken(ClickHouseSQLParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(ClickHouseSQLParser.ROW, 0); }
		public TerminalNode UNBOUNDED() { return getToken(ClickHouseSQLParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(ClickHouseSQLParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(ClickHouseSQLParser.FOLLOWING, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public WinFrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_winFrameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterWinFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitWinFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitWinFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WinFrameBoundContext winFrameBound() throws RecognitionException {
		WinFrameBoundContext _localctx = new WinFrameBoundContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_winFrameBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1431);
				match(CURRENT);
				setState(1432);
				match(ROW);
				}
				break;
			case 2:
				{
				setState(1433);
				match(UNBOUNDED);
				setState(1434);
				match(PRECEDING);
				}
				break;
			case 3:
				{
				setState(1435);
				match(UNBOUNDED);
				setState(1436);
				match(FOLLOWING);
				}
				break;
			case 4:
				{
				setState(1437);
				numberLiteral();
				setState(1438);
				match(PRECEDING);
				}
				break;
			case 5:
				{
				setState(1440);
				numberLiteral();
				setState(1441);
				match(FOLLOWING);
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

	public static class SetStmtContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(ClickHouseSQLParser.SET, 0); }
		public SettingExprListContext settingExprList() {
			return getRuleContext(SettingExprListContext.class,0);
		}
		public SetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterSetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitSetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitSetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStmtContext setStmt() throws RecognitionException {
		SetStmtContext _localctx = new SetStmtContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_setStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			match(SET);
			setState(1446);
			settingExprList();
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

	public static class ShowStmtContext extends ParserRuleContext {
		public ShowStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showStmt; }
	 
		public ShowStmtContext() { }
		public void copyFrom(ShowStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowCreateDatabaseStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseSQLParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseSQLParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(ClickHouseSQLParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public ShowCreateDatabaseStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterShowCreateDatabaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitShowCreateDatabaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitShowCreateDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowDatabasesStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseSQLParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(ClickHouseSQLParser.DATABASES, 0); }
		public ShowDatabasesStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterShowDatabasesStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitShowDatabasesStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitShowDatabasesStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseSQLParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseSQLParser.CREATE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(ClickHouseSQLParser.TEMPORARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseSQLParser.TABLE, 0); }
		public ShowCreateTableStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterShowCreateTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitShowCreateTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitShowCreateTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseSQLParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(ClickHouseSQLParser.TABLES, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseSQLParser.TEMPORARY, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(ClickHouseSQLParser.LIKE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseSQLParser.STRING_LITERAL, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseSQLParser.FROM, 0); }
		public TerminalNode IN() { return getToken(ClickHouseSQLParser.IN, 0); }
		public ShowTablesStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterShowTablesStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitShowTablesStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitShowTablesStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowDictionariesStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseSQLParser.SHOW, 0); }
		public TerminalNode DICTIONARIES() { return getToken(ClickHouseSQLParser.DICTIONARIES, 0); }
		public TerminalNode FROM() { return getToken(ClickHouseSQLParser.FROM, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public ShowDictionariesStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterShowDictionariesStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitShowDictionariesStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitShowDictionariesStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateDictionaryStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseSQLParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseSQLParser.CREATE, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseSQLParser.DICTIONARY, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ShowCreateDictionaryStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterShowCreateDictionaryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitShowCreateDictionaryStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitShowCreateDictionaryStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowStmtContext showStmt() throws RecognitionException {
		ShowStmtContext _localctx = new ShowStmtContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_showStmt);
		int _la;
		try {
			setState(1490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				_localctx = new ShowCreateDatabaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1448);
				match(SHOW);
				setState(1449);
				match(CREATE);
				setState(1450);
				match(DATABASE);
				setState(1451);
				databaseIdentifier();
				}
				break;
			case 2:
				_localctx = new ShowCreateDictionaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1452);
				match(SHOW);
				setState(1453);
				match(CREATE);
				setState(1454);
				match(DICTIONARY);
				setState(1455);
				tableIdentifier();
				}
				break;
			case 3:
				_localctx = new ShowCreateTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1456);
				match(SHOW);
				setState(1457);
				match(CREATE);
				setState(1459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1458);
					match(TEMPORARY);
					}
					break;
				}
				setState(1462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1461);
					match(TABLE);
					}
					break;
				}
				setState(1464);
				tableIdentifier();
				}
				break;
			case 4:
				_localctx = new ShowDatabasesStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1465);
				match(SHOW);
				setState(1466);
				match(DATABASES);
				}
				break;
			case 5:
				_localctx = new ShowDictionariesStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1467);
				match(SHOW);
				setState(1468);
				match(DICTIONARIES);
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(1469);
					match(FROM);
					setState(1470);
					databaseIdentifier();
					}
				}

				}
				break;
			case 6:
				_localctx = new ShowTablesStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1473);
				match(SHOW);
				setState(1475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(1474);
					match(TEMPORARY);
					}
				}

				setState(1477);
				match(TABLES);
				setState(1480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(1478);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1479);
					databaseIdentifier();
					}
				}

				setState(1485);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LIKE:
					{
					setState(1482);
					match(LIKE);
					setState(1483);
					match(STRING_LITERAL);
					}
					break;
				case WHERE:
					{
					setState(1484);
					whereClause();
					}
					break;
				case EOF:
				case FORMAT:
				case INTO:
				case LIMIT:
				case SEMICOLON:
					break;
				default:
					break;
				}
				setState(1488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(1487);
					limitClause();
					}
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

	public static class SystemStmtContext extends ParserRuleContext {
		public TerminalNode SYSTEM() { return getToken(ClickHouseSQLParser.SYSTEM, 0); }
		public TerminalNode FLUSH() { return getToken(ClickHouseSQLParser.FLUSH, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(ClickHouseSQLParser.DISTRIBUTED, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LOGS() { return getToken(ClickHouseSQLParser.LOGS, 0); }
		public TerminalNode RELOAD() { return getToken(ClickHouseSQLParser.RELOAD, 0); }
		public TerminalNode DICTIONARIES() { return getToken(ClickHouseSQLParser.DICTIONARIES, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseSQLParser.DICTIONARY, 0); }
		public TerminalNode START() { return getToken(ClickHouseSQLParser.START, 0); }
		public TerminalNode STOP() { return getToken(ClickHouseSQLParser.STOP, 0); }
		public TerminalNode SENDS() { return getToken(ClickHouseSQLParser.SENDS, 0); }
		public TerminalNode FETCHES() { return getToken(ClickHouseSQLParser.FETCHES, 0); }
		public TerminalNode MERGES() { return getToken(ClickHouseSQLParser.MERGES, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseSQLParser.TTL, 0); }
		public TerminalNode REPLICATED() { return getToken(ClickHouseSQLParser.REPLICATED, 0); }
		public TerminalNode SYNC() { return getToken(ClickHouseSQLParser.SYNC, 0); }
		public TerminalNode REPLICA() { return getToken(ClickHouseSQLParser.REPLICA, 0); }
		public SystemStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterSystemStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitSystemStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitSystemStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemStmtContext systemStmt() throws RecognitionException {
		SystemStmtContext _localctx = new SystemStmtContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_systemStmt);
		int _la;
		try {
			setState(1526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1492);
				match(SYSTEM);
				setState(1493);
				match(FLUSH);
				setState(1494);
				match(DISTRIBUTED);
				setState(1495);
				tableIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1496);
				match(SYSTEM);
				setState(1497);
				match(FLUSH);
				setState(1498);
				match(LOGS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1499);
				match(SYSTEM);
				setState(1500);
				match(RELOAD);
				setState(1501);
				match(DICTIONARIES);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1502);
				match(SYSTEM);
				setState(1503);
				match(RELOAD);
				setState(1504);
				match(DICTIONARY);
				setState(1505);
				tableIdentifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1506);
				match(SYSTEM);
				setState(1507);
				_la = _input.LA(1);
				if ( !(_la==START || _la==STOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1515);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DISTRIBUTED:
					{
					setState(1508);
					match(DISTRIBUTED);
					setState(1509);
					match(SENDS);
					}
					break;
				case FETCHES:
					{
					setState(1510);
					match(FETCHES);
					}
					break;
				case MERGES:
				case TTL:
					{
					setState(1512);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TTL) {
						{
						setState(1511);
						match(TTL);
						}
					}

					setState(1514);
					match(MERGES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1517);
				tableIdentifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1518);
				match(SYSTEM);
				setState(1519);
				_la = _input.LA(1);
				if ( !(_la==START || _la==STOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1520);
				match(REPLICATED);
				setState(1521);
				match(SENDS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1522);
				match(SYSTEM);
				setState(1523);
				match(SYNC);
				setState(1524);
				match(REPLICA);
				setState(1525);
				tableIdentifier();
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

	public static class TruncateStmtContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(ClickHouseSQLParser.TRUNCATE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(ClickHouseSQLParser.TEMPORARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseSQLParser.TABLE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TruncateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTruncateStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTruncateStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTruncateStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruncateStmtContext truncateStmt() throws RecognitionException {
		TruncateStmtContext _localctx = new TruncateStmtContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_truncateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
			match(TRUNCATE);
			setState(1530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1529);
				match(TEMPORARY);
				}
				break;
			}
			setState(1533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1532);
				match(TABLE);
				}
				break;
			}
			setState(1537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1535);
				match(IF);
				setState(1536);
				match(EXISTS);
				}
				break;
			}
			setState(1539);
			tableIdentifier();
			setState(1541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1540);
				clusterClause();
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

	public static class UseStmtContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(ClickHouseSQLParser.USE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public UseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterUseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitUseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitUseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStmtContext useStmt() throws RecognitionException {
		UseStmtContext _localctx = new UseStmtContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_useStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			match(USE);
			setState(1544);
			databaseIdentifier();
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

	public static class WatchStmtContext extends ParserRuleContext {
		public TerminalNode WATCH() { return getToken(ClickHouseSQLParser.WATCH, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EVENTS() { return getToken(ClickHouseSQLParser.EVENTS, 0); }
		public TerminalNode LIMIT() { return getToken(ClickHouseSQLParser.LIMIT, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseSQLParser.DECIMAL_LITERAL, 0); }
		public WatchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_watchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterWatchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitWatchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitWatchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WatchStmtContext watchStmt() throws RecognitionException {
		WatchStmtContext _localctx = new WatchStmtContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_watchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			match(WATCH);
			setState(1547);
			tableIdentifier();
			setState(1549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EVENTS) {
				{
				setState(1548);
				match(EVENTS);
				}
			}

			setState(1553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1551);
				match(LIMIT);
				setState(1552);
				match(DECIMAL_LITERAL);
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

	public static class ColumnTypeExprContext extends ParserRuleContext {
		public ColumnTypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnTypeExpr; }
	 
		public ColumnTypeExprContext() { }
		public void copyFrom(ColumnTypeExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnTypeExprNestedContext extends ColumnTypeExprContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public List<ColumnTypeExprContext> columnTypeExpr() {
			return getRuleContexts(ColumnTypeExprContext.class);
		}
		public ColumnTypeExprContext columnTypeExpr(int i) {
			return getRuleContext(ColumnTypeExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseSQLParser.COMMA, i);
		}
		public ColumnTypeExprNestedContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnTypeExprNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnTypeExprNested(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnTypeExprNested(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnTypeExprParamContext extends ColumnTypeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnTypeExprParamContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnTypeExprParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnTypeExprParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnTypeExprParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnTypeExprSimpleContext extends ColumnTypeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnTypeExprSimpleContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnTypeExprSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnTypeExprSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnTypeExprSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnTypeExprComplexContext extends ColumnTypeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public List<ColumnTypeExprContext> columnTypeExpr() {
			return getRuleContexts(ColumnTypeExprContext.class);
		}
		public ColumnTypeExprContext columnTypeExpr(int i) {
			return getRuleContext(ColumnTypeExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseSQLParser.COMMA, i);
		}
		public ColumnTypeExprComplexContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnTypeExprComplex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnTypeExprComplex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnTypeExprComplex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnTypeExprEnumContext extends ColumnTypeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseSQLParser.COMMA, i);
		}
		public ColumnTypeExprEnumContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnTypeExprEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnTypeExprEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnTypeExprEnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnTypeExprContext columnTypeExpr() throws RecognitionException {
		ColumnTypeExprContext _localctx = new ColumnTypeExprContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_columnTypeExpr);
		int _la;
		try {
			setState(1602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				_localctx = new ColumnTypeExprSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1555);
				identifier();
				}
				break;
			case 2:
				_localctx = new ColumnTypeExprNestedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1556);
				identifier();
				setState(1557);
				match(LPAREN);
				setState(1558);
				identifier();
				setState(1559);
				columnTypeExpr();
				setState(1566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1560);
					match(COMMA);
					setState(1561);
					identifier();
					setState(1562);
					columnTypeExpr();
					}
					}
					setState(1568);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1569);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new ColumnTypeExprEnumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1571);
				identifier();
				setState(1572);
				match(LPAREN);
				setState(1573);
				enumValue();
				setState(1578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1574);
					match(COMMA);
					setState(1575);
					enumValue();
					}
					}
					setState(1580);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1581);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new ColumnTypeExprComplexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1583);
				identifier();
				setState(1584);
				match(LPAREN);
				setState(1585);
				columnTypeExpr();
				setState(1590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1586);
					match(COMMA);
					setState(1587);
					columnTypeExpr();
					}
					}
					setState(1592);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1593);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new ColumnTypeExprParamContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1595);
				identifier();
				setState(1596);
				match(LPAREN);
				setState(1598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
					{
					setState(1597);
					columnExprList();
					}
				}

				setState(1600);
				match(RPAREN);
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

	public static class ColumnExprListContext extends ParserRuleContext {
		public List<ColumnsExprContext> columnsExpr() {
			return getRuleContexts(ColumnsExprContext.class);
		}
		public ColumnsExprContext columnsExpr(int i) {
			return getRuleContext(ColumnsExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseSQLParser.COMMA, i);
		}
		public ColumnExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnExprListContext columnExprList() throws RecognitionException {
		ColumnExprListContext _localctx = new ColumnExprListContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_columnExprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
			columnsExpr();
			setState(1609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1605);
					match(COMMA);
					setState(1606);
					columnsExpr();
					}
					} 
				}
				setState(1611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
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

	public static class ColumnsExprContext extends ParserRuleContext {
		public ColumnsExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnsExpr; }
	 
		public ColumnsExprContext() { }
		public void copyFrom(ColumnsExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnsExprColumnContext extends ColumnsExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnsExprColumnContext(ColumnsExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnsExprColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnsExprColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnsExprColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnsExprAsteriskContext extends ColumnsExprContext {
		public TerminalNode ASTERISK() { return getToken(ClickHouseSQLParser.ASTERISK, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseSQLParser.DOT, 0); }
		public ColumnsExprAsteriskContext(ColumnsExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnsExprAsterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnsExprAsterisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnsExprAsterisk(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnsExprSubqueryContext extends ColumnsExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public ColumnsExprSubqueryContext(ColumnsExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnsExprSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnsExprSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnsExprSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsExprContext columnsExpr() throws RecognitionException {
		ColumnsExprContext _localctx = new ColumnsExprContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_columnsExpr);
		int _la;
		try {
			setState(1623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				_localctx = new ColumnsExprAsteriskContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AFTER - 2)) | (1L << (ALIAS - 2)) | (1L << (ALL - 2)) | (1L << (ALTER - 2)) | (1L << (AND - 2)) | (1L << (ANTI - 2)) | (1L << (ANY - 2)) | (1L << (ARRAY - 2)) | (1L << (AS - 2)) | (1L << (ASCENDING - 2)) | (1L << (ASOF - 2)) | (1L << (AST - 2)) | (1L << (ASYNC - 2)) | (1L << (ATTACH - 2)) | (1L << (BETWEEN - 2)) | (1L << (BOTH - 2)) | (1L << (BY - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CHECK - 2)) | (1L << (CLEAR - 2)) | (1L << (CLUSTER - 2)) | (1L << (CODEC - 2)) | (1L << (COLLATE - 2)) | (1L << (COLUMN - 2)) | (1L << (COMMENT - 2)) | (1L << (CONSTRAINT - 2)) | (1L << (CREATE - 2)) | (1L << (CROSS - 2)) | (1L << (CUBE - 2)) | (1L << (CURRENT - 2)) | (1L << (DATABASE - 2)) | (1L << (DATABASES - 2)) | (1L << (DATE - 2)) | (1L << (DAY - 2)) | (1L << (DEDUPLICATE - 2)) | (1L << (DEFAULT - 2)) | (1L << (DELAY - 2)) | (1L << (DELETE - 2)) | (1L << (DESC - 2)) | (1L << (DESCENDING - 2)) | (1L << (DESCRIBE - 2)) | (1L << (DETACH - 2)) | (1L << (DICTIONARIES - 2)) | (1L << (DICTIONARY - 2)) | (1L << (DISK - 2)) | (1L << (DISTINCT - 2)) | (1L << (DISTRIBUTED - 2)) | (1L << (DROP - 2)) | (1L << (ELSE - 2)) | (1L << (END - 2)) | (1L << (ENGINE - 2)) | (1L << (EVENTS - 2)) | (1L << (EXISTS - 2)) | (1L << (EXPLAIN - 2)) | (1L << (EXPRESSION - 2)) | (1L << (EXTRACT - 2)) | (1L << (FETCHES - 2)) | (1L << (FINAL - 2)) | (1L << (FIRST - 2)) | (1L << (FLUSH - 2)) | (1L << (FOLLOWING - 2)) | (1L << (FOR - 2)) | (1L << (FORMAT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FREEZE - 66)) | (1L << (FROM - 66)) | (1L << (FULL - 66)) | (1L << (FUNCTION - 66)) | (1L << (GLOBAL - 66)) | (1L << (GRANULARITY - 66)) | (1L << (GROUP - 66)) | (1L << (HAVING - 66)) | (1L << (HIERARCHICAL - 66)) | (1L << (HOUR - 66)) | (1L << (ID - 66)) | (1L << (IF - 66)) | (1L << (ILIKE - 66)) | (1L << (IN - 66)) | (1L << (INDEX - 66)) | (1L << (INJECTIVE - 66)) | (1L << (INNER - 66)) | (1L << (INSERT - 66)) | (1L << (INTERVAL - 66)) | (1L << (INTO - 66)) | (1L << (IS - 66)) | (1L << (IS_OBJECT_ID - 66)) | (1L << (JOIN - 66)) | (1L << (KEY - 66)) | (1L << (KILL - 66)) | (1L << (LAST - 66)) | (1L << (LAYOUT - 66)) | (1L << (LEADING - 66)) | (1L << (LEFT - 66)) | (1L << (LIFETIME - 66)) | (1L << (LIKE - 66)) | (1L << (LIMIT - 66)) | (1L << (LIVE - 66)) | (1L << (LOCAL - 66)) | (1L << (LOGS - 66)) | (1L << (MATERIALIZE - 66)) | (1L << (MATERIALIZED - 66)) | (1L << (MAX - 66)) | (1L << (MERGES - 66)) | (1L << (MIN - 66)) | (1L << (MINUTE - 66)) | (1L << (MODIFY - 66)) | (1L << (MONTH - 66)) | (1L << (MOVE - 66)) | (1L << (MUTATION - 66)) | (1L << (NO - 66)) | (1L << (NOT - 66)) | (1L << (NULLS - 66)) | (1L << (OFFSET - 66)) | (1L << (ON - 66)) | (1L << (OPTIMIZE - 66)) | (1L << (OR - 66)) | (1L << (ORDER - 66)) | (1L << (OUTER - 66)) | (1L << (OUTFILE - 66)) | (1L << (OVER - 66)) | (1L << (PARTITION - 66)) | (1L << (POPULATE - 66)) | (1L << (PRECEDING - 66)) | (1L << (PREWHERE - 66)) | (1L << (PRIMARY - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (QUARTER - 131)) | (1L << (RANGE - 131)) | (1L << (RELOAD - 131)) | (1L << (REMOVE - 131)) | (1L << (RENAME - 131)) | (1L << (REPLACE - 131)) | (1L << (REPLICA - 131)) | (1L << (REPLICATED - 131)) | (1L << (RIGHT - 131)) | (1L << (ROLLUP - 131)) | (1L << (ROW - 131)) | (1L << (ROWS - 131)) | (1L << (SAMPLE - 131)) | (1L << (SECOND - 131)) | (1L << (SELECT - 131)) | (1L << (SEMI - 131)) | (1L << (SENDS - 131)) | (1L << (SET - 131)) | (1L << (SETTINGS - 131)) | (1L << (SHOW - 131)) | (1L << (SOURCE - 131)) | (1L << (START - 131)) | (1L << (STOP - 131)) | (1L << (SUBSTRING - 131)) | (1L << (SYNC - 131)) | (1L << (SYNTAX - 131)) | (1L << (SYSTEM - 131)) | (1L << (TABLE - 131)) | (1L << (TABLES - 131)) | (1L << (TEMPORARY - 131)) | (1L << (TEST - 131)) | (1L << (THEN - 131)) | (1L << (TIES - 131)) | (1L << (TIMEOUT - 131)) | (1L << (TIMESTAMP - 131)) | (1L << (TO - 131)) | (1L << (TOP - 131)) | (1L << (TOTALS - 131)) | (1L << (TRAILING - 131)) | (1L << (TRIM - 131)) | (1L << (TRUNCATE - 131)) | (1L << (TTL - 131)) | (1L << (TYPE - 131)) | (1L << (UNBOUNDED - 131)) | (1L << (UNION - 131)) | (1L << (UPDATE - 131)) | (1L << (USE - 131)) | (1L << (USING - 131)) | (1L << (UUID - 131)) | (1L << (VALUES - 131)) | (1L << (VIEW - 131)) | (1L << (VOLUME - 131)) | (1L << (WATCH - 131)) | (1L << (WEEK - 131)) | (1L << (WHEN - 131)) | (1L << (WHERE - 131)) | (1L << (WINDOW - 131)) | (1L << (WITH - 131)) | (1L << (YEAR - 131)) | (1L << (JSON_FALSE - 131)) | (1L << (JSON_TRUE - 131)) | (1L << (IDENTIFIER - 131)))) != 0)) {
					{
					setState(1612);
					tableIdentifier();
					setState(1613);
					match(DOT);
					}
				}

				setState(1617);
				match(ASTERISK);
				}
				break;
			case 2:
				_localctx = new ColumnsExprSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1618);
				match(LPAREN);
				setState(1619);
				selectUnionStmt();
				setState(1620);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new ColumnsExprColumnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1622);
				columnExpr(0);
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

	public static class ColumnExprContext extends ParserRuleContext {
		public ColumnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnExpr; }
	 
		public ColumnExprContext() { }
		public void copyFrom(ColumnExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnExprTernaryOpContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode QUERY() { return getToken(ClickHouseSQLParser.QUERY, 0); }
		public TerminalNode COLON() { return getToken(ClickHouseSQLParser.COLON, 0); }
		public ColumnExprTernaryOpContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprTernaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprTernaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprTernaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprAliasContext extends ColumnExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseSQLParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnExprAliasContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprAlias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprExtractContext extends ColumnExprContext {
		public TerminalNode EXTRACT() { return getToken(ClickHouseSQLParser.EXTRACT, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseSQLParser.FROM, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public ColumnExprExtractContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprNegateContext extends ColumnExprContext {
		public TerminalNode DASH() { return getToken(ClickHouseSQLParser.DASH, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnExprNegateContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprSubqueryContext extends ColumnExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public ColumnExprSubqueryContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprLiteralContext extends ColumnExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ColumnExprLiteralContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprArrayContext extends ColumnExprContext {
		public TerminalNode LBRACKET() { return getToken(ClickHouseSQLParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ClickHouseSQLParser.RBRACKET, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnExprArrayContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprSubstringContext extends ColumnExprContext {
		public TerminalNode SUBSTRING() { return getToken(ClickHouseSQLParser.SUBSTRING, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode FROM() { return getToken(ClickHouseSQLParser.FROM, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public TerminalNode FOR() { return getToken(ClickHouseSQLParser.FOR, 0); }
		public ColumnExprSubstringContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprCastContext extends ColumnExprContext {
		public TerminalNode CAST() { return getToken(ClickHouseSQLParser.CAST, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseSQLParser.AS, 0); }
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public ColumnExprCastContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprOrContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(ClickHouseSQLParser.OR, 0); }
		public ColumnExprOrContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprPrecedence1Context extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(ClickHouseSQLParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(ClickHouseSQLParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(ClickHouseSQLParser.PERCENT, 0); }
		public ColumnExprPrecedence1Context(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprPrecedence1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprPrecedence1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprPrecedence1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprPrecedence2Context extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ClickHouseSQLParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(ClickHouseSQLParser.DASH, 0); }
		public TerminalNode CONCAT() { return getToken(ClickHouseSQLParser.CONCAT, 0); }
		public ColumnExprPrecedence2Context(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprPrecedence2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprPrecedence2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprPrecedence2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprPrecedence3Context extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode EQ_DOUBLE() { return getToken(ClickHouseSQLParser.EQ_DOUBLE, 0); }
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseSQLParser.EQ_SINGLE, 0); }
		public TerminalNode NOT_EQ() { return getToken(ClickHouseSQLParser.NOT_EQ, 0); }
		public TerminalNode LE() { return getToken(ClickHouseSQLParser.LE, 0); }
		public TerminalNode GE() { return getToken(ClickHouseSQLParser.GE, 0); }
		public TerminalNode LT() { return getToken(ClickHouseSQLParser.LT, 0); }
		public TerminalNode GT() { return getToken(ClickHouseSQLParser.GT, 0); }
		public TerminalNode IN() { return getToken(ClickHouseSQLParser.IN, 0); }
		public TerminalNode LIKE() { return getToken(ClickHouseSQLParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(ClickHouseSQLParser.ILIKE, 0); }
		public TerminalNode GLOBAL() { return getToken(ClickHouseSQLParser.GLOBAL, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseSQLParser.NOT, 0); }
		public ColumnExprPrecedence3Context(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprPrecedence3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprPrecedence3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprPrecedence3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprIntervalContext extends ColumnExprContext {
		public TerminalNode INTERVAL() { return getToken(ClickHouseSQLParser.INTERVAL, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public ColumnExprIntervalContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprIsNullContext extends ColumnExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode IS() { return getToken(ClickHouseSQLParser.IS, 0); }
		public TerminalNode NULL_SQL() { return getToken(ClickHouseSQLParser.NULL_SQL, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseSQLParser.NOT, 0); }
		public ColumnExprIsNullContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprIsNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprIsNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprIsNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprWinFunctionTargetContext extends ColumnExprContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OVER() { return getToken(ClickHouseSQLParser.OVER, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnExprWinFunctionTargetContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprWinFunctionTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprWinFunctionTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprWinFunctionTarget(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprTrimContext extends ColumnExprContext {
		public TerminalNode TRIM() { return getToken(ClickHouseSQLParser.TRIM, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseSQLParser.STRING_LITERAL, 0); }
		public TerminalNode FROM() { return getToken(ClickHouseSQLParser.FROM, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public TerminalNode BOTH() { return getToken(ClickHouseSQLParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(ClickHouseSQLParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(ClickHouseSQLParser.TRAILING, 0); }
		public ColumnExprTrimContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprTrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprTrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprTrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprTupleContext extends ColumnExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public ColumnExprTupleContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprArrayAccessContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(ClickHouseSQLParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ClickHouseSQLParser.RBRACKET, 0); }
		public ColumnExprArrayAccessContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprBetweenContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(ClickHouseSQLParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(ClickHouseSQLParser.AND, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseSQLParser.NOT, 0); }
		public ColumnExprBetweenContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprBetween(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprParensContext extends ColumnExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public ColumnExprParensContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprTimestampContext extends ColumnExprContext {
		public TerminalNode TIMESTAMP() { return getToken(ClickHouseSQLParser.TIMESTAMP, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseSQLParser.STRING_LITERAL, 0); }
		public ColumnExprTimestampContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprTimestamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprTimestamp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprTimestamp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprAndContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(ClickHouseSQLParser.AND, 0); }
		public ColumnExprAndContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprTupleAccessContext extends ColumnExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseSQLParser.DOT, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseSQLParser.DECIMAL_LITERAL, 0); }
		public ColumnExprTupleAccessContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprTupleAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprTupleAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprTupleAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprCaseContext extends ColumnExprContext {
		public TerminalNode CASE() { return getToken(ClickHouseSQLParser.CASE, 0); }
		public TerminalNode END() { return getToken(ClickHouseSQLParser.END, 0); }
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public List<TerminalNode> WHEN() { return getTokens(ClickHouseSQLParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(ClickHouseSQLParser.WHEN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(ClickHouseSQLParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(ClickHouseSQLParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(ClickHouseSQLParser.ELSE, 0); }
		public ColumnExprCaseContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprDateContext extends ColumnExprContext {
		public TerminalNode DATE() { return getToken(ClickHouseSQLParser.DATE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseSQLParser.STRING_LITERAL, 0); }
		public ColumnExprDateContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprDate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprNotContext extends ColumnExprContext {
		public TerminalNode NOT() { return getToken(ClickHouseSQLParser.NOT, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnExprNotContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprWinFunctionContext extends ColumnExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OVER() { return getToken(ClickHouseSQLParser.OVER, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseSQLParser.LPAREN, i);
		}
		public WindowExprContext windowExpr() {
			return getRuleContext(WindowExprContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseSQLParser.RPAREN, i);
		}
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnExprWinFunctionContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprWinFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprWinFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprWinFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprIdentifierContext extends ColumnExprContext {
		public ColumnIdentifierContext columnIdentifier() {
			return getRuleContext(ColumnIdentifierContext.class,0);
		}
		public ColumnExprIdentifierContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprFunctionContext extends ColumnExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseSQLParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseSQLParser.RPAREN, i);
		}
		public TerminalNode DISTINCT() { return getToken(ClickHouseSQLParser.DISTINCT, 0); }
		public ColumnArgListContext columnArgList() {
			return getRuleContext(ColumnArgListContext.class,0);
		}
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnExprFunctionContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprAsteriskContext extends ColumnExprContext {
		public TerminalNode ASTERISK() { return getToken(ClickHouseSQLParser.ASTERISK, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseSQLParser.DOT, 0); }
		public ColumnExprAsteriskContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnExprAsterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnExprAsterisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnExprAsterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnExprContext columnExpr() throws RecognitionException {
		return columnExpr(0);
	}

	private ColumnExprContext columnExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ColumnExprContext _localctx = new ColumnExprContext(_ctx, _parentState);
		ColumnExprContext _prevctx = _localctx;
		int _startState = 188;
		enterRecursionRule(_localctx, 188, RULE_columnExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				_localctx = new ColumnExprCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1626);
				match(CASE);
				setState(1628);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(1627);
					columnExpr(0);
					}
					break;
				}
				setState(1635); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1630);
					match(WHEN);
					setState(1631);
					columnExpr(0);
					setState(1632);
					match(THEN);
					setState(1633);
					columnExpr(0);
					}
					}
					setState(1637); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1639);
					match(ELSE);
					setState(1640);
					columnExpr(0);
					}
				}

				setState(1643);
				match(END);
				}
				break;
			case 2:
				{
				_localctx = new ColumnExprCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1645);
				match(CAST);
				setState(1646);
				match(LPAREN);
				setState(1647);
				columnExpr(0);
				setState(1648);
				match(AS);
				setState(1649);
				columnTypeExpr();
				setState(1650);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new ColumnExprDateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1652);
				match(DATE);
				setState(1653);
				match(STRING_LITERAL);
				}
				break;
			case 4:
				{
				_localctx = new ColumnExprExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1654);
				match(EXTRACT);
				setState(1655);
				match(LPAREN);
				setState(1656);
				interval();
				setState(1657);
				match(FROM);
				setState(1658);
				columnExpr(0);
				setState(1659);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new ColumnExprIntervalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1661);
				match(INTERVAL);
				setState(1662);
				columnExpr(0);
				setState(1663);
				interval();
				}
				break;
			case 6:
				{
				_localctx = new ColumnExprSubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1665);
				match(SUBSTRING);
				setState(1666);
				match(LPAREN);
				setState(1667);
				columnExpr(0);
				setState(1668);
				match(FROM);
				setState(1669);
				columnExpr(0);
				setState(1672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1670);
					match(FOR);
					setState(1671);
					columnExpr(0);
					}
				}

				setState(1674);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new ColumnExprTimestampContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1676);
				match(TIMESTAMP);
				setState(1677);
				match(STRING_LITERAL);
				}
				break;
			case 8:
				{
				_localctx = new ColumnExprTrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1678);
				match(TRIM);
				setState(1679);
				match(LPAREN);
				setState(1680);
				_la = _input.LA(1);
				if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1681);
				match(STRING_LITERAL);
				setState(1682);
				match(FROM);
				setState(1683);
				columnExpr(0);
				setState(1684);
				match(RPAREN);
				}
				break;
			case 9:
				{
				_localctx = new ColumnExprWinFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1686);
				identifier();
				{
				setState(1687);
				match(LPAREN);
				setState(1689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
					{
					setState(1688);
					columnExprList();
					}
				}

				setState(1691);
				match(RPAREN);
				}
				setState(1693);
				match(OVER);
				setState(1694);
				match(LPAREN);
				setState(1695);
				windowExpr();
				setState(1696);
				match(RPAREN);
				}
				break;
			case 10:
				{
				_localctx = new ColumnExprWinFunctionTargetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1698);
				identifier();
				{
				setState(1699);
				match(LPAREN);
				setState(1701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
					{
					setState(1700);
					columnExprList();
					}
				}

				setState(1703);
				match(RPAREN);
				}
				setState(1705);
				match(OVER);
				setState(1706);
				identifier();
				}
				break;
			case 11:
				{
				_localctx = new ColumnExprFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1708);
				identifier();
				setState(1714);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1709);
					match(LPAREN);
					setState(1711);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
						{
						setState(1710);
						columnExprList();
						}
					}

					setState(1713);
					match(RPAREN);
					}
					break;
				}
				setState(1716);
				match(LPAREN);
				setState(1718);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1717);
					match(DISTINCT);
					}
					break;
				}
				setState(1721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
					{
					setState(1720);
					columnArgList();
					}
				}

				setState(1723);
				match(RPAREN);
				}
				break;
			case 12:
				{
				_localctx = new ColumnExprLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1725);
				literal();
				}
				break;
			case 13:
				{
				_localctx = new ColumnExprNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1726);
				match(DASH);
				setState(1727);
				columnExpr(17);
				}
				break;
			case 14:
				{
				_localctx = new ColumnExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1728);
				match(NOT);
				setState(1729);
				columnExpr(12);
				}
				break;
			case 15:
				{
				_localctx = new ColumnExprAsteriskContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AFTER - 2)) | (1L << (ALIAS - 2)) | (1L << (ALL - 2)) | (1L << (ALTER - 2)) | (1L << (AND - 2)) | (1L << (ANTI - 2)) | (1L << (ANY - 2)) | (1L << (ARRAY - 2)) | (1L << (AS - 2)) | (1L << (ASCENDING - 2)) | (1L << (ASOF - 2)) | (1L << (AST - 2)) | (1L << (ASYNC - 2)) | (1L << (ATTACH - 2)) | (1L << (BETWEEN - 2)) | (1L << (BOTH - 2)) | (1L << (BY - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CHECK - 2)) | (1L << (CLEAR - 2)) | (1L << (CLUSTER - 2)) | (1L << (CODEC - 2)) | (1L << (COLLATE - 2)) | (1L << (COLUMN - 2)) | (1L << (COMMENT - 2)) | (1L << (CONSTRAINT - 2)) | (1L << (CREATE - 2)) | (1L << (CROSS - 2)) | (1L << (CUBE - 2)) | (1L << (CURRENT - 2)) | (1L << (DATABASE - 2)) | (1L << (DATABASES - 2)) | (1L << (DATE - 2)) | (1L << (DAY - 2)) | (1L << (DEDUPLICATE - 2)) | (1L << (DEFAULT - 2)) | (1L << (DELAY - 2)) | (1L << (DELETE - 2)) | (1L << (DESC - 2)) | (1L << (DESCENDING - 2)) | (1L << (DESCRIBE - 2)) | (1L << (DETACH - 2)) | (1L << (DICTIONARIES - 2)) | (1L << (DICTIONARY - 2)) | (1L << (DISK - 2)) | (1L << (DISTINCT - 2)) | (1L << (DISTRIBUTED - 2)) | (1L << (DROP - 2)) | (1L << (ELSE - 2)) | (1L << (END - 2)) | (1L << (ENGINE - 2)) | (1L << (EVENTS - 2)) | (1L << (EXISTS - 2)) | (1L << (EXPLAIN - 2)) | (1L << (EXPRESSION - 2)) | (1L << (EXTRACT - 2)) | (1L << (FETCHES - 2)) | (1L << (FINAL - 2)) | (1L << (FIRST - 2)) | (1L << (FLUSH - 2)) | (1L << (FOLLOWING - 2)) | (1L << (FOR - 2)) | (1L << (FORMAT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FREEZE - 66)) | (1L << (FROM - 66)) | (1L << (FULL - 66)) | (1L << (FUNCTION - 66)) | (1L << (GLOBAL - 66)) | (1L << (GRANULARITY - 66)) | (1L << (GROUP - 66)) | (1L << (HAVING - 66)) | (1L << (HIERARCHICAL - 66)) | (1L << (HOUR - 66)) | (1L << (ID - 66)) | (1L << (IF - 66)) | (1L << (ILIKE - 66)) | (1L << (IN - 66)) | (1L << (INDEX - 66)) | (1L << (INJECTIVE - 66)) | (1L << (INNER - 66)) | (1L << (INSERT - 66)) | (1L << (INTERVAL - 66)) | (1L << (INTO - 66)) | (1L << (IS - 66)) | (1L << (IS_OBJECT_ID - 66)) | (1L << (JOIN - 66)) | (1L << (KEY - 66)) | (1L << (KILL - 66)) | (1L << (LAST - 66)) | (1L << (LAYOUT - 66)) | (1L << (LEADING - 66)) | (1L << (LEFT - 66)) | (1L << (LIFETIME - 66)) | (1L << (LIKE - 66)) | (1L << (LIMIT - 66)) | (1L << (LIVE - 66)) | (1L << (LOCAL - 66)) | (1L << (LOGS - 66)) | (1L << (MATERIALIZE - 66)) | (1L << (MATERIALIZED - 66)) | (1L << (MAX - 66)) | (1L << (MERGES - 66)) | (1L << (MIN - 66)) | (1L << (MINUTE - 66)) | (1L << (MODIFY - 66)) | (1L << (MONTH - 66)) | (1L << (MOVE - 66)) | (1L << (MUTATION - 66)) | (1L << (NO - 66)) | (1L << (NOT - 66)) | (1L << (NULLS - 66)) | (1L << (OFFSET - 66)) | (1L << (ON - 66)) | (1L << (OPTIMIZE - 66)) | (1L << (OR - 66)) | (1L << (ORDER - 66)) | (1L << (OUTER - 66)) | (1L << (OUTFILE - 66)) | (1L << (OVER - 66)) | (1L << (PARTITION - 66)) | (1L << (POPULATE - 66)) | (1L << (PRECEDING - 66)) | (1L << (PREWHERE - 66)) | (1L << (PRIMARY - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (QUARTER - 131)) | (1L << (RANGE - 131)) | (1L << (RELOAD - 131)) | (1L << (REMOVE - 131)) | (1L << (RENAME - 131)) | (1L << (REPLACE - 131)) | (1L << (REPLICA - 131)) | (1L << (REPLICATED - 131)) | (1L << (RIGHT - 131)) | (1L << (ROLLUP - 131)) | (1L << (ROW - 131)) | (1L << (ROWS - 131)) | (1L << (SAMPLE - 131)) | (1L << (SECOND - 131)) | (1L << (SELECT - 131)) | (1L << (SEMI - 131)) | (1L << (SENDS - 131)) | (1L << (SET - 131)) | (1L << (SETTINGS - 131)) | (1L << (SHOW - 131)) | (1L << (SOURCE - 131)) | (1L << (START - 131)) | (1L << (STOP - 131)) | (1L << (SUBSTRING - 131)) | (1L << (SYNC - 131)) | (1L << (SYNTAX - 131)) | (1L << (SYSTEM - 131)) | (1L << (TABLE - 131)) | (1L << (TABLES - 131)) | (1L << (TEMPORARY - 131)) | (1L << (TEST - 131)) | (1L << (THEN - 131)) | (1L << (TIES - 131)) | (1L << (TIMEOUT - 131)) | (1L << (TIMESTAMP - 131)) | (1L << (TO - 131)) | (1L << (TOP - 131)) | (1L << (TOTALS - 131)) | (1L << (TRAILING - 131)) | (1L << (TRIM - 131)) | (1L << (TRUNCATE - 131)) | (1L << (TTL - 131)) | (1L << (TYPE - 131)) | (1L << (UNBOUNDED - 131)) | (1L << (UNION - 131)) | (1L << (UPDATE - 131)) | (1L << (USE - 131)) | (1L << (USING - 131)) | (1L << (UUID - 131)) | (1L << (VALUES - 131)) | (1L << (VIEW - 131)) | (1L << (VOLUME - 131)) | (1L << (WATCH - 131)) | (1L << (WEEK - 131)) | (1L << (WHEN - 131)) | (1L << (WHERE - 131)) | (1L << (WINDOW - 131)) | (1L << (WITH - 131)) | (1L << (YEAR - 131)) | (1L << (JSON_FALSE - 131)) | (1L << (JSON_TRUE - 131)) | (1L << (IDENTIFIER - 131)))) != 0)) {
					{
					setState(1730);
					tableIdentifier();
					setState(1731);
					match(DOT);
					}
				}

				setState(1735);
				match(ASTERISK);
				}
				break;
			case 16:
				{
				_localctx = new ColumnExprSubqueryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1736);
				match(LPAREN);
				setState(1737);
				selectUnionStmt();
				setState(1738);
				match(RPAREN);
				}
				break;
			case 17:
				{
				_localctx = new ColumnExprParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1740);
				match(LPAREN);
				setState(1741);
				columnExpr(0);
				setState(1742);
				match(RPAREN);
				}
				break;
			case 18:
				{
				_localctx = new ColumnExprTupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1744);
				match(LPAREN);
				setState(1745);
				columnExprList();
				setState(1746);
				match(RPAREN);
				}
				break;
			case 19:
				{
				_localctx = new ColumnExprArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1748);
				match(LBRACKET);
				setState(1750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
					{
					setState(1749);
					columnExprList();
					}
				}

				setState(1752);
				match(RBRACKET);
				}
				break;
			case 20:
				{
				_localctx = new ColumnExprIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1753);
				columnIdentifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1827);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1825);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
					case 1:
						{
						_localctx = new ColumnExprPrecedence1Context(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1756);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1757);
						_la = _input.LA(1);
						if ( !(((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (ASTERISK - 199)) | (1L << (PERCENT - 199)) | (1L << (SLASH - 199)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1758);
						columnExpr(17);
						}
						break;
					case 2:
						{
						_localctx = new ColumnExprPrecedence2Context(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1759);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1760);
						_la = _input.LA(1);
						if ( !(((((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & ((1L << (CONCAT - 204)) | (1L << (DASH - 204)) | (1L << (PLUS - 204)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1761);
						columnExpr(16);
						}
						break;
					case 3:
						{
						_localctx = new ColumnExprPrecedence3Context(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1762);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1781);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
						case 1:
							{
							setState(1763);
							match(EQ_DOUBLE);
							}
							break;
						case 2:
							{
							setState(1764);
							match(EQ_SINGLE);
							}
							break;
						case 3:
							{
							setState(1765);
							match(NOT_EQ);
							}
							break;
						case 4:
							{
							setState(1766);
							match(LE);
							}
							break;
						case 5:
							{
							setState(1767);
							match(GE);
							}
							break;
						case 6:
							{
							setState(1768);
							match(LT);
							}
							break;
						case 7:
							{
							setState(1769);
							match(GT);
							}
							break;
						case 8:
							{
							setState(1771);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==GLOBAL) {
								{
								setState(1770);
								match(GLOBAL);
								}
							}

							setState(1774);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NOT) {
								{
								setState(1773);
								match(NOT);
								}
							}

							setState(1776);
							match(IN);
							}
							break;
						case 9:
							{
							setState(1778);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NOT) {
								{
								setState(1777);
								match(NOT);
								}
							}

							setState(1780);
							_la = _input.LA(1);
							if ( !(_la==ILIKE || _la==LIKE) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						}
						setState(1783);
						columnExpr(15);
						}
						break;
					case 4:
						{
						_localctx = new ColumnExprAndContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1784);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1785);
						match(AND);
						setState(1786);
						columnExpr(12);
						}
						break;
					case 5:
						{
						_localctx = new ColumnExprOrContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1787);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1788);
						match(OR);
						setState(1789);
						columnExpr(11);
						}
						break;
					case 6:
						{
						_localctx = new ColumnExprBetweenContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1790);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1792);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1791);
							match(NOT);
							}
						}

						setState(1794);
						match(BETWEEN);
						setState(1795);
						columnExpr(0);
						setState(1796);
						match(AND);
						setState(1797);
						columnExpr(10);
						}
						break;
					case 7:
						{
						_localctx = new ColumnExprTernaryOpContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1799);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1800);
						match(QUERY);
						setState(1801);
						columnExpr(0);
						setState(1802);
						match(COLON);
						setState(1803);
						columnExpr(8);
						}
						break;
					case 8:
						{
						_localctx = new ColumnExprArrayAccessContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1805);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1806);
						match(LBRACKET);
						setState(1807);
						columnExpr(0);
						setState(1808);
						match(RBRACKET);
						}
						break;
					case 9:
						{
						_localctx = new ColumnExprTupleAccessContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1810);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1811);
						match(DOT);
						setState(1812);
						match(DECIMAL_LITERAL);
						}
						break;
					case 10:
						{
						_localctx = new ColumnExprIsNullContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1813);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1814);
						match(IS);
						setState(1816);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1815);
							match(NOT);
							}
						}

						setState(1818);
						match(NULL_SQL);
						}
						break;
					case 11:
						{
						_localctx = new ColumnExprAliasContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1819);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1823);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DATE:
						case FIRST:
						case ID:
						case KEY:
						case IDENTIFIER:
							{
							setState(1820);
							alias();
							}
							break;
						case AS:
							{
							setState(1821);
							match(AS);
							setState(1822);
							identifier();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(1829);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
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

	public static class ColumnArgListContext extends ParserRuleContext {
		public List<ColumnArgExprContext> columnArgExpr() {
			return getRuleContexts(ColumnArgExprContext.class);
		}
		public ColumnArgExprContext columnArgExpr(int i) {
			return getRuleContext(ColumnArgExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseSQLParser.COMMA, i);
		}
		public ColumnArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnArgListContext columnArgList() throws RecognitionException {
		ColumnArgListContext _localctx = new ColumnArgListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_columnArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			columnArgExpr();
			setState(1835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1831);
				match(COMMA);
				setState(1832);
				columnArgExpr();
				}
				}
				setState(1837);
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

	public static class ColumnArgExprContext extends ParserRuleContext {
		public ColumnLambdaExprContext columnLambdaExpr() {
			return getRuleContext(ColumnLambdaExprContext.class,0);
		}
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnArgExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnArgExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnArgExprContext columnArgExpr() throws RecognitionException {
		ColumnArgExprContext _localctx = new ColumnArgExprContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_columnArgExpr);
		try {
			setState(1840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1838);
				columnLambdaExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1839);
				columnExpr(0);
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

	public static class ColumnLambdaExprContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(ClickHouseSQLParser.ARROW, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseSQLParser.COMMA, i);
		}
		public ColumnLambdaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnLambdaExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnLambdaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnLambdaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnLambdaExprContext columnLambdaExpr() throws RecognitionException {
		ColumnLambdaExprContext _localctx = new ColumnLambdaExprContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_columnLambdaExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1861);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1842);
				match(LPAREN);
				setState(1843);
				identifier();
				setState(1848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1844);
					match(COMMA);
					setState(1845);
					identifier();
					}
					}
					setState(1850);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1851);
				match(RPAREN);
				}
				break;
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case AST:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case CURRENT:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DAY:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOLLOWING:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case HOUR:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZE:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case OVER:
			case PARTITION:
			case POPULATE:
			case PRECEDING:
			case PREWHERE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case ROW:
			case ROWS:
			case SAMPLE:
			case SECOND:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNBOUNDED:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WEEK:
			case WHEN:
			case WHERE:
			case WINDOW:
			case WITH:
			case YEAR:
			case JSON_FALSE:
			case JSON_TRUE:
			case IDENTIFIER:
				{
				setState(1853);
				identifier();
				setState(1858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1854);
					match(COMMA);
					setState(1855);
					identifier();
					}
					}
					setState(1860);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1863);
			match(ARROW);
			setState(1864);
			columnExpr(0);
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

	public static class ColumnIdentifierContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseSQLParser.DOT, 0); }
		public ColumnIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterColumnIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitColumnIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitColumnIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnIdentifierContext columnIdentifier() throws RecognitionException {
		ColumnIdentifierContext _localctx = new ColumnIdentifierContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_columnIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(1866);
				tableIdentifier();
				setState(1867);
				match(DOT);
				}
				break;
			}
			setState(1871);
			nestedIdentifier();
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

	public static class NestedIdentifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(ClickHouseSQLParser.DOT, 0); }
		public NestedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterNestedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitNestedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitNestedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedIdentifierContext nestedIdentifier() throws RecognitionException {
		NestedIdentifierContext _localctx = new NestedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_nestedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1873);
			identifier();
			setState(1876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(1874);
				match(DOT);
				setState(1875);
				identifier();
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

	public static class TableExprContext extends ParserRuleContext {
		public TableExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExpr; }
	 
		public TableExprContext() { }
		public void copyFrom(TableExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableExprIdentifierContext extends TableExprContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableExprIdentifierContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTableExprIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTableExprIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTableExprIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableExprSubqueryContext extends TableExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public TableExprSubqueryContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTableExprSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTableExprSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTableExprSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableExprAliasContext extends TableExprContext {
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseSQLParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableExprAliasContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTableExprAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTableExprAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTableExprAlias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableExprFunctionContext extends TableExprContext {
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public TableExprFunctionContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTableExprFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTableExprFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTableExprFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableExprContext tableExpr() throws RecognitionException {
		return tableExpr(0);
	}

	private TableExprContext tableExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TableExprContext _localctx = new TableExprContext(_ctx, _parentState);
		TableExprContext _prevctx = _localctx;
		int _startState = 200;
		enterRecursionRule(_localctx, 200, RULE_tableExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				_localctx = new TableExprIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1879);
				tableIdentifier();
				}
				break;
			case 2:
				{
				_localctx = new TableExprFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1880);
				tableFunctionExpr();
				}
				break;
			case 3:
				{
				_localctx = new TableExprSubqueryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1881);
				match(LPAREN);
				setState(1882);
				selectUnionStmt();
				setState(1883);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1895);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TableExprAliasContext(new TableExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_tableExpr);
					setState(1887);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1891);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DATE:
					case FIRST:
					case ID:
					case KEY:
					case IDENTIFIER:
						{
						setState(1888);
						alias();
						}
						break;
					case AS:
						{
						setState(1889);
						match(AS);
						setState(1890);
						identifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1897);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
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

	public static class TableFunctionExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseSQLParser.RPAREN, 0); }
		public TableArgListContext tableArgList() {
			return getRuleContext(TableArgListContext.class,0);
		}
		public TableFunctionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFunctionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTableFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTableFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTableFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFunctionExprContext tableFunctionExpr() throws RecognitionException {
		TableFunctionExprContext _localctx = new TableFunctionExprContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_tableFunctionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1898);
			identifier();
			setState(1899);
			match(LPAREN);
			setState(1901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (PLUS - 192)))) != 0)) {
				{
				setState(1900);
				tableArgList();
				}
			}

			setState(1903);
			match(RPAREN);
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

	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseSQLParser.DOT, 0); }
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(1905);
				databaseIdentifier();
				setState(1906);
				match(DOT);
				}
				break;
			}
			setState(1910);
			identifier();
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

	public static class TableArgListContext extends ParserRuleContext {
		public List<TableArgExprContext> tableArgExpr() {
			return getRuleContexts(TableArgExprContext.class);
		}
		public TableArgExprContext tableArgExpr(int i) {
			return getRuleContext(TableArgExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseSQLParser.COMMA, i);
		}
		public TableArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTableArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTableArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTableArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableArgListContext tableArgList() throws RecognitionException {
		TableArgListContext _localctx = new TableArgListContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_tableArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1912);
			tableArgExpr();
			setState(1917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1913);
				match(COMMA);
				setState(1914);
				tableArgExpr();
				}
				}
				setState(1919);
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

	public static class TableArgExprContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TableArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableArgExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterTableArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitTableArgExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitTableArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableArgExprContext tableArgExpr() throws RecognitionException {
		TableArgExprContext _localctx = new TableArgExprContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_tableArgExpr);
		try {
			setState(1923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1920);
				nestedIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1921);
				tableFunctionExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1922);
				literal();
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

	public static class DatabaseIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DatabaseIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterDatabaseIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitDatabaseIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitDatabaseIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseIdentifierContext databaseIdentifier() throws RecognitionException {
		DatabaseIdentifierContext _localctx = new DatabaseIdentifierContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_databaseIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			identifier();
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

	public static class FloatingLiteralContext extends ParserRuleContext {
		public TerminalNode FLOATING_LITERAL() { return getToken(ClickHouseSQLParser.FLOATING_LITERAL, 0); }
		public TerminalNode DOT() { return getToken(ClickHouseSQLParser.DOT, 0); }
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(ClickHouseSQLParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(ClickHouseSQLParser.DECIMAL_LITERAL, i);
		}
		public TerminalNode OCTAL_LITERAL() { return getToken(ClickHouseSQLParser.OCTAL_LITERAL, 0); }
		public FloatingLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterFloatingLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitFloatingLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitFloatingLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingLiteralContext floatingLiteral() throws RecognitionException {
		FloatingLiteralContext _localctx = new FloatingLiteralContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_floatingLiteral);
		int _la;
		try {
			setState(1935);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOATING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1927);
				match(FLOATING_LITERAL);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1928);
				match(DOT);
				setState(1929);
				_la = _input.LA(1);
				if ( !(_la==OCTAL_LITERAL || _la==DECIMAL_LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1930);
				match(DECIMAL_LITERAL);
				setState(1931);
				match(DOT);
				setState(1933);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(1932);
					_la = _input.LA(1);
					if ( !(_la==OCTAL_LITERAL || _la==DECIMAL_LITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
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

	public static class NumberLiteralContext extends ParserRuleContext {
		public FloatingLiteralContext floatingLiteral() {
			return getRuleContext(FloatingLiteralContext.class,0);
		}
		public TerminalNode OCTAL_LITERAL() { return getToken(ClickHouseSQLParser.OCTAL_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseSQLParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEXADECIMAL_LITERAL() { return getToken(ClickHouseSQLParser.HEXADECIMAL_LITERAL, 0); }
		public TerminalNode INF() { return getToken(ClickHouseSQLParser.INF, 0); }
		public TerminalNode NAN_SQL() { return getToken(ClickHouseSQLParser.NAN_SQL, 0); }
		public TerminalNode PLUS() { return getToken(ClickHouseSQLParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(ClickHouseSQLParser.DASH, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DASH || _la==PLUS) {
				{
				setState(1937);
				_la = _input.LA(1);
				if ( !(_la==DASH || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				{
				setState(1940);
				floatingLiteral();
				}
				break;
			case 2:
				{
				setState(1941);
				match(OCTAL_LITERAL);
				}
				break;
			case 3:
				{
				setState(1942);
				match(DECIMAL_LITERAL);
				}
				break;
			case 4:
				{
				setState(1943);
				match(HEXADECIMAL_LITERAL);
				}
				break;
			case 5:
				{
				setState(1944);
				match(INF);
				}
				break;
			case 6:
				{
				setState(1945);
				match(NAN_SQL);
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

	public static class LiteralContext extends ParserRuleContext {
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseSQLParser.STRING_LITERAL, 0); }
		public TerminalNode NULL_SQL() { return getToken(ClickHouseSQLParser.NULL_SQL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_literal);
		try {
			setState(1951);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INF:
			case NAN_SQL:
			case FLOATING_LITERAL:
			case OCTAL_LITERAL:
			case DECIMAL_LITERAL:
			case HEXADECIMAL_LITERAL:
			case DASH:
			case DOT:
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1948);
				numberLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1949);
				match(STRING_LITERAL);
				}
				break;
			case NULL_SQL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1950);
				match(NULL_SQL);
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

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode SECOND() { return getToken(ClickHouseSQLParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(ClickHouseSQLParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(ClickHouseSQLParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(ClickHouseSQLParser.DAY, 0); }
		public TerminalNode WEEK() { return getToken(ClickHouseSQLParser.WEEK, 0); }
		public TerminalNode MONTH() { return getToken(ClickHouseSQLParser.MONTH, 0); }
		public TerminalNode QUARTER() { return getToken(ClickHouseSQLParser.QUARTER, 0); }
		public TerminalNode YEAR() { return getToken(ClickHouseSQLParser.YEAR, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1953);
			_la = _input.LA(1);
			if ( !(_la==DAY || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (HOUR - 75)) | (1L << (MINUTE - 75)) | (1L << (MONTH - 75)) | (1L << (QUARTER - 75)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (SECOND - 144)) | (1L << (WEEK - 144)) | (1L << (YEAR - 144)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode AFTER() { return getToken(ClickHouseSQLParser.AFTER, 0); }
		public TerminalNode ALIAS() { return getToken(ClickHouseSQLParser.ALIAS, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseSQLParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(ClickHouseSQLParser.ALTER, 0); }
		public TerminalNode AND() { return getToken(ClickHouseSQLParser.AND, 0); }
		public TerminalNode ANTI() { return getToken(ClickHouseSQLParser.ANTI, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseSQLParser.ANY, 0); }
		public TerminalNode ARRAY() { return getToken(ClickHouseSQLParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(ClickHouseSQLParser.AS, 0); }
		public TerminalNode ASCENDING() { return getToken(ClickHouseSQLParser.ASCENDING, 0); }
		public TerminalNode ASOF() { return getToken(ClickHouseSQLParser.ASOF, 0); }
		public TerminalNode AST() { return getToken(ClickHouseSQLParser.AST, 0); }
		public TerminalNode ASYNC() { return getToken(ClickHouseSQLParser.ASYNC, 0); }
		public TerminalNode ATTACH() { return getToken(ClickHouseSQLParser.ATTACH, 0); }
		public TerminalNode BETWEEN() { return getToken(ClickHouseSQLParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(ClickHouseSQLParser.BOTH, 0); }
		public TerminalNode BY() { return getToken(ClickHouseSQLParser.BY, 0); }
		public TerminalNode CASE() { return getToken(ClickHouseSQLParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(ClickHouseSQLParser.CAST, 0); }
		public TerminalNode CHECK() { return getToken(ClickHouseSQLParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(ClickHouseSQLParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(ClickHouseSQLParser.CLUSTER, 0); }
		public TerminalNode CODEC() { return getToken(ClickHouseSQLParser.CODEC, 0); }
		public TerminalNode COLLATE() { return getToken(ClickHouseSQLParser.COLLATE, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseSQLParser.COLUMN, 0); }
		public TerminalNode COMMENT() { return getToken(ClickHouseSQLParser.COMMENT, 0); }
		public TerminalNode CONSTRAINT() { return getToken(ClickHouseSQLParser.CONSTRAINT, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseSQLParser.CREATE, 0); }
		public TerminalNode CROSS() { return getToken(ClickHouseSQLParser.CROSS, 0); }
		public TerminalNode CUBE() { return getToken(ClickHouseSQLParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(ClickHouseSQLParser.CURRENT, 0); }
		public TerminalNode DATABASE() { return getToken(ClickHouseSQLParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(ClickHouseSQLParser.DATABASES, 0); }
		public TerminalNode DATE() { return getToken(ClickHouseSQLParser.DATE, 0); }
		public TerminalNode DEDUPLICATE() { return getToken(ClickHouseSQLParser.DEDUPLICATE, 0); }
		public TerminalNode DEFAULT() { return getToken(ClickHouseSQLParser.DEFAULT, 0); }
		public TerminalNode DELAY() { return getToken(ClickHouseSQLParser.DELAY, 0); }
		public TerminalNode DELETE() { return getToken(ClickHouseSQLParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(ClickHouseSQLParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(ClickHouseSQLParser.DESC, 0); }
		public TerminalNode DESCENDING() { return getToken(ClickHouseSQLParser.DESCENDING, 0); }
		public TerminalNode DETACH() { return getToken(ClickHouseSQLParser.DETACH, 0); }
		public TerminalNode DICTIONARIES() { return getToken(ClickHouseSQLParser.DICTIONARIES, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseSQLParser.DICTIONARY, 0); }
		public TerminalNode DISK() { return getToken(ClickHouseSQLParser.DISK, 0); }
		public TerminalNode DISTINCT() { return getToken(ClickHouseSQLParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(ClickHouseSQLParser.DISTRIBUTED, 0); }
		public TerminalNode DROP() { return getToken(ClickHouseSQLParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(ClickHouseSQLParser.ELSE, 0); }
		public TerminalNode END() { return getToken(ClickHouseSQLParser.END, 0); }
		public TerminalNode ENGINE() { return getToken(ClickHouseSQLParser.ENGINE, 0); }
		public TerminalNode EVENTS() { return getToken(ClickHouseSQLParser.EVENTS, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseSQLParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(ClickHouseSQLParser.EXPLAIN, 0); }
		public TerminalNode EXPRESSION() { return getToken(ClickHouseSQLParser.EXPRESSION, 0); }
		public TerminalNode EXTRACT() { return getToken(ClickHouseSQLParser.EXTRACT, 0); }
		public TerminalNode FETCHES() { return getToken(ClickHouseSQLParser.FETCHES, 0); }
		public TerminalNode FINAL() { return getToken(ClickHouseSQLParser.FINAL, 0); }
		public TerminalNode FIRST() { return getToken(ClickHouseSQLParser.FIRST, 0); }
		public TerminalNode FLUSH() { return getToken(ClickHouseSQLParser.FLUSH, 0); }
		public TerminalNode FOR() { return getToken(ClickHouseSQLParser.FOR, 0); }
		public TerminalNode FOLLOWING() { return getToken(ClickHouseSQLParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(ClickHouseSQLParser.FORMAT, 0); }
		public TerminalNode FREEZE() { return getToken(ClickHouseSQLParser.FREEZE, 0); }
		public TerminalNode FROM() { return getToken(ClickHouseSQLParser.FROM, 0); }
		public TerminalNode FULL() { return getToken(ClickHouseSQLParser.FULL, 0); }
		public TerminalNode FUNCTION() { return getToken(ClickHouseSQLParser.FUNCTION, 0); }
		public TerminalNode GLOBAL() { return getToken(ClickHouseSQLParser.GLOBAL, 0); }
		public TerminalNode GRANULARITY() { return getToken(ClickHouseSQLParser.GRANULARITY, 0); }
		public TerminalNode GROUP() { return getToken(ClickHouseSQLParser.GROUP, 0); }
		public TerminalNode HAVING() { return getToken(ClickHouseSQLParser.HAVING, 0); }
		public TerminalNode HIERARCHICAL() { return getToken(ClickHouseSQLParser.HIERARCHICAL, 0); }
		public TerminalNode ID() { return getToken(ClickHouseSQLParser.ID, 0); }
		public TerminalNode IF() { return getToken(ClickHouseSQLParser.IF, 0); }
		public TerminalNode ILIKE() { return getToken(ClickHouseSQLParser.ILIKE, 0); }
		public TerminalNode IN() { return getToken(ClickHouseSQLParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseSQLParser.INDEX, 0); }
		public TerminalNode INJECTIVE() { return getToken(ClickHouseSQLParser.INJECTIVE, 0); }
		public TerminalNode INNER() { return getToken(ClickHouseSQLParser.INNER, 0); }
		public TerminalNode INSERT() { return getToken(ClickHouseSQLParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(ClickHouseSQLParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(ClickHouseSQLParser.INTO, 0); }
		public TerminalNode IS() { return getToken(ClickHouseSQLParser.IS, 0); }
		public TerminalNode IS_OBJECT_ID() { return getToken(ClickHouseSQLParser.IS_OBJECT_ID, 0); }
		public TerminalNode JOIN() { return getToken(ClickHouseSQLParser.JOIN, 0); }
		public TerminalNode JSON_FALSE() { return getToken(ClickHouseSQLParser.JSON_FALSE, 0); }
		public TerminalNode JSON_TRUE() { return getToken(ClickHouseSQLParser.JSON_TRUE, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseSQLParser.KEY, 0); }
		public TerminalNode KILL() { return getToken(ClickHouseSQLParser.KILL, 0); }
		public TerminalNode LAST() { return getToken(ClickHouseSQLParser.LAST, 0); }
		public TerminalNode LAYOUT() { return getToken(ClickHouseSQLParser.LAYOUT, 0); }
		public TerminalNode LEADING() { return getToken(ClickHouseSQLParser.LEADING, 0); }
		public TerminalNode LEFT() { return getToken(ClickHouseSQLParser.LEFT, 0); }
		public TerminalNode LIFETIME() { return getToken(ClickHouseSQLParser.LIFETIME, 0); }
		public TerminalNode LIKE() { return getToken(ClickHouseSQLParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(ClickHouseSQLParser.LIMIT, 0); }
		public TerminalNode LIVE() { return getToken(ClickHouseSQLParser.LIVE, 0); }
		public TerminalNode LOCAL() { return getToken(ClickHouseSQLParser.LOCAL, 0); }
		public TerminalNode LOGS() { return getToken(ClickHouseSQLParser.LOGS, 0); }
		public TerminalNode MATERIALIZE() { return getToken(ClickHouseSQLParser.MATERIALIZE, 0); }
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseSQLParser.MATERIALIZED, 0); }
		public TerminalNode MAX() { return getToken(ClickHouseSQLParser.MAX, 0); }
		public TerminalNode MERGES() { return getToken(ClickHouseSQLParser.MERGES, 0); }
		public TerminalNode MIN() { return getToken(ClickHouseSQLParser.MIN, 0); }
		public TerminalNode MODIFY() { return getToken(ClickHouseSQLParser.MODIFY, 0); }
		public TerminalNode MOVE() { return getToken(ClickHouseSQLParser.MOVE, 0); }
		public TerminalNode MUTATION() { return getToken(ClickHouseSQLParser.MUTATION, 0); }
		public TerminalNode NO() { return getToken(ClickHouseSQLParser.NO, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseSQLParser.NOT, 0); }
		public TerminalNode NULLS() { return getToken(ClickHouseSQLParser.NULLS, 0); }
		public TerminalNode OFFSET() { return getToken(ClickHouseSQLParser.OFFSET, 0); }
		public TerminalNode ON() { return getToken(ClickHouseSQLParser.ON, 0); }
		public TerminalNode OPTIMIZE() { return getToken(ClickHouseSQLParser.OPTIMIZE, 0); }
		public TerminalNode OR() { return getToken(ClickHouseSQLParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(ClickHouseSQLParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(ClickHouseSQLParser.OUTER, 0); }
		public TerminalNode OUTFILE() { return getToken(ClickHouseSQLParser.OUTFILE, 0); }
		public TerminalNode OVER() { return getToken(ClickHouseSQLParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(ClickHouseSQLParser.PARTITION, 0); }
		public TerminalNode POPULATE() { return getToken(ClickHouseSQLParser.POPULATE, 0); }
		public TerminalNode PRECEDING() { return getToken(ClickHouseSQLParser.PRECEDING, 0); }
		public TerminalNode PREWHERE() { return getToken(ClickHouseSQLParser.PREWHERE, 0); }
		public TerminalNode PRIMARY() { return getToken(ClickHouseSQLParser.PRIMARY, 0); }
		public TerminalNode RANGE() { return getToken(ClickHouseSQLParser.RANGE, 0); }
		public TerminalNode RELOAD() { return getToken(ClickHouseSQLParser.RELOAD, 0); }
		public TerminalNode REMOVE() { return getToken(ClickHouseSQLParser.REMOVE, 0); }
		public TerminalNode RENAME() { return getToken(ClickHouseSQLParser.RENAME, 0); }
		public TerminalNode REPLACE() { return getToken(ClickHouseSQLParser.REPLACE, 0); }
		public TerminalNode REPLICA() { return getToken(ClickHouseSQLParser.REPLICA, 0); }
		public TerminalNode REPLICATED() { return getToken(ClickHouseSQLParser.REPLICATED, 0); }
		public TerminalNode RIGHT() { return getToken(ClickHouseSQLParser.RIGHT, 0); }
		public TerminalNode ROLLUP() { return getToken(ClickHouseSQLParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(ClickHouseSQLParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(ClickHouseSQLParser.ROWS, 0); }
		public TerminalNode SAMPLE() { return getToken(ClickHouseSQLParser.SAMPLE, 0); }
		public TerminalNode SELECT() { return getToken(ClickHouseSQLParser.SELECT, 0); }
		public TerminalNode SEMI() { return getToken(ClickHouseSQLParser.SEMI, 0); }
		public TerminalNode SENDS() { return getToken(ClickHouseSQLParser.SENDS, 0); }
		public TerminalNode SET() { return getToken(ClickHouseSQLParser.SET, 0); }
		public TerminalNode SETTINGS() { return getToken(ClickHouseSQLParser.SETTINGS, 0); }
		public TerminalNode SHOW() { return getToken(ClickHouseSQLParser.SHOW, 0); }
		public TerminalNode SOURCE() { return getToken(ClickHouseSQLParser.SOURCE, 0); }
		public TerminalNode START() { return getToken(ClickHouseSQLParser.START, 0); }
		public TerminalNode STOP() { return getToken(ClickHouseSQLParser.STOP, 0); }
		public TerminalNode SUBSTRING() { return getToken(ClickHouseSQLParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(ClickHouseSQLParser.SYNC, 0); }
		public TerminalNode SYNTAX() { return getToken(ClickHouseSQLParser.SYNTAX, 0); }
		public TerminalNode SYSTEM() { return getToken(ClickHouseSQLParser.SYSTEM, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseSQLParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(ClickHouseSQLParser.TABLES, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseSQLParser.TEMPORARY, 0); }
		public TerminalNode TEST() { return getToken(ClickHouseSQLParser.TEST, 0); }
		public TerminalNode THEN() { return getToken(ClickHouseSQLParser.THEN, 0); }
		public TerminalNode TIES() { return getToken(ClickHouseSQLParser.TIES, 0); }
		public TerminalNode TIMEOUT() { return getToken(ClickHouseSQLParser.TIMEOUT, 0); }
		public TerminalNode TIMESTAMP() { return getToken(ClickHouseSQLParser.TIMESTAMP, 0); }
		public TerminalNode TOTALS() { return getToken(ClickHouseSQLParser.TOTALS, 0); }
		public TerminalNode TRAILING() { return getToken(ClickHouseSQLParser.TRAILING, 0); }
		public TerminalNode TRIM() { return getToken(ClickHouseSQLParser.TRIM, 0); }
		public TerminalNode TRUNCATE() { return getToken(ClickHouseSQLParser.TRUNCATE, 0); }
		public TerminalNode TO() { return getToken(ClickHouseSQLParser.TO, 0); }
		public TerminalNode TOP() { return getToken(ClickHouseSQLParser.TOP, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseSQLParser.TTL, 0); }
		public TerminalNode TYPE() { return getToken(ClickHouseSQLParser.TYPE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(ClickHouseSQLParser.UNBOUNDED, 0); }
		public TerminalNode UNION() { return getToken(ClickHouseSQLParser.UNION, 0); }
		public TerminalNode UPDATE() { return getToken(ClickHouseSQLParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(ClickHouseSQLParser.USE, 0); }
		public TerminalNode USING() { return getToken(ClickHouseSQLParser.USING, 0); }
		public TerminalNode UUID() { return getToken(ClickHouseSQLParser.UUID, 0); }
		public TerminalNode VALUES() { return getToken(ClickHouseSQLParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseSQLParser.VIEW, 0); }
		public TerminalNode VOLUME() { return getToken(ClickHouseSQLParser.VOLUME, 0); }
		public TerminalNode WATCH() { return getToken(ClickHouseSQLParser.WATCH, 0); }
		public TerminalNode WHEN() { return getToken(ClickHouseSQLParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(ClickHouseSQLParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(ClickHouseSQLParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(ClickHouseSQLParser.WITH, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MODIFY - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class KeywordForAliasContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(ClickHouseSQLParser.DATE, 0); }
		public TerminalNode FIRST() { return getToken(ClickHouseSQLParser.FIRST, 0); }
		public TerminalNode ID() { return getToken(ClickHouseSQLParser.ID, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseSQLParser.KEY, 0); }
		public KeywordForAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordForAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterKeywordForAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitKeywordForAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitKeywordForAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordForAliasContext keywordForAlias() throws RecognitionException {
		KeywordForAliasContext _localctx = new KeywordForAliasContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_keywordForAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
			_la = _input.LA(1);
			if ( !(((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (DATE - 35)) | (1L << (FIRST - 35)) | (1L << (ID - 35)) | (1L << (KEY - 35)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClickHouseSQLParser.IDENTIFIER, 0); }
		public KeywordForAliasContext keywordForAlias() {
			return getRuleContext(KeywordForAliasContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_alias);
		try {
			setState(1961);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1959);
				match(IDENTIFIER);
				}
				break;
			case DATE:
			case FIRST:
			case ID:
			case KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1960);
				keywordForAlias();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClickHouseSQLParser.IDENTIFIER, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_identifier);
		try {
			setState(1966);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1963);
				match(IDENTIFIER);
				}
				break;
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case QUARTER:
			case SECOND:
			case WEEK:
			case YEAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1964);
				interval();
				}
				break;
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case AST:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case CURRENT:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOLLOWING:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZE:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MODIFY:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case OVER:
			case PARTITION:
			case POPULATE:
			case PRECEDING:
			case PREWHERE:
			case PRIMARY:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case ROW:
			case ROWS:
			case SAMPLE:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNBOUNDED:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WHEN:
			case WHERE:
			case WINDOW:
			case WITH:
			case JSON_FALSE:
			case JSON_TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1965);
				keyword();
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

	public static class IdentifierOrNullContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NULL_SQL() { return getToken(ClickHouseSQLParser.NULL_SQL, 0); }
		public IdentifierOrNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrNull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterIdentifierOrNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitIdentifierOrNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitIdentifierOrNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierOrNullContext identifierOrNull() throws RecognitionException {
		IdentifierOrNullContext _localctx = new IdentifierOrNullContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_identifierOrNull);
		try {
			setState(1970);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case AST:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case CURRENT:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DAY:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOLLOWING:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case HOUR:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZE:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case OVER:
			case PARTITION:
			case POPULATE:
			case PRECEDING:
			case PREWHERE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case ROW:
			case ROWS:
			case SAMPLE:
			case SECOND:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNBOUNDED:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WEEK:
			case WHEN:
			case WHERE:
			case WINDOW:
			case WITH:
			case YEAR:
			case JSON_FALSE:
			case JSON_TRUE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1968);
				identifier();
				}
				break;
			case NULL_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1969);
				match(NULL_SQL);
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

	public static class EnumValueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseSQLParser.STRING_LITERAL, 0); }
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseSQLParser.EQ_SINGLE, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseSQLListener ) ((ClickHouseSQLListener)listener).exitEnumValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseSQLVisitor ) return ((ClickHouseSQLVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1972);
			match(STRING_LITERAL);
			setState(1973);
			match(EQ_SINGLE);
			setState(1974);
			numberLiteral();
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
		case 68:
			return joinExpr_sempred((JoinExprContext)_localctx, predIndex);
		case 94:
			return columnExpr_sempred((ColumnExprContext)_localctx, predIndex);
		case 100:
			return tableExpr_sempred((TableExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean joinExpr_sempred(JoinExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean columnExpr_sempred(ColumnExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 19);
		case 10:
			return precpred(_ctx, 18);
		case 11:
			return precpred(_ctx, 13);
		case 12:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean tableExpr_sempred(TableExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00e8\u07bb\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\3\2\3\2"+
		"\3\2\3\2\5\2\u00ef\n\2\3\2\3\2\5\2\u00f3\n\2\3\2\5\2\u00f6\n\2\3\2\5\2"+
		"\u00f9\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\u010d\n\3\3\4\3\4\3\4\3\4\5\4\u0113\n\4\3\4\3\4\3\4\7"+
		"\4\u0118\n\4\f\4\16\4\u011b\13\4\3\5\3\5\3\5\3\5\3\5\5\5\u0122\n\5\3\5"+
		"\3\5\3\5\5\5\u0127\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u012e\n\5\3\5\3\5\3\5\5"+
		"\5\u0133\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u013a\n\5\3\5\3\5\3\5\5\5\u013f\n"+
		"\5\3\5\3\5\3\5\3\5\5\5\u0145\n\5\3\5\3\5\3\5\3\5\5\5\u014b\n\5\3\5\3\5"+
		"\3\5\5\5\u0150\n\5\3\5\3\5\3\5\3\5\5\5\u0156\n\5\3\5\3\5\3\5\5\5\u015b"+
		"\n\5\3\5\3\5\3\5\3\5\5\5\u0161\n\5\3\5\3\5\3\5\5\5\u0166\n\5\3\5\3\5\3"+
		"\5\3\5\5\5\u016c\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\u017a\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0181\n\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u0188\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u018f\n\5\3\5\3\5\3\5\3\5\5\5\u0195"+
		"\n\5\3\5\3\5\3\5\5\5\u019a\n\5\3\5\3\5\3\5\3\5\5\5\u01a0\n\5\3\5\3\5\3"+
		"\5\5\5\u01a5\n\5\3\5\3\5\3\5\3\5\5\5\u01ab\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u01b4\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01be\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01c8\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01dc\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u01e4\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u01f3\n\5\3\6\3\6\3\6\7\6\u01f8\n\6\f\6\16\6\u01fb\13\6\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0208\n\t\3\n\3\n\3\n\3\n"+
		"\5\n\u020e\n\n\3\13\3\13\3\13\3\13\5\13\u0214\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u021b\n\f\3\f\3\f\5\f\u021f\n\f\3\f\5\f\u0222\n\f\3\f\3\f\3\f\3\f"+
		"\5\f\u0228\n\f\3\f\5\f\u022b\n\f\3\f\3\f\3\f\3\f\5\f\u0231\n\f\3\f\3\f"+
		"\5\f\u0235\n\f\3\f\5\f\u0238\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0243\n\f\3\f\3\f\5\f\u0247\n\f\3\f\5\f\u024a\n\f\3\f\3\f\3\f\5\f\u024f"+
		"\n\f\5\f\u0251\n\f\3\f\5\f\u0254\n\f\3\f\5\f\u0257\n\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u0261\n\f\3\f\3\f\5\f\u0265\n\f\3\f\5\f\u0268\n\f"+
		"\3\f\5\f\u026b\n\f\3\f\3\f\3\f\5\f\u0270\n\f\5\f\u0272\n\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u027a\n\f\3\f\5\f\u027d\n\f\3\f\5\f\u0280\n\f\3\f\3\f"+
		"\3\f\3\f\5\f\u0286\n\f\3\f\3\f\5\f\u028a\n\f\3\f\5\f\u028d\n\f\3\f\5\f"+
		"\u0290\n\f\3\f\5\f\u0293\n\f\3\f\5\f\u0296\n\f\3\f\3\f\3\f\5\f\u029b\n"+
		"\f\3\f\3\f\3\f\3\f\5\f\u02a1\n\f\3\f\3\f\5\f\u02a5\n\f\3\f\5\f\u02a8\n"+
		"\f\3\f\5\f\u02ab\n\f\3\f\3\f\5\f\u02af\n\f\3\r\3\r\3\r\3\r\7\r\u02b5\n"+
		"\r\f\r\16\r\u02b8\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u02c5\n\16\f\16\16\16\u02c8\13\16\3\17\5\17\u02cb\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u02d2\n\17\f\17\16\17\u02d5\13\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u02df\n\21\3\21\5\21\u02e2\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u02e9\n\22\f\22\16\22\u02ec\13\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u02fc"+
		"\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u0305\n\24\f\24\16\24\u0308"+
		"\13\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u0319\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\5\27\u0326\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\7\33\u0335\n\33\f\33\16\33\u0338\13\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u0340\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\7\34\u0349\n\34\f\34\16\34\u034c\13\34\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \7 \u035e\n \f \16 \u0361\13"+
		" \3!\5!\u0364\n!\3!\5!\u0367\n!\3!\3!\3!\5!\u036c\n!\3!\5!\u036f\n!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u037b\n\"\3#\3#\3#\5#\u0380"+
		"\n#\3#\3#\5#\u0384\n#\3#\5#\u0387\n#\3#\3#\5#\u038b\n#\3#\3#\5#\u038f"+
		"\n#\3#\3#\3#\5#\u0394\n#\3#\5#\u0397\n#\3#\3#\5#\u039b\n#\5#\u039d\n#"+
		"\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\7\'\u03b1"+
		"\n\'\f\'\16\'\u03b4\13\'\3\'\3\'\3(\3(\3(\5(\u03bb\n(\3(\5(\u03be\n(\3"+
		")\3)\3)\3)\3)\3)\3)\3)\5)\u03c8\n)\3*\3*\5*\u03cc\n*\3*\3*\3+\3+\3+\3"+
		"+\5+\u03d4\n+\3+\3+\5+\u03d8\n+\3+\3+\3+\5+\u03dd\n+\3+\3+\5+\u03e1\n"+
		"+\3+\3+\5+\u03e5\n+\3+\3+\5+\u03e9\n+\3+\3+\5+\u03ed\n+\5+\u03ef\n+\3"+
		",\3,\3,\3,\3,\3,\5,\u03f7\n,\3,\3,\5,\u03fb\n,\3,\5,\u03fe\n,\3-\3-\3"+
		"-\3-\3-\3-\5-\u0406\n-\3.\3.\3.\5.\u040b\n.\3.\3.\3.\5.\u0410\n.\3.\5"+
		".\u0413\n.\3.\3.\3/\3/\3/\3/\7/\u041b\n/\f/\16/\u041e\13/\3/\3/\3\60\3"+
		"\60\3\60\3\60\3\60\5\60\u0427\n\60\3\60\3\60\5\60\u042b\n\60\3\61\3\61"+
		"\3\61\5\61\u0430\n\61\3\61\3\61\5\61\u0434\n\61\3\62\3\62\3\62\3\62\5"+
		"\62\u043a\n\62\3\62\5\62\u043d\n\62\3\62\5\62\u0440\n\62\3\62\5\62\u0443"+
		"\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u044f\n\63"+
		"\f\63\16\63\u0452\13\63\3\63\5\63\u0455\n\63\3\64\3\64\5\64\u0459\n\64"+
		"\3\64\3\64\3\64\5\64\u045e\n\64\3\64\5\64\u0461\n\64\3\64\3\64\3\65\3"+
		"\65\3\65\3\65\7\65\u0469\n\65\f\65\16\65\u046c\13\65\3\66\3\66\3\66\3"+
		"\66\3\66\5\66\u0473\n\66\3\67\5\67\u0476\n\67\3\67\3\67\5\67\u047a\n\67"+
		"\3\67\5\67\u047d\n\67\3\67\3\67\5\67\u0481\n\67\3\67\5\67\u0484\n\67\3"+
		"\67\5\67\u0487\n\67\3\67\5\67\u048a\n\67\3\67\5\67\u048d\n\67\3\67\5\67"+
		"\u0490\n\67\3\67\3\67\5\67\u0494\n\67\3\67\3\67\5\67\u0498\n\67\3\67\5"+
		"\67\u049b\n\67\3\67\5\67\u049e\n\67\3\67\5\67\u04a1\n\67\3\67\5\67\u04a4"+
		"\n\67\3\67\5\67\u04a7\n\67\38\38\38\39\39\39\39\59\u04b0\n9\3:\3:\3:\3"+
		";\5;\u04b6\n;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\5?\u04d1\n?\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3C\3"+
		"C\3C\3C\3C\3D\3D\3D\3D\5D\u04e7\nD\3E\3E\3E\3F\3F\3F\5F\u04ef\nF\3F\5"+
		"F\u04f2\nF\3F\3F\3F\3F\5F\u04f8\nF\3F\3F\3F\3F\3F\3F\5F\u0500\nF\3F\5"+
		"F\u0503\nF\3F\3F\3F\3F\7F\u0509\nF\fF\16F\u050c\13F\3G\5G\u050f\nG\3G"+
		"\3G\3G\5G\u0514\nG\3G\5G\u0517\nG\3G\5G\u051a\nG\3G\3G\5G\u051e\nG\3G"+
		"\3G\5G\u0522\nG\3G\5G\u0525\nG\5G\u0527\nG\3G\5G\u052a\nG\3G\3G\5G\u052e"+
		"\nG\3G\3G\5G\u0532\nG\3G\5G\u0535\nG\5G\u0537\nG\5G\u0539\nG\3H\5H\u053c"+
		"\nH\3H\3H\3H\5H\u0541\nH\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u054c\nI\3J\3J"+
		"\3J\3J\5J\u0552\nJ\3K\3K\3K\5K\u0557\nK\3L\3L\3L\7L\u055c\nL\fL\16L\u055f"+
		"\13L\3M\3M\5M\u0563\nM\3M\3M\5M\u0567\nM\3M\3M\5M\u056b\nM\3N\3N\3N\5"+
		"N\u0570\nN\3O\3O\3O\7O\u0575\nO\fO\16O\u0578\13O\3P\3P\3P\3P\3Q\5Q\u057f"+
		"\nQ\3Q\5Q\u0582\nQ\3Q\5Q\u0585\nQ\3R\3R\3R\3R\3S\3S\3S\3S\3T\3T\3T\3U"+
		"\3U\3U\3U\3U\3U\5U\u0598\nU\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u05a6"+
		"\nV\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u05b6\nX\3X\5X\u05b9"+
		"\nX\3X\3X\3X\3X\3X\3X\3X\5X\u05c2\nX\3X\3X\5X\u05c6\nX\3X\3X\3X\5X\u05cb"+
		"\nX\3X\3X\3X\5X\u05d0\nX\3X\5X\u05d3\nX\5X\u05d5\nX\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u05eb\nY\3Y\5Y\u05ee\nY"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u05f9\nY\3Z\3Z\5Z\u05fd\nZ\3Z\5Z\u0600"+
		"\nZ\3Z\3Z\5Z\u0604\nZ\3Z\3Z\5Z\u0608\nZ\3[\3[\3[\3\\\3\\\3\\\5\\\u0610"+
		"\n\\\3\\\3\\\5\\\u0614\n\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\7]\u061f\n]\f]\16"+
		"]\u0622\13]\3]\3]\3]\3]\3]\3]\3]\7]\u062b\n]\f]\16]\u062e\13]\3]\3]\3"+
		"]\3]\3]\3]\3]\7]\u0637\n]\f]\16]\u063a\13]\3]\3]\3]\3]\3]\5]\u0641\n]"+
		"\3]\3]\5]\u0645\n]\3^\3^\3^\7^\u064a\n^\f^\16^\u064d\13^\3_\3_\3_\5_\u0652"+
		"\n_\3_\3_\3_\3_\3_\3_\5_\u065a\n_\3`\3`\3`\5`\u065f\n`\3`\3`\3`\3`\3`"+
		"\6`\u0666\n`\r`\16`\u0667\3`\3`\5`\u066c\n`\3`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u068b"+
		"\n`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u069c\n`\3`\3`\3`"+
		"\3`\3`\3`\3`\3`\3`\3`\5`\u06a8\n`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u06b2\n`"+
		"\3`\5`\u06b5\n`\3`\3`\5`\u06b9\n`\3`\5`\u06bc\n`\3`\3`\3`\3`\3`\3`\3`"+
		"\3`\3`\3`\5`\u06c8\n`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`"+
		"\u06d9\n`\3`\3`\5`\u06dd\n`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`"+
		"\3`\5`\u06ee\n`\3`\5`\u06f1\n`\3`\3`\5`\u06f5\n`\3`\5`\u06f8\n`\3`\3`"+
		"\3`\3`\3`\3`\3`\3`\3`\5`\u0703\n`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`"+
		"\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u071b\n`\3`\3`\3`\3`\3`\5`\u0722\n`"+
		"\7`\u0724\n`\f`\16`\u0727\13`\3a\3a\3a\7a\u072c\na\fa\16a\u072f\13a\3"+
		"b\3b\5b\u0733\nb\3c\3c\3c\3c\7c\u0739\nc\fc\16c\u073c\13c\3c\3c\3c\3c"+
		"\3c\7c\u0743\nc\fc\16c\u0746\13c\5c\u0748\nc\3c\3c\3c\3d\3d\3d\5d\u0750"+
		"\nd\3d\3d\3e\3e\3e\5e\u0757\ne\3f\3f\3f\3f\3f\3f\3f\5f\u0760\nf\3f\3f"+
		"\3f\3f\5f\u0766\nf\7f\u0768\nf\ff\16f\u076b\13f\3g\3g\3g\5g\u0770\ng\3"+
		"g\3g\3h\3h\3h\5h\u0777\nh\3h\3h\3i\3i\3i\7i\u077e\ni\fi\16i\u0781\13i"+
		"\3j\3j\3j\5j\u0786\nj\3k\3k\3l\3l\3l\3l\3l\3l\5l\u0790\nl\5l\u0792\nl"+
		"\3m\5m\u0795\nm\3m\3m\3m\3m\3m\3m\5m\u079d\nm\3n\3n\3n\5n\u07a2\nn\3o"+
		"\3o\3p\3p\3q\3q\3r\3r\5r\u07ac\nr\3s\3s\3s\5s\u07b1\ns\3t\3t\5t\u07b5"+
		"\nt\3u\3u\3u\3u\3u\2\5\u008a\u00be\u00cav\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\2\36\b\2\5\5\32\32\35\35((ii\u00ae\u00ae\4\2"+
		"\21\21\37\37\5\2\5\5((ii\4\2++--\4\2..\64\64\5\2\20\20\u009d\u009d\u00a3"+
		"\u00a3\4\2!!\u008e\u008e\4\2UUaa\4\2HHff\5\2\6\6\n\n\16\16\6\2\6\6\t\n"+
		"\16\16\u0094\u0094\4\2aa\u008d\u008d\4\2\6\6\n\n\4\2ww\u00cd\u00cd\4\2"+
		"\r\r+,\4\2??^^\4\2\u0086\u0086\u0090\u0090\4\2EEQQ\3\2\u009a\u009b\5\2"+
		"\23\23``\u00ab\u00ab\5\2\u00c9\u00c9\u00db\u00db\u00e4\u00e4\4\2\u00ce"+
		"\u00cf\u00dc\u00dc\4\2PPcc\3\2\u00c4\u00c5\4\2\u00cf\u00cf\u00dc\u00dc"+
		"\n\2&&MMmmoo\u0085\u0085\u0092\u0092\u00ba\u00ba\u00bf\u00bf\16\2\4%\'"+
		"LNRTlnnpqstv\u0083\u0086\u0091\u0093\u00b9\u00bb\u00be\u00c0\u00c1\6\2"+
		"%%??NN\\\\\2\u08d9\2\u00f8\3\2\2\2\4\u010c\3\2\2\2\6\u010e\3\2\2\2\b\u01f2"+
		"\3\2\2\2\n\u01f4\3\2\2\2\f\u01fc\3\2\2\2\16\u0200\3\2\2\2\20\u0207\3\2"+
		"\2\2\22\u0209\3\2\2\2\24\u020f\3\2\2\2\26\u02ae\3\2\2\2\30\u02b0\3\2\2"+
		"\2\32\u02bb\3\2\2\2\34\u02ca\3\2\2\2\36\u02d6\3\2\2\2 \u02da\3\2\2\2\""+
		"\u02e3\3\2\2\2$\u02f0\3\2\2\2&\u02ff\3\2\2\2(\u030c\3\2\2\2*\u031c\3\2"+
		"\2\2,\u0321\3\2\2\2.\u0327\3\2\2\2\60\u032a\3\2\2\2\62\u032d\3\2\2\2\64"+
		"\u033f\3\2\2\2\66\u0341\3\2\2\28\u034d\3\2\2\2:\u0351\3\2\2\2<\u0355\3"+
		"\2\2\2>\u0359\3\2\2\2@\u0363\3\2\2\2B\u037a\3\2\2\2D\u039c\3\2\2\2F\u039e"+
		"\3\2\2\2H\u03a1\3\2\2\2J\u03a8\3\2\2\2L\u03ab\3\2\2\2N\u03b7\3\2\2\2P"+
		"\u03bf\3\2\2\2R\u03c9\3\2\2\2T\u03ee\3\2\2\2V\u03fd\3\2\2\2X\u0405\3\2"+
		"\2\2Z\u0407\3\2\2\2\\\u0416\3\2\2\2^\u042a\3\2\2\2`\u042c\3\2\2\2b\u0435"+
		"\3\2\2\2d\u0444\3\2\2\2f\u0456\3\2\2\2h\u0464\3\2\2\2j\u0472\3\2\2\2l"+
		"\u0475\3\2\2\2n\u04a8\3\2\2\2p\u04ab\3\2\2\2r\u04b1\3\2\2\2t\u04b5\3\2"+
		"\2\2v\u04bb\3\2\2\2x\u04c2\3\2\2\2z\u04c5\3\2\2\2|\u04c8\3\2\2\2~\u04d2"+
		"\3\2\2\2\u0080\u04d5\3\2\2\2\u0082\u04d9\3\2\2\2\u0084\u04dd\3\2\2\2\u0086"+
		"\u04e2\3\2\2\2\u0088\u04e8\3\2\2\2\u008a\u04f7\3\2\2\2\u008c\u0538\3\2"+
		"\2\2\u008e\u0540\3\2\2\2\u0090\u054b\3\2\2\2\u0092\u054d\3\2\2\2\u0094"+
		"\u0553\3\2\2\2\u0096\u0558\3\2\2\2\u0098\u0560\3\2\2\2\u009a\u056c\3\2"+
		"\2\2\u009c\u0571\3\2\2\2\u009e\u0579\3\2\2\2\u00a0\u057e\3\2\2\2\u00a2"+
		"\u0586\3\2\2\2\u00a4\u058a\3\2\2\2\u00a6\u058e\3\2\2\2\u00a8\u0597\3\2"+
		"\2\2\u00aa\u05a5\3\2\2\2\u00ac\u05a7\3\2\2\2\u00ae\u05d4\3\2\2\2\u00b0"+
		"\u05f8\3\2\2\2\u00b2\u05fa\3\2\2\2\u00b4\u0609\3\2\2\2\u00b6\u060c\3\2"+
		"\2\2\u00b8\u0644\3\2\2\2\u00ba\u0646\3\2\2\2\u00bc\u0659\3\2\2\2\u00be"+
		"\u06dc\3\2\2\2\u00c0\u0728\3\2\2\2\u00c2\u0732\3\2\2\2\u00c4\u0747\3\2"+
		"\2\2\u00c6\u074f\3\2\2\2\u00c8\u0753\3\2\2\2\u00ca\u075f\3\2\2\2\u00cc"+
		"\u076c\3\2\2\2\u00ce\u0776\3\2\2\2\u00d0\u077a\3\2\2\2\u00d2\u0785\3\2"+
		"\2\2\u00d4\u0787\3\2\2\2\u00d6\u0791\3\2\2\2\u00d8\u0794\3\2\2\2\u00da"+
		"\u07a1\3\2\2\2\u00dc\u07a3\3\2\2\2\u00de\u07a5\3\2\2\2\u00e0\u07a7\3\2"+
		"\2\2\u00e2\u07ab\3\2\2\2\u00e4\u07b0\3\2\2\2\u00e6\u07b4\3\2\2\2\u00e8"+
		"\u07b6\3\2\2\2\u00ea\u00ee\5\4\3\2\u00eb\u00ec\7X\2\2\u00ec\u00ed\7}\2"+
		"\2\u00ed\u00ef\7\u00c7\2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f2\3\2\2\2\u00f0\u00f1\7C\2\2\u00f1\u00f3\5\u00e6t\2\u00f2\u00f0\3"+
		"\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f6\7\u00e3\2\2"+
		"\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f9"+
		"\5Z.\2\u00f8\u00ea\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\3\3\2\2\2\u00fa\u010d"+
		"\5\6\4\2\u00fb\u010d\5\22\n\2\u00fc\u010d\5\24\13\2\u00fd\u010d\5\26\f"+
		"\2\u00fe\u010d\5R*\2\u00ff\u010d\5T+\2\u0100\u010d\5V,\2\u0101\u010d\5"+
		"X-\2\u0102\u010d\5`\61\2\u0103\u010d\5b\62\2\u0104\u010d\5d\63\2\u0105"+
		"\u010d\5h\65\2\u0106\u010d\5\u00acW\2\u0107\u010d\5\u00aeX\2\u0108\u010d"+
		"\5\u00b0Y\2\u0109\u010d\5\u00b2Z\2\u010a\u010d\5\u00b4[\2\u010b\u010d"+
		"\5\u00b6\\\2\u010c\u00fa\3\2\2\2\u010c\u00fb\3\2\2\2\u010c\u00fc\3\2\2"+
		"\2\u010c\u00fd\3\2\2\2\u010c\u00fe\3\2\2\2\u010c\u00ff\3\2\2\2\u010c\u0100"+
		"\3\2\2\2\u010c\u0101\3\2\2\2\u010c\u0102\3\2\2\2\u010c\u0103\3\2\2\2\u010c"+
		"\u0104\3\2\2\2\u010c\u0105\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u0107\3\2"+
		"\2\2\u010c\u0108\3\2\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010b\3\2\2\2\u010d\5\3\2\2\2\u010e\u010f\7\7\2\2\u010f\u0110\7\u00a0"+
		"\2\2\u0110\u0112\5\u00ceh\2\u0111\u0113\5,\27\2\u0112\u0111\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0119\5\b\5\2\u0115\u0116\7\u00cd"+
		"\2\2\u0116\u0118\5\b\5\2\u0117\u0115\3\2\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\7\3\2\2\2\u011b\u0119\3\2\2\2"+
		"\u011c\u011d\7\3\2\2\u011d\u0121\7\34\2\2\u011e\u011f\7O\2\2\u011f\u0120"+
		"\7t\2\2\u0120\u0122\79\2\2\u0121\u011e\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0126\5D#\2\u0124\u0125\7\4\2\2\u0125\u0127\5\u00c8"+
		"e\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u01f3\3\2\2\2\u0128"+
		"\u0129\7\3\2\2\u0129\u012d\7R\2\2\u012a\u012b\7O\2\2\u012b\u012c\7t\2"+
		"\2\u012c\u012e\79\2\2\u012d\u012a\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0132\5H%\2\u0130\u0131\7\4\2\2\u0131\u0133\5\u00c8e\2"+
		"\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u01f3\3\2\2\2\u0134\u0135"+
		"\7\3\2\2\u0135\u0139\7\u0084\2\2\u0136\u0137\7O\2\2\u0137\u0138\7t\2\2"+
		"\u0138\u013a\79\2\2\u0139\u0136\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u013e\5J&\2\u013c\u013d\7\4\2\2\u013d\u013f\5\u00c8e\2"+
		"\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u01f3\3\2\2\2\u0140\u0141"+
		"\7\21\2\2\u0141\u0144\5\20\t\2\u0142\u0143\7E\2\2\u0143\u0145\5\u00ce"+
		"h\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u01f3\3\2\2\2\u0146"+
		"\u0147\7\30\2\2\u0147\u014a\7\34\2\2\u0148\u0149\7O\2\2\u0149\u014b\7"+
		"9\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014f\5\u00c8e\2\u014d\u014e\7Q\2\2\u014e\u0150\5\20\t\2\u014f\u014d"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u01f3\3\2\2\2\u0151\u0152\7\30\2\2"+
		"\u0152\u0155\7R\2\2\u0153\u0154\7O\2\2\u0154\u0156\79\2\2\u0155\u0153"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015a\5\u00c8e"+
		"\2\u0158\u0159\7Q\2\2\u0159\u015b\5\20\t\2\u015a\u0158\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u01f3\3\2\2\2\u015c\u015d\7\30\2\2\u015d\u0160\7\u0084"+
		"\2\2\u015e\u015f\7O\2\2\u015f\u0161\79\2\2\u0160\u015e\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0165\5\u00c8e\2\u0163\u0164\7Q\2\2"+
		"\u0164\u0166\5\20\t\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u01f3"+
		"\3\2\2\2\u0167\u0168\7\35\2\2\u0168\u016b\7\34\2\2\u0169\u016a\7O\2\2"+
		"\u016a\u016c\79\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d"+
		"\3\2\2\2\u016d\u016e\5\u00c8e\2\u016e\u016f\7\u00c7\2\2\u016f\u01f3\3"+
		"\2\2\2\u0170\u0171\7*\2\2\u0171\u0172\7\u00bc\2\2\u0172\u01f3\5\u00be"+
		"`\2\u0173\u0174\7.\2\2\u0174\u01f3\5\20\t\2\u0175\u0176\7\64\2\2\u0176"+
		"\u0179\7\34\2\2\u0177\u0178\7O\2\2\u0178\u017a\79\2\2\u0179\u0177\3\2"+
		"\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u01f3\5\u00c8e\2\u017c"+
		"\u017d\7\64\2\2\u017d\u0180\7R\2\2\u017e\u017f\7O\2\2\u017f\u0181\79\2"+
		"\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u01f3"+
		"\5\u00c8e\2\u0183\u0184\7\64\2\2\u0184\u0187\7\u0084\2\2\u0185\u0186\7"+
		"O\2\2\u0186\u0188\79\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u01f3\5\u00c8e\2\u018a\u018b\7\64\2\2\u018b\u01f3"+
		"\5\20\t\2\u018c\u018e\7D\2\2\u018d\u018f\5\20\t\2\u018e\u018d\3\2\2\2"+
		"\u018e\u018f\3\2\2\2\u018f\u01f3\3\2\2\2\u0190\u0191\7h\2\2\u0191\u0194"+
		"\7R\2\2\u0192\u0193\7O\2\2\u0193\u0195\79\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0199\5\u00c8e\2\u0197\u0198"+
		"\7Q\2\2\u0198\u019a\5\20\t\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u01f3\3\2\2\2\u019b\u019c\7h\2\2\u019c\u019f\7\u0084\2\2\u019d\u019e"+
		"\7O\2\2\u019e\u01a0\79\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u01a4\5\u00c8e\2\u01a2\u01a3\7Q\2\2\u01a3\u01a5\5"+
		"\20\t\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01f3\3\2\2\2\u01a6"+
		"\u01a7\7n\2\2\u01a7\u01aa\7\34\2\2\u01a8\u01a9\7O\2\2\u01a9\u01ab\79\2"+
		"\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad"+
		"\5\u00c8e\2\u01ad\u01ae\5L\'\2\u01ae\u01f3\3\2\2\2\u01af\u01b0\7n\2\2"+
		"\u01b0\u01b3\7\34\2\2\u01b1\u01b2\7O\2\2\u01b2\u01b4\79\2\2\u01b3\u01b1"+
		"\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\5\u00c8e"+
		"\2\u01b6\u01b7\7\35\2\2\u01b7\u01b8\7\u00c7\2\2\u01b8\u01f3\3\2\2\2\u01b9"+
		"\u01ba\7n\2\2\u01ba\u01bd\7\34\2\2\u01bb\u01bc\7O\2\2\u01bc\u01be\79\2"+
		"\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0"+
		"\5\u00c8e\2\u01c0\u01c1\7\u0088\2\2\u01c1\u01c2\5\16\b\2\u01c2\u01f3\3"+
		"\2\2\2\u01c3\u01c4\7n\2\2\u01c4\u01c7\7\34\2\2\u01c5\u01c6\7O\2\2\u01c6"+
		"\u01c8\79\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2"+
		"\2\2\u01c9\u01f3\5D#\2\u01ca\u01cb\7n\2\2\u01cb\u01cc\7{\2\2\u01cc\u01cd"+
		"\7\24\2\2\u01cd\u01f3\5\u00be`\2\u01ce\u01cf\7n\2\2\u01cf\u01f3\5> \2"+
		"\u01d0\u01d1\7p\2\2\u01d1\u01db\5\20\t\2\u01d2\u01d3\7\u00a8\2\2\u01d3"+
		"\u01d4\7\61\2\2\u01d4\u01dc\7\u00c7\2\2\u01d5\u01d6\7\u00a8\2\2\u01d6"+
		"\u01d7\7\u00b8\2\2\u01d7\u01dc\7\u00c7\2\2\u01d8\u01d9\7\u00a8\2\2\u01d9"+
		"\u01da\7\u00a0\2\2\u01da\u01dc\5\u00ceh\2\u01db\u01d2\3\2\2\2\u01db\u01d5"+
		"\3\2\2\2\u01db\u01d8\3\2\2\2\u01dc\u01f3\3\2\2\2\u01dd\u01de\7\u0088\2"+
		"\2\u01de\u01f3\7\u00ae\2\2\u01df\u01e0\7\u0089\2\2\u01e0\u01e3\7\34\2"+
		"\2\u01e1\u01e2\7O\2\2\u01e2\u01e4\79\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4"+
		"\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\5\u00c8e\2\u01e6\u01e7\7\u00a8"+
		"\2\2\u01e7\u01e8\5\u00c8e\2\u01e8\u01f3\3\2\2\2\u01e9\u01ea\7\u008a\2"+
		"\2\u01ea\u01eb\5\20\t\2\u01eb\u01ec\7E\2\2\u01ec\u01ed\5\u00ceh\2\u01ed"+
		"\u01f3\3\2\2\2\u01ee\u01ef\7\u00b2\2\2\u01ef\u01f0\5\n\6\2\u01f0\u01f1"+
		"\5z>\2\u01f1\u01f3\3\2\2\2\u01f2\u011c\3\2\2\2\u01f2\u0128\3\2\2\2\u01f2"+
		"\u0134\3\2\2\2\u01f2\u0140\3\2\2\2\u01f2\u0146\3\2\2\2\u01f2\u0151\3\2"+
		"\2\2\u01f2\u015c\3\2\2\2\u01f2\u0167\3\2\2\2\u01f2\u0170\3\2\2\2\u01f2"+
		"\u0173\3\2\2\2\u01f2\u0175\3\2\2\2\u01f2\u017c\3\2\2\2\u01f2\u0183\3\2"+
		"\2\2\u01f2\u018a\3\2\2\2\u01f2\u018c\3\2\2\2\u01f2\u0190\3\2\2\2\u01f2"+
		"\u019b\3\2\2\2\u01f2\u01a6\3\2\2\2\u01f2\u01af\3\2\2\2\u01f2\u01b9\3\2"+
		"\2\2\u01f2\u01c3\3\2\2\2\u01f2\u01ca\3\2\2\2\u01f2\u01ce\3\2\2\2\u01f2"+
		"\u01d0\3\2\2\2\u01f2\u01dd\3\2\2\2\u01f2\u01df\3\2\2\2\u01f2\u01e9\3\2"+
		"\2\2\u01f2\u01ee\3\2\2\2\u01f3\t\3\2\2\2\u01f4\u01f9\5\f\7\2\u01f5\u01f6"+
		"\7\u00cd\2\2\u01f6\u01f8\5\f\7\2\u01f7\u01f5\3\2\2\2\u01f8\u01fb\3\2\2"+
		"\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\13\3\2\2\2\u01fb\u01f9"+
		"\3\2\2\2\u01fc\u01fd\5\u00c8e\2\u01fd\u01fe\7\u00d2\2\2\u01fe\u01ff\5"+
		"\u00be`\2\u01ff\r\3\2\2\2\u0200\u0201\t\2\2\2\u0201\17\3\2\2\2\u0202\u0203"+
		"\7\177\2\2\u0203\u0208\5\u00be`\2\u0204\u0205\7\177\2\2\u0205\u0206\7"+
		"N\2\2\u0206\u0208\7\u00c7\2\2\u0207\u0202\3\2\2\2\u0207\u0204\3\2\2\2"+
		"\u0208\21\3\2\2\2\u0209\u020a\7\21\2\2\u020a\u020b\7\60\2\2\u020b\u020d"+
		"\5\u00ceh\2\u020c\u020e\5,\27\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2"+
		"\2\u020e\23\3\2\2\2\u020f\u0210\7\27\2\2\u0210\u0211\7\u00a0\2\2\u0211"+
		"\u0213\5\u00ceh\2\u0212\u0214\5\20\t\2\u0213\u0212\3\2\2\2\u0213\u0214"+
		"\3\2\2\2\u0214\25\3\2\2\2\u0215\u0216\t\3\2\2\u0216\u021a\7#\2\2\u0217"+
		"\u0218\7O\2\2\u0218\u0219\7t\2\2\u0219\u021b\79\2\2\u021a\u0217\3\2\2"+
		"\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\5\u00d4k\2\u021d"+
		"\u021f\5,\27\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2"+
		"\2\2\u0220\u0222\5@!\2\u0221\u0220\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u02af"+
		"\3\2\2\2\u0223\u022b\7\21\2\2\u0224\u0227\7\37\2\2\u0225\u0226\7z\2\2"+
		"\u0226\u0228\7\u008a\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u022b\3\2\2\2\u0229\u022b\7\u008a\2\2\u022a\u0223\3\2\2\2\u022a\u0224"+
		"\3\2\2\2\u022a\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u0230\7\60\2\2"+
		"\u022d\u022e\7O\2\2\u022e\u022f\7t\2\2\u022f\u0231\79\2\2\u0230\u022d"+
		"\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234\5\u00ceh"+
		"\2\u0233\u0235\5.\30\2\u0234\u0233\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237"+
		"\3\2\2\2\u0236\u0238\5,\27\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u0239\3\2\2\2\u0239\u023a\5\30\r\2\u023a\u023b\5\34\17\2\u023b\u02af"+
		"\3\2\2\2\u023c\u023d\t\3\2\2\u023d\u023e\7e\2\2\u023e\u0242\7\u00b7\2"+
		"\2\u023f\u0240\7O\2\2\u0240\u0241\7t\2\2\u0241\u0243\79\2\2\u0242\u023f"+
		"\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\5\u00ceh"+
		"\2\u0245\u0247\5.\30\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249"+
		"\3\2\2\2\u0248\u024a\5,\27\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u0250\3\2\2\2\u024b\u024c\7\u00be\2\2\u024c\u024e\7\u00a6\2\2\u024d\u024f"+
		"\7\u00c5\2\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2"+
		"\2\u0250\u024b\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0253\3\2\2\2\u0252\u0254"+
		"\5\60\31\2\u0253\u0252\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2\2\2"+
		"\u0255\u0257\5\64\33\2\u0256\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258"+
		"\3\2\2\2\u0258\u0259\5\62\32\2\u0259\u02af\3\2\2\2\u025a\u025b\t\3\2\2"+
		"\u025b\u025c\7i\2\2\u025c\u0260\7\u00b7\2\2\u025d\u025e\7O\2\2\u025e\u025f"+
		"\7t\2\2\u025f\u0261\79\2\2\u0260\u025d\3\2\2\2\u0260\u0261\3\2\2\2\u0261"+
		"\u0262\3\2\2\2\u0262\u0264\5\u00ceh\2\u0263\u0265\5.\30\2\u0264\u0263"+
		"\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0267\3\2\2\2\u0266\u0268\5,\27\2\u0267"+
		"\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026a\3\2\2\2\u0269\u026b\5\64"+
		"\33\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u0271\3\2\2\2\u026c"+
		"\u0272\5\60\31\2\u026d\u026f\5\66\34\2\u026e\u0270\7\u0080\2\2\u026f\u026e"+
		"\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0272\3\2\2\2\u0271\u026c\3\2\2\2\u0271"+
		"\u026d\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\5\62\32\2\u0274\u02af\3"+
		"\2\2\2\u0275\u027d\7\21\2\2\u0276\u0279\7\37\2\2\u0277\u0278\7z\2\2\u0278"+
		"\u027a\7\u008a\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027d"+
		"\3\2\2\2\u027b\u027d\7\u008a\2\2\u027c\u0275\3\2\2\2\u027c\u0276\3\2\2"+
		"\2\u027c\u027b\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u0280\7\u00a2\2\2\u027f"+
		"\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0285\7\u00a0"+
		"\2\2\u0282\u0283\7O\2\2\u0283\u0284\7t\2\2\u0284\u0286\79\2\2\u0285\u0282"+
		"\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0289\5\u00ceh"+
		"\2\u0288\u028a\5.\30\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c"+
		"\3\2\2\2\u028b\u028d\5,\27\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d"+
		"\u028f\3\2\2\2\u028e\u0290\5\64\33\2\u028f\u028e\3\2\2\2\u028f\u0290\3"+
		"\2\2\2\u0290\u0292\3\2\2\2\u0291\u0293\5\66\34\2\u0292\u0291\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u0295\3\2\2\2\u0294\u0296\5\62\32\2\u0295\u0294\3"+
		"\2\2\2\u0295\u0296\3\2\2\2\u0296\u02af\3\2\2\2\u0297\u029a\t\3\2\2\u0298"+
		"\u0299\7z\2\2\u0299\u029b\7\u008a\2\2\u029a\u0298\3\2\2\2\u029a\u029b"+
		"\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u02a0\7\u00b7\2\2\u029d\u029e\7O\2"+
		"\2\u029e\u029f\7t\2\2\u029f\u02a1\79\2\2\u02a0\u029d\3\2\2\2\u02a0\u02a1"+
		"\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\5\u00ceh\2\u02a3\u02a5\5.\30"+
		"\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a7\3\2\2\2\u02a6\u02a8"+
		"\5,\27\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02aa\3\2\2\2\u02a9"+
		"\u02ab\5\64\33\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\3"+
		"\2\2\2\u02ac\u02ad\5\62\32\2\u02ad\u02af\3\2\2\2\u02ae\u0215\3\2\2\2\u02ae"+
		"\u022a\3\2\2\2\u02ae\u023c\3\2\2\2\u02ae\u025a\3\2\2\2\u02ae\u027c\3\2"+
		"\2\2\u02ae\u0297\3\2\2\2\u02af\27\3\2\2\2\u02b0\u02b1\7\u00d8\2\2\u02b1"+
		"\u02b6\5\32\16\2\u02b2\u02b3\7\u00cd\2\2\u02b3\u02b5\5\32\16\2\u02b4\u02b2"+
		"\3\2\2\2\u02b5\u02b8\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7"+
		"\u02b9\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b9\u02ba\7\u00e2\2\2\u02ba\31\3"+
		"\2\2\2\u02bb\u02bc\5\u00e4s\2\u02bc\u02c6\5\u00b8]\2\u02bd\u02be\7(\2"+
		"\2\u02be\u02c5\5\u00dan\2\u02bf\u02c0\7;\2\2\u02c0\u02c5\5\u00be`\2\u02c1"+
		"\u02c5\7L\2\2\u02c2\u02c5\7T\2\2\u02c3\u02c5\7Z\2\2\u02c4\u02bd\3\2\2"+
		"\2\u02c4\u02bf\3\2\2\2\u02c4\u02c1\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c3"+
		"\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7"+
		"\33\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02cb\5\36\20\2\u02ca\u02c9\3\2"+
		"\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02d3\3\2\2\2\u02cc\u02d2\5\"\22\2\u02cd"+
		"\u02d2\5$\23\2\u02ce\u02d2\5&\24\2\u02cf\u02d2\5(\25\2\u02d0\u02d2\5*"+
		"\26\2\u02d1\u02cc\3\2\2\2\u02d1\u02cd\3\2\2\2\u02d1\u02ce\3\2\2\2\u02d1"+
		"\u02cf\3\2\2\2\u02d1\u02d0\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2"+
		"\2\2\u02d3\u02d4\3\2\2\2\u02d4\35\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02d7"+
		"\7\u0083\2\2\u02d7\u02d8\7\\\2\2\u02d8\u02d9\5\u00ba^\2\u02d9\37\3\2\2"+
		"\2\u02da\u02e1\5\u00e4s\2\u02db\u02de\5\u00e4s\2\u02dc\u02dd\7\u00d8\2"+
		"\2\u02dd\u02df\7\u00e2\2\2\u02de\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df"+
		"\u02e2\3\2\2\2\u02e0\u02e2\5\u00dan\2\u02e1\u02db\3\2\2\2\u02e1\u02e0"+
		"\3\2\2\2\u02e2!\3\2\2\2\u02e3\u02e4\7\u0099\2\2\u02e4\u02e5\7\u00d8\2"+
		"\2\u02e5\u02e6\5\u00e4s\2\u02e6\u02ea\7\u00d8\2\2\u02e7\u02e9\5 \21\2"+
		"\u02e8\u02e7\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb"+
		"\3\2\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed\u02ee\7\u00e2\2"+
		"\2\u02ee\u02ef\7\u00e2\2\2\u02ef#\3\2\2\2\u02f0\u02f1\7b\2\2\u02f1\u02fb"+
		"\7\u00d8\2\2\u02f2\u02fc\7\u00c5\2\2\u02f3\u02f4\7l\2\2\u02f4\u02f5\7"+
		"\u00c5\2\2\u02f5\u02f6\7j\2\2\u02f6\u02fc\7\u00c5\2\2\u02f7\u02f8\7j\2"+
		"\2\u02f8\u02f9\7\u00c5\2\2\u02f9\u02fa\7l\2\2\u02fa\u02fc\7\u00c5\2\2"+
		"\u02fb\u02f2\3\2\2\2\u02fb\u02f3\3\2\2\2\u02fb\u02f7\3\2\2\2\u02fc\u02fd"+
		"\3\2\2\2\u02fd\u02fe\7\u00e2\2\2\u02fe%\3\2\2\2\u02ff\u0300\7_\2\2\u0300"+
		"\u0301\7\u00d8\2\2\u0301\u0302\5\u00e4s\2\u0302\u0306\7\u00d8\2\2\u0303"+
		"\u0305\5 \21\2\u0304\u0303\3\2\2\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2"+
		"\2\2\u0306\u0307\3\2\2\2\u0307\u0309\3\2\2\2\u0308\u0306\3\2\2\2\u0309"+
		"\u030a\7\u00e2\2\2\u030a\u030b\7\u00e2\2\2\u030b\'\3\2\2\2\u030c\u030d"+
		"\7\u0086\2\2\u030d\u0318\7\u00d8\2\2\u030e\u030f\7l\2\2\u030f\u0310\5"+
		"\u00e4s\2\u0310\u0311\7j\2\2\u0311\u0312\5\u00e4s\2\u0312\u0319\3\2\2"+
		"\2\u0313\u0314\7j\2\2\u0314\u0315\5\u00e4s\2\u0315\u0316\7l\2\2\u0316"+
		"\u0317\5\u00e4s\2\u0317\u0319\3\2\2\2\u0318\u030e\3\2\2\2\u0318\u0313"+
		"\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\7\u00e2\2\2\u031b)\3\2\2\2\u031c"+
		"\u031d\7\u0097\2\2\u031d\u031e\7\u00d8\2\2\u031e\u031f\5\u009cO\2\u031f"+
		"\u0320\7\u00e2\2\2\u0320+\3\2\2\2\u0321\u0322\7x\2\2\u0322\u0325\7\31"+
		"\2\2\u0323\u0326\5\u00e4s\2\u0324\u0326\7\u00c7\2\2\u0325\u0323\3\2\2"+
		"\2\u0325\u0324\3\2\2\2\u0326-\3\2\2\2\u0327\u0328\7\u00b5\2\2\u0328\u0329"+
		"\7\u00c7\2\2\u0329/\3\2\2\2\u032a\u032b\7\u00a8\2\2\u032b\u032c\5\u00ce"+
		"h\2\u032c\61\3\2\2\2\u032d\u032e\7\f\2\2\u032e\u032f\5h\65\2\u032f\63"+
		"\3\2\2\2\u0330\u0331\7\u00d8\2\2\u0331\u0336\5B\"\2\u0332\u0333\7\u00cd"+
		"\2\2\u0333\u0335\5B\"\2\u0334\u0332\3\2\2\2\u0335\u0338\3\2\2\2\u0336"+
		"\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0339\3\2\2\2\u0338\u0336\3\2"+
		"\2\2\u0339\u033a\7\u00e2\2\2\u033a\u0340\3\2\2\2\u033b\u033c\7\f\2\2\u033c"+
		"\u0340\5\u00ceh\2\u033d\u033e\7\f\2\2\u033e\u0340\5\u00ccg\2\u033f\u0330"+
		"\3\2\2\2\u033f\u033b\3\2\2\2\u033f\u033d\3\2\2\2\u0340\65\3\2\2\2\u0341"+
		"\u034a\5@!\2\u0342\u0349\5\u0080A\2\u0343\u0349\58\35\2\u0344\u0349\5"+
		":\36\2\u0345\u0349\5<\37\2\u0346\u0349\5> \2\u0347\u0349\5\u0088E\2\u0348"+
		"\u0342\3\2\2\2\u0348\u0343\3\2\2\2\u0348\u0344\3\2\2\2\u0348\u0345\3\2"+
		"\2\2\u0348\u0346\3\2\2\2\u0348\u0347\3\2\2\2\u0349\u034c\3\2\2\2\u034a"+
		"\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b\67\3\2\2\2\u034c\u034a\3\2\2"+
		"\2\u034d\u034e\7\177\2\2\u034e\u034f\7\24\2\2\u034f\u0350\5\u00be`\2\u0350"+
		"9\3\2\2\2\u0351\u0352\7\u0083\2\2\u0352\u0353\7\\\2\2\u0353\u0354\5\u00be"+
		"`\2\u0354;\3\2\2\2\u0355\u0356\7\u0091\2\2\u0356\u0357\7\24\2\2\u0357"+
		"\u0358\5\u00be`\2\u0358=\3\2\2\2\u0359\u035a\7\u00ae\2\2\u035a\u035f\5"+
		"P)\2\u035b\u035c\7\u00cd\2\2\u035c\u035e\5P)\2\u035d\u035b\3\2\2\2\u035e"+
		"\u0361\3\2\2\2\u035f\u035d\3\2\2\2\u035f\u0360\3\2\2\2\u0360?\3\2\2\2"+
		"\u0361\u035f\3\2\2\2\u0362\u0364\7\67\2\2\u0363\u0362\3\2\2\2\u0363\u0364"+
		"\3\2\2\2\u0364\u0366\3\2\2\2\u0365\u0367\7\u00d2\2\2\u0366\u0365\3\2\2"+
		"\2\u0366\u0367\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u036e\5\u00e6t\2\u0369"+
		"\u036b\7\u00d8\2\2\u036a\u036c\5\u00ba^\2\u036b\u036a\3\2\2\2\u036b\u036c"+
		"\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036f\7\u00e2\2\2\u036e\u0369\3\2\2"+
		"\2\u036e\u036f\3\2\2\2\u036fA\3\2\2\2\u0370\u037b\5D#\2\u0371\u0372\7"+
		"\36\2\2\u0372\u0373\5\u00e4s\2\u0373\u0374\7\27\2\2\u0374\u0375\5\u00be"+
		"`\2\u0375\u037b\3\2\2\2\u0376\u0377\7R\2\2\u0377\u037b\5H%\2\u0378\u0379"+
		"\7\u0084\2\2\u0379\u037b\5J&\2\u037a\u0370\3\2\2\2\u037a\u0371\3\2\2\2"+
		"\u037a\u0376\3\2\2\2\u037a\u0378\3\2\2\2\u037bC\3\2\2\2\u037c\u037d\5"+
		"\u00c8e\2\u037d\u037f\5\u00b8]\2\u037e\u0380\5F$\2\u037f\u037e\3\2\2\2"+
		"\u037f\u0380\3\2\2\2\u0380\u0383\3\2\2\2\u0381\u0382\7\35\2\2\u0382\u0384"+
		"\7\u00c7\2\2\u0383\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0386\3\2\2"+
		"\2\u0385\u0387\5L\'\2\u0386\u0385\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u038a"+
		"\3\2\2\2\u0388\u0389\7\u00ae\2\2\u0389\u038b\5\u00be`\2\u038a\u0388\3"+
		"\2\2\2\u038a\u038b\3\2\2\2\u038b\u039d\3\2\2\2\u038c\u038e\5\u00c8e\2"+
		"\u038d\u038f\5\u00b8]\2\u038e\u038d\3\2\2\2\u038e\u038f\3\2\2\2\u038f"+
		"\u0390\3\2\2\2\u0390\u0393\5F$\2\u0391\u0392\7\35\2\2\u0392\u0394\7\u00c7"+
		"\2\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0396\3\2\2\2\u0395"+
		"\u0397\5L\'\2\u0396\u0395\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u039a\3\2"+
		"\2\2\u0398\u0399\7\u00ae\2\2\u0399\u039b\5\u00be`\2\u039a\u0398\3\2\2"+
		"\2\u039a\u039b\3\2\2\2\u039b\u039d\3\2\2\2\u039c\u037c\3\2\2\2\u039c\u038c"+
		"\3\2\2\2\u039dE\3\2\2\2\u039e\u039f\t\4\2\2\u039f\u03a0\5\u00be`\2\u03a0"+
		"G\3\2\2\2\u03a1\u03a2\5\u00c8e\2\u03a2\u03a3\5\u00be`\2\u03a3\u03a4\7"+
		"\u00af\2\2\u03a4\u03a5\5\u00b8]\2\u03a5\u03a6\7I\2\2\u03a6\u03a7\7\u00c5"+
		"\2\2\u03a7I\3\2\2\2\u03a8\u03a9\5\u00c8e\2\u03a9\u03aa\5f\64\2\u03aaK"+
		"\3\2\2\2\u03ab\u03ac\7\32\2\2\u03ac\u03ad\7\u00d8\2\2\u03ad\u03b2\5N("+
		"\2\u03ae\u03af\7\u00cd\2\2\u03af\u03b1\5N(\2\u03b0\u03ae\3\2\2\2\u03b1"+
		"\u03b4\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b5\3\2"+
		"\2\2\u03b4\u03b2\3\2\2\2\u03b5\u03b6\7\u00e2\2\2\u03b6M\3\2\2\2\u03b7"+
		"\u03bd\5\u00e4s\2\u03b8\u03ba\7\u00d8\2\2\u03b9\u03bb\5\u00ba^\2\u03ba"+
		"\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03be\7\u00e2"+
		"\2\2\u03bd\u03b8\3\2\2\2\u03bd\u03be\3\2\2\2\u03beO\3\2\2\2\u03bf\u03c7"+
		"\5\u00be`\2\u03c0\u03c8\7*\2\2\u03c1\u03c2\7\u00a8\2\2\u03c2\u03c3\7\61"+
		"\2\2\u03c3\u03c8\7\u00c7\2\2\u03c4\u03c5\7\u00a8\2\2\u03c5\u03c6\7\u00b8"+
		"\2\2\u03c6\u03c8\7\u00c7\2\2\u03c7\u03c0\3\2\2\2\u03c7\u03c1\3\2\2\2\u03c7"+
		"\u03c4\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8Q\3\2\2\2\u03c9\u03cb\t\5\2\2"+
		"\u03ca\u03cc\7\u00a0\2\2\u03cb\u03ca\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc"+
		"\u03cd\3\2\2\2\u03cd\u03ce\5\u00caf\2\u03ceS\3\2\2\2\u03cf\u03d0\t\6\2"+
		"\2\u03d0\u03d3\7#\2\2\u03d1\u03d2\7O\2\2\u03d2\u03d4\79\2\2\u03d3\u03d1"+
		"\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d7\5\u00d4k"+
		"\2\u03d6\u03d8\5,\27\2\u03d7\u03d6\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03ef"+
		"\3\2\2\2\u03d9\u03e0\t\6\2\2\u03da\u03e1\7\60\2\2\u03db\u03dd\7\u00a2"+
		"\2\2\u03dc\u03db\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\3\2\2\2\u03de"+
		"\u03e1\7\u00a0\2\2\u03df\u03e1\7\u00b7\2\2\u03e0\u03da\3\2\2\2\u03e0\u03dc"+
		"\3\2\2\2\u03e0\u03df\3\2\2\2\u03e1\u03e4\3\2\2\2\u03e2\u03e3\7O\2\2\u03e3"+
		"\u03e5\79\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6\3\2"+
		"\2\2\u03e6\u03e8\5\u00ceh\2\u03e7\u03e9\5,\27\2\u03e8\u03e7\3\2\2\2\u03e8"+
		"\u03e9\3\2\2\2\u03e9\u03ec\3\2\2\2\u03ea\u03eb\7s\2\2\u03eb\u03ed\7)\2"+
		"\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ef\3\2\2\2\u03ee\u03cf"+
		"\3\2\2\2\u03ee\u03d9\3\2\2\2\u03efU\3\2\2\2\u03f0\u03f1\79\2\2\u03f1\u03f2"+
		"\7#\2\2\u03f2\u03fe\5\u00d4k\2\u03f3\u03fa\79\2\2\u03f4\u03fb\7\60\2\2"+
		"\u03f5\u03f7\7\u00a2\2\2\u03f6\u03f5\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7"+
		"\u03f8\3\2\2\2\u03f8\u03fb\7\u00a0\2\2\u03f9\u03fb\7\u00b7\2\2\u03fa\u03f4"+
		"\3\2\2\2\u03fa\u03f6\3\2\2\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb"+
		"\u03fc\3\2\2\2\u03fc\u03fe\5\u00ceh\2\u03fd\u03f0\3\2\2\2\u03fd\u03f3"+
		"\3\2\2\2\u03feW\3\2\2\2\u03ff\u0400\7:\2\2\u0400\u0401\7\17\2\2\u0401"+
		"\u0406\5\4\3\2\u0402\u0403\7:\2\2\u0403\u0404\7\u009e\2\2\u0404\u0406"+
		"\5\4\3\2\u0405\u03ff\3\2\2\2\u0405\u0402\3\2\2\2\u0406Y\3\2\2\2\u0407"+
		"\u0408\7V\2\2\u0408\u040a\7X\2\2\u0409\u040b\7\u00a0\2\2\u040a\u0409\3"+
		"\2\2\2\u040a\u040b\3\2\2\2\u040b\u040f\3\2\2\2\u040c\u0410\5\u00ceh\2"+
		"\u040d\u040e\7G\2\2\u040e\u0410\5\u00ccg\2\u040f\u040c\3\2\2\2\u040f\u040d"+
		"\3\2\2\2\u0410\u0412\3\2\2\2\u0411\u0413\5\\/\2\u0412\u0411\3\2\2\2\u0412"+
		"\u0413\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0415\5^\60\2\u0415[\3\2\2\2"+
		"\u0416\u0417\7\u00d8\2\2\u0417\u041c\5\u00c8e\2\u0418\u0419\7\u00cd\2"+
		"\2\u0419\u041b\5\u00c8e\2\u041a\u0418\3\2\2\2\u041b\u041e\3\2\2\2\u041c"+
		"\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041f\3\2\2\2\u041e\u041c\3\2"+
		"\2\2\u041f\u0420\7\u00e2\2\2\u0420]\3\2\2\2\u0421\u0422\7C\2\2\u0422\u042b"+
		"\5\u00e4s\2\u0423\u042b\7\u00b6\2\2\u0424\u0426\5h\65\2\u0425\u0427\7"+
		"\u00e3\2\2\u0426\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428\3\2\2\2"+
		"\u0428\u0429\7\2\2\3\u0429\u042b\3\2\2\2\u042a\u0421\3\2\2\2\u042a\u0423"+
		"\3\2\2\2\u042a\u0424\3\2\2\2\u042b_\3\2\2\2\u042c\u042d\7]\2\2\u042d\u042f"+
		"\7q\2\2\u042e\u0430\5,\27\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2\2\u0430"+
		"\u0431\3\2\2\2\u0431\u0433\5z>\2\u0432\u0434\t\7\2\2\u0433\u0432\3\2\2"+
		"\2\u0433\u0434\3\2\2\2\u0434a\3\2\2\2\u0435\u0436\7y\2\2\u0436\u0437\7"+
		"\u00a0\2\2\u0437\u0439\5\u00ceh\2\u0438\u043a\5,\27\2\u0439\u0438\3\2"+
		"\2\2\u0439\u043a\3\2\2\2\u043a\u043c\3\2\2\2\u043b\u043d\5\20\t\2\u043c"+
		"\u043b\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u043f\3\2\2\2\u043e\u0440\7>"+
		"\2\2\u043f\u043e\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0442\3\2\2\2\u0441"+
		"\u0443\7\'\2\2\u0442\u0441\3\2\2\2\u0442\u0443\3\2\2\2\u0443c\3\2\2\2"+
		"\u0444\u0445\7\u0089\2\2\u0445\u0446\7\u00a0\2\2\u0446\u0447\5\u00ceh"+
		"\2\u0447\u0448\7\u00a8\2\2\u0448\u0450\5\u00ceh\2\u0449\u044a\7\u00cd"+
		"\2\2\u044a\u044b\5\u00ceh\2\u044b\u044c\7\u00a8\2\2\u044c\u044d\5\u00ce"+
		"h\2\u044d\u044f\3\2\2\2\u044e\u0449\3\2\2\2\u044f\u0452\3\2\2\2\u0450"+
		"\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0454\3\2\2\2\u0452\u0450\3\2"+
		"\2\2\u0453\u0455\5,\27\2\u0454\u0453\3\2\2\2\u0454\u0455\3\2\2\2\u0455"+
		"e\3\2\2\2\u0456\u0458\7\u00d8\2\2\u0457\u0459\5n8\2\u0458\u0457\3\2\2"+
		"\2\u0458\u0459\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045b\7\u0093\2\2\u045b"+
		"\u045d\5\u00ba^\2\u045c\u045e\5|?\2\u045d\u045c\3\2\2\2\u045d\u045e\3"+
		"\2\2\2\u045e\u0460\3\2\2\2\u045f\u0461\5\u0082B\2\u0460\u045f\3\2\2\2"+
		"\u0460\u0461\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0463\7\u00e2\2\2\u0463"+
		"g\3\2\2\2\u0464\u046a\5j\66\2\u0465\u0466\7\u00b1\2\2\u0466\u0467\7\6"+
		"\2\2\u0467\u0469\5j\66\2\u0468\u0465\3\2\2\2\u0469\u046c\3\2\2\2\u046a"+
		"\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046bi\3\2\2\2\u046c\u046a\3\2\2\2"+
		"\u046d\u0473\5l\67\2\u046e\u046f\7\u00d8\2\2\u046f\u0470\5h\65\2\u0470"+
		"\u0471\7\u00e2\2\2\u0471\u0473\3\2\2\2\u0472\u046d\3\2\2\2\u0472\u046e"+
		"\3\2\2\2\u0473k\3\2\2\2\u0474\u0476\5n8\2\u0475\u0474\3\2\2\2\u0475\u0476"+
		"\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0479\7\u0093\2\2\u0478\u047a\7\62"+
		"\2\2\u0479\u0478\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047c\3\2\2\2\u047b"+
		"\u047d\5p9\2\u047c\u047b\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047e\3\2\2"+
		"\2\u047e\u0480\5\u00ba^\2\u047f\u0481\5r:\2\u0480\u047f\3\2\2\2\u0480"+
		"\u0481\3\2\2\2\u0481\u0483\3\2\2\2\u0482\u0484\5t;\2\u0483\u0482\3\2\2"+
		"\2\u0483\u0484\3\2\2\2\u0484\u0486\3\2\2\2\u0485\u0487\5v<\2\u0486\u0485"+
		"\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0489\3\2\2\2\u0488\u048a\5x=\2\u0489"+
		"\u0488\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048c\3\2\2\2\u048b\u048d\5z"+
		">\2\u048c\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048f\3\2\2\2\u048e"+
		"\u0490\5|?\2\u048f\u048e\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0493\3\2\2"+
		"\2\u0491\u0492\7\u00be\2\2\u0492\u0494\t\b\2\2\u0493\u0491\3\2\2\2\u0493"+
		"\u0494\3\2\2\2\u0494\u0497\3\2\2\2\u0495\u0496\7\u00be\2\2\u0496\u0498"+
		"\7\u00aa\2\2\u0497\u0495\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u049a\3\2\2"+
		"\2\u0499\u049b\5~@\2\u049a\u0499\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049d"+
		"\3\2\2\2\u049c\u049e\5\u0080A\2\u049d\u049c\3\2\2\2\u049d\u049e\3\2\2"+
		"\2\u049e\u04a0\3\2\2\2\u049f\u04a1\5\u0084C\2\u04a0\u049f\3\2\2\2\u04a0"+
		"\u04a1\3\2\2\2\u04a1\u04a3\3\2\2\2\u04a2\u04a4\5\u0086D\2\u04a3\u04a2"+
		"\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a6\3\2\2\2\u04a5\u04a7\5\u0088E"+
		"\2\u04a6\u04a5\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7m\3\2\2\2\u04a8\u04a9"+
		"\7\u00be\2\2\u04a9\u04aa\5\u00ba^\2\u04aao\3\2\2\2\u04ab\u04ac\7\u00a9"+
		"\2\2\u04ac\u04af\7\u00c5\2\2\u04ad\u04ae\7\u00be\2\2\u04ae\u04b0\7\u00a5"+
		"\2\2\u04af\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0q\3\2\2\2\u04b1\u04b2"+
		"\7E\2\2\u04b2\u04b3\5\u008aF\2\u04b3s\3\2\2\2\u04b4\u04b6\t\t\2\2\u04b5"+
		"\u04b4\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\7\13"+
		"\2\2\u04b8\u04b9\7[\2\2\u04b9\u04ba\5\u00ba^\2\u04bau\3\2\2\2\u04bb\u04bc"+
		"\7\u00bd\2\2\u04bc\u04bd\5\u00e4s\2\u04bd\u04be\7\f\2\2\u04be\u04bf\7"+
		"\u00d8\2\2\u04bf\u04c0\5\u00a0Q\2\u04c0\u04c1\7\u00e2\2\2\u04c1w\3\2\2"+
		"\2\u04c2\u04c3\7\u0082\2\2\u04c3\u04c4\5\u00be`\2\u04c4y\3\2\2\2\u04c5"+
		"\u04c6\7\u00bc\2\2\u04c6\u04c7\5\u00be`\2\u04c7{\3\2\2\2\u04c8\u04c9\7"+
		"J\2\2\u04c9\u04d0\7\24\2\2\u04ca\u04cb\t\b\2\2\u04cb\u04cc\7\u00d8\2\2"+
		"\u04cc\u04cd\5\u00ba^\2\u04cd\u04ce\7\u00e2\2\2\u04ce\u04d1\3\2\2\2\u04cf"+
		"\u04d1\5\u00ba^\2\u04d0\u04ca\3\2\2\2\u04d0\u04cf\3\2\2\2\u04d1}\3\2\2"+
		"\2\u04d2\u04d3\7K\2\2\u04d3\u04d4\5\u00be`\2\u04d4\177\3\2\2\2\u04d5\u04d6"+
		"\7{\2\2\u04d6\u04d7\7\24\2\2\u04d7\u04d8\5\u0096L\2\u04d8\u0081\3\2\2"+
		"\2\u04d9\u04da\7{\2\2\u04da\u04db\7\24\2\2\u04db\u04dc\5\u00ba^\2\u04dc"+
		"\u0083\3\2\2\2\u04dd\u04de\7d\2\2\u04de\u04df\5\u0094K\2\u04df\u04e0\7"+
		"\24\2\2\u04e0\u04e1\5\u00ba^\2\u04e1\u0085\3\2\2\2\u04e2\u04e3\7d\2\2"+
		"\u04e3\u04e6\5\u0094K\2\u04e4\u04e5\7\u00be\2\2\u04e5\u04e7\7\u00a5\2"+
		"\2\u04e6\u04e4\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u0087\3\2\2\2\u04e8\u04e9"+
		"\7\u0097\2\2\u04e9\u04ea\5\u009cO\2\u04ea\u0089\3\2\2\2\u04eb\u04ec\b"+
		"F\1\2\u04ec\u04ee\5\u00caf\2\u04ed\u04ef\7>\2\2\u04ee\u04ed\3\2\2\2\u04ee"+
		"\u04ef\3\2\2\2\u04ef\u04f1\3\2\2\2\u04f0\u04f2\5\u0092J\2\u04f1\u04f0"+
		"\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f8\3\2\2\2\u04f3\u04f4\7\u00d8\2"+
		"\2\u04f4\u04f5\5\u008aF\2\u04f5\u04f6\7\u00e2\2\2\u04f6\u04f8\3\2\2\2"+
		"\u04f7\u04eb\3\2\2\2\u04f7\u04f3\3\2\2\2\u04f8\u050a\3\2\2\2\u04f9\u04fa"+
		"\f\5\2\2\u04fa\u04fb\5\u008eH\2\u04fb\u04fc\5\u008aF\6\u04fc\u0509\3\2"+
		"\2\2\u04fd\u04ff\f\6\2\2\u04fe\u0500\t\n\2\2\u04ff\u04fe\3\2\2\2\u04ff"+
		"\u0500\3\2\2\2\u0500\u0502\3\2\2\2\u0501\u0503\5\u008cG\2\u0502\u0501"+
		"\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0505\7[\2\2\u0505"+
		"\u0506\5\u008aF\2\u0506\u0507\5\u0090I\2\u0507\u0509\3\2\2\2\u0508\u04f9"+
		"\3\2\2\2\u0508\u04fd\3\2\2\2\u0509\u050c\3\2\2\2\u050a\u0508\3\2\2\2\u050a"+
		"\u050b\3\2\2\2\u050b\u008b\3\2\2\2\u050c\u050a\3\2\2\2\u050d\u050f\t\13"+
		"\2\2\u050e\u050d\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0510\3\2\2\2\u0510"+
		"\u0517\7U\2\2\u0511\u0513\7U\2\2\u0512\u0514\t\13\2\2\u0513\u0512\3\2"+
		"\2\2\u0513\u0514\3\2\2\2\u0514\u0517\3\2\2\2\u0515\u0517\t\13\2\2\u0516"+
		"\u050e\3\2\2\2\u0516\u0511\3\2\2\2\u0516\u0515\3\2\2\2\u0517\u0539\3\2"+
		"\2\2\u0518\u051a\t\f\2\2\u0519\u0518\3\2\2\2\u0519\u051a\3\2\2\2\u051a"+
		"\u051b\3\2\2\2\u051b\u051d\t\r\2\2\u051c\u051e\7|\2\2\u051d\u051c\3\2"+
		"\2\2\u051d\u051e\3\2\2\2\u051e\u0527\3\2\2\2\u051f\u0521\t\r\2\2\u0520"+
		"\u0522\7|\2\2\u0521\u0520\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0524\3\2"+
		"\2\2\u0523\u0525\t\f\2\2\u0524\u0523\3\2\2\2\u0524\u0525\3\2\2\2\u0525"+
		"\u0527\3\2\2\2\u0526\u0519\3\2\2\2\u0526\u051f\3\2\2\2\u0527\u0539\3\2"+
		"\2\2\u0528\u052a\t\16\2\2\u0529\u0528\3\2\2\2\u0529\u052a\3\2\2\2\u052a"+
		"\u052b\3\2\2\2\u052b\u052d\7F\2\2\u052c\u052e\7|\2\2\u052d\u052c\3\2\2"+
		"\2\u052d\u052e\3\2\2\2\u052e\u0537\3\2\2\2\u052f\u0531\7F\2\2\u0530\u0532"+
		"\7|\2\2\u0531\u0530\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0534\3\2\2\2\u0533"+
		"\u0535\t\16\2\2\u0534\u0533\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0537\3"+
		"\2\2\2\u0536\u0529\3\2\2\2\u0536\u052f\3\2\2\2\u0537\u0539\3\2\2\2\u0538"+
		"\u0516\3\2\2\2\u0538\u0526\3\2\2\2\u0538\u0536\3\2\2\2\u0539\u008d\3\2"+
		"\2\2\u053a\u053c\t\n\2\2\u053b\u053a\3\2\2\2\u053b\u053c\3\2\2\2\u053c"+
		"\u053d\3\2\2\2\u053d\u053e\7 \2\2\u053e\u0541\7[\2\2\u053f\u0541\7\u00cd"+
		"\2\2\u0540\u053b\3\2\2\2\u0540\u053f\3\2\2\2\u0541\u008f\3\2\2\2\u0542"+
		"\u0543\7x\2\2\u0543\u054c\5\u00ba^\2\u0544\u0545\7\u00b4\2\2\u0545\u0546"+
		"\7\u00d8\2\2\u0546\u0547\5\u00ba^\2\u0547\u0548\7\u00e2\2\2\u0548\u054c"+
		"\3\2\2\2\u0549\u054a\7\u00b4\2\2\u054a\u054c\5\u00ba^\2\u054b\u0542\3"+
		"\2\2\2\u054b\u0544\3\2\2\2\u054b\u0549\3\2\2\2\u054c\u0091\3\2\2\2\u054d"+
		"\u054e\7\u0091\2\2\u054e\u0551\5\u009aN\2\u054f\u0550\7w\2\2\u0550\u0552"+
		"\5\u009aN\2\u0551\u054f\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0093\3\2\2"+
		"\2\u0553\u0556\5\u00be`\2\u0554\u0555\t\17\2\2\u0555\u0557\5\u00be`\2"+
		"\u0556\u0554\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0095\3\2\2\2\u0558\u055d"+
		"\5\u0098M\2\u0559\u055a\7\u00cd\2\2\u055a\u055c\5\u0098M\2\u055b\u0559"+
		"\3\2\2\2\u055c\u055f\3\2\2\2\u055d\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e"+
		"\u0097\3\2\2\2\u055f\u055d\3\2\2\2\u0560\u0562\5\u00be`\2\u0561\u0563"+
		"\t\20\2\2\u0562\u0561\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0566\3\2\2\2"+
		"\u0564\u0565\7v\2\2\u0565\u0567\t\21\2\2\u0566\u0564\3\2\2\2\u0566\u0567"+
		"\3\2\2\2\u0567\u056a\3\2\2\2\u0568\u0569\7\33\2\2\u0569\u056b\7\u00c7"+
		"\2\2\u056a\u0568\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u0099\3\2\2\2\u056c"+
		"\u056f\5\u00d8m\2\u056d\u056e\7\u00e4\2\2\u056e\u0570\5\u00d8m\2\u056f"+
		"\u056d\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u009b\3\2\2\2\u0571\u0576\5\u009e"+
		"P\2\u0572\u0573\7\u00cd\2\2\u0573\u0575\5\u009eP\2\u0574\u0572\3\2\2\2"+
		"\u0575\u0578\3\2\2\2\u0576\u0574\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u009d"+
		"\3\2\2\2\u0578\u0576\3\2\2\2\u0579\u057a\5\u00e4s\2\u057a\u057b\7\u00d2"+
		"\2\2\u057b\u057c\5\u00dan\2\u057c\u009f\3\2\2\2\u057d\u057f\5\u00a2R\2"+
		"\u057e\u057d\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0581\3\2\2\2\u0580\u0582"+
		"\5\u00a4S\2\u0581\u0580\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0584\3\2\2"+
		"\2\u0583\u0585\5\u00a6T\2\u0584\u0583\3\2\2\2\u0584\u0585\3\2\2\2\u0585"+
		"\u00a1\3\2\2\2\u0586\u0587\7\177\2\2\u0587\u0588\7\24\2\2\u0588\u0589"+
		"\5\u00ba^\2\u0589\u00a3\3\2\2\2\u058a\u058b\7{\2\2\u058b\u058c\7\24\2"+
		"\2\u058c\u058d\5\u0096L\2\u058d\u00a5\3\2\2\2\u058e\u058f\t\22\2\2\u058f"+
		"\u0590\5\u00a8U\2\u0590\u00a7\3\2\2\2\u0591\u0598\5\u00aaV\2\u0592\u0593"+
		"\7\22\2\2\u0593\u0594\5\u00aaV\2\u0594\u0595\7\b\2\2\u0595\u0596\5\u00aa"+
		"V\2\u0596\u0598\3\2\2\2\u0597\u0591\3\2\2\2\u0597\u0592\3\2\2\2\u0598"+
		"\u00a9\3\2\2\2\u0599\u059a\7\"\2\2\u059a\u05a6\7\u008f\2\2\u059b\u059c"+
		"\7\u00b0\2\2\u059c\u05a6\7\u0081\2\2\u059d\u059e\7\u00b0\2\2\u059e\u05a6"+
		"\7A\2\2\u059f\u05a0\5\u00d8m\2\u05a0\u05a1\7\u0081\2\2\u05a1\u05a6\3\2"+
		"\2\2\u05a2\u05a3\5\u00d8m\2\u05a3\u05a4\7A\2\2\u05a4\u05a6\3\2\2\2\u05a5"+
		"\u0599\3\2\2\2\u05a5\u059b\3\2\2\2\u05a5\u059d\3\2\2\2\u05a5\u059f\3\2"+
		"\2\2\u05a5\u05a2\3\2\2\2\u05a6\u00ab\3\2\2\2\u05a7\u05a8\7\u0096\2\2\u05a8"+
		"\u05a9\5\u009cO\2\u05a9\u00ad\3\2\2\2\u05aa\u05ab\7\u0098\2\2\u05ab\u05ac"+
		"\7\37\2\2\u05ac\u05ad\7#\2\2\u05ad\u05d5\5\u00d4k\2\u05ae\u05af\7\u0098"+
		"\2\2\u05af\u05b0\7\37\2\2\u05b0\u05b1\7\60\2\2\u05b1\u05d5\5\u00ceh\2"+
		"\u05b2\u05b3\7\u0098\2\2\u05b3\u05b5\7\37\2\2\u05b4\u05b6\7\u00a2\2\2"+
		"\u05b5\u05b4\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b8\3\2\2\2\u05b7\u05b9"+
		"\7\u00a0\2\2\u05b8\u05b7\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05ba\3\2\2"+
		"\2\u05ba\u05d5\5\u00ceh\2\u05bb\u05bc\7\u0098\2\2\u05bc\u05d5\7$\2\2\u05bd"+
		"\u05be\7\u0098\2\2\u05be\u05c1\7/\2\2\u05bf\u05c0\7E\2\2\u05c0\u05c2\5"+
		"\u00d4k\2\u05c1\u05bf\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05d5\3\2\2\2"+
		"\u05c3\u05c5\7\u0098\2\2\u05c4\u05c6\7\u00a2\2\2\u05c5\u05c4\3\2\2\2\u05c5"+
		"\u05c6\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05ca\7\u00a1\2\2\u05c8\u05c9"+
		"\t\23\2\2\u05c9\u05cb\5\u00d4k\2\u05ca\u05c8\3\2\2\2\u05ca\u05cb\3\2\2"+
		"\2\u05cb\u05cf\3\2\2\2\u05cc\u05cd\7c\2\2\u05cd\u05d0\7\u00c7\2\2\u05ce"+
		"\u05d0\5z>\2\u05cf\u05cc\3\2\2\2\u05cf\u05ce\3\2\2\2\u05cf\u05d0\3\2\2"+
		"\2\u05d0\u05d2\3\2\2\2\u05d1\u05d3\5\u0086D\2\u05d2\u05d1\3\2\2\2\u05d2"+
		"\u05d3\3\2\2\2\u05d3\u05d5\3\2\2\2\u05d4\u05aa\3\2\2\2\u05d4\u05ae\3\2"+
		"\2\2\u05d4\u05b2\3\2\2\2\u05d4\u05bb\3\2\2\2\u05d4\u05bd\3\2\2\2\u05d4"+
		"\u05c3\3\2\2\2\u05d5\u00af\3\2\2\2\u05d6\u05d7\7\u009f\2\2\u05d7\u05d8"+
		"\7@\2\2\u05d8\u05d9\7\63\2\2\u05d9\u05f9\5\u00ceh\2\u05da\u05db\7\u009f"+
		"\2\2\u05db\u05dc\7@\2\2\u05dc\u05f9\7g\2\2\u05dd\u05de\7\u009f\2\2\u05de"+
		"\u05df\7\u0087\2\2\u05df\u05f9\7/\2\2\u05e0\u05e1\7\u009f\2\2\u05e1\u05e2"+
		"\7\u0087\2\2\u05e2\u05e3\7\60\2\2\u05e3\u05f9\5\u00ceh\2\u05e4\u05e5\7"+
		"\u009f\2\2\u05e5\u05ed\t\24\2\2\u05e6\u05e7\7\63\2\2\u05e7\u05ee\7\u0095"+
		"\2\2\u05e8\u05ee\7=\2\2\u05e9\u05eb\7\u00ae\2\2\u05ea\u05e9\3\2\2\2\u05ea"+
		"\u05eb\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ee\7k\2\2\u05ed\u05e6\3\2"+
		"\2\2\u05ed\u05e8\3\2\2\2\u05ed\u05ea\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef"+
		"\u05f9\5\u00ceh\2\u05f0\u05f1\7\u009f\2\2\u05f1\u05f2\t\24\2\2\u05f2\u05f3"+
		"\7\u008c\2\2\u05f3\u05f9\7\u0095\2\2\u05f4\u05f5\7\u009f\2\2\u05f5\u05f6"+
		"\7\u009d\2\2\u05f6\u05f7\7\u008b\2\2\u05f7\u05f9\5\u00ceh\2\u05f8\u05d6"+
		"\3\2\2\2\u05f8\u05da\3\2\2\2\u05f8\u05dd\3\2\2\2\u05f8\u05e0\3\2\2\2\u05f8"+
		"\u05e4\3\2\2\2\u05f8\u05f0\3\2\2\2\u05f8\u05f4\3\2\2\2\u05f9\u00b1\3\2"+
		"\2\2\u05fa\u05fc\7\u00ad\2\2\u05fb\u05fd\7\u00a2\2\2\u05fc\u05fb\3\2\2"+
		"\2\u05fc\u05fd\3\2\2\2\u05fd\u05ff\3\2\2\2\u05fe\u0600\7\u00a0\2\2\u05ff"+
		"\u05fe\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0603\3\2\2\2\u0601\u0602\7O"+
		"\2\2\u0602\u0604\79\2\2\u0603\u0601\3\2\2\2\u0603\u0604\3\2\2\2\u0604"+
		"\u0605\3\2\2\2\u0605\u0607\5\u00ceh\2\u0606\u0608\5,\27\2\u0607\u0606"+
		"\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u00b3\3\2\2\2\u0609\u060a\7\u00b3\2"+
		"\2\u060a\u060b\5\u00d4k\2\u060b\u00b5\3\2\2\2\u060c\u060d\7\u00b9\2\2"+
		"\u060d\u060f\5\u00ceh\2\u060e\u0610\78\2\2\u060f\u060e\3\2\2\2\u060f\u0610"+
		"\3\2\2\2\u0610\u0613\3\2\2\2\u0611\u0612\7d\2\2\u0612\u0614\7\u00c5\2"+
		"\2\u0613\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u00b7\3\2\2\2\u0615\u0645"+
		"\5\u00e4s\2\u0616\u0617\5\u00e4s\2\u0617\u0618\7\u00d8\2\2\u0618\u0619"+
		"\5\u00e4s\2\u0619\u0620\5\u00b8]\2\u061a\u061b\7\u00cd\2\2\u061b\u061c"+
		"\5\u00e4s\2\u061c\u061d\5\u00b8]\2\u061d\u061f\3\2\2\2\u061e\u061a\3\2"+
		"\2\2\u061f\u0622\3\2\2\2\u0620\u061e\3\2\2\2\u0620\u0621\3\2\2\2\u0621"+
		"\u0623\3\2\2\2\u0622\u0620\3\2\2\2\u0623\u0624\7\u00e2\2\2\u0624\u0645"+
		"\3\2\2\2\u0625\u0626\5\u00e4s\2\u0626\u0627\7\u00d8\2\2\u0627\u062c\5"+
		"\u00e8u\2\u0628\u0629\7\u00cd\2\2\u0629\u062b\5\u00e8u\2\u062a\u0628\3"+
		"\2\2\2\u062b\u062e\3\2\2\2\u062c\u062a\3\2\2\2\u062c\u062d\3\2\2\2\u062d"+
		"\u062f\3\2\2\2\u062e\u062c\3\2\2\2\u062f\u0630\7\u00e2\2\2\u0630\u0645"+
		"\3\2\2\2\u0631\u0632\5\u00e4s\2\u0632\u0633\7\u00d8\2\2\u0633\u0638\5"+
		"\u00b8]\2\u0634\u0635\7\u00cd\2\2\u0635\u0637\5\u00b8]\2\u0636\u0634\3"+
		"\2\2\2\u0637\u063a\3\2\2\2\u0638\u0636\3\2\2\2\u0638\u0639\3\2\2\2\u0639"+
		"\u063b\3\2\2\2\u063a\u0638\3\2\2\2\u063b\u063c\7\u00e2\2\2\u063c\u0645"+
		"\3\2\2\2\u063d\u063e\5\u00e4s\2\u063e\u0640\7\u00d8\2\2\u063f\u0641\5"+
		"\u00ba^\2\u0640\u063f\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0642\3\2\2\2"+
		"\u0642\u0643\7\u00e2\2\2\u0643\u0645\3\2\2\2\u0644\u0615\3\2\2\2\u0644"+
		"\u0616\3\2\2\2\u0644\u0625\3\2\2\2\u0644\u0631\3\2\2\2\u0644\u063d\3\2"+
		"\2\2\u0645\u00b9\3\2\2\2\u0646\u064b\5\u00bc_\2\u0647\u0648\7\u00cd\2"+
		"\2\u0648\u064a\5\u00bc_\2\u0649\u0647\3\2\2\2\u064a\u064d\3\2\2\2\u064b"+
		"\u0649\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u00bb\3\2\2\2\u064d\u064b\3\2"+
		"\2\2\u064e\u064f\5\u00ceh\2\u064f\u0650\7\u00d0\2\2\u0650\u0652\3\2\2"+
		"\2\u0651\u064e\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u065a"+
		"\7\u00c9\2\2\u0654\u0655\7\u00d8\2\2\u0655\u0656\5h\65\2\u0656\u0657\7"+
		"\u00e2\2\2\u0657\u065a\3\2\2\2\u0658\u065a\5\u00be`\2\u0659\u0651\3\2"+
		"\2\2\u0659\u0654\3\2\2\2\u0659\u0658\3\2\2\2\u065a\u00bd\3\2\2\2\u065b"+
		"\u065c\b`\1\2\u065c\u065e\7\25\2\2\u065d\u065f\5\u00be`\2\u065e\u065d"+
		"\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0665\3\2\2\2\u0660\u0661\7\u00bb\2"+
		"\2\u0661\u0662\5\u00be`\2\u0662\u0663\7\u00a4\2\2\u0663\u0664\5\u00be"+
		"`\2\u0664\u0666\3\2\2\2\u0665\u0660\3\2\2\2\u0666\u0667\3\2\2\2\u0667"+
		"\u0665\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u066b\3\2\2\2\u0669\u066a\7\65"+
		"\2\2\u066a\u066c\5\u00be`\2\u066b\u0669\3\2\2\2\u066b\u066c\3\2\2\2\u066c"+
		"\u066d\3\2\2\2\u066d\u066e\7\66\2\2\u066e\u06dd\3\2\2\2\u066f\u0670\7"+
		"\26\2\2\u0670\u0671\7\u00d8\2\2\u0671\u0672\5\u00be`\2\u0672\u0673\7\f"+
		"\2\2\u0673\u0674\5\u00b8]\2\u0674\u0675\7\u00e2\2\2\u0675\u06dd\3\2\2"+
		"\2\u0676\u0677\7%\2\2\u0677\u06dd\7\u00c7\2\2\u0678\u0679\7<\2\2\u0679"+
		"\u067a\7\u00d8\2\2\u067a\u067b\5\u00dco\2\u067b\u067c\7E\2\2\u067c\u067d"+
		"\5\u00be`\2\u067d\u067e\7\u00e2\2\2\u067e\u06dd\3\2\2\2\u067f\u0680\7"+
		"W\2\2\u0680\u0681\5\u00be`\2\u0681\u0682\5\u00dco\2\u0682\u06dd\3\2\2"+
		"\2\u0683\u0684\7\u009c\2\2\u0684\u0685\7\u00d8\2\2\u0685\u0686\5\u00be"+
		"`\2\u0686\u0687\7E\2\2\u0687\u068a\5\u00be`\2\u0688\u0689\7B\2\2\u0689"+
		"\u068b\5\u00be`\2\u068a\u0688\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068c"+
		"\3\2\2\2\u068c\u068d\7\u00e2\2\2\u068d\u06dd\3\2\2\2\u068e\u068f\7\u00a7"+
		"\2\2\u068f\u06dd\7\u00c7\2\2\u0690\u0691\7\u00ac\2\2\u0691\u0692\7\u00d8"+
		"\2\2\u0692\u0693\t\25\2\2\u0693\u0694\7\u00c7\2\2\u0694\u0695\7E\2\2\u0695"+
		"\u0696\5\u00be`\2\u0696\u0697\7\u00e2\2\2\u0697\u06dd\3\2\2\2\u0698\u0699"+
		"\5\u00e4s\2\u0699\u069b\7\u00d8\2\2\u069a\u069c\5\u00ba^\2\u069b\u069a"+
		"\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069e\7\u00e2\2"+
		"\2\u069e\u069f\3\2\2\2\u069f\u06a0\7~\2\2\u06a0\u06a1\7\u00d8\2\2\u06a1"+
		"\u06a2\5\u00a0Q\2\u06a2\u06a3\7\u00e2\2\2\u06a3\u06dd\3\2\2\2\u06a4\u06a5"+
		"\5\u00e4s\2\u06a5\u06a7\7\u00d8\2\2\u06a6\u06a8\5\u00ba^\2\u06a7\u06a6"+
		"\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06aa\7\u00e2\2"+
		"\2\u06aa\u06ab\3\2\2\2\u06ab\u06ac\7~\2\2\u06ac\u06ad\5\u00e4s\2\u06ad"+
		"\u06dd\3\2\2\2\u06ae\u06b4\5\u00e4s\2\u06af\u06b1\7\u00d8\2\2\u06b0\u06b2"+
		"\5\u00ba^\2\u06b1\u06b0\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b3\3\2\2"+
		"\2\u06b3\u06b5\7\u00e2\2\2\u06b4\u06af\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5"+
		"\u06b6\3\2\2\2\u06b6\u06b8\7\u00d8\2\2\u06b7\u06b9\7\62\2\2\u06b8\u06b7"+
		"\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06bb\3\2\2\2\u06ba\u06bc\5\u00c0a"+
		"\2\u06bb\u06ba\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\u06be"+
		"\7\u00e2\2\2\u06be\u06dd\3\2\2\2\u06bf\u06dd\5\u00dan\2\u06c0\u06c1\7"+
		"\u00cf\2\2\u06c1\u06dd\5\u00be`\23\u06c2\u06c3\7t\2\2\u06c3\u06dd\5\u00be"+
		"`\16\u06c4\u06c5\5\u00ceh\2\u06c5\u06c6\7\u00d0\2\2\u06c6\u06c8\3\2\2"+
		"\2\u06c7\u06c4\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06dd"+
		"\7\u00c9\2\2\u06ca\u06cb\7\u00d8\2\2\u06cb\u06cc\5h\65\2\u06cc\u06cd\7"+
		"\u00e2\2\2\u06cd\u06dd\3\2\2\2\u06ce\u06cf\7\u00d8\2\2\u06cf\u06d0\5\u00be"+
		"`\2\u06d0\u06d1\7\u00e2\2\2\u06d1\u06dd\3\2\2\2\u06d2\u06d3\7\u00d8\2"+
		"\2\u06d3\u06d4\5\u00ba^\2\u06d4\u06d5\7\u00e2\2\2\u06d5\u06dd\3\2\2\2"+
		"\u06d6\u06d8\7\u00d6\2\2\u06d7\u06d9\5\u00ba^\2\u06d8\u06d7\3\2\2\2\u06d8"+
		"\u06d9\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06dd\7\u00e1\2\2\u06db\u06dd"+
		"\5\u00c6d\2\u06dc\u065b\3\2\2\2\u06dc\u066f\3\2\2\2\u06dc\u0676\3\2\2"+
		"\2\u06dc\u0678\3\2\2\2\u06dc\u067f\3\2\2\2\u06dc\u0683\3\2\2\2\u06dc\u068e"+
		"\3\2\2\2\u06dc\u0690\3\2\2\2\u06dc\u0698\3\2\2\2\u06dc\u06a4\3\2\2\2\u06dc"+
		"\u06ae\3\2\2\2\u06dc\u06bf\3\2\2\2\u06dc\u06c0\3\2\2\2\u06dc\u06c2\3\2"+
		"\2\2\u06dc\u06c7\3\2\2\2\u06dc\u06ca\3\2\2\2\u06dc\u06ce\3\2\2\2\u06dc"+
		"\u06d2\3\2\2\2\u06dc\u06d6\3\2\2\2\u06dc\u06db\3\2\2\2\u06dd\u0725\3\2"+
		"\2\2\u06de\u06df\f\22\2\2\u06df\u06e0\t\26\2\2\u06e0\u0724\5\u00be`\23"+
		"\u06e1\u06e2\f\21\2\2\u06e2\u06e3\t\27\2\2\u06e3\u0724\5\u00be`\22\u06e4"+
		"\u06f7\f\20\2\2\u06e5\u06f8\7\u00d1\2\2\u06e6\u06f8\7\u00d2\2\2\u06e7"+
		"\u06f8\7\u00da\2\2\u06e8\u06f8\7\u00d7\2\2\u06e9\u06f8\7\u00d3\2\2\u06ea"+
		"\u06f8\7\u00d9\2\2\u06eb\u06f8\7\u00d4\2\2\u06ec\u06ee\7H\2\2\u06ed\u06ec"+
		"\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06f0\3\2\2\2\u06ef\u06f1\7t\2\2\u06f0"+
		"\u06ef\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2\u06f8\7Q"+
		"\2\2\u06f3\u06f5\7t\2\2\u06f4\u06f3\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5"+
		"\u06f6\3\2\2\2\u06f6\u06f8\t\30\2\2\u06f7\u06e5\3\2\2\2\u06f7\u06e6\3"+
		"\2\2\2\u06f7\u06e7\3\2\2\2\u06f7\u06e8\3\2\2\2\u06f7\u06e9\3\2\2\2\u06f7"+
		"\u06ea\3\2\2\2\u06f7\u06eb\3\2\2\2\u06f7\u06ed\3\2\2\2\u06f7\u06f4\3\2"+
		"\2\2\u06f8\u06f9\3\2\2\2\u06f9\u0724\5\u00be`\21\u06fa\u06fb\f\r\2\2\u06fb"+
		"\u06fc\7\b\2\2\u06fc\u0724\5\u00be`\16\u06fd\u06fe\f\f\2\2\u06fe\u06ff"+
		"\7z\2\2\u06ff\u0724\5\u00be`\r\u0700\u0702\f\13\2\2\u0701\u0703\7t\2\2"+
		"\u0702\u0701\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u0704\3\2\2\2\u0704\u0705"+
		"\7\22\2\2\u0705\u0706\5\u00be`\2\u0706\u0707\7\b\2\2\u0707\u0708\5\u00be"+
		"`\f\u0708\u0724\3\2\2\2\u0709\u070a\f\n\2\2\u070a\u070b\7\u00dd\2\2\u070b"+
		"\u070c\5\u00be`\2\u070c\u070d\7\u00cc\2\2\u070d\u070e\5\u00be`\n\u070e"+
		"\u0724\3\2\2\2\u070f\u0710\f\25\2\2\u0710\u0711\7\u00d6\2\2\u0711\u0712"+
		"\5\u00be`\2\u0712\u0713\7\u00e1\2\2\u0713\u0724\3\2\2\2\u0714\u0715\f"+
		"\24\2\2\u0715\u0716\7\u00d0\2\2\u0716\u0724\7\u00c5\2\2\u0717\u0718\f"+
		"\17\2\2\u0718\u071a\7Y\2\2\u0719\u071b\7t\2\2\u071a\u0719\3\2\2\2\u071a"+
		"\u071b\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u0724\7u\2\2\u071d\u0721\f\t"+
		"\2\2\u071e\u0722\5\u00e2r\2\u071f\u0720\7\f\2\2\u0720\u0722\5\u00e4s\2"+
		"\u0721\u071e\3\2\2\2\u0721\u071f\3\2\2\2\u0722\u0724\3\2\2\2\u0723\u06de"+
		"\3\2\2\2\u0723\u06e1\3\2\2\2\u0723\u06e4\3\2\2\2\u0723\u06fa\3\2\2\2\u0723"+
		"\u06fd\3\2\2\2\u0723\u0700\3\2\2\2\u0723\u0709\3\2\2\2\u0723\u070f\3\2"+
		"\2\2\u0723\u0714\3\2\2\2\u0723\u0717\3\2\2\2\u0723\u071d\3\2\2\2\u0724"+
		"\u0727\3\2\2\2\u0725\u0723\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u00bf\3\2"+
		"\2\2\u0727\u0725\3\2\2\2\u0728\u072d\5\u00c2b\2\u0729\u072a\7\u00cd\2"+
		"\2\u072a\u072c\5\u00c2b\2\u072b\u0729\3\2\2\2\u072c\u072f\3\2\2\2\u072d"+
		"\u072b\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u00c1\3\2\2\2\u072f\u072d\3\2"+
		"\2\2\u0730\u0733\5\u00c4c\2\u0731\u0733\5\u00be`\2\u0732\u0730\3\2\2\2"+
		"\u0732\u0731\3\2\2\2\u0733\u00c3\3\2\2\2\u0734\u0735\7\u00d8\2\2\u0735"+
		"\u073a\5\u00e4s\2\u0736\u0737\7\u00cd\2\2\u0737\u0739\5\u00e4s\2\u0738"+
		"\u0736\3\2\2\2\u0739\u073c\3\2\2\2\u073a\u0738\3\2\2\2\u073a\u073b\3\2"+
		"\2\2\u073b\u073d\3\2\2\2\u073c\u073a\3\2\2\2\u073d\u073e\7\u00e2\2\2\u073e"+
		"\u0748\3\2\2\2\u073f\u0744\5\u00e4s\2\u0740\u0741\7\u00cd\2\2\u0741\u0743"+
		"\5\u00e4s\2\u0742\u0740\3\2\2\2\u0743\u0746\3\2\2\2\u0744\u0742\3\2\2"+
		"\2\u0744\u0745\3\2\2\2\u0745\u0748\3\2\2\2\u0746\u0744\3\2\2\2\u0747\u0734"+
		"\3\2\2\2\u0747\u073f\3\2\2\2\u0748\u0749\3\2\2\2\u0749\u074a\7\u00c8\2"+
		"\2\u074a\u074b\5\u00be`\2\u074b\u00c5\3\2\2\2\u074c\u074d\5\u00ceh\2\u074d"+
		"\u074e\7\u00d0\2\2\u074e\u0750\3\2\2\2\u074f\u074c\3\2\2\2\u074f\u0750"+
		"\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u0752\5\u00c8e\2\u0752\u00c7\3\2\2"+
		"\2\u0753\u0756\5\u00e4s\2\u0754\u0755\7\u00d0\2\2\u0755\u0757\5\u00e4"+
		"s\2\u0756\u0754\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u00c9\3\2\2\2\u0758"+
		"\u0759\bf\1\2\u0759\u0760\5\u00ceh\2\u075a\u0760\5\u00ccg\2\u075b\u075c"+
		"\7\u00d8\2\2\u075c\u075d\5h\65\2\u075d\u075e\7\u00e2\2\2\u075e\u0760\3"+
		"\2\2\2\u075f\u0758\3\2\2\2\u075f\u075a\3\2\2\2\u075f\u075b\3\2\2\2\u0760"+
		"\u0769\3\2\2\2\u0761\u0765\f\3\2\2\u0762\u0766\5\u00e2r\2\u0763\u0764"+
		"\7\f\2\2\u0764\u0766\5\u00e4s\2\u0765\u0762\3\2\2\2\u0765\u0763\3\2\2"+
		"\2\u0766\u0768\3\2\2\2\u0767\u0761\3\2\2\2\u0768\u076b\3\2\2\2\u0769\u0767"+
		"\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u00cb\3\2\2\2\u076b\u0769\3\2\2\2\u076c"+
		"\u076d\5\u00e4s\2\u076d\u076f\7\u00d8\2\2\u076e\u0770\5\u00d0i\2\u076f"+
		"\u076e\3\2\2\2\u076f\u0770\3\2\2\2\u0770\u0771\3\2\2\2\u0771\u0772\7\u00e2"+
		"\2\2\u0772\u00cd\3\2\2\2\u0773\u0774\5\u00d4k\2\u0774\u0775\7\u00d0\2"+
		"\2\u0775\u0777\3\2\2\2\u0776\u0773\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u0778"+
		"\3\2\2\2\u0778\u0779\5\u00e4s\2\u0779\u00cf\3\2\2\2\u077a\u077f\5\u00d2"+
		"j\2\u077b\u077c\7\u00cd\2\2\u077c\u077e\5\u00d2j\2\u077d\u077b\3\2\2\2"+
		"\u077e\u0781\3\2\2\2\u077f\u077d\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u00d1"+
		"\3\2\2\2\u0781\u077f\3\2\2\2\u0782\u0786\5\u00c8e\2\u0783\u0786\5\u00cc"+
		"g\2\u0784\u0786\5\u00dan\2\u0785\u0782\3\2\2\2\u0785\u0783\3\2\2\2\u0785"+
		"\u0784\3\2\2\2\u0786\u00d3\3\2\2\2\u0787\u0788\5\u00e4s\2\u0788\u00d5"+
		"\3\2\2\2\u0789\u0792\7\u00c3\2\2\u078a\u078b\7\u00d0\2\2\u078b\u0792\t"+
		"\31\2\2\u078c\u078d\7\u00c5\2\2\u078d\u078f\7\u00d0\2\2\u078e\u0790\t"+
		"\31\2\2\u078f\u078e\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0792\3\2\2\2\u0791"+
		"\u0789\3\2\2\2\u0791\u078a\3\2\2\2\u0791\u078c\3\2\2\2\u0792\u00d7\3\2"+
		"\2\2\u0793\u0795\t\32\2\2\u0794\u0793\3\2\2\2\u0794\u0795\3\2\2\2\u0795"+
		"\u079c\3\2\2\2\u0796\u079d\5\u00d6l\2\u0797\u079d\7\u00c4\2\2\u0798\u079d"+
		"\7\u00c5\2\2\u0799\u079d\7\u00c6\2\2\u079a\u079d\7S\2\2\u079b\u079d\7"+
		"r\2\2\u079c\u0796\3\2\2\2\u079c\u0797\3\2\2\2\u079c\u0798\3\2\2\2\u079c"+
		"\u0799\3\2\2\2\u079c\u079a\3\2\2\2\u079c\u079b\3\2\2\2\u079d\u00d9\3\2"+
		"\2\2\u079e\u07a2\5\u00d8m\2\u079f\u07a2\7\u00c7\2\2\u07a0\u07a2\7u\2\2"+
		"\u07a1\u079e\3\2\2\2\u07a1\u079f\3\2\2\2\u07a1\u07a0\3\2\2\2\u07a2\u00db"+
		"\3\2\2\2\u07a3\u07a4\t\33\2\2\u07a4\u00dd\3\2\2\2\u07a5\u07a6\t\34\2\2"+
		"\u07a6\u00df\3\2\2\2\u07a7\u07a8\t\35\2\2\u07a8\u00e1\3\2\2\2\u07a9\u07ac"+
		"\7\u00c2\2\2\u07aa\u07ac\5\u00e0q\2\u07ab\u07a9\3\2\2\2\u07ab\u07aa\3"+
		"\2\2\2\u07ac\u00e3\3\2\2\2\u07ad\u07b1\7\u00c2\2\2\u07ae\u07b1\5\u00dc"+
		"o\2\u07af\u07b1\5\u00dep\2\u07b0\u07ad\3\2\2\2\u07b0\u07ae\3\2\2\2\u07b0"+
		"\u07af\3\2\2\2\u07b1\u00e5\3\2\2\2\u07b2\u07b5\5\u00e4s\2\u07b3\u07b5"+
		"\7u\2\2\u07b4\u07b2\3\2\2\2\u07b4\u07b3\3\2\2\2\u07b5\u00e7\3\2\2\2\u07b6"+
		"\u07b7\7\u00c7\2\2\u07b7\u07b8\7\u00d2\2\2\u07b8\u07b9\5\u00d8m\2\u07b9"+
		"\u00e9\3\2\2\2\u0110\u00ee\u00f2\u00f5\u00f8\u010c\u0112\u0119\u0121\u0126"+
		"\u012d\u0132\u0139\u013e\u0144\u014a\u014f\u0155\u015a\u0160\u0165\u016b"+
		"\u0179\u0180\u0187\u018e\u0194\u0199\u019f\u01a4\u01aa\u01b3\u01bd\u01c7"+
		"\u01db\u01e3\u01f2\u01f9\u0207\u020d\u0213\u021a\u021e\u0221\u0227\u022a"+
		"\u0230\u0234\u0237\u0242\u0246\u0249\u024e\u0250\u0253\u0256\u0260\u0264"+
		"\u0267\u026a\u026f\u0271\u0279\u027c\u027f\u0285\u0289\u028c\u028f\u0292"+
		"\u0295\u029a\u02a0\u02a4\u02a7\u02aa\u02ae\u02b6\u02c4\u02c6\u02ca\u02d1"+
		"\u02d3\u02de\u02e1\u02ea\u02fb\u0306\u0318\u0325\u0336\u033f\u0348\u034a"+
		"\u035f\u0363\u0366\u036b\u036e\u037a\u037f\u0383\u0386\u038a\u038e\u0393"+
		"\u0396\u039a\u039c\u03b2\u03ba\u03bd\u03c7\u03cb\u03d3\u03d7\u03dc\u03e0"+
		"\u03e4\u03e8\u03ec\u03ee\u03f6\u03fa\u03fd\u0405\u040a\u040f\u0412\u041c"+
		"\u0426\u042a\u042f\u0433\u0439\u043c\u043f\u0442\u0450\u0454\u0458\u045d"+
		"\u0460\u046a\u0472\u0475\u0479\u047c\u0480\u0483\u0486\u0489\u048c\u048f"+
		"\u0493\u0497\u049a\u049d\u04a0\u04a3\u04a6\u04af\u04b5\u04d0\u04e6\u04ee"+
		"\u04f1\u04f7\u04ff\u0502\u0508\u050a\u050e\u0513\u0516\u0519\u051d\u0521"+
		"\u0524\u0526\u0529\u052d\u0531\u0534\u0536\u0538\u053b\u0540\u054b\u0551"+
		"\u0556\u055d\u0562\u0566\u056a\u056f\u0576\u057e\u0581\u0584\u0597\u05a5"+
		"\u05b5\u05b8\u05c1\u05c5\u05ca\u05cf\u05d2\u05d4\u05ea\u05ed\u05f8\u05fc"+
		"\u05ff\u0603\u0607\u060f\u0613\u0620\u062c\u0638\u0640\u0644\u064b\u0651"+
		"\u0659\u065e\u0667\u066b\u068a\u069b\u06a7\u06b1\u06b4\u06b8\u06bb\u06c7"+
		"\u06d8\u06dc\u06ed\u06f0\u06f4\u06f7\u0702\u071a\u0721\u0723\u0725\u072d"+
		"\u0732\u073a\u0744\u0747\u074f\u0756\u075f\u0765\u0769\u076f\u0776\u077f"+
		"\u0785\u078f\u0791\u0794\u079c\u07a1\u07ab\u07b0\u07b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}