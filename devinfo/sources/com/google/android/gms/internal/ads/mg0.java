package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mg0 implements ng0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f13888a;

    /* renamed from: b, reason: collision with root package name */
    public final w81 f13889b;

    /* renamed from: c, reason: collision with root package name */
    public final m70 f13890c;

    public mg0(Map map, w81 w81Var, m70 m70Var) {
        this.f13888a = map;
        this.f13889b = w81Var;
        this.f13890c = m70Var;
    }

    @Override // com.google.android.gms.internal.ads.ng0
    public final vd.b j(iu iuVar) {
        this.f13890c.t(iuVar);
        u71 u71VarW = yo0.w(new uf0(3));
        for (String str : ((String) va.s.f36163e.f36166c.a(sk.f16291q9)).split(",")) {
            js1 js1Var = (js1) this.f13888a.get(str.trim());
            if (js1Var != null) {
                u71VarW = yo0.D(u71VarW, uf0.class, new sq(7, js1Var, iuVar), this.f13889b);
            }
        }
        u71VarW.a(new q81(0, u71VarW, new ix0(27, this)), fx.g);
        return u71VarW;
    }
}
