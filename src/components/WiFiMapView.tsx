'use client'

import { useState, useEffect, useCallback } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
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
  Filter,
  Zap,
  Signal,
  Download,
  Upload,
  Clock,
  Users,
  Star,
  ChevronRight,
  RefreshCw
} from 'lucide-react'
import { AddHotspotDialog } from './AddHotspotDialog'
import { useAuth } from '@/contexts/AuthContext'
import { useFirebaseHotspots } from '@/hooks/useFirebaseHotspots'
import { useI18n } from '@/lib/i18n'

interface Hotspot {
  id: string
  ssid: string
  location: string
  password?: string | null
  hasPassword: boolean
  isVerified: boolean
  signalStrength?: number | null
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
  updatedAt: string
}

const categories = [
  { id: 'all', name: 'All', icon: '🌐', color: 'bg-emerald-500' },
  { id: 'Cafes', name: 'Cafes', icon: '☕', color: 'bg-amber-500' },
  { id: 'Hotels', name: 'Hotels', icon: '🏨', color: 'bg-blue-500' },
  { id: 'Restaurants', name: 'Restaurants', icon: '🍽️', color: 'bg-orange-500' },
  { id: 'Public', name: 'Public', icon: '📍', color: 'bg-green-500' },
  { id: 'Transport', name: 'Transport', icon: '🚇', color: 'bg-purple-500' },
  { id: 'Shopping', name: 'Shopping', icon: '🛍️', color: 'bg-pink-500' },
]

