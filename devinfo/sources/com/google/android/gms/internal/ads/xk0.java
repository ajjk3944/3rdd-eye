package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xk0 extends va.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final va.c3 f18405a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f18406b;

    /* renamed from: c, reason: collision with root package name */
    public final lp0 f18407c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18408d;

    /* renamed from: e, reason: collision with root package name */
    public final za.a f18409e;

    /* renamed from: f, reason: collision with root package name */
    public final uk0 f18410f;
    public final np0 g;

    /* renamed from: h, reason: collision with root package name */
    public final oe f18411h;

    /* renamed from: i, reason: collision with root package name */
    public final qd0 f18412i;
    public b90 j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18413k = ((Boolean) va.s.f36163e.f36166c.a(sk.f16052b1)).booleanValue();

    public xk0(Context context, va.c3 c3Var, String str, lp0 lp0Var, uk0 uk0Var, np0 np0Var, za.a aVar, oe oeVar, qd0 qd0Var) {
        this.f18405a = c3Var;
        this.f18408d = str;
        this.f18406b = context;
        this.f18407c = lp0Var;
        this.f18410f = uk0Var;
        this.g = np0Var;
        this.f18409e = aVar;
        this.f18411h = oeVar;
        this.f18412i = qd0Var;
    }

    @Override // va.l0
    public final synchronized void B1() {
        pb.y.d("showInterstitial must be called on the main UI thread.");
        if (this.j == null) {
            za.i.h("Interstitial can not be shown before loaded.");
            this.f18410f.b(yo0.A(9, null, null));
        } else {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16317s3)).booleanValue()) {
                this.f18411h.f14684b.e(new Throwable().getStackTrace());
            }
            this.j.c(null, this.f18413k);
        }
    }

    @Override // va.l0
    public final synchronized void D0(long j) {
        o50 o50Var;
        b90 b90Var = this.j;
        if (b90Var == null || (o50Var = b90Var.j) == null) {
            return;
        }
        o50Var.a(j);
    }

    @Override // va.l0
    public final Bundle D1() {
        pb.y.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // va.l0
    public final synchronized void E0(boolean z3) {
        pb.y.d("setImmersiveMode must be called on the main UI thread.");
        this.f18413k = z3;
    }

    @Override // va.l0
    public final void F0(va.a1 a1Var) {
        this.f18410f.f17231e.set(a1Var);
    }

    @Override // va.l0
    public final va.c3 G1() {
        return null;
    }

    @Override // va.l0
    public final va.y I() {
        return this.f18410f.f();
    }

    @Override // va.l0
    public final synchronized String J1() {
        c60 c60Var;
        b90 b90Var = this.j;
        if (b90Var == null || (c60Var = b90Var.f14537f) == null) {
            return null;
        }
        return c60Var.f9997a;
    }

    @Override // va.l0
    public final synchronized String L1() {
        c60 c60Var;
        b90 b90Var = this.j;
        if (b90Var == null || (c60Var = b90Var.f14537f) == null) {
            return null;
        }
        return c60Var.f9997a;
    }

    @Override // va.l0
    public final synchronized long M() {
        o50 o50Var;
        b90 b90Var = this.j;
        if (b90Var == null || (o50Var = b90Var.j) == null) {
            return 0L;
        }
        return o50Var.f14565a.get();
    }

    @Override // va.l0
    public final synchronized String M1() {
        return this.f18408d;
    }

    @Override // va.l0
    public final synchronized va.x1 N1() {
        b90 b90Var;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16401x7)).booleanValue() && (b90Var = this.j) != null) {
            return b90Var.f14537f;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // va.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean P(va.z2 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.c()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r0 == 0) goto L9
            goto L4c
        L9:
            com.google.android.gms.internal.ads.oa r0 = com.google.android.gms.internal.ads.sl.f16462i     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.u()     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.pk r0 = com.google.android.gms.internal.ads.sk.f16373vc     // Catch: java.lang.Throwable -> L2d
            va.s r2 = va.s.f36163e     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.rk r2 = r2.f36166c     // Catch: java.lang.Throwable -> L2d
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
            goto L95
        L2f:
            za.a r2 = r5.f18409e     // Catch: java.lang.Throwable -> L2d
            int r2 = r2.f38131c     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.pk r3 = com.google.android.gms.internal.ads.sk.f16389wc     // Catch: java.lang.Throwable -> L2d
            va.s r4 = va.s.f36163e     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.rk r4 = r4.f36166c     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L2d
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L2d
            if (r2 < r3) goto L47
            if (r0 != 0) goto L4c
        L47:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            pb.y.d(r0)     // Catch: java.lang.Throwable -> L2d
        L4c:
            ua.j r0 = ua.j.C     // Catch: java.lang.Throwable -> L2d
            ya.f0 r0 = r0.f35261c     // Catch: java.lang.Throwable -> L2d
            android.content.Context r0 = r5.f18406b     // Catch: java.lang.Throwable -> L2d
            boolean r2 = ya.f0.i(r0)     // Catch: java.lang.Throwable -> L2d
            r3 = 0
            if (r2 == 0) goto L6f
            va.o0 r2 = r6.f36204s     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L6f
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            za.i.e(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.uk0 r6 = r5.f18410f     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L93
            r0 = 4
            va.w1 r0 = com.google.android.gms.internal.ads.yo0.A(r0, r3, r3)     // Catch: java.lang.Throwable -> L2d
            r6.o(r0)     // Catch: java.lang.Throwable -> L2d
            goto L93
        L6f:
            boolean r2 = r5.h4()     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L93
            boolean r1 = r6.f36193f     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.al0.x(r0, r1)     // Catch: java.lang.Throwable -> L2d
            r5.j = r3     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.lp0 r0 = r5.f18407c     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r5.f18408d     // Catch: java.lang.Throwable -> L2d
            va.c3 r2 = r5.f18405a     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.ip0 r3 = new com.google.android.gms.internal.ads.ip0     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.rg0 r2 = new com.google.android.gms.internal.ads.rg0     // Catch: java.lang.Throwable -> L2d
            r4 = 5
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r0.a(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L93:
            monitor-exit(r5)
            return r1
        L95:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xk0.P(va.z2):boolean");
    }

    @Override // va.l0
    public final void X3(va.v0 v0Var) {
        pb.y.d("setAppEventListener must be called on the main UI thread.");
        this.f18410f.h(v0Var);
    }

    @Override // va.l0
    public final void Z3(va.z2 z2Var, va.b0 b0Var) {
        this.f18410f.f17230d.set(b0Var);
        P(z2Var);
    }

    @Override // va.l0
    public final vb.a a() {
        return null;
    }

    @Override // va.l0
    public final synchronized void d() {
        pb.y.d("pause must be called on the main UI thread.");
        b90 b90Var = this.j;
        if (b90Var != null) {
            s60 s60Var = b90Var.f14534c;
            s60Var.getClass();
            s60Var.p1(new mu0(null, 2));
        }
    }

    @Override // va.l0
    public final void d1(va.r1 r1Var) {
        pb.y.d("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!r1Var.d()) {
                this.f18412i.b();
            }
        } catch (RemoteException e2) {
            za.i.d("Error in making CSI ping for reporting paid event callback", e2);
        }
        this.f18410f.f17229c.set(r1Var);
    }

    @Override // va.l0
    public final synchronized void e() {
        pb.y.d("resume must be called on the main UI thread.");
        b90 b90Var = this.j;
        if (b90Var != null) {
            s60 s60Var = b90Var.f14534c;
            s60Var.getClass();
            s60Var.p1(new jm(null, 1));
        }
    }

    @Override // va.l0
    public final synchronized void e4(xk xkVar) {
        pb.y.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f18407c.f13571f = xkVar;
    }

    @Override // va.l0
    public final synchronized boolean f() {
        pb.y.d("isLoaded must be called on the main UI thread.");
        return h4();
    }

    @Override // va.l0
    public final synchronized void h() {
        pb.y.d("destroy must be called on the main UI thread.");
        b90 b90Var = this.j;
        if (b90Var != null) {
            s60 s60Var = b90Var.f14534c;
            s60Var.getClass();
            s60Var.p1(new nk(null, 2));
        }
    }

    public final synchronized boolean h4() {
        b90 b90Var = this.j;
        if (b90Var != null) {
            if (!b90Var.f9629p.f18305b.get()) {
                return true;
            }
        }
        return false;
    }

    @Override // va.l0
    public final va.v0 i() {
        va.v0 v0Var;
        uk0 uk0Var = this.f18410f;
        synchronized (uk0Var) {
            v0Var = (va.v0) uk0Var.f17228b.get();
        }
        return v0Var;
    }

    @Override // va.l0
    public final synchronized void j3(vb.a aVar) {
        if (this.j == null) {
            za.i.h("Interstitial can not be shown before loaded.");
            this.f18410f.b(yo0.A(9, null, null));
            return;
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16317s3)).booleanValue()) {
            this.f18411h.f14684b.e(new Throwable().getStackTrace());
        }
        this.j.c((Activity) vb.b.U0(aVar), this.f18413k);
    }

    @Override // va.l0
    public final void n2(su suVar) {
        this.g.f14394e.set(suVar);
    }

    @Override // va.l0
    public final void p1() {
        pb.y.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // va.l0
    public final synchronized boolean r() {
        return this.f18407c.b();
    }

    @Override // va.l0
    public final synchronized boolean u() {
        return false;
    }

    @Override // va.l0
    public final void x3(va.y yVar) {
        pb.y.d("setAdListener must be called on the main UI thread.");
        this.f18410f.f17227a.set(yVar);
    }

    @Override // va.l0
    public final va.a2 y() {
        return null;
    }

    @Override // va.l0
    public final void E1() {
    }

    @Override // va.l0
    public final void F1() {
    }

    @Override // va.l0
    public final void I1() {
    }

    @Override // va.l0
    public final void N() {
    }

    @Override // va.l0
    public final void t() {
    }

    @Override // va.l0
    public final void A2(va.f3 f3Var) {
    }

    @Override // va.l0
    public final void P2(va.x2 x2Var) {
    }

    @Override // va.l0
    public final void S2(boolean z3) {
    }

    @Override // va.l0
    public final void g3(String str) {
    }

    @Override // va.l0
    public final void j1(va.c3 c3Var) {
    }

    @Override // va.l0
    public final void s1(va.y0 y0Var) {
    }

    @Override // va.l0
    public final void t0(va.v vVar) {
    }

    @Override // va.l0
    public final void t1(vh vhVar) {
    }
}
