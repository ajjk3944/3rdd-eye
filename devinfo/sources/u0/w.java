package u0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w implements s {

    /* renamed from: a, reason: collision with root package name */
    public final t f34992a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.f f34993b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f34994c = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final Object f34995d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final x.h0 f34996e;

    /* renamed from: f, reason: collision with root package name */
    public final b2 f34997f;
    public final x.e0 g;

    /* renamed from: h, reason: collision with root package name */
    public final x.f0 f34998h;

    /* renamed from: i, reason: collision with root package name */
    public final x.f0 f34999i;
    public final x.e0 j;

    /* renamed from: k, reason: collision with root package name */
    public final v0.a f35000k;

    /* renamed from: l, reason: collision with root package name */
    public final v0.a f35001l;

    /* renamed from: m, reason: collision with root package name */
    public final x.e0 f35002m;

    /* renamed from: n, reason: collision with root package name */
    public x.e0 f35003n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f35004o;

    /* renamed from: p, reason: collision with root package name */
    public z1 f35005p;

    /* renamed from: q, reason: collision with root package name */
    public f1 f35006q;

    /* renamed from: r, reason: collision with root package name */
    public w f35007r;

    /* renamed from: s, reason: collision with root package name */
    public int f35008s;

    /* renamed from: t, reason: collision with root package name */
    public final nm.d0 f35009t;

    /* renamed from: u, reason: collision with root package name */
    public final c1.o f35010u;

    /* renamed from: v, reason: collision with root package name */
    public final p f35011v;

    /* renamed from: w, reason: collision with root package name */
    public int f35012w;

    public w(t tVar, i0.f fVar) {
        this.f34992a = tVar;
        this.f34993b = fVar;
        x.h0 h0Var = new x.h0(new x.f0());
        this.f34996e = h0Var;
        b2 b2Var = new b2();
        if (tVar.d()) {
            b2Var.f34751k = new x.u();
        }
        if (tVar.f()) {
            b2Var.c();
        }
        this.f34997f = b2Var;
        this.g = com.bumptech.glide.f.i();
        this.f34998h = new x.f0();
        this.f34999i = new x.f0();
        this.j = com.bumptech.glide.f.i();
        v0.a aVar = new v0.a();
        this.f35000k = aVar;
        v0.a aVar2 = new v0.a();
        this.f35001l = aVar2;
        this.f35002m = com.bumptech.glide.f.i();
        this.f35003n = com.bumptech.glide.f.i();
        nm.d0 d0Var = new nm.d0(15, tVar);
        this.f35009t = d0Var;
        this.f35010u = new c1.o();
        p pVar = new p(fVar, tVar, b2Var, h0Var, aVar, aVar2, d0Var, this);
        tVar.p(pVar);
        this.f35011v = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f34995d
            monitor-enter(r0)
            r14.v(r15)     // Catch: java.lang.Throwable -> L4f
            x.e0 r1 = r14.j     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.g(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof x.f0     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            x.f0 r15 = (x.f0) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.f36883b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.f36882a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            u0.d0 r10 = (u0.d0) r10     // Catch: java.lang.Throwable -> L4f
            r14.v(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r15 = move-exception
            goto L63
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            u0.d0 r15 = (u0.d0) r15     // Catch: java.lang.Throwable -> L4f
            r14.v(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.w.A(java.lang.Object):void");
    }

    public final void B(mk.e eVar) {
        boolean zI = i();
        q();
        t tVar = this.f34992a;
        if (!zI) {
            tVar.a(this, eVar);
            return;
        }
        p pVar = this.f35011v;
        pVar.f34921z = 100;
        pVar.f34920y = true;
        tVar.a(this, eVar);
        pVar.s();
    }

    public final void a() {
        this.f34994c.set(null);
        this.f35000k.f35553e.T();
        this.f35001l.f35553e.T();
        x.h0 h0Var = this.f34996e;
        if (h0Var.f36900a.g()) {
            return;
        }
        c1.o oVar = this.f35010u;
        try {
            oVar.g(h0Var, this.f35011v.z());
            oVar.b();
        } finally {
            oVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r21, boolean r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            x.e0 r2 = r0.g
            java.lang.Object r2 = r2.g(r1)
            if (r2 == 0) goto L9c
            boolean r3 = r2 instanceof x.f0
            u0.n0 r4 = u0.n0.f34877a
            x.f0 r5 = r0.f34998h
            x.f0 r6 = r0.f34999i
            x.e0 r7 = r0.f35002m
            if (r3 == 0) goto L81
            x.f0 r2 = (x.f0) r2
            java.lang.Object[] r3 = r2.f36883b
            long[] r2 = r2.f36882a
            int r8 = r2.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L9c
            r10 = 0
        L24:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L7c
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L3e:
            if (r15 >= r13) goto L79
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L70
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r3[r16]
            r9 = r16
            u0.m1 r9 = (u0.m1) r9
            boolean r16 = com.bumptech.glide.f.y(r7, r1, r9)
            if (r16 != 0) goto L70
            r16 = r14
            u0.n0 r14 = r9.c(r1)
            if (r14 == r4) goto L72
            x.e0 r14 = r9.g
            if (r14 == 0) goto L6c
            if (r22 != 0) goto L6c
            r6.a(r9)
            goto L72
        L6c:
            r5.a(r9)
            goto L72
        L70:
            r16 = r14
        L72:
            long r11 = r11 >> r16
            int r15 = r15 + 1
            r14 = r16
            goto L3e
        L79:
            r9 = r14
            if (r13 != r9) goto L9c
        L7c:
            if (r10 == r8) goto L9c
            int r10 = r10 + 1
            goto L24
        L81:
            u0.m1 r2 = (u0.m1) r2
            boolean r3 = com.bumptech.glide.f.y(r7, r1, r2)
            if (r3 != 0) goto L9c
            u0.n0 r1 = r2.c(r1)
            if (r1 == r4) goto L9c
            x.e0 r1 = r2.g
            if (r1 == 0) goto L99
            if (r22 != 0) goto L99
            r6.a(r2)
            return
        L99:
            r5.a(r2)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.w.b(java.lang.Object, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:224:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.util.Set r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.w.c(java.util.Set, boolean):void");
    }

    public final void d() {
        synchronized (this.f34995d) {
            try {
                e(this.f35000k);
                o();
            } catch (Throwable th2) {
                try {
                    if (!this.f34996e.f36900a.g()) {
                        c1.o oVar = this.f35010u;
                        try {
                            oVar.g(this.f34996e, this.f35011v.z());
                            oVar.b();
                            oVar.a();
                        } catch (Throwable th3) {
                            oVar.a();
                            throw th3;
                        }
                    }
                    throw th2;
                } catch (Throwable th4) {
                    a();
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(v0.a r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.w.e(v0.a):void");
    }

    public final void f() {
        synchronized (this.f34995d) {
            try {
                if (this.f35001l.f35553e.W()) {
                    e(this.f35001l);
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f34996e.f36900a.g()) {
                        c1.o oVar = this.f35010u;
                        try {
                            oVar.g(this.f34996e, this.f35011v.z());
                            oVar.b();
                            oVar.a();
                        } catch (Throwable th3) {
                            oVar.a();
                            throw th3;
                        }
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    public final void g() {
        c1.o oVar;
        synchronized (this.f34995d) {
            try {
                this.f35011v.f34917v = null;
                if (!this.f34996e.f36900a.g()) {
                    oVar = this.f35010u;
                    try {
                        oVar.g(this.f34996e, this.f35011v.z());
                        oVar.b();
                        oVar.a();
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f34996e.f36900a.g()) {
                        oVar = this.f35010u;
                        try {
                            oVar.g(this.f34996e, this.f35011v.z());
                            oVar.b();
                            oVar.a();
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.w.h():void");
    }

    public final boolean i() {
        boolean z3;
        synchronized (this.f34995d) {
            z3 = true;
            if (this.f35012w != 1) {
                z3 = false;
            }
            if (z3) {
                this.f35012w = 0;
            }
        }
        return z3;
    }

    public final void j(mk.e eVar) {
        try {
            synchronized (this.f34995d) {
                n();
                x.e0 e0Var = this.f35003n;
                this.f35003n = com.bumptech.glide.f.i();
                try {
                    p pVar = this.f35011v;
                    z1 z1Var = this.f35005p;
                    if (!pVar.f34902e.f35553e.V()) {
                        r.a("Expected applyChanges() to have been called");
                    }
                    pVar.P = z1Var;
                    try {
                        pVar.n(e0Var, eVar);
                    } finally {
                        pVar.P = null;
                    }
                } catch (Throwable th2) {
                    this.f35003n = e0Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.f34996e.f36900a.g()) {
                    c1.o oVar = this.f35010u;
                    try {
                        oVar.g(this.f34996e, this.f35011v.z());
                        oVar.b();
                        oVar.a();
                    } catch (Throwable th4) {
                        oVar.a();
                        throw th4;
                    }
                }
                throw th3;
            } catch (Throwable th5) {
                a();
                throw th5;
            }
        }
    }

    public final f1 k(boolean z3, mk.e eVar) {
        if (this.f35006q != null) {
            j1.b("A pausable composition is in progress");
        }
        f1 f1Var = new f1(this, this.f34992a, this.f35011v, this.f34996e, eVar, z3, this.f34993b, this.f34995d);
        this.f35006q = f1Var;
        return f1Var;
    }

    public final void l() {
        synchronized (this.f34995d) {
            try {
                if (this.f35006q != null) {
                    j1.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z3 = this.f34997f.f34744b > 0;
                if (z3 || !this.f34996e.f36900a.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        c1.o oVar = this.f35010u;
                        try {
                            oVar.g(this.f34996e, this.f35011v.z());
                            if (z3) {
                                e2 e2VarF = this.f34997f.f();
                                try {
                                    e2VarF.n(e2VarF.f34796t, new d0.d1(6, this.f35010u, e2VarF));
                                    e2VarF.e(true);
                                    this.f34993b.n();
                                    oVar.c();
                                } catch (Throwable th2) {
                                    e2VarF.e(false);
                                    throw th2;
                                }
                            }
                            oVar.b();
                            oVar.a();
                        } catch (Throwable th3) {
                            oVar.a();
                            throw th3;
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                this.g.a();
                this.j.a();
                this.f35003n.a();
                this.f35000k.f35553e.T();
                this.f35001l.f35553e.T();
                p pVar = this.f35011v;
                pVar.E.clear();
                pVar.f34914s.clear();
                pVar.f34902e.f35553e.T();
                pVar.f34917v = null;
                this.f35012w = 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void m() {
        synchronized (this.f34995d) {
            try {
                if (this.f35011v.F) {
                    j1.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f35012w != 3) {
                    this.f35012w = 3;
                    v0.a aVar = this.f35011v.L;
                    if (aVar != null) {
                        e(aVar);
                    }
                    boolean z3 = this.f34997f.f34744b > 0;
                    if (z3 || !this.f34996e.f36900a.g()) {
                        c1.o oVar = this.f35010u;
                        try {
                            oVar.g(this.f34996e, this.f35011v.z());
                            if (z3) {
                                e2 e2VarF = this.f34997f.f();
                                try {
                                    e2VarF.n(e2VarF.f34796t, new bl.z(8, this.f35010u));
                                    e2VarF.H();
                                    e2VarF.e(true);
                                    this.f34993b.q();
                                    this.f34993b.n();
                                    oVar.c();
                                } catch (Throwable th2) {
                                    e2VarF.e(false);
                                    throw th2;
                                }
                            }
                            oVar.b();
                            oVar.a();
                        } catch (Throwable th3) {
                            oVar.a();
                            throw th3;
                        }
                    }
                    p pVar = this.f35011v;
                    pVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        pVar.f34899b.u(pVar);
                        pVar.E.clear();
                        pVar.f34914s.clear();
                        pVar.f34902e.f35553e.T();
                        pVar.f34917v = null;
                        pVar.f34898a.q();
                        Trace.endSection();
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        this.f34992a.v(this);
    }

    public final void n() {
        Object obj = q.f34933b;
        AtomicReference atomicReference = this.f34994c;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                r.b("pending composition has not been applied");
                throw new ac.m();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                r.b("corrupt pendingModifications drain: " + atomicReference);
                throw new ac.m();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.f34994c;
        Object andSet = atomicReference.getAndSet(null);
        if (nk.k.a(andSet, q.f34933b)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet != null) {
            r.b("corrupt pendingModifications drain: " + atomicReference);
            throw new ac.m();
        }
        if (this.f35006q == null) {
            r.a("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    public final void p() {
        zj.u uVar = zj.u.f38319a;
        AtomicReference atomicReference = this.f34994c;
        Object andSet = atomicReference.getAndSet(uVar);
        if (nk.k.a(andSet, q.f34933b) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            r.b("corrupt pendingModifications drain: " + atomicReference);
            throw new ac.m();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void q() {
        int i4 = this.f35012w;
        if (i4 != 0) {
            j1.b(i4 != 1 ? i4 != 2 ? i4 != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.f35006q == null) {
            return;
        }
        j1.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        x.h0 h0Var = this.f34996e;
        p pVar = this.f35011v;
        if (arrayList.size() > 0) {
            ((t0) ((yj.i) arrayList.get(0)).f37638a).getClass();
            throw null;
        }
        try {
            pVar.getClass();
            try {
                pVar.B(arrayList);
                pVar.i();
            } catch (Throwable th2) {
                pVar.a();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!h0Var.f36900a.g()) {
                    c1.o oVar = this.f35010u;
                    try {
                        oVar.g(h0Var, pVar.z());
                        oVar.b();
                        oVar.a();
                    } catch (Throwable th4) {
                        oVar.a();
                        throw th4;
                    }
                }
                throw th3;
            } catch (Throwable th5) {
                a();
                throw th5;
            }
        }
    }

    public final n0 s(m1 m1Var, Object obj) {
        w wVar;
        int i4 = m1Var.f34868b;
        if ((i4 & 2) != 0) {
            m1Var.f34868b = i4 | 4;
        }
        a aVar = m1Var.f34869c;
        if (aVar == null || !aVar.a()) {
            return n0.f34877a;
        }
        if (this.f34997f.g(aVar)) {
            if (m1Var.f34870d == null) {
                return n0.f34877a;
            }
            n0 n0VarU = u(m1Var, aVar, obj);
            if (n0VarU != n0.f34877a) {
                this.f35009t.l();
            }
            return n0VarU;
        }
        synchronized (this.f34995d) {
            wVar = this.f35007r;
        }
        if (wVar != null) {
            p pVar = wVar.f35011v;
            if (pVar.F && pVar.b0(m1Var, obj)) {
                return n0.f34880d;
            }
        }
        return n0.f34877a;
    }

    public final void t() {
        w wVar;
        synchronized (this.f34995d) {
            try {
                for (Object obj : this.f34997f.f34745c) {
                    m1 m1Var = obj instanceof m1 ? (m1) obj : null;
                    if (m1Var != null && (wVar = m1Var.f34867a) != null) {
                        wVar.s(m1Var, null);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5 A[Catch: all -> 0x0042, EDGE_INSN: B:80:0x00d5->B:65:0x00d5 BREAK  A[LOOP:0: B:47:0x008c->B:61:0x00cd], EDGE_INSN: B:81:0x00d5->B:65:0x00d5 BREAK  A[LOOP:0: B:47:0x008c->B:61:0x00cd], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:39:0x006b, B:40:0x0074, B:42:0x007c, B:44:0x0080, B:47:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b2, B:57:0x00c1, B:61:0x00cd, B:62:0x00d0, B:65:0x00d5), top: B:78:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final u0.n0 u(u0.m1 r21, u0.a r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.w.u(u0.m1, u0.a, java.lang.Object):u0.n0");
    }

    public final void v(Object obj) {
        Object objG = this.g.g(obj);
        if (objG == null) {
            return;
        }
        boolean z3 = objG instanceof x.f0;
        x.e0 e0Var = this.f35002m;
        if (!z3) {
            m1 m1Var = (m1) objG;
            if (m1Var.c(obj) == n0.f34880d) {
                com.bumptech.glide.f.c(e0Var, obj, m1Var);
                return;
            }
            return;
        }
        x.f0 f0Var = (x.f0) objG;
        Object[] objArr = f0Var.f36883b;
        long[] jArr = f0Var.f36882a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i4 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        m1 m1Var2 = (m1) objArr[(i4 << 3) + i11];
                        if (m1Var2.c(obj) == n0.f34880d) {
                            com.bumptech.glide.f.c(e0Var, obj, m1Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i4 == length) {
                return;
            } else {
                i4++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof w0.h
            x.e0 r3 = r0.j
            x.e0 r4 = r0.g
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L5e
            w0.h r1 = (w0.h) r1
            x.f0 r1 = r1.f36409a
            java.lang.Object[] r2 = r1.f36883b
            long[] r1 = r1.f36882a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7b
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L59
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L57
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L53
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            boolean r15 = r4.c(r14)
            if (r15 != 0) goto L52
            boolean r14 = r3.c(r14)
            if (r14 == 0) goto L53
        L52:
            return r6
        L53:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L57:
            if (r11 != r12) goto L7b
        L59:
            if (r8 == r7) goto L7b
            int r8 = r8 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r7 = r4.c(r2)
            if (r7 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r6
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.w.w(java.util.Set):boolean");
    }

    public final boolean x() {
        synchronized (this.f34995d) {
            f1 f1Var = this.f35006q;
            boolean zW = false;
            if (f1Var != null && (f1Var.f34807h.get() != g1.f34817e || f1Var.f34808i != c1.n.b())) {
                AtomicReference atomicReference = f1Var.f34807h;
                g1 g1Var = g1.f34818f;
                g1 g1Var2 = g1.f34816d;
                while (!atomicReference.compareAndSet(g1Var, g1Var2) && atomicReference.get() == g1Var) {
                }
                ((x.t) f1Var.f34810l.f25416b).a(9);
                return false;
            }
            n();
            try {
                x.e0 e0Var = this.f35003n;
                this.f35003n = com.bumptech.glide.f.i();
                try {
                    p pVar = this.f35011v;
                    z1 z1Var = this.f35005p;
                    v0.l0 l0Var = pVar.f34902e.f35553e;
                    if (!l0Var.V()) {
                        r.a("Expected applyChanges() to have been called");
                    }
                    if (e0Var.f36877e > 0 || !pVar.f34914s.isEmpty()) {
                        pVar.P = z1Var;
                        try {
                            pVar.n(e0Var, null);
                            pVar.P = null;
                            zW = l0Var.W();
                        } catch (Throwable th2) {
                            pVar.P = null;
                            throw th2;
                        }
                    }
                    if (!zW) {
                        o();
                    }
                    return zW;
                } catch (Throwable th3) {
                    this.f35003n = e0Var;
                    throw th3;
                }
            } catch (Throwable th4) {
                try {
                    if (!this.f34996e.f36900a.g()) {
                        c1.o oVar = this.f35010u;
                        try {
                            oVar.g(this.f34996e, this.f35011v.z());
                            oVar.b();
                            oVar.a();
                        } catch (Throwable th5) {
                            oVar.a();
                            throw th5;
                        }
                    }
                    throw th4;
                } catch (Throwable th6) {
                    a();
                    throw th6;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Set[]] */
    public final void y(w0.h hVar) {
        w0.h hVar2;
        while (true) {
            Object obj = this.f34994c.get();
            if (obj == null || obj.equals(q.f34933b)) {
                hVar2 = hVar;
            } else if (obj instanceof Set) {
                hVar2 = new Set[]{obj, hVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f34994c).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? CopyOf = Arrays.copyOf(setArr, length + 1);
                CopyOf[length] = hVar;
                hVar2 = CopyOf;
            }
            AtomicReference atomicReference = this.f34994c;
            while (!atomicReference.compareAndSet(obj, hVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f34995d) {
                    o();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.w.z(java.lang.Object):void");
    }
}
