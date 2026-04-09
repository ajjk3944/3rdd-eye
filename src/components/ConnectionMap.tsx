'use client'

import { useState, useEffect, useMemo } from 'react'
import { ComposableMap, Geographies, Geography, Marker } from 'react-simple-maps'
import { Card, CardContent } from '@/components/ui/card'
import { Badge } from '@/components/ui/badge'
import { Globe, AlertTriangle } from 'lucide-react'
import { type CountryTraffic } from '@/lib/native-plugins'

interface ConnectionMapProps {
  countries: CountryTraffic[]
  loading?: boolean
}

// ISO Alpha-2 to ISO Numeric mapping for country identification
const alpha2ToNumeric: Record<string, string> = {
  'US': '840', 'CN': '156', 'IN': '356', 'GB': '826', 'DE': '276',
  'FR': '250', 'JP': '392', 'BR': '076', 'RU': '643', 'AU': '036',
  'CA': '124', 'KR': '410', 'SG': '702', 'NL': '528', 'SE': '752',
  'IT': '380', 'ES': '724', 'CH': '756', 'IE': '372', 'FI': '246',
  'NO': '578', 'DK': '208', 'PL': '616', 'AT': '040', 'BE': '056',
  'PT': '620', 'CZ': '203', 'RO': '642', 'HU': '348', 'GR': '300',
  'TR': '792', 'IL': '376', 'AE': '784', 'ZA': '710', 'MX': '484',
  'AR': '032', 'CL': '152', 'CO': '170', 'EG': '818', 'NG': '566',
  'KE': '404', 'TH': '764', 'VN': '704', 'MY': '458', 'PH': '608',
  'ID': '360', 'PK': '586', 'BD': '050', 'LK': '144', 'TW': '158',
  'HK': '344', 'UA': '804', 'SA': '682'
}

// ISO Alpha-2 to Alpha-3 mapping for common countries
const alpha2ToAlpha3: Record<string, string> = {
  'US': 'USA', 'CN': 'CHN', 'IN': 'IND', 'GB': 'GBR', 'DE': 'DEU',
  'FR': 'FRA', 'BR': 'BRA', 'IT': 'ITA', 'CA': 'CAN', 'KR': 'KOR',
  'RU': 'RUS', 'ES': 'ESP', 'AU': 'AUS', 'MX': 'MEX', 'ID': 'IDN',
  'NL': 'NLD', 'SA': 'SAU', 'TR': 'TUR', 'CH': 'CHE', 'PL': 'POL',
  'BE': 'BEL', 'SE': 'SWE', 'NG': 'NGA', 'AR': 'ARG', 'NO': 'NOR',
  'AT': 'AUT', 'AE': 'ARE', 'IL': 'ISR', 'IE': 'IRL', 'PH': 'PHL',
  'MY': 'MYS', 'SG': 'SGP', 'DK': 'DNK', 'CO': 'COL', 'PK': 'PAK',
  'CL': 'CHL', 'FI': 'FIN', 'BD': 'BGD', 'EG': 'EGY', 'VN': 'VNM',
  'CZ': 'CZE', 'RO': 'ROU', 'PT': 'PRT', 'GR': 'GRC', 'NZ': 'NZL',
  'HU': 'HUN', 'UA': 'UKR', 'DZ': 'DZA', 'QA': 'QAT', 'KW': 'KWT',
  'MA': 'MAR', 'SK': 'SVK', 'EC': 'ECU', 'PR': 'PRI', 'IQ': 'IRQ',
  'KZ': 'KAZ', 'PE': 'PER', 'LU': 'LUX', 'UY': 'URY', 'HR': 'HRV',
  'TH': 'THA', 'JP': 'JPN', 'ZA': 'ZAF', 'TW': 'TWN', 'HK': 'HKG'
}

const countryCodeToFlag = (code: string): string => {
  if (!code || code.length !== 2) return '🌐'
  return code
    .toUpperCase()
    .split('')
    .map(char => String.fromCodePoint(0x1F1E6 + char.charCodeAt(0) - 65))
    .join('')
}

const formatBytes = (bytes: number): string => {
  if (bytes < 1024) return `${bytes} B`
  if (bytes < 1024 * 1024) return `${(bytes / 1024).toFixed(1)} KB`
  if (bytes < 1024 * 1024 * 1024) return `${(bytes / (1024 * 1024)).toFixed(1)} MB`
  return `${(bytes / (1024 * 1024 * 1024)).toFixed(1)} GB`
}

