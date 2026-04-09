const Database = require('better-sqlite3');
const path = require('path');
const fs = require('fs');

// Database path
const dbPath = path.join(__dirname, '..', 'db', 'custom.db');

// Ensure db directory exists
const dbDir = path.dirname(dbPath);
if (!fs.existsSync(dbDir)) {
  fs.mkdirSync(dbDir, { recursive: true });
}

// Open database
const db = new Database(dbPath);

console.log('Initializing SavedWifiNetwork table...');

// Create SavedWifiNetwork table
db.exec(`
  CREATE TABLE IF NOT EXISTS "SavedWifiNetwork" (
    "id" TEXT NOT NULL PRIMARY KEY,
    "ssid" TEXT NOT NULL UNIQUE,
    "password" TEXT,
    "security" TEXT NOT NULL,
    "bssid" TEXT,
    "isConnected" INTEGER NOT NULL DEFAULT 0,
    "lastConnected" TEXT,
    "createdAt" TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updatedAt" TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP
  );
`);

console.log('✅ SavedWifiNetwork table created successfully!');

// Close database
db.close();

console.log('Database initialization complete!');
