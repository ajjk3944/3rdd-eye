package t6;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f34344a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34345b;

    public f0(long j, long j8) {
        this.f34344a = j;
        this.f34345b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f0.class.equals(obj.getClass())) {
            f0 f0Var = (f0) obj;
            if (f0Var.f34344a == this.f34344a && f0Var.f34345b == this.f34345b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f34344a;
        int i4 = ((int) (j ^ (j >>> 32))) * 31;
        long j8 = this.f34345b;
        return i4 + ((int) ((j8 >>> 32) ^ j8));
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.f34344a + ", flexIntervalMillis=" + this.f34345b + '}';
    }
}
