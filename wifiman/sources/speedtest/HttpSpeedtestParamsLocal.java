package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class HttpSpeedtestParamsLocal implements Seq.Proxy, SpeedtestParams {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    HttpSpeedtestParamsLocal(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public native void addServer(String str, long j10, long j11, String str2);

    @Override // speedtest.SpeedtestParams
    public native boolean durationInfinite();

    @Override // speedtest.SpeedtestParams
    public native long durationMaxMillis();

    @Override // speedtest.SpeedtestParams
    public native long durationMinMillis();

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof HttpSpeedtestParamsLocal) && getInfinite() == ((HttpSpeedtestParamsLocal) obj).getInfinite();
    }

    public final native boolean getInfinite();

    @Override // speedtest.SpeedtestParams
    public native TestServer getServer(long j10);

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(getInfinite())});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    @Override // speedtest.SpeedtestParams
    public native boolean randomTxContent();

    @Override // speedtest.SpeedtestParams
    public native long serverCount();

    public final native void setInfinite(boolean z10);

    public String toString() {
        return "HttpSpeedtestParamsLocal{Infinite:" + getInfinite() + ",}";
    }

    public HttpSpeedtestParamsLocal() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
