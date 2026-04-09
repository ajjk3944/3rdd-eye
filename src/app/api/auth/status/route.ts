import { NextResponse } from 'next/server'
import { cookies } from 'next/headers'

// Auth status check
// This checks if user is logged in
export async function GET() {
  try {
    const cookieStore = cookies()
    
    // Check for auth token/session
    // Replace 'auth_token' with your actual cookie name
    const authToken = cookieStore.get('auth_token')
    const userSession = cookieStore.get('user_session')
    
    // Check if user is authenticated
    const isAuthenticated = !!(authToken || userSession)
    
    return NextResponse.json({ 
      isAuthenticated,
      message: isAuthenticated ? 'Authenticated' : 'Please sign up to access this feature'
    })
  } catch (error) {
    return NextResponse.json({ 
      isAuthenticated: false,
      error: 'Failed to check auth status'
    }, { status: 500 })
  }
}
