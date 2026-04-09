'use client';

import { useState, useEffect } from 'react';
import { Shield, ShieldCheck, ShieldAlert, RefreshCw, ExternalLink, Loader2, ArrowLeft } from 'lucide-react';
import { Card } from '@/components/ui/card';
import { Button } from '@/components/ui/button';
import { Tabs, TabsContent, TabsList, TabsTrigger } from '@/components/ui/tabs';
import { getSecurityAudit, SecurityAuditResult, SecurityCheck } from '@/lib/native-plugins';
import SecurityChecksList from './SecurityChecksList';
import RecommendationsPanel from './RecommendationsPanel';
import RouterConfigPanel from './RouterConfigPanel';
import SecurityTipsPanel from './SecurityTipsPanel';
import { useI18n } from '@/lib/i18n';

type ScanState = 'idle' | 'scanning' | 'result' | 'error';

interface SecurityScoreDashboardProps {
  onBack?: () => void;
  inSheet?: boolean;
}

export default function SecurityScoreDashboard({ onBack, inSheet = false }: SecurityScoreDashboardProps) {
  const { t } = useI18n()
  const [state, setState] = useState<ScanState>('idle');
  const [auditResult, setAuditResult] = useState<SecurityAuditResult | null>(null);
  const [error, setError] = useState<string>('');
  const [scanProgress, setScanProgress] = useState<string>('');

  const plugin = getSecurityAudit();

  // Handle back button navigation
  const handleBack = () => {
    if (inSheet && onBack) {
      onBack();
    } else {
      const event = new CustomEvent('navigate-to-networks');
      window.dispatchEvent(event);
    }
  };

  // Load cached result on mount
  useEffect(() => {
    loadCachedResult();
  }, []);

  const loadCachedResult = async () => {
    if (!plugin) return;
    
    try {
      const { result } = await plugin.getLastAuditResult();
      if (result) {
        setAuditResult(result);
        setState('result');
      }
    } catch (err) {
      console.error('Error loading cached result:', err);
    }
  };

  const runScan = async () => {
    if (!plugin) {
      setError('Security audit not available on this device');
      setState('error');
      return;
    }

    setState('scanning');
    setError('');
    
    // Simulate progress messages
    const progressMessages = [
      'Checking WiFi encryption...',
      'Scanning router ports...',
      'Analyzing DNS security...',
      'Counting connected devices...',
      'Checking network configuration...',
      'Calculating security score...'
    ];
    
    let progressIndex = 0;
    const progressInterval = setInterval(() => {
      if (progressIndex < progressMessages.length) {
        setScanProgress(progressMessages[progressIndex]);
        progressIndex++;
      }
    }, 2000);

    try {
      const { result } = await plugin.runFullAudit();
      clearInterval(progressInterval);
      setAuditResult(result);
      setState('result');
    } catch (err: any) {
      clearInterval(progressInterval);
      setError(err.message || 'Failed to run security audit');
      setState('error');
    }
  };

  const handleOpenRouter = async () => {
    if (!plugin) return;
    
    try {
      await plugin.openRouterAdmin();
    } catch (err: any) {
      console.error('Error opening router admin:', err);
    }
  };

  // Render idle state
  if (state === 'idle') {
    return (
      <div className="px-4 pb-4">
        {/* Header with Back Button */}
        <div className="flex items-center gap-3 pt-4 pb-4">
          <Button
            onClick={handleBack}
            variant="ghost"
            size="sm"
            className="text-gray-400 hover:text-white"
          >
            <ArrowLeft className="w-4 h-4 mr-2" />
            {inSheet ? 'Back to WiFi Details' : 'Back to Networks'}
          </Button>
        </div>

        <div className="flex flex-col items-center justify-center min-h-[500px]">
          <div className="text-center space-y-6">
            <div className="flex justify-center">
              <div className="p-6 bg-cyan-400/10 rounded-full">
                <Shield className="w-16 h-16 text-cyan-400" />
              </div>
            </div>
            <div className="space-y-2">
              <h2 className="text-2xl font-bold text-cyan-400">{t('wifiSec.networkSecurityAudit')}</h2>
              <p className="text-gray-400 max-w-md">
                {t('wifiSec.scanNetworkSecurity')}
              </p>
            </div>
            <Button 
              onClick={runScan}
              className="bg-cyan-600 hover:bg-cyan-500 text-white"
              size="lg"
            >
              <Shield className="w-5 h-5 mr-2" />
              Scan Network Security
            </Button>
          </div>
        </div>
      </div>
    );
  }

  // Render scanning state
  if (state === 'scanning') {
    return (
      <div className="px-4 pb-4">
        {/* Header with Back Button */}
        <div className="flex items-center gap-3 pt-4 pb-4">
          <Button
            onClick={handleBack}
            variant="ghost"
            size="sm"
            className="text-gray-400 hover:text-white"
          >
            <ArrowLeft className="w-4 h-4 mr-2" />
            {inSheet ? 'Back to WiFi Details' : 'Back to Networks'}
          </Button>
        </div>

        <div className="flex flex-col items-center justify-center min-h-[500px]">
          <div className="text-center space-y-6">
            <Loader2 className="w-16 h-16 text-cyan-400 animate-spin mx-auto" />
            <div className="space-y-2">
              <h2 className="text-xl font-semibold text-cyan-400">{t('wifiSec.scanningNetwork')}</h2>
              <p className="text-gray-400">{scanProgress}</p>
            </div>
          </div>
        </div>
      </div>
    );
  }

  // Render error state
  if (state === 'error') {
    return (
      <div className="px-4 pb-4">
        {/* Header with Back Button */}
        <div className="flex items-center gap-3 pt-4 pb-4">
          <Button
            onClick={handleBack}
            variant="ghost"
            size="sm"
            className="text-gray-400 hover:text-white"
          >
            <ArrowLeft className="w-4 h-4 mr-2" />
            {inSheet ? 'Back to WiFi Details' : 'Back to Networks'}
          </Button>
        </div>

        <div className="flex flex-col items-center justify-center min-h-[500px]">
          <div className="text-center space-y-6">
            <div className="flex justify-center">
              <div className="p-6 bg-red-400/10 rounded-full">
                <ShieldAlert className="w-16 h-16 text-red-400" />
              </div>
            </div>
            <div className="space-y-2">
              <h2 className="text-xl font-semibold text-red-400">{t('wifiSec.scanFailed')}</h2>
              <p className="text-gray-400 max-w-md">{error}</p>
            </div>
            <Button 
              onClick={runScan}
              variant="outline"
              className="border-cyan-900/30 text-cyan-400 hover:bg-cyan-400/10"
            >
              <RefreshCw className="w-4 h-4 mr-2" />
              Retry Scan
            </Button>
          </div>
        </div>
      </div>
    );
  }

  // Render result state
  if (!auditResult) return null;

  const scoreColor = 
    auditResult.score >= 80 ? 'text-emerald-400' :
    auditResult.score >= 60 ? 'text-cyan-400' :
    auditResult.score >= 40 ? 'text-amber-400' : 'text-red-400';

  const scoreBgColor = 
    auditResult.score >= 80 ? 'bg-emerald-400/10' :
    auditResult.score >= 60 ? 'bg-cyan-400/10' :
    auditResult.score >= 40 ? 'bg-amber-400/10' : 'bg-red-400/10';

  const scoreIcon = auditResult.score >= 60 ? ShieldCheck : ShieldAlert;
  const ScoreIcon = scoreIcon;

  return (
    <div className="space-y-4 px-4 pb-4">
      {/* Header with Back Button */}
      <div className="flex items-center gap-3 pt-4">
        <Button
          onClick={handleBack}
          variant="ghost"
          size="sm"
          className="text-gray-400 hover:text-white"
        >
          <ArrowLeft className="w-4 h-4 mr-2" />
          {inSheet ? 'Back to WiFi Details' : 'Back to Networks'}
        </Button>
      </div>

      {/* Score Gauge Card */}
      <Card className="bg-[#0d120d]/80 border-cyan-900/30 p-6">
        <div className="flex flex-col items-center space-y-4">
          {/* Circular Score Gauge */}
          <div className="relative w-48 h-48">
            <svg className="w-full h-full transform -rotate-90">
              {/* Background circle */}
              <circle
                cx="96"
                cy="96"
                r="88"
                fill="none"
                stroke="rgba(8, 145, 178, 0.1)"
                strokeWidth="12"
              />
              {/* Score arc */}
              <circle
                cx="96"
                cy="96"
                r="88"
                fill="none"
                stroke={scoreColor.replace('text-', '')}
                strokeWidth="12"
                strokeDasharray={`${(auditResult.score / 100) * 553} 553`}
                strokeLinecap="round"
                className="transition-all duration-1000 ease-out"
                style={{
                  stroke: scoreColor === 'text-emerald-400' ? '#34d399' :
                          scoreColor === 'text-cyan-400' ? '#22d3ee' :
                          scoreColor === 'text-amber-400' ? '#fbbf24' : '#f87171'
                }}
              />
            </svg>
            {/* Score text */}
            <div className="absolute inset-0 flex flex-col items-center justify-center">
              <ScoreIcon className={`w-8 h-8 ${scoreColor} mb-2`} />
              <div className={`text-4xl font-bold ${scoreColor}`}>
                {auditResult.score}
              </div>
              <div className="text-lg text-gray-400">Grade {auditResult.grade}</div>
            </div>
          </div>

          {/* Network Info */}
          <div className="text-center space-y-1">
            <div className="text-sm text-gray-400">
              Network: <span className="text-cyan-400">{auditResult.networkName || 'Unknown'}</span>
            </div>
            <div className="text-xs text-gray-500">
              Last scan: {new Date(auditResult.timestamp).toLocaleTimeString()}
            </div>
          </div>

          {/* Action Buttons */}
          <div className="flex gap-3">
            <Button
              onClick={runScan}
              className="bg-cyan-600 hover:bg-cyan-500 text-white"
              size="sm"
            >
              <RefreshCw className="w-4 h-4 mr-2" />
              Re-scan
            </Button>
          </div>
        </div>
      </Card>

      {/* Security Checks */}
      <SecurityChecksList checks={auditResult.checks} />

      {/* Tabs for Recommendations, Router Config, Tips */}
      <Tabs defaultValue="recommendations" className="w-full">
        <TabsList className="grid w-full grid-cols-3 bg-[#0d120d]/80 border border-cyan-900/30">
          <TabsTrigger value="recommendations" className="text-white data-[state=active]:bg-cyan-400/10 data-[state=active]:text-cyan-400">
            Recommendations
          </TabsTrigger>
          <TabsTrigger value="router" className="text-white data-[state=active]:bg-cyan-400/10 data-[state=active]:text-cyan-400">
            Router
          </TabsTrigger>
          <TabsTrigger value="tips" className="text-white data-[state=active]:bg-cyan-400/10 data-[state=active]:text-cyan-400">
            Tips
          </TabsTrigger>
        </TabsList>

        <TabsContent value="recommendations" className="mt-4">
          <RecommendationsPanel 
            recommendations={auditResult.recommendations} 
            onOpenRouter={handleOpenRouter}
          />
        </TabsContent>

        <TabsContent value="router" className="mt-4">
          <RouterConfigPanel 
            routerInfo={auditResult.routerInfo}
            checks={auditResult.checks}
          />
        </TabsContent>

        <TabsContent value="tips" className="mt-4">
          <SecurityTipsPanel />
        </TabsContent>
      </Tabs>
    </div>
  );
}
