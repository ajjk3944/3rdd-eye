package pi;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: pi.F, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7338F {
    public static /* synthetic */ B0 b(AbstractC7338F abstractC7338F, Bh.l0 l0Var, G g10, A0 a02, S s10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
        }
        if ((i10 & 8) != 0) {
            s10 = a02.e(l0Var, g10);
        }
        return abstractC7338F.a(l0Var, g10, a02, s10);
    }

    public B0 a(Bh.l0 parameter, G typeAttr, A0 typeParameterUpperBoundEraser, S erasedUpperBound) {
        AbstractC6492s.i(parameter, "parameter");
        AbstractC6492s.i(typeAttr, "typeAttr");
        AbstractC6492s.i(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        AbstractC6492s.i(erasedUpperBound, "erasedUpperBound");
        return new D0(N0.OUT_VARIANCE, erasedUpperBound);
    }
}
