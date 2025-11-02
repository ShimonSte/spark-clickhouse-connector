// Generated from com.clickhouse/ClickHouseSQL.g4 by ANTLR 4.9.3
package com.clickhouse.spark;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ClickHouseSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ClickHouseSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#queryStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryStmt(ClickHouseSQLParser.QueryStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(ClickHouseSQLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#alterStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableStmt(ClickHouseSQLParser.AlterTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseAddColumn}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseAddColumn(ClickHouseSQLParser.AlterTableClauseAddColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseAddIndex}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseAddIndex(ClickHouseSQLParser.AlterTableClauseAddIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseAddProjection}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseAddProjection(ClickHouseSQLParser.AlterTableClauseAddProjectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseAttach}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseAttach(ClickHouseSQLParser.AlterTableClauseAttachContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseClearColumn}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseClearColumn(ClickHouseSQLParser.AlterTableClauseClearColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseClearIndex}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseClearIndex(ClickHouseSQLParser.AlterTableClauseClearIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseClearProjection}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseClearProjection(ClickHouseSQLParser.AlterTableClauseClearProjectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseComment}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseComment(ClickHouseSQLParser.AlterTableClauseCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseDelete}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseDelete(ClickHouseSQLParser.AlterTableClauseDeleteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseDetach}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseDetach(ClickHouseSQLParser.AlterTableClauseDetachContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseDropColumn}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseDropColumn(ClickHouseSQLParser.AlterTableClauseDropColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseDropIndex}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseDropIndex(ClickHouseSQLParser.AlterTableClauseDropIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseDropProjection}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseDropProjection(ClickHouseSQLParser.AlterTableClauseDropProjectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseDropPartition}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseDropPartition(ClickHouseSQLParser.AlterTableClauseDropPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseFreezePartition}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseFreezePartition(ClickHouseSQLParser.AlterTableClauseFreezePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseMaterializeIndex}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseMaterializeIndex(ClickHouseSQLParser.AlterTableClauseMaterializeIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseMaterializeProjection}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseMaterializeProjection(ClickHouseSQLParser.AlterTableClauseMaterializeProjectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseModifyCodec}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseModifyCodec(ClickHouseSQLParser.AlterTableClauseModifyCodecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseModifyComment}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseModifyComment(ClickHouseSQLParser.AlterTableClauseModifyCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseModifyRemove}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseModifyRemove(ClickHouseSQLParser.AlterTableClauseModifyRemoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseModify}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseModify(ClickHouseSQLParser.AlterTableClauseModifyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseModifyOrderBy}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseModifyOrderBy(ClickHouseSQLParser.AlterTableClauseModifyOrderByContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseModifyTTL}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseModifyTTL(ClickHouseSQLParser.AlterTableClauseModifyTTLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseMovePartition}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseMovePartition(ClickHouseSQLParser.AlterTableClauseMovePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseRemoveTTL}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseRemoveTTL(ClickHouseSQLParser.AlterTableClauseRemoveTTLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseRename}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseRename(ClickHouseSQLParser.AlterTableClauseRenameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseReplace}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseReplace(ClickHouseSQLParser.AlterTableClauseReplaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableClauseUpdate}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableClauseUpdate(ClickHouseSQLParser.AlterTableClauseUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#assignmentExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExprList(ClickHouseSQLParser.AssignmentExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#assignmentExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpr(ClickHouseSQLParser.AssignmentExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#tableColumnPropertyType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableColumnPropertyType(ClickHouseSQLParser.TableColumnPropertyTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#partitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionClause(ClickHouseSQLParser.PartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttachDictionaryStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#attachStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttachDictionaryStmt(ClickHouseSQLParser.AttachDictionaryStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#checkStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckStmt(ClickHouseSQLParser.CheckStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateDatabaseStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#createStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabaseStmt(ClickHouseSQLParser.CreateDatabaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateDictionaryStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#createStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDictionaryStmt(ClickHouseSQLParser.CreateDictionaryStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateLiveViewStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#createStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLiveViewStmt(ClickHouseSQLParser.CreateLiveViewStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateMaterializedViewStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#createStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateMaterializedViewStmt(ClickHouseSQLParser.CreateMaterializedViewStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateTableStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#createStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableStmt(ClickHouseSQLParser.CreateTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateViewStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#createStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateViewStmt(ClickHouseSQLParser.CreateViewStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#dictionarySchemaClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionarySchemaClause(ClickHouseSQLParser.DictionarySchemaClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#dictionaryAttrDfnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryAttrDfnt(ClickHouseSQLParser.DictionaryAttrDfntContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#dictionaryEngineClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryEngineClause(ClickHouseSQLParser.DictionaryEngineClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#dictionaryPrimaryKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryPrimaryKeyClause(ClickHouseSQLParser.DictionaryPrimaryKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#dictionaryArgExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryArgExpr(ClickHouseSQLParser.DictionaryArgExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#sourceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceClause(ClickHouseSQLParser.SourceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#lifetimeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLifetimeClause(ClickHouseSQLParser.LifetimeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#layoutClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayoutClause(ClickHouseSQLParser.LayoutClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#rangeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeClause(ClickHouseSQLParser.RangeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#dictionarySettingsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionarySettingsClause(ClickHouseSQLParser.DictionarySettingsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#clusterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClusterClause(ClickHouseSQLParser.ClusterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#uuidClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUuidClause(ClickHouseSQLParser.UuidClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#destinationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestinationClause(ClickHouseSQLParser.DestinationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#subqueryClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryClause(ClickHouseSQLParser.SubqueryClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SchemaDescriptionClause}
	 * labeled alternative in {@link ClickHouseSQLParser#tableSchemaClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaDescriptionClause(ClickHouseSQLParser.SchemaDescriptionClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SchemaAsTableClause}
	 * labeled alternative in {@link ClickHouseSQLParser#tableSchemaClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaAsTableClause(ClickHouseSQLParser.SchemaAsTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SchemaAsFunctionClause}
	 * labeled alternative in {@link ClickHouseSQLParser#tableSchemaClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaAsFunctionClause(ClickHouseSQLParser.SchemaAsFunctionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#engineClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngineClause(ClickHouseSQLParser.EngineClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#partitionByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionByClause(ClickHouseSQLParser.PartitionByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#primaryKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyClause(ClickHouseSQLParser.PrimaryKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#sampleByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByClause(ClickHouseSQLParser.SampleByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#ttlClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTtlClause(ClickHouseSQLParser.TtlClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#engineExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngineExpr(ClickHouseSQLParser.EngineExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableElementExprColumn}
	 * labeled alternative in {@link ClickHouseSQLParser#tableElementExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElementExprColumn(ClickHouseSQLParser.TableElementExprColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableElementExprConstraint}
	 * labeled alternative in {@link ClickHouseSQLParser#tableElementExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElementExprConstraint(ClickHouseSQLParser.TableElementExprConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableElementExprIndex}
	 * labeled alternative in {@link ClickHouseSQLParser#tableElementExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElementExprIndex(ClickHouseSQLParser.TableElementExprIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableElementExprProjection}
	 * labeled alternative in {@link ClickHouseSQLParser#tableElementExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElementExprProjection(ClickHouseSQLParser.TableElementExprProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#tableColumnDfnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableColumnDfnt(ClickHouseSQLParser.TableColumnDfntContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#tableColumnPropertyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableColumnPropertyExpr(ClickHouseSQLParser.TableColumnPropertyExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#tableIndexDfnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIndexDfnt(ClickHouseSQLParser.TableIndexDfntContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#tableProjectionDfnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProjectionDfnt(ClickHouseSQLParser.TableProjectionDfntContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#codecExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodecExpr(ClickHouseSQLParser.CodecExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#codecArgExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodecArgExpr(ClickHouseSQLParser.CodecArgExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#ttlExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTtlExpr(ClickHouseSQLParser.TtlExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#describeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeStmt(ClickHouseSQLParser.DescribeStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DropDatabaseStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#dropStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabaseStmt(ClickHouseSQLParser.DropDatabaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DropTableStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#dropStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableStmt(ClickHouseSQLParser.DropTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExistsDatabaseStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#existsStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsDatabaseStmt(ClickHouseSQLParser.ExistsDatabaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExistsTableStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#existsStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsTableStmt(ClickHouseSQLParser.ExistsTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExplainASTStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#explainStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainASTStmt(ClickHouseSQLParser.ExplainASTStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExplainSyntaxStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#explainStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainSyntaxStmt(ClickHouseSQLParser.ExplainSyntaxStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#insertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStmt(ClickHouseSQLParser.InsertStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#columnsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnsClause(ClickHouseSQLParser.ColumnsClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataClauseFormat}
	 * labeled alternative in {@link ClickHouseSQLParser#dataClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataClauseFormat(ClickHouseSQLParser.DataClauseFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataClauseValues}
	 * labeled alternative in {@link ClickHouseSQLParser#dataClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataClauseValues(ClickHouseSQLParser.DataClauseValuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataClauseSelect}
	 * labeled alternative in {@link ClickHouseSQLParser#dataClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataClauseSelect(ClickHouseSQLParser.DataClauseSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KillMutationStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#killStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKillMutationStmt(ClickHouseSQLParser.KillMutationStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#optimizeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimizeStmt(ClickHouseSQLParser.OptimizeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#renameStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameStmt(ClickHouseSQLParser.RenameStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#projectionSelectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjectionSelectStmt(ClickHouseSQLParser.ProjectionSelectStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#selectUnionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectUnionStmt(ClickHouseSQLParser.SelectUnionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#selectStmtWithParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmtWithParens(ClickHouseSQLParser.SelectStmtWithParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#selectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmt(ClickHouseSQLParser.SelectStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#withClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithClause(ClickHouseSQLParser.WithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#topClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopClause(ClickHouseSQLParser.TopClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(ClickHouseSQLParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#arrayJoinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayJoinClause(ClickHouseSQLParser.ArrayJoinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#windowClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowClause(ClickHouseSQLParser.WindowClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#prewhereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrewhereClause(ClickHouseSQLParser.PrewhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(ClickHouseSQLParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(ClickHouseSQLParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(ClickHouseSQLParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(ClickHouseSQLParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#projectionOrderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjectionOrderByClause(ClickHouseSQLParser.ProjectionOrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#limitByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitByClause(ClickHouseSQLParser.LimitByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(ClickHouseSQLParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#settingsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSettingsClause(ClickHouseSQLParser.SettingsClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JoinExprOp}
	 * labeled alternative in {@link ClickHouseSQLParser#joinExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinExprOp(ClickHouseSQLParser.JoinExprOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JoinExprTable}
	 * labeled alternative in {@link ClickHouseSQLParser#joinExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinExprTable(ClickHouseSQLParser.JoinExprTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JoinExprParens}
	 * labeled alternative in {@link ClickHouseSQLParser#joinExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinExprParens(ClickHouseSQLParser.JoinExprParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JoinExprCrossOp}
	 * labeled alternative in {@link ClickHouseSQLParser#joinExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinExprCrossOp(ClickHouseSQLParser.JoinExprCrossOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JoinOpInner}
	 * labeled alternative in {@link ClickHouseSQLParser#joinOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinOpInner(ClickHouseSQLParser.JoinOpInnerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JoinOpLeftRight}
	 * labeled alternative in {@link ClickHouseSQLParser#joinOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinOpLeftRight(ClickHouseSQLParser.JoinOpLeftRightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JoinOpFull}
	 * labeled alternative in {@link ClickHouseSQLParser#joinOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinOpFull(ClickHouseSQLParser.JoinOpFullContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#joinOpCross}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinOpCross(ClickHouseSQLParser.JoinOpCrossContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#joinConstraintClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinConstraintClause(ClickHouseSQLParser.JoinConstraintClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#sampleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleClause(ClickHouseSQLParser.SampleClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#limitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitExpr(ClickHouseSQLParser.LimitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#orderExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderExprList(ClickHouseSQLParser.OrderExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#orderExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderExpr(ClickHouseSQLParser.OrderExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#ratioExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRatioExpr(ClickHouseSQLParser.RatioExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#settingExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSettingExprList(ClickHouseSQLParser.SettingExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#settingExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSettingExpr(ClickHouseSQLParser.SettingExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#windowExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowExpr(ClickHouseSQLParser.WindowExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#winPartitionByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWinPartitionByClause(ClickHouseSQLParser.WinPartitionByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#winOrderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWinOrderByClause(ClickHouseSQLParser.WinOrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#winFrameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWinFrameClause(ClickHouseSQLParser.WinFrameClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code frameStart}
	 * labeled alternative in {@link ClickHouseSQLParser#winFrameExtend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameStart(ClickHouseSQLParser.FrameStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code frameBetween}
	 * labeled alternative in {@link ClickHouseSQLParser#winFrameExtend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBetween(ClickHouseSQLParser.FrameBetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#winFrameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWinFrameBound(ClickHouseSQLParser.WinFrameBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#setStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStmt(ClickHouseSQLParser.SetStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateDatabaseStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#showStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateDatabaseStmt(ClickHouseSQLParser.ShowCreateDatabaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateDictionaryStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#showStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateDictionaryStmt(ClickHouseSQLParser.ShowCreateDictionaryStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateTableStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#showStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTableStmt(ClickHouseSQLParser.ShowCreateTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showDatabasesStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#showStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDatabasesStmt(ClickHouseSQLParser.ShowDatabasesStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showDictionariesStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#showStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDictionariesStmt(ClickHouseSQLParser.ShowDictionariesStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTablesStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#showStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTablesStmt(ClickHouseSQLParser.ShowTablesStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#systemStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemStmt(ClickHouseSQLParser.SystemStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#truncateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateStmt(ClickHouseSQLParser.TruncateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#useStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseStmt(ClickHouseSQLParser.UseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#watchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWatchStmt(ClickHouseSQLParser.WatchStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnTypeExprSimple}
	 * labeled alternative in {@link ClickHouseSQLParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnTypeExprSimple(ClickHouseSQLParser.ColumnTypeExprSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnTypeExprNested}
	 * labeled alternative in {@link ClickHouseSQLParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnTypeExprNested(ClickHouseSQLParser.ColumnTypeExprNestedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnTypeExprEnum}
	 * labeled alternative in {@link ClickHouseSQLParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnTypeExprEnum(ClickHouseSQLParser.ColumnTypeExprEnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnTypeExprComplex}
	 * labeled alternative in {@link ClickHouseSQLParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnTypeExprComplex(ClickHouseSQLParser.ColumnTypeExprComplexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnTypeExprParam}
	 * labeled alternative in {@link ClickHouseSQLParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnTypeExprParam(ClickHouseSQLParser.ColumnTypeExprParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#columnExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprList(ClickHouseSQLParser.ColumnExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnsExprAsterisk}
	 * labeled alternative in {@link ClickHouseSQLParser#columnsExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnsExprAsterisk(ClickHouseSQLParser.ColumnsExprAsteriskContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnsExprSubquery}
	 * labeled alternative in {@link ClickHouseSQLParser#columnsExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnsExprSubquery(ClickHouseSQLParser.ColumnsExprSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnsExprColumn}
	 * labeled alternative in {@link ClickHouseSQLParser#columnsExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnsExprColumn(ClickHouseSQLParser.ColumnsExprColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprTernaryOp}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprTernaryOp(ClickHouseSQLParser.ColumnExprTernaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprAlias}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprAlias(ClickHouseSQLParser.ColumnExprAliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprExtract}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprExtract(ClickHouseSQLParser.ColumnExprExtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprNegate}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprNegate(ClickHouseSQLParser.ColumnExprNegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprSubquery}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprSubquery(ClickHouseSQLParser.ColumnExprSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprLiteral}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprLiteral(ClickHouseSQLParser.ColumnExprLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprArray}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprArray(ClickHouseSQLParser.ColumnExprArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprSubstring}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprSubstring(ClickHouseSQLParser.ColumnExprSubstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprCast}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprCast(ClickHouseSQLParser.ColumnExprCastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprOr}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprOr(ClickHouseSQLParser.ColumnExprOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprPrecedence1}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprPrecedence1(ClickHouseSQLParser.ColumnExprPrecedence1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprPrecedence2}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprPrecedence2(ClickHouseSQLParser.ColumnExprPrecedence2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprPrecedence3}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprPrecedence3(ClickHouseSQLParser.ColumnExprPrecedence3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprInterval}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprInterval(ClickHouseSQLParser.ColumnExprIntervalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprIsNull}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprIsNull(ClickHouseSQLParser.ColumnExprIsNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprWinFunctionTarget}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprWinFunctionTarget(ClickHouseSQLParser.ColumnExprWinFunctionTargetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprTrim}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprTrim(ClickHouseSQLParser.ColumnExprTrimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprTuple}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprTuple(ClickHouseSQLParser.ColumnExprTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprArrayAccess}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprArrayAccess(ClickHouseSQLParser.ColumnExprArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprBetween}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprBetween(ClickHouseSQLParser.ColumnExprBetweenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprParens}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprParens(ClickHouseSQLParser.ColumnExprParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprTimestamp}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprTimestamp(ClickHouseSQLParser.ColumnExprTimestampContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprAnd}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprAnd(ClickHouseSQLParser.ColumnExprAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprTupleAccess}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprTupleAccess(ClickHouseSQLParser.ColumnExprTupleAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprCase}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprCase(ClickHouseSQLParser.ColumnExprCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprDate}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprDate(ClickHouseSQLParser.ColumnExprDateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprNot}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprNot(ClickHouseSQLParser.ColumnExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprWinFunction}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprWinFunction(ClickHouseSQLParser.ColumnExprWinFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprIdentifier}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprIdentifier(ClickHouseSQLParser.ColumnExprIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprFunction}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprFunction(ClickHouseSQLParser.ColumnExprFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprAsterisk}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprAsterisk(ClickHouseSQLParser.ColumnExprAsteriskContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#columnArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnArgList(ClickHouseSQLParser.ColumnArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#columnArgExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnArgExpr(ClickHouseSQLParser.ColumnArgExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#columnLambdaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnLambdaExpr(ClickHouseSQLParser.ColumnLambdaExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#columnIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnIdentifier(ClickHouseSQLParser.ColumnIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#nestedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedIdentifier(ClickHouseSQLParser.NestedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableExprIdentifier}
	 * labeled alternative in {@link ClickHouseSQLParser#tableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExprIdentifier(ClickHouseSQLParser.TableExprIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableExprSubquery}
	 * labeled alternative in {@link ClickHouseSQLParser#tableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExprSubquery(ClickHouseSQLParser.TableExprSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableExprAlias}
	 * labeled alternative in {@link ClickHouseSQLParser#tableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExprAlias(ClickHouseSQLParser.TableExprAliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableExprFunction}
	 * labeled alternative in {@link ClickHouseSQLParser#tableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExprFunction(ClickHouseSQLParser.TableExprFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#tableFunctionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFunctionExpr(ClickHouseSQLParser.TableFunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(ClickHouseSQLParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#tableArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableArgList(ClickHouseSQLParser.TableArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#tableArgExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableArgExpr(ClickHouseSQLParser.TableArgExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#databaseIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseIdentifier(ClickHouseSQLParser.DatabaseIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#floatingLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingLiteral(ClickHouseSQLParser.FloatingLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#numberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(ClickHouseSQLParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ClickHouseSQLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(ClickHouseSQLParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(ClickHouseSQLParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#keywordForAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordForAlias(ClickHouseSQLParser.KeywordForAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(ClickHouseSQLParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ClickHouseSQLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#identifierOrNull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierOrNull(ClickHouseSQLParser.IdentifierOrNullContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseSQLParser#enumValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValue(ClickHouseSQLParser.EnumValueContext ctx);
}