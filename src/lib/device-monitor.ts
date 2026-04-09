// Device Monitor - Unknown Device Detection + Data Usage Tracking
// Uses router credentials for reliable device scanning

import { NetworkDevice } from './native-plugins'
import { getNetworkScanner } from './native-plugins'

export interface KnownDevice {
  id: string
  macAddress: string
  ipAddress?: string
  hostname?: string
  deviceName: string
  vendor?: string
  isTrusted: boolean
  firstSeen: number
  lastSeen: number
}

export interface DeviceDataUsage {
  id: string
  macAddress: string
  deviceName: string
  bytesUploaded: bigint
  bytesDownloaded: bigint
  totalBytes: bigint
  lastUpdated: number
  date: string
}

export interface DeviceAlert {
  id: string
  macAddress: string
  deviceName: string
  alertType: 'unknown_device' | 'high_data_usage'
  severity: 'low' | 'medium' | 'high' | 'critical'
  message: string
  details?: string
  detectedAt: number
  acknowledged: boolean
}

export interface RouterCredentials {
  routerIP: string
  username: string
  password: string
}

export interface DeviceMonitorConfig {
  scanInterval: number // milliseconds (default: 30000 = 30s)
  dataUsageThreshold: number // bytes (default: 1GB)
  enableNotifications: boolean
}

const DEFAULT_CONFIG: DeviceMonitorConfig = {
  scanInterval: 30000, // 30 seconds
  dataUsageThreshold: 1_000_000_000, // 1GB
  enableNotifications: true
}

/**
 * Device Monitor Service
 * Uses router credentials to scan devices directly from router admin API
 */
export class DeviceMonitor {
  private config: DeviceMonitorConfig = DEFAULT_CONFIG
  private monitoring = false
  private monitoringInterval: NodeJS.Timeout | null = null
  private knownDevices: Map<string, KnownDevice> = new Map()
  private dataUsageCache: Map<string, DeviceDataUsage> = new Map()
  private previousTraffic: Map<string, { upload: bigint; download: bigint }> = new Map()
  private knownDevicesLoaded = false
  private isFirstLaunch = false
  private routerCredentials: RouterCredentials | null = null

  constructor(config?: Partial<DeviceMonitorConfig>) {
    if (config) {
      this.config = { ...DEFAULT_CONFIG, ...config }
    }
  }

  /**
   * Load router credentials
   */
  private async loadRouterCredentials(): Promise<boolean> {
    try {
      const response = await fetch('/api/router/credentials')
      const data = await response.json()
      
      if (data.success && data.credentials) {
        this.routerCredentials = data.credentials
        console.log('✅ Router credentials loaded')
        return true
      } else {
        console.log('⚠️ No router credentials found')
        return false
      }
    } catch (error) {
      console.error('Failed to load router credentials:', error)
      return false
    }
  }

  /**
   * Check if router credentials are configured
   */
  async hasRouterCredentials(): Promise<boolean> {
    if (this.routerCredentials) return true
    return await this.loadRouterCredentials()
  }

  /**
   * Load known devices from database
   */
  private async loadKnownDevices() {
    if (this.knownDevicesLoaded) return
    
    try {
      const response = await fetch('/api/device-monitor/known-devices')
      const data = await response.json()
      if (data.success && data.devices) {
        data.devices.forEach((device: any) => {
          this.knownDevices.set(device.macAddress, {
            ...device,
            firstSeen: new Date(device.firstSeen).getTime(),
            lastSeen: new Date(device.lastSeen).getTime()
          })
        })
        console.log(`✅ Loaded ${this.knownDevices.size} known devices`)
        
        // Check if this is first launch (no known devices)
        this.isFirstLaunch = this.knownDevices.size === 0
        if (this.isFirstLaunch) {
          console.log('🆕 First launch detected - setup mode enabled')
        }
      }
      this.knownDevicesLoaded = true
    } catch (error) {
      console.error('Failed to load known devices:', error)
      this.knownDevicesLoaded = true
      this.isFirstLaunch = true
    }
  }

