import { NextRequest, NextResponse } from 'next/server'
import { PrismaClient } from '@prisma/client'

const prisma = new PrismaClient()

// GET - Fetch device alerts
export async function GET(request: NextRequest) {
  try {
    const { searchParams } = new URL(request.url)
    const macAddress = searchParams.get('macAddress')
    const limit = parseInt(searchParams.get('limit') || '50')
    const acknowledged = searchParams.get('acknowledged')

    const where: any = {}
    if (macAddress) {
      where.macAddress = macAddress
    }
    if (acknowledged !== null) {
      where.acknowledged = acknowledged === 'true'
    }

    const alerts = await prisma.deviceAlert.findMany({
      where,
      orderBy: { detectedAt: 'desc' },
      take: limit
    })

    return NextResponse.json({ success: true, alerts })
  } catch (error) {
    console.error('Error fetching alerts:', error)
    return NextResponse.json({ 
      success: false, 
      error: 'Failed to fetch alerts', 
      alerts: [] 
    }, { status: 500 })
  }
}

// POST - Create device alert
export async function POST(request: NextRequest) {
  try {
    const body = await request.json()
    const { alert } = body

    if (!alert || !alert.macAddress) {
      return NextResponse.json({ success: false, error: 'Invalid alert data' }, { status: 400 })
    }

    const newAlert = await prisma.deviceAlert.create({
      data: {
        macAddress: alert.macAddress,
        deviceName: alert.deviceName,
        alertType: alert.alertType,
        severity: alert.severity,
        message: alert.message,
        details: alert.details,
        detectedAt: alert.detectedAt ? new Date(alert.detectedAt) : new Date(),
        acknowledged: alert.acknowledged || false
      }
    })

    return NextResponse.json({ success: true, alert: newAlert })
  } catch (error: any) {
    console.error('Error creating alert:', error)
    return NextResponse.json({ 
      success: false, 
      error: error.message || 'Failed to create alert' 
    }, { status: 500 })
  }
}

// PATCH - Acknowledge alert
export async function PATCH(request: NextRequest) {
  try {
    const body = await request.json()
    const { alertId, acknowledged } = body

    if (!alertId) {
      return NextResponse.json({ success: false, error: 'Alert ID required' }, { status: 400 })
    }

    const alert = await prisma.deviceAlert.update({
      where: { id: alertId },
      data: { acknowledged: acknowledged !== false }
    })

    return NextResponse.json({ success: true, alert })
  } catch (error: any) {
    console.error('Error acknowledging alert:', error)
    return NextResponse.json({ 
      success: false, 
      error: error.message || 'Failed to acknowledge alert' 
    }, { status: 500 })
  }
}

// DELETE - Clear all alerts
export async function DELETE() {
  try {
    await prisma.deviceAlert.deleteMany({})
    return NextResponse.json({ success: true })
  } catch (error) {
    console.error('Error clearing alerts:', error)
    return NextResponse.json({ 
      success: false, 
      error: 'Failed to clear alerts' 
    }, { status: 500 })
  }
}
