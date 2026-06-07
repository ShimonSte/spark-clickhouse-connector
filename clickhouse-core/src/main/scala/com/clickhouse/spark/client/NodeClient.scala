/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clickhouse.spark.client

import com.clickhouse.client._
import com.clickhouse.client.api.{Client, ServerException}
import com.clickhouse.client.api.enums.Protocol
import com.clickhouse.client.api.insert.{InsertResponse, InsertSettings}
import com.clickhouse.client.api.query.{QueryResponse, QuerySettings}
import com.clickhouse.data.ClickHouseFormat
import com.clickhouse.spark.Logging

import java.util.concurrent.TimeUnit
import com.clickhouse.spark.exception.{CHClientException, CHException, CHServerException}
import com.clickhouse.spark.format.{
  JSONCompactEachRowWithNamesAndTypesSimpleOutput,
  JSONEachRowSimpleOutput,
  NamesAndTypes,
  SimpleOutput
}
import com.clickhouse.spark.Utils.RuntimeDetector.detectRuntime
import com.clickhouse.spark.spec.NodeSpec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ObjectNode

import java.io.{ByteArrayInputStream, InputStream}
import java.time.temporal.ChronoUnit
import java.util.UUID
import scala.util.{Failure, Success, Try}

object NodeClient {
  def apply(node: NodeSpec): NodeClient = new NodeClient(node)
}

class NodeClient(val nodeSpec: NodeSpec) extends AutoCloseable with Logging {
  // TODO: add configurable timeout
  private val timeout: Int = 60000

  private lazy val userAgent: String = {
    val title = getClass.getPackage.getImplementationTitle
    val version = getClass.getPackage.getImplementationVersion
    buildUserAgent(title, version)
  }

  private def buildUserAgent(title: String, version: String): String =
    (Option(title), Option(version)) match {
      case (Some(t), Some(v)) =>
        parseVersionString(v) match {
          case Some((spark, scala, connector)) =>
            val runtimeSuffix = getRuntimeEnvironmentSuffix()
            s"$t/$connector (fv:spark/$spark, lv:scala/$scala$runtimeSuffix)"
          case None => "Spark-ClickHouse-Connector"
        }
      case _ => "Spark-ClickHouse-Connector"
    }

  private def parseVersionString(version: String): Option[(String, String, String)] =
    version.split("_") match {
      case Array(spark, scala, connector, _*) => Some((spark, scala, connector))
      case _ => None
    }

  private def getRuntimeEnvironmentSuffix(): String =
    if (shouldInferRuntime()) {
      detectRuntime()
        .filter(_.nonEmpty)
        .fold("")(env => s", env:$env")
    } else {
      ""
    }

  private def shouldInferRuntime(): Boolean =
    nodeSpec.infer_runtime_env.equalsIgnoreCase("true") || nodeSpec.infer_runtime_env == "1"

  private def createClickHouseURL(nodeSpec: NodeSpec): String = {
    val ssl: Boolean = nodeSpec.options.getOrDefault("ssl", "false").toBoolean
    if (ssl) {
      s"https://${nodeSpec.host}:${nodeSpec.port}"
    } else {
      s"http://${nodeSpec.host}:${nodeSpec.port}"
    }
  }

  // Pool sizing: one shared client per executor serves many concurrent tasks, so size the
  // pool to the executor's parallelism. Overridable via the `client_max_connections` node
  // option; Phase 8 wires spark.clickhouse.write.client.maxConnections into this.
  private val maxConnections: Int =
    Option(nodeSpec.options.get("client_max_connections")).map(_.toInt)
      .getOrElse(Runtime.getRuntime.availableProcessors() * 2)

  private val client = new Client.Builder()
    .setUsername(nodeSpec.username)
    .setPassword(nodeSpec.password)
    .setDefaultDatabase(nodeSpec.database)
    .setOptions(nodeSpec.options)
    .setClientName(userAgent)
    .addEndpoint(createClickHouseURL(nodeSpec))
    .setMaxConnections(maxConnections)
    .setConnectTimeout(timeout.toLong, ChronoUnit.MILLIS)
    .setConnectionRequestTimeout(timeout.toLong, ChronoUnit.MILLIS)
    .build()

  override def close(): Unit =
    client.close()

  private def nextQueryId(): String = UUID.randomUUID.toString

  // //////////////////////////////////////////////////////////////////////////////
  // ///////////////////////// Synchronized Normal API ////////////////////////////
  // //////////////////////////////////////////////////////////////////////////////

  def syncQueryOutputJSONEachRow(
    sql: String,
    settings: Map[String, String] = Map.empty
  ): Either[CHException, SimpleOutput[ObjectNode]] =
    syncQuery(sql, "JSONEachRow", JSONEachRowSimpleOutput.deserialize, settings)

  def syncQueryAndCheckOutputJSONEachRow(
    sql: String,
    settings: Map[String, String] = Map.empty
  ): SimpleOutput[ObjectNode] =
    syncQueryAndCheck(sql, "JSONEachRow", JSONEachRowSimpleOutput.deserialize, settings)

  def syncInsertOutputJSONEachRow(
    database: String,
    table: String,
    inputFormat: String,
    data: InputStream,
    settings: Map[String, String] = Map.empty
  ): Either[CHException, SimpleOutput[ObjectNode]] =
    syncInsert(
      database,
      table,
      inputFormat,
      data,
      "JSONEachRow",
      JSONEachRowSimpleOutput.deserialize,
      settings
    )

