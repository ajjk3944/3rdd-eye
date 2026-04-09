package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Si, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0728Si implements T7 {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f11217a;

    /* renamed from: b, reason: collision with root package name */
    public final Q2.a f11218b;

    /* renamed from: c, reason: collision with root package name */
    public ScheduledFuture f11219c;

    /* renamed from: d, reason: collision with root package name */
    public long f11220d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f11221e = -1;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC1553mt f11222f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11223g = false;

    public C0728Si(ScheduledExecutorService scheduledExecutorService, Q2.a aVar) {
        this.f11217a = scheduledExecutorService;
        this.f11218b = aVar;
        p2.j.f22785C.f22794g.l(this);
    }

    public final synchronized void a(int i, RunnableC1553mt runnableC1553mt) {
        this.f11222f = runnableC1553mt;
        this.f11218b.getClass();
        long j6 = i;
        this.f11220d = SystemClock.elapsedRealtime() + j6;
        this.f11219c = this.f11217a.schedule(runnableC1553mt, j6, TimeUnit.MILLISECONDS);
    }

    public final synchronized void b() {
        try {
            if (this.f11223g) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f11219c;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f11221e = -1L;
            } else {
                this.f11219c.cancel(true);
                long j6 = this.f11220d;
                this.f11218b.getClass();
                this.f11221e = j6 - SystemClock.elapsedRealtime();
            }
            this.f11223g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final void g0(boolean z6) {
        ScheduledFuture scheduledFuture;
        if (!z6) {
            b();
            return;
        }
        synchronized (this) {
            try {
                if (this.f11223g) {
                    if (this.f11221e > 0 && (scheduledFuture = this.f11219c) != null && scheduledFuture.isCancelled()) {
                        this.f11219c = this.f11217a.schedule(this.f11222f, this.f11221e, TimeUnit.MILLISECONDS);
                    }
                    this.f11223g = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
