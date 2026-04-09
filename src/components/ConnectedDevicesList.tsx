'use client'

import { useState, useEffect } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Badge } from '@/components/ui/badge'
import { 
  Smartphone, Laptop, Tablet, Tv, Printer, Camera, Cpu, Router, Gamepad2, HelpCircle,
  RefreshCw, Star, Filter
} from 'lucide-react'
import { getNetworkScanner, type EnhancedDevice } from '@/lib/native-plugins'
import { DeviceDetailSheet } from './DeviceDetailSheet'
import { toast } from 'sonner'
import { formatDistanceToNow } from 'date-fns'

const deviceIcons = {
  phone: Smartphone,
  laptop: Laptop,
  tablet: Tablet,
  tv: Tv,
  printer: Printer,
  camera: Camera,
  iot: Cpu,
  router: Router,
  gaming: Gamepad2,
  unknown: HelpCircle,
}

type FilterType = 'all' | 'online' | 'favorites'

export function ConnectedDevicesList() {
  const [devices, setDevices] = useState<EnhancedDevice[]>([])
  const [loading, setLoading] = useState(false)
  const [selectedDevice, setSelectedDevice] = useState<EnhancedDevice | null>(null)
  const [detailSheetOpen, setDetailSheetOpen] = useState(false)
  const [filter, setFilter] = useState<FilterType>('all')

  const loadDevices = async () => {
    setLoading(true)
    try {
      const scanner = getNetworkScanner()
      if (!scanner) {
        toast.error('Scanner not available')
        return
      }

      const result = await scanner.scanWithDetails()
      
      if (result.success) {
        setDevices(result.devices)
        toast.success(`Found ${result.count} devices`)
      } else {
        toast.error('Failed to scan devices')
      }
    } catch (error: any) {
      toast.error(error.message || 'Failed to scan devices')
    } finally {
      setLoading(false)
    }
  }

  useEffect(() => {
    loadDevices()
  }, [])

  const handleDeviceClick = (device: EnhancedDevice) => {
    setSelectedDevice(device)
    setDetailSheetOpen(true)
  }

  const handleDeviceUpdated = () => {
    loadDevices()
  }

  const filteredDevices = devices.filter(device => {
    if (filter === 'favorites') return device.isFavorite
    if (filter === 'online') {
      // Consider device online if last seen within 5 minutes
      const fiveMinutesAgo = Date.now() - 5 * 60 * 1000
      return device.lastSeen > fiveMinutesAgo
    }
    return true
  })

  return (
    <>
      <Card className="bg-[#0a0f0a] border-cyan-900/30">
        <CardHeader>
          <div className="flex items-center justify-between">
            <CardTitle className="text-white">Connected Devices</CardTitle>
            <Button
              size="sm"
              onClick={loadDevices}
              disabled={loading}
              className="bg-cyan-900/20 text-cyan-400 hover:bg-cyan-900/30"
            >
              <RefreshCw className={`w-4 h-4 mr-2 ${loading ? 'animate-spin' : ''}`} />
              {loading ? 'Scanning...' : 'Scan'}
            </Button>
          </div>
          
          {/* Filter Bar */}
          <div className="flex gap-2 mt-4">
            <Button
              size="sm"
              variant={filter === 'all' ? 'default' : 'outline'}
              onClick={() => setFilter('all')}
              className={filter === 'all' ? 'bg-cyan-600 text-white' : 'border-cyan-900/30 text-gray-400'}
            >
              All ({devices.length})
            </Button>
            <Button
              size="sm"
              variant={filter === 'online' ? 'default' : 'outline'}
              onClick={() => setFilter('online')}
              className={filter === 'online' ? 'bg-cyan-600 text-white' : 'border-cyan-900/30 text-gray-400'}
            >
              Online ({devices.filter(d => {
                const fiveMinutesAgo = Date.now() - 5 * 60 * 1000
                return d.lastSeen > fiveMinutesAgo
              }).length})
            </Button>
            <Button
              size="sm"
              variant={filter === 'favorites' ? 'default' : 'outline'}
              onClick={() => setFilter('favorites')}
              className={filter === 'favorites' ? 'bg-cyan-600 text-white' : 'border-cyan-900/30 text-gray-400'}
            >
              <Star className="w-3 h-3 mr-1" />
              Favorites ({devices.filter(d => d.isFavorite).length})
            </Button>
          </div>
        </CardHeader>
        
        <CardContent>
          {filteredDevices.length === 0 ? (
            <div className="text-center py-8">
              <p className="text-gray-400">
                {filter === 'all' ? 'No devices found. Click Scan to discover devices.' : 
                 filter === 'online' ? 'No devices currently online.' :
                 'No favorite devices. Star devices to add them here.'}
              </p>
            </div>
          ) : (
            <div className="space-y-3">
              {filteredDevices.map(device => {
                const DeviceIcon = deviceIcons[device.deviceType] || HelpCircle
                const deviceName = device.customName || device.hostname || device.vendor + ' Device' || 'Unknown Device'
                const isOnline = device.lastSeen > Date.now() - 5 * 60 * 1000

                return (
                  <div
                    key={device.macAddress}
                    onClick={() => handleDeviceClick(device)}
                    className="p-4 bg-cyan-900/10 border border-cyan-900/30 rounded-xl hover:bg-cyan-900/20 cursor-pointer transition-colors"
                  >
                    <div className="flex items-start justify-between">
                      <div className="flex items-start gap-3 flex-1">
                        <div className="p-2 bg-cyan-900/20 rounded-lg">
                          <DeviceIcon className="w-5 h-5 text-cyan-400" />
                        </div>
                        <div className="flex-1 min-w-0">
                          <div className="flex items-center gap-2">
                            <h3 className="text-white font-medium truncate">{deviceName}</h3>
                            {device.isFavorite && <Star className="w-4 h-4 text-yellow-400 fill-current flex-shrink-0" />}
                          </div>
                          <div className="flex items-center gap-2 mt-1">
                            <Badge variant="outline" className="text-xs text-cyan-400 border-cyan-900/50">
                              {device.vendor}
                            </Badge>
                            <span className="text-gray-400 text-xs">•</span>
                            <span className="text-gray-400 text-xs">{device.ipAddress}</span>
                          </div>
                          <div className="flex items-center gap-2 mt-1">
                            <span className="text-gray-500 text-xs">
                              Last seen: {formatDistanceToNow(device.lastSeen, { addSuffix: true })}
                            </span>
                            <span className="text-gray-500 text-xs">•</span>
                            <span className="text-gray-500 text-xs">
                              Seen {device.timesSeen} times
                            </span>
                          </div>
                        </div>
                      </div>
                      <div className="flex-shrink-0">
                        <div className={`w-2 h-2 rounded-full ${isOnline ? 'bg-green-400' : 'bg-gray-600'}`} />
                      </div>
                    </div>
                  </div>
                )
              })}
            </div>
          )}
        </CardContent>
      </Card>

      <DeviceDetailSheet
        device={selectedDevice}
        open={detailSheetOpen}
        onOpenChange={setDetailSheetOpen}
        onDeviceUpdated={handleDeviceUpdated}
      />
    </>
  )
}
