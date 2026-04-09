package o0;

import Y0.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6525a;
import l0.C6531g;
import l0.C6537m;
import m0.AbstractC6665E0;
import m0.AbstractC6682S;
import m0.AbstractC6697d0;
import m0.AbstractC6713l0;
import m0.AbstractC6735w0;
import m0.C6733v0;
import m0.InterfaceC6717n0;
import m0.J0;
import m0.S0;
import m0.T0;
import m0.U0;
import m0.V0;
import m0.k1;
import m0.l1;
import p0.C7182c;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7034a implements InterfaceC7039f {

    /* renamed from: a, reason: collision with root package name */
    private final C1996a f55021a = new C1996a(null, null, null, 0, 15, null);

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7037d f55022b = new b();

    /* renamed from: c, reason: collision with root package name */
    private S0 f55023c;

    /* renamed from: d, reason: collision with root package name */
    private S0 f55024d;

    /* renamed from: o0.a$a, reason: collision with other inner class name */
    public static final class C1996a {

        /* renamed from: a, reason: collision with root package name */
        private Y0.d f55025a;

        /* renamed from: b, reason: collision with root package name */
        private t f55026b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC6717n0 f55027c;

        /* renamed from: d, reason: collision with root package name */
        private long f55028d;

        public /* synthetic */ C1996a(Y0.d dVar, t tVar, InterfaceC6717n0 interfaceC6717n0, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, tVar, interfaceC6717n0, j10);
        }

        public final Y0.d a() {
            return this.f55025a;
        }

        public final t b() {
            return this.f55026b;
        }

        public final InterfaceC6717n0 c() {
            return this.f55027c;
        }

        public final long d() {
            return this.f55028d;
        }

        public final InterfaceC6717n0 e() {
            return this.f55027c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1996a)) {
                return false;
            }
            C1996a c1996a = (C1996a) obj;
            return AbstractC6492s.d(this.f55025a, c1996a.f55025a) && this.f55026b == c1996a.f55026b && AbstractC6492s.d(this.f55027c, c1996a.f55027c) && C6537m.f(this.f55028d, c1996a.f55028d);
        }

        public final Y0.d f() {
            return this.f55025a;
        }

        public final t g() {
            return this.f55026b;
        }

        public final long h() {
            return this.f55028d;
        }

        public int hashCode() {
            return (((((this.f55025a.hashCode() * 31) + this.f55026b.hashCode()) * 31) + this.f55027c.hashCode()) * 31) + C6537m.j(this.f55028d);
        }

        public final void i(InterfaceC6717n0 interfaceC6717n0) {
            this.f55027c = interfaceC6717n0;
        }

        public final void j(Y0.d dVar) {
            this.f55025a = dVar;
        }

        public final void k(t tVar) {
            this.f55026b = tVar;
        }

        public final void l(long j10) {
            this.f55028d = j10;
        }

        public String toString() {
            return "DrawParams(density=" + this.f55025a + ", layoutDirection=" + this.f55026b + ", canvas=" + this.f55027c + ", size=" + ((Object) C6537m.l(this.f55028d)) + ')';
        }

        private C1996a(Y0.d dVar, t tVar, InterfaceC6717n0 interfaceC6717n0, long j10) {
            this.f55025a = dVar;
            this.f55026b = tVar;
            this.f55027c = interfaceC6717n0;
            this.f55028d = j10;
        }

        public /* synthetic */ C1996a(Y0.d dVar, t tVar, InterfaceC6717n0 interfaceC6717n0, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? AbstractC7038e.a() : dVar, (i10 & 2) != 0 ? t.Ltr : tVar, (i10 & 4) != 0 ? new C7042i() : interfaceC6717n0, (i10 & 8) != 0 ? C6537m.f52356b.b() : j10, null);
        }
    }

    /* renamed from: o0.a$b */
    public static final class b implements InterfaceC7037d {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC7041h f55029a = AbstractC7035b.b(this);

        /* renamed from: b, reason: collision with root package name */
        private C7182c f55030b;

        b() {
        }

        @Override // o0.InterfaceC7037d
        public void a(Y0.d dVar) {
            C7034a.this.B().j(dVar);
        }

        @Override // o0.InterfaceC7037d
        public void b(t tVar) {
            C7034a.this.B().k(tVar);
        }

        @Override // o0.InterfaceC7037d
        public long c() {
            return C7034a.this.B().h();
        }

        @Override // o0.InterfaceC7037d
        public InterfaceC6717n0 d() {
            return C7034a.this.B().e();
        }

        @Override // o0.InterfaceC7037d
        public InterfaceC7041h e() {
            return this.f55029a;
        }

        @Override // o0.InterfaceC7037d
        public void f(long j10) {
            C7034a.this.B().l(j10);
        }

        @Override // o0.InterfaceC7037d
        public C7182c g() {
            return this.f55030b;
        }

        @Override // o0.InterfaceC7037d
        public Y0.d getDensity() {
            return C7034a.this.B().f();
        }

        @Override // o0.InterfaceC7037d
        public t getLayoutDirection() {
            return C7034a.this.B().g();
        }

        @Override // o0.InterfaceC7037d
        public void h(C7182c c7182c) {
            this.f55030b = c7182c;
        }

        @Override // o0.InterfaceC7037d
        public void i(InterfaceC6717n0 interfaceC6717n0) {
            C7034a.this.B().i(interfaceC6717n0);
        }
    }

    static /* synthetic */ S0 A(C7034a c7034a, AbstractC6713l0 abstractC6713l0, float f10, float f11, int i10, int i11, V0 v02, float f12, AbstractC6735w0 abstractC6735w0, int i12, int i13, int i14, Object obj) {
        return c7034a.z(abstractC6713l0, f10, f11, i10, i11, v02, f12, abstractC6735w0, i12, (i14 & 512) != 0 ? InterfaceC7039f.f55034d1.b() : i13);
    }

    private final long J(long j10, float f10) {
        return f10 == 1.0f ? j10 : C6733v0.k(j10, C6733v0.n(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private final S0 L() {
        S0 s02 = this.f55023c;
        if (s02 != null) {
            return s02;
        }
        S0 s0A = AbstractC6682S.a();
        s0A.H(T0.f52853a.a());
        this.f55023c = s0A;
        return s0A;
    }

    private final S0 M() {
        S0 s02 = this.f55024d;
        if (s02 != null) {
            return s02;
        }
        S0 s0A = AbstractC6682S.a();
        s0A.H(T0.f52853a.b());
        this.f55024d = s0A;
        return s0A;
    }

    private final S0 O(AbstractC7040g abstractC7040g) {
        if (AbstractC6492s.d(abstractC7040g, C7043j.f55038a)) {
            return L();
        }
        if (!(abstractC7040g instanceof C7044k)) {
            throw new NoWhenBranchMatchedException();
        }
        S0 s0M = M();
        C7044k c7044k = (C7044k) abstractC7040g;
        if (s0M.L() != c7044k.f()) {
            s0M.K(c7044k.f());
        }
        if (!k1.e(s0M.F(), c7044k.b())) {
            s0M.u(c7044k.b());
        }
        if (s0M.w() != c7044k.d()) {
            s0M.A(c7044k.d());
        }
        if (!l1.e(s0M.s(), c7044k.c())) {
            s0M.G(c7044k.c());
        }
        if (!AbstractC6492s.d(s0M.J(), c7044k.e())) {
            s0M.B(c7044k.e());
        }
        return s0M;
    }

    private final S0 b(long j10, AbstractC7040g abstractC7040g, float f10, AbstractC6735w0 abstractC6735w0, int i10, int i11) {
        S0 s0O = O(abstractC7040g);
        long J10 = J(j10, f10);
        if (!C6733v0.m(s0O.c(), J10)) {
            s0O.I(J10);
        }
        if (s0O.z() != null) {
            s0O.y(null);
        }
        if (!AbstractC6492s.d(s0O.p(), abstractC6735w0)) {
            s0O.D(abstractC6735w0);
        }
        if (!AbstractC6697d0.E(s0O.r(), i10)) {
            s0O.v(i10);
        }
        if (!AbstractC6665E0.d(s0O.E(), i11)) {
            s0O.C(i11);
        }
        return s0O;
    }

    static /* synthetic */ S0 p(C7034a c7034a, long j10, AbstractC7040g abstractC7040g, float f10, AbstractC6735w0 abstractC6735w0, int i10, int i11, int i12, Object obj) {
        return c7034a.b(j10, abstractC7040g, f10, abstractC6735w0, i10, (i12 & 32) != 0 ? InterfaceC7039f.f55034d1.b() : i11);
    }

    private final S0 q(AbstractC6713l0 abstractC6713l0, AbstractC7040g abstractC7040g, float f10, AbstractC6735w0 abstractC6735w0, int i10, int i11) {
        S0 s0O = O(abstractC7040g);
        if (abstractC6713l0 != null) {
            abstractC6713l0.a(c(), s0O, f10);
        } else {
            if (s0O.z() != null) {
                s0O.y(null);
            }
            long jC = s0O.c();
            C6733v0.a aVar = C6733v0.f52951b;
            if (!C6733v0.m(jC, aVar.a())) {
                s0O.I(aVar.a());
            }
            if (s0O.b() != f10) {
                s0O.a(f10);
            }
        }
        if (!AbstractC6492s.d(s0O.p(), abstractC6735w0)) {
            s0O.D(abstractC6735w0);
        }
        if (!AbstractC6697d0.E(s0O.r(), i10)) {
            s0O.v(i10);
        }
        if (!AbstractC6665E0.d(s0O.E(), i11)) {
            s0O.C(i11);
        }
        return s0O;
    }

    static /* synthetic */ S0 r(C7034a c7034a, AbstractC6713l0 abstractC6713l0, AbstractC7040g abstractC7040g, float f10, AbstractC6735w0 abstractC6735w0, int i10, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i11 = InterfaceC7039f.f55034d1.b();
        }
        return c7034a.q(abstractC6713l0, abstractC7040g, f10, abstractC6735w0, i10, i11);
    }

    private final S0 s(long j10, float f10, float f11, int i10, int i11, V0 v02, float f12, AbstractC6735w0 abstractC6735w0, int i12, int i13) {
        S0 s0M = M();
        long J10 = J(j10, f12);
        if (!C6733v0.m(s0M.c(), J10)) {
            s0M.I(J10);
        }
        if (s0M.z() != null) {
            s0M.y(null);
        }
        if (!AbstractC6492s.d(s0M.p(), abstractC6735w0)) {
            s0M.D(abstractC6735w0);
        }
        if (!AbstractC6697d0.E(s0M.r(), i12)) {
            s0M.v(i12);
        }
        if (s0M.L() != f10) {
            s0M.K(f10);
        }
        if (s0M.w() != f11) {
            s0M.A(f11);
        }
        if (!k1.e(s0M.F(), i10)) {
            s0M.u(i10);
        }
        if (!l1.e(s0M.s(), i11)) {
            s0M.G(i11);
        }
        if (!AbstractC6492s.d(s0M.J(), v02)) {
            s0M.B(v02);
        }
        if (!AbstractC6665E0.d(s0M.E(), i13)) {
            s0M.C(i13);
        }
        return s0M;
    }

    static /* synthetic */ S0 v(C7034a c7034a, long j10, float f10, float f11, int i10, int i11, V0 v02, float f12, AbstractC6735w0 abstractC6735w0, int i12, int i13, int i14, Object obj) {
        return c7034a.s(j10, f10, f11, i10, i11, v02, f12, abstractC6735w0, i12, (i14 & 512) != 0 ? InterfaceC7039f.f55034d1.b() : i13);
    }

    private final S0 z(AbstractC6713l0 abstractC6713l0, float f10, float f11, int i10, int i11, V0 v02, float f12, AbstractC6735w0 abstractC6735w0, int i12, int i13) {
        S0 s0M = M();
        if (abstractC6713l0 != null) {
            abstractC6713l0.a(c(), s0M, f12);
        } else if (s0M.b() != f12) {
            s0M.a(f12);
        }
        if (!AbstractC6492s.d(s0M.p(), abstractC6735w0)) {
            s0M.D(abstractC6735w0);
        }
        if (!AbstractC6697d0.E(s0M.r(), i12)) {
            s0M.v(i12);
        }
        if (s0M.L() != f10) {
            s0M.K(f10);
        }
        if (s0M.w() != f11) {
            s0M.A(f11);
        }
        if (!k1.e(s0M.F(), i10)) {
            s0M.u(i10);
        }
        if (!l1.e(s0M.s(), i11)) {
            s0M.G(i11);
        }
        if (!AbstractC6492s.d(s0M.J(), v02)) {
            s0M.B(v02);
        }
        if (!AbstractC6665E0.d(s0M.E(), i13)) {
            s0M.C(i13);
        }
        return s0M;
    }

    public final C1996a B() {
        return this.f55021a;
    }

    @Override // o0.InterfaceC7039f
    public void H1(J0 j02, long j10, long j11, long j12, long j13, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10, int i11) {
        this.f55021a.e().s(j02, j10, j11, j12, j13, q(null, abstractC7040g, f10, abstractC6735w0, i10, i11));
    }

    @Override // o0.InterfaceC7039f
    public void U(AbstractC6713l0 abstractC6713l0, float f10, float f11, boolean z10, long j10, long j11, float f12, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10) {
        this.f55021a.e().g(C6531g.m(j10), C6531g.n(j10), C6531g.m(j10) + C6537m.i(j11), C6531g.n(j10) + C6537m.g(j11), f10, f11, z10, r(this, abstractC6713l0, abstractC7040g, f12, abstractC6735w0, i10, 0, 32, null));
    }

    @Override // o0.InterfaceC7039f
    public void X0(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10) {
        this.f55021a.e().g(C6531g.m(j11), C6531g.n(j11), C6531g.m(j11) + C6537m.i(j12), C6531g.n(j11) + C6537m.g(j12), f10, f11, z10, p(this, j10, abstractC7040g, f12, abstractC6735w0, i10, 0, 32, null));
    }

    @Override // o0.InterfaceC7039f
    public void e1(J0 j02, long j10, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10) {
        this.f55021a.e().q(j02, j10, r(this, null, abstractC7040g, f10, abstractC6735w0, i10, 0, 32, null));
    }

    @Override // o0.InterfaceC7039f
    public void f1(AbstractC6713l0 abstractC6713l0, long j10, long j11, float f10, int i10, V0 v02, float f11, AbstractC6735w0 abstractC6735w0, int i11) {
        this.f55021a.e().h(j10, j11, A(this, abstractC6713l0, f10, 4.0f, i10, l1.f52930a.b(), v02, f11, abstractC6735w0, i11, 0, 512, null));
    }

    @Override // Y0.d
    public float getDensity() {
        return this.f55021a.f().getDensity();
    }

    @Override // o0.InterfaceC7039f
    public t getLayoutDirection() {
        return this.f55021a.g();
    }

    @Override // o0.InterfaceC7039f
    public void j0(long j10, long j11, long j12, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10) {
        this.f55021a.e().x(C6531g.m(j11), C6531g.n(j11), C6531g.m(j11) + C6537m.i(j12), C6531g.n(j11) + C6537m.g(j12), p(this, j10, abstractC7040g, f10, abstractC6735w0, i10, 0, 32, null));
    }

    @Override // o0.InterfaceC7039f
    public void j1(long j10, long j11, long j12, long j13, AbstractC7040g abstractC7040g, float f10, AbstractC6735w0 abstractC6735w0, int i10) {
        this.f55021a.e().u(C6531g.m(j11), C6531g.n(j11), C6531g.m(j11) + C6537m.i(j12), C6531g.n(j11) + C6537m.g(j12), AbstractC6525a.d(j13), AbstractC6525a.e(j13), p(this, j10, abstractC7040g, f10, abstractC6735w0, i10, 0, 32, null));
    }

    @Override // o0.InterfaceC7039f
    public InterfaceC7037d k1() {
        return this.f55022b;
    }

    @Override // o0.InterfaceC7039f
    public void l1(U0 u02, AbstractC6713l0 abstractC6713l0, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10) {
        this.f55021a.e().m(u02, r(this, abstractC6713l0, abstractC7040g, f10, abstractC6735w0, i10, 0, 32, null));
    }

    @Override // o0.InterfaceC7039f
    public void m0(long j10, float f10, long j11, float f11, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10) {
        this.f55021a.e().w(j11, f10, p(this, j10, abstractC7040g, f11, abstractC6735w0, i10, 0, 32, null));
    }

    @Override // o0.InterfaceC7039f
    public void m1(AbstractC6713l0 abstractC6713l0, long j10, long j11, long j12, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10) {
        this.f55021a.e().u(C6531g.m(j10), C6531g.n(j10), C6531g.m(j10) + C6537m.i(j11), C6531g.n(j10) + C6537m.g(j11), AbstractC6525a.d(j12), AbstractC6525a.e(j12), r(this, abstractC6713l0, abstractC7040g, f10, abstractC6735w0, i10, 0, 32, null));
    }

    @Override // o0.InterfaceC7039f
    public void p0(AbstractC6713l0 abstractC6713l0, long j10, long j11, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10) {
        this.f55021a.e().x(C6531g.m(j10), C6531g.n(j10), C6531g.m(j10) + C6537m.i(j11), C6531g.n(j10) + C6537m.g(j11), r(this, abstractC6713l0, abstractC7040g, f10, abstractC6735w0, i10, 0, 32, null));
    }

    @Override // o0.InterfaceC7039f
    public void t0(U0 u02, long j10, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10) {
        this.f55021a.e().m(u02, p(this, j10, abstractC7040g, f10, abstractC6735w0, i10, 0, 32, null));
    }

    @Override // Y0.l
    public float y() {
        return this.f55021a.f().y();
    }

    @Override // o0.InterfaceC7039f
    public void z0(long j10, long j11, long j12, float f10, int i10, V0 v02, float f11, AbstractC6735w0 abstractC6735w0, int i11) {
        this.f55021a.e().h(j11, j12, v(this, j10, f10, 4.0f, i10, l1.f52930a.b(), v02, f11, abstractC6735w0, i11, 0, 512, null));
    }
}
