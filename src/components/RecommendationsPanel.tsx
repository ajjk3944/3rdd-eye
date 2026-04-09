'use client';

import { AlertTriangle, ExternalLink } from 'lucide-react';
import { Card } from '@/components/ui/card';
import { Badge } from '@/components/ui/badge';
import { Button } from '@/components/ui/button';
import { SecurityRecommendation } from '@/lib/native-plugins';
import { useI18n } from '@/lib/i18n';

interface RecommendationsPanelProps {
  recommendations: SecurityRecommendation[];
  onOpenRouter: () => void;
}

export default function RecommendationsPanel({ recommendations, onOpenRouter }: RecommendationsPanelProps) {
  const { t } = useI18n();
  if (recommendations.length === 0) {
    return (
      <Card className="bg-[#0d120d]/80 border-cyan-900/30 p-6">
        <div className="text-center space-y-3">
          <div className="flex justify-center">
            <div className="p-4 bg-emerald-400/10 rounded-full">
              <AlertTriangle className="w-8 h-8 text-emerald-400" />
            </div>
          </div>
          <div>
            <h3 className="text-lg font-semibold text-emerald-400 mb-1">{t('recommendations.allClear')}</h3>
            <p className="text-sm text-gray-400">
              {t('recommendations.allClearDesc')}
            </p>
          </div>
        </div>
      </Card>
    );
  }

  // Count by priority
  const highCount = recommendations.filter(r => r.priority === 'HIGH').length;
  const mediumCount = recommendations.filter(r => r.priority === 'MEDIUM').length;
  const lowCount = recommendations.filter(r => r.priority === 'LOW').length;

  return (
    <div className="space-y-4">
      {/* Summary */}
      <Card className="bg-[#0d120d]/80 border-cyan-900/30 p-4">
        <div className="flex items-center gap-2 text-sm">
          <span className="text-gray-400">{t('recommendations.found')}</span>
          {highCount > 0 && (
            <Badge className="bg-red-400/10 text-red-400 border-red-400/30">
              {highCount} {t('recommendations.high')}
            </Badge>
          )}
          {mediumCount > 0 && (
            <Badge className="bg-amber-400/10 text-amber-400 border-amber-400/30">
              {mediumCount} {t('recommendations.medium')}
            </Badge>
          )}
          {lowCount > 0 && (
            <Badge className="bg-cyan-400/10 text-cyan-400 border-cyan-400/30">
              {lowCount} {t('recommendations.low')}
            </Badge>
          )}
        </div>
      </Card>

      {/* Recommendations List */}
      <div className="space-y-3">
        {recommendations.map((rec) => {
          const priorityBadgeClass = 
            rec.priority === 'HIGH' ? 'bg-red-400/10 text-red-400 border-red-400/30' :
            rec.priority === 'MEDIUM' ? 'bg-amber-400/10 text-amber-400 border-amber-400/30' :
            'bg-cyan-400/10 text-cyan-400 border-cyan-400/30';

          const categoryBadgeClass = 'bg-gray-800 text-gray-400 border-gray-700';

          return (
            <Card key={rec.id} className="bg-[#0d120d]/80 border-cyan-900/30 p-4">
              <div className="space-y-3">
                {/* Header */}
                <div className="flex items-start justify-between gap-2">
                  <div className="flex-1">
                    <div className="flex items-center gap-2 mb-2">
                      <Badge className={priorityBadgeClass}>
                        {rec.priority}
                      </Badge>
                      <Badge className={categoryBadgeClass}>
                        {rec.category}
                      </Badge>
                    </div>
                    <h4 className="font-semibold text-cyan-400 mb-1">
                      {rec.title}
                    </h4>
                  </div>
                </div>

                {/* Description */}
                <p className="text-sm text-gray-400 leading-relaxed">
                  {rec.description}
                </p>


              </div>
            </Card>
          );
        })}
      </div>
    </div>
  );
}
