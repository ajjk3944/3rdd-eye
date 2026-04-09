package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b0 implements q2 {

    /* renamed from: a, reason: collision with root package name */
    public final mk.c f34741a;

    public b0(mk.c cVar) {
        this.f34741a = cVar;
    }

    @Override // u0.q2
    public final Object a(i1 i1Var) {
        return this.f34741a.invoke(i1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && nk.k.a(this.f34741a, ((b0) obj).f34741a);
    }

    public final int hashCode() {
        return this.f34741a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f34741a + ')';
    }
}
