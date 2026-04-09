'use client'

import { useState, useEffect, useRef } from 'react'
import { useSearchParams } from 'next/navigation'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Input } from '@/components/ui/input'
import { Badge } from '@/components/ui/badge'
import { ScrollArea } from '@/components/ui/scroll-area'
import {
  ArrowLeft,
  Route,
  Activity,
  Server,
  Clock,
  Trash2,
  ChevronRight,
  Globe,
  Play,
  Square,
  Wifi,
  Download,
  Upload,
  Gauge,
  Shield,
  Search,
  Star,
  History,
  X,
  ChevronDown,
  ChevronUp,
} from 'lucide-react'
import WiFiSecurity from '@/components/WiFiSecurity'
import IPTools from '@/components/IPTools'
import DNSTools from '@/components/DNSTools'
import WebTools from '@/components/WebTools'
import OtherTools from '@/components/OtherTools'
import { useI18n } from '@/lib/i18n'
import { ALL_SUB_TOOLS, getToolById, getFavorites, getRecentTools } from '@/lib/tool-registry'
import { isCapacitor, getNetworkScanner, getNetworkTools, getSpeedTest } from '@/lib/native-plugins'
import { toast } from 'sonner'

// Types
interface TracerouteHop {
  hop: number
  ip: string
  hostname?: string
  time: number
  status: 'success' | 'timeout' | 'pending' | 'error'
}

interface PingResult {
  seq: number
  time: number
  status: 'success' | 'timeout'
}

interface PingStats {
  sent: number
  received: number
  lost: number
  min: number
  max: number
  avg: number
  stdDev: number
  times: number[]
}

interface PortResult {
  port: number
  status: 'open' | 'closed' | 'filtered'
  service: string
  description: string
}

interface SpeedTestHistoryItem {
  id: string
  download: number
  upload: number
  ping: number
  jitter: number
  timestamp: Date
  server?: string
}

interface RecentHost {
  host: string
  ip?: string
  lastUsed: Date
}

type ToolView = 'main' | 'traceroute' | 'ping' | 'ports' | 'speed-test' | 'wifi-security' | 'ip-tools' | 'dns-tools' | 'web-tools' | 'other-tools'

// Common port services
const PORT_SERVICES: Record<number, { name: string; description: string }> = {
  20: { name: 'FTP Data', description: 'File Transfer Protocol (Data)' },
  21: { name: 'FTP', description: 'File Transfer Protocol (Control)' },
  22: { name: 'SSH', description: 'Secure Shell' },
  23: { name: 'Telnet', description: 'Telnet Protocol' },
  25: { name: 'SMTP', description: 'Simple Mail Transfer Protocol' },
  53: { name: 'DNS', description: 'Domain Name System' },
  80: { name: 'HTTP', description: 'World Wide Web HTTP' },
  110: { name: 'POP3', description: 'Post Office Protocol v3' },
  143: { name: 'IMAP', description: 'Internet Message Access Protocol' },
  443: { name: 'HTTPS', description: 'Secure World Wide Web HTTP (SSL)' },
  445: { name: 'SMB', description: 'Server Message Block' },
  993: { name: 'IMAPS', description: 'IMAP over SSL' },
  995: { name: 'POP3S', description: 'POP3 over SSL' },
  3306: { name: 'MySQL', description: 'MySQL Database' },
  3389: { name: 'RDP', description: 'Remote Desktop Protocol' },
  5432: { name: 'PostgreSQL', description: 'PostgreSQL Database' },
  8080: { name: 'HTTP Alt', description: 'HTTP Alternate' },
  8443: { name: 'HTTPS Alt', description: 'HTTPS Alternate' },
}

const COMMON_PORTS = [21, 22, 23, 25, 53, 80, 110, 143, 443, 445, 993, 995, 3306, 3389, 5432, 8080, 8443]

const POPULAR_TARGETS = ['google.com', 'facebook.com']

interface NetworkToolsProps {
  speedTestResults?: any
  speedTestLoading?: boolean
  speedTestProgress?: number
  onRunSpeedTest?: () => void
}

