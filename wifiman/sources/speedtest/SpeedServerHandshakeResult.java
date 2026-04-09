package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class SpeedServerHandshakeResult implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    SpeedServerHandshakeResult(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SpeedServerHandshakeResult)) {
            return false;
        }
        SpeedServerHandshakeResult speedServerHandshakeResult = (SpeedServerHandshakeResult) obj;
        String version = getVersion();
        String version2 = speedServerHandshakeResult.getVersion();
        if (version == null) {
            if (version2 != null) {
                return false;
            }
        } else if (!version.equals(version2)) {
            return false;
        }
        if (getFullApi() != speedServerHandshakeResult.getFullApi()) {
            return false;
        }
        SpeedtestError error = getError();
        SpeedtestError error2 = speedServerHandshakeResult.getError();
        return error == null ? error2 == null : error.equals(error2);
    }

    public final native SpeedtestError getError();

    public final native boolean getFullApi();

    public final native String getVersion();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getVersion(), Boolean.valueOf(getFullApi()), getError()});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setError(SpeedtestError speedtestError);

    public final native void setFullApi(boolean z10);

    public final native void setVersion(String str);

    public String toString() {
        return "SpeedServerHandshakeResult{Version:" + getVersion() + ",FullApi:" + getFullApi() + ",Error:" + getError() + ",}";
    }

    public SpeedServerHandshakeResult() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
