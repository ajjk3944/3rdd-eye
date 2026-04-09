package ak;

/* loaded from: classes.dex */
public final class b1 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f438a;

    /* renamed from: b, reason: collision with root package name */
    public final String f439b;

    /* renamed from: c, reason: collision with root package name */
    public final long f440c;

    /* renamed from: d, reason: collision with root package name */
    public final int f441d;

    /* renamed from: e, reason: collision with root package name */
    public final long f442e;

    /* renamed from: f, reason: collision with root package name */
    public final long f443f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f444g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f445h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f446i;
    public final boolean j;
    public final yh.l k;

    /* renamed from: l, reason: collision with root package name */
    public final int f447l;

    public b1(String str, String str2, long j, int i10, long j7, long j10, boolean z10, boolean z11, boolean z12, boolean z13, yh.l lVar, int i11) {
        br.l.e(lVar, "testSize");
        this.f438a = str;
        this.f439b = str2;
        this.f440c = j;
        this.f441d = i10;
        this.f442e = j7;
        this.f443f = j10;
        this.f444g = z10;
        this.f445h = z11;
        this.f446i = z12;
        this.j = z13;
        this.k = lVar;
        this.f447l = i11;
    }

    @Override // ak.h0
    public final int a() {
        return this.f447l;
    }

    public final String b() {
        return this.f439b;
    }

    public final long c() {
        return this.f440c;
    }

    public final boolean d() {
        return this.f444g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return br.l.a(this.f438a, b1Var.f438a) && br.l.a(this.f439b, b1Var.f439b) && this.f440c == b1Var.f440c && this.f441d == b1Var.f441d && this.f442e == b1Var.f442e && this.f443f == b1Var.f443f && this.f444g == b1Var.f444g && this.f445h == b1Var.f445h && this.f446i == b1Var.f446i && this.j == b1Var.j && this.k == b1Var.k && this.f447l == b1Var.f447l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f447l) + ((this.k.hashCode() + w.g.b(w.g.b(w.g.b(w.g.b(h0.b.b(h0.b.b(c7.a.C(this.f441d, h0.b.b(c7.a.g(this.f439b, this.f438a.hashCode() * 31, 31), 31, this.f440c), 31), 31, this.f442e), 31, this.f443f), this.f444g, 31), this.f445h, 31), this.f446i, 31), this.j, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ThroughputUploadTestConfig(uploadUrl=");
        sb2.append(this.f438a);
        sb2.append(", uploadHttpMethod=");
        sb2.append(this.f439b);
        sb2.append(", uploadTimeoutMs=");
        sb2.append(this.f440c);
        sb2.append(", uploadUrlSuffixRange=");
        sb2.append(this.f441d);
        sb2.append(", uploadMonitorCollectionRateMs=");
        sb2.append(this.f442e);
        sb2.append(", uploadTrafficStatsFrequencyMs=");
        sb2.append(this.f443f);
        sb2.append(", uploadWaitForTrafficStatsToComplete=");
        sb2.append(this.f444g);
        sb2.append(", uploadSkipTrafficStatsEndTime=");
        sb2.append(this.f445h);
        sb2.append(", uploadUseServerResponseEndTime=");
        sb2.append(this.f446i);
        sb2.append(", uploadPerformHeadRequest=");
        sb2.append(this.j);
        sb2.append(", testSize=");
        sb2.append(this.k);
        sb2.append(", probability=");
        return c7.a.q(sb2, this.f447l, ')');
    }
}
