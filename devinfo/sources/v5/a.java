package v5;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements ck.f {

    /* renamed from: b, reason: collision with root package name */
    public static final i7.b f35856b = new i7.b();

    /* renamed from: a, reason: collision with root package name */
    public final r f35857a;

    public a(r rVar) {
        nk.k.e(rVar, "connectionWrapper");
        this.f35857a = rVar;
    }

    @Override // ck.h
    public final Object G(Object obj, mk.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // ck.h
    public final ck.h L(ck.g gVar) {
        return wd.b.C(this, gVar);
    }

    @Override // ck.h
    public final ck.f O(ck.g gVar) {
        return wd.b.p(this, gVar);
    }

    @Override // ck.f
    public final ck.g getKey() {
        return f35856b;
    }

    @Override // ck.h
    public final ck.h y(ck.h hVar) {
        return wd.b.O(this, hVar);
    }
}
