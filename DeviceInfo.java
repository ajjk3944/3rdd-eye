package com.thirdeye.network;

import java.io.Serializable;

/**
 * Model class to hold device information
 */
public class DeviceInfo implements Serializable {
    
    private String ipAddress;
    private String macAddress;
    private String hostname;
    private String vendor;
    private boolean isGateway;
    private boolean isMyDevice;
    
    public DeviceInfo() {
        this.ipAddress = "";
        this.macAddress = "00:00:00:00:00:00";
        this.hostname = "Unknown";
        this.vendor = "Unknown";
        this.isGateway = false;
        this.isMyDevice = false;
    }
    
    public DeviceInfo(String ipAddress, String hostname) {
        this();
        this.ipAddress = ipAddress;
        this.hostname = hostname;
    }
    
    // Getters
    public String getIpAddress() {
        return ipAddress;
    }
    
    public String getMacAddress() {
        return macAddress;
    }
    
    public String getHostname() {
        return hostname;
    }
    
    public String getVendor() {
        return vendor;
    }
    
    public boolean isGateway() {
        return isGateway;
    }
    
    public boolean isMyDevice() {
        return isMyDevice;
    }
    
    // Setters
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }
    
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
    
    public void setGateway(boolean gateway) {
        isGateway = gateway;
    }
    
    public void setMyDevice(boolean myDevice) {
        isMyDevice = myDevice;
    }
    
    @Override
    public String toString() {
        return "DeviceInfo{" +
                "ipAddress='" + ipAddress + '\'' +
                ", macAddress='" + macAddress + '\'' +
                ", hostname='" + hostname + '\'' +
                ", vendor='" + vendor + '\'' +
                ", isGateway=" + isGateway +
                ", isMyDevice=" + isMyDevice +
                '}';
    }
}
