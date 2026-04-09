package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class gx implements vd.b {

    /* renamed from: a, reason: collision with root package name */
    public final d91 f11625a = new d91();

    @Override // vd.b
    public final void a(Runnable runnable, Executor executor) {
        this.f11625a.a(runnable, executor);
    }

    public final boolean b(Object obj) {
        boolean zE = this.f11625a.e(obj);
        if (!zE) {
            ua.j.C.f35265h.g("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return zE;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z3) {
        return this.f11625a.cancel(z3);
    }

    public final void d(Throwable th2) {
        if (this.f11625a.f(th2)) {
            return;
        }
        ua.j.C.f35265h.g("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f11625a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f11625a.f17113a instanceof f71;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f11625a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f11625a.get(j, timeUnit);
    }
}
