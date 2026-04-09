package app.thirdeye.scanner;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.graphics.Color;
import android.webkit.WebView;
import com.getcapacitor.BridgeActivity;
import app.thirdeye.scanner.armapper.ARMapperPlugin;
import app.thirdeye.scanner.routerguard.RouterGuardPlugin;
import app.thirdeye.scanner.security.SecurityAuditPlugin;
import app.thirdeye.scanner.iot.IoTDevicePlugin;

public class MainActivity extends BridgeActivity {
    private static final String TAG = "MainActivity";
    private OfflineManager offlineManager;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // Initialize offline manager
        offlineManager = new OfflineManager(this);
        
        // Log connectivity status (but don't block app startup)
        String connectionType = offlineManager.getConnectionType();
        Log.d(TAG, "Connection status: " + connectionType);
        
        // Register all native plugins
        registerPlugin(IRBlasterPlugin.class);
        registerPlugin(WiFiScannerPlugin.class);
        registerPlugin(BluetoothScannerPlugin.class);
        registerPlugin(NetworkScannerPlugin.class);
        registerPlugin(SpeedTestPlugin.class);
        registerPlugin(PermissionManagerPlugin.class);
        registerPlugin(AppLauncherPlugin.class);
        registerPlugin(CameraDetectorPlugin.class);
        registerPlugin(NetworkDeviceDiscoveryPlugin.class);
        registerPlugin(OfflineManagerPlugin.class);
        registerPlugin(app.thirdeye.scanner.plugins.DeviceInfoPlugin.class); // NEW: Advanced device info
        registerPlugin(NetworkTrafficPlugin.class); // NEW: Real network traffic monitoring
        registerPlugin(SavedWifiPlugin.class); // NEW: Saved WiFi passwords (native storage)
        registerPlugin(app.thirdeye.scanner.sniffer.PacketSnifferPlugin.class); // NEW: Packet Sniffer Lite
        registerPlugin(app.thirdeye.scanner.eviltwin.EvilTwinPlugin.class); // NEW: Evil Twin Shield
        registerPlugin(ARMapperPlugin.class); // NEW: AR Network Mapper
        registerPlugin(RouterGuardPlugin.class); // NEW: Router Guard (credentials + device history)
        registerPlugin(SecurityAuditPlugin.class); // NEW: Security Score & Recommendations
        registerPlugin(IoTDevicePlugin.class); // NEW: IoT Device Detection & Security
        registerPlugin(DataExportPlugin.class); // NEW: Data Export & Sharing
        
        super.onCreate(savedInstanceState);
        
        // Make WebView transparent for camera preview behind it
        getBridge().getWebView().setBackgroundColor(Color.TRANSPARENT);
    }
}
