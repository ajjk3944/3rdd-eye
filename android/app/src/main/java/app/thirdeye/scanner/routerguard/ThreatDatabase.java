package app.thirdeye.scanner.routerguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.getcapacitor.JSObject;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ThreatDatabase extends SQLiteOpenHelper {
    private static final String TAG = "ThreatDatabase";
    private static final String DB_NAME = "threat_data.db";
    private static final int DB_VERSION = 1;
    
    private static final String TABLE_REPORTS = "threat_reports";
    private static final String TABLE_HISTORY = "threat_history";
    private static final String TABLE_SNAPSHOTS = "network_snapshots";
    
    private static ThreatDatabase instance;
    
    public static synchronized ThreatDatabase getInstance(Context context) {
        if (instance == null) {
            instance = new ThreatDatabase(context.getApplicationContext());
        }
        return instance;
    }
    
    private ThreatDatabase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }
    
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Threat reports table
        db.execSQL("CREATE TABLE " + TABLE_REPORTS + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "mac_address TEXT NOT NULL," +
                "device_name TEXT," +
                "threat_level INTEGER NOT NULL," +
                "threat_score INTEGER NOT NULL," +
                "findings_json TEXT NOT NULL," +
                "summary TEXT NOT NULL," +
                "analyzed_at INTEGER NOT NULL," +
                "is_dismissed INTEGER DEFAULT 0" +
                ")");
        
        // Threat history table
        db.execSQL("CREATE TABLE " + TABLE_HISTORY + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "mac_address TEXT NOT NULL," +
                "threat_score INTEGER NOT NULL," +
                "recorded_at INTEGER NOT NULL" +
                ")");
        
        // Network snapshots table
        db.execSQL("CREATE TABLE " + TABLE_SNAPSHOTS + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "online_count INTEGER NOT NULL," +
                "trusted_count INTEGER NOT NULL," +
                "untrusted_count INTEGER NOT NULL," +
                "threat_count INTEGER NOT NULL," +
                "snapshot_at INTEGER NOT NULL" +
                ")");
        
        // Create indexes
        db.execSQL("CREATE INDEX idx_reports_mac ON " + TABLE_REPORTS + "(mac_address)");
        db.execSQL("CREATE INDEX idx_history_mac ON " + TABLE_HISTORY + "(mac_address)");
        db.execSQL("CREATE INDEX idx_snapshots_time ON " + TABLE_SNAPSHOTS + "(snapshot_at)");
    }
    
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Future upgrades
    }
    
    // Threat Reports
    public long saveThreatReport(ThreatDetector.ThreatReport report) {
        SQLiteDatabase db = getWritableDatabase();
        
        // Convert findings to JSON
        JSONArray findingsArray = new JSONArray();
        try {
            for (ThreatDetector.ThreatFinding finding : report.findings) {
                JSONObject findingObj = new JSONObject();
                findingObj.put("ruleId", finding.ruleId);
                findingObj.put("ruleName", finding.ruleName);
                findingObj.put("description", finding.description);
                findingObj.put("severity", finding.severity);
                findingObj.put("scoreContribution", finding.scoreContribution);
                findingObj.put("recommendation", finding.recommendation);
                findingsArray.put(findingObj);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error converting findings to JSON: " + e.getMessage());
        }
        
        ContentValues values = new ContentValues();
        values.put("mac_address", report.macAddress);
        values.put("device_name", report.deviceName);
        values.put("threat_level", report.overallThreatLevel);
        values.put("threat_score", report.threatScore);
        values.put("findings_json", findingsArray.toString());
        values.put("summary", report.summary);
        values.put("analyzed_at", report.analyzedAt);
        values.put("is_dismissed", report.isDismissed ? 1 : 0);
        
        long id = db.insert(TABLE_REPORTS, null, values);
        Log.d(TAG, "Saved threat report for " + report.macAddress + " with score " + report.threatScore);
        
        // Auto-purge old reports (keep last 30 days)
        long thirtyDaysAgo = System.currentTimeMillis() - (30L * 24 * 60 * 60 * 1000);
        db.delete(TABLE_REPORTS, "analyzed_at < ?", new String[]{String.valueOf(thirtyDaysAgo)});
        
        return id;
    }
    
    public ThreatDetector.ThreatReport getLatestReport(String macAddress) {
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(TABLE_REPORTS, null, "mac_address = ?", 
            new String[]{macAddress}, null, null, "analyzed_at DESC", "1");
        
        ThreatDetector.ThreatReport report = null;
        if (cursor.moveToFirst()) {
            report = cursorToThreatReport(cursor);
        }
        cursor.close();
        return report;
    }
    
    public List<ThreatDetector.ThreatReport> getAllActiveThreats() {
        List<ThreatDetector.ThreatReport> reports = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        
        // Get latest report for each device where score > 10 and not dismissed
        Cursor cursor = db.rawQuery(
            "SELECT * FROM " + TABLE_REPORTS + " WHERE is_dismissed = 0 AND threat_score > 10 " +
            "AND id IN (SELECT MAX(id) FROM " + TABLE_REPORTS + " GROUP BY mac_address) " +
            "ORDER BY threat_score DESC", null);
        
        while (cursor.moveToNext()) {
            reports.add(cursorToThreatReport(cursor));
        }
        cursor.close();
        return reports;
    }
    
    public List<ThreatDetector.ThreatReport> getHighThreats() {
        List<ThreatDetector.ThreatReport> reports = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        
        // Get latest report for each device where threat_level >= HIGH
        Cursor cursor = db.rawQuery(
            "SELECT * FROM " + TABLE_REPORTS + " WHERE is_dismissed = 0 AND threat_level >= ? " +
            "AND id IN (SELECT MAX(id) FROM " + TABLE_REPORTS + " GROUP BY mac_address) " +
            "ORDER BY threat_score DESC", 
            new String[]{String.valueOf(ThreatDetector.THREAT_HIGH)});
        
        while (cursor.moveToNext()) {
            reports.add(cursorToThreatReport(cursor));
        }
        cursor.close();
        return reports;
    }
    
    public void dismissThreat(int reportId) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("is_dismissed", 1);
        db.update(TABLE_REPORTS, values, "id = ?", new String[]{String.valueOf(reportId)});
        Log.d(TAG, "Dismissed threat report: " + reportId);
    }
    
    public void dismissAllForDevice(String macAddress) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("is_dismissed", 1);
        db.update(TABLE_REPORTS, values, "mac_address = ?", new String[]{macAddress});
        Log.d(TAG, "Dismissed all threats for device: " + macAddress);
    }
    
    // Threat History
    public void recordThreatScore(String macAddress, int score) {
        SQLiteDatabase db = getWritableDatabase();
        
        ContentValues values = new ContentValues();
        values.put("mac_address", macAddress);
        values.put("threat_score", score);
        values.put("recorded_at", System.currentTimeMillis());
        
        db.insert(TABLE_HISTORY, null, values);
        
        // Auto-purge old history (keep last 30 days)
        long thirtyDaysAgo = System.currentTimeMillis() - (30L * 24 * 60 * 60 * 1000);
        db.delete(TABLE_HISTORY, "recorded_at < ?", new String[]{String.valueOf(thirtyDaysAgo)});
    }
    
    public List<JSObject> getThreatTrend(String macAddress, int days) {
        List<JSObject> trend = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        
        long startTime = System.currentTimeMillis() - (days * 24L * 60 * 60 * 1000);
        
        Cursor cursor = db.query(TABLE_HISTORY, 
            new String[]{"threat_score", "recorded_at"}, 
            "mac_address = ? AND recorded_at >= ?", 
            new String[]{macAddress, String.valueOf(startTime)}, 
            null, null, "recorded_at ASC");
        
        while (cursor.moveToNext()) {
            JSObject point = new JSObject();
            point.put("score", cursor.getInt(0));
            point.put("timestamp", cursor.getLong(1));
            trend.add(point);
        }
        cursor.close();
        return trend;
    }
    
    // Network Snapshots
    public void saveNetworkSnapshot(int online, int trusted, int untrusted, int threats) {
        SQLiteDatabase db = getWritableDatabase();
        
        ContentValues values = new ContentValues();
        values.put("online_count", online);
        values.put("trusted_count", trusted);
        values.put("untrusted_count", untrusted);
        values.put("threat_count", threats);
        values.put("snapshot_at", System.currentTimeMillis());
        
        db.insert(TABLE_SNAPSHOTS, null, values);
        
        // Auto-purge old snapshots (keep last 7 days)
        long sevenDaysAgo = System.currentTimeMillis() - (7L * 24 * 60 * 60 * 1000);
        db.delete(TABLE_SNAPSHOTS, "snapshot_at < ?", new String[]{String.valueOf(sevenDaysAgo)});
    }
    
    public List<JSObject> getNetworkHistory(int hours) {
        List<JSObject> history = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        
        long startTime = System.currentTimeMillis() - (hours * 60L * 60 * 1000);
        
        Cursor cursor = db.query(TABLE_SNAPSHOTS, null, 
            "snapshot_at >= ?", new String[]{String.valueOf(startTime)}, 
            null, null, "snapshot_at ASC");
        
        while (cursor.moveToNext()) {
            JSObject snapshot = new JSObject();
            snapshot.put("id", cursor.getInt(cursor.getColumnIndexOrThrow("id")));
            snapshot.put("onlineCount", cursor.getInt(cursor.getColumnIndexOrThrow("online_count")));
            snapshot.put("trustedCount", cursor.getInt(cursor.getColumnIndexOrThrow("trusted_count")));
            snapshot.put("untrustedCount", cursor.getInt(cursor.getColumnIndexOrThrow("untrusted_count")));
            snapshot.put("threatCount", cursor.getInt(cursor.getColumnIndexOrThrow("threat_count")));
            snapshot.put("snapshotAt", cursor.getLong(cursor.getColumnIndexOrThrow("snapshot_at")));
            history.add(snapshot);
        }
        cursor.close();
        return history;
    }
    
    public int getAverageDeviceCount(int days) {
        SQLiteDatabase db = getReadableDatabase();
        
        long startTime = System.currentTimeMillis() - (days * 24L * 60 * 60 * 1000);
        
        Cursor cursor = db.rawQuery(
            "SELECT AVG(online_count) FROM " + TABLE_SNAPSHOTS + " WHERE snapshot_at >= ?",
            new String[]{String.valueOf(startTime)});
        
        int avg = 0;
        if (cursor.moveToFirst()) {
            avg = cursor.getInt(0);
        }
        cursor.close();
        return avg;
    }
    
    // Helper methods
    private ThreatDetector.ThreatReport cursorToThreatReport(Cursor cursor) {
        ThreatDetector.ThreatReport report = new ThreatDetector.ThreatReport();
        
        report.macAddress = cursor.getString(cursor.getColumnIndexOrThrow("mac_address"));
        report.deviceName = cursor.getString(cursor.getColumnIndexOrThrow("device_name"));
        report.overallThreatLevel = cursor.getInt(cursor.getColumnIndexOrThrow("threat_level"));
        report.threatScore = cursor.getInt(cursor.getColumnIndexOrThrow("threat_score"));
        report.summary = cursor.getString(cursor.getColumnIndexOrThrow("summary"));
        report.analyzedAt = cursor.getLong(cursor.getColumnIndexOrThrow("analyzed_at"));
        report.isDismissed = cursor.getInt(cursor.getColumnIndexOrThrow("is_dismissed")) == 1;
        
        // Parse findings JSON
        String findingsJson = cursor.getString(cursor.getColumnIndexOrThrow("findings_json"));
        report.findings = new ArrayList<>();
        
        try {
            JSONArray findingsArray = new JSONArray(findingsJson);
            for (int i = 0; i < findingsArray.length(); i++) {
                JSONObject findingObj = findingsArray.getJSONObject(i);
                ThreatDetector.ThreatFinding finding = new ThreatDetector.ThreatFinding(
                    findingObj.getString("ruleId"),
                    findingObj.getString("ruleName"),
                    findingObj.getString("description"),
                    findingObj.getInt("severity"),
                    findingObj.getInt("scoreContribution"),
                    findingObj.getString("recommendation")
                );
                report.findings.add(finding);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error parsing findings JSON: " + e.getMessage());
        }
        
        return report;
    }
}
