'use client'

import { useState, useEffect, useCallback, useRef } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Badge } from '@/components/ui/badge'
import { Tabs, TabsContent, TabsList, TabsTrigger } from '@/components/ui/tabs'
import {
  Play,
  Square,
  Activity,
  Smartphone,
  Globe,
  ShieldAlert,
  Trash2,
  Zap
} from 'lucide-react'
import { getPacketSniffer, isCapacitor, type LiveStats, type AppTrafficSummary, type ConnectionLog } from '@/lib/native-plugins'
import { toast } from 'sonner'
import { AppTrafficList } from './AppTrafficList'
import { TrafficTimeline } from './TrafficTimeline'
import { SuspiciousAlerts } from './SuspiciousAlerts'
import { ConnectionMap } from './ConnectionMap'
import { useI18n } from '@/lib/i18n'

export function PacketSnifferDashboard() {
  const { t } = useI18n()
  const [capturing, setCapturing] = useState(false)
  const [duration, setDuration] = useState(0)
  const [stats, setStats] = useState<LiveStats>({
    capturing: false,
    totalPackets: 0,
    totalBytes: 0,
    activeApps: 0,
    uniqueCountries: 0,
    suspiciousCount: 0,
    duration: 0
  })
  const [apps, setApps] = useState<AppTrafficSummary[]>([])
  const [connections, setConnections] = useState<ConnectionLog[]>([])
  const [alerts, setAlerts] = useState<ConnectionLog[]>([])
  const [countries, setCountries] = useState<any[]>([])
  const [activeTab, setActiveTab] = useState('apps')
  const [loading, setLoading] = useState(false)

  const statsIntervalRef = useRef<NodeJS.Timeout | null>(null)
  const durationIntervalRef = useRef<NodeJS.Timeout | null>(null)
  const newConnectionListenerRef = useRef<{ remove: () => void } | null>(null)
  const suspiciousListenerRef = useRef<{ remove: () => void } | null>(null)

  // Check initial capture state
  useEffect(() => {
    if (!isCapacitor) return

    const checkInitialState = async () => {
      try {
        const plugin = getPacketSniffer()
        if (!plugin) return

        const { capturing: isCapturing } = await plugin.isCapturing()
        
        // Only update the UI state, don't auto-resume capture
        // User must explicitly start capture again
        if (isCapturing) {
          // Stop any lingering capture from previous session
          await plugin.stopCapture()
          setCapturing(false)
        }
      } catch (error) {
        console.error('Failed to check capture state:', error)
      }
    }

    checkInitialState()

    return () => {
      cleanup()
    }
  }, [])

  // Duration timer
  useEffect(() => {
    if (capturing) {
      durationIntervalRef.current = setInterval(() => {
        setDuration(prev => prev + 1)
      }, 1000)
    } else {
      if (durationIntervalRef.current) {
        clearInterval(durationIntervalRef.current)
        durationIntervalRef.current = null
      }
      setDuration(0)
    }

    return () => {
      if (durationIntervalRef.current) {
        clearInterval(durationIntervalRef.current)
      }
    }
  }, [capturing])

  const startPolling = useCallback(() => {
    if (statsIntervalRef.current) return

    statsIntervalRef.current = setInterval(async () => {
      try {
        const plugin = getPacketSniffer()
        if (!plugin) return

        const result = await plugin.getLiveStats()
        if (result.success && result.stats) {
          setStats(result.stats)
        }
      } catch (error) {
        console.error('Failed to fetch live stats:', error)
      }
    }, 2000)
  }, [])

  const stopPolling = useCallback(() => {
    if (statsIntervalRef.current) {
      clearInterval(statsIntervalRef.current)
      statsIntervalRef.current = null
    }
  }, [])

  const setupListeners = useCallback(async () => {
    try {
      const plugin = getPacketSniffer()
      if (!plugin) return

      // Listen for new connections
      try {
        const result = plugin.addListener('newConnection', (connection: ConnectionLog) => {
          setConnections(prev => [connection, ...prev].slice(0, 200))
        })
        
        // Handle both Promise and direct return
        if (result && typeof result.then === 'function') {
          result.then(handle => {
            newConnectionListenerRef.current = handle
          }).catch(() => {})
        } else if (result && typeof result.remove === 'function') {
          newConnectionListenerRef.current = result
        }
      } catch (e) {
        console.warn('Failed to add newConnection listener:', e)
      }

      // Listen for suspicious activity
      try {
        const result = plugin.addListener('suspiciousDetected', (alert: ConnectionLog) => {
          setAlerts(prev => [alert, ...prev])
          toast.error('Suspicious Activity Detected', {
            description: `${alert.appName} - ${alert.suspiciousReason?.substring(0, 60)}...`
          })
        })
        
        // Handle both Promise and direct return
        if (result && typeof result.then === 'function') {
          result.then(handle => {
            suspiciousListenerRef.current = handle
          }).catch(() => {})
        } else if (result && typeof result.remove === 'function') {
          suspiciousListenerRef.current = result
        }
      } catch (e) {
        console.warn('Failed to add suspiciousDetected listener:', e)
      }
    } catch (error) {
      console.error('Failed to setup listeners:', error)
    }
  }, [])

  const cleanup = useCallback(() => {
    stopPolling()
    if (newConnectionListenerRef.current) {
      try {
        if (typeof newConnectionListenerRef.current.remove === 'function') {
          newConnectionListenerRef.current.remove()
        }
      } catch (e) {}
      newConnectionListenerRef.current = null
    }
    if (suspiciousListenerRef.current) {
      try {
        if (typeof suspiciousListenerRef.current.remove === 'function') {
          suspiciousListenerRef.current.remove()
        }
      } catch (e) {}
      suspiciousListenerRef.current = null
    }
    
    // Also remove all listeners as safety net
    try {
      const plugin = getPacketSniffer()
      plugin?.removeAllListeners()
    } catch (e) {}
  }, [stopPolling])

  const handleStartStop = async () => {
    if (!isCapacitor) {
      toast.error('Not Available', {
        description: 'Install ThirdEye on Android to use Traffic Monitor'
      })
      return
    }

    const plugin = getPacketSniffer()
    if (!plugin) {
      toast.error('Plugin not available')
      return
    }

    try {
      if (capturing) {
        // Stop capture
        const result = await plugin.stopCapture()
        if (result.success) {
          setCapturing(false)
          stopPolling()
          cleanup()
          // Final data fetch
          await fetchAllData()
          toast.success('Capture stopped')
        } else {
          toast.error('Failed to stop capture', {
            description: result.error
          })
        }
      } else {
        // Start capture
        const result = await plugin.startCapture()
        if (result.success) {
          setCapturing(true)
          setDuration(0)
          startPolling()
          setupListeners()
          toast.success('Capture started', {
            description: 'Monitoring network traffic...'
          })
        } else {
          toast.error('Failed to start capture', {
            description: result.error || 'VPN permission may be required'
          })
        }
      }
    } catch (error: any) {
      toast.error('Error', {
        description: error.message || 'An error occurred'
      })
    }
  }

  const handleClearLogs = async () => {
    if (!isCapacitor) return

    const plugin = getPacketSniffer()
    if (!plugin) return

    try {
      const result = await plugin.clearLogs()
      if (result.success) {
        setConnections([])
        setAlerts([])
        setApps([])
        setStats({
          capturing: false,
          totalPackets: 0,
          totalBytes: 0,
          activeApps: 0,
          uniqueCountries: 0,
          suspiciousCount: 0,
          duration: 0
        })
        toast.success('Logs cleared')
      } else {
        toast.error('Failed to clear logs', {
          description: result.error
        })
      }
    } catch (error: any) {
      toast.error('Error clearing logs', {
        description: error.message
      })
    }
  }

  const fetchAllData = async () => {
    if (!isCapacitor) return

    const plugin = getPacketSniffer()
    if (!plugin) return

    try {
      const [appsResult, connectionsResult, alertsResult, countriesResult] = await Promise.all([
        plugin.getAppTraffic(),
        plugin.getRecentConnections({ limit: 200 }),
        plugin.getSuspiciousActivity(),
        plugin.getCountryTraffic()
      ])

      if (appsResult.success && appsResult.apps) {
        setApps(appsResult.apps)
      }
      if (connectionsResult.success && connectionsResult.connections) {
        setConnections(connectionsResult.connections)
      }
      if (alertsResult.success && alertsResult.alerts) {
        setAlerts(alertsResult.alerts)
      }
      if (countriesResult.success && countriesResult.countries) {
        setCountries(countriesResult.countries)
      }
    } catch (error) {
      console.error('Failed to fetch data:', error)
    }
  }

  // Fetch data when tab changes
  useEffect(() => {
    if (!isCapacitor) return

    const fetchTabData = async () => {
      const plugin = getPacketSniffer()
      if (!plugin) return

      setLoading(true)
      try {
        if (activeTab === 'apps') {
          const result = await plugin.getAppTraffic()
          if (result.success && result.apps) {
            setApps(result.apps)
          }
        } else if (activeTab === 'map') {
          const result = await plugin.getCountryTraffic()
          if (result.success && result.countries) {
            setCountries(result.countries)
          }
        } else if (activeTab === 'timeline') {
          const result = await plugin.getRecentConnections({ limit: 200 })
          if (result.success && result.connections) {
            setConnections(result.connections)
          }
        } else if (activeTab === 'alerts') {
          const result = await plugin.getSuspiciousActivity()
          if (result.success && result.alerts) {
            setAlerts(result.alerts)
          }
        }
      } catch (error) {
        console.error('Failed to fetch tab data:', error)
      } finally {
        setLoading(false)
      }
    }

    fetchTabData()
  }, [activeTab])

  const formatDuration = (seconds: number) => {
    const h = Math.floor(seconds / 3600)
    const m = Math.floor((seconds % 3600) / 60)
    const s = seconds % 60
    return `${h.toString().padStart(2, '0')}:${m.toString().padStart(2, '0')}:${s.toString().padStart(2, '0')}`
  }

  if (!isCapacitor) {
    return (
      <div className="flex items-center justify-center min-h-[400px]">
        <Card className="bg-[#0d120d] border-cyan-900/30 max-w-md">
          <CardContent className="p-8 text-center">
            <ShieldAlert className="w-16 h-16 text-cyan-400 mx-auto mb-4" />
            <h3 className="text-xl font-bold text-white mb-2">Android Only</h3>
            <p className="text-gray-400">
              Install ThirdEye on Android to use Traffic Monitor
            </p>
          </CardContent>
        </Card>
      </div>
    )
  }

  return (
    <div className="space-y-4">
      {/* Capture Control Bar */}
      <Card className="bg-[#0d120d] border-gray-700/50">
        <CardContent className="p-4">
          <div className="flex items-center justify-between gap-4">
            <div className="flex items-center gap-4">
              <Button
                onClick={handleStartStop}
                className={capturing 
                  ? 'bg-red-500 hover:bg-red-600 text-white' 
                  : 'bg-green-500 hover:bg-green-600 text-white'
                }
              >
                {capturing ? (
                  <>
                    <Square className="w-4 h-4 mr-2" />
                    Stop Capture
                    <span className="ml-2 w-2 h-2 bg-red-300 rounded-full animate-pulse" />
                  </>
                ) : (
                  <>
                    <Play className="w-4 h-4 mr-2" />
                    Start Capture
                  </>
                )}
              </Button>

              <div className="flex flex-col">
                <span className="text-2xl font-mono font-bold text-white">
                  {formatDuration(duration)}
                </span>
                <span className="text-xs text-gray-300">
                  {capturing ? 'Monitoring...' : 'Stopped'}
                </span>
              </div>
            </div>

            <Button
              variant="ghost"
              size="icon"
              onClick={handleClearLogs}
              className="text-gray-300 hover:text-red-400"
            >
              <Trash2 className="w-4 h-4" />
            </Button>
          </div>
        </CardContent>
      </Card>

      {/* Live Stats Cards */}
      <div className="grid grid-cols-2 md:grid-cols-4 gap-3">
        <Card className="bg-[#0d120d] border-gray-700/50">
          <CardContent className="p-4 text-center">
            <Zap className="w-8 h-8 text-cyan-400 mx-auto mb-2" />
            <div className="text-3xl font-bold text-white mb-1">
              {stats.totalPackets.toLocaleString()}
            </div>
            <div className="text-xs text-gray-300">{t('traffic.packets')}</div>
          </CardContent>
        </Card>

        <Card className="bg-[#0d120d] border-gray-700/50">
          <CardContent className="p-4 text-center">
            <Smartphone className="w-8 h-8 text-purple-400 mx-auto mb-2" />
            <div className="text-3xl font-bold text-white mb-1">
              {stats.activeApps}
            </div>
            <div className="text-xs text-gray-300">{t('traffic.activeApps')}</div>
          </CardContent>
        </Card>

        <Card className="bg-[#0d120d] border-gray-700/50">
          <CardContent className="p-4 text-center">
            <Globe className="w-8 h-8 text-green-400 mx-auto mb-2" />
            <div className="text-3xl font-bold text-white mb-1">
              {stats.uniqueCountries}
            </div>
            <div className="text-xs text-gray-300">Countries</div>
          </CardContent>
        </Card>

        <Card className="bg-[#0d120d] border-gray-700/50">
          <CardContent className="p-4 text-center relative">
            <ShieldAlert className="w-8 h-8 text-red-400 mx-auto mb-2" />
            <div className="text-3xl font-bold text-white mb-1">
              {stats.suspiciousCount}
            </div>
            <div className="text-xs text-gray-300">Alerts</div>
            {stats.suspiciousCount > 0 && (
              <span className="absolute top-2 right-2 w-3 h-3 bg-red-500 rounded-full animate-pulse" />
            )}
          </CardContent>
        </Card>
      </div>

      {/* Tab Navigation */}
      <Tabs value={activeTab} onValueChange={setActiveTab} className="w-full">
        <TabsList className="grid w-full grid-cols-4 bg-[#0d120d] border border-gray-700/50">
          <TabsTrigger value="apps" className="data-[state=active]:bg-cyan-900/30 data-[state=active]:text-cyan-300 text-gray-300">
            Apps
          </TabsTrigger>
          <TabsTrigger value="map" className="data-[state=active]:bg-cyan-900/30 data-[state=active]:text-cyan-300 text-gray-300">
            Map
          </TabsTrigger>
          <TabsTrigger value="timeline" className="data-[state=active]:bg-cyan-900/30 data-[state=active]:text-cyan-300 text-gray-300">
            Timeline
          </TabsTrigger>
          <TabsTrigger value="alerts" className="data-[state=active]:bg-cyan-900/30 data-[state=active]:text-cyan-300 text-gray-300">
            Alerts
          </TabsTrigger>
        </TabsList>

        <TabsContent value="apps" className="mt-4">
          <AppTrafficList apps={apps} loading={loading} />
        </TabsContent>

        <TabsContent value="map" className="mt-4">
          <ConnectionMap countries={countries} loading={loading} />
        </TabsContent>

        <TabsContent value="timeline" className="mt-4">
          <TrafficTimeline connections={connections} loading={loading} />
        </TabsContent>

        <TabsContent value="alerts" className="mt-4">
          <SuspiciousAlerts alerts={alerts} loading={loading} />
        </TabsContent>
      </Tabs>
    </div>
  )
}
