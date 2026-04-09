package at;

import as.x;
import ht.s0;
import ht.x0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import rr.q0;

/* loaded from: classes.dex */
public final class s implements n {

    /* renamed from: b, reason: collision with root package name */
    public final n f2311b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f2312c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f2313d;

    /* renamed from: e, reason: collision with root package name */
    public final lq.q f2314e;

    public s(n nVar, x0 x0Var) {
        br.l.e(nVar, "workerScope");
        br.l.e(x0Var, "givenSubstitutor");
        this.f2311b = nVar;
        kc.f.F(new x(4, x0Var));
        s0 s0VarF = x0Var.f();
        br.l.d(s0VarF, "givenSubstitutor.substitution");
        this.f2312c = new x0(ba.m.U(s0VarF));
        this.f2314e = kc.f.F(new x(3, this));
    }

    @Override // at.p
    public final Collection a(f fVar, ar.k kVar) {
        br.l.e(fVar, "kindFilter");
        return (Collection) this.f2314e.getValue();
    }

    @Override // at.n
    public final Collection b(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        return h(this.f2311b.b(gVar, bVar));
    }

    @Override // at.p
    public final rr.i c(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        rr.i iVarC = this.f2311b.c(gVar, bVar);
        if (iVarC != null) {
            return (rr.i) i(iVarC);
        }
        return null;
    }

    @Override // at.n
    public final Set d() {
        return this.f2311b.d();
    }

    @Override // at.n
    public final Set e() {
        return this.f2311b.e();
    }

    @Override // at.n
    public final Collection f(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        return h(this.f2311b.f(gVar, bVar));
    }

    @Override // at.n
    public final Set g() {
        return this.f2311b.g();
    }

    public final Collection h(Collection collection) {
        if (this.f2312c.f10955a.e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(i((rr.l) it.next()));
        }
        return linkedHashSet;
    }

    public final rr.l i(rr.l lVar) {
        x0 x0Var = this.f2312c;
        if (x0Var.f10955a.e()) {
            return lVar;
        }
        if (this.f2313d == null) {
            this.f2313d = new HashMap();
        }
        HashMap map = this.f2313d;
        br.l.b(map);
        Object objE = map.get(lVar);
        if (objE == null) {
            if (!(lVar instanceof q0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + lVar).toString());
            }
            objE = ((q0) lVar).e(x0Var);
            if (objE == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + lVar + " substitution fails");
            }
            map.put(lVar, objE);
        }
        return (rr.l) objE;
    }
}
