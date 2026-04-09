package androidx.compose.foundation.lazy.layout;

import B.F;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import mh.InterfaceC6824a;
import w.q;

/* loaded from: classes.dex */
public abstract class f {
    public static final float a(int i10, int i11, boolean z10) {
        return z10 ? b(i10, i11) + 100 : b(i10, i11);
    }

    public static final float b(int i10, int i11) {
        return i11 + (i10 * 500);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, InterfaceC6824a interfaceC6824a, F f10, q qVar, boolean z10, boolean z11, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1070136913, i10, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:46)");
        }
        androidx.compose.ui.e eVarB0 = eVar.b0(new LazyLayoutSemanticsModifier(interfaceC6824a, f10, qVar, z10, z11));
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return eVarB0;
    }
}
