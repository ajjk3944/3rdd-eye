package kotlinx.coroutines;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.time.DurationUnit;

/* loaded from: classes4.dex */
public abstract class r0 {
    public static final Object a(long j10, c9.c cVar) {
        if (j10 <= 0) {
            return y8.s.f25199a;
        }
        p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        pVar.F();
        if (j10 < Long.MAX_VALUE) {
            c(pVar.getContext()).b(j10, pVar);
        }
        Object objW = pVar.w();
        if (objW == kotlin.coroutines.intrinsics.a.f()) {
            d9.e.c(cVar);
        }
        return objW == kotlin.coroutines.intrinsics.a.f() ? objW : y8.s.f25199a;
    }

    public static final Object b(long j10, c9.c cVar) {
        Object objA = a(d(j10), cVar);
        return objA == kotlin.coroutines.intrinsics.a.f() ? objA : y8.s.f25199a;
    }

    public static final q0 c(kotlin.coroutines.d dVar) {
        d.b bVar = dVar.get(kotlin.coroutines.c.F8);
        q0 q0Var = bVar instanceof q0 ? (q0) bVar : null;
        return q0Var == null ? n0.a() : q0Var;
    }

    public static final long d(long j10) {
        boolean zE = t9.b.E(j10);
        if (zE) {
            return t9.b.q(t9.b.F(j10, t9.d.t(999999L, DurationUnit.f22188a)));
        }
        if (zE) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }
}
