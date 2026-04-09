package app.thirdeye.scanner;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

/**
 * SQLite database for storing device information and history.
 * 
 * TABLE: saved_devices
 *   mac_address     TEXT PRIMARY KEY
 *   custom_name     TEXT
 *   vendor          TEXT
 *   device_type     TEXT DEFAULT 'unknown'
 *   ip_address      TEXT
 *   hostname        TEXT
 *   notes           TEXT
 *   is_favorite     INTEGER DEFAULT 0
 *   first_seen      INTEGER NOT NULL
 *   last_seen       INTEGER NOT NULL
 *   times_seen      INTEGER DEFAULT 1
 */
public class DeviceDatabase extends SQLiteOpenHelper {
    private static final String TAG = "DeviceDatabase";
    private static final String DATABASE_NAME = "device_scanner.db";
    private static final int DATABASE_VERSION = 1;
    
    private static final String TABLE_DEVICES = "saved_devices";
    
    // Column names
    private static final String COL_MAC = "mac_address";
    private static final String COL_CUSTOM_NAME = "custom_name";
    private static final String COL_VENDOR = "vendor";
    private static final String COL_DEVICE_TYPE = "device_type";
    private static final String COL_IP = "ip_address";
    private static final String COL_HOSTNAME = "hostname";
    private static final String COL_NOTES = "notes";
    private static final String COL_IS_FAVORITE = "is_favorite";
    private static final String COL_FIRST_SEEN = "first_seen";
    private static final String COL_LAST_SEEN = "last_seen";
    private static final String COL_TIMES_SEEN = "times_seen";
    
    private static DeviceDatabase instance;
    
    public static synchronized DeviceDatabase getInstance(Context context) {
        if (instance == null) {
            instance = new DeviceDatabase(context.getApplicationContext());
        }
        return instance;
    }

