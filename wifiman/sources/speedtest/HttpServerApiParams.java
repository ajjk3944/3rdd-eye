package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class HttpServerApiParams implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    HttpServerApiParams(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof HttpServerApiParams)) {
            return false;
        }
        HttpServerApiParams httpServerApiParams = (HttpServerApiParams) obj;
        String token = getToken();
        String token2 = httpServerApiParams.getToken();
        if (token == null) {
            if (token2 != null) {
                return false;
            }
        } else if (!token.equals(token2)) {
            return false;
        }
        SpeedtestApplicationInfo appInfo = getAppInfo();
        SpeedtestApplicationInfo appInfo2 = httpServerApiParams.getAppInfo();
        return appInfo == null ? appInfo2 == null : appInfo.equals(appInfo2);
    }

    public final native SpeedtestApplicationInfo getAppInfo();

    public final native String getToken();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getToken(), getAppInfo()});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setAppInfo(SpeedtestApplicationInfo speedtestApplicationInfo);

    public final native void setToken(String str);

    public String toString() {
        return "HttpServerApiParams{Token:" + getToken() + ",AppInfo:" + getAppInfo() + ",}";
    }

    public HttpServerApiParams() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
