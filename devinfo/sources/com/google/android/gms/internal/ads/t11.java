package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t11 implements s11 {

    /* renamed from: a, reason: collision with root package name */
    public final cs1 f16663a;

    /* renamed from: b, reason: collision with root package name */
    public final g21 f16664b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16665c;

    public t11(cs1 cs1Var, g21 g21Var, long j) {
        this.f16663a = cs1Var;
        this.f16664b = g21Var;
        this.f16665c = j;
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final boolean a(zy0 zy0Var) {
        g21 g21Var = this.f16664b;
        if (zy0Var == null || zy0Var.equals(zy0.F())) {
            g21Var.b(15102);
            return false;
        }
        if (zy0Var.C() == this.f16663a.a()) {
            return true;
        }
        g21Var.b(15103);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final boolean b(zy0 zy0Var) {
        g21 g21Var = this.f16664b;
        if (zy0Var == null || zy0Var.equals(zy0.F())) {
            g21Var.b(15104);
            return true;
        }
        if (zy0Var.C() != this.f16663a.a()) {
            g21Var.b(15105);
            return true;
        }
        boolean z3 = (zy0Var.A().C() * 1000) - System.currentTimeMillis() <= this.f16665c;
        if (z3) {
            g21Var.b(15106);
        }
        return z3;
    }
}
