package ur;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import n0.d1;

/* loaded from: classes.dex */
public final class q extends at.o {

    /* renamed from: b, reason: collision with root package name */
    public final gt.e f23661b;

    /* renamed from: c, reason: collision with root package name */
    public final gt.e f23662c;

    /* renamed from: d, reason: collision with root package name */
    public final gt.i f23663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f23664e;

    public q(r rVar, gt.o oVar) {
        if (oVar == null) {
            h(0);
            throw null;
        }
        this.f23664e = rVar;
        gt.l lVar = (gt.l) oVar;
        this.f23661b = lVar.b(new p(this, 0));
        this.f23662c = lVar.b(new p(this, 1));
        this.f23663d = new gt.i(lVar, new d1(2, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void h(int r13) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ur.q.h(int):void");
    }

    @Override // at.o, at.p
    public final Collection a(at.f fVar, ar.k kVar) {
        if (fVar == null) {
            h(13);
            throw null;
        }
        Collection collection = (Collection) this.f23663d.c();
        if (collection != null) {
            return collection;
        }
        h(15);
        throw null;
    }

    @Override // at.o, at.n
    public final Collection b(qs.g gVar, zr.b bVar) {
        if (gVar == null) {
            h(1);
            throw null;
        }
        if (bVar != null) {
            return (Collection) this.f23662c.a(gVar);
        }
        h(2);
        throw null;
    }

    @Override // at.o, at.n
    public final Set d() {
        Set set = (Set) this.f23664e.E.c();
        if (set != null) {
            return set;
        }
        h(17);
        throw null;
    }

    @Override // at.o, at.n
    public final Set e() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        h(18);
        throw null;
    }

    @Override // at.o, at.n
    public final Collection f(qs.g gVar, zr.b bVar) {
        if (gVar == null) {
            h(5);
            throw null;
        }
        if (bVar != null) {
            return (Collection) this.f23661b.a(gVar);
        }
        h(6);
        throw null;
    }

    @Override // at.o, at.n
    public final Set g() {
        Set set = (Set) this.f23664e.E.c();
        if (set != null) {
            return set;
        }
        h(19);
        throw null;
    }

    public final at.n i() {
        at.n nVarW = ((ht.x) ((ht.h) this.f23664e.v()).q().iterator().next()).W();
        if (nVarW != null) {
            return nVarW;
        }
        h(9);
        throw null;
    }

    public final LinkedHashSet j(qs.g gVar, Collection collection) {
        if (gVar == null) {
            h(10);
            throw null;
        }
        if (collection == null) {
            h(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ts.n.f22971c.h(gVar, collection, Collections.EMPTY_SET, this.f23664e, new ft.f(linkedHashSet, 1));
        return linkedHashSet;
    }
}
