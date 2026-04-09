'use client';

import { useState } from 'react';
import {
  Smartphone, Laptop, Tablet, Tv, Printer, Camera, Cpu, HelpCircle,
  Shield, ShieldCheck, ShieldX, Wifi, WifiOff, Router as RouterIcon,
  RefreshCw, ChevronRight, AlertTriangle, Key
} from 'lucide-react';
import { Card } from '@/components/ui/card';
import { Button } from '@/components/ui/button';
import { Badge } from '@/components/ui/badge';
import { ScrollArea } from '@/components/ui/scroll-area';
import type { KnownDevice } from '@/lib/native-plugins';
import { DeviceDetailSheet } from './DeviceDetailSheet';

interface DeviceListPanelProps {
  devices: KnownDevice[];
  onlineDevices: KnownDevice[];
  hasRouter: boolean;
  onRefresh: () => void;
  onSetupRouter: () => void;
}

export default function DeviceListPanel({
  devices,
  onlineDevices,
  hasRouter,
  onRefresh,
  onSetupRouter
}: DeviceListPanelProps) {
  const [filter, setFilter] = useState<'all' | 'online' | 'trusted' | 'unknown' | 'blocked'>('all');
  const [selectedDevice, setSelectedDevice] = useState<KnownDevice | null>(null);
  const [refreshing, setRefreshing] = useState(false);

  const getDeviceIcon = (deviceType: string) => {
    switch (deviceType) {
      case 'phone': return Smartphone;
      case 'laptop': return Laptop;
      case 'tablet': return Tablet;
      case 'tv': return Tv;
      case 'printer': return Printer;
      case 'camera': return Camera;
      case 'iot': return Cpu;
      default: return HelpCircle;
    }
  };

  const getTrustBadge = (trustLevel: number) => {
    if (trustLevel === 1) {
      return <Badge className="bg-emerald-500/20 text-emerald-400 border-emerald-500/50">TRUSTED</Badge>;
    } else if (trustLevel === -1) {
      return <Badge className="bg-red-500/20 text-red-400 border-red-500/50">BLOCKED</Badge>;
    }
    return <Badge className="bg-gray-500/20 text-gray-400 border-gray-500/50">UNKNOWN</Badge>;
  };

  const isNewDevice = (firstSeen: number) => {
    const hourAgo = Date.now() - (60 * 60 * 1000);
    return firstSeen > hourAgo;
  };

  const getThreatColor = (device: KnownDevice) => {
    // This would come from threat analysis, simplified here
    return 'bg-emerald-400';
  };

  const filteredDevices = devices.filter(device => {
    switch (filter) {
      case 'online': return device.isOnline;
      case 'trusted': return device.isTrusted === 1;
      case 'unknown': return device.isTrusted === 0;
      case 'blocked': return device.isTrusted === -1;
      default: return true;
    }
  });

  const handleRefresh = async () => {
    setRefreshing(true);
    try {
      await onRefresh();
    } catch (error) {
      console.error('Refresh failed:', error);
    } finally {
      // Keep spinner visible for at least 1 second for better UX
      setTimeout(() => setRefreshing(false), 1000);
    }
  };

  const trustedCount = devices.filter(d => d.isTrusted === 1).length;
  const unknownCount = devices.filter(d => d.isTrusted === 0).length;
  const blockedCount = devices.filter(d => d.isTrusted === -1).length;

  return (
    <div className="space-y-4">
      {/* Filter Bar */}
      <div className="flex gap-2 overflow-x-auto pb-2">
        <Button
          variant={filter === 'all' ? 'default' : 'outline'}
          size="sm"
          onClick={() => setFilter('all')}
          className={filter === 'all' ? 'bg-cyan-600 hover:bg-cyan-700 text-white' : 'border-cyan-900/30 text-gray-400 hover:text-white'}
        >
          All ({devices.length})
        </Button>
        <Button
          variant={filter === 'online' ? 'default' : 'outline'}
          size="sm"
          onClick={() => setFilter('online')}
          className={filter === 'online' ? 'bg-cyan-600 hover:bg-cyan-700 text-white' : 'border-cyan-900/30 text-gray-400 hover:text-white'}
        >
          Online ({onlineDevices.length})
        </Button>
        <Button
          variant={filter === 'trusted' ? 'default' : 'outline'}
          size="sm"
          onClick={() => setFilter('trusted')}
          className={filter === 'trusted' ? 'bg-cyan-600 hover:bg-cyan-700 text-white' : 'border-cyan-900/30 text-gray-400 hover:text-white'}
        >
          Trusted ({trustedCount})
        </Button>
        <Button
          variant={filter === 'unknown' ? 'default' : 'outline'}
          size="sm"
          onClick={() => setFilter('unknown')}
          className={filter === 'unknown' ? 'bg-cyan-600 hover:bg-cyan-700 text-white' : 'border-cyan-900/30 text-gray-400 hover:text-white'}
        >
          Unknown ({unknownCount})
        </Button>
        {blockedCount > 0 && (
          <Button
            variant={filter === 'blocked' ? 'default' : 'outline'}
            size="sm"
            onClick={() => setFilter('blocked')}
            className={filter === 'blocked' ? 'bg-cyan-600 hover:bg-cyan-700 text-white' : 'border-cyan-900/30 text-gray-400 hover:text-white'}
          >
            Blocked ({blockedCount})
          </Button>
        )}
      </div>

      {/* Router Section */}
      {hasRouter && (
        <Card className="bg-[#0d120d] border-cyan-900/30 p-4">
          <div className="flex items-center gap-3 mb-3">
            <RouterIcon className="w-6 h-6 text-cyan-400" />
            <div className="flex-1">
              <h3 className="text-white font-semibold">Router Connected</h3>
              <p className="text-gray-400 text-sm">Enhanced scanning enabled</p>
            </div>
          </div>
          <Button
            onClick={handleRefresh}
            disabled={refreshing}
            className="w-full bg-cyan-600 hover:bg-cyan-700 text-white"
          >
            {refreshing ? (
              <>
                <RefreshCw className="w-4 h-4 mr-2 animate-spin" />
                Scanning...
              </>
            ) : (
              <>
                <RefreshCw className="w-4 h-4 mr-2" />
                Refresh Devices
              </>
            )}
          </Button>
        </Card>
      )}

      {/* Device List */}
      <ScrollArea className="h-[calc(100vh-400px)]">
        <div className="space-y-3">
          {filteredDevices.length === 0 ? (
            <Card className="bg-[#0d120d] border-cyan-900/30 p-8 text-center">
              <HelpCircle className="w-12 h-12 text-gray-600 mx-auto mb-4" />
              <p className="text-gray-400">No devices found</p>
              <p className="text-gray-500 text-sm mt-2">
                {filter === 'all' 
                  ? 'Start monitoring to discover devices on your network'
                  : 'No devices match this filter'}
              </p>
            </Card>
          ) : (
            filteredDevices.map((device) => {
              const DeviceIcon = getDeviceIcon(device.deviceType);
              const deviceName = device.customName || device.deviceName || 'Unknown Device';
              
              return (
                <Card
                  key={device.id}
                  className="bg-[#0d120d] border-cyan-900/30 p-4 cursor-pointer hover:border-cyan-600/50 transition-colors"
                  onClick={() => setSelectedDevice(device)}
                >
                  <div className="flex items-start gap-3">
                    <div className="p-2 bg-cyan-900/20 rounded-lg">
                      <DeviceIcon className="w-6 h-6 text-cyan-400" />
                    </div>
                    
                    <div className="flex-1 min-w-0">
                      <div className="flex items-center gap-2 mb-1">
                        <h3 className="text-white font-semibold truncate">{deviceName}</h3>
                        {getTrustBadge(device.isTrusted)}
                        {isNewDevice(device.firstSeen) && (
                          <Badge className="bg-amber-500/20 text-amber-400 border-amber-500/50">NEW!</Badge>
                        )}
                      </div>
                      
                      <p className="text-gray-400 text-sm truncate">{device.vendor} | {device.ipAddress}</p>
                      
                      <div className="flex items-center gap-4 mt-2 text-xs">
                        <div className="flex items-center gap-1">
                          {device.isOnline ? (
                            <>
                              <Wifi className="w-3 h-3 text-emerald-400" />
                              <span className="text-emerald-400">Online</span>
                            </>
                          ) : (
                            <>
                              <WifiOff className="w-3 h-3 text-gray-500" />
                              <span className="text-gray-500">Offline</span>
                            </>
                          )}
                        </div>
                        
                        <div className="flex items-center gap-1">
                          <div className={`w-2 h-2 rounded-full ${getThreatColor(device)}`} />
                          <span className="text-gray-400">Threat: SAFE</span>
                        </div>
                      </div>
                    </div>
                    
                    <ChevronRight className="w-5 h-5 text-gray-600" />
                  </div>
                </Card>
              );
            })
          )}
        </div>
      </ScrollArea>

      {/* No Router Setup Banner */}
      {!hasRouter && (
        <Card className="bg-[#0d120d] border-amber-900/30 p-6 text-center">
          <Key className="w-12 h-12 text-amber-400 mx-auto mb-4" />
          <h3 className="text-white font-semibold mb-2">Setup Router Access</h3>
          <p className="text-gray-400 text-sm mb-4">
            Connect your router for deeper device scanning and management
          </p>
          <Button
            onClick={onSetupRouter}
            className="w-full bg-amber-600 hover:bg-amber-700 text-white"
          >
            Setup Now
          </Button>
        </Card>
      )}

      {/* Device Detail Sheet */}
      {selectedDevice && (
        <DeviceDetailSheet
          device={selectedDevice}
          open={!!selectedDevice}
          onClose={() => setSelectedDevice(null)}
          onUpdate={onRefresh}
        />
      )}
    </div>
  );
}
