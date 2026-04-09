'use client';

import React, { useState, useEffect, useCallback, useRef } from 'react';
import { X, Wifi, RefreshCw } from 'lucide-react';
import { isCapacitor, getARMapper } from '@/lib/native-plugins';

// Safe translation helper - ARNetworkMapper doesn't use translations currently
// but adding this for consistency and future use
const safeTranslate = (t: any, key: string, fallback: string): string => {
  try {
    if (!t || typeof t !== 'function') return fallback;
    const result = t(key);
    return result && result !== key ? result : fallback;
  } catch (error) {
    return fallback;
  }
};

// =============================================================
// CameraPreview - access Capacitor plugin directly
// =============================================================
function getCameraPreview(): any {
  if (!isCapacitor) return null;
  try {
    const Capacitor = (window as any).Capacitor;
    return Capacitor?.Plugins?.CameraPreview || null;
  } catch {
    return null;
  }
}

// =============================================================
// WiFiManager - get CONNECTED WiFi signal (uses existing WiFiScanner plugin)
// =============================================================
function getWiFiScanner(): any {
  if (!isCapacitor) return null;
  try {
    const Capacitor = (window as any).Capacitor;
    return Capacitor?.Plugins?.WiFiScanner || null;
  } catch {
    return null;
  }
}

// =============================================================
// Signal quality from dBm
// =============================================================
function getSignalData(dbm: number) {
  if (dbm >= -50) return {
    quality: 'Excellent',
    percent: Math.min(100, (dbm + 100) * 2),
    color: '#22d3ee',       // cyan
    tintColor: 'rgba(34, 211, 238, 0.08)',
    glowColor: 'rgba(34, 211, 238, 0.3)',
    barColor: '#22d3ee',
  };
  if (dbm >= -60) return {
    quality: 'Very Good',
    percent: Math.min(85, (dbm + 100) * 1.8),
    color: '#10b981',       // green
    tintColor: 'rgba(16, 185, 129, 0.08)',
    glowColor: 'rgba(16, 185, 129, 0.3)',
    barColor: '#10b981',
  };
  if (dbm >= -70) return {
    quality: 'Good',
    percent: Math.min(65, (dbm + 100) * 1.5),
    color: '#a3e635',       // lime
    tintColor: 'rgba(163, 230, 53, 0.06)',
    glowColor: 'rgba(163, 230, 53, 0.25)',
    barColor: '#a3e635',
  };
  if (dbm >= -80) return {
    quality: 'Fair',
    percent: Math.min(40, (dbm + 100) * 1.2),
    color: '#f59e0b',       // amber
    tintColor: 'rgba(245, 158, 11, 0.08)',
    glowColor: 'rgba(245, 158, 11, 0.3)',
    barColor: '#f59e0b',
  };
  return {
    quality: 'Weak',
    percent: Math.max(5, (dbm + 100)),
    color: '#ef4444',       // red
    tintColor: 'rgba(239, 68, 68, 0.1)',
    glowColor: 'rgba(239, 68, 68, 0.35)',
    barColor: '#ef4444',
  };
}

// =============================================================
// MOCK DATA for browser dev mode
// =============================================================
function getMockSignal() {
  const base = -55;
  const fluctuation = Math.round((Math.random() - 0.5) * 20);
  return {
    ssid: 'TP-Link_5GHz_Home',
    dbm: Math.max(-90, Math.min(-25, base + fluctuation)),
    frequency: 5180,
    channel: 36,
    band: '5 GHz',
    security: 'WPA3',
    ip: '192.168.0.105',
    bssid: 'A4:B1:C2:D3:E4:F5',
  };
}

// =============================================================
// MAIN COMPONENT
// =============================================================
interface Props {
  onClose: () => void;
}

