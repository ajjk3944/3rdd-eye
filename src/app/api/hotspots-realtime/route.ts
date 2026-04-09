import { NextRequest, NextResponse } from 'next/server'

// This is a client-side only API - Firebase Realtime Database operations
// should be done directly from the client using the Firebase SDK

export async function GET(request: NextRequest) {
  return NextResponse.json({
    success: false,
    error: 'Use Firebase Realtime Database directly from client',
    message: 'Import { ref, get, push, set } from firebase/database and use directly'
  })
}

export async function POST(request: NextRequest) {
  return NextResponse.json({
    success: false,
    error: 'Use Firebase Realtime Database directly from client',
    message: 'Import { ref, push, set } from firebase/database and use directly'
  })
}
