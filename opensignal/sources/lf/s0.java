package lf;

/* loaded from: classes.dex */
public final class s0 extends w1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f15425a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15426b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15427c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15428d;

    public s0(long j, long j7, String str, String str2) {
        this.f15425a = j;
        this.f15426b = j7;
        this.f15427c = str;
        this.f15428d = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            s0 s0Var = (s0) ((w1) obj);
            String str2 = s0Var.f15428d;
            if (this.f15425a == s0Var.f15425a && this.f15426b == s0Var.f15426b && this.f15427c.equals(s0Var.f15427c) && ((str = this.f15428d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f15425a;
        long j7 = this.f15426b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f15427c.hashCode()) * 1000003;
        String str = this.f15428d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f15425a);
        sb2.append(", size=");
        sb2.append(this.f15426b);
        sb2.append(", name=");
        sb2.append(this.f15427c);
        sb2.append(", uuid=");
        return w.g.j(sb2, this.f15428d, "}");
    }
}
