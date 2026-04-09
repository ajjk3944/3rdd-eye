package speedtest;

import go.Seq;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class SpeedtestServerEvaluationParams implements Seq.Proxy {
    private final int refnum;

    static {
        Speedtest.touch();
    }

    SpeedtestServerEvaluationParams(int i10) {
        this.refnum = i10;
        Seq.trackGoRef(i10, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SpeedtestServerEvaluationParams)) {
            return false;
        }
        String url = getUrl();
        String url2 = ((SpeedtestServerEvaluationParams) obj).getUrl();
        return url == null ? url2 == null : url.equals(url2);
    }

    public final native String getUrl();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getUrl()});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setUrl(String str);

    public String toString() {
        return "SpeedtestServerEvaluationParams{Url:" + getUrl() + ",}";
    }

    public SpeedtestServerEvaluationParams() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }
}
