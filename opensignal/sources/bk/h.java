package bk;

/* loaded from: classes.dex */
public final class h extends dr.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2815a;

    public h(int i10) {
        this.f2815a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f2815a == ((h) obj).f2815a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2815a);
    }

    public final String toString() {
        return c7.a.q(new StringBuilder("EndpointError(responseCode="), this.f2815a, ')');
    }
}
