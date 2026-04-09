package j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class d1 extends i2.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f26885a;

    public d1(m0 m0Var) {
        this.f26885a = m0Var;
    }

    @Override // i2.v0
    public final i1.m d() {
        e1 e1Var = new e1();
        e1Var.f26890o = this.f26885a;
        return e1Var;
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        ((e1) mVar).f26890o = this.f26885a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && nk.k.a(this.f26885a, ((d1) obj).f26885a);
    }

    public final int hashCode() {
        return this.f26885a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f26885a + ')';
    }
}
