package c0;

import android.view.ViewGroup;
import android.view.ViewParent;
import d0.b2;
import i2.h1;
import i2.r1;
import i2.u1;
import i2.x1;
import i2.z1;
import j2.y1;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class a0 extends i2.j implements r1, a2.b, u1, z1, i2.h, h1, z1.c {
    public static final e0 I = new e0(1);
    public long A;
    public e0.k B;
    public e0.i C;
    public boolean D;
    public y4.a E;
    public xk.a0 F;
    public final e0 G;
    public c2.p H;

    /* renamed from: q, reason: collision with root package name */
    public e0.i f2354q;

    /* renamed from: r, reason: collision with root package name */
    public u0 f2355r;

    /* renamed from: s, reason: collision with root package name */
    public p2.h f2356s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2357t;

    /* renamed from: u, reason: collision with root package name */
    public mk.a f2358u;

    /* renamed from: v, reason: collision with root package name */
    public final j0 f2359v;

    /* renamed from: w, reason: collision with root package name */
    public i2.i f2360w;

    /* renamed from: x, reason: collision with root package name */
    public e0.k f2361x;

    /* renamed from: y, reason: collision with root package name */
    public e0.f f2362y;

    /* renamed from: z, reason: collision with root package name */
    public final x.x f2363z;

    public a0(e0.i iVar, u0 u0Var, boolean z3, p2.h hVar, mk.a aVar) {
        this.f2354q = iVar;
        this.f2355r = u0Var;
        this.f2356s = hVar;
        this.f2357t = z3;
        this.f2358u = aVar;
        this.f2359v = new j0(iVar, new a(1, this, a0.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 0));
        int i4 = x.m.f36915a;
        this.f2363z = new x.x(6);
        this.A = 0L;
        e0.i iVar2 = this.f2354q;
        this.C = iVar2;
        this.D = iVar2 == null;
        this.G = I;
    }

    @Override // z1.c
    public final void G(com.google.android.gms.common.api.internal.a0 a0Var, c2.k kVar) {
        ArrayList arrayList = (ArrayList) a0Var.f9070c;
        x0();
        if (this.f2357t) {
            if (this.E == null) {
                y4.a aVar = new y4.a();
                aVar.f37323a = this;
                this.E = aVar;
            }
            y4.a aVar2 = this.E;
            if (aVar2 != null) {
                mk.a aVar3 = this.f2358u;
                a0 a0Var2 = (a0) aVar2.f37323a;
                int i4 = 0;
                if (kVar != c2.k.f2635b) {
                    if (kVar != c2.k.f2636c || ((z1.b) aVar2.f37324b) == null) {
                        return;
                    }
                    int size = arrayList.size();
                    while (i4 < size) {
                        z1.b bVar = (z1.b) arrayList.get(i4);
                        if (bVar.f37839i && !bVar.equals((z1.b) aVar2.f37324b)) {
                            aVar2.y();
                            return;
                        }
                        i4++;
                    }
                    return;
                }
                z1.b bVar2 = (z1.b) aVar2.f37324b;
                if (bVar2 == null) {
                    int size2 = arrayList.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        z1.b bVar3 = (z1.b) arrayList.get(i10);
                        if (!bVar3.f37838h && bVar3.f37835d) {
                            z1.b bVar4 = (z1.b) arrayList.get(0);
                            aVar2.f37324b = bVar4;
                            a0Var2.w0(bVar4.f37834c, true);
                            bVar4.f37839i = true;
                            return;
                        }
                    }
                    return;
                }
                long j = bVar2.f37834c;
                int size3 = arrayList.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    z1.b bVar5 = (z1.b) arrayList.get(i11);
                    if (bVar5.f37838h && bVar5.f37835d) {
                        if (Math.abs(o1.b.c(o1.b.g(((z1.b) arrayList.get(0)).f37834c, j))) > ((y1) i2.k.h(a0Var2, j2.a1.f27084s)).d()) {
                            aVar2.y();
                            return;
                        }
                        return;
                    }
                }
                int size4 = arrayList.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    z1.b bVar6 = (z1.b) arrayList.get(i12);
                    if (bVar6.f37839i || !bVar6.f37838h || bVar6.f37835d) {
                        int size5 = arrayList.size();
                        while (i4 < size5) {
                            if (((z1.b) arrayList.get(i4)).f37839i) {
                                aVar2.y();
                                return;
                            }
                            i4++;
                        }
                        return;
                    }
                }
                ((z1.b) arrayList.get(0)).f37839i = true;
                a0Var2.v0(j, true);
                aVar3.invoke();
                aVar2.f37324b = null;
            }
        }
    }

    @Override // z1.c
    public final void K() {
        y4.a aVar = this.E;
        if (aVar != null) {
            aVar.y();
        }
    }

    @Override // i2.r1
    public final /* synthetic */ boolean R() {
        return false;
    }

    @Override // i2.r1
    public final void V() {
        u();
    }

    @Override // i2.u1
    public final boolean Y() {
        return true;
    }

    @Override // i2.u1
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // i1.m
    public final boolean c0() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, java.util.List] */
    @Override // i2.r1
    public final void d(c2.j jVar, c2.k kVar, long j) {
        long j8 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.A = (Float.floatToRawIntBits((int) (j8 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j8 >> 32)) << 32);
        x0();
        boolean z3 = this.f2357t;
        c2.k kVar2 = c2.k.f2635b;
        ck.c cVar = null;
        if (z3 && kVar == kVar2) {
            int i4 = jVar.f2629d;
            if (i4 == 4) {
                xk.x.v(b0(), null, null, new f(this, cVar, 0), 3);
            } else if (i4 == 5) {
                xk.x.v(b0(), null, null, new f(this, cVar, 1), 3);
            }
        }
        if (kVar != kVar2) {
            if (kVar != c2.k.f2636c || this.H == null) {
                return;
            }
            ?? r12 = jVar.f2626a;
            int size = r12.size();
            for (int i10 = 0; i10 < size; i10++) {
                c2.p pVar = (c2.p) r12.get(i10);
                if (pVar.b() && !pVar.equals(this.H)) {
                    this.H = null;
                    u0(false);
                    return;
                }
            }
            return;
        }
        c2.p pVar2 = this.H;
        if (pVar2 == null) {
            if (b2.c(jVar, true)) {
                c2.p pVar3 = (c2.p) jVar.f2626a.get(0);
                pVar3.a();
                this.H = pVar3;
                if (this.f2357t) {
                    w0(pVar3.f2660c, false);
                    return;
                }
                return;
            }
            return;
        }
        ?? r122 = jVar.f2626a;
        int size2 = r122.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (!c2.h0.b((c2.p) r122.get(i11))) {
                long jT = i2.k.s(this).f25650z.T(((y1) i2.k.h(this, j2.a1.f27084s)).b());
                float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jT >> 32)) - ((int) (j >> 32))) / 2.0f;
                float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (jT & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fMax) << 32) | (4294967295L & Float.floatToRawIntBits(fMax2));
                int size3 = r122.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    c2.p pVar4 = (c2.p) r122.get(i12);
                    if (pVar4.b() || c2.h0.e(pVar4, j, jFloatToRawIntBits)) {
                        this.H = null;
                        u0(false);
                        return;
                    }
                }
                return;
            }
        }
        ((c2.p) r122.get(0)).a();
        if (this.f2357t) {
            v0(pVar2.f2660c, false);
            this.f2358u.invoke();
        }
        this.H = null;
    }

    @Override // i2.z1
    public final Object e() {
        return this.G;
    }

    @Override // i2.r1
    public final long f() {
        return x1.f25814a;
    }

    @Override // i1.m
    public final void f0() {
        if (!this.D) {
            x0();
        }
        if (this.f2357t) {
            p0(this.f2359v);
        }
    }

    @Override // i1.m
    public final void g0() {
        u();
    }

    @Override // i1.m
    public final void h0() {
        t0();
        if (this.C == null) {
            this.f2354q = null;
        }
        i2.i iVar = this.f2360w;
        if (iVar != null) {
            q0(iVar);
        }
        this.f2360w = null;
    }

    @Override // i2.u1
    public final void l(p2.x xVar) {
        p2.h hVar = this.f2356s;
        if (hVar != null) {
            p2.v.a(xVar, hVar.f31050a);
        }
        a6.e eVar = new a6.e(4, this);
        tk.c[] cVarArr = p2.v.f31140a;
        xVar.a(p2.k.f31072b, new p2.a(null, eVar));
        if (this.f2357t) {
            this.f2359v.l(xVar);
        } else {
            xVar.a(p2.t.f31121i, yj.u.f37649a);
        }
        s0(xVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cd, code lost:
    
        if (((r7 & ((~r7) << 6)) & r14) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        r16 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(android.view.KeyEvent r24) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.a0.r(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t0() {
        /*
            r17 = this;
            r0 = r17
            e0.i r1 = r0.f2354q
            x.x r2 = r0.f2363z
            if (r1 == 0) goto L76
            e0.k r3 = r0.f2361x
            if (r3 == 0) goto L14
            e0.j r4 = new e0.j
            r4.<init>(r3)
            r1.b(r4)
        L14:
            e0.k r3 = r0.B
            if (r3 == 0) goto L20
            e0.j r4 = new e0.j
            r4.<init>(r3)
            r1.b(r4)
        L20:
            e0.f r3 = r0.f2362y
            if (r3 == 0) goto L2c
            e0.g r4 = new e0.g
            r4.<init>(r3)
            r1.b(r4)
        L2c:
            java.lang.Object[] r3 = r2.f36956c
            long[] r4 = r2.f36954a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L76
            r6 = 0
            r7 = r6
        L37:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L71
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L51:
            if (r12 >= r10) goto L6f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L6b
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            e0.k r13 = (e0.k) r13
            e0.j r14 = new e0.j
            r14.<init>(r13)
            r1.b(r14)
        L6b:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L51
        L6f:
            if (r10 != r11) goto L76
        L71:
            if (r7 == r5) goto L76
            int r7 = r7 + 1
            goto L37
        L76:
            r1 = 0
            r0.f2361x = r1
            r0.B = r1
            r0.f2362y = r1
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.a0.t0():void");
    }

    @Override // i2.r1
    public final void u() {
        e0.f fVar;
        e0.i iVar = this.f2354q;
        if (iVar != null && (fVar = this.f2362y) != null) {
            iVar.b(new e0.g(fVar));
        }
        this.f2362y = null;
        if (this.H != null) {
            this.H = null;
            u0(false);
        }
    }

    public final void u0(boolean z3) {
        e0.i iVar = this.f2354q;
        if (iVar != null) {
            xk.a0 a0Var = this.F;
            ck.c cVar = null;
            if (a0Var == null || !a0Var.c()) {
                e0.k kVar = z3 ? this.B : this.f2361x;
                if (kVar != null) {
                    e0.j jVar = new e0.j(kVar);
                    xk.y0 y0Var = (xk.y0) ((cl.d) b0()).f2910a.O(xk.s.f37235b);
                    xk.x.v(b0(), null, null, new bh.t(iVar, jVar, y0Var != null ? y0Var.m(new b7.b(8, iVar, jVar)) : null, cVar, 4), 3);
                }
            } else {
                xk.a0 a0Var2 = this.F;
                if (a0Var2 != null) {
                    a0Var2.e(null);
                }
            }
            if (z3) {
                this.B = null;
            } else {
                this.f2361x = null;
            }
        }
    }

    @Override // i2.u1
    public final /* synthetic */ boolean v() {
        return false;
    }

    public final void v0(long j, boolean z3) {
        e0.i iVar = this.f2354q;
        if (iVar != null) {
            xk.a0 a0Var = this.F;
            if (a0Var == null || !a0Var.c()) {
                e0.k kVar = z3 ? this.B : this.f2361x;
                if (kVar != null) {
                    xk.x.v(b0(), null, null, new c(kVar, iVar, (ck.c) null), 3);
                }
            } else {
                a0Var.e(null);
                xk.x.v(b0(), null, null, new b(a0Var, j, iVar, (ck.c) null, 0), 3);
            }
            if (z3) {
                this.B = null;
            } else {
                this.f2361x = null;
            }
        }
    }

    public final void w0(long j, boolean z3) {
        e0.i iVar = this.f2354q;
        if (iVar != null) {
            e0.k kVar = new e0.k(j);
            nk.q qVar = new nk.q();
            i2.k.v(this, d0.g1.f21735p, new b7.u(3, qVar));
            if (!qVar.f29982a) {
                int i4 = b0.f2372b;
                ViewParent parent = i2.k.u(this).getParent();
                while (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (!viewGroup.shouldDelayChildPressedState()) {
                        parent = viewGroup.getParent();
                    }
                }
                if (z3) {
                    this.B = kVar;
                } else {
                    this.f2361x = kVar;
                }
                xk.x.v(b0(), null, null, new c(iVar, kVar, (ck.c) null), 3);
                return;
            }
            this.F = xk.x.v(b0(), null, null, new d(iVar, kVar, z3, this, (ck.c) null), 3);
        }
    }

    public final void x0() {
        u0 u0Var;
        if (this.f2360w == null && (u0Var = this.f2355r) != null) {
            if (this.f2354q == null) {
                this.f2354q = new e0.i();
            }
            this.f2359v.u0(this.f2354q);
            e0.i iVar = this.f2354q;
            nk.k.b(iVar);
            i2.i iVarA = u0Var.a(iVar);
            p0(iVarA);
            this.f2360w = iVarA;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y0(e0.i r4, c0.u0 r5, boolean r6, p2.h r7, mk.a r8) {
        /*
            r3 = this;
            e0.i r0 = r3.C
            boolean r0 = nk.k.a(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.t0()
            r3.C = r4
            r3.f2354q = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            c0.u0 r0 = r3.f2355r
            boolean r0 = nk.k.a(r0, r5)
            if (r0 != 0) goto L1f
            r3.f2355r = r5
            r4 = r1
        L1f:
            boolean r5 = r3.f2357t
            c0.j0 r0 = r3.f2359v
            if (r5 == r6) goto L36
            if (r6 == 0) goto L2b
            r3.p0(r0)
            goto L31
        L2b:
            r3.q0(r0)
            r3.t0()
        L31:
            i2.k.l(r3)
            r3.f2357t = r6
        L36:
            p2.h r5 = r3.f2356s
            boolean r5 = nk.k.a(r5, r7)
            if (r5 != 0) goto L43
            r3.f2356s = r7
            i2.k.l(r3)
        L43:
            r3.f2358u = r8
            boolean r5 = r3.D
            e0.i r6 = r3.C
            if (r6 != 0) goto L4d
            r7 = r1
            goto L4e
        L4d:
            r7 = r2
        L4e:
            if (r5 == r7) goto L5c
            if (r6 != 0) goto L53
            r2 = r1
        L53:
            r3.D = r2
            if (r2 != 0) goto L5c
            i2.i r5 = r3.f2360w
            if (r5 != 0) goto L5c
            goto L5d
        L5c:
            r1 = r4
        L5d:
            if (r1 == 0) goto L72
            i2.i r4 = r3.f2360w
            if (r4 != 0) goto L67
            boolean r5 = r3.D
            if (r5 != 0) goto L72
        L67:
            if (r4 == 0) goto L6c
            r3.q0(r4)
        L6c:
            r4 = 0
            r3.f2360w = r4
            r3.x0()
        L72:
            e0.i r4 = r3.f2354q
            r0.u0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.a0.y0(e0.i, c0.u0, boolean, p2.h, mk.a):void");
    }

    @Override // i2.r1
    public final /* synthetic */ void B() {
    }

    @Override // i2.h1
    public final void P() {
    }

    public void s0(p2.x xVar) {
    }
}
