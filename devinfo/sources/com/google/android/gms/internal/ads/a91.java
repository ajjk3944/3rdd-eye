package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a91 extends al0 implements ScheduledFuture, vd.b, Future {

    /* renamed from: c, reason: collision with root package name */
    public final m71 f9286c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledFuture f9287d;

    public a91(m71 m71Var, ScheduledFuture scheduledFuture) {
        super(7);
        this.f9286c = m71Var;
        this.f9287d = scheduledFuture;
    }

    @Override // vd.b
    public final void a(Runnable runnable, Executor executor) {
        this.f9286c.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        boolean zCancel = this.f9286c.cancel(z3);
        if (zCancel) {
            this.f9287d.cancel(z3);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f9287d.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f9286c.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f9287d.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9286c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9286c.isDone();
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final /* synthetic */ Object v() {
        return this.f9286c;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f9286c.get(j, timeUnit);
    }
}
