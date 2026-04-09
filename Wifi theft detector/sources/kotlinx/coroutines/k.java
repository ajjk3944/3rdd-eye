package kotlinx.coroutines;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class k {
    public static final o0 a(j0 j0Var, kotlin.coroutines.d dVar, CoroutineStart coroutineStart, l9.p pVar) {
        kotlin.coroutines.d dVarE = CoroutineContextKt.e(j0Var, dVar);
        p0 a2Var = coroutineStart.g() ? new a2(dVarE, pVar) : new p0(dVarE, true);
        a2Var.T0(coroutineStart, a2Var, pVar);
        return a2Var;
    }

    public static /* synthetic */ o0 b(j0 j0Var, kotlin.coroutines.d dVar, CoroutineStart coroutineStart, l9.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = EmptyCoroutineContext.f21979a;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.f22205a;
        }
        return i.a(j0Var, dVar, coroutineStart, pVar);
    }

    public static final r1 c(j0 j0Var, kotlin.coroutines.d dVar, CoroutineStart coroutineStart, l9.p pVar) {
        kotlin.coroutines.d dVarE = CoroutineContextKt.e(j0Var, dVar);
        l2 b2Var = coroutineStart.g() ? new b2(dVarE, pVar) : new l2(dVarE, true);
        b2Var.T0(coroutineStart, b2Var, pVar);
        return b2Var;
    }

    public static /* synthetic */ r1 d(j0 j0Var, kotlin.coroutines.d dVar, CoroutineStart coroutineStart, l9.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = EmptyCoroutineContext.f21979a;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.f22205a;
        }
        return i.c(j0Var, dVar, coroutineStart, pVar);
    }

    public static final Object e(kotlin.coroutines.d dVar, l9.p pVar, c9.c cVar) throws Throwable {
        Object objU0;
        kotlin.coroutines.d context = cVar.getContext();
        kotlin.coroutines.d dVarD = CoroutineContextKt.d(context, dVar);
        u1.g(dVarD);
        if (dVarD == context) {
            kotlinx.coroutines.internal.y yVar = new kotlinx.coroutines.internal.y(dVarD, cVar);
            objU0 = v9.b.b(yVar, yVar, pVar);
        } else {
            c.b bVar = kotlin.coroutines.c.F8;
            if (kotlin.jvm.internal.p.a(dVarD.get(bVar), context.get(bVar))) {
                s2 s2Var = new s2(dVarD, cVar);
                kotlin.coroutines.d context2 = s2Var.getContext();
                Object objC = ThreadContextKt.c(context2, null);
                try {
                    Object objB = v9.b.b(s2Var, s2Var, pVar);
                    ThreadContextKt.a(context2, objC);
                    objU0 = objB;
                } catch (Throwable th) {
                    ThreadContextKt.a(context2, objC);
                    throw th;
                }
            } else {
                s0 s0Var = new s0(dVarD, cVar);
                v9.a.d(pVar, s0Var, s0Var, null, 4, null);
                objU0 = s0Var.U0();
            }
        }
        if (objU0 == kotlin.coroutines.intrinsics.a.f()) {
            d9.e.c(cVar);
        }
        return objU0;
    }
}
