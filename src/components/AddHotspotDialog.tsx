'use client'

import { useState } from 'react'
import { Button } from '@/components/ui/button'
import { Input } from '@/components/ui/input'
import { Label } from '@/components/ui/label'
import {
  Dialog,
  DialogContent,
  DialogDescription,
  DialogFooter,
  DialogHeader,
  DialogTitle,
} from '@/components/ui/dialog'
import {
  Select,
  SelectContent,
  SelectItem,
  SelectTrigger,
  SelectValue,
} from '@/components/ui/select'
import { Switch } from '@/components/ui/switch'
import { toast } from 'sonner'
import { MapPin, Wifi, Lock } from 'lucide-react'
import { useI18n } from '@/lib/i18n'

interface AddHotspotDialogProps {
  open: boolean
  onOpenChange: (open: boolean) => void
  onSuccess?: () => void
}

const categories = [
  { value: 'Cafes', label: 'Cafes', icon: '☕' },
  { value: 'Hotels', label: 'Hotels', icon: '🏨' },
  { value: 'Restaurants', label: 'Restaurants', icon: '🍽️' },
  { value: 'Public', label: 'Public', icon: '📍' },
  { value: 'Transport', label: 'Transport', icon: '🚇' },
  { value: 'Shopping', label: 'Shopping', icon: '🛍️' },
]

import { useFirebaseHotspots } from '@/hooks/useFirebaseHotspots'

