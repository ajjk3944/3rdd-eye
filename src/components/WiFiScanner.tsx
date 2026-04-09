'use client'

import { useState, useEffect, useCallback, useMemo } from 'react'
import { Card, CardContent } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Badge } from '@/components/ui/badge'
import { ScrollArea } from '@/components/ui/scroll-area'
import {
  Wifi,
  RefreshCw,
  ChevronRight,
  ArrowUpDown,
  Search,
  Signal,
  Lock,
  Trash2,
} from 'lucide-react'
import { getWiFiScanner, WiFiNetwork, isCapacitor, NetworkDevice } from '@/lib/native-plugins'
import { NetworkDetailsSheet } from '@/components/NetworkDetailsSheet'
// WiFiQRDialog removed per user request
import { toast } from 'sonner'
import { useI18n } from '@/lib/i18n'

interface WiFiScannerProps {
  onScan: () => Promise<void>
  networks: WiFiNetwork[]
  loading: boolean
  currentNetwork: any
  onNetworkConnect?: (network: WiFiNetwork) => void
  networkDevices?: NetworkDevice[]
  onScanDevices?: () => void
  devicesLoading?: boolean
  onRouterCredentials?: () => void
}

type FrequencyFilter = 'all' | '2.4ghz' | '5ghz'
type ViewMode = 'ssid' | 'channel'
type SortBy = 'channel' | 'health'

// Channel definitions
const CHANNELS_2_4GHZ = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
const CHANNELS_5GHZ = [32, 36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 144, 149, 153, 157, 161, 165, 169]

// Get signal color based on dBm
const getSignalColor = (rssi: number): string => {
  if (rssi >= -50) return 'text-emerald-400'
  if (rssi >= -60) return 'text-green-400'
  if (rssi >= -70) return 'text-cyan-400'
  if (rssi >= -80) return 'text-yellow-400'
  if (rssi >= -90) return 'text-orange-400'
  return 'text-red-400'
}

// Get signal quality text
const getSignalQuality = (rssi: number, t: any): string => {
  if (rssi >= -50) return t('wifi.excellent')
  if (rssi >= -60) return t('wifi.good')
  if (rssi >= -70) return t('wifi.fair')
  if (rssi >= -80) return t('wifi.weak')
  return t('wifi.noSignal')
}

// Get channel health based on network count and signal interference
const getChannelHealth = (networks: WiFiNetwork[], channel: number, t: any): { health: string; color: string } => {
  const channelNetworks = networks.filter(n => n.channel === channel)
  const count = channelNetworks.length

  if (count === 0) return { health: t('wifi.excellent'), color: 'text-emerald-400' }
  if (count === 1) return { health: t('wifi.excellent'), color: 'text-emerald-400' }
  if (count === 2) return { health: t('wifi.good'), color: 'text-green-400' }
  if (count <= 4) return { health: t('wifi.fair'), color: 'text-yellow-400' }
  return { health: t('wifi.congested'), color: 'text-red-400' }
}

// Generate unique colors for networks on spectrum
const SPECTRUM_COLORS = [
  '#10b981', '#06b6d4', '#8b5cf6', '#f59e0b', '#ef4444',
  '#ec4899', '#6366f1', '#14b8a6', '#f97316', '#84cc16'
]

