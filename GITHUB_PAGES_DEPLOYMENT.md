# GitHub Pages Deployment - JaCoCo Coverage Reports

## ✅ What Was Done

### 1. Updated GitHub Actions Workflow

**File:** `.github/workflows/build-and-test.yml`

**Changes:**
- ✅ Added `jacocoTestReport` to test execution (line 44)
- ✅ Added JaCoCo reports to artifact uploads (line 56)
- ✅ Added JaCoCo report copying to GitHub Pages deployment (lines 135-149)
- ✅ Updated landing page HTML to include JaCoCo links (lines 179-210)

### 2. Created Local Deployment Script

**File:** `deploy-coverage-local.sh`

**Purpose:** Test GitHub Pages deployment locally before pushing

**Features:**
- Copies both Scoverage and JaCoCo reports
- Includes JaCoCo aggregate report
- Creates landing page with links to all reports
- Provides instructions for local viewing and GitHub Pages push

---

## 📊 What Will Be Deployed

### Coverage Reports Structure

```
gh-pages/
├── index.html                          # Landing page
├── jacoco-aggregate/                   # ⭐ NEW: Aggregate JaCoCo report
│   └── index.html
├── clickhouse-core/
│   └── build/reports/
│       ├── scoverageTest/              # Scoverage report
│       └── jacoco/test/html/           # ⭐ NEW: JaCoCo report
├── clickhouse-core-it/
│   └── build/reports/
│       ├── scoverageTest/
│       └── jacoco/test/html/           # ⭐ NEW: JaCoCo report
├── spark-3.5/clickhouse-spark/
│   └── build/reports/
│       ├── scoverageTest/
│       └── jacoco/test/html/           # ⭐ NEW: JaCoCo report
└── spark-3.5/clickhouse-spark-it/
    └── build/reports/
        ├── scoverageTest/
        └── jacoco/test/html/           # ⭐ NEW: JaCoCo report
```

---

## 🚀 How to Deploy Locally

### Step 1: Generate Coverage Reports

```bash
# Run tests with both Scoverage and JaCoCo
./gradlew clean test reportTestScoverage jacocoTestReport jacocoAggregateReport \
  -Dspark_binary_version=3.5 \
  -Dscala_binary_version=2.12 \
  --no-daemon
```

### Step 2: Deploy to Local Directory

```bash
# Run the deployment script
./deploy-coverage-local.sh
```

This will create `gh-pages-local/` directory with all reports.

### Step 3: View Locally

```bash
# Start local web server
cd gh-pages-local
python3 -m http.server 8000

# Open in browser
open http://localhost:8000
```

### Step 4: Push to GitHub Pages

```bash
# Switch to gh-pages branch
git checkout gh-pages

# Copy local deployment
cp -r gh-pages-local/* .

# Commit and push
git add .
git commit -m "Update coverage reports with JaCoCo"
git push origin gh-pages

# Switch back to your branch
git checkout main  # or your feature branch
```

---

## 🌐 GitHub Pages URLs

Once deployed, reports will be available at:

### Landing Page
```
https://shimonste.github.io/spark-clickhouse-connector/
```

### JaCoCo Aggregate Report (NEW!)
```
https://shimonste.github.io/spark-clickhouse-connector/jacoco-aggregate/index.html
```

### Individual Module Reports

**clickhouse-core:**
- Scoverage: `https://shimonste.github.io/spark-clickhouse-connector/clickhouse-core/build/reports/scoverageTest/index.html`
- JaCoCo: `https://shimonste.github.io/spark-clickhouse-connector/clickhouse-core/build/reports/jacoco/test/html/index.html`

**spark-3.5/clickhouse-spark:**
- Scoverage: `https://shimonste.github.io/spark-clickhouse-connector/spark-3.5/clickhouse-spark/build/reports/scoverageTest/index.html`
- JaCoCo: `https://shimonste.github.io/spark-clickhouse-connector/spark-3.5/clickhouse-spark/build/reports/jacoco/test/html/index.html`

---

## 🔄 Automatic Deployment (CI/CD)

### When It Runs

The GitHub Actions workflow automatically deploys to GitHub Pages when:
- ✅ Push to `main` branch
- ✅ All tests pass
- ✅ Coverage reports are generated

