package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgdt {
    public static zzgdm zza(ExecutorService executorService) {
        return executorService instanceof zzgdm ? (zzgdm) executorService : executorService instanceof ScheduledExecutorService ? new zzgds((ScheduledExecutorService) executorService) : new zzgdp(executorService);
    }

    public static zzgdn zzb(ScheduledExecutorService scheduledExecutorService) {
        return new zzgds(scheduledExecutorService);
    }

    public static Executor zzc() {
        return zzgcp.INSTANCE;
    }

    public static Executor zzd(final Executor executor, final zzgbp zzgbpVar) {
        executor.getClass();
        return executor == zzgcp.INSTANCE ? executor : new Executor() { // from class: com.google.android.gms.internal.ads.zzgdo
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                zzgdt.zze(executor, zzgbpVar, runnable);
            }
        };
    }

    public static /* synthetic */ void zze(Executor executor, zzgbp zzgbpVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e4) {
            zzgbpVar.zzd(e4);
        }
    }
}
