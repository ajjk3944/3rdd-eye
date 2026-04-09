package hf;

import android.os.Process;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10718a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10719d;

    public u(Runnable runnable) {
        this.f10719d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        switch (this.f10718a) {
            case 0:
                ((Runnable) this.f10719d).run();
                break;
            default:
                ExecutorService executorService = (ExecutorService) this.f10719d;
                try {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    executorService.shutdown();
                    if (!executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                        Log.isLoggable("FirebaseCrashlytics", 3);
                        executorService.shutdownNow();
                        break;
                    }
                } catch (InterruptedException unused) {
                    Locale locale = Locale.US;
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    executorService.shutdownNow();
                    return;
                }
                break;
        }
    }

    public u(ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f10719d = executorService;
    }
}
