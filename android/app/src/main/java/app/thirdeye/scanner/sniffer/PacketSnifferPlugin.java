package app.thirdeye.scanner.sniffer;

import android.app.Activity;
import android.content.Intent;
import android.net.VpnService;
import android.util.Log;

import androidx.activity.result.ActivityResult;
import androidx.core.content.ContextCompat;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.ActivityCallback;
import com.getcapacitor.annotation.CapacitorPlugin;

import java.util.List;

@CapacitorPlugin(name = "PacketSniffer")
public class PacketSnifferPlugin extends Plugin {
    private static final String TAG = "PacketSnifferPlugin";
    private static final int VPN_REQUEST_CODE = 1001;
    
    private PluginCall savedCall;
    private TrafficLogDatabase database;
    private AppIdentifier appIdentifier;

    @Override
    public void load() {
        super.load();
        database = TrafficLogDatabase.getInstance(getContext());
        appIdentifier = new AppIdentifier();
        
        // Register as listener for service events
        PacketSnifferService.setEventListener(new PacketSnifferService.EventListener() {
            @Override
            public void onNewConnection(JSObject connection) {
                notifyListeners("newConnection", connection);
            }

            @Override
            public void onSuspiciousDetected(JSObject alert) {
                notifyListeners("suspiciousDetected", alert);
            }
        });
        
        Log.i(TAG, "PacketSnifferPlugin loaded");
    }

    @PluginMethod
    public void startCapture(PluginCall call) {
        // Check VPN permission
        Intent intent = VpnService.prepare(getActivity());
        
        if (intent != null) {
            // Permission not granted, need to request
            savedCall = call;
            startActivityForResult(call, intent, "handleVpnPermissionResult");
        } else {
            // Permission already granted, start service
            startVpnService(call);
        }
    }

    @ActivityCallback
    private void handleVpnPermissionResult(PluginCall call, ActivityResult result) {
        if (result.getResultCode() == Activity.RESULT_OK) {
            // Permission granted, start service
            startVpnService(call);
        } else {
            // Permission denied
            JSObject ret = new JSObject();
            ret.put("success", false);
            ret.put("error", "VPN permission denied by user");
            call.resolve(ret);
        }
    }

