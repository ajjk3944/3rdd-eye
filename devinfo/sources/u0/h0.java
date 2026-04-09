package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h0 implements q2 {

    /* renamed from: a, reason: collision with root package name */
    public final d1 f34821a;

    public h0(d1 d1Var) {
        this.f34821a = d1Var;
    }

    @Override // u0.q2
    public final Object a(i1 i1Var) {
        return this.f34821a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && this.f34821a.equals(((h0) obj).f34821a);
    }

    public final int hashCode() {
        return this.f34821a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f34821a + ')';
    }
}
