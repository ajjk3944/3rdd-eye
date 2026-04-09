package lf;

/* loaded from: classes.dex */
public final class b1 extends e2 {

    /* renamed from: a, reason: collision with root package name */
    public final Double f15182a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15183b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15184c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15185d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15186e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15187f;

    public b1(Double d6, int i10, boolean z10, int i11, long j, long j7) {
        this.f15182a = d6;
        this.f15183b = i10;
        this.f15184c = z10;
        this.f15185d = i11;
        this.f15186e = j;
        this.f15187f = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            e2 e2Var = (e2) obj;
            Double d6 = this.f15182a;
            if (d6 != null ? d6.equals(((b1) e2Var).f15182a) : ((b1) e2Var).f15182a == null) {
                b1 b1Var = (b1) e2Var;
                if (this.f15183b == b1Var.f15183b && this.f15184c == b1Var.f15184c && this.f15185d == b1Var.f15185d && this.f15186e == b1Var.f15186e && this.f15187f == b1Var.f15187f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d6 = this.f15182a;
        int iHashCode = ((((((((d6 == null ? 0 : d6.hashCode()) ^ 1000003) * 1000003) ^ this.f15183b) * 1000003) ^ (this.f15184c ? 1231 : 1237)) * 1000003) ^ this.f15185d) * 1000003;
        long j = this.f15186e;
        long j7 = this.f15187f;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f15182a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f15183b);
        sb2.append(", proximityOn=");
        sb2.append(this.f15184c);
        sb2.append(", orientation=");
        sb2.append(this.f15185d);
        sb2.append(", ramUsed=");
        sb2.append(this.f15186e);
        sb2.append(", diskUsed=");
        return c7.a.n(this.f15187f, "}", sb2);
    }
}
