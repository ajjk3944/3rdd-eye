package ft;

import br.x;
import br.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class q extends at.o {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ir.v[] f9104f;

    /* renamed from: b, reason: collision with root package name */
    public final al.b f9105b;

    /* renamed from: c, reason: collision with root package name */
    public final o f9106c;

    /* renamed from: d, reason: collision with root package name */
    public final gt.i f9107d;

    /* renamed from: e, reason: collision with root package name */
    public final gt.h f9108e;

    static {
        y yVar = x.f2918a;
        f9104f = new ir.v[]{yVar.f(new br.q(yVar.b(q.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), yVar.f(new br.q(yVar.b(q.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    public q(al.b bVar, List list, List list2, List list3, ar.a aVar) {
        br.l.e(bVar, "c");
        br.l.e(list, "functionList");
        br.l.e(list2, "propertyList");
        br.l.e(list3, "typeAliasList");
        this.f9105b = bVar;
        dt.k kVar = (dt.k) bVar.f810b;
        kVar.f7495c.getClass();
        this.f9106c = new o(this, list, list2, list3);
        gt.l lVar = kVar.f7493a;
        p pVar = new p(aVar, 0);
        lVar.getClass();
        this.f9107d = new gt.i(lVar, pVar);
        as.x xVar = new as.x(24, this);
        lVar.getClass();
        this.f9108e = new gt.h(lVar, xVar);
    }

    @Override // at.o, at.n
    public Collection b(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        return this.f9106c.b(gVar, bVar);
    }

    @Override // at.o, at.p
    public rr.i c(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        if (q(gVar)) {
            return ((dt.k) this.f9105b.f810b).b(l(gVar));
        }
        o oVar = this.f9106c;
        if (!oVar.f9095c.keySet().contains(gVar)) {
            return null;
        }
        oVar.getClass();
        return (u) oVar.f9098f.a(gVar);
    }

    @Override // at.o, at.n
    public final Set d() {
        return (Set) io.sentry.config.a.Z(this.f9106c.f9099g, o.j[0]);
    }

    @Override // at.o, at.n
    public final Set e() {
        ir.v vVar = f9104f[1];
        gt.h hVar = this.f9108e;
        br.l.e(hVar, "<this>");
        br.l.e(vVar, "p");
        return (Set) hVar.c();
    }

    @Override // at.o, at.n
    public Collection f(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        return this.f9106c.a(gVar, bVar);
    }

    @Override // at.o, at.n
    public final Set g() {
        return (Set) io.sentry.config.a.Z(this.f9106c.f9100h, o.j[1]);
    }

    public abstract void h(ArrayList arrayList, ar.k kVar);

    public final List i(at.f fVar, ar.k kVar, zr.d dVar) {
        br.l.e(fVar, "kindFilter");
        br.l.e(dVar, "location");
        ArrayList arrayList = new ArrayList(0);
        if (fVar.a(at.f.f2275f)) {
            h(arrayList, kVar);
        }
        o oVar = this.f9106c;
        oVar.getClass();
        boolean zA = fVar.a(at.f.j);
        ts.i iVar = ts.i.f22962d;
        if (zA) {
            Set<qs.g> set = (Set) io.sentry.config.a.Z(oVar.f9100h, o.j[1]);
            ArrayList arrayList2 = new ArrayList();
            for (qs.g gVar : set) {
                if (((Boolean) kVar.a(gVar)).booleanValue()) {
                    arrayList2.addAll(oVar.b(gVar, dVar));
                }
            }
            mq.s.c0(arrayList2, iVar);
            arrayList.addAll(arrayList2);
        }
        if (fVar.a(at.f.f2278i)) {
            Set<qs.g> set2 = (Set) io.sentry.config.a.Z(oVar.f9099g, o.j[0]);
            ArrayList arrayList3 = new ArrayList();
            for (qs.g gVar2 : set2) {
                if (((Boolean) kVar.a(gVar2)).booleanValue()) {
                    arrayList3.addAll(oVar.a(gVar2, dVar));
                }
            }
            mq.s.c0(arrayList3, iVar);
            arrayList.addAll(arrayList3);
        }
        if (fVar.a(at.f.f2279l)) {
            for (qs.g gVar3 : m()) {
                if (((Boolean) kVar.a(gVar3)).booleanValue()) {
                    rt.k.a(arrayList, ((dt.k) this.f9105b.f810b).b(l(gVar3)));
                }
            }
        }
        if (fVar.a(at.f.f2276g)) {
            for (Object obj : oVar.f9095c.keySet()) {
                if (((Boolean) kVar.a(obj)).booleanValue()) {
                    oVar.getClass();
                    br.l.e(obj, "name");
                    rt.k.a(arrayList, (u) oVar.f9098f.a(obj));
                }
            }
        }
        return rt.k.d(arrayList);
    }

    public void j(ArrayList arrayList, qs.g gVar) {
        br.l.e(gVar, "name");
    }

    public void k(ArrayList arrayList, qs.g gVar) {
        br.l.e(gVar, "name");
    }

    public abstract qs.b l(qs.g gVar);

    public final Set m() {
        return (Set) io.sentry.config.a.Z(this.f9107d, f9104f[0]);
    }

    public abstract Set n();

    public abstract Set o();

    public abstract Set p();

    public boolean q(qs.g gVar) {
        br.l.e(gVar, "name");
        return m().contains(gVar);
    }

    public boolean r(t tVar) {
        return true;
    }
}
