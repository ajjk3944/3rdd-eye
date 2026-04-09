package a5;

import q5.i;

/* renamed from: a5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0276c {

    /* renamed from: a, reason: collision with root package name */
    public final String f4747a;

    /* renamed from: b, reason: collision with root package name */
    public final v5.c f4748b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4749c;

    /* renamed from: d, reason: collision with root package name */
    public final double f4750d;

    /* renamed from: e, reason: collision with root package name */
    public final double f4751e;

    public C0276c(String str, v5.c cVar, String str2, double d6, double d7) {
        this.f4747a = str;
        this.f4748b = cVar;
        this.f4749c = str2;
        this.f4750d = d6;
        this.f4751e = d7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0276c)) {
            return false;
        }
        C0276c c0276c = (C0276c) obj;
        return i.a(this.f4747a, c0276c.f4747a) && i.a(this.f4748b, c0276c.f4748b) && i.a(this.f4749c, c0276c.f4749c) && Double.compare(this.f4750d, c0276c.f4750d) == 0 && Double.compare(this.f4751e, c0276c.f4751e) == 0;
    }

    public final int hashCode() {
        int iHashCode = this.f4747a.hashCode() * 31;
        v5.c cVar = this.f4748b;
        int iHashCode2 = (this.f4749c.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f4750d);
        int i = (iHashCode2 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f4751e);
        return i + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "NrBand(band=" + this.f4747a + ", nrarfcnRange=" + this.f4748b + ", frequencyRange=" + this.f4749c + ", fdlLow=" + this.f4750d + ", fulLow=" + this.f4751e + ")";
    }
}