export default function WiFiMapView() {
  const { t } = useI18n()
  const { isGuest } = useAuth()
  const { hotspots: firebaseHotspots, loading: firebaseLoading, fetchHotspots: refetchHotspots } = useFirebaseHotspots()
  
  const [hotspots, setHotspots] = useState<Hotspot[]>([])
  const [filteredHotspots, setFilteredHotspots] = useState<Hotspot[]>([])
  const [selectedCategory, setSelectedCategory] = useState('all')
  const [searchQuery, setSearchQuery] = useState('')
  const [selectedHotspot, setSelectedHotspot] = useState<Hotspot | null>(null)
  const [userLocation, setUserLocation] = useState<{ lat: number; lng: number } | null>(null)
  const [loading, setLoading] = useState(false)
  const [showAddDialog, setShowAddDialog] = useState(false)

  // Use Firebase hotspots
  useEffect(() => {
    setHotspots(firebaseHotspots)
    setFilteredHotspots(firebaseHotspots)
  }, [firebaseHotspots])

  const handleAddHotspot = () => {
    if (isGuest) {
      toast.error(t('wifiMap.guestCannotAdd'), {
        description: t('wifiMap.signUpToContribute')
      })
      return
    }
    setShowAddDialog(true)
  }

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
          // Silently handle location error - not critical
          console.log('Location not available, using default view')
          // Set default location (optional)
          setUserLocation({ lat: 40.7589, lng: -73.9851 }) // NYC default
        }
      )
    } else {
      // Geolocation not supported
      setUserLocation({ lat: 40.7589, lng: -73.9851 }) // NYC default
    }
  }, [])

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

  // Calculate distance from user location
  const calculateDistance = (lat: number, lng: number): number => {
    if (!userLocation) return 0
    const R = 6371 // Earth's radius in km
    const dLat = toRad(lat - userLocation.lat)
    const dLng = toRad(lng - userLocation.lng)
    const a =
      Math.sin(dLat / 2) * Math.sin(dLat / 2) +
      Math.cos(toRad(userLocation.lat)) * Math.cos(toRad(lat)) *
      Math.sin(dLng / 2) * Math.sin(dLng / 2)
    const c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a))
    return R * c
  }

  const toRad = (degrees: number): number => {
    return degrees * (Math.PI / 180)
  }

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
              onClick={refetchHotspots}
              disabled={firebaseLoading}
              className="border-emerald-500/30 text-emerald-400 hover:bg-emerald-500/10"
            >
              <RefreshCw className={`w-4 h-4 ${firebaseLoading ? 'animate-spin' : ''}`} />
            </Button>
            <Button
              size="sm"
              onClick={handleAddHotspot}
              className="bg-emerald-500 hover:bg-emerald-600 text-white"
            >
              <Plus className="w-4 h-4 mr-1" />
              Add Hotspot
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
        <div className="overflow-x-auto overflow-y-hidden -mx-4 px-4">
          <div className="flex gap-2 pb-2 min-w-max">
            {categories.map((cat) => (
              <Button
                key={cat.id}
                size="sm"
                variant={selectedCategory === cat.id ? 'default' : 'outline'}
                onClick={() => setSelectedCategory(cat.id)}
                className={
                  selectedCategory === cat.id
                    ? 'bg-emerald-500 hover:bg-emerald-600 text-white flex-shrink-0'
                    : 'border-emerald-500/30 text-emerald-400 hover:bg-emerald-500/10 flex-shrink-0'
                }
              >
                <span className="mr-1">{cat.icon}</span>
                {cat.name}
              </Button>
            ))}
          </div>
        </div>
      </div>

      {/* Hotspot List */}
      <ScrollArea className="flex-1 p-4">
        <div className="space-y-3">
          {filteredHotspots.map((hotspot) => {
            return (
              <Card
                key={hotspot.id}
                className="bg-slate-800/50 border-emerald-500/20 hover:border-emerald-500/40 transition-all cursor-pointer"
                onClick={() => setSelectedHotspot(hotspot)}
              >
                <CardContent className="p-4">
                  <div className="flex items-start justify-between mb-3">
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
                      {hotspot.address && (
                        <p className="text-xs text-slate-500 mt-1">{hotspot.address}</p>
                      )}
                    </div>
                    <div className="flex flex-col items-end gap-1">
                      {hotspot.hasPassword ? (
                        <Lock className="w-4 h-4 text-amber-400" />
                      ) : (
                        <Unlock className="w-4 h-4 text-emerald-400" />
                      )}
                    </div>
                  </div>

                  {/* Speed Info */}
                  {hotspot.avgDownloadSpeed && (
                    <div className="flex items-center gap-4 text-xs text-slate-400 mb-2">
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

                  {/* Footer */}
                  <div className="flex items-center justify-between text-xs text-slate-500">
                    <div className="flex items-center gap-3">
                      <span className="flex items-center gap-1">
                        <Users className="w-3 h-3" />
                        {hotspot.speedTestCount} tests
                      </span>
                      <span className="flex items-center gap-1">
                        <Clock className="w-3 h-3" />
                        {new Date(hotspot.createdAt).toLocaleDateString()}
                      </span>
                    </div>
                    <ChevronRight className="w-4 h-4 text-emerald-400" />
                  </div>
                </CardContent>
              </Card>
            )
          })}

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

      {/* Add Hotspot Dialog */}
      <AddHotspotDialog
        open={showAddDialog}
        onOpenChange={setShowAddDialog}
        onSuccess={refetchHotspots}
      />

      {/* Selected Hotspot Detail (Modal) */}
      {selectedHotspot && (
        <div
          className="fixed inset-0 bg-black/50 backdrop-blur-sm z-50 flex items-end sm:items-center justify-center p-4"
          onClick={() => setSelectedHotspot(null)}
        >
          <Card
            className="w-full max-w-lg bg-slate-900 border-emerald-500/30"
            onClick={(e) => e.stopPropagation()}
          >
            <CardHeader className="border-b border-emerald-500/20">
              <div className="flex items-start justify-between">
                <div className="flex items-center gap-3">
                  <span className="text-3xl">{selectedHotspot.categoryIcon || '📍'}</span>
                  <div>
                    <CardTitle className="text-white">{selectedHotspot.ssid}</CardTitle>
                    <p className="text-sm text-slate-400 mt-1">{selectedHotspot.location}</p>
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
            </CardHeader>
            <CardContent className="p-6 space-y-4">
              {/* Password */}
              {selectedHotspot.hasPassword && selectedHotspot.password && (
                <div className="p-4 rounded-lg bg-emerald-500/10 border border-emerald-500/30">
                  <div className="flex items-center justify-between">
                    <div>
                      <p className="text-sm text-slate-400 mb-1">Password</p>
                      <p className="text-lg font-mono text-emerald-400">{selectedHotspot.password}</p>
                    </div>
                    <Button
                      size="sm"
                      onClick={() => {
                        navigator.clipboard.writeText(selectedHotspot.password!)
                        toast.success('Password copied!')
                      }}
                      className="bg-emerald-500 hover:bg-emerald-600"
                    >
                      Copy
                    </Button>
                  </div>
                </div>
              )}

              {/* Speed Stats */}
              {selectedHotspot.avgDownloadSpeed && (
                <div className="grid grid-cols-3 gap-3">
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

              {/* Info */}
              <div className="space-y-2 text-sm">
                <div className="flex items-center justify-between py-2 border-b border-slate-700">
                  <span className="text-slate-400">Category</span>
                  <span className="text-white">{selectedHotspot.category}</span>
                </div>
                <div className="flex items-center justify-between py-2 border-b border-slate-700">
                  <span className="text-slate-400">Security</span>
                  <Badge variant={selectedHotspot.hasPassword ? 'default' : 'outline'}>
                    {selectedHotspot.hasPassword ? 'Secured' : 'Open'}
                  </Badge>
                </div>
                <div className="flex items-center justify-between py-2 border-b border-slate-700">
                  <span className="text-slate-400">Speed Tests</span>
                  <span className="text-white">{selectedHotspot.speedTestCount}</span>
                </div>
                <div className="flex items-center justify-between py-2">
                  <span className="text-slate-400">Added by</span>
                  <span className="text-white">{selectedHotspot.uploadedBy || 'Anonymous'}</span>
                </div>
              </div>

              {/* Actions */}
              <div className="flex gap-2 pt-4">
                <Button
                  className="w-full bg-emerald-500 hover:bg-emerald-600"
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
              </div>
            </CardContent>
          </Card>
        </div>
      )}
    </div>
  )
}
