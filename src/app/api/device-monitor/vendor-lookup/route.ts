import { NextRequest, NextResponse } from 'next/server'
import { lookupVendor } from '@/lib/oui-lookup'

// GET - Lookup vendor from MAC address
export async function GET(request: NextRequest) {
  try {
    const { searchParams } = new URL(request.url)
    const mac = searchParams.get('mac')

    if (!mac) {
      return NextResponse.json({ success: false, error: 'MAC address required' }, { status: 400 })
    }

    const vendor = lookupVendor(mac)

    return NextResponse.json({ success: true, vendor: vendor || 'Unknown' })
  } catch (error) {
    console.error('Error looking up vendor:', error)
    return NextResponse.json({ 
      success: false, 
      error: 'Failed to lookup vendor',
      vendor: 'Unknown'
    }, { status: 500 })
  }
}
