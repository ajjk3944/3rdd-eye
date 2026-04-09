package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgdb extends zzgdd {
    public static zzgcz zza(Iterable iterable) {
        return new zzgcz(false, zzfyf.zzk(iterable), null);
    }

    public static zzgcz zzb(Iterable iterable) {
        return new zzgcz(true, zzfyf.zzk(iterable), null);
    }

    @SafeVarargs
    public static zzgcz zzc(A4.a... aVarArr) {
        return new zzgcz(true, zzfyf.zzm(aVarArr), null);
    }

    public static A4.a zzd(Iterable iterable) {
        return new zzgcj(zzfyf.zzk(iterable), true);
    }

    public static A4.a zze(A4.a aVar, Class cls, zzfut zzfutVar, Executor executor) {
        int i = zzgbo.zzd;
        zzgbn zzgbnVar = new zzgbn(aVar, cls, zzfutVar);
        aVar.addListener(zzgbnVar, zzgdt.zzd(executor, zzgbnVar));
        return zzgbnVar;
    }

    public static A4.a zzf(A4.a aVar, Class cls, zzgci zzgciVar, Executor executor) {
        int i = zzgbo.zzd;
        zzgbm zzgbmVar = new zzgbm(aVar, cls, zzgciVar);
        aVar.addListener(zzgbmVar, zzgdt.zzd(executor, zzgbmVar));
        return zzgbmVar;
    }

    public static A4.a zzg(Throwable th) {
        th.getClass();
        return new zzgde(th);
    }

    public static A4.a zzh(Object obj) {
        return obj == null ? zzgdf.zza : new zzgdf(obj);
    }

    public static A4.a zzi() {
        return zzgdf.zza;
    }

    public static A4.a zzj(Callable callable, Executor executor) {
        zzgec zzgecVar = new zzgec(callable);
        executor.execute(zzgecVar);
        return zzgecVar;
    }

    public static A4.a zzk(zzgch zzgchVar, Executor executor) {
        zzgec zzgecVar = new zzgec(zzgchVar);
        executor.execute(zzgecVar);
        return zzgecVar;
    }

    @SafeVarargs
    public static A4.a zzl(A4.a... aVarArr) {
        return new zzgcj(zzfyf.zzm(aVarArr), false);
    }

    public static A4.a zzm(A4.a aVar, zzfut zzfutVar, Executor executor) {
        int i = zzgby.zzc;
        zzgbx zzgbxVar = new zzgbx(aVar, zzfutVar);
        aVar.addListener(zzgbxVar, zzgdt.zzd(executor, zzgbxVar));
        return zzgbxVar;
    }

    public static A4.a zzn(A4.a aVar, zzgci zzgciVar, Executor executor) {
        int i = zzgby.zzc;
        zzgbw zzgbwVar = new zzgbw(aVar, zzgciVar);
        aVar.addListener(zzgbwVar, zzgdt.zzd(executor, zzgbwVar));
        return zzgbwVar;
    }

    public static A4.a zzo(A4.a aVar, long j4, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return aVar.isDone() ? aVar : zzgdz.zzf(aVar, j4, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgee.zza(future);
        }
        throw new IllegalStateException(zzfvv.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzgee.zza(future);
        } catch (ExecutionException e4) {
            if (e4.getCause() instanceof Error) {
                throw new zzgcq((Error) e4.getCause());
            }
            throw new zzged(e4.getCause());
        }
    }

    public static void zzr(A4.a aVar, zzgcx zzgcxVar, Executor executor) {
        zzgcxVar.getClass();
        aVar.addListener(new zzgcy(aVar, zzgcxVar), executor);
    }
}
