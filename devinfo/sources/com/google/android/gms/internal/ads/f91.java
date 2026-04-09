package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f91 extends m81 {

    /* renamed from: h, reason: collision with root package name */
    public vd.b f11072h;

    /* renamed from: i, reason: collision with root package name */
    public ScheduledFuture f11073i;

    @Override // com.google.android.gms.internal.ads.m71
    public final void g() {
        o(this.f11072h);
        ScheduledFuture scheduledFuture = this.f11073i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f11072h = null;
        this.f11073i = null;
    }

    @Override // com.google.android.gms.internal.ads.m71
    public final String h() {
        vd.b bVar = this.f11072h;
        ScheduledFuture scheduledFuture = this.f11073i;
        if (bVar == null) {
            return null;
        }
        String string = bVar.toString();
        String strM = r5.c.m(new StringBuilder(string.length() + 14), "inputFuture=[", string, "]");
        if (scheduledFuture == null) {
            return strM;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strM;
        }
        int length = strM.length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(delay).length() + length + 19 + 4);
        sb2.append(strM);
        sb2.append(", remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }
}
