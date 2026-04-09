package lf;

import java.util.List;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public String f15271a;

    /* renamed from: b, reason: collision with root package name */
    public String f15272b;

    /* renamed from: c, reason: collision with root package name */
    public String f15273c;

    /* renamed from: d, reason: collision with root package name */
    public long f15274d;

    /* renamed from: e, reason: collision with root package name */
    public Long f15275e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15276f;

    /* renamed from: g, reason: collision with root package name */
    public u1 f15277g;

    /* renamed from: h, reason: collision with root package name */
    public l2 f15278h;

    /* renamed from: i, reason: collision with root package name */
    public k2 f15279i;
    public v1 j;
    public List k;

    /* renamed from: l, reason: collision with root package name */
    public int f15280l;

    /* renamed from: m, reason: collision with root package name */
    public byte f15281m;

    public final j0 a() {
        String str;
        String str2;
        u1 u1Var;
        if (this.f15281m == 7 && (str = this.f15271a) != null && (str2 = this.f15272b) != null && (u1Var = this.f15277g) != null) {
            return new j0(str, str2, this.f15273c, this.f15274d, this.f15275e, this.f15276f, u1Var, this.f15278h, this.f15279i, this.j, this.k, this.f15280l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f15271a == null) {
            sb2.append(" generator");
        }
        if (this.f15272b == null) {
            sb2.append(" identifier");
        }
        if ((this.f15281m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f15281m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f15277g == null) {
            sb2.append(" app");
        }
        if ((this.f15281m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(h0.b.p("Missing required properties:", sb2));
    }
}
