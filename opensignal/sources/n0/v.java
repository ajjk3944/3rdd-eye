package n0;

import com.google.android.gms.internal.measurement.b4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class v implements r {
    public final u.a0 B;
    public final u.b0 D;
    public final u.b0 E;
    public final u.a0 F;
    public final o0.a G;
    public final o0.a H;
    public final u.a0 I;
    public u.a0 J;
    public boolean K;
    public v L;
    public int M;
    public final h7.r1 N;
    public final al.g O;
    public final p P;
    public int Q;

    /* renamed from: a, reason: collision with root package name */
    public final s f17327a;

    /* renamed from: d, reason: collision with root package name */
    public final qm.c f17328d;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f17329g = new AtomicReference(null);

    /* renamed from: r, reason: collision with root package name */
    public final Object f17330r = new Object();

    /* renamed from: x, reason: collision with root package name */
    public final u.d0 f17331x;

    /* renamed from: y, reason: collision with root package name */
    public final s1 f17332y;

    public v(s sVar, qm.c cVar) {
        this.f17327a = sVar;
        this.f17328d = cVar;
        u.d0 d0Var = new u.d0(new u.b0());
        this.f17331x = d0Var;
        s1 s1Var = new s1();
        if (sVar.c()) {
            s1Var.G = new u.t();
        }
        if (sVar.e()) {
            s1Var.b();
        }
        this.f17332y = s1Var;
        this.B = b4.k();
        this.D = new u.b0();
        this.E = new u.b0();
        this.F = b4.k();
        o0.a aVar = new o0.a();
        this.G = aVar;
        o0.a aVar2 = new o0.a();
        this.H = aVar2;
        this.I = b4.k();
        this.J = b4.k();
        h7.r1 r1Var = new h7.r1(25, sVar);
        this.N = r1Var;
        this.O = new al.g();
        p pVar = new p(cVar, sVar, s1Var, d0Var, aVar, aVar2, r1Var, this);
        sVar.getClass();
        this.P = pVar;
        int i10 = g.f17175a;
    }

    public final void a() {
        this.f17329g.set(null);
        this.G.f18682a.a0();
        this.H.f18682a.a0();
        u.d0 d0Var = this.f17331x;
        if (d0Var.f23058a.g()) {
            return;
        }
        al.g gVar = this.O;
        try {
            gVar.o(d0Var, this.P.w());
            gVar.d();
        } finally {
            gVar.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r20, boolean r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            u.a0 r2 = r0.B
            java.lang.Object r2 = r2.g(r1)
            if (r2 == 0) goto L9a
            boolean r3 = r2 instanceof u.b0
            u.b0 r4 = r0.D
            u.b0 r5 = r0.E
            u.a0 r6 = r0.I
            if (r3 == 0) goto L7d
            u.b0 r2 = (u.b0) r2
            java.lang.Object[] r3 = r2.f23045b
            long[] r2 = r2.f23044a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L9a
            r9 = 0
        L22:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L3c:
            if (r14 >= r12) goto L75
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L6c
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r3[r15]
            n0.k1 r15 = (n0.k1) r15
            boolean r16 = com.google.android.gms.internal.measurement.b4.Y(r6, r1, r15)
            if (r16 != 0) goto L6c
            n0.n0 r8 = r15.c(r1)
            r17 = r13
            n0.n0 r13 = n0.n0.IGNORED
            if (r8 == r13) goto L6e
            u.a0 r8 = r15.f17210g
            if (r8 == 0) goto L68
            if (r21 != 0) goto L68
            r5.a(r15)
            goto L6e
        L68:
            r4.a(r15)
            goto L6e
        L6c:
            r17 = r13
        L6e:
            long r10 = r10 >> r17
            int r14 = r14 + 1
            r13 = r17
            goto L3c
        L75:
            r8 = r13
            if (r12 != r8) goto L9a
        L78:
            if (r9 == r7) goto L9a
            int r9 = r9 + 1
            goto L22
        L7d:
            n0.k1 r2 = (n0.k1) r2
            boolean r3 = com.google.android.gms.internal.measurement.b4.Y(r6, r1, r2)
            if (r3 != 0) goto L9a
            n0.n0 r1 = r2.c(r1)
            n0.n0 r3 = n0.n0.IGNORED
            if (r1 == r3) goto L9a
            u.a0 r1 = r2.f17210g
            if (r1 == 0) goto L97
            if (r21 != 0) goto L97
            r5.a(r2)
            return
        L97:
            r4.a(r2)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.v.b(java.lang.Object, boolean):void");
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
        throw new UnsupportedOperationException("Method not decompiled: n0.v.c(java.util.Set, boolean):void");
    }

    public final void d() {
        synchronized (this.f17330r) {
            try {
                e(this.G);
                k();
            } catch (Throwable th2) {
                try {
                    if (!this.f17331x.f23058a.g()) {
                        al.g gVar = this.O;
                        try {
                            gVar.o(this.f17331x, this.P.w());
                            gVar.d();
                            gVar.c();
                        } catch (Throwable th3) {
                            gVar.c();
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

    /* JADX WARN: Removed duplicated region for block: B:117:0x01d3 A[Catch: all -> 0x01d7, TRY_LEAVE, TryCatch #5 {all -> 0x01d7, blocks: (B:115:0x01cb, B:117:0x01d3), top: B:135:0x01cb }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(o0.a r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.v.e(o0.a):void");
    }

    public final void f() {
        synchronized (this.f17330r) {
            try {
                if (this.H.f18682a.d0()) {
                    e(this.H);
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f17331x.f23058a.g()) {
                        al.g gVar = this.O;
                        try {
                            gVar.o(this.f17331x, this.P.w());
                            gVar.d();
                            gVar.c();
                        } catch (Throwable th3) {
                            gVar.c();
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
        al.g gVar;
        synchronized (this.f17330r) {
            try {
                this.P.f17273v = null;
                if (!this.f17331x.f23058a.g()) {
                    gVar = this.O;
                    try {
                        gVar.o(this.f17331x, this.P.w());
                        gVar.d();
                        gVar.c();
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f17331x.f23058a.g()) {
                        gVar = this.O;
                        try {
                            gVar.o(this.f17331x, this.P.w());
                            gVar.d();
                            gVar.c();
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
        throw new UnsupportedOperationException("Method not decompiled: n0.v.h():void");
    }

    public final void i(ar.n nVar) {
        try {
            synchronized (this.f17330r) {
                j();
                u.a0 a0Var = this.J;
                this.J = b4.k();
                try {
                    p pVar = this.P;
                    if (!pVar.f17258e.f18682a.c0()) {
                        q.c("Expected applyChanges() to have been called");
                    }
                    pVar.m(a0Var, nVar);
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f17331x.f23058a.g()) {
                    al.g gVar = this.O;
                    try {
                        gVar.o(this.f17331x, this.P.w());
                        gVar.d();
                        gVar.c();
                    } catch (Throwable th3) {
                        gVar.c();
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

    public final void j() {
        Object obj = w.f17355a;
        AtomicReference atomicReference = this.f17329g;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                q.d("pending composition has not been applied");
                throw new bf.n();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                q.d("corrupt pendingModifications drain: " + atomicReference);
                throw new bf.n();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void k() {
        AtomicReference atomicReference = this.f17329g;
        Object andSet = atomicReference.getAndSet(null);
        if (br.l.a(andSet, w.f17355a)) {
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
        if (andSet == null) {
            q.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new bf.n();
        }
        q.d("corrupt pendingModifications drain: " + atomicReference);
        throw new bf.n();
    }

    public final void l() {
        mq.y yVar = mq.y.f16947a;
        AtomicReference atomicReference = this.f17329g;
        Object andSet = atomicReference.getAndSet(yVar);
        if (br.l.a(andSet, w.f17355a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            q.d("corrupt pendingModifications drain: " + atomicReference);
            throw new bf.n();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void m(ArrayList arrayList) {
        u.d0 d0Var = this.f17331x;
        p pVar = this.P;
        if (arrayList.size() > 0) {
            ((w0) ((lq.l) arrayList.get(0)).f15571a).getClass();
            throw null;
        }
        try {
            pVar.getClass();
            try {
                pVar.y(arrayList);
                pVar.h();
            } catch (Throwable th2) {
                pVar.a();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!d0Var.f23058a.g()) {
                    al.g gVar = this.O;
                    try {
                        gVar.o(d0Var, pVar.w());
                        gVar.d();
                        gVar.c();
                    } catch (Throwable th4) {
                        gVar.c();
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

    public final n0 n(k1 k1Var, Object obj) {
        v vVar;
        int i10 = k1Var.f17205b;
        if ((i10 & 2) != 0) {
            k1Var.f17205b = i10 | 4;
        }
        a aVar = k1Var.f17206c;
        if (aVar == null || !aVar.a()) {
            return n0.IGNORED;
        }
        if (this.f17332y.e(aVar)) {
            if (k1Var.f17207d == null) {
                return n0.IGNORED;
            }
            n0 n0VarP = p(k1Var, aVar, obj);
            if (n0VarP != n0.IGNORED) {
                this.N.V();
            }
            return n0VarP;
        }
        synchronized (this.f17330r) {
            vVar = this.L;
        }
        if (vVar != null) {
            p pVar = vVar.P;
            if (pVar.F && pVar.W(k1Var, obj)) {
                return n0.IMMINENT;
            }
        }
        return n0.IGNORED;
    }

    public final void o() {
        v vVar;
        synchronized (this.f17330r) {
            try {
                for (Object obj : this.f17332y.f17312g) {
                    k1 k1Var = obj instanceof k1 ? (k1) obj : null;
                    if (k1Var != null && (vVar = k1Var.f17204a) != null) {
                        vVar.n(k1Var, null);
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
    public final n0.n0 p(n0.k1 r21, n0.a r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.v.p(n0.k1, n0.a, java.lang.Object):n0.n0");
    }

    public final void q(Object obj) {
        Object objG = this.B.g(obj);
        if (objG == null) {
            return;
        }
        boolean z10 = objG instanceof u.b0;
        u.a0 a0Var = this.I;
        if (!z10) {
            k1 k1Var = (k1) objG;
            if (k1Var.c(obj) == n0.IMMINENT) {
                b4.c(a0Var, obj, k1Var);
                return;
            }
            return;
        }
        u.b0 b0Var = (u.b0) objG;
        Object[] objArr = b0Var.f23045b;
        long[] jArr = b0Var.f23044a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        k1 k1Var2 = (k1) objArr[(i10 << 3) + i12];
                        if (k1Var2.c(obj) == n0.IMMINENT) {
                            b4.c(a0Var, obj, k1Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
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
    public final boolean r(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof p0.h
            u.a0 r3 = r0.F
            u.a0 r4 = r0.B
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L5e
            p0.h r1 = (p0.h) r1
            u.b0 r1 = r1.f20237a
            java.lang.Object[] r2 = r1.f23045b
            long[] r1 = r1.f23044a
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
        throw new UnsupportedOperationException("Method not decompiled: n0.v.r(java.util.Set):boolean");
    }

    public final boolean s() {
        boolean zD0;
        synchronized (this.f17330r) {
            j();
            try {
                u.a0 a0Var = this.J;
                this.J = b4.k();
                try {
                    p pVar = this.P;
                    o0.h0 h0Var = pVar.f17258e.f18682a;
                    if (!h0Var.c0()) {
                        q.c("Expected applyChanges() to have been called");
                    }
                    if (a0Var.f23041e > 0 || !pVar.f17270s.isEmpty()) {
                        pVar.m(a0Var, null);
                        zD0 = h0Var.d0();
                    } else {
                        zD0 = false;
                    }
                    if (!zD0) {
                        k();
                    }
                } catch (Throwable th2) {
                    this.J = a0Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f17331x.f23058a.g()) {
                        al.g gVar = this.O;
                        try {
                            gVar.o(this.f17331x, this.P.w());
                            gVar.d();
                            gVar.c();
                        } catch (Throwable th4) {
                            gVar.c();
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
        return zD0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Set[]] */
    public final void t(p0.h hVar) {
        p0.h hVar2;
        while (true) {
            Object obj = this.f17329g.get();
            if (obj == null || obj.equals(w.f17355a)) {
                hVar2 = hVar;
            } else if (obj instanceof Set) {
                hVar2 = new Set[]{obj, hVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f17329g).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? CopyOf = Arrays.copyOf(setArr, length + 1);
                CopyOf[length] = hVar;
                hVar2 = CopyOf;
            }
            AtomicReference atomicReference = this.f17329g;
            while (!atomicReference.compareAndSet(obj, hVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f17330r) {
                    k();
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
    public final void u(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.v.u(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f17330r
            monitor-enter(r0)
            r14.q(r15)     // Catch: java.lang.Throwable -> L4f
            u.a0 r1 = r14.F     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.g(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof u.b0     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            u.b0 r15 = (u.b0) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.f23045b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.f23044a     // Catch: java.lang.Throwable -> L4f
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
            n0.d0 r10 = (n0.d0) r10     // Catch: java.lang.Throwable -> L4f
            r14.q(r10)     // Catch: java.lang.Throwable -> L4f
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
            n0.d0 r15 = (n0.d0) r15     // Catch: java.lang.Throwable -> L4f
            r14.q(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.v.v(java.lang.Object):void");
    }
}
