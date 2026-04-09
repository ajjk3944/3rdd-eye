// Hidden Camera Detector Plugin Interface for Capacitor

export interface CameraDetectorPlugin {
  // Check if device has required sensors
  hasMagnetometer(): Promise<{ hasSensor: boolean }>;
  hasIrEmitter(): Promise<{ hasIrEmitter: boolean }>;
  hasCamera(): Promise<{ hasCamera: boolean }>;
  
  // Start/Stop magnetic field monitoring
  startMagneticScan(): Promise<{ success: boolean; error?: string }>;
  stopMagneticScan(): Promise<{ success: boolean }>;
  
  // Start/Stop IR reflection detection
  startIRDetection(): Promise<{ success: boolean; error?: string }>;
  stopIRDetection(): Promise<{ success: boolean }>;
  
  // Start/Stop camera lens detection (using flashlight reflection)
  startLensDetection(): Promise<{ success: boolean; error?: string }>;
  stopLensDetection(): Promise<{ success: boolean }>;
  
  // Get current readings
  getMagneticReading(): Promise<MagneticReading>;
  getIRReading(): Promise<IRReading>;
  
  // Event listeners for real-time updates
  addListener(
    eventName: 'magneticAnomaly' | 'irReflection' | 'lensDetected',
    callback: (data: DetectionEvent) => void
  ): Promise<{ remove: () => void }>;
}

export interface MagneticReading {
  success: boolean;
  x: number;
  y: number;
  z: number;
  magnitude: number;
  anomalyDetected: boolean;
  threshold: number;
  timestamp: number;
  error?: string;
}

export interface IRReading {
  success: boolean;
  reflectionDetected: boolean;
  intensity: number;
  confidence: number;
  timestamp: number;
  error?: string;
}

export interface DetectionEvent {
  type: 'magnetic' | 'ir' | 'lens';
  severity: 'low' | 'medium' | 'high';
  confidence: number;
  location?: { x: number; y: number; z: number };
  message: string;
  timestamp: number;
}

export interface DetectionResult {
  detected: boolean;
  type: 'magnetic' | 'ir' | 'lens' | 'multiple';
  confidence: number;
  details: string;
  recommendations: string[];
  timestamp: number;
}

// Check if running in Capacitor
const isCapacitor = typeof window !== 'undefined' && 
  (window as any).Capacitor !== undefined;

// Get the plugin from Capacitor
export const getCameraDetector = (): CameraDetectorPlugin | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  if (Capacitor?.Plugins?.CameraDetector) {
    return Capacitor.Plugins.CameraDetector as CameraDetectorPlugin;
  }
  return null;
};

// Detection modes
export type DetectionMode = 'magnetic' | 'ir' | 'lens' | 'all';

export interface DetectionConfig {
  mode: DetectionMode;
  sensitivity: 'low' | 'medium' | 'high';
  duration: number; // in seconds
  autoStop: boolean;
}

// Default configurations
export const DEFAULT_CONFIGS: Record<DetectionMode, DetectionConfig> = {
  magnetic: {
    mode: 'magnetic',
    sensitivity: 'medium',
    duration: 30,
    autoStop: true,
  },
  ir: {
    mode: 'ir',
    sensitivity: 'medium',
    duration: 20,
    autoStop: true,
  },
  lens: {
    mode: 'lens',
    sensitivity: 'high',
    duration: 15,
    autoStop: true,
  },
  all: {
    mode: 'all',
    sensitivity: 'medium',
    duration: 60,
    autoStop: true,
  },
};

// Sensitivity thresholds for magnetic field (in microTesla)
export const MAGNETIC_THRESHOLDS = {
  low: 100,    // Less sensitive, fewer false positives
  medium: 70,  // Balanced
  high: 50,    // More sensitive, may have false positives
};

// Helper function to calculate magnetic field magnitude
export const calculateMagnitude = (x: number, y: number, z: number): number => {
  return Math.sqrt(x * x + y * y + z * z);
};

// Helper function to detect anomaly
export const isAnomalous = (
  magnitude: number,
  baseline: number,
  sensitivity: 'low' | 'medium' | 'high'
): boolean => {
  const threshold = MAGNETIC_THRESHOLDS[sensitivity];
  return Math.abs(magnitude - baseline) > threshold;
};

// Detection tips for users
export const DETECTION_TIPS = {
  magnetic: [
    'Move your phone slowly around the room',
    'Pay attention to unusual objects (smoke detectors, wall outlets, decorations)',
    'Hidden cameras often have small motors or electronics that create magnetic fields',
    'Check mirrors, clocks, and electronic devices',
  ],
  ir: [
    'Turn off room lights for better detection',
    'Point your phone camera at suspicious objects',
    'Camera lenses reflect IR light differently than normal surfaces',
    'Check smoke detectors, air vents, and decorative items',
  ],
  lens: [
    'Use in a dark room for best results',
    'Slowly scan the room with your phone',
    'Camera lenses will show a bright reflection',
    'Check common hiding spots: smoke detectors, clocks, USB chargers',
  ],
  all: [
    'Perform scan in a quiet, dark room if possible',
    'Move slowly and methodically',
    'Check all suspicious objects and locations',
    'Combine multiple detection methods for best results',
  ],
};

// Common hiding spots for hidden cameras
export const COMMON_HIDING_SPOTS = [
  'Smoke detectors',
  'Wall clocks',
  'Picture frames',
  'Air vents',
  'Power outlets',
  'USB chargers',
  'Alarm clocks',
  'Mirrors',
  'Decorative items',
  'Stuffed toys',
  'Books on shelves',
  'Light fixtures',
  'Speakers',
  'TV boxes',
];
