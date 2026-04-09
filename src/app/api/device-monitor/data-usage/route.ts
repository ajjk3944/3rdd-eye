import { NextRequest, NextResponse } from 'next/server'
import { PrismaClient } from '@prisma/client'

const prisma = new PrismaClient()

// GET - Fetch data usage for a device
export async function GET(request: NextRequest) {
  try {
    const { searchParams } = new URL(request.url)
    const macAddress = searchParams.get('mac')
    const date = searchParams.get('date')

    if (!macAddress || !date) {
      return NextResponse.json({ success: false, error: 'MAC address and date required' }, { status: 400 })
    }

    const usage = await prisma.deviceDataUsage.findUnique({
      where: {
        macAddress_date: {
          macAddress,
          date
        }
      }
    })

    return NextResponse.json({ success: true, usage })
  } catch (error) {
    console.error('Error fetching data usage:', error)
    return NextResponse.json({ 
      success: false, 
      error: 'Failed to fetch data usage' 
    }, { status: 500 })
  }
}

// POST - Save data usage
export async function POST(request: NextRequest) {
  try {
    const body = await request.json()
    const { usage } = body

    if (!usage || !usage.macAddress || !usage.date) {
      return NextResponse.json({ success: false, error: 'Invalid usage data' }, { status: 400 })
    }

    const savedUsage = await prisma.deviceDataUsage.upsert({
      where: {
        macAddress_date: {
          macAddress: usage.macAddress,
          date: usage.date
        }
      },
      update: {
        deviceName: usage.deviceName,
        bytesUploaded: BigInt(usage.bytesUploaded),
        bytesDownloaded: BigInt(usage.bytesDownloaded),
        totalBytes: BigInt(usage.totalBytes),
        lastUpdated: new Date(usage.lastUpdated)
      },
      create: {
        macAddress: usage.macAddress,
        deviceName: usage.deviceName,
        bytesUploaded: BigInt(usage.bytesUploaded),
        bytesDownloaded: BigInt(usage.bytesDownloaded),
        totalBytes: BigInt(usage.totalBytes),
        lastUpdated: new Date(usage.lastUpdated),
        date: usage.date
      }
    })

    return NextResponse.json({ success: true, usage: savedUsage })
  } catch (error: any) {
    console.error('Error saving data usage:', error)
    return NextResponse.json({ 
      success: false, 
      error: error.message || 'Failed to save data usage' 
    }, { status: 500 })
  }
}
