'use client'

import { useState, useEffect, useCallback, useRef } from 'react'
import { Card, CardContent } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Input } from '@/components/ui/input'
import { Badge } from '@/components/ui/badge'
import { ScrollArea } from '@/components/ui/scroll-area'
import { toast } from 'sonner'
import {
  MapPin,
  Wifi,
  Lock,
  Unlock,
  Search,
  Plus,
  Navigation,
  Zap,
  Download,
  Upload,
  Users,
  Star,
  RefreshCw,
  Layers
} from 'lucide-react'
import { AddHotspotDialog } from './AddHotspotDialog'

interface Hotspot {
  id: string
  ssid: string
  location: string
  password?: string | null
  hasPassword: boolean
  isVerified: boolean
  category?: string | null
  categoryIcon?: string | null
  latitude?: number | null
  longitude?: number | null
  address?: string | null
  avgDownloadSpeed?: number | null
  avgUploadSpeed?: number | null
  avgPing?: number | null
  speedTestCount: number
  uploadedBy?: string | null
  createdAt: string
}

const categories = [
  { id: 'all', name: 'All', icon: '🌐' },
  { id: 'Cafes', name: 'Cafes', icon: '☕' },
  { id: 'Hotels', name: 'Hotels', icon: '🏨' },
  { id: 'Restaurants', name: 'Restaurants', icon: '🍽️' },
  { id: 'Public', name: 'Public', icon: '📍' },
  { id: 'Transport', name: 'Transport', icon: '🚇' },
  { id: 'Shopping', name: 'Shopping', icon: '🛍️' },
]

