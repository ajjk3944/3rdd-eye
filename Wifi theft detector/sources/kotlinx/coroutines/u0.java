package kotlinx.coroutines;

import kotlin.Result;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes4.dex */
public abstract class u0 {
    public static final void a(t0 t0Var, int i10) {
        c9.c cVarC = t0Var.c();
        boolean z10 = i10 == 4;
        if (z10 || !(cVarC instanceof kotlinx.coroutines.internal.i) || b(i10) != b(t0Var.f22692c)) {
            d(t0Var, cVarC, z10);
            return;
        }
        CoroutineDispatcher coroutineDispatcher = ((kotlinx.coroutines.internal.i) cVarC).f22535d;
        kotlin.coroutines.d context = cVarC.getContext();
        if (coroutineDispatcher.Z(context)) {
            coroutineDispatcher.X(context, t0Var);
        } else {
            e(t0Var);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final void d(t0 t0Var, c9.c cVar, boolean z10) {
        Object objG;
        Object objJ = t0Var.j();
        Throwable thF = t0Var.f(objJ);
        if (thF != null) {
            Result.Companion companion = Result.INSTANCE;
            objG = kotlin.c.a(thF);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            objG = t0Var.g(objJ);
        }
        Object objB = Result.b(objG);
        if (!z10) {
            cVar.resumeWith(objB);
            return;
        }
        kotlin.jvm.internal.p.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        kotlinx.coroutines.internal.i iVar = (kotlinx.coroutines.internal.i) cVar;
        c9.c cVar2 = iVar.f22536e;
        Object obj = iVar.f22538g;
        kotlin.coroutines.d context = cVar2.getContext();
        Object objC = ThreadContextKt.c(context, obj);
        s2 s2VarG = objC != ThreadContextKt.f22512a ? CoroutineContextKt.g(cVar2, context, objC) : null;
        try {
            iVar.f22536e.resumeWith(objB);
            y8.s sVar = y8.s.f25199a;
            if (s2VarG == null || s2VarG.U0()) {
                ThreadContextKt.a(context, objC);
            }
        } catch (Throwable th) {
            if (s2VarG == null || s2VarG.U0()) {
                ThreadContextKt.a(context, objC);
            }
            throw th;
        }
    }

    public static final void e(t0 t0Var) {
        c1 c1VarB = p2.f22589a.b();
        if (c1VarB.i0()) {
            c1VarB.e0(t0Var);
            return;
        }
        c1VarB.g0(true);
        try {
            d(t0Var, t0Var.c(), true);
            do {
            } while (c1VarB.l0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
