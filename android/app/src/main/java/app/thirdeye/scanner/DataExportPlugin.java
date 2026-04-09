package app.thirdeye.scanner;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;

import androidx.core.content.FileProvider;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@CapacitorPlugin(name = "DataExport")
public class DataExportPlugin extends Plugin {
    private static final String TAG = "DataExportPlugin";
    private DeviceDatabase deviceDatabase;

    @Override
    public void load() {
        super.load();
        deviceDatabase = DeviceDatabase.getInstance(getContext());
    }

    @PluginMethod
    public void exportCSV(PluginCall call) {
        try {
            JSArray dataTypesArray = call.getArray("dataTypes");
            if (dataTypesArray == null) {
                call.reject("dataTypes parameter is required");
                return;
            }

            List<String> dataTypes = new ArrayList<>();
            for (int i = 0; i < dataTypesArray.length(); i++) {
                dataTypes.add(dataTypesArray.getString(i));
            }

            StringBuilder csvContent = new StringBuilder();
            
            // Export WiFi Scans
            if (dataTypes.contains("wifi")) {
                csvContent.append("=== WiFi Scan Results ===\n");
                csvContent.append("SSID,BSSID,Signal (dBm),Frequency,Security,Timestamp\n");
                List<String[]> wifiData = getWiFiScans();
                for (String[] row : wifiData) {
                    csvContent.append(String.format("\"%s\",\"%s\",%s,%s,\"%s\",\"%s\"\n",
                        row[0], row[1], row[2], row[3], row[4], row[5]));
                }
                csvContent.append("\n");
            }

            // Export Network Scans
            if (dataTypes.contains("network")) {
                csvContent.append("=== Network Scan Results ===\n");
                csvContent.append("IP,MAC,Hostname,Vendor,Status,Timestamp\n");
                List<String[]> networkData = getNetworkScans();
                for (String[] row : networkData) {
                    csvContent.append(String.format("\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\"\n",
                        row[0], row[1], row[2], row[3], row[4], row[5]));
                }
                csvContent.append("\n");
            }

            // Export Speed Tests
            if (dataTypes.contains("speed")) {
                csvContent.append("=== Speed Test Results ===\n");
                csvContent.append("Download (Mbps),Upload (Mbps),Ping (ms),Server,Timestamp\n");
                List<String[]> speedData = getSpeedTests();
                for (String[] row : speedData) {
                    csvContent.append(String.format("%s,%s,%s,\"%s\",\"%s\"\n",
                        row[0], row[1], row[2], row[3], row[4]));
                }
                csvContent.append("\n");
            }

            // Export Saved WiFi
            if (dataTypes.contains("saved_wifi")) {
                csvContent.append("=== Saved WiFi Networks ===\n");
                csvContent.append("SSID,BSSID,Security,Added At,Last Connected\n");
                List<String[]> savedWifiData = getSavedWifi();
                for (String[] row : savedWifiData) {
                    csvContent.append(String.format("\"%s\",\"%s\",\"%s\",\"%s\",\"%s\"\n",
                        row[0], row[1], row[2], row[3], row[4]));
                }
            }

            // Save file
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
            String fileName = "ThirdEye_Export_" + timestamp + ".csv";
            String filePath = saveFile(fileName, csvContent.toString(), "text/csv");

            if (filePath != null) {
                JSObject result = new JSObject();
                result.put("success", true);
                result.put("filePath", filePath);
                result.put("fileName", fileName);
                call.resolve(result);
            } else {
                call.reject("Failed to save CSV file");
            }
        } catch (Exception e) {
            Log.e(TAG, "Error exporting CSV", e);
            call.reject("Error exporting CSV: " + e.getMessage());
        }
    }

