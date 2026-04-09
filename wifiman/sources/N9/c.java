package n9;

import gg.AbstractC5912b;
import gg.D;
import gg.i;
import gg.z;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes3.dex */
public abstract class c {
    public static final i c(i iVar, final InterfaceC6835l actionFactory) {
        AbstractC6492s.i(iVar, "<this>");
        AbstractC6492s.i(actionFactory, "actionFactory");
        i iVarX0 = iVar.x0(new n() { // from class: n9.b
            @Override // kg.n
            public final Object apply(Object obj) {
                return c.e(actionFactory, obj);
            }
        });
        AbstractC6492s.h(iVarX0, "flatMapSingle {\n        …en(Single.just(it))\n    }");
        return iVarX0;
    }

    public static final z d(z zVar, final InterfaceC6835l actionFactory) {
        AbstractC6492s.i(zVar, "<this>");
        AbstractC6492s.i(actionFactory, "actionFactory");
        z zVarS = zVar.s(new n() { // from class: n9.a
            @Override // kg.n
            public final Object apply(Object obj) {
                return c.f(actionFactory, obj);
            }
        });
        AbstractC6492s.h(zVarS, "flatMap {\n        action…en(Single.just(it))\n    }");
        return zVarS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D e(InterfaceC6835l actionFactory, Object it) {
        AbstractC6492s.i(actionFactory, "$actionFactory");
        AbstractC6492s.h(it, "it");
        return ((AbstractC5912b) actionFactory.invoke(it)).k(z.z(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D f(InterfaceC6835l actionFactory, Object it) {
        AbstractC6492s.i(actionFactory, "$actionFactory");
        AbstractC6492s.h(it, "it");
        return ((AbstractC5912b) actionFactory.invoke(it)).k(z.z(it));
    }
}
