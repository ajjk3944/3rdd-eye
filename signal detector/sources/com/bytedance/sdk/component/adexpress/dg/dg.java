package com.bytedance.sdk.component.adexpress.dg;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class dg {
    public static void emc(com.bytedance.sdk.component.msw.msw mswVar, int i) {
        if (mswVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.emc.emc.xq xqVarXq = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq();
        ExecutorService executorServiceQh = xqVarXq != null ? xqVarXq.qh() : null;
        if (executorServiceQh == null) {
            com.bytedance.sdk.component.msw.ycc.emc(mswVar, i);
        } else {
            mswVar.setPriority(i);
            executorServiceQh.execute(mswVar);
        }
    }

    public static void ypw(com.bytedance.sdk.component.msw.msw mswVar, int i) {
        if (mswVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.emc.emc.xq xqVarXq = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq();
        ExecutorService executorServiceSz = xqVarXq != null ? xqVarXq.sz() : null;
        if (executorServiceSz == null) {
            com.bytedance.sdk.component.msw.ycc.emc(mswVar);
        } else {
            mswVar.setPriority(i);
            executorServiceSz.execute(mswVar);
        }
    }

    public static ScheduledFuture emc(Runnable runnable, long j6, TimeUnit timeUnit) {
        return com.bytedance.sdk.component.msw.ycc.dg().schedule(runnable, j6, timeUnit);
    }
}
