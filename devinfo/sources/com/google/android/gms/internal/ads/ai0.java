package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ai0 implements zh0 {

    /* renamed from: a, reason: collision with root package name */
    public final zh0 f9336a;

    /* renamed from: b, reason: collision with root package name */
    public final z21 f9337b;

    public ai0(zh0 zh0Var, z21 z21Var) {
        this.f9336a = zh0Var;
        this.f9337b = z21Var;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final boolean a(dq0 dq0Var, wp0 wp0Var) {
        return this.f9336a.a(dq0Var, wp0Var);
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final vd.b b(dq0 dq0Var, wp0 wp0Var) {
        return yo0.G(this.f9336a.b(dq0Var, wp0Var), this.f9337b, fx.f11274a);
    }
}
