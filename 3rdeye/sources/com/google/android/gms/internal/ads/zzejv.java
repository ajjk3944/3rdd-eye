package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzejv implements zzelf {
    final /* synthetic */ zzejw zza;

    public zzejv(zzejw zzejwVar) {
        this.zza = zzejwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final void zza() {
        zzejw zzejwVar = this.zza;
        synchronized (zzejwVar) {
            zzejwVar.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzejw zzejwVar = this.zza;
        zzcon zzconVar = (zzcon) obj;
        synchronized (zzejwVar) {
            try {
                if (zzejwVar.zzi != null) {
                    zzejwVar.zzi.zzb();
                }
                zzejwVar.zzi = zzconVar;
                zzejwVar.zzi.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
