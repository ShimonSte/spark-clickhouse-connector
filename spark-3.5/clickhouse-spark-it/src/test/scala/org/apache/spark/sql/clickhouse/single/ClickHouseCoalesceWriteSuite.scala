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

package org.apache.spark.sql.clickhouse.single

import com.clickhouse.spark.base.ClickHouseSingleMixIn
import org.apache.spark.sql.{Row, SaveMode}
import org.apache.spark.sql.types._

/**
 * End-to-end integration tests for the arrow write coalescing path
 * (`spark.clickhouse.write.coalesce.enabled`).
 *
 * Test 1 proves a coalesced arrow write produces correct data.
 * Test 2 proves the disabled (default) path still writes correctly.
 */
class ClickHouseCoalesceWriteSuite extends SparkClickHouseSingleTest with ClickHouseSingleMixIn {

  /** Set the given spark.conf keys, run f, then restore the previous values. */
  private def withConf(kvs: (String, String)*)(f: => Unit): Unit = {
    val previous = kvs.map { case (k, _) =>
      k -> (if (spark.conf.contains(k)) Some(spark.conf.get(k)) else None)
    }
    try {
      kvs.foreach { case (k, v) => spark.conf.set(k, v) }
      f
    } finally
      previous.foreach {
        case (k, Some(v)) => spark.conf.set(k, v)
        case (k, None) => spark.conf.unset(k)
      }
  }

  test("coalesced arrow write is correct") {
    withConf(
      "spark.clickhouse.write.format" -> "arrow",
      "spark.clickhouse.write.coalesce.enabled" -> "true",
      "spark.clickhouse.write.coalesce.targetBytes" -> "64m",
      "spark.clickhouse.write.coalesce.lingerMs" -> "200",
      "spark.clickhouse.write.batchSize" -> "1000"
    ) {
      val schema = StructType(Seq(
        StructField("id", IntegerType, nullable = false),
        StructField("v", StringType, nullable = false)
      ))

      withTable("test_db", "test_coalesce_arrow", schema) { (actualDb: String, actualTbl: String) =>
        val n = 5000
        val data = (1 to n).map(i => Row(i, s"v$i"))
        val df = spark.createDataFrame(spark.sparkContext.parallelize(data), schema)
          .repartition(4)
        df.write.mode(SaveMode.Append).saveAsTable(s"$actualDb.$actualTbl")

        val agg = spark.table(s"$actualDb.$actualTbl")
          .selectExpr("count(*) AS c", "sum(id) AS s")
          .collect()(0)
        val count = agg.getLong(0)
        val idSum = agg.getLong(1)
        assert(count == n, s"expected $n rows, got $count")
        assert(idSum == n.toLong * (n + 1) / 2, s"unexpected sum(id)=$idSum")

        // ClickHouseCommandRunner returns each result row as a single JSON string
        // column, e.g. {"c":"4"}. Extract the count() value from it.
        val partsJson = runClickHouseSQL(
          s"SELECT count() AS c FROM system.parts " +
            s"WHERE database='$actualDb' AND table='$actualTbl' AND active"
        ).collect()(0).getString(0)
        val activeParts =
          """"c"\s*:\s*"?(\d+)"?""".r.findFirstMatchIn(partsJson)
            .map(_.group(1).toLong)
            .getOrElse(throw new AssertionError(s"could not parse parts count from: $partsJson"))
        info(s"coalesced arrow write: $count rows, active parts = $activeParts")
        assert(activeParts >= 1, s"expected at least 1 active part, got $activeParts")
      }
    }
  }

  test("coalesce disabled writes correctly (baseline)") {
    withConf(
      "spark.clickhouse.write.format" -> "arrow",
      "spark.clickhouse.write.coalesce.enabled" -> "false"
    ) {
      val schema = StructType(Seq(
        StructField("id", IntegerType, nullable = false)
      ))

      withTable("test_db", "test_coalesce_disabled", schema) { (actualDb: String, actualTbl: String) =>
        val n = 1000
        val data = (1 to n).map(i => Row(i))
        val df = spark.createDataFrame(spark.sparkContext.parallelize(data), schema)
          .repartition(4)
        df.write.mode(SaveMode.Append).saveAsTable(s"$actualDb.$actualTbl")

        val count = spark.table(s"$actualDb.$actualTbl").count()
        assert(count == n, s"expected $n rows, got $count")
      }
    }
  }
}
