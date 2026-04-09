package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfet implements zzgcx {
    final /* synthetic */ zzfew zza;
    final /* synthetic */ zzfex zzb;

    public zzfet(zzfex zzfexVar, zzfew zzfewVar) {
        this.zza = zzfewVar;
        this.zzb = zzfexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        zzfex zzfexVar = this.zzb;
        synchronized (zzfexVar) {
            zzfexVar.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfex zzfexVar = this.zzb;
        synchronized (zzfexVar) {
            try {
                zzfexVar.zze = null;
                zzfexVar.zzd.addFirst(this.zza);
                if (zzfexVar.zzf == 1) {
                    zzfexVar.zzh();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
