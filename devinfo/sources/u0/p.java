package u0;

import android.os.Trace;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.internal.ads.lb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p {
    public int A;
    public int B;
    public boolean C;
    public final g1.s D;
    public final ArrayList E;
    public boolean F;
    public a2 G;
    public b2 H;
    public e2 I;
    public boolean J;
    public i1 K;
    public v0.a L;
    public final v0.b M;
    public a N;
    public v0.c O;
    public z1 P;
    public final h1.d Q;
    public final ck.h R;
    public boolean S;
    public long T;
    public v U;

    /* renamed from: a, reason: collision with root package name */
    public final i0.f f34898a;

    /* renamed from: b, reason: collision with root package name */
    public final t f34899b;

    /* renamed from: c, reason: collision with root package name */
    public final b2 f34900c;

    /* renamed from: d, reason: collision with root package name */
    public final x.h0 f34901d;

    /* renamed from: e, reason: collision with root package name */
    public final v0.a f34902e;

    /* renamed from: f, reason: collision with root package name */
    public final v0.a f34903f;
    public final nm.d0 g;

    /* renamed from: h, reason: collision with root package name */
    public final w f34904h;
    public h1 j;

    /* renamed from: k, reason: collision with root package name */
    public int f34906k;

    /* renamed from: l, reason: collision with root package name */
    public int f34907l;

    /* renamed from: m, reason: collision with root package name */
    public int f34908m;

    /* renamed from: o, reason: collision with root package name */
    public int[] f34910o;

    /* renamed from: p, reason: collision with root package name */
    public x.s f34911p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f34912q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f34913r;

    /* renamed from: v, reason: collision with root package name */
    public x.u f34917v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f34918w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f34920y;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f34905i = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final lb f34909n = new lb();

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f34914s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final lb f34915t = new lb();

    /* renamed from: u, reason: collision with root package name */
    public i1 f34916u = c1.l.f2565d;

    /* renamed from: x, reason: collision with root package name */
    public final lb f34919x = new lb();

    /* renamed from: z, reason: collision with root package name */
    public int f34921z = -1;

    public p(i0.f fVar, t tVar, b2 b2Var, x.h0 h0Var, v0.a aVar, v0.a aVar2, nm.d0 d0Var, w wVar) {
        this.f34898a = fVar;
        this.f34899b = tVar;
        this.f34900c = b2Var;
        this.f34901d = h0Var;
        this.f34902e = aVar;
        this.f34903f = aVar2;
        this.g = d0Var;
        this.f34904h = wVar;
        this.C = tVar.f() || tVar.d();
        this.D = new g1.s(1, this);
        this.E = new ArrayList();
        a2 a2VarD = b2Var.d();
        a2VarD.c();
        this.G = a2VarD;
        b2 b2Var2 = new b2();
        if (tVar.f()) {
            b2Var2.c();
        }
        if (tVar.d()) {
            b2Var2.f34751k = new x.u();
        }
        this.H = b2Var2;
        e2 e2VarF = b2Var2.f();
        e2VarF.e(true);
        this.I = e2VarF;
        this.M = new v0.b(this, aVar);
        a2 a2VarD2 = this.H.d();
        try {
            a aVarA = a2VarD2.a(0);
            a2VarD2.c();
            this.N = aVarA;
            this.O = new v0.c();
            this.Q = new h1.d(this);
            ck.h hVarJ = tVar.j();
            ck.h hVarZ = z();
            this.R = hVarJ.y(hVarZ == null ? ck.i.f2898a : hVarZ);
        } catch (Throwable th2) {
            a2VarD2.c();
            throw th2;
        }
    }

    public static final int N(p pVar, int i4, boolean z3, int i10) {
        a2 a2Var = pVar.G;
        if (a2Var.j(i4)) {
            int i11 = a2Var.i(i4);
            Object objP = a2Var.p(i4, a2Var.f34729b);
            if (i11 == 206 && nk.k.a(objP, r.f34951e)) {
                Object objH = a2Var.h(i4, 0);
                v1 v1Var = objH instanceof v1 ? (v1) objH : null;
                Object obj = v1Var != null ? v1Var.f34990a : null;
                n nVar = obj instanceof n ? (n) obj : null;
                if (nVar != null) {
                    for (p pVar2 : nVar.f34876a.f34888e) {
                        b2 b2Var = pVar2.f34900c;
                        if (b2Var.f34744b > 0 && (b2Var.f34743a[1] & 67108864) != 0) {
                            w wVar = pVar2.f34904h;
                            synchronized (wVar.f34995d) {
                                wVar.p();
                                x.e0 e0Var = wVar.f35003n;
                                wVar.f35003n = com.bumptech.glide.f.i();
                                try {
                                    wVar.f35011v.c0(e0Var);
                                } finally {
                                }
                            }
                            v0.a aVar = new v0.a();
                            pVar2.L = aVar;
                            a2 a2VarD = pVar2.f34900c.d();
                            try {
                                pVar2.G = a2VarD;
                                v0.b bVar = pVar2.M;
                                v0.a aVar2 = bVar.f35556b;
                                try {
                                    bVar.f35556b = aVar;
                                    pVar2.M(0);
                                    v0.b bVar2 = pVar2.M;
                                    bVar2.b();
                                    if (bVar2.f35557c) {
                                        bVar2.f35556b.f35553e.X(v0.c0.f35568c);
                                        if (bVar2.f35557c) {
                                            bVar2.d(false);
                                            bVar2.d(false);
                                            bVar2.f35556b.f35553e.X(v0.m.f35590c);
                                            bVar2.f35557c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                a2VarD.c();
                            }
                        }
                        pVar.f34899b.r(pVar2.f34904h);
                    }
                }
                return a2Var.o(i4);
            }
            if (!a2Var.l(i4)) {
                return a2Var.o(i4);
            }
        } else if (a2Var.d(i4)) {
            int i12 = a2Var.f34729b[(i4 * 5) + 3] + i4;
            int iN = 0;
            for (int i13 = i4 + 1; i13 < i12; i13 += a2Var.f34729b[(i13 * 5) + 3]) {
                boolean zL = a2Var.l(i13);
                if (zL) {
                    pVar.M.c();
                    v0.b bVar3 = pVar.M;
                    Object objN = a2Var.n(i13);
                    bVar3.c();
                    bVar3.f35561h.add(objN);
                }
                iN += N(pVar, i13, zL || z3, zL ? 0 : i10 + iN);
                if (zL) {
                    pVar.M.c();
                    pVar.M.a();
                }
            }
            if (!a2Var.l(i4)) {
                return iN;
            }
        } else if (!a2Var.l(i4)) {
            return a2Var.o(i4);
        }
        return 1;
    }

    public final boolean A() {
        m1 m1VarX;
        return (this.S || this.f34920y || this.f34918w || (m1VarX = x()) == null || (m1VarX.f34868b & 8) != 0) ? false : true;
    }

    public final void B(ArrayList arrayList) {
        v0.a aVar = this.f34903f;
        v0.b bVar = this.M;
        v0.a aVar2 = bVar.f35556b;
        try {
            bVar.f35556b = aVar;
            aVar.f35553e.X(v0.a0.f35554c);
            if (arrayList.size() <= 0) {
                bVar.b();
                bVar.f35556b.f35553e.X(v0.n.f35591c);
                bVar.f35560f = 0;
            } else {
                yj.i iVar = (yj.i) arrayList.get(0);
                t0 t0Var = (t0) iVar.f37638a;
                t0Var.getClass();
                throw null;
            }
        } finally {
            bVar.f35556b = aVar2;
        }
    }

    public final void C(i1 i1Var, Object obj) {
        S(126665345, null, 0, null);
        D();
        h0(obj);
        long j = this.T;
        try {
            this.T = 126665345;
            if (this.S) {
                e2.z(this.I);
            }
            boolean z3 = (this.S || nk.k.a(this.G.f(), i1Var)) ? false : true;
            if (z3) {
                J(i1Var);
            }
            S(202, r.f34949c, 0, i1Var);
            this.K = null;
            this.f34918w = z3;
            throw null;
        } finally {
        }
    }

    public final Object D() {
        boolean z3 = this.S;
        e eVar = l.f34851a;
        if (!z3) {
            Object objM = this.G.m();
            if (!this.f34920y || (objM instanceof y1)) {
                return objM;
            }
        } else if (this.f34913r) {
            r.a("A call to createNode(), emitNode() or useNode() expected");
            return eVar;
        }
        return eVar;
    }

    public final List E() {
        t tVar = this.f34899b;
        s sVarH = tVar.h();
        w wVar = a0.g.C(sVarH) ? (w) sVarH : null;
        if (wVar != null) {
            b2 b2Var = wVar.f34997f;
            a2 a2VarD = b2Var.d();
            try {
                Integer numK = com.bumptech.glide.f.k(a2VarD, tVar, 0, a2VarD.f34730c);
                if (numK != null) {
                    a2VarD = b2Var.d();
                    try {
                        ArrayList arrayListC = com.bumptech.glide.f.C(a2VarD, numK.intValue(), 0);
                        a2VarD.c();
                        return zj.n.j0(arrayListC, wVar.f35011v.E());
                    } finally {
                    }
                }
            } finally {
            }
        }
        return zj.s.f38317a;
    }

    public final int F(int i4) {
        int iQ = this.G.q(i4) + 1;
        int i10 = 0;
        while (iQ < i4) {
            if (!this.G.k(iQ)) {
                i10++;
            }
            iQ += d2.a(iQ, this.G.f34729b);
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:18:0x0038, B:21:0x0040, B:23:0x0048, B:25:0x004e, B:26:0x0052, B:27:0x0053, B:29:0x0059, B:22:0x0044), top: B:34:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object G(u0.w r9, u0.w r10, java.lang.Integer r11, java.util.List r12, mk.a r13) {
        /*
            r8 = this;
            boolean r0 = r8.F
            int r1 = r8.f34906k
            r2 = 1
            r8.F = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.f34906k = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            yj.i r6 = (yj.i) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.f37638a     // Catch: java.lang.Throwable -> L24
            u0.m1 r7 = (u0.m1) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.f37639b     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.b0(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L62
        L26:
            r8.b0(r7, r5)     // Catch: java.lang.Throwable -> L24
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
            r9.f35007r = r10     // Catch: java.lang.Throwable -> L24
            r9.f35008s = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L4d
            r9.f35007r = r5     // Catch: java.lang.Throwable -> L24
            r9.f35008s = r2     // Catch: java.lang.Throwable -> L24
            goto L57
        L4d:
            r10 = move-exception
            r9.f35007r = r5     // Catch: java.lang.Throwable -> L24
            r9.f35008s = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L53:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L57:
            if (r10 != 0) goto L5d
        L59:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L5d:
            r8.F = r0
            r8.f34906k = r1
            return r10
        L62:
            r8.F = r0
            r8.f34906k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.p.G(u0.w, u0.w, java.lang.Integer, java.util.List, mk.a):java.lang.Object");
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
    public final void H() {
        /*
            Method dump skipped, instructions count: 882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.p.H():void");
    }

    public final void I() {
        int i4;
        M(this.G.g);
        v0.b bVar = this.M;
        bVar.d(false);
        lb lbVar = bVar.f35558d;
        p pVar = bVar.f35555a;
        a2 a2Var = pVar.G;
        if (a2Var.f34730c > 0 && lbVar.a(-2) != (i4 = a2Var.f34735i)) {
            if (!bVar.f35557c && bVar.f35559e) {
                bVar.d(false);
                bVar.f35556b.f35553e.X(v0.q.f35594c);
                bVar.f35557c = true;
            }
            if (i4 > 0) {
                a aVarA = a2Var.a(i4);
                lbVar.c(i4);
                bVar.d(false);
                v0.l0 l0Var = bVar.f35556b.f35553e;
                l0Var.X(v0.p.f35593c);
                pd.b.q(l0Var, 0, aVarA);
                bVar.f35557c = true;
            }
        }
        bVar.f35556b.f35553e.X(v0.y.f35605c);
        int i10 = bVar.f35560f;
        a2 a2Var2 = pVar.G;
        bVar.f35560f = a2Var2.f34729b[(a2Var2.g * 5) + 3] + i10;
    }

    public final void J(i1 i1Var) {
        x.u uVar = this.f34917v;
        if (uVar == null) {
            uVar = new x.u();
            this.f34917v = uVar;
        }
        uVar.h(this.G.g, i1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K(int r7, int r8, int r9) {
        /*
            r6 = this;
            u0.a2 r0 = r6.G
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
            v0.b r1 = r6.M
            r1.a()
        L7a:
            int r7 = r0.q(r7)
            goto L6b
        L7f:
            r6.o(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.p.K(int, int, int):void");
    }

    public final Object L() {
        boolean z3 = this.S;
        e eVar = l.f34851a;
        if (!z3) {
            Object objM = this.G.m();
            if (!this.f34920y || (objM instanceof y1)) {
                return objM instanceof v1 ? ((v1) objM).f34990a : objM;
            }
        } else if (this.f34913r) {
            r.a("A call to createNode(), emitNode() or useNode() expected");
            return eVar;
        }
        return eVar;
    }

    public final void M(int i4) {
        boolean zL = this.G.l(i4);
        v0.b bVar = this.M;
        if (zL) {
            bVar.c();
            Object objN = this.G.n(i4);
            bVar.c();
            bVar.f35561h.add(objN);
        }
        N(this, i4, zL, 0);
        bVar.c();
        if (zL) {
            bVar.a();
        }
    }

    public final boolean O(int i4, boolean z3) {
        m1 m1VarX;
        if ((i4 & 1) == 0 && (this.S || this.f34920y)) {
            z1 z1Var = this.P;
            if (z1Var != null && (m1VarX = x()) != null && z1Var.a()) {
                int i10 = m1VarX.f34868b;
                if ((i10 & 512) != 0) {
                    return true;
                }
                int i11 = i10 | 1;
                m1VarX.f34868b = i11;
                m1VarX.f34868b = (this.f34920y ? i10 | 129 : i11 & (-129)) | 256;
                v0.l0 l0Var = this.M.f35556b.f35553e;
                l0Var.X(v0.x.f35604c);
                pd.b.q(l0Var, 0, m1VarX);
                this.f34899b.q(m1VarX);
                return false;
            }
        } else if (!z3 && A()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P() {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.p.P():void");
    }

    public final void Q() {
        a2 a2Var = this.G;
        int i4 = a2Var.f34735i;
        this.f34907l = i4 >= 0 ? a2Var.f34729b[(i4 * 5) + 1] & 67108863 : 0;
        a2Var.t();
    }

    public final void R() {
        if (this.f34907l != 0) {
            r.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        m1 m1VarX = x();
        if (m1VarX != null) {
            int i4 = m1VarX.f34868b;
            if ((i4 & 128) == 0) {
                m1VarX.f34868b = i4 | 16;
            }
        }
        if (this.f34914s.isEmpty()) {
            Q();
        } else {
            H();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Type inference failed for: r2v7, types: [u0.e2] */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [u0.e2] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, u0.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(int r27, u0.x0 r28, int r29, java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.p.S(int, u0.x0, int, java.lang.Object):void");
    }

    public final void T() {
        S(-127, null, 0, null);
    }

    public final void U(int i4, x0 x0Var) {
        S(i4, x0Var, 0, null);
    }

    public final void V(Object obj, boolean z3) {
        if (z3) {
            a2 a2Var = this.G;
            if (a2Var.f34736k <= 0) {
                if ((a2Var.f34729b[(a2Var.g * 5) + 1] & 1073741824) == 0) {
                    j1.a("Expected a node group");
                }
                a2Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            v0.b bVar = this.M;
            bVar.getClass();
            bVar.d(false);
            v0.l0 l0Var = bVar.f35556b.f35553e;
            l0Var.X(v0.f0.f35574c);
            pd.b.q(l0Var, 0, obj);
        }
        this.G.u();
    }

    public final void W(int i4) {
        int i10;
        int i11;
        if (this.j != null) {
            S(i4, null, 0, null);
            return;
        }
        if (this.f34913r) {
            r.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i4, 3) ^ this.f34908m;
        this.f34908m++;
        a2 a2Var = this.G;
        boolean z3 = this.S;
        e eVar = l.f34851a;
        if (z3) {
            a2Var.f34736k++;
            this.I.Q(eVar, false, eVar, i4);
            u(false, null);
            return;
        }
        if (a2Var.g() == i4 && ((i11 = a2Var.g) >= a2Var.f34734h || (a2Var.f34729b[(i11 * 5) + 1] & 536870912) == 0)) {
            a2Var.u();
            u(false, null);
            return;
        }
        if (a2Var.f34736k <= 0 && (i10 = a2Var.g) != a2Var.f34734h) {
            int i12 = this.f34906k;
            I();
            this.M.e(i12, a2Var.s());
            q.f(i10, a2Var.g, this.f34914s);
        }
        a2Var.f34736k++;
        this.S = true;
        this.K = null;
        if (this.I.f34799w) {
            e2 e2VarF = this.H.f();
            this.I = e2VarF;
            e2VarF.M();
            this.J = false;
            this.K = null;
        }
        e2 e2Var = this.I;
        e2Var.d();
        int i13 = e2Var.f34796t;
        e2Var.Q(eVar, false, eVar, i4);
        this.N = e2Var.b(i13);
        u(false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final u0.p X(int r7) {
        /*
            r6 = this;
            r6.W(r7)
            boolean r7 = r6.S
            nm.d0 r0 = r6.g
            java.util.ArrayList r1 = r6.E
            u0.w r2 = r6.f34904h
            if (r7 == 0) goto L26
            u0.m1 r7 = new u0.m1
            r7.<init>(r2)
            r1.add(r7)
            r6.h0(r7)
            int r1 = r6.B
            r7.f34871e = r1
            int r1 = r7.f34868b
            r1 = r1 & (-17)
            r7.f34868b = r1
            r0.l()
            return r6
        L26:
            u0.a2 r7 = r6.G
            int r7 = r7.f34735i
            java.util.ArrayList r3 = r6.f34914s
            int r7 = u0.q.m(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            u0.m0 r7 = (u0.m0) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            u0.a2 r3 = r6.G
            java.lang.Object r3 = r3.m()
            u0.e r4 = u0.l.f34851a
            boolean r4 = nk.k.a(r3, r4)
            if (r4 == 0) goto L51
            u0.m1 r3 = new u0.m1
            r3.<init>(r2)
            r6.h0(r3)
            goto L58
        L51:
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            nk.k.c(r3, r2)
            u0.m1 r3 = (u0.m1) r3
        L58:
            r2 = 0
            r4 = 1
            if (r7 != 0) goto L70
            int r7 = r3.f34868b
            r5 = r7 & 64
            if (r5 == 0) goto L64
            r5 = r4
            goto L65
        L64:
            r5 = r2
        L65:
            if (r5 == 0) goto L6b
            r7 = r7 & (-65)
            r3.f34868b = r7
        L6b:
            if (r5 == 0) goto L6e
            goto L70
        L6e:
            r7 = r2
            goto L71
        L70:
            r7 = r4
        L71:
            int r5 = r3.f34868b
            if (r7 == 0) goto L78
            r7 = r5 | 8
            goto L7a
        L78:
            r7 = r5 & (-9)
        L7a:
            r3.f34868b = r7
            r1.add(r3)
            int r7 = r6.B
            r3.f34871e = r7
            int r7 = r3.f34868b
            r7 = r7 & (-17)
            r3.f34868b = r7
            r0.l()
            int r7 = r3.f34868b
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lb6
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.17E-43)
            r3.f34868b = r7
            v0.b r7 = r6.M
            v0.a r7 = r7.f35556b
            v0.l0 r7 = r7.f35553e
            v0.d0 r0 = v0.d0.f35570c
            r7.X(r0)
            pd.b.q(r7, r2, r3)
            boolean r7 = r6.f34920y
            if (r7 != 0) goto Lb6
            int r7 = r3.f34868b
            r0 = r7 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lb6
            r6.f34920y = r4
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.f34868b = r7
        Lb6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.p.X(int):u0.p");
    }

    public final void Y(Object obj) {
        if (!this.S && this.G.g() == 207 && !nk.k.a(this.G.f(), obj) && this.f34921z < 0) {
            this.f34921z = this.G.g;
            this.f34920y = true;
        }
        S(207, null, 0, obj);
    }

    public final void Z() {
        S(125, null, 2, null);
        this.f34913r = true;
    }

    public final void a() {
        i();
        this.f34905i.clear();
        this.f34909n.f13441b = 0;
        this.f34915t.f13441b = 0;
        this.f34919x.f13441b = 0;
        this.f34917v = null;
        v0.c cVar = this.O;
        cVar.f35567f.T();
        cVar.f35566e.T();
        this.T = 0;
        this.A = 0;
        this.f34913r = false;
        this.S = false;
        this.f34920y = false;
        this.F = false;
        this.f34921z = -1;
        a2 a2Var = this.G;
        if (!a2Var.f34733f) {
            a2Var.c();
        }
        if (this.I.f34799w) {
            return;
        }
        v();
    }

    public final void a0() {
        this.f34908m = 0;
        this.G = this.f34900c.d();
        S(100, null, 0, null);
        t tVar = this.f34899b;
        tVar.t();
        i1 i1VarI = tVar.i();
        this.f34919x.c(this.f34918w ? 1 : 0);
        this.f34918w = f(i1VarI);
        this.K = null;
        if (!this.f34912q) {
            this.f34912q = tVar.e();
        }
        if (!this.C) {
            this.C = tVar.f();
        }
        if (this.C) {
            o2 o2Var = h1.e.f24805a;
            nk.k.c(o2Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            i1VarI = ((c1.l) i1VarI).c(o2Var, new p2(z()));
        }
        this.f34916u = i1VarI;
        Set set = (Set) q.s(i1VarI, h1.g.f24807a);
        if (set != null) {
            set.add(w());
            tVar.o(set);
        }
        long jG = tVar.g();
        S((int) (jG ^ (jG >>> 32)), null, 0, null);
    }

    public final void b(Object obj, mk.e eVar) {
        if (this.S) {
            v0.l0 l0Var = this.O.f35566e;
            l0Var.X(v0.g0.f35576c);
            pd.b.q(l0Var, 0, obj);
            nk.k.c(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            nk.x.d(2, eVar);
            pd.b.q(l0Var, 1, eVar);
            return;
        }
        v0.b bVar = this.M;
        bVar.b();
        v0.l0 l0Var2 = bVar.f35556b.f35553e;
        l0Var2.X(v0.g0.f35576c);
        nk.k.c(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        nk.x.d(2, eVar);
        pd.b.r(l0Var2, 0, obj, 1, eVar);
    }

    public final boolean b0(m1 m1Var, Object obj) {
        a aVar = m1Var.f34869c;
        if (aVar == null) {
            return false;
        }
        int iA = this.G.f34728a.a(aVar);
        if (!this.F || iA < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.f34914s;
        int iM = q.m(iA, arrayList);
        if (iM < 0) {
            int i4 = -(iM + 1);
            if (!(obj instanceof d0)) {
                obj = null;
            }
            arrayList.add(i4, new m0(m1Var, iA, obj));
            return true;
        }
        m0 m0Var = (m0) arrayList.get(iM);
        if (!(obj instanceof d0)) {
            m0Var.f34866c = null;
            return true;
        }
        Object obj2 = m0Var.f34866c;
        if (obj2 == null) {
            m0Var.f34866c = obj;
            return true;
        }
        if (obj2 instanceof x.f0) {
            ((x.f0) obj2).a(obj);
            return true;
        }
        x.f0 f0Var = x.m0.f36916a;
        x.f0 f0Var2 = new x.f0(2);
        f0Var2.j(obj2);
        f0Var2.j(obj);
        m0Var.f34866c = f0Var2;
        return true;
    }

    public final boolean c(float f10) {
        Object objD = D();
        if ((objD instanceof Float) && f10 == ((Number) objD).floatValue()) {
            return false;
        }
        h0(Float.valueOf(f10));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c0(x.e0 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.ArrayList r2 = r0.f34914s
            int r3 = cm.g.r(r2)
        La:
            r4 = -1
            if (r4 >= r3) goto L2e
            java.lang.Object r4 = r2.get(r3)
            u0.m0 r4 = (u0.m0) r4
            u0.m1 r5 = r4.f34864a
            u0.a r5 = r5.f34869c
            if (r5 == 0) goto L28
            boolean r6 = r5.a()
            if (r6 == 0) goto L28
            int r6 = r4.f34865b
            int r5 = r5.f34724a
            if (r6 == r5) goto L2b
            r4.f34865b = r5
            goto L2b
        L28:
            r2.remove(r3)
        L2b:
            int r3 = r3 + (-1)
            goto La
        L2e:
            java.lang.Object[] r3 = r1.f36874b
            java.lang.Object[] r4 = r1.f36875c
            long[] r1 = r1.f36873a
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
            nk.k.c(r14, r15)
            u0.m1 r14 = (u0.m1) r14
            u0.a r15 = r14.f34869c
            if (r15 == 0) goto L80
            int r15 = r15.f34724a
            u0.e r6 = u0.e.f34771f
            if (r13 != r6) goto L78
            r13 = 0
        L78:
            u0.m0 r6 = new u0.m0
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
            b4.b r1 = u0.q.f34932a
            zj.q.V(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.p.c0(x.e0):void");
    }

    public final boolean d(int i4) {
        Object objD = D();
        if ((objD instanceof Integer) && i4 == ((Number) objD).intValue()) {
            return false;
        }
        h0(Integer.valueOf(i4));
        return true;
    }

    public final void d0(int i4, int i10) {
        if (i0(i4) != i10) {
            if (i4 < 0) {
                x.s sVar = this.f34911p;
                if (sVar == null) {
                    sVar = new x.s();
                    this.f34911p = sVar;
                }
                sVar.f(i4, i10);
                return;
            }
            int[] iArr = this.f34910o;
            if (iArr == null) {
                iArr = new int[this.G.f34730c];
                zj.m.V(-1, iArr);
                this.f34910o = iArr;
            }
            iArr[i4] = i10;
        }
    }

    public final boolean e(long j) {
        Object objD = D();
        if ((objD instanceof Long) && j == ((Number) objD).longValue()) {
            return false;
        }
        h0(Long.valueOf(j));
        return true;
    }

    public final void e0(int i4, int i10) {
        int iI0 = i0(i4);
        if (iI0 != i10) {
            int i11 = i10 - iI0;
            ArrayList arrayList = this.f34905i;
            int size = arrayList.size() - 1;
            while (i4 != -1) {
                int iI02 = i0(i4) + i11;
                d0(i4, iI02);
                int i12 = size;
                while (true) {
                    if (-1 < i12) {
                        h1 h1Var = (h1) arrayList.get(i12);
                        if (h1Var != null && h1Var.a(i4, iI02)) {
                            size = i12 - 1;
                            break;
                        }
                        i12--;
                    } else {
                        break;
                    }
                }
                if (i4 < 0) {
                    i4 = this.G.f34735i;
                } else if (this.G.l(i4)) {
                    return;
                } else {
                    i4 = this.G.q(i4);
                }
            }
        }
    }

    public final boolean f(Object obj) {
        if (nk.k.a(D(), obj)) {
            return false;
        }
        h0(obj);
        return true;
    }

    public final c1.l f0(i1 i1Var, c1.l lVar) {
        c1.l lVar2 = (c1.l) i1Var;
        lVar2.getClass();
        c1.k kVar = new c1.k(lVar2);
        kVar.g = lVar2;
        kVar.putAll(lVar);
        c1.l lVarA = kVar.a();
        U(204, r.f34950d);
        D();
        h0(lVarA);
        D();
        h0(lVar);
        p(false);
        return lVarA;
    }

    public final boolean g(boolean z3) {
        Object objD = D();
        if ((objD instanceof Boolean) && z3 == ((Boolean) objD).booleanValue()) {
            return false;
        }
        h0(Boolean.valueOf(z3));
        return true;
    }

    public final void g0(Object obj) {
        if (obj instanceof u1) {
            v1 v1Var = new v1((u1) obj, this.f34908m - 1);
            if (this.S) {
                v0.l0 l0Var = this.M.f35556b.f35553e;
                l0Var.X(v0.w.f35603c);
                pd.b.q(l0Var, 0, v1Var);
            }
            this.f34901d.add(obj);
            obj = v1Var;
        }
        h0(obj);
    }

    public final boolean h(Object obj) {
        if (D() == obj) {
            return false;
        }
        h0(obj);
        return true;
    }

    public final void h0(Object obj) {
        if (this.S) {
            e2 e2Var = this.I;
            if (e2Var.f34790n <= 0 || e2Var.f34786i == e2Var.f34787k) {
                e2Var.F(obj);
                return;
            }
            x.u uVar = e2Var.f34795s;
            if (uVar == null) {
                uVar = new x.u();
            }
            e2Var.f34795s = uVar;
            int i4 = e2Var.f34798v;
            Object objB = uVar.b(i4);
            if (objB == null) {
                objB = new x.a0();
                uVar.h(i4, objB);
            }
            ((x.a0) objB).a(obj);
            return;
        }
        a2 a2Var = this.G;
        boolean z3 = a2Var.f34739n;
        v0.b bVar = this.M;
        if (!z3) {
            a aVarA = a2Var.a(a2Var.f34735i);
            v0.l0 l0Var = bVar.f35556b.f35553e;
            l0Var.X(v0.e.f35571c);
            pd.b.r(l0Var, 0, aVarA, 1, obj);
            return;
        }
        int iC = (a2Var.f34737l - d2.c(a2Var.f34735i, a2Var.f34729b)) - 1;
        if (bVar.f35555a.G.f34735i - bVar.f35560f >= 0) {
            bVar.d(true);
            v0.l0 l0Var2 = bVar.f35556b.f35553e;
            l0Var2.X(v0.r.g);
            pd.b.q(l0Var2, 0, obj);
            l0Var2.g[l0Var2.f35588h - l0Var2.f35586e[l0Var2.f35587f - 1].f35582a] = iC;
            return;
        }
        a2 a2Var2 = this.G;
        a aVarA2 = a2Var2.a(a2Var2.f34735i);
        v0.l0 l0Var3 = bVar.f35556b.f35553e;
        l0Var3.X(v0.r.f35597f);
        pd.b.r(l0Var3, 0, obj, 1, aVarA2);
        l0Var3.g[l0Var3.f35588h - l0Var3.f35586e[l0Var3.f35587f - 1].f35582a] = iC;
    }

    public final void i() {
        this.j = null;
        this.f34906k = 0;
        this.f34907l = 0;
        this.T = 0L;
        this.f34913r = false;
        v0.b bVar = this.M;
        bVar.f35557c = false;
        bVar.f35558d.f13441b = 0;
        bVar.f35560f = 0;
        bVar.f35559e = true;
        bVar.g = 0;
        bVar.f35561h.clear();
        bVar.f35562i = -1;
        bVar.j = -1;
        bVar.f35563k = -1;
        bVar.f35564l = 0;
        this.E.clear();
        this.f34910o = null;
        this.f34911p = null;
    }

    public final int i0(int i4) {
        int i10;
        if (i4 >= 0) {
            int[] iArr = this.f34910o;
            return (iArr == null || (i10 = iArr[i4]) < 0) ? this.G.o(i4) : i10;
        }
        x.s sVar = this.f34911p;
        if (sVar == null || sVar.c(i4) < 0) {
            return 0;
        }
        int iC = sVar.c(i4);
        if (iC >= 0) {
            return sVar.f36940c[iC];
        }
        y.a.e("Cannot find value for key " + i4);
        throw null;
    }

    public final Object j(k1 k1Var) {
        return q.s(l(), k1Var);
    }

    public final void j0() {
        if (!this.f34913r) {
            r.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f34913r = false;
        if (this.S) {
            r.a("useNode() called while inserting");
        }
        a2 a2Var = this.G;
        Object objN = a2Var.n(a2Var.f34735i);
        v0.b bVar = this.M;
        bVar.c();
        bVar.f35561h.add(objN);
        if (this.f34920y && (objN instanceof h)) {
            bVar.b();
            bVar.f35556b.f35553e.X(v0.i0.f35580c);
        }
    }

    public final void k(mk.a aVar) {
        if (!this.f34913r) {
            r.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f34913r = false;
        if (!this.S) {
            r.a("createNode() can only be called when inserting");
        }
        lb lbVar = this.f34909n;
        int i4 = lbVar.f13440a[lbVar.f13441b - 1];
        e2 e2Var = this.I;
        a aVarB = e2Var.b(e2Var.f34798v);
        this.f34907l++;
        v0.c cVar = this.O;
        v0.l0 l0Var = cVar.f35566e;
        l0Var.X(v0.r.f35595d);
        pd.b.q(l0Var, 0, aVar);
        l0Var.g[l0Var.f35588h - l0Var.f35586e[l0Var.f35587f - 1].f35582a] = i4;
        pd.b.q(l0Var, 1, aVarB);
        v0.l0 l0Var2 = cVar.f35567f;
        l0Var2.X(v0.r.f35596e);
        l0Var2.g[l0Var2.f35588h - l0Var2.f35586e[l0Var2.f35587f - 1].f35582a] = i4;
        pd.b.q(l0Var2, 0, aVarB);
    }

    public final i1 l() {
        i1 i1Var;
        i1 i1Var2 = this.K;
        if (i1Var2 != null) {
            return i1Var2;
        }
        int iQ = this.G.f34735i;
        boolean z3 = this.S;
        x0 x0Var = r.f34949c;
        if (z3 && this.J) {
            int iE = this.I.f34798v;
            while (iE > 0) {
                if (this.I.s(iE) == 202 && nk.k.a(this.I.t(iE), x0Var)) {
                    Object objQ = this.I.q(iE);
                    nk.k.c(objQ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    i1 i1Var3 = (i1) objQ;
                    this.K = i1Var3;
                    return i1Var3;
                }
                e2 e2Var = this.I;
                iE = e2Var.E(iE, e2Var.f34780b);
            }
        }
        if (this.G.f34730c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    a2 a2Var = this.G;
                    if (nk.k.a(a2Var.p(iQ, a2Var.f34729b), x0Var)) {
                        x.u uVar = this.f34917v;
                        if (uVar == null || (i1Var = (i1) uVar.b(iQ)) == null) {
                            a2 a2Var2 = this.G;
                            Object objB = a2Var2.b(iQ, a2Var2.f34729b);
                            nk.k.c(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                            i1Var = (i1) objB;
                        }
                        this.K = i1Var;
                        return i1Var;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        i1 i1Var4 = this.f34916u;
        this.K = i1Var4;
        return i1Var4;
    }

    public final h1.a m() {
        Collection collection;
        if (!this.f34899b.k()) {
            return null;
        }
        ak.c cVarF = cm.g.f();
        e2 e2Var = this.I;
        cVarF.addAll(com.bumptech.glide.f.e(e2Var, null, e2Var.f34796t, null));
        a2 a2Var = this.G;
        boolean z3 = a2Var.f34733f;
        int[] iArr = a2Var.f34729b;
        if (z3 || a2Var.f34730c == 0) {
            collection = zj.s.f38317a;
        } else {
            h1.j jVar = new h1.j(a2Var);
            int iQ = a2Var.f34735i;
            Object objValueOf = Integer.valueOf(a2Var.f34737l - d2.c(iQ, iArr));
            while (iQ >= 0) {
                jVar.v(a2Var.i(iQ), a2Var.k(iQ) ? a2Var.p(iQ, iArr) : l.f34851a, a2Var.f34728a.i(iQ), objValueOf);
                objValueOf = a2Var.a(iQ);
                iQ = a2Var.q(iQ);
            }
            collection = (ArrayList) jVar.f218b;
        }
        cVarF.addAll(collection);
        cVarF.addAll(E());
        return new h1.a(cm.g.d(cVarF));
    }

    public final void n(x.e0 e0Var, mk.e eVar) {
        ArrayList arrayList = this.f34914s;
        if (this.F) {
            r.a("Reentrant composition is not supported");
        }
        this.g.l();
        Trace.beginSection("Compose:recompose");
        try {
            long jG = g1.m.j().g();
            this.B = (int) (jG ^ (jG >>> 32));
            this.f34917v = null;
            c0(e0Var);
            this.f34906k = 0;
            this.F = true;
            try {
                a0();
                Object objD = D();
                if (objD != eVar && eVar != null) {
                    h0(eVar);
                }
                g1.s sVar = this.D;
                w0.e eVarK = q.k();
                try {
                    eVarK.b(sVar);
                    x0 x0Var = r.f34947a;
                    if (eVar != null) {
                        U(TTAdConstant.MATE_VALID, x0Var);
                        nk.x.d(2, eVar);
                        eVar.invoke(this, 1);
                        p(false);
                    } else if (!this.f34918w || objD == null || objD.equals(l.f34851a)) {
                        P();
                    } else {
                        U(TTAdConstant.MATE_VALID, x0Var);
                        nk.x.d(2, objD);
                        mk.e eVar2 = (mk.e) objD;
                        nk.x.d(2, eVar2);
                        eVar2.invoke(this, 1);
                        p(false);
                    }
                    eVarK.l(eVarK.f36399c - 1);
                    t();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.f34799w) {
                        r.a("Check failed");
                    }
                    v();
                } catch (Throwable th2) {
                    eVarK.l(eVarK.f36399c - 1);
                    throw th2;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void o(int i4, int i10) {
        if (i4 <= 0 || i4 == i10) {
            return;
        }
        o(this.G.q(i4), i10);
        if (this.G.l(i4)) {
            Object objN = this.G.n(i4);
            v0.b bVar = this.M;
            bVar.c();
            bVar.f35561h.add(objN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x051a  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(boolean r43) {
        /*
            Method dump skipped, instructions count: 1620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.p.p(boolean):void");
    }

    public final void q() {
        p(false);
        m1 m1VarX = x();
        if (m1VarX != null) {
            int i4 = m1VarX.f34868b;
            if ((i4 & 1) != 0) {
                m1VarX.f34868b = i4 | 2;
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
    public final u0.m1 r() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.p.r():u0.m1");
    }

    public final void s() {
        if (this.F || this.f34921z != 100) {
            j1.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f34921z = -1;
        this.f34920y = false;
    }

    public final void t() {
        p(false);
        this.f34899b.c();
        p(false);
        v0.b bVar = this.M;
        if (bVar.f35557c) {
            bVar.d(false);
            bVar.d(false);
            bVar.f35556b.f35553e.X(v0.m.f35590c);
            bVar.f35557c = false;
        }
        bVar.b();
        if (bVar.f35558d.f13441b != 0) {
            r.a("Missed recording an endGroup()");
        }
        if (!this.f34905i.isEmpty()) {
            r.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.f34918w = this.f34919x.b() != 0;
    }

    public final void u(boolean z3, h1 h1Var) {
        this.f34905i.add(this.j);
        this.j = h1Var;
        int i4 = this.f34907l;
        lb lbVar = this.f34909n;
        lbVar.c(i4);
        lbVar.c(this.f34908m);
        lbVar.c(this.f34906k);
        if (z3) {
            this.f34906k = 0;
        }
        this.f34907l = 0;
        this.f34908m = 0;
    }

    public final void v() {
        b2 b2Var = new b2();
        if (this.C) {
            b2Var.c();
        }
        if (this.f34899b.d()) {
            b2Var.f34751k = new x.u();
        }
        this.H = b2Var;
        e2 e2VarF = b2Var.f();
        e2VarF.e(true);
        this.I = e2VarF;
    }

    public final h1.c w() {
        v vVar = this.U;
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(this.f34904h);
        this.U = vVar2;
        return vVar2;
    }

    public final m1 x() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (m1) je.u.p(1, arrayList);
    }

    public final boolean y() {
        if (!A() || this.f34918w) {
            return true;
        }
        m1 m1VarX = x();
        return (m1VarX == null || (m1VarX.f34868b & 4) == 0) ? false : true;
    }

    public final h1.d z() {
        if (this.f34899b.k()) {
            return this.Q;
        }
        return null;
    }
}
