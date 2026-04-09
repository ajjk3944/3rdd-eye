/**
 * Web implementation of DeviceInfo plugin
 * Used when running in browser (not Android)
 */

import { WebPlugin } from '@capacitor/core'
import type { DeviceInfoPlugin, DashboardInfo, SystemInfo, CPUInfo, BatteryInfo, StorageInfo, DisplayInfo, SensorsInfo, LocationInfo, CameraInfo, TemperatureInfo, AppsInfo } from './device-info-plugin'

export class DeviceInfoWeb extends WebPlugin implements DeviceInfoPlugin {
  async getDashboard(): Promise<DashboardInfo> {
    return {
      deviceName: 'Web Browser',
      manufacturer: 'Browser',
      brand: navigator.userAgent.includes('Chrome') ? 'Chrome' : 'Browser',
      androidVersion: 'N/A',
      sdkVersion: 0,
      memory: {
        totalRAM: 8589934592, // 8GB mock
        availableRAM: 4294967296, // 4GB mock
        usedRAM: 4294967296,
        threshold: 1073741824,
        lowMemory: false,
      },
      storage: await this.getStorageInfo(),
      battery: await this.getBatteryInfo(),
      cpu: await this.getCPUInfo(),
    }
  }

  async getSystemInfo(): Promise<SystemInfo> {
    return {
      manufacturer: 'Browser',
      brand: 'Web',
      model: 'Browser',
      device: 'web',
      product: 'web',
      hardware: navigator.platform,
      board: 'N/A',
      bootloader: 'N/A',
      fingerprint: 'N/A',
      host: window.location.hostname,
      id: 'web',
      tags: 'N/A',
      type: 'web',
      user: 'web',
      androidVersion: 'N/A',
      sdkVersion: 0,
      codename: 'N/A',
      incremental: 'N/A',
      securityPatch: 'N/A',
      androidId: 'web-' + Date.now(),
    }
  }

  async getCPUInfo(): Promise<CPUInfo> {
    return {
      abi: 'web',
      cores: navigator.hardwareConcurrency || 4,
      hardware: navigator.platform,
      supportedAbis: ['web'],
    }
  }

  async getBatteryInfo(): Promise<BatteryInfo> {
    try {
      // Try to use Battery API if available
      if ('getBattery' in navigator) {
        const battery = await (navigator as any).getBattery()
        return {
          level: Math.round(battery.level * 100),
          isCharging: battery.charging,
          health: 2, // Good
          temperature: 25.0,
          voltage: 4200,
          technology: 'Li-ion',
        }
      }
    } catch (e) {
      // Battery API not available
    }

    // Fallback mock data
    return {
      level: 85,
      isCharging: false,
      health: 2,
      temperature: 25.0,
      voltage: 4200,
      technology: 'Li-ion',
    }
  }

  async getStorageInfo(): Promise<StorageInfo> {
    try {
      // Try to use Storage API if available
      if ('storage' in navigator && 'estimate' in navigator.storage) {
        const estimate = await navigator.storage.estimate()
        const total = estimate.quota || 0
        const used = estimate.usage || 0
        const free = total - used

        return {
          internal: {
            total,
            free,
            used,
          },
        }
      }
    } catch (e) {
      // Storage API not available
    }

    // Fallback mock data
    return {
      internal: {
        total: 128000000000, // 128GB
        free: 64000000000, // 64GB
        used: 64000000000,
      },
    }
  }

  async getDisplayInfo(): Promise<DisplayInfo> {
    return {
      widthPixels: window.screen.width * window.devicePixelRatio,
      heightPixels: window.screen.height * window.devicePixelRatio,
      densityDpi: window.devicePixelRatio * 160,
      density: window.devicePixelRatio,
      scaledDensity: window.devicePixelRatio,
      xdpi: window.devicePixelRatio * 160,
      ydpi: window.devicePixelRatio * 160,
      refreshRate: 60, // Most browsers default to 60Hz
    }
  }

  async getSensors(): Promise<SensorsInfo> {
    const sensors = []

    // Check for available web sensors
    if ('Accelerometer' in window) {
      sensors.push({
        name: 'Accelerometer',
        type: 1,
        vendor: 'Browser',
        version: 1,
        power: 0.5,
        resolution: 0.01,
        maxRange: 19.6,
      })
    }

    if ('Gyroscope' in window) {
      sensors.push({
        name: 'Gyroscope',
        type: 4,
        vendor: 'Browser',
        version: 1,
        power: 0.5,
        resolution: 0.01,
        maxRange: 34.9,
      })
    }

    if ('Magnetometer' in window) {
      sensors.push({
        name: 'Magnetometer',
        type: 2,
        vendor: 'Browser',
        version: 1,
        power: 0.5,
        resolution: 0.01,
        maxRange: 100,
      })
    }

    return {
      sensors,
      count: sensors.length,
    }
  }

  async getLocationInfo(): Promise<LocationInfo> {
    const hasGeolocation = 'geolocation' in navigator

    const result: LocationInfo = {
      gpsEnabled: hasGeolocation,
      networkEnabled: hasGeolocation,
      providers: hasGeolocation ? ['geolocation'] : [],
    }

    // Try to get current position
    if (hasGeolocation) {
      try {
        const position = await new Promise<GeolocationPosition>((resolve, reject) => {
          navigator.geolocation.getCurrentPosition(resolve, reject, { timeout: 5000 })
        })
        
        result.latitude = position.coords.latitude
        result.longitude = position.coords.longitude
        result.altitude = position.coords.altitude || 0
        result.speed = position.coords.speed || 0
        result.accuracy = position.coords.accuracy
        result.bearing = position.coords.heading || 0
      } catch (e) {
        // Position not available
      }
    }

    return result
  }

  async getCameraInfo(): Promise<CameraInfo> {
    // Try to enumerate media devices
    try {
      if (navigator.mediaDevices && navigator.mediaDevices.enumerateDevices) {
        const devices = await navigator.mediaDevices.enumerateDevices()
        const cameras = devices.filter(d => d.kind === 'videoinput')
        
        return {
          cameras: cameras.map((cam, i) => ({
            id: cam.deviceId,
            facing: cam.label.toLowerCase().includes('front') ? 'Front' : 'Back',
            megapixels: 'Unknown',
            maxResolution: 'Unknown',
            hasFlash: false,
          })),
          count: cameras.length,
        }
      }
    } catch (e) {
      // Media devices not available
    }

    return {
      cameras: [],
      count: 0,
    }
  }

  async getTemperatureInfo(): Promise<TemperatureInfo> {
    return {
      battery: 25.0,
      hasAmbientSensor: false,
      hasDeviceSensor: false,
    }
  }

  async getInstalledApps(): Promise<AppsInfo> {
    // Not available in web
    return {
      systemApps: [],
      userApps: [],
      systemCount: 0,
      userCount: 0,
      totalCount: 0,
    }
  }

  async uninstallApp(options: { packageName: string }): Promise<void> {
    throw new Error('Uninstall not available in web mode')
  }

  async openAppInfo(options: { packageName: string }): Promise<void> {
    throw new Error('App info not available in web mode')
  }

  async getSimInfo(): Promise<any> {
    // SIM info not available in web mode
    return {
      hasSimCard: false,
      simCount: 0,
      simSlots: [],
      networkStats: [],
      error: 'SIM information is only available on Android devices',
    }
  }
}
