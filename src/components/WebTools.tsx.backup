'use client'

import { useState, useEffect } from 'react'
import { Card, CardContent } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Input } from '@/components/ui/input'
import { ScrollArea } from '@/components/ui/scroll-area'
import {
  ArrowLeft,
  Search,
  Shield,
  Link,
  FileCode,
  Lock,
  Globe,
  BarChart,
  Eye,
  Code,
  ShoppingBag,
  Server,
  Shuffle,
  CheckCircle,
  ExternalLink,
  RefreshCw,
  Copy,
  Check,
  Star,
} from 'lucide-react'
import { useI18n } from '@/lib/i18n'
import { isCapacitor } from '@/lib/native-plugins'
import { toast } from 'sonner'
import { recordRecentTool, toggleFavorite, isFavorited } from '@/lib/tool-registry'

type WebToolView = 
  | 'main'
  | 'seo-browser'
  | 'wp-security'
  | 'https-checker'
  | 'hyperlink-analyzer'
  | 'robots-checker'
  | 'extract-links'
  | 'ga-gtm-checker'
  | 'meta-tags'
  | 'moz-authority'
  | 'ssl-lookup'
  | 'is-it-down'
  | 'url-redirect'
  | 'html-viewer'
  | 'url-encode'
  | 'shopify-detector'
  | 'is-wordpress'
  | 'wp-theme-detector'
  | 'domain-checker'
  | 'server-os'
  | 'hsts-test'
  | 'lynx-viewer'
  | 'http2-test'
  | 'user-agent'

interface WebToolsProps {
  onBack?: () => void
}

