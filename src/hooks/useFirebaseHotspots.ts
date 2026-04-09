import { useState, useEffect } from 'react'
import { ref, get, push, set, query, orderByChild, limitToLast } from 'firebase/database'
import { db } from '@/lib/firebase'
import { useAuth } from '@/contexts/AuthContext'
import { toast } from 'sonner'

interface Hotspot {
  id: string
  ssid: string
  location: string
  password?: string | null
  hasPassword: boolean
  isVerified: boolean
  category?: string | null
  categoryIcon?: string | null
  latitude?: number | null
  longitude?: number | null
  address?: string | null
  avgDownloadSpeed?: number | null
  avgUploadSpeed?: number | null
  avgPing?: number | null
  speedTestCount: number
  uploadedBy?: string | null
  createdAt: string
}

export function useFirebaseHotspots() {
  const [hotspots, setHotspots] = useState<Hotspot[]>([])
  const [loading, setLoading] = useState(false)
  const { user } = useAuth()

  const fetchHotspots = async () => {
    if (!user) return

    setLoading(true)
    try {
      const hotspotsRef = ref(db, 'hotspots')
      const snapshot = await get(hotspotsRef)

      if (snapshot.exists()) {
        const data = snapshot.val()
        const hotspotsArray = Object.keys(data).map(key => ({
          id: key,
          ...data[key]
        }))
        setHotspots(hotspotsArray)
      } else {
        setHotspots([])
      }
    } catch (error: any) {
      console.error('Error fetching hotspots:', error)
      toast.error('Failed to load hotspots', {
        description: error.message
      })
    } finally {
      setLoading(false)
    }
  }

  const addHotspot = async (hotspotData: Omit<Hotspot, 'id' | 'createdAt'>) => {
    if (!user) {
      toast.error('You must be signed in to add hotspots')
      return null
    }

    try {
      const hotspotsRef = ref(db, 'hotspots')
      const newHotspotRef = push(hotspotsRef)

      const hotspot = {
        ...hotspotData,
        uploadedBy: user.uid,
        createdAt: new Date().toISOString(),
        updatedAt: new Date().toISOString()
      }

      await set(newHotspotRef, hotspot)

      toast.success('Hotspot added successfully!')
      await fetchHotspots() // Refresh list

      return { id: newHotspotRef.key, ...hotspot }
    } catch (error: any) {
      console.error('Error adding hotspot:', error)
      toast.error('Failed to add hotspot', {
        description: error.message
      })
      return null
    }
  }

  useEffect(() => {
    if (user) {
      fetchHotspots()
    }
  }, [user])

  return {
    hotspots,
    loading,
    fetchHotspots,
    addHotspot
  }
}
