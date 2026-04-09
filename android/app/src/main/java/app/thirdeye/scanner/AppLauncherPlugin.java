package app.thirdeye.scanner;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import java.util.List;

@CapacitorPlugin(name = "AppLauncher")
public class AppLauncherPlugin extends Plugin {
    private static final String TAG = "AppLauncherPlugin";

    @PluginMethod
    public void isAppInstalled(PluginCall call) {
        String packageName = call.getString("packageName");
        
        if (packageName == null || packageName.isEmpty()) {
            call.reject("Package name is required");
            return;
        }

        try {
            PackageManager pm = getContext().getPackageManager();
            pm.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES);
            
            JSObject result = new JSObject();
            result.put("installed", true);
            result.put("packageName", packageName);
            call.resolve(result);
        } catch (PackageManager.NameNotFoundException e) {
            JSObject result = new JSObject();
            result.put("installed", false);
            call.resolve(result);
        }
    }

    @PluginMethod
    public void findMiRemote(PluginCall call) {
        try {
            PackageManager pm = getContext().getPackageManager();
            
            // List of possible Mi Remote package names (ordered by priority)
            // Check actual Mi Remote apps first, not Mi Home
            String[] possiblePackages = {
                "com.duokan.phone.remotecontroller",        // Official Mi Remote (most common)
                "com.xiaomi.mitv.phone.remotecontroller",   // Xiaomi TV Remote
                "com.mi.android.globalminusscreen",         // Mi Remote (Global)
                "com.xiaomi.tv.remote",                     // Xiaomi TV Remote (alternative)
                "com.xiaomi.mitv.tvmanager.tv",             // Mi TV Manager
                "com.xiaomi.mitv.smartshare"                // Mi TV Smart Share
            };
            
            Log.d(TAG, "Searching for Mi Remote...");
            
            for (String packageName : possiblePackages) {
                try {
                    pm.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES);
                    
                    Log.d(TAG, "Found Mi Remote: " + packageName);
                    
                    JSObject result = new JSObject();
                    result.put("found", true);
                    result.put("packageName", packageName);
                    call.resolve(result);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d(TAG, "Not found: " + packageName);
                }
            }
            
            // Not found - log all installed apps with "mi" or "remote" in name
            Log.d(TAG, "Mi Remote not found. Searching all apps...");
            List<ApplicationInfo> apps = pm.getInstalledApplications(PackageManager.GET_META_DATA);
            for (ApplicationInfo app : apps) {
                String pkg = app.packageName.toLowerCase();
                if (pkg.contains("mi") && (pkg.contains("remote") || pkg.contains("tv"))) {
                    Log.d(TAG, "Possible Mi Remote app: " + app.packageName);
                }
            }
            
            JSObject result = new JSObject();
            result.put("found", false);
            call.resolve(result);
            
        } catch (Exception e) {
            Log.e(TAG, "Error finding Mi Remote", e);
            JSObject result = new JSObject();
            result.put("found", false);
            result.put("error", e.getMessage());
            call.resolve(result);
        }
    }

    @PluginMethod
    public void openApp(PluginCall call) {
        String packageName = call.getString("packageName");
        
        if (packageName == null || packageName.isEmpty()) {
            call.reject("Package name is required");
            return;
        }

        try {
            PackageManager pm = getContext().getPackageManager();
            Intent intent = pm.getLaunchIntentForPackage(packageName);
            
            if (intent != null) {
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getContext().startActivity(intent);
                
                JSObject result = new JSObject();
                result.put("success", true);
                call.resolve(result);
            } else {
                JSObject result = new JSObject();
                result.put("success", false);
                result.put("error", "App not installed");
                call.resolve(result);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error opening app", e);
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", e.getMessage());
            call.resolve(result);
        }
    }

    @PluginMethod
    public void openPlayStore(PluginCall call) {
        String packageName = call.getString("packageName");
        
        if (packageName == null || packageName.isEmpty()) {
            call.reject("Package name is required");
            return;
        }

        try {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?id=" + packageName));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            getContext().startActivity(intent);
            
            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
        } catch (Exception e) {
            // Fallback to web browser
            try {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + packageName));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getContext().startActivity(intent);
                
                JSObject result = new JSObject();
                result.put("success", true);
                call.resolve(result);
            } catch (Exception e2) {
                Log.e(TAG, "Error opening Play Store", e2);
                JSObject result = new JSObject();
                result.put("success", false);
                result.put("error", e2.getMessage());
                call.resolve(result);
            }
        }
    }
}
