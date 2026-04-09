package L0;

import Q0.AbstractC3434k;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6737x0;
import m0.C6733v0;
import m0.g1;
import m0.h1;
import mh.InterfaceC6824a;
import o0.AbstractC7040g;
import o0.C7043j;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    private static final long f11058a = Y0.w.g(14);

    /* renamed from: b, reason: collision with root package name */
    private static final long f11059b = Y0.w.g(0);

    /* renamed from: c, reason: collision with root package name */
    private static final long f11060c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f11061d;

    /* renamed from: e, reason: collision with root package name */
    private static final W0.n f11062e;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11063a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W0.n invoke() {
            return E.f11062e;
        }
    }

    static {
        C6733v0.a aVar = C6733v0.f52951b;
        f11060c = aVar.d();
        long jA = aVar.a();
        f11061d = jA;
        f11062e = W0.n.f23545a.b(jA);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final L0.D b(L0.D r21, long r22, m0.AbstractC6713l0 r24, float r25, long r26, Q0.A r28, Q0.v r29, Q0.w r30, Q0.AbstractC3434k r31, java.lang.String r32, long r33, W0.a r35, W0.o r36, S0.e r37, long r38, W0.k r40, m0.g1 r41, L0.A r42, o0.AbstractC7040g r43) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.E.b(L0.D, long, m0.l0, float, long, Q0.A, Q0.v, Q0.w, Q0.k, java.lang.String, long, W0.a, W0.o, S0.e, long, W0.k, m0.g1, L0.A, o0.g):L0.D");
    }

    public static final D c(D d10, D d11, float f10) {
        W0.n nVarB = W0.m.b(d10.t(), d11.t(), f10);
        AbstractC3434k abstractC3434k = (AbstractC3434k) d(d10.i(), d11.i(), f10);
        long jF = f(d10.k(), d11.k(), f10);
        Q0.A aN = d10.n();
        if (aN == null) {
            aN = Q0.A.f18971b.e();
        }
        Q0.A aN2 = d11.n();
        if (aN2 == null) {
            aN2 = Q0.A.f18971b.e();
        }
        Q0.A a10 = Q0.D.a(aN, aN2, f10);
        Q0.v vVar = (Q0.v) d(d10.l(), d11.l(), f10);
        Q0.w wVar = (Q0.w) d(d10.m(), d11.m(), f10);
        String str = (String) d(d10.j(), d11.j(), f10);
        long jF2 = f(d10.o(), d11.o(), f10);
        W0.a aVarE = d10.e();
        float fH = aVarE != null ? aVarE.h() : W0.a.c(0.0f);
        W0.a aVarE2 = d11.e();
        float fA = W0.b.a(fH, aVarE2 != null ? aVarE2.h() : W0.a.c(0.0f), f10);
        W0.o oVarU = d10.u();
        if (oVarU == null) {
            oVarU = W0.o.f23550c.a();
        }
        W0.o oVarU2 = d11.u();
        if (oVarU2 == null) {
            oVarU2 = W0.o.f23550c.a();
        }
        W0.o oVarA = W0.p.a(oVarU, oVarU2, f10);
        S0.e eVar = (S0.e) d(d10.p(), d11.p(), f10);
        long jH = AbstractC6737x0.h(d10.d(), d11.d(), f10);
        W0.k kVar = (W0.k) d(d10.s(), d11.s(), f10);
        g1 g1VarR = d10.r();
        if (g1VarR == null) {
            g1VarR = new g1(0L, 0L, 0.0f, 7, null);
        }
        g1 g1VarR2 = d11.r();
        if (g1VarR2 == null) {
            g1VarR2 = new g1(0L, 0L, 0.0f, 7, null);
        }
        return new D(nVarB, jF, a10, vVar, wVar, abstractC3434k, str, jF2, W0.a.b(fA), oVarA, eVar, jH, kVar, h1.a(g1VarR, g1VarR2, f10), e(d10.q(), d11.q(), f10), (AbstractC7040g) d(d10.h(), d11.h(), f10), (DefaultConstructorMarker) null);
    }

    public static final Object d(Object obj, Object obj2, float f10) {
        return ((double) f10) < 0.5d ? obj : obj2;
    }

    private static final A e(A a10, A a11, float f10) {
        if (a10 == null && a11 == null) {
            return null;
        }
        if (a10 == null) {
            a10 = A.f10968a.a();
        }
        if (a11 == null) {
            a11 = A.f10968a.a();
        }
        return AbstractC3173c.c(a10, a11, f10);
    }

    public static final long f(long j10, long j11, float f10) {
        return (Y0.w.h(j10) || Y0.w.h(j11)) ? ((Y0.v) d(Y0.v.b(j10), Y0.v.b(j11), f10)).k() : Y0.w.i(j10, j11, f10);
    }

    private static final A g(D d10, A a10) {
        return d10.q() == null ? a10 : a10 == null ? d10.q() : d10.q().b(a10);
    }

    public static final D h(D d10) {
        W0.n nVarF = d10.t().f(a.f11063a);
        long jK = Y0.w.h(d10.k()) ? f11058a : d10.k();
        Q0.A aN = d10.n();
        if (aN == null) {
            aN = Q0.A.f18971b.e();
        }
        Q0.A a10 = aN;
        Q0.v vVarL = d10.l();
        Q0.v vVarC = Q0.v.c(vVarL != null ? vVarL.i() : Q0.v.f19100b.b());
        Q0.w wVarM = d10.m();
        Q0.w wVarE = Q0.w.e(wVarM != null ? wVarM.m() : Q0.w.f19104b.a());
        AbstractC3434k abstractC3434kI = d10.i();
        if (abstractC3434kI == null) {
            abstractC3434kI = AbstractC3434k.f19069b.a();
        }
        AbstractC3434k abstractC3434k = abstractC3434kI;
        String strJ = d10.j();
        if (strJ == null) {
            strJ = "";
        }
        String str = strJ;
        long jO = Y0.w.h(d10.o()) ? f11059b : d10.o();
        W0.a aVarE = d10.e();
        W0.a aVarB = W0.a.b(aVarE != null ? aVarE.h() : W0.a.f23475b.a());
        W0.o oVarU = d10.u();
        if (oVarU == null) {
            oVarU = W0.o.f23550c.a();
        }
        W0.o oVar = oVarU;
        S0.e eVarP = d10.p();
        if (eVarP == null) {
            eVarP = S0.e.f20216c.a();
        }
        S0.e eVar = eVarP;
        long jD = d10.d();
        if (jD == 16) {
            jD = f11060c;
        }
        long j10 = jD;
        W0.k kVarS = d10.s();
        if (kVarS == null) {
            kVarS = W0.k.f23532b.c();
        }
        W0.k kVar = kVarS;
        g1 g1VarR = d10.r();
        if (g1VarR == null) {
            g1VarR = g1.f52914d.a();
        }
        g1 g1Var = g1VarR;
        A aQ = d10.q();
        AbstractC7040g abstractC7040gH = d10.h();
        if (abstractC7040gH == null) {
            abstractC7040gH = C7043j.f55038a;
        }
        return new D(nVarF, jK, a10, vVarC, wVarE, abstractC3434k, str, jO, aVarB, oVar, eVar, j10, kVar, g1Var, aQ, abstractC7040gH, (DefaultConstructorMarker) null);
    }
}
