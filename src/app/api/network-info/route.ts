import { NextRequest, NextResponse } from 'next/server'

// Required for static export
export const dynamic = 'force-static'

export async function GET(request: NextRequest) {
  try {
    // Get client IP from headers
    const forwarded = request.headers.get('x-forwarded-for')
    const realIp = request.headers.get('x-real-ip')
    const clientIp = forwarded?.split(',')[0] || realIp || 'unknown'
    
    // Determine network range based on client IP
    let network = '192.168.1'
    let gateway = '192.168.1.1'
    
    if (clientIp.startsWith('192.168.0.')) {
      network = '192.168.0'
      gateway = '192.168.0.1'
    } else if (clientIp.startsWith('192.168.2.')) {
      network = '192.168.2'
      gateway = '192.168.2.1'
    } else if (clientIp.startsWith('10.0.0.')) {
      network = '10.0.0'
      gateway = '10.0.0.1'
    } else if (clientIp.startsWith('172.16.')) {
      network = '172.16.0'
      gateway = '172.16.0.1'
    }
    
    return NextResponse.json({
      network,
      gateway,
      clientIp,
      userAgent: request.headers.get('user-agent') || 'unknown'
    })
    
  } catch (error) {
    return NextResponse.json(
      { error: 'Failed to get network info' },
      { status: 500 }
    )
  }
}