package xi;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f25332a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25333b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25334c;

    public h(long j, String str, String str2) {
        br.l.e(str, "state");
        br.l.e(str2, "detailedState");
        this.f25332a = j;
        this.f25333b = str;
        this.f25334c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f25332a == hVar.f25332a && br.l.a(this.f25333b, hVar.f25333b) && br.l.a(this.f25334c, hVar.f25334c);
    }

    public final int hashCode() {
        return this.f25334c.hashCode() + c7.a.g(this.f25333b, Long.hashCode(this.f25332a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DetailedWifiState(time=");
        sb2.append(this.f25332a);
        sb2.append(", state=");
        sb2.append(this.f25333b);
        sb2.append(", detailedState=");
        return h0.b.r(sb2, this.f25334c, ')');
    }
}
