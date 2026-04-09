'use client';

import React, { useState, useEffect, useCallback } from 'react';
import { 
  Shield, ShieldCheck, ShieldAlert, ShieldX, 
  Wifi, LockKeyhole, Signal, Router, Network, 
  Globe, Lock, LockOpen, Clock, AlertTriangle, CheckCircle,
  XCircle, Loader2, ChevronDown, ChevronUp, Server, Trash2
} from 'lucide-react';
import { 
  getEvilTwin, 
  isCapacitor,
  type EvilTwinScanResult,
  type ThreatIndicator,
  type EvilTwinNetworkInfo,
  type ScanHistoryEntry,
  type DNSShieldStatus,
  type DNSLeakTestResult,
  type PrivateDNSStatus
} from '@/lib/native-plugins';
import { useI18n } from '@/lib/i18n';

// Safe translation helper that provides fallback
const safeTranslate = (t: any, key: string, fallback: string): string => {
  try {
    if (!t || typeof t !== 'function') return fallback;
    const result = t(key);
    return result && result !== key ? result : fallback;
  } catch (error) {
    console.warn(`Translation error for key "${key}":`, error);
    return fallback;
  }
};

// Mock data for development/browser mode
const MOCK_SAFE_RESULT: EvilTwinScanResult = {
  success: true,
  threatScore: 15,
  threatLevel: 'SAFE',
  ssid: 'MyHomeWiFi',
  bssid: 'AA:BB:CC:DD:EE:FF',
  indicators: [],
  scanDurationMs: 2340,
  scanTimestamp: Date.now(),
  wifiAnalysis: {
    duplicateCount: 0,
    duplicates: [],
    securityDowngrade: false,
    signalAnomaly: false
  },
  gatewayCheck: {
    gatewayIP: '192.168.1.1',
    gatewayMAC: '00:11:22:33:44:55',
    macChanged: false,
    possibleARPSpoof: false,
    dhcpServer: '192.168.1.1',
    dhcpChanged: false
  },
  dnsCheck: {
    dnsHijacked: false,
    allSameIP: false,
    tests: [
      { domain: 'www.google.com', resolvedIP: '142.250.185.36', expectedRange: '142.250.x.x', passed: true },
      { domain: 'www.cloudflare.com', resolvedIP: '104.16.132.229', expectedRange: '104.16.x.x', passed: true }
    ]
  }
};

const MOCK_THREAT_RESULT: EvilTwinScanResult = {
  success: true,
  threatScore: 72,
  threatLevel: 'HIGH_RISK',
  ssid: 'Starbucks_WiFi',
  bssid: 'XX:YY:ZZ:AA:BB:CC',
  indicators: [
    { type: 'DUPLICATE_SSID', severity: 'HIGH', description: '2 other access point(s) with same name detected' },
    { type: 'GATEWAY_MAC_CHANGED', severity: 'CRITICAL', description: 'Router MAC address changed from 11:22:33:44:55:66 - possible ARP spoofing' },
    { type: 'DNS_HIJACK', severity: 'HIGH', description: 'DNS resolution returning unexpected/private IPs - possible hijacking' }
  ],
  scanDurationMs: 5120,
  scanTimestamp: Date.now(),
  wifiAnalysis: {
    duplicateCount: 2,
    duplicates: [
      { bssid: 'AA:BB:CC:11:22:33', signalLevel: -45, security: 'WPA2', frequency: 2437, channel: 6, vendorOUI: 'AA:BB:CC' },
      { bssid: 'DD:EE:FF:44:55:66', signalLevel: -28, security: 'Open', frequency: 2437, channel: 6, vendorOUI: 'DD:EE:FF' }
    ],
    securityDowngrade: true,
    signalAnomaly: true
  },
  gatewayCheck: {
    gatewayIP: '192.168.1.1',
    gatewayMAC: 'FF:EE:DD:CC:BB:AA',
    macChanged: true,
    possibleARPSpoof: true,
    previousMAC: '11:22:33:44:55:66',
    dhcpServer: '192.168.1.1',
    dhcpChanged: false
  }
};

