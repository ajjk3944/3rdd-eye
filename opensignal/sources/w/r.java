package w;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final int f24142a;

    /* renamed from: d, reason: collision with root package name */
    public final o f24143d;

    /* renamed from: g, reason: collision with root package name */
    public final long f24144g;

    /* renamed from: r, reason: collision with root package name */
    public final long f24145r;

    public r(int i10, int i11, o oVar) {
        this.f24142a = i10;
        this.f24143d = oVar;
        this.f24144g = i10 * 1000000;
        this.f24145r = i11 * 1000000;
    }

    @Override // w.q
    public final float b(long j, float f10, float f11, float f12) {
        long j7 = j - this.f24145r;
        if (j7 < 0) {
            j7 = 0;
        }
        long j10 = this.f24144g;
        long j11 = j7 > j10 ? j10 : j7;
        if (j11 == 0) {
            return f12;
        }
        return (e(j11, f10, f11, f12) - e(j11 - 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // w.q
    public final long c(float f10, float f11, float f12) {
        return this.f24145r + this.f24144g;
    }

    @Override // w.q
    public final float e(long j, float f10, float f11, float f12) {
        long j7 = j - this.f24145r;
        if (j7 < 0) {
            j7 = 0;
        }
        long j10 = this.f24144g;
        if (j7 > j10) {
            j7 = j10;
        }
        float fA = this.f24143d.a(this.f24142a == 0 ? 1.0f : j7 / j10);
        return (f11 * fA) + ((1 - fA) * f10);
    }
}
