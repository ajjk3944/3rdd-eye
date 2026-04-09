package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ry, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1827ry implements InterfaceC1666oy {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f16652a = Executors.newSingleThreadScheduledExecutor();

    @Override // com.google.android.gms.internal.ads.InterfaceC1666oy
    public final void a(Runnable runnable, long j6) {
        this.f16652a.schedule(runnable, j6, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1666oy
    public final void c() {
    }
}
