package com.bytedance.sdk.component.adexpress.dg;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class dg {
    public static void emc(com.bytedance.sdk.component.msw.msw mswVar, int i10) {
        if (mswVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.emc.emc.xq xqVarXq = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq();
        ExecutorService executorServiceQh = xqVarXq != null ? xqVarXq.qh() : null;
        if (executorServiceQh == null) {
            com.bytedance.sdk.component.msw.ycc.emc(mswVar, i10);
        } else {
            mswVar.setPriority(i10);
            executorServiceQh.execute(mswVar);
        }
    }

    public static void ypw(com.bytedance.sdk.component.msw.msw mswVar, int i10) {
        if (mswVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.emc.emc.xq xqVarXq = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq();
        ExecutorService executorServiceSz = xqVarXq != null ? xqVarXq.sz() : null;
        if (executorServiceSz == null) {
            com.bytedance.sdk.component.msw.ycc.emc(mswVar);
        } else {
            mswVar.setPriority(i10);
            executorServiceSz.execute(mswVar);
        }
    }

    public static ScheduledFuture emc(Runnable runnable, long j10, TimeUnit timeUnit) {
        return com.bytedance.sdk.component.msw.ycc.dg().schedule(runnable, j10, timeUnit);
    }
}
