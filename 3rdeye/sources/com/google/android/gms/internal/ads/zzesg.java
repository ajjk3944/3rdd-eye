package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzesg implements zzetu {
    private final zzetu zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzesg(zzetu zzetuVar, long j4, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzetuVar;
        this.zzb = j4;
        this.zzc = scheduledExecutorService;
    }

    public static /* synthetic */ A4.a zzc(zzesg zzesgVar, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcx)).booleanValue()) {
            zzetu zzetuVar = zzesgVar.zza;
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "OptionalSignalTimeout:" + zzetuVar.zza());
        }
        return zzgdb.zzh(null);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        A4.a aVarZzb = this.zza.zzb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcy)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j4 = this.zzb;
        if (j4 > 0) {
            aVarZzb = zzgdb.zzo(aVarZzb, j4, timeUnit, this.zzc);
        }
        return zzgdb.zzf(aVarZzb, Throwable.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzesf
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzesg.zzc(this.zza, (Throwable) obj);
            }
        }, zzcad.zzg);
    }
}
