package ak;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f413a;

    /* renamed from: b, reason: collision with root package name */
    public final long f414b;

    /* renamed from: c, reason: collision with root package name */
    public final long f415c;

    /* renamed from: d, reason: collision with root package name */
    public final long f416d;

    /* renamed from: e, reason: collision with root package name */
    public final long f417e;

    /* renamed from: f, reason: collision with root package name */
    public final long f418f;

    /* renamed from: g, reason: collision with root package name */
    public final int f419g;

    /* renamed from: h, reason: collision with root package name */
    public final long f420h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f421i;
    public final long j;
    public final long k;

    /* renamed from: l, reason: collision with root package name */
    public final int f422l;

    /* renamed from: m, reason: collision with root package name */
    public final int f423m;

    /* renamed from: n, reason: collision with root package name */
    public final long f424n;

    public a0(long j, long j7, long j10, long j11, long j12, long j13, int i10, long j14, boolean z10, long j15, long j16, int i11, int i12, long j17) {
        this.f413a = j;
        this.f414b = j7;
        this.f415c = j10;
        this.f416d = j11;
        this.f417e = j12;
        this.f418f = j13;
        this.f419g = i10;
        this.f420h = j14;
        this.f421i = z10;
        this.j = j15;
        this.k = j16;
        this.f422l = i11;
        this.f423m = i12;
        this.f424n = j17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f413a == a0Var.f413a && this.f414b == a0Var.f414b && this.f415c == a0Var.f415c && this.f416d == a0Var.f416d && this.f417e == a0Var.f417e && this.f418f == a0Var.f418f && this.f419g == a0Var.f419g && this.f420h == a0Var.f420h && this.f421i == a0Var.f421i && this.j == a0Var.j && this.k == a0Var.k && this.f422l == a0Var.f422l && this.f423m == a0Var.f423m && this.f424n == a0Var.f424n;
    }

    public final int hashCode() {
        return Long.hashCode(this.f424n) + c7.a.C(this.f423m, c7.a.C(this.f422l, h0.b.b(h0.b.b(w.g.b(h0.b.b(c7.a.C(this.f419g, h0.b.b(h0.b.b(h0.b.b(h0.b.b(h0.b.b(Long.hashCode(this.f413a) * 31, 31, this.f414b), 31, this.f415c), 31, this.f416d), 31, this.f417e), 31, this.f418f), 31), 31, this.f420h), this.f421i, 31), 31, this.j), 31, this.k), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationConfig(freshnessTimeInMillis=");
        sb2.append(this.f413a);
        sb2.append(", distanceFreshnessInMeters=");
        sb2.append(this.f414b);
        sb2.append(", newLocationTimeoutInMillis=");
        sb2.append(this.f415c);
        sb2.append(", newLocationForegroundTimeoutInMillis=");
        sb2.append(this.f416d);
        sb2.append(", locationRequestExpirationDurationMillis=");
        sb2.append(this.f417e);
        sb2.append(", locationRequestUpdateIntervalMillis=");
        sb2.append(this.f418f);
        sb2.append(", locationRequestNumberUpdates=");
        sb2.append(this.f419g);
        sb2.append(", locationRequestUpdateFastestIntervalMillis=");
        sb2.append(this.f420h);
        sb2.append(", isPassiveLocationEnabled=");
        sb2.append(this.f421i);
        sb2.append(", passiveLocationRequestFastestIntervalMillis=");
        sb2.append(this.j);
        sb2.append(", passiveLocationRequestSmallestDisplacementMeters=");
        sb2.append(this.k);
        sb2.append(", locationAgeMethod=");
        sb2.append(this.f422l);
        sb2.append(", decimalPlacesPrecision=");
        sb2.append(this.f423m);
        sb2.append(", cachingFreshnessTimeInMillis=");
        return w.g.h(sb2, this.f424n, ')');
    }
}
