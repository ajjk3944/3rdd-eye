package ck;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final g f2894a;

    public a(g gVar) {
        this.f2894a = gVar;
    }

    @Override // ck.h
    public final Object G(Object obj, mk.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // ck.h
    public /* bridge */ h L(g gVar) {
        return wd.b.C(this, gVar);
    }

    @Override // ck.h
    public /* bridge */ f O(g gVar) {
        return wd.b.p(this, gVar);
    }

    @Override // ck.f
    public final g getKey() {
        return this.f2894a;
    }

    @Override // ck.h
    public final /* bridge */ h y(h hVar) {
        return wd.b.O(this, hVar);
    }
}
