package app.thirdeye.scanner.routerguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.getcapacitor.JSObject;

import java.util.ArrayList;
import java.util.List;

public class DeviceHistoryDatabase extends SQLiteOpenHelper {
    private static final String TAG = "DeviceHistoryDB";
    private static final String DB_NAME = "device_history.db";
    private static final int DB_VERSION = 1;
    
    private static final String TABLE_DEVICES = "known_devices";
    private static final String TABLE_SESSIONS = "device_sessions";
    private static final String TABLE_ALERTS = "device_alerts";
    
    private static DeviceHistoryDatabase instance;

    public static synchronized DeviceHistoryDatabase getInstance(Context context) {
        if (instance == null) {
            instance = new DeviceHistoryDatabase(context.getApplicationContext());
        }
        return instance;
    }

    private DeviceHistoryDatabase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Known devices table
        db.execSQL("CREATE TABLE " + TABLE_DEVICES + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "mac_address TEXT NOT NULL UNIQUE," +
                "device_name TEXT," +
                "custom_name TEXT," +
                "ip_address TEXT," +
                "vendor TEXT," +
                "device_type TEXT DEFAULT 'unknown'," +
                "is_trusted INTEGER DEFAULT 0," +
                "first_seen INTEGER NOT NULL," +
                "last_seen INTEGER NOT NULL," +
                "times_seen INTEGER DEFAULT 1," +
                "is_online INTEGER DEFAULT 1," +
                "notes TEXT" +
                ")");
        
        // Device sessions table
        db.execSQL("CREATE TABLE " + TABLE_SESSIONS + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "mac_address TEXT NOT NULL," +
                "ip_address TEXT," +
                "connected_at INTEGER NOT NULL," +
                "disconnected_at INTEGER," +
                "session_duration INTEGER" +
                ")");
        
        // Device alerts table
        db.execSQL("CREATE TABLE " + TABLE_ALERTS + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "mac_address TEXT NOT NULL," +
                "alert_type TEXT NOT NULL," +
                "alert_message TEXT NOT NULL," +
                "severity TEXT DEFAULT 'info'," +
                "is_read INTEGER DEFAULT 0," +
                "created_at INTEGER NOT NULL" +
                ")");
        
        // Create indexes
        db.execSQL("CREATE INDEX idx_mac ON " + TABLE_DEVICES + "(mac_address)");
        db.execSQL("CREATE INDEX idx_sessions_mac ON " + TABLE_SESSIONS + "(mac_address)");
        db.execSQL("CREATE INDEX idx_alerts_mac ON " + TABLE_ALERTS + "(mac_address)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Future upgrades
    }

    // Normalize MAC address to uppercase with colons
    private String normalizeMac(String mac) {
        if (mac == null) return null;
        return mac.toUpperCase().replaceAll("[^A-F0-9]", "")
                .replaceAll("(.{2})", "$1:").replaceAll(":$", "");
    }

    public void addOrUpdateDevice(String macAddress, String deviceName, String ipAddress, 
                                  String vendor, String deviceType) {
        SQLiteDatabase db = getWritableDatabase();
        String normalizedMac = normalizeMac(macAddress);
        long timestamp = System.currentTimeMillis();
        
        Cursor cursor = db.query(TABLE_DEVICES, new String[]{"id", "times_seen"}, 
            "mac_address = ?", new String[]{normalizedMac}, null, null, null);
        
        ContentValues values = new ContentValues();
        values.put("mac_address", normalizedMac);
        values.put("device_name", deviceName);
        values.put("ip_address", ipAddress);
        values.put("vendor", vendor);
        values.put("device_type", deviceType != null ? deviceType : "unknown");
        values.put("last_seen", timestamp);
        values.put("is_online", 1);
        
        if (cursor.moveToFirst()) {
            // Update existing device
            int timesSeen = cursor.getInt(1) + 1;
            values.put("times_seen", timesSeen);
            db.update(TABLE_DEVICES, values, "mac_address = ?", new String[]{normalizedMac});
            Log.d(TAG, "Updated device: " + normalizedMac);
        } else {
            // Insert new device
            values.put("first_seen", timestamp);
            values.put("times_seen", 1);
            values.put("is_trusted", 0);
            db.insert(TABLE_DEVICES, null, values);
            Log.d(TAG, "Added new device: " + normalizedMac);
            
            // Create alert for new device
            addAlert(normalizedMac, "new_device", 
                "New device detected: " + (deviceName != null ? deviceName : normalizedMac), "info");
        }
        cursor.close();
    }

