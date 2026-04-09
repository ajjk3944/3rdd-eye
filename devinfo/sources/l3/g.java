package l3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final b f28568a = new b();

    public static boolean a(k3.d dVar) {
        int[] iArr = dVar.f27868p0;
        int i4 = iArr[0];
        int i10 = iArr[1];
        k3.d dVar2 = dVar.T;
        k3.e eVar = dVar2 != null ? (k3.e) dVar2 : null;
        if (eVar != null) {
            int i11 = eVar.f27868p0[0];
        }
        if (eVar != null) {
            int i12 = eVar.f27868p0[1];
        }
        boolean z3 = i4 == 1 || dVar.A() || i4 == 2 || (i4 == 3 && dVar.f27870r == 0 && dVar.W == 0.0f && dVar.t(0)) || (i4 == 3 && dVar.f27870r == 1 && dVar.u(0, dVar.q()));
        boolean z10 = i10 == 1 || dVar.B() || i10 == 2 || (i10 == 3 && dVar.f27871s == 0 && dVar.W == 0.0f && dVar.t(1)) || (i10 == 3 && dVar.f27871s == 1 && dVar.u(1, dVar.k()));
        return (dVar.W > 0.0f && (z3 || z10)) || (z3 && z10);
    }

    public static m b(k3.d dVar, int i4, ArrayList arrayList, m mVar) {
        int i10;
        int i11 = i4 == 0 ? dVar.f27864n0 : dVar.f27866o0;
        if (i11 != -1 && (mVar == null || i11 != mVar.f28576b)) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                m mVar2 = (m) arrayList.get(i12);
                if (mVar2.f28576b == i11) {
                    if (mVar != null) {
                        mVar.c(i4, mVar2);
                        arrayList.remove(mVar);
                    }
                    mVar = mVar2;
                } else {
                    i12++;
                }
            }
        } else if (i11 != -1) {
            return mVar;
        }
        if (mVar == null) {
            if (dVar instanceof k3.i) {
                k3.i iVar = (k3.i) dVar;
                int i13 = 0;
                while (true) {
                    if (i13 >= iVar.f27922r0) {
                        i10 = -1;
                        break;
                    }
                    k3.d dVar2 = iVar.f27921q0[i13];
                    if ((i4 == 0 && (i10 = dVar2.f27864n0) != -1) || (i4 == 1 && (i10 = dVar2.f27866o0) != -1)) {
                        break;
                    }
                    i13++;
                }
                if (i10 != -1) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList.size()) {
                            break;
                        }
                        m mVar3 = (m) arrayList.get(i14);
                        if (mVar3.f28576b == i10) {
                            mVar = mVar3;
                            break;
                        }
                        i14++;
                    }
                }
            }
            if (mVar == null) {
                mVar = new m();
                mVar.f28575a = new ArrayList();
                mVar.f28578d = null;
                mVar.f28579e = -1;
                int i15 = m.f28574f;
                m.f28574f = i15 + 1;
                mVar.f28576b = i15;
                mVar.f28577c = i4;
            }
            arrayList.add(mVar);
        }
        int i16 = mVar.f28576b;
        ArrayList arrayList2 = mVar.f28575a;
        if (arrayList2.contains(dVar)) {
            return mVar;
        }
        arrayList2.add(dVar);
        if (dVar instanceof k3.h) {
            k3.h hVar = (k3.h) dVar;
            hVar.f27918t0.c(hVar.f27919u0 == 0 ? 1 : 0, arrayList, mVar);
        }
        if (i4 == 0) {
            dVar.f27864n0 = i16;
            dVar.I.c(i4, arrayList, mVar);
            dVar.K.c(i4, arrayList, mVar);
        } else {
            dVar.f27866o0 = i16;
            dVar.J.c(i4, arrayList, mVar);
            dVar.M.c(i4, arrayList, mVar);
            dVar.L.c(i4, arrayList, mVar);
        }
        dVar.P.c(i4, arrayList, mVar);
        return mVar;
    }

    public static void c(int i4, k3.d dVar, n3.e eVar, boolean z3) {
        k3.c cVar;
        k3.c cVar2;
        boolean z10;
        k3.c cVar3;
        k3.c cVar4;
        if (dVar.f27861m) {
            return;
        }
        if (!(dVar instanceof k3.e) && dVar.z() && a(dVar)) {
            k3.e.V(dVar, eVar, new b());
        }
        k3.c cVarI = dVar.i(2);
        k3.c cVarI2 = dVar.i(4);
        int iD = cVarI.d();
        int iD2 = cVarI2.d();
        HashSet hashSet = cVarI.f27831a;
        if (hashSet != null && cVarI.f27833c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                k3.c cVar5 = (k3.c) it.next();
                k3.d dVar2 = cVar5.f27834d;
                int i10 = i4 + 1;
                boolean zA = a(dVar2);
                k3.c cVar6 = dVar2.I;
                k3.c cVar7 = dVar2.K;
                if (dVar2.z() && zA) {
                    z10 = true;
                    k3.e.V(dVar2, eVar, new b());
                } else {
                    z10 = true;
                }
                boolean z11 = ((cVar5 == cVar6 && (cVar4 = cVar7.f27836f) != null && cVar4.f27833c) || (cVar5 == cVar7 && (cVar3 = cVar6.f27836f) != null && cVar3.f27833c)) ? z10 : false;
                int i11 = dVar2.f27868p0[0];
                if (i11 != 3 || zA) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f27836f == null) {
                            int iE = cVar6.e() + iD;
                            dVar2.J(iE, dVar2.q() + iE);
                            c(i10, dVar2, eVar, z3);
                        } else if (cVar5 == cVar7 && cVar6.f27836f == null) {
                            int iE2 = iD - cVar7.e();
                            dVar2.J(iE2 - dVar2.q(), iE2);
                            c(i10, dVar2, eVar, z3);
                        } else if (z11 && !dVar2.x()) {
                            d(i10, dVar2, eVar, z3);
                        }
                    }
                } else if (i11 == 3 && dVar2.f27874v >= 0 && dVar2.f27873u >= 0 && (dVar2.f27851g0 == 8 || (dVar2.f27870r == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.x() && !dVar2.F && z11 && !dVar2.x()) {
                        e(i10, dVar, eVar, dVar2, z3);
                    }
                }
            }
        }
        if (dVar instanceof k3.h) {
            return;
        }
        HashSet hashSet2 = cVarI2.f27831a;
        if (hashSet2 != null && cVarI2.f27833c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                k3.c cVar8 = (k3.c) it2.next();
                k3.d dVar3 = cVar8.f27834d;
                int i12 = i4 + 1;
                boolean zA2 = a(dVar3);
                k3.c cVar9 = dVar3.I;
                k3.c cVar10 = dVar3.K;
                if (dVar3.z() && zA2) {
                    k3.e.V(dVar3, eVar, new b());
                }
                boolean z12 = (cVar8 == cVar9 && (cVar2 = cVar10.f27836f) != null && cVar2.f27833c) || (cVar8 == cVar10 && (cVar = cVar9.f27836f) != null && cVar.f27833c);
                int i13 = dVar3.f27868p0[0];
                if (i13 != 3 || zA2) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f27836f == null) {
                            int iE3 = cVar9.e() + iD2;
                            dVar3.J(iE3, dVar3.q() + iE3);
                            c(i12, dVar3, eVar, z3);
                        } else if (cVar8 == cVar10 && cVar9.f27836f == null) {
                            int iE4 = iD2 - cVar10.e();
                            dVar3.J(iE4 - dVar3.q(), iE4);
                            c(i12, dVar3, eVar, z3);
                        } else if (z12 && !dVar3.x()) {
                            d(i12, dVar3, eVar, z3);
                        }
                    }
                } else if (i13 == 3 && dVar3.f27874v >= 0 && dVar3.f27873u >= 0) {
                    if (dVar3.f27851g0 == 8 || (dVar3.f27870r == 0 && dVar3.W == 0.0f)) {
                        if (!dVar3.x() && !dVar3.F && z12 && !dVar3.x()) {
                            e(i12, dVar, eVar, dVar3, z3);
                        }
                    }
                }
            }
        }
        dVar.f27861m = true;
    }

    public static void d(int i4, k3.d dVar, n3.e eVar, boolean z3) {
        float f10 = dVar.f27846d0;
        k3.c cVar = dVar.I;
        int iD = cVar.f27836f.d();
        k3.c cVar2 = dVar.K;
        int iD2 = cVar2.f27836f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iQ = dVar.q();
        int i10 = (iD2 - iD) - iQ;
        if (iD > iD2) {
            i10 = (iD - iD2) - iQ;
        }
        int i11 = ((int) (i10 > 0 ? (f10 * i10) + 0.5f : f10 * i10)) + iD;
        int i12 = i11 + iQ;
        if (iD > iD2) {
            i12 = i11 - iQ;
        }
        dVar.J(i11, i12);
        c(i4 + 1, dVar, eVar, z3);
    }

    public static void e(int i4, k3.d dVar, n3.e eVar, k3.d dVar2, boolean z3) {
        float f10 = dVar2.f27846d0;
        k3.c cVar = dVar2.I;
        int iE = cVar.e() + cVar.f27836f.d();
        k3.c cVar2 = dVar2.K;
        int iD = cVar2.f27836f.d() - cVar2.e();
        if (iD >= iE) {
            int iQ = dVar2.q();
            if (dVar2.f27851g0 != 8) {
                int i10 = dVar2.f27870r;
                if (i10 == 2) {
                    iQ = (int) (dVar2.f27846d0 * 0.5f * (dVar instanceof k3.e ? dVar.q() : dVar.T.q()));
                } else if (i10 == 0) {
                    iQ = iD - iE;
                }
                iQ = Math.max(dVar2.f27873u, iQ);
                int i11 = dVar2.f27874v;
                if (i11 > 0) {
                    iQ = Math.min(i11, iQ);
                }
            }
            int i12 = iE + ((int) ((f10 * ((iD - iE) - iQ)) + 0.5f));
            dVar2.J(i12, iQ + i12);
            c(i4 + 1, dVar2, eVar, z3);
        }
    }

    public static void f(int i4, k3.d dVar, n3.e eVar) {
        float f10 = dVar.f27848e0;
        k3.c cVar = dVar.J;
        int iD = cVar.f27836f.d();
        k3.c cVar2 = dVar.L;
        int iD2 = cVar2.f27836f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = dVar.k();
        int i10 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i10 = (iD - iD2) - iK;
        }
        int i11 = (int) (i10 > 0 ? (f10 * i10) + 0.5f : f10 * i10);
        int i12 = iD + i11;
        int i13 = i12 + iK;
        if (iD > iD2) {
            i12 = iD - i11;
            i13 = i12 - iK;
        }
        dVar.K(i12, i13);
        i(i4 + 1, dVar, eVar);
    }

    public static void g(int i4, k3.d dVar, n3.e eVar, k3.d dVar2) {
        float f10 = dVar2.f27848e0;
        k3.c cVar = dVar2.J;
        int iE = cVar.e() + cVar.f27836f.d();
        k3.c cVar2 = dVar2.L;
        int iD = cVar2.f27836f.d() - cVar2.e();
        if (iD >= iE) {
            int iK = dVar2.k();
            if (dVar2.f27851g0 != 8) {
                int i10 = dVar2.f27871s;
                if (i10 == 2) {
                    iK = (int) (f10 * 0.5f * (dVar instanceof k3.e ? dVar.k() : dVar.T.k()));
                } else if (i10 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(dVar2.f27876x, iK);
                int i11 = dVar2.f27877y;
                if (i11 > 0) {
                    iK = Math.min(i11, iK);
                }
            }
            int i12 = iE + ((int) ((f10 * ((iD - iE) - iK)) + 0.5f));
            dVar2.K(i12, iK + i12);
            i(i4 + 1, dVar2, eVar);
        }
    }

    public static boolean h(int i4, int i10, int i11, int i12) {
        return (i11 == 1 || i11 == 2 || (i11 == 4 && i4 != 2)) || (i12 == 1 || i12 == 2 || (i12 == 4 && i10 != 2));
    }

    public static void i(int i4, k3.d dVar, n3.e eVar) {
        k3.c cVar;
        k3.c cVar2;
        k3.c cVar3;
        k3.c cVar4;
        if (dVar.f27863n) {
            return;
        }
        if (!(dVar instanceof k3.e) && dVar.z() && a(dVar)) {
            k3.e.V(dVar, eVar, new b());
        }
        k3.c cVarI = dVar.i(3);
        k3.c cVarI2 = dVar.i(5);
        int iD = cVarI.d();
        int iD2 = cVarI2.d();
        HashSet hashSet = cVarI.f27831a;
        if (hashSet != null && cVarI.f27833c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                k3.c cVar5 = (k3.c) it.next();
                k3.d dVar2 = cVar5.f27834d;
                int i10 = i4 + 1;
                boolean zA = a(dVar2);
                k3.c cVar6 = dVar2.J;
                k3.c cVar7 = dVar2.L;
                if (dVar2.z() && zA) {
                    k3.e.V(dVar2, eVar, new b());
                }
                boolean z3 = (cVar5 == cVar6 && (cVar4 = cVar7.f27836f) != null && cVar4.f27833c) || (cVar5 == cVar7 && (cVar3 = cVar6.f27836f) != null && cVar3.f27833c);
                int i11 = dVar2.f27868p0[1];
                if (i11 != 3 || zA) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f27836f == null) {
                            int iE = cVar6.e() + iD;
                            dVar2.K(iE, dVar2.k() + iE);
                            i(i10, dVar2, eVar);
                        } else if (cVar5 == cVar7 && cVar6.f27836f == null) {
                            int iE2 = iD - cVar7.e();
                            dVar2.K(iE2 - dVar2.k(), iE2);
                            i(i10, dVar2, eVar);
                        } else if (z3 && !dVar2.y()) {
                            f(i10, dVar2, eVar);
                        }
                    }
                } else if (i11 == 3 && dVar2.f27877y >= 0 && dVar2.f27876x >= 0 && (dVar2.f27851g0 == 8 || (dVar2.f27871s == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.y() && !dVar2.F && z3 && !dVar2.y()) {
                        g(i10, dVar, eVar, dVar2);
                    }
                }
            }
        }
        boolean z10 = true;
        if (dVar instanceof k3.h) {
            return;
        }
        HashSet hashSet2 = cVarI2.f27831a;
        if (hashSet2 != null && cVarI2.f27833c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                k3.c cVar8 = (k3.c) it2.next();
                k3.d dVar3 = cVar8.f27834d;
                int i12 = i4 + 1;
                boolean zA2 = a(dVar3);
                k3.c cVar9 = dVar3.J;
                k3.c cVar10 = dVar3.L;
                if (dVar3.z() && zA2) {
                    k3.e.V(dVar3, eVar, new b());
                }
                boolean z11 = (cVar8 == cVar9 && (cVar2 = cVar10.f27836f) != null && cVar2.f27833c) || (cVar8 == cVar10 && (cVar = cVar9.f27836f) != null && cVar.f27833c);
                int i13 = dVar3.f27868p0[1];
                if (i13 != 3 || zA2) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f27836f == null) {
                            int iE3 = cVar9.e() + iD2;
                            dVar3.K(iE3, dVar3.k() + iE3);
                            i(i12, dVar3, eVar);
                        } else if (cVar8 == cVar10 && cVar9.f27836f == null) {
                            int iE4 = iD2 - cVar10.e();
                            dVar3.K(iE4 - dVar3.k(), iE4);
                            i(i12, dVar3, eVar);
                        } else if (z11 && !dVar3.y()) {
                            f(i12, dVar3, eVar);
                        }
                    }
                } else if (i13 == 3 && dVar3.f27877y >= 0 && dVar3.f27876x >= 0 && (dVar3.f27851g0 == 8 || (dVar3.f27871s == 0 && dVar3.W == 0.0f))) {
                    if (!dVar3.y() && !dVar3.F && z11 && !dVar3.y()) {
                        g(i12, dVar, eVar, dVar3);
                    }
                }
            }
        }
        k3.c cVarI3 = dVar.i(6);
        if (cVarI3.f27831a != null && cVarI3.f27833c) {
            int iD3 = cVarI3.d();
            Iterator it3 = cVarI3.f27831a.iterator();
            while (it3.hasNext()) {
                k3.c cVar11 = (k3.c) it3.next();
                k3.d dVar4 = cVar11.f27834d;
                int i14 = i4 + 1;
                boolean zA3 = a(dVar4);
                k3.c cVar12 = dVar4.M;
                if (dVar4.z() && zA3) {
                    k3.e.V(dVar4, eVar, new b());
                }
                if (dVar4.f27868p0[z10 ? 1 : 0] != 3 || zA3) {
                    if (dVar4.z()) {
                        continue;
                    } else if (cVar11 == cVar12) {
                        int iE5 = cVar11.e() + iD3;
                        if (dVar4.E) {
                            int i15 = iE5 - dVar4.f27840a0;
                            int i16 = dVar4.V + i15;
                            dVar4.Z = i15;
                            dVar4.J.l(i15);
                            dVar4.L.l(i16);
                            cVar12.l(iE5);
                            dVar4.f27859l = z10 ? 1 : 0;
                        }
                        i(i14, dVar4, eVar);
                    }
                }
                z10 = true;
            }
        }
        dVar.f27863n = true;
    }
}
