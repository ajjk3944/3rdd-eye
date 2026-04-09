package c3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f2714a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f2714a == ((h) obj).f2714a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2714a;
    }

    public final String toString() {
        int i4 = this.f2714a;
        return i4 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i4 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i4 == 17 ? "LineHeightStyle.Trim.Both" : i4 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
