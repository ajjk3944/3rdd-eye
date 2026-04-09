package app.thirdeye.scanner.eviltwin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

public class NetworkSecurityDatabase extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "network_security.db";
    private static final int DATABASE_VERSION = 1;

    // Table names
    private static final String TABLE_BASELINES = "network_baselines";
    private static final String TABLE_SCAN_HISTORY = "scan_history";
    private static final String TABLE_EVIL_TWINS = "known_evil_twins";

    public NetworkSecurityDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create network_baselines table
        db.execSQL("CREATE TABLE " + TABLE_BASELINES + " (" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "ssid TEXT NOT NULL, " +
            "bssid TEXT NOT NULL, " +
            "gateway_ip TEXT, " +
            "gateway_mac TEXT, " +
            "dhcp_server TEXT, " +
            "security_type TEXT, " +
            "vendor_oui TEXT, " +
            "average_rtt REAL, " +
            "first_seen INTEGER, " +
            "last_seen INTEGER, " +
            "times_connected INTEGER DEFAULT 1, " +
            "is_trusted INTEGER DEFAULT 0, " +
            "UNIQUE(ssid, bssid))");

        // Create scan_history table
        db.execSQL("CREATE TABLE " + TABLE_SCAN_HISTORY + " (" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "ssid TEXT, " +
            "bssid TEXT, " +
            "threat_score INTEGER, " +
            "threat_level TEXT, " +
            "indicators_json TEXT, " +
            "duplicate_count INTEGER, " +
            "gateway_mac_changed INTEGER, " +
            "dns_hijacked INTEGER, " +
            "ssl_intercepted INTEGER, " +
            "rtt_anomaly INTEGER, " +
            "scan_duration_ms INTEGER, " +
            "timestamp INTEGER)");

        // Create known_evil_twins table
        db.execSQL("CREATE TABLE " + TABLE_EVIL_TWINS + " (" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "ssid TEXT, " +
            "bssid TEXT, " +
            "reason TEXT, " +
            "first_detected INTEGER, " +
            "last_detected INTEGER, " +
            "times_detected INTEGER DEFAULT 1)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_BASELINES);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SCAN_HISTORY);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EVIL_TWINS);
        onCreate(db);
    }

    public synchronized void saveOrUpdateBaseline(String ssid, String bssid,
                                                  GatewayChecker.GatewayCheckResult gatewayResult,
                                                  NetworkIntegrityChecker.RTTResult rttResult) {
        SQLiteDatabase db = this.getWritableDatabase();
        long timestamp = System.currentTimeMillis();

        ContentValues values = new ContentValues();
        values.put("ssid", ssid);
        values.put("bssid", bssid);
        if (gatewayResult != null) {
            values.put("gateway_ip", gatewayResult.gatewayIP);
            values.put("gateway_mac", gatewayResult.gatewayMAC);
            values.put("dhcp_server", gatewayResult.dhcpServer);
        }
        if (rttResult != null) {
            values.put("average_rtt", rttResult.averageRTT);
        }
        values.put("last_seen", timestamp);

        // Try to update existing baseline
        int updated = db.update(TABLE_BASELINES, values, "ssid = ? AND bssid = ?",
            new String[]{ssid, bssid});

        if (updated == 0) {
            // Insert new baseline
            values.put("first_seen", timestamp);
            values.put("times_connected", 1);
            db.insert(TABLE_BASELINES, null, values);
        } else {
            // Increment times_connected
            db.execSQL("UPDATE " + TABLE_BASELINES + " SET times_connected = times_connected + 1 " +
                "WHERE ssid = ? AND bssid = ?", new String[]{ssid, bssid});
        }
    }

    public synchronized NetworkBaseline getBaseline(String ssid, String bssid) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_BASELINES, null, "ssid = ? AND bssid = ?",
            new String[]{ssid, bssid}, null, null, null);

        NetworkBaseline baseline = null;
        if (cursor.moveToFirst()) {
            baseline = new NetworkBaseline();
            baseline.ssid = cursor.getString(cursor.getColumnIndexOrThrow("ssid"));
            baseline.bssid = cursor.getString(cursor.getColumnIndexOrThrow("bssid"));
            baseline.gatewayIP = cursor.getString(cursor.getColumnIndexOrThrow("gateway_ip"));
            baseline.gatewayMAC = cursor.getString(cursor.getColumnIndexOrThrow("gateway_mac"));
            baseline.dhcpServer = cursor.getString(cursor.getColumnIndexOrThrow("dhcp_server"));
            baseline.securityType = cursor.getString(cursor.getColumnIndexOrThrow("security_type"));
            baseline.vendorOUI = cursor.getString(cursor.getColumnIndexOrThrow("vendor_oui"));
            baseline.averageRTT = cursor.getLong(cursor.getColumnIndexOrThrow("average_rtt"));
            baseline.firstSeen = cursor.getLong(cursor.getColumnIndexOrThrow("first_seen"));
            baseline.lastSeen = cursor.getLong(cursor.getColumnIndexOrThrow("last_seen"));
            baseline.timesConnected = cursor.getInt(cursor.getColumnIndexOrThrow("times_connected"));
            baseline.isTrusted = cursor.getInt(cursor.getColumnIndexOrThrow("is_trusted")) == 1;
        }
        cursor.close();
        return baseline;
    }

    public synchronized void saveScanResult(EvilTwinDetector.EvilTwinScanResult result) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("ssid", result.ssid);
        values.put("bssid", result.bssid);
        values.put("threat_score", result.threatScore);
        values.put("threat_level", result.threatLevel);
        values.put("scan_duration_ms", result.scanDurationMs);
        values.put("timestamp", result.scanTimestamp);

        // Convert indicators to JSON
        try {
            JSONArray indicatorsArray = new JSONArray();
            for (EvilTwinDetector.ThreatIndicator indicator : result.indicators) {
                JSONObject obj = new JSONObject();
                obj.put("type", indicator.type);
                obj.put("severity", indicator.severity);
                obj.put("description", indicator.description);
                indicatorsArray.put(obj);
            }
            values.put("indicators_json", indicatorsArray.toString());
        } catch (Exception e) {
            values.put("indicators_json", "[]");
        }

        // Store individual flags
        if (result.wifiAnalysis != null) {
            values.put("duplicate_count", result.wifiAnalysis.duplicateCount);
        }
        if (result.gatewayCheck != null) {
            values.put("gateway_mac_changed", result.gatewayCheck.macChanged ? 1 : 0);
        }
        if (result.dnsCheck != null) {
            values.put("dns_hijacked", result.dnsCheck.dnsHijacked ? 1 : 0);
        }
        if (result.sslCheck != null) {
            values.put("ssl_intercepted", result.sslCheck.sslIntercepted ? 1 : 0);
        }
        if (result.rttCheck != null) {
            values.put("rtt_anomaly", result.rttCheck.anomalyDetected ? 1 : 0);
        }

        db.insert(TABLE_SCAN_HISTORY, null, values);

        // If threat score is high, consider marking as evil twin
        if (result.threatScore >= 60) {
            markAsEvilTwin(result.ssid, result.bssid, "Threat score: " + result.threatScore);
        }
    }

    public synchronized List<ScanHistoryEntry> getScanHistory(int limit) {
        SQLiteDatabase db = this.getReadableDatabase();
        List<ScanHistoryEntry> history = new ArrayList<>();

        Cursor cursor = db.query(TABLE_SCAN_HISTORY, null, null, null, null, null,
            "timestamp DESC", String.valueOf(limit));

        while (cursor.moveToNext()) {
            ScanHistoryEntry entry = new ScanHistoryEntry();
            entry.id = cursor.getInt(cursor.getColumnIndexOrThrow("id"));
            entry.ssid = cursor.getString(cursor.getColumnIndexOrThrow("ssid"));
            entry.bssid = cursor.getString(cursor.getColumnIndexOrThrow("bssid"));
            entry.threatScore = cursor.getInt(cursor.getColumnIndexOrThrow("threat_score"));
            entry.threatLevel = cursor.getString(cursor.getColumnIndexOrThrow("threat_level"));
            entry.timestamp = cursor.getLong(cursor.getColumnIndexOrThrow("timestamp"));
            entry.scanDurationMs = cursor.getLong(cursor.getColumnIndexOrThrow("scan_duration_ms"));
            history.add(entry);
        }
        cursor.close();
        return history;
    }

    public synchronized List<ScanHistoryEntry> getScanHistoryForNetwork(String ssid) {
        SQLiteDatabase db = this.getReadableDatabase();
        List<ScanHistoryEntry> history = new ArrayList<>();

        Cursor cursor = db.query(TABLE_SCAN_HISTORY, null, "ssid = ?",
            new String[]{ssid}, null, null, "timestamp DESC");

        while (cursor.moveToNext()) {
            ScanHistoryEntry entry = new ScanHistoryEntry();
            entry.id = cursor.getInt(cursor.getColumnIndexOrThrow("id"));
            entry.ssid = cursor.getString(cursor.getColumnIndexOrThrow("ssid"));
            entry.bssid = cursor.getString(cursor.getColumnIndexOrThrow("bssid"));
            entry.threatScore = cursor.getInt(cursor.getColumnIndexOrThrow("threat_score"));
            entry.threatLevel = cursor.getString(cursor.getColumnIndexOrThrow("threat_level"));
            entry.timestamp = cursor.getLong(cursor.getColumnIndexOrThrow("timestamp"));
            history.add(entry);
        }
        cursor.close();
        return history;
    }

    public synchronized void markAsTrusted(String ssid, String bssid) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("is_trusted", 1);
        db.update(TABLE_BASELINES, values, "ssid = ? AND bssid = ?",
            new String[]{ssid, bssid});
    }

    public synchronized void markAsEvilTwin(String ssid, String bssid, String reason) {
        SQLiteDatabase db = this.getWritableDatabase();
        long timestamp = System.currentTimeMillis();

        // Check if already exists
        Cursor cursor = db.query(TABLE_EVIL_TWINS, null, "bssid = ?",
            new String[]{bssid}, null, null, null);

        if (cursor.moveToFirst()) {
            // Update existing
            ContentValues values = new ContentValues();
            values.put("last_detected", timestamp);
            db.execSQL("UPDATE " + TABLE_EVIL_TWINS + " SET times_detected = times_detected + 1, " +
                "last_detected = ? WHERE bssid = ?", new Object[]{timestamp, bssid});
        } else {
            // Insert new
            ContentValues values = new ContentValues();
            values.put("ssid", ssid);
            values.put("bssid", bssid);
            values.put("reason", reason);
            values.put("first_detected", timestamp);
            values.put("last_detected", timestamp);
            values.put("times_detected", 1);
            db.insert(TABLE_EVIL_TWINS, null, values);
        }
        cursor.close();
    }

    public synchronized List<KnownEvilTwin> getKnownEvilTwins() {
        SQLiteDatabase db = this.getReadableDatabase();
        List<KnownEvilTwin> evilTwins = new ArrayList<>();

        Cursor cursor = db.query(TABLE_EVIL_TWINS, null, null, null, null, null,
            "last_detected DESC");

        while (cursor.moveToNext()) {
            KnownEvilTwin twin = new KnownEvilTwin();
            twin.id = cursor.getInt(cursor.getColumnIndexOrThrow("id"));
            twin.ssid = cursor.getString(cursor.getColumnIndexOrThrow("ssid"));
            twin.bssid = cursor.getString(cursor.getColumnIndexOrThrow("bssid"));
            twin.reason = cursor.getString(cursor.getColumnIndexOrThrow("reason"));
            twin.firstDetected = cursor.getLong(cursor.getColumnIndexOrThrow("first_detected"));
            twin.lastDetected = cursor.getLong(cursor.getColumnIndexOrThrow("last_detected"));
            twin.timesDetected = cursor.getInt(cursor.getColumnIndexOrThrow("times_detected"));
            evilTwins.add(twin);
        }
        cursor.close();
        return evilTwins;
    }

    public synchronized boolean isKnownEvilTwin(String bssid) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_EVIL_TWINS, null, "bssid = ?",
            new String[]{bssid}, null, null, null);
        boolean exists = cursor.getCount() > 0;
        cursor.close();
        return exists;
    }

    public synchronized void clearHistory() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_SCAN_HISTORY, null, null);
    }

    public synchronized void clearOldHistory(int daysToKeep) {
        SQLiteDatabase db = this.getWritableDatabase();
        long cutoffTime = System.currentTimeMillis() - (daysToKeep * 24L * 60 * 60 * 1000);
        db.delete(TABLE_SCAN_HISTORY, "timestamp < ?", new String[]{String.valueOf(cutoffTime)});
    }

    // Model classes
    public static class NetworkBaseline {
        public String ssid;
        public String bssid;
        public String gatewayIP;
        public String gatewayMAC;
        public String dhcpServer;
        public String securityType;
        public String vendorOUI;
        public long averageRTT;
        public long firstSeen;
        public long lastSeen;
        public int timesConnected;
        public boolean isTrusted;
    }

    public static class ScanHistoryEntry {
        public int id;
        public String ssid;
        public String bssid;
        public int threatScore;
        public String threatLevel;
        public long timestamp;
        public long scanDurationMs;
    }

    public static class KnownEvilTwin {
        public int id;
        public String ssid;
        public String bssid;
        public String reason;
        public long firstDetected;
        public long lastDetected;
        public int timesDetected;
    }
}
