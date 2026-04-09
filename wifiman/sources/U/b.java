package U;

import T.AbstractC3539k0;
import T.AbstractC3546o;
import T.AbstractC3550q;
import T.C3513a1;
import T.C3516b1;
import T.C3520d;
import T.C3541l0;
import T.C3542m;
import T.InterfaceC3548p;
import T.S0;
import T.V;
import T.y1;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: m, reason: collision with root package name */
    public static final a f22051m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    public static final int f22052n = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C3542m f22053a;

    /* renamed from: b, reason: collision with root package name */
    private U.a f22054b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22055c;

    /* renamed from: f, reason: collision with root package name */
    private int f22058f;

    /* renamed from: g, reason: collision with root package name */
    private int f22059g;

    /* renamed from: l, reason: collision with root package name */
    private int f22064l;

    /* renamed from: d, reason: collision with root package name */
    private final V f22056d = new V();

    /* renamed from: e, reason: collision with root package name */
    private boolean f22057e = true;

    /* renamed from: h, reason: collision with root package name */
    private y1 f22060h = new y1();

    /* renamed from: i, reason: collision with root package name */
    private int f22061i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f22062j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f22063k = -1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(C3542m c3542m, U.a aVar) {
        this.f22053a = c3542m;
        this.f22054b = aVar;
    }

    private final void A() {
        B();
    }

    private final void B() {
        int i10 = this.f22059g;
        if (i10 > 0) {
            this.f22054b.G(i10);
            this.f22059g = 0;
        }
        if (this.f22060h.d()) {
            this.f22054b.k(this.f22060h.i());
            this.f22060h.a();
        }
    }

    private final void C() {
        I(this, false, 1, null);
        K();
    }

    private final void D(boolean z10) {
        H(z10);
    }

    static /* synthetic */ void E(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        bVar.D(z10);
    }

    private final void F(int i10, int i11, int i12) {
        A();
        this.f22054b.u(i10, i11, i12);
    }

    private final void G() {
        int i10 = this.f22064l;
        if (i10 > 0) {
            int i11 = this.f22061i;
            if (i11 >= 0) {
                J(i11, i10);
                this.f22061i = -1;
            } else {
                F(this.f22063k, this.f22062j, i10);
                this.f22062j = -1;
                this.f22063k = -1;
            }
            this.f22064l = 0;
        }
    }

    private final void H(boolean z10) {
        int iU = z10 ? q().u() : q().k();
        int i10 = iU - this.f22058f;
        if (!(i10 >= 0)) {
            AbstractC3546o.r("Tried to seek backward");
        }
        if (i10 > 0) {
            this.f22054b.e(i10);
            this.f22058f = iU;
        }
    }

    static /* synthetic */ void I(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        bVar.H(z10);
    }

    private final void J(int i10, int i11) {
        A();
        this.f22054b.x(i10, i11);
    }

    private final void k(C3520d c3520d) {
        E(this, false, 1, null);
        this.f22054b.o(c3520d);
        this.f22055c = true;
    }

    private final void l() {
        if (this.f22055c || !this.f22057e) {
            return;
        }
        E(this, false, 1, null);
        this.f22054b.p();
        this.f22055c = true;
    }

    private final C3513a1 q() {
        return this.f22053a.J0();
    }

    public final void K() {
        C3513a1 c3513a1Q;
        int iU;
        if (q().x() <= 0 || this.f22056d.h(-2) == (iU = (c3513a1Q = q()).u())) {
            return;
        }
        l();
        if (iU > 0) {
            C3520d c3520dA = c3513a1Q.a(iU);
            this.f22056d.j(iU);
            k(c3520dA);
        }
    }

    public final void L() {
        B();
        if (this.f22055c) {
            U();
            j();
        }
    }

    public final void M(S0 s02) {
        this.f22054b.v(s02);
    }

    public final void N() {
        C();
        this.f22054b.w();
        this.f22058f += q().p();
    }

    public final void O(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                AbstractC3546o.r("Invalid remove index " + i10);
            }
            if (this.f22061i == i10) {
                this.f22064l += i11;
                return;
            }
            G();
            this.f22061i = i10;
            this.f22064l = i11;
        }
    }

    public final void P() {
        this.f22054b.y();
    }

    public final void Q() {
        this.f22055c = false;
        this.f22056d.a();
        this.f22058f = 0;
    }

    public final void R(U.a aVar) {
        this.f22054b = aVar;
    }

    public final void S(boolean z10) {
        this.f22057e = z10;
    }

    public final void T(InterfaceC6824a interfaceC6824a) {
        this.f22054b.z(interfaceC6824a);
    }

    public final void U() {
        this.f22054b.A();
    }

    public final void V(int i10) {
        if (i10 > 0) {
            C();
            this.f22054b.B(i10);
        }
    }

    public final void W(Object obj, C3520d c3520d, int i10) {
        this.f22054b.C(obj, c3520d, i10);
    }

    public final void X(Object obj) {
        E(this, false, 1, null);
        this.f22054b.D(obj);
    }

    public final void Y(Object obj, InterfaceC6839p interfaceC6839p) {
        A();
        this.f22054b.E(obj, interfaceC6839p);
    }

    public final void Z(Object obj, int i10) {
        D(true);
        this.f22054b.F(obj, i10);
    }

    public final void a(C3520d c3520d, Object obj) {
        this.f22054b.f(c3520d, obj);
    }

    public final void a0(Object obj) {
        A();
        this.f22054b.H(obj);
    }

    public final void b(List list, b0.d dVar) {
        this.f22054b.g(list, dVar);
    }

    public final void c(AbstractC3539k0 abstractC3539k0, AbstractC3550q abstractC3550q, C3541l0 c3541l0, C3541l0 c3541l02) {
        this.f22054b.h(abstractC3539k0, abstractC3550q, c3541l0, c3541l02);
    }

    public final void d() {
        E(this, false, 1, null);
        this.f22054b.i();
    }

    public final void e(b0.d dVar, C3520d c3520d) {
        B();
        this.f22054b.j(dVar, c3520d);
    }

    public final void f(InterfaceC6835l interfaceC6835l, InterfaceC3548p interfaceC3548p) {
        this.f22054b.l(interfaceC6835l, interfaceC3548p);
    }

    public final void g() {
        int iU = q().u();
        if (!(this.f22056d.h(-1) <= iU)) {
            AbstractC3546o.r("Missed recording an endGroup");
        }
        if (this.f22056d.h(-1) == iU) {
            E(this, false, 1, null);
            this.f22056d.i();
            this.f22054b.m();
        }
    }

    public final void h() {
        this.f22054b.n();
        this.f22058f = 0;
    }

    public final void i() {
        G();
    }

    public final void j() {
        if (this.f22055c) {
            E(this, false, 1, null);
            E(this, false, 1, null);
            this.f22054b.m();
            this.f22055c = false;
        }
    }

    public final void m() {
        B();
        if (this.f22056d.d()) {
            return;
        }
        AbstractC3546o.r("Missed recording an endGroup()");
    }

    public final U.a n() {
        return this.f22054b;
    }

    public final boolean o() {
        return this.f22057e;
    }

    public final boolean p() {
        return q().u() - this.f22058f < 0;
    }

    public final void r(U.a aVar, b0.d dVar) {
        this.f22054b.q(aVar, dVar);
    }

    public final void s(C3520d c3520d, C3516b1 c3516b1) {
        B();
        C();
        G();
        this.f22054b.r(c3520d, c3516b1);
    }

    public final void t(C3520d c3520d, C3516b1 c3516b1, c cVar) {
        B();
        C();
        G();
        this.f22054b.s(c3520d, c3516b1, cVar);
    }

    public final void u(int i10) {
        C();
        this.f22054b.t(i10);
    }

    public final void v(Object obj) {
        G();
        this.f22060h.h(obj);
    }

    public final void w(int i10, int i11, int i12) {
        if (i12 > 0) {
            int i13 = this.f22064l;
            if (i13 > 0 && this.f22062j == i10 - i13 && this.f22063k == i11 - i13) {
                this.f22064l = i13 + i12;
                return;
            }
            G();
            this.f22062j = i10;
            this.f22063k = i11;
            this.f22064l = i12;
        }
    }

    public final void x(int i10) {
        this.f22058f += i10 - q().k();
    }

    public final void y(int i10) {
        this.f22058f = i10;
    }

    public final void z() {
        G();
        if (this.f22060h.d()) {
            this.f22060h.g();
        } else {
            this.f22059g++;
        }
    }
}
