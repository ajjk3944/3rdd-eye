package v1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: k, reason: collision with root package name */
    public static int f35653k;

    /* renamed from: l, reason: collision with root package name */
    public static final ja.c f35654l = new ja.c();

    /* renamed from: a, reason: collision with root package name */
    public final String f35655a;

    /* renamed from: b, reason: collision with root package name */
    public final float f35656b;

    /* renamed from: c, reason: collision with root package name */
    public final float f35657c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35658d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35659e;

    /* renamed from: f, reason: collision with root package name */
    public final f0 f35660f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final int f35661h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f35662i;
    public final int j;

    public e(String str, float f10, float f11, float f12, float f13, f0 f0Var, long j, int i4, boolean z3) {
        int i10;
        synchronized (f35654l) {
            i10 = f35653k;
            f35653k = i10 + 1;
        }
        this.f35655a = str;
        this.f35656b = f10;
        this.f35657c = f11;
        this.f35658d = f12;
        this.f35659e = f13;
        this.f35660f = f0Var;
        this.g = j;
        this.f35661h = i4;
        this.f35662i = z3;
        this.j = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return nk.k.a(this.f35655a, eVar.f35655a) && d3.f.b(this.f35656b, eVar.f35656b) && d3.f.b(this.f35657c, eVar.f35657c) && this.f35658d == eVar.f35658d && this.f35659e == eVar.f35659e && this.f35660f.equals(eVar.f35660f) && p1.s.c(this.g, eVar.g) && this.f35661h == eVar.f35661h && this.f35662i == eVar.f35662i;
    }

    public final int hashCode() {
        int iHashCode = (this.f35660f.hashCode() + r5.c.d(this.f35659e, r5.c.d(this.f35658d, r5.c.d(this.f35657c, r5.c.d(this.f35656b, this.f35655a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i4 = p1.s.f31019i;
        return ((a0.g.f(iHashCode, 31, this.g) + this.f35661h) * 31) + (this.f35662i ? 1231 : 1237);
    }
}
