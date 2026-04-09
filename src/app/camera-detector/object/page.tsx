'use client';

import { useState, useEffect, useRef } from 'react';
import { Scan, Camera, ArrowLeft } from 'lucide-react';
import { useRouter } from 'next/navigation';
import { Button } from '@/components/ui/button';
import { Card } from '@/components/ui/card';
import { Badge } from '@/components/ui/badge';
import { toast } from 'sonner';
import CameraDetector, { type Detection } from '@/lib/capacitor-plugins/camera-detector';
import { Capacitor } from '@capacitor/core';
import { registerBackButtonHandler } from '@/lib/back-button-manager';

export default function ObjectDetectorPage() {
  const router = useRouter();
  const videoRef = useRef<HTMLVideoElement>(null);
  const canvasRef = useRef<HTMLCanvasElement>(null);
  const [isActive, setIsActive] = useState(false);
  const [error, setError] = useState('');
  const [stream, setStream] = useState<MediaStream | null>(null);
  const [detections, setDetections] = useState<Detection[]>([]);
  const [isDetecting, setIsDetecting] = useState(false);
  const [fps, setFps] = useState(0);
  const detectionIntervalRef = useRef<NodeJS.Timeout | null>(null);
  const lastFrameTimeRef = useRef<number>(0);

  useEffect(() => {
    startCamera();
    return () => {
      stopCamera();
      if (detectionIntervalRef.current) {
        clearInterval(detectionIntervalRef.current);
      }
    };
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
          width: { ideal: 640 },
          height: { ideal: 480 }
        }
      });
      
      if (videoRef.current) {
        videoRef.current.srcObject = mediaStream;
        setStream(mediaStream);
        setIsActive(true);
        setError('');
        toast.success('Camera activated');
        
        // Start detection loop on native platform
        if (Capacitor.isNativePlatform()) {
          startDetectionLoop();
        } else {
          toast.info('Object detection requires native app', {
            description: 'Camera preview available, but AI detection needs Android app'
          });
        }
      }
    } catch (err) {
      setError('Camera access denied. Please grant permission.');
      toast.error('Camera access denied');
      console.error('Camera error:', err);
    }
  };

  const startDetectionLoop = () => {
    // Run detection every 500ms (2 FPS) to balance performance and accuracy
    detectionIntervalRef.current = setInterval(() => {
      detectFrame();
    }, 500);
  };

  const detectFrame = async () => {
    if (!videoRef.current || !canvasRef.current || isDetecting) return;
    
    setIsDetecting(true);
    const startTime = performance.now();
    
    try {
      const video = videoRef.current;
      const canvas = canvasRef.current;
      const ctx = canvas.getContext('2d');
      
      if (!ctx) return;
      
      // Set canvas size to match video
      canvas.width = video.videoWidth;
      canvas.height = video.videoHeight;
      
      // Draw current frame to canvas
      ctx.drawImage(video, 0, 0, canvas.width, canvas.height);
      
      // Convert canvas to base64
      const base64Image = canvas.toDataURL('image/jpeg', 0.8);
      
      // Call native object detection
      const result = await CameraDetector.detectObjects({ image: base64Image });
      
      setDetections(result.detections);
      
      // Calculate FPS
      const endTime = performance.now();
      const frameTime = endTime - lastFrameTimeRef.current;
      lastFrameTimeRef.current = endTime;
      
      if (frameTime > 0) {
        setFps(Math.round(1000 / frameTime));
      }
      
    } catch (err) {
      console.error('Detection error:', err);
    } finally {
      setIsDetecting(false);
    }
  };

  const stopCamera = () => {
    if (stream) {
      stream.getTracks().forEach(track => track.stop());
    }
    if (detectionIntervalRef.current) {
      clearInterval(detectionIntervalRef.current);
    }
  };

  const getColorForConfidence = (confidence: number) => {
    if (confidence >= 0.8) return '#10b981'; // green
    if (confidence >= 0.6) return '#f59e0b'; // orange
    return '#ef4444'; // red
  };

  return (
    <div className="h-full flex flex-col bg-gradient-to-br from-slate-950 via-slate-900 to-slate-950">
      {/* Header */}
      <div className="p-4 border-b border-emerald-500/20 bg-slate-900/50 backdrop-blur-sm">
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
            <Scan className="w-6 h-6 text-emerald-400" />
          </div>
          <div>
            <h2 className="text-xl font-bold text-white">Object Detector</h2>
            <p className="text-sm text-slate-400">AI-powered camera detection</p>
          </div>
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
          />
          
          {/* Hidden canvas for frame capture */}
          <canvas ref={canvasRef} className="hidden" />
          
          {/* Detection Overlay */}
          {isActive && Capacitor.isNativePlatform() && (
            <>
              <div className="absolute top-4 left-4 bg-emerald-500 text-white px-3 py-1 rounded-full text-sm flex items-center gap-2">
                <div className="w-2 h-2 bg-white rounded-full animate-pulse" />
                AI Detecting ({detections.length})
              </div>
              
              {fps > 0 && (
                <div className="absolute top-4 right-4 bg-slate-900/80 text-white px-3 py-1 rounded-full text-sm">
                  {fps} FPS
                </div>
              )}
            </>
          )}

          {!isActive && !error && (
            <div className="absolute inset-0 flex items-center justify-center bg-slate-900/50">
              <div className="text-center">
                <Camera className="w-12 h-12 text-slate-400 mx-auto mb-2 animate-pulse" />
                <p className="text-slate-400">Initializing AI model...</p>
              </div>
            </div>
          )}
        </div>

        {/* Detections List */}
        {detections.length > 0 && (
          <Card className="bg-slate-800/50 border-emerald-500/20 p-4">
            <h3 className="text-white font-semibold mb-3 flex items-center gap-2">
              <Scan className="w-5 h-5 text-emerald-400" />
              Detected Objects ({detections.length})
            </h3>
            <div className="space-y-2">
              {detections.map((detection) => (
                <div
                  key={detection.id}
                  className="flex items-center justify-between p-3 rounded-lg bg-slate-900/50 border border-slate-700"
                >
                  <div className="flex items-center gap-3">
                    <div
                      className="w-3 h-3 rounded-full"
                      style={{ backgroundColor: getColorForConfidence(detection.confidence) }}
                    />
                    <div>
                      <p className="text-white font-medium">{detection.title || 'Unknown'}</p>
                      <p className="text-slate-400 text-xs">
                        Position: ({Math.round(detection.location.left)}, {Math.round(detection.location.top)})
                      </p>
                    </div>
                  </div>
                  <Badge
                    className="bg-emerald-500/20 text-emerald-400"
                    style={{
                      backgroundColor: `${getColorForConfidence(detection.confidence)}20`,
                      color: getColorForConfidence(detection.confidence)
                    }}
                  >
                    {(detection.confidence * 100).toFixed(1)}%
                  </Badge>
                </div>
              ))}
            </div>
          </Card>
        )}

        {/* Status */}
        {Capacitor.isNativePlatform() && isActive && detections.length === 0 && (
          <Card className="bg-blue-500/20 border-blue-500 p-4">
            <p className="text-blue-200 text-sm">
              🔍 <strong>Scanning...</strong> Point camera at objects to detect cameras, phones, laptops, and other electronics.
            </p>
          </Card>
        )}

        {/* Feature Notice */}
        {!Capacitor.isNativePlatform() && (
          <Card className="bg-amber-500/20 border-amber-500 p-4">
            <h3 className="text-amber-400 font-semibold mb-2">AI Object Detection</h3>
            <p className="text-amber-200 text-sm mb-3">
              This feature uses TensorFlow Lite AI model to detect cameras and electronic devices in real-time.
            </p>
            <p className="text-amber-300 text-xs">
              <strong>Note:</strong> Full AI detection requires the Android app. 
              The model identifies cameras, phones, and other electronics with confidence scores.
            </p>
          </Card>
        )}

        {/* Instructions */}
        <Card className="bg-slate-800/50 border-emerald-500/20 p-4">
          <h3 className="text-white font-semibold mb-3 flex items-center gap-2">
            <Scan className="w-5 h-5 text-emerald-400" />
            How to Use
          </h3>
          <ul className="text-slate-300 space-y-2 text-sm">
            <li>• Point camera at suspicious areas</li>
            <li>• AI will identify cameras and electronics</li>
            <li>• Detections appear in real-time below camera</li>
            <li>• Confidence scores show detection accuracy</li>
            <li>• Move slowly for better detection</li>
            <li>• Good lighting improves accuracy</li>
          </ul>
        </Card>
      </div>
    </div>
  );
}
