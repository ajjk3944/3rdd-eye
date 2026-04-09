'use client';

import { useState } from 'react';
import { X, Router, CheckCircle, AlertCircle, Loader2 } from 'lucide-react';
import { Dialog, DialogContent } from '@/components/ui/dialog';
import { Button } from '@/components/ui/button';
import { Input } from '@/components/ui/input';
import { Label } from '@/components/ui/label';
import {
  Select,
  SelectContent,
  SelectItem,
  SelectTrigger,
  SelectValue,
} from '@/components/ui/select';
import { getRouterGuard } from '@/lib/native-plugins';
import { useI18n } from '@/lib/i18n';

interface RouterSetupDialogProps {
  open: boolean;
  onClose: () => void;
  onSuccess: () => void;
}

export default function RouterSetupDialog({
  open,
  onClose,
  onSuccess
}: RouterSetupDialogProps) {
  const { t } = useI18n();
  const [routerIp, setRouterIp] = useState('192.168.10.1');
  const [brand, setBrand] = useState('');
  const [authType, setAuthType] = useState<'full' | 'password' | 'none'>('full');
  const [username, setUsername] = useState('admin');
  const [password, setPassword] = useState('');
  const [testing, setTesting] = useState(false);
  const [saving, setSaving] = useState(false);
  const [testResult, setTestResult] = useState<{
    success: boolean;
    message: string;
    deviceCount?: number;
  } | null>(null);

  // Auto-switch auth type when Cudy or OpenWrt is selected
  const handleBrandChange = (newBrand: string) => {
    setBrand(newBrand);
    if (newBrand === 'Cudy' || newBrand === 'OpenWrt/LuCI') {
      setAuthType('password');
      setUsername('root'); // LuCI always uses root
    } else if (authType === 'password' && newBrand !== 'Cudy' && newBrand !== 'OpenWrt/LuCI') {
      setAuthType('full');
      setUsername('admin');
    }
  };

  const handleTestConnection = async () => {
    const plugin = getRouterGuard();
    if (!plugin) return;

    if (!routerIp) {
      setTestResult({
        success: false,
        message: t('router.enterIpAddress')
      });
      return;
    }

    if (authType === 'full' && (!username || !password)) {
      setTestResult({
        success: false,
        message: t('router.fillCredentials')
      });
      return;
    }

    if (authType === 'password' && !password) {
      setTestResult({
        success: false,
        message: t('router.enterPassword')
      });
      return;
    }

    setTesting(true);
    setTestResult(null);

    try {
      const result = await plugin.testRouterConnection({
        routerIp,
        username: authType === 'password' ? 'root' : (authType === 'none' ? '' : username),
        password: authType === 'none' ? '' : password,
        brand: brand || undefined
      });

      if (result.success) {
        setTestResult({
          success: true,
          message: t('router.connectionSuccessful') + ' ' + t('router.foundDevices', { count: result.deviceCount || 0 }),
          deviceCount: result.deviceCount
        });
      } else {
        setTestResult({
          success: false,
          message: result.error || t('router.connectionFailed')
        });
      }
    } catch (error: any) {
      setTestResult({
        success: false,
        message: error.message || t('router.connectionFailed')
      });
    } finally {
      setTesting(false);
    }
  };

  const handleSave = async () => {
    const plugin = getRouterGuard();
    if (!plugin) return;

    if (!routerIp) {
      setTestResult({
        success: false,
        message: t('router.enterIpAddress')
      });
      return;
    }

    if (authType === 'full' && (!username || !password)) {
      setTestResult({
        success: false,
        message: t('router.fillCredentials')
      });
      return;
    }

    if (authType === 'password' && !password) {
      setTestResult({
        success: false,
        message: t('router.enterPassword')
      });
      return;
    }

    setSaving(true);

    try {
      const result = await plugin.saveRouterCredentials({
        routerIp,
        brand: brand || 'Generic',
        username: authType === 'password' ? 'root' : (authType === 'none' ? '' : username),
        password: authType === 'none' ? '' : password
      });

      if (result.success) {
        await plugin.setActiveRouter({ id: result.id });
        onSuccess();
      } else {
        setTestResult({
          success: false,
          message: t('router.failedToSave')
        });
      }
    } catch (error: any) {
      setTestResult({
        success: false,
        message: error.message || 'Failed to save'
      });
    } finally {
      setSaving(false);
    }
  };

  return (
    <Dialog open={open} onOpenChange={onClose}>
      <DialogContent className="bg-[#0d120d] border-cyan-900/30 text-white max-w-md">
        <div className="flex items-center justify-between mb-4">
          <div className="flex items-center gap-3">
            <Router className="w-6 h-6 text-cyan-400" />
            <h2 className="text-xl font-semibold">{t('router.setup')}</h2>
          </div>
          <Button
            variant="ghost"
            size="sm"
            onClick={onClose}
            className="text-gray-400 hover:text-white"
          >
            <X className="w-5 h-5" />
          </Button>
        </div>

        <div className="space-y-4">
          <div>
            <Label htmlFor="routerIp" className="text-gray-300">
              {t('router.routerIpAddress')}
            </Label>
            <Input
              id="routerIp"
              type="text"
              value={routerIp}
              onChange={(e) => setRouterIp(e.target.value)}
              placeholder="192.168.10.1"
              className="bg-[#1a1f1a] border-cyan-900/30 text-white mt-1"
            />
            <p className="text-gray-500 text-xs mt-1">
              {t('router.routerIpPlaceholder')}
            </p>
          </div>

          <div>
            <Label htmlFor="brand" className="text-gray-300">
              {t('router.routerBrand')}
            </Label>
            <Select value={brand} onValueChange={handleBrandChange}>
              <SelectTrigger className="bg-[#1a1f1a] border-cyan-900/30 text-white mt-1">
                <SelectValue placeholder={t('router.selectBrand')} />
              </SelectTrigger>
              <SelectContent className="bg-[#1a1f1a] border-cyan-900/30 text-white">
                <SelectItem value="TP-Link">TP-Link</SelectItem>
                <SelectItem value="ASUS">ASUS</SelectItem>
                <SelectItem value="Netgear">Netgear</SelectItem>
                <SelectItem value="Linksys">Linksys</SelectItem>
                <SelectItem value="D-Link">D-Link</SelectItem>
                <SelectItem value="Cudy">Cudy</SelectItem>
                <SelectItem value="OpenWrt/LuCI">OpenWrt/LuCI</SelectItem>
                <SelectItem value="Huawei">Huawei</SelectItem>
                <SelectItem value="Xiaomi">Xiaomi</SelectItem>
                <SelectItem value="Tenda">Tenda</SelectItem>
                <SelectItem value="Ubiquiti">Ubiquiti</SelectItem>
                <SelectItem value="Generic">Generic</SelectItem>
              </SelectContent>
            </Select>
            {(brand === 'Cudy' || brand === 'OpenWrt/LuCI') && (
              <p className="text-cyan-400 text-xs mt-1">
                {t('router.cudyNote', { brand })}
              </p>
            )}
          </div>

          <div>
            <Label htmlFor="authType" className="text-gray-300">
              {t('router.authenticationType')}
            </Label>
            <Select value={authType} onValueChange={(v: any) => setAuthType(v)}>
              <SelectTrigger className="bg-[#1a1f1a] border-cyan-900/30 text-white mt-1">
                <SelectValue />
              </SelectTrigger>
              <SelectContent className="bg-[#1a1f1a] border-cyan-900/30 text-white">
                <SelectItem value="full">{t('router.usernameAndPassword')}</SelectItem>
                <SelectItem value="password">{t('router.passwordOnly')}</SelectItem>
                <SelectItem value="none">{t('router.noAuthentication')}</SelectItem>
              </SelectContent>
            </Select>
            <p className="text-gray-500 text-xs mt-1">
              {authType === 'password' && t('router.authTypeNote')}
              {authType === 'none' && t('router.noAuthNote')}
              {authType === 'full' && t('router.standardAuth')}
            </p>
          </div>

          {authType === 'full' && (
            <div>
              <Label htmlFor="username" className="text-gray-300">
                {t('router.username')}
              </Label>
              <Input
                id="username"
                type="text"
                value={username}
                onChange={(e) => setUsername(e.target.value)}
                placeholder="admin"
                className="bg-[#1a1f1a] border-cyan-900/30 text-white mt-1"
              />
            </div>
          )}

          {authType !== 'none' && (
            <div>
              <Label htmlFor="password" className="text-gray-300">
                {t('wifi.password')}
              </Label>
              <Input
                id="password"
                type="password"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
                placeholder={t('router.enterRouterPassword')}
                className="bg-[#1a1f1a] border-cyan-900/30 text-white mt-1"
              />
              <p className="text-gray-500 text-xs mt-1">
                {t('router.passwordEncrypted')}
              </p>
            </div>
          )}

          {testResult && (
            <div
              className={`p-3 rounded-lg border ${
                testResult.success
                  ? 'bg-emerald-900/20 border-emerald-500/50'
                  : 'bg-red-900/20 border-red-500/50'
              }`}
            >
              <div className="flex items-start gap-2">
                {testResult.success ? (
                  <CheckCircle className="w-5 h-5 text-emerald-400 flex-shrink-0 mt-0.5" />
                ) : (
                  <AlertCircle className="w-5 h-5 text-red-400 flex-shrink-0 mt-0.5" />
                )}
                <p
                  className={`text-sm ${
                    testResult.success ? 'text-emerald-400' : 'text-red-400'
                  }`}
                >
                  {testResult.message}
                </p>
              </div>
            </div>
          )}

          <div className="flex gap-3 pt-2">
            <Button
              onClick={handleTestConnection}
              disabled={testing || saving}
              variant="outline"
              className="flex-1 border-cyan-900/30 text-cyan-400 hover:bg-cyan-900/20"
            >
              {testing ? (
                <>
                  <Loader2 className="w-4 h-4 mr-2 animate-spin" />
                  {t('router.testing')}
                </>
              ) : (
                t('router.testConnection')
              )}
            </Button>

            <Button
              onClick={handleSave}
              disabled={testing || saving || !testResult?.success}
              className="flex-1 bg-cyan-600 hover:bg-cyan-700 text-white"
            >
              {saving ? (
                <>
                  <Loader2 className="w-4 h-4 mr-2 animate-spin" />
                  {t('router.saving')}
                </>
              ) : (
                t('router.saveAndConnect')
              )}
            </Button>
          </div>
        </div>
      </DialogContent>
    </Dialog>
  );
}
