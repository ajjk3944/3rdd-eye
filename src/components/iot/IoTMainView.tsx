'use client'

import { useState, useMemo } from 'react'
import { Card, CardContent } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Badge } from '@/components/ui/badge'
import { ScrollArea } from '@/components/ui/scroll-area'
import { Progress } from '@/components/ui/progress'
import {
  Cpu,
  Wifi,
  Shield,
  AlertTriangle,
  Search,
  Camera,
  Speaker,
  Lightbulb,
  Plug,
  Thermometer,
  Tv,
  Lock,
  Radio,
  Activity,
  Cog,
} from 'lucide-react'
import { IoTDeviceInfo, IoTRoom, IoTDeviceStats, getIoTDevice } from '@/lib/native-plugins'
import { toast } from 'sonner'

interface IoTMainViewProps {
  devices: IoTDeviceInfo[]
  rooms: IoTRoom[]
  stats: IoTDeviceStats | null
  isScanning: boolean
  scanProgress: number
  filterType: string
  onFilterChange: (type: string) => void
  onDeviceClick: (deviceId: number) => void
  onSecurityClick: () => void
  onRoomsClick: () => void
  onRefresh: () => void
  onStartScan: () => void
}

const deviceTypeIcons: Record<string, any> = {
  camera: Camera,
  speaker: Speaker,
  light: Lightbulb,
  plug: Plug,
  thermostat: Thermometer,
  tv: Tv,
  lock: Lock,
  hub: Radio,
  sensor: Activity,
  appliance: Cog,
  other: Cpu,
}

const deviceTypeLabels: Record<string, string> = {
  camera: 'Cameras',
  speaker: 'Speakers',
  light: 'Lights',
  plug: 'Plugs',
  thermostat: 'Thermostats',
  tv: 'TVs',
  lock: 'Locks',
  hub: 'Hubs',
  sensor: 'Sensors',
  appliance: 'Appliances',
  other: 'Other',
}

