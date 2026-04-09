import { NextRequest, NextResponse } from 'next/server'
import { PrismaClient } from '@prisma/client'
import { encryptPassword, decryptPassword } from '@/lib/encryption'

const prisma = new PrismaClient()

// GET - Fetch all saved WiFi networks
export async function GET() {
  try {
    const networks = await prisma.savedWifiNetwork.findMany({
      orderBy: { lastConnectedAt: 'desc' }
    })
    
    // Decrypt passwords for client
    const decryptedNetworks = networks.map(network => ({
      ...network,
      password: network.encryptedPassword ? decryptPassword(network.encryptedPassword) : undefined,
      encryptedPassword: undefined // Don't send encrypted password to client
    }))
    
    return NextResponse.json({ success: true, networks: decryptedNetworks })
  } catch (error) {
    console.error('Error fetching saved networks:', error)
    // Always return JSON, never HTML
    return NextResponse.json({ 
      success: false, 
      error: error instanceof Error ? error.message : 'Failed to fetch networks. Database may not be initialized.', 
      networks: [] 
    }, { status: 500 })
  }
}

// POST - Save a new WiFi network
export async function POST(request: NextRequest) {
  try {
    const body = await request.json()
    const { ssid, password, security, bssid } = body

    console.log('Saving network:', { ssid, security, hasPassword: !!password })

    if (!ssid) {
      return NextResponse.json({ success: false, error: 'SSID is required' }, { status: 400 })
    }

    // Encrypt password
    const encryptedPassword = password ? encryptPassword(password) : null

    // Check if network already exists
    const existing = await prisma.savedWifiNetwork.findUnique({
      where: { ssid }
    })

    if (existing) {
      // Update existing network
      const updated = await prisma.savedWifiNetwork.update({
        where: { ssid },
        data: {
          encryptedPassword,
          security,
          bssid,
          lastConnectedAt: new Date(),
          isConnected: true
        }
      })
      
      console.log('Network updated:', updated.ssid)
      
      return NextResponse.json({ 
        success: true, 
        network: {
          ...updated,
          password: password,
          encryptedPassword: undefined
        }
      })
    }

    // Create new network
    const network = await prisma.savedWifiNetwork.create({
      data: {
        ssid,
        encryptedPassword,
        security,
        bssid,
        isConnected: true,
        addedAt: new Date(),
        lastConnectedAt: new Date()
      }
    })

    console.log('Network created:', network.ssid)

    return NextResponse.json({ 
      success: true, 
      network: {
        ...network,
        password: password,
        encryptedPassword: undefined
      }
    })
  } catch (error) {
    console.error('Error saving network:', error)
    // Always return JSON, never HTML
    return NextResponse.json({ 
      success: false, 
      error: error instanceof Error ? error.message : 'Failed to save network' 
    }, { status: 500 })
  }
}

// PATCH - Update network connection status
export async function PATCH(request: NextRequest) {
  try {
    const body = await request.json()
    const { ssid, isConnected } = body

    if (!ssid) {
      return NextResponse.json({ success: false, error: 'SSID is required' }, { status: 400 })
    }

    // Update all networks to not connected first
    await prisma.savedWifiNetwork.updateMany({
      data: { isConnected: false }
    })

    // Update the specified network
    const network = await prisma.savedWifiNetwork.update({
      where: { ssid },
      data: {
        isConnected,
        lastConnectedAt: isConnected ? new Date() : undefined
      }
    })

    return NextResponse.json({ 
      success: true, 
      network: {
        ...network,
        password: network.encryptedPassword ? decryptPassword(network.encryptedPassword) : undefined,
        encryptedPassword: undefined
      }
    })
  } catch (error) {
    console.error('Error updating network:', error)
    return NextResponse.json({ success: false, error: 'Failed to update network' }, { status: 500 })
  }
}

// DELETE - Forget a WiFi network (immediate, no confirmation)
export async function DELETE(request: NextRequest) {
  try {
    const { searchParams } = new URL(request.url)
    const ssid = searchParams.get('ssid')

    if (!ssid) {
      return NextResponse.json({ success: false, error: 'SSID is required' }, { status: 400 })
    }

    await prisma.savedWifiNetwork.delete({
      where: { ssid }
    })

    return NextResponse.json({ success: true, message: `Forgot ${ssid}` })
  } catch (error) {
    console.error('Error deleting network:', error)
    return NextResponse.json({ success: false, error: 'Failed to forget network' }, { status: 500 })
  }
}
