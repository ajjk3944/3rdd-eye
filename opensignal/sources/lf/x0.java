package lf;

/* loaded from: classes.dex */
public final class x0 extends z1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f15465a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15466b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15467c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15468d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15469e;

    public x0(long j, String str, String str2, long j7, int i10) {
        this.f15465a = j;
        this.f15466b = str;
        this.f15467c = str2;
        this.f15468d = j7;
        this.f15469e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof z1) {
            x0 x0Var = (x0) ((z1) obj);
            String str2 = x0Var.f15467c;
            if (this.f15465a == x0Var.f15465a && this.f15466b.equals(x0Var.f15466b) && ((str = this.f15467c) != null ? str.equals(str2) : str2 == null) && this.f15468d == x0Var.f15468d && this.f15469e == x0Var.f15469e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f15465a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f15466b.hashCode()) * 1000003;
        String str = this.f15467c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j7 = this.f15468d;
        return ((iHashCode2 ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f15469e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f15465a);
        sb2.append(", symbol=");
        sb2.append(this.f15466b);
        sb2.append(", file=");
        sb2.append(this.f15467c);
        sb2.append(", offset=");
        sb2.append(this.f15468d);
        sb2.append(", importance=");
        return h0.b.i(this.f15469e, "}", sb2);
    }
}
