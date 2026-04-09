package k1;

import j1.C6241a;
import j1.d;
import j1.e;
import java.util.ArrayList;
import java.util.Iterator;
import k1.C6356b;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static C6356b.a f51057a = new C6356b.a();

    /* renamed from: b, reason: collision with root package name */
    private static int f51058b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f51059c = 0;

    private static boolean a(int i10, j1.e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b bVarX = eVar.x();
        e.b bVarM = eVar.M();
        j1.f fVar = eVar.F() != null ? (j1.f) eVar.F() : null;
        if (fVar != null) {
            fVar.x();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.M();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        boolean z10 = bVarX == bVar5 || eVar.e0() || bVarX == e.b.WRAP_CONTENT || (bVarX == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f49936w == 0 && eVar.f49897c0 == 0.0f && eVar.S(0)) || (bVarX == bVar2 && eVar.f49936w == 1 && eVar.V(0, eVar.O()));
        boolean z11 = bVarM == bVar5 || eVar.f0() || bVarM == e.b.WRAP_CONTENT || (bVarM == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f49938x == 0 && eVar.f49897c0 == 0.0f && eVar.S(1)) || (bVarM == bVar && eVar.f49938x == 1 && eVar.V(1, eVar.u()));
        if (eVar.f49897c0 <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    private static void b(int i10, j1.e eVar, C6356b.InterfaceC1888b interfaceC1888b, boolean z10) {
        j1.d dVar;
        j1.d dVar2;
        j1.d dVar3;
        j1.d dVar4;
        if (eVar.Y()) {
            return;
        }
        boolean z11 = true;
        f51058b++;
        if (!(eVar instanceof j1.f) && eVar.d0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                j1.f.A1(i11, eVar, interfaceC1888b, new C6356b.a(), C6356b.a.f51020k);
            }
        }
        j1.d dVarL = eVar.l(d.a.LEFT);
        j1.d dVarL2 = eVar.l(d.a.RIGHT);
        int iE = dVarL.e();
        int iE2 = dVarL2.e();
        if (dVarL.d() != null && dVarL.n()) {
            Iterator it = dVarL.d().iterator();
            while (it.hasNext()) {
                j1.d dVar5 = (j1.d) it.next();
                j1.e eVar2 = dVar5.f49850d;
                int i12 = i10 + 1;
                boolean zA = a(i12, eVar2);
                if (eVar2.d0() && zA) {
                    j1.f.A1(i12, eVar2, interfaceC1888b, new C6356b.a(), C6356b.a.f51020k);
                }
                boolean z12 = ((dVar5 == eVar2.f49879N && (dVar4 = eVar2.f49881P.f49852f) != null && dVar4.n()) || (dVar5 == eVar2.f49881P && (dVar3 = eVar2.f49879N.f49852f) != null && dVar3.n())) ? z11 : false;
                e.b bVarX = eVar2.x();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarX != bVar || zA) {
                    if (!eVar2.d0()) {
                        j1.d dVar6 = eVar2.f49879N;
                        if (dVar5 == dVar6 && eVar2.f49881P.f49852f == null) {
                            int iF = dVar6.f() + iE;
                            eVar2.t0(iF, eVar2.O() + iF);
                            b(i12, eVar2, interfaceC1888b, z10);
                        } else {
                            j1.d dVar7 = eVar2.f49881P;
                            if (dVar5 == dVar7 && dVar6.f49852f == null) {
                                int iF2 = iE - dVar7.f();
                                eVar2.t0(iF2 - eVar2.O(), iF2);
                                b(i12, eVar2, interfaceC1888b, z10);
                            } else if (z12 && !eVar2.a0()) {
                                d(i12, interfaceC1888b, eVar2, z10);
                            }
                        }
                    }
                } else if (eVar2.x() == bVar && eVar2.f49857A >= 0 && eVar2.f49942z >= 0 && ((eVar2.N() == 8 || (eVar2.f49936w == 0 && eVar2.s() == 0.0f)) && !eVar2.a0() && !eVar2.c0() && z12 && !eVar2.a0())) {
                    e(i12, eVar, interfaceC1888b, eVar2, z10);
                }
                z11 = true;
            }
        }
        if (eVar instanceof j1.h) {
            return;
        }
        if (dVarL2.d() != null && dVarL2.n()) {
            Iterator it2 = dVarL2.d().iterator();
            while (it2.hasNext()) {
                j1.d dVar8 = (j1.d) it2.next();
                j1.e eVar3 = dVar8.f49850d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, eVar3);
                if (eVar3.d0() && zA2) {
                    j1.f.A1(i13, eVar3, interfaceC1888b, new C6356b.a(), C6356b.a.f51020k);
                }
                boolean z13 = (dVar8 == eVar3.f49879N && (dVar2 = eVar3.f49881P.f49852f) != null && dVar2.n()) || (dVar8 == eVar3.f49881P && (dVar = eVar3.f49879N.f49852f) != null && dVar.n());
                e.b bVarX2 = eVar3.x();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVarX2 != bVar2 || zA2) {
                    if (!eVar3.d0()) {
                        j1.d dVar9 = eVar3.f49879N;
                        if (dVar8 == dVar9 && eVar3.f49881P.f49852f == null) {
                            int iF3 = dVar9.f() + iE2;
                            eVar3.t0(iF3, eVar3.O() + iF3);
                            b(i13, eVar3, interfaceC1888b, z10);
                        } else {
                            j1.d dVar10 = eVar3.f49881P;
                            if (dVar8 == dVar10 && dVar9.f49852f == null) {
                                int iF4 = iE2 - dVar10.f();
                                eVar3.t0(iF4 - eVar3.O(), iF4);
                                b(i13, eVar3, interfaceC1888b, z10);
                            } else if (z13 && !eVar3.a0()) {
                                d(i13, interfaceC1888b, eVar3, z10);
                            }
                        }
                    }
                } else if (eVar3.x() == bVar2 && eVar3.f49857A >= 0 && eVar3.f49942z >= 0 && (eVar3.N() == 8 || (eVar3.f49936w == 0 && eVar3.s() == 0.0f))) {
                    if (!eVar3.a0() && !eVar3.c0() && z13 && !eVar3.a0()) {
                        e(i13, eVar, interfaceC1888b, eVar3, z10);
                    }
                }
            }
        }
        eVar.h0();
    }

    private static void c(int i10, C6241a c6241a, C6356b.InterfaceC1888b interfaceC1888b, int i11, boolean z10) {
        if (c6241a.d1()) {
            if (i11 == 0) {
                b(i10 + 1, c6241a, interfaceC1888b, z10);
            } else {
                i(i10 + 1, c6241a, interfaceC1888b);
            }
        }
    }

    private static void d(int i10, C6356b.InterfaceC1888b interfaceC1888b, j1.e eVar, boolean z10) {
        float fV = eVar.v();
        int iE = eVar.f49879N.f49852f.e();
        int iE2 = eVar.f49881P.f49852f.e();
        int iF = eVar.f49879N.f() + iE;
        int iF2 = iE2 - eVar.f49881P.f();
        if (iE == iE2) {
            fV = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iO = eVar.O();
        int i11 = (iE2 - iE) - iO;
        if (iE > iE2) {
            i11 = (iE - iE2) - iO;
        }
        int i12 = ((int) (i11 > 0 ? (fV * i11) + 0.5f : fV * i11)) + iE;
        int i13 = i12 + iO;
        if (iE > iE2) {
            i13 = i12 - iO;
        }
        eVar.t0(i12, i13);
        b(i10 + 1, eVar, interfaceC1888b, z10);
    }

    private static void e(int i10, j1.e eVar, C6356b.InterfaceC1888b interfaceC1888b, j1.e eVar2, boolean z10) {
        float fV = eVar2.v();
        int iE = eVar2.f49879N.f49852f.e() + eVar2.f49879N.f();
        int iE2 = eVar2.f49881P.f49852f.e() - eVar2.f49881P.f();
        if (iE2 >= iE) {
            int iO = eVar2.O();
            if (eVar2.N() != 8) {
                int i11 = eVar2.f49936w;
                if (i11 == 2) {
                    iO = (int) (eVar2.v() * 0.5f * (eVar instanceof j1.f ? eVar.O() : eVar.F().O()));
                } else if (i11 == 0) {
                    iO = iE2 - iE;
                }
                iO = Math.max(eVar2.f49942z, iO);
                int i12 = eVar2.f49857A;
                if (i12 > 0) {
                    iO = Math.min(i12, iO);
                }
            }
            int i13 = iE + ((int) ((fV * ((iE2 - iE) - iO)) + 0.5f));
            eVar2.t0(i13, iO + i13);
            b(i10 + 1, eVar2, interfaceC1888b, z10);
        }
    }

    private static void f(int i10, C6356b.InterfaceC1888b interfaceC1888b, j1.e eVar) {
        float fK = eVar.K();
        int iE = eVar.f49880O.f49852f.e();
        int iE2 = eVar.f49882Q.f49852f.e();
        int iF = eVar.f49880O.f() + iE;
        int iF2 = iE2 - eVar.f49882Q.f();
        if (iE == iE2) {
            fK = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iU = eVar.u();
        int i11 = (iE2 - iE) - iU;
        if (iE > iE2) {
            i11 = (iE - iE2) - iU;
        }
        int i12 = (int) (i11 > 0 ? (fK * i11) + 0.5f : fK * i11);
        int i13 = iE + i12;
        int i14 = i13 + iU;
        if (iE > iE2) {
            i13 = iE - i12;
            i14 = i13 - iU;
        }
        eVar.w0(i13, i14);
        i(i10 + 1, eVar, interfaceC1888b);
    }

    private static void g(int i10, j1.e eVar, C6356b.InterfaceC1888b interfaceC1888b, j1.e eVar2) {
        float fK = eVar2.K();
        int iE = eVar2.f49880O.f49852f.e() + eVar2.f49880O.f();
        int iE2 = eVar2.f49882Q.f49852f.e() - eVar2.f49882Q.f();
        if (iE2 >= iE) {
            int iU = eVar2.u();
            if (eVar2.N() != 8) {
                int i11 = eVar2.f49938x;
                if (i11 == 2) {
                    iU = (int) (fK * 0.5f * (eVar instanceof j1.f ? eVar.u() : eVar.F().u()));
                } else if (i11 == 0) {
                    iU = iE2 - iE;
                }
                iU = Math.max(eVar2.f49861C, iU);
                int i12 = eVar2.f49863D;
                if (i12 > 0) {
                    iU = Math.min(i12, iU);
                }
            }
            int i13 = iE + ((int) ((fK * ((iE2 - iE) - iU)) + 0.5f));
            eVar2.w0(i13, iU + i13);
            i(i10 + 1, eVar2, interfaceC1888b);
        }
    }

    public static void h(j1.f fVar, C6356b.InterfaceC1888b interfaceC1888b) {
        e.b bVarX = fVar.x();
        e.b bVarM = fVar.M();
        f51058b = 0;
        f51059c = 0;
        fVar.m0();
        ArrayList arrayListC1 = fVar.c1();
        int size = arrayListC1.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((j1.e) arrayListC1.get(i10)).m0();
        }
        boolean zY1 = fVar.y1();
        if (bVarX == e.b.FIXED) {
            fVar.t0(0, fVar.O());
        } else {
            fVar.u0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            j1.e eVar = (j1.e) arrayListC1.get(i11);
            if (eVar instanceof j1.h) {
                j1.h hVar = (j1.h) eVar;
                if (hVar.b1() == 1) {
                    if (hVar.c1() != -1) {
                        hVar.f1(hVar.c1());
                    } else if (hVar.d1() != -1 && fVar.e0()) {
                        hVar.f1(fVar.O() - hVar.d1());
                    } else if (fVar.e0()) {
                        hVar.f1((int) ((hVar.e1() * fVar.O()) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((eVar instanceof C6241a) && ((C6241a) eVar).h1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                j1.e eVar2 = (j1.e) arrayListC1.get(i12);
                if (eVar2 instanceof j1.h) {
                    j1.h hVar2 = (j1.h) eVar2;
                    if (hVar2.b1() == 1) {
                        b(0, hVar2, interfaceC1888b, zY1);
                    }
                }
            }
        }
        b(0, fVar, interfaceC1888b, zY1);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                j1.e eVar3 = (j1.e) arrayListC1.get(i13);
                if (eVar3 instanceof C6241a) {
                    C6241a c6241a = (C6241a) eVar3;
                    if (c6241a.h1() == 0) {
                        c(0, c6241a, interfaceC1888b, 0, zY1);
                    }
                }
            }
        }
        if (bVarM == e.b.FIXED) {
            fVar.w0(0, fVar.u());
        } else {
            fVar.v0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            j1.e eVar4 = (j1.e) arrayListC1.get(i14);
            if (eVar4 instanceof j1.h) {
                j1.h hVar3 = (j1.h) eVar4;
                if (hVar3.b1() == 0) {
                    if (hVar3.c1() != -1) {
                        hVar3.f1(hVar3.c1());
                    } else if (hVar3.d1() != -1 && fVar.f0()) {
                        hVar3.f1(fVar.u() - hVar3.d1());
                    } else if (fVar.f0()) {
                        hVar3.f1((int) ((hVar3.e1() * fVar.u()) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((eVar4 instanceof C6241a) && ((C6241a) eVar4).h1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                j1.e eVar5 = (j1.e) arrayListC1.get(i15);
                if (eVar5 instanceof j1.h) {
                    j1.h hVar4 = (j1.h) eVar5;
                    if (hVar4.b1() == 0) {
                        i(1, hVar4, interfaceC1888b);
                    }
                }
            }
        }
        i(0, fVar, interfaceC1888b);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                j1.e eVar6 = (j1.e) arrayListC1.get(i16);
                if (eVar6 instanceof C6241a) {
                    C6241a c6241a2 = (C6241a) eVar6;
                    if (c6241a2.h1() == 1) {
                        c(0, c6241a2, interfaceC1888b, 1, zY1);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            j1.e eVar7 = (j1.e) arrayListC1.get(i17);
            if (eVar7.d0() && a(0, eVar7)) {
                j1.f.A1(0, eVar7, interfaceC1888b, f51057a, C6356b.a.f51020k);
                if (!(eVar7 instanceof j1.h)) {
                    b(0, eVar7, interfaceC1888b, zY1);
                    i(0, eVar7, interfaceC1888b);
                } else if (((j1.h) eVar7).b1() == 0) {
                    i(0, eVar7, interfaceC1888b);
                } else {
                    b(0, eVar7, interfaceC1888b, zY1);
                }
            }
        }
    }

    private static void i(int i10, j1.e eVar, C6356b.InterfaceC1888b interfaceC1888b) {
        j1.d dVar;
        j1.d dVar2;
        j1.d dVar3;
        j1.d dVar4;
        if (eVar.g0()) {
            return;
        }
        f51059c++;
        if (!(eVar instanceof j1.f) && eVar.d0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                j1.f.A1(i11, eVar, interfaceC1888b, new C6356b.a(), C6356b.a.f51020k);
            }
        }
        j1.d dVarL = eVar.l(d.a.TOP);
        j1.d dVarL2 = eVar.l(d.a.BOTTOM);
        int iE = dVarL.e();
        int iE2 = dVarL2.e();
        if (dVarL.d() != null && dVarL.n()) {
            Iterator it = dVarL.d().iterator();
            while (it.hasNext()) {
                j1.d dVar5 = (j1.d) it.next();
                j1.e eVar2 = dVar5.f49850d;
                int i12 = i10 + 1;
                boolean zA = a(i12, eVar2);
                if (eVar2.d0() && zA) {
                    j1.f.A1(i12, eVar2, interfaceC1888b, new C6356b.a(), C6356b.a.f51020k);
                }
                boolean z10 = (dVar5 == eVar2.f49880O && (dVar4 = eVar2.f49882Q.f49852f) != null && dVar4.n()) || (dVar5 == eVar2.f49882Q && (dVar3 = eVar2.f49880O.f49852f) != null && dVar3.n());
                e.b bVarM = eVar2.M();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarM != bVar || zA) {
                    if (!eVar2.d0()) {
                        j1.d dVar6 = eVar2.f49880O;
                        if (dVar5 == dVar6 && eVar2.f49882Q.f49852f == null) {
                            int iF = dVar6.f() + iE;
                            eVar2.w0(iF, eVar2.u() + iF);
                            i(i12, eVar2, interfaceC1888b);
                        } else {
                            j1.d dVar7 = eVar2.f49882Q;
                            if (dVar5 == dVar7 && dVar6.f49852f == null) {
                                int iF2 = iE - dVar7.f();
                                eVar2.w0(iF2 - eVar2.u(), iF2);
                                i(i12, eVar2, interfaceC1888b);
                            } else if (z10 && !eVar2.b0()) {
                                f(i12, interfaceC1888b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.M() == bVar && eVar2.f49863D >= 0 && eVar2.f49861C >= 0 && (eVar2.N() == 8 || (eVar2.f49938x == 0 && eVar2.s() == 0.0f))) {
                    if (!eVar2.b0() && !eVar2.c0() && z10 && !eVar2.b0()) {
                        g(i12, eVar, interfaceC1888b, eVar2);
                    }
                }
            }
        }
        if (eVar instanceof j1.h) {
            return;
        }
        if (dVarL2.d() != null && dVarL2.n()) {
            Iterator it2 = dVarL2.d().iterator();
            while (it2.hasNext()) {
                j1.d dVar8 = (j1.d) it2.next();
                j1.e eVar3 = dVar8.f49850d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, eVar3);
                if (eVar3.d0() && zA2) {
                    j1.f.A1(i13, eVar3, interfaceC1888b, new C6356b.a(), C6356b.a.f51020k);
                }
                boolean z11 = (dVar8 == eVar3.f49880O && (dVar2 = eVar3.f49882Q.f49852f) != null && dVar2.n()) || (dVar8 == eVar3.f49882Q && (dVar = eVar3.f49880O.f49852f) != null && dVar.n());
                e.b bVarM2 = eVar3.M();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVarM2 != bVar2 || zA2) {
                    if (!eVar3.d0()) {
                        j1.d dVar9 = eVar3.f49880O;
                        if (dVar8 == dVar9 && eVar3.f49882Q.f49852f == null) {
                            int iF3 = dVar9.f() + iE2;
                            eVar3.w0(iF3, eVar3.u() + iF3);
                            i(i13, eVar3, interfaceC1888b);
                        } else {
                            j1.d dVar10 = eVar3.f49882Q;
                            if (dVar8 == dVar10 && dVar9.f49852f == null) {
                                int iF4 = iE2 - dVar10.f();
                                eVar3.w0(iF4 - eVar3.u(), iF4);
                                i(i13, eVar3, interfaceC1888b);
                            } else if (z11 && !eVar3.b0()) {
                                f(i13, interfaceC1888b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.M() == bVar2 && eVar3.f49863D >= 0 && eVar3.f49861C >= 0 && (eVar3.N() == 8 || (eVar3.f49938x == 0 && eVar3.s() == 0.0f))) {
                    if (!eVar3.b0() && !eVar3.c0() && z11 && !eVar3.b0()) {
                        g(i13, eVar, interfaceC1888b, eVar3);
                    }
                }
            }
        }
        j1.d dVarL3 = eVar.l(d.a.BASELINE);
        if (dVarL3.d() != null && dVarL3.n()) {
            int iE3 = dVarL3.e();
            Iterator it3 = dVarL3.d().iterator();
            while (it3.hasNext()) {
                j1.d dVar11 = (j1.d) it3.next();
                j1.e eVar4 = dVar11.f49850d;
                int i14 = i10 + 1;
                boolean zA3 = a(i14, eVar4);
                if (eVar4.d0() && zA3) {
                    j1.f.A1(i14, eVar4, interfaceC1888b, new C6356b.a(), C6356b.a.f51020k);
                }
                if (eVar4.M() != e.b.MATCH_CONSTRAINT || zA3) {
                    if (!eVar4.d0() && dVar11 == eVar4.f49883R) {
                        eVar4.s0(dVar11.f() + iE3);
                        i(i14, eVar4, interfaceC1888b);
                    }
                }
            }
        }
        eVar.i0();
    }
}
