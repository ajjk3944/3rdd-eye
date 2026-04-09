package com.bytedance.sdk.component.bw.emc;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class emc implements ThreadFactory {
    private final ThreadGroup emc;
    private final AtomicInteger ypw = new AtomicInteger(1);

    public emc(String str) {
        this.emc = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.emc, runnable, "tt_img_" + this.ypw.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
