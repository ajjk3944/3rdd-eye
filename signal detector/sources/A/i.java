package A;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final b f31a = new b();

    public static boolean a(z.d dVar) {
        int[] iArr = dVar.f24346p0;
        int i = iArr[0];
        int i3 = iArr[1];
        z.d dVar2 = dVar.f24310T;
        z.e eVar = dVar2 != null ? (z.e) dVar2 : null;
        if (eVar != null) {
            int i6 = eVar.f24346p0[0];
        }
        if (eVar != null) {
            int i7 = eVar.f24346p0[1];
        }
        boolean z6 = i == 1 || dVar.A() || i == 2 || (i == 3 && dVar.f24348r == 0 && dVar.f24313W == 0.0f && dVar.t(0)) || (i == 3 && dVar.f24348r == 1 && dVar.u(0, dVar.q()));
        boolean z7 = i3 == 1 || dVar.B() || i3 == 2 || (i3 == 3 && dVar.f24349s == 0 && dVar.f24313W == 0.0f && dVar.t(1)) || (i3 == 3 && dVar.f24349s == 1 && dVar.u(1, dVar.k()));
        return (dVar.f24313W > 0.0f && (z6 || z7)) || (z6 && z7);
    }

    public static o b(z.d dVar, int i, ArrayList arrayList, o oVar) {
        int i3;
        int i6 = i == 0 ? dVar.f24342n0 : dVar.f24344o0;
        if (i6 != -1 && (oVar == null || i6 != oVar.f39b)) {
            int i7 = 0;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                o oVar2 = (o) arrayList.get(i7);
                if (oVar2.f39b == i6) {
                    if (oVar != null) {
                        oVar.c(i, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i7++;
                }
            }
        } else if (i6 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (dVar instanceof z.i) {
                z.i iVar = (z.i) dVar;
                int i8 = 0;
                while (true) {
                    if (i8 >= iVar.f24436r0) {
                        i3 = -1;
                        break;
                    }
                    z.d dVar2 = iVar.f24435q0[i8];
                    if ((i == 0 && (i3 = dVar2.f24342n0) != -1) || (i == 1 && (i3 = dVar2.f24344o0) != -1)) {
                        break;
                    }
                    i8++;
                }
                if (i3 != -1) {
                    int i9 = 0;
                    while (true) {
                        if (i9 >= arrayList.size()) {
                            break;
                        }
                        o oVar3 = (o) arrayList.get(i9);
                        if (oVar3.f39b == i3) {
                            oVar = oVar3;
                            break;
                        }
                        i9++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o();
                oVar.f38a = new ArrayList();
                oVar.f41d = null;
                oVar.f42e = -1;
                int i10 = o.f37f;
                o.f37f = i10 + 1;
                oVar.f39b = i10;
                oVar.f40c = i;
            }
            arrayList.add(oVar);
        }
        int i11 = oVar.f39b;
        ArrayList arrayList2 = oVar.f38a;
        if (arrayList2.contains(dVar)) {
            return oVar;
        }
        arrayList2.add(dVar);
        if (dVar instanceof z.h) {
            z.h hVar = (z.h) dVar;
            hVar.f24433t0.c(hVar.f24434u0 == 0 ? 1 : 0, oVar, arrayList);
        }
        if (i == 0) {
            dVar.f24342n0 = i11;
            dVar.f24300I.c(i, oVar, arrayList);
            dVar.f24302K.c(i, oVar, arrayList);
        } else {
            dVar.f24344o0 = i11;
            dVar.f24301J.c(i, oVar, arrayList);
            dVar.M.c(i, oVar, arrayList);
            dVar.f24303L.c(i, oVar, arrayList);
        }
        dVar.f24306P.c(i, oVar, arrayList);
        return oVar;
    }

    public static void c(int i, C.f fVar, z.d dVar, boolean z6) {
        z.c cVar;
        z.c cVar2;
        boolean z7;
        z.c cVar3;
        z.c cVar4;
        if (dVar.f24339m) {
            return;
        }
        if (!(dVar instanceof z.e) && dVar.z() && a(dVar)) {
            z.e.V(dVar, fVar, new b());
        }
        z.c cVarI = dVar.i(2);
        z.c cVarI2 = dVar.i(4);
        int iD = cVarI.d();
        int iD2 = cVarI2.d();
        HashSet hashSet = cVarI.f24284a;
        if (hashSet != null && cVarI.f24286c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                z.c cVar5 = (z.c) it.next();
                z.d dVar2 = cVar5.f24287d;
                int i3 = i + 1;
                boolean zA = a(dVar2);
                z.c cVar6 = dVar2.f24300I;
                z.c cVar7 = dVar2.f24302K;
                if (dVar2.z() && zA) {
                    z7 = true;
                    z.e.V(dVar2, fVar, new b());
                } else {
                    z7 = true;
                }
                boolean z8 = ((cVar5 == cVar6 && (cVar4 = cVar7.f24289f) != null && cVar4.f24286c) || (cVar5 == cVar7 && (cVar3 = cVar6.f24289f) != null && cVar3.f24286c)) ? z7 : false;
                int i6 = dVar2.f24346p0[0];
                if (i6 != 3 || zA) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f24289f == null) {
                            int iE = cVar6.e() + iD;
                            dVar2.J(iE, dVar2.q() + iE);
                            c(i3, fVar, dVar2, z6);
                        } else if (cVar5 == cVar7 && cVar6.f24289f == null) {
                            int iE2 = iD - cVar7.e();
                            dVar2.J(iE2 - dVar2.q(), iE2);
                            c(i3, fVar, dVar2, z6);
                        } else if (z8 && !dVar2.x()) {
                            d(i3, fVar, dVar2, z6);
                        }
                    }
                } else if (i6 == 3 && dVar2.f24352v >= 0 && dVar2.f24351u >= 0 && (dVar2.f24329g0 == 8 || (dVar2.f24348r == 0 && dVar2.f24313W == 0.0f))) {
                    if (!dVar2.x() && !dVar2.f24297F && z8 && !dVar2.x()) {
                        e(i3, dVar, fVar, dVar2, z6);
                    }
                }
            }
        }
        if (dVar instanceof z.h) {
            return;
        }
        HashSet hashSet2 = cVarI2.f24284a;
        if (hashSet2 != null && cVarI2.f24286c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                z.c cVar8 = (z.c) it2.next();
                z.d dVar3 = cVar8.f24287d;
                int i7 = i + 1;
                boolean zA2 = a(dVar3);
                z.c cVar9 = dVar3.f24300I;
                z.c cVar10 = dVar3.f24302K;
                if (dVar3.z() && zA2) {
                    z.e.V(dVar3, fVar, new b());
                }
                boolean z9 = (cVar8 == cVar9 && (cVar2 = cVar10.f24289f) != null && cVar2.f24286c) || (cVar8 == cVar10 && (cVar = cVar9.f24289f) != null && cVar.f24286c);
                int i8 = dVar3.f24346p0[0];
                if (i8 != 3 || zA2) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f24289f == null) {
                            int iE3 = cVar9.e() + iD2;
                            dVar3.J(iE3, dVar3.q() + iE3);
                            c(i7, fVar, dVar3, z6);
                        } else if (cVar8 == cVar10 && cVar9.f24289f == null) {
                            int iE4 = iD2 - cVar10.e();
                            dVar3.J(iE4 - dVar3.q(), iE4);
                            c(i7, fVar, dVar3, z6);
                        } else if (z9 && !dVar3.x()) {
                            d(i7, fVar, dVar3, z6);
                        }
                    }
                } else if (i8 == 3 && dVar3.f24352v >= 0 && dVar3.f24351u >= 0) {
                    if (dVar3.f24329g0 == 8 || (dVar3.f24348r == 0 && dVar3.f24313W == 0.0f)) {
                        if (!dVar3.x() && !dVar3.f24297F && z9 && !dVar3.x()) {
                            e(i7, dVar, fVar, dVar3, z6);
                        }
                    }
                }
            }
        }
        dVar.f24339m = true;
    }

    public static void d(int i, C.f fVar, z.d dVar, boolean z6) {
        float f2 = dVar.f24323d0;
        z.c cVar = dVar.f24300I;
        int iD = cVar.f24289f.d();
        z.c cVar2 = dVar.f24302K;
        int iD2 = cVar2.f24289f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iQ = dVar.q();
        int i3 = (iD2 - iD) - iQ;
        if (iD > iD2) {
            i3 = (iD - iD2) - iQ;
        }
        int i6 = ((int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3)) + iD;
        int i7 = i6 + iQ;
        if (iD > iD2) {
            i7 = i6 - iQ;
        }
        dVar.J(i6, i7);
        c(i + 1, fVar, dVar, z6);
    }

    public static void e(int i, z.d dVar, C.f fVar, z.d dVar2, boolean z6) {
        float f2 = dVar2.f24323d0;
        z.c cVar = dVar2.f24300I;
        int iE = cVar.e() + cVar.f24289f.d();
        z.c cVar2 = dVar2.f24302K;
        int iD = cVar2.f24289f.d() - cVar2.e();
        if (iD >= iE) {
            int iQ = dVar2.q();
            if (dVar2.f24329g0 != 8) {
                int i3 = dVar2.f24348r;
                if (i3 == 2) {
                    iQ = (int) (dVar2.f24323d0 * 0.5f * (dVar instanceof z.e ? dVar.q() : dVar.f24310T.q()));
                } else if (i3 == 0) {
                    iQ = iD - iE;
                }
                iQ = Math.max(dVar2.f24351u, iQ);
                int i6 = dVar2.f24352v;
                if (i6 > 0) {
                    iQ = Math.min(i6, iQ);
                }
            }
            int i7 = iE + ((int) ((f2 * ((iD - iE) - iQ)) + 0.5f));
            dVar2.J(i7, iQ + i7);
            c(i + 1, fVar, dVar2, z6);
        }
    }

    public static void f(int i, C.f fVar, z.d dVar) {
        float f2 = dVar.f24325e0;
        z.c cVar = dVar.f24301J;
        int iD = cVar.f24289f.d();
        z.c cVar2 = dVar.f24303L;
        int iD2 = cVar2.f24289f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = dVar.k();
        int i3 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i3 = (iD - iD2) - iK;
        }
        int i6 = (int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3);
        int i7 = iD + i6;
        int i8 = i7 + iK;
        if (iD > iD2) {
            i7 = iD - i6;
            i8 = i7 - iK;
        }
        dVar.K(i7, i8);
        i(i + 1, fVar, dVar);
    }

    public static void g(int i, z.d dVar, C.f fVar, z.d dVar2) {
        float f2 = dVar2.f24325e0;
        z.c cVar = dVar2.f24301J;
        int iE = cVar.e() + cVar.f24289f.d();
        z.c cVar2 = dVar2.f24303L;
        int iD = cVar2.f24289f.d() - cVar2.e();
        if (iD >= iE) {
            int iK = dVar2.k();
            if (dVar2.f24329g0 != 8) {
                int i3 = dVar2.f24349s;
                if (i3 == 2) {
                    iK = (int) (f2 * 0.5f * (dVar instanceof z.e ? dVar.k() : dVar.f24310T.k()));
                } else if (i3 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(dVar2.f24354x, iK);
                int i6 = dVar2.f24355y;
                if (i6 > 0) {
                    iK = Math.min(i6, iK);
                }
            }
            int i7 = iE + ((int) ((f2 * ((iD - iE) - iK)) + 0.5f));
            dVar2.K(i7, iK + i7);
            i(i + 1, fVar, dVar2);
        }
    }

    public static boolean h(int i, int i3, int i6, int i7) {
        return (i6 == 1 || i6 == 2 || (i6 == 4 && i != 2)) || (i7 == 1 || i7 == 2 || (i7 == 4 && i3 != 2));
    }

    public static void i(int i, C.f fVar, z.d dVar) {
        z.c cVar;
        z.c cVar2;
        z.c cVar3;
        z.c cVar4;
        if (dVar.f24341n) {
            return;
        }
        if (!(dVar instanceof z.e) && dVar.z() && a(dVar)) {
            z.e.V(dVar, fVar, new b());
        }
        z.c cVarI = dVar.i(3);
        z.c cVarI2 = dVar.i(5);
        int iD = cVarI.d();
        int iD2 = cVarI2.d();
        HashSet hashSet = cVarI.f24284a;
        if (hashSet != null && cVarI.f24286c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                z.c cVar5 = (z.c) it.next();
                z.d dVar2 = cVar5.f24287d;
                int i3 = i + 1;
                boolean zA = a(dVar2);
                z.c cVar6 = dVar2.f24301J;
                z.c cVar7 = dVar2.f24303L;
                if (dVar2.z() && zA) {
                    z.e.V(dVar2, fVar, new b());
                }
                boolean z6 = (cVar5 == cVar6 && (cVar4 = cVar7.f24289f) != null && cVar4.f24286c) || (cVar5 == cVar7 && (cVar3 = cVar6.f24289f) != null && cVar3.f24286c);
                int i6 = dVar2.f24346p0[1];
                if (i6 != 3 || zA) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f24289f == null) {
                            int iE = cVar6.e() + iD;
                            dVar2.K(iE, dVar2.k() + iE);
                            i(i3, fVar, dVar2);
                        } else if (cVar5 == cVar7 && cVar6.f24289f == null) {
                            int iE2 = iD - cVar7.e();
                            dVar2.K(iE2 - dVar2.k(), iE2);
                            i(i3, fVar, dVar2);
                        } else if (z6 && !dVar2.y()) {
                            f(i3, fVar, dVar2);
                        }
                    }
                } else if (i6 == 3 && dVar2.f24355y >= 0 && dVar2.f24354x >= 0 && (dVar2.f24329g0 == 8 || (dVar2.f24349s == 0 && dVar2.f24313W == 0.0f))) {
                    if (!dVar2.y() && !dVar2.f24297F && z6 && !dVar2.y()) {
                        g(i3, dVar, fVar, dVar2);
                    }
                }
            }
        }
        boolean z7 = true;
        if (dVar instanceof z.h) {
            return;
        }
        HashSet hashSet2 = cVarI2.f24284a;
        if (hashSet2 != null && cVarI2.f24286c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                z.c cVar8 = (z.c) it2.next();
                z.d dVar3 = cVar8.f24287d;
                int i7 = i + 1;
                boolean zA2 = a(dVar3);
                z.c cVar9 = dVar3.f24301J;
                z.c cVar10 = dVar3.f24303L;
                if (dVar3.z() && zA2) {
                    z.e.V(dVar3, fVar, new b());
                }
                boolean z8 = (cVar8 == cVar9 && (cVar2 = cVar10.f24289f) != null && cVar2.f24286c) || (cVar8 == cVar10 && (cVar = cVar9.f24289f) != null && cVar.f24286c);
                int i8 = dVar3.f24346p0[1];
                if (i8 != 3 || zA2) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f24289f == null) {
                            int iE3 = cVar9.e() + iD2;
                            dVar3.K(iE3, dVar3.k() + iE3);
                            i(i7, fVar, dVar3);
                        } else if (cVar8 == cVar10 && cVar9.f24289f == null) {
                            int iE4 = iD2 - cVar10.e();
                            dVar3.K(iE4 - dVar3.k(), iE4);
                            i(i7, fVar, dVar3);
                        } else if (z8 && !dVar3.y()) {
                            f(i7, fVar, dVar3);
                        }
                    }
                } else if (i8 == 3 && dVar3.f24355y >= 0 && dVar3.f24354x >= 0 && (dVar3.f24329g0 == 8 || (dVar3.f24349s == 0 && dVar3.f24313W == 0.0f))) {
                    if (!dVar3.y() && !dVar3.f24297F && z8 && !dVar3.y()) {
                        g(i7, dVar, fVar, dVar3);
                    }
                }
            }
        }
        z.c cVarI3 = dVar.i(6);
        if (cVarI3.f24284a != null && cVarI3.f24286c) {
            int iD3 = cVarI3.d();
            Iterator it3 = cVarI3.f24284a.iterator();
            while (it3.hasNext()) {
                z.c cVar11 = (z.c) it3.next();
                z.d dVar4 = cVar11.f24287d;
                int i9 = i + 1;
                boolean zA3 = a(dVar4);
                z.c cVar12 = dVar4.M;
                if (dVar4.z() && zA3) {
                    z.e.V(dVar4, fVar, new b());
                }
                if (dVar4.f24346p0[z7 ? 1 : 0] != 3 || zA3) {
                    if (dVar4.z()) {
                        continue;
                    } else if (cVar11 == cVar12) {
                        int iE5 = cVar11.e() + iD3;
                        if (dVar4.f24296E) {
                            int i10 = iE5 - dVar4.f24318a0;
                            int i11 = dVar4.f24312V + i10;
                            dVar4.f24316Z = i10;
                            dVar4.f24301J.l(i10);
                            dVar4.f24303L.l(i11);
                            cVar12.l(iE5);
                            dVar4.f24337l = z7 ? 1 : 0;
                        }
                        i(i9, fVar, dVar4);
                    }
                }
                z7 = true;
            }
        }
        dVar.f24341n = true;
    }
}
