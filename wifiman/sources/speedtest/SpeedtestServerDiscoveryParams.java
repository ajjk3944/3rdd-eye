package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class SpeedtestServerDiscoveryParams implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    SpeedtestServerDiscoveryParams(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public native void additionalTxtRecord(String str, String str2);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SpeedtestServerDiscoveryParams)) {
            return false;
        }
        SpeedtestServerDiscoveryParams speedtestServerDiscoveryParams = (SpeedtestServerDiscoveryParams) obj;
        String ip = getIp();
        String ip2 = speedtestServerDiscoveryParams.getIp();
        if (ip == null) {
            if (ip2 != null) {
                return false;
            }
        } else if (!ip.equals(ip2)) {
            return false;
        }
        String name = getName();
        String name2 = speedtestServerDiscoveryParams.getName();
        if (name == null) {
            if (name2 != null) {
                return false;
            }
        } else if (!name.equals(name2)) {
            return false;
        }
        String version = getVersion();
        String version2 = speedtestServerDiscoveryParams.getVersion();
        if (version == null) {
            if (version2 != null) {
                return false;
            }
        } else if (!version.equals(version2)) {
            return false;
        }
        String model = getModel();
        String model2 = speedtestServerDiscoveryParams.getModel();
        if (model == null) {
            if (model2 != null) {
                return false;
            }
        } else if (!model.equals(model2)) {
            return false;
        }
        String type = getType();
        String type2 = speedtestServerDiscoveryParams.getType();
        return type == null ? type2 == null : type.equals(type2);
    }

    public final native String getIp();

    public final native String getModel();

    public final native String getName();

    public final native String getType();

    public final native String getVersion();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getIp(), getName(), getVersion(), getModel(), getType()});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setIp(String str);

    public final native void setModel(String str);

    public final native void setName(String str);

    public final native void setType(String str);

    public final native void setVersion(String str);

    public String toString() {
        return "SpeedtestServerDiscoveryParams{Ip:" + getIp() + ",Name:" + getName() + ",Version:" + getVersion() + ",Model:" + getModel() + ",Type:" + getType() + ",}";
    }

    public SpeedtestServerDiscoveryParams() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
