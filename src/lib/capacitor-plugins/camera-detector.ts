import { registerPlugin } from '@capacitor/core';

export interface CameraDetectorPlugin {
  checkPermissions(): Promise<{ camera: boolean; vibrate: boolean }>;
  requestPermissions(): Promise<{ granted: boolean }>;
  hasMagnetometer(): Promise<{ hasSensor: boolean }>;
  startMagnetometer(): Promise<{ started: boolean }>;
  stopMagnetometer(): Promise<{ stopped: boolean }>;
  getCurrentReading(): Promise<{ magneticField: number }>;
  openMagneticDetector(): Promise<void>;
  openInfraredDetector(): Promise<void>;
  openObjectDetector(): Promise<void>;
  detectObjects(options: { image: string }): Promise<{ detections: Detection[] }>;
}

export interface MagnetometerData {
  x: number;
  y: number;
  z: number;
  magnitude: number;
}

export interface Detection {
  id: string;
  title: string;
  confidence: number;
  location: {
    left: number;
    top: number;
    right: number;
    bottom: number;
  };
}

const CameraDetector = registerPlugin<CameraDetectorPlugin>('CameraDetector', {
  web: () => import('./camera-detector-web').then(m => new m.CameraDetectorWeb()),
});

export default CameraDetector;
