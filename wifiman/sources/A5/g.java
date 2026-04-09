package A5;

import D3.HandlerC2560a;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f326b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static g f327c;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f328a;

    private g(Looper looper) {
        this.f328a = new HandlerC2560a(looper);
    }

    public static g a() {
        g gVar;
        synchronized (f326b) {
            try {
                if (f327c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f327c = new g(handlerThread.getLooper());
                }
                gVar = f327c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static Executor d() {
        return r.zza;
    }

    public Task b(final Callable callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        c(new Runnable() { // from class: A5.q
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    taskCompletionSource2.setResult(callable2.call());
                } catch (MlKitException e10) {
                    taskCompletionSource2.setException(e10);
                } catch (Exception e11) {
                    taskCompletionSource2.setException(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e11));
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    public void c(Runnable runnable) {
        d().execute(runnable);
    }
}
