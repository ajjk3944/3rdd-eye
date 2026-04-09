package lf;

/* loaded from: classes.dex */
public final class u0 extends y1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15443a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15444b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15445c;

    public u0(long j, String str, String str2) {
        this.f15443a = str;
        this.f15444b = str2;
        this.f15445c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            u0 u0Var = (u0) ((y1) obj);
            if (this.f15443a.equals(u0Var.f15443a) && this.f15444b.equals(u0Var.f15444b) && this.f15445c == u0Var.f15445c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f15443a.hashCode() ^ 1000003) * 1000003) ^ this.f15444b.hashCode()) * 1000003;
        long j = this.f15445c;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f15443a);
        sb2.append(", code=");
        sb2.append(this.f15444b);
        sb2.append(", address=");
        return c7.a.n(this.f15445c, "}", sb2);
    }
}
