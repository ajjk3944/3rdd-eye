package lf;

/* loaded from: classes.dex */
public final class f1 extends g2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15241a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15242b;

    public f1(String str, String str2) {
        this.f15241a = str;
        this.f15242b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g2) {
            f1 f1Var = (f1) ((g2) obj);
            if (this.f15241a.equals(f1Var.f15241a) && this.f15242b.equals(f1Var.f15242b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15241a.hashCode() ^ 1000003) * 1000003) ^ this.f15242b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f15241a);
        sb2.append(", variantId=");
        return w.g.j(sb2, this.f15242b, "}");
    }
}
