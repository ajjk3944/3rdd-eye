'use client'

import { useState, useEffect } from 'react'
import { Dialog, DialogContent, DialogHeader, DialogTitle, DialogDescription } from '@/components/ui/dialog'
import { Button } from '@/components/ui/button'
import { Input } from '@/components/ui/input'
import { Label } from '@/components/ui/label'
import { Badge } from '@/components/ui/badge'
import { Wifi, Lock, Eye, EyeOff, Loader2 } from 'lucide-react'
import { getWiFiScanner, getNetworkScanner, WiFiNetwork } from '@/lib/native-plugins'
import { toast } from 'sonner'
import { useI18n } from '@/lib/i18n'

interface WiFiConnectDialogProps {
  open: boolean
  onClose: () => void
  network: WiFiNetwork | null
  onConnectSuccess?: () => void
  savedPassword?: string
}

export function WiFiConnectDialog({ open, onClose, network, onConnectSuccess, savedPassword }: WiFiConnectDialogProps) {
  const { t } = useI18n()
  const [password, setPassword] = useState(savedPassword || '')
  const [showPassword, setShowPassword] = useState(false)
  const [connecting, setConnecting] = useState(false)

  // Update password when savedPassword changes
  useEffect(() => {
    if (savedPassword) {
      setPassword(savedPassword)
    }
  }, [savedPassword])

  // Auto-connect if we have a saved password
  useEffect(() => {
    if (open && savedPassword && network) {
      // Auto-connect after a short delay
      const timer = setTimeout(() => {
        handleConnect()
      }, 500)
      return () => clearTimeout(timer)
    }
  }, [open, savedPassword, network])

  const handleConnect = async () => {
    if (!network) return

    const wifiScanner = getWiFiScanner()
    if (!wifiScanner) {
      toast.error(t('wifi.requiresNativeApp'))
      return
    }

    // Check if network requires password
    const requiresPassword = network.security !== 'Open' && network.security !== 'None'
    if (requiresPassword && !password.trim()) {
      toast.error(t('wifi.requiresPassword'))
      return
    }

    setConnecting(true)

    try {
      console.log('Attempting to connect to:', network.ssid)
      console.log('Security type:', network.security)
      console.log('Requires password:', requiresPassword)

      // Prepare connection options
      const connectOptions = {
        ssid: network.ssid,
        password: requiresPassword ? password : undefined,
        security: network.security,
        bssid: network.bssid // Include BSSID for better targeting
      }

      console.log('Connection options:', connectOptions)

      // Add timeout to connection attempt
      const connectPromise = wifiScanner.connect(connectOptions)

      // Wait for connection with 30 second timeout
      const timeoutPromise = new Promise((_, reject) =>
        setTimeout(() => reject(new Error(t('wifi.connectionTimeout'))), 30000)
      )

      const result = await Promise.race([connectPromise, timeoutPromise]) as any

      console.log('Connection result:', result)

      if (result && result.success) {
        // Save network to database
        try {
          await fetch('/api/saved-wifi', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({
              ssid: network.ssid,
              password: requiresPassword ? password : undefined,
              security: network.security,
              bssid: network.bssid
            })
          })
        } catch (err) {
          console.error('Failed to save network:', err)
        }

        toast.success(`${t('wifi.connected')} ${network.ssid}`, {
          description: t('wifi.establishingConnection')
        })
        setPassword('')

        // Wait longer for Android to fully establish the connection
        // Android 10+ needs time to:
        // 1. Add network suggestion
        // 2. Connect to network
        // 3. Get IP address via DHCP
        // 4. Validate internet connectivity
        // Check connection status with polling using NetworkScanner
        console.log('Verifying connection...')
        const netScanner = getNetworkScanner()

        // Poll for up to 5 seconds checking if we are connected (faster feedback)
        let isConnectedAndVerified = false

        for (let i = 0; i < 5; i++) {
          await new Promise(resolve => setTimeout(resolve, 1000)) // Wait 1s

          try {
            if (netScanner) {
              const currentInfo = await netScanner.getNetworkInfo()

              // Check if connected to the target SSID
              const currentSSID = currentInfo.ssid?.replace(/"/g, '')
              const targetSSID = network.ssid.replace(/"/g, '')

              if (currentInfo.isConnected && currentSSID === targetSSID) {
                console.log('Successfully connected to', currentSSID)
                if (currentInfo.ipAddress && currentInfo.ipAddress !== '0.0.0.0') {
                  isConnectedAndVerified = true
                  break
                }
              }
            }
          } catch (e) {
            console.log('Error checking network status, retrying...', e)
          }
        }

        if (isConnectedAndVerified) {
          toast.success(t('wifi.connectionSuccess'), {
            description: t('wifi.canBrowseWeb')
          })
        } else {
          // Since native connect returned success, assume it worked
          console.log('Connection verification timed out but connect succeeded')
        }

        console.log('Calling onConnectSuccess callback...')
        onConnectSuccess?.()
        onClose()
      } else {
        // Provide more specific error messages
        const errorMsg = result?.error || 'Failed to connect to WiFi'
        console.error('Connection failed:', errorMsg)

        if (errorMsg.toLowerCase().includes('password') || errorMsg.toLowerCase().includes('authentication') || errorMsg.toLowerCase().includes('auth')) {
          toast.error(t('wifi.wrongPassword'), {
            description: t('wifi.tryAgain')
          })
        } else if (errorMsg.toLowerCase().includes('timeout')) {
          toast.error(t('wifi.connectionTimeout'), {
            description: t('wifi.networkOutOfRange')
          })
        } else if (errorMsg.toLowerCase().includes('not found') || errorMsg.toLowerCase().includes('unavailable')) {
          toast.error(t('wifi.networkNotFound'), {
            description: t('wifi.tryScanning')
          })
        } else {
          toast.error(t('wifi.connectionFailed'), {
            description: errorMsg
          })
        }
      }
    } catch (err: any) {
      console.error('Connection error:', err)
      const errorMsg = err.message || 'Connection error'

      if (errorMsg.toLowerCase().includes('timeout')) {
        toast.error(t('wifi.connectionTimeout'), {
          description: t('wifi.checkRange')
        })
      } else {
        toast.error(t('common.error'), {
          description: errorMsg
        })
      }
    } finally {
      setConnecting(false)
    }
  }

  const handleClose = () => {
    if (!connecting) {
      setPassword('')
      onClose()
    }
  }

  if (!network) return null

  const requiresPassword = network.security !== 'Open' && network.security !== 'None'
  const signalQuality = network.signal >= 70 ? t('wifi.excellent') :
    network.signal >= 50 ? t('wifi.good') :
      network.signal >= 30 ? t('wifi.fair') : t('wifi.weak')
  const signalColor = network.signal >= 70 ? 'text-emerald-400' :
    network.signal >= 50 ? 'text-green-400' :
      network.signal >= 30 ? 'text-yellow-400' : 'text-red-400'

  return (
    <Dialog open={open} onOpenChange={handleClose}>
      <DialogContent className="bg-[#0d120d] border-cyan-900/30 text-white max-w-md">
        <DialogHeader>
          <DialogTitle className="flex items-center gap-2 text-white">
            <Wifi className="w-5 h-5 text-cyan-400" />
            {t('wifi.connectToNetwork')}
          </DialogTitle>
          <DialogDescription className="text-gray-400">
            {t('wifi.enterPassword')}
          </DialogDescription>
        </DialogHeader>

        <div className="space-y-4 py-4">
          {/* Network Info */}
          <div className="p-4 rounded-lg bg-cyan-900/10 border border-cyan-900/20">
            <div className="flex items-center justify-between mb-2">
              <div className="flex items-center gap-2">
                <Wifi className="w-5 h-5 text-cyan-400" />
                <span className="font-medium text-white">{network.ssid}</span>
              </div>
              {requiresPassword && <Lock className="w-4 h-4 text-gray-400" />}
            </div>
            <div className="flex items-center gap-4 text-xs text-gray-400">
              <span>{t('wifi.channel')}: {network.channel}</span>
              <span>{network.is5GHz ? `5 ${t('wifi.ghz')}` : `2.4 ${t('wifi.ghz')}`}</span>
              <span className={signalColor}>{signalQuality}</span>
            </div>
            <div className="mt-2">
              <Badge className="bg-gray-700 text-gray-300 text-xs">
                {network.security}
              </Badge>
            </div>
          </div>

          {/* Password Input */}
          {requiresPassword && (
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
                  className="bg-[#0a0f0a] border-cyan-900/30 text-white pr-10"
                  disabled={connecting}
                  onKeyDown={(e) => e.key === 'Enter' && handleConnect()}
                  autoFocus
                />
                <button
                  type="button"
                  onClick={() => setShowPassword(!showPassword)}
                  className="absolute right-3 top-1/2 -translate-y-1/2 text-gray-400 hover:text-white"
                  disabled={connecting}
                  aria-label={showPassword ? t('wifi.hidePassword') : t('wifi.showPassword')}
                >
                  {showPassword ? <EyeOff className="w-4 h-4" /> : <Eye className="w-4 h-4" />}
                </button>
              </div>
            </div>
          )}

          {/* Open Network Notice */}
          {!requiresPassword && (
            <div className="p-3 rounded-lg bg-yellow-900/10 border border-yellow-900/20 flex items-start gap-2">
              <Lock className="w-4 h-4 text-yellow-400 mt-0.5 flex-shrink-0" />
              <div className="text-xs text-yellow-400">
                <p className="font-medium">{t('wifi.openNetwork')}</p>
                <p className="text-yellow-500/80">{t('wifi.openNetworkWarning')}</p>
              </div>
            </div>
          )}

          {/* Action Buttons */}
          <div className="flex gap-3 pt-2">
            <Button
              variant="outline"
              onClick={handleClose}
              disabled={connecting}
              className="flex-1 border-gray-700 text-gray-300 hover:bg-gray-800"
            >
              {t('common.cancel')}
            </Button>
            <Button
              onClick={handleConnect}
              disabled={connecting || (requiresPassword && !password.trim())}
              className="flex-1 bg-cyan-600 hover:bg-cyan-700 text-white"
            >
              {connecting ? (
                <>
                  <Loader2 className="w-4 h-4 mr-2 animate-spin" />
                  {t('wifi.connecting')}
                </>
              ) : (
                <>
                  <Wifi className="w-4 h-4 mr-2" />
                  {t('bluetooth.connect')}
                </>
              )}
            </Button>
          </div>
        </div>
      </DialogContent>
    </Dialog>
  )
}
