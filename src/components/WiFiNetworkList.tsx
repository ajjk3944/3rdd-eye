'use client'

import { useState, useEffect, useCallback, useRef } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Badge } from '@/components/ui/badge'
import { ScrollArea } from '@/components/ui/scroll-area'
import { Wifi, RefreshCw, Lock, Signal } from 'lucide-react'
import { getWiFiScanner, WiFiNetwork, isCapacitor } from '@/lib/native-plugins'
import { WiFiConnectSheet } from '@/components/WiFiConnectSheet'
import { NetworkDetailsSheet } from '@/components/NetworkDetailsSheet'
import { getNetworkScanner } from '@/lib/native-plugins'
import { toast } from 'sonner'

interface WiFiNetworkListProps {
  onNetworkChange?: () => void
}

export function WiFiNetworkList({ onNetworkChange }: WiFiNetworkListProps) {
  const [networks, setNetworks] = useState<WiFiNetwork[]>([])
  const [savedNetworks, setSavedNetworks] = useState<any[]>([])
  const [loading, setLoading] = useState(false)
  const [currentNetwork, setCurrentNetwork] = useState<any>(null)
  const [selectedNetwork, setSelectedNetwork] = useState<WiFiNetwork | null>(null)
  const [showConnectSheet, setShowConnectSheet] = useState(false)
  const [showDetailsSheet, setShowDetailsSheet] = useState(false)
  const [networkInfo, setNetworkInfo] = useState<any>(null)
  const refreshIntervalRef = useRef<NodeJS.Timeout | null>(null)

  // Load saved networks from database
  const loadSavedNetworks = useCallback(async () => {
    try {
      const response = await fetch('/api/saved-wifi')
      const data = await response.json()
      if (data.success) {
        // Ensure networks is always an array
        const networks = Array.isArray(data.networks) ? data.networks : []
        setSavedNetworks(networks)
      } else {
        setSavedNetworks([])
      }
    } catch (error) {
      console.error('Failed to load saved networks:', error)
      setSavedNetworks([])
    }
  }, [])

  // Get current network info (uses device's native WiFi)
  const getCurrentNetwork = useCallback(async () => {
    if (!isCapacitor) return null
    
    const wifiScanner = getWiFiScanner()
    if (!wifiScanner) return null

    try {
      const result = await wifiScanner.getCurrentNetwork()
      const newNetwork = result.connected ? result : null
      
      // Update state only if changed
      setCurrentNetwork((prev: any) => {
        if (prev?.ssid !== newNetwork?.ssid) {
          return newNetwork
        }
        return prev
      })
      
      return result
    } catch (error) {
      console.error('Failed to get current network:', error)
      return null
    }
  }, [])

  // Scan for networks
  const scanNetworks = useCallback(async (silent = false) => {
    if (!isCapacitor) {
      if (!silent) toast.error('WiFi scanning only available on mobile')
      return
    }

    const wifiScanner = getWiFiScanner()
    if (!wifiScanner) {
      if (!silent) toast.error('WiFi scanner not available')
      return
    }

    setLoading(true)
    try {
      const result = await wifiScanner.scan()
      if (result.success) {
        // Ensure networks is always an array
        const scannedNetworks = Array.isArray(result.networks) ? result.networks : []
        setNetworks(scannedNetworks)
        await getCurrentNetwork()
        await loadSavedNetworks()
      } else {
        setNetworks([])
        if (!silent) toast.error('Scan failed', { description: result.error })
      }
    } catch (error: any) {
      setNetworks([])
      if (!silent) toast.error('Scan error', { description: error.message })
    } finally {
      setLoading(false)
    }
  }, [getCurrentNetwork, loadSavedNetworks])

  // Initial scan
  useEffect(() => {
    scanNetworks()
  }, [scanNetworks])

  // Auto-refresh every 3 seconds for real-time updates
  useEffect(() => {
    refreshIntervalRef.current = setInterval(async () => {
      if (!loading) {
        await getCurrentNetwork()
        await loadSavedNetworks()
      }
    }, 3000)
    
    return () => {
      if (refreshIntervalRef.current) {
        clearInterval(refreshIntervalRef.current)
      }
    }
  }, [loading, getCurrentNetwork, loadSavedNetworks])

  // Check if network is saved
  const isNetworkSaved = (ssid: string) => {
    return savedNetworks.some(n => n.ssid === ssid)
  }

  // Get saved password
  const getSavedPassword = (ssid: string) => {
    const saved = savedNetworks.find(n => n.ssid === ssid)
    return saved?.password
  }

  // Get network info for details sheet
  const getNetworkInfo = useCallback(async () => {
    if (!isCapacitor) return null
    
    const netScanner = getNetworkScanner()
    if (!netScanner) return null

    try {
      const info = await netScanner.getNetworkInfo()
      if (info.success) {
        setNetworkInfo(info)
        return info
      }
      return null
    } catch (error) {
      console.error('Failed to get network info:', error)
      return null
    }
  }, [])

  // Handle network click
  const handleNetworkClick = async (network: WiFiNetwork) => {
    const isConnected = currentNetwork?.ssid === network.ssid
    
    setSelectedNetwork(network)
    
    if (isConnected) {
      // Show details sheet for connected network
      await getNetworkInfo()
      setShowDetailsSheet(true)
    } else {
      // Show connect sheet for non-connected networks
      setShowConnectSheet(true)
    }
  }

  // Handle connect (uses device's native WiFi)
  const handleConnect = async (ssid: string, password: string, saveCredentials: boolean) => {
    const wifiScanner = getWiFiScanner()
    if (!wifiScanner) {
      throw new Error('WiFi scanner not available')
    }

    try {
      // Use device's native WiFi to connect
      const result = await wifiScanner.connect({ ssid, password })
      
      if (!result.success) {
        throw new Error(result.error || 'Connection failed')
      }

      // Save credentials if requested
      if (saveCredentials && password) {
        await fetch('/api/saved-wifi', {
          method: 'POST',
          headers: { 'Content-Type': 'application/json' },
          body: JSON.stringify({
            ssid,
            password,
            security: selectedNetwork?.security || 'WPA/WPA2'
          })
        })
      }

      toast.success(`Connected to ${ssid}`)
      
      // Immediate refresh to show new status
      setTimeout(async () => {
        await getCurrentNetwork()
        await loadSavedNetworks()
        await scanNetworks(true)
        onNetworkChange?.()
      }, 1000)
    } catch (error: any) {
      throw new Error(error.message || 'Failed to connect')
    }
  }

  // Handle disconnect (just disconnect, keep in saved networks)
  const handleDisconnect = async (ssid: string) => {
    const wifiScanner = getWiFiScanner()
    if (!wifiScanner) {
      throw new Error('WiFi scanner not available')
    }

    try {
      // Use device's native WiFi to disconnect
      const result = await wifiScanner.disconnect()
      
      if (!result.success) {
        throw new Error(result.error || 'Disconnect failed')
      }

      toast.success(`Disconnected from ${ssid}`)
      
      // Immediate refresh to show new status
      setTimeout(async () => {
        await getCurrentNetwork()
        await loadSavedNetworks()
        onNetworkChange?.()
      }, 500)
    } catch (error: any) {
      throw new Error(error.message || 'Failed to disconnect')
    }
  }

  // Handle forget (immediate, no confirmation - disconnect + delete from saved)
  const handleForget = async (ssid: string) => {
    const wifiScanner = getWiFiScanner()
    
    try {
      // Disconnect if currently connected
      if (currentNetwork?.ssid === ssid && wifiScanner) {
        await wifiScanner.disconnect()
      }

      // Remove from database
      const response = await fetch(`/api/saved-wifi?ssid=${encodeURIComponent(ssid)}`, {
        method: 'DELETE'
      })
      
      const data = await response.json()
      if (data.success) {
        toast.success(`Forgot ${ssid}`)
        
        // Immediate refresh
        setTimeout(async () => {
          await getCurrentNetwork()
          await loadSavedNetworks()
          onNetworkChange?.()
        }, 500)
      } else {
        throw new Error('Failed to forget network')
      }
    } catch (error: any) {
      throw new Error(error.message || 'Failed to forget network')
    }
  }

  // Get signal color
  const getSignalColor = (rssi: number) => {
    if (rssi >= -50) return 'text-emerald-400'
    if (rssi >= -60) return 'text-green-400'
    if (rssi >= -70) return 'text-cyan-400'
    if (rssi >= -80) return 'text-yellow-400'
    return 'text-red-400'
  }

  // Get signal bars
  const getSignalBars = (rssi: number) => {
    if (rssi >= -50) return 4
    if (rssi >= -60) return 3
    if (rssi >= -70) return 2
    if (rssi >= -80) return 1
    return 0
  }

  return (
    <>
      <Card className="bg-[#0d120d] border-cyan-900/30">
        <CardHeader>
          <div className="flex items-center justify-between">
            <CardTitle className="flex items-center gap-2 text-white">
              <Wifi className="w-5 h-5 text-cyan-400" />
              Available Networks
            </CardTitle>
            <Button
              onClick={() => scanNetworks()}
              disabled={loading}
              size="sm"
              className="bg-cyan-600 hover:bg-cyan-700"
            >
              <RefreshCw className={`w-4 h-4 mr-2 ${loading ? 'animate-spin' : ''}`} />
              {loading ? 'Scanning...' : 'Scan'}
            </Button>
          </div>
        </CardHeader>
        <CardContent>
          {networks.length === 0 ? (
            <div className="text-center py-8 text-gray-500">
              <Wifi className="w-12 h-12 mx-auto mb-3 opacity-30" />
              <p className="text-sm">No networks found</p>
              <p className="text-xs">Tap scan to discover WiFi networks</p>
            </div>
          ) : (
            <ScrollArea className="h-[500px]">
              <div className="space-y-1">
                {Array.isArray(networks) && networks.map((network, index) => {
                  const isSaved = isNetworkSaved(network.ssid)
                  const isConnected = currentNetwork?.ssid === network.ssid
                  const signalColor = getSignalColor(network.rssi)
                  const signalBars = getSignalBars(network.rssi)
                  const requiresPassword = network.security !== 'Open' && network.security !== 'None'

                  return (
                    <div
                      key={`${network.bssid}-${index}`}
                      onClick={() => handleNetworkClick(network)}
                      className={`p-3 rounded-lg border cursor-pointer transition-colors ${
                        isConnected
                          ? 'bg-cyan-900/20 border-cyan-500/50'
                          : 'bg-gray-900/30 border-gray-800 hover:bg-gray-800/50'
                      }`}
                    >
                      <div className="flex items-center justify-between">
                        <div className="flex items-center gap-3 flex-1 min-w-0">
                          {/* Signal Icon */}
                          <div className={signalColor}>
                            <Signal className="w-5 h-5" />
                          </div>
                          
                          {/* Network Info */}
                          <div className="flex-1 min-w-0">
                            <div className="flex items-center gap-2 mb-1">
                              <span className="text-white font-medium truncate">
                                {network.ssid || 'Hidden Network'}
                              </span>
                              {isConnected && (
                                <Badge className="bg-cyan-500/20 text-cyan-400 text-[10px]">
                                  CONNECTED
                                </Badge>
                              )}
                              {isSaved && !isConnected && (
                                <Badge className="bg-gray-700/50 text-gray-400 text-[10px]">
                                  SAVED
                                </Badge>
                              )}
                            </div>
                            <div className="flex items-center gap-2 text-xs text-gray-500">
                              {requiresPassword && <Lock className="w-3 h-3" />}
                              <span>{network.security}</span>
                              <span>•</span>
                              <span className={signalColor}>{network.rssi} dBm</span>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  )
                })}
              </div>
            </ScrollArea>
          )}
        </CardContent>
      </Card>

      {/* Connect Sheet */}
      <WiFiConnectSheet
        open={showConnectSheet}
        onClose={() => {
          setShowConnectSheet(false)
          setSelectedNetwork(null)
        }}
        network={selectedNetwork}
        isSaved={selectedNetwork ? isNetworkSaved(selectedNetwork.ssid) : false}
        isConnected={selectedNetwork?.ssid === currentNetwork?.ssid}
        savedPassword={selectedNetwork ? getSavedPassword(selectedNetwork.ssid) : undefined}
        onConnect={handleConnect}
        onDisconnect={handleDisconnect}
        onForget={handleForget}
      />

      {/* Network Details Sheet */}
      <NetworkDetailsSheet
        open={showDetailsSheet}
        onClose={() => {
          setShowDetailsSheet(false)
          setSelectedNetwork(null)
        }}
        networkInfo={networkInfo}
        connectedNetwork={selectedNetwork ? {
          ssid: selectedNetwork.ssid,
          bssid: selectedNetwork.bssid,
          rssi: selectedNetwork.rssi,
          signal: Math.min(100, Math.max(0, (selectedNetwork.rssi + 100) * 2)),
          frequency: selectedNetwork.frequency,
          channel: selectedNetwork.channel,
          security: selectedNetwork.security,
          is5GHz: selectedNetwork.is5GHz
        } : null}
        onForgetNetwork={async () => {
          if (selectedNetwork) {
            setShowDetailsSheet(false)
            await handleForget(selectedNetwork.ssid)
          }
        }}
        onDisconnect={async () => {
          if (selectedNetwork) {
            setShowDetailsSheet(false)
            await handleDisconnect(selectedNetwork.ssid)
          }
        }}
      />
    </>
  )
}
