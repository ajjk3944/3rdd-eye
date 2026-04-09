package y;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import e2.r;
import ir.v;
import lq.b0;
import u.w;
import wt.z;
import x1.f0;
import x1.h1;
import x1.q1;
import x1.t1;
import x1.v1;
import x1.y1;
import y1.c1;
import y1.x1;

/* loaded from: classes.dex */
public final class h extends x1.j implements q1, q1.c, t1, y1, x1.h, h1 {
    public static final b I = new b();
    public a0.f A;
    public final w B;
    public long C;
    public a0.i D;
    public boolean E;
    public z F;
    public final b G;
    public r1.j H;

    /* renamed from: r, reason: collision with root package name */
    public a0.i f25582r;

    /* renamed from: s, reason: collision with root package name */
    public q f25583s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f25584t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f25585u;

    /* renamed from: v, reason: collision with root package name */
    public ar.a f25586v;

    /* renamed from: w, reason: collision with root package name */
    public final l f25587w;

    /* renamed from: x, reason: collision with root package name */
    public q f25588x;

    /* renamed from: y, reason: collision with root package name */
    public x1.i f25589y;

    /* renamed from: z, reason: collision with root package name */
    public a0.k f25590z;

    public h(a0.i iVar, q qVar, boolean z10, boolean z11, ar.a aVar) {
        this.f25582r = iVar;
        this.f25583s = qVar;
        this.f25584t = z10;
        this.f25585u = z11;
        this.f25586v = aVar;
        this.f25587w = new l(iVar, new bq.g(1, this, h.class, "onFocusChange", "onFocusChange(Z)V", 0, 11));
        int i10 = u.m.f23089a;
        this.B = new w(6);
        this.C = 0L;
        a0.i iVar2 = this.f25582r;
        this.D = iVar2;
        this.E = iVar2 == null;
        this.G = I;
    }

    @Override // x1.h1
    public final void E() {
        if (this.f25584t) {
            x1.k.p(this, new a(this, 0));
        }
    }

    @Override // x1.t1
    public final boolean M() {
        return true;
    }

    @Override // x1.t1
    public final void O(SemanticsConfiguration semanticsConfiguration) {
        a aVar = new a(this, 1);
        v[] vVarArr = r.f7759a;
        semanticsConfiguration.d(e2.g.f7687b, new e2.a(null, aVar));
        if (this.f25585u) {
            this.f25587w.O(semanticsConfiguration);
        } else {
            semanticsConfiguration.d(e2.p.f7741i, b0.f15562a);
        }
    }

    @Override // z0.l
    public final boolean R() {
        return false;
    }

    @Override // z0.l
    public final void U() {
        E();
        if (!this.E) {
            h0();
        }
        if (this.f25585u) {
            c0(this.f25587w);
        }
    }

    @Override // z0.l
    public final void V() {
        f0();
        if (this.D == null) {
            this.f25582r = null;
        }
        x1.i iVar = this.f25589y;
        if (iVar != null) {
            d0(iVar);
        }
        this.f25589y = null;
    }

    @Override // q1.c
    public final boolean e(KeyEvent keyEvent) {
        return false;
    }

