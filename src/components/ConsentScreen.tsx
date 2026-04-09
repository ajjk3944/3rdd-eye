'use client'

import { useState, useEffect, useCallback } from 'react'
import { Card, CardContent, CardDescription, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Alert, AlertDescription } from '@/components/ui/alert'
import { Shield, Lock, Eye, Wifi, Bluetooth, MapPin, CheckCircle2, XCircle, Loader2 } from 'lucide-react'
import { getPermissionManager } from '@/lib/native-plugins'
import { useI18n } from '@/lib/i18n'

type PermissionStep = 'idle' | 'location' | 'bluetooth' | 'wifi' | 'complete'

interface PermissionState {
  location: { permission: boolean; enabled: boolean }
  bluetooth: { permission: boolean; enabled: boolean }
  wifi: { permission: boolean; enabled: boolean }
}

export default function ConsentScreen({ onConsent }: { onConsent: () => void }) {
  const { t } = useI18n()
  const [permissions, setPermissions] = useState<PermissionState>({
    location: { permission: false, enabled: false },
    bluetooth: { permission: false, enabled: false },
    wifi: { permission: false, enabled: false }
  })
  const [currentStep, setCurrentStep] = useState<PermissionStep>('idle')
  const [isLoading, setIsLoading] = useState(false)
  const [error, setError] = useState('')
  const [mounted, setMounted] = useState(false)

  const checkAllStatus = useCallback(async () => {
    const permManager = getPermissionManager()
    if (!permManager) {
      try {
        if ('permissions' in navigator) {
          const locationPerm = await navigator.permissions.query({ name: 'geolocation' as PermissionName })
          setPermissions(prev => ({
            ...prev,
            location: { permission: locationPerm.state === 'granted', enabled: true },
            bluetooth: { permission: 'bluetooth' in navigator, enabled: true },
            wifi: { permission: true, enabled: true }
          }))
        }
      } catch (err) {
        console.log('Web permission check error:', err)
      }
      return
    }

    try {
      const status = await permManager.checkAllStatus()
      setPermissions({
        location: { 
          permission: status.permissions.location, 
          enabled: status.services.location 
        },
        bluetooth: { 
          permission: status.permissions.bluetooth, 
          enabled: status.services.bluetooth 
        },
        wifi: { 
          permission: status.permissions.wifi, 
          enabled: status.services.wifi 
        }
      })
    } catch (err) {
      console.log('Status check error:', err)
    }
  }, [])

  useEffect(() => {
    setMounted(true)
    
    // Only check consent after component is mounted
    if (typeof window === 'undefined') return
    
    const consent = localStorage.getItem('thirdeye_consent')
    if (consent === 'true') {
      onConsent()
      return
    }
    
    checkAllStatus()
  }, [onConsent, checkAllStatus])

  useEffect(() => {
    const handleVisibilityChange = () => {
      if (document.visibilityState === 'visible') {
        checkAllStatus()
      }
    }
    document.addEventListener('visibilitychange', handleVisibilityChange)
    return () => document.removeEventListener('visibilitychange', handleVisibilityChange)
  }, [checkAllStatus])


  const requestLocationPermission = async () => {
    const permManager = getPermissionManager()
    setIsLoading(true)
    setError('')

    try {
      if (permManager) {
        // Request permission
        const result = await permManager.requestLocationPermission()
        if (result.granted) {
          setPermissions(prev => ({ ...prev, location: { ...prev.location, permission: true } }))
          // Try to enable location
          const enableResult = await permManager.enableLocation()
          if (enableResult.enabled || enableResult.openedSettings) {
            // Wait a bit and re-check
            setTimeout(checkAllStatus, 1000)
          }
        }
      } else {
        // Web fallback
        await new Promise((resolve) => {
          navigator.geolocation.getCurrentPosition(
            () => resolve(true),
            () => resolve(false),
            { timeout: 5000 }
          )
        })
        await checkAllStatus()
      }
    } catch (err) {
      console.log('Location permission error:', err)
      setError(t('consent.failedLocationPermission'))
    }
    setIsLoading(false)
  }

  const requestBluetoothPermission = async () => {
    const permManager = getPermissionManager()
    setIsLoading(true)
    setError('')

    try {
      if (permManager) {
        const result = await permManager.requestBluetoothPermission()
        if (result.granted) {
          setPermissions(prev => ({ ...prev, bluetooth: { ...prev.bluetooth, permission: true } }))
          // Try to enable Bluetooth
          const enableResult = await permManager.enableBluetooth()
          if (enableResult.enabled || enableResult.openedSettings) {
            setTimeout(checkAllStatus, 1000)
          }
        }
      } else {
        setPermissions(prev => ({ ...prev, bluetooth: { permission: true, enabled: true } }))
      }
    } catch (err) {
      console.log('Bluetooth permission error:', err)
      setError(t('consent.failedBluetoothPermission'))
    }
    setIsLoading(false)
  }

  const requestWifiPermission = async () => {
    const permManager = getPermissionManager()
    setIsLoading(true)
    setError('')

    try {
      if (permManager) {
        // WiFi permission is usually granted with location
        setPermissions(prev => ({ ...prev, wifi: { ...prev.wifi, permission: true } }))
        // Try to enable WiFi
        const enableResult = await permManager.enableWifi()
        if (enableResult.enabled || enableResult.openedSettings) {
          setTimeout(checkAllStatus, 1000)
        }
      } else {
        setPermissions(prev => ({ ...prev, wifi: { permission: true, enabled: true } }))
      }
    } catch (err) {
      console.log('WiFi permission error:', err)
      setError(t('consent.failedWifiEnable'))
    }
    setIsLoading(false)
  }

  const handleGrantPermissions = async () => {
    setCurrentStep('location')
    await requestLocationPermission()
    
    setCurrentStep('bluetooth')
    await requestBluetoothPermission()
    
    setCurrentStep('wifi')
    await requestWifiPermission()
    
    setCurrentStep('complete')
    await checkAllStatus()
  }

  const handleConsent = () => {
    if (typeof window !== 'undefined') {
      localStorage.setItem('thirdeye_consent', 'true')
      localStorage.setItem('thirdeye_permissions', JSON.stringify(permissions))
    }
    onConsent()
  }

  const allPermissionsGranted = permissions.location.permission && 
    permissions.bluetooth.permission && permissions.wifi.permission

  if (!mounted) {
    return null
  }


  return (
    <div suppressHydrationWarning className="min-h-screen bg-gradient-to-br from-slate-950 via-slate-900 to-slate-950 p-4 flex items-center justify-center">
      <div className="max-w-2xl w-full space-y-6">
        <div className="text-center space-y-4">
          <div className="inline-flex items-center justify-center w-24 h-24 rounded-full bg-slate-800/50 mb-4 overflow-hidden">
            <img 
              src="/3rd_eye.jpeg" 
              alt="ThirdEye Logo" 
              className="w-full h-full object-cover"
            />
          </div>
          <h1 className="text-4xl font-bold text-white">ThirdEye</h1>
          <p className="text-slate-400 text-lg">{t('consent.advancedSecurity')}</p>
        </div>

        <Card className="bg-slate-900/50 border-slate-800 backdrop-blur-sm">
          <CardHeader>
            <CardTitle className="text-white flex items-center gap-2">
              <Shield className="w-5 h-5 text-emerald-500" />
              {t('consent.privacyAndPermissions')}
            </CardTitle>
            <CardDescription className="text-slate-400">
              {t('consent.weValuePrivacy')}
            </CardDescription>
          </CardHeader>
          <CardContent className="space-y-6">
            <div className="space-y-4">
              <h3 className="text-white font-semibold">{t('consent.requiredPermissions')}</h3>

              <div className="space-y-3">
                <PermissionItem
                  icon={<MapPin className="w-5 h-5" />}
                  title={t('consent.locationAccess')}
                  description={t('consent.locationDescription')}
                  permissionGranted={permissions.location.permission}
                  serviceEnabled={permissions.location.enabled}
                  isCurrentStep={currentStep === 'location'}
                  isLoading={isLoading && currentStep === 'location'}
                />

                <PermissionItem
                  icon={<Bluetooth className="w-5 h-5" />}
                  title={t('consent.bluetoothAccess')}
                  description={t('consent.bluetoothDescription')}
                  permissionGranted={permissions.bluetooth.permission}
                  serviceEnabled={permissions.bluetooth.enabled}
                  isCurrentStep={currentStep === 'bluetooth'}
                  isLoading={isLoading && currentStep === 'bluetooth'}
                />

                <PermissionItem
                  icon={<Wifi className="w-5 h-5" />}
                  title={t('consent.wifiAccess')}
                  description={t('consent.wifiDescription')}
                  permissionGranted={permissions.wifi.permission}
                  serviceEnabled={permissions.wifi.enabled}
                  isCurrentStep={currentStep === 'wifi'}
                  isLoading={isLoading && currentStep === 'wifi'}
                />
              </div>
            </div>

            {error && (
              <Alert className="bg-red-950/50 border-red-800 text-red-300">
                <XCircle className="h-4 w-4" />
                <AlertDescription>{error}</AlertDescription>
              </Alert>
            )}

            <div className="space-y-3 pt-4">
              {!allPermissionsGranted && (
                <Button
                  onClick={handleGrantPermissions}
                  disabled={isLoading}
                  className="w-full bg-gradient-to-r from-emerald-600 to-cyan-600 hover:from-emerald-700 hover:to-cyan-700 text-white"
                >
                  {isLoading ? (
                    <>
                      <Loader2 className="w-4 h-4 mr-2 animate-spin" />
                      {t('consent.requestingPermissions')}
                    </>
                  ) : (
                    t('consent.grantPermissions')
                  )}
                </Button>
              )}

              <Button
                onClick={handleConsent}
                className="w-full bg-emerald-500 hover:bg-emerald-600 text-white"
              >
                <CheckCircle2 className="w-4 h-4 mr-2" />
                {allPermissionsGranted ? t('consent.continueToApp') : t('consent.continueAnyway')}
              </Button>
            </div>

            <div className="text-center text-xs text-slate-500">
              <p>{t('consent.agreeToTerms')}</p>
            </div>
          </CardContent>
        </Card>
      </div>
    </div>
  )
}


