package p1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o1.AbstractC7054j;
import o1.C7048d;
import o1.C7049e;
import o1.C7050f;
import o1.C7052h;
import p1.C7206b;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private C7050f f57463a;

    /* renamed from: d, reason: collision with root package name */
    private C7050f f57466d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f57464b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f57465c = true;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f57467e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f57468f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private C7206b.InterfaceC2026b f57469g = null;

    /* renamed from: h, reason: collision with root package name */
    private C7206b.a f57470h = new C7206b.a();

    /* renamed from: i, reason: collision with root package name */
    ArrayList f57471i = new ArrayList();

    public e(C7050f c7050f) {
        this.f57463a = c7050f;
        this.f57466d = c7050f;
    }

    private void a(f fVar, int i10, int i11, f fVar2, ArrayList arrayList, k kVar) {
        m mVar = fVar.f57475d;
        if (mVar.f57500c == null) {
            C7050f c7050f = this.f57463a;
            if (mVar == c7050f.f55115e || mVar == c7050f.f55117f) {
                return;
            }
            if (kVar == null) {
                kVar = new k(mVar, i11);
                arrayList.add(kVar);
            }
            mVar.f57500c = kVar;
            kVar.a(mVar);
            for (d dVar : mVar.f57505h.f57482k) {
                if (dVar instanceof f) {
                    a((f) dVar, i10, 0, fVar2, arrayList, kVar);
                }
            }
            for (d dVar2 : mVar.f57506i.f57482k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i10, 1, fVar2, arrayList, kVar);
                }
            }
            if (i10 == 1 && (mVar instanceof l)) {
                for (d dVar3 : ((l) mVar).f57495k.f57482k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i10, 2, fVar2, arrayList, kVar);
                    }
                }
            }
            for (f fVar3 : mVar.f57505h.f57483l) {
                if (fVar3 == fVar2) {
                    kVar.f57489b = true;
                }
                a(fVar3, i10, 0, fVar2, arrayList, kVar);
            }
            for (f fVar4 : mVar.f57506i.f57483l) {
                if (fVar4 == fVar2) {
                    kVar.f57489b = true;
                }
                a(fVar4, i10, 1, fVar2, arrayList, kVar);
            }
            if (i10 == 1 && (mVar instanceof l)) {
                Iterator it = ((l) mVar).f57495k.f57483l.iterator();
                while (it.hasNext()) {
                    a((f) it.next(), i10, 2, fVar2, arrayList, kVar);
                }
            }
        }
    }

    private boolean b(C7050f c7050f) {
        int iP;
        C7049e.b bVar;
        int iV;
        C7049e.b bVar2;
        C7049e.b[] bVarArr;
        C7049e.b bVar3;
        C7049e.b bVar4;
        C7049e.b bVar5;
        C7049e.b bVar6;
        Iterator it = c7050f.f55245w0.iterator();
        while (it.hasNext()) {
            C7049e c7049e = (C7049e) it.next();
            C7049e.b[] bVarArr2 = c7049e.f55093M;
            C7049e.b bVar7 = bVarArr2[0];
            C7049e.b bVar8 = bVarArr2[1];
            if (c7049e.O() == 8) {
                c7049e.f55107a = true;
            } else {
                if (c7049e.f55139q < 1.0f && bVar7 == C7049e.b.MATCH_CONSTRAINT) {
                    c7049e.f55129l = 2;
                }
                if (c7049e.f55145t < 1.0f && bVar8 == C7049e.b.MATCH_CONSTRAINT) {
                    c7049e.f55131m = 2;
                }
                if (c7049e.t() > 0.0f) {
                    C7049e.b bVar9 = C7049e.b.MATCH_CONSTRAINT;
                    if (bVar7 == bVar9 && (bVar8 == C7049e.b.WRAP_CONTENT || bVar8 == C7049e.b.FIXED)) {
                        c7049e.f55129l = 3;
                    } else if (bVar8 == bVar9 && (bVar7 == C7049e.b.WRAP_CONTENT || bVar7 == C7049e.b.FIXED)) {
                        c7049e.f55131m = 3;
                    } else if (bVar7 == bVar9 && bVar8 == bVar9) {
                        if (c7049e.f55129l == 0) {
                            c7049e.f55129l = 3;
                        }
                        if (c7049e.f55131m == 0) {
                            c7049e.f55131m = 3;
                        }
                    }
                }
                C7049e.b bVar10 = C7049e.b.MATCH_CONSTRAINT;
                if (bVar7 == bVar10 && c7049e.f55129l == 1 && (c7049e.f55082B.f55075d == null || c7049e.f55084D.f55075d == null)) {
                    bVar7 = C7049e.b.WRAP_CONTENT;
                }
                C7049e.b bVar11 = bVar7;
                if (bVar8 == bVar10 && c7049e.f55131m == 1 && (c7049e.f55083C.f55075d == null || c7049e.f55085E.f55075d == null)) {
                    bVar8 = C7049e.b.WRAP_CONTENT;
                }
                C7049e.b bVar12 = bVar8;
                j jVar = c7049e.f55115e;
                jVar.f57501d = bVar11;
                int i10 = c7049e.f55129l;
                jVar.f57498a = i10;
                l lVar = c7049e.f55117f;
                lVar.f57501d = bVar12;
                int i11 = c7049e.f55131m;
                lVar.f57498a = i11;
                C7049e.b bVar13 = C7049e.b.MATCH_PARENT;
                if ((bVar11 == bVar13 || bVar11 == C7049e.b.FIXED || bVar11 == C7049e.b.WRAP_CONTENT) && (bVar12 == bVar13 || bVar12 == C7049e.b.FIXED || bVar12 == C7049e.b.WRAP_CONTENT)) {
                    int iP2 = c7049e.P();
                    if (bVar11 == bVar13) {
                        iP = (c7050f.P() - c7049e.f55082B.f55076e) - c7049e.f55084D.f55076e;
                        bVar = C7049e.b.FIXED;
                    } else {
                        iP = iP2;
                        bVar = bVar11;
                    }
                    int iV2 = c7049e.v();
                    if (bVar12 == bVar13) {
                        iV = (c7050f.v() - c7049e.f55083C.f55076e) - c7049e.f55085E.f55076e;
                        bVar2 = C7049e.b.FIXED;
                    } else {
                        iV = iV2;
                        bVar2 = bVar12;
                    }
                    l(c7049e, bVar, iP, bVar2, iV);
                    c7049e.f55115e.f57502e.d(c7049e.P());
                    c7049e.f55117f.f57502e.d(c7049e.v());
                    c7049e.f55107a = true;
                } else {
                    if (bVar11 == bVar10 && (bVar12 == (bVar6 = C7049e.b.WRAP_CONTENT) || bVar12 == C7049e.b.FIXED)) {
                        if (i10 == 3) {
                            if (bVar12 == bVar6) {
                                l(c7049e, bVar6, 0, bVar6, 0);
                            }
                            int iV3 = c7049e.v();
                            int i12 = (int) ((iV3 * c7049e.f55097Q) + 0.5f);
                            C7049e.b bVar14 = C7049e.b.FIXED;
                            l(c7049e, bVar14, i12, bVar14, iV3);
                            c7049e.f55115e.f57502e.d(c7049e.P());
                            c7049e.f55117f.f57502e.d(c7049e.v());
                            c7049e.f55107a = true;
                        } else if (i10 == 1) {
                            l(c7049e, bVar6, 0, bVar12, 0);
                            c7049e.f55115e.f57502e.f57484m = c7049e.P();
                        } else if (i10 == 2) {
                            C7049e.b bVar15 = c7050f.f55093M[0];
                            C7049e.b bVar16 = C7049e.b.FIXED;
                            if (bVar15 == bVar16 || bVar15 == bVar13) {
                                l(c7049e, bVar16, (int) ((c7049e.f55139q * c7050f.P()) + 0.5f), bVar12, c7049e.v());
                                c7049e.f55115e.f57502e.d(c7049e.P());
                                c7049e.f55117f.f57502e.d(c7049e.v());
                                c7049e.f55107a = true;
                            }
                        } else {
                            C7048d[] c7048dArr = c7049e.f55090J;
                            if (c7048dArr[0].f55075d == null || c7048dArr[1].f55075d == null) {
                                l(c7049e, bVar6, 0, bVar12, 0);
                                c7049e.f55115e.f57502e.d(c7049e.P());
                                c7049e.f55117f.f57502e.d(c7049e.v());
                                c7049e.f55107a = true;
                            }
                        }
                    }
                    if (bVar12 == bVar10 && (bVar11 == (bVar5 = C7049e.b.WRAP_CONTENT) || bVar11 == C7049e.b.FIXED)) {
                        if (i11 == 3) {
                            if (bVar11 == bVar5) {
                                l(c7049e, bVar5, 0, bVar5, 0);
                            }
                            int iP3 = c7049e.P();
                            float f10 = c7049e.f55097Q;
                            if (c7049e.u() == -1) {
                                f10 = 1.0f / f10;
                            }
                            C7049e.b bVar17 = C7049e.b.FIXED;
                            l(c7049e, bVar17, iP3, bVar17, (int) ((iP3 * f10) + 0.5f));
                            c7049e.f55115e.f57502e.d(c7049e.P());
                            c7049e.f55117f.f57502e.d(c7049e.v());
                            c7049e.f55107a = true;
                        } else if (i11 == 1) {
                            l(c7049e, bVar11, 0, bVar5, 0);
                            c7049e.f55117f.f57502e.f57484m = c7049e.v();
                        } else if (i11 == 2) {
                            C7049e.b bVar18 = c7050f.f55093M[1];
                            C7049e.b bVar19 = C7049e.b.FIXED;
                            if (bVar18 == bVar19 || bVar18 == bVar13) {
                                l(c7049e, bVar11, c7049e.P(), bVar19, (int) ((c7049e.f55145t * c7050f.v()) + 0.5f));
                                c7049e.f55115e.f57502e.d(c7049e.P());
                                c7049e.f55117f.f57502e.d(c7049e.v());
                                c7049e.f55107a = true;
                            }
                        } else {
                            C7048d[] c7048dArr2 = c7049e.f55090J;
                            if (c7048dArr2[2].f55075d == null || c7048dArr2[3].f55075d == null) {
                                l(c7049e, bVar5, 0, bVar12, 0);
                                c7049e.f55115e.f57502e.d(c7049e.P());
                                c7049e.f55117f.f57502e.d(c7049e.v());
                                c7049e.f55107a = true;
                            }
                        }
                    }
                    if (bVar11 == bVar10 && bVar12 == bVar10) {
                        if (i10 == 1 || i11 == 1) {
                            C7049e.b bVar20 = C7049e.b.WRAP_CONTENT;
                            l(c7049e, bVar20, 0, bVar20, 0);
                            c7049e.f55115e.f57502e.f57484m = c7049e.P();
                            c7049e.f55117f.f57502e.f57484m = c7049e.v();
                        } else if (i11 == 2 && i10 == 2 && ((bVar3 = (bVarArr = c7050f.f55093M)[0]) == (bVar4 = C7049e.b.FIXED) || bVar3 == bVar4)) {
                            C7049e.b bVar21 = bVarArr[1];
                            if (bVar21 == bVar4 || bVar21 == bVar4) {
                                l(c7049e, bVar4, (int) ((c7049e.f55139q * c7050f.P()) + 0.5f), bVar4, (int) ((c7049e.f55145t * c7050f.v()) + 0.5f));
                                c7049e.f55115e.f57502e.d(c7049e.P());
                                c7049e.f55117f.f57502e.d(c7049e.v());
                                c7049e.f55107a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private int e(C7050f c7050f, int i10) {
        int size = this.f57471i.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, ((k) this.f57471i.get(i11)).b(c7050f, i10));
        }
        return (int) jMax;
    }

    private void i(m mVar, int i10, ArrayList arrayList) {
        for (d dVar : mVar.f57505h.f57482k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, mVar.f57506i, arrayList, null);
            } else if (dVar instanceof m) {
                a(((m) dVar).f57505h, i10, 0, mVar.f57506i, arrayList, null);
            }
        }
        for (d dVar2 : mVar.f57506i.f57482k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, mVar.f57505h, arrayList, null);
            } else if (dVar2 instanceof m) {
                a(((m) dVar2).f57506i, i10, 1, mVar.f57505h, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (d dVar3 : ((l) mVar).f57495k.f57482k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i10, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(C7049e c7049e, C7049e.b bVar, int i10, C7049e.b bVar2, int i11) {
        C7206b.a aVar = this.f57470h;
        aVar.f57451a = bVar;
        aVar.f57452b = bVar2;
        aVar.f57453c = i10;
        aVar.f57454d = i11;
        this.f57469g.b(c7049e, aVar);
        c7049e.E0(this.f57470h.f57455e);
        c7049e.h0(this.f57470h.f57456f);
        c7049e.g0(this.f57470h.f57458h);
        c7049e.b0(this.f57470h.f57457g);
    }

    public void c() {
        d(this.f57467e);
        this.f57471i.clear();
        k.f57487h = 0;
        i(this.f57463a.f55115e, 0, this.f57471i);
        i(this.f57463a.f55117f, 1, this.f57471i);
        this.f57464b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.f57466d.f55115e.f();
        this.f57466d.f55117f.f();
        arrayList.add(this.f57466d.f55115e);
        arrayList.add(this.f57466d.f55117f);
        Iterator it = this.f57466d.f55245w0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C7049e c7049e = (C7049e) it.next();
            if (c7049e instanceof C7052h) {
                arrayList.add(new h(c7049e));
            } else {
                if (c7049e.V()) {
                    if (c7049e.f55111c == null) {
                        c7049e.f55111c = new c(c7049e, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c7049e.f55111c);
                } else {
                    arrayList.add(c7049e.f55115e);
                }
                if (c7049e.X()) {
                    if (c7049e.f55113d == null) {
                        c7049e.f55113d = new c(c7049e, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c7049e.f55113d);
                } else {
                    arrayList.add(c7049e.f55117f);
                }
                if (c7049e instanceof AbstractC7054j) {
                    arrayList.add(new i(c7049e));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((m) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m mVar = (m) it3.next();
            if (mVar.f57499b != this.f57466d) {
                mVar.d();
            }
        }
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f57464b || this.f57465c) {
            Iterator it = this.f57463a.f55245w0.iterator();
            while (it.hasNext()) {
                C7049e c7049e = (C7049e) it.next();
                c7049e.f55107a = false;
                c7049e.f55115e.r();
                c7049e.f55117f.q();
            }
            C7050f c7050f = this.f57463a;
            c7050f.f55107a = false;
            c7050f.f55115e.r();
            this.f57463a.f55117f.q();
            this.f57465c = false;
        }
        if (b(this.f57466d)) {
            return false;
        }
        this.f57463a.F0(0);
        this.f57463a.G0(0);
        C7049e.b bVarS = this.f57463a.s(0);
        C7049e.b bVarS2 = this.f57463a.s(1);
        if (this.f57464b) {
            c();
        }
        int iQ = this.f57463a.Q();
        int iR = this.f57463a.R();
        this.f57463a.f55115e.f57505h.d(iQ);
        this.f57463a.f55117f.f57505h.d(iR);
        m();
        C7049e.b bVar = C7049e.b.WRAP_CONTENT;
        if (bVarS == bVar || bVarS2 == bVar) {
            if (z10) {
                Iterator it2 = this.f57467e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((m) it2.next()).m()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && bVarS == C7049e.b.WRAP_CONTENT) {
                this.f57463a.l0(C7049e.b.FIXED);
                C7050f c7050f2 = this.f57463a;
                c7050f2.E0(e(c7050f2, 0));
                C7050f c7050f3 = this.f57463a;
                c7050f3.f55115e.f57502e.d(c7050f3.P());
            }
            if (z10 && bVarS2 == C7049e.b.WRAP_CONTENT) {
                this.f57463a.A0(C7049e.b.FIXED);
                C7050f c7050f4 = this.f57463a;
                c7050f4.h0(e(c7050f4, 1));
                C7050f c7050f5 = this.f57463a;
                c7050f5.f55117f.f57502e.d(c7050f5.v());
            }
        }
        C7050f c7050f6 = this.f57463a;
        C7049e.b bVar2 = c7050f6.f55093M[0];
        C7049e.b bVar3 = C7049e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == C7049e.b.MATCH_PARENT) {
            int iP = c7050f6.P() + iQ;
            this.f57463a.f55115e.f57506i.d(iP);
            this.f57463a.f55115e.f57502e.d(iP - iQ);
            m();
            C7050f c7050f7 = this.f57463a;
            C7049e.b bVar4 = c7050f7.f55093M[1];
            if (bVar4 == bVar3 || bVar4 == C7049e.b.MATCH_PARENT) {
                int iV = c7050f7.v() + iR;
                this.f57463a.f55117f.f57506i.d(iV);
                this.f57463a.f55117f.f57502e.d(iV - iR);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator it3 = this.f57467e.iterator();
        while (it3.hasNext()) {
            m mVar = (m) it3.next();
            if (mVar.f57499b != this.f57463a || mVar.f57504g) {
                mVar.e();
            }
        }
        Iterator it4 = this.f57467e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z12 = true;
                break;
            }
            m mVar2 = (m) it4.next();
            if (z11 || mVar2.f57499b != this.f57463a) {
                if (!mVar2.f57505h.f57481j || ((!mVar2.f57506i.f57481j && !(mVar2 instanceof h)) || (!mVar2.f57502e.f57481j && !(mVar2 instanceof c) && !(mVar2 instanceof h)))) {
                    break;
                }
            }
        }
        this.f57463a.l0(bVarS);
        this.f57463a.A0(bVarS2);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f57464b) {
            Iterator it = this.f57463a.f55245w0.iterator();
            while (it.hasNext()) {
                C7049e c7049e = (C7049e) it.next();
                c7049e.f55107a = false;
                j jVar = c7049e.f55115e;
                jVar.f57502e.f57481j = false;
                jVar.f57504g = false;
                jVar.r();
                l lVar = c7049e.f55117f;
                lVar.f57502e.f57481j = false;
                lVar.f57504g = false;
                lVar.q();
            }
            C7050f c7050f = this.f57463a;
            c7050f.f55107a = false;
            j jVar2 = c7050f.f55115e;
            jVar2.f57502e.f57481j = false;
            jVar2.f57504g = false;
            jVar2.r();
            l lVar2 = this.f57463a.f55117f;
            lVar2.f57502e.f57481j = false;
            lVar2.f57504g = false;
            lVar2.q();
            c();
        }
        if (b(this.f57466d)) {
            return false;
        }
        this.f57463a.F0(0);
        this.f57463a.G0(0);
        this.f57463a.f55115e.f57505h.d(0);
        this.f57463a.f55117f.f57505h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        C7049e.b bVar;
        boolean z12 = false;
        C7049e.b bVarS = this.f57463a.s(0);
        C7049e.b bVarS2 = this.f57463a.s(1);
        int iQ = this.f57463a.Q();
        int iR = this.f57463a.R();
        if (z10 && (bVarS == (bVar = C7049e.b.WRAP_CONTENT) || bVarS2 == bVar)) {
            Iterator it = this.f57467e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m mVar = (m) it.next();
                if (mVar.f57503f == i10 && !mVar.m()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && bVarS == C7049e.b.WRAP_CONTENT) {
                    this.f57463a.l0(C7049e.b.FIXED);
                    C7050f c7050f = this.f57463a;
                    c7050f.E0(e(c7050f, 0));
                    C7050f c7050f2 = this.f57463a;
                    c7050f2.f55115e.f57502e.d(c7050f2.P());
                }
            } else if (z10 && bVarS2 == C7049e.b.WRAP_CONTENT) {
                this.f57463a.A0(C7049e.b.FIXED);
                C7050f c7050f3 = this.f57463a;
                c7050f3.h0(e(c7050f3, 1));
                C7050f c7050f4 = this.f57463a;
                c7050f4.f55117f.f57502e.d(c7050f4.v());
            }
        }
        if (i10 == 0) {
            C7050f c7050f5 = this.f57463a;
            C7049e.b bVar2 = c7050f5.f55093M[0];
            if (bVar2 == C7049e.b.FIXED || bVar2 == C7049e.b.MATCH_PARENT) {
                int iP = c7050f5.P() + iQ;
                this.f57463a.f55115e.f57506i.d(iP);
                this.f57463a.f55115e.f57502e.d(iP - iQ);
                z11 = true;
            }
            z11 = false;
        } else {
            C7050f c7050f6 = this.f57463a;
            C7049e.b bVar3 = c7050f6.f55093M[1];
            if (bVar3 == C7049e.b.FIXED || bVar3 == C7049e.b.MATCH_PARENT) {
                int iV = c7050f6.v() + iR;
                this.f57463a.f55117f.f57506i.d(iV);
                this.f57463a.f55117f.f57502e.d(iV - iR);
                z11 = true;
            }
            z11 = false;
        }
        m();
        Iterator it2 = this.f57467e.iterator();
        while (it2.hasNext()) {
            m mVar2 = (m) it2.next();
            if (mVar2.f57503f == i10 && (mVar2.f57499b != this.f57463a || mVar2.f57504g)) {
                mVar2.e();
            }
        }
        Iterator it3 = this.f57467e.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z12 = true;
                break;
            }
            m mVar3 = (m) it3.next();
            if (mVar3.f57503f == i10 && (z11 || mVar3.f57499b != this.f57463a)) {
                if (!mVar3.f57505h.f57481j || !mVar3.f57506i.f57481j || (!(mVar3 instanceof c) && !mVar3.f57502e.f57481j)) {
                    break;
                }
            }
        }
        this.f57463a.l0(bVarS);
        this.f57463a.A0(bVarS2);
        return z12;
    }

    public void j() {
        this.f57464b = true;
    }

    public void k() {
        this.f57465c = true;
    }

    public void m() {
        g gVar;
        Iterator it = this.f57463a.f55245w0.iterator();
        while (it.hasNext()) {
            C7049e c7049e = (C7049e) it.next();
            if (!c7049e.f55107a) {
                C7049e.b[] bVarArr = c7049e.f55093M;
                boolean z10 = false;
                C7049e.b bVar = bVarArr[0];
                C7049e.b bVar2 = bVarArr[1];
                int i10 = c7049e.f55129l;
                int i11 = c7049e.f55131m;
                C7049e.b bVar3 = C7049e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == C7049e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == C7049e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                g gVar2 = c7049e.f55115e.f57502e;
                boolean z12 = gVar2.f57481j;
                g gVar3 = c7049e.f55117f.f57502e;
                boolean z13 = gVar3.f57481j;
                if (z12 && z13) {
                    C7049e.b bVar4 = C7049e.b.FIXED;
                    l(c7049e, bVar4, gVar2.f57478g, bVar4, gVar3.f57478g);
                    c7049e.f55107a = true;
                } else if (z12 && z10) {
                    l(c7049e, C7049e.b.FIXED, gVar2.f57478g, bVar3, gVar3.f57478g);
                    if (bVar2 == C7049e.b.MATCH_CONSTRAINT) {
                        c7049e.f55117f.f57502e.f57484m = c7049e.v();
                    } else {
                        c7049e.f55117f.f57502e.d(c7049e.v());
                        c7049e.f55107a = true;
                    }
                } else if (z13 && z11) {
                    l(c7049e, bVar3, gVar2.f57478g, C7049e.b.FIXED, gVar3.f57478g);
                    if (bVar == C7049e.b.MATCH_CONSTRAINT) {
                        c7049e.f55115e.f57502e.f57484m = c7049e.P();
                    } else {
                        c7049e.f55115e.f57502e.d(c7049e.P());
                        c7049e.f55107a = true;
                    }
                }
                if (c7049e.f55107a && (gVar = c7049e.f55117f.f57496l) != null) {
                    gVar.d(c7049e.n());
                }
            }
        }
    }

    public void n(C7206b.InterfaceC2026b interfaceC2026b) {
        this.f57469g = interfaceC2026b;
    }
}
