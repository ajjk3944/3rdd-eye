// Database initialization for WiFi sharing feature
// Run this to set up the shared_wifi table

import { PrismaClient } from '@prisma/client'

const prisma = new PrismaClient()

export async function initWiFiSharingDB() {
  try {
    // Create shared_wifi table
    await prisma.$executeRaw`
      CREATE TABLE IF NOT EXISTS shared_wifi (
        id TEXT PRIMARY KEY DEFAULT (lower(hex(randomblob(16)))),
        ssid TEXT NOT NULL,
        password TEXT,
        latitude REAL NOT NULL,
        longitude REAL NOT NULL,
        address TEXT NOT NULL,
        signal_strength INTEGER DEFAULT -60,
        security TEXT DEFAULT 'WPA2',
        comment TEXT,
        rating INTEGER DEFAULT 3,
        shared_by TEXT DEFAULT 'Anonymous',
        verified BOOLEAN DEFAULT false,
        verification_count INTEGER DEFAULT 0,
        created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
        updated_at DATETIME DEFAULT CURRENT_TIMESTAMP
      )
    `

    // Create indexes
    await prisma.$executeRaw`
      CREATE INDEX IF NOT EXISTS idx_shared_wifi_location ON shared_wifi(latitude, longitude)
    `
    
    await prisma.$executeRaw`
      CREATE INDEX IF NOT EXISTS idx_shared_wifi_ssid ON shared_wifi(ssid)
    `
    
    await prisma.$executeRaw`
      CREATE INDEX IF NOT EXISTS idx_shared_wifi_verified ON shared_wifi(verified)
    `
    
    await prisma.$executeRaw`
      CREATE INDEX IF NOT EXISTS idx_shared_wifi_created ON shared_wifi(created_at DESC)
    `

    console.log('✅ WiFi sharing database initialized successfully')
    return true
  } catch (error) {
    console.error('❌ Failed to initialize WiFi sharing database:', error)
    return false
  } finally {
    await prisma.$disconnect()
  }
}

// Auto-initialize on import in development
if (process.env.NODE_ENV === 'development' && typeof window === 'undefined') {
  initWiFiSharingDB().catch(console.error)
}
