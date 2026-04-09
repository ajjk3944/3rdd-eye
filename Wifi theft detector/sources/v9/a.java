package v9;

import c9.c;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.internal.j;
import l9.l;
import l9.p;
import y8.s;

/* loaded from: classes4.dex */
public abstract class a {
    public static final void a(c cVar, Throwable th) throws Throwable {
        Result.Companion companion = Result.INSTANCE;
        cVar.resumeWith(Result.b(kotlin.c.a(th)));
        throw th;
    }

    public static final void b(c cVar, c cVar2) throws Throwable {
        try {
            c cVarC = IntrinsicsKt__IntrinsicsJvmKt.c(cVar);
            Result.Companion companion = Result.INSTANCE;
            j.c(cVarC, Result.b(s.f25199a), null, 2, null);
        } catch (Throwable th) {
            a(cVar2, th);
        }
    }

    public static final void c(p pVar, Object obj, c cVar, l lVar) throws Throwable {
        try {
            c cVarC = IntrinsicsKt__IntrinsicsJvmKt.c(IntrinsicsKt__IntrinsicsJvmKt.a(pVar, obj, cVar));
            Result.Companion companion = Result.INSTANCE;
            j.b(cVarC, Result.b(s.f25199a), lVar);
        } catch (Throwable th) {
            a(cVar, th);
        }
    }

    public static /* synthetic */ void d(p pVar, Object obj, c cVar, l lVar, int i10, Object obj2) throws Throwable {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        c(pVar, obj, cVar, lVar);
    }
}
