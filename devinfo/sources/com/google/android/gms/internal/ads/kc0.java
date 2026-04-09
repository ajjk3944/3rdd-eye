package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kc0 {

    /* renamed from: a, reason: collision with root package name */
    public final e60 f13119a;

    /* renamed from: b, reason: collision with root package name */
    public final t60 f13120b;

    /* renamed from: c, reason: collision with root package name */
    public final z60 f13121c;

    /* renamed from: d, reason: collision with root package name */
    public final c70 f13122d;

    /* renamed from: e, reason: collision with root package name */
    public final v70 f13123e;

    /* renamed from: f, reason: collision with root package name */
    public final s80 f13124f;
    public final qd0 g;

    /* renamed from: h, reason: collision with root package name */
    public final ct0 f13125h;

    /* renamed from: i, reason: collision with root package name */
    public final lh0 f13126i;
    public final t20 j;

    public kc0(e60 e60Var, t60 t60Var, z60 z60Var, c70 c70Var, v70 v70Var, s80 s80Var, qd0 qd0Var, ct0 ct0Var, lh0 lh0Var, t20 t20Var) {
        this.f13119a = e60Var;
        this.f13120b = t60Var;
        this.f13121c = z60Var;
        this.f13122d = c70Var;
        this.f13123e = v70Var;
        this.f13124f = s80Var;
        this.g = qd0Var;
        this.f13125h = ct0Var;
        this.f13126i = lh0Var;
        this.j = t20Var;
    }

    public final void a(lc0 lc0Var, qz qzVar) {
        jc0 jc0Var = lc0Var.f13458a;
        t60 t60Var = this.f13120b;
        Objects.requireNonNull(t60Var);
        ec0 ec0Var = new ec0(1, t60Var);
        e60 e60Var = this.f13119a;
        z60 z60Var = this.f13121c;
        c70 c70Var = this.f13122d;
        v70 v70Var = this.f13123e;
        s80 s80Var = this.f13124f;
        synchronized (jc0Var) {
            jc0Var.a(e60Var, z60Var, c70Var, v70Var, ec0Var);
            jc0Var.f12713f = s80Var;
        }
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16355ub)).booleanValue() || qzVar == null || qzVar.X() == null) {
            return;
        }
        i00 i00VarX = qzVar.X();
        t20 t20Var = this.j;
        lh0 lh0Var = this.f13126i;
        i00VarX.q(t20Var, lh0Var, this.f13125h);
        i00VarX.r(t20Var, lh0Var, this.g);
    }
}
