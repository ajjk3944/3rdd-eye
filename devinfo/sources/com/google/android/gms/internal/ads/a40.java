package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a40 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9201a;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f9202b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f9203c;

    public /* synthetic */ a40(js1 js1Var, js1 js1Var2, int i4) {
        this.f9201a = i4;
        this.f9202b = js1Var;
        this.f9203c = js1Var2;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f9201a) {
            case 0:
                return new bw(((a10) this.f9202b).b(), ((b60) this.f9203c).b().g);
            case 1:
                return new c50((e50) this.f9202b.a(), ((b60) this.f9203c).b());
            case 2:
                return new bw(((a10) this.f9202b).b(), ((b60) this.f9203c).b().g);
            case 3:
                ya.r rVar = (ya.r) this.f9202b.a();
                tb.a aVar = (tb.a) this.f9203c.a();
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new gb0(rVar, aVar, exVar);
            case 4:
                return new yd0((xd0) this.f9202b.a(), (k10) this.f9203c.a());
            case 5:
                return new vf0(((a10) this.f9202b).b(), (qd0) this.f9203c.a());
            case 6:
                return new kg0(((a10) this.f9202b).b(), (dw) this.f9203c.a());
            case 7:
                return new jl0((mm0) this.f9202b.a(), ((Integer) va.s.f36163e.f36166c.a(sk.Bd)).intValue(), (ScheduledExecutorService) this.f9203c.a());
            case 8:
                return new jl0((mm0) this.f9202b.a(), ((Integer) va.s.f36163e.f36166c.a(sk.f16263od)).intValue(), (ScheduledExecutorService) this.f9203c.a());
            case 9:
                dw dwVar = (dw) this.f9202b.a();
                ex exVar2 = fx.f11274a;
                al0.z(exVar2);
                return new ol0(dwVar, exVar2, ((a10) this.f9203c).b(), 2);
            case 10:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f9202b.a();
                ((a10) this.f9203c).b();
                return new el0(6, scheduledExecutorService);
            case 11:
                return new sq0(((a10) this.f9202b).b(), ((h10) this.f9203c).a());
            default:
                return new vr0(((a10) this.f9202b).b(), (bs0) this.f9203c.a());
        }
    }
}
