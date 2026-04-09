#!/usr/bin/env node

/**
 * Test script for WiFi system
 * Tests database connection, encryption, and API functionality
 */

const { PrismaClient } = require('@prisma/client')
const { encryptPassword, decryptPassword } = require('../src/lib/encryption.ts')

const prisma = new PrismaClient()

async function testWiFiSystem() {
  console.log('🧪 Testing WiFi System...\n')

  try {
    // Test 1: Database Connection
    console.log('1️⃣ Testing database connection...')
    const count = await prisma.savedWifiNetwork.count()
    console.log(`✅ Database connected! Found ${count} saved networks\n`)

    // Test 2: Encryption/Decryption
    console.log('2️⃣ Testing encryption...')
    const testPassword = 'MySecurePassword123!'
    const encrypted = encryptPassword(testPassword)
    const decrypted = decryptPassword(encrypted)
    
    console.log(`   Original:  ${testPassword}`)
    console.log(`   Encrypted: ${encrypted}`)
    console.log(`   Decrypted: ${decrypted}`)
    
    if (testPassword === decrypted) {
      console.log('✅ Encryption/Decryption working correctly!\n')
    } else {
      console.log('❌ Encryption/Decryption failed!\n')
      process.exit(1)
    }

    // Test 3: Create Test Network
    console.log('3️⃣ Testing network creation...')
    const testNetwork = await prisma.savedWifiNetwork.upsert({
      where: { ssid: 'TEST_NETWORK' },
      update: {
        encryptedPassword: encryptPassword('test123'),
        security: 'WPA2',
        lastConnectedAt: new Date()
      },
      create: {
        ssid: 'TEST_NETWORK',
        encryptedPassword: encryptPassword('test123'),
        security: 'WPA2',
        isConnected: false,
        addedAt: new Date(),
        lastConnectedAt: new Date()
      }
    })
    console.log(`✅ Test network created: ${testNetwork.ssid}\n`)

    // Test 4: Retrieve and Decrypt
    console.log('4️⃣ Testing network retrieval...')
    const networks = await prisma.savedWifiNetwork.findMany()
    console.log(`✅ Found ${networks.length} networks:`)
    
    networks.forEach(network => {
      const password = network.encryptedPassword 
        ? decryptPassword(network.encryptedPassword) 
        : 'No password'
      console.log(`   - ${network.ssid} (${network.security}) - Password: ${password}`)
    })
    console.log()

    // Test 5: Delete Test Network
    console.log('5️⃣ Cleaning up test network...')
    await prisma.savedWifiNetwork.delete({
      where: { ssid: 'TEST_NETWORK' }
    })
    console.log('✅ Test network deleted\n')

    console.log('🎉 All tests passed! WiFi system is working correctly.\n')
    
  } catch (error) {
    console.error('❌ Test failed:', error)
    process.exit(1)
  } finally {
    await prisma.$disconnect()
  }
}

testWiFiSystem()
