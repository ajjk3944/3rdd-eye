package I;

/* loaded from: classes.dex */
public final class X0 {

    /* renamed from: a, reason: collision with root package name */
    private final p1 f8106a;

    /* renamed from: b, reason: collision with root package name */
    private final p1 f8107b;

    public X0(p1 p1Var, p1 p1Var2) {
        this.f8106a = p1Var;
        this.f8107b = p1Var2;
    }

    public final p1 a() {
        return this.f8106a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X0)) {
            return false;
        }
        X0 x02 = (X0) obj;
        return this.f8106a == x02.f8106a && this.f8107b == x02.f8107b;
    }

    public int hashCode() {
        return (this.f8106a.hashCode() * 31) + this.f8107b.hashCode();
    }

    public String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.f8106a + ", endAffinity=" + this.f8107b + ')';
    }

    public X0(p1 p1Var) {
        this(p1Var, p1Var);
    }
}
