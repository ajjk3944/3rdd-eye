package M9;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import j0.AbstractC6234e;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.i1;

/* loaded from: classes3.dex */
public abstract class j {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e uiCard, i1 i1Var, long j10, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        AbstractC6492s.i(uiCard, "$this$uiCard");
        interfaceC3540l.U(425170236);
        if ((i11 & 1) != 0) {
            i1Var = C6562a.f52458a.b(interfaceC3540l, C6562a.f52459b).a();
        }
        if ((i11 & 2) != 0) {
            j10 = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).e().b();
        }
        long j11 = j10;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(425170236, i10, -1, "com.ui.core.ui.component.util.uiCard (UiCardModifier.kt:14)");
        }
        androidx.compose.ui.e eVarD = androidx.compose.foundation.b.d(AbstractC6234e.a(uiCard, i1Var), j11, null, 2, null);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return eVarD;
    }
}
