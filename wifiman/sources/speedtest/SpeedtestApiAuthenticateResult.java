package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class SpeedtestApiAuthenticateResult implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    SpeedtestApiAuthenticateResult(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SpeedtestApiAuthenticateResult)) {
            return false;
        }
        SpeedtestApiAuthenticateResult speedtestApiAuthenticateResult = (SpeedtestApiAuthenticateResult) obj;
        String token = getToken();
        String token2 = speedtestApiAuthenticateResult.getToken();
        if (token == null) {
            if (token2 != null) {
                return false;
            }
        } else if (!token.equals(token2)) {
            return false;
        }
        if (getTTL() != speedtestApiAuthenticateResult.getTTL()) {
            return false;
        }
        SpeedtestError err = getErr();
        SpeedtestError err2 = speedtestApiAuthenticateResult.getErr();
        return err == null ? err2 == null : err.equals(err2);
    }

    public final native SpeedtestError getErr();

    public final native int getTTL();

    public final native String getToken();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getToken(), Integer.valueOf(getTTL()), getErr()});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setErr(SpeedtestError speedtestError);

    public final native void setTTL(int i10);

    public final native void setToken(String str);

    public String toString() {
        return "SpeedtestApiAuthenticateResult{Token:" + getToken() + ",TTL:" + getTTL() + ",Err:" + getErr() + ",}";
    }

    public SpeedtestApiAuthenticateResult() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
