package n0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final double f54197a;

    /* renamed from: b, reason: collision with root package name */
    private final double f54198b;

    /* renamed from: c, reason: collision with root package name */
    private final double f54199c;

    /* renamed from: d, reason: collision with root package name */
    private final double f54200d;

    /* renamed from: e, reason: collision with root package name */
    private final double f54201e;

    /* renamed from: f, reason: collision with root package name */
    private final double f54202f;

    /* renamed from: g, reason: collision with root package name */
    private final double f54203g;

    public y(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f54197a = d10;
        this.f54198b = d11;
        this.f54199c = d12;
        this.f54200d = d13;
        this.f54201e = d14;
        this.f54202f = d15;
        this.f54203g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
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

    public final double a() {
        return this.f54198b;
    }

    public final double b() {
        return this.f54199c;
    }

    public final double c() {
        return this.f54200d;
    }

    public final double d() {
        return this.f54201e;
    }

    public final double e() {
        return this.f54202f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Double.compare(this.f54197a, yVar.f54197a) == 0 && Double.compare(this.f54198b, yVar.f54198b) == 0 && Double.compare(this.f54199c, yVar.f54199c) == 0 && Double.compare(this.f54200d, yVar.f54200d) == 0 && Double.compare(this.f54201e, yVar.f54201e) == 0 && Double.compare(this.f54202f, yVar.f54202f) == 0 && Double.compare(this.f54203g, yVar.f54203g) == 0;
    }

    public final double f() {
        return this.f54203g;
    }

    public final double g() {
        return this.f54197a;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f54197a) * 31) + Double.hashCode(this.f54198b)) * 31) + Double.hashCode(this.f54199c)) * 31) + Double.hashCode(this.f54200d)) * 31) + Double.hashCode(this.f54201e)) * 31) + Double.hashCode(this.f54202f)) * 31) + Double.hashCode(this.f54203g);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f54197a + ", a=" + this.f54198b + ", b=" + this.f54199c + ", c=" + this.f54200d + ", d=" + this.f54201e + ", e=" + this.f54202f + ", f=" + this.f54203g + ')';
    }

    public /* synthetic */ y(double d10, double d11, double d12, double d13, double d14, double d15, double d16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, d11, d12, d13, d14, (i10 & 32) != 0 ? 0.0d : d15, (i10 & 64) != 0 ? 0.0d : d16);
    }
}
