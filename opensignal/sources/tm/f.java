package tm;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f22899a;

    public f(int i10) {
        this.f22899a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f22899a == ((f) obj).f22899a;
    }

    public final int hashCode() {
        return c7.a.C(-1, Integer.hashCode(this.f22899a) * 31, 961);
    }

    public final String toString() {
        return h0.b.i(this.f22899a, ", networkSimId=-1, name=, nameSim=)", new StringBuilder("NetworkInfoQueryParams(networkId="));
    }
}
