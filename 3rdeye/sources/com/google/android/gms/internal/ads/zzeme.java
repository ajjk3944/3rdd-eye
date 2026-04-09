package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeme implements zzetu {
    private final A4.a zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzeme(A4.a aVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = aVar;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzemc
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzgdb.zzh(new zzemf((String) obj));
            }
        };
        A4.a aVar = this.zza;
        Executor executor = this.zzb;
        A4.a aVarZzn = zzgdb.zzn(aVar, zzgciVar, executor);
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmI)).intValue() > 0) {
            aVarZzn = zzgdb.zzo(aVarZzn, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(r1)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgdb.zzf(aVarZzn, Throwable.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzemd
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return ((Throwable) obj) instanceof TimeoutException ? zzgdb.zzh(new zzemf(Integer.toString(17))) : zzgdb.zzh(new zzemf(null));
            }
        }, executor);
    }
}
