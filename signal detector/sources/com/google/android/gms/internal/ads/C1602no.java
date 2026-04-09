package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.no, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1602no implements InterfaceC1386jo {

    /* renamed from: a, reason: collision with root package name */
    public final long f15815a;

    /* renamed from: b, reason: collision with root package name */
    public final BinderC2252zr f15816b;

    public C1602no(long j6, Context context, C1283hr c1283hr, C0710Rh c0710Rh, String str) {
        this.f15815a = j6;
        C0710Rh c0710Rh2 = c0710Rh.f10986b;
        q2.d1 d1Var = new q2.d1();
        str.getClass();
        BinderC2252zr binderC2252zr = (BinderC2252zr) ((C1799rN) new C1283hr(c0710Rh2, context, str, d1Var).f14592b).c();
        this.f15816b = binderC2252zr;
        binderC2252zr.k1(new BinderC1548mo(this, c1283hr));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386jo
    public final void a(q2.a1 a1Var) {
        this.f15816b.f0(a1Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386jo
    public final void c() {
        this.f15816b.B2(new S2.b(null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386jo
    public final void f() {
        this.f15816b.s();
    }
}