  /**
   * Start monitoring network devices using router credentials
   */
  async startMonitoring(onAlert?: (alert: DeviceAlert) => void, initialDevices?: NetworkDevice[]) {
    if (this.monitoring) return

    // Load router credentials first
    const hasCredentials = await this.loadRouterCredentials()
    if (!hasCredentials) {
      console.error('❌ Cannot start monitoring: No router credentials configured')
      throw new Error('Router credentials required. Please complete router setup first.')
    }

    // Load known devices
    await this.loadKnownDevices()

    this.monitoring = true
    console.log('🚀 Starting Device Monitor with Router Credentials...')
    console.log(`   Scan interval: ${this.config.scanInterval}ms`)
    console.log(`   Data threshold: ${formatBytes(this.config.dataUsageThreshold)}`)
    console.log(`   First launch: ${this.isFirstLaunch}`)

    // Monitor continuously using router credentials
    this.monitoringInterval = setInterval(async () => {
      if (!this.monitoring) return
      await this.scanAndCheck(onAlert)
    }, this.config.scanInterval)

    // Initial scan
    await this.scanAndCheck(onAlert)
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
    console.log('⏹️ Stopped Device Monitor')
  }

  /**
   * Manually scan devices using router credentials
   */
  async scanDevices(devices?: NetworkDevice[]) {
    console.log('🔍 Manual scan triggered with router credentials')
    await this.scanAndCheck(undefined)
  }

  /**
   * Scan network using router credentials and check for unknown devices + data usage
   */
  private async scanAndCheck(onAlert?: (alert: DeviceAlert) => void) {
    try {
      if (!this.routerCredentials) {
        console.error('❌ No router credentials available')
        return
      }

      // Scan using router credentials via native plugin
      const scanner = getNetworkScanner()
      if (!scanner) {
        console.error('❌ Network scanner not available')
        return
      }

      const result = await scanner.scanWithRouterCredentials({
        routerIP: this.routerCredentials.routerIP,
        username: this.routerCredentials.username,
        password: this.routerCredentials.password
      })

      if (!result.success || !result.devices || result.devices.length === 0) {
        console.log('⚠️ No devices found from router')
        return
      }

      const devices = result.devices
      console.log(`📡 Router scan found ${devices.length} devices`)
      
      // Check each device
      for (const device of devices) {
        const macAddress = device.macAddress || 'unknown'
        if (macAddress === 'unknown') continue

        // Part 1: Unknown Device Detection
        await this.checkUnknownDevice(device, onAlert)

        // Part 2: Data Usage Tracking (from router data)
        await this.trackDataUsage(device, onAlert)
      }
    } catch (error) {
      console.error('Device monitor scan error:', error)
    }
  }

  /**
   * Check if device is unknown and send alert
   */
  private async checkUnknownDevice(device: NetworkDevice, onAlert?: (alert: DeviceAlert) => void) {
    const macAddress = device.macAddress!
    const knownDevice = this.knownDevices.get(macAddress)

    console.log(`🔍 Checking device: ${macAddress}`, {
      isKnown: !!knownDevice,
      isTrusted: knownDevice?.isTrusted,
      deviceName: device.hostname || device.name,
      isFirstLaunch: this.isFirstLaunch
    })

    if (!knownDevice) {
      // Unknown device detected!
      const vendor = device.vendor || await this.lookupVendor(macAddress)
      const deviceName = device.hostname || device.name || `Device ${macAddress.slice(-8)}`

      // Add to known devices FIRST (before creating alert)
      const newDevice: KnownDevice = {
        id: `device-${Date.now()}`,
        macAddress,
        ipAddress: device.ipAddress,
        hostname: device.hostname || device.name,
        deviceName,
        vendor,
        isTrusted: false,
        firstSeen: Date.now(),
        lastSeen: Date.now()
      }

      this.knownDevices.set(macAddress, newDevice)
      await this.saveKnownDevice(newDevice)

      // Only create alert if NOT first launch
      if (!this.isFirstLaunch) {
        console.log(`🚨 UNKNOWN DEVICE DETECTED: ${deviceName} (${macAddress})`)

        // Create alert
        const alert: DeviceAlert = {
          id: `unknown-${macAddress}-${Date.now()}`,
          macAddress,
          deviceName,
          alertType: 'unknown_device',
          severity: 'high',
          message: `Unknown device joined your WiFi`,
          details: `${deviceName} (${vendor || 'Unknown vendor'}) - MAC: ${macAddress}`,
          detectedAt: Date.now(),
          acknowledged: false
        }

        // Save alert to database
        await this.saveAlert(alert)
        console.log(`✅ Alert saved to database`)

        // Trigger callback
        if (onAlert) {
          onAlert(alert)
          console.log(`✅ Alert callback triggered`)
        }
      } else {
        console.log(`ℹ️ First launch - device added without alert: ${deviceName}`)
      }
    } else {
      // Update last seen
      knownDevice.lastSeen = Date.now()
      if (device.ipAddress) knownDevice.ipAddress = device.ipAddress
      await this.updateKnownDevice(knownDevice)
      console.log(`✓ Known device updated: ${knownDevice.deviceName}`)
    }
  }