export function WiFiScanner({
  onScan,
  networks,
  loading,
  currentNetwork,
  onNetworkConnect,
  networkDevices = [],
  onScanDevices,
  devicesLoading = false,
  onRouterCredentials
}: WiFiScannerProps) {
  const { t } = useI18n()
  const [frequencyFilter, setFrequencyFilter] = useState<FrequencyFilter>('all')
  const [viewMode, setViewMode] = useState<ViewMode>('ssid')
  const [sortBy, setSortBy] = useState<SortBy>('channel')
  const [showSortMenu, setShowSortMenu] = useState(false)
  const [selectedNetwork, setSelectedNetwork] = useState<WiFiNetwork | null>(null)
  const [showDetails, setShowDetails] = useState(false)
  const [hasScanned, setHasScanned] = useState(false)
  const [lastConnectedSSID, setLastConnectedSSID] = useState<string | null>(null)
  // QR dialog removed per user request
  const [savedNetworks, setSavedNetworks] = useState<any[]>([])
  const [showForgetDialog, setShowForgetDialog] = useState(false)
  const [networkToForget, setNetworkToForget] = useState<WiFiNetwork | null>(null)

  // Auto-scan on mount
  useEffect(() => {
    if (!hasScanned && !loading) {
      setHasScanned(true)
      onScan()
    }
  }, [hasScanned, loading, onScan])

  // Load saved networks
  useEffect(() => {
    loadSavedNetworks()
  }, [])

  const loadSavedNetworks = async () => {
    try {
      const response = await fetch('/api/saved-wifi')
      const data = await response.json()
      if (data.success) {
        setSavedNetworks(data.networks || [])
      }
    } catch (error) {
      console.error('Failed to load saved networks:', error)
    }
  }

  // Save network to database
  const saveNetwork = async (network: WiFiNetwork, password?: string) => {
    try {
      const response = await fetch('/api/saved-wifi', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({
          ssid: network.ssid,
          password,
          security: network.security,
          bssid: network.bssid
        })
      })
      const data = await response.json()
      if (data.success) {
        await loadSavedNetworks()
        return true
      }
      return false
    } catch (error) {
      console.error('Failed to save network:', error)
      return false
    }
  }

  // Forget network
  const forgetNetwork = async (ssid: string) => {
    try {
      const wifiScanner = getWiFiScanner()
      if (wifiScanner) {
        // Use native forget (which handles disconnect + removal)
        await wifiScanner.forget({ ssid })
      }

      // Remove from database
      const response = await fetch(`/api/saved-wifi?ssid=${encodeURIComponent(ssid)}`, {
        method: 'DELETE'
      })
      const data = await response.json()

      if (data.success) {
        await loadSavedNetworks()
        toast.success('Network forgotten', {
          description: `${ssid} has been removed from saved networks`
        })
        setShowForgetDialog(false)
        setNetworkToForget(null)

        // Refresh scan to update UI
        onScan()
        return true
      }
      return false
    } catch (error) {
      console.error('Failed to forget network:', error)
      toast.error('Failed to forget network')
      return false
    }
  }

  // Handle disconnect - immediate, no confirmation
  const handleDisconnect = async () => {
    try {
      const wifiScanner = getWiFiScanner()
      if (wifiScanner) {
        setShowDetails(false) // Close sheet immediately
        await wifiScanner.disconnect()
        toast.success('Disconnected')
        // Refresh scan to update UI
        onScan()
      }
    } catch (error) {
      console.error('Failed to disconnect:', error)
      toast.error('Failed to disconnect')
    }
  }

  // Check if network is saved
  const isNetworkSaved = (ssid: string) => {
    return savedNetworks.some(n => n.ssid === ssid)
  }

  // Get saved network password
  const getSavedPassword = (ssid: string) => {
    const saved = savedNetworks.find(n => n.ssid === ssid)
    return saved?.password
  }

  // Auto-refresh when connected network changes
  useEffect(() => {
    const currentSSID = currentNetwork?.ssid || null

    // If the connected SSID changed, refresh the scan
    if (currentSSID && currentSSID !== lastConnectedSSID) {
      console.log('Connected network changed from', lastConnectedSSID, 'to', currentSSID)
      setLastConnectedSSID(currentSSID)

      // Rescan after a short delay to get updated info
      setTimeout(() => {
        onScan()
      }, 1000)
    } else if (!currentSSID && lastConnectedSSID) {
      // Disconnected
      console.log('Disconnected from', lastConnectedSSID)
      setLastConnectedSSID(null)
    } else if (currentSSID && !lastConnectedSSID) {
      // First connection detected
      setLastConnectedSSID(currentSSID)
    }
  }, [currentNetwork?.ssid, lastConnectedSSID, onScan])

  // Filter networks by frequency
  const filteredNetworks = useMemo(() => {
    return networks.filter(network => {
      if (frequencyFilter === 'all') return true
      if (frequencyFilter === '2.4ghz') return !network.is5GHz
      if (frequencyFilter === '5ghz') return network.is5GHz
      return true
    })
  }, [networks, frequencyFilter])

  // Count networks by frequency
  const networkCounts = useMemo(() => ({
    all: networks.length,
    '2.4ghz': networks.filter(n => !n.is5GHz).length,
    '5ghz': networks.filter(n => n.is5GHz).length,
  }), [networks])

  // Get connected network
  const connectedNetwork = useMemo((): WiFiNetwork | null => {
    console.log('🔍 connectedNetwork check:', {
      currentNetwork,
      hasCurrentNetwork: !!currentNetwork,
      connected: currentNetwork?.connected,
      isConnected: currentNetwork?.isConnected,
      ssid: currentNetwork?.ssid
    })
    
    // Check BOTH connected and isConnected for compatibility
    if (!currentNetwork?.connected && !currentNetwork?.isConnected) {
      console.log('❌ No connected network')
      return null
    }
    
    console.log('✅ Connected network detected:', currentNetwork.ssid)
    
    // Try to find in filtered networks
    const found = filteredNetworks.find(n =>
      n.ssid === currentNetwork.ssid || n.bssid === currentNetwork.bssid
    )
    
    // If found, return it
    if (found) {
      console.log('✅ Found in scan results:', found.ssid)
      return found
    }
    
    console.log('⚠️ Not in scan results, creating from currentNetwork data')
    
    // If not found but we have currentNetwork data, create a WiFiNetwork object from it
    if (currentNetwork.ssid) {
      const created = {
        ssid: currentNetwork.ssid,
        bssid: currentNetwork.bssid || '',
        rssi: currentNetwork.rssi || -50,
        signal: currentNetwork.rssi || -50,
        frequency: currentNetwork.frequency || 0,
        channel: currentNetwork.frequency ? Math.round((currentNetwork.frequency - 2407) / 5) : 0,
        security: 'WPA2',
        is5GHz: currentNetwork.frequency ? currentNetwork.frequency > 5000 : false,
        timestamp: Date.now()
      }
      console.log('✅ Created connectedNetwork:', created)
      return created
    }
    
    console.log('❌ No SSID in currentNetwork')
    return null
  }, [filteredNetworks, currentNetwork])

  // Get channels for current filter
  const channels = useMemo(() => {
    if (frequencyFilter === '5ghz') return CHANNELS_5GHZ
    if (frequencyFilter === '2.4ghz') return CHANNELS_2_4GHZ
    return [...CHANNELS_2_4GHZ, ...CHANNELS_5GHZ]
  }, [frequencyFilter])

  // Sort networks
  const sortedNetworks = useMemo(() => {
    return [...filteredNetworks].sort((a, b) => {
      // Connected network always first
      const aConnected = connectedNetwork?.bssid === a.bssid
      const bConnected = connectedNetwork?.bssid === b.bssid
      if (aConnected && !bConnected) return -1
      if (!aConnected && bConnected) return 1

      // Sort by selected criteria
      if (sortBy === 'channel') {
        // Sort by channel number
        if (a.channel !== b.channel) return a.channel - b.channel
        // Then by signal strength within same channel
        return b.rssi - a.rssi
      } else {
        // Sort by health (signal strength)
        return b.rssi - a.rssi
      }
    })
  }, [filteredNetworks, connectedNetwork, sortBy])

  // Get channel health list
  const channelHealthList = useMemo(() => {
    const relevantChannels = frequencyFilter === '5ghz' ? CHANNELS_5GHZ :
      frequencyFilter === '2.4ghz' ? CHANNELS_2_4GHZ :
        [...CHANNELS_2_4GHZ, ...CHANNELS_5GHZ]

    return relevantChannels.map(channel => ({
      channel,
      ...getChannelHealth(filteredNetworks, channel, t),
      networkCount: filteredNetworks.filter(n => n.channel === channel).length
    })).sort((a, b) => {
      if (sortBy === 'channel') return a.channel - b.channel
      // Sort by health (Excellent > Good > Fair > Congested)
      const healthOrder: Record<string, number> = {}
      healthOrder[t('wifi.excellent')] = 0
      healthOrder[t('wifi.good')] = 1
      healthOrder[t('wifi.fair')] = 2
      healthOrder[t('wifi.congested')] = 3
      return (healthOrder[a.health] || 0) - (healthOrder[b.health] || 0)
    })
  }, [filteredNetworks, frequencyFilter, sortBy, t])

  // Handle network click
  const handleNetworkClick = (network: WiFiNetwork) => {
    const isConnected = connectedNetwork?.bssid === network.bssid
    const isSaved = isNetworkSaved(network.ssid)

    if (isConnected) {
      // Show details with option to forget for connected network
      setSelectedNetwork(network)
      setShowDetails(true)
    } else if (isSaved) {
      // Auto-connect to saved network
      const savedPassword = getSavedPassword(network.ssid)
      if (onNetworkConnect) {
        // Create a network object with saved password
        const networkWithPassword = { ...network, savedPassword }
        onNetworkConnect(networkWithPassword)
      }
    } else {
      // Try to connect to non-saved network (will prompt for password)
      if (onNetworkConnect) {
        onNetworkConnect(network)
      }
    }
  }

  // Handle forget network - immediate, no confirmation
  const handleForgetNetwork = async (network: WiFiNetwork) => {
    setShowDetails(false) // Close sheet immediately
    await forgetNetwork(network.ssid)
  }

  // (QR connect function removed per user request)

  return (
    <div className="space-y-4">
      {/* Network Details Sheet */}
      <NetworkDetailsSheet
        open={showDetails}
        onClose={() => setShowDetails(false)}
        networkInfo={currentNetwork}
        connectedNetwork={selectedNetwork}
        networkDevices={networkDevices}
        onScanDevices={onScanDevices}
        devicesLoading={devicesLoading}
        onRouterCredentials={onRouterCredentials}
        onForgetNetwork={() => selectedNetwork && handleForgetNetwork(selectedNetwork)}
        onDisconnect={handleDisconnect}
      />

      {/* WiFi QR Dialog removed per user request */}

      {/* Forget Network Confirmation Dialog */}
      {showForgetDialog && networkToForget && (
        <div className="fixed inset-0 bg-black/60 z-50 flex items-center justify-center p-4">
          <div className="bg-[#0d120d] border border-red-900/30 rounded-lg p-6 max-w-sm w-full">
            <div className="flex items-center gap-3 mb-4">
              <Trash2 className="w-6 h-6 text-red-400" />
              <h3 className="text-lg font-bold text-white">Forget Network?</h3>
            </div>
            <p className="text-gray-400 mb-6">
              Are you sure you want to forget <span className="text-white font-medium">{networkToForget.ssid}</span>?
              You'll need to enter the password again to reconnect.
            </p>
            <div className="flex gap-3">
              <Button
                variant="outline"
                onClick={() => {
                  setShowForgetDialog(false)
                  setNetworkToForget(null)
                }}
                className="flex-1 border-gray-700"
              >
                Cancel
              </Button>
              <Button
                onClick={() => forgetNetwork(networkToForget.ssid)}
                className="flex-1 bg-red-600 hover:bg-red-700"
              >
                <Trash2 className="w-4 h-4 mr-2" />
                Forget
              </Button>
            </div>
          </div>
        </div>
      )}

      {/* Header */}
      <div className="flex items-center justify-between">
        <div className="flex items-center gap-2">
          <Search className="w-5 h-5 text-gray-400" />
          <span className="text-white font-medium">{t('wifi.title')}</span>
        </div>
        <div className="flex gap-2">

          <Button
            onClick={onScan}
            disabled={loading}
            size="sm"
            className="bg-cyan-600 hover:bg-cyan-700"
          >
            <RefreshCw className={`w-4 h-4 mr-2 ${loading ? 'animate-spin' : ''}`} />
            {loading ? t('common.scanning') : t('common.scanNow')}
          </Button>
        </div>
      </div>

      {/* Frequency Filter Tabs */}
      <div className="flex gap-2">
        <Button
          variant={frequencyFilter === 'all' ? 'default' : 'outline'}
          size="sm"
          onClick={() => setFrequencyFilter('all')}
          className={frequencyFilter === 'all'
            ? 'bg-cyan-600 hover:bg-cyan-700 text-white'
            : 'border-gray-700 text-gray-400 hover:text-white hover:bg-gray-800'}
        >
          {t('wifi.all')} ({networkCounts.all})
        </Button>
        <Button
          variant={frequencyFilter === '2.4ghz' ? 'default' : 'outline'}
          size="sm"
          onClick={() => setFrequencyFilter('2.4ghz')}
          className={frequencyFilter === '2.4ghz'
            ? 'bg-cyan-600 hover:bg-cyan-700 text-white'
            : 'border-gray-700 text-gray-400 hover:text-white hover:bg-gray-800'}
        >
          2.4 {t('wifi.ghz')} ({networkCounts['2.4ghz']})
        </Button>
        <Button
          variant={frequencyFilter === '5ghz' ? 'default' : 'outline'}
          size="sm"
          onClick={() => setFrequencyFilter('5ghz')}
          className={frequencyFilter === '5ghz'
            ? 'bg-cyan-600 hover:bg-cyan-700 text-white'
            : 'border-gray-700 text-gray-400 hover:text-white hover:bg-gray-800'}
        >
          5 {t('wifi.ghz')} ({networkCounts['5ghz']})
        </Button>
      </div>

      {/* Spectrum Graph */}
      <SpectrumGraph
        networks={filteredNetworks}
        connectedNetwork={connectedNetwork}
        frequencyFilter={frequencyFilter}
      />

      {/* Connected Network Card */}
      {(() => {
        console.log('🎨 Rendering Connected Network Card - connectedNetwork:', connectedNetwork)
        return connectedNetwork ? (
          <Card
            className="bg-[#0d120d] border-cyan-500/50 cursor-pointer hover:border-cyan-400 transition-colors"
            onClick={() => handleNetworkClick(connectedNetwork)}
          >
            <CardContent className="p-4">
              <div className="flex items-center justify-between">
                <div className="flex items-center gap-3">
                  <div className="w-3 h-3 rounded-full bg-emerald-500" />
                  <div>
                    <div className="flex items-center gap-2">
                      <span className="text-white font-medium">{connectedNetwork.ssid}</span>
                      <Badge className="bg-cyan-500/20 text-cyan-400 text-[10px]">CONNECTED</Badge>
                    </div>
                    <span className="text-xs text-gray-500">Channel: {connectedNetwork.channel}</span>
                    <p className="text-xs text-gray-600 font-mono">{connectedNetwork.bssid}</p>
                  </div>
                </div>
                <div className="flex items-center gap-2">
                  <span className={`font-mono ${getSignalColor(connectedNetwork.rssi)}`}>
                    {connectedNetwork.rssi} dBm
                  </span>
                  <ChevronRight className="w-5 h-5 text-gray-500" />
                </div>
              </div>
            </CardContent>
          </Card>
        ) : null
      })()}

      {/* View Mode Toggle */}
      <div className="flex items-center justify-between">
        <div className="flex gap-2">
          <Button
            variant={viewMode === 'ssid' ? 'default' : 'ghost'}
            size="sm"
            onClick={() => setViewMode('ssid')}
            className={viewMode === 'ssid'
              ? 'bg-gray-700 text-white'
              : 'text-gray-400 hover:text-white'}
          >
            {t('wifi.ssidScan')}
          </Button>
          <Button
            variant={viewMode === 'channel' ? 'default' : 'ghost'}
            size="sm"
            onClick={() => setViewMode('channel')}
            className={viewMode === 'channel'
              ? 'bg-cyan-600 text-white'
              : 'text-gray-400 hover:text-white'}
          >
            {t('wifi.channelHealth')}
          </Button>
        </div>
        <div className="relative">
          <Button
            variant="ghost"
            size="sm"
            onClick={() => setShowSortMenu(!showSortMenu)}
            className="text-gray-400 hover:text-white"
          >
            <ArrowUpDown className="w-4 h-4" />
          </Button>
          {showSortMenu && (
            <div className="absolute right-0 top-full mt-1 bg-[#1a1f1a] border border-gray-700 rounded-lg shadow-lg z-10 min-w-[160px]">
              <div className="p-2 border-b border-gray-700">
                <span className="text-xs text-gray-400">{t('wifi.sortBy')}</span>
              </div>
              <button
                className={`w-full px-3 py-2 text-left text-sm flex items-center justify-between hover:bg-gray-800 ${sortBy === 'channel' ? 'text-cyan-400' : 'text-gray-300'}`}
                onClick={() => { setSortBy('channel'); setShowSortMenu(false) }}
              >
                {t('wifi.channelNumber')}
                {sortBy === 'channel' && <span className="text-cyan-400">✓</span>}
              </button>
              <button
                className={`w-full px-3 py-2 text-left text-sm flex items-center justify-between hover:bg-gray-800 ${sortBy === 'health' ? 'text-cyan-400' : 'text-gray-300'}`}
                onClick={() => { setSortBy('health'); setShowSortMenu(false) }}
              >
                {t('wifi.channelHealth')}
                {sortBy === 'health' && <span className="text-cyan-400">✓</span>}
              </button>
            </div>
          )}
        </div>
      </div>

      {/* Content based on view mode */}
      <ScrollArea className="h-[400px]">
        {viewMode === 'ssid' ? (
          <SSIDList
            networks={sortedNetworks}
            connectedNetwork={connectedNetwork}
            onNetworkClick={handleNetworkClick}
          />
        ) : (
          <ChannelHealthList
            channelHealth={channelHealthList}
            frequencyFilter={frequencyFilter}
          />
        )}
      </ScrollArea>
    </div>
  )
}


