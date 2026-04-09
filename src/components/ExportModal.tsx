'use client'

import { useState } from 'react'
import { Dialog, DialogContent, DialogHeader, DialogTitle } from '@/components/ui/dialog'
import { Button } from '@/components/ui/button'
import { Checkbox } from '@/components/ui/checkbox'
import { Label } from '@/components/ui/label'
import { RadioGroup, RadioGroupItem } from '@/components/ui/radio-group'
import { FileText, Share2, FolderOpen, Loader2, CheckCircle2 } from 'lucide-react'
import { toast } from 'sonner'
import { getDataExport, DataStats } from '@/lib/native-plugins'
import { useI18n } from '@/lib/i18n'

interface ExportModalProps {
  open: boolean
  onOpenChange: (open: boolean) => void
  stats: DataStats | null
}

export default function ExportModal({ open, onOpenChange, stats }: ExportModalProps) {
  const { t } = useI18n()
  const [selectedTypes, setSelectedTypes] = useState<string[]>(['wifi', 'network', 'speed', 'saved_wifi'])
  const [format, setFormat] = useState<'pdf' | 'csv'>('pdf')
  const [exporting, setExporting] = useState(false)
  const [exportResult, setExportResult] = useState<{ filePath: string; fileName: string } | null>(null)

  const handleToggleType = (type: string) => {
    setSelectedTypes(prev =>
      prev.includes(type) ? prev.filter(t => t !== type) : [...prev, type]
    )
  }

  const handleExport = async () => {
    if (selectedTypes.length === 0) {
      toast.error(t('exportData.selectAtLeastOne'))
      return
    }

    const plugin = getDataExport()
    if (!plugin) {
      toast.error(t('exportData.exportOnlyDevice'))
      return
    }

    setExporting(true)
    try {
      const result = format === 'pdf'
        ? await plugin.exportPDF({ dataTypes: selectedTypes })
        : await plugin.exportCSV({ dataTypes: selectedTypes })

      if (result.success && result.filePath && result.fileName) {
        setExportResult({ filePath: result.filePath, fileName: result.fileName })
        toast.success(t('exportData.exportSuccess'), {
          description: `${t('settings.savedAs')} ${result.fileName}`
        })
      } else {
        toast.error(t('settings.backupFailed'))
      }
    } catch (error) {
      console.error('Export error:', error)
      toast.error(t('settings.backupFailed'), {
        description: error instanceof Error ? error.message : t('common.unknown')
      })
    } finally {
      setExporting(false)
    }
  }

  const handleShare = async () => {
    if (!exportResult) return

    const plugin = getDataExport()
    if (!plugin) return

    try {
      const mimeType = format === 'pdf' ? 'application/pdf' : 'text/csv'
      await plugin.shareFile({ filePath: exportResult.filePath, mimeType })
    } catch (error) {
      console.error('Share error:', error)
      toast.error(t('exportData.failedToShare'))
    }
  }

  const handleReset = () => {
    setExportResult(null)
    setSelectedTypes(['wifi', 'network', 'speed', 'saved_wifi'])
    setFormat('pdf')
  }

  return (
    <Dialog open={open} onOpenChange={onOpenChange}>
      <DialogContent className="bg-slate-900 border-cyan-500/30 text-white max-w-md">
        <DialogHeader>
          <DialogTitle className="text-xl font-bold text-cyan-400">
            {t('settings.exportScanResults')}
          </DialogTitle>
        </DialogHeader>

        {!exportResult ? (
          <div className="space-y-6">
            {/* Data Type Selection */}
            <div className="space-y-3">
              <Label className="text-slate-300">{t('exportData.selectData')}:</Label>
              
              <div className="space-y-2">
                <div className="flex items-center gap-3 p-3 rounded-lg bg-slate-800/50 border border-cyan-500/20">
                  <Checkbox
                    id="wifi"
                    checked={selectedTypes.includes('wifi')}
                    onCheckedChange={() => handleToggleType('wifi')}
                  />
                  <label htmlFor="wifi" className="flex-1 cursor-pointer">
                    <span className="text-white">{t('exportData.wifiScans')}</span>
                    <span className="text-sm text-slate-400 ml-2">
                      ({stats?.wifiScans || 0} {t('exportData.results')})
                    </span>
                  </label>
                </div>

                <div className="flex items-center gap-3 p-3 rounded-lg bg-slate-800/50 border border-cyan-500/20">
                  <Checkbox
                    id="network"
                    checked={selectedTypes.includes('network')}
                    onCheckedChange={() => handleToggleType('network')}
                  />
                  <label htmlFor="network" className="flex-1 cursor-pointer">
                    <span className="text-white">{t('exportData.networkScans')}</span>
                    <span className="text-sm text-slate-400 ml-2">
                      ({stats?.networkScans || 0} {t('exportData.results')})
                    </span>
                  </label>
                </div>

                <div className="flex items-center gap-3 p-3 rounded-lg bg-slate-800/50 border border-cyan-500/20">
                  <Checkbox
                    id="speed"
                    checked={selectedTypes.includes('speed')}
                    onCheckedChange={() => handleToggleType('speed')}
                  />
                  <label htmlFor="speed" className="flex-1 cursor-pointer">
                    <span className="text-white">{t('exportData.speedTests')}</span>
                    <span className="text-sm text-slate-400 ml-2">
                      ({stats?.speedTests || 0} {t('exportData.results')})
                    </span>
                  </label>
                </div>

                <div className="flex items-center gap-3 p-3 rounded-lg bg-slate-800/50 border border-cyan-500/20">
                  <Checkbox
                    id="saved_wifi"
                    checked={selectedTypes.includes('saved_wifi')}
                    onCheckedChange={() => handleToggleType('saved_wifi')}
                  />
                  <label htmlFor="saved_wifi" className="flex-1 cursor-pointer">
                    <span className="text-white">{t('exportData.savedWifi')}</span>
                    <span className="text-sm text-slate-400 ml-2">
                      ({stats?.savedWifi || 0} {t('exportData.networks')})
                    </span>
                  </label>
                </div>
              </div>
            </div>

            {/* Format Selection */}
            <div className="space-y-3">
              <Label className="text-slate-300">{t('exportData.format')}:</Label>
              <RadioGroup value={format} onValueChange={(v) => setFormat(v as 'pdf' | 'csv')}>
                <div className="flex items-center gap-3 p-3 rounded-lg bg-slate-800/50 border border-cyan-500/20">
                  <RadioGroupItem value="pdf" id="pdf" />
                  <label htmlFor="pdf" className="flex-1 cursor-pointer">
                    <span className="text-white">PDF</span>
                    <span className="text-sm text-slate-400 ml-2">
                      ({t('exportData.formattedReport')})
                    </span>
                  </label>
                </div>
                <div className="flex items-center gap-3 p-3 rounded-lg bg-slate-800/50 border border-cyan-500/20">
                  <RadioGroupItem value="csv" id="csv" />
                  <label htmlFor="csv" className="flex-1 cursor-pointer">
                    <span className="text-white">CSV</span>
                    <span className="text-sm text-slate-400 ml-2">
                      ({t('exportData.rawData')})
                    </span>
                  </label>
                </div>
              </RadioGroup>
            </div>

            {/* Export Button */}
            <Button
              onClick={handleExport}
              disabled={exporting || selectedTypes.length === 0}
              className="w-full bg-cyan-500 hover:bg-cyan-600 text-white"
            >
              {exporting ? (
                <>
                  <Loader2 className="w-4 h-4 mr-2 animate-spin" />
                  {t('exportData.exporting')}
                </>
              ) : (
                <>
                  <FileText className="w-4 h-4 mr-2" />
                  {t('exportData.exportNow')}
                </>
              )}
            </Button>
          </div>
        ) : (
          <div className="space-y-6">
            {/* Success Message */}
            <div className="flex flex-col items-center gap-4 py-6">
              <div className="w-16 h-16 rounded-full bg-green-500/20 flex items-center justify-center">
                <CheckCircle2 className="w-8 h-8 text-green-400" />
              </div>
              <div className="text-center">
                <p className="text-lg font-semibold text-white mb-1">{t('exportData.exportSuccess')}</p>
                <p className="text-sm text-slate-400 break-all px-4 mb-2">
                  {exportResult.fileName}
                </p>
                <div className="bg-slate-800/50 border border-cyan-500/20 rounded-lg p-3 mt-3">
                  <div className="flex items-start gap-2">
                    <FolderOpen className="w-4 h-4 text-cyan-400 mt-0.5 flex-shrink-0" />
                    <div className="text-left">
                      <p className="text-xs text-slate-400 mb-1">{t('exportData.savedTo')}</p>
                      <p className="text-xs text-white font-mono break-all">
                        {exportResult.filePath || t('exportData.downloadsFolder')}
                      </p>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            {/* Action Buttons */}
            <div className="space-y-2">
              <Button
                onClick={handleShare}
                className="w-full bg-cyan-500 hover:bg-cyan-600 text-white"
              >
                <Share2 className="w-4 h-4 mr-2" />
                {t('exportData.shareFile')}
              </Button>
              <Button
                onClick={handleReset}
                variant="outline"
                className="w-full border-slate-600 text-slate-300 hover:bg-slate-800"
              >
                {t('exportData.exportAnother')}
              </Button>
            </div>
          </div>
        )}
      </DialogContent>
    </Dialog>
  )
}
