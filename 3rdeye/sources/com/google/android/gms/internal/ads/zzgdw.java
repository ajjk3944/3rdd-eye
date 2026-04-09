package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgdw implements Runnable {
    zzgdz zza;

    public zzgdw(zzgdz zzgdzVar) {
        this.zza = zzgdzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A4.a aVar;
        zzgdz zzgdzVar = this.zza;
        if (zzgdzVar == null || (aVar = zzgdzVar.zza) == null) {
            return;
        }
        this.zza = null;
        if (aVar.isDone()) {
            zzgdzVar.zzn(aVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = zzgdzVar.zzb;
            zzgdzVar.zzb = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    zzgdzVar.zzd(new zzgdx(str, null));
                    throw th;
                }
            }
            zzgdzVar.zzd(new zzgdx(str + ": " + aVar.toString(), null));
        } finally {
            aVar.cancel(true);
        }
    }
}
