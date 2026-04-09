package r;

/* renamed from: r.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7546v {

    /* renamed from: a, reason: collision with root package name */
    private double f59918a;

    /* renamed from: b, reason: collision with root package name */
    private double f59919b;

    public C7546v(double d10, double d11) {
        this.f59918a = d10;
        this.f59919b = d11;
    }

    public final double e() {
        return this.f59919b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7546v)) {
            return false;
        }
        C7546v c7546v = (C7546v) obj;
        return Double.compare(this.f59918a, c7546v.f59918a) == 0 && Double.compare(this.f59919b, c7546v.f59919b) == 0;
    }

    public final double f() {
        return this.f59918a;
    }

    public int hashCode() {
        return (Double.hashCode(this.f59918a) * 31) + Double.hashCode(this.f59919b);
    }

    public String toString() {
        return "ComplexDouble(_real=" + this.f59918a + ", _imaginary=" + this.f59919b + ')';
    }
}