### What It Does

1. Runs tests for all Spark/Scala/Java combinations
2. Generates Scoverage reports
3. Generates JaCoCo reports (including aggregate)
4. Uploads reports as artifacts
5. Organizes reports for GitHub Pages
6. Deploys to `gh-pages` branch

### Workflow File

`.github/workflows/build-and-test.yml`

Key sections:
- **Lines 43-47:** Test execution with both coverage tools
- **Lines 49-56:** Upload coverage artifacts
- **Lines 115-149:** Organize reports for GitHub Pages
- **Lines 151-220:** Create landing page
- **Lines 222-227:** Deploy to GitHub Pages

---

## 📈 Benefits of JaCoCo on GitHub Pages

### 1. **Cross-Module Coverage**
- JaCoCo aggregate report shows coverage across all modules
- Tracks execution from `-it` modules into main modules
- More accurate than Scoverage for multi-module projects

### 2. **Better Visualization**
- Color-coded source code (green/yellow/red)
- Branch coverage diamonds
- Interactive HTML reports

### 3. **Comparison with Scoverage**
- Both reports available side-by-side
- Can compare Scala-specific (Scoverage) vs runtime (JaCoCo) coverage
- Helps identify coverage gaps

### 4. **Historical Tracking**
- Reports updated on every push to main
- Can track coverage trends over time
- Easy to share with team members

---

## 🎯 Key Features of Landing Page

### Visual Organization
- ✅ Aggregate report prominently displayed at top
- ✅ Module cards with both Scoverage and JaCoCo links
- ✅ Clear visual distinction between report types
- ✅ Last updated timestamp
- ✅ Responsive grid layout

### Report Types Legend
- 📊 **Scoverage:** Scala-specific, compile-time instrumentation
- 📈 **JaCoCo:** Java/Scala, runtime instrumentation, better for multi-module

---

## 🛠️ Troubleshooting

### Reports Not Showing Up

**Problem:** Some reports missing after deployment

**Solution:**
```bash
# Verify reports were generated
ls -la build/reports/jacoco/aggregate/html/
ls -la spark-3.5/clickhouse-spark/build/reports/jacoco/test/html/

# If missing, regenerate:
./gradlew clean test jacocoTestReport jacocoAggregateReport \
  -Dspark_binary_version=3.5 \
  -Dscala_binary_version=2.12
```

### 404 Errors on GitHub Pages

**Problem:** Links return 404

**Solution:**
1. Check that `gh-pages` branch exists
2. Verify GitHub Pages is enabled in repository settings
3. Ensure files were pushed to `gh-pages` branch
4. Wait a few minutes for GitHub Pages to update

### Local Server Not Working

**Problem:** `python3 -m http.server` fails

**Solution:**
```bash
# Try different port
python3 -m http.server 8080

# Or use PHP
php -S localhost:8000

# Or use Node.js
npx http-server -p 8000
```

---

## 📝 Next Steps

### 1. Test Local Deployment
```bash
./deploy-coverage-local.sh
cd gh-pages-local && python3 -m http.server 8000
open http://localhost:8000
```

### 2. Push to GitHub Pages
```bash
git checkout gh-pages
cp -r gh-pages-local/* .
git add .
git commit -m "Add JaCoCo coverage reports"
git push origin gh-pages
```

### 3. Verify on GitHub Pages
Visit: `https://shimonste.github.io/spark-clickhouse-connector/`

### 4. Update CI/CD
The workflow is already updated, so next push to `main` will automatically deploy both Scoverage and JaCoCo reports.

---

## 🎉 Summary

**What's New:**
- ✅ JaCoCo reports deployed alongside Scoverage
- ✅ Aggregate JaCoCo report for all modules
- ✅ Updated landing page with both report types
- ✅ Local deployment script for testing
- ✅ Automatic deployment on push to main

**Coverage Reports Available:**
- 📊 Scoverage (Scala-specific)
- 📈 JaCoCo (Runtime, multi-module)
- 🎯 JaCoCo Aggregate (All modules combined)

**Access:**
- 🌐 GitHub Pages: `https://shimonste.github.io/spark-clickhouse-connector/`
- 💻 Local: `http://localhost:8000` (after running deployment script)
