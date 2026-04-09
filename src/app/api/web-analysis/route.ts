import { NextRequest, NextResponse } from 'next/server'

export const dynamic = 'force-dynamic'

export async function POST(request: NextRequest) {
  try {
    const { url, tool } = await request.json()
    
    if (!url || !tool) {
      return NextResponse.json(
        { success: false, error: 'Please provide a valid URL to analyze' },
        { status: 400 }
      )
    }

    let result: any = {}

    try {
      switch (tool) {
        case 'seo-browser':
          result = await analyzeSEO(url)
          break
        case 'wp-security':
          result = await scanWPSecurity(url)
          break
        case 'https-checker':
          result = await checkHTTPS(url)
          break
        case 'hyperlink-analyzer':
          result = await analyzeHyperlinks(url)
          break
        case 'robots-checker':
          result = await checkRobots(url)
          break
        case 'extract-links':
          result = await extractLinks(url)
          break
        case 'ga-gtm-checker':
          result = await checkGAGTM(url)
          break
        case 'meta-tags':
          result = await analyzeMetaTags(url)
          break
        case 'moz-authority':
          result = await checkMozAuthority(url)
          break
        case 'ssl-lookup':
          result = await checkSSL(url)
          break
        case 'is-it-down':
          result = await checkUptime(url)
          break
        case 'url-redirect':
          result = await trackRedirects(url)
          break
        case 'html-viewer':
          result = await viewHTML(url)
          break
        case 'is-wordpress':
          result = await checkWordPress(url)
          break
        case 'wp-theme-detector':
          result = await detectWPTheme(url)
          break
        case 'shopify-detector':
          result = await detectShopify(url)
          break
        case 'domain-checker':
          result = await checkDomain(url)
          break
        case 'server-os':
          result = await detectServerOS(url)
          break
        case 'hsts-test':
          result = await testHSTS(url)
          break
        case 'lynx-viewer':
          result = await viewLynx(url)
          break
        case 'http2-test':
          result = await testHTTP2(url)
          break
        default:
          return NextResponse.json(
            { success: false, error: 'This tool is not available. Please try another tool.' },
            { status: 400 }
          )
      }

      return NextResponse.json({ success: true, data: result })
      
    } catch (toolError: any) {
      // Tool-specific user-friendly error messages
      const userFriendlyErrors: Record<string, string> = {
        'seo-browser': 'Unable to analyze SEO for this website. Please check if the URL is correct and accessible.',
        'wp-security': 'Unable to scan WordPress security. The website may not be accessible or may not be a WordPress site.',
        'https-checker': 'Unable to check HTTPS configuration. Please verify the URL is correct.',
        'hyperlink-analyzer': 'Unable to analyze links on this page. The website may be blocking our request.',
        'robots-checker': 'Unable to check robots.txt file. The website may not have one or is not accessible.',
        'extract-links': 'Unable to extract links from this website. Please check if the URL is accessible.',
        'ga-gtm-checker': 'Unable to check tracking codes. The website may not be accessible.',
        'meta-tags': 'Unable to analyze meta tags. Please verify the URL is correct and accessible.',
        'moz-authority': 'Unable to analyze domain authority. The website may not be accessible.',
        'ssl-lookup': 'Unable to verify SSL certificate. The website may not have HTTPS enabled or is not accessible.',
        'is-it-down': 'Unable to check website status. The website may be down or the URL is incorrect.',
        'url-redirect': 'Unable to track redirects. Please check if the URL is correct.',
        'html-viewer': 'Unable to view HTML source. The website may be blocking our request.',
        'is-wordpress': 'Unable to detect WordPress. The website may not be accessible.',
        'wp-theme-detector': 'Unable to detect WordPress theme. The website may not be WordPress or is not accessible.',
        'shopify-detector': 'Unable to detect Shopify. The website may not be accessible.',
        'domain-checker': 'Unable to check domain availability. Please verify the domain name is valid.',
        'server-os': 'Unable to detect server information. The website may not be accessible or is blocking requests.',
        'hsts-test': 'Unable to test HSTS. The website may not be accessible or does not support HTTPS.',
        'lynx-viewer': 'Unable to generate text view. The website may not be accessible.',
        'http2-test': 'Unable to test HTTP/2 support. The website may not be accessible.'
      }

      const friendlyMessage = userFriendlyErrors[tool] || 'Unable to complete the analysis. Please check the URL and try again.'
      
      console.error(`Tool error (${tool}):`, toolError.message)
      
      return NextResponse.json(
        { success: false, error: friendlyMessage },
        { status: 200 } // Return 200 so frontend can display the message properly
      )
    }
    
  } catch (error: any) {
    console.error('Web analysis error:', error)
    return NextResponse.json(
      { success: false, error: 'Something went wrong. Please try again.' },
      { status: 200 }
    )
  }
}

// Helper function to fetch HTML - simplified and faster
async function fetchHTML(url: string): Promise<string> {
  const normalizedUrl = url.startsWith('http') ? url : `https://${url}`
  
  // Try direct fetch with proper headers (works for most sites from server-side)
  try {
    console.log('Fetching:', normalizedUrl)
    const response = await fetch(normalizedUrl, {
      headers: {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36',
        'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8',
        'Accept-Language': 'en-US,en;q=0.9',
        'Accept-Encoding': 'gzip, deflate, br',
        'Connection': 'keep-alive',
        'Upgrade-Insecure-Requests': '1',
      },
      redirect: 'follow',
      signal: AbortSignal.timeout(10000) // 10 second timeout
    })
    
    if (!response.ok) {
      if (response.status === 404) {
        throw new Error('Website not found. Please check the URL and try again.')
      } else if (response.status === 403) {
        throw new Error('Access denied. The website is blocking our request.')
      } else if (response.status === 500 || response.status === 502 || response.status === 503) {
        throw new Error('The website is currently unavailable. Please try again later.')
      } else {
        throw new Error('Unable to access the website. Please verify the URL is correct.')
      }
    }
    
    const text = await response.text()
    console.log('Successfully fetched, length:', text.length)
    return text
  } catch (error: any) {
    console.error('Fetch failed:', error.message)
    
    // User-friendly error messages
    if (error.name === 'AbortError' || error.message.includes('timeout')) {
      throw new Error('Request timeout. The website took too long to respond.')
    } else if (error.message.includes('ENOTFOUND') || error.message.includes('getaddrinfo')) {
      throw new Error('Website not found. Please check if the URL is correct.')
    } else if (error.message.includes('ECONNREFUSED')) {
      throw new Error('Connection refused. The website may be down.')
    } else if (error.message.includes('certificate') || error.message.includes('SSL')) {
      throw new Error('SSL certificate error. The website may have security issues.')
    } else if (error.message.startsWith('Website not found') || 
               error.message.startsWith('Access denied') || 
               error.message.startsWith('The website is') ||
               error.message.startsWith('Unable to access')) {
      // Already user-friendly, re-throw as is
      throw error
    } else {
      throw new Error('Unable to access the website. Please check the URL and try again.')
    }
  }
}

// Helper function for HEAD requests
async function fetchHead(url: string): Promise<Response> {
  const normalizedUrl = url.startsWith('http') ? url : `https://${url}`
  
  try {
    const response = await fetch(normalizedUrl, {
      method: 'HEAD',
      headers: {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36',
        'Accept': '*/*',
      },
      redirect: 'follow',
      signal: AbortSignal.timeout(8000) // 8 second timeout
    })
    return response
  } catch (error: any) {
    // If HEAD fails, try GET
    try {
      const response = await fetch(normalizedUrl, {
        method: 'GET',
        headers: {
          'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36',
          'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8',
        },
        redirect: 'follow',
        signal: AbortSignal.timeout(8000)
      })
      return response
    } catch (getError: any) {
      // User-friendly error messages
      if (getError.name === 'AbortError' || getError.message.includes('timeout')) {
        throw new Error('Request timeout. The website took too long to respond.')
      } else if (getError.message.includes('ENOTFOUND') || getError.message.includes('getaddrinfo')) {
        throw new Error('Website not found. Please check if the URL is correct.')
      } else if (getError.message.includes('ECONNREFUSED')) {
        throw new Error('Connection refused. The website may be down.')
      } else {
        throw new Error('Unable to connect to the website. Please verify the URL and try again.')
      }
    }
  }
}

