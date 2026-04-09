package M;

import F.N;
import L0.C3174d;
import L0.S;
import L0.T;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6532h;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;

/* renamed from: M.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3233b {

    /* renamed from: h, reason: collision with root package name */
    public static final a f12191h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f12192i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C3174d f12193a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12194b;

    /* renamed from: c, reason: collision with root package name */
    private final L0.M f12195c;

    /* renamed from: d, reason: collision with root package name */
    private final R0.H f12196d;

    /* renamed from: e, reason: collision with root package name */
    private final J f12197e;

    /* renamed from: f, reason: collision with root package name */
    private long f12198f;

    /* renamed from: g, reason: collision with root package name */
    private C3174d f12199g;

    /* renamed from: M.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ AbstractC3233b(C3174d c3174d, long j10, L0.M m10, R0.H h10, J j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3174d, j10, m10, h10, j11);
    }

    private final AbstractC3233b C() {
        int iL;
        v().b();
        if (w().length() > 0 && (iL = l()) != -1) {
            T(iL);
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final AbstractC3233b E() {
        Integer numM;
        v().b();
        if (w().length() > 0 && (numM = m()) != null) {
            T(numM.intValue());
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final AbstractC3233b F() {
        int iQ;
        v().b();
        if (w().length() > 0 && (iQ = q()) != -1) {
            T(iQ);
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final AbstractC3233b H() {
        Integer numT;
        v().b();
        if (w().length() > 0 && (numT = t()) != null) {
            T(numT.intValue());
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int V() {
        return this.f12196d.b(S.i(this.f12198f));
    }

    private final int W() {
        return this.f12196d.b(S.k(this.f12198f));
    }

    private final int X() {
        return this.f12196d.b(S.l(this.f12198f));
    }

    private final int a(int i10) {
        return AbstractC7978m.g(i10, w().length() - 1);
    }

    private final int g(L0.M m10, int i10) {
        return this.f12196d.a(m10.o(m10.q(i10), true));
    }

    static /* synthetic */ int h(AbstractC3233b abstractC3233b, L0.M m10, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC3233b.W();
        }
        return abstractC3233b.g(m10, i10);
    }

    private final int j(L0.M m10, int i10) {
        return this.f12196d.a(m10.u(m10.q(i10)));
    }

    static /* synthetic */ int k(AbstractC3233b abstractC3233b, L0.M m10, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC3233b.X();
        }
        return abstractC3233b.j(m10, i10);
    }

    private final int n(L0.M m10, int i10) {
        while (i10 < this.f12193a.length()) {
            long jC = m10.C(a(i10));
            if (S.i(jC) > i10) {
                return this.f12196d.a(S.i(jC));
            }
            i10++;
        }
        return this.f12193a.length();
    }

    static /* synthetic */ int o(AbstractC3233b abstractC3233b, L0.M m10, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC3233b.V();
        }
        return abstractC3233b.n(m10, i10);
    }

    private final int r(L0.M m10, int i10) {
        while (i10 > 0) {
            long jC = m10.C(a(i10));
            if (S.n(jC) < i10) {
                return this.f12196d.a(S.n(jC));
            }
            i10--;
        }
        return 0;
    }

    static /* synthetic */ int s(AbstractC3233b abstractC3233b, L0.M m10, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC3233b.V();
        }
        return abstractC3233b.r(m10, i10);
    }

    private final boolean x() {
        L0.M m10 = this.f12195c;
        return (m10 != null ? m10.y(V()) : null) != W0.i.Rtl;
    }

    private final int y(L0.M m10, int i10) {
        int iV = V();
        if (this.f12197e.a() == null) {
            this.f12197e.c(Float.valueOf(m10.e(iV).k()));
        }
        int iQ = m10.q(iV) + i10;
        if (iQ < 0) {
            return 0;
        }
        if (iQ >= m10.n()) {
            return w().length();
        }
        float fM = m10.m(iQ) - 1;
        Float fA = this.f12197e.a();
        AbstractC6492s.f(fA);
        float fFloatValue = fA.floatValue();
        if ((x() && fFloatValue >= m10.t(iQ)) || (!x() && fFloatValue <= m10.s(iQ))) {
            return m10.o(iQ, true);
        }
        return this.f12196d.a(m10.x(AbstractC6532h.a(fA.floatValue(), fM)));
    }

    public final AbstractC3233b A() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                F();
            } else {
                C();
            }
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC3233b B() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                H();
            } else {
                E();
            }
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC3233b D() {
        v().b();
        if (w().length() > 0) {
            int iA = F.M.a(w(), S.k(this.f12198f));
            if (iA == S.k(this.f12198f) && iA != w().length()) {
                iA = F.M.a(w(), iA + 1);
            }
            T(iA);
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC3233b G() {
        v().b();
        if (w().length() > 0) {
            int iB = F.M.b(w(), S.l(this.f12198f));
            if (iB == S.l(this.f12198f) && iB != 0) {
                iB = F.M.b(w(), iB - 1);
            }
            T(iB);
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC3233b I() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                C();
            } else {
                F();
            }
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC3233b J() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                E();
            } else {
                H();
            }
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC3233b K() {
        v().b();
        if (w().length() > 0) {
            T(w().length());
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC3233b L() {
        v().b();
        if (w().length() > 0) {
            T(0);
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC3233b M() {
        Integer numF;
        v().b();
        if (w().length() > 0 && (numF = f()) != null) {
            T(numF.intValue());
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC3233b N() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                P();
            } else {
                M();
            }
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC3233b O() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                M();
            } else {
                P();
            }
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC3233b P() {
        Integer numI;
        v().b();
        if (w().length() > 0 && (numI = i()) != null) {
            T(numI.intValue());
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC3233b Q() {
        L0.M m10;
        if (w().length() > 0 && (m10 = this.f12195c) != null) {
            T(y(m10, -1));
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC3233b R() {
        v().b();
        if (w().length() > 0) {
            U(0, w().length());
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC3233b S() {
        if (w().length() > 0) {
            this.f12198f = T.b(S.n(this.f12194b), S.i(this.f12198f));
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    protected final void T(int i10) {
        U(i10, i10);
    }

    protected final void U(int i10, int i11) {
        this.f12198f = T.b(i10, i11);
    }

    public final AbstractC3233b b(InterfaceC6835l interfaceC6835l) {
        v().b();
        if (w().length() > 0) {
            if (S.h(this.f12198f)) {
                AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                interfaceC6835l.invoke(this);
            } else if (x()) {
                T(S.l(this.f12198f));
            } else {
                T(S.k(this.f12198f));
            }
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC3233b c(InterfaceC6835l interfaceC6835l) {
        v().b();
        if (w().length() > 0) {
            if (S.h(this.f12198f)) {
                AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                interfaceC6835l.invoke(this);
            } else if (x()) {
                T(S.k(this.f12198f));
            } else {
                T(S.l(this.f12198f));
            }
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC3233b d() {
        v().b();
        if (w().length() > 0) {
            T(S.i(this.f12198f));
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C3174d e() {
        return this.f12199g;
    }

    public final Integer f() {
        L0.M m10 = this.f12195c;
        if (m10 != null) {
            return Integer.valueOf(h(this, m10, 0, 1, null));
        }
        return null;
    }

    public final Integer i() {
        L0.M m10 = this.f12195c;
        if (m10 != null) {
            return Integer.valueOf(k(this, m10, 0, 1, null));
        }
        return null;
    }

    public final int l() {
        return N.a(this.f12199g.k(), S.i(this.f12198f));
    }

    public final Integer m() {
        L0.M m10 = this.f12195c;
        if (m10 != null) {
            return Integer.valueOf(o(this, m10, 0, 1, null));
        }
        return null;
    }

    public final R0.H p() {
        return this.f12196d;
    }

    public final int q() {
        return N.b(this.f12199g.k(), S.i(this.f12198f));
    }

    public final Integer t() {
        L0.M m10 = this.f12195c;
        if (m10 != null) {
            return Integer.valueOf(s(this, m10, 0, 1, null));
        }
        return null;
    }

    public final long u() {
        return this.f12198f;
    }

    public final J v() {
        return this.f12197e;
    }

    public final String w() {
        return this.f12199g.k();
    }

    public final AbstractC3233b z() {
        L0.M m10;
        if (w().length() > 0 && (m10 = this.f12195c) != null) {
            T(y(m10, 1));
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private AbstractC3233b(C3174d c3174d, long j10, L0.M m10, R0.H h10, J j11) {
        this.f12193a = c3174d;
        this.f12194b = j10;
        this.f12195c = m10;
        this.f12196d = h10;
        this.f12197e = j11;
        this.f12198f = j10;
        this.f12199g = c3174d;
    }
}
