package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.FrameLayout;
import java.util.Collections;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rk0 extends va.k0 implements i70 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15677a;

    /* renamed from: b, reason: collision with root package name */
    public final to0 f15678b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15679c;

    /* renamed from: d, reason: collision with root package name */
    public final uk0 f15680d;

    /* renamed from: e, reason: collision with root package name */
    public va.c3 f15681e;

    /* renamed from: f, reason: collision with root package name */
    public final gq0 f15682f;
    public final za.a g;

    /* renamed from: h, reason: collision with root package name */
    public final qd0 f15683h;

    /* renamed from: i, reason: collision with root package name */
    public u30 f15684i;

    public rk0(Context context, va.c3 c3Var, String str, to0 to0Var, uk0 uk0Var, za.a aVar, qd0 qd0Var) {
        this.f15677a = context;
        this.f15678b = to0Var;
        this.f15681e = c3Var;
        this.f15679c = str;
        this.f15680d = uk0Var;
        this.f15682f = to0Var.f16904k;
        this.g = aVar;
        this.f15683h = qd0Var;
        to0Var.f16902h.m1(this, to0Var.f16897b);
    }

    @Override // va.l0
    public final synchronized void D0(long j) {
        o50 o50Var;
        this.f15682f.f11594u.set(j);
        u30 u30Var = this.f15684i;
        if (u30Var == null || (o50Var = u30Var.j) == null) {
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
    public final synchronized void F1() {
        pb.y.d("recordManualImpression must be called on the main UI thread.");
        u30 u30Var = this.f15684i;
        if (u30Var != null) {
            u30Var.e();
        }
    }

    @Override // va.l0
    public final synchronized va.c3 G1() {
        pb.y.d("getAdSize must be called on the main UI thread.");
        u30 u30Var = this.f15684i;
        if (u30Var != null) {
            return yr1.f(this.f15677a, Collections.singletonList(u30Var.c()));
        }
        return this.f15682f.f11577b;
    }

    @Override // va.l0
    public final va.y I() {
        return this.f15680d.f();
    }

    @Override // va.l0
    public final synchronized String J1() {
        c60 c60Var;
        u30 u30Var = this.f15684i;
        if (u30Var == null || (c60Var = u30Var.f14537f) == null) {
            return null;
        }
        return c60Var.f9997a;
    }

    @Override // va.l0
    public final synchronized String L1() {
        c60 c60Var;
        u30 u30Var = this.f15684i;
        if (u30Var == null || (c60Var = u30Var.f14537f) == null) {
            return null;
        }
        return c60Var.f9997a;
    }

    @Override // va.l0
    public final synchronized long M() {
        o50 o50Var;
        u30 u30Var = this.f15684i;
        return (u30Var == null || (o50Var = u30Var.j) == null) ? this.f15682f.f11594u.get() : o50Var.f14565a.get();
    }

    @Override // va.l0
    public final synchronized String M1() {
        return this.f15679c;
    }

    @Override // va.l0
    public final synchronized va.x1 N1() {
        u30 u30Var;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16401x7)).booleanValue() && (u30Var = this.f15684i) != null) {
            return u30Var.f14537f;
        }
        return null;
    }

    @Override // va.l0
    public final synchronized boolean P(va.z2 z2Var) {
        h4(this.f15681e);
        return i4(z2Var);
    }

    @Override // va.l0
    public final synchronized void P2(va.x2 x2Var) {
        try {
            if (j4()) {
                pb.y.d("setVideoOptions must be called on the main UI thread.");
            }
            this.f15682f.f11579d = x2Var;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // va.l0
    public final synchronized void S2(boolean z3) {
        try {
            if (j4()) {
                pb.y.d("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f15682f.f11580e = z3;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // va.l0
    public final void X3(va.v0 v0Var) {
        if (j4()) {
            pb.y.d("setAppEventListener must be called on the main UI thread.");
        }
        this.f15680d.h(v0Var);
    }

    @Override // va.l0
    public final vb.a a() {
        if (j4()) {
            pb.y.d("getAdFrame must be called on the main UI thread.");
        }
        return new vb.b(this.f15678b.f16901f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // va.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void d() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.oa r0 = com.google.android.gms.internal.ads.sl.g     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.u()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.pk r0 = com.google.android.gms.internal.ads.sk.tc     // Catch: java.lang.Throwable -> L36
            va.s r1 = va.s.f36163e     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.rk r2 = r1.f36166c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            za.a r0 = r4.g     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f38131c     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.pk r2 = com.google.android.gms.internal.ads.sk.f16406xc     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.rk r1 = r1.f36166c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L54
        L38:
            java.lang.String r0 = "pause must be called on the main UI thread."
            pb.y.d(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.u30 r0 = r4.f15684i     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L52
            com.google.android.gms.internal.ads.s60 r0 = r0.f14534c     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.mu0 r1 = new com.google.android.gms.internal.ads.mu0     // Catch: java.lang.Throwable -> L36
            r2 = 2
            r3 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L36
            r0.p1(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L52:
            monitor-exit(r4)
            return
        L54:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rk0.d():void");
    }

    @Override // va.l0
    public final void d1(va.r1 r1Var) {
        if (j4()) {
            pb.y.d("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!r1Var.d()) {
                this.f15683h.b();
            }
        } catch (RemoteException e2) {
            za.i.d("Error in making CSI ping for reporting paid event callback", e2);
        }
        this.f15680d.f17229c.set(r1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // va.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void e() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.oa r0 = com.google.android.gms.internal.ads.sl.f16461h     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.u()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.pk r0 = com.google.android.gms.internal.ads.sk.f16310rc     // Catch: java.lang.Throwable -> L36
            va.s r1 = va.s.f36163e     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.rk r2 = r1.f36166c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            za.a r0 = r4.g     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f38131c     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.pk r2 = com.google.android.gms.internal.ads.sk.f16406xc     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.rk r1 = r1.f36166c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L54
        L38:
            java.lang.String r0 = "resume must be called on the main UI thread."
            pb.y.d(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.u30 r0 = r4.f15684i     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L52
            com.google.android.gms.internal.ads.s60 r0 = r0.f14534c     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.jm r1 = new com.google.android.gms.internal.ads.jm     // Catch: java.lang.Throwable -> L36
            r2 = 1
            r3 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L36
            r0.p1(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L52:
            monitor-exit(r4)
            return
        L54:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rk0.e():void");
    }

    @Override // va.l0
    public final synchronized void e4(xk xkVar) {
        pb.y.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f15678b.g = xkVar;
    }

    @Override // va.l0
    public final boolean f() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // va.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void h() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.oa r0 = com.google.android.gms.internal.ads.sl.f16459e     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.u()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.pk r0 = com.google.android.gms.internal.ads.sk.f16326sc     // Catch: java.lang.Throwable -> L36
            va.s r1 = va.s.f36163e     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.rk r2 = r1.f36166c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            za.a r0 = r4.g     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f38131c     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.pk r2 = com.google.android.gms.internal.ads.sk.f16406xc     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.rk r1 = r1.f36166c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L54
        L38:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            pb.y.d(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.u30 r0 = r4.f15684i     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L52
            com.google.android.gms.internal.ads.s60 r0 = r0.f14534c     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.nk r1 = new com.google.android.gms.internal.ads.nk     // Catch: java.lang.Throwable -> L36
            r2 = 2
            r3 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L36
            r0.p1(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L52:
            monitor-exit(r4)
            return
        L54:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rk0.h():void");
    }

    public final synchronized void h4(va.c3 c3Var) {
        gq0 gq0Var = this.f15682f;
        gq0Var.f11577b = c3Var;
        gq0Var.f11590q = this.f15681e.f36049n;
    }

    @Override // va.l0
    public final va.v0 i() {
        va.v0 v0Var;
        uk0 uk0Var = this.f15680d;
        synchronized (uk0Var) {
            v0Var = (va.v0) uk0Var.f17228b.get();
        }
        return v0Var;
    }

    public final synchronized boolean i4(va.z2 z2Var) {
        try {
            if (j4()) {
                pb.y.d("loadAd must be called on the main UI thread.");
            }
            ya.f0 f0Var = ua.j.C.f35261c;
            Context context = this.f15677a;
            if (!ya.f0.i(context) || z2Var.f36204s != null) {
                al0.x(context, z2Var.f36193f);
                return this.f15678b.a(z2Var, this.f15679c, null, new kh0(3, this));
            }
            za.i.e("Failed to load the ad because app ID is missing.");
            uk0 uk0Var = this.f15680d;
            if (uk0Var != null) {
                uk0Var.o(yo0.A(4, null, null));
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // va.l0
    public final synchronized void j1(va.c3 c3Var) {
        qz qzVar;
        pb.y.d("setAdSize must be called on the main UI thread.");
        this.f15682f.f11577b = c3Var;
        this.f15681e = c3Var;
        u30 u30Var = this.f15684i;
        if (u30Var != null) {
            FrameLayout frameLayout = this.f15678b.f16901f;
            if (frameLayout != null && (qzVar = u30Var.f17044n) != null) {
                qzVar.D0(h0.a(c3Var));
                frameLayout.setMinimumHeight(c3Var.f36040c);
                frameLayout.setMinimumWidth(c3Var.f36043f);
                u30Var.f17051u = c3Var;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j4() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.oa r0 = com.google.android.gms.internal.ads.sl.f16460f
            java.lang.Object r0 = r0.u()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.pk r0 = com.google.android.gms.internal.ads.sk.f16373vc
            va.s r3 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r3 = r3.f36166c
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            r0 = r1
            goto L25
        L24:
            r0 = r2
        L25:
            za.a r3 = r6.g
            int r3 = r3.f38131c
            com.google.android.gms.internal.ads.pk r4 = com.google.android.gms.internal.ads.sk.f16389wc
            va.s r5 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r5 = r5.f36166c
            java.lang.Object r4 = r5.a(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r3 < r4) goto L3f
            if (r0 != 0) goto L3e
            goto L3f
        L3e:
            return r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rk0.j4():boolean");
    }

    @Override // va.l0
    public final void p1() {
        pb.y.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // va.l0
    public final synchronized boolean r() {
        return this.f15678b.b();
    }

    @Override // va.l0
    public final synchronized void s1(va.y0 y0Var) {
        pb.y.d("setCorrelationIdProvider must be called on the main UI thread");
        this.f15682f.f11596w = y0Var;
    }

    @Override // va.l0
    public final void t0(va.v vVar) {
        if (j4()) {
            pb.y.d("setAdListener must be called on the main UI thread.");
        }
        wk0 wk0Var = this.f15678b.f16900e;
        synchronized (wk0Var) {
            wk0Var.f18045a = vVar;
        }
    }

    @Override // va.l0
    public final synchronized boolean u() {
        u30 u30Var = this.f15684i;
        if (u30Var != null) {
            if (u30Var.f14533b.f18103q0) {
                return true;
            }
        }
        return false;
    }

    @Override // va.l0
    public final void x3(va.y yVar) {
        if (j4()) {
            pb.y.d("setAdListener must be called on the main UI thread.");
        }
        this.f15680d.f17227a.set(yVar);
    }

    @Override // va.l0
    public final synchronized va.a2 y() {
        pb.y.d("getVideoController must be called from the main thread.");
        u30 u30Var = this.f15684i;
        va.a2 a2VarMo165b = null;
        if (u30Var == null) {
            return null;
        }
        try {
            a2VarMo165b = u30Var.f17046p.mo165b();
        } catch (kq0 unused) {
        }
        return a2VarMo165b;
    }

    @Override // va.l0
    public final void B1() {
    }

    @Override // va.l0
    public final void E1() {
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
    public final void E0(boolean z3) {
    }

    @Override // va.l0
    public final void F0(va.a1 a1Var) {
    }

    @Override // va.l0
    public final void g3(String str) {
    }

    @Override // va.l0
    public final void j3(vb.a aVar) {
    }

    @Override // va.l0
    public final void n2(su suVar) {
    }

    @Override // va.l0
    public final void t1(vh vhVar) {
    }

    @Override // va.l0
    public final void Z3(va.z2 z2Var, va.b0 b0Var) {
    }
}
