package ts;

import ht.l0;
import ht.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ServiceLoader;
import rr.m0;
import rr.p;
import rr.r0;
import rr.u;
import rr.z;
import ur.g0;
import ur.h0;
import ur.j0;
import ur.q0;
import ur.v;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final List f22970b = mq.o.Q0(ServiceLoader.load(g.class, g.class.getClassLoader()));

    /* renamed from: c, reason: collision with root package name */
    public static final n f22971c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f22972d;

    /* renamed from: a, reason: collision with root package name */
    public final jt.c f22973a;

    static {
        b bVar = new b();
        f22972d = bVar;
        f22971c = new n(bVar);
    }

    public n(jt.c cVar) {
        if (cVar != null) {
            this.f22973a = cVar;
        } else {
            a(5);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r25) {
        /*
            Method dump skipped, instructions count: 1320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ts.n.a(int):void");
    }

    public static boolean b(x xVar, x xVar2, l0 l0Var) {
        if (xVar == null) {
            a(46);
            throw null;
        }
        if (xVar2 == null) {
            a(47);
            throw null;
        }
        if (ht.c.i(xVar) && ht.c.i(xVar2)) {
            return true;
        }
        return ht.e.g(l0Var, xVar.k0(), xVar2.k0());
    }

    public static void c(rr.d dVar, LinkedHashSet linkedHashSet) {
        if (dVar == null) {
            a(17);
            throw null;
        }
        if (dVar.f().isReal()) {
            linkedHashSet.add(dVar);
            return;
        }
        if (dVar.p().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + dVar);
        }
        Iterator it = dVar.p().iterator();
        while (it.hasNext()) {
            c((rr.d) it.next(), linkedHashSet);
        }
    }

    public static ArrayList d(rr.b bVar) {
        v vVarJ0 = bVar.j0();
        ArrayList arrayList = new ArrayList();
        if (vVarJ0 != null) {
            arrayList.add(vVarJ0.getType());
        }
        Iterator it = bVar.Y().iterator();
        while (it.hasNext()) {
            arrayList.add(((q0) it.next()).getType());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01a4, code lost:
    
        if (r1 == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01a6, code lost:
    
        r0 = rr.p.f21704h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01a9, code lost:
    
        r0 = rr.p.f21703g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01ab, code lost:
    
        r11 = ((rr.d) s(r10, new ts.j(0))).V(r11, r2, r0, rr.c.FAKE_OVERRIDE);
        r12.p(r11, r10);
        r12.b(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01c3, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(java.util.Collection r10, rr.f r11, ts.o r12) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ts.n.e(java.util.Collection, rr.f, ts.o):void");
    }

    public static ArrayList g(Object obj, LinkedList linkedList, ar.k kVar, ar.k kVar2) {
        if (obj == null) {
            a(99);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        rr.b bVar = (rr.b) kVar.a(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            rr.b bVar2 = (rr.b) kVar.a(next);
            if (obj == next) {
                it.remove();
            } else {
                l lVarJ = j(bVar, bVar2);
                if (lVarJ == l.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (lVarJ == l.CONFLICT) {
                    kVar2.a(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static m i(rr.b bVar, rr.b bVar2) {
        boolean z10;
        if (bVar == null) {
            a(40);
            throw null;
        }
        if (bVar2 == null) {
            a(41);
            throw null;
        }
        boolean z11 = bVar instanceof u;
        if ((z11 && !(bVar2 instanceof u)) || (((z10 = bVar instanceof m0)) && !(bVar2 instanceof m0))) {
            return m.d("Member kind mismatch");
        }
        if (!z11 && !z10) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + bVar);
        }
        if (!bVar.getName().equals(bVar2.getName())) {
            return m.d("Name mismatch");
        }
        m mVarD = (bVar.j0() == null) != (bVar2.j0() == null) ? m.d("Receiver presence mismatch") : bVar.Y().size() != bVar2.Y().size() ? m.d("Value parameter number mismatch") : null;
        if (mVarD != null) {
            return mVarD;
        }
        return null;
    }

    public static l j(rr.b bVar, rr.b bVar2) {
        n nVar = f22971c;
        l lVarC = nVar.l(bVar2, bVar, null).c();
        l lVarC2 = nVar.m(bVar, bVar2, null, false).c();
        l lVar = l.OVERRIDABLE;
        if (lVarC == lVar && lVarC2 == lVar) {
            return lVar;
        }
        l lVar2 = l.CONFLICT;
        return (lVarC == lVar2 || lVarC2 == lVar2) ? lVar2 : l.INCOMPATIBLE;
    }

    public static boolean k(rr.b bVar, rr.b bVar2) {
        if (bVar == null) {
            a(67);
            throw null;
        }
        if (bVar2 == null) {
            a(68);
            throw null;
        }
        x xVarI = bVar.i();
        x xVarI2 = bVar2.i();
        if (!p(bVar, bVar2)) {
            return false;
        }
        l0 l0VarF = f22971c.f(bVar.getTypeParameters(), bVar2.getTypeParameters());
        if (bVar instanceof u) {
            return o(bVar, xVarI, bVar2, xVarI2, l0VarF);
        }
        if (!(bVar instanceof m0)) {
            throw new IllegalArgumentException("Unexpected callable: " + bVar.getClass());
        }
        m0 m0Var = (m0) bVar;
        m0 m0Var2 = (m0) bVar2;
        j0 j0VarD = m0Var.d();
        j0 j0VarD2 = m0Var2.d();
        if ((j0VarD == null || j0VarD2 == null) ? true : p(j0VarD, j0VarD2)) {
            return (m0Var.i0() && m0Var2.i0()) ? ht.e.g(l0VarF, xVarI.k0(), xVarI2.k0()) : (m0Var.i0() || !m0Var2.i0()) && o(bVar, xVarI, bVar2, xVarI2, l0VarF);
        }
        return false;
    }

    public static boolean o(rr.b bVar, x xVar, rr.b bVar2, x xVar2, l0 l0Var) {
        if (bVar == null) {
            a(73);
            throw null;
        }
        if (xVar == null) {
            a(74);
            throw null;
        }
        if (bVar2 == null) {
            a(75);
            throw null;
        }
        if (xVar2 != null) {
            return ht.e.n(ht.e.f10894a, l0Var, xVar.k0(), xVar2.k0());
        }
        a(76);
        throw null;
    }

    public static boolean p(rr.b bVar, rr.b bVar2) {
        if (bVar == null) {
            a(69);
            throw null;
        }
        if (bVar2 != null) {
            Integer numB = p.b(bVar.c(), bVar2.c());
            return numB == null || numB.intValue() >= 0;
        }
        a(70);
        throw null;
    }

    public static boolean q(rr.b bVar, rr.b bVar2) {
        if (bVar == null) {
            a(13);
            throw null;
        }
        if (bVar2 == null) {
            a(14);
            throw null;
        }
        boolean zEquals = bVar.equals(bVar2);
        b bVar3 = b.f22960a;
        if (!zEquals && bVar3.c(bVar.u1(), bVar2.u1(), false)) {
            return true;
        }
        rr.b bVarU1 = bVar2.u1();
        int i10 = d.f22961a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        d.b(bVar.u1(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (bVar3.c(bVarU1, (rr.b) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void r(rr.d dVar, ar.k kVar) {
        as.p pVar;
        as.p pVarF;
        as.p pVar2;
        if (dVar == null) {
            a(107);
            throw null;
        }
        for (rr.d dVar2 : dVar.p()) {
            if (dVar2.c() == p.f21703g) {
                r(dVar2, kVar);
            }
        }
        if (dVar.c() != p.f21703g) {
            return;
        }
        Collection<rr.d> collectionP = dVar.p();
        if (collectionP == null) {
            a(109);
            throw null;
        }
        if (collectionP.isEmpty()) {
            pVarF = p.j;
        } else {
            Iterator it = collectionP.iterator();
            loop3: while (true) {
                pVar = null;
                while (it.hasNext()) {
                    as.p pVarC = ((rr.d) it.next()).c();
                    if (pVar != null) {
                        Integer numB = p.b(pVarC, pVar);
                        if (numB == null) {
                            break;
                        } else if (numB.intValue() > 0) {
                        }
                    }
                    pVar = pVarC;
                }
            }
            if (pVar == null) {
                pVarF = null;
                break;
            }
            Iterator it2 = collectionP.iterator();
            while (it2.hasNext()) {
                Integer numB2 = p.b(pVar, ((rr.d) it2.next()).c());
                if (numB2 == null || numB2.intValue() < 0) {
                    pVarF = null;
                    break;
                }
            }
            pVarF = pVar;
        }
        if (pVarF == null) {
            pVarF = null;
            break;
        }
        if (dVar.f() == rr.c.FAKE_OVERRIDE) {
            for (rr.d dVar3 : collectionP) {
                if (dVar3.j() != z.ABSTRACT && !dVar3.c().equals(pVarF)) {
                    pVarF = null;
                    break;
                }
            }
        } else {
            pVarF = p.f(pVarF.f2239a.k());
        }
        if (pVarF == null) {
            if (kVar != null) {
                kVar.a(dVar);
            }
            pVar2 = p.f21701e;
        } else {
            pVar2 = pVarF;
        }
        if (dVar instanceof h0) {
            h0 h0Var = (h0) dVar;
            if (pVar2 == null) {
                h0.S0(20);
                throw null;
            }
            h0Var.G = pVar2;
            Iterator it3 = ((m0) dVar).t().iterator();
            while (it3.hasNext()) {
                r((rr.l0) it3.next(), pVarF == null ? null : kVar);
            }
            return;
        }
        if (dVar instanceof ur.u) {
            ur.u uVar = (ur.u) dVar;
            if (pVar2 != null) {
                uVar.I = pVar2;
                return;
            } else {
                ur.u.S0(10);
                throw null;
            }
        }
        g0 g0Var = (g0) dVar;
        g0Var.H = pVar2;
        if (pVar2 != g0Var.v1().c()) {
            g0Var.f23641y = false;
        }
    }

    public static Object s(Collection collection, ar.k kVar) {
        Object next;
        if (collection.size() == 1) {
            Object objQ0 = mq.o.q0(collection);
            if (objQ0 != null) {
                return objQ0;
            }
            a(80);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(mq.p.a0(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(kVar.a(it.next()));
        }
        Object objQ02 = mq.o.q0(collection);
        rr.b bVar = (rr.b) kVar.a(objQ02);
        for (Object obj : collection) {
            rr.b bVar2 = (rr.b) kVar.a(obj);
            if (bVar2 == null) {
                a(71);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
                if (!k(bVar2, (rr.b) it2.next())) {
                    break;
                }
            }
            if (k(bVar2, bVar) && !k(bVar, bVar2)) {
                objQ02 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objQ02 != null) {
                return objQ02;
            }
            a(81);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objQ03 = mq.o.q0(arrayList);
            if (objQ03 != null) {
                return objQ03;
            }
            a(82);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (!ht.c.j(((rr.b) kVar.a(next)).i())) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        Object objQ04 = mq.o.q0(arrayList);
        if (objQ04 != null) {
            return objQ04;
        }
        a(84);
        throw null;
    }

    public final l0 f(List list, List list2) {
        jt.e eVar = jt.e.f13841a;
        if (list == null) {
            a(42);
            throw null;
        }
        if (list2 == null) {
            a(43);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        jt.f fVar = jt.f.f13843a;
        jt.c cVar = this.f22973a;
        if (zIsEmpty) {
            return new l0(true, true, new q3.a((HashMap) null, cVar), eVar, fVar);
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.put(((r0) list.get(i10)).v(), ((r0) list2.get(i10)).v());
        }
        return new l0(true, true, new q3.a(map, cVar), eVar, fVar);
    }

    public final void h(qs.g gVar, Collection collection, Collection collection2, rr.f fVar, o oVar) {
        Integer numB;
        if (gVar == null) {
            a(52);
            throw null;
        }
        if (collection == null) {
            a(53);
            throw null;
        }
        if (collection2 == null) {
            a(54);
            throw null;
        }
        if (fVar == null) {
            a(55);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            rr.d dVar = (rr.d) it.next();
            if (dVar == null) {
                a(59);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            rt.h hVar = new rt.h();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                rr.d dVar2 = (rr.d) it2.next();
                l lVarC = l(dVar2, dVar, fVar).c();
                boolean z10 = !p.e(dVar2.c()) && p.c(p.f21706l, dVar2, dVar) == null;
                int i10 = k.f22966b[lVarC.ordinal()];
                if (i10 == 1) {
                    if (z10) {
                        hVar.add(dVar2);
                    }
                    arrayList.add(dVar2);
                } else if (i10 == 2) {
                    if (z10) {
                        oVar.d(dVar2, dVar);
                    }
                    arrayList.add(dVar2);
                }
            }
            oVar.p(dVar, hVar);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            rr.l lVarO = ((rr.d) linkedHashSet.iterator().next()).o();
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (((rr.d) it3.next()).o() != lVarO) {
                        LinkedList<rr.d> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            rr.d dVar3 = null;
                            for (rr.d dVar4 : linkedList) {
                                if (dVar3 == null || ((numB = p.b(dVar3.c(), dVar4.c())) != null && numB.intValue() < 0)) {
                                    dVar3 = dVar4;
                                }
                            }
                            br.l.b(dVar3);
                            e(g(dVar3, linkedList, new j(1), new n0.q0(oVar, 2, dVar3)), fVar, oVar);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            e(Collections.singleton((rr.d) it4.next()), fVar, oVar);
        }
    }

    public final m l(rr.b bVar, rr.b bVar2, rr.f fVar) {
        if (bVar == null) {
            a(19);
            throw null;
        }
        if (bVar2 != null) {
            return m(bVar, bVar2, fVar, false);
        }
        a(20);
        throw null;
    }

    public final m m(rr.b bVar, rr.b bVar2, rr.f fVar, boolean z10) {
        if (bVar == null) {
            a(22);
            throw null;
        }
        if (bVar2 == null) {
            a(23);
            throw null;
        }
        m mVarN = n(bVar, bVar2, z10);
        boolean z11 = mVarN.c() == l.OVERRIDABLE;
        List<g> list = f22970b;
        for (g gVar : list) {
            if (gVar.a() != e.CONFLICTS_ONLY && (!z11 || gVar.a() != e.SUCCESS_ONLY)) {
                int i10 = k.f22965a[gVar.b(bVar, bVar2, fVar).ordinal()];
                if (i10 == 1) {
                    z11 = true;
                } else {
                    if (i10 == 2) {
                        return m.b("External condition failed");
                    }
                    if (i10 == 3) {
                        return m.d("External condition");
                    }
                }
            }
        }
        if (!z11) {
            return mVarN;
        }
        for (g gVar2 : list) {
            if (gVar2.a() == e.CONFLICTS_ONLY) {
                int i11 = k.f22965a[gVar2.b(bVar, bVar2, fVar).ordinal()];
                if (i11 == 1) {
                    throw new IllegalStateException("Contract violation in " + gVar2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i11 == 2) {
                    return m.b("External condition failed");
                }
                if (i11 == 3) {
                    return m.d("External condition");
                }
            }
        }
        m mVar = m.f22968b;
        if (mVar != null) {
            return mVar;
        }
        m.a(0);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        r14.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ts.m n(rr.b r17, rr.b r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ts.n.n(rr.b, rr.b, boolean):ts.m");
    }
}
