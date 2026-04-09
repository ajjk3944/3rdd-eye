package app.thirdeye.scanner.network;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.getcapacitor.JSObject;

import java.util.ArrayList;
import java.util.List;

public class SavedWifiDatabase extends SQLiteOpenHelper {
    private static final String DB_NAME = "saved_wifi.db";
    private static final int DB_VERSION = 2;
    private static final String TABLE_NAME = "saved_wifi";

    private static SavedWifiDatabase instance;

    public static synchronized SavedWifiDatabase getInstance(Context context) {
        if (instance == null) {
            instance = new SavedWifiDatabase(context.getApplicationContext());
        }
        return instance;
    }

    private SavedWifiDatabase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "ssid TEXT UNIQUE," +
                "password TEXT," +
                "bssid TEXT," +
                "security TEXT DEFAULT ''," +
                "saved_at INTEGER," +
                "last_connected INTEGER" +
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 2) {
            // Add security column if upgrading from version 1
            try {
                db.execSQL("ALTER TABLE " + TABLE_NAME + " ADD COLUMN security TEXT DEFAULT ''");
            } catch (Exception e) {
                // Column might already exist
            }
        }
    }

    // Original method (kept for backward compatibility with WiFiScannerPlugin.java)
    public void saveWifi(String ssid, String password, String bssid) {
        saveWifi(ssid, password, bssid, "");
    }

    // New method with security parameter
    public void saveWifi(String ssid, String password, String bssid, String security) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("ssid", ssid);
        values.put("password", password);
        values.put("bssid", bssid);
        values.put("security", security != null ? security : "");
        values.put("saved_at", System.currentTimeMillis());
        values.put("last_connected", System.currentTimeMillis());

        // Insert or update if SSID already exists
        db.insertWithOnConflict(TABLE_NAME, null, values, SQLiteDatabase.CONFLICT_REPLACE);
    }

    public void deleteWifi(String ssid) {
        SQLiteDatabase db = getWritableDatabase();
        db.delete(TABLE_NAME, "ssid = ?", new String[]{ssid});
    }

    public List<JSObject> getAllSavedWifi() {
        List<JSObject> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(TABLE_NAME, null, null, null, null, null, "last_connected DESC");

        while (cursor.moveToNext()) {
            JSObject wifi = new JSObject();
            try {
                int idIndex = cursor.getColumnIndex("id");
                wifi.put("id", idIndex >= 0 ? String.valueOf(cursor.getInt(idIndex)) : "");

                wifi.put("ssid", cursor.getString(cursor.getColumnIndexOrThrow("ssid")));
                wifi.put("password", cursor.getString(cursor.getColumnIndexOrThrow("password")));
                wifi.put("bssid", cursor.getString(cursor.getColumnIndexOrThrow("bssid")));

                // Safely get security column
                int securityIndex = cursor.getColumnIndex("security");
                wifi.put("security", securityIndex >= 0 ? cursor.getString(securityIndex) : "WPA2");

                wifi.put("source", "app_database");
                wifi.put("savedAt", cursor.getLong(cursor.getColumnIndexOrThrow("saved_at")));
                wifi.put("lastConnected", cursor.getLong(cursor.getColumnIndexOrThrow("last_connected")));

                // Add formatted dates for frontend
                long savedAt = cursor.getLong(cursor.getColumnIndexOrThrow("saved_at"));
                long lastConnected = cursor.getLong(cursor.getColumnIndexOrThrow("last_connected"));

                wifi.put("addedAt", new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'",
                        java.util.Locale.US).format(new java.util.Date(savedAt)));
                wifi.put("lastConnectedAt", new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'",
                        java.util.Locale.US).format(new java.util.Date(lastConnected)));

                list.add(wifi);
            } catch (Exception e) {
                continue;
            }
        }
        cursor.close();
        return list;
    }
}
