'use client'

import { useState, useEffect } from 'react'
import { Camera, Radio, Eye, Scan, AlertTriangle } from 'lucide-react'
import { Button } from '@/components/ui/button'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Badge } from '@/components/ui/badge'
import { useRouter } from 'next/navigation'
import { toast } from 'sonner'
import { useI18n } from '@/lib/i18n'

export default function CameraDetectorComponent() {
  const router = useRouter()
  const { t } = useI18n()
  const [cameraPermission, setCameraPermission] = useState<'granted' | 'denied' | 'prompt'>('prompt')
  const [isCheckingPermission, setIsCheckingPermission] = useState(true)

  useEffect(() => {
    checkCameraPermission()
  }, [])

  const checkCameraPermission = async () => {
    try {
      const result = await navigator.permissions.query({ name: 'camera' as PermissionName })
      setCameraPermission(result.state as 'granted' | 'denied' | 'prompt')
      setIsCheckingPermission(false)
    } catch (error) {
      // Fallback: try to access camera directly
      setIsCheckingPermission(false)
    }
  }

  const handleGrantPermission = async () => {
    try {
      const stream = await navigator.mediaDevices.getUserMedia({ video: true })
      stream.getTracks().forEach(track => track.stop())
      setCameraPermission('granted')
      toast.success(t('common.success'))
    } catch (error) {
      setCameraPermission('denied')
      toast.error(t('common.error'))
    }
  }

  const handleOpenDetector = (type: 'magnetic' | 'infrared' | 'object') => {
    if (type !== 'magnetic' && cameraPermission !== 'granted') {
      toast.error(t('camera.permissionRequired'), {
        description: t('camera.permissionDesc')
      })
      return
    }
    
    // Use Next.js router for proper navigation
    router.push(`/camera-detector/${type}`)
  }

  return (
    <div className="h-full flex flex-col bg-gradient-to-br from-slate-950 via-slate-900 to-slate-950 overflow-y-auto">
      {/* Header */}
      <div className="p-4 border-b border-emerald-500/20 bg-slate-900/50 backdrop-blur-sm">
        <div className="flex items-center gap-3">
          <div className="p-2 rounded-lg bg-emerald-500/20">
            <Camera className="w-6 h-6 text-emerald-400" />
          </div>
          <div>
            <h2 className="text-xl font-bold text-white">{t('camera.title')}</h2>
            <p className="text-sm text-slate-400">{t('camera.subtitle')}</p>
          </div>
        </div>
      </div>

      <div className="flex-1 p-4 space-y-4">
        {/* Camera Permission Card */}
        {cameraPermission !== 'granted' && (
          <Card className="bg-slate-800/50 border-emerald-500/20">
            <CardHeader>
              <div className="flex items-center gap-3">
                <div className="p-3 bg-emerald-500/20 rounded-lg">
                  <Camera className="w-6 h-6 text-emerald-400" />
                </div>
                <div>
                  <CardTitle className="text-white">{t('camera.permissionTitle')}</CardTitle>
                  <p className="text-sm text-slate-400 mt-1">{t('camera.permissionRequired')}</p>
                </div>
              </div>
            </CardHeader>
            <CardContent className="space-y-3">
              <p className="text-sm text-slate-300">
                {t('camera.permissionDesc')}
              </p>
              <Button
                onClick={handleGrantPermission}
                className="w-full bg-emerald-500 hover:bg-emerald-600 text-white"
                disabled={isCheckingPermission}
              >
                {t('camera.grantPermission')}
              </Button>
            </CardContent>
          </Card>
        )}

        {/* Detection Methods */}
        <div className="grid gap-4">
          {/* Magnetic Field Detector */}
          <Card className="bg-slate-800/50 border-emerald-500/20 hover:border-emerald-500/40 transition-all">
            <CardContent className="p-4">
              <div className="flex items-start gap-4">
                <div className="p-3 bg-emerald-500/20 rounded-lg flex-shrink-0">
                  <Radio className="w-8 h-8 text-emerald-400" />
                </div>
                <div className="flex-1">
                  <div className="flex items-center gap-2 mb-1">
                    <h3 className="font-semibold text-white text-lg">{t('camera.magneticField')}</h3>
                  </div>
                  <p className="text-sm text-slate-400 mb-1">{t('camera.detectWired')}</p>
                  <p className="text-xs text-slate-500 mb-3">
                    {t('camera.magneticDesc')}
                  </p>
                  <Button
                    onClick={() => handleOpenDetector('magnetic')}
                    className="w-full bg-emerald-500 hover:bg-emerald-600 text-white"
                  >
                    {t('camera.openDetector')}
                  </Button>
                </div>
              </div>
            </CardContent>
          </Card>

          {/* Infrared Camera Detector */}
          <Card className="bg-slate-800/50 border-emerald-500/20 hover:border-emerald-500/40 transition-all">
            <CardContent className="p-4">
              <div className="flex items-start gap-4">
                <div className="p-3 bg-emerald-500/20 rounded-lg flex-shrink-0">
                  <Eye className="w-8 h-8 text-emerald-400" />
                </div>
                <div className="flex-1">
                  <div className="flex items-center gap-2 mb-1">
                    <h3 className="font-semibold text-white text-lg">{t('camera.infrared')}</h3>
                    {cameraPermission === 'granted' && (
                      <Badge className="bg-emerald-500/20 text-emerald-400 border-emerald-500/30">
                        {t('camera.ready')}
                      </Badge>
                    )}
                  </div>
                  <p className="text-sm text-slate-400 mb-1">{t('camera.findIR')}</p>
                  <p className="text-xs text-slate-500 mb-3">
                    {t('camera.infraredDesc')}
                  </p>
                  <Button
                    onClick={() => handleOpenDetector('infrared')}
                    className="w-full bg-emerald-500 hover:bg-emerald-600 text-white"
                    disabled={cameraPermission !== 'granted'}
                  >
                    {t('camera.openDetector')}
                  </Button>
                </div>
              </div>
            </CardContent>
          </Card>

          {/* Object Detector */}
          <Card className="bg-slate-800/50 border-emerald-500/20 hover:border-emerald-500/40 transition-all">
            <CardContent className="p-4">
              <div className="flex items-start gap-4">
                <div className="p-3 bg-emerald-500/20 rounded-lg flex-shrink-0">
                  <Scan className="w-8 h-8 text-emerald-400" />
                </div>
                <div className="flex-1">
                  <div className="flex items-center gap-2 mb-1">
                    <h3 className="font-semibold text-white text-lg">{t('camera.objectDetector')}</h3>
                    {cameraPermission === 'granted' && (
                      <Badge className="bg-emerald-500/20 text-emerald-400 border-emerald-500/30">
                        {t('camera.ready')}
                      </Badge>
                    )}
                  </div>
                  <p className="text-sm text-slate-400 mb-1">{t('camera.aiPowered')}</p>
                  <p className="text-xs text-slate-500 mb-3">
                    {t('camera.objectDesc')}
                  </p>
                  <Button
                    onClick={() => handleOpenDetector('object')}
                    className="w-full bg-emerald-500 hover:bg-emerald-600 text-white"
                    disabled={cameraPermission !== 'granted'}
                  >
                    {t('camera.openDetector')}
                  </Button>
                </div>
              </div>
            </CardContent>
          </Card>
        </div>

        {/* Tips Card */}
        <Card className="bg-slate-800/50 border-amber-500/20">
          <CardHeader>
            <div className="flex items-center gap-2">
              <AlertTriangle className="w-5 h-5 text-amber-400" />
              <CardTitle className="text-white">{t('camera.detectionTips')}</CardTitle>
            </div>
          </CardHeader>
          <CardContent>
            <ul className="text-sm text-slate-300 space-y-2">
              <li>• Check smoke detectors and alarm clocks</li>
              <li>• Look for small holes in walls or objects</li>
              <li>• Scan mirrors for two-way glass</li>
              <li>• Turn off lights and use infrared mode</li>
              <li>• Move phone slowly near suspicious objects</li>
            </ul>
          </CardContent>
        </Card>
      </div>
    </div>
  )
}
