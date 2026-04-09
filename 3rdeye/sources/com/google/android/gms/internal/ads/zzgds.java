package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgds extends zzgdp implements AutoCloseable, zzgdn {
    final ScheduledExecutorService zza;

    public zzgds(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgbv, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        if ((Build.VERSION.SDK_INT <= 23 || this != ForkJoinPool.commonPool()) && !isTerminated()) {
            shutdown();
            boolean zAwaitTermination = false;
            boolean z10 = false;
            while (!zAwaitTermination) {
                try {
                    zAwaitTermination = awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        shutdownNow();
                    }
                    z10 = true;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j4, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzgec zzgecVarZze = zzgec.zze(runnable, null);
        return new zzgdq(zzgecVarZze, scheduledExecutorService.schedule(zzgecVarZze, j4, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j4, long j10, TimeUnit timeUnit) {
        zzgdr zzgdrVar = new zzgdr(runnable);
        return new zzgdq(zzgdrVar, this.zza.scheduleAtFixedRate(zzgdrVar, j4, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j4, long j10, TimeUnit timeUnit) {
        zzgdr zzgdrVar = new zzgdr(runnable);
        return new zzgdq(zzgdrVar, this.zza.scheduleWithFixedDelay(zzgdrVar, j4, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzgdl schedule(Callable callable, long j4, TimeUnit timeUnit) {
        zzgec zzgecVar = new zzgec(callable);
        return new zzgdq(zzgecVar, this.zza.schedule(zzgecVar, j4, timeUnit));
    }
}
