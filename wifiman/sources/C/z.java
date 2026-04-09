package C;

import B.F;
import T.AbstractC3546o;
import T.InterfaceC3540l;

/* loaded from: classes.dex */
public abstract class z {
    public static final F a(C c10, boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-786344289, i10, -1, "androidx.compose.foundation.pager.rememberPagerSemanticState (PagerSemantics.kt:26)");
        }
        boolean z11 = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(c10)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.c(z10)) || (i10 & 48) == 32);
        Object objF = interfaceC3540l.f();
        if (z11 || objF == InterfaceC3540l.f21100a.a()) {
            objF = AbstractC2519d.a(c10, z10);
            interfaceC3540l.K(objF);
        }
        F f10 = (F) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return f10;
    }
}
