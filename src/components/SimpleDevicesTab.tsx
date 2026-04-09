'use client'

import { useState, useEffect } from 'react'
import { Card, CardContent } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Input } from '@/components/ui/input'
import { Badge } from '@/components/ui/badge'
import { ScrollArea } from '@/components/ui/scroll-area'
import {
  RefreshCw,
  Search,
  Smartphone,
  Router,
  Tv,
  Globe,
  ChevronRight,
  Shield,
} from 'lucide-react'
import { NetworkDevice, getNetworkScanner } from '@/lib/native-plugins'
import { useI18n } from '@/lib/i18n'

interface SimpleDevicesTabProps {
  devices: NetworkDevice[]
  loading: boolean
  onScan: () => void
}

export function SimpleDevicesTab({ devices, loading, onScan }: SimpleDevicesTabProps) {
  const { t } = useI18n()
  const [search, setSearch] = useState('')
  const [currentNetwork, setCurrentNetwork] = useState<any>(null)
  const [selectedDevice, setSelectedDevice] = useState<NetworkDevice | null>(null)

  // Load current network info for router portal
  useEffect(() => {
    const loadNetworkInfo = async () => {
      const netScanner = getNetworkScanner()
      if (netScanner) {
        try {
          const info = await netScanner.getNetworkInfo()
          if (info.success) {
            setCurrentNetwork(info)
          }
        } catch (err) {
          console.error('Failed to get network info:', err)
        }
      }
    }
    loadNetworkInfo()
  }, [])

  // Filter devices by search
  const filteredDevices = devices.filter(device => {
    if (!search) return true
    const searchLower = search.toLowerCase()
    return (
      device.hostname?.toLowerCase().includes(searchLower) ||
      device.ipAddress?.toLowerCase().includes(searchLower) ||
      device.macAddress?.toLowerCase().includes(searchLower) ||
      device.deviceType?.toLowerCase().includes(searchLower)
    )
  })

  // Open router portal
  const openRouterPortal = () => {
    if (currentNetwork?.gateway) {
      const url = `http://${currentNetwork.gateway}`
      if (typeof window !== 'undefined') {
        window.open(url, '_blank')
      }
    }
  }

  // Get device icon
  const getDeviceIcon = (deviceType: string) => {
    const type = deviceType?.toLowerCase() || ''
    if (type.includes('phone') || type.includes('samsung') || type.includes('xiaomi') || 
        type.includes('oneplus') || type.includes('huawei') || type.includes('pixel')) {
      return <Smartphone className="w-5 h-5 text-cyan-400" />
    }
    if (type.includes('tv') || type.includes('chromecast') || type.includes('bravia')) {
      return <Tv className="w-5 h-5 text-pink-400" />
    }
    if (type.includes('router') || type.includes('gateway')) {
      return <Router className="w-5 h-5 text-blue-400" />
    }
    return <Router className="w-5 h-5 text-purple-400" />
  }

  return (
    <div className="space-y-4">
      {/* Header */}
      <div className="flex flex-col sm:flex-row sm:items-center justify-between gap-4">
        <div>
          <h2 className="text-xl font-bold text-white flex items-center gap-2">
            <Router className="w-5 h-5 text-purple-400" />
            {t('network.title')}
          </h2>
          <p className="text-sm text-gray-500">{t('network.subtitle')}</p>
        </div>
        <Button 
          onClick={onScan} 
          disabled={loading} 
          className="bg-purple-600 hover:bg-purple-700"
        >
          <RefreshCw className={`w-4 h-4 mr-2 ${loading ? 'animate-spin' : ''}`} />
          {loading ? t('common.scanning') : t('common.scanNow')}
        </Button>
      </div>

      {/* Alert: AP Isolation Detected */}
      {!loading && devices.length > 0 && devices.length < 5 && (
        <Card className="bg-orange-900/20 border-orange-500/30">
          <CardContent className="p-4">
            <div className="flex items-start gap-3">
              <div className="w-10 h-10 rounded-lg bg-orange-500/20 flex items-center justify-center flex-shrink-0">
                <Shield className="w-5 h-5 text-orange-400" />
              </div>
              <div className="flex-1">
                <p className="font-medium text-orange-400">Limited Device Detection</p>
                <p className="text-sm text-gray-400 mt-1">
                  Only {devices.length} device(s) found. Your router may have AP Isolation enabled, 
                  which blocks device-to-device communication.
                </p>
                <p className="text-xs text-gray-500 mt-2">
                  💡 To see all devices: Open Router Admin Portal → Disable "AP Isolation" or "Client Isolation"
                </p>
              </div>
            </div>
          </CardContent>
        </Card>
      )}

      {/* Online Count */}
      <Card className="bg-[#0d120d] border-emerald-900/30">
        <CardContent className="p-4">
          <div className="flex items-center justify-between">
            <div>
              <p className="text-sm text-gray-400">Devices Online</p>
              <p className="text-3xl font-bold text-emerald-400">
                {devices.filter(d => d.isOnline !== false).length}
              </p>
            </div>
            <div className="w-12 h-12 rounded-full bg-emerald-500/20 flex items-center justify-center">
              <Router className="w-6 h-6 text-emerald-400" />
            </div>
          </div>
        </CardContent>
      </Card>

      {/* Router Portal */}
      {currentNetwork?.gateway && (
        <Card className="bg-gradient-to-br from-purple-900/20 to-blue-900/20 border-purple-500/30">
          <CardContent className="p-4">
            <div className="flex items-center justify-between">
              <div className="flex items-center gap-3">
                <div className="w-12 h-12 rounded-lg bg-purple-500/20 flex items-center justify-center">
                  <Globe className="w-6 h-6 text-purple-400" />
                </div>
                <div>
                  <p className="font-medium text-white">Router Admin Portal</p>
                  <p className="text-xs text-gray-400 font-mono">{currentNetwork.gateway}</p>
                  <p className="text-xs text-gray-500">Access your router settings</p>
                </div>
              </div>
              <Button 
                onClick={openRouterPortal}
                className="bg-purple-600 hover:bg-purple-700"
              >
                Open
              </Button>
            </div>
          </CardContent>
        </Card>
      )}

      {/* Search */}
      <div className="relative">
        <Search className="absolute left-3 top-1/2 transform -translate-y-1/2 w-4 h-4 text-gray-500" />
        <Input
          value={search}
          onChange={(e) => setSearch(e.target.value)}
          placeholder={t('network.searchPlaceholder') || 'Search by name, IP, or MAC...'}
          className="pl-10 bg-[#0d120d] border-gray-800 text-white"
        />
      </div>

      {/* Loading State */}
      {loading && (
        <Card className="bg-[#0d120d] border-purple-900/30">
          <CardContent className="p-8 text-center">
            <div className="flex flex-col items-center gap-4">
              <div className="w-16 h-16 rounded-full border-4 border-purple-500/20 border-t-purple-500 animate-spin" />
              <div>
                <p className="text-white font-medium">{t('topology.scanningNetwork')}</p>
                <p className="text-sm text-gray-500 mt-1">Discovering devices connected to your WiFi</p>
                <p className="text-xs text-purple-400 mt-2">This may take 10-30 seconds to complete</p>
              </div>
            </div>
          </CardContent>
        </Card>
      )}

      {/* No Devices */}
      {!loading && filteredDevices.length === 0 && (
        <Card className="bg-[#0d120d] border-gray-800">
          <CardContent className="p-8 text-center">
            <Router className="w-16 h-16 text-gray-600 mx-auto mb-4" />
            <p className="text-white font-medium">{t('network.noDevices')}</p>
            <p className="text-sm text-gray-500 mt-2">
              {search ? 'No devices match your search' : 'Click Scan to discover devices on your network'}
            </p>
          </CardContent>
        </Card>
      )}

      {/* Device List */}
      {!loading && filteredDevices.length > 0 && (
        <ScrollArea className="h-[calc(100vh-400px)]">
          <div className="space-y-3">
            {filteredDevices.map((device, index) => (
              <Card 
                key={index}
                className="bg-[#0d120d] border-gray-800 hover:border-purple-500/50 transition-colors cursor-pointer"
                onClick={() => setSelectedDevice(device)}
              >
                <CardContent className="p-4">
                  <div className="flex items-center justify-between">
                    <div className="flex items-center gap-3 flex-1">
                      {/* Device Icon */}
                      <div className="w-12 h-12 rounded-lg bg-purple-500/10 flex items-center justify-center flex-shrink-0">
                        {getDeviceIcon(device.deviceType || '')}
                      </div>

                      {/* Device Info */}
                      <div className="flex-1 min-w-0">
                        {/* Device Name */}
                        <div className="flex items-center gap-2">
                          <p className="font-medium text-white truncate">
                            {device.hostname || 'Unknown Device'}
                          </p>
                          {device.isOnline !== false && (
                            <div className="w-2 h-2 rounded-full bg-emerald-400 flex-shrink-0" />
                          )}
                        </div>

                        {/* Device Type */}
                        {device.deviceType && (
                          <Badge 
                            variant="outline" 
                            className="text-xs border-purple-500/30 text-purple-400 mt-1"
                          >
                            {device.deviceType}
                          </Badge>
                        )}

                        {/* IP and MAC */}
                        <div className="grid grid-cols-2 gap-4 mt-2">
                          <div>
                            <p className="text-xs text-gray-500">{t('network.ipAddress')}</p>
                            <p className="text-sm text-emerald-400 font-mono">
                              {device.ipAddress || 'N/A'}
                            </p>
                          </div>
                          <div>
                            <p className="text-xs text-gray-500">{t('network.macAddress')}</p>
                            <p className="text-sm text-gray-400 font-mono">
                              {device.macAddress || 'N/A'}
                            </p>
                          </div>
                        </div>
                      </div>

                      {/* Arrow */}
                      <ChevronRight className="w-5 h-5 text-gray-600 flex-shrink-0" />
                    </div>
                  </div>
                </CardContent>
              </Card>
            ))}
          </div>
        </ScrollArea>
      )}

      {/* Device Details Modal */}
      {selectedDevice && (
        <div 
          className="fixed inset-0 bg-black/80 z-50 flex items-center justify-center p-4"
          onClick={() => setSelectedDevice(null)}
        >
          <Card 
            className="bg-[#0d120d] border-purple-500/30 max-w-md w-full"
            onClick={(e) => e.stopPropagation()}
          >
            <CardContent className="p-6">
              <div className="flex items-center justify-between mb-6">
                <h3 className="text-lg font-bold text-white flex items-center gap-2">
                  {getDeviceIcon(selectedDevice.deviceType || '')}
                  Device Details
                </h3>
                <button
                  onClick={() => setSelectedDevice(null)}
                  className="text-gray-400 hover:text-white"
                >
                  ✕
                </button>
              </div>

              <div className="space-y-4">
                {/* Hostname */}
                <div>
                  <p className="text-sm text-gray-400">{t('network.hostname')}</p>
                  <p className="text-white font-medium">
                    {selectedDevice.hostname || t('common.unknown')}
                  </p>
                </div>

                {/* Device Type */}
                {selectedDevice.deviceType && (
                  <div>
                    <p className="text-sm text-gray-400">{t('network.type') || 'Device Type'}</p>
                    <Badge variant="outline" className="border-purple-500/30 text-purple-400">
                      {selectedDevice.deviceType}
                    </Badge>
                  </div>
                )}

                {/* IP Address */}
                <div>
                  <p className="text-sm text-gray-400">{t('network.ipAddress')}</p>
                  <p className="text-emerald-400 font-mono">
                    {selectedDevice.ipAddress || 'N/A'}
                  </p>
                </div>

                {/* MAC Address */}
                <div>
                  <p className="text-sm text-gray-400">{t('network.macAddress')}</p>
                  <p className="text-gray-300 font-mono">
                    {selectedDevice.macAddress || 'N/A'}
                  </p>
                </div>

                {/* Status */}
                <div>
                  <p className="text-sm text-gray-400">Status</p>
                  <div className="flex items-center gap-2">
                    <div className={`w-2 h-2 rounded-full ${selectedDevice.isOnline !== false ? 'bg-emerald-400' : 'bg-gray-600'}`} />
                    <p className="text-white">
                      {selectedDevice.isOnline !== false ? t('network.online') : t('network.offline')}
                    </p>
                  </div>
                </div>

                {/* Source */}
                {selectedDevice.source && (
                  <div>
                    <p className="text-sm text-gray-400">Discovered via</p>
                    <p className="text-gray-300">{selectedDevice.source}</p>
                  </div>
                )}
              </div>
            </CardContent>
          </Card>
        </div>
      )}
    </div>
  )
}