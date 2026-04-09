package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zv implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19186a;

    /* renamed from: b, reason: collision with root package name */
    public final es1 f19187b;

    /* renamed from: c, reason: collision with root package name */
    public final gs1 f19188c;

    public /* synthetic */ zv(es1 es1Var, gs1 gs1Var, int i4) {
        this.f19186a = i4;
        this.f19187b = es1Var;
        this.f19188c = gs1Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f19186a) {
            case 0:
                return new ce1((tb.a) this.f19188c.f11600a, false, (xv) this.f19187b.a(), 7);
            case 1:
                return new hd0((li) this.f19187b.a(), (hp0) this.f19188c.f11600a);
            case 2:
                Context context = (Context) this.f19187b.a();
                n10 n10Var = (n10) this.f19188c.f11600a;
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new li0(context, n10Var, exVar, 0);
            case 3:
                return new ni0(0, (Context) this.f19187b.a(), (n10) this.f19188c.f11600a);
            case 4:
                return new si0((Context) this.f19187b.a(), (p10) this.f19188c.f11600a);
            case 5:
                return new ni0(1, (Context) this.f19187b.a(), (t10) this.f19188c.f11600a);
            default:
                return new ni0(2, (Context) this.f19187b.a(), (w10) this.f19188c.f11600a);
        }
    }

    public zv(gs1 gs1Var, es1 es1Var) {
        this.f19186a = 0;
        this.f19188c = gs1Var;
        this.f19187b = es1Var;
    }
}
