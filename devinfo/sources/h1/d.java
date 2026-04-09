package h1;

import ec.x;
import java.util.List;
import u0.p;
import v0.k0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements k0, ck.f {

    /* renamed from: b, reason: collision with root package name */
    public static final x f24803b = new x(28);

    /* renamed from: a, reason: collision with root package name */
    public final p f24804a;

    public d(p pVar) {
        this.f24804a = pVar;
    }

    @Override // ck.h
    public final Object G(Object obj, mk.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // ck.h
    public final /* bridge */ ck.h L(ck.g gVar) {
        return wd.b.C(this, gVar);
    }

    @Override // ck.h
    public final /* bridge */ ck.f O(ck.g gVar) {
        return wd.b.p(this, gVar);
    }

    @Override // v0.k0
    public final List a(Integer num) {
        return this.f24804a.E();
    }

    @Override // ck.f
    public final ck.g getKey() {
        return f24803b;
    }

    @Override // ck.h
    public final /* bridge */ ck.h y(ck.h hVar) {
        return wd.b.O(this, hVar);
    }
}
