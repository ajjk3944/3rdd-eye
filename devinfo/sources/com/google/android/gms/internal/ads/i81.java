package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i81 extends u81 {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f12171c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j81 f12172d;

    /* renamed from: e, reason: collision with root package name */
    public final Callable f12173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j81 f12174f;

    public i81(j81 j81Var, Callable callable, Executor executor) {
        this.f12174f = j81Var;
        this.f12172d = j81Var;
        executor.getClass();
        this.f12171c = executor;
        this.f12173e = callable;
    }

    @Override // com.google.android.gms.internal.ads.u81
    public final Object a() {
        return this.f12173e.call();
    }

    @Override // com.google.android.gms.internal.ads.u81
    public final String c() {
        return this.f12173e.toString();
    }

    @Override // com.google.android.gms.internal.ads.u81
    public final boolean d() {
        return this.f12172d.isDone();
    }

    @Override // com.google.android.gms.internal.ads.u81
    public final void e(Object obj) {
        this.f12172d.f12674p = null;
        this.f12174f.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.u81
    public final void f(Throwable th2) {
        j81 j81Var = this.f12172d;
        j81Var.f12674p = null;
        if (th2 instanceof ExecutionException) {
            j81Var.f(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            j81Var.cancel(false);
        } else {
            j81Var.f(th2);
        }
    }
}
