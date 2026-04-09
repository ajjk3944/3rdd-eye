/**
 * Router Traffic API - Fetches real network traffic data from router
 */

export interface RouterTrafficData {
  macAddress: string
  deviceName: string
  ipAddress: string
  bytesUploaded: number
  bytesDownloaded: number
  connectionCount: number
  destinationIPs: string[]
  activeConnections: Array<{
    protocol: string
    localPort: number
    remoteIP: string
    remotePort: number
  }>
  timestamp: number
}

export interface RouterCredentials {
  username: string
  password: string
  routerIP: string
}

class RouterTrafficAPI {
  private credentials: RouterCredentials | null = null
  private lastFetchTime: number = 0
  private cachedData: Map<string, RouterTrafficData> = new Map()

  /**
   * Set router credentials
   */
  setCredentials(credentials: RouterCredentials) {
    this.credentials = credentials
    console.log('✅ Router credentials set for', credentials.routerIP)
  }

  /**
   * Fetch real traffic data from router
   */
  async fetchTrafficData(devices: any[]): Promise<Map<string, RouterTrafficData>> {
    if (!this.credentials) {
      throw new Error('Router credentials not set')
    }

    try {
      // Call router API to get traffic statistics
      const response = await fetch(`/api/router/traffic`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({
          routerIP: this.credentials.routerIP,
          username: this.credentials.username,
          password: this.credentials.password,
          devices: devices.map(d => ({
            macAddress: d.macAddress,
            ipAddress: d.ipAddress,
            name: d.name
          }))
        })
      })

      if (!response.ok) {
        throw new Error(`Router API error: ${response.statusText}`)
      }

      const data = await response.json()
      
      // Update cache
      const trafficMap = new Map<string, RouterTrafficData>()
      data.devices.forEach((device: RouterTrafficData) => {
        trafficMap.set(device.macAddress, device)
        this.cachedData.set(device.macAddress, device)
      })

      this.lastFetchTime = Date.now()
      console.log('✅ Fetched real traffic data for', trafficMap.size, 'devices')
      
      return trafficMap
    } catch (error) {
      console.error('Failed to fetch router traffic:', error)
      throw error
    }
  }

  /**
   * Get cached traffic data
   */
  getCachedData(macAddress: string): RouterTrafficData | null {
    return this.cachedData.get(macAddress) || null
  }

  /**
   * Check if credentials are set
   */
  hasCredentials(): boolean {
    return this.credentials !== null
  }

  /**
   * Clear credentials
   */
  clearCredentials() {
    this.credentials = null
    this.cachedData.clear()
  }
}

export const routerTrafficAPI = new RouterTrafficAPI()
