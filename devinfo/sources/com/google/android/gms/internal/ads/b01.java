package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b01 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9524a;

    /* renamed from: b, reason: collision with root package name */
    public final gs1 f9525b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f9526c;

    /* renamed from: d, reason: collision with root package name */
    public final js1 f9527d;

    /* renamed from: e, reason: collision with root package name */
    public final js1 f9528e;

    public /* synthetic */ b01(int i4, es1 es1Var, es1 es1Var2, gs1 gs1Var, gs1 gs1Var2) {
        this.f9524a = i4;
        this.f9525b = gs1Var;
        this.f9526c = es1Var;
        this.f9527d = gs1Var2;
        this.f9528e = es1Var2;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f9524a) {
            case 0:
                return new a01((zc) this.f9525b.f11600a, (sz0) this.f9526c.a(), (Context) this.f9527d.a(), (g21) this.f9528e.a(), 0);
            case 1:
                return new c01((zc) this.f9525b.f11600a, (sz0) this.f9526c.a(), (sx0) this.f9527d.a(), (g21) this.f9528e.a());
            default:
                return new a01((zc) this.f9525b.f11600a, (sz0) this.f9526c.a(), (Context) this.f9527d.a(), (g21) this.f9528e.a(), 1);
        }
    }
}
