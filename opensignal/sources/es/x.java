package es;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class x extends h0 {

    /* renamed from: n, reason: collision with root package name */
    public final xr.y f8337n;

    /* renamed from: o, reason: collision with root package name */
    public final s f8338o;

    /* renamed from: p, reason: collision with root package name */
    public final gt.h f8339p;

    /* renamed from: q, reason: collision with root package name */
    public final gt.j f8340q;

    public x(cj.a aVar, xr.y yVar, s sVar) {
        super(aVar, null);
        this.f8337n = yVar;
        this.f8338o = sVar;
        gt.o oVar = ((ds.a) aVar.f3974d).f7446a;
        ah.d dVar = new ah.d(aVar, 13, this);
        gt.l lVar = (gt.l) oVar;
        lVar.getClass();
        this.f8339p = new gt.h(lVar, dVar);
        this.f8340q = ((gt.l) oVar).c(new c7.b(this, 5, aVar));
    }

    public static final ps.f v(x xVar) {
        br.l.e(((ds.a) xVar.f8271b.f3974d).f7449d.c().f7495c, "<this>");
        return ps.f.f20634g;
    }

    @Override // es.c0, at.o, at.p
    public final Collection a(at.f fVar, ar.k kVar) {
        br.l.e(fVar, "kindFilter");
        if (!fVar.a(at.f.f2279l | at.f.f2274e)) {
            return mq.w.f16945a;
        }
        Iterable iterable = (Iterable) this.f8273d.c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            rr.l lVar = (rr.l) obj;
            if (lVar instanceof rr.f) {
                qs.g name = ((rr.f) lVar).getName();
                br.l.d(name, "it.name");
                if (((Boolean) kVar.a(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // es.c0, at.o, at.n
    public final Collection b(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        return mq.w.f16945a;
    }

    @Override // at.o, at.p
    public final rr.i c(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        return w(gVar, null);
    }

    @Override // es.c0
    public final Set h(at.f fVar, ar.k kVar) {
        br.l.e(fVar, "kindFilter");
        if (!fVar.a(at.f.f2274e)) {
            return mq.y.f16947a;
        }
        Set set = (Set) this.f8339p.c();
        if (set == null) {
            this.f8337n.getClass();
            return new LinkedHashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(qs.g.e((String) it.next()));
        }
        return hashSet;
    }

    @Override // es.c0
    public final Set i(at.f fVar, at.k kVar) {
        br.l.e(fVar, "kindFilter");
        return mq.y.f16947a;
    }

    @Override // es.c0
    public final c k() {
        return b.f8265a;
    }

    @Override // es.c0
    public final void m(LinkedHashSet linkedHashSet, qs.g gVar) {
        br.l.e(gVar, "name");
    }

    @Override // es.c0
    public final Set o(at.f fVar) {
        br.l.e(fVar, "kindFilter");
        return mq.y.f16947a;
    }

    @Override // es.c0
    public final rr.l q() {
        return this.f8338o;
    }

    public final rr.f w(qs.g gVar, xr.o oVar) {
        qs.g gVar2 = qs.i.f21038a;
        br.l.e(gVar, "name");
        String strB = gVar.b();
        br.l.d(strB, "name.asString()");
        if (strB.length() <= 0 || gVar.f21036d) {
            return null;
        }
        Set set = (Set) this.f8339p.c();
        if (oVar == null && set != null && !set.contains(gVar.b())) {
            return null;
        }
        return (rr.f) this.f8340q.a(new t(gVar, oVar));
    }
}
