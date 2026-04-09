import { NextRequest, NextResponse } from 'next/server'
import { PrismaClient } from '@prisma/client'

const prisma = new PrismaClient()

// GET - Get top data usage devices
export async function GET(request: NextRequest) {
  try {
    const { searchParams } = new URL(request.url)
    const limit = parseInt(searchParams.get('limit') || '10')
    const date = searchParams.get('date') || new Date().toISOString().split('T')[0]

    const devices = await prisma.deviceDataUsage.findMany({
      where: { date },
      orderBy: { totalBytes: 'desc' },
      take: limit
    })

    return NextResponse.json({ success: true, devices })
  } catch (error) {
    console.error('Error fetching top usage:', error)
    return NextResponse.json({ 
      success: false, 
      error: 'Failed to fetch top usage',
      devices: []
    }, { status: 500 })
  }
}
