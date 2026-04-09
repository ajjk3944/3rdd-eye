// Real Network Traffic Monitor
// This monitors actual network traffic from devices

import { NetworkDevice } from './native-plugins'
import { getAnomalyDetector, DeviceActivity } from './anomaly-detection'
import { notificationService } from './notification-service'
import { routerTrafficAPI, RouterTrafficData } from './router-traffic-api'

export interface TrafficData {
  macAddress: string
  deviceName: string
  deviceType: string
  bytesUploaded: number
  bytesDownloaded: number
  connectionCount: number
  destinationIPs: string[]
  timestamp: number
}

export class NetworkTrafficMonitor {
  private monitoring = false
  private monitoringInterval: NodeJS.Timeout | null = null
  private previousTraffic: Map<string, TrafficData> = new Map()
  private readonly MONITOR_INTERVAL = 10000 // 10 seconds

  /**
   * Start monitoring network traffic with router API
   */
  async startMonitoring(devices: NetworkDevice[], useRouterAPI: boolean = false) {
    if (this.monitoring) return

    this.monitoring = true
    console.log('🚀 Starting AI-powered network traffic monitoring...')

    // If using router API, fetch initial data
    if (useRouterAPI && routerTrafficAPI.hasCredentials()) {
      try {
        await routerTrafficAPI.fetchTrafficData(devices)
        console.log('✅ Router API connected - using REAL traffic data')
      } catch (error) {
        console.warn('Router API failed, falling back to plugin:', error)
      }
    }

    // Initial baseline
    await this.captureTraffic(devices)

    // Monitor continuously
    this.monitoringInterval = setInterval(async () => {
      if (!this.monitoring) return
      
      // Refresh router data every interval
      if (useRouterAPI && routerTrafficAPI.hasCredentials()) {
        try {
          await routerTrafficAPI.fetchTrafficData(devices)
        } catch (error) {
          console.warn('Router API refresh failed:', error)
        }
      }
      
      await this.captureTraffic(devices)
    }, this.MONITOR_INTERVAL)
  }

  /**
   * Stop monitoring
   */
  stopMonitoring() {
    this.monitoring = false
    if (this.monitoringInterval) {
      clearInterval(this.monitoringInterval)
      this.monitoringInterval = null
    }
    console.log('Stopped network traffic monitoring')
  }

  /**
   * Capture traffic data from devices
   */
  private async captureTraffic(devices: NetworkDevice[]) {
    const detector = getAnomalyDetector()

    for (const device of devices) {
      try {
        // Get current traffic data
        const currentTraffic = await this.getDeviceTraffic(device)
        
        // Get previous traffic for comparison
        const previousTraffic = this.previousTraffic.get(device.macAddress || 'unknown')

        if (previousTraffic) {
          // Calculate delta (change since last check)
          const uploadDelta = currentTraffic.bytesUploaded - previousTraffic.bytesUploaded
          const downloadDelta = currentTraffic.bytesDownloaded - previousTraffic.bytesDownloaded

          // Create activity record
          const activity: DeviceActivity = {
            macAddress: device.macAddress || 'unknown',
            deviceName: device.name || 'Unknown Device',
            deviceType: (device as any).type || 'Unknown',
            timestamp: Date.now(),
            bytesUploaded: uploadDelta,
            bytesDownloaded: downloadDelta,
            connectionCount: currentTraffic.connectionCount,
            destinationIPs: currentTraffic.destinationIPs,
            suspiciousIPs: [],
            portActivity: []
          }

          // Record activity in detector
          detector.recordActivity(activity)

          // Detect anomalies
          const alerts = detector.detectAnomalies(activity)

          // Show alerts
          if (alerts.length > 0) {
            // Save alerts to database
            await this.saveAlerts(alerts)
            
            // Show notifications
            alerts.forEach(alert => {
              notificationService.showAnomalyAlert(alert)
            })
          }
        }

        // Update previous traffic
        this.previousTraffic.set(device.macAddress || 'unknown', currentTraffic)

      } catch (error) {
        console.error(`Failed to monitor device ${device.name}:`, error)
      }
    }
  }

