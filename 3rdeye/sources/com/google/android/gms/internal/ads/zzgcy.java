package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgcy implements Runnable {
    final Future zza;
    final zzgcx zzb;

    public zzgcy(Future future, zzgcx zzgcxVar) {
        this.zza = future;
        this.zzb = zzgcxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thZza;
        Future future = this.zza;
        if ((future instanceof zzgef) && (thZza = zzgeg.zza((zzgef) future)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            this.zzb.zzb(zzgdb.zzp(future));
        } catch (ExecutionException e4) {
            this.zzb.zza(e4.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzfuy zzfuyVarZza = zzfva.zza(this);
        zzfuyVarZza.zza(this.zzb);
        return zzfuyVarZza.toString();
    }
}
