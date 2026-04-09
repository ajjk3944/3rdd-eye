package com.bytedance.sdk.component.msw;

import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class emc extends ThreadPoolExecutor {
    private String emc;

    /* renamed from: com.bytedance.sdk.component.msw.emc$emc, reason: collision with other inner class name */
    public static class C0034emc {
        private RejectedExecutionHandler msw;
        private String emc = "io";
        private int ypw = 1;
        private long xq = 30;
        private TimeUnit dg = TimeUnit.SECONDS;
        private int bw = Integer.MAX_VALUE;
        private BlockingQueue<Runnable> ycc = null;
        private ThreadFactory uym = null;
        private int zz = 5;

        public C0034emc emc(String str) {
            this.emc = str;
            return this;
        }

        public C0034emc ypw(int i) {
            this.zz = i;
            return this;
        }

        public C0034emc emc(int i) {
            this.ypw = i;
            return this;
        }

        public C0034emc emc(long j6) {
            this.xq = j6;
            return this;
        }

        public C0034emc emc(TimeUnit timeUnit) {
            this.dg = timeUnit;
            return this;
        }

        public C0034emc emc(BlockingQueue<Runnable> blockingQueue) {
            this.ycc = blockingQueue;
            return this;
        }

        public C0034emc emc(ThreadFactory threadFactory) {
            this.uym = threadFactory;
            return this;
        }

        public C0034emc emc(RejectedExecutionHandler rejectedExecutionHandler) {
            this.msw = rejectedExecutionHandler;
            return this;
        }

        public emc emc() {
            if (this.uym == null) {
                this.uym = bw.emc().emc(this.zz, this.emc);
            }
            if (this.msw == null) {
                this.msw = ycc.ycc();
            }
            if (this.ycc == null) {
                this.ycc = new LinkedBlockingQueue();
            }
            return new emc(this.emc, this.ypw, this.bw, this.xq, this.dg, this.ycc, this.uym, this.msw);
        }
    }

    public emc(String str, int i, int i3, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i3, j6, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.emc = str;
    }

    private void emc(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError e6) {
            emc(runnable, e6);
        } catch (Throwable th) {
            emc(runnable, th);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        BlockingQueue<Runnable> queue;
        super.afterExecute(runnable, th);
        if (!ycc.bw() || TextUtils.isEmpty(this.emc) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.emc;
        str.getClass();
        switch (str) {
            case "io":
                emc(queue, 2);
                break;
            case "log":
                emc(queue, 4);
                break;
            case "aidl":
                emc(queue, 2);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        BlockingQueue<Runnable> queue;
        if (runnable instanceof msw) {
            emc(new ypw((msw) runnable, this));
        } else {
            emc(new ypw(new msw("unknown") { // from class: com.bytedance.sdk.component.msw.emc.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            }, this));
        }
        if (!ycc.bw() || TextUtils.isEmpty(this.emc) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.emc;
        str.getClass();
        switch (str) {
            case "io":
                emc(queue, ycc.emc + 2, getCorePoolSize() * 2);
                break;
            case "log":
                emc(queue, 8, 8);
                break;
            case "aidl":
                emc(queue, 5, 5);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("io".equals(this.emc) || "aidl".equals(this.emc)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return ("io".equals(this.emc) || "aidl".equals(this.emc)) ? Collections.EMPTY_LIST : super.shutdownNow();
    }

    private void emc(Runnable runnable, OutOfMemoryError outOfMemoryError) {
        emc(runnable, (Throwable) outOfMemoryError);
    }

    private void emc(Runnable runnable, Throwable th) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (Throwable unused) {
            }
        }
    }

    private void emc(BlockingQueue<Runnable> blockingQueue, int i) {
        if (getCorePoolSize() == i || blockingQueue == null || blockingQueue.size() > 0) {
            return;
        }
        try {
            setCorePoolSize(i);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    private void emc(BlockingQueue<Runnable> blockingQueue, int i, int i3) {
        if (getCorePoolSize() == i || blockingQueue == null || blockingQueue.size() < i3) {
            return;
        }
        try {
            setCorePoolSize(i);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    public String emc() {
        return this.emc;
    }
}
