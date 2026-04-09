package ds;

import ar.k;
import es.s;
import gt.g;
import gt.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import lq.f;
import mq.w;
import rr.i0;
import xr.y;

/* loaded from: classes.dex */
public final class d implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final cj.a f7474a;

    /* renamed from: b, reason: collision with root package name */
    public final gt.e f7475b;

    public d(a aVar) {
        this.f7474a = new cj.a(aVar, b.f7469d, new f());
        l lVar = (l) aVar.f7446a;
        lVar.getClass();
        this.f7475b = new gt.e(lVar, new ConcurrentHashMap(3, 1.0f, 2), new gt.f(), 0);
    }

    @Override // rr.i0
    public final boolean a(qs.c cVar) {
        br.l.e(cVar, "fqName");
        ((a) this.f7474a.f3974d).f7447b.getClass();
        return false;
    }

    @Override // rr.i0
    public final void b(qs.c cVar, ArrayList arrayList) {
        br.l.e(cVar, "fqName");
        arrayList.add(c(cVar));
    }

    public final s c(qs.c cVar) throws Throwable {
        ((a) this.f7474a.f3974d).f7447b.getClass();
        br.l.e(cVar, "fqName");
        ah.d dVar = new ah.d(this, 10, new y(cVar));
        gt.e eVar = this.f7475b;
        eVar.getClass();
        Object objA = eVar.a(new g(cVar, dVar));
        if (objA != null) {
            return (s) objA;
        }
        gt.e.e(3);
        throw null;
    }

    @Override // rr.i0
    public final Collection l(qs.c cVar, k kVar) {
        br.l.e(cVar, "fqName");
        List list = (List) c(cVar).H.c();
        return list == null ? w.f16945a : list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((a) this.f7474a.f3974d).f7458o;
    }
}
