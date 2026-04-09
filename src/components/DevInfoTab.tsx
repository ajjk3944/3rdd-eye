'use client'

import { useState, useEffect } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { ScrollArea } from '@/components/ui/scroll-area'
import { Badge } from '@/components/ui/badge'
import { Progress } from '@/components/ui/progress'
import { Input } from '@/components/ui/input'
import { toast } from 'sonner'
import { useI18n } from '@/lib/i18n'
import DeviceInfo, {
  formatBytes,
  formatPercentage,
  getBatteryHealthText,
  getSensorTypeName,
  type DashboardInfo,
  type SystemInfo,
  type CPUInfo,
  type BatteryInfo,
  type StorageInfo,
  type DisplayInfo,
  type SensorsInfo,
  type LocationInfo,
  type CameraInfo,
  type TemperatureInfo,
  type AppsInfo,
  type AppInfo,
} from '@/lib/device-info-plugin'
import {
  Smartphone,
  Cpu,
  HardDrive,
  Battery,
  Monitor,
  Thermometer,
  Compass,
  MapPin,
  Package,
  RefreshCw,
  ChevronRight,
  Activity,
  Signal,
  Router,
  Globe,
} from 'lucide-react'

type Section = 'dashboard' | 'device' | 'system' | 'cpu' | 'location' | 'battery' | 'display' | 'camera' | 'sensors' | 'apps' | 'siminfo' | 'imei'

export default function DevInfoTab() {
  const { t } = useI18n()
  const [activeSection, setActiveSection] = useState<Section>('dashboard')
  const [loading, setLoading] = useState(false)

  const sections = [
    { id: 'dashboard' as Section, label: t('devInfo.dashboard'), icon: Activity },
    { id: 'device' as Section, label: t('devInfo.device'), icon: Smartphone },
    { id: 'system' as Section, label: t('devInfo.system'), icon: Smartphone },
    { id: 'cpu' as Section, label: t('devInfo.cpu'), icon: Cpu },
    { id: 'location' as Section, label: t('devInfo.location'), icon: MapPin },
    { id: 'battery' as Section, label: t('devInfo.battery'), icon: Battery },
    { id: 'display' as Section, label: t('devInfo.display'), icon: Monitor },
    { id: 'camera' as Section, label: t('devInfo.camera'), icon: Smartphone },
    { id: 'sensors' as Section, label: t('devInfo.sensors'), icon: Compass },
    { id: 'apps' as Section, label: t('devInfo.apps'), icon: Package },
    { id: 'siminfo' as Section, label: t('devInfo.simInfo'), icon: Signal },
    { id: 'imei' as Section, label: t('devInfo.imei'), icon: Smartphone },
  ]

  // Data states
  const [dashboard, setDashboard] = useState<DashboardInfo | null>(null)
  const [systemInfo, setSystemInfo] = useState<SystemInfo | null>(null)
  const [cpuInfo, setCpuInfo] = useState<CPUInfo | null>(null)
  const [batteryInfo, setBatteryInfo] = useState<BatteryInfo | null>(null)
  const [storageInfo, setStorageInfo] = useState<StorageInfo | null>(null)
  const [displayInfo, setDisplayInfo] = useState<DisplayInfo | null>(null)
  const [sensorsInfo, setSensorsInfo] = useState<SensorsInfo | null>(null)
  const [locationInfo, setLocationInfo] = useState<LocationInfo | null>(null)
  const [cameraInfo, setCameraInfo] = useState<CameraInfo | null>(null)
  const [appsInfo, setAppsInfo] = useState<AppsInfo | null>(null)
  const [simInfo, setSimInfo] = useState<any | null>(null)

  // Load dashboard on mount
  useEffect(() => {
    loadDashboard()
  }, [])

  const loadDashboard = async () => {
    setLoading(true)
    try {
      const data = await DeviceInfo.getDashboard()
      setDashboard(data)
    } catch (err: any) {
      toast.error('Failed to load dashboard', { description: err.message })
    } finally {
      setLoading(false)
    }
  }

  const loadSystemInfo = async () => {
    setLoading(true)
    try {
      const data = await DeviceInfo.getSystemInfo()
      setSystemInfo(data)
    } catch (err: any) {
      toast.error('Failed to load system info', { description: err.message })
    } finally {
      setLoading(false)
    }
  }

  const loadCPUInfo = async () => {
    setLoading(true)
    try {
      const data = await DeviceInfo.getCPUInfo()
      setCpuInfo(data)
    } catch (err: any) {
      toast.error('Failed to load CPU info', { description: err.message })
    } finally {
      setLoading(false)
    }
  }

  const loadBatteryInfo = async () => {
    setLoading(true)
    try {
      const data = await DeviceInfo.getBatteryInfo()
      setBatteryInfo(data)
    } catch (err: any) {
      toast.error('Failed to load battery info', { description: err.message })
    } finally {
      setLoading(false)
    }
  }

  const loadStorageInfo = async () => {
    setLoading(true)
    try {
      const data = await DeviceInfo.getStorageInfo()
      setStorageInfo(data)
    } catch (err: any) {
      toast.error('Failed to load storage info', { description: err.message })
    } finally {
      setLoading(false)
    }
  }

  const loadDisplayInfo = async () => {
    setLoading(true)
    try {
      const data = await DeviceInfo.getDisplayInfo()
      setDisplayInfo(data)
    } catch (err: any) {
      toast.error('Failed to load display info', { description: err.message })
    } finally {
      setLoading(false)
    }
  }

  const loadSensorsInfo = async () => {
    setLoading(true)
    try {
      const data = await DeviceInfo.getSensors()
      setSensorsInfo(data)
    } catch (err: any) {
      toast.error('Failed to load sensors info', { description: err.message })
    } finally {
      setLoading(false)
    }
  }

  const loadLocationInfo = async () => {
    setLoading(true)
    try {
      const data = await DeviceInfo.getLocationInfo()
      setLocationInfo(data)
    } catch (err: any) {
      toast.error('Failed to load location info', { description: err.message })
    } finally {
      setLoading(false)
    }
  }

  const loadCameraInfo = async () => {
    setLoading(true)
    try {
      const data = await DeviceInfo.getCameraInfo()
      setCameraInfo(data)
    } catch (err: any) {
      toast.error('Failed to load camera info', { description: err.message })
    } finally {
      setLoading(false)
    }
  }

  const loadAppsInfo = async () => {
    setLoading(true)
    try {
      const data = await DeviceInfo.getInstalledApps()
      setAppsInfo(data)
    } catch (err: any) {
      toast.error('Failed to load apps info', { description: err.message })
    } finally {
      setLoading(false)
    }
  }

  const loadSimInfo = async () => {
    setLoading(true)
    try {
      const data = await DeviceInfo.getSimInfo()
      setSimInfo(data)
    } catch (err: any) {
      toast.error('Failed to load SIM info', { description: err.message })
    } finally {
      setLoading(false)
    }
  }

  const handleSectionChange = (section: Section) => {
    setActiveSection(section)
    
    // Load data for the section if not already loaded
    switch (section) {
      case 'dashboard':
        if (!dashboard) loadDashboard()
        break
      case 'system':
      case 'device':
        if (!systemInfo) loadSystemInfo()
        break
      case 'cpu':
        if (!cpuInfo) loadCPUInfo()
        break
      case 'battery':
        if (!batteryInfo) loadBatteryInfo()
        break
      case 'display':
        if (!displayInfo) loadDisplayInfo()
        break
      case 'sensors':
        if (!sensorsInfo) loadSensorsInfo()
        break
      case 'location':
        if (!locationInfo) loadLocationInfo()
        break
      case 'camera':
        if (!cameraInfo) loadCameraInfo()
        break
      case 'apps':
        if (!appsInfo) loadAppsInfo()
        break
      case 'siminfo':
      case 'imei':
        if (!simInfo) loadSimInfo()
        break
    }
  }

  return (
    <div className="space-y-4">
      {/* Header */}
      <div className="flex items-center justify-between">
        <div>
          <h2 className="text-2xl font-bold text-emerald-400">{t('devInfo.title')}</h2>
          <p className="text-sm text-gray-400 mt-1">{t('devInfo.completeSpecs')}</p>
        </div>
        <Button
          onClick={() => handleSectionChange(activeSection)}
          disabled={loading}
          size="sm"
          className="bg-emerald-600 hover:bg-emerald-700"
        >
          <RefreshCw className={`w-4 h-4 mr-2 ${loading ? 'animate-spin' : ''}`} />
          {t('devInfo.refresh')}
        </Button>
      </div>

      {/* Section Navigation - Grid Layout */}
      <Card className="bg-[#0d120d] border-emerald-900/30">
        <CardContent className="p-4">
          <div className="grid grid-cols-2 sm:grid-cols-3 md:grid-cols-4 gap-2">
            {sections.map(section => (
              <Button
                key={section.id}
                onClick={() => handleSectionChange(section.id)}
                variant={activeSection === section.id ? 'default' : 'outline'}
                size="sm"
                className={`${activeSection === section.id ? 'bg-emerald-600' : ''} justify-start`}
              >
                <section.icon className="w-4 h-4 mr-2 flex-shrink-0" />
                <span className="truncate">{section.label}</span>
              </Button>
            ))}
          </div>
        </CardContent>
      </Card>

      {/* Content Area */}
      <div className="space-y-4">
        {activeSection === 'dashboard' && <DashboardSection data={dashboard} loading={loading} />}
        {activeSection === 'device' && <DeviceSection data={systemInfo} loading={loading} />}
        {activeSection === 'system' && <SystemSection data={systemInfo} loading={loading} />}
        {activeSection === 'cpu' && <CPUSection data={cpuInfo} loading={loading} />}
        {activeSection === 'location' && <LocationSection data={locationInfo} loading={loading} />}
        {activeSection === 'battery' && <BatterySection data={batteryInfo} loading={loading} />}
        {activeSection === 'display' && <DisplaySection data={displayInfo} loading={loading} />}
        {activeSection === 'camera' && <CameraSection data={cameraInfo} loading={loading} />}
        {activeSection === 'sensors' && <SensorsSection data={sensorsInfo} loading={loading} />}
        {activeSection === 'apps' && <AppsSection data={appsInfo} loading={loading} onRefresh={loadAppsInfo} />}
        {activeSection === 'siminfo' && <SimInfoSection data={simInfo} loading={loading} onRefresh={loadSimInfo} />}
        {activeSection === 'imei' && <IMEISection data={simInfo} loading={loading} />}
      </div>
    </div>
  )
}

