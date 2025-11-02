# ClickHouse Spark Connector - JaCoCo Coverage Report

**Report Generated:** November 2, 2024  
**Coverage Tool:** JaCoCo 0.8.11 (Runtime Instrumentation)  
**Test Execution:** All tests for Spark 3.5, Scala 2.12  
**Report Location:** `build/reports/jacoco/aggregate/html/index.html`

---

## 📊 Executive Summary

| Metric | Coverage | Status |
|--------|----------|--------|
| **Overall Instructions** | 38.7% | ❌ Poor |
| **Overall Branches** | 18.1% | ❌ Critical |
| **Read Operations** | 51.3% instruction, 16.6% branch | ⚠️ Moderate |
| **Write Operations** | 61.8% instruction, 31.0% branch | ⚠️ Moderate |
| **Type Conversions (SchemaUtils)** | 80.5% instruction, 69.0% branch | ✅ Good |

**Key Finding:** While core read/write operations show moderate instruction coverage (51-62%), branch coverage is critically low (16-31%), indicating many error paths and edge cases are untested.

---

## 1️⃣ Read Operations Coverage

### Package: `com.clickhouse.spark.read`

**Overall Package Coverage:**
- **Instructions:** 51.3% (1,928 / 3,756)
- **Branches:** 16.6% (49 / 295)
- **Status:** ⚠️ Moderate instruction, ❌ Poor branch coverage

### Core Read Classes

| Class | Instruction Coverage | Branch Coverage | Status |
|-------|---------------------|-----------------|--------|
| **ClickHouseReader** | 62.8% (396/631) | 43.3% | ⚠️ Moderate |
| **ClickHouseBatchScan** | 64.6% (508/786) | 52.9% | ⚠️ Moderate |
| **ClickHouseScanBuilder** | 66.1% (543/821) | 18.2% | ⚠️ Poor branches |
| **ClickHouseInputPartition** | ~24% | ~10% | ❌ Poor |

### Read Format Implementations

**Package: `com.clickhouse.spark.read.format`**
- **Overall:** 55.7% instruction (590/1,059), 47.9% branch (70/146)

| Class | Instruction Coverage | Branch Coverage | Status |
|-------|---------------------|-----------------|--------|
| **ClickHouseJsonReader** | 79.3% (410/517) | 77.4% | ✅ Good |
| **ClickHouseBinaryReader** | 33.2% (180/542) | 26.2% | ❌ Poor |

### Analysis

**✅ Well Covered:**
- JSON format reading (79% instruction, 77% branch)
- Batch scan operations (65% instruction, 53% branch)
- Basic reader functionality (63% instruction, 43% branch)

**❌ Poorly Covered:**
- Binary format reading (33% instruction, 26% branch)
- Scan builder branches (only 18% branch coverage)
- Input partition logic (24% instruction)
- Error handling paths (implied by low branch coverage)

**Critical Gap:** Only 16.6% of branches tested means:
- 83.4% of decision paths (if/else, match/case) are untested
- Error handling likely not covered
- Edge cases missing
- Alternative code paths not validated

---

## 2️⃣ Write Operations Coverage

### Package: `com.clickhouse.spark.write`

**Overall Package Coverage:**
- **Instructions:** 61.8% (1,631 / 2,639)
- **Branches:** 31.0% (92 / 297)
- **Status:** ⚠️ Moderate instruction, ⚠️ Poor branch coverage

### Core Write Classes

| Class | Instruction Coverage | Branch Coverage | Status |
|-------|---------------------|-----------------|--------|
| **ClickHouseWriter** | 73.6% (1,254/1,704) | 46.6% | ✅ Good instruction, ⚠️ Moderate branch |
| **ClickHouseWrite** | ~76% | ~69% | ✅ Good |
| **ClickHouseBatchWrite** | ~64% | ~52% | ⚠️ Moderate |
| **WriteJobDescription** | ~35% | ~13% | ❌ Poor |

### Write Format Implementations

**Package: `com.clickhouse.spark.write.format`**
- **Overall:** 100.0% instruction (132/132), 0% branch (0/0)

| Class | Instruction Coverage | Branch Coverage | Notes |
|-------|---------------------|-----------------|-------|
| **ClickHouseArrowStreamWriter** | 100% | N/A | No branches in instrumented code |
| **ClickHouseJsonEachRowWriter** | 100% | N/A | No branches in instrumented code |

### Analysis

**✅ Well Covered:**
- Main writer implementation (74% instruction, 47% branch)
- Write operations (76% instruction, 69% branch)
- Format writers (100% instruction - but no branches tested)

