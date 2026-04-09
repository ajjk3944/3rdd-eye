// Simple Device Monitor - No Router Authentication Required
// Uses network scanning + ARP table to detect devices
// Stores data in local storage (no API/database needed)

import { NetworkDevice, getNetworkScanner, isCapacitor } from './native-plugins'
import { 
  getKnownDevices, 
  saveKnownDevice, 
  updateDeviceLastSeen,
  saveAlert as saveAlertToStorage,
  type KnownDevice,
  type DeviceAlert as StoredAlert
} from './local-storage-db'

export interface SimpleDeviceAlert {
  id: string
  macAddress: string
  deviceName: string
  ipAddress: string
  vendor?: string
  alertType: 'new_device' | 'device_reconnected'
  severity: 'info' | 'warning' | 'high'
  message: string
  detectedAt: number
  acknowledged: boolean
}

export interface SimpleMonitorConfig {
  scanInterval: number // milliseconds (default: 30000 = 30s)
  enableNotifications: boolean
  autoMarkKnown: boolean // Auto-mark devices as known on first scan
}

const DEFAULT_CONFIG: SimpleMonitorConfig = {
  scanInterval: 30000, // 30 seconds
  enableNotifications: true,
  autoMarkKnown: false
}

// Check if we're in Capacitor environment
function checkCapacitorAvailable(): boolean {
  if (!isCapacitor) {
    console.error('❌ Not running in Capacitor environment')
    return false
  }
  
  const scanner = getNetworkScanner()
  if (!scanner) {
    console.error('❌ Network Scanner plugin not available')
    return false
  }
  
  return true
}

/**
 * Simple Device Monitor
 * Uses network scanning without router authentication
 */
export class SimpleDeviceMonitor {
  private config: SimpleMonitorConfig = DEFAULT_CONFIG
  private monitoring = false
  private monitoringInterval: NodeJS.Timeout | null = null
  private knownDevices: Map<string, { macAddress: string; deviceName: string; firstSeen: number; lastSeen: number }> = new Map()
  private isFirstScan = true

  constructor(config?: Partial<SimpleMonitorConfig>) {
    if (config) {
      this.config = { ...DEFAULT_CONFIG, ...config }
    }
  }

  /**
   * Load known devices from local storage
   */
  private async loadKnownDevices() {
    try {
      const devices = getKnownDevices()
      
      devices.forEach((device) => {
        this.knownDevices.set(device.macAddress, {
          macAddress: device.macAddress,
          deviceName: device.deviceName,
          firstSeen: device.firstSeen,
          lastSeen: device.lastSeen
        })
      })
      
      console.log(`✅ Loaded ${this.knownDevices.size} known devices from local storage`)
    } catch (error) {
      console.error('Failed to load known devices:', error)
    }
  }

  /**
   * Start monitoring network devices
   */
  async startMonitoring(onAlert?: (alert: SimpleDeviceAlert) => void) {
    if (this.monitoring) {
      console.log('⚠️ Monitoring already active')
      return
    }

    // Check if Capacitor is available
    if (!checkCapacitorAvailable()) {
      throw new Error('Device monitoring requires the mobile app environment')
    }

    console.log('🚀 Starting Simple Device Monitor...')
    console.log(`   Scan interval: ${this.config.scanInterval}ms`)

    // Load known devices from database
    await this.loadKnownDevices()
    console.log(`   Known devices: ${this.knownDevices.size}`)

    this.monitoring = true

    // Initial scan immediately
    console.log('📡 Running initial scan...')
    await this.scanAndCheck(onAlert)

    // Set up periodic scanning
    this.monitoringInterval = setInterval(async () => {
      if (!this.monitoring) return
      console.log('📡 Running periodic scan...')
      await this.scanAndCheck(onAlert)
    }, this.config.scanInterval)

    console.log('✅ Device Monitor started successfully')
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
    console.log('⏹️ Stopped Simple Device Monitor')
  }

  /**
   * Scan network and check for unknown devices
   */
  private async scanAndCheck(onAlert?: (alert: SimpleDeviceAlert) => void) {
    try {
      const scanner = getNetworkScanner()
      if (!scanner) {
        console.error('❌ Network scanner not available')
        return
      }

      console.log('🔍 Scanning network devices...')
      
      // Try multiple scan methods for better coverage
      let devices: NetworkDevice[] = []
      
      // Method 1: Regular scan
      try {
        const scanResult = await scanner.scanDevices()
        console.log('� Scan result:', scanResult)
        
        if (scanResult.success && scanResult.devices && scanResult.devices.length > 0) {
          devices = scanResult.devices
          console.log(`✅ Found ${devices.length} devices via regular scan`)
        }
      } catch (error) {
        console.error('Regular scan failed:', error)
      }

      // Method 2: Try ARP table if regular scan failed or found nothing
      if (devices.length === 0) {
        try {
          console.log('🔄 Trying ARP table scan...')
          const arpResult = await scanner.getArpTable()
          console.log('📊 ARP result:', arpResult)
          
          if (arpResult.success && arpResult.devices && arpResult.devices.length > 0) {
            devices = arpResult.devices
            console.log(`✅ Found ${devices.length} devices via ARP table`)
          }
        } catch (error) {
          console.error('ARP scan failed:', error)
        }
      }

      if (devices.length === 0) {
        console.log('⚠️ No devices found in scan')
        return
      }

      console.log(`📱 Processing ${devices.length} devices...`)

      // On first scan, optionally auto-mark all as known
      if (this.isFirstScan && this.config.autoMarkKnown) {
        console.log('🆕 First scan - auto-marking all devices as known')
        for (const device of devices) {
          if (device.macAddress) {
            await this.markDeviceAsKnown(device)
          }
        }
        this.isFirstScan = false
        console.log('✅ All devices marked as known')
        return
      }

      this.isFirstScan = false

      // Check each device
      let newDeviceCount = 0
      for (const device of devices) {
        const macAddress = device.macAddress
        if (!macAddress) {
          console.log('⚠️ Skipping device without MAC address:', device.ipAddress)
          continue
        }

        const isNew = await this.checkDevice(device, onAlert)
        if (isNew) newDeviceCount++
      }

      console.log(`✅ Scan complete. New devices: ${newDeviceCount}`)
    } catch (error) {
      console.error('❌ Device monitor scan error:', error)
    }
  }

