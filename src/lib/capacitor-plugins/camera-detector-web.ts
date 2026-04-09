import { WebPlugin } from '@capacitor/core';
import type { CameraDetectorPlugin } from './camera-detector';

export class CameraDetectorWeb extends WebPlugin implements CameraDetectorPlugin {
  async checkPermissions(): Promise<{ camera: boolean; vibrate: boolean }> {
    return { camera: false, vibrate: false };
  }

  async requestPermissions(): Promise<{ granted: boolean }> {
    return { granted: false };
  }

  async hasMagnetometer(): Promise<{ hasSensor: boolean }> {
    return { hasSensor: 'Magnetometer' in window };
  }

  async startMagnetometer(): Promise<{ started: boolean }> {
    return { started: false };
  }

  async stopMagnetometer(): Promise<{ stopped: boolean }> {
    return { stopped: true };
  }

  async getCurrentReading(): Promise<{ magneticField: number }> {
    return { magneticField: 0 };
  }

  async openMagneticDetector(): Promise<void> {
    console.log('Magnetic detector not available on web');
  }

  async openInfraredDetector(): Promise<void> {
    console.log('Infrared detector not available on web');
  }

  async openObjectDetector(): Promise<void> {
    console.log('Object detector not available on web');
  }
}

