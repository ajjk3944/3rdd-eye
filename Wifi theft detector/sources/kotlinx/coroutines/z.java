package kotlinx.coroutines;

import kotlin.Result;

/* loaded from: classes4.dex */
public abstract class z {
    public static final x a(r1 r1Var) {
        return new y(r1Var);
    }

    public static /* synthetic */ x b(r1 r1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            r1Var = null;
        }
        return a(r1Var);
    }

    public static final boolean c(x xVar, Object obj) {
        Throwable thE = Result.e(obj);
        return thE == null ? xVar.p(obj) : xVar.o(thE);
    }
}
