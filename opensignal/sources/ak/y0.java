package ak;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f795a;

    /* renamed from: b, reason: collision with root package name */
    public final String f796b;

    public y0(String str, String str2) {
        this.f795a = str;
        this.f796b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return br.l.a(this.f795a, y0Var.f795a) && br.l.a(this.f796b, y0Var.f796b);
    }

    public final int hashCode() {
        return this.f796b.hashCode() + (this.f795a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TestServer(endpoint=");
        sb2.append(this.f795a);
        sb2.append(", name=");
        return h0.b.r(sb2, this.f796b, ')');
    }
}
