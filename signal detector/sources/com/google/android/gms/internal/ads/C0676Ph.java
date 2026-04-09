package com.google.android.gms.internal.ads;

import android.content.Context;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Ph, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0676Ph implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final C0540Hh f10464a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f10465b;

    public C0676Ph(C0540Hh c0540Hh, C1799rN c1799rN) {
        this.f10464a = c0540Hh;
        this.f10465b = c1799rN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0969c3 c() {
        Context contextA = this.f10464a.a();
        Yu yu = (Yu) this.f10465b.c();
        C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
        Cr.v(c0623Mf);
        p2.j jVar = p2.j.f22785C;
        C0416Ac c0416AcA = jVar.f22804r.a(contextA, C2951a.a(), yu);
        W9 w9 = AbstractC0709Rg.f10928l;
        c0416AcA.getClass();
        return new C0969c3(contextA, jVar.f22804r.a(contextA, C2951a.a(), yu).a("google.afma.sdkConstants.getSdkConstants", w9, w9), C2951a.a(), c0623Mf);
    }
}
