package d3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f21958a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f21958a == ((g) obj).f21958a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f21958a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.f21958a;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) f.c(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) f.c(Float.intBitsToFloat((int) (j & 4294967295L)))) + ')';
    }
}
