package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.v81;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q0 implements r0 {

    /* renamed from: b, reason: collision with root package name */
    public static final v81 f20214b = new v81(1, q0.class);

    /* renamed from: a, reason: collision with root package name */
    public final Object f20215a;

    public q0(Object obj) {
        this.f20215a = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.r0
    public final void c(Runnable runnable, Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            f20214b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", je.u.u("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f20215a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f20215a.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f20215a;
    }
}
