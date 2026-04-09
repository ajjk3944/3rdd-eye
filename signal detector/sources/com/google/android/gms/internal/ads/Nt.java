package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import q2.C2839q0;
import q2.C2841s;
import q2.InterfaceC2842s0;
import q2.InterfaceC2854y0;
import t2.C2911G;
import u2.C2951a;

/* loaded from: classes.dex */
public final class Nt extends AbstractBinderC0588Ke {

    /* renamed from: b, reason: collision with root package name */
    public final Lt f10090b;

    /* renamed from: c, reason: collision with root package name */
    public final It f10091c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10092d;

    /* renamed from: e, reason: collision with root package name */
    public final Yt f10093e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f10094f;

    /* renamed from: g, reason: collision with root package name */
    public final C2951a f10095g;

    /* renamed from: h, reason: collision with root package name */
    public final H6 f10096h;
    public final C0784Vn i;

    /* renamed from: j, reason: collision with root package name */
    public C1870sn f10097j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10098k = ((Boolean) C2841s.f23267e.f23270c.a(H9.f8715b1)).booleanValue();

    public Nt(String str, Lt lt, Context context, It it, Yt yt, C2951a c2951a, H6 h6, C0784Vn c0784Vn) {
        this.f10092d = str;
        this.f10090b = lt;
        this.f10091c = it;
        this.f10093e = yt;
        this.f10094f = context;
        this.f10095g = c2951a;
        this.f10096h = h6;
        this.i = c0784Vn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final synchronized void C0(q2.a1 a1Var, InterfaceC0724Se interfaceC0724Se) {
        K3(a1Var, interfaceC0724Se, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final void F2(InterfaceC0656Oe interfaceC0656Oe) {
        M2.u.c("#008 Must be called on the main UI thread.");
        this.f10091c.f9183d.set(interfaceC0656Oe);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final synchronized void G3(boolean z6) {
        M2.u.c("setImmersiveMode must be called on the main UI thread.");
        this.f10098k = z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final void H1(C0741Te c0741Te) {
        M2.u.c("#008 Must be called on the main UI thread.");
        this.f10091c.f9185f.set(c0741Te);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final void K0(InterfaceC2842s0 interfaceC2842s0) {
        M2.u.c("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!interfaceC2842s0.d()) {
                this.i.b();
            }
        } catch (RemoteException e6) {
            u2.k.d("Error in making CSI ping for reporting paid event callback", e6);
        }
        this.f10091c.f9187h.set(interfaceC2842s0);
    }

    public final synchronized void K3(q2.a1 a1Var, InterfaceC0724Se interfaceC0724Se, int i) {
        try {
            if (!a1Var.b()) {
                boolean z6 = false;
                if (((Boolean) AbstractC1266ha.f14508k.v()).booleanValue()) {
                    if (((Boolean) C2841s.f23267e.f23270c.a(H9.tc)).booleanValue()) {
                        z6 = true;
                    }
                }
                if (this.f10095g.f23786c < ((Integer) C2841s.f23267e.f23270c.a(H9.uc)).intValue() || !z6) {
                    M2.u.c("#008 Must be called on the main UI thread.");
                }
            }
            It it = this.f10091c;
            it.f9182c.set(interfaceC0724Se);
            C2911G c2911g = p2.j.f22785C.f22790c;
            if (C2911G.i(this.f10094f) && a1Var.f23156G == null) {
                u2.k.e("Failed to load the ad because app ID is missing.");
                it.D(AbstractC1984ut.A(4, null, null));
                return;
            }
            if (this.f10097j != null) {
                return;
            }
            Jt jt = new Jt(0);
            Lt lt = this.f10090b;
            lt.f9781h.f13254o.f3830b = i;
            lt.a(a1Var, this.f10092d, jt, new Rx(29, this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final synchronized void M0(C0792We c0792We) {
        M2.u.c("#008 Must be called on the main UI thread.");
        Yt yt = this.f10093e;
        yt.f12718a = c0792We.f12228a;
        yt.f12719b = c0792We.f12229b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final void W2(C2839q0 c2839q0) {
        It it = this.f10091c;
        if (c2839q0 == null) {
            it.f9181b.set(null);
        } else {
            it.f9181b.set(new Mt(this, c2839q0, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final synchronized void X0(q2.a1 a1Var, InterfaceC0724Se interfaceC0724Se) {
        K3(a1Var, interfaceC0724Se, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final Bundle e() {
        M2.u.c("#008 Must be called on the main UI thread.");
        C1870sn c1870sn = this.f10097j;
        return c1870sn != null ? c1870sn.d() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final synchronized String h() {
        BinderC1168fk binderC1168fk;
        C1870sn c1870sn = this.f10097j;
        if (c1870sn == null || (binderC1168fk = c1870sn.f16605f) == null) {
            return null;
        }
        return binderC1168fk.f14124a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final InterfaceC0554Ie i() {
        M2.u.c("#008 Must be called on the main UI thread.");
        C1870sn c1870sn = this.f10097j;
        if (c1870sn != null) {
            return c1870sn.f16790s;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final boolean j() {
        M2.u.c("#008 Must be called on the main UI thread.");
        C1870sn c1870sn = this.f10097j;
        return (c1870sn == null || c1870sn.f16794w) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final synchronized long l() {
        C0712Rj c0712Rj;
        C1870sn c1870sn = this.f10097j;
        if (c1870sn == null || (c0712Rj = c1870sn.f16608j) == null) {
            return 0L;
        }
        return c0712Rj.f11035a.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final InterfaceC2854y0 n() {
        C1870sn c1870sn;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.x7)).booleanValue() && (c1870sn = this.f10097j) != null) {
            return c1870sn.f16605f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final String o() {
        return this.f10092d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final synchronized void o1(S2.a aVar) {
        v0(aVar, this.f10098k);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final synchronized void v0(S2.a aVar, boolean z6) {
        M2.u.c("#008 Must be called on the main UI thread.");
        if (this.f10097j == null) {
            u2.k.h("Rewarded can not be shown before loaded");
            this.f10091c.f(AbstractC1984ut.A(9, null, null));
            return;
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8826s3)).booleanValue()) {
            this.f10096h.f8555b.f(new Throwable().getStackTrace());
        }
        this.f10097j.c((Activity) S2.b.n1(aVar), z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final synchronized void x2(long j6) {
        C0712Rj c0712Rj;
        C1870sn c1870sn = this.f10097j;
        if (c1870sn == null || (c0712Rj = c1870sn.f16608j) == null) {
            return;
        }
        c0712Rj.a(j6);
    }
}
