package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class InternetServersEvaluationParams implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    InternetServersEvaluationParams(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof InternetServersEvaluationParams)) {
            return false;
        }
        LocationCoordinates coordinates = getCoordinates();
        LocationCoordinates coordinates2 = ((InternetServersEvaluationParams) obj).getCoordinates();
        return coordinates == null ? coordinates2 == null : coordinates.equals(coordinates2);
    }

    public final native LocationCoordinates getCoordinates();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getCoordinates()});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setCoordinates(LocationCoordinates locationCoordinates);

    public String toString() {
        return "InternetServersEvaluationParams{Coordinates:" + getCoordinates() + ",}";
    }

    public InternetServersEvaluationParams() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
