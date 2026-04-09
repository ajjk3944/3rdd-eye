import { NextRequest, NextResponse } from 'next/server'
import { prisma } from '@/lib/db'

export async function POST(request: NextRequest) {
  try {
    const body = await request.json()
    const { hotspotId, downloadSpeed, uploadSpeed, ping, jitter, testedBy } = body
    
    if (!hotspotId || !downloadSpeed || !uploadSpeed || !ping || !testedBy) {
      return NextResponse.json({ success: false, error: 'Missing required fields' }, { status: 400 })
    }
    
    // Save speed test result
    const result = await prisma.speedTestResult.create({
      data: {
        hotspotId,
        downloadSpeed,
        uploadSpeed,
        ping,
        jitter: jitter || null,
        testedBy,
        testedAt: new Date()
      }
    })
    
    // Update hotspot averages (last 10 tests)
    const allTests = await prisma.speedTestResult.findMany({
      where: { hotspotId },
      orderBy: { testedAt: 'desc' },
      take: 10
    })
    
    if (allTests.length > 0) {
      const avgDownload = allTests.reduce((sum, t) => sum + t.downloadSpeed, 0) / allTests.length
      const avgUpload = allTests.reduce((sum, t) => sum + t.uploadSpeed, 0) / allTests.length
      const avgPing = Math.round(allTests.reduce((sum, t) => sum + t.ping, 0) / allTests.length)
      
      await prisma.hotspot.update({
        where: { id: hotspotId },
        data: {
          avgDownloadSpeed: avgDownload,
          avgUploadSpeed: avgUpload,
          avgPing: avgPing,
          speedTestCount: { increment: 1 },
          lastSpeedTest: new Date()
        }
      })
    }
    
    return NextResponse.json({ success: true, result })
  } catch (error) {
    console.error('Speed test save error:', error)
    return NextResponse.json({ success: false, error: 'Failed to save speed test' }, { status: 500 })
  }
}

export async function GET(request: NextRequest) {
  try {
    const { searchParams } = new URL(request.url)
    const hotspotId = searchParams.get('hotspotId')
    
    if (!hotspotId) {
      return NextResponse.json({ success: false, error: 'Missing hotspotId' }, { status: 400 })
    }
    
    // Get recent speed tests
    const tests = await prisma.speedTestResult.findMany({
      where: { hotspotId },
      orderBy: { testedAt: 'desc' },
      take: 20
    })
    
    // Get hotspot with averages
    const hotspot = await prisma.hotspot.findUnique({
      where: { id: hotspotId },
      select: {
        avgDownloadSpeed: true,
        avgUploadSpeed: true,
        avgPing: true,
        speedTestCount: true,
        lastSpeedTest: true
      }
    })
    
    return NextResponse.json({ 
      success: true, 
      tests,
      averages: hotspot
    })
  } catch (error) {
    console.error('Speed test fetch error:', error)
    return NextResponse.json({ success: false, error: 'Failed to fetch speed tests' }, { status: 500 })
  }
}
