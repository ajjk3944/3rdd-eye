package c0;

import com.google.android.gms.internal.measurement.y3;
import java.util.List;
import n0.f1;
import x1.l0;
import x1.m0;

/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final oh.p f3064a = new oh.p(22, new a0(0));

    public static final void a(n0.p pVar, z0.m mVar) {
        e eVar = e.f3069c;
        int iHashCode = Long.hashCode(pVar.S);
        z0.m mVarF = y3.F(pVar, mVar);
        f1 f1VarK = pVar.k();
        x1.g.f24833a.getClass();
        x1.y yVar = x1.f.f24793b;
        qm.c cVar = pVar.f17254a;
        pVar.U();
        if (pVar.R) {
            pVar.j(yVar);
        } else {
            pVar.e0();
        }
        n0.w.k(x1.f.f24796e, eVar, pVar);
        n0.w.k(x1.f.f24795d, f1VarK, pVar);
        n0.w.k(x1.f.f24794c, mVarF, pVar);
        x1.e eVar2 = x1.f.f24797f;
        if (pVar.R || !br.l.a(pVar.I(), Integer.valueOf(iHashCode))) {
            w.g.m(iHashCode, pVar, iHashCode, eVar2);
        }
        pVar.o(true);
    }

    public static l0 c(u uVar, int i10, int i11, int i12, int i13, int i14, m0 m0Var, List list, v1.v[] vVarArr, int i15) {
        int i16;
        float f10;
        int i17;
        int i18;
        List list2 = list;
        long j = i14;
        int[] iArr = new int[i15];
        int iMax = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int iMin = 0;
        float f11 = 0.0f;
        while (true) {
            if (i19 >= i15) {
                break;
            }
            v1.q qVar = (v1.q) list2.get(i19);
            long j7 = j;
            Object objT = qVar.t();
            v vVar = objT instanceof v ? (v) objT : null;
            float f12 = vVar != null ? vVar.f3109a : 0.0f;
            if (f12 > 0.0f) {
                f11 += f12;
                i20++;
            } else {
                int i22 = i12 - i21;
                v1.v vVarS = vVarArr[i19];
                if (vVarS == null) {
                    if (i12 == Integer.MAX_VALUE) {
                        i17 = i22;
                        i18 = Integer.MAX_VALUE;
                    } else if (i22 < 0) {
                        i17 = i22;
                        i18 = 0;
                    } else {
                        i18 = i22;
                        i17 = i18;
                    }
                    vVarS = qVar.s(uVar.b(0, i18, i13, false));
                } else {
                    i17 = i22;
                }
                int iC = uVar.c(vVarS);
                int iD = uVar.d(vVarS);
                iArr[i19] = iC;
                int i23 = i17 - iC;
                if (i23 < 0) {
                    i23 = 0;
                }
                iMin = Math.min(i14, i23);
                i21 += iC + iMin;
                iMax = Math.max(iMax, iD);
                vVarArr[i19] = vVarS;
            }
            i19++;
            j = j7;
        }
        long j10 = j;
        if (i20 == 0) {
            i21 -= iMin;
            i16 = 0;
        } else {
            long j11 = (i20 - 1) * j10;
            long jRound = ((i12 != Integer.MAX_VALUE ? i12 : i10) - i21) - j11;
            if (jRound < 0) {
                jRound = 0;
            }
            float f13 = jRound / f11;
            for (int i24 = 0; i24 < i15; i24++) {
                Object objT2 = ((v1.q) list2.get(i24)).t();
                jRound -= Math.round(((objT2 instanceof v ? (v) objT2 : null) != null ? r14.f3109a : 0.0f) * f13);
            }
            int i25 = 0;
            int i26 = 0;
            while (i26 < i15) {
                if (vVarArr[i26] == null) {
                    v1.q qVar2 = (v1.q) list2.get(i26);
                    Object objT3 = qVar2.t();
                    f10 = f13;
                    v vVar2 = objT3 instanceof v ? (v) objT3 : null;
                    float f14 = vVar2 != null ? vVar2.f3109a : 0.0f;
                    if (f14 <= 0.0f) {
                        d0.a.b("All weights <= 0 should have placeables");
                    }
                    float f15 = f14;
                    int iSignum = Long.signum(jRound);
                    jRound -= iSignum;
                    int iMax2 = Math.max(0, Math.round(f15 * f10) + iSignum);
                    v1.v vVarS2 = qVar2.s(uVar.b((!(vVar2 != null ? vVar2.f3110b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i13, true));
                    int iC2 = uVar.c(vVarS2);
                    int iD2 = uVar.d(vVarS2);
                    iArr[i26] = iC2;
                    i25 += iC2;
                    int iMax3 = Math.max(iMax, iD2);
                    vVarArr[i26] = vVarS2;
                    iMax = iMax3;
                } else {
                    f10 = f13;
                }
                i26++;
                list2 = list;
                f13 = f10;
            }
            i16 = (int) (i25 + j11);
            int i27 = i12 - i21;
            if (i16 < 0) {
                i16 = 0;
            }
            if (i16 > i27) {
                i16 = i27;
            }
        }
        int i28 = i16 + i21;
        if (i28 < 0) {
            i28 = 0;
        }
        int iMax4 = Math.max(i28, i10);
        int iMax5 = Math.max(iMax, Math.max(i11, 0));
        int[] iArr2 = new int[i15];
        uVar.e(iMax4, iArr, iArr2, m0Var);
        return uVar.f(vVarArr, m0Var, iArr2, iMax4, iMax5);
    }

    public abstract int b(int i10, t2.i iVar);
}
