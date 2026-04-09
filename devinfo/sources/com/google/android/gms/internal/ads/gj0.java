package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gj0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11529a;

    /* renamed from: b, reason: collision with root package name */
    public final es1 f11530b;

    /* renamed from: c, reason: collision with root package name */
    public final es1 f11531c;

    /* renamed from: d, reason: collision with root package name */
    public final es1 f11532d;

    /* renamed from: e, reason: collision with root package name */
    public final js1 f11533e;

    public /* synthetic */ gj0(es1 es1Var, es1 es1Var2, es1 es1Var3, Object obj, int i4) {
        this.f11529a = i4;
        this.f11530b = es1Var;
        this.f11531c = es1Var2;
        this.f11532d = es1Var3;
        this.f11533e = (js1) obj;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f11529a) {
            case 0:
                return b();
            case 1:
                cs1 cs1VarC = es1.c(this.f11530b);
                cs1 cs1VarC2 = es1.c(this.f11531c);
                cs1 cs1VarC3 = es1.c(this.f11532d);
                sx0 sx0Var = (sx0) this.f11533e.a();
                return new m01(cs1VarC, cs1VarC2, cs1VarC3, sx0Var.M().A(), sx0Var.M().D());
            default:
                return new r11((ky0) this.f11530b.a(), (ky0) this.f11531c.a(), es1.c(this.f11532d), (g21) this.f11533e.a());
        }
    }

    public com.google.android.gms.internal.consent_sdk.d b() {
        ex exVar = fx.f11274a;
        al0.z(exVar);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f11533e.a();
        q40 q40Var = (q40) this.f11530b.a();
        nj0 nj0Var = (nj0) this.f11531c.a();
        bt0 bt0Var = (bt0) this.f11532d.a();
        com.google.android.gms.internal.consent_sdk.d dVar = new com.google.android.gms.internal.consent_sdk.d();
        dVar.f19300f = new d91();
        dVar.g = new AtomicBoolean();
        dVar.f19295a = exVar;
        dVar.f19296b = scheduledExecutorService;
        dVar.f19297c = q40Var;
        dVar.f19298d = nj0Var;
        dVar.f19299e = bt0Var;
        return dVar;
    }

    public gj0(js1 js1Var, es1 es1Var, es1 es1Var2, es1 es1Var3) {
        this.f11529a = 0;
        this.f11533e = js1Var;
        this.f11530b = es1Var;
        this.f11531c = es1Var2;
        this.f11532d = es1Var3;
    }
}
