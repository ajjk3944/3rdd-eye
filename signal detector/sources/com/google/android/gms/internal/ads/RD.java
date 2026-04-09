package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class RD extends AbstractC2167yD {

    /* renamed from: h, reason: collision with root package name */
    public InterfaceFutureC2326a f10872h;
    public ScheduledFuture i;

    @Override // com.google.android.gms.internal.ads.YC
    public final void f() {
        n(this.f10872h);
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f10872h = null;
        this.i = null;
    }

    @Override // com.google.android.gms.internal.ads.YC
    public final String g() {
        InterfaceFutureC2326a interfaceFutureC2326a = this.f10872h;
        ScheduledFuture scheduledFuture = this.i;
        if (interfaceFutureC2326a == null) {
            return null;
        }
        String string = interfaceFutureC2326a.toString();
        String strN = AbstractC1135f5.n(new StringBuilder(string.length() + 14), "inputFuture=[", string, "]");
        if (scheduledFuture == null) {
            return strN;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strN;
        }
        int length = strN.length();
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + length + 19 + 4);
        sb.append(strN);
        sb.append(", remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }
}
