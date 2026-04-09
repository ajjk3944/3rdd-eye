package ke;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import nk.k;
import vk.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f28258a;

    /* renamed from: b, reason: collision with root package name */
    public final b f28259b;

    /* renamed from: c, reason: collision with root package name */
    public final b f28260c;

    public c(ExecutorService executorService, ExecutorService executorService2) {
        k.e(executorService, "backgroundExecutorService");
        k.e(executorService2, "blockingExecutorService");
        this.f28258a = new b(executorService);
        this.f28259b = new b(executorService);
        Tasks.forResult(null);
        this.f28260c = new b(executorService2);
    }

    public static final void a() {
        String name = Thread.currentThread().getName();
        k.d(name, "<get-threadName>(...)");
        if (i.y0(name, "Firebase Background Thread #", false)) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void b() {
        String name = Thread.currentThread().getName();
        k.d(name, "<get-threadName>(...)");
        if (i.y0(name, "Firebase Blocking Thread #", false)) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }
}
