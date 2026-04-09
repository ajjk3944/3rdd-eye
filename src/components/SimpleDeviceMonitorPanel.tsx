'use client'

import { useState, useEffect } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Badge } from '@/components/ui/badge'
import { ScrollArea } from '@/components/ui/scroll-area'
import {
  Shield,
  ShieldAlert,
  Activity,
  CheckCircle2,
  AlertTriangle,
  Trash2,
  RefreshCw,
  Clock,
  Wifi,
  RotateCcw
} from 'lucide-react'
import { SimpleDeviceAlert, getSimpleDeviceMonitor } from '@/lib/simple-device-monitor'
import { getNetworkScanner } from '@/lib/native-plugins'
import { notificationService } from '@/lib/notification-service'
import { toast } from 'sonner'
import { getAlerts, getKnownDevices, acknowledgeAlert as ackAlert, deleteAlert as delAlert, clearAllData } from '@/lib/local-storage-db'

interface SimpleDeviceMonitorPanelProps {
  networkDevices?: any[]
  isConnected?: boolean
}

export function SimpleDeviceMonitorPanel({ networkDevices = [], isConnected }: SimpleDeviceMonitorPanelProps) {
  const [alerts, setAlerts] = useState<SimpleDeviceAlert[]>([])
  const [loading, setLoading] = useState(false)
  const [monitoring, setMonitoring] = useState(false)
  const [isFirstScan, setIsFirstScan] = useState(true)
  const [error, setError] = useState<string | null>(null)
  const [stats, setStats] = useState({
    totalAlerts: 0,
    newDevices: 0
  })

  // Load alerts on mount
  useEffect(() => {
    loadAlerts()
    const interval = setInterval(loadAlerts, 10000) // Refresh every 10 seconds
    return () => clearInterval(interval)
  }, [])

  // Update stats when alerts change
  useEffect(() => {
    const newCount = alerts.filter(a => !a.acknowledged).length
    setStats({
      totalAlerts: alerts.filter(a => !a.acknowledged).length,
      newDevices: newCount
    })
  }, [alerts])

  const loadAlerts = async () => {
    try {
      const alerts = getAlerts(50)
      setAlerts(alerts.map((a: any) => ({
        ...a,
        detectedAt: typeof a.detectedAt === 'number' ? a.detectedAt : new Date(a.detectedAt).getTime()
      })))
    } catch (error) {
      console.error('Failed to load alerts:', error)
    }
  }

  const startMonitoring = async () => {
    setLoading(true)
    setError(null)
    try {
      console.log('🎯 Starting device monitoring...')
      
      // Check if this is first time (check local storage)
      const knownDevices = getKnownDevices()
      const hasDevices = knownDevices.length > 0

      console.log(`📊 Known devices in local storage: ${knownDevices.length}`)

      let autoMarkKnown = false
      
      if (!hasDevices) {
        // First time ever - ask user what to do
        const shouldMarkKnown = window.confirm(
          'First Time Setup\n\n' +
          'Do you want to mark all CURRENT devices as trusted?\n\n' +
          '• YES = Trust all current devices, only alert for NEW devices\n' +
          '• NO = Alert for ALL devices found (including current ones)'
        )
        
        autoMarkKnown = shouldMarkKnown
        
        if (shouldMarkKnown) {
          toast.info('Marking current devices as trusted', {
            description: 'New devices that join later will trigger alerts'
          })
        } else {
          toast.info('Monitoring all devices', {
            description: 'All devices will be checked and may trigger alerts'
          })
        }
        
        setIsFirstScan(true)
      } else {
        setIsFirstScan(false)
        autoMarkKnown = false // Never auto-mark after first setup
      }

      const monitor = getSimpleDeviceMonitor({
        scanInterval: 30000, // 30 seconds
        enableNotifications: true,
        autoMarkKnown: autoMarkKnown
      })

      console.log('🚀 Calling startMonitoring...')
      
      await monitor.startMonitoring((alert) => {
        console.log('🔔 Alert received:', alert)
        
        // Show notification
        notificationService.showDeviceAlert({
          id: alert.id,
          macAddress: alert.macAddress,
          deviceName: alert.deviceName,
          alertType: 'unknown_device',
          severity: alert.severity === 'high' ? 'high' : 'medium',
          message: alert.message,
          details: `IP: ${alert.ipAddress}${alert.vendor ? `, Vendor: ${alert.vendor}` : ''}`,
          detectedAt: alert.detectedAt,
          acknowledged: false
        })

        // Reload alerts
        loadAlerts()
      })

      setMonitoring(true)
      setError(null)
      console.log('✅ Monitoring started successfully')
      toast.success('Device monitoring started', {
        description: 'Scanning network every 30 seconds'
      })
    } catch (error: any) {
      console.error('❌ Failed to start monitoring:', error)
      setError(error.message || 'Failed to start monitoring')
      toast.error('Failed to start monitoring', {
        description: error.message || 'Check console for details'
      })
    } finally {
      setLoading(false)
    }
  }

  const stopMonitoring = () => {
    const monitor = getSimpleDeviceMonitor()
    monitor.stopMonitoring()
    setMonitoring(false)
    setError(null)
    toast.info('Device monitoring stopped')
  }

  const acknowledgeAlert = async (alertId: string) => {
    try {
      ackAlert(alertId)
      setAlerts(alerts.map(a => a.id === alertId ? { ...a, acknowledged: true } : a))
      toast.success('Alert acknowledged')
    } catch (error) {
      toast.error('Failed to acknowledge alert')
    }
  }

  const deleteAlert = async (alertId: string) => {
    try {
      delAlert(alertId)
      setAlerts(alerts.filter(a => a.id !== alertId))
      toast.success('Alert deleted')
    } catch (error) {
      toast.error('Failed to delete alert')
    }
  }

  const manualScan = async () => {
    setLoading(true)
    try {
      console.log('🔍 Running manual scan...')
      const monitor = getSimpleDeviceMonitor()
      
      await monitor.scanNow((alert) => {
        console.log('🔔 Alert from manual scan:', alert)
        notificationService.showDeviceAlert({
          id: alert.id,
          macAddress: alert.macAddress,
          deviceName: alert.deviceName,
          alertType: 'unknown_device',
          severity: alert.severity === 'high' ? 'high' : 'medium',
          message: alert.message,
          details: `IP: ${alert.ipAddress}`,
          detectedAt: alert.detectedAt,
          acknowledged: false
        })
        loadAlerts()
      })
      
      console.log('✅ Manual scan completed')
      toast.success('Scan completed')
      await loadAlerts()
    } catch (error: any) {
      console.error('❌ Manual scan failed:', error)
      toast.error('Scan failed', {
        description: error.message || 'Check console for details'
      })
    } finally {
      setLoading(false)
    }
  }

  const resetMonitoring = () => {
    if (monitoring) {
      toast.error('Stop monitoring first before resetting')
      return
    }

    const confirmed = window.confirm(
      'Reset Device Monitor?\n\n' +
      'This will:\n' +
      '• Clear all known devices\n' +
      '• Clear all alerts\n' +
      '• Reset to first-time setup\n\n' +
      'Are you sure?'
    )

    if (confirmed) {
      clearAllData()
      setAlerts([])
      toast.success('Device monitor reset', {
        description: 'All data cleared. Start monitoring to begin fresh.'
      })
    }
  }

  return (
    <Card className="bg-[#0d120d] border-emerald-900/30">
      <CardHeader>
        <div className="flex items-center justify-between">
          <div className="flex items-center gap-2">
            <Shield className="w-5 h-5 text-emerald-400" />
            <CardTitle className="text-white">Device Monitor</CardTitle>
            {monitoring && (
              <Badge variant="outline" className="border-emerald-500/30 text-emerald-400">
                <Activity className="w-3 h-3 mr-1 animate-pulse" />
                Active
              </Badge>
            )}
          </div>
          <div className="flex gap-2">
            <Button
              variant="outline"
              size="sm"
              onClick={manualScan}
              disabled={loading}
              className="border-emerald-900/30 text-emerald-400 hover:text-emerald-300 hover:bg-emerald-900/20"
            >
              {loading ? (
                <RefreshCw className="w-4 h-4 animate-spin" />
              ) : (
                <RefreshCw className="w-4 h-4" />
              )}
            </Button>
            {!monitoring && (
              <Button
                variant="outline"
                size="sm"
                onClick={resetMonitoring}
                disabled={loading}
                className="border-orange-900/30 text-orange-400 hover:text-orange-300 hover:bg-orange-900/20"
                title="Reset all data"
              >
                <RotateCcw className="w-4 h-4" />
              </Button>
            )}
            {!monitoring ? (
              <Button
                onClick={startMonitoring}
                disabled={loading}
                size="sm"
                className="bg-emerald-500 hover:bg-emerald-600 text-white"
              >
                Start Monitoring
              </Button>
            ) : (
              <Button
                onClick={stopMonitoring}
                variant="outline"
                size="sm"
                className="border-red-500/30 text-red-400 hover:text-red-300 hover:bg-red-900/20"
              >
                Stop
              </Button>
            )}
          </div>
        </div>
      </CardHeader>

      <CardContent className="space-y-4">
        {/* Error Display */}
        {error && (
          <div className="bg-red-500/10 border border-red-500/30 rounded-lg p-3">
            <p className="text-sm text-red-400">
              <strong>Error:</strong> {error}
            </p>
          </div>
        )}

        {/* Stats */}
        <div className="grid grid-cols-2 gap-4">
          <Card className="bg-[#0a0f0a] border-emerald-900/30">
            <CardContent className="p-4">
              <div className="flex items-center justify-between">
                <div>
                  <p className="text-sm text-gray-400">Total Alerts</p>
                  <p className="text-2xl font-bold text-white">{stats.totalAlerts}</p>
                </div>
                <ShieldAlert className="w-8 h-8 text-emerald-400" />
              </div>
            </CardContent>
          </Card>

          <Card className="bg-[#0a0f0a] border-emerald-900/30">
            <CardContent className="p-4">
              <div className="flex items-center justify-between">
                <div>
                  <p className="text-sm text-gray-400">New Devices</p>
                  <p className="text-2xl font-bold text-white">{stats.newDevices}</p>
                </div>
                <Wifi className="w-8 h-8 text-emerald-400" />
              </div>
            </CardContent>
          </Card>
        </div>

        {/* Alerts */}
        <div>
          <h3 className="text-sm font-medium text-gray-400 mb-2">Recent Alerts</h3>
          <ScrollArea className="h-[300px]">
            <div className="space-y-2">
              {alerts.length === 0 ? (
                <div className="text-center py-8 text-gray-500">
                  <CheckCircle2 className="w-12 h-12 mx-auto mb-2 opacity-50" />
                  <p>No alerts yet</p>
                  <p className="text-sm">Start monitoring to detect new devices</p>
                </div>
              ) : (
                alerts.map((alert) => (
                  <Card
                    key={alert.id}
                    className={`bg-[#0a0f0a] border ${
                      alert.acknowledged
                        ? 'border-gray-700/30 opacity-60'
                        : alert.severity === 'high'
                        ? 'border-red-500/30'
                        : 'border-yellow-500/30'
                    }`}
                  >
                    <CardContent className="p-3">
                      <div className="flex items-start justify-between gap-2">
                        <div className="flex-1">
                          <div className="flex items-center gap-2 mb-1">
                            <AlertTriangle
                              className={`w-4 h-4 ${
                                alert.severity === 'high' ? 'text-red-400' : 'text-yellow-400'
                              }`}
                            />
                            <span className="font-medium text-white">{alert.deviceName}</span>
                            <Badge
                              variant="outline"
                              className={`text-xs ${
                                alert.severity === 'high'
                                  ? 'border-red-500/30 text-red-400'
                                  : 'border-yellow-500/30 text-yellow-400'
                              }`}
                            >
                              {alert.severity}
                            </Badge>
                          </div>
                          <p className="text-sm text-gray-400">{alert.message}</p>
                          <div className="flex items-center gap-4 mt-2 text-xs text-gray-500">
                            <span>IP: {alert.ipAddress}</span>
                            <span>MAC: {alert.macAddress}</span>
                            {alert.vendor && <span>Vendor: {alert.vendor}</span>}
                          </div>
                          <div className="flex items-center gap-1 mt-1 text-xs text-gray-500">
                            <Clock className="w-3 h-3" />
                            <span>{new Date(alert.detectedAt).toLocaleString()}</span>
                          </div>
                        </div>
                        <div className="flex gap-1">
                          {!alert.acknowledged && (
                            <Button
                              variant="ghost"
                              size="sm"
                              onClick={() => acknowledgeAlert(alert.id)}
                              className="h-8 px-2 text-emerald-400 hover:text-emerald-300 hover:bg-emerald-900/20"
                            >
                              <CheckCircle2 className="w-4 h-4" />
                            </Button>
                          )}
                          <Button
                            variant="ghost"
                            size="sm"
                            onClick={() => deleteAlert(alert.id)}
                            className="h-8 px-2 text-red-400 hover:text-red-300 hover:bg-red-900/20"
                          >
                            <Trash2 className="w-4 h-4" />
                          </Button>
                        </div>
                      </div>
                    </CardContent>
                  </Card>
                ))
              )}
            </div>
          </ScrollArea>
        </div>

        {/* Info */}
        {!monitoring && !error && (
          <div className="bg-blue-500/10 border border-blue-500/30 rounded-lg p-3">
            <p className="text-sm text-blue-400 mb-2">
              <strong>How it works:</strong> This monitor scans your network every 30 seconds to detect new devices.
            </p>
            <p className="text-xs text-blue-300 mb-2">
              <strong>First Time Setup:</strong> You'll be asked if you want to trust all current devices or check everything.
            </p>
            <p className="text-xs text-blue-300">
              <strong>Reset:</strong> Use the reset button (🔄) to clear all data and start fresh.
            </p>
          </div>
        )}
      </CardContent>
    </Card>
  )
}
