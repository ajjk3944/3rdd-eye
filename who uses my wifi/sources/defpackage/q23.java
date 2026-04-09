package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.FrameLayout;
import java.util.Collections;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q23 extends n92 implements eo2 {
    public final Context f;
    public final z63 g;
    public final String h;
    public final s23 i;
    public xe4 j;
    public final k83 k;
    public final e51 l;
    public final mv2 m;
    public ik2 n;

    public q23(Context context, xe4 xe4Var, String str, z63 z63Var, s23 s23Var, e51 e51Var, mv2 mv2Var) {
        this.f = context;
        this.g = z63Var;
        this.j = xe4Var;
        this.h = str;
        this.i = s23Var;
        this.k = z63Var.k;
        this.l = e51Var;
        this.m = mv2Var;
        z63Var.h.L1(this, z63Var.b);
    }

    @Override // defpackage.ba2
    public final synchronized py2 A() {
        ou1.h("getVideoController must be called from the main thread.");
        ik2 ik2Var = this.n;
        py2 py2VarA = null;
        if (ik2Var == null) {
            return null;
        }
        try {
            py2VarA = ik2Var.p.a();
        } catch (n83 unused) {
        }
        return py2VarA;
    }

    public final synchronized boolean B3(pc4 pc4Var) {
        try {
            if (C3()) {
                ou1.h("loadAd must be called on the main UI thread.");
            }
            lf4 lf4Var = hg4.C.c;
            Context context = this.f;
            if (!lf4.h(context) || pc4Var.x != null) {
                yc0.v(context, pc4Var.k);
                return this.g.a(pc4Var, this.h, null, new z71(27, this));
            }
            gi2.Z("Failed to load the ad because app ID is missing.");
            s23 s23Var = this.i;
            if (s23Var != null) {
                s23Var.d0(zt0.Q(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ba2
    public final synchronized boolean C() {
        return this.g.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C3() {
        /*
            r6 = this;
            so1 r0 = defpackage.q02.f
            java.lang.Object r0 = r0.w()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            iz1 r0 = defpackage.mz1.Wb
            tw1 r3 = defpackage.tw1.e
            kz1 r3 = r3.c
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            r0 = r1
            goto L25
        L24:
            r0 = r2
        L25:
            e51 r3 = r6.l
            int r3 = r3.h
            iz1 r4 = defpackage.mz1.Xb
            tw1 r5 = defpackage.tw1.e
            kz1 r5 = r5.c
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q23.C3():boolean");
    }

    @Override // defpackage.ba2
    public final synchronized String E() {
        rm2 rm2Var;
        ik2 ik2Var = this.n;
        if (ik2Var == null || (rm2Var = ik2Var.f) == null) {
            return null;
        }
        return rm2Var.f;
    }

    @Override // defpackage.ba2
    public final void H2(b12 b12Var) {
        if (C3()) {
            ou1.h("setAdListener must be called on the main UI thread.");
        }
        u23 u23Var = this.g.e;
        synchronized (u23Var) {
            u23Var.f = b12Var;
        }
    }

    @Override // defpackage.ba2
    public final void I0(wi2 wi2Var) {
        if (C3()) {
            ou1.h("setAppEventListener must be called on the main UI thread.");
        }
        this.i.p(wi2Var);
    }

    @Override // defpackage.ba2
    public final synchronized void J2(ih3 ih3Var) {
        try {
            if (C3()) {
                ou1.h("setVideoOptions must be called on the main UI thread.");
            }
            this.k.d = ih3Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ba2
    public final synchronized boolean L() {
        ik2 ik2Var = this.n;
        if (ik2Var != null) {
            if (ik2Var.b.q0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ba2
    public final synchronized tx2 N() {
        ik2 ik2Var;
        if (((Boolean) tw1.e.c.a(mz1.d7)).booleanValue() && (ik2Var = this.n) != null) {
            return ik2Var.f;
        }
        return null;
    }

    @Override // defpackage.ba2
    public final synchronized void N0(xe4 xe4Var) {
        ag2 ag2Var;
        ou1.h("setAdSize must be called on the main UI thread.");
        this.k.b = xe4Var;
        this.j = xe4Var;
        ik2 ik2Var = this.n;
        if (ik2Var != null) {
            FrameLayout frameLayout = this.g.f;
            if (frameLayout != null && (ag2Var = ik2Var.n) != null) {
                ag2Var.Z(zq.a(xe4Var));
                frameLayout.setMinimumHeight(xe4Var.h);
                frameLayout.setMinimumWidth(xe4Var.k);
                ik2Var.u = xe4Var;
            }
        }
    }

    @Override // defpackage.ba2
    public final synchronized void N1(pk2 pk2Var) {
        ou1.h("setCorrelationIdProvider must be called on the main UI thread");
        this.k.v = pk2Var;
    }

    @Override // defpackage.ba2
    public final void W2(d32 d32Var) {
        if (C3()) {
            ou1.h("setAdListener must be called on the main UI thread.");
        }
        this.i.f.set(d32Var);
    }

    @Override // defpackage.ba2
    public final synchronized boolean Z(pc4 pc4Var) {
        xe4 xe4Var = this.j;
        synchronized (this) {
            k83 k83Var = this.k;
            k83Var.b = xe4Var;
            k83Var.q = this.j.s;
        }
        return B3(pc4Var);
        return B3(pc4Var);
    }

    @Override // defpackage.ba2
    public final void Z1(zu2 zu2Var) {
        if (C3()) {
            ou1.h("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zu2Var.c()) {
                this.m.b();
            }
        } catch (RemoteException unused) {
            gi2.q0(3);
        }
        this.i.h.set(zu2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // defpackage.ba2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void c() {
        /*
            r3 = this;
            monitor-enter(r3)
            so1 r0 = defpackage.q02.g     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.w()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            iz1 r0 = defpackage.mz1.Ub     // Catch: java.lang.Throwable -> L36
            tw1 r1 = defpackage.tw1.e     // Catch: java.lang.Throwable -> L36
            kz1 r2 = r1.c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            e51 r0 = r3.l     // Catch: java.lang.Throwable -> L36
            int r0 = r0.h     // Catch: java.lang.Throwable -> L36
            iz1 r2 = defpackage.mz1.Yb     // Catch: java.lang.Throwable -> L36
            kz1 r1 = r1.c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L53
        L38:
            java.lang.String r0 = "pause must be called on the main UI thread."
            defpackage.ou1.h(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            ik2 r0 = r3.n     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L51
            fn2 r0 = r0.c     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
            zj0 r1 = new zj0     // Catch: java.lang.Throwable -> L36
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L36
            r0.P1(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)
            return
        L51:
            monitor-exit(r3)
            return
        L53:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q23.c():void");
    }

    @Override // defpackage.ba2
    public final u10 d() {
        if (C3()) {
            ou1.h("getAdFrame must be called on the main UI thread.");
        }
        return new oi0(this.g.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // defpackage.ba2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void e() {
        /*
            r4 = this;
            monitor-enter(r4)
            so1 r0 = defpackage.q02.h     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.w()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            iz1 r0 = defpackage.mz1.Sb     // Catch: java.lang.Throwable -> L36
            tw1 r1 = defpackage.tw1.e     // Catch: java.lang.Throwable -> L36
            kz1 r2 = r1.c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            e51 r0 = r4.l     // Catch: java.lang.Throwable -> L36
            int r0 = r0.h     // Catch: java.lang.Throwable -> L36
            iz1 r2 = defpackage.mz1.Yb     // Catch: java.lang.Throwable -> L36
            kz1 r1 = r1.c     // Catch: java.lang.Throwable -> L36
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
            defpackage.ou1.h(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            ik2 r0 = r4.n     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L52
            fn2 r0 = r0.c     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
            nc3 r1 = new nc3     // Catch: java.lang.Throwable -> L36
            r2 = 0
            r3 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L36
            r0.P1(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L52:
            monitor-exit(r4)
            return
        L54:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q23.e():void");
    }

    @Override // defpackage.ba2
    public final synchronized void g1(boolean z) {
        try {
            if (C3()) {
                ou1.h("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.k.e = z;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ba2
    public final void i2() {
        ou1.h("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // defpackage.ba2
    public final Bundle k() {
        ou1.h("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // defpackage.ba2
    public final synchronized long k0() {
        gm2 gm2Var;
        ik2 ik2Var = this.n;
        return (ik2Var == null || (gm2Var = ik2Var.j) == null) ? this.k.u.get() : gm2Var.a.get();
    }

    @Override // defpackage.ba2
    public final boolean l() {
        return false;
    }

    @Override // defpackage.ba2
    public final synchronized void n() {
        ou1.h("recordManualImpression must be called on the main UI thread.");
        ik2 ik2Var = this.n;
        if (ik2Var != null) {
            yp2 yp2Var = ik2Var.r;
            synchronized (yp2Var) {
                yp2Var.P1(sd2.A);
            }
        }
    }

    @Override // defpackage.ba2
    public final synchronized xe4 o() {
        ou1.h("getAdSize must be called on the main UI thread.");
        ik2 ik2Var = this.n;
        if (ik2Var != null) {
            return a30.n(this.f, Collections.singletonList(ik2Var.c()));
        }
        return this.k.b;
    }

    @Override // defpackage.ba2
    public final synchronized void o3(vz1 vz1Var) {
        ou1.h("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.g.g = vz1Var;
    }

    @Override // defpackage.ba2
    public final d32 p2() {
        return this.i.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // defpackage.ba2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void r() {
        /*
            r4 = this;
            monitor-enter(r4)
            so1 r0 = defpackage.q02.e     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.w()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            iz1 r0 = defpackage.mz1.Tb     // Catch: java.lang.Throwable -> L36
            tw1 r1 = defpackage.tw1.e     // Catch: java.lang.Throwable -> L36
            kz1 r2 = r1.c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            e51 r0 = r4.l     // Catch: java.lang.Throwable -> L36
            int r0 = r0.h     // Catch: java.lang.Throwable -> L36
            iz1 r2 = defpackage.mz1.Yb     // Catch: java.lang.Throwable -> L36
            kz1 r1 = r1.c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L55
        L38:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            defpackage.ou1.h(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            ik2 r0 = r4.n     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L53
            fn2 r0 = r0.c     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
            z71 r1 = new z71     // Catch: java.lang.Throwable -> L36
            r2 = 20
            r3 = 0
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L36
            r0.P1(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L53:
            monitor-exit(r4)
            return
        L55:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q23.r():void");
    }

    @Override // defpackage.ba2
    public final wi2 s() {
        wi2 wi2Var;
        s23 s23Var = this.i;
        synchronized (s23Var) {
            wi2Var = (wi2) s23Var.g.get();
        }
        return wi2Var;
    }

    @Override // defpackage.ba2
    public final synchronized void s1(long j) {
        gm2 gm2Var;
        this.k.u.set(j);
        ik2 ik2Var = this.n;
        if (ik2Var == null || (gm2Var = ik2Var.j) == null) {
            return;
        }
        gm2Var.a(j);
    }

    @Override // defpackage.ba2
    public final synchronized String u() {
        rm2 rm2Var;
        ik2 ik2Var = this.n;
        if (ik2Var == null || (rm2Var = ik2Var.f) == null) {
            return null;
        }
        return rm2Var.f;
    }

    @Override // defpackage.ba2
    public final synchronized String v() {
        return this.h;
    }

    @Override // defpackage.ba2
    public final void H() {
    }

    @Override // defpackage.ba2
    public final void i() {
    }

    @Override // defpackage.ba2
    public final void m() {
    }

    @Override // defpackage.ba2
    public final void p0() {
    }

    @Override // defpackage.ba2
    public final void q() {
    }

    @Override // defpackage.ba2
    public final void A1(vi4 vi4Var) {
    }

    @Override // defpackage.ba2
    public final void D1(String str) {
    }

    @Override // defpackage.ba2
    public final void K2(nw1 nw1Var) {
    }

    @Override // defpackage.ba2
    public final void k3(u10 u10Var) {
    }

    @Override // defpackage.ba2
    public final void n2(ma2 ma2Var) {
    }

    @Override // defpackage.ba2
    public final void o2(pl2 pl2Var) {
    }

    @Override // defpackage.ba2
    public final void t1(boolean z) {
    }

    @Override // defpackage.ba2
    public final void a1(pc4 pc4Var, p42 p42Var) {
    }
}