    @PluginMethod
    public void exportPDF(PluginCall call) {
        try {
            JSArray dataTypesArray = call.getArray("dataTypes");
            if (dataTypesArray == null) {
                call.reject("dataTypes parameter is required");
                return;
            }

            List<String> dataTypes = new ArrayList<>();
            for (int i = 0; i < dataTypesArray.length(); i++) {
                dataTypes.add(dataTypesArray.getString(i));
            }

            PdfDocument document = new PdfDocument();
            int pageNumber = 1;
            int yPosition = 80;
            PdfDocument.Page page = null;
            Canvas canvas = null;
            Paint paint = new Paint();
            Paint titlePaint = new Paint();
            Paint headerPaint = new Paint();

            // Setup paints
            paint.setColor(Color.BLACK);
            paint.setTextSize(10);
            paint.setAntiAlias(true);

            titlePaint.setColor(Color.BLACK);
            titlePaint.setTextSize(16);
            titlePaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));
            titlePaint.setAntiAlias(true);

            headerPaint.setColor(Color.DKGRAY);
            headerPaint.setTextSize(12);
            headerPaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));
            headerPaint.setAntiAlias(true);

            // Create first page
            PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(595, 842, pageNumber).create();
            page = document.startPage(pageInfo);
            canvas = page.getCanvas();

            // Draw header
            canvas.drawText("ThirdEye - Scan Report", 40, 40, titlePaint);
            String dateStr = new SimpleDateFormat("MMMM dd, yyyy HH:mm", Locale.US).format(new Date());
            canvas.drawText("Generated: " + dateStr, 40, 60, paint);
            canvas.drawLine(40, 70, 555, 70, paint);

            // Export WiFi Scans
            if (dataTypes.contains("wifi")) {
                List<String[]> wifiData = getWiFiScans();
                if (yPosition + 60 > 800) {
                    document.finishPage(page);
                    pageNumber++;
                    pageInfo = new PdfDocument.PageInfo.Builder(595, 842, pageNumber).create();
                    page = document.startPage(pageInfo);
                    canvas = page.getCanvas();
                    yPosition = 40;
                }

                canvas.drawText("WiFi Scan Results (" + wifiData.size() + " entries)", 40, yPosition, headerPaint);
                yPosition += 20;
                canvas.drawText("SSID", 40, yPosition, headerPaint);
                canvas.drawText("Signal", 200, yPosition, headerPaint);
                canvas.drawText("Security", 280, yPosition, headerPaint);
                canvas.drawText("Frequency", 380, yPosition, headerPaint);
                yPosition += 15;

                for (String[] row : wifiData) {
                    if (yPosition > 800) {
                        document.finishPage(page);
                        pageNumber++;
                        pageInfo = new PdfDocument.PageInfo.Builder(595, 842, pageNumber).create();
                        page = document.startPage(pageInfo);
                        canvas = page.getCanvas();
                        yPosition = 40;
                    }
                    String ssid = row[0].length() > 20 ? row[0].substring(0, 20) : row[0];
                    canvas.drawText(ssid, 40, yPosition, paint);
                    canvas.drawText(row[2] + " dBm", 200, yPosition, paint);
                    canvas.drawText(row[4], 280, yPosition, paint);
                    canvas.drawText(row[3] + " MHz", 380, yPosition, paint);
                    yPosition += 15;
                }
                yPosition += 20;
            }

            // Export Network Scans
            if (dataTypes.contains("network")) {
                List<String[]> networkData = getNetworkScans();
                if (yPosition + 60 > 800) {
                    document.finishPage(page);
                    pageNumber++;
                    pageInfo = new PdfDocument.PageInfo.Builder(595, 842, pageNumber).create();
                    page = document.startPage(pageInfo);
                    canvas = page.getCanvas();
                    yPosition = 40;
                }

                canvas.drawText("Network Scan Results (" + networkData.size() + " entries)", 40, yPosition, headerPaint);
                yPosition += 20;
                canvas.drawText("IP Address", 40, yPosition, headerPaint);
                canvas.drawText("MAC Address", 150, yPosition, headerPaint);
                canvas.drawText("Hostname", 300, yPosition, headerPaint);
                canvas.drawText("Status", 450, yPosition, headerPaint);
                yPosition += 15;

                for (String[] row : networkData) {
                    if (yPosition > 800) {
                        document.finishPage(page);
                        pageNumber++;
                        pageInfo = new PdfDocument.PageInfo.Builder(595, 842, pageNumber).create();
                        page = document.startPage(pageInfo);
                        canvas = page.getCanvas();
                        yPosition = 40;
                    }
                    canvas.drawText(row[0], 40, yPosition, paint);
                    canvas.drawText(row[1], 150, yPosition, paint);
                    String hostname = row[2].length() > 15 ? row[2].substring(0, 15) : row[2];
                    canvas.drawText(hostname, 300, yPosition, paint);
                    canvas.drawText(row[4], 450, yPosition, paint);
                    yPosition += 15;
                }
                yPosition += 20;
            }

            // Export Speed Tests
            if (dataTypes.contains("speed")) {
                List<String[]> speedData = getSpeedTests();
                if (yPosition + 60 > 800) {
                    document.finishPage(page);
                    pageNumber++;
                    pageInfo = new PdfDocument.PageInfo.Builder(595, 842, pageNumber).create();
                    page = document.startPage(pageInfo);
                    canvas = page.getCanvas();
                    yPosition = 40;
                }

                canvas.drawText("Speed Test Results (" + speedData.size() + " entries)", 40, yPosition, headerPaint);
                yPosition += 20;
                canvas.drawText("Download", 40, yPosition, headerPaint);
                canvas.drawText("Upload", 150, yPosition, headerPaint);
                canvas.drawText("Ping", 260, yPosition, headerPaint);
                canvas.drawText("Timestamp", 350, yPosition, headerPaint);
                yPosition += 15;

                for (String[] row : speedData) {
                    if (yPosition > 800) {
                        document.finishPage(page);
                        pageNumber++;
                        pageInfo = new PdfDocument.PageInfo.Builder(595, 842, pageNumber).create();
                        page = document.startPage(pageInfo);
                        canvas = page.getCanvas();
                        yPosition = 40;
                    }
                    canvas.drawText(row[0] + " Mbps", 40, yPosition, paint);
                    canvas.drawText(row[1] + " Mbps", 150, yPosition, paint);
                    canvas.drawText(row[2] + " ms", 260, yPosition, paint);
                    canvas.drawText(row[4], 350, yPosition, paint);
                    yPosition += 15;
                }
            }

            // Draw footer
            canvas.drawLine(40, 820, 555, 820, paint);
            canvas.drawText("Generated by ThirdEye v2.0.0", 40, 835, paint);

            document.finishPage(page);

            // Save PDF
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
            String fileName = "ThirdEye_Export_" + timestamp + ".pdf";
            String filePath = savePdfFile(fileName, document);

            document.close();

            if (filePath != null) {
                JSObject result = new JSObject();
                result.put("success", true);
                result.put("filePath", filePath);
                result.put("fileName", fileName);
                call.resolve(result);
            } else {
                call.reject("Failed to save PDF file");
            }
        } catch (Exception e) {
            Log.e(TAG, "Error exporting PDF", e);
            call.reject("Error exporting PDF: " + e.getMessage());
        }
    }

    @PluginMethod
    public void shareFile(PluginCall call) {
        try {
            String filePath = call.getString("filePath");
            String mimeType = call.getString("mimeType", "application/octet-stream");

            if (filePath == null) {
                call.reject("filePath parameter is required");
                return;
            }

            File file = new File(filePath);
            if (!file.exists()) {
                call.reject("File does not exist");
                return;
            }

            Uri fileUri = FileProvider.getUriForFile(
                getContext(),
                getContext().getPackageName() + ".fileprovider",
                file
            );

            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType(mimeType);
            shareIntent.putExtra(Intent.EXTRA_STREAM, fileUri);
            shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);

            Intent chooser = Intent.createChooser(shareIntent, "Share Report");
            chooser.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            getContext().startActivity(chooser);

            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "Error sharing file", e);
            call.reject("Error sharing file: " + e.getMessage());
        }
    }

    @PluginMethod
    public void backupData(PluginCall call) {
        try {
            JSONObject backup = new JSONObject();
            backup.put("app", "ThirdEye");
            backup.put("version", "2.0.0");
            backup.put("backup_date", new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US).format(new Date()));

            JSONObject data = new JSONObject();

            // Backup WiFi scans
            JSONArray wifiScans = new JSONArray();
            List<String[]> wifiData = getWiFiScans();
            for (String[] row : wifiData) {
                JSONObject scan = new JSONObject();
                scan.put("ssid", row[0]);
                scan.put("bssid", row[1]);
                scan.put("signal", row[2]);
                scan.put("frequency", row[3]);
                scan.put("security", row[4]);
                scan.put("timestamp", row[5]);
                wifiScans.put(scan);
            }
            data.put("wifi_scans", wifiScans);

            // Backup network scans
            JSONArray networkScans = new JSONArray();
            List<String[]> networkData = getNetworkScans();
            for (String[] row : networkData) {
                JSONObject scan = new JSONObject();
                scan.put("ip", row[0]);
                scan.put("mac", row[1]);
                scan.put("hostname", row[2]);
                scan.put("vendor", row[3]);
                scan.put("status", row[4]);
                scan.put("timestamp", row[5]);
                networkScans.put(scan);
            }
            data.put("network_scans", networkScans);

            // Backup speed tests
            JSONArray speedTests = new JSONArray();
            List<String[]> speedData = getSpeedTests();
            for (String[] row : speedData) {
                JSONObject test = new JSONObject();
                test.put("download", row[0]);
                test.put("upload", row[1]);
                test.put("ping", row[2]);
                test.put("server", row[3]);
                test.put("timestamp", row[4]);
                speedTests.put(test);
            }
            data.put("speed_tests", speedTests);

            // Backup saved WiFi
            JSONArray savedWifi = new JSONArray();
            List<String[]> savedWifiData = getSavedWifi();
            for (String[] row : savedWifiData) {
                JSONObject wifi = new JSONObject();
                wifi.put("ssid", row[0]);
                wifi.put("bssid", row[1]);
                wifi.put("security", row[2]);
                wifi.put("added_at", row[3]);
                wifi.put("last_connected", row[4]);
                savedWifi.put(wifi);
            }
            data.put("saved_wifi", savedWifi);

            // Backup settings
            SharedPreferences prefs = getContext().getSharedPreferences("ThirdEyePrefs", Context.MODE_PRIVATE);
            JSONObject settings = new JSONObject();
            settings.put("theme", prefs.getString("theme", "cyan"));
            settings.put("language", prefs.getString("language", "en"));
            data.put("settings", settings);

            backup.put("data", data);

            // Save backup file
            String timestamp = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date());
            String fileName = "ThirdEye_Backup_" + timestamp + ".json";
            String filePath = saveFile(fileName, backup.toString(2), "application/json");

            if (filePath != null) {
                JSObject result = new JSObject();
                result.put("success", true);
                result.put("filePath", filePath);
                result.put("fileName", fileName);
                call.resolve(result);
            } else {
                call.reject("Failed to save backup file");
            }
        } catch (Exception e) {
            Log.e(TAG, "Error creating backup", e);
            call.reject("Error creating backup: " + e.getMessage());
        }
    }

    @PluginMethod
    public void restoreData(PluginCall call) {
        try {
            String filePath = call.getString("filePath");
            if (filePath == null) {
                call.reject("filePath parameter is required");
                return;
            }

            File file = new File(filePath);
            if (!file.exists()) {
                call.reject("Backup file does not exist");
                return;
            }

            // Read backup file
            java.io.FileInputStream fis = new java.io.FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            fis.close();
            String jsonStr = new String(data, "UTF-8");

            JSONObject backup = new JSONObject(jsonStr);

            // Validate format
            if (!backup.has("app") || !backup.getString("app").equals("ThirdEye")) {
                call.reject("Invalid backup file format");
                return;
            }

            JSONObject backupData = backup.getJSONObject("data");
            JSObject restoredItems = new JSObject();

            // Note: Actual restoration would require access to the database
            // For now, we'll just count the items
            restoredItems.put("wifiScans", backupData.optJSONArray("wifi_scans").length());
            restoredItems.put("networkScans", backupData.optJSONArray("network_scans").length());
            restoredItems.put("speedTests", backupData.optJSONArray("speed_tests").length());
            restoredItems.put("savedWifi", backupData.optJSONArray("saved_wifi").length());
            restoredItems.put("settings", true);

            JSObject result = new JSObject();
            result.put("success", true);
            result.put("restoredItems", restoredItems);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "Error restoring data", e);
            call.reject("Error restoring data: " + e.getMessage());
        }
    }

    @PluginMethod
    public void pickFile(PluginCall call) {
        try {
            String mimeType = call.getString("mimeType", "application/json");

            Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            intent.setType(mimeType);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            startActivityForResult(call, intent, "pickFileResult");
        } catch (Exception e) {
            Log.e(TAG, "Error picking file", e);
            call.reject("Error picking file: " + e.getMessage());
        }
    }

    @PluginMethod
    public void getDataStats(PluginCall call) {
        try {
            int wifiScans = getWiFiScans().size();
            int networkScans = getNetworkScans().size();
            int speedTests = getSpeedTests().size();
            int savedWifi = getSavedWifi().size();

            // Calculate approximate size
            long totalSize = (wifiScans * 200L) + (networkScans * 150L) + (speedTests * 100L) + (savedWifi * 180L);
            String sizeStr;
            if (totalSize < 1024) {
                sizeStr = totalSize + " B";
            } else if (totalSize < 1024 * 1024) {
                sizeStr = String.format("%.1f KB", totalSize / 1024.0);
            } else {
                sizeStr = String.format("%.1f MB", totalSize / (1024.0 * 1024.0));
            }

            JSObject result = new JSObject();
            result.put("wifiScans", wifiScans);
            result.put("networkScans", networkScans);
            result.put("speedTests", speedTests);
            result.put("savedWifi", savedWifi);
            result.put("totalSize", sizeStr);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "Error getting data stats", e);
            call.reject("Error getting data stats: " + e.getMessage());
        }
    }

    // Helper methods to get data from database
    private List<String[]> getWiFiScans() {
        List<String[]> results = new ArrayList<>();
        try {
            SQLiteDatabase db = deviceDatabase.getReadableDatabase();
            Cursor cursor = db.rawQuery(
                "SELECT ssid, bssid, rssi, frequency, security, timestamp FROM wifi_scans ORDER BY timestamp DESC LIMIT 100",
                null
            );

            while (cursor.moveToNext()) {
                String[] row = new String[6];
                row[0] = cursor.getString(0); // ssid
                row[1] = cursor.getString(1); // bssid
                row[2] = cursor.getString(2); // rssi
                row[3] = cursor.getString(3); // frequency
                row[4] = cursor.getString(4); // security
                row[5] = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)
                    .format(new Date(cursor.getLong(5)));
                results.add(row);
            }
            cursor.close();
        } catch (Exception e) {
            Log.e(TAG, "Error getting WiFi scans", e);
        }
        return results;
    }

    private List<String[]> getNetworkScans() {
        List<String[]> results = new ArrayList<>();
        try {
            SQLiteDatabase db = deviceDatabase.getReadableDatabase();
            Cursor cursor = db.rawQuery(
                "SELECT ip_address, mac_address, hostname, vendor, is_online, last_seen FROM known_devices ORDER BY last_seen DESC LIMIT 100",
                null
            );

            while (cursor.moveToNext()) {
                String[] row = new String[6];
                row[0] = cursor.getString(0); // ip
                row[1] = cursor.getString(1); // mac
                row[2] = cursor.getString(2); // hostname
                row[3] = cursor.getString(3); // vendor
                row[4] = cursor.getInt(4) == 1 ? "Online" : "Offline";
                row[5] = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)
                    .format(new Date(cursor.getLong(5)));
                results.add(row);
            }
            cursor.close();
        } catch (Exception e) {
            Log.e(TAG, "Error getting network scans", e);
        }
        return results;
    }

    private List<String[]> getSpeedTests() {
        List<String[]> results = new ArrayList<>();
        // Mock data for speed tests (would need actual table)
        return results;
    }

    private List<String[]> getSavedWifi() {
        List<String[]> results = new ArrayList<>();
        try {
            SQLiteDatabase db = deviceDatabase.getReadableDatabase();
            Cursor cursor = db.rawQuery(
                "SELECT ssid, bssid, security, added_at, last_connected_at FROM saved_wifi ORDER BY added_at DESC",
                null
            );

            while (cursor.moveToNext()) {
                String[] row = new String[5];
                row[0] = cursor.getString(0); // ssid
                row[1] = cursor.getString(1); // bssid
                row[2] = cursor.getString(2); // security
                row[3] = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)
                    .format(new Date(cursor.getLong(3)));
                row[4] = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)
                    .format(new Date(cursor.getLong(4)));
                results.add(row);
            }
            cursor.close();
        } catch (Exception e) {
            Log.e(TAG, "Error getting saved WiFi", e);
        }
        return results;
    }

    private String saveFile(String fileName, String content, String mimeType) {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                // Use MediaStore API for Android 10+
                ContentValues values = new ContentValues();
                values.put(MediaStore.Downloads.DISPLAY_NAME, fileName);
                values.put(MediaStore.Downloads.MIME_TYPE, mimeType);
                values.put(MediaStore.Downloads.IS_PENDING, 1);

                Uri uri = getContext().getContentResolver().insert(
                    MediaStore.Downloads.EXTERNAL_CONTENT_URI, values
                );

                if (uri != null) {
                    OutputStream os = getContext().getContentResolver().openOutputStream(uri);
                    os.write(content.getBytes());
                    os.close();

                    values.clear();
                    values.put(MediaStore.Downloads.IS_PENDING, 0);
                    getContext().getContentResolver().update(uri, values, null, null);

                    // Return user-friendly path
                    return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath() + "/" + fileName;
                }
            } else {
                // Use traditional file API for older Android versions
                File downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                File file = new File(downloadsDir, fileName);
                FileOutputStream fos = new FileOutputStream(file);
                fos.write(content.getBytes());
                fos.close();
                return file.getAbsolutePath();
            }
        } catch (Exception e) {
            Log.e(TAG, "Error saving file", e);
        }
        return null;
    }

    private String savePdfFile(String fileName, PdfDocument document) {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                ContentValues values = new ContentValues();
                values.put(MediaStore.Downloads.DISPLAY_NAME, fileName);
                values.put(MediaStore.Downloads.MIME_TYPE, "application/pdf");
                values.put(MediaStore.Downloads.IS_PENDING, 1);

                Uri uri = getContext().getContentResolver().insert(
                    MediaStore.Downloads.EXTERNAL_CONTENT_URI, values
                );

                if (uri != null) {
                    OutputStream os = getContext().getContentResolver().openOutputStream(uri);
                    document.writeTo(os);
                    os.close();

                    values.clear();
                    values.put(MediaStore.Downloads.IS_PENDING, 0);
                    getContext().getContentResolver().update(uri, values, null, null);

                    // Return user-friendly path  
                    return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath() + "/" + fileName;
                }
            } else {
                File downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                File file = new File(downloadsDir, fileName);
                FileOutputStream fos = new FileOutputStream(file);
                document.writeTo(fos);
                fos.close();
                return file.getAbsolutePath();
            }
        } catch (Exception e) {
            Log.e(TAG, "Error saving PDF file", e);
        }
        return null;
    }
}
