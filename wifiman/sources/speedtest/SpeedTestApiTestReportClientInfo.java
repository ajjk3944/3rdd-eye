package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class SpeedTestApiTestReportClientInfo implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    SpeedTestApiTestReportClientInfo(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SpeedTestApiTestReportClientInfo)) {
            return false;
        }
        SpeedTestApiTestReportClientInfo speedTestApiTestReportClientInfo = (SpeedTestApiTestReportClientInfo) obj;
        String source = getSource();
        String source2 = speedTestApiTestReportClientInfo.getSource();
        if (source == null) {
            if (source2 != null) {
                return false;
            }
        } else if (!source.equals(source2)) {
            return false;
        }
        String platform = getPlatform();
        String platform2 = speedTestApiTestReportClientInfo.getPlatform();
        if (platform == null) {
            if (platform2 != null) {
                return false;
            }
        } else if (!platform.equals(platform2)) {
            return false;
        }
        String appName = getAppName();
        String appName2 = speedTestApiTestReportClientInfo.getAppName();
        if (appName == null) {
            if (appName2 != null) {
                return false;
            }
        } else if (!appName.equals(appName2)) {
            return false;
        }
        String appVersion = getAppVersion();
        String appVersion2 = speedTestApiTestReportClientInfo.getAppVersion();
        if (appVersion == null) {
            if (appVersion2 != null) {
                return false;
            }
        } else if (!appVersion.equals(appVersion2)) {
            return false;
        }
        String deviceModel = getDeviceModel();
        String deviceModel2 = speedTestApiTestReportClientInfo.getDeviceModel();
        if (deviceModel == null) {
            if (deviceModel2 != null) {
                return false;
            }
        } else if (!deviceModel.equals(deviceModel2)) {
            return false;
        }
        String deviceManufacturer = getDeviceManufacturer();
        String deviceManufacturer2 = speedTestApiTestReportClientInfo.getDeviceManufacturer();
        if (deviceManufacturer == null) {
            if (deviceManufacturer2 != null) {
                return false;
            }
        } else if (!deviceManufacturer.equals(deviceManufacturer2)) {
            return false;
        }
        String os = getOs();
        String os2 = speedTestApiTestReportClientInfo.getOs();
        if (os == null) {
            if (os2 != null) {
                return false;
            }
        } else if (!os.equals(os2)) {
            return false;
        }
        String osVersion = getOsVersion();
        String osVersion2 = speedTestApiTestReportClientInfo.getOsVersion();
        return osVersion == null ? osVersion2 == null : osVersion.equals(osVersion2);
    }

    public final native String getAppName();

    public final native String getAppVersion();

    public final native String getDeviceManufacturer();

    public final native String getDeviceModel();

    public final native String getOs();

    public final native String getOsVersion();

    public final native String getPlatform();

    public final native String getSource();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getSource(), getPlatform(), getAppName(), getAppVersion(), getDeviceModel(), getDeviceManufacturer(), getOs(), getOsVersion()});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setAppName(String str);

    public final native void setAppVersion(String str);

    public final native void setDeviceManufacturer(String str);

    public final native void setDeviceModel(String str);

    public final native void setOs(String str);

    public final native void setOsVersion(String str);

    public final native void setPlatform(String str);

    public final native void setSource(String str);

    public String toString() {
        return "SpeedTestApiTestReportClientInfo{Source:" + getSource() + ",Platform:" + getPlatform() + ",AppName:" + getAppName() + ",AppVersion:" + getAppVersion() + ",DeviceModel:" + getDeviceModel() + ",DeviceManufacturer:" + getDeviceManufacturer() + ",Os:" + getOs() + ",OsVersion:" + getOsVersion() + ",}";
    }

    public SpeedTestApiTestReportClientInfo() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
