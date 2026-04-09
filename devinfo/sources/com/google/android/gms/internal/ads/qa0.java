package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qa0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15271a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final es1 f15272b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f15273c;

    /* renamed from: d, reason: collision with root package name */
    public final js1 f15274d;

    /* renamed from: e, reason: collision with root package name */
    public final js1 f15275e;

    /* renamed from: f, reason: collision with root package name */
    public final js1 f15276f;
    public final js1 g;

    /* renamed from: h, reason: collision with root package name */
    public final js1 f15277h;

    /* renamed from: i, reason: collision with root package name */
    public final js1 f15278i;

    public qa0(x00 x00Var, b60 b60Var, js1 js1Var, m20 m20Var, fs1 fs1Var, fs1 fs1Var2, es1 es1Var, es1 es1Var2) {
        this.f15273c = x00Var;
        this.f15276f = b60Var;
        this.f15274d = js1Var;
        this.g = m20Var;
        this.f15277h = fs1Var;
        this.f15278i = fs1Var2;
        this.f15275e = es1Var;
        this.f15272b = es1Var2;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f15271a) {
            case 0:
                return b();
            case 1:
                return new fc0((e60) this.f15272b.a(), (t60) ((es1) this.f15275e).a(), (z60) this.f15273c.a(), (c70) ((es1) this.f15276f).a(), (v70) this.f15274d.a(), ((v40) this.g).b(), ((v40) this.f15277h).f17495b.v(), (t20) ((es1) this.f15278i).a());
            case 2:
                return new ff0((hf0) this.f15272b.a(), (qf0) ((es1) this.f15273c).a(), (ue0) ((es1) this.f15274d).a(), ((a10) this.f15275e).b(), ((g10) this.f15276f).b(), (bf0) ((es1) this.g).a(), (pf0) ((es1) this.f15277h).a(), new ew(), new ew(), ((b10) this.f15278i).a());
            default:
                return new sp0((String) ((gs1) this.f15276f).f11600a, (qp0) this.f15272b.a(), (Context) ((gs1) this.g).f11600a, (np0) ((es1) this.f15277h).a(), (eq0) ((es1) this.f15278i).a(), ((g10) this.f15273c).b(), (oe) this.f15274d.a(), (qd0) this.f15275e.a());
        }
    }

    public pa0 b() {
        ya.c0 c0VarA = ((x00) this.f15273c).a();
        hq0 hq0VarB = ((b60) this.f15276f).b();
        ia0 ia0Var = (ia0) this.f15274d.a();
        ga0 ga0VarB = ((m20) this.g).b();
        wa0 wa0Var = (wa0) ((fs1) this.f15277h).a();
        ab0 ab0Var = (ab0) ((fs1) this.f15278i).a();
        Executor executor = (Executor) this.f15275e.a();
        ex exVar = fx.f11274a;
        al0.z(exVar);
        return new pa0(c0VarA, hq0VarB, ia0Var, ga0VarB, wa0Var, ab0Var, executor, exVar, (ea0) this.f15272b.a());
    }

    public qa0(es1 es1Var, es1 es1Var2, es1 es1Var3, a10 a10Var, g10 g10Var, es1 es1Var4, es1 es1Var5, b10 b10Var) {
        this.f15272b = es1Var;
        this.f15273c = es1Var2;
        this.f15274d = es1Var3;
        this.f15275e = a10Var;
        this.f15276f = g10Var;
        this.g = es1Var4;
        this.f15277h = es1Var5;
        this.f15278i = b10Var;
    }

    public qa0(es1 es1Var, es1 es1Var2, es1 es1Var3, es1 es1Var4, es1 es1Var5, v40 v40Var, v40 v40Var2, es1 es1Var6) {
        this.f15272b = es1Var;
        this.f15275e = es1Var2;
        this.f15273c = es1Var3;
        this.f15276f = es1Var4;
        this.f15274d = es1Var5;
        this.g = v40Var;
        this.f15277h = v40Var2;
        this.f15278i = es1Var6;
    }

    public qa0(gs1 gs1Var, es1 es1Var, gs1 gs1Var2, es1 es1Var2, es1 es1Var3, g10 g10Var, es1 es1Var4, es1 es1Var5) {
        this.f15276f = gs1Var;
        this.f15272b = es1Var;
        this.g = gs1Var2;
        this.f15277h = es1Var2;
        this.f15278i = es1Var3;
        this.f15273c = g10Var;
        this.f15274d = es1Var4;
        this.f15275e = es1Var5;
    }
}
