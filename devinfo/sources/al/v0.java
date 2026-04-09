package al;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v0 implements g1, h, bl.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f626a;

    public v0(i1 i1Var) {
        this.f626a = i1Var;
    }

    @Override // al.h
    public final Object a(i iVar, ck.c cVar) {
        this.f626a.a(iVar, cVar);
        return dk.a.f22275a;
    }

    @Override // bl.s
    public final h b(ck.h hVar, int i4, zk.a aVar) {
        return ((((i4 < 0 || i4 >= 2) && i4 != -2) || aVar != zk.a.f38323b) && !((i4 == 0 || i4 == -3) && aVar == zk.a.f38322a)) ? new bl.g(this, hVar, i4, aVar) : this;
    }

    @Override // al.g1
    public final Object getValue() {
        return this.f626a.getValue();
    }
}
