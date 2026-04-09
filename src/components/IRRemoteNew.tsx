'use client'

import { useState, useEffect } from 'react'
import { Zap, AlertCircle, Loader2, Download, ExternalLink, Play } from 'lucide-react'
import { useI18n } from '@/lib/i18n'

// Safe imports with error handling
let getIRBlaster: any = null

try {
  const irBlaster = require('@/lib/ir-blaster')
  getIRBlaster = irBlaster.getIRBlaster
} catch (e) {
  console.error('Failed to load IR blaster:', e)
}

export default function IRRemoteNew() {
  const { t } = useI18n()
  const [hasIR, setHasIR] = useState(false)
  const [checking, setChecking] = useState(true)
  const [miRemoteInstalled, setMiRemoteInstalled] = useState(false)
  const [error, setError] = useState<string | null>(null)

  useEffect(() => {
    checkIRHardware()
    checkMiRemoteInstalled()
  }, [])

  async function checkIRHardware() {
    try {
      setChecking(true)
      
      if (!getIRBlaster) {
        setHasIR(false)
        setChecking(false)
        return
      }

      const irBlaster = getIRBlaster()
      if (!irBlaster) {
        setHasIR(false)
        setChecking(false)
        return
      }

      try {
        const result = await irBlaster.hasIrEmitter()
        setHasIR(result?.hasIrEmitter || false)
      } catch (e) {
        console.error('Error checking IR emitter:', e)
        setHasIR(false)
      }
    } catch (e) {
      console.error('Error in checkIRHardware:', e)
      setHasIR(false)
    } finally {
      setChecking(false)
    }
  }

  async function checkMiRemoteInstalled() {
    try {
      if (typeof window !== 'undefined' && (window as any).Capacitor) {
        const { AppLauncher } = (window as any).Capacitor.Plugins
        if (AppLauncher && AppLauncher.findMiRemote) {
          // Use the new findMiRemote method that checks all possible packages
          const result = await AppLauncher.findMiRemote()
          
          if (result?.found) {
            setMiRemoteInstalled(true)
            // Store the working package name
            ;(window as any).miRemotePackage = result.packageName
            console.log('Found Mi Remote:', result.packageName)
          } else {
            setMiRemoteInstalled(false)
          }
        }
      }
    } catch (e) {
      console.error('Error checking Mi Remote:', e)
      setMiRemoteInstalled(false)
    }
  }

  async function handleOpenMiRemote() {
    try {
      setError(null)
      
      if (typeof window !== 'undefined' && (window as any).Capacitor) {
        const { AppLauncher } = (window as any).Capacitor.Plugins
        if (AppLauncher) {
          // Use the stored package name or try all
          const packageName = (window as any).miRemotePackage || 'com.duokan.phone.remotecontroller'
          
          const result = await AppLauncher.openApp({ packageName })
          
          if (!result.success) {
            // Try other package names
            const possiblePackages = [
              'com.duokan.phone.remotecontroller',
              'com.xiaomi.mitv.phone.remotecontroller',
              'com.xiaomi.smarthome',
              'com.mi.android.globalminusscreen'
            ]
            
            let opened = false
            for (const pkg of possiblePackages) {
              try {
                const tryResult = await AppLauncher.openApp({ packageName: pkg })
                if (tryResult.success) {
                  opened = true
                  ;(window as any).miRemotePackage = pkg
                  break
                }
              } catch (e) {
                console.log('Failed to open with package:', pkg)
              }
            }
            
            if (!opened) {
              setError('Mi Remote is not installed on your device')
              setMiRemoteInstalled(false)
            }
          }
        }
      }
    } catch (e) {
      console.error('Error opening Mi Remote:', e)
      setError('Mi Remote is not installed on your device')
      setMiRemoteInstalled(false)
    }
  }

  function handleDownloadMiRemote() {
    window.open('https://play.google.com/store/apps/details?id=com.duokan.phone.remotecontroller&pcampaignid=web_share', '_blank')
  }

  // Loading state
  if (checking) {
    return (
      <div className="flex items-center justify-center min-h-screen bg-gradient-to-br from-gray-900 via-black to-gray-900">
        <div className="text-center">
          <Loader2 className="w-16 h-16 mx-auto mb-4 text-emerald-400 animate-spin" />
          <p className="text-gray-400 text-lg">{t('ir.checking')}</p>
        </div>
      </div>
    )
  }

  return (
    <div className="min-h-screen bg-gradient-to-br from-gray-900 via-black to-gray-900 text-white">
      {/* Header */}
      <div className="bg-gradient-to-r from-emerald-500/10 to-cyan-500/10 border-b border-emerald-500/20 backdrop-blur-sm">
        <div className="p-4">
          <div className="flex items-center justify-between mb-4">
            <div>
              <h1 className="text-2xl font-bold bg-gradient-to-r from-emerald-400 to-cyan-400 bg-clip-text text-transparent">
                {t('ir.title')}
              </h1>
              <p className="text-sm text-gray-400">{t('ir.subtitle')}</p>
            </div>
            <div className="flex items-center gap-2">
              {hasIR ? (
                <>
                  <Zap className="w-5 h-5 text-emerald-400" />
                  <span className="text-sm text-emerald-400">{t('ir.available')}</span>
                </>
              ) : (
                <>
                  <AlertCircle className="w-5 h-5 text-red-400" />
                  <span className="text-sm text-red-400">{t('ir.notAvailable')}</span>
                </>
              )}
            </div>
          </div>
        </div>
      </div>

      {/* Content */}
      <div className="p-6">
        <div className="max-w-2xl mx-auto">
          {/* IR Status Card */}
          <div className={`rounded-2xl p-6 border backdrop-blur-sm mb-6 ${
            hasIR 
              ? 'bg-emerald-500/10 border-emerald-500/30' 
              : 'bg-red-500/10 border-red-500/30'
          }`}>
            <div className="flex items-start gap-4">
              {hasIR ? (
                <div className="w-12 h-12 rounded-full bg-emerald-500/20 flex items-center justify-center flex-shrink-0">
                  <Zap className="w-6 h-6 text-emerald-400" />
                </div>
              ) : (
                <div className="w-12 h-12 rounded-full bg-red-500/20 flex items-center justify-center flex-shrink-0">
                  <AlertCircle className="w-6 h-6 text-red-400" />
                </div>
              )}
              <div className="flex-1">
                <h2 className="text-xl font-bold text-white mb-2">
                  {hasIR ? t('ir.available') : t('ir.notAvailable')}
                </h2>
                <p className="text-gray-400 text-sm leading-relaxed">
                  {hasIR 
                    ? 'Your device has an infrared blaster. You can use Mi Remote app to control TVs, ACs, and other IR devices.'
                    : 'Your device does not have an infrared blaster. IR remote control is not supported on this device.'
                  }
                </p>
              </div>
            </div>
          </div>

          {/* Mi Remote Card - Only show if IR is available */}
          {hasIR && (
            <div className="bg-gray-800/50 backdrop-blur-sm rounded-2xl p-6 border border-gray-700">
              <div className="flex items-start gap-4 mb-6">
                <div className="w-16 h-16 rounded-xl bg-gradient-to-br from-orange-500 to-red-500 flex items-center justify-center flex-shrink-0">
                  <Download className="w-8 h-8 text-white" />
                </div>
                <div className="flex-1">
                  <h3 className="text-xl font-bold text-white mb-2">Mi Remote</h3>
                  <p className="text-gray-400 text-sm leading-relaxed">
                    The best IR remote app with support for thousands of devices. 
                    Tested and optimized by Xiaomi.
                  </p>
                </div>
              </div>

              <div className="space-y-3 mb-6">
                <div className="flex items-center gap-3 text-sm text-gray-300">
                  <div className="w-2 h-2 rounded-full bg-emerald-400"></div>
                  <span>1000+ supported devices (TVs, ACs, Fans, etc.)</span>
                </div>
                <div className="flex items-center gap-3 text-sm text-gray-300">
                  <div className="w-2 h-2 rounded-full bg-emerald-400"></div>
                  <span>Pre-tested IR codes that actually work</span>
                </div>
                <div className="flex items-center gap-3 text-sm text-gray-300">
                  <div className="w-2 h-2 rounded-full bg-emerald-400"></div>
                  <span>Easy setup and user-friendly interface</span>
                </div>
              </div>

              {/* Error Message */}
              {error && (
                <div className="mb-4 p-3 bg-red-500/10 border border-red-500/30 rounded-lg">
                  <p className="text-red-400 text-sm">{error}</p>
                </div>
              )}

              {/* Buttons */}
              <div className="space-y-3">
                <button
                  onClick={handleOpenMiRemote}
                  className="w-full flex items-center justify-center gap-3 px-6 py-4 bg-gradient-to-r from-emerald-500 to-cyan-500 hover:from-emerald-600 hover:to-cyan-600 text-white rounded-xl font-semibold transition-all shadow-lg shadow-emerald-500/30 hover:shadow-emerald-500/50"
                >
                  <Play className="w-5 h-5" />
                  {t('ir.openMiRemote')}
                </button>

                <button
                  onClick={handleDownloadMiRemote}
                  className="w-full flex items-center justify-center gap-3 px-6 py-3 bg-gray-700/50 hover:bg-gray-600/50 text-gray-300 hover:text-white rounded-xl font-medium transition-all border border-gray-600"
                >
                  <Download className="w-4 h-4" />
                  {t('ir.downloadMiRemote')}
                  <ExternalLink className="w-4 h-4" />
                </button>
              </div>

              <p className="text-xs text-gray-500 text-center mt-4">
                If Mi Remote doesn't open, download it from Play Store
              </p>
            </div>
          )}

          {/* No IR - Info Card */}
          {!hasIR && (
            <div className="bg-gray-800/50 backdrop-blur-sm rounded-2xl p-6 border border-gray-700">
              <h3 className="text-lg font-bold text-white mb-3">Why doesn't my device have IR?</h3>
              <p className="text-gray-400 text-sm leading-relaxed mb-4">
                Most modern smartphones have removed the IR blaster to reduce costs and make devices thinner. 
                Only some Xiaomi, Huawei, and Samsung models still include this feature.
              </p>
              <div className="bg-gray-900/50 rounded-lg p-4 border border-gray-700">
                <p className="text-xs text-gray-500">
                  <strong className="text-gray-400">Tip:</strong> You can use WiFi-based smart home devices 
                  or purchase an external IR blaster that connects via Bluetooth or WiFi.
                </p>
              </div>
            </div>
          )}
        </div>
      </div>
    </div>
  )
}
