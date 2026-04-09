package q;

import a4.f;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.c;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f32030a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f32031b = Executors.newFixedThreadPool(4, new bi.c(1));

    /* renamed from: c, reason: collision with root package name */
    public volatile Handler f32032c;

    public static Handler G(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return f.c(looper);
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
