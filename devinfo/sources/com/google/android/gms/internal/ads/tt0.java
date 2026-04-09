package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tt0 extends iv {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d91 f16945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sp0 f16946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ it0 f16947c;

    public tt0(it0 it0Var, d91 d91Var, sp0 sp0Var) {
        this.f16945a = d91Var;
        this.f16946b = sp0Var;
        this.f16947c = it0Var;
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final void b(va.w1 w1Var) {
        String string = w1Var.c().toString();
        it0 it0Var = this.f16947c;
        String str = it0Var.f12431e.f36170a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 51 + String.valueOf(str).length());
        sb2.append("Failed to load rewarded ad with error: ");
        sb2.append(string);
        sb2.append(", adUnitId: ");
        sb2.append(str);
        za.i.h(sb2.toString());
        it0Var.a(w1Var);
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final void c() {
        Objects.requireNonNull(this.f16947c);
        this.f16945a.e(this.f16946b);
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final void K1(int i4) {
    }
}
