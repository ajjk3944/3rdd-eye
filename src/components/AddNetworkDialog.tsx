'use client'

import { useState } from 'react'
import { Dialog, DialogContent, DialogHeader, DialogTitle } from '@/components/ui/dialog'
import { Button } from '@/components/ui/button'
import { Input } from '@/components/ui/input'
import { Label } from '@/components/ui/label'
import { Select, SelectContent, SelectItem, SelectTrigger, SelectValue } from '@/components/ui/select'
import { Plus, Eye, EyeOff } from 'lucide-react'
import { useI18n } from '@/lib/i18n'

interface AddNetworkDialogProps {
  open: boolean
  onClose: () => void
  onAdd: (ssid: string, password: string, security: string) => Promise<void>
}

export function AddNetworkDialog({ open, onClose, onAdd }: AddNetworkDialogProps) {
  const { t } = useI18n()
  const [ssid, setSsid] = useState('')
  const [password, setPassword] = useState('')
  const [security, setSecurity] = useState('WPA/WPA2')
  const [showPassword, setShowPassword] = useState(false)
  const [adding, setAdding] = useState(false)

  const handleAdd = async () => {
    if (!ssid) return

    setAdding(true)
    try {
      await onAdd(ssid, password, security)
      setSsid('')
      setPassword('')
      setSecurity('WPA/WPA2')
      onClose()
    } catch (error) {
      console.error('Failed to add network:', error)
    } finally {
      setAdding(false)
    }
  }

  return (
    <Dialog open={open} onOpenChange={onClose}>
      <DialogContent className="bg-[#0d120d] border-cyan-900/30 text-white max-w-md">
        <DialogHeader>
          <DialogTitle className="flex items-center gap-2 text-white">
            <Plus className="w-5 h-5 text-cyan-400" />
            {t('wifi.addManually')}
          </DialogTitle>
        </DialogHeader>

        <div className="space-y-4">
          {/* SSID Input */}
          <div className="space-y-2">
            <Label htmlFor="ssid" className="text-gray-300">
              {t('wifi.networkName')}
            </Label>
            <Input
              id="ssid"
              value={ssid}
              onChange={(e) => setSsid(e.target.value)}
              placeholder={t('wifi.enterNetworkName')}
              className="bg-[#0a0f0a] border-gray-700 text-white"
              disabled={adding}
            />
          </div>

          {/* Security Type */}
          <div className="space-y-2">
            <Label htmlFor="security" className="text-gray-300">
              {t('wifi.securityType')}
            </Label>
            <Select value={security} onValueChange={setSecurity} disabled={adding}>
              <SelectTrigger className="bg-[#0a0f0a] border-gray-700 text-white">
                <SelectValue />
              </SelectTrigger>
              <SelectContent className="bg-[#0d120d] border-gray-700 text-white z-50">
                <SelectItem value="WPA/WPA2" className="text-white hover:bg-cyan-900/20 focus:bg-cyan-900/20">
                  WPA/WPA2
                </SelectItem>
                <SelectItem value="WPA3" className="text-white hover:bg-cyan-900/20 focus:bg-cyan-900/20">
                  WPA3
                </SelectItem>
                <SelectItem value="WEP" className="text-white hover:bg-cyan-900/20 focus:bg-cyan-900/20">
                  WEP
                </SelectItem>
                <SelectItem value="Open" className="text-white hover:bg-cyan-900/20 focus:bg-cyan-900/20">
                  {t('wifi.openNoPassword')}
                </SelectItem>
              </SelectContent>
            </Select>
          </div>

          {/* Password Input (if not Open) */}
          {security !== 'Open' && (
            <div className="space-y-2">
              <Label htmlFor="password" className="text-gray-300">
                {t('wifi.password')}
              </Label>
              <div className="relative">
                <Input
                  id="password"
                  type={showPassword ? 'text' : 'password'}
                  value={password}
                  onChange={(e) => setPassword(e.target.value)}
                  placeholder={t('wifi.enterPassword')}
                  className="bg-[#0a0f0a] border-gray-700 text-white pr-10"
                  disabled={adding}
                />
                <button
                  type="button"
                  onClick={() => setShowPassword(!showPassword)}
                  className="absolute right-3 top-1/2 -translate-y-1/2 text-gray-400 hover:text-white"
                  aria-label={showPassword ? t('wifi.hidePassword') : t('wifi.showPassword')}
                >
                  {showPassword ? <EyeOff className="w-4 h-4" /> : <Eye className="w-4 h-4" />}
                </button>
              </div>
            </div>
          )}

          {/* Action Buttons */}
          <div className="flex gap-2 pt-2">
            <Button
              onClick={onClose}
              variant="outline"
              className="flex-1 border-gray-700"
              disabled={adding}
            >
              {t('common.cancel')}
            </Button>
            <Button
              onClick={handleAdd}
              disabled={!ssid || adding || (security !== 'Open' && !password)}
              className="flex-1 bg-cyan-600 hover:bg-cyan-700"
            >
              {adding ? t('wifi.adding') : t('wifi.addNetwork')}
            </Button>
          </div>
        </div>
      </DialogContent>
    </Dialog>
  )
}
