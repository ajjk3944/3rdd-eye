package com.thirdeye.network;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Activity to display connected devices on the network
 * This is the main UI for the device scanning feature
 */
public class ConnectedDevicesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DeviceAdapter deviceAdapter;
    private List<DeviceInfo> deviceList;
    private Button scanButton;
    private ProgressBar progressBar;
    private TextView statusText;
    private TextView deviceCountText;
    
    private NetworkDeviceScanner scanner;
    private Handler mainHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_connected_devices);
        
        initializeViews();
        setupRecyclerView();
        setupScanner();
    }

    private void initializeViews() {
        // Initialize your views here
        // scanButton = findViewById(R.id.btn_scan);
        // progressBar = findViewById(R.id.progress_bar);
        // statusText = findViewById(R.id.tv_status);
        // deviceCountText = findViewById(R.id.tv_device_count);
        // recyclerView = findViewById(R.id.recycler_view_devices);
        
        mainHandler = new Handler(Looper.getMainLooper());
        
        // Setup scan button click listener
        if (scanButton != null) {
            scanButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startDeviceScan();
                }
            });
        }
    }

    private void setupRecyclerView() {
        deviceList = new ArrayList<>();
        deviceAdapter = new DeviceAdapter(deviceList);
        
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(deviceAdapter);
        }
    }

    private void setupScanner() {
        scanner = NetworkDeviceScanner.getInstance();
    }

    private void startDeviceScan() {
        if (scanner.isScanning()) {
            Toast.makeText(this, "Scan already in progress", Toast.LENGTH_SHORT).show();
            return;
        }
        
        // Clear previous results
        deviceList.clear();
        deviceAdapter.notifyDataSetChanged();
        
        // Update UI
        updateScanningUI(true);
        
        // Start scanning
        scanner.startScan(this, new NetworkDeviceScanner.ScanCallback() {
            @Override
            public void onDeviceFound(final String ipAddress, final String hostname) {
                mainHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        addDevice(ipAddress, hostname);
                    }
                });
            }

            @Override
            public void onScanComplete(HashMap<String, String> devices) {
                mainHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        updateScanningUI(false);
                        updateDeviceCount();
                        enrichDevicesWithMacAddresses();
                        Toast.makeText(ConnectedDevicesActivity.this, 
                                "Scan complete! Found " + deviceList.size() + " devices", 
                                Toast.LENGTH_SHORT).show();
                    }
                });
            }

            @Override
            public void onScanFailed() {
                mainHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        updateScanningUI(false);
                        Toast.makeText(ConnectedDevicesActivity.this, 
                                "Scan failed. Please check WiFi connection.", 
                                Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

    private void addDevice(String ipAddress, String hostname) {
        DeviceInfo deviceInfo = new DeviceInfo(ipAddress, hostname);
        
        // Mark special devices
        if (ipAddress.equals(scanner.getMyIpAddress())) {
            deviceInfo.setMyDevice(true);
            deviceInfo.setHostname(hostname + " (This Device)");
        }
        
        if (ipAddress.equals(scanner.getGatewayIpAddress())) {
            deviceInfo.setGateway(true);
            deviceInfo.setHostname(hostname + " (Router)");
        }
        
        deviceList.add(deviceInfo);
        deviceAdapter.notifyItemInserted(deviceList.size() - 1);
        updateDeviceCount();
    }

    private void enrichDevicesWithMacAddresses() {
        // Get all MAC addresses from ARP table
        Map<String, String> macAddresses = MacAddressScanner.getAllMacAddresses();
        
        // Update device list with MAC addresses
        for (DeviceInfo device : deviceList) {
            String mac = macAddresses.get(device.getIpAddress());
            if (mac != null) {
                device.setMacAddress(mac);
            }
        }
        
        deviceAdapter.notifyDataSetChanged();
    }

    private void updateScanningUI(boolean isScanning) {
        if (scanButton != null) {
            scanButton.setEnabled(!isScanning);
            scanButton.setText(isScanning ? "Scanning..." : "Scan Network");
        }
        
        if (progressBar != null) {
            progressBar.setVisibility(isScanning ? View.VISIBLE : View.GONE);
        }
        
        if (statusText != null) {
            statusText.setText(isScanning ? "Scanning network..." : "Ready to scan");
        }
    }

    private void updateDeviceCount() {
        if (deviceCountText != null) {
            deviceCountText.setText(deviceList.size() + " devices found");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (scanner != null && scanner.isScanning()) {
            scanner.stopScan();
        }
    }
}
