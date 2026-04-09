package com.bytedance.sdk.component.pno;

import com.bytedance.sdk.component.pno.ouw;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class le extends fkw {
    private static volatile ThreadPoolExecutor fkw;

    /* renamed from: le, reason: collision with root package name */
    private static volatile ThreadPoolExecutor f7607le;
    private static volatile ScheduledExecutorService ra;
    public static lh vt;
    public static final int ouw = Runtime.getRuntime().availableProcessors();

    /* renamed from: lh, reason: collision with root package name */
    public static int f7608lh = 120;
    public static boolean yu = true;

    public static lh fkw() {
        return vt;
    }

    public static void le() {
        f7608lh = -1;
    }

    public static void lh(pno pnoVar) {
        vt(pnoVar);
    }

    public static void ouw(pno pnoVar) {
        if (fkw == null) {
            ra();
        }
        if (pnoVar == null || fkw == null) {
            return;
        }
        fkw.execute(pnoVar);
    }

    private static ExecutorService pno() {
        if (f7607le == null) {
            synchronized (le.class) {
                try {
                    if (f7607le == null) {
                        ouw.C0056ouw c0056ouw = new ouw.C0056ouw();
                        c0056ouw.ouw = "io";
                        c0056ouw.vt = 2;
                        c0056ouw.pno = 10;
                        c0056ouw.f7617lh = 20L;
                        c0056ouw.yu = TimeUnit.SECONDS;
                        c0056ouw.fkw = new LinkedBlockingQueue();
                        c0056ouw.ra = new AnonymousClass1();
                        c0056ouw.f7616le = fkw.ouw().ouw(10, "io");
                        ouw ouwVarOuw = c0056ouw.ouw();
                        f7607le = ouwVarOuw;
                        ouwVarOuw.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f7607le;
    }

    private static ExecutorService ra() {
        if (fkw == null) {
            synchronized (le.class) {
                try {
                    if (fkw == null) {
                        ouw.C0056ouw c0056ouw = new ouw.C0056ouw();
                        c0056ouw.ouw = "init";
                        c0056ouw.vt = 0;
                        c0056ouw.pno = 10;
                        c0056ouw.f7617lh = 5L;
                        c0056ouw.yu = TimeUnit.SECONDS;
                        c0056ouw.fkw = new SynchronousQueue();
                        c0056ouw.ra = new AnonymousClass1();
                        c0056ouw.f7616le = fkw.ouw().ouw(10, "init");
                        fkw = c0056ouw.ouw();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return fkw;
    }

    public static void vt(pno pnoVar) {
        if (f7607le == null) {
            pno();
        }
        if (f7607le != null) {
            f7607le.execute(pnoVar);
        }
    }

    public static RejectedExecutionHandler yu() {
        return new AnonymousClass1();
    }

    public static boolean lh() {
        return yu;
    }

    public static void ouw(boolean z3) {
        yu = z3;
    }

    public static ScheduledExecutorService vt() {
        if (ra == null) {
            synchronized (le.class) {
                try {
                    if (ra == null) {
                        ra = Executors.newSingleThreadScheduledExecutor(fkw.ouw().ouw(5, "scheduled"));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ra;
    }

    public static void ouw(lh lhVar) {
        vt = lhVar;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.component.pno.le$1, reason: invalid class name */
    public static class AnonymousClass1 implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }
}
