package app.thirdeye.scanner;

import android.util.Log;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import app.thirdeye.scanner.network.SavedWifiDatabase;

import java.util.List;

@CapacitorPlugin(name = "SavedWifi")
public class SavedWifiPlugin extends Plugin {
    private static final String TAG = "SavedWifiPlugin";

    @PluginMethod
    public void getSavedNetworks(PluginCall call) {
        try {
            SavedWifiDatabase db = SavedWifiDatabase.getInstance(getContext());
            List<JSObject> networks = db.getAllSavedWifi();

            JSArray networksArray = new JSArray();
            for (JSObject network : networks) {
                networksArray.put(network);
            }

            JSObject result = new JSObject();
            result.put("success", true);
            result.put("networks", networksArray);
            result.put("count", networks.size());

            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "Error getting saved networks: " + e.getMessage());
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Failed to load saved networks: " + e.getMessage());
            result.put("networks", new JSArray());
            call.resolve(result);
        }
    }

    @PluginMethod
    public void saveNetwork(PluginCall call) {
        String ssid = call.getString("ssid");
        String password = call.getString("password", "");
        String security = call.getString("security", "WPA2");
        String bssid = call.getString("bssid", "");

        if (ssid == null || ssid.isEmpty()) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "SSID is required");
            call.resolve(result);
            return;
        }

        try {
            SavedWifiDatabase db = SavedWifiDatabase.getInstance(getContext());
            db.saveWifi(ssid, password, bssid, security);

            Log.d(TAG, "Network saved: " + ssid);

            JSObject result = new JSObject();
            result.put("success", true);
            result.put("ssid", ssid);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "Error saving network: " + e.getMessage());
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Failed to save network: " + e.getMessage());
            call.resolve(result);
        }
    }

    @PluginMethod
    public void deleteNetwork(PluginCall call) {
        String ssid = call.getString("ssid");

        if (ssid == null || ssid.isEmpty()) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "SSID is required");
            call.resolve(result);
            return;
        }

        try {
            SavedWifiDatabase db = SavedWifiDatabase.getInstance(getContext());
            db.deleteWifi(ssid);

            Log.d(TAG, "Network deleted: " + ssid);

            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "Error deleting network: " + e.getMessage());
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Failed to delete network: " + e.getMessage());
            call.resolve(result);
        }
    }
}