    public JSObject getDevice(String macAddress) {
        SQLiteDatabase db = getReadableDatabase();
        String normalizedMac = normalizeMac(macAddress);
        Cursor cursor = db.query(TABLE_DEVICES, null, "mac_address = ?", 
            new String[]{normalizedMac}, null, null, null);
        
        JSObject result = null;
        if (cursor.moveToFirst()) {
            result = deviceCursorToJSObject(cursor);
        }
        cursor.close();
        return result;
    }

    public List<JSObject> getAllDevices() {
        List<JSObject> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(TABLE_DEVICES, null, null, null, null, null, "last_seen DESC");
        
        while (cursor.moveToNext()) {
            list.add(deviceCursorToJSObject(cursor));
        }
        cursor.close();
        return list;
    }

    public List<JSObject> getOnlineDevices() {
        List<JSObject> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(TABLE_DEVICES, null, "is_online = 1", null, null, null, "last_seen DESC");
        
        while (cursor.moveToNext()) {
            list.add(deviceCursorToJSObject(cursor));
        }
        cursor.close();
        return list;
    }

    public List<JSObject> getTrustedDevices() {
        List<JSObject> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(TABLE_DEVICES, null, "is_trusted = 1", null, null, null, "last_seen DESC");
        
        while (cursor.moveToNext()) {
            list.add(deviceCursorToJSObject(cursor));
        }
        cursor.close();
        return list;
    }

    public List<JSObject> getUntrustedDevices() {
        List<JSObject> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(TABLE_DEVICES, null, "is_trusted != 1", null, null, null, "last_seen DESC");
        
        while (cursor.moveToNext()) {
            list.add(deviceCursorToJSObject(cursor));
        }
        cursor.close();
        return list;
    }

    public void setDeviceTrust(String macAddress, int trustLevel) {
        SQLiteDatabase db = getWritableDatabase();
        String normalizedMac = normalizeMac(macAddress);
        
        ContentValues values = new ContentValues();
        values.put("is_trusted", trustLevel);
        db.update(TABLE_DEVICES, values, "mac_address = ?", new String[]{normalizedMac});
        Log.d(TAG, "Set device trust: " + normalizedMac + " = " + trustLevel);
    }

    public void setCustomName(String macAddress, String customName) {
        SQLiteDatabase db = getWritableDatabase();
        String normalizedMac = normalizeMac(macAddress);
        
        ContentValues values = new ContentValues();
        values.put("custom_name", customName);
        db.update(TABLE_DEVICES, values, "mac_address = ?", new String[]{normalizedMac});
        Log.d(TAG, "Set custom name: " + normalizedMac + " = " + customName);
    }

    public void setDeviceType(String macAddress, String deviceType) {
        SQLiteDatabase db = getWritableDatabase();
        String normalizedMac = normalizeMac(macAddress);
        
        ContentValues values = new ContentValues();
        values.put("device_type", deviceType);
        db.update(TABLE_DEVICES, values, "mac_address = ?", new String[]{normalizedMac});
        Log.d(TAG, "Set device type: " + normalizedMac + " = " + deviceType);
    }

    public void setDeviceOffline(String macAddress) {
        SQLiteDatabase db = getWritableDatabase();
        String normalizedMac = normalizeMac(macAddress);
        long timestamp = System.currentTimeMillis();
        
        ContentValues values = new ContentValues();
        values.put("is_online", 0);
        db.update(TABLE_DEVICES, values, "mac_address = ?", new String[]{normalizedMac});
        
        // Close any open sessions
        closeSession(normalizedMac, timestamp);
        Log.d(TAG, "Set device offline: " + normalizedMac);
    }

    public void setAllDevicesOffline() {
        SQLiteDatabase db = getWritableDatabase();
        long timestamp = System.currentTimeMillis();
        
        ContentValues values = new ContentValues();
        values.put("is_online", 0);
        db.update(TABLE_DEVICES, values, null, null);
        
        // Close all open sessions
        ContentValues sessionValues = new ContentValues();
        sessionValues.put("disconnected_at", timestamp);
        db.update(TABLE_SESSIONS, sessionValues, "disconnected_at IS NULL", null);
        
        // Calculate session durations
        db.execSQL("UPDATE " + TABLE_SESSIONS + " SET session_duration = " +
                "(disconnected_at - connected_at) / 1000 WHERE session_duration IS NULL");
        
        Log.d(TAG, "Set all devices offline");
    }

