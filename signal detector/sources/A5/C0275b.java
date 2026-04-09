package a5;

/* renamed from: a5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275b {

    /* renamed from: a, reason: collision with root package name */
    public final int f4743a;

    /* renamed from: b, reason: collision with root package name */
    public final v5.c f4744b;

    /* renamed from: c, reason: collision with root package name */
    public final double f4745c;

    /* renamed from: d, reason: collision with root package name */
    public final double f4746d;

    public C0275b(int i, v5.c cVar, double d6, double d7) {
        this.f4743a = i;
        this.f4744b = cVar;
        this.f4745c = d6;
        this.f4746d = d7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0275b)) {
            return false;
        }
        C0275b c0275b = (C0275b) obj;
        return this.f4743a == c0275b.f4743a && this.f4744b.equals(c0275b.f4744b) && Double.compare(this.f4745c, c0275b.f4745c) == 0 && Double.compare(this.f4746d, c0275b.f4746d) == 0 && Double.compare(0.1d, 0.1d) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f4744b.hashCode() + (this.f4743a * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f4745c);
        int i = (iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f4746d);
        int i3 = (i + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(0.1d);
        return i3 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
    }

    public final String toString() {
        return "LteBandRange(band=" + this.f4743a + ", earfcnRange=" + this.f4744b + ", fdlLow=" + this.f4745c + ", fulLow=" + this.f4746d + ", stepSize=0.1)";
    }
}
