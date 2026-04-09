// REPLACEMENT for performWebAnalysis function (lines ~454-540)
// This version does CLIENT-SIDE analysis using CapacitorHttp

const performWebAnalysis = async (url: string, tool: WebToolView) => {
  const cleanUrl = url.startsWith('http') ? url : `https://${url}`
  
  try {
    const CapacitorHttp = (window as any).Capacitor?.Plugins?.CapacitorHttp
    
    if (!CapacitorHttp && !isCapacitor) {
      return { 
        success: false, 
        error: 'This feature requires the ThirdEye Android app.' 
      }
    }

    // Special case: domain-checker uses DNS API
    if (tool === 'domain-checker') {
      try {
        const domain = cleanUrl.replace(/^https?:\/\//, '').split('/')[0]
        const dnsUrl = `https://dns.google/resolve?name=${domain}&type=A`
        
        let dnsData: any
        if (CapacitorHttp) {
          const resp = await CapacitorHttp.get({ url: dnsUrl, connectTimeout: 10000, readTimeout: 10000 })
          dnsData = typeof resp.data === 'string' ? JSON.parse(resp.data) : resp.data
        } else {
          const resp = await fetch(dnsUrl)
          dnsData = await resp.json()
        }
        
        const ipAddresses = dnsData.Answer?.map((a: any) => a.data) || []
        return {
          success: true,
          data: {
            domain,
            isRegistered: dnsData.Status === 0,
            ipAddresses,
            dnsRecords: dnsData.Answer || [],
            nameservers: []
          }
        }
      } catch (error: any) {
        return { success: false, error: `DNS lookup failed: ${error.message}` }
      }
    }

    // Special case: robots-checker fetches robots.txt
    if (tool === 'robots-checker') {
      try {
        const baseUrl = new URL(cleanUrl).origin
        const robotsUrl = `${baseUrl}/robots.txt`
        
        let robotsContent = ''
        let exists = false
        
        if (CapacitorHttp) {
          const resp = await CapacitorHttp.get({ url: robotsUrl, connectTimeout: 10000, readTimeout: 10000 })
          robotsContent = typeof resp.data === 'string' ? resp.data : ''
          exists = resp.status === 200
        } else {
          const resp = await fetch(robotsUrl)
          robotsContent = await resp.text()
          exists = resp.ok
        }
        
        const lines = robotsContent.split('\n')
        const userAgents: string[] = []
        const disallowedPaths: string[] = []
        const allowedPaths: string[] = []
        const sitemaps: string[] = []
        let crawlDelay: number | null = null
        
        lines.forEach(line => {
          const trimmed = line.trim()
          if (trimmed.startsWith('User-agent:')) userAgents.push(trimmed.substring(11).trim())
          if (trimmed.startsWith('Disallow:')) disallowedPaths.push(trimmed.substring(9).trim())
          if (trimmed.startsWith('Allow:')) allowedPaths.push(trimmed.substring(6).trim())
          if (trimmed.startsWith('Sitemap:')) sitemaps.push(trimmed.substring(8).trim())
          if (trimmed.startsWith('Crawl-delay:')) crawlDelay = parseInt(trimmed.substring(12).trim())
        })
        
        return {
          success: true,
          data: {
            hasRobots: exists,
            content: robotsContent.substring(0, 2000),
            userAgents,
            disallowedPaths,
            allowedPaths,
            sitemaps,
            crawlDelay
          }
        }
      } catch (error: any) {
        return { success: false, error: `Robots.txt fetch failed: ${error.message}` }
      }
    }

    // For all other tools: fetch HTML and headers
    let html = ''
    let headers: Record<string, string> = {}
    let statusCode = 0
    let responseUrl = cleanUrl
    let responseTime = 0
    
    const startTime = Date.now()
    
    if (CapacitorHttp) {
      const resp = await CapacitorHttp.get({
        url: cleanUrl,
        headers: { 'User-Agent': 'ThirdEye/1.0' },
        connectTimeout: 15000,
        readTimeout: 15000
      })
      html = typeof resp.data === 'string' ? resp.data : JSON.stringify(resp.data)
      headers = resp.headers || {}
      statusCode = resp.status
      responseUrl = resp.url || cleanUrl
    } else {
      const resp = await fetch(cleanUrl)
      html = await resp.text()
      resp.headers.forEach((value, key) => { headers[key] = value })
      statusCode = resp.status
      responseUrl = resp.url
    }
    
    responseTime = Date.now() - startTime
    
    // Run client-side analysis
    const analysisResult = await runClientAnalysis(
      tool, 
      html, 
      headers, 
      cleanUrl, 
      statusCode, 
      responseUrl, 
      responseTime
    )
    
    return { success: true, data: analysisResult }
  } catch (error: any) {
    return { 
      success: false, 
      error: `Analysis failed: ${error?.message || 'Could not connect to website'}` 
    }
  }
}
