package A0;

import android.location.GnssStatus$Callback;
import android.os.Build;
import android.os.LocaleList;
import android.view.PointerIcon;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ GnssStatus$Callback d(Object obj) {
        return (GnssStatus$Callback) obj;
    }

    public static /* bridge */ /* synthetic */ LocaleList f(Object obj) {
        return (LocaleList) obj;
    }

    public static /* bridge */ /* synthetic */ PointerIcon i(Object obj) {
        return (PointerIcon) obj;
    }

    public static /* synthetic */ void t(ExecutorService executorService) throws InterruptedException {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z6 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z6) {
                        executorService.shutdownNow();
                        z6 = true;
                    }
                }
            }
            if (z6) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
