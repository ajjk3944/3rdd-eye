package C;

import B.InterfaceC2449m;
import T.AbstractC3546o;
import T.InterfaceC3540l;

/* loaded from: classes.dex */
public abstract class h {
    public static final InterfaceC2449m a(C c10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(373558254, i11, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:25)");
        }
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && interfaceC3540l.T(c10)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && interfaceC3540l.i(i10)) || (i11 & 48) == 32);
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new i(c10, i10);
            interfaceC3540l.K(objF);
        }
        i iVar = (i) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return iVar;
    }
}
