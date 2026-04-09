package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yq3 extends eq3 {
    public n70 m;
    public ScheduledFuture n;

    @Override // defpackage.gp3
    public final void f() {
        n(this.m);
        ScheduledFuture scheduledFuture = this.n;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.m = null;
        this.n = null;
    }

    @Override // defpackage.gp3
    public final String g() {
        n70 n70Var = this.m;
        ScheduledFuture scheduledFuture = this.n;
        if (n70Var == null) {
            return null;
        }
        String string = n70Var.toString();
        String strL = ex0.l(new StringBuilder(string.length() + 14), "inputFuture=[", string, "]");
        if (scheduledFuture == null) {
            return strL;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strL;
        }
        int length = strL.length();
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + length + 19 + 4);
        sb.append(strL);
        sb.append(", remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }
}
