package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class SpeedtestServer implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    public SpeedtestServer(SpeedtestServerParams speedtestServerParams) {
        int i__NewSpeedtestServer = __NewSpeedtestServer(speedtestServerParams);
        this.refnum = i__NewSpeedtestServer;
        Seq.trackGoRef(i__NewSpeedtestServer, this);
    }

    private static native int __NewSpeedtestServer(SpeedtestServerParams speedtestServerParams);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SpeedtestServer)) {
            return false;
        }
        SpeedtestServerStatus status = getStatus();
        SpeedtestServerStatus status2 = ((SpeedtestServer) obj).getStatus();
        return status == null ? status2 == null : status.equals(status2);
    }

    public final native SpeedtestServerStatus getStatus();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getStatus()});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setStatus(SpeedtestServerStatus speedtestServerStatus);

    public native void start(ChangedCallback changedCallback);

    public native void stop();

    public String toString() {
        return "SpeedtestServer{Status:" + getStatus() + ",}";
    }

    SpeedtestServer(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }
}
