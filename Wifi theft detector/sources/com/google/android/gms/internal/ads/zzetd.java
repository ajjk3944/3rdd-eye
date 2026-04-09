package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzetd implements zzfax {
    private final com.google.common.util.concurrent.a zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzetd(com.google.common.util.concurrent.a aVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = aVar;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.a zza() {
        com.google.common.util.concurrent.a aVar = this.zza;
        zzetc zzetcVar = zzetc.zza;
        Executor executor = this.zzb;
        com.google.common.util.concurrent.a aVarZzj = zzgzo.zzj(aVar, zzetcVar, executor);
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznV)).intValue() > 0) {
            aVarZzj = zzgzo.zzi(aVarZzj, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(r1)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgzo.zzh(aVarZzj, Throwable.class, zzetb.zza, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 6;
    }
}
