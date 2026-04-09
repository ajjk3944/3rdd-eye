package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b4 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f20091a;

    /* renamed from: b, reason: collision with root package name */
    public final a4 f20092b = new a4(this);

    public b4(z3 z3Var) {
        this.f20091a = new WeakReference(z3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.r0
    public final void c(Runnable runnable, Executor executor) {
        this.f20092b.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        z3 z3Var = (z3) this.f20091a.get();
        boolean zCancel = this.f20092b.cancel(z3);
        if (!zCancel || z3Var == null) {
            return zCancel;
        }
        z3Var.f20274a = null;
        z3Var.f20275b = null;
        z3Var.f20276c.i(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f20092b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f20092b.f20267a instanceof e1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f20092b.isDone();
    }

    public final String toString() {
        return this.f20092b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f20092b.get(j, timeUnit);
    }
}