function PermissionItem({
  icon,
  title,
  description,
  permissionGranted,
  serviceEnabled,
  isCurrentStep,
  isLoading
}: {
  icon: React.ReactNode
  title: string
  description: string
  permissionGranted: boolean
  serviceEnabled: boolean
  isCurrentStep: boolean
  isLoading: boolean
}) {
  const { t } = useI18n()
  const isFullyGranted = permissionGranted && serviceEnabled
  const isPartiallyGranted = permissionGranted && !serviceEnabled

  return (
    <div className={`flex items-start gap-3 p-4 rounded-lg border bg-slate-950/50 ${
      isCurrentStep ? 'border-cyan-500 ring-1 ring-cyan-500/50' : 'border-slate-800'
    }`}>
      <div className={`mt-0.5 ${
        isFullyGranted ? 'text-emerald-500' : 
        isPartiallyGranted ? 'text-yellow-500' : 
        isCurrentStep ? 'text-cyan-500' : 'text-slate-500'
      }`}>
        {isLoading ? (
          <Loader2 className="w-5 h-5 animate-spin" />
        ) : isFullyGranted ? (
          <CheckCircle2 className="w-5 h-5" />
        ) : (
          icon
        )}
      </div>
      <div className="flex-1 space-y-1">
        <h4 className="text-white font-medium flex items-center gap-2">
          {title}
          {isCurrentStep && isLoading && (
            <span className="text-xs text-cyan-400">{t('consent.requesting')}</span>
          )}
        </h4>
        <p className="text-sm text-slate-400">{description}</p>
      </div>
      <div className="flex flex-col items-end gap-1">
        {isFullyGranted && (
          <div className="flex items-center gap-1 text-emerald-500 text-sm">
            <CheckCircle2 className="w-4 h-4" />
            {t('consent.granted')}
          </div>
        )}
        {isPartiallyGranted && (
          <div className="flex items-center gap-1 text-yellow-500 text-xs">
            {t('consent.serviceOff')}
          </div>
        )}
      </div>
    </div>
  )
}
