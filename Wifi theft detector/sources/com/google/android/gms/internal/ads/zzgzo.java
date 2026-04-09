package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzgzo extends zzgzq {
    public static com.google.common.util.concurrent.a zza(Object obj) {
        return obj == null ? zzgzs.zza : new zzgzs(obj);
    }

    public static com.google.common.util.concurrent.a zzb() {
        return zzgzs.zza;
    }

    public static com.google.common.util.concurrent.a zzc(Throwable th) {
        th.getClass();
        return new zzgzr(th);
    }

    public static com.google.common.util.concurrent.a zzd(Callable callable, Executor executor) {
        zzhan zzhanVar = new zzhan(callable);
        executor.execute(zzhanVar);
        return zzhanVar;
    }

    public static com.google.common.util.concurrent.a zze(Runnable runnable, Executor executor) {
        zzhan zzhanVarZze = zzhan.zze(runnable, null);
        executor.execute(zzhanVarZze);
        return zzhanVarZze;
    }

    public static com.google.common.util.concurrent.a zzf(zzgyv zzgyvVar, Executor executor) {
        zzhan zzhanVar = new zzhan(zzgyvVar);
        executor.execute(zzhanVar);
        return zzhanVar;
    }

    public static com.google.common.util.concurrent.a zzg(com.google.common.util.concurrent.a aVar, Class cls, zzgqt zzgqtVar, Executor executor) {
        int i10 = zzgyg.zzd;
        zzgyf zzgyfVar = new zzgyf(aVar, cls, zzgqtVar);
        aVar.addListener(zzgyfVar, zzhaf.zzd(executor, zzgyfVar));
        return zzgyfVar;
    }

    public static com.google.common.util.concurrent.a zzh(com.google.common.util.concurrent.a aVar, Class cls, zzgyw zzgywVar, Executor executor) {
        int i10 = zzgyg.zzd;
        zzgye zzgyeVar = new zzgye(aVar, cls, zzgywVar);
        aVar.addListener(zzgyeVar, zzhaf.zzd(executor, zzgyeVar));
        return zzgyeVar;
    }

    public static com.google.common.util.concurrent.a zzi(com.google.common.util.concurrent.a aVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return aVar.isDone() ? aVar : zzhak.zze(aVar, j10, timeUnit, scheduledExecutorService);
    }

    public static com.google.common.util.concurrent.a zzj(com.google.common.util.concurrent.a aVar, zzgyw zzgywVar, Executor executor) {
        int i10 = zzgyn.zzc;
        zzgyl zzgylVar = new zzgyl(aVar, zzgywVar);
        aVar.addListener(zzgylVar, zzhaf.zzd(executor, zzgylVar));
        return zzgylVar;
    }

    public static com.google.common.util.concurrent.a zzk(com.google.common.util.concurrent.a aVar, zzgqt zzgqtVar, Executor executor) {
        int i10 = zzgyn.zzc;
        zzgym zzgymVar = new zzgym(aVar, zzgqtVar);
        aVar.addListener(zzgymVar, zzhaf.zzd(executor, zzgymVar));
        return zzgymVar;
    }

    @SafeVarargs
    public static com.google.common.util.concurrent.a zzl(com.google.common.util.concurrent.a... aVarArr) {
        return new zzgyx(zzguf.zzr(aVarArr), true);
    }

    public static com.google.common.util.concurrent.a zzm(Iterable iterable) {
        return new zzgyx(zzguf.zzp(iterable), true);
    }

    public static zzgzn zzn(Iterable iterable) {
        return new zzgzn(false, zzguf.zzp(iterable), null);
    }

    @SafeVarargs
    public static zzgzn zzo(com.google.common.util.concurrent.a... aVarArr) {
        return new zzgzn(true, zzguf.zzr(aVarArr), null);
    }

    public static zzgzn zzp(Iterable iterable) {
        return new zzgzn(true, zzguf.zzp(iterable), null);
    }

    @SafeVarargs
    public static com.google.common.util.concurrent.a zzq(com.google.common.util.concurrent.a... aVarArr) {
        return new zzgyx(zzguf.zzr(aVarArr), false);
    }

    public static void zzr(com.google.common.util.concurrent.a aVar, zzgzl zzgzlVar, Executor executor) {
        zzgzlVar.getClass();
        aVar.addListener(new zzgzm(aVar, zzgzlVar), executor);
    }

    public static Object zzs(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzhap.zza(future);
        }
        throw new IllegalStateException(zzgrt.zzd("Future was expected to be done: %s", future));
    }

    public static Object zzt(Future future) {
        try {
            return zzhap.zza(future);
        } catch (ExecutionException e10) {
            if (e10.getCause() instanceof Error) {
                throw new zzgze((Error) e10.getCause());
            }
            throw new zzhao(e10.getCause());
        }
    }
}
