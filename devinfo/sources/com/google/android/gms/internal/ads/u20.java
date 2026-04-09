package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u20 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17034a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final es1 f17035b;

    /* renamed from: c, reason: collision with root package name */
    public final es1 f17036c;

    /* renamed from: d, reason: collision with root package name */
    public final js1 f17037d;

    /* renamed from: e, reason: collision with root package name */
    public final js1 f17038e;

    /* renamed from: f, reason: collision with root package name */
    public final js1 f17039f;
    public final js1 g;

    public u20(a10 a10Var, x00 x00Var, es1 es1Var, es1 es1Var2, es1 es1Var3, es1 es1Var4) {
        this.f17037d = a10Var;
        this.f17038e = x00Var;
        this.f17035b = es1Var;
        this.f17036c = es1Var2;
        this.f17039f = es1Var3;
        this.g = es1Var4;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f17034a) {
            case 0:
                Context contextB = ((a10) this.f17037d).b();
                ya.c0 c0VarA = ((x00) this.f17038e).a();
                yh0 yh0Var = (yh0) this.f17035b.a();
                zc0 zc0Var = (zc0) this.f17036c.a();
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new t20(contextB, c0VarA, yh0Var, zc0Var, exVar, (w81) this.f17039f.a(), (ScheduledExecutorService) this.g.a());
            default:
                return new c11((s11) this.f17035b.a(), (r11) this.f17036c.a(), (v11) this.f17037d.a(), (g21) this.f17038e.a(), (sx0) this.f17039f.a(), (ExecutorService) this.g.a());
        }
    }

    public u20(es1 es1Var, es1 es1Var2, es1 es1Var3, es1 es1Var4, gs1 gs1Var, gs1 gs1Var2) {
        this.f17035b = es1Var;
        this.f17036c = es1Var2;
        this.f17037d = es1Var3;
        this.f17038e = es1Var4;
        this.f17039f = gs1Var;
        this.g = gs1Var2;
    }
}
