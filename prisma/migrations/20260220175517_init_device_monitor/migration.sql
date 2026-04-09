-- CreateTable
CREATE TABLE "saved_wifi_networks" (
    "id" TEXT NOT NULL PRIMARY KEY,
    "ssid" TEXT NOT NULL,
    "encryptedPassword" TEXT,
    "security" TEXT,
    "bssid" TEXT,
    "isConnected" BOOLEAN NOT NULL DEFAULT false,
    "addedAt" DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "lastConnectedAt" DATETIME
);

-- CreateTable
CREATE TABLE "known_devices" (
    "id" TEXT NOT NULL PRIMARY KEY,
    "macAddress" TEXT NOT NULL,
    "ipAddress" TEXT,
    "hostname" TEXT,
    "deviceName" TEXT NOT NULL,
    "vendor" TEXT,
    "isTrusted" BOOLEAN NOT NULL DEFAULT false,
    "firstSeen" DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "lastSeen" DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "createdAt" DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updatedAt" DATETIME NOT NULL
);

-- CreateTable
CREATE TABLE "device_data_usage" (
    "id" TEXT NOT NULL PRIMARY KEY,
    "macAddress" TEXT NOT NULL,
    "deviceName" TEXT NOT NULL,
    "bytesUploaded" BIGINT NOT NULL DEFAULT 0,
    "bytesDownloaded" BIGINT NOT NULL DEFAULT 0,
    "totalBytes" BIGINT NOT NULL DEFAULT 0,
    "lastUpdated" DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "date" TEXT NOT NULL
);

-- CreateTable
CREATE TABLE "device_alerts" (
    "id" TEXT NOT NULL PRIMARY KEY,
    "macAddress" TEXT NOT NULL,
    "deviceName" TEXT NOT NULL,
    "alertType" TEXT NOT NULL,
    "severity" TEXT NOT NULL,
    "message" TEXT NOT NULL,
    "details" TEXT,
    "detectedAt" DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "acknowledged" BOOLEAN NOT NULL DEFAULT false
);

-- CreateIndex
CREATE UNIQUE INDEX "saved_wifi_networks_ssid_key" ON "saved_wifi_networks"("ssid");

-- CreateIndex
CREATE UNIQUE INDEX "known_devices_macAddress_key" ON "known_devices"("macAddress");

-- CreateIndex
CREATE INDEX "known_devices_macAddress_idx" ON "known_devices"("macAddress");

-- CreateIndex
CREATE INDEX "known_devices_isTrusted_idx" ON "known_devices"("isTrusted");

-- CreateIndex
CREATE INDEX "device_data_usage_macAddress_idx" ON "device_data_usage"("macAddress");

-- CreateIndex
CREATE INDEX "device_data_usage_date_idx" ON "device_data_usage"("date");

-- CreateIndex
CREATE INDEX "device_data_usage_totalBytes_idx" ON "device_data_usage"("totalBytes");

-- CreateIndex
CREATE UNIQUE INDEX "device_data_usage_macAddress_date_key" ON "device_data_usage"("macAddress", "date");

-- CreateIndex
CREATE INDEX "device_alerts_macAddress_idx" ON "device_alerts"("macAddress");

-- CreateIndex
CREATE INDEX "device_alerts_detectedAt_idx" ON "device_alerts"("detectedAt");

-- CreateIndex
CREATE INDEX "device_alerts_acknowledged_idx" ON "device_alerts"("acknowledged");
