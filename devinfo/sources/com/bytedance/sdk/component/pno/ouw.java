package com.bytedance.sdk.component.pno;

import a3.a;
import android.os.Looper;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.component.utils.ko;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class ouw extends ThreadPoolExecutor implements AutoCloseable {
    String ouw;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.component.pno.ouw$ouw, reason: collision with other inner class name */
    public static class C0056ouw {
        RejectedExecutionHandler ra;
        String ouw = "io";
        int vt = 1;

        /* renamed from: lh, reason: collision with root package name */
        long f7617lh = 30;
        TimeUnit yu = TimeUnit.SECONDS;
        private int bly = Integer.MAX_VALUE;
        BlockingQueue<Runnable> fkw = null;

        /* renamed from: le, reason: collision with root package name */
        ThreadFactory f7616le = null;
        int pno = 5;

        public final ouw ouw() {
            if (this.f7616le == null) {
                this.f7616le = fkw.ouw().ouw(this.pno, this.ouw);
            }
            if (this.ra == null) {
                this.ra = le.yu();
            }
            if (this.fkw == null) {
                this.fkw = new LinkedBlockingQueue();
            }
            return new ouw(this.ouw, this.vt, this.bly, this.f7617lh, this.yu, this.fkw, this.f7616le, this.ra);
        }
    }

    public ouw(String str, int i4, int i10, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i4, i10, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.ouw = str;
    }

    private void ouw(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError unused) {
            vt(runnable);
        } catch (Throwable unused2) {
            vt(runnable);
        }
    }

    private static void vt(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                ko.lh("", "try exc failed", th2);
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th2) {
        BlockingQueue<Runnable> queue;
        super.afterExecute(runnable, th2);
        if (!le.lh() || TextUtils.isEmpty(this.ouw) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.ouw;
        str.getClass();
        switch (str) {
            case "io":
                ouw(queue, 2);
                break;
            case "log":
                ouw(queue, 4);
                break;
            case "aidl":
                ouw(queue, 2);
                break;
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a.j(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        BlockingQueue<Runnable> queue;
        if (runnable instanceof pno) {
            ouw(new vt((pno) runnable, this));
        } else {
            ouw(new vt(new pno(AppLovinMediationProvider.UNKNOWN) { // from class: com.bytedance.sdk.component.pno.ouw.1
                @Override // java.lang.Runnable
                public final void run() {
                    runnable.run();
                }
            }, this));
        }
        if (!le.lh() || TextUtils.isEmpty(this.ouw) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.ouw;
        str.getClass();
        switch (str) {
            case "io":
                ouw(queue, le.ouw + 2, getCorePoolSize() * 2);
                break;
            case "log":
                ouw(queue, 8, 8);
                break;
            case "aidl":
                ouw(queue, 5, 5);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final void shutdown() {
        if ("io".equals(this.ouw) || "aidl".equals(this.ouw)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return ("io".equals(this.ouw) || "aidl".equals(this.ouw)) ? Collections.EMPTY_LIST : super.shutdownNow();
    }

    private void ouw(BlockingQueue<Runnable> blockingQueue, int i4) {
        if (getCorePoolSize() == i4 || blockingQueue == null || blockingQueue.size() > 0) {
            return;
        }
        try {
            setCorePoolSize(i4);
            ko.vt("ADThreadPoolExecutor", "reduceCoreThreadSize: reduce poolType =  ", this.ouw, " coreSize=", Integer.valueOf(getCorePoolSize()), "  maxSize=", Integer.valueOf(getMaximumPoolSize()));
        } catch (Exception e2) {
            ko.lh("ADThreadPoolExecutor", e2.getMessage());
        }
    }

    private void ouw(BlockingQueue<Runnable> blockingQueue, int i4, int i10) {
        if (getCorePoolSize() == i4 || blockingQueue == null || blockingQueue.size() < i10) {
            return;
        }
        try {
            setCorePoolSize(i4);
            ko.vt("ADThreadPoolExecutor", "increaseCoreThreadSize: increase poolType =  ", this.ouw, " coreSize=", Integer.valueOf(getCorePoolSize()), "  maxSize=", Integer.valueOf(getMaximumPoolSize()));
        } catch (Exception e2) {
            ko.lh("ADThreadPoolExecutor", e2.getMessage());
        }
    }
}
