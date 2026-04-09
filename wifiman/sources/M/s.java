package M;

import F.N;
import L0.S;
import M.C3243l;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public abstract class s {

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3242k f12232a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12233b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12234c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ x f12235d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Yg.m f12236e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3242k c3242k, int i10, int i11, x xVar, Yg.m mVar) {
            super(0);
            this.f12232a = c3242k;
            this.f12233b = i10;
            this.f12234c = i11;
            this.f12235d = xVar;
            this.f12236e = mVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3243l.a invoke() {
            return s.k(this.f12232a, s.m(this.f12236e), this.f12233b, this.f12234c, this.f12235d.b(), this.f12235d.i() == EnumC3236e.CROSSED);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3242k f12237a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12238b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3242k c3242k, int i10) {
            super(0);
            this.f12237a = c3242k;
            this.f12238b = i10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(this.f12237a.k().q(this.f12238b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3243l e(x xVar, InterfaceC3234c interfaceC3234c) {
        boolean z10 = xVar.i() == EnumC3236e.CROSSED;
        return new C3243l(f(xVar.k(), z10, true, xVar.l(), interfaceC3234c), f(xVar.h(), z10, false, xVar.g(), interfaceC3234c), z10);
    }

    private static final C3243l.a f(C3242k c3242k, boolean z10, boolean z11, int i10, InterfaceC3234c interfaceC3234c) {
        int iG = z11 ? c3242k.g() : c3242k.e();
        if (i10 != c3242k.i()) {
            return c3242k.a(iG);
        }
        long jA = interfaceC3234c.a(c3242k, iG);
        return c3242k.a(z10 ^ z11 ? S.n(jA) : S.i(jA));
    }

    private static final C3243l.a g(C3243l.a aVar, C3242k c3242k, int i10) {
        return C3243l.a.b(aVar, c3242k.k().c(i10), i10, 0L, 4, null);
    }

    public static final C3243l h(C3243l c3243l, x xVar) {
        if (y.d(c3243l, xVar)) {
            return (xVar.a() > 1 || xVar.d() == null || xVar.c().c().length() == 0) ? c3243l : i(c3243l, xVar);
        }
        return c3243l;
    }

    private static final C3243l i(C3243l c3243l, x xVar) {
        C3242k c3242kC = xVar.c();
        String strC = c3242kC.c();
        int iG = c3242kC.g();
        int length = strC.length();
        if (iG == 0) {
            int iA = N.a(strC, 0);
            return xVar.b() ? C3243l.b(c3243l, g(c3243l.e(), c3242kC, iA), null, true, 2, null) : C3243l.b(c3243l, null, g(c3243l.c(), c3242kC, iA), false, 1, null);
        }
        if (iG == length) {
            int iB = N.b(strC, length);
            return xVar.b() ? C3243l.b(c3243l, g(c3243l.e(), c3242kC, iB), null, false, 2, null) : C3243l.b(c3243l, null, g(c3243l.c(), c3242kC, iB), true, 1, null);
        }
        C3243l c3243lD = xVar.d();
        boolean z10 = c3243lD != null && c3243lD.d();
        int iB2 = xVar.b() ^ z10 ? N.b(strC, iG) : N.a(strC, iG);
        return xVar.b() ? C3243l.b(c3243l, g(c3243l.e(), c3242kC, iB2), null, z10, 2, null) : C3243l.b(c3243l, null, g(c3243l.c(), c3242kC, iB2), z10, 1, null);
    }

    private static final boolean j(C3242k c3242k, int i10, boolean z10) {
        if (c3242k.f() == -1) {
            return true;
        }
        if (i10 == c3242k.f()) {
            return false;
        }
        if (z10 ^ (c3242k.d() == EnumC3236e.CROSSED)) {
            if (i10 < c3242k.f()) {
                return true;
            }
        } else if (i10 > c3242k.f()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3243l.a k(C3242k c3242k, int i10, int i11, int i12, boolean z10, boolean z11) {
        long jC = c3242k.k().C(i11);
        int iN = c3242k.k().q(S.n(jC)) == i10 ? S.n(jC) : i10 >= c3242k.k().n() ? c3242k.k().u(c3242k.k().n() - 1) : c3242k.k().u(i10);
        int i13 = c3242k.k().q(S.i(jC)) == i10 ? S.i(jC) : i10 >= c3242k.k().n() ? L0.M.p(c3242k.k(), c3242k.k().n() - 1, false, 2, null) : L0.M.p(c3242k.k(), i10, false, 2, null);
        if (iN == i12) {
            return c3242k.a(i13);
        }
        if (i13 == i12) {
            return c3242k.a(iN);
        }
        if (!(z10 ^ z11) ? i11 >= iN : i11 > i13) {
            iN = i13;
        }
        return c3242k.a(iN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3243l.a l(x xVar, C3242k c3242k, C3243l.a aVar) {
        int iG = xVar.b() ? c3242k.g() : c3242k.e();
        if ((xVar.b() ? xVar.l() : xVar.g()) != c3242k.i()) {
            return c3242k.a(iG);
        }
        Yg.q qVar = Yg.q.NONE;
        Yg.m mVarA = Yg.n.a(qVar, new b(c3242k, iG));
        Yg.m mVarA2 = Yg.n.a(qVar, new a(c3242k, iG, xVar.b() ? c3242k.e() : c3242k.g(), xVar, mVarA));
        if (c3242k.h() != aVar.d()) {
            return n(mVarA2);
        }
        int iF = c3242k.f();
        if (iG == iF) {
            return aVar;
        }
        if (m(mVarA) != c3242k.k().q(iF)) {
            return n(mVarA2);
        }
        int iC = aVar.c();
        long jC = c3242k.k().C(iC);
        return !j(c3242k, iG, xVar.b()) ? c3242k.a(iG) : (iC == S.n(jC) || iC == S.i(jC)) ? n(mVarA2) : c3242k.a(iG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(Yg.m mVar) {
        return ((Number) mVar.getValue()).intValue();
    }

    private static final C3243l.a n(Yg.m mVar) {
        return (C3243l.a) mVar.getValue();
    }
}
