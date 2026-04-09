package i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: e, reason: collision with root package name */
    public static e0 f25283e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25284a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f25285b;

    /* renamed from: c, reason: collision with root package name */
    public long f25286c;

    /* renamed from: d, reason: collision with root package name */
    public long f25287d;

    public /* synthetic */ e0() {
    }

    public static void c(e0 e0Var, long j, long j8, int i4) {
        if ((i4 & 1) != 0) {
            j = 0;
        }
        if ((i4 & 2) != 0) {
            j8 = 0;
        }
        synchronized (e0Var) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j8 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j9 = e0Var.f25286c + j;
                e0Var.f25286c = j9;
                long j10 = e0Var.f25287d + j8;
                e0Var.f25287d = j10;
                if (j10 > j9) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(double d10, double d11, long j) {
        double d12 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d12) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d11) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d13 = 0.01745329238474369d * d10;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d13))) / (Math.cos(dAsin) * Math.cos(d13));
        if (dSin3 >= 1.0d) {
            this.f25285b = 1;
            this.f25286c = -1L;
            this.f25287d = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f25285b = 0;
                this.f25286c = -1L;
                this.f25287d = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f25286c = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f25287d = jRound;
            if (jRound >= j || this.f25286c <= j) {
                this.f25285b = 1;
            } else {
                this.f25285b = 0;
            }
        }
    }

    public synchronized long b() {
        return this.f25286c - this.f25287d;
    }

    public String toString() {
        switch (this.f25284a) {
            case 1:
                return "WindowCounter(streamId=" + this.f25285b + ", total=" + this.f25286c + ", acknowledged=" + this.f25287d + ", unacknowledged=" + b() + ')';
            default:
                return super.toString();
        }
    }

    public e0(int i4) {
        this.f25285b = i4;
    }
}