// Dashboard Section
function DashboardSection({ data, loading }: { data: DashboardInfo | null; loading: boolean }) {
  if (loading) return <LoadingCard />
  if (!data) return <EmptyCard message="No dashboard data available" />

  return (
    <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
      <InfoCard title="Device" icon={Smartphone}>
        <InfoRow label="Name" value={data.deviceName} />
        <InfoRow label="Manufacturer" value={data.manufacturer} />
        <InfoRow label="Brand" value={data.brand} />
        <InfoRow label="Android" value={`${data.androidVersion} (SDK ${data.sdkVersion})`} />
      </InfoCard>

      <InfoCard title="Memory" icon={Activity}>
        <InfoRow label="Total RAM" value={formatBytes(data.memory.totalRAM)} />
        <InfoRow label="Available" value={formatBytes(data.memory.availableRAM)} />
        <InfoRow label="Used" value={formatBytes(data.memory.usedRAM)} />
        <Progress 
          value={formatPercentage(data.memory.usedRAM, data.memory.totalRAM)} 
          className="mt-2"
        />
      </InfoCard>

      <InfoCard title="Storage" icon={HardDrive}>
        <InfoRow label="Total" value={formatBytes(data.storage.internal.total)} />
        <InfoRow label="Free" value={formatBytes(data.storage.internal.free)} />
        <InfoRow label="Used" value={formatBytes(data.storage.internal.used)} />
        <Progress 
          value={formatPercentage(data.storage.internal.used, data.storage.internal.total)} 
          className="mt-2"
        />
      </InfoCard>

      <InfoCard title="Battery" icon={Battery}>
        <InfoRow label="Level" value={`${data.battery.level}%`} />
        <InfoRow label="Status" value={data.battery.isCharging ? 'Charging' : 'Not Charging'} />
        <InfoRow label="Health" value={getBatteryHealthText(data.battery.health)} />
        <InfoRow label="Temperature" value={`${data.battery.temperature}°C`} />
      </InfoCard>

      <InfoCard title="CPU" icon={Cpu}>
        <InfoRow label="Cores" value={data.cpu.cores.toString()} />
        <InfoRow label="Architecture" value={data.cpu.abi} />
        <InfoRow label="Hardware" value={data.cpu.hardware} />
      </InfoCard>
    </div>
  )
}

// Device Section
function DeviceSection({ data, loading }: { data: SystemInfo | null; loading: boolean }) {
  if (loading) return <LoadingCard />
  if (!data) return <EmptyCard message="No device data available" />

  return (
    <InfoCard title="Device Information" icon={Smartphone}>
      <InfoRow label="Manufacturer" value={data.manufacturer} />
      <InfoRow label="Brand" value={data.brand} />
      <InfoRow label="Model" value={data.model} />
      <InfoRow label="Device" value={data.device} />
      <InfoRow label="Product" value={data.product} />
      <InfoRow label="Hardware" value={data.hardware} />
      <InfoRow label="Board" value={data.board} />
    </InfoCard>
  )
}

// System Section
function SystemSection({ data, loading }: { data: SystemInfo | null; loading: boolean }) {
  if (loading) return <LoadingCard />
  if (!data) return <EmptyCard message="No system data available" />

  return (
    <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
      <InfoCard title="Android Version" icon={Smartphone}>
        <InfoRow label="Version" value={data.androidVersion} />
        <InfoRow label="SDK" value={data.sdkVersion.toString()} />
        <InfoRow label="Codename" value={data.codename} />
        <InfoRow label="Security Patch" value={data.securityPatch} />
      </InfoCard>

      <InfoCard title="Build Information" icon={Smartphone}>
        <InfoRow label="Fingerprint" value={data.fingerprint} />
        <InfoRow label="Bootloader" value={data.bootloader} />
        <InfoRow label="ID" value={data.id} />
        <InfoRow label="Tags" value={data.tags} />
        <InfoRow label="Type" value={data.type} />
      </InfoCard>
    </div>
  )
}

// CPU Section
function CPUSection({ data, loading }: { data: CPUInfo | null; loading: boolean }) {
  if (loading) return <LoadingCard />
  if (!data) return <EmptyCard message="No CPU data available" />

  return (
    <InfoCard title="CPU Information" icon={Cpu}>
      <InfoRow label="Cores" value={data.cores.toString()} />
      <InfoRow label="Architecture" value={data.abi} />
      <InfoRow label="Hardware" value={data.hardware} />
      <div className="mt-4">
        <p className="text-sm text-gray-400 mb-2">Supported ABIs:</p>
        <div className="flex flex-wrap gap-2">
          {data.supportedAbis.map((abi, i) => (
            <Badge key={i} variant="outline" className="bg-emerald-900/20 text-emerald-400">
              {abi}
            </Badge>
          ))}
        </div>
      </div>
    </InfoCard>
  )
}

