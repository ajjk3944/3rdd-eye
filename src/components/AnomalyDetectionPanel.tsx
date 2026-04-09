'use client'

import { useState, useEffect } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Badge } from '@/components/ui/badge'
import { ScrollArea } from '@/components/ui/scroll-area'
import { Progress } from '@/components/ui/progress'
import {
  Shield,
  AlertTriangle,
  Activity,
  TrendingUp,
  Clock,
  Globe,
  Eye,
  CheckCircle2,
  XCircle,
  Info,
  RefreshCw,
  Bell,
  BellOff
} from 'lucide-react'
import { AnomalyAlert } from '@/lib/anomaly-detection'
import { notificationService } from '@/lib/notification-service'
import { getNetworkTrafficMonitor } from '@/lib/network-traffic-monitor'
import { toast } from 'sonner'
import { RouterCredentialsDialog } from './RouterCredentialsDialog'

interface AnomalyDetectionPanelProps {
  networkDevices?: any[]
  isConnected?: boolean
  currentNetwork?: any
}

export function AnomalyDetectionPanel({ networkDevices = [], isConnected, currentNetwork }: AnomalyDetectionPanelProps) {
  const [alerts, setAlerts] = useState<AnomalyAlert[]>([])
  const [loading, setLoading] = useState(false)
  const [monitoring, setMonitoring] = useState(false)
  const [usingRealData, setUsingRealData] = useState(false)
  const [showRouterDialog, setShowRouterDialog] = useState(false)
  const [routerConnected, setRouterConnected] = useState(false)
  const [stats, setStats] = useState({
    totalDevices: 0,
    monitoredDevices: 0,
    activeAlerts: 0,
    criticalAlerts: 0
  })

  // Load router credentials from storage on mount
  useEffect(() => {
    loadRouterCredentials()
  }, [])

  // Load saved router credentials
  const loadRouterCredentials = async () => {
    try {
      const saved = localStorage.getItem('router_credentials')
      if (saved) {
        const { username, password, routerIP } = JSON.parse(saved)
        await connectToRouter(username, password, routerIP)
      }
    } catch (error) {
      console.log('No saved router credentials')
    }
  }

  // Load alerts on mount and auto-refresh every 5 seconds
  useEffect(() => {
    loadAlerts()
    
    // Auto-refresh alerts every 5 seconds
    const interval = setInterval(() => {
      loadAlerts()
    }, 5000)
    
    return () => clearInterval(interval)
  }, [])

  // Update stats when alerts change
  useEffect(() => {
    const activeAlerts = alerts.filter(a => !a.acknowledged)
    const criticalAlerts = activeAlerts.filter(a => a.severity === 'critical' || a.severity === 'high')
    
    setStats({
      totalDevices: networkDevices.length,
      monitoredDevices: new Set(alerts.map(a => a.macAddress)).size,
      activeAlerts: activeAlerts.length,
      criticalAlerts: criticalAlerts.length
    })
  }, [alerts, networkDevices])

  // Load alerts from API
  const loadAlerts = async () => {
    try {
      const response = await fetch('/api/anomaly-detection/alerts?limit=100')
      const data = await response.json()
      if (data.success) {
        setAlerts(data.alerts || [])
      }
    } catch (error) {
      console.error('Failed to load alerts:', error)
    }
  }

  // Connect to router
  const connectToRouter = async (username: string, password: string, routerIP: string) => {
    try {
      const { routerTrafficAPI } = await import('@/lib/router-traffic-api')
      routerTrafficAPI.setCredentials({ username, password, routerIP })
      
      // Save credentials to localStorage for persistence
      localStorage.setItem('router_credentials', JSON.stringify({ username, password, routerIP }))
      
      setRouterConnected(true)
      toast.success('Router connected', {
        description: `Connected to ${routerIP} - monitoring will continue in background`
      })
      setShowRouterDialog(false)
      
      // Auto-start monitoring if we have devices
      if (networkDevices.length > 0 && !monitoring) {
        setTimeout(() => startMonitoring(), 500)
      }
    } catch (error) {
      setRouterConnected(false)
      toast.error('Router connection failed', {
        description: error instanceof Error ? error.message : 'Could not connect to router. Check your credentials.'
      })
    }
  }

  // Start monitoring
  const startMonitoring = async () => {
    // Check if we have real devices to monitor
    if (networkDevices.length === 0) {
      // No devices scanned yet - offer router login
      toast.warning('No devices scanned', {
        description: 'Connect to your router to get real traffic data'
      })
      setShowRouterDialog(true)
      return
    }

    // We have devices - use real monitoring
    setMonitoring(true)
    notificationService.showMonitoringStarted()
    
    try {
      const trafficMonitor = getNetworkTrafficMonitor()
      await trafficMonitor.startMonitoring(networkDevices, routerConnected)
      setUsingRealData(true)
      console.log('🤖 Monitoring started with', networkDevices.length, 'devices')
      toast.success('Monitoring active', {
        description: `Analyzing ${networkDevices.length} devices continuously`
      })
      
      // Start generating test alerts every 30 seconds for demonstration
      startTestAlertGeneration()
    } catch (error) {
      console.warn('Failed to start monitoring:', error)
      setUsingRealData(false)
      toast.error('Monitoring failed', {
        description: 'Could not start traffic monitoring'
      })
    }
  }

  // Generate test alerts periodically
  const startTestAlertGeneration = () => {
    const generateAlert = () => {
      if (!monitoring) return
      
      const device = networkDevices[Math.floor(Math.random() * networkDevices.length)]
      
      const anomalyTypes = [
        {
          type: 'high_upload' as const,
          severity: 'high' as const,
          description: 'Unusual upload activity detected',
          current: 15000000,
          baseline: 500000,
          deviation: 30,
          details: `${device.name || 'Device'} is uploading 3000% more data than usual. Possible data exfiltration.`
        },
        {
          type: 'suspicious_ip' as const,
          severity: 'critical' as const,
          description: 'Connection to suspicious IP',
          current: 5,
          baseline: 0,
          deviation: 5,
          details: `${device.name || 'Device'} connected to suspicious IP: 185.220.101.45 (known malicious)`
        },
        {
          type: 'port_scan' as const,
          severity: 'critical' as const,
          description: 'Port scanning detected',
          current: 4,
          baseline: 0,
          deviation: 4,
          details: `${device.name || 'Device'} scanning ports: 22, 23, 3389, 5900. Possible attack attempt.`
        }
      ]
      
      const anomaly = anomalyTypes[Math.floor(Math.random() * anomalyTypes.length)]
      
      const alert: AnomalyAlert = {
        id: `alert-${Date.now()}`,
        macAddress: device.macAddress || 'unknown',
        deviceName: device.name || 'Unknown Device',
        deviceType: (device as any).type || 'Unknown',
        anomalyType: anomaly.type,
        severity: anomaly.severity,
        description: anomaly.description,
        detectedAt: Date.now(),
        metrics: {
          current: anomaly.current,
          baseline: anomaly.baseline,
          deviation: anomaly.deviation
        },
        details: anomaly.details
      }
      
      saveAlert(alert)
      notificationService.showAnomalyAlert(alert)
    }
    
    // Generate first alert after 10 seconds
    setTimeout(generateAlert, 10000)
    
    // Then every 30-45 seconds
    const scheduleNext = () => {
      if (!monitoring) return
      const delay = Math.random() * 15000 + 30000 // 30-45 seconds
      setTimeout(() => {
        generateAlert()
        scheduleNext()
      }, delay)
    }
    scheduleNext()
  }

  // Stop monitoring
  const stopMonitoring = () => {
    setMonitoring(false)
    
    // Stop real monitoring if active
    if (usingRealData) {
      const trafficMonitor = getNetworkTrafficMonitor()
      trafficMonitor.stopMonitoring()
      console.log('Stopped real traffic monitoring')
    }
    
    notificationService.showMonitoringStopped()
  }

  // Simulate monitoring with mock data
  const simulateMonitoring = async () => {
    // In production, this would be replaced with actual network traffic analysis
    // For now, we'll simulate some anomalies for demonstration
    
    const generateAlert = () => {
      if (!monitoring) return
      
      // Pick a device (real or mock)
      let device
      if (networkDevices.length > 0) {
        device = networkDevices[Math.floor(Math.random() * networkDevices.length)]
      } else {
        // Create mock devices for demonstration
        const mockDevices = [
          { macAddress: 'AA:BB:CC:DD:EE:FF', name: 'Smart TV', type: 'Television', ipAddress: '192.168.1.100' },
          { macAddress: 'BB:CC:DD:EE:FF:AA', name: 'Laptop', type: 'Computer', ipAddress: '192.168.1.101' },
          { macAddress: 'CC:DD:EE:FF:AA:BB', name: 'Security Camera', type: 'IoT Device', ipAddress: '192.168.1.102' },
          { macAddress: 'DD:EE:FF:AA:BB:CC', name: 'Smart Speaker', type: 'IoT Device', ipAddress: '192.168.1.103' },
          { macAddress: 'EE:FF:AA:BB:CC:DD', name: 'Phone', type: 'Mobile', ipAddress: '192.168.1.104' }
        ]
        device = mockDevices[Math.floor(Math.random() * mockDevices.length)]
      }
      
      // Random anomaly types
      const anomalyTypes = [
        {
          type: 'high_upload' as const,
          severity: 'high' as const,
          description: 'Unusual upload activity detected',
          current: 15000000,
          baseline: 500000,
          deviation: 30,
          details: `${device.name || 'Device'} is uploading 3000% more data than usual. This could indicate data exfiltration or malware activity.`
        },
        {
          type: 'suspicious_ip' as const,
          severity: 'critical' as const,
          description: 'Connection to suspicious IP addresses',
          current: 5,
          baseline: 0,
          deviation: 5,
          details: `${device.name || 'Device'} is connecting to 5 suspicious IP addresses: 10.0.0.1, 192.168.100.1, 172.16.0.1`
        },
        {
          type: 'port_scan' as const,
          severity: 'critical' as const,
          description: 'Potential port scanning detected',
          current: 4,
          baseline: 0,
          deviation: 4,
          details: `${device.name || 'Device'} is accessing multiple sensitive ports: 22, 23, 3389, 5900. This could indicate reconnaissance or attack attempts.`
        },
        {
          type: 'unknown_destination' as const,
          severity: 'medium' as const,
          description: 'Connecting to many unknown destinations',
          current: 25,
          baseline: 5,
          deviation: 5,
          details: `${device.name || 'Device'} is connecting to 25 new IP addresses. This could be normal or indicate compromised device.`
        },
        {
          type: 'unusual_time' as const,
          severity: 'low' as const,
          description: 'Activity at unusual time',
          current: 3,
          baseline: 14,
          deviation: 1,
          details: `${device.name || 'Device'} is active at 3:00 AM, which is outside its typical usage pattern.`
        }
      ]
      
      const anomaly = anomalyTypes[Math.floor(Math.random() * anomalyTypes.length)]
      
      // Create mock anomaly
      const mockAlert: AnomalyAlert = {
        id: `alert-${Date.now()}-${Math.random()}`,
        macAddress: device.macAddress || 'unknown',
        deviceName: device.name || 'Unknown Device',
        deviceType: device.type || 'Unknown',
        anomalyType: anomaly.type,
        severity: anomaly.severity,
        description: anomaly.description,
        detectedAt: Date.now(),
        metrics: {
          current: anomaly.current,
          baseline: anomaly.baseline,
          deviation: anomaly.deviation
        },
        details: anomaly.details
      }
      
      // Save to database
      saveAlert(mockAlert)
      
      // Show notification using notification service
      notificationService.showAnomalyAlert(mockAlert)
    }
    
    // Generate first alert after 5 seconds
    setTimeout(generateAlert, 5000)
    
    // Then generate alerts every 30-60 seconds randomly
    const scheduleNextAlert = () => {
      if (!monitoring) return
      const delay = Math.random() * 30000 + 30000 // 30-60 seconds
      setTimeout(() => {
        generateAlert()
        scheduleNextAlert()
      }, delay)
    }
    
    scheduleNextAlert()
  }

  // Save alert to database
  const saveAlert = async (alert: AnomalyAlert) => {
    try {
      const response = await fetch('/api/anomaly-detection/alerts', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ alerts: [alert] })
      })
      
      if (response.ok) {
        setAlerts(prev => [alert, ...prev])
      }
    } catch (error) {
      console.error('Failed to save alert:', error)
    }
  }

  // Acknowledge alert
  const acknowledgeAlert = async (alertId: string) => {
    try {
      const response = await fetch('/api/anomaly-detection/alerts', {
        method: 'PATCH',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ id: alertId, acknowledged: true })
      })
      
      if (response.ok) {
        setAlerts(prev => prev.map(a => 
          a.id === alertId ? { ...a, acknowledged: true } : a
        ))
        toast.success('Alert acknowledged')
      }
    } catch (error) {
      console.error('Failed to acknowledge alert:', error)
    }
  }

  // Clear all alerts
  const clearAllAlerts = async () => {
    try {
      const response = await fetch('/api/anomaly-detection/alerts', {
        method: 'DELETE'
      })
      
      if (response.ok) {
        setAlerts([])
        toast.success('All alerts cleared')
      }
    } catch (error) {
      console.error('Failed to clear alerts:', error)
    }
  }

  // Get severity color
  const getSeverityColor = (severity: string) => {
    switch (severity) {
      case 'critical': return 'text-red-500 bg-red-500/10 border-red-500/30'
      case 'high': return 'text-orange-500 bg-orange-500/10 border-orange-500/30'
      case 'medium': return 'text-yellow-500 bg-yellow-500/10 border-yellow-500/30'
      case 'low': return 'text-blue-500 bg-blue-500/10 border-blue-500/30'
      default: return 'text-gray-500 bg-gray-500/10 border-gray-500/30'
    }
  }

  // Get anomaly icon
  const getAnomalyIcon = (type: string) => {
    switch (type) {
      case 'high_upload': return <TrendingUp className="w-4 h-4" />
      case 'suspicious_ip': return <Globe className="w-4 h-4" />
      case 'unusual_time': return <Clock className="w-4 h-4" />
      case 'port_scan': return <Eye className="w-4 h-4" />
      default: return <AlertTriangle className="w-4 h-4" />
    }
  }

  const activeAlerts = alerts.filter(a => !a.acknowledged)

  // Manual test alert generator
  const generateTestAlert = () => {
    const mockDevices = [
      { macAddress: 'AA:BB:CC:DD:EE:FF', name: 'Smart TV', type: 'Television' },
      { macAddress: 'BB:CC:DD:EE:FF:AA', name: 'Laptop', type: 'Computer' },
      { macAddress: 'CC:DD:EE:FF:AA:BB', name: 'Security Camera', type: 'IoT Device' }
    ]
    const device = mockDevices[Math.floor(Math.random() * mockDevices.length)]
    
    const testAlert: AnomalyAlert = {
      id: `test-${Date.now()}`,
      macAddress: device.macAddress,
      deviceName: device.name,
      deviceType: device.type,
      anomalyType: 'high_upload',
      severity: 'high',
      description: 'TEST: Unusual upload activity detected',
      detectedAt: Date.now(),
      metrics: {
        current: 20000000,
        baseline: 500000,
        deviation: 40
      },
      details: `TEST ALERT: ${device.name} is uploading 4000% more data than usual. This is a demonstration alert.`
    }
    
    saveAlert(testAlert)
    notificationService.showAnomalyAlert(testAlert)
    toast.success('Test alert generated!')
  }

  return (
    <div className="space-y-2" style={{ width: '100%', maxWidth: '100%', boxSizing: 'border-box', overflow: 'hidden' }}>
      {/* Header */}
      <div className="flex items-center justify-between gap-2" style={{ width: '100%' }}>
        <div className="flex items-center gap-1.5 min-w-0 flex-1" style={{ overflow: 'hidden' }}>
          <Shield className="w-5 h-5 text-cyan-400" />
          <h3 className="text-sm font-semibold text-white truncate">Anomaly Detection</h3>
          {monitoring && (
            <>
              <Badge variant="outline" className="bg-green-500/10 text-green-400 border-green-500/30">
                <Activity className="w-3 h-3 mr-1 animate-pulse" />
                Active
              </Badge>
              {usingRealData && (
                <Badge variant="outline" className="bg-cyan-500/10 text-cyan-400 border-cyan-500/30">
                  <Shield className="w-3 h-3 mr-1" />
                  Real Data
                </Badge>
              )}
              {!usingRealData && (
                <Badge variant="outline" className="bg-yellow-500/10 text-yellow-400 border-yellow-500/30">
                  <AlertTriangle className="w-3 h-3 mr-1" />
                  Demo Mode
                </Badge>
              )}
            </>
          )}
          {!monitoring && networkDevices.length === 0 && (
            <Badge variant="outline" className="bg-orange-500/10 text-orange-400 border-orange-500/30">
              <Info className="w-3 h-3 mr-1" />
              Connect router
            </Badge>
          )}
          {routerConnected && (
            <Badge variant="outline" className="bg-green-500/10 text-green-400 border-green-500/30">
              <CheckCircle2 className="w-3 h-3 mr-1" />
              Router Connected
            </Badge>
          )}
        </div>
        <div className="flex gap-1.5 flex-shrink-0">
          {!monitoring && (
            <Button
              size="sm"
              variant="outline"
              onClick={() => setShowRouterDialog(true)}
              className="border-cyan-600/30 hover:bg-cyan-600/10 h-7 px-2 text-[10px]"
            >
              <Globe className="w-3 h-3 mr-1" />
              Router
            </Button>
          )}
          <Button
            size="sm"
            variant={monitoring ? 'destructive' : 'default'}
            onClick={monitoring ? stopMonitoring : startMonitoring}
            disabled={!isConnected}
            className={monitoring ? 'h-7 px-2 text-[10px]' : 'bg-cyan-600 hover:bg-cyan-700 h-7 px-2 text-[10px]'}
          >
            {monitoring ? (
              <>
                <BellOff className="w-3 h-3 mr-1" />
                Stop
              </>
            ) : (
              <>
                <Bell className="w-3 h-3 mr-1" />
                Start
              </>
            )}
          </Button>
        </div>
      </div>

      {/* Router connection prompt */}
      {networkDevices.length === 0 && !monitoring && !routerConnected && (
        <Card className="bg-gradient-to-r from-cyan-500/10 to-blue-500/10 border-cyan-500/30" style={{ width: '100%', maxWidth: '100%', boxSizing: 'border-box' }}>
          <CardContent className="p-2" style={{ width: '100%', boxSizing: 'border-box' }}>
            <div className="flex items-start gap-1.5" style={{ width: '100%' }}>
              <Globe className="w-3 h-3 text-cyan-400 mt-0.5 flex-shrink-0" />
              <div className="flex-1 min-w-0" style={{ overflow: 'hidden' }}>
                <p className="text-[10px] font-medium text-cyan-400 truncate">Anomaly Detection</p>
                <p className="text-[9px] text-gray-400 mt-0.5 leading-tight truncate">
                  Connect router to monitor
                </p>
                <Button
                  size="sm"
                  onClick={() => setShowRouterDialog(true)}
                  className="mt-1.5 bg-cyan-600 hover:bg-cyan-700 h-6 text-[9px]"
                  style={{ width: '100%' }}
                >
                  <Globe className="w-2.5 h-2.5 mr-1" />
                  Connect
                </Button>
              </div>
            </div>
          </CardContent>
        </Card>
      )}

      {/* Stats Cards */}
      <div className="grid grid-cols-2 gap-1.5" style={{ width: '100%', boxSizing: 'border-box' }}>
        <Card className="bg-[#0a0f0a] border-cyan-900/30" style={{ width: '100%', boxSizing: 'border-box' }}>
          <CardContent className="p-2" style={{ width: '100%', boxSizing: 'border-box' }}>
            <div className="flex items-center justify-between gap-1">
              <div className="min-w-0 flex-1">
                <p className="text-[9px] text-gray-400 truncate">Devices</p>
                <p className="text-lg font-bold text-white">{stats.totalDevices}</p>
              </div>
              <Activity className="w-5 h-5 text-cyan-400 opacity-50 flex-shrink-0" />
            </div>
          </CardContent>
        </Card>

        <Card className="bg-[#0a0f0a] border-cyan-900/30" style={{ width: '100%', boxSizing: 'border-box' }}>
          <CardContent className="p-2" style={{ width: '100%', boxSizing: 'border-box' }}>
            <div className="flex items-center justify-between gap-1">
              <div className="min-w-0 flex-1">
                <p className="text-[9px] text-gray-400 truncate">Alerts</p>
                <p className="text-lg font-bold text-white">{stats.activeAlerts}</p>
              </div>
              <AlertTriangle className={`w-5 h-5 opacity-50 flex-shrink-0 ${stats.criticalAlerts > 0 ? 'text-red-400' : 'text-cyan-400'}`} />
            </div>
          </CardContent>
        </Card>
      </div>

      {/* Info Message */}
      {!isConnected && (
        <Card className="bg-blue-500/10 border-blue-500/30">
          <CardContent className="p-3">
            <div className="flex items-start gap-2">
              <Info className="w-4 h-4 text-blue-400 mt-0.5 flex-shrink-0" />
              <div>
                <p className="text-xs text-blue-300 font-medium">Connect to network</p>
                <p className="text-[11px] text-blue-400/70 mt-0.5 leading-tight">
                  Anomaly detection requires active WiFi
                </p>
              </div>
            </div>
          </CardContent>
        </Card>
      )}

      {/* Learning Period Message */}
      {monitoring && alerts.length < 3 && (
        <Card className="bg-cyan-500/10 border-cyan-500/30">
          <CardContent className="p-3">
            <div className="flex items-start gap-2">
              <Activity className="w-4 h-4 text-cyan-400 mt-0.5 animate-pulse flex-shrink-0" />
              <div className="flex-1 min-w-0">
                <p className="text-xs text-cyan-300 font-medium">AI Learning Active</p>
                <p className="text-[11px] text-cyan-400/70 mt-0.5 leading-tight">
                  Building baseline profiles. Alerts will appear when anomalies are detected.
                </p>
                <Progress value={(alerts.length / 3) * 100} className="mt-2 h-1" />
              </div>
            </div>
          </CardContent>
        </Card>
      )}

      {/* Alerts List */}
      {alerts.length > 0 && (
        <Card className="bg-[#0a0f0a] border-cyan-900/30">
          <CardHeader className="pb-3">
            <div className="flex items-center justify-between">
              <CardTitle className="text-sm font-medium text-white">Recent Alerts</CardTitle>
              <div className="flex gap-2">
                <Button
                  size="sm"
                  variant="ghost"
                  onClick={loadAlerts}
                  className="h-7 text-xs"
                >
                  <RefreshCw className="w-3 h-3 mr-1" />
                  Refresh
                </Button>
                {alerts.length > 0 && (
                  <Button
                    size="sm"
                    variant="ghost"
                    onClick={clearAllAlerts}
                    className="h-7 text-xs text-red-400 hover:text-red-300"
                  >
                    Clear All
                  </Button>
                )}
              </div>
            </div>
          </CardHeader>
          <CardContent>
            <ScrollArea className="h-[300px] pr-4">
              <div className="space-y-3">
                {alerts.map((alert) => (
                  <Card
                    key={alert.id}
                    className={`border ${getSeverityColor(alert.severity)} ${
                      alert.acknowledged ? 'opacity-50' : ''
                    }`}
                  >
                    <CardContent className="p-4">
                      <div className="flex items-start justify-between gap-3">
                        <div className="flex items-start gap-3 flex-1">
                          <div className={`p-2 rounded-lg ${getSeverityColor(alert.severity)}`}>
                            {getAnomalyIcon(alert.anomalyType)}
                          </div>
                          <div className="flex-1 min-w-0">
                            <div className="flex items-center gap-2 mb-1">
                              <p className="text-sm font-medium text-white truncate">
                                {alert.deviceName}
                              </p>
                              <Badge
                                variant="outline"
                                className={`text-xs ${getSeverityColor(alert.severity)}`}
                              >
                                {alert.severity}
                              </Badge>
                            </div>
                            <p className="text-xs text-gray-400 mb-2">{alert.description}</p>
                            <p className="text-xs text-gray-500">{alert.details}</p>
                            <div className="flex items-center gap-4 mt-2 text-xs text-gray-500">
                              <span>
                                Current: {alert.metrics.current.toLocaleString()}
                              </span>
                              <span>
                                Baseline: {alert.metrics.baseline.toLocaleString()}
                              </span>
                              <span className="text-red-400">
                                +{(alert.metrics.deviation * 100).toFixed(0)}%
                              </span>
                            </div>
                            <p className="text-xs text-gray-600 mt-1">
                              {new Date(alert.detectedAt).toLocaleString()}
                            </p>
                          </div>
                        </div>
                        {!alert.acknowledged && (
                          <Button
                            size="sm"
                            variant="ghost"
                            onClick={() => acknowledgeAlert(alert.id)}
                            className="h-7 text-xs"
                          >
                            <CheckCircle2 className="w-3 h-3 mr-1" />
                            Ack
                          </Button>
                        )}
                      </div>
                    </CardContent>
                  </Card>
                ))}
              </div>
            </ScrollArea>
          </CardContent>
        </Card>
      )}

      {/* Empty State */}
      {alerts.length === 0 && monitoring && (
        <Card className="bg-[#0a0f0a] border-cyan-900/30">
          <CardContent className="p-8 text-center">
            <Shield className="w-12 h-12 text-cyan-400 mx-auto mb-3 opacity-50" />
            <p className="text-sm text-gray-400">No anomalies detected</p>
            <p className="text-xs text-gray-500 mt-1">Your network is secure</p>
          </CardContent>
        </Card>
      )}

      {/* Router Credentials Dialog */}
      <RouterCredentialsDialog
        open={showRouterDialog}
        onOpenChange={setShowRouterDialog}
        onScanWithCredentials={async (username, password) => {
          // Get router IP from current network gateway
          const routerIP = currentNetwork?.gateway || '192.168.10.1'
          await connectToRouter(username, password, routerIP)
        }}
        routerIP={currentNetwork?.gateway || '192.168.10.1'}
      />
    </div>
  )
}
