package es;

import as.j0;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.y3;
import ht.a1;
import ht.c1;
import ht.y0;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rr.m0;
import ur.k0;
import ur.q0;

/* loaded from: classes.dex */
public final class p extends c0 {

    /* renamed from: n, reason: collision with root package name */
    public final rr.f f8321n;

    /* renamed from: o, reason: collision with root package name */
    public final xr.o f8322o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f8323p;

    /* renamed from: q, reason: collision with root package name */
    public final gt.i f8324q;

    /* renamed from: r, reason: collision with root package name */
    public final gt.i f8325r;

    /* renamed from: s, reason: collision with root package name */
    public final gt.i f8326s;

    /* renamed from: t, reason: collision with root package name */
    public final gt.i f8327t;

    /* renamed from: u, reason: collision with root package name */
    public final gt.j f8328u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(cj.a aVar, rr.f fVar, xr.o oVar, boolean z10, p pVar) {
        super(aVar, pVar);
        br.l.e(aVar, "c");
        br.l.e(oVar, "jClass");
        this.f8321n = fVar;
        this.f8322o = oVar;
        this.f8323p = z10;
        gt.o oVar2 = ((ds.a) aVar.f3974d).f7446a;
        n nVar = new n(this, aVar);
        gt.l lVar = (gt.l) oVar2;
        lVar.getClass();
        this.f8324q = new gt.i(lVar, nVar);
        o oVar3 = new o(this, 1);
        gt.l lVar2 = (gt.l) oVar2;
        lVar2.getClass();
        this.f8325r = new gt.i(lVar2, oVar3);
        n nVar2 = new n(aVar, this);
        gt.l lVar3 = (gt.l) oVar2;
        lVar3.getClass();
        this.f8326s = new gt.i(lVar3, nVar2);
        o oVar4 = new o(this, 0);
        gt.l lVar4 = (gt.l) oVar2;
        lVar4.getClass();
        this.f8327t = new gt.i(lVar4, oVar4);
        this.f8328u = ((gt.l) oVar2).c(new c7.b(this, 4, aVar));
    }