  def syncQueryAndCheckOutputJSONCompactEachRowWithNamesAndTypes(
    sql: String,
    settings: Map[String, String] = Map.empty
  ): SimpleOutput[Array[JsonNode]] with NamesAndTypes =
    syncQueryAndCheck(
      sql,
      "JSONCompactEachRowWithNamesAndTypes",
      JSONCompactEachRowWithNamesAndTypesSimpleOutput.deserialize,
      settings
    ).asInstanceOf[SimpleOutput[Array[JsonNode]] with NamesAndTypes]

  def insertArrowStream(
    table: String,
    payload: InputStream,
    database: String,
    settings: Map[String, String] = Map.empty
  ): Either[CHException, Unit] = {
    val queryId = nextQueryId()
    onExecuteQuery(queryId, s"INSERT INTO `$database`.`$table` FORMAT ArrowStream")
    rawInsert(table, database, payload, ClickHouseFormat.ArrowStream, settings).map(_ => ())
  }

  def syncInsert[OUT](
    database: String,
    table: String,
    inputFormat: String,
    data: InputStream,
    outputFormat: String,
    deserializer: InputStream => SimpleOutput[OUT],
    settings: Map[String, String]
  ): Either[CHException, SimpleOutput[OUT]] = {
    val queryId = nextQueryId()
    val sql = s"INSERT INTO `$database`.`$table` FORMAT $inputFormat"
    onExecuteQuery(queryId, sql)
    rawInsert(table, database, data, ClickHouseFormat.valueOf(inputFormat), settings)
      .map(_ => deserializer(new ByteArrayInputStream(Array.emptyByteArray)))
  }

  private def rawInsert(
    table: String,
    database: String,
    data: InputStream,
    format: ClickHouseFormat,
    settings: Map[String, String]
  ): Either[CHException, InsertResponse] = {
    val insertSettings: InsertSettings = new InsertSettings()
    settings.foreach { case (k, v) => insertSettings.setOption(k, v) }
    insertSettings.setDatabase(database)
    // TODO: check what type of compression is supported by the client v2
    insertSettings.compressClientRequest(true)
    Try(client.insert(table, data, format, insertSettings).get()) match {
      case Success(resp: InsertResponse) => Right(resp)
      case Success(other) =>
        Left(CHClientException(s"Unexpected insert response: $other", Some(nodeSpec), None))
      case Failure(se: ServerException) =>
        Left(CHServerException(se.getCode, se.getMessage, Some(nodeSpec), Some(se)))
      case Failure(ex) => Left(CHClientException(ex.getMessage, Some(nodeSpec), Some(ex)))
    }
  }

  def syncQuery[OUT](
    sql: String,
    outputFormat: String,
    deserializer: InputStream => SimpleOutput[OUT],
    settings: Map[String, String]
  ): Either[CHException, SimpleOutput[OUT]] = {
    val queryId = nextQueryId()
    onExecuteQuery(queryId, sql)
    val querySettings: QuerySettings = new QuerySettings()
    val clickHouseFormat = ClickHouseFormat.valueOf(outputFormat)
    querySettings.setFormat(clickHouseFormat)
    querySettings.setQueryId(queryId)
    settings.foreach { case (k, v) => querySettings.setOption(k, v) }
    Try(client.query(sql, querySettings).get(timeout, TimeUnit.MILLISECONDS)) match {
      case Success(response: QueryResponse) => Right(deserializer(response.getInputStream))
      case Failure(se: ServerException) => Left(CHServerException(se.getCode, se.getMessage, Some(nodeSpec), Some(se)))
      case Failure(ex: Exception) => Left(CHClientException(ex.getMessage, Some(nodeSpec), Some(ex)))
    }
  }

  def syncQueryAndCheck[OUT](
    sql: String,
    outputFormat: String,
    deserializer: InputStream => SimpleOutput[OUT],
    settings: Map[String, String]
  ): SimpleOutput[OUT] = syncQuery[OUT](sql, outputFormat, deserializer, settings) match {
    case Left(rethrow) => throw rethrow
    case Right(output) => output
  }

  // //////////////////////////////////////////////////////////////////////////////
  // ///////////////////////// ret QueryResponse /////////////////////////////
  // //////////////////////////////////////////////////////////////////////////////

  def queryAndCheck(
    sql: String,
    outputFormat: String,
    settings: Map[String, String] = Map.empty
  ): QueryResponse = {
    val queryId = nextQueryId()
    onExecuteQuery(queryId, sql)
    val querySettings: QuerySettings = new QuerySettings()
    val clickHouseFormat = ClickHouseFormat.valueOf(outputFormat)
    querySettings.setFormat(clickHouseFormat)
    querySettings.setQueryId(queryId)
    settings.foreach { case (k, v) => querySettings.setOption(k, v) }

    Try(client.query(sql, querySettings).get(timeout, TimeUnit.MILLISECONDS)) match {
      case Success(response: QueryResponse) => response
      case Failure(se: ServerException) => throw CHServerException(se.getCode, se.getMessage, Some(nodeSpec), Some(se))
      case Failure(ex: Exception) => throw CHClientException(ex.getMessage, Some(nodeSpec), Some(ex))
    }
  }

  // //////////////////////////////////////////////////////////////////////////////
  // /////////////////////////////////// Hook /////////////////////////////////////
  // //////////////////////////////////////////////////////////////////////////////

  def onExecuteQuery(queryId: String, sql: String): Unit = log.debug(
    s"""Execute ClickHouse SQL [$queryId]:
       |$sql
       |""".stripMargin
  )
  def ping(timeout: Int = timeout) =
    client.ping(timeout)
}
