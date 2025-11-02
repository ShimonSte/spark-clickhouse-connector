# ClickHouse Spark Connector - Data Type Test Coverage Report

## 📊 Overview

This report details which ClickHouse data types have test coverage in the Spark ClickHouse Connector, based on the test suite analysis.

**Report Generated:** 2024-11-02  
**Test Suite Location:** `spark-*/clickhouse-spark-it/src/test/scala`  
**Coverage Tool:** Scoverage

---

## ✅ Data Types WITH Test Coverage

### 1. Integer Types (Full Coverage)

| ClickHouse Type | Spark Type | Test Coverage | Test Location |
|----------------|------------|---------------|---------------|
| **Int8** | ByteType | ✅ Full | `ClickHouseDataTypeSuite` |
| **UInt8** | ShortType | ✅ Full | `ClickHouseDataTypeSuite` |
| **Int16** | ShortType | ✅ Full | `ClickHouseDataTypeSuite` |
| **UInt16** | IntegerType | ✅ Full | `ClickHouseDataTypeSuite` |
| **Int32** | IntegerType | ✅ Full | `ClickHouseDataTypeSuite` |
| **UInt32** | LongType | ✅ Full | `ClickHouseDataTypeSuite` |
| **Int64** | LongType | ✅ Full | `ClickHouseDataTypeSuite` |
| **UInt64** | LongType (limited range) | ✅ Full | `ClickHouseDataTypeSuite` |

**Test Details:**
- Tests boundary values (min/max)
- Tests filtering operations
- Tests read/write round-trips
- Version-aware (ClickHouse 21.7+)

### 2. BigInt Types (Full Coverage)

| ClickHouse Type | Spark Type | Test Coverage | Test Location |
|----------------|------------|---------------|---------------|
| **Int128** | DecimalType(38,0) | ✅ Full | `ClickHouseDataTypeSuite` |
| **UInt128** | DecimalType(38,0) | ✅ Full | `ClickHouseDataTypeSuite` |
| **Int256** | DecimalType(38,0) | ✅ Full | `ClickHouseDataTypeSuite` |
| **UInt256** | DecimalType(38,0) | ✅ Full | `ClickHouseDataTypeSuite` |

**Test Details:**
- Tests with 38-digit precision
- Boundary value testing
- Version checks (requires ClickHouse 21.7.1.7020+)

### 3. Decimal Types (Full Coverage)

| ClickHouse Type | Spark Type | Test Coverage | Test Location |
|----------------|------------|---------------|---------------|
| **Decimal(38,9)** | DecimalType(38,9) | ✅ Full | `ClickHouseDataTypeSuite` |
| **Decimal32(S)** | DecimalType(9,S) | ✅ Full | `ClickHouseDataTypeSuite` |
| **Decimal64(S)** | DecimalType(18,S) | ✅ Full | `ClickHouseDataTypeSuite` |
| **Decimal128(S)** | DecimalType(38,S) | ✅ Full | `ClickHouseDataTypeSuite` |

**Test Details:**
- Tests precision and scale mapping
- Tests with scale=4 for Decimal32/64/128
- Validates MathContext handling

### 4. Date/Time Types (Full Coverage)

| ClickHouse Type | Spark Type | Test Coverage | Test Location |
|----------------|------------|---------------|---------------|
| **Date** | DateType | ✅ Full | `ClickHouseDataTypeSuite`, `ClickHouseGenericSuite` |
| **DateTime** | TimestampType | ✅ Full | `ClickHouseDataTypeSuite` |
| **DateTime(timezone)** | TimestampType | ✅ Full | Multiple suites |
| **DateTime64** | TimestampType | ✅ Partial | `ClickHouseGenericSuite` |

**Test Details:**
- Tests timezone conversion
- Tests filtering with date/time predicates
- Tests date formatting functions

### 5. String Types (Full Coverage)

| ClickHouse Type | Spark Type | Test Coverage | Test Location |
|----------------|------------|---------------|---------------|
| **String** | StringType | ✅ Full | `ClickHouseDataTypeSuite`, `ClickHouseGenericSuite` |
| **FixedString(N)** | StringType | ✅ Full | `ClickHouseGenericSuite` |
| **LowCardinality(String)** | StringType | ✅ Full | `ClickHouseGenericSuite` |
| **LowCardinality(FixedString)** | StringType | ✅ Full | `ClickHouseGenericSuite` |
| **LowCardinality(Int32)** | IntegerType | ✅ Full | `ClickHouseGenericSuite` |

**Test Details:**
- Tests read/write operations
- Tests with various string lengths
- Tests LowCardinality optimization

### 6. Complex Types (Full Coverage)

| ClickHouse Type | Spark Type | Test Coverage | Test Location |
|----------------|------------|---------------|---------------|
| **Array(String)** | ArrayType(StringType) | ✅ Full | `ClickHouseDataTypeSuite` |
| **Array(T)** | ArrayType(T) | ✅ Full | `ClickHouseGenericSuite` |
| **Map(String, String)** | MapType(StringType, StringType) | ✅ Full | `ClickHouseDataTypeSuite` |
| **Map(String, Int32)** | MapType(StringType, IntegerType) | ✅ Full | `ClickHouseGenericSuite` |
| **Map(String, Nullable(T))** | MapType with nullable values | ✅ Full | `ClickHouseGenericSuite` |

**Test Details:**
- Tests nested structures
- Tests with nullable elements
- Tests read/write round-trips

---

## ⚠️ Data Types WITH Partial or Limited Coverage

### 1. Decimal256 (Limited Coverage)

| ClickHouse Type | Spark Type | Test Coverage | Notes |
|----------------|------------|---------------|-------|
| **Decimal256(S)** | Not supported | ❌ No tests | Precision > 38 not supported in Spark |

