package ft;

import ht.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class g extends q {

    /* renamed from: g, reason: collision with root package name */
    public final jt.f f9081g;

    /* renamed from: h, reason: collision with root package name */
    public final gt.i f9082h;

    /* renamed from: i, reason: collision with root package name */
    public final gt.i f9083i;
    public final /* synthetic */ i j;

    public g(i iVar, jt.f fVar) {
        br.l.e(fVar, "kotlinTypeRefiner");
        this.j = iVar;
        al.b bVar = iVar.H;
        ls.j jVar = iVar.f9086x;
        List list = jVar.M;
        br.l.d(list, "classProto.functionList");
        List list2 = jVar.N;
        br.l.d(list2, "classProto.propertyList");
        List list3 = jVar.O;
        br.l.d(list3, "classProto.typeAliasList");
        List list4 = jVar.G;
        br.l.d(list4, "classProto.nestedClassNameList");
        ns.f fVar2 = (ns.f) iVar.H.f811c;
        ArrayList arrayList = new ArrayList(mq.p.a0(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(io.sentry.config.a.Y(fVar2, ((Number) it.next()).intValue()));
        }
        super(bVar, list, list2, list3, new d(0, arrayList));
        dt.k kVar = (dt.k) bVar.f810b;
        this.f9081g = fVar;
        gt.l lVar = kVar.f7493a;
        e eVar = new e(this, 0);
        lVar.getClass();
        this.f9082h = new gt.i(lVar, eVar);
        gt.l lVar2 = kVar.f7493a;
        e eVar2 = new e(this, 1);
        lVar2.getClass();
        this.f9083i = new gt.i(lVar2, eVar2);
    }

    @Override // at.o, at.p
    public final Collection a(at.f fVar, ar.k kVar) {
        br.l.e(fVar, "kindFilter");
        return (Collection) this.f9082h.c();
    }

    @Override // ft.q, at.o, at.n
    public final Collection b(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        s(gVar, bVar);
        return super.b(gVar, bVar);
    }

    @Override // ft.q, at.o, at.p
    public final rr.i c(qs.g gVar, zr.b bVar) {
        rr.f fVar;
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        s(gVar, bVar);
        kg.r rVar = this.j.L;
        return (rVar == null || (fVar = (rr.f) ((gt.j) rVar.f14396d).a(gVar)) == null) ? super.c(gVar, bVar) : fVar;
    }

    @Override // ft.q, at.o, at.n
    public final Collection f(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        s(gVar, bVar);
        return super.f(gVar, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [mq.w] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // ft.q
    public final void h(ArrayList arrayList, ar.k kVar) {
        ?? arrayList2;
        kg.r rVar = this.j.L;
        if (rVar != null) {
            Set<qs.g> setKeySet = ((LinkedHashMap) rVar.f14395a).keySet();
            arrayList2 = new ArrayList();
            for (qs.g gVar : setKeySet) {
                br.l.e(gVar, "name");
                rr.f fVar = (rr.f) ((gt.j) rVar.f14396d).a(gVar);
                if (fVar != null) {
                    arrayList2.add(fVar);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = mq.w.f16945a;
        }
        arrayList.addAll(arrayList2);
    }

    @Override // ft.q
    public final void j(ArrayList arrayList, qs.g gVar) {
        br.l.e(gVar, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f9083i.c()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((x) it.next()).W().f(gVar, zr.d.FOR_ALREADY_TRACKED));
        }
        al.b bVar = this.f9105b;
        arrayList.addAll(((dt.k) bVar.f810b).f7504n.a(gVar, this.j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((jt.l) ((dt.k) bVar.f810b).f7507q).f13859d.h(gVar, arrayList2, arrayList3, this.j, new f(arrayList, 0));
    }

    @Override // ft.q
    public final void k(ArrayList arrayList, qs.g gVar) {
        br.l.e(gVar, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f9083i.c()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((x) it.next()).W().b(gVar, zr.d.FOR_ALREADY_TRACKED));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((jt.l) ((dt.k) this.f9105b.f810b).f7507q).f13859d.h(gVar, arrayList2, arrayList3, this.j, new f(arrayList, 0));
    }

    @Override // ft.q
    public final qs.b l(qs.g gVar) {
        br.l.e(gVar, "name");
        return this.j.D.d(gVar);
    }

    @Override // ft.q
    public final Set n() {
        List listQ = this.j.J.q();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            Set setE = ((x) it.next()).W().e();
            if (setE == null) {
                return null;
            }
            mq.t.d0(linkedHashSet, setE);
        }
        return linkedHashSet;
    }

    @Override // ft.q
    public final Set o() {
        i iVar = this.j;
        List listQ = iVar.J.q();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            mq.t.d0(linkedHashSet, ((x) it.next()).W().d());
        }
        linkedHashSet.addAll(((dt.k) this.f9105b.f810b).f7504n.e(iVar));
        return linkedHashSet;
    }

    @Override // ft.q
    public final Set p() {
        List listQ = this.j.J.q();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            mq.t.d0(linkedHashSet, ((x) it.next()).W().g());
        }
        return linkedHashSet;
    }

    @Override // ft.q
    public final boolean r(t tVar) {
        return ((dt.k) this.f9105b.f810b).f7505o.b(this.j, tVar);
    }

    public final void s(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        xu.d.a0(((dt.k) this.f9105b.f810b).f7501i, bVar, this.j, gVar);
    }
}
