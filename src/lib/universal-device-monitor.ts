/**
 * Universal Device Monitor
 * Works with ANY router using multiple detection methods:
 * 1. Router API (when available) - Most accurate
 * 2. ARP Scanning - Works on any network
 * 3. mDNS/Bonjour Discovery - Finds devices advertising services
 * 4. Network Packet Monitoring - Passive detection
 * 5. DHCP Lease Monitoring - If accessible
 */

import { NetworkDevice } from './native-plugins'
import { getNetworkScanner } from './native-plugins'

export interface UniversalDeviceInfo {
  macAddress: string
  ipAddress?: string
  hostname?: string
  deviceName: string
  vendor?: string
  detectionMethod: 'router_api' | 'arp_scan' | 'mdns' | 'packet_monitor' | 'dhcp'
  isOnline: boolean
  lastSeen: number
  firstSeen: number
  // Traffic data (if available)
  bytesUploaded?: number
  bytesDownloaded?: number
  // Additional metadata
  deviceType?: string // phone, laptop, tablet, iot, etc.
  manufacturer?: string
  services?: string[] // mDNS services
}

export interface ScanResult {
  devices: UniversalDeviceInfo[]
  scanMethod: string
  scanDuration: number
  success: boolean
  error?: string
}

export interface UniversalMonitorConfig {
  enableRouterAPI: boolean
  enableARPScan: boolean
  enableMDNS: boolean
  enablePacketMonitor: boolean
  scanInterval: number // milliseconds
  routerCredentials?: {
    routerIP: string
    username: string
    password: string
  }
}

const DEFAULT_CONFIG: UniversalMonitorConfig = {
  enableRouterAPI: true,
  enableARPScan: true,
  enableMDNS: true,
  enablePacketMonitor: false, // Requires root/admin
  scanInterval: 30000 // 30 seconds
}

export class UniversalDeviceMonitor {
  private config: UniversalMonitorConfig
  private monitoring = false
  private monitoringInterval: NodeJS.Timeout | null = null
  private deviceCache: Map<string, UniversalDeviceInfo> = new Map()
  private onDeviceDiscovered?: (device: UniversalDeviceInfo) => void
  private onDeviceLeft?: (device: UniversalDeviceInfo) => void

  constructor(config?: Partial<UniversalMonitorConfig>) {
    this.config = { ...DEFAULT_CONFIG, ...config }
  }

  /**
   * Start universal monitoring using all available methods
   */
  async startMonitoring(
    onDeviceDiscovered?: (device: UniversalDeviceInfo) => void,
    onDeviceLeft?: (device: UniversalDeviceInfo) => void
  ) {
    if (this.monitoring) return

    this.onDeviceDiscovered = onDeviceDiscovered
    this.onDeviceLeft = onDeviceLeft
    this.monitoring = true

    console.log('🌐 Starting Universal Device Monitor...')
    console.log('   Methods enabled:', {
      routerAPI: this.config.enableRouterAPI,
      arpScan: this.config.enableARPScan,
      mdns: this.config.enableMDNS,
      packetMonitor: this.config.enablePacketMonitor
    })

    // Initial scan
    await this.performUniversalScan()

    // Continuous monitoring
    this.monitoringInterval = setInterval(async () => {
      if (!this.monitoring) return
      await this.performUniversalScan()
    }, this.config.scanInterval)
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
    console.log('⏹️ Stopped Universal Device Monitor')
  }

  /**
   * Perform universal scan using all enabled methods
   */
  private async performUniversalScan() {
    const startTime = Date.now()
    const allDevices = new Map<string, UniversalDeviceInfo>()

    console.log('🔍 Starting universal scan...')

    // Method 1: Router API (if credentials available)
    if (this.config.enableRouterAPI && this.config.routerCredentials) {
      const routerDevices = await this.scanViaRouterAPI()
      routerDevices.forEach(device => {
        allDevices.set(device.macAddress, device)
      })
      console.log(`   ✓ Router API: ${routerDevices.length} devices`)
    }

    // Method 2: ARP Scan (works on any network)
    if (this.config.enableARPScan) {
      const arpDevices = await this.scanViaARP()
      arpDevices.forEach(device => {
        const existing = allDevices.get(device.macAddress)
        if (existing) {
          // Merge data
          allDevices.set(device.macAddress, this.mergeDeviceInfo(existing, device))
        } else {
          allDevices.set(device.macAddress, device)
        }
      })
      console.log(`   ✓ ARP Scan: ${arpDevices.length} devices`)
    }

    // Method 3: mDNS Discovery
    if (this.config.enableMDNS) {
      const mdnsDevices = await this.scanViaMDNS()
      mdnsDevices.forEach(device => {
        const existing = allDevices.get(device.macAddress)
        if (existing) {
          allDevices.set(device.macAddress, this.mergeDeviceInfo(existing, device))
        } else {
          allDevices.set(device.macAddress, device)
        }
      })
      console.log(`   ✓ mDNS: ${mdnsDevices.length} devices`)
    }

    // Method 4: Packet Monitor (if enabled and available)
    if (this.config.enablePacketMonitor) {
      const packetDevices = await this.scanViaPacketMonitor()
      packetDevices.forEach(device => {
        const existing = allDevices.get(device.macAddress)
        if (existing) {
          allDevices.set(device.macAddress, this.mergeDeviceInfo(existing, device))
        } else {
          allDevices.set(device.macAddress, device)
        }
      })
      console.log(`   ✓ Packet Monitor: ${packetDevices.length} devices`)
    }

    const scanDuration = Date.now() - startTime
    console.log(`✅ Universal scan completed: ${allDevices.size} total devices (${scanDuration}ms)`)

    // Compare with cache and trigger callbacks
    await this.updateDeviceCache(allDevices)
  }

