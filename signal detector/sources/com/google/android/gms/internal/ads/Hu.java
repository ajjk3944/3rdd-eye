package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Hu implements T7 {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f9016a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f9017b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f9018c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f9019d = false;

    public Hu(ScheduledExecutorService scheduledExecutorService, C0623Mf c0623Mf) {
        this.f9016a = scheduledExecutorService;
        this.f9017b = c0623Mf;
    }

    public final synchronized void a(Runnable runnable, long j6) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (!this.f9019d) {
                    p2.j.f22785C.f22794g.l(this);
                    this.f9019d = true;
                }
                p2.j.f22785C.f22797k.getClass();
                Gu gu = new Gu(this, runnable, System.currentTimeMillis() + timeUnit.toMillis(j6));
                ScheduledFuture<?> scheduledFutureSchedule = this.f9016a.schedule(new RunnableC0558Ii(29, gu), j6, timeUnit);
                gu.f8476c = scheduledFutureSchedule;
                this.f9018c.put(scheduledFutureSchedule, gu);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final void g0(boolean z6) {
        if (z6) {
            this.f9017b.execute(new Fu(0, this));
        }
    }
}
