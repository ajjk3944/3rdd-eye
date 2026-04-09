package h2;

/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    public final String f9843a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f9844b;

    public k(String str, h0 h0Var) {
        this.f9843a = str;
        this.f9844b = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return br.l.a(this.f9843a, kVar.f9843a) && br.l.a(this.f9844b, kVar.f9844b);
    }

    public final int hashCode() {
        int iHashCode = this.f9843a.hashCode() * 31;
        h0 h0Var = this.f9844b;
        return (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return h0.b.r(new StringBuilder("LinkAnnotation.Url(url="), this.f9843a, ')');
    }
}
