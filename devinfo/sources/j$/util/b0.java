package j$.util;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f26287c = new b0();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26288a;

    /* renamed from: b, reason: collision with root package name */
    public final double f26289b;

    public b0() {
        this.f26288a = false;
        this.f26289b = Double.NaN;
    }

    public b0(double d10) {
        this.f26288a = true;
        this.f26289b = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        boolean z3 = b0Var.f26288a;
        boolean z10 = this.f26288a;
        return (z10 && z3) ? Double.compare(this.f26289b, b0Var.f26289b) == 0 : z10 == z3;
    }

    public final int hashCode() {
        if (!this.f26288a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.f26289b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        if (this.f26288a) {
            return "OptionalDouble[" + this.f26289b + "]";
        }
        return "OptionalDouble.empty";
    }
}
