package w;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public float f24150a;

    /* renamed from: b, reason: collision with root package name */
    public double f24151b;

    public final long a(float f10, float f11, long j) {
        float f12 = f10 - this.f24150a;
        double d6 = j / 1000.0d;
        double d10 = this.f24151b;
        double d11 = f12;
        double d12 = (d10 * d11) + f11;
        double d13 = (-d10) * d6;
        double d14 = (d6 * d12) + d11;
        double dExp = Math.exp(d13) * d14;
        float fExp = (float) ((Math.exp(d13) * d12) + (Math.exp(d13) * d14 * (-this.f24151b)));
        return (Float.floatToRawIntBits(fExp) & 4294967295L) | (Float.floatToRawIntBits((float) (dExp + this.f24150a)) << 32);
    }
}
