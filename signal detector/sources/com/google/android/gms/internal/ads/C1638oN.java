package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1638oN {

    /* renamed from: j, reason: collision with root package name */
    public static final C1638oN f15935j = new C1638oN(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k, reason: collision with root package name */
    public static final C1638oN f15936k = new C1638oN(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l, reason: collision with root package name */
    public static final C1638oN f15937l = new C1638oN(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m, reason: collision with root package name */
    public static final C1638oN f15938m = new C1638oN(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    public final double f15939a;

    /* renamed from: b, reason: collision with root package name */
    public final double f15940b;

    /* renamed from: c, reason: collision with root package name */
    public final double f15941c;

    /* renamed from: d, reason: collision with root package name */
    public final double f15942d;

    /* renamed from: e, reason: collision with root package name */
    public final double f15943e;

    /* renamed from: f, reason: collision with root package name */
    public final double f15944f;

    /* renamed from: g, reason: collision with root package name */
    public final double f15945g;

    /* renamed from: h, reason: collision with root package name */
    public final double f15946h;
    public final double i;

    public C1638oN(double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14) {
        this.f15939a = d10;
        this.f15940b = d11;
        this.f15941c = d12;
        this.f15942d = d6;
        this.f15943e = d7;
        this.f15944f = d8;
        this.f15945g = d9;
        this.f15946h = d13;
        this.i = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1638oN.class != obj.getClass()) {
            return false;
        }
        C1638oN c1638oN = (C1638oN) obj;
        return Double.compare(c1638oN.f15942d, this.f15942d) == 0 && Double.compare(c1638oN.f15943e, this.f15943e) == 0 && Double.compare(c1638oN.f15944f, this.f15944f) == 0 && Double.compare(c1638oN.f15945g, this.f15945g) == 0 && Double.compare(c1638oN.f15946h, this.f15946h) == 0 && Double.compare(c1638oN.i, this.i) == 0 && Double.compare(c1638oN.f15939a, this.f15939a) == 0 && Double.compare(c1638oN.f15940b, this.f15940b) == 0 && Double.compare(c1638oN.f15941c, this.f15941c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f15939a);
        long j6 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f15940b);
        long j7 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f15941c);
        long j8 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f15942d);
        long j9 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f15943e);
        long j10 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f15944f);
        long j11 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f15945g);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f15946h);
        long j12 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.i);
        return (((((((((((((((((int) j6) * 31) + ((int) j7)) * 31) + ((int) j8)) * 31) + ((int) j9)) * 31) + ((int) j10)) * 31) + ((int) j11)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31) + ((int) j12)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f15935j)) {
            return "Rotate 0°";
        }
        if (equals(f15936k)) {
            return "Rotate 90°";
        }
        if (equals(f15937l)) {
            return "Rotate 180°";
        }
        if (equals(f15938m)) {
            return "Rotate 270°";
        }
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(this.f15939a);
        sb.append(", v=");
        sb.append(this.f15940b);
        sb.append(", w=");
        sb.append(this.f15941c);
        sb.append(", a=");
        sb.append(this.f15942d);
        sb.append(", b=");
        sb.append(this.f15943e);
        sb.append(", c=");
        sb.append(this.f15944f);
        sb.append(", d=");
        sb.append(this.f15945g);
        sb.append(", tx=");
        sb.append(this.f15946h);
        sb.append(", ty=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
}
