package M;

import M.C3243l;

/* renamed from: M.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3242k {

    /* renamed from: g, reason: collision with root package name */
    public static final int f12210g = L0.M.f11084g;

    /* renamed from: a, reason: collision with root package name */
    private final long f12211a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12212b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12213c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12214d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12215e;

    /* renamed from: f, reason: collision with root package name */
    private final L0.M f12216f;

    public C3242k(long j10, int i10, int i11, int i12, int i13, L0.M m10) {
        this.f12211a = j10;
        this.f12212b = i10;
        this.f12213c = i11;
        this.f12214d = i12;
        this.f12215e = i13;
        this.f12216f = m10;
    }

    private final W0.i b() {
        return y.b(this.f12216f, this.f12214d);
    }

    private final W0.i j() {
        return y.b(this.f12216f, this.f12213c);
    }

    public final C3243l.a a(int i10) {
        return new C3243l.a(y.b(this.f12216f, i10), i10, this.f12211a);
    }

    public final String c() {
        return this.f12216f.l().j().k();
    }

    public final EnumC3236e d() {
        int i10 = this.f12213c;
        int i11 = this.f12214d;
        return i10 < i11 ? EnumC3236e.NOT_CROSSED : i10 > i11 ? EnumC3236e.CROSSED : EnumC3236e.COLLAPSED;
    }

    public final int e() {
        return this.f12214d;
    }

    public final int f() {
        return this.f12215e;
    }

    public final int g() {
        return this.f12213c;
    }

    public final long h() {
        return this.f12211a;
    }

    public final int i() {
        return this.f12212b;
    }

    public final L0.M k() {
        return this.f12216f;
    }

    public final int l() {
        return c().length();
    }

    public final boolean m(C3242k c3242k) {
        return (this.f12211a == c3242k.f12211a && this.f12213c == c3242k.f12213c && this.f12214d == c3242k.f12214d) ? false : true;
    }

    public String toString() {
        return "SelectionInfo(id=" + this.f12211a + ", range=(" + this.f12213c + '-' + j() + ',' + this.f12214d + '-' + b() + "), prevOffset=" + this.f12215e + ')';
    }
}
