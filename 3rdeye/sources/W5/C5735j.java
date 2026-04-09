package w5;

/* compiled from: SessionEvent.kt */
/* renamed from: w5.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5735j {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC5734i f47420a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC5734i f47421b;

    /* renamed from: c, reason: collision with root package name */
    public final double f47422c;

    public C5735j(EnumC5734i performance, EnumC5734i crashlytics, double d10) {
        kotlin.jvm.internal.l.f(performance, "performance");
        kotlin.jvm.internal.l.f(crashlytics, "crashlytics");
        this.f47420a = performance;
        this.f47421b = crashlytics;
        this.f47422c = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5735j)) {
            return false;
        }
        C5735j c5735j = (C5735j) obj;
        return this.f47420a == c5735j.f47420a && this.f47421b == c5735j.f47421b && Double.compare(this.f47422c, c5735j.f47422c) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f47421b.hashCode() + (this.f47420a.hashCode() * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f47422c);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f47420a + ", crashlytics=" + this.f47421b + ", sessionSamplingRate=" + this.f47422c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5735j() {
        EnumC5734i enumC5734i = EnumC5734i.COLLECTION_SDK_NOT_INSTALLED;
        this(enumC5734i, enumC5734i, 1.0d);
    }
}
