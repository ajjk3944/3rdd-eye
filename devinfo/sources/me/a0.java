package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public String f29037a;

    /* renamed from: b, reason: collision with root package name */
    public String f29038b;

    /* renamed from: c, reason: collision with root package name */
    public int f29039c;

    /* renamed from: d, reason: collision with root package name */
    public String f29040d;

    /* renamed from: e, reason: collision with root package name */
    public String f29041e;

    /* renamed from: f, reason: collision with root package name */
    public String f29042f;
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public String f29043h;

    /* renamed from: i, reason: collision with root package name */
    public String f29044i;
    public m2 j;

    /* renamed from: k, reason: collision with root package name */
    public s1 f29045k;

    /* renamed from: l, reason: collision with root package name */
    public p1 f29046l;

    /* renamed from: m, reason: collision with root package name */
    public byte f29047m;

    public final b0 a() {
        if (this.f29047m == 1 && this.f29037a != null && this.f29038b != null && this.f29040d != null && this.f29043h != null && this.f29044i != null) {
            return new b0(this.f29037a, this.f29038b, this.f29039c, this.f29040d, this.f29041e, this.f29042f, this.g, this.f29043h, this.f29044i, this.j, this.f29045k, this.f29046l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f29037a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f29038b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f29047m) == 0) {
            sb2.append(" platform");
        }
        if (this.f29040d == null) {
            sb2.append(" installationUuid");
        }
        if (this.f29043h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f29044i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(d.h.v(sb2, "Missing required properties:"));
    }
}
