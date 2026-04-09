import { NextRequest, NextResponse } from 'next/server'
import { PrismaClient } from '@prisma/client'

const prisma = new PrismaClient()

// POST /api/hotspots/[id]/speed-test - Add speed test result
export async function POST(
  request: NextRequest,
  { params }: { params: { id: string } }
) {
  try {
    const body = await request.json()
    const { downloadSpeed, uploadSpeed, ping, jitter, testedBy } = body

    if (!downloadSpeed || !uploadSpeed || !ping) {
      return NextResponse.json(
        { success: false, error: 'Download speed, upload speed, and ping are required' },
        { status: 400 }
      )
    }

    // Create speed test result
    const speedTest = await prisma.speedTestResult.create({
      data: {
        hotspotId: params.id,
        downloadSpeed,
        uploadSpeed,
        ping,
        jitter: jitter || null,
        testedBy: testedBy || 'Anonymous'
      }
    })

    // Update hotspot averages
    const allTests = await prisma.speedTestResult.findMany({
      where: { hotspotId: params.id }
    })

    const avgDownload = allTests.reduce((sum, t) => sum + t.downloadSpeed, 0) / allTests.length
    const avgUpload = allTests.reduce((sum, t) => sum + t.uploadSpeed, 0) / allTests.length
    const avgPing = Math.round(allTests.reduce((sum, t) => sum + t.ping, 0) / allTests.length)

    await prisma.hotspot.update({
      where: { id: params.id },
      data: {
        avgDownloadSpeed: avgDownload,
        avgUploadSpeed: avgUpload,
        avgPing: avgPing,
        speedTestCount: allTests.length,
        lastSpeedTest: new Date()
      }
    })

    return NextResponse.json({ success: true, speedTest })
  } catch (error: any) {
    return NextResponse.json(
      { success: false, error: error.message },
      { status: 500 }
    )
  }
}
