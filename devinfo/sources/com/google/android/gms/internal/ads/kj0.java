package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kj0 extends ij0 {

    /* renamed from: a, reason: collision with root package name */
    public final k10 f13164a;

    /* renamed from: b, reason: collision with root package name */
    public final y50 f13165b;

    /* renamed from: c, reason: collision with root package name */
    public final fk0 f13166c;

    /* renamed from: d, reason: collision with root package name */
    public final e80 f13167d;

    /* renamed from: e, reason: collision with root package name */
    public final l90 f13168e;

    /* renamed from: f, reason: collision with root package name */
    public final k70 f13169f;
    public final ViewGroup g;

    /* renamed from: h, reason: collision with root package name */
    public final w70 f13170h;

    /* renamed from: i, reason: collision with root package name */
    public final nj0 f13171i;
    public final ei0 j;

    public kj0(k10 k10Var, y50 y50Var, fk0 fk0Var, e80 e80Var, l90 l90Var, k70 k70Var, ViewGroup viewGroup, w70 w70Var, nj0 nj0Var, ei0 ei0Var) {
        this.f13164a = k10Var;
        this.f13165b = y50Var;
        this.f13166c = fk0Var;
        this.f13167d = e80Var;
        this.f13168e = l90Var;
        this.f13169f = k70Var;
        this.g = viewGroup;
        this.f13170h = w70Var;
        this.f13171i = nj0Var;
        this.j = ei0Var;
    }

    @Override // com.google.android.gms.internal.ads.ij0
    public final pr0 c(hq0 hq0Var, Bundle bundle, wp0 wp0Var, dq0 dq0Var) {
        y50 y50Var = this.f13165b;
        y50Var.f18643b = hq0Var;
        y50Var.f18644c = bundle;
        y50Var.f18646e = new pq0(dq0Var, wp0Var, this.f13171i, false, 13);
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16224m4)).booleanValue()) {
            y50Var.f18647f = this.j;
        }
        k10 k10Var = this.f13164a.f12924b;
        y50 y50Var2 = new y50(y50Var);
        ce1 ce1Var = new ce1(this.f13169f, false, this.f13170h, 10);
        fk0 fk0Var = new fk0(18, this.g);
        e80 e80Var = this.f13167d;
        al0.E(e80.class, e80Var);
        fk0 fk0Var2 = this.f13166c;
        al0.E(fk0.class, fk0Var2);
        ne0 ne0Var = new ne0(7);
        l90 l90Var = this.f13168e;
        al0.E(l90.class, l90Var);
        y40 y40Var = (y40) new p10(k10Var, fk0Var, l90Var, new h80(18), e80Var, y50Var2, ne0Var, fk0Var2, ce1Var, null, null).f14850s.a();
        return y40Var.c(y40Var.b());
    }
}