export default function IoTMainView({
  devices,
  stats,
  isScanning,
  scanProgress,
  filterType,
  onFilterChange,
  onDeviceClick,
  onSecurityClick,
  onRoomsClick,
  onRefresh,
  onStartScan,
}: IoTMainViewProps) {
  const iotPlugin = getIoTDevice()

  const handleScan = async () => {
    if (!iotPlugin) {
      toast.error('IoT scanner not available', {
        description: 'Running in web mode - native scanning not available'
      })
      return
    }

    try {
      onStartScan()
      toast.success('IoT scan started', {
        description: 'Discovering smart home devices on your network...'
      })
    } catch (error: any) {
      toast.error('Scan error', {
        description: error.message || 'An error occurred'
      })
    }
  }

  // Filter devices with useMemo for performance
  const filteredDevices = useMemo(() => {
    return filterType === 'all'
      ? devices
      : devices.filter(d => d.deviceType === filterType)
  }, [devices, filterType])

  // Get device types with counts
  const deviceTypes = stats?.byType || {}
  const typeFilters = useMemo(() => {
    return [
      { id: 'all', label: 'All', count: stats?.total || 0 },
      ...Object.entries(deviceTypes).map(([type, count]) => ({
        id: type,
        label: deviceTypeLabels[type] || type,
        count: count as number,
      })),
    ]
  }, [stats, deviceTypes])

  const getSecurityColor = (score: number) => {
    if (score >= 80) return 'text-green-400'
    if (score >= 50) return 'text-amber-400'
    return 'text-red-400'
  }

  const getSecurityBgColor = (score: number) => {
    if (score >= 80) return 'bg-green-400'
    if (score >= 50) return 'bg-amber-400'
    return 'bg-red-400'
  }

  return (
    <div className="p-4 space-y-4">
      {/* Stats Cards */}
      <div className="grid grid-cols-2 gap-3">
        <Card className="bg-black/40 border-cyan-900/30">
          <CardContent className="p-3">
            <div className="flex items-center gap-2 mb-1">
              <Cpu className="text-cyan-400" size={16} />
              <span className="text-gray-400 text-xs">Total</span>
            </div>
            <div className="text-xl font-bold text-white">{stats?.total || 0}</div>
          </CardContent>
        </Card>

        <Card className="bg-black/40 border-cyan-900/30">
          <CardContent className="p-3">
            <div className="flex items-center gap-2 mb-1">
              <Wifi className="text-green-400" size={16} />
              <span className="text-gray-400 text-xs">Online</span>
            </div>
            <div className="text-xl font-bold text-white">{stats?.online || 0}</div>
          </CardContent>
        </Card>

        <Card className="bg-black/40 border-cyan-900/30">
          <CardContent className="p-3">
            <div className="flex items-center gap-2 mb-1">
              <Shield className={getSecurityColor(stats?.avgSecurityScore || 0)} size={16} />
              <span className="text-gray-400 text-xs">Security</span>
            </div>
            <div className={`text-xl font-bold ${getSecurityColor(stats?.avgSecurityScore || 0)}`}>
              {stats?.avgSecurityScore || 0}%
            </div>
          </CardContent>
        </Card>

        <Card className="bg-black/40 border-cyan-900/30">
          <CardContent className="p-3">
            <div className="flex items-center gap-2 mb-1">
              <AlertTriangle className="text-red-400" size={16} />
              <span className="text-gray-400 text-xs">Issues</span>
            </div>
            <div className="text-xl font-bold text-white">{stats?.criticalIssues || 0}</div>
          </CardContent>
        </Card>
      </div>

      {/* Scan Button */}
      <div className="flex gap-2">
        <Button
          onClick={handleScan}
          disabled={isScanning}
          className="flex-1 bg-cyan-600 hover:bg-cyan-700 text-white"
        >
          {isScanning ? (
            <>
              <div className="animate-pulse mr-2">Scanning...</div>
              <span>{scanProgress}%</span>
            </>
          ) : (
            <>
              <Search size={18} className="mr-2" />
              Scan Network
            </>
          )}
        </Button>
      </div>

      {isScanning && (
        <Progress value={scanProgress} className="h-2" />
      )}

      {/* Device Type Filter */}
      <ScrollArea className="w-full">
        <div className="flex gap-2 pb-2">
          {typeFilters.map((filter) => (
            <Button
              key={filter.id}
              onClick={() => onFilterChange(filter.id)}
              variant={filterType === filter.id ? 'default' : 'outline'}
              size="sm"
              className={
                filterType === filter.id
                  ? 'bg-cyan-600 text-white hover:bg-cyan-700'
                  : 'bg-gray-800 text-gray-400 border-gray-700 hover:bg-gray-700'
              }
            >
              {filter.label}
              <Badge variant="secondary" className="ml-2">
                {filter.count}
              </Badge>
            </Button>
          ))}
        </div>
      </ScrollArea>

      {/* Device List */}
      {filteredDevices.length === 0 ? (
        <Card className="bg-black/40 border-cyan-900/30">
          <CardContent className="p-8 text-center">
            <Cpu className="mx-auto mb-4 text-gray-600" size={48} />
            <p className="text-gray-400 mb-2">No IoT devices found</p>
            <p className="text-gray-500 text-sm mb-4">
              Scan your network to discover smart home devices
            </p>
            <Button onClick={handleScan} className="bg-cyan-600 hover:bg-cyan-700">
              <Search size={18} className="mr-2" />
              Start Scan
            </Button>
          </CardContent>
        </Card>
      ) : (
        <div className="space-y-3">
          {filteredDevices.map((device) => {
            const Icon = deviceTypeIcons[device.deviceType] || Cpu
            const securityColor = getSecurityColor(device.securityScore)
            const securityBgColor = getSecurityBgColor(device.securityScore)

            return (
              <Card
                key={device.id}
                className="bg-black/40 border-cyan-900/30 hover:border-cyan-700/50 transition-colors cursor-pointer"
                onClick={() => onDeviceClick(device.id)}
              >
                <CardContent className="p-4">
                  <div className="flex items-start gap-3">
                    <div className="p-2 bg-cyan-900/20 rounded-lg">
                      <Icon className="text-cyan-400" size={24} />
                    </div>
                    <div className="flex-1 min-w-0">
                      <div className="flex items-center gap-2 mb-1">
                        <h3 className="font-semibold text-white truncate">
                          {device.deviceName || device.manufacturer || 'Unknown Device'}
                        </h3>
                        {device.isOnline && (
                          <Badge className="bg-green-500/20 text-green-400 border-green-500/30">
                            Online
                          </Badge>
                        )}
                      </div>
                      <p className="text-sm text-gray-400 mb-2">
                        {device.ipAddress} • {device.macAddress?.substring(0, 17)}
                      </p>
                      {device.securityScore >= 0 && (
                        <div className="flex items-center gap-2">
                          <div className="flex-1 h-2 bg-gray-800 rounded-full overflow-hidden">
                            <div
                              className={`h-full ${securityBgColor} rounded-full`}
                              style={{ width: `${device.securityScore}%` }}
                            />
                          </div>
                          <span className={`text-xs ${securityColor}`}>
                            {device.securityScore}%
                          </span>
                        </div>
                      )}
                    </div>
                  </div>
                </CardContent>
              </Card>
            )
          })}
        </div>
      )}

      {/* Quick Actions */}
      <div className="space-y-2 pt-4">
        <h3 className="text-sm font-semibold text-gray-400 mb-2">Quick Actions</h3>
        
        <Card
          className="bg-black/40 border-cyan-900/30 hover:border-cyan-700/50 transition-colors cursor-pointer"
          onClick={onSecurityClick}
        >
          <CardContent className="p-4 flex items-center justify-between">
            <div className="flex items-center gap-3">
              <Shield className="text-cyan-400" size={20} />
              <span className="text-white">Security Overview</span>
            </div>
            <span className="text-gray-400">→</span>
          </CardContent>
        </Card>

        <Card
          className="bg-black/40 border-cyan-900/30 hover:border-cyan-700/50 transition-colors cursor-pointer"
          onClick={onRoomsClick}
        >
          <CardContent className="p-4 flex items-center justify-between">
            <div className="flex items-center gap-3">
              <Radio className="text-cyan-400" size={20} />
              <span className="text-white">Room Management</span>
            </div>
            <span className="text-gray-400">→</span>
          </CardContent>
        </Card>

        <Card
          className="bg-black/40 border-cyan-900/30 hover:border-cyan-700/50 transition-colors cursor-pointer"
          onClick={handleScan}
        >
          <CardContent className="p-4 flex items-center justify-between">
            <div className="flex items-center gap-3">
              <Search className="text-cyan-400" size={20} />
              <span className="text-white">Rescan Network</span>
            </div>
            <span className="text-gray-400">→</span>
          </CardContent>
        </Card>
      </div>
    </div>
  )
}
