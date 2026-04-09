package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class SpeedtestServerStatus implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    SpeedtestServerStatus(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SpeedtestServerStatus)) {
            return false;
        }
        SpeedtestServerStatus speedtestServerStatus = (SpeedtestServerStatus) obj;
        if (getPort() != speedtestServerStatus.getPort() || getConnectionCount() != speedtestServerStatus.getConnectionCount()) {
            return false;
        }
        SpeedtestError err = getErr();
        SpeedtestError err2 = speedtestServerStatus.getErr();
        return err == null ? err2 == null : err.equals(err2);
    }

    public final native long getConnectionCount();

    public final native SpeedtestError getErr();

    public final native long getPort();

    public native long getState();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(getPort()), Long.valueOf(getConnectionCount()), getErr()});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setConnectionCount(long j10);

    public final native void setErr(SpeedtestError speedtestError);

    public final native void setPort(long j10);

    public String toString() {
        return "SpeedtestServerStatus{Port:" + getPort() + ",ConnectionCount:" + getConnectionCount() + ",Err:" + getErr() + ",}";
    }

    public SpeedtestServerStatus() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
