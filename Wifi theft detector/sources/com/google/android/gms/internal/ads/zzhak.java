package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class zzhak extends zzgzf {
    private com.google.common.util.concurrent.a zza;
    private ScheduledFuture zzb;

    private zzhak(com.google.common.util.concurrent.a aVar) {
        aVar.getClass();
        this.zza = aVar;
    }

    public static com.google.common.util.concurrent.a zze(com.google.common.util.concurrent.a aVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzhak zzhakVar = new zzhak(aVar);
        zzhai zzhaiVar = new zzhai(zzhakVar);
        zzhakVar.zzb = scheduledExecutorService.schedule(zzhaiVar, j10, timeUnit);
        aVar.addListener(zzhaiVar, zzgzd.INSTANCE);
        return zzhakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzc() {
        zzm(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String zzd() {
        com.google.common.util.concurrent.a aVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (aVar == null) {
            return null;
        }
        String string = aVar.toString();
        StringBuilder sb = new StringBuilder(string.length() + 14);
        sb.append("inputFuture=[");
        sb.append(string);
        sb.append("]");
        String string2 = sb.toString();
        if (scheduledFuture == null) {
            return string2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return string2;
        }
        StringBuilder sb2 = new StringBuilder(string2.length() + 19 + String.valueOf(delay).length() + 4);
        sb2.append(string2);
        sb2.append(", remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    public final /* synthetic */ com.google.common.util.concurrent.a zzf() {
        return this.zza;
    }

    public final /* synthetic */ ScheduledFuture zzx() {
        return this.zzb;
    }

    public final /* synthetic */ void zzy(ScheduledFuture scheduledFuture) {
        this.zzb = null;
    }
}
