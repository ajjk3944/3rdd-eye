import { NextRequest, NextResponse } from 'next/server'
import { collection, query, where, getDocs, addDoc, serverTimestamp, orderBy, limit } from 'firebase/firestore'
import { db } from '@/lib/firebase'

// GET /api/hotspots-firebase - Get hotspots from Firebase
export async function GET(request: NextRequest) {
  try {
    const { searchParams } = new URL(request.url)
    const lat = searchParams.get('lat')
    const lng = searchParams.get('lng')
    const category = searchParams.get('category')
    const search = searchParams.get('search')

    let q = query(collection(db, 'hotspots'), orderBy('createdAt', 'desc'), limit(100))

    if (category && category !== 'all') {
      q = query(q, where('category', '==', category))
    }

    const querySnapshot = await getDocs(q)
    let hotspots = querySnapshot.docs.map(doc => ({
      id: doc.id,
      ...doc.data()
    }))

    // Client-side filtering for location and search
    if (lat && lng) {
      const latitude = parseFloat(lat)
      const longitude = parseFloat(lng)
      const radiusKm = 10

      hotspots = hotspots.filter((h: any) => {
        if (!h.latitude || !h.longitude) return false
        const distance = calculateDistance(latitude, longitude, h.latitude, h.longitude)
        return distance <= radiusKm
      })
    }

    if (search) {
      hotspots = hotspots.filter((h: any) =>
        h.ssid?.toLowerCase().includes(search.toLowerCase()) ||
        h.location?.toLowerCase().includes(search.toLowerCase()) ||
        h.address?.toLowerCase().includes(search.toLowerCase())
      )
    }

    return NextResponse.json({ success: true, hotspots })
  } catch (error: any) {
    console.error('Error fetching hotspots:', error)
    return NextResponse.json(
      { success: false, error: error.message },
      { status: 500 }
    )
  }
}

// POST /api/hotspots-firebase - Add new hotspot to Firebase
export async function POST(request: NextRequest) {
  try {
    const body = await request.json()
    const {
      ssid,
      location,
      password,
      hasPassword,
      category,
      categoryIcon,
      latitude,
      longitude,
      address,
      uploadedBy
    } = body

    if (!ssid || !location) {
      return NextResponse.json(
        { success: false, error: 'SSID and location are required' },
        { status: 400 }
      )
    }

    const hotspot = {
      ssid,
      location,
      password: password || null,
      hasPassword: hasPassword || false,
      isVerified: false,
      category: category || 'Public',
      categoryIcon: categoryIcon || '📍',
      latitude: latitude || null,
      longitude: longitude || null,
      address: address || null,
      uploadedBy: uploadedBy || 'Anonymous',
      avgDownloadSpeed: null,
      avgUploadSpeed: null,
      avgPing: null,
      speedTestCount: 0,
      createdAt: serverTimestamp(),
      updatedAt: serverTimestamp()
    }

    const docRef = await addDoc(collection(db, 'hotspots'), hotspot)

    return NextResponse.json({
      success: true,
      hotspot: { id: docRef.id, ...hotspot }
    })
  } catch (error: any) {
    console.error('Error creating hotspot:', error)
    return NextResponse.json(
      { success: false, error: error.message },
      { status: 500 }
    )
  }
}

// Helper function
function calculateDistance(lat1: number, lon1: number, lat2: number, lon2: number): number {
  const R = 6371
  const dLat = toRad(lat2 - lat1)
  const dLon = toRad(lon2 - lon1)
  const a =
    Math.sin(dLat / 2) * Math.sin(dLat / 2) +
    Math.cos(toRad(lat1)) * Math.cos(toRad(lat2)) *
    Math.sin(dLon / 2) * Math.sin(dLon / 2)
  const c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a))
  return R * c
}

function toRad(degrees: number): number {
  return degrees * (Math.PI / 180)
}
