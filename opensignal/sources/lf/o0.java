package lf;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public long f15378a;

    /* renamed from: b, reason: collision with root package name */
    public String f15379b;

    /* renamed from: c, reason: collision with root package name */
    public d2 f15380c;

    /* renamed from: d, reason: collision with root package name */
    public e2 f15381d;

    /* renamed from: e, reason: collision with root package name */
    public f2 f15382e;

    /* renamed from: f, reason: collision with root package name */
    public i2 f15383f;

    /* renamed from: g, reason: collision with root package name */
    public byte f15384g;

    public final p0 a() {
        String str;
        d2 d2Var;
        e2 e2Var;
        if (this.f15384g == 1 && (str = this.f15379b) != null && (d2Var = this.f15380c) != null && (e2Var = this.f15381d) != null) {
            return new p0(this.f15378a, str, d2Var, e2Var, this.f15382e, this.f15383f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f15384g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f15379b == null) {
            sb2.append(" type");
        }
        if (this.f15380c == null) {
            sb2.append(" app");
        }
        if (this.f15381d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(h0.b.p("Missing required properties:", sb2));
    }
}
