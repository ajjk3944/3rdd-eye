package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.InterfaceC2803B;
import q2.InterfaceC2809b0;
import q2.InterfaceC2842s0;
import q2.InterfaceC2847v;
import q2.InterfaceC2853y;
import q2.InterfaceC2854y0;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.nt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1607nt extends q2.K implements s2.k, InterfaceC0920b8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0710Rh f15832a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15833b;

    /* renamed from: d, reason: collision with root package name */
    public final String f15835d;

    /* renamed from: e, reason: collision with root package name */
    public final C1445kt f15836e;

    /* renamed from: f, reason: collision with root package name */
    public final C1391jt f15837f;

    /* renamed from: g, reason: collision with root package name */
    public final C2951a f15838g;

    /* renamed from: h, reason: collision with root package name */
    public final C0784Vn f15839h;

    /* renamed from: j, reason: collision with root package name */
    public C0728Si f15840j;

    /* renamed from: k, reason: collision with root package name */
    public C0762Ui f15841k;

    /* renamed from: c, reason: collision with root package name */
    public AtomicBoolean f15834c = new AtomicBoolean();
    public long i = -1;

    public BinderC1607nt(C0710Rh c0710Rh, Context context, String str, C1445kt c1445kt, C1391jt c1391jt, C2951a c2951a, C0784Vn c0784Vn) {
        this.f15832a = c0710Rh;
        this.f15833b = context;
        this.f15835d = str;
        this.f15836e = c1445kt;
        this.f15837f = c1391jt;
        this.f15838g = c2951a;
        this.f15839h = c0784Vn;
        c1391jt.f15013f.set(this);
    }

    @Override // q2.L
    public final synchronized String A() {
        return this.f15835d;
    }

    @Override // q2.L
    public final synchronized q2.B0 C() {
        return null;
    }

    @Override // q2.L
    public final synchronized void D1(q2.d1 d1Var) {
        M2.u.c("setAdSize must be called on the main UI thread.");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    @Override // q2.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean H() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.kt r0 = r1.f15836e     // Catch: java.lang.Throwable -> L12
            f4.a r0 = r0.f15309j     // Catch: java.lang.Throwable -> L12
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC1607nt.H():boolean");
    }

    @Override // q2.L
    public final synchronized void H3(N9 n9) {
    }

    @Override // s2.k
    public final void I0() {
    }

    @Override // s2.k
    public final void K1() {
    }

    public final synchronized void K3(int i) {
        try {
            if (this.f15834c.compareAndSet(false, true)) {
                this.f15837f.c();
                C0728Si c0728Si = this.f15840j;
                if (c0728Si != null) {
                    p2.j.f22785C.f22794g.n(c0728Si);
                }
                if (this.f15841k != null) {
                    long jElapsedRealtime = -1;
                    if (this.i != -1) {
                        p2.j.f22785C.f22797k.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - this.i;
                    }
                    this.f15841k.e(i, jElapsedRealtime);
                }
                s();
            }
        } catch (Throwable th) {
            throw th;
        }
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
        return null;
    }

    @Override // s2.k
    public final synchronized void N2() {
        C0762Ui c0762Ui = this.f15841k;
        if (c0762Ui != null) {
            p2.j.f22785C.f22797k.getClass();
            c0762Ui.e(1, SystemClock.elapsedRealtime() - this.i);
        }
    }

    @Override // q2.L
    public final synchronized void O0(q2.Y0 y02) {
    }

    @Override // q2.L
    public final void R0(long j6) {
    }

    @Override // s2.k
    public final void R1() {
    }

    @Override // q2.L
    public final void S0(boolean z6) {
    }

    @Override // q2.L
    public final InterfaceC2853y Y() {
        return null;
    }

    @Override // q2.L
    public final long a0() {
        return 0L;
    }

    @Override // q2.L
    public final S2.a c() {
        return null;
    }

    @Override // q2.L
    public final synchronized void d() {
        M2.u.c("pause must be called on the main UI thread.");
    }

    @Override // s2.k
    public final void d1() {
    }

    @Override // q2.L
    public final synchronized void e() {
        M2.u.c("resume must be called on the main UI thread.");
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
            com.google.android.gms.internal.ads.J4 r0 = com.google.android.gms.internal.ads.AbstractC1266ha.f14502d     // Catch: java.lang.Throwable -> L2d
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
            goto L95
        L2f:
            u2.a r2 = r5.f15838g     // Catch: java.lang.Throwable -> L2d
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
            android.content.Context r0 = r5.f15833b     // Catch: java.lang.Throwable -> L2d
            boolean r0 = t2.C2911G.i(r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L6f
            q2.O r0 = r6.f23156G     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L5d
            goto L6f
        L5d:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            u2.k.e(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.jt r6 = r5.f15837f     // Catch: java.lang.Throwable -> L2d
            r0 = 4
            r2 = 0
            q2.x0 r0 = com.google.android.gms.internal.ads.AbstractC1984ut.A(r0, r2, r2)     // Catch: java.lang.Throwable -> L2d
            r6.D(r0)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r1
        L6f:
            boolean r0 = r5.H()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L77
            monitor-exit(r5)
            return r1
        L77:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            r5.f15834c = r0     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.lt r0 = new com.google.android.gms.internal.ads.lt     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.kt r1 = r5.f15836e     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r5.f15835d     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.Nx r3 = new com.google.android.gms.internal.ads.Nx     // Catch: java.lang.Throwable -> L2d
            r4 = 26
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r1.a(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L95:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC1607nt.f0(q2.a1):boolean");
    }

    @Override // s2.k
    public final synchronized void g() {
        if (this.f15841k != null) {
            p2.j jVar = p2.j.f22785C;
            jVar.f22797k.getClass();
            this.i = SystemClock.elapsedRealtime();
            int i = this.f15841k.f11759m;
            if (i > 0) {
                C0728Si c0728Si = new C0728Si((ScheduledExecutorService) this.f15832a.f10989d.c(), jVar.f22797k);
                this.f15840j = c0728Si;
                c0728Si.a(i, new RunnableC1553mt(this, 0));
            }
        }
    }

    @Override // s2.k
    public final void h0() {
    }

    @Override // q2.L
    public final synchronized void i() {
    }

    @Override // s2.k
    public final void j2() {
    }

    @Override // q2.L
    public final Bundle k() {
        return new Bundle();
    }

    @Override // s2.k
    public final void k0(int i) {
        if (i == 0) {
            throw null;
        }
        int i3 = i - 1;
        if (i3 == 0) {
            K3(2);
            return;
        }
        if (i3 == 1) {
            K3(4);
        } else if (i3 != 2) {
            K3(6);
        } else {
            K3(3);
        }
    }

    @Override // q2.L
    public final boolean m() {
        return false;
    }

    @Override // q2.L
    public final synchronized void n() {
    }

    @Override // s2.k
    public final void n1() {
    }

    @Override // q2.L
    public final synchronized q2.d1 o() {
        return null;
    }

    @Override // q2.L
    public final synchronized String r() {
        return null;
    }

    @Override // q2.L
    public final synchronized void s() {
        M2.u.c("destroy must be called on the main UI thread.");
        C0762Ui c0762Ui = this.f15841k;
        if (c0762Ui != null) {
            c0762Ui.d();
        }
    }

    @Override // q2.L
    public final q2.W u() {
        return null;
    }

    @Override // q2.L
    public final void u2(q2.g1 g1Var) {
        this.f15836e.i.i = g1Var;
    }

    @Override // q2.L
    public final synchronized void v1(q2.Z z6) {
    }

    @Override // q2.L
    public final synchronized String w() {
        return null;
    }

    @Override // q2.L
    public final void w1(InterfaceC1407k8 interfaceC1407k8) {
        this.f15837f.f15009b.set(interfaceC1407k8);
    }

    @Override // q2.L
    public final synchronized void w2(boolean z6) {
    }

    @Override // s2.k
    public final void x1() {
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
    public final void s1() {
    }

    @Override // q2.L
    public final void B2(S2.a aVar) {
    }

    @Override // q2.L
    public final void C3(q2.W w6) {
    }

    @Override // q2.L
    public final void I2(InterfaceC2809b0 interfaceC2809b0) {
    }

    @Override // q2.L
    public final void S1(C0435Be c0435Be) {
    }

    @Override // q2.L
    public final void V2(InterfaceC2842s0 interfaceC2842s0) {
    }

    @Override // q2.L
    public final void k1(InterfaceC2853y interfaceC2853y) {
    }

    @Override // q2.L
    public final void q2(InterfaceC2847v interfaceC2847v) {
    }

    @Override // q2.L
    public final void x3(q2.a1 a1Var, InterfaceC2803B interfaceC2803B) {
    }
}
