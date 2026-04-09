package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k01 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12914a;

    /* renamed from: b, reason: collision with root package name */
    public final gs1 f12915b;

    /* renamed from: c, reason: collision with root package name */
    public final es1 f12916c;

    /* renamed from: d, reason: collision with root package name */
    public final gs1 f12917d;

    /* renamed from: e, reason: collision with root package name */
    public final es1 f12918e;

    public /* synthetic */ k01(int i4, es1 es1Var, es1 es1Var2, gs1 gs1Var, gs1 gs1Var2) {
        this.f12914a = i4;
        this.f12915b = gs1Var;
        this.f12916c = es1Var;
        this.f12918e = es1Var2;
        this.f12917d = gs1Var2;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f12914a) {
            case 0:
                return new j01((Context) this.f12915b.f11600a, (g21) this.f12916c.a(), (lz0) this.f12918e.a(), (sx0) this.f12917d.f11600a);
            case 1:
                return new x11((Context) this.f12915b.f11600a, (sx0) this.f12917d.f11600a, (g21) this.f12916c.a(), (w81) this.f12918e.a());
            default:
                return new y11((Context) this.f12915b.f11600a, (sx0) this.f12917d.f11600a, (g21) this.f12916c.a(), (w81) this.f12918e.a());
        }
    }

    public k01(gs1 gs1Var, es1 es1Var, gs1 gs1Var2, es1 es1Var2) {
        this.f12914a = 1;
        this.f12915b = gs1Var;
        this.f12916c = es1Var;
        this.f12917d = gs1Var2;
        this.f12918e = es1Var2;
    }
}
