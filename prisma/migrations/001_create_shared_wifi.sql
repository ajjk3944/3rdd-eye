-- Create shared_wifi table for crowdsourced WiFi database
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
);

-- Create indexes for efficient geospatial queries
CREATE INDEX IF NOT EXISTS idx_shared_wifi_location ON shared_wifi(latitude, longitude);
CREATE INDEX IF NOT EXISTS idx_shared_wifi_ssid ON shared_wifi(ssid);
CREATE INDEX IF NOT EXISTS idx_shared_wifi_verified ON shared_wifi(verified);
CREATE INDEX IF NOT EXISTS idx_shared_wifi_created ON shared_wifi(created_at DESC);
