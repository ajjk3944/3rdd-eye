package I;

import L0.C3174d;
import Q0.AbstractC3434k;
import T.InterfaceC3551q0;
import T.z1;
import d0.InterfaceC5279k;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
public final class i1 implements z1, InterfaceC5279k {

    /* renamed from: c, reason: collision with root package name */
    private L0.O f8330c;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3551q0 f8328a = T.o1.h(null, c.f8351e.a());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3551q0 f8329b = T.o1.h(null, b.f8343g.a());

    /* renamed from: d, reason: collision with root package name */
    private a f8331d = new a();

    private static final class a extends androidx.compose.runtime.snapshots.n {

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f8332c;

        /* renamed from: d, reason: collision with root package name */
        private L0.S f8333d;

        /* renamed from: e, reason: collision with root package name */
        private L0.U f8334e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f8335f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f8336g;

        /* renamed from: j, reason: collision with root package name */
        private Y0.t f8339j;

        /* renamed from: k, reason: collision with root package name */
        private AbstractC3434k.b f8340k;

        /* renamed from: m, reason: collision with root package name */
        private L0.M f8342m;

        /* renamed from: h, reason: collision with root package name */
        private float f8337h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        private float f8338i = Float.NaN;

        /* renamed from: l, reason: collision with root package name */
        private long f8341l = Y0.c.b(0, 0, 0, 0, 15, null);

        public final void A(boolean z10) {
            this.f8335f = z10;
        }

        public final void B(boolean z10) {
            this.f8336g = z10;
        }

        public final void C(L0.U u10) {
            this.f8334e = u10;
        }

