package c3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f2713a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f2713a == ((g) obj).f2713a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2713a;
    }

    public final String toString() {
        int i4 = this.f2713a;
        return i4 == 0 ? "LineHeightStyle.Mode.Fixed" : i4 == 1 ? "LineHeightStyle.Mode.Minimum" : i4 == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
