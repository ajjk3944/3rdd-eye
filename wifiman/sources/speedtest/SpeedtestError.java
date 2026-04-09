package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class SpeedtestError implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    SpeedtestError(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SpeedtestError)) {
            return false;
        }
        SpeedtestError speedtestError = (SpeedtestError) obj;
        if (getID() != speedtestError.getID()) {
            return false;
        }
        String message = getMessage();
        String message2 = speedtestError.getMessage();
        return message == null ? message2 == null : message.equals(message2);
    }

    public final native long getID();

    public final native String getMessage();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(getID()), getMessage()});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setID(long j10);

    public final native void setMessage(String str);

    public String toString() {
        return "SpeedtestError{ID:" + getID() + ",Message:" + getMessage() + ",}";
    }

    public SpeedtestError() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
