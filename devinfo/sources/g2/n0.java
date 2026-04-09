package g2;

import u0.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h f24384a = new h(2);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f24385b = new Object();

    public static final void a(c1 c1Var, i1.n nVar, mk.e eVar, u0.p pVar, int i4) {
        pVar.X(-511989831);
        int i10 = (pVar.h(c1Var) ? 4 : 2) | i4 | (pVar.f(nVar) ? 32 : 16) | (pVar.h(eVar) ? 256 : 128);
        if (pVar.O(i10 & 1, (i10 & 147) != 146)) {
            long j = pVar.T;
            int i11 = (int) (j ^ (j >>> 32));
            u0.o oVarU = u0.q.u(pVar);
            i1.n nVarW = com.bumptech.glide.d.w(nVar, pVar);
            u0.i1 i1VarL = pVar.l();
            pVar.Z();
            if (pVar.S) {
                pVar.k(i2.x.f25807a);
            } else {
                pVar.j0();
            }
            u0.q.x(c1Var, c1Var.f24315c, pVar);
            u0.q.x(oVarU, c1Var.f24316d, pVar);
            u0.q.x(eVar, c1Var.f24317e, pVar);
            i2.g.R8.getClass();
            u0.q.x(i1VarL, i2.f.f25655d, pVar);
            u0.q.t(pVar, i2.f.g);
            u0.q.x(nVarW, i2.f.f25654c, pVar);
            u0.q.p(pVar, Integer.valueOf(i11), i2.f.f25657f);
            pVar.p(true);
            if (pVar.A()) {
                pVar.W(-1266202711);
            } else {
                pVar.W(-1259244916);
                boolean zH = pVar.h(c1Var);
                Object objL = pVar.L();
                if (zH || objL == u0.l.f34851a) {
                    objL = new b2.b(5, c1Var);
                    pVar.g0(objL);
                }
                v0.l0 l0Var = pVar.M.f35556b.f35553e;
                l0Var.X(v0.b0.f35565c);
                pd.b.q(l0Var, 0, (mk.a) objL);
            }
            pVar.p(false);
        } else {
            pVar.R();
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new y0(c1Var, nVar, eVar, i4, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float b(g2.r0 r6, boolean r7, g2.n[] r8, float r9) {
        /*
            int r0 = r8.length
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r0) goto L20
            r4 = r8[r3]
            float r4 = r6.d(r4)
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 != 0) goto L1c
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 <= 0) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = r2
        L1a:
            if (r7 != r5) goto L1d
        L1c:
            r1 = r4
        L1d:
            int r3 = r3 + 1
            goto L5
        L20:
            boolean r6 = java.lang.Float.isNaN(r1)
            if (r6 == 0) goto L27
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.n0.b(g2.r0, boolean, g2.n[], float):float");
    }

    public static final o1.c c(v vVar) {
        v vVarY = vVar.y();
        return vVarY != null ? vVarY.r(vVar, true) : new o1.c(0.0f, 0.0f, (int) (vVar.m() >> 32), (int) (vVar.m() & 4294967295L));
    }

    public static final o1.c d(v vVar, boolean z3) {
        v vVarF = f(vVar);
        float fM = (int) (vVarF.m() >> 32);
        float fM2 = (int) (vVarF.m() & 4294967295L);
        o1.c cVarR = vVarF.r(vVar, z3);
        float f10 = cVarR.f30369d;
        float f11 = cVarR.f30368c;
        float f12 = cVarR.f30367b;
        float f13 = cVarR.f30366a;
        if (z3) {
            if (f13 < 0.0f) {
                f13 = 0.0f;
            }
            if (f13 > fM) {
                f13 = fM;
            }
        }
        if (z3) {
            if (f12 < 0.0f) {
                f12 = 0.0f;
            }
            if (f12 > fM2) {
                f12 = fM2;
            }
        }
        if (z3) {
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            if (f11 <= fM) {
                fM = f11;
            }
            f11 = fM;
        }
        if (z3) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            if (f10 <= fM2) {
                fM2 = f10;
            }
            f10 = fM2;
        }
        if (f13 == f11 || f12 == f10) {
            return o1.c.f30365e;
        }
        long jE = vVarF.e((Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
        long jE2 = vVarF.e((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
        long jE3 = vVarF.e((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
        long jE4 = vVarF.e((Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jE4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jE3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jE & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jE2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jE4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jE3 & 4294967295L));
        return new o1.c(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final boolean e(long j, long j8) {
        return j == j8;
    }

    public static final v f(v vVar) {
        v vVar2;
        v vVarY = vVar.y();
        while (true) {
            v vVar3 = vVarY;
            vVar2 = vVar;
            vVar = vVar3;
            if (vVar == null) {
                break;
            }
            vVarY = vVar.y();
        }
        i2.d1 d1Var = vVar2 instanceof i2.d1 ? (i2.d1) vVar2 : null;
        if (d1Var == null) {
            return vVar2;
        }
        i2.d1 d1Var2 = d1Var.f25612q;
        while (true) {
            i2.d1 d1Var3 = d1Var2;
            i2.d1 d1Var4 = d1Var;
            d1Var = d1Var3;
            if (d1Var == null) {
                return d1Var4;
            }
            d1Var2 = d1Var.f25612q;
        }
    }

    public static final i2.n0 g(i2.n0 n0Var) {
        i2.e0 e0Var = n0Var.f25719o.f25610o;
        while (true) {
            i2.e0 e0VarV = e0Var.v();
            i2.e0 e0Var2 = null;
            if ((e0VarV != null ? e0VarV.f25634i : null) == null) {
                i2.n0 n0VarX0 = ((i2.d1) e0Var.G.f19258e).x0();
                nk.k.b(n0VarX0);
                return n0VarX0;
            }
            i2.e0 e0VarV2 = e0Var.v();
            if (e0VarV2 != null) {
                e0Var2 = e0VarV2.f25634i;
            }
            nk.k.b(e0Var2);
            i2.e0 e0VarV3 = e0Var.v();
            nk.k.b(e0VarV3);
            e0Var = e0VarV3.f25634i;
            nk.k.b(e0Var);
        }
    }

    public static final i1.n h(i1.n nVar, mk.c cVar) {
        return nVar.b(new m0(cVar));
    }

    public static final long i(long j, long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
