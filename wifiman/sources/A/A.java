package A;

import B.F;
import T.AbstractC3546o;
import T.InterfaceC3540l;

/* loaded from: classes.dex */
public abstract class A {
    public static final F a(B b10, boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(596174919, i10, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:26)");
        }
        boolean z11 = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(b10)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.c(z10)) || (i10 & 48) == 32);
        Object objF = interfaceC3540l.f();
        if (z11 || objF == InterfaceC3540l.f21100a.a()) {
            objF = e.a(b10, z10);
            interfaceC3540l.K(objF);
        }
        F f10 = (F) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return f10;
    }
}
