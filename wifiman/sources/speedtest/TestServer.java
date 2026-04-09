package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class TestServer implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    TestServer(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof TestServer)) {
            return false;
        }
        return true;
    }

    public native void err() throws Exception;

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native boolean packetLoss();

    public String toString() {
        return "TestServer{}";
    }

    public TestServer() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
