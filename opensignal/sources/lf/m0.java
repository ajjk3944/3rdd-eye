package lf;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public int f15342a;

    /* renamed from: b, reason: collision with root package name */
    public String f15343b;

    /* renamed from: c, reason: collision with root package name */
    public int f15344c;

    /* renamed from: d, reason: collision with root package name */
    public long f15345d;

    /* renamed from: e, reason: collision with root package name */
    public long f15346e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15347f;

    /* renamed from: g, reason: collision with root package name */
    public int f15348g;

    /* renamed from: h, reason: collision with root package name */
    public String f15349h;

    /* renamed from: i, reason: collision with root package name */
    public String f15350i;
    public byte j;

    public final n0 a() {
        String str;
        String str2;
        String str3;
        if (this.j == 63 && (str = this.f15343b) != null && (str2 = this.f15349h) != null && (str3 = this.f15350i) != null) {
            return new n0(this.f15342a, str, this.f15344c, this.f15345d, this.f15346e, this.f15347f, this.f15348g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f15343b == null) {
            sb2.append(" model");
        }
        if ((this.j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.f15349h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f15350i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(h0.b.p("Missing required properties:", sb2));
    }
}
