package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class AD extends AbstractC2221zD {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceFutureC2326a f6955h;

    public AD(InterfaceFutureC2326a interfaceFutureC2326a) {
        interfaceFutureC2326a.getClass();
        this.f6955h = interfaceFutureC2326a;
    }

    @Override // com.google.android.gms.internal.ads.YC, f4.InterfaceFutureC2326a
    public final void a(Runnable runnable, Executor executor) {
        this.f6955h.a(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.YC, java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return this.f6955h.cancel(z6);
    }

    @Override // com.google.android.gms.internal.ads.YC, java.util.concurrent.Future
    public final Object get() {
        return this.f6955h.get();
    }

    @Override // com.google.android.gms.internal.ads.YC, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6955h.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.YC, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f6955h.isDone();
    }

    @Override // com.google.android.gms.internal.ads.YC
    public final String toString() {
        return this.f6955h.toString();
    }

    @Override // com.google.android.gms.internal.ads.YC, java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f6955h.get(j6, timeUnit);
    }
}
