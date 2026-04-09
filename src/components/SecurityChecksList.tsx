'use client';

import { CheckCircle2, AlertTriangle, XCircle } from 'lucide-react';
import { Card } from '@/components/ui/card';
import { Badge } from '@/components/ui/badge';
import { SecurityCheck } from '@/lib/native-plugins';
import { useI18n } from '@/lib/i18n';

interface SecurityChecksListProps {
  checks: SecurityCheck[];
}

export default function SecurityChecksList({ checks }: SecurityChecksListProps) {
  const { t } = useI18n();
  // Sort: fails first, then warns, then passes
  const sortedChecks = [...checks].sort((a, b) => {
    const statusOrder = { fail: 0, warn: 1, pass: 2 };
    return statusOrder[a.status] - statusOrder[b.status];
  });

  return (
    <Card className="bg-[#0d120d]/80 border-cyan-900/30 p-4">
      <h3 className="text-cyan-400 font-semibold text-sm uppercase tracking-wider mb-3">
        {t('securityChecks.title')}
      </h3>
      
      <div className="space-y-3">
        {sortedChecks.map((check) => {
          const Icon = 
            check.status === 'pass' ? CheckCircle2 :
            check.status === 'warn' ? AlertTriangle : XCircle;
          
          const iconColor = 
            check.status === 'pass' ? 'text-emerald-400' :
            check.status === 'warn' ? 'text-amber-400' : 'text-red-400';
          
          const badgeClass = 
            check.status === 'pass' ? 'bg-emerald-400/10 text-emerald-400 border-emerald-400/30' :
            check.status === 'warn' ? 'bg-amber-400/10 text-amber-400 border-amber-400/30' :
            'bg-red-400/10 text-red-400 border-red-400/30';

          return (
            <div 
              key={check.id}
              className="flex items-start gap-3 p-3 rounded-lg bg-[#0d120d]/60 border border-cyan-900/20"
            >
              <Icon className={`w-5 h-5 ${iconColor} flex-shrink-0 mt-0.5`} />
              
              <div className="flex-1 min-w-0">
                <div className="flex items-center justify-between gap-2 mb-1">
                  <h4 className="font-semibold text-sm text-cyan-400">{check.name}</h4>
                  <Badge className={`${badgeClass} text-xs flex-shrink-0`}>
                    {check.score}/{check.weight}
                  </Badge>
                </div>
                
                <div className="text-xs text-gray-400 mb-1">
                  {check.value}
                </div>
                
                <div className="text-xs text-gray-500">
                  {check.detail}
                </div>
              </div>
            </div>
          );
        })}
      </div>
    </Card>
  );
}
