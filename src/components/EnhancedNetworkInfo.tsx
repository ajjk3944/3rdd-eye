'use client'

import { useState, useEffect, useCallback } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Badge } from '@/components/ui/badge'
import { Progress } from '@/components/ui/progress'
import { ScrollArea } from '@/components/ui/scroll-area'
import {
  Wifi,
  Signal,
  Globe,
  Router,
  Shield,
  Activity,
  RefreshCw,
  Zap,
  Radio,
  Lock,
  Unlock,
  MapPin,
  Clock,
  Download,
  Upload,
  Server,
  Eye,
  EyeOff,
  Copy,
  Check,
  AlertCircle,
  Info
} from 'lucide-react'
import { getWiFiScanner, getNetworkScanner, isCapacitor } from '@/lib/native-plugins'
import { toast } from 'sonner'
import { useI18n } from '@/lib/i18n'

interface EnhancedNetworkInfo {
  // Connection Status
  isConnected: boolean
  ssid?: string
  bssid?: string
  
  // Signal Information
  rssi?: number
  signalStrength?: number
  linkSpeed?: number
  
  // Network Configuration
  ipAddress?: string
  gateway?: string
  dns1?: string
  dns2?: string
  netmask?: string
  
  // WiFi Details
  frequency?: number
  channel?: number
  band?: '2.4GHz' | '5GHz' | '6GHz'
  
  // Additional Info
  connectionType?: string
  serverAddress?: string
}

