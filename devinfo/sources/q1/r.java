package q1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final double f32136a;

    /* renamed from: b, reason: collision with root package name */
    public final double f32137b;

    /* renamed from: c, reason: collision with root package name */
    public final double f32138c;

    /* renamed from: d, reason: collision with root package name */
    public final double f32139d;

    /* renamed from: e, reason: collision with root package name */
    public final double f32140e;

    /* renamed from: f, reason: collision with root package name */
    public final double f32141f;
    public final double g;

    public r(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f32136a = d10;
        this.f32137b = d11;
        this.f32138c = d12;
        this.f32139d = d13;
        this.f32140e = d14;
        this.f32141f = d15;
        this.g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d10 == -2.0d || d10 == -3.0d) {
            return;
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Double.compare(this.f32136a, rVar.f32136a) == 0 && Double.compare(this.f32137b, rVar.f32137b) == 0 && Double.compare(this.f32138c, rVar.f32138c) == 0 && Double.compare(this.f32139d, rVar.f32139d) == 0 && Double.compare(this.f32140e, rVar.f32140e) == 0 && Double.compare(this.f32141f, rVar.f32141f) == 0 && Double.compare(this.g, rVar.g) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f32136a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f32137b);
        int i4 = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f32138c);
        int i10 = (i4 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f32139d);
        int i11 = (i10 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f32140e);
        int i12 = (i11 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31;
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f32141f);
        int i13 = (i12 + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 31;
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.g);
        return i13 + ((int) ((jDoubleToLongBits7 >>> 32) ^ jDoubleToLongBits7));
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f32136a + ", a=" + this.f32137b + ", b=" + this.f32138c + ", c=" + this.f32139d + ", d=" + this.f32140e + ", e=" + this.f32141f + ", f=" + this.g + ')';
    }

    public /* synthetic */ r(double d10, double d11, double d12, double d13, double d14) {
        this(d10, d11, d12, d13, d14, 0.0d, 0.0d);
    }
}