**❌ Poorly Covered:**
- Write job configuration (35% instruction, 13% branch)
- Overall branch coverage only 31% (69% of branches untested)
- Error handling paths
- Retry logic
- Connection failure scenarios

**Critical Gap:** 31% branch coverage means:
- 69% of decision paths untested
- Most error conditions not validated
- Alternative write strategies not tested
- Failure recovery paths missing

---

## 3️⃣ Type Conversion Coverage

### Package: `org.apache.spark.sql.clickhouse`

**Overall Package Coverage:**
- **Instructions:** 58.2% (2,310 / 3,966)
- **Branches:** 44.2% (169 / 382)
- **Status:** ⚠️ Moderate

### SchemaUtils - Type Conversion Engine

**🎯 Quick Summary:**
- **Primary Function:** Converts data types between Spark SQL and ClickHouse
- **Key Methods:** `fromClickHouseType`, `toClickHouseType`, `fromClickHouseSchema`, `toClickHouseSchema`
- **Overall Status:** ✅ Good coverage with some gaps in Float/Boolean types
- **Test Quality:** 96% line coverage, 69% branch coverage

**Overall Coverage:**

| Metric | Coverage | Status |
|--------|----------|--------|
| **Instructions** | 80.5% (941/1,169) | ✅ Good |
| **Branches** | 69.0% (127/184) | ✅ Good |
| **Lines** | 96.2% (76/79) | ✅ Excellent |
| **Methods** | 92.9% (13/14) | ✅ Excellent |
| **Complexity** | 48.1% (51/106) | ⚠️ Moderate |

**📝 Note on Scala Objects:** JaCoCo reports two classes for Scala singleton objects:
- `SchemaUtils` (wrapper class): 0% - This is normal, it's just an empty wrapper
- `SchemaUtils$` (companion object): 80.5% instruction, 69% branch - **This is the actual implementation**

#### Method-Level Coverage Breakdown

| Method | Purpose | Instruction Coverage | Branch Coverage | Status |
|--------|---------|---------------------|-----------------|--------|
| **fromClickHouseType** | Convert ClickHouse → Spark types | 79.7% (576/723) | 69.0% (98/142) | ✅ Good |
| **toClickHouseType** | Convert Spark → ClickHouse types | 78.1% (196/251) | 70.6% (24/34) | ✅ Good |
| **fromClickHouseSchema** | Convert full schema CH → Spark | 100.0% (11/11) | N/A | ✅ Excellent |
| **toClickHouseSchema** | Convert full schema Spark → CH | 100.0% (16/16) | N/A | ✅ Excellent |
| **maybeNullable** | Wrap type with Nullable | 100.0% (8/8) | 100.0% (2/2) | ✅ Perfect |
| **wrapNullable** | Add Nullable() wrapper | 100.0% (12/12) | N/A | ✅ Perfect |

#### What's Well Covered

**✅ Excellent Coverage (90%+):**
- Schema-level conversions (100%)
- Nullable type handling (100%)
- Line coverage (96.2%)
- Method coverage (92.9%)

**✅ Good Coverage (70-80%):**
- Core type conversions (`fromClickHouseType`: 79.7%, `toClickHouseType`: 78.1%)
- Branch coverage for type matching (69-70%)
- Overall instruction coverage (80.5%)

#### What's Missing (31% of Branches)

**⚠️ Untested Branches (from earlier analysis):**
1. **Float Types** - Float32/Float64 conversion paths (yellow in JaCoCo)
2. **Boolean Type** - UInt8 ↔ Boolean conversion (yellow in JaCoCo)
3. **Varchar/Char Types** - Only one nullable variant tested (yellow in JaCoCo)
4. **Error Paths** - Some exception handling branches not tested
5. **Edge Cases** - Unusual type combinations

**Estimated Missing Coverage:**
- ~20% of type conversion branches (31% of 184 branches = 57 branches)
- Primarily alternative type paths and error conditions
- Some nullable/non-nullable variant combinations

#### Coverage Quality Analysis

**Strengths:**
- ✅ All major data types tested (Int, Long, String, Date, DateTime, Decimal, Array, Map)
- ✅ Nullable handling fully tested (100% branch coverage)
- ✅ Schema-level operations fully tested
- ✅ 96% line coverage indicates most code paths execute

**Weaknesses:**
- ⚠️ 48% complexity coverage suggests complex code paths undertested
- ⚠️ 31% of branches missed (57 out of 184)
- ⚠️ Float/Double types have partial coverage
- ⚠️ Boolean conversion has partial coverage

#### Recommendations

