package lf;

/* loaded from: classes.dex */
public final class i1 extends k2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15282a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15283b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15284c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15285d;

    public i1(String str, int i10, String str2, boolean z10) {
        this.f15282a = i10;
        this.f15283b = str;
        this.f15284c = str2;
        this.f15285d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k2) {
            i1 i1Var = (i1) ((k2) obj);
            if (this.f15282a == i1Var.f15282a && this.f15283b.equals(i1Var.f15283b) && this.f15284c.equals(i1Var.f15284c) && this.f15285d == i1Var.f15285d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f15282a ^ 1000003) * 1000003) ^ this.f15283b.hashCode()) * 1000003) ^ this.f15284c.hashCode()) * 1000003) ^ (this.f15285d ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f15282a + ", version=" + this.f15283b + ", buildVersion=" + this.f15284c + ", jailbroken=" + this.f15285d + "}";
    }
}
