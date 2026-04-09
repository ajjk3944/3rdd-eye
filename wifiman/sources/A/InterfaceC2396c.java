package A;

import r.AbstractC7535j;
import r.H;
import r.I0;

/* renamed from: A.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2396c {
    static /* synthetic */ androidx.compose.ui.e b(InterfaceC2396c interfaceC2396c, androidx.compose.ui.e eVar, H h10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
        }
        if ((i10 & 1) != 0) {
            h10 = AbstractC7535j.j(0.0f, 400.0f, Y0.n.b(I0.c(Y0.n.f24536b)), 1, null);
        }
        return interfaceC2396c.a(eVar, h10);
    }

    default androidx.compose.ui.e a(androidx.compose.ui.e eVar, H h10) {
        return c(eVar, null, h10, null);
    }

    androidx.compose.ui.e c(androidx.compose.ui.e eVar, H h10, H h11, H h12);
}
