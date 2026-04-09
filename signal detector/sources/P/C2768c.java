package p;

import Y2.x;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2768c extends I5.b {
    public final Object i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final ExecutorService f22731j = Executors.newFixedThreadPool(4, new x());

    /* renamed from: k, reason: collision with root package name */
    public volatile Handler f22732k;

    public static Handler F(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return K.a.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
