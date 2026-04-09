package v2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f35774a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f35774a == ((i) obj).f35774a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f35774a;
    }

    public final String toString() {
        int i4 = this.f35774a;
        return i4 == 0 ? "Normal" : i4 == 1 ? "Italic" : "Invalid";
    }
}
