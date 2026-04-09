package com.google.android.gms.internal.ads;

import N7.C1154e9;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgdz extends zzgcr {
    private A4.a zza;
    private ScheduledFuture zzb;

    private zzgdz(A4.a aVar) {
        aVar.getClass();
        this.zza = aVar;
    }

    public static A4.a zzf(A4.a aVar, long j4, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgdz zzgdzVar = new zzgdz(aVar);
        zzgdw zzgdwVar = new zzgdw(zzgdzVar);
        zzgdzVar.zzb = scheduledExecutorService.schedule(zzgdwVar, j4, timeUnit);
        aVar.addListener(zzgdwVar, zzgcp.INSTANCE);
        return zzgdzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final String zza() {
        A4.a aVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (aVar == null) {
            return null;
        }
        String strI = C1154e9.i("inputFuture=[", aVar.toString(), "]");
        if (scheduledFuture == null) {
            return strI;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strI;
        }
        return strI + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final void zzb() {
        zzl(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
