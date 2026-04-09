'use client'

import { useState, useEffect } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Input } from '@/components/ui/input'
import { Label } from '@/components/ui/label'
import { Badge } from '@/components/ui/badge'
import { Switch } from '@/components/ui/switch'
import {
  Dialog,
  DialogContent,
  DialogDescription,
  DialogHeader,
  DialogTitle,
} from '@/components/ui/dialog'
import { useAuth } from '@/contexts/AuthContext'
import { useFirebaseHotspots } from '@/hooks/useFirebaseHotspots'
import { useTheme } from '@/lib/theme-context'
import { User, Mail, Shield, LogOut, Edit2, Save, X, RotateCcw, FileText, Github, Palette, Check, Download, Upload, Database, FileDown, Loader2, Globe } from 'lucide-react'
import { toast } from 'sonner'
import { getDataExport, DataStats, isCapacitor } from '@/lib/native-plugins'
import ExportModal from './ExportModal'
import LanguageSelector from './LanguageSelector'
import RegionalWifiInfo from './RegionalWifiInfo'
import { useI18n } from '@/lib/i18n'

export default function SettingsTab() {
  const { user, userProfile, signOut, updateProfile, isGuest } = useAuth()
  const { hotspots } = useFirebaseHotspots()
  const { theme, setTheme, availableThemes } = useTheme()
  const { t } = useI18n()
  const [editing, setEditing] = useState(false)
  const [username, setUsername] = useState(userProfile?.username || '')
  const [loading, setLoading] = useState(false)
  const [showTermsDialog, setShowTermsDialog] = useState(false)
  const [showExportModal, setShowExportModal] = useState(false)
  const [dataStats, setDataStats] = useState<DataStats | null>(null)
  const [backupLoading, setBackupLoading] = useState(false)
  const [restoreLoading, setRestoreLoading] = useState(false)

  // Load data stats
  useEffect(() => {
    loadDataStats()
  }, [])

  const loadDataStats = async () => {
    if (!isCapacitor) return
    const plugin = getDataExport()
    if (!plugin) return

    try {
      const stats = await plugin.getDataStats()
      setDataStats(stats)
    } catch (error) {
      console.error('Error loading data stats:', error)
    }
  }

  // Calculate user's hotspot count
  const userHotspotCount = hotspots.filter(h => h.uploadedBy === user?.uid).length

  const handleSave = async () => {
    if (!username.trim()) {
      toast.error(t('settings.usernameEmpty'))
      return
    }

    setLoading(true)
    try {
      await updateProfile({ username })
      setEditing(false)
    } catch (error) {
      console.error('Update error:', error)
    } finally {
      setLoading(false)
    }
  }

  const handleSignOut = async () => {
    try {
      await signOut()
    } catch (error) {
      console.error('Sign out error:', error)
    }
  }

  const handleReset = async () => {
    try {
      localStorage.clear()
      sessionStorage.clear()
      toast.success(t('settings.appDataCleared'))
      setTimeout(() => {
        window.location.reload()
      }, 1500)
    } catch (error) {
      console.error('Reset error:', error)
      toast.error(t('settings.failedToReset'))
    }
  }

  const handleAboutAuthor = () => {
    window.open('https://github.com/aroyslipk', '_blank')
  }

  const handleThemeChange = (themeId: string) => {
    setTheme(themeId)
    toast.success(t('settings.themeChanged'), {
      description: `${t('settings.switchedTo')} ${availableThemes.find(t => t.id === themeId)?.name}`
    })
  }

  const handleBackup = async () => {
    const plugin = getDataExport()
    if (!plugin) {
      toast.error(t('settings.backupOnlyDevice'))
      return
    }

    setBackupLoading(true)
    try {
      const result = await plugin.backupData()
      if (result.success && result.fileName) {
        toast.success(t('settings.backupCreated'), {
          description: `${t('settings.savedAs')} ${result.fileName}`
        })
        
        // Offer to share
        if (result.filePath) {
          setTimeout(async () => {
            try {
              await plugin.shareFile({ filePath: result.filePath!, mimeType: 'application/json' })
            } catch (e) {
              console.error('Share error:', e)
            }
          }, 500)
        }
      } else {
        toast.error(t('settings.backupFailed'))
      }
    } catch (error) {
      console.error('Backup error:', error)
      toast.error(t('settings.backupFailed'), {
        description: error instanceof Error ? error.message : t('common.unknown')
      })
    } finally {
      setBackupLoading(false)
    }
  }

  const handleRestore = async () => {
    const plugin = getDataExport()
    if (!plugin) {
      toast.error(t('settings.restoreOnlyDevice'))
      return
    }

    // Show warning
    const confirmed = window.confirm(t('settings.restoreConfirm'))
    if (!confirmed) return

    setRestoreLoading(true)
    try {
      // Pick file
      const pickResult = await plugin.pickFile({ mimeType: 'application/json' })
      if (!pickResult.success || !pickResult.filePath) {
        if (pickResult.error !== 'cancelled') {
          toast.error(t('settings.failedToSelect'))
        }
        setRestoreLoading(false)
        return
      }

      // Restore data
      const result = await plugin.restoreData({ filePath: pickResult.filePath })
      if (result.success && result.restoredItems) {
        const items = result.restoredItems
        toast.success(t('settings.dataRestored'), {
          description: `WiFi: ${items.wifiScans}, Network: ${items.networkScans}, Speed: ${items.speedTests}`
        })
        loadDataStats()
      } else {
        toast.error(t('settings.restoreFailed'))
      }
    } catch (error) {
      console.error('Restore error:', error)
      toast.error(t('settings.restoreFailed'), {
        description: error instanceof Error ? error.message : t('common.unknown')
      })
    } finally {
      setRestoreLoading(false)
    }
  }

  return (
    <div className="p-4 space-y-4">
      {/* Appearance Card */}
      <Card className="bg-slate-800/50 border-emerald-500/20">
        <CardHeader>
          <CardTitle className="text-white flex items-center gap-2">
            <Palette className="w-5 h-5 text-emerald-400" />
            {t('settings.appearance')}
          </CardTitle>
        </CardHeader>
        <CardContent className="space-y-4">
          <div className="space-y-2">
            <Label className="text-slate-300">{t('settings.accentColor')}</Label>
            <div className="grid grid-cols-4 gap-3">
              {availableThemes.map((t) => (
                <button
                  key={t.id}
                  onClick={() => handleThemeChange(t.id)}
                  className="relative w-12 h-12 rounded-full transition-all hover:scale-110"
                  style={{ backgroundColor: t.primary }}
                  title={t.name}
                >
                  {theme.id === t.id && (
                    <div className="absolute inset-0 flex items-center justify-center">
                      <Check className="w-6 h-6 text-white drop-shadow-lg" />
                    </div>
                  )}
                  {theme.id === t.id && (
                    <div
                      className="absolute -inset-1 rounded-full"
                      style={{ border: `2px solid ${t.primary}`, opacity: 0.5 }}
                    />
                  )}
                </button>
              ))}
            </div>
            <p className="text-sm text-slate-400 mt-2">
              {t('settings.selectedTheme')}: <span className="text-white">{theme.name}</span>
            </p>
          </div>

          {/* Preview Section */}
          <div className="space-y-2">
            <Label className="text-slate-300">{t('settings.preview')}</Label>
            <div className="p-4 rounded-lg bg-slate-800/50 border border-emerald-500/20 space-y-3">
              <Button
                size="sm"
                className="bg-emerald-500 hover:bg-emerald-600 text-white"
              >
                {t('settings.sampleButton')}
              </Button>
              <div className="p-2 rounded border border-emerald-500/30 text-sm text-slate-300">
                {t('settings.sampleBorder')}
              </div>
              <Badge className="bg-emerald-500/20 text-emerald-400 border-emerald-500/30">
                {t('settings.sampleBadge')}
              </Badge>
            </div>
          </div>
        </CardContent>
      </Card>

      {/* Data & Export Card */}
      {isCapacitor && (
        <Card className="bg-slate-800/50 border-cyan-500/20">
          <CardHeader>
            <CardTitle className="text-white flex items-center gap-2">
              <Database className="w-5 h-5 text-cyan-400" />
              {t('settings.dataExport')}
            </CardTitle>
          </CardHeader>
          <CardContent className="space-y-3">
            {/* Export Scan Results */}
            <button
              onClick={() => setShowExportModal(true)}
              className="w-full p-4 rounded-lg bg-slate-800/50 border border-cyan-500/20 hover:bg-slate-800 hover:border-cyan-500/40 transition-all text-left"
            >
              <div className="flex items-center gap-3">
                <div className="w-10 h-10 rounded-full bg-cyan-500/20 flex items-center justify-center">
                  <FileDown className="w-5 h-5 text-cyan-400" />
                </div>
                <div className="flex-1">
                  <p className="font-medium text-white">{t('settings.exportScanResults')}</p>
                  <p className="text-sm text-slate-400">{t('settings.exportDescription')}</p>
                </div>
                <span className="text-cyan-400">›</span>
              </div>
            </button>

            {/* Backup Data */}
            <button
              onClick={handleBackup}
              disabled={backupLoading}
              className="w-full p-4 rounded-lg bg-slate-800/50 border border-cyan-500/20 hover:bg-slate-800 hover:border-cyan-500/40 transition-all text-left disabled:opacity-50"
            >
              <div className="flex items-center gap-3">
                <div className="w-10 h-10 rounded-full bg-cyan-500/20 flex items-center justify-center">
                  {backupLoading ? (
                    <Loader2 className="w-5 h-5 text-cyan-400 animate-spin" />
                  ) : (
                    <Download className="w-5 h-5 text-cyan-400" />
                  )}
                </div>
                <div className="flex-1">
                  <p className="font-medium text-white">{t('settings.backupData')}</p>
                  <p className="text-sm text-slate-400">{t('settings.backupDescription')}</p>
                </div>
                <span className="text-cyan-400">›</span>
              </div>
            </button>

            {/* Data Stats */}
            {dataStats && (
              <div className="pt-3 border-t border-slate-700">
                <p className="text-sm text-slate-400 mb-2">{t('settings.dataOnDevice')}</p>
                <div className="flex flex-wrap gap-2 text-xs">
                  <span className="px-2 py-1 rounded bg-cyan-500/10 text-cyan-400 border border-cyan-500/20">
                    WiFi: {dataStats.wifiScans}
                  </span>
                  <span className="px-2 py-1 rounded bg-cyan-500/10 text-cyan-400 border border-cyan-500/20">
                    Network: {dataStats.networkScans}
                  </span>
                  <span className="px-2 py-1 rounded bg-cyan-500/10 text-cyan-400 border border-cyan-500/20">
                    Speed: {dataStats.speedTests}
                  </span>
                  <span className="px-2 py-1 rounded bg-cyan-500/10 text-cyan-400 border border-cyan-500/20">
                    {t('common.total')}: {dataStats.totalSize}
                  </span>
                </div>
              </div>
            )}
          </CardContent>
        </Card>
      )}

      {/* Language & Region Card */}
      <Card className="bg-slate-800/50 border-purple-500/20">
        <CardHeader>
          <CardTitle className="text-white flex items-center gap-2">
            <Globe className="w-5 h-5 text-purple-400" />
            {t('settings.languageRegion')}
          </CardTitle>
        </CardHeader>
        <CardContent className="space-y-3">
          <LanguageSelector />
          <RegionalWifiInfo />
        </CardContent>
      </Card>

      {/* Profile Card */}
      <Card className="bg-slate-800/50 border-emerald-500/20">
        <CardHeader>
          <CardTitle className="text-white flex items-center gap-2">
            <User className="w-5 h-5 text-emerald-400" />
            {t('settings.profile')}
          </CardTitle>
        </CardHeader>
        <CardContent className="space-y-4">
          {/* Avatar */}
          <div className="flex items-center gap-4">
            <div className="w-16 h-16 rounded-full bg-emerald-500/20 flex items-center justify-center">
              <User className="w-8 h-8 text-emerald-400" />
            </div>
            <div className="flex-1">
              <div className="flex items-center gap-2">
                <h3 className="text-lg font-semibold text-white">{userProfile?.username}</h3>
                {isGuest && (
                  <Badge variant="outline" className="border-amber-500/30 text-amber-400">
                    {t('settings.guest')}
                  </Badge>
                )}
              </div>
              <p className="text-sm text-slate-400">{userProfile?.email || t('settings.noEmail')}</p>
            </div>
          </div>

          {/* Username Edit */}
          <div className="space-y-2">
            <Label className="text-slate-300">{t('settings.username')}</Label>
            {editing ? (
              <div className="flex gap-2">
                <Input
                  value={username}
                  onChange={(e) => setUsername(e.target.value)}
                  className="bg-slate-800/50 border-emerald-500/30 text-white"
                  placeholder={t('settings.enterUsername')}
                />
                <Button
                  size="sm"
                  onClick={handleSave}
                  disabled={loading}
                  className="bg-emerald-500 hover:bg-emerald-600"
                >
                  <Save className="w-4 h-4" />
                </Button>
                <Button
                  size="sm"
                  variant="outline"
                  onClick={() => {
                    setEditing(false)
                    setUsername(userProfile?.username || '')
                  }}
                  className="border-slate-600"
                >
                  <X className="w-4 h-4" />
                </Button>
              </div>
            ) : (
              <div className="flex items-center justify-between p-3 rounded-lg bg-slate-800/50 border border-emerald-500/20">
                <span className="text-white">{userProfile?.username}</span>
                <Button
                  size="sm"
                  variant="ghost"
                  onClick={() => setEditing(true)}
                  className="text-emerald-400 hover:text-emerald-300"
                >
                  <Edit2 className="w-4 h-4" />
                </Button>
              </div>
            )}
          </div>

          {/* Email */}
          <div className="space-y-2">
            <Label className="text-slate-300">{t('settings.email')}</Label>
            <div className="flex items-center gap-2 p-3 rounded-lg bg-slate-800/50 border border-emerald-500/20">
              <Mail className="w-4 h-4 text-slate-400" />
              <span className="text-white">{userProfile?.email || t('settings.notSetGuest')}</span>
            </div>
          </div>

          {/* Account Type */}
          <div className="space-y-2">
            <Label className="text-slate-300">{t('settings.accountType')}</Label>
            <div className="flex items-center gap-2 p-3 rounded-lg bg-slate-800/50 border border-emerald-500/20">
              <Shield className="w-4 h-4 text-slate-400" />
              <span className="text-white">{isGuest ? t('settings.guestAccount') : t('settings.fullAccount')}</span>
            </div>
          </div>

          {/* Guest Upgrade Notice */}
          {isGuest && (
            <div className="p-4 rounded-lg bg-amber-500/10 border border-amber-500/30">
              <p className="text-sm text-amber-400">
                <span className="font-semibold">{t('settings.guestAccountLabel')}</span> {t('settings.guestNotice')}
              </p>
            </div>
          )}

          {/* Action Buttons */}
          <div className="flex gap-2">
            <Button
              onClick={handleSignOut}
              variant="outline"
              className="flex-1 border-red-500/30 text-red-400 hover:bg-red-500/10"
            >
              <LogOut className="w-4 h-4 mr-2" />
              {t('settings.signOut')}
            </Button>
            <Button
              onClick={handleReset}
              variant="outline"
              className="flex-1 border-orange-500/30 text-orange-400 hover:bg-orange-500/10"
            >
              <RotateCcw className="w-4 h-4 mr-2" />
              {t('settings.reset')}
            </Button>
          </div>
        </CardContent>
      </Card>

      {/* Stats Card */}
      <Card className="bg-slate-800/50 border-emerald-500/20">
        <CardHeader>
          <CardTitle className="text-white">{t('settings.yourStats')}</CardTitle>
        </CardHeader>
        <CardContent>
          <div className="grid grid-cols-1 gap-4">
            <div className="p-3 rounded-lg bg-slate-800/50 border border-emerald-500/20">
              <p className="text-2xl font-bold text-emerald-400">{userHotspotCount}</p>
              <p className="text-xs text-slate-400">{t('settings.hotspotsAdded')}</p>
            </div>
          </div>
        </CardContent>
      </Card>

      {/* Legal & Info */}
      <Card className="bg-slate-800/50 border-emerald-500/20">
        <CardContent className="pt-6 space-y-2">
          <Button
            onClick={() => setShowTermsDialog(true)}
            variant="outline"
            className="w-full bg-slate-800/50 border-emerald-500/30 text-emerald-400 hover:bg-emerald-500/10 hover:border-emerald-500/50"
          >
            <FileText className="w-4 h-4 mr-2" />
            {t('settings.termsConditions')}
          </Button>
          <Button
            onClick={handleAboutAuthor}
            variant="outline"
            className="w-full bg-slate-800/50 border-emerald-500/30 text-emerald-400 hover:bg-emerald-500/10 hover:border-emerald-500/50"
          >
            <Github className="w-4 h-4 mr-2" />
            {t('settings.aboutAuthor')}
          </Button>
        </CardContent>
      </Card>

      {/* Terms & Conditions Dialog */}
      <Dialog open={showTermsDialog} onOpenChange={setShowTermsDialog}>
        <DialogContent className="bg-slate-900 border-emerald-500/30 text-white max-w-2xl max-h-[80vh] overflow-y-auto">
          <DialogHeader>
            <DialogTitle className="text-2xl font-bold text-emerald-400">
              {t('settings.termsTitle')}
            </DialogTitle>
            <DialogDescription className="text-slate-400">
              {t('settings.termsSubtitle')}
            </DialogDescription>
          </DialogHeader>

          <div className="space-y-4 text-slate-300">
            <section>
              <h3 className="text-lg font-semibold text-white mb-2">{t('settings.acceptanceOfTerms')}</h3>
              <p className="text-sm leading-relaxed">
                {t('settings.acceptanceText')}
              </p>
            </section>

            <section>
              <h3 className="text-lg font-semibold text-white mb-2">{t('settings.useOfService')}</h3>
              <p className="text-sm leading-relaxed mb-2">
                {t('settings.useOfServiceText')}
              </p>
              <ul className="list-disc list-inside text-sm space-y-1 ml-4">
                <li>{t('settings.lawfulPurposes')}</li>
                <li>{t('settings.noUnauthorizedScanning')}</li>
                <li>{t('settings.respectPrivacy')}</li>
                <li>{t('settings.noMalicious')}</li>
              </ul>
            </section>

            <section>
              <h3 className="text-lg font-semibold text-white mb-2">{t('settings.permissionsPrivacy')}</h3>
              <p className="text-sm leading-relaxed">
                {t('settings.permissionsText')}
              </p>
            </section>

            <section>
              <h3 className="text-lg font-semibold text-white mb-2">{t('settings.userResponsibilities')}</h3>
              <p className="text-sm leading-relaxed">
                {t('settings.responsibilitiesText')}
              </p>
            </section>

            <section>
              <h3 className="text-lg font-semibold text-white mb-2">{t('settings.disclaimer')}</h3>
              <p className="text-sm leading-relaxed">
                {t('settings.disclaimerText')}
              </p>
            </section>

            <section>
              <h3 className="text-lg font-semibold text-white mb-2">{t('settings.modifications')}</h3>
              <p className="text-sm leading-relaxed">
                {t('settings.modificationsText')}
              </p>
            </section>

            <section>
              <h3 className="text-lg font-semibold text-white mb-2">{t('settings.contact')}</h3>
              <p className="text-sm leading-relaxed">
                {t('settings.contactText')}
              </p>
            </section>

            <div className="pt-4 border-t border-slate-700">
              <p className="text-xs text-slate-500 text-center">
                {t('settings.lastUpdated')} {new Date().toLocaleDateString()}
              </p>
            </div>
          </div>

          <div className="flex justify-end pt-4">
            <Button
              onClick={() => setShowTermsDialog(false)}
              className="bg-emerald-500 hover:bg-emerald-600"
            >
              {t('settings.iUnderstand')}
            </Button>
          </div>
        </DialogContent>
      </Dialog>

      {/* Export Modal */}
      <ExportModal
        open={showExportModal}
        onOpenChange={setShowExportModal}
        stats={dataStats}
      />
    </div>
  )
}
