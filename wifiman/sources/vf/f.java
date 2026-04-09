package Vf;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import kotlin.jvm.internal.AbstractC6492s;
import l0.C6533i;

/* loaded from: classes4.dex */
public abstract class f {
    public static final b a(com.valentinilk.shimmer.a shimmerBounds, h hVar, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        AbstractC6492s.i(shimmerBounds, "shimmerBounds");
        interfaceC3540l.U(466348159);
        if ((i11 & 2) != 0) {
            hVar = (h) interfaceC3540l.t(j.d());
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(466348159, i10, -1, "com.valentinilk.shimmer.rememberShimmer (Shimmer.kt:11)");
        }
        d dVarA = e.a(hVar, interfaceC3540l, (i10 >> 3) & 14);
        C6533i c6533iA = com.valentinilk.shimmer.b.a(shimmerBounds, interfaceC3540l, i10 & 14);
        interfaceC3540l.U(2019749547);
        boolean zT = interfaceC3540l.T(hVar) | interfaceC3540l.T(dVarA);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            objF = new b(hVar, dVarA, c6533iA);
            interfaceC3540l.K(objF);
        }
        b bVar = (b) objF;
        interfaceC3540l.J();
        bVar.d(c6533iA);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return bVar;
    }
}
