package app.thirdeye.scanner.sniffer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.getcapacitor.JSObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class TrafficLogDatabase extends SQLiteOpenHelper {
    private static final String TAG = "TrafficLogDatabase";
    private static final String DB_NAME = "traffic_sniffer.db";
    private static final int DB_VERSION = 1;

    // Table names
    private static final String TABLE_CONNECTION_LOGS = "connection_logs";
    private static final String TABLE_APP_TRAFFIC_SUMMARY = "app_traffic_summary";
    private static final String TABLE_COUNTRY_TRAFFIC = "country_traffic";

    private static TrafficLogDatabase instance;

    public static synchronized TrafficLogDatabase getInstance(Context context) {
        if (instance == null) {
            instance = new TrafficLogDatabase(context.getApplicationContext());
        }
        return instance;
    }

    private TrafficLogDatabase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Connection logs table
        db.execSQL("CREATE TABLE " + TABLE_CONNECTION_LOGS + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "app_package TEXT," +
                "app_name TEXT," +
                "protocol TEXT," +
                "source_ip TEXT," +
                "source_port INTEGER," +
                "destination_ip TEXT," +
                "destination_port INTEGER," +
                "country_name TEXT," +
                "country_code TEXT," +
                "bytes_sent INTEGER DEFAULT 0," +
                "bytes_received INTEGER DEFAULT 0," +
                "is_suspicious INTEGER DEFAULT 0," +
                "suspicious_reason TEXT," +
                "timestamp INTEGER," +
                "session_id TEXT" +
                ")");

        // App traffic summary table
        db.execSQL("CREATE TABLE " + TABLE_APP_TRAFFIC_SUMMARY + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "app_package TEXT," +
                "app_name TEXT," +
                "total_connections INTEGER DEFAULT 0," +
                "total_bytes_sent INTEGER DEFAULT 0," +
                "total_bytes_received INTEGER DEFAULT 0," +
                "unique_countries INTEGER DEFAULT 0," +
                "unique_ips INTEGER DEFAULT 0," +
                "suspicious_count INTEGER DEFAULT 0," +
                "last_active INTEGER," +
                "date TEXT," +
                "UNIQUE(app_package, date)" +
                ")");

        // Country traffic table
        db.execSQL("CREATE TABLE " + TABLE_COUNTRY_TRAFFIC + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "country_code TEXT," +
                "country_name TEXT," +
                "total_connections INTEGER DEFAULT 0," +
                "total_bytes INTEGER DEFAULT 0," +
                "unique_apps INTEGER DEFAULT 0," +
                "date TEXT," +
                "UNIQUE(country_code, date)" +
                ")");

        // Create indexes
        db.execSQL("CREATE INDEX idx_connection_timestamp ON " + TABLE_CONNECTION_LOGS + "(timestamp)");
        db.execSQL("CREATE INDEX idx_connection_app ON " + TABLE_CONNECTION_LOGS + "(app_package)");
        db.execSQL("CREATE INDEX idx_connection_suspicious ON " + TABLE_CONNECTION_LOGS + "(is_suspicious)");
        db.execSQL("CREATE INDEX idx_connection_session ON " + TABLE_CONNECTION_LOGS + "(session_id)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Future upgrades will be handled here
    }

    /**
     * Log a new connection and update aggregates
     */
    public void logConnection(PacketParser.ConnectionInfo info, String appPackage, String appName,
                               String countryName, String countryCode, boolean isSuspicious,
                               String suspiciousReason, String sessionId) {
        SQLiteDatabase db = getWritableDatabase();
        try {
            db.beginTransaction();

            // Insert connection log
            ContentValues values = new ContentValues();
            values.put("app_package", appPackage);
            values.put("app_name", appName);
            values.put("protocol", info.protocol);
            values.put("source_ip", info.sourceIP);
            values.put("source_port", info.sourcePort);
            values.put("destination_ip", info.destinationIP);
            values.put("destination_port", info.destinationPort);
            values.put("country_name", countryName);
            values.put("country_code", countryCode);
            values.put("bytes_sent", 0);
            values.put("bytes_received", info.packetSize);
            values.put("is_suspicious", isSuspicious ? 1 : 0);
            values.put("suspicious_reason", suspiciousReason);
            values.put("timestamp", info.timestamp);
            values.put("session_id", sessionId);

            db.insert(TABLE_CONNECTION_LOGS, null, values);

            // Update app traffic summary
            updateAppTrafficSummary(db, appPackage, appName, info.destinationIP, countryCode, isSuspicious);

            // Update country traffic
            updateCountryTraffic(db, countryCode, countryName, appPackage, info.packetSize);

            db.setTransactionSuccessful();
        } catch (Exception e) {
            Log.e(TAG, "Error logging connection", e);
        } finally {
            db.endTransaction();
        }
    }

    private void updateAppTrafficSummary(SQLiteDatabase db, String appPackage, String appName,
                                          String destinationIP, String countryCode, boolean isSuspicious) {
        String today = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date());

        // Get current counts
        Cursor cursor = db.query(TABLE_APP_TRAFFIC_SUMMARY,
                new String[]{"unique_ips", "unique_countries"},
                "app_package = ? AND date = ?",
                new String[]{appPackage, today},
                null, null, null);

        int uniqueIps = 0;
        int uniqueCountries = 0;

        if (cursor.moveToFirst()) {
            uniqueIps = cursor.getInt(0);
            uniqueCountries = cursor.getInt(1);
        }
        cursor.close();

        // Count unique IPs for this app today
        Cursor ipCursor = db.rawQuery(
                "SELECT COUNT(DISTINCT destination_ip) FROM " + TABLE_CONNECTION_LOGS +
                        " WHERE app_package = ? AND date(timestamp/1000, 'unixepoch') = ?",
                new String[]{appPackage, today});
        if (ipCursor.moveToFirst()) {
            uniqueIps = ipCursor.getInt(0);
        }
        ipCursor.close();

        // Count unique countries for this app today
        Cursor countryCursor = db.rawQuery(
                "SELECT COUNT(DISTINCT country_code) FROM " + TABLE_CONNECTION_LOGS +
                        " WHERE app_package = ? AND date(timestamp/1000, 'unixepoch') = ?",
                new String[]{appPackage, today});
        if (countryCursor.moveToFirst()) {
            uniqueCountries = countryCursor.getInt(0);
        }
        countryCursor.close();

        ContentValues values = new ContentValues();
        values.put("app_package", appPackage);
        values.put("app_name", appName);
        values.put("total_connections", 1);
        values.put("unique_ips", uniqueIps);
        values.put("unique_countries", uniqueCountries);
        values.put("suspicious_count", isSuspicious ? 1 : 0);
        values.put("last_active", System.currentTimeMillis());
        values.put("date", today);

        db.insertWithOnConflict(TABLE_APP_TRAFFIC_SUMMARY, null, values, SQLiteDatabase.CONFLICT_IGNORE);

        // Update existing record
        db.execSQL("UPDATE " + TABLE_APP_TRAFFIC_SUMMARY + " SET " +
                        "total_connections = total_connections + 1, " +
                        "unique_ips = ?, " +
                        "unique_countries = ?, " +
                        "suspicious_count = suspicious_count + ?, " +
                        "last_active = ? " +
                        "WHERE app_package = ? AND date = ?",
                new Object[]{uniqueIps, uniqueCountries, isSuspicious ? 1 : 0,
                        System.currentTimeMillis(), appPackage, today});
    }

    private void updateCountryTraffic(SQLiteDatabase db, String countryCode, String countryName,
                                       String appPackage, int bytes) {
        String today = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date());

        // Count unique apps for this country today
        Cursor appCursor = db.rawQuery(
                "SELECT COUNT(DISTINCT app_package) FROM " + TABLE_CONNECTION_LOGS +
                        " WHERE country_code = ? AND date(timestamp/1000, 'unixepoch') = ?",
                new String[]{countryCode, today});
        int uniqueApps = 0;
        if (appCursor.moveToFirst()) {
            uniqueApps = appCursor.getInt(0);
        }
        appCursor.close();

        ContentValues values = new ContentValues();
        values.put("country_code", countryCode);
        values.put("country_name", countryName);
        values.put("total_connections", 1);
        values.put("total_bytes", bytes);
        values.put("unique_apps", uniqueApps);
        values.put("date", today);

        db.insertWithOnConflict(TABLE_COUNTRY_TRAFFIC, null, values, SQLiteDatabase.CONFLICT_IGNORE);

        // Update existing record
        db.execSQL("UPDATE " + TABLE_COUNTRY_TRAFFIC + " SET " +
                        "total_connections = total_connections + 1, " +
                        "total_bytes = total_bytes + ?, " +
                        "unique_apps = ? " +
                        "WHERE country_code = ? AND date = ?",
                new Object[]{bytes, uniqueApps, countryCode, today});
    }

    /**
     * Get recent connections
     */
    public List<JSObject> getRecentConnections(int limit) {
        List<JSObject> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();

        Cursor cursor = db.query(TABLE_CONNECTION_LOGS, null, null, null, null, null,
                "timestamp DESC", String.valueOf(limit));

        while (cursor.moveToNext()) {
            JSObject conn = new JSObject();
            conn.put("id", cursor.getInt(cursor.getColumnIndexOrThrow("id")));
            conn.put("appPackage", cursor.getString(cursor.getColumnIndexOrThrow("app_package")));
            conn.put("appName", cursor.getString(cursor.getColumnIndexOrThrow("app_name")));
            conn.put("protocol", cursor.getString(cursor.getColumnIndexOrThrow("protocol")));
            conn.put("sourceIP", cursor.getString(cursor.getColumnIndexOrThrow("source_ip")));
            conn.put("sourcePort", cursor.getInt(cursor.getColumnIndexOrThrow("source_port")));
            conn.put("destinationIP", cursor.getString(cursor.getColumnIndexOrThrow("destination_ip")));
            conn.put("destinationPort", cursor.getInt(cursor.getColumnIndexOrThrow("destination_port")));
            conn.put("countryName", cursor.getString(cursor.getColumnIndexOrThrow("country_name")));
            conn.put("countryCode", cursor.getString(cursor.getColumnIndexOrThrow("country_code")));
            conn.put("bytesSent", cursor.getInt(cursor.getColumnIndexOrThrow("bytes_sent")));
            conn.put("bytesReceived", cursor.getInt(cursor.getColumnIndexOrThrow("bytes_received")));
            conn.put("isSuspicious", cursor.getInt(cursor.getColumnIndexOrThrow("is_suspicious")) == 1);
            conn.put("suspiciousReason", cursor.getString(cursor.getColumnIndexOrThrow("suspicious_reason")));
            conn.put("timestamp", cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")));
            conn.put("sessionId", cursor.getString(cursor.getColumnIndexOrThrow("session_id")));

            list.add(conn);
        }
        cursor.close();
        return list;
    }

    /**
     * Get app traffic summary for today
     */
    public List<JSObject> getAppTrafficSummary() {
        List<JSObject> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        String today = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date());

        Cursor cursor = db.query(TABLE_APP_TRAFFIC_SUMMARY, null,
                "date = ?", new String[]{today}, null, null,
                "total_connections DESC");

        while (cursor.moveToNext()) {
            JSObject app = new JSObject();
            app.put("appPackage", cursor.getString(cursor.getColumnIndexOrThrow("app_package")));
            app.put("appName", cursor.getString(cursor.getColumnIndexOrThrow("app_name")));
            app.put("totalConnections", cursor.getInt(cursor.getColumnIndexOrThrow("total_connections")));
            app.put("totalBytesSent", cursor.getLong(cursor.getColumnIndexOrThrow("total_bytes_sent")));
            app.put("totalBytesReceived", cursor.getLong(cursor.getColumnIndexOrThrow("total_bytes_received")));
            app.put("uniqueCountries", cursor.getInt(cursor.getColumnIndexOrThrow("unique_countries")));
            app.put("uniqueIps", cursor.getInt(cursor.getColumnIndexOrThrow("unique_ips")));
            app.put("suspiciousCount", cursor.getInt(cursor.getColumnIndexOrThrow("suspicious_count")));
            app.put("lastActive", cursor.getLong(cursor.getColumnIndexOrThrow("last_active")));

            list.add(app);
        }
        cursor.close();
        return list;
    }

    /**
     * Get country traffic for today
     */
    public List<JSObject> getCountryTraffic() {
        List<JSObject> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        String today = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date());

        Cursor cursor = db.query(TABLE_COUNTRY_TRAFFIC, null,
                "date = ?", new String[]{today}, null, null,
                "total_connections DESC");

        while (cursor.moveToNext()) {
            JSObject country = new JSObject();
            country.put("countryCode", cursor.getString(cursor.getColumnIndexOrThrow("country_code")));
            country.put("countryName", cursor.getString(cursor.getColumnIndexOrThrow("country_name")));
            country.put("totalConnections", cursor.getInt(cursor.getColumnIndexOrThrow("total_connections")));
            country.put("totalBytes", cursor.getLong(cursor.getColumnIndexOrThrow("total_bytes")));
            country.put("uniqueApps", cursor.getInt(cursor.getColumnIndexOrThrow("unique_apps")));

            list.add(country);
        }
        cursor.close();
        return list;
    }

    /**
     * Get suspicious connections from last 24 hours
     */
    public List<JSObject> getSuspiciousConnections() {
        List<JSObject> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        long oneDayAgo = System.currentTimeMillis() - (24 * 60 * 60 * 1000);

        Cursor cursor = db.query(TABLE_CONNECTION_LOGS, null,
                "is_suspicious = 1 AND timestamp > ?",
                new String[]{String.valueOf(oneDayAgo)},
                null, null, "timestamp DESC");

        while (cursor.moveToNext()) {
            JSObject conn = new JSObject();
            conn.put("id", cursor.getInt(cursor.getColumnIndexOrThrow("id")));
            conn.put("appPackage", cursor.getString(cursor.getColumnIndexOrThrow("app_package")));
            conn.put("appName", cursor.getString(cursor.getColumnIndexOrThrow("app_name")));
            conn.put("protocol", cursor.getString(cursor.getColumnIndexOrThrow("protocol")));
            conn.put("destinationIP", cursor.getString(cursor.getColumnIndexOrThrow("destination_ip")));
            conn.put("destinationPort", cursor.getInt(cursor.getColumnIndexOrThrow("destination_port")));
            conn.put("countryName", cursor.getString(cursor.getColumnIndexOrThrow("country_name")));
            conn.put("countryCode", cursor.getString(cursor.getColumnIndexOrThrow("country_code")));
            conn.put("suspiciousReason", cursor.getString(cursor.getColumnIndexOrThrow("suspicious_reason")));
            conn.put("timestamp", cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")));

            list.add(conn);
        }
        cursor.close();
        return list;
    }

    /**
     * Get live stats for current session
     */
    public JSObject getLiveStats(String sessionId) {
        JSObject stats = new JSObject();
        SQLiteDatabase db = getReadableDatabase();

        Cursor cursor = db.rawQuery(
                "SELECT COUNT(*) as total_packets, " +
                        "SUM(bytes_received) as total_bytes, " +
                        "COUNT(DISTINCT app_package) as unique_apps, " +
                        "COUNT(DISTINCT country_code) as unique_countries, " +
                        "SUM(is_suspicious) as suspicious_count " +
                        "FROM " + TABLE_CONNECTION_LOGS + " WHERE session_id = ?",
                new String[]{sessionId});

        if (cursor.moveToFirst()) {
            stats.put("totalPackets", cursor.getInt(0));
            stats.put("totalBytes", cursor.getLong(1));
            stats.put("uniqueApps", cursor.getInt(2));
            stats.put("uniqueCountries", cursor.getInt(3));
            stats.put("suspiciousCount", cursor.getInt(4));
        } else {
            stats.put("totalPackets", 0);
            stats.put("totalBytes", 0);
            stats.put("uniqueApps", 0);
            stats.put("uniqueCountries", 0);
            stats.put("suspiciousCount", 0);
        }
        cursor.close();

        return stats;
    }

    /**
     * Clear all logs
     */
    public void clearLogs() {
        SQLiteDatabase db = getWritableDatabase();
        try {
            db.beginTransaction();
            db.delete(TABLE_CONNECTION_LOGS, null, null);
            db.delete(TABLE_APP_TRAFFIC_SUMMARY, null, null);
            db.delete(TABLE_COUNTRY_TRAFFIC, null, null);
            db.setTransactionSuccessful();
            Log.i(TAG, "All logs cleared");
        } catch (Exception e) {
            Log.e(TAG, "Error clearing logs", e);
        } finally {
            db.endTransaction();
        }
    }

    /**
     * Clear old logs
     */
    public void clearOldLogs(int daysToKeep) {
        SQLiteDatabase db = getWritableDatabase();
        long cutoffTime = System.currentTimeMillis() - (daysToKeep * 24L * 60 * 60 * 1000);

        try {
            db.beginTransaction();
            int deleted = db.delete(TABLE_CONNECTION_LOGS, "timestamp < ?",
                    new String[]{String.valueOf(cutoffTime)});
            db.setTransactionSuccessful();
            Log.i(TAG, "Deleted " + deleted + " old connection logs");
        } catch (Exception e) {
            Log.e(TAG, "Error clearing old logs", e);
        } finally {
            db.endTransaction();
        }
    }
}
