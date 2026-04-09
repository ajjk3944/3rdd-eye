'use client'

import { createContext, useContext, useEffect, useState } from 'react'
import {
  User,
  signInWithEmailAndPassword,
  createUserWithEmailAndPassword,
  signOut as firebaseSignOut,
  onAuthStateChanged,
  signInAnonymously
} from 'firebase/auth'
import { ref, get, set, update } from 'firebase/database'
import { auth, db } from '@/lib/firebase'
import { toast } from 'sonner'
import {
  isOnline,
  signInOffline,
  signUpOffline,
  signInAsGuestOffline,
  getOfflineUser,
  signOutOffline,
  hasOfflineCredentials,
  type OfflineUser
} from '@/lib/offline-auth'

interface UserProfile {
  uid: string
  email: string | null
  username: string
  isGuest: boolean
  isOffline?: boolean
  createdAt: Date
  updatedAt: Date
}

interface AuthContextType {
  user: User | null
  userProfile: UserProfile | null
  loading: boolean
  isOfflineMode: boolean
  signIn: (email: string, password: string) => Promise<void>
  signUp: (email: string, password: string, username: string) => Promise<void>
  signInAsGuest: () => Promise<void>
  signOut: () => Promise<void>
  updateProfile: (data: Partial<UserProfile>) => Promise<void>
  isAuthenticated: boolean
  isGuest: boolean
}

const AuthContext = createContext<AuthContextType | undefined>(undefined)

