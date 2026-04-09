package kotlinx.coroutines;

import kotlin.Result;

/* loaded from: classes4.dex */
public abstract class f0 {
    public static final Object a(Object obj, c9.c cVar) {
        if (!(obj instanceof c0)) {
            return Result.b(obj);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.b(kotlin.c.a(((c0) obj).f22236a));
    }

    public static final Object b(Object obj, o oVar) {
        Throwable thE = Result.e(obj);
        return thE == null ? obj : new c0(thE, false, 2, null);
    }

    public static final Object c(Object obj, l9.l lVar) {
        Throwable thE = Result.e(obj);
        return thE == null ? lVar != null ? new d0(obj, lVar) : obj : new c0(thE, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, l9.l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return c(obj, lVar);
    }
}
