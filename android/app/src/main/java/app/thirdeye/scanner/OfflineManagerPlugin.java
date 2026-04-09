package app.thirdeye.scanner;

import android.Manifest;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;

/**
 * Offline Manager Plugin - Exposes offline functionality to web app
 */
@CapacitorPlugin(
    name = "OfflineManager",
    permissions = {
        @Permission(
            alias = "phone",
            strings = {Manifest.permission.READ_PHONE_STATE}
        )
    }
)
public class OfflineManagerPlugin extends Plugin {
    private OfflineManager offlineManager;
    private CarrierDetector carrierDetector;
    
    @Override
    public void load() {
        super.load();
        offlineManager = new OfflineManager(getContext());
        carrierDetector = new CarrierDetector(getContext());
    }
    
    @PluginMethod
    public void isOnline(PluginCall call) {
        JSObject result = new JSObject();
        result.put("isOnline", offlineManager.isOnline());
        result.put("connectionType", offlineManager.getConnectionType());
        result.put("isWiFiConnected", offlineManager.isWiFiConnected());
        result.put("isMobileDataConnected", offlineManager.isMobileDataConnected());
        call.resolve(result);
    }
    
    @PluginMethod
    public void getConnectionType(PluginCall call) {
        JSObject result = new JSObject();
        result.put("connectionType", offlineManager.getConnectionType());
        call.resolve(result);
    }
    
    @PluginMethod
    public void checkFeatureAvailability(PluginCall call) {
        String feature = call.getString("feature", "");
        
        JSObject result = new JSObject();
        result.put("feature", feature);
        result.put("isAvailable", offlineManager.isFeatureAvailableOffline(feature));
        result.put("isOnline", offlineManager.isOnline());
        
        String message = offlineManager.getOfflineMessage(feature);
        if (message != null) {
            result.put("message", message);
        }
        
        call.resolve(result);
    }
    
    @PluginMethod
    public void getCarrierInfo(PluginCall call) {
        JSObject result = new JSObject();
        
        try {
            CarrierDetector.CarrierInfo info = carrierDetector.getCarrierInfo();
            result.put("success", true);
            result.put("carrierName", info.carrierName);
            result.put("networkType", info.networkType);
            result.put("simState", info.simState);
            result.put("hasSim", info.hasSim);
            result.put("networkOperator", info.networkOperator);
            result.put("signalStrength", info.signalStrength);
        } catch (Exception e) {
            result.put("success", false);
            result.put("error", e.getMessage());
        }
        
        call.resolve(result);
    }
}
