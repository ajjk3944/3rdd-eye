package A5;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import c5.C0408e;
import java.lang.reflect.InvocationTargetException;
import q5.i;

/* loaded from: classes3.dex */
public abstract class e {
    private static volatile Choreographer choreographer;

    static {
        Object objD;
        try {
            objD = new d(a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            objD = R2.a.d(th);
        }
        if (objD instanceof C0408e) {
            objD = null;
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
        i.c(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}
