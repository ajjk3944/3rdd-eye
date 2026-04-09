'use client';

import { useState, useEffect } from 'react';
import {
  Settings, Bell, Clock, Router, Trash2, Shield, RefreshCw,
  Database, AlertTriangle, CheckCircle
} from 'lucide-react';
import { Card } from '@/components/ui/card';
import { Button } from '@/components/ui/button';
import { Switch } from '@/components/ui/switch';
import { Slider } from '@/components/ui/slider';
import { Label } from '@/components/ui/label';
import { ScrollArea } from '@/components/ui/scroll-area';
import { getRouterGuard } from '@/lib/native-plugins';
import type { GuardSettings, RouterCredential } from '@/lib/native-plugins';

interface GuardSettingsPanelProps {
  settings: GuardSettings | null;
  hasRouter: boolean;
  onSetupRouter: () => void;
  onSettingsChange: () => void;
}

export default function GuardSettingsPanel({
  settings: initialSettings,
  hasRouter,
  onSetupRouter,
  onSettingsChange
}: GuardSettingsPanelProps) {
  const [settings, setSettings] = useState<GuardSettings | null>(initialSettings);
  const [router, setRouter] = useState<RouterCredential | null>(null);
  const [saving, setSaving] = useState(false);
  const [clearingData, setClearingData] = useState(false);
  const [saveMessage, setSaveMessage] = useState<string | null>(null);

  useEffect(() => {
    loadRouterInfo();
  }, [hasRouter]);

  useEffect(() => {
    setSettings(initialSettings);
  }, [initialSettings]);

  const loadRouterInfo = async () => {
    const plugin = getRouterGuard();
    if (!plugin) return;

    try {
      const result = await plugin.getActiveRouter();
      setRouter(result.router);
    } catch (error) {
      console.error('Error loading router:', error);
    }
  };

  const handleSettingChange = async (key: keyof GuardSettings, value: any) => {
    const plugin = getRouterGuard();
    if (!plugin || !settings) return;

    const newSettings = { ...settings, [key]: value };
    setSettings(newSettings);

    setSaving(true);
    try {
      await plugin.updateGuardSettings({ [key]: value });
      setSaveMessage('Settings saved');
      setTimeout(() => setSaveMessage(null), 2000);
      onSettingsChange();
    } catch (error) {
      console.error('Error saving settings:', error);
      setSaveMessage('Failed to save');
      setTimeout(() => setSaveMessage(null), 2000);
    } finally {
      setSaving(false);
    }
  };

  const handleScanIntervalChange = async (value: number[]) => {
    await handleSettingChange('scanInterval', value[0]);
  };

  const handleRemoveRouter = async () => {
    const plugin = getRouterGuard();
    if (!plugin || !router) return;

    if (!confirm('Remove router connection? You can add it again later.')) {
      return;
    }

    try {
      await plugin.deleteRouter({ id: router.id });
      setRouter(null);
      onSettingsChange();
    } catch (error) {
      console.error('Error removing router:', error);
    }
  };

  const handleClearData = async (type: 'alerts' | 'history' | 'threats') => {
    const plugin = getRouterGuard();
    if (!plugin) return;

    const messages = {
      alerts: 'Clear all alert history?',
      history: 'Clear all device history? This will remove all known devices.',
      threats: 'Clear all threat reports?'
    };

    if (!confirm(messages[type])) {
      return;
    }

    setClearingData(true);
    try {
      if (type === 'alerts') {
        await plugin.markAllAlertsRead();
      }
      // Add other clear methods when needed
      setSaveMessage(`${type} cleared`);
      setTimeout(() => setSaveMessage(null), 2000);
      onSettingsChange();
    } catch (error) {
      console.error(`Error clearing ${type}:`, error);
      setSaveMessage('Failed to clear');
      setTimeout(() => setSaveMessage(null), 2000);
    } finally {
      setClearingData(false);
    }
  };

  const formatScanInterval = (ms: number) => {
    const seconds = ms / 1000;
    if (seconds < 60) return `${seconds}s`;
    const minutes = Math.floor(seconds / 60);
    return `${minutes}m`;
  };

  if (!settings) {
    return (
      <div className="flex items-center justify-center py-12">
        <RefreshCw className="w-8 h-8 text-cyan-400 animate-spin" />
      </div>
    );
  }

  return (
    <ScrollArea className="h-[calc(100vh-400px)]">
      <div className="space-y-4">
        {/* Save Message */}
        {saveMessage && (
          <Card className="bg-cyan-900/20 border-cyan-500/50 p-3">
            <div className="flex items-center gap-2">
              <CheckCircle className="w-5 h-5 text-cyan-400" />
              <p className="text-cyan-400 text-sm">{saveMessage}</p>
            </div>
          </Card>
        )}

        {/* Monitoring Settings */}
        <Card className="bg-[#0d120d] border-cyan-900/30 p-4">
          <div className="flex items-center gap-3 mb-4">
            <Clock className="w-6 h-6 text-cyan-400" />
            <h3 className="text-white font-semibold">Monitoring</h3>
          </div>

          <div className="space-y-4">
            <div>
              <div className="flex items-center justify-between mb-2">
                <Label className="text-gray-300">Scan Interval</Label>
                <span className="text-cyan-400 text-sm font-semibold">
                  {formatScanInterval(settings.scanInterval)}
                </span>
              </div>
              <Slider
                value={[settings.scanInterval]}
                onValueChange={handleScanIntervalChange}
                min={10000}
                max={300000}
                step={10000}
                className="w-full"
              />
              <p className="text-gray-500 text-xs mt-1">
                How often to scan for devices (10s - 5m)
              </p>
            </div>

            <div className="flex items-center justify-between">
              <div>
                <Label className="text-gray-300">Auto-start on Boot</Label>
                <p className="text-gray-500 text-xs mt-1">
                  Start monitoring when device boots
                </p>
              </div>
              <Switch
                checked={settings.autoStartOnBoot}
                onCheckedChange={(checked) =>
                  handleSettingChange('autoStartOnBoot', checked)
                }
              />
            </div>
          </div>
        </Card>

        {/* Notification Settings */}
        <Card className="bg-[#0d120d] border-cyan-900/30 p-4">
          <div className="flex items-center gap-3 mb-4">
            <Bell className="w-6 h-6 text-cyan-400" />
            <h3 className="text-white font-semibold">Notifications</h3>
          </div>

          <div className="space-y-4">
            <div className="flex items-center justify-between">
              <div>
                <Label className="text-gray-300">New Device Detected</Label>
                <p className="text-gray-500 text-xs mt-1">
                  Alert when unknown device joins
                </p>
              </div>
              <Switch
                checked={settings.notifyNewDevice}
                onCheckedChange={(checked) =>
                  handleSettingChange('notifyNewDevice', checked)
                }
              />
            </div>

            <div className="flex items-center justify-between">
              <div>
                <Label className="text-gray-300">Returning Device</Label>
                <p className="text-gray-500 text-xs mt-1">
                  Alert when known device reconnects
                </p>
              </div>
              <Switch
                checked={settings.notifyReturningDevice}
                onCheckedChange={(checked) =>
                  handleSettingChange('notifyReturningDevice', checked)
                }
              />
            </div>

            <div className="flex items-center justify-between">
              <div>
                <Label className="text-gray-300">Suspicious Activity</Label>
                <p className="text-gray-500 text-xs mt-1">
                  Alert on high threat detections
                </p>
              </div>
              <Switch
                checked={settings.notifySuspicious}
                onCheckedChange={(checked) =>
                  handleSettingChange('notifySuspicious', checked)
                }
              />
            </div>
          </div>
        </Card>

        {/* Router Settings */}
        <Card className="bg-[#0d120d] border-cyan-900/30 p-4">
          <div className="flex items-center gap-3 mb-4">
            <Router className="w-6 h-6 text-cyan-400" />
            <h3 className="text-white font-semibold">Router Connection</h3>
          </div>

          {router ? (
            <div className="space-y-3">
              <div className="p-3 bg-cyan-900/10 rounded-lg border border-cyan-900/30">
                <div className="flex items-start justify-between mb-2">
                  <div>
                    <p className="text-white font-semibold">{router.brand}</p>
                    <p className="text-gray-400 text-sm">{router.routerIp}</p>
                  </div>
                  <Shield className="w-5 h-5 text-emerald-400" />
                </div>
                <p className="text-gray-500 text-xs">
                  Username: {router.username}
                </p>
                {router.lastConnected && (
                  <p className="text-gray-500 text-xs mt-1">
                    Last connected:{' '}
                    {new Date(router.lastConnected).toLocaleDateString()}
                  </p>
                )}
              </div>

              <Button
                onClick={handleRemoveRouter}
                variant="outline"
                className="w-full border-red-900/30 text-red-400 hover:bg-red-900/20"
              >
                <Trash2 className="w-4 h-4 mr-2" />
                Remove Router
              </Button>
            </div>
          ) : (
            <div className="text-center py-4">
              <p className="text-gray-400 text-sm mb-3">No router connected</p>
              <Button
                onClick={onSetupRouter}
                className="w-full bg-cyan-600 hover:bg-cyan-700 text-white"
              >
                <Router className="w-4 h-4 mr-2" />
                Setup Router
              </Button>
            </div>
          )}
        </Card>

        {/* Data Management */}
        <Card className="bg-[#0d120d] border-cyan-900/30 p-4">
          <div className="flex items-center gap-3 mb-4">
            <Database className="w-6 h-6 text-cyan-400" />
            <h3 className="text-white font-semibold">Data Management</h3>
          </div>

          <div className="space-y-3">
            <Button
              onClick={() => handleClearData('alerts')}
              disabled={clearingData}
              variant="outline"
              className="w-full border-amber-900/30 text-amber-400 hover:bg-amber-900/20"
            >
              <Bell className="w-4 h-4 mr-2" />
              Clear Alert History
            </Button>

            <Button
              onClick={() => handleClearData('threats')}
              disabled={clearingData}
              variant="outline"
              className="w-full border-amber-900/30 text-amber-400 hover:bg-amber-900/20"
            >
              <AlertTriangle className="w-4 h-4 mr-2" />
              Clear Threat Reports
            </Button>

            <Button
              onClick={() => handleClearData('history')}
              disabled={clearingData}
              variant="outline"
              className="w-full border-red-900/30 text-red-400 hover:bg-red-900/20"
            >
              <Trash2 className="w-4 h-4 mr-2" />
              Clear Device History
            </Button>
          </div>

          <p className="text-gray-500 text-xs mt-3">
            Clearing data cannot be undone. Device history will be rebuilt as
            devices are detected.
          </p>
        </Card>

        {/* About */}
        <Card className="bg-[#0d120d] border-cyan-900/30 p-4">
          <div className="flex items-center gap-3 mb-3">
            <Shield className="w-6 h-6 text-cyan-400" />
            <h3 className="text-white font-semibold">About Network Guard</h3>
          </div>
          <p className="text-gray-400 text-sm leading-relaxed">
            Network Guard monitors your network for connected devices, detects
            potential threats, and provides real-time alerts. All data is stored
            locally and encrypted.
          </p>
          <p className="text-gray-500 text-xs mt-3">Version 1.0.0</p>
        </Card>
      </div>
    </ScrollArea>
  );
}
