package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class SpeedServerStatus implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    SpeedServerStatus(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SpeedServerStatus)) {
            return false;
        }
        SpeedServerStatus speedServerStatus = (SpeedServerStatus) obj;
        InternetSpeedTestServer server = getServer();
        InternetSpeedTestServer server2 = speedServerStatus.getServer();
        if (server == null) {
            if (server2 != null) {
                return false;
            }
        } else if (!server.equals(server2)) {
            return false;
        }
        SpeedtestServerEvaluation evaluation = getEvaluation();
        SpeedtestServerEvaluation evaluation2 = speedServerStatus.getEvaluation();
        return evaluation == null ? evaluation2 == null : evaluation.equals(evaluation2);
    }

    public final native SpeedtestServerEvaluation getEvaluation();

    public final native InternetSpeedTestServer getServer();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getServer(), getEvaluation()});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setEvaluation(SpeedtestServerEvaluation speedtestServerEvaluation);

    public final native void setServer(InternetSpeedTestServer internetSpeedTestServer);

    public String toString() {
        return "SpeedServerStatus{Server:" + getServer() + ",Evaluation:" + getEvaluation() + ",}";
    }

    public SpeedServerStatus() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