    public void logSession(String macAddress, String ipAddress, long connectedAt) {
        SQLiteDatabase db = getWritableDatabase();
        String normalizedMac = normalizeMac(macAddress);
        
        ContentValues values = new ContentValues();
        values.put("mac_address", normalizedMac);
        values.put("ip_address", ipAddress);
        values.put("connected_at", connectedAt);
        db.insert(TABLE_SESSIONS, null, values);
        Log.d(TAG, "Logged session: " + normalizedMac);
    }

    public void closeSession(String macAddress, long disconnectedAt) {
        SQLiteDatabase db = getWritableDatabase();
        String normalizedMac = normalizeMac(macAddress);
        
        ContentValues values = new ContentValues();
        values.put("disconnected_at", disconnectedAt);
        
        // Update the most recent open session
        db.execSQL("UPDATE " + TABLE_SESSIONS + " SET disconnected_at = ?, " +
                "session_duration = (? - connected_at) / 1000 " +
                "WHERE mac_address = ? AND disconnected_at IS NULL",
                new Object[]{disconnectedAt, disconnectedAt, normalizedMac});
        
        Log.d(TAG, "Closed session: " + normalizedMac);
    }

    public List<JSObject> getDeviceSessions(String macAddress, int limit) {
        List<JSObject> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        String normalizedMac = normalizeMac(macAddress);
        
        Cursor cursor = db.query(TABLE_SESSIONS, null, "mac_address = ?", 
            new String[]{normalizedMac}, null, null, "connected_at DESC", String.valueOf(limit));
        
        while (cursor.moveToNext()) {
            list.add(sessionCursorToJSObject(cursor));
        }
        cursor.close();
        return list;
    }

    public void addAlert(String macAddress, String alertType, String message, String severity) {
        SQLiteDatabase db = getWritableDatabase();
        String normalizedMac = normalizeMac(macAddress);
        
        ContentValues values = new ContentValues();
        values.put("mac_address", normalizedMac);
        values.put("alert_type", alertType);
        values.put("alert_message", message);
        values.put("severity", severity != null ? severity : "info");
        values.put("is_read", 0);
        values.put("created_at", System.currentTimeMillis());
        db.insert(TABLE_ALERTS, null, values);
        Log.d(TAG, "Added alert: " + alertType + " for " + normalizedMac);
    }

    public List<JSObject> getUnreadAlerts() {
        List<JSObject> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(TABLE_ALERTS, null, "is_read = 0", null, null, null, "created_at DESC");
        
        while (cursor.moveToNext()) {
            list.add(alertCursorToJSObject(cursor));
        }
        cursor.close();
        return list;
    }

    public List<JSObject> getAllAlerts(int limit) {
        List<JSObject> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(TABLE_ALERTS, null, null, null, null, null, 
            "created_at DESC", String.valueOf(limit));
        
        while (cursor.moveToNext()) {
            list.add(alertCursorToJSObject(cursor));
        }
        cursor.close();
        return list;
    }

