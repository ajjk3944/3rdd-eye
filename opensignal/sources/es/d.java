package es;

import com.google.android.gms.internal.measurement.y3;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d implements at.n {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ir.v[] f8280f;

    /* renamed from: b, reason: collision with root package name */
    public final cj.a f8281b;

    /* renamed from: c, reason: collision with root package name */
    public final s f8282c;

    /* renamed from: d, reason: collision with root package name */
    public final x f8283d;

    /* renamed from: e, reason: collision with root package name */
    public final gt.i f8284e;

    static {
        br.y yVar = br.x.f2918a;
        f8280f = new ir.v[]{yVar.f(new br.q(yVar.b(d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    }

    public d(cj.a aVar, xr.y yVar, s sVar) {
        this.f8281b = aVar;
        this.f8282c = sVar;
        this.f8283d = new x(aVar, yVar, sVar);
        gt.o oVar = ((ds.a) aVar.f3974d).f7446a;
        as.x xVar = new as.x(19, this);
        gt.l lVar = (gt.l) oVar;
        lVar.getClass();
        this.f8284e = new gt.i(lVar, xVar);
    }

    @Override // at.p
    public final Collection a(at.f fVar, ar.k kVar) {
        br.l.e(fVar, "kindFilter");
        at.n[] nVarArrH = h();
        Collection collectionA = this.f8283d.a(fVar, kVar);
        for (at.n nVar : nVarArrH) {
            collectionA = y3.h(collectionA, nVar.a(fVar, kVar));
        }
        return collectionA == null ? mq.y.f16947a : collectionA;
    }

    @Override // at.n
    public final Collection b(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        i(gVar, bVar);
        at.n[] nVarArrH = h();
        this.f8283d.b(gVar, bVar);
        Collection collectionH = mq.w.f16945a;
        for (at.n nVar : nVarArrH) {
            collectionH = y3.h(collectionH, nVar.b(gVar, bVar));
        }
        return collectionH == null ? mq.y.f16947a : collectionH;
    }

    @Override // at.p
    public final rr.i c(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        i(gVar, bVar);
        x xVar = this.f8283d;
        xVar.getClass();
        rr.i iVar = null;
        rr.f fVarW = xVar.w(gVar, null);
        if (fVarW != null) {
            return fVarW;
        }
        for (at.n nVar : h()) {
            rr.i iVarC = nVar.c(gVar, bVar);
            if (iVarC != null) {
                if (!(iVarC instanceof rr.j) || !((rr.j) iVarC).M()) {
                    return iVarC;
                }
                if (iVar == null) {
                    iVar = iVarC;
                }
            }
        }
        return iVar;
    }

    @Override // at.n
    public final Set d() {
        at.n[] nVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (at.n nVar : nVarArrH) {
            mq.t.d0(linkedHashSet, nVar.d());
        }
        linkedHashSet.addAll(this.f8283d.d());
        return linkedHashSet;
    }

    @Override // at.n
    public final Set e() {
        at.n[] nVarArrH = h();
        br.l.e(nVarArrH, "<this>");
        HashSet hashSetO = dr.a.o(nVarArrH.length == 0 ? mq.w.f16945a : new iu.g(1, nVarArrH));
        if (hashSetO == null) {
            return null;
        }
        hashSetO.addAll(this.f8283d.e());
        return hashSetO;
    }

    @Override // at.n
    public final Collection f(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        i(gVar, bVar);
        at.n[] nVarArrH = h();
        Collection collectionF = this.f8283d.f(gVar, bVar);
        for (at.n nVar : nVarArrH) {
            collectionF = y3.h(collectionF, nVar.f(gVar, bVar));
        }
        return collectionF == null ? mq.y.f16947a : collectionF;
    }

    @Override // at.n
    public final Set g() {
        at.n[] nVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (at.n nVar : nVarArrH) {
            mq.t.d0(linkedHashSet, nVar.g());
        }
        linkedHashSet.addAll(this.f8283d.g());
        return linkedHashSet;
    }

    public final at.n[] h() {
        return (at.n[]) io.sentry.config.a.Z(this.f8284e, f8280f[0]);
    }

    public final void i(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        xu.d.b0(((ds.a) this.f8281b.f3974d).f7457n, bVar, this.f8282c, gVar);
    }

    public final String toString() {
        return "scope for " + this.f8282c;
    }
}
