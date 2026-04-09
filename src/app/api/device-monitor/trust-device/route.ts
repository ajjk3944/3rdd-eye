import { NextRequest, NextResponse } from 'next/server'
import { PrismaClient } from '@prisma/client'

const prisma = new PrismaClient()

// POST - Trust or untrust a device
export async function POST(request: NextRequest) {
  try {
    const body = await request.json()
    const { macAddress, isTrusted } = body

    if (!macAddress) {
      return NextResponse.json({ success: false, error: 'MAC address required' }, { status: 400 })
    }

    const device = await prisma.knownDevice.update({
      where: { macAddress },
      data: { isTrusted: isTrusted !== false }
    })

    return NextResponse.json({ success: true, device })
  } catch (error: any) {
    console.error('Error trusting device:', error)
    return NextResponse.json({ 
      success: false, 
      error: error.message || 'Failed to trust device' 
    }, { status: 500 })
  }
}
