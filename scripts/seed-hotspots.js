const { PrismaClient } = require('@prisma/client')
require('dotenv').config({ path: '.env.local' })

const prisma = new PrismaClient()

const sampleHotspots = [
  // Cafes
  {
    ssid: 'Starbucks WiFi',
    location: 'Starbucks Downtown',
    address: '123 Main Street, Downtown',
    password: null,
    hasPassword: false,
    isVerified: true,
    category: 'Cafes',
    categoryIcon: '☕',
    latitude: 40.7589,
    longitude: -73.9851,
    avgDownloadSpeed: 45.5,
    avgUploadSpeed: 12.3,
    avgPing: 25,
    speedTestCount: 15,
    uploadedBy: 'Community'
  },
  {
    ssid: 'CoffeeBean_Guest',
    location: 'Coffee Bean & Tea Leaf',
    address: '456 Park Avenue',
    password: 'coffee2024',
    hasPassword: true,
    isVerified: true,
    category: 'Cafes',
    categoryIcon: '☕',
    latitude: 40.7614,
    longitude: -73.9776,
    avgDownloadSpeed: 38.2,
    avgUploadSpeed: 10.5,
    avgPing: 30,
    speedTestCount: 8,
    uploadedBy: 'John D.'
  },
  {
    ssid: 'Dunkin_Free',
    location: 'Dunkin Donuts Central',
    address: '789 Broadway',
    password: null,
    hasPassword: false,
    isVerified: true,
    category: 'Cafes',
    categoryIcon: '☕',
    latitude: 40.7505,
    longitude: -73.9934,
    avgDownloadSpeed: 32.1,
    avgUploadSpeed: 8.7,
    avgPing: 35,
    speedTestCount: 12,
    uploadedBy: 'Sarah M.'
  },

  // Hotels
  {
    ssid: 'Hilton_Guest',
    location: 'Hilton Hotel',
    address: '234 Hotel Plaza',
    password: 'welcome123',
    hasPassword: true,
    isVerified: true,
    category: 'Hotels',
    categoryIcon: '🏨',
    latitude: 40.7580,
    longitude: -73.9855,
    avgDownloadSpeed: 85.3,
    avgUploadSpeed: 25.6,
    avgPing: 15,
    speedTestCount: 25,
    uploadedBy: 'Hotel Staff'
  },
  {
    ssid: 'Marriott_WiFi',
    location: 'Marriott Downtown',
    address: '567 Grand Avenue',
    password: 'marriott2024',
    hasPassword: true,
    isVerified: true,
    category: 'Hotels',
    categoryIcon: '🏨',
    latitude: 40.7542,
    longitude: -73.9866,
    avgDownloadSpeed: 92.7,
    avgUploadSpeed: 28.3,
    avgPing: 12,
    speedTestCount: 30,
    uploadedBy: 'Community'
  },

  // Restaurants
  {
    ssid: 'McDonalds_Free',
    location: 'McDonald\'s Times Square',
    address: '890 Times Square',
    password: null,
    hasPassword: false,
    isVerified: true,
    category: 'Restaurants',
    categoryIcon: '🍽️',
    latitude: 40.7580,
    longitude: -73.9855,
    avgDownloadSpeed: 28.5,
    avgUploadSpeed: 7.2,
    avgPing: 40,
    speedTestCount: 20,
    uploadedBy: 'Mike R.'
  },
  {
    ssid: 'Subway_Guest',
    location: 'Subway Restaurant',
    address: '321 Food Court',
    password: 'subway123',
    hasPassword: true,
    isVerified: false,
    category: 'Restaurants',
    categoryIcon: '🍽️',
    latitude: 40.7490,
    longitude: -73.9680,
    avgDownloadSpeed: 25.3,
    avgUploadSpeed: 6.5,
    avgPing: 45,
    speedTestCount: 5,
    uploadedBy: 'Anonymous'
  },

  // Public Places
  {
    ssid: 'NYC_Free_WiFi',
    location: 'Central Park',
    address: 'Central Park, Manhattan',
    password: null,
    hasPassword: false,
    isVerified: true,
    category: 'Public',
    categoryIcon: '📍',
    latitude: 40.7829,
    longitude: -73.9654,
    avgDownloadSpeed: 15.2,
    avgUploadSpeed: 4.8,
    avgPing: 60,
    speedTestCount: 50,
    uploadedBy: 'NYC Parks'
  },
  {
    ssid: 'Library_Public',
    location: 'Public Library',
    address: '476 5th Avenue',
    password: null,
    hasPassword: false,
    isVerified: true,
    category: 'Public',
    categoryIcon: '📍',
    latitude: 40.7532,
    longitude: -73.9822,
    avgDownloadSpeed: 55.8,
    avgUploadSpeed: 18.2,
    avgPing: 20,
    speedTestCount: 35,
    uploadedBy: 'Library Staff'
  },

  // Transport
  {
    ssid: 'Airport_Free',
    location: 'JFK Airport Terminal 4',
    address: 'JFK International Airport',
    password: null,
    hasPassword: false,
    isVerified: true,
    category: 'Transport',
    categoryIcon: '🚇',
    latitude: 40.6413,
    longitude: -73.7781,
    avgDownloadSpeed: 42.3,
    avgUploadSpeed: 15.7,
    avgPing: 28,
    speedTestCount: 100,
    uploadedBy: 'Airport Authority'
  },
  {
    ssid: 'Penn_Station_WiFi',
    location: 'Penn Station',
    address: 'Pennsylvania Station',
    password: null,
    hasPassword: false,
    isVerified: true,
    category: 'Transport',
    categoryIcon: '🚇',
    latitude: 40.7505,
    longitude: -73.9934,
    avgDownloadSpeed: 35.6,
    avgUploadSpeed: 12.1,
    avgPing: 32,
    speedTestCount: 75,
    uploadedBy: 'MTA'
  },

  // Shopping
  {
    ssid: 'Mall_Guest',
    location: 'Manhattan Mall',
    address: '100 West 33rd Street',
    password: 'shopping2024',
    hasPassword: true,
    isVerified: true,
    category: 'Shopping',
    categoryIcon: '🛍️',
    latitude: 40.7489,
    longitude: -73.9890,
    avgDownloadSpeed: 48.9,
    avgUploadSpeed: 16.4,
    avgPing: 22,
    speedTestCount: 40,
    uploadedBy: 'Mall Management'
  },
  {
    ssid: 'Target_WiFi',
    location: 'Target Store',
    address: '255 Greenwich Street',
    password: null,
    hasPassword: false,
    isVerified: true,
    category: 'Shopping',
    categoryIcon: '🛍️',
    latitude: 40.7133,
    longitude: -74.0120,
    avgDownloadSpeed: 52.3,
    avgUploadSpeed: 18.9,
    avgPing: 18,
    speedTestCount: 28,
    uploadedBy: 'Store Staff'
  },

  // Additional diverse locations
  {
    ssid: 'Whole_Foods_Guest',
    location: 'Whole Foods Market',
    address: '250 7th Avenue',
    password: 'organic123',
    hasPassword: true,
    isVerified: true,
    category: 'Shopping',
    categoryIcon: '🛍️',
    latitude: 40.7465,
    longitude: -73.9947,
    avgDownloadSpeed: 41.2,
    avgUploadSpeed: 14.3,
    avgPing: 26,
    speedTestCount: 18,
    uploadedBy: 'Community'
  },
  {
    ssid: 'Panera_WiFi',
    location: 'Panera Bread',
    address: '1385 Broadway',
    password: null,
    hasPassword: false,
    isVerified: true,
    category: 'Cafes',
    categoryIcon: '☕',
    latitude: 40.7549,
    longitude: -73.9870,
    avgDownloadSpeed: 36.7,
    avgUploadSpeed: 11.2,
    avgPing: 29,
    speedTestCount: 22,
    uploadedBy: 'Alex K.'
  },
  {
    ssid: 'Best_Buy_Guest',
    location: 'Best Buy Electronics',
    address: '529 5th Avenue',
    password: null,
    hasPassword: false,
    isVerified: true,
    category: 'Shopping',
    categoryIcon: '🛍️',
    latitude: 40.7558,
    longitude: -73.9794,
    avgDownloadSpeed: 68.4,
    avgUploadSpeed: 22.7,
    avgPing: 16,
    speedTestCount: 32,
    uploadedBy: 'Tech Team'
  }
]

async function main() {
  console.log('🌱 Seeding WiFi hotspots...')

  for (const hotspot of sampleHotspots) {
    try {
      await prisma.hotspot.create({
        data: hotspot
      })
      console.log(`✅ Added: ${hotspot.ssid} at ${hotspot.location}`)
    } catch (error) {
      console.error(`❌ Failed to add ${hotspot.ssid}:`, error.message)
    }
  }

  console.log('✨ Seeding complete!')
}

main()
  .catch((e) => {
    console.error('Error seeding database:', e)
    process.exit(1)
  })
  .finally(async () => {
    await prisma.$disconnect()
  })
