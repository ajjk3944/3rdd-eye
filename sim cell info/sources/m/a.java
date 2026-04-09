package m;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m.f;

/* loaded from: classes.dex */
public class a {
    public static void a(g gVar) {
        if ((gVar.R0() & 32) != 32) {
            j(gVar);
            return;
        }
        gVar.O0 = true;
        gVar.I0 = false;
        gVar.J0 = false;
        gVar.K0 = false;
        ArrayList<f> arrayList = gVar.v0;
        List<h> list = gVar.H0;
        f.b bVarS = gVar.s();
        f.b bVar = f.b.WRAP_CONTENT;
        boolean z2 = bVarS == bVar;
        boolean z3 = gVar.B() == bVar;
        boolean z4 = z2 || z3;
        list.clear();
        for (f fVar : arrayList) {
            fVar.f2912r = null;
            fVar.f2899k0 = false;
            fVar.S();
        }
        for (f fVar2 : arrayList) {
            if (fVar2.f2912r == null && !b(fVar2, list, z4)) {
                j(gVar);
                gVar.O0 = false;
                return;
            }
        }
        int iMax = 0;
        int iMax2 = 0;
        for (h hVar : list) {
            iMax = Math.max(iMax, c(hVar, 0));
            iMax2 = Math.max(iMax2, c(hVar, 1));
        }
        if (z2) {
            gVar.g0(f.b.FIXED);
            gVar.y0(iMax);
            gVar.I0 = true;
            gVar.J0 = true;
            gVar.L0 = iMax;
        }
        if (z3) {
            gVar.u0(f.b.FIXED);
            gVar.b0(iMax2);
            gVar.I0 = true;
            gVar.K0 = true;
            gVar.M0 = iMax2;
        }
        i(list, 0, gVar.D());
        i(list, 1, gVar.r());
    }

    private static boolean b(f fVar, List<h> list, boolean z2) {
        h hVar = new h(new ArrayList(), true);
        list.add(hVar);
        return k(fVar, hVar, list, z2);
    }

    private static int c(h hVar, int i2) {
        int i3 = i2 * 2;
        List<f> listB = hVar.b(i2);
        int size = listB.size();
        int iMax = 0;
        for (int i4 = 0; i4 < size; i4++) {
            f fVar = listB.get(i4);
            e[] eVarArr = fVar.C;
            int i5 = i3 + 1;
            iMax = Math.max(iMax, d(fVar, i2, eVarArr[i5].f2853d == null || !(eVarArr[i3].f2853d == null || eVarArr[i5].f2853d == null), 0));
        }
        hVar.f2932e[i2] = iMax;
        return iMax;
    }