export default function WebTools({ onBack }: WebToolsProps) {
  const { t } = useI18n()
  const [currentView, setCurrentView] = useState<WebToolView>('main')
  const [inputUrl, setInputUrl] = useState('')
  const [loading, setLoading] = useState(false)
  const [result, setResult] = useState<any>(null)
  const [copied, setCopied] = useState(false)
  const [showAllItems, setShowAllItems] = useState<Record<string, boolean>>({})
  const [favorites, setFavorites] = useState<Record<string, boolean>>({})

  // Load favorites on mount
  useEffect(() => {
    const toolIds = [
      'seo-browser', 'is-it-down', 'url-redirect', 'html-viewer', 'url-encode',
      'shopify-detector', 'is-wordpress', 'wp-theme-detector', 'meta-tags', 'ssl-lookup'
    ]
    const favState: Record<string, boolean> = {}
    toolIds.forEach(id => {
      favState[id] = isFavorited(id)
    })
    setFavorites(favState)
  }, [])

  // Clear state when view changes
  useEffect(() => {
    setInputUrl('')
    setResult(null)
    setLoading(false)
  }, [currentView])

  // Handle tool navigation with tracking
  const navigateToTool = (toolId: WebToolView) => {
    if (toolId !== 'main') {
      recordRecentTool(toolId)
    }
    setCurrentView(toolId)
  }

  // Handle favorite toggle
  const handleToggleFavorite = (toolId: string, e: React.MouseEvent) => {
    e.stopPropagation()
    const newState = toggleFavorite(toolId)
    setFavorites(prev => ({ ...prev, [toolId]: newState }))
    if (newState) {
      toast.success('Added to favorites')
    } else {
      toast.success('Removed from favorites')
    }
  }

  const copyToClipboard = (text: string) => {
    navigator.clipboard.writeText(text)
    setCopied(true)
    setTimeout(() => setCopied(false), 2000)
  }

  // Render specific results based on tool type
  const renderSpecificResults = (data: any, toolType: WebToolView) => {
    switch (toolType) {
      case 'wp-security':
        return (
          <div className="space-y-3">
            {data.securityScore !== undefined && (
              <div className="bg-black/30 p-3 rounded border border-gray-700">
                <p className="text-xs text-gray-400 mb-1">Security Score</p>
                <p className="text-2xl font-bold text-white">{data.securityScore}/100</p>
                <p className="text-xs text-gray-400 mt-1">Grade: {data.grade || 'N/A'}</p>
              </div>
            )}
            {data.vulnerabilities && data.vulnerabilities.length > 0 && (
              <div className="space-y-1">
                <p className="text-xs text-red-400 font-medium">⚠️ Vulnerabilities ({data.vulnerabilities.length})</p>
                <div className="bg-red-900/20 p-2 rounded border border-red-900/30 space-y-1">
                  {data.vulnerabilities.map((vuln: string, i: number) => (
                    <p key={i} className="text-xs text-red-300">• {vuln}</p>
                  ))}
                </div>
              </div>
            )}
            {data.warnings && data.warnings.length > 0 && (
              <div className="space-y-1">
                <p className="text-xs text-yellow-400 font-medium">⚠️ Warnings ({data.warnings.length})</p>
                <div className="bg-yellow-900/20 p-2 rounded border border-yellow-900/30 space-y-1">
                  {data.warnings.map((warn: string, i: number) => (
                    <p key={i} className="text-xs text-yellow-300">• {warn}</p>
                  ))}
                </div>
              </div>
            )}
            {data.recommendations && data.recommendations.length > 0 && (
              <div className="space-y-1">
                <p className="text-xs text-blue-400 font-medium">💡 Recommendations</p>
                <div className="bg-blue-900/20 p-2 rounded border border-blue-900/30 space-y-1">
                  {data.recommendations.slice(0, 5).map((rec: string, i: number) => (
                    <p key={i} className="text-xs text-blue-300">• {rec}</p>
                  ))}
                </div>
              </div>
            )}
          </div>
        )

      case 'moz-authority':
        return (
          <div className="space-y-3">
            {data.estimatedMetrics && (
              <div className="grid grid-cols-2 gap-2">
                <div className="bg-black/30 p-3 rounded border border-gray-700">
                  <p className="text-xs text-gray-400 mb-1">Domain Authority</p>
                  <p className="text-2xl font-bold text-cyan-400">{data.estimatedMetrics.domainAuthority || 'N/A'}</p>
                </div>
                <div className="bg-black/30 p-3 rounded border border-gray-700">
                  <p className="text-xs text-gray-400 mb-1">Spam Score</p>
                  <p className="text-2xl font-bold text-red-400">{data.estimatedMetrics.spamScore || 'N/A'}</p>
                </div>
              </div>
            )}
            {data.technicalSEO && (
              <div className="space-y-1">
                <p className="text-xs text-gray-400 font-medium">Technical SEO</p>
                <div className="bg-black/30 p-2 rounded border border-gray-700 space-y-1">
                  <p className="text-xs text-gray-300">✓ SSL: {data.technicalSEO.hasSSL ? 'Yes' : 'No'}</p>
                  <p className="text-xs text-gray-300">✓ Sitemap: {data.technicalSEO.hasSitemap ? 'Yes' : 'No'}</p>
                  <p className="text-xs text-gray-300">✓ Schema: {data.technicalSEO.hasSchema ? 'Yes' : 'No'}</p>
                  <p className="text-xs text-gray-300">✓ Mobile Viewport: {data.technicalSEO.hasMobileViewport ? 'Yes' : 'No'}</p>
                </div>
              </div>
            )}
            {data.recommendations && data.recommendations.length > 0 && (
              <div className="space-y-1">
                <p className="text-xs text-blue-400 font-medium">💡 Recommendations</p>
                <div className="bg-blue-900/20 p-2 rounded border border-blue-900/30 space-y-1">
                  {data.recommendations.slice(0, 5).map((rec: string, i: number) => (
                    <p key={i} className="text-xs text-blue-300">{rec}</p>
                  ))}
                </div>
              </div>
            )}
          </div>
        )

      case 'hsts-test':
        return (
          <div className="space-y-3">
            {data.status && (
              <div className={`p-3 rounded border ${data.hasHSTS ? 'bg-green-900/20 border-green-900/30' : 'bg-red-900/20 border-red-900/30'}`}>
                <p className="text-sm font-medium text-white">{data.status}</p>
              </div>
            )}
            {data.hstsConfig && (
              <div className="space-y-1">
                <p className="text-xs text-gray-400 font-medium">HSTS Configuration</p>
                <div className="bg-black/30 p-2 rounded border border-gray-700 space-y-1">
                  <p className="text-xs text-gray-300">Max Age: {data.hstsConfig.maxAgeDays} days</p>
                  <p className="text-xs text-gray-300">Include Subdomains: {data.hstsConfig.includesSubDomains ? 'Yes' : 'No'}</p>
                  <p className="text-xs text-gray-300">Preload: {data.hstsConfig.preload ? 'Yes' : 'No'}</p>
                </div>
              </div>
            )}
            {data.securityAnalysis && (
              <div className="space-y-1">
                <p className="text-xs text-gray-400 font-medium">Security Analysis</p>
                <div className="bg-black/30 p-3 rounded border border-gray-700">
                  <p className="text-xs text-gray-400 mb-1">Security Score</p>
                  <p className="text-2xl font-bold text-white">{data.securityAnalysis.score}/100</p>
                  <p className="text-xs text-gray-400 mt-1">Grade: {data.securityAnalysis.grade}</p>
                </div>
              </div>
            )}
            {data.recommendations && data.recommendations.length > 0 && (
              <div className="space-y-1">
                <p className="text-xs text-blue-400 font-medium">💡 Recommendations</p>
                <div className="bg-blue-900/20 p-2 rounded border border-blue-900/30 space-y-1">
                  {data.recommendations.map((rec: string, i: number) => (
                    <p key={i} className="text-xs text-blue-300">{rec}</p>
                  ))}
                </div>
              </div>
            )}
          </div>
        )

      case 'http2-test':
        return (
          <div className="space-y-3">
            {data.supportLevel && (
              <div className="bg-black/30 p-3 rounded border border-gray-700">
                <p className="text-xs text-gray-400 mb-1">Protocol Support</p>
                <p className="text-xl font-bold text-white">{data.supportLevel}</p>
                <p className="text-xs text-gray-400 mt-1">Confidence: {data.confidence}</p>
              </div>
            )}
            {data.performanceScore !== undefined && (
              <div className="bg-black/30 p-3 rounded border border-gray-700">
                <p className="text-xs text-gray-400 mb-1">Performance Score</p>
                <p className="text-2xl font-bold text-cyan-400">{data.performanceScore}/100</p>
                <p className="text-xs text-gray-400 mt-1">Grade: {data.grade}</p>
              </div>
            )}
            {data.protocolSupport && (
              <div className="space-y-1">
                <p className="text-xs text-gray-400 font-medium">Supported Protocols</p>
                <div className="bg-black/30 p-2 rounded border border-gray-700 space-y-1">
                  {data.protocolSupport.map((protocol: string, i: number) => (
                    <p key={i} className="text-xs text-green-300">✓ {protocol}</p>
                  ))}
                </div>
              </div>
            )}
            {data.benefits && data.benefits.length > 0 && (
              <div className="space-y-1">
                <p className="text-xs text-blue-400 font-medium">💡 Benefits</p>
                <div className="bg-blue-900/20 p-2 rounded border border-blue-900/30 space-y-1">
                  {data.benefits.slice(0, 5).map((benefit: string, i: number) => (
                    <p key={i} className="text-xs text-blue-300">• {benefit}</p>
                  ))}
                </div>
              </div>
            )}
          </div>
        )

      case 'lynx-viewer':
        return (
          <div className="space-y-3">
            {data.textContent && (
              <div className="space-y-1">
                <p className="text-xs text-gray-400 font-medium">Text Content</p>
                <div className="max-h-64 overflow-y-auto rounded border border-gray-700 bg-black/30 p-3">
                  <pre className="text-xs text-gray-300 whitespace-pre-wrap">{data.textContent}</pre>
                </div>
              </div>
            )}
            {data.headings && (
              <div className="space-y-1">
                <p className="text-xs text-gray-400 font-medium">Headings</p>
                <div className="bg-black/30 p-2 rounded border border-gray-700 space-y-1">
                  {data.headings.h1 && data.headings.h1.length > 0 && (
                    <p className="text-xs text-gray-300">H1: {data.headings.h1.length}</p>
                  )}
                  {data.headings.h2 && data.headings.h2.length > 0 && (
                    <p className="text-xs text-gray-300">H2: {data.headings.h2.length}</p>
                  )}
                  {data.headings.h3 && data.headings.h3.length > 0 && (
                    <p className="text-xs text-gray-300">H3: {data.headings.h3.length}</p>
                  )}
                </div>
              </div>
            )}
            {data.links && data.links.length > 0 && (
              <div className="space-y-1">
                <p className="text-xs text-gray-400 font-medium">Links ({data.links.length})</p>
                <div className="max-h-32 overflow-y-auto rounded border border-gray-700 bg-black/30 p-2 space-y-1">
                  {data.links.slice(0, 10).map((link: string, i: number) => (
                    <p key={i} className="text-xs text-cyan-300 break-all">• {link}</p>
                  ))}
                  {data.links.length > 10 && (
                    <p className="text-xs text-gray-500">... and {data.links.length - 10} more</p>
                  )}
                </div>
              </div>
            )}
            {data.images && data.images.length > 0 && (
              <div className="space-y-1">
                <p className="text-xs text-gray-400 font-medium">Images ({data.images.length})</p>
                <div className="bg-black/30 p-2 rounded border border-gray-700">
                  <p className="text-xs text-gray-300">{data.images.length} images found</p>
                </div>
              </div>
            )}
          </div>
        )

      case 'server-os':
        return (
          <div className="space-y-3">
            {data.serverOS && (
              <div className="bg-black/30 p-3 rounded border border-gray-700">
                <p className="text-xs text-gray-400 mb-1">Server OS</p>
                <p className="text-xl font-bold text-white">{data.serverOS}</p>
              </div>
            )}
            {data.server && (
              <div className="bg-black/30 p-3 rounded border border-gray-700">
                <p className="text-xs text-gray-400 mb-1">Server Software</p>
                <p className="text-sm text-white">{data.server}</p>
              </div>
            )}
            {data.stack && data.stack.length > 0 && (
              <div className="space-y-1">
                <p className="text-xs text-gray-400 font-medium">Technology Stack</p>
                <div className="bg-black/30 p-2 rounded border border-gray-700 space-y-1">
                  {data.stack.map((tech: string, i: number) => (
                    <p key={i} className="text-xs text-cyan-300">• {tech}</p>
                  ))}
                </div>
              </div>
            )}
          </div>
        )

      default:
        return null
    }
  }

  const getButtonText = (view: WebToolView): string => {
    const buttonTexts: Record<WebToolView, string> = {
      'main': 'Analyze',
      'seo-browser': 'Analyze SEO',
      'wp-security': 'Scan Security',
      'https-checker': 'Check HTTPS',
      'hyperlink-analyzer': 'Analyze Links',
      'robots-checker': 'Check Robots',
      'extract-links': 'Extract Links',
      'ga-gtm-checker': 'Check Tracking',
      'meta-tags': 'Analyze Meta Tags',
      'moz-authority': 'Check Authority',
      'ssl-lookup': 'Check SSL',
      'is-it-down': 'Check Status',
      'url-redirect': 'Track Redirects',
      'html-viewer': 'View Source',
      'url-encode': 'Encode/Decode',
      'shopify-detector': 'Detect Shopify',
      'is-wordpress': 'Detect WordPress',
      'wp-theme-detector': 'Detect Theme',
      'domain-checker': 'Check Domain',
      'server-os': 'Detect Server',
      'hsts-test': 'Test HSTS',
      'lynx-viewer': 'View as Text',
      'http2-test': 'Test HTTP/2',
      'user-agent': 'Generate'
    }
    return buttonTexts[view] || 'Analyze'
  }

  const handleAnalyze = async () => {
    if (!inputUrl.trim()) {
      toast.error('Please enter a URL')
      return
    }
    
    setLoading(true)
    setResult(null)
    
    try {
      // Handle different tools with client-side implementations
      switch (currentView) {
        case 'url-encode':
          // URL Encode/Decode is handled separately in its own view
          break
          
        case 'user-agent':
          // User Agent Generator is handled separately in its own view
          break
          
        default:
          // For other tools, check if we're in Capacitor
          if (!isCapacitor) {
            setResult({ 
              success: false, 
              error: 'This feature requires the ThirdEye Android app. Web tools need native HTTP capabilities to bypass CORS restrictions.' 
            })
            toast.error('Install ThirdEye app for full functionality')
          } else {
            // In Capacitor, use native HTTP plugin
            const result = await performWebAnalysis(inputUrl, currentView)
            setResult(result)
            
            if (result.success) {
              toast.success('Analysis complete')
            } else {
              toast.error(result.error || 'Analysis failed')
            }
          }
          break
      }
    } catch (error: any) {
      const errorMessage = error.message || 'Network error. Please check your connection and try again.'
      setResult({ 
        success: false, 
        error: errorMessage
      })
      toast.error(errorMessage)
    } finally {
      setLoading(false)
    }
  }

  // Perform web analysis using native capabilities or client-side methods
  // Perform web analysis using native capabilities or client-side methods
  const performWebAnalysis = async (url: string, tool: WebToolView) => {
    const cleanUrl = url.startsWith('http') ? url : `https://${url}`
    
    try {
      // Map tool view to API tool name
      const toolMapping: Record<string, string> = {
        'seo-browser': 'seo-browser',
        'wp-security': 'wp-security',
        'https-checker': 'https-checker',
        'hyperlink-analyzer': 'hyperlink-analyzer',
        'robots-checker': 'robots-checker',
        'extract-links': 'extract-links',
        'ga-gtm-checker': 'ga-gtm-checker',
        'meta-tags': 'meta-tags',
        'moz-authority': 'moz-authority',
        'ssl-lookup': 'ssl-lookup',
        'is-it-down': 'is-it-down',
        'url-redirect': 'url-redirect',
        'html-viewer': 'html-viewer',
        'is-wordpress': 'is-wordpress',
        'wp-theme-detector': 'wp-theme-detector',
        'shopify-detector': 'shopify-detector',
        'domain-checker': 'domain-checker',
        'server-os': 'server-os',
        'hsts-test': 'hsts-test',
        'lynx-viewer': 'lynx-viewer',
        'http2-test': 'http2-test'
      }
      
      const apiTool = toolMapping[tool]
      
      if (!apiTool) {
        return {
          success: false,
          error: 'Tool not supported'
        }
      }
      
      // Use Capacitor HTTP plugin if available
      const CapacitorHttp = (window as any).Capacitor?.Plugins?.CapacitorHttp
      
      if (CapacitorHttp) {
        // Call the backend API using Capacitor HTTP
        const apiUrl = `${window.location.origin}/api/web-analysis`
        const response = await CapacitorHttp.post({ 
          url: apiUrl,
          headers: {
            'Content-Type': 'application/json'
          },
          data: {
            url: cleanUrl,
            tool: apiTool
          },
          connectTimeout: 30000,
          readTimeout: 30000
        })
        
        if (response.status === 200 && response.data) {
          return response.data
        } else {
          return {
            success: false,
            error: response.data?.error || 'Analysis failed'
          }
        }
      } else {
        // Browser fallback - try to call API directly
        if (!isCapacitor) {
          return {
            success: false,
            error: 'This feature requires the ThirdEye Android app to bypass CORS restrictions and access external websites.'
          }
        }
        
        // Try regular fetch
        try {
          const response = await fetch('/api/web-analysis', {
            method: 'POST',
            headers: {
              'Content-Type': 'application/json'
            },
            body: JSON.stringify({
              url: cleanUrl,
              tool: apiTool
            })
          })
          
          const result = await response.json()
          return result
        } catch (fetchError) {
          return {
            success: false,
            error: 'Unable to connect to analysis service. Please check your internet connection.'
          }
        }
      }
    } catch (error: any) {
      return {
        success: false,
        error: `Analysis failed: ${error?.message || 'Unknown error'}`
      }
    }
  }

  // Analyze HTML content based on the tool type
  const analyzeHtmlContent = (html: string, url: string, tool: WebToolView) => {
    const parser = new DOMParser()
    const doc = parser.parseFromString(html, 'text/html')
    
    switch (tool) {
      case 'seo-browser':
        return analyzeSEO(doc, url, html)
      case 'hyperlink-analyzer':
        return analyzeLinks(doc, url)
      case 'meta-tags':
        return analyzeMetaTags(doc, url)
      case 'extract-links':
        return extractAllLinks(doc, url)
      case 'html-viewer':
        return { success: true, data: { html: html.substring(0, 10000) } }
      case 'is-wordpress':
        return detectWordPress(html, doc)
      case 'shopify-detector':
        return detectShopify(html, doc)
      case 'wp-theme-detector':
        return detectWordPressTheme(html, doc)
      case 'ga-gtm-checker':
        return checkAnalytics(html)
      case 'robots-checker':
        return checkRobots(url)
      case 'ssl-lookup':
        return checkSSL(url)
      case 'is-it-down':
        return checkUptime(url)
      case 'url-redirect':
        return trackRedirects(url)
      default:
        return { success: true, data: { message: 'Analysis completed', url } }
    }
  }

  // SEO Analysis
  const analyzeSEO = (doc: Document, url: string, html: string) => {
    const title = doc.querySelector('title')?.textContent || 'No title found'
    const metaDescription = doc.querySelector('meta[name="description"]')?.getAttribute('content') || 'No meta description'
    const h1Tags = Array.from(doc.querySelectorAll('h1')).map(h1 => h1.textContent)
    const h2Tags = Array.from(doc.querySelectorAll('h2')).map(h2 => h2.textContent)
    const images = Array.from(doc.querySelectorAll('img'))
    const imagesWithoutAlt = images.filter(img => !img.getAttribute('alt')).length
    
    return {
      success: true,
      data: {
        url,
        title,
        titleLength: title.length,
        metaDescription,
        metaDescriptionLength: metaDescription.length,
        h1Count: h1Tags.length,
        h1Tags: h1Tags.slice(0, 5),
        h2Count: h2Tags.length,
        h2Tags: h2Tags.slice(0, 10),
        totalImages: images.length,
        imagesWithoutAlt,
        wordCount: html.replace(/<[^>]*>/g, '').split(/\s+/).length,
        hasCanonical: !!doc.querySelector('link[rel="canonical"]'),
        hasViewport: !!doc.querySelector('meta[name="viewport"]'),
        hasRobots: !!doc.querySelector('meta[name="robots"]')
      }
    }
  }

  // Link Analysis
  const analyzeLinks = (doc: Document, url: string) => {
    const links = Array.from(doc.querySelectorAll('a[href]'))
    const baseUrl = new URL(url).origin
    
    const internalLinks = links.filter(link => {
      const href = link.getAttribute('href')
      return href && (href.startsWith('/') || href.startsWith(baseUrl))
    })
    
    const externalLinks = links.filter(link => {
      const href = link.getAttribute('href')
      return href && href.startsWith('http') && !href.startsWith(baseUrl)
    })
    
    return {
      success: true,
      data: {
        url,
        totalLinks: links.length,
        internalLinks: internalLinks.length,
        externalLinks: externalLinks.length,
        internalLinksList: internalLinks.slice(0, 20).map(link => ({
          href: link.getAttribute('href'),
          text: link.textContent?.trim() || 'No text',
          title: link.getAttribute('title') || ''
        })),
        externalLinksList: externalLinks.slice(0, 20).map(link => ({
          href: link.getAttribute('href'),
          text: link.textContent?.trim() || 'No text',
          title: link.getAttribute('title') || ''
        }))
      }
    }
  }

  // Meta Tags Analysis
  const analyzeMetaTags = (doc: Document, url: string) => {
    const metaTags = Array.from(doc.querySelectorAll('meta'))
    const metaData: any = {}
    
    metaTags.forEach(meta => {
      const name = meta.getAttribute('name') || meta.getAttribute('property') || meta.getAttribute('http-equiv')
      const content = meta.getAttribute('content')
      if (name && content) {
        metaData[name] = content
      }
    })
    
    return {
      success: true,
      data: {
        url,
        metaTags: metaData,
        totalMetaTags: metaTags.length,
        hasDescription: !!metaData.description,
        hasKeywords: !!metaData.keywords,
        hasViewport: !!metaData.viewport,
        hasRobots: !!metaData.robots,
        openGraph: Object.keys(metaData).filter(key => key.startsWith('og:')),
        twitterCard: Object.keys(metaData).filter(key => key.startsWith('twitter:'))
      }
    }
  }

  // Extract All Links
  const extractAllLinks = (doc: Document, url: string) => {
    const links = Array.from(doc.querySelectorAll('a[href]'))
    
    return {
      success: true,
      data: {
        url,
        totalLinks: links.length,
        links: links.map(link => link.getAttribute('href')).filter(Boolean)
      }
    }
  }

  // WordPress Detection
  const detectWordPress = (html: string, doc: Document) => {
    const wpIndicators = [
      '/wp-content/',
      '/wp-includes/',
      'wp-json',
      'wordpress',
      'wp_head',
      'wp-admin'
    ]
    
    const isWordPress = wpIndicators.some(indicator => html.includes(indicator))
    const generator = doc.querySelector('meta[name="generator"]')?.getAttribute('content') || ''
    
    return {
      success: true,
      data: {
        isWordPress,
        confidence: isWordPress ? 'High' : 'Low',
        indicators: wpIndicators.filter(indicator => html.includes(indicator)),
        generator,
        version: generator.match(/WordPress\s+([\d.]+)/)?.[1] || 'Unknown'
      }
    }
  }

  // Shopify Detection
  const detectShopify = (html: string, doc: Document) => {
    const shopifyIndicators = [
      'Shopify.theme',
      'shopify.com',
      'cdn.shopify.com',
      'Shopify.shop',
      'shopify-section'
    ]
    
    const isShopify = shopifyIndicators.some(indicator => html.includes(indicator))
    
    return {
      success: true,
      data: {
        isShopify,
        confidence: isShopify ? 'High' : 'Low',
        indicators: shopifyIndicators.filter(indicator => html.includes(indicator)),
        theme: html.match(/Shopify\.theme\s*=\s*{[^}]*name[^}]*"([^"]+)"/)?.[1] || 'Unknown'
      }
    }
  }

  // WordPress Theme Detection
  const detectWordPressTheme = (html: string, doc: Document) => {
    const themeMatch = html.match(/\/wp-content\/themes\/([^\/\?"]+)/i)
    const themeName = themeMatch ? themeMatch[1] : 'Unknown'
    
    const styleLink = doc.querySelector('link[rel="stylesheet"][href*="/wp-content/themes/"]')
    const themeUrl = styleLink?.getAttribute('href') || ''
    
    return {
      success: true,
      data: {
        theme: themeName,
        themeUrl,
        isWordPress: !!themeMatch,
        confidence: themeMatch ? 'High' : 'Low'
      }
    }
  }

  // Analytics Detection
  const checkAnalytics = (html: string) => {
    const gaMatch = html.match(/gtag\('config',\s*'([^']+)'/i) || html.match(/ga\('create',\s*'([^']+)'/i)
    const gtmMatch = html.match(/GTM-[A-Z0-9]+/i)
    
    return {
      success: true,
      data: {
        hasGA: !!gaMatch,
        hasGTM: !!gtmMatch,
        gaTrackingId: gaMatch?.[1] || 'Not found',
        gtmId: gtmMatch?.[0] || 'Not found'
      }
    }
  }

  // Robots.txt Check
  const checkRobots = async (url: string) => {
    try {
      const robotsUrl = new URL('/robots.txt', url).toString()
      
      // Use CapacitorHttp if available
      const CapacitorHttp = (window as any).Capacitor?.Plugins?.CapacitorHttp
      
      if (CapacitorHttp) {
        const response = await CapacitorHttp.get({ url: robotsUrl })
        const robotsContent = typeof response.data === 'string' ? response.data : JSON.stringify(response.data)
        
        return {
          success: true,
          data: {
            url: robotsUrl,
            exists: response.status === 200,
            content: robotsContent.substring(0, 2000),
            size: robotsContent.length
          }
        }
      } else {
        // Browser fallback
        if (!isCapacitor) {
          return {
            success: false,
            error: 'This feature requires the ThirdEye Android app to bypass CORS restrictions'
          }
        }
        
        const response = await fetch(robotsUrl)
        const robotsContent = await response.text()
        
        return {
          success: true,
          data: {
            url: robotsUrl,
            exists: response.ok,
            content: robotsContent.substring(0, 2000),
            size: robotsContent.length
          }
        }
      }
    } catch (error: any) {
      return {
        success: false,
        error: `Unable to fetch robots.txt: ${error?.message || 'Network error'}`
      }
    }
  }

  // SSL Check
  const checkSSL = (url: string) => {
    const isHttps = url.startsWith('https://')
    
    return {
      success: true,
      data: {
        url,
        isHttps,
        protocol: isHttps ? 'HTTPS' : 'HTTP',
        secure: isHttps,
        message: isHttps ? 'Site uses HTTPS encryption' : 'Site does not use HTTPS encryption'
      }
    }
  }

  // Uptime Check
  const checkUptime = async (url: string) => {
    try {
      const startTime = Date.now()
      
      // Use CapacitorHttp if available
      const CapacitorHttp = (window as any).Capacitor?.Plugins?.CapacitorHttp
      
      if (CapacitorHttp) {
        try {
          const response = await CapacitorHttp.request({
            url,
            method: 'HEAD',
            connectTimeout: 10000,
            readTimeout: 10000
          })
          const responseTime = Date.now() - startTime
          
          return {
            success: true,
            data: {
              url,
              isUp: response.status >= 200 && response.status < 400,
              statusCode: response.status,
              responseTime: `${responseTime}ms`,
              message: response.status >= 200 && response.status < 400 
                ? 'Site is up and running' 
                : `Site returned ${response.status} error`
            }
          }
        } catch (error) {
          const responseTime = Date.now() - startTime
          return {
            success: true,
            data: {
              url,
              isUp: false,
              statusCode: 0,
              responseTime: `${responseTime}ms`,
              message: 'Site is down or unreachable'
            }
          }
        }
      } else {
        // Browser fallback
        if (!isCapacitor) {
          return {
            success: false,
            error: 'This feature requires the ThirdEye Android app to bypass CORS restrictions'
          }
        }
        
        const response = await fetch(url, { method: 'HEAD' })
        const responseTime = Date.now() - startTime
        
        return {
          success: true,
          data: {
            url,
            isUp: response.ok,
            statusCode: response.status,
            responseTime: `${responseTime}ms`,
            message: response.ok ? 'Site is up and running' : `Site returned ${response.status} error`
          }
        }
      }
    } catch (error: any) {
      return {
        success: false,
        error: `Unable to check uptime: ${error?.message || 'Network error'}`
      }
    }
  }

  // Redirect Tracker
  const trackRedirects = async (url: string) => {
    const redirects: any[] = []
    let currentUrl = url
    let redirectCount = 0
    const maxRedirects = 10
    
    try {
      // Use CapacitorHttp if available
      const CapacitorHttp = (window as any).Capacitor?.Plugins?.CapacitorHttp
      
      if (CapacitorHttp) {
        while (redirectCount < maxRedirects) {
          const response = await CapacitorHttp.request({
            url: currentUrl,
            method: 'GET',
            disableRedirects: true
          })
          
          redirects.push({
            url: currentUrl,
            statusCode: response.status,
            statusText: response.status >= 300 && response.status < 400 ? 'Redirect' : 'OK'
          })
          
          if (response.status >= 300 && response.status < 400) {
            const location = response.headers?.location || response.headers?.Location
            if (location) {
              currentUrl = new URL(location, currentUrl).toString()
              redirectCount++
            } else {
              break
            }
          } else {
            break
          }
        }
        
        return {
          success: true,
          data: {
            originalUrl: url,
            finalUrl: currentUrl,
            redirectCount,
            redirects
          }
        }
      } else {
        // Browser fallback
        if (!isCapacitor) {
          return {
            success: false,
            error: 'This feature requires the ThirdEye Android app to track redirects properly'
          }
        }
        
        while (redirectCount < maxRedirects) {
          const response = await fetch(currentUrl, { redirect: 'manual' })
          
          redirects.push({
            url: currentUrl,
            statusCode: response.status,
            statusText: response.statusText
          })
          
          if (response.status >= 300 && response.status < 400) {
            const location = response.headers.get('location')
            if (location) {
              currentUrl = new URL(location, currentUrl).toString()
              redirectCount++
            } else {
              break
            }
          } else {
            break
          }
        }
        
        return {
          success: true,
          data: {
            originalUrl: url,
            finalUrl: currentUrl,
            redirectCount,
            redirects
          }
        }
      }
    } catch (error: any) {
      return {
        success: false,
        error: `Unable to track redirects: ${error?.message || 'Network error'}`
      }
    }
  }

  // Main view with all tools
  if (currentView === 'main') {
    return (
      <div className="space-y-4">
        {/* Sticky Back Button */}
        {onBack && (
          <div className="sticky top-0 z-10 bg-[#0d120d] border-b border-cyan-900/30 pb-4 mb-4">
            <Button 
              variant="ghost" 
              size="sm" 
              onClick={onBack}
              className="text-gray-400 hover:text-white"
            >
              <ArrowLeft className="w-4 h-4 mr-2" />
              Back
            </Button>
          </div>
        )}

        <div>
          <h2 className="text-xl font-bold text-white flex items-center gap-2">
            <Globe className="w-5 h-5 text-blue-400" />
            Web Tools
          </h2>
          <p className="text-xs text-gray-500 mt-1">
            Comprehensive web analysis and SEO utilities
          </p>
        </div>

        <ScrollArea className="h-[calc(100vh-200px)]">
          <div className="grid grid-cols-2 gap-3 pr-4">

            {/* SEO Browser */}
            <Card 
              className="bg-[#0d120d] border-blue-900/30 cursor-pointer hover:border-blue-500/50 transition-all relative"
              onClick={() => navigateToTool('seo-browser')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-blue-500/20 flex items-center justify-center">
                    <Search className="w-6 h-6 text-blue-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">SEO Browser</p>
                    <p className="text-xs text-gray-500">Crawl analyzer</p>
                  </div>
                </div>
              </CardContent>
              <Button
                variant="ghost"
                size="sm"
                className="absolute top-2 right-2 p-1 h-auto"
                onClick={(e) => handleToggleFavorite('seo-browser', e)}
              >
                <Star 
                  className={`w-4 h-4 ${favorites['seo-browser'] ? 'text-amber-400 fill-amber-400' : 'text-gray-500'}`} 
                />
              </Button>
            </Card>

            {/* WordPress Security Scanner */}
            <Card 
              className="bg-[#0d120d] border-red-900/30 cursor-pointer hover:border-red-500/50 transition-all relative"
              onClick={() => navigateToTool('wp-security')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-red-500/20 flex items-center justify-center">
                    <Shield className="w-6 h-6 text-red-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">WP Security</p>
                    <p className="text-xs text-gray-500">WordPress scan</p>
                  </div>
                </div>
              </CardContent>
            </Card>

            {/* HTTPS Checker */}
            <Card 
              className="bg-[#0d120d] border-green-900/30 cursor-pointer hover:border-green-500/50 transition-all relative"
              onClick={() => navigateToTool('https-checker')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-green-500/20 flex items-center justify-center">
                    <Lock className="w-6 h-6 text-green-400" />
                  </div>
                  <div>
                  <p className="text-sm font-medium text-white">{t('tools.httpsChecker')}</p>
                  <p className="text-xs text-gray-500">{t('tools.securityCheck')}</p>
                  </div>
                </div>
              </CardContent>
            </Card>

            {/* Hyperlink Analyzer */}
            <Card 
              className="bg-[#0d120d] border-purple-900/30 cursor-pointer hover:border-purple-500/50 transition-all relative"
              onClick={() => navigateToTool('hyperlink-analyzer')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-purple-500/20 flex items-center justify-center">
                    <Link className="w-6 h-6 text-purple-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">Link Analyzer</p>
                    <p className="text-xs text-gray-500">Hyperlink check</p>
                  </div>
                </div>
              </CardContent>
            </Card>

            {/* Robots Exclusion Checker */}
            <Card 
              className="bg-[#0d120d] border-orange-900/30 cursor-pointer hover:border-orange-500/50 transition-all"
              onClick={() => setCurrentView('robots-checker')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-orange-500/20 flex items-center justify-center">
                    <FileCode className="w-6 h-6 text-orange-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">Robots Checker</p>
                    <p className="text-xs text-gray-500">Exclusion test</p>
                  </div>
                </div>
              </CardContent>
            </Card>

            {/* Extract Links */}
            <Card 
              className="bg-[#0d120d] border-cyan-900/30 cursor-pointer hover:border-cyan-500/50 transition-all"
              onClick={() => setCurrentView('extract-links')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-cyan-500/20 flex items-center justify-center">
                    <ExternalLink className="w-6 h-6 text-cyan-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">Extract Links</p>
                    <p className="text-xs text-gray-500">Parse page links</p>
                  </div>
                </div>
              </CardContent>
            </Card>

            {/* GA & GTM Checker */}
            <Card 
              className="bg-[#0d120d] border-yellow-900/30 cursor-pointer hover:border-yellow-500/50 transition-all"
              onClick={() => setCurrentView('ga-gtm-checker')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-yellow-500/20 flex items-center justify-center">
                    <BarChart className="w-6 h-6 text-yellow-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">GA/GTM Check</p>
                    <p className="text-xs text-gray-500">Analytics detect</p>
                  </div>
                </div>
              </CardContent>
            </Card>

            {/* Meta Tags Analyzer */}
            <Card 
              className="bg-[#0d120d] border-pink-900/30 cursor-pointer hover:border-pink-500/50 transition-all relative"
              onClick={() => navigateToTool('meta-tags')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-pink-500/20 flex items-center justify-center">
                    <Code className="w-6 h-6 text-pink-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">Meta Tags</p>
                    <p className="text-xs text-gray-500">SEO analysis</p>
                  </div>
                </div>
              </CardContent>
              <Button
                variant="ghost"
                size="sm"
                className="absolute top-2 right-2 p-1 h-auto"
                onClick={(e) => handleToggleFavorite('meta-tags', e)}
              >
                <Star 
                  className={`w-4 h-4 ${favorites['meta-tags'] ? 'text-amber-400 fill-amber-400' : 'text-gray-500'}`} 
                />
              </Button>
            </Card>

            {/* Moz Domain Authority */}
            <Card 
              className="bg-[#0d120d] border-indigo-900/30 cursor-pointer hover:border-indigo-500/50 transition-all"
              onClick={() => setCurrentView('moz-authority')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-indigo-500/20 flex items-center justify-center">
                    <BarChart className="w-6 h-6 text-indigo-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">Moz Authority</p>
                    <p className="text-xs text-gray-500">Domain check</p>
                  </div>
                </div>
              </CardContent>
            </Card>

            {/* SSL Certificate Lookup */}
            <Card 
              className="bg-[#0d120d] border-emerald-900/30 cursor-pointer hover:border-emerald-500/50 transition-all relative"
              onClick={() => navigateToTool('ssl-lookup')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-emerald-500/20 flex items-center justify-center">
                    <Lock className="w-6 h-6 text-emerald-400" />
                  </div>
                  <div>
                  <p className="text-sm font-medium text-white">{t('tools.sslLookup')}</p>
                  <p className="text-xs text-gray-500">{t('tools.certificateCheck')}</p>
                  </div>
                </div>
              </CardContent>
              <Button
                variant="ghost"
                size="sm"
                className="absolute top-2 right-2 p-1 h-auto"
                onClick={(e) => handleToggleFavorite('ssl-lookup', e)}
              >
                <Star 
                  className={`w-4 h-4 ${favorites['ssl-lookup'] ? 'text-amber-400 fill-amber-400' : 'text-gray-500'}`} 
                />
              </Button>
            </Card>

            {/* Is It Down */}
            <Card 
              className="bg-[#0d120d] border-red-900/30 cursor-pointer hover:border-red-500/50 transition-all relative"
              onClick={() => navigateToTool('is-it-down')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-red-500/20 flex items-center justify-center">
                    <CheckCircle className="w-6 h-6 text-red-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">Is It Down?</p>
                    <p className="text-xs text-gray-500">Uptime check</p>
                  </div>
                </div>
              </CardContent>
              <Button
                variant="ghost"
                size="sm"
                className="absolute top-2 right-2 p-1 h-auto"
                onClick={(e) => handleToggleFavorite('is-it-down', e)}
              >
                <Star 
                  className={`w-4 h-4 ${favorites['is-it-down'] ? 'text-amber-400 fill-amber-400' : 'text-gray-500'}`} 
                />
              </Button>
            </Card>

            {/* URL Redirect Tracker */}
            <Card 
              className="bg-[#0d120d] border-violet-900/30 cursor-pointer hover:border-violet-500/50 transition-all relative"
              onClick={() => navigateToTool('url-redirect')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-violet-500/20 flex items-center justify-center">
                    <Shuffle className="w-6 h-6 text-violet-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">URL Redirect</p>
                    <p className="text-xs text-gray-500">Track redirects</p>
                  </div>
                </div>
              </CardContent>
              <Button
                variant="ghost"
                size="sm"
                className="absolute top-2 right-2 p-1 h-auto"
                onClick={(e) => handleToggleFavorite('url-redirect', e)}
              >
                <Star 
                  className={`w-4 h-4 ${favorites['url-redirect'] ? 'text-amber-400 fill-amber-400' : 'text-gray-500'}`} 
                />
              </Button>
            </Card>

            {/* HTML Source Viewer */}
            <Card 
              className="bg-[#0d120d] border-blue-900/30 cursor-pointer hover:border-blue-500/50 transition-all relative"
              onClick={() => navigateToTool('html-viewer')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-blue-500/20 flex items-center justify-center">
                    <Eye className="w-6 h-6 text-blue-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">HTML Viewer</p>
                    <p className="text-xs text-gray-500">View source</p>
                  </div>
                </div>
              </CardContent>
              <Button
                variant="ghost"
                size="sm"
                className="absolute top-2 right-2 p-1 h-auto"
                onClick={(e) => handleToggleFavorite('html-viewer', e)}
              >
                <Star 
                  className={`w-4 h-4 ${favorites['html-viewer'] ? 'text-amber-400 fill-amber-400' : 'text-gray-500'}`} 
                />
              </Button>
            </Card>

            {/* URL Encode/Decode */}
            <Card 
              className="bg-[#0d120d] border-teal-900/30 cursor-pointer hover:border-teal-500/50 transition-all relative"
              onClick={() => navigateToTool('url-encode')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-teal-500/20 flex items-center justify-center">
                    <Code className="w-6 h-6 text-teal-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">URL Encode</p>
                    <p className="text-xs text-gray-500">Encode/Decode</p>
                  </div>
                </div>
              </CardContent>
              <Button
                variant="ghost"
                size="sm"
                className="absolute top-2 right-2 p-1 h-auto"
                onClick={(e) => handleToggleFavorite('url-encode', e)}
              >
                <Star 
                  className={`w-4 h-4 ${favorites['url-encode'] ? 'text-amber-400 fill-amber-400' : 'text-gray-500'}`} 
                />
              </Button>
            </Card>

            {/* Shopify Theme Detector */}
            <Card 
              className="bg-[#0d120d] border-green-900/30 cursor-pointer hover:border-green-500/50 transition-all relative"
              onClick={() => navigateToTool('shopify-detector')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-green-500/20 flex items-center justify-center">
                    <ShoppingBag className="w-6 h-6 text-green-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">Shopify Theme</p>
                    <p className="text-xs text-gray-500">Theme detect</p>
                  </div>
                </div>
              </CardContent>
              <Button
                variant="ghost"
                size="sm"
                className="absolute top-2 right-2 p-1 h-auto"
                onClick={(e) => handleToggleFavorite('shopify-detector', e)}
              >
                <Star 
                  className={`w-4 h-4 ${favorites['shopify-detector'] ? 'text-amber-400 fill-amber-400' : 'text-gray-500'}`} 
                />
              </Button>
            </Card>

            {/* Is it WordPress */}
            <Card 
              className="bg-[#0d120d] border-blue-900/30 cursor-pointer hover:border-blue-500/50 transition-all relative"
              onClick={() => navigateToTool('is-wordpress')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-blue-500/20 flex items-center justify-center">
                    <Globe className="w-6 h-6 text-blue-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">Is WordPress?</p>
                    <p className="text-xs text-gray-500">CMS detect</p>
                  </div>
                </div>
              </CardContent>
              <Button
                variant="ghost"
                size="sm"
                className="absolute top-2 right-2 p-1 h-auto"
                onClick={(e) => handleToggleFavorite('is-wordpress', e)}
              >
                <Star 
                  className={`w-4 h-4 ${favorites['is-wordpress'] ? 'text-amber-400 fill-amber-400' : 'text-gray-500'}`} 
                />
              </Button>
            </Card>

            {/* WordPress Theme Detector */}
            <Card 
              className="bg-[#0d120d] border-purple-900/30 cursor-pointer hover:border-purple-500/50 transition-all relative"
              onClick={() => navigateToTool('wp-theme-detector')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-purple-500/20 flex items-center justify-center">
                    <Eye className="w-6 h-6 text-purple-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">WP Theme</p>
                    <p className="text-xs text-gray-500">Theme detect</p>
                  </div>
                </div>
              </CardContent>
              <Button
                variant="ghost"
                size="sm"
                className="absolute top-2 right-2 p-1 h-auto"
                onClick={(e) => handleToggleFavorite('wp-theme-detector', e)}
              >
                <Star 
                  className={`w-4 h-4 ${favorites['wp-theme-detector'] ? 'text-amber-400 fill-amber-400' : 'text-gray-500'}`} 
                />
              </Button>
            </Card>

            {/* Domain Name Checker */}
            <Card 
              className="bg-[#0d120d] border-cyan-900/30 cursor-pointer hover:border-cyan-500/50 transition-all"
              onClick={() => setCurrentView('domain-checker')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-cyan-500/20 flex items-center justify-center">
                    <Globe className="w-6 h-6 text-cyan-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">Domain Check</p>
                    <p className="text-xs text-gray-500">Availability</p>
                  </div>
                </div>
              </CardContent>
            </Card>

            {/* Web Server OS Lookup */}
            <Card 
              className="bg-[#0d120d] border-orange-900/30 cursor-pointer hover:border-orange-500/50 transition-all"
              onClick={() => setCurrentView('server-os')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-orange-500/20 flex items-center justify-center">
                    <Server className="w-6 h-6 text-orange-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">Server OS</p>
                    <p className="text-xs text-gray-500">OS detection</p>
                  </div>
                </div>
              </CardContent>
            </Card>

            {/* HSTS Test */}
            <Card 
              className="bg-[#0d120d] border-rose-900/30 cursor-pointer hover:border-rose-500/50 transition-all"
              onClick={() => setCurrentView('hsts-test')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-rose-500/20 flex items-center justify-center">
                    <Shield className="w-6 h-6 text-rose-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">HSTS Test</p>
                    <p className="text-xs text-gray-500">Security header</p>
                  </div>
                </div>
              </CardContent>
            </Card>

            {/* Lynx Viewer */}
            <Card 
              className="bg-[#0d120d] border-yellow-900/30 cursor-pointer hover:border-yellow-500/50 transition-all"
              onClick={() => setCurrentView('lynx-viewer')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-yellow-500/20 flex items-center justify-center">
                    <Eye className="w-6 h-6 text-yellow-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">Lynx Viewer</p>
                    <p className="text-xs text-gray-500">Text browser</p>
                  </div>
                </div>
              </CardContent>
            </Card>

            {/* HTTP/2 Test */}
            <Card 
              className="bg-[#0d120d] border-lime-900/30 cursor-pointer hover:border-lime-500/50 transition-all"
              onClick={() => setCurrentView('http2-test')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-lime-500/20 flex items-center justify-center">
                    <Globe className="w-6 h-6 text-lime-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">HTTP/2 Test</p>
                    <p className="text-xs text-gray-500">Protocol check</p>
                  </div>
                </div>
              </CardContent>
            </Card>

            {/* User Agent Generator */}
            <Card 
              className="bg-[#0d120d] border-emerald-900/30 cursor-pointer hover:border-emerald-500/50 transition-all"
              onClick={() => setCurrentView('user-agent')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-emerald-500/20 flex items-center justify-center">
                    <Shuffle className="w-6 h-6 text-emerald-400" />
                  </div>
                  <div>
                    <p className="text-sm font-medium text-white">User Agent</p>
                    <p className="text-xs text-gray-500">Generator</p>
                  </div>
                </div>
              </CardContent>
            </Card>
          </div>
        </ScrollArea>
      </div>
    )
  }

  // Generic tool view renderer
  const renderToolView = (
    title: string,
    description: string,
    icon: React.ReactNode,
    placeholder: string = 'Enter URL...'
  ) => {
    const buttonText = getButtonText(currentView)
    
    return (
      <div className="h-full flex flex-col">
        {/* Sticky Back Button */}
        <div className="sticky top-0 z-10 bg-[#0d120d] border-b border-cyan-900/30 pb-4 mb-4">
          <Button 
            variant="ghost" 
            size="sm" 
            onClick={() => {
              setCurrentView('main')
              setInputUrl('')
              setResult(null)
              setShowAllItems({})
            }}
            className="text-gray-400 hover:text-white"
          >
            <ArrowLeft className="w-4 h-4 mr-2" />
            Back
          </Button>
        </div>

        {/* Scrollable Content */}
        <div className="flex-1 overflow-y-auto space-y-4 pr-2">
          <div>
            <h2 className="text-xl font-bold text-white flex items-center gap-2">
              {icon}
              {title}
            </h2>
            <p className="text-xs text-gray-500 mt-1">{description}</p>
          </div>

        <Card className="bg-[#0d120d] border-cyan-900/30">
          <CardContent className="p-4 space-y-4">
            <div className="space-y-2">
              <Input
                placeholder={placeholder}
                value={inputUrl}
                onChange={(e) => setInputUrl(e.target.value)}
                onKeyDown={(e) => e.key === 'Enter' && handleAnalyze()}
                className="bg-black/50 border-cyan-900/30 text-white"
              />
              <Button 
                onClick={handleAnalyze}
                disabled={loading || !inputUrl.trim()}
                className="w-full bg-cyan-600 hover:bg-cyan-700"
              >
                {loading ? (
                  <div className="flex items-center gap-2">
                    <RefreshCw className="w-4 h-4 animate-spin" />
                    {buttonText}ing...
                  </div>
                ) : (
                  buttonText
                )}
              </Button>
            </div>

            {result && (
              <div className={`p-4 rounded-lg border ${
                result.success 
                  ? 'bg-green-900/20 border-green-900/30' 
                  : 'bg-red-900/20 border-red-900/30'
              }`}>
                {result.success ? (
                  <div className="space-y-3">
                    <div className="flex items-center justify-between">
                      <p className="text-sm font-medium text-green-300">Results</p>
                      {result.data && typeof result.data === 'object' && (
                        <Button
                          size="sm"
                          variant="ghost"
                          onClick={() => {
                            const textToCopy = JSON.stringify(result.data, null, 2)
                            navigator.clipboard.writeText(textToCopy).then(() => {
                              setCopied(true)
                              setTimeout(() => setCopied(false), 2000)
                            })
                          }}
                          className="h-7 text-xs hover:bg-green-800/30"
                        >
                          {copied ? (
                            <>
                              <Check className="w-3 h-3 mr-1" />
                              Copied
                            </>
                          ) : (
                            <>
                              <Copy className="w-3 h-3 mr-1" />
                              Copy
                            </>
                          )}
                        </Button>
                      )}
                    </div>
                    
                    {result.data && typeof result.data === 'object' ? (
                      <div className="space-y-3">
                        {/* Render specific scan results based on tool type */}
                        {renderSpecificResults(result.data, currentView)}
                        
                        {/* Fallback: render all data as key-value pairs */}
                        {Object.entries(result.data).map(([key, value]: [string, any]) => {
                          if (key === 'html' && typeof value === 'string') {
                            return (
                              <div key={key} className="space-y-1">
                                <div className="flex items-center justify-between">
                                  <p className="text-xs text-gray-400 font-medium">{key}:</p>
                                  <Button
                                    size="sm"
                                    variant="ghost"
                                    onClick={() => {
                                      navigator.clipboard.writeText(value).then(() => {
                                        setCopied(true)
                                        setTimeout(() => setCopied(false), 2000)
                                      })
                                    }}
                                    className="h-6 text-xs"
                                  >
                                    {copied ? <Check className="w-3 h-3" /> : <Copy className="w-3 h-3" />}
                                  </Button>
                                </div>
                                <div className="h-64 w-full overflow-y-auto rounded border border-gray-700 bg-black/30">
                                  <pre className="p-3 text-xs text-gray-300 whitespace-pre-wrap">
                                    {value}
                                  </pre>
                                </div>
                              </div>
                            )
                          }
                          
                          if (Array.isArray(value)) {
                            const showAll = showAllItems[key] || false
                            const displayItems = showAll ? value : value.slice(0, 10)
                            
                            return (
                              <div key={key} className="space-y-1">
                                <div className="flex items-center justify-between">
                                  <p className="text-xs text-gray-400 font-medium">{key}: ({value.length})</p>
                                  {value.length > 0 && (
                                    <Button
                                      size="sm"
                                      variant="ghost"
                                      onClick={() => {
                                        const textToCopy = value.join('\n')
                                        navigator.clipboard.writeText(textToCopy).then(() => {
                                          setCopied(true)
                                          setTimeout(() => setCopied(false), 2000)
                                        })
                                      }}
                                      className="h-6 text-xs"
                                    >
                                      {copied ? <Check className="w-3 h-3" /> : <Copy className="w-3 h-3" />}
                                    </Button>
                                  )}
                                </div>
                                {value.length > 0 && (
                                  <div className="space-y-1">
                                    <div className="max-h-60 overflow-y-auto rounded border border-gray-700 bg-black/30 p-2">
                                      <div className="space-y-1">
                                        {displayItems.map((item, i) => (
                                          <p key={i} className="text-xs text-gray-300 break-all">
                                            • {typeof item === 'object' ? JSON.stringify(item) : item}
                                          </p>
                                        ))}
                                      </div>
                                    </div>
                                    {value.length > 10 && (
                                      <button
                                        onClick={() => setShowAllItems(prev => ({ ...prev, [key]: !showAll }))}
                                        className="text-xs text-cyan-400 hover:text-cyan-300 underline"
                                      >
                                        {showAll ? 'Show less' : `Show all ${value.length} items`}
                                      </button>
                                    )}
                                  </div>
                                )}
                              </div>
                            )
                          }
                          
                          if (typeof value === 'object' && value !== null) {
                            return (
                              <div key={key} className="space-y-1">
                                <div className="flex items-center justify-between">
                                  <p className="text-xs text-gray-400 font-medium">{key}:</p>
                                  <Button
                                    size="sm"
                                    variant="ghost"
                                    onClick={() => {
                                      const textToCopy = JSON.stringify(value, null, 2)
                                      navigator.clipboard.writeText(textToCopy).then(() => {
                                        setCopied(true)
                                        setTimeout(() => setCopied(false), 2000)
                                      })
                                    }}
                                    className="h-6 text-xs"
                                  >
                                    {copied ? <Check className="w-3 h-3" /> : <Copy className="w-3 h-3" />}
                                  </Button>
                                </div>
                                <pre className="pl-3 text-xs text-gray-300 bg-black/30 p-2 rounded border border-gray-700">
                                  {JSON.stringify(value, null, 2)}
                                </pre>
                              </div>
                            )
                          }
                          
                          return (
                            <div key={key} className="flex justify-between items-start">
                              <p className="text-xs text-gray-400 font-medium">{key}:</p>
                              <p className="text-xs text-gray-300 text-right max-w-[70%] break-all">
                                {String(value)}
                              </p>
                            </div>
                          )
                        })}
                      </div>
                    ) : (
                      <p className="text-sm text-white">{String(result.data)}</p>
                    )}
                  </div>
                ) : (
                  <div className="space-y-2">
                    <p className="text-sm font-medium text-red-300">Failed</p>
                    <p className="text-xs text-gray-400">{result.error}</p>
                  </div>
                )}
              </div>
            )}
          </CardContent>
        </Card>
        </div>
      </div>
    )
  }

  // Individual tool views
  if (currentView === 'seo-browser') {
    return renderToolView(
      'SEO Browser',
      'Crawl analyzer which behaves like a search engine, and quickly determines structure of the page with the server response code.',
      <Search className="w-5 h-5 text-blue-400" />
    )
  }

  if (currentView === 'wp-security') {
    return renderToolView(
      'WordPress Security Scanner',
      'Diagnose your WordPress instance for security vulnerabilities and potential risks.',
      <Shield className="w-5 h-5 text-red-400" />
    )
  }

  if (currentView === 'https-checker') {
    return renderToolView(
      'HTTPS Checker',
      'Check if there are any resources retrieved from a non-HTTPS web page.',
      <Lock className="w-5 h-5 text-green-400" />
    )
  }

  if (currentView === 'hyperlink-analyzer') {
    return renderToolView(
      'Hyperlink Analyzer',
      'Detect all internal and external hyperlinks, their attributes and anchor text.',
      <Link className="w-5 h-5 text-purple-400" />
    )
  }

  if (currentView === 'robots-checker') {
    return renderToolView(
      'Robots Exclusion Checker',
      'Detect robot exclusions that prevent a web page from being indexed and crawled.',
      <FileCode className="w-5 h-5 text-orange-400" />
    )
  }

  if (currentView === 'extract-links') {
    return renderToolView(
      'Extract Links from Page',
      'Parse the HTML of a web page and extract all links contained in the page.',
      <ExternalLink className="w-5 h-5 text-cyan-400" />
    )
  }

  if (currentView === 'ga-gtm-checker') {
    return renderToolView(
      'Google Analytics & GTM Checker',
      'Check if a GA and/or GTM code is included in a webpage, and extract the tracking ID.',
      <BarChart className="w-5 h-5 text-yellow-400" />
    )
  }

  if (currentView === 'meta-tags') {
    return renderToolView(
      'Meta Tags Analyzer',
      'Fetch meta tags from a supplied URL and review them against recommendations.',
      <Code className="w-5 h-5 text-pink-400" />
    )
  }

  if (currentView === 'moz-authority') {
    return renderToolView(
      'Moz Domain Authority Checker',
      'Check domain authority and analyze domain metrics.',
      <BarChart className="w-5 h-5 text-indigo-400" />
    )
  }

  if (currentView === 'ssl-lookup') {
    return renderToolView(
      'SSL Certificate Lookup',
      'Verify if SSL Certificate on any server has been installed correctly and can be trusted.',
      <Lock className="w-5 h-5 text-emerald-400" />
    )
  }

  if (currentView === 'is-it-down') {
    return renderToolView(
      'Is It Down for Everyone or Just Me?',
      'Check if a website is down for everyone or just you.',
      <CheckCircle className="w-5 h-5 text-red-400" />
    )
  }

  if (currentView === 'url-redirect') {
    return renderToolView(
      'URL Redirect Tracker',
      'Trace the URL without actually clicking on the links. Track all redirects safely.',
      <Shuffle className="w-5 h-5 text-violet-400" />
    )
  }

  if (currentView === 'html-viewer') {
    return renderToolView(
      'HTML Source Viewer',
      'View HTML source code of any web page with proper indentation and beautification.',
      <Eye className="w-5 h-5 text-blue-400" />
    )
  }

  if (currentView === 'url-encode') {
    return (
      <div className="h-full flex flex-col">
        {/* Sticky Back Button */}
        <div className="sticky top-0 z-10 bg-[#0d120d] border-b border-cyan-900/30 pb-4 mb-4">
          <Button 
            variant="ghost" 
            size="sm" 
            onClick={() => setCurrentView('main')}
            className="text-gray-400 hover:text-white"
          >
            <ArrowLeft className="w-4 h-4 mr-2" />
            Back to Web Tools
          </Button>
        </div>

        {/* Scrollable Content */}
        <div className="flex-1 overflow-y-auto space-y-4 pr-2">
          <div>
            <h2 className="text-xl font-bold text-white flex items-center gap-2">
              <Code className="w-5 h-5 text-teal-400" />
              URL Encode & Decode
            </h2>
            <p className="text-xs text-gray-500 mt-1">
              Convert characters into a safe format for transmission using URL encoding
            </p>
          </div>

        <Card className="bg-[#0d120d] border-cyan-900/30">
          <CardContent className="p-4 space-y-4">
            <div className="space-y-2">
              <label className="text-sm text-gray-400">Enter text or URL:</label>
              <textarea
                placeholder="Enter text to encode/decode... (e.g., https://example.com/search?q=hello world)"
                value={inputUrl}
                onChange={(e) => setInputUrl(e.target.value)}
                className="w-full min-h-[100px] bg-black/50 border border-cyan-900/30 text-white rounded-md p-3 resize-y focus:outline-none focus:border-cyan-500/50"
              />
              <div className="grid grid-cols-2 gap-2">
                <Button 
                  onClick={() => {
                    if (inputUrl.trim()) {
                      try {
                        const encoded = encodeURIComponent(inputUrl)
                        setResult({ success: true, data: encoded, operation: 'encode' })
                      } catch (e: any) {
                        setResult({ success: false, error: 'Failed to encode: ' + e.message })
                      }
                    } else {
                      setResult({ success: false, error: 'Please enter text to encode' })
                    }
                  }}
                  className="bg-cyan-600 hover:bg-cyan-700"
                  disabled={!inputUrl.trim()}
                >
                  <Code className="w-4 h-4 mr-2" />
                  Encode
                </Button>
                <Button 
                  onClick={() => {
                    if (inputUrl.trim()) {
                      try {
                        const decoded = decodeURIComponent(inputUrl)
                        setResult({ success: true, data: decoded, operation: 'decode' })
                      } catch (e: any) {
                        setResult({ success: false, error: 'Invalid encoded string. Make sure the text is properly URL encoded.' })
                      }
                    } else {
                      setResult({ success: false, error: 'Please enter text to decode' })
                    }
                  }}
                  className="bg-purple-600 hover:bg-purple-700"
                  disabled={!inputUrl.trim()}
                >
                  <Code className="w-4 h-4 mr-2" />
                  Decode
                </Button>
              </div>
              
              {/* Quick Actions */}
              <div className="flex gap-2 pt-2">
                <Button
                  variant="outline"
                  size="sm"
                  onClick={() => {
                    setInputUrl('')
                    setResult(null)
                  }}
                  className="text-xs"
                >
                  Clear
                </Button>
                <Button
                  variant="outline"
                  size="sm"
                  onClick={() => {
                    setInputUrl('https://example.com/search?q=hello world&lang=en')
                  }}
                  className="text-xs"
                >
                  Load Example
                </Button>
              </div>
            </div>

            {result && (
              <div className={`p-4 rounded-lg border ${
                result.success 
                  ? 'bg-green-900/20 border-green-900/30' 
                  : 'bg-red-900/20 border-red-900/30'
              }`}>
                <div className="flex items-center justify-between mb-2">
                  <p className="text-xs text-gray-400">
                    {result.success ? `Result (${result.operation}d):` : 'Error:'}
                  </p>
                  {result.success && (
                    <Button
                      variant="ghost"
                      size="sm"
                      onClick={() => {
                        copyToClipboard(result.data)
                        toast.success('Copied to clipboard!')
                      }}
                      className="h-auto p-1 text-xs"
                    >
                      {copied ? (
                        <>
                          <CheckCircle className="w-3 h-3 mr-1" />
                          Copied
                        </>
                      ) : (
                        <>
                          <Copy className="w-3 h-3 mr-1" />
                          Copy
                        </>
                      )}
                    </Button>
                  )}
                </div>
                <div className="bg-black/30 p-3 rounded border border-gray-700/30">
                  <p className="text-sm text-white break-all font-mono">{result.data || result.error}</p>
                </div>
                
                {result.success && (
                  <div className="mt-3 text-xs text-gray-400 space-y-1">
                    <p>• Original length: {inputUrl.length} characters</p>
                    <p>• Result length: {result.data.length} characters</p>
                    {result.operation === 'encode' && (
                      <p>• Encoded {inputUrl.length - result.data.replace(/%[0-9A-F]{2}/g, 'X').length} special characters</p>
                    )}
                  </div>
                )}
              </div>
            )}
            
            {/* Information Box */}
            <div className="bg-blue-900/10 border border-blue-900/30 rounded-lg p-3">
              <h3 className="text-sm font-semibold text-blue-400 mb-2">ℹ️ About URL Encoding</h3>
              <ul className="text-xs text-gray-400 space-y-1">
                <li>• <strong>Encode:</strong> Converts special characters to %XX format (e.g., space → %20)</li>
                <li>• <strong>Decode:</strong> Converts %XX format back to original characters</li>
                <li>• <strong>Use case:</strong> Making URLs safe for transmission over the internet</li>
                <li>• <strong>Example:</strong> "hello world" → "hello%20world"</li>
              </ul>
            </div>
          </CardContent>
        </Card>
        </div>
      </div>
    )
  }

  if (currentView === 'shopify-detector') {
    return renderToolView(
      'Shopify Theme Detector',
      'Identify Shopify theme used on any Shopify website.',
      <ShoppingBag className="w-5 h-5 text-green-400" />
    )
  }

  if (currentView === 'is-wordpress') {
    return renderToolView(
      'Is it WordPress?',
      'Identify WordPress sites by scanning for common CMS signatures and themes.',
      <Globe className="w-5 h-5 text-blue-400" />
    )
  }

  if (currentView === 'wp-theme-detector') {
    return renderToolView(
      'WordPress Theme Detector',
      'Find out which WordPress theme a website is using, including theme name and author.',
      <Eye className="w-5 h-5 text-purple-400" />
    )
  }

  if (currentView === 'domain-checker') {
    return renderToolView(
      'Domain Name Availability Checker',
      'Search for available domains across multiple extensions.',
      <Globe className="w-5 h-5 text-cyan-400" />,
      'Enter domain name...'
    )
  }

  if (currentView === 'server-os') {
    return renderToolView(
      'Web Server OS Lookup',
      'Determine the Server OS and the stack it is running on.',
      <Server className="w-5 h-5 text-orange-400" />
    )
  }

  if (currentView === 'hsts-test') {
    return renderToolView(
      'HSTS Test',
      'Check if HTTP Strict Transport Security (HSTS) is enabled on the website.',
      <Shield className="w-5 h-5 text-rose-400" />
    )
  }

  if (currentView === 'lynx-viewer') {
    return renderToolView(
      'Lynx Viewer',
      'Check how your site appears in the Lynx browser. Great for SEO and accessibility.',
      <Eye className="w-5 h-5 text-yellow-400" />
    )
  }

  if (currentView === 'http2-test') {
    return renderToolView(
      'HTTP/2 Test',
      'Test if a website supports HTTP/2 protocol for improved performance.',
      <Globe className="w-5 h-5 text-lime-400" />
    )
  }

  if (currentView === 'user-agent') {
    return (
      <div className="h-full flex flex-col">
        {/* Sticky Back Button */}
        <div className="sticky top-0 z-10 bg-[#0d120d] border-b border-cyan-900/30 pb-4 mb-4">
          <Button 
            variant="ghost" 
            size="sm" 
            onClick={() => setCurrentView('main')}
            className="text-gray-400 hover:text-white"
          >
            <ArrowLeft className="w-4 h-4 mr-2" />
            Back to Web Tools
          </Button>
        </div>

        {/* Scrollable Content */}
        <div className="flex-1 overflow-y-auto space-y-4 pr-2">
          <div>
            <h2 className="text-xl font-bold text-white flex items-center gap-2">
              <Shuffle className="w-5 h-5 text-emerald-400" />
              Random User Agent Generator
            </h2>
            <p className="text-xs text-gray-500 mt-1">
              Generate custom user agents for your browser
            </p>
          </div>

        <Card className="bg-[#0d120d] border-cyan-900/30">
          <CardContent className="p-4 space-y-4">
            <Button 
              onClick={() => {
                const userAgents = [
                  'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36',
                  'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36',
                  'Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36',
                  'Mozilla/5.0 (iPhone; CPU iPhone OS 14_0 like Mac OS X) AppleWebKit/605.1.15'
                ]
                const random = userAgents[Math.floor(Math.random() * userAgents.length)]
                setResult({ success: true, data: random })
              }}
              className="w-full bg-emerald-600 hover:bg-emerald-700"
            >
              Generate Random User Agent
            </Button>

            {result && result.success && (
              <div className="p-4 rounded-lg border bg-green-900/20 border-green-900/30">
                <p className="text-xs text-gray-400 mb-2">Generated User Agent:</p>
                <p className="text-sm text-white break-all">{result.data}</p>
              </div>
            )}
          </CardContent>
        </Card>
        </div>
      </div>
    )
  }

  return null
}
