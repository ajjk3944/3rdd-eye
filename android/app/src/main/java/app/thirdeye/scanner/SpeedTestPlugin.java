package app.thirdeye.scanner;

import android.Manifest;
import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@CapacitorPlugin(
    name = "SpeedTest",
    permissions = {
        @Permission(
            alias = "network",
            strings = {
                Manifest.permission.INTERNET,
                Manifest.permission.ACCESS_NETWORK_STATE
            }
        )
    }
)
public class SpeedTestPlugin extends Plugin {
    private static final String TAG = "SpeedTestPlugin";
    
    // Test file URLs - using reliable CDN endpoints
    // These are commonly used for speed tests
    private static final String[] DOWNLOAD_URLS = {
        "https://speed.cloudflare.com/__down?bytes=10000000",  // 10MB from Cloudflare
        "https://proof.ovh.net/files/10Mb.dat",                // 10MB from OVH
        "http://speedtest.tele2.net/10MB.zip",                 // 10MB from Tele2
        "https://ash-speed.hetzner.com/10MB.bin"               // 10MB from Hetzner
    };
    
    private static final String[] UPLOAD_URLS = {
        "https://speed.cloudflare.com/__up",                   // Cloudflare upload endpoint
    };
    
    private static final String[] PING_HOSTS = {
        "1.1.1.1",           // Cloudflare DNS
        "8.8.8.8",           // Google DNS
        "208.67.222.222"     // OpenDNS
    };

    private ExecutorService executor = Executors.newSingleThreadExecutor();
    private volatile boolean isTesting = false;
    private volatile boolean shouldCancel = false;

    @PluginMethod
    public void runFullTest(PluginCall call) {
        if (isTesting) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Test already in progress");
            call.resolve(result);
            return;
        }

        isTesting = true;
        shouldCancel = false;

