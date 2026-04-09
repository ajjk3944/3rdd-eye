package kotlinx.coroutines;

import kotlin.Result;

/* loaded from: classes4.dex */
public abstract class l0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(c9.c cVar) {
        Object objB;
        if (cVar instanceof kotlinx.coroutines.internal.i) {
            return cVar.toString();
        }
        try {
            Result.Companion aVar = Result.INSTANCE;
            objB = Result.b(cVar + '@' + b(cVar));
        } catch (Throwable th) {
            Result.Companion aVar2 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        if (Result.e(objB) != null) {
            objB = cVar.getClass().getName() + '@' + b(cVar);
        }
        return (String) objB;
    }
}
