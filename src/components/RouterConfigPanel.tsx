'use client';

import { Server, ExternalLink, CheckCircle2, AlertTriangle, XCircle } from 'lucide-react';
import { Card } from '@/components/ui/card';
import { Button } from '@/components/ui/button';
import { RouterInfo, SecurityCheck } from '@/lib/native-plugins';

interface RouterConfigPanelProps {
  routerInfo: RouterInfo;
  checks: SecurityCheck[];
}

export default function RouterConfigPanel({ routerInfo, checks }: RouterConfigPanelProps) {
  // Get port check data
  const portsCheck = checks.find(c => c.id === 'open_ports');
  const openPorts = routerInfo.openPorts || [];

  // Common port info
  const portInfo: Record<number, { service: string; dangerous: boolean }> = {
    21: { service: 'FTP', dangerous: true },
    22: { service: 'SSH', dangerous: true },
    23: { service: 'Telnet', dangerous: true },
    80: { service: 'HTTP', dangerous: false },
    443: { service: 'HTTPS', dangerous: false },
    8080: { service: 'HTTP-Alt', dangerous: true },
    8443: { service: 'HTTPS-Alt', dangerous: false },
    3389: { service: 'RDP', dangerous: true },
    5900: { service: 'VNC', dangerous: true },
    161: { service: 'SNMP', dangerous: true },
  };

  const handleOpenRouter = () => {
    if (routerInfo.gatewayIp && routerInfo.gatewayIp !== 'Unknown') {
      window.open(`http://${routerInfo.gatewayIp}`, '_blank');
    }
  };

  return (
    <div className="space-y-4">
      {/* Router Information */}
      <Card className="bg-[#0d120d]/80 border-cyan-900/30 p-4">
        <h3 className="text-cyan-400 font-semibold text-sm uppercase tracking-wider mb-3">
          Router Information
        </h3>
        
        <div className="space-y-2 text-sm">
          <div className="flex justify-between">
            <span className="text-gray-400">Gateway IP:</span>
            <span className="text-cyan-400 font-mono">{routerInfo.gatewayIp}</span>
          </div>
          
          {routerInfo.manufacturer && routerInfo.manufacturer !== 'Unknown' && (
            <div className="flex justify-between">
              <span className="text-gray-400">Manufacturer:</span>
              <span className="text-gray-300">{routerInfo.manufacturer}</span>
            </div>
          )}
          
          <div className="flex justify-between">
            <span className="text-gray-400">Admin Panel:</span>
            <span className={routerInfo.adminAccessible ? 'text-amber-400' : 'text-emerald-400'}>
              {routerInfo.adminAccessible ? '✓ Accessible' : '✗ Not accessible'}
            </span>
          </div>
          
          <div className="flex justify-between">
            <span className="text-gray-400">HTTPS:</span>
            <span className={routerInfo.httpsAccessible ? 'text-emerald-400' : 'text-amber-400'}>
              {routerInfo.httpsAccessible ? '✓ Available' : '✗ HTTP only'}
            </span>
          </div>
        </div>
      </Card>

      {/* Open Ports */}
      <Card className="bg-[#0d120d]/80 border-cyan-900/30 p-4">
        <h3 className="text-cyan-400 font-semibold text-sm uppercase tracking-wider mb-3">
          Open Ports
        </h3>
        
        {openPorts.length === 0 ? (
          <div className="text-center py-4">
            <CheckCircle2 className="w-8 h-8 text-emerald-400 mx-auto mb-2" />
            <p className="text-sm text-gray-400">No open ports detected</p>
          </div>
        ) : (
          <div className="space-y-2">
            {openPorts.map((port) => {
              const info = portInfo[port] || { service: 'Unknown', dangerous: false };
              const isDangerous = info.dangerous;
              
              const Icon = isDangerous ? XCircle : 
                          (port === 80 || port === 443) ? AlertTriangle : CheckCircle2;
              
              const iconColor = isDangerous ? 'text-red-400' :
                               (port === 80 || port === 443) ? 'text-amber-400' : 'text-emerald-400';
              
              return (
                <div 
                  key={port}
                  className="flex items-center justify-between p-2 rounded bg-[#0d120d]/60 border border-cyan-900/20"
                >
                  <div className="flex items-center gap-3">
                    <Icon className={`w-4 h-4 ${iconColor}`} />
                    <div>
                      <div className="text-sm font-medium text-gray-300">
                        Port {port}
                      </div>
                      <div className="text-xs text-gray-500">
                        {info.service}
                      </div>
                    </div>
                  </div>
                  
                  <div className={`text-xs ${iconColor}`}>
                    {isDangerous ? 'Dangerous' : 
                     (port === 80 || port === 443) ? 'Admin' : 'Open'}
                  </div>
                </div>
              );
            })}
          </div>
        )}
      </Card>


    </div>
  );
}
