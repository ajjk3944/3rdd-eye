package s;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7841b {
    public static final S a(InterfaceC3540l interfaceC3540l, int i10) {
        S s10;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1476348564, i10, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:63)");
        }
        Context context = (Context) interfaceC3540l.t(AndroidCompositionLocals_androidKt.g());
        P p10 = (P) interfaceC3540l.t(Q.a());
        if (p10 != null) {
            interfaceC3540l.U(1586021609);
            boolean zT = interfaceC3540l.T(context) | interfaceC3540l.T(p10);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C7840a(context, p10);
                interfaceC3540l.K(objF);
            }
            s10 = (C7840a) objF;
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(1586120933);
            interfaceC3540l.J();
            s10 = O.f60688a;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return s10;
    }
}
