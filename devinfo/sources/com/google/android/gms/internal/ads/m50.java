package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m50 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13763a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f13764b;

    /* renamed from: c, reason: collision with root package name */
    public final b60 f13765c;

    /* renamed from: d, reason: collision with root package name */
    public final es1 f13766d;

    public m50(b60 b60Var, es1 es1Var, es1 es1Var2) {
        this.f13765c = b60Var;
        this.f13764b = es1Var;
        this.f13766d = es1Var2;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f13763a) {
            case 0:
                return new l50((Context) this.f13766d.a(), ((g10) this.f13764b).b(), this.f13765c.b(), 0);
            case 1:
                return new we0((ff0) this.f13764b.a(), this.f13765c.b(), (String) this.f13766d.a());
            default:
                return b();
        }
    }

    public ll0 b() {
        ex exVar = fx.f11274a;
        al0.z(exVar);
        hq0 hq0VarB = this.f13765c.b();
        return new ll0(exVar, hq0VarB, ((Integer) this.f13766d.a()).intValue());
    }

    public m50(es1 es1Var, b60 b60Var, es1 es1Var2) {
        this.f13764b = es1Var;
        this.f13765c = b60Var;
        this.f13766d = es1Var2;
    }

    public m50(es1 es1Var, js1 js1Var, b60 b60Var) {
        this.f13766d = es1Var;
        this.f13764b = js1Var;
        this.f13765c = b60Var;
    }
}
