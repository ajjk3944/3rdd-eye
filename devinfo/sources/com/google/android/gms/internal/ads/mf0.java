package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mf0 extends pa.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f13886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pf0 f13887e;

    public mf0(pf0 pf0Var, String str) {
        this.f13886d = str;
        Objects.requireNonNull(pf0Var);
        this.f13887e = pf0Var;
    }

    @Override // pa.u
    public final void c(pa.l lVar) {
        this.f13887e.j4(pf0.m4(lVar));
    }

    @Override // pa.u
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        String str = this.f13886d;
        this.f13887e.i4((rv) obj, str);
    }
}
