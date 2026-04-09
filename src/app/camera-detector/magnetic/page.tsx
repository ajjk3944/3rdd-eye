'use client';

import { useState, useEffect, useRef } from 'react';
import { Radio, ArrowLeft } from 'lucide-react';
import { useRouter } from 'next/navigation';
import { Button } from '@/components/ui/button';
import { Card } from '@/components/ui/card';
import { Badge } from '@/components/ui/badge';
import { toast } from 'sonner';
import CameraDetector, { type MagnetometerData } from '@/lib/capacitor-plugins/camera-detector';
import { Capacitor } from '@capacitor/core';
import { registerBackButtonHandler } from '@/lib/back-button-manager';

// Haptics import with error handling
let Haptics: any = null;
let ImpactStyle: any = null;

if (typeof window !== 'undefined') {
  try {
    const hapticsModule = require('@capacitor/haptics');
    Haptics = hapticsModule.Haptics;
    ImpactStyle = hapticsModule.ImpactStyle;
  } catch (error) {
    console.log('Haptics not available');
  }
}

export default function MagneticDetectorPage() {
  const router = useRouter();
  const [magneticField, setMagneticField] = useState(0);
  const [isDetecting, setIsDetecting] = useState(false);
  const [maxReading, setMaxReading] = useState(0);
  const [soundEnabled, setSoundEnabled] = useState(true);
  const [vibrateEnabled, setVibrateEnabled] = useState(true);
  const [hasSensor, setHasSensor] = useState(false);
  
  const audioContextRef = useRef<AudioContext | null>(null);
  const oscillatorRef = useRef<OscillatorNode | null>(null);
  const gainNodeRef = useRef<GainNode | null>(null);
  const lastAlertTimeRef = useRef<number>(0);
  const isPlayingRef = useRef<boolean>(false);
  const lastVibrateLevel = useRef<string>('');
  const pollingIntervalRef = useRef<NodeJS.Timeout | null>(null);

  useEffect(() => {
    initializeSensor();
    initializeAudio();
    
    return () => {
      cleanup();
    };
  }, []);

  // Handle Android hardware back button
  useEffect(() => {
    let cleanup: (() => void) | null = null;

    const setupBackButton = async () => {
      cleanup = await registerBackButtonHandler(() => {
        // Stop magnetometer and cleanup
        if (pollingIntervalRef.current) {
          clearInterval(pollingIntervalRef.current);
          pollingIntervalRef.current = null;
        }
        stopAlert();
        if (Capacitor.isNativePlatform()) {
          CameraDetector.stopMagnetometer().catch(err => console.error('Stop error:', err));
        }
        
        // Navigate back
        router.push('/?tab=camera-detector');
      });
    };

    setupBackButton();

    return () => {
      if (cleanup) {
        cleanup();
      }
    };
  }, [router]);

  const initializeAudio = () => {
    try {
      if (typeof window !== 'undefined') {
        const AudioContext = window.AudioContext || (window as any).webkitAudioContext;
        if (AudioContext) {
          audioContextRef.current = new AudioContext();
        }
      }
    } catch (error) {
      console.error('Audio initialization error:', error);
    }
  };

  const initializeSensor = async () => {
    try {
      if (Capacitor.isNativePlatform()) {
        const result = await CameraDetector.hasMagnetometer();
        setHasSensor(result.hasSensor);

        if (result.hasSensor) {
          await CameraDetector.startMagnetometer();
          
          // Poll for updates and store interval reference
          pollingIntervalRef.current = setInterval(async () => {
            try {
              const reading = await CameraDetector.getCurrentReading();
              handleMagnetometerUpdate({ 
                x: 0, 
                y: 0, 
                z: 0, 
                magnitude: reading.magneticField 
              });
            } catch (err) {
              console.error('Reading error:', err);
            }
          }, 100); // Poll every 100ms for instant response

          toast.success('Magnetometer activated');
        } else {
          toast.error('Magnetometer not available on this device');
        }
      } else {
        toast.error('Magnetometer requires native app', {
          description: 'Please use the Android app for full functionality'
        });
      }
    } catch (error) {
      console.error('Magnetometer error:', error);
      toast.error('Failed to initialize magnetometer');
    }
  };

  const handleMagnetometerUpdate = (data: MagnetometerData) => {
    const magnitude = data.magnitude;
    
    setMagneticField(magnitude);
    setMaxReading(prev => Math.max(prev, magnitude));
    setIsDetecting(true);

    // Trigger alerts based on threshold with 3-level vibration (matching 3rd Eye app)
    // 3rd Eye uses: <45 low, 45-80 normal, 80-120 high, >120 extreme
    // Alert starts at 50 (j4 >= 50 in original code)
    if (magnitude >= 120) {
      handleAlert(magnitude, 'extreme');
    } else if (magnitude > 80) {
      handleAlert(magnitude, 'high');
    } else if (magnitude >= 50) {
      handleAlert(magnitude, 'moderate');
    } else {
      stopAlert();
    }
  };

  const handleAlert = async (magnitude: number, level: 'moderate' | 'high' | 'extreme') => {
    const now = Date.now();
    
    // Check if sound is enabled before playing
    if (soundEnabled && audioContextRef.current) {
      if (!isPlayingRef.current) {
        playBeep(level);
      }
    } else {
      // Stop sound if it's playing but sound is now disabled
      if (isPlayingRef.current) {
        stopAlert();
      }
    }

    // 3-level vibration (throttled to every 300-700ms based on level)
    const vibrateInterval = level === 'extreme' ? 300 : level === 'high' ? 500 : 700;
    
    // Check if vibrate is enabled before vibrating
    if (vibrateEnabled && now - lastAlertTimeRef.current > vibrateInterval) {
      lastAlertTimeRef.current = now;
      lastVibrateLevel.current = level;
      
      if (Capacitor.isNativePlatform() && Haptics && ImpactStyle) {
        try {
          const style = level === 'extreme' ? ImpactStyle.Heavy : 
                       level === 'high' ? ImpactStyle.Medium : 
                       ImpactStyle.Light;
          await Haptics.impact({ style });
        } catch (error) {
          // Fallback to web vibration
          if ('vibrate' in navigator) {
            const pattern = level === 'extreme' ? [200, 100, 200] : 
                           level === 'high' ? [150, 100, 150] : 
                           [100];
            navigator.vibrate(pattern);
          }
        }
      } else if ('vibrate' in navigator) {
        const pattern = level === 'extreme' ? [200, 100, 200] : 
                       level === 'high' ? [150, 100, 150] : 
                       [100];
        navigator.vibrate(pattern);
      }
    }
  };

  const playBeep = (level: 'moderate' | 'high' | 'extreme') => {
    if (!audioContextRef.current || isPlayingRef.current) return;

    try {
      const ctx = audioContextRef.current;
      
      // Resume audio context if suspended
      if (ctx.state === 'suspended') {
        ctx.resume();
      }

      // Create oscillator for beep sound
      const oscillator = ctx.createOscillator();
      const gainNode = ctx.createGain();
      
      oscillator.connect(gainNode);
      gainNode.connect(ctx.destination);
      
      // Different frequencies for different levels
      const frequency = level === 'extreme' ? 1200 : level === 'high' ? 1000 : 800;
      oscillator.frequency.value = frequency;
      oscillator.type = 'sine';
      
      gainNode.gain.setValueAtTime(0.3, ctx.currentTime);
      
      oscillator.start(ctx.currentTime);
      
      oscillatorRef.current = oscillator;
      gainNodeRef.current = gainNode;
      isPlayingRef.current = true;

      // Schedule beep pattern based on level
      const beepDuration = level === 'extreme' ? 150 : level === 'high' ? 200 : 250;
      const beepInterval = setInterval(() => {
        if (!isPlayingRef.current) {
          clearInterval(beepInterval);
          return;
        }
        
        if (gainNode.gain.value > 0) {
          gainNode.gain.setValueAtTime(0, ctx.currentTime);
        } else {
          gainNode.gain.setValueAtTime(0.3, ctx.currentTime);
        }
      }, beepDuration);

    } catch (error) {
      console.error('Beep error:', error);
    }
  };

  const stopAlert = () => {
    if (oscillatorRef.current && isPlayingRef.current) {
      try {
        oscillatorRef.current.stop();
        oscillatorRef.current.disconnect();
        oscillatorRef.current = null;
        gainNodeRef.current = null;
        isPlayingRef.current = false;
      } catch (error) {
        console.error('Stop beep error:', error);
      }
    }
  };

  const cleanup = async () => {
    try {
      console.log('Starting cleanup...');
      
      // Clear polling interval first
      if (pollingIntervalRef.current) {
        clearInterval(pollingIntervalRef.current);
        pollingIntervalRef.current = null;
      }
      
      stopAlert();
      
      // Stop any ongoing vibration
      if ('vibrate' in navigator) {
        navigator.vibrate(0);
      }
      
      if (Capacitor.isNativePlatform() && Haptics) {
        try {
          await Haptics.vibrate({ duration: 0 });
        } catch (error) {
          console.error('Stop vibration error:', error);
        }
      }
      
      if (Capacitor.isNativePlatform()) {
        try {
          await CameraDetector.stopMagnetometer();
          console.log('Magnetometer stopped successfully');
        } catch (error) {
          console.error('Stop magnetometer error:', error);
        }
      }
      
      if (audioContextRef.current) {
        try {
          await audioContextRef.current.close();
        } catch (error) {
          console.error('Audio context close error:', error);
        }
      }
      
      console.log('Cleanup completed');
    } catch (error) {
      console.error('Cleanup error:', error);
    }
  };

  const getStatus = () => {
    // Match 3rd Eye app thresholds: <45 low, 45-80 normal, 80-120 high, >120 extreme
    if (magneticField < 45) {
      return { 
        text: 'LOW RADIATION', 
        color: 'text-green-400', 
        bg: 'bg-green-500/20',
        border: 'border-green-500'
      };
    }
    if (magneticField >= 45 && magneticField <= 80) {
      return { 
        text: 'NORMAL RADIATION', 
        color: 'text-yellow-400', 
        bg: 'bg-yellow-500/20',
        border: 'border-yellow-500'
      };
    }
    if (magneticField > 80 && magneticField <= 120) {
      return { 
        text: 'HIGH RADIATION', 
        color: 'text-orange-400', 
        bg: 'bg-orange-500/20',
        border: 'border-orange-500'
      };
    }
    return { 
      text: 'EXTREME RADIATION', 
      color: 'text-red-400', 
      bg: 'bg-red-500/20',
      border: 'border-red-500'
    };
  };

  const status = getStatus();
  // Match 3rd Eye app: (magnitude / 200) * 100 for percentage
  const percentage = Math.min((magneticField / 200) * 100, 100);

  return (
    <div className="h-full flex flex-col bg-gradient-to-br from-slate-950 via-slate-900 to-slate-950">
      {/* Header */}
      <div className="p-4 border-b border-emerald-500/20 bg-slate-900/50 backdrop-blur-sm">
        <div className="flex items-center justify-between">
          <div className="flex items-center gap-3">
            <Button
              size="sm"
              variant="ghost"
              onClick={() => {
                // Stop magnetometer and cleanup
                if (pollingIntervalRef.current) {
                  clearInterval(pollingIntervalRef.current);
                  pollingIntervalRef.current = null;
                }
                stopAlert();
                if (Capacitor.isNativePlatform()) {
                  CameraDetector.stopMagnetometer().catch(err => console.error('Stop error:', err));
                }
                router.back();
              }}
              className="text-slate-400 hover:text-white hover:bg-slate-800"
            >
              <ArrowLeft className="w-5 h-5" />
            </Button>
            <div className="p-2 rounded-lg bg-emerald-500/20">
              <Radio className="w-6 h-6 text-emerald-400" />
            </div>
            <div>
              <h2 className="text-xl font-bold text-white">Magnetic Field Detector</h2>
              <p className="text-sm text-slate-400">Move phone near suspicious objects</p>
            </div>
          </div>
        </div>
      </div>

      <div className="flex-1 p-4 space-y-4 overflow-y-auto">
        {/* Main Reading Display - Gauge Style */}
        <Card className={`${status.bg} border-2 ${status.border} p-6`}>
          <div className="text-center space-y-4">
            {/* Circular Gauge */}
            <div className="relative w-56 h-56 mx-auto">
              {/* Background arc */}
              <svg className="w-full h-full transform -rotate-90">
                <circle
                  cx="112"
                  cy="112"
                  r="100"
                  stroke="currentColor"
                  strokeWidth="12"
                  fill="none"
                  className="text-slate-700"
                  strokeDasharray={`${Math.PI * 200 * 0.75}`}
                  strokeDashoffset={`${Math.PI * 200 * 0.125}`}
                />
                {/* Colored segments */}
                <circle
                  cx="112"
                  cy="112"
                  r="100"
                  stroke="#10b981"
                  strokeWidth="12"
                  fill="none"
                  strokeDasharray={`${Math.PI * 200 * 0.2} ${Math.PI * 200}`}
                  strokeDashoffset={`${Math.PI * 200 * 0.125}`}
                  strokeLinecap="round"
                />
                <circle
                  cx="112"
                  cy="112"
                  r="100"
                  stroke="#f59e0b"
                  strokeWidth="12"
                  fill="none"
                  strokeDasharray={`${Math.PI * 200 * 0.15} ${Math.PI * 200}`}
                  strokeDashoffset={`${Math.PI * 200 * -0.075}`}
                  strokeLinecap="round"
                />
                <circle
                  cx="112"
                  cy="112"
                  r="100"
                  stroke="#f97316"
                  strokeWidth="12"
                  fill="none"
                  strokeDasharray={`${Math.PI * 200 * 0.15} ${Math.PI * 200}`}
                  strokeDashoffset={`${Math.PI * 200 * -0.225}`}
                  strokeLinecap="round"
                />
                <circle
                  cx="112"
                  cy="112"
                  r="100"
                  stroke="#ef4444"
                  strokeWidth="12"
                  fill="none"
                  strokeDasharray={`${Math.PI * 200 * 0.25} ${Math.PI * 200}`}
                  strokeDashoffset={`${Math.PI * 200 * -0.375}`}
                  strokeLinecap="round"
                />
                {/* Needle */}
                <line
                  x1="112"
                  y1="112"
                  x2="112"
                  y2="20"
                  stroke="currentColor"
                  strokeWidth="3"
                  className={status.color}
                  transform={`rotate(${-135 + (percentage / 100) * 270} 112 112)`}
                  strokeLinecap="round"
                />
                <circle
                  cx="112"
                  cy="112"
                  r="8"
                  fill="currentColor"
                  className={status.color}
                />
              </svg>
              <div className="absolute inset-0 flex flex-col items-center justify-center">
                <div className="text-5xl font-bold text-white mt-8">
                  {magneticField.toFixed(1)}
                </div>
                <div className="text-lg text-slate-400">µT</div>
              </div>
            </div>

            {/* Status Badge */}
            <Badge className={`${status.bg} ${status.color} text-lg px-4 py-2`}>
              {status.text}
            </Badge>
          </div>
        </Card>

        {/* Stats Grid */}
        <div className="grid grid-cols-2 gap-4">
          <Card className="bg-slate-800/50 border-emerald-500/20 p-4">
            <div className="text-slate-400 text-sm mb-1">Current Reading</div>
            <div className="text-2xl font-bold text-white">{magneticField.toFixed(1)} µT</div>
          </Card>
          <Card className="bg-slate-800/50 border-emerald-500/20 p-4">
            <div className="text-slate-400 text-sm mb-1">Max Reading</div>
            <div className="text-2xl font-bold text-emerald-400">{maxReading.toFixed(1)} µT</div>
          </Card>
          <Card className="bg-slate-800/50 border-emerald-500/20 p-4">
            <div className="text-slate-400 text-sm mb-1">Percentage</div>
            <div className="text-2xl font-bold text-white">{percentage.toFixed(0)}%</div>
          </Card>
          <Card className="bg-slate-800/50 border-emerald-500/20 p-4">
            <div className="text-slate-400 text-sm mb-1">Status</div>
            <div className={`text-lg font-bold ${status.color}`}>
              {isDetecting ? 'Active' : 'Inactive'}
            </div>
          </Card>
        </div>

        {/* Detection Guide */}
        <Card className="bg-slate-800/50 border-emerald-500/20 p-4">
          <h3 className="text-white font-semibold mb-3">Detection Guide</h3>
          <ul className="text-slate-300 space-y-2 text-sm">
            <li className="flex items-center gap-2">
              <div className="w-3 h-3 rounded-full bg-green-500"></div>
              <span>Low (&lt;45 µT): Normal magnetic field</span>
            </li>
            <li className="flex items-center gap-2">
              <div className="w-3 h-3 rounded-full bg-yellow-500"></div>
              <span>Normal (45-80 µT): Typical electronic device</span>
            </li>
            <li className="flex items-center gap-2">
              <div className="w-3 h-3 rounded-full bg-orange-500"></div>
              <span>High (80-120 µT): Likely hidden camera or magnet</span>
            </li>
            <li className="flex items-center gap-2">
              <div className="w-3 h-3 rounded-full bg-red-500"></div>
              <span>Extreme (&gt;120 µT): Strong electromagnetic source</span>
            </li>
          </ul>
        </Card>

        {/* Vibration Levels */}
        <Card className="bg-slate-800/50 border-purple-500/20 p-4">
          <h3 className="text-purple-400 font-semibold mb-3">3-Level Vibration Alert</h3>
          <ul className="text-slate-300 space-y-2 text-sm">
            <li>• <strong>Light vibration:</strong> Moderate level (50-80 µT)</li>
            <li>• <strong>Medium vibration:</strong> High level (80-120 µT)</li>
            <li>• <strong>Heavy vibration:</strong> Extreme level (&gt;120 µT)</li>
          </ul>
        </Card>

        {/* Important Note */}
        <Card className="bg-blue-500/20 border-blue-500 p-4">
          <p className="text-blue-200 text-sm">
            <strong>📱 Note:</strong> This detector shows the actual magnetic field strength in µT (microtesla). 
            Your phone's baseline is typically 30-50 µT. Readings above 120 µT indicate strong electromagnetic 
            sources like hidden cameras or recording devices. Based on 3rd Eye app implementation.
          </p>
        </Card>

        {!hasSensor && !isDetecting && (
          <Card className="bg-red-500/20 border-red-500 p-4">
            <p className="text-red-200 text-sm font-semibold mb-2">
              Magnetometer not available on this device
            </p>
            <p className="text-red-300 text-xs">
              Try infrared or object detection instead. Make sure you're using the Android app for full sensor access.
            </p>
          </Card>
        )}
      </div>
    </div>
  );
}
