'use client'

import { useState, useEffect } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Badge } from '@/components/ui/badge'
import { CheckCircle2, XCircle, AlertCircle, RefreshCw } from 'lucide-react'
import { isCapacitor, getNetworkScanner, getPacketSniffer } from '@/lib/native-plugins'

interface PluginStatus {
  name: string
  available: boolean
  details: string
}

export function PluginDiagnostic() {
  const [plugins, setPlugins] = useState<PluginStatus[]>([])
  const [testing, setTesting] = useState(false)

  const checkPlugins = async () => {
    setTesting(true)
    const results: PluginStatus[] = []

    // Check Capacitor
    results.push({
      name: 'Capacitor Platform',
      available: isCapacitor,
      details: isCapacitor ? 'Running on native platform' : 'Running in web browser'
    })

    // Check NetworkScanner
    const netScanner = getNetworkScanner()
    results.push({
      name: 'NetworkScanner Plugin',
      available: netScanner !== null,
      details: netScanner ? 'Plugin loaded successfully' : 'Plugin not available'
    })

    // Test NetworkScanner.getArpTable if available
    if (netScanner) {
      try {
        const arpResult = await netScanner.getArpTable()
        results.push({
          name: 'NetworkScanner.getArpTable()',
          available: arpResult.success,
          details: arpResult.success 
            ? `Found ${arpResult.devices?.length || 0} devices` 
            : `Error: ${arpResult.error || 'Unknown'}`
        })
      } catch (err: any) {
        results.push({
          name: 'NetworkScanner.getArpTable()',
          available: false,
          details: `Exception: ${err.message || 'Unknown error'}`
        })
      }
    }

    // Check PacketSniffer
    const packetSniffer = getPacketSniffer()
    results.push({
      name: 'PacketSniffer Plugin',
      available: packetSniffer !== null,
      details: packetSniffer ? 'Plugin loaded successfully' : 'Plugin not available'
    })

    // Test PacketSniffer.isCapturing if available
    if (packetSniffer) {
      try {
        const status = await packetSniffer.isCapturing()
        results.push({
          name: 'PacketSniffer.isCapturing()',
          available: true,
          details: status.capturing 
            ? 'Traffic Monitor is running' 
            : 'Traffic Monitor is not running (start it first)'
        })
      } catch (err: any) {
        results.push({
          name: 'PacketSniffer.isCapturing()',
          available: false,
          details: `Exception: ${err.message || 'Unknown error'}`
        })
      }
    }

    setPlugins(results)
    setTesting(false)
  }

  useEffect(() => {
    checkPlugins()
  }, [])

  const getStatusIcon = (available: boolean) => {
    if (available) {
      return <CheckCircle2 className="w-5 h-5 text-green-500" />
    }
    return <XCircle className="w-5 h-5 text-red-500" />
  }

  const getStatusBadge = (available: boolean) => {
    if (available) {
      return <Badge className="bg-green-500/20 text-green-400 border-green-500/30">Available</Badge>
    }
    return <Badge className="bg-red-500/20 text-red-400 border-red-500/30">Not Available</Badge>
  }

  return (
    <Card className="bg-gray-900/50 border-gray-800">
      <CardHeader>
        <div className="flex items-center justify-between">
          <CardTitle className="text-xl font-bold text-white flex items-center gap-2">
            <AlertCircle className="w-6 h-6 text-blue-400" />
            Plugin Diagnostic
          </CardTitle>
          <Button
            onClick={checkPlugins}
            disabled={testing}
            size="sm"
            className="bg-blue-600 hover:bg-blue-700"
          >
            {testing ? (
              <>
                <RefreshCw className="w-4 h-4 mr-2 animate-spin" />
                Testing...
              </>
            ) : (
              <>
                <RefreshCw className="w-4 h-4 mr-2" />
                Retest
              </>
            )}
          </Button>
        </div>
      </CardHeader>
      <CardContent className="space-y-3">
        {plugins.map((plugin, index) => (
          <div
            key={index}
            className="flex items-start justify-between p-3 bg-gray-800/50 rounded-lg border border-gray-700"
          >
            <div className="flex items-start gap-3 flex-1">
              {getStatusIcon(plugin.available)}
              <div className="flex-1">
                <div className="font-medium text-white">{plugin.name}</div>
                <div className="text-sm text-gray-400 mt-1">{plugin.details}</div>
              </div>
            </div>
            {getStatusBadge(plugin.available)}
          </div>
        ))}

        {plugins.length === 0 && (
          <div className="text-center text-gray-400 py-8">
            Click "Retest" to check plugin status
          </div>
        )}

        <div className="mt-6 p-4 bg-blue-900/20 border border-blue-800/30 rounded-lg">
          <div className="text-sm text-blue-300">
            <strong>How to use:</strong>
            <ul className="mt-2 space-y-1 list-disc list-inside">
              <li>All checks should show "Available" on Android</li>
              <li>If "Capacitor Platform" is not available, you're in web browser</li>
              <li>If plugins are not available, rebuild and reinstall the app</li>
              <li>For Packet Analyzer, start Traffic Monitor first</li>
            </ul>
          </div>
        </div>
      </CardContent>
    </Card>
  )
}
