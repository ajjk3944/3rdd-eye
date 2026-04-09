package at;

import as.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public final class j implements n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2295b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2296c;

    public j(n nVar) {
        this.f2296c = nVar;
    }

    @Override // at.p
    public Collection a(f fVar, ar.k kVar) {
        switch (this.f2295b) {
            case 1:
                br.l.e(fVar, "kindFilter");
                Collection collectionI = i(fVar, kVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionI) {
                    if (((rr.l) obj) instanceof rr.b) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return mq.o.E0(ts.o.o(arrayList, k.f2298r), arrayList2);
            default:
                return i(fVar, kVar);
        }
    }

    @Override // at.n
    public Collection b(qs.g gVar, zr.b bVar) {
        switch (this.f2295b) {
            case 1:
                br.l.e(gVar, "name");
                br.l.e(bVar, "location");
                return ts.o.o(k(gVar, bVar), k.f2300y);
            default:
                return k(gVar, bVar);
        }
    }

    @Override // at.p
    public final rr.i c(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        return l().c(gVar, bVar);
    }

    @Override // at.n
    public final Set d() {
        return l().d();
    }

    @Override // at.n
    public final Set e() {
        return l().e();
    }

    @Override // at.n
    public Collection f(qs.g gVar, zr.b bVar) {
        switch (this.f2295b) {
            case 1:
                br.l.e(gVar, "name");
                br.l.e(bVar, "location");
                return ts.o.o(j(gVar, bVar), k.f2299x);
            default:
                return j(gVar, bVar);
        }
    }

    @Override // at.n
    public final Set g() {
        return l().g();
    }

    public final n h() {
        if (!(l() instanceof j)) {
            return l();
        }
        n nVarL = l();
        br.l.c(nVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((j) nVarL).h();
    }

    public final Collection i(f fVar, ar.k kVar) {
        br.l.e(fVar, "kindFilter");
        return l().a(fVar, kVar);
    }

    public final Collection j(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        return l().f(gVar, bVar);
    }

    public final Collection k(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        return l().b(gVar, bVar);
    }

    public final n l() {
        switch (this.f2295b) {
            case 0:
                return (n) ((gt.i) this.f2296c).c();
            default:
                return (n) this.f2296c;
        }
    }

    public j(gt.o oVar, ar.a aVar) {
        br.l.e(oVar, "storageManager");
        this.f2296c = new gt.i((gt.l) oVar, new x(2, aVar));
    }
}
