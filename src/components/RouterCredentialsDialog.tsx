'use client'

import { useState } from 'react'
import {
  Dialog,
  DialogContent,
  DialogDescription,
  DialogFooter,
  DialogHeader,
  DialogTitle,
} from '@/components/ui/dialog'
import { Button } from '@/components/ui/button'
import { Input } from '@/components/ui/input'
import { Label } from '@/components/ui/label'
import { Alert, AlertDescription } from '@/components/ui/alert'
import { Loader2, Router, Info } from 'lucide-react'
import { useI18n } from '@/lib/i18n'

interface RouterCredentialsDialogProps {
  open: boolean
  onOpenChange: (open: boolean) => void
  onScanWithCredentials: (username: string, password: string) => Promise<void>
  routerIP?: string
}

export function RouterCredentialsDialog({
  open,
  onOpenChange,
  onScanWithCredentials,
  routerIP = '192.168.1.1'
}: RouterCredentialsDialogProps) {
  const { t } = useI18n()
  const [username, setUsername] = useState('')
  const [password, setPassword] = useState('')
  const [loading, setLoading] = useState(false)
  const [error, setError] = useState<string | null>(null)

  const handleScan = async () => {
    setLoading(true)
    setError(null)
    
    try {
      await onScanWithCredentials(username, password)
      onOpenChange(false)
    } catch (err) {
      setError(err instanceof Error ? err.message : t('wifi.failedToScanDevices'))
    } finally {
      setLoading(false)
    }
  }

  const commonCredentials = [
    { label: t('wifi.passwordOnlyNoUsername'), username: '', password: '' },
    { label: t('wifi.adminAdmin'), username: 'admin', password: 'admin' },
    { label: t('wifi.adminPassword'), username: 'admin', password: 'password' },
  ]

  return (
    <Dialog open={open} onOpenChange={onOpenChange}>
      <DialogContent className="sm:max-w-md max-h-[90vh] overflow-y-auto">
        <DialogHeader>
          <DialogTitle className="flex items-center gap-2 text-base">
            <Router className="h-4 w-4" />
            {t('wifi.routerAccess')}
          </DialogTitle>
          <DialogDescription className="text-xs">
            {t('wifi.enterPasswordForRouter')} {routerIP}
          </DialogDescription>
        </DialogHeader>

        <div className="space-y-3">
          <Alert className="py-2">
            <Info className="h-3 w-3" />
            <AlertDescription className="text-xs">
              {t('wifi.routerConnectionDesc')}
            </AlertDescription>
          </Alert>

          <div className="space-y-2">
            <Label htmlFor="username" className="text-sm">{t('wifi.usernameOptional')}</Label>
            <Input
              id="username"
              value={username}
              onChange={(e) => setUsername(e.target.value)}
              placeholder={t('wifi.leaveEmptyIfNotNeeded')}
              className="h-9 text-sm"
            />
          </div>

          <div className="space-y-2">
            <Label htmlFor="password" className="text-sm">{t('wifi.password')}</Label>
            <Input
              id="password"
              type="password"
              value={password}
              onChange={(e) => setPassword(e.target.value)}
              placeholder={t('wifi.enterRouterPassword')}
              className="h-9 text-sm"
            />
          </div>

          <div className="space-y-1">
            <Label className="text-xs text-muted-foreground">{t('wifi.quickFill')}</Label>
            <div className="grid grid-cols-1 gap-1">
              {commonCredentials.map((cred, index) => (
                <Button
                  key={index}
                  variant="ghost"
                  size="sm"
                  className="justify-start text-xs h-7"
                  onClick={() => {
                    setUsername(cred.username)
                    setPassword(cred.password)
                  }}
                >
                  {cred.label}
                </Button>
              ))}
            </div>
          </div>

          {error && (
            <Alert variant="destructive" className="py-2">
              <AlertDescription className="text-xs">{error}</AlertDescription>
            </Alert>
          )}
        </div>

        <DialogFooter className="gap-2 sm:gap-0">
          <Button variant="outline" onClick={() => onOpenChange(false)} size="sm" className="h-9">
            {t('common.cancel')}
          </Button>
          <Button onClick={handleScan} disabled={loading} size="sm" className="h-9">
            {loading && <Loader2 className="mr-2 h-3 w-3 animate-spin" />}
            {t('wifi.connect')}
          </Button>
        </DialogFooter>
      </DialogContent>
    </Dialog>
  )
}