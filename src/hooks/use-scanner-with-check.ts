'use client'

import { useState, useCallback } from 'react'
import { getPermissionManager, isCapacitor } from '@/lib/native-plugins'
import { ServiceType } from './use-service-check'

export interface ScannerCheckResult {
  canProceed: boolean
  missingServices: ServiceType[]
}

export function useScannerWithCheck() {
  const [showServiceDialog, setShowServiceDialog] = useState(false)
  const [missingServices, setMissingServices] = useState<ServiceType[]>([])
  const [pendingAction, setPendingAction] = useState<(() => Promise<void>) | null>(null)

  const checkServicesBeforeScan = useCallback(async (
    requiredServices: ServiceType[],
    scanAction: () => Promise<void>
  ): Promise<boolean> => {
    if (!isCapacitor) {
      // Web mode - just proceed
      await scanAction()
      return true
    }

    const permManager = getPermissionManager()
    if (!permManager) {
      await scanAction()
      return true
    }

    try {
      const status = await permManager.checkAllStatus()
      const missing: ServiceType[] = []

      if (requiredServices.includes('location') && !status.services.location) {
        missing.push('location')
      }
      if (requiredServices.includes('bluetooth') && !status.services.bluetooth) {
        missing.push('bluetooth')
      }
      if (requiredServices.includes('wifi') && !status.services.wifi) {
        missing.push('wifi')
      }

      if (missing.length > 0) {
        setMissingServices(missing)
        setPendingAction(() => scanAction)
        setShowServiceDialog(true)
        return false
      }

      // All services enabled, proceed with scan
      await scanAction()
      return true
    } catch (err) {
      console.error('Service check error:', err)
      // On error, try to proceed anyway
      await scanAction()
      return true
    }
  }, [])

  const enableServicesAndProceed = useCallback(async () => {
    const permManager = getPermissionManager()
    if (!permManager) {
      setShowServiceDialog(false)
      if (pendingAction) await pendingAction()
      return
    }

    // Enable each missing service
    for (const service of missingServices) {
      try {
        switch (service) {
          case 'location':
            await permManager.enableLocation()
            break
          case 'bluetooth':
            await permManager.enableBluetooth()
            break
          case 'wifi':
            await permManager.enableWifi()
            break
        }
      } catch (err) {
        console.error(`Failed to enable ${service}:`, err)
      }
    }

    setShowServiceDialog(false)
    setMissingServices([])
    
    // Wait a bit for services to enable, then proceed
    setTimeout(async () => {
      if (pendingAction) {
        await pendingAction()
        setPendingAction(null)
      }
    }, 1500)
  }, [missingServices, pendingAction])

  const cancelServiceDialog = useCallback(() => {
    setShowServiceDialog(false)
    setMissingServices([])
    setPendingAction(null)
  }, [])

  return {
    showServiceDialog,
    missingServices,
    checkServicesBeforeScan,
    enableServicesAndProceed,
    cancelServiceDialog
  }
}
