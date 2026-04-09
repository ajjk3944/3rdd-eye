package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class HttpServerApiFactory implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    HttpServerApiFactory(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof HttpServerApiFactory)) {
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

    public native HttpSpeedtestServerApi newApi(HttpServerApiParams httpServerApiParams);

    public String toString() {
        return "HttpServerApiFactory{}";
    }

    public HttpServerApiFactory() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
