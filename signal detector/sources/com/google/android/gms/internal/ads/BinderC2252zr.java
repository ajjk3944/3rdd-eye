package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import q2.C2841s;
import q2.InterfaceC2803B;
import q2.InterfaceC2809b0;
import q2.InterfaceC2842s0;
import q2.InterfaceC2847v;
import q2.InterfaceC2853y;
import q2.InterfaceC2854y0;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.zr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2252zr extends q2.K {

    /* renamed from: a, reason: collision with root package name */
    public final q2.d1 f17977a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f17978b;

    /* renamed from: c, reason: collision with root package name */
    public final Gt f17979c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17980d;

    /* renamed from: e, reason: collision with root package name */
    public final C2951a f17981e;

    /* renamed from: f, reason: collision with root package name */
    public final C2090wr f17982f;

    /* renamed from: g, reason: collision with root package name */
    public final It f17983g;

    /* renamed from: h, reason: collision with root package name */
    public final H6 f17984h;
    public final C0784Vn i;

    /* renamed from: j, reason: collision with root package name */
    public C0493El f17985j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17986k = ((Boolean) C2841s.f23267e.f23270c.a(H9.f8715b1)).booleanValue();

    public BinderC2252zr(Context context, q2.d1 d1Var, String str, Gt gt, C2090wr c2090wr, It it, C2951a c2951a, H6 h6, C0784Vn c0784Vn) {
        this.f17977a = d1Var;
        this.f17980d = str;
        this.f17978b = context;
        this.f17979c = gt;
        this.f17982f = c2090wr;
        this.f17983g = it;
        this.f17981e = c2951a;
        this.f17984h = h6;
        this.i = c0784Vn;
    }

    @Override // q2.L
    public final synchronized String A() {
        return this.f17980d;
    }

    @Override // q2.L
    public final synchronized void B2(S2.a aVar) {
        if (this.f17985j == null) {
            u2.k.h("Interstitial can not be shown before loaded.");
            this.f17982f.f(AbstractC1984ut.A(9, null, null));
            return;
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8826s3)).booleanValue()) {
            this.f17984h.f8555b.f(new Throwable().getStackTrace());
        }
        this.f17985j.c((Activity) S2.b.n1(aVar), this.f17986k);
    }

    @Override // q2.L
    public final q2.B0 C() {
        return null;
    }

    @Override // q2.L
    public final void C3(q2.W w6) {
        M2.u.c("setAppEventListener must be called on the main UI thread.");
        this.f17982f.p(w6);
    }

    @Override // q2.L
    public final synchronized boolean H() {
        return this.f17979c.b();
    }

    @Override // q2.L
    public final synchronized void H3(N9 n9) {
        M2.u.c("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f17979c.f8471f = n9;
    }

    @Override // q2.L
    public final void I2(InterfaceC2809b0 interfaceC2809b0) {
        this.f17982f.f17503e.set(interfaceC2809b0);
    }

    public final synchronized boolean K3() {
        C0493El c0493El = this.f17985j;
        if (c0493El != null) {
            if (!c0493El.f7995p.f7030b.get()) {
                return true;
            }
        }
        return false;
    }

    @Override // q2.L
    public final void L2(String str) {
    }

    @Override // q2.L
    public final synchronized boolean M() {
        return false;
    }

    @Override // q2.L
    public final synchronized InterfaceC2854y0 N() {
        C0493El c0493El;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.x7)).booleanValue() && (c0493El = this.f17985j) != null) {
            return c0493El.f16605f;
        }
        return null;
    }

    @Override // q2.L
    public final synchronized void R0(long j6) {
        C0712Rj c0712Rj;
        C0493El c0493El = this.f17985j;
        if (c0493El == null || (c0712Rj = c0493El.f16608j) == null) {
            return;
        }
        c0712Rj.a(j6);
    }

    @Override // q2.L
    public final synchronized void S0(boolean z6) {
        M2.u.c("setImmersiveMode must be called on the main UI thread.");
        this.f17986k = z6;
    }

    @Override // q2.L
    public final void S1(C0435Be c0435Be) {
        this.f17983g.f9184e.set(c0435Be);
    }

    @Override // q2.L
    public final void V2(InterfaceC2842s0 interfaceC2842s0) {
        M2.u.c("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!interfaceC2842s0.d()) {
                this.i.b();
            }
        } catch (RemoteException e6) {
            u2.k.d("Error in making CSI ping for reporting paid event callback", e6);
        }
        this.f17982f.f17501c.set(interfaceC2842s0);
    }

    @Override // q2.L
    public final InterfaceC2853y Y() {
        return this.f17982f.c();
    }

    @Override // q2.L
    public final synchronized long a0() {
        C0712Rj c0712Rj;
        C0493El c0493El = this.f17985j;
        if (c0493El == null || (c0712Rj = c0493El.f16608j) == null) {
            return 0L;
        }
        return c0712Rj.f11035a.get();
    }

    @Override // q2.L
    public final S2.a c() {
        return null;
    }

    @Override // q2.L
    public final synchronized void d() {
        M2.u.c("pause must be called on the main UI thread.");
        C0493El c0493El = this.f17985j;
        if (c0493El != null) {
            C2137xk c2137xk = c0493El.f16602c;
            c2137xk.getClass();
            c2137xk.C1(new C1288hw(null, 3));
        }
    }

    @Override // q2.L
    public final synchronized void e() {
        M2.u.c("resume must be called on the main UI thread.");
        C0493El c0493El = this.f17985j;
        if (c0493El != null) {
            C2137xk c2137xk = c0493El.f16602c;
            c2137xk.getClass();
            c2137xk.C1(new C2083wk(null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // q2.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean f0(q2.a1 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.b()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r0 == 0) goto L9
            goto L4c
        L9:
            com.google.android.gms.internal.ads.J4 r0 = com.google.android.gms.internal.ads.AbstractC1266ha.i     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.v()     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.E9 r0 = com.google.android.gms.internal.ads.H9.tc     // Catch: java.lang.Throwable -> L2d
            q2.s r2 = q2.C2841s.f23267e     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.G9 r2 = r2.f23270c     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            r0 = 1
            goto L2f
        L2b:
            r0 = r1
            goto L2f
        L2d:
            r6 = move-exception
            goto L96
        L2f:
            u2.a r2 = r5.f17981e     // Catch: java.lang.Throwable -> L2d
            int r2 = r2.f23786c     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.E9 r3 = com.google.android.gms.internal.ads.H9.uc     // Catch: java.lang.Throwable -> L2d
            q2.s r4 = q2.C2841s.f23267e     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.G9 r4 = r4.f23270c     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L2d
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L2d
            if (r2 < r3) goto L47
            if (r0 != 0) goto L4c
        L47:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            M2.u.c(r0)     // Catch: java.lang.Throwable -> L2d
        L4c:
            p2.j r0 = p2.j.f22785C     // Catch: java.lang.Throwable -> L2d
            t2.G r0 = r0.f22790c     // Catch: java.lang.Throwable -> L2d
            android.content.Context r0 = r5.f17978b     // Catch: java.lang.Throwable -> L2d
            boolean r2 = t2.C2911G.i(r0)     // Catch: java.lang.Throwable -> L2d
            r3 = 0
            if (r2 == 0) goto L6f
            q2.O r2 = r6.f23156G     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L6f
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            u2.k.e(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.wr r6 = r5.f17982f     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L94
            r0 = 4
            q2.x0 r0 = com.google.android.gms.internal.ads.AbstractC1984ut.A(r0, r3, r3)     // Catch: java.lang.Throwable -> L2d
            r6.D(r0)     // Catch: java.lang.Throwable -> L2d
            goto L94
        L6f:
            boolean r2 = r5.K3()     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L94
            boolean r1 = r6.f23170f     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.Cr.t(r0, r1)     // Catch: java.lang.Throwable -> L2d
            r5.f17985j = r3     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.Gt r0 = r5.f17979c     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r5.f17980d     // Catch: java.lang.Throwable -> L2d
            q2.d1 r2 = r5.f17977a     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.Dt r3 = new com.google.android.gms.internal.ads.Dt     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.Nx r2 = new com.google.android.gms.internal.ads.Nx     // Catch: java.lang.Throwable -> L2d
            r4 = 25
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r0.a(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L94:
            monitor-exit(r5)
            return r1
        L96:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC2252zr.f0(q2.a1):boolean");
    }

    @Override // q2.L
    public final synchronized void i() {
        M2.u.c("showInterstitial must be called on the main UI thread.");
        if (this.f17985j == null) {
            u2.k.h("Interstitial can not be shown before loaded.");
            this.f17982f.f(AbstractC1984ut.A(9, null, null));
        } else {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8826s3)).booleanValue()) {
                this.f17984h.f8555b.f(new Throwable().getStackTrace());
            }
            this.f17985j.c(null, this.f17986k);
        }
    }

    @Override // q2.L
    public final Bundle k() {
        M2.u.c("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // q2.L
    public final void k1(InterfaceC2853y interfaceC2853y) {
        M2.u.c("setAdListener must be called on the main UI thread.");
        this.f17982f.f17499a.set(interfaceC2853y);
    }

    @Override // q2.L
    public final synchronized boolean m() {
        M2.u.c("isLoaded must be called on the main UI thread.");
        return K3();
    }

    @Override // q2.L
    public final void n() {
    }

    @Override // q2.L
    public final q2.d1 o() {
        return null;
    }

    @Override // q2.L
    public final synchronized String r() {
        BinderC1168fk binderC1168fk;
        C0493El c0493El = this.f17985j;
        if (c0493El == null || (binderC1168fk = c0493El.f16605f) == null) {
            return null;
        }
        return binderC1168fk.f14124a;
    }

    @Override // q2.L
    public final synchronized void s() {
        M2.u.c("destroy must be called on the main UI thread.");
        C0493El c0493El = this.f17985j;
        if (c0493El != null) {
            C2137xk c2137xk = c0493El.f16602c;
            c2137xk.getClass();
            c2137xk.C1(new C9(null, false));
        }
    }

    @Override // q2.L
    public final void s1() {
        M2.u.c("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // q2.L
    public final q2.W u() {
        q2.W w6;
        C2090wr c2090wr = this.f17982f;
        synchronized (c2090wr) {
            w6 = (q2.W) c2090wr.f17500b.get();
        }
        return w6;
    }

    @Override // q2.L
    public final synchronized String w() {
        BinderC1168fk binderC1168fk;
        C0493El c0493El = this.f17985j;
        if (c0493El == null || (binderC1168fk = c0493El.f16605f) == null) {
            return null;
        }
        return binderC1168fk.f14124a;
    }

    @Override // q2.L
    public final void w1(InterfaceC1407k8 interfaceC1407k8) {
    }

    @Override // q2.L
    public final void w2(boolean z6) {
    }

    @Override // q2.L
    public final void x3(q2.a1 a1Var, InterfaceC2803B interfaceC2803B) {
        this.f17982f.f17502d.set(interfaceC2803B);
        f0(a1Var);
    }

    @Override // q2.L
    public final void K() {
    }

    @Override // q2.L
    public final void b0() {
    }

    @Override // q2.L
    public final void l() {
    }

    @Override // q2.L
    public final void q() {
    }

    @Override // q2.L
    public final void D1(q2.d1 d1Var) {
    }

    @Override // q2.L
    public final void O0(q2.Y0 y02) {
    }

    @Override // q2.L
    public final void q2(InterfaceC2847v interfaceC2847v) {
    }

    @Override // q2.L
    public final void u2(q2.g1 g1Var) {
    }

    @Override // q2.L
    public final void v1(q2.Z z6) {
    }
}
