package m1;

/* loaded from: classes.dex */
public final class d {
    public static int k;

    /* renamed from: l, reason: collision with root package name */
    public static final et.d f16157l = new et.d();

    /* renamed from: a, reason: collision with root package name */
    public final String f16158a;

    /* renamed from: b, reason: collision with root package name */
    public final float f16159b;

    /* renamed from: c, reason: collision with root package name */
    public final float f16160c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16161d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16162e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f16163f;

    /* renamed from: g, reason: collision with root package name */
    public final long f16164g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16165h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f16166i;
    public final int j;

    public d(String str, float f10, float f11, float f12, float f13, e0 e0Var, long j, int i10, boolean z10) {
        int i11;
        synchronized (f16157l) {
            i11 = k;
            k = i11 + 1;
        }
        this.f16158a = str;
        this.f16159b = f10;
        this.f16160c = f11;
        this.f16161d = f12;
        this.f16162e = f13;
        this.f16163f = e0Var;
        this.f16164g = j;
        this.f16165h = i10;
        this.f16166i = z10;
        this.j = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return br.l.a(this.f16158a, dVar.f16158a) && t2.f.a(this.f16159b, dVar.f16159b) && t2.f.a(this.f16160c, dVar.f16160c) && this.f16161d == dVar.f16161d && this.f16162e == dVar.f16162e && this.f16163f.equals(dVar.f16163f) && g1.r.c(this.f16164g, dVar.f16164g) && this.f16165h == dVar.f16165h && this.f16166i == dVar.f16166i;
    }

    public final int hashCode() {
        int iHashCode = (this.f16163f.hashCode() + w.g.a(w.g.a(w.g.a(w.g.a(this.f16158a.hashCode() * 31, this.f16159b, 31), this.f16160c, 31), this.f16161d, 31), this.f16162e, 31)) * 31;
        int i10 = g1.r.f9270h;
        return Boolean.hashCode(this.f16166i) + c7.a.C(this.f16165h, h0.b.b(iHashCode, 31, this.f16164g), 31);
    }
}
