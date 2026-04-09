package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b1 extends e2 {

    /* renamed from: a, reason: collision with root package name */
    public final Double f29072a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29073b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29074c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29075d;

    /* renamed from: e, reason: collision with root package name */
    public final long f29076e;

    /* renamed from: f, reason: collision with root package name */
    public final long f29077f;

    public b1(Double d10, int i4, boolean z3, int i10, long j, long j8) {
        this.f29072a = d10;
        this.f29073b = i4;
        this.f29074c = z3;
        this.f29075d = i10;
        this.f29076e = j;
        this.f29077f = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            e2 e2Var = (e2) obj;
            Double d10 = this.f29072a;
            if (d10 != null ? d10.equals(((b1) e2Var).f29072a) : ((b1) e2Var).f29072a == null) {
                b1 b1Var = (b1) e2Var;
                if (this.f29073b == b1Var.f29073b && this.f29074c == b1Var.f29074c && this.f29075d == b1Var.f29075d && this.f29076e == b1Var.f29076e && this.f29077f == b1Var.f29077f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d10 = this.f29072a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f29073b) * 1000003) ^ (this.f29074c ? 1231 : 1237)) * 1000003) ^ this.f29075d) * 1000003;
        long j = this.f29076e;
        long j8 = this.f29077f;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f29072a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f29073b);
        sb2.append(", proximityOn=");
        sb2.append(this.f29074c);
        sb2.append(", orientation=");
        sb2.append(this.f29075d);
        sb2.append(", ramUsed=");
        sb2.append(this.f29076e);
        sb2.append(", diskUsed=");
        return je.u.s(this.f29077f, "}", sb2);
    }
}
