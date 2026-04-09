package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class TcpSpeedtestServerApiFactory implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    TcpSpeedtestServerApiFactory(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof TcpSpeedtestServerApiFactory)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native TcpSpeedtestServerApi newApi(TcpSpeedtestServerApiParams tcpSpeedtestServerApiParams);

    public String toString() {
        return "TcpSpeedtestServerApiFactory{}";
    }

    public TcpSpeedtestServerApiFactory() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