// Location Section with GPS coordinates and satellites
function LocationSection({ data, loading }: { data: LocationInfo | null; loading: boolean }) {
  if (loading) return <LoadingCard />
  if (!data) return <EmptyCard message="No location data available" />

  return (
    <div className="space-y-4">
      {/* GPS Status */}
      <InfoCard title="Location Services" icon={MapPin}>
        <InfoRow label="GPS Enabled" value={data.gpsEnabled ? 'Yes' : 'No'} />
        <InfoRow label="Network Enabled" value={data.networkEnabled ? 'Yes' : 'No'} />
      </InfoCard>

      {/* Coordinates */}
      {data.latitude !== undefined && (
        <InfoCard title="Current Location" icon={MapPin}>
          <InfoRow label="Latitude" value={`${data.latitude.toFixed(6)}°`} />
          <InfoRow label="Longitude" value={`${data.longitude?.toFixed(6)}°`} />
          <InfoRow label="Altitude" value={`${data.altitude?.toFixed(2)} m`} />
          <InfoRow 
            label="Speed" 
            value={data.speed && ((data.speed * 3.6) > 1)
              ? `${((data.speed || 0) * 3.6).toFixed(2)} km/h` 
              : 'Stationary'
            } 
          />
          <InfoRow label="Accuracy" value={`${data.accuracy?.toFixed(2)} m`} />
          <InfoRow 
            label="Direction" 
            value={data.bearing && data.speed && ((data.speed * 3.6) > 1)
              ? `${data.bearing.toFixed(0)}° (${getCompassDirection(data.bearing)})` 
              : 'N/A'
            } 
          />
        </InfoCard>
      )}

      {/* Satellites */}
      {data.satellites && data.satellites.length > 0 && (
        <Card className="bg-[#0d120d] border-emerald-900/30">
          <CardHeader>
            <CardTitle className="text-emerald-400 flex items-center gap-2">
              <MapPin className="w-5 h-5" />
              Satellites ({data.satelliteCount || 0})
            </CardTitle>
          </CardHeader>
          <CardContent>
            <div className="space-y-3">
              {data.satellites.map((sat, i) => (
                <div key={i} className="flex items-center justify-between p-3 rounded-lg bg-emerald-900/10">
                  <div className="flex items-center gap-3">
                    <span className="text-2xl">{sat.flag}</span>
                    <span className="text-emerald-400 font-medium">{sat.system}</span>
                  </div>
                  <Badge variant="outline" className="bg-emerald-900/20 text-emerald-400">
                    {sat.count} satellite{sat.count !== 1 ? 's' : ''}
                  </Badge>
                </div>
              ))}
            </div>
          </CardContent>
        </Card>
      )}

      {/* Providers */}
      <InfoCard title="Available Providers" icon={MapPin}>
        <div className="flex flex-wrap gap-2">
          {data.providers.map((provider, i) => (
            <Badge key={i} variant="outline" className="bg-emerald-900/20 text-emerald-400">
              {provider}
            </Badge>
          ))}
        </div>
      </InfoCard>
    </div>
  )
}

// Storage Section
function StorageSection({ data, loading }: { data: StorageInfo | null; loading: boolean }) {
  if (loading) return <LoadingCard />
  if (!data) return <EmptyCard message="No storage data available" />

  return (
    <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
      <InfoCard title="Internal Storage" icon={HardDrive}>
        <InfoRow label="Total" value={formatBytes(data.internal.total)} />
        <InfoRow label="Free" value={formatBytes(data.internal.free)} />
        <InfoRow label="Used" value={formatBytes(data.internal.used)} />
        <Progress 
          value={formatPercentage(data.internal.used, data.internal.total)} 
          className="mt-2"
        />
      </InfoCard>

      {data.external && (
        <InfoCard title="External Storage" icon={HardDrive}>
          <InfoRow label="Total" value={formatBytes(data.external.total)} />
          <InfoRow label="Free" value={formatBytes(data.external.free)} />
          <InfoRow label="Used" value={formatBytes(data.external.used)} />
          <Progress 
            value={formatPercentage(data.external.used, data.external.total)} 
            className="mt-2"
          />
        </InfoCard>
      )}
    </div>
  )
}

// Battery Section with auto-refresh
function BatterySection({ data, loading }: { data: BatteryInfo | null; loading: boolean }) {
  const [liveData, setLiveData] = useState<BatteryInfo | null>(data)

  // Auto-refresh battery data every 3 seconds
  useEffect(() => {
    if (!data) return

    setLiveData(data)

    const interval = setInterval(async () => {
      try {
        const freshData = await DeviceInfo.getBatteryInfo()
        setLiveData(freshData)
      } catch (err) {
        // Silent fail
      }
    }, 3000)

    return () => clearInterval(interval)
  }, [data])

  if (loading) return <LoadingCard />
  if (!liveData) return <EmptyCard message="No battery data available" />

  return (
    <InfoCard title="Battery Information" icon={Battery}>
      <InfoRow label="Level" value={`${liveData.level}%`} />
      <Progress value={liveData.level} className="my-2" />
      <InfoRow label="Status" value={liveData.isCharging ? 'Charging' : 'Not Charging'} />
      <InfoRow label="Health" value={getBatteryHealthText(liveData.health)} />
      <InfoRow label="Temperature" value={`${liveData.temperature.toFixed(1)}°C`} />
      <InfoRow label="Voltage" value={`${liveData.voltage} mV`} />
      <InfoRow label="Technology" value={liveData.technology} />
      <p className="text-xs text-gray-500 mt-2 text-center">Auto-refreshing every 3s</p>
    </InfoCard>
  )
}

// Display Section
function DisplaySection({ data, loading }: { data: DisplayInfo | null; loading: boolean }) {
  if (loading) return <LoadingCard />
  if (!data) return <EmptyCard message="No display data available" />

  return (
    <InfoCard title="Display Information" icon={Monitor}>
      <InfoRow label="Resolution" value={`${data.widthPixels} x ${data.heightPixels}`} />
      <InfoRow label="Density" value={`${data.densityDpi} dpi`} />
      <InfoRow label="Density Scale" value={data.density.toString()} />
      <InfoRow label="Scaled Density" value={data.scaledDensity.toString()} />
      <InfoRow label="X DPI" value={data.xdpi.toString()} />
      <InfoRow label="Y DPI" value={data.ydpi.toString()} />
      <InfoRow label="Refresh Rate" value={`${data.refreshRate} Hz`} />
    </InfoCard>
  )
}

// Camera Section
function CameraSection({ data, loading }: { data: CameraInfo | null; loading: boolean }) {
  if (loading) return <LoadingCard />
  if (!data || data.count === 0) return <EmptyCard message="No camera data available" />

  return (
    <div className="space-y-4">
      {data.cameras.map((camera, i) => (
        <InfoCard key={i} title={`Camera ${parseInt(camera.id) + 1} - ${camera.facing}`} icon={Smartphone}>
          <InfoRow label="Resolution" value={camera.megapixels} />
          <InfoRow label="Max Size" value={camera.maxResolution} />
          {camera.focalLength && <InfoRow label="Focal Length" value={camera.focalLength} />}
          {camera.aperture && <InfoRow label="Aperture" value={camera.aperture} />}
          {camera.sensorSize && <InfoRow label="Sensor Size" value={camera.sensorSize} />}
          {camera.hardwareLevel && <InfoRow label="Hardware Level" value={camera.hardwareLevel} />}
          <InfoRow label="Flash" value={camera.hasFlash ? 'Yes' : 'No'} />
          <p className="text-xs text-gray-500 mt-2">
            Note: MP = (Width × Height) / 1,000,000. This is the actual sensor resolution from Android Camera2 API.
          </p>
        </InfoCard>
      ))}
    </div>
  )
}

