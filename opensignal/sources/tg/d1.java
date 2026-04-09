package tg;

/* loaded from: classes.dex */
public final class d1 {
    public static final c1 Companion = new c1();

    /* renamed from: a, reason: collision with root package name */
    public final long f22760a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22761b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22762c;

    public /* synthetic */ d1(int i10, long j, long j7, long j10) {
        if (1 != (i10 & 1)) {
            ku.p0.f(i10, 1, b1.f22740a.getDescriptor());
            throw null;
        }
        this.f22760a = j;
        this.f22761b = (i10 & 2) == 0 ? 1000 * j : j7;
        if ((i10 & 4) == 0) {
            this.f22762c = j / 1000;
        } else {
            this.f22762c = j10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && this.f22760a == ((d1) obj).f22760a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22760a);
    }

    public final String toString() {
        return w.g.h(new StringBuilder("Time(ms="), this.f22760a, ')');
    }

    public d1(long j) {
        this.f22760a = j;
        long j7 = 1000;
        this.f22761b = j * j7;
        this.f22762c = j / j7;
    }
}
