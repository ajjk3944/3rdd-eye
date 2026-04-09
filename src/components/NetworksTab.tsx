'use client'

import { StandaloneWiFiScanner } from '@/components/StandaloneWiFiScanner'
import { NetworkUsagePanel } from '@/components/NetworkUsagePanel'

interface NetworksTabProps {
  onNetworkChange?: () => void
}

export function NetworksTab({ onNetworkChange }: NetworksTabProps) {
  return (
    <div className="space-y-4 pb-4">
      {/* Main WiFi Scanner with Connected WiFi, Spectrum, SSID List, Channel Health */}
      <StandaloneWiFiScanner />
      
      {/* Network Usage Monitor - Live Speed Display */}
      <NetworkUsagePanel />
    </div>
  )
}