// Temperature Section with proper formatting
function TemperatureSection({ data, loading }: { data: TemperatureInfo | null; loading: boolean }) {
  if (loading) return <LoadingCard />
  if (!data) return <EmptyCard message="No temperature data available" />

  return (
    <div className="space-y-4">
      <InfoCard title="Battery Temperature" icon={Thermometer}>
        <div className="text-center py-4">
          <div className="text-5xl font-bold text-emerald-400">{data.battery.toFixed(1)}°C</div>
          <p className="text-sm text-gray-400 mt-2">Current battery temperature</p>
        </div>
      </InfoCard>

      <InfoCard title="Temperature Sensors" icon={Thermometer}>
        <InfoRow label="Ambient Sensor" value={data.hasAmbientSensor ? 'Available' : 'Not Available'} />
        {data.ambientSensorName && <InfoRow label="Sensor Name" value={data.ambientSensorName} />}
        <InfoRow label="Device Sensor" value={data.hasDeviceSensor ? 'Available' : 'Not Available'} />
        {data.deviceSensorName && <InfoRow label="Sensor Name" value={data.deviceSensorName} />}
      </InfoCard>
    </div>
  )
}

// Apps Section
function AppsSection({ data, loading, onRefresh }: { data: AppsInfo | null; loading: boolean; onRefresh: () => void }) {
  const [search, setSearch] = useState('')
  const [selectedApp, setSelectedApp] = useState<AppInfo | null>(null)

  if (loading) return <LoadingCard />
  if (!data) return <EmptyCard message="No apps data available" />

  const allApps = [...data.userApps, ...data.systemApps]

  const filteredApps = search
    ? allApps.filter(app => 
        app.appName.toLowerCase().includes(search.toLowerCase()) ||
        app.packageName.toLowerCase().includes(search.toLowerCase())
      )
    : allApps

  const handleOpenInfo = async (packageName: string, e?: React.MouseEvent) => {
    e?.stopPropagation() // Prevent card click when clicking button
    try {
      await DeviceInfo.openAppInfo({ packageName })
    } catch (err: any) {
      toast.error('Failed to open app info', { description: err.message })
    }
  }

  return (
    <div className="space-y-4">
      {/* Stats */}
      <div className="grid grid-cols-1 gap-4">
        <Card className="bg-[#0d120d] border-emerald-900/30">
          <CardContent className="p-4 text-center">
            <div className="text-2xl font-bold text-emerald-400">{data.totalCount}</div>
            <p className="text-xs text-gray-400 mt-1">Total Apps</p>
          </CardContent>
        </Card>
      </div>

      {/* Search */}
      <Card className="bg-[#0d120d] border-emerald-900/30">
        <CardContent className="p-4">
          <Input
            placeholder="Search apps..."
            value={search}
            onChange={(e) => setSearch(e.target.value)}
            className="bg-emerald-900/10 border-emerald-900/30 text-white placeholder:text-gray-500"
          />
          <p className="text-xs text-gray-400 mt-2">
            Tap any app to view its details
          </p>
        </CardContent>
      </Card>

      {/* Apps List */}
      <ScrollArea className="h-[500px]">
        <div className="space-y-2 pr-2">
          {filteredApps.map((app, i) => (
            <Card 
              key={i} 
              className="bg-[#0d120d] border-emerald-900/30 cursor-pointer hover:border-emerald-500/50 transition-colors"
              onClick={() => setSelectedApp(app)}
            >
              <CardContent className="p-3">
                <div className="flex items-start justify-between gap-3">
                  <div className="min-w-0 flex-1">
                    <h4 className="font-medium text-emerald-400 text-sm truncate">{app.appName}</h4>
                    <p className="text-xs text-gray-500 mt-1 truncate">{app.packageName}</p>
                    <div className="flex flex-wrap gap-x-3 gap-y-1 mt-2 text-xs text-gray-400">
                      <span>v{app.versionName}</span>
                      <span>{formatBytes(app.size)}</span>
                      <span>{app.installedDate.split(' ')[0]}</span>
                    </div>
                  </div>
                  <Button
                    size="sm"
                    variant="outline"
                    onClick={(e) => handleOpenInfo(app.packageName, e)}
                    className="shrink-0 px-4"
                  >
                    Info
                  </Button>
                </div>
              </CardContent>
            </Card>
          ))}
        </div>
      </ScrollArea>

      {/* App Details Dialog */}
      {selectedApp && (
        <div 
          className="fixed inset-0 bg-black/80 z-50 flex items-center justify-center p-4"
          onClick={() => setSelectedApp(null)}
        >
          <Card 
            className="bg-[#0d120d] border-emerald-900/30 max-w-md w-full max-h-[80vh] overflow-y-auto"
            onClick={(e) => e.stopPropagation()}
          >
            <CardHeader className="border-b border-emerald-900/30">
              <div className="flex items-start justify-between">
                <div className="flex-1 min-w-0">
                  <CardTitle className="text-emerald-400 text-lg truncate">
                    {selectedApp.appName}
                  </CardTitle>
                  <p className="text-xs text-gray-500 mt-1 break-all">
                    {selectedApp.packageName}
                  </p>
                </div>
                <Button
                  size="sm"
                  variant="ghost"
                  onClick={() => setSelectedApp(null)}
                  className="shrink-0 ml-2"
                >
                  ✕
                </Button>
              </div>
            </CardHeader>
            <CardContent className="p-4 space-y-4">
              {/* Version Info */}
              <div className="space-y-2">
                <h4 className="text-sm font-medium text-emerald-400">Version Information</h4>
                <div className="grid grid-cols-2 gap-2 text-xs">
                  <InfoRow label="Version Name" value={selectedApp.versionName} />
                  <InfoRow label="Version Code" value={selectedApp.versionCode.toString()} />
                </div>
              </div>

              {/* Storage Info */}
              <div className="space-y-2">
                <h4 className="text-sm font-medium text-emerald-400">Storage</h4>
                <div className="grid grid-cols-1 gap-2 text-xs">
                  <InfoRow label="App Size" value={formatBytes(selectedApp.size)} />
                </div>
              </div>

              {/* Installation Info */}
              <div className="space-y-2">
                <h4 className="text-sm font-medium text-emerald-400">Installation</h4>
                <div className="grid grid-cols-1 gap-2 text-xs">
                  <InfoRow label="Installed Date" value={selectedApp.installedDate} />
                  <InfoRow label="Last Updated" value={selectedApp.lastUpdateDate} />
                  <InfoRow label="Target SDK" value={selectedApp.targetSdk.toString()} />
                  <InfoRow label="Min SDK" value={selectedApp.minSdk.toString()} />
                </div>
              </div>

              {/* Permissions */}
              {selectedApp.permissions && selectedApp.permissions.length > 0 && (
                <div className="space-y-2">
                  <h4 className="text-sm font-medium text-emerald-400">
                    Permissions ({selectedApp.permissions.length})
                  </h4>
                  <div className="max-h-40 overflow-y-auto space-y-1">
                    {selectedApp.permissions.map((perm, idx) => (
                      <div key={idx} className="text-xs text-gray-400 bg-emerald-900/10 p-2 rounded border border-emerald-900/20">
                        {perm.replace('android.permission.', '')}
                      </div>
                    ))}
                  </div>
                </div>
              )}

              {/* Actions */}
              <div className="flex gap-2 pt-2">
                <Button
                  size="sm"
                  onClick={(e) => {
                    handleOpenInfo(selectedApp.packageName, e)
                    setSelectedApp(null)
                  }}
                  className="flex-1 bg-emerald-600 hover:bg-emerald-700"
                >
                  Open System Info
                </Button>
                <Button
                  size="sm"
                  variant="outline"
                  onClick={() => setSelectedApp(null)}
                  className="flex-1"
                >
                  Close
                </Button>
              </div>
            </CardContent>
          </Card>
        </div>
      )}
    </div>
  )
}

