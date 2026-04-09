package aj;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public abstract class w {
    public static final AbstractC3868b a(AbstractC3868b from, InterfaceC6835l builderAction) {
        AbstractC6492s.i(from, "from");
        AbstractC6492s.i(builderAction, "builderAction");
        C3871e c3871e = new C3871e(from);
        builderAction.invoke(c3871e);
        return new v(c3871e.a(), c3871e.b());
    }

    public static /* synthetic */ AbstractC3868b b(AbstractC3868b abstractC3868b, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC3868b = AbstractC3868b.f26328d;
        }
        return a(abstractC3868b, interfaceC6835l);
    }
}
