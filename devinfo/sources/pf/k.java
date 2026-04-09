package pf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final j f31858a;

    /* renamed from: b, reason: collision with root package name */
    public final j f31859b;

    /* renamed from: c, reason: collision with root package name */
    public final double f31860c;

    public k(j jVar, j jVar2, double d10) {
        this.f31858a = jVar;
        this.f31859b = jVar2;
        this.f31860c = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f31858a == kVar.f31858a && this.f31859b == kVar.f31859b && Double.compare(this.f31860c, kVar.f31860c) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f31859b.hashCode() + (this.f31858a.hashCode() * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f31860c);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f31858a + ", crashlytics=" + this.f31859b + ", sessionSamplingRate=" + this.f31860c + ')';
    }
}