    private void startVpnService(PluginCall call) {
        try {
            Intent serviceIntent = new Intent(getContext(), PacketSnifferService.class);
            ContextCompat.startForegroundService(getContext(), serviceIntent);
            
            // Wait a moment for service to start
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Ignore
            }
            
            JSObject ret = new JSObject();
            ret.put("success", true);
            
            String sessionId = PacketSnifferService.getSessionId();
            if (sessionId != null) {
                ret.put("sessionId", sessionId);
            }
            
            call.resolve(ret);
            Log.i(TAG, "Packet capture started");
        } catch (Exception e) {
            Log.e(TAG, "Error starting VPN service", e);
            JSObject ret = new JSObject();
            ret.put("success", false);
            ret.put("error", "Failed to start capture: " + e.getMessage());
            call.resolve(ret);
        }
    }

    @PluginMethod
    public void stopCapture(PluginCall call) {
        try {
            Intent serviceIntent = new Intent(getContext(), PacketSnifferService.class);
            getContext().stopService(serviceIntent);
            
            JSObject ret = new JSObject();
            ret.put("success", true);
            call.resolve(ret);
            Log.i(TAG, "Packet capture stopped");
        } catch (Exception e) {
            Log.e(TAG, "Error stopping VPN service", e);
            JSObject ret = new JSObject();
            ret.put("success", false);
            ret.put("error", "Failed to stop capture: " + e.getMessage());
            call.resolve(ret);
        }
    }

    @PluginMethod
    public void isCapturing(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("capturing", PacketSnifferService.isRunning());
        call.resolve(ret);
    }

    @PluginMethod
    public void getRecentConnections(PluginCall call) {
        try {
            int limit = call.getInt("limit", 100);
            
            List<JSObject> connections = database.getRecentConnections(limit);
            
            JSArray connectionsArray = new JSArray();
            for (JSObject conn : connections) {
                connectionsArray.put(conn);
            }
            
            JSObject ret = new JSObject();
            ret.put("success", true);
            ret.put("connections", connectionsArray);
            call.resolve(ret);
        } catch (Exception e) {
            Log.e(TAG, "Error getting recent connections", e);
            JSObject ret = new JSObject();
            ret.put("success", false);
            ret.put("error", e.getMessage());
            ret.put("connections", new JSArray());
            call.resolve(ret);
        }
    }

    @PluginMethod
    public void getAppTraffic(PluginCall call) {
        try {
            List<JSObject> apps = database.getAppTrafficSummary();
            
            // App info is already in the database from capture time
            // No need to re-identify with dummy values
            
            JSArray appsArray = new JSArray();
            for (JSObject app : apps) {
                appsArray.put(app);
            }
            
            JSObject ret = new JSObject();
            ret.put("success", true);
            ret.put("apps", appsArray);
            call.resolve(ret);
        } catch (Exception e) {
            Log.e(TAG, "Error getting app traffic", e);
            JSObject ret = new JSObject();
            ret.put("success", false);
            ret.put("error", e.getMessage());
            ret.put("apps", new JSArray());
            call.resolve(ret);
        }
    }

    @PluginMethod
    public void getCountryTraffic(PluginCall call) {
        try {
            List<JSObject> countries = database.getCountryTraffic();
            
            JSArray countriesArray = new JSArray();
            for (JSObject country : countries) {
                countriesArray.put(country);
            }
            
            JSObject ret = new JSObject();
            ret.put("success", true);
            ret.put("countries", countriesArray);
            call.resolve(ret);
        } catch (Exception e) {
            Log.e(TAG, "Error getting country traffic", e);
            JSObject ret = new JSObject();
            ret.put("success", false);
            ret.put("error", e.getMessage());
            ret.put("countries", new JSArray());
            call.resolve(ret);
        }
    }

    @PluginMethod
    public void getSuspiciousActivity(PluginCall call) {
        try {
            List<JSObject> alerts = database.getSuspiciousConnections();
            
            JSArray alertsArray = new JSArray();
            for (JSObject alert : alerts) {
                alertsArray.put(alert);
            }
            
            JSObject ret = new JSObject();
            ret.put("success", true);
            ret.put("alerts", alertsArray);
            call.resolve(ret);
        } catch (Exception e) {
            Log.e(TAG, "Error getting suspicious activity", e);
            JSObject ret = new JSObject();
            ret.put("success", false);
            ret.put("error", e.getMessage());
            ret.put("alerts", new JSArray());
            call.resolve(ret);
        }
    }

    @PluginMethod
    public void getLiveStats(PluginCall call) {
        try {
            JSObject stats = new JSObject();
            
            if (PacketSnifferService.isRunning()) {
                // Get live stats from service
                JSObject dbStats = database.getLiveStats(PacketSnifferService.getSessionId());
                
                stats.put("capturing", true);
                stats.put("totalPackets", dbStats.has("totalPackets") ? dbStats.getInteger("totalPackets") : 0);
                stats.put("totalBytes", dbStats.has("totalBytes") ? dbStats.getLong("totalBytes") : 0L);
                stats.put("activeApps", dbStats.has("uniqueApps") ? dbStats.getInteger("uniqueApps") : 0);
                stats.put("uniqueCountries", dbStats.has("uniqueCountries") ? dbStats.getInteger("uniqueCountries") : 0);
                stats.put("suspiciousCount", dbStats.has("suspiciousCount") ? dbStats.getInteger("suspiciousCount") : 0);
                
                // Get actual session duration from service
                PacketSnifferService.LiveStats liveStats = PacketSnifferService.getLiveStatsFromService();
                if (liveStats != null) {
                    stats.put("duration", liveStats.sessionDuration / 1000); // Convert to seconds
                } else {
                    stats.put("duration", 0);
                }
            } else {
                stats.put("capturing", false);
                stats.put("totalPackets", 0);
                stats.put("totalBytes", 0);
                stats.put("activeApps", 0);
                stats.put("uniqueCountries", 0);
                stats.put("suspiciousCount", 0);
                stats.put("duration", 0);
            }
            
            JSObject ret = new JSObject();
            ret.put("success", true);
            ret.put("stats", stats);
            call.resolve(ret);
        } catch (Exception e) {
            Log.e(TAG, "Error getting live stats", e);
            JSObject ret = new JSObject();
            ret.put("success", false);
            ret.put("error", e.getMessage());
            
            // Return empty stats
            JSObject emptyStats = new JSObject();
            emptyStats.put("capturing", false);
            emptyStats.put("totalPackets", 0);
            emptyStats.put("totalBytes", 0);
            emptyStats.put("activeApps", 0);
            emptyStats.put("uniqueCountries", 0);
            emptyStats.put("suspiciousCount", 0);
            emptyStats.put("duration", 0);
            ret.put("stats", emptyStats);
            
            call.resolve(ret);
        }
    }

    @PluginMethod
    public void clearLogs(PluginCall call) {
        try {
            database.clearLogs();
            
            JSObject ret = new JSObject();
            ret.put("success", true);
            call.resolve(ret);
            Log.i(TAG, "Logs cleared");
        } catch (Exception e) {
            Log.e(TAG, "Error clearing logs", e);
            JSObject ret = new JSObject();
            ret.put("success", false);
            ret.put("error", e.getMessage());
            call.resolve(ret);
        }
    }
}
