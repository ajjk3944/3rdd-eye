// WiFi Sharing API - Backend for crowdsourced WiFi database
// Handles user contributions, verifications, and retrieval

import { NextRequest, NextResponse } from 'next/server'
import { PrismaClient } from '@prisma/client'
import { detectCategory } from '@/lib/category-detector'

const prisma = new PrismaClient()

// GET - Fetch nearby shared WiFi networks
export async function GET(request: NextRequest) {
  try {
    const { searchParams } = new URL(request.url)
    const lat = parseFloat(searchParams.get('lat') || '0')
    const lng = parseFloat(searchParams.get('lng') || '0')
    const radius = parseInt(searchParams.get('radius') || '5000') // meters

    // Calculate bounding box for efficient query
    const latDelta = radius / 111000 // 1 degree latitude ≈ 111km
    const lngDelta = radius / (111000 * Math.cos(lat * Math.PI / 180))

    const networks = await prisma.$queryRaw`
      SELECT 
        id, ssid, password, latitude, longitude, address,
        signal_strength as signalStrength,
        security, comment, rating, shared_by as sharedBy,
        verified, verification_count as verificationCount,
        created_at as createdAt, updated_at as updatedAt,
        (
          6371000 * acos(
            cos(radians(${lat})) * cos(radians(latitude)) *
            cos(radians(longitude) - radians(${lng})) +
            sin(radians(${lat})) * sin(radians(latitude))
          )
        ) as distance
      FROM shared_wifi
      WHERE latitude BETWEEN ${lat - latDelta} AND ${lat + latDelta}
        AND longitude BETWEEN ${lng - lngDelta} AND ${lng + lngDelta}
      HAVING distance <= ${radius}
      ORDER BY distance ASC
      LIMIT 100
    `

    return NextResponse.json({ success: true, networks })
  } catch (error) {
    console.error('Error fetching WiFi networks:', error)
    return NextResponse.json({ success: false, error: 'Failed to fetch networks' }, { status: 500 })
  }
}

// POST - Share a new WiFi network
export async function POST(request: NextRequest) {
  try {
    const body = await request.json()
    const { ssid, password, latitude, longitude, address, signalStrength, security, comment, rating, sharedBy, location } = body

    // Validation
    if (!ssid || !latitude || !longitude) {
      return NextResponse.json({ success: false, error: 'Missing required fields' }, { status: 400 })
    }

    // Detect category
    const categoryInfo = detectCategory(address || '', ssid, location || '')

    // Check if network already exists at this location
    const existing = await prisma.$queryRaw`
      SELECT id FROM shared_wifi
      WHERE ssid = ${ssid}
        AND ABS(latitude - ${latitude}) < 0.0001
        AND ABS(longitude - ${longitude}) < 0.0001
      LIMIT 1
    `

    if (Array.isArray(existing) && existing.length > 0) {
      return NextResponse.json({ success: false, error: 'Network already shared at this location' }, { status: 409 })
    }

    // Create new shared network with category
    const network = await prisma.$executeRaw`
      INSERT INTO shared_wifi (
        ssid, password, latitude, longitude, address,
        signal_strength, security, comment, rating, shared_by,
        verified, verification_count, category, category_icon,
        created_at, updated_at
      ) VALUES (
        ${ssid}, ${password}, ${latitude}, ${longitude}, ${address},
        ${signalStrength || -60}, ${security || 'WPA2'}, ${comment || ''}, ${rating || 3}, ${sharedBy || 'Anonymous'},
        false, 0, ${categoryInfo.category}, ${categoryInfo.icon},
        datetime('now'), datetime('now')
      )
    `

    return NextResponse.json({ success: true, message: 'Network shared successfully!', category: categoryInfo })
  } catch (error) {
    console.error('Error sharing WiFi network:', error)
    return NextResponse.json({ success: false, error: 'Failed to share network' }, { status: 500 })
  }
}

// PATCH - Verify a shared network
export async function PATCH(request: NextRequest) {
  try {
    const body = await request.json()
    const { networkId, action } = body

    if (action === 'verify') {
      await prisma.$executeRaw`
        UPDATE shared_wifi
        SET verification_count = verification_count + 1,
            verified = CASE WHEN verification_count + 1 >= 3 THEN true ELSE verified END,
            updated_at = datetime('now')
        WHERE id = ${networkId}
      `

      return NextResponse.json({ success: true, message: 'Network verified!' })
    }

    if (action === 'report') {
      await prisma.$executeRaw`
        UPDATE shared_wifi
        SET verification_count = verification_count - 1,
            verified = false,
            updated_at = datetime('now')
        WHERE id = ${networkId}
      `

      return NextResponse.json({ success: true, message: 'Network reported' })
    }

    return NextResponse.json({ success: false, error: 'Invalid action' }, { status: 400 })
  } catch (error) {
    console.error('Error updating network:', error)
    return NextResponse.json({ success: false, error: 'Failed to update network' }, { status: 500 })
  }
}

// DELETE - Remove a shared network (only by original sharer)
export async function DELETE(request: NextRequest) {
  try {
    const { searchParams } = new URL(request.url)
    const networkId = searchParams.get('id')
    const anonId = searchParams.get('anonId')

    if (!networkId || !anonId) {
      return NextResponse.json({ success: false, error: 'Missing parameters' }, { status: 400 })
    }

    await prisma.$executeRaw`
      DELETE FROM shared_wifi
      WHERE id = ${networkId} AND shared_by = ${anonId}
    `

    return NextResponse.json({ success: true, message: 'Network deleted' })
  } catch (error) {
    console.error('Error deleting network:', error)
    return NextResponse.json({ success: false, error: 'Failed to delete network' }, { status: 500 })
  }
}
