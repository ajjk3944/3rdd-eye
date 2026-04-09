package com.bytedance.sdk.component.adexpress.yu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {
    public static void ouw(com.bytedance.sdk.component.pno.pno pnoVar, int i4) {
        com.bytedance.sdk.component.adexpress.ouw.ouw.lh lhVar = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh;
        ExecutorService executorServiceRyl = lhVar != null ? lhVar.ryl() : null;
        if (executorServiceRyl == null) {
            com.bytedance.sdk.component.pno.le.lh(pnoVar);
        } else {
            pnoVar.setPriority(i4);
            executorServiceRyl.execute(pnoVar);
        }
    }

    public static void ouw(com.bytedance.sdk.component.pno.pno pnoVar) {
        com.bytedance.sdk.component.adexpress.ouw.ouw.lh lhVar = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh;
        ExecutorService executorServiceCf = lhVar != null ? lhVar.cf() : null;
        if (executorServiceCf != null) {
            pnoVar.setPriority(10);
            executorServiceCf.execute(pnoVar);
        } else {
            com.bytedance.sdk.component.pno.le.ouw(pnoVar);
        }
    }

    public static ScheduledFuture ouw(Runnable runnable, long j, TimeUnit timeUnit) {
        return com.bytedance.sdk.component.pno.le.vt().schedule(runnable, j, timeUnit);
    }
}
