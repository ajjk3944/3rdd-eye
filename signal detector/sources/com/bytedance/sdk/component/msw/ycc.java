package com.bytedance.sdk.component.msw;

import com.bytedance.sdk.component.msw.emc;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ycc extends bw {
    private static volatile ThreadPoolExecutor bw;
    private static volatile ScheduledExecutorService uym;
    private static volatile ThreadPoolExecutor ycc;
    public static xq ypw;
    public static final int emc = Runtime.getRuntime().availableProcessors();
    public static int xq = 120;
    public static boolean dg = true;

    public static boolean bw() {
        return dg;
    }

    public static ScheduledExecutorService dg() {
        if (uym == null) {
            synchronized (ycc.class) {
                try {
                    if (uym == null) {
                        uym = Executors.newSingleThreadScheduledExecutor(bw.emc().emc(5, "scheduled"));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uym;
    }

    public static void emc(msw mswVar) {
        if (bw == null) {
            ypw();
        }
        if (mswVar == null || bw == null) {
            return;
        }
        bw.execute(mswVar);
    }

    public static xq uym() {
        return ypw;
    }

    public static ExecutorService xq() {
        return emc(10);
    }

    public static RejectedExecutionHandler ycc() {
        return new RejectedExecutionHandler() { // from class: com.bytedance.sdk.component.msw.ycc.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    public static ExecutorService ypw() {
        if (bw == null) {
            synchronized (ycc.class) {
                try {
                    if (bw == null) {
                        bw = new emc.C0034emc().emc("init").emc(0).ypw(10).emc(5L).emc(TimeUnit.SECONDS).emc(new SynchronousQueue()).emc(ycc()).emc(bw.emc().emc(10, "init")).emc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bw;
    }

    public static ExecutorService emc(int i) {
        if (ycc == null) {
            synchronized (ycc.class) {
                try {
                    if (ycc == null) {
                        emc emcVarEmc = new emc.C0034emc().emc("io").emc(2).ypw(i).emc(20L).emc(TimeUnit.SECONDS).emc(new LinkedBlockingQueue()).emc(ycc()).emc(bw.emc().emc(i, "io")).emc();
                        ycc = emcVarEmc;
                        emcVarEmc.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ycc;
    }

    public static void ypw(msw mswVar) {
        if (ycc == null) {
            xq();
        }
        if (ycc != null) {
            ycc.execute(mswVar);
        }
    }

    public static void ypw(int i) {
        xq = i;
    }

    public static void emc(msw mswVar, int i) {
        ypw(mswVar);
    }

    public static void emc(boolean z6) {
        dg = z6;
    }

    public static void emc(xq xqVar) {
        ypw = xqVar;
    }
}
