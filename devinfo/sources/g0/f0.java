package g0;

import com.google.ads.mediation.applovin.AppLovinMediationAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f24113a = new g0(e.f24108a, i1.b.j);

    public static final g0 a(b bVar, i1.d dVar, u0.p pVar, int i4) {
        if (nk.k.a(bVar, e.f24108a) && dVar.equals(i1.b.j)) {
            pVar.W(-1073830487);
            pVar.p(false);
            return f24113a;
        }
        pVar.W(-1073779616);
        boolean z3 = true;
        boolean z10 = (((i4 & 14) ^ 6) > 4 && pVar.f(bVar)) || (i4 & 6) == 4;
        if ((((i4 & AppLovinMediationAdapter.ERROR_CHILD_USER) ^ 48) <= 32 || !pVar.f(dVar)) && (i4 & 48) != 32) {
            z3 = false;
        }
        boolean z11 = z10 | z3;
        Object objL = pVar.L();
        if (z11 || objL == u0.l.f34851a) {
            objL = new g0(bVar, dVar);
            pVar.g0(objL);
        }
        g0 g0Var = (g0) objL;
        pVar.p(false);
        return g0Var;
    }
}
