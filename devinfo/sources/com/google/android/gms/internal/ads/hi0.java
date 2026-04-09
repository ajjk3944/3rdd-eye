package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hi0 implements zh0 {

    /* renamed from: a, reason: collision with root package name */
    public final n10 f11879a;

    /* renamed from: b, reason: collision with root package name */
    public final wc0 f11880b;

    /* renamed from: c, reason: collision with root package name */
    public final hq0 f11881c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f11882d;

    /* renamed from: e, reason: collision with root package name */
    public final za.a f11883e;

    /* renamed from: f, reason: collision with root package name */
    public final qo f11884f;
    public final boolean g = ((Boolean) va.s.f36163e.f36166c.a(sk.f16141ga)).booleanValue();

    /* renamed from: h, reason: collision with root package name */
    public final qh0 f11885h;

    /* renamed from: i, reason: collision with root package name */
    public final od0 f11886i;
    public final qd0 j;

    public hi0(n10 n10Var, Executor executor, wc0 wc0Var, hq0 hq0Var, za.a aVar, qo qoVar, qh0 qh0Var, od0 od0Var, qd0 qd0Var) {
        this.f11879a = n10Var;
        this.f11882d = executor;
        this.f11880b = wc0Var;
        this.f11881c = hq0Var;
        this.f11883e = aVar;
        this.f11884f = qoVar;
        this.f11885h = qh0Var;
        this.f11886i = od0Var;
        this.j = qd0Var;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final boolean a(dq0 dq0Var, wp0 wp0Var) {
        aq0 aq0Var = wp0Var.f18106s;
        return (aq0Var == null || aq0Var.f9386a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final vd.b b(dq0 dq0Var, wp0 wp0Var) {
        h80 h80Var = new h80(17);
        s81 s81Var = s81.f15906b;
        s40 s40Var = new s40(this, wp0Var, dq0Var, h80Var, 3);
        Executor executor = this.f11882d;
        w71 w71VarF = yo0.F(s81Var, s40Var, executor);
        w71VarF.a(new ce(4), executor);
        return w71VarF;
    }
}
