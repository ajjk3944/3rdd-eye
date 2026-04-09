package B9;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import b9.m;
import b9.n;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.l;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes3.dex */
public final class h {
    private static volatile Choreographer choreographer;

    static {
        Object objA;
        try {
            objA = new f(false, a(Looper.getMainLooper()));
        } catch (Throwable th) {
            objA = n.a(th);
        }
        if (objA instanceof m.a) {
            objA = null;
        }
    }

    public static final Handler a(Looper looper) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        l.d(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}
