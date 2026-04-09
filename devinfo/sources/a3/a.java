package a3;

import android.media.MediaCodec;
import android.os.Build;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import c8.e;
import com.bytedance.sdk.component.pno.lh.le;
import com.google.android.gms.internal.ads.c91;
import com.google.android.gms.internal.ads.dx;
import com.google.android.gms.internal.ads.ex;
import ee.g;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern a() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* synthetic */ LocaleList b(Locale[] localeArr) {
        return new LocaleList(localeArr);
    }

    public static /* synthetic */ LocaleSpan c(LocaleList localeList) {
        return new LocaleSpan(localeList);
    }

    public static /* synthetic */ void d(e eVar) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || eVar != ForkJoinPool.commonPool()) && !(zIsTerminated = eVar.isTerminated())) {
            eVar.shutdown();
            boolean z3 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = eVar.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z3) {
                        eVar.shutdownNow();
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void e(le leVar) throws InterruptedException {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || leVar != ForkJoinPool.commonPool()) && !(zIsTerminated = leVar.isTerminated())) {
            leVar.shutdown();
            boolean z3 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = leVar.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z3) {
                        leVar.shutdownNow();
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void f(dx dxVar) throws InterruptedException {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || dxVar != ForkJoinPool.commonPool()) && !(zIsTerminated = dxVar.isTerminated())) {
            dxVar.shutdown();
            boolean z3 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = dxVar.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z3) {
                        dxVar.shutdownNow();
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void g(ex exVar) throws InterruptedException {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || exVar != ForkJoinPool.commonPool()) && !(zIsTerminated = exVar.isTerminated())) {
            exVar.shutdown();
            boolean z3 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = exVar.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z3) {
                        exVar.shutdownNow();
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void h(c91 c91Var) throws InterruptedException {
        boolean zIsTerminated;
        ExecutorService executorService = (ExecutorService) c91Var.f10899b;
        if ((Build.VERSION.SDK_INT <= 23 || c91Var != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            c91Var.shutdown();
            boolean z3 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z3) {
                        c91Var.shutdownNow();
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void i(g gVar) {
        if ((Build.VERSION.SDK_INT <= 23 || gVar != ForkJoinPool.commonPool()) && !gVar.f23419a.isTerminated()) {
            gVar.shutdown();
            throw null;
        }
    }

    public static /* synthetic */ void j(ExecutorService executorService) throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor;
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(zIsTerminated = (threadPoolExecutor = (ThreadPoolExecutor) executorService).isTerminated())) {
            executorService.shutdown();
            boolean z3 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = threadPoolExecutor.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z3) {
                        executorService.shutdownNow();
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void k(ExecutorService executorService) throws InterruptedException {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z3 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z3) {
                        executorService.shutdownNow();
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