// SEO Browser Analysis
async function analyzeSEO(url: string) {
  try {
    const html = await fetchHTML(url)
    
    const titleMatch = html.match(/<title[^>]*>([^<]+)<\/title>/i)
    const metaDescMatch = html.match(/<meta[^>]*name=["']description["'][^>]*content=["']([^"']+)["']/i) ||
                          html.match(/<meta[^>]*content=["']([^"']+)["'][^>]*name=["']description["']/i)
    const h1Matches = html.match(/<h1[^>]*>([^<]+)<\/h1>/gi)
    const canonicalMatch = html.match(/<link[^>]*rel=["']canonical["'][^>]*href=["']([^"']+)["']/i) ||
                           html.match(/<link[^>]*href=["']([^"']+)["'][^>]*rel=["']canonical["']/i)
    
    return {
      url,
      title: titleMatch ? titleMatch[1].trim() : 'Not found',
      titleLength: titleMatch ? titleMatch[1].trim().length : 0,
      metaDescription: metaDescMatch ? metaDescMatch[1].trim() : 'Not found',
      descriptionLength: metaDescMatch ? metaDescMatch[1].trim().length : 0,
      h1Count: h1Matches ? h1Matches.length : 0,
      h1Tags: h1Matches ? h1Matches.slice(0, 3).map(h => h.replace(/<[^>]+>/g, '').trim()) : [],
      canonical: canonicalMatch ? canonicalMatch[1] : 'Not found',
      contentLength: html.length,
      hasRobotsMeta: html.toLowerCase().includes('robots'),
      hasViewport: html.toLowerCase().includes('viewport'),
      hasOGTags: html.includes('og:'),
      hasTwitterCard: html.includes('twitter:card'),
      hasSchema: html.includes('schema.org'),
      status: '✓ SEO analysis complete'
    }
  } catch (error: any) {
    throw new Error(`SEO analysis failed: ${error.message}`)
  }
}

// WordPress Security Scanner - ENHANCED WITH COMPREHENSIVE ANALYSIS
async function scanWPSecurity(url: string) {
  try {
    const html = await fetchHTML(url)
    const domain = url.replace(/^https?:\/\//, '').split('/')[0]
    
    const vulnerabilities: string[] = []
    const warnings: string[] = []
    const securityHeaders: any = {}
    const exposedFiles: string[] = []
    const pluginsWithVersions: any[] = []
    const themesWithVersions: any[] = []
    
    // Fetch headers for comprehensive security analysis
    let response: any = null
    try {
      response = await fetchHead(url.startsWith('http') ? url : `https://${url}`)
      
      // Comprehensive security headers analysis
      securityHeaders.xFrameOptions = response.headers.get('x-frame-options') || 'Missing'
      securityHeaders.xContentTypeOptions = response.headers.get('x-content-type-options') || 'Missing'
      securityHeaders.xXssProtection = response.headers.get('x-xss-protection') || 'Missing'
      securityHeaders.strictTransportSecurity = response.headers.get('strict-transport-security') || 'Missing'
      securityHeaders.contentSecurityPolicy = response.headers.get('content-security-policy') || 'Missing'
      securityHeaders.referrerPolicy = response.headers.get('referrer-policy') || 'Missing'
      securityHeaders.permissionsPolicy = response.headers.get('permissions-policy') || 'Missing'
      securityHeaders.server = response.headers.get('server') || 'Hidden'
      securityHeaders.xPoweredBy = response.headers.get('x-powered-by') || 'Hidden'
      securityHeaders.xDnsPreFetchControl = response.headers.get('x-dns-prefetch-control') || 'Missing'
      securityHeaders.expectCt = response.headers.get('expect-ct') || 'Missing'
    } catch (e) {
      // Continue with HTML analysis
    }
    
    // WordPress version detection (multiple methods)
    const versionMatch = html.match(/wp-includes.*?ver=([0-9.]+)/i) || 
                         html.match(/generator.*?WordPress\s+([0-9.]+)/i) ||
                         html.match(/<meta[^>]*name=["']generator["'][^>]*content=["']WordPress\s+([0-9.]+)["']/i) ||
                         html.match(/wp-emoji-release\.min\.js\?ver=([0-9.]+)/i)
    let wpVersion = 'Not detected'
    if (versionMatch) {
      wpVersion = versionMatch[1]
      vulnerabilities.push(`WordPress version ${versionMatch[1]} is publicly exposed - attackers can target known vulnerabilities`)
    }
    
    // Check for debug mode (critical vulnerability)
    if (html.includes('WP_DEBUG') || html.includes('wp-content/debug.log') || html.includes('SCRIPT_DEBUG')) {
      vulnerabilities.push('Debug mode is ENABLED - exposes sensitive paths, database queries, and error messages')
    }
    
    // Check for directory listing (critical vulnerability)
    if (html.includes('Index of /wp-content') || html.includes('Index of /wp-includes') || html.includes('Parent Directory')) {
      vulnerabilities.push('Directory listing is ENABLED - allows attackers to browse and download files')
    }
    
    // Check for exposed sensitive files
    const commonFiles = ['readme.html', 'license.txt', 'wp-config.php.bak', 'wp-config-sample.php', 'wp-config.old']
    commonFiles.forEach(file => {
      if (html.includes(file)) {
        exposedFiles.push(file)
        if (file.includes('wp-config')) {
          vulnerabilities.push(`CRITICAL: Backup config file ${file} is accessible - may contain database credentials`)
        } else {
          warnings.push(`Default file ${file} is accessible - reveals WordPress installation`)
        }
      }
    })
    
    // Check for XML-RPC (DDoS vector)
    if (html.includes('xmlrpc.php') || html.includes('pingback') || html.includes('RSD')) {
      warnings.push('XML-RPC endpoint is exposed - can be exploited for brute force attacks and DDoS amplification')
    }
    
    // Check for user enumeration vulnerability
    const authorLinks = html.match(/\/author\/([^\/'"?]+)/gi) || []
    const authorParams = html.match(/\?author=(\d+)/gi) || []
    if (authorLinks.length > 0 || authorParams.length > 0) {
      warnings.push(`User enumeration is possible - ${authorLinks.length + authorParams.length} author URLs found (reveals usernames for brute force)`)
    }
    
    // Comprehensive theme detection with versions
    const themeMatches = html.match(/wp-content\/themes\/([^\/'"?]+)(?:[^?]*\?ver=([0-9.]+))?/gi) || []
    const themeMap = new Map()
    themeMatches.forEach(match => {
      const parts = match.match(/themes\/([^\/'"?]+)(?:.*?ver=([0-9.]+))?/)
      if (parts) {
        const themeName = parts[1]
        const version = parts[2] || 'Unknown'
        if (!themeMap.has(themeName)) {
          themeMap.set(themeName, version)
          themesWithVersions.push({ name: themeName, version })
        }
      }
    })
    
    // Comprehensive plugin detection with versions
    const pluginMatches = html.match(/wp-content\/plugins\/([^\/'"?]+)(?:[^?]*\?ver=([0-9.]+))?/gi) || []
    const pluginMap = new Map()
    pluginMatches.forEach(match => {
      const parts = match.match(/plugins\/([^\/'"?]+)(?:.*?ver=([0-9.]+))?/)
      if (parts) {
        const pluginName = parts[1]
        const version = parts[2] || 'Unknown'
        if (!pluginMap.has(pluginName)) {
          pluginMap.set(pluginName, version)
          pluginsWithVersions.push({ name: pluginName, version })
        }
      }
    })
    
    // Check for plugin/theme version exposure
    const versionsExposed = pluginsWithVersions.filter(p => p.version !== 'Unknown').length + 
                           themesWithVersions.filter(t => t.version !== 'Unknown').length
    if (versionsExposed > 0) {
      warnings.push(`${versionsExposed} plugin/theme versions are exposed - attackers can identify outdated components`)
    }
    
    // Detailed security headers scoring
    let headerScore = 0
    const headerDetails: any = {}
    
    if (securityHeaders.xFrameOptions !== 'Missing') {
      headerScore += 10
      headerDetails.xFrameOptions = { status: 'Present', value: securityHeaders.xFrameOptions, score: 10 }
    } else {
      headerDetails.xFrameOptions = { status: 'Missing', recommendation: 'Add X-Frame-Options: SAMEORIGIN', score: 0 }
    }
    
    if (securityHeaders.xContentTypeOptions !== 'Missing') {
      headerScore += 10
      headerDetails.xContentTypeOptions = { status: 'Present', value: securityHeaders.xContentTypeOptions, score: 10 }
    } else {
      headerDetails.xContentTypeOptions = { status: 'Missing', recommendation: 'Add X-Content-Type-Options: nosniff', score: 0 }
    }
    
    if (securityHeaders.strictTransportSecurity !== 'Missing') {
      headerScore += 20
      headerDetails.strictTransportSecurity = { status: 'Present', value: securityHeaders.strictTransportSecurity, score: 20 }
    } else {
      headerDetails.strictTransportSecurity = { status: 'Missing', recommendation: 'Add Strict-Transport-Security: max-age=31536000; includeSubDomains', score: 0 }
    }
    
    if (securityHeaders.contentSecurityPolicy !== 'Missing') {
      headerScore += 25
      headerDetails.contentSecurityPolicy = { status: 'Present', score: 25 }
    } else {
      headerDetails.contentSecurityPolicy = { status: 'Missing', recommendation: 'Implement Content-Security-Policy header', score: 0 }
    }
    
    if (securityHeaders.referrerPolicy !== 'Missing') {
      headerScore += 10
      headerDetails.referrerPolicy = { status: 'Present', value: securityHeaders.referrerPolicy, score: 10 }
    } else {
      headerDetails.referrerPolicy = { status: 'Missing', recommendation: 'Add Referrer-Policy: strict-origin-when-cross-origin', score: 0 }
    }
    
    if (securityHeaders.xPoweredBy === 'Hidden') {
      headerScore += 10
      headerDetails.xPoweredBy = { status: 'Hidden (Good)', score: 10 }
    } else {
      headerDetails.xPoweredBy = { status: 'Exposed', value: securityHeaders.xPoweredBy, recommendation: 'Hide X-Powered-By header', score: 0 }
    }
    
    if (securityHeaders.server === 'Hidden' || securityHeaders.server.length < 10) {
      headerScore += 10
      headerDetails.server = { status: 'Hidden/Minimal (Good)', score: 10 }
    } else {
      headerDetails.server = { status: 'Exposed', value: securityHeaders.server, recommendation: 'Hide or minimize Server header', score: 0 }
    }
    
    if (securityHeaders.permissionsPolicy !== 'Missing') {
      headerScore += 5
      headerDetails.permissionsPolicy = { status: 'Present', score: 5 }
    }
    
    // Generate detailed warnings for missing headers
    if (securityHeaders.xFrameOptions === 'Missing') {
      warnings.push('X-Frame-Options header missing - site vulnerable to clickjacking attacks')
    }
    if (securityHeaders.strictTransportSecurity === 'Missing') {
      warnings.push('HSTS header missing - connections may not be forced to HTTPS, vulnerable to downgrade attacks')
    }
    if (securityHeaders.contentSecurityPolicy === 'Missing') {
      warnings.push('Content-Security-Policy header missing - vulnerable to XSS, code injection, and data theft')
    }
    if (securityHeaders.xContentTypeOptions === 'Missing') {
      warnings.push('X-Content-Type-Options header missing - vulnerable to MIME-type sniffing attacks')
    }
    if (securityHeaders.referrerPolicy === 'Missing') {
      warnings.push('Referrer-Policy header missing - may leak sensitive URL information to third parties')
    }
    
    // Check for login page exposure
    if (html.includes('wp-login.php') || html.includes('wp-admin') || html.includes('wp-login')) {
      warnings.push('Standard login page path detected - vulnerable to brute force attacks (consider using custom login URL or rate limiting)')
    }
    
    // Check for REST API exposure
    if (html.includes('wp-json') || html.includes('/wp/v2/')) {
      warnings.push('WordPress REST API is exposed - may reveal user information and site structure')
    }
    
    // Calculate comprehensive security score
    const baseScore = 100
    const vulnPenalty = vulnerabilities.length * 15
    const warnPenalty = warnings.length * 3
    const headerBonus = headerScore * 0.5
    const score = Math.max(0, Math.min(100, baseScore - vulnPenalty - warnPenalty + headerBonus))
    
    // Generate letter grade
    const grade = score >= 95 ? 'A+' :
                  score >= 90 ? 'A' :
                  score >= 85 ? 'A-' :
                  score >= 80 ? 'B+' :
                  score >= 75 ? 'B' :
                  score >= 70 ? 'B-' :
                  score >= 65 ? 'C+' :
                  score >= 60 ? 'C' :
                  score >= 55 ? 'C-' :
                  score >= 50 ? 'D' : 'F'
    
    return {
      url,
      securityScore: Math.round(score),
      grade,
      status: score >= 85 ? '✓ Excellent Security' : 
              score >= 70 ? '✓ Good Security' : 
              score >= 50 ? '⚠ Fair Security' : 
              '✗ Poor Security - Immediate Action Required',
      wpVersion,
      wpVersionExposed: wpVersion !== 'Not detected',
      vulnerabilities: vulnerabilities.length > 0 ? vulnerabilities : ['None detected - Good!'],
      vulnerabilityCount: vulnerabilities.length,
      warnings: warnings.length > 0 ? warnings : ['None detected - Good!'],
      warningCount: warnings.length,
      exposedFiles,
      themesDetected: themesWithVersions.length,
      pluginsDetected: pluginsWithVersions.length,
      themesList: themesWithVersions.slice(0, 10),
      pluginsList: pluginsWithVersions.slice(0, 15),
      securityHeaders: {
        score: Math.round(headerScore),
        maxScore: 100,
        details: headerDetails,
        summary: {
          xFrameOptions: securityHeaders.xFrameOptions,
          xContentTypeOptions: securityHeaders.xContentTypeOptions,
          strictTransportSecurity: securityHeaders.strictTransportSecurity,
          contentSecurityPolicy: securityHeaders.contentSecurityPolicy !== 'Missing' ? 'Present' : 'Missing',
          referrerPolicy: securityHeaders.referrerPolicy,
          permissionsPolicy: securityHeaders.permissionsPolicy,
          serverHeader: securityHeaders.server,
          poweredBy: securityHeaders.xPoweredBy
        }
      },
      recommendations: [
        wpVersion !== 'Not detected' ? '🔒 Remove WordPress version from HTML (edit theme functions or use security plugin)' : null,
        vulnerabilities.length > 0 ? '🚨 Fix critical vulnerabilities immediately - site is at high risk' : null,
        securityHeaders.strictTransportSecurity === 'Missing' ? '🔐 Enable HSTS header to force HTTPS connections' : null,
        securityHeaders.contentSecurityPolicy === 'Missing' ? '🛡️ Implement Content Security Policy to prevent XSS attacks' : null,
        securityHeaders.xFrameOptions === 'Missing' ? '🖼️ Add X-Frame-Options header to prevent clickjacking' : null,
        pluginsWithVersions.length > 5 ? '🔌 Review and remove unnecessary plugins to reduce attack surface' : null,
        '🔐 Install a security plugin (Wordfence, Sucuri, or iThemes Security)',
        '🔄 Keep WordPress core, themes, and plugins updated regularly',
        '🔑 Implement strong password policies and two-factor authentication',
        '🚫 Disable XML-RPC if not needed (prevents brute force amplification)',
        '📝 Change default login URL or implement login rate limiting',
        '🔍 Perform regular security audits and malware scans'
      ].filter(Boolean)
    }
  } catch (error: any) {
    throw new Error(`WordPress security scan failed: ${error.message}`)
  }
}

// HTTPS Checker
async function checkHTTPS(url: string) {
  try {
    const html = await fetchHTML(url)
    
    const httpResources = html.match(/(?:src|href)=["']http:\/\/[^"']+["']/gi) || []
    const uniqueIssues = [...new Set(httpResources)].map(r => r.replace(/["']/g, ''))
    
    return {
      url,
      isSecure: url.startsWith('https://'),
      mixedContentIssues: uniqueIssues.length,
      issues: uniqueIssues.slice(0, 15),
      status: uniqueIssues.length === 0 
        ? '✓ All resources loaded via HTTPS' 
        : `⚠ Found ${uniqueIssues.length} HTTP resources`,
      recommendation: uniqueIssues.length > 0 
        ? 'Update all resources to use HTTPS to avoid mixed content warnings' 
        : 'No mixed content detected'
    }
  } catch (error: any) {
    throw new Error(`HTTPS check failed: ${error.message}`)
  }
}

// Hyperlink Analyzer
async function analyzeHyperlinks(url: string) {
  try {
    const html = await fetchHTML(url)
    const domain = new URL(url.startsWith('http') ? url : `https://${url}`).hostname
    
    const linkMatches = html.match(/<a[^>]*href=["']([^"']+)["'][^>]*>/gi) || []
    
    const internal: string[] = []
    const external: string[] = []
    
    linkMatches.forEach(link => {
      const hrefMatch = link.match(/href=["']([^"']+)["']/)
      if (hrefMatch) {
        const href = hrefMatch[1]
        if (href.startsWith('#') || href.startsWith('javascript:')) {
          // Skip anchors and javascript links
        } else if (href.includes(domain) || href.startsWith('/') || !href.startsWith('http')) {
          internal.push(href)
        } else if (href.startsWith('http')) {
          external.push(href)
        }
      }
    })
    
    return {
      totalLinks: linkMatches.length,
      internalLinks: internal.length,
      externalLinks: external.length,
      internal: [...new Set(internal)].slice(0, 20),
      external: [...new Set(external)].slice(0, 20),
      status: `✓ Found ${linkMatches.length} total links`
    }
  } catch (error: any) {
    throw new Error(`Hyperlink analysis failed: ${error.message}`)
  }
}

// Robots.txt Checker
async function checkRobots(url: string) {
  const domain = new URL(url.startsWith('http') ? url : `https://${url}`).hostname
  const robotsUrl = `https://${domain}/robots.txt`
  
  try {
    const response = await fetch(robotsUrl)
    const robotsTxt = await response.text()
    
    if (!response.ok || robotsTxt.includes('404') || robotsTxt.includes('Not Found')) {
      return {
        domain,
        exists: false,
        status: '✗ No robots.txt file found',
        recommendation: 'Consider adding a robots.txt file to guide search engine crawlers'
      }
    }
    
    const disallowRules = robotsTxt.match(/Disallow:[^\n]*/gi) || []
    const allowRules = robotsTxt.match(/Allow:[^\n]*/gi) || []
    const sitemaps = robotsTxt.match(/Sitemap:[^\n]*/gi) || []
    const userAgents = robotsTxt.match(/User-agent:[^\n]*/gi) || []
    
    return {
      domain,
      exists: true,
      status: '✓ robots.txt file found',
      content: robotsTxt.substring(0, 1500),
      disallowRules: disallowRules.length,
      allowRules: allowRules.length,
      userAgents: userAgents.length,
      sitemaps: sitemaps.map(s => s.replace('Sitemap:', '').trim()),
      hasSitemap: sitemaps.length > 0
    }
  } catch (error) {
    return {
      domain,
      exists: false,
      status: '✗ No robots.txt file found',
      error: 'Unable to fetch robots.txt'
    }
  }
}

// Extract Links
async function extractLinks(url: string) {
  try {
    const html = await fetchHTML(url)
    
    const hrefMatches = html.match(/href=["']([^"']+)["']/gi) || []
    const srcMatches = html.match(/src=["']([^"']+)["']/gi) || []
    
    const allLinks = [...hrefMatches, ...srcMatches]
      .map(link => link.replace(/href=["']|src=["']|["']/g, ''))
      .filter(link => link.startsWith('http'))
    
    const uniqueLinks = [...new Set(allLinks)]
    
    return {
      totalLinks: uniqueLinks.length,
      links: uniqueLinks.slice(0, 100),
      status: `✓ Extracted ${uniqueLinks.length} unique links`
    }
  } catch (error: any) {
    throw new Error(`Link extraction failed: ${error.message}`)
  }
}

// Google Analytics & GTM Checker
async function checkGAGTM(url: string) {
  try {
    const html = await fetchHTML(url)
    
    const gaMatch = html.match(/UA-\d+-\d+/g)
    const gtmMatch = html.match(/GTM-[A-Z0-9]+/g)
    const ga4Match = html.match(/G-[A-Z0-9]+/g)
    
    const hasTracking = !!(gaMatch || gtmMatch || ga4Match)
    
    return {
      hasGA: !!gaMatch,
      hasGTM: !!gtmMatch,
      hasGA4: !!ga4Match,
      gaIds: gaMatch ? [...new Set(gaMatch)] : [],
      gtmIds: gtmMatch ? [...new Set(gtmMatch)] : [],
      ga4Ids: ga4Match ? [...new Set(ga4Match)] : [],
      status: hasTracking ? '✓ Tracking codes found' : '✗ No tracking codes detected'
    }
  } catch (error: any) {
    throw new Error(`GA/GTM check failed: ${error.message}`)
  }
}

// Meta Tags Analyzer
async function analyzeMetaTags(url: string) {
  try {
    const html = await fetchHTML(url)
    
    // Extract title
    const titleMatch = html.match(/<title[^>]*>([^<]+)<\/title>/i)
    const title = titleMatch ? titleMatch[1].trim() : 'Not found'
    const titleLength = title.length
    
    // Extract all meta tags
    const metaTags = html.match(/<meta[^>]*>/gi) || []
    
    // Initialize meta data collections
    const basicMeta: any = {}
    const openGraph: any = {}
    const twitterCard: any = {}
    const schemaOrg: any = {}
    const appleMeta: any = {}
    const otherMeta: any = {}
    
    // Parse all meta tags
    metaTags.forEach(tag => {
      const nameMatch = tag.match(/name=["']([^"']+)["']/i)
      const contentMatch = tag.match(/content=["']([^"']+)["']/i)
      const propertyMatch = tag.match(/property=["']([^"']+)["']/i)
      const httpEquivMatch = tag.match(/http-equiv=["']([^"']+)["']/i)
      const charsetMatch = tag.match(/charset=["']?([^"'\s>]+)["']?/i)
      
      const content = contentMatch ? contentMatch[1] : ''
      
      // Basic meta tags
      if (nameMatch) {
        const name = nameMatch[1].toLowerCase()
        if (name === 'description' || name === 'keywords' || name === 'author' || 
            name === 'robots' || name === 'viewport' || name === 'theme-color' ||
            name === 'generator' || name === 'rating' || name === 'copyright') {
          basicMeta[nameMatch[1]] = content
        } else if (name.startsWith('apple-')) {
          appleMeta[nameMatch[1]] = content
        } else {
          otherMeta[nameMatch[1]] = content
        }
      }
      
      // Open Graph tags
      if (propertyMatch && propertyMatch[1].startsWith('og:')) {
        openGraph[propertyMatch[1]] = content
      }
      
      // Twitter Card tags
      if (nameMatch && nameMatch[1].startsWith('twitter:')) {
        twitterCard[nameMatch[1]] = content
      }
      
      // Schema.org via property
      if (propertyMatch && !propertyMatch[1].startsWith('og:')) {
        schemaOrg[propertyMatch[1]] = content
      }
      
      // HTTP-Equiv tags
      if (httpEquivMatch) {
        basicMeta[`http-equiv-${httpEquivMatch[1]}`] = content
      }
      
      // Charset
      if (charsetMatch) {
        basicMeta.charset = charsetMatch[1]
      }
    })
    
    // Extract canonical URL
    const canonicalMatch = html.match(/<link[^>]*rel=["']canonical["'][^>]*href=["']([^"']+)["']/i) ||
                           html.match(/<link[^>]*href=["']([^"']+)["'][^>]*rel=["']canonical["']/i)
    const canonical = canonicalMatch ? canonicalMatch[1] : 'Not found'
    
    // Extract alternate links (hreflang)
    const alternateTags = html.match(/<link[^>]*rel=["']alternate["'][^>]*>/gi) || []
    const hreflangLinks: any[] = []
    alternateTags.forEach(tag => {
      const hrefMatch = tag.match(/href=["']([^"']+)["']/)
      const hreflangMatch = tag.match(/hreflang=["']([^"']+)["']/)
      if (hrefMatch && hreflangMatch) {
        hreflangLinks.push({
          lang: hreflangMatch[1],
          url: hrefMatch[1]
        })
      }
    })
    
    // Extract favicon
    const faviconMatch = html.match(/<link[^>]*rel=["'](?:icon|shortcut icon)["'][^>]*href=["']([^"']+)["']/i) ||
                         html.match(/<link[^>]*href=["']([^"']+)["'][^>]*rel=["'](?:icon|shortcut icon)["']/i)
    const favicon = faviconMatch ? faviconMatch[1] : 'Not found'
    
    // Extract RSS/Atom feeds
    const feedTags = html.match(/<link[^>]*type=["']application\/(?:rss|atom)\+xml["'][^>]*>/gi) || []
    const feeds: any[] = []
    feedTags.forEach(tag => {
      const hrefMatch = tag.match(/href=["']([^"']+)["']/)
      const titleMatch = tag.match(/title=["']([^"']+)["']/)
      if (hrefMatch) {
        feeds.push({
          url: hrefMatch[1],
          title: titleMatch ? titleMatch[1] : 'Untitled Feed'
        })
      }
    })
    
    // Extract JSON-LD structured data
    const jsonLdMatches = html.match(/<script[^>]*type=["']application\/ld\+json["'][^>]*>([\s\S]*?)<\/script>/gi) || []
    const structuredData: any[] = []
    jsonLdMatches.forEach(script => {
      const jsonMatch = script.match(/<script[^>]*>([\s\S]*?)<\/script>/i)
      if (jsonMatch) {
        try {
          const data = JSON.parse(jsonMatch[1])
          structuredData.push(data)
        } catch (e) {
          // Invalid JSON, skip
        }
      }
    })
    
    // SEO Analysis
    const seoAnalysis = {
      title: {
        present: title !== 'Not found',
        length: titleLength,
        optimal: titleLength >= 30 && titleLength <= 60,
        status: titleLength === 0 ? 'Missing' : 
                titleLength < 30 ? 'Too short' : 
                titleLength > 60 ? 'Too long' : 'Optimal'
      },
      description: {
        present: !!basicMeta.description,
        length: basicMeta.description ? basicMeta.description.length : 0,
        optimal: basicMeta.description && basicMeta.description.length >= 120 && basicMeta.description.length <= 160,
        status: !basicMeta.description ? 'Missing' :
                basicMeta.description.length < 120 ? 'Too short' :
                basicMeta.description.length > 160 ? 'Too long' : 'Optimal'
      },
      keywords: {
        present: !!basicMeta.keywords,
        count: basicMeta.keywords ? basicMeta.keywords.split(',').length : 0,
        note: 'Keywords meta tag is largely ignored by modern search engines'
      },
      canonical: {
        present: canonical !== 'Not found',
        url: canonical,
        matchesUrl: canonical === url || canonical === url + '/' || canonical + '/' === url
      },
      robots: {
        present: !!basicMeta.robots,
        content: basicMeta.robots || 'Not specified (defaults to index,follow)',
        isIndexable: !basicMeta.robots || (!basicMeta.robots.includes('noindex') && !basicMeta.robots.includes('none'))
      },
      viewport: {
        present: !!basicMeta.viewport,
        content: basicMeta.viewport || 'Not found',
        isMobileFriendly: basicMeta.viewport && basicMeta.viewport.includes('width=device-width')
      }
    }
    
    // Open Graph Analysis
    const ogAnalysis = {
      present: Object.keys(openGraph).length > 0,
      complete: !!(openGraph['og:title'] && openGraph['og:description'] && 
                   openGraph['og:image'] && openGraph['og:url']),
      tags: openGraph,
      missingRequired: [
        !openGraph['og:title'] ? 'og:title' : null,
        !openGraph['og:description'] ? 'og:description' : null,
        !openGraph['og:image'] ? 'og:image' : null,
        !openGraph['og:url'] ? 'og:url' : null,
        !openGraph['og:type'] ? 'og:type' : null
      ].filter(Boolean),
      imageInfo: openGraph['og:image'] ? {
        url: openGraph['og:image'],
        width: openGraph['og:image:width'] || 'Not specified',
        height: openGraph['og:image:height'] || 'Not specified',
        alt: openGraph['og:image:alt'] || 'Not specified'
      } : null
    }
    
    // Twitter Card Analysis
    const twitterAnalysis = {
      present: Object.keys(twitterCard).length > 0,
      cardType: twitterCard['twitter:card'] || 'Not specified',
      complete: !!(twitterCard['twitter:card'] && twitterCard['twitter:title'] && 
                   twitterCard['twitter:description']),
      tags: twitterCard,
      missingRecommended: [
        !twitterCard['twitter:card'] ? 'twitter:card' : null,
        !twitterCard['twitter:title'] ? 'twitter:title' : null,
        !twitterCard['twitter:description'] ? 'twitter:description' : null,
        !twitterCard['twitter:image'] ? 'twitter:image' : null,
        !twitterCard['twitter:site'] ? 'twitter:site' : null
      ].filter(Boolean)
    }
    
    // Calculate overall score
    let score = 0
    if (seoAnalysis.title.optimal) score += 15
    else if (seoAnalysis.title.present) score += 8
    
    if (seoAnalysis.description.optimal) score += 15
    else if (seoAnalysis.description.present) score += 8
    
    if (seoAnalysis.canonical.present) score += 10
    if (seoAnalysis.viewport.isMobileFriendly) score += 10
    if (seoAnalysis.robots.isIndexable) score += 5
    
    if (ogAnalysis.complete) score += 20
    else if (ogAnalysis.present) score += 10
    
    if (twitterAnalysis.complete) score += 15
    else if (twitterAnalysis.present) score += 8
    
    if (structuredData.length > 0) score += 10
    
    const grade = score >= 90 ? 'A+' :
                  score >= 80 ? 'A' :
                  score >= 70 ? 'B' :
                  score >= 60 ? 'C' :
                  score >= 50 ? 'D' : 'F'
    
    return {
      url,
      
      // Page Title
      title: {
        content: title,
        length: titleLength,
        optimal: seoAnalysis.title.optimal,
        status: seoAnalysis.title.status
      },
      
      // Basic Meta Tags
      basicMeta: {
        description: basicMeta.description || 'Not found',
        descriptionLength: basicMeta.description ? basicMeta.description.length : 0,
        keywords: basicMeta.keywords || 'Not found',
        author: basicMeta.author || 'Not found',
        robots: basicMeta.robots || 'Not specified',
        viewport: basicMeta.viewport || 'Not found',
        charset: basicMeta.charset || 'Not found',
        themeColor: basicMeta['theme-color'] || 'Not found',
        generator: basicMeta.generator || 'Not found',
        rating: basicMeta.rating || 'Not found',
        copyright: basicMeta.copyright || 'Not found'
      },
      
      // Open Graph Tags
      openGraph: {
        present: ogAnalysis.present,
        complete: ogAnalysis.complete,
        tags: openGraph,
        missingRequired: ogAnalysis.missingRequired,
        imageInfo: ogAnalysis.imageInfo,
        score: ogAnalysis.complete ? 'Excellent' : 
               ogAnalysis.present ? 'Partial' : 'Missing'
      },
      
      // Twitter Card Tags
      twitterCard: {
        present: twitterAnalysis.present,
        cardType: twitterAnalysis.cardType,
        complete: twitterAnalysis.complete,
        tags: twitterCard,
        missingRecommended: twitterAnalysis.missingRecommended,
        score: twitterAnalysis.complete ? 'Excellent' : 
               twitterAnalysis.present ? 'Partial' : 'Missing'
      },
      
      // Apple Meta Tags
      appleMeta: {
        present: Object.keys(appleMeta).length > 0,
        tags: appleMeta,
        webAppCapable: appleMeta['apple-mobile-web-app-capable'] || 'Not found',
        statusBarStyle: appleMeta['apple-mobile-web-app-status-bar-style'] || 'Not found',
        title: appleMeta['apple-mobile-web-app-title'] || 'Not found'
      },
      
      // Structured Data (JSON-LD)
      structuredData: {
        present: structuredData.length > 0,
        count: structuredData.length,
        types: structuredData.map(data => data['@type'] || 'Unknown'),
        data: structuredData,
        score: structuredData.length > 0 ? 'Present' : 'Missing'
      },
      
      // Links
      links: {
        canonical,
        canonicalPresent: canonical !== 'Not found',
        favicon,
        faviconPresent: favicon !== 'Not found',
        hreflang: {
          present: hreflangLinks.length > 0,
          count: hreflangLinks.length,
          links: hreflangLinks
        },
        feeds: {
          present: feeds.length > 0,
          count: feeds.length,
          feeds
        }
      },
      
      // SEO Analysis
      seoAnalysis,
      
      // Overall Score
      overallScore: {
        score,
        grade,
        status: grade.startsWith('A') ? '✓ Excellent' :
                grade === 'B' ? '✓ Good' :
                grade === 'C' ? '⚠ Fair' : '✗ Poor'
      },
      
      // Statistics
      statistics: {
        totalMetaTags: metaTags.length,
        basicMetaCount: Object.keys(basicMeta).length,
        openGraphCount: Object.keys(openGraph).length,
        twitterCardCount: Object.keys(twitterCard).length,
        appleMetaCount: Object.keys(appleMeta).length,
        structuredDataCount: structuredData.length,
        hreflangCount: hreflangLinks.length
      },
      
      // Recommendations
      recommendations: [
        !seoAnalysis.title.optimal ? `📝 ${seoAnalysis.title.status === 'Missing' ? 'Add a title tag' : `Title is ${seoAnalysis.title.status.toLowerCase()} (${titleLength} chars) - optimal is 30-60 characters`}` : null,
        !seoAnalysis.description.optimal ? `📝 ${seoAnalysis.description.status === 'Missing' ? 'Add a meta description' : `Description is ${seoAnalysis.description.status.toLowerCase()} (${basicMeta.description?.length || 0} chars) - optimal is 120-160 characters`}` : null,
        !seoAnalysis.canonical.present ? '🔗 Add a canonical URL to avoid duplicate content issues' : null,
        !seoAnalysis.viewport.isMobileFriendly ? '📱 Add viewport meta tag for mobile optimization' : null,
        !ogAnalysis.complete ? `📱 Complete Open Graph tags - missing: ${ogAnalysis.missingRequired.join(', ')}` : null,
        !twitterAnalysis.complete ? `🐦 Complete Twitter Card tags - missing: ${twitterAnalysis.missingRecommended.join(', ')}` : null,
        structuredData.length === 0 ? '📊 Add structured data (JSON-LD) for rich snippets' : null,
        hreflangLinks.length === 0 && html.includes('lang=') ? '🌍 Consider adding hreflang tags for international SEO' : null,
        !basicMeta.robots || basicMeta.robots === 'Not specified' ? '🤖 Consider adding robots meta tag for crawl control' : null,
        score >= 80 ? '✅ Great job! Your meta tags are well optimized' : null
      ].filter(Boolean),
      
      status: '✓ Meta tags analyzed',
      message: `Found ${metaTags.length} meta tags with overall score: ${grade} (${score}/100)`
    }
  } catch (error: any) {
    throw new Error(`Meta tags analysis failed: ${error.message}`)
  }
}

// SSL Certificate Lookup
async function checkSSL(url: string) {
  const domain = url.replace(/^https?:\/\//, '').split('/')[0]
  
  try {
    const response = await fetchHead(`https://${domain}`)
    
    return {
      domain,
      status: '✓ SSL certificate is valid',
      isSecure: true,
      message: 'The domain responds to HTTPS requests successfully',
      recommendation: 'SSL appears to be configured correctly'
    }
  } catch (error: any) {
    return {
      domain,
      status: '✗ SSL certificate issue detected',
      isSecure: false,
      error: error.message,
      recommendation: 'Check SSL certificate configuration'
    }
  }
}

// Is It Down Checker
async function checkUptime(url: string) {
  const startTime = Date.now()
  
  try {
    const response = await fetchHead(url.startsWith('http') ? url : `https://${url}`)
    const endTime = Date.now()
    
    return {
      url,
      status: response.status,
      isUp: response.ok,
      responseTime: endTime - startTime,
      message: response.ok 
        ? `✓ Website is UP (${endTime - startTime}ms)` 
        : `⚠ Website returned status ${response.status}`,
      statusText: response.statusText
    }
  } catch (error: any) {
    return {
      url,
      isUp: false,
      status: 0,
      message: '✗ Website is DOWN or unreachable',
      error: error.message
    }
  }
}

// URL Redirect Tracker
async function trackRedirects(url: string) {
  const normalizedUrl = url.startsWith('http') ? url : `https://${url}`
  
  try {
    const response = await fetch(normalizedUrl, {
      redirect: 'follow',
      method: 'HEAD',
      headers: {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36',
      },
      signal: AbortSignal.timeout(10000)
    })
    
    return {
      originalUrl: normalizedUrl,
      finalUrl: response.url,
      redirected: response.url !== normalizedUrl,
      statusCode: response.status,
      status: response.url !== normalizedUrl 
        ? `↪ Redirected to: ${response.url}` 
        : '✓ No redirects detected'
    }
  } catch (error: any) {
    throw new Error('Failed to track redirects: ' + error.message)
  }
}

// HTML Source Viewer
async function viewHTML(url: string) {
  try {
    const html = await fetchHTML(url)
    
    return {
      html: html.substring(0, 10000),
      length: html.length,
      truncated: html.length > 10000,
      status: '✓ HTML source retrieved'
    }
  } catch (error: any) {
    throw new Error(`HTML viewer failed: ${error.message}`)
  }
}

// WordPress Detector
async function checkWordPress(url: string) {
  try {
    const html = await fetchHTML(url)
    
    const wpSignatures = [
      html.includes('wp-content'),
      html.includes('wp-includes'),
      html.match(/\/wp-content\/themes\//i) !== null,
      html.match(/\/wp-content\/plugins\//i) !== null,
      html.includes('wp-json'),
      html.includes('WordPress')
    ]
    
    const detectedCount = wpSignatures.filter(Boolean).length
    const isWP = detectedCount >= 2
    
    return {
      isWordPress: isWP,
      confidence: Math.round((detectedCount / wpSignatures.length) * 100) + '%',
      signaturesFound: detectedCount,
      status: isWP ? '✓ This is a WordPress site' : '✗ Not WordPress',
      message: isWP 
        ? `WordPress detected with ${detectedCount} signatures` 
        : 'No WordPress signatures found'
    }
  } catch (error: any) {
    throw new Error(`WordPress detection failed: ${error.message}`)
  }
}

// WordPress Theme Detector
async function detectWPTheme(url: string) {
  try {
    const html = await fetchHTML(url)
    
    const themeMatch = html.match(/\/wp-content\/themes\/([^\/'"?]+)/i)
    const styleMatch = html.match(/Theme Name:\s*([^\n]+)/i)
    const themeUriMatch = html.match(/Theme URI:\s*([^\n]+)/i)
    
    return {
      hasTheme: !!themeMatch,
      themeName: themeMatch ? themeMatch[1] : 'Not detected',
      themeNameFromStyle: styleMatch ? styleMatch[1].trim() : 'Not found',
      themeUri: themeUriMatch ? themeUriMatch[1].trim() : 'Not found',
      status: themeMatch 
        ? `✓ Theme detected: ${themeMatch[1]}` 
        : '✗ No WordPress theme detected'
    }
  } catch (error: any) {
    throw new Error(`WordPress theme detection failed: ${error.message}`)
  }
}

// Shopify Detector
async function detectShopify(url: string) {
  try {
    const html = await fetchHTML(url)
    
    const shopifySignatures = [
      html.includes('Shopify'),
      html.includes('cdn.shopify.com'),
      html.includes('myshopify.com'),
      html.match(/Shopify\.theme/i) !== null,
      html.includes('shopify-section')
    ]
    
    const detectedCount = shopifySignatures.filter(Boolean).length
    const isShopify = detectedCount >= 2
    
    return {
      isShopify,
      confidence: Math.round((detectedCount / shopifySignatures.length) * 100) + '%',
      signaturesFound: detectedCount,
      status: isShopify ? '✓ This is a Shopify store' : '✗ Not Shopify',
      message: isShopify 
        ? `Shopify detected with ${detectedCount} signatures` 
        : 'No Shopify signatures found'
    }
  } catch (error: any) {
    throw new Error(`Shopify detection failed: ${error.message}`)
  }
}

// Domain Availability Checker
async function checkDomain(url: string) {
  const domain = url.replace(/^https?:\/\//, '').split('/')[0].trim()
  
  // Validate domain format
  if (!domain || domain.length < 3 || !domain.includes('.')) {
    return {
      domain,
      isRegistered: true,
      status: '✗ Invalid domain name',
      ips: [],
      message: 'Please enter a valid domain name (e.g., example.com)',
      error: true
    }
  }
  
  try {
    const response = await fetch(`https://dns.google/resolve?name=${domain}&type=A`, {
      signal: AbortSignal.timeout(8000)
    })
    
    if (!response.ok) {
      return {
        domain,
        isRegistered: true,
        status: '⚠ Unable to verify',
        ips: [],
        message: 'Unable to check domain availability at this time. Please try again later.',
        error: true
      }
    }
    
    const data = await response.json()
    
    // Check if domain has DNS records
    const isRegistered = data.Answer && data.Answer.length > 0
    
    return {
      domain,
      isRegistered,
      status: isRegistered ? '✗ Domain is registered' : '✓ Domain may be available',
      ips: isRegistered ? data.Answer.map((a: any) => a.data) : [],
      message: isRegistered 
        ? `The domain "${domain}" is already registered and in use.` 
        : `The domain "${domain}" appears to be available for registration.`,
      note: !isRegistered ? 'Note: This is a preliminary check. Please verify availability with a domain registrar.' : undefined,
      error: false
    }
  } catch (error: any) {
    // User-friendly error handling
    if (error.name === 'AbortError' || error.message.includes('timeout')) {
      return {
        domain,
        isRegistered: true,
        status: '⚠ Request timeout',
        ips: [],
        message: 'The request took too long. Please check your internet connection and try again.',
        error: true
      }
    }
    
    return {
      domain,
      isRegistered: true,
      status: '⚠ Unable to verify',
      ips: [],
      message: 'Unable to check domain availability. Please verify the domain name is correct and try again.',
      error: true
    }
  }
}

// Server OS Detection
async function detectServerOS(url: string) {
  try {
    const response = await fetchHead(url.startsWith('http') ? url : `https://${url}`)
    
    // Collect all relevant headers
    const server = response.headers.get('server') || 'Not disclosed'
    const poweredBy = response.headers.get('x-powered-by') || 'Not disclosed'
    const via = response.headers.get('via') || 'Not disclosed'
    const xAspNetVersion = response.headers.get('x-aspnet-version') || 'Not disclosed'
    const xAspNetMvcVersion = response.headers.get('x-aspnetmvc-version') || 'Not disclosed'
    const xGenerator = response.headers.get('x-generator') || 'Not disclosed'
    const xDrupalCache = response.headers.get('x-drupal-cache') || 'Not disclosed'
    const xVarnish = response.headers.get('x-varnish') || 'Not disclosed'
    const cfRay = response.headers.get('cf-ray') || 'Not disclosed'
    const xCacheStatus = response.headers.get('x-cache') || response.headers.get('x-cache-status') || 'Not disclosed'
    
    // Detect OS from server header
    let detectedOS = 'Unknown'
    let osConfidence = 'Low'
    
    const serverLower = server.toLowerCase()
    if (serverLower.includes('ubuntu')) {
      detectedOS = 'Ubuntu Linux'
      osConfidence = 'High'
    } else if (serverLower.includes('debian')) {
      detectedOS = 'Debian Linux'
      osConfidence = 'High'
    } else if (serverLower.includes('centos')) {
      detectedOS = 'CentOS Linux'
      osConfidence = 'High'
    } else if (serverLower.includes('red hat') || serverLower.includes('rhel')) {
      detectedOS = 'Red Hat Enterprise Linux'
      osConfidence = 'High'
    } else if (serverLower.includes('unix')) {
      detectedOS = 'Unix-based System'
      osConfidence = 'Medium'
    } else if (serverLower.includes('win32') || serverLower.includes('win64') || xAspNetVersion !== 'Not disclosed') {
      detectedOS = 'Windows Server'
      osConfidence = 'High'
    } else if (serverLower.includes('apache')) {
      detectedOS = 'Linux (likely)'
      osConfidence = 'Medium'
    } else if (serverLower.includes('nginx')) {
      detectedOS = 'Linux/Unix (likely)'
      osConfidence = 'Medium'
    }
    
    // Detect web server software
    let webServer = 'Unknown'
    let webServerVersion = 'Unknown'
    
    if (serverLower.includes('apache')) {
      webServer = 'Apache'
      const versionMatch = server.match(/Apache\/([\d.]+)/i)
      if (versionMatch) webServerVersion = versionMatch[1]
    } else if (serverLower.includes('nginx')) {
      webServer = 'Nginx'
      const versionMatch = server.match(/nginx\/([\d.]+)/i)
      if (versionMatch) webServerVersion = versionMatch[1]
    } else if (serverLower.includes('microsoft-iis')) {
      webServer = 'Microsoft IIS'
      const versionMatch = server.match(/IIS\/([\d.]+)/i)
      if (versionMatch) webServerVersion = versionMatch[1]
    } else if (serverLower.includes('litespeed')) {
      webServer = 'LiteSpeed'
      const versionMatch = server.match(/LiteSpeed\/([\d.]+)/i)
      if (versionMatch) webServerVersion = versionMatch[1]
    } else if (serverLower.includes('cloudflare')) {
      webServer = 'Cloudflare'
    } else if (server !== 'Not disclosed') {
      webServer = server.split('/')[0]
    }
    
    // Detect backend technology
    const technologies: string[] = []
    if (poweredBy !== 'Not disclosed') {
      technologies.push(poweredBy)
    }
    if (xAspNetVersion !== 'Not disclosed') {
      technologies.push(`ASP.NET ${xAspNetVersion}`)
    }
    if (xAspNetMvcVersion !== 'Not disclosed') {
      technologies.push(`ASP.NET MVC ${xAspNetMvcVersion}`)
    }
    if (xGenerator !== 'Not disclosed') {
      technologies.push(xGenerator)
    }
    if (xDrupalCache !== 'Not disclosed') {
      technologies.push('Drupal CMS')
    }
    
    // Detect CDN/Proxy
    const cdnProxy: string[] = []
    if (cfRay !== 'Not disclosed') {
      cdnProxy.push('Cloudflare CDN')
    }
    if (xVarnish !== 'Not disclosed') {
      cdnProxy.push('Varnish Cache')
    }
    if (via !== 'Not disclosed') {
      cdnProxy.push(`Proxy: ${via}`)
    }
    
    // Security analysis
    const securityIssues: string[] = []
    if (server !== 'Not disclosed' && server.match(/\/[\d.]+/)) {
      securityIssues.push('Server version is exposed - consider hiding for security')
    }
    if (poweredBy !== 'Not disclosed') {
      securityIssues.push('X-Powered-By header exposes backend technology')
    }
    if (xAspNetVersion !== 'Not disclosed') {
      securityIssues.push('ASP.NET version is exposed')
    }
    
    // Get additional headers for analysis
    const allHeaders: Record<string, string> = {}
    response.headers.forEach((value, key) => {
      allHeaders[key] = value
    })
    
    return {
      url,
      status: '✓ Server analysis complete',
      
      // Operating System
      operatingSystem: {
        detected: detectedOS,
        confidence: osConfidence,
        note: osConfidence === 'Low' ? 'OS detection is based on limited information' : 'OS detected from server headers'
      },
      
      // Web Server
      webServer: {
        software: webServer,
        version: webServerVersion,
        fullHeader: server
      },
      
      // Backend Technologies
      backendTech: {
        technologies: technologies.length > 0 ? technologies : ['Not detected'],
        poweredBy,
        frameworks: [
          xAspNetVersion !== 'Not disclosed' ? `ASP.NET ${xAspNetVersion}` : null,
          xAspNetMvcVersion !== 'Not disclosed' ? `MVC ${xAspNetMvcVersion}` : null
        ].filter(Boolean)
      },
      
      // CDN and Caching
      cdnAndCache: {
        services: cdnProxy.length > 0 ? cdnProxy : ['None detected'],
        cacheStatus: xCacheStatus,
        cloudflare: cfRay !== 'Not disclosed',
        varnish: xVarnish !== 'Not disclosed'
      },
      
      // Server Headers
      serverHeaders: {
        server,
        xPoweredBy: poweredBy,
        via,
        xAspNetVersion,
        xGenerator,
        xDrupalCache,
        xVarnish,
        cfRay: cfRay !== 'Not disclosed' ? cfRay : 'Not using Cloudflare',
        xCache: xCacheStatus
      },
      
      // Security Analysis
      security: {
        issues: securityIssues.length > 0 ? securityIssues : ['No obvious security issues detected'],
        score: securityIssues.length === 0 ? 'Good' : securityIssues.length <= 2 ? 'Fair' : 'Poor',
        recommendations: [
          server !== 'Not disclosed' && server.match(/\/[\d.]+/) ? 'Hide server version in headers' : null,
          poweredBy !== 'Not disclosed' ? 'Remove X-Powered-By header' : null,
          xAspNetVersion !== 'Not disclosed' ? 'Hide ASP.NET version' : null,
          'Keep server software updated to latest stable version',
          'Use a Web Application Firewall (WAF)'
        ].filter(Boolean)
      },
      
      // Technology Stack Summary
      techStack: {
        os: detectedOS,
        webServer: `${webServer}${webServerVersion !== 'Unknown' ? ' ' + webServerVersion : ''}`,
        backend: technologies.length > 0 ? technologies.join(', ') : 'Not detected',
        cdn: cdnProxy.length > 0 ? cdnProxy.join(', ') : 'None',
        cache: xCacheStatus !== 'Not disclosed' ? 'Enabled' : 'Unknown'
      },
      
      // All detected headers (for advanced users)
      allHeaders: Object.keys(allHeaders).length > 0 ? allHeaders : { note: 'No headers available' },
      
      message: `Server: ${webServer} on ${detectedOS}`,
      recommendation: securityIssues.length > 0 
        ? 'Consider hiding server information to improve security' 
        : 'Server configuration looks secure'
    }
  } catch (error: any) {
    throw new Error('Failed to detect server: ' + error.message)
  }
}

// Lynx Viewer
async function viewLynx(url: string) {
  try {
    const html = await fetchHTML(url)
    
    // Extract title
    const titleMatch = html.match(/<title[^>]*>([^<]+)<\/title>/i)
    const title = titleMatch ? titleMatch[1].trim() : 'No title'
    
    // Extract meta description
    const metaDescMatch = html.match(/<meta[^>]*name=["']description["'][^>]*content=["']([^"']+)["']/i)
    const metaDescription = metaDescMatch ? metaDescMatch[1].trim() : 'No description'
    
    // Extract headings with hierarchy
    const h1Matches = html.match(/<h1[^>]*>([^<]+)<\/h1>/gi) || []
    const h2Matches = html.match(/<h2[^>]*>([^<]+)<\/h2>/gi) || []
    const h3Matches = html.match(/<h3[^>]*>([^<]+)<\/h3>/gi) || []
    
    const headings = {
      h1: h1Matches.map(h => h.replace(/<[^>]+>/g, '').trim()),
      h2: h2Matches.slice(0, 10).map(h => h.replace(/<[^>]+>/g, '').trim()),
      h3: h3Matches.slice(0, 15).map(h => h.replace(/<[^>]+>/g, '').trim())
    }
    
    // Extract links with text
    const linkMatches = html.match(/<a[^>]*href=["']([^"']+)["'][^>]*>([^<]*)<\/a>/gi) || []
    const links = linkMatches.slice(0, 30).map(link => {
      const hrefMatch = link.match(/href=["']([^"']+)["']/)
      const textMatch = link.match(/>([^<]*)<\/a>/)
      return {
        url: hrefMatch ? hrefMatch[1] : '',
        text: textMatch ? textMatch[1].trim() : '[No text]'
      }
    }).filter(link => link.url && !link.url.startsWith('#') && !link.url.startsWith('javascript:'))
    
    // Extract images with alt text
    const imgMatches = html.match(/<img[^>]*>/gi) || []
    const images = imgMatches.slice(0, 20).map(img => {
      const srcMatch = img.match(/src=["']([^"']+)["']/)
      const altMatch = img.match(/alt=["']([^"']*)["']/)
      return {
        src: srcMatch ? srcMatch[1] : '',
        alt: altMatch ? altMatch[1] : '[No alt text]'
      }
    })
    
    // Strip HTML tags to simulate text-only browser
    let textOnly = html
      // Remove scripts and styles
      .replace(/<script[^>]*>[\s\S]*?<\/script>/gi, '')
      .replace(/<style[^>]*>[\s\S]*?<\/style>/gi, '')
      .replace(/<noscript[^>]*>[\s\S]*?<\/noscript>/gi, '')
      // Remove comments
      .replace(/<!--[\s\S]*?-->/g, '')
      // Add line breaks for block elements
      .replace(/<\/?(div|p|br|hr|h[1-6]|li|tr|td|th)[^>]*>/gi, '\n')
      // Remove all other HTML tags
      .replace(/<[^>]+>/g, ' ')
      // Decode HTML entities
      .replace(/&nbsp;/g, ' ')
      .replace(/&amp;/g, '&')
      .replace(/&lt;/g, '<')
      .replace(/&gt;/g, '>')
      .replace(/&quot;/g, '"')
      .replace(/&#39;/g, "'")
      // Clean up whitespace
      .replace(/\n\s*\n/g, '\n\n')
      .replace(/[ \t]+/g, ' ')
      .trim()
    
    // Extract paragraphs (text blocks)
    const paragraphs = textOnly
      .split('\n\n')
      .filter(p => p.trim().length > 20)
      .slice(0, 15)
      .map(p => p.trim())
    
    // Word count and reading time
    const words = textOnly.split(/\s+/).filter(w => w.length > 0)
    const wordCount = words.length
    const readingTime = Math.ceil(wordCount / 200) // Average reading speed: 200 words/minute
    
    // SEO Analysis
    const seoAnalysis = {
      titleLength: title.length,
      titleOptimal: title.length >= 30 && title.length <= 60,
      descriptionLength: metaDescription.length,
      descriptionOptimal: metaDescription.length >= 120 && metaDescription.length <= 160,
      h1Count: headings.h1.length,
      h1Optimal: headings.h1.length === 1,
      wordCount,
      wordCountOptimal: wordCount >= 300,
      imageCount: images.length,
      imagesWithoutAlt: images.filter(img => img.alt === '[No alt text]').length,
      linkCount: links.length,
      readability: wordCount > 0 ? 'Readable' : 'No content'
    }
    
    // Accessibility issues
    const accessibilityIssues: string[] = []
    if (headings.h1.length === 0) {
      accessibilityIssues.push('No H1 heading found - important for screen readers')
    } else if (headings.h1.length > 1) {
      accessibilityIssues.push(`Multiple H1 headings found (${headings.h1.length}) - should have only one`)
    }
    if (seoAnalysis.imagesWithoutAlt > 0) {
      accessibilityIssues.push(`${seoAnalysis.imagesWithoutAlt} images missing alt text`)
    }
    if (wordCount < 200) {
      accessibilityIssues.push('Low content volume - may not provide enough context')
    }
    
    return {
      url,
      
      // Page metadata
      metadata: {
        title,
        titleLength: title.length,
        metaDescription,
        descriptionLength: metaDescription.length
      },
      
      // Content structure
      structure: {
        headings,
        headingCount: {
          h1: headings.h1.length,
          h2: headings.h2.length,
          h3: headings.h3.length,
          total: headings.h1.length + headings.h2.length + headings.h3.length
        }
      },
      
      // Text content
      textContent: {
        full: textOnly.substring(0, 5000),
        paragraphs,
        wordCount,
        characterCount: textOnly.length,
        readingTime: `${readingTime} min${readingTime > 1 ? 's' : ''}`,
        truncated: textOnly.length > 5000
      },
      
      // Links
      links: {
        count: links.length,
        sample: links,
        note: links.length > 30 ? `Showing first 30 of ${linkMatches.length} links` : `All ${links.length} links shown`
      },
      
      // Images
      images: {
        count: images.length,
        withAlt: images.filter(img => img.alt !== '[No alt text]').length,
        withoutAlt: seoAnalysis.imagesWithoutAlt,
        sample: images,
        note: images.length > 20 ? `Showing first 20 of ${imgMatches.length} images` : `All ${images.length} images shown`
      },
      
      // SEO Analysis
      seoAnalysis,
      
      // Accessibility
      accessibility: {
        issues: accessibilityIssues.length > 0 ? accessibilityIssues : ['No major issues detected'],
        score: accessibilityIssues.length === 0 ? 'Good' : accessibilityIssues.length <= 2 ? 'Fair' : 'Poor'
      },
      
      // Recommendations
      recommendations: [
        !seoAnalysis.titleOptimal ? `📝 Title length is ${title.length} chars - optimal is 30-60 characters` : null,
        !seoAnalysis.descriptionOptimal ? `📝 Meta description is ${metaDescription.length} chars - optimal is 120-160 characters` : null,
        !seoAnalysis.h1Optimal ? `📋 ${headings.h1.length === 0 ? 'Add an H1 heading' : 'Use only one H1 heading'}` : null,
        !seoAnalysis.wordCountOptimal ? `📄 Content is ${wordCount} words - aim for at least 300 words` : null,
        seoAnalysis.imagesWithoutAlt > 0 ? `🖼️ Add alt text to ${seoAnalysis.imagesWithoutAlt} images for accessibility` : null,
        'This is how search engines and screen readers interpret your page',
        'Ensure your content is meaningful without CSS/JavaScript'
      ].filter(Boolean),
      
      status: '✓ Text-only view generated',
      note: 'This simulates how search engines, screen readers, and text-only browsers (like Lynx) see your page',
      message: `Page contains ${wordCount} words, ${headings.h1.length + headings.h2.length + headings.h3.length} headings, ${links.length} links, and ${images.length} images`
    }
  } catch (error: any) {
    throw new Error(`Lynx viewer failed: ${error.message}`)
  }
}

// Moz Domain Authority Checker
async function checkMozAuthority(url: string) {
  const domain = url.replace(/^https?:\/\//, '').split('/')[0]
  
  try {
    // Fetch HTML and headers for comprehensive analysis
    const [html, response] = await Promise.all([
      fetchHTML(url),
      fetchHead(url.startsWith('http') ? url : `https://${url}`)
    ])
    
    // Analyze backlink indicators
    const externalLinks = (html.match(/<a[^>]*href=["']https?:\/\/[^"']+["']/gi) || []).length
    const internalLinks = (html.match(/<a[^>]*href=["'][^"']*["']/gi) || []).length - externalLinks
    
    // Analyze content quality indicators
    const wordCount = html.replace(/<[^>]+>/g, ' ').split(/\s+/).filter(w => w.length > 2).length
    const headings = {
      h1: (html.match(/<h1[^>]*>/gi) || []).length,
      h2: (html.match(/<h2[^>]*>/gi) || []).length,
      h3: (html.match(/<h3[^>]*>/gi) || []).length
    }
    
    // Analyze technical SEO factors
    const hasSSL = url.startsWith('https')
    const hasSitemap = html.includes('sitemap') || html.includes('Sitemap')
    const hasRobots = html.includes('robots')
    const hasSchema = html.includes('schema.org') || html.includes('application/ld+json')
    const hasOG = html.includes('og:')
    const hasTwitterCard = html.includes('twitter:card')
    
    // Check for social signals
    const socialLinks = {
      facebook: html.includes('facebook.com'),
      twitter: html.includes('twitter.com') || html.includes('x.com'),
      linkedin: html.includes('linkedin.com'),
      instagram: html.includes('instagram.com'),
      youtube: html.includes('youtube.com')
    }
    const socialCount = Object.values(socialLinks).filter(Boolean).length
    
    // Analyze page speed indicators
    const imageCount = (html.match(/<img[^>]*>/gi) || []).length
    const scriptCount = (html.match(/<script[^>]*>/gi) || []).length
    const styleCount = (html.match(/<link[^>]*rel=["']stylesheet["']/gi) || []).length
    
    // Check mobile optimization
    const hasMobileViewport = html.includes('viewport')
    const hasResponsiveImages = html.includes('srcset') || html.includes('picture')
    
    // Analyze domain age indicators (from headers)
    const serverDate = response.headers.get('date')
    const lastModified = response.headers.get('last-modified')
    const server = response.headers.get('server') || 'Not disclosed'
    
    // Calculate estimated metrics (0-100 scale)
    // Note: These are estimates based on observable factors, not actual Moz API data
    let domainScore = 50 // Base score
    
    // Adjust based on factors
    if (hasSSL) domainScore += 5
    if (hasSchema) domainScore += 5
    if (hasSitemap) domainScore += 3
    if (hasOG && hasTwitterCard) domainScore += 4
    if (socialCount >= 3) domainScore += 5
    if (wordCount > 500) domainScore += 3
    if (wordCount > 1500) domainScore += 4
    if (internalLinks > 10) domainScore += 3
    if (externalLinks > 5 && externalLinks < 50) domainScore += 3
    if (headings.h1 === 1) domainScore += 2
    if (hasMobileViewport) domainScore += 3
    if (imageCount > 0 && imageCount < 30) domainScore += 2
    
    // Penalties
    if (scriptCount > 20) domainScore -= 3
    if (imageCount > 50) domainScore -= 2
    if (!hasSSL) domainScore -= 10
    
    domainScore = Math.max(1, Math.min(100, domainScore))
    
    // Estimate spam score (inverse of quality indicators)
    let spamScore = 50
    if (externalLinks > 100) spamScore += 15
    if (wordCount < 200) spamScore += 10
    if (!hasSchema) spamScore += 5
    if (headings.h1 === 0 || headings.h1 > 3) spamScore += 5
    if (!hasMobileViewport) spamScore += 10
    spamScore = Math.max(0, Math.min(100, spamScore))
    
    return {
      domain,
      status: '✓ Domain analysis complete',
      
      // Estimated metrics (not from actual Moz API)
      estimatedMetrics: {
        domainAuthority: Math.round(domainScore),
        pageAuthority: Math.round(domainScore * 0.9),
        spamScore: Math.round(spamScore),
        note: 'These are estimated metrics based on observable factors. For official Moz DA/PA, use Moz API.'
      },
      
      // Link profile
      linkProfile: {
        internalLinks,
        externalLinks,
        totalLinks: internalLinks + externalLinks,
        linkRatio: internalLinks > 0 ? (externalLinks / internalLinks).toFixed(2) : 'N/A'
      },
      
      // Content analysis
      contentMetrics: {
        wordCount,
        headings,
        imageCount,
        hasQualityContent: wordCount > 500,
        contentScore: wordCount > 1500 ? 'Excellent' : wordCount > 800 ? 'Good' : wordCount > 300 ? 'Fair' : 'Poor'
      },
      
      // Technical SEO
      technicalSEO: {
        hasSSL,
        hasSitemap,
        hasRobots,
        hasSchema,
        hasStructuredData: hasSchema,
        hasMobileViewport,
        hasResponsiveImages,
        score: [hasSSL, hasSitemap, hasSchema, hasMobileViewport].filter(Boolean).length
      },
      
      // Social signals
      socialPresence: {
        platforms: socialLinks,
        totalPlatforms: socialCount,
        score: socialCount >= 3 ? 'Good' : socialCount >= 1 ? 'Fair' : 'Poor'
      },
      
      // Performance indicators
      performanceIndicators: {
        scriptCount,
        styleCount,
        imageCount,
        estimatedPageSize: `${Math.round(html.length / 1024)} KB`,
        optimization: scriptCount < 10 && imageCount < 30 ? 'Good' : 'Needs improvement'
      },
      
      // Server info
      serverInfo: {
        server,
        lastModified: lastModified || 'Not available',
        isAccessible: response.ok,
        responseCode: response.status
      },
      
      // SEO score breakdown
      seoScore: {
        overall: Math.round((domainScore + (100 - spamScore)) / 2),
        technical: [hasSSL, hasSitemap, hasSchema, hasMobileViewport].filter(Boolean).length * 25,
        content: wordCount > 1500 ? 100 : Math.round((wordCount / 1500) * 100),
        social: socialCount * 20
      },
      
      recommendations: [
        !hasSSL ? '🔒 Enable HTTPS/SSL certificate' : null,
        !hasSchema ? '📊 Add structured data (Schema.org)' : null,
        wordCount < 500 ? '📝 Increase content length (aim for 1000+ words)' : null,
        socialCount < 2 ? '📱 Add social media links' : null,
        !hasMobileViewport ? '📱 Add mobile viewport meta tag' : null,
        externalLinks > 50 ? '⚠️ Reduce number of external links' : null,
        scriptCount > 15 ? '⚡ Optimize JavaScript files' : null,
        imageCount > 40 ? '🖼️ Optimize images and consider lazy loading' : null,
        '💡 For official Moz metrics, visit moz.com/domain-analysis'
      ].filter(Boolean),
      
      message: `Estimated Domain Authority: ${Math.round(domainScore)}/100`,
      apiNote: 'Note: These metrics are estimates. For accurate Moz DA/PA scores, use the official Moz API with authentication.'
    }
  } catch (error: any) {
    throw new Error('Failed to analyze domain: ' + error.message)
  }
}

// HSTS Test
async function testHSTS(url: string) {
  try {
    const response = await fetchHead(url.startsWith('http') ? url : `https://${url}`)
    
    // Get HSTS header
    const hstsHeader = response.headers.get('strict-transport-security')
    const hasHSTS = !!hstsHeader
    
    // Parse HSTS directives
    let maxAge = 0
    let includesSubDomains = false
    let preload = false
    
    if (hstsHeader) {
      const maxAgeMatch = hstsHeader.match(/max-age=(\d+)/)
      if (maxAgeMatch) maxAge = parseInt(maxAgeMatch[1])
      includesSubDomains = hstsHeader.toLowerCase().includes('includesubdomains')
      preload = hstsHeader.toLowerCase().includes('preload')
    }
    
    // Calculate max-age in different units
    const maxAgeDays = Math.floor(maxAge / 86400)
    const maxAgeMonths = Math.floor(maxAgeDays / 30)
    const maxAgeYears = Math.floor(maxAgeDays / 365)
    
    // Check other security headers
    const securityHeaders = {
      hsts: hstsHeader || 'Not present',
      xFrameOptions: response.headers.get('x-frame-options') || 'Not present',
      xContentTypeOptions: response.headers.get('x-content-type-options') || 'Not present',
      xXssProtection: response.headers.get('x-xss-protection') || 'Not present',
      contentSecurityPolicy: response.headers.get('content-security-policy') || 'Not present',
      referrerPolicy: response.headers.get('referrer-policy') || 'Not present',
      permissionsPolicy: response.headers.get('permissions-policy') || 'Not present',
      expectCT: response.headers.get('expect-ct') || 'Not present'
    }
    
    // Analyze HSTS configuration
    const hstsScore = hasHSTS ? (
      (maxAge >= 31536000 ? 40 : maxAge >= 15768000 ? 30 : maxAge >= 7884000 ? 20 : 10) +
      (includesSubDomains ? 30 : 0) +
      (preload ? 30 : 0)
    ) : 0
    
    // Calculate overall security score
    let securityScore = hstsScore
    if (securityHeaders.xFrameOptions !== 'Not present') securityScore += 10
    if (securityHeaders.xContentTypeOptions !== 'Not present') securityScore += 10
    if (securityHeaders.contentSecurityPolicy !== 'Not present') securityScore += 15
    if (securityHeaders.referrerPolicy !== 'Not present') securityScore += 5
    
    securityScore = Math.min(100, securityScore)
    
    // Determine grade
    const grade = securityScore >= 90 ? 'A+' : 
                  securityScore >= 80 ? 'A' : 
                  securityScore >= 70 ? 'B' : 
                  securityScore >= 60 ? 'C' : 
                  securityScore >= 50 ? 'D' : 'F'
    
    // Check if site is HTTPS
    const isHTTPS = url.startsWith('https')
    
    // Preload list eligibility
    const preloadEligible = hasHSTS && maxAge >= 31536000 && includesSubDomains && preload && isHTTPS
    
    // Issues and warnings
    const issues: string[] = []
    const warnings: string[] = []
    
    if (!isHTTPS) {
      issues.push('Site is not using HTTPS - HSTS requires HTTPS')
    }
    if (!hasHSTS) {
      issues.push('HSTS header is not present')
    } else {
      if (maxAge < 31536000) {
        warnings.push(`max-age is ${maxAgeDays} days - recommended minimum is 365 days (31536000 seconds)`)
      }
      if (!includesSubDomains) {
        warnings.push('includeSubDomains directive is missing - subdomains are not protected')
      }
      if (!preload) {
        warnings.push('preload directive is missing - site cannot be added to HSTS preload list')
      }
    }
    
    // Check other security headers
    if (securityHeaders.xFrameOptions === 'Not present') {
      warnings.push('X-Frame-Options header is missing - vulnerable to clickjacking')
    }
    if (securityHeaders.contentSecurityPolicy === 'Not present') {
      warnings.push('Content-Security-Policy header is missing - vulnerable to XSS attacks')
    }
    if (securityHeaders.xContentTypeOptions === 'Not present') {
      warnings.push('X-Content-Type-Options header is missing')
    }
    
    return {
      url,
      isHTTPS,
      
      // HSTS Configuration
      hstsConfig: {
        enabled: hasHSTS,
        header: hstsHeader || 'Not present',
        maxAge: {
          seconds: maxAge,
          days: maxAgeDays,
          months: maxAgeMonths,
          years: maxAgeYears,
          formatted: maxAgeYears > 0 ? `${maxAgeYears} year${maxAgeYears > 1 ? 's' : ''}` :
                     maxAgeMonths > 0 ? `${maxAgeMonths} month${maxAgeMonths > 1 ? 's' : ''}` :
                     `${maxAgeDays} day${maxAgeDays > 1 ? 's' : ''}`
        },
        includesSubDomains,
        preload,
        preloadEligible,
        preloadListUrl: 'https://hstspreload.org/'
      },
      
      // Security Score
      securityAnalysis: {
        overallScore: securityScore,
        hstsScore,
        grade,
        status: grade.startsWith('A') ? '✓ Excellent' : 
                grade === 'B' ? '✓ Good' : 
                grade === 'C' ? '⚠ Fair' : 
                '✗ Poor'
      },
      
      // All Security Headers
      securityHeaders,
      
      // Issues and Warnings
      issues: issues.length > 0 ? issues : ['None'],
      warnings: warnings.length > 0 ? warnings : ['None'],
      
      // Recommendations
      recommendations: [
        !isHTTPS ? '🔒 Enable HTTPS first before implementing HSTS' : null,
        !hasHSTS ? '⚡ Add Strict-Transport-Security header to your server configuration' : null,
        hasHSTS && maxAge < 31536000 ? `📅 Increase max-age to at least 31536000 (1 year), currently ${maxAge}` : null,
        hasHSTS && !includesSubDomains ? '🌐 Add includeSubDomains directive to protect all subdomains' : null,
        hasHSTS && !preload ? '📋 Add preload directive and submit to hstspreload.org' : null,
        securityHeaders.contentSecurityPolicy === 'Not present' ? '🛡️ Implement Content-Security-Policy header' : null,
        securityHeaders.xFrameOptions === 'Not present' ? '🖼️ Add X-Frame-Options header (DENY or SAMEORIGIN)' : null,
        securityHeaders.xContentTypeOptions === 'Not present' ? '📄 Add X-Content-Type-Options: nosniff header' : null,
        preloadEligible ? '✅ Your site is eligible for HSTS preload list! Submit at hstspreload.org' : null
      ].filter(Boolean),
      
      // Configuration Examples
      configExamples: {
        nginx: 'add_header Strict-Transport-Security "max-age=31536000; includeSubDomains; preload" always;',
        apache: 'Header always set Strict-Transport-Security "max-age=31536000; includeSubDomains; preload"',
        iis: '<add name="Strict-Transport-Security" value="max-age=31536000; includeSubDomains; preload" />'
      },
      
      status: hasHSTS ? '✓ HSTS is enabled' : '✗ HSTS is not enabled',
      message: hasHSTS 
        ? `HSTS enabled with max-age of ${maxAgeDays} days${includesSubDomains ? ', including subdomains' : ''}${preload ? ', preload ready' : ''}`
        : 'HSTS is not configured on this server'
    }
  } catch (error: any) {
    throw new Error('Failed to test HSTS: ' + error.message)
  }
}

// Screen Capture
// HTTP/2 Test
async function testHTTP2(url: string) {
  try {
    const response = await fetchHead(url.startsWith('http') ? url : `https://${url}`)
    
    // Collect relevant headers
    const server = response.headers.get('server') || 'Not disclosed'
    const altSvc = response.headers.get('alt-svc') || 'Not present'
    const via = response.headers.get('via') || 'Not present'
    const cfRay = response.headers.get('cf-ray')
    
    // Check for HTTP/2 indicators
    const hasHTTP2Indicators = server.toLowerCase().includes('h2') || 
                               altSvc.includes('h2') ||
                               altSvc.includes('h3')
    
    // Check for HTTP/3 support
    const hasHTTP3Indicators = altSvc.includes('h3')
    
    // Parse alt-svc header for protocol details
    const protocols: string[] = []
    if (altSvc !== 'Not present') {
      const h3Match = altSvc.match(/h3="[^"]*"/)
      const h2Match = altSvc.match(/h2="[^"]*"/)
      if (h3Match) protocols.push('HTTP/3 (QUIC)')
      if (h2Match) protocols.push('HTTP/2')
    }
    
    // Check TLS version (if available in headers)
    const tlsVersion = response.headers.get('x-tls-version') || 'Not disclosed'
    
    // Analyze server capabilities
    const serverCapabilities: string[] = []
    if (hasHTTP3Indicators) serverCapabilities.push('HTTP/3 (QUIC)')
    if (hasHTTP2Indicators) serverCapabilities.push('HTTP/2')
    if (cfRay) serverCapabilities.push('Cloudflare CDN')
    if (via !== 'Not present') serverCapabilities.push('Proxy/CDN')
    
    // Performance benefits analysis
    const http2Benefits = [
      'Multiplexing - Multiple requests over single connection',
      'Header compression - Reduced overhead',
      'Server push - Proactive resource delivery',
      'Binary protocol - More efficient parsing',
      'Stream prioritization - Better resource loading'
    ]
    
    const http3Benefits = [
      'QUIC protocol - Faster connection establishment',
      'Improved packet loss recovery',
      'Connection migration - Seamless network switching',
      'Reduced latency - 0-RTT connection resumption',
      'Better mobile performance'
    ]
    
    // Check if HTTPS is enabled (required for HTTP/2)
    const isHTTPS = url.startsWith('https')
    
    // Determine support level
    let supportLevel = 'Unknown'
    let confidence = 'Low'
    
    if (hasHTTP3Indicators) {
      supportLevel = 'HTTP/3 (QUIC)'
      confidence = 'High'
    } else if (hasHTTP2Indicators) {
      supportLevel = 'HTTP/2'
      confidence = 'Medium'
    } else if (isHTTPS) {
      supportLevel = 'Possibly HTTP/2'
      confidence = 'Low'
    } else {
      supportLevel = 'HTTP/1.1 or lower'
      confidence = 'Medium'
    }
    
    // Calculate performance score
    let performanceScore = 50 // Base score
    if (hasHTTP3Indicators) performanceScore += 40
    else if (hasHTTP2Indicators) performanceScore += 30
    if (isHTTPS) performanceScore += 10
    if (cfRay) performanceScore += 10 // CDN bonus
    if (!isHTTPS) performanceScore -= 20
    
    performanceScore = Math.max(0, Math.min(100, performanceScore))
    
    // Grade
    const grade = performanceScore >= 90 ? 'A+' :
                  performanceScore >= 80 ? 'A' :
                  performanceScore >= 70 ? 'B' :
                  performanceScore >= 60 ? 'C' :
                  performanceScore >= 50 ? 'D' : 'F'
    
    return {
      url,
      isHTTPS,
      
      // Protocol Support
      protocolSupport: {
        detected: supportLevel,
        confidence,
        http2: hasHTTP2Indicators ? 'Supported' : 'Unknown',
        http3: hasHTTP3Indicators ? 'Supported' : 'Not detected',
        protocols: protocols.length > 0 ? protocols : ['HTTP/1.1 (likely)']
      },
      
      // Server Information
      serverInfo: {
        server,
        altSvc,
        via,
        cloudflare: !!cfRay,
        tlsVersion
      },
      
      // Performance Analysis
      performance: {
        score: performanceScore,
        grade,
        status: grade.startsWith('A') ? '✓ Excellent' : 
                grade === 'B' ? '✓ Good' : 
                grade === 'C' ? '⚠ Fair' : 
                '✗ Poor'
      },
      
      // Benefits
      benefits: {
        http2: hasHTTP2Indicators ? http2Benefits : ['Not available - HTTP/2 not detected'],
        http3: hasHTTP3Indicators ? http3Benefits : ['Not available - HTTP/3 not detected']
      },
      
      // Recommendations
      recommendations: [
        !isHTTPS ? '🔒 Enable HTTPS first - HTTP/2 requires HTTPS' : null,
        !hasHTTP2Indicators && isHTTPS ? '⚡ Enable HTTP/2 on your server for better performance' : null,
        hasHTTP2Indicators && !hasHTTP3Indicators ? '🚀 Consider enabling HTTP/3 (QUIC) for even better performance' : null,
        !cfRay && isHTTPS ? '🌐 Consider using a CDN like Cloudflare for automatic HTTP/2 and HTTP/3 support' : null,
        'Use browser DevTools (Network tab > Protocol column) for definitive protocol verification',
        hasHTTP3Indicators ? '✅ Excellent! Your server supports the latest HTTP/3 protocol' : null,
        hasHTTP2Indicators ? '✅ Good! Your server supports HTTP/2' : null
      ].filter(Boolean),
      
      // Configuration Help
      serverConfig: {
        nginx: {
          http2: 'listen 443 ssl http2;',
          http3: 'listen 443 quic reuseport; add_header Alt-Svc \'h3=":443"; ma=86400\';'
        },
        apache: {
          http2: 'Protocols h2 h2c http/1.1',
          note: 'Requires mod_http2 module'
        },
        cloudflare: 'HTTP/2 and HTTP/3 are automatically enabled for all sites'
      },
      
      // Testing Information
      testingInfo: {
        method: 'Server header and Alt-Svc analysis',
        limitation: 'Node.js fetch API does not expose HTTP protocol version directly',
        accurateTesting: [
          'Use browser DevTools > Network tab > Protocol column',
          'Use online tools like tools.keycdn.com/http2-test',
          'Use curl with -I --http2 flags',
          'Check Alt-Svc header for h2/h3 support'
        ]
      },
      
      status: '✓ Protocol analysis complete',
      message: hasHTTP3Indicators ? 'Server supports HTTP/3 (QUIC) - Excellent!' :
               hasHTTP2Indicators ? 'Server likely supports HTTP/2' :
               isHTTPS ? 'HTTPS enabled, but HTTP/2 support unclear' :
               'HTTP/2 requires HTTPS - please enable HTTPS first',
      note: 'For 100% accurate HTTP/2 detection, use browser DevTools or specialized testing tools'
    }
  } catch (error: any) {
    throw new Error('Failed to test HTTP/2: ' + error.message)
  }
}
