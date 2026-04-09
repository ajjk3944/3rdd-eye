import { NextRequest, NextResponse } from 'next/server'
import { PrismaClient } from '@prisma/client'

const prisma = new PrismaClient()

// GET - Fetch all device profiles
export async function GET() {
  try {
    const profiles = await prisma.deviceProfile.findMany({
      orderBy: { lastSeen: 'desc' }
    })
    
    // Parse JSON fields
    const parsedProfiles = profiles.map(profile => ({
      ...profile,
      typicalActiveHours: JSON.parse(profile.typicalActiveHours),
      knownDestinations: JSON.parse(profile.knownDestinations),
      firstSeen: profile.firstSeen.getTime(),
      lastSeen: profile.lastSeen.getTime()
    }))
    
    return NextResponse.json({ success: true, profiles: parsedProfiles })
  } catch (error) {
    console.error('Error fetching profiles:', error)
    return NextResponse.json({ 
      success: false, 
      error: 'Failed to fetch profiles', 
      profiles: [] 
    }, { status: 500 })
  }
}

// POST - Save device profiles
export async function POST(request: NextRequest) {
  try {
    const body = await request.json()
    const { profiles } = body

    if (!profiles || !Array.isArray(profiles)) {
      return NextResponse.json({ success: false, error: 'Invalid profiles data' }, { status: 400 })
    }

    // Upsert each profile
    for (const profile of profiles) {
      await prisma.deviceProfile.upsert({
        where: { macAddress: profile.macAddress },
        update: {
          deviceName: profile.deviceName,
          deviceType: profile.deviceType,
          avgUploadRate: profile.avgUploadRate,
          avgDownloadRate: profile.avgDownloadRate,
          avgConnectionCount: profile.avgConnectionCount,
          typicalActiveHours: JSON.stringify(profile.typicalActiveHours),
          knownDestinations: JSON.stringify(profile.knownDestinations),
          lastSeen: new Date(profile.lastSeen),
          totalObservations: profile.totalObservations
        },
        create: {
          macAddress: profile.macAddress,
          deviceName: profile.deviceName,
          deviceType: profile.deviceType,
          avgUploadRate: profile.avgUploadRate,
          avgDownloadRate: profile.avgDownloadRate,
          avgConnectionCount: profile.avgConnectionCount,
          typicalActiveHours: JSON.stringify(profile.typicalActiveHours),
          knownDestinations: JSON.stringify(profile.knownDestinations),
          firstSeen: new Date(profile.firstSeen),
          lastSeen: new Date(profile.lastSeen),
          totalObservations: profile.totalObservations
        }
      })
    }

    return NextResponse.json({ success: true })
  } catch (error) {
    console.error('Error saving profiles:', error)
    return NextResponse.json({ success: false, error: 'Failed to save profiles' }, { status: 500 })
  }
}

// DELETE - Clear a device profile
export async function DELETE(request: NextRequest) {
  try {
    const { searchParams } = new URL(request.url)
    const macAddress = searchParams.get('macAddress')

    if (!macAddress) {
      return NextResponse.json({ success: false, error: 'MAC address is required' }, { status: 400 })
    }

    await prisma.deviceProfile.delete({
      where: { macAddress }
    })

    return NextResponse.json({ success: true })
  } catch (error) {
    console.error('Error deleting profile:', error)
    return NextResponse.json({ success: false, error: 'Failed to delete profile' }, { status: 500 })
  }
}
