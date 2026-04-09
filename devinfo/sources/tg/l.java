package tg;

import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.Set;
import sh.c0;
import u0.p;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l implements mk.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f34590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f34591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f34592c;

    public l(o oVar, c0 c0Var, Set set) {
        this.f34590a = oVar;
        this.f34591b = c0Var;
        this.f34592c = set;
    }

    @Override // mk.g
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i4;
        nm.o oVar = (nm.o) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        p pVar = (p) obj3;
        int iIntValue = ((Number) obj4).intValue();
        nk.k.e(oVar, "$this$ReorderableItem");
        if ((iIntValue & 6) == 0) {
            i4 = (pVar.f(oVar) ? 4 : 2) | iIntValue;
        } else {
            i4 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i4 |= pVar.g(zBooleanValue) ? 32 : 16;
        }
        if (pVar.O(i4 & 1, (i4 & 147) != 146)) {
            this.f34590a.o0(this.f34591b, zBooleanValue, this.f34592c, oVar.a(nm.k.f30073b, nm.l.f30084b, nm.c.f30006c), oVar.a(nm.k.f30074c, nm.l.f30085c, nm.c.f30005b), pVar, i4 & AppLovinMediationAdapter.ERROR_CHILD_USER);
        } else {
            pVar.R();
        }
        return u.f37649a;
    }
}
