import { NextRequest, NextResponse } from 'next/server'
import { db } from '@/lib/db'

// Store router credentials (encrypted)
export async function POST(request: NextRequest) {
  try {
    const { routerIP, username, password } = await request.json()

    if (!routerIP || !username) {
      return NextResponse.json({ success: false, error: 'Router IP and username required' })
    }

    // Simple encryption (in production, use proper encryption like crypto)
    const encryptedPassword = Buffer.from(password || '').toString('base64')

    await db.routerCredentials.upsert({
      where: { id: 1 },
      update: {
        routerIP,
        username,
        password: encryptedPassword,
        updatedAt: new Date()
      },
      create: {
        id: 1,
        routerIP,
        username,
        password: encryptedPassword
      }
    })

    return NextResponse.json({ success: true })
  } catch (error) {
    console.error('Failed to save router credentials:', error)
    return NextResponse.json({ success: false, error: 'Failed to save credentials' })
  }
}

// Get router credentials
export async function GET() {
  try {
    const credentials = await db.routerCredentials.findUnique({
      where: { id: 1 }
    })

    if (!credentials) {
      return NextResponse.json({ success: false, error: 'No credentials found' })
    }

    // Decrypt password
    const decryptedPassword = Buffer.from(credentials.password, 'base64').toString('utf-8')

    return NextResponse.json({
      success: true,
      credentials: {
        routerIP: credentials.routerIP,
        username: credentials.username,
        password: decryptedPassword
      }
    })
  } catch (error) {
    console.error('Failed to get router credentials:', error)
    return NextResponse.json({ success: false, error: 'Failed to get credentials' })
  }
}

// Delete router credentials
export async function DELETE() {
  try {
    await db.routerCredentials.delete({
      where: { id: 1 }
    })
    return NextResponse.json({ success: true })
  } catch (error) {
    console.error('Failed to delete router credentials:', error)
    return NextResponse.json({ success: false, error: 'Failed to delete credentials' })
  }
}
