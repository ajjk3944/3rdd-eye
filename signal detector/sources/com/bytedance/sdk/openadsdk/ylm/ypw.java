package com.bytedance.sdk.openadsdk.ylm;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ypw {
    private emc bw;
    private int dg;
    private ScheduledExecutorService emc = null;
    private long xq = 0;
    private msw ypw;

    public interface emc {
    }

    public ypw(msw mswVar, int i) {
        this.ypw = mswVar;
        this.dg = i;
    }

    public void emc(long j6) {
        this.xq = j6;
    }

    public boolean ypw() {
        ScheduledExecutorService scheduledExecutorService = this.emc;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }

    public void emc(int i) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.emc = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ylm.ypw.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = ypw.this.xq;
                if (System.currentTimeMillis() - ypw.this.xq > ypw.this.dg) {
                    ypw.this.emc.shutdown();
                    if (ypw.this.ypw != null) {
                        ypw.this.ypw.ypw(0, "Automatic detection of stuck");
                    }
                    if (ypw.this.bw != null) {
                        emc unused2 = ypw.this.bw;
                    }
                }
            }
        }, 0L, i, TimeUnit.MILLISECONDS);
    }

    public void emc() {
        ScheduledExecutorService scheduledExecutorService = this.emc;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
