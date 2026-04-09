package ak;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final double f721a;

    /* renamed from: b, reason: collision with root package name */
    public final double f722b;

    /* renamed from: c, reason: collision with root package name */
    public final String f723c;

    /* renamed from: d, reason: collision with root package name */
    public final long f724d;

    /* renamed from: e, reason: collision with root package name */
    public final long f725e;

    /* renamed from: f, reason: collision with root package name */
    public final long f726f;

    /* renamed from: g, reason: collision with root package name */
    public final double f727g;

    /* renamed from: h, reason: collision with root package name */
    public final float f728h;

    /* renamed from: i, reason: collision with root package name */
    public final float f729i;
    public final float j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f730l;

    /* renamed from: m, reason: collision with root package name */
    public final Double f731m;

    /* renamed from: n, reason: collision with root package name */
    public final Float f732n;

    /* renamed from: o, reason: collision with root package name */
    public final Float f733o;

    public /* synthetic */ u() {
        this(0.0d, 0.0d, "saved", -1L, -1L, -1L, 0.0d, 0.0f, 0.0f, 0.0f, 0, false, null, null, null);
    }

    public static u b(u uVar, double d6, double d10, int i10) {
        double d11 = (i10 & 1) != 0 ? uVar.f721a : d6;
        double d12 = (i10 & 2) != 0 ? uVar.f722b : d10;
        String str = (i10 & 4) != 0 ? uVar.f723c : "saved";
        long j = uVar.f724d;
        long j7 = uVar.f725e;
        long j10 = uVar.f726f;
        double d13 = uVar.f727g;
        float f10 = uVar.f728h;
        float f11 = uVar.f729i;
        float f12 = uVar.j;
        int i11 = uVar.k;
        boolean z10 = uVar.f730l;
        Double d14 = uVar.f731m;
        Float f13 = uVar.f732n;
        Float f14 = uVar.f733o;
        uVar.getClass();
        br.l.e(str, "provider");
        return new u(d11, d12, str, j, j7, j10, d13, f10, f11, f12, i11, z10, d14, f13, f14);
    }

    public final long a(df.c cVar, a0 a0Var) {
        long jElapsedRealtime;
        long j;
        br.l.e(cVar, "dateTimeRepository");
        br.l.e(a0Var, "locationConfig");
        if (a0Var.f422l == 1) {
            jElapsedRealtime = System.currentTimeMillis();
            j = this.f726f;
        } else {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            j = this.f724d;
        }
        return jElapsedRealtime - j;
    }

    public final boolean c() {
        return (this.f721a == 0.0d && this.f722b == 0.0d) ? false : true;
    }

    public final boolean d(df.c cVar, a0 a0Var) {
        br.l.e(cVar, "dateTimeRepository");
        br.l.e(a0Var, "locationConfig");
        if (c()) {
            return a(cVar, a0Var) < a0Var.f413a;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Double.compare(this.f721a, uVar.f721a) == 0 && Double.compare(this.f722b, uVar.f722b) == 0 && br.l.a(this.f723c, uVar.f723c) && this.f724d == uVar.f724d && this.f725e == uVar.f725e && this.f726f == uVar.f726f && Double.compare(this.f727g, uVar.f727g) == 0 && Float.compare(this.f728h, uVar.f728h) == 0 && Float.compare(this.f729i, uVar.f729i) == 0 && Float.compare(this.j, uVar.j) == 0 && this.k == uVar.k && this.f730l == uVar.f730l && br.l.a(this.f731m, uVar.f731m) && br.l.a(this.f732n, uVar.f732n) && br.l.a(this.f733o, uVar.f733o);
    }

    public final int hashCode() {
        int iB = w.g.b(c7.a.C(this.k, w.g.a(w.g.a(w.g.a(h0.b.a(this.f727g, h0.b.b(h0.b.b(h0.b.b(c7.a.g(this.f723c, h0.b.a(this.f722b, Double.hashCode(this.f721a) * 31, 31), 31), 31, this.f724d), 31, this.f725e), 31, this.f726f), 31), this.f728h, 31), this.f729i, 31), this.j, 31), 31), this.f730l, 31);
        Double d6 = this.f731m;
        int iHashCode = (iB + (d6 == null ? 0 : d6.hashCode())) * 31;
        Float f10 = this.f732n;
        int iHashCode2 = (iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f733o;
        return iHashCode2 + (f11 != null ? f11.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceLocation(latitude=" + this.f721a + ", longitude=" + this.f722b + ", provider=" + this.f723c + ", elapsedRealTimeMillis=" + this.f724d + ", receiveTime=" + this.f725e + ", utcTime=" + this.f726f + ", altitude=" + this.f727g + ", speed=" + this.f728h + ", bearing=" + this.f729i + ", accuracy=" + this.j + ", satelliteCount=" + this.k + ", isFromMockProvider=" + this.f730l + ", mslAltitudeMeters=" + this.f731m + ", mslAltitudeAccuracyMeters=" + this.f732n + ", altitudeAccuracyMeters=" + this.f733o + ')';
    }

    public u(double d6, double d10, String str, long j, long j7, long j10, double d11, float f10, float f11, float f12, int i10, boolean z10, Double d12, Float f13, Float f14) {
        this.f721a = d6;
        this.f722b = d10;
        this.f723c = str;
        this.f724d = j;
        this.f725e = j7;
        this.f726f = j10;
        this.f727g = d11;
        this.f728h = f10;
        this.f729i = f11;
        this.j = f12;
        this.k = i10;
        this.f730l = z10;
        this.f731m = d12;
        this.f732n = f13;
        this.f733o = f14;
    }
}
