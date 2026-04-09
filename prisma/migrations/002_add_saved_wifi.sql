-- CreateTable
CREATE TABLE IF NOT EXISTS "SavedWifiNetwork" (
    "id" TEXT NOT NULL PRIMARY KEY,
    "ssid" TEXT NOT NULL UNIQUE,
    "encryptedPassword" TEXT,
    "security" TEXT NOT NULL,
    "bssid" TEXT,
    "isConnected" BOOLEAN NOT NULL DEFAULT false,
    "addedAt" DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "lastConnectedAt" DATETIME,
    "createdAt" DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updatedAt" DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
);
