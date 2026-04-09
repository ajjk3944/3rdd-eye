package A;

import B.InterfaceC2449m;
import T.AbstractC3546o;
import T.InterfaceC3540l;

/* loaded from: classes.dex */
public abstract class g {
    public static final InterfaceC2449m a(B b10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1877443446, i11, -1, "androidx.compose.foundation.lazy.rememberLazyListBeyondBoundsState (LazyListBeyondBoundsModifier.kt:26)");
        }
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && interfaceC3540l.T(b10)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && interfaceC3540l.i(i10)) || (i11 & 48) == 32);
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new h(b10, i10);
            interfaceC3540l.K(objF);
        }
        h hVar = (h) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return hVar;
    }
}
