#!/usr/bin/env node

import { readFileSync, existsSync } from 'fs';
import { request } from 'https';
import { execSync } from 'child_process';

/**
 * Calculates coverage percentage
 */
const calculateCoverage = (rate) => {
  const percentage = parseFloat(rate) * 100;
  return `${percentage.toFixed(2)}%`;
};

/**
 * Parses scoverage XML report using regex (no dependencies)
 */
function parseScoverageXml(xmlPath) {
  if (!existsSync(xmlPath)) {
    throw new Error(`File not found: ${xmlPath}`);
  }

  const xmlContent = readFileSync(xmlPath, 'utf-8');
  
  // Extract coverage attributes from the root <coverage> tag
  const coverageMatch = xmlContent.match(/<coverage[^>]*>/);
  if (!coverageMatch) {
    throw new Error('Invalid scoverage XML format');
  }
  
  const coverageTag = coverageMatch[0];
  
  // Extract attributes using regex
  const extractAttr = (name) => {
    const match = coverageTag.match(new RegExp(`${name}="([^"]*)"`, 'i'));
    return match ? match[1] : '0';
  };
  
  return {
    statementRate: extractAttr('statement-rate'),
    branchRate: extractAttr('branch-rate'),
    statementsCovered: parseInt(extractAttr('statements-covered')),
    statementsValid: parseInt(extractAttr('statements-valid')),
    branchesCovered: parseInt(extractAttr('branches-covered')),
    branchesValid: parseInt(extractAttr('branches-valid'))
  };
}

/**
 * Generates markdown table
 */
function generateMarkdownTable(data, headers) {
  if (!data || data.length === 0) return '';

  const headerRow = Object.values(headers);
  const columns = Object.keys(headers);
  
  const separator = headerRow.map(() => '---');
  const rows = data.map(item => 
    columns.map(field => item[field] || '')
  );
  
  return [
    `| ${headerRow.join(' | ')} |`,
    `| ${separator.join(' | ')} |`,
    ...rows.map(row => `| ${row.join(' | ')} |`)
  ].join('\n');
}

/**
 * Generates coverage report from scoverage XML
 */
function generateCoverageReport(xmlPath, moduleName) {
  const coverage = parseScoverageXml(xmlPath);
  
  const summary = [{
    module: moduleName,
    'statement coverage': calculateCoverage(coverage.statementRate),
    'branch coverage': calculateCoverage(coverage.branchRate),
    'statements': `${coverage.statementsCovered}/${coverage.statementsValid}`,
    'branches': `${coverage.branchesCovered}/${coverage.branchesValid}`
  }];

  let markdown = `### ${moduleName}\n\n`;
  markdown += generateMarkdownTable(summary, {
    'module': 'Module',
    'statement coverage': 'Statement Coverage',
    'branch coverage': 'Branch Coverage',
    'statements': 'Statements',
    'branches': 'Branches'
  });
  
  return markdown;
}

/**
 * Posts or updates a comment on a GitHub PR
 */
async function postOrUpdateComment(token, owner, repo, prNumber, comment, commentId) {
  const data = JSON.stringify({ body: comment });

  const options = {
    hostname: 'api.github.com',
    path: commentId 
      ? `/repos/${owner}/${repo}/issues/comments/${commentId}`
      : `/repos/${owner}/${repo}/issues/${prNumber}/comments`,
    method: commentId ? 'PATCH' : 'POST',
    headers: {
      'Authorization': `token ${token}`,
      'User-Agent': 'Node.js',
      'Content-Type': 'application/json',
      'Content-Length': data.length
    }
  };

  return new Promise((resolve, reject) => {
    const req = request(options, (res) => {
      let response = '';
      
      res.on('data', (chunk) => {
        response += chunk;
      });

      res.on('end', () => {
        if (res.statusCode >= 200 && res.statusCode < 300) {
          resolve(JSON.parse(response || '{}'));
        } else {
          reject(new Error(`GitHub API error: ${res.statusCode} - ${response}`));
        }
      });
    });

    req.on('error', reject);
    req.write(data);
    req.end();
  });
}

/**
 * Finds existing comment on PR
 */
