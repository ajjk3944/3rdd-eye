package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class SpeedtestServerEvaluation implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    SpeedtestServerEvaluation(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SpeedtestServerEvaluation)) {
            return false;
        }
        SpeedtestServerEvaluation speedtestServerEvaluation = (SpeedtestServerEvaluation) obj;
        String url = getUrl();
        String url2 = speedtestServerEvaluation.getUrl();
        if (url == null) {
            if (url2 != null) {
                return false;
            }
        } else if (!url.equals(url2)) {
            return false;
        }
        String version = getVersion();
        String version2 = speedtestServerEvaluation.getVersion();
        if (version == null) {
            if (version2 != null) {
                return false;
            }
        } else if (!version.equals(version2)) {
            return false;
        }
        Duration latency = getLatency();
        Duration latency2 = speedtestServerEvaluation.getLatency();
        if (latency == null) {
            if (latency2 != null) {
                return false;
            }
        } else if (!latency.equals(latency2)) {
            return false;
        }
        Duration jitter = getJitter();
        Duration jitter2 = speedtestServerEvaluation.getJitter();
        if (jitter == null) {
            if (jitter2 != null) {
                return false;
            }
        } else if (!jitter.equals(jitter2)) {
            return false;
        }
        if (getPacketLoss() != speedtestServerEvaluation.getPacketLoss()) {
            return false;
        }
        SpeedtestError err = getErr();
        SpeedtestError err2 = speedtestServerEvaluation.getErr();
        return err == null ? err2 == null : err.equals(err2);
    }

    public final native SpeedtestError getErr();

    public final native Duration getJitter();

    public final native Duration getLatency();

    public final native boolean getPacketLoss();

    public final native String getUrl();

    public final native String getVersion();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getUrl(), getVersion(), getLatency(), getJitter(), Boolean.valueOf(getPacketLoss()), getErr()});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setErr(SpeedtestError speedtestError);

    public final native void setJitter(Duration duration);

    public final native void setLatency(Duration duration);

    public final native void setPacketLoss(boolean z10);

    public final native void setUrl(String str);

    public final native void setVersion(String str);

    public String toString() {
        return "SpeedtestServerEvaluation{Url:" + getUrl() + ",Version:" + getVersion() + ",Latency:" + getLatency() + ",Jitter:" + getJitter() + ",PacketLoss:" + getPacketLoss() + ",Err:" + getErr() + ",}";
    }

    public SpeedtestServerEvaluation() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
