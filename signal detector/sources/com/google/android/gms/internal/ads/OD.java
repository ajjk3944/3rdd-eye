package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class OD extends C0623Mf implements JD {

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f10170c;

    public OD(ScheduledExecutorService scheduledExecutorService) {
        super((ExecutorService) scheduledExecutorService);
        this.f10170c = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j6, TimeUnit timeUnit) {
        TD td = new TD(Executors.callable(runnable, null));
        return new MD(td, this.f10170c.schedule(td, j6, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j6, long j7, TimeUnit timeUnit) {
        ND nd = new ND(runnable);
        return new MD(nd, this.f10170c.scheduleAtFixedRate(nd, j6, j7, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j6, long j7, TimeUnit timeUnit) {
        ND nd = new ND(runnable);
        return new MD(nd, this.f10170c.scheduleWithFixedDelay(nd, j6, j7, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j6, TimeUnit timeUnit) {
        TD td = new TD(callable);
        return new MD(td, this.f10170c.schedule(td, j6, timeUnit));
    }
}
