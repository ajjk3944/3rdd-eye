// Initialize WiFi sharing database
// Run with: node scripts/init-wifi-db.js

// Load environment variables
require('dotenv').config({ path: '.env.local' })

const { PrismaClient } = require('@prisma/client')

const prisma = new PrismaClient()

async function initWiFiSharingDB() {
  try {
    console.log('🔧 Initializing WiFi sharing database...')

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
        verified INTEGER DEFAULT 0,
        verification_count INTEGER DEFAULT 0,
        created_at TEXT DEFAULT (datetime('now')),
        updated_at TEXT DEFAULT (datetime('now'))
      )
    `
    console.log('✅ Table created: shared_wifi')

    // Create indexes
    await prisma.$executeRaw`
      CREATE INDEX IF NOT EXISTS idx_shared_wifi_location ON shared_wifi(latitude, longitude)
    `
    console.log('✅ Index created: idx_shared_wifi_location')
    
    await prisma.$executeRaw`
      CREATE INDEX IF NOT EXISTS idx_shared_wifi_ssid ON shared_wifi(ssid)
    `
    console.log('✅ Index created: idx_shared_wifi_ssid')
    
    await prisma.$executeRaw`
      CREATE INDEX IF NOT EXISTS idx_shared_wifi_verified ON shared_wifi(verified)
    `
    console.log('✅ Index created: idx_shared_wifi_verified')
    
    await prisma.$executeRaw`
      CREATE INDEX IF NOT EXISTS idx_shared_wifi_created ON shared_wifi(created_at DESC)
    `
    console.log('✅ Index created: idx_shared_wifi_created')

    // Add some sample data for testing
    console.log('\n📝 Adding sample WiFi networks...')
    
    const sampleNetworks = [
      {
        ssid: 'Dhaka Free WiFi',
        password: null,
        latitude: 23.8103,
        longitude: 90.4125,
        address: 'Gulshan, Dhaka, Bangladesh',
        signal_strength: -55,
        security: 'Open',
        comment: 'Free public WiFi in Gulshan area',
        rating: 4,
        shared_by: 'Community'
      },
      {
        ssid: 'Cafe Connect',
        password: 'coffee2024',
        latitude: 23.7805,
        longitude: 90.4160,
        address: 'Dhanmondi, Dhaka, Bangladesh',
        signal_strength: -60,
        security: 'WPA2',
        comment: 'Available for cafe customers',
        rating: 5,
        shared_by: 'Anonymous'
      },
      {
        ssid: 'Airport Guest',
        password: 'welcome123',
        latitude: 23.8433,
        longitude: 90.3978,
        address: 'Hazrat Shahjalal International Airport, Dhaka',
        signal_strength: -50,
        security: 'WPA2',
        comment: 'Fast and reliable airport WiFi',
        rating: 4,
        shared_by: 'Traveler'
      }
    ]

    for (const network of sampleNetworks) {
      await prisma.$executeRaw`
        INSERT INTO shared_wifi (
          ssid, password, latitude, longitude, address,
          signal_strength, security, comment, rating, shared_by,
          verified, verification_count
        ) VALUES (
          ${network.ssid}, ${network.password}, ${network.latitude}, ${network.longitude}, ${network.address},
          ${network.signal_strength}, ${network.security}, ${network.comment}, ${network.rating}, ${network.shared_by},
          0, 0
        )
      `
      console.log(`   ✓ Added: ${network.ssid}`)
    }

    console.log('\n✅ WiFi sharing database initialized successfully!')
    console.log('\n📊 Database Statistics:')
    
    const count = await prisma.$queryRaw`SELECT COUNT(*) as count FROM shared_wifi`
    console.log(`   Total networks: ${count[0].count}`)
    
    console.log('\n🚀 You can now use the WiFi Map feature!')
    console.log('   - Open the app and go to WiFi Map tab')
    console.log('   - Share your own WiFi networks')
    console.log('   - Discover networks shared by others')
    
  } catch (error) {
    console.error('❌ Failed to initialize WiFi sharing database:', error)
    process.exit(1)
  } finally {
    await prisma.$disconnect()
  }
}

initWiFiSharingDB()
