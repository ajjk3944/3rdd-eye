'use client'

import { useState, useEffect, useRef } from 'react'
import { Activity, Wifi, TrendingUp, TrendingDown } from 'lucide-react'

interface NetworkInfo {
  ssid?: string
  signalStrength?: number
  linkSpeed?: number
  frequency?: number
  isConnected?: boolean
}

interface NetworkMonitorGraphProps {
  networkInfo?: NetworkInfo | null
}

interface SignalDataPoint {
  timestamp: number
  signal: number
}

export function NetworkMonitorGraph({ networkInfo }: NetworkMonitorGraphProps) {
  const [signalHistory, setSignalHistory] = useState<SignalDataPoint[]>([])
  const [currentSignal, setCurrentSignal] = useState<number>(-50)
  const canvasRef = useRef<HTMLCanvasElement>(null)

  // Simulate real-time signal monitoring
  useEffect(() => {
    if (!networkInfo?.isConnected) return

    const interval = setInterval(() => {
      // Get signal from networkInfo or simulate
      const baseSignal = networkInfo?.signalStrength || -50
      const variation = Math.random() * 10 - 5 // ±5 dBm variation
      const newSignal = Math.round(baseSignal + variation)
      
      setCurrentSignal(newSignal)
      
      setSignalHistory(prev => {
        const newHistory = [
          ...prev,
          { timestamp: Date.now(), signal: newSignal }
        ]
        // Keep last 30 data points (30 seconds)
        return newHistory.slice(-30)
      })
    }, 1000) // Update every second

    return () => clearInterval(interval)
  }, [networkInfo?.isConnected, networkInfo?.signalStrength])

  // Draw graph on canvas
  useEffect(() => {
    const canvas = canvasRef.current
    if (!canvas || signalHistory.length < 2) return

    const ctx = canvas.getContext('2d')
    if (!ctx) return

    // Set canvas size
    const rect = canvas.getBoundingClientRect()
    canvas.width = rect.width * window.devicePixelRatio
    canvas.height = rect.height * window.devicePixelRatio
    ctx.scale(window.devicePixelRatio, window.devicePixelRatio)

    const width = rect.width
    const height = rect.height
    const padding = 20

    // Clear canvas
    ctx.clearRect(0, 0, width, height)

    // Draw grid lines
    ctx.strokeStyle = 'rgba(16, 185, 129, 0.1)'
    ctx.lineWidth = 1
    for (let i = 0; i <= 4; i++) {
      const y = padding + (height - 2 * padding) * (i / 4)
      ctx.beginPath()
      ctx.moveTo(padding, y)
      ctx.lineTo(width - padding, y)
      ctx.stroke()
    }

    // Calculate min/max for scaling
    const signals = signalHistory.map(d => d.signal)
    const minSignal = Math.min(...signals, -90)
    const maxSignal = Math.max(...signals, -30)
    const signalRange = maxSignal - minSignal || 1

    // Draw signal line
    ctx.strokeStyle = '#10B981'
    ctx.lineWidth = 2
    ctx.beginPath()

    signalHistory.forEach((point, index) => {
      const x = padding + (width - 2 * padding) * (index / (signalHistory.length - 1))
      const normalizedSignal = (point.signal - minSignal) / signalRange
      const y = height - padding - (height - 2 * padding) * normalizedSignal

      if (index === 0) {
        ctx.moveTo(x, y)
      } else {
        ctx.lineTo(x, y)
      }
    })
    ctx.stroke()

    // Draw gradient fill
    ctx.lineTo(width - padding, height - padding)
    ctx.lineTo(padding, height - padding)
    ctx.closePath()
    
    const gradient = ctx.createLinearGradient(0, padding, 0, height - padding)
    gradient.addColorStop(0, 'rgba(16, 185, 129, 0.3)')
    gradient.addColorStop(1, 'rgba(16, 185, 129, 0.0)')
    ctx.fillStyle = gradient
    ctx.fill()

  }, [signalHistory])

  const getSignalQuality = (signal: number) => {
    if (signal >= -50) return { text: 'Excellent', color: 'text-emerald-400' }
    if (signal >= -60) return { text: 'Good', color: 'text-green-400' }
    if (signal >= -70) return { text: 'Fair', color: 'text-yellow-400' }
    if (signal >= -80) return { text: 'Weak', color: 'text-orange-400' }
    return { text: 'Poor', color: 'text-red-400' }
  }

  const getSignalPercentage = (signal: number) => {
    // Convert dBm to percentage (rough approximation)
    return Math.max(0, Math.min(100, Math.round((signal + 100) * 2)))
  }

  if (!networkInfo?.isConnected) {
    return (
      <div className="text-center py-8">
        <Wifi className="w-12 h-12 text-gray-600 mx-auto mb-2" />
        <p className="text-sm text-gray-400">Not connected to WiFi</p>
      </div>
    )
  }

  const quality = getSignalQuality(currentSignal)
  const percentage = getSignalPercentage(currentSignal)
  const trend = signalHistory.length >= 2 
    ? signalHistory[signalHistory.length - 1].signal - signalHistory[signalHistory.length - 2].signal
    : 0

  return (
    <div className="space-y-4">
      {/* Live Graph */}
      <div className="relative bg-black/30 rounded-lg p-4 border border-emerald-500/20">
        <canvas
          ref={canvasRef}
          className="w-full h-40"
          style={{ display: 'block' }}
        />
        <div className="absolute top-2 right-2 flex items-center gap-1 bg-emerald-500/20 px-2 py-1 rounded">
          <div className="w-2 h-2 bg-emerald-400 rounded-full animate-pulse" />
          <span className="text-xs text-emerald-400">LIVE</span>
        </div>
      </div>

      {/* Signal Stats */}
      <div className="grid grid-cols-2 gap-3">
        <div className="bg-black/30 rounded-lg p-3 border border-emerald-500/20">
          <div className="flex items-center justify-between mb-1">
            <span className="text-xs text-gray-400">Signal Strength</span>
            {trend > 0 ? (
              <TrendingUp className="w-3 h-3 text-emerald-400" />
            ) : trend < 0 ? (
              <TrendingDown className="w-3 h-3 text-red-400" />
            ) : null}
          </div>
          <p className="text-lg font-bold text-white">{currentSignal} dBm</p>
          <p className={`text-xs ${quality.color}`}>{quality.text}</p>
        </div>

        <div className="bg-black/30 rounded-lg p-3 border border-emerald-500/20">
          <span className="text-xs text-gray-400 block mb-1">Signal Quality</span>
          <p className="text-lg font-bold text-white">{percentage}%</p>
          <div className="w-full bg-gray-700 rounded-full h-1.5 mt-2">
            <div
              className="bg-emerald-400 h-1.5 rounded-full transition-all duration-300"
              style={{ width: `${percentage}%` }}
            />
          </div>
        </div>

        {networkInfo.linkSpeed && (
          <div className="bg-black/30 rounded-lg p-3 border border-emerald-500/20">
            <span className="text-xs text-gray-400 block mb-1">Link Speed</span>
            <p className="text-lg font-bold text-white">{networkInfo.linkSpeed} Mbps</p>
          </div>
        )}

        {networkInfo.frequency && (
          <div className="bg-black/30 rounded-lg p-3 border border-emerald-500/20">
            <span className="text-xs text-gray-400 block mb-1">Frequency</span>
            <p className="text-lg font-bold text-white">
              {networkInfo.frequency >= 5000 ? '5 GHz' : '2.4 GHz'}
            </p>
          </div>
        )}
      </div>

      {/* Network Info */}
      {networkInfo.ssid && (
        <div className="bg-black/30 rounded-lg p-3 border border-emerald-500/20">
          <span className="text-xs text-gray-400 block mb-1">Connected to</span>
          <p className="text-sm font-medium text-white">{networkInfo.ssid}</p>
        </div>
      )}
    </div>
  )
}