**Priority 1: Add Missing Type Tests**
```scala
test("toClickHouseType - FloatType") {
  val chType = SchemaUtils.toClickHouseType(FloatType, nullable = false)
  assert(chType == "Float32")
}

test("toClickHouseType - DoubleType") {
  val chType = SchemaUtils.toClickHouseType(DoubleType, nullable = false)
  assert(chType == "Float64")
}

test("toClickHouseType - BooleanType") {
  val chType = SchemaUtils.toClickHouseType(BooleanType, nullable = false)
  assert(chType == "UInt8")
}
```

**Priority 2: Test Nullable Variants**
```scala
test("toClickHouseType - VarcharType nullable") {
  val chType = SchemaUtils.toClickHouseType(VarcharType(100), nullable = true)
  assert(chType == "Nullable(String)")
}

test("toClickHouseType - VarcharType non-nullable") {
  val chType = SchemaUtils.toClickHouseType(VarcharType(100), nullable = false)
  assert(chType == "String")
}
```

**Priority 3: Test Error Conditions**
```scala
test("fromClickHouseType - unsupported type") {
  assertThrows[CHClientException] {
    SchemaUtils.fromClickHouseType(unsupportedColumn)
  }
}
```

### Type Conversion Analysis

**SchemaUtils Coverage (Actual Implementation):**
- **Instructions:** 80.5% (941/1,169) ✅ Excellent
- **Branches:** 69.0% (127/184) ✅ Good

**What This Means:**
- ✅ Most type conversion code paths are tested
- ✅ Good branch coverage for nullable variants
- ⚠️ Still missing: Some edge cases and error paths (31% of branches untested)

**Known Gaps from Earlier Analysis:**
- ❌ Float32/Float64 types (yellow coverage - partial)
- ❌ Boolean type (yellow coverage - partial)
- ⚠️ Varchar/Char types (yellow coverage - only one nullable variant tested)

---

## 4️⃣ Function Registry & Utilities

### Package: `com.clickhouse.spark.func`

**Overall Package Coverage:**
- **Instructions:** 65.3% (860 / 1,318)
- **Branches:** 31.0% (13 / 42)
- **Status:** ✅ Good instruction, ⚠️ Moderate branch

**Functions Covered:**
- Hash functions (CityHash64, MurmurHash2/3, XxHash64)
- Function registration and lookup
- Static and dynamic function registries

---

## 5️⃣ Coverage by Component

### Summary Table

| Component | Instructions | Branches | Priority |
|-----------|-------------|----------|----------|
| **Write Format** | 100.0% | 0% | 🟡 No branches to test |
| **SchemaUtils (Type Conversions)** | 80.5% | 69.0% | ✅ Good |
| **JSON Reader** | 79.3% | 77.4% | ✅ Excellent |
| **Writer** | 73.6% | 46.6% | ⚠️ Improve branches |
| **Scan Builder** | 66.1% | 18.2% | 🔴 Critical - branches |
| **Functions** | 65.3% | 31.0% | ⚠️ Improve branches |
| **Batch Scan** | 64.6% | 52.9% | ⚠️ Moderate |
| **Reader** | 62.8% | 43.3% | ⚠️ Moderate |
| **Write Package** | 61.8% | 31.0% | ⚠️ Improve branches |
| **Read Format** | 55.7% | 47.9% | ⚠️ Moderate |
| **Read Package** | 51.3% | 16.6% | 🔴 Critical - branches |
| **Binary Reader** | 33.2% | 26.2% | 🔴 Critical |
| **Overall** | 38.7% | 18.1% | 🔴 Critical |

---

## 6️⃣ Critical Findings

### 🔴 Critical Issues (Immediate Action Required)

1. **Overall Branch Coverage: 18.1%**
   - **Risk:** 81.9% of decision paths are untested
   - **Impact:** Most error handling, edge cases, and alternative paths are not validated
   - **Recommendation:** Focus on branch coverage improvement

2. **Read Package Branch Coverage: 16.6%**
   - **Risk:** 83.4% of read operation branches untested
   - **Impact:** Error handling during reads completely untested
   - **Recommendation:** Add error scenario tests

3. **Binary Reader: 33.2% instruction, 26.2% branch**
   - **Risk:** Primary read format poorly tested
   - **Impact:** Binary format bugs likely in production
   - **Recommendation:** Add comprehensive binary format tests

4. **Scan Builder Branches: 18.2%**
   - **Risk:** Query planning and optimization paths untested
   - **Impact:** Performance issues and query failures may occur
   - **Recommendation:** Test all scan builder code paths

### 🟡 High Priority Issues

