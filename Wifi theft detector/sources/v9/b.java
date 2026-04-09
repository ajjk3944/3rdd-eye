package v9;

import c9.c;
import d9.e;
import kotlin.Result;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.c0;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.z1;
import l9.p;

/* loaded from: classes4.dex */
public abstract class b {
    public static final void a(p pVar, Object obj, c cVar) {
        c cVarA = e.a(cVar);
        try {
            d context = cVar.getContext();
            Object objC = ThreadContextKt.c(context, null);
            try {
                Object objD = !(pVar instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.d(pVar, obj, cVarA) : ((p) x.b(pVar, 2)).invoke(obj, cVarA);
                ThreadContextKt.a(context, objC);
                if (objD != kotlin.coroutines.intrinsics.a.f()) {
                    cVarA.resumeWith(Result.b(objD));
                }
            } catch (Throwable th) {
                ThreadContextKt.a(context, objC);
                throw th;
            }
        } catch (Throwable th2) {
            Result.Companion companion = Result.INSTANCE;
            cVarA.resumeWith(Result.b(kotlin.c.a(th2)));
        }
    }

    public static final Object b(y yVar, Object obj, p pVar) {
        Object c0Var;
        try {
            c0Var = !(pVar instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.d(pVar, obj, yVar) : ((p) x.b(pVar, 2)).invoke(obj, yVar);
        } catch (Throwable th) {
            c0Var = new c0(th, false, 2, null);
        }
        if (c0Var == kotlin.coroutines.intrinsics.a.f()) {
            return kotlin.coroutines.intrinsics.a.f();
        }
        Object objT0 = yVar.t0(c0Var);
        if (objT0 == z1.f22720b) {
            return kotlin.coroutines.intrinsics.a.f();
        }
        if (objT0 instanceof c0) {
            throw ((c0) objT0).f22236a;
        }
        return z1.h(objT0);
    }

    public static final Object c(y yVar, Object obj, p pVar) throws Throwable {
        Object c0Var;
        try {
            c0Var = !(pVar instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.d(pVar, obj, yVar) : ((p) x.b(pVar, 2)).invoke(obj, yVar);
        } catch (Throwable th) {
            c0Var = new c0(th, false, 2, null);
        }
        if (c0Var == kotlin.coroutines.intrinsics.a.f()) {
            return kotlin.coroutines.intrinsics.a.f();
        }
        Object objT0 = yVar.t0(c0Var);
        if (objT0 == z1.f22720b) {
            return kotlin.coroutines.intrinsics.a.f();
        }
        if (objT0 instanceof c0) {
            Throwable th2 = ((c0) objT0).f22236a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).coroutine != yVar) {
                throw th2;
            }
            if (c0Var instanceof c0) {
                throw ((c0) c0Var).f22236a;
            }
        } else {
            c0Var = z1.h(objT0);
        }
        return c0Var;
    }
}
