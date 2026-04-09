package pi;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class L {
    public static final I a(S s10) {
        AbstractC6492s.i(s10, "<this>");
        M0 m0Q0 = s10.Q0();
        AbstractC6492s.g(m0Q0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (I) m0Q0;
    }

    public static final boolean b(S s10) {
        AbstractC6492s.i(s10, "<this>");
        return s10.Q0() instanceof I;
    }

    public static final AbstractC7346d0 c(S s10) {
        AbstractC6492s.i(s10, "<this>");
        M0 m0Q0 = s10.Q0();
        if (m0Q0 instanceof I) {
            return ((I) m0Q0).V0();
        }
        if (m0Q0 instanceof AbstractC7346d0) {
            return (AbstractC7346d0) m0Q0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AbstractC7346d0 d(S s10) {
        AbstractC6492s.i(s10, "<this>");
        M0 m0Q0 = s10.Q0();
        if (m0Q0 instanceof I) {
            return ((I) m0Q0).W0();
        }
        if (m0Q0 instanceof AbstractC7346d0) {
            return (AbstractC7346d0) m0Q0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
