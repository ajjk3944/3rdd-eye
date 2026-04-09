// API endpoint to initialize WiFi sharing database
// Call this once to set up the database tables

import { NextResponse } from 'next/server'
import { initWiFiSharingDB } from '@/lib/db-init'

export async function POST() {
  try {
    const success = await initWiFiSharingDB()
    
    if (success) {
      return NextResponse.json({ 
        success: true, 
        message: 'WiFi sharing database initialized successfully' 
      })
    } else {
      return NextResponse.json({ 
        success: false, 
        error: 'Failed to initialize database' 
      }, { status: 500 })
    }
  } catch (error) {
    console.error('Init error:', error)
    return NextResponse.json({ 
      success: false, 
      error: 'Internal server error' 
    }, { status: 500 })
  }
}

export async function GET() {
  return NextResponse.json({ 
    message: 'Use POST method to initialize the database',
    endpoint: '/api/wifi-share/init',
    method: 'POST'
  })
}