    @Override // x1.y1
    public final Object f() {
        return this.G;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f0() {
        /*
            r17 = this;
            r0 = r17
            a0.i r1 = r0.f25582r
            u.w r2 = r0.B
            if (r1 == 0) goto L6a
            a0.k r3 = r0.f25590z
            if (r3 == 0) goto L14
            a0.j r4 = new a0.j
            r4.<init>(r3)
            r1.b(r4)
        L14:
            a0.f r3 = r0.A
            if (r3 == 0) goto L20
            a0.g r4 = new a0.g
            r4.<init>(r3)
            r1.b(r4)
        L20:
            java.lang.Object[] r3 = r2.f23119c
            long[] r4 = r2.f23117a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6a
            r6 = 0
            r7 = r6
        L2b:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L65
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L45:
            if (r12 >= r10) goto L63
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L5f
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            a0.k r13 = (a0.k) r13
            a0.j r14 = new a0.j
            r14.<init>(r13)
            r1.b(r14)
        L5f:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L45
        L63:
            if (r10 != r11) goto L6a
        L65:
            if (r7 == r5) goto L6a
            int r7 = r7 + 1
            goto L2b
        L6a:
            r1 = 0
            r0.f25590z = r1
            r0.A = r1
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.h.f0():void");
    }

    public final void g0() {
        a0.i iVar = this.f25582r;
        if (iVar != null) {
            z zVar = this.F;
            if (zVar == null || !zVar.b()) {
                a0.k kVar = this.f25590z;
                if (kVar != null) {
                    wt.w.s(Q(), null, null, new c(kVar, iVar, null, 0), 3);
                }
            } else {
                z zVar2 = this.F;
                if (zVar2 != null) {
                    zVar2.h(null);
                }
            }
            this.f25590z = null;
        }
    }

    public final void h0() {
        if (this.f25589y != null) {
            return;
        }
        q qVar = this.f25584t ? this.f25588x : this.f25583s;
        if (qVar != null) {
            if (this.f25582r == null) {
                this.f25582r = new a0.i();
            }
            this.f25587w.h0(this.f25582r);
            a0.i iVar = this.f25582r;
            br.l.b(iVar);
            x1.i iVarA = qVar.a(iVar);
            c0(iVarA);
            this.f25589y = iVarA;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // x1.q1
    public final void n(ag.b bVar, r1.f fVar, long j) {
        al.c cVar;
        char c4 = ' ';
        long j7 = 4294967295L;
        long j10 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.C = (Float.floatToRawIntBits((int) (j10 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j10 & 4294967295L)) & 4294967295L);
        h0();
        int i10 = 1;
        pq.c cVar2 = null;
        int i11 = 0;
        if (this.f25585u && fVar == r1.f.Main) {
            int i12 = bVar.f345d;
            if (i12 == 4) {
                wt.w.s(Q(), null, null, new f(this, cVar2, i11), 3);
            } else if (i12 == 5) {
                wt.w.s(Q(), null, null, new f(this, cVar2, i10), 3);
            }
        }
        if (fVar != r1.f.Main) {
            if (fVar != r1.f.Final || this.H == null) {
                return;
            }
            ?? r02 = bVar.f346g;
            int size = r02.size();
            for (int i13 = 0; i13 < size; i13++) {
                r1.j jVar = (r1.j) r02.get(i13);
                if (jVar.b() && !jVar.equals(this.H)) {
                    this.H = null;
                    g0();
                    return;
                }
            }
            return;
        }
        r1.j jVar2 = this.H;
        if (jVar2 != null) {
            ?? r03 = bVar.f346g;
            int size2 = r03.size();
            int i14 = 0;
            while (i14 < size2) {
                r1.j jVar3 = (r1.j) r03.get(i14);
                if (((jVar3.b() || !jVar3.f21173h || jVar3.f21169d) ? i11 : i10) == 0) {
                    long J = x1.k.r(this).f24817w.J(((x1) x1.k.h(this, c1.f25655s)).a());
                    long jFloatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (J & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (J >> c4)) - ((int) (j >> c4))) / 2.0f) << c4);
                    int size3 = r03.size();
                    int i15 = i11;
                    while (i15 < size3) {
                        r1.j jVar4 = (r1.j) r03.get(i15);
                        if (!jVar4.b()) {
                            int i16 = jVar4.f21174i == i10 ? i10 : i11;
                            long j11 = jVar4.f21168c;
                            long j12 = j7;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> c4));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & j12));
                            float f10 = i16;
                            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c4)) * f10;
                            float f11 = ((int) (j >> c4)) + fIntBitsToFloat3;
                            int i17 = size3;
                            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & j12)) * f10;
                            if (!((fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat > f11) | (fIntBitsToFloat2 > ((int) (j & j12)) + fIntBitsToFloat4))) {
                                i15++;
                                size3 = i17;
                                j7 = j12;
                                i10 = 1;
                                c4 = ' ';
                                i11 = 0;
                            }
                        }
                        this.H = null;
                        g0();
                        return;
                    }
                    return;
                }
                i14++;
                i10 = 1;
                c4 = ' ';
                i11 = 0;
            }
            ((r1.j) r03.get(i11)).a();
            if (this.f25585u) {
                long j13 = jVar2.f21168c;
                a0.i iVar = this.f25582r;
                if (iVar != null) {
                    z zVar = this.F;
                    if (zVar == null || !zVar.b()) {
                        a0.k kVar = this.f25590z;
                        if (kVar != null) {
                            wt.w.s(Q(), null, null, new c(kVar, iVar, null, 1), 3);
                        }
                    } else {
                        wt.w.s(Q(), null, null, new d(this, j13, iVar, null), 3);
                    }
                    this.f25590z = null;
                }
                this.f25586v.c();
            }
            this.H = null;
            return;
        }
        if (z.e.a(bVar, true)) {
            r1.j jVar5 = (r1.j) bVar.f346g.get(0);
            jVar5.a();
            this.H = jVar5;
            if (this.f25585u) {
                long j14 = jVar5.f21168c;
                a0.i iVar2 = this.f25582r;
                if (iVar2 != null) {
                    a0.k kVar2 = new a0.k(j14);
                    if (!this.f26495b.f26506o) {
                        u1.a.b("visitAncestors called on an unattached node");
                    }
                    z0.l lVar = this.f26495b.f26499f;
                    f0 f0VarR = x1.k.r(this);
                    while (f0VarR != null) {
                        if ((((z0.l) f0VarR.D.f825g).f26498e & 262144) != 0) {
                            while (lVar != null) {
                                if ((lVar.f26497d & 262144) != 0) {
                                    x1.j jVarE = lVar;
                                    ?? eVar = 0;
                                    while (jVarE != 0) {
                                        if (jVarE instanceof y1) {
                                            if (z.c.f26478p.equals(((y1) jVarE).f())) {
                                                throw new ClassCastException();
                                            }
                                        } else if ((jVarE.f26497d & 262144) != 0 && (jVarE instanceof x1.j)) {
                                            z0.l lVar2 = jVarE.f24863q;
                                            int i18 = 0;
                                            jVarE = jVarE;
                                            eVar = eVar;
                                            while (lVar2 != null) {
                                                if ((lVar2.f26497d & 262144) != 0) {
                                                    i18++;
                                                    eVar = eVar;
                                                    if (i18 == 1) {
                                                        jVarE = lVar2;
                                                    } else {
                                                        if (eVar == 0) {
                                                            eVar = new p0.e(new z0.l[16]);
                                                        }
                                                        if (jVarE != 0) {
                                                            eVar.b(jVarE);
                                                            jVarE = 0;
                                                        }
                                                        eVar.b(lVar2);
                                                    }
                                                }
                                                lVar2 = lVar2.f26500g;
                                                jVarE = jVarE;
                                                eVar = eVar;
                                            }
                                            if (i18 == 1) {
                                            }
                                        }
                                        jVarE = x1.k.e(eVar);
                                    }
                                }
                                lVar = lVar.f26499f;
                            }
                        }
                        f0VarR = f0VarR.C();
                        lVar = (f0VarR == null || (cVar = f0VarR.D) == null) ? null : (v1) cVar.f824f;
                    }
                    int i19 = i.f25592b;
                    if (!this.f26495b.f26506o) {
                        u1.a.b("Cannot get View because the Modifier node is not currently attached.");
                    }
                    ViewParent parent = ((View) x1.k.t(x1.k.r(this))).getParent();
                    while (parent != null && (parent instanceof ViewGroup)) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        if (viewGroup.shouldDelayChildPressedState()) {
                            this.F = wt.w.s(Q(), null, null, new au.e(iVar2, kVar2, this, cVar2, 11), 3);
                            return;
                        }
                        parent = viewGroup.getParent();
                    }
                    this.f25590z = kVar2;
                    wt.w.s(Q(), null, null, new c(iVar2, kVar2, null), 3);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ce, code lost:
    
        if (((r7 & ((~r7) << 6)) & r14) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        r16 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // q1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(android.view.KeyEvent r24) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.h.o(android.view.KeyEvent):boolean");
    }

    @Override // x1.q1
    public final void q() {
        a0.f fVar;
        a0.i iVar = this.f25582r;
        if (iVar != null && (fVar = this.A) != null) {
            iVar.b(new a0.g(fVar));
        }
        this.A = null;
        if (this.H != null) {
            this.H = null;
            g0();
        }
    }
}
