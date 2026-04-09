package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g50 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11377a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final a10 f11378b;

    /* renamed from: c, reason: collision with root package name */
    public final g10 f11379c;

    /* renamed from: d, reason: collision with root package name */
    public final es1 f11380d;

    public g50(a10 a10Var, g10 g10Var, es1 es1Var) {
        this.f11378b = a10Var;
        this.f11379c = g10Var;
        this.f11380d = es1Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f11377a) {
            case 0:
                Context contextB = this.f11378b.b();
                cs0 cs0Var = (cs0) this.f11380d.a();
                za.a aVarB = this.f11379c.b();
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new f50(contextB, cs0Var, aVarB, exVar);
            default:
                oq oqVarM = new aw(6).m(this.f11378b.b(), this.f11379c.b(), (cs0) this.f11380d.a());
                al0.z(oqVarM);
                return oqVarM;
        }
    }

    public g50(a10 a10Var, es1 es1Var, g10 g10Var) {
        this.f11378b = a10Var;
        this.f11380d = es1Var;
        this.f11379c = g10Var;
    }
}
