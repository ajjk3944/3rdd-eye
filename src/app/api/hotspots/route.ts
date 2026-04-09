import { NextRequest, NextResponse } from 'next/server'
import { PrismaClient } from '@prisma/client'

const prisma = new PrismaClient()

// GET /api/hotspots - Get all hotspots or filter by location
export async function GET(request: NextRequest) {
  try {
    const { searchParams } = new URL(request.url)
    const lat = searchParams.get('lat')
    const lng = searchParams.get('lng')
    const radius = searchParams.get('radius') || '5' // km
    const category = searchParams.get('category')
    const search = searchParams.get('search')

    let hotspots

    if (lat && lng) {
      // Filter by location radius (simplified - in production use PostGIS or similar)
      const latitude = parseFloat(lat)
      const longitude = parseFloat(lng)
      const radiusKm = parseFloat(radius)

      hotspots = await prisma.hotspot.findMany({
        where: {
          AND: [
            category ? { category } : {},
            search ? {
              OR: [
                { ssid: { contains: search } },
                { location: { contains: search } },
                { address: { contains: search } }
              ]
            } : {}
          ]
        },
        include: {
          speedTests: {
            orderBy: { testedAt: 'desc' },
            take: 1
          }
        },
        orderBy: { createdAt: 'desc' }
      })

      // Filter by radius (haversine formula)
      hotspots = hotspots.filter(h => {
        if (!h.latitude || !h.longitude) return false
        const distance = calculateDistance(latitude, longitude, h.latitude, h.longitude)
        return distance <= radiusKm
      })
    } else {
      // Get all hotspots
      hotspots = await prisma.hotspot.findMany({
        where: {
          AND: [
            category ? { category } : {},
            search ? {
              OR: [
                { ssid: { contains: search } },
                { location: { contains: search } },
                { address: { contains: search } }
              ]
            } : {}
          ]
        },
        include: {
          speedTests: {
            orderBy: { testedAt: 'desc' },
            take: 1
          }
        },
        orderBy: { createdAt: 'desc' },
        take: 100
      })
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

// POST /api/hotspots - Add new hotspot
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

    const hotspot = await prisma.hotspot.create({
      data: {
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
        uploadedBy: uploadedBy || 'Anonymous'
      }
    })

    return NextResponse.json({ success: true, hotspot })
  } catch (error: any) {
    console.error('Error creating hotspot:', error)
    return NextResponse.json(
      { success: false, error: error.message },
      { status: 500 }
    )
  }
}

// Helper function to calculate distance between two coordinates (Haversine formula)
function calculateDistance(lat1: number, lon1: number, lat2: number, lon2: number): number {
  const R = 6371 // Earth's radius in km
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
