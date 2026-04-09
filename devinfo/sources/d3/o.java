package d3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f21973a;

    public static final boolean a(long j, long j8) {
        return j == j8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f21973a == ((o) obj).f21973a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f21973a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.f21973a;
        return a(j, 0L) ? "Unspecified" : a(j, 4294967296L) ? "Sp" : a(j, 8589934592L) ? "Em" : "Invalid";
    }
}
