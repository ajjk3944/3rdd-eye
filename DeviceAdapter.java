package com.thirdeye.network;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * RecyclerView Adapter for displaying device list
 */
public class DeviceAdapter extends RecyclerView.Adapter<DeviceAdapter.DeviceViewHolder> {

    private List<DeviceInfo> deviceList;

    public DeviceAdapter(List<DeviceInfo> deviceList) {
        this.deviceList = deviceList;
    }

    @NonNull
    @Override
    public DeviceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Replace with your actual layout
        // View view = LayoutInflater.from(parent.getContext())
        //         .inflate(R.layout.item_device, parent, false);
        
        // Temporary view creation for demonstration
        View view = new View(parent.getContext());
        return new DeviceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DeviceViewHolder holder, int position) {
        DeviceInfo device = deviceList.get(position);
        holder.bind(device);
    }

    @Override
    public int getItemCount() {
        return deviceList.size();
    }

    public void updateDevices(List<DeviceInfo> newDevices) {
        this.deviceList = newDevices;
        notifyDataSetChanged();
    }

    static class DeviceViewHolder extends RecyclerView.ViewHolder {
        
        private TextView deviceNameText;
        private TextView ipAddressText;
        private TextView macAddressText;
        private ImageView deviceIcon;

        public DeviceViewHolder(@NonNull View itemView) {
            super(itemView);
            
            // Initialize views from your layout
            // deviceNameText = itemView.findViewById(R.id.tv_device_name);
            // ipAddressText = itemView.findViewById(R.id.tv_ip_address);
            // macAddressText = itemView.findViewById(R.id.tv_mac_address);
            // deviceIcon = itemView.findViewById(R.id.iv_device_icon);
        }

        public void bind(DeviceInfo device) {
            if (deviceNameText != null) {
                deviceNameText.setText(device.getHostname());
            }
            
            if (ipAddressText != null) {
                ipAddressText.setText("IP: " + device.getIpAddress());
            }
            
            if (macAddressText != null) {
                String macText = "MAC: " + device.getMacAddress();
                macAddressText.setText(macText);
            }
            
            // Set device icon based on type
            if (deviceIcon != null) {
                if (device.isGateway()) {
                    // deviceIcon.setImageResource(R.drawable.ic_router);
                } else if (device.isMyDevice()) {
                    // deviceIcon.setImageResource(R.drawable.ic_phone);
                } else {
                    // deviceIcon.setImageResource(R.drawable.ic_device);
                }
            }
        }
    }
}
