package app.thirdeye.scanner.network;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.format.Formatter;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import app.thirdeye.scanner.R;

/**
 * Connected Devices Activity - Shows network devices
 * Enhanced with signal monitor, router admin webview, and router password database
 */
public class ConnectedDevicesActivity extends AppCompatActivity {
    private Button scanButton;
    private ProgressBar progressBar;
    private TextView statusText;
    private TextView deviceCountText;
    private RecyclerView recyclerView;
    
    private DeviceAdapter adapter;
    private NetworkDeviceScanner scanner;
    private DeviceNameResolver nameResolver;
    private Handler mainHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Make status bar match dark theme
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(android.graphics.Color.parseColor("#0a0f0a"));
        }
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            // Remove light status bar flag so icons are white on dark background
            getWindow().getDecorView().setSystemUiVisibility(0);
        }
        
        setContentView(R.layout.activity_connected_devices);
        
        mainHandler = new Handler(Looper.getMainLooper());
        initializeViews();
        setupScanner();
        setupRecyclerView();
    }

    private void initializeViews() {
        scanButton = findViewById(R.id.btn_scan);
        progressBar = findViewById(R.id.progress_bar);
        statusText = findViewById(R.id.tv_status);
        deviceCountText = findViewById(R.id.tv_device_count);
        recyclerView = findViewById(R.id.recycler_view_devices);
        
        // Back button
        findViewById(R.id.btn_back).setOnClickListener(v -> finish());
        
        // Scan button
        scanButton.setOnClickListener(v -> startScan());
    }

    private void setupScanner() {
        scanner = new NetworkDeviceScanner(this);
        nameResolver = new DeviceNameResolver(this);
        
        scanner.setScanCallback(new NetworkDeviceScanner.ScanCallback() {
            @Override
            public void onScanStarted() {
                mainHandler.post(() -> {
                    scanButton.setEnabled(false);
                    progressBar.setVisibility(View.VISIBLE);
                    statusText.setText("Scanning network...");
                    deviceCountText.setText("0 devices found");
                    adapter.clearDevices();
                });
            }

            @Override
            public void onDeviceFound(DeviceInfo device) {
                // Resolve device name in background
                nameResolver.resolveDeviceName(device, resolvedDevice -> {
                    mainHandler.post(() -> {
                        adapter.addDevice(resolvedDevice);
                        deviceCountText.setText(adapter.getItemCount() + " devices found");
                    });
                });
            }

            @Override
            public void onScanProgress(int current, int total) {
                mainHandler.post(() -> {
                    statusText.setText("Scanning " + current + "/" + total);
                });
            }

            @Override
            public void onScanCompleted(List<DeviceInfo> devices) {
                mainHandler.post(() -> {
                    scanButton.setEnabled(true);
                    progressBar.setVisibility(View.GONE);
                    statusText.setText("Scan completed");
                    
                    // Save devices to plugin for retrieval
                    app.thirdeye.scanner.NetworkDeviceDiscoveryPlugin.setScannedDevices(devices);
                    
                    Toast.makeText(ConnectedDevicesActivity.this, 
                        "Found " + devices.size() + " devices", 
                        Toast.LENGTH_SHORT).show();
                });
            }

            @Override
            public void onScanError(String error) {
                mainHandler.post(() -> {
                    scanButton.setEnabled(true);
                    progressBar.setVisibility(View.GONE);
                    statusText.setText("Error: " + error);
                    Toast.makeText(ConnectedDevicesActivity.this, 
                        "Scan error: " + error, 
                        Toast.LENGTH_LONG).show();
                });
            }
        });
    }

    private void setupRecyclerView() {
        adapter = new DeviceAdapter(new ArrayList<>());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void startScan() {
        scanner.startScan();
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Stop scanner immediately
        if (scanner != null) {
            scanner.stopScan();
        }
        // Shutdown name resolver in background thread to avoid blocking
        if (nameResolver != null) {
            new Thread(() -> {
                try {
                    nameResolver.shutdown();
                } catch (Exception e) {
                    // Ignore errors during shutdown
                }
            }).start();
        }
    }
    
    @Override
    public void onBackPressed() {
        // Stop scan immediately when back is pressed
        if (scanner != null) {
            scanner.stopScan();
        }
        super.onBackPressed();
        // Finish immediately without waiting
        finish();
    }
}
