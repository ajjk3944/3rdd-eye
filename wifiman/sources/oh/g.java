package Oh;

import Bh.l0;
import fi.AbstractC5833e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import pi.A0;
import pi.AbstractC7338F;
import pi.B0;
import pi.D0;
import pi.G;
import pi.J0;
import pi.N0;
import pi.S;

/* loaded from: classes4.dex */
public final class g extends AbstractC7338F {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17850a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.INFLEXIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17850a = iArr;
        }
    }

    @Override // pi.AbstractC7338F
    public B0 a(l0 parameter, G typeAttr, A0 typeParameterUpperBoundEraser, S erasedUpperBound) {
        AbstractC6492s.i(parameter, "parameter");
        AbstractC6492s.i(typeAttr, "typeAttr");
        AbstractC6492s.i(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        AbstractC6492s.i(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof Oh.a)) {
            return super.a(parameter, typeAttr, typeParameterUpperBoundEraser, erasedUpperBound);
        }
        Oh.a aVarL = (Oh.a) typeAttr;
        if (!aVarL.i()) {
            aVarL = aVarL.l(c.INFLEXIBLE);
        }
        int i10 = a.f17850a[aVarL.g().ordinal()];
        if (i10 == 1) {
            return new D0(N0.INVARIANT, erasedUpperBound);
        }
        if (i10 != 2 && i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (!parameter.p().getAllowsOutPosition()) {
            return new D0(N0.INVARIANT, AbstractC5833e.m(parameter).H());
        }
        List parameters = erasedUpperBound.N0().getParameters();
        AbstractC6492s.h(parameters, "getParameters(...)");
        if (!parameters.isEmpty()) {
            return new D0(N0.OUT_VARIANCE, erasedUpperBound);
        }
        B0 b0T = J0.t(parameter, aVarL);
        AbstractC6492s.f(b0T);
        return b0T;
    }
}
