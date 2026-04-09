package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bs1 {
    public static final bs1 j = new bs1(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k, reason: collision with root package name */
    public static final bs1 f9784k = new bs1(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l, reason: collision with root package name */
    public static final bs1 f9785l = new bs1(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m, reason: collision with root package name */
    public static final bs1 f9786m = new bs1(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    public final double f9787a;

    /* renamed from: b, reason: collision with root package name */
    public final double f9788b;

    /* renamed from: c, reason: collision with root package name */
    public final double f9789c;

    /* renamed from: d, reason: collision with root package name */
    public final double f9790d;

    /* renamed from: e, reason: collision with root package name */
    public final double f9791e;

    /* renamed from: f, reason: collision with root package name */
    public final double f9792f;
    public final double g;

    /* renamed from: h, reason: collision with root package name */
    public final double f9793h;

    /* renamed from: i, reason: collision with root package name */
    public final double f9794i;

    public bs1(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f9787a = d14;
        this.f9788b = d15;
        this.f9789c = d16;
        this.f9790d = d10;
        this.f9791e = d11;
        this.f9792f = d12;
        this.g = d13;
        this.f9793h = d17;
        this.f9794i = d18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bs1.class != obj.getClass()) {
            return false;
        }
        bs1 bs1Var = (bs1) obj;
        return Double.compare(bs1Var.f9790d, this.f9790d) == 0 && Double.compare(bs1Var.f9791e, this.f9791e) == 0 && Double.compare(bs1Var.f9792f, this.f9792f) == 0 && Double.compare(bs1Var.g, this.g) == 0 && Double.compare(bs1Var.f9793h, this.f9793h) == 0 && Double.compare(bs1Var.f9794i, this.f9794i) == 0 && Double.compare(bs1Var.f9787a, this.f9787a) == 0 && Double.compare(bs1Var.f9788b, this.f9788b) == 0 && Double.compare(bs1Var.f9789c, this.f9789c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f9787a);
        long j8 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f9788b);
        long j9 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f9789c);
        long j10 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f9790d);
        long j11 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f9791e);
        long j12 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f9792f);
        long j13 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.g);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f9793h);
        long j14 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f9794i);
        return (((((((((((((((((int) j8) * 31) + ((int) j9)) * 31) + ((int) j10)) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31) + ((int) j14)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(j)) {
            return "Rotate 0°";
        }
        if (equals(f9784k)) {
            return "Rotate 90°";
        }
        if (equals(f9785l)) {
            return "Rotate 180°";
        }
        if (equals(f9786m)) {
            return "Rotate 270°";
        }
        StringBuilder sb2 = new StringBuilder(260);
        sb2.append("Matrix{u=");
        sb2.append(this.f9787a);
        sb2.append(", v=");
        sb2.append(this.f9788b);
        sb2.append(", w=");
        sb2.append(this.f9789c);
        sb2.append(", a=");
        sb2.append(this.f9790d);
        sb2.append(", b=");
        sb2.append(this.f9791e);
        sb2.append(", c=");
        sb2.append(this.f9792f);
        sb2.append(", d=");
        sb2.append(this.g);
        sb2.append(", tx=");
        sb2.append(this.f9793h);
        sb2.append(", ty=");
        sb2.append(this.f9794i);
        sb2.append("}");
        return sb2.toString();
    }
}
