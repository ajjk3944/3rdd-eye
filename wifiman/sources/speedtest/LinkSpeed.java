package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class LinkSpeed implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    LinkSpeed(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof LinkSpeed) && getBps() == ((LinkSpeed) obj).getBps();
    }

    public final native long getBps();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(getBps())});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setBps(long j10);

    public String toString() {
        return "LinkSpeed{Bps:" + getBps() + ",}";
    }

    public LinkSpeed() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