// ============ Spectrum Graph Component ============
interface SpectrumGraphProps {
  networks: WiFiNetwork[]
  connectedNetwork: WiFiNetwork | null
  frequencyFilter: FrequencyFilter
}

function SpectrumGraph({ networks, connectedNetwork, frequencyFilter }: SpectrumGraphProps) {
  const { t } = useI18n()
  
  // Get channel range based on filter
  const getChannelRange = () => {
    if (frequencyFilter === '5ghz') {
      return { min: 32, max: 169, channels: CHANNELS_5GHZ }
    }
    if (frequencyFilter === '2.4ghz') {
      return { min: 1, max: 14, channels: CHANNELS_2_4GHZ }
    }
    // For 'all', show both bands
    return { min: 1, max: 169, channels: [...CHANNELS_2_4GHZ, ...CHANNELS_5GHZ] }
  }

  const { min, max, channels } = getChannelRange()
  const graphHeight = 120
  const graphWidth = 100 // percentage

  // Convert RSSI to Y position (higher signal = higher on graph)
  const rssiToY = (rssi: number) => {
    // RSSI typically ranges from -30 (excellent) to -100 (no signal)
    const minRssi = -100
    const maxRssi = -30
    const normalized = (rssi - minRssi) / (maxRssi - minRssi)
    return graphHeight - (normalized * graphHeight)
  }

  // Convert channel to X position
  const channelToX = (channel: number) => {
    if (frequencyFilter === 'all') {
      // For 'all' view, split the graph into two sections
      if (channel <= 14) {
        // 2.4GHz section (left 40%)
        return (channel - 1) / 13 * 40
      } else {
        // 5GHz section (right 60%)
        const fiveGhzRange = 169 - 32
        return 40 + ((channel - 32) / fiveGhzRange) * 60
      }
    }
    const range = max - min
    return ((channel - min) / range) * 100
  }

  // Get networks for current frequency band
  const relevantNetworks = networks.filter(n => {
    if (frequencyFilter === '5ghz') return n.is5GHz
    if (frequencyFilter === '2.4ghz') return !n.is5GHz
    return true // Show all for 'all' filter
  })

  // Assign colors to networks
  const networkColors = new Map<string, string>()
  relevantNetworks.forEach((network, index) => {
    networkColors.set(network.bssid, SPECTRUM_COLORS[index % SPECTRUM_COLORS.length])
  })

  // Y-axis labels (dBm values)
  const yLabels = [-40, -50, -60, -70, -80, -90]

  return (
    <Card className="bg-[#0d120d] border-emerald-900/30">
      <CardContent className="p-4">
        <div className="flex items-center justify-between mb-2">
          <span className="text-sm text-gray-400">{t('wifi.spectrum')}</span>
          <span className="text-sm text-gray-400">
            {frequencyFilter === 'all' ? `2.4 ${t('wifi.ghz')} & 5 ${t('wifi.ghz')}` : frequencyFilter === '5ghz' ? `5 ${t('wifi.ghz')}` : `2.4 ${t('wifi.ghz')}`}
          </span>
        </div>

        <div className="relative" style={{ height: graphHeight + 40 }}>
          {/* Y-axis labels */}
          <div className="absolute left-0 top-0 bottom-8 w-8 flex flex-col justify-between text-[10px] text-gray-500">
            {yLabels.map(label => (
              <span key={label}>{label}</span>
            ))}
          </div>

          {/* Graph area */}
          <div className="absolute left-10 right-0 top-0 bottom-8 border-l border-b border-gray-700">
            {/* Grid lines */}
            {yLabels.map((_, i) => (
              <div
                key={i}
                className="absolute left-0 right-0 border-t border-gray-800"
                style={{ top: `${(i / (yLabels.length - 1)) * 100}%` }}
              />
            ))}

            {/* Network signals as trapezoid shapes */}
            <svg className="absolute inset-0 w-full h-full overflow-visible">
              {relevantNetworks.map((network, index) => {
                const x = channelToX(network.channel)
                const y = rssiToY(network.rssi)
                const color = networkColors.get(network.bssid) || SPECTRUM_COLORS[0]
                const isConnected = connectedNetwork?.bssid === network.bssid

                // Create trapezoid shape (wider at bottom, narrower at top)
                const width = frequencyFilter === '5ghz' ? 8 : 15 // Channel width in %
                const topWidth = width * 0.3

                return (
                  <g key={network.bssid}>
                    {/* Trapezoid shape */}
                    <path
                      d={`
                        M ${x - topWidth / 2}% ${y}
                        L ${x + topWidth / 2}% ${y}
                        L ${x + width / 2}% 100%
                        L ${x - width / 2}% 100%
                        Z
                      `}
                      fill={color}
                      fillOpacity={isConnected ? 0.6 : 0.3}
                      stroke={color}
                      strokeWidth={isConnected ? 2 : 1}
                    />
                    {/* Top line (signal level) */}
                    <line
                      x1={`${x - topWidth / 2}%`}
                      y1={y}
                      x2={`${x + topWidth / 2}%`}
                      y2={y}
                      stroke={color}
                      strokeWidth={2}
                    />
                  </g>
                )
              })}
            </svg>
          </div>

          {/* X-axis labels (channels) */}
          <div className="absolute left-10 right-0 bottom-0 h-6 flex justify-between text-[10px] text-gray-500 px-1">
            {channels.filter((_, i) => {
              // Show fewer labels to avoid crowding
              if (frequencyFilter === '5ghz') {
                // For 5GHz, show every 4th channel
                return i % 4 === 0
              } else if (frequencyFilter === '2.4ghz') {
                // For 2.4GHz, show channels 1, 6, 11 (non-overlapping)
                const channel = channels[i]
                return channel === 1 || channel === 6 || channel === 11
              } else {
                // For 'all', show very few labels
                const channel = channels[i]
                return channel === 1 || channel === 6 || channel === 11 || channel === 36 || channel === 149
              }
            }).map(channel => (
              <span key={channel}>{channel}</span>
            ))}
          </div>
        </div>
      </CardContent>
    </Card>
  )
}

