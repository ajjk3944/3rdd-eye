package com.google.android.gms.internal.ads;

import android.content.Context;
import q2.AbstractBinderC2805D;
import q2.InterfaceC2853y;

/* renamed from: com.google.android.gms.internal.ads.tr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1928tr extends AbstractBinderC2805D {

    /* renamed from: a, reason: collision with root package name */
    public final C1338iu f16986a;

    public BinderC1928tr(Context context, C0710Rh c0710Rh, C0905au c0905au, C1708pm c1708pm, InterfaceC2853y interfaceC2853y) {
        C1338iu c1338iu = new C1338iu(c1708pm, (C0784Vn) c0710Rh.f11000j.c());
        ((C2090wr) c1338iu.f14823c).f17499a.set(interfaceC2853y);
        C1677p8 c1677p8 = new C1677p8();
        c1677p8.f16138b = c0710Rh;
        c1677p8.f16141e = context;
        c1677p8.f16139c = c1338iu;
        c1677p8.f16137a = c0905au;
        c1677p8.f16140d = c0710Rh.c();
        c0905au.f13257r = (C2090wr) c1338iu.f14823c;
        this.f16986a = new C1338iu(c1677p8, 25, c0905au.f13243c);
    }

    @Override // q2.E
    public final synchronized void a1(q2.a1 a1Var, int i) {
        this.f16986a.v(a1Var, i);
    }

    @Override // q2.E
    public final synchronized String d() {
        return this.f16986a.x();
    }

    @Override // q2.E
    public final synchronized boolean e() {
        return this.f16986a.s();
    }

    @Override // q2.E
    public final void f0(q2.a1 a1Var) {
        this.f16986a.v(a1Var, 1);
    }

    @Override // q2.E
    public final synchronized String g() {
        return this.f16986a.A();
    }
}
