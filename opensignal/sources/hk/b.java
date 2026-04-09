package hk;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f10798a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10799b;

    /* renamed from: c, reason: collision with root package name */
    public final mj.b f10800c;

    public b(long j, long j7, mj.b bVar) {
        br.l.e(bVar, "appStatusMode");
        this.f10798a = j;
        this.f10799b = j7;
        this.f10800c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f10798a == bVar.f10798a && this.f10799b == bVar.f10799b && this.f10800c == bVar.f10800c;
    }

    public final int hashCode() {
        return this.f10800c.hashCode() + h0.b.b(Long.hashCode(this.f10798a) * 31, 31, this.f10799b);
    }

    public final String toString() {
        return "DataUsageLimits(kilobytes=" + this.f10798a + ", days=" + this.f10799b + ", appStatusMode=" + this.f10800c + ')';
    }
}
