package ak;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f496a;

    /* renamed from: b, reason: collision with root package name */
    public final String f497b;

    /* renamed from: c, reason: collision with root package name */
    public final int f498c;

    /* renamed from: d, reason: collision with root package name */
    public final String f499d;

    /* renamed from: e, reason: collision with root package name */
    public final int f500e;

    /* renamed from: f, reason: collision with root package name */
    public final String f501f;

    public d0(int i10, int i11, String str, String str2, String str3, boolean z10) {
        this.f496a = z10;
        this.f497b = str;
        this.f498c = i10;
        this.f499d = str2;
        this.f500e = i11;
        this.f501f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f496a == d0Var.f496a && br.l.a(this.f497b, d0Var.f497b) && this.f498c == d0Var.f498c && br.l.a(this.f499d, d0Var.f499d) && this.f500e == d0Var.f500e && br.l.a(this.f501f, d0Var.f501f);
    }

    public final int hashCode() {
        return this.f501f.hashCode() + c7.a.C(this.f500e, c7.a.g(this.f499d, c7.a.C(this.f498c, c7.a.g(this.f497b, Boolean.hashCode(this.f496a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MlvisConfig(isMlvisEnabled=");
        sb2.append(this.f496a);
        sb2.append(", reportName=");
        sb2.append(this.f497b);
        sb2.append(", hardFileSizeLimitInBytes=");
        sb2.append(this.f498c);
        sb2.append(", logLevelWriteThreshold=");
        sb2.append(this.f499d);
        sb2.append(", maxLogElementsCount=");
        sb2.append(this.f500e);
        sb2.append(", exportUrl=");
        return h0.b.r(sb2, this.f501f, ')');
    }
}