// ============ SSID List Component ============
interface SSIDListProps {
  networks: WiFiNetwork[]
  connectedNetwork: WiFiNetwork | null
  onNetworkClick: (network: WiFiNetwork) => void
}

function SSIDList({ networks, connectedNetwork, onNetworkClick }: SSIDListProps) {
  const { t } = useI18n()
  
  if (networks.length === 0) {
    return (
      <div className="text-center py-8 text-gray-500">
        <Wifi className="w-12 h-12 mx-auto mb-3 opacity-30" />
        <p className="text-sm">{t('wifi.noNetworks')}</p>
        <p className="text-xs">{t('common.scanNow')}</p>
      </div>
    )
  }

  // Filter out connected network from list (shown separately above)
  const otherNetworks = networks.filter(n => n.bssid !== connectedNetwork?.bssid)

  return (
    <div className="space-y-1">
      {otherNetworks.map((network, index) => {
        const signalColor = getSignalColor(network.rssi)
        const isOpen = network.security === 'Open' || network.security === 'None'

        return (
          <div
            key={`${network.bssid}-${index}`}
            className="flex items-center justify-between p-3 hover:bg-gray-800/50 rounded-lg transition-colors cursor-pointer group"
            onClick={() => onNetworkClick(network)}
          >
            <div className="flex items-center gap-3 flex-1 min-w-0">
              <div className={`w-2 h-2 rounded-full flex-shrink-0 ${network.rssi >= -60 ? 'bg-emerald-500' :
                network.rssi >= -70 ? 'bg-cyan-500' :
                  network.rssi >= -80 ? 'bg-yellow-500' :
                    'bg-red-500'
                }`} />
              <div className="flex-1 min-w-0">
                <div className="flex items-center gap-2">
                  <p className="text-white text-sm truncate">{network.ssid || t('wifi.hiddenNetwork')}</p>
                  {!isOpen && <Lock className="w-3 h-3 text-gray-400" />}
                </div>
                <p className="text-xs text-gray-500">
                  {network.channel}{network.is5GHz && ', 5G'} • {network.security}
                </p>
                <p className="text-xs text-gray-600 font-mono truncate">
                  {network.bssid}
                </p>
              </div>
            </div>
            <div className="flex items-center gap-2 flex-shrink-0">
              <span className={`font-mono text-sm ${signalColor}`}>
                {network.rssi} dBm
              </span>
              <div className="opacity-0 group-hover:opacity-100 transition-opacity">
                <Wifi className="w-4 h-4 text-cyan-400" />
              </div>
            </div>
          </div>
        )
      })}
    </div>
  )
}

