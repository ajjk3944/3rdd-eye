package n0;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f17229a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17230b;

    public o0(Integer num, Object obj) {
        this.f17229a = num;
        this.f17230b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f17229a.equals(o0Var.f17229a) && br.l.a(this.f17230b, o0Var.f17230b);
    }

    public final int hashCode() {
        int iHashCode = this.f17229a.hashCode() * 31;
        Object obj = this.f17230b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f17229a + ", right=" + this.f17230b + ')';
    }
}
