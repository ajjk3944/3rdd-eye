package com.bytedance.sdk.component.pno.lh;

import a3.a;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.component.utils.ko;
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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le extends ThreadPoolExecutor implements AutoCloseable {
    private int fkw;

    /* renamed from: lh, reason: collision with root package name */
    private int f7609lh;
    public boolean ouw;
    private final String vt;
    private int yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        public String ouw = "cache";
        public int vt = 4;

        /* renamed from: lh, reason: collision with root package name */
        public int f7611lh = 100;
        public int yu = 0;
        public long fkw = 30000;

        /* renamed from: le, reason: collision with root package name */
        public boolean f7610le = false;
        TimeUnit ra = TimeUnit.MILLISECONDS;
        public boolean pno = false;
        BlockingQueue<Runnable> bly = new PriorityBlockingQueue();
        ThreadFactory tlj = null;

        public final le ouw() {
            if (this.tlj == null) {
                this.tlj = new yu(this.ouw);
            }
            if (this.vt < 0) {
                this.vt = 8;
            }
            if (this.vt == 0) {
                this.bly = new SynchronousQueue();
            }
            if (this.bly == null) {
                this.bly = new LinkedBlockingQueue();
            }
            if (this.f7611lh > 100) {
                this.f7611lh = 100;
            }
            int i4 = this.f7611lh;
            int i10 = this.vt;
            if (i4 < i10) {
                this.f7611lh = i10;
            }
            return new le(this, (byte) 0);
        }
    }

    public /* synthetic */ le(ouw ouwVar, byte b10) {
        this(ouwVar);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th2) {
        Object obj;
        char c9;
        char c10;
        char c11;
        int corePoolSize;
        int size;
        boolean z3 = runnable instanceof vt;
        if (z3) {
            ((vt) runnable).ra = SystemClock.elapsedRealtime();
        }
        super.afterExecute(runnable, th2);
        if (z3) {
            vt vtVar = (vt) runnable;
            c10 = 6;
            c11 = 5;
            obj = "    ";
            c9 = 4;
            ko.vt("PAGThreadPoolExecutor", "submit  poolType = ", this.vt, " taskName=", vtVar.yu, obj, "priority = ", Integer.valueOf(vtVar.f7614lh), " SubmitTimestamp=", Long.valueOf(vtVar.fkw), "  BeforeTimestamp=", Long.valueOf(vtVar.f7613le), "  AfterTimestamp=", Long.valueOf(vtVar.ra));
        } else {
            obj = "    ";
            c9 = 4;
            c10 = 6;
            c11 = 5;
        }
        try {
            if (this.f7609lh != 0 && (corePoolSize = getCorePoolSize()) > this.f7609lh && (size = getQueue().size()) == 0) {
                setCorePoolSize(this.f7609lh);
                String str = this.vt;
                Integer numValueOf = Integer.valueOf(size);
                Integer numValueOf2 = Integer.valueOf(corePoolSize);
                Integer numValueOf3 = Integer.valueOf(this.f7609lh);
                Object[] objArr = new Object[7];
                objArr[0] = str;
                objArr[1] = " reduceToCoreThread  queueSize=";
                objArr[2] = numValueOf;
                objArr[3] = obj;
                objArr[c9] = numValueOf2;
                objArr[c11] = " --> ";
                objArr[c10] = numValueOf3;
                ko.vt("PAGThreadPoolExecutor", objArr);
            }
        } catch (Exception e2) {
            ko.lh("PAGThreadPoolExecutor", e2.getMessage());
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof vt) {
            ((vt) runnable).f7613le = SystemClock.elapsedRealtime();
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a.e(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int corePoolSize;
        com.bytedance.sdk.component.pno.lh.ouw ouwVarOuw;
        if (!(runnable instanceof vt)) {
            runnable = new vt(AppLovinMediationProvider.UNKNOWN, runnable) { // from class: com.bytedance.sdk.component.pno.lh.le.2
                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnableOuw = ouw();
                    if (runnableOuw != null) {
                        runnableOuw.run();
                    }
                }
            };
        }
        if (!"cache".equals(this.vt)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(yu.ouw(this.vt)) && (ouwVarOuw = lh.ouw()) != null) {
                ouwVarOuw.ouw((vt) runnable);
            }
        }
        ((vt) runnable).fkw = SystemClock.elapsedRealtime();
        try {
            try {
                super.execute(runnable);
                try {
                    if (this.f7609lh != 0 && (corePoolSize = getCorePoolSize()) < this.yu) {
                        int size = getQueue().size();
                        if (getActiveCount() < this.f7609lh || size < this.fkw) {
                            return;
                        }
                        setCorePoolSize(this.yu);
                        ko.vt("PAGThreadPoolExecutor", this.vt, " increaseToMaxThread  queueSize=", Integer.valueOf(size), "    ", Integer.valueOf(corePoolSize), " --> ", Integer.valueOf(this.yu));
                    }
                } catch (Exception e2) {
                    ko.lh("PAGThreadPoolExecutor", e2.getMessage());
                }
            } catch (Throwable unused) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    Handler handlerVt = lh.vt();
                    if (handlerVt != null) {
                        handlerVt.post(runnable);
                    }
                } else {
                    runnable.run();
                }
            }
        } catch (Throwable th2) {
            ko.lh("PAGThreadPoolExecutor", "try exc failed", th2);
        }
    }

    public final void ouw(ouw ouwVar) {
        try {
            int i4 = ouwVar.vt;
            if (i4 >= 0 && this.f7609lh != i4) {
                this.f7609lh = i4;
                setCorePoolSize(i4);
            }
            this.yu = ouwVar.f7611lh;
            this.fkw = ouwVar.yu;
            allowCoreThreadTimeOut(ouwVar.f7610le);
            this.ouw = ouwVar.pno;
        } catch (Throwable th2) {
            ko.fkw("PAGThreadPoolExecutor", th2.getMessage());
        }
        ko.vt("PAGThreadPoolExecutor", "update poolType = ", ouwVar.ouw, " coreSize=", Integer.valueOf(ouwVar.vt), " maxSize=", Integer.valueOf(ouwVar.f7611lh), " keepAlive=", Long.valueOf(ouwVar.fkw), " createSize=", Integer.valueOf(ouwVar.yu), " isUseConfig=", Boolean.valueOf(ouwVar.pno), "  workQueue", ouwVar.bly);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final void shutdown() {
        if ("aidl".equals(this.vt)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return "aidl".equals(this.vt) ? Collections.EMPTY_LIST : super.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        int i4;
        String str;
        runnable.getClass();
        final RunnableFuture runnableFutureNewTaskFor = newTaskFor(runnable, null);
        if (runnable instanceof vt) {
            vt vtVar = (vt) runnable;
            i4 = vtVar.f7614lh;
            str = vtVar.yu;
        } else {
            i4 = 6;
            str = "";
        }
        if (i4 == 0 || TextUtils.isEmpty(str)) {
            ko.ouw("PAGThreadPoolExecutor", " submit poolType = ", this.vt, new RuntimeException());
        }
        execute(new vt(i4, str) { // from class: com.bytedance.sdk.component.pno.lh.le.1
            @Override // java.lang.Runnable
            public final void run() {
                runnableFutureNewTaskFor.run();
            }
        });
        return runnableFutureNewTaskFor;
    }

    private le(ouw ouwVar) {
        super(ouwVar.vt, Integer.MAX_VALUE, ouwVar.fkw, ouwVar.ra, ouwVar.bly, ouwVar.tlj);
        this.ouw = false;
        ko.vt("PAGThreadPoolExecutor", "create poolType = ", ouwVar.ouw, " coreSize=", Integer.valueOf(ouwVar.vt), " maxSize=", Integer.valueOf(ouwVar.f7611lh), " keepAlive=", Long.valueOf(ouwVar.fkw), " createSize=", Integer.valueOf(ouwVar.yu), " isUseConfig=", Boolean.valueOf(ouwVar.pno), "  workQueue", ouwVar.bly);
        this.vt = ouwVar.ouw;
        this.f7609lh = ouwVar.vt;
        this.yu = ouwVar.f7611lh;
        this.fkw = ouwVar.yu;
        allowCoreThreadTimeOut(ouwVar.f7610le);
        this.ouw = ouwVar.pno;
    }
}
