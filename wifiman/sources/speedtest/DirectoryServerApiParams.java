package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class DirectoryServerApiParams implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    DirectoryServerApiParams(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof DirectoryServerApiParams)) {
            return false;
        }
        DirectoryServerApiParams directoryServerApiParams = (DirectoryServerApiParams) obj;
        String token = getToken();
        String token2 = directoryServerApiParams.getToken();
        if (token == null) {
            if (token2 != null) {
                return false;
            }
        } else if (!token.equals(token2)) {
            return false;
        }
        String envString = getEnvString();
        String envString2 = directoryServerApiParams.getEnvString();
        if (envString == null) {
            if (envString2 != null) {
                return false;
            }
        } else if (!envString.equals(envString2)) {
            return false;
        }
        SpeedtestApplicationInfo appInfo = getAppInfo();
        SpeedtestApplicationInfo appInfo2 = directoryServerApiParams.getAppInfo();
        return appInfo == null ? appInfo2 == null : appInfo.equals(appInfo2);
    }

    public final native SpeedtestApplicationInfo getAppInfo();

    public final native String getEnvString();

    public final native String getToken();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getToken(), getEnvString(), getAppInfo()});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setAppInfo(SpeedtestApplicationInfo speedtestApplicationInfo);

    public final native void setEnvString(String str);

    public final native void setToken(String str);

    public String toString() {
        return "DirectoryServerApiParams{Token:" + getToken() + ",EnvString:" + getEnvString() + ",AppInfo:" + getAppInfo() + ",}";
    }

    public DirectoryServerApiParams() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
