'use client'

import { useState } from 'react'
import { Card, CardContent } from '@/components/ui/card'
import { Badge } from '@/components/ui/badge'
import { ScrollArea } from '@/components/ui/scroll-area'
import {
  Smartphone,
  ArrowUp,
  ArrowDown,
  Globe,
  ChevronDown,
  ChevronUp
} from 'lucide-react'
import { type AppTrafficSummary } from '@/lib/native-plugins'

interface AppTrafficListProps {
  apps: AppTrafficSummary[]
  loading?: boolean
}

export function AppTrafficList({ apps, loading }: AppTrafficListProps) {
  const [expandedApp, setExpandedApp] = useState<string | null>(null)

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

  // Sort apps by total connections (most active first)
  const sortedApps = [...apps].sort((a, b) => b.totalConnections - a.totalConnections)

  if (loading) {
    return (
      <Card className="bg-[#0d120d] border-gray-700/50">
        <CardContent className="p-8 text-center">
          <div className="flex flex-col items-center gap-4">
            <div className="w-8 h-8 border-4 border-cyan-400 border-t-transparent rounded-full animate-spin" />
            <p className="text-gray-300">Loading app traffic...</p>
          </div>
        </CardContent>
      </Card>
    )
  }

  if (sortedApps.length === 0) {
    return (
      <Card className="bg-[#0d120d] border-gray-700/50">
        <CardContent className="p-8 text-center">
          <Smartphone className="w-16 h-16 text-gray-600 mx-auto mb-4" />
          <h3 className="text-lg font-bold text-white mb-2">No traffic data yet</h3>
          <p className="text-gray-300">Start capturing to see app activity</p>
        </CardContent>
      </Card>
    )
  }

  return (
    <ScrollArea className="h-[calc(100vh-280px)] max-h-[600px]">
      <div className="space-y-3 pb-4">
        {sortedApps.map((app) => (
          <Card
            key={app.appPackage}
            className="bg-[#0d120d] border-gray-700/50 hover:border-cyan-500/50 transition-colors cursor-pointer"
            onClick={() => setExpandedApp(expandedApp === app.appPackage ? null : app.appPackage)}
          >
            <CardContent className="p-3 sm:p-4">
              <div className="flex flex-col sm:flex-row items-start sm:items-center gap-3">
                {/* App Icon & Info */}
                <div className="flex items-center gap-3 flex-1 min-w-0">
                  <div className="flex-shrink-0">
                    {app.appIcon ? (
                      <img
                        src={`data:image/png;base64,${app.appIcon}`}
                        alt={app.appName}
                        className="w-10 h-10 sm:w-12 sm:h-12 rounded-lg"
                      />
                    ) : (
                      <div className="w-10 h-10 sm:w-12 sm:h-12 bg-cyan-900/30 rounded-lg flex items-center justify-center">
                        <Smartphone className="w-5 h-5 sm:w-6 sm:h-6 text-cyan-400" />
                      </div>
                    )}
                  </div>

                  {/* App Info */}
                  <div className="flex-1 min-w-0">
                    <div className="flex items-center gap-2 mb-1 flex-wrap">
                      <h3 className="font-bold text-white truncate text-sm sm:text-base">{app.appName}</h3>
                      {app.suspiciousCount > 0 && (
                        <Badge variant="destructive" className="bg-red-500/20 text-red-300 border-red-500/30 text-xs">
                          {app.suspiciousCount} suspicious
                        </Badge>
                      )}
                    </div>
                    <p className="text-xs text-gray-400 truncate">{app.appPackage}</p>
                  </div>
                </div>

                {/* Stats */}
                <div className="flex items-center gap-3 sm:gap-4 text-xs sm:text-sm flex-wrap w-full sm:w-auto">
                  <div className="flex items-center gap-1">
                    <ArrowUp className="w-3 h-3 sm:w-4 sm:h-4 text-green-400" />
                    <span className="text-white font-semibold">{formatBytes(app.totalBytesSent)}</span>
                  </div>
                  <div className="flex items-center gap-1">
                    <ArrowDown className="w-3 h-3 sm:w-4 sm:h-4 text-blue-400" />
                    <span className="text-white font-semibold">{formatBytes(app.totalBytesReceived)}</span>
                  </div>
                  <div className="flex items-center gap-1">
                    <Globe className="w-3 h-3 sm:w-4 sm:h-4 text-purple-400" />
                    <span className="text-white font-semibold">{app.uniqueCountries}</span>
                  </div>
                  <div className="text-gray-300">
                    {app.totalConnections} connections
                  </div>
                  
                  {/* Expand Icon */}
                  <div className="flex-shrink-0 ml-auto">
                    {expandedApp === app.appPackage ? (
                      <ChevronUp className="w-4 h-4 sm:w-5 sm:h-5 text-gray-300" />
                    ) : (
                      <ChevronDown className="w-4 h-4 sm:w-5 sm:h-5 text-gray-300" />
                    )}
                  </div>
                </div>
              </div>

              {/* Expanded Section - Country Details */}
              {expandedApp === app.appPackage && (
                <div className="mt-4 pt-4 border-t border-gray-700/50">
                  <h4 className="text-sm font-semibold text-gray-300 mb-3">
                    Top Destination Countries
                  </h4>
                  <div className="space-y-2">
                    {/* Note: We don't have per-country breakdown in AppTrafficSummary */}
                    {/* This would need to be fetched separately or added to the data structure */}
                    <div className="text-sm text-gray-400 italic">
                      Country breakdown available in Timeline view
                    </div>
                  </div>
                </div>
              )}
            </CardContent>
          </Card>
        ))}
      </div>
    </ScrollArea>
  )
}
