import { NextRequest, NextResponse } from 'next/server'
import { PrismaClient } from '@prisma/client'

const prisma = new PrismaClient()

// GET - Fetch all known devices
export async function GET() {
  try {
    const devices = await prisma.knownDevice.findMany({
      orderBy: { lastSeen: 'desc' }
    })
    
    return NextResponse.json({ success: true, devices })
  } catch (error: any) {
    console.error('Error fetching known devices:', error)
    return NextResponse.json({ 
      success: false, 
      error: error.message || 'Failed to fetch known devices', 
      devices: [] 
    }, { status: 500 })
  }
}

// POST - Create new known device
export async function POST(request: NextRequest) {
  try {
    const body = await request.json()
    const { device } = body

    if (!device || !device.macAddress) {
      return NextResponse.json({ success: false, error: 'Invalid device data' }, { status: 400 })
    }

    // Check if device already exists
    const existing = await prisma.knownDevice.findUnique({
      where: { macAddress: device.macAddress }
    })

    if (existing) {
      // Update existing device
      const updatedDevice = await prisma.knownDevice.update({
        where: { macAddress: device.macAddress },
        data: {
          ipAddress: device.ipAddress,
          hostname: device.hostname,
          deviceName: device.deviceName,
          vendor: device.vendor,
          isTrusted: device.isTrusted || false,
          lastSeen: device.lastSeen ? new Date(device.lastSeen) : new Date()
        }
      })
      return NextResponse.json({ success: true, device: updatedDevice })
    }

    const newDevice = await prisma.knownDevice.create({
      data: {
        macAddress: device.macAddress,
        ipAddress: device.ipAddress,
        hostname: device.hostname,
        deviceName: device.deviceName,
        vendor: device.vendor,
        isTrusted: device.isTrusted || false,
        firstSeen: device.firstSeen ? new Date(device.firstSeen) : new Date(),
        lastSeen: device.lastSeen ? new Date(device.lastSeen) : new Date()
      }
    })

    return NextResponse.json({ success: true, device: newDevice })
  } catch (error: any) {
    console.error('Error creating known device:', error)
    return NextResponse.json({ 
      success: false, 
      error: error.message || 'Failed to create known device' 
    }, { status: 500 })
  }
}

// PUT - Update known device
export async function PUT(request: NextRequest) {
  try {
    const body = await request.json()
    const { device } = body

    if (!device || !device.macAddress) {
      return NextResponse.json({ success: false, error: 'Invalid device data' }, { status: 400 })
    }

    const updatedDevice = await prisma.knownDevice.update({
      where: { macAddress: device.macAddress },
      data: {
        lastSeen: new Date(device.lastSeen || Date.now())
      }
    })

    return NextResponse.json({ success: true, device: updatedDevice })
  } catch (error: any) {
    console.error('Error updating known device:', error)
    return NextResponse.json({ 
      success: false, 
      error: error.message || 'Failed to update known device' 
    }, { status: 500 })
  }
}