export default function ARNetworkMapper({ onClose }: Props) {
  // Signal data state
  const [ssid, setSsid] = useState('');
  const [dbm, setDbm] = useState(-100);
  const [frequency, setFrequency] = useState(0);
  const [channel, setChannel] = useState(0);
  const [band, setBand] = useState('');
  const [security, setSecurity] = useState('');
  const [isConnected, setIsConnected] = useState(false);
  const [cameraReady, setCameraReady] = useState(false);
  const [lastUpdate, setLastUpdate] = useState(Date.now());

  // Signal history for mini chart
  const [signalHistory, setSignalHistory] = useState<number[]>([]);

  // Refs
  const scanIntervalRef = useRef<ReturnType<typeof setInterval> | null>(null);
  const cameraPreviewRef = useRef<any>(null);
  const wifiScannerRef = useRef<any>(null);

  // ==========================================================
  // START CAMERA
  // ==========================================================
  const startCamera = useCallback(async () => {
    const cam = getCameraPreview();
    cameraPreviewRef.current = cam;

    if (!cam) {
      // Browser dev mode - no camera
      setCameraReady(false);
      return;
    }

    try {
      await cam.start({
        parent: 'arCameraContainer',
        position: 'rear',
        toBack: true,
        width: window.innerWidth,
        height: window.innerHeight,
        enableZoom: false,
        disableAudio: true,
      });
      setCameraReady(true);
    } catch (err: any) {
      console.error('Camera failed:', err);
      setCameraReady(false);
    }
  }, []);

  // ==========================================================
  // STOP CAMERA
  // ==========================================================
  const stopCamera = useCallback(async () => {
    if (cameraPreviewRef.current) {
      try {
        await cameraPreviewRef.current.stop();
      } catch (e) {
        // ignore
      }
      cameraPreviewRef.current = null;
    }
    setCameraReady(false);
  }, []);

  // ==========================================================
  // FETCH CONNECTED WiFi SIGNAL
  // ==========================================================
  const fetchSignal = useCallback(async () => {
    const scanner = wifiScannerRef.current || getWiFiScanner();
    wifiScannerRef.current = scanner;

    if (scanner) {
      // REAL DEVICE: Get connected WiFi info from native plugin
      try {
        // Try getConnectedWifi first (if exists)
        let connected: any = null;
        if (typeof scanner.getConnectedNetwork === 'function') {
          connected = await scanner.getConnectedNetwork();
        } else if (typeof scanner.getConnectionInfo === 'function') {
          connected = await scanner.getConnectionInfo();
        } else if (typeof scanner.getCurrentWifi === 'function') {
          connected = await scanner.getCurrentWifi();
        } else if (typeof scanner.getCurrentNetwork === 'function') {
          connected = await scanner.getCurrentNetwork();
        } else if (typeof scanner.scanNetworks === 'function') {
          // Fallback: scan all and find the connected one
          const result = await scanner.scanNetworks();
          const networks = result?.networks || result?.results || [];
          // The connected network usually has highest signal or a connected flag
          if (networks.length > 0) {
            const conn = networks.find((n: any) => n.connected || n.isConnected) || networks[0];
            connected = conn;
          }
        }

        if (connected) {
          setSsid(connected.ssid || connected.SSID || 'Unknown');
          setDbm(connected.level || connected.dbm || connected.rssi || connected.signalLevel || -70);
          setFrequency(connected.frequency || 0);
          setChannel(connected.channel || 0);
          setBand(connected.band || (connected.frequency > 4900 ? '5 GHz' : '2.4 GHz'));
          setSecurity(connected.security || connected.capabilities || '');
          setIsConnected(true);
          setLastUpdate(Date.now());

          // Add to history
          const newDbm = connected.level || connected.dbm || connected.rssi || connected.signalLevel || -70;
          setSignalHistory(prev => {
            const updated = [...prev, newDbm];
            return updated.slice(-40); // Keep last 40 readings
          });
        }
      } catch (err) {
        console.error('WiFi scan error:', err);
      }
    } else {
      // BROWSER DEV MODE: Mock data
      const mock = getMockSignal();
      setSsid(mock.ssid);
      setDbm(mock.dbm);
      setFrequency(mock.frequency);
      setChannel(mock.channel);
      setBand(mock.band);
      setSecurity(mock.security);
      setIsConnected(true);
      setLastUpdate(Date.now());

      setSignalHistory(prev => {
        const updated = [...prev, mock.dbm];
        return updated.slice(-40);
      });
    }
  }, []);

  // ==========================================================
  // LIFECYCLE: Auto-start camera + scanning on mount
  // ==========================================================
  useEffect(() => {
    // === Set page transparent for camera ===
    document.body.style.background = 'transparent';
    document.documentElement.style.background = 'transparent';

    // Start camera
    startCamera();

    // First scan immediately
    fetchSignal();

    // Auto-refresh every 1 second
    scanIntervalRef.current = setInterval(() => {
      fetchSignal();
    }, 1000);

    // Cleanup on unmount
    return () => {
      // === Restore solid background ===
      document.body.style.background = '#0d120d';
      document.documentElement.style.background = '#0d120d';

      if (scanIntervalRef.current) {
        clearInterval(scanIntervalRef.current);
        scanIntervalRef.current = null;
      }
      // Stop camera
      const cam = getCameraPreview();
      if (cam) {
        cam.stop().catch(() => {});
      }
    };
  }, [startCamera, fetchSignal]);

  // ==========================================================
  // CLOSE HANDLER
  // ==========================================================
  const handleClose = useCallback(async () => {
    if (scanIntervalRef.current) {
      clearInterval(scanIntervalRef.current);
      scanIntervalRef.current = null;
    }
    await stopCamera();
    onClose();
  }, [stopCamera, onClose]);

  // ==========================================================
  // SIGNAL DATA
  // ==========================================================
  const signal = getSignalData(dbm);

  // ==========================================================
  // RENDER
  // ==========================================================
  return (
    <div
      id="arCameraContainer"
      className="fixed inset-0 z-[9999] overflow-hidden"
      style={{
        background: cameraReady ? 'transparent' : '#0a0f0a',
      }}
    >
      {/* ========== DARK FALLBACK (when no camera) ========== */}
      {!cameraReady && (
        <div className="absolute inset-0 z-0"
          style={{
            background: 'radial-gradient(ellipse at center, #111 0%, #0a0a0a 100%)',
          }}
        />
      )}

      {/* ========== COLOR TINT OVERLAY on camera ========== */}
      <div
        className="absolute inset-0 z-10 pointer-events-none transition-all duration-700"
        style={{ background: signal.tintColor }}
      />

      {/* ========== SCAN LINE ========== */}
      <div className="absolute left-0 right-0 h-px z-20 pointer-events-none"
        style={{
          background: `linear-gradient(90deg, transparent, ${signal.color}60, transparent)`,
          animation: 'arScanLine 3s linear infinite',
        }}
      />

      {/* ========== CORNER BRACKETS ========== */}
      <div className="absolute top-4 left-4 w-8 h-8 border-t-2 border-l-2 z-30 pointer-events-none" style={{ borderColor: `${signal.color}60` }} />
      <div className="absolute top-4 right-4 w-8 h-8 border-t-2 border-r-2 z-30 pointer-events-none" style={{ borderColor: `${signal.color}60` }} />
      <div className="absolute bottom-4 left-4 w-8 h-8 border-b-2 border-l-2 z-30 pointer-events-none" style={{ borderColor: `${signal.color}60` }} />
      <div className="absolute bottom-4 right-4 w-8 h-8 border-b-2 border-r-2 z-30 pointer-events-none" style={{ borderColor: `${signal.color}60` }} />

      {/* ========== TOP BAR ========== */}
      <div className="absolute top-0 left-0 right-0 z-40 px-4 pt-3 pb-8 flex items-center justify-between"
        style={{ background: 'linear-gradient(180deg, rgba(0,0,0,0.7) 0%, rgba(0,0,0,0.3) 70%, transparent 100%)' }}
      >
        {/* Close button */}
        <button
          onClick={handleClose}
          className="w-9 h-9 rounded-full flex items-center justify-center active:scale-90 transition-transform"
          style={{ background: 'rgba(0,0,0,0.5)', border: '1px solid rgba(255,255,255,0.1)' }}
        >
          <X size={18} className="text-white" />
        </button>

        {/* Title */}
        <div className="flex items-center gap-2">
          <span className="text-[10px] font-bold tracking-[0.2em] uppercase px-2.5 py-1 rounded"
            style={{ background: `${signal.color}20`, color: signal.color, border: `1px solid ${signal.color}40` }}>
            AR SIGNAL
          </span>
          <div className="flex items-center gap-1">
            <div className="w-1.5 h-1.5 rounded-full animate-pulse" style={{ background: signal.color }} />
            <span className="text-[10px] text-white/50">LIVE</span>
          </div>
        </div>

        {/* WiFi name */}
        <div className="flex items-center gap-1.5 px-2.5 py-1 rounded-full"
          style={{ background: 'rgba(0,0,0,0.5)', border: '1px solid rgba(255,255,255,0.1)' }}
        >
          <Wifi size={12} style={{ color: signal.color }} />
          <span className="text-[10px] text-white/80 font-medium max-w-[80px] truncate">
            {ssid || '...'}
          </span>
        </div>
      </div>

      {/* ========== CENTER: BIG dBm DISPLAY ========== */}
      <div className="absolute inset-0 z-30 flex items-center justify-center pointer-events-none">
        <div className="text-center">
          {/* Glow ring behind number */}
          <div className="relative inline-block">
            <div
              className="absolute -inset-12 rounded-full transition-all duration-700"
              style={{
                background: `radial-gradient(circle, ${signal.glowColor} 0%, transparent 70%)`,
              }}
            />

            {/* The dBm number */}
            <div className="relative">
              <span
                className="text-7xl font-black tabular-nums leading-none transition-colors duration-500"
                style={{
                  color: signal.color,
                  textShadow: `0 0 40px ${signal.glowColor}, 0 0 80px ${signal.glowColor}`,
                }}
              >
                {dbm}
              </span>
            </div>
          </div>

          {/* dBm label */}
          <div className="mt-1 text-lg font-medium text-white/40 tracking-wider">
            dBm
          </div>

          {/* Quality badge */}
          <div
            className="mt-3 inline-block px-5 py-1.5 rounded-full text-sm font-bold tracking-wide transition-all duration-500"
            style={{
              background: `${signal.color}20`,
              color: signal.color,
              border: `1px solid ${signal.color}30`,
              boxShadow: `0 0 20px ${signal.color}15`,
            }}
          >
            {signal.quality}
          </div>

          {/* Signal percent */}
          <div className="mt-2 text-sm tabular-nums" style={{ color: `${signal.color}80` }}>
            {Math.round(signal.percent)}%
          </div>
        </div>
      </div>

      {/* ========== BOTTOM PANEL ========== */}
      <div className="absolute bottom-0 left-0 right-0 z-40"
        style={{ background: 'linear-gradient(0deg, rgba(0,0,0,0.85) 0%, rgba(0,0,0,0.6) 60%, rgba(0,0,0,0.2) 85%, transparent 100%)' }}
      >
        {/* Signal strength bar */}
        <div className="px-5 pt-4">
          <div className="flex items-center justify-between mb-1.5">
            <span className="text-[10px] text-white/40 uppercase tracking-wider">Signal Strength</span>
            <span className="text-[10px] tabular-nums font-semibold" style={{ color: signal.color }}>
              {Math.round(signal.percent)}%
            </span>
          </div>
          <div className="h-2 rounded-full overflow-hidden" style={{ background: 'rgba(255,255,255,0.08)' }}>
            <div
              className="h-full rounded-full transition-all duration-700"
              style={{
                width: `${signal.percent}%`,
                background: `linear-gradient(90deg, ${signal.color}90, ${signal.color})`,
                boxShadow: `0 0 10px ${signal.color}50`,
              }}
            />
          </div>
        </div>

        {/* Signal history mini chart */}
        {signalHistory.length > 1 && (
          <div className="px-5 mt-3">
            <div className="flex items-end gap-[2px] h-8 overflow-hidden">
              {signalHistory.map((val, i) => {
                const s = getSignalData(val);
                const h = Math.max(2, ((val + 100) / 70) * 32);
                return (
                  <div
                    key={i}
                    className="flex-1 rounded-t-sm transition-all duration-300 min-w-[2px]"
                    style={{
                      height: h,
                      background: i === signalHistory.length - 1 ? s.color : `${s.color}60`,
                    }}
                  />
                );
              })}
            </div>
          </div>
        )}

        {/* WiFi details row */}
        <div className="flex items-center justify-around px-4 py-3 mt-2 mb-4">
          <div className="text-center">
            <div className="text-[9px] text-white/30 uppercase tracking-wider">dBm</div>
            <div className="text-sm font-bold tabular-nums" style={{ color: signal.color }}>
              {dbm}
            </div>
          </div>
          <div className="w-px h-6" style={{ background: 'rgba(255,255,255,0.1)' }} />
          <div className="text-center">
            <div className="text-[9px] text-white/30 uppercase tracking-wider">Band</div>
            <div className="text-sm font-bold text-white/80">
              {band || '--'}
            </div>
          </div>
          <div className="w-px h-6" style={{ background: 'rgba(255,255,255,0.1)' }} />
          <div className="text-center">
            <div className="text-[9px] text-white/30 uppercase tracking-wider">Channel</div>
            <div className="text-sm font-bold text-white/80">
              {channel || '--'}
            </div>
          </div>
          <div className="w-px h-6" style={{ background: 'rgba(255,255,255,0.1)' }} />
          <div className="text-center">
            <div className="text-[9px] text-white/30 uppercase tracking-wider">Security</div>
            <div className="text-sm font-bold text-white/80">
              {security || '--'}
            </div>
          </div>
        </div>
      </div>

      {/* ========== KEYFRAMES ========== */}
      <style>{`
        @keyframes arScanLine {
          0% { top: 0; }
          100% { top: 100%; }
        }
      `}</style>
    </div>
  );
}