5. **Write Package Branch Coverage: 31.0%**
   - **Risk:** 69% of write decision paths untested
   - **Impact:** Write failures and data loss scenarios not validated
   - **Recommendation:** Add write error handling tests

6. **Overall Instruction Coverage: 38.7%**
   - **Risk:** 61.3% of code never executes in tests
   - **Impact:** Large portions of codebase untested
   - **Recommendation:** Increase test coverage across all modules

---

## 7️⃣ Coverage Gaps Analysis

### What's NOT Tested (Based on Low Branch Coverage)

**Read Operations (16.6% branch coverage suggests missing):**
- ❌ Connection failure handling
- ❌ Timeout scenarios
- ❌ Malformed data handling
- ❌ Partition reading errors
- ❌ Format parsing errors (especially binary)
- ❌ Null value handling edge cases
- ❌ Large dataset scenarios
- ❌ Concurrent read operations

**Write Operations (31.0% branch coverage suggests missing):**
- ❌ Write failure handling
- ❌ Retry logic validation
- ❌ Transaction rollback scenarios
- ❌ Batch write failures
- ❌ Connection loss during writes
- ❌ Data validation errors
- ❌ Format serialization errors
- ❌ Concurrent write operations

**Type Conversions (44.2% branch coverage suggests missing):**
- ❌ Float/Double type conversions
- ❌ Boolean type conversions
- ❌ Nullable vs non-nullable variants
- ❌ Varchar/Char type conversions
- ❌ Type conversion errors
- ❌ Overflow/underflow scenarios

---

## 8️⃣ Recommendations

### Immediate Actions (Week 1)

**Priority 1: Improve Branch Coverage**

1. **Add Error Handling Tests**
   ```scala
   test("Read - connection failure") {
     // Test connection failure scenario
     // Expected: Proper error handling
   }
   
   test("Write - retry on failure") {
     // Test retry logic
     // Expected: Successful retry or proper failure
   }
   ```

2. **Add Binary Reader Tests**
   ```scala
   test("Binary Reader - all data types") {
     // Test binary format with all supported types
   }
   
   test("Binary Reader - malformed data") {
     // Test error handling for bad data
   }
   ```

3. **Add Scan Builder Path Tests**
   ```scala
   test("Scan Builder - with filters") {
     // Test filter push-down paths
   }
   
   test("Scan Builder - without filters") {
     // Test full scan path
   }
   ```

### Short-term Actions (Month 1)

**Priority 2: Increase Instruction Coverage**

4. **Add Missing Type Tests**
   - Float32/Float64 types
   - Boolean types
   - Varchar/Char types
   - All nullable variants

5. **Add Format-Specific Tests**
   - Comprehensive JSON format tests
   - Comprehensive Binary format tests
   - Arrow format edge cases

6. **Add Partition Tests**
   - Partition reading
   - Partition writing
   - Partition pruning

### Long-term Actions (Quarter 1)

**Priority 3: Achieve Target Coverage**

7. **Target Goals:**
   - Overall instruction coverage: 70%+ (from 38.7%)
   - Overall branch coverage: 60%+ (from 18.1%)
   - Read operations branch: 60%+ (from 16.6%)
   - Write operations branch: 60%+ (from 31.0%)

8. **Add Stress Tests:**
   - Large dataset operations
   - Concurrent operations
   - Memory pressure scenarios
   - Performance regression tests

9. **Continuous Monitoring:**
   - Set up coverage thresholds in CI
   - Fail builds if coverage drops below 60%
   - Weekly coverage reviews

---

## 9️⃣ How to Improve Coverage

### Step 1: Identify Red/Yellow Code

```bash
# Open JaCoCo report
open build/reports/jacoco/aggregate/html/index.html

# Navigate to:
# 1. com.clickhouse.spark.read → Find red/yellow lines
# 2. com.clickhouse.spark.write → Find red/yellow lines
# 3. Look for yellow diamonds (◆) → These are untested branches
```

### Step 2: Write Tests for Untested Branches

**Example: If you see yellow on an if/else:**

```scala
// Code with yellow coverage:
if (format == "binary") {  // 🟡 Yellow diamond
  readBinary()             // 🟢 Green - tested
} else {
  readJson()               // 🔴 Red - NOT tested
}

// Add test:
test("Read - JSON format") {
  spark.conf.set("spark.clickhouse.read.format", "json")
  // Test JSON reading
}
```

### Step 3: Focus on Error Paths

**Most untested code is error handling:**

```scala
test("Read - handle connection timeout") {
  // Simulate timeout
  // Verify proper error handling
}

test("Write - handle disk full") {
  // Simulate disk full
  // Verify proper error handling
}
```

