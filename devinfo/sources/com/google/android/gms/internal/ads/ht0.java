package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ht0 extends th {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d91 f11966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ va.t2 f11967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ it0 f11968c;

    public ht0(it0 it0Var, d91 d91Var, va.t2 t2Var) {
        this.f11966a = d91Var;
        this.f11967b = t2Var;
        this.f11968c = it0Var;
    }

    @Override // com.google.android.gms.internal.ads.vh
    public final void W(va.w1 w1Var) {
        String string = w1Var.c().toString();
        String str = this.f11967b.f36170a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 60 + String.valueOf(str).length());
        sb2.append("Failed to load app open ad with error parcel: ");
        sb2.append(string);
        sb2.append(" for ad unit: ");
        sb2.append(str);
        za.i.h(sb2.toString());
        it0 it0Var = this.f11968c;
        Objects.requireNonNull(it0Var);
        it0Var.a(w1Var);
    }

    @Override // com.google.android.gms.internal.ads.vh
    public final void t2(rh rhVar) {
        Objects.requireNonNull(this.f11968c);
        this.f11966a.e(rhVar);
    }

    @Override // com.google.android.gms.internal.ads.vh
    public final void p(int i4) {
    }
}