// ============ Channel Health List Component ============
interface ChannelHealthListProps {
  channelHealth: Array<{
    channel: number
    health: string
    color: string
    networkCount: number
  }>
  frequencyFilter: FrequencyFilter
}

function ChannelHealthList({ channelHealth, frequencyFilter }: ChannelHealthListProps) {
  const { t } = useI18n()
  
  // Group by frequency band if showing all
  const grouped = useMemo(() => {
    if (frequencyFilter !== 'all') return { current: channelHealth }

    return {
      '2.4GHz': channelHealth.filter(c => c.channel <= 14),
      '5GHz': channelHealth.filter(c => c.channel > 14),
    }
  }, [channelHealth, frequencyFilter])

  const renderChannelList = (channels: typeof channelHealth, title?: string) => (
    <div className="space-y-1">
      {title && (
        <div className="text-xs text-gray-400 font-medium py-2 px-3 bg-gray-800/30 rounded">
          {title}
        </div>
      )}
      {channels.map(({ channel, health, color, networkCount }) => (
        <div
          key={channel}
          className="flex items-center justify-between p-3 hover:bg-gray-800/50 rounded-lg transition-colors"
        >
          <div className="flex items-center gap-3">
            <span className="text-white font-mono text-sm w-8">{channel}</span>
            {networkCount > 0 && (
              <span className="text-xs text-gray-500">
                {networkCount} {networkCount > 1 ? t('wifi.networks') : t('wifi.network')}
              </span>
            )}
          </div>
          <div className="flex items-center gap-2">
            <span className={`text-sm ${color}`}>{health}</span>
            <ChevronRight className="w-4 h-4 text-gray-600" />
          </div>
        </div>
      ))}
    </div>
  )

  if (frequencyFilter === 'all') {
    return (
      <div className="space-y-4">
        {grouped['2.4GHz'] && grouped['2.4GHz'].length > 0 &&
          renderChannelList(grouped['2.4GHz'], `2.4 ${t('wifi.ghz')}`)}
        {grouped['5GHz'] && grouped['5GHz'].length > 0 &&
          renderChannelList(grouped['5GHz'], `5 ${t('wifi.ghz')}`)}
      </div>
    )
  }

  return renderChannelList(channelHealth)
}

export default WiFiScanner
