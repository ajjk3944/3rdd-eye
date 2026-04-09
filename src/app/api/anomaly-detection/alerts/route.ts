import { NextRequest, NextResponse } from 'next/server'
import { PrismaClient } from '@prisma/client'

const prisma = new PrismaClient()

// GET - Fetch anomaly alerts
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

    const alerts = await prisma.anomalyAlert.findMany({
      where,
      orderBy: { detectedAt: 'desc' },
      take: limit
    })
    
    // Parse JSON fields
    const parsedAlerts = alerts.map(alert => ({
      ...alert,
      metrics: JSON.parse(alert.metrics),
      detectedAt: alert.detectedAt.getTime()
    }))
    
    return NextResponse.json({ success: true, alerts: parsedAlerts })
  } catch (error) {
    console.error('Error fetching alerts:', error)
    return NextResponse.json({ 
      success: false, 
      error: 'Failed to fetch alerts', 
      alerts: [] 
    }, { status: 500 })
  }
}

// POST - Create anomaly alert
export async function POST(request: NextRequest) {
  try {
    const body = await request.json()
    const { alerts } = body

    if (!alerts || !Array.isArray(alerts)) {
      return NextResponse.json({ success: false, error: 'Invalid alerts data' }, { status: 400 })
    }

    // Create alerts
    const created = await prisma.anomalyAlert.createMany({
      data: alerts.map((alert: any) => ({
        id: alert.id,
        macAddress: alert.macAddress,
        deviceName: alert.deviceName,
        deviceType: alert.deviceType,
        anomalyType: alert.anomalyType,
        severity: alert.severity,
        description: alert.description,
        detectedAt: new Date(alert.detectedAt),
        metrics: JSON.stringify(alert.metrics),
        details: alert.details
      }))
    })

    return NextResponse.json({ success: true, count: created.count })
  } catch (error) {
    console.error('Error creating alerts:', error)
    return NextResponse.json({ success: false, error: 'Failed to create alerts' }, { status: 500 })
  }
}

// PATCH - Acknowledge alert
export async function PATCH(request: NextRequest) {
  try {
    const body = await request.json()
    const { id, acknowledged } = body

    if (!id) {
      return NextResponse.json({ success: false, error: 'Alert ID is required' }, { status: 400 })
    }

    const alert = await prisma.anomalyAlert.update({
      where: { id },
      data: { acknowledged: acknowledged !== false }
    })

    return NextResponse.json({ success: true, alert })
  } catch (error) {
    console.error('Error updating alert:', error)
    return NextResponse.json({ success: false, error: 'Failed to update alert' }, { status: 500 })
  }
}

// DELETE - Clear alerts
export async function DELETE(request: NextRequest) {
  try {
    const { searchParams } = new URL(request.url)
    const macAddress = searchParams.get('macAddress')

    if (macAddress) {
      await prisma.anomalyAlert.deleteMany({
        where: { macAddress }
      })
    } else {
      await prisma.anomalyAlert.deleteMany({})
    }

    return NextResponse.json({ success: true })
  } catch (error) {
    console.error('Error deleting alerts:', error)
    return NextResponse.json({ success: false, error: 'Failed to delete alerts' }, { status: 500 })
  }
}