  /**
   * Complete first launch setup
   */
  async completeFirstLaunchSetup() {
    this.isFirstLaunch = false
    console.log('✅ First launch setup completed - alerts now enabled')
  }

  /**
   * Check if this is first launch
   */
  isFirstLaunchMode(): boolean {
    return this.isFirstLaunch
  }

  /**
   * Get all known devices (for first launch setup UI)
   */
  getKnownDevices(): KnownDevice[] {
    return Array.from(this.knownDevices.values())
  }

  /**
   * Track data usage from router data
   */
  private async trackDataUsage(device: NetworkDevice, onAlert?: (alert: DeviceAlert) => void) {
    const macAddress = device.macAddress!
    const deviceName = device.hostname || device.name || `Device ${macAddress.slice(-8)}`

    // Get traffic data from router (already included in device object from RouterAPIService)
    const bytesUploaded = (device as any).bytesUploaded || 0
    const bytesDownloaded = (device as any).bytesDownloaded || 0
    
    if (bytesUploaded === 0 && bytesDownloaded === 0) {
      return // No traffic data available
    }

    const today = new Date().toISOString().split('T')[0] // YYYY-MM-DD

    // Get or create usage record for today
    let usage = this.dataUsageCache.get(`${macAddress}-${today}`)
    if (!usage) {
      // Try to load from database
      const loadedUsage = await this.loadDataUsage(macAddress, today)
      if (loadedUsage) {
        usage = loadedUsage
        this.dataUsageCache.set(`${macAddress}-${today}`, usage)
      }
    }

    // Calculate delta if we have previous traffic
    const previous = this.previousTraffic.get(macAddress)
    const currentTraffic = {
      upload: BigInt(bytesUploaded),
      download: BigInt(bytesDownloaded)
    }

    if (previous) {
      const uploadDelta = currentTraffic.upload - previous.upload
      const downloadDelta = currentTraffic.download - previous.download

      if (uploadDelta > 0 || downloadDelta > 0) {
        // Update usage
        if (!usage) {
          usage = {
            id: `usage-${macAddress}-${today}`,
            macAddress,
            deviceName,
            bytesUploaded: BigInt(0),
            bytesDownloaded: BigInt(0),
            totalBytes: BigInt(0),
            lastUpdated: Date.now(),
            date: today
          }
        }

        usage.bytesUploaded += BigInt(Math.max(0, Number(uploadDelta)))
        usage.bytesDownloaded += BigInt(Math.max(0, Number(downloadDelta)))
        usage.totalBytes = usage.bytesUploaded + usage.bytesDownloaded
        usage.lastUpdated = Date.now()

        this.dataUsageCache.set(`${macAddress}-${today}`, usage)
        await this.saveDataUsage(usage)

        // Check threshold
        if (Number(usage.totalBytes) >= this.config.dataUsageThreshold) {
          // High data usage alert
          const alert: DeviceAlert = {
            id: `usage-${macAddress}-${Date.now()}`,
            macAddress,
            deviceName,
            alertType: 'high_data_usage',
            severity: Number(usage.totalBytes) >= this.config.dataUsageThreshold * 2 ? 'critical' : 'high',
            message: `High data usage detected`,
            details: `${deviceName} has used ${formatBytes(Number(usage.totalBytes))} today`,
            detectedAt: Date.now(),
            acknowledged: false
          }

          await this.saveAlert(alert)

          if (onAlert) {
            onAlert(alert)
          }

          console.log(`📊 High data usage: ${deviceName} - ${formatBytes(Number(usage.totalBytes))}`)
        }
      }
    }

    // Store current traffic for next comparison
    this.previousTraffic.set(macAddress, currentTraffic)
  }

