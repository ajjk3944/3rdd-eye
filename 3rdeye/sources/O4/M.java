package O4;

import N7.C1154e9;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: ExecutorUtils.java */
/* loaded from: classes2.dex */
public final class M extends AbstractRunnableC1458d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10270b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f10271c;

    public M(String str, ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f10270b = str;
        this.f10271c = executorService;
    }

    @Override // O4.AbstractRunnableC1458d
    public final void a() {
        String str = this.f10270b;
        ExecutorService executorService = this.f10271c;
        try {
            String strConcat = "Executing shutdown hook for ".concat(str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strConcat, null);
            }
            executorService.shutdown();
            if (executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                return;
            }
            String strConcat2 = str.concat(" did not shut down in the allocated time. Requesting immediate shutdown.");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strConcat2, null);
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            String strI = C1154e9.i("Interrupted while waiting for ", str, " to shut down. Requesting immediate shutdown.");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strI, null);
            }
            executorService.shutdownNow();
        }
    }
}
