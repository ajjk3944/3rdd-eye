package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p2 implements q2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f34931a;

    public p2(Object obj) {
        this.f34931a = obj;
    }

    @Override // u0.q2
    public final Object a(i1 i1Var) {
        return this.f34931a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p2) && nk.k.a(this.f34931a, ((p2) obj).f34931a);
    }

    public final int hashCode() {
        Object obj = this.f34931a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f34931a + ')';
    }
}