export function AuthProvider({ children }: { children: React.ReactNode }) {
  const [user, setUser] = useState<User | null>(null)
  const [userProfile, setUserProfile] = useState<UserProfile | null>(null)
  const [loading, setLoading] = useState(true)
  const [isOfflineMode, setIsOfflineMode] = useState(false)

  useEffect(() => {
    // Check if we're offline and have a stored user
    const checkOfflineUser = async () => {
      const online = await isOnline()
      setIsOfflineMode(!online)
      
      if (!online) {
        const offlineUser = getOfflineUser()
        if (offlineUser) {
          setUserProfile({
            uid: offlineUser.uid,
            email: offlineUser.email,
            username: offlineUser.username,
            isGuest: offlineUser.isGuest,
            isOffline: true,
            createdAt: new Date(offlineUser.createdAt),
            updatedAt: new Date(offlineUser.updatedAt)
          })
          setLoading(false)
          return
        }
      }
    }
    
    checkOfflineUser()
    
    // Set up Firebase auth listener
    const unsubscribe = onAuthStateChanged(auth, async (user) => {
      setUser(user)
      
      if (user) {
        try {
          // Fetch user profile from Realtime Database
          const profileRef = ref(db, `users/${user.uid}`)
          const snapshot = await get(profileRef)
          if (snapshot.exists()) {
            setUserProfile(snapshot.val() as UserProfile)
          }
        } catch (error) {
          console.error('Failed to fetch user profile:', error)
          // If Firebase fails, check offline user
          const offlineUser = getOfflineUser()
          if (offlineUser) {
            setUserProfile({
              uid: offlineUser.uid,
              email: offlineUser.email,
              username: offlineUser.username,
              isGuest: offlineUser.isGuest,
              isOffline: true,
              createdAt: new Date(offlineUser.createdAt),
              updatedAt: new Date(offlineUser.updatedAt)
            })
          }
        }
      } else {
        setUserProfile(null)
      }
      
      setLoading(false)
    })

    return unsubscribe
  }, [])

  const signIn = async (email: string, password: string) => {
    try {
      const online = await isOnline()
      
      if (!online) {
        // Offline sign in
        setIsOfflineMode(true)
        const offlineUser = await signInOffline(email, password)
        setUserProfile({
          uid: offlineUser.uid,
          email: offlineUser.email,
          username: offlineUser.username,
          isGuest: false,
          isOffline: true,
          createdAt: new Date(offlineUser.createdAt),
          updatedAt: new Date(offlineUser.updatedAt)
        })
        toast.success('Welcome back! (Offline Mode)', {
          description: 'You are signed in offline. Some features may be limited.'
        })
        return
      }
      
      // Online sign in with Firebase
      setIsOfflineMode(false)
      await signInWithEmailAndPassword(auth, email, password)
      toast.success('Welcome back!')
    } catch (error: any) {
      console.error('Sign in error:', error)
      toast.error('Sign in failed', {
        description: error.message
      })
      throw error
    }
  }

  const signUp = async (email: string, password: string, username: string) => {
    try {
      const online = await isOnline()
      
      if (!online) {
        // Offline sign up
        setIsOfflineMode(true)
        const offlineUser = await signUpOffline(email, password, username)
        setUserProfile({
          uid: offlineUser.uid,
          email: offlineUser.email,
          username: offlineUser.username,
          isGuest: false,
          isOffline: true,
          createdAt: new Date(offlineUser.createdAt),
          updatedAt: new Date(offlineUser.updatedAt)
        })
        toast.success('Account created! (Offline Mode)', {
          description: 'Your account is stored locally. Connect to internet to sync.'
        })
        return
      }
      
      // Online sign up with Firebase
      setIsOfflineMode(false)
      const userCredential = await createUserWithEmailAndPassword(auth, email, password)
      
      // Create user profile in Realtime Database
      const profile: UserProfile = {
        uid: userCredential.user.uid,
        email: userCredential.user.email,
        username,
        isGuest: false,
        createdAt: new Date(),
        updatedAt: new Date()
      }
      
      await set(ref(db, `users/${userCredential.user.uid}`), profile)
      setUserProfile(profile)
      
      toast.success('Account created successfully!')
    } catch (error: any) {
      console.error('Sign up error:', error)
      toast.error('Sign up failed', {
        description: error.message
      })
      throw error
    }
  }

  const signInAsGuest = async () => {
    try {
      const online = await isOnline()
      
      if (!online) {
        // Offline guest sign in
        setIsOfflineMode(true)
        const offlineUser = signInAsGuestOffline()
        setUserProfile({
          uid: offlineUser.uid,
          email: null,
          username: offlineUser.username,
          isGuest: true,
          isOffline: true,
          createdAt: new Date(offlineUser.createdAt),
          updatedAt: new Date(offlineUser.updatedAt)
        })
        toast.success('Signed in as guest (Offline Mode)', {
          description: 'You can use offline features like camera detector.'
        })
        return
      }
      
      // Online guest sign in with Firebase
      setIsOfflineMode(false)
      const userCredential = await signInAnonymously(auth)
      
      // Create guest profile
      const profile: UserProfile = {
        uid: userCredential.user.uid,
        email: null,
        username: `Guest_${userCredential.user.uid.slice(0, 6)}`,
        isGuest: true,
        createdAt: new Date(),
        updatedAt: new Date()
      }
      
      await set(ref(db, `users/${userCredential.user.uid}`), profile)
      setUserProfile(profile)
      
      toast.success('Signed in as guest')
    } catch (error: any) {
      console.error('Guest sign in error:', error)
      toast.error('Guest sign in failed', {
        description: error.message
      })
      throw error
    }
  }

  const signOut = async () => {
    try {
      if (isOfflineMode) {
        // Offline sign out
        signOutOffline()
        setUserProfile(null)
        toast.success('Signed out')
        return
      }
      
      // Online sign out
      await firebaseSignOut(auth)
      setUserProfile(null)
      toast.success('Signed out successfully')
    } catch (error: any) {
      console.error('Sign out error:', error)
      toast.error('Sign out failed')
      throw error
    }
  }

  const updateProfile = async (data: Partial<UserProfile>) => {
    if (!user && !userProfile) return

    try {
      if (isOfflineMode) {
        // Update offline profile
        const offlineUser = getOfflineUser()
        if (offlineUser) {
          const updated = {
            ...offlineUser,
            ...data,
            updatedAt: new Date().toISOString()
          }
          localStorage.setItem('thirdeye_offline_user', JSON.stringify(updated))
          setUserProfile(prev => prev ? { ...prev, ...data } : null)
          toast.success('Profile updated (Offline)')
        }
        return
      }
      
      // Update Firebase profile
      if (user) {
        await update(ref(db, `users/${user.uid}`), {
          ...data,
          updatedAt: new Date()
        })
        
        setUserProfile(prev => prev ? { ...prev, ...data } : null)
        toast.success('Profile updated')
      }
    } catch (error: any) {
      console.error('Update profile error:', error)
      toast.error('Failed to update profile')
      throw error
    }
  }

  const value = {
    user,
    userProfile,
    loading,
    isOfflineMode,
    signIn,
    signUp,
    signInAsGuest,
    signOut,
    updateProfile,
    isAuthenticated: !!user || !!userProfile,
    isGuest: userProfile?.isGuest || false
  }

  return <AuthContext.Provider value={value}>{children}</AuthContext.Provider>
}

export function useAuth() {
  const context = useContext(AuthContext)
  if (context === undefined) {
    throw new Error('useAuth must be used within an AuthProvider')
  }
  return context
}
