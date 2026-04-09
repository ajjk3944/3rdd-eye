'use client'

import { useState, useEffect } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { ScrollArea } from '@/components/ui/scroll-area'
import { Badge } from '@/components/ui/badge'
import {
  Wifi,
  Lock,
  Eye,
  EyeOff,
  RefreshCw,
  WifiOff,
  Shield,
  Database,
  Smartphone,
  Copy,
  Check,
  Plus,
  Save
} from 'lucide-react'
import { toast } from 'sonner'
import { isCapacitor } from '@/lib/native-plugins'
import { AddNetworkDialog } from '@/components/AddNetworkDialog'
import { useI18n } from '@/lib/i18n'

interface SavedWiFiPassword {
  ssid: string
  password: string
  bssid?: string
  source: 'system' | 'app_database'
  savedAt?: number
  lastConnected?: number
}

interface SavedWiFiResult {
  networks: SavedWiFiPassword[]
  isRooted: boolean
  count: number
  source: 'root' | 'database'
  currentWifi?: {
    ssid: string
    bssid: string
    rssi: number
    linkSpeed: number
    password?: string
  }
  message?: string
}

export function SavedWiFiPasswordsView() {
  const { t } = useI18n();
  const [savedWiFi, setSavedWiFi] = useState<SavedWiFiPassword[]>([])
  const [loading, setLoading] = useState(true)
  const [refreshing, setRefreshing] = useState(false)
  const [isRooted, setIsRooted] = useState(false)
  const [source, setSource] = useState<'root' | 'database'>('database')
  const [currentWifi, setCurrentWifi] = useState<any>(null)
  const [message, setMessage] = useState<string>('')
  const [visiblePasswords, setVisiblePasswords] = useState<Set<string>>(new Set())
  const [copiedSSID, setCopiedSSID] = useState<string | null>(null)
  const [showAddDialog, setShowAddDialog] = useState(false)
  const [showSavedList, setShowSavedList] = useState(false)
  const [isAuthenticated, setIsAuthenticated] = useState(false)

  // Check authentication status
  useEffect(() => {
    // Check if user is logged in
    const checkAuth = async () => {
      try {
        const response = await fetch('/api/auth/status')
        const data = await response.json()
        setIsAuthenticated(data.isAuthenticated || false)
        console.log('[SavedWiFi] Auth status:', data.isAuthenticated)
      } catch (error) {
        // For testing: assume authenticated if API fails
        console.log('[SavedWiFi] Auth check failed, assuming authenticated for testing')
        setIsAuthenticated(true)
      }
    }
    checkAuth()
  }, [])

  // Load saved WiFi passwords from native plugin
  const loadSavedWiFi = async (silent = false) => {
    if (!isCapacitor) {
      setMessage(t('savedWifi.featureOnlyAndroid'))
      setLoading(false)
      return
    }

    if (!silent) setLoading(true)

    try {
      console.log('[SavedWiFi] Loading saved WiFi...')
      
      // @ts-ignore - SavedWifi plugin
      const SavedWifi = (window as any).SavedWifi
      
      if (!SavedWifi) {
        console.log('[SavedWiFi] Plugin not available, using API fallback')
        // Fallback to API
        const response = await fetch('/api/saved-wifi')
        const data = await response.json()
        
        if (data.success && Array.isArray(data.networks)) {
          console.log('[SavedWiFi] API returned:', data.networks.length, 'networks')
          setSavedWiFi(data.networks)
          setSource('database')
          setMessage(data.networks.length > 0 ? 'Loaded from database' : 'No saved networks found')
          
          if (!silent && data.networks.length > 0) {
            toast.success(`Loaded ${data.networks.length} network${data.networks.length > 1 ? 's' : ''}`)
          }
        } else {
          setSavedWiFi([])
          setMessage('No saved networks found')
        }
        
        if (!silent) setLoading(false)
        return
      }

      const result: SavedWiFiResult = await SavedWifi.getSavedWifiPasswords()
      
      console.log('[SavedWiFi] Plugin result:', result)
      
      setSavedWiFi(result.networks || [])
      setIsRooted(result.isRooted || false)
      setSource(result.source || 'database')
      setCurrentWifi(result.currentWifi || null)
      setMessage(result.message || '')
      
      if (!silent && result.networks.length > 0) {
        toast.success(`Loaded ${result.networks.length} network${result.networks.length > 1 ? 's' : ''}`)
      }
    } catch (error: any) {
      console.error('[SavedWiFi] Error loading:', error)
      
      // Try API fallback on error
      try {
        console.log('[SavedWiFi] Trying API fallback after error...')
        const response = await fetch('/api/saved-wifi')
        const data = await response.json()
        
        if (data.success && Array.isArray(data.networks)) {
          console.log('[SavedWiFi] API fallback success:', data.networks.length, 'networks')
          setSavedWiFi(data.networks)
          setSource('database')
          setMessage('Loaded from database')
        } else {
          setSavedWiFi([])
          setMessage('No saved networks found')
        }
      } catch (apiError) {
        console.error('[SavedWiFi] API fallback failed:', apiError)
        setMessage(error.message || 'Failed to load')
        setSavedWiFi([])
        if (!silent) toast.error('Failed to load saved WiFi')
      }
    } finally {
      if (!silent) setLoading(false)
    }
  }

  // Initial load
  useEffect(() => {
    loadSavedWiFi()
  }, [])

  // Manual refresh
  const handleRefresh = async () => {
    setRefreshing(true)
    await loadSavedWiFi()
    setRefreshing(false)
  }

  // Toggle password visibility
  const togglePasswordVisibility = (ssid: string) => {
    setVisiblePasswords(prev => {
      const newSet = new Set(prev)
      if (newSet.has(ssid)) {
        newSet.delete(ssid)
      } else {
        newSet.add(ssid)
      }
      return newSet
    })
  }

  // Copy password to clipboard
  const copyPassword = async (ssid: string, password: string) => {
    try {
      await navigator.clipboard.writeText(password)
      setCopiedSSID(ssid)
      toast.success(t('savedWifi.passwordCopied', { ssid }))
      setTimeout(() => setCopiedSSID(null), 2000)
    } catch (error) {
      toast.error(t('savedWifi.failedToCopy'))
    }
  }

  // Handle manual add
  const handleManualAdd = async (ssid: string, password: string, security: string) => {
    if (!isAuthenticated) {
      toast.error(t('savedWifi.signUpToAdd'))
      return
    }

    try {
      const response = await fetch('/api/saved-wifi', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ ssid, password, security })
      })
      
      const data = await response.json()
      if (data.success) {
        toast.success(t('savedWifi.addedNetwork', { ssid }))
        await loadSavedWiFi(true)
        setShowAddDialog(false)
      }
    } catch (error) {
      toast.error(t('savedWifi.failedToAdd'))
    }
  }

  // Format timestamp
  const formatTime = (timestamp?: number) => {
    if (!timestamp) return 'Unknown'
    const date = new Date(timestamp)
    return date.toLocaleString()
  }

  return (
    <>
    <Card className="bg-[#0d120d] border-cyan-900/30">
      <CardHeader>
        <div className="flex items-center justify-between">
          <CardTitle className="flex items-center gap-2 text-white">
            <Lock className="w-5 h-5 text-cyan-400" />
            {t('savedWifi.title')}
          </CardTitle>
          <Button
            onClick={handleRefresh}
            disabled={refreshing || loading}
            size="sm"
            variant="outline"
            className="border-cyan-900/30 text-cyan-400 hover:bg-cyan-900/20"
          >
            <RefreshCw className={`w-4 h-4 ${refreshing ? 'animate-spin' : ''}`} />
          </Button>
        </div>
      </CardHeader>
      
      <CardContent>
        {/* Action Buttons - Moved to CardContent */}
        <div className="flex gap-2 mb-4">
          <Button
            onClick={() => {
              console.log('[SavedWiFi] Add clicked, isAuthenticated:', isAuthenticated)
              if (!isAuthenticated) {
                toast.error(t('savedWifi.signUpToAdd'))
                return
              }
              setShowAddDialog(true)
            }}
            size="sm"
            variant="outline"
            className="flex-1 border-cyan-900/30 text-cyan-400 hover:bg-cyan-900/20"
          >
            <Plus className="w-4 h-4 mr-2" />
            {t('savedWifi.add')}
          </Button>
          <Button
            onClick={() => {
              console.log('[SavedWiFi] Saved clicked, isAuthenticated:', isAuthenticated)
              if (!isAuthenticated) {
                toast.error(t('savedWifi.signUpToView'))
                return
              }
              setShowSavedList(true)
              loadSavedWiFi()
            }}
            size="sm"
            className="flex-1 bg-cyan-600 hover:bg-cyan-700"
          >
            <Save className="w-4 h-4 mr-2" />
            {t('savedWifi.saved')}
          </Button>
        </div>
        {/* Status Banner */}
        <div className="mb-4 space-y-2">
          <div className={`p-3 rounded-lg border ${
            isRooted 
              ? 'bg-green-900/20 border-green-500/30' 
              : 'bg-blue-900/20 border-blue-500/30'
          }`}>
            <div className="flex items-center gap-2 mb-1">
              <Shield className={`w-4 h-4 ${isRooted ? 'text-green-400' : 'text-blue-400'}`} />
              <p className={`text-xs font-medium ${isRooted ? 'text-green-300' : 'text-blue-300'}`}>
                {isRooted ? t('savedWifi.rootDetected') : t('savedWifi.nonRooted')}
              </p>
            </div>
            <p className="text-xs text-gray-400">
              {isRooted 
                ? t('savedWifi.rootDesc')
                : t('savedWifi.nonRootedDesc')}
            </p>
          </div>

          {source === 'root' && (
            <div className="p-3 rounded-lg bg-purple-900/20 border border-purple-500/30">
              <div className="flex items-center gap-2">
                <Database className="w-4 h-4 text-purple-400" />
                <p className="text-xs text-purple-300">
                  {t('savedWifi.sourceSystem')}
                </p>
              </div>
            </div>
          )}

          {source === 'database' && (
            <div className="p-3 rounded-lg bg-cyan-900/20 border border-cyan-500/30">
              <div className="flex items-center gap-2">
                <Smartphone className="w-4 h-4 text-cyan-400" />
                <p className="text-xs text-cyan-300">
                  {t('savedWifi.sourceApp')}
                </p>
              </div>
            </div>
          )}

          {message && (
            <div className="p-3 rounded-lg bg-yellow-900/20 border border-yellow-500/30">
              <p className="text-xs text-yellow-300">
                💡 {message}
              </p>
            </div>
          )}
        </div>

        {/* Current WiFi */}
        {currentWifi && (
          <div className="mb-4 p-3 rounded-lg bg-cyan-900/20 border border-cyan-500/50">
            <div className="flex items-center gap-2 mb-2">
              <Wifi className="w-4 h-4 text-cyan-400" />
              <p className="text-sm font-medium text-cyan-300">{t('savedWifi.currentlyConnected')}</p>
            </div>
            <div className="space-y-1">
              <p className="text-white font-medium">{currentWifi.ssid}</p>
              {currentWifi.password && (
                <div className="flex items-center gap-2">
                  <p className="text-xs text-gray-400">
                    {t('savedWifi.password')} {visiblePasswords.has(currentWifi.ssid) ? currentWifi.password : '••••••••'}
                  </p>
                  <Button
                    onClick={() => togglePasswordVisibility(currentWifi.ssid)}
                    size="sm"
                    variant="ghost"
                    className="h-6 w-6 p-0"
                  >
                    {visiblePasswords.has(currentWifi.ssid) ? (
                      <EyeOff className="w-3 h-3" />
                    ) : (
                      <Eye className="w-3 h-3" />
                    )}
                  </Button>
                </div>
              )}
              <p className="text-xs text-gray-500">
                {t('savedWifi.signal')} {currentWifi.rssi} dBm | {t('savedWifi.speed')} {currentWifi.linkSpeed} Mbps
              </p>
            </div>
          </div>
        )}

        {/* WiFi List - Only show when "Saved" button is clicked and user is authenticated */}
        {!showSavedList ? (
          <div className="text-center py-8 text-gray-500">
            <Lock className="w-12 h-12 mx-auto mb-3 opacity-30" />
            <p className="text-sm mb-2 text-white">{t('savedWifi.clickSaved')}</p>
            <p className="text-xs text-gray-400 mb-3">
              {!isAuthenticated && t('savedWifi.signUpRequired')}
            </p>
            <div className="mt-4 space-y-2 text-left max-w-md mx-auto">
              <p className="text-xs text-gray-400">
                <Plus className="w-4 h-4 inline mr-2" />
                <strong>{t('savedWifi.add')}:</strong> {t('savedWifi.addDesc')}
              </p>
              <p className="text-xs text-gray-400">
                <Save className="w-4 h-4 inline mr-2" />
                <strong>{t('savedWifi.saved')}:</strong> {t('savedWifi.savedDesc')}
              </p>
            </div>
          </div>
        ) : loading ? (
          <div className="text-center py-8 text-gray-500">
            <Wifi className="w-12 h-12 mx-auto mb-3 opacity-30 animate-spin" />
            <p className="text-sm">{t('savedWifi.loading')}</p>
          </div>
        ) : savedWiFi.length === 0 ? (
          <div className="text-center py-8 text-gray-500">
            <WifiOff className="w-12 h-12 mx-auto mb-3 opacity-30" />
            <p className="text-sm mb-2 text-white">{t('savedWifi.noSavedNetworks')}</p>
            <p className="text-xs text-gray-400 mb-3">
              {isRooted 
                ? t('savedWifi.noSystemNetworks')
                : t('savedWifi.useAddButton')}
            </p>
          </div>
        ) : (
          <ScrollArea className="h-[500px]">
            <div className="space-y-2">
              {savedWiFi.map((wifi, index) => {
                const isVisible = visiblePasswords.has(wifi.ssid)
                const isCopied = copiedSSID === wifi.ssid
                
                return (
                  <div
                    key={`${wifi.ssid}-${index}`}
                    className="p-3 rounded-lg border bg-gray-900/30 border-gray-800 hover:bg-gray-800/50 transition-colors"
                  >
                    <div className="flex items-start justify-between mb-2">
                      <div className="flex-1 min-w-0">
                        <div className="flex items-center gap-2 mb-1">
                          <Wifi className="w-4 h-4 text-cyan-400 flex-shrink-0" />
                          <span className="text-white font-medium truncate">
                            {wifi.ssid}
                          </span>
                          <Badge 
                            className={`text-[10px] ${
                              wifi.source === 'system' 
                                ? 'bg-purple-500/20 text-purple-400' 
                                : 'bg-cyan-500/20 text-cyan-400'
                            }`}
                          >
                            {wifi.source === 'system' ? t('savedWifi.system') : t('savedWifi.app')}
                          </Badge>
                        </div>
                        
                        {wifi.bssid && (
                          <p className="text-xs text-gray-500 mb-2">
                            {t('savedWifi.bssid')} {wifi.bssid}
                          </p>
                        )}

                        <div className="flex items-center gap-2 mb-2">
                          <Lock className="w-3 h-3 text-gray-500 flex-shrink-0" />
                          <code className="text-xs text-gray-300 font-mono break-all">
                            {isVisible ? wifi.password : '••••••••••••'}
                          </code>
                        </div>

                        {wifi.savedAt && (
                          <p className="text-xs text-gray-600">
                            {t('savedWifi.savedAt')} {formatTime(wifi.savedAt)}
                          </p>
                        )}
                      </div>

                      <div className="flex flex-col gap-1 ml-2">
                        <Button
                          onClick={() => togglePasswordVisibility(wifi.ssid)}
                          size="sm"
                          variant="ghost"
                          className="h-8 w-8 p-0 text-gray-400 hover:text-cyan-400"
                        >
                          {isVisible ? (
                            <EyeOff className="w-4 h-4" />
                          ) : (
                            <Eye className="w-4 h-4" />
                          )}
                        </Button>
                        <Button
                          onClick={() => copyPassword(wifi.ssid, wifi.password)}
                          size="sm"
                          variant="ghost"
                          className="h-8 w-8 p-0 text-gray-400 hover:text-green-400"
                        >
                          {isCopied ? (
                            <Check className="w-4 h-4 text-green-400" />
                          ) : (
                            <Copy className="w-4 h-4" />
                          )}
                        </Button>
                      </div>
                    </div>
                  </div>
                )
              })}
            </div>
          </ScrollArea>
        )}

        {/* Footer Info */}
        {savedWiFi.length > 0 && (
          <div className="mt-4 pt-4 border-t border-gray-800">
            <p className="text-xs text-gray-500 text-center">
              {t('savedWifi.totalNetworks', { count: savedWiFi.length, plural: savedWiFi.length !== 1 ? 's' : '' })}
            </p>
          </div>
        )}
      </CardContent>
    </Card>

    {/* Manual Add Dialog */}
    <AddNetworkDialog
      open={showAddDialog}
      onClose={() => setShowAddDialog(false)}
      onAdd={handleManualAdd}
    />
  </>
  )
}
