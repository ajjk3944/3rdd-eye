package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class InternetServersEvaluation implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    InternetServersEvaluation(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public native void cancel();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof InternetServersEvaluation)) {
            return false;
        }
        InternetServersEvaluation internetServersEvaluation = (InternetServersEvaluation) obj;
        InternetServersEvaluationParams params = getParams();
        InternetServersEvaluationParams params2 = internetServersEvaluation.getParams();
        if (params == null) {
            if (params2 != null) {
                return false;
            }
        } else if (!params.equals(params2)) {
            return false;
        }
        SpeedtestError error = getError();
        SpeedtestError error2 = internetServersEvaluation.getError();
        if (error == null) {
            if (error2 != null) {
                return false;
            }
        } else if (!error.equals(error2)) {
            return false;
        }
        return getState() == internetServersEvaluation.getState();
    }

    public native SpeedServerStatus get(long j10);

    public final native SpeedtestError getError();

    public final native InternetServersEvaluationParams getParams();

    public final native long getState();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getParams(), getError(), Long.valueOf(getState())});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setError(SpeedtestError speedtestError);

    public final native void setParams(InternetServersEvaluationParams internetServersEvaluationParams);

    public final native void setState(long j10);

    public native long size();

    public native void start(ChangedCallback changedCallback);

    public String toString() {
        return "InternetServersEvaluation{Params:" + getParams() + ",Error:" + getError() + ",State:" + getState() + ",}";
    }

    public InternetServersEvaluation() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