async function findExistingComment(token, owner, repo, prNumber, commentMarker) {
  const options = {
    hostname: 'api.github.com',
    path: `/repos/${owner}/${repo}/issues/${prNumber}/comments`,
    method: 'GET',
    headers: {
      'Authorization': `token ${token}`,
      'User-Agent': 'Node.js',
      'Content-Type': 'application/json'
    }
  };

  return new Promise((resolve, reject) => {
    const req = request(options, (res) => {
      let response = '';
      
      res.on('data', (chunk) => {
        response += chunk;
      });

      res.on('end', () => {
        if (res.statusCode >= 200 && res.statusCode < 300) {
          const comments = JSON.parse(response || '[]');
          const existingComment = comments.find(comment => 
            comment.body.includes(commentMarker)
          );
          resolve(existingComment || null);
        } else {
          reject(new Error(`GitHub API error: ${res.statusCode} - ${response}`));
        }
      });
    });

    req.on('error', reject);
    req.end();
  });
}

// Main execution
async function main() {
  const args = process.argv.slice(2);
  
  if (args.length < 1) {
    console.log('Usage: node scoverage-report-generator.mjs --pr <pr-number> [--repo owner/repo]');
    console.log('');
    console.log('Expects scoverage XML files at:');
    console.log('  - clickhouse-core/build/reports/scoverageTest/scoverage.xml');
    console.log('  - spark-*/clickhouse-spark/build/reports/scoverageTest/scoverage.xml');
    process.exit(1);
  }

  // Parse arguments
  let prNumber = null;
  let repo = null;
  let i = 0;

  while (i < args.length) {
    const arg = args[i];
    if (arg === '--pr' && i + 1 < args.length) {
      prNumber = parseInt(args[++i], 10);
    } else if (arg === '--repo' && i + 1 < args.length) {
      repo = args[++i];
    }
    i++;
  }

  if (!prNumber) {
    console.error('Error: --pr argument is required');
    process.exit(1);
  }

  const githubToken = process.env.GITHUB_TOKEN;
  if (!githubToken) {
    console.error('Error: GITHUB_TOKEN environment variable is required');
    process.exit(1);
  }

  // Get repository info if not provided
  if (!repo) {
    try {
      const remoteUrl = execSync('git config --get remote.origin.url')
        .toString()
        .trim()
        .replace(/^git@github.com:/, 'https://github.com/')
        .replace(/\.git$/, '');
      
      const url = new URL(remoteUrl);
      repo = url.pathname.substring(1);
    } catch (error) {
      console.error('Error getting repository info:', error.message);
      process.exit(1);
    }
  }

  const [owner, repository] = repo.split('/');

  // Generate coverage reports for all modules
  const modules = [
    { name: 'clickhouse-core', path: 'clickhouse-core/build/reports/scoverageTest/scoverage.xml' },
    { name: 'clickhouse-core-it', path: 'clickhouse-core-it/build/reports/scoverageTest/scoverage.xml' },
    { name: 'spark-3.3/clickhouse-spark', path: 'spark-3.3/clickhouse-spark/build/reports/scoverageTest/scoverage.xml' },
    { name: 'spark-3.4/clickhouse-spark', path: 'spark-3.4/clickhouse-spark/build/reports/scoverageTest/scoverage.xml' },
    { name: 'spark-3.5/clickhouse-spark', path: 'spark-3.5/clickhouse-spark/build/reports/scoverageTest/scoverage.xml' },
  ];

  let reportContent = '';
  let foundAny = false;

  for (const module of modules) {
    if (existsSync(module.path)) {
      try {
        const moduleReport = generateCoverageReport(module.path, module.name);
        reportContent += moduleReport + '\n\n';
        foundAny = true;
      } catch (error) {
        console.error(`Error processing ${module.name}:`, error.message);
      }
    }
  }

  if (!foundAny) {
    console.error('No coverage reports found');
    process.exit(1);
  }

  // Post to PR
  try {
    const commentMarker = '<!-- scoverage-coverage-report -->';
    const comment = `${commentMarker}\n# 📊 Test Coverage Report\n\n${reportContent}\n---\n*Coverage reports generated by scoverage*`;
    
    const existingComment = await findExistingComment(
      githubToken,
      owner,
      repository,
      prNumber,
      commentMarker
    );
    
    await postOrUpdateComment(
      githubToken,
      owner,
      repository,
      prNumber,
      comment,
      existingComment?.id
    );
    
    console.log(`✅ Coverage report ${existingComment ? 'updated' : 'posted'} to PR #${prNumber}`);
  } catch (error) {
    console.error('Error posting to GitHub:', error.message);
    process.exit(1);
  }
}

main().catch(error => {
  console.error('Fatal error:', error);
  process.exit(1);
});
