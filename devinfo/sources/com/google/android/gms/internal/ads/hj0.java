package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hj0 extends ij0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11887a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final k10 f11888b;

    /* renamed from: c, reason: collision with root package name */
    public final y50 f11889c;

    /* renamed from: d, reason: collision with root package name */
    public final e80 f11890d;

    /* renamed from: e, reason: collision with root package name */
    public final nj0 f11891e;

    /* renamed from: f, reason: collision with root package name */
    public final ei0 f11892f;
    public final Object g;

    public hj0(k10 k10Var, y50 y50Var, e80 e80Var, eq0 eq0Var, nj0 nj0Var, ei0 ei0Var) {
        this.f11888b = k10Var;
        this.f11889c = y50Var;
        this.f11890d = e80Var;
        this.g = eq0Var;
        this.f11891e = nj0Var;
        this.f11892f = ei0Var;
    }

    @Override // com.google.android.gms.internal.ads.ij0
    public final pr0 c(hq0 hq0Var, Bundle bundle, wp0 wp0Var, dq0 dq0Var) {
        eq0 eq0Var;
        switch (this.f11887a) {
            case 0:
                y50 y50Var = this.f11889c;
                y50Var.f18643b = hq0Var;
                y50Var.f18644c = bundle;
                y50Var.f18646e = new pq0(dq0Var, wp0Var, this.f11891e, false, 13);
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16224m4)).booleanValue()) {
                    y50Var.f18647f = this.f11892f;
                }
                k10 k10Var = this.f11888b.f12924b;
                y50 y50Var2 = new y50(y50Var);
                l90 l90Var = (l90) this.g;
                fk0 fk0Var = new fk0(18, (Object) null);
                e80 e80Var = this.f11890d;
                al0.E(e80.class, e80Var);
                al0.E(l90.class, l90Var);
                y40 y40Var = (y40) new j10(k10Var, fk0Var, l90Var, new h80(18), e80Var, y50Var2, new ne0(7), null, null).f12578o.a();
                return y40Var.c(y40Var.b());
            case 1:
                y50 y50Var3 = this.f11889c;
                y50Var3.f18643b = hq0Var;
                y50Var3.f18644c = bundle;
                y50Var3.f18646e = new pq0(dq0Var, wp0Var, this.f11891e, false, 13);
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16224m4)).booleanValue()) {
                    y50Var3.f18647f = this.f11892f;
                }
                k10 k10Var2 = this.f11888b.f12924b;
                y50 y50Var4 = new y50(y50Var3);
                fk0 fk0Var2 = (fk0) this.g;
                e80 e80Var2 = this.f11890d;
                al0.E(e80.class, e80Var2);
                al0.E(fk0.class, fk0Var2);
                y40 y40Var2 = (y40) new t10(k10Var2, new h80(18), e80Var2, y50Var4, new ne0(7), fk0Var2, null, null).f16650n.a();
                return y40Var2.c(y40Var2.b());
            default:
                y50 y50Var5 = this.f11889c;
                y50Var5.f18643b = hq0Var;
                y50Var5.f18644c = bundle;
                y50Var5.f18646e = new pq0(dq0Var, wp0Var, this.f11891e, false, 13);
                pk pkVar = sk.f16208l4;
                va.s sVar = va.s.f36163e;
                if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue() && (eq0Var = (eq0) this.g) != null) {
                    y50Var5.f18645d = eq0Var;
                }
                if (((Boolean) sVar.f36166c.a(sk.f16224m4)).booleanValue()) {
                    y50Var5.f18647f = this.f11892f;
                }
                k10 k10Var3 = this.f11888b.f12924b;
                y50 y50Var6 = new y50(y50Var5);
                e80 e80Var3 = this.f11890d;
                al0.E(e80.class, e80Var3);
                y40 y40VarB = new w10(k10Var3, new h80(18), e80Var3, y50Var6, new ne0(7), null, null).b();
                return y40VarB.c(y40VarB.b());
        }
    }

    public hj0(k10 k10Var, y50 y50Var, fk0 fk0Var, e80 e80Var, nj0 nj0Var, ei0 ei0Var) {
        this.f11888b = k10Var;
        this.f11889c = y50Var;
        this.g = fk0Var;
        this.f11890d = e80Var;
        this.f11891e = nj0Var;
        this.f11892f = ei0Var;
    }

    public hj0(k10 k10Var, l90 l90Var, y50 y50Var, e80 e80Var, nj0 nj0Var, ei0 ei0Var) {
        this.f11888b = k10Var;
        this.g = l90Var;
        this.f11889c = y50Var;
        this.f11890d = e80Var;
        this.f11891e = nj0Var;
        this.f11892f = ei0Var;
    }
}
