package c3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f2722a;

    public static String a(int i4) {
        return i4 == 1 ? "Left" : i4 == 2 ? "Right" : i4 == 3 ? "Center" : i4 == 4 ? "Justify" : i4 == 5 ? "Start" : i4 == 6 ? "End" : i4 == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f2722a == ((k) obj).f2722a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2722a;
    }

    public final String toString() {
        return a(this.f2722a);
    }
}
