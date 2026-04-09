package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kt0 extends va.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d91 f13237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xk0 f13238b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ it0 f13239c;

    public kt0(it0 it0Var, d91 d91Var, xk0 xk0Var) {
        this.f13237a = d91Var;
        this.f13238b = xk0Var;
        this.f13239c = it0Var;
    }

    @Override // va.b0
    public final void J(va.w1 w1Var) {
        String string = w1Var.c().toString();
        it0 it0Var = this.f13239c;
        String str = it0Var.f12431e.f36170a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 57 + String.valueOf(str).length());
        sb2.append("Failed to load interstitial ad with error: ");
        sb2.append(string);
        sb2.append(" for ad unit: ");
        sb2.append(str);
        za.i.h(sb2.toString());
        it0Var.a(w1Var);
    }

    @Override // va.b0
    public final void m() {
        Objects.requireNonNull(this.f13239c);
        this.f13237a.e(this.f13238b);
    }
}