### Step 4: Re-run Coverage

```bash
./gradlew clean test jacocoAggregateReport \
  -Dspark_binary_version=3.5 \
  -Dscala_binary_version=2.12

open build/reports/jacoco/aggregate/html/index.html
```

---

## 🔟 Coverage Metrics Explained

### Instruction Coverage
**What it measures:** Percentage of bytecode instructions executed

**38.7% means:**
- 38.7% of code instructions were executed during tests
- 61.3% of code never ran in tests

**Target:** 70-80% minimum

### Branch Coverage
**What it measures:** Percentage of decision paths taken (if/else, match/case)

**18.1% means:**
- Only 18.1% of decision branches were tested
- 81.9% of branches (error paths, edge cases) are untested

**Target:** 60-70% minimum

### Why Branch Coverage is Critical

**Example:**
```scala
def divide(a: Int, b: Int): Int = {
  if (b == 0) {              // Branch point
    throw new Exception()    // Branch A - error path
  }
  a / b                      // Branch B - happy path
}

// Test: divide(10, 2)
// Instruction Coverage: 75% ✅
// Branch Coverage: 50% ⚠️ (only happy path tested)
```

**Your 18.1% branch coverage means:**
- Most code runs in happy path scenarios
- But 81.9% of error/edge case paths are untested
- Production bugs likely in error handling

---

## 1️⃣1️⃣ Comparison with Previous Analysis

### Scoverage vs JaCoCo Results

| Component | Scoverage | JaCoCo | Difference |
|-----------|-----------|--------|------------|
| **Read Operations** | 0% | 51.3% instruction | ✅ JaCoCo captures it |
| **Write Operations** | 0% | 61.8% instruction | ✅ JaCoCo captures it |
| **Type Conversions (SchemaUtils)** | 55% | 80.5% instruction | ✅ JaCoCo shows better coverage |

**Why JaCoCo is Better:**
- ✅ Runtime instrumentation captures cross-module coverage
- ✅ Tests in `-it` modules now show coverage
- ✅ More accurate representation of actual test execution

**Why Scoverage Failed:**
- ❌ Compile-time instrumentation only
- ❌ Couldn't track execution across module boundaries
- ❌ Integration tests didn't register coverage

**Note on SchemaUtils Coverage:**
- Scoverage reported 55% for SchemaUtils
- JaCoCo shows 80.5% instruction, 69% branch
- The difference is because JaCoCo properly tracks the Scala companion object (`SchemaUtils$`)
- JaCoCo's runtime instrumentation captures more accurate coverage for Scala objects

---

## 1️⃣2️⃣ Action Plan Summary

### Week 1: Critical Fixes
- [ ] Add binary reader tests (target: 60% coverage)
- [ ] Add error handling tests for read operations
- [ ] Add error handling tests for write operations
- [ ] Target: Bring branch coverage to 25%+

### Month 1: High Priority
- [ ] Add all missing type tests (Float, Boolean, Varchar)
- [ ] Add partition operation tests
- [ ] Add format-specific edge case tests
- [ ] Target: Bring instruction coverage to 50%+, branch to 35%+

### Quarter 1: Target Goals
- [ ] Comprehensive test suite for all components
- [ ] Stress and performance tests
- [ ] Target: 70% instruction, 60% branch coverage

---

## 1️⃣3️⃣ Resources

### View Coverage Reports

```bash
# Aggregate report (all modules)
open build/reports/jacoco/aggregate/html/index.html

# Individual module reports
open spark-3.5/clickhouse-spark/build/reports/jacoco/test/html/index.html
```

### Generate New Reports

```bash
# Run tests with coverage
./gradlew clean test jacocoAggregateReport \
  -Dspark_binary_version=3.5 \
  -Dscala_binary_version=2.12 \
  --no-daemon

# View results
open build/reports/jacoco/aggregate/html/index.html
```

### Key Files to Review

- **Read Operations:** `com/clickhouse/spark/read/ClickHouseReader.scala`
- **Write Operations:** `com/clickhouse/spark/write/ClickHouseWriter.scala`
- **Type Conversions:** `org/apache/spark/sql/clickhouse/SchemaUtils.scala`
- **Format Readers:** `com/clickhouse/spark/read/format/*.scala`
- **Format Writers:** `com/clickhouse/spark/write/format/*.scala`

---

**Report Generated:** November 2, 2024  
**Next Review:** Weekly until 60% branch coverage achieved  
**Tool:** JaCoCo 0.8.11 with aggregate multi-module reporting  
**Status:** 🔴 Critical - Immediate action required on branch coverage