  /**
   * Lookup vendor from MAC address OUI
   */
  private async lookupVendor(macAddress: string): Promise<string | undefined> {
    try {
      const response = await fetch(`/api/device-monitor/vendor-lookup?mac=${encodeURIComponent(macAddress)}`)
      const data = await response.json()
      return data.vendor
    } catch (error) {
      return undefined
    }
  }

  /**
   * Trust a device
   */
  async trustDevice(macAddress: string): Promise<boolean> {
    try {
      const response = await fetch('/api/device-monitor/trust-device', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ macAddress, isTrusted: true })
      })

      const data = await response.json()
      if (data.success) {
        const device = this.knownDevices.get(macAddress)
        if (device) {
          device.isTrusted = true
          this.knownDevices.set(macAddress, device)
        }
        return true
      }
      return false
    } catch (error) {
      console.error('Failed to trust device:', error)
      return false
    }
  }

  /**
   * Block a device (if router supports it)
   */
  async blockDevice(macAddress: string): Promise<boolean> {
    try {
      const response = await fetch('/api/device-monitor/block-device', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ macAddress })
      })

      const data = await response.json()
      return data.success
    } catch (error) {
      console.error('Failed to block device:', error)
      return false
    }
  }

  /**
   * Get top data usage devices
   */
  async getTopDataUsage(limit: number = 10): Promise<DeviceDataUsage[]> {
    try {
      const response = await fetch(`/api/device-monitor/top-usage?limit=${limit}`)
      const data = await response.json()
      return data.devices || []
    } catch (error) {
      console.error('Failed to get top data usage:', error)
      return []
    }
  }

  // Database operations
  private async saveKnownDevice(device: KnownDevice) {
    try {
      await fetch('/api/device-monitor/known-devices', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ device })
      })
    } catch (error) {
      console.error('Failed to save known device:', error)
    }
  }

  private async updateKnownDevice(device: KnownDevice) {
    try {
      await fetch('/api/device-monitor/known-devices', {
        method: 'PATCH',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ device })
      })
    } catch (error) {
      console.error('Failed to update known device:', error)
    }
  }

  private async saveDataUsage(usage: DeviceDataUsage) {
    try {
      await fetch('/api/device-monitor/data-usage', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ 
          usage: {
            ...usage,
            bytesUploaded: usage.bytesUploaded.toString(),
            bytesDownloaded: usage.bytesDownloaded.toString(),
            totalBytes: usage.totalBytes.toString()
          }
        })
      })
    } catch (error) {
      console.error('Failed to save data usage:', error)
    }
  }

  private async loadDataUsage(macAddress: string, date: string): Promise<DeviceDataUsage | null> {
    try {
      const response = await fetch(`/api/device-monitor/data-usage?mac=${encodeURIComponent(macAddress)}&date=${date}`)
      const data = await response.json()
      if (data.success && data.usage) {
        return {
          ...data.usage,
          bytesUploaded: BigInt(data.usage.bytesUploaded),
          bytesDownloaded: BigInt(data.usage.bytesDownloaded),
          totalBytes: BigInt(data.usage.totalBytes),
          lastUpdated: new Date(data.usage.lastUpdated).getTime()
        }
      }
      return null
    } catch (error) {
      return null
    }
  }

  private async saveAlert(alert: DeviceAlert) {
    try {
      await fetch('/api/device-monitor/alerts', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ alert })
      })
    } catch (error) {
      console.error('Failed to save alert:', error)
    }
  }
}

// Singleton instance
let deviceMonitorInstance: DeviceMonitor | null = null

export function getDeviceMonitor(config?: Partial<DeviceMonitorConfig>): DeviceMonitor {
  if (!deviceMonitorInstance) {
    deviceMonitorInstance = new DeviceMonitor(config)
  }
  return deviceMonitorInstance
}

// Helper function
function formatBytes(bytes: number): string {
  if (bytes === 0) return '0 B'
  const k = 1024
  const sizes = ['B', 'KB', 'MB', 'GB', 'TB']
  const i = Math.floor(Math.log(bytes) / Math.log(k))
  return `${(bytes / Math.pow(k, i)).toFixed(2)} ${sizes[i]}`
}
