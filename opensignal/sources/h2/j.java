package h2;

/* loaded from: classes.dex */
public final class j extends l {

    /* renamed from: a, reason: collision with root package name */
    public final String f9837a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f9838b;

    public j(String str, h0 h0Var) {
        this.f9837a = str;
        this.f9838b = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return br.l.a(this.f9837a, jVar.f9837a) && br.l.a(this.f9838b, jVar.f9838b);
    }

    public final int hashCode() {
        int iHashCode = this.f9837a.hashCode() * 31;
        h0 h0Var = this.f9838b;
        return (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return h0.b.r(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f9837a, ')');
    }
}
