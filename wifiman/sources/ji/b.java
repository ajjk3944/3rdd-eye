package Ji;

import Ii.K;
import android.os.Build;
import dh.AbstractC5376a;
import dh.InterfaceC5384i;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes4.dex */
public final class b extends AbstractC5376a implements K {
    private volatile Object _preHandler;

    public b() {
        super(K.f9272M);
        this._preHandler = this;
    }

    private final Method Y() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // Ii.K
    public void s(InterfaceC5384i interfaceC5384i, Throwable th2) {
        if (Build.VERSION.SDK_INT < 28) {
            Method methodY = Y();
            Object objInvoke = methodY != null ? methodY.invoke(null, null) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
            }
        }
    }
}
