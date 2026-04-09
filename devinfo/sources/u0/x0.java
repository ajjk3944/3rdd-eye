package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f35018a;

    public x0(String str) {
        this.f35018a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && nk.k.a(this.f35018a, ((x0) obj).f35018a);
    }

    public final int hashCode() {
        return this.f35018a.hashCode();
    }

    public final String toString() {
        return r5.c.l(new StringBuilder("OpaqueKey(key="), this.f35018a, ')');
    }
}
