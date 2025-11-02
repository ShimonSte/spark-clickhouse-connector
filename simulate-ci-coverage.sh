#!/bin/bash
set -e

echo "🚀 Simulating CI Coverage Report Generation"
echo "==========================================="
echo ""

# Configuration - you can change these
SPARK_VERSION="3.5"
SCALA_VERSION="2.12"
JAVA_VERSION=$(java -version 2>&1 | head -1 | cut -d'"' -f2 | cut -d'.' -f1)

echo "📋 Configuration:"
echo "  - Java: $JAVA_VERSION"
echo "  - Spark: $SPARK_VERSION"
echo "  - Scala: $SCALA_VERSION"
echo ""

# Step 1: Run tests with coverage
echo "🧪 Step 1: Running tests with coverage..."
./gradlew clean test reportTestScoverage \
  -Dspark_binary_version=$SPARK_VERSION \
  -Dscala_binary_version=$SCALA_VERSION \
  --no-daemon

echo ""
echo "✅ Tests completed!"
echo ""

# Step 2: Create GitHub Pages structure
echo "🌐 Step 2: Creating GitHub Pages structure..."

rm -rf gh-pages
mkdir -p gh-pages

# Copy HTML reports to gh-pages
echo "  Copying coverage reports..."
[ -d clickhouse-core/build/reports/scoverageTest ] && \
  mkdir -p gh-pages/clickhouse-core/build/reports/scoverageTest && \
  cp -r clickhouse-core/build/reports/scoverageTest/* gh-pages/clickhouse-core/build/reports/scoverageTest/

[ -d clickhouse-core-it/build/reports/scoverageTest ] && \
  mkdir -p gh-pages/clickhouse-core-it/build/reports/scoverageTest && \
  cp -r clickhouse-core-it/build/reports/scoverageTest/* gh-pages/clickhouse-core-it/build/reports/scoverageTest/

for spark_ver in 3.3 3.4 3.5; do
  if [ -d "spark-${spark_ver}/clickhouse-spark/build/reports/scoverageTest" ]; then
    mkdir -p "gh-pages/spark-${spark_ver}/clickhouse-spark/build/reports/scoverageTest"
    cp -r "spark-${spark_ver}/clickhouse-spark/build/reports/scoverageTest/"* \
      "gh-pages/spark-${spark_ver}/clickhouse-spark/build/reports/scoverageTest/"
  fi
  
  if [ -d "spark-${spark_ver}/clickhouse-spark-it/build/reports/scoverageTest" ]; then
    mkdir -p "gh-pages/spark-${spark_ver}/clickhouse-spark-it/build/reports/scoverageTest"
    cp -r "spark-${spark_ver}/clickhouse-spark-it/build/reports/scoverageTest/"* \
      "gh-pages/spark-${spark_ver}/clickhouse-spark-it/build/reports/scoverageTest/"
  fi
done

# Check which reports actually exist
CORE_EXISTS=""
CORE_IT_EXISTS=""
SPARK_33_EXISTS=""
SPARK_34_EXISTS=""
SPARK_35_EXISTS=""

[ -f "gh-pages/clickhouse-core/build/reports/scoverageTest/index.html" ] && CORE_EXISTS="true"
[ -f "gh-pages/clickhouse-core-it/build/reports/scoverageTest/index.html" ] && CORE_IT_EXISTS="true"
[ -f "gh-pages/spark-3.3/clickhouse-spark/build/reports/scoverageTest/index.html" ] && SPARK_33_EXISTS="true"
[ -f "gh-pages/spark-3.4/clickhouse-spark/build/reports/scoverageTest/index.html" ] && SPARK_34_EXISTS="true"
[ -f "gh-pages/spark-3.5/clickhouse-spark/build/reports/scoverageTest/index.html" ] && SPARK_35_EXISTS="true"

# Create HTML index - start
cat > gh-pages/index.html << 'EOF'
<!DOCTYPE html>
<html>
<head>
  <title>Test Coverage Reports - Spark ClickHouse Connector</title>
  <style>
    body { font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Arial, sans-serif; max-width: 1200px; margin: 40px auto; padding: 0 20px; }
    h1 { color: #333; border-bottom: 2px solid #e1e4e8; padding-bottom: 10px; }
    h2 { color: #0366d6; margin-top: 30px; }
    .module-grid { display: grid; grid-template-columns: repeat(auto-fill, minmax(300px, 1fr)); gap: 20px; margin: 20px 0; }
    .module-card { border: 1px solid #e1e4e8; border-radius: 6px; padding: 20px; background: #f6f8fa; }
    .module-card h3 { margin-top: 0; color: #0366d6; }
    .module-card a { color: #0366d6; text-decoration: none; display: block; margin: 8px 0; }
    .module-card a:hover { text-decoration: underline; }
    .info { background: #fff3cd; border: 1px solid #ffc107; border-radius: 4px; padding: 15px; margin: 20px 0; }
  </style>
</head>
<body>
  <h1>📊 Test Coverage Reports</h1>
  <div class="info">
    <strong>Last Updated:</strong> $(date -u '+%Y-%m-%d %H:%M:%S UTC')<br>
    <strong>Configuration:</strong> Java $JAVA_VERSION, Spark $SPARK_VERSION, Scala $SCALA_VERSION
  </div>
  
  <h2>Core Modules</h2>
  <div class="module-grid">
EOF

# Add core modules if they exist
[ -n "$CORE_EXISTS" ] && cat >> gh-pages/index.html << 'EOF'
    <div class="module-card">
      <h3>clickhouse-core</h3>
      <a href="clickhouse-core/build/reports/scoverageTest/index.html">📈 View Coverage Report</a>
    </div>
EOF

[ -n "$CORE_IT_EXISTS" ] && cat >> gh-pages/index.html << 'EOF'
    <div class="module-card">
      <h3>clickhouse-core-it</h3>
      <a href="clickhouse-core-it/build/reports/scoverageTest/index.html">📈 View Coverage Report</a>
    </div>
EOF

cat >> gh-pages/index.html << 'EOF'
  </div>
  
  <h2>Spark Modules</h2>
  <div class="module-grid">
EOF

# Add Spark 3.3 if it exists
[ -n "$SPARK_33_EXISTS" ] && cat >> gh-pages/index.html << 'EOF'
    <div class="module-card">
      <h3>Spark 3.3</h3>
      <a href="spark-3.3/clickhouse-spark/build/reports/scoverageTest/index.html">📈 clickhouse-spark Coverage</a>
      <a href="spark-3.3/clickhouse-spark-it/build/reports/scoverageTest/index.html">📈 clickhouse-spark-it Coverage</a>
    </div>
EOF

# Add Spark 3.4 if it exists
[ -n "$SPARK_34_EXISTS" ] && cat >> gh-pages/index.html << 'EOF'
    <div class="module-card">
      <h3>Spark 3.4</h3>
      <a href="spark-3.4/clickhouse-spark/build/reports/scoverageTest/index.html">📈 clickhouse-spark Coverage</a>
      <a href="spark-3.4/clickhouse-spark-it/build/reports/scoverageTest/index.html">📈 clickhouse-spark-it Coverage</a>
    </div>
EOF

# Add Spark 3.5 if it exists
[ -n "$SPARK_35_EXISTS" ] && cat >> gh-pages/index.html << 'EOF'
    <div class="module-card">
      <h3>Spark 3.5</h3>
      <a href="spark-3.5/clickhouse-spark/build/reports/scoverageTest/index.html">📈 clickhouse-spark Coverage</a>
      <a href="spark-3.5/clickhouse-spark-it/build/reports/scoverageTest/index.html">📈 clickhouse-spark-it Coverage</a>
    </div>
EOF

cat >> gh-pages/index.html << 'EOF'
  </div>
  
  <p style="color: #586069; font-size: 14px; margin-top: 30px;">
    Reports generated locally for testing.<br>
    View the <a href="https://github.com/ClickHouse/spark-clickhouse-connector">source repository</a>.
  </p>
</body>
</html>
EOF

echo "✅ GitHub Pages structure created in gh-pages/"
echo ""

# Step 3: Summary
echo "🎉 Done! Here's what was created:"
echo ""
echo "📁 Coverage Reports:"
[ -n "$CORE_EXISTS" ] && echo "  ✅ clickhouse-core/build/reports/scoverageTest/index.html"
[ -n "$CORE_IT_EXISTS" ] && echo "  ✅ clickhouse-core-it/build/reports/scoverageTest/index.html"
[ -n "$SPARK_33_EXISTS" ] && echo "  ✅ spark-3.3/clickhouse-spark/build/reports/scoverageTest/index.html"
[ -n "$SPARK_34_EXISTS" ] && echo "  ✅ spark-3.4/clickhouse-spark/build/reports/scoverageTest/index.html"
[ -n "$SPARK_35_EXISTS" ] && echo "  ✅ spark-3.5/clickhouse-spark/build/reports/scoverageTest/index.html"
echo ""
echo "📁 GitHub Pages Preview:"
echo "  - gh-pages/index.html (landing page)"
echo ""
echo "🌐 To preview locally:"
echo "  cd gh-pages && python3 -m http.server 8000"
echo "  Then open: http://localhost:8000"
echo ""
echo "📤 To deploy to GitHub Pages:"
echo "  ./deploy-gh-pages.sh"
echo ""
