package j$.util;

/* renamed from: j$.util.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2393m {

    /* renamed from: c, reason: collision with root package name */
    public static final C2393m f20807c = new C2393m();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20808a;

    /* renamed from: b, reason: collision with root package name */
    public final double f20809b;

    public C2393m() {
        this.f20808a = false;
        this.f20809b = Double.NaN;
    }

    public C2393m(double d6) {
        this.f20808a = true;
        this.f20809b = d6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2393m)) {
            return false;
        }
        C2393m c2393m = (C2393m) obj;
        boolean z6 = this.f20808a;
        return (z6 && c2393m.f20808a) ? Double.compare(this.f20809b, c2393m.f20809b) == 0 : z6 == c2393m.f20808a;
    }

    public final int hashCode() {
        if (!this.f20808a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.f20809b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        if (this.f20808a) {
            return "OptionalDouble[" + this.f20809b + "]";
        }
        return "OptionalDouble.empty";
    }
}
