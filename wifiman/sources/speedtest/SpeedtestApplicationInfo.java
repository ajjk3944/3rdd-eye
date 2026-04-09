package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class SpeedtestApplicationInfo implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    SpeedtestApplicationInfo(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SpeedtestApplicationInfo)) {
            return false;
        }
        SpeedtestApplicationInfo speedtestApplicationInfo = (SpeedtestApplicationInfo) obj;
        String appName = getAppName();
        String appName2 = speedtestApplicationInfo.getAppName();
        if (appName == null) {
            if (appName2 != null) {
                return false;
            }
        } else if (!appName.equals(appName2)) {
            return false;
        }
        String appVersion = getAppVersion();
        String appVersion2 = speedtestApplicationInfo.getAppVersion();
        if (appVersion == null) {
            if (appVersion2 != null) {
                return false;
            }
        } else if (!appVersion.equals(appVersion2)) {
            return false;
        }
        String os = getOs();
        String os2 = speedtestApplicationInfo.getOs();
        if (os == null) {
            if (os2 != null) {
                return false;
            }
        } else if (!os.equals(os2)) {
            return false;
        }
        String osVersion = getOsVersion();
        String osVersion2 = speedtestApplicationInfo.getOsVersion();
        return osVersion == null ? osVersion2 == null : osVersion.equals(osVersion2);
    }

    public final native String getAppName();

    public final native String getAppVersion();

    public final native String getOs();

    public final native String getOsVersion();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getAppName(), getAppVersion(), getOs(), getOsVersion()});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setAppName(String str);

    public final native void setAppVersion(String str);

    public final native void setOs(String str);

    public final native void setOsVersion(String str);

    public String toString() {
        return "SpeedtestApplicationInfo{AppName:" + getAppName() + ",AppVersion:" + getAppVersion() + ",Os:" + getOs() + ",OsVersion:" + getOsVersion() + ",}";
    }

    public SpeedtestApplicationInfo() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
