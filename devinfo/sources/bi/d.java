package bi;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f2269a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public static final b f2270b = new b(new LinkedBlockingQueue(100), new c(0));

    public static void a(Runnable runnable, long j) {
        f2269a.postDelayed(runnable, j);
    }

    public static void b(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f2269a.post(runnable);
        }
    }

    public static void c(Runnable runnable) {
        try {
            f2270b.a(runnable);
        } catch (RejectedExecutionException unused) {
        }
    }
}
