package app.thirdeye.scanner.network;

/**
 * Device Information Model
 */
public class DeviceInfo {
    private String ipAddress;
    private String macAddress;
    private String hostname;
    private String deviceName;
    private String vendor;
    private boolean isOnline;
    private boolean isRouter;
    private boolean isThisDevice;
    private long lastSeen;

    public DeviceInfo() {
        this.lastSeen = System.currentTimeMillis();
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getMacAddress() {
        return macAddress != null ? macAddress : "Unknown";
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getDeviceName() {
        return deviceName != null ? deviceName : "Unknown Device";
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public boolean isRouter() {
        return isRouter;
    }

    public void setIsRouter(boolean router) {
        isRouter = router;
    }

    public boolean isThisDevice() {
        return isThisDevice;
    }

    public void setIsThisDevice(boolean thisDevice) {
        isThisDevice = thisDevice;
    }

    public long getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(long lastSeen) {
        this.lastSeen = lastSeen;
    }
}
