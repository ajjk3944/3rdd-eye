/**
 * Integration Helper for Universal Device Monitor
 * Bridges the gap between old DeviceMonitor and new UniversalDeviceMonitor
 */

import { getUniversalDeviceMonitor, UniversalDeviceInfo } from './universal-device-monitor'
import { DeviceAlert } from './device-monitor'
import { notificationService } from './notification-service'

export class UniversalDeviceMonitorIntegration {
  private monitor = getUniversalDeviceMonitor()
  private knownDevices: Set<string> = new Set()
  private isFirstLaunch = false

  /**
   * Initialize and start monitoring
   */
  async start() {
    // Load known devices from database
    await this.loadKnownDevices()

    // Load router credentials if available
    const credentials = await this.loadRouterCredentials()
    if (credentials) {
      this.monitor.updateRouterCredentials(credentials)
      console.log('✅ Router API enabled')
    } else {
      console.log('ℹ️ Router API not available - using ARP/mDNS only')
    }

    // Start monitoring with callbacks
    await this.monitor.startMonitoring(
      (device) => this.handleDeviceDiscovered(device),
      (device) => this.handleDeviceLeft(device)
    )

    console.log('🚀 Universal Device Monitor started')
  }

  /**
   * Stop monitoring
   */
  stop() {
    this.monitor.stopMonitoring()
  }

  /**
   * Handle new device discovered
   */
  private async handleDeviceDiscovered(device: UniversalDeviceInfo) {
    const isKnown = this.knownDevices.has(device.macAddress)

    if (!isKnown) {
      // Add to known devices
      this.knownDevices.add(device.macAddress)
      await this.saveKnownDevice(device)

      // Create alert (skip on first launch)
      if (!this.isFirstLaunch) {
        await this.createUnknownDeviceAlert(device)
      } else {
        console.log(`ℹ️ First launch - device added without alert: ${device.deviceName}`)
      }
    } else {
      // Update last seen
      await this.updateKnownDevice(device)
    }
  }

  /**
   * Handle device left network
   */
  private async handleDeviceLeft(device: UniversalDeviceInfo) {
    console.log(`📴 Device offline: ${device.deviceName}`)
    // Optional: Create offline notification
  }

  /**
   * Create unknown device alert
   */
  private async createUnknownDeviceAlert(device: UniversalDeviceInfo) {
    const alert: DeviceAlert = {
      id: `unknown-${device.macAddress}-${Date.now()}`,
      macAddress: device.macAddress,
      deviceName: device.deviceName,
      alertType: 'unknown_device',
      severity: 'high',
      message: 'Unknown device joined your WiFi',
      details: `${device.deviceName} (${device.vendor || 'Unknown vendor'}) - Detected via ${device.detectionMethod}`,
      detectedAt: Date.now(),
      acknowledged: false
    }

    // Save to database
    await this.saveAlert(alert)

    // Send notification
    await notificationService.sendNotification({
      title: '🚨 Unknown Device Detected',
      body: `${device.deviceName} joined your WiFi`,
      data: {
        type: 'unknown_device',
        macAddress: device.macAddress,
        deviceName: device.deviceName
      }
    })

    console.log(`🚨 Alert created: ${device.deviceName}`)
  }

  /**
   * Complete first launch setup
   */
  async completeFirstLaunchSetup() {
    this.isFirstLaunch = false
    console.log('✅ First launch setup completed')
  }

  /**
   * Get all devices
   */
  getDevices(): UniversalDeviceInfo[] {
    return this.monitor.getDevices()
  }

  /**
   * Get online devices
   */
  getOnlineDevices(): UniversalDeviceInfo[] {
    return this.monitor.getOnlineDevices()
  }

  /**
   * Manual scan
   */
  async scan() {
    return await this.monitor.scan()
  }

  /**
   * Trust a device
   */
  async trustDevice(macAddress: string) {
    try {
      const response = await fetch('/api/device-monitor/trust-device', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ macAddress, isTrusted: true })
      })
      return (await response.json()).success
    } catch (error) {
      console.error('Failed to trust device:', error)
      return false
    }
  }

  /**
   * Block a device
   */
  async blockDevice(macAddress: string) {
    try {
      const response = await fetch('/api/device-monitor/block-device', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ macAddress })
      })
      return (await response.json()).success
    } catch (error) {
      console.error('Failed to block device:', error)
      return false
    }
  }

  // Database operations
  private async loadKnownDevices() {
    try {
      const response = await fetch('/api/device-monitor/known-devices')
      const data = await response.json()
      
      if (data.success && data.devices) {
        data.devices.forEach((device: any) => {
          this.knownDevices.add(device.macAddress)
        })
        console.log(`✅ Loaded ${this.knownDevices.size} known devices`)
        this.isFirstLaunch = this.knownDevices.size === 0
      }
    } catch (error) {
      console.error('Failed to load known devices:', error)
      this.isFirstLaunch = true
    }
  }

  private async loadRouterCredentials() {
    try {
      const response = await fetch('/api/router/credentials')
      const data = await response.json()
      return data.success ? data.credentials : null
    } catch (error) {
      return null
    }
  }

  private async saveKnownDevice(device: UniversalDeviceInfo) {
    try {
      await fetch('/api/device-monitor/known-devices', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({
          device: {
            macAddress: device.macAddress,
            ipAddress: device.ipAddress,
            hostname: device.hostname,
            deviceName: device.deviceName,
            vendor: device.vendor,
            isTrusted: false,
            firstSeen: device.firstSeen,
            lastSeen: device.lastSeen
          }
        })
      })
    } catch (error) {
      console.error('Failed to save known device:', error)
    }
  }

  private async updateKnownDevice(device: UniversalDeviceInfo) {
    try {
      await fetch('/api/device-monitor/known-devices', {
        method: 'PATCH',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({
          device: {
            macAddress: device.macAddress,
            ipAddress: device.ipAddress,
            lastSeen: device.lastSeen
          }
        })
      })
    } catch (error) {
      console.error('Failed to update known device:', error)
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
let integrationInstance: UniversalDeviceMonitorIntegration | null = null

export function getUniversalDeviceMonitorIntegration(): UniversalDeviceMonitorIntegration {
  if (!integrationInstance) {
    integrationInstance = new UniversalDeviceMonitorIntegration()
  }
  return integrationInstance
}
