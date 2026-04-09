package a3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final b f62a = new b();

    public static boolean a(z2.g gVar) {
        z2.f fVar;
        z2.f fVar2;
        z2.f[] fVarArr = gVar.T;
        z2.f fVar3 = fVarArr[0];
        z2.f fVar4 = fVarArr[1];
        z2.g gVar2 = gVar.U;
        z2.h hVar = gVar2 != null ? (z2.h) gVar2 : null;
        if (hVar != null) {
            z2.f fVar5 = hVar.T[0];
            z2.f fVar6 = z2.f.FIXED;
        }
        if (hVar != null) {
            z2.f fVar7 = hVar.T[1];
            z2.f fVar8 = z2.f.FIXED;
        }
        z2.f fVar9 = z2.f.FIXED;
        boolean z10 = fVar3 == fVar9 || gVar.A() || fVar3 == z2.f.WRAP_CONTENT || (fVar3 == (fVar2 = z2.f.MATCH_CONSTRAINT) && gVar.f26567r == 0 && gVar.X == 0.0f && gVar.t(0)) || (fVar3 == fVar2 && gVar.f26567r == 1 && gVar.u(0, gVar.q()));
        boolean z11 = fVar4 == fVar9 || gVar.B() || fVar4 == z2.f.WRAP_CONTENT || (fVar4 == (fVar = z2.f.MATCH_CONSTRAINT) && gVar.f26568s == 0 && gVar.X == 0.0f && gVar.t(1)) || (fVar4 == fVar && gVar.f26568s == 1 && gVar.u(1, gVar.k()));
        return (gVar.X > 0.0f && (z10 || z11)) || (z10 && z11);
    }

    public static q b(z2.g gVar, int i10, ArrayList arrayList, q qVar) {
        int i11;
        int i12 = i10 == 0 ? gVar.f26563o0 : gVar.f26565p0;
        if (i12 != -1 && (qVar == null || i12 != qVar.f70b)) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    break;
                }
                q qVar2 = (q) arrayList.get(i13);
                if (qVar2.f70b == i12) {
                    if (qVar != null) {
                        qVar.c(i10, qVar2);
                        arrayList.remove(qVar);
                    }
                    qVar = qVar2;
                } else {
                    i13++;
                }
            }
        } else if (i12 != -1) {
            return qVar;
        }
        if (qVar == null) {
            if (gVar instanceof z2.m) {
                z2.m mVar = (z2.m) gVar;
                int i14 = 0;
                while (true) {
                    if (i14 >= mVar.f26620r0) {
                        i11 = -1;
                        break;
                    }
                    z2.g gVar2 = mVar.f26619q0[i14];
                    if ((i10 == 0 && (i11 = gVar2.f26563o0) != -1) || (i10 == 1 && (i11 = gVar2.f26565p0) != -1)) {
                        break;
                    }
                    i14++;
                }
                if (i11 != -1) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList.size()) {
                            break;
                        }
                        q qVar3 = (q) arrayList.get(i15);
                        if (qVar3.f70b == i11) {
                            qVar = qVar3;
                            break;
                        }
                        i15++;
                    }
                }
            }
            if (qVar == null) {
                qVar = new q();
                qVar.f69a = new ArrayList();
                qVar.f72d = null;
                qVar.f73e = -1;
                int i16 = q.f68f;
                q.f68f = i16 + 1;
                qVar.f70b = i16;
                qVar.f71c = i10;
            }
            arrayList.add(qVar);
        }
        int i17 = qVar.f70b;
        ArrayList arrayList2 = qVar.f69a;
        if (arrayList2.contains(gVar)) {
            return qVar;
        }
        arrayList2.add(gVar);
        if (gVar instanceof z2.l) {
            z2.l lVar = (z2.l) gVar;
            lVar.f26616t0.c(lVar.f26617u0 == 0 ? 1 : 0, qVar, arrayList);
        }
        if (i10 == 0) {
            gVar.f26563o0 = i17;
            gVar.I.c(i10, qVar, arrayList);
            gVar.K.c(i10, qVar, arrayList);
        } else {
            gVar.f26565p0 = i17;
            gVar.J.c(i10, qVar, arrayList);
            gVar.M.c(i10, qVar, arrayList);
            gVar.L.c(i10, qVar, arrayList);
        }
        gVar.P.c(i10, qVar, arrayList);
        return qVar;
    }

    public static void c(int i10, c3.g gVar, z2.g gVar2, boolean z10) {
        z2.d dVar;
        z2.d dVar2;
        char c4;
        z2.d dVar3;
        z2.d dVar4;
        if (gVar2.f26558m) {
            return;
        }
        if (!(gVar2 instanceof z2.h) && gVar2.z() && a(gVar2)) {
            z2.h.V(gVar2, gVar, new b());
        }
        z2.d dVarI = gVar2.i(z2.c.LEFT);
        z2.d dVarI2 = gVar2.i(z2.c.RIGHT);
        int iD = dVarI.d();
        int iD2 = dVarI2.d();
        HashSet hashSet = dVarI.f26526a;
        if (hashSet != null && dVarI.f26528c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                z2.d dVar5 = (z2.d) it.next();
                z2.g gVar3 = dVar5.f26529d;
                int i11 = i10 + 1;
                boolean zA = a(gVar3);
                z2.d dVar6 = gVar3.I;
                z2.d dVar7 = gVar3.K;
                if (gVar3.z() && zA) {
                    c4 = 0;
                    z2.h.V(gVar3, gVar, new b());
                } else {
                    c4 = 0;
                }
                char c10 = ((dVar5 == dVar6 && (dVar4 = dVar7.f26531f) != null && dVar4.f26528c) || (dVar5 == dVar7 && (dVar3 = dVar6.f26531f) != null && dVar3.f26528c)) ? (char) 1 : c4;
                z2.f fVar = gVar3.T[c4];
                z2.f fVar2 = z2.f.MATCH_CONSTRAINT;
                if (fVar != fVar2 || zA) {
                    if (!gVar3.z()) {
                        if (dVar5 == dVar6 && dVar7.f26531f == null) {
                            int iE = dVar6.e() + iD;
                            gVar3.J(iE, gVar3.q() + iE);
                            c(i11, gVar, gVar3, z10);
                        } else if (dVar5 == dVar7 && dVar6.f26531f == null) {
                            int iE2 = iD - dVar7.e();
                            gVar3.J(iE2 - gVar3.q(), iE2);
                            c(i11, gVar, gVar3, z10);
                        } else if (c10 != 0 && !gVar3.x()) {
                            d(i11, gVar, gVar3, z10);
                        }
                    }
                } else if (fVar == fVar2 && gVar3.f26571v >= 0 && gVar3.f26570u >= 0 && (gVar3.f26551h0 == 8 || (gVar3.f26567r == 0 && gVar3.X == 0.0f))) {
                    if (!gVar3.x() && !gVar3.F && c10 != 0 && !gVar3.x()) {
                        e(i11, gVar2, gVar, gVar3, z10);
                    }
                }
            }
        }
        if (gVar2 instanceof z2.l) {
            return;
        }
        HashSet hashSet2 = dVarI2.f26526a;
        if (hashSet2 != null && dVarI2.f26528c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                z2.d dVar8 = (z2.d) it2.next();
                z2.g gVar4 = dVar8.f26529d;
                int i12 = i10 + 1;
                boolean zA2 = a(gVar4);
                z2.d dVar9 = gVar4.I;
                z2.d dVar10 = gVar4.K;
                if (gVar4.z() && zA2) {
                    z2.h.V(gVar4, gVar, new b());
                }
                boolean z11 = (dVar8 == dVar9 && (dVar2 = dVar10.f26531f) != null && dVar2.f26528c) || (dVar8 == dVar10 && (dVar = dVar9.f26531f) != null && dVar.f26528c);
                z2.f fVar3 = gVar4.T[0];
                z2.f fVar4 = z2.f.MATCH_CONSTRAINT;
                if (fVar3 != fVar4 || zA2) {
                    if (!gVar4.z()) {
                        if (dVar8 == dVar9 && dVar10.f26531f == null) {
                            int iE3 = dVar9.e() + iD2;
                            gVar4.J(iE3, gVar4.q() + iE3);
                            c(i12, gVar, gVar4, z10);
                        } else if (dVar8 == dVar10 && dVar9.f26531f == null) {
                            int iE4 = iD2 - dVar10.e();
                            gVar4.J(iE4 - gVar4.q(), iE4);
                            c(i12, gVar, gVar4, z10);
                        } else if (z11 && !gVar4.x()) {
                            d(i12, gVar, gVar4, z10);
                        }
                    }
                } else if (fVar3 == fVar4 && gVar4.f26571v >= 0 && gVar4.f26570u >= 0) {
                    if (gVar4.f26551h0 == 8 || (gVar4.f26567r == 0 && gVar4.X == 0.0f)) {
                        if (!gVar4.x() && !gVar4.F && z11 && !gVar4.x()) {
                            e(i12, gVar2, gVar, gVar4, z10);
                        }
                    }
                }
            }
        }
        gVar2.f26558m = true;
    }

    public static void d(int i10, c3.g gVar, z2.g gVar2, boolean z10) {
        float f10 = gVar2.f26545e0;
        z2.d dVar = gVar2.I;
        int iD = dVar.f26531f.d();
        z2.d dVar2 = gVar2.K;
        int iD2 = dVar2.f26531f.d();
        int iE = dVar.e() + iD;
        int iE2 = iD2 - dVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iQ = gVar2.q();
        int i11 = (iD2 - iD) - iQ;
        if (iD > iD2) {
            i11 = (iD - iD2) - iQ;
        }
        int i12 = ((int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11)) + iD;
        int i13 = i12 + iQ;
        if (iD > iD2) {
            i13 = i12 - iQ;
        }
        gVar2.J(i12, i13);
        c(i10 + 1, gVar, gVar2, z10);
    }

    public static void e(int i10, z2.g gVar, c3.g gVar2, z2.g gVar3, boolean z10) {
        float f10 = gVar3.f26545e0;
        z2.d dVar = gVar3.I;
        int iE = dVar.e() + dVar.f26531f.d();
        z2.d dVar2 = gVar3.K;
        int iD = dVar2.f26531f.d() - dVar2.e();
        if (iD >= iE) {
            int iQ = gVar3.q();
            if (gVar3.f26551h0 != 8) {
                int i11 = gVar3.f26567r;
                if (i11 == 2) {
                    iQ = (int) (gVar3.f26545e0 * 0.5f * (gVar instanceof z2.h ? gVar.q() : gVar.U.q()));
                } else if (i11 == 0) {
                    iQ = iD - iE;
                }
                iQ = Math.max(gVar3.f26570u, iQ);
                int i12 = gVar3.f26571v;
                if (i12 > 0) {
                    iQ = Math.min(i12, iQ);
                }
            }
            int i13 = iE + ((int) ((f10 * ((iD - iE) - iQ)) + 0.5f));
            gVar3.J(i13, iQ + i13);
            c(i10 + 1, gVar2, gVar3, z10);
        }
    }

    public static void f(int i10, c3.g gVar, z2.g gVar2) {
        float f10 = gVar2.f26547f0;
        z2.d dVar = gVar2.J;
        int iD = dVar.f26531f.d();
        z2.d dVar2 = gVar2.L;
        int iD2 = dVar2.f26531f.d();
        int iE = dVar.e() + iD;
        int iE2 = iD2 - dVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = gVar2.k();
        int i11 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i11 = (iD - iD2) - iK;
        }
        int i12 = (int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11);
        int i13 = iD + i12;
        int i14 = i13 + iK;
        if (iD > iD2) {
            i13 = iD - i12;
            i14 = i13 - iK;
        }
        gVar2.K(i13, i14);
        i(i10 + 1, gVar, gVar2);
    }

    public static void g(int i10, z2.g gVar, c3.g gVar2, z2.g gVar3) {
        float f10 = gVar3.f26547f0;
        z2.d dVar = gVar3.J;
        int iE = dVar.e() + dVar.f26531f.d();
        z2.d dVar2 = gVar3.L;
        int iD = dVar2.f26531f.d() - dVar2.e();
        if (iD >= iE) {
            int iK = gVar3.k();
            if (gVar3.f26551h0 != 8) {
                int i11 = gVar3.f26568s;
                if (i11 == 2) {
                    iK = (int) (f10 * 0.5f * (gVar instanceof z2.h ? gVar.k() : gVar.U.k()));
                } else if (i11 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(gVar3.f26573x, iK);
                int i12 = gVar3.f26574y;
                if (i12 > 0) {
                    iK = Math.min(i12, iK);
                }
            }
            int i13 = iE + ((int) ((f10 * ((iD - iE) - iK)) + 0.5f));
            gVar3.K(i13, iK + i13);
            i(i10 + 1, gVar2, gVar3);
        }
    }

    public static boolean h(z2.f fVar, z2.f fVar2, z2.f fVar3, z2.f fVar4) {
        z2.f fVar5;
        z2.f fVar6;
        z2.f fVar7 = z2.f.FIXED;
        return (fVar3 == fVar7 || fVar3 == (fVar6 = z2.f.WRAP_CONTENT) || (fVar3 == z2.f.MATCH_PARENT && fVar != fVar6)) || (fVar4 == fVar7 || fVar4 == (fVar5 = z2.f.WRAP_CONTENT) || (fVar4 == z2.f.MATCH_PARENT && fVar2 != fVar5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(int i10, c3.g gVar, z2.g gVar2) {
        char c4;
        char c10;
        z2.d dVar;
        z2.d dVar2;
        float f10;
        z2.d dVar3;
        z2.d dVar4;
        if (gVar2.f26560n) {
            return;
        }
        if (!(gVar2 instanceof z2.h) && gVar2.z() && a(gVar2)) {
            z2.h.V(gVar2, gVar, new b());
        }
        z2.d dVarI = gVar2.i(z2.c.TOP);
        z2.d dVarI2 = gVar2.i(z2.c.BOTTOM);
        int iD = dVarI.d();
        int iD2 = dVarI2.d();
        HashSet hashSet = dVarI.f26526a;
        char c11 = 1;
        if (hashSet != null && dVarI.f26528c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                z2.d dVar5 = (z2.d) it.next();
                z2.g gVar3 = dVar5.f26529d;
                int i11 = i10 + 1;
                boolean zA = a(gVar3);
                z2.d dVar6 = gVar3.J;
                z2.d dVar7 = gVar3.L;
                if (gVar3.z() && zA) {
                    f10 = 0.0f;
                    z2.h.V(gVar3, gVar, new b());
                } else {
                    f10 = 0.0f;
                }
                char c12 = ((dVar5 == dVar6 && (dVar4 = dVar7.f26531f) != null && dVar4.f26528c) || (dVar5 == dVar7 && (dVar3 = dVar6.f26531f) != null && dVar3.f26528c)) ? c11 : (char) 0;
                z2.f fVar = gVar3.T[c11];
                char c13 = c11;
                z2.f fVar2 = z2.f.MATCH_CONSTRAINT;
                if (fVar != fVar2 || zA) {
                    if (!gVar3.z()) {
                        if (dVar5 == dVar6 && dVar7.f26531f == null) {
                            int iE = dVar6.e() + iD;
                            gVar3.K(iE, gVar3.k() + iE);
                            i(i11, gVar, gVar3);
                        } else if (dVar5 == dVar7 && dVar6.f26531f == null) {
                            int iE2 = iD - dVar7.e();
                            gVar3.K(iE2 - gVar3.k(), iE2);
                            i(i11, gVar, gVar3);
                        } else if (c12 != 0 && !gVar3.y()) {
                            f(i11, gVar, gVar3);
                        }
                    }
                } else if (fVar == fVar2 && gVar3.f26574y >= 0 && gVar3.f26573x >= 0 && ((gVar3.f26551h0 == 8 || (gVar3.f26568s == 0 && gVar3.X == f10)) && !gVar3.y() && !gVar3.F && c12 != 0 && !gVar3.y())) {
                    g(i11, gVar2, gVar, gVar3);
                }
                c11 = c13;
            }
        }
        char c14 = c11;
        if (gVar2 instanceof z2.l) {
            return;
        }
        HashSet hashSet2 = dVarI2.f26526a;
        if (hashSet2 != null && dVarI2.f26528c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                z2.d dVar8 = (z2.d) it2.next();
                z2.g gVar4 = dVar8.f26529d;
                int i12 = i10 + 1;
                boolean zA2 = a(gVar4);
                z2.d dVar9 = gVar4.J;
                z2.d dVar10 = gVar4.L;
                if (gVar4.z() && zA2) {
                    z2.h.V(gVar4, gVar, new b());
                }
                boolean z10 = ((dVar8 == dVar9 && (dVar2 = dVar10.f26531f) != null && dVar2.f26528c) || (dVar8 == dVar10 && (dVar = dVar9.f26531f) != null && dVar.f26528c)) ? c14 == true ? 1 : 0 : false;
                z2.f fVar3 = gVar4.T[c14 == true ? 1 : 0];
                z2.f fVar4 = z2.f.MATCH_CONSTRAINT;
                if (fVar3 != fVar4 || zA2) {
                    if (!gVar4.z()) {
                        if (dVar8 == dVar9 && dVar10.f26531f == null) {
                            int iE3 = dVar9.e() + iD2;
                            gVar4.K(iE3, gVar4.k() + iE3);
                            i(i12, gVar, gVar4);
                        } else if (dVar8 == dVar10 && dVar9.f26531f == null) {
                            int iE4 = iD2 - dVar10.e();
                            gVar4.K(iE4 - gVar4.k(), iE4);
                            i(i12, gVar, gVar4);
                        } else if (z10 && !gVar4.y()) {
                            f(i12, gVar, gVar4);
                        }
                    }
                } else if (fVar3 == fVar4 && gVar4.f26574y >= 0 && gVar4.f26573x >= 0 && (gVar4.f26551h0 == 8 || (gVar4.f26568s == 0 && gVar4.X == 0.0f))) {
                    if (!gVar4.y() && !gVar4.F && z10 && !gVar4.y()) {
                        g(i12, gVar2, gVar, gVar4);
                    }
                }
            }
        }
        z2.d dVarI3 = gVar2.i(z2.c.BASELINE);
        if (dVarI3.f26526a != null && dVarI3.f26528c) {
            int iD3 = dVarI3.d();
            Iterator it3 = dVarI3.f26526a.iterator();
            while (it3.hasNext()) {
                z2.d dVar11 = (z2.d) it3.next();
                z2.g gVar5 = dVar11.f26529d;
                int i13 = i10 + 1;
                boolean zA3 = a(gVar5);
                z2.d dVar12 = gVar5.M;
                if (gVar5.z() && zA3) {
                    z2.h.V(gVar5, gVar, new b());
                }
                if (gVar5.T[c14 == true ? 1 : 0] != z2.f.MATCH_CONSTRAINT || zA3) {
                    if (!gVar5.z()) {
                        if (dVar11 == dVar12) {
                            int iE5 = dVar11.e() + iD3;
                            if (gVar5.E) {
                                int i14 = iE5 - gVar5.f26539b0;
                                int i15 = gVar5.W + i14;
                                gVar5.f26537a0 = i14;
                                gVar5.J.l(i14);
                                gVar5.L.l(i15);
                                dVar12.l(iE5);
                                boolean z11 = c14 == true ? 1 : 0;
                                gVar5.f26556l = z11;
                                c4 = z11;
                            } else {
                                c4 = c14 == true ? 1 : 0;
                            }
                            i(i13, gVar, gVar5);
                            c10 = c4;
                        }
                        c14 = c10;
                    }
                }
                c10 = c14 == true ? 1 : 0;
                c14 = c10;
            }
        }
        gVar2.f26560n = c14;
    }
}
