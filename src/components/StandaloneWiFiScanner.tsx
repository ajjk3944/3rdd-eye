'use client'

import { useState, useEffect, useCallback } from 'react'
import { WiFiScanner } from '@/components/WiFiScanner'
import { getWiFiScanner, getNetworkScanner, WiFiNetwork, NetworkDevice, isCapacitor } from '@/lib/native-plugins'
import { toast } from 'sonner'

export function StandaloneWiFiScanner() {
  const [networks, setNetworks] = useState<WiFiNetwork[]>([])
  const [loading, setLoading] = useState(false)
  const [currentNetwork, setCurrentNetwork] = useState<any>(null)
  const [networkDevices, setNetworkDevices] = useState<NetworkDevice[]>([])
  const [devicesLoading, setDevicesLoading] = useState(false)

  // Get current network
  const getCurrentNetwork = useCallback(async () => {
    if (!isCapacitor) return null
    
    const wifiScanner = getWiFiScanner()
    if (!wifiScanner) return null

    try {
      const result = await wifiScanner.getCurrentNetwork()
      console.log('📱 getCurrentNetwork result:', result)
      const newNetwork = result.connected ? { ...result, isConnected: result.connected } : null
      console.log('📱 Setting currentNetwork:', newNetwork)
      setCurrentNetwork(newNetwork)
      return result
    } catch (error) {
      console.error('Failed to get current network:', error)
      return null
    }
  }, [])

  // Scan for networks
  const scanNetworks = useCallback(async () => {
    if (!isCapacitor) {
      toast.error('WiFi scanning only available on mobile')
      return
    }

    const wifiScanner = getWiFiScanner()
    if (!wifiScanner) {
      toast.error('WiFi scanner not available')
      return
    }

    setLoading(true)
    try {
      const result = await wifiScanner.scan()
      if (result.success) {
        const scannedNetworks = Array.isArray(result.networks) ? result.networks : []
        setNetworks(scannedNetworks)
        await getCurrentNetwork()
      } else {
        setNetworks([])
        toast.error('Scan failed', { description: result.error })
      }
    } catch (error: any) {
      setNetworks([])
      toast.error('Scan error', { description: error.message })
    } finally {
      setLoading(false)
    }
  }, [getCurrentNetwork])

  // Handle network connect
  const handleNetworkConnect = async (network: WiFiNetwork) => {
    // This will be handled by WiFiScanner's internal logic
    console.log('Connect to network:', network.ssid)
  }

  // Scan devices
  const handleScanDevices = async () => {
    setDevicesLoading(true)
    try {
      // Device scanning logic here
      console.log('Scanning devices...')
    } catch (error) {
      console.error('Failed to scan devices:', error)
    } finally {
      setDevicesLoading(false)
    }
  }

  // Initial scan on mount
  useEffect(() => {
    const init = async () => {
      console.log('🚀 StandaloneWiFiScanner initializing...')
      await getCurrentNetwork()
      await scanNetworks()
    }
    init()
  }, [scanNetworks, getCurrentNetwork])

  // Auto-refresh current network every 3 seconds
  useEffect(() => {
    const interval = setInterval(() => {
      if (!loading) {
        getCurrentNetwork()
      }
    }, 3000)
    
    return () => clearInterval(interval)
  }, [loading, getCurrentNetwork])

  return (
    <WiFiScanner
      onScan={scanNetworks}
      networks={networks}
      loading={loading}
      currentNetwork={currentNetwork}
      onNetworkConnect={handleNetworkConnect}
      networkDevices={networkDevices}
      onScanDevices={handleScanDevices}
      devicesLoading={devicesLoading}
    />
  )
}
