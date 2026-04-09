'use client'

import { useState, useEffect } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Badge } from '@/components/ui/badge'
import { ScrollArea } from '@/components/ui/scroll-area'
import {
  Shield,
  ShieldAlert,
  TrendingUp,
  Activity,
  CheckCircle2,
  AlertTriangle,
  Trash2,
  RefreshCw,
  Database,
  Clock,
  Router,
  Settings
} from 'lucide-react'
import { DeviceAlert, DeviceDataUsage, getDeviceMonitor } from '@/lib/device-monitor'
import { SimpleDeviceAlert, getSimpleDeviceMonitor } from '@/lib/simple-device-monitor'
import { getNetworkScanner } from '@/lib/native-plugins'
import { notificationService } from '@/lib/notification-service'
import { toast } from 'sonner'
import { RouterSetupDialog } from './RouterSetupDialog'
import { useI18n } from '@/lib/i18n'

interface DeviceMonitorPanelProps {
  networkDevices?: any[]
  isConnected?: boolean
  gatewayIP?: string
}

export function DeviceMonitorPanel({ networkDevices = [], isConnected, gatewayIP }: DeviceMonitorPanelProps) {
  const [alerts, setAlerts] = useState<SimpleDeviceAlert[]>([])
  const [topUsage, setTopUsage] = useState<DeviceDataUsage[]>([])
  const [loading, setLoading] = useState(false)
  const [monitoring, setMonitoring] = useState(false)
  const [showRouterSetup, setShowRouterSetup] = useState(false)
  const [useSimpleMode, setUseSimpleMode] = useState(true) // Use simple mode by default
  const [detectedGatewayIP, setDetectedGatewayIP] = useState(gatewayIP || '')
  const [isFirstLaunch, setIsFirstLaunch] = useState(false)
  const [hasRouterCredentials, setHasRouterCredentials] = useState(false)
  const [stats, setStats] = useState({
    totalAlerts: 0,
    unknownDevices: 0,
    highUsageDevices: 0
  })

  // Auto-detect gateway IP on mount if not provided
  useEffect(() => {
    if (!gatewayIP) {
      const detectGateway = async () => {
        try {
          const scanner = getNetworkScanner()
          if (scanner) {
            const info = await scanner.getNetworkInfo()
            if (info.success && info.gateway) {
              setDetectedGatewayIP(info.gateway)
            }
          }
        } catch (error) {
          console.error('Failed to auto-detect gateway:', error)
        }
      }
      detectGateway()
    }
  }, [gatewayIP])

  // Update detected gateway when prop changes
  useEffect(() => {
    if (gatewayIP) {
      setDetectedGatewayIP(gatewayIP)
    }
  }, [gatewayIP])

  // Check router credentials on mount
  useEffect(() => {
    checkRouterCredentials()
  }, [])

  const checkRouterCredentials = async () => {
    try {
      const monitor = getDeviceMonitor()
      const hasCredentials = await monitor.hasRouterCredentials()
      setHasRouterCredentials(hasCredentials)

      if (!hasCredentials) {
        console.log('⚠️ No router credentials configured')
      }
    } catch (error) {
      console.error('Failed to check router credentials:', error)
    }
  }

  // Check if first launch
  useEffect(() => {
    const checkFirstLaunch = async () => {
      try {
        const response = await fetch('/api/device-monitor/known-devices')
        const data = await response.json()
        if (data.success) {
          const hasDevices = data.devices && data.devices.length > 0
          setIsFirstLaunch(!hasDevices)
          if (!hasDevices) {
            console.log('🆕 First launch detected')
          }
        }
      } catch (error) {
        console.error('Failed to check first launch:', error)
      }
    }
    checkFirstLaunch()
  }, [])

  // Load alerts and usage data
  useEffect(() => {
    if (!isFirstLaunch && hasRouterCredentials) {
      loadAlerts()
      loadTopUsage()
      const interval = setInterval(() => {
        loadAlerts()
        loadTopUsage()
      }, 10000) // Refresh every 10 seconds
      return () => clearInterval(interval)
    }
  }, [isFirstLaunch, hasRouterCredentials])

  // Update stats when alerts change
  useEffect(() => {
    const unknownCount = alerts.filter(a => a.alertType === 'unknown_device' && !a.acknowledged).length
    const highUsageCount = alerts.filter(a => a.alertType === 'high_data_usage' && !a.acknowledged).length
    setStats({
      totalAlerts: alerts.filter(a => !a.acknowledged).length,
      unknownDevices: unknownCount,
      highUsageDevices: highUsageCount
    })
  }, [alerts])

  const loadAlerts = async () => {
    try {
      const response = await fetch('/api/device-monitor/alerts?limit=100')
      const data = await response.json()
      if (data.success) {
        setAlerts(data.alerts.map((a: any) => ({
          ...a,
          detectedAt: new Date(a.detectedAt).getTime()
        })))
      }
    } catch (error) {
      console.error('Failed to load alerts:', error)
    }
  }

  const loadTopUsage = async () => {
    try {
      const response = await fetch('/api/device-monitor/top-usage?limit=10')
      const data = await response.json()
      if (data.success) {
        setTopUsage(data.devices.map((d: any) => ({
          ...d,
          bytesUploaded: BigInt(d.bytesUploaded),
          bytesDownloaded: BigInt(d.bytesDownloaded),
          totalBytes: BigInt(d.totalBytes),
          lastUpdated: new Date(d.lastUpdated).getTime()
        })))
      }
    } catch (error) {
      console.error('Failed to load top data usage:', error)
    }
  }

  const startMonitoring = async () => {
    if (monitoring) return

    if (!hasRouterCredentials) {
      toast.error('Router credentials required. Please complete router setup first.')
      setShowRouterSetup(true)
      return
    }

    setLoading(true)
    try {
      const monitor = getDeviceMonitor()

      await monitor.startMonitoring((alert) => {
        notificationService.showDeviceAlert(alert)
        loadAlerts()
      })

      setMonitoring(true)
      toast.success('Device monitoring started')

      console.log('✅ Device Monitor started with router credentials')
    } catch (error: any) {
      console.error('Failed to start monitoring:', error)
      toast.error(error.message || 'Failed to start monitoring')

      if (error.message?.includes('credentials')) {
        setShowRouterSetup(true)
      }
    } finally {
      setLoading(false)
    }
  }

  const completeSetup = async () => {
    if (!hasRouterCredentials) {
      toast.error('Please configure router credentials first')
      setShowRouterSetup(true)
      return
    }

    setLoading(true)
    try {
      const monitor = getDeviceMonitor()

      // Scan current devices and add them as known (trusted)
      await monitor.scanDevices()
      await monitor.completeFirstLaunchSetup()

      setIsFirstLaunch(false)

      // Now start monitoring
      await monitor.startMonitoring((alert) => {
        notificationService.showDeviceAlert(alert)
        loadAlerts()
      })

      setMonitoring(true)
      toast.success('Setup complete! Monitoring started')
    } catch (error: any) {
      console.error('Failed to complete setup:', error)
      toast.error(error.message || 'Failed to complete setup')
    } finally {
      setLoading(false)
    }
  }

  const stopMonitoring = () => {
    const monitor = getDeviceMonitor()
    monitor.stopMonitoring()
    setMonitoring(false)
    toast.info('Device monitoring stopped')
  }

  const scanNow = async () => {
    if (!hasRouterCredentials) {
      toast.error('Router credentials required')
      setShowRouterSetup(true)
      return
    }

    setLoading(true)
    try {
      const monitor = getDeviceMonitor()
      await monitor.scanDevices()
      await loadAlerts()
      await loadTopUsage()
      toast.success('Scan completed')
    } catch (error) {
      console.error('Failed to scan devices:', error)
      toast.error('Failed to scan devices')
    } finally {
      setLoading(false)
    }
  }

  const trustDevice = async (macAddress: string) => {
    try {
      const monitor = getDeviceMonitor()
      const success = await monitor.trustDevice(macAddress)
      if (success) {
        toast.success('Device trusted')
        loadAlerts()
      } else {
        toast.error('Failed to trust device')
      }
    } catch (error) {
      console.error('Failed to trust device:', error)
      toast.error('Failed to trust device')
    }
  }

  const acknowledgeAlert = async (alertId: string) => {
    try {
      const response = await fetch('/api/device-monitor/alerts', {
        method: 'PATCH',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ alertId, acknowledged: true })
      })
      const data = await response.json()
      if (data.success) {
        loadAlerts()
      }
    } catch (error) {
      console.error('Failed to acknowledge alert:', error)
    }
  }

  const clearAllAlerts = async () => {
    try {
      const response = await fetch('/api/device-monitor/alerts', {
        method: 'DELETE'
      })
      const data = await response.json()
      if (data.success) {
        setAlerts([])
        toast.success('All alerts cleared')
      }
    } catch (error) {
      console.error('Failed to clear alerts:', error)
      toast.error('Failed to clear alerts')
    }
  }

  const handleRouterSetupComplete = () => {
    setHasRouterCredentials(true)
    toast.success('Router configured successfully')

    // If first launch, trigger setup
    if (isFirstLaunch) {
      completeSetup()
    }
  }

  const getSeverityColor = (severity: string) => {
    switch (severity) {
      case 'critical': return 'text-red-400 bg-red-500/20 border-red-500/30'
      case 'high': return 'text-orange-400 bg-orange-500/20 border-orange-500/30'
      case 'medium': return 'text-yellow-400 bg-yellow-500/20 border-yellow-500/30'
      case 'low': return 'text-blue-400 bg-blue-500/20 border-blue-500/30'
      default: return 'text-gray-400 bg-gray-500/20 border-gray-500/30'
    }
  }

  const formatBytes = (bytes: bigint | number): string => {
    const b = typeof bytes === 'bigint' ? Number(bytes) : bytes
    if (b === 0) return '0 B'
    const k = 1024
    const sizes = ['B', 'KB', 'MB', 'GB', 'TB']
    const i = Math.floor(Math.log(b) / Math.log(k))
    return `${(b / Math.pow(k, i)).toFixed(2)} ${sizes[i]}`
  }

  const formatTime = (timestamp: number): string => {
    const now = Date.now()
    const diff = now - timestamp
    const minutes = Math.floor(diff / 60000)
    const hours = Math.floor(diff / 3600000)
    const days = Math.floor(diff / 86400000)

    if (minutes < 1) return 'Just now'
    if (minutes < 60) return `${minutes}m ago`
    if (hours < 24) return `${hours}h ago`
    return `${days}d ago`
  }

  const unacknowledgedAlerts = alerts.filter(a => !a.acknowledged)

  return (
    <>
      <Card className="bg-[#0d120d] border-emerald-900/30">
        <CardHeader className="pb-3">
          <div className="flex items-center justify-between">
            <div className="flex items-center gap-2">
              <Shield className="w-4 h-4 text-emerald-400" />
              <CardTitle className="text-sm text-white">Device Monitor</CardTitle>
              {!hasRouterCredentials ? (
                <Badge className="bg-red-500/20 text-red-400">Setup Required</Badge>
              ) : isFirstLaunch ? (
                <Badge className="bg-yellow-500/20 text-yellow-400">First Launch</Badge>
              ) : (
                <Badge className={monitoring ? 'bg-emerald-500/20 text-emerald-400' : 'bg-gray-500/20 text-gray-400'}>
                  {monitoring ? 'Active' : 'Inactive'}
                </Badge>
              )}
            </div>
            <div className="flex items-center gap-2">
              <Button
                variant="ghost"
                size="sm"
                onClick={() => setShowRouterSetup(true)}
                className="text-gray-400 hover:text-white h-7 px-2"
                title="Router Settings"
              >
                <Settings className="w-3 h-3" />
              </Button>
              <Button
                variant="ghost"
                size="sm"
                onClick={() => {
                  loadAlerts()
                  loadTopUsage()
                }}
                className="text-gray-400 hover:text-white h-7 px-2"
              >
                <RefreshCw className="w-3 h-3" />
              </Button>
              {hasRouterCredentials && !isFirstLaunch && (
                <>
                  <Button
                    variant="ghost"
                    size="sm"
                    onClick={scanNow}
                    disabled={loading || !isConnected}
                    className="text-blue-400 hover:text-blue-300 h-7 px-2 text-[10px]"
                  >
                    Scan Now
                  </Button>
                  {monitoring ? (
                    <Button
                      variant="ghost"
                      size="sm"
                      onClick={stopMonitoring}
                      className="text-red-400 hover:text-red-300 h-7 px-2"
                    >
                      Stop
                    </Button>
                  ) : (
                    <Button
                      variant="ghost"
                      size="sm"
                      onClick={startMonitoring}
                      disabled={loading || !isConnected}
                      className="text-emerald-400 hover:text-emerald-300 h-7 px-2"
                    >
                      {loading ? 'Starting...' : 'Start'}
                    </Button>
                  )}
                </>
              )}
            </div>
          </div>
        </CardHeader>

        <CardContent className="space-y-3">
          {/* Router Setup Required */}
          {!hasRouterCredentials && (
            <div className="bg-red-500/10 border border-red-500/30 rounded-lg p-3">
              <div className="flex items-start gap-2">
                <Router className="w-4 h-4 text-red-400 flex-shrink-0 mt-0.5" />
                <div className="flex-1">
                  <h3 className="text-sm font-medium text-red-400 mb-1">Router Setup Required</h3>
                  <p className="text-xs text-gray-400 mb-3">
                    Device Monitor requires router credentials to scan devices reliably and track data usage.
                    This bypasses AP isolation and provides accurate device information.
                  </p>
                  <Button
                    onClick={() => setShowRouterSetup(true)}
                    className="w-full bg-red-500 hover:bg-red-600 text-white h-8"
                  >
                    <Router className="w-3 h-3 mr-2" />
                    Configure Router
                  </Button>
                </div>
              </div>
            </div>
          )}

          {/* First Launch Setup */}
          {hasRouterCredentials && isFirstLaunch && (
            <div className="bg-yellow-500/10 border border-yellow-500/30 rounded-lg p-3">
              <div className="flex items-start gap-2">
                <AlertTriangle className="w-4 h-4 text-yellow-400 flex-shrink-0 mt-0.5" />
                <div className="flex-1">
                  <h3 className="text-sm font-medium text-yellow-400 mb-1">First Launch Setup</h3>
                  <p className="text-xs text-gray-400 mb-3">
                    Click "Complete Setup" to scan your network and mark current devices as trusted.
                    Future unknown devices will trigger alerts.
                  </p>
                  <Button
                    onClick={completeSetup}
                    disabled={loading}
                    className="w-full bg-yellow-500 hover:bg-yellow-600 text-black h-8"
                  >
                    {loading ? 'Setting up...' : 'Complete Setup & Start Monitoring'}
                  </Button>
                </div>
              </div>
            </div>
          )}

          {/* Stats - Only show if configured and not first launch */}
          {hasRouterCredentials && !isFirstLaunch && (
            <div className="grid grid-cols-3 gap-2">
              <div className="bg-[#0a0f0a] border border-emerald-900/30 rounded-lg p-2">
                <div className="flex items-center gap-1.5">
                  <AlertTriangle className="w-3 h-3 text-yellow-400" />
                  <span className="text-[10px] text-gray-400">Total Alerts</span>
                </div>
                <div className="text-lg font-bold text-white mt-0.5">{stats.totalAlerts}</div>
              </div>
              <div className="bg-[#0a0f0a] border border-emerald-900/30 rounded-lg p-2">
                <div className="flex items-center gap-1.5">
                  <ShieldAlert className="w-3 h-3 text-orange-400" />
                  <span className="text-[10px] text-gray-400">Unknown</span>
                </div>
                <div className="text-lg font-bold text-white mt-0.5">{stats.unknownDevices}</div>
              </div>
              <div className="bg-[#0a0f0a] border border-emerald-900/30 rounded-lg p-2">
                <div className="flex items-center gap-1.5">
                  <TrendingUp className="w-3 h-3 text-red-400" />
                  <span className="text-[10px] text-gray-400">High Usage</span>
                </div>
                <div className="text-lg font-bold text-white mt-0.5">{stats.highUsageDevices}</div>
              </div>
            </div>
          )}

          {/* Alerts Section */}
          {hasRouterCredentials && !isFirstLaunch && (
            <div>
              <div className="flex items-center justify-between mb-2">
                <h3 className="text-xs font-medium text-gray-400">Recent Alerts</h3>
                {alerts.length > 0 && (
                  <Button
                    variant="ghost"
                    size="sm"
                    onClick={clearAllAlerts}
                    className="text-red-400 hover:text-red-300 h-6 px-2 text-[10px]"
                  >
                    <Trash2 className="w-3 h-3 mr-1" />
                    Clear All
                  </Button>
                )}
              </div>
              <ScrollArea className="h-[200px]">
                <div className="space-y-2">
                  {unacknowledgedAlerts.length === 0 ? (
                    <div className="text-center py-8 text-gray-500 text-xs">
                      <CheckCircle2 className="w-8 h-8 mx-auto mb-2 opacity-50" />
                      No active alerts
                    </div>
                  ) : (
                    unacknowledgedAlerts.map((alert) => (
                      <div
                        key={alert.id}
                        className={`p-2 rounded-lg border ${getSeverityColor(alert.severity)}`}
                      >
                        <div className="flex items-start justify-between gap-2">
                          <div className="flex-1 min-w-0">
                            <div className="flex items-center gap-2 mb-1">
                              {alert.alertType === 'unknown_device' ? (
                                <ShieldAlert className="w-3 h-3 flex-shrink-0" />
                              ) : (
                                <TrendingUp className="w-3 h-3 flex-shrink-0" />
                              )}
                              <span className="text-xs font-medium truncate">{alert.message}</span>
                            </div>
                            <p className="text-[10px] opacity-80 mb-1">{alert.details}</p>
                            <div className="flex items-center gap-2 text-[9px] opacity-60">
                              <Clock className="w-2.5 h-2.5" />
                              {formatTime(alert.detectedAt)}
                            </div>
                          </div>
                          <div className="flex flex-col gap-1">
                            {alert.alertType === 'unknown_device' && (
                              <Button
                                variant="ghost"
                                size="sm"
                                onClick={() => trustDevice(alert.macAddress)}
                                className="h-6 px-2 text-[10px] text-emerald-400 hover:text-emerald-300"
                              >
                                Trust
                              </Button>
                            )}
                            <Button
                              variant="ghost"
                              size="sm"
                              onClick={() => acknowledgeAlert(alert.id)}
                              className="h-6 px-2 text-[10px]"
                            >
                              <CheckCircle2 className="w-3 h-3" />
                            </Button>
                          </div>
                        </div>
                      </div>
                    ))
                  )}
                </div>
              </ScrollArea>
            </div>
          )}

          {/* Top Data Usage */}
          {hasRouterCredentials && !isFirstLaunch && (
            <div>
              <div className="flex items-center gap-2 mb-2">
                <Database className="w-3 h-3 text-emerald-400" />
                <h3 className="text-xs font-medium text-gray-400">Top Data Usage (Today)</h3>
              </div>
              <ScrollArea className="h-[150px]">
                <div className="space-y-1.5">
                  {topUsage.length === 0 ? (
                    <div className="text-center py-6 text-gray-500 text-xs">
                      <Activity className="w-6 h-6 mx-auto mb-2 opacity-50" />
                      No data usage tracked yet
                    </div>
                  ) : (
                    topUsage.map((device, index) => (
                      <div
                        key={device.id}
                        className="flex items-center justify-between p-2 bg-[#0a0f0a] border border-emerald-900/30 rounded-lg"
                      >
                        <div className="flex items-center gap-2 flex-1 min-w-0">
                          <span className="text-xs font-bold text-emerald-400 w-4">#{index + 1}</span>
                          <span className="text-xs text-white truncate">{device.deviceName}</span>
                        </div>
                        <div className="text-xs font-medium text-emerald-400">
                          {formatBytes(device.totalBytes)}
                        </div>
                      </div>
                    ))
                  )}
                </div>
              </ScrollArea>
            </div>
          )}
        </CardContent>
      </Card>

      <RouterSetupDialog
        open={showRouterSetup}
        onOpenChange={setShowRouterSetup}
        onComplete={handleRouterSetupComplete}
        gatewayIP={detectedGatewayIP}
      />
    </>
  )
}
