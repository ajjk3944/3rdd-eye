package lf;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public String f15145a;

    /* renamed from: b, reason: collision with root package name */
    public String f15146b;

    /* renamed from: c, reason: collision with root package name */
    public int f15147c;

    /* renamed from: d, reason: collision with root package name */
    public String f15148d;

    /* renamed from: e, reason: collision with root package name */
    public String f15149e;

    /* renamed from: f, reason: collision with root package name */
    public String f15150f;

    /* renamed from: g, reason: collision with root package name */
    public String f15151g;

    /* renamed from: h, reason: collision with root package name */
    public String f15152h;

    /* renamed from: i, reason: collision with root package name */
    public String f15153i;
    public m2 j;
    public s1 k;

    /* renamed from: l, reason: collision with root package name */
    public p1 f15154l;

    /* renamed from: m, reason: collision with root package name */
    public byte f15155m;

    public final b0 a() {
        if (this.f15155m == 1 && this.f15145a != null && this.f15146b != null && this.f15148d != null && this.f15152h != null && this.f15153i != null) {
            return new b0(this.f15145a, this.f15146b, this.f15147c, this.f15148d, this.f15149e, this.f15150f, this.f15151g, this.f15152h, this.f15153i, this.j, this.k, this.f15154l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f15145a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f15146b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f15155m) == 0) {
            sb2.append(" platform");
        }
        if (this.f15148d == null) {
            sb2.append(" installationUuid");
        }
        if (this.f15152h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f15153i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(h0.b.p("Missing required properties:", sb2));
    }
}
