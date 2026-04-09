package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o81 extends n81 {

    /* renamed from: h, reason: collision with root package name */
    public final vd.b f14611h;

    public o81(vd.b bVar) {
        bVar.getClass();
        this.f14611h = bVar;
    }

    @Override // com.google.android.gms.internal.ads.m71, vd.b
    public final void a(Runnable runnable, Executor executor) {
        this.f14611h.a(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.m71, java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return this.f14611h.cancel(z3);
    }

    @Override // com.google.android.gms.internal.ads.m71, java.util.concurrent.Future
    public final Object get() {
        return this.f14611h.get();
    }

    @Override // com.google.android.gms.internal.ads.m71, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14611h.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.m71, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14611h.isDone();
    }

    @Override // com.google.android.gms.internal.ads.m71
    public final String toString() {
        return this.f14611h.toString();
    }

    @Override // com.google.android.gms.internal.ads.m71, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f14611h.get(j, timeUnit);
    }
}