  /**
   * Get traffic data for a specific device
   * Uses REAL data from router API or Android plugin
   */
  private async getDeviceTraffic(device: NetworkDevice): Promise<TrafficData> {
    // Priority 1: Try router API (most accurate)
    if (routerTrafficAPI.hasCredentials()) {
      try {
        const cachedData = routerTrafficAPI.getCachedData(device.macAddress || '')
        if (cachedData && Date.now() - cachedData.timestamp < 15000) {
          console.log(`✅ Using REAL router data for ${device.name}`)
          return {
            macAddress: cachedData.macAddress,
            deviceName: cachedData.deviceName,
            deviceType: (device as any).type || 'Unknown',
            bytesUploaded: cachedData.bytesUploaded,
            bytesDownloaded: cachedData.bytesDownloaded,
            connectionCount: cachedData.connectionCount,
            destinationIPs: cachedData.destinationIPs,
            timestamp: cachedData.timestamp
          }
        }
      } catch (error) {
        console.warn('Router API data not available:', error)
      }
    }

    // Priority 2: Try Android plugin
    if (typeof window !== 'undefined') {
      const Capacitor = (window as any).Capacitor
      const trafficPlugin = Capacitor?.Plugins?.NetworkTraffic
      
      if (trafficPlugin) {
        try {
          console.log(`Getting REAL traffic data for ${device.name} (${device.macAddress})`)
          const realData = await trafficPlugin.getDeviceTraffic({
            macAddress: device.macAddress || 'unknown'
          })
          
          console.log(`Real traffic data:`, realData)
          
          return {
            macAddress: device.macAddress || 'unknown',
            deviceName: device.name || 'Unknown',
            deviceType: (device as any).type || 'Unknown',
            bytesUploaded: realData.bytesUploaded,
            bytesDownloaded: realData.bytesDownloaded,
            connectionCount: realData.connectionCount,
            destinationIPs: await this.getRealDestinationIPs(trafficPlugin),
            timestamp: realData.timestamp
          }
        } catch (error) {
          console.warn(`Failed to get real traffic data for ${device.name}, using estimation:`, error)
        }
      }
    }
    
    // Fallback to estimation if plugin not available
    console.log(`Using estimated traffic data for ${device.name}`)
    return {
      macAddress: device.macAddress || 'unknown',
      deviceName: device.name || 'Unknown',
      deviceType: (device as any).type || 'Unknown',
      bytesUploaded: this.estimateTraffic(device, 'upload'),
      bytesDownloaded: this.estimateTraffic(device, 'download'),
      connectionCount: this.estimateConnections(device),
      destinationIPs: this.getKnownIPs(device),
      timestamp: Date.now()
    }
  }

  /**
   * Get real destination IPs from plugin
   */
  private async getRealDestinationIPs(trafficPlugin: any): Promise<string[]> {
    try {
      const connections = await trafficPlugin.getActiveConnections()
      return connections.connections.map((c: any) => c.destinationIP)
    } catch (error) {
      return []
    }
  }

  /**
   * Estimate traffic based on device type
   * TODO: Replace with real traffic data
   */
  private estimateTraffic(device: NetworkDevice, direction: 'upload' | 'download'): number {
    // This is a placeholder - should be replaced with real data
    const deviceType = (device as any).type || 'Unknown'
    const baseTraffic = {
      'Smartphone': { upload: 100000, download: 500000 },
      'Computer': { upload: 200000, download: 1000000 },
      'Television': { upload: 50000, download: 2000000 },
      'IoT Device': { upload: 10000, download: 50000 },
      'Tablet': { upload: 80000, download: 400000 },
      'Unknown': { upload: 50000, download: 200000 }
    }

    const traffic = baseTraffic[deviceType as keyof typeof baseTraffic] || baseTraffic['Unknown']
    const base = traffic[direction]
    
    // Add some randomness (±20%)
    const variance = base * 0.2
    return Math.floor(base + (Math.random() * variance * 2 - variance))
  }

  /**
   * Estimate connection count
   * TODO: Replace with real connection tracking
   */
  private estimateConnections(device: NetworkDevice): number {
    const deviceType = (device as any).type || 'Unknown'
    const baseConnections = {
      'Smartphone': 5,
      'Computer': 10,
      'Television': 3,
      'IoT Device': 2,
      'Tablet': 4,
      'Unknown': 3
    }

    return baseConnections[deviceType as keyof typeof baseConnections] || 3
  }

  /**
   * Get known IPs for device
   * TODO: Replace with real IP tracking
   */
  private getKnownIPs(device: NetworkDevice): string[] {
    // This should track actual destination IPs
    // For now, return common IPs based on device type
    const deviceType = (device as any).type || 'Unknown'
    const commonIPs = {
      'Smartphone': ['8.8.8.8', '1.1.1.1', '192.168.1.1'],
      'Computer': ['8.8.8.8', '1.1.1.1', '192.168.1.1', '142.250.185.46'],
      'Television': ['192.168.1.1', '54.239.28.85'], // Netflix, etc.
      'IoT Device': ['192.168.1.1', '54.239.28.85'],
      'Tablet': ['8.8.8.8', '1.1.1.1', '192.168.1.1'],
      'Unknown': ['192.168.1.1']
    }

    return commonIPs[deviceType as keyof typeof commonIPs] || commonIPs['Unknown']
  }

  /**
   * Save alerts to database
   */
  private async saveAlerts(alerts: any[]) {
    try {
      await fetch('/api/anomaly-detection/alerts', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ alerts })
      })
    } catch (error) {
      console.error('Failed to save alerts:', error)
    }
  }

  /**
   * Get monitoring status
   */
  isMonitoring(): boolean {
    return this.monitoring
  }
}

// Singleton instance
let monitorInstance: NetworkTrafficMonitor | null = null

export function getNetworkTrafficMonitor(): NetworkTrafficMonitor {
  if (!monitorInstance) {
    monitorInstance = new NetworkTrafficMonitor()
  }
  return monitorInstance
}
