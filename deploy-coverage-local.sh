#!/bin/bash
# Local script to deploy JaCoCo and Scoverage reports to GitHub Pages
# This simulates what the GitHub Actions workflow does

set -e

echo "🚀 Deploying Coverage Reports to GitHub Pages (Local)"
echo "======================================================"

# Configuration
SPARK_VERSION="3.5"
SCALA_VERSION="2.12"
GH_PAGES_DIR="gh-pages-local"

# Clean and create gh-pages directory
echo "📁 Creating local gh-pages directory..."
rm -rf "$GH_PAGES_DIR"
mkdir -p "$GH_PAGES_DIR"

# Function to copy reports
copy_reports() {
    local module=$1
    local report_type=$2
    local source_path=$3
    local target_path="$GH_PAGES_DIR/$module/build/reports/$report_type"
    
    if [ -d "$source_path" ]; then
        echo "  ✅ Copying $module $report_type reports..."
        mkdir -p "$target_path"
        cp -r "$source_path"/* "$target_path/"
    else
        echo "  ⚠️  $module $report_type reports not found at $source_path"
    fi
}

# Copy Scoverage reports
echo ""
echo "📊 Copying Scoverage Reports..."
copy_reports "clickhouse-core" "scoverageTest" "clickhouse-core/build/reports/scoverageTest"
copy_reports "clickhouse-core-it" "scoverageTest" "clickhouse-core-it/build/reports/scoverageTest"
copy_reports "spark-$SPARK_VERSION/clickhouse-spark" "scoverageTest" "spark-$SPARK_VERSION/clickhouse-spark/build/reports/scoverageTest"
copy_reports "spark-$SPARK_VERSION/clickhouse-spark-it" "scoverageTest" "spark-$SPARK_VERSION/clickhouse-spark-it/build/reports/scoverageTest"

# Copy JaCoCo reports
echo ""
echo "📈 Copying JaCoCo Reports..."
copy_reports "clickhouse-core" "jacoco/test/html" "clickhouse-core/build/reports/jacoco/test/html"
copy_reports "clickhouse-core-it" "jacoco/test/html" "clickhouse-core-it/build/reports/jacoco/test/html"
copy_reports "spark-$SPARK_VERSION/clickhouse-spark" "jacoco/test/html" "spark-$SPARK_VERSION/clickhouse-spark/build/reports/jacoco/test/html"
copy_reports "spark-$SPARK_VERSION/clickhouse-spark-it" "jacoco/test/html" "spark-$SPARK_VERSION/clickhouse-spark-it/build/reports/jacoco/test/html"

# Copy JaCoCo aggregate report
echo ""
echo "📊 Copying JaCoCo Aggregate Report..."
if [ -d "build/reports/jacoco/aggregate/html" ]; then
    echo "  ✅ Copying aggregate JaCoCo report..."
    mkdir -p "$GH_PAGES_DIR/jacoco-aggregate"
    cp -r build/reports/jacoco/aggregate/html/* "$GH_PAGES_DIR/jacoco-aggregate/"
else
    echo "  ⚠️  Aggregate JaCoCo report not found. Run: ./gradlew jacocoAggregateReport"
fi

# Create landing page
echo ""
echo "🏠 Creating landing page..."
cat > "$GH_PAGES_DIR/index.html" << 'HTMLEOF'
<!DOCTYPE html>
<html>
<head>
  <title>Test Coverage Reports - Spark ClickHouse Connector</title>
  <style>
    body { font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Arial, sans-serif; max-width: 1200px; margin: 40px auto; padding: 0 20px; background: #f5f5f5; }
    h1 { color: #333; border-bottom: 3px solid #0366d6; padding-bottom: 15px; }
    h2 { color: #0366d6; margin-top: 40px; border-bottom: 1px solid #e1e4e8; padding-bottom: 10px; }
    .info { background: #fff3cd; border: 1px solid #ffc107; border-radius: 6px; padding: 20px; margin: 20px 0; }
    .aggregate { background: #d1ecf1; border: 1px solid #0c5460; border-radius: 6px; padding: 20px; margin: 20px 0; }
    .aggregate h3 { margin-top: 0; color: #0c5460; }
    .aggregate a { color: #0c5460; font-weight: bold; font-size: 18px; text-decoration: none; }
    .aggregate a:hover { text-decoration: underline; }
    .module-grid { display: grid; grid-template-columns: repeat(auto-fill, minmax(320px, 1fr)); gap: 20px; margin: 20px 0; }
    .module-card { border: 1px solid #e1e4e8; border-radius: 8px; padding: 20px; background: white; box-shadow: 0 1px 3px rgba(0,0,0,0.1); }
    .module-card h3 { margin-top: 0; color: #0366d6; font-size: 18px; }
    .module-card a { color: #0366d6; text-decoration: none; display: block; margin: 10px 0; padding: 8px 12px; background: #f6f8fa; border-radius: 4px; transition: background 0.2s; }
    .module-card a:hover { background: #e1e4e8; text-decoration: none; }
    .legend { background: white; border: 1px solid #e1e4e8; border-radius: 6px; padding: 15px; margin: 20px 0; }
    .legend h3 { margin-top: 0; font-size: 16px; }
    .legend p { margin: 5px 0; font-size: 14px; }
  </style>
</head>
<body>
  <h1>📊 Test Coverage Reports</h1>
  
  <div class="info">
    <strong>Last Updated:</strong> TIMESTAMP_PLACEHOLDER<br>
    <strong>Spark Version:</strong> 3.5 | <strong>Scala Version:</strong> 2.12
  </div>
  
  <div class="aggregate">
    <h3>🎯 JaCoCo Aggregate Report (All Modules Combined)</h3>
    <a href="jacoco-aggregate/index.html">📈 View JaCoCo Aggregate Coverage Report →</a>
    <p style="margin-top: 10px; color: #666; font-size: 14px;">
      This report combines coverage from all modules and shows cross-module coverage tracking.
      Recommended for overall project coverage analysis.
    </p>
  </div>
  
  <div class="legend">
    <h3>📖 Report Types</h3>
    <p><strong>📊 Scoverage:</strong> Scala-specific coverage tool (compile-time instrumentation)</p>
    <p><strong>📈 JaCoCo:</strong> Java/Scala coverage tool (runtime instrumentation, better for multi-module projects)</p>
  </div>
  
  <h2>Core Modules</h2>
  <div class="module-grid">
    <div class="module-card">
      <h3>clickhouse-core</h3>
      <a href="clickhouse-core/build/reports/scoverageTest/index.html">📊 Scoverage Report</a>
      <a href="clickhouse-core/build/reports/jacoco/test/html/index.html">📈 JaCoCo Report</a>
    </div>
    <div class="module-card">
      <h3>clickhouse-core-it</h3>
      <a href="clickhouse-core-it/build/reports/scoverageTest/index.html">📊 Scoverage Report</a>
      <a href="clickhouse-core-it/build/reports/jacoco/test/html/index.html">📈 JaCoCo Report</a>
    </div>
  </div>
  
  <h2>Spark 3.5 Modules</h2>
  <div class="module-grid">
    <div class="module-card">
      <h3>clickhouse-spark</h3>
      <a href="spark-3.5/clickhouse-spark/build/reports/scoverageTest/index.html">📊 Scoverage Report</a>
      <a href="spark-3.5/clickhouse-spark/build/reports/jacoco/test/html/index.html">📈 JaCoCo Report</a>
    </div>
    <div class="module-card">
      <h3>clickhouse-spark-it</h3>
      <a href="spark-3.5/clickhouse-spark-it/build/reports/scoverageTest/index.html">📊 Scoverage Report</a>
      <a href="spark-3.5/clickhouse-spark-it/build/reports/jacoco/test/html/index.html">📈 JaCoCo Report</a>
    </div>
  </div>
  
  <p style="color: #586069; font-size: 14px; margin-top: 40px; text-align: center;">
    Reports generated locally for testing.<br>
    View the <a href="https://github.com/ShimonSte/spark-clickhouse-connector">source repository</a>.
  </p>
</body>
</html>
HTMLEOF

# Update timestamp
TIMESTAMP=$(date -u '+%Y-%m-%d %H:%M:%S UTC')
sed -i.bak "s/TIMESTAMP_PLACEHOLDER/$TIMESTAMP/" "$GH_PAGES_DIR/index.html"
rm "$GH_PAGES_DIR/index.html.bak" 2>/dev/null || true

echo ""
echo "✅ Coverage reports deployed to: $GH_PAGES_DIR/"
echo ""
echo "🌐 To view locally, run:"
echo "   cd $GH_PAGES_DIR && python3 -m http.server 8000"
echo "   Then open: http://localhost:8000"
echo ""
echo "📤 To push to GitHub Pages:"
echo "   git checkout gh-pages"
echo "   cp -r $GH_PAGES_DIR/* ."
echo "   git add ."
echo "   git commit -m 'Update coverage reports'"
echo "   git push origin gh-pages"
echo ""
