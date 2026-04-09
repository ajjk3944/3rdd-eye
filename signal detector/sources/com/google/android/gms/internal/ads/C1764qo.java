package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.qo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1764qo implements InterfaceC1386jo {

    /* renamed from: a, reason: collision with root package name */
    public final long f16400a;

    /* renamed from: b, reason: collision with root package name */
    public final C1283hr f16401b;

    /* renamed from: c, reason: collision with root package name */
    public final Nt f16402c;

    public C1764qo(long j6, Context context, C1283hr c1283hr, C0710Rh c0710Rh, String str) {
        this.f16400a = j6;
        this.f16401b = c1283hr;
        this.f16402c = (Nt) ((C1799rN) new C0889ae(c0710Rh.f10986b, context, str).f13151c).c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386jo
    public final void a(q2.a1 a1Var) {
        try {
            this.f16402c.C0(a1Var, new BinderC1656oo(this));
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386jo
    public final void c() {
        try {
            Nt nt = this.f16402c;
            nt.F2(new BinderC1710po(this));
            nt.o1(new S2.b(null));
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1386jo
    public final void f() {
    }
}
