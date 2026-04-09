package com.bytedance.sdk.component.msw.xq;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ycc extends ThreadPoolExecutor {
    private boolean bw;
    private int dg;
    private final String emc;
    private int xq;
    private int ypw;

    public static class emc {
        private String emc = "cache";
        private int ypw = 4;
        private int xq = 100;
        private int dg = 0;
        private long bw = 30000;
        private boolean ycc = false;
        private TimeUnit uym = TimeUnit.MILLISECONDS;
        private boolean msw = false;
        private BlockingQueue<Runnable> zz = new PriorityBlockingQueue();
        private ThreadFactory ru = null;

        public emc bw(int i) {
            return this;
        }

        public emc dg(int i) {
            return this;
        }

        public emc emc(String str) {
            this.emc = str;
            return this;
        }

        public emc xq(int i) {
            this.dg = i;
            return this;
        }

        public emc ypw(int i) {
            this.xq = i;
            return this;
        }

        public emc emc(int i) {
            this.ypw = i;
            return this;
        }

        public emc ypw(boolean z6) {
            this.msw = z6;
            return this;
        }

        public emc emc(long j6) {
            this.bw = j6;
            return this;
        }

        public emc emc(boolean z6) {
            this.ycc = z6;
            return this;
        }

        public ycc emc() {
            if (this.ru == null) {
                this.ru = new dg(this.emc);
            }
            if (this.ypw < 0) {
                this.ypw = 8;
            }
            if (this.ypw == 0) {
                this.zz = new SynchronousQueue();
            }
            if (this.zz == null) {
                this.zz = new LinkedBlockingQueue();
            }
            if (this.xq > 100) {
                this.xq = 100;
            }
            int i = this.xq;
            int i3 = this.ypw;
            if (i < i3) {
                this.xq = i3;
            }
            return new ycc(this);
        }
    }

    private void xq() {
        try {
            if (this.ypw != 0 && getCorePoolSize() > this.ypw && getQueue().size() == 0) {
                setCorePoolSize(this.ypw);
            }
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    private void ypw() {
        try {
            if (this.ypw != 0 && getCorePoolSize() < this.xq) {
                int size = getQueue().size();
                if (getActiveCount() < this.ypw || size < this.dg) {
                    return;
                }
                setCorePoolSize(this.xq);
            }
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        boolean z6 = runnable instanceof ypw;
        if (z6) {
            ((ypw) runnable).xq(SystemClock.elapsedRealtime());
        }
        super.afterExecute(runnable, th);
        if (z6) {
            ypw ypwVar = (ypw) runnable;
            ypwVar.ypw();
            ypwVar.emc();
            ypwVar.xq();
            ypwVar.dg();
            ypwVar.bw();
        }
        xq();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof ypw) {
            ((ypw) runnable).ypw(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    public void emc(emc emcVar) {
        try {
            if (emcVar.ypw >= 0 && this.ypw != emcVar.ypw) {
                int i = emcVar.ypw;
                this.ypw = i;
                setCorePoolSize(i);
            }
            this.xq = emcVar.xq;
            this.dg = emcVar.dg;
            allowCoreThreadTimeOut(emcVar.ycc);
            this.bw = emcVar.msw;
        } catch (Throwable th) {
            th.getMessage();
        }
        String unused = emcVar.emc;
        int unused2 = emcVar.ypw;
        int unused3 = emcVar.xq;
        long unused4 = emcVar.bw;
        int unused5 = emcVar.dg;
        boolean unused6 = emcVar.msw;
        BlockingQueue unused7 = emcVar.zz;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bytedance.sdk.component.msw.xq.emc emcVarEmc;
        if (!(runnable instanceof ypw)) {
            runnable = new ypw("unknown", runnable) { // from class: com.bytedance.sdk.component.msw.xq.ycc.2
                @Override // java.lang.Runnable
                public void run() {
                    Runnable runnableYcc = ycc();
                    if (runnableYcc != null) {
                        runnableYcc.run();
                    }
                }
            };
        }
        if (!"cache".equals(this.emc)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(dg.emc(this.emc)) && (emcVarEmc = xq.emc()) != null) {
                emcVarEmc.emc(this, (ypw) runnable);
            }
        }
        ((ypw) runnable).emc(SystemClock.elapsedRealtime());
        try {
            super.execute(runnable);
            ypw();
        } catch (Throwable th) {
            emc(runnable, th);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.emc)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return "aidl".equals(this.emc) ? Collections.EMPTY_LIST : super.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        int iEmc;
        String strYpw;
        runnable.getClass();
        final RunnableFuture runnableFutureNewTaskFor = newTaskFor(runnable, null);
        if (runnable instanceof ypw) {
            ypw ypwVar = (ypw) runnable;
            iEmc = ypwVar.emc();
            strYpw = ypwVar.ypw();
        } else {
            iEmc = 6;
            strYpw = "";
        }
        if (iEmc == 0 || TextUtils.isEmpty(strYpw)) {
            new RuntimeException();
        }
        execute(new ypw(iEmc, strYpw) { // from class: com.bytedance.sdk.component.msw.xq.ycc.1
            @Override // java.lang.Runnable
            public void run() {
                runnableFutureNewTaskFor.run();
            }
        });
        return runnableFutureNewTaskFor;
    }

    private ycc(emc emcVar) {
        super(emcVar.ypw, Integer.MAX_VALUE, emcVar.bw, emcVar.uym, (BlockingQueue<Runnable>) emcVar.zz, emcVar.ru);
        this.bw = false;
        String unused = emcVar.emc;
        int unused2 = emcVar.ypw;
        int unused3 = emcVar.xq;
        long unused4 = emcVar.bw;
        int unused5 = emcVar.dg;
        boolean unused6 = emcVar.msw;
        BlockingQueue unused7 = emcVar.zz;
        this.emc = emcVar.emc;
        this.ypw = emcVar.ypw;
        this.xq = emcVar.xq;
        this.dg = emcVar.dg;
        allowCoreThreadTimeOut(emcVar.ycc);
        this.bw = emcVar.msw;
    }

    private void emc(Runnable runnable, Throwable th) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Handler handlerYpw = xq.ypw();
                if (handlerYpw != null) {
                    handlerYpw.post(runnable);
                    return;
                }
                return;
            }
            runnable.run();
        } catch (Throwable unused) {
        }
    }

    public boolean emc() {
        return this.bw;
    }
}
