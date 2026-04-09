'use client'

import { useState, useEffect } from 'react'
import { Sheet, SheetContent, SheetHeader, SheetTitle } from '@/components/ui/sheet'
import { Button } from '@/components/ui/button'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Badge } from '@/components/ui/badge'
import { Textarea } from '@/components/ui/textarea'
import { Input } from '@/components/ui/input'
import { Label } from '@/components/ui/label'
import { Select, SelectContent, SelectItem, SelectTrigger, SelectValue } from '@/components/ui/select'
import { 
  Smartphone, Laptop, Tablet, Tv, Printer, Camera, Cpu, Router, Gamepad2, HelpCircle,
  Copy, Edit, Trash2, Loader2, Star, StarOff
} from 'lucide-react'
import { getNetworkScanner, type EnhancedDevice, type OpenPort } from '@/lib/native-plugins'
import { toast } from 'sonner'
import { formatDistanceToNow } from 'date-fns'
import { useI18n } from '@/lib/i18n'

interface DeviceDetailSheetProps {
  device: EnhancedDevice | null
  open: boolean
  onOpenChange: (open: boolean) => void
  onDeviceUpdated?: () => void
}

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

const deviceTypeOptions = [
  { value: 'phone', label: 'Phone' },
  { value: 'laptop', label: 'Laptop' },
  { value: 'tablet', label: 'Tablet' },
  { value: 'tv', label: 'TV' },
  { value: 'printer', label: 'Printer' },
  { value: 'camera', label: 'Camera' },
  { value: 'iot', label: 'IoT Device' },
  { value: 'router', label: 'Router' },
  { value: 'gaming', label: 'Gaming Console' },
  { value: 'unknown', label: 'Unknown' },
]

