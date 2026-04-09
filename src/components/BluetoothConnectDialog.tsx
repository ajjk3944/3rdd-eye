'use client'

import { useState } from 'react'
import { Dialog, DialogContent, DialogHeader, DialogTitle, DialogDescription } from '@/components/ui/dialog'
import { Button } from '@/components/ui/button'
import { Badge } from '@/components/ui/badge'
import { Bluetooth, Loader2, Zap, Clock, Smartphone, Tv, Signal } from 'lucide-react'
import { getBluetoothScanner, BluetoothDevice } from '@/lib/native-plugins'
import { toast } from 'sonner'
import { useI18n } from '@/lib/i18n'

interface BluetoothConnectDialogProps {
  open: boolean
  onClose: () => void
  device: BluetoothDevice | null
  onConnectSuccess?: () => void
}

export function BluetoothConnectDialog({ open, onClose, device, onConnectSuccess }: BluetoothConnectDialogProps) {
  const { t } = useI18n()
  const [connecting, setConnecting] = useState(false)
  const [pairingStep, setPairingStep] = useState<'idle' | 'pairing' | 'connecting' | 'success'>('idle')

  // Get device icon based on type
  const getDeviceIcon = () => {
    if (!device) return <Bluetooth className="w-6 h-6" />
    
    const type = (device.deviceType || device.deviceClass || device.name || '').toLowerCase()
    
    if (type.includes('airpod') || type.includes('earbud') || type.includes('headphone') || 
        type.includes('audio') || type.includes('speaker')) {
      return <Zap className="w-6 h-6 text-purple-400" />
    }
    if (type.includes('watch') || type.includes('band') || type.includes('wearable')) {
      return <Clock className="w-6 h-6 text-cyan-400" />
    }
    if (type.includes('phone')) {
      return <Smartphone className="w-6 h-6 text-green-400" />
    }
    if (type.includes('tv')) {
      return <Tv className="w-6 h-6 text-pink-400" />
    }
    return <Bluetooth className="w-6 h-6 text-blue-400" />
  }

  // Get signal color
  const getSignalColor = (signal: number) => {
    if (signal >= 80) return 'text-emerald-400'
    if (signal >= 60) return 'text-green-400'
    if (signal >= 40) return 'text-yellow-400'
    if (signal >= 20) return 'text-orange-400'
    return 'text-red-400'
  }

  const getSignalQuality = (signal: number) => {
    if (signal >= 80) return t('wifi.excellent')
    if (signal >= 60) return t('wifi.good')
    if (signal >= 40) return t('wifi.fair')
    if (signal >= 20) return t('wifi.weak')
    return t('bluetooth.veryWeak')
  }

  const handleConnect = async () => {
    if (!device) return

    const btScanner = getBluetoothScanner()
    if (!btScanner) {
      toast.error(t('bluetooth.requiresNativeApp'))
      return
    }

    setConnecting(true)
    setPairingStep('pairing')

    try {
      // Add timeout to pairing attempt
      const pairPromise = btScanner.pairDevice({ address: device.macAddress })

      // Wait for pairing with 30 second timeout
      const timeoutPromise = new Promise((_, reject) => 
        setTimeout(() => reject(new Error(t('bluetooth.pairingTimeout'))), 30000)
      )

      setPairingStep('connecting')
      const result = await Promise.race([pairPromise, timeoutPromise]) as any

      if (result.success) {
        setPairingStep('success')
        toast.success(`${t('bluetooth.connectedTo')} ${device.name || t('bluetooth.device')}`)
        
        // Wait a bit for the system to fully connect
        await new Promise(resolve => setTimeout(resolve, 1500))
        
        onConnectSuccess?.()
        onClose()
      } else {
        // Provide more specific error messages
        const errorMsg = result.error || t('bluetooth.failedToConnect')
        if (errorMsg.includes('already paired') || errorMsg.includes('already connected')) {
          toast.info(t('bluetooth.alreadyPaired'))
          onConnectSuccess?.()
          onClose()
        } else if (errorMsg.includes('timeout')) {
          toast.error(t('bluetooth.connectionTimeoutRange'))
        } else if (errorMsg.includes('rejected') || errorMsg.includes('denied')) {
          toast.error(t('bluetooth.pairingRejected'))
        } else if (errorMsg.includes('not found')) {
          toast.error(t('bluetooth.deviceNotFoundRange'))
        } else {
          toast.error(errorMsg)
        }
      }
    } catch (err: any) {
      const errorMsg = err.message || t('common.error')
      if (errorMsg.includes('timeout')) {
        toast.error(t('bluetooth.connectionTimeoutPairing'))
      } else {
        toast.error(errorMsg)
      }
    } finally {
      setConnecting(false)
      setPairingStep('idle')
    }
  }

  const handleClose = () => {
    if (!connecting) {
      setPairingStep('idle')
      onClose()
    }
  }

  if (!device) return null

  const isPaired = device.isPaired || device.bondState === 'Paired'
  const signalQuality = device.signal ? getSignalQuality(device.signal) : t('common.unknown')
  const signalColor = device.signal ? getSignalColor(device.signal) : 'text-gray-400'

  return (
    <Dialog open={open} onOpenChange={handleClose}>
      <DialogContent className="bg-[#0d120d] border-blue-900/30 text-white max-w-md">
        <DialogHeader>
          <DialogTitle className="flex items-center gap-2 text-white">
            <Bluetooth className="w-5 h-5 text-blue-400" />
            {t('bluetooth.connectToDevice')}
          </DialogTitle>
          <DialogDescription className="text-gray-400">
            {isPaired ? t('bluetooth.deviceAlreadyPaired') : t('bluetooth.pairWithDevice')}
          </DialogDescription>
        </DialogHeader>

        <div className="space-y-4 py-4">
          {/* Device Info */}
          <div className="p-4 rounded-lg bg-blue-900/10 border border-blue-900/20">
            <div className="flex items-center gap-3 mb-3">
              <div className="w-12 h-12 rounded-lg bg-blue-500/20 flex items-center justify-center">
                {getDeviceIcon()}
              </div>
              <div className="flex-1">
                <div className="flex items-center gap-2">
                  <span className="font-medium text-white">{device.name || t('bluetooth.unknownDevice')}</span>
                  {isPaired && (
                    <Badge className="bg-emerald-500/20 text-emerald-400 text-xs">
                      {t('bluetooth.paired')}
                    </Badge>
                  )}
                </div>
                <p className="text-xs text-gray-500 font-mono">{device.macAddress}</p>
              </div>
            </div>
            
            <div className="grid grid-cols-2 gap-2 text-xs">
              <div className="p-2 rounded bg-blue-900/10">
                <p className="text-gray-500">{t('bluetooth.type')}</p>
                <p className="text-white">{device.deviceType || device.deviceClass || t('common.unknown')}</p>
              </div>
              {device.signal && (
                <div className="p-2 rounded bg-blue-900/10">
                  <p className="text-gray-500">{t('bluetooth.signal')}</p>
                  <div className="flex items-center gap-1">
                    <Signal className={`w-3 h-3 ${signalColor}`} />
                    <span className={signalColor}>{signalQuality}</span>
                  </div>
                </div>
              )}
              {device.rssi && (
                <div className="p-2 rounded bg-blue-900/10">
                  <p className="text-gray-500">{t('bluetooth.rssi')}</p>
                  <p className="text-white font-mono">{device.rssi} dBm</p>
                </div>
              )}
              <div className="p-2 rounded bg-blue-900/10">
                <p className="text-gray-500">{t('bluetooth.protocol')}</p>
                <p className="text-white">{device.type || t('bluetooth.classic')}</p>
              </div>
            </div>
          </div>

          {/* Pairing Steps Progress */}
          {connecting && (
            <div className="p-4 rounded-lg bg-blue-900/10 border border-blue-900/20">
              <div className="space-y-3">
                <div className="flex items-center gap-3">
                  <div className={`w-6 h-6 rounded-full flex items-center justify-center ${
                    pairingStep === 'pairing' ? 'bg-blue-500 animate-pulse' : 
                    pairingStep === 'connecting' || pairingStep === 'success' ? 'bg-emerald-500' : 'bg-gray-700'
                  }`}>
                    {pairingStep === 'pairing' ? (
                      <Loader2 className="w-4 h-4 text-white animate-spin" />
                    ) : (
                      <span className="text-white text-xs">✓</span>
                    )}
                  </div>
                  <div className="flex-1">
                    <p className="text-sm text-white">{t('bluetooth.pairingWithDevice')}</p>
                    <p className="text-xs text-gray-500">{t('bluetooth.establishingConnection')}</p>
                  </div>
                </div>
                
                <div className="flex items-center gap-3">
                  <div className={`w-6 h-6 rounded-full flex items-center justify-center ${
                    pairingStep === 'connecting' ? 'bg-blue-500 animate-pulse' : 
                    pairingStep === 'success' ? 'bg-emerald-500' : 'bg-gray-700'
                  }`}>
                    {pairingStep === 'connecting' ? (
                      <Loader2 className="w-4 h-4 text-white animate-spin" />
                    ) : pairingStep === 'success' ? (
                      <span className="text-white text-xs">✓</span>
                    ) : (
                      <span className="text-gray-500 text-xs">2</span>
                    )}
                  </div>
                  <div className="flex-1">
                    <p className="text-sm text-white">{t('bluetooth.connecting')}</p>
                    <p className="text-xs text-gray-500">{t('bluetooth.finalizingConnection')}</p>
                  </div>
                </div>
              </div>
            </div>
          )}

          {/* Pairing Instructions */}
          {!isPaired && !connecting && (
            <div className="p-3 rounded-lg bg-yellow-900/10 border border-yellow-900/20 flex items-start gap-2">
              <div className="text-yellow-400 mt-0.5">ℹ️</div>
              <div className="text-xs text-yellow-400">
                <p className="font-medium">{t('bluetooth.pairingInstructions')}</p>
                <ul className="text-yellow-500/80 mt-1 space-y-1 list-disc list-inside">
                  <li>{t('bluetooth.ensurePairingMode')}</li>
                  <li>{t('bluetooth.keepDeviceClose')}</li>
                  <li>{t('bluetooth.acceptPairingRequest')}</li>
                </ul>
              </div>
            </div>
          )}

          {/* Already Paired Notice */}
          {isPaired && !connecting && (
            <div className="p-3 rounded-lg bg-emerald-900/10 border border-emerald-900/20 flex items-start gap-2">
              <div className="text-emerald-400 mt-0.5">✓</div>
              <div className="text-xs text-emerald-400">
                <p className="font-medium">{t('bluetooth.alreadyPaired')}</p>
                <p className="text-emerald-500/80 mt-1">
                  {t('bluetooth.alreadyPairedDescription')}
                </p>
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
              disabled={connecting}
              className="flex-1 bg-blue-600 hover:bg-blue-700 text-white"
            >
              {connecting ? (
                <>
                  <Loader2 className="w-4 h-4 mr-2 animate-spin" />
                  {pairingStep === 'pairing' ? t('bluetooth.pairing') : t('bluetooth.connecting')}
                </>
              ) : isPaired ? (
                <>
                  <Bluetooth className="w-4 h-4 mr-2" />
                  {t('bluetooth.reconnect')}
                </>
              ) : (
                <>
                  <Bluetooth className="w-4 h-4 mr-2" />
                  {t('bluetooth.pairDevice')}
                </>
              )}
            </Button>
          </div>
        </div>
      </DialogContent>
    </Dialog>
  )
}
