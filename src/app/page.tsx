'use client'

import { useState, useEffect } from 'react'
import { AuthProvider, useAuth } from '@/contexts/AuthContext'
import dynamic from 'next/dynamic'

// Dynamically import components with no SSR
const AuthScreen = dynamic(() => import('@/components/AuthScreen'), {
  ssr: false
})

const ConsentScreen = dynamic(() => import('@/components/ConsentScreen'), {
  ssr: false
})

const MainApp = dynamic(() => import('@/components/MainApp'), {
  ssr: false
})

function AppContent() {
  const { isAuthenticated, loading: authLoading } = useAuth()
  const [hasConsent, setHasConsent] = useState(false)
  const [mounted, setMounted] = useState(false)

  useEffect(() => {
    setMounted(true)
    // Check consent from localStorage only on client side
    if (typeof window !== 'undefined') {
      try {
        const consent = localStorage.getItem('thirdeye_consent')
        if (consent === 'true') {
          setHasConsent(true)
        }
      } catch (error) {
        console.error('Error reading localStorage:', error)
      }
    }
  }, [])

  // Don't render anything until mounted to avoid hydration mismatch
  if (!mounted || authLoading) {
    return null // Return null instead of loading div to avoid hydration issues
  }

  // Flow: Auth → Consent → Main App
  if (!isAuthenticated) {
    return <AuthScreen />
  }

  if (!hasConsent) {
    return <ConsentScreen onConsent={() => setHasConsent(true)} />
  }

  return <MainApp />
}

export default function Home() {
  const [isClient, setIsClient] = useState(false)

  useEffect(() => {
    setIsClient(true)
  }, [])

  if (!isClient) {
    return null // Prevent SSR hydration issues
  }

  return (
    <AuthProvider>
      <AppContent />
    </AuthProvider>
  )
}

