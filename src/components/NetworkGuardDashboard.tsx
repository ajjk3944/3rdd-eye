'use client';

import { useState, useEffect } from 'react';
import { useRouter } from 'next/navigation';
import {
  Shield, ShieldAlert, Bell, Activity, ArrowLeft, Settings as SettingsIcon,
  Smartphone, RefreshCw
} from 'lucide-react';
import { Card } from '@/components/ui/card';
import { Button } from '@/components/ui/button';
import { Tabs, TabsContent, TabsList, TabsTrigger } from '@/components/ui/tabs';
import { Badge } from '@/components/ui/badge';
import { getRouterGuard } from '@/lib/native-plugins';
import type {
  KnownDevice,
  DeviceAlert,
  ThreatReport,
  DeviceStats,
  GuardSettings
} from '@/lib/native-plugins';
import DeviceListPanel from './DeviceListPanel';
import ThreatPanel from './ThreatPanel';
import HistoryPanel from './HistoryPanel';
import GuardSettingsPanel from './GuardSettingsPanel';
import RouterSetupDialog from './RouterSetupDialog';

export default function NetworkGuardDashboard({ onBack }: { onBack?: () => void }) {
  const router = useRouter();
  const [isMonitoring, setIsMonitoring] = useState(false);
  const [devices, setDevices] = useState<KnownDevice[]>([]);
  const [onlineDevices, setOnlineDevices] = useState<KnownDevice[]>([]);
  const [alerts, setAlerts] = useState<DeviceAlert[]>([]);
  const [threats, setThreats] = useState<ThreatReport[]>([]);
  const [stats, setStats] = useState<DeviceStats | null>(null);
  const [settings, setSettings] = useState<GuardSettings | null>(null);
  const [activeTab, setActiveTab] = useState<'devices' | 'threats' | 'history' | 'settings'>('devices');
  const [hasRouter, setHasRouter] = useState(false);
  const [loading, setLoading] = useState(true);
  const [lastScanTime, setLastScanTime] = useState<number | null>(null);
  const [showRouterSetup, setShowRouterSetup] = useState(false);
  const [scanInterval, setScanInterval] = useState(30000);

  useEffect(() => {
    const plugin = getRouterGuard();
    if (!plugin) {
      // Set default empty states when plugin is not available
      setStats({
        totalDevices: 0,
        onlineDevices: 0,
        trustedDevices: 0,
        untrustedDevices: 0,
        newDevicesToday: 0,
        unreadAlerts: 0
      });
      setSettings({
        monitoringEnabled: false,
        scanInterval: 30000,
        notifyNewDevice: true,
        notifyReturningDevice: false,
        notifySuspicious: true,
        autoStartOnBoot: false
      });
      setLoading(false);
      return;
    }

    loadInitialData();
    setupEventListeners();

    return () => {
      // Cleanup listeners
    };
  }, []);

  const loadInitialData = async () => {
    const plugin = getRouterGuard();
    if (!plugin) return;

    try {
      const [statsRes, devicesRes, alertsRes, threatsRes, monitoringRes, settingsRes, routerRes] = await Promise.all([
        plugin.getDeviceStats(),
        plugin.getKnownDevices(),
        plugin.getAlerts({ unreadOnly: false, limit: 50 }),
        plugin.getActiveThreats(),
        plugin.isMonitoring(),
        plugin.getGuardSettings(),
        plugin.getActiveRouter()
      ]);

      setStats(statsRes);
      setDevices(devicesRes.devices);
      setOnlineDevices(devicesRes.devices.filter(d => d.isOnline));
      setAlerts(alertsRes.alerts);
      setThreats(threatsRes.threats);
      setIsMonitoring(monitoringRes.monitoring);
      setScanInterval(monitoringRes.interval);
      setLastScanTime(monitoringRes.lastScanTime);
      setSettings(settingsRes);
      setHasRouter(routerRes.router !== null);
    } catch (error) {
      console.error('Error loading data:', error);
    } finally {
      setLoading(false);
    }
  };

  const setupEventListeners = () => {
    const plugin = getRouterGuard();
    if (!plugin) return;

    try {
      const result1 = plugin.addListener('deviceListUpdated', (data) => {
        setOnlineDevices(data.devices.filter(d => d.isOnline));
        setDevices(data.devices);
        loadDeviceStats();
      });
      
      // Handle both Promise and direct return
      if (result1 && typeof result1.then === 'function') {
        result1.catch(() => {});
      }
    } catch (e) {
      console.warn('Failed to add deviceListUpdated listener:', e);
    }

    try {
      const result2 = plugin.addListener('newDeviceDetected', (data) => {
        setAlerts(prev => [data.alert, ...prev]);
        loadDeviceStats();
        loadDevices();
      });
      
      // Handle both Promise and direct return
      if (result2 && typeof result2.then === 'function') {
        result2.catch(() => {});
      }
    } catch (e) {
      console.warn('Failed to add newDeviceDetected listener:', e);
    }

    try {
      const result3 = plugin.addListener('scanCompleted', (data) => {
        setLastScanTime(Date.now());
      });
      
      // Handle both Promise and direct return
      if (result3 && typeof result3.then === 'function') {
        result3.catch(() => {});
      }
    } catch (e) {
      console.warn('Failed to add scanCompleted listener:', e);
    }

    try {
      const result4 = plugin.addListener('threatDetected', (data) => {
        setThreats(prev => [data.report, ...prev]);
      });
      
      // Handle both Promise and direct return
      if (result4 && typeof result4.then === 'function') {
        result4.catch(() => {});
      }
    } catch (e) {
      console.warn('Failed to add threatDetected listener:', e);
    }
  };

  const loadDeviceStats = async () => {
    const plugin = getRouterGuard();
    if (!plugin) return;

    try {
      const statsRes = await plugin.getDeviceStats();
      setStats(statsRes);
    } catch (error) {
      console.error('Error loading stats:', error);
    }
  };

  const loadDevices = async () => {
    const plugin = getRouterGuard();
    if (!plugin) return;

    try {
      const devicesRes = await plugin.getKnownDevices();
      setDevices(devicesRes.devices);
      setOnlineDevices(devicesRes.devices.filter(d => d.isOnline));
    } catch (error) {
      console.error('Error loading devices:', error);
    }
  };

  const handleStartMonitoring = async () => {
    const plugin = getRouterGuard();
    if (!plugin) return;

    try {
      await plugin.startMonitoring({ scanInterval });
      setIsMonitoring(true);
    } catch (error) {
      console.error('Error starting monitoring:', error);
    }
  };

  const handleStopMonitoring = async () => {
    const plugin = getRouterGuard();
    if (!plugin) return;

    try {
      await plugin.stopMonitoring();
      setIsMonitoring(false);
    } catch (error) {
      console.error('Error stopping monitoring:', error);
    }
  };

  const handleRefreshDevices = async () => {
    const plugin = getRouterGuard();
    if (!plugin) return;

    try {
      if (hasRouter) {
        // Try router fetch first
        const result = await plugin.fetchRouterDevices();
        if (!result.success || (result.devices && result.devices.length === 0)) {
          // Fallback to ARP scan if router fetch fails or returns no devices
          console.log('Router fetch failed or empty, trying ARP scan...');
          await plugin.getRouterDevicesQuick();
        }
      } else {
        // No router configured, use ARP scan
        await plugin.getRouterDevicesQuick();
      }
      await loadDevices();
      await loadDeviceStats();
    } catch (error) {
      console.error('Error refreshing devices:', error);
      // Try ARP scan as last resort
      try {
        await plugin.getRouterDevicesQuick();
        await loadDevices();
        await loadDeviceStats();
      } catch (arpError) {
        console.error('ARP scan also failed:', arpError);
      }
    }
  };

  const getThreatLevel = () => {
    if (!threats.length) return { level: 'SAFE', color: 'text-emerald-400', score: 0 };
    
    const maxThreat = Math.max(...threats.map(t => t.overallThreatLevel));
    const avgScore = Math.round(threats.reduce((sum, t) => sum + t.threatScore, 0) / threats.length);
    
    if (maxThreat >= 4) return { level: 'CRITICAL', color: 'text-red-500', score: avgScore };
    if (maxThreat >= 3) return { level: 'HIGH', color: 'text-orange-500', score: avgScore };
    if (maxThreat >= 2) return { level: 'MEDIUM', color: 'text-amber-500', score: avgScore };
    if (maxThreat >= 1) return { level: 'LOW', color: 'text-yellow-500', score: avgScore };
    return { level: 'SAFE', color: 'text-emerald-400', score: avgScore };
  };

  const formatLastScan = () => {
    if (!lastScanTime) return 'Never';
    const seconds = Math.floor((Date.now() - lastScanTime) / 1000);
    if (seconds < 60) return `${seconds} seconds ago`;
    const minutes = Math.floor(seconds / 60);
    if (minutes < 60) return `${minutes} minute${minutes > 1 ? 's' : ''} ago`;
    const hours = Math.floor(minutes / 60);
    return `${hours} hour${hours > 1 ? 's' : ''} ago`;
  };

  const threatLevel = getThreatLevel();
  const unreadAlerts = alerts.filter(a => !a.isRead).length;

  if (loading) {
    return (
      <div className="min-h-screen bg-[#0d120d] flex items-center justify-center">
        <div className="text-center">
          <RefreshCw className="w-8 h-8 text-cyan-400 animate-spin mx-auto mb-4" />
          <p className="text-gray-400">Loading Network Guard...</p>
        </div>
      </div>
    );
  }

  return (
    <div className="min-h-screen bg-[#0d120d] pb-20">
      {/* Header */}
      <div className="sticky top-0 z-50 bg-[#0d120d]/95 backdrop-blur-sm border-b border-cyan-900/30">
        <div className="flex items-center justify-between p-4">
          <Button
            variant="ghost"
            size="sm"
            onClick={() => onBack ? onBack() : router.back()}
            className="text-gray-400 hover:text-white"
          >
            <ArrowLeft className="w-5 h-5 mr-2" />
            Back
          </Button>
          <h1 className="text-xl font-semibold text-white">Network Guard</h1>
          <Button
            variant="ghost"
            size="sm"
            onClick={() => setActiveTab('settings')}
            className="text-gray-400 hover:text-white"
          >
            <SettingsIcon className="w-5 h-5" />
          </Button>
        </div>
      </div>

      <div className="p-4 space-y-4">
        {/* Stats Cards */}
        <div className="grid grid-cols-2 gap-3">
          <Card className="bg-[#0d120d] border-cyan-900/30 p-4">
            <div className="flex items-start justify-between">
              <div>
                <p className="text-gray-400 text-sm">Online Devices</p>
                <p className="text-3xl font-bold text-white mt-1">{stats?.onlineDevices || 0}</p>
                {stats && stats.newDevicesToday > 0 && (
                  <p className="text-cyan-400 text-xs mt-1">+{stats.newDevicesToday} new today</p>
                )}
              </div>
              <Smartphone className="w-8 h-8 text-cyan-400" />
            </div>
          </Card>

          <Card className="bg-[#0d120d] border-emerald-900/30 p-4">
            <div className="flex items-start justify-between">
              <div>
                <p className="text-gray-400 text-sm">Trusted</p>
                <p className="text-3xl font-bold text-white mt-1">{stats?.trustedDevices || 0}</p>
                {stats && stats.untrustedDevices > 0 && (
                  <p className="text-amber-400 text-xs mt-1">{stats.untrustedDevices} untrusted</p>
                )}
              </div>
              <Shield className="w-8 h-8 text-emerald-400" />
            </div>
          </Card>

          <Card className="bg-[#0d120d] border-amber-900/30 p-4">
            <div className="flex items-start justify-between">
              <div>
                <p className="text-gray-400 text-sm">Unread Alerts</p>
                <p className="text-3xl font-bold text-white mt-1">{unreadAlerts}</p>
                <p className="text-gray-400 text-xs mt-1">Tap to view</p>
              </div>
              <Bell className="w-8 h-8 text-amber-400" />
            </div>
          </Card>

          <Card className={`bg-[#0d120d] border-${threatLevel.color.replace('text-', '')}/30 p-4`}>
            <div className="flex items-start justify-between">
              <div>
                <p className="text-gray-400 text-sm">Threat Level</p>
                <p className={`text-2xl font-bold mt-1 ${threatLevel.color}`}>{threatLevel.level}</p>
                <p className="text-gray-400 text-xs mt-1">Score: {threatLevel.score}/100</p>
              </div>
              {threatLevel.level === 'CRITICAL' || threatLevel.level === 'HIGH' ? (
                <ShieldAlert className={`w-8 h-8 ${threatLevel.color} ${threatLevel.level === 'CRITICAL' ? 'animate-pulse' : ''}`} />
              ) : (
                <Activity className={`w-8 h-8 ${threatLevel.color}`} />
              )}
            </div>
          </Card>
        </div>

        {/* Monitoring Control */}
        <Card className="bg-[#0d120d] border-cyan-900/30 p-4">
          <div className="flex items-center gap-3 mb-3">
            <Shield className="w-6 h-6 text-cyan-400" />
            <div className="flex-1">
              <h3 className="text-white font-semibold">Network Guard</h3>
              {isMonitoring && (
                <p className="text-gray-400 text-sm">Last scan: {formatLastScan()}</p>
              )}
            </div>
            {isMonitoring && (
              <div className="flex items-center gap-2">
                <div className="w-2 h-2 bg-emerald-400 rounded-full animate-pulse" />
                <span className="text-emerald-400 text-sm">Active</span>
              </div>
            )}
          </div>

          {isMonitoring ? (
            <Button
              onClick={handleStopMonitoring}
              className="w-full bg-red-600 hover:bg-red-700 text-white"
            >
              Stop Monitoring
            </Button>
          ) : (
            <Button
              onClick={handleStartMonitoring}
              className="w-full bg-emerald-600 hover:bg-emerald-700 text-white"
            >
              Start Monitoring
            </Button>
          )}
        </Card>

        {/* Tabs */}
        <Tabs value={activeTab} onValueChange={(v: any) => setActiveTab(v)} className="w-full">
          <TabsList className="grid w-full grid-cols-4 bg-[#0d120d] border border-cyan-900/30">
            <TabsTrigger 
              value="devices" 
              className="data-[state=active]:bg-cyan-900/30 data-[state=active]:text-white data-[state=inactive]:text-gray-400"
            >
              Devices
            </TabsTrigger>
            <TabsTrigger 
              value="threats" 
              className="data-[state=active]:bg-cyan-900/30 data-[state=active]:text-white data-[state=inactive]:text-gray-400"
            >
              Threats
              {threats.length > 0 && (
                <Badge className="ml-2 bg-red-500 text-white text-xs">{threats.length}</Badge>
              )}
            </TabsTrigger>
            <TabsTrigger 
              value="history" 
              className="data-[state=active]:bg-cyan-900/30 data-[state=active]:text-white data-[state=inactive]:text-gray-400"
            >
              History
            </TabsTrigger>
            <TabsTrigger 
              value="settings" 
              className="data-[state=active]:bg-cyan-900/30 data-[state=active]:text-white data-[state=inactive]:text-gray-400"
            >
              Settings
            </TabsTrigger>
          </TabsList>

          <TabsContent value="devices" className="mt-4">
            <DeviceListPanel
              devices={devices}
              onlineDevices={onlineDevices}
              hasRouter={hasRouter}
              onRefresh={handleRefreshDevices}
              onSetupRouter={() => setShowRouterSetup(true)}
            />
          </TabsContent>

          <TabsContent value="threats" className="mt-4">
            <ThreatPanel threats={threats} />
          </TabsContent>

          <TabsContent value="history" className="mt-4">
            <HistoryPanel alerts={alerts} />
          </TabsContent>

          <TabsContent value="settings" className="mt-4">
            <GuardSettingsPanel
              settings={settings}
              hasRouter={hasRouter}
              onSetupRouter={() => setShowRouterSetup(true)}
              onSettingsChange={loadInitialData}
            />
          </TabsContent>
        </Tabs>
      </div>

      {/* Router Setup Dialog */}
      {showRouterSetup && (
        <RouterSetupDialog
          open={showRouterSetup}
          onClose={() => setShowRouterSetup(false)}
          onSuccess={() => {
            setShowRouterSetup(false);
            setHasRouter(true);
            handleRefreshDevices();
          }}
        />
      )}
    </div>
  );
}
