package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jj0 extends ij0 {

    /* renamed from: a, reason: collision with root package name */
    public final k10 f12763a;

    /* renamed from: b, reason: collision with root package name */
    public final y50 f12764b;

    /* renamed from: c, reason: collision with root package name */
    public final e80 f12765c;

    /* renamed from: d, reason: collision with root package name */
    public final nj0 f12766d;

    /* renamed from: e, reason: collision with root package name */
    public final ei0 f12767e;

    public jj0(k10 k10Var, y50 y50Var, e80 e80Var, nj0 nj0Var, ei0 ei0Var) {
        this.f12763a = k10Var;
        this.f12764b = y50Var;
        this.f12765c = e80Var;
        this.f12766d = nj0Var;
        this.f12767e = ei0Var;
    }

    @Override // com.google.android.gms.internal.ads.ij0
    public final pr0 c(hq0 hq0Var, Bundle bundle, wp0 wp0Var, dq0 dq0Var) {
        y50 y50Var = this.f12764b;
        y50Var.f18643b = hq0Var;
        y50Var.f18644c = bundle;
        y50Var.f18646e = new pq0(dq0Var, wp0Var, this.f12766d, false, 13);
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16224m4)).booleanValue()) {
            y50Var.f18647f = this.f12767e;
        }
        k10 k10Var = this.f12763a.f12924b;
        y50 y50Var2 = new y50(y50Var);
        e80 e80Var = this.f12765c;
        al0.E(e80.class, e80Var);
        y40 y40VarB = new n10(k10Var, new h80(18), e80Var, y50Var2, new ne0(7), null, null).b();
        return y40VarB.c(y40VarB.b());
    }
}
