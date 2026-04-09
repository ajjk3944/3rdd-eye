'use client'

import { useState, useEffect, useRef } from 'react'
import { Activity, ArrowDown, ArrowUp, AlertCircle, ChevronDown, ChevronUp } from 'lucide-react'
import { getNetworkScanner, isCapacitor, type NetworkSpeed, type DataUsage, type AppUsage } from '@/lib/native-plugins'
import { toast } from 'sonner'
import { useI18n } from '@/lib/i18n'

export function NetworkUsagePanel() {
  const { t } = useI18n();
  const [isExpanded, setIsExpanded] = useState(false)
  const [hasPermission, setHasPermission] = useState(false)
  const [checkingPermission, setCheckingPermission] = useState(true)
  const [speed, setSpeed] = useState<NetworkSpeed | null>(null)
  const [usage, setUsage] = useState<DataUsage | null>(null)
  const [apps, setApps] = useState<AppUsage[]>([])
  const [period, setPeriod] = useState<'today' | 'week' | 'month'>('today')
  const [showAllApps, setShowAllApps] = useState(false)
  const [loading, setLoading] = useState(false)
  
  const speedIntervalRef = useRef<NodeJS.Timeout | null>(null)

  // Format bytes to human-readable
  const formatBytes = (bytes: number): string => {
    if (bytes < 1024) return bytes + ' B'
    if (bytes < 1024 * 1024) return (bytes / 1024).toFixed(1) + ' KB'
    if (bytes < 1024 * 1024 * 1024) return (bytes / (1024 * 1024)).toFixed(1) + ' MB'
    return (bytes / (1024 * 1024 * 1024)).toFixed(2) + ' GB'
  }

  // Format speed (bytes per second)
  const formatSpeed = (bytesPerSec: number): string => {
    if (bytesPerSec < 1024) return bytesPerSec.toFixed(0) + ' B/s'
    if (bytesPerSec < 1024 * 1024) return (bytesPerSec / 1024).toFixed(1) + ' KB/s'
    return (bytesPerSec / (1024 * 1024)).toFixed(1) + ' MB/s'
  }

  // Check permission on mount
  useEffect(() => {
    const checkPermission = async () => {
      if (!isCapacitor) {
        setCheckingPermission(false)
        return
      }

      const scanner = getNetworkScanner()
      if (!scanner) {
        setCheckingPermission(false)
        return
      }

      try {
        const result = await scanner.hasUsagePermission()
        setHasPermission(result.granted)
      } catch (error) {
        console.error('Error checking permission:', error)
      } finally {
        setCheckingPermission(false)
      }
    }

    checkPermission()
  }, [])

  // Start/stop speed monitoring when expanded
  useEffect(() => {
    if (!isExpanded || !isCapacitor) {
      if (speedIntervalRef.current) {
        clearInterval(speedIntervalRef.current)
        speedIntervalRef.current = null
      }
      return
    }

    const scanner = getNetworkScanner()
    if (!scanner) return

    // Initial fetch
    const fetchSpeed = async () => {
      try {
        const result = await scanner.getNetworkSpeed()
        setSpeed(result)
      } catch (error) {
        console.error('Error fetching speed:', error)
      }
    }

    fetchSpeed()

    // Update every 2 seconds
    speedIntervalRef.current = setInterval(fetchSpeed, 2000)

    return () => {
      if (speedIntervalRef.current) {
        clearInterval(speedIntervalRef.current)
        speedIntervalRef.current = null
      }
    }
  }, [isExpanded])

  // Fetch usage data when expanded or period changes
  useEffect(() => {
    if (!isExpanded || !isCapacitor || !hasPermission) return

    const fetchUsageData = async () => {
      const scanner = getNetworkScanner()
      if (!scanner) return

      setLoading(true)
      try {
        // Fetch total usage
        const usageResult = await scanner.getDataUsage({ period })
        if (!usageResult.needsPermission) {
          setUsage(usageResult)
        }

        // Fetch per-app usage
        const appsResult = await scanner.getPerAppUsage({ period })
        if (!appsResult.needsPermission) {
          setApps(appsResult.apps)
        }
      } catch (error) {
        console.error('Error fetching usage data:', error)
        toast.error('Failed to fetch usage data')
      } finally {
        setLoading(false)
      }
    }

    fetchUsageData()
  }, [isExpanded, period, hasPermission])

  // Request permission
  const handleRequestPermission = async () => {
    if (!isCapacitor) return

    const scanner = getNetworkScanner()
    if (!scanner) return

    try {
      await scanner.requestUsagePermission()
      toast.info(t('networkUsage.grantUsageAccess'))
      
      // Re-check permission after a delay
      setTimeout(async () => {
        const result = await scanner.hasUsagePermission()
        setHasPermission(result.granted)
        if (result.granted) {
          toast.success(t('networkUsage.permissionGranted'))
        }
      }, 2000)
    } catch (error) {
      console.error('Error requesting permission:', error)
      toast.error(t('networkUsage.failedToOpenSettings'))
    }
  }

  if (!isCapacitor) {
    return null
  }

  const displayedApps = showAllApps ? apps : apps.slice(0, 5)
  const maxBytes = apps.length > 0 ? apps[0].totalBytes : 1

  return (
    <div className="bg-[#0d120d] border border-cyan-900/30 rounded-xl overflow-hidden">
      {/* Header */}
      <button
        onClick={() => setIsExpanded(!isExpanded)}
        className="w-full px-4 py-3 flex items-center justify-between hover:bg-cyan-900/10 transition-colors"
      >
        <div className="flex items-center gap-3">
          <Activity className="w-5 h-5 text-cyan-400" />
          <span className="text-white font-medium">{t('networkUsage.title')}</span>
        </div>
        {isExpanded ? (
          <ChevronUp className="w-5 h-5 text-gray-400" />
        ) : (
          <ChevronDown className="w-5 h-5 text-gray-400" />
        )}
      </button>

      {/* Content */}
      {isExpanded && (
        <div className="px-4 pb-4 space-y-4">
          {/* Permission Banner */}
          {!checkingPermission && !hasPermission && (
            <div className="bg-amber-500/10 border border-amber-500/30 rounded-lg p-3">
              <div className="flex items-start gap-2">
                <AlertCircle className="w-5 h-5 text-amber-400 flex-shrink-0 mt-0.5" />
                <div className="flex-1">
                  <p className="text-sm text-amber-400 font-medium mb-1">
                    {t('networkUsage.permissionRequired')}
                  </p>
                  <p className="text-xs text-amber-300/80 mb-2">
                    {t('networkUsage.permissionDesc')}
                  </p>
                  <button
                    onClick={handleRequestPermission}
                    className="text-xs bg-amber-500/20 hover:bg-amber-500/30 text-amber-300 px-3 py-1.5 rounded-md transition-colors"
                  >
                    {t('networkUsage.grantPermission')}
                  </button>
                </div>
              </div>
            </div>
          )}

          {/* Real-time Speed */}
          <div>
            <h3 className="text-sm text-gray-400 mb-2">{t('networkUsage.realtimeSpeed')}</h3>
            <div className="grid grid-cols-2 gap-3">
              {/* Download Speed */}
              <div className="bg-cyan-900/10 border border-cyan-900/30 rounded-lg p-3">
                <div className="flex items-center gap-2 mb-1">
                  <ArrowDown className="w-4 h-4 text-green-400" />
                  <span className="text-xs text-gray-400">{t('networkUsage.download')}</span>
                </div>
                <div className="text-lg font-semibold text-white">
                  {speed ? formatSpeed(speed.downloadSpeed) : '0 B/s'}
                </div>
              </div>

              {/* Upload Speed */}
              <div className="bg-cyan-900/10 border border-cyan-900/30 rounded-lg p-3">
                <div className="flex items-center gap-2 mb-1">
                  <ArrowUp className="w-4 h-4 text-cyan-400" />
                  <span className="text-xs text-gray-400">{t('networkUsage.upload')}</span>
                </div>
                <div className="text-lg font-semibold text-white">
                  {speed ? formatSpeed(speed.uploadSpeed) : '0 B/s'}
                </div>
              </div>
            </div>
          </div>

          {/* Usage Summary (only if permission granted) */}
          {hasPermission && usage && (
            <div>
              <h3 className="text-sm text-gray-400 mb-2">
                {period === 'today' ? t('networkUsage.todayUsage') : period === 'week' ? t('networkUsage.thisWeek') : t('networkUsage.thisMonth')}
              </h3>
              <div className="bg-cyan-900/10 border border-cyan-900/30 rounded-lg p-3 space-y-2">
                <div className="flex justify-between text-sm">
                  <span className="text-gray-400">{t('networkUsage.wifi')}</span>
                  <span className="text-white">
                    {formatBytes(usage.wifiRx)} {t('networkUsage.down')} | {formatBytes(usage.wifiTx)} {t('networkUsage.up')}
                  </span>
                </div>
                <div className="flex justify-between text-sm">
                  <span className="text-gray-400">{t('networkUsage.mobile')}</span>
                  <span className="text-white">
                    {formatBytes(usage.mobileRx)} {t('networkUsage.down')} | {formatBytes(usage.mobileTx)} {t('networkUsage.up')}
                  </span>
                </div>
                <div className="border-t border-cyan-900/30 pt-2 flex justify-between text-sm font-medium">
                  <span className="text-gray-300">{t('networkUsage.total')}</span>
                  <span className="text-cyan-400">{formatBytes(usage.grandTotal)}</span>
                </div>
              </div>
            </div>
          )}

          {/* Period Selector */}
          {hasPermission && (
            <div className="flex gap-2">
              <button
                onClick={() => setPeriod('today')}
                className={`flex-1 px-3 py-2 rounded-lg text-sm font-medium transition-colors ${
                  period === 'today'
                    ? 'bg-cyan-600/20 text-cyan-400 border border-cyan-400'
                    : 'bg-transparent text-gray-400 border border-cyan-900/30 hover:bg-cyan-900/10'
                }`}
              >
                {t('networkUsage.today')}
              </button>
              <button
                onClick={() => setPeriod('week')}
                className={`flex-1 px-3 py-2 rounded-lg text-sm font-medium transition-colors ${
                  period === 'week'
                    ? 'bg-cyan-600/20 text-cyan-400 border border-cyan-400'
                    : 'bg-transparent text-gray-400 border border-cyan-900/30 hover:bg-cyan-900/10'
                }`}
              >
                {t('networkUsage.thisWeek')}
              </button>
              <button
                onClick={() => setPeriod('month')}
                className={`flex-1 px-3 py-2 rounded-lg text-sm font-medium transition-colors ${
                  period === 'month'
                    ? 'bg-cyan-600/20 text-cyan-400 border border-cyan-400'
                    : 'bg-transparent text-gray-400 border border-cyan-900/30 hover:bg-cyan-900/10'
                }`}
              >
                {t('networkUsage.thisMonth')}
              </button>
            </div>
          )}

          {/* Top Apps */}
          {hasPermission && apps.length > 0 && (
            <div>
              <h3 className="text-sm text-gray-400 mb-2">{t('networkUsage.topApps')}</h3>
              <div className="space-y-2">
                {displayedApps.map((app, index) => {
                  const percentage = (app.totalBytes / maxBytes) * 100
                  return (
                    <div key={app.uid} className="space-y-1">
                      <div className="flex items-center justify-between text-sm">
                        <div className="flex items-center gap-2">
                          <span className="text-gray-500 font-mono text-xs w-4">
                            {index + 1}.
                          </span>
                          <span className="text-white truncate">{app.appName}</span>
                        </div>
                        <span className="text-cyan-400 font-medium">
                          {formatBytes(app.totalBytes)}
                        </span>
                      </div>
                      <div className="ml-6 h-1.5 bg-cyan-400/20 rounded-full overflow-hidden">
                        <div
                          className="h-full bg-cyan-400 rounded-full transition-all duration-300"
                          style={{ width: `${percentage}%` }}
                        />
                      </div>
                    </div>
                  )
                })}

                {apps.length > 5 && (
                  <button
                    onClick={() => setShowAllApps(!showAllApps)}
                    className="w-full text-center text-sm text-cyan-400 hover:text-cyan-300 py-2 transition-colors"
                  >
                    {showAllApps ? t('networkUsage.showLess') : t('networkUsage.showAll', { count: apps.length })}
                  </button>
                )}
              </div>
            </div>
          )}

          {/* Loading State */}
          {loading && (
            <div className="text-center py-4">
              <div className="inline-block w-6 h-6 border-2 border-cyan-400 border-t-transparent rounded-full animate-spin" />
            </div>
          )}
        </div>
      )}
    </div>
  )
}
