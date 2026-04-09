package Jh;

import Bh.AbstractC2510u;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2515z;
import Bh.w0;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class V {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(Mh.k c10, Qh.C wildcardType) {
        Object next;
        AbstractC6492s.i(c10, "c");
        AbstractC6492s.i(wildcardType, "wildcardType");
        if (wildcardType.B() == null) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
        }
        Iterator it = new Mh.g(c10, wildcardType, false, 4, null).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) next;
            for (Zh.c cVar2 : B.f()) {
                if (AbstractC6492s.d(cVar.e(), cVar2)) {
                    break loop0;
                }
            }
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) next;
    }

    public static final boolean b(InterfaceC2492b memberDescriptor) {
        AbstractC6492s.i(memberDescriptor, "memberDescriptor");
        return (memberDescriptor instanceof InterfaceC2515z) && AbstractC6492s.d(memberDescriptor.e0(Lh.e.f11822H), Boolean.TRUE);
    }

    public static final boolean c(D javaTypeEnhancementState) {
        AbstractC6492s.i(javaTypeEnhancementState, "javaTypeEnhancementState");
        return javaTypeEnhancementState.c().invoke(B.e()) == O.STRICT;
    }

    public static final AbstractC2510u d(w0 w0Var) {
        AbstractC6492s.i(w0Var, "<this>");
        AbstractC2510u abstractC2510uG = y.g(w0Var);
        AbstractC6492s.h(abstractC2510uG, "toDescriptorVisibility(...)");
        return abstractC2510uG;
    }
}
