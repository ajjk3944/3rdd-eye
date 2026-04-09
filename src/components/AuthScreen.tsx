'use client'

import { useState, useEffect } from 'react'
import { Card, CardContent, CardDescription, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Input } from '@/components/ui/input'
import { Label } from '@/components/ui/label'
import { useAuth } from '@/contexts/AuthContext'
import { Eye, EyeOff, Users, WifiOff } from 'lucide-react'
import { isOnline } from '@/lib/offline-auth'
import { useI18n } from '@/lib/i18n'

export default function AuthScreen() {
  const { t } = useI18n()
  const [mode, setMode] = useState<'login' | 'signup'>('login')
  const [email, setEmail] = useState('')
  const [password, setPassword] = useState('')
  const [username, setUsername] = useState('')
  const [showPassword, setShowPassword] = useState(false)
  const [loading, setLoading] = useState(false)
  const [offline, setOffline] = useState(false)

  const { signIn, signUp, signInAsGuest } = useAuth()

  useEffect(() => {
    // Check online status
    const checkOnline = async () => {
      const online = await isOnline()
      setOffline(!online)
    }
    
    checkOnline()
    
    // Check periodically
    const interval = setInterval(checkOnline, 5000)
    return () => clearInterval(interval)
  }, [])

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault()
    setLoading(true)

    try {
      if (mode === 'login') {
        await signIn(email, password)
      } else {
        if (!username.trim()) {
          throw new Error(t('auth.usernameRequired'))
        }
        await signUp(email, password, username)
      }
    } catch (error) {
      console.error('Auth error:', error)
    } finally {
      setLoading(false)
    }
  }

  const handleGuestSignIn = async () => {
    setLoading(true)
    try {
      await signInAsGuest()
    } catch (error) {
      console.error('Guest sign in error:', error)
    } finally {
      setLoading(false)
    }
  }

  return (
    <div className="min-h-screen bg-gradient-to-br from-slate-950 via-slate-900 to-slate-950 flex items-center justify-center p-4">
      <div className="w-full max-w-md space-y-6">
        {/* Logo & Title */}
        <div className="text-center space-y-3">
          <div className="flex justify-center">
            <div className="relative w-24 h-24 rounded-2xl overflow-hidden">
              <img 
                src="/3rd_eye.jpeg" 
                alt="ThirdEye Logo" 
                className="w-full h-full object-cover"
              />
            </div>
          </div>
          <h1 className="text-3xl font-bold text-white">ThirdEye</h1>
        </div>

        {/* Offline Indicator */}
        {offline && (
          <div className="bg-orange-500/20 border border-orange-500/50 rounded-lg p-3 flex items-center gap-3">
            <WifiOff className="w-5 h-5 text-orange-400" />
            <div className="flex-1">
              <p className="text-sm font-medium text-orange-300">{t('auth.offlineMode')}</p>
              <p className="text-xs text-orange-400/80">{t('auth.limitedFeatures')}</p>
            </div>
          </div>
        )}

        {/* Auth Card */}
        <Card className="bg-slate-900/50 border-emerald-500/30 backdrop-blur-sm">
          <CardHeader>
            <CardTitle className="text-white">
              {mode === 'login' ? t('auth.welcomeBack') : t('auth.createAccount')}
            </CardTitle>
            <CardDescription className="text-slate-400">
              {offline 
                ? t('auth.canStillSignIn')
                : mode === 'login'
                ? t('auth.signInToContribute')
                : t('auth.joinCommunity')}
            </CardDescription>
          </CardHeader>
          <CardContent className="space-y-4">
            <form onSubmit={handleSubmit} className="space-y-4">
              {mode === 'signup' && (
                <div className="space-y-2">
                  <Label htmlFor="username" className="text-slate-300">
                    {t('auth.username')}
                  </Label>
                  <Input
                    id="username"
                    type="text"
                    value={username}
                    onChange={(e) => setUsername(e.target.value)}
                    placeholder={t('auth.chooseUsername')}
                    className="bg-slate-800/50 border-emerald-500/30 text-white"
                    required
                  />
                </div>
              )}

              <div className="space-y-2">
                <Label htmlFor="email" className="text-slate-300">
                  {t('auth.email')}
                </Label>
                <Input
                  id="email"
                  type="email"
                  value={email}
                  onChange={(e) => setEmail(e.target.value)}
                  placeholder={t('auth.yourEmail')}
                  className="bg-slate-800/50 border-emerald-500/30 text-white"
                  required
                />
              </div>

              <div className="space-y-2">
                <Label htmlFor="password" className="text-slate-300">
                  {t('auth.password')}
                </Label>
                <div className="relative">
                  <Input
                    id="password"
                    type={showPassword ? 'text' : 'password'}
                    value={password}
                    onChange={(e) => setPassword(e.target.value)}
                    placeholder="••••••••"
                    className="bg-slate-800/50 border-emerald-500/30 text-white pr-10"
                    required
                  />
                  <button
                    type="button"
                    onClick={() => setShowPassword(!showPassword)}
                    className="absolute right-3 top-1/2 -translate-y-1/2 text-slate-400 hover:text-white"
                  >
                    {showPassword ? <EyeOff className="w-4 h-4" /> : <Eye className="w-4 h-4" />}
                  </button>
                </div>
              </div>

              <Button
                type="submit"
                disabled={loading}
                className="w-full bg-emerald-500 hover:bg-emerald-600 text-white"
              >
                {loading ? t('auth.pleaseWait') : mode === 'login' ? t('auth.signIn') : t('auth.signUp')}
              </Button>
            </form>

            {/* Divider */}
            <div className="relative">
              <div className="absolute inset-0 flex items-center">
                <div className="w-full border-t border-slate-700"></div>
              </div>
              <div className="relative flex justify-center text-xs">
                <span className="bg-slate-900 px-2 text-slate-400">OR</span>
              </div>
            </div>

            {/* Guest Sign In */}
            <Button
              type="button"
              variant="outline"
              onClick={handleGuestSignIn}
              disabled={loading}
              className="w-full border-emerald-500/30 text-emerald-400 hover:bg-emerald-500/10"
            >
              <Users className="w-4 h-4 mr-2" />
              {t('auth.continueAsGuest')}
            </Button>

            {offline && (
              <p className="text-xs text-center text-orange-400/80">
                {t('auth.guestModeOffline')}
              </p>
            )}

            {/* Toggle Mode */}
            <div className="text-center text-sm">
              <span className="text-slate-400">
                {mode === 'login' ? t('auth.dontHaveAccount') : t('auth.alreadyHaveAccount')}
              </span>
              <button
                type="button"
                onClick={() => setMode(mode === 'login' ? 'signup' : 'login')}
                className="text-emerald-400 hover:text-emerald-300 font-medium"
              >
                {mode === 'login' ? t('auth.signUp') : t('auth.signIn')}
              </button>
            </div>
          </CardContent>
        </Card>
      </div>
    </div>
  )
}

