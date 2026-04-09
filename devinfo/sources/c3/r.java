package c3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f2734a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f2734a == ((r) obj).f2734a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2734a;
    }

    public final String toString() {
        int i4 = this.f2734a;
        return i4 == 1 ? "Linearity.Linear" : i4 == 2 ? "Linearity.FontHinting" : i4 == 3 ? "Linearity.None" : "Invalid";
    }
}
