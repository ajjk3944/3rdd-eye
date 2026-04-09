package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class w1 {
    public static final a0 a(r1 r1Var) {
        return new t1(r1Var);
    }

    public static /* synthetic */ a0 b(r1 r1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            r1Var = null;
        }
        return u1.a(r1Var);
    }

    public static final void c(kotlin.coroutines.d dVar, CancellationException cancellationException) {
        r1 r1Var = (r1) dVar.get(r1.H8);
        if (r1Var != null) {
            r1Var.a(cancellationException);
        }
    }

    public static /* synthetic */ void d(kotlin.coroutines.d dVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        u1.c(dVar, cancellationException);
    }

    public static final y0 e(r1 r1Var, y0 y0Var) {
        return r1Var.U(new a1(y0Var));
    }

    public static final void f(kotlin.coroutines.d dVar) {
        r1 r1Var = (r1) dVar.get(r1.H8);
        if (r1Var != null) {
            u1.h(r1Var);
        }
    }

    public static final void g(r1 r1Var) {
        if (!r1Var.isActive()) {
            throw r1Var.m();
        }
    }

    public static final r1 h(kotlin.coroutines.d dVar) {
        r1 r1Var = (r1) dVar.get(r1.H8);
        if (r1Var != null) {
            return r1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + dVar).toString());
    }
}
