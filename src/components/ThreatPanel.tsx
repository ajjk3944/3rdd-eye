'use client';

import { ShieldCheck, AlertTriangle, XCircle } from 'lucide-react';
import { Card } from '@/components/ui/card';
import { Button } from '@/components/ui/button';
import { Badge } from '@/components/ui/badge';
import { ScrollArea } from '@/components/ui/scroll-area';
import type { ThreatReport } from '@/lib/native-plugins';

interface ThreatPanelProps {
  threats: ThreatReport[];
}

export default function ThreatPanel({ threats }: ThreatPanelProps) {
  const getThreatColor = (level: number) => {
    if (level >= 4) return { bg: 'bg-red-500/10', border: 'border-red-500/50', text: 'text-red-500', label: 'CRITICAL' };
    if (level >= 3) return { bg: 'bg-orange-500/10', border: 'border-orange-500/50', text: 'text-orange-500', label: 'HIGH' };
    if (level >= 2) return { bg: 'bg-amber-500/10', border: 'border-amber-500/50', text: 'text-amber-500', label: 'MEDIUM' };
    return { bg: 'bg-yellow-500/10', border: 'border-yellow-500/50', text: 'text-yellow-500', label: 'LOW' };
  };

  const sortedThreats = [...threats].sort((a, b) => b.threatScore - a.threatScore);

  if (threats.length === 0) {
    return (
      <Card className="bg-[#0d120d] border-cyan-900/30 p-12 text-center">
        <ShieldCheck className="w-16 h-16 text-emerald-400 mx-auto mb-4" />
        <h3 className="text-white text-xl font-semibold mb-2">Your network is secure!</h3>
        <p className="text-gray-400">No active threats detected</p>
      </Card>
    );
  }

  return (
    <ScrollArea className="h-[calc(100vh-400px)]">
      <div className="space-y-3">
        {sortedThreats.map((threat) => {
          const colors = getThreatColor(threat.overallThreatLevel);
          
          return (
            <Card key={threat.macAddress} className={`${colors.bg} border ${colors.border} p-4`}>
              <div className="flex items-start gap-3">
                <AlertTriangle className={`w-6 h-6 ${colors.text} ${threat.overallThreatLevel >= 4 ? 'animate-pulse' : ''}`} />
                
                <div className="flex-1">
                  <div className="flex items-center gap-2 mb-2">
                    <Badge className={`${colors.bg} ${colors.text} border ${colors.border}`}>
                      {colors.label}
                    </Badge>
                    <span className={`text-sm ${colors.text}`}>Score: {threat.threatScore}/100</span>
                  </div>
                  
                  <h3 className="text-white font-semibold mb-1">{threat.deviceName}</h3>
                  <p className="text-gray-400 text-sm font-mono mb-2">{threat.macAddress}</p>
                  <p className="text-gray-300 text-sm">{threat.summary}</p>
                  
                  <div className="flex gap-2 mt-3">
                    <Button size="sm" variant="outline" className="border-cyan-900/30 text-xs">
                      View Device
                    </Button>
                    <Button size="sm" variant="outline" className="border-cyan-900/30 text-xs">
                      Dismiss
                    </Button>
                  </div>
                </div>
              </div>
            </Card>
          );
        })}
      </div>
    </ScrollArea>
  );
}
