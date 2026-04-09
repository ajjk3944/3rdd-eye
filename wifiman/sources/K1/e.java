package k1;

import j1.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k1.C6356b;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private j1.f f51035a;

    /* renamed from: d, reason: collision with root package name */
    private j1.f f51038d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f51036b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f51037c = true;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f51039e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f51040f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private C6356b.InterfaceC1888b f51041g = null;

    /* renamed from: h, reason: collision with root package name */
    private C6356b.a f51042h = new C6356b.a();

    /* renamed from: i, reason: collision with root package name */
    ArrayList f51043i = new ArrayList();

    public e(j1.f fVar) {
        this.f51035a = fVar;
        this.f51038d = fVar;
    }

    private void a(f fVar, int i10, int i11, f fVar2, ArrayList arrayList, m mVar) {
        p pVar = fVar.f51047d;
        if (pVar.f51089c == null) {
            j1.f fVar3 = this.f51035a;
            if (pVar == fVar3.f49900e || pVar == fVar3.f49902f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i11);
                arrayList.add(mVar);
            }
            pVar.f51089c = mVar;
            mVar.a(pVar);
            for (InterfaceC6358d interfaceC6358d : pVar.f51094h.f51054k) {
                if (interfaceC6358d instanceof f) {
                    a((f) interfaceC6358d, i10, 0, fVar2, arrayList, mVar);
                }
            }
            for (InterfaceC6358d interfaceC6358d2 : pVar.f51095i.f51054k) {
                if (interfaceC6358d2 instanceof f) {
                    a((f) interfaceC6358d2, i10, 1, fVar2, arrayList, mVar);
                }
            }
            if (i10 == 1 && (pVar instanceof n)) {
                for (InterfaceC6358d interfaceC6358d3 : ((n) pVar).f51070k.f51054k) {
                    if (interfaceC6358d3 instanceof f) {
                        a((f) interfaceC6358d3, i10, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.f51094h.f51055l) {
                if (fVar4 == fVar2) {
                    mVar.f51064b = true;
                }
                a(fVar4, i10, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.f51095i.f51055l) {
                if (fVar5 == fVar2) {
                    mVar.f51064b = true;
                }
                a(fVar5, i10, 1, fVar2, arrayList, mVar);
            }
            if (i10 == 1 && (pVar instanceof n)) {
                Iterator it = ((n) pVar).f51070k.f51055l.iterator();
                while (it.hasNext()) {
                    a((f) it.next(), i10, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }

    private boolean b(j1.f fVar) {
        int iO;
        e.b bVar;
        int iU;
        e.b bVar2;
        e.b bVar3;
        e.b bVar4;
        Iterator it = fVar.f50043K0.iterator();
        while (it.hasNext()) {
            j1.e eVar = (j1.e) it.next();
            e.b[] bVarArr = eVar.f49890Y;
            e.b bVar5 = bVarArr[0];
            e.b bVar6 = bVarArr[1];
            if (eVar.N() == 8) {
                eVar.f49892a = true;
            } else {
                if (eVar.f49859B < 1.0f && bVar5 == e.b.MATCH_CONSTRAINT) {
                    eVar.f49936w = 2;
                }
                if (eVar.f49865E < 1.0f && bVar6 == e.b.MATCH_CONSTRAINT) {
                    eVar.f49938x = 2;
                }
                if (eVar.s() > 0.0f) {
                    e.b bVar7 = e.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == e.b.WRAP_CONTENT || bVar6 == e.b.FIXED)) {
                        eVar.f49936w = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == e.b.WRAP_CONTENT || bVar5 == e.b.FIXED)) {
                        eVar.f49938x = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (eVar.f49936w == 0) {
                            eVar.f49936w = 3;
                        }
                        if (eVar.f49938x == 0) {
                            eVar.f49938x = 3;
                        }
                    }
                }
                e.b bVar8 = e.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && eVar.f49936w == 1 && (eVar.f49879N.f49852f == null || eVar.f49881P.f49852f == null)) {
                    bVar5 = e.b.WRAP_CONTENT;
                }
                e.b bVar9 = bVar5;
                if (bVar6 == bVar8 && eVar.f49938x == 1 && (eVar.f49880O.f49852f == null || eVar.f49882Q.f49852f == null)) {
                    bVar6 = e.b.WRAP_CONTENT;
                }
                e.b bVar10 = bVar6;
                l lVar = eVar.f49900e;
                lVar.f51090d = bVar9;
                int i10 = eVar.f49936w;
                lVar.f51087a = i10;
                n nVar = eVar.f49902f;
                nVar.f51090d = bVar10;
                int i11 = eVar.f49938x;
                nVar.f51087a = i11;
                e.b bVar11 = e.b.MATCH_PARENT;
                if ((bVar9 == bVar11 || bVar9 == e.b.FIXED || bVar9 == e.b.WRAP_CONTENT) && (bVar10 == bVar11 || bVar10 == e.b.FIXED || bVar10 == e.b.WRAP_CONTENT)) {
                    int iO2 = eVar.O();
                    if (bVar9 == bVar11) {
                        iO = (fVar.O() - eVar.f49879N.f49853g) - eVar.f49881P.f49853g;
                        bVar = e.b.FIXED;
                    } else {
                        iO = iO2;
                        bVar = bVar9;
                    }
                    int iU2 = eVar.u();
                    if (bVar10 == bVar11) {
                        iU = (fVar.u() - eVar.f49880O.f49853g) - eVar.f49882Q.f49853g;
                        bVar2 = e.b.FIXED;
                    } else {
                        iU = iU2;
                        bVar2 = bVar10;
                    }
                    k(eVar, bVar, iO, bVar2, iU);
                    eVar.f49900e.f51091e.d(eVar.O());
                    eVar.f49902f.f51091e.d(eVar.u());
                    eVar.f49892a = true;
                } else {
                    if (bVar9 == bVar8 && (bVar10 == (bVar4 = e.b.WRAP_CONTENT) || bVar10 == e.b.FIXED)) {
                        if (i10 == 3) {
                            if (bVar10 == bVar4) {
                                k(eVar, bVar4, 0, bVar4, 0);
                            }
                            int iU3 = eVar.u();
                            int i12 = (int) ((iU3 * eVar.f49897c0) + 0.5f);
                            e.b bVar12 = e.b.FIXED;
                            k(eVar, bVar12, i12, bVar12, iU3);
                            eVar.f49900e.f51091e.d(eVar.O());
                            eVar.f49902f.f51091e.d(eVar.u());
                            eVar.f49892a = true;
                        } else if (i10 == 1) {
                            k(eVar, bVar4, 0, bVar10, 0);
                            eVar.f49900e.f51091e.f51056m = eVar.O();
                        } else if (i10 == 2) {
                            e.b bVar13 = fVar.f49890Y[0];
                            e.b bVar14 = e.b.FIXED;
                            if (bVar13 == bVar14 || bVar13 == bVar11) {
                                k(eVar, bVar14, (int) ((eVar.f49859B * fVar.O()) + 0.5f), bVar10, eVar.u());
                                eVar.f49900e.f51091e.d(eVar.O());
                                eVar.f49902f.f51091e.d(eVar.u());
                                eVar.f49892a = true;
                            }
                        } else {
                            j1.d[] dVarArr = eVar.f49887V;
                            if (dVarArr[0].f49852f == null || dVarArr[1].f49852f == null) {
                                k(eVar, bVar4, 0, bVar10, 0);
                                eVar.f49900e.f51091e.d(eVar.O());
                                eVar.f49902f.f51091e.d(eVar.u());
                                eVar.f49892a = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar3 = e.b.WRAP_CONTENT) || bVar9 == e.b.FIXED)) {
                        if (i11 == 3) {
                            if (bVar9 == bVar3) {
                                k(eVar, bVar3, 0, bVar3, 0);
                            }
                            int iO3 = eVar.O();
                            float f10 = eVar.f49897c0;
                            if (eVar.t() == -1) {
                                f10 = 1.0f / f10;
                            }
                            e.b bVar15 = e.b.FIXED;
                            k(eVar, bVar15, iO3, bVar15, (int) ((iO3 * f10) + 0.5f));
                            eVar.f49900e.f51091e.d(eVar.O());
                            eVar.f49902f.f51091e.d(eVar.u());
                            eVar.f49892a = true;
                        } else if (i11 == 1) {
                            k(eVar, bVar9, 0, bVar3, 0);
                            eVar.f49902f.f51091e.f51056m = eVar.u();
                        } else if (i11 == 2) {
                            e.b bVar16 = fVar.f49890Y[1];
                            e.b bVar17 = e.b.FIXED;
                            if (bVar16 == bVar17 || bVar16 == bVar11) {
                                k(eVar, bVar9, eVar.O(), bVar17, (int) ((eVar.f49865E * fVar.u()) + 0.5f));
                                eVar.f49900e.f51091e.d(eVar.O());
                                eVar.f49902f.f51091e.d(eVar.u());
                                eVar.f49892a = true;
                            }
                        } else {
                            j1.d[] dVarArr2 = eVar.f49887V;
                            if (dVarArr2[2].f49852f == null || dVarArr2[3].f49852f == null) {
                                k(eVar, bVar3, 0, bVar10, 0);
                                eVar.f49900e.f51091e.d(eVar.O());
                                eVar.f49902f.f51091e.d(eVar.u());
                                eVar.f49892a = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i10 == 1 || i11 == 1) {
                            e.b bVar18 = e.b.WRAP_CONTENT;
                            k(eVar, bVar18, 0, bVar18, 0);
                            eVar.f49900e.f51091e.f51056m = eVar.O();
                            eVar.f49902f.f51091e.f51056m = eVar.u();
                        } else if (i11 == 2 && i10 == 2) {
                            e.b[] bVarArr2 = fVar.f49890Y;
                            e.b bVar19 = bVarArr2[0];
                            e.b bVar20 = e.b.FIXED;
                            if (bVar19 == bVar20 && bVarArr2[1] == bVar20) {
                                k(eVar, bVar20, (int) ((eVar.f49859B * fVar.O()) + 0.5f), bVar20, (int) ((eVar.f49865E * fVar.u()) + 0.5f));
                                eVar.f49900e.f51091e.d(eVar.O());
                                eVar.f49902f.f51091e.d(eVar.u());
                                eVar.f49892a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private int e(j1.f fVar, int i10) {
        int size = this.f51043i.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, ((m) this.f51043i.get(i11)).b(fVar, i10));
        }
        return (int) jMax;
    }

    private void i(p pVar, int i10, ArrayList arrayList) {
        for (InterfaceC6358d interfaceC6358d : pVar.f51094h.f51054k) {
            if (interfaceC6358d instanceof f) {
                a((f) interfaceC6358d, i10, 0, pVar.f51095i, arrayList, null);
            } else if (interfaceC6358d instanceof p) {
                a(((p) interfaceC6358d).f51094h, i10, 0, pVar.f51095i, arrayList, null);
            }
        }
        for (InterfaceC6358d interfaceC6358d2 : pVar.f51095i.f51054k) {
            if (interfaceC6358d2 instanceof f) {
                a((f) interfaceC6358d2, i10, 1, pVar.f51094h, arrayList, null);
            } else if (interfaceC6358d2 instanceof p) {
                a(((p) interfaceC6358d2).f51095i, i10, 1, pVar.f51094h, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (InterfaceC6358d interfaceC6358d3 : ((n) pVar).f51070k.f51054k) {
                if (interfaceC6358d3 instanceof f) {
                    a((f) interfaceC6358d3, i10, 2, null, arrayList, null);
                }
            }
        }
    }

    private void k(j1.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        C6356b.a aVar = this.f51042h;
        aVar.f51023a = bVar;
        aVar.f51024b = bVar2;
        aVar.f51025c = i10;
        aVar.f51026d = i11;
        this.f51041g.b(eVar, aVar);
        eVar.U0(this.f51042h.f51027e);
        eVar.z0(this.f51042h.f51028f);
        eVar.y0(this.f51042h.f51030h);
        eVar.o0(this.f51042h.f51029g);
    }

    public void c() {
        d(this.f51039e);
        this.f51043i.clear();
        m.f51062h = 0;
        i(this.f51035a.f49900e, 0, this.f51043i);
        i(this.f51035a.f49902f, 1, this.f51043i);
        this.f51036b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.f51038d.f49900e.f();
        this.f51038d.f49902f.f();
        arrayList.add(this.f51038d.f49900e);
        arrayList.add(this.f51038d.f49902f);
        Iterator it = this.f51038d.f50043K0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            j1.e eVar = (j1.e) it.next();
            if (eVar instanceof j1.h) {
                arrayList.add(new j(eVar));
            } else {
                if (eVar.a0()) {
                    if (eVar.f49896c == null) {
                        eVar.f49896c = new C6357c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f49896c);
                } else {
                    arrayList.add(eVar.f49900e);
                }
                if (eVar.b0()) {
                    if (eVar.f49898d == null) {
                        eVar.f49898d = new C6357c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f49898d);
                } else {
                    arrayList.add(eVar.f49902f);
                }
                if (eVar instanceof j1.j) {
                    arrayList.add(new k(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((p) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p pVar = (p) it3.next();
            if (pVar.f51088b != this.f51038d) {
                pVar.d();
            }
        }
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f51036b || this.f51037c) {
            Iterator it = this.f51035a.f50043K0.iterator();
            while (it.hasNext()) {
                j1.e eVar = (j1.e) it.next();
                eVar.k();
                eVar.f49892a = false;
                eVar.f49900e.r();
                eVar.f49902f.q();
            }
            this.f51035a.k();
            j1.f fVar = this.f51035a;
            fVar.f49892a = false;
            fVar.f49900e.r();
            this.f51035a.f49902f.q();
            this.f51037c = false;
        }
        if (b(this.f51038d)) {
            return false;
        }
        this.f51035a.V0(0);
        this.f51035a.W0(0);
        e.b bVarR = this.f51035a.r(0);
        e.b bVarR2 = this.f51035a.r(1);
        if (this.f51036b) {
            c();
        }
        int iP = this.f51035a.P();
        int iQ = this.f51035a.Q();
        this.f51035a.f49900e.f51094h.d(iP);
        this.f51035a.f49902f.f51094h.d(iQ);
        l();
        e.b bVar = e.b.WRAP_CONTENT;
        if (bVarR == bVar || bVarR2 == bVar) {
            if (z10) {
                Iterator it2 = this.f51039e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((p) it2.next()).m()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && bVarR == e.b.WRAP_CONTENT) {
                this.f51035a.D0(e.b.FIXED);
                j1.f fVar2 = this.f51035a;
                fVar2.U0(e(fVar2, 0));
                j1.f fVar3 = this.f51035a;
                fVar3.f49900e.f51091e.d(fVar3.O());
            }
            if (z10 && bVarR2 == e.b.WRAP_CONTENT) {
                this.f51035a.Q0(e.b.FIXED);
                j1.f fVar4 = this.f51035a;
                fVar4.z0(e(fVar4, 1));
                j1.f fVar5 = this.f51035a;
                fVar5.f49902f.f51091e.d(fVar5.u());
            }
        }
        j1.f fVar6 = this.f51035a;
        e.b bVar2 = fVar6.f49890Y[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int iO = fVar6.O() + iP;
            this.f51035a.f49900e.f51095i.d(iO);
            this.f51035a.f49900e.f51091e.d(iO - iP);
            l();
            j1.f fVar7 = this.f51035a;
            e.b bVar4 = fVar7.f49890Y[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int iU = fVar7.u() + iQ;
                this.f51035a.f49902f.f51095i.d(iU);
                this.f51035a.f49902f.f51091e.d(iU - iQ);
            }
            l();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator it3 = this.f51039e.iterator();
        while (it3.hasNext()) {
            p pVar = (p) it3.next();
            if (pVar.f51088b != this.f51035a || pVar.f51093g) {
                pVar.e();
            }
        }
        Iterator it4 = this.f51039e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z12 = true;
                break;
            }
            p pVar2 = (p) it4.next();
            if (z11 || pVar2.f51088b != this.f51035a) {
                if (!pVar2.f51094h.f51053j || ((!pVar2.f51095i.f51053j && !(pVar2 instanceof j)) || (!pVar2.f51091e.f51053j && !(pVar2 instanceof C6357c) && !(pVar2 instanceof j)))) {
                    break;
                }
            }
        }
        this.f51035a.D0(bVarR);
        this.f51035a.Q0(bVarR2);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f51036b) {
            Iterator it = this.f51035a.f50043K0.iterator();
            while (it.hasNext()) {
                j1.e eVar = (j1.e) it.next();
                eVar.k();
                eVar.f49892a = false;
                l lVar = eVar.f49900e;
                lVar.f51091e.f51053j = false;
                lVar.f51093g = false;
                lVar.r();
                n nVar = eVar.f49902f;
                nVar.f51091e.f51053j = false;
                nVar.f51093g = false;
                nVar.q();
            }
            this.f51035a.k();
            j1.f fVar = this.f51035a;
            fVar.f49892a = false;
            l lVar2 = fVar.f49900e;
            lVar2.f51091e.f51053j = false;
            lVar2.f51093g = false;
            lVar2.r();
            n nVar2 = this.f51035a.f49902f;
            nVar2.f51091e.f51053j = false;
            nVar2.f51093g = false;
            nVar2.q();
            c();
        }
        if (b(this.f51038d)) {
            return false;
        }
        this.f51035a.V0(0);
        this.f51035a.W0(0);
        this.f51035a.f49900e.f51094h.d(0);
        this.f51035a.f49902f.f51094h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        e.b bVar;
        boolean z12 = false;
        e.b bVarR = this.f51035a.r(0);
        e.b bVarR2 = this.f51035a.r(1);
        int iP = this.f51035a.P();
        int iQ = this.f51035a.Q();
        if (z10 && (bVarR == (bVar = e.b.WRAP_CONTENT) || bVarR2 == bVar)) {
            Iterator it = this.f51039e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) it.next();
                if (pVar.f51092f == i10 && !pVar.m()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && bVarR == e.b.WRAP_CONTENT) {
                    this.f51035a.D0(e.b.FIXED);
                    j1.f fVar = this.f51035a;
                    fVar.U0(e(fVar, 0));
                    j1.f fVar2 = this.f51035a;
                    fVar2.f49900e.f51091e.d(fVar2.O());
                }
            } else if (z10 && bVarR2 == e.b.WRAP_CONTENT) {
                this.f51035a.Q0(e.b.FIXED);
                j1.f fVar3 = this.f51035a;
                fVar3.z0(e(fVar3, 1));
                j1.f fVar4 = this.f51035a;
                fVar4.f49902f.f51091e.d(fVar4.u());
            }
        }
        if (i10 == 0) {
            j1.f fVar5 = this.f51035a;
            e.b bVar2 = fVar5.f49890Y[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int iO = fVar5.O() + iP;
                this.f51035a.f49900e.f51095i.d(iO);
                this.f51035a.f49900e.f51091e.d(iO - iP);
                z11 = true;
            }
            z11 = false;
        } else {
            j1.f fVar6 = this.f51035a;
            e.b bVar3 = fVar6.f49890Y[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int iU = fVar6.u() + iQ;
                this.f51035a.f49902f.f51095i.d(iU);
                this.f51035a.f49902f.f51091e.d(iU - iQ);
                z11 = true;
            }
            z11 = false;
        }
        l();
        Iterator it2 = this.f51039e.iterator();
        while (it2.hasNext()) {
            p pVar2 = (p) it2.next();
            if (pVar2.f51092f == i10 && (pVar2.f51088b != this.f51035a || pVar2.f51093g)) {
                pVar2.e();
            }
        }
        Iterator it3 = this.f51039e.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z12 = true;
                break;
            }
            p pVar3 = (p) it3.next();
            if (pVar3.f51092f == i10 && (z11 || pVar3.f51088b != this.f51035a)) {
                if (!pVar3.f51094h.f51053j || !pVar3.f51095i.f51053j || (!(pVar3 instanceof C6357c) && !pVar3.f51091e.f51053j)) {
                    break;
                }
            }
        }
        this.f51035a.D0(bVarR);
        this.f51035a.Q0(bVarR2);
        return z12;
    }

    public void j() {
        this.f51036b = true;
    }

    public void l() {
        g gVar;
        Iterator it = this.f51035a.f50043K0.iterator();
        while (it.hasNext()) {
            j1.e eVar = (j1.e) it.next();
            if (!eVar.f49892a) {
                e.b[] bVarArr = eVar.f49890Y;
                boolean z10 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i10 = eVar.f49936w;
                int i11 = eVar.f49938x;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                g gVar2 = eVar.f49900e.f51091e;
                boolean z12 = gVar2.f51053j;
                g gVar3 = eVar.f49902f.f51091e;
                boolean z13 = gVar3.f51053j;
                if (z12 && z13) {
                    e.b bVar4 = e.b.FIXED;
                    k(eVar, bVar4, gVar2.f51050g, bVar4, gVar3.f51050g);
                    eVar.f49892a = true;
                } else if (z12 && z10) {
                    k(eVar, e.b.FIXED, gVar2.f51050g, bVar3, gVar3.f51050g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        eVar.f49902f.f51091e.f51056m = eVar.u();
                    } else {
                        eVar.f49902f.f51091e.d(eVar.u());
                        eVar.f49892a = true;
                    }
                } else if (z13 && z11) {
                    k(eVar, bVar3, gVar2.f51050g, e.b.FIXED, gVar3.f51050g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        eVar.f49900e.f51091e.f51056m = eVar.O();
                    } else {
                        eVar.f49900e.f51091e.d(eVar.O());
                        eVar.f49892a = true;
                    }
                }
                if (eVar.f49892a && (gVar = eVar.f49902f.f51071l) != null) {
                    gVar.d(eVar.m());
                }
            }
        }
    }

    public void m(C6356b.InterfaceC1888b interfaceC1888b) {
        this.f51041g = interfaceC1888b;
    }
}
