package cl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w implements ck.f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2944a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f2945b;

    /* renamed from: c, reason: collision with root package name */
    public final x f2946c;

    public w(v5.r rVar, ThreadLocal threadLocal) {
        this.f2944a = rVar;
        this.f2945b = threadLocal;
        this.f2946c = new x(threadLocal);
    }

    @Override // ck.h
    public final Object G(Object obj, mk.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // ck.h
    public final ck.h L(ck.g gVar) {
        return this.f2946c.equals(gVar) ? ck.i.f2898a : this;
    }

    @Override // ck.h
    public final ck.f O(ck.g gVar) {
        if (this.f2946c.equals(gVar)) {
            return this;
        }
        return null;
    }

    public final void a(Object obj) {
        this.f2945b.set(obj);
    }

    public final Object b(ck.h hVar) {
        ThreadLocal threadLocal = this.f2945b;
        Object obj = threadLocal.get();
        threadLocal.set(this.f2944a);
        return obj;
    }

    @Override // ck.f
    public final ck.g getKey() {
        return this.f2946c;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f2944a + ", threadLocal = " + this.f2945b + ')';
    }

    @Override // ck.h
    public final ck.h y(ck.h hVar) {
        return wd.b.O(this, hVar);
    }
}