// Sensors Section with interactive demos
function SensorsSection({ data, loading }: { data: SensorsInfo | null; loading: boolean }) {
  if (loading) return <LoadingCard />
  if (!data) return <EmptyCard message="No sensors data available" />

  return (
    <div className="space-y-4">
      <Card className="bg-[#0d120d] border-emerald-900/30">
        <CardHeader>
          <CardTitle className="text-emerald-400 flex items-center gap-2">
            <Compass className="w-5 h-5" />
            Available Sensors ({data.count})
          </CardTitle>
        </CardHeader>
        <CardContent>
          <div className="space-y-3">
            {data.sensors.map((sensor, i) => (
              <Card key={i} className="bg-emerald-900/10 border-emerald-900/30">
                <CardContent className="p-4">
                  <div className="flex items-start justify-between">
                    <div className="flex-1">
                      <h4 className="font-medium text-emerald-400">{getSensorTypeName(sensor.type)}</h4>
                      <p className="text-sm text-gray-400 mt-1">{sensor.name}</p>
                      <p className="text-xs text-gray-500 mt-1">Vendor: {sensor.vendor}</p>
                    </div>
                    <div className="flex gap-2 items-center">
                      <Badge variant="outline" className="bg-emerald-900/20 text-emerald-400">
                        v{sensor.version}
                      </Badge>
                    </div>
                  </div>
                  <div className="grid grid-cols-2 gap-2 mt-3 text-xs">
                    <InfoRow label="Power" value={`${sensor.power} mA`} />
                    <InfoRow label="Resolution" value={sensor.resolution.toString()} />
                    <InfoRow label="Max Range" value={sensor.maxRange.toString()} />
                  </div>
                </CardContent>
              </Card>
            ))}
          </div>
        </CardContent>
      </Card>
    </div>
  )
}

