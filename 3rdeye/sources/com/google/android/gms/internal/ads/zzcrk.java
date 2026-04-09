package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcrk {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final A4.a zzc;
    private volatile boolean zzd = true;

    public zzcrk(Executor executor, ScheduledExecutorService scheduledExecutorService, A4.a aVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = aVar;
    }

    public static /* synthetic */ A4.a zza(zzcrk zzcrkVar, zzgcx zzgcxVar, A4.a aVar, zzcqv zzcqvVar) {
        if (zzcqvVar != null) {
            zzgcxVar.zzb(zzcqvVar);
        }
        return zzgdb.zzo(aVar, ((Long) zzbfp.zza.zze()).longValue(), TimeUnit.MILLISECONDS, zzcrkVar.zzb);
    }

    public static /* bridge */ /* synthetic */ void zzc(final zzcrk zzcrkVar, List list, final zzgcx zzgcxVar) {
        if (list == null || list.isEmpty()) {
            zzcrkVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrf
                @Override // java.lang.Runnable
                public final void run() {
                    zzgcxVar.zza(new zzdwe(3));
                }
            });
            return;
        }
        A4.a aVarZzh = zzgdb.zzh(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final A4.a aVar = (A4.a) it.next();
            zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzcrg
                @Override // com.google.android.gms.internal.ads.zzgci
                public final A4.a zza(Object obj) {
                    zzgcxVar.zza((Throwable) obj);
                    return zzgdb.zzh(null);
                }
            };
            Executor executor = zzcrkVar.zza;
            aVarZzh = zzgdb.zzn(zzgdb.zzf(aVarZzh, Throwable.class, zzgciVar, executor), new zzgci() { // from class: com.google.android.gms.internal.ads.zzcrh
                @Override // com.google.android.gms.internal.ads.zzgci
                public final A4.a zza(Object obj) {
                    return zzcrk.zza(this.zza, zzgcxVar, aVar, (zzcqv) obj);
                }
            }, executor);
        }
        zzgdb.zzr(aVarZzh, new zzcrj(zzcrkVar, zzgcxVar), zzcrkVar.zza);
    }

    public final void zze(zzgcx zzgcxVar) {
        zzgdb.zzr(this.zzc, new zzcri(this, zzgcxVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
