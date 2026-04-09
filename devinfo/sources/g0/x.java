package g0;

import g2.s0;
import java.util.List;
import u0.i1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class x {
    public static final void a(i1.n nVar, u0.p pVar) {
        long j = pVar.T;
        int i4 = (int) (j ^ (j >>> 32));
        i1.n nVarW = com.bumptech.glide.d.w(nVar, pVar);
        i1 i1VarL = pVar.l();
        i2.g.R8.getClass();
        i2.x xVar = i2.f.f25653b;
        i0.f fVar = pVar.f34898a;
        pVar.Z();
        if (pVar.S) {
            pVar.k(xVar);
        } else {
            pVar.j0();
        }
        u0.q.x(l0.f24152a, i2.f.f25656e, pVar);
        u0.q.x(i1VarL, i2.f.f25655d, pVar);
        u0.q.t(pVar, i2.f.g);
        u0.q.x(nVarW, i2.f.f25654c, pVar);
        u0.q.p(pVar, Integer.valueOf(i4), i2.f.f25657f);
        pVar.p(true);
    }

    public static final e0 b(g2.i0 i0Var) {
        Object objW = i0Var.w();
        if (objW instanceof e0) {
            return (e0) objW;
        }
        return null;
    }

    public static final float c(e0 e0Var) {
        if (e0Var != null) {
            return e0Var.f24111a;
        }
        return 0.0f;
    }

    public static g2.k0 d(d0 d0Var, int i4, int i10, int i11, int i12, int i13, g2.l0 l0Var, List list, s0[] s0VarArr, int i14) {
        int i15;
        float f10;
        long j;
        int i16;
        int i17;
        int i18;
        List list2 = list;
        long j8 = i13;
        int[] iArr = new int[i14];
        int iMax = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int iMin = 0;
        float f11 = 0.0f;
        while (i19 < i14) {
            g2.i0 i0Var = (g2.i0) list2.get(i19);
            float fC = c(b(i0Var));
            if (fC > 0.0f) {
                f11 += fC;
                i20++;
                j = j8;
                i16 = i19;
            } else {
                int i22 = i11 - i21;
                s0 s0VarV = s0VarArr[i19];
                j = j8;
                if (s0VarV == null) {
                    if (i11 == Integer.MAX_VALUE) {
                        i16 = i19;
                        i17 = i20;
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i16 = i19;
                        i17 = i20;
                        i18 = i22 < 0 ? 0 : i22;
                    }
                    s0VarV = i0Var.v(d0Var.c(0, i18, i12, false));
                } else {
                    i16 = i19;
                    i17 = i20;
                }
                s0 s0Var = s0VarV;
                int i23 = d0Var.i(s0Var);
                int iA = d0Var.a(s0Var);
                iArr[i16] = i23;
                int i24 = i22 - i23;
                if (i24 < 0) {
                    i24 = 0;
                }
                iMin = Math.min(i13, i24);
                i21 += i23 + iMin;
                iMax = Math.max(iMax, iA);
                s0VarArr[i16] = s0Var;
                i20 = i17;
            }
            i19 = i16 + 1;
            j8 = j;
        }
        long j9 = j8;
        if (i20 == 0) {
            i21 -= iMin;
            i15 = 0;
        } else {
            long j10 = (r21 - 1) * j9;
            long jRound = ((i11 != Integer.MAX_VALUE ? i11 : i4) - i21) - j10;
            if (jRound < 0) {
                jRound = 0;
            }
            float f12 = jRound / f11;
            for (int i25 = 0; i25 < i14; i25++) {
                jRound -= Math.round(c(b((g2.i0) list2.get(i25))) * f12);
            }
            int i26 = iMax;
            int i27 = 0;
            int i28 = 0;
            while (i27 < i14) {
                if (s0VarArr[i27] == null) {
                    g2.i0 i0Var2 = (g2.i0) list2.get(i27);
                    e0 e0VarB = b(i0Var2);
                    float fC2 = c(e0VarB);
                    if (fC2 <= 0.0f) {
                        h0.a.b("All weights <= 0 should have placeables");
                    }
                    f10 = f12;
                    int iSignum = Long.signum(jRound);
                    jRound -= iSignum;
                    int iMax2 = Math.max(0, Math.round(fC2 * f10) + iSignum);
                    s0 s0VarV2 = i0Var2.v(d0Var.c((!(e0VarB != null ? e0VarB.f24112b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i12, true));
                    int i29 = d0Var.i(s0VarV2);
                    int iA2 = d0Var.a(s0VarV2);
                    iArr[i27] = i29;
                    i28 += i29;
                    int iMax3 = Math.max(i26, iA2);
                    s0VarArr[i27] = s0VarV2;
                    i26 = iMax3;
                } else {
                    f10 = f12;
                }
                i27++;
                list2 = list;
                f12 = f10;
            }
            i15 = (int) (i28 + j10);
            int i30 = i11 - i21;
            if (i15 < 0) {
                i15 = 0;
            }
            if (i15 > i30) {
                i15 = i30;
            }
            iMax = i26;
        }
        int i31 = i15 + i21;
        if (i31 < 0) {
            i31 = 0;
        }
        int iMax4 = Math.max(i31, i4);
        int iMax5 = Math.max(iMax, Math.max(i10, 0));
        int[] iArr2 = new int[i14];
        d0Var.j(iMax4, l0Var, iArr, iArr2);
        return d0Var.g(s0VarArr, l0Var, iArr2, iMax4, iMax5);
    }

    public static final i1.n e(i1.n nVar, a0 a0Var) {
        return nVar.b(new z(a0Var));
    }

    public static final i1.n f(i1.n nVar, float f10) {
        return nVar.b(new w(f10, f10, f10, f10));
    }

    public static i1.n g(i1.n nVar, float f10) {
        float f11 = 0;
        return nVar.b(new w(f10, f11, f10, f11));
    }
}
