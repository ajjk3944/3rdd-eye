package S6;

import J0.t;
import J0.w;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes3.dex */
public abstract class m {
    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, final k imageOptions) {
        AbstractC6492s.i(eVar, "<this>");
        AbstractC6492s.i(imageOptions, "imageOptions");
        return imageOptions.f() != null ? J0.m.c(eVar, false, new InterfaceC6835l() { // from class: S6.l
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return m.c(imageOptions, (w) obj);
            }
        }, 1, null) : eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(k kVar, w semantics) {
        AbstractC6492s.i(semantics, "$this$semantics");
        t.a0(semantics, kVar.f());
        t.i0(semantics, J0.g.f9602b.d());
        return J.f24997a;
    }
}
