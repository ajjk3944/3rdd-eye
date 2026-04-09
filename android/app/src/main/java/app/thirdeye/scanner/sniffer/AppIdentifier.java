package app.thirdeye.scanner.sniffer;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import android.util.LruCache;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;

public class AppIdentifier {
    private static final String TAG = "AppIdentifier";

    // Protocol constants
    private static final int IPPROTO_TCP = 6;
    private static final int IPPROTO_UDP = 17;

    // Caches
    private final Map<Integer, AppInfo> uidCache = new HashMap<>();
    private final LruCache<String, Integer> portCache = new LruCache<>(500);

    public static class AppInfo {
        public int uid;
        public String packageName;
        public String appName;
        public String iconBase64;

        public AppInfo(int uid, String packageName, String appName, String iconBase64) {
            this.uid = uid;
            this.packageName = packageName;
            this.appName = appName;
            this.iconBase64 = iconBase64;
        }
    }

    /**
     * Identify which app owns a network connection
     */
    public AppInfo identify(Context context, String protocol, String localIP, int localPort,
                             String remoteIP, int remotePort) {
        try {
            // Get UID for this connection
            int uid = getConnectionUid(context, protocol, localIP, localPort, remoteIP, remotePort);

            if (uid < 0) {
                Log.w(TAG, "Could not determine UID for connection");
                return null;
            }

            // Check cache first
            if (uidCache.containsKey(uid)) {
                return uidCache.get(uid);
            }

            // Get app info for this UID
            AppInfo appInfo = getAppInfoForUid(context, uid);
            if (appInfo != null) {
                uidCache.put(uid, appInfo);
            }

            return appInfo;
        } catch (Exception e) {
            Log.e(TAG, "Error identifying app", e);
            return null;
        }
    }

    private int getConnectionUid(Context context, String protocol, String localIP, int localPort,
                                   String remoteIP, int remotePort) {
        // Check port cache first
        String cacheKey = protocol + ":" + localPort;
        Integer cachedUid = portCache.get(cacheKey);
        if (cachedUid != null) {
            return cachedUid;
        }

        int uid = -1;

        // Android 10+ (API 29+): Use ConnectivityManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            uid = getUidFromConnectivityManager(context, protocol, localIP, localPort, remoteIP, remotePort);
        }

        // Fallback for Android 9 and below: Read /proc/net
        if (uid < 0) {
            uid = getUidFromProcNet(protocol, localPort);
        }

        // Cache the result
        if (uid >= 0) {
            portCache.put(cacheKey, uid);
        }

        return uid;
    }

    private int getUidFromConnectivityManager(Context context, String protocol, String localIP,
                                                int localPort, String remoteIP, int remotePort) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
            return -1;
        }

        try {
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            if (cm == null) {
                return -1;
            }

            int protocolNumber = protocol.equalsIgnoreCase("TCP") ? IPPROTO_TCP : IPPROTO_UDP;

            InetSocketAddress local = new InetSocketAddress(localIP, localPort);
            InetSocketAddress remote = new InetSocketAddress(remoteIP, remotePort);

            return cm.getConnectionOwnerUid(protocolNumber, local, remote);
        } catch (Exception e) {
            Log.w(TAG, "Error getting UID from ConnectivityManager", e);
            return -1;
        }
    }

    private int getUidFromProcNet(String protocol, int localPort) {
        String procFile = protocol.equalsIgnoreCase("TCP") ? "/proc/net/tcp" : "/proc/net/udp";

        try (BufferedReader reader = new BufferedReader(new FileReader(procFile))) {
            String line;
            reader.readLine(); // Skip header

            String hexPort = String.format("%04X", localPort);

            while ((line = reader.readLine()) != null) {
                String[] parts = line.trim().split("\\s+");
                if (parts.length < 8) {
                    continue;
                }

                // Column 1: local address (hex IP:port)
                String localAddress = parts[1];
                if (localAddress.contains(":")) {
                    String[] addressParts = localAddress.split(":");
                    String portHex = addressParts[1];

                    if (portHex.equalsIgnoreCase(hexPort)) {
                        // Column 7: UID
                        try {
                            return Integer.parseInt(parts[7]);
                        } catch (NumberFormatException e) {
                            continue;
                        }
                    }
                }
            }
        } catch (Exception e) {
            Log.w(TAG, "Error reading " + procFile, e);
        }

        return -1;
    }

    private AppInfo getAppInfoForUid(Context context, int uid) {
        PackageManager pm = context.getPackageManager();

        // Handle special UIDs
        if (uid == 0) {
            return new AppInfo(uid, "system", "Root / System", "");
        } else if (uid == 1000) {
            return new AppInfo(uid, "android", "Android System", "");
        } else if (uid < 10000) {
            return new AppInfo(uid, "system", "System (UID: " + uid + ")", "");
        }

        try {
            // Get packages for this UID
            String[] packages = pm.getPackagesForUid(uid);
            if (packages == null || packages.length == 0) {
                return new AppInfo(uid, "unknown", "Unknown (UID: " + uid + ")", "");
            }

            // Use the first package
            String packageName = packages[0];

            // Get application info
            ApplicationInfo appInfo = pm.getApplicationInfo(packageName, 0);

            // Get app name
            String appName = pm.getApplicationLabel(appInfo).toString();

            // Get app icon as Base64
            String iconBase64 = "";
            try {
                Drawable icon = pm.getApplicationIcon(appInfo);
                iconBase64 = drawableToBase64(icon);
            } catch (Exception e) {
                Log.w(TAG, "Error getting icon for " + packageName, e);
            }

            return new AppInfo(uid, packageName, appName, iconBase64);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(TAG, "Package not found for UID: " + uid, e);
            return new AppInfo(uid, "unknown", "Unknown (UID: " + uid + ")", "");
        } catch (Exception e) {
            Log.e(TAG, "Error getting app info for UID: " + uid, e);
            return new AppInfo(uid, "unknown", "Unknown (UID: " + uid + ")", "");
        }
    }

    private String drawableToBase64(Drawable drawable) {
        try {
            Bitmap bitmap;

            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                // Create bitmap from drawable
                bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(),
                        drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
            }

            // Scale to 48x48 to keep size small
            Bitmap scaledBitmap = Bitmap.createScaledBitmap(bitmap, 48, 48, true);

            // Convert to PNG bytes
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            scaledBitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
            byte[] bytes = baos.toByteArray();

            // Encode to Base64
            return Base64.encodeToString(bytes, Base64.NO_WRAP);
        } catch (Exception e) {
            Log.e(TAG, "Error converting drawable to Base64", e);
            return "";
        }
    }

    /**
     * Clear all caches
     */
    public void clearCache() {
        uidCache.clear();
        portCache.evictAll();
        Log.i(TAG, "Caches cleared");
    }
}
