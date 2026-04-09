package Bh;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public interface G extends InterfaceC2503m {

    public static final class a {
        public static Object a(G g10, InterfaceC2505o visitor, Object obj) {
            AbstractC6492s.i(visitor, "visitor");
            return visitor.h(g10, obj);
        }

        public static InterfaceC2503m b(G g10) {
            return null;
        }
    }

    boolean K(G g10);

    Object b0(F f10);

    kotlin.reflect.jvm.internal.impl.builtins.i q();

    List r0();

    Collection s(Zh.c cVar, InterfaceC6835l interfaceC6835l);

    U y(Zh.c cVar);
}
