package app.thirdeye.scanner.iot;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SQLite database for storing discovered IoT devices, rooms, and security findings.
 */
public class IoTDeviceDatabase extends SQLiteOpenHelper {
    private static final String TAG = "ThirdEye-IoT";
    private static final String DATABASE_NAME = "iot_devices.db";
    private static final int DATABASE_VERSION = 1;
    
    // Table names
    private static final String TABLE_DEVICES = "iot_devices";
    private static final String TABLE_ROOMS = "iot_rooms";
    private static final String TABLE_FINDINGS = "iot_security_findings";
    
    private static IoTDeviceDatabase instance;
    
    public static synchronized IoTDeviceDatabase getInstance(Context context) {
        if (instance == null) {
            instance = new IoTDeviceDatabase(context.getApplicationContext());
        }
        return instance;
    }

    private IoTDeviceDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create iot_devices table
        String createDevicesTable = "CREATE TABLE " + TABLE_DEVICES + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "ip_address TEXT NOT NULL, " +
                "mac_address TEXT, " +
                "hostname TEXT, " +
                "device_name TEXT, " +
                "manufacturer TEXT, " +
                "device_type TEXT, " +
                "device_model TEXT, " +
                "room_id INTEGER DEFAULT 0, " +
                "first_seen INTEGER, " +
                "last_seen INTEGER, " +
                "is_online INTEGER DEFAULT 1, " +
                "open_ports TEXT, " +
                "services TEXT, " +
                "security_score INTEGER DEFAULT -1, " +
                "security_issues TEXT, " +
                "notes TEXT, " +
                "icon_type TEXT DEFAULT 'other', " +
                "platform TEXT" +
                ")";
        db.execSQL(createDevicesTable);
        
        // Create iot_rooms table
        String createRoomsTable = "CREATE TABLE " + TABLE_ROOMS + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name TEXT NOT NULL, " +
                "icon TEXT DEFAULT 'home', " +
                "device_count INTEGER DEFAULT 0, " +
                "created_at INTEGER" +
                ")";
        db.execSQL(createRoomsTable);
        
        // Create iot_security_findings table
        String createFindingsTable = "CREATE TABLE " + TABLE_FINDINGS + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "device_id INTEGER, " +
                "finding_type TEXT, " +
                "severity TEXT, " +
                "title TEXT, " +
                "description TEXT, " +
                "recommendation TEXT, " +
                "found_at INTEGER, " +
                "FOREIGN KEY (device_id) REFERENCES " + TABLE_DEVICES + "(id) ON DELETE CASCADE" +
                ")";
        db.execSQL(createFindingsTable);
        
