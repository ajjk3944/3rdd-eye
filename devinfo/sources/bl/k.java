package bl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k extends f {

    /* renamed from: e, reason: collision with root package name */
    public final ek.j f2307e;

    /* JADX WARN: Multi-variable type inference failed */
    public k(mk.f fVar, al.h hVar, ck.h hVar2, int i4, zk.a aVar) {
        super(hVar, hVar2, i4, aVar);
        this.f2307e = (ek.j) fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ek.j, mk.f] */
    @Override // bl.e
    public final e d(ck.h hVar, int i4, zk.a aVar) {
        return new k(this.f2307e, this.f2291d, hVar, i4, aVar);
    }

    @Override // bl.f
    public final Object f(al.i iVar, ck.c cVar) {
        Object objH = xk.x.h(new h(this, iVar, null), cVar);
        return objH == dk.a.f22275a ? objH : yj.u.f37649a;
    }
}
