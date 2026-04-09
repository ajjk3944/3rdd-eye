package L0;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6533i;
import m0.U0;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: g, reason: collision with root package name */
    public static final int f11084g = 8;

    /* renamed from: a, reason: collision with root package name */
    private final L f11085a;

    /* renamed from: b, reason: collision with root package name */
    private final C3181k f11086b;

    /* renamed from: c, reason: collision with root package name */
    private final long f11087c;

    /* renamed from: d, reason: collision with root package name */
    private final float f11088d;

    /* renamed from: e, reason: collision with root package name */
    private final float f11089e;

    /* renamed from: f, reason: collision with root package name */
    private final List f11090f;

    public /* synthetic */ M(L l10, C3181k c3181k, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(l10, c3181k, j10);
    }

    public static /* synthetic */ M b(M m10, L l10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = m10.f11085a;
        }
        if ((i10 & 2) != 0) {
            j10 = m10.f11087c;
        }
        return m10.a(l10, j10);
    }

    public static /* synthetic */ int p(M m10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return m10.o(i10, z10);
    }

    public final List A() {
        return this.f11090f;
    }

    public final long B() {
        return this.f11087c;
    }

    public final long C(int i10) {
        return this.f11086b.B(i10);
    }

    public final M a(L l10, long j10) {
        return new M(l10, this.f11086b, j10, null);
    }

    public final W0.i c(int i10) {
        return this.f11086b.c(i10);
    }

    public final C6533i d(int i10) {
        return this.f11086b.d(i10);
    }

    public final C6533i e(int i10) {
        return this.f11086b.e(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return AbstractC6492s.d(this.f11085a, m10.f11085a) && AbstractC6492s.d(this.f11086b, m10.f11086b) && Y0.r.e(this.f11087c, m10.f11087c) && this.f11088d == m10.f11088d && this.f11089e == m10.f11089e && AbstractC6492s.d(this.f11090f, m10.f11090f);
    }

    public final boolean f() {
        return this.f11086b.f() || ((float) Y0.r.f(this.f11087c)) < this.f11086b.h();
    }

    public final boolean g() {
        return ((float) Y0.r.g(this.f11087c)) < this.f11086b.A();
    }

    public final float h() {
        return this.f11088d;
    }

    public int hashCode() {
        return (((((((((this.f11085a.hashCode() * 31) + this.f11086b.hashCode()) * 31) + Y0.r.h(this.f11087c)) * 31) + Float.hashCode(this.f11088d)) * 31) + Float.hashCode(this.f11089e)) * 31) + this.f11090f.hashCode();
    }

    public final boolean i() {
        return g() || f();
    }

    public final float j(int i10, boolean z10) {
        return this.f11086b.i(i10, z10);
    }

    public final float k() {
        return this.f11089e;
    }

    public final L l() {
        return this.f11085a;
    }

    public final float m(int i10) {
        return this.f11086b.l(i10);
    }

    public final int n() {
        return this.f11086b.m();
    }

    public final int o(int i10, boolean z10) {
        return this.f11086b.n(i10, z10);
    }

    public final int q(int i10) {
        return this.f11086b.o(i10);
    }

    public final int r(float f10) {
        return this.f11086b.p(f10);
    }

    public final float s(int i10) {
        return this.f11086b.q(i10);
    }

    public final float t(int i10) {
        return this.f11086b.r(i10);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f11085a + ", multiParagraph=" + this.f11086b + ", size=" + ((Object) Y0.r.i(this.f11087c)) + ", firstBaseline=" + this.f11088d + ", lastBaseline=" + this.f11089e + ", placeholderRects=" + this.f11090f + ')';
    }

    public final int u(int i10) {
        return this.f11086b.s(i10);
    }

    public final float v(int i10) {
        return this.f11086b.t(i10);
    }

    public final C3181k w() {
        return this.f11086b;
    }

    public final int x(long j10) {
        return this.f11086b.u(j10);
    }

    public final W0.i y(int i10) {
        return this.f11086b.v(i10);
    }

    public final U0 z(int i10, int i11) {
        return this.f11086b.x(i10, i11);
    }

    private M(L l10, C3181k c3181k, long j10) {
        this.f11085a = l10;
        this.f11086b = c3181k;
        this.f11087c = j10;
        this.f11088d = c3181k.g();
        this.f11089e = c3181k.k();
        this.f11090f = c3181k.y();
    }
}
