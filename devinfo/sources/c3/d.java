package c3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f2706a;

    public static String a(int i4) {
        return i4 == 1 ? "Hyphens.None" : i4 == 2 ? "Hyphens.Auto" : i4 == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f2706a == ((d) obj).f2706a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2706a;
    }

    public final String toString() {
        return a(this.f2706a);
    }
}