        public final void D(CharSequence charSequence) {
            this.f8332c = charSequence;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public void c(androidx.compose.runtime.snapshots.n nVar) {
            AbstractC6492s.g(nVar, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
            a aVar = (a) nVar;
            this.f8332c = aVar.f8332c;
            this.f8333d = aVar.f8333d;
            this.f8334e = aVar.f8334e;
            this.f8335f = aVar.f8335f;
            this.f8336g = aVar.f8336g;
            this.f8337h = aVar.f8337h;
            this.f8338i = aVar.f8338i;
            this.f8339j = aVar.f8339j;
            this.f8340k = aVar.f8340k;
            this.f8341l = aVar.f8341l;
            this.f8342m = aVar.f8342m;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public androidx.compose.runtime.snapshots.n d() {
            return new a();
        }

        public final L0.S i() {
            return this.f8333d;
        }

        public final long j() {
            return this.f8341l;
        }

        public final float k() {
            return this.f8337h;
        }

        public final AbstractC3434k.b l() {
            return this.f8340k;
        }

        public final float m() {
            return this.f8338i;
        }

        public final Y0.t n() {
            return this.f8339j;
        }

        public final L0.M o() {
            return this.f8342m;
        }

        public final boolean p() {
            return this.f8335f;
        }

        public final boolean q() {
            return this.f8336g;
        }

        public final L0.U r() {
            return this.f8334e;
        }

        public final CharSequence s() {
            return this.f8332c;
        }

        public final void t(L0.S s10) {
            this.f8333d = s10;
        }

        public String toString() {
            return "CacheRecord(visualText=" + ((Object) this.f8332c) + ", composition=" + this.f8333d + ", textStyle=" + this.f8334e + ", singleLine=" + this.f8335f + ", softWrap=" + this.f8336g + ", densityValue=" + this.f8337h + ", fontScale=" + this.f8338i + ", layoutDirection=" + this.f8339j + ", fontFamilyResolver=" + this.f8340k + ", constraints=" + ((Object) Y0.b.q(this.f8341l)) + ", layoutResult=" + this.f8342m + ')';
        }

        public final void u(long j10) {
            this.f8341l = j10;
        }

        public final void v(float f10) {
            this.f8337h = f10;
        }

        public final void w(AbstractC3434k.b bVar) {
            this.f8340k = bVar;
        }

        public final void x(float f10) {
            this.f8338i = f10;
        }

        public final void y(Y0.t tVar) {
            this.f8339j = tVar;
        }

        public final void z(L0.M m10) {
            this.f8342m = m10;
        }
    }

    private static final class b {

        /* renamed from: g, reason: collision with root package name */
        public static final C0343b f8343g = new C0343b(null);

        /* renamed from: h, reason: collision with root package name */
        private static final T.n1 f8344h = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Y0.d f8345a;

        /* renamed from: b, reason: collision with root package name */
        private final Y0.t f8346b;

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC3434k.b f8347c;

        /* renamed from: d, reason: collision with root package name */
        private final long f8348d;

        /* renamed from: e, reason: collision with root package name */
        private final float f8349e;

        /* renamed from: f, reason: collision with root package name */
        private final float f8350f;

        public static final class a implements T.n1 {
            a() {
            }

            @Override // T.n1
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public boolean a(b bVar, b bVar2) {
                if (bVar == null || bVar2 == null) {
                    if ((bVar == null) ^ (bVar2 == null)) {
                        return false;
                    }
                } else if (bVar.d() != bVar2.d() || bVar.f() != bVar2.f() || bVar.g() != bVar2.g() || !AbstractC6492s.d(bVar.e(), bVar2.e()) || !Y0.b.f(bVar.b(), bVar2.b())) {
                    return false;
                }
                return true;
            }
        }

        /* renamed from: I.i1$b$b, reason: collision with other inner class name */
        public static final class C0343b {
            public /* synthetic */ C0343b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final T.n1 a() {
                return b.f8344h;
            }

            private C0343b() {
            }
        }

        public /* synthetic */ b(Y0.d dVar, Y0.t tVar, AbstractC3434k.b bVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, tVar, bVar, j10);
        }

        public final long b() {
            return this.f8348d;
        }

        public final Y0.d c() {
            return this.f8345a;
        }

        public final float d() {
            return this.f8349e;
        }

        public final AbstractC3434k.b e() {
            return this.f8347c;
        }

        public final float f() {
            return this.f8350f;
        }

        public final Y0.t g() {
            return this.f8346b;
        }

        public String toString() {
            return "MeasureInputs(density=" + this.f8345a + ", densityValue=" + this.f8349e + ", fontScale=" + this.f8350f + ", layoutDirection=" + this.f8346b + ", fontFamilyResolver=" + this.f8347c + ", constraints=" + ((Object) Y0.b.q(this.f8348d)) + ')';
        }

        private b(Y0.d dVar, Y0.t tVar, AbstractC3434k.b bVar, long j10) {
            this.f8345a = dVar;
            this.f8346b = tVar;
            this.f8347c = bVar;
            this.f8348d = j10;
            this.f8349e = dVar.getDensity();
            this.f8350f = dVar.y();
        }
    }

    private static final class c {

        /* renamed from: e, reason: collision with root package name */
        public static final b f8351e = new b(null);

        /* renamed from: f, reason: collision with root package name */
        private static final T.n1 f8352f = new a();

        /* renamed from: a, reason: collision with root package name */
        private final o1 f8353a;

        /* renamed from: b, reason: collision with root package name */
        private final L0.U f8354b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f8355c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f8356d;

        public static final class a implements T.n1 {
            a() {
            }

            @Override // T.n1
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public boolean a(c cVar, c cVar2) {
                if (cVar == null || cVar2 == null) {
                    if ((cVar == null) ^ (cVar2 == null)) {
                        return false;
                    }
                } else if (cVar.d() != cVar2.d() || !AbstractC6492s.d(cVar.e(), cVar2.e()) || cVar.b() != cVar2.b() || cVar.c() != cVar2.c()) {
                    return false;
                }
                return true;
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final T.n1 a() {
                return c.f8352f;
            }

            private b() {
            }
        }

        public c(o1 o1Var, L0.U u10, boolean z10, boolean z11) {
            this.f8353a = o1Var;
            this.f8354b = u10;
            this.f8355c = z10;
            this.f8356d = z11;
        }

        public final boolean b() {
            return this.f8355c;
        }

        public final boolean c() {
            return this.f8356d;
        }

        public final o1 d() {
            return this.f8353a;
        }

        public final L0.U e() {
            return this.f8354b;
        }

        public String toString() {
            return "NonMeasureInputs(textFieldState=" + this.f8353a + ", textStyle=" + this.f8354b + ", singleLine=" + this.f8355c + ", softWrap=" + this.f8356d + ')';
        }
    }

    private final L0.M p(H.h hVar, c cVar, b bVar) {
        L0.O oV = v(bVar);
        C3174d.a aVar = new C3174d.a(0, 1, null);
        aVar.i(hVar.toString());
        if (hVar.c() != null) {
            aVar.c(new L0.D(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, W0.k.f23532b.d(), null, null, null, 61439, null), L0.S.l(hVar.c().r()), L0.S.k(hVar.c().r()));
        }
        return L0.O.d(oV, aVar.p(), cVar.e(), 0, cVar.c(), cVar.b() ? 1 : MPv3.MAX_MESSAGE_ID, null, bVar.b(), bVar.g(), bVar.c(), bVar.e(), false, 1060, null);
    }

    private final b q() {
        return (b) this.f8329b.getValue();
    }

    private final c r() {
        return (c) this.f8328a.getValue();
    }

    private final L0.M s(c cVar, b bVar) {
        CharSequence charSequenceS;
        H.h hVarL = cVar.d().l();
        a aVar = (a) androidx.compose.runtime.snapshots.j.F(this.f8331d);
        L0.M mO = aVar.o();
        if (mO != null && (charSequenceS = aVar.s()) != null && kotlin.text.t.x(charSequenceS, hVarL) && AbstractC6492s.d(aVar.i(), hVarL.c()) && aVar.p() == cVar.b() && aVar.q() == cVar.c() && aVar.n() == bVar.g() && aVar.k() == bVar.c().getDensity() && aVar.m() == bVar.c().y() && Y0.b.f(aVar.j(), bVar.b()) && AbstractC6492s.d(aVar.l(), bVar.e()) && !mO.w().j().c()) {
            L0.U uR = aVar.r();
            boolean zG = uR != null ? uR.G(cVar.e()) : false;
            L0.U uR2 = aVar.r();
            boolean zF = uR2 != null ? uR2.F(cVar.e()) : false;
            if (zG && zF) {
                return mO;
            }
            if (zG) {
                return L0.M.b(mO, new L0.L(mO.l().j(), cVar.e(), mO.l().g(), mO.l().e(), mO.l().h(), mO.l().f(), mO.l().b(), mO.l().d(), mO.l().c(), mO.l().a(), (DefaultConstructorMarker) null), 0L, 2, null);
            }
        }
        L0.M mP = p(hVarL, cVar, bVar);
        if (!AbstractC6492s.d(mP, mO)) {
            androidx.compose.runtime.snapshots.g gVarC = androidx.compose.runtime.snapshots.g.f28632e.c();
            if (!gVarC.i()) {
                a aVar2 = this.f8331d;
                synchronized (androidx.compose.runtime.snapshots.j.I()) {
                    a aVar3 = (a) androidx.compose.runtime.snapshots.j.h0(aVar2, this, gVarC);
                    aVar3.D(hVarL);
                    aVar3.t(hVarL.c());
                    aVar3.A(cVar.b());
                    aVar3.B(cVar.c());
                    aVar3.C(cVar.e());
                    aVar3.y(bVar.g());
                    aVar3.v(bVar.d());
                    aVar3.x(bVar.f());
                    aVar3.u(bVar.b());
                    aVar3.w(bVar.e());
                    aVar3.z(mP);
                    Yg.J j10 = Yg.J.f24997a;
                }
                androidx.compose.runtime.snapshots.j.Q(gVarC, this);
            }
        }
        return mP;
    }

    private final L0.O v(b bVar) {
        L0.O o10 = this.f8330c;
        if (o10 != null) {
            return o10;
        }
        L0.O o11 = new L0.O(bVar.e(), bVar.c(), bVar.g(), 1);
        this.f8330c = o11;
        return o11;
    }

    private final void w(b bVar) {
        this.f8329b.setValue(bVar);
    }

    private final void x(c cVar) {
        this.f8328a.setValue(cVar);
    }

    @Override // d0.InterfaceC5279k
    public void g(androidx.compose.runtime.snapshots.n nVar) {
        AbstractC6492s.g(nVar, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
        this.f8331d = (a) nVar;
    }

    @Override // d0.InterfaceC5279k
    public androidx.compose.runtime.snapshots.n i() {
        return this.f8331d;
    }

    @Override // d0.InterfaceC5279k
    public androidx.compose.runtime.snapshots.n j(androidx.compose.runtime.snapshots.n nVar, androidx.compose.runtime.snapshots.n nVar2, androidx.compose.runtime.snapshots.n nVar3) {
        return nVar3;
    }

    @Override // T.z1
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public L0.M getValue() {
        b bVarQ;
        c cVarR = r();
        if (cVarR == null || (bVarQ = q()) == null) {
            return null;
        }
        return s(cVarR, bVarQ);
    }

    public final L0.M u(Y0.d dVar, Y0.t tVar, AbstractC3434k.b bVar, long j10) {
        b bVar2 = new b(dVar, tVar, bVar, j10, null);
        w(bVar2);
        c cVarR = r();
        if (cVarR != null) {
            return s(cVarR, bVar2);
        }
        throw new IllegalStateException("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
    }

    public final void y(o1 o1Var, L0.U u10, boolean z10, boolean z11) {
        x(new c(o1Var, u10, z10, z11));
    }
}
