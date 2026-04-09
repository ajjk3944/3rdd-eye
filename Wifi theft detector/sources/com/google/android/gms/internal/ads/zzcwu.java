package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcwu {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final com.google.common.util.concurrent.a zzc;
    private volatile boolean zzd = true;

    public zzcwu(Executor executor, ScheduledExecutorService scheduledExecutorService, com.google.common.util.concurrent.a aVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = aVar;
    }

    public final void zza(zzgzl zzgzlVar) {
        zzgzo.zzr(this.zzc, new zzcwo(this, zzgzlVar), this.zza);
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final /* synthetic */ com.google.common.util.concurrent.a zzc(zzgzl zzgzlVar, com.google.common.util.concurrent.a aVar, zzcwf zzcwfVar) {
        if (zzcwfVar != null) {
            zzgzlVar.zzb(zzcwfVar);
        }
        return zzgzo.zzi(aVar, ((Long) zzbjs.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final /* synthetic */ void zze(List list, final zzgzl zzgzlVar) {
        if (list == null || list.isEmpty()) {
            this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcwt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgzlVar.zza(new zzecr(3));
                }
            });
            return;
        }
        com.google.common.util.concurrent.a aVarZza = zzgzo.zza(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final com.google.common.util.concurrent.a aVar = (com.google.common.util.concurrent.a) it.next();
            zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcwq
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ com.google.common.util.concurrent.a zza(Object obj) {
                    zzgzlVar.zza((Throwable) obj);
                    return zzgzo.zza(null);
                }
            };
            Executor executor = this.zza;
            aVarZza = zzgzo.zzj(zzgzo.zzh(aVarZza, Throwable.class, zzgywVar, executor), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcwr
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ com.google.common.util.concurrent.a zza(Object obj) {
                    return this.zza.zzc(zzgzlVar, aVar, (zzcwf) obj);
                }
            }, executor);
        }
        zzgzo.zzr(aVarZza, new zzcwp(this, zzgzlVar), this.zza);
    }

    public final /* synthetic */ void zzf() {
        zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcws
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        });
    }
}
