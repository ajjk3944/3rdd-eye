'use client'

import { useState, useEffect } from 'react'
import { Wifi, MapPin, Lock, LockOpen, Signal, Star, Upload, Loader2, CheckCircle2, AlertCircle } from 'lucide-react'
import { Button } from '@/components/ui/button'
import { Input } from '@/components/ui/input'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Badge } from '@/components/ui/badge'
import { Sheet, SheetContent, SheetHeader, SheetTitle } from '@/components/ui/sheet'
import { Select, SelectContent, SelectItem, SelectTrigger, SelectValue } from '@/components/ui/select'
import { toast } from 'sonner'
import { wifiMapAPIV2 } from '@/lib/wifimap-api-v2'
import { useI18n } from '@/lib/i18n'

interface WiFiShareDialogProps {
  open: boolean
  onOpenChange: (open: boolean) => void
}

export default function WiFiShareDialog({ open, onOpenChange }: WiFiShareDialogProps) {
  const { t } = useI18n()
  const [step, setStep] = useState<'form' | 'location' | 'submitting' | 'success'>('form')
  const [formData, setFormData] = useState({
    ssid: '',
    password: '',
    security: 'WPA2',
    signalStrength: -60,
    comment: '',
    rating: 3
  })
  const [location, setLocation] = useState<{ lat: number; lng: number; address: string } | null>(null)
  const [gettingLocation, setGettingLocation] = useState(false)

  useEffect(() => {
    if (open) {
      setStep('form')
      setFormData({
        ssid: '',
        password: '',
        security: 'WPA2',
        signalStrength: -60,
        comment: '',
        rating: 3
      })
      setLocation(null)
    }
  }, [open])

  const handleGetLocation = async () => {
    setGettingLocation(true)
    try {
      if (!navigator.geolocation) {
        toast.error(t('wifi.geolocationNotSupported'))
        return
      }

      const position = await new Promise<GeolocationPosition>((resolve, reject) => {
        navigator.geolocation.getCurrentPosition(resolve, reject, {
          enableHighAccuracy: true,
          timeout: 10000
        })
      })

      const lat = position.coords.latitude
      const lng = position.coords.longitude

      // Reverse geocode to get address
      try {
        const response = await fetch(
          `https://nominatim.openstreetmap.org/reverse?format=json&lat=${lat}&lon=${lng}`
        )
        const data = await response.json()
        const address = data.display_name || `${lat.toFixed(4)}, ${lng.toFixed(4)}`
        
        setLocation({ lat, lng, address })
        setStep('location')
      } catch (e) {
        setLocation({ lat, lng, address: `${lat.toFixed(4)}, ${lng.toFixed(4)}` })
        setStep('location')
      }
    } catch (error) {
      toast.error(t('wifi.failedToGetLocation'))
    } finally {
      setGettingLocation(false)
    }
  }

  const handleSubmit = async () => {
    if (!location) {
      toast.error(t('wifi.pleaseGetLocation'))
      return
    }

    if (!formData.ssid) {
      toast.error(t('wifi.enterWifiName'))
      return
    }

    setStep('submitting')

    try {
      const result = await wifiMapAPIV2.shareWiFiNetwork(
        formData.ssid,
        formData.password || null,
        location.lat,
        location.lng,
        location.address,
        formData.signalStrength,
        formData.security,
        formData.comment,
        formData.rating
      )

      if (result.success) {
        setStep('success')
        setTimeout(() => {
          onOpenChange(false)
        }, 2000)
      } else {
        toast.error(result.message)
        setStep('form')
      }
    } catch (error) {
      toast.error(t('wifi.failedToShareWifi'))
      setStep('form')
    }
  }

  return (
    <Sheet open={open} onOpenChange={onOpenChange}>
      <SheetContent side="bottom" className="bg-[#0d120d] border-t border-emerald-900/30 max-h-[90vh]">
        <SheetHeader>
          <SheetTitle className="text-white flex items-center gap-2">
            <Upload className="w-5 h-5 text-emerald-400" />
            {t('wifi.shareWifiNetwork')}
          </SheetTitle>
          <p className="text-sm text-gray-500">{t('wifi.helpOthersConnect')}</p>
        </SheetHeader>

        <div className="mt-6 space-y-4">
          {step === 'form' && (
            <>
              {/* WiFi Details */}
              <Card className="bg-[#0a0f0a] border-emerald-900/30">
                <CardHeader className="pb-3">
                  <CardTitle className="text-sm text-gray-400">{t('wifi.wifiDetails')}</CardTitle>
                </CardHeader>
                <CardContent className="space-y-4">
                  {/* SSID */}
                  <div>
                    <label className="text-xs text-gray-500 mb-2 block">{t('wifi.networkNameSSID')}</label>
                    <Input
                      placeholder={t('wifi.networkNameEg')}
                      value={formData.ssid}
                      onChange={(e) => setFormData({ ...formData, ssid: e.target.value })}
                      className="bg-[#0d120d] border-emerald-900/30 text-white"
                    />
                  </div>

                  {/* Password */}
                  <div>
                    <label className="text-xs text-gray-500 mb-2 block">{t('wifi.password')} ({t('wifi.addressOptional').toLowerCase()})</label>
                    <Input
                      type="text"
                      placeholder={t('wifi.leaveEmptyForOpen')}
                      value={formData.password}
                      onChange={(e) => setFormData({ ...formData, password: e.target.value })}
                      className="bg-[#0d120d] border-emerald-900/30 text-white"
                    />
                    <p className="text-xs text-gray-600 mt-1">
                      {formData.password ? <Lock className="w-3 h-3 inline mr-1" /> : <LockOpen className="w-3 h-3 inline mr-1" />}
                      {formData.password ? t('wifi.securedNetwork') : t('wifi.openNetwork')}
                    </p>
                  </div>

                  {/* Security Type */}
                  <div>
                    <label className="text-xs text-gray-500 mb-2 block">{t('wifi.securityType')}</label>
                    <Select value={formData.security} onValueChange={(v) => setFormData({ ...formData, security: v })}>
                      <SelectTrigger className="bg-[#0d120d] border-emerald-900/30 text-white">
                        <SelectValue />
                      </SelectTrigger>
                      <SelectContent className="bg-[#0d120d] border-emerald-900/30">
                        <SelectItem value="Open">Open (No Password)</SelectItem>
                        <SelectItem value="WEP">WEP</SelectItem>
                        <SelectItem value="WPA">WPA</SelectItem>
                        <SelectItem value="WPA2">WPA2</SelectItem>
                        <SelectItem value="WPA3">WPA3</SelectItem>
                      </SelectContent>
                    </Select>
                  </div>

                  {/* Signal Strength */}
                  <div>
                    <label className="text-xs text-gray-500 mb-2 block">{t('wifi.signalStrength')}</label>
                    <div className="flex gap-2">
                      {[1, 2, 3, 4, 5].map((level) => (
                        <Button
                          key={level}
                          variant={formData.signalStrength >= -90 + (level * 10) ? 'default' : 'outline'}
                          size="sm"
                          onClick={() => setFormData({ ...formData, signalStrength: -90 + (level * 10) })}
                          className={formData.signalStrength >= -90 + (level * 10) ? 'bg-emerald-600' : ''}
                        >
                          <Signal className="w-4 h-4" />
                        </Button>
                      ))}
                    </div>
                  </div>

                  {/* Rating */}
                  <div>
                    <label className="text-xs text-gray-500 mb-2 block">{t('wifi.yourRating')}</label>
                    <div className="flex gap-1">
                      {[1, 2, 3, 4, 5].map((r) => (
                        <Button
                          key={r}
                          size="sm"
                          variant={formData.rating >= r ? 'default' : 'outline'}
                          onClick={() => setFormData({ ...formData, rating: r })}
                          className={formData.rating >= r ? 'bg-yellow-600 hover:bg-yellow-700' : ''}
                        >
                          <Star className="w-4 h-4" fill={formData.rating >= r ? 'currentColor' : 'none'} />
                        </Button>
                      ))}
                    </div>
                  </div>

                  {/* Comment */}
                  <div>
                    <label className="text-xs text-gray-500 mb-2 block">{t('wifi.commentOptional')}</label>
                    <Input
                      placeholder={t('wifi.commentEg')}
                      value={formData.comment}
                      onChange={(e) => setFormData({ ...formData, comment: e.target.value })}
                      className="bg-[#0d120d] border-emerald-900/30 text-white"
                    />
                  </div>
                </CardContent>
              </Card>

              {/* Next Button */}
              <Button
                className="w-full bg-emerald-600 hover:bg-emerald-700 h-12"
                onClick={handleGetLocation}
                disabled={!formData.ssid || gettingLocation}
              >
                {gettingLocation ? (
                  <>
                    <Loader2 className="w-4 h-4 mr-2 animate-spin" />
                    {t('wifi.gettingLocation')}
                  </>
                ) : (
                  <>
                    <MapPin className="w-4 h-4 mr-2" />
                    {t('wifi.nextSetLocation')}
                  </>
                )}
              </Button>
            </>
          )}

          {step === 'location' && location && (
            <>
              {/* Location Confirmation */}
              <Card className="bg-[#0a0f0a] border-emerald-900/30">
                <CardHeader className="pb-3">
                  <CardTitle className="text-sm text-gray-400">{t('wifi.confirmLocation')}</CardTitle>
                </CardHeader>
                <CardContent className="space-y-4">
                  <div className="bg-[#0d120d] rounded-lg p-4 text-center">
                    <MapPin className="w-8 h-8 text-orange-500 mx-auto mb-2" />
                    <p className="text-white font-medium mb-1">{location.address}</p>
                    <p className="text-xs text-gray-500">
                      {location.lat.toFixed(6)}, {location.lng.toFixed(6)}
                    </p>
                  </div>

                  <div className="bg-emerald-900/20 border border-emerald-500/30 rounded-lg p-3">
                    <p className="text-xs text-emerald-400 flex items-start gap-2">
                      <AlertCircle className="w-4 h-4 mt-0.5 flex-shrink-0" />
                      <span>{t('wifi.locationSharingNotice')}</span>
                    </p>
                  </div>

                  {/* Summary */}
                  <div className="space-y-2 text-sm">
                    <div className="flex justify-between">
                      <span className="text-gray-500">SSID:</span>
                      <span className="text-white font-medium">{formData.ssid}</span>
                    </div>
                    <div className="flex justify-between">
                      <span className="text-gray-500">{t('wifi.password')}:</span>
                      <span className="text-white font-medium">{formData.password || t('wifi.openNetwork')}</span>
                    </div>
                    <div className="flex justify-between">
                      <span className="text-gray-500">{t('wifi.security')}:</span>
                      <Badge className="bg-emerald-500/20 text-emerald-400 text-xs">{formData.security}</Badge>
                    </div>
                    <div className="flex justify-between">
                      <span className="text-gray-500">{t('wifi.yourRating')}:</span>
                      <span className="text-yellow-400">{'★'.repeat(formData.rating)}{'☆'.repeat(5 - formData.rating)}</span>
                    </div>
                  </div>
                </CardContent>
              </Card>

              {/* Action Buttons */}
              <div className="flex gap-2">
                <Button
                  variant="outline"
                  className="flex-1 border-emerald-900/30"
                  onClick={() => setStep('form')}
                >
                  {t('common.back')}
                </Button>
                <Button
                  className="flex-1 bg-emerald-600 hover:bg-emerald-700"
                  onClick={handleSubmit}
                >
                  <Upload className="w-4 h-4 mr-2" />
                  {t('wifi.shareWifiNetwork')}
                </Button>
              </div>
            </>
          )}

          {step === 'submitting' && (
            <div className="flex flex-col items-center justify-center py-12">
              <Loader2 className="w-12 h-12 text-emerald-400 animate-spin mb-4" />
              <p className="text-white font-medium">{t('wifi.sharingWifiNetwork')}</p>
              <p className="text-sm text-gray-500 mt-1">{t('wifi.pleaseWait')}</p>
            </div>
          )}

          {step === 'success' && (
            <div className="flex flex-col items-center justify-center py-12">
              <div className="w-16 h-16 bg-emerald-600 rounded-full flex items-center justify-center mb-4">
                <CheckCircle2 className="w-8 h-8 text-white" />
              </div>
              <p className="text-white font-bold text-lg">{t('wifi.wifiSharedSuccessfully')}</p>
              <p className="text-sm text-gray-500 mt-1">{t('wifi.thankYouForContributing')}</p>
            </div>
          )}
        </div>
      </SheetContent>
    </Sheet>
  )
}
