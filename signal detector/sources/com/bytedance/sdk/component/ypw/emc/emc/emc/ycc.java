package com.bytedance.sdk.component.ypw.emc.emc.emc;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ycc extends com.bytedance.sdk.component.ypw.emc.dg {
    private ExecutorService emc;
    private List<com.bytedance.sdk.component.ypw.emc.ypw> ypw = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.ypw.emc.ypw> xq = new CopyOnWriteArrayList();
    private AtomicInteger dg = new AtomicInteger(64);

    public ycc() {
        if (this.emc == null) {
            this.emc = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.ypw.emc.emc.emc.ycc.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.ypw.emc.dg
    public List<com.bytedance.sdk.component.ypw.emc.ypw> dg() {
        return this.xq;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.dg
    public void emc(int i) {
        this.dg.set(i);
    }

    @Override // com.bytedance.sdk.component.ypw.emc.dg
    public List<com.bytedance.sdk.component.ypw.emc.ypw> xq() {
        return this.ypw;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.dg
    public ExecutorService ypw() {
        return this.emc;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.dg
    public int emc() {
        return this.dg.get();
    }
}
