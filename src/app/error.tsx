'use client'

import { useEffect } from 'react'
import { Button } from '@/components/ui/button'
import { AlertCircle, RefreshCw } from 'lucide-react'

export default function Error({
  error,
  reset,
}: {
  error: Error & { digest?: string }
  reset: () => void
}) {
  useEffect(() => {
    console.error('Application error:', error)
  }, [error])

  return (
    <div className="min-h-screen bg-gradient-to-br from-slate-950 via-slate-900 to-slate-950 flex items-center justify-center p-4">
      <div className="max-w-md w-full space-y-6 text-center">
        <div className="inline-flex items-center justify-center w-20 h-20 rounded-full bg-red-500/20 mb-4">
          <AlertCircle className="w-10 h-10 text-red-400" />
        </div>
        
        <div className="space-y-2">
          <h1 className="text-2xl font-bold text-white">Something went wrong</h1>
          <p className="text-slate-400">
            The app encountered an unexpected error. Please try restarting.
          </p>
        </div>

        <div className="space-y-3">
          <Button
            onClick={reset}
            className="w-full bg-emerald-600 hover:bg-emerald-700 text-white"
          >
            <RefreshCw className="w-4 h-4 mr-2" />
            Try Again
          </Button>
          
          <Button
            onClick={() => {
              if (typeof window !== 'undefined') {
                localStorage.clear()
                window.location.reload()
              }
            }}
            variant="outline"
            className="w-full border-slate-700 text-slate-300 hover:bg-slate-800"
          >
            Clear Data & Restart
          </Button>
        </div>

        {error.message && (
          <details className="text-left">
            <summary className="text-xs text-slate-500 cursor-pointer hover:text-slate-400">
              Error details
            </summary>
            <pre className="mt-2 text-xs text-red-400 bg-slate-950/50 p-3 rounded overflow-auto max-h-40">
              {error.message}
            </pre>
          </details>
        )}
      </div>
    </div>
  )
}
