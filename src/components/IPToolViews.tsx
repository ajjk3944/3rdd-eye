// This file contains the Traceroute, Ping, and Port Scanner view components
// These are separated to keep the main IPTools file manageable

import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Input } from '@/components/ui/input'
import { Badge } from '@/components/ui/badge'
import { ScrollArea } from '@/components/ui/scroll-area'
import {
  ArrowLeft,
  Route,
  Activity,
  Server,
  Globe,
  Play,
  Square,
  Trash2,
  ChevronRight,
  Download,
  Upload,
} from 'lucide-react'

const POPULAR_TARGETS = ['google.com', 'facebook.com']

// Ping Graph Component
function PingGraph({ times }: { times: number[] }) {
  const maxTime = Math.max(...times, 1)
  const minTime = Math.min(...times)
  const height = 120
  const width = 300
  const padding = 30
  
  const points = times.map((time, i) => {
    const x = padding + (i / (times.length - 1)) * (width - padding * 2)
    const y = height - padding - ((time - minTime) / (maxTime - minTime || 1)) * (height - padding * 2)
    return `${x},${y}`
  }).join(' ')

  const yLabels = [maxTime, Math.round((maxTime + minTime) / 2), minTime]

  return (
    <div className="relative">
      <svg viewBox={`0 0 ${width} ${height}`} className="w-full h-32">
        {[0, 1, 2, 3].map(i => (
          <line
            key={i}
            x1={padding}
            y1={padding + i * ((height - padding * 2) / 3)}
            x2={width - padding}
            y2={padding + i * ((height - padding * 2) / 3)}
            stroke="#333"
            strokeDasharray="2,2"
          />
        ))}
        
        {yLabels.map((label, i) => (
          <text
            key={i}
            x={padding - 5}
            y={padding + i * ((height - padding * 2) / 2)}
            fill="#666"
            fontSize="10"
            textAnchor="end"
            dominantBaseline="middle"
          >
            {label}
          </text>
        ))}
        
        <polyline
          points={points}
          fill="none"
          stroke="#3b82f6"
          strokeWidth="2"
          strokeLinecap="round"
          strokeLinejoin="round"
        />
        
        {times.map((time, i) => {
          const x = padding + (i / (times.length - 1)) * (width - padding * 2)
          const y = height - padding - ((time - minTime) / (maxTime - minTime || 1)) * (height - padding * 2)
          return (
            <circle
              key={i}
              cx={x}
              cy={y}
              r="3"
              fill="#3b82f6"
            />
          )
        })}
      </svg>
    </div>
  )
}

export { PingGraph, POPULAR_TARGETS }
