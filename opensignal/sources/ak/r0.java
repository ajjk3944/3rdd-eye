package ak;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final double f653a;

    /* renamed from: b, reason: collision with root package name */
    public final double f654b;

    /* renamed from: c, reason: collision with root package name */
    public final String f655c;

    public r0(double d6, double d10, String str) {
        this.f653a = d6;
        this.f654b = d10;
        this.f655c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Double.compare(this.f653a, r0Var.f653a) == 0 && Double.compare(this.f654b, r0Var.f654b) == 0 && br.l.a(this.f655c, r0Var.f655c);
    }

    public final int hashCode() {
        return this.f655c.hashCode() + h0.b.a(this.f654b, Double.hashCode(this.f653a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServerResponseTestServer(latitude=");
        sb2.append(this.f653a);
        sb2.append(", longitude=");
        sb2.append(this.f654b);
        sb2.append(", server=");
        return h0.b.r(sb2, this.f655c, ')');
    }
}
