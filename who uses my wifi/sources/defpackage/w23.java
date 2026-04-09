package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w23 extends n92 {
    public final xe4 f;
    public final Context g;
    public final q73 h;
    public final String i;
    public final e51 j;
    public final s23 k;
    public final s73 l;
    public final vs1 m;
    public final mv2 n;
    public hq2 o;
    public boolean p = ((Boolean) tw1.e.c.a(mz1.M0)).booleanValue();

    public w23(Context context, xe4 xe4Var, String str, q73 q73Var, s23 s23Var, s73 s73Var, e51 e51Var, vs1 vs1Var, mv2 mv2Var) {
        this.f = xe4Var;
        this.i = str;
        this.g = context;
        this.h = q73Var;
        this.k = s23Var;
        this.l = s73Var;
        this.j = e51Var;
        this.m = vs1Var;
        this.n = mv2Var;
    }

    @Override // defpackage.ba2
    public final py2 A() {
        return null;
    }

    public final synchronized boolean B3() {
        hq2 hq2Var = this.o;
        if (hq2Var != null) {
            if (!hq2Var.p.g.get()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ba2
    public final synchronized boolean C() {
        return this.h.b();
    }

    @Override // defpackage.ba2
    public final synchronized String E() {
        rm2 rm2Var;
        hq2 hq2Var = this.o;
        if (hq2Var == null || (rm2Var = hq2Var.f) == null) {
            return null;
        }
        return rm2Var.f;
    }

    @Override // defpackage.ba2
    public final void I0(wi2 wi2Var) {
        ou1.h("setAppEventListener must be called on the main UI thread.");
        this.k.p(wi2Var);
    }

    @Override // defpackage.ba2
    public final synchronized boolean L() {
        return false;
    }

    @Override // defpackage.ba2
    public final synchronized tx2 N() {
        hq2 hq2Var;
        if (((Boolean) tw1.e.c.a(mz1.d7)).booleanValue() && (hq2Var = this.o) != null) {
            return hq2Var.f;
        }
        return null;
    }

    @Override // defpackage.ba2
    public final void W2(d32 d32Var) {
        ou1.h("setAdListener must be called on the main UI thread.");
        this.k.f.set(d32Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // defpackage.ba2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean Z(defpackage.pc4 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.b()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r0 == 0) goto L9
            goto L4c
        L9:
            so1 r0 = defpackage.q02.i     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.w()     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            iz1 r0 = defpackage.mz1.Wb     // Catch: java.lang.Throwable -> L2d
            tw1 r2 = defpackage.tw1.e     // Catch: java.lang.Throwable -> L2d
            kz1 r2 = r2.c     // Catch: java.lang.Throwable -> L2d
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
            e51 r2 = r5.j     // Catch: java.lang.Throwable -> L2d
            int r2 = r2.h     // Catch: java.lang.Throwable -> L2d
            iz1 r3 = defpackage.mz1.Xb     // Catch: java.lang.Throwable -> L2d
            tw1 r4 = defpackage.tw1.e     // Catch: java.lang.Throwable -> L2d
            kz1 r4 = r4.c     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L2d
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L2d
            if (r2 < r3) goto L47
            if (r0 != 0) goto L4c
        L47:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            defpackage.ou1.h(r0)     // Catch: java.lang.Throwable -> L2d
        L4c:
            hg4 r0 = defpackage.hg4.C     // Catch: java.lang.Throwable -> L2d
            lf4 r0 = r0.c     // Catch: java.lang.Throwable -> L2d
            android.content.Context r0 = r5.g     // Catch: java.lang.Throwable -> L2d
            boolean r2 = defpackage.lf4.h(r0)     // Catch: java.lang.Throwable -> L2d
            r3 = 0
            if (r2 == 0) goto L6f
            ec2 r2 = r6.x     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L6f
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            defpackage.gi2.Z(r6)     // Catch: java.lang.Throwable -> L2d
            s23 r6 = r5.k     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L94
            r0 = 4
            nx2 r0 = defpackage.zt0.Q(r0, r3, r3)     // Catch: java.lang.Throwable -> L2d
            r6.d0(r0)     // Catch: java.lang.Throwable -> L2d
            goto L94
        L6f:
            boolean r2 = r5.B3()     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L94
            boolean r1 = r6.k     // Catch: java.lang.Throwable -> L2d
            defpackage.yc0.v(r0, r1)     // Catch: java.lang.Throwable -> L2d
            r5.o = r3     // Catch: java.lang.Throwable -> L2d
            q73 r0 = r5.h     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r5.i     // Catch: java.lang.Throwable -> L2d
            xe4 r2 = r5.f     // Catch: java.lang.Throwable -> L2d
            n73 r3 = new n73     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            zs1 r2 = new zs1     // Catch: java.lang.Throwable -> L2d
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w23.Z(pc4):boolean");
    }

    @Override // defpackage.ba2
    public final void Z1(zu2 zu2Var) {
        ou1.h("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zu2Var.c()) {
                this.n.b();
            }
        } catch (RemoteException unused) {
            gi2.q0(3);
        }
        this.k.h.set(zu2Var);
    }

    @Override // defpackage.ba2
    public final void a1(pc4 pc4Var, p42 p42Var) {
        this.k.i.set(p42Var);
        Z(pc4Var);
    }

    @Override // defpackage.ba2
    public final synchronized void c() {
        ou1.h("pause must be called on the main UI thread.");
        hq2 hq2Var = this.o;
        if (hq2Var != null) {
            fn2 fn2Var = hq2Var.c;
            fn2Var.getClass();
            fn2Var.P1(new zj0(null));
        }
    }

    @Override // defpackage.ba2
    public final u10 d() {
        return null;
    }

    @Override // defpackage.ba2
    public final synchronized void e() {
        ou1.h("resume must be called on the main UI thread.");
        hq2 hq2Var = this.o;
        if (hq2Var != null) {
            fn2 fn2Var = hq2Var.c;
            fn2Var.getClass();
            fn2Var.P1(new nc3(null, false));
        }
    }

    @Override // defpackage.ba2
    public final synchronized void i() {
        ou1.h("showInterstitial must be called on the main UI thread.");
        if (this.o == null) {
            gi2.i0("Interstitial can not be shown before loaded.");
            this.k.s(zt0.Q(9, null, null));
        } else {
            if (((Boolean) tw1.e.c.a(mz1.b3)).booleanValue()) {
                this.m.b.c(new Throwable().getStackTrace());
            }
            this.o.c(null, this.p);
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
        hq2 hq2Var = this.o;
        if (hq2Var == null || (gm2Var = hq2Var.j) == null) {
            return 0L;
        }
        return gm2Var.a.get();
    }

    @Override // defpackage.ba2
    public final synchronized void k3(u10 u10Var) {
        if (this.o == null) {
            gi2.i0("Interstitial can not be shown before loaded.");
            this.k.s(zt0.Q(9, null, null));
            return;
        }
        if (((Boolean) tw1.e.c.a(mz1.b3)).booleanValue()) {
            this.m.b.c(new Throwable().getStackTrace());
        }
        this.o.c((Activity) oi0.l1(u10Var), this.p);
    }

    @Override // defpackage.ba2
    public final synchronized boolean l() {
        ou1.h("isLoaded must be called on the main UI thread.");
        return B3();
    }

    @Override // defpackage.ba2
    public final void n2(ma2 ma2Var) {
        this.l.j.set(ma2Var);
    }

    @Override // defpackage.ba2
    public final xe4 o() {
        return null;
    }

    @Override // defpackage.ba2
    public final void o2(pl2 pl2Var) {
        this.k.j.set(pl2Var);
    }

    @Override // defpackage.ba2
    public final synchronized void o3(vz1 vz1Var) {
        ou1.h("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.h.f = vz1Var;
    }

    @Override // defpackage.ba2
    public final d32 p2() {
        return this.k.l();
    }

    @Override // defpackage.ba2
    public final synchronized void r() {
        ou1.h("destroy must be called on the main UI thread.");
        hq2 hq2Var = this.o;
        if (hq2Var != null) {
            fn2 fn2Var = hq2Var.c;
            fn2Var.getClass();
            fn2Var.P1(new z71(20, (Object) null));
        }
    }

    @Override // defpackage.ba2
    public final wi2 s() {
        wi2 wi2Var;
        s23 s23Var = this.k;
        synchronized (s23Var) {
            wi2Var = (wi2) s23Var.g.get();
        }
        return wi2Var;
    }

    @Override // defpackage.ba2
    public final synchronized void s1(long j) {
        gm2 gm2Var;
        hq2 hq2Var = this.o;
        if (hq2Var == null || (gm2Var = hq2Var.j) == null) {
            return;
        }
        gm2Var.a(j);
    }

    @Override // defpackage.ba2
    public final synchronized void t1(boolean z) {
        ou1.h("setImmersiveMode must be called on the main UI thread.");
        this.p = z;
    }

    @Override // defpackage.ba2
    public final synchronized String u() {
        rm2 rm2Var;
        hq2 hq2Var = this.o;
        if (hq2Var == null || (rm2Var = hq2Var.f) == null) {
            return null;
        }
        return rm2Var.f;
    }

    @Override // defpackage.ba2
    public final synchronized String v() {
        return this.i;
    }

    @Override // defpackage.ba2
    public final void H() {
    }

    @Override // defpackage.ba2
    public final void m() {
    }

    @Override // defpackage.ba2
    public final void n() {
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
    public final void H2(b12 b12Var) {
    }

    @Override // defpackage.ba2
    public final void J2(ih3 ih3Var) {
    }

    @Override // defpackage.ba2
    public final void K2(nw1 nw1Var) {
    }

    @Override // defpackage.ba2
    public final void N0(xe4 xe4Var) {
    }

    @Override // defpackage.ba2
    public final void N1(pk2 pk2Var) {
    }

    @Override // defpackage.ba2
    public final void g1(boolean z) {
    }
}
