package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class MD extends Cr implements ScheduledFuture, InterfaceFutureC2326a, Future {

    /* renamed from: c, reason: collision with root package name */
    public final YC f9822c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledFuture f9823d;

    public MD(YC yc, ScheduledFuture scheduledFuture) {
        super(7);
        this.f9822c = yc;
        this.f9823d = scheduledFuture;
    }

    @Override // f4.InterfaceFutureC2326a
    public final void a(Runnable runnable, Executor executor) {
        this.f9822c.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        boolean zCancel = this.f9822c.cancel(z6);
        if (zCancel) {
            this.f9823d.cancel(z6);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f9823d.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f9822c.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f9823d.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9822c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9822c.isDone();
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final /* synthetic */ Object r() {
        return this.f9822c;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f9822c.get(j6, timeUnit);
    }
}
