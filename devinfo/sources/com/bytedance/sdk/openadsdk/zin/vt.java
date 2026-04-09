package com.bytedance.sdk.openadsdk.zin;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    pno vt;
    int yu;
    ScheduledExecutorService ouw = null;

    /* renamed from: lh, reason: collision with root package name */
    long f8901lh = 0;

    public vt(pno pnoVar, int i4) {
        this.vt = pnoVar;
        this.yu = i4;
    }

    public final boolean lh() {
        ScheduledExecutorService scheduledExecutorService = this.ouw;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }

    public final void ouw() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.ouw = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.vt.1
            @Override // java.lang.Runnable
            public final void run() {
                ra.ouw("Playable_CrashMonitor", "-- check page stuck  " + (System.currentTimeMillis() - vt.this.f8901lh));
                long jCurrentTimeMillis = System.currentTimeMillis();
                vt vtVar = vt.this;
                if (jCurrentTimeMillis - vtVar.f8901lh > vtVar.yu) {
                    vtVar.ouw.shutdown();
                    pno pnoVar = vt.this.vt;
                    if (pnoVar != null) {
                        pnoVar.vt(0, "Automatic detection of stuck");
                    }
                }
            }
        }, 0L, 500L, TimeUnit.MILLISECONDS);
    }

    public final void vt() {
        ScheduledExecutorService scheduledExecutorService = this.ouw;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
