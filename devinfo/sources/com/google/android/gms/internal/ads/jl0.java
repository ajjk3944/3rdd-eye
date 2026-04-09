package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jl0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12777a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final long f12778b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12779c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12780d;

    public jl0(qn0 qn0Var, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f12779c = qn0Var;
        this.f12778b = j;
        this.f12780d = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int a() {
        switch (this.f12777a) {
            case 0:
                return 4;
            default:
                return ((qn0) this.f12779c).a();
        }
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final vd.b b() {
        switch (this.f12777a) {
            case 0:
                tb.a aVar = (tb.a) this.f12779c;
                hq0 hq0Var = (hq0) this.f12780d;
                aVar.getClass();
                return yo0.e(new kl0(hq0Var, System.currentTimeMillis(), this.f12778b));
            default:
                vd.b bVarB = ((qn0) this.f12779c).b();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (((Boolean) va.s.f36163e.f36166c.a(sk.M2)).booleanValue()) {
                    timeUnit = TimeUnit.MICROSECONDS;
                }
                long j = this.f12778b;
                if (j > 0) {
                    bVarB = yo0.E(bVarB, j, timeUnit, (ScheduledExecutorService) this.f12780d);
                }
                return yo0.D(bVarB, Throwable.class, new fp(9, this), fx.g);
        }
    }

    public jl0(tb.a aVar, hq0 hq0Var, long j) {
        this.f12779c = aVar;
        this.f12780d = hq0Var;
        this.f12778b = j;
    }
}
