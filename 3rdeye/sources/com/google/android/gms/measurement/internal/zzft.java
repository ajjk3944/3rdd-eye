package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
final class zzft extends FutureTask implements Comparable {
    final boolean zza;
    final /* synthetic */ zzfv zzb;
    private final long zzc;
    private final String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzft(zzfv zzfvVar, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        this.zzb = zzfvVar;
        Preconditions.checkNotNull(str);
        long andIncrement = zzfv.zza.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z10;
        if (andIncrement == Long.MAX_VALUE) {
            a.k(zzfvVar.zzs, "Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzft zzftVar = (zzft) obj;
        boolean z10 = this.zza;
        if (z10 != zzftVar.zza) {
            return !z10 ? 1 : -1;
        }
        long j4 = this.zzc;
        long j10 = zzftVar.zzc;
        if (j4 < j10) {
            return -1;
        }
        if (j4 > j10) {
            return 1;
        }
        this.zzb.zzs.zzay().zzh().zzb("Two tasks share the same index. index", Long.valueOf(this.zzc));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzs.zzay().zzd().zzb(this.zzd, th);
        if ((th instanceof zzfr) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzft(zzfv zzfvVar, Callable callable, boolean z10, String str) {
        super(callable);
        this.zzb = zzfvVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        long andIncrement = zzfv.zza.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z10;
        if (andIncrement == Long.MAX_VALUE) {
            a.k(zzfvVar.zzs, "Tasks index overflow");
        }
    }
}