    private static int d(f fVar, int i2, boolean z2, int i3) {
        int iR;
        int iJ;
        int i4;
        int i5;
        int i6;
        int iD;
        int i7;
        int i8;
        int i9;
        int iMax = 0;
        if (!fVar.f2895i0) {
            return 0;
        }
        boolean z3 = fVar.f2919y.f2853d != null && i2 == 1;
        if (z2) {
            iR = fVar.j();
            iJ = fVar.r() - fVar.j();
            i5 = i2 * 2;
            i4 = i5 + 1;
        } else {
            iR = fVar.r() - fVar.j();
            iJ = fVar.j();
            i4 = i2 * 2;
            i5 = i4 + 1;
        }
        e[] eVarArr = fVar.C;
        if (eVarArr[i4].f2853d == null || eVarArr[i5].f2853d != null) {
            i6 = 1;
        } else {
            i6 = -1;
            int i10 = i4;
            i4 = i5;
            i5 = i10;
        }
        int i11 = z3 ? i3 - iR : i3;
        int iD2 = (eVarArr[i5].d() * i6) + e(fVar, i2);
        int i12 = i11 + iD2;
        int iD3 = (i2 == 0 ? fVar.D() : fVar.r()) * i6;
        Iterator<o> it = fVar.C[i5].f().f2955a.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, d(((m) it.next()).f2941c.f2851b, i2, z2, i12));
        }
        int iMax2 = 0;
        for (Iterator<o> it2 = fVar.C[i4].f().f2955a.iterator(); it2.hasNext(); it2 = it2) {
            iMax2 = Math.max(iMax2, d(((m) it2.next()).f2941c.f2851b, i2, z2, iD3 + i12));
        }
        if (z3) {
            iMax -= iR;
            iD = iMax2 + iJ;
        } else {
            iD = iMax2 + ((i2 == 0 ? fVar.D() : fVar.r()) * i6);
        }
        int i13 = 1;
        if (i2 == 1) {
            Iterator<o> it3 = fVar.f2919y.f().f2955a.iterator();
            int iMax3 = 0;
            while (it3.hasNext()) {
                Iterator<o> it4 = it3;
                m mVar = (m) it3.next();
                if (i6 == i13) {
                    iMax3 = Math.max(iMax3, d(mVar.f2941c.f2851b, i2, z2, iR + i12));
                    i9 = i4;
                } else {
                    i9 = i4;
                    iMax3 = Math.max(iMax3, d(mVar.f2941c.f2851b, i2, z2, (iJ * i6) + i12));
                }
                it3 = it4;
                i4 = i9;
                i13 = 1;
            }
            i7 = i4;
            int i14 = iMax3;
            i8 = (fVar.f2919y.f().f2955a.size() <= 0 || z3) ? i14 : i6 == 1 ? i14 + iR : i14 - iJ;
        } else {
            i7 = i4;
            i8 = 0;
        }
        int iMax4 = iD2 + Math.max(iMax, Math.max(iD, i8));
        int i15 = iD3 + i12;
        if (i6 == -1) {
            i15 = i12;
            i12 = i15;
        }
        if (z2) {
            k.e(fVar, i2, i12);
            fVar.Z(i12, i15, i2);
        } else {
            fVar.f2912r.a(fVar, i2);
            fVar.q0(i12, i2);
        }
        if (fVar.o(i2) == f.b.MATCH_CONSTRAINT && fVar.I != 0.0f) {
            fVar.f2912r.a(fVar, i2);
        }
        e[] eVarArr2 = fVar.C;
        if (eVarArr2[i5].f2853d != null && eVarArr2[i7].f2853d != null) {
            f fVarU = fVar.u();
            e[] eVarArr3 = fVar.C;
            if (eVarArr3[i5].f2853d.f2851b == fVarU && eVarArr3[i7].f2853d.f2851b == fVarU) {
                fVar.f2912r.a(fVar, i2);
            }
        }
        return iMax4;
    }

    private static int e(f fVar, int i2) {
        e eVar;
        int i3 = i2 * 2;
        e[] eVarArr = fVar.C;
        e eVar2 = eVarArr[i3];
        e eVar3 = eVarArr[i3 + 1];
        e eVar4 = eVar2.f2853d;
        if (eVar4 == null) {
            return 0;
        }
        f fVar2 = eVar4.f2851b;
        f fVar3 = fVar.F;
        if (fVar2 != fVar3 || (eVar = eVar3.f2853d) == null || eVar.f2851b != fVar3) {
            return 0;
        }
        return (int) ((((fVar3.t(i2) - eVar2.d()) - eVar3.d()) - fVar.t(i2)) * (i2 == 0 ? fVar.Z : fVar.f2879a0));
    }

    private static void f(g gVar, f fVar, h hVar) {
        hVar.f2931d = false;
        gVar.O0 = false;
        fVar.f2895i0 = false;
    }

    private static int g(f fVar) {
        f.b bVarS = fVar.s();
        f.b bVar = f.b.MATCH_CONSTRAINT;
        if (bVarS == bVar) {
            int iR = (int) (fVar.J == 0 ? fVar.r() * fVar.I : fVar.r() / fVar.I);
            fVar.y0(iR);
            return iR;
        }
        if (fVar.B() != bVar) {
            return -1;
        }
        int iD = (int) (fVar.J == 1 ? fVar.D() * fVar.I : fVar.D() / fVar.I);
        fVar.b0(iD);
        return iD;
    }

    private static void h(e eVar) {
        m mVarF = eVar.f();
        e eVar2 = eVar.f2853d;
        if (eVar2 == null || eVar2.f2853d == eVar) {
            return;
        }
        eVar2.f().a(mVarF);
    }

    public static void i(List<h> list, int i2, int i3) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            for (f fVar : list.get(i4).c(i2)) {
                if (fVar.f2895i0) {
                    l(fVar, i2, i3);
                }
            }
        }
    }

    private static void j(g gVar) {
        gVar.H0.clear();
        gVar.H0.add(0, new h(gVar.v0));
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean k(m.f r8, m.h r9, java.util.List<m.h> r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.a.k(m.f, m.h, java.util.List, boolean):boolean");
    }

    private static void l(f fVar, int i2, int i3) {
        int i4 = i2 * 2;
        e[] eVarArr = fVar.C;
        e eVar = eVarArr[i4];
        e eVar2 = eVarArr[i4 + 1];
        if ((eVar.f2853d == null || eVar2.f2853d == null) ? false : true) {
            k.e(fVar, i2, e(fVar, i2) + eVar.d());
            return;
        }
        if (fVar.I == 0.0f || fVar.o(i2) != f.b.MATCH_CONSTRAINT) {
            int iV = i3 - fVar.v(i2);
            int iT = iV - fVar.t(i2);
            fVar.Z(iT, iV, i2);
            k.e(fVar, i2, iT);
            return;
        }
        int iG = g(fVar);
        int i5 = (int) fVar.C[i4].f().f2946h;
        eVar2.f().f2945g = eVar.f();
        eVar2.f().f2946h = iG;
        eVar2.f().f2956b = 1;
        fVar.Z(i5, i5 + iG, i2);
    }
}