// SIM Info Section - Comprehensive cellular information
function SimInfoSection({ data, loading, onRefresh }: { data: any | null; loading: boolean; onRefresh: () => void }) {
  const [selectedSim, setSelectedSim] = useState<number>(0)
  const [autoRefresh, setAutoRefresh] = useState(false)

  // Auto-refresh signal data every 3 seconds
  useEffect(() => {
    if (!autoRefresh || !data) return

    const interval = setInterval(() => {
      onRefresh()
    }, 3000)

    return () => clearInterval(interval)
  }, [autoRefresh, data, onRefresh])

  if (loading) return <LoadingCard />
  if (!data) return <EmptyCard message="No SIM data available" />

  if (!data.hasSimCard) {
    return (
      <Card className="bg-[#0d120d] border-emerald-900/30">
        <CardContent className="p-8 text-center">
          <Signal className="w-16 h-16 text-gray-600 mx-auto mb-4" />
          <h3 className="text-xl font-semibold text-gray-400 mb-2">No SIM Card Detected</h3>
          <p className="text-sm text-gray-500">Insert a SIM card to view cellular information</p>
        </CardContent>
      </Card>
    )
  }

  const currentSim = data.simSlots[selectedSim]

  return (
    <div className="space-y-4">
      {/* Header with Auto-Refresh Toggle */}
      <Card className="bg-[#0d120d] border-emerald-900/30">
        <CardContent className="p-4 flex items-center justify-between">
          <div className="flex items-center gap-2">
            <Signal className="w-5 h-5 text-emerald-400" />
            <span className="text-emerald-400 font-medium">
              {data.simCount} SIM Card{data.simCount > 1 ? 's' : ''} Detected
            </span>
          </div>
          <div className="flex items-center gap-2">
            <Button
              size="sm"
              variant={autoRefresh ? 'default' : 'outline'}
              onClick={() => setAutoRefresh(!autoRefresh)}
              className={autoRefresh ? 'bg-emerald-600' : ''}
            >
              <RefreshCw className={`w-4 h-4 mr-2 ${autoRefresh ? 'animate-spin' : ''}`} />
              {autoRefresh ? 'Auto' : 'Manual'}
            </Button>
            <Button
              size="sm"
              variant="outline"
              onClick={onRefresh}
              disabled={loading || autoRefresh}
            >
              <RefreshCw className={`w-4 h-4 ${loading ? 'animate-spin' : ''}`} />
            </Button>
          </div>
        </CardContent>
      </Card>

      {/* SIM Slot Selector (if multiple SIMs) */}
      {data.simCount > 1 && (
        <Card className="bg-[#0d120d] border-emerald-900/30">
          <CardContent className="p-4">
            <div className="flex gap-2">
              {data.simSlots.map((sim: any, index: number) => (
                <Button
                  key={index}
                  size="sm"
                  variant={selectedSim === index ? 'default' : 'outline'}
                  onClick={() => setSelectedSim(index)}
                  className={`flex-1 ${selectedSim === index ? 'bg-emerald-600' : ''}`}
                >
                  SIM {index + 1}
                  {sim.simState === 'Ready' && (
                    <Badge className="ml-2 bg-green-500">
                      {sim.isActive ? 'Active' : 'Ready'}
                    </Badge>
                  )}
                  {sim.simState !== 'Ready' && sim.simState !== 'Absent' && (
                    <Badge className="ml-2 bg-yellow-500">{sim.simState}</Badge>
                  )}
                </Button>
              ))}
            </div>
          </CardContent>
        </Card>
      )}

      {/* Signal Strength Gauge */}
      {currentSim && (
        <Card className="bg-[#0d120d] border-emerald-900/30">
          <CardHeader>
            <CardTitle className="text-emerald-400 flex items-center gap-2">
              <Activity className="w-5 h-5" />
              Signal Strength - SIM {selectedSim + 1}
            </CardTitle>
          </CardHeader>
          <CardContent>
            <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
              {/* Gauge */}
              <div className="flex flex-col items-center justify-center">
                <div className="relative w-48 h-48">
                  <svg viewBox="0 0 200 200" className="transform -rotate-90">
                    {/* Background arc */}
                    <circle
                      cx="100"
                      cy="100"
                      r="80"
                      fill="none"
                      stroke="#1f2937"
                      strokeWidth="20"
                      strokeDasharray="251.2"
                      strokeDashoffset="62.8"
                    />
                    {/* Signal strength arc */}
                    <circle
                      cx="100"
                      cy="100"
                      r="80"
                      fill="none"
                      stroke={getSignalColor(currentSim.signalStrength)}
                      strokeWidth="20"
                      strokeDasharray="251.2"
                      strokeDashoffset={251.2 - (currentSim.signalStrength / 100) * 188.4}
                      strokeLinecap="round"
                      className="transition-all duration-500"
                    />
                  </svg>
                  <div className="absolute inset-0 flex flex-col items-center justify-center">
                    <div className="text-4xl font-bold text-emerald-400">
                      {currentSim.signalDbm} dBm
                    </div>
                    <div className="text-sm text-gray-400 mt-1">
                      {currentSim.signalAsu} asu
                    </div>
                    <Badge 
                      className="mt-2" 
                      style={{ backgroundColor: getSignalColor(currentSim.signalStrength) }}
                    >
                      {getSignalQuality(currentSim.signalStrength)}
                    </Badge>
                  </div>
                </div>
              </div>

              {/* SIM Card Info */}
              <div className="space-y-3">
                <div className="p-4 rounded-lg bg-emerald-900/10">
                  <h4 className="text-sm font-medium text-emerald-400 mb-3">SIM Card</h4>
                  <div className="space-y-2">
                    <InfoRow label="Operator" value={currentSim.operatorName || 'Unknown'} />
                    <InfoRow label="Network" value={currentSim.networkType || 'Unknown'} />
                    <InfoRow label="State" value={currentSim.simState || 'Unknown'} />
                    {currentSim.phoneNumber && (
                      <InfoRow label="Number" value={currentSim.phoneNumber} />
                    )}
                    {currentSim.iccid && (
                      <InfoRow label="ICCID" value={currentSim.iccid.substring(0, 10) + '...'} />
                    )}
                    {currentSim.imei && (
                      <InfoRow label="IMEI" value={currentSim.imei.substring(0, 10) + '...'} />
                    )}
                  </div>
                </div>

                <div className="p-4 rounded-lg bg-emerald-900/10">
                  <h4 className="text-sm font-medium text-emerald-400 mb-3">Network</h4>
                  <div className="space-y-2">
                    <InfoRow label="Country" value={`${currentSim.countryCode} (${currentSim.countryIso})`} />
                    <InfoRow label="Operator Code" value={currentSim.operatorCode || 'N/A'} />
                    {currentSim.mcc && currentSim.mnc && (
                      <>
                        <InfoRow label="MCC" value={currentSim.mcc} />
                        <InfoRow label="MNC" value={currentSim.mnc} />
                      </>
                    )}
                    <InfoRow label="Roaming" value={currentSim.isRoaming ? 'Yes' : 'No'} />
                    {currentSim.dataEnabled !== undefined && (
                      <InfoRow label="Data" value={currentSim.dataEnabled ? 'Enabled' : 'Disabled'} />
                    )}
                    {currentSim.dataState && (
                      <InfoRow label="Data State" value={currentSim.dataState} />
                    )}
                    {currentSim.voiceNetworkType && (
                      <InfoRow label="Voice Network" value={currentSim.voiceNetworkType} />
                    )}
                    {currentSim.dataNetworkType && (
                      <InfoRow label="Data Network" value={currentSim.dataNetworkType} />
                    )}
                  </div>
                </div>
              </div>
            </div>
          </CardContent>
        </Card>
      )}

      {/* Signal Trend Chart */}
      {currentSim && currentSim.signalHistory && currentSim.signalHistory.length > 0 && (
        <Card className="bg-[#0d120d] border-emerald-900/30">
          <CardHeader>
            <CardTitle className="text-emerald-400 flex items-center gap-2">
              <Activity className="w-5 h-5" />
              Signal Trend
            </CardTitle>
          </CardHeader>
          <CardContent>
            <div className="h-48 relative">
              <svg viewBox="0 0 400 150" className="w-full h-full">
                {/* Grid lines */}
                {[0, 1, 2, 3, 4].map((i) => (
                  <line
                    key={i}
                    x1="0"
                    y1={i * 37.5}
                    x2="400"
                    y2={i * 37.5}
                    stroke="#1f2937"
                    strokeWidth="1"
                    strokeDasharray="4"
                  />
                ))}
                
                {/* Signal line */}
                <polyline
                  points={currentSim.signalHistory
                    .map((point: number, i: number) => {
                      const x = (i / (currentSim.signalHistory.length - 1)) * 400
                      const y = 150 - ((point + 120) / 70) * 150
                      return `${x},${y}`
                    })
                    .join(' ')}
                  fill="none"
                  stroke="#10b981"
                  strokeWidth="2"
                />
              </svg>
              <div className="absolute top-0 right-0 text-xs text-gray-500">-50 dBm</div>
              <div className="absolute bottom-0 right-0 text-xs text-gray-500">-120 dBm</div>
            </div>
            <p className="text-xs text-gray-400 text-center mt-2">
              Last {currentSim.signalHistory.length} readings
            </p>
          </CardContent>
        </Card>
      )}

      {/* Serving Cell Info */}
      {currentSim && currentSim.servingCell && (
        <Card className="bg-[#0d120d] border-emerald-900/30">
          <CardHeader>
            <CardTitle className="text-emerald-400 flex items-center gap-2">
              <Router className="w-5 h-5" />
              Serving Cell
            </CardTitle>
          </CardHeader>
          <CardContent>
            <div className="space-y-3">
              <div className="text-center p-4 rounded-lg bg-emerald-900/10">
                <div className="text-2xl font-bold text-emerald-400">
                  {currentSim.servingCell.cellId}
                </div>
                <p className="text-sm text-gray-400 mt-1">Cell ID</p>
              </div>

              <div className="grid grid-cols-2 md:grid-cols-4 gap-3">
                <div className="p-3 rounded-lg bg-emerald-900/10 text-center">
                  <div className="text-lg font-semibold text-emerald-400">
                    {currentSim.servingCell.mcc}
                  </div>
                  <p className="text-xs text-gray-400 mt-1">MCC</p>
                </div>
                <div className="p-3 rounded-lg bg-emerald-900/10 text-center">
                  <div className="text-lg font-semibold text-emerald-400">
                    {currentSim.servingCell.mnc}
                  </div>
                  <p className="text-xs text-gray-400 mt-1">MNC</p>
                </div>
                <div className="p-3 rounded-lg bg-emerald-900/10 text-center">
                  <div className="text-lg font-semibold text-emerald-400">
                    {currentSim.servingCell.lac || currentSim.servingCell.tac}
                  </div>
                  <p className="text-xs text-gray-400 mt-1">LAC/TAC</p>
                </div>
                <div className="p-3 rounded-lg bg-emerald-900/10 text-center">
                  <div className="text-lg font-semibold text-emerald-400">
                    {currentSim.servingCell.pci || 'N/A'}
                  </div>
                  <p className="text-xs text-gray-400 mt-1">PCI</p>
                </div>
              </div>

              {currentSim.servingCell.earfcn && (
                <div className="grid grid-cols-2 gap-3">
                  <InfoRow label="EARFCN" value={currentSim.servingCell.earfcn.toString()} />
                  <InfoRow label="Bandwidth" value={`${currentSim.servingCell.bandwidth || 'N/A'} MHz`} />
                </div>
              )}

              {/* Signal Quality Metrics */}
              <div className="p-4 rounded-lg bg-emerald-900/10">
                <h4 className="text-sm font-medium text-emerald-400 mb-3">Signal Quality</h4>
                <div className="grid grid-cols-2 gap-3">
                  {currentSim.servingCell.rsrp && (
                    <InfoRow label="RSRP" value={`${currentSim.servingCell.rsrp} dBm`} />
                  )}
                  {currentSim.servingCell.rsrq && (
                    <InfoRow label="RSRQ" value={`${currentSim.servingCell.rsrq} dB`} />
                  )}
                  {currentSim.servingCell.rssi && (
                    <InfoRow label="RSSI" value={`${currentSim.servingCell.rssi} dBm`} />
                  )}
                  {currentSim.servingCell.rssnr && (
                    <InfoRow label="RSSNR" value={`${currentSim.servingCell.rssnr} dB`} />
                  )}
                  <InfoRow label="Signal" value={`${currentSim.servingCell.signalDbm} dBm`} />
                </div>
              </div>
            </div>
          </CardContent>
        </Card>
      )}

      {/* Neighboring Cells */}
      {currentSim && currentSim.neighboringCells && currentSim.neighboringCells.length > 0 && (
        <Card className="bg-[#0d120d] border-emerald-900/30">
          <CardHeader>
            <CardTitle className="text-emerald-400 flex items-center gap-2">
              <Globe className="w-5 h-5" />
              Neighboring Cells ({currentSim.neighboringCells.length})
            </CardTitle>
          </CardHeader>
          <CardContent>
            <ScrollArea className="h-64">
              <div className="space-y-2">
                {currentSim.neighboringCells.map((cell: any, i: number) => (
                  <div key={i} className="p-3 rounded-lg bg-emerald-900/10">
                    <div className="flex items-center justify-between mb-2">
                      <span className="font-medium text-emerald-400">Cell {cell.cellId}</span>
                      <Badge variant="outline" className="bg-emerald-900/20 text-emerald-400">
                        {cell.signalDbm} dBm
                      </Badge>
                    </div>
                    <div className="grid grid-cols-3 gap-2 text-xs">
                      <InfoRow label="PCI" value={cell.pci?.toString() || 'N/A'} />
                      <InfoRow label="RSRP" value={`${cell.rsrp || 'N/A'} dBm`} />
                      <InfoRow label="RSRQ" value={`${cell.rsrq || 'N/A'} dB`} />
                    </div>
                  </div>
                ))}
              </div>
            </ScrollArea>
          </CardContent>
        </Card>
      )}

      {/* Network Stats by Operator (if available) */}
      {data.networkStats && data.networkStats.length > 0 && (
        <Card className="bg-[#0d120d] border-emerald-900/30">
          <CardHeader>
            <CardTitle className="text-emerald-400 flex items-center gap-2">
              <Activity className="w-5 h-5" />
              Nearby Operators ({data.networkStats.length})
            </CardTitle>
          </CardHeader>
          <CardContent>
            <p className="text-sm text-gray-400 mb-4">
              Detected from nearby cell towers in your location
            </p>
            <div className="space-y-4">
              {data.networkStats.map((stat: any, i: number) => (
                <div key={i} className="p-4 rounded-lg bg-emerald-900/10">
                  <div className="flex items-center gap-3 mb-3">
                    <div 
                      className="w-10 h-10 rounded-full flex items-center justify-center text-white font-bold"
                      style={{ backgroundColor: stat.color }}
                    >
                      {stat.operator.charAt(0)}
                    </div>
                    <div className="flex-1">
                      <h4 className="font-medium text-emerald-400">{stat.operator}</h4>
                      <p className="text-xs text-gray-400">
                        {stat.cellCount} cell tower{stat.cellCount > 1 ? 's' : ''} detected • Avg: {stat.avgSignalDbm} dBm
                      </p>
                    </div>
                  </div>
                  
                  <div className="grid grid-cols-2 md:grid-cols-4 gap-3">
                    <div className="text-center">
                      <div className="text-lg font-semibold text-emerald-400">
                        {stat.downloadSpeed} Mbps
                      </div>
                      <p className="text-xs text-gray-400 mt-1">Est. Download</p>
                    </div>
                    <div className="text-center">
                      <div className="text-lg font-semibold text-emerald-400">
                        {stat.uploadSpeed} Mbps
                      </div>
                      <p className="text-xs text-gray-400 mt-1">Est. Upload</p>
                    </div>
                    <div className="text-center">
                      <div className="text-lg font-semibold text-emerald-400">
                        {stat.latency} ms
                      </div>
                      <p className="text-xs text-gray-400 mt-1">Est. Latency</p>
                    </div>
                    <div className="text-center">
                      <div className="flex justify-center">
                        {renderSignalBars(stat.signalQuality)}
                      </div>
                      <p className="text-xs text-gray-400 mt-1">Signal</p>
                    </div>
                  </div>
                </div>
              ))}
            </div>
            <p className="text-xs text-gray-500 mt-4 text-center">
              Speed estimates based on signal strength. Actual speeds may vary.
            </p>
          </CardContent>
        </Card>
      )}

      {/* Cell Tower Distance (if location available) */}
      {currentSim && currentSim.towerDistance && (
        <Card className="bg-[#0d120d] border-emerald-900/30">
          <CardHeader>
            <CardTitle className="text-emerald-400 flex items-center gap-2">
              <MapPin className="w-5 h-5" />
              Cell Tower Location
            </CardTitle>
          </CardHeader>
          <CardContent>
            <div className="text-center">
              <div className="text-4xl font-bold text-emerald-400 mb-2">
                {typeof currentSim.towerDistance === 'number' 
                  ? currentSim.towerDistance.toFixed(2) 
                  : currentSim.towerDistance} km
              </div>
              <p className="text-sm text-gray-400">Distance to nearest tower</p>
              {currentSim.towerDirection && (
                <div className="mt-4">
                  <div className="w-32 h-32 mx-auto relative">
                    <div 
                      className="absolute inset-0 flex items-center justify-center"
                      style={{ transform: `rotate(${currentSim.towerDirection}deg)` }}
                    >
                      <ChevronRight className="w-16 h-16 text-emerald-400" />
                    </div>
                  </div>
                  <p className="text-xs text-gray-400 mt-2">
                    Direction: {currentSim.towerDirection}°
                  </p>
                </div>
              )}
            </div>
          </CardContent>
        </Card>
      )}
    </div>
  )
}

