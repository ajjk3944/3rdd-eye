package W;

/* compiled from: AutoValue_AudioStats.java */
/* renamed from: W.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1616d extends AbstractC1614b {

    /* renamed from: b, reason: collision with root package name */
    public final int f13248b;

    /* renamed from: c, reason: collision with root package name */
    public final double f13249c;

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f13250d;

    public C1616d(int i, double d10, Throwable th) {
        this.f13248b = i;
        this.f13249c = d10;
        this.f13250d = th;
    }

    @Override // W.AbstractC1614b
    public final double a() {
        return this.f13249c;
    }

    @Override // W.AbstractC1614b
    public final int b() {
        return this.f13248b;
    }

    @Override // W.AbstractC1614b
    public final Throwable c() {
        return this.f13250d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1614b)) {
            return false;
        }
        AbstractC1614b abstractC1614b = (AbstractC1614b) obj;
        if (this.f13248b != abstractC1614b.b() || Double.doubleToLongBits(this.f13249c) != Double.doubleToLongBits(abstractC1614b.a())) {
            return false;
        }
        Throwable th = this.f13250d;
        return th == null ? abstractC1614b.c() == null : th.equals(abstractC1614b.c());
    }

    public final int hashCode() {
        int i = (this.f13248b ^ 1000003) * 1000003;
        double d10 = this.f13249c;
        int iDoubleToLongBits = (i ^ ((int) (Double.doubleToLongBits(d10) ^ (Double.doubleToLongBits(d10) >>> 32)))) * 1000003;
        Throwable th = this.f13250d;
        return iDoubleToLongBits ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "AudioStats{audioState=" + this.f13248b + ", audioAmplitudeInternal=" + this.f13249c + ", errorCause=" + this.f13250d + "}";
    }
}
