package ak;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final long f797a;

    /* renamed from: b, reason: collision with root package name */
    public final String f798b;

    /* renamed from: c, reason: collision with root package name */
    public final long f799c;

    /* renamed from: d, reason: collision with root package name */
    public final u f800d;

    public z(long j, String str, long j7, u uVar) {
        br.l.e(str, "ipAddress");
        br.l.e(uVar, "location");
        this.f797a = j;
        this.f798b = str;
        this.f799c = j7;
        this.f800d = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f797a == zVar.f797a && br.l.a(this.f798b, zVar.f798b) && this.f799c == zVar.f799c && br.l.a(this.f800d, zVar.f800d);
    }

    public final int hashCode() {
        return this.f800d.hashCode() + h0.b.b(c7.a.g(this.f798b, Long.hashCode(this.f797a) * 31, 31), 31, this.f799c);
    }

    public final String toString() {
        return "IpCache(id=" + this.f797a + ", ipAddress=" + this.f798b + ", lastModificationDate=" + this.f799c + ", location=" + this.f800d + ')';
    }
}
