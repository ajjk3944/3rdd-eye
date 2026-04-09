'use client'

import { useState, useEffect, useRef } from 'react'
import { Card, CardContent } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Badge } from '@/components/ui/badge'
import { ScrollArea } from '@/components/ui/scroll-area'
import {
  Smartphone,
  ArrowRight,
  Pause,
  Play,
  Activity
} from 'lucide-react'
import { type ConnectionLog } from '@/lib/native-plugins'

interface TrafficTimelineProps {
  connections: ConnectionLog[]
  loading?: boolean
}

export function TrafficTimeline({ connections, loading }: TrafficTimelineProps) {
  const [paused, setPaused] = useState(false)
  const [displayConnections, setDisplayConnections] = useState<ConnectionLog[]>([])
  const scrollAreaRef = useRef<HTMLDivElement>(null)

  useEffect(() => {
    if (!paused) {
      // Limit to last 200 entries for performance
      setDisplayConnections(connections.slice(0, 200))
    }
  }, [connections, paused])

  const formatTime = (timestamp: number): string => {
    const date = new Date(timestamp)
    return date.toLocaleTimeString('en-US', { 
      hour12: false,
      hour: '2-digit',
      minute: '2-digit',
      second: '2-digit'
    })
  }

  const formatBytes = (bytes: number): string => {
    if (bytes < 1024) return `${bytes} B`
    if (bytes < 1024 * 1024) return `${(bytes / 1024).toFixed(1)} KB`
    if (bytes < 1024 * 1024 * 1024) return `${(bytes / (1024 * 1024)).toFixed(1)} MB`
    return `${(bytes / (1024 * 1024 * 1024)).toFixed(1)} GB`
  }

  const getCountryFlag = (countryCode: string): string => {
    if (!countryCode || countryCode.length !== 2) return '🌐'
    const codePoints = countryCode
      .toUpperCase()
      .split('')
      .map(char => 127397 + char.charCodeAt(0))
    return String.fromCodePoint(...codePoints)
  }

  const getProtocolColor = (protocol: string): string => {
    switch (protocol.toUpperCase()) {
      case 'TCP':
        return 'bg-cyan-900/50 text-cyan-300 border-cyan-700/50'
      case 'UDP':
        return 'bg-green-900/50 text-green-300 border-green-700/50'
      case 'ICMP':
        return 'bg-gray-700/50 text-gray-300 border-gray-600/50'
      default:
        return 'bg-purple-900/50 text-purple-300 border-purple-700/50'
    }
  }

  const truncateText = (text: string, maxLength: number): string => {
    if (text.length <= maxLength) return text
    return text.substring(0, maxLength) + '...'
  }

  if (loading) {
    return (
      <Card className="bg-[#0d120d] border-gray-700/50">
        <CardContent className="p-8 text-center">
          <div className="flex flex-col items-center gap-4">
            <div className="w-8 h-8 border-4 border-cyan-400 border-t-transparent rounded-full animate-spin" />
            <p className="text-gray-300">Loading timeline...</p>
          </div>
        </CardContent>
      </Card>
    )
  }

  if (displayConnections.length === 0) {
    return (
      <Card className="bg-[#0d120d] border-gray-700/50">
        <CardContent className="p-8 text-center">
          <Activity className="w-16 h-16 text-gray-600 mx-auto mb-4" />
          <h3 className="text-lg font-bold text-white mb-2">No connections captured yet</h3>
          <p className="text-gray-300">Start monitoring to see real-time traffic</p>
        </CardContent>
      </Card>
    )
  }

  return (
    <Card className="bg-[#0d120d] border-gray-700/50">
      <CardContent className="p-4">
        {/* Control Bar */}
        <div className="flex items-center justify-between mb-4">
          <div className="text-sm text-gray-300">
            Showing {displayConnections.length} connections
          </div>
          <Button
            variant="ghost"
            size="sm"
            onClick={() => setPaused(!paused)}
            className="text-cyan-300 hover:text-cyan-200"
          >
            {paused ? (
              <>
                <Play className="w-4 h-4 mr-2" />
                Resume
              </>
            ) : (
              <>
                <Pause className="w-4 h-4 mr-2" />
                Pause
              </>
            )}
          </Button>
        </div>

        {/* Timeline Feed - 2-line layout */}
        <ScrollArea className="h-[500px]" ref={scrollAreaRef}>
          <div className="space-y-0">
            {displayConnections.map((conn, index) => (
              <div
                key={`${conn.id}-${index}`}
                className="py-2 border-b border-gray-800/50 hover:bg-cyan-900/10 transition-colors"
              >
                {/* Line 1: Timestamp | Icon | App Name | Protocol | Suspicious Dot */}
                <div className="flex items-center gap-2 mb-1">
                  {/* Timestamp */}
                  <div className="text-[10px] text-gray-400 font-mono w-[55px] flex-shrink-0">
                    {formatTime(conn.timestamp).substring(0, 8)}
                  </div>

                  {/* App Icon */}
                  {conn.appIcon ? (
                    <img
                      src={`data:image/png;base64,${conn.appIcon}`}
                      alt={conn.appName}
                      className="w-4 h-4 rounded flex-shrink-0"
                    />
                  ) : (
                    <Smartphone className="w-4 h-4 text-gray-500 flex-shrink-0" />
                  )}

                  {/* App Name */}
                  <span className="text-xs font-medium text-white truncate max-w-[120px]">
                    {truncateText(conn.appName, 12)}
                  </span>

                  {/* Protocol Badge */}
                  <Badge className={`text-[10px] px-1.5 py-0 h-4 ${getProtocolColor(conn.protocol)}`}>
                    {conn.protocol}
                  </Badge>

                  {/* Suspicious Indicator */}
                  {conn.isSuspicious && (
                    <div className="w-2 h-2 bg-red-400 rounded-full flex-shrink-0 animate-pulse ml-auto" />
                  )}
                </div>

                {/* Line 2: Arrow | Destination IP:Port | Country | Data Size */}
                <div className="flex items-center gap-2 pl-[59px]">
                  {/* Arrow */}
                  <ArrowRight className="w-3 h-3 text-gray-500 flex-shrink-0" />

                  {/* Destination IP:Port */}
                  <div className="text-[11px] text-cyan-300 font-mono flex-1 min-w-0" title={`${conn.destinationIP}:${conn.destinationPort}`}>
                    <span className="truncate inline-block max-w-[140px]">{conn.destinationIP}</span>
                    <span className="text-white">:{conn.destinationPort}</span>
                  </div>

                  {/* Country */}
                  <div className="flex items-center gap-1 flex-shrink-0">
                    <span className="text-base">{getCountryFlag(conn.countryCode)}</span>
                    <span className="text-[11px] text-gray-300">
                      {conn.countryCode || 'XX'}
                    </span>
                  </div>

                  {/* Data Size */}
                  <div className="text-[10px] text-gray-400 flex-shrink-0 ml-auto">
                    {formatBytes(conn.bytesSent + conn.bytesReceived)}
                  </div>
                </div>
              </div>
            ))}
          </div>
        </ScrollArea>
      </CardContent>
    </Card>
  )
}