export function DeviceDetailSheet({ device, open, onOpenChange, onDeviceUpdated }: DeviceDetailSheetProps) {
  const { t } = useI18n()
  const [editingName, setEditingName] = useState(false)
  const [customName, setCustomName] = useState('')
  const [deviceType, setDeviceType] = useState<string>('unknown')
  const [notes, setNotes] = useState('')
  const [openPorts, setOpenPorts] = useState<OpenPort[]>([])
  const [scanningPorts, setScanningPorts] = useState(false)
  const [saving, setSaving] = useState(false)

  useEffect(() => {
    if (device) {
      setCustomName(device.customName || '')
      setDeviceType(device.deviceType || 'unknown')
      setNotes(device.notes || '')
      setOpenPorts([])
    }
  }, [device])

  const copyToClipboard = (text: string, label: string) => {
    navigator.clipboard.writeText(text)
    toast.success(t(`device.${label === 'MAC address' ? 'macAddressCopied' : 'ipAddressCopied'}`))
  }

  const handleSaveName = async () => {
    if (!device) return
    
    setSaving(true)
    try {
      const scanner = getNetworkScanner()
      if (!scanner) throw new Error('Scanner not available')
      
      await scanner.setDeviceCustomName({
        macAddress: device.macAddress,
        customName: customName
      })
      
      toast.success(t('device.deviceNameUpdated'))
      setEditingName(false)
      onDeviceUpdated?.()
    } catch (error: any) {
      toast.error(error.message || t('device.failedToUpdate'))
    } finally {
      setSaving(false)
    }
  }

  const handleChangeType = async (newType: string) => {
    if (!device) return
    
    setDeviceType(newType)
    try {
      const scanner = getNetworkScanner()
      if (!scanner) throw new Error('Scanner not available')
      
      await scanner.setDeviceType({
        macAddress: device.macAddress,
        deviceType: newType
      })
      
      toast.success(t('device.deviceTypeUpdated'))
      onDeviceUpdated?.()
    } catch (error: any) {
      toast.error(error.message || t('device.failedToUpdate'))
    }
  }

  const handleSaveNotes = async () => {
    if (!device) return
    
    setSaving(true)
    try {
      const scanner = getNetworkScanner()
      if (!scanner) throw new Error('Scanner not available')
      
      await scanner.setDeviceNotes({
        macAddress: device.macAddress,
        notes: notes
      })
      
      toast.success(t('device.notesSaved'))
      onDeviceUpdated?.()
    } catch (error: any) {
      toast.error(error.message || t('device.failedToSave'))
    } finally {
      setSaving(false)
    }
  }

  const handleToggleFavorite = async () => {
    if (!device) return
    
    try {
      const scanner = getNetworkScanner()
      if (!scanner) throw new Error('Scanner not available')
      
      const result = await scanner.toggleDeviceFavorite({
        macAddress: device.macAddress
      })
      
      toast.success(result.isFavorite ? t('device.addedToFavorites') : t('device.removedFromFavorites'))
      onDeviceUpdated?.()
    } catch (error: any) {
      toast.error(error.message || t('device.failedToToggleFavorite'))
    }
  }

  const handleScanPorts = async () => {
    if (!device) return
    
    setScanningPorts(true)
    try {
      const scanner = getNetworkScanner()
      if (!scanner) throw new Error('Scanner not available')
      
      const result = await scanner.scanDevicePorts({
        ipAddress: device.ipAddress
      })
      
      if (result.success) {
        setOpenPorts(result.openPorts)
        toast.success(t('device.openPortsFound', { count: result.openPorts.length }))
      } else {
        toast.error(t('device.portScanFailed'))
      }
    } catch (error: any) {
      toast.error(error.message || t('device.failedToScanPorts'))
    } finally {
      setScanningPorts(false)
    }
  }

  const handleDelete = async () => {
    if (!device) return
    
    if (!confirm(t('device.confirmDelete'))) return
    
    try {
      const scanner = getNetworkScanner()
      if (!scanner) throw new Error('Scanner not available')
      
      await scanner.deleteDeviceHistory({
        macAddress: device.macAddress
      })
      
      toast.success(t('device.deviceDeleted'))
      onOpenChange(false)
      onDeviceUpdated?.()
    } catch (error: any) {
      toast.error(error.message || t('device.failedToDelete'))
    }
  }

  if (!device) return null

  const DeviceIcon = deviceIcons[device.deviceType] || HelpCircle
  const deviceName = device.customName || device.hostname || device.vendor + ' Device' || 'Unknown Device'

  return (
    <Sheet open={open} onOpenChange={onOpenChange}>
      <SheetContent side="bottom" className="h-[90vh] bg-[#0d120d] border-t border-cyan-900/30 overflow-y-auto">
        <SheetHeader className="mb-6">
          <div className="flex items-start justify-between">
            <div className="flex items-center gap-3">
              <div className="p-3 bg-cyan-900/20 rounded-xl">
                <DeviceIcon className="w-8 h-8 text-cyan-400" />
              </div>
              <div>
                <SheetTitle className="text-white text-xl">{deviceName}</SheetTitle>
                <div className="flex items-center gap-2 mt-1">
                  <Badge variant="outline" className="text-cyan-400 border-cyan-900/50">
                    {device.vendor}
                  </Badge>
                  <Badge variant="outline" className="text-gray-400 border-gray-700">
                    {deviceTypeOptions.find(t => t.value === deviceType)?.label}
                  </Badge>
                </div>
              </div>
            </div>
            <Button
              variant="ghost"
              size="icon"
              onClick={handleToggleFavorite}
              className="text-yellow-400 hover:text-yellow-300"
            >
              {device.isFavorite ? <Star className="w-5 h-5 fill-current" /> : <StarOff className="w-5 h-5" />}
            </Button>
          </div>
        </SheetHeader>

        <div className="space-y-4">
          {/* Device Info */}
          <Card className="bg-cyan-900/10 border-cyan-900/30">
            <CardHeader>
              <CardTitle className="text-white text-sm">{t('device.deviceInformation')}</CardTitle>
            </CardHeader>
            <CardContent className="space-y-3">
              <div className="flex items-center justify-between">
                <span className="text-gray-400 text-sm">{t('device.macAddress')}</span>
                <div className="flex items-center gap-2">
                  <span className="text-white text-sm font-mono">{device.macAddress}</span>
                  <Button
                    variant="ghost"
                    size="icon"
                    className="h-6 w-6"
                    onClick={() => copyToClipboard(device.macAddress, 'MAC address')}
                  >
                    <Copy className="w-3 h-3 text-cyan-400" />
                  </Button>
                </div>
              </div>
              
              <div className="flex items-center justify-between">
                <span className="text-gray-400 text-sm">{t('device.ipAddress')}</span>
                <div className="flex items-center gap-2">
                  <span className="text-white text-sm font-mono">{device.ipAddress}</span>
                  <Button
                    variant="ghost"
                    size="icon"
                    className="h-6 w-6"
                    onClick={() => copyToClipboard(device.ipAddress, 'IP address')}
                  >
                    <Copy className="w-3 h-3 text-cyan-400" />
                  </Button>
                </div>
              </div>
              
              <div className="flex items-center justify-between">
                <span className="text-gray-400 text-sm">{t('device.hostname')}</span>
                <span className="text-white text-sm">{device.hostname || t('common.unknown')}</span>
              </div>
              
              <div className="flex items-center justify-between">
                <span className="text-gray-400 text-sm">{t('device.vendor')}</span>
                <span className="text-white text-sm">{device.vendor}</span>
              </div>
              
              <div className="flex items-center justify-between">
                <span className="text-gray-400 text-sm">{t('device.type')}</span>
                <Select value={deviceType} onValueChange={handleChangeType}>
                  <SelectTrigger className="w-[140px] h-8 bg-[#0a0f0a] border-cyan-900/30 text-white">
                    <SelectValue />
                  </SelectTrigger>
                  <SelectContent className="bg-[#0a0f0a] border-cyan-900/30">
                    {deviceTypeOptions.map(option => (
                      <SelectItem key={option.value} value={option.value} className="text-white">
                        {option.label}
                      </SelectItem>
                    ))}
                  </SelectContent>
                </Select>
              </div>
            </CardContent>
          </Card>

          {/* History */}
          <Card className="bg-cyan-900/10 border-cyan-900/30">
            <CardHeader>
              <CardTitle className="text-white text-sm">{t('device.history')}</CardTitle>
            </CardHeader>
            <CardContent className="space-y-3">
              <div className="flex items-center justify-between">
                <span className="text-gray-400 text-sm">{t('device.firstSeen')}</span>
                <span className="text-white text-sm">
                  {formatDistanceToNow(device.firstSeen, { addSuffix: true })}
                </span>
              </div>
              
              <div className="flex items-center justify-between">
                <span className="text-gray-400 text-sm">{t('device.lastSeen')}</span>
                <span className="text-white text-sm">
                  {formatDistanceToNow(device.lastSeen, { addSuffix: true })}
                </span>
              </div>
              
              <div className="flex items-center justify-between">
                <span className="text-gray-400 text-sm">{t('device.timesSeen')}</span>
                <span className="text-white text-sm">{device.timesSeen} {t('device.sessions')}</span>
              </div>
            </CardContent>
          </Card>

          {/* Services / Ports */}
          <Card className="bg-cyan-900/10 border-cyan-900/30">
            <CardHeader>
              <div className="flex items-center justify-between">
                <CardTitle className="text-white text-sm">{t('device.services')}</CardTitle>
                <Button
                  size="sm"
                  onClick={handleScanPorts}
                  disabled={scanningPorts}
                  className="bg-cyan-900/20 text-cyan-400 hover:bg-cyan-900/30"
                >
                  {scanningPorts ? (
                    <>
                      <Loader2 className="w-3 h-3 mr-2 animate-spin" />
                      {t('device.scanning')}
                    </>
                  ) : (
                    t('device.scanPorts')
                  )}
                </Button>
              </div>
            </CardHeader>
            <CardContent>
              {openPorts.length === 0 ? (
                <p className="text-gray-400 text-sm">{t('device.clickToScan')}</p>
              ) : (
                <div className="space-y-2">
                  {openPorts.map(port => (
                    <div key={port.port} className="flex items-center justify-between p-2 bg-[#0a0f0a] rounded-lg">
                      <div>
                        <span className="text-white text-sm font-medium">{t('device.port')} {port.port}</span>
                        <span className="text-cyan-400 text-sm ml-2">{port.service}</span>
                      </div>
                      <span className="text-gray-400 text-xs">{port.description}</span>
                    </div>
                  ))}
                </div>
              )}
            </CardContent>
          </Card>

          {/* Custom Name */}
          <Card className="bg-cyan-900/10 border-cyan-900/30">
            <CardHeader>
              <CardTitle className="text-white text-sm">{t('device.customName')}</CardTitle>
            </CardHeader>
            <CardContent>
              {editingName ? (
                <div className="space-y-2">
                  <Input
                    value={customName}
                    onChange={(e) => setCustomName(e.target.value)}
                    placeholder={t('device.customName')}
                    className="bg-[#0a0f0a] border-cyan-900/30 text-white"
                  />
                  <div className="flex gap-2">
                    <Button
                      size="sm"
                      onClick={handleSaveName}
                      disabled={saving}
                      className="bg-cyan-600 text-white hover:bg-cyan-700"
                    >
                      {saving ? t('common.loading') : t('common.save')}
                    </Button>
                    <Button
                      size="sm"
                      variant="outline"
                      onClick={() => {
                        setEditingName(false)
                        setCustomName(device.customName || '')
                      }}
                      className="border-cyan-900/30 text-gray-400"
                    >
                      {t('common.cancel')}
                    </Button>
                  </div>
                </div>
              ) : (
                <div className="flex items-center justify-between">
                  <span className="text-white text-sm">{customName || t('device.notSet')}</span>
                  <Button
                    size="sm"
                    variant="ghost"
                    onClick={() => setEditingName(true)}
                    className="text-cyan-400"
                  >
                    <Edit className="w-4 h-4" />
                  </Button>
                </div>
              )}
            </CardContent>
          </Card>

          {/* Notes */}
          <Card className="bg-cyan-900/10 border-cyan-900/30">
            <CardHeader>
              <CardTitle className="text-white text-sm">{t('device.notes')}</CardTitle>
            </CardHeader>
            <CardContent className="space-y-2">
              <Textarea
                value={notes}
                onChange={(e) => setNotes(e.target.value)}
                placeholder={t('device.addNotes')}
                className="bg-[#0a0f0a] border-cyan-900/30 text-white min-h-[100px]"
              />
              <Button
                size="sm"
                onClick={handleSaveNotes}
                disabled={saving}
                className="bg-cyan-600 text-white hover:bg-cyan-700"
              >
                {saving ? t('common.loading') : t('device.saveNotes')}
              </Button>
            </CardContent>
          </Card>

          {/* Actions */}
          <Card className="bg-red-500/10 border-red-500/30">
            <CardHeader>
              <CardTitle className="text-white text-sm">{t('device.dangerZone')}</CardTitle>
            </CardHeader>
            <CardContent>
              <Button
                variant="destructive"
                size="sm"
                onClick={handleDelete}
                className="bg-red-500/20 text-red-400 hover:bg-red-500/30"
              >
                <Trash2 className="w-4 h-4 mr-2" />
                {t('device.deleteFromHistory')}
              </Button>
            </CardContent>
          </Card>
        </div>
      </SheetContent>
    </Sheet>
  )
}
