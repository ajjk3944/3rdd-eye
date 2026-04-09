// Script to run database migrations
const { PrismaClient } = require('@prisma/client')
const fs = require('fs')
const path = require('path')

const prisma = new PrismaClient()

async function runMigrations() {
  console.log('🔄 Running database migrations...')
  
  try {
    // Read and execute migration files in order
    const migrationsDir = path.join(__dirname, '..', 'prisma', 'migrations')
    const migrationFiles = fs.readdirSync(migrationsDir)
      .filter(file => file.endsWith('.sql'))
      .sort()
    
    for (const file of migrationFiles) {
      console.log(`  📄 Running migration: ${file}`)
      const sql = fs.readFileSync(path.join(migrationsDir, file), 'utf-8')
      
      // Split by semicolon and execute each statement
      const statements = sql.split(';').filter(s => s.trim())
      
      for (const statement of statements) {
        if (statement.trim()) {
          await prisma.$executeRawUnsafe(statement)
        }
      }
      
      console.log(`  ✅ Completed: ${file}`)
    }
    
    console.log('✅ All migrations completed successfully!')
    
    // Verify tables exist
    console.log('\n🔍 Verifying database tables...')
    const tables = await prisma.$queryRaw`
      SELECT name FROM sqlite_master WHERE type='table' ORDER BY name
    `
    console.log('  Tables found:', tables.map(t => t.name).join(', '))
    
  } catch (error) {
    console.error('❌ Migration failed:', error)
    process.exit(1)
  } finally {
    await prisma.$disconnect()
  }
}

runMigrations()