export function EnhancedNetworkInfo() {
  const [networkInfo, setNetworkInfo] = useState<EnhancedNetworkInfo | null>(null)
  const [loading, setLoading] = useState(false)
  const [autoRefresh, setAutoRefresh] = useState(true)
  const [copiedField, setCopiedField] = useState<string | null>(null)

  // Fetch network information
  const fetchNetworkInfo = useCallback(async (silent = false) => {
    if (!silent) setLoading(true)
    
    try {
      const wifiScanner = getWiFiScanner()
      const netScanner = getNetworkScanner()
      
      if (!wifiScanner || !netScanner) {
        if (!silent) toast.error('Network scanner not available')
        return
      }

      // Get current WiFi network
      const wifiResult = await wifiScanner.getCurrentNetwork()
      
      // Get detailed network info
      const netResult = await netScanner.getNetworkInfo()
      
      console.log('WiFi Result:', wifiResult)
      console.log('Network Result:', netResult)
      
      if (wifiResult.connected && netResult.success) {
        // Calculate channel from frequency if not provided
        let channel = undefined
        if (wifiResult.frequency) {
          if (wifiResult.frequency >= 2400 && wifiResult.frequency <= 2500) {
            // 2.4GHz: Channel = (Frequency - 2407) / 5
            channel = Math.round((wifiResult.frequency - 2407) / 5)
          } else if (wifiResult.frequency >= 5000 && wifiResult.frequency <= 5900) {
            // 5GHz: Channel = (Frequency - 5000) / 5
            channel = Math.round((wifiResult.frequency - 5000) / 5)
          }
        }
        
        const info: EnhancedNetworkInfo = {
          isConnected: true,
          ssid: wifiResult.ssid || netResult.ssid,
          bssid: wifiResult.bssid || netResult.bssid,
          rssi: wifiResult.rssi || netResult.rssi,
          signalStrength: calculateSignalStrength(wifiResult.rssi || netResult.rssi || -100),
          linkSpeed: wifiResult.linkSpeed || netResult.linkSpeed,
          frequency: wifiResult.frequency || netResult.frequency,
          channel: channel,
          band: detectBand(wifiResult.frequency || netResult.frequency),
          ipAddress: netResult.ipAddress || wifiResult.ipAddress,
          gateway: netResult.gateway,
          dns1: netResult.dns1,
          dns2: netResult.dns2,
          netmask: netResult.netmask,
          connectionType: netResult.connectionType,
          serverAddress: netResult.serverAddress
        }
        
        setNetworkInfo(info)
      } else {
        setNetworkInfo({ isConnected: false })
      }
    } catch (error: any) {
      console.error('Failed to fetch network info:', error)
      if (!silent) toast.error('Failed to fetch network info')
    } finally {
      if (!silent) setLoading(false)
    }
  }, [])

  // Initial fetch
  useEffect(() => {
    fetchNetworkInfo()
  }, [fetchNetworkInfo])

  // Auto-refresh every 3 seconds
  useEffect(() => {
    if (!autoRefresh) return
    
    const interval = setInterval(() => {
      fetchNetworkInfo(true)
    }, 3000)
    
    return () => clearInterval(interval)
  }, [autoRefresh, fetchNetworkInfo])

  // Calculate signal strength percentage
  const calculateSignalStrength = (rssi: number): number => {
    if (rssi >= -50) return 100
    if (rssi <= -100) return 0
    return Math.round(((rssi + 100) / 50) * 100)
  }

  // Detect WiFi band from frequency
  const detectBand = (frequency?: number): '2.4GHz' | '5GHz' | '6GHz' | undefined => {
    if (!frequency) return undefined
    if (frequency >= 2400 && frequency <= 2500) return '2.4GHz'
    if (frequency >= 5000 && frequency <= 5900) return '5GHz'
    if (frequency >= 5925 && frequency <= 7125) return '6GHz'
    return undefined
  }

  // Get signal quality label and color
  const getSignalQuality = (rssi: number) => {
    if (rssi >= -50) return { label: 'Excellent', color: 'text-emerald-400', bgColor: 'bg-emerald-500/20' }
    if (rssi >= -60) return { label: 'Good', color: 'text-green-400', bgColor: 'bg-green-500/20' }
    if (rssi >= -70) return { label: 'Fair', color: 'text-cyan-400', bgColor: 'bg-cyan-500/20' }
    if (rssi >= -80) return { label: 'Weak', color: 'text-yellow-400', bgColor: 'bg-yellow-500/20' }
    return { label: 'Poor', color: 'text-red-400', bgColor: 'bg-red-500/20' }
  }

  // Get band color
  const getBandColor = (band?: string) => {
    if (band === '6GHz') return 'text-purple-400 bg-purple-500/20'
    if (band === '5GHz') return 'text-blue-400 bg-blue-500/20'
    if (band === '2.4GHz') return 'text-cyan-400 bg-cyan-500/20'
    return 'text-gray-400 bg-gray-500/20'
  }

  // Copy to clipboard
  const copyToClipboard = async (text: string, field: string) => {
    try {
      await navigator.clipboard.writeText(text)
      setCopiedField(field)
      setTimeout(() => setCopiedField(null), 2000)
      toast.success('Copied to clipboard')
    } catch (error) {
      toast.error('Failed to copy')
    }
  }

  if (!isCapacitor) {
    return (
      <Card className="bg-[#0d120d] border-cyan-900/30">
        <CardContent className="p-6">
          <div className="text-center text-gray-500">
            <Wifi className="w-12 h-12 mx-auto mb-3 opacity-30" />
            <p className="text-sm">Network information only available on mobile</p>
          </div>
        </CardContent>
      </Card>
    )
  }

  if (!networkInfo?.isConnected) {
    return (
      <Card className="bg-[#0d120d] border-cyan-900/30">
        <CardContent className="p-6">
          <div className="text-center text-gray-500">
            <Wifi className="w-12 h-12 mx-auto mb-3 opacity-30" />
            <p className="text-sm">Not connected to WiFi</p>
            <Button
              onClick={() => fetchNetworkInfo()}
              disabled={loading}
              size="sm"
              className="mt-4 bg-cyan-600 hover:bg-cyan-700"
            >
              <RefreshCw className={`w-4 h-4 mr-2 ${loading ? 'animate-spin' : ''}`} />
              Refresh
            </Button>
          </div>
        </CardContent>
      </Card>
    )
  }

  const signalQuality = getSignalQuality(networkInfo.rssi || -100)

  return (
    <div className="space-y-4">
      {/* Header */}
      <Card className="bg-[#0d120d] border-cyan-900/30">
        <CardHeader>
          <div className="flex items-center justify-between">
            <CardTitle className="flex items-center gap-2 text-white">
              <Wifi className="w-5 h-5 text-cyan-400" />
              Network Information
            </CardTitle>
            <div className="flex items-center gap-2">
              <Button
                onClick={() => setAutoRefresh(!autoRefresh)}
                size="sm"
                variant={autoRefresh ? 'default' : 'outline'}
                className={autoRefresh ? 'bg-cyan-600 hover:bg-cyan-700' : ''}
              >
                <Activity className={`w-4 h-4 ${autoRefresh ? 'animate-pulse' : ''}`} />
              </Button>
              <Button
                onClick={() => fetchNetworkInfo()}
                disabled={loading}
                size="sm"
                className="bg-cyan-600 hover:bg-cyan-700"
              >
                <RefreshCw className={`w-4 h-4 ${loading ? 'animate-spin' : ''}`} />
              </Button>
            </div>
          </div>
        </CardHeader>
      </Card>

      <ScrollArea className="h-[calc(100vh-200px)]">
        <div className="space-y-4 pr-4">
          {/* Connection Status */}
          <Card className="bg-[#0d120d] border-cyan-900/30">
            <CardHeader>
              <CardTitle className="text-sm text-gray-400">Connection Status</CardTitle>
            </CardHeader>
            <CardContent className="space-y-4">
              {/* SSID */}
              <div className="flex items-center justify-between">
                <div className="flex items-center gap-2">
                  <Wifi className="w-4 h-4 text-cyan-400" />
                  <span className="text-sm text-gray-400">Network Name</span>
                </div>
                <span className="text-white font-medium">{networkInfo.ssid}</span>
              </div>

              {/* BSSID */}
              {networkInfo.bssid && (
                <div className="flex items-center justify-between">
                  <div className="flex items-center gap-2">
                    <Router className="w-4 h-4 text-cyan-400" />
                    <span className="text-sm text-gray-400">BSSID</span>
                  </div>
                  <div className="flex items-center gap-2">
                    <span className="text-white font-mono text-sm">{networkInfo.bssid}</span>
                    <Button
                      size="sm"
                      variant="ghost"
                      className="h-6 w-6 p-0"
                      onClick={() => copyToClipboard(networkInfo.bssid!, 'bssid')}
                    >
                      {copiedField === 'bssid' ? (
                        <Check className="w-3 h-3 text-green-400" />
                      ) : (
                        <Copy className="w-3 h-3 text-gray-500" />
                      )}
                    </Button>
                  </div>
                </div>
              )}

              {/* Connection Type */}
              {networkInfo.connectionType && (
                <div className="flex items-center justify-between">
                  <div className="flex items-center gap-2">
                    <Activity className="w-4 h-4 text-cyan-400" />
                    <span className="text-sm text-gray-400">Connection Type</span>
                  </div>
                  <Badge className="bg-cyan-500/20 text-cyan-400">
                    {networkInfo.connectionType}
                  </Badge>
                </div>
              )}
            </CardContent>
          </Card>

          {/* Signal Information */}
          <Card className="bg-[#0d120d] border-cyan-900/30">
            <CardHeader>
              <CardTitle className="text-sm text-gray-400">Signal Information</CardTitle>
            </CardHeader>
            <CardContent className="space-y-4">
              {/* Signal Strength */}
              <div>
                <div className="flex items-center justify-between mb-2">
                  <div className="flex items-center gap-2">
                    <Signal className={`w-4 h-4 ${signalQuality.color}`} />
                    <span className="text-sm text-gray-400">Signal Strength</span>
                  </div>
                  <div className="flex items-center gap-2">
                    <Badge className={signalQuality.bgColor + ' ' + signalQuality.color}>
                      {signalQuality.label}
                    </Badge>
                    <span className={`text-sm font-medium ${signalQuality.color}`}>
                      {networkInfo.rssi} dBm
                    </span>
                  </div>
                </div>
                <Progress 
                  value={networkInfo.signalStrength} 
                  className="h-2"
                />
                <div className="flex justify-between mt-1">
                  <span className="text-xs text-gray-500">Weak</span>
                  <span className="text-xs text-gray-500">Strong</span>
                </div>
              </div>

              {/* Frequency & Band */}
              {networkInfo.frequency && (
                <div className="flex items-center justify-between">
                  <div className="flex items-center gap-2">
                    <Radio className="w-4 h-4 text-cyan-400" />
                    <span className="text-sm text-gray-400">Frequency</span>
                  </div>
                  <div className="flex items-center gap-2">
                    <span className="text-white font-medium">{networkInfo.frequency} MHz</span>
                    {networkInfo.band && (
                      <Badge className={getBandColor(networkInfo.band)}>
                        {networkInfo.band}
                      </Badge>
                    )}
                  </div>
                </div>
              )}

              {/* Channel */}
              {networkInfo.channel && (
                <div className="flex items-center justify-between">
                  <div className="flex items-center gap-2">
                    <Activity className="w-4 h-4 text-cyan-400" />
                    <span className="text-sm text-gray-400">Channel</span>
                  </div>
                  <span className="text-white font-medium">Channel {networkInfo.channel}</span>
                </div>
              )}

              {/* Link Speed */}
              {networkInfo.linkSpeed && (
                <div className="flex items-center justify-between">
                  <div className="flex items-center gap-2">
                    <Zap className="w-4 h-4 text-cyan-400" />
                    <span className="text-sm text-gray-400">Link Speed</span>
                  </div>
                  <span className="text-white font-medium">{networkInfo.linkSpeed} Mbps</span>
                </div>
              )}
            </CardContent>
          </Card>

          {/* Network Configuration */}
          <Card className="bg-[#0d120d] border-cyan-900/30">
            <CardHeader>
              <CardTitle className="text-sm text-gray-400">Network Configuration</CardTitle>
            </CardHeader>
            <CardContent className="space-y-4">
              {/* IP Address */}
              {networkInfo.ipAddress && (
                <div className="flex items-center justify-between">
                  <div className="flex items-center gap-2">
                    <Globe className="w-4 h-4 text-cyan-400" />
                    <span className="text-sm text-gray-400">IP Address</span>
                  </div>
                  <div className="flex items-center gap-2">
                    <span className="text-white font-mono text-sm">{networkInfo.ipAddress}</span>
                    <Button
                      size="sm"
                      variant="ghost"
                      className="h-6 w-6 p-0"
                      onClick={() => copyToClipboard(networkInfo.ipAddress!, 'ip')}
                    >
                      {copiedField === 'ip' ? (
                        <Check className="w-3 h-3 text-green-400" />
                      ) : (
                        <Copy className="w-3 h-3 text-gray-500" />
                      )}
                    </Button>
                  </div>
                </div>
              )}

              {/* Gateway */}
              {networkInfo.gateway && (
                <div className="flex items-center justify-between">
                  <div className="flex items-center gap-2">
                    <Router className="w-4 h-4 text-cyan-400" />
                    <span className="text-sm text-gray-400">Gateway</span>
                  </div>
                  <div className="flex items-center gap-2">
                    <span className="text-white font-mono text-sm">{networkInfo.gateway}</span>
                    <Button
                      size="sm"
                      variant="ghost"
                      className="h-6 w-6 p-0"
                      onClick={() => copyToClipboard(networkInfo.gateway!, 'gateway')}
                    >
                      {copiedField === 'gateway' ? (
                        <Check className="w-3 h-3 text-green-400" />
                      ) : (
                        <Copy className="w-3 h-3 text-gray-500" />
                      )}
                    </Button>
                  </div>
                </div>
              )}

              {/* Subnet Mask */}
              {networkInfo.netmask && (
                <div className="flex items-center justify-between">
                  <div className="flex items-center gap-2">
                    <Server className="w-4 h-4 text-cyan-400" />
                    <span className="text-sm text-gray-400">Subnet Mask</span>
                  </div>
                  <span className="text-white font-mono text-sm">{networkInfo.netmask}</span>
                </div>
              )}

              {/* DNS 1 */}
              {networkInfo.dns1 && (
                <div className="flex items-center justify-between">
                  <div className="flex items-center gap-2">
                    <Server className="w-4 h-4 text-cyan-400" />
                    <span className="text-sm text-gray-400">DNS Server 1</span>
                  </div>
                  <div className="flex items-center gap-2">
                    <span className="text-white font-mono text-sm">{networkInfo.dns1}</span>
                    <Button
                      size="sm"
                      variant="ghost"
                      className="h-6 w-6 p-0"
                      onClick={() => copyToClipboard(networkInfo.dns1!, 'dns1')}
                    >
                      {copiedField === 'dns1' ? (
                        <Check className="w-3 h-3 text-green-400" />
                      ) : (
                        <Copy className="w-3 h-3 text-gray-500" />
                      )}
                    </Button>
                  </div>
                </div>
              )}

              {/* DNS 2 */}
              {networkInfo.dns2 && (
                <div className="flex items-center justify-between">
                  <div className="flex items-center gap-2">
                    <Server className="w-4 h-4 text-cyan-400" />
                    <span className="text-sm text-gray-400">DNS Server 2</span>
                  </div>
                  <div className="flex items-center gap-2">
                    <span className="text-white font-mono text-sm">{networkInfo.dns2}</span>
                    <Button
                      size="sm"
                      variant="ghost"
                      className="h-6 w-6 p-0"
                      onClick={() => copyToClipboard(networkInfo.dns2!, 'dns2')}
                    >
                      {copiedField === 'dns2' ? (
                        <Check className="w-3 h-3 text-green-400" />
                      ) : (
                        <Copy className="w-3 h-3 text-gray-500" />
                      )}
                    </Button>
                  </div>
                </div>
              )}

              {/* Server Address */}
              {networkInfo.serverAddress && (
                <div className="flex items-center justify-between">
                  <div className="flex items-center gap-2">
                    <Server className="w-4 h-4 text-cyan-400" />
                    <span className="text-sm text-gray-400">Server Address</span>
                  </div>
                  <span className="text-white font-mono text-sm">{networkInfo.serverAddress}</span>
                </div>
              )}
            </CardContent>
          </Card>

          {/* Info Card */}
          <Card className="bg-cyan-900/10 border-cyan-900/30">
            <CardContent className="p-4">
              <div className="flex gap-3">
                <Info className="w-5 h-5 text-cyan-400 flex-shrink-0 mt-0.5" />
                <div className="text-xs text-gray-400 space-y-1">
                  <p>Network information updates automatically every 3 seconds when auto-refresh is enabled.</p>
                  <p className="text-cyan-400">Tap any value to copy it to clipboard.</p>
                </div>
              </div>
            </CardContent>
          </Card>
        </div>
      </ScrollArea>
    </div>
  )
}
