package xt;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import br.l;
import java.lang.reflect.InvocationTargetException;
import lf.t1;
import lq.n;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25528a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objK;
        try {
            objK = new c(a(Looper.getMainLooper()));
        } catch (Throwable th2) {
            objK = t1.k(th2);
        }
        if (objK instanceof n) {
            objK = null;
        }
    }

    public static final Handler a(Looper looper) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            l.c(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
