package i;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: d, reason: collision with root package name */
    public static i0 f11062d;

    /* renamed from: a, reason: collision with root package name */
    public long f11063a;

    /* renamed from: b, reason: collision with root package name */
    public long f11064b;

    /* renamed from: c, reason: collision with root package name */
    public int f11065c;

    public final void a(double d6, double d10, long j) {
        double d11 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d11) * 0.03341960161924362d) + d11 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d11) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d10) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d12 = 0.01745329238474369d * d6;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d12))) / (Math.cos(dAsin) * Math.cos(d12));
        if (dSin3 >= 1.0d) {
            this.f11065c = 1;
            this.f11063a = -1L;
            this.f11064b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f11065c = 0;
                this.f11063a = -1L;
                this.f11064b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f11063a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f11064b = jRound;
            if (jRound >= j || this.f11063a <= j) {
                this.f11065c = 1;
            } else {
                this.f11065c = 0;
            }
        }
    }
}
