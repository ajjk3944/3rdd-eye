package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Duration implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    Duration(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof Duration) && getMs() == ((Duration) obj).getMs();
    }

    public final native long getMs();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(getMs())});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setMs(long j10);

    public String toString() {
        return "Duration{Ms:" + getMs() + ",}";
    }

    public Duration() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
