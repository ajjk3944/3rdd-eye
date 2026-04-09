package lf;

/* loaded from: classes.dex */
public final class e1 extends h2 {

    /* renamed from: a, reason: collision with root package name */
    public final g2 f15232a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15233b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15234c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15235d;

    public e1(f1 f1Var, String str, String str2, long j) {
        this.f15232a = f1Var;
        this.f15233b = str;
        this.f15234c = str2;
        this.f15235d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            e1 e1Var = (e1) ((h2) obj);
            if (this.f15232a.equals(e1Var.f15232a) && this.f15233b.equals(e1Var.f15233b) && this.f15234c.equals(e1Var.f15234c) && this.f15235d == e1Var.f15235d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f15232a.hashCode() ^ 1000003) * 1000003) ^ this.f15233b.hashCode()) * 1000003) ^ this.f15234c.hashCode()) * 1000003;
        long j = this.f15235d;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f15232a);
        sb2.append(", parameterKey=");
        sb2.append(this.f15233b);
        sb2.append(", parameterValue=");
        sb2.append(this.f15234c);
        sb2.append(", templateVersion=");
        return c7.a.n(this.f15235d, "}", sb2);
    }
}
