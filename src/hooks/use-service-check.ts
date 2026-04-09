'use client'

import { useState, useCallback } from 'react'
import { getPermissionManager, isCapacitor } from '@/lib/native-plugins'

export type ServiceType = 'location' | 'bluetooth' | 'wifi'

export interface ServiceCheckResult {
  allEnabled: boolean
  location: boolean
  bluetooth: boolean
  wifi: boolean
}

export function useServiceCheck() {
  const [isChecking, setIsChecking] = useState(false)
  const [showDialog, setShowDialog] = useState(false)
  const [missingServices, setMissingServices] = useState<ServiceType[]>([])

  const checkServices = useCallback(async (required: ServiceType[]): Promise<ServiceCheckResult> => {
    const permManager = getPermissionManager()
    
    if (!permManager) {
      // Web fallback - assume all enabled
      return {
        allEnabled: true,
        location: true,
        bluetooth: true,
        wifi: true
      }
    }

    setIsChecking(true)
    try {
      const status = await permManager.checkAllStatus()
      
      const result: ServiceCheckResult = {
        allEnabled: true,
        location: status.services.location,
        bluetooth: status.services.bluetooth,
        wifi: status.services.wifi
      }

      const missing: ServiceType[] = []
      
      if (required.includes('location') && !status.services.location) {
        missing.push('location')
        result.allEnabled = false
      }
      if (required.includes('bluetooth') && !status.services.bluetooth) {
        missing.push('bluetooth')
        result.allEnabled = false
      }
      if (required.includes('wifi') && !status.services.wifi) {
        missing.push('wifi')
        result.allEnabled = false
      }

      if (missing.length > 0) {
        setMissingServices(missing)
        setShowDialog(true)
      }

      return result
    } catch (err) {
      console.error('Service check error:', err)
      return {
        allEnabled: false,
        location: false,
        bluetooth: false,
        wifi: false
      }
    } finally {
      setIsChecking(false)
    }
  }, [])

  const enableService = useCallback(async (service: ServiceType): Promise<boolean> => {
    const permManager = getPermissionManager()
    if (!permManager) return true

    try {
      let result
      switch (service) {
        case 'location':
          result = await permManager.enableLocation()
          break
        case 'bluetooth':
          result = await permManager.enableBluetooth()
          break
        case 'wifi':
          result = await permManager.enableWifi()
          break
      }
      return result?.success || false
    } catch (err) {
      console.error(`Enable ${service} error:`, err)
      return false
    }
  }, [])

  const enableAllMissing = useCallback(async (): Promise<void> => {
    for (const service of missingServices) {
      await enableService(service)
    }
    setShowDialog(false)
  }, [missingServices, enableService])

  const closeDialog = useCallback(() => {
    setShowDialog(false)
    setMissingServices([])
  }, [])

  return {
    isChecking,
    showDialog,
    missingServices,
    checkServices,
    enableService,
    enableAllMissing,
    closeDialog
  }
}
