package J;

import F.N;
import I.o1;
import L0.M;
import L0.S;
import L0.T;
import androidx.compose.runtime.snapshots.g;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6532h;
import l0.C6533i;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: i, reason: collision with root package name */
    public static final a f9397i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f9398j = 8;

    /* renamed from: a, reason: collision with root package name */
    private final o1 f9399a;

    /* renamed from: b, reason: collision with root package name */
    private final M f9400b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9401c;

    /* renamed from: d, reason: collision with root package name */
    private final float f9402d;

    /* renamed from: e, reason: collision with root package name */
    private final i f9403e;

    /* renamed from: f, reason: collision with root package name */
    private final H.h f9404f;

    /* renamed from: g, reason: collision with root package name */
    private long f9405g;

    /* renamed from: h, reason: collision with root package name */
    private final String f9406h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h(o1 o1Var, M m10, boolean z10, float f10, i iVar) {
        this.f9399a = o1Var;
        this.f9400b = m10;
        this.f9401c = z10;
        this.f9402d = f10;
        this.f9403e = iVar;
        g.a aVar = androidx.compose.runtime.snapshots.g.f28632e;
        androidx.compose.runtime.snapshots.g gVarD = aVar.d();
        InterfaceC6835l interfaceC6835lH = gVarD != null ? gVarD.h() : null;
        androidx.compose.runtime.snapshots.g gVarF = aVar.f(gVarD);
        try {
            H.h hVarL = o1Var.l();
            aVar.m(gVarD, gVarF, interfaceC6835lH);
            this.f9404f = hVarL;
            this.f9405g = hVarL.f();
            this.f9406h = hVarL.toString();
        } catch (Throwable th2) {
            aVar.m(gVarD, gVarF, interfaceC6835lH);
            throw th2;
        }
    }

    private final int A(int i10) {
        int i11 = S.i(this.f9404f.f());
        if (this.f9400b == null || Float.isNaN(this.f9402d)) {
            return i11;
        }
        C6533i c6533iW = this.f9400b.e(i11).w(0.0f, this.f9402d * i10);
        float fM = this.f9400b.m(this.f9400b.r(c6533iW.n()));
        return Math.abs(c6533iW.n() - fM) > Math.abs(c6533iW.e() - fM) ? this.f9400b.x(c6533iW.p()) : this.f9400b.x(c6533iW.g());
    }

    private final h F() {
        int i10;
        int iA;
        this.f9403e.b();
        if (this.f9406h.length() > 0 && (iA = m.a(this.f9406h, (i10 = S.i(this.f9405g)), true, this.f9399a)) != i10) {
            X(iA);
        }
        return this;
    }

    private final h H() {
        this.f9403e.b();
        if (this.f9406h.length() > 0) {
            X(q());
        }
        return this;
    }

    private final h I() {
        int i10;
        int iA;
        this.f9403e.b();
        if (this.f9406h.length() > 0 && (iA = m.a(this.f9406h, (i10 = S.i(this.f9405g)), false, this.f9399a)) != i10) {
            X(iA);
        }
        return this;
    }

    private final h K() {
        this.f9403e.b();
        if (this.f9406h.length() > 0) {
            X(w());
        }
        return this;
    }

    private final void X(int i10) {
        this.f9405g = T.b(i10, i10);
    }

    private final int e(int i10) {
        return AbstractC7978m.g(i10, this.f9406h.length() - 1);
    }

    private final int k(M m10, int i10) {
        return m10.o(m10.q(i10), true);
    }

    static /* synthetic */ int l(h hVar, M m10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = S.k(hVar.f9405g);
        }
        return hVar.k(m10, i10);
    }

    private final int n(M m10, int i10) {
        return m10.u(m10.q(i10));
    }

    static /* synthetic */ int o(h hVar, M m10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = S.l(hVar.f9405g);
        }
        return hVar.n(m10, i10);
    }

    private final int r(M m10, int i10) {
        while (i10 < this.f9404f.length()) {
            long jC = m10.C(e(i10));
            if (S.i(jC) > i10) {
                return S.i(jC);
            }
            i10++;
        }
        return this.f9404f.length();
    }

    static /* synthetic */ int s(h hVar, M m10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = S.i(hVar.f9405g);
        }
        return hVar.r(m10, i10);
    }

    private final int u(M m10, int i10) {
        while (i10 > 0) {
            long jC = m10.C(e(i10));
            if (S.n(jC) < i10) {
                return S.n(jC);
            }
            i10--;
        }
        return 0;
    }

    static /* synthetic */ int v(h hVar, M m10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = S.i(hVar.f9405g);
        }
        return hVar.u(m10, i10);
    }

    private final boolean y() {
        W0.i iVarY;
        M m10 = this.f9400b;
        return m10 == null || (iVarY = m10.y(S.i(this.f9405g))) == null || iVarY == W0.i.Ltr;
    }

    private final int z(M m10, int i10) {
        int i11 = S.i(this.f9405g);
        if (Float.isNaN(this.f9403e.a())) {
            this.f9403e.c(m10.e(i11).k());
        }
        int iQ = m10.q(i11) + i10;
        if (iQ < 0) {
            return 0;
        }
        if (iQ >= m10.n()) {
            return this.f9406h.length();
        }
        float fM = m10.m(iQ) - 1;
        float fA = this.f9403e.a();
        return ((!y() || fA < m10.t(iQ)) && (y() || fA > m10.s(iQ))) ? m10.x(AbstractC6532h.a(fA, fM)) : m10.o(iQ, true);
    }

    public final h B() {
        if (this.f9400b != null && this.f9406h.length() > 0) {
            M m10 = this.f9400b;
            AbstractC6492s.f(m10);
            X(z(m10, 1));
        }
        return this;
    }

    public final h C() {
        if (this.f9406h.length() > 0) {
            X(A(1));
        }
        return this;
    }

    public final h D() {
        this.f9403e.b();
        if (this.f9406h.length() > 0) {
            if (y()) {
                I();
            } else {
                F();
            }
        }
        return this;
    }

    public final h E() {
        this.f9403e.b();
        if (this.f9406h.length() > 0) {
            if (y()) {
                K();
            } else {
                H();
            }
        }
        return this;
    }

    public final h G() {
        this.f9403e.b();
        if (this.f9406h.length() > 0) {
            int iA = F.M.a(this.f9406h, S.k(this.f9405g));
            if (iA == S.k(this.f9405g) && iA != this.f9406h.length()) {
                iA = F.M.a(this.f9406h, iA + 1);
            }
            X(iA);
        }
        return this;
    }

    public final h J() {
        this.f9403e.b();
        if (this.f9406h.length() > 0) {
            int iB = F.M.b(this.f9406h, S.l(this.f9405g));
            if (iB == S.l(this.f9405g) && iB != 0) {
                iB = F.M.b(this.f9406h, iB - 1);
            }
            X(iB);
        }
        return this;
    }

    public final h L() {
        this.f9403e.b();
        if (this.f9406h.length() > 0) {
            if (y()) {
                F();
            } else {
                I();
            }
        }
        return this;
    }

    public final h M() {
        this.f9403e.b();
        if (this.f9406h.length() > 0) {
            if (y()) {
                H();
            } else {
                K();
            }
        }
        return this;
    }

    public final h N() {
        this.f9403e.b();
        if (this.f9406h.length() > 0) {
            X(this.f9406h.length());
        }
        return this;
    }

    public final h O() {
        this.f9403e.b();
        if (this.f9406h.length() > 0) {
            X(0);
        }
        return this;
    }

    public final h P() {
        this.f9403e.b();
        if (this.f9406h.length() > 0) {
            X(j());
        }
        return this;
    }

    public final h Q() {
        this.f9403e.b();
        if (this.f9406h.length() > 0) {
            if (y()) {
                S();
            } else {
                P();
            }
        }
        return this;
    }

    public final h R() {
        this.f9403e.b();
        if (this.f9406h.length() > 0) {
            if (y()) {
                P();
            } else {
                S();
            }
        }
        return this;
    }

    public final h S() {
        this.f9403e.b();
        if (this.f9406h.length() > 0) {
            X(m());
        }
        return this;
    }

    public final h T() {
        if (this.f9400b != null && this.f9406h.length() > 0) {
            M m10 = this.f9400b;
            AbstractC6492s.f(m10);
            X(z(m10, -1));
        }
        return this;
    }

    public final h U() {
        if (this.f9406h.length() > 0) {
            X(A(-1));
        }
        return this;
    }

    public final h V() {
        this.f9403e.b();
        if (this.f9406h.length() > 0) {
            this.f9405g = T.b(0, this.f9406h.length());
        }
        return this;
    }

    public final h W() {
        if (this.f9406h.length() > 0) {
            this.f9405g = T.b(S.n(this.f9404f.f()), S.i(this.f9405g));
        }
        return this;
    }

    public final h f(InterfaceC6835l interfaceC6835l) {
        this.f9403e.b();
        if (this.f9406h.length() > 0) {
            if (S.h(this.f9405g)) {
                interfaceC6835l.invoke(this);
            } else if (y()) {
                X(S.l(this.f9405g));
            } else {
                X(S.k(this.f9405g));
            }
        }
        return this;
    }

    public final h g(InterfaceC6835l interfaceC6835l) {
        this.f9403e.b();
        if (this.f9406h.length() > 0) {
            if (S.h(this.f9405g)) {
                interfaceC6835l.invoke(this);
            } else if (y()) {
                X(S.k(this.f9405g));
            } else {
                X(S.l(this.f9405g));
            }
        }
        return this;
    }

    public final h h() {
        this.f9403e.b();
        if (this.f9406h.length() > 0) {
            X(S.i(this.f9405g));
        }
        return this;
    }

    public final H.h i() {
        return this.f9404f;
    }

    public final int j() {
        M m10 = this.f9400b;
        return m10 != null ? l(this, m10, 0, 1, null) : this.f9406h.length();
    }

    public final int m() {
        M m10 = this.f9400b;
        if (m10 != null) {
            return o(this, m10, 0, 1, null);
        }
        return 0;
    }

    public final int p() {
        return N.a(this.f9406h, S.i(this.f9405g));
    }

    public final int q() {
        M m10 = this.f9400b;
        return m10 != null ? s(this, m10, 0, 1, null) : this.f9406h.length();
    }

    public final int t() {
        return N.b(this.f9406h, S.i(this.f9405g));
    }

    public final int w() {
        M m10 = this.f9400b;
        if (m10 != null) {
            return v(this, m10, 0, 1, null);
        }
        return 0;
    }

    public final long x() {
        return this.f9405g;
    }
}
