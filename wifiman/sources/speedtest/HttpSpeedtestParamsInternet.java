package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class HttpSpeedtestParamsInternet implements Seq.Proxy, SpeedtestParams {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    HttpSpeedtestParamsInternet(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public native SpeedtestError addServer(String str, long j10, String str2);

    @Override // speedtest.SpeedtestParams
    public native boolean durationInfinite();

    @Override // speedtest.SpeedtestParams
    public native long durationMaxMillis();

    @Override // speedtest.SpeedtestParams
    public native long durationMinMillis();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof HttpSpeedtestParamsInternet)) {
            return false;
        }
        return true;
    }

    @Override // speedtest.SpeedtestParams
    public native TestServer getServer(long j10);

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
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

    public String toString() {
        return "HttpSpeedtestParamsInternet{}";
    }

    public HttpSpeedtestParamsInternet() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