        executor.execute(() -> {
            JSObject result = new JSObject();
            
            try {
                // Step 1: Ping test
                notifyProgress(call, "ping", 0, "Testing latency...");
                double ping = measurePing();
                double jitter = measureJitter();
                notifyProgress(call, "ping", 100, "Latency: " + String.format("%.0f", ping) + "ms");
                
                if (shouldCancel) {
                    result.put("success", false);
                    result.put("error", "Test cancelled");
                    call.resolve(result);
                    isTesting = false;
                    return;
                }

                // Step 2: Download test
                notifyProgress(call, "download", 0, "Testing download speed...");
                double downloadSpeed = measureDownloadSpeed(call);
                notifyProgress(call, "download", 100, "Download: " + String.format("%.1f", downloadSpeed) + " Mbps");
                
                if (shouldCancel) {
                    result.put("success", false);
                    result.put("error", "Test cancelled");
                    call.resolve(result);
                    isTesting = false;
                    return;
                }

                // Step 3: Upload test
                notifyProgress(call, "upload", 0, "Testing upload speed...");
                double uploadSpeed = measureUploadSpeed(call);
                notifyProgress(call, "upload", 100, "Upload: " + String.format("%.1f", uploadSpeed) + " Mbps");

                // Return results
                result.put("success", true);
                result.put("download", downloadSpeed);
                result.put("upload", uploadSpeed);
                result.put("ping", ping);
                result.put("jitter", jitter);
                result.put("timestamp", System.currentTimeMillis());
                
            } catch (Exception e) {
                Log.e(TAG, "Speed test error", e);
                result.put("success", false);
                result.put("error", e.getMessage());
            }
            
            isTesting = false;
            call.resolve(result);
        });
    }

    @PluginMethod
    public void cancelTest(PluginCall call) {
        shouldCancel = true;
        JSObject result = new JSObject();
        result.put("success", true);
        call.resolve(result);
    }

    @PluginMethod
    public void measurePingOnly(PluginCall call) {
        executor.execute(() -> {
            JSObject result = new JSObject();
            try {
                double ping = measurePing();
                double jitter = measureJitter();
                result.put("success", true);
                result.put("ping", ping);
                result.put("jitter", jitter);
            } catch (Exception e) {
                result.put("success", false);
                result.put("error", e.getMessage());
            }
            call.resolve(result);
        });
    }

    private void notifyProgress(PluginCall call, String phase, int progress, String message) {
        JSObject data = new JSObject();
        data.put("phase", phase);
        data.put("progress", progress);
        data.put("message", message);
        notifyListeners("speedTestProgress", data);
    }

    private double measurePing() {
        double totalPing = 0;
        int successCount = 0;
        
        for (String host : PING_HOSTS) {
            try {
                long start = System.currentTimeMillis();
                InetAddress address = InetAddress.getByName(host);
                if (address.isReachable(3000)) {
                    long ping = System.currentTimeMillis() - start;
                    totalPing += ping;
                    successCount++;
                }
            } catch (Exception e) {
                Log.e(TAG, "Ping failed for " + host, e);
            }
        }
        
        if (successCount == 0) {
            // Fallback: try HTTP ping
            return measureHttpPing();
        }
        
        return totalPing / successCount;
    }

    private double measureHttpPing() {
        try {
            URL url = new URL("https://www.google.com/generate_204");
            long start = System.currentTimeMillis();
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("HEAD");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            conn.connect();
            int responseCode = conn.getResponseCode();
            long ping = System.currentTimeMillis() - start;
            conn.disconnect();
            return ping;
        } catch (Exception e) {
            Log.e(TAG, "HTTP ping failed", e);
            return 100; // Default fallback
        }
    }

    private double measureJitter() {
        double[] pings = new double[5];
        int count = 0;
        
        for (int i = 0; i < 5; i++) {
            try {
                long start = System.currentTimeMillis();
                InetAddress address = InetAddress.getByName("1.1.1.1");
                if (address.isReachable(2000)) {
                    pings[count++] = System.currentTimeMillis() - start;
                }
                Thread.sleep(100);
            } catch (Exception e) {
                // Ignore
            }
        }
        
        if (count < 2) return 0;
        
        // Calculate jitter as average difference between consecutive pings
        double totalDiff = 0;
        for (int i = 1; i < count; i++) {
            totalDiff += Math.abs(pings[i] - pings[i-1]);
        }
        
        return totalDiff / (count - 1);
    }

    private double measureDownloadSpeed(PluginCall call) {
        double bestSpeed = 0;
        
        for (String urlStr : DOWNLOAD_URLS) {
            if (shouldCancel) break;
            
            try {
                double speed = downloadTest(urlStr, call);
                if (speed > bestSpeed) {
                    bestSpeed = speed;
                }
                // If we got a good result, no need to try other servers
                if (speed > 0) break;
            } catch (Exception e) {
                Log.e(TAG, "Download test failed for " + urlStr, e);
            }
        }
        
        return bestSpeed;
    }

    private double downloadTest(String urlStr, PluginCall call) throws Exception {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setConnectTimeout(10000);
        conn.setReadTimeout(30000);
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 ThirdEye SpeedTest");
        conn.setRequestProperty("Cache-Control", "no-cache");
        
        long startTime = System.currentTimeMillis();
        long totalBytes = 0;
        
        try {
            conn.connect();
            InputStream in = conn.getInputStream();
            byte[] buffer = new byte[32768]; // 32KB buffer
            int bytesRead;
            long lastProgressUpdate = startTime;
            
            while ((bytesRead = in.read(buffer)) != -1 && !shouldCancel) {
                totalBytes += bytesRead;
                
                // Update progress every 500ms
                long now = System.currentTimeMillis();
                if (now - lastProgressUpdate > 500) {
                    long elapsed = now - startTime;
                    if (elapsed > 0) {
                        double currentSpeed = (totalBytes * 8.0) / (elapsed * 1000.0); // Mbps
                        int progress = Math.min(90, (int)((elapsed / 15000.0) * 100)); // Max 15 seconds
                        notifyProgress(call, "download", progress, 
                            String.format("%.1f Mbps", currentSpeed));
                    }
                    lastProgressUpdate = now;
                }
                
                // Stop after 15 seconds or 50MB
                long elapsed = now - startTime;
                if (elapsed > 15000 || totalBytes > 50 * 1024 * 1024) {
                    break;
                }
            }
            
            in.close();
        } finally {
            conn.disconnect();
        }
        
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        
        if (duration == 0 || totalBytes == 0) return 0;
        
        // Calculate speed in Mbps (megabits per second)
        // bytes * 8 = bits, duration in ms, so * 1000 to get per second, / 1000000 for mega
        double speedMbps = (totalBytes * 8.0) / (duration * 1000.0);
        
        Log.d(TAG, "Download: " + totalBytes + " bytes in " + duration + "ms = " + speedMbps + " Mbps");
        
        return speedMbps;
    }

    private double measureUploadSpeed(PluginCall call) {
        try {
            return uploadTest(call);
        } catch (Exception e) {
            Log.e(TAG, "Upload test failed", e);
            return 0;
        }
    }

    private double uploadTest(PluginCall call) throws Exception {
        // Generate random data to upload (2MB)
        int dataSize = 2 * 1024 * 1024;
        byte[] uploadData = new byte[dataSize];
        for (int i = 0; i < dataSize; i++) {
            uploadData[i] = (byte)(i % 256);
        }
        
        URL url = new URL("https://speed.cloudflare.com/__up");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setConnectTimeout(10000);
        conn.setReadTimeout(30000);
        conn.setRequestProperty("Content-Type", "application/octet-stream");
        conn.setRequestProperty("Content-Length", String.valueOf(dataSize));
        conn.setChunkedStreamingMode(32768);
        
        long startTime = System.currentTimeMillis();
        long totalBytes = 0;
        
        try {
            conn.connect();
            OutputStream out = conn.getOutputStream();
            
            int chunkSize = 32768;
            long lastProgressUpdate = startTime;
            
            for (int offset = 0; offset < dataSize && !shouldCancel; offset += chunkSize) {
                int length = Math.min(chunkSize, dataSize - offset);
                out.write(uploadData, offset, length);
                out.flush();
                totalBytes += length;
                
                // Update progress
                long now = System.currentTimeMillis();
                if (now - lastProgressUpdate > 500) {
                    long elapsed = now - startTime;
                    if (elapsed > 0) {
                        double currentSpeed = (totalBytes * 8.0) / (elapsed * 1000.0);
                        int progress = Math.min(90, (int)((offset * 100.0) / dataSize));
                        notifyProgress(call, "upload", progress,
                            String.format("%.1f Mbps", currentSpeed));
                    }
                    lastProgressUpdate = now;
                }
            }
            
            out.close();
            
            // Read response
            int responseCode = conn.getResponseCode();
            Log.d(TAG, "Upload response: " + responseCode);
            
        } finally {
            conn.disconnect();
        }
        
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        
        if (duration == 0 || totalBytes == 0) return 0;
        
        double speedMbps = (totalBytes * 8.0) / (duration * 1000.0);
        
        Log.d(TAG, "Upload: " + totalBytes + " bytes in " + duration + "ms = " + speedMbps + " Mbps");
        
        return speedMbps;
    }
}
