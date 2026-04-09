package pf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f1 {
    public static final e1 Companion = new e1();

    /* renamed from: a, reason: collision with root package name */
    public final long f31818a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31819b;

    /* renamed from: c, reason: collision with root package name */
    public final long f31820c;

    public /* synthetic */ f1(int i4, long j, long j8, long j9) {
        if (1 != (i4 & 1)) {
            ml.k.a(i4, 1, d1.f31801a.d());
            throw null;
        }
        this.f31818a = j;
        this.f31819b = (i4 & 2) == 0 ? 1000 * j : j8;
        if ((i4 & 4) == 0) {
            this.f31820c = j / 1000;
        } else {
            this.f31820c = j9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && this.f31818a == ((f1) obj).f31818a;
    }

    public final int hashCode() {
        long j = this.f31818a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "Time(ms=" + this.f31818a + ')';
    }

    public f1(long j) {
        this.f31818a = j;
        long j8 = 1000;
        this.f31819b = j * j8;
        this.f31820c = j / j8;
    }
}
