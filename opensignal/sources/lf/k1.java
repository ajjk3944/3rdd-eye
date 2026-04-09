package lf;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final l1 f15322a;

    /* renamed from: b, reason: collision with root package name */
    public final n1 f15323b;

    /* renamed from: c, reason: collision with root package name */
    public final m1 f15324c;

    public k1(l1 l1Var, n1 n1Var, m1 m1Var) {
        this.f15322a = l1Var;
        this.f15323b = n1Var;
        this.f15324c = m1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            if (this.f15322a.equals(k1Var.f15322a) && this.f15323b.equals(k1Var.f15323b) && this.f15324c.equals(k1Var.f15324c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15322a.hashCode() ^ 1000003) * 1000003) ^ this.f15323b.hashCode()) * 1000003) ^ this.f15324c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f15322a + ", osData=" + this.f15323b + ", deviceData=" + this.f15324c + "}";
    }
}
