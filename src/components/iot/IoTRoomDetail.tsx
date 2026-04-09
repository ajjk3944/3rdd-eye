'use client'

import { Card, CardContent } from '@/components/ui/card'
import { Badge } from '@/components/ui/badge'
import { Camera, Speaker, Lightbulb, Plug, Thermometer, Tv, Lock, Radio, Activity, Cog, Cpu } from 'lucide-react'
import { IoTDeviceInfo } from '@/lib/native-plugins'

interface IoTRoomDetailProps {
  roomId: number
  devices: IoTDeviceInfo[]
  onDeviceClick: (deviceId: number) => void
  onBack: () => void
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

export default function IoTRoomDetail({ roomId, devices, onDeviceClick }: IoTRoomDetailProps) {
  const roomDevices = devices.filter(d => d.roomId === roomId)

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
      <div className="text-white">
        <p className="text-gray-400 text-sm">{roomDevices.length} devices in this room</p>
      </div>

      {roomDevices.length === 0 ? (
        <Card className="bg-black/40 border-cyan-900/30">
          <CardContent className="p-8 text-center">
            <p className="text-gray-400">No devices in this room</p>
          </CardContent>
        </Card>
      ) : (
        <div className="space-y-3">
          {roomDevices.map((device) => {
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
                        {device.ipAddress}
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
    </div>
  )
}
