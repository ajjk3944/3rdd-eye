package d3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f21959a;

    public /* synthetic */ i(long j) {
        this.f21959a = j;
    }

    public static final boolean a(long j, long j8) {
        return j == j8;
    }

    public static final long b(long j, long j8) {
        return ((((int) (j >> 32)) - ((int) (j8 >> 32))) << 32) | ((((int) (j & 4294967295L)) - ((int) (j8 & 4294967295L))) & 4294967295L);
    }

    public static final long c(long j, long j8) {
        return ((((int) (j >> 32)) + ((int) (j8 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j8 & 4294967295L))) & 4294967295L);
    }

    public static String d(long j) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j >> 32));
        sb2.append(", ");
        return d.h.u(sb2, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f21959a == ((i) obj).f21959a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f21959a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return d(this.f21959a);
    }
}
