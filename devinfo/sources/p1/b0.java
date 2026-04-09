package p1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f30948a;

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            return this.f30948a == ((b0) obj).f30948a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30948a;
    }

    public final String toString() {
        int i4 = this.f30948a;
        return i4 == 0 ? "Argb8888" : i4 == 1 ? "Alpha8" : i4 == 2 ? "Rgb565" : i4 == 3 ? "F16" : i4 == 4 ? "Gpu" : "Unknown";
    }
}
