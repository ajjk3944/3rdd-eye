'use client'

import { useState, useEffect } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Badge } from '@/components/ui/badge'
import { Input } from '@/components/ui/input'
import { Camera, Speaker, Lightbulb, Plug, Thermometer, Tv, Lock, Radio, Activity, Cog, Cpu, Shield, RefreshCw, Edit2, Trash2 } from 'lucide-react'
import { IoTDeviceInfo, IoTSecurityFinding, getIoTDevice } from '@/lib/native-plugins'
import { toast } from 'sonner'

interface IoTDeviceDetailProps {
  deviceId: number
  onBack: () => void
  onRefresh: () => void
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

export default function IoTDeviceDetail({ deviceId, onBack, onRefresh }: IoTDeviceDetailProps) {
  const [device, setDevice] = useState<IoTDeviceInfo | null>(null)
  const [findings, setFindings] = useState<IoTSecurityFinding[]>([])
  const [isEditing, setIsEditing] = useState(false)
  const [newName, setNewName] = useState('')
  const [isScanning, setIsScanning] = useState(false)

  const iotPlugin = getIoTDevice()

  useEffect(() => {
    loadDevice()
    loadFindings()
  }, [deviceId])

  const loadDevice = async () => {
    if (!iotPlugin) return
    try {
      const result = await iotPlugin.getDeviceById({ id: deviceId })
      setDevice(result.device)
      setNewName(result.device.deviceName || '')
    } catch (error) {
      console.error('Error loading device:', error)
    }
  }

  const loadFindings = async () => {
    if (!iotPlugin) return
    try {
      const result = await iotPlugin.getSecurityFindings({ deviceId })
      setFindings(result.findings || [])
    } catch (error) {
      console.error('Error loading findings:', error)
    }
  }

  const handleSaveName = async () => {
    if (!iotPlugin || !device) return
    try {
      await iotPlugin.updateDeviceName({ id: deviceId, name: newName })
      setIsEditing(false)
      loadDevice()
      onRefresh()
      toast.success('Device name updated')
    } catch (error: any) {
      toast.error('Failed to update name', { description: error.message })
    }
  }

  const handleRunSecurityScan = async () => {
    if (!iotPlugin) return
    setIsScanning(true)
    try {
      const result = await iotPlugin.scanDeviceSecurity({ id: deviceId })
      toast.success('Security scan complete', {
        description: `Score: ${result.score}/100`
      })
      loadDevice()
      loadFindings()
    } catch (error: any) {
      toast.error('Security scan failed', { description: error.message })
    } finally {
      setIsScanning(false)
    }
  }

  const handleDeleteDevice = async () => {
    if (!iotPlugin) return
    if (!confirm('Are you sure you want to remove this device?')) return
    try {
      await iotPlugin.deleteDevice({ id: deviceId })
      toast.success('Device removed')
      onRefresh()
      onBack()
    } catch (error: any) {
      toast.error('Failed to remove device', { description: error.message })
    }
  }

  if (!device) {
    return <div className="p-4 text-gray-400">Loading...</div>
  }

  const Icon = deviceTypeIcons[device.deviceType] || Cpu
  const securityColor = device.securityScore >= 80 ? 'text-green-400' : device.securityScore >= 50 ? 'text-amber-400' : 'text-red-400'
  const securityBgColor = device.securityScore >= 80 ? 'bg-green-400' : device.securityScore >= 50 ? 'bg-amber-400' : 'bg-red-400'

  const getSeverityColor = (severity: string) => {
    switch (severity) {
      case 'critical': return 'text-red-400 bg-red-500/20 border-red-500/30'
      case 'high': return 'text-orange-400 bg-orange-500/20 border-orange-500/30'
      case 'medium': return 'text-amber-400 bg-amber-500/20 border-amber-500/30'
      case 'low': return 'text-blue-400 bg-blue-500/20 border-blue-500/30'
      default: return 'text-gray-400 bg-gray-500/20 border-gray-500/30'
    }
  }

  return (
    <div className="p-4 space-y-4">
      {/* Device Header */}
      <div className="text-center py-6">
        <div className="inline-flex p-4 bg-cyan-900/20 rounded-full mb-4">
          <Icon className="text-cyan-400" size={48} />
        </div>
        {isEditing ? (
          <div className="flex items-center justify-center gap-2 mb-2">
            <Input
              value={newName}
              onChange={(e) => setNewName(e.target.value)}
              className="max-w-xs bg-black/40 border-cyan-900/30 text-white"
            />
            <Button onClick={handleSaveName} size="sm" className="bg-cyan-600 hover:bg-cyan-700">
              Save
            </Button>
            <Button onClick={() => setIsEditing(false)} size="sm" variant="outline">
              Cancel
            </Button>
          </div>
        ) : (
          <div className="flex items-center justify-center gap-2 mb-2">
            <h2 className="text-xl font-bold text-white">{device.deviceName || 'Unknown Device'}</h2>
            <Button onClick={() => setIsEditing(true)} size="sm" variant="ghost">
              <Edit2 size={16} />
            </Button>
          </div>
        )}
        <div className="flex items-center justify-center gap-2">
          {device.isOnline && (
            <Badge className="bg-green-500/20 text-green-400 border-green-500/30">Online</Badge>
          )}
        </div>
      </div>

      {/* Device Info */}
      <Card className="bg-black/40 border-cyan-900/30">
        <CardHeader>
          <CardTitle className="text-white">Device Information</CardTitle>
        </CardHeader>
        <CardContent className="space-y-2 text-sm">
          <div className="flex justify-between">
            <span className="text-gray-400">IP Address</span>
            <span className="text-white">{device.ipAddress}</span>
          </div>
          <div className="flex justify-between">
            <span className="text-gray-400">MAC Address</span>
            <span className="text-white">{device.macAddress}</span>
          </div>
          <div className="flex justify-between">
            <span className="text-gray-400">Manufacturer</span>
            <span className="text-white">{device.manufacturer || 'Unknown'}</span>
          </div>
          <div className="flex justify-between">
            <span className="text-gray-400">Device Type</span>
            <span className="text-white capitalize">{device.deviceType}</span>
          </div>
          {device.deviceModel && (
            <div className="flex justify-between">
              <span className="text-gray-400">Model</span>
              <span className="text-white">{device.deviceModel}</span>
            </div>
          )}
          {device.platform && device.platform !== 'other' && (
            <div className="flex justify-between">
              <span className="text-gray-400">Platform</span>
              <span className="text-white capitalize">{device.platform.replace('_', ' ')}</span>
            </div>
          )}
        </CardContent>
      </Card>

      {/* Security Score */}
      <Card className="bg-black/40 border-cyan-900/30">
        <CardHeader>
          <CardTitle className="text-white flex items-center gap-2">
            <Shield className={securityColor} size={20} />
            Security Score
          </CardTitle>
        </CardHeader>
        <CardContent className="space-y-4">
          <div className="flex items-center gap-4">
            <div className="flex-1 h-3 bg-gray-800 rounded-full overflow-hidden">
              <div
                className={`h-full ${securityBgColor} rounded-full`}
                style={{ width: `${device.securityScore}%` }}
              />
            </div>
            <span className={`text-2xl font-bold ${securityColor}`}>
              {device.securityScore}/100
            </span>
          </div>

          {findings.length > 0 && (
            <div className="space-y-2">
              <p className="text-sm text-gray-400">{findings.length} issues found</p>
              {findings.map((finding) => (
                <div key={finding.id} className="p-3 bg-black/40 rounded-lg border border-cyan-900/30">
                  <div className="flex items-start gap-2 mb-2">
                    <Badge className={getSeverityColor(finding.severity)}>
                      {finding.severity.toUpperCase()}
                    </Badge>
                    <span className="text-white font-semibold flex-1">{finding.title}</span>
                  </div>
                  <p className="text-sm text-gray-400 mb-2">{finding.description}</p>
                  <p className="text-xs text-cyan-400">💡 {finding.recommendation}</p>
                </div>
              ))}
            </div>
          )}

          <Button
            onClick={handleRunSecurityScan}
            disabled={isScanning}
            className="w-full bg-cyan-600 hover:bg-cyan-700"
          >
            {isScanning ? 'Scanning...' : 'Run Security Scan'}
          </Button>
        </CardContent>
      </Card>

      {/* Open Ports */}
      {device.openPorts && device.openPorts.length > 0 && (
        <Card className="bg-black/40 border-cyan-900/30">
          <CardHeader>
            <CardTitle className="text-white">Open Ports</CardTitle>
          </CardHeader>
          <CardContent>
            <div className="flex flex-wrap gap-2">
              {device.openPorts.map((port) => (
                <Badge key={port} variant="outline" className="border-cyan-900/30 text-gray-300">
                  {port}
                </Badge>
              ))}
            </div>
          </CardContent>
        </Card>
      )}

      {/* Actions */}
      <Card className="bg-black/40 border-cyan-900/30">
        <CardHeader>
          <CardTitle className="text-white">Actions</CardTitle>
        </CardHeader>
        <CardContent className="space-y-2">
          <Button variant="outline" className="w-full justify-start" onClick={loadDevice}>
            <RefreshCw size={18} className="mr-2" />
            Refresh Device Info
          </Button>
          <Button
            variant="outline"
            className="w-full justify-start text-red-400 border-red-900/30 hover:bg-red-900/20"
            onClick={handleDeleteDevice}
          >
            <Trash2 size={18} className="mr-2" />
            Remove Device
          </Button>
        </CardContent>
      </Card>
    </div>
  )
}
