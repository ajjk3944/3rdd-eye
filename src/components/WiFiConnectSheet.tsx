'use client'

import { useState, useEffect } from 'react'
import { Dialog, DialogContent, DialogHeader, DialogTitle } from '@/components/ui/dialog'
import { Button } from '@/components/ui/button'
import { Input } from '@/components/ui/input'
import { Label } from '@/components/ui/label'
import { Switch } from '@/components/ui/switch'
import { Wifi, Lock, Eye, EyeOff, Loader2, AlertCircle } from 'lucide-react'
import { WiFiNetwork } from '@/lib/native-plugins'
import { toast } from 'sonner'
import { useI18n } from '@/lib/i18n'

interface WiFiConnectSheetProps {
  open: boolean
  onClose: () => void
  network: WiFiNetwork | null
  isSaved: boolean
  isConnected: boolean
  savedPassword?: string
  onConnect: (ssid: string, password: string, saveCredentials: boolean) => Promise<void>
  onDisconnect: (ssid: string) => Promise<void>
  onForget: (ssid: string) => Promise<void>
}

export function WiFiConnectSheet({
  open,
  onClose,
  network,
  isSaved,
  isConnected,
  savedPassword,
  onConnect,
  onDisconnect,
  onForget
}: WiFiConnectSheetProps) {
  const [password, setPassword] = useState('')
  const [showPassword, setShowPassword] = useState(false)
  const [saveCredentials, setSaveCredentials] = useState(true)
  const [connecting, setConnecting] = useState(false)
  const [error, setError] = useState('')

  // Pre-fill password if saved
  useEffect(() => {
    if (open && savedPassword) {
      setPassword(savedPassword)
    } else if (open) {
      setPassword('')
    }
    setError('')
  }, [open, savedPassword])

  if (!network) return null

  const requiresPassword = network.security !== 'Open' && network.security !== 'None'

  const handleConnect = async () => {
    if (requiresPassword && !password) {
      setError('Password is required')
      return
    }

    setConnecting(true)
    setError('')

    try {
      await onConnect(network.ssid, password, saveCredentials)
      onClose()
    } catch (err: any) {
      setError(err.message || 'Failed to connect')
      setConnecting(false)
    }
  }

  const handleDisconnect = async () => {
    setConnecting(true)
    try {
      await onDisconnect(network.ssid)
      onClose()
    } catch (err: any) {
      toast.error('Failed to disconnect')
      setConnecting(false)
    }
  }

  const handleForget = async () => {
    setConnecting(true)
    try {
      await onForget(network.ssid)
      onClose()
    } catch (err: any) {
      toast.error('Failed to forget network')
      setConnecting(false)
    }
  }

  return (
    <Dialog open={open} onOpenChange={onClose}>
      <DialogContent className="bg-[#0d120d] border-cyan-900/30 text-white max-w-md">
        <DialogHeader>
          <DialogTitle className="flex items-center gap-2 text-white">
            <Wifi className="w-5 h-5 text-cyan-400" />
            Connect to {network.ssid}
          </DialogTitle>
        </DialogHeader>

        <div className="space-y-4">
          {/* Network Info */}
          <div className="p-3 rounded-lg bg-cyan-900/10 border border-cyan-900/20">
            <div className="flex items-center justify-between text-sm">
              <span className="text-gray-400">Security</span>
              <span className="text-white">{network.security}</span>
            </div>
            <div className="flex items-center justify-between text-sm mt-2">
              <span className="text-gray-400">{t('wifi.signal')}</span>
              <span className="text-white">{network.rssi} dBm</span>
            </div>
            {isSaved && (
              <div className="flex items-center gap-2 mt-2 text-xs text-cyan-400">
                <Lock className="w-3 h-3" />
                <span>Saved network</span>
              </div>
            )}
          </div>

          {/* Password Input */}
          {requiresPassword && (
            <div className="space-y-2">
              <Label htmlFor="password" className="text-gray-300">
                Password
              </Label>
              <div className="relative">
                <Input
                  id="password"
                  type={showPassword ? 'text' : 'password'}
                  value={password}
                  onChange={(e) => {
                    setPassword(e.target.value)
                    setError('')
                  }}
                  placeholder="Enter password"
                  className="bg-[#0a0f0a] border-gray-700 text-white pr-10"
                  disabled={connecting}
                  autoFocus={!isSaved}
                />
                <button
                  type="button"
                  onClick={() => setShowPassword(!showPassword)}
                  className="absolute right-3 top-1/2 -translate-y-1/2 text-gray-400 hover:text-white"
                >
                  {showPassword ? <EyeOff className="w-4 h-4" /> : <Eye className="w-4 h-4" />}
                </button>
              </div>
              {error && (
                <div className="flex items-center gap-2 text-xs text-red-400">
                  <AlertCircle className="w-3 h-3" />
                  <span>{error}</span>
                </div>
              )}
            </div>
          )}

          {/* Save Credentials Toggle (only for new networks) */}
          {!isSaved && requiresPassword && (
            <div className="flex items-center justify-between p-3 rounded-lg bg-gray-900/30">
              <Label htmlFor="save" className="text-gray-300 cursor-pointer">
                Save network
              </Label>
              <Switch
                id="save"
                checked={saveCredentials}
                onCheckedChange={setSaveCredentials}
                disabled={connecting}
              />
            </div>
          )}

          {/* Action Buttons */}
          <div className="flex gap-2 pt-2">
            {isConnected ? (
              <>
                {/* Connected: Show Disconnect and Forget buttons */}
                <Button
                  onClick={handleDisconnect}
                  disabled={connecting}
                  variant="outline"
                  className="flex-1 border-orange-900/30 text-orange-400 hover:bg-orange-900/20"
                >
                  {connecting ? (
                    <Loader2 className="w-4 h-4 mr-2 animate-spin" />
                  ) : null}
                  Disconnect
                </Button>
                <Button
                  onClick={handleForget}
                  disabled={connecting}
                  variant="outline"
                  className="flex-1 border-red-900/30 text-red-400 hover:bg-red-900/20"
                >
                  Forget
                </Button>
              </>
            ) : (
              <>
                {/* Not Connected: Show Forget (if saved) and Connect buttons */}
                {isSaved && (
                  <Button
                    onClick={handleForget}
                    disabled={connecting}
                    variant="outline"
                    className="border-red-900/30 text-red-400 hover:bg-red-900/20"
                  >
                    Forget
                  </Button>
                )}
                <Button
                  onClick={handleConnect}
                  disabled={connecting || (requiresPassword && !password)}
                  className="flex-1 bg-cyan-600 hover:bg-cyan-700"
                >
                  {connecting ? (
                    <>
                      <Loader2 className="w-4 h-4 mr-2 animate-spin" />
                      Connecting...
                    </>
                  ) : (
                    'Connect'
                  )}
                </Button>
              </>
            )}
          </div>
        </div>
      </DialogContent>
    </Dialog>
  )
}
