package x1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.gms.internal.measurement.e5;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class f1 extends m0 implements v1.q, v1.m, m1 {
    public static final g1.g0 J;
    public static final t K;
    public static final d1 L;
    public static final d1 M;
    public float A;
    public f1.a B;
    public t C;
    public j1.c D;
    public g1.p E;
    public b1.d F;
    public boolean H;
    public l1 I;

    /* renamed from: o, reason: collision with root package name */
    public final f0 f24821o;

    /* renamed from: p, reason: collision with root package name */
    public f1 f24822p;

    /* renamed from: q, reason: collision with root package name */
    public f1 f24823q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f24824r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f24825s;

    /* renamed from: t, reason: collision with root package name */
    public ar.k f24826t;

    /* renamed from: u, reason: collision with root package name */
    public t2.c f24827u;

    /* renamed from: v, reason: collision with root package name */
    public t2.i f24828v;

    /* renamed from: x, reason: collision with root package name */
    public l0 f24830x;

    /* renamed from: y, reason: collision with root package name */
    public u.y f24831y;

    /* renamed from: w, reason: collision with root package name */
    public float f24829w = 0.8f;

    /* renamed from: z, reason: collision with root package name */
    public long f24832z = 0;
    public final e1 G = new e1(this, 1);

    static {
        g1.g0 g0Var = new g1.g0();
        g0Var.f9219c = 1.0f;
        g0Var.f9220d = 1.0f;
        g0Var.f9221e = 1.0f;
        long j = g1.x.f9275a;
        g0Var.f9223g = j;
        g0Var.f9224h = j;
        g0Var.f9225i = 8.0f;
        g0Var.j = g1.l0.f9255a;
        g0Var.k = g1.f0.f9213a;
        g0Var.f9227m = 9205357640488583168L;
        g0Var.f9228n = new t2.d(1.0f, 1.0f);
        g0Var.f9229o = t2.i.Ltr;
        g0Var.f9230p = 3;
        J = g0Var;
        K = new t();
        L = new d1(0);
        M = new d1(1);
    }

    public f1(f0 f0Var) {
        this.f24821o = f0Var;
        this.f24827u = f0Var.f24817w;
        this.f24828v = f0Var.f24818x;
    }

    public final void A0(d1 d1Var, long j, p pVar, int i10, boolean z10) {
        boolean z11;
        boolean z12;
        z0.l lVarW0 = w0(d1Var.b());
        if (!U0(j)) {
            if (i10 == 1) {
                float fN0 = n0(j, u0());
                if ((Float.floatToRawIntBits(fN0) & Integer.MAX_VALUE) < 2139095040) {
                    if (pVar.f24908g != e5.z(pVar)) {
                        if (k.g(pVar.a(), k.a(fN0, false, false)) <= 0) {
                            return;
                        }
                    }
                    z0(lVarW0, d1Var, j, pVar, i10, false, fN0);
                    return;
                }
                return;
            }
            return;
        }
        if (lVarW0 == null) {
            B0(d1Var, j, pVar, i10, z10);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < K() && fIntBitsToFloat2 < I()) {
            y0(lVarW0, d1Var, j, pVar, i10, z10);
            return;
        }
        float fN02 = i10 == 1 ? n0(j, u0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fN02) & Integer.MAX_VALUE) < 2139095040) {
            if (pVar.f24908g != e5.z(pVar)) {
                z11 = z10;
                if (k.g(pVar.a(), k.a(fN02, z11, false)) > 0) {
                }
                K0(lVarW0, d1Var, j, pVar, i10, z11, fN02, z12);
            }
            z11 = z10;
            z12 = true;
            K0(lVarW0, d1Var, j, pVar, i10, z11, fN02, z12);
        }
        z11 = z10;
        z12 = false;
        K0(lVarW0, d1Var, j, pVar, i10, z11, fN02, z12);
    }

    @Override // v1.m
    public final f1.c B(v1.m mVar, boolean z10) {
        f1 f1Var;
        if (!v0().f26506o) {
            u1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!mVar.f()) {
            u1.a.b("LayoutCoordinates " + mVar + " is not attached!");
        }
        v1.p pVar = mVar instanceof v1.p ? (v1.p) mVar : null;
        if (pVar == null || (f1Var = pVar.f23804b.f24889o) == null) {
            f1Var = (f1) mVar;
        }
        f1Var.G0();
        f1 f1VarR0 = r0(f1Var);
        f1.a aVar = this.B;
        if (aVar == null) {
            aVar = new f1.a();
            this.B = aVar;
        }
        aVar.f8398b = 0.0f;
        aVar.f8399c = 0.0f;
        aVar.f8400d = (int) (mVar.h() >> 32);
        aVar.f8401e = (int) (mVar.h() & 4294967295L);
        while (f1Var != f1VarR0) {
            f1Var.N0(aVar, z10, false);
            if (aVar.b()) {
                return f1.c.f8403e;
            }
            f1Var = f1Var.f24823q;
            br.l.b(f1Var);
        }
        k0(f1VarR0, aVar, z10);
        return new f1.c(aVar.f8398b, aVar.f8399c, aVar.f8400d, aVar.f8401e);
    }

    public void B0(d1 d1Var, long j, p pVar, int i10, boolean z10) {
        f1 f1Var = this.f24822p;
        if (f1Var != null) {
            f1Var.A0(d1Var, f1Var.s0(j), pVar, i10, z10);
        }
    }

    public final void C0() {
        l1 l1Var = this.I;
        if (l1Var != null) {
            l1Var.invalidate();
            return;
        }
        f1 f1Var = this.f24823q;
        if (f1Var != null) {
            f1Var.C0();
        }
    }

    public final boolean D0() {
        if (this.I != null && this.f24829w <= 0.0f) {
            return true;
        }
        f1 f1Var = this.f24823q;
        if (f1Var != null) {
            return f1Var.D0();
        }
        return false;
    }

    public final long E0(v1.m mVar, long j) {
        f1 f1Var;
        boolean z10 = mVar instanceof v1.p;
        if (z10) {
            v1.p pVar = (v1.p) mVar;
            pVar.f23804b.f24889o.G0();
            return pVar.d(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        v1.p pVar2 = z10 ? (v1.p) mVar : null;
        if (pVar2 == null || (f1Var = pVar2.f23804b.f24889o) == null) {
            br.l.c(mVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            f1Var = (f1) mVar;
        }
        f1Var.G0();
        f1 f1VarR0 = r0(f1Var);
        while (f1Var != f1VarR0) {
            j = f1Var.Q0(j);
            f1Var = f1Var.f24823q;
            br.l.b(f1Var);
        }
        return l0(f1VarR0, j);
    }

    public final long F0(long j) {
        if (!v0().f26506o) {
            u1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        G0();
        for (f1 f1Var = this; f1Var != null; f1Var = f1Var.f24823q) {
            j = f1Var.Q0(j);
        }
        return j;
    }

    public final void G0() {
        this.f24821o.r().b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r7v9, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H0() {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.f1.H0():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void I0() {
        boolean zG = g1.g(128);
        z0.l lVarV0 = v0();
        if (!zG && (lVarV0 = lVarV0.f26499f) == null) {
            return;
        }
        for (z0.l lVarX0 = x0(zG); lVarX0 != null && (lVarX0.f26498e & 128) != 0; lVarX0 = lVarX0.f26500g) {
            if ((lVarX0.f26497d & 128) != 0) {
                j jVarE = lVarX0;
                ?? eVar = 0;
                while (jVarE != 0) {
                    if (jVarE instanceof u) {
                        ((u) jVarE).x(this);
                    } else if ((jVarE.f26497d & 128) != 0 && (jVarE instanceof j)) {
                        z0.l lVar = jVarE.f24863q;
                        int i10 = 0;
                        jVarE = jVarE;
                        eVar = eVar;
                        while (lVar != null) {
                            if ((lVar.f26497d & 128) != 0) {
                                i10++;
                                eVar = eVar;
                                if (i10 == 1) {
                                    jVarE = lVar;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new p0.e(new z0.l[16]);
                                    }
                                    if (jVarE != 0) {
                                        eVar.b(jVarE);
                                        jVarE = 0;
                                    }
                                    eVar.b(lVar);
                                }
                            }
                            lVar = lVar.f26500g;
                            jVarE = jVarE;
                            eVar = eVar;
                        }
                        if (i10 == 1) {
                        }
                    }
                    jVarE = k.e(eVar);
                }
            }
            if (lVarX0 == lVarV0) {
                return;
            }
        }
    }

    public final void J0() {
        this.f24824r = true;
        this.G.c();
        O0();
        if (i3.g.l(this.f24832z, 0L)) {
            return;
        }
        this.f24821o.e0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ce A[PHI: r8
  0x01ce: PHI (r8v6 p0.e) = (r8v1 p0.e), (r8v1 p0.e), (r8v8 p0.e) binds: [B:56:0x0193, B:58:0x0197, B:72:0x01c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K0(z0.l r22, x1.d1 r23, long r24, x1.p r26, int r27, boolean r28, float r29, boolean r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.f1.K0(z0.l, x1.d1, long, x1.p, int, boolean, float, boolean):void");
    }

    public abstract void L0(g1.p pVar, j1.c cVar);

    public final void M0(long j, float f10, ar.k kVar) {
        S0(kVar, false);
        boolean zL = i3.g.l(this.f24832z, j);
        f0 f0Var = this.f24821o;
        if (!zL) {
            ((AndroidComposeView) k.t(f0Var)).G(-4.0f);
            this.f24832z = j;
            f0Var.r().f24859p.T();
            l1 l1Var = this.I;
            if (l1Var != null) {
                ((y1.k1) l1Var).d(j);
            } else {
                f1 f1Var = this.f24823q;
                if (f1Var != null) {
                    f1Var.C0();
                }
            }
            f0Var.e0();
            m0.e0(this);
            Owner owner = f0Var.f24808n;
            if (owner != null) {
                ((AndroidComposeView) owner).u(f0Var);
            }
        }
        this.A = f10;
        if (!this.k) {
            U(a0());
        }
        if (this == ((f1) f0Var.D.f823e)) {
            k.t(f0Var).getRectManager().g(f0Var, !f0Var.x().f24963l);
        }
    }

    public final void N0(f1.a aVar, boolean z10, boolean z11) {
        l1 l1Var = this.I;
        if (l1Var != null) {
            if (this.f24825s) {
                if (z11) {
                    long jU0 = u0();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jU0 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jU0 & 4294967295L)) / 2.0f;
                    long j = this.f23811d;
                    aVar.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j >> 32)) + fIntBitsToFloat, ((int) (j & 4294967295L)) + fIntBitsToFloat2);
                } else if (z10) {
                    long j7 = this.f23811d;
                    aVar.a(0.0f, 0.0f, (int) (j7 >> 32), (int) (j7 & 4294967295L));
                }
                if (aVar.b()) {
                    return;
                }
            }
            y1.k1 k1Var = (y1.k1) l1Var;
            float[] fArrB = k1Var.b();
            if (!k1Var.O) {
                if (fArrB == null) {
                    aVar.f8398b = 0.0f;
                    aVar.f8399c = 0.0f;
                    aVar.f8400d = 0.0f;
                    aVar.f8401e = 0.0f;
                } else {
                    g1.f0.l(fArrB, aVar);
                }
            }
        }
        long j10 = this.f24832z;
        float f10 = (int) (j10 >> 32);
        aVar.f8398b += f10;
        aVar.f8400d += f10;
        float f11 = (int) (j10 & 4294967295L);
        aVar.f8399c += f11;
        aVar.f8401e += f11;
    }

    public final void O0() {
        if (this.I != null) {
            S0(null, false);
            this.f24821o.m0(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [p0.e] */
    public final void P0(l0 l0Var) {
        f1 f1Var;
        l0 l0Var2 = this.f24830x;
        if (l0Var != l0Var2) {
            this.f24830x = l0Var;
            f0 f0Var = this.f24821o;
            int i10 = 0;
            if (l0Var2 == null || l0Var.d() != l0Var2.d() || l0Var.b() != l0Var2.b()) {
                int iD = l0Var.d();
                int iB = l0Var.b();
                l1 l1Var = this.I;
                if (l1Var != null) {
                    ((y1.k1) l1Var).e((iD << 32) | (iB & 4294967295L));
                } else if (f0Var.T() && (f1Var = this.f24823q) != null) {
                    f1Var.C0();
                }
                O((iB & 4294967295L) | (iD << 32));
                if (this.f24826t != null) {
                    T0(false);
                }
                boolean zG = g1.g(4);
                z0.l lVarV0 = v0();
                if (zG || (lVarV0 = lVarV0.f26499f) != null) {
                    for (z0.l lVarX0 = x0(zG); lVarX0 != null && (lVarX0.f26498e & 4) != 0; lVarX0 = lVarX0.f26500g) {
                        if ((lVarX0.f26497d & 4) != 0) {
                            j jVarE = lVarX0;
                            ?? eVar = 0;
                            while (jVarE != 0) {
                                if (jVarE instanceof m) {
                                    ((m) jVarE).s();
                                } else if ((jVarE.f26497d & 4) != 0 && (jVarE instanceof j)) {
                                    z0.l lVar = jVarE.f24863q;
                                    int i11 = 0;
                                    jVarE = jVarE;
                                    eVar = eVar;
                                    while (lVar != null) {
                                        if ((lVar.f26497d & 4) != 0) {
                                            i11++;
                                            eVar = eVar;
                                            if (i11 == 1) {
                                                jVarE = lVar;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new p0.e(new z0.l[16]);
                                                }
                                                if (jVarE != 0) {
                                                    eVar.b(jVarE);
                                                    jVarE = 0;
                                                }
                                                eVar.b(lVar);
                                            }
                                        }
                                        lVar = lVar.f26500g;
                                        jVarE = jVarE;
                                        eVar = eVar;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                jVarE = k.e(eVar);
                            }
                        }
                        if (lVarX0 == lVarV0) {
                            break;
                        }
                    }
                }
                Owner owner = f0Var.f24808n;
                if (owner != null) {
                    ((AndroidComposeView) owner).u(f0Var);
                }
            }
            u.y yVar = this.f24831y;
            if ((yVar == null || yVar.f23132e == 0) && l0Var.a().isEmpty()) {
                return;
            }
            u.y yVar2 = this.f24831y;
            Map mapA = l0Var.a();
            if (yVar2 != null && yVar2.f23132e == mapA.size()) {
                Object[] objArr = yVar2.f23129b;
                int[] iArr = yVar2.f23130c;
                long[] jArr = yVar2.f23128a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i12 = 0;
                loop0: while (true) {
                    long j = jArr[i12];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = i10; i14 < i13; i14++) {
                            if ((255 & j) < 128) {
                                int i15 = (i12 << 3) + i14;
                                Object obj = objArr[i15];
                                int i16 = iArr[i15];
                                Integer num = (Integer) mapA.get((v1.h) obj);
                                if (num == null || num.intValue() != i16) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i13 != 8) {
                            return;
                        }
                    }
                    if (i12 == length) {
                        return;
                    }
                    i12++;
                    i10 = 0;
                }
            }
            f0Var.r().f24859p.f24974w.f();
            u.y yVar3 = this.f24831y;
            if (yVar3 == null) {
                u.y yVar4 = u.e0.f23063a;
                yVar3 = new u.y();
                this.f24831y = yVar3;
            }
            yVar3.a();
            for (Map.Entry entry : l0Var.a().entrySet()) {
                yVar3.h(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final long Q0(long j) {
        l1 l1Var = this.I;
        if (l1Var != null) {
            j = ((y1.k1) l1Var).c(j, false);
        }
        long j7 = this.f24832z;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j7 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final f1.c R0() {
        if (v0().f26506o) {
            v1.m mVarS = e5.s(this);
            f1.a aVar = this.B;
            if (aVar == null) {
                aVar = new f1.a();
                this.B = aVar;
            }
            long jM0 = m0(u0());
            int i10 = (int) (jM0 >> 32);
            aVar.f8398b = -Float.intBitsToFloat(i10);
            int i11 = (int) (jM0 & 4294967295L);
            aVar.f8399c = -Float.intBitsToFloat(i11);
            aVar.f8400d = Float.intBitsToFloat(i10) + K();
            aVar.f8401e = Float.intBitsToFloat(i11) + I();
            f1 f1Var = this;
            while (f1Var != mVarS) {
                f1Var.N0(aVar, false, true);
                if (!aVar.b()) {
                    f1Var = f1Var.f24823q;
                    br.l.b(f1Var);
                }
            }
            return new f1.c(aVar.f8398b, aVar.f8399c, aVar.f8400d, aVar.f8401e);
        }
        return f1.c.f8403e;
    }

    public final void S0(ar.k kVar, boolean z10) {
        Owner owner;
        p0.e eVar;
        Reference referencePoll;
        b1.d dVar;
        p0.e eVar2;
        Reference referencePoll2;
        Object obj;
        f0 f0Var = this.f24821o;
        boolean z11 = (!z10 && this.f24826t == kVar && br.l.a(this.f24827u, f0Var.f24817w) && this.f24828v == f0Var.f24818x) ? false : true;
        this.f24827u = f0Var.f24817w;
        this.f24828v = f0Var.f24818x;
        boolean zS = f0Var.S();
        e1 e1Var = this.G;
        if (!zS || kVar == null) {
            this.f24826t = null;
            l1 l1Var = this.I;
            if (l1Var != null) {
                y1.k1 k1Var = (y1.k1) l1Var;
                AndroidComposeView androidComposeView = k1Var.f25729g;
                if (!g1.f0.j(k1Var.b())) {
                    f0Var.e0();
                }
                k1Var.f25730r = null;
                k1Var.f25731x = null;
                k1Var.B = true;
                if (k1Var.F) {
                    k1Var.F = false;
                    androidComposeView.s(k1Var, false);
                }
                g1.w wVar = k1Var.f25728d;
                if (wVar != null) {
                    wVar.k(k1Var.f25727a);
                    xr.a aVar = androidComposeView.O0;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) aVar.f25483g;
                        eVar = (p0.e) aVar.f25482d;
                        referencePoll = referenceQueue.poll();
                        if (referencePoll != null) {
                            eVar.j(referencePoll);
                        }
                    } while (referencePoll != null);
                    eVar.b(new WeakReference(k1Var, (ReferenceQueue) aVar.f25483g));
                    androidComposeView.T.remove(k1Var);
                }
                f0Var.F = true;
                e1Var.c();
                if (v0().f26506o && f0Var.T() && (owner = f0Var.f24808n) != null) {
                    ((AndroidComposeView) owner).u(f0Var);
                }
            }
            this.I = null;
            this.H = false;
            return;
        }
        this.f24826t = kVar;
        if (this.I != null) {
            if (z11 && T0(true)) {
                f0Var.e0();
                k.t(f0Var).getRectManager().f(f0Var);
                return;
            }
            return;
        }
        Owner ownerT = k.t(f0Var);
        b1.d dVar2 = this.F;
        if (dVar2 == null) {
            b1.d dVar3 = new b1.d(this, 3, new e1(this, 0));
            this.F = dVar3;
            dVar = dVar3;
        } else {
            dVar = dVar2;
        }
        AndroidComposeView androidComposeView2 = (AndroidComposeView) ownerT;
        xr.a aVar2 = androidComposeView2.O0;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) aVar2.f25483g;
            eVar2 = (p0.e) aVar2.f25482d;
            referencePoll2 = referenceQueue2.poll();
            if (referencePoll2 != null) {
                eVar2.j(referencePoll2);
            }
        } while (referencePoll2 != null);
        while (true) {
            int i10 = eVar2.f20232g;
            if (i10 == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) eVar2.k(i10 - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        l1 k1Var2 = (l1) obj;
        if (k1Var2 != null) {
            y1.k1 k1Var3 = (y1.k1) k1Var2;
            g1.w wVar2 = k1Var3.f25728d;
            if (wVar2 == null) {
                throw c7.a.h("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!k1Var3.f25727a.f13066s) {
                u1.a.a("layer should have been released before reuse");
            }
            k1Var3.f25727a = wVar2.m();
            k1Var3.B = false;
            k1Var3.f25730r = dVar;
            k1Var3.f25731x = e1Var;
            k1Var3.M = false;
            k1Var3.N = false;
            k1Var3.O = true;
            g1.f0.m(k1Var3.D);
            float[] fArr = k1Var3.E;
            if (fArr != null) {
                g1.f0.m(fArr);
            }
            k1Var3.K = g1.l0.f9255a;
            k1Var3.P = false;
            long j = Integer.MAX_VALUE;
            k1Var3.f25732y = (j & 4294967295L) | (j << 32);
            k1Var3.L = null;
            k1Var3.J = 0;
        } else {
            k1Var2 = new y1.k1(androidComposeView2.getGraphicsContext().m(), androidComposeView2.getGraphicsContext(), androidComposeView2, dVar, e1Var);
        }
        y1.k1 k1Var4 = (y1.k1) k1Var2;
        k1Var4.e(this.f23811d);
        k1Var4.d(this.f24832z);
        this.I = k1Var2;
        T0(true);
        f0Var.F = true;
        e1Var.c();
    }

    public final boolean T0(boolean z10) {
        long j;
        long j7;
        f0 f0Var;
        boolean z11;
        boolean z12;
        f0 f0Var2;
        Owner owner;
        ar.a aVar;
        ar.a aVar2;
        l1 l1Var = this.I;
        if (l1Var == null) {
            if (this.f24826t == null) {
                return false;
            }
            u1.a.b("null layer with a non-null layerBlock");
            return false;
        }
        ar.k kVar = this.f24826t;
        if (kVar == null) {
            throw c7.a.h("updateLayerParameters requires a non-null layerBlock");
        }
        g1.g0 g0Var = J;
        if (g0Var.f9219c != 1.0f) {
            g0Var.f9218b |= 1;
            g0Var.f9219c = 1.0f;
        }
        if (g0Var.f9220d != 1.0f) {
            g0Var.f9218b |= 2;
            g0Var.f9220d = 1.0f;
        }
        if (g0Var.f9221e != 1.0f) {
            g0Var.f9218b |= 4;
            g0Var.f9221e = 1.0f;
        }
        g0Var.b(0.0f);
        long j10 = g1.x.f9275a;
        g0Var.a(j10);
        g0Var.d(j10);
        if (g0Var.f9225i != 8.0f) {
            g0Var.f9218b |= 2048;
            g0Var.f9225i = 8.0f;
        }
        long j11 = g1.l0.f9255a;
        if (g0Var.j != j11) {
            g0Var.f9218b |= 4096;
            g0Var.j = j11;
        }
        g0Var.c(g1.f0.f9213a);
        if (g0Var.f9226l) {
            g0Var.f9218b |= 16384;
            g0Var.f9226l = false;
        }
        if (g0Var.f9230p != 3) {
            g0Var.f9218b |= 524288;
            g0Var.f9230p = 3;
        }
        g0Var.f9227m = 9205357640488583168L;
        g0Var.f9231q = null;
        g0Var.f9218b = 0;
        f0 f0Var3 = this.f24821o;
        g0Var.f9228n = f0Var3.f24817w;
        g0Var.f9229o = f0Var3.f24818x;
        g0Var.f9227m = kc.f.V(this.f23811d);
        k.t(f0Var3).getSnapshotObserver().a(this, d.f24781y, new pp.c(14, kVar));
        t tVar = this.C;
        if (tVar == null) {
            tVar = new t();
            this.C = tVar;
        }
        t tVar2 = K;
        tVar2.getClass();
        tVar2.f24934a = tVar.f24934a;
        tVar2.f24935b = tVar.f24935b;
        tVar2.f24936c = tVar.f24936c;
        tVar2.f24937d = tVar.f24937d;
        float f10 = g0Var.f9219c;
        tVar.f24934a = f10;
        tVar.f24935b = g0Var.f9220d;
        tVar.f24936c = g0Var.f9225i;
        long j12 = g0Var.j;
        tVar.f24937d = j12;
        y1.k1 k1Var = (y1.k1) l1Var;
        AndroidComposeView androidComposeView = k1Var.f25729g;
        int i10 = g0Var.f9218b | k1Var.J;
        k1Var.H = g0Var.f9229o;
        k1Var.G = g0Var.f9228n;
        int i11 = i10 & 4096;
        if (i11 != 0) {
            k1Var.K = j12;
        }
        if ((i10 & 1) != 0) {
            j1.e eVar = k1Var.f25727a.f13050a;
            if (eVar.b() != f10) {
                eVar.z(f10);
            }
        }
        if ((i10 & 2) != 0) {
            j1.c cVar = k1Var.f25727a;
            float f11 = g0Var.f9220d;
            j1.e eVar2 = cVar.f13050a;
            if (eVar2.L() != f11) {
                eVar2.i(f11);
            }
        }
        if ((i10 & 4) != 0) {
            j1.c cVar2 = k1Var.f25727a;
            float f12 = g0Var.f9221e;
            j1.e eVar3 = cVar2.f13050a;
            if (eVar3.a() != f12) {
                eVar3.q(f12);
            }
        }
        if ((i10 & 8) != 0) {
            j1.e eVar4 = k1Var.f25727a.f13050a;
            if (eVar4.B() != 0.0f) {
                eVar4.C();
            }
        }
        if ((i10 & 16) != 0) {
            j1.e eVar5 = k1Var.f25727a.f13050a;
            if (eVar5.r() != 0.0f) {
                eVar5.s();
            }
        }
        if ((i10 & 32) != 0) {
            j1.c cVar3 = k1Var.f25727a;
            float f13 = g0Var.f9222f;
            j1.e eVar6 = cVar3.f13050a;
            if (eVar6.K() != f13) {
                eVar6.c(f13);
                cVar3.f13056g = true;
                cVar3.a();
            }
            if (g0Var.f9222f > 0.0f && !k1Var.P && (aVar2 = k1Var.f25731x) != null) {
                aVar2.c();
            }
        }
        if ((i10 & 64) != 0) {
            j1.c cVar4 = k1Var.f25727a;
            long j13 = g0Var.f9223g;
            j1.e eVar7 = cVar4.f13050a;
            j = j11;
            if (!g1.r.c(j13, eVar7.o())) {
                eVar7.v(j13);
            }
        } else {
            j = j11;
        }
        if ((i10 & 128) != 0) {
            j1.c cVar5 = k1Var.f25727a;
            long j14 = g0Var.f9224h;
            j1.e eVar8 = cVar5.f13050a;
            if (!g1.r.c(j14, eVar8.u())) {
                eVar8.H(j14);
            }
        }
        if ((i10 & 1024) != 0) {
            j1.e eVar9 = k1Var.f25727a.f13050a;
            if (eVar9.m() != 0.0f) {
                eVar9.G();
            }
        }
        if ((i10 & 256) != 0) {
            j1.e eVar10 = k1Var.f25727a.f13050a;
            if (eVar10.E() != 0.0f) {
                eVar10.p();
            }
        }
        if ((i10 & 512) != 0) {
            j1.e eVar11 = k1Var.f25727a.f13050a;
            if (eVar11.k() != 0.0f) {
                eVar11.t();
            }
        }
        if ((i10 & 2048) != 0) {
            j1.c cVar6 = k1Var.f25727a;
            float f14 = g0Var.f9225i;
            j1.e eVar12 = cVar6.f13050a;
            if (eVar12.A() != f14) {
                eVar12.J(f14);
            }
        }
        if (i11 != 0) {
            if (k1Var.K == j) {
                j1.c cVar7 = k1Var.f25727a;
                j7 = 4294967295L;
                if (!f1.b.a(cVar7.f13069v, 9205357640488583168L)) {
                    cVar7.f13069v = 9205357640488583168L;
                    cVar7.f13050a.n(9205357640488583168L);
                }
            } else {
                j7 = 4294967295L;
                j1.c cVar8 = k1Var.f25727a;
                long jFloatToRawIntBits = (Float.floatToRawIntBits(g1.l0.b(k1Var.K) * ((int) (k1Var.f25732y & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(g1.l0.a(r10) * ((int) (k1Var.f25732y >> 32))) << 32);
                if (!f1.b.a(cVar8.f13069v, jFloatToRawIntBits)) {
                    cVar8.f13069v = jFloatToRawIntBits;
                    cVar8.f13050a.n(jFloatToRawIntBits);
                }
            }
        } else {
            j7 = 4294967295L;
        }
        if ((i10 & 16384) != 0) {
            j1.c cVar9 = k1Var.f25727a;
            boolean z13 = g0Var.f9226l;
            if (cVar9.f13070w != z13) {
                cVar9.f13070w = z13;
                cVar9.f13056g = true;
                cVar9.a();
            }
        }
        if ((131072 & i10) != 0) {
            j1.e eVar13 = k1Var.f25727a.f13050a;
        }
        if ((262144 & i10) != 0) {
            j1.e eVar14 = k1Var.f25727a.f13050a;
            if (!br.l.a(eVar14.h(), null)) {
                eVar14.y();
            }
        }
        if ((i10 & 524288) != 0) {
            j1.c cVar10 = k1Var.f25727a;
            int i12 = g0Var.f9230p;
            j1.e eVar15 = cVar10.f13050a;
            if (eVar15.M() != i12) {
                eVar15.e(i12);
            }
        }
        if ((32768 & i10) != 0) {
            j1.e eVar16 = k1Var.f25727a.f13050a;
            if (eVar16.g() != 0) {
                eVar16.F(0);
            }
        }
        if ((i10 & 7963) != 0) {
            k1Var.M = true;
            k1Var.N = true;
        }
        if (br.l.a(k1Var.L, g0Var.f9231q)) {
            f0Var = f0Var3;
            z11 = true;
            z12 = false;
        } else {
            g1.f0 f0Var4 = g0Var.f9231q;
            k1Var.L = f0Var4;
            if (f0Var4 == null) {
                f0Var = f0Var3;
                z11 = true;
            } else {
                j1.c cVar11 = k1Var.f25727a;
                if (f0Var4 instanceof g1.a0) {
                    f1.c cVar12 = ((g1.a0) f0Var4).f9197e;
                    float f15 = cVar12.f8404a;
                    float f16 = cVar12.f8405b;
                    f0Var = f0Var3;
                    cVar11.f((Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(f16) & j7), (Float.floatToRawIntBits(cVar12.f8406c - f15) << 32) | (Float.floatToRawIntBits(cVar12.f8407d - f16) & j7), 0.0f);
                } else {
                    f0Var = f0Var3;
                    if (f0Var4 instanceof g1.z) {
                        g1.i iVar = ((g1.z) f0Var4).f9276e;
                        cVar11.k = null;
                        cVar11.f13058i = 9205357640488583168L;
                        cVar11.f13057h = 0L;
                        cVar11.j = 0.0f;
                        cVar11.f13056g = true;
                        cVar11.f13061n = false;
                        cVar11.f13059l = iVar;
                        cVar11.a();
                    } else {
                        if (!(f0Var4 instanceof g1.b0)) {
                            throw new bf.n();
                        }
                        g1.b0 b0Var = (g1.b0) f0Var4;
                        g1.i iVar2 = b0Var.f9202f;
                        if (iVar2 != null) {
                            cVar11.k = null;
                            cVar11.f13058i = 9205357640488583168L;
                            cVar11.f13057h = 0L;
                            cVar11.j = 0.0f;
                            z11 = true;
                            cVar11.f13056g = true;
                            cVar11.f13061n = false;
                            cVar11.f13059l = iVar2;
                            cVar11.a();
                        } else {
                            z11 = true;
                            cVar11.f((Float.floatToRawIntBits(r9.f8408a) << 32) | (Float.floatToRawIntBits(r9.f8409b) & j7), (Float.floatToRawIntBits(r9.b()) << 32) | (Float.floatToRawIntBits(r9.a()) & j7), Float.intBitsToFloat((int) (b0Var.f9201e.f8415h >> 32)));
                        }
                        if ((f0Var4 instanceof g1.z) && Build.VERSION.SDK_INT < 33 && (aVar = k1Var.f25731x) != null) {
                            aVar.c();
                        }
                    }
                }
                z11 = true;
                if (f0Var4 instanceof g1.z) {
                    aVar.c();
                }
            }
            z12 = z11;
        }
        k1Var.J = g0Var.f9218b;
        if (i10 != 0 || z12) {
            if (Build.VERSION.SDK_INT >= 26) {
                ViewParent parent = androidComposeView.getParent();
                if (parent != null) {
                    parent.onDescendantInvalidated(androidComposeView, androidComposeView);
                }
            } else {
                androidComposeView.invalidate();
            }
            if (androidComposeView.f1186y) {
                androidComposeView.G(0.0f);
            }
        }
        boolean z14 = this.f24825s;
        boolean z15 = g0Var.f9226l;
        this.f24825s = z15;
        this.f24829w = g0Var.f9221e;
        boolean z16 = (tVar2.f24934a == tVar.f24934a && tVar2.f24935b == tVar.f24935b && tVar2.f24936c == tVar.f24936c && tVar2.f24937d == tVar.f24937d) ? z11 : false;
        boolean z17 = !z16;
        if (z10 && ((!z16 || z14 != z15) && (owner = (f0Var2 = f0Var).f24808n) != null)) {
            ((AndroidComposeView) owner).u(f0Var2);
        }
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean U0(long r26) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.f1.U0(long):boolean");
    }

    @Override // x1.m0
    public final m0 W() {
        return this.f24822p;
    }

    @Override // x1.m0
    public final boolean Y() {
        return this.f24830x != null;
    }

    @Override // x1.m0
    public final f0 Z() {
        return this.f24821o;
    }

    @Override // v1.m
    public final long a(long j) {
        long jF0 = F0(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) k.t(this.f24821o);
        androidComposeView.y();
        return g1.f0.k(jF0, androidComposeView.f1175p0);
    }

    @Override // x1.m0
    public final l0 a0() {
        l0 l0Var = this.f24830x;
        if (l0Var != null) {
            return l0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // v1.m
    public final long b(v1.m mVar, long j) {
        return E0(mVar, j);
    }

    @Override // x1.m0
    public final m0 b0() {
        return this.f24823q;
    }

    @Override // x1.m0
    public final long c0() {
        return this.f24832z;
    }

    @Override // v1.m
    public final boolean f() {
        return v0().f26506o;
    }

    @Override // t2.c
    public final float getDensity() {
        return this.f24821o.f24817w.getDensity();
    }

    @Override // x1.m0
    public final t2.i getLayoutDirection() {
        return this.f24821o.f24818x;
    }

    @Override // v1.m
    public final long h() {
        return this.f23811d;
    }

    @Override // x1.m1
    public final boolean j() {
        return (this.I == null || this.f24824r || !this.f24821o.S()) ? false : true;
    }

    @Override // x1.m0
    public final void j0() {
        N(this.f24832z, this.A, this.f24826t);
    }

    public final void k0(f1 f1Var, f1.a aVar, boolean z10) {
        if (f1Var == this) {
            return;
        }
        f1 f1Var2 = this.f24823q;
        if (f1Var2 != null) {
            f1Var2.k0(f1Var, aVar, z10);
        }
        long j = this.f24832z;
        float f10 = (int) (j >> 32);
        aVar.f8398b -= f10;
        aVar.f8400d -= f10;
        float f11 = (int) (j & 4294967295L);
        aVar.f8399c -= f11;
        aVar.f8401e -= f11;
        l1 l1Var = this.I;
        if (l1Var != null) {
            y1.k1 k1Var = (y1.k1) l1Var;
            float[] fArrA = k1Var.a();
            if (!k1Var.O) {
                if (fArrA == null) {
                    aVar.f8398b = 0.0f;
                    aVar.f8399c = 0.0f;
                    aVar.f8400d = 0.0f;
                    aVar.f8401e = 0.0f;
                } else {
                    g1.f0.l(fArrA, aVar);
                }
            }
            if (this.f24825s && z10) {
                long j7 = this.f23811d;
                aVar.a(0.0f, 0.0f, (int) (j7 >> 32), (int) (j7 & 4294967295L));
            }
        }
    }

    public final long l0(f1 f1Var, long j) {
        if (f1Var == this) {
            return j;
        }
        f1 f1Var2 = this.f24823q;
        return (f1Var2 == null || br.l.a(f1Var, f1Var2)) ? s0(j) : s0(f1Var2.l0(f1Var, j));
    }

    public final long m0(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - K();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - I();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        float fMax2 = Math.max(0.0f, fIntBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(fMax2) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final float n0(long j, long j7) {
        if (K() >= Float.intBitsToFloat((int) (j7 >> 32)) && I() >= Float.intBitsToFloat((int) (j7 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM0 = m0(j7);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - K());
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f ? -r9 : r9 - I())) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i10 = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i10) <= fIntBitsToFloat) {
                int i11 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i11) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i10);
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i11);
                    return (fIntBitsToFloat5 * fIntBitsToFloat5) + (fIntBitsToFloat4 * fIntBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void o0(g1.p pVar, j1.c cVar) {
        boolean z10;
        Canvas canvas;
        boolean z11;
        boolean z12;
        float f10;
        l1 l1Var = this.I;
        if (l1Var == null) {
            long j = this.f24832z;
            float f11 = (int) (j >> 32);
            float f12 = (int) (j & 4294967295L);
            pVar.m(f11, f12);
            p0(pVar, cVar);
            pVar.m(-f11, -f12);
            return;
        }
        y1.k1 k1Var = (y1.k1) l1Var;
        i1.b bVar = k1Var.I;
        k1Var.f();
        k1Var.P = k1Var.f25727a.f13050a.K() > 0.0f;
        bm.d dVar = bVar.f11141c;
        bm.d dVar2 = bVar.f11141c;
        dVar.O(pVar);
        dVar.f2827g = cVar;
        j1.c cVar2 = k1Var.f25727a;
        g1.p pVarY = dVar2.y();
        j1.c cVar3 = (j1.c) dVar2.f2827g;
        j1.e eVar = cVar2.f13050a;
        if (cVar2.f13066s) {
            return;
        }
        cVar2.a();
        if (!eVar.l()) {
            try {
                cVar2.f13050a.x(cVar2.f13051b, cVar2.f13052c, cVar2, cVar2.f13054e);
            } catch (Throwable unused) {
            }
        }
        boolean z13 = eVar.K() > 0.0f;
        if (z13) {
            pVarY.p();
        }
        Canvas canvasA = g1.c.a(pVarY);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j7 = cVar2.f13067t;
            float f13 = (int) (j7 >> 32);
            float f14 = (int) (j7 & 4294967295L);
            long j10 = cVar2.f13068u;
            float f15 = ((int) (j10 >> 32)) + f13;
            float f16 = f14 + ((int) (j10 & 4294967295L));
            float fA = eVar.a();
            g1.m mVarH = eVar.h();
            int iM = eVar.M();
            if (fA < 1.0f || iM != 3 || mVarH != null || eVar.g() == 1) {
                yb.k kVarE = cVar2.f13063p;
                if (kVarE == null) {
                    kVarE = g1.f0.e();
                    cVar2.f13063p = kVarE;
                }
                kVarE.b(fA);
                kVarE.c(iM);
                kVarE.e(mVarH);
                f10 = f13;
                canvasA.saveLayer(f10, f14, f15, f16, (Paint) kVarE.f26241b);
            } else {
                canvasA.save();
                f10 = f13;
            }
            canvasA.translate(f10, f14);
            canvasA.concat(eVar.I());
        }
        boolean z14 = !zIsHardwareAccelerated && cVar2.f13070w;
        if (z14) {
            pVarY.g();
            g1.f0 f0VarD = cVar2.d();
            if (f0VarD instanceof g1.a0) {
                g1.p.o(pVarY, ((g1.a0) f0VarD).f9197e);
            } else if (f0VarD instanceof g1.b0) {
                g1.i iVarA = cVar2.f13060m;
                if (iVarA != null) {
                    iVarA.f9238a.rewind();
                } else {
                    iVarA = g1.l.a();
                    cVar2.f13060m = iVarA;
                }
                g1.i.a(iVarA, ((g1.b0) f0VarD).f9201e);
                pVarY.i(iVarA);
            } else {
                if (!(f0VarD instanceof g1.z)) {
                    throw new bf.n();
                }
                pVarY.i(((g1.z) f0VarD).f9276e);
            }
        }
        if (cVar3 != null) {
            g1.f fVar = cVar3.f13065r;
            if (!fVar.f9208a) {
                g1.y.a("Only add dependencies during a tracking");
            }
            u.b0 b0Var = (u.b0) fVar.f9211r;
            if (b0Var != null) {
                b0Var.a(cVar2);
            } else if (((j1.c) fVar.f9209d) != null) {
                int i10 = u.h0.f23073a;
                u.b0 b0Var2 = new u.b0();
                j1.c cVar4 = (j1.c) fVar.f9209d;
                br.l.b(cVar4);
                b0Var2.a(cVar4);
                b0Var2.a(cVar2);
                fVar.f9211r = b0Var2;
                fVar.f9209d = null;
            } else {
                fVar.f9209d = cVar2;
            }
            u.b0 b0Var3 = (u.b0) fVar.f9212x;
            if (b0Var3 != null) {
                z12 = !b0Var3.k(cVar2);
            } else if (((j1.c) fVar.f9210g) != cVar2) {
                z12 = true;
            } else {
                fVar.f9210g = null;
                z12 = false;
            }
            if (z12) {
                cVar2.f13064q++;
            }
        }
        if (g1.c.a(pVarY).isHardwareAccelerated()) {
            z10 = z13;
            canvas = canvasA;
            z11 = z14;
            eVar.w(pVarY);
        } else {
            i1.b bVar2 = cVar2.f13062o;
            if (bVar2 == null) {
                bVar2 = new i1.b();
                cVar2.f13062o = bVar2;
            }
            bm.d dVar3 = bVar2.f11141c;
            t2.c cVar5 = cVar2.f13051b;
            t2.i iVar = cVar2.f13052c;
            long jV = kc.f.V(cVar2.f13068u);
            i1.a aVar = ((i1.b) dVar3.f2828r).f11140b;
            t2.c cVar6 = aVar.f11136a;
            t2.i iVar2 = aVar.f11137b;
            g1.p pVarY2 = dVar3.y();
            canvas = canvasA;
            z11 = z14;
            long jH = dVar3.H();
            z10 = z13;
            j1.c cVar7 = (j1.c) dVar3.f2827g;
            dVar3.P(cVar5);
            dVar3.Q(iVar);
            dVar3.O(pVarY);
            dVar3.R(jV);
            dVar3.f2827g = cVar2;
            pVarY.g();
            try {
                cVar2.c(bVar2);
            } finally {
                pVarY.n();
                dVar3.P(cVar6);
                dVar3.Q(iVar2);
                dVar3.O(pVarY2);
                dVar3.R(jH);
                dVar3.f2827g = cVar7;
            }
        }
        if (z11) {
            pVarY.n();
        }
        if (z10) {
            pVarY.h();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    public final void p0(g1.p pVar, j1.c cVar) {
        g1.p pVar2;
        j1.c cVar2;
        z0.l lVarW0 = w0(4);
        if (lVarW0 == null) {
            L0(pVar, cVar);
            return;
        }
        f0 f0Var = this.f24821o;
        f0Var.getClass();
        h0 sharedDrawScope = k.t(f0Var).getSharedDrawScope();
        long jV = kc.f.V(this.f23811d);
        sharedDrawScope.getClass();
        p0.e eVar = null;
        while (lVarW0 != null) {
            if (lVarW0 instanceof m) {
                pVar2 = pVar;
                cVar2 = cVar;
                sharedDrawScope.b(pVar2, jV, this, (m) lVarW0, cVar2);
            } else {
                pVar2 = pVar;
                cVar2 = cVar;
                if ((lVarW0.f26497d & 4) != 0 && (lVarW0 instanceof j)) {
                    int i10 = 0;
                    for (z0.l lVar = ((j) lVarW0).f24863q; lVar != null; lVar = lVar.f26500g) {
                        if ((lVar.f26497d & 4) != 0) {
                            i10++;
                            if (i10 == 1) {
                                lVarW0 = lVar;
                            } else {
                                if (eVar == null) {
                                    eVar = new p0.e(new z0.l[16]);
                                }
                                if (lVarW0 != null) {
                                    eVar.b(lVarW0);
                                    lVarW0 = null;
                                }
                                eVar.b(lVar);
                            }
                        }
                    }
                    if (i10 == 1) {
                    }
                }
                pVar = pVar2;
                cVar = cVar2;
            }
            lVarW0 = k.e(eVar);
            pVar = pVar2;
            cVar = cVar2;
        }
    }

    @Override // v1.m
    public final long q(long j) {
        if (!v0().f26506o) {
            u1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((AndroidComposeView) k.t(this.f24821o)).q(F0(j));
    }

    public abstract void q0();

    public final f1 r0(f1 f1Var) {
        f0 f0VarC = f1Var.f24821o;
        f0 f0Var = this.f24821o;
        if (f0VarC == f0Var) {
            z0.l lVarV0 = f1Var.v0();
            z0.l lVarV02 = v0();
            if (!lVarV02.f26495b.f26506o) {
                u1.a.b("visitLocalAncestors called on an unattached node");
            }
            for (z0.l lVar = lVarV02.f26495b.f26499f; lVar != null; lVar = lVar.f26499f) {
                if ((lVar.f26497d & 2) != 0 && lVar == lVarV0) {
                    return f1Var;
                }
            }
            return this;
        }
        while (f0VarC.f24809o > f0Var.f24809o) {
            f0VarC = f0VarC.C();
            br.l.b(f0VarC);
        }
        f0 f0VarC2 = f0Var;
        while (f0VarC2.f24809o > f0VarC.f24809o) {
            f0VarC2 = f0VarC2.C();
            br.l.b(f0VarC2);
        }
        while (f0VarC != f0VarC2) {
            f0VarC = f0VarC.C();
            f0VarC2 = f0VarC2.C();
            if (f0VarC == null || f0VarC2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (f0VarC2 != f0Var) {
            if (f0VarC != f1Var.f24821o) {
                return (r) f0VarC.D.f822d;
            }
            return f1Var;
        }
        return this;
    }

    public final long s0(long j) {
        long j7 = this.f24832z;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j7 >> 32));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j7 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        l1 l1Var = this.I;
        return l1Var != null ? ((y1.k1) l1Var).c(jFloatToRawIntBits, true) : jFloatToRawIntBits;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // v1.v, v1.q
    public final Object t() {
        f0 f0Var = this.f24821o;
        if (!f0Var.D.i(64)) {
            return null;
        }
        v0();
        Object objN = null;
        for (z0.l lVar = (v1) f0Var.D.f824f; lVar != null; lVar = lVar.f26499f) {
            if ((lVar.f26497d & 64) != 0) {
                j jVarE = lVar;
                ?? eVar = 0;
                while (jVarE != 0) {
                    if (jVarE instanceof o1) {
                        objN = ((o1) jVarE).N(objN);
                    } else if ((jVarE.f26497d & 64) != 0 && (jVarE instanceof j)) {
                        z0.l lVar2 = jVarE.f24863q;
                        int i10 = 0;
                        jVarE = jVarE;
                        eVar = eVar;
                        while (lVar2 != null) {
                            if ((lVar2.f26497d & 64) != 0) {
                                i10++;
                                eVar = eVar;
                                if (i10 == 1) {
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
                        if (i10 == 1) {
                        }
                    }
                    jVarE = k.e(eVar);
                }
            }
        }
        return objN;
    }

    public abstract n0 t0();

    @Override // v1.m
    public final v1.m u() {
        if (!v0().f26506o) {
            u1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        G0();
        return ((f1) this.f24821o.D.f823e).f24823q;
    }

    public final long u0() {
        return this.f24827u.J(this.f24821o.f24819y.a());
    }

    public abstract z0.l v0();

    public final z0.l w0(int i10) {
        boolean zG = g1.g(i10);
        z0.l lVarV0 = v0();
        if (!zG && (lVarV0 = lVarV0.f26499f) == null) {
            return null;
        }
        for (z0.l lVarX0 = x0(zG); lVarX0 != null && (lVarX0.f26498e & i10) != 0; lVarX0 = lVarX0.f26500g) {
            if ((lVarX0.f26497d & i10) != 0) {
                return lVarX0;
            }
            if (lVarX0 == lVarV0) {
                return null;
            }
        }
        return null;
    }

    public final z0.l x0(boolean z10) {
        z0.l lVarV0;
        al.c cVar = this.f24821o.D;
        if (((f1) cVar.f823e) == this) {
            return (z0.l) cVar.f825g;
        }
        if (!z10) {
            f1 f1Var = this.f24823q;
            if (f1Var != null) {
                return f1Var.v0();
            }
            return null;
        }
        f1 f1Var2 = this.f24823q;
        if (f1Var2 == null || (lVarV0 = f1Var2.v0()) == null) {
            return null;
        }
        return lVarV0.f26500g;
    }

    @Override // t2.c
    public final float y() {
        return this.f24821o.f24817w.y();
    }

    public final void y0(z0.l lVar, d1 d1Var, long j, p pVar, int i10, boolean z10) {
        if (lVar == null) {
            B0(d1Var, j, pVar, i10, z10);
            return;
        }
        int i11 = pVar.f24908g;
        u.z zVar = pVar.f24906a;
        pVar.b(i11 + 1, zVar.f23135b);
        pVar.f24908g++;
        zVar.a(lVar);
        pVar.f24907d.a(k.a(-1.0f, z10, false));
        y0(k.d(lVar, d1Var.b()), d1Var, j, pVar, i10, z10);
        pVar.f24908g = i11;
    }

    public final void z0(z0.l lVar, d1 d1Var, long j, p pVar, int i10, boolean z10, float f10) {
        if (lVar == null) {
            B0(d1Var, j, pVar, i10, z10);
            return;
        }
        int i11 = pVar.f24908g;
        u.z zVar = pVar.f24906a;
        pVar.b(i11 + 1, zVar.f23135b);
        pVar.f24908g++;
        zVar.a(lVar);
        pVar.f24907d.a(k.a(f10, z10, false));
        K0(k.d(lVar, d1Var.b()), d1Var, j, pVar, i10, z10, f10, true);
        pVar.f24908g = i11;
    }

    @Override // x1.m0
    public final v1.m X() {
        return this;
    }
}
