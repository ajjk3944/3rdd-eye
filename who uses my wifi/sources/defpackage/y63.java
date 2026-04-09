package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class y63 extends n92 implements ye4, fw1 {
    public final th2 f;
    public final Context g;
    public final String i;
    public final t63 j;
    public final s63 k;
    public final e51 l;
    public final mv2 m;
    public bk2 o;
    public fk2 p;
    public AtomicBoolean h = new AtomicBoolean();
    public long n = -1;

    public y63(th2 th2Var, Context context, String str, t63 t63Var, s63 s63Var, e51 e51Var, mv2 mv2Var) {
        this.f = th2Var;
        this.g = context;
        this.i = str;
        this.j = t63Var;
        this.k = s63Var;
        this.l = e51Var;
        this.m = mv2Var;
        s63Var.k.set(this);
    }

    @Override // defpackage.ba2
    public final synchronized py2 A() {
        return null;
    }

    @Override // defpackage.ba2
    public final void A1(vi4 vi4Var) {
        this.j.i.i = vi4Var;
    }

    public final synchronized void B3(int i) {
        try {
            if (this.h.compareAndSet(false, true)) {
                this.k.b();
                bk2 bk2Var = this.o;
                if (bk2Var != null) {
                    hg4.C.g.h(bk2Var);
                }
                if (this.p != null) {
                    long jElapsedRealtime = -1;
                    if (this.n != -1) {
                        hg4.C.k.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - this.n;
                    }
                    this.p.e(i, jElapsedRealtime);
                }
                r();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    @Override // defpackage.ba2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean C() {
        /*
            r1 = this;
            monitor-enter(r1)
            t63 r0 = r1.j     // Catch: java.lang.Throwable -> L12
            n70 r0 = r0.j     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Lf
            boolean r0 = r0.isDone()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            monitor-exit(r1)
            return r0
        L12:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y63.C():boolean");
    }

    @Override // defpackage.ba2
    public final synchronized String E() {
        return null;
    }

    @Override // defpackage.ye4
    public final void G1(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            B3(2);
            return;
        }
        if (i2 == 1) {
            B3(4);
        } else if (i2 != 2) {
            B3(6);
        } else {
            B3(3);
        }
    }

    @Override // defpackage.ba2
    public final synchronized void J2(ih3 ih3Var) {
    }

    @Override // defpackage.ba2
    public final void K2(nw1 nw1Var) {
        this.k.g.set(nw1Var);
    }

    @Override // defpackage.ba2
    public final synchronized boolean L() {
        return false;
    }

    @Override // defpackage.ba2
    public final synchronized tx2 N() {
        return null;
    }

    @Override // defpackage.ba2
    public final synchronized void N0(xe4 xe4Var) {
        ou1.h("setAdSize must be called on the main UI thread.");
    }

    @Override // defpackage.ba2
    public final synchronized void N1(pk2 pk2Var) {
    }

    @Override // defpackage.ye4
    public final synchronized void R2() {
        fk2 fk2Var = this.p;
        if (fk2Var != null) {
            hg4.C.k.getClass();
            fk2Var.e(1, SystemClock.elapsedRealtime() - this.n);
        }
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
            so1 r0 = defpackage.q02.d     // Catch: java.lang.Throwable -> L2d
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
            goto L94
        L2f:
            e51 r2 = r5.l     // Catch: java.lang.Throwable -> L2d
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
            boolean r0 = defpackage.lf4.h(r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L6f
            ec2 r0 = r6.x     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L5d
            goto L6f
        L5d:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            defpackage.gi2.Z(r6)     // Catch: java.lang.Throwable -> L2d
            s63 r6 = r5.k     // Catch: java.lang.Throwable -> L2d
            r0 = 4
            r2 = 0
            nx2 r0 = defpackage.zt0.Q(r0, r2, r2)     // Catch: java.lang.Throwable -> L2d
            r6.d0(r0)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r1
        L6f:
            boolean r0 = r5.C()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L77
            monitor-exit(r5)
            return r1
        L77:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            r5.h = r0     // Catch: java.lang.Throwable -> L2d
            u63 r0 = new u63     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            t63 r1 = r5.j     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r5.i     // Catch: java.lang.Throwable -> L2d
            ug0 r3 = new ug0     // Catch: java.lang.Throwable -> L2d
            r4 = 27
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r1.a(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L94:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y63.Z(pc4):boolean");
    }

    @Override // defpackage.ba2
    public final synchronized void c() {
        ou1.h("pause must be called on the main UI thread.");
    }

    @Override // defpackage.ba2
    public final u10 d() {
        return null;
    }

    @Override // defpackage.ba2
    public final synchronized void e() {
        ou1.h("resume must be called on the main UI thread.");
    }

    @Override // defpackage.ye4
    public final synchronized void f() {
        if (this.p != null) {
            hg4 hg4Var = hg4.C;
            hg4Var.k.getClass();
            this.n = SystemClock.elapsedRealtime();
            int i = this.p.m;
            if (i > 0) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f.d.d();
                ym ymVar = hg4Var.k;
                bk2 bk2Var = new bk2(scheduledExecutorService, ymVar);
                this.o = bk2Var;
                x63 x63Var = new x63(this, 0);
                synchronized (bk2Var) {
                    bk2Var.k = x63Var;
                    ymVar.getClass();
                    long j = i;
                    bk2Var.i = SystemClock.elapsedRealtime() + j;
                    bk2Var.h = scheduledExecutorService.schedule(x63Var, j, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // defpackage.ba2
    public final synchronized void g1(boolean z) {
    }

    @Override // defpackage.ba2
    public final synchronized void i() {
    }

    @Override // defpackage.ba2
    public final Bundle k() {
        return new Bundle();
    }

    @Override // defpackage.ba2
    public final long k0() {
        return 0L;
    }

    @Override // defpackage.ba2
    public final boolean l() {
        return false;
    }

    @Override // defpackage.ba2
    public final synchronized void n() {
    }

    @Override // defpackage.ba2
    public final synchronized xe4 o() {
        return null;
    }

    @Override // defpackage.ba2
    public final synchronized void o3(vz1 vz1Var) {
    }

    @Override // defpackage.ba2
    public final d32 p2() {
        return null;
    }

    @Override // defpackage.ba2
    public final synchronized void r() {
        ou1.h("destroy must be called on the main UI thread.");
        fk2 fk2Var = this.p;
        if (fk2Var != null) {
            fk2Var.d();
        }
    }

    @Override // defpackage.ba2
    public final wi2 s() {
        return null;
    }

    @Override // defpackage.ba2
    public final synchronized String u() {
        return null;
    }

    @Override // defpackage.ba2
    public final synchronized String v() {
        return this.i;
    }

    @Override // defpackage.ye4
    public final void B1() {
    }

    @Override // defpackage.ye4
    public final void E1() {
    }

    @Override // defpackage.ba2
    public final void H() {
    }

    @Override // defpackage.ye4
    public final void M1() {
    }

    @Override // defpackage.ye4
    public final void U() {
    }

    @Override // defpackage.ye4
    public final void Y() {
    }

    @Override // defpackage.ye4
    public final void f3() {
    }

    @Override // defpackage.ye4
    public final void h3() {
    }

    @Override // defpackage.ba2
    public final void i2() {
    }

    @Override // defpackage.ba2
    public final void m() {
    }

    @Override // defpackage.ye4
    public final void m2() {
    }

    @Override // defpackage.ba2
    public final void p0() {
    }

    @Override // defpackage.ba2
    public final void q() {
    }

    @Override // defpackage.ba2
    public final void D1(String str) {
    }

    @Override // defpackage.ba2
    public final void H2(b12 b12Var) {
    }

    @Override // defpackage.ba2
    public final void I0(wi2 wi2Var) {
    }

    @Override // defpackage.ba2
    public final void W2(d32 d32Var) {
    }

    @Override // defpackage.ba2
    public final void Z1(zu2 zu2Var) {
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
    public final void s1(long j) {
    }

    @Override // defpackage.ba2
    public final void t1(boolean z) {
    }

    @Override // defpackage.ba2
    public final void a1(pc4 pc4Var, p42 p42Var) {
    }
}
