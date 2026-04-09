package pi;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class F0 {
    public static final AbstractC7346d0 a(S s10) {
        AbstractC6492s.i(s10, "<this>");
        M0 m0Q0 = s10.Q0();
        AbstractC7346d0 abstractC7346d0 = m0Q0 instanceof AbstractC7346d0 ? (AbstractC7346d0) m0Q0 : null;
        if (abstractC7346d0 != null) {
            return abstractC7346d0;
        }
        throw new IllegalStateException(("This is should be simple type: " + s10).toString());
    }

    public static final S b(S s10, List newArguments, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h newAnnotations) {
        AbstractC6492s.i(s10, "<this>");
        AbstractC6492s.i(newArguments, "newArguments");
        AbstractC6492s.i(newAnnotations, "newAnnotations");
        return e(s10, newArguments, newAnnotations, null, 4, null);
    }

    public static final S c(S s10, List newArguments, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h newAnnotations, List newArgumentsForUpperBound) {
        AbstractC6492s.i(s10, "<this>");
        AbstractC6492s.i(newArguments, "newArguments");
        AbstractC6492s.i(newAnnotations, "newAnnotations");
        AbstractC6492s.i(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArguments.isEmpty() || newArguments == s10.L0()) && newAnnotations == s10.getAnnotations()) {
            return s10;
        }
        r0 r0VarM0 = s10.M0();
        if ((newAnnotations instanceof kotlin.reflect.jvm.internal.impl.descriptors.annotations.p) && ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.p) newAnnotations).isEmpty()) {
            newAnnotations = kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b();
        }
        r0 r0VarA = s0.a(r0VarM0, newAnnotations);
        M0 m0Q0 = s10.Q0();
        if (m0Q0 instanceof I) {
            I i10 = (I) m0Q0;
            return V.e(d(i10.V0(), newArguments, r0VarA), d(i10.W0(), newArgumentsForUpperBound, r0VarA));
        }
        if (m0Q0 instanceof AbstractC7346d0) {
            return d((AbstractC7346d0) m0Q0, newArguments, r0VarA);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AbstractC7346d0 d(AbstractC7346d0 abstractC7346d0, List newArguments, r0 newAttributes) {
        AbstractC6492s.i(abstractC7346d0, "<this>");
        AbstractC6492s.i(newArguments, "newArguments");
        AbstractC6492s.i(newAttributes, "newAttributes");
        return (newArguments.isEmpty() && newAttributes == abstractC7346d0.M0()) ? abstractC7346d0 : newArguments.isEmpty() ? abstractC7346d0.T0(newAttributes) : abstractC7346d0 instanceof kotlin.reflect.jvm.internal.impl.types.error.i ? ((kotlin.reflect.jvm.internal.impl.types.error.i) abstractC7346d0).Z0(newArguments) : V.k(newAttributes, abstractC7346d0.N0(), newArguments, abstractC7346d0.O0(), null, 16, null);
    }

    public static /* synthetic */ S e(S s10, List list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = s10.L0();
        }
        if ((i10 & 2) != 0) {
            hVar = s10.getAnnotations();
        }
        if ((i10 & 4) != 0) {
            list2 = list;
        }
        return c(s10, list, hVar, list2);
    }

    public static /* synthetic */ AbstractC7346d0 f(AbstractC7346d0 abstractC7346d0, List list, r0 r0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = abstractC7346d0.L0();
        }
        if ((i10 & 2) != 0) {
            r0Var = abstractC7346d0.M0();
        }
        return d(abstractC7346d0, list, r0Var);
    }
}
