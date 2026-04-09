package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vr0 implements k80, n60, m80 {

    /* renamed from: a, reason: collision with root package name */
    public final bs0 f17696a;

    /* renamed from: b, reason: collision with root package name */
    public final yr0 f17697b;

    public vr0(Context context, bs0 bs0Var) {
        this.f17696a = bs0Var;
        this.f17697b = d7.C(13, context);
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void a() {
        if (((Boolean) ol.f14725d.u()).booleanValue()) {
            yr0 yr0Var = this.f17697b;
            yr0Var.c(true);
            this.f17696a.a(yr0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.n60
    public final void b(va.w1 w1Var) {
        if (((Boolean) ol.f14725d.u()).booleanValue()) {
            String string = w1Var.a().toString();
            yr0 yr0Var = this.f17697b;
            yr0Var.g(string);
            yr0Var.c(false);
            this.f17696a.a(yr0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void z1() {
        if (((Boolean) ol.f14725d.u()).booleanValue()) {
            this.f17697b.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void m() {
    }
}
