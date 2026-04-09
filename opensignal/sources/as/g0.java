package as;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final qs.g f2217a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2218b;

    public g0(qs.g gVar, String str) {
        br.l.e(str, "signature");
        this.f2217a = gVar;
        this.f2218b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return br.l.a(this.f2217a, g0Var.f2217a) && br.l.a(this.f2218b, g0Var.f2218b);
    }

    public final int hashCode() {
        return this.f2218b.hashCode() + (this.f2217a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NameAndSignature(name=");
        sb2.append(this.f2217a);
        sb2.append(", signature=");
        return h0.b.r(sb2, this.f2218b, ')');
    }
}
