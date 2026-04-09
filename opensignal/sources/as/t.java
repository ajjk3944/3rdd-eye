package as;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final t f2249d = new t(f0.STRICT, 6);

    /* renamed from: a, reason: collision with root package name */
    public final f0 f2250a;

    /* renamed from: b, reason: collision with root package name */
    public final lq.g f2251b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f2252c;

    public t(f0 f0Var, lq.g gVar, f0 f0Var2) {
        br.l.e(f0Var, "reportLevelBefore");
        br.l.e(f0Var2, "reportLevelAfter");
        this.f2250a = f0Var;
        this.f2251b = gVar;
        this.f2252c = f0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f2250a == tVar.f2250a && br.l.a(this.f2251b, tVar.f2251b) && this.f2252c == tVar.f2252c;
    }

    public final int hashCode() {
        int iHashCode = this.f2250a.hashCode() * 31;
        lq.g gVar = this.f2251b;
        return this.f2252c.hashCode() + ((iHashCode + (gVar == null ? 0 : gVar.f15569r)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f2250a + ", sinceVersion=" + this.f2251b + ", reportLevelAfter=" + this.f2252c + ')';
    }

    public t(f0 f0Var, int i10) {
        this(f0Var, (i10 & 2) != 0 ? new lq.g(1, 0, 0) : null, f0Var);
    }
}