// Helper function to convert bearing degrees to compass direction
function getCompassDirection(bearing: number): string {
  const directions = ['N', 'NE', 'E', 'SE', 'S', 'SW', 'W', 'NW']
  const index = Math.round(bearing / 45) % 8
  return directions[index]
}

// Helper functions for SIM Info
function getSignalColor(strength: number): string {
  if (strength >= 85) return '#10b981' // Green - Excellent
  if (strength >= 70) return '#22c55e' // Light Green - Very Good
  if (strength >= 55) return '#fbbf24' // Yellow - Good
  if (strength >= 40) return '#f97316' // Orange - Fair
  if (strength >= 20) return '#ef4444' // Red - Poor
  return '#991b1b' // Dark Red - Very Poor
}

function getSignalQuality(strength: number): string {
  if (strength >= 85) return 'Excellent'
  if (strength >= 70) return 'Very Good'
  if (strength >= 55) return 'Good'
  if (strength >= 40) return 'Fair'
  if (strength >= 20) return 'Poor'
  return 'Very Poor'
}

function renderSignalBars(quality: number) {
  const bars = Math.ceil(quality / 20)
  return (
    <div className="flex gap-1 items-end h-6">
      {[1, 2, 3, 4, 5].map((bar) => (
        <div
          key={bar}
          className={`w-2 ${bar <= bars ? 'bg-emerald-400' : 'bg-gray-600'}`}
          style={{ height: `${bar * 20}%` }}
        />
      ))}
    </div>
  )
}

