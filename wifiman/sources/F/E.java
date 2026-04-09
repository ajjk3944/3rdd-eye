package F;

import L0.C3174d;
import L0.S;
import Q0.AbstractC3434k;
import R0.C3458k;
import T.InterfaceC3551q0;
import T.J0;
import T.t1;
import Zg.AbstractC3689v;
import androidx.compose.ui.platform.n1;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import m0.AbstractC6682S;
import m0.C6733v0;
import m0.S0;
import mh.InterfaceC6835l;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private S f4833a;

    /* renamed from: b, reason: collision with root package name */
    private final J0 f4834b;

    /* renamed from: c, reason: collision with root package name */
    private final n1 f4835c;

    /* renamed from: d, reason: collision with root package name */
    private final C3458k f4836d = new C3458k();

    /* renamed from: e, reason: collision with root package name */
    private R0.Z f4837e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3551q0 f4838f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3551q0 f4839g;

    /* renamed from: h, reason: collision with root package name */
    private C0.r f4840h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3551q0 f4841i;

    /* renamed from: j, reason: collision with root package name */
    private C3174d f4842j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3551q0 f4843k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3551q0 f4844l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3551q0 f4845m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3551q0 f4846n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3551q0 f4847o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f4848p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3551q0 f4849q;

    /* renamed from: r, reason: collision with root package name */
    private final A f4850r;

    /* renamed from: s, reason: collision with root package name */
    private InterfaceC6835l f4851s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC6835l f4852t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC6835l f4853u;

    /* renamed from: v, reason: collision with root package name */
    private final S0 f4854v;

    /* renamed from: w, reason: collision with root package name */
    private long f4855w;

    /* renamed from: x, reason: collision with root package name */
    private final InterfaceC3551q0 f4856x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC3551q0 f4857y;

    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        public final void a(int i10) {
            E.this.f4850r.d(i10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((R0.r) obj).p());
            return Yg.J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {
        b() {
            super(1);
        }

        public final void a(R0.Q q10) {
            String strI = q10.i();
            C3174d c3174dW = E.this.w();
            if (!AbstractC6492s.d(strI, c3174dW != null ? c3174dW.k() : null)) {
                E.this.B(EnumC2727q.None);
            }
            E e10 = E.this;
            S.a aVar = L0.S.f11103b;
            e10.I(aVar.a());
            E.this.A(aVar.a());
            E.this.f4851s.invoke(q10);
            E.this.o().invalidate();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((R0.Q) obj);
            return Yg.J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f4860a = new c();

        c() {
            super(1);
        }

        public final void a(R0.Q q10) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((R0.Q) obj);
            return Yg.J.f24997a;
        }
    }

    public E(S s10, J0 j02, n1 n1Var) {
        this.f4833a = s10;
        this.f4834b = j02;
        this.f4835c = n1Var;
        Boolean bool = Boolean.FALSE;
        this.f4838f = t1.d(bool, null, 2, null);
        this.f4839g = t1.d(Y0.h.d(Y0.h.j(0)), null, 2, null);
        this.f4841i = t1.d(null, null, 2, null);
        this.f4843k = t1.d(EnumC2727q.None, null, 2, null);
        this.f4844l = t1.d(bool, null, 2, null);
        this.f4845m = t1.d(bool, null, 2, null);
        this.f4846n = t1.d(bool, null, 2, null);
        this.f4847o = t1.d(bool, null, 2, null);
        this.f4848p = true;
        this.f4849q = t1.d(Boolean.TRUE, null, 2, null);
        this.f4850r = new A(n1Var);
        this.f4851s = c.f4860a;
        this.f4852t = new b();
        this.f4853u = new a();
        this.f4854v = AbstractC6682S.a();
        this.f4855w = C6733v0.f52951b.e();
        S.a aVar = L0.S.f11103b;
        this.f4856x = t1.d(L0.S.b(aVar.a()), null, 2, null);
        this.f4857y = t1.d(L0.S.b(aVar.a()), null, 2, null);
    }

    public final void A(long j10) {
        this.f4857y.setValue(L0.S.b(j10));
    }

    public final void B(EnumC2727q enumC2727q) {
        this.f4843k.setValue(enumC2727q);
    }

    public final void C(boolean z10) {
        this.f4838f.setValue(Boolean.valueOf(z10));
    }

    public final void D(boolean z10) {
        this.f4849q.setValue(Boolean.valueOf(z10));
    }

    public final void E(R0.Z z10) {
        this.f4837e = z10;
    }

    public final void F(C0.r rVar) {
        this.f4840h = rVar;
    }

    public final void G(j0 j0Var) {
        this.f4841i.setValue(j0Var);
        this.f4848p = false;
    }

    public final void H(float f10) {
        this.f4839g.setValue(Y0.h.d(f10));
    }

    public final void I(long j10) {
        this.f4856x.setValue(L0.S.b(j10));
    }

    public final void J(boolean z10) {
        this.f4847o.setValue(Boolean.valueOf(z10));
    }

    public final void K(boolean z10) {
        this.f4844l.setValue(Boolean.valueOf(z10));
    }

    public final void L(boolean z10) {
        this.f4846n.setValue(Boolean.valueOf(z10));
    }

    public final void M(boolean z10) {
        this.f4845m.setValue(Boolean.valueOf(z10));
    }

    public final void N(C3174d c3174d, C3174d c3174d2, L0.U u10, boolean z10, Y0.d dVar, AbstractC3434k.b bVar, InterfaceC6835l interfaceC6835l, C c10, k0.e eVar, long j10) {
        this.f4851s = interfaceC6835l;
        this.f4855w = j10;
        A a10 = this.f4850r;
        a10.f(c10);
        a10.e(eVar);
        this.f4842j = c3174d;
        S sB = T.b(this.f4833a, c3174d2, u10, dVar, bVar, (448 & 32) != 0 ? true : z10, (448 & 64) != 0 ? W0.t.f23567a.a() : 0, (448 & 128) != 0 ? Integer.MAX_VALUE : 0, (448 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 1 : 0, AbstractC3689v.l());
        if (this.f4833a != sB) {
            this.f4848p = true;
        }
        this.f4833a = sB;
    }

    public final long c() {
        return ((L0.S) this.f4857y.getValue()).r();
    }

    public final EnumC2727q d() {
        return (EnumC2727q) this.f4843k.getValue();
    }

    public final boolean e() {
        return ((Boolean) this.f4838f.getValue()).booleanValue();
    }

    public final S0 f() {
        return this.f4854v;
    }

    public final R0.Z g() {
        return this.f4837e;
    }

    public final n1 h() {
        return this.f4835c;
    }

    public final C0.r i() {
        C0.r rVar = this.f4840h;
        if (rVar == null || !rVar.M()) {
            return null;
        }
        return rVar;
    }

    public final j0 j() {
        return (j0) this.f4841i.getValue();
    }

    public final float k() {
        return ((Y0.h) this.f4839g.getValue()).s();
    }

    public final InterfaceC6835l l() {
        return this.f4853u;
    }

    public final InterfaceC6835l m() {
        return this.f4852t;
    }

    public final C3458k n() {
        return this.f4836d;
    }

    public final J0 o() {
        return this.f4834b;
    }

    public final long p() {
        return this.f4855w;
    }

    public final long q() {
        return ((L0.S) this.f4856x.getValue()).r();
    }

    public final boolean r() {
        return ((Boolean) this.f4847o.getValue()).booleanValue();
    }

    public final boolean s() {
        return ((Boolean) this.f4844l.getValue()).booleanValue();
    }

    public final boolean t() {
        return ((Boolean) this.f4846n.getValue()).booleanValue();
    }

    public final boolean u() {
        return ((Boolean) this.f4845m.getValue()).booleanValue();
    }

    public final S v() {
        return this.f4833a;
    }

    public final C3174d w() {
        return this.f4842j;
    }

    public final boolean x() {
        return (L0.S.h(q()) && L0.S.h(c())) ? false : true;
    }

    public final boolean y() {
        return ((Boolean) this.f4849q.getValue()).booleanValue();
    }

    public final boolean z() {
        return this.f4848p;
    }
}
