package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class SpeedTestApiTestReportResult implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    SpeedTestApiTestReportResult(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SpeedTestApiTestReportResult)) {
            return false;
        }
        SpeedTestApiTestReportResult speedTestApiTestReportResult = (SpeedTestApiTestReportResult) obj;
        String id2 = getId();
        String id3 = speedTestApiTestReportResult.getId();
        if (id2 == null) {
            if (id3 != null) {
                return false;
            }
        } else if (!id2.equals(id3)) {
            return false;
        }
        SpeedtestError err = getErr();
        SpeedtestError err2 = speedTestApiTestReportResult.getErr();
        return err == null ? err2 == null : err.equals(err2);
    }

    public final native SpeedtestError getErr();

    public final native String getId();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getId(), getErr()});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setErr(SpeedtestError speedtestError);

    public final native void setId(String str);

    public String toString() {
        return "SpeedTestApiTestReportResult{Id:" + getId() + ",Err:" + getErr() + ",}";
    }

    public SpeedTestApiTestReportResult() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
