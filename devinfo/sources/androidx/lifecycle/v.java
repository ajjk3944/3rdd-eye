package androidx.lifecycle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v implements y, xk.v {

    /* renamed from: a, reason: collision with root package name */
    public final t f1192a;

    /* renamed from: b, reason: collision with root package name */
    public final ck.h f1193b;

    public v(t tVar, ck.h hVar) {
        nk.k.e(hVar, "coroutineContext");
        this.f1192a = tVar;
        this.f1193b = hVar;
        if (((c0) tVar).f1110d == s.f1180a) {
            xk.x.f(hVar, null);
        }
    }

    @Override // xk.v
    public final ck.h A() {
        return this.f1193b;
    }

    @Override // androidx.lifecycle.y
    public final void g(a0 a0Var, r rVar) {
        t tVar = this.f1192a;
        if (((c0) tVar).f1110d.compareTo(s.f1180a) <= 0) {
            tVar.b(this);
            xk.x.f(this.f1193b, null);
        }
    }
}
