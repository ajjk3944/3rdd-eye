'use client'

import { useState, useEffect } from 'react'
import { ArrowLeft } from 'lucide-react'
import { Button } from '@/components/ui/button'
import { Card, CardContent } from '@/components/ui/card'
import IoTMainView from '@/components/iot/IoTMainView'
import IoTDeviceDetail from '@/components/iot/IoTDeviceDetail'
import IoTSecurityOverview from '@/components/iot/IoTSecurityOverview'
import IoTRoomManagement from '@/components/iot/IoTRoomManagement'
import IoTRoomDetail from '@/components/iot/IoTRoomDetail'
import { getIoTDevice, IoTDeviceInfo, IoTRoom, IoTDeviceStats } from '@/lib/native-plugins'
import { useI18n } from '@/lib/i18n'

type Page = 'dashboard' | 'device-detail' | 'security' | 'rooms' | 'room-detail'

export default function IoTDashboard() {
  const { t } = useI18n()
  const [currentPage, setCurrentPage] = useState<Page>('dashboard')
  const [selectedDeviceId, setSelectedDeviceId] = useState<number | null>(null)
  const [selectedRoomId, setSelectedRoomId] = useState<number | null>(null)
  const [devices, setDevices] = useState<IoTDeviceInfo[]>([])
  const [rooms, setRooms] = useState<IoTRoom[]>([])
  const [stats, setStats] = useState<IoTDeviceStats | null>(null)
  const [isScanning, setIsScanning] = useState(false)
  const [scanProgress, setScanProgress] = useState(0)
  const [filterType, setFilterType] = useState<string>('all')
  const [error, setError] = useState<string | null>(null)

  const iotPlugin = getIoTDevice()

  // Load initial data
  useEffect(() => {
    try {
      loadDevices()
      loadRooms()
      loadStats()
    } catch (err: any) {
      console.error('Error loading initial data:', err)
      setError(err.message || 'Failed to load data')
    }
  }, [])

  // Set up event listeners
  useEffect(() => {
    if (!iotPlugin) return

    const listeners: any[] = []

    // Device found event
    try {
      const result = iotPlugin.addListener('iotDeviceFound', (data) => {
        console.log('IoT device found:', data.device)
        loadDevices()
        loadStats()
      })
      
      // Handle both Promise and direct return
      if (result && typeof result.then === 'function') {
        result.then(handle => {
          if (handle) listeners.push(handle)
        }).catch(() => {})
      } else if (result && typeof result.remove === 'function') {
        listeners.push(result)
      }
    } catch (e) {
      console.warn('Failed to add iotDeviceFound listener:', e)
    }

    // Scan progress event
    try {
      const result = iotPlugin.addListener('iotScanProgress', (data) => {
        setScanProgress(data.percentage)
      })
      
      // Handle both Promise and direct return
      if (result && typeof result.then === 'function') {
        result.then(handle => {
          if (handle) listeners.push(handle)
        }).catch(() => {})
      } else if (result && typeof result.remove === 'function') {
        listeners.push(result)
      }
    } catch (e) {
      console.warn('Failed to add iotScanProgress listener:', e)
    }

    // Scan complete event
    try {
      const result = iotPlugin.addListener('iotScanComplete', (data) => {
        console.log('IoT scan complete:', data)
        setIsScanning(false)
        setScanProgress(0)
        loadDevices()
        loadStats()
      })
      
      // Handle both Promise and direct return
      if (result && typeof result.then === 'function') {
        result.then(handle => {
          if (handle) listeners.push(handle)
        }).catch(() => {})
      } else if (result && typeof result.remove === 'function') {
        listeners.push(result)
      }
    } catch (e) {
      console.warn('Failed to add iotScanComplete listener:', e)
    }

    return () => {
      listeners.forEach(listener => {
        try {
          if (listener && typeof listener.remove === 'function') {
            listener.remove()
          }
        } catch (e) {}
      })
      
      // Also remove all listeners as safety net
      try {
        iotPlugin?.removeAllListeners()
      } catch (e) {}
    }
  }, [iotPlugin])

  const loadDevices = async () => {
    if (!iotPlugin) return
    try {
      const result = await iotPlugin.getAllDevices()
      setDevices(result.devices || [])
    } catch (error) {
      console.error('Error loading devices:', error)
    }
  }

  const loadRooms = async () => {
    if (!iotPlugin) return
    try {
      const result = await iotPlugin.getAllRooms()
      setRooms(result.rooms || [])
    } catch (error) {
      console.error('Error loading rooms:', error)
    }
  }

  const loadStats = async () => {
    if (!iotPlugin) return
    try {
      const result = await iotPlugin.getDeviceStats()
      setStats(result)
    } catch (error) {
      console.error('Error loading stats:', error)
    }
  }

  const handleStartScan = async () => {
    if (!iotPlugin) return
    
    try {
      setIsScanning(true)
      setScanProgress(0)
      const result = await iotPlugin.startDiscovery()
      
      if (!result.success) {
        setIsScanning(false)
        console.error('Scan failed:', result.message)
      }
    } catch (error) {
      console.error('Error starting scan:', error)
      setIsScanning(false)
      setScanProgress(0)
    }
  }

  const handleBack = () => {
    if (currentPage === 'device-detail' || currentPage === 'security' || currentPage === 'rooms') {
      setCurrentPage('dashboard')
    } else if (currentPage === 'room-detail') {
      setCurrentPage('rooms')
    }
  }

  const navigateToDeviceDetail = (deviceId: number) => {
    setSelectedDeviceId(deviceId)
    setCurrentPage('device-detail')
  }

  const navigateToSecurity = () => {
    setCurrentPage('security')
  }

  const navigateToRooms = () => {
    setCurrentPage('rooms')
  }

  const navigateToRoomDetail = (roomId: number) => {
    setSelectedRoomId(roomId)
    setCurrentPage('room-detail')
  }

  return (
    <div className="h-full flex flex-col bg-[#0d120d]">
      {/* Header */}
      <div className="flex items-center justify-between p-4 border-b border-cyan-900/30">
        {currentPage !== 'dashboard' && (
          <button
            onClick={handleBack}
            className="flex items-center gap-2 text-cyan-400 hover:text-cyan-300 transition-colors"
          >
            <ArrowLeft size={18} />
            <span>{t('iot.back')}</span>
          </button>
        )}
        {currentPage === 'dashboard' && (
          <h1 className="text-xl font-semibold text-white">{t('iot.title')}</h1>
        )}
      </div>

      {/* Error State */}
      {error && (
        <div className="p-4">
          <Card className="bg-red-500/10 border-red-500/30">
            <CardContent className="p-4">
              <p className="text-red-400 text-center">
                {t('iot.somethingWrong')}
              </p>
              <p className="text-red-300 text-sm text-center mt-2">{error}</p>
            </CardContent>
          </Card>
        </div>
      )}

      {/* Content */}
      {!error && (
        <div className="flex-1 overflow-auto">
          {currentPage === 'dashboard' && (
            <IoTMainView
              devices={devices}
              rooms={rooms}
              stats={stats}
              isScanning={isScanning}
              scanProgress={scanProgress}
              filterType={filterType}
              onFilterChange={setFilterType}
              onDeviceClick={navigateToDeviceDetail}
              onSecurityClick={navigateToSecurity}
              onRoomsClick={navigateToRooms}
              onRefresh={loadDevices}
              onStartScan={handleStartScan}
            />
          )}

          {currentPage === 'device-detail' && selectedDeviceId && (
            <IoTDeviceDetail
              deviceId={selectedDeviceId}
              onBack={handleBack}
              onRefresh={loadDevices}
            />
          )}

          {currentPage === 'security' && (
            <IoTSecurityOverview
              devices={devices}
              onDeviceClick={navigateToDeviceDetail}
            />
          )}

          {currentPage === 'rooms' && (
            <IoTRoomManagement
              rooms={rooms}
              devices={devices}
              onRoomClick={navigateToRoomDetail}
              onRefresh={() => {
                loadRooms()
                loadDevices()
              }}
            />
          )}

          {currentPage === 'room-detail' && selectedRoomId !== null && (
            <IoTRoomDetail
              roomId={selectedRoomId}
              devices={devices}
              onDeviceClick={navigateToDeviceDetail}
              onBack={handleBack}
            />
          )}
        </div>
      )}
    </div>
  )
}