export default function WiFiMapWithGoogle() {
  const [hotspots, setHotspots] = useState<Hotspot[]>([])
  const [filteredHotspots, setFilteredHotspots] = useState<Hotspot[]>([])
  const [selectedCategory, setSelectedCategory] = useState('all')
  const [searchQuery, setSearchQuery] = useState('')
  const [selectedHotspot, setSelectedHotspot] = useState<Hotspot | null>(null)
  const [userLocation, setUserLocation] = useState<{ lat: number; lng: number } | null>(null)
  const [loading, setLoading] = useState(false)
  const [showAddDialog, setShowAddDialog] = useState(false)
  const [mapView, setMapView] = useState(false)
  
  const mapRef = useRef<HTMLDivElement>(null)
  const googleMapRef = useRef<google.maps.Map | null>(null)
  const markersRef = useRef<google.maps.Marker[]>([])

  // Get user location
  useEffect(() => {
    if (navigator.geolocation) {
      navigator.geolocation.getCurrentPosition(
        (position) => {
          setUserLocation({
            lat: position.coords.latitude,
            lng: position.coords.longitude
          })
        },
        (error) => {
          console.error('Error getting location:', error)
          // Default to NYC
          setUserLocation({ lat: 40.7589, lng: -73.9851 })
        }
      )
    } else {
      setUserLocation({ lat: 40.7589, lng: -73.9851 })
    }
  }, [])

  // Initialize Google Map
  useEffect(() => {
    if (mapView && mapRef.current && userLocation && !googleMapRef.current) {
      // Load Google Maps script
      const script = document.createElement('script')
      script.src = `https://maps.googleapis.com/maps/api/js?key=YOUR_GOOGLE_MAPS_API_KEY`
      script.async = true
      script.onload = () => {
        if (mapRef.current) {
          googleMapRef.current = new google.maps.Map(mapRef.current, {
            center: userLocation,
            zoom: 13,
            styles: [
              {
                featureType: 'all',
                elementType: 'geometry',
                stylers: [{ color: '#1e293b' }]
              },
              {
                featureType: 'water',
                elementType: 'geometry',
                stylers: [{ color: '#0f172a' }]
              },
              {
                featureType: 'road',
                elementType: 'geometry',
                stylers: [{ color: '#334155' }]
              }
            ]
          })

          // Add user location marker
          new google.maps.Marker({
            position: userLocation,
            map: googleMapRef.current,
            icon: {
              path: google.maps.SymbolPath.CIRCLE,
              scale: 8,
              fillColor: '#10b981',
              fillOpacity: 1,
              strokeColor: '#ffffff',
              strokeWeight: 2
            },
            title: 'Your Location'
          })
        }
      }
      document.head.appendChild(script)
    }
  }, [mapView, userLocation])

  // Update map markers
  useEffect(() => {
    if (googleMapRef.current && filteredHotspots.length > 0) {
      // Clear existing markers
      markersRef.current.forEach(marker => marker.setMap(null))
      markersRef.current = []

      // Add new markers
      filteredHotspots.forEach(hotspot => {
        if (hotspot.latitude && hotspot.longitude) {
          const marker = new google.maps.Marker({
            position: { lat: hotspot.latitude, lng: hotspot.longitude },
            map: googleMapRef.current!,
            icon: {
              url: `data:image/svg+xml;charset=UTF-8,${encodeURIComponent(`
                <svg width="32" height="32" viewBox="0 0 32 32" xmlns="http://www.w3.org/2000/svg">
                  <circle cx="16" cy="16" r="14" fill="${hotspot.hasPassword ? '#f59e0b' : '#10b981'}" stroke="#fff" stroke-width="2"/>
                  <text x="16" y="20" text-anchor="middle" font-size="16" fill="#fff">${hotspot.categoryIcon || '📍'}</text>
                </svg>
              `)}`,
              scaledSize: new google.maps.Size(32, 32)
            },
            title: hotspot.ssid
          })

          marker.addListener('click', () => {
            setSelectedHotspot(hotspot)
          })

          markersRef.current.push(marker)
        }
      })
    }
  }, [filteredHotspots, googleMapRef.current])

  // Fetch hotspots
  const fetchHotspots = useCallback(async () => {
    setLoading(true)
    try {
      const params = new URLSearchParams()
      if (userLocation) {
        params.append('lat', userLocation.lat.toString())
        params.append('lng', userLocation.lng.toString())
        params.append('radius', '10')
      }

      const response = await fetch(`/api/hotspots?${params}`)
      const data = await response.json()

      if (data.success) {
        setHotspots(data.hotspots)
        setFilteredHotspots(data.hotspots)
      } else {
        toast.error('Failed to load hotspots', { description: data.error })
      }
    } catch (error: any) {
      console.error('Error fetching hotspots:', error)
      toast.error('Error loading hotspots', { description: error.message })
    } finally {
      setLoading(false)
    }
  }, [userLocation])

  useEffect(() => {
    fetchHotspots()
  }, [fetchHotspots])

  // Filter hotspots
  useEffect(() => {
    let filtered = hotspots

    if (selectedCategory !== 'all') {
      filtered = filtered.filter(h => h.category === selectedCategory)
    }

    if (searchQuery) {
      filtered = filtered.filter(h =>
        h.ssid.toLowerCase().includes(searchQuery.toLowerCase()) ||
        h.location.toLowerCase().includes(searchQuery.toLowerCase()) ||
        h.address?.toLowerCase().includes(searchQuery.toLowerCase())
      )
    }

    setFilteredHotspots(filtered)
  }, [hotspots, selectedCategory, searchQuery])

  return (
    <div className="h-full flex flex-col bg-gradient-to-br from-slate-950 via-slate-900 to-slate-950">
      {/* Header */}
      <div className="p-4 border-b border-emerald-500/20 bg-slate-900/50 backdrop-blur-sm">
        <div className="flex items-center justify-between mb-4">
          <div className="flex items-center gap-3">
            <div className="p-2 rounded-lg bg-emerald-500/20">
              <MapPin className="w-6 h-6 text-emerald-400" />
            </div>
            <div>
              <h2 className="text-xl font-bold text-white">WiFi Map</h2>
              <p className="text-sm text-slate-400">
                {filteredHotspots.length} hotspots nearby
              </p>
            </div>
          </div>
          <div className="flex gap-2">
            <Button
              size="sm"
              variant="outline"
              onClick={() => setMapView(!mapView)}
              className="border-emerald-500/30 text-emerald-400 hover:bg-emerald-500/10"
            >
              <Layers className="w-4 h-4" />
            </Button>
            <Button
              size="sm"
              variant="outline"
              onClick={fetchHotspots}
              disabled={loading}
              className="border-emerald-500/30 text-emerald-400 hover:bg-emerald-500/10"
            >
              <RefreshCw className={`w-4 h-4 ${loading ? 'animate-spin' : ''}`} />
            </Button>
            <Button
              size="sm"
              onClick={() => setShowAddDialog(true)}
              className="bg-emerald-500 hover:bg-emerald-600 text-white"
            >
              <Plus className="w-4 h-4 mr-1" />
              Add
            </Button>
          </div>
        </div>

        {/* Search */}
        <div className="relative mb-4">
          <Search className="absolute left-3 top-1/2 -translate-y-1/2 w-4 h-4 text-slate-400" />
          <Input
            placeholder="Search hotspots..."
            value={searchQuery}
            onChange={(e) => setSearchQuery(e.target.value)}
            className="pl-10 bg-slate-800/50 border-emerald-500/30 text-white placeholder:text-slate-500"
          />
        </div>

        {/* Category Filter */}
        <ScrollArea className="w-full">
          <div className="flex gap-2 pb-2">
            {categories.map((cat) => (
              <Button
                key={cat.id}
                size="sm"
                variant={selectedCategory === cat.id ? 'default' : 'outline'}
                onClick={() => setSelectedCategory(cat.id)}
                className={
                  selectedCategory === cat.id
                    ? 'bg-emerald-500 hover:bg-emerald-600 text-white'
                    : 'border-emerald-500/30 text-emerald-400 hover:bg-emerald-500/10'
                }
              >
                <span className="mr-1">{cat.icon}</span>
                {cat.name}
              </Button>
            ))}
          </div>
        </ScrollArea>
      </div>

      {/* Map or List View */}
      {mapView ? (
        <div ref={mapRef} className="flex-1 w-full" />
      ) : (
        <ScrollArea className="flex-1 p-4">
          <div className="space-y-3">
            {filteredHotspots.map((hotspot) => (
              <Card
                key={hotspot.id}
                className="bg-slate-800/50 border-emerald-500/20 hover:border-emerald-500/40 transition-all cursor-pointer"
                onClick={() => setSelectedHotspot(hotspot)}
              >
                <CardContent className="p-4">
                  <div className="flex items-start justify-between mb-2">
                    <div className="flex-1">
                      <div className="flex items-center gap-2 mb-1">
                        <span className="text-2xl">{hotspot.categoryIcon || '📍'}</span>
                        <h3 className="font-semibold text-white">{hotspot.ssid}</h3>
                        {hotspot.isVerified && (
                          <Badge className="bg-emerald-500/20 text-emerald-400 border-emerald-500/30">
                            <Star className="w-3 h-3 mr-1" />
                            Verified
                          </Badge>
                        )}
                      </div>
                      <p className="text-sm text-slate-400">{hotspot.location}</p>
                    </div>
                    {hotspot.hasPassword ? (
                      <Lock className="w-4 h-4 text-amber-400" />
                    ) : (
                      <Unlock className="w-4 h-4 text-emerald-400" />
                    )}
                  </div>

                  {hotspot.avgDownloadSpeed && (
                    <div className="flex items-center gap-4 text-xs text-slate-400">
                      <div className="flex items-center gap-1">
                        <Download className="w-3 h-3 text-emerald-400" />
                        <span>{hotspot.avgDownloadSpeed.toFixed(1)} Mbps</span>
                      </div>
                      <div className="flex items-center gap-1">
                        <Upload className="w-3 h-3 text-blue-400" />
                        <span>{hotspot.avgUploadSpeed?.toFixed(1)} Mbps</span>
                      </div>
                      <div className="flex items-center gap-1">
                        <Zap className="w-3 h-3 text-yellow-400" />
                        <span>{hotspot.avgPing}ms</span>
                      </div>
                    </div>
                  )}
                </CardContent>
              </Card>
            ))}

            {filteredHotspots.length === 0 && !loading && (
              <div className="text-center py-12">
                <MapPin className="w-12 h-12 text-slate-600 mx-auto mb-3" />
                <p className="text-slate-400">No hotspots found</p>
                <p className="text-sm text-slate-500 mt-1">
                  Try adjusting your filters or add a new hotspot
                </p>
              </div>
            )}
          </div>
        </ScrollArea>
      )}

      {/* Add Hotspot Dialog */}
      <AddHotspotDialog
        open={showAddDialog}
        onOpenChange={setShowAddDialog}
        onSuccess={fetchHotspots}
      />

      {/* Selected Hotspot Detail */}
      {selectedHotspot && (
        <div
          className="fixed inset-0 bg-black/50 backdrop-blur-sm z-50 flex items-end sm:items-center justify-center p-4"
          onClick={() => setSelectedHotspot(null)}
        >
          <Card
            className="w-full max-w-lg bg-slate-900 border-emerald-500/30"
            onClick={(e) => e.stopPropagation()}
          >
            <CardContent className="p-6">
              <div className="flex items-start justify-between mb-4">
                <div className="flex items-center gap-3">
                  <span className="text-3xl">{selectedHotspot.categoryIcon || '📍'}</span>
                  <div>
                    <h3 className="text-xl font-bold text-white">{selectedHotspot.ssid}</h3>
                    <p className="text-sm text-slate-400">{selectedHotspot.location}</p>
                  </div>
                </div>
                <Button
                  size="sm"
                  variant="ghost"
                  onClick={() => setSelectedHotspot(null)}
                  className="text-slate-400 hover:text-white"
                >
                  ✕
                </Button>
              </div>

              {selectedHotspot.hasPassword && selectedHotspot.password && (
                <div className="p-4 rounded-lg bg-emerald-500/10 border border-emerald-500/30 mb-4">
                  <p className="text-sm text-slate-400 mb-1">Password</p>
                  <p className="text-lg font-mono text-emerald-400">{selectedHotspot.password}</p>
                </div>
              )}

              {selectedHotspot.avgDownloadSpeed && (
                <div className="grid grid-cols-3 gap-3 mb-4">
                  <div className="p-3 rounded-lg bg-slate-800/50 border border-emerald-500/20">
                    <Download className="w-5 h-5 text-emerald-400 mb-2" />
                    <p className="text-xs text-slate-400">Download</p>
                    <p className="text-lg font-semibold text-white">
                      {selectedHotspot.avgDownloadSpeed.toFixed(1)}
                    </p>
                    <p className="text-xs text-slate-500">Mbps</p>
                  </div>
                  <div className="p-3 rounded-lg bg-slate-800/50 border border-blue-500/20">
                    <Upload className="w-5 h-5 text-blue-400 mb-2" />
                    <p className="text-xs text-slate-400">Upload</p>
                    <p className="text-lg font-semibold text-white">
                      {selectedHotspot.avgUploadSpeed?.toFixed(1)}
                    </p>
                    <p className="text-xs text-slate-500">Mbps</p>
                  </div>
                  <div className="p-3 rounded-lg bg-slate-800/50 border border-yellow-500/20">
                    <Zap className="w-5 h-5 text-yellow-400 mb-2" />
                    <p className="text-xs text-slate-400">Ping</p>
                    <p className="text-lg font-semibold text-white">
                      {selectedHotspot.avgPing}
                    </p>
                    <p className="text-xs text-slate-500">ms</p>
                  </div>
                </div>
              )}

              <div className="flex gap-2">
                <Button
                  className="flex-1 bg-emerald-500 hover:bg-emerald-600"
                  onClick={() => {
                    if (selectedHotspot.latitude && selectedHotspot.longitude) {
                      window.open(
                        `https://www.google.com/maps/dir/?api=1&destination=${selectedHotspot.latitude},${selectedHotspot.longitude}`,
                        '_blank'
                      )
                    }
                  }}
                >
                  <Navigation className="w-4 h-4 mr-2" />
                  Navigate
                </Button>
                <Button
                  variant="outline"
                  className="flex-1 border-emerald-500/30 text-emerald-400 hover:bg-emerald-500/10"
                >
                  <Zap className="w-4 h-4 mr-2" />
                  Speed Test
                </Button>
              </div>
            </CardContent>
          </Card>
        </div>
      )}
    </div>
  )
}
