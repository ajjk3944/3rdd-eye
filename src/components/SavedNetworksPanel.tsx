'use client'

import { useState, useEffect, useCallback, useRef } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { ScrollArea } from '@/components/ui/scroll-area'
import { Badge } from '@/components/ui/badge'
import {
  Wifi,
  Lock,
  Trash2,
  Plus,
  Clock,
  WifiOff,
  RefreshCw
} from 'lucide-react'
import { toast } from 'sonner'
import { AddNetworkDialog } from '@/components/AddNetworkDialog'
import { getWiFiScanner, getSavedWifi, isCapacitor } from '@/lib/native-plugins'
import { useI18n } from '@/lib/i18n'

interface SavedNetwork {
  id: string
  ssid: string
  password?: string
  security: string
  bssid?: string
  isConnected: boolean
  addedAt: string
  lastConnectedAt?: string
}

interface SavedNetworksPanelProps {
  onConnect: (ssid: string, password: string) => Promise<void>
  onForget: (ssid: string) => Promise<void>
  currentSSID?: string
}

export function SavedNetworksPanel({ onConnect, onForget, currentSSID }: SavedNetworksPanelProps) {
  const [savedNetworks, setSavedNetworks] = useState<SavedNetwork[]>([])
  const [loading, setLoading] = useState(true)
  const [refreshing, setRefreshing] = useState(false)
  const [showAddDialog, setShowAddDialog] = useState(false)
  const [actualCurrentSSID, setActualCurrentSSID] = useState<string | undefined>(currentSSID)
  const [error, setError] = useState<string | null>(null)
  const refreshIntervalRef = useRef<NodeJS.Timeout | null>(null)

  // Get actual current network from device
  const getCurrentNetwork = useCallback(async () => {
    if (!isCapacitor) return
    
    const wifiScanner = getWiFiScanner()
    if (!wifiScanner) return

    try {
      const result = await wifiScanner.getCurrentNetwork()
      setActualCurrentSSID(result.connected ? result.ssid : undefined)
    } catch (error) {
      console.error('Failed to get current network:', error)
    }
  }, [])

  // Load saved networks - uses native plugin on Capacitor, fetch on browser
  const loadSavedNetworks = useCallback(async (silent = false) => {
    if (!silent) setLoading(true)
    setError(null)
    
    try {
      console.log('[SavedNetworksPanel] Fetching saved networks...')
      
      // === CAPACITOR: Use native SavedWifi plugin ===
      if (isCapacitor) {
        const savedWifiPlugin = getSavedWifi()
        if (!savedWifiPlugin) {
          console.error('[SavedNetworksPanel] SavedWifi plugin not available')
          setError('SavedWifi plugin not available')
          setSavedNetworks([])
          if (!silent) setLoading(false)
          return
        }

        const data = await savedWifiPlugin.getSavedNetworks()
        console.log('[SavedNetworksPanel] Native plugin response:', data)
        
        if (data.success && data.networks) {
          const networks: SavedNetwork[] = data.networks.map((n: any) => ({
            id: n.id || n.ssid,
            ssid: n.ssid,
            password: n.password || '',
            security: n.security || 'WPA2',
            bssid: n.bssid || '',
            isConnected: n.ssid === actualCurrentSSID,
            addedAt: n.addedAt || new Date().toISOString(),
            lastConnectedAt: n.lastConnectedAt || n.addedAt || new Date().toISOString()
          }))
          console.log('[SavedNetworksPanel] Setting networks:', networks.length, 'items')
          setSavedNetworks(networks)
        } else {
          console.error('[SavedNetworksPanel] Plugin error:', data.error)
          setError(data.error || 'Unknown error')
          setSavedNetworks([])
        }
      }
      // === BROWSER: Use fetch API (for development only) ===
      else {
        const response = await fetch('/api/saved-wifi')
        
        if (!response.ok) {
          const errorText = await response.text()
          console.error('[SavedNetworksPanel] API response not ok:', response.status, errorText)
          setError(`API Error: ${response.status}`)
          setSavedNetworks([])
          if (!silent) toast.error('Failed to load saved networks')
          return
        }
        
        const data = await response.json()
        console.log('[SavedNetworksPanel] API response:', data)
        
        if (data.success && data.networks) {
          if (!Array.isArray(data.networks)) {
            console.error('[SavedNetworksPanel] networks is not an array:', typeof data.networks, data.networks)
            setError('Invalid data format')
            setSavedNetworks([])
            if (!silent) toast.error('Invalid data format received')
            return
          }
          
          console.log('[SavedNetworksPanel] Setting networks:', data.networks.length, 'items')
          setSavedNetworks(data.networks)
        } else {
          console.error('[SavedNetworksPanel] Invalid API response:', data)
          setError(data.error || 'Unknown error')
          setSavedNetworks([])
          if (!silent && data.error) {
            toast.error(data.error)
          }
        }
      }
    } catch (error) {
      console.error('[SavedNetworksPanel] Failed to load saved networks:', error)
      setError(error instanceof Error ? error.message : 'Unknown error')
      setSavedNetworks([])
      if (!silent) toast.error('Failed to load saved networks')
    } finally {
      if (!silent) setLoading(false)
    }
  }, [actualCurrentSSID])

  // Initial load
  useEffect(() => {
    loadSavedNetworks()
    getCurrentNetwork()
  }, [loadSavedNetworks, getCurrentNetwork])

  // Auto-refresh every 3 seconds
  useEffect(() => {
    refreshIntervalRef.current = setInterval(async () => {
      await getCurrentNetwork()
      await loadSavedNetworks(true)
    }, 3000)
    
    return () => {
      if (refreshIntervalRef.current) {
        clearInterval(refreshIntervalRef.current)
      }
    }
  }, [getCurrentNetwork, loadSavedNetworks])

  // Manual refresh
  const handleRefresh = async () => {
    setRefreshing(true)
    await getCurrentNetwork()
    await loadSavedNetworks()
    setRefreshing(false)
  }

  // Handle connect
  const handleConnect = async (network: SavedNetwork) => {
    try {
      await onConnect(network.ssid, network.password || '')
      toast.success(`Connected to ${network.ssid}`)
      
      // Immediate refresh
      setTimeout(async () => {
        await getCurrentNetwork()
        await loadSavedNetworks(true)
      }, 1000)
    } catch (error: any) {
      toast.error('Connection failed', { description: error.message })
    }
  }

  // Handle forget (immediate, no confirmation - disconnect + delete)
  const handleForget = async (network: SavedNetwork) => {
    try {
      // === CAPACITOR: Delete from native DB too ===
      if (isCapacitor) {
        const savedWifiPlugin = getSavedWifi()
        if (savedWifiPlugin) {
          await savedWifiPlugin.deleteNetwork({ ssid: network.ssid })
        }
      }
      
      await onForget(network.ssid)
      toast.success(`Forgot ${network.ssid}`)
      
      // Immediate refresh
      setTimeout(async () => {
        await getCurrentNetwork()
        await loadSavedNetworks(true)
      }, 500)
    } catch (error) {
      toast.error('Failed to forget network')
    }
  }



  // Handle manual add
  const handleManualAdd = async (ssid: string, password: string, security: string) => {
    try {
      // === CAPACITOR: Save via native plugin ===
      if (isCapacitor) {
        const savedWifiPlugin = getSavedWifi()
        if (savedWifiPlugin) {
          const saveResult = await savedWifiPlugin.saveNetwork({ ssid, password, security })
          console.log('[SavedNetworksPanel] Manual save result:', saveResult)
          
          if (saveResult.success) {
            toast.success(`Added ${ssid} to saved networks`)
            await loadSavedNetworks(true)
          } else {
            toast.error('Failed to add network', { description: saveResult.error })
          }
        } else {
          toast.error('SavedWifi plugin not available')
        }
        return
      }

      // === BROWSER: Use fetch API ===
      const response = await fetch('/api/saved-wifi', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ ssid, password, security })
      })
      
      if (!response.ok) {
        const errorText = await response.text()
        console.error('Failed to save network:', response.status, errorText)
        toast.error('Failed to add network', { 
          description: `Server error: ${response.status}` 
        })
        return
      }
      
      const data = await response.json()
      if (data.success) {
        toast.success(`Added ${ssid} to saved networks`)
        await loadSavedNetworks(true)
      } else {
        toast.error('Failed to add network', { 
          description: data.error || 'Unknown error' 
        })
      }
    } catch (error) {
      console.error('Error adding network:', error)
      toast.error('Failed to add network', { 
        description: error instanceof Error ? error.message : 'Unknown error' 
      })
    }
  }

  // Format timestamp
  const formatTime = (timestamp?: string) => {
    if (!timestamp) return 'Never'
    const date = new Date(timestamp)
    const now = new Date()
    const diff = now.getTime() - date.getTime()
    
    const minutes = Math.floor(diff / 60000)
    const hours = Math.floor(diff / 3600000)
    const days = Math.floor(diff / 86400000)
    
    if (minutes < 1) return 'Just now'
    if (minutes < 60) return `${minutes}m ago`
    if (hours < 24) return `${hours}h ago`
    if (days < 7) return `${days}d ago`
    return date.toLocaleDateString()
  }

  return (
    <>
      <Card className="bg-[#0d120d] border-cyan-900/30">
        <CardHeader>
          <div className="flex items-center justify-between">
            <CardTitle className="flex items-center gap-2 text-white">
              <Lock className="w-5 h-5 text-cyan-400" />
              Saved Networks
            </CardTitle>
            <div className="flex gap-2">
              <Button
                onClick={handleRefresh}
                disabled={refreshing}
                size="sm"
                variant="outline"
                className="border-cyan-900/30 text-cyan-400 hover:bg-cyan-900/20"
              >
                <RefreshCw className={`w-4 h-4 ${refreshing ? 'animate-spin' : ''}`} />
              </Button>
              <Button
                onClick={() => setShowAddDialog(true)}
                size="sm"
                className="bg-cyan-600 hover:bg-cyan-700"
              >
                <Plus className="w-4 h-4 mr-2" />
                Add
              </Button>
            </div>
          </div>
        </CardHeader>
        <CardContent>
          {error && (
            <div className="mb-4 p-3 rounded-lg bg-red-900/20 border border-red-500/30">
              <p className="text-sm text-red-400">Error: {error}</p>
              <p className="text-xs text-gray-400 mt-1">Check console for details</p>
            </div>
          )}
          {!loading && savedNetworks.length > 0 && isCapacitor && (
            <div className="mb-4 p-3 rounded-lg bg-blue-900/20 border border-blue-500/30">
              <p className="text-xs text-blue-300">
                Showing networks saved through this app. System WiFi networks are only accessible on rooted devices.
              </p>
            </div>
          )}
          {loading ? (
            <div className="text-center py-8 text-gray-500">
              <Wifi className="w-12 h-12 mx-auto mb-3 opacity-30 animate-pulse" />
              <p className="text-sm">Loading saved networks...</p>
            </div>
          ) : savedNetworks.length === 0 ? (
            <div className="text-center py-8 text-gray-500">
              <WifiOff className="w-12 h-12 mx-auto mb-3 opacity-30" />
              <p className="text-sm mb-2 text-white">No saved networks yet</p>
              <p className="text-xs text-gray-400 mb-3">
                Connect to WiFi networks through the Scanner tab to save them automatically
              </p>
              <div className="bg-blue-900/20 border border-blue-500/30 rounded-lg p-3 mt-4 text-left">
                <p className="text-xs text-blue-300 font-medium mb-1">How it works:</p>
                <ul className="text-xs text-gray-400 space-y-1 list-disc list-inside">
                  <li>{t('wifi.scanForNetworks')}</li>
                  <li>{t('wifi.connectWithPassword')}</li>
                  <li>{t('wifi.automaticallyAppear')}</li>
                  <li>{t('wifi.manuallyAddNetworks')}</li>
                </ul>
              </div>
              {!isCapacitor && (
                <div className="bg-yellow-900/20 border border-yellow-500/30 rounded-lg p-3 mt-3 text-left">
                  <p className="text-xs text-yellow-300">
                    Running in browser mode. Install the app on Android to save WiFi networks.
                  </p>
                </div>
              )}
            </div>
          ) : (
            <ScrollArea className="h-[400px]">
              <div className="space-y-2">
                {Array.isArray(savedNetworks) && savedNetworks.map((network) => {
                  const isConnected = network.ssid === actualCurrentSSID
                  
                  return (
                    <div
                      key={network.id}
                      className={`p-3 rounded-lg border transition-colors ${
                        isConnected
                          ? 'bg-cyan-900/20 border-cyan-500/50'
                          : 'bg-gray-900/30 border-gray-800 hover:bg-gray-800/50'
                      }`}
                    >
                      <div className="flex items-center justify-between">
                        <div className="flex-1 min-w-0">
                          <div className="flex items-center gap-2 mb-1">
                            <span className="text-white font-medium truncate">
                              {network.ssid}
                            </span>
                            {isConnected && (
                              <Badge className="bg-cyan-500/20 text-cyan-400 text-[10px]">
                                CONNECTED
                              </Badge>
                            )}
                          </div>
                          <div className="flex items-center gap-3 text-xs text-gray-500">
                            <span>{network.security}</span>
                            {network.lastConnectedAt && (
                              <span className="flex items-center gap-1">
                                <Clock className="w-3 h-3" />
                                {formatTime(network.lastConnectedAt)}
                              </span>
                            )}
                          </div>
                        </div>
                        <div className="flex items-center gap-2">
                          {!isConnected && (
                            <Button
                              onClick={() => handleConnect(network)}
                              size="sm"
                              className="bg-cyan-600 hover:bg-cyan-700"
                            >
                              Connect
                            </Button>
                          )}
                          <Button
                            onClick={() => handleForget(network)}
                            size="sm"
                            variant="ghost"
                            className="text-red-400 hover:bg-red-900/20"
                          >
                            <Trash2 className="w-4 h-4" />
                          </Button>
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

      {/* Manual Add Dialog */}
      <AddNetworkDialog
        open={showAddDialog}
        onClose={() => setShowAddDialog(false)}
        onAdd={handleManualAdd}
      />
    </>
  )
}
