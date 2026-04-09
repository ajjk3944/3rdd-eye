package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u0 extends y1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29322a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29323b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29324c;

    public u0(String str, String str2, long j) {
        this.f29322a = str;
        this.f29323b = str2;
        this.f29324c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            u0 u0Var = (u0) ((y1) obj);
            if (this.f29322a.equals(u0Var.f29322a) && this.f29323b.equals(u0Var.f29323b) && this.f29324c == u0Var.f29324c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f29322a.hashCode() ^ 1000003) * 1000003) ^ this.f29323b.hashCode()) * 1000003;
        long j = this.f29324c;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f29322a);
        sb2.append(", code=");
        sb2.append(this.f29323b);
        sb2.append(", address=");
        return je.u.s(this.f29324c, "}", sb2);
    }
}
