// Simple encryption utility for WiFi passwords
// In production, use more robust encryption like crypto-js or native encryption

const ENCRYPTION_KEY = process.env.ENCRYPTION_KEY || 'thirdeye-wifi-encryption-key-2026'

export function encryptPassword(password: string): string {
  if (!password) return ''
  
  try {
    // Simple XOR encryption with Base64 encoding
    // In production, use proper encryption library
    const encrypted = Buffer.from(password)
      .map((byte, i) => byte ^ ENCRYPTION_KEY.charCodeAt(i % ENCRYPTION_KEY.length))
    
    return Buffer.from(encrypted).toString('base64')
  } catch (error) {
    console.error('Encryption error:', error)
    return ''
  }
}

export function decryptPassword(encryptedPassword: string): string {
  if (!encryptedPassword) return ''
  
  try {
    const encrypted = Buffer.from(encryptedPassword, 'base64')
    const decrypted = Array.from(encrypted)
      .map((byte, i) => byte ^ ENCRYPTION_KEY.charCodeAt(i % ENCRYPTION_KEY.length))
    
    return Buffer.from(decrypted).toString('utf8')
  } catch (error) {
    console.error('Decryption error:', error)
    return ''
  }
}
