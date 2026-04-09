'use client';

import { useState, useEffect } from 'react';
import { Shield, Wifi, Router, KeyRound, Network, Eye } from 'lucide-react';
import { Card } from '@/components/ui/card';
import { ScrollArea } from '@/components/ui/scroll-area';
import { getSecurityAudit, SecurityTip } from '@/lib/native-plugins';
import { useI18n } from '@/lib/i18n';

export default function SecurityTipsPanel() {
  const { t } = useI18n();
  const [tips, setTips] = useState<SecurityTip[]>([]);
  const [loading, setLoading] = useState(true);

  const plugin = getSecurityAudit();

  useEffect(() => {
    loadTips();
  }, []);

  const loadTips = async () => {
    if (!plugin) {
      setLoading(false);
      return;
    }

    try {
      const { tips: loadedTips } = await plugin.getSecurityTips();
      setTips(loadedTips);
    } catch (err) {
      console.error('Error loading tips:', err);
    } finally {
      setLoading(false);
    }
  };

  const getCategoryIcon = (category: string) => {
    switch (category) {
      case 'wifi': return Wifi;
      case 'router': return Router;
      case 'password': return KeyRound;
      case 'network': return Network;
      case 'privacy': return Eye;
      default: return Shield;
    }
  };

  const getCategoryColor = (category: string) => {
    switch (category) {
      case 'wifi': return 'text-cyan-400';
      case 'router': return 'text-emerald-400';
      case 'password': return 'text-amber-400';
      case 'network': return 'text-purple-400';
      case 'privacy': return 'text-pink-400';
      default: return 'text-gray-400';
    }
  };

  if (loading) {
    return (
      <Card className="bg-[#0d120d]/80 border-cyan-900/30 p-6">
        <div className="text-center text-gray-400">{t('securityTips.loadingTips')}</div>
      </Card>
    );
  }

  // Separate contextual and static tips
  const contextualTips = tips.filter(t => t.isContextual);
  const staticTips = tips.filter(t => !t.isContextual);

  return (
    <ScrollArea className="h-[500px]">
      <div className="space-y-4 pr-4">
        {/* Contextual Tips */}
        {contextualTips.length > 0 && (
          <div className="space-y-3">
            <h3 className="text-cyan-400 font-semibold text-sm uppercase tracking-wider">
              {t('securityTips.basedOnNetwork')}
            </h3>
            
            {contextualTips.map((tip) => {
              const Icon = getCategoryIcon(tip.category);
              const colorClass = getCategoryColor(tip.category);
              
              return (
                <Card 
                  key={tip.id} 
                  className="bg-[#0d120d]/80 border-cyan-900/30 border-l-2 border-l-cyan-400 p-4"
                >
                  <div className="flex items-start gap-3">
                    <Icon className={`w-5 h-5 ${colorClass} flex-shrink-0 mt-0.5`} />
                    
                    <div className="flex-1 min-w-0">
                      <div className="flex items-center gap-2 mb-1">
                        <h4 className="font-semibold text-sm text-cyan-400">
                          {tip.title}
                        </h4>
                        <span className="text-xs text-gray-500 uppercase">
                          {tip.category}
                        </span>
                      </div>
                      
                      <p className="text-sm text-gray-400 leading-relaxed">
                        {tip.description}
                      </p>
                    </div>
                  </div>
                </Card>
              );
            })}
          </div>
        )}

        {/* Static Tips */}
        {staticTips.length > 0 && (
          <div className="space-y-3">
            <h3 className="text-cyan-400 font-semibold text-sm uppercase tracking-wider">
              {t('securityTips.generalBestPractices')}
            </h3>
            
            {staticTips.map((tip) => {
              const Icon = getCategoryIcon(tip.category);
              const colorClass = getCategoryColor(tip.category);
              
              return (
                <Card 
                  key={tip.id} 
                  className="bg-[#0d120d]/80 border-cyan-900/30 p-4"
                >
                  <div className="flex items-start gap-3">
                    <Icon className={`w-5 h-5 ${colorClass} flex-shrink-0 mt-0.5`} />
                    
                    <div className="flex-1 min-w-0">
                      <div className="flex items-center gap-2 mb-1">
                        <h4 className="font-semibold text-sm text-gray-300">
                          {tip.title}
                        </h4>
                        <span className="text-xs text-gray-500 uppercase">
                          {tip.category}
                        </span>
                      </div>
                      
                      <p className="text-sm text-gray-400 leading-relaxed">
                        {tip.description}
                      </p>
                    </div>
                  </div>
                </Card>
              );
            })}
          </div>
        )}

        {tips.length === 0 && (
          <Card className="bg-[#0d120d]/80 border-cyan-900/30 p-6">
            <div className="text-center text-gray-400">
              {t('securityTips.noTips')}
            </div>
          </Card>
        )}
      </div>
    </ScrollArea>
  );
}
