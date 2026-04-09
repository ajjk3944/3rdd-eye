package ak;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f547a;

    /* renamed from: b, reason: collision with root package name */
    public final String f548b;

    /* renamed from: c, reason: collision with root package name */
    public final long f549c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f550d;

    public i0(int i10, String str, long j, Boolean bool) {
        this.f547a = i10;
        this.f548b = str;
        this.f549c = j;
        this.f550d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f547a == i0Var.f547a && br.l.a(this.f548b, i0Var.f548b) && this.f549c == i0Var.f549c && br.l.a(this.f550d, i0Var.f550d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f547a) * 31;
        String str = this.f548b;
        int iB = h0.b.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f549c);
        Boolean bool = this.f550d;
        return iB + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "PublicIp(networkConnectionType=" + this.f547a + ", ip=" + this.f548b + ", time=" + this.f549c + ", isNotVpn=" + this.f550d + ')';
    }
}
