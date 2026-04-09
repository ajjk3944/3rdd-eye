package ak;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f502a;

    /* renamed from: b, reason: collision with root package name */
    public final String f503b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f504c;

    public d1(String str, String str2, boolean z10) {
        br.l.e(str, "endpoint");
        br.l.e(str2, "ipAddress");
        this.f502a = str;
        this.f503b = str2;
        this.f504c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return br.l.a(this.f502a, d1Var.f502a) && br.l.a(this.f503b, d1Var.f503b) && this.f504c == d1Var.f504c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f504c) + c7.a.g(this.f503b, this.f502a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TracerouteEndpoint(endpoint=");
        sb2.append(this.f502a);
        sb2.append(", ipAddress=");
        sb2.append(this.f503b);
        sb2.append(", forceUseIpAddress=");
        return c7.a.r(sb2, this.f504c, ')');
    }
}
