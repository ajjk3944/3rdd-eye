package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o30 implements eh {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f14524a;

    /* renamed from: b, reason: collision with root package name */
    public final tb.a f14525b;

    /* renamed from: c, reason: collision with root package name */
    public ScheduledFuture f14526c;

    /* renamed from: d, reason: collision with root package name */
    public long f14527d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f14528e = -1;

    /* renamed from: f, reason: collision with root package name */
    public ro0 f14529f = null;
    public boolean g = false;

    public o30(ScheduledExecutorService scheduledExecutorService, tb.a aVar) {
        this.f14524a = scheduledExecutorService;
        this.f14525b = aVar;
        ua.j.C.g.f(this);
    }

    @Override // com.google.android.gms.internal.ads.eh
    public final void S(boolean z3) {
        ScheduledFuture scheduledFuture;
        if (!z3) {
            b();
            return;
        }
        synchronized (this) {
            try {
                if (this.g) {
                    if (this.f14528e > 0 && (scheduledFuture = this.f14526c) != null && scheduledFuture.isCancelled()) {
                        this.f14526c = this.f14524a.schedule(this.f14529f, this.f14528e, TimeUnit.MILLISECONDS);
                    }
                    this.g = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void a(int i4, ro0 ro0Var) {
        this.f14529f = ro0Var;
        this.f14525b.getClass();
        long j = i4;
        this.f14527d = SystemClock.elapsedRealtime() + j;
        this.f14526c = this.f14524a.schedule(ro0Var, j, TimeUnit.MILLISECONDS);
    }

    public final synchronized void b() {
        try {
            if (this.g) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f14526c;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f14528e = -1L;
            } else {
                this.f14526c.cancel(true);
                long j = this.f14527d;
                this.f14525b.getClass();
                this.f14528e = j - SystemClock.elapsedRealtime();
            }
            this.g = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
