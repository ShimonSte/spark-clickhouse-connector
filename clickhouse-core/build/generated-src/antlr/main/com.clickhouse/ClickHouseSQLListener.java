// Generated from com.clickhouse/ClickHouseSQL.g4 by ANTLR 4.9.3
package com.clickhouse.spark;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClickHouseSQLParser}.
 */
public interface ClickHouseSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#queryStmt}.
	 * @param ctx the parse tree
	 */
	void enterQueryStmt(ClickHouseSQLParser.QueryStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#queryStmt}.
	 * @param ctx the parse tree
	 */
	void exitQueryStmt(ClickHouseSQLParser.QueryStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(ClickHouseSQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(ClickHouseSQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#alterStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableStmt(ClickHouseSQLParser.AlterTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#alterStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableStmt(ClickHouseSQLParser.AlterTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseAddColumn}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseAddColumn(ClickHouseSQLParser.AlterTableClauseAddColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseAddColumn}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseAddColumn(ClickHouseSQLParser.AlterTableClauseAddColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseAddIndex}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseAddIndex(ClickHouseSQLParser.AlterTableClauseAddIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseAddIndex}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseAddIndex(ClickHouseSQLParser.AlterTableClauseAddIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseAddProjection}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseAddProjection(ClickHouseSQLParser.AlterTableClauseAddProjectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseAddProjection}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseAddProjection(ClickHouseSQLParser.AlterTableClauseAddProjectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseAttach}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseAttach(ClickHouseSQLParser.AlterTableClauseAttachContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseAttach}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseAttach(ClickHouseSQLParser.AlterTableClauseAttachContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseClearColumn}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseClearColumn(ClickHouseSQLParser.AlterTableClauseClearColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseClearColumn}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseClearColumn(ClickHouseSQLParser.AlterTableClauseClearColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseClearIndex}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseClearIndex(ClickHouseSQLParser.AlterTableClauseClearIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseClearIndex}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseClearIndex(ClickHouseSQLParser.AlterTableClauseClearIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseClearProjection}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseClearProjection(ClickHouseSQLParser.AlterTableClauseClearProjectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseClearProjection}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseClearProjection(ClickHouseSQLParser.AlterTableClauseClearProjectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseComment}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseComment(ClickHouseSQLParser.AlterTableClauseCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseComment}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseComment(ClickHouseSQLParser.AlterTableClauseCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseDelete}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseDelete(ClickHouseSQLParser.AlterTableClauseDeleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseDelete}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseDelete(ClickHouseSQLParser.AlterTableClauseDeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseDetach}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseDetach(ClickHouseSQLParser.AlterTableClauseDetachContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseDetach}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseDetach(ClickHouseSQLParser.AlterTableClauseDetachContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseDropColumn}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseDropColumn(ClickHouseSQLParser.AlterTableClauseDropColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseDropColumn}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseDropColumn(ClickHouseSQLParser.AlterTableClauseDropColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseDropIndex}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseDropIndex(ClickHouseSQLParser.AlterTableClauseDropIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseDropIndex}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseDropIndex(ClickHouseSQLParser.AlterTableClauseDropIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseDropProjection}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseDropProjection(ClickHouseSQLParser.AlterTableClauseDropProjectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseDropProjection}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseDropProjection(ClickHouseSQLParser.AlterTableClauseDropProjectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseDropPartition}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseDropPartition(ClickHouseSQLParser.AlterTableClauseDropPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseDropPartition}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseDropPartition(ClickHouseSQLParser.AlterTableClauseDropPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseFreezePartition}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseFreezePartition(ClickHouseSQLParser.AlterTableClauseFreezePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseFreezePartition}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseFreezePartition(ClickHouseSQLParser.AlterTableClauseFreezePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseMaterializeIndex}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseMaterializeIndex(ClickHouseSQLParser.AlterTableClauseMaterializeIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseMaterializeIndex}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseMaterializeIndex(ClickHouseSQLParser.AlterTableClauseMaterializeIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseMaterializeProjection}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseMaterializeProjection(ClickHouseSQLParser.AlterTableClauseMaterializeProjectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseMaterializeProjection}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseMaterializeProjection(ClickHouseSQLParser.AlterTableClauseMaterializeProjectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseModifyCodec}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseModifyCodec(ClickHouseSQLParser.AlterTableClauseModifyCodecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseModifyCodec}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseModifyCodec(ClickHouseSQLParser.AlterTableClauseModifyCodecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseModifyComment}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseModifyComment(ClickHouseSQLParser.AlterTableClauseModifyCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseModifyComment}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseModifyComment(ClickHouseSQLParser.AlterTableClauseModifyCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseModifyRemove}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseModifyRemove(ClickHouseSQLParser.AlterTableClauseModifyRemoveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseModifyRemove}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseModifyRemove(ClickHouseSQLParser.AlterTableClauseModifyRemoveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseModify}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseModify(ClickHouseSQLParser.AlterTableClauseModifyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseModify}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseModify(ClickHouseSQLParser.AlterTableClauseModifyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseModifyOrderBy}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseModifyOrderBy(ClickHouseSQLParser.AlterTableClauseModifyOrderByContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseModifyOrderBy}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseModifyOrderBy(ClickHouseSQLParser.AlterTableClauseModifyOrderByContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseModifyTTL}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseModifyTTL(ClickHouseSQLParser.AlterTableClauseModifyTTLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseModifyTTL}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseModifyTTL(ClickHouseSQLParser.AlterTableClauseModifyTTLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseMovePartition}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseMovePartition(ClickHouseSQLParser.AlterTableClauseMovePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseMovePartition}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseMovePartition(ClickHouseSQLParser.AlterTableClauseMovePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseRemoveTTL}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseRemoveTTL(ClickHouseSQLParser.AlterTableClauseRemoveTTLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseRemoveTTL}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseRemoveTTL(ClickHouseSQLParser.AlterTableClauseRemoveTTLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseRename}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseRename(ClickHouseSQLParser.AlterTableClauseRenameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseRename}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseRename(ClickHouseSQLParser.AlterTableClauseRenameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseReplace}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseReplace(ClickHouseSQLParser.AlterTableClauseReplaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseReplace}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseReplace(ClickHouseSQLParser.AlterTableClauseReplaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseUpdate}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseUpdate(ClickHouseSQLParser.AlterTableClauseUpdateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseUpdate}
	 * labeled alternative in {@link ClickHouseSQLParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseUpdate(ClickHouseSQLParser.AlterTableClauseUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#assignmentExprList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExprList(ClickHouseSQLParser.AssignmentExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#assignmentExprList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExprList(ClickHouseSQLParser.AssignmentExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#assignmentExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpr(ClickHouseSQLParser.AssignmentExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#assignmentExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpr(ClickHouseSQLParser.AssignmentExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#tableColumnPropertyType}.
	 * @param ctx the parse tree
	 */
	void enterTableColumnPropertyType(ClickHouseSQLParser.TableColumnPropertyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#tableColumnPropertyType}.
	 * @param ctx the parse tree
	 */
	void exitTableColumnPropertyType(ClickHouseSQLParser.TableColumnPropertyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionClause(ClickHouseSQLParser.PartitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionClause(ClickHouseSQLParser.PartitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttachDictionaryStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#attachStmt}.
	 * @param ctx the parse tree
	 */
	void enterAttachDictionaryStmt(ClickHouseSQLParser.AttachDictionaryStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttachDictionaryStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#attachStmt}.
	 * @param ctx the parse tree
	 */
	void exitAttachDictionaryStmt(ClickHouseSQLParser.AttachDictionaryStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#checkStmt}.
	 * @param ctx the parse tree
	 */
	void enterCheckStmt(ClickHouseSQLParser.CheckStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#checkStmt}.
	 * @param ctx the parse tree
	 */
	void exitCheckStmt(ClickHouseSQLParser.CheckStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateDatabaseStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseStmt(ClickHouseSQLParser.CreateDatabaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateDatabaseStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseStmt(ClickHouseSQLParser.CreateDatabaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateDictionaryStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateDictionaryStmt(ClickHouseSQLParser.CreateDictionaryStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateDictionaryStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateDictionaryStmt(ClickHouseSQLParser.CreateDictionaryStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateLiveViewStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateLiveViewStmt(ClickHouseSQLParser.CreateLiveViewStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateLiveViewStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateLiveViewStmt(ClickHouseSQLParser.CreateLiveViewStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateMaterializedViewStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateMaterializedViewStmt(ClickHouseSQLParser.CreateMaterializedViewStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateMaterializedViewStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateMaterializedViewStmt(ClickHouseSQLParser.CreateMaterializedViewStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateTableStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableStmt(ClickHouseSQLParser.CreateTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateTableStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableStmt(ClickHouseSQLParser.CreateTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateViewStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateViewStmt(ClickHouseSQLParser.CreateViewStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateViewStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateViewStmt(ClickHouseSQLParser.CreateViewStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#dictionarySchemaClause}.
	 * @param ctx the parse tree
	 */
	void enterDictionarySchemaClause(ClickHouseSQLParser.DictionarySchemaClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#dictionarySchemaClause}.
	 * @param ctx the parse tree
	 */
	void exitDictionarySchemaClause(ClickHouseSQLParser.DictionarySchemaClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#dictionaryAttrDfnt}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryAttrDfnt(ClickHouseSQLParser.DictionaryAttrDfntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#dictionaryAttrDfnt}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryAttrDfnt(ClickHouseSQLParser.DictionaryAttrDfntContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#dictionaryEngineClause}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryEngineClause(ClickHouseSQLParser.DictionaryEngineClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#dictionaryEngineClause}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryEngineClause(ClickHouseSQLParser.DictionaryEngineClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#dictionaryPrimaryKeyClause}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryPrimaryKeyClause(ClickHouseSQLParser.DictionaryPrimaryKeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#dictionaryPrimaryKeyClause}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryPrimaryKeyClause(ClickHouseSQLParser.DictionaryPrimaryKeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#dictionaryArgExpr}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryArgExpr(ClickHouseSQLParser.DictionaryArgExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#dictionaryArgExpr}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryArgExpr(ClickHouseSQLParser.DictionaryArgExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#sourceClause}.
	 * @param ctx the parse tree
	 */
	void enterSourceClause(ClickHouseSQLParser.SourceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#sourceClause}.
	 * @param ctx the parse tree
	 */
	void exitSourceClause(ClickHouseSQLParser.SourceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#lifetimeClause}.
	 * @param ctx the parse tree
	 */
	void enterLifetimeClause(ClickHouseSQLParser.LifetimeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#lifetimeClause}.
	 * @param ctx the parse tree
	 */
	void exitLifetimeClause(ClickHouseSQLParser.LifetimeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#layoutClause}.
	 * @param ctx the parse tree
	 */
	void enterLayoutClause(ClickHouseSQLParser.LayoutClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#layoutClause}.
	 * @param ctx the parse tree
	 */
	void exitLayoutClause(ClickHouseSQLParser.LayoutClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#rangeClause}.
	 * @param ctx the parse tree
	 */
	void enterRangeClause(ClickHouseSQLParser.RangeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#rangeClause}.
	 * @param ctx the parse tree
	 */
	void exitRangeClause(ClickHouseSQLParser.RangeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#dictionarySettingsClause}.
	 * @param ctx the parse tree
	 */
	void enterDictionarySettingsClause(ClickHouseSQLParser.DictionarySettingsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#dictionarySettingsClause}.
	 * @param ctx the parse tree
	 */
	void exitDictionarySettingsClause(ClickHouseSQLParser.DictionarySettingsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#clusterClause}.
	 * @param ctx the parse tree
	 */
	void enterClusterClause(ClickHouseSQLParser.ClusterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#clusterClause}.
	 * @param ctx the parse tree
	 */
	void exitClusterClause(ClickHouseSQLParser.ClusterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#uuidClause}.
	 * @param ctx the parse tree
	 */
	void enterUuidClause(ClickHouseSQLParser.UuidClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#uuidClause}.
	 * @param ctx the parse tree
	 */
	void exitUuidClause(ClickHouseSQLParser.UuidClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#destinationClause}.
	 * @param ctx the parse tree
	 */
	void enterDestinationClause(ClickHouseSQLParser.DestinationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#destinationClause}.
	 * @param ctx the parse tree
	 */
	void exitDestinationClause(ClickHouseSQLParser.DestinationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#subqueryClause}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryClause(ClickHouseSQLParser.SubqueryClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#subqueryClause}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryClause(ClickHouseSQLParser.SubqueryClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaDescriptionClause}
	 * labeled alternative in {@link ClickHouseSQLParser#tableSchemaClause}.
	 * @param ctx the parse tree
	 */
	void enterSchemaDescriptionClause(ClickHouseSQLParser.SchemaDescriptionClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaDescriptionClause}
	 * labeled alternative in {@link ClickHouseSQLParser#tableSchemaClause}.
	 * @param ctx the parse tree
	 */
	void exitSchemaDescriptionClause(ClickHouseSQLParser.SchemaDescriptionClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaAsTableClause}
	 * labeled alternative in {@link ClickHouseSQLParser#tableSchemaClause}.
	 * @param ctx the parse tree
	 */
	void enterSchemaAsTableClause(ClickHouseSQLParser.SchemaAsTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaAsTableClause}
	 * labeled alternative in {@link ClickHouseSQLParser#tableSchemaClause}.
	 * @param ctx the parse tree
	 */
	void exitSchemaAsTableClause(ClickHouseSQLParser.SchemaAsTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaAsFunctionClause}
	 * labeled alternative in {@link ClickHouseSQLParser#tableSchemaClause}.
	 * @param ctx the parse tree
	 */
	void enterSchemaAsFunctionClause(ClickHouseSQLParser.SchemaAsFunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaAsFunctionClause}
	 * labeled alternative in {@link ClickHouseSQLParser#tableSchemaClause}.
	 * @param ctx the parse tree
	 */
	void exitSchemaAsFunctionClause(ClickHouseSQLParser.SchemaAsFunctionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#engineClause}.
	 * @param ctx the parse tree
	 */
	void enterEngineClause(ClickHouseSQLParser.EngineClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#engineClause}.
	 * @param ctx the parse tree
	 */
	void exitEngineClause(ClickHouseSQLParser.EngineClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#partitionByClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionByClause(ClickHouseSQLParser.PartitionByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#partitionByClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionByClause(ClickHouseSQLParser.PartitionByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#primaryKeyClause}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyClause(ClickHouseSQLParser.PrimaryKeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#primaryKeyClause}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyClause(ClickHouseSQLParser.PrimaryKeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#sampleByClause}.
	 * @param ctx the parse tree
	 */
	void enterSampleByClause(ClickHouseSQLParser.SampleByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#sampleByClause}.
	 * @param ctx the parse tree
	 */
	void exitSampleByClause(ClickHouseSQLParser.SampleByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#ttlClause}.
	 * @param ctx the parse tree
	 */
	void enterTtlClause(ClickHouseSQLParser.TtlClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#ttlClause}.
	 * @param ctx the parse tree
	 */
	void exitTtlClause(ClickHouseSQLParser.TtlClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#engineExpr}.
	 * @param ctx the parse tree
	 */
	void enterEngineExpr(ClickHouseSQLParser.EngineExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#engineExpr}.
	 * @param ctx the parse tree
	 */
	void exitEngineExpr(ClickHouseSQLParser.EngineExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableElementExprColumn}
	 * labeled alternative in {@link ClickHouseSQLParser#tableElementExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableElementExprColumn(ClickHouseSQLParser.TableElementExprColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableElementExprColumn}
	 * labeled alternative in {@link ClickHouseSQLParser#tableElementExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableElementExprColumn(ClickHouseSQLParser.TableElementExprColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableElementExprConstraint}
	 * labeled alternative in {@link ClickHouseSQLParser#tableElementExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableElementExprConstraint(ClickHouseSQLParser.TableElementExprConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableElementExprConstraint}
	 * labeled alternative in {@link ClickHouseSQLParser#tableElementExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableElementExprConstraint(ClickHouseSQLParser.TableElementExprConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableElementExprIndex}
	 * labeled alternative in {@link ClickHouseSQLParser#tableElementExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableElementExprIndex(ClickHouseSQLParser.TableElementExprIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableElementExprIndex}
	 * labeled alternative in {@link ClickHouseSQLParser#tableElementExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableElementExprIndex(ClickHouseSQLParser.TableElementExprIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableElementExprProjection}
	 * labeled alternative in {@link ClickHouseSQLParser#tableElementExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableElementExprProjection(ClickHouseSQLParser.TableElementExprProjectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableElementExprProjection}
	 * labeled alternative in {@link ClickHouseSQLParser#tableElementExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableElementExprProjection(ClickHouseSQLParser.TableElementExprProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#tableColumnDfnt}.
	 * @param ctx the parse tree
	 */
	void enterTableColumnDfnt(ClickHouseSQLParser.TableColumnDfntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#tableColumnDfnt}.
	 * @param ctx the parse tree
	 */
	void exitTableColumnDfnt(ClickHouseSQLParser.TableColumnDfntContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#tableColumnPropertyExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableColumnPropertyExpr(ClickHouseSQLParser.TableColumnPropertyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#tableColumnPropertyExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableColumnPropertyExpr(ClickHouseSQLParser.TableColumnPropertyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#tableIndexDfnt}.
	 * @param ctx the parse tree
	 */
	void enterTableIndexDfnt(ClickHouseSQLParser.TableIndexDfntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#tableIndexDfnt}.
	 * @param ctx the parse tree
	 */
	void exitTableIndexDfnt(ClickHouseSQLParser.TableIndexDfntContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#tableProjectionDfnt}.
	 * @param ctx the parse tree
	 */
	void enterTableProjectionDfnt(ClickHouseSQLParser.TableProjectionDfntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#tableProjectionDfnt}.
	 * @param ctx the parse tree
	 */
	void exitTableProjectionDfnt(ClickHouseSQLParser.TableProjectionDfntContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#codecExpr}.
	 * @param ctx the parse tree
	 */
	void enterCodecExpr(ClickHouseSQLParser.CodecExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#codecExpr}.
	 * @param ctx the parse tree
	 */
	void exitCodecExpr(ClickHouseSQLParser.CodecExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#codecArgExpr}.
	 * @param ctx the parse tree
	 */
	void enterCodecArgExpr(ClickHouseSQLParser.CodecArgExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#codecArgExpr}.
	 * @param ctx the parse tree
	 */
	void exitCodecArgExpr(ClickHouseSQLParser.CodecArgExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#ttlExpr}.
	 * @param ctx the parse tree
	 */
	void enterTtlExpr(ClickHouseSQLParser.TtlExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#ttlExpr}.
	 * @param ctx the parse tree
	 */
	void exitTtlExpr(ClickHouseSQLParser.TtlExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#describeStmt}.
	 * @param ctx the parse tree
	 */
	void enterDescribeStmt(ClickHouseSQLParser.DescribeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#describeStmt}.
	 * @param ctx the parse tree
	 */
	void exitDescribeStmt(ClickHouseSQLParser.DescribeStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DropDatabaseStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#dropStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabaseStmt(ClickHouseSQLParser.DropDatabaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DropDatabaseStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#dropStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabaseStmt(ClickHouseSQLParser.DropDatabaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DropTableStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#dropStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropTableStmt(ClickHouseSQLParser.DropTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DropTableStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#dropStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropTableStmt(ClickHouseSQLParser.DropTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExistsDatabaseStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#existsStmt}.
	 * @param ctx the parse tree
	 */
	void enterExistsDatabaseStmt(ClickHouseSQLParser.ExistsDatabaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExistsDatabaseStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#existsStmt}.
	 * @param ctx the parse tree
	 */
	void exitExistsDatabaseStmt(ClickHouseSQLParser.ExistsDatabaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExistsTableStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#existsStmt}.
	 * @param ctx the parse tree
	 */
	void enterExistsTableStmt(ClickHouseSQLParser.ExistsTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExistsTableStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#existsStmt}.
	 * @param ctx the parse tree
	 */
	void exitExistsTableStmt(ClickHouseSQLParser.ExistsTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExplainASTStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#explainStmt}.
	 * @param ctx the parse tree
	 */
	void enterExplainASTStmt(ClickHouseSQLParser.ExplainASTStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExplainASTStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#explainStmt}.
	 * @param ctx the parse tree
	 */
	void exitExplainASTStmt(ClickHouseSQLParser.ExplainASTStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExplainSyntaxStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#explainStmt}.
	 * @param ctx the parse tree
	 */
	void enterExplainSyntaxStmt(ClickHouseSQLParser.ExplainSyntaxStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExplainSyntaxStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#explainStmt}.
	 * @param ctx the parse tree
	 */
	void exitExplainSyntaxStmt(ClickHouseSQLParser.ExplainSyntaxStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void enterInsertStmt(ClickHouseSQLParser.InsertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void exitInsertStmt(ClickHouseSQLParser.InsertStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#columnsClause}.
	 * @param ctx the parse tree
	 */
	void enterColumnsClause(ClickHouseSQLParser.ColumnsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#columnsClause}.
	 * @param ctx the parse tree
	 */
	void exitColumnsClause(ClickHouseSQLParser.ColumnsClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DataClauseFormat}
	 * labeled alternative in {@link ClickHouseSQLParser#dataClause}.
	 * @param ctx the parse tree
	 */
	void enterDataClauseFormat(ClickHouseSQLParser.DataClauseFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DataClauseFormat}
	 * labeled alternative in {@link ClickHouseSQLParser#dataClause}.
	 * @param ctx the parse tree
	 */
	void exitDataClauseFormat(ClickHouseSQLParser.DataClauseFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DataClauseValues}
	 * labeled alternative in {@link ClickHouseSQLParser#dataClause}.
	 * @param ctx the parse tree
	 */
	void enterDataClauseValues(ClickHouseSQLParser.DataClauseValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DataClauseValues}
	 * labeled alternative in {@link ClickHouseSQLParser#dataClause}.
	 * @param ctx the parse tree
	 */
	void exitDataClauseValues(ClickHouseSQLParser.DataClauseValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DataClauseSelect}
	 * labeled alternative in {@link ClickHouseSQLParser#dataClause}.
	 * @param ctx the parse tree
	 */
	void enterDataClauseSelect(ClickHouseSQLParser.DataClauseSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DataClauseSelect}
	 * labeled alternative in {@link ClickHouseSQLParser#dataClause}.
	 * @param ctx the parse tree
	 */
	void exitDataClauseSelect(ClickHouseSQLParser.DataClauseSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KillMutationStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#killStmt}.
	 * @param ctx the parse tree
	 */
	void enterKillMutationStmt(ClickHouseSQLParser.KillMutationStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KillMutationStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#killStmt}.
	 * @param ctx the parse tree
	 */
	void exitKillMutationStmt(ClickHouseSQLParser.KillMutationStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#optimizeStmt}.
	 * @param ctx the parse tree
	 */
	void enterOptimizeStmt(ClickHouseSQLParser.OptimizeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#optimizeStmt}.
	 * @param ctx the parse tree
	 */
	void exitOptimizeStmt(ClickHouseSQLParser.OptimizeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#renameStmt}.
	 * @param ctx the parse tree
	 */
	void enterRenameStmt(ClickHouseSQLParser.RenameStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#renameStmt}.
	 * @param ctx the parse tree
	 */
	void exitRenameStmt(ClickHouseSQLParser.RenameStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#projectionSelectStmt}.
	 * @param ctx the parse tree
	 */
	void enterProjectionSelectStmt(ClickHouseSQLParser.ProjectionSelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#projectionSelectStmt}.
	 * @param ctx the parse tree
	 */
	void exitProjectionSelectStmt(ClickHouseSQLParser.ProjectionSelectStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#selectUnionStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectUnionStmt(ClickHouseSQLParser.SelectUnionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#selectUnionStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectUnionStmt(ClickHouseSQLParser.SelectUnionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#selectStmtWithParens}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmtWithParens(ClickHouseSQLParser.SelectStmtWithParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#selectStmtWithParens}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmtWithParens(ClickHouseSQLParser.SelectStmtWithParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(ClickHouseSQLParser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(ClickHouseSQLParser.SelectStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#withClause}.
	 * @param ctx the parse tree
	 */
	void enterWithClause(ClickHouseSQLParser.WithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#withClause}.
	 * @param ctx the parse tree
	 */
	void exitWithClause(ClickHouseSQLParser.WithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#topClause}.
	 * @param ctx the parse tree
	 */
	void enterTopClause(ClickHouseSQLParser.TopClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#topClause}.
	 * @param ctx the parse tree
	 */
	void exitTopClause(ClickHouseSQLParser.TopClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(ClickHouseSQLParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(ClickHouseSQLParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#arrayJoinClause}.
	 * @param ctx the parse tree
	 */
	void enterArrayJoinClause(ClickHouseSQLParser.ArrayJoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#arrayJoinClause}.
	 * @param ctx the parse tree
	 */
	void exitArrayJoinClause(ClickHouseSQLParser.ArrayJoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(ClickHouseSQLParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(ClickHouseSQLParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#prewhereClause}.
	 * @param ctx the parse tree
	 */
	void enterPrewhereClause(ClickHouseSQLParser.PrewhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#prewhereClause}.
	 * @param ctx the parse tree
	 */
	void exitPrewhereClause(ClickHouseSQLParser.PrewhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(ClickHouseSQLParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(ClickHouseSQLParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(ClickHouseSQLParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(ClickHouseSQLParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(ClickHouseSQLParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(ClickHouseSQLParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(ClickHouseSQLParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(ClickHouseSQLParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#projectionOrderByClause}.
	 * @param ctx the parse tree
	 */
	void enterProjectionOrderByClause(ClickHouseSQLParser.ProjectionOrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#projectionOrderByClause}.
	 * @param ctx the parse tree
	 */
	void exitProjectionOrderByClause(ClickHouseSQLParser.ProjectionOrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#limitByClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitByClause(ClickHouseSQLParser.LimitByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#limitByClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitByClause(ClickHouseSQLParser.LimitByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(ClickHouseSQLParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(ClickHouseSQLParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#settingsClause}.
	 * @param ctx the parse tree
	 */
	void enterSettingsClause(ClickHouseSQLParser.SettingsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#settingsClause}.
	 * @param ctx the parse tree
	 */
	void exitSettingsClause(ClickHouseSQLParser.SettingsClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinExprOp}
	 * labeled alternative in {@link ClickHouseSQLParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void enterJoinExprOp(ClickHouseSQLParser.JoinExprOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinExprOp}
	 * labeled alternative in {@link ClickHouseSQLParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void exitJoinExprOp(ClickHouseSQLParser.JoinExprOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinExprTable}
	 * labeled alternative in {@link ClickHouseSQLParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void enterJoinExprTable(ClickHouseSQLParser.JoinExprTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinExprTable}
	 * labeled alternative in {@link ClickHouseSQLParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void exitJoinExprTable(ClickHouseSQLParser.JoinExprTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinExprParens}
	 * labeled alternative in {@link ClickHouseSQLParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void enterJoinExprParens(ClickHouseSQLParser.JoinExprParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinExprParens}
	 * labeled alternative in {@link ClickHouseSQLParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void exitJoinExprParens(ClickHouseSQLParser.JoinExprParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinExprCrossOp}
	 * labeled alternative in {@link ClickHouseSQLParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void enterJoinExprCrossOp(ClickHouseSQLParser.JoinExprCrossOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinExprCrossOp}
	 * labeled alternative in {@link ClickHouseSQLParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void exitJoinExprCrossOp(ClickHouseSQLParser.JoinExprCrossOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinOpInner}
	 * labeled alternative in {@link ClickHouseSQLParser#joinOp}.
	 * @param ctx the parse tree
	 */
	void enterJoinOpInner(ClickHouseSQLParser.JoinOpInnerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinOpInner}
	 * labeled alternative in {@link ClickHouseSQLParser#joinOp}.
	 * @param ctx the parse tree
	 */
	void exitJoinOpInner(ClickHouseSQLParser.JoinOpInnerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinOpLeftRight}
	 * labeled alternative in {@link ClickHouseSQLParser#joinOp}.
	 * @param ctx the parse tree
	 */
	void enterJoinOpLeftRight(ClickHouseSQLParser.JoinOpLeftRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinOpLeftRight}
	 * labeled alternative in {@link ClickHouseSQLParser#joinOp}.
	 * @param ctx the parse tree
	 */
	void exitJoinOpLeftRight(ClickHouseSQLParser.JoinOpLeftRightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinOpFull}
	 * labeled alternative in {@link ClickHouseSQLParser#joinOp}.
	 * @param ctx the parse tree
	 */
	void enterJoinOpFull(ClickHouseSQLParser.JoinOpFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinOpFull}
	 * labeled alternative in {@link ClickHouseSQLParser#joinOp}.
	 * @param ctx the parse tree
	 */
	void exitJoinOpFull(ClickHouseSQLParser.JoinOpFullContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#joinOpCross}.
	 * @param ctx the parse tree
	 */
	void enterJoinOpCross(ClickHouseSQLParser.JoinOpCrossContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#joinOpCross}.
	 * @param ctx the parse tree
	 */
	void exitJoinOpCross(ClickHouseSQLParser.JoinOpCrossContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#joinConstraintClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinConstraintClause(ClickHouseSQLParser.JoinConstraintClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#joinConstraintClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinConstraintClause(ClickHouseSQLParser.JoinConstraintClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#sampleClause}.
	 * @param ctx the parse tree
	 */
	void enterSampleClause(ClickHouseSQLParser.SampleClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#sampleClause}.
	 * @param ctx the parse tree
	 */
	void exitSampleClause(ClickHouseSQLParser.SampleClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#limitExpr}.
	 * @param ctx the parse tree
	 */
	void enterLimitExpr(ClickHouseSQLParser.LimitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#limitExpr}.
	 * @param ctx the parse tree
	 */
	void exitLimitExpr(ClickHouseSQLParser.LimitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#orderExprList}.
	 * @param ctx the parse tree
	 */
	void enterOrderExprList(ClickHouseSQLParser.OrderExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#orderExprList}.
	 * @param ctx the parse tree
	 */
	void exitOrderExprList(ClickHouseSQLParser.OrderExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#orderExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrderExpr(ClickHouseSQLParser.OrderExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#orderExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrderExpr(ClickHouseSQLParser.OrderExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#ratioExpr}.
	 * @param ctx the parse tree
	 */
	void enterRatioExpr(ClickHouseSQLParser.RatioExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#ratioExpr}.
	 * @param ctx the parse tree
	 */
	void exitRatioExpr(ClickHouseSQLParser.RatioExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#settingExprList}.
	 * @param ctx the parse tree
	 */
	void enterSettingExprList(ClickHouseSQLParser.SettingExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#settingExprList}.
	 * @param ctx the parse tree
	 */
	void exitSettingExprList(ClickHouseSQLParser.SettingExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#settingExpr}.
	 * @param ctx the parse tree
	 */
	void enterSettingExpr(ClickHouseSQLParser.SettingExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#settingExpr}.
	 * @param ctx the parse tree
	 */
	void exitSettingExpr(ClickHouseSQLParser.SettingExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#windowExpr}.
	 * @param ctx the parse tree
	 */
	void enterWindowExpr(ClickHouseSQLParser.WindowExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#windowExpr}.
	 * @param ctx the parse tree
	 */
	void exitWindowExpr(ClickHouseSQLParser.WindowExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#winPartitionByClause}.
	 * @param ctx the parse tree
	 */
	void enterWinPartitionByClause(ClickHouseSQLParser.WinPartitionByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#winPartitionByClause}.
	 * @param ctx the parse tree
	 */
	void exitWinPartitionByClause(ClickHouseSQLParser.WinPartitionByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#winOrderByClause}.
	 * @param ctx the parse tree
	 */
	void enterWinOrderByClause(ClickHouseSQLParser.WinOrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#winOrderByClause}.
	 * @param ctx the parse tree
	 */
	void exitWinOrderByClause(ClickHouseSQLParser.WinOrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#winFrameClause}.
	 * @param ctx the parse tree
	 */
	void enterWinFrameClause(ClickHouseSQLParser.WinFrameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#winFrameClause}.
	 * @param ctx the parse tree
	 */
	void exitWinFrameClause(ClickHouseSQLParser.WinFrameClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code frameStart}
	 * labeled alternative in {@link ClickHouseSQLParser#winFrameExtend}.
	 * @param ctx the parse tree
	 */
	void enterFrameStart(ClickHouseSQLParser.FrameStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code frameStart}
	 * labeled alternative in {@link ClickHouseSQLParser#winFrameExtend}.
	 * @param ctx the parse tree
	 */
	void exitFrameStart(ClickHouseSQLParser.FrameStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code frameBetween}
	 * labeled alternative in {@link ClickHouseSQLParser#winFrameExtend}.
	 * @param ctx the parse tree
	 */
	void enterFrameBetween(ClickHouseSQLParser.FrameBetweenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code frameBetween}
	 * labeled alternative in {@link ClickHouseSQLParser#winFrameExtend}.
	 * @param ctx the parse tree
	 */
	void exitFrameBetween(ClickHouseSQLParser.FrameBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#winFrameBound}.
	 * @param ctx the parse tree
	 */
	void enterWinFrameBound(ClickHouseSQLParser.WinFrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#winFrameBound}.
	 * @param ctx the parse tree
	 */
	void exitWinFrameBound(ClickHouseSQLParser.WinFrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#setStmt}.
	 * @param ctx the parse tree
	 */
	void enterSetStmt(ClickHouseSQLParser.SetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#setStmt}.
	 * @param ctx the parse tree
	 */
	void exitSetStmt(ClickHouseSQLParser.SetStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateDatabaseStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateDatabaseStmt(ClickHouseSQLParser.ShowCreateDatabaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateDatabaseStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateDatabaseStmt(ClickHouseSQLParser.ShowCreateDatabaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateDictionaryStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateDictionaryStmt(ClickHouseSQLParser.ShowCreateDictionaryStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateDictionaryStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateDictionaryStmt(ClickHouseSQLParser.ShowCreateDictionaryStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateTableStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTableStmt(ClickHouseSQLParser.ShowCreateTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateTableStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTableStmt(ClickHouseSQLParser.ShowCreateTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showDatabasesStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void enterShowDatabasesStmt(ClickHouseSQLParser.ShowDatabasesStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showDatabasesStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void exitShowDatabasesStmt(ClickHouseSQLParser.ShowDatabasesStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showDictionariesStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void enterShowDictionariesStmt(ClickHouseSQLParser.ShowDictionariesStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showDictionariesStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void exitShowDictionariesStmt(ClickHouseSQLParser.ShowDictionariesStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTablesStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void enterShowTablesStmt(ClickHouseSQLParser.ShowTablesStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTablesStmt}
	 * labeled alternative in {@link ClickHouseSQLParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void exitShowTablesStmt(ClickHouseSQLParser.ShowTablesStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#systemStmt}.
	 * @param ctx the parse tree
	 */
	void enterSystemStmt(ClickHouseSQLParser.SystemStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#systemStmt}.
	 * @param ctx the parse tree
	 */
	void exitSystemStmt(ClickHouseSQLParser.SystemStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#truncateStmt}.
	 * @param ctx the parse tree
	 */
	void enterTruncateStmt(ClickHouseSQLParser.TruncateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#truncateStmt}.
	 * @param ctx the parse tree
	 */
	void exitTruncateStmt(ClickHouseSQLParser.TruncateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#useStmt}.
	 * @param ctx the parse tree
	 */
	void enterUseStmt(ClickHouseSQLParser.UseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#useStmt}.
	 * @param ctx the parse tree
	 */
	void exitUseStmt(ClickHouseSQLParser.UseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#watchStmt}.
	 * @param ctx the parse tree
	 */
	void enterWatchStmt(ClickHouseSQLParser.WatchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#watchStmt}.
	 * @param ctx the parse tree
	 */
	void exitWatchStmt(ClickHouseSQLParser.WatchStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnTypeExprSimple}
	 * labeled alternative in {@link ClickHouseSQLParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnTypeExprSimple(ClickHouseSQLParser.ColumnTypeExprSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnTypeExprSimple}
	 * labeled alternative in {@link ClickHouseSQLParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnTypeExprSimple(ClickHouseSQLParser.ColumnTypeExprSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnTypeExprNested}
	 * labeled alternative in {@link ClickHouseSQLParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnTypeExprNested(ClickHouseSQLParser.ColumnTypeExprNestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnTypeExprNested}
	 * labeled alternative in {@link ClickHouseSQLParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnTypeExprNested(ClickHouseSQLParser.ColumnTypeExprNestedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnTypeExprEnum}
	 * labeled alternative in {@link ClickHouseSQLParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnTypeExprEnum(ClickHouseSQLParser.ColumnTypeExprEnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnTypeExprEnum}
	 * labeled alternative in {@link ClickHouseSQLParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnTypeExprEnum(ClickHouseSQLParser.ColumnTypeExprEnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnTypeExprComplex}
	 * labeled alternative in {@link ClickHouseSQLParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnTypeExprComplex(ClickHouseSQLParser.ColumnTypeExprComplexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnTypeExprComplex}
	 * labeled alternative in {@link ClickHouseSQLParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnTypeExprComplex(ClickHouseSQLParser.ColumnTypeExprComplexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnTypeExprParam}
	 * labeled alternative in {@link ClickHouseSQLParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnTypeExprParam(ClickHouseSQLParser.ColumnTypeExprParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnTypeExprParam}
	 * labeled alternative in {@link ClickHouseSQLParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnTypeExprParam(ClickHouseSQLParser.ColumnTypeExprParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#columnExprList}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprList(ClickHouseSQLParser.ColumnExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#columnExprList}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprList(ClickHouseSQLParser.ColumnExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnsExprAsterisk}
	 * labeled alternative in {@link ClickHouseSQLParser#columnsExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnsExprAsterisk(ClickHouseSQLParser.ColumnsExprAsteriskContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnsExprAsterisk}
	 * labeled alternative in {@link ClickHouseSQLParser#columnsExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnsExprAsterisk(ClickHouseSQLParser.ColumnsExprAsteriskContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnsExprSubquery}
	 * labeled alternative in {@link ClickHouseSQLParser#columnsExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnsExprSubquery(ClickHouseSQLParser.ColumnsExprSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnsExprSubquery}
	 * labeled alternative in {@link ClickHouseSQLParser#columnsExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnsExprSubquery(ClickHouseSQLParser.ColumnsExprSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnsExprColumn}
	 * labeled alternative in {@link ClickHouseSQLParser#columnsExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnsExprColumn(ClickHouseSQLParser.ColumnsExprColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnsExprColumn}
	 * labeled alternative in {@link ClickHouseSQLParser#columnsExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnsExprColumn(ClickHouseSQLParser.ColumnsExprColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprTernaryOp}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprTernaryOp(ClickHouseSQLParser.ColumnExprTernaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprTernaryOp}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprTernaryOp(ClickHouseSQLParser.ColumnExprTernaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprAlias}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprAlias(ClickHouseSQLParser.ColumnExprAliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprAlias}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprAlias(ClickHouseSQLParser.ColumnExprAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprExtract}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprExtract(ClickHouseSQLParser.ColumnExprExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprExtract}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprExtract(ClickHouseSQLParser.ColumnExprExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprNegate}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprNegate(ClickHouseSQLParser.ColumnExprNegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprNegate}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprNegate(ClickHouseSQLParser.ColumnExprNegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprSubquery}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprSubquery(ClickHouseSQLParser.ColumnExprSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprSubquery}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprSubquery(ClickHouseSQLParser.ColumnExprSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprLiteral}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprLiteral(ClickHouseSQLParser.ColumnExprLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprLiteral}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprLiteral(ClickHouseSQLParser.ColumnExprLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprArray}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprArray(ClickHouseSQLParser.ColumnExprArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprArray}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprArray(ClickHouseSQLParser.ColumnExprArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprSubstring}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprSubstring(ClickHouseSQLParser.ColumnExprSubstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprSubstring}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprSubstring(ClickHouseSQLParser.ColumnExprSubstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprCast}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprCast(ClickHouseSQLParser.ColumnExprCastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprCast}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprCast(ClickHouseSQLParser.ColumnExprCastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprOr}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprOr(ClickHouseSQLParser.ColumnExprOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprOr}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprOr(ClickHouseSQLParser.ColumnExprOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprPrecedence1}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprPrecedence1(ClickHouseSQLParser.ColumnExprPrecedence1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprPrecedence1}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprPrecedence1(ClickHouseSQLParser.ColumnExprPrecedence1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprPrecedence2}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprPrecedence2(ClickHouseSQLParser.ColumnExprPrecedence2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprPrecedence2}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprPrecedence2(ClickHouseSQLParser.ColumnExprPrecedence2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprPrecedence3}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprPrecedence3(ClickHouseSQLParser.ColumnExprPrecedence3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprPrecedence3}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprPrecedence3(ClickHouseSQLParser.ColumnExprPrecedence3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprInterval}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprInterval(ClickHouseSQLParser.ColumnExprIntervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprInterval}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprInterval(ClickHouseSQLParser.ColumnExprIntervalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprIsNull}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprIsNull(ClickHouseSQLParser.ColumnExprIsNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprIsNull}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprIsNull(ClickHouseSQLParser.ColumnExprIsNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprWinFunctionTarget}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprWinFunctionTarget(ClickHouseSQLParser.ColumnExprWinFunctionTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprWinFunctionTarget}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprWinFunctionTarget(ClickHouseSQLParser.ColumnExprWinFunctionTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprTrim}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprTrim(ClickHouseSQLParser.ColumnExprTrimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprTrim}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprTrim(ClickHouseSQLParser.ColumnExprTrimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprTuple}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprTuple(ClickHouseSQLParser.ColumnExprTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprTuple}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprTuple(ClickHouseSQLParser.ColumnExprTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprArrayAccess}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprArrayAccess(ClickHouseSQLParser.ColumnExprArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprArrayAccess}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprArrayAccess(ClickHouseSQLParser.ColumnExprArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprBetween}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprBetween(ClickHouseSQLParser.ColumnExprBetweenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprBetween}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprBetween(ClickHouseSQLParser.ColumnExprBetweenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprParens}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprParens(ClickHouseSQLParser.ColumnExprParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprParens}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprParens(ClickHouseSQLParser.ColumnExprParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprTimestamp}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprTimestamp(ClickHouseSQLParser.ColumnExprTimestampContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprTimestamp}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprTimestamp(ClickHouseSQLParser.ColumnExprTimestampContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprAnd}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprAnd(ClickHouseSQLParser.ColumnExprAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprAnd}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprAnd(ClickHouseSQLParser.ColumnExprAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprTupleAccess}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprTupleAccess(ClickHouseSQLParser.ColumnExprTupleAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprTupleAccess}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprTupleAccess(ClickHouseSQLParser.ColumnExprTupleAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprCase}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprCase(ClickHouseSQLParser.ColumnExprCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprCase}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprCase(ClickHouseSQLParser.ColumnExprCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprDate}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprDate(ClickHouseSQLParser.ColumnExprDateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprDate}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprDate(ClickHouseSQLParser.ColumnExprDateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprNot}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprNot(ClickHouseSQLParser.ColumnExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprNot}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprNot(ClickHouseSQLParser.ColumnExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprWinFunction}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprWinFunction(ClickHouseSQLParser.ColumnExprWinFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprWinFunction}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprWinFunction(ClickHouseSQLParser.ColumnExprWinFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprIdentifier}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprIdentifier(ClickHouseSQLParser.ColumnExprIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprIdentifier}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprIdentifier(ClickHouseSQLParser.ColumnExprIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprFunction}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprFunction(ClickHouseSQLParser.ColumnExprFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprFunction}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprFunction(ClickHouseSQLParser.ColumnExprFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprAsterisk}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprAsterisk(ClickHouseSQLParser.ColumnExprAsteriskContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprAsterisk}
	 * labeled alternative in {@link ClickHouseSQLParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprAsterisk(ClickHouseSQLParser.ColumnExprAsteriskContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#columnArgList}.
	 * @param ctx the parse tree
	 */
	void enterColumnArgList(ClickHouseSQLParser.ColumnArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#columnArgList}.
	 * @param ctx the parse tree
	 */
	void exitColumnArgList(ClickHouseSQLParser.ColumnArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#columnArgExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnArgExpr(ClickHouseSQLParser.ColumnArgExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#columnArgExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnArgExpr(ClickHouseSQLParser.ColumnArgExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#columnLambdaExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnLambdaExpr(ClickHouseSQLParser.ColumnLambdaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#columnLambdaExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnLambdaExpr(ClickHouseSQLParser.ColumnLambdaExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#columnIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterColumnIdentifier(ClickHouseSQLParser.ColumnIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#columnIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitColumnIdentifier(ClickHouseSQLParser.ColumnIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#nestedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterNestedIdentifier(ClickHouseSQLParser.NestedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#nestedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitNestedIdentifier(ClickHouseSQLParser.NestedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableExprIdentifier}
	 * labeled alternative in {@link ClickHouseSQLParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableExprIdentifier(ClickHouseSQLParser.TableExprIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableExprIdentifier}
	 * labeled alternative in {@link ClickHouseSQLParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableExprIdentifier(ClickHouseSQLParser.TableExprIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableExprSubquery}
	 * labeled alternative in {@link ClickHouseSQLParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableExprSubquery(ClickHouseSQLParser.TableExprSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableExprSubquery}
	 * labeled alternative in {@link ClickHouseSQLParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableExprSubquery(ClickHouseSQLParser.TableExprSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableExprAlias}
	 * labeled alternative in {@link ClickHouseSQLParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableExprAlias(ClickHouseSQLParser.TableExprAliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableExprAlias}
	 * labeled alternative in {@link ClickHouseSQLParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableExprAlias(ClickHouseSQLParser.TableExprAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableExprFunction}
	 * labeled alternative in {@link ClickHouseSQLParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableExprFunction(ClickHouseSQLParser.TableExprFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableExprFunction}
	 * labeled alternative in {@link ClickHouseSQLParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableExprFunction(ClickHouseSQLParser.TableExprFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#tableFunctionExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableFunctionExpr(ClickHouseSQLParser.TableFunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#tableFunctionExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableFunctionExpr(ClickHouseSQLParser.TableFunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(ClickHouseSQLParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(ClickHouseSQLParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#tableArgList}.
	 * @param ctx the parse tree
	 */
	void enterTableArgList(ClickHouseSQLParser.TableArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#tableArgList}.
	 * @param ctx the parse tree
	 */
	void exitTableArgList(ClickHouseSQLParser.TableArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#tableArgExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableArgExpr(ClickHouseSQLParser.TableArgExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#tableArgExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableArgExpr(ClickHouseSQLParser.TableArgExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#databaseIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseIdentifier(ClickHouseSQLParser.DatabaseIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#databaseIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseIdentifier(ClickHouseSQLParser.DatabaseIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#floatingLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatingLiteral(ClickHouseSQLParser.FloatingLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#floatingLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatingLiteral(ClickHouseSQLParser.FloatingLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(ClickHouseSQLParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(ClickHouseSQLParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ClickHouseSQLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ClickHouseSQLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(ClickHouseSQLParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(ClickHouseSQLParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(ClickHouseSQLParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(ClickHouseSQLParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#keywordForAlias}.
	 * @param ctx the parse tree
	 */
	void enterKeywordForAlias(ClickHouseSQLParser.KeywordForAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#keywordForAlias}.
	 * @param ctx the parse tree
	 */
	void exitKeywordForAlias(ClickHouseSQLParser.KeywordForAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(ClickHouseSQLParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(ClickHouseSQLParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ClickHouseSQLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ClickHouseSQLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#identifierOrNull}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierOrNull(ClickHouseSQLParser.IdentifierOrNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#identifierOrNull}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierOrNull(ClickHouseSQLParser.IdentifierOrNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseSQLParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(ClickHouseSQLParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseSQLParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(ClickHouseSQLParser.EnumValueContext ctx);
}