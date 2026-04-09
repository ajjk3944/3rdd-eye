package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class SpeedTestApiTestReportServers implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    SpeedTestApiTestReportServers(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public native void addSecondaryServer(String str);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SpeedTestApiTestReportServers)) {
            return false;
        }
        String mainServer = getMainServer();
        String mainServer2 = ((SpeedTestApiTestReportServers) obj).getMainServer();
        return mainServer == null ? mainServer2 == null : mainServer.equals(mainServer2);
    }

    public final native String getMainServer();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getMainServer()});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setMainServer(String str);

    public String toString() {
        return "SpeedTestApiTestReportServers{MainServer:" + getMainServer() + ",}";
    }

    public SpeedTestApiTestReportServers() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