export function ConnectionMap({ countries, loading }: ConnectionMapProps) {
  const [topology, setTopology] = useState<any>(null)
  const [selectedCountry, setSelectedCountry] = useState<CountryTraffic | null>(null)

  // Load topology data
  useEffect(() => {
    fetch('/countries-110m.json')
      .then(res => res.json())
      .then(data => setTopology(data))
      .catch(err => console.error('Failed to load map topology:', err))
  }, [])

  // Create a map of country codes to traffic data (support multiple formats)
  const countryTrafficMap = useMemo(() => {
    const map = new Map<string, CountryTraffic>()
    countries.forEach(country => {
      const alpha3 = alpha2ToAlpha3[country.countryCode]
      const numeric = alpha2ToNumeric[country.countryCode]
      
      // Store by all possible identifiers
      map.set(country.countryCode, country) // Alpha-2
      if (alpha3) map.set(alpha3, country) // Alpha-3
      if (numeric) map.set(numeric, country) // Numeric
    })
    return map
  }, [countries])

  // Calculate statistics
  const stats = useMemo(() => {
    const totalBytes = countries.reduce((sum, c) => sum + c.totalBytes, 0)
    const totalConnections = countries.reduce((sum, c) => sum + c.totalConnections, 0)
    const suspiciousCountries = 0 // We don't have suspicious flag in CountryTraffic, but could add it
    return { totalBytes, totalConnections, suspiciousCountries }
  }, [countries])

  // Get color for country based on traffic volume
  const getCountryColor = (countryCode: string): string => {
    const traffic = countryTrafficMap.get(countryCode)
    if (!traffic) return '#1e293b' // Default slate-800 for no traffic

    const connections = traffic.totalConnections
    
    // Check if suspicious (you can add this field to CountryTraffic if needed)
    // if (traffic.isSuspicious) return '#ef4444' // red-500 for suspicious
    
    // Color scale based on connection count with varying opacity
    if (connections > 100) return '#06b6d4' // cyan-500 high traffic
    if (connections > 50) return 'rgba(6, 182, 212, 0.8)' // cyan-500 80% opacity
    if (connections > 10) return 'rgba(6, 182, 212, 0.6)' // cyan-500 60% opacity
    return 'rgba(6, 182, 212, 0.4)' // cyan-500 40% opacity minimum
  }

  // Get marker size based on connections
  const getMarkerSize = (connections: number): number => {
    if (connections > 100) return 16
    if (connections > 50) return 12
    if (connections > 10) return 8
    return 4
  }

  // Handle country click/tap
  const handleCountryClick = (geo: any, event: any) => {
    // Try multiple identifier formats
    const countryCode = geo.properties.ISO_A3 || geo.properties.ISO_A2 || geo.id
    const traffic = countryTrafficMap.get(countryCode)
    
    if (traffic) {
      setSelectedCountry(traffic)
    }
  }

  if (loading) {
    return (
      <Card className="bg-[#0d120d] border-gray-700/50">
        <CardContent className="p-8 text-center">
          <div className="flex flex-col items-center gap-4">
            <div className="w-8 h-8 border-4 border-cyan-400 border-t-transparent rounded-full animate-spin" />
            <p className="text-gray-300">Loading map data...</p>
          </div>
        </CardContent>
      </Card>
    )
  }

  if (!topology) {
    return (
      <Card className="bg-[#0d120d] border-gray-700/50">
        <CardContent className="p-8 text-center">
          <Globe className="w-16 h-16 text-gray-600 mx-auto mb-4" />
          <p className="text-gray-300">Loading world map...</p>
        </CardContent>
      </Card>
    )
  }

  if (countries.length === 0) {
    return (
      <Card className="bg-[#0d120d] border-gray-700/50">
        <CardContent className="p-8 text-center">
          <Globe className="w-16 h-16 text-gray-600 mx-auto mb-4" />
          <h3 className="text-lg font-bold text-white mb-2">No traffic data yet</h3>
          <p className="text-gray-300">Start capturing to see global connections</p>
        </CardContent>
      </Card>
    )
  }

  return (
    <div className="space-y-4">
      {/* Summary Header */}
      <Card className="bg-[#0d120d] border-gray-700/50">
        <CardContent className="p-4">
          <div className="flex items-center justify-between flex-wrap gap-4">
            <div className="flex items-center gap-2">
              <Globe className="w-5 h-5 text-cyan-400" />
              <span className="text-white font-semibold">
                Traffic to {countries.length} {countries.length === 1 ? 'country' : 'countries'}
              </span>
            </div>
            <div className="flex items-center gap-4 text-sm flex-wrap">
              <div className="text-gray-300">
                <span className="text-white font-bold">{stats.totalConnections.toLocaleString()}</span> connections
              </div>
              <div className="text-gray-300">
                <span className="text-white font-bold">{formatBytes(stats.totalBytes)}</span> transferred
              </div>
              {stats.suspiciousCountries > 0 && (
                <Badge variant="destructive" className="bg-red-500/20 text-red-300 border-red-500/30">
                  <AlertTriangle className="w-3 h-3 mr-1" />
                  {stats.suspiciousCountries} flagged
                </Badge>
              )}
            </div>
          </div>
        </CardContent>
      </Card>

      {/* World Map */}
      <Card className="bg-[#0d120d] border-gray-700/50 relative">
        <CardContent className="p-4">
          <div className="relative">
            <ComposableMap
              projection="geoMercator"
              projectionConfig={{
                scale: 147,
                center: [0, 20]
              }}
              style={{
                width: '100%',
                height: 'auto'
              }}
            >
              <Geographies geography={topology}>
                {({ geographies }: { geographies: any[] }) =>
                  geographies.map((geo: any) => {
                    // Try multiple identifier formats
                    const iso3 = geo.properties.ISO_A3
                    const iso2 = geo.properties.ISO_A2
                    const id = geo.id
                    
                    const hasTraffic = countryTrafficMap.has(iso3) || 
                                      countryTrafficMap.has(iso2) || 
                                      countryTrafficMap.has(id)
                    
                    const countryCode = iso3 || iso2 || id
                    
                    return (
                      <Geography
                        key={geo.rsmKey}
                        geography={geo}
                        fill={getCountryColor(countryCode)}
                        stroke="#334155"
                        strokeWidth={0.5}
                        style={{
                          default: {
                            outline: 'none',
                            transition: 'all 0.2s ease-in-out'
                          },
                          hover: {
                            fill: hasTraffic ? '#22d3ee' : '#1e293b',
                            outline: 'none',
                            cursor: hasTraffic ? 'pointer' : 'default',
                            stroke: '#475569',
                            strokeWidth: 1
                          },
                          pressed: {
                            fill: hasTraffic ? '#06b6d4' : '#1e293b',
                            outline: 'none'
                          }
                        }}
                        onClick={(event: any) => handleCountryClick(geo, event)}
                      />
                    )
                  })
                }
              </Geographies>

              {/* Country Markers */}
              {countries.map((country) => {
                const alpha3 = alpha2ToAlpha3[country.countryCode] || country.countryCode
                
                // Find the geography for this country to get its centroid
                const geo = topology.objects.countries.geometries.find(
                  (g: any) => g.properties.ISO_A3 === alpha3 || 
                             g.properties.ISO_A2 === country.countryCode ||
                             g.id === alpha3
                )
                
                if (!geo) return null

                // Calculate centroid (simplified - using properties if available)
                const coordinates = geo.properties.centroid || [0, 0]
                const markerSize = getMarkerSize(country.totalConnections)

                return (
                  <Marker key={country.countryCode} coordinates={coordinates}>
                    <circle
                      r={markerSize}
                      fill="#22d3ee"
                      stroke="#0891b2"
                      strokeWidth={1}
                      className="animate-pulse"
                      style={{
                        filter: 'drop-shadow(0 0 4px rgba(34, 211, 238, 0.6))'
                      }}
                    />
                    <text
                      textAnchor="middle"
                      y={markerSize + 12}
                      className="text-[8px] fill-white font-bold"
                      style={{ pointerEvents: 'none' }}
                    >
                      {country.totalConnections}
                    </text>
                  </Marker>
                )
              })}
            </ComposableMap>

            {/* Tooltip */}
            {selectedCountry && (
              <div
                className="absolute bg-[#0d120d] border border-cyan-500/50 rounded-lg p-3 shadow-lg z-10 pointer-events-none"
                style={{
                  left: '50%',
                  bottom: '1rem',
                  transform: 'translateX(-50%)',
                  maxWidth: '90%'
                }}
              >
                <div className="space-y-2">
                  <div className="flex items-center gap-2">
                    <span className="text-2xl">{countryCodeToFlag(selectedCountry.countryCode)}</span>
                    <span className="text-white font-bold">{selectedCountry.countryName}</span>
                  </div>
                  <div className="grid grid-cols-2 gap-2 text-sm">
                    <div>
                      <span className="text-gray-300">Connections:</span>
                      <span className="text-white font-semibold ml-2">
                        {selectedCountry.totalConnections.toLocaleString()}
                      </span>
                    </div>
                    <div>
                      <span className="text-gray-300">Data:</span>
                      <span className="text-white font-semibold ml-2">
                        {formatBytes(selectedCountry.totalBytes)}
                      </span>
                    </div>
                  </div>
                  <div>
                    <span className="text-gray-300 text-sm">Apps:</span>
                    <span className="text-white font-semibold ml-2 text-sm">
                      {selectedCountry.uniqueApps}
                    </span>
                  </div>
                </div>
                <button
                  onClick={() => setSelectedCountry(null)}
                  className="absolute top-2 right-2 text-gray-300 hover:text-white pointer-events-auto"
                >
                  ×
                </button>
              </div>
            )}
          </div>

          {/* Legend */}
          <div className="mt-4 flex items-center justify-center gap-6 text-xs text-gray-300">
            <div className="flex items-center gap-2">
              <div className="w-4 h-4 rounded" style={{ backgroundColor: '#06b6d4' }} />
              <span>Normal Traffic</span>
            </div>
            <div className="flex items-center gap-2">
              <div className="w-4 h-4 rounded" style={{ backgroundColor: '#ef4444' }} />
              <span>Suspicious</span>
            </div>
          </div>

          {/* Tap instruction */}
          <div className="mt-2 text-center text-xs text-gray-400">
            Tap a highlighted country to see details
          </div>
        </CardContent>
      </Card>
    </div>
  )
}