// Helper Components
function InfoCard({ title, icon: Icon, children }: { title: string; icon: any; children: React.ReactNode }) {
  return (
    <Card className="bg-[#0d120d] border-emerald-900/30">
      <CardHeader>
        <CardTitle className="text-emerald-400 flex items-center gap-2">
          <Icon className="w-5 h-5" />
          {title}
        </CardTitle>
      </CardHeader>
      <CardContent className="space-y-2">
        {children}
      </CardContent>
    </Card>
  )
}

function InfoRow({ label, value }: { label: string; value: string }) {
  return (
    <div className="flex justify-between items-start py-1 gap-2">
      <span className="text-sm text-gray-400 flex-shrink-0">{label}</span>
      <span className="text-sm text-gray-200 font-mono text-right break-all">{value}</span>
    </div>
  )
}

function LoadingCard() {
  return (
    <Card className="bg-[#0d120d] border-emerald-900/30">
      <CardContent className="p-8 text-center">
        <RefreshCw className="w-8 h-8 text-emerald-400 animate-spin mx-auto mb-2" />
        <p className="text-gray-400">Loading...</p>
      </CardContent>
    </Card>
  )
}

function EmptyCard({ message }: { message: string }) {
  return (
    <Card className="bg-[#0d120d] border-emerald-900/30">
      <CardContent className="p-8 text-center">
        <p className="text-gray-400">{message}</p>
      </CardContent>
    </Card>
  )
}


// IMEI Section - Display device IMEI numbers
function IMEISection({ data, loading }: { data: any | null; loading: boolean }) {
  if (loading) return <LoadingCard />
  
  if (!data) {
    return (
      <EmptyCard message="No SIM data available. Please ensure you have an active SIM card and the app has phone permissions." />
    )
  }
  
  if (!data.hasSimCard) {
    return (
      <Card className="bg-[#0d120d] border-emerald-900/30">
        <CardContent className="p-8 text-center">
          <Smartphone className="w-16 h-16 text-gray-600 mx-auto mb-4" />
          <h3 className="text-xl font-semibold text-gray-400 mb-2">No SIM Card Detected</h3>
          <p className="text-sm text-gray-500">Insert a SIM card to view IMEI information</p>
        </CardContent>
      </Card>
    )
  }
  
  // Safe check for simSlots
  const simSlots = data.simSlots || []
  
  if (simSlots.length === 0) {
    return (
      <EmptyCard message="No SIM slots detected." />
    )
  }

  const imeiSlots = simSlots.filter((slot: any) => slot && slot.imei && slot.imei !== null && slot.imei !== '')

  const handleDialImei = () => {
    try {
      // Open phone dialer with *#06# to show IMEI
      window.location.href = 'tel:*%2306%23'
    } catch (error) {
      console.error('Failed to open dialer:', error)
      toast.error('Failed to open phone dialer')
    }
  }

  if (imeiSlots.length === 0) {
    return (
      <div className="space-y-4">
        <Card className="bg-amber-900/10 border-amber-900/30">
          <CardContent className="p-4">
            <div className="flex items-start gap-3">
              <Activity className="w-5 h-5 text-amber-400 flex-shrink-0 mt-0.5" />
              <div className="flex-1">
                <p className="text-sm font-medium text-amber-400 mb-2">IMEI Retrieval Restricted</p>
                <p className="text-xs text-gray-400 leading-relaxed mb-2">
                  Due to Android privacy policies (Android 10+), third-party apps cannot directly access IMEI information.
                </p>
                <p className="text-xs text-gray-400 leading-relaxed mb-2">
                  <strong>Why this happens:</strong>
                </p>
                <ul className="text-xs text-gray-400 list-disc list-inside space-y-1 mb-3">
                  <li>Android 10+ restricts IMEI access for privacy protection</li>
                  <li>Only system apps can access IMEI on newer Android versions</li>
                  <li>This is a security feature implemented by Google</li>
                </ul>
                <p className="text-xs text-gray-400 leading-relaxed mb-3">
                  <strong>How to view your IMEI:</strong>
                </p>
                <Button
                  onClick={handleDialImei}
                  className="w-full bg-emerald-600 hover:bg-emerald-700 mb-2"
                >
                  <Smartphone className="w-4 h-4 mr-2" />
                  Open Dialer
                </Button>
                <p className="text-xs text-gray-400 text-center mb-2">
                  This will open your phone dialer. Manually type <strong className="text-emerald-400">*#06#</strong> to view your IMEI.
                </p>
                <p className="text-xs text-gray-500 text-center italic">
                  Note: Some devices may auto-fill the code, but you may need to type it manually.
                </p>
              </div>
            </div>
          </CardContent>
        </Card>
        
        <Card className="bg-[#0d120d] border-emerald-900/30">
          <CardHeader>
            <CardTitle className="text-emerald-400 flex items-center gap-2 text-sm">
              <Activity className="w-4 h-4" />
              Alternative Methods
            </CardTitle>
          </CardHeader>
          <CardContent className="space-y-2 text-xs text-gray-400">
            <p>• Go to Settings → About Phone → Status → IMEI Information</p>
            <p>• Dial *#06# from your phone app</p>
            <p>• Check the original device box or SIM tray</p>
          </CardContent>
        </Card>
      </div>
    )
  }

  return (
    <div className="space-y-4">
      <Card className="bg-[#0d120d] border-emerald-900/30">
        <CardHeader>
          <CardTitle className="text-emerald-400 flex items-center gap-2">
            <Smartphone className="w-5 h-5" />
            IMEI Information
          </CardTitle>
        </CardHeader>
        <CardContent>
          <p className="text-sm text-gray-400 mb-4">
            International Mobile Equipment Identity - Unique device identifier
          </p>
          <div className="space-y-3">
            {imeiSlots.map((slot: any, index: number) => (
              <Card key={index} className="bg-emerald-900/10 border-emerald-900/30">
                <CardContent className="p-4">
                  <div className="flex items-center justify-between mb-2">
                    <span className="text-sm font-medium text-emerald-400">
                      {imeiSlots.length > 1 ? `SIM Slot ${slot.slotIndex + 1}` : 'IMEI'}
                    </span>
                    <Badge variant="outline" className="bg-emerald-900/20 text-emerald-400">
                      {slot.isActive ? 'Active' : 'Inactive'}
                    </Badge>
                  </div>
                  <div className="p-3 rounded-lg bg-[#0d120d] border border-emerald-900/20">
                    <p className="text-lg font-mono text-white text-center tracking-wider">
                      {slot.imei}
                    </p>
                  </div>
                  {slot.operatorName && (
                    <p className="text-xs text-gray-400 mt-2 text-center">
                      Operator: {slot.operatorName}
                    </p>
                  )}
                </CardContent>
              </Card>
            ))}
          </div>
        </CardContent>
      </Card>

      <Card className="bg-amber-900/10 border-amber-900/30">
        <CardContent className="p-4">
          <div className="flex items-start gap-3 mb-3">
            <Activity className="w-5 h-5 text-amber-400 flex-shrink-0 mt-0.5" />
            <div className="flex-1">
              <p className="text-sm font-medium text-amber-400 mb-1">About IMEI</p>
              <p className="text-xs text-gray-400 leading-relaxed">
                The IMEI is a unique 15-digit code that identifies your device on cellular networks. 
                It's used for device authentication, tracking, and blocking stolen devices.
              </p>
            </div>
          </div>
          <Button
            onClick={handleDialImei}
            variant="outline"
            className="w-full border-emerald-500/30 text-emerald-400 hover:bg-emerald-500/10"
          >
            <Smartphone className="w-4 h-4 mr-2" />
            Verify with *#06#
          </Button>
        </CardContent>
      </Card>
    </div>
  )
}
