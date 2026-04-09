'use client'

import { useState, useMemo } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Badge } from '@/components/ui/badge'
import { ScrollArea } from '@/components/ui/scroll-area'
import {
  ShieldCheck,
  Smartphone,
  X
} from 'lucide-react'
import { type ConnectionLog } from '@/lib/native-plugins'

interface SuspiciousAlertsProps {
  alerts: ConnectionLog[]
  loading?: boolean
}

export function SuspiciousAlerts({ alerts, loading }: SuspiciousAlertsProps) {
  const [dismissedAlerts, setDismissedAlerts] = useState<Set<string>>(new Set())

  const getCountryFlag = (countryCode: string): string => {
    if (!countryCode || countryCode.length !== 2) return '🌐'
    const codePoints = countryCode
      .toUpperCase()
      .split('')
      .map(char => 127397 + char.charCodeAt(0))
    return String.fromCodePoint(...codePoints)
  }

  const getRelativeTime = (timestamp: number): string => {
    const now = Date.now()
    const diff = Math.floor((now - timestamp) / 1000) // seconds

    if (diff < 60) return 'Just now'
    if (diff < 3600) return `${Math.floor(diff / 60)}m ago`
    if (diff < 86400) return `${Math.floor(diff / 3600)}h ago`
    return `${Math.floor(diff / 86400)}d ago`
  }

  const getSeverityColor = (severity?: string): string => {
    switch (severity?.toLowerCase()) {
      case 'high':
        return 'border-l-red-500 bg-red-950/30'
      case 'medium':
        return 'border-l-amber-500 bg-amber-950/30'
      case 'low':
        return 'border-l-yellow-500 bg-yellow-950/30'
      default:
        return 'border-l-gray-500 bg-gray-900/30'
    }
  }

  const getSeverityBadgeColor = (severity?: string): string => {
    switch (severity?.toLowerCase()) {
      case 'high':
        return 'bg-red-500/20 text-red-300 border-red-500/30'
      case 'medium':
        return 'bg-amber-500/20 text-amber-300 border-amber-500/30'
      case 'low':
        return 'bg-yellow-500/20 text-yellow-300 border-yellow-500/30'
      default:
        return 'bg-gray-500/20 text-gray-300 border-gray-500/30'
    }
  }

  const handleDismiss = (alertId: string) => {
    setDismissedAlerts(prev => new Set([...prev, alertId]))
  }

  // Filter out dismissed alerts
  const visibleAlerts = useMemo(() => {
    return alerts.filter(alert => !dismissedAlerts.has(alert.id))
  }, [alerts, dismissedAlerts])

  // Group by severity
  const groupedAlerts = useMemo(() => {
    const groups = {
      high: visibleAlerts.filter(a => a.severity?.toLowerCase() === 'high'),
      medium: visibleAlerts.filter(a => a.severity?.toLowerCase() === 'medium'),
      low: visibleAlerts.filter(a => a.severity?.toLowerCase() === 'low')
    }
    return groups
  }, [visibleAlerts])

  const counts = {
    high: groupedAlerts.high.length,
    medium: groupedAlerts.medium.length,
    low: groupedAlerts.low.length
  }

  // Sort: high first, then medium, then low
  const sortedAlerts = [
    ...groupedAlerts.high,
    ...groupedAlerts.medium,
    ...groupedAlerts.low
  ]

  if (loading) {
    return (
      <Card className="bg-[#0d120d] border-gray-700/50">
        <CardContent className="p-8 text-center">
          <div className="flex flex-col items-center gap-4">
            <div className="w-8 h-8 border-4 border-cyan-400 border-t-transparent rounded-full animate-spin" />
            <p className="text-gray-300">Loading alerts...</p>
          </div>
        </CardContent>
      </Card>
    )
  }

  if (sortedAlerts.length === 0) {
    return (
      <Card className="bg-[#0d120d] border-gray-700/50">
        <CardContent className="p-8 text-center">
          <ShieldCheck className="w-16 h-16 text-green-400 mx-auto mb-4" />
          <h3 className="text-xl font-bold text-white mb-2">All Clear</h3>
          <p className="text-gray-300">No suspicious activity detected</p>
        </CardContent>
      </Card>
    )
  }

  return (
    <div className="space-y-4">
      {/* Summary Header */}
      <Card className="bg-[#0d120d] border-gray-700/50">
        <CardHeader className="pb-3">
          <CardTitle className="text-white flex items-center gap-3">
            <span>Suspicious Activity Summary</span>
          </CardTitle>
        </CardHeader>
        <CardContent>
          <div className="flex items-center gap-4 flex-wrap">
            {counts.high > 0 && (
              <div className="flex items-center gap-2">
                <div className="w-3 h-3 bg-red-500 rounded-full" />
                <span className="text-white font-semibold">{counts.high}</span>
                <span className="text-gray-300 text-sm">High</span>
              </div>
            )}
            {counts.medium > 0 && (
              <div className="flex items-center gap-2">
                <div className="w-3 h-3 bg-amber-500 rounded-full" />
                <span className="text-white font-semibold">{counts.medium}</span>
                <span className="text-gray-300 text-sm">Medium</span>
              </div>
            )}
            {counts.low > 0 && (
              <div className="flex items-center gap-2">
                <div className="w-3 h-3 bg-yellow-500 rounded-full" />
                <span className="text-white font-semibold">{counts.low}</span>
                <span className="text-gray-300 text-sm">Low</span>
              </div>
            )}
          </div>
        </CardContent>
      </Card>

      {/* Alerts List */}
      <ScrollArea className="h-[calc(100vh-280px)] max-h-[500px]">
        <div className="space-y-3 pb-4">
          {sortedAlerts.map((alert) => (
            <Card
              key={alert.id}
              className={`bg-[#0d120d] border-l-4 ${getSeverityColor(alert.severity)} ${
                alert.severity?.toLowerCase() === 'high' ? 'shadow-lg shadow-red-500/10' : ''
              }`}
            >
              <CardContent className="p-4">
                {/* Card Top: Severity Badge + Timestamp */}
                <div className="flex items-center justify-between mb-3">
                  <Badge className={getSeverityBadgeColor(alert.severity)}>
                    {alert.severity?.toUpperCase() || 'ALERT'}
                  </Badge>
                  <span className="text-xs text-gray-400">
                    {getRelativeTime(alert.timestamp)}
                  </span>
                </div>

                <div className="flex items-start gap-3">
                  {/* App Icon */}
                  <div className="flex-shrink-0">
                    {alert.appIcon ? (
                      <img
                        src={`data:image/png;base64,${alert.appIcon}`}
                        alt={alert.appName}
                        className="w-10 h-10 sm:w-12 sm:h-12 rounded-lg"
                      />
                    ) : (
                      <div className="w-10 h-10 sm:w-12 sm:h-12 bg-red-900/30 rounded-lg flex items-center justify-center">
                        <Smartphone className="w-5 h-5 sm:w-6 sm:h-6 text-red-400" />
                      </div>
                    )}
                  </div>

                  {/* Alert Content */}
                  <div className="flex-1 min-w-0">
                    {/* App Name - Full, no truncation */}
                    <h3 className="font-semibold text-white text-sm mb-2 whitespace-normal break-words">
                      {alert.appName}
                    </h3>

                    {/* Reason Text - Full, wrapping allowed */}
                    <p className="text-xs text-gray-300 leading-relaxed mb-3 whitespace-normal break-words">
                      {alert.suspiciousReason || 'Suspicious network activity detected'}
                    </p>

                    {/* Destination Info - Own line */}
                    <div className="flex items-center gap-2 flex-wrap text-xs">
                      <span className="text-lg">{getCountryFlag(alert.countryCode)}</span>
                      <span className="text-gray-400">{alert.countryName || alert.countryCode}</span>
                      <span className="text-gray-400 font-mono">{alert.destinationIP}</span>
                    </div>
                  </div>

                  {/* Dismiss Button */}
                  <Button
                    variant="ghost"
                    size="icon"
                    onClick={() => handleDismiss(alert.id)}
                    className="flex-shrink-0 text-gray-400 hover:text-gray-200"
                  >
                    <X className="w-4 h-4" />
                  </Button>
                </div>
              </CardContent>
            </Card>
          ))}
        </div>
      </ScrollArea>
    </div>
  )
}
