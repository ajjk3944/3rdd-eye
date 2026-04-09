#!/usr/bin/env python3
"""
Script to fix WebTools.tsx by replacing the performWebAnalysis function
and adding all missing analysis implementations.
"""

import re

# Read the original file
with open('src/components/WebTools.tsx', 'r', encoding='utf-8') as f:
    content = f.read()

# Find and replace the performWebAnalysis function
# This is a complex multi-line replacement, so we'll use regex

old_perform_analysis = r'  // Perform web analysis using native capabilities or client-side methods\s+const performWebAnalysis = async \(url: string, tool: WebToolView\) => \{[\s\S]*?^\  \}'

new_perform_analysis = '''  // Perform web analysis using native capabilities or client-side methods
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

      // Tools that only need headers (HEAD request)
      const headOnlyTools = ['server-os', 'is-it-down', 'ssl-lookup']
      
      let html = ''
      let headers: Record<string, string> = {}
      let statusCode = 0
      let responseUrl = cleanUrl
      let responseTime = 0
      
      const startTime = Date.now()
      
      if (headOnlyTools.includes(tool)) {
        // GET request but only use headers
        if (CapacitorHttp) {
          const resp = await CapacitorHttp.get({
            url: cleanUrl,
            headers: { 'User-Agent': 'ThirdEye/1.0' },
            connectTimeout: 15000,
            readTimeout: 15000
          })
          headers = resp.headers || {}
          statusCode = resp.status
          responseUrl = resp.url || cleanUrl
          html = typeof resp.data === 'string' ? resp.data : ''
        } else {
          const resp = await fetch(cleanUrl)
          resp.headers.forEach((value, key) => { headers[key] = value })
          statusCode = resp.status
          responseUrl = resp.url
          html = await resp.text()
        }
      } else {
        // GET request for tools that need HTML
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
  }'''

# Replace the function
content_new = re.sub(old_perform_analysis, new_perform_analysis, content, flags=re.MULTILINE)

# Write the result
with open('src/components/WebTools_FIXED.tsx', 'w', encoding='utf-8') as f:
    f.write(content_new)

print("Fixed file created: src/components/WebTools_FIXED.tsx")
print("Please review the changes before replacing the original file.")
