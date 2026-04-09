package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c91 extends ex implements x81 {

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f10021c;

    public c91(ScheduledExecutorService scheduledExecutorService) {
        super((ExecutorService) scheduledExecutorService);
        this.f10021c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.ex, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a3.a.h(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        h91 h91Var = new h91(Executors.callable(runnable, null));
        return new a91(h91Var, this.f10021c.schedule(h91Var, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j8, TimeUnit timeUnit) {
        b91 b91Var = new b91(runnable);
        return new a91(b91Var, this.f10021c.scheduleAtFixedRate(b91Var, j, j8, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j8, TimeUnit timeUnit) {
        b91 b91Var = new b91(runnable);
        return new a91(b91Var, this.f10021c.scheduleWithFixedDelay(b91Var, j, j8, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        h91 h91Var = new h91(callable);
        return new a91(h91Var, this.f10021c.schedule(h91Var, j, timeUnit));
    }
}
