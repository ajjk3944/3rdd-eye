package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes4.dex */
public abstract class d {
    public static final Object b(kotlin.coroutines.d dVar, Object obj, Object obj2, l9.p pVar, c9.c cVar) {
        Object objC = ThreadContextKt.c(dVar, obj2);
        try {
            o oVar = new o(cVar, dVar);
            Object objD = !(pVar instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.d(pVar, obj, oVar) : ((l9.p) x.b(pVar, 2)).invoke(obj, oVar);
            ThreadContextKt.a(dVar, objC);
            if (objD == kotlin.coroutines.intrinsics.a.f()) {
                d9.e.c(cVar);
            }
            return objD;
        } catch (Throwable th) {
            ThreadContextKt.a(dVar, objC);
            throw th;
        }
    }

    public static /* synthetic */ Object c(kotlin.coroutines.d dVar, Object obj, Object obj2, l9.p pVar, c9.c cVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = ThreadContextKt.b(dVar);
        }
        return b(dVar, obj, obj2, pVar, cVar);
    }

    public static final kotlinx.coroutines.flow.c d(kotlinx.coroutines.flow.c cVar, kotlin.coroutines.d dVar) {
        return cVar instanceof n ? true : cVar instanceof k ? cVar : new UndispatchedContextCollector(cVar, dVar);
    }
}
