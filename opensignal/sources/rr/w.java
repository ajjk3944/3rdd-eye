package rr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final bu.t f21722a = new bu.t("InvalidModuleNotifier", 6);

    public static final qm.c a(ht.b0 b0Var, j jVar, int i10) {
        if (jVar == null || kt.k.f(jVar)) {
            return null;
        }
        int size = jVar.s().size() + i10;
        if (jVar.m()) {
            List listSubList = b0Var.L().subList(i10, size);
            l lVarO = jVar.o();
            return new qm.c(jVar, listSubList, a(b0Var, lVarO instanceof j ? (j) lVarO : null, size));
        }
        if (size != b0Var.L().size()) {
            ts.d.o(jVar);
        }
        return new qm.c(jVar, b0Var.L().subList(i10, b0Var.L().size()), (qm.c) null);
    }

    public static final void b(i0 i0Var, qs.c cVar, ArrayList arrayList) {
        br.l.e(i0Var, "<this>");
        br.l.e(cVar, "fqName");
        i0Var.b(cVar, arrayList);
    }

    public static final List c(j jVar) {
        List listO;
        Object next;
        ht.m0 m0VarV;
        List listS = jVar.s();
        br.l.d(listS, "declaredTypeParameters");
        if (!jVar.m() && !(jVar.o() instanceof b)) {
            return listS;
        }
        int i10 = xs.d.f25523a;
        xs.c cVar = xs.c.f25522d;
        List listD0 = st.l.d0(new st.g(new st.f(new mq.n(5, st.l.Y(st.l.a0(jVar, cVar), 1)), true, s.f21716x), s.f21717y, st.n.E));
        Iterator it = st.l.Y(st.l.a0(jVar, cVar), 1).iterator();
        while (true) {
            listO = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof f) {
                break;
            }
        }
        f fVar = (f) next;
        if (fVar != null && (m0VarV = fVar.v()) != null) {
            listO = m0VarV.o();
        }
        if (listO == null) {
            listO = mq.w.f16945a;
        }
        if (listD0.isEmpty() && listO.isEmpty()) {
            List listS2 = jVar.s();
            br.l.d(listS2, "declaredTypeParameters");
            return listS2;
        }
        ArrayList arrayListE0 = mq.o.E0(listD0, listO);
        ArrayList arrayList = new ArrayList(mq.p.a0(arrayListE0, 10));
        Iterator it2 = arrayListE0.iterator();
        while (it2.hasNext()) {
            r0 r0Var = (r0) it2.next();
            br.l.d(r0Var, "it");
            arrayList.add(new e(r0Var, jVar, listS.size()));
        }
        return mq.o.E0(listS, arrayList);
    }

    public static final f d(a0 a0Var, qs.b bVar) {
        br.l.e(a0Var, "<this>");
        br.l.e(bVar, "classId");
        i iVarE = e(a0Var, bVar);
        if (iVarE instanceof f) {
            return (f) iVarE;
        }
        return null;
    }

    public static final i e(a0 a0Var, qs.b bVar) {
        br.l.e(a0Var, "<this>");
        br.l.e(bVar, "classId");
        if (a0Var.A0(ts.o.f22974a) != null) {
            throw new ClassCastException();
        }
        qs.c cVarG = bVar.g();
        br.l.d(cVarG, "classId.packageFqName");
        j0 j0VarJ0 = a0Var.J0(cVarG);
        List listE = bVar.h().f21025a.e();
        at.j jVar = ((ur.x) j0VarJ0).D;
        Object objR0 = mq.o.r0(listE);
        br.l.d(objR0, "segments.first()");
        i iVarC = jVar.c((qs.g) objR0, zr.d.FROM_DESERIALIZATION);
        if (iVarC != null) {
            for (qs.g gVar : listE.subList(1, listE.size())) {
                if (iVarC instanceof f) {
                    at.n nVarZ0 = ((f) iVarC).z0();
                    br.l.d(gVar, "name");
                    i iVarC2 = nVarZ0.c(gVar, zr.d.FROM_DESERIALIZATION);
                    iVarC = iVarC2 instanceof f ? (f) iVarC2 : null;
                    if (iVarC != null) {
                    }
                }
            }
            return iVarC;
        }
        return null;
    }

    public static final f f(a0 a0Var, qs.b bVar, js.e eVar) {
        br.l.e(a0Var, "<this>");
        br.l.e(bVar, "classId");
        br.l.e(eVar, "notFoundClasses");
        f fVarD = d(a0Var, bVar);
        return fVarD != null ? fVarD : eVar.Y(bVar, st.l.d0(st.l.b0(st.l.a0(bVar, r.E), s.f21714g)));
    }

    public static final i g(l lVar) {
        l lVarO = lVar.o();
        if (lVarO == null || (lVar instanceof f0)) {
            return null;
        }
        if (!(lVarO.o() instanceof f0)) {
            return g(lVarO);
        }
        if (lVarO instanceof i) {
            return (i) lVarO;
        }
        return null;
    }

    public static final boolean h(i0 i0Var, qs.c cVar) {
        br.l.e(i0Var, "<this>");
        br.l.e(cVar, "fqName");
        return i0Var.a(cVar);
    }

    public static final ArrayList i(i0 i0Var, qs.c cVar) {
        br.l.e(i0Var, "<this>");
        br.l.e(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        b(i0Var, cVar, arrayList);
        return arrayList;
    }

    public static final f j(a0 a0Var, qs.c cVar, zr.b bVar) {
        i iVarC;
        at.n nVarZ0;
        br.l.e(a0Var, "<this>");
        br.l.e(cVar, "fqName");
        br.l.e(bVar, "lookupLocation");
        if (!cVar.d()) {
            at.j jVar = ((ur.x) a0Var.J0(cVar.e())).D;
            qs.g gVarF = cVar.f();
            br.l.d(gVarF, "fqName.shortName()");
            i iVarC2 = jVar.c(gVarF, bVar);
            f fVar = iVarC2 instanceof f ? (f) iVarC2 : null;
            if (fVar != null) {
                return fVar;
            }
            f fVarJ = j(a0Var, cVar.e(), bVar);
            if (fVarJ == null || (nVarZ0 = fVarJ.z0()) == null) {
                iVarC = null;
            } else {
                qs.g gVarF2 = cVar.f();
                br.l.d(gVarF2, "fqName.shortName()");
                iVarC = nVarZ0.c(gVarF2, bVar);
            }
            if (iVarC instanceof f) {
                return (f) iVarC;
            }
        }
        return null;
    }
}