export default function NetworkTools({ speedTestResults, speedTestLoading, speedTestProgress, onRunSpeedTest }: NetworkToolsProps) {
  const { t } = useI18n()
  const searchParams = useSearchParams()
  const [currentView, setCurrentView] = useState<ToolView>('main')
  const [targetHost, setTargetHost] = useState('')
  
  // Traceroute state
  const [tracerouteHops, setTracerouteHops] = useState<TracerouteHop[]>([])
  const [tracerouteRunning, setTracerouteRunning] = useState(false)
  const [tracerouteComplete, setTracerouteComplete] = useState(false)
  
  // Ping state
  const [pingResults, setPingResults] = useState<PingResult[]>([])
  const [pingStats, setPingStats] = useState<PingStats | null>(null)
  const [pingRunning, setPingRunning] = useState(false)
  
  // Port scanner state
  const [portResults, setPortResults] = useState<PortResult[]>([])
  const [portScanRunning, setPortScanRunning] = useState(false)
  const [openPortsCount, setOpenPortsCount] = useState(0)
  
  // Speed test state
  const [isSpeedTestRunning, setIsSpeedTestRunning] = useState(false)
  const [currentPhase, setCurrentPhase] = useState<string>('')
  const [phaseProgress, setPhaseProgress] = useState(0)
  const [statusMessage, setStatusMessage] = useState('')
  const [testResults, setTestResults] = useState<any>(null)
  const [testHistory, setTestHistory] = useState<any[]>([])
  
  // Recent hosts
  const [recentHosts, setRecentHosts] = useState<RecentHost[]>([])
  
  // Search, favorites, and recently used state
  const [searchQuery, setSearchQuery] = useState('')
  const [favoriteTools, setFavoriteTools] = useState<string[]>([])
  const [recentlyUsedTools, setRecentlyUsedTools] = useState<string[]>([])
  const [favoritesCollapsed, setFavoritesCollapsed] = useState(false)
  const [recentCollapsed, setRecentCollapsed] = useState(false)
  
  // Connectivity state
  const [isOnline, setIsOnline] = useState(true)
  
  // Refs for cancellation
  const cancelRef = useRef(false)

  // Handle tool parameter from URL
  useEffect(() => {
    const toolParam = searchParams.get('tool')
    if (toolParam === 'wifi-security') {
      setCurrentView('wifi-security')
    }
  }, [searchParams])

  // Check connectivity status
  useEffect(() => {
    const checkConnectivity = async () => {
      if (!isCapacitor) {
        setIsOnline(typeof navigator !== 'undefined' && navigator.onLine)
        return
      }

      try {
        const offlineManager = (window as any).Capacitor?.Plugins?.OfflineManager
        if (offlineManager) {
          const status = await offlineManager.isOnline()
          setIsOnline(status.isOnline || false)
        } else {
          setIsOnline(true)
        }
      } catch (err) {
        console.error('Error checking connectivity:', err)
        setIsOnline(true)
      }
    }

    checkConnectivity()

    // Listen for online/offline events
    if (typeof window !== 'undefined') {
      const handleOnline = () => {
        setIsOnline(true)
        checkConnectivity()
      }
      const handleOffline = () => {
        setIsOnline(false)
      }

      window.addEventListener('online', handleOnline)
      window.addEventListener('offline', handleOffline)

      return () => {
        window.removeEventListener('online', handleOnline)
        window.removeEventListener('offline', handleOffline)
      }
    }
  }, [])

  // Load data from localStorage
  useEffect(() => {
    const savedHosts = localStorage.getItem('thirdeye_recent_hosts')
    if (savedHosts) {
      setRecentHosts(JSON.parse(savedHosts))
    }
    
    const savedSpeedHistory = localStorage.getItem('thirdeye_speed_history')
    if (savedSpeedHistory) {
      setTestHistory(JSON.parse(savedSpeedHistory).map((item: any) => ({
        ...item,
        timestamp: new Date(item.timestamp)
      })))
    }
    
    // Load favorites and recently used tools from new keys
    setFavoriteTools(getFavorites())
    setRecentlyUsedTools(getRecentTools())
    
    // Load collapse states
    const favCollapsed = localStorage.getItem('thirdeye-favorites-collapsed')
    if (favCollapsed === 'true') {
      setFavoritesCollapsed(true)
    }
    
    const recCollapsed = localStorage.getItem('thirdeye-recent-collapsed')
    if (recCollapsed === 'true') {
      setRecentCollapsed(true)
    }
  }, [])

  // Listen for storage changes to auto-refresh favorites and recently used
  useEffect(() => {
    const handleStorageChange = (e: StorageEvent) => {
      if (e.key === 'thirdeye-favorite-tools' || e.key === 'thirdeye-recent-tools') {
        setFavoriteTools(getFavorites())
        setRecentlyUsedTools(getRecentTools())
      }
    }

    // Also listen for custom events from same window
    const handleCustomStorageChange = () => {
      setFavoriteTools(getFavorites())
      setRecentlyUsedTools(getRecentTools())
    }

    window.addEventListener('storage', handleStorageChange)
    window.addEventListener('localStorageUpdated', handleCustomStorageChange)

    return () => {
      window.removeEventListener('storage', handleStorageChange)
      window.removeEventListener('localStorageUpdated', handleCustomStorageChange)
    }
  }, [])

  // Save recent host
  const saveRecentHost = (host: string, ip?: string) => {
    const newHost: RecentHost = { host, ip, lastUsed: new Date() }
    const updated = [newHost, ...recentHosts.filter(h => h.host !== host)].slice(0, 10)
    setRecentHosts(updated)
    localStorage.setItem('thirdeye_recent_hosts', JSON.stringify(updated))
  }

  // Clear recent hosts
  const clearRecentHosts = () => {
    setRecentHosts([])
    localStorage.removeItem('thirdeye_recent_hosts')
  }

  // Toggle favorite collapse
  const toggleFavoritesCollapse = () => {
    const newState = !favoritesCollapsed
    setFavoritesCollapsed(newState)
    localStorage.setItem('thirdeye-favorites-collapsed', String(newState))
  }

  // Toggle recent collapse
  const toggleRecentCollapse = () => {
    const newState = !recentCollapsed
    setRecentCollapsed(newState)
    localStorage.setItem('thirdeye-recent-collapsed', String(newState))
  }

  // Toggle favorite tool - removed, now handled in individual tool pages
  // Add tool to recently used - removed, now handled in individual tool pages

  // Handle tool navigation - removed, now handled in individual tool pages

  // Save speed test result to localStorage
  const saveSpeedTestToHistory = (result: any) => {
    const historyItem = {
      id: Date.now().toString(),
      download: parseFloat(result.download),
      upload: parseFloat(result.upload),
      ping: result.ping,
      jitter: result.jitter,
      timestamp: result.timestamp,
      server: 'Cloudflare CDN'
    }
    
    const savedHistory = localStorage.getItem('thirdeye_speed_history')
    const existingHistory = savedHistory ? JSON.parse(savedHistory) : []
    const newHistory = [historyItem, ...existingHistory].slice(0, 20)
    localStorage.setItem('thirdeye_speed_history', JSON.stringify(newHistory))
  }

  // Real speed test using native plugin
  const runRealSpeedTest = async () => {
    const speedTest = getSpeedTest()
    
    if (!speedTest) {
      setStatusMessage('Speed test requires native app')
      return
    }

    setIsSpeedTestRunning(true)
    setTestResults(null)
    setCurrentPhase('ping')
    setPhaseProgress(0)
    setStatusMessage('Starting speed test...')

    try {
      let listener: any = null
      const result = speedTest.addListener('speedTestProgress', (data: any) => {
        setCurrentPhase(data.phase)
        setPhaseProgress(data.progress)
        setStatusMessage(data.message)
      })

      // Handle both Promise and direct return
      if (result && typeof result.then === 'function') {
        listener = await result
      } else if (result && typeof result.remove === 'function') {
        listener = result
      }

      const testResult = await speedTest.runFullTest()
      
      if (listener && typeof listener.remove === 'function') {
        try {
          listener.remove()
        } catch (e) {}
      }

      if (testResult.success) {
        const formattedResult = {
          download: testResult.download?.toFixed(1) || '0',
          upload: testResult.upload?.toFixed(1) || '0',
          ping: Math.round(testResult.ping || 0),
          jitter: Math.round(testResult.jitter || 0),
          timestamp: new Date()
        }
        setTestResults(formattedResult)
        setTestHistory(prev => [formattedResult, ...prev.slice(0, 4)])
        saveSpeedTestToHistory(formattedResult)
      } else {
        setStatusMessage(result.error || 'Test failed')
      }
    } catch (err: any) {
      setStatusMessage(err.message || 'Speed test error')
    }

    setIsSpeedTestRunning(false)
    setCurrentPhase('')
    setPhaseProgress(0)
  }

  // Get phase color
  const getPhaseColor = (phase: string) => {
    switch (phase) {
      case 'ping': return 'text-yellow-400'
      case 'download': return 'text-emerald-400'
      case 'upload': return 'text-blue-400'
      default: return 'text-gray-400'
    }
  }

  // Get speed quality
  const getSpeedQuality = (speed: number) => {
    if (speed >= 50) return { label: 'Excellent', color: 'text-emerald-400' }
    if (speed >= 25) return { label: 'Good', color: 'text-green-400' }
    if (speed >= 10) return { label: 'Fair', color: 'text-yellow-400' }
    if (speed >= 5) return { label: 'Slow', color: 'text-orange-400' }
    return { label: 'Very Slow', color: 'text-red-400' }
  }

  // Get ping quality
  const getPingQuality = (ping: number) => {
    if (ping <= 20) return { label: 'Excellent', color: 'text-emerald-400' }
    if (ping <= 50) return { label: 'Good', color: 'text-green-400' }
    if (ping <= 100) return { label: 'Fair', color: 'text-yellow-400' }
    if (ping <= 200) return { label: 'High', color: 'text-orange-400' }
    return { label: 'Very High', color: 'text-red-400' }
  }

  // Resolve hostname to IP
  const resolveHost = async (host: string): Promise<string> => {
    // For demo, we'll simulate DNS resolution
    // In real app, this would use native DNS lookup
    const cleanHost = host.replace(/^https?:\/\//, '').split('/')[0]
    
    // Simulate DNS lookup delay
    await new Promise(r => setTimeout(r, 200))
    
    // Return simulated IPs for known hosts
    const knownHosts: Record<string, string> = {
      'google.com': '142.251.223.238',
      'facebook.com': '31.13.64.35',
      'amazon.com': '54.239.28.85',
      'bing.com': '204.79.197.200',
      'apple.com': '17.253.144.10',
    }
    
    return knownHosts[cleanHost] || `${Math.floor(Math.random() * 255)}.${Math.floor(Math.random() * 255)}.${Math.floor(Math.random() * 255)}.${Math.floor(Math.random() * 255)}`
  }


  // ============ TRACEROUTE ============
  const runTraceroute = async () => {
    if (!targetHost.trim()) return
    
    if (!isOnline) {
      toast.error('No internet connection. Traceroute requires an active internet connection.')
      return
    }
    
    const cleanHost = targetHost.replace(/^https?:\/\//, '').split('/')[0]
    setTracerouteRunning(true)
    setTracerouteComplete(false)
    setTracerouteHops([])
    cancelRef.current = false
    
    // Try native plugin first
    const networkTools = getNetworkTools()
    if (networkTools) {
      try {
        let listener: any = null
        const result = networkTools.addListener('tracerouteProgress', (data) => {
          if (data.hop) {
            setTracerouteHops(prev => {
              const existing = prev.filter(h => h.hop !== data.hop.hop)
              return [...existing, data.hop].sort((a, b) => a.hop - b.hop)
            })
          }
        })
        
        // Handle both Promise and direct return
        if (result && typeof result.then === 'function') {
          listener = await result
        } else if (result && typeof result.remove === 'function') {
          listener = result
        }
        
        const traceResult = await networkTools.traceroute({ host: cleanHost, maxHops: 30 })
        
        if (listener && typeof listener.remove === 'function') {
          try {
            listener.remove()
          } catch (e) {}
        }
        
        if (traceResult.success) {
          setTracerouteHops(traceResult.hops)
          saveRecentHost(cleanHost, traceResult.resolvedIp)
        }
        
        setTracerouteRunning(false)
        setTracerouteComplete(true)
        return
      } catch (e) {
        console.log('Native traceroute failed, using simulation')
      }
    }
    
    // Fallback to simulation
    const resolvedIp = await resolveHost(cleanHost)
    saveRecentHost(cleanHost, resolvedIp)
    
    // Get current network info for starting IP
    let startIp = '192.168.1.1'
    const netScanner = getNetworkScanner()
    if (netScanner) {
      try {
        const info = await netScanner.getNetworkInfo()
        if (info.success && info.ipAddress) {
          startIp = info.ipAddress
        }
      } catch (e) {}
    }
    
    // Simulate traceroute with realistic hops
    const maxHops = Math.floor(Math.random() * 8) + 8 // 8-15 hops
    const hops: TracerouteHop[] = []
    
    // First hop is usually the local gateway
    hops.push({
      hop: 1,
      ip: startIp.replace(/\.\d+$/, '.1'),
      time: Math.floor(Math.random() * 10) + 1,
      status: 'success'
    })
    
    for (let i = 2; i <= maxHops && !cancelRef.current; i++) {
      // Add pending hop
      setTracerouteHops([...hops, { hop: i, ip: '', time: 0, status: 'pending' }])
      
      await new Promise(r => setTimeout(r, 300 + Math.random() * 500))
      
      if (cancelRef.current) break
      
      // Generate realistic intermediate IPs
      const isTimeout = Math.random() < 0.1 // 10% chance of timeout
      const hop: TracerouteHop = {
        hop: i,
        ip: isTimeout ? '*' : `${Math.floor(Math.random() * 200) + 10}.${Math.floor(Math.random() * 255)}.${Math.floor(Math.random() * 255)}.${Math.floor(Math.random() * 255)}`,
        time: isTimeout ? 0 : Math.floor(Math.random() * 150) + 10,
        status: isTimeout ? 'timeout' : 'success'
      }
      
      // Last hop is the destination
      if (i === maxHops) {
        hop.ip = resolvedIp
        hop.hostname = cleanHost
      }
      
      hops.push(hop)
      setTracerouteHops([...hops])
    }
    
    setTracerouteRunning(false)
    setTracerouteComplete(true)
  }

  const stopTraceroute = () => {
    cancelRef.current = true
    setTracerouteRunning(false)
  }

  // ============ PING ============
  const runPing = async () => {
    if (!targetHost.trim()) return
    
    if (!isOnline) {
      toast.error('No internet connection. Ping requires an active internet connection.')
      return
    }
    
    const cleanHost = targetHost.replace(/^https?:\/\//, '').split('/')[0]
    setPingRunning(true)
    setPingResults([])
    setPingStats(null)
    cancelRef.current = false
    
    // Try native plugin first
    const networkTools = getNetworkTools()
    if (networkTools) {
      try {
        let listener: any = null
        const result = networkTools.addListener('pingProgress', (data) => {
          if (data.result) {
            setPingResults(prev => [...prev, data.result])
          }
          if (data.stats) {
            setPingStats(data.stats)
          }
        })
        
        // Handle both Promise and direct return
        if (result && typeof result.then === 'function') {
          listener = await result
        } else if (result && typeof result.remove === 'function') {
          listener = result
        }
        
        const pingResult = await networkTools.ping({ host: cleanHost, count: 20, timeout: 5000 })
        
        if (listener && typeof listener.remove === 'function') {
          try {
            listener.remove()
          } catch (e) {}
        }
        
        if (pingResult.success) {
          saveRecentHost(cleanHost, pingResult.resolvedIp)
          setPingStats({
            sent: pingResult.sent,
            received: pingResult.received,
            lost: pingResult.lost,
            min: pingResult.min,
            max: pingResult.max,
            avg: pingResult.avg,
            stdDev: pingResult.stdDev,
            times: pingResult.times
          })
        }
        
        setPingRunning(false)
        return
      } catch (e) {
        console.log('Native ping failed, using simulation')
      }
    }
    
    // Fallback to simulation
    const resolvedIp = await resolveHost(cleanHost)
    saveRecentHost(cleanHost, resolvedIp)
    
    const results: PingResult[] = []
    const times: number[] = []
    const pingCount = 20 // Number of pings
    
    for (let i = 1; i <= pingCount && !cancelRef.current; i++) {
      await new Promise(r => setTimeout(r, 500))
      
      if (cancelRef.current) break
      
      const isTimeout = Math.random() < 0.05 // 5% packet loss
      const time = isTimeout ? 0 : Math.floor(Math.random() * 80) + 10
      
      const result: PingResult = {
        seq: i,
        time,
        status: isTimeout ? 'timeout' : 'success'
      }
      
      results.push(result)
      if (!isTimeout) times.push(time)
      
      setPingResults([...results])
      
      // Update stats
      if (times.length > 0) {
        const min = Math.min(...times)
        const max = Math.max(...times)
        const avg = times.reduce((a, b) => a + b, 0) / times.length
        const variance = times.reduce((sum, t) => sum + Math.pow(t - avg, 2), 0) / times.length
        const stdDev = Math.sqrt(variance)
        
        setPingStats({
          sent: results.length,
          received: times.length,
          lost: results.length - times.length,
          min,
          max,
          avg: Math.round(avg * 10) / 10,
          stdDev: Math.round(stdDev * 10) / 10,
          times: [...times]
        })
      }
    }
    
    setPingRunning(false)
  }

  const stopPing = () => {
    cancelRef.current = true
    setPingRunning(false)
  }

  // ============ PORT SCANNER ============
  const runPortScan = async () => {
    if (!targetHost.trim()) return
    
    if (!isOnline) {
      toast.error('No internet connection. Port scanner requires an active internet connection.')
      return
    }
    
    const cleanHost = targetHost.replace(/^https?:\/\//, '').split('/')[0]
    setPortScanRunning(true)
    setPortResults([])
    setOpenPortsCount(0)
    cancelRef.current = false
    
    // Try native plugin first
    const networkTools = getNetworkTools()
    if (networkTools) {
      try {
        let listener: any = null
        const result = networkTools.addListener('portScanProgress', (data) => {
          if (data.port && data.port.status === 'open') {
            setPortResults(prev => [...prev, data.port])
            setOpenPortsCount(prev => prev + 1)
          }
        })
        
        // Handle both Promise and direct return
        if (result && typeof result.then === 'function') {
          listener = await result
        } else if (result && typeof result.remove === 'function') {
          listener = result
        }
        
        const scanResult = await networkTools.portScan({ host: cleanHost, ports: COMMON_PORTS, timeout: 3000 })
        
        if (listener && typeof listener.remove === 'function') {
          try {
            listener.remove()
          } catch (e) {}
        }
        
        if (scanResult.success) {
          saveRecentHost(cleanHost, scanResult.resolvedIp)
          setPortResults(scanResult.openPorts.map(p => ({
            port: p.port,
            status: 'open' as const,
            service: p.service,
            description: p.description
          })))
          setOpenPortsCount(result.openPorts.length)
        }
        
        setPortScanRunning(false)
        return
      } catch (e) {
        console.log('Native port scan failed, using simulation')
      }
    }
    
    // Fallback to simulation
    const resolvedIp = await resolveHost(cleanHost)
    saveRecentHost(cleanHost, resolvedIp)
    
    const results: PortResult[] = []
    let openCount = 0
    
    for (const port of COMMON_PORTS) {
      if (cancelRef.current) break
      
      await new Promise(r => setTimeout(r, 100 + Math.random() * 200))
      
      // Simulate port scan - common ports like 80, 443 are usually open on web servers
      const isOpen = (port === 80 || port === 443) ? Math.random() < 0.9 : Math.random() < 0.15
      const service = PORT_SERVICES[port] || { name: 'Unknown', description: 'Unknown Service' }
      
      if (isOpen) {
        results.push({
          port,
          status: 'open',
          service: service.name,
          description: service.description
        })
        openCount++
        setOpenPortsCount(openCount)
      }
      
      setPortResults([...results])
    }
    
    setPortScanRunning(false)
  }

  const stopPortScan = () => {
    cancelRef.current = true
    setPortScanRunning(false)
  }

  // Tool definitions for search, favorites, and recently used
  const allTools = [
    {
      id: 'ip-tools',
      name: t('tools.ipTools'),
      description: t('tools.ipUtilities'),
      icon: Globe,
      color: 'cyan',
      category: 'network'
    },
    {
      id: 'dns-tools',
      name: t('tools.dnsTools'),
      description: t('tools.dnsLookupTesting'),
      icon: Server,
      color: 'purple',
      category: 'network'
    },
    {
      id: 'wifi-security',
      name: t('tools.wifiSecurity'),
      description: t('tools.vulnerabilityTesting'),
      icon: Shield,
      color: 'red',
      category: 'security'
    },
    {
      id: 'web-tools',
      name: t('tools.webTools'),
      description: t('tools.seoWebAnalysis'),
      icon: Globe,
      color: 'blue',
      category: 'web'
    },
    {
      id: 'other-tools',
      name: t('tools.otherTools'),
      description: t('tools.securityUtilities'),
      icon: Server,
      color: 'emerald',
      category: 'utility'
    }
  ]

  // Filter tools based on search query
  const filteredTools = allTools.filter(tool =>
    tool.name.toLowerCase().includes(searchQuery.toLowerCase()) ||
    tool.description.toLowerCase().includes(searchQuery.toLowerCase()) ||
    tool.category.toLowerCase().includes(searchQuery.toLowerCase())
  )

  // Filter child tools based on search query
  const filteredSubTools = ALL_SUB_TOOLS.filter(tool =>
    tool.name.toLowerCase().includes(searchQuery.toLowerCase()) ||
    tool.category.toLowerCase().includes(searchQuery.toLowerCase()) ||
    tool.id.toLowerCase().includes(searchQuery.toLowerCase())
  )

  // ============ RENDER ============
  
  // Main tools menu
  if (currentView === 'main') {
    // Helper function to render tool cards (for categories only)
    const renderToolCard = (tool: any) => {
      const IconComponent = tool.icon
      
      return (
        <Card 
          key={tool.id}
          className={`bg-[#0d120d] border-${tool.color}-900/30 cursor-pointer hover:border-${tool.color}-500/50 transition-all`}
          onClick={() => setCurrentView(tool.id as ToolView)}
        >
          <CardContent className="p-4">
            <div className="flex flex-col items-center text-center gap-3">
              <div className={`w-14 h-14 rounded-xl bg-${tool.color}-500/20 flex items-center justify-center`}>
                <IconComponent className={`w-7 h-7 text-${tool.color}-400`} />
              </div>
              <div>
                <p className="font-medium text-white">{tool.name}</p>
                <p className="text-xs text-gray-500">{tool.description}</p>
              </div>
            </div>
          </CardContent>
        </Card>
      )
    }

    // Helper function to render sub-tool cards (for favorites and recently used)
    const renderSubToolCard = (toolId: string) => {
      const tool = getToolById(toolId)
      if (!tool) return null
      
      const IconComponent = tool.icon
      
      return (
        <Card 
          key={tool.id}
          className={`bg-[#1a1f1a] border-${tool.color}-900/30 cursor-pointer hover:border-${tool.color}-500/50 transition-all`}
          onClick={() => setCurrentView(tool.id as ToolView)}
        >
          <CardContent className="p-3">
            <div className="flex items-center gap-2">
              <div className={`w-8 h-8 rounded-lg bg-${tool.color}-500/20 flex items-center justify-center flex-shrink-0`}>
                <IconComponent className={`w-4 h-4 text-${tool.color}-400`} />
              </div>
              <div className="flex-1 min-w-0">
                <p className="text-sm font-medium text-white truncate">{tool.name}</p>
                <p className="text-xs text-gray-500 truncate">{tool.category}</p>
              </div>
            </div>
          </CardContent>
        </Card>
      )
    }

    // Get favorite and recent sub-tools
    const favoriteSubTools = favoriteTools.map(id => getToolById(id)).filter(Boolean)
    const recentSubTools = recentlyUsedTools.map(id => getToolById(id)).filter(Boolean)

    return (
      <div className="space-y-6">
        <div>
          <h2 className="text-xl font-bold text-white flex items-center gap-2">
            <Server className="w-5 h-5 text-orange-400" />
            {t('tools.title')}
          </h2>
        </div>

        {/* Search Bar */}
        <div className="relative">
          <Search className="absolute left-3 top-1/2 transform -translate-y-1/2 w-4 h-4 text-gray-400" />
          <Input
            placeholder="Search tools..."
            value={searchQuery}
            onChange={(e) => setSearchQuery(e.target.value)}
            className="bg-[#0d120d] border-gray-700 text-white pl-10 pr-10"
          />
          {searchQuery && (
            <Button
              variant="ghost"
              size="sm"
              className="absolute right-1 top-1/2 transform -translate-y-1/2 h-7 w-7 p-0 hover:bg-gray-800"
              onClick={() => setSearchQuery('')}
            >
              <X className="w-4 h-4 text-gray-400" />
            </Button>
          )}
        </div>

        {/* Favorites Section */}
        {favoriteSubTools.length > 0 && !searchQuery && (
          <div className="space-y-3">
            <div 
              className="flex items-center justify-between cursor-pointer"
              onClick={toggleFavoritesCollapse}
            >
              <h3 className="text-lg font-semibold text-white flex items-center gap-2">
                <Star className="w-4 h-4 text-yellow-400 fill-yellow-400" />
                Favorites
              </h3>
              {favoritesCollapsed ? (
                <ChevronDown className="w-4 h-4 text-gray-400" />
              ) : (
                <ChevronUp className="w-4 h-4 text-gray-400" />
              )}
            </div>
            {!favoritesCollapsed && (
              <div className="grid grid-cols-2 gap-3">
                {favoriteSubTools.map(tool => renderSubToolCard(tool!.id))}
              </div>
            )}
          </div>
        )}

        {/* Recently Used Section */}
        {recentSubTools.length > 0 && !searchQuery && (
          <div className="space-y-3">
            <div 
              className="flex items-center justify-between cursor-pointer"
              onClick={toggleRecentCollapse}
            >
              <h3 className="text-lg font-semibold text-white flex items-center gap-2">
                <Clock className="w-4 h-4 text-gray-400" />
                Recently Used
              </h3>
              {recentCollapsed ? (
                <ChevronDown className="w-4 h-4 text-gray-400" />
              ) : (
                <ChevronUp className="w-4 h-4 text-gray-400" />
              )}
            </div>
            {!recentCollapsed && (
              <div className="grid grid-cols-2 gap-3">
                {recentSubTools.slice(0, 6).map(tool => renderSubToolCard(tool!.id))}
              </div>
            )}
          </div>
        )}

        {/* All Tools Section */}
        <div className="space-y-3">
          <h3 className="text-lg font-semibold text-white flex items-center gap-2">
            <Server className="w-4 h-4 text-orange-400" />
            {searchQuery ? `Search Results (${filteredSubTools.length})` : 'All Tools'}
          </h3>
          {searchQuery ? (
            <div className="grid grid-cols-2 gap-3">
              {filteredSubTools.map(tool => renderSubToolCard(tool.id))}
            </div>
          ) : (
            <div className="grid grid-cols-2 gap-4">
              {allTools.map(renderToolCard)}
            </div>
          )}
        </div>

        {/* No results message */}
        {searchQuery && filteredSubTools.length === 0 && (
          <div className="text-center py-8">
            <p className="text-gray-400">No tools found matching "{searchQuery}"</p>
          </div>
        )}
      </div>
    )
  }

  // Traceroute View
  if (currentView === 'traceroute') {
    return (
      <div className="space-y-4">
        <div className="flex items-center justify-between">
          <Button 
            variant="ghost" 
            size="sm" 
            onClick={() => { setCurrentView('main'); stopTraceroute(); }}
            className="text-gray-400 hover:text-white"
          >
            <ArrowLeft className="w-4 h-4 mr-2" />
            {t('common.back')}
          </Button>
          {tracerouteRunning ? (
            <Button onClick={stopTraceroute} variant="destructive" size="sm">
              <Square className="w-4 h-4 mr-2" />
              {t('tools.stop')}
            </Button>
          ) : (
            <Button onClick={runTraceroute} className="bg-emerald-600 hover:bg-emerald-700" size="sm">
              <Play className="w-4 h-4 mr-2" />
              {t('tools.start')}
            </Button>
          )}
        </div>

        <div>
          <h2 className="text-xl font-bold text-white flex items-center gap-2">
            <Route className="w-5 h-5 text-emerald-400" />
            {t('tools.traceroute')}
          </h2>
          <p className="text-xs text-gray-500 mt-1">
            {t('tools.displayRoute')}
          </p>
        </div>

        <Input
          placeholder={t('tools.enterIpOrDomain')}
          value={targetHost}
          onChange={(e) => setTargetHost(e.target.value)}
          className="bg-[#0d120d] border-emerald-900/30 text-white"
          onKeyDown={(e) => e.key === 'Enter' && !tracerouteRunning && runTraceroute()}
        />

        <Button 
          onClick={runTraceroute} 
          disabled={tracerouteRunning || !targetHost.trim()}
          className="bg-emerald-600 hover:bg-emerald-700"
        >
          {t('tools.traceroute')}
        </Button>

        {/* Popular Targets */}
        <div className="space-y-2">
          <p className="text-sm text-gray-400">{t('tools.popularTargets')}</p>
          <div className="flex flex-wrap gap-2">
            {POPULAR_TARGETS.map(target => (
              <Badge 
                key={target}
                className="bg-emerald-900/20 text-emerald-400 cursor-pointer hover:bg-emerald-900/40"
                onClick={() => setTargetHost(target)}
              >
                {target}
              </Badge>
            ))}
          </div>
        </div>

        {/* Recent Hosts */}
        {recentHosts.length > 0 && (
          <div className="space-y-2">
            <div className="flex items-center justify-between">
              <p className="text-sm text-gray-400">{t('tools.recentHosts')}</p>
              <Button variant="ghost" size="sm" onClick={clearRecentHosts} className="text-gray-500 hover:text-red-400">
                <Trash2 className="w-4 h-4" />
              </Button>
            </div>
            <div className="space-y-1">
              {recentHosts.slice(0, 5).map((host, i) => (
                <Card 
                  key={i}
                  className="bg-[#0d120d] border-emerald-900/20 cursor-pointer hover:border-emerald-500/30"
                  onClick={() => setTargetHost(host.host)}
                >
                  <CardContent className="p-3 flex items-center gap-3">
                    <Globe className="w-4 h-4 text-gray-500" />
                    <div className="flex-1">
                      <p className="text-sm text-white">{host.host}</p>
                      {host.ip && <p className="text-xs text-gray-500">{host.ip}</p>}
                    </div>
                    <ChevronRight className="w-4 h-4 text-gray-600" />
                  </CardContent>
                </Card>
              ))}
            </div>
          </div>
        )}

        {/* Results */}
        {(tracerouteHops.length > 0 || tracerouteRunning) && (
          <Card className="bg-[#0d120d] border-emerald-900/30">
            <CardHeader className="pb-2">
              <div className="flex items-center justify-between">
                <CardTitle className="text-white text-sm flex items-center gap-2">
                  <Globe className="w-4 h-4 text-emerald-400" />
                  {t('tools.targetHost')}
                </CardTitle>
                <div className="flex items-center gap-2 text-xs text-gray-400">
                  <Wifi className="w-3 h-3" />
                  # {t('wifi.hops')}
                </div>
              </div>
              <div className="flex items-center justify-between text-xs">
                <span className="text-emerald-400">{targetHost}</span>
                <span className="text-white">{tracerouteHops.filter(h => h.status !== 'pending').length}</span>
              </div>
            </CardHeader>
            <CardContent>
              <ScrollArea className="h-[300px]">
                <div className="space-y-2">
                  {tracerouteHops.map((hop, i) => (
                    <div key={i} className="flex items-start gap-3">
                      <div className="flex flex-col items-center">
                        <div className={`w-3 h-3 rounded-full ${
                          hop.status === 'pending' ? 'bg-yellow-500 animate-pulse' :
                          hop.status === 'timeout' ? 'bg-gray-500' : 'bg-emerald-500'
                        }`} />
                        {i < tracerouteHops.length - 1 && (
                          <div className="w-0.5 h-8 bg-gray-700 mt-1" />
                        )}
                      </div>
                      <div className="flex-1 pb-2">
                        <div className="flex items-center justify-between">
                          <p className="text-white font-mono text-sm">
                            {hop.status === 'pending' ? '...' : hop.ip}
                          </p>
                          <Badge className="bg-gray-700 text-gray-300 text-[10px]">
                            Hop #{hop.hop}
                          </Badge>
                        </div>
                        {hop.hostname && (
                          <p className="text-xs text-emerald-400">{hop.hostname}</p>
                        )}
                        {hop.status !== 'pending' && (
                          <p className="text-xs text-gray-500">
                            {hop.status === 'timeout' ? t('tools.requestTimedOut') : `${hop.time} ms`}
                          </p>
                        )}
                      </div>
                    </div>
                  ))}
                </div>
              </ScrollArea>
            </CardContent>
          </Card>
        )}
      </div>
    )
  }


  // Ping View
  if (currentView === 'ping') {
    return (
      <div className="space-y-4">
        <div className="flex items-center justify-between">
          <Button 
            variant="ghost" 
            size="sm" 
            onClick={() => { setCurrentView('main'); stopPing(); }}
            className="text-gray-400 hover:text-white"
          >
            <ArrowLeft className="w-4 h-4 mr-2" />
            {t('common.back')}
          </Button>
          {pingRunning ? (
            <Button onClick={stopPing} variant="destructive" size="sm">
              <Square className="w-4 h-4 mr-2" />
              {t('tools.stop')}
            </Button>
          ) : (
            <Button onClick={runPing} className="bg-blue-600 hover:bg-blue-700" size="sm">
              <Play className="w-4 h-4 mr-2" />
              {t('tools.start')}
            </Button>
          )}
        </div>

        <div>
          <h2 className="text-xl font-bold text-white flex items-center gap-2">
            <Activity className="w-5 h-5 text-blue-400" />
            {t('tools.ping')}
          </h2>
          <p className="text-xs text-gray-500 mt-1">
            {t('tools.measuresRoundTrip')}
          </p>
        </div>

        <Input
          placeholder={t('tools.enterIpOrDomain')}
          value={targetHost}
          onChange={(e) => setTargetHost(e.target.value)}
          className="bg-[#0d120d] border-blue-900/30 text-white"
          onKeyDown={(e) => e.key === 'Enter' && !pingRunning && runPing()}
        />

        <Button 
          onClick={runPing} 
          disabled={pingRunning || !targetHost.trim()}
          className="bg-blue-600 hover:bg-blue-700"
        >
          {t('tools.ping')}
        </Button>

        {/* Popular Targets */}
        <div className="space-y-2">
          <p className="text-sm text-gray-400">{t('tools.popularTargets')}</p>
          <div className="flex flex-wrap gap-2">
            {POPULAR_TARGETS.map(target => (
              <Badge 
                key={target}
                className="bg-blue-900/20 text-blue-400 cursor-pointer hover:bg-blue-900/40"
                onClick={() => setTargetHost(target)}
              >
                {target}
              </Badge>
            ))}
          </div>
        </div>

        {/* Recent Hosts */}
        {recentHosts.length > 0 && (
          <div className="space-y-2">
            <div className="flex items-center justify-between">
              <p className="text-sm text-gray-400">{t('tools.recentHosts')}</p>
              <Button variant="ghost" size="sm" onClick={clearRecentHosts} className="text-gray-500 hover:text-red-400">
                <Trash2 className="w-4 h-4" />
              </Button>
            </div>
            <div className="space-y-1">
              {recentHosts.slice(0, 5).map((host, i) => (
                <Card 
                  key={i}
                  className="bg-[#0d120d] border-blue-900/20 cursor-pointer hover:border-blue-500/30"
                  onClick={() => setTargetHost(host.host)}
                >
                  <CardContent className="p-3 flex items-center gap-3">
                    <Globe className="w-4 h-4 text-gray-500" />
                    <div className="flex-1">
                      <p className="text-sm text-white">{host.host}</p>
                      {host.ip && <p className="text-xs text-gray-500">{host.ip}</p>}
                    </div>
                    <ChevronRight className="w-4 h-4 text-gray-600" />
                  </CardContent>
                </Card>
              ))}
            </div>
          </div>
        )}

        {/* Ping Stats */}
        {pingStats && (
          <Card className="bg-[#0d120d] border-blue-900/30">
            <CardHeader className="pb-2">
              <CardTitle className="text-white text-sm flex items-center gap-2">
                <Globe className="w-4 h-4 text-blue-400" />
                {t('tools.targetHost')}: <span className="text-blue-400">{targetHost}</span>
              </CardTitle>
            </CardHeader>
            <CardContent className="space-y-4">
              {/* Stats Grid */}
              <div className="space-y-3">
                <div className="flex items-center justify-between p-3 rounded bg-blue-900/10">
                  <div className="flex items-center gap-2">
                    <Activity className="w-4 h-4 text-blue-400" />
                    <span className="text-sm text-gray-300">{t('tools.averagePing')}</span>
                  </div>
                  <span className="text-white font-mono">{pingStats.avg} ms</span>
                </div>
                
                <div className="flex items-center justify-between p-3 rounded bg-emerald-900/10">
                  <div className="flex items-center gap-2">
                    <Download className="w-4 h-4 text-emerald-400" />
                    <span className="text-sm text-gray-300">{t('tools.minimumPing')}</span>
                  </div>
                  <span className="text-white font-mono">{pingStats.min} ms</span>
                </div>
                
                <div className="flex items-center justify-between p-3 rounded bg-orange-900/10">
                  <div className="flex items-center gap-2">
                    <Upload className="w-4 h-4 text-orange-400" />
                    <span className="text-sm text-gray-300">{t('tools.maximumPing')}</span>
                  </div>
                  <span className="text-white font-mono">{pingStats.max} ms</span>
                </div>
                
                <div className="flex items-center justify-between p-3 rounded bg-red-900/10">
                  <div className="flex items-center gap-2">
                    <span className="text-red-400">✕</span>
                    <span className="text-sm text-gray-300">{t('tools.packetLoss')}</span>
                  </div>
                  <span className="text-white font-mono">
                    {pingStats.sent > 0 ? ((pingStats.lost / pingStats.sent) * 100).toFixed(1) : 0} %
                  </span>
                </div>
                
                <div className="flex items-center justify-between p-3 rounded bg-purple-900/10">
                  <div className="flex items-center gap-2">
                    <span className="text-purple-400">σ</span>
                    <span className="text-sm text-gray-300">{t('tools.stdDev')}</span>
                  </div>
                  <span className="text-white font-mono">{pingStats.stdDev} ms</span>
                </div>
              </div>

              {/* Ping Graph */}
              {pingStats.times.length > 1 && (
                <div className="mt-4">
                  <PingGraph times={pingStats.times} />
                </div>
              )}
            </CardContent>
          </Card>
        )}
      </div>
    )
  }

  // Port Scanner View
  if (currentView === 'ports') {
    return (
      <div className="space-y-4">
        <div className="flex items-center justify-between">
          <Button 
            variant="ghost" 
            size="sm" 
            onClick={() => { setCurrentView('main'); stopPortScan(); }}
            className="text-gray-400 hover:text-white"
          >
            <ArrowLeft className="w-4 h-4 mr-2" />
            {t('common.back')}
          </Button>
          {portScanRunning && (
            <Button onClick={stopPortScan} variant="destructive" size="sm">
              <Square className="w-4 h-4 mr-2" />
              {t('tools.stop')}
            </Button>
          )}
        </div>

        <div>
          <h2 className="text-xl font-bold text-white flex items-center gap-2">
            <Server className="w-5 h-5 text-purple-400" />
            {t('tools.findOpenPorts')}
          </h2>
          <p className="text-xs text-gray-500 mt-1">
            {t('tools.probeTarget')}
          </p>
        </div>

        <Input
          placeholder={t('tools.enterIpOrDomain')}
          value={targetHost}
          onChange={(e) => setTargetHost(e.target.value)}
          className="bg-[#0d120d] border-purple-900/30 text-white"
          onKeyDown={(e) => e.key === 'Enter' && !portScanRunning && runPortScan()}
        />

        <Button 
          onClick={runPortScan} 
          disabled={portScanRunning || !targetHost.trim()}
          className="bg-purple-600 hover:bg-purple-700"
        >
          {t('tools.findOpenPorts')}
        </Button>

        {/* Popular Targets */}
        <div className="space-y-2">
          <p className="text-sm text-gray-400">{t('tools.popularTargets')}</p>
          <div className="flex flex-wrap gap-2">
            {POPULAR_TARGETS.map(target => (
              <Badge 
                key={target}
                className="bg-purple-900/20 text-purple-400 cursor-pointer hover:bg-purple-900/40"
                onClick={() => setTargetHost(target)}
              >
                {target}
              </Badge>
            ))}
          </div>
        </div>

        {/* Recent Hosts */}
        {recentHosts.length > 0 && (
          <div className="space-y-2">
            <div className="flex items-center justify-between">
              <p className="text-sm text-gray-400">{t('tools.recentHosts')}</p>
              <Button variant="ghost" size="sm" onClick={clearRecentHosts} className="text-gray-500 hover:text-red-400">
                <Trash2 className="w-4 h-4" />
              </Button>
            </div>
            <div className="space-y-1">
              {recentHosts.slice(0, 5).map((host, i) => (
                <Card 
                  key={i}
                  className="bg-[#0d120d] border-purple-900/20 cursor-pointer hover:border-purple-500/30"
                  onClick={() => setTargetHost(host.host)}
                >
                  <CardContent className="p-3 flex items-center gap-3">
                    <Globe className="w-4 h-4 text-gray-500" />
                    <div className="flex-1">
                      <p className="text-sm text-white">{host.host}</p>
                      {host.ip && <p className="text-xs text-gray-500">{host.ip}</p>}
                    </div>
                    <ChevronRight className="w-4 h-4 text-gray-600" />
                  </CardContent>
                </Card>
              ))}
            </div>
          </div>
        )}

        {/* Port Results */}
        {(portResults.length > 0 || portScanRunning) && (
          <Card className="bg-[#0d120d] border-purple-900/30">
            <CardHeader className="pb-2">
              <div className="flex items-center justify-between">
                <CardTitle className="text-white text-sm flex items-center gap-2">
                  <Globe className="w-4 h-4 text-purple-400" />
                  {t('tools.targetHost')}
                </CardTitle>
                <div className="flex items-center gap-2 text-xs text-gray-400">
                  <Server className="w-3 h-3" />
                  {t('tools.openPorts')}
                </div>
              </div>
              <div className="flex items-center justify-between text-xs">
                <span className="text-purple-400">{targetHost}</span>
                <span className="text-white">{openPortsCount}</span>
              </div>
            </CardHeader>
            <CardContent>
              {portScanRunning && portResults.length === 0 && (
                <div className="text-center py-4">
                  <div className="animate-spin w-6 h-6 border-2 border-purple-500 border-t-transparent rounded-full mx-auto mb-2" />
                  <p className="text-sm text-gray-400">{t('tools.scanningPorts')}</p>
                </div>
              )}
              
              <div className="space-y-2">
                {portResults.map((port, i) => (
                  <div key={i} className="flex items-center gap-4 p-3 rounded bg-purple-900/10 border-l-4 border-blue-500">
                    <div className="w-16 text-center">
                      <p className="text-2xl font-bold text-blue-400">{port.port}</p>
                    </div>
                    <div className="flex-1">
                      <p className="text-white font-medium">{port.service}</p>
                      <p className="text-xs text-gray-500">{port.description}</p>
                    </div>
                  </div>
                ))}
              </div>
              
              {!portScanRunning && portResults.length === 0 && (
                <p className="text-center text-gray-500 py-4">{t('tools.noOpenPorts')}</p>
              )}
            </CardContent>
          </Card>
        )}
      </div>
    )
  }


  // IP Tools View
  if (currentView === 'ip-tools') {
    return <IPTools onBack={() => setCurrentView('main')} />
  }

  // DNS Tools View
  if (currentView === 'dns-tools') {
    return <DNSTools onBack={() => setCurrentView('main')} />
  }

  // Web Tools View
  if (currentView === 'web-tools') {
    return <WebTools onBack={() => setCurrentView('main')} />
  }

  // Other Tools View
  if (currentView === 'other-tools') {
    return <OtherTools onBack={() => setCurrentView('main')} onSpeedTest={() => setCurrentView('speed-test')} />
  }

  // WiFi Security View
  if (currentView === 'wifi-security') {
    return <WiFiSecurity onBack={() => setCurrentView('main')} />
  }

  // Speed Test View
  if (currentView === 'speed-test') {
    return (
      <div className="space-y-4">
        <div className="flex items-center justify-between">
          <Button 
            variant="ghost" 
            size="sm" 
            onClick={() => setCurrentView('main')}
            className="text-gray-400 hover:text-white"
          >
            <ArrowLeft className="w-4 h-4 mr-2" />
            {t('common.back')}
          </Button>
          <Button 
            onClick={runRealSpeedTest} 
            disabled={isSpeedTestRunning}
            className="bg-yellow-600 hover:bg-yellow-700"
          >
            {isSpeedTestRunning ? t('tools.testing') : t('tools.runTest')}
          </Button>
        </div>

        <div>
          <h2 className="text-xl font-bold text-white flex items-center gap-2">
            <Gauge className="w-5 h-5 text-yellow-400" />
            {t('speedTest.title')}
          </h2>
          <p className="text-xs text-gray-500 mt-1">
            {t('tools.testRealSpeed')}
          </p>
        </div>

        {/* Running Test UI */}
        {isSpeedTestRunning && (
          <Card className="bg-[#0d120d] border-yellow-900/30">
            <CardContent className="p-6">
              <div className="text-center mb-4">
                <div className={`text-lg font-medium ${getPhaseColor(currentPhase)}`}>
                  {currentPhase === 'ping' && `🏓 ${t('tools.testingLatency')}`}
                  {currentPhase === 'download' && `⬇️ ${t('tools.testingDownload')}`}
                  {currentPhase === 'upload' && `⬆️ ${t('tools.testingUpload')}`}
                </div>
                <p className="text-sm text-gray-400 mt-1">{statusMessage}</p>
              </div>
              
              {/* Progress bars for each phase */}
              <div className="space-y-3">
                <div className="space-y-1">
                  <div className="flex justify-between text-xs">
                    <span className="text-yellow-400">{t('speedTest.ping')}</span>
                    <span className="text-gray-500">{currentPhase === 'ping' ? `${phaseProgress}%` : currentPhase !== 'ping' && currentPhase !== '' ? '✓' : ''}</span>
                  </div>
                  <div className="h-2 bg-gray-800 rounded-full overflow-hidden">
                    <div 
                      className="h-full bg-yellow-500 rounded-full transition-all duration-300"
                      style={{ width: currentPhase === 'ping' ? `${phaseProgress}%` : currentPhase !== '' ? '100%' : '0%' }}
                    />
                  </div>
                </div>
                
                <div className="space-y-1">
                  <div className="flex justify-between text-xs">
                    <span className="text-emerald-400">{t('speedTest.download')}</span>
                    <span className="text-gray-500">{currentPhase === 'download' ? `${phaseProgress}%` : currentPhase === 'upload' ? '✓' : ''}</span>
                  </div>
                  <div className="h-2 bg-gray-800 rounded-full overflow-hidden">
                    <div 
                      className="h-full bg-emerald-500 rounded-full transition-all duration-300"
                      style={{ width: currentPhase === 'download' ? `${phaseProgress}%` : currentPhase === 'upload' ? '100%' : '0%' }}
                    />
                  </div>
                </div>
                
                <div className="space-y-1">
                  <div className="flex justify-between text-xs">
                    <span className="text-blue-400">{t('speedTest.upload')}</span>
                    <span className="text-gray-500">{currentPhase === 'upload' ? `${phaseProgress}%` : ''}</span>
                  </div>
                  <div className="h-2 bg-gray-800 rounded-full overflow-hidden">
                    <div 
                      className="h-full bg-blue-500 rounded-full transition-all duration-300"
                      style={{ width: currentPhase === 'upload' ? `${phaseProgress}%` : '0%' }}
                    />
                  </div>
                </div>
              </div>
            </CardContent>
          </Card>
        )}

        {/* Results */}
        {testResults && !isSpeedTestRunning && (
          <div className="space-y-4">
            {/* Main Speed Display */}
            <Card className="bg-gradient-to-br from-emerald-900/20 to-blue-900/20 border-emerald-500/30">
              <CardContent className="p-6">
                <div className="grid grid-cols-2 gap-6">
                  <div className="text-center">
                    <Download className="w-10 h-10 mx-auto text-emerald-400 mb-2" />
                    <p className="text-4xl font-bold text-white">{testResults.download}</p>
                    <p className="text-sm text-gray-400">{t('speedTest.mbps')} {t('speedTest.download')}</p>
                    <Badge className={`mt-2 ${getSpeedQuality(parseFloat(testResults.download)).color.replace('text-', 'bg-').replace('-400', '-500/20')} ${getSpeedQuality(parseFloat(testResults.download)).color}`}>
                      {getSpeedQuality(parseFloat(testResults.download)).label}
                    </Badge>
                  </div>
                  <div className="text-center">
                    <Upload className="w-10 h-10 mx-auto text-blue-400 mb-2" />
                    <p className="text-4xl font-bold text-white">{testResults.upload}</p>
                    <p className="text-sm text-gray-400">{t('speedTest.mbps')} {t('speedTest.upload')}</p>
                    <Badge className={`mt-2 ${getSpeedQuality(parseFloat(testResults.upload)).color.replace('text-', 'bg-').replace('-400', '-500/20')} ${getSpeedQuality(parseFloat(testResults.upload)).color}`}>
                      {getSpeedQuality(parseFloat(testResults.upload)).label}
                    </Badge>
                  </div>
                </div>
              </CardContent>
            </Card>

            {/* Latency Stats */}
            <div className="grid grid-cols-2 gap-4">
              <Card className="bg-[#0d120d] border-yellow-900/30">
                <CardContent className="p-4 text-center">
                  <Activity className="w-6 h-6 mx-auto text-yellow-400 mb-1" />
                  <p className="text-2xl font-bold text-white">{testResults.ping}</p>
                  <p className="text-xs text-gray-500">{t('speedTest.ms')} {t('speedTest.ping')}</p>
                  <Badge className={`mt-1 text-[10px] ${getPingQuality(testResults.ping).color.replace('text-', 'bg-').replace('-400', '-500/20')} ${getPingQuality(testResults.ping).color}`}>
                    {getPingQuality(testResults.ping).label}
                  </Badge>
                </CardContent>
              </Card>
              <Card className="bg-[#0d120d] border-purple-900/30">
                <CardContent className="p-4 text-center">
                  <Activity className="w-6 h-6 mx-auto text-purple-400 mb-1" />
                  <p className="text-2xl font-bold text-white">{testResults.jitter}</p>
                  <p className="text-xs text-gray-500">{t('speedTest.ms')} {t('speedTest.jitter')}</p>
                </CardContent>
              </Card>
            </div>

            {/* Test Info */}
            <Card className="bg-[#0d120d] border-emerald-900/30">
              <CardContent className="p-4">
                <div className="flex items-center justify-between text-xs text-gray-500">
                  <span>{t('tools.testCompletedAt')} {testResults.timestamp.toLocaleTimeString()}</span>
                  <span>{t('tools.server')}: Cloudflare CDN</span>
                </div>
              </CardContent>
            </Card>
          </div>
        )}

        {/* History */}
        {testHistory.length > 0 && !isSpeedTestRunning && (
          <Card className="bg-[#0d120d] border-emerald-900/30">
            <CardHeader className="pb-2">
              <div className="flex items-center justify-between">
                <CardTitle className="text-white text-sm flex items-center gap-2">
                  <Clock className="w-4 h-4 text-gray-400" />
                  {t('tools.recentTests')}
                </CardTitle>
                <Button 
                  variant="ghost" 
                  size="sm" 
                  onClick={() => {
                    setTestHistory([])
                    localStorage.removeItem('thirdeye_speed_history')
                  }}
                  className="text-gray-500 hover:text-red-400 h-6 px-2"
                >
                  <Trash2 className="w-4 h-4" />
                </Button>
              </div>
            </CardHeader>
            <CardContent>
              <div className="space-y-2">
                {testHistory.slice(0, 5).map((test, i) => (
                  <div key={i} className="flex items-center justify-between p-2 rounded bg-emerald-900/10 text-xs">
                    <span className="text-gray-400">{test.timestamp instanceof Date ? test.timestamp.toLocaleTimeString() : new Date(test.timestamp).toLocaleTimeString()}</span>
                    <div className="flex items-center gap-4">
                      <span className="text-emerald-400">↓ {test.download} {t('speedTest.mbps')}</span>
                      <span className="text-blue-400">↑ {test.upload} {t('speedTest.mbps')}</span>
                      <span className="text-yellow-400">{test.ping}{t('speedTest.ms')}</span>
                    </div>
                  </div>
                ))}
              </div>
            </CardContent>
          </Card>
        )}

        {/* Empty State */}
        {!testResults && !isSpeedTestRunning && (
          <Card className="bg-[#0d120d] border-yellow-900/30">
            <CardContent className="p-8 text-center">
              <Gauge className="w-12 h-12 mx-auto text-gray-600 mb-3" />
              <p className="text-gray-400">{t('tools.noSpeedTestResults')}</p>
              <p className="text-xs text-gray-600 mt-1">{t('tools.tapRunTest')}</p>
            </CardContent>
          </Card>
        )}

        {/* Info Card */}
        <Card className="bg-[#0d120d] border-gray-800">
          <CardContent className="p-4">
            <p className="text-xs text-gray-500 text-center">
              {isCapacitor 
                ? 'Speed test uses Cloudflare CDN servers for accurate results. Results may vary based on network conditions and server load.'
                : 'Running in web mode - speed test requires native app for accurate results.'}
            </p>
          </CardContent>
        </Card>
      </div>
    )
  }

  return null
}

// Ping Graph Component
function PingGraph({ times }: { times: number[] }) {
  const maxTime = Math.max(...times, 1)
  const minTime = Math.min(...times)
  const height = 120
  const width = 300
  const padding = 30
  
  // Calculate points for the line
  const points = times.map((time, i) => {
    const x = padding + (i / (times.length - 1)) * (width - padding * 2)
    const y = height - padding - ((time - minTime) / (maxTime - minTime || 1)) * (height - padding * 2)
    return `${x},${y}`
  }).join(' ')

  // Y-axis labels
  const yLabels = [maxTime, Math.round((maxTime + minTime) / 2), minTime]

  return (
    <div className="relative">
      <svg viewBox={`0 0 ${width} ${height}`} className="w-full h-32">
        {/* Grid lines */}
        {[0, 1, 2, 3].map(i => (
          <line
            key={i}
            x1={padding}
            y1={padding + i * ((height - padding * 2) / 3)}
            x2={width - padding}
            y2={padding + i * ((height - padding * 2) / 3)}
            stroke="#333"
            strokeDasharray="2,2"
          />
        ))}
        
        {/* Y-axis labels */}
        {yLabels.map((label, i) => (
          <text
            key={i}
            x={padding - 5}
            y={padding + i * ((height - padding * 2) / 2)}
            fill="#666"
            fontSize="10"
            textAnchor="end"
            dominantBaseline="middle"
          >
            {label}
          </text>
        ))}
        
        {/* Line */}
        <polyline
          points={points}
          fill="none"
          stroke="#3b82f6"
          strokeWidth="2"
          strokeLinecap="round"
          strokeLinejoin="round"
        />
        
        {/* Dots */}
        {times.map((time, i) => {
          const x = padding + (i / (times.length - 1)) * (width - padding * 2)
          const y = height - padding - ((time - minTime) / (maxTime - minTime || 1)) * (height - padding * 2)
          return (
            <circle
              key={i}
              cx={x}
              cy={y}
              r="3"
              fill="#3b82f6"
            />
          )
        })}
      </svg>
    </div>
  )
}