export default function EvilTwinShield() {
  // Safe i18n hook usage with error handling
  let t: any;
  try {
    const i18n = useI18n();
    t = i18n?.t || ((key: string) => key);
  } catch (error) {
    console.warn('i18n not available, using fallback:', error);
    t = (key: string) => key;
  }

  const [scanResult, setScanResult] = useState<EvilTwinScanResult | null>(null);
  const [isScanning, setIsScanning] = useState(false);
  const [scanProgress, setScanProgress] = useState('');
  const [autoMonitorEnabled, setAutoMonitorEnabled] = useState(false);
  const [currentNetwork, setCurrentNetwork] = useState<EvilTwinNetworkInfo | null>(null);
  const [scanHistory, setScanHistory] = useState<ScanHistoryEntry[]>([]);
  const [expandedSections, setExpandedSections] = useState<Record<string, boolean>>({});
  const [isDemoMode, setIsDemoMode] = useState(!isCapacitor);
  
  // DNS Shield state
  const [dnsShieldStatus, setDnsShieldStatus] = useState<DNSShieldStatus | null>(null);
  const [dnsLeakResult, setDnsLeakResult] = useState<DNSLeakTestResult | null>(null);
  const [isTestingDNS, setIsTestingDNS] = useState(false);
  const [selectedProvider, setSelectedProvider] = useState<'cloudflare' | 'google' | 'quad9'>('cloudflare');

  useEffect(() => {
    const initPlugin = async () => {
      if (!isCapacitor) {
        setIsDemoMode(true);
        setCurrentNetwork({
          ssid: 'MyHomeWiFi',
          bssid: 'AA:BB:CC:DD:EE:FF',
          rssi: -45,
          frequency: 2437,
          gatewayIP: '192.168.1.1',
          hasTrustedBaseline: true,
          isKnownEvilTwin: false
        });
        // Mock DNS Shield status
        setDnsShieldStatus({
          shieldStatus: 'INACTIVE',
          appLevelDoHEnabled: false,
          systemPrivateDNS: {
            supported: false,
            enabled: false,
            mode: 'off',
            active: false
          },
          activeProvider: 'Cloudflare',
          cachedEntries: 0,
          autoActivateEnabled: true,
          activationThreshold: 40
        });
        return;
      }

      const plugin = getEvilTwin();
      if (!plugin) return;

      try {
        const { network } = await plugin.getCurrentNetworkInfo();
        setCurrentNetwork(network);

        const { enabled } = await plugin.isAutoMonitorEnabled();
        setAutoMonitorEnabled(enabled);

        const { history } = await plugin.getScanHistory({ limit: 10 });
        setScanHistory(history);
        
        // Fetch DNS Shield status
        const dnsStatus = await plugin.getDNSShieldStatus();
        setDnsShieldStatus(dnsStatus);
        setSelectedProvider(dnsStatus.activeProvider.toLowerCase() as 'cloudflare' | 'google' | 'quad9');

        // Add event listeners
        try {
          const result1 = plugin.addListener('scanComplete', (result) => {
            setScanResult(result);
            setIsScanning(false);
          });
          
          // Handle both Promise and direct return
          if (result1 && typeof result1.then === 'function') {
            result1.catch(() => {});
          }
        } catch (e) {
          console.warn('Failed to add scanComplete listener:', e);
        }

        try {
          const result2 = plugin.addListener('threatDetected', (result) => {
            console.log('Threat detected:', result);
          });
          
          // Handle both Promise and direct return
          if (result2 && typeof result2.then === 'function') {
            result2.catch(() => {});
          }
        } catch (e) {
          console.warn('Failed to add threatDetected listener:', e);
        }
      } catch (error) {
        console.error('Failed to initialize Evil Twin Shield:', error);
      }
    };

    initPlugin();
  }, []);

  const runQuickScan = useCallback(async () => {
    if (isDemoMode) {
      setIsScanning(true);
      setScanProgress('Scanning WiFi environment...');
      setTimeout(() => {
        setScanProgress('Checking gateway security...');
      }, 800);
      setTimeout(() => {
        setScanProgress('Testing DNS integrity...');
      }, 1600);
      setTimeout(() => {
        setScanResult(MOCK_SAFE_RESULT);
        setIsScanning(false);
        setScanProgress('');
      }, 2400);
      return;
    }

    const plugin = getEvilTwin();
    if (!plugin) {
      console.error('Evil Twin plugin not available');
      // Show error to user
      alert('Evil Twin Shield plugin is not available. Please ensure you are running on a native device.');
      return;
    }

    try {
      setIsScanning(true);
      setScanProgress('Running quick scan...');
      const result = await plugin.runQuickScan();
      console.log('Quick scan result:', result);
      setScanResult(result);
      
      // Refresh history
      const { history } = await plugin.getScanHistory({ limit: 10 });
      setScanHistory(history);
    } catch (error) {
      console.error('Quick scan failed:', error);
      alert('Quick scan failed: ' + (error as Error).message);
    } finally {
      setIsScanning(false);
      setScanProgress('');
    }
  }, [isDemoMode]);

  const runFullScan = useCallback(async () => {
    if (isDemoMode) {
      setIsScanning(true);
      setScanProgress('Scanning WiFi environment...');
      setTimeout(() => setScanProgress('Checking gateway security...'), 1000);
      setTimeout(() => setScanProgress('Testing DNS integrity...'), 2000);
      setTimeout(() => setScanProgress('Validating SSL certificates...'), 3500);
      setTimeout(() => setScanProgress('Measuring network latency...'), 5000);
      setTimeout(() => {
        setScanResult(MOCK_SAFE_RESULT);
        setIsScanning(false);
        setScanProgress('');
      }, 6500);
      return;
    }

    const plugin = getEvilTwin();
    if (!plugin) {
      console.error('Evil Twin plugin not available');
      alert('Evil Twin Shield plugin is not available. Please ensure you are running on a native device.');
      return;
    }

    try {
      setIsScanning(true);
      setScanProgress('Running comprehensive scan...');
      const result = await plugin.runFullScan();
      console.log('Full scan result:', result);
      setScanResult(result);
      
      const { history } = await plugin.getScanHistory({ limit: 10 });
      setScanHistory(history);
    } catch (error) {
      console.error('Full scan failed:', error);
      alert('Full scan failed: ' + (error as Error).message);
    } finally {
      setIsScanning(false);
      setScanProgress('');
    }
  }, [isDemoMode]);

  const toggleAutoMonitor = useCallback(async () => {
    if (isDemoMode) {
      setAutoMonitorEnabled(!autoMonitorEnabled);
      return;
    }

    const plugin = getEvilTwin();
    if (!plugin) return;

    try {
      if (autoMonitorEnabled) {
        await plugin.disableAutoMonitor();
        setAutoMonitorEnabled(false);
      } else {
        await plugin.enableAutoMonitor();
        setAutoMonitorEnabled(true);
      }
    } catch (error) {
      console.error('Failed to toggle auto monitor:', error);
    }
  }, [autoMonitorEnabled, isDemoMode]);

  const markAsTrusted = useCallback(async () => {
    if (!scanResult || isDemoMode) return;

    const plugin = getEvilTwin();
    if (!plugin) return;

    try {
      await plugin.markTrusted({ ssid: scanResult.ssid, bssid: scanResult.bssid });
      alert('Network marked as trusted');
    } catch (error) {
      console.error('Failed to mark as trusted:', error);
    }
  }, [scanResult, isDemoMode]);

  const markAsEvilTwin = useCallback(async () => {
    if (!scanResult || isDemoMode) return;

    const plugin = getEvilTwin();
    if (!plugin) return;

    try {
      await plugin.markEvilTwin({ 
        ssid: scanResult.ssid, 
        bssid: scanResult.bssid,
        reason: 'User reported'
      });
      alert('Network marked as evil twin');
    } catch (error) {
      console.error('Failed to mark as evil twin:', error);
    }
  }, [scanResult, isDemoMode]);

  const toggleSection = (section: string) => {
    setExpandedSections(prev => ({ ...prev, [section]: !prev[section] }));
  };

  const getThreatColor = (score: number) => {
    if (score < 20) return 'text-cyan-400';
    if (score < 40) return 'text-amber-400';
    if (score < 60) return 'text-amber-500';
    if (score < 80) return 'text-red-400';
    return 'text-red-600';
  };

  const getThreatBgColor = (score: number) => {
    if (score < 20) return 'bg-cyan-400/10 border-cyan-400/30';
    if (score < 40) return 'bg-amber-400/10 border-amber-400/30';
    if (score < 60) return 'bg-amber-500/10 border-amber-500/30';
    if (score < 80) return 'bg-red-400/10 border-red-400/30';
    return 'bg-red-600/10 border-red-600/30';
  };

  const getThreatIcon = (score: number) => {
    if (score < 20) return <ShieldCheck className="w-16 h-16" />;
    if (score < 40) return <ShieldAlert className="w-16 h-16" />;
    if (score < 60) return <ShieldAlert className="w-16 h-16" />;
    return <ShieldX className="w-16 h-16" />;
  };

  const getThreatLabel = (level: string) => {
    const labels: Record<string, string> = {
      SAFE: 'SECURE',
      LOW_RISK: 'LOW RISK',
      MEDIUM_RISK: 'MEDIUM RISK',
      HIGH_RISK: 'HIGH RISK',
      CRITICAL: 'CRITICAL'
    };
    return labels[level] || level;
  };

  const getSeverityBadge = (severity: string) => {
    const colors: Record<string, string> = {
      CRITICAL: 'bg-red-600 text-white',
      HIGH: 'bg-red-400 text-white',
      MEDIUM: 'bg-amber-400 text-black',
      LOW: 'bg-yellow-400 text-black'
    };
    return colors[severity] || 'bg-gray-400 text-white';
  };

  const getIndicatorIcon = (type: string) => {
    const icons: Record<string, React.ReactNode> = {
      DUPLICATE_SSID: <Wifi className="w-5 h-5" />,
      SECURITY_DOWNGRADE: <LockKeyhole className="w-5 h-5" />,
      SIGNAL_ANOMALY: <Signal className="w-5 h-5" />,
      GATEWAY_MAC_CHANGED: <Router className="w-5 h-5" />,
      ARP_SPOOF: <Network className="w-5 h-5" />,
      DNS_HIJACK: <Globe className="w-5 h-5" />,
      CAPTIVE_PORTAL_REDIRECT: <Globe className="w-5 h-5" />,
      SSL_INTERCEPT: <Lock className="w-5 h-5" />,
      RTT_ANOMALY: <Clock className="w-5 h-5" />
    };
    return icons[type] || <AlertTriangle className="w-5 h-5" />;
  };

  const formatTimestamp = (timestamp: number) => {
    const now = Date.now();
    const diff = now - timestamp;
    const minutes = Math.floor(diff / 60000);
    const hours = Math.floor(minutes / 60);
    const days = Math.floor(hours / 24);

    if (minutes < 1) return 'Just now';
    if (minutes < 60) return `${minutes} minute${minutes > 1 ? 's' : ''} ago`;
    if (hours < 24) return `${hours} hour${hours > 1 ? 's' : ''} ago`;
    return `${days} day${days > 1 ? 's' : ''} ago`;
  };

  // DNS Shield functions
  const toggleDNSShield = useCallback(async () => {
    if (isDemoMode) {
      setDnsShieldStatus(prev => prev ? { ...prev, appLevelDoHEnabled: !prev.appLevelDoHEnabled, shieldStatus: !prev.appLevelDoHEnabled ? 'ACTIVE' : 'INACTIVE' } : null);
      return;
    }

    const plugin = getEvilTwin();
    if (!plugin || !dnsShieldStatus) return;

    try {
      if (dnsShieldStatus.appLevelDoHEnabled) {
        await plugin.disableDNSShield();
      } else {
        await plugin.enableDNSShield();
      }
      const status = await plugin.getDNSShieldStatus();
      setDnsShieldStatus(status);
    } catch (error) {
      console.error('Failed to toggle DNS shield:', error);
    }
  }, [dnsShieldStatus, isDemoMode]);

  const changeDNSProvider = useCallback(async (provider: 'cloudflare' | 'google' | 'quad9') => {
    setSelectedProvider(provider);
    
    if (isDemoMode) {
      setDnsShieldStatus(prev => prev ? { ...prev, activeProvider: provider.charAt(0).toUpperCase() + provider.slice(1) } : null);
      return;
    }

    const plugin = getEvilTwin();
    if (!plugin) return;

    try {
      await plugin.setDNSProvider({ provider });
      const status = await plugin.getDNSShieldStatus();
      setDnsShieldStatus(status);
    } catch (error) {
      console.error('Failed to change DNS provider:', error);
    }
  }, [isDemoMode]);

  const runDNSLeakTest = useCallback(async () => {
    if (isDemoMode) {
      setIsTestingDNS(true);
      setTimeout(() => {
        setDnsLeakResult({
          success: true,
          leakDetected: false,
          systemDNSServers: ['192.168.1.1'],
          dnsServersAreTrusted: false,
          comparisons: [
            { domain: 'google.com', dohIPs: ['142.250.80.46'], systemIPs: ['142.250.80.46'], match: true, systemHijacked: false },
            { domain: 'cloudflare.com', dohIPs: ['104.16.132.229'], systemIPs: ['104.16.132.229'], match: true, systemHijacked: false },
            { domain: 'microsoft.com', dohIPs: ['20.70.246.20'], systemIPs: ['192.168.1.1'], match: false, systemHijacked: true },
            { domain: 'amazon.com', dohIPs: ['54.239.28.85'], systemIPs: ['54.239.28.85'], match: true, systemHijacked: false }
          ],
          resultsConsistent: true,
          summary: 'Using untrusted DNS servers. Consider enabling DNS Shield or system Private DNS.'
        });
        setIsTestingDNS(false);
      }, 3000);
      return;
    }

    const plugin = getEvilTwin();
    if (!plugin) return;

    try {
      setIsTestingDNS(true);
      const result = await plugin.runDNSLeakTest();
      setDnsLeakResult(result);
    } catch (error) {
      console.error('DNS leak test failed:', error);
    } finally {
      setIsTestingDNS(false);
    }
  }, [isDemoMode]);

  const toggleAutoActivate = useCallback(async () => {
    if (!dnsShieldStatus || isDemoMode) {
      setDnsShieldStatus(prev => prev ? { ...prev, autoActivateEnabled: !prev.autoActivateEnabled } : null);
      return;
    }

    const plugin = getEvilTwin();
    if (!plugin) return;

    try {
      await plugin.setAutoActivate({ 
        enabled: !dnsShieldStatus.autoActivateEnabled,
        threshold: dnsShieldStatus.activationThreshold
      });
      const status = await plugin.getDNSShieldStatus();
      setDnsShieldStatus(status);
    } catch (error) {
      console.error('Failed to toggle auto-activate:', error);
    }
  }, [dnsShieldStatus, isDemoMode]);

  const openPrivateDNSSettings = useCallback(async () => {
    if (isDemoMode) {
      alert('This would open Android Private DNS settings');
      return;
    }

    const plugin = getEvilTwin();
    if (!plugin) return;

    try {
      await plugin.openPrivateDNSSettings();
    } catch (error) {
      console.error('Failed to open Private DNS settings:', error);
    }
  }, [isDemoMode]);

  const clearScanHistory = useCallback(async () => {
    if (isDemoMode) {
      setScanHistory([]);
      return;
    }

    const plugin = getEvilTwin();
    if (!plugin) return;

    try {
      const confirmed = confirm('Are you sure you want to delete all scan history? This cannot be undone.');
      if (!confirmed) return;

      await plugin.clearHistory();
      setScanHistory([]);
    } catch (error) {
      console.error('Failed to clear scan history:', error);
      alert('Failed to clear scan history: ' + (error as Error).message);
    }
  }, [isDemoMode]);

  return (
    <div className="min-h-screen bg-[#0d120d] text-white p-4 pb-20">
      {/* Header */}
      <div className="mb-6">
        <div className="flex items-center justify-between mb-4">
          <div className="flex items-center gap-3">
            <Shield className="w-8 h-8 text-cyan-400" />
            <h1 className="text-2xl font-bold">{safeTranslate(t, 'wifiSec.evilTwin', 'Evil Twin Shield')}</h1>
            {isDemoMode && (
              <span className="text-xs bg-amber-500/20 text-amber-400 px-2 py-1 rounded">
                Demo Mode - Using Mock Data
              </span>
            )}
            {!isDemoMode && (
              <span className="text-xs bg-green-500/20 text-green-400 px-2 py-1 rounded">
                Live Mode - Real Analysis
              </span>
            )}
          </div>
        </div>

        {/* Current Network Info */}
        {currentNetwork && (
          <div className="bg-[#111a11] border border-cyan-900/30 rounded-xl p-4 mb-4">
            <div className="flex items-center justify-between">
              <div>
                <p className="text-sm text-gray-400">Connected to</p>
                <p className="text-lg font-semibold">{currentNetwork.ssid}</p>
                <p className="text-xs text-gray-500">{currentNetwork.bssid}</p>
                <p className="text-xs text-gray-500 mt-1">
                  Signal: {currentNetwork.rssi} dBm | {currentNetwork.frequency} MHz
                </p>
              </div>
              <div className="text-right">
                {currentNetwork.hasTrustedBaseline && (
                  <span className="text-xs bg-cyan-400/20 text-cyan-400 px-2 py-1 rounded">
                    Trusted
                  </span>
                )}
                {currentNetwork.isKnownEvilTwin && (
                  <span className="text-xs bg-red-600/20 text-red-400 px-2 py-1 rounded">
                    Known Evil Twin
                  </span>
                )}
              </div>
            </div>
          </div>
        )}

        {/* Auto Monitor Toggle */}
        <div className="bg-[#111a11] border border-cyan-900/30 rounded-xl p-4 flex items-center justify-between">
          <div>
            <p className="font-medium">{safeTranslate(t, 'wifiSec.autoMonitor', 'Auto Monitor')}</p>
            <p className="text-xs text-gray-400">{safeTranslate(t, 'wifiSec.scanAutomatically', 'Scan automatically when network changes')}</p>
          </div>
          <button
            onClick={toggleAutoMonitor}
            className={`relative w-12 h-6 rounded-full transition-colors ${
              autoMonitorEnabled ? 'bg-cyan-600' : 'bg-gray-600'
            }`}
          >
            <div
              className={`absolute top-1 left-1 w-4 h-4 bg-white rounded-full transition-transform ${
                autoMonitorEnabled ? 'translate-x-6' : ''
              }`}
            />
          </button>
        </div>
      </div>

      {/* Threat Score Circle */}
      {scanResult && (
        <div className="flex flex-col items-center mb-8">
          <div
            className={`relative w-48 h-48 rounded-full border-8 flex items-center justify-center ${getThreatBgColor(
              scanResult.threatScore
            )} ${getThreatColor(scanResult.threatScore)} ${
              scanResult.threatScore >= 80 ? 'animate-pulse' : ''
            }`}
            style={{
              borderColor: 'currentColor'
            }}
          >
            <div className="text-center">
              {getThreatIcon(scanResult.threatScore)}
              <p className="text-4xl font-bold mt-2">{scanResult.threatScore}</p>
              <p className="text-sm font-semibold">{getThreatLabel(scanResult.threatLevel)}</p>
            </div>
          </div>
          <p className="text-sm text-gray-400 mt-4">
            Last scanned: {formatTimestamp(scanResult.scanTimestamp)}
          </p>
          <p className="text-xs text-gray-500">
            Scan duration: {(scanResult.scanDurationMs / 1000).toFixed(1)}s
          </p>
        </div>
      )}

      {/* Scan Buttons */}
      <div className="grid grid-cols-2 gap-4 mb-6">
        <button
          onClick={runQuickScan}
          disabled={isScanning}
          className="bg-transparent border-2 border-cyan-600 text-cyan-400 py-3 px-4 rounded-xl font-semibold hover:bg-cyan-600/10 disabled:opacity-50 disabled:cursor-not-allowed transition-colors"
        >
          {isScanning ? (
            <span className="flex items-center justify-center gap-2">
              <Loader2 className="w-5 h-5 animate-spin" />
              Scanning...
            </span>
          ) : (
            'Quick Scan'
          )}
        </button>
        <button
          onClick={runFullScan}
          disabled={isScanning}
          className="bg-cyan-600 text-white py-3 px-4 rounded-xl font-semibold hover:bg-cyan-700 disabled:opacity-50 disabled:cursor-not-allowed transition-colors"
        >
          {isScanning ? (
            <span className="flex items-center justify-center gap-2">
              <Loader2 className="w-5 h-5 animate-spin" />
              Scanning...
            </span>
          ) : (
            'Full Scan'
          )}
        </button>
      </div>

      {isScanning && scanProgress && (
        <div className="bg-[#111a11] border border-cyan-900/30 rounded-xl p-4 mb-6 text-center">
          <p className="text-sm text-cyan-400">{scanProgress}</p>
        </div>
      )}

      {/* Threat Indicators */}
      {scanResult && scanResult.indicators.length > 0 && (
        <div className="mb-6">
          <h2 className="text-lg font-semibold mb-3 flex items-center gap-2">
            <AlertTriangle className="w-5 h-5 text-red-400" />
            Threat Indicators
          </h2>
          <div className="space-y-3">
            {scanResult.indicators.map((indicator, index) => (
              <div
                key={index}
                className="bg-[#111a11] border border-red-900/30 rounded-xl p-4"
              >
                <div className="flex items-start gap-3">
                  <div className="text-red-400">{getIndicatorIcon(indicator.type)}</div>
                  <div className="flex-1">
                    <div className="flex items-center gap-2 mb-1">
                      <span
                        className={`text-xs px-2 py-1 rounded font-semibold ${getSeverityBadge(
                          indicator.severity
                        )}`}
                      >
                        {indicator.severity}
                      </span>
                      <span className="text-sm font-medium">{indicator.type.replace(/_/g, ' ')}</span>
                    </div>
                    <p className="text-sm text-gray-400">{indicator.description}</p>
                  </div>
                </div>
              </div>
            ))}
          </div>
        </div>
      )}

      {scanResult && scanResult.indicators.length === 0 && (
        <div className="bg-cyan-400/10 border border-cyan-400/30 rounded-xl p-4 mb-6">
          <div className="flex items-center gap-3">
            <CheckCircle className="w-6 h-6 text-cyan-400" />
            <div>
              <p className="font-semibold text-cyan-400">No threats detected</p>
              <p className="text-sm text-gray-400">This network appears safe</p>
            </div>
          </div>
        </div>
      )}

      {/* DNS Shield Section */}
      {dnsShieldStatus && (
        <div className="bg-[#111a11] border border-cyan-900/30 rounded-xl p-4 mb-6">
          <div className="flex items-center justify-between mb-4">
            <div className="flex items-center gap-3">
              <Shield className="w-5 h-5 text-cyan-400" />
              <h2 className="text-lg font-semibold">DNS Shield</h2>
            </div>
            <button
              onClick={toggleDNSShield}
              className={`relative w-12 h-6 rounded-full transition-colors ${
                dnsShieldStatus.appLevelDoHEnabled ? 'bg-cyan-600' : 'bg-gray-600'
              }`}
            >
              <div
                className={`absolute top-1 left-1 w-4 h-4 bg-white rounded-full transition-transform ${
                  dnsShieldStatus.appLevelDoHEnabled ? 'translate-x-6' : ''
                }`}
              />
            </button>
          </div>

          {/* Status Bar */}
          <div className={`rounded-lg p-3 mb-4 ${
            dnsShieldStatus.shieldStatus === 'ACTIVE' ? 'bg-cyan-400/10 border border-cyan-400/30' :
            dnsShieldStatus.shieldStatus === 'SYSTEM_PROTECTED' ? 'bg-green-400/10 border border-green-400/30' :
            'bg-gray-600/10 border border-gray-600/30'
          }`}>
            <div className="flex items-center gap-2">
              {dnsShieldStatus.shieldStatus === 'ACTIVE' && <Lock className="w-5 h-5 text-cyan-400" />}
              {dnsShieldStatus.shieldStatus === 'SYSTEM_PROTECTED' && <ShieldCheck className="w-5 h-5 text-green-400" />}
              {dnsShieldStatus.shieldStatus === 'INACTIVE' && <LockOpen className="w-5 h-5 text-gray-400" />}
              <span className="text-sm font-medium">
                {dnsShieldStatus.shieldStatus === 'ACTIVE' && `Shield: ACTIVE - ${dnsShieldStatus.activeProvider} DoH`}
                {dnsShieldStatus.shieldStatus === 'SYSTEM_PROTECTED' && 'System Protected - Private DNS ON'}
                {dnsShieldStatus.shieldStatus === 'INACTIVE' && 'Shield: INACTIVE - DNS unprotected'}
              </span>
            </div>
          </div>

          {/* Protection Layers */}
          <div className="grid grid-cols-2 gap-3 mb-4">
            <div className="bg-[#0d1a0d] rounded-lg p-3">
              <p className="text-xs text-gray-400 mb-1">App-Level DoH</p>
              <p className={`text-sm font-semibold ${dnsShieldStatus.appLevelDoHEnabled ? 'text-cyan-400' : 'text-gray-500'}`}>
                {dnsShieldStatus.appLevelDoHEnabled ? 'ON' : 'OFF'}
              </p>
              {dnsShieldStatus.appLevelDoHEnabled && (
                <p className="text-xs text-gray-500 mt-1">
                  {dnsShieldStatus.activeProvider} {
                    dnsShieldStatus.activeProvider === 'Cloudflare' ? '1.1.1.1' :
                    dnsShieldStatus.activeProvider === 'Google' ? '8.8.8.8' : '9.9.9.9'
                  }
                </p>
              )}
            </div>
            <div className="bg-[#0d1a0d] rounded-lg p-3">
              <p className="text-xs text-gray-400 mb-1">System Private DNS</p>
              <p className={`text-sm font-semibold ${dnsShieldStatus.systemPrivateDNS.enabled ? 'text-green-400' : 'text-gray-500'}`}>
                {dnsShieldStatus.systemPrivateDNS.enabled ? 'Enabled' : 'Disabled'}
              </p>
              {dnsShieldStatus.systemPrivateDNS.enabled && (
                <p className="text-xs text-gray-500 mt-1">
                  Mode: {dnsShieldStatus.systemPrivateDNS.mode}
                </p>
              )}
            </div>
          </div>

          {/* Provider Selection */}
          <div className="mb-4">
            <p className="text-sm text-gray-400 mb-2">Provider Selection:</p>
            <div className="grid grid-cols-3 gap-2">
              <button
                onClick={() => changeDNSProvider('cloudflare')}
                className={`p-2 rounded-lg text-xs transition-colors ${
                  selectedProvider === 'cloudflare'
                    ? 'bg-cyan-900/50 border-2 border-cyan-400 text-cyan-400'
                    : 'bg-gray-800 border-2 border-gray-700 text-gray-400'
                }`}
              >
                <div className="font-semibold">Cloudflare</div>
                <div className="text-[10px]">1.1.1.1</div>
                <div className="text-[9px] mt-1">Fastest</div>
              </button>
              <button
                onClick={() => changeDNSProvider('google')}
                className={`p-2 rounded-lg text-xs transition-colors ${
                  selectedProvider === 'google'
                    ? 'bg-cyan-900/50 border-2 border-cyan-400 text-cyan-400'
                    : 'bg-gray-800 border-2 border-gray-700 text-gray-400'
                }`}
              >
                <div className="font-semibold">Google</div>
                <div className="text-[10px]">8.8.8.8</div>
                <div className="text-[9px] mt-1">Reliable</div>
              </button>
              <button
                onClick={() => changeDNSProvider('quad9')}
                className={`p-2 rounded-lg text-xs transition-colors ${
                  selectedProvider === 'quad9'
                    ? 'bg-cyan-900/50 border-2 border-cyan-400 text-cyan-400'
                    : 'bg-gray-800 border-2 border-gray-700 text-gray-400'
                }`}
              >
                <div className="font-semibold">Quad9</div>
                <div className="text-[10px]">9.9.9.9</div>
                <div className="text-[9px] mt-1">{t('wifiSec.security')}</div>
              </button>
            </div>
          </div>

          {/* Auto-Activate */}
          <div className="bg-[#0d1a0d] rounded-lg p-3 mb-4">
            <div className="flex items-center justify-between mb-2">
              <div>
                <p className="text-sm font-medium">Auto-Activate</p>
                <p className="text-xs text-gray-400">Enable when threat score ≥ {dnsShieldStatus.activationThreshold}</p>
              </div>
              <button
                onClick={toggleAutoActivate}
                className={`relative w-12 h-6 rounded-full transition-colors ${
                  dnsShieldStatus.autoActivateEnabled ? 'bg-cyan-600' : 'bg-gray-600'
                }`}
              >
                <div
                  className={`absolute top-1 left-1 w-4 h-4 bg-white rounded-full transition-transform ${
                    dnsShieldStatus.autoActivateEnabled ? 'translate-x-6' : ''
                  }`}
                />
              </button>
            </div>
          </div>

          {/* DNS Leak Test Button */}
          <button
            onClick={runDNSLeakTest}
            disabled={isTestingDNS}
            className="w-full bg-transparent border-2 border-cyan-600 text-cyan-400 py-2 px-4 rounded-lg font-semibold hover:bg-cyan-600/10 disabled:opacity-50 disabled:cursor-not-allowed transition-colors mb-4"
          >
            {isTestingDNS ? (
              <span className="flex items-center justify-center gap-2">
                <Loader2 className="w-4 h-4 animate-spin" />
                Testing DNS...
              </span>
            ) : (
              'Run DNS Leak Test'
            )}
          </button>

          {/* DNS Leak Test Results */}
          {dnsLeakResult && (
            <div className="bg-[#0d1a0d] rounded-lg p-3 mb-4">
              <h3 className="text-sm font-semibold mb-3">DNS Leak Test Results</h3>
              
              <div className="mb-3">
                <div className="flex items-center justify-between text-xs mb-1">
                  <span className="text-gray-400">System DNS Servers:</span>
                  <span className={`font-mono ${dnsLeakResult.dnsServersAreTrusted ? 'text-green-400' : 'text-red-400'}`}>
                    {dnsLeakResult.systemDNSServers.join(', ')}
                  </span>
                </div>
                <div className="flex items-center justify-between text-xs">
                  <span className="text-gray-400">Trusted:</span>
                  <span className={`px-2 py-0.5 rounded text-[10px] font-semibold ${
                    dnsLeakResult.dnsServersAreTrusted 
                      ? 'bg-green-400/20 text-green-400' 
                      : 'bg-red-400/20 text-red-400'
                  }`}>
                    {dnsLeakResult.dnsServersAreTrusted ? 'YES' : 'NO'}
                  </span>
                </div>
              </div>

              <div className="space-y-2 mb-3">
                {dnsLeakResult.comparisons.map((comp, idx) => (
                  <div key={idx} className="bg-[#111a11] rounded p-2">
                    <div className="flex items-center justify-between mb-1">
                      <span className="text-xs font-medium">{comp.domain}</span>
                      {comp.match ? (
                        <CheckCircle className="w-4 h-4 text-green-400" />
                      ) : (
                        <XCircle className="w-4 h-4 text-red-400" />
                      )}
                    </div>
                    <div className="text-[10px] text-gray-500 space-y-0.5">
                      <div>DoH: {comp.dohIPs.join(', ')}</div>
                      <div className={comp.systemHijacked ? 'text-red-400' : ''}>
                        System: {comp.systemIPs.join(', ')}
                        {comp.systemHijacked && ' ⚠️ HIJACKED'}
                      </div>
                    </div>
                  </div>
                ))}
              </div>

              <div className={`rounded p-2 text-xs ${
                dnsLeakResult.leakDetected 
                  ? 'bg-red-400/10 border border-red-400/30 text-red-400' 
                  : 'bg-green-400/10 border border-green-400/30 text-green-400'
              }`}>
                <p className="font-semibold mb-1">
                  {dnsLeakResult.leakDetected ? '⚠️ LEAK DETECTED' : '✓ NO LEAKS FOUND'}
                </p>
                <p className="text-[10px]">{dnsLeakResult.summary}</p>
              </div>
            </div>
          )}

          {/* System Private DNS Info */}
          {dnsShieldStatus.systemPrivateDNS.supported && (
            <div className="bg-[#0d1a0d] rounded-lg p-3">
              <p className="text-xs text-gray-400 mb-2">
                Your device's Private DNS is {dnsShieldStatus.systemPrivateDNS.enabled ? 'ON' : 'OFF'}.
              </p>
              <button
                onClick={openPrivateDNSSettings}
                className="w-full bg-gray-700 hover:bg-gray-600 text-white text-xs py-2 px-3 rounded transition-colors mb-2"
              >
                Open DNS Settings
              </button>
              {!dnsShieldStatus.systemPrivateDNS.enabled && (
                <p className="text-[10px] text-amber-400">
                  Recommended: Enable Private DNS with "1dot1dot1dot1.cloudflare-dns.com"
                </p>
              )}
            </div>
          )}
        </div>
      )}

      {/* Detailed Results */}
      {scanResult && (
        <div className="space-y-4 mb-6">
          {/* WiFi Environment */}
          {scanResult.wifiAnalysis && (
            <div className="bg-[#111a11] border border-cyan-900/30 rounded-xl overflow-hidden">
              <button
                onClick={() => toggleSection('wifi')}
                className="w-full p-4 flex items-center justify-between hover:bg-[#0d1a0d] transition-colors"
              >
                <div className="flex items-center gap-3">
                  <Wifi className="w-5 h-5 text-cyan-400" />
                  <span className="font-semibold">WiFi Environment</span>
                </div>
                {expandedSections.wifi ? (
                  <ChevronUp className="w-5 h-5" />
                ) : (
                  <ChevronDown className="w-5 h-5" />
                )}
              </button>
              {expandedSections.wifi && (
                <div className="p-4 pt-0 border-t border-cyan-900/30">
                  <p className="text-sm text-gray-400 mb-3">
                    Found {scanResult.wifiAnalysis.duplicateCount} nearby AP(s) with same SSID
                  </p>
                  {scanResult.wifiAnalysis.duplicates.map((dup, index) => (
                    <div key={index} className="bg-[#0d1a0d] rounded-lg p-3 mb-2">
                      <div className="flex justify-between items-start">
                        <div>
                          <p className="text-sm font-mono">{dup.bssid}</p>
                          <p className="text-xs text-gray-500">
                            {dup.security} | Channel {dup.channel} | {dup.signalLevel} dBm
                          </p>
                          <p className="text-xs text-gray-500">Vendor: {dup.vendorOUI}</p>
                        </div>
                        <span
                          className={`text-xs px-2 py-1 rounded ${
                            dup.signalLevel > -30
                              ? 'bg-red-400/20 text-red-400'
                              : 'bg-gray-600/20 text-gray-400'
                          }`}
                        >
                          {dup.signalLevel > -30 ? 'Abnormal' : 'Normal'}
                        </span>
                      </div>
                    </div>
                  ))}
                </div>
              )}
            </div>
          )}

          {/* Gateway Security */}
          {scanResult.gatewayCheck && (
            <div className="bg-[#111a11] border border-cyan-900/30 rounded-xl overflow-hidden">
              <button
                onClick={() => toggleSection('gateway')}
                className="w-full p-4 flex items-center justify-between hover:bg-[#0d1a0d] transition-colors"
              >
                <div className="flex items-center gap-3">
                  <Router className="w-5 h-5 text-cyan-400" />
                  <span className="font-semibold">Gateway Security</span>
                </div>
                {expandedSections.gateway ? (
                  <ChevronUp className="w-5 h-5" />
                ) : (
                  <ChevronDown className="w-5 h-5" />
                )}
              </button>
              {expandedSections.gateway && (
                <div className="p-4 pt-0 border-t border-cyan-900/30 space-y-2">
                  <div className="flex justify-between text-sm">
                    <span className="text-gray-400">Gateway IP:</span>
                    <span className="font-mono">{scanResult.gatewayCheck.gatewayIP}</span>
                  </div>
                  <div className="flex justify-between text-sm">
                    <span className="text-gray-400">Gateway MAC:</span>
                    <span className="font-mono">{scanResult.gatewayCheck.gatewayMAC}</span>
                  </div>
                  {scanResult.gatewayCheck.previousMAC && (
                    <div className="flex justify-between text-sm">
                      <span className="text-gray-400">Previous MAC:</span>
                      <span className="font-mono text-red-400">
                        {scanResult.gatewayCheck.previousMAC}
                      </span>
                    </div>
                  )}
                  <div className="flex justify-between text-sm">
                    <span className="text-gray-400">DHCP Server:</span>
                    <span className="font-mono">{scanResult.gatewayCheck.dhcpServer}</span>
                  </div>
                  <div className="flex justify-between text-sm">
                    <span className="text-gray-400">MAC Changed:</span>
                    <span
                      className={
                        scanResult.gatewayCheck.macChanged ? 'text-red-400' : 'text-cyan-400'
                      }
                    >
                      {scanResult.gatewayCheck.macChanged ? 'Yes' : 'No'}
                    </span>
                  </div>
                  <div className="flex justify-between text-sm">
                    <span className="text-gray-400">ARP Spoof Detected:</span>
                    <span
                      className={
                        scanResult.gatewayCheck.possibleARPSpoof ? 'text-red-400' : 'text-cyan-400'
                      }
                    >
                      {scanResult.gatewayCheck.possibleARPSpoof ? 'Yes' : 'No'}
                    </span>
                  </div>
                </div>
              )}
            </div>
          )}

          {/* DNS Integrity */}
          {scanResult.dnsCheck && (
            <div className="bg-[#111a11] border border-cyan-900/30 rounded-xl overflow-hidden">
              <button
                onClick={() => toggleSection('dns')}
                className="w-full p-4 flex items-center justify-between hover:bg-[#0d1a0d] transition-colors"
              >
                <div className="flex items-center gap-3">
                  <Globe className="w-5 h-5 text-cyan-400" />
                  <span className="font-semibold">DNS Integrity</span>
                </div>
                {expandedSections.dns ? (
                  <ChevronUp className="w-5 h-5" />
                ) : (
                  <ChevronDown className="w-5 h-5" />
                )}
              </button>
              {expandedSections.dns && (
                <div className="p-4 pt-0 border-t border-cyan-900/30">
                  {scanResult.dnsCheck.tests.map((test, index) => (
                    <div key={index} className="bg-[#0d1a0d] rounded-lg p-3 mb-2">
                      <div className="flex items-start justify-between">
                        <div className="flex-1">
                          <p className="text-sm font-medium">{test.domain}</p>
                          <p className="text-xs text-gray-500 font-mono">{test.resolvedIP}</p>
                          <p className="text-xs text-gray-500">Expected: {test.expectedRange}</p>
                        </div>
                        {test.passed ? (
                          <CheckCircle className="w-5 h-5 text-cyan-400" />
                        ) : (
                          <XCircle className="w-5 h-5 text-red-400" />
                        )}
                      </div>
                    </div>
                  ))}
                </div>
              )}
            </div>
          )}

          {/* SSL/TLS Security */}
          {scanResult.sslCheck && (
            <div className="bg-[#111a11] border border-cyan-900/30 rounded-xl overflow-hidden">
              <button
                onClick={() => toggleSection('ssl')}
                className="w-full p-4 flex items-center justify-between hover:bg-[#0d1a0d] transition-colors"
              >
                <div className="flex items-center gap-3">
                  <Lock className="w-5 h-5 text-cyan-400" />
                  <span className="font-semibold">SSL/TLS Security</span>
                </div>
                {expandedSections.ssl ? (
                  <ChevronUp className="w-5 h-5" />
                ) : (
                  <ChevronDown className="w-5 h-5" />
                )}
              </button>
              {expandedSections.ssl && (
                <div className="p-4 pt-0 border-t border-cyan-900/30">
                  {scanResult.sslCheck.tests.map((test, index) => (
                    <div key={index} className="bg-[#0d1a0d] rounded-lg p-3 mb-2">
                      <div className="flex items-start justify-between">
                        <div className="flex-1">
                          <p className="text-sm font-medium">{test.url}</p>
                          <p className="text-xs text-gray-500">{test.issuer}</p>
                          <div className="flex gap-2 mt-1">
                            <span
                              className={`text-xs px-2 py-0.5 rounded ${
                                test.valid
                                  ? 'bg-cyan-400/20 text-cyan-400'
                                  : 'bg-red-400/20 text-red-400'
                              }`}
                            >
                              {test.valid ? 'Valid' : 'Invalid'}
                            </span>
                            <span
                              className={`text-xs px-2 py-0.5 rounded ${
                                test.trusted
                                  ? 'bg-cyan-400/20 text-cyan-400'
                                  : 'bg-red-400/20 text-red-400'
                              }`}
                            >
                              {test.trusted ? 'Trusted' : 'Untrusted'}
                            </span>
                          </div>
                        </div>
                      </div>
                    </div>
                  ))}
                </div>
              )}
            </div>
          )}

          {/* Network Latency */}
          {scanResult.rttCheck && (
            <div className="bg-[#111a11] border border-cyan-900/30 rounded-xl overflow-hidden">
              <button
                onClick={() => toggleSection('rtt')}
                className="w-full p-4 flex items-center justify-between hover:bg-[#0d1a0d] transition-colors"
              >
                <div className="flex items-center gap-3">
                  <Clock className="w-5 h-5 text-cyan-400" />
                  <span className="font-semibold">{safeTranslate(t, 'wifiSec.networkLatency', 'Network Latency')}</span>
                </div>
                {expandedSections.rtt ? (
                  <ChevronUp className="w-5 h-5" />
                ) : (
                  <ChevronDown className="w-5 h-5" />
                )}
              </button>
              {expandedSections.rtt && (
                <div className="p-4 pt-0 border-t border-cyan-900/30">
                  <p className="text-sm text-gray-400 mb-3">
                    Average RTT: {scanResult.rttCheck.averageRTT}ms
                    {scanResult.rttCheck.baselineRTT > 0 && (
                      <span className="text-xs ml-2">
                        (Baseline: {scanResult.rttCheck.baselineRTT}ms)
                      </span>
                    )}
                  </p>
                  {scanResult.rttCheck.tests.map((test, index) => (
                    <div key={index} className="bg-[#0d1a0d] rounded-lg p-3 mb-2">
                      <div className="flex items-center justify-between">
                        <div>
                          <p className="text-sm font-mono">{test.target}</p>
                          <p className="text-xs text-gray-500">
                            {test.reachable ? `${test.rttMs}ms` : 'Unreachable'}
                          </p>
                        </div>
                        <div className="w-32 bg-gray-700 rounded-full h-2">
                          <div
                            className={`h-2 rounded-full ${
                              test.rttMs > 500 ? 'bg-red-400' : 'bg-cyan-400'
                            }`}
                            style={{ width: `${Math.min((test.rttMs / 1000) * 100, 100)}%` }}
                          />
                        </div>
                      </div>
                    </div>
                  ))}
                </div>
              )}
            </div>
          )}
        </div>
      )}

      {/* Actions */}
      {scanResult && (
        <div className="grid grid-cols-2 gap-4 mb-6">
          {scanResult.threatScore < 40 && (
            <button
              onClick={markAsTrusted}
              disabled={isDemoMode}
              className="bg-cyan-600/20 border border-cyan-600 text-cyan-400 py-3 px-4 rounded-xl font-semibold hover:bg-cyan-600/30 disabled:opacity-50 transition-colors"
            >
              Mark as Trusted
            </button>
          )}
          {scanResult.threatScore >= 40 && (
            <button
              onClick={markAsEvilTwin}
              disabled={isDemoMode}
              className="bg-red-600/20 border border-red-600 text-red-400 py-3 px-4 rounded-xl font-semibold hover:bg-red-600/30 disabled:opacity-50 transition-colors"
            >
              Report Evil Twin
            </button>
          )}
        </div>
      )}

      {/* Scan History */}
      {scanHistory.length > 0 && (
        <div className="mb-6">
          <div className="flex items-center justify-between mb-3">
            <h2 className="text-lg font-semibold">{safeTranslate(t, 'wifiSec.scanHistory', 'Scan History')}</h2>
            <button
              onClick={clearScanHistory}
              className="text-gray-500 hover:text-red-400 transition-colors p-2"
              title="Delete scan history"
            >
              <Trash2 className="w-4 h-4" />
            </button>
          </div>
          <div className="space-y-2">
            {scanHistory.map((entry) => (
              <div
                key={entry.id}
                className="bg-[#111a11] border border-cyan-900/30 rounded-xl p-4 flex items-center justify-between"
              >
                <div className="flex-1">
                  <p className="font-medium">{entry.ssid}</p>
                  <p className="text-xs text-gray-500 font-mono">{entry.bssid}</p>
                  <p className="text-xs text-gray-500">{formatTimestamp(entry.timestamp)}</p>
                </div>
                <div className="text-right">
                  <span
                    className={`inline-block px-3 py-1 rounded-full text-sm font-semibold ${getThreatBgColor(
                      entry.threatScore
                    )} ${getThreatColor(entry.threatScore)}`}
                  >
                    {entry.threatScore}
                  </span>
                  <p className="text-xs text-gray-500 mt-1">{entry.threatLevel}</p>
                </div>
              </div>
            ))}
          </div>
        </div>
      )}

      {/* Demo Mode Actions */}
      {isDemoMode && (
        <div className="bg-amber-500/10 border border-amber-500/30 rounded-xl p-4 mb-6">
          <p className="text-sm text-amber-400 mb-3">
            <strong>Demo Mode:</strong> Running in browser. Install on Android device for real scanning.
          </p>
          <button
            onClick={() => setScanResult(MOCK_THREAT_RESULT)}
            className="w-full bg-amber-500/20 border border-amber-500 text-amber-400 py-2 px-4 rounded-lg font-semibold hover:bg-amber-500/30 transition-colors"
          >
            Simulate Threat Detection
          </button>
        </div>
      )}

      {/* No WiFi Warning */}
      {!currentNetwork && !isDemoMode && (
        <div className="bg-red-400/10 border border-red-400/30 rounded-xl p-4 text-center">
          <XCircle className="w-12 h-12 text-red-400 mx-auto mb-2" />
          <p className="font-semibold text-red-400">Not Connected to WiFi</p>
          <p className="text-sm text-gray-400">Connect to a WiFi network to scan for threats</p>
        </div>
      )}
    </div>
  );
}
