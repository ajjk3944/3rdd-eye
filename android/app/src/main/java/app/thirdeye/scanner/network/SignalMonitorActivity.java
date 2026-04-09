package app.thirdeye.scanner.network;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;
import java.util.Locale;

import app.thirdeye.scanner.R;

/**
 * Signal Monitor Activity - Shows live WiFi signal strength with graph
 * Similar to "Who uses my wifi" app network monitor feature
 */
public class SignalMonitorActivity extends AppCompatActivity {
    private SignalGraphView signalGraphView;
    private TextView ssidText;
    private TextView signalStrengthText;
    private TextView signalQualityText;
    private TextView signalPercentageText;
    private TextView downloadSpeedText;
    private TextView uploadSpeedText;
    
    private WiFiSignalMonitor signalMonitor;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signal_monitor);
        
        initializeViews();
        setupSignalMonitor();
    }
    
    private void initializeViews() {
        signalGraphView = findViewById(R.id.signal_graph_view);
        ssidText = findViewById(R.id.tv_ssid);
        signalStrengthText = findViewById(R.id.tv_signal_strength);
        signalQualityText = findViewById(R.id.tv_signal_quality);
        signalPercentageText = findViewById(R.id.tv_signal_percentage);
        downloadSpeedText = findViewById(R.id.tv_download_speed);
        uploadSpeedText = findViewById(R.id.tv_upload_speed);
        
        // Back button
        findViewById(R.id.btn_back).setOnClickListener(v -> finish());
    }
    
    private void setupSignalMonitor() {
        signalMonitor = new WiFiSignalMonitor(this);
        signalMonitor.setCallback(new WiFiSignalMonitor.SignalCallback() {
            @Override
            public void onSignalUpdate(int signalStrength, int signalLevel, String ssid) {
                runOnUiThread(() -> updateSignalInfo(signalStrength, signalLevel, ssid));
            }
            
            @Override
            public void onSignalHistoryUpdate(List<WiFiSignalMonitor.SignalDataPoint> history) {
                runOnUiThread(() -> signalGraphView.setDataPoints(history));
            }
        });
    }
    
    private void updateSignalInfo(int signalStrength, int signalLevel, String ssid) {
        // Update SSID
        ssidText.setText(ssid != null ? ssid : "Not Connected");
        
        // Update signal strength
        signalStrengthText.setText(String.format(Locale.getDefault(), "%d dBm", signalStrength));
        
        // Update signal quality
        String quality = WiFiSignalMonitor.getSignalQuality(signalStrength);
        signalQualityText.setText(quality);
        
        // Update signal percentage
        int percentage = WiFiSignalMonitor.getSignalPercentage(signalStrength);
        signalPercentageText.setText(String.format(Locale.getDefault(), "%d%%", percentage));
        
        // Set quality color
        int color;
        if (signalStrength >= -50) {
            color = 0xFF4CAF50; // Green
        } else if (signalStrength >= -60) {
            color = 0xFF8BC34A; // Light Green
        } else if (signalStrength >= -70) {
            color = 0xFFFFC107; // Amber
        } else if (signalStrength >= -80) {
            color = 0xFFFF9800; // Orange
        } else {
            color = 0xFFF44336; // Red
        }
        signalQualityText.setTextColor(color);
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        signalMonitor.startMonitoring();
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        signalMonitor.stopMonitoring();
    }
}