  /**
   * Method 1: Scan via Router API
   */
  private async scanViaRouterAPI(): Promise<UniversalDeviceInfo[]> {
    try {
      if (!this.config.routerCredentials) return []

      const scanner = getNetworkScanner()
      if (!scanner) return []

      const result = await scanner.scanWithRouterCredentials(this.config.routerCredentials)

      if (!result.success || !result.devices) return []

      return result.devices.map(device => ({
        macAddress: device.macAddress || 'unknown',
        ipAddress: device.ipAddress,
        hostname: device.hostname || device.name,
        deviceName: device.hostname || device.name || `Device ${device.macAddress?.slice(-8)}`,
        vendor: device.vendor,
        detectionMethod: 'router_api' as const,
        isOnline: true,
        lastSeen: Date.now(),
        firstSeen: Date.now(),
        bytesUploaded: (device as any).bytesUploaded,
        bytesDownloaded: (device as any).bytesDownloaded
      }))
    } catch (error) {
      console.warn('Router API scan failed:', error)
      return []
    }
  }

  /**
   * Method 2: Scan via ARP (works on any network)
   */
  private async scanViaARP(): Promise<UniversalDeviceInfo[]> {
    try {
      const scanner = getNetworkScanner()
      if (!scanner) return []

      const result = await scanner.scanNetwork()

      if (!result.success || !result.devices) return []

      return result.devices.map(device => ({
        macAddress: device.macAddress || 'unknown',
        ipAddress: device.ipAddress,
        hostname: device.hostname || device.name,
        deviceName: device.hostname || device.name || `Device ${device.macAddress?.slice(-8)}`,
        vendor: device.vendor,
        detectionMethod: 'arp_scan' as const,
        isOnline: true,
        lastSeen: Date.now(),
        firstSeen: Date.now()
      }))
    } catch (error) {
      console.warn('ARP scan failed:', error)
      return []
    }
  }

  /**
   * Method 3: Scan via mDNS/Bonjour Discovery
   */
  private async scanViaMDNS(): Promise<UniversalDeviceInfo[]> {
    try {
      // Call native plugin for mDNS discovery
      const response = await fetch('/api/device-monitor/mdns-scan')
      const data = await response.json()

      if (!data.success || !data.devices) return []

      return data.devices.map((device: any) => ({
        macAddress: device.macAddress || 'unknown',
        ipAddress: device.ipAddress,
        hostname: device.hostname,
        deviceName: device.name || device.hostname || `Device ${device.macAddress?.slice(-8)}`,
        vendor: device.vendor,
        detectionMethod: 'mdns' as const,
        isOnline: true,
        lastSeen: Date.now(),
        firstSeen: Date.now(),
        services: device.services || [],
        deviceType: this.inferDeviceType(device.services)
      }))
    } catch (error) {
      console.warn('mDNS scan failed:', error)
      return []
    }
  }

  /**
   * Method 4: Scan via Packet Monitor (passive detection)
   */
  private async scanViaPacketMonitor(): Promise<UniversalDeviceInfo[]> {
    try {
      // Call native plugin for packet monitoring
      const response = await fetch('/api/device-monitor/packet-monitor')
      const data = await response.json()

      if (!data.success || !data.devices) return []

      return data.devices.map((device: any) => ({
        macAddress: device.macAddress || 'unknown',
        ipAddress: device.ipAddress,
        hostname: device.hostname,
        deviceName: device.hostname || `Device ${device.macAddress?.slice(-8)}`,
        vendor: device.vendor,
        detectionMethod: 'packet_monitor' as const,
        isOnline: true,
        lastSeen: Date.now(),
        firstSeen: Date.now()
      }))
    } catch (error) {
      console.warn('Packet monitor failed:', error)
      return []
    }
  }

