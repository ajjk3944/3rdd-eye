package jt;

import ht.b0;
import ht.c1;
import ht.i0;
import ht.m0;
import ht.w;
import ht.x;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import mq.t;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f13862a = new p();

    public static ArrayList a(AbstractCollection abstractCollection, ar.n nVar) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        br.l.d(it, "filteredTypes.iterator()");
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    b0 b0Var2 = (b0) it2.next();
                    if (b0Var2 != b0Var) {
                        br.l.d(b0Var2, "lower");
                        br.l.d(b0Var, "upper");
                        if (((Boolean) nVar.w(b0Var2, b0Var)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [ht.i0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [ht.i0, java.lang.Object, ot.d] */
    public final b0 b(ArrayList arrayList) {
        boolean z10;
        b0 b0Var;
        boolean z11;
        Set setT0;
        b0 b0VarB;
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b0 b0Var2 = (b0) it.next();
            if (b0Var2.Z() instanceof w) {
                Collection collectionQ = b0Var2.Z().q();
                br.l.d(collectionQ, "type.constructor.supertypes");
                Collection<x> collection = collectionQ;
                ArrayList arrayList3 = new ArrayList(mq.p.a0(collection, 10));
                for (x xVar : collection) {
                    br.l.d(xVar, "it");
                    b0 b0VarY = ht.c.y(xVar);
                    if (b0Var2.c0()) {
                        b0VarY = b0VarY.p0(true);
                    }
                    arrayList3.add(b0VarY);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(b0Var2);
            }
        }
        n nVarCombine = n.START;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            nVarCombine = nVarCombine.combine((c1) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList2.iterator();
        while (true) {
            z10 = false;
            if (!it3.hasNext()) {
                break;
            }
            b0 b0VarP0 = (b0) it3.next();
            if (nVarCombine == n.NOT_NULL) {
                if (b0VarP0 instanceof h) {
                    h hVar = (h) b0VarP0;
                    b0VarP0 = new h(hVar.f13845d, hVar.f13846g, hVar.f13847r, hVar.f13848x, hVar.f13849y, true);
                }
                br.l.e(b0VarP0, "<this>");
                b0 b0VarP = ht.e.p(b0VarP0, false);
                b0VarP0 = (b0VarP == null && (b0VarP = ht.c.m(b0VarP0)) == null) ? b0VarP0.p0(false) : b0VarP;
            }
            linkedHashSet.add(b0VarP0);
        }
        ArrayList arrayList4 = new ArrayList(mq.p.a0(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((b0) it4.next()).X());
        }
        Iterator it5 = arrayList4.iterator();
        if (!it5.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it5.next();
        while (it5.hasNext()) {
            i0 i0Var = (i0) it5.next();
            next = (i0) next;
            next.getClass();
            bm.e eVar = i0.f10910d;
            br.l.e(i0Var, "other");
            if (!next.isEmpty() || !i0Var.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = ((ConcurrentHashMap) eVar.f2830d).values();
                br.l.d(collectionValues, "idPerType.values");
                Iterator it6 = collectionValues.iterator();
                while (it6.hasNext()) {
                    int iIntValue = ((Number) it6.next()).intValue();
                    ht.i iVar = (ht.i) next.f19796a.get(iIntValue);
                    ht.i iVar2 = (ht.i) i0Var.f19796a.get(iIntValue);
                    if (iVar != null) {
                        if (!br.l.a(iVar2, iVar)) {
                            iVar = null;
                        }
                        iVar2 = iVar;
                    } else if (iVar2 == null || !br.l.a(iVar, iVar2)) {
                        iVar2 = null;
                    }
                    rt.k.a(arrayList5, iVar2);
                }
                next = bm.e.m(arrayList5);
            }
        }
        i0 i0Var2 = (i0) next;
        if (linkedHashSet.size() == 1) {
            b0VarB = (b0) mq.o.H0(linkedHashSet);
        } else {
            ArrayList arrayListA = a(linkedHashSet, new o(2, 0, this));
            arrayListA.isEmpty();
            vs.l lVar = vs.l.INTERSECTION_TYPE;
            if (arrayListA.isEmpty()) {
                b0Var = null;
            } else {
                Iterator it7 = arrayListA.iterator();
                if (!it7.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next2 = it7.next();
                while (it7.hasNext()) {
                    b0 b0Var3 = (b0) it7.next();
                    b0 b0VarS = (b0) next2;
                    if (b0VarS == null || b0Var3 == null) {
                        z11 = z10;
                    } else {
                        m0 m0VarZ = b0VarS.Z();
                        m0 m0VarZ2 = b0Var3.Z();
                        boolean z12 = m0VarZ instanceof vs.p;
                        if (!z12) {
                            z11 = z10;
                        } else if (m0VarZ2 instanceof vs.p) {
                            Set set = ((vs.p) m0VarZ).f23963a;
                            Set set2 = ((vs.p) m0VarZ2).f23963a;
                            int i10 = vs.m.f23961a[lVar.ordinal()];
                            if (i10 == 1) {
                                Set set3 = set;
                                Set set4 = set2;
                                br.l.e(set3, "<this>");
                                br.l.e(set4, "other");
                                setT0 = mq.o.T0(set3);
                                setT0.retainAll(set4 instanceof Collection ? set4 : mq.o.Q0(set4));
                            } else {
                                if (i10 != 2) {
                                    throw new bf.n();
                                }
                                Set set5 = set;
                                Set set6 = set2;
                                br.l.e(set5, "<this>");
                                br.l.e(set6, "other");
                                setT0 = mq.o.T0(set5);
                                t.d0(setT0, set6);
                            }
                            vs.p pVar = new vs.p(setT0);
                            i0.f10910d.getClass();
                            i0 i0Var3 = i0.f10911g;
                            br.l.e(i0Var3, "attributes");
                            b0VarS = ht.e.s(kt.k.a(kt.g.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), i0Var3, pVar, mq.w.f16945a, false);
                            z11 = false;
                            z10 = z11;
                            next2 = b0VarS;
                        } else {
                            z11 = false;
                        }
                        if (z12) {
                            if (((vs.p) m0VarZ).f23963a.contains(b0Var3)) {
                                b0VarS = b0Var3;
                            }
                        } else if (!(m0VarZ2 instanceof vs.p) || !((vs.p) m0VarZ2).f23963a.contains(b0VarS)) {
                        }
                        z10 = z11;
                        next2 = b0VarS;
                    }
                    b0VarS = null;
                    z10 = z11;
                    next2 = b0VarS;
                }
                b0Var = (b0) next2;
            }
            if (b0Var != null) {
                b0VarB = b0Var;
            } else {
                k.f13857b.getClass();
                ArrayList arrayListA2 = a(arrayListA, new o(2, 1, j.f13856b));
                arrayListA2.isEmpty();
                b0VarB = arrayListA2.size() < 2 ? (b0) mq.o.H0(arrayListA2) : new w(linkedHashSet).b();
            }
        }
        return b0VarB.r0(i0Var2);
    }
}
