package v2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f35775a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f35775a == ((j) obj).f35775a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f35775a;
    }

    public final String toString() {
        int i4 = this.f35775a;
        return i4 == 0 ? "None" : i4 == 1 ? "Weight" : i4 == 2 ? "Style" : i4 == 65535 ? "All" : "Invalid";
    }
}
