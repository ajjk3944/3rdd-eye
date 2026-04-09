package l0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: l0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6533i {

    /* renamed from: e, reason: collision with root package name */
    public static final a f52340e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final C6533i f52341f = new C6533i(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    private final float f52342a;

    /* renamed from: b, reason: collision with root package name */
    private final float f52343b;

    /* renamed from: c, reason: collision with root package name */
    private final float f52344c;

    /* renamed from: d, reason: collision with root package name */
    private final float f52345d;

    /* renamed from: l0.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6533i a() {
            return C6533i.f52341f;
        }

        private a() {
        }
    }

    public C6533i(float f10, float f11, float f12, float f13) {
        this.f52342a = f10;
        this.f52343b = f11;
        this.f52344c = f12;
        this.f52345d = f13;
    }

    public static /* synthetic */ C6533i d(C6533i c6533i, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = c6533i.f52342a;
        }
        if ((i10 & 2) != 0) {
            f11 = c6533i.f52343b;
        }
        if ((i10 & 4) != 0) {
            f12 = c6533i.f52344c;
        }
        if ((i10 & 8) != 0) {
            f13 = c6533i.f52345d;
        }
        return c6533i.c(f10, f11, f12, f13);
    }

    public final boolean b(long j10) {
        return C6531g.m(j10) >= this.f52342a && C6531g.m(j10) < this.f52344c && C6531g.n(j10) >= this.f52343b && C6531g.n(j10) < this.f52345d;
    }

    public final C6533i c(float f10, float f11, float f12, float f13) {
        return new C6533i(f10, f11, f12, f13);
    }

    public final float e() {
        return this.f52345d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6533i)) {
            return false;
        }
        C6533i c6533i = (C6533i) obj;
        return Float.compare(this.f52342a, c6533i.f52342a) == 0 && Float.compare(this.f52343b, c6533i.f52343b) == 0 && Float.compare(this.f52344c, c6533i.f52344c) == 0 && Float.compare(this.f52345d, c6533i.f52345d) == 0;
    }

    public final long f() {
        return AbstractC6532h.a(this.f52342a + (r() / 2.0f), this.f52345d);
    }

    public final long g() {
        return AbstractC6532h.a(this.f52342a, this.f52345d);
    }

    public final long h() {
        return AbstractC6532h.a(this.f52344c, this.f52345d);
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f52342a) * 31) + Float.hashCode(this.f52343b)) * 31) + Float.hashCode(this.f52344c)) * 31) + Float.hashCode(this.f52345d);
    }

    public final long i() {
        return AbstractC6532h.a(this.f52342a + (r() / 2.0f), this.f52343b + (j() / 2.0f));
    }

    public final float j() {
        return this.f52345d - this.f52343b;
    }

    public final float k() {
        return this.f52342a;
    }

    public final float l() {
        return this.f52344c;
    }

    public final long m() {
        return AbstractC6538n.a(r(), j());
    }

    public final float n() {
        return this.f52343b;
    }

    public final long o() {
        return AbstractC6532h.a(this.f52342a + (r() / 2.0f), this.f52343b);
    }

    public final long p() {
        return AbstractC6532h.a(this.f52342a, this.f52343b);
    }

    public final long q() {
        return AbstractC6532h.a(this.f52344c, this.f52343b);
    }

    public final float r() {
        return this.f52344c - this.f52342a;
    }

    public final C6533i s(float f10, float f11, float f12, float f13) {
        return new C6533i(Math.max(this.f52342a, f10), Math.max(this.f52343b, f11), Math.min(this.f52344c, f12), Math.min(this.f52345d, f13));
    }

    public final C6533i t(C6533i c6533i) {
        return new C6533i(Math.max(this.f52342a, c6533i.f52342a), Math.max(this.f52343b, c6533i.f52343b), Math.min(this.f52344c, c6533i.f52344c), Math.min(this.f52345d, c6533i.f52345d));
    }

    public String toString() {
        return "Rect.fromLTRB(" + AbstractC6527c.a(this.f52342a, 1) + ", " + AbstractC6527c.a(this.f52343b, 1) + ", " + AbstractC6527c.a(this.f52344c, 1) + ", " + AbstractC6527c.a(this.f52345d, 1) + ')';
    }

    public final boolean u() {
        return this.f52342a >= this.f52344c || this.f52343b >= this.f52345d;
    }

    public final boolean v(C6533i c6533i) {
        return this.f52344c > c6533i.f52342a && c6533i.f52344c > this.f52342a && this.f52345d > c6533i.f52343b && c6533i.f52345d > this.f52343b;
    }

    public final C6533i w(float f10, float f11) {
        return new C6533i(this.f52342a + f10, this.f52343b + f11, this.f52344c + f10, this.f52345d + f11);
    }

    public final C6533i x(long j10) {
        return new C6533i(this.f52342a + C6531g.m(j10), this.f52343b + C6531g.n(j10), this.f52344c + C6531g.m(j10), this.f52345d + C6531g.n(j10));
    }
}
