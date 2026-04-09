package app.thirdeye.scanner.network;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import app.thirdeye.scanner.R;

/**
 * Device Adapter for RecyclerView
 */
public class DeviceAdapter extends RecyclerView.Adapter<DeviceAdapter.DeviceViewHolder> {
    private final List<DeviceInfo> devices;

    public DeviceAdapter(List<DeviceInfo> devices) {
        this.devices = devices;
    }

    @NonNull
    @Override
    public DeviceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_device, parent, false);
        return new DeviceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DeviceViewHolder holder, int position) {
        DeviceInfo device = devices.get(position);
        holder.bind(device);
    }

    @Override
    public int getItemCount() {
        return devices.size();
    }

    public void addDevice(DeviceInfo device) {
        devices.add(device);
        notifyItemInserted(devices.size() - 1);
    }

    public void clearDevices() {
        devices.clear();
        notifyDataSetChanged();
    }

    static class DeviceViewHolder extends RecyclerView.ViewHolder {
        private final TextView deviceNameText;
        private final TextView ipAddressText;
        private final TextView macAddressText;
        private final ImageView deviceIcon;

        public DeviceViewHolder(@NonNull View itemView) {
            super(itemView);
            deviceNameText = itemView.findViewById(R.id.tv_device_name);
            ipAddressText = itemView.findViewById(R.id.tv_ip_address);
            macAddressText = itemView.findViewById(R.id.tv_mac_address);
            deviceIcon = itemView.findViewById(R.id.iv_device_icon);
        }

        public void bind(DeviceInfo device) {
            deviceNameText.setText(device.getDeviceName());
            ipAddressText.setText(device.getIpAddress());
            macAddressText.setText(device.getMacAddress());

            // Set device icon based on type
            if (device.isRouter()) {
                deviceIcon.setImageResource(R.drawable.ic_router);
            } else if (device.isThisDevice()) {
                deviceIcon.setImageResource(R.drawable.ic_phone);
            } else {
                deviceIcon.setImageResource(R.drawable.ic_device);
            }
        }
    }
}
