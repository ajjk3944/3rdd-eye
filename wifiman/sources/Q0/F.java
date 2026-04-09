package Q0;

import Q0.U;
import android.graphics.Typeface;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    private final I f18996a = M.a();

    public U a(S s10, G g10, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        Typeface typefaceA;
        AbstractC3434k abstractC3434kC = s10.c();
        if (abstractC3434kC == null ? true : abstractC3434kC instanceof C3431h) {
            typefaceA = this.f18996a.b(s10.f(), s10.d());
        } else {
            if (!(abstractC3434kC instanceof E)) {
                return null;
            }
            typefaceA = this.f18996a.a((E) s10.c(), s10.f(), s10.d());
        }
        return new U.b(typefaceA, false, 2, null);
    }
}
