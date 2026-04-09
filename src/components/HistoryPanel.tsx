'use client';

import { useState } from 'react';
import { Bell, BellRing, AlertTriangle } from 'lucide-react';
import { Card } from '@/components/ui/card';
import { Button } from '@/components/ui/button';
import { ScrollArea } from '@/components/ui/scroll-area';
import type { DeviceAlert } from '@/lib/native-plugins';

interface HistoryPanelProps {
  alerts: DeviceAlert[];
}

export default function HistoryPanel({ alerts }: HistoryPanelProps) {
  const [filter, setFilter] = useState<string>('all');

  const filteredAlerts = alerts.filter(alert => {
    if (filter === 'all') return true;
    return alert.alertType === filter;
  });

  const groupByDate = (alerts: DeviceAlert[]) => {
    const groups: { [key: string]: DeviceAlert[] } = {};
    const today = new Date().toDateString();
    const yesterday = new Date(Date.now() - 86400000).toDateString();

    alerts.forEach(alert => {
      const date = new Date(alert.createdAt).toDateString();
      let label = date;
      if (date === today) label = 'TODAY';
      else if (date === yesterday) label = 'YESTERDAY';
      
      if (!groups[label]) groups[label] = [];
      groups[label].push(alert);
    });

    return groups;
  };

  const formatTime = (timestamp: number) => {
    return new Date(timestamp).toLocaleTimeString('en-US', { hour: '2-digit', minute: '2-digit' });
  };

  const getAlertIcon = (type: string, severity: string) => {
    if (severity === 'danger') return <BellRing className="w-5 h-5 text-red-400" />;
    if (severity === 'warning') return <AlertTriangle className="w-5 h-5 text-amber-400" />;
    return <Bell className="w-5 h-5 text-emerald-400" />;
  };

  const grouped = groupByDate(filteredAlerts);

  if (alerts.length === 0) {
    return (
      <Card className="bg-[#0d120d] border-cyan-900/30 p-12 text-center">
        <Bell className="w-16 h-16 text-gray-600 mx-auto mb-4" />
        <h3 className="text-white text-xl font-semibold mb-2">No alerts yet</h3>
        <p className="text-gray-400">New device notifications will appear here</p>
      </Card>
    );
  }

  return (
    <div className="space-y-4">
      {/* Filter */}
      <div className="flex gap-2 overflow-x-auto pb-2">
        <Button size="sm" variant={filter === 'all' ? 'default' : 'outline'} onClick={() => setFilter('all')} className={filter === 'all' ? 'bg-cyan-600 text-white' : 'border-cyan-900/30 text-gray-400 hover:text-white'}>
          All
        </Button>
        <Button size="sm" variant={filter === 'new_device' ? 'default' : 'outline'} onClick={() => setFilter('new_device')} className={filter === 'new_device' ? 'bg-cyan-600 text-white' : 'border-cyan-900/30 text-gray-400 hover:text-white'}>
          New Device
        </Button>
        <Button size="sm" variant={filter === 'suspicious' ? 'default' : 'outline'} onClick={() => setFilter('suspicious')} className={filter === 'suspicious' ? 'bg-cyan-600 text-white' : 'border-cyan-900/30 text-gray-400 hover:text-white'}>
          Suspicious
        </Button>
        <Button size="sm" variant={filter === 'reconnected' ? 'default' : 'outline'} onClick={() => setFilter('reconnected')} className={filter === 'reconnected' ? 'bg-cyan-600 text-white' : 'border-cyan-900/30 text-gray-400 hover:text-white'}>
          Reconnected
        </Button>
      </div>

      <ScrollArea className="h-[calc(100vh-450px)]">
        <div className="space-y-4">
          {Object.entries(grouped).map(([date, dateAlerts]) => (
            <div key={date}>
              <h3 className="text-gray-400 text-sm font-semibold mb-2">{date}</h3>
              <div className="space-y-2">
                {dateAlerts.map((alert) => (
                  <Card key={alert.id} className="bg-[#0d120d] border-cyan-900/30 p-3">
                    <div className="flex items-start gap-3">
                      {getAlertIcon(alert.alertType, alert.severity)}
                      <div className="flex-1">
                        <div className="flex items-center justify-between mb-1">
                          <span className="text-white font-semibold text-sm">{alert.alertMessage}</span>
                          <span className="text-gray-500 text-xs">{formatTime(alert.createdAt)}</span>
                        </div>
                        <p className="text-gray-400 text-xs font-mono">{alert.macAddress}</p>
                      </div>
                    </div>
                  </Card>
                ))}
              </div>
            </div>
          ))}
        </div>
      </ScrollArea>
    </div>
  );
}