  /**
   * Merge device information from multiple sources
   */
  private mergeDeviceInfo(
    existing: UniversalDeviceInfo,
    newInfo: UniversalDeviceInfo
  ): UniversalDeviceInfo {
    return {
      ...existing,
      // Prefer router API data for traffic
      bytesUploaded: newInfo.bytesUploaded || existing.bytesUploaded,
      bytesDownloaded: newInfo.bytesDownloaded || existing.bytesDownloaded,
      // Prefer more specific hostname
      hostname: newInfo.hostname || existing.hostname,
      deviceName: newInfo.hostname || existing.deviceName,
      // Prefer router API or mDNS for vendor
      vendor: newInfo.vendor || existing.vendor,
      // Merge services
      services: [...(existing.services || []), ...(newInfo.services || [])],
      // Update detection method to show multiple sources
      detectionMethod: existing.detectionMethod === 'router_api' 
        ? existing.detectionMethod 
        : newInfo.detectionMethod,
      // Update last seen
      lastSeen: Date.now(),
      isOnline: true
    }
  }

  /**
   * Update device cache and trigger callbacks
   */
  private async updateDeviceCache(newDevices: Map<string, UniversalDeviceInfo>) {
    const now = Date.now()
    const offlineThreshold = this.config.scanInterval * 3 // 3 missed scans = offline

    // Check for new devices
    for (const [mac, device] of newDevices) {
      const cached = this.deviceCache.get(mac)
      
      if (!cached) {
        // New device discovered!
        console.log(`🆕 New device: ${device.deviceName} (${mac})`)
        this.deviceCache.set(mac, device)
        
        if (this.onDeviceDiscovered) {
          this.onDeviceDiscovered(device)
        }
      } else {
        // Update existing device
        this.deviceCache.set(mac, {
          ...cached,
          ...device,
          firstSeen: cached.firstSeen // Keep original first seen
        })
      }
    }

    // Check for devices that went offline
    for (const [mac, cached] of this.deviceCache) {
      if (!newDevices.has(mac)) {
        if (now - cached.lastSeen > offlineThreshold && cached.isOnline) {
          // Device went offline
          console.log(`📴 Device offline: ${cached.deviceName} (${mac})`)
          cached.isOnline = false
          
          if (this.onDeviceLeft) {
            this.onDeviceLeft(cached)
          }
        }
      }
    }
  }

  /**
   * Infer device type from mDNS services
   */
  private inferDeviceType(services?: string[]): string | undefined {
    if (!services || services.length === 0) return undefined

    const serviceStr = services.join(' ').toLowerCase()

    if (serviceStr.includes('airplay') || serviceStr.includes('homekit')) return 'apple_device'
    if (serviceStr.includes('chromecast')) return 'chromecast'
    if (serviceStr.includes('spotify')) return 'speaker'
    if (serviceStr.includes('printer') || serviceStr.includes('ipp')) return 'printer'
    if (serviceStr.includes('smb') || serviceStr.includes('afp')) return 'nas'
    if (serviceStr.includes('http') || serviceStr.includes('https')) return 'web_server'
    if (serviceStr.includes('ssh')) return 'server'

    return 'unknown'
  }

  /**
   * Get all discovered devices
   */
  getDevices(): UniversalDeviceInfo[] {
    return Array.from(this.deviceCache.values())
  }

  /**
   * Get online devices only
   */
  getOnlineDevices(): UniversalDeviceInfo[] {
    return Array.from(this.deviceCache.values()).filter(d => d.isOnline)
  }

  /**
   * Get device by MAC address
   */
  getDevice(macAddress: string): UniversalDeviceInfo | undefined {
    return this.deviceCache.get(macAddress)
  }

  /**
   * Manual scan trigger
   */
  async scan(): Promise<ScanResult> {
    const startTime = Date.now()
    
    try {
      await this.performUniversalScan()
      
      return {
        devices: this.getOnlineDevices(),
        scanMethod: 'universal',
        scanDuration: Date.now() - startTime,
        success: true
      }
    } catch (error: any) {
      return {
        devices: [],
        scanMethod: 'universal',
        scanDuration: Date.now() - startTime,
        success: false,
        error: error.message
      }
    }
  }

  /**
   * Update router credentials
   */
  updateRouterCredentials(credentials: {
    routerIP: string
    username: string
    password: string
  }) {
    this.config.routerCredentials = credentials
    this.config.enableRouterAPI = true
    console.log('✅ Router credentials updated')
  }

  /**
   * Clear router credentials (fallback to ARP/mDNS only)
   */
  clearRouterCredentials() {
    this.config.routerCredentials = undefined
    this.config.enableRouterAPI = false
    console.log('ℹ️ Router API disabled - using ARP/mDNS only')
  }
}

// Singleton instance
let universalMonitorInstance: UniversalDeviceMonitor | null = null

export function getUniversalDeviceMonitor(
  config?: Partial<UniversalMonitorConfig>
): UniversalDeviceMonitor {
  if (!universalMonitorInstance) {
    universalMonitorInstance = new UniversalDeviceMonitor(config)
  }
  return universalMonitorInstance
}