        Log.d(TAG, "IoT Device Database created");
    }
    
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_FINDINGS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DEVICES);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ROOMS);
        onCreate(db);
    }
    
    // ========== DEVICE METHODS ==========
    
    /**
     * Insert or update device (upsert by MAC address)
     */
    public synchronized long insertDevice(JSObject device) {
        SQLiteDatabase db = this.getWritableDatabase();
        String macAddress = device.getString("macAddress");
        
        if (macAddress == null || macAddress.isEmpty()) {
            return -1;
        }
        
        ContentValues values = new ContentValues();
        values.put("ip_address", device.getString("ipAddress"));
        values.put("mac_address", macAddress);
        values.put("hostname", device.getString("hostname"));
        values.put("device_name", device.getString("deviceName"));
        values.put("manufacturer", device.getString("manufacturer"));
        values.put("device_type", device.getString("deviceType"));
        values.put("device_model", device.getString("deviceModel"));
        values.put("room_id", device.getInteger("roomId", 0));
        values.put("last_seen", System.currentTimeMillis());
        values.put("is_online", device.getInteger("isOnline", 1));
        values.put("open_ports", device.getString("openPorts"));
        values.put("services", device.getString("services"));
        values.put("security_score", device.getInteger("securityScore", -1));
        values.put("security_issues", device.getString("securityIssues"));
        values.put("notes", device.getString("notes"));
        values.put("icon_type", device.getString("iconType", "other"));
        values.put("platform", device.getString("platform"));
        
        // Check if device exists
        Cursor cursor = db.query(TABLE_DEVICES, new String[]{"id", "first_seen"}, 
                "mac_address=?", new String[]{macAddress}, null, null, null);
        
        long id;
        if (cursor.moveToFirst()) {
            // Update existing device
            id = cursor.getLong(0);
            long firstSeen = cursor.getLong(1);
            values.put("first_seen", firstSeen);
            db.update(TABLE_DEVICES, values, "id=?", new String[]{String.valueOf(id)});
        } else {
            // Insert new device
            values.put("first_seen", System.currentTimeMillis());
            id = db.insert(TABLE_DEVICES, null, values);
        }
        
        cursor.close();
        return id;
    }
    
    /**
     * Get all devices
     */
    public synchronized JSArray getAllDevices() {
        JSArray devices = new JSArray();
        SQLiteDatabase db = this.getReadableDatabase();
        
        Cursor cursor = db.query(TABLE_DEVICES, null, null, null, null, null, "last_seen DESC");
        
        while (cursor.moveToNext()) {
            devices.put(cursorToDevice(cursor));
        }
        
        cursor.close();
        return devices;
    }
    
    /**
     * Get device by ID
     */
    public synchronized JSObject getDeviceById(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_DEVICES, null, "id=?", 
                new String[]{String.valueOf(id)}, null, null, null);
        
        JSObject device = null;
        if (cursor.moveToFirst()) {
            device = cursorToDevice(cursor);
        }
        
        cursor.close();
        return device;
    }
    
    /**
     * Get devices by room
     */
    public synchronized JSArray getDevicesByRoom(int roomId) {
        JSArray devices = new JSArray();
        SQLiteDatabase db = this.getReadableDatabase();
        
        Cursor cursor = db.query(TABLE_DEVICES, null, "room_id=?", 
                new String[]{String.valueOf(roomId)}, null, null, "device_name ASC");
        
        while (cursor.moveToNext()) {
            devices.put(cursorToDevice(cursor));
        }
        
        cursor.close();
        return devices;
    }
    
    /**
     * Get devices by type
     */
    public synchronized JSArray getDevicesByType(String type) {
        JSArray devices = new JSArray();
        SQLiteDatabase db = this.getReadableDatabase();
        
        Cursor cursor = db.query(TABLE_DEVICES, null, "device_type=?", 
                new String[]{type}, null, null, "device_name ASC");
        
        while (cursor.moveToNext()) {
            devices.put(cursorToDevice(cursor));
        }
        
        cursor.close();
        return devices;
    }
    
    /**
     * Get only online devices
     */
    public synchronized JSArray getOnlineDevices() {
        JSArray devices = new JSArray();
        SQLiteDatabase db = this.getReadableDatabase();
        
        Cursor cursor = db.query(TABLE_DEVICES, null, "is_online=1", 
                null, null, null, "last_seen DESC");
        
        while (cursor.moveToNext()) {
            devices.put(cursorToDevice(cursor));
        }
        
        cursor.close();
        return devices;
    }
    
    /**
     * Update device room
     */
    public synchronized boolean updateDeviceRoom(int deviceId, int roomId) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("room_id", roomId);
        
        int rows = db.update(TABLE_DEVICES, values, "id=?", new String[]{String.valueOf(deviceId)});
        return rows > 0;
    }
    
    /**
     * Update device name
     */
    public synchronized boolean updateDeviceName(int deviceId, String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("device_name", name);
        
        int rows = db.update(TABLE_DEVICES, values, "id=?", new String[]{String.valueOf(deviceId)});
        return rows > 0;
    }
    
    /**
     * Delete device
     */
    public synchronized boolean deleteDevice(int deviceId) {
        SQLiteDatabase db = this.getWritableDatabase();
        int rows = db.delete(TABLE_DEVICES, "id=?", new String[]{String.valueOf(deviceId)});
        return rows > 0;
    }
    
    /**
     * Get device count
     */
    public synchronized int getDeviceCount() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT COUNT(*) FROM " + TABLE_DEVICES, null);
        int count = 0;
        if (cursor.moveToFirst()) {
            count = cursor.getInt(0);
        }
        cursor.close();
        return count;
    }
    
    /**
     * Get device count by type
     */
    public synchronized JSObject getDeviceCountByType() {
        JSObject counts = new JSObject();
        SQLiteDatabase db = this.getReadableDatabase();
        
        Cursor cursor = db.rawQuery(
                "SELECT device_type, COUNT(*) as count FROM " + TABLE_DEVICES + 
                " GROUP BY device_type", null);
        
        while (cursor.moveToNext()) {
            String type = cursor.getString(0);
            int count = cursor.getInt(1);
            counts.put(type != null ? type : "other", count);
        }
        
        cursor.close();
        return counts;
    }
    
    // ========== ROOM METHODS ==========
    
    /**
     * Insert room
     */
    public synchronized long insertRoom(String name, String icon) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("icon", icon);
        values.put("device_count", 0);
        values.put("created_at", System.currentTimeMillis());
        
        return db.insert(TABLE_ROOMS, null, values);
    }
    
    /**
     * Get all rooms
     */
    public synchronized JSArray getAllRooms() {
        JSArray rooms = new JSArray();
        SQLiteDatabase db = this.getReadableDatabase();
        
        Cursor cursor = db.query(TABLE_ROOMS, null, null, null, null, null, "name ASC");
        
        while (cursor.moveToNext()) {
            JSObject room = new JSObject();
            room.put("id", cursor.getInt(cursor.getColumnIndexOrThrow("id")));
            room.put("name", cursor.getString(cursor.getColumnIndexOrThrow("name")));
            room.put("icon", cursor.getString(cursor.getColumnIndexOrThrow("icon")));
            room.put("createdAt", cursor.getLong(cursor.getColumnIndexOrThrow("created_at")));
            
            // Count devices in this room
            int roomId = cursor.getInt(cursor.getColumnIndexOrThrow("id"));
            int deviceCount = getDeviceCountInRoom(roomId);
            room.put("deviceCount", deviceCount);
            
            rooms.put(room);
        }
        
        cursor.close();
        return rooms;
    }
    
    /**
     * Update room
     */
    public synchronized boolean updateRoom(int id, String name, String icon) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("icon", icon);
        
        int rows = db.update(TABLE_ROOMS, values, "id=?", new String[]{String.valueOf(id)});
        return rows > 0;
    }
    
    /**
     * Delete room (devices become unassigned)
     */
    public synchronized boolean deleteRoom(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        
        // Set room_id to 0 for all devices in this room
        ContentValues values = new ContentValues();
        values.put("room_id", 0);
        db.update(TABLE_DEVICES, values, "room_id=?", new String[]{String.valueOf(id)});
        
        // Delete the room
        int rows = db.delete(TABLE_ROOMS, "id=?", new String[]{String.valueOf(id)});
        return rows > 0;
    }
    
    /**
     * Get device count in room
     */
    private int getDeviceCountInRoom(int roomId) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT COUNT(*) FROM " + TABLE_DEVICES + 
                " WHERE room_id=?", new String[]{String.valueOf(roomId)});
        int count = 0;
        if (cursor.moveToFirst()) {
            count = cursor.getInt(0);
        }
        cursor.close();
        return count;
    }
    
    // ========== SECURITY FINDINGS METHODS ==========
    
    /**
     * Insert security finding
     */
    public synchronized long insertSecurityFinding(int deviceId, String findingType, 
            String severity, String title, String description, String recommendation) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("device_id", deviceId);
        values.put("finding_type", findingType);
        values.put("severity", severity);
        values.put("title", title);
        values.put("description", description);
        values.put("recommendation", recommendation);
        values.put("found_at", System.currentTimeMillis());
        
        return db.insert(TABLE_FINDINGS, null, values);
    }
    
    /**
     * Get security findings for device
     */
    public synchronized JSArray getSecurityFindings(int deviceId) {
        JSArray findings = new JSArray();
        SQLiteDatabase db = this.getReadableDatabase();
        
        Cursor cursor = db.query(TABLE_FINDINGS, null, "device_id=?", 
                new String[]{String.valueOf(deviceId)}, null, null, "found_at DESC");
        
        while (cursor.moveToNext()) {
            JSObject finding = new JSObject();
            finding.put("id", cursor.getInt(cursor.getColumnIndexOrThrow("id")));
            finding.put("deviceId", cursor.getInt(cursor.getColumnIndexOrThrow("device_id")));
            finding.put("findingType", cursor.getString(cursor.getColumnIndexOrThrow("finding_type")));
            finding.put("severity", cursor.getString(cursor.getColumnIndexOrThrow("severity")));
            finding.put("title", cursor.getString(cursor.getColumnIndexOrThrow("title")));
            finding.put("description", cursor.getString(cursor.getColumnIndexOrThrow("description")));
            finding.put("recommendation", cursor.getString(cursor.getColumnIndexOrThrow("recommendation")));
            finding.put("foundAt", cursor.getLong(cursor.getColumnIndexOrThrow("found_at")));
            
            findings.put(finding);
        }
        
        cursor.close();
        return findings;
    }
    
    /**
     * Get all security findings
     */
    public synchronized JSArray getAllSecurityFindings() {
        JSArray findings = new JSArray();
        SQLiteDatabase db = this.getReadableDatabase();
        
        Cursor cursor = db.query(TABLE_FINDINGS, null, null, null, null, null, "found_at DESC");
        
        while (cursor.moveToNext()) {
            JSObject finding = new JSObject();
            finding.put("id", cursor.getInt(cursor.getColumnIndexOrThrow("id")));
            finding.put("deviceId", cursor.getInt(cursor.getColumnIndexOrThrow("device_id")));
            finding.put("findingType", cursor.getString(cursor.getColumnIndexOrThrow("finding_type")));
            finding.put("severity", cursor.getString(cursor.getColumnIndexOrThrow("severity")));
            finding.put("title", cursor.getString(cursor.getColumnIndexOrThrow("title")));
            finding.put("description", cursor.getString(cursor.getColumnIndexOrThrow("description")));
            finding.put("recommendation", cursor.getString(cursor.getColumnIndexOrThrow("recommendation")));
            finding.put("foundAt", cursor.getLong(cursor.getColumnIndexOrThrow("found_at")));
            
            findings.put(finding);
        }
        
        cursor.close();
        return findings;
    }
    
    /**
     * Get overall security score (average)
     */
    public synchronized int getOverallSecurityScore() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(
                "SELECT AVG(security_score) FROM " + TABLE_DEVICES + 
                " WHERE security_score >= 0", null);
        
        int avgScore = 0;
        if (cursor.moveToFirst()) {
            avgScore = cursor.getInt(0);
        }
        
        cursor.close();
        return avgScore;
    }
    
    /**
     * Get count of findings by severity
     */
    public synchronized int getFindingCountBySeverity(String severity) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(
                "SELECT COUNT(*) FROM " + TABLE_FINDINGS + 
                " WHERE severity=?", new String[]{severity});
        
        int count = 0;
        if (cursor.moveToFirst()) {
            count = cursor.getInt(0);
        }
        
        cursor.close();
        return count;
    }
    
    /**
     * Get count of critical and high severity findings
     */
    public synchronized int getCriticalIssueCount() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(
                "SELECT COUNT(*) FROM " + TABLE_FINDINGS + 
                " WHERE severity IN ('critical', 'high')", null);
        
        int count = 0;
        if (cursor.moveToFirst()) {
            count = cursor.getInt(0);
        }
        
        cursor.close();
        return count;
    }
    
    /**
     * Clear all data
     */
    public synchronized void clearAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_FINDINGS, null, null);
        db.delete(TABLE_DEVICES, null, null);
        db.delete(TABLE_ROOMS, null, null);
        Log.d(TAG, "All IoT data cleared");
    }
    
    /**
     * Convert cursor to device JSObject
     */
    private JSObject cursorToDevice(Cursor cursor) {
        JSObject device = new JSObject();
        device.put("id", cursor.getInt(cursor.getColumnIndexOrThrow("id")));
        device.put("ipAddress", cursor.getString(cursor.getColumnIndexOrThrow("ip_address")));
        device.put("macAddress", cursor.getString(cursor.getColumnIndexOrThrow("mac_address")));
        device.put("hostname", cursor.getString(cursor.getColumnIndexOrThrow("hostname")));
        device.put("deviceName", cursor.getString(cursor.getColumnIndexOrThrow("device_name")));
        device.put("manufacturer", cursor.getString(cursor.getColumnIndexOrThrow("manufacturer")));
        device.put("deviceType", cursor.getString(cursor.getColumnIndexOrThrow("device_type")));
        device.put("deviceModel", cursor.getString(cursor.getColumnIndexOrThrow("device_model")));
        device.put("roomId", cursor.getInt(cursor.getColumnIndexOrThrow("room_id")));
        device.put("firstSeen", cursor.getLong(cursor.getColumnIndexOrThrow("first_seen")));
        device.put("lastSeen", cursor.getLong(cursor.getColumnIndexOrThrow("last_seen")));
        device.put("isOnline", cursor.getInt(cursor.getColumnIndexOrThrow("is_online")) == 1);
        
        // Parse JSON arrays
        String openPortsStr = cursor.getString(cursor.getColumnIndexOrThrow("open_ports"));
        device.put("openPorts", parseJsonArray(openPortsStr));
        
        String servicesStr = cursor.getString(cursor.getColumnIndexOrThrow("services"));
        device.put("services", parseJsonArray(servicesStr));
        
        String securityIssuesStr = cursor.getString(cursor.getColumnIndexOrThrow("security_issues"));
        device.put("securityIssues", parseJsonArray(securityIssuesStr));
        
        device.put("securityScore", cursor.getInt(cursor.getColumnIndexOrThrow("security_score")));
        device.put("notes", cursor.getString(cursor.getColumnIndexOrThrow("notes")));
        device.put("iconType", cursor.getString(cursor.getColumnIndexOrThrow("icon_type")));
        device.put("platform", cursor.getString(cursor.getColumnIndexOrThrow("platform")));
        
        return device;
    }
    
    /**
     * Parse JSON array string
     */
    private JSArray parseJsonArray(String jsonStr) {
        if (jsonStr == null || jsonStr.isEmpty()) {
            return new JSArray();
        }
        
        try {
            return JSArray.from(new JSONArray(jsonStr));
        } catch (JSONException e) {
            Log.e(TAG, "Error parsing JSON array: " + jsonStr, e);
            return new JSArray();
        }
    }
}