    public static k0 C(k0 k0Var, rr.u uVar, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return k0Var;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            k0 k0Var2 = (k0) it.next();
            if (!k0Var.equals(k0Var2) && k0Var2.Y == null && F(k0Var2, uVar)) {
                rr.u uVarBuild = k0Var.F0().A().build();
                br.l.b(uVarBuild);
                return (k0) uVarBuild;
            }
        }
        return k0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ur.k0 D(ur.k0 r5) {
        /*
            java.util.List r0 = r5.Y()
            java.lang.String r1 = "valueParameters"
            br.l.d(r0, r1)
            java.lang.Object r0 = mq.o.A0(r0)
            ur.q0 r0 = (ur.q0) r0
            r2 = 0
            if (r0 == 0) goto L7d
            r3 = r0
            ur.r0 r3 = (ur.r0) r3
            ht.x r3 = r3.getType()
            ht.m0 r3 = r3.Z()
            rr.i r3 = r3.p()
            if (r3 == 0) goto L36
            qs.e r3 = xs.d.h(r3)
            boolean r4 = r3.d()
            if (r4 == 0) goto L2e
            goto L2f
        L2e:
            r3 = r2
        L2f:
            if (r3 == 0) goto L36
            qs.c r3 = r3.g()
            goto L37
        L36:
            r3 = r2
        L37:
            qs.c r4 = or.o.f19718f
            boolean r3 = br.l.a(r3, r4)
            if (r3 == 0) goto L40
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 != 0) goto L44
            goto L7d
        L44:
            rr.t r2 = r5.F0()
            java.util.List r5 = r5.Y()
            br.l.d(r5, r1)
            java.util.List r5 = mq.o.n0(r5)
            rr.t r5 = r2.c(r5)
            ur.r0 r0 = (ur.r0) r0
            ht.x r0 = r0.getType()
            java.util.List r0 = r0.L()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            ht.p0 r0 = (ht.p0) r0
            ht.x r0 = r0.b()
            rr.t r5 = r5.p(r0)
            rr.u r5 = r5.build()
            ur.k0 r5 = (ur.k0) r5
            if (r5 != 0) goto L79
            return r5
        L79:
            r0 = 1
            r5.R = r0
            return r5
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: es.p.D(ur.k0):ur.k0");
    }

    public static boolean F(rr.u uVar, rr.u uVar2) {
        ts.l lVarC = ts.n.f22971c.n(uVar2, uVar, true).c();
        br.l.d(lVarC, "DEFAULT.isOverridableByW…iptor, this, true).result");
        return lVarC == ts.l.OVERRIDABLE && !ba.m.t(uVar2, uVar);
    }

    public static boolean G(k0 k0Var, k0 k0Var2) {
        int i10 = as.e.f2210l;
        br.l.e(k0Var, "<this>");
        if (br.l.a(k0Var.getName().b(), "removeAt") && br.l.a(i3.g.g(k0Var), j0.f2230g.f2218b)) {
            k0Var2 = k0Var2.u1();
        }
        br.l.d(k0Var2, "if (superDescriptor.isRe…iginal else subDescriptor");
        return F(k0Var2, k0Var);
    }

    public static k0 H(m0 m0Var, String str, ar.k kVar) {
        k0 k0Var;
        Iterator it = ((Iterable) kVar.a(qs.g.e(str))).iterator();
        do {
            k0Var = null;
            if (!it.hasNext()) {
                break;
            }
            k0 k0Var2 = (k0) it.next();
            if (k0Var2.Y().size() == 0) {
                jt.l lVar = jt.d.f13840a;
                ht.x xVar = k0Var2.D;
                if (xVar == null ? false : lVar.b(xVar, m0Var.getType())) {
                    k0Var = k0Var2;
                }
            }
        } while (k0Var == null);
        return k0Var;
    }

    public static k0 J(m0 m0Var, ar.k kVar) {
        k0 k0Var;
        ht.x xVar;
        String strB = m0Var.getName().b();
        br.l.d(strB, "name.asString()");
        Iterator it = ((Iterable) kVar.a(qs.g.e(as.z.b(strB)))).iterator();
        do {
            k0Var = null;
            if (!it.hasNext()) {
                break;
            }
            k0 k0Var2 = (k0) it.next();
            if (k0Var2.Y().size() == 1 && (xVar = k0Var2.D) != null) {
                qs.g gVar = or.h.f19672e;
                if (or.h.D(xVar, or.n.f19692d)) {
                    jt.l lVar = jt.d.f13840a;
                    List listY = k0Var2.Y();
                    br.l.d(listY, "descriptor.valueParameters");
                    if (lVar.a(((q0) mq.o.I0(listY)).getType(), m0Var.getType())) {
                        k0Var = k0Var2;
                    }
                }
            }
        } while (k0Var == null);
        return k0Var;
    }

    public static boolean M(k0 k0Var, rr.u uVar) {
        String strF = i3.g.f(k0Var, 2);
        rr.u uVarU1 = uVar.u1();
        br.l.d(uVarU1, "builtinWithErasedParameters.original");
        return strF.equals(i3.g.f(uVarU1, 2)) && !F(k0Var, uVar);
    }

    public static final ArrayList v(p pVar, qs.g gVar) {
        Collection collectionF = ((c) pVar.f8274e.c()).f(gVar);
        ArrayList arrayList = new ArrayList(mq.p.a0(collectionF, 10));
        Iterator it = collectionF.iterator();
        while (it.hasNext()) {
            arrayList.add(pVar.t((xr.x) it.next()));
        }
        return arrayList;
    }

    public static final ArrayList w(p pVar, qs.g gVar) {
        LinkedHashSet linkedHashSetK = pVar.K(gVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetK) {
            k0 k0Var = (k0) obj;
            br.l.e(k0Var, "<this>");
            if (b4.D(k0Var) == null && as.g.a(k0Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void A(Set set, AbstractCollection abstractCollection, rt.h hVar, ar.k kVar) {
        k0 k0VarJ;
        ur.j0 j0VarM;
        cs.d dVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            if (E(m0Var, kVar)) {
                k0 k0VarI = I(m0Var, kVar);
                br.l.b(k0VarI);
                if (m0Var.i0()) {
                    k0VarJ = J(m0Var, kVar);
                    br.l.b(k0VarJ);
                } else {
                    k0VarJ = null;
                }
                if (k0VarJ != null) {
                    k0VarJ.j();
                    k0VarI.j();
                }
                rr.f fVar = this.f8321n;
                br.l.e(fVar, "ownerDescriptor");
                cs.d dVar2 = new cs.d(fVar, sr.g.f22217a, k0VarI.j(), k0VarI.c(), k0VarJ != null, m0Var.getName(), k0VarI.h(), null, rr.c.DECLARATION, false, null);
                ht.x xVar = k0VarI.D;
                br.l.b(xVar);
                ur.v vVarP = p();
                mq.w wVar = mq.w.f16945a;
                dVar2.C1(xVar, wVar, vVarP, null, wVar);
                ur.i0 i0VarL = ts.o.l(dVar2, k0VarI.getAnnotations(), false, k0VarI.h());
                i0VarL.I = k0VarI;
                i0VarL.y1(dVar2.getType());
                if (k0VarJ != null) {
                    List listY = k0VarJ.Y();
                    br.l.d(listY, "setterMethod.valueParameters");
                    q0 q0Var = (q0) mq.o.t0(listY);
                    if (q0Var == null) {
                        throw new AssertionError("No parameter found for " + k0VarJ);
                    }
                    j0VarM = ts.o.m(dVar2, k0VarJ.getAnnotations(), q0Var.getAnnotations(), false, k0VarJ.c(), k0VarJ.h());
                    j0VarM.I = k0VarJ;
                } else {
                    j0VarM = null;
                }
                dVar2.z1(i0VarL, j0VarM, null, null);
                dVar = dVar2;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                abstractCollection.add(dVar);
                if (hVar != null) {
                    hVar.add(m0Var);
                    return;
                }
                return;
            }
        }
    }

    public final Collection B() {
        boolean z10 = this.f8323p;
        rr.f fVar = this.f8321n;
        if (z10) {
            Collection collectionQ = fVar.v().q();
            br.l.d(collectionQ, "ownerDescriptor.typeConstructor.supertypes");
            return collectionQ;
        }
        ((jt.l) ((ds.a) this.f8271b.f3974d).f7464u).getClass();
        br.l.e(fVar, "classDescriptor");
        Collection collectionQ2 = fVar.v().q();
        br.l.d(collectionQ2, "classDescriptor.typeConstructor.supertypes");
        return collectionQ2;
    }

    public final boolean E(m0 m0Var, ar.k kVar) {
        if (y3.C(m0Var)) {
            return false;
        }
        k0 k0VarI = I(m0Var, kVar);
        k0 k0VarJ = J(m0Var, kVar);
        if (k0VarI == null) {
            return false;
        }
        if (m0Var.i0()) {
            return k0VarJ != null && k0VarJ.j() == k0VarI.j();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final k0 I(m0 m0Var, ar.k kVar) {
        qs.g gVar;
        ur.i0 i0VarB = m0Var.b();
        String strB = null;
        ur.i0 i0Var = i0VarB != null ? (ur.i0) b4.D(i0VarB) : null;
        if (i0Var != null) {
            or.h.z(i0Var);
            rr.d dVarB = xs.d.b(xs.d.k(i0Var), as.f.f2213x);
            if (dVarB != null && (gVar = (qs.g) as.h.f2219a.get(xs.d.g(dVarB))) != null) {
                strB = gVar.b();
            }
        }
        if (strB != null && !b4.J(this.f8321n, i0Var)) {
            return H(m0Var, strB, kVar);
        }
        String strB2 = m0Var.getName().b();
        br.l.d(strB2, "name.asString()");
        return H(m0Var, as.z.a(strB2), kVar);
    }

    public final LinkedHashSet K(qs.g gVar) {
        Collection collectionB = B();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            mq.t.d0(linkedHashSet, ((ht.x) it.next()).W().f(gVar, zr.d.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    public final Set L(qs.g gVar) {
        Collection collectionB = B();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            Collection collectionB2 = ((ht.x) it.next()).W().b(gVar, zr.d.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(mq.p.a0(collectionB2, 10));
            Iterator it2 = collectionB2.iterator();
            while (it2.hasNext()) {
                arrayList2.add((m0) it2.next());
            }
            mq.t.d0(arrayList, arrayList2);
        }
        return mq.o.U0(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cb A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean N(ur.k0 r9) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: es.p.N(ur.k0):boolean");
    }

    public final void O(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        xu.d.a0(((ds.a) this.f8271b.f3974d).f7457n, bVar, this.f8321n, gVar);
    }

    @Override // es.c0, at.o, at.n
    public final Collection b(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        O(gVar, bVar);
        return super.b(gVar, bVar);
    }

    @Override // at.o, at.p
    public final rr.i c(qs.g gVar, zr.b bVar) {
        gt.j jVar;
        rr.f fVar;
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        O(gVar, bVar);
        p pVar = (p) this.f8272c;
        return (pVar == null || (jVar = pVar.f8328u) == null || (fVar = (rr.f) jVar.a(gVar)) == null) ? (rr.i) this.f8328u.a(gVar) : fVar;
    }

    @Override // es.c0, at.o, at.n
    public final Collection f(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        O(gVar, bVar);
        return super.f(gVar, bVar);
    }

    @Override // es.c0
    public final Set h(at.f fVar, ar.k kVar) {
        br.l.e(fVar, "kindFilter");
        return mq.f0.N((Set) this.f8325r.c(), ((Map) this.f8327t.c()).keySet());
    }

    @Override // es.c0
    public final Set i(at.f fVar, at.k kVar) {
        br.l.e(fVar, "kindFilter");
        rr.f fVar2 = this.f8321n;
        Collection collectionQ = fVar2.v().q();
        br.l.d(collectionQ, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionQ.iterator();
        while (it.hasNext()) {
            mq.t.d0(linkedHashSet, ((ht.x) it.next()).W().d());
        }
        gt.i iVar = this.f8274e;
        linkedHashSet.addAll(((c) iVar.c()).a());
        linkedHashSet.addAll(((c) iVar.c()).d());
        linkedHashSet.addAll(h(fVar, kVar));
        cj.a aVar = this.f8271b;
        ((ys.a) ((ds.a) aVar.f3974d).f7467x).getClass();
        br.l.e(aVar, "_context_receiver_0");
        br.l.e(fVar2, "thisDescriptor");
        linkedHashSet.addAll(new ArrayList());
        return linkedHashSet;
    }

    @Override // es.c0
    public final void j(ArrayList arrayList, qs.g gVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        br.l.e(gVar, "name");
        boolean zF = this.f8322o.f();
        rr.f fVar = this.f8321n;
        cj.a aVar = this.f8271b;
        if (zF) {
            gt.i iVar = this.f8274e;
            if (((c) iVar.c()).c(gVar) != null) {
                if (arrayList.isEmpty()) {
                    xr.a0 a0VarC = ((c) iVar.c()).c(gVar);
                    br.l.b(a0VarC);
                    ds.c cVarH = ic.a.H(aVar, a0VarC);
                    ds.a aVar2 = (ds.a) aVar.f3974d;
                    cs.g gVarK1 = cs.g.K1(fVar, cVarH, a0VarC.c(), aVar2.j.a(a0VarC), true);
                    ht.x xVarU = ((bm.d) aVar.f3978y).U(a0VarC.f(), b4.f0(y0.COMMON, false, null, 6));
                    ur.v vVarP = p();
                    rr.z.Companion.getClass();
                    rr.z zVar = rr.z.OPEN;
                    as.p pVar = rr.p.f21701e;
                    mq.w wVar = mq.w.f16945a;
                    gVarK1.J1(null, vVarP, wVar, wVar, wVar, xVarU, zVar, pVar, null);
                    gVarK1.f6665a0 = cs.f.get(false, false);
                    aVar2.f7452g.getClass();
                    arrayList.add(gVarK1);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((k0) it.next()).Y().isEmpty()) {
                            break;
                        }
                    }
                    xr.a0 a0VarC2 = ((c) iVar.c()).c(gVar);
                    br.l.b(a0VarC2);
                    ds.c cVarH2 = ic.a.H(aVar, a0VarC2);
                    ds.a aVar22 = (ds.a) aVar.f3974d;
                    cs.g gVarK12 = cs.g.K1(fVar, cVarH2, a0VarC2.c(), aVar22.j.a(a0VarC2), true);
                    ht.x xVarU2 = ((bm.d) aVar.f3978y).U(a0VarC2.f(), b4.f0(y0.COMMON, false, null, 6));
                    ur.v vVarP2 = p();
                    rr.z.Companion.getClass();
                    rr.z zVar2 = rr.z.OPEN;
                    as.p pVar2 = rr.p.f21701e;
                    mq.w wVar2 = mq.w.f16945a;
                    gVarK12.J1(null, vVarP2, wVar2, wVar2, wVar2, xVarU2, zVar2, pVar2, null);
                    gVarK12.f6665a0 = cs.f.get(false, false);
                    aVar22.f7452g.getClass();
                    arrayList.add(gVarK12);
                }
            }
        }
        ((ys.a) ((ds.a) aVar.f3974d).f7467x).getClass();
        br.l.e(aVar, "_context_receiver_0");
        br.l.e(fVar, "thisDescriptor");
        br.l.e(gVar, "name");
    }

    @Override // es.c0
    public final c k() {
        return new a(this.f8322o, k.f8309g);
    }

    @Override // es.c0
    public final void m(LinkedHashSet linkedHashSet, qs.g gVar) {
        br.l.e(gVar, "name");
        LinkedHashSet linkedHashSetK = K(gVar);
        ArrayList arrayList = j0.f2224a;
        if (!j0.j.contains(gVar)) {
            int i10 = as.g.f2216l;
            if (!as.g.b(gVar)) {
                if (!linkedHashSetK.isEmpty()) {
                    Iterator it = linkedHashSetK.iterator();
                    while (it.hasNext()) {
                        if (((rr.u) it.next()).r()) {
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSetK) {
                    if (N((k0) obj)) {
                        arrayList2.add(obj);
                    }
                }
                y(linkedHashSet, gVar, arrayList2, false);
                return;
            }
        }
        rt.h hVar = new rt.h();
        LinkedHashSet linkedHashSetQ = kc.f.Q(gVar, linkedHashSetK, mq.w.f16945a, this.f8321n, dt.m.f7514a, ((jt.l) ((ds.a) this.f8271b.f3974d).f7464u).f13859d);
        z(gVar, linkedHashSet, linkedHashSetQ, linkedHashSet, new l(1, 0, this));
        z(gVar, linkedHashSet, linkedHashSetQ, hVar, new l(1, 1, this));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSetK) {
            if (N((k0) obj2)) {
                arrayList3.add(obj2);
            }
        }
        y(linkedHashSet, gVar, mq.o.E0(arrayList3, hVar), true);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, lq.h] */
    @Override // es.c0
    public final void n(ArrayList arrayList, qs.g gVar) {
        Set setU0;
        xr.x xVar;
        br.l.e(gVar, "name");
        boolean zIsAnnotation = this.f8322o.f25509a.isAnnotation();
        cj.a aVar = this.f8271b;
        if (zIsAnnotation && (xVar = (xr.x) mq.o.J0(((c) this.f8274e.c()).f(gVar))) != null) {
            cs.h hVarD1 = cs.h.D1(this.f8321n, ic.a.H(aVar, xVar), rr.z.FINAL, i4.I(xVar.e()), false, xVar.c(), ((ds.a) aVar.f3974d).j.a(xVar), false);
            ur.i0 i0VarF = ts.o.f(hVarD1, sr.g.f22217a);
            hVarD1.z1(i0VarF, null, null, null);
            br.l.e(aVar, "<this>");
            ht.x xVarL = c0.l(xVar, new cj.a((ds.a) aVar.f3974d, new bj.c(aVar, hVarD1, xVar, 0), (lq.h) aVar.f3976r));
            ur.v vVarP = p();
            mq.w wVar = mq.w.f16945a;
            hVarD1.C1(xVarL, wVar, vVarP, null, wVar);
            i0VarF.J = xVarL;
            arrayList.add(hVarD1);
        }
        Set setL = L(gVar);
        if (setL.isEmpty()) {
            return;
        }
        rt.h hVar = new rt.h();
        rt.h hVar2 = new rt.h();
        A(setL, arrayList, hVar, new m(this, 0));
        br.l.e(setL, "<this>");
        rt.h hVarQ0 = hVar instanceof Collection ? hVar : mq.o.Q0(hVar);
        if (hVarQ0.isEmpty()) {
            setU0 = mq.o.U0(setL);
        } else if (hVarQ0 instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : setL) {
                if (!((Set) hVarQ0).contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            setU0 = linkedHashSet;
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(setL);
            linkedHashSet2.removeAll(hVarQ0);
            setU0 = linkedHashSet2;
        }
        A(setU0, hVar2, null, new m(this, 1));
        LinkedHashSet linkedHashSetN = mq.f0.N(setL, hVar2);
        ds.a aVar2 = (ds.a) aVar.f3974d;
        arrayList.addAll(kc.f.Q(gVar, linkedHashSetN, arrayList, this.f8321n, aVar2.f7451f, ((jt.l) aVar2.f7464u).f13859d));
    }

    @Override // es.c0
    public final Set o(at.f fVar) {
        br.l.e(fVar, "kindFilter");
        if (this.f8322o.f25509a.isAnnotation()) {
            return d();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((c) this.f8274e.c()).e());
        Collection collectionQ = this.f8321n.v().q();
        br.l.d(collectionQ, "ownerDescriptor.typeConstructor.supertypes");
        Iterator it = collectionQ.iterator();
        while (it.hasNext()) {
            mq.t.d0(linkedHashSet, ((ht.x) it.next()).W().g());
        }
        return linkedHashSet;
    }

    @Override // es.c0
    public final ur.v p() {
        rr.f fVar = this.f8321n;
        if (fVar != null) {
            int i10 = ts.d.f22961a;
            return fVar.R0();
        }
        ts.d.a(0);
        throw null;
    }

    @Override // es.c0
    public final rr.l q() {
        return this.f8321n;
    }

    @Override // es.c0
    public final boolean r(cs.g gVar) {
        if (this.f8322o.f25509a.isAnnotation()) {
            return false;
        }
        return N(gVar);
    }

    @Override // es.c0
    public final y s(xr.x xVar, ArrayList arrayList, ht.x xVar2, List list) {
        br.l.e(xVar, "method");
        ((ds.a) this.f8271b.f3974d).f7450e.getClass();
        if (this.f8321n != null) {
            List list2 = Collections.EMPTY_LIST;
            if (list2 != null) {
                return new y(xVar2, list, arrayList, list2);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"));
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "descriptor";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // es.c0
    public final String toString() {
        return "Lazy Java member scope for " + this.f8322o.c();
    }

    public final void x(ArrayList arrayList, cs.b bVar, int i10, xr.x xVar, ht.x xVar2, ht.x xVar3) {
        xr.f tVar;
        qs.g gVarC = xVar.c();
        if (xVar2 == null) {
            a1.a(2);
            throw null;
        }
        c1 c1VarG = a1.g(xVar2, false);
        Object defaultValue = xVar.f25517a.getDefaultValue();
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List list = xr.d.f25493a;
            tVar = Enum.class.isAssignableFrom(cls) ? new xr.t(null, (Enum) defaultValue) : defaultValue instanceof Annotation ? new xr.g(null, (Annotation) defaultValue) : defaultValue instanceof Object[] ? new xr.h(null, (Object[]) defaultValue) : defaultValue instanceof Class ? new xr.p(null, (Class) defaultValue) : new xr.v(null, defaultValue);
        } else {
            tVar = null;
        }
        arrayList.add(new q0(bVar, null, i10, sr.g.f22217a, gVarC, c1VarG, tVar != null, false, false, xVar3 != null ? a1.g(xVar3, false) : null, ((ds.a) this.f8271b.f3974d).j.a(xVar)));
    }

    public final void y(LinkedHashSet linkedHashSet, qs.g gVar, ArrayList arrayList, boolean z10) {
        ds.a aVar = (ds.a) this.f8271b.f3974d;
        LinkedHashSet<k0> linkedHashSetQ = kc.f.Q(gVar, arrayList, linkedHashSet, this.f8321n, aVar.f7451f, ((jt.l) aVar.f7464u).f13859d);
        if (!z10) {
            linkedHashSet.addAll(linkedHashSetQ);
            return;
        }
        ArrayList arrayListE0 = mq.o.E0(linkedHashSet, linkedHashSetQ);
        ArrayList arrayList2 = new ArrayList(mq.p.a0(linkedHashSetQ, 10));
        for (k0 k0VarC : linkedHashSetQ) {
            k0 k0Var = (k0) b4.E(k0VarC);
            if (k0Var != null) {
                k0VarC = C(k0VarC, k0Var, arrayListE0);
            }
            arrayList2.add(k0VarC);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(qs.g r9, java.util.LinkedHashSet r10, java.util.LinkedHashSet r11, java.util.AbstractSet r12, ar.k r13) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: es.p.z(qs.g, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.AbstractSet, ar.k):void");
    }
}
