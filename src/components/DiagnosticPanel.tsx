'use client'

import { useState, useEffect } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Badge } from '@/components/ui/badge'
import { 
  isCapacitor, 
  getPermissionManager, 
  getNetworkScanner,
  getWiFiScanner,
  getBluetoothScanner
} from '@/lib/native-plugins'
import { CheckCircle2, XCircle, AlertCircle, RefreshCw } from 'lucide-react'
import { useI18n } from '@/lib/i18n'

export default function DiagnosticPanel() {
  const [diagnostics, setDiagnostics] = useState<any>(null)
  const [loading, setLoading] = useState(false)

  const runDiagnostics = async () => {
    setLoading(true)
    const results: any = {
      platform: isCapacitor ? 'Native (Android/iOS)' : 'Web',
      timestamp: new Date().toISOString(),
      plugins: {},
      permissions: {},
      services: {},
      network: {}
    }

    // Check plugins availability
    results.plugins.permissionManager = !!getPermissionManager()
    results.plugins.networkScanner = !!getNetworkScanner()
    results.plugins.wifiScanner = !!getWiFiScanner()
    results.plugins.bluetoothScanner = !!getBluetoothScanner()

    // Check permissions and services
    const permManager = getPermissionManager()
    if (permManager) {
      try {
        const status = await permManager.checkAllStatus()
        results.permissions = status.permissions
        results.services = status.services
        results.allPermissionsGranted = status.allPermissionsGranted
        results.allServicesEnabled = status.allServicesEnabled
      } catch (err: any) {
        results.permissionError = err.message
      }
    }

    // Check network info
    const netScanner = getNetworkScanner()
    if (netScanner) {
      try {
        const networkInfo = await netScanner.getNetworkInfo()
        results.network = networkInfo
      } catch (err: any) {
        results.networkError = err.message
      }
    }

    // Check WiFi
    const wifiScanner = getWiFiScanner()
    if (wifiScanner) {
      try {
        const wifiEnabled = await wifiScanner.isWifiEnabled()
        results.wifiEnabled = wifiEnabled.enabled
        
        const currentNetwork = await wifiScanner.getCurrentNetwork()
        results.currentNetwork = currentNetwork
      } catch (err: any) {
        results.wifiError = err.message
      }
    }

    setDiagnostics(results)
    setLoading(false)
  }

  useEffect(() => {
    runDiagnostics()
  }, [])

  const StatusIcon = ({ status }: { status: boolean }) => {
    return status ? (
      <CheckCircle2 className="w-5 h-5 text-green-500" />
    ) : (
      <XCircle className="w-5 h-5 text-red-500" />
    )
  }

  if (!diagnostics) {
    return (
      <Card className="bg-[#0d120d] border-emerald-900/30">
        <CardContent className="p-6 text-center">
          <div className="animate-spin w-8 h-8 border-2 border-emerald-500 border-t-transparent rounded-full mx-auto mb-3" />
          <p className="text-gray-400">Running diagnostics...</p>
        </CardContent>
      </Card>
    )
  }

  return (
    <div className="space-y-4">
      <div className="flex items-center justify-between">
        <h2 className="text-xl font-bold text-white">System Diagnostics</h2>
        <Button 
          onClick={runDiagnostics} 
          disabled={loading}
          size="sm"
          className="bg-emerald-600 hover:bg-emerald-700"
        >
          <RefreshCw className={`w-4 h-4 mr-2 ${loading ? 'animate-spin' : ''}`} />
          Refresh
        </Button>
      </div>

      {/* Platform */}
      <Card className="bg-[#0d120d] border-emerald-900/30">
        <CardHeader className="pb-3">
          <CardTitle className="text-sm text-white">Platform</CardTitle>
        </CardHeader>
        <CardContent>
          <Badge className="bg-emerald-900/20 text-emerald-400">
            {diagnostics.platform}
          </Badge>
        </CardContent>
      </Card>

      {/* Plugins */}
      <Card className="bg-[#0d120d] border-emerald-900/30">
        <CardHeader className="pb-3">
          <CardTitle className="text-sm text-white">Native Plugins</CardTitle>
        </CardHeader>
        <CardContent className="space-y-2">
          <div className="flex items-center justify-between">
            <span className="text-sm text-gray-400">Permission Manager</span>
            <StatusIcon status={diagnostics.plugins.permissionManager} />
          </div>
          <div className="flex items-center justify-between">
            <span className="text-sm text-gray-400">Network Scanner</span>
            <StatusIcon status={diagnostics.plugins.networkScanner} />
          </div>
          <div className="flex items-center justify-between">
            <span className="text-sm text-gray-400">WiFi Scanner</span>
            <StatusIcon status={diagnostics.plugins.wifiScanner} />
          </div>
          <div className="flex items-center justify-between">
            <span className="text-sm text-gray-400">Bluetooth Scanner</span>
            <StatusIcon status={diagnostics.plugins.bluetoothScanner} />
          </div>
        </CardContent>
      </Card>

      {/* Permissions */}
      {diagnostics.permissions && (
        <Card className="bg-[#0d120d] border-emerald-900/30">
          <CardHeader className="pb-3">
            <CardTitle className="text-sm text-white">Permissions</CardTitle>
          </CardHeader>
          <CardContent className="space-y-2">
            <div className="flex items-center justify-between">
              <span className="text-sm text-gray-400">Location</span>
              <StatusIcon status={diagnostics.permissions.location} />
            </div>
            <div className="flex items-center justify-between">
              <span className="text-sm text-gray-400">Bluetooth</span>
              <StatusIcon status={diagnostics.permissions.bluetooth} />
            </div>
            <div className="flex items-center justify-between">
              <span className="text-sm text-gray-400">WiFi</span>
              <StatusIcon status={diagnostics.permissions.wifi} />
            </div>
          </CardContent>
        </Card>
      )}

      {/* Services */}
      {diagnostics.services && (
        <Card className="bg-[#0d120d] border-emerald-900/30">
          <CardHeader className="pb-3">
            <CardTitle className="text-sm text-white">Services</CardTitle>
          </CardHeader>
          <CardContent className="space-y-2">
            <div className="flex items-center justify-between">
              <span className="text-sm text-gray-400">Location Service</span>
              <StatusIcon status={diagnostics.services.location} />
            </div>
            <div className="flex items-center justify-between">
              <span className="text-sm text-gray-400">Bluetooth Service</span>
              <StatusIcon status={diagnostics.services.bluetooth} />
            </div>
            <div className="flex items-center justify-between">
              <span className="text-sm text-gray-400">WiFi Service</span>
              <StatusIcon status={diagnostics.services.wifi} />
            </div>
          </CardContent>
        </Card>
      )}

      {/* Network Info */}
      {diagnostics.network && diagnostics.network.success && (
        <Card className="bg-[#0d120d] border-emerald-900/30">
          <CardHeader className="pb-3">
            <CardTitle className="text-sm text-white">Network Information</CardTitle>
          </CardHeader>
          <CardContent className="space-y-2">
            {diagnostics.network.ssid && (
              <div className="flex items-center justify-between">
                <span className="text-sm text-gray-400">SSID</span>
                <span className="text-sm text-white font-mono">{diagnostics.network.ssid}</span>
              </div>
            )}
            {diagnostics.network.ipAddress && (
              <div className="flex items-center justify-between">
                <span className="text-sm text-gray-400">IP Address</span>
                <span className="text-sm text-white font-mono">{diagnostics.network.ipAddress}</span>
              </div>
            )}
            {diagnostics.network.gateway && (
              <div className="flex items-center justify-between">
                <span className="text-sm text-gray-400">Gateway</span>
                <span className="text-sm text-white font-mono">{diagnostics.network.gateway}</span>
              </div>
            )}
            <div className="flex items-center justify-between">
              <span className="text-sm text-gray-400">Connected</span>
              <StatusIcon status={diagnostics.network.isConnected} />
            </div>
          </CardContent>
        </Card>
      )}

      {/* WiFi Status */}
      {diagnostics.wifiEnabled !== undefined && (
        <Card className="bg-[#0d120d] border-emerald-900/30">
          <CardHeader className="pb-3">
            <CardTitle className="text-sm text-white">WiFi Status</CardTitle>
          </CardHeader>
          <CardContent className="space-y-2">
            <div className="flex items-center justify-between">
              <span className="text-sm text-gray-400">WiFi Enabled</span>
              <StatusIcon status={diagnostics.wifiEnabled} />
            </div>
            {diagnostics.currentNetwork && diagnostics.currentNetwork.connected && (
              <>
                <div className="flex items-center justify-between">
                  <span className="text-sm text-gray-400">Connected Network</span>
                  <span className="text-sm text-white font-mono">{diagnostics.currentNetwork.ssid || 'Unknown'}</span>
                </div>
                {diagnostics.currentNetwork.rssi && (
                  <div className="flex items-center justify-between">
                    <span className="text-sm text-gray-400">Signal Strength</span>
                    <span className="text-sm text-white font-mono">{diagnostics.currentNetwork.rssi} dBm</span>
                  </div>
                )}
              </>
            )}
          </CardContent>
        </Card>
      )}

      {/* Errors */}
      {(diagnostics.permissionError || diagnostics.networkError || diagnostics.wifiError) && (
        <Card className="bg-red-900/20 border-red-500/30">
          <CardHeader className="pb-3">
            <CardTitle className="text-sm text-red-400 flex items-center gap-2">
              <AlertCircle className="w-4 h-4" />
              Errors
            </CardTitle>
          </CardHeader>
          <CardContent className="space-y-2">
            {diagnostics.permissionError && (
              <div>
                <p className="text-xs text-gray-500">Permission Error:</p>
                <p className="text-sm text-red-400 font-mono">{diagnostics.permissionError}</p>
              </div>
            )}
            {diagnostics.networkError && (
              <div>
                <p className="text-xs text-gray-500">Network Error:</p>
                <p className="text-sm text-red-400 font-mono">{diagnostics.networkError}</p>
              </div>
            )}
            {diagnostics.wifiError && (
              <div>
                <p className="text-xs text-gray-500">WiFi Error:</p>
                <p className="text-sm text-red-400 font-mono">{diagnostics.wifiError}</p>
              </div>
            )}
          </CardContent>
        </Card>
      )}

      {/* Summary */}
      <Card className={`${
        diagnostics.allPermissionsGranted && diagnostics.allServicesEnabled
          ? 'bg-green-900/20 border-green-500/30'
          : 'bg-yellow-900/20 border-yellow-500/30'
      }`}>
        <CardContent className="p-4">
          <div className="flex items-center gap-3">
            {diagnostics.allPermissionsGranted && diagnostics.allServicesEnabled ? (
              <>
                <CheckCircle2 className="w-6 h-6 text-green-500" />
                <div>
                  <p className="text-sm font-medium text-green-400">All systems operational</p>
                  <p className="text-xs text-gray-500">Device scanning should work properly</p>
                </div>
              </>
            ) : (
              <>
                <AlertCircle className="w-6 h-6 text-yellow-500" />
                <div>
                  <p className="text-sm font-medium text-yellow-400">Action required</p>
                  <p className="text-xs text-gray-500">
                    {!diagnostics.allPermissionsGranted && 'Grant permissions. '}
                    {!diagnostics.allServicesEnabled && 'Enable required services.'}
                  </p>
                </div>
              </>
            )}
          </div>
        </CardContent>
      </Card>

      <div className="text-xs text-gray-600 text-center">
        Last updated: {new Date(diagnostics.timestamp).toLocaleTimeString()}
      </div>
    </div>
  )
}
