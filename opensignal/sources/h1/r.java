package h1;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final double f9749a;

    /* renamed from: b, reason: collision with root package name */
    public final double f9750b;

    /* renamed from: c, reason: collision with root package name */
    public final double f9751c;

    /* renamed from: d, reason: collision with root package name */
    public final double f9752d;

    /* renamed from: e, reason: collision with root package name */
    public final double f9753e;

    /* renamed from: f, reason: collision with root package name */
    public final double f9754f;

    /* renamed from: g, reason: collision with root package name */
    public final double f9755g;

    public /* synthetic */ r(double d6, double d10, double d11, double d12, double d13) {
        this(d6, d10, d11, d12, d13, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Double.compare(this.f9749a, rVar.f9749a) == 0 && Double.compare(this.f9750b, rVar.f9750b) == 0 && Double.compare(this.f9751c, rVar.f9751c) == 0 && Double.compare(this.f9752d, rVar.f9752d) == 0 && Double.compare(this.f9753e, rVar.f9753e) == 0 && Double.compare(this.f9754f, rVar.f9754f) == 0 && Double.compare(this.f9755g, rVar.f9755g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f9755g) + h0.b.a(this.f9754f, h0.b.a(this.f9753e, h0.b.a(this.f9752d, h0.b.a(this.f9751c, h0.b.a(this.f9750b, Double.hashCode(this.f9749a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f9749a + ", a=" + this.f9750b + ", b=" + this.f9751c + ", c=" + this.f9752d + ", d=" + this.f9753e + ", e=" + this.f9754f + ", f=" + this.f9755g + ')';
    }

    public r(double d6, double d10, double d11, double d12, double d13, double d14, double d15) {
        this.f9749a = d6;
        this.f9750b = d10;
        this.f9751c = d11;
        this.f9752d = d12;
        this.f9753e = d13;
        this.f9754f = d14;
        this.f9755g = d15;
        if (Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d6)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d6 == -2.0d || d6 == -3.0d) {
            return;
        }
        if (d13 < 0.0d || d13 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d13);
        }
        if (d13 == 0.0d && (d10 == 0.0d || d6 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d13 >= 1.0d && d12 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d10 == 0.0d || d6 == 0.0d) && d12 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d12 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d10 < 0.0d || d6 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
