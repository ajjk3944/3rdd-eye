package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nr0 implements eh {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f14399a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f14400b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f14401c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f14402d = false;

    public nr0(ScheduledExecutorService scheduledExecutorService, ex exVar) {
        this.f14399a = scheduledExecutorService;
        this.f14400b = exVar;
    }

    @Override // com.google.android.gms.internal.ads.eh
    public final void S(boolean z3) {
        if (z3) {
            this.f14400b.execute(new s30(29, this));
        }
    }

    public final synchronized void a(Runnable runnable, long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (!this.f14402d) {
                    ua.j.C.g.f(this);
                    this.f14402d = true;
                }
                ua.j.C.f35267k.getClass();
                mr0 mr0Var = new mr0(this, runnable, System.currentTimeMillis() + timeUnit.toMillis(j));
                ScheduledFuture<?> scheduledFutureSchedule = this.f14399a.schedule(new s30(28, mr0Var), j, timeUnit);
                mr0Var.f13997c = scheduledFutureSchedule;
                this.f14401c.put(scheduledFutureSchedule, mr0Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
