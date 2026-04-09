package n0;

import android.os.Trace;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class p {
    public int A;
    public int B;
    public boolean C;
    public final n D;
    public final ArrayList E;
    public boolean F;
    public r1 G;
    public s1 H;
    public v1 I;
    public boolean J;
    public f1 K;
    public o0.a L;
    public final o0.b M;
    public a N;
    public o0.c O;
    public final y0.b P;
    public final pq.h Q;
    public boolean R;
    public long S;
    public u T;

    /* renamed from: a, reason: collision with root package name */
    public final qm.c f17254a;

    /* renamed from: b, reason: collision with root package name */
    public final s f17255b;

    /* renamed from: c, reason: collision with root package name */
    public final s1 f17256c;

    /* renamed from: d, reason: collision with root package name */
    public final u.d0 f17257d;

    /* renamed from: e, reason: collision with root package name */
    public final o0.a f17258e;

    /* renamed from: f, reason: collision with root package name */
    public final o0.a f17259f;

    /* renamed from: g, reason: collision with root package name */
    public final h7.r1 f17260g;

    /* renamed from: h, reason: collision with root package name */
    public final v f17261h;
    public e1 j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f17263l;

    /* renamed from: m, reason: collision with root package name */
    public int f17264m;

    /* renamed from: o, reason: collision with root package name */
    public int[] f17266o;

    /* renamed from: p, reason: collision with root package name */
    public u.r f17267p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17268q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f17269r;

    /* renamed from: v, reason: collision with root package name */
    public u.t f17273v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f17274w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f17276y;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f17262i = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final l0 f17265n = new l0();

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f17270s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final l0 f17271t = new l0();

    /* renamed from: u, reason: collision with root package name */
    public f1 f17272u = v0.h.f23748r;

    /* renamed from: x, reason: collision with root package name */
    public final l0 f17275x = new l0();

    /* renamed from: z, reason: collision with root package name */
    public int f17277z = -1;

    public p(qm.c cVar, s sVar, s1 s1Var, u.d0 d0Var, o0.a aVar, o0.a aVar2, h7.r1 r1Var, v vVar) {
        this.f17254a = cVar;
        this.f17255b = sVar;
        this.f17256c = s1Var;
        this.f17257d = d0Var;
        this.f17258e = aVar;
        this.f17259f = aVar2;
        this.f17260g = r1Var;
        this.f17261h = vVar;
        this.C = sVar.e() || sVar.c();
        this.D = new n(0, this);
        this.E = new ArrayList();
        r1 r1VarC = s1Var.c();
        r1VarC.c();
        this.G = r1VarC;
        s1 s1Var2 = new s1();
        if (sVar.e()) {
            s1Var2.b();
        }
        if (sVar.c()) {
            s1Var2.G = new u.t();
        }
        this.H = s1Var2;
        v1 v1VarD = s1Var2.d();
        v1VarD.e(true);
        this.I = v1VarD;
        this.M = new o0.b(this, aVar);
        r1 r1VarC2 = this.H.c();
        try {
            a aVarA = r1VarC2.a(0);
            r1VarC2.c();
            this.N = aVarA;
            this.O = new o0.c();
            this.P = new y0.b(this);
            pq.h hVarH = sVar.h();
            pq.h hVarW = w();
            this.Q = hVarH.i0(hVarW == null ? pq.i.f20621a : hVarW);
        } catch (Throwable th2) {
            r1VarC2.c();
            throw th2;
        }
    }

    public static final int J(p pVar, int i10, boolean z10, int i11) {
        r1 r1Var = pVar.G;
        if (r1Var.j(i10)) {
            int i12 = r1Var.i(i10);
            Object objP = r1Var.p(r1Var.f17298b, i10);
            if (i12 == 206 && br.l.a(objP, q.f17286e)) {
                r1Var.h(i10, 0);
                return r1Var.o(i10);
            }
            if (!r1Var.l(i10)) {
                return r1Var.o(i10);
            }
        } else if (r1Var.d(i10)) {
            int i13 = r1Var.f17298b[(i10 * 5) + 3] + i10;
            int iJ = 0;
            for (int i14 = i10 + 1; i14 < i13; i14 += r1Var.f17298b[(i14 * 5) + 3]) {
                boolean zL = r1Var.l(i14);
                if (zL) {
                    pVar.M.c();
                    o0.b bVar = pVar.M;
                    Object objN = r1Var.n(i14);
                    bVar.c();
                    bVar.f18691h.add(objN);
                }
                iJ += J(pVar, i14, zL || z10, zL ? 0 : i11 + iJ);
                if (zL) {
                    pVar.M.c();
                    pVar.M.a();
                }
            }
            if (!r1Var.l(i10)) {
                return iJ;
            }
        } else if (!r1Var.l(i10)) {
            return r1Var.o(i10);
        }
        return 1;
    }

    public final Object A() {
        boolean z10 = this.R;
        t0 t0Var = j.f17190a;
        if (!z10) {
            Object objM = this.G.m();
            if (!this.f17276y || (objM instanceof m)) {
                return objM;
            }
        } else if (this.f17269r) {
            q.c("A call to createNode(), emitNode() or useNode() expected");
            return t0Var;
        }
        return t0Var;
    }

    public final List B() {
        s sVar = this.f17255b;
        r rVarG = sVar.g();
        v vVar = rVarG != null ? (v) rVarG : null;
        if (vVar != null) {
            s1 s1Var = vVar.f17332y;
            r1 r1VarC = s1Var.c();
            try {
                Integer numM = i4.m(r1VarC, sVar, 0, r1VarC.f17299c);
                if (numM != null) {
                    try {
                        return i4.J(s1Var.c(), numM.intValue(), 0);
                    } finally {
                    }
                }
            } finally {
            }
        }
        return mq.w.f16945a;
    }

    public final int C(int i10) {
        int iQ = this.G.q(i10) + 1;
        int i11 = 0;
        while (iQ < i10) {
            if (!this.G.k(iQ)) {
                i11++;
            }
            iQ += u1.a(this.G.f17298b, iQ);
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:18:0x0038, B:21:0x0040, B:23:0x0048, B:25:0x004e, B:26:0x0052, B:27:0x0053, B:29:0x0059, B:22:0x0044), top: B:34:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D(n0.v r9, n0.v r10, java.lang.Integer r11, java.util.List r12, ar.a r13) {
        /*
            r8 = this;
            boolean r0 = r8.F
            int r1 = r8.k
            r2 = 1
            r8.F = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.k = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            lq.l r6 = (lq.l) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.f15571a     // Catch: java.lang.Throwable -> L24
            n0.k1 r7 = (n0.k1) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.f15572d     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.W(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L62
        L26:
            r8.W(r7, r5)     // Catch: java.lang.Throwable -> L24
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            if (r9 == 0) goto L59
            if (r11 == 0) goto L35
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L24
            goto L36
        L35:
            r11 = -1
        L36:
            if (r10 == 0) goto L53
            boolean r12 = r10.equals(r9)     // Catch: java.lang.Throwable -> L24
            if (r12 != 0) goto L53
            if (r11 < 0) goto L53
            r9.L = r10     // Catch: java.lang.Throwable -> L24
            r9.M = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.c()     // Catch: java.lang.Throwable -> L4d
            r9.L = r5     // Catch: java.lang.Throwable -> L24
            r9.M = r2     // Catch: java.lang.Throwable -> L24
            goto L57
        L4d:
            r10 = move-exception
            r9.L = r5     // Catch: java.lang.Throwable -> L24
            r9.M = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L53:
            java.lang.Object r10 = r13.c()     // Catch: java.lang.Throwable -> L24
        L57:
            if (r10 != 0) goto L5d
        L59:
            java.lang.Object r10 = r13.c()     // Catch: java.lang.Throwable -> L24
        L5d:
            r8.F = r0
            r8.k = r1
            return r10
        L62:
            r8.F = r0
            r8.k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.p.D(n0.v, n0.v, java.lang.Integer, java.util.List, ar.a):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E() {
        /*
            Method dump skipped, instructions count: 882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.p.E():void");
    }

    public final void F() {
        int i10;
        int i11 = this.G.f17303g;
        boolean zL = this.G.l(i11);
        o0.b bVar = this.M;
        if (zL) {
            bVar.c();
            Object objN = this.G.n(i11);
            bVar.c();
            bVar.f18691h.add(objN);
        }
        J(this, i11, zL, 0);
        bVar.c();
        if (zL) {
            bVar.a();
        }
        o0.b bVar2 = this.M;
        bVar2.d(false);
        l0 l0Var = bVar2.f18687d;
        p pVar = bVar2.f18684a;
        r1 r1Var = pVar.G;
        if (r1Var.f17299c > 0 && l0Var.a(-2) != (i10 = r1Var.f17305i)) {
            if (!bVar2.f18686c && bVar2.f18688e) {
                bVar2.d(false);
                bVar2.f18685b.f18682a.e0(o0.p.f18719d);
                bVar2.f18686c = true;
            }
            if (i10 > 0) {
                a aVarA = r1Var.a(i10);
                l0Var.c(i10);
                bVar2.d(false);
                o0.h0 h0Var = bVar2.f18685b.f18682a;
                h0Var.e0(o0.o.f18718d);
                i4.G(h0Var, 0, aVarA);
                bVar2.f18686c = true;
            }
        }
        bVar2.f18685b.f18682a.e0(o0.w.f18730d);
        int i12 = bVar2.f18689f;
        r1 r1Var2 = pVar.G;
        bVar2.f18689f = r1Var2.f17298b[(r1Var2.f17303g * 5) + 3] + i12;
    }

    public final void G(f1 f1Var) {
        u.t tVar = this.f17273v;
        if (tVar == null) {
            tVar = new u.t();
            this.f17273v = tVar;
        }
        tVar.h(this.G.f17303g, f1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(int r7, int r8, int r9) {
        /*
            r6 = this;
            n0.r1 r0 = r6.G
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.q(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.q(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.q(r7)
            int r2 = r0.q(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.q(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.q(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.q(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.q(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.q(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.q(r9)
            int r1 = r0.q(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.l(r7)
            if (r1 == 0) goto L7a
            o0.b r1 = r6.M
            r1.a()
        L7a:
            int r7 = r0.q(r7)
            goto L6b
        L7f:
            r6.n(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.p.H(int, int, int):void");
    }

    public final Object I() {
        boolean z10 = this.R;
        t0 t0Var = j.f17190a;
        if (!z10) {
            Object objM = this.G.m();
            if (!this.f17276y || (objM instanceof m)) {
                return objM instanceof q1 ? ((q1) objM).f17291a : objM;
            }
        } else if (this.f17269r) {
            q.c("A call to createNode(), emitNode() or useNode() expected");
            return t0Var;
        }
        return t0Var;
    }

    public final boolean K(int i10, boolean z10) {
        return ((i10 & 1) == 0 && (this.R || this.f17276y)) || z10 || !x();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.p.L():void");
    }

    public final void M() {
        r1 r1Var = this.G;
        int i10 = r1Var.f17305i;
        this.f17263l = i10 >= 0 ? r1Var.f17298b[(i10 * 5) + 1] & 67108863 : 0;
        r1Var.t();
    }

    public final void N() {
        if (this.f17263l != 0) {
            q.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.R) {
            return;
        }
        k1 k1VarU = u();
        if (k1VarU != null) {
            int i10 = k1VarU.f17205b;
            if ((i10 & 128) == 0) {
                k1VarU.f17205b = i10 | 16;
            }
        }
        if (this.f17270s.isEmpty()) {
            M();
        } else {
            E();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Type inference failed for: r2v7, types: [n0.v1] */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [n0.v1] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, n0.t0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(int r27, n0.z0 r28, int r29, java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 929
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.p.O(int, n0.z0, int, java.lang.Object):void");
    }

    public final void P() {
        O(-127, null, 0, null);
    }

    public final void Q(int i10, z0 z0Var) {
        O(i10, z0Var, 0, null);
    }

    public final void R(Object obj, boolean z10) {
        if (z10) {
            r1 r1Var = this.G;
            if (r1Var.k <= 0) {
                if ((r1Var.f17298b[(r1Var.f17303g * 5) + 1] & 1073741824) == 0) {
                    g1.a("Expected a node group");
                }
                r1Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            o0.b bVar = this.M;
            bVar.getClass();
            bVar.d(false);
            o0.h0 h0Var = bVar.f18685b.f18682a;
            h0Var.e0(o0.c0.f18697d);
            i4.G(h0Var, 0, obj);
        }
        this.G.u();
    }

    public final void S(int i10) {
        int i11;
        int i12;
        if (this.j != null) {
            O(i10, null, 0, null);
            return;
        }
        if (this.f17269r) {
            q.c("A call to createNode(), emitNode() or useNode() expected");
        }
        this.S = Long.rotateLeft(Long.rotateLeft(this.S, 3) ^ i10, 3) ^ this.f17264m;
        this.f17264m++;
        r1 r1Var = this.G;
        boolean z10 = this.R;
        t0 t0Var = j.f17190a;
        if (z10) {
            r1Var.k++;
            this.I.O(i10, t0Var, t0Var, false);
            s(false, null);
            return;
        }
        if (r1Var.g() == i10 && ((i12 = r1Var.f17303g) >= r1Var.f17304h || (r1Var.f17298b[(i12 * 5) + 1] & 536870912) == 0)) {
            r1Var.u();
            s(false, null);
            return;
        }
        if (r1Var.k <= 0 && (i11 = r1Var.f17303g) != r1Var.f17304h) {
            int i13 = this.k;
            F();
            this.M.e(i13, r1Var.s());
            q.a(i11, r1Var.f17303g, this.f17270s);
        }
        r1Var.k++;
        this.R = true;
        this.K = null;
        if (this.I.f17353w) {
            v1 v1VarD = this.H.d();
            this.I = v1VarD;
            v1VarD.K();
            this.J = false;
            this.K = null;
        }
        v1 v1Var = this.I;
        v1Var.d();
        int i14 = v1Var.f17350t;
        v1Var.O(i10, t0Var, t0Var, false);
        this.N = v1Var.b(i14);
        s(false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n0.p T(int r7) {
        /*
            r6 = this;
            r6.S(r7)
            boolean r7 = r6.R
            h7.r1 r0 = r6.f17260g
            java.util.ArrayList r1 = r6.E
            n0.v r2 = r6.f17261h
            if (r7 == 0) goto L26
            n0.k1 r7 = new n0.k1
            r7.<init>(r2)
            r1.add(r7)
            r6.c0(r7)
            int r1 = r6.B
            r7.f17208e = r1
            int r1 = r7.f17205b
            r1 = r1 & (-17)
            r7.f17205b = r1
            r0.V()
            return r6
        L26:
            n0.r1 r7 = r6.G
            int r7 = r7.f17305i
            java.util.ArrayList r3 = r6.f17270s
            int r7 = n0.q.e(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            n0.m0 r7 = (n0.m0) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            n0.r1 r3 = r6.G
            java.lang.Object r3 = r3.m()
            n0.t0 r4 = n0.j.f17190a
            boolean r4 = br.l.a(r3, r4)
            if (r4 == 0) goto L51
            n0.k1 r3 = new n0.k1
            r3.<init>(r2)
            r6.c0(r3)
            goto L58
        L51:
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            br.l.c(r3, r2)
            n0.k1 r3 = (n0.k1) r3
        L58:
            r2 = 0
            r4 = 1
            if (r7 != 0) goto L70
            int r7 = r3.f17205b
            r5 = r7 & 64
            if (r5 == 0) goto L64
            r5 = r4
            goto L65
        L64:
            r5 = r2
        L65:
            if (r5 == 0) goto L6b
            r7 = r7 & (-65)
            r3.f17205b = r7
        L6b:
            if (r5 == 0) goto L6e
            goto L70
        L6e:
            r7 = r2
            goto L71
        L70:
            r7 = r4
        L71:
            int r5 = r3.f17205b
            if (r7 == 0) goto L78
            r7 = r5 | 8
            goto L7a
        L78:
            r7 = r5 & (-9)
        L7a:
            r3.f17205b = r7
            r1.add(r3)
            int r7 = r6.B
            r3.f17208e = r7
            int r7 = r3.f17205b
            r7 = r7 & (-17)
            r3.f17205b = r7
            r0.V()
            int r7 = r3.f17205b
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lb6
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.17E-43)
            r3.f17205b = r7
            o0.b r7 = r6.M
            o0.a r7 = r7.f18685b
            o0.h0 r7 = r7.f18682a
            o0.a0 r0 = o0.a0.f18683d
            r7.e0(r0)
            com.google.android.gms.internal.measurement.i4.G(r7, r2, r3)
            boolean r7 = r6.f17276y
            if (r7 != 0) goto Lb6
            int r7 = r3.f17205b
            r0 = r7 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lb6
            r6.f17276y = r4
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.f17205b = r7
        Lb6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.p.T(int):n0.p");
    }

    public final void U() {
        O(125, null, 2, null);
        this.f17269r = true;
    }

    public final void V() {
        this.f17264m = 0;
        this.G = this.f17256c.c();
        O(100, null, 0, null);
        s sVar = this.f17255b;
        sVar.getClass();
        sVar.getClass();
        v0.h hVarB = t.f17316a;
        this.f17275x.c(this.f17274w ? 1 : 0);
        this.f17274w = e(hVarB);
        this.K = null;
        if (!this.f17268q) {
            this.f17268q = sVar.d();
        }
        if (!this.C) {
            this.C = sVar.e();
        }
        if (this.C) {
            h2 h2Var = y0.c.f25615a;
            br.l.c(h2Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            hVarB = hVarB.b(h2Var, new i2(w()));
        }
        this.f17272u = hVarB;
        Set set = (Set) w.j(hVarB, y0.e.f25617a);
        if (set != null) {
            u uVar = this.T;
            if (uVar == null) {
                uVar = new u(this.f17261h);
                this.T = uVar;
            }
            set.add(uVar);
        }
        O(Long.hashCode(sVar.f()), null, 0, null);
    }

    public final boolean W(k1 k1Var, Object obj) {
        a aVar = k1Var.f17206c;
        if (aVar == null) {
            return false;
        }
        int iA = this.G.f17297a.a(aVar);
        if (!this.F || iA < this.G.f17303g) {
            return false;
        }
        ArrayList arrayList = this.f17270s;
        int iE = q.e(iA, arrayList);
        if (iE < 0) {
            int i10 = -(iE + 1);
            if (!(obj instanceof d0)) {
                obj = null;
            }
            arrayList.add(i10, new m0(k1Var, iA, obj));
            return true;
        }
        m0 m0Var = (m0) arrayList.get(iE);
        if (!(obj instanceof d0)) {
            m0Var.f17217c = null;
            return true;
        }
        Object obj2 = m0Var.f17217c;
        if (obj2 == null) {
            m0Var.f17217c = obj;
            return true;
        }
        if (obj2 instanceof u.b0) {
            ((u.b0) obj2).a(obj);
            return true;
        }
        int i11 = u.h0.f23073a;
        u.b0 b0Var = new u.b0(2);
        b0Var.i(obj2);
        b0Var.i(obj);
        m0Var.f17217c = b0Var;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(u.a0 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.ArrayList r2 = r0.f17270s
            int r3 = com.google.android.gms.internal.measurement.e5.z(r2)
        La:
            r4 = -1
            if (r4 >= r3) goto L2e
            java.lang.Object r4 = r2.get(r3)
            n0.m0 r4 = (n0.m0) r4
            n0.k1 r5 = r4.f17215a
            n0.a r5 = r5.f17206c
            if (r5 == 0) goto L28
            boolean r6 = r5.a()
            if (r6 == 0) goto L28
            int r6 = r4.f17216b
            int r5 = r5.f17127a
            if (r6 == r5) goto L2b
            r4.f17216b = r5
            goto L2b
        L28:
            r2.remove(r3)
        L2b:
            int r3 = r3 + (-1)
            goto La
        L2e:
            java.lang.Object[] r3 = r1.f23038b
            java.lang.Object[] r4 = r1.f23039c
            long[] r1 = r1.f23037a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L8b
            r7 = 0
        L3a:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L86
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L54:
            if (r12 >= r10) goto L84
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L80
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            java.lang.String r15 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            br.l.c(r14, r15)
            n0.k1 r14 = (n0.k1) r14
            n0.a r15 = r14.f17206c
            if (r15 == 0) goto L80
            int r15 = r15.f17127a
            n0.t0 r6 = n0.t0.f17320x
            if (r13 != r6) goto L78
            r13 = 0
        L78:
            n0.m0 r6 = new n0.m0
            r6.<init>(r14, r15, r13)
            r2.add(r6)
        L80:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L54
        L84:
            if (r10 != r11) goto L8b
        L86:
            if (r7 == r5) goto L8b
            int r7 = r7 + 1
            goto L3a
        L8b:
            androidx.media3.exoplayer.trackselection.d r1 = n0.q.f17287f
            mq.s.c0(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.p.X(u.a0):void");
    }

    public final void Y(int i10, int i11) {
        if (d0(i10) != i11) {
            if (i10 < 0) {
                u.r rVar = this.f17267p;
                if (rVar == null) {
                    rVar = new u.r();
                    this.f17267p = rVar;
                }
                rVar.f(i10, i11);
                return;
            }
            int[] iArr = this.f17266o;
            if (iArr == null) {
                int i12 = this.G.f17299c;
                int[] iArr2 = new int[i12];
                Arrays.fill(iArr2, 0, i12, -1);
                this.f17266o = iArr2;
                iArr = iArr2;
            }
            iArr[i10] = i11;
        }
    }

    public final void Z(int i10, int i11) {
        int iD0 = d0(i10);
        if (iD0 != i11) {
            int i12 = i11 - iD0;
            ArrayList arrayList = this.f17262i;
            int size = arrayList.size() - 1;
            while (i10 != -1) {
                int iD02 = d0(i10) + i12;
                Y(i10, iD02);
                int i13 = size;
                while (true) {
                    if (-1 < i13) {
                        e1 e1Var = (e1) arrayList.get(i13);
                        if (e1Var != null && e1Var.a(i10, iD02)) {
                            size = i13 - 1;
                            break;
                        }
                        i13--;
                    } else {
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.G.f17305i;
                } else if (this.G.l(i10)) {
                    return;
                } else {
                    i10 = this.G.q(i10);
                }
            }
        }
    }

    public final void a() {
        h();
        this.f17262i.clear();
        this.f17265n.f17214b = 0;
        this.f17271t.f17214b = 0;
        this.f17275x.f17214b = 0;
        this.f17273v = null;
        o0.c cVar = this.O;
        cVar.f18696b.a0();
        cVar.f18695a.a0();
        this.S = 0;
        this.A = 0;
        this.f17269r = false;
        this.R = false;
        this.f17276y = false;
        this.F = false;
        this.f17277z = -1;
        r1 r1Var = this.G;
        if (!r1Var.f17302f) {
            r1Var.c();
        }
        if (this.I.f17353w) {
            return;
        }
        t();
    }

    public final v0.h a0(f1 f1Var, v0.h hVar) {
        v0.h hVar2 = (v0.h) f1Var;
        hVar2.getClass();
        v0.g gVar = new v0.g(hVar2);
        gVar.putAll(hVar);
        v0.h hVarE = gVar.e();
        Q(204, q.f17285d);
        A();
        c0(hVarE);
        A();
        c0(hVar);
        o(false);
        return hVarE;
    }

    public final void b(ar.n nVar, Object obj) {
        if (this.R) {
            o0.h0 h0Var = this.O.f18695a;
            h0Var.e0(o0.d0.f18699d);
            i4.G(h0Var, 0, obj);
            br.l.c(nVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            br.b0.c(2, nVar);
            i4.G(h0Var, 1, nVar);
            return;
        }
        o0.b bVar = this.M;
        bVar.b();
        o0.h0 h0Var2 = bVar.f18685b.f18682a;
        h0Var2.e0(o0.d0.f18699d);
        br.l.c(nVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        br.b0.c(2, nVar);
        i4.H(h0Var2, 0, obj, 1, nVar);
    }

    public final void b0(Object obj) {
        int i10;
        r1 r1Var;
        int i11;
        v1 v1Var;
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            a aVarA = null;
            if (this.R) {
                v1 v1Var2 = this.I;
                int i12 = v1Var2.f17350t;
                if (i12 > v1Var2.f17352v + 1) {
                    int i13 = i12 - 1;
                    int iC = v1Var2.C(v1Var2.f17334b, i13);
                    while (true) {
                        i11 = i13;
                        i13 = iC;
                        v1Var = this.I;
                        if (i13 == v1Var.f17352v || i13 < 0) {
                            break;
                        } else {
                            iC = v1Var.C(v1Var.f17334b, i13);
                        }
                    }
                    aVarA = v1Var.b(i11);
                }
            } else {
                r1 r1Var2 = this.G;
                int i14 = r1Var2.f17303g;
                if (i14 > r1Var2.f17305i + 1) {
                    int i15 = i14 - 1;
                    int iQ = r1Var2.q(i15);
                    while (true) {
                        i10 = i15;
                        i15 = iQ;
                        r1Var = this.G;
                        if (i15 == r1Var.f17305i || i15 < 0) {
                            break;
                        } else {
                            iQ = r1Var.q(i15);
                        }
                    }
                    aVarA = r1Var.a(i10);
                }
            }
            q1 q1Var = new q1(p1Var, aVarA);
            if (this.R) {
                o0.h0 h0Var = this.M.f18685b.f18682a;
                h0Var.e0(o0.v.f18729d);
                i4.G(h0Var, 0, q1Var);
            }
            this.f17257d.add(obj);
            obj = q1Var;
        }
        c0(obj);
    }

    public final boolean c(int i10) {
        Object objA = A();
        if ((objA instanceof Integer) && i10 == ((Number) objA).intValue()) {
            return false;
        }
        c0(Integer.valueOf(i10));
        return true;
    }

    public final void c0(Object obj) {
        if (this.R) {
            v1 v1Var = this.I;
            if (v1Var.f17344n <= 0 || v1Var.f17341i == v1Var.k) {
                v1Var.D(obj);
                return;
            }
            u.t tVar = v1Var.f17349s;
            if (tVar == null) {
                tVar = new u.t();
            }
            v1Var.f17349s = tVar;
            int i10 = v1Var.f17352v;
            Object objB = tVar.b(i10);
            if (objB == null) {
                objB = new u.z();
                tVar.h(i10, objB);
            }
            ((u.z) objB).a(obj);
            return;
        }
        r1 r1Var = this.G;
        boolean z10 = r1Var.f17308n;
        o0.b bVar = this.M;
        if (!z10) {
            a aVarA = r1Var.a(r1Var.f17305i);
            o0.h0 h0Var = bVar.f18685b.f18682a;
            h0Var.e0(o0.e.f18700d);
            i4.H(h0Var, 0, aVarA, 1, obj);
            return;
        }
        int iC = (r1Var.f17306l - u1.c(r1Var.f17298b, r1Var.f17305i)) - 1;
        if (bVar.f18684a.G.f17305i - bVar.f18689f >= 0) {
            bVar.d(true);
            o0.h0 h0Var2 = bVar.f18685b.f18682a;
            h0Var2.e0(o0.q.f18723h);
            i4.G(h0Var2, 0, obj);
            h0Var2.f18708c[h0Var2.f18709d - h0Var2.f18706a[h0Var2.f18707b - 1].f18526b] = iC;
            return;
        }
        r1 r1Var2 = this.G;
        a aVarA2 = r1Var2.a(r1Var2.f17305i);
        o0.h0 h0Var3 = bVar.f18685b.f18682a;
        h0Var3.e0(o0.q.f18722g);
        i4.H(h0Var3, 0, obj, 1, aVarA2);
        h0Var3.f18708c[h0Var3.f18709d - h0Var3.f18706a[h0Var3.f18707b - 1].f18526b] = iC;
    }

    public final boolean d(long j) {
        Object objA = A();
        if ((objA instanceof Long) && j == ((Number) objA).longValue()) {
            return false;
        }
        c0(Long.valueOf(j));
        return true;
    }

    public final int d0(int i10) {
        int i11;
        if (i10 >= 0) {
            int[] iArr = this.f17266o;
            return (iArr == null || (i11 = iArr[i10]) < 0) ? this.G.o(i10) : i11;
        }
        u.r rVar = this.f17267p;
        if (rVar == null || rVar.c(i10) < 0) {
            return 0;
        }
        int iC = rVar.c(i10);
        if (iC >= 0) {
            return rVar.f23103c[iC];
        }
        v.a.e("Cannot find value for key " + i10);
        throw null;
    }

    public final boolean e(Object obj) {
        if (br.l.a(A(), obj)) {
            return false;
        }
        c0(obj);
        return true;
    }

    public final void e0() {
        if (!this.f17269r) {
            q.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f17269r = false;
        if (this.R) {
            q.c("useNode() called while inserting");
        }
        r1 r1Var = this.G;
        Object objN = r1Var.n(r1Var.f17305i);
        o0.b bVar = this.M;
        bVar.c();
        bVar.f18691h.add(objN);
        if (this.f17276y && (objN instanceof h)) {
            bVar.b();
            bVar.f18685b.f18682a.e0(o0.f0.f18703d);
        }
    }

    public final boolean f(boolean z10) {
        Object objA = A();
        if ((objA instanceof Boolean) && z10 == ((Boolean) objA).booleanValue()) {
            return false;
        }
        c0(Boolean.valueOf(z10));
        return true;
    }

    public final boolean g(Object obj) {
        if (A() == obj) {
            return false;
        }
        c0(obj);
        return true;
    }

    public final void h() {
        this.j = null;
        this.k = 0;
        this.f17263l = 0;
        this.S = 0L;
        this.f17269r = false;
        o0.b bVar = this.M;
        bVar.f18686c = false;
        bVar.f18687d.f17214b = 0;
        bVar.f18689f = 0;
        bVar.f18688e = true;
        bVar.f18690g = 0;
        bVar.f18691h.clear();
        bVar.f18692i = -1;
        bVar.j = -1;
        bVar.k = -1;
        bVar.f18693l = 0;
        this.E.clear();
        this.f17266o = null;
        this.f17267p = null;
    }

    public final Object i(androidx.compose.runtime.d dVar) {
        return w.j(k(), dVar);
    }

    public final void j(ar.a aVar) {
        if (!this.f17269r) {
            q.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f17269r = false;
        if (!this.R) {
            q.c("createNode() can only be called when inserting");
        }
        l0 l0Var = this.f17265n;
        int i10 = l0Var.f17213a[l0Var.f17214b - 1];
        v1 v1Var = this.I;
        a aVarB = v1Var.b(v1Var.f17352v);
        this.f17263l++;
        o0.c cVar = this.O;
        o0.h0 h0Var = cVar.f18695a;
        h0Var.e0(o0.q.f18720e);
        i4.G(h0Var, 0, aVar);
        h0Var.f18708c[h0Var.f18709d - h0Var.f18706a[h0Var.f18707b - 1].f18526b] = i10;
        i4.G(h0Var, 1, aVarB);
        o0.h0 h0Var2 = cVar.f18696b;
        h0Var2.e0(o0.q.f18721f);
        h0Var2.f18708c[h0Var2.f18709d - h0Var2.f18706a[h0Var2.f18707b - 1].f18526b] = i10;
        i4.G(h0Var2, 0, aVarB);
    }

    public final f1 k() {
        f1 f1Var;
        f1 f1Var2 = this.K;
        if (f1Var2 != null) {
            return f1Var2;
        }
        int iQ = this.G.f17305i;
        boolean z10 = this.R;
        z0 z0Var = q.f17284c;
        if (z10 && this.J) {
            int iC = this.I.f17352v;
            while (iC > 0) {
                v1 v1Var = this.I;
                if (v1Var.f17334b[v1Var.r(iC) * 5] == 202 && br.l.a(this.I.s(iC), z0Var)) {
                    Object objQ = this.I.q(iC);
                    br.l.c(objQ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    f1 f1Var3 = (f1) objQ;
                    this.K = f1Var3;
                    return f1Var3;
                }
                v1 v1Var2 = this.I;
                iC = v1Var2.C(v1Var2.f17334b, iC);
            }
        }
        if (this.G.f17299c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    r1 r1Var = this.G;
                    if (br.l.a(r1Var.p(r1Var.f17298b, iQ), z0Var)) {
                        u.t tVar = this.f17273v;
                        if (tVar == null || (f1Var = (f1) tVar.b(iQ)) == null) {
                            r1 r1Var2 = this.G;
                            Object objB = r1Var2.b(r1Var2.f17298b, iQ);
                            br.l.c(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                            f1Var = (f1) objB;
                        }
                        this.K = f1Var;
                        return f1Var;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        f1 f1Var4 = this.f17272u;
        this.K = f1Var4;
        return f1Var4;
    }

    public final List l() {
        boolean z10 = this.C;
        List list = mq.w.f16945a;
        if (!z10) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        v1 v1Var = this.I;
        arrayList.addAll(i4.i(v1Var, null, v1Var.f17350t, null));
        r1 r1Var = this.G;
        if (!r1Var.f17302f && r1Var.f17299c != 0) {
            y0.h hVar = new y0.h(r1Var);
            int iQ = r1Var.f17305i;
            Object objValueOf = Integer.valueOf(r1Var.f17306l - u1.c(r1Var.f17298b, iQ));
            while (iQ >= 0) {
                hVar.f(r1Var.f17297a.g(iQ), objValueOf);
                objValueOf = r1Var.a(iQ);
                iQ = r1Var.q(iQ);
            }
            list = hVar.f14495a;
        }
        arrayList.addAll(list);
        arrayList.addAll(B());
        return arrayList;
    }

    public final void m(u.a0 a0Var, ar.n nVar) {
        ArrayList arrayList = this.f17270s;
        if (this.F) {
            q.c("Reentrant composition is not supported");
        }
        this.f17260g.V();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(x0.l.k().g());
            this.f17273v = null;
            X(a0Var);
            this.k = 0;
            this.F = true;
            try {
                V();
                Object objA = A();
                if (objA != nVar && nVar != null) {
                    c0(nVar);
                }
                n nVar2 = this.D;
                p0.e eVarA = androidx.compose.runtime.c.a();
                try {
                    eVarA.b(nVar2);
                    z0 z0Var = q.f17282a;
                    if (nVar != null) {
                        Q(200, z0Var);
                        v0.i.c(this, nVar);
                        o(false);
                    } else if (!this.f17274w || objA == null || objA.equals(j.f17190a)) {
                        L();
                    } else {
                        Q(200, z0Var);
                        br.b0.c(2, objA);
                        v0.i.c(this, (ar.n) objA);
                        o(false);
                    }
                    eVarA.k(eVarA.f20232g - 1);
                    r();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.f17353w) {
                        q.c("Check failed");
                    }
                    t();
                } catch (Throwable th2) {
                    eVarA.k(eVarA.f20232g - 1);
                    throw th2;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void n(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        n(this.G.q(i10), i11);
        if (this.G.l(i10)) {
            Object objN = this.G.n(i10);
            o0.b bVar = this.M;
            bVar.c();
            bVar.f18691h.add(objN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x051c  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(boolean r43) {
        /*
            Method dump skipped, instructions count: 1622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.p.o(boolean):void");
    }

    public final void p() {
        o(false);
        k1 k1VarU = u();
        if (k1VarU != null) {
            int i10 = k1VarU.f17205b;
            if ((i10 & 1) != 0) {
                k1VarU.f17205b = i10 | 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[EDGE_INSN: B:59:0x0082->B:28:0x0082 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x007f], EDGE_INSN: B:60:0x0082->B:28:0x0082 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x007f]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n0.k1 q() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.p.q():n0.k1");
    }

    public final void r() {
        o(false);
        this.f17255b.getClass();
        o(false);
        o0.b bVar = this.M;
        if (bVar.f18686c) {
            bVar.d(false);
            bVar.d(false);
            bVar.f18685b.f18682a.e0(o0.l.f18715d);
            bVar.f18686c = false;
        }
        bVar.b();
        if (bVar.f18687d.f17214b != 0) {
            q.c("Missed recording an endGroup()");
        }
        if (!this.f17262i.isEmpty()) {
            q.c("Start/end imbalance");
        }
        h();
        this.G.c();
        this.f17274w = this.f17275x.b() != 0;
    }

    public final void s(boolean z10, e1 e1Var) {
        this.f17262i.add(this.j);
        this.j = e1Var;
        int i10 = this.f17263l;
        l0 l0Var = this.f17265n;
        l0Var.c(i10);
        l0Var.c(this.f17264m);
        l0Var.c(this.k);
        if (z10) {
            this.k = 0;
        }
        this.f17263l = 0;
        this.f17264m = 0;
    }

    public final void t() {
        s1 s1Var = new s1();
        if (this.C) {
            s1Var.b();
        }
        if (this.f17255b.c()) {
            s1Var.G = new u.t();
        }
        this.H = s1Var;
        v1 v1VarD = s1Var.d();
        v1VarD.e(true);
        this.I = v1VarD;
    }

    public final k1 u() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (k1) h0.b.f(1, arrayList);
    }

    public final boolean v() {
        if (!x() || this.f17274w) {
            return true;
        }
        k1 k1VarU = u();
        return (k1VarU == null || (k1VarU.f17205b & 4) == 0) ? false : true;
    }

    public final y0.b w() {
        if (this.C) {
            return this.P;
        }
        return null;
    }

    public final boolean x() {
        k1 k1VarU;
        return (this.R || this.f17276y || this.f17274w || (k1VarU = u()) == null || (k1VarU.f17205b & 8) != 0) ? false : true;
    }

    public final void y(ArrayList arrayList) {
        o0.a aVar = this.f17259f;
        o0.b bVar = this.M;
        o0.a aVar2 = bVar.f18685b;
        try {
            bVar.f18685b = aVar;
            aVar.f18682a.e0(o0.y.f18732d);
            if (arrayList.size() <= 0) {
                bVar.f18685b.f18682a.e0(o0.m.f18716d);
                bVar.f18689f = 0;
            } else {
                lq.l lVar = (lq.l) arrayList.get(0);
                w0 w0Var = (w0) lVar.f15571a;
                w0Var.getClass();
                throw null;
            }
        } finally {
            bVar.f18685b = aVar2;
        }
    }

    public final void z(f1 f1Var, Object obj) {
        O(126665345, null, 0, null);
        A();
        c0(obj);
        long j = this.S;
        try {
            this.S = 126665345;
            if (this.R) {
                v1 v1Var = this.I;
                int i10 = v1Var.f17352v;
                int iR = v1Var.r(i10);
                int[] iArr = v1Var.f17334b;
                int i11 = (iR * 5) + 1;
                int i12 = iArr[i11];
                if ((i12 & 134217728) == 0) {
                    int i13 = (i12 & (-134217729)) | 134217728;
                    iArr[i11] = i13;
                    if ((67108864 & i13) == 0) {
                        v1Var.R(v1Var.C(iArr, i10));
                    }
                }
            }
            boolean z10 = (this.R || br.l.a(this.G.f(), f1Var)) ? false : true;
            if (z10) {
                G(f1Var);
            }
            O(202, q.f17284c, 0, f1Var);
            this.K = null;
            boolean z11 = this.f17274w;
            this.f17274w = z10;
            v0.i.c(this, new v0.d(new o(obj), 316014703, true));
            this.f17274w = z11;
        } finally {
        }
    }
}
