package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class SpeedtestApiTestReportLocalParams implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    SpeedtestApiTestReportLocalParams(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SpeedtestApiTestReportLocalParams)) {
            return false;
        }
        SpeedtestApiTestReportLocalParams speedtestApiTestReportLocalParams = (SpeedtestApiTestReportLocalParams) obj;
        String from = getFrom();
        String from2 = speedtestApiTestReportLocalParams.getFrom();
        if (from == null) {
            if (from2 != null) {
                return false;
            }
        } else if (!from.equals(from2)) {
            return false;
        }
        String to = getTo();
        String to2 = speedtestApiTestReportLocalParams.getTo();
        if (to == null) {
            if (to2 != null) {
                return false;
            }
        } else if (!to.equals(to2)) {
            return false;
        }
        String apModel = getApModel();
        String apModel2 = speedtestApiTestReportLocalParams.getApModel();
        if (apModel == null) {
            if (apModel2 != null) {
                return false;
            }
        } else if (!apModel.equals(apModel2)) {
            return false;
        }
        LocationCoordinates coordinates = getCoordinates();
        LocationCoordinates coordinates2 = speedtestApiTestReportLocalParams.getCoordinates();
        return coordinates == null ? coordinates2 == null : coordinates.equals(coordinates2);
    }

    public final native String getApModel();

    public final native LocationCoordinates getCoordinates();

    public final native String getFrom();

    public final native String getTo();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getFrom(), getTo(), getApModel(), getCoordinates()});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setApModel(String str);

    public final native void setCoordinates(LocationCoordinates locationCoordinates);

    public final native void setFrom(String str);

    public final native void setTo(String str);

    public String toString() {
        return "SpeedtestApiTestReportLocalParams{From:" + getFrom() + ",To:" + getTo() + ",ApModel:" + getApModel() + ",Coordinates:" + getCoordinates() + ",}";
    }

    public SpeedtestApiTestReportLocalParams() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
