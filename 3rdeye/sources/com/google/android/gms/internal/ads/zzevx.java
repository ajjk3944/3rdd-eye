package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzevx implements zzetu {
    final ScheduledExecutorService zza;

    public zzevx(zzbts zzbtsVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return zzgdb.zzm(zzgdb.zzo(zzgdb.zzh(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzes)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzfut() { // from class: com.google.android.gms.internal.ads.zzevw
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return new zzevy((Bundle) obj);
            }
        }, zzcad.zza);
    }
}
