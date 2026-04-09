'use client';

import { useState, useEffect, useRef } from 'react';
import { Eye, Camera, Flashlight, FlashlightOff, ArrowLeft } from 'lucide-react';
import { useRouter } from 'next/navigation';
import { Button } from '@/components/ui/button';
import { Card } from '@/components/ui/card';
import { Badge } from '@/components/ui/badge';
import { toast } from 'sonner';
import { registerBackButtonHandler } from '@/lib/back-button-manager';

export default function InfraredDetectorPage() {
  const router = useRouter();
  const videoRef = useRef<HTMLVideoElement>(null);
  const [isActive, setIsActive] = useState(false);
  const [error, setError] = useState('');
  const [flashlightOn, setFlashlightOn] = useState(false);
  const [stream, setStream] = useState<MediaStream | null>(null);

  useEffect(() => {
    startCamera();
    return () => stopCamera();
  }, []);

  // Handle Android hardware back button
  useEffect(() => {
    let cleanup: (() => void) | null = null;

    const setupBackButton = async () => {
      cleanup = await registerBackButtonHandler(() => {
        stopCamera();
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

  const startCamera = async () => {
    try {
      const mediaStream = await navigator.mediaDevices.getUserMedia({
        video: { 
          facingMode: 'environment',
          width: { ideal: 1920 },
          height: { ideal: 1080 }
        }
      });
      
      if (videoRef.current) {
        videoRef.current.srcObject = mediaStream;
        setStream(mediaStream);
        setIsActive(true);
        setError('');
        toast.success('Camera activated');
      }
    } catch (err) {
      setError('Camera access denied. Please grant permission.');
      toast.error('Camera access denied');
      console.error('Camera error:', err);
    }
  };

  const stopCamera = () => {
    if (stream) {
      stream.getTracks().forEach(track => track.stop());
    }
  };

  const toggleFlashlight = async () => {
    if (!stream) return;

    try {
      const track = stream.getVideoTracks()[0];
      const capabilities = track.getCapabilities() as any;

      if (capabilities.torch) {
        await track.applyConstraints({
          // @ts-ignore
          advanced: [{ torch: !flashlightOn }]
        });
        setFlashlightOn(!flashlightOn);
        toast.success(flashlightOn ? 'Flashlight off' : 'Flashlight on');
      } else {
        toast.error('Flashlight not supported on this device');
      }
    } catch (err) {
      console.error('Flashlight error:', err);
      toast.error('Failed to toggle flashlight');
    }
  };

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
                stopCamera();
                router.back();
              }}
              className="text-slate-400 hover:text-white hover:bg-slate-800"
            >
              <ArrowLeft className="w-5 h-5" />
            </Button>
            <div className="p-2 rounded-lg bg-emerald-500/20">
              <Eye className="w-6 h-6 text-emerald-400" />
            </div>
            <div>
              <h2 className="text-xl font-bold text-white">Infrared Detector</h2>
              <p className="text-sm text-slate-400">Point at suspicious devices</p>
            </div>
          </div>
          <Button
            size="sm"
            variant="outline"
            onClick={toggleFlashlight}
            className={flashlightOn ? 'border-emerald-500/30 text-emerald-400' : 'border-slate-600 text-slate-400'}
          >
            {flashlightOn ? <Flashlight className="w-4 h-4" /> : <FlashlightOff className="w-4 h-4" />}
          </Button>
        </div>
      </div>

      <div className="flex-1 flex flex-col p-4 space-y-4 overflow-y-auto">
        {error && (
          <Card className="bg-red-500/20 border-red-500 p-4">
            <p className="text-red-200 text-sm">{error}</p>
            <Button
              onClick={startCamera}
              className="w-full mt-3 bg-red-500 hover:bg-red-600 text-white"
            >
              Retry Camera Access
            </Button>
          </Card>
        )}

        {/* Camera View */}
        <div className="relative rounded-lg overflow-hidden bg-black" style={{ aspectRatio: '4/3' }}>
          <video
            ref={videoRef}
            autoPlay
            playsInline
            muted
            className="w-full h-full object-cover"
            style={{ 
              filter: 'brightness(1.5) contrast(1.5) saturate(1.2)',
              transform: 'scaleX(-1)' // Mirror effect
            }}
          />
          
          {/* Scanning Overlay */}
          {isActive && (
            <>
              <div className="absolute top-4 left-4 bg-emerald-500 text-white px-3 py-1 rounded-full text-sm flex items-center gap-2">
                <div className="w-2 h-2 bg-white rounded-full animate-pulse" />
                Scanning for IR
              </div>
              
              {/* Crosshair */}
              <div className="absolute inset-0 flex items-center justify-center pointer-events-none">
                <div className="relative w-32 h-32">
                  <div className="absolute top-0 left-0 w-8 h-8 border-t-2 border-l-2 border-emerald-400"></div>
                  <div className="absolute top-0 right-0 w-8 h-8 border-t-2 border-r-2 border-emerald-400"></div>
                  <div className="absolute bottom-0 left-0 w-8 h-8 border-b-2 border-l-2 border-emerald-400"></div>
                  <div className="absolute bottom-0 right-0 w-8 h-8 border-b-2 border-r-2 border-emerald-400"></div>
                </div>
              </div>
            </>
          )}

          {!isActive && !error && (
            <div className="absolute inset-0 flex items-center justify-center bg-slate-900/50">
              <div className="text-center">
                <Camera className="w-12 h-12 text-slate-400 mx-auto mb-2 animate-pulse" />
                <p className="text-slate-400">Initializing camera...</p>
              </div>
            </div>
          )}
        </div>

        {/* Instructions */}
        <Card className="bg-slate-800/50 border-emerald-500/20 p-4">
          <h3 className="text-white font-semibold mb-3 flex items-center gap-2">
            <Eye className="w-5 h-5 text-emerald-400" />
            How to Use
          </h3>
          <ul className="text-slate-300 space-y-2 text-sm">
            <li>• Turn off room lights for best results</li>
            <li>• Point camera at suspicious objects</li>
            <li>• Look for white, purple, or bright spots</li>
            <li>• IR LEDs appear as glowing lights on screen</li>
            <li>• Check smoke detectors, clocks, USB chargers</li>
            <li>• Move slowly to scan the entire area</li>
          </ul>
        </Card>

        {/* What to Look For */}
        <Card className="bg-slate-800/50 border-amber-500/20 p-4">
          <h3 className="text-amber-400 font-semibold mb-3">What to Look For</h3>
          <div className="space-y-2 text-sm text-slate-300">
            <div className="flex items-start gap-2">
              <div className="w-3 h-3 rounded-full bg-purple-500 mt-1 flex-shrink-0"></div>
              <span>Purple/violet glowing spots indicate IR LEDs</span>
            </div>
            <div className="flex items-start gap-2">
              <div className="w-3 h-3 rounded-full bg-white mt-1 flex-shrink-0"></div>
              <span>Bright white spots that aren't visible to naked eye</span>
            </div>
            <div className="flex items-start gap-2">
              <div className="w-3 h-3 rounded-full bg-blue-500 mt-1 flex-shrink-0"></div>
              <span>Blinking lights from remote controls or cameras</span>
            </div>
          </div>
        </Card>

        {/* Common Locations */}
        <Card className="bg-slate-800/50 border-emerald-500/20 p-4">
          <h3 className="text-white font-semibold mb-3">Common Hidden Camera Locations</h3>
          <div className="grid grid-cols-2 gap-2 text-sm text-slate-300">
            <div>• Smoke detectors</div>
            <div>• Alarm clocks</div>
            <div>• USB chargers</div>
            <div>• Picture frames</div>
            <div>• Air vents</div>
            <div>• Light fixtures</div>
            <div>• Mirrors</div>
            <div>• Electrical outlets</div>
          </div>
        </Card>
      </div>
    </div>
  );
}
