package es;

import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class z extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8345d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0 f8346g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(c0 c0Var, int i10) {
        super(0);
        this.f8345d = i10;
        this.f8346g = c0Var;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f8345d) {
            case 0:
                at.f fVar = at.f.f2280m;
                at.n.f2304a.getClass();
                at.k kVar = at.k.f2297g;
                br.l.e(fVar, "kindFilter");
                List list = fVar.f2287a;
                zr.d dVar = zr.d.WHEN_GET_ALL_DESCRIPTORS;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                boolean zA = fVar.a(at.f.f2279l);
                c0 c0Var = this.f8346g;
                if (zA) {
                    for (qs.g gVar : c0Var.h(fVar, kVar)) {
                        kVar.a(gVar);
                        rt.k.a(linkedHashSet, c0Var.c(gVar, dVar));
                    }
                }
                if (fVar.a(at.f.f2278i) && !list.contains(at.b.f2267a)) {
                    for (qs.g gVar2 : c0Var.i(fVar, kVar)) {
                        kVar.a(gVar2);
                        linkedHashSet.addAll(c0Var.f(gVar2, dVar));
                    }
                }
                if (fVar.a(at.f.j) && !list.contains(at.b.f2267a)) {
                    for (qs.g gVar3 : c0Var.o(fVar)) {
                        kVar.a(gVar3);
                        linkedHashSet.addAll(c0Var.b(gVar3, dVar));
                    }
                }
                return mq.o.Q0(linkedHashSet);
            case 1:
                return this.f8346g.h(at.f.f2282o, null);
            case 2:
                return this.f8346g.k();
            case 3:
                return this.f8346g.i(at.f.f2283p, null);
            case 4:
                return this.f8346g.o(at.f.f2284q);
            default:
                ((ds.a) this.f8346g.f8271b.f3974d).f7453h.getClass();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c0 c0Var, xr.u uVar, cs.h hVar) {
        super(0);
        this.f8345d = 5;
        this.f8346g = c0Var;
    }
}
