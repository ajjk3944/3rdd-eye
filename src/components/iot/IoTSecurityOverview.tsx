'use client'

import { useState, useEffect } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Badge } from '@/components/ui/badge'
import { Shield, AlertTriangle, AlertCircle, Info, Camera, Speaker, Lightbulb, Plug, Cpu } from 'lucide-react'
import { IoTDeviceInfo, IoTSecurityOverview as SecurityOverviewType, getIoTDevice } from '@/lib/native-plugins'

interface IoTSecurityOverviewProps {
  devices: IoTDeviceInfo[]
  onDeviceClick: (deviceId: number) => void
}

const deviceTypeIcons: Record<string, any> = {
  camera: Camera,
  speaker: Speaker,
  light: Lightbulb,
  plug: Plug,
  other: Cpu,
}

export default function IoTSecurityOverview({ devices, onDeviceClick }: IoTSecurityOverviewProps) {
  const [overview, setOverview] = useState<SecurityOverviewType | null>(null)
  const iotPlugin = getIoTDevice()

  useEffect(() => {
    loadOverview()
  }, [])

  const loadOverview = async () => {
    if (!iotPlugin) return
    try {
      const result = await iotPlugin.getSecurityOverview()
      setOverview(result)
    } catch (error) {
      console.error('Error loading security overview:', error)
    }
  }

  const getScoreColor = (score: number) => {
    if (score >= 80) return 'text-green-400'
    if (score >= 50) return 'text-amber-400'
    return 'text-red-400'
  }

  const getScoreLabel = (score: number) => {
    if (score >= 80) return 'GOOD'
    if (score >= 50) return 'FAIR'
    return 'POOR'
  }

  const devicesNeedingAttention = devices.filter(d => d.securityScore >= 0 && d.securityScore < 60)

  return (
    <div className="p-4 space-y-4">
      {/* Overall Score */}
      <Card className="bg-black/40 border-cyan-900/30">
        <CardContent className="p-6 text-center">
          <div className="inline-flex items-center justify-center w-32 h-32 rounded-full border-4 mb-4"
            style={{
              borderColor: overview && overview.overallScore >= 80 ? '#22c55e' :
                overview && overview.overallScore >= 50 ? '#f59e0b' : '#ef4444'
            }}
          >
            <div>
              <div className={`text-4xl font-bold ${getScoreColor(overview?.overallScore || 0)}`}>
                {overview?.overallScore || 0}%
              </div>
              <div className={`text-sm ${getScoreColor(overview?.overallScore || 0)}`}>
                {getScoreLabel(overview?.overallScore || 0)}
              </div>
            </div>
          </div>
          <p className="text-gray-400">
            {devices.length} devices • {overview?.totalFindings || 0} issues
          </p>
        </CardContent>
      </Card>

      {/* Issues by Severity */}
      <Card className="bg-black/40 border-cyan-900/30">
        <CardHeader>
          <CardTitle className="text-white">Issues by Severity</CardTitle>
        </CardHeader>
        <CardContent className="space-y-3">
          <div className="flex items-center justify-between p-3 bg-red-500/10 rounded-lg border border-red-500/30">
            <div className="flex items-center gap-2">
              <AlertCircle className="text-red-400" size={20} />
              <span className="text-white">Critical</span>
            </div>
            <Badge className="bg-red-500/20 text-red-400 border-red-500/30">
              {overview?.critical || 0}
            </Badge>
          </div>

          <div className="flex items-center justify-between p-3 bg-orange-500/10 rounded-lg border border-orange-500/30">
            <div className="flex items-center gap-2">
              <AlertTriangle className="text-orange-400" size={20} />
              <span className="text-white">High</span>
            </div>
            <Badge className="bg-orange-500/20 text-orange-400 border-orange-500/30">
              {overview?.high || 0}
            </Badge>
          </div>

          <div className="flex items-center justify-between p-3 bg-amber-500/10 rounded-lg border border-amber-500/30">
            <div className="flex items-center gap-2">
              <AlertTriangle className="text-amber-400" size={20} />
              <span className="text-white">Medium</span>
            </div>
            <Badge className="bg-amber-500/20 text-amber-400 border-amber-500/30">
              {overview?.medium || 0}
            </Badge>
          </div>

          <div className="flex items-center justify-between p-3 bg-blue-500/10 rounded-lg border border-blue-500/30">
            <div className="flex items-center gap-2">
              <Info className="text-blue-400" size={20} />
              <span className="text-white">Low</span>
            </div>
            <Badge className="bg-blue-500/20 text-blue-400 border-blue-500/30">
              {overview?.low || 0}
            </Badge>
          </div>
        </CardContent>
      </Card>

      {/* Devices Needing Attention */}
      {devicesNeedingAttention.length > 0 && (
        <Card className="bg-black/40 border-cyan-900/30">
          <CardHeader>
            <CardTitle className="text-white">Devices Needing Attention</CardTitle>
          </CardHeader>
          <CardContent className="space-y-2">
            {devicesNeedingAttention.map((device) => {
              const Icon = deviceTypeIcons[device.deviceType] || Cpu
              const scoreColor = getScoreColor(device.securityScore)

              return (
                <div
                  key={device.id}
                  className="p-3 bg-black/40 rounded-lg border border-cyan-900/30 hover:border-cyan-700/50 transition-colors cursor-pointer"
                  onClick={() => onDeviceClick(device.id)}
                >
                  <div className="flex items-center gap-3">
                    <Icon className="text-cyan-400" size={20} />
                    <div className="flex-1">
                      <div className="text-white font-semibold">{device.deviceName || 'Unknown'}</div>
                      <div className="text-sm text-gray-400">{device.ipAddress}</div>
                    </div>
                    <div className={`text-lg font-bold ${scoreColor}`}>
                      {device.securityScore}%
                    </div>
                  </div>
                </div>
              )
            })}
          </CardContent>
        </Card>
      )}
    </div>
  )
}
