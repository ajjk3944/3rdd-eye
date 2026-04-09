package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Of, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0657Of implements InterfaceFutureC2326a {

    /* renamed from: a, reason: collision with root package name */
    public final PD f10212a = new PD();

    @Override // f4.InterfaceFutureC2326a
    public final void a(Runnable runnable, Executor executor) {
        this.f10212a.a(runnable, executor);
    }

    public final boolean b(Object obj) {
        boolean zD = this.f10212a.d(obj);
        if (!zD) {
            p2.j.f22785C.f22795h.g("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return zD;
    }

    public final void c(Throwable th) {
        if (this.f10212a.e(th)) {
            return;
        }
        p2.j.f22785C.f22795h.g("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        return this.f10212a.cancel(z6);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f10212a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f10212a.f14234a instanceof RC;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f10212a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f10212a.get(j6, timeUnit);
    }
}