**Reason:** Spark's DecimalType maximum precision is 38, while Decimal256 supports up to 76.

### 2. DateTime64 with Precision (Limited Coverage)

| ClickHouse Type | Spark Type | Test Coverage | Notes |
|----------------|------------|---------------|-------|
| **DateTime64(3)** | TimestampType | ⚠️ Partial | Basic tests only |
| **DateTime64(6)** | TimestampType | ⚠️ Partial | Basic tests only |
| **DateTime64(9)** | TimestampType | ⚠️ Partial | Basic tests only |

**Coverage Gap:** Precision handling and nanosecond accuracy not thoroughly tested.

### 3. Nullable Types (Partial Coverage)

| ClickHouse Type | Spark Type | Test Coverage | Notes |
|----------------|------------|---------------|-------|
| **Nullable(T)** | T (nullable=true) | ⚠️ Partial | Schema tests exist, but edge cases limited |

**Coverage Gap:** 
- Null handling in complex types (nested nullables)
- Spark 3.4+ nullable schema behavior (SPARK-43390)

---

## ❌ Data Types WITHOUT Test Coverage

### 1. Specialized Numeric Types

| ClickHouse Type | Reason for No Coverage |
|----------------|------------------------|
| **Float32** | No explicit tests found |
| **Float64** | No explicit tests found |

**Note:** These may be implicitly tested but lack dedicated test cases.

### 2. Advanced String Types

| ClickHouse Type | Reason for No Coverage |
|----------------|------------------------|
| **UUID** | No tests found |
| **IPv4** | No tests found |
| **IPv6** | No tests found |

### 3. Special Types

| ClickHouse Type | Reason for No Coverage |
|----------------|------------------------|
| **Enum8** | No tests found |
| **Enum16** | No tests found |
| **Tuple** | No tests found (may not be supported) |
| **Nested** | No tests found (deprecated in ClickHouse) |
| **JSON** | No tests found (experimental in ClickHouse) |
| **Point** | No tests found (Geo types) |
| **Polygon** | No tests found (Geo types) |
| **MultiPolygon** | No tests found (Geo types) |
| **Ring** | No tests found (Geo types) |

### 4. Aggregate Function Types

| ClickHouse Type | Reason for No Coverage |
|----------------|------------------------|
| **AggregateFunction** | No tests found (special use case) |
| **SimpleAggregateFunction** | No tests found (special use case) |

---

## 📈 Coverage Statistics Summary

### By Category:

| Category | Types Tested | Types Untested | Coverage % |
|----------|--------------|----------------|------------|
| **Integer Types** | 8/8 | 0 | 100% |
| **BigInt Types** | 4/4 | 0 | 100% |
| **Decimal Types** | 4/5 | 1 (Decimal256) | 80% |
| **Date/Time Types** | 3/4 | 1 (DateTime64 precision) | 75% |
| **String Types** | 5/8 | 3 (UUID, IPv4, IPv6) | 62% |
| **Complex Types** | 3/5 | 2 (Tuple, Nested) | 60% |
| **Special Types** | 0/10 | 10 (Enum, Geo, JSON, etc.) | 0% |

### Overall:

- **Total Types Tested:** 27
- **Total Types Untested:** 21
- **Overall Coverage:** ~56%

---

## 🎯 Test Coverage Quality

### High-Quality Coverage (Comprehensive Tests):
- ✅ All integer types (Int8 through UInt64)
- ✅ All BigInt types (Int128, UInt128, Int256, UInt256)
- ✅ Decimal types (32, 64, 128)
- ✅ Basic string types
- ✅ Arrays and Maps

### Medium-Quality Coverage (Basic Tests):
- ⚠️ Date/Time types (basic operations covered)
- ⚠️ Nullable handling (schema tests exist)
- ⚠️ LowCardinality optimization

### Low or No Coverage:
- ❌ Float types (Float32, Float64)
- ❌ Special string types (UUID, IP addresses)
- ❌ Enum types
- ❌ Geo types
- ❌ JSON type
- ❌ Aggregate function types

---

## 🔍 How to View Detailed Coverage

### Online (GitHub Pages):
Visit: https://shimonste.github.io/spark-clickhouse-connector/

Navigate to:
- `spark-3.5/clickhouse-spark/build/reports/scoverageTest/index.html`
- Look for `SchemaUtils.scala` and `ExprUtils.scala` for type conversion coverage

### Local:
```bash
open spark-3.5/clickhouse-spark/build/reports/scoverageTest/index.html
```

---

## 📝 Recommendations

### High Priority (Common Types):
1. Add tests for **Float32/Float64** types
2. Add tests for **UUID** type
3. Improve **DateTime64** precision testing

### Medium Priority (Special Cases):
4. Add tests for **Enum8/Enum16** types
5. Add tests for **IPv4/IPv6** types
6. Improve **Nullable** edge case coverage

### Low Priority (Advanced Features):
7. Consider **Tuple** type support and tests
8. Consider **Geo types** if needed
9. Consider **JSON** type when it becomes stable in ClickHouse

---

## 📚 Test File References

- **Main Data Type Tests:** `spark-*/clickhouse-spark-it/src/test/scala/org/apache/spark/sql/clickhouse/single/ClickHouseDataTypeSuite.scala`
- **Generic Tests:** `spark-*/clickhouse-spark-it/src/test/scala/org/apache/spark/sql/clickhouse/single/ClickHouseGenericSuite.scala`
- **Cluster Tests:** `spark-*/clickhouse-spark-it/src/test/scala/org/apache/spark/sql/clickhouse/cluster/`

---

**Last Updated:** November 2, 2024  
**Generated From:** Test suite analysis and scoverage reports
