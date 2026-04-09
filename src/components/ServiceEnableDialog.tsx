'use client'

import {
  AlertDialog,
  AlertDialogAction,
  AlertDialogCancel,
  AlertDialogContent,
  AlertDialogDescription,
  AlertDialogFooter,
  AlertDialogHeader,
  AlertDialogTitle,
} from '@/components/ui/alert-dialog'
import { Wifi, Bluetooth, MapPin, AlertTriangle } from 'lucide-react'
import { ServiceType } from '@/hooks/use-service-check'

import { useI18n } from '@/lib/i18n'

interface ServiceEnableDialogProps {
  open: boolean
  missingServices: ServiceType[]
  onEnable: () => void
  onCancel: () => void
}

export function ServiceEnableDialog({ 
  open, 
  missingServices, 
  onEnable, 
  onCancel 
}: ServiceEnableDialogProps) {
  const { t } = useI18n()
  
  const serviceInfo: Record<ServiceType, { icon: React.ReactNode; name: string; description: string }> = {
    location: {
      icon: <MapPin className="w-5 h-5 text-blue-400" />,
      name: t('devInfo.location'),
      description: t('wifi.locationRequired')
    },
    bluetooth: {
      icon: <Bluetooth className="w-5 h-5 text-blue-400" />,
      name: t('nav.bluetooth'),
      description: t('wifi.bluetoothRequired')
    },
    wifi: {
      icon: <Wifi className="w-5 h-5 text-blue-400" />,
      name: 'WiFi',
      description: t('wifi.wifiRequired')
    }
  }
  
  return (
    <AlertDialog open={open} onOpenChange={(isOpen) => !isOpen && onCancel()}>
      <AlertDialogContent className="bg-slate-900 border-slate-700">
        <AlertDialogHeader>
          <AlertDialogTitle className="text-white flex items-center gap-2">
            <AlertTriangle className="w-5 h-5 text-yellow-500" />
            {t('wifi.servicesRequired')}
          </AlertDialogTitle>
          <AlertDialogDescription className="text-slate-400">
            {t('wifi.servicesNeedEnabled')}
          </AlertDialogDescription>
        </AlertDialogHeader>
        
        <div className="space-y-3 py-4">
          {missingServices.map((service) => (
            <div 
              key={service}
              className="flex items-center gap-3 p-3 rounded-lg bg-slate-800/50 border border-slate-700"
            >
              {serviceInfo[service].icon}
              <div>
                <p className="text-white font-medium">{serviceInfo[service].name}</p>
                <p className="text-sm text-slate-400">{serviceInfo[service].description}</p>
              </div>
            </div>
          ))}
        </div>

        <AlertDialogFooter>
          <AlertDialogCancel 
            onClick={onCancel}
            className="bg-slate-800 border-slate-700 text-slate-300 hover:bg-slate-700"
          >
            {t('common.cancel')}
          </AlertDialogCancel>
          <AlertDialogAction 
            onClick={onEnable}
            className="bg-emerald-600 hover:bg-emerald-700 text-white"
          >
            {t('wifi.enableServices')}
          </AlertDialogAction>
        </AlertDialogFooter>
      </AlertDialogContent>
    </AlertDialog>
  )
}
