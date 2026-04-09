package kotlinx.coroutines;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public abstract class h0 {
    public static final void a(kotlin.coroutines.d dVar, Throwable th) {
        try {
            g0 g0Var = (g0) dVar.get(g0.G8);
            if (g0Var != null) {
                g0Var.handleException(dVar, th);
            } else {
                kotlinx.coroutines.internal.h.a(dVar, th);
            }
        } catch (Throwable th2) {
            kotlinx.coroutines.internal.h.a(dVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        y8.d.a(runtimeException, th);
        return runtimeException;
    }
}
