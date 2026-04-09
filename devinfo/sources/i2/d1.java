package i2;

import android.os.Build;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;
import j2.m2;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class d1 extends m0 implements g2.i0, g2.v, n1 {
    public static final p1.h0 N = new p1.h0();
    public static final s O = new s();
    public static final z0 P = new z0(0);
    public static final z0 Q = new z0(1);
    public float A;
    public o1.a B;
    public s C;
    public boolean E;
    public boolean F;
    public s1.b G;
    public p1.q H;
    public g2.e0 I;
    public boolean K;
    public l1 L;
    public s1.b M;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f25610o;

    /* renamed from: p, reason: collision with root package name */
    public d1 f25611p;

    /* renamed from: q, reason: collision with root package name */
    public d1 f25612q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f25613r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f25614s;

    /* renamed from: t, reason: collision with root package name */
    public mk.c f25615t;

    /* renamed from: u, reason: collision with root package name */
    public d3.c f25616u;

    /* renamed from: v, reason: collision with root package name */
    public d3.l f25617v;

    /* renamed from: x, reason: collision with root package name */
    public g2.k0 f25619x;

    /* renamed from: y, reason: collision with root package name */
    public x.z f25620y;

    /* renamed from: w, reason: collision with root package name */
    public float f25618w = 0.8f;

    /* renamed from: z, reason: collision with root package name */
    public long f25621z = 0;
    public p1.j0 D = p1.z.f31032b;
    public final a1 J = new a1(this, 1);

    public d1(e0 e0Var) {
        this.f25610o = e0Var;
        this.f25616u = e0Var.f25650z;
        this.f25617v = e0Var.A;
    }

    public final i1.m A0(int i4) {
        boolean zG = e1.g(i4);
        i1.m mVarZ0 = z0();
        if (!zG && (mVarZ0 = mVarZ0.f25558e) == null) {
            return null;
        }
        for (i1.m mVarB0 = B0(zG); mVarB0 != null && (mVarB0.f25557d & i4) != 0; mVarB0 = mVarB0.f25559f) {
            if ((mVarB0.f25556c & i4) != 0) {
                return mVarB0;
            }
            if (mVarB0 == mVarZ0) {
                return null;
            }
        }
        return null;
    }

    public final i1.m B0(boolean z3) {
        i1.m mVarZ0;
        com.google.android.gms.internal.consent_sdk.a0 a0Var = this.f25610o.G;
        if (((d1) a0Var.f19258e) == this) {
            return (i1.m) a0Var.g;
        }
        if (!z3) {
            d1 d1Var = this.f25612q;
            if (d1Var != null) {
                return d1Var.z0();
            }
            return null;
        }
        d1 d1Var2 = this.f25612q;
        if (d1Var2 == null || (mVarZ0 = d1Var2.z0()) == null) {
            return null;
        }
        return mVarZ0.f25559f;
    }

    public final void C0(i1.m mVar, z0 z0Var, long j, o oVar, int i4, boolean z3) {
        if (mVar == null) {
            F0(z0Var, j, oVar, i4, z3);
            return;
        }
        int i10 = oVar.f25727c;
        x.a0 a0Var = oVar.f25725a;
        oVar.c(i10 + 1, a0Var.f36847b);
        oVar.f25727c++;
        a0Var.a(mVar);
        oVar.f25726b.a(k.a(-1.0f, z3, false));
        C0(k.d(mVar, z0Var.b()), z0Var, j, oVar, i4, z3);
        oVar.f25727c = i10;
    }

    public final void D0(i1.m mVar, z0 z0Var, long j, o oVar, int i4, boolean z3, float f10) {
        if (mVar == null) {
            F0(z0Var, j, oVar, i4, z3);
            return;
        }
        int i10 = oVar.f25727c;
        x.a0 a0Var = oVar.f25725a;
        oVar.c(i10 + 1, a0Var.f36847b);
        oVar.f25727c++;
        a0Var.a(mVar);
        oVar.f25726b.a(k.a(f10, z3, false));
        N0(k.d(mVar, z0Var.b()), z0Var, j, oVar, i4, z3, f10, true);
        oVar.f25727c = i10;
    }

    @Override // g2.v
    public final long E(long j) {
        if (!z0().f25565n) {
            f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        I0();
        for (d1 d1Var = this; d1Var != null; d1Var = d1Var.f25612q) {
            e0 e0Var = d1Var.f25610o;
            if (d1Var == ((d1) e0Var.G.f19258e) && !e0Var.f25629c) {
                long jB = ((j2.r) h0.a(e0Var)).getRectManager().b(e0Var);
                if (!d3.i.a(jB, 9223372034707292159L)) {
                    return ii.a.t(j, jB);
                }
            }
            l1 l1Var = d1Var.L;
            if (l1Var != null) {
                j = ((j2.g1) l1Var).d(j, false);
            }
            j = ii.a.t(j, d1Var.f25621z);
        }
        return j;
    }

    public final void E0(z0 z0Var, long j, o oVar, int i4, boolean z3) {
        boolean z10;
        boolean z11;
        i1.m mVarA0 = A0(z0Var.b());
        if (!W0(j)) {
            if (i4 == 1) {
                float fR0 = r0(j, y0());
                if ((Float.floatToRawIntBits(fR0) & Integer.MAX_VALUE) < 2139095040) {
                    if (oVar.f25727c != cm.g.r(oVar)) {
                        if (k.g(oVar.a(), k.a(fR0, false, false)) <= 0) {
                            return;
                        }
                    }
                    D0(mVarA0, z0Var, j, oVar, i4, false, fR0);
                    return;
                }
                return;
            }
            return;
        }
        if (mVarA0 == null) {
            F0(z0Var, j, oVar, i4, z3);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < L() && fIntBitsToFloat2 < K()) {
            C0(mVarA0, z0Var, j, oVar, i4, z3);
            return;
        }
        float fR02 = i4 == 1 ? r0(j, y0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fR02) & Integer.MAX_VALUE) < 2139095040) {
            if (oVar.f25727c != cm.g.r(oVar)) {
                z10 = z3;
                if (k.g(oVar.a(), k.a(fR02, z10, false)) > 0) {
                }
                N0(mVarA0, z0Var, j, oVar, i4, z10, fR02, z11);
            }
            z10 = z3;
            z11 = true;
            N0(mVarA0, z0Var, j, oVar, i4, z10, fR02, z11);
        }
        z10 = z3;
        z11 = false;
        N0(mVarA0, z0Var, j, oVar, i4, z10, fR02, z11);
    }

    @Override // d3.c
    public final float F() {
        return this.f25610o.f25650z.F();
    }

    public void F0(z0 z0Var, long j, o oVar, int i4, boolean z3) {
        d1 d1Var = this.f25611p;
        if (d1Var != null) {
            d1Var.E0(z0Var, d1Var.w0(j), oVar, i4, z3);
        }
    }

    public final void G0() {
        l1 l1Var = this.L;
        if (l1Var != null) {
            l1Var.invalidate();
            return;
        }
        d1 d1Var = this.f25612q;
        if (d1Var != null) {
            d1Var.G0();
        }
    }

    public final boolean H0() {
        if (this.L != null && this.f25618w <= 0.0f) {
            return true;
        }
        d1 d1Var = this.f25612q;
        if (d1Var != null) {
            return d1Var.H0();
        }
        return false;
    }

    public final void I0() {
        this.f25610o.H.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r7v7, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void J0() {
        i1.m mVarZ0;
        boolean zG = e1.g(128);
        i1.m mVarB0 = B0(zG);
        if (mVarB0 == null || (mVarB0.f25554a.f25557d & 128) == 0) {
            return;
        }
        g1.g gVarF = g1.r.f();
        mk.c cVarE = gVarF != null ? gVarF.e() : null;
        g1.g gVarK = g1.r.k(gVarF);
        try {
            if (!zG) {
                mVarZ0 = z0().f25558e;
                if (mVarZ0 == null) {
                }
            }
            mVarZ0 = z0();
            for (i1.m mVarB02 = B0(zG); mVarB02 != null; mVarB02 = mVarB02.f25559f) {
                if ((mVarB02.f25557d & 128) == 0) {
                    break;
                }
                if ((mVarB02.f25556c & 128) != 0) {
                    j jVarE = mVarB02;
                    ?? eVar = 0;
                    while (jVarE != 0) {
                        if (jVarE instanceof t) {
                            ((t) jVarE).g(this.f24410c);
                        } else if ((jVarE.f25556c & 128) != 0 && (jVarE instanceof j)) {
                            i1.m mVar = jVarE.f25691p;
                            int i4 = 0;
                            jVarE = jVarE;
                            eVar = eVar;
                            while (mVar != null) {
                                if ((mVar.f25556c & 128) != 0) {
                                    i4++;
                                    eVar = eVar;
                                    if (i4 == 1) {
                                        jVarE = mVar;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new w0.e(new i1.m[16]);
                                        }
                                        if (jVarE != 0) {
                                            eVar.b(jVarE);
                                            jVarE = 0;
                                        }
                                        eVar.b(mVar);
                                    }
                                }
                                mVar = mVar.f25559f;
                                jVarE = jVarE;
                                eVar = eVar;
                            }
                            if (i4 == 1) {
                            }
                        }
                        jVarE = k.e(eVar);
                    }
                }
                if (mVarB02 == mVarZ0) {
                    break;
                }
            }
        } finally {
            g1.r.o(gVarF, gVarK, cVarE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [i1.m] */
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
    /* JADX WARN: Type inference failed for: r5v3, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void K0() {
        boolean zG = e1.g(4194304);
        i1.m mVarZ0 = z0();
        if (!zG && (mVarZ0 = mVarZ0.f25558e) == null) {
            return;
        }
        for (i1.m mVarB0 = B0(zG); mVarB0 != null && (mVarB0.f25557d & 4194304) != 0; mVarB0 = mVarB0.f25559f) {
            if ((mVarB0.f25556c & 4194304) != 0) {
                j jVarE = mVarB0;
                ?? eVar = 0;
                while (jVarE != 0) {
                    if (jVarE instanceof t) {
                        ((t) jVarE).w(this);
                    } else if ((jVarE.f25556c & 4194304) != 0 && (jVarE instanceof j)) {
                        i1.m mVar = jVarE.f25691p;
                        int i4 = 0;
                        jVarE = jVarE;
                        eVar = eVar;
                        while (mVar != null) {
                            if ((mVar.f25556c & 4194304) != 0) {
                                i4++;
                                eVar = eVar;
                                if (i4 == 1) {
                                    jVarE = mVar;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new w0.e(new i1.m[16]);
                                    }
                                    if (jVarE != 0) {
                                        eVar.b(jVarE);
                                        jVarE = 0;
                                    }
                                    eVar.b(mVar);
                                }
                            }
                            mVar = mVar.f25559f;
                            jVarE = jVarE;
                            eVar = eVar;
                        }
                        if (i4 == 1) {
                        }
                    }
                    jVarE = k.e(eVar);
                }
            }
            if (mVarB0 == mVarZ0) {
                return;
            }
        }
    }

    public final void L0() {
        this.f25613r = true;
        this.J.invoke();
        R0();
        if (d3.i.a(this.f25621z, 0L)) {
            return;
        }
        this.f25610o.N();
    }

    public final void M0() {
        boolean zG = e1.g(1048576);
        i1.m mVarB0 = B0(zG);
        if (mVarB0 == null || (mVarB0.f25554a.f25557d & 1048576) == 0) {
            return;
        }
        i1.m mVarZ0 = z0();
        if (!zG && (mVarZ0 = mVarZ0.f25558e) == null) {
            return;
        }
        for (i1.m mVarB02 = B0(zG); mVarB02 != null && (mVarB02.f25557d & 1048576) != 0; mVarB02 = mVarB02.f25559f) {
            if ((mVarB02.f25556c & 1048576) != 0) {
                i1.m mVarE = mVarB02;
                w0.e eVar = null;
                while (mVarE != null) {
                    if ((mVarE.f25556c & 1048576) != 0 && (mVarE instanceof j)) {
                        int i4 = 0;
                        for (i1.m mVar = ((j) mVarE).f25691p; mVar != null; mVar = mVar.f25559f) {
                            if ((mVar.f25556c & 1048576) != 0) {
                                i4++;
                                if (i4 == 1) {
                                    mVarE = mVar;
                                } else {
                                    if (eVar == null) {
                                        eVar = new w0.e(new i1.m[16]);
                                    }
                                    if (mVarE != null) {
                                        eVar.b(mVarE);
                                        mVarE = null;
                                    }
                                    eVar.b(mVar);
                                }
                            }
                        }
                        if (i4 == 1) {
                        }
                    }
                    mVarE = k.e(eVar);
                }
            }
            if (mVarB02 == mVarZ0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018d A[PHI: r5
  0x018d: PHI (r5v3 w0.e) = (r5v1 w0.e), (r5v1 w0.e), (r5v5 w0.e) binds: [B:50:0x0159, B:52:0x015d, B:66:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N0(i1.m r18, i2.z0 r19, long r20, i2.o r22, int r23, boolean r24, float r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.d1.N0(i1.m, i2.z0, long, i2.o, int, boolean, float, boolean):void");
    }

    public abstract void O0(p1.q qVar, s1.b bVar);

    public final void P0(long j, float f10, mk.c cVar, s1.b bVar) {
        e0 e0Var = this.f25610o;
        if (bVar != null) {
            if (cVar != null) {
                f2.a.a("both ways to create layers shouldn't be used together");
            }
            if (this.M != bVar) {
                this.M = null;
                U0(null, false);
                this.M = bVar;
            }
            if (this.L == null) {
                m1 m1VarA = h0.a(e0Var);
                g2.e0 e0Var2 = this.I;
                if (e0Var2 == null) {
                    g2.e0 e0Var3 = new g2.e0(1, this, new a1(this, 0));
                    this.I = e0Var3;
                    e0Var2 = e0Var3;
                }
                a1 a1Var = this.J;
                l1 l1VarL = ((j2.r) m1VarA).l(e0Var2, a1Var, bVar);
                j2.g1 g1Var = (j2.g1) l1VarL;
                g1Var.f(this.f24410c);
                g1Var.e(j);
                this.L = l1VarL;
                e0Var.K = true;
                a1Var.invoke();
            }
        } else {
            if (this.M != null) {
                this.M = null;
                U0(null, false);
            }
            U0(cVar, false);
        }
        if (!d3.i.a(this.f25621z, j)) {
            ((j2.r) h0.a(e0Var)).O(-4.0f);
            this.f25621z = j;
            e0Var.H.f25687p.b0();
            l1 l1Var = this.L;
            if (l1Var != null) {
                ((j2.g1) l1Var).e(j);
            } else {
                d1 d1Var = this.f25612q;
                if (d1Var != null) {
                    d1Var.G0();
                }
            }
            e0Var.N();
            m0.l0(this);
            m1 m1Var = e0Var.f25639o;
            if (m1Var != null) {
                ((j2.r) m1Var).B(e0Var);
            }
        }
        this.A = f10;
        if (this == ((d1) e0Var.G.f19258e)) {
            ((j2.r) h0.a(e0Var)).getRectManager().e(e0Var, false);
        }
        if (this.f25712k) {
            return;
        }
        b0(h0());
    }

    public final void Q0(o1.a aVar, boolean z3, boolean z10) {
        l1 l1Var = this.L;
        if (l1Var != null) {
            if (this.f25614s) {
                if (z10) {
                    long jY0 = y0();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jY0 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jY0 & 4294967295L)) / 2.0f;
                    long j = this.f24410c;
                    aVar.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j >> 32)) + fIntBitsToFloat, ((int) (j & 4294967295L)) + fIntBitsToFloat2);
                } else if (z3) {
                    long j8 = this.f24410c;
                    aVar.a(0.0f, 0.0f, (int) (j8 >> 32), (int) (j8 & 4294967295L));
                }
                if (aVar.b()) {
                    return;
                }
            }
            ((j2.g1) l1Var).c(aVar, false);
        }
        long j9 = this.f25621z;
        float f10 = (int) (j9 >> 32);
        aVar.f30360a += f10;
        aVar.f30362c += f10;
        float f11 = (int) (j9 & 4294967295L);
        aVar.f30361b += f11;
        aVar.f30363d += f11;
    }

    public final void R0() {
        if (this.L != null) {
            if (this.M != null) {
                this.M = null;
            }
            U0(null, false);
            this.f25610o.U(false);
        }
    }

    @Override // g2.s0
    public abstract void S(long j, float f10, s1.b bVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [i1.m] */
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
    /* JADX WARN: Type inference failed for: r9v5, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [w0.e] */
    public final void S0(g2.k0 k0Var) {
        d1 d1Var;
        g2.k0 k0Var2 = this.f25619x;
        if (k0Var != k0Var2) {
            this.f25619x = k0Var;
            e0 e0Var = this.f25610o;
            int i4 = 0;
            if (k0Var2 == null || k0Var.getWidth() != k0Var2.getWidth() || k0Var.getHeight() != k0Var2.getHeight()) {
                int width = k0Var.getWidth();
                int height = k0Var.getHeight();
                l1 l1Var = this.L;
                if (l1Var != null) {
                    ((j2.g1) l1Var).f((width << 32) | (height & 4294967295L));
                } else if (e0Var.I() && (d1Var = this.f25612q) != null) {
                    d1Var.G0();
                }
                U((height & 4294967295L) | (width << 32));
                if (this.f25615t != null) {
                    V0(false);
                }
                boolean zG = e1.g(4);
                i1.m mVarZ0 = z0();
                if (zG || (mVarZ0 = mVarZ0.f25558e) != null) {
                    for (i1.m mVarB0 = B0(zG); mVarB0 != null && (mVarB0.f25557d & 4) != 0; mVarB0 = mVarB0.f25559f) {
                        if ((mVarB0.f25556c & 4) != 0) {
                            j jVarE = mVarB0;
                            ?? eVar = 0;
                            while (jVarE != 0) {
                                if (jVarE instanceof l) {
                                    ((l) jVarE).z();
                                } else if ((jVarE.f25556c & 4) != 0 && (jVarE instanceof j)) {
                                    i1.m mVar = jVarE.f25691p;
                                    int i10 = 0;
                                    jVarE = jVarE;
                                    eVar = eVar;
                                    while (mVar != null) {
                                        if ((mVar.f25556c & 4) != 0) {
                                            i10++;
                                            eVar = eVar;
                                            if (i10 == 1) {
                                                jVarE = mVar;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new w0.e(new i1.m[16]);
                                                }
                                                if (jVarE != 0) {
                                                    eVar.b(jVarE);
                                                    jVarE = 0;
                                                }
                                                eVar.b(mVar);
                                            }
                                        }
                                        mVar = mVar.f25559f;
                                        jVarE = jVarE;
                                        eVar = eVar;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                jVarE = k.e(eVar);
                            }
                        }
                        if (mVarB0 == mVarZ0) {
                            break;
                        }
                    }
                }
                m1 m1Var = e0Var.f25639o;
                if (m1Var != null) {
                    ((j2.r) m1Var).B(e0Var);
                }
            }
            x.z zVar = this.f25620y;
            if ((zVar == null || zVar.f36969e == 0) && k0Var.b().isEmpty()) {
                return;
            }
            x.z zVar2 = this.f25620y;
            Map mapB = k0Var.b();
            if (zVar2 != null && zVar2.f36969e == mapB.size()) {
                Object[] objArr = zVar2.f36966b;
                int[] iArr = zVar2.f36967c;
                long[] jArr = zVar2.f36965a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i11 = 0;
                loop0: while (true) {
                    long j = jArr[i11];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = i4; i13 < i12; i13++) {
                            if ((255 & j) < 128) {
                                int i14 = (i11 << 3) + i13;
                                Object obj = objArr[i14];
                                int i15 = iArr[i14];
                                Integer num = (Integer) mapB.get((g2.a) obj);
                                if (num == null || num.intValue() != i15) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i12 != 8) {
                            return;
                        }
                    }
                    if (i11 == length) {
                        return;
                    }
                    i11++;
                    i4 = 0;
                }
            }
            e0Var.H.f25687p.f25802x.f();
            x.z zVar3 = this.f25620y;
            if (zVar3 == null) {
                x.z zVar4 = x.i0.f36903a;
                zVar3 = new x.z();
                this.f25620y = zVar3;
            }
            zVar3.a();
            for (Map.Entry entry : k0Var.b().entrySet()) {
                zVar3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final o1.c T0() {
        if (z0().f25565n) {
            g2.v vVarF = g2.n0.f(this);
            o1.a aVar = this.B;
            if (aVar == null) {
                aVar = new o1.a();
                this.B = aVar;
            }
            long jQ0 = q0(y0());
            int i4 = (int) (jQ0 >> 32);
            aVar.f30360a = -Float.intBitsToFloat(i4);
            int i10 = (int) (jQ0 & 4294967295L);
            aVar.f30361b = -Float.intBitsToFloat(i10);
            aVar.f30362c = Float.intBitsToFloat(i4) + L();
            aVar.f30363d = Float.intBitsToFloat(i10) + K();
            d1 d1Var = this;
            while (d1Var != vVarF) {
                d1Var.Q0(aVar, false, true);
                if (!aVar.b()) {
                    d1Var = d1Var.f25612q;
                    nk.k.b(d1Var);
                }
            }
            return new o1.c(aVar.f30360a, aVar.f30361b, aVar.f30362c, aVar.f30363d);
        }
        return o1.c.f30365e;
    }

    public final void U0(mk.c cVar, boolean z3) {
        m1 m1Var;
        w0.e eVar;
        Reference referencePoll;
        if (cVar != null && this.M != null) {
            f2.a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        e0 e0Var = this.f25610o;
        boolean z10 = (!z3 && this.f25615t == cVar && nk.k.a(this.f25616u, e0Var.f25650z) && this.f25617v == e0Var.A) ? false : true;
        this.f25616u = e0Var.f25650z;
        this.f25617v = e0Var.A;
        boolean zH = e0Var.H();
        a1 a1Var = this.J;
        if (zH && cVar != null) {
            this.f25615t = cVar;
            if (this.L != null) {
                if (z10) {
                    V0(true);
                    return;
                }
                return;
            }
            m1 m1VarA = h0.a(e0Var);
            g2.e0 e0Var2 = this.I;
            if (e0Var2 == null) {
                g2.e0 e0Var3 = new g2.e0(1, this, new a1(this, 0));
                this.I = e0Var3;
                e0Var2 = e0Var3;
            }
            l1 l1VarL = ((j2.r) m1VarA).l(e0Var2, a1Var, null);
            j2.g1 g1Var = (j2.g1) l1VarL;
            g1Var.f(this.f24410c);
            g1Var.e(this.f25621z);
            this.L = l1VarL;
            V0(true);
            e0Var.K = true;
            a1Var.invoke();
            return;
        }
        this.f25615t = null;
        l1 l1Var = this.L;
        if (l1Var != null) {
            j2.g1 g1Var2 = (j2.g1) l1Var;
            j2.r rVar = g1Var2.f27146c;
            if (!p1.z.o(g1Var2.b())) {
                e0Var.N();
            }
            g1Var2.f27147d = null;
            g1Var2.f27148e = null;
            g1Var2.g = true;
            if (g1Var2.j) {
                g1Var2.j = false;
                rVar.z(g1Var2, false);
            }
            p1.x xVar = g1Var2.f27145b;
            if (xVar != null) {
                xVar.a(g1Var2.f27144a);
                y4.a aVar = rVar.f27293v0;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) aVar.f37324b;
                    eVar = (w0.e) aVar.f37323a;
                    referencePoll = referenceQueue.poll();
                    if (referencePoll != null) {
                        eVar.k(referencePoll);
                    }
                } while (referencePoll != null);
                eVar.b(new WeakReference(g1Var2, (ReferenceQueue) aVar.f37324b));
                rVar.D.j(g1Var2);
            }
            e0Var.K = true;
            a1Var.invoke();
            if (z0().f25565n && e0Var.I() && (m1Var = e0Var.f25639o) != null) {
                ((j2.r) m1Var).B(e0Var);
            }
        }
        this.L = null;
        this.K = false;
    }

    public final void V0(boolean z3) {
        char c9;
        j2.r rVar;
        int i4;
        boolean z10;
        m1 m1Var;
        mk.a aVar;
        mk.a aVar2;
        if (this.M != null) {
            return;
        }
        l1 l1Var = this.L;
        if (l1Var == null) {
            if (this.f25615t == null) {
                return;
            }
            f2.a.b("null layer with a non-null layerBlock");
            return;
        }
        mk.c cVar = this.f25615t;
        if (cVar == null) {
            throw d.h.o("updateLayerParameters requires a non-null layerBlock");
        }
        p1.h0 h0Var = N;
        h0Var.b();
        e0 e0Var = this.f25610o;
        h0Var.f30976o = e0Var.f25650z;
        h0Var.f30977p = e0Var.A;
        h0Var.f30975n = me.t1.F(this.f24410c);
        ((j2.r) h0.a(e0Var)).getSnapshotObserver().f25732a.b(this, d.f25601e, new c2.c(6, cVar, this));
        s sVar = this.C;
        if (sVar == null) {
            sVar = new s();
            this.C = sVar;
        }
        s sVar2 = O;
        sVar2.getClass();
        sVar2.f25770a = sVar.f25770a;
        sVar2.f25771b = sVar.f25771b;
        sVar2.f25772c = sVar.f25772c;
        sVar2.f25773d = sVar.f25773d;
        sVar2.f25774e = sVar.f25774e;
        sVar2.f25775f = sVar.f25775f;
        float f10 = h0Var.f30965b;
        sVar.f25770a = f10;
        sVar.f25771b = h0Var.f30966c;
        sVar.f25772c = h0Var.f30968e;
        sVar.f25773d = h0Var.f30969f;
        sVar.f25774e = h0Var.j;
        long j = h0Var.f30972k;
        sVar.f25775f = j;
        j2.g1 g1Var = (j2.g1) l1Var;
        j2.r rVar2 = g1Var.f27146c;
        int i10 = h0Var.f30964a | g1Var.f27155n;
        g1Var.f27153l = h0Var.f30977p;
        g1Var.f27152k = h0Var.f30976o;
        int i11 = i10 & Buffer.SEGMENTING_THRESHOLD;
        if (i11 != 0) {
            g1Var.f27156o = j;
        }
        if ((i10 & 1) != 0) {
            s1.d dVar = g1Var.f27144a.f33231a;
            if (dVar.b() != f10) {
                dVar.y(f10);
            }
        }
        if ((i10 & 2) != 0) {
            s1.b bVar = g1Var.f27144a;
            float f11 = h0Var.f30966c;
            s1.d dVar2 = bVar.f33231a;
            if (dVar2.K() != f11) {
                dVar2.k(f11);
            }
        }
        if ((i10 & 4) != 0) {
            g1Var.f27144a.e(h0Var.f30967d);
        }
        if ((i10 & 8) != 0) {
            s1.b bVar2 = g1Var.f27144a;
            float f12 = h0Var.f30968e;
            s1.d dVar3 = bVar2.f33231a;
            if (dVar3.A() != f12) {
                dVar3.F(f12);
            }
        }
        if ((i10 & 16) != 0) {
            s1.b bVar3 = g1Var.f27144a;
            float f13 = h0Var.f30969f;
            s1.d dVar4 = bVar3.f33231a;
            if (dVar4.t() != f13) {
                dVar4.d(f13);
            }
        }
        if ((i10 & 32) != 0) {
            s1.b bVar4 = g1Var.f27144a;
            float f14 = h0Var.g;
            s1.d dVar5 = bVar4.f33231a;
            if (dVar5.J() != f14) {
                dVar5.c(f14);
                bVar4.g = true;
                bVar4.a();
            }
            if (h0Var.g > 0.0f && !g1Var.f27161t && (aVar2 = g1Var.f27148e) != null) {
                aVar2.invoke();
            }
        }
        if ((i10 & 64) != 0) {
            s1.b bVar5 = g1Var.f27144a;
            long j8 = h0Var.f30970h;
            s1.d dVar6 = bVar5.f33231a;
            if (!p1.s.c(j8, dVar6.q())) {
                dVar6.w(j8);
            }
        }
        if ((i10 & 128) != 0) {
            s1.b bVar6 = g1Var.f27144a;
            long j9 = h0Var.f30971i;
            s1.d dVar7 = bVar6.f33231a;
            if (!p1.s.c(j9, dVar7.v())) {
                dVar7.G(j9);
            }
        }
        if ((i10 & Segment.SHARE_MINIMUM) != 0) {
            s1.d dVar8 = g1Var.f27144a.f33231a;
            if (dVar8.o() != 0.0f) {
                dVar8.E();
            }
        }
        if ((i10 & 256) != 0) {
            s1.d dVar9 = g1Var.f27144a.f33231a;
            if (dVar9.C() != 0.0f) {
                dVar9.r();
            }
        }
        if ((i10 & 512) != 0) {
            s1.d dVar10 = g1Var.f27144a.f33231a;
            if (dVar10.m() != 0.0f) {
                dVar10.u();
            }
        }
        if ((i10 & 2048) != 0) {
            s1.b bVar7 = g1Var.f27144a;
            float f15 = h0Var.j;
            s1.d dVar11 = bVar7.f33231a;
            if (dVar11.z() != f15) {
                dVar11.I(f15);
            }
        }
        if (i11 != 0) {
            if (g1Var.f27156o == p1.m0.f31006a) {
                s1.b bVar8 = g1Var.f27144a;
                if (!o1.b.b(bVar8.f33250v, 9205357640488583168L)) {
                    bVar8.f33250v = 9205357640488583168L;
                    bVar8.f33231a.p(9205357640488583168L);
                }
                c9 = ' ';
            } else {
                s1.b bVar9 = g1Var.f27144a;
                c9 = ' ';
                long jFloatToRawIntBits = (Float.floatToRawIntBits(p1.m0.b(g1Var.f27156o) * ((int) (g1Var.f27149f & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(p1.m0.a(r14) * ((int) (g1Var.f27149f >> 32))) << 32);
                if (!o1.b.b(bVar9.f33250v, jFloatToRawIntBits)) {
                    bVar9.f33250v = jFloatToRawIntBits;
                    bVar9.f33231a.p(jFloatToRawIntBits);
                }
            }
        } else {
            c9 = ' ';
        }
        if ((i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            s1.b bVar10 = g1Var.f27144a;
            boolean z11 = h0Var.f30974m;
            if (bVar10.f33251w != z11) {
                bVar10.f33251w = z11;
                bVar10.g = true;
                bVar10.a();
            }
        }
        if ((131072 & i10) != 0) {
            s1.d dVar12 = g1Var.f27144a.f33231a;
        }
        if ((262144 & i10) != 0) {
            s1.d dVar13 = g1Var.f27144a.f33231a;
            if (!nk.k.a(dVar13.i(), null)) {
                dVar13.x();
            }
        }
        if ((524288 & i10) != 0) {
            s1.b bVar11 = g1Var.f27144a;
            int i12 = h0Var.f30978q;
            s1.d dVar14 = bVar11.f33231a;
            if (dVar14.L() != i12) {
                dVar14.f(i12);
            }
        }
        if ((32768 & i10) != 0) {
            s1.d dVar15 = g1Var.f27144a.f33231a;
            if (dVar15.h() != 0) {
                dVar15.D(0);
            }
        }
        if ((i10 & 7963) != 0) {
            g1Var.f27158q = true;
            g1Var.f27159r = true;
        }
        if (nk.k.a(g1Var.f27157p, h0Var.f30979r)) {
            rVar = rVar2;
            i4 = i10;
            z10 = false;
        } else {
            p1.z zVar = h0Var.f30979r;
            g1Var.f27157p = zVar;
            if (zVar == null) {
                rVar = rVar2;
                i4 = i10;
            } else {
                s1.b bVar12 = g1Var.f27144a;
                if (zVar instanceof p1.e0) {
                    o1.c cVar2 = ((p1.e0) zVar).f30955f;
                    float f16 = cVar2.f30366a;
                    float f17 = cVar2.f30367b;
                    rVar = rVar2;
                    bVar12.f((Float.floatToRawIntBits(f16) << c9) | (Float.floatToRawIntBits(f17) & 4294967295L), (Float.floatToRawIntBits(cVar2.f30368c - f16) << c9) | (Float.floatToRawIntBits(cVar2.f30369d - f17) & 4294967295L), 0.0f);
                } else {
                    rVar = rVar2;
                    if (zVar instanceof p1.d0) {
                        p1.j jVar = ((p1.d0) zVar).f30953f;
                        bVar12.f33239k = null;
                        bVar12.f33238i = 9205357640488583168L;
                        bVar12.f33237h = 0L;
                        bVar12.j = 0.0f;
                        bVar12.g = true;
                        bVar12.f33242n = false;
                        bVar12.f33240l = jVar;
                        bVar12.a();
                    } else {
                        if (!(zVar instanceof p1.f0)) {
                            throw new ac.m();
                        }
                        p1.f0 f0Var = (p1.f0) zVar;
                        p1.j jVar2 = f0Var.g;
                        if (jVar2 != null) {
                            bVar12.f33239k = null;
                            bVar12.f33238i = 9205357640488583168L;
                            bVar12.f33237h = 0L;
                            bVar12.j = 0.0f;
                            bVar12.g = true;
                            bVar12.f33242n = false;
                            bVar12.f33240l = jVar2;
                            bVar12.a();
                        } else {
                            o1.d dVar16 = f0Var.f30962f;
                            float f18 = dVar16.f30370a;
                            float f19 = dVar16.f30371b;
                            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f18);
                            int iFloatToRawIntBits = Float.floatToRawIntBits(f19);
                            i4 = i10;
                            bVar12.f((jFloatToRawIntBits2 << c9) | (iFloatToRawIntBits & 4294967295L), (Float.floatToRawIntBits(dVar16.b()) << c9) | (Float.floatToRawIntBits(dVar16.a()) & 4294967295L), Float.intBitsToFloat((int) (dVar16.f30376h >> c9)));
                            if ((zVar instanceof p1.d0) && Build.VERSION.SDK_INT < 33 && (aVar = g1Var.f27148e) != null) {
                                aVar.invoke();
                            }
                        }
                    }
                }
                i4 = i10;
                if (zVar instanceof p1.d0) {
                    aVar.invoke();
                }
            }
            z10 = true;
        }
        g1Var.f27155n = h0Var.f30964a;
        if (i4 != 0 || z10) {
            if (Build.VERSION.SDK_INT >= 26) {
                m2.a(rVar);
            } else {
                rVar.invalidate();
            }
            j2.r rVar3 = rVar;
            if (rVar3.f27272l) {
                rVar3.O(0.0f);
            }
        }
        boolean z12 = this.f25614s;
        boolean z13 = h0Var.f30974m;
        this.f25614s = z13;
        this.f25618w = h0Var.f30967d;
        boolean z14 = sVar2.f25770a == sVar.f25770a && sVar2.f25771b == sVar.f25771b && sVar2.f25772c == sVar.f25772c && sVar2.f25773d == sVar.f25773d && sVar2.f25774e == sVar.f25774e && sVar2.f25775f == sVar.f25775f;
        if (z3 && ((!z14 || z12 != z13) && (m1Var = e0Var.f25639o) != null)) {
            ((j2.r) m1Var).B(e0Var);
        }
        if (z14) {
            return;
        }
        i0 i0Var = e0Var.H;
        if (i0Var.f25683l > 0) {
            if (i0Var.f25682k || i0Var.j) {
                e0Var.U(false);
            }
            i0Var.f25687p.b0();
        }
        e0Var.N();
        j2.r rVar4 = (j2.r) h0.a(e0Var);
        q2.b rectManager = rVar4.getRectManager();
        if (this == ((d1) e0Var.G.f19258e)) {
            rectManager.e(e0Var, false);
        } else {
            rectManager.getClass();
            if (e0Var.I()) {
                long jF = q2.b.f(e0Var);
                if (d3.i.a(jF, 9223372034707292159L)) {
                    rectManager.c(e0Var);
                } else {
                    e0Var.f25632f = jF;
                    e0Var.g = false;
                    w0.e eVarZ = e0Var.z();
                    Object[] objArr = eVarZ.f36397a;
                    int i13 = eVarZ.f36399c;
                    for (int i14 = 0; i14 < i13; i14++) {
                        rectManager.e((e0) objArr[i14], false);
                    }
                    rectManager.d(e0Var);
                }
            }
        }
        if (e0Var.Q > 0) {
            y4.a aVar3 = rVar4.U.f25780e;
            aVar3.getClass();
            if (e0Var.Q > 0) {
                ((w0.e) aVar3.f37323a).b(e0Var);
                e0Var.P = true;
            }
            rVar4.I(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean W0(long r26) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.d1.W0(long):boolean");
    }

    @Override // d3.c
    public final float a() {
        return this.f25610o.f25650z.a();
    }

    @Override // i2.m0
    public final m0 d0() {
        return this.f25611p;
    }

    @Override // g2.v
    public final long e(long j) {
        long jE = E(j);
        j2.r rVar = (j2.r) h0.a(this.f25610o);
        rVar.F();
        return p1.z.p(rVar.f27253a0, jE);
    }

    @Override // g2.v
    public final long f(g2.v vVar, long j) {
        d1 d1Var;
        boolean z3 = vVar instanceof g2.h0;
        if (z3) {
            g2.h0 h0Var = (g2.h0) vVar;
            h0Var.f24349a.f25719o.I0();
            return h0Var.f(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        g2.h0 h0Var2 = z3 ? (g2.h0) vVar : null;
        if (h0Var2 == null || (d1Var = h0Var2.f24349a.f25719o) == null) {
            nk.k.c(vVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            d1Var = (d1) vVar;
        }
        d1Var.I0();
        d1 d1VarV0 = v0(d1Var);
        while (d1Var != d1VarV0) {
            l1 l1Var = d1Var.L;
            if (l1Var != null) {
                j = ((j2.g1) l1Var).d(j, false);
            }
            j = ii.a.t(j, d1Var.f25621z);
            d1Var = d1Var.f25612q;
            nk.k.b(d1Var);
        }
        return p0(d1VarV0, j);
    }

    @Override // i2.m0
    public final boolean f0() {
        return this.f25619x != null;
    }

    @Override // i2.m0
    public final e0 g0() {
        return this.f25610o;
    }

    @Override // g2.q
    public final d3.l getLayoutDirection() {
        return this.f25610o.A;
    }

    @Override // i2.m0
    public final g2.k0 h0() {
        g2.k0 k0Var = this.f25619x;
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // i2.n1
    public final boolean i() {
        return (this.L == null || this.f25613r || !this.f25610o.H()) ? false : true;
    }

    @Override // i2.m0
    public final m0 i0() {
        return this.f25612q;
    }

    @Override // i2.m0
    public final long j0() {
        return this.f25621z;
    }

    @Override // g2.v
    public final boolean l() {
        return z0().f25565n;
    }

    @Override // g2.v
    public final long m() {
        return this.f24410c;
    }

    @Override // i2.m0
    public final void n0() {
        s1.b bVar = this.M;
        if (bVar != null) {
            S(this.f25621z, this.A, bVar);
        } else {
            R(this.f25621z, this.A, this.f25615t);
        }
    }

    public final void o0(d1 d1Var, o1.a aVar, boolean z3) {
        if (d1Var == this) {
            return;
        }
        d1 d1Var2 = this.f25612q;
        if (d1Var2 != null) {
            d1Var2.o0(d1Var, aVar, z3);
        }
        long j = this.f25621z;
        float f10 = (int) (j >> 32);
        aVar.f30360a -= f10;
        aVar.f30362c -= f10;
        float f11 = (int) (j & 4294967295L);
        aVar.f30361b -= f11;
        aVar.f30363d -= f11;
        l1 l1Var = this.L;
        if (l1Var != null) {
            ((j2.g1) l1Var).c(aVar, true);
            if (this.f25614s && z3) {
                long j8 = this.f24410c;
                aVar.a(0.0f, 0.0f, (int) (j8 >> 32), (int) (j8 & 4294967295L));
            }
        }
    }

    @Override // g2.v
    public final long p(g2.v vVar, long j) {
        return f(vVar, j);
    }

    public final long p0(d1 d1Var, long j) {
        if (d1Var == this) {
            return j;
        }
        d1 d1Var2 = this.f25612q;
        return (d1Var2 == null || nk.k.a(d1Var, d1Var2)) ? w0(j) : w0(d1Var2.p0(d1Var, j));
    }

    public final long q0(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - L();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - K();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        float fMax2 = Math.max(0.0f, fIntBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(fMax2) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    @Override // g2.v
    public final o1.c r(g2.v vVar, boolean z3) {
        d1 d1Var;
        if (!z0().f25565n) {
            f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!vVar.l()) {
            f2.a.b("LayoutCoordinates " + vVar + " is not attached!");
        }
        g2.h0 h0Var = vVar instanceof g2.h0 ? (g2.h0) vVar : null;
        if (h0Var == null || (d1Var = h0Var.f24349a.f25719o) == null) {
            d1Var = (d1) vVar;
        }
        d1Var.I0();
        d1 d1VarV0 = v0(d1Var);
        o1.a aVar = this.B;
        if (aVar == null) {
            aVar = new o1.a();
            this.B = aVar;
        }
        aVar.f30360a = 0.0f;
        aVar.f30361b = 0.0f;
        aVar.f30362c = (int) (vVar.m() >> 32);
        aVar.f30363d = (int) (vVar.m() & 4294967295L);
        while (d1Var != d1VarV0) {
            d1Var.Q0(aVar, z3, false);
            if (aVar.b()) {
                return o1.c.f30365e;
            }
            d1Var = d1Var.f25612q;
            nk.k.b(d1Var);
        }
        o0(d1VarV0, aVar, z3);
        return new o1.c(aVar.f30360a, aVar.f30361b, aVar.f30362c, aVar.f30363d);
    }

    public final float r0(long j, long j8) {
        if (L() >= Float.intBitsToFloat((int) (j8 >> 32)) && K() >= Float.intBitsToFloat((int) (j8 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jQ0 = q0(j8);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jQ0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jQ0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - L());
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f ? -r9 : r9 - K())) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i4 = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i4) <= fIntBitsToFloat) {
                int i10 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i10) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i4);
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i10);
                    return (fIntBitsToFloat5 * fIntBitsToFloat5) + (fIntBitsToFloat4 * fIntBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void s0(p1.q qVar, s1.b bVar) {
        l1 l1Var = this.L;
        if (l1Var == null) {
            long j = this.f25621z;
            float f10 = (int) (j >> 32);
            float f11 = (int) (j & 4294967295L);
            qVar.j(f10, f11);
            t0(qVar, bVar);
            qVar.j(-f10, -f11);
            return;
        }
        j2.g1 g1Var = (j2.g1) l1Var;
        r1.b bVar2 = g1Var.f27154m;
        g1Var.g();
        g1Var.f27161t = g1Var.f27144a.f33231a.J() > 0.0f;
        i0.f fVar = bVar2.f32718b;
        fVar.O(qVar);
        fVar.f25417c = bVar;
        wb.e.o(bVar2, g1Var.f27144a);
    }

    public final void t0(p1.q qVar, s1.b bVar) {
        p1.q qVar2;
        s1.b bVar2;
        i1.m mVarA0 = A0(4);
        if (mVarA0 == null) {
            O0(qVar, bVar);
            return;
        }
        e0 e0Var = this.f25610o;
        e0Var.getClass();
        g0 sharedDrawScope = ((j2.r) h0.a(e0Var)).getSharedDrawScope();
        long jF = me.t1.F(this.f24410c);
        sharedDrawScope.getClass();
        w0.e eVar = null;
        while (mVarA0 != null) {
            if (mVarA0 instanceof l) {
                qVar2 = qVar;
                bVar2 = bVar;
                sharedDrawScope.d(qVar2, jF, this, (l) mVarA0, bVar2);
            } else {
                qVar2 = qVar;
                bVar2 = bVar;
                if ((mVarA0.f25556c & 4) != 0 && (mVarA0 instanceof j)) {
                    int i4 = 0;
                    for (i1.m mVar = ((j) mVarA0).f25691p; mVar != null; mVar = mVar.f25559f) {
                        if ((mVar.f25556c & 4) != 0) {
                            i4++;
                            if (i4 == 1) {
                                mVarA0 = mVar;
                            } else {
                                if (eVar == null) {
                                    eVar = new w0.e(new i1.m[16]);
                                }
                                if (mVarA0 != null) {
                                    eVar.b(mVarA0);
                                    mVarA0 = null;
                                }
                                eVar.b(mVar);
                            }
                        }
                    }
                    if (i4 == 1) {
                    }
                }
                qVar = qVar2;
                bVar = bVar2;
            }
            mVarA0 = k.e(eVar);
            qVar = qVar2;
            bVar = bVar2;
        }
    }

    @Override // g2.v
    public final long u(long j) {
        if (!z0().f25565n) {
            f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((j2.r) h0.a(this.f25610o)).v(E(j));
    }

    public abstract void u0();

    public final d1 v0(d1 d1Var) {
        e0 e0VarV = d1Var.f25610o;
        e0 e0Var = this.f25610o;
        if (e0VarV == e0Var) {
            i1.m mVarZ0 = d1Var.z0();
            i1.m mVarZ02 = z0();
            if (!mVarZ02.f25554a.f25565n) {
                f2.a.b("visitLocalAncestors called on an unattached node");
            }
            for (i1.m mVar = mVarZ02.f25554a.f25558e; mVar != null; mVar = mVar.f25558e) {
                if ((mVar.f25556c & 2) != 0 && mVar == mVarZ0) {
                    return d1Var;
                }
            }
            return this;
        }
        while (e0VarV.f25641q > e0Var.f25641q) {
            e0VarV = e0VarV.v();
            nk.k.b(e0VarV);
        }
        e0 e0VarV2 = e0Var;
        while (e0VarV2.f25641q > e0VarV.f25641q) {
            e0VarV2 = e0VarV2.v();
            nk.k.b(e0VarV2);
        }
        while (e0VarV != e0VarV2) {
            e0VarV = e0VarV.v();
            e0VarV2 = e0VarV2.v();
            if (e0VarV == null || e0VarV2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (e0VarV2 != e0Var) {
            if (e0VarV != d1Var.f25610o) {
                return (q) e0VarV.G.f19257d;
            }
            return d1Var;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // g2.s0, g2.i0
    public final Object w() {
        e0 e0Var = this.f25610o;
        if (!e0Var.G.f(64)) {
            return null;
        }
        z0();
        Object objZ = null;
        for (i1.m mVar = (w1) e0Var.G.f19259f; mVar != null; mVar = mVar.f25558e) {
            if ((mVar.f25556c & 64) != 0) {
                j jVarE = mVar;
                ?? eVar = 0;
                while (jVarE != 0) {
                    if (jVarE instanceof p1) {
                        objZ = ((p1) jVarE).Z(objZ);
                    } else if ((jVarE.f25556c & 64) != 0 && (jVarE instanceof j)) {
                        i1.m mVar2 = jVarE.f25691p;
                        int i4 = 0;
                        jVarE = jVarE;
                        eVar = eVar;
                        while (mVar2 != null) {
                            if ((mVar2.f25556c & 64) != 0) {
                                i4++;
                                eVar = eVar;
                                if (i4 == 1) {
                                    jVarE = mVar2;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new w0.e(new i1.m[16]);
                                    }
                                    if (jVarE != 0) {
                                        eVar.b(jVarE);
                                        jVarE = 0;
                                    }
                                    eVar.b(mVar2);
                                }
                            }
                            mVar2 = mVar2.f25559f;
                            jVarE = jVarE;
                            eVar = eVar;
                        }
                        if (i4 == 1) {
                        }
                    }
                    jVarE = k.e(eVar);
                }
            }
        }
        return objZ;
    }

    public final long w0(long j) {
        long j8 = this.f25621z;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j8 >> 32));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j8 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        l1 l1Var = this.L;
        return l1Var != null ? ((j2.g1) l1Var).d(jFloatToRawIntBits, true) : jFloatToRawIntBits;
    }

    public abstract n0 x0();

    @Override // g2.v
    public final g2.v y() {
        boolean z3 = z0().f25565n;
        e0 e0Var = this.f25610o;
        if (!z3) {
            StringBuilder sb2 = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (e0 e0VarV = e0Var; e0VarV != null; e0VarV = e0VarV.v()) {
                sb2.append("\n|");
                sb2.append(e0VarV);
                sb2.append(" isAttached=");
                sb2.append(e0VarV.H());
                sb2.append(" modifier=");
                sb2.append(e0VarV.L);
                sb2.append(" tail=");
                sb2.append(z0());
            }
            f2.a.b(sb2.toString());
        }
        I0();
        return ((d1) e0Var.G.f19258e).f25612q;
    }

    public final long y0() {
        return this.f25616u.T(this.f25610o.B.b());
    }

    public abstract i1.m z0();

    @Override // i2.m0
    public final g2.v e0() {
        return this;
    }
}