export function AddHotspotDialog({ open, onOpenChange, onSuccess }: AddHotspotDialogProps) {
  const { t } = useI18n()
  const { addHotspot } = useFirebaseHotspots()
  const [loading, setLoading] = useState(false)
  const [formData, setFormData] = useState({
    ssid: '',
    location: '',
    address: '',
    password: '',
    hasPassword: false,
    category: 'Public',
    categoryIcon: '📍',
    uploadedBy: ''
  })
  const [useCurrentLocation, setUseCurrentLocation] = useState(true)
  const [coordinates, setCoordinates] = useState<{ lat: number; lng: number } | null>(null)

  // Get current location and auto-fill location name
  const getCurrentLocation = () => {
    if (navigator.geolocation) {
      navigator.geolocation.getCurrentPosition(
        async (position) => {
          const lat = position.coords.latitude
          const lng = position.coords.longitude
          
          setCoordinates({ lat, lng })
          
          // Reverse geocode to get location name
          try {
            const response = await fetch(
              `https://nominatim.openstreetmap.org/reverse?format=json&lat=${lat}&lon=${lng}`
            )
            const data = await response.json()
            
            // Extract location name from address
            const locationName = data.address?.city || 
                                data.address?.town || 
                                data.address?.village || 
                                data.address?.suburb ||
                                data.address?.neighbourhood ||
                                `${lat.toFixed(4)}, ${lng.toFixed(4)}`
            
            // Auto-fill location name
            setFormData(prev => ({
              ...prev,
              location: locationName,
              address: data.display_name || ''
            }))
            
            toast.success(t('wifi.locationCapturedAndFilled'))
          } catch (e) {
            toast.success(t('wifi.locationCaptured'))
          }
        },
        (error) => {
          // Silently handle - user can still add hotspot without exact location
          console.log('Location not available')
          toast.info(t('wifi.locationNotAvailable'), {
            description: t('wifi.locationNotAvailableDesc')
          })
        }
      )
    } else {
      toast.info(t('wifi.geolocationNotSupported'), {
        description: t('wifi.locationNotAvailableDesc')
      })
    }
  }

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault()

    if (!formData.ssid || !formData.location) {
      toast.error(t('wifi.fillRequiredFields'))
      return
    }

    setLoading(true)

    try {
      // Get location if needed
      let lat = coordinates?.lat
      let lng = coordinates?.lng

      if (useCurrentLocation && !coordinates) {
        try {
          await new Promise<void>((resolve, reject) => {
            navigator.geolocation.getCurrentPosition(
              (position) => {
                lat = position.coords.latitude
                lng = position.coords.longitude
                resolve()
              },
              () => {
                // Location not available - continue without it
                console.log('Location not available, adding hotspot without GPS')
                resolve()
              }
            )
          })
        } catch (err) {
          // Continue without location
          console.log('Could not get location')
        }
      }

      const result = await addHotspot({
        ...formData,
        latitude: lat || null,
        longitude: lng || null,
        isVerified: false,
        speedTestCount: 0,
        avgDownloadSpeed: null,
        avgUploadSpeed: null,
        avgPing: null
      })

      if (result) {
        onOpenChange(false)
        onSuccess?.()
        // Reset form
        setFormData({
          ssid: '',
          location: '',
          address: '',
          password: '',
          hasPassword: false,
          category: 'Public',
          categoryIcon: '📍',
          uploadedBy: ''
        })
        setCoordinates(null)
      }
    } catch (error: any) {
      console.error('Error adding hotspot:', error)
    } finally {
      setLoading(false)
    }
  }

  return (
    <Dialog open={open} onOpenChange={onOpenChange}>
      <DialogContent className="bg-slate-900 border-emerald-500/30 text-white max-w-md">
        <DialogHeader>
          <DialogTitle className="flex items-center gap-2">
            <Wifi className="w-5 h-5 text-emerald-400" />
            {t('wifi.addWifiHotspot')}
          </DialogTitle>
          <DialogDescription className="text-slate-400">
            {t('wifi.shareWithCommunity')}
          </DialogDescription>
        </DialogHeader>

        <form onSubmit={handleSubmit} className="space-y-4">
          {/* SSID */}
          <div className="space-y-2">
            <Label htmlFor="ssid" className="text-slate-300">
              {t('wifi.networkNameSSID')}
            </Label>
            <Input
              id="ssid"
              value={formData.ssid}
              onChange={(e) => setFormData({ ...formData, ssid: e.target.value })}
              placeholder=""
              className="bg-slate-800/50 border-emerald-500/30 text-white"
              required
            />
          </div>

          {/* Location */}
          <div className="space-y-2">
            <Label htmlFor="location" className="text-slate-300">
              {t('wifi.locationName')}
            </Label>
            <Input
              id="location"
              value={formData.location}
              onChange={(e) => setFormData({ ...formData, location: e.target.value })}
              placeholder=""
              className="bg-slate-800/50 border-emerald-500/30 text-white"
              required
            />
          </div>

          {/* Address */}
          <div className="space-y-2">
            <Label htmlFor="address" className="text-slate-300">
              {t('wifi.addressOptional')}
            </Label>
            <Input
              id="address"
              value={formData.address}
              onChange={(e) => setFormData({ ...formData, address: e.target.value })}
              placeholder=""
              className="bg-slate-800/50 border-emerald-500/30 text-white"
            />
          </div>

          {/* Category */}
          <div className="space-y-2">
            <Label htmlFor="category" className="text-slate-300">
              {t('wifi.category')}
            </Label>
            <Select
              value={formData.category}
              onValueChange={(value) => {
                const cat = categories.find(c => c.value === value)
                setFormData({
                  ...formData,
                  category: value,
                  categoryIcon: cat?.icon || '📍'
                })
              }}
            >
              <SelectTrigger className="bg-slate-800/50 border-emerald-500/30 text-white">
                <SelectValue />
              </SelectTrigger>
              <SelectContent className="bg-slate-800 border-emerald-500/30">
                {categories.map((cat) => (
                  <SelectItem key={cat.value} value={cat.value} className="text-white">
                    <span className="flex items-center gap-2">
                      <span>{cat.icon}</span>
                      <span>{cat.label}</span>
                    </span>
                  </SelectItem>
                ))}
              </SelectContent>
            </Select>
          </div>

          {/* Has Password */}
          <div className="flex items-center justify-between p-3 rounded-lg bg-slate-800/50 border border-emerald-500/20">
            <div className="flex items-center gap-2">
              <Lock className="w-4 h-4 text-slate-400" />
              <Label htmlFor="hasPassword" className="text-slate-300 cursor-pointer">
                {t('wifi.passwordProtected')}
              </Label>
            </div>
            <Switch
              id="hasPassword"
              checked={formData.hasPassword}
              onCheckedChange={(checked) => setFormData({ ...formData, hasPassword: checked })}
            />
          </div>

          {/* Password */}
          {formData.hasPassword && (
            <div className="space-y-2">
              <Label htmlFor="password" className="text-slate-300">
                {t('wifi.password')}
              </Label>
              <Input
                id="password"
                type="text"
                value={formData.password}
                onChange={(e) => setFormData({ ...formData, password: e.target.value })}
                placeholder={t('wifi.enterPassword')}
                className="bg-slate-800/50 border-emerald-500/30 text-white"
              />
            </div>
          )}

          {/* Use Current Location */}
          <div className="flex items-center justify-between p-3 rounded-lg bg-slate-800/50 border border-emerald-500/20">
            <div className="flex items-center gap-2">
              <MapPin className="w-4 h-4 text-slate-400" />
              <Label htmlFor="useLocation" className="text-slate-300 cursor-pointer">
                {t('wifi.useCurrentLocation')}
              </Label>
            </div>
            <Switch
              id="useLocation"
              checked={useCurrentLocation}
              onCheckedChange={setUseCurrentLocation}
            />
          </div>

          {useCurrentLocation && (
            <Button
              type="button"
              variant="outline"
              onClick={getCurrentLocation}
              className="w-full border-emerald-500/30 text-emerald-400 hover:bg-emerald-500/10"
            >
              <MapPin className="w-4 h-4 mr-2" />
              {coordinates ? t('wifi.locationCaptured') : t('wifi.captureLocation')}
            </Button>
          )}

          {/* Uploaded By */}
          <div className="space-y-2">
            <Label htmlFor="uploadedBy" className="text-slate-300">
              {t('wifi.yourNameOptional')}
            </Label>
            <Input
              id="uploadedBy"
              value={formData.uploadedBy}
              onChange={(e) => setFormData({ ...formData, uploadedBy: e.target.value })}
              placeholder={t('wifi.anonymous')}
              className="bg-slate-800/50 border-emerald-500/30 text-white"
            />
          </div>

          <DialogFooter>
            <Button
              type="button"
              variant="outline"
              onClick={() => onOpenChange(false)}
              className="border-slate-600 text-slate-400 hover:bg-slate-800"
            >
              {t('common.cancel')}
            </Button>
            <Button
              type="submit"
              disabled={loading}
              className="bg-emerald-500 hover:bg-emerald-600 text-white"
            >
              {loading ? t('wifi.addingHotspot') : t('wifi.addHotspot')}
            </Button>
          </DialogFooter>
        </form>
      </DialogContent>
    </Dialog>
  )
}
