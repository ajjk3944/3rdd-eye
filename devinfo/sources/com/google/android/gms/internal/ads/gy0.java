package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gy0 implements dy0 {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f11650a = Executors.newSingleThreadScheduledExecutor();

    @Override // com.google.android.gms.internal.ads.dy0
    public final void b(Runnable runnable, long j) {
        this.f11650a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.dy0
    public final void a() {
    }
}
