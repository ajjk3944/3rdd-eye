package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class SpeedtestServerParams implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    SpeedtestServerParams(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SpeedtestServerParams)) {
            return false;
        }
        SpeedtestServerParams speedtestServerParams = (SpeedtestServerParams) obj;
        SpeedtestServerDiscoveryParams discovery = getDiscovery();
        SpeedtestServerDiscoveryParams discovery2 = speedtestServerParams.getDiscovery();
        if (discovery == null) {
            if (discovery2 != null) {
                return false;
            }
        } else if (!discovery.equals(discovery2)) {
            return false;
        }
        return getHttpServer() == speedtestServerParams.getHttpServer() && getTcpServer() == speedtestServerParams.getTcpServer();
    }

    public final native SpeedtestServerDiscoveryParams getDiscovery();

    public final native boolean getHttpServer();

    public final native boolean getTcpServer();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getDiscovery(), Boolean.valueOf(getHttpServer()), Boolean.valueOf(getTcpServer())});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setDiscovery(SpeedtestServerDiscoveryParams speedtestServerDiscoveryParams);

    public final native void setHttpServer(boolean z10);

    public final native void setTcpServer(boolean z10);

    public String toString() {
        return "SpeedtestServerParams{Discovery:" + getDiscovery() + ",HttpServer:" + getHttpServer() + ",TcpServer:" + getTcpServer() + ",}";
    }

    public SpeedtestServerParams() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
