package com.bytedance.sdk.component.msw;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class zz implements ThreadFactory {
    public static volatile boolean dg;
    private final AtomicInteger bw = new AtomicInteger(1);
    protected final ThreadGroup emc;
    protected int xq;
    protected final String ypw;

    public zz(int i, String str) {
        this.xq = i;
        this.emc = new ThreadGroup("csj_g_".concat(String.valueOf(str)));
        this.ypw = "csj_".concat(String.valueOf(str));
    }

    public Thread emc(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (dg) {
            return null;
        }
        Thread threadEmc = emc(this.emc, runnable, this.ypw + this.bw.getAndIncrement());
        if (threadEmc.isDaemon()) {
            threadEmc.setDaemon(false);
        }
        int i = this.xq;
        if (i > 10 || i <= 0) {
            this.xq = 5;
        }
        threadEmc.setPriority(this.xq);
        return threadEmc;
    }
}