  /**
   * Check if device is unknown and send alert
   */
  private async checkDevice(device: NetworkDevice, onAlert?: (alert: SimpleDeviceAlert) => void): Promise<boolean> {
    const macAddress = device.macAddress!
    const knownDevice = this.knownDevices.get(macAddress)

    if (!knownDevice) {
      // Unknown device detected!
      const deviceName = device.hostname || device.name || device.vendor || `Device ${macAddress.slice(-8)}`
      
      console.log(`🚨 UNKNOWN DEVICE DETECTED:`)
      console.log(`   Name: ${deviceName}`)
      console.log(`   MAC: ${macAddress}`)
      console.log(`   IP: ${device.ipAddress}`)
      console.log(`   Vendor: ${device.vendor || 'Unknown'}`)

      // Add to known devices
      const newDevice = {
        macAddress,
        deviceName,
        firstSeen: Date.now(),
        lastSeen: Date.now()
      }
      this.knownDevices.set(macAddress, newDevice)

      // Save to local storage
      saveKnownDevice({
        macAddress,
        ipAddress: device.ipAddress,
        hostname: device.hostname || device.name,
        deviceName,
        vendor: device.vendor,
        isTrusted: false,
        firstSeen: Date.now(),
        lastSeen: Date.now()
      })

      // Create alert
      const alert: SimpleDeviceAlert = {
        id: `new-${macAddress}-${Date.now()}`,
        macAddress,
        deviceName,
        ipAddress: device.ipAddress || 'Unknown',
        vendor: device.vendor,
        alertType: 'new_device',
        severity: 'high',
        message: `New device joined your network`,
        detectedAt: Date.now(),
        acknowledged: false
      }

      // Save alert to local storage
      saveAlertToStorage({
        id: alert.id,
        macAddress: alert.macAddress,
        deviceName: alert.deviceName,
        alertType: alert.alertType,
        severity: alert.severity,
        message: alert.message,
        details: `IP: ${alert.ipAddress}${alert.vendor ? `, Vendor: ${alert.vendor}` : ''}`,
        detectedAt: alert.detectedAt,
        acknowledged: false
      })

      // Trigger callback
      if (onAlert) {
        onAlert(alert)
      }

      return true // New device
    } else {
      // Update last seen in local storage
      knownDevice.lastSeen = Date.now()
      updateDeviceLastSeen(macAddress, Date.now())
      return false // Known device
    }
  }

  /**
   * Mark device as known (for first scan)
   */
  private async markDeviceAsKnown(device: NetworkDevice) {
    const macAddress = device.macAddress!
    const deviceName = device.hostname || device.name || device.vendor || `Device ${macAddress.slice(-8)}`

    const newDevice = {
      macAddress,
      deviceName,
      firstSeen: Date.now(),
      lastSeen: Date.now()
    }
    this.knownDevices.set(macAddress, newDevice)

    // Save to local storage
    saveKnownDevice({
      macAddress,
      ipAddress: device.ipAddress,
      hostname: device.hostname || device.name,
      deviceName,
      vendor: device.vendor,
      isTrusted: true, // Auto-marked as trusted
      firstSeen: Date.now(),
      lastSeen: Date.now()
    })
  }

  /**
   * Get all known devices
   */
  getKnownDevices() {
    return Array.from(this.knownDevices.values())
  }

  /**
   * Get monitoring status
   */
  isMonitoring(): boolean {
    return this.monitoring
  }

  /**
   * Manual scan
   */
  async scanNow(onAlert?: (alert: SimpleDeviceAlert) => void) {
    await this.scanAndCheck(onAlert)
  }
}

// Singleton instance
let monitorInstance: SimpleDeviceMonitor | null = null

export function getSimpleDeviceMonitor(config?: Partial<SimpleMonitorConfig>): SimpleDeviceMonitor {
  if (!monitorInstance) {
    monitorInstance = new SimpleDeviceMonitor(config)
  }
  return monitorInstance
}
