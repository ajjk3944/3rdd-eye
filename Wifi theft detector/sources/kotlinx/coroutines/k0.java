package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public abstract class k0 {
    public static final j0 a(kotlin.coroutines.d dVar) {
        if (dVar.get(r1.H8) == null) {
            dVar = dVar.plus(w1.b(null, 1, null));
        }
        return new kotlinx.coroutines.internal.f(dVar);
    }

    public static final j0 b() {
        return new kotlinx.coroutines.internal.f(n2.b(null, 1, null).plus(w0.c()));
    }

    public static final void c(j0 j0Var, CancellationException cancellationException) {
        r1 r1Var = (r1) j0Var.getCoroutineContext().get(r1.H8);
        if (r1Var != null) {
            r1Var.a(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + j0Var).toString());
    }

    public static /* synthetic */ void d(j0 j0Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        c(j0Var, cancellationException);
    }

    public static final Object e(l9.p pVar, c9.c cVar) {
        kotlinx.coroutines.internal.y yVar = new kotlinx.coroutines.internal.y(cVar.getContext(), cVar);
        Object objB = v9.b.b(yVar, yVar, pVar);
        if (objB == kotlin.coroutines.intrinsics.a.f()) {
            d9.e.c(cVar);
        }
        return objB;
    }

    public static final void f(j0 j0Var) {
        u1.g(j0Var.getCoroutineContext());
    }

    public static final boolean g(j0 j0Var) {
        r1 r1Var = (r1) j0Var.getCoroutineContext().get(r1.H8);
        if (r1Var != null) {
            return r1Var.isActive();
        }
        return true;
    }

    public static final j0 h(j0 j0Var, kotlin.coroutines.d dVar) {
        return new kotlinx.coroutines.internal.f(j0Var.getCoroutineContext().plus(dVar));
    }
}