    public void markAlertRead(int alertId) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("is_read", 1);
        db.update(TABLE_ALERTS, values, "id = ?", new String[]{String.valueOf(alertId)});
        Log.d(TAG, "Marked alert read: " + alertId);
    }

    public void markAllAlertsRead() {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("is_read", 1);
        db.update(TABLE_ALERTS, values, null, null);
        Log.d(TAG, "Marked all alerts read");
    }

    public int getDeviceCount() {
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT COUNT(*) FROM " + TABLE_DEVICES, null);
        int count = 0;
        if (cursor.moveToFirst()) {
            count = cursor.getInt(0);
        }
        cursor.close();
        return count;
    }

    public int getNewDevicesCount(long sinceTimestamp) {
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT COUNT(*) FROM " + TABLE_DEVICES + 
            " WHERE first_seen >= ?", new String[]{String.valueOf(sinceTimestamp)});
        int count = 0;
        if (cursor.moveToFirst()) {
            count = cursor.getInt(0);
        }
        cursor.close();
        return count;
    }

    public void deleteDevice(String macAddress) {
        SQLiteDatabase db = getWritableDatabase();
        String normalizedMac = normalizeMac(macAddress);
        
        db.delete(TABLE_DEVICES, "mac_address = ?", new String[]{normalizedMac});
        db.delete(TABLE_SESSIONS, "mac_address = ?", new String[]{normalizedMac});
        db.delete(TABLE_ALERTS, "mac_address = ?", new String[]{normalizedMac});
        Log.d(TAG, "Deleted device: " + normalizedMac);
    }

    public void clearAllData() {
        SQLiteDatabase db = getWritableDatabase();
        db.delete(TABLE_DEVICES, null, null);
        db.delete(TABLE_SESSIONS, null, null);
        db.delete(TABLE_ALERTS, null, null);
        Log.d(TAG, "Cleared all data");
    }

    private JSObject deviceCursorToJSObject(Cursor cursor) {
        JSObject obj = new JSObject();
        obj.put("id", cursor.getInt(cursor.getColumnIndexOrThrow("id")));
        obj.put("macAddress", cursor.getString(cursor.getColumnIndexOrThrow("mac_address")));
        obj.put("deviceName", cursor.getString(cursor.getColumnIndexOrThrow("device_name")));
        obj.put("customName", cursor.getString(cursor.getColumnIndexOrThrow("custom_name")));
        obj.put("ipAddress", cursor.getString(cursor.getColumnIndexOrThrow("ip_address")));
        obj.put("vendor", cursor.getString(cursor.getColumnIndexOrThrow("vendor")));
        obj.put("deviceType", cursor.getString(cursor.getColumnIndexOrThrow("device_type")));
        obj.put("isTrusted", cursor.getInt(cursor.getColumnIndexOrThrow("is_trusted")));
        obj.put("firstSeen", cursor.getLong(cursor.getColumnIndexOrThrow("first_seen")));
        obj.put("lastSeen", cursor.getLong(cursor.getColumnIndexOrThrow("last_seen")));
        obj.put("timesSeen", cursor.getInt(cursor.getColumnIndexOrThrow("times_seen")));
        obj.put("isOnline", cursor.getInt(cursor.getColumnIndexOrThrow("is_online")) == 1);
        obj.put("notes", cursor.getString(cursor.getColumnIndexOrThrow("notes")));
        return obj;
    }

    private JSObject sessionCursorToJSObject(Cursor cursor) {
        JSObject obj = new JSObject();
        obj.put("id", cursor.getInt(cursor.getColumnIndexOrThrow("id")));
        obj.put("macAddress", cursor.getString(cursor.getColumnIndexOrThrow("mac_address")));
        obj.put("ipAddress", cursor.getString(cursor.getColumnIndexOrThrow("ip_address")));
        obj.put("connectedAt", cursor.getLong(cursor.getColumnIndexOrThrow("connected_at")));
        
        int disconnectedIndex = cursor.getColumnIndexOrThrow("disconnected_at");
        if (!cursor.isNull(disconnectedIndex)) {
            obj.put("disconnectedAt", cursor.getLong(disconnectedIndex));
        } else {
            obj.put("disconnectedAt", (Object) null);
        }
        
        int durationIndex = cursor.getColumnIndexOrThrow("session_duration");
        if (!cursor.isNull(durationIndex)) {
            obj.put("sessionDuration", cursor.getInt(durationIndex));
        } else {
            obj.put("sessionDuration", (Object) null);
        }
        
        return obj;
    }

    private JSObject alertCursorToJSObject(Cursor cursor) {
        JSObject obj = new JSObject();
        obj.put("id", cursor.getInt(cursor.getColumnIndexOrThrow("id")));
        obj.put("macAddress", cursor.getString(cursor.getColumnIndexOrThrow("mac_address")));
        obj.put("alertType", cursor.getString(cursor.getColumnIndexOrThrow("alert_type")));
        obj.put("alertMessage", cursor.getString(cursor.getColumnIndexOrThrow("alert_message")));
        obj.put("severity", cursor.getString(cursor.getColumnIndexOrThrow("severity")));
        obj.put("isRead", cursor.getInt(cursor.getColumnIndexOrThrow("is_read")) == 1);
        obj.put("createdAt", cursor.getLong(cursor.getColumnIndexOrThrow("created_at")));
        return obj;
    }
}