    private DeviceDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_DEVICES + " (" +
                COL_MAC + " TEXT PRIMARY KEY, " +
                COL_CUSTOM_NAME + " TEXT, " +
                COL_VENDOR + " TEXT, " +
                COL_DEVICE_TYPE + " TEXT DEFAULT 'unknown', " +
                COL_IP + " TEXT, " +
                COL_HOSTNAME + " TEXT, " +
                COL_NOTES + " TEXT, " +
                COL_IS_FAVORITE + " INTEGER DEFAULT 0, " +
                COL_FIRST_SEEN + " INTEGER NOT NULL, " +
                COL_LAST_SEEN + " INTEGER NOT NULL, " +
                COL_TIMES_SEEN + " INTEGER DEFAULT 1" +
                ")";
        db.execSQL(CREATE_TABLE);
    }
    
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DEVICES);
        onCreate(db);
    }
    
    /**
     * Save or update device information
     */
    public void saveOrUpdate(String mac, String ip, String hostname, String vendor, String deviceType) {
        if (mac == null) return;
        
        mac = normalizeMac(mac);
        long now = System.currentTimeMillis();
        
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.query(TABLE_DEVICES, null, COL_MAC + "=?", new String[]{mac}, null, null, null);
        
        ContentValues values = new ContentValues();
        values.put(COL_IP, ip);
        values.put(COL_HOSTNAME, hostname);
        values.put(COL_VENDOR, vendor);
        values.put(COL_DEVICE_TYPE, deviceType);
        values.put(COL_LAST_SEEN, now);
        
        if (cursor.moveToFirst()) {
            // Update existing device
            int timesSeen = cursor.getInt(cursor.getColumnIndexOrThrow(COL_TIMES_SEEN));
            values.put(COL_TIMES_SEEN, timesSeen + 1);
            db.update(TABLE_DEVICES, values, COL_MAC + "=?", new String[]{mac});
        } else {
            // Insert new device
            values.put(COL_MAC, mac);
            values.put(COL_FIRST_SEEN, now);
            values.put(COL_TIMES_SEEN, 1);
            values.put(COL_IS_FAVORITE, 0);
            db.insert(TABLE_DEVICES, null, values);
        }
        
        cursor.close();
    }

    /**
     * Get single device by MAC address
     */
    public JSObject getDevice(String mac) {
        if (mac == null) return null;
        
        mac = normalizeMac(mac);
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_DEVICES, null, COL_MAC + "=?", new String[]{mac}, null, null, null);
        
        JSObject device = null;
        if (cursor.moveToFirst()) {
            device = cursorToJSObject(cursor);
        }
        
        cursor.close();
        return device;
    }
    
    /**
     * Get all saved devices, sorted by last_seen DESC
     */
    public List<JSObject> getAllDevices() {
        List<JSObject> devices = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_DEVICES, null, null, null, null, null, COL_LAST_SEEN + " DESC");
        
        while (cursor.moveToNext()) {
            devices.add(cursorToJSObject(cursor));
        }
        
        cursor.close();
        return devices;
    }
    
    /**
     * Set custom name for device
     */
    public void setCustomName(String mac, String customName) {
        if (mac == null) return;
        
        mac = normalizeMac(mac);
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_CUSTOM_NAME, customName);
        db.update(TABLE_DEVICES, values, COL_MAC + "=?", new String[]{mac});
    }
    
    /**
     * Set device type
     */
    public void setDeviceType(String mac, String deviceType) {
        if (mac == null) return;
        
        mac = normalizeMac(mac);
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_DEVICE_TYPE, deviceType);
        db.update(TABLE_DEVICES, values, COL_MAC + "=?", new String[]{mac});
    }
    
    /**
     * Set notes for device
     */
    public void setNotes(String mac, String notes) {
        if (mac == null) return;
        
        mac = normalizeMac(mac);
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_NOTES, notes);
        db.update(TABLE_DEVICES, values, COL_MAC + "=?", new String[]{mac});
    }

    /**
     * Toggle favorite status
     */
    public boolean toggleFavorite(String mac) {
        if (mac == null) return false;
        
        mac = normalizeMac(mac);
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.query(TABLE_DEVICES, new String[]{COL_IS_FAVORITE}, COL_MAC + "=?", new String[]{mac}, null, null, null);
        
        boolean newFavoriteStatus = false;
        if (cursor.moveToFirst()) {
            int currentStatus = cursor.getInt(0);
            newFavoriteStatus = currentStatus == 0;
            
            ContentValues values = new ContentValues();
            values.put(COL_IS_FAVORITE, newFavoriteStatus ? 1 : 0);
            db.update(TABLE_DEVICES, values, COL_MAC + "=?", new String[]{mac});
        }
        
        cursor.close();
        return newFavoriteStatus;
    }
    
    /**
     * Delete device from history
     */
    public void deleteDevice(String mac) {
        if (mac == null) return;
        
        mac = normalizeMac(mac);
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_DEVICES, COL_MAC + "=?", new String[]{mac});
    }
    
    /**
     * Clear all devices
     */
    public void clearAll() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_DEVICES, null, null);
    }
    
    /**
     * Get device count
     */
    public int getDeviceCount() {
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
     * Normalize MAC address to uppercase with colons
     */
    private String normalizeMac(String mac) {
        if (mac == null) return null;
        return mac.replaceAll("[:-]", "").toUpperCase().replaceAll("(.{2})", "$1:").replaceAll(":$", "");
    }
    
    /**
     * Convert cursor to JSObject
     */
    private JSObject cursorToJSObject(Cursor cursor) {
        JSObject obj = new JSObject();
        obj.put("macAddress", cursor.getString(cursor.getColumnIndexOrThrow(COL_MAC)));
        obj.put("customName", cursor.getString(cursor.getColumnIndexOrThrow(COL_CUSTOM_NAME)));
        obj.put("vendor", cursor.getString(cursor.getColumnIndexOrThrow(COL_VENDOR)));
        obj.put("deviceType", cursor.getString(cursor.getColumnIndexOrThrow(COL_DEVICE_TYPE)));
        obj.put("ipAddress", cursor.getString(cursor.getColumnIndexOrThrow(COL_IP)));
        obj.put("hostname", cursor.getString(cursor.getColumnIndexOrThrow(COL_HOSTNAME)));
        obj.put("notes", cursor.getString(cursor.getColumnIndexOrThrow(COL_NOTES)));
        obj.put("isFavorite", cursor.getInt(cursor.getColumnIndexOrThrow(COL_IS_FAVORITE)) == 1);
        obj.put("firstSeen", cursor.getLong(cursor.getColumnIndexOrThrow(COL_FIRST_SEEN)));
        obj.put("lastSeen", cursor.getLong(cursor.getColumnIndexOrThrow(COL_LAST_SEEN)));
        obj.put("timesSeen", cursor.getInt(cursor.getColumnIndexOrThrow(COL_TIMES_SEEN)));
        return obj;
    }
}
