package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import q2.C2841s;

/* loaded from: classes.dex */
public final class Lr implements Ms {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9770a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final long f9771b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9772c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9773d;

    public Lr(Q2.a aVar, C0960bu c0960bu, long j6) {
        this.f9772c = aVar;
        this.f9773d = c0960bu;
        this.f9771b = j6;
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final InterfaceFutureC2326a a() {
        switch (this.f9770a) {
            case 0:
                Q2.a aVar = (Q2.a) this.f9772c;
                C0960bu c0960bu = (C0960bu) this.f9773d;
                aVar.getClass();
                return AbstractC1984ut.e(new Mr(c0960bu, System.currentTimeMillis(), this.f9771b));
            default:
                InterfaceFutureC2326a interfaceFutureC2326aA = ((Ms) this.f9772c).a();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8634M2)).booleanValue()) {
                    timeUnit = TimeUnit.MICROSECONDS;
                }
                long j6 = this.f9771b;
                if (j6 > 0) {
                    interfaceFutureC2326aA = AbstractC1984ut.E(interfaceFutureC2326aA, j6, timeUnit, (ScheduledExecutorService) this.f9773d);
                }
                return AbstractC1984ut.D(interfaceFutureC2326aA, Throwable.class, new C0738Tb(9, this), AbstractC0640Nf.f10011g);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final int c() {
        switch (this.f9770a) {
            case 0:
                return 4;
            default:
                return ((Ms) this.f9772c).c();
        }
    }

    public Lr(Ms ms, long j6, ScheduledExecutorService scheduledExecutorService) {
        this.f9772c = ms;
        this.f9771b = j6;
        this.f9773d = scheduledExecutorService;
    }
}
