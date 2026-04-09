package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class so0 extends va.k0 implements xa.l, mh {

    /* renamed from: a, reason: collision with root package name */
    public final k10 f16489a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16490b;

    /* renamed from: d, reason: collision with root package name */
    public final String f16492d;

    /* renamed from: e, reason: collision with root package name */
    public final po0 f16493e;

    /* renamed from: f, reason: collision with root package name */
    public final oo0 f16494f;
    public final za.a g;

    /* renamed from: h, reason: collision with root package name */
    public final qd0 f16495h;
    public o30 j;

    /* renamed from: k, reason: collision with root package name */
    public p30 f16497k;

    /* renamed from: c, reason: collision with root package name */
    public AtomicBoolean f16491c = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public long f16496i = -1;

    public so0(k10 k10Var, Context context, String str, po0 po0Var, oo0 oo0Var, za.a aVar, qd0 qd0Var) {
        this.f16489a = k10Var;
        this.f16490b = context;
        this.f16492d = str;
        this.f16493e = po0Var;
        this.f16494f = oo0Var;
        this.g = aVar;
        this.f16495h = qd0Var;
        oo0Var.f14761f.set(this);
    }

    @Override // va.l0
    public final void A2(va.f3 f3Var) {
        this.f16493e.f15065i.f11583i = f3Var;
    }

    @Override // va.l0
    public final synchronized void B1() {
    }

    @Override // va.l0
    public final Bundle D1() {
        return new Bundle();
    }

    @Override // va.l0
    public final synchronized void F1() {
    }

    @Override // va.l0
    public final synchronized va.c3 G1() {
        return null;
    }

    @Override // va.l0
    public final va.y I() {
        return null;
    }

    @Override // va.l0
    public final synchronized String J1() {
        return null;
    }

    @Override // va.l0
    public final synchronized String L1() {
        return null;
    }

    @Override // va.l0
    public final long M() {
        return 0L;
    }

    @Override // va.l0
    public final synchronized String M1() {
        return this.f16492d;
    }

    @Override // va.l0
    public final synchronized va.x1 N1() {
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
            com.google.android.gms.internal.ads.oa r0 = com.google.android.gms.internal.ads.sl.f16458d     // Catch: java.lang.Throwable -> L2d
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
            za.a r2 = r5.g     // Catch: java.lang.Throwable -> L2d
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
            android.content.Context r0 = r5.f16490b     // Catch: java.lang.Throwable -> L2d
            boolean r0 = ya.f0.i(r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L6f
            va.o0 r0 = r6.f36204s     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L5d
            goto L6f
        L5d:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            za.i.e(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.oo0 r6 = r5.f16494f     // Catch: java.lang.Throwable -> L2d
            r0 = 4
            r2 = 0
            va.w1 r0 = com.google.android.gms.internal.ads.yo0.A(r0, r2, r2)     // Catch: java.lang.Throwable -> L2d
            r6.o(r0)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r1
        L6f:
            boolean r0 = r5.r()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L77
            monitor-exit(r5)
            return r1
        L77:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            r5.f16491c = r0     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.qo0 r0 = new com.google.android.gms.internal.ads.qo0     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.po0 r1 = r5.f16493e     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r5.f16492d     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.ne0 r3 = new com.google.android.gms.internal.ads.ne0     // Catch: java.lang.Throwable -> L2d
            r4 = 11
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r1.a(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L95:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.so0.P(va.z2):boolean");
    }

    @Override // va.l0
    public final synchronized void P2(va.x2 x2Var) {
    }

    @Override // va.l0
    public final synchronized void S2(boolean z3) {
    }

    @Override // va.l0
    public final vb.a a() {
        return null;
    }

    @Override // va.l0
    public final synchronized void d() {
        pb.y.d("pause must be called on the main UI thread.");
    }

    @Override // va.l0
    public final synchronized void e() {
        pb.y.d("resume must be called on the main UI thread.");
    }

    @Override // xa.l
    public final void e0(int i4) {
        if (i4 == 0) {
            throw null;
        }
        int i10 = i4 - 1;
        if (i10 == 0) {
            h4(2);
            return;
        }
        if (i10 == 1) {
            h4(4);
        } else if (i10 != 2) {
            h4(6);
        } else {
            h4(3);
        }
    }

    @Override // va.l0
    public final synchronized void e4(xk xkVar) {
    }

    @Override // va.l0
    public final boolean f() {
        return false;
    }

    @Override // va.l0
    public final synchronized void h() {
        pb.y.d("destroy must be called on the main UI thread.");
        p30 p30Var = this.f16497k;
        if (p30Var != null) {
            p30Var.d();
        }
    }

    @Override // xa.l
    public final synchronized void h3() {
        p30 p30Var = this.f16497k;
        if (p30Var != null) {
            ua.j.C.f35267k.getClass();
            p30Var.e(1, SystemClock.elapsedRealtime() - this.f16496i);
        }
    }

    public final synchronized void h4(int i4) {
        try {
            if (this.f16491c.compareAndSet(false, true)) {
                this.f16494f.d();
                o30 o30Var = this.j;
                if (o30Var != null) {
                    ua.j.C.g.g(o30Var);
                }
                if (this.f16497k != null) {
                    long jElapsedRealtime = -1;
                    if (this.f16496i != -1) {
                        ua.j.C.f35267k.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - this.f16496i;
                    }
                    this.f16497k.e(i4, jElapsedRealtime);
                }
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // va.l0
    public final va.v0 i() {
        return null;
    }

    @Override // va.l0
    public final synchronized void j1(va.c3 c3Var) {
        pb.y.d("setAdSize must be called on the main UI thread.");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    @Override // va.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean r() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.po0 r0 = r1.f16493e     // Catch: java.lang.Throwable -> L12
            vd.b r0 = r0.j     // Catch: java.lang.Throwable -> L12
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.so0.r():boolean");
    }

    @Override // va.l0
    public final synchronized void s1(va.y0 y0Var) {
    }

    @Override // va.l0
    public final void t1(vh vhVar) {
        this.f16494f.f14757b.set(vhVar);
    }

    @Override // va.l0
    public final synchronized boolean u() {
        return false;
    }

    @Override // va.l0
    public final synchronized va.a2 y() {
        return null;
    }

    @Override // xa.l
    public final synchronized void z1() {
        if (this.f16497k != null) {
            ua.j jVar = ua.j.C;
            jVar.f35267k.getClass();
            this.f16496i = SystemClock.elapsedRealtime();
            int i4 = this.f16497k.f14878m;
            if (i4 > 0) {
                o30 o30Var = new o30((ScheduledExecutorService) this.f16489a.f12928d.a(), jVar.f35267k);
                this.j = o30Var;
                o30Var.a(i4, new ro0(this, 0));
            }
        }
    }

    @Override // xa.l
    public final void D2() {
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

    @Override // xa.l
    public final void T() {
    }

    @Override // xa.l
    public final void U0() {
    }

    @Override // xa.l
    public final void a2() {
    }

    @Override // xa.l
    public final void g1() {
    }

    @Override // xa.l
    public final void k2() {
    }

    @Override // va.l0
    public final void p1() {
    }

    @Override // xa.l
    public final void r0() {
    }

    @Override // va.l0
    public final void t() {
    }

    @Override // xa.l
    public final void u1() {
    }

    @Override // va.l0
    public final void D0(long j) {
    }

    @Override // va.l0
    public final void E0(boolean z3) {
    }

    @Override // va.l0
    public final void F0(va.a1 a1Var) {
    }

    @Override // va.l0
    public final void X3(va.v0 v0Var) {
    }

    @Override // va.l0
    public final void d1(va.r1 r1Var) {
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
    public final void t0(va.v vVar) {
    }

    @Override // va.l0
    public final void x3(va.y yVar) {
    }

    @Override // va.l0
    public final void Z3(va.z2 z2Var, va.b0 b0Var) {
    }
}
