package com.bytedance.sdk.component.msw.xq;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class dg implements ThreadFactory {
    public static volatile boolean xq;
    private final AtomicInteger dg = new AtomicInteger(1);
    protected final ThreadGroup emc;
    protected final String ypw;

    public dg(String str) {
        this.emc = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.ypw = emc(str);
    }

    public Thread emc(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (xq) {
            return null;
        }
        Thread threadEmc = emc(this.emc, runnable, this.ypw + "_" + this.dg.getAndIncrement());
        if (threadEmc.isDaemon()) {
            threadEmc.setDaemon(false);
        }
        return threadEmc;
    }

    public static String emc(String str) {
        return "pag_".concat(String.valueOf(str));
    }
}
