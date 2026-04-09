package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfhj implements zzgcx {
    final /* synthetic */ zzfhm zza;
    final /* synthetic */ zzfhb zzb;
    final /* synthetic */ boolean zzc;

    public zzfhj(zzfhm zzfhmVar, zzfhb zzfhbVar, boolean z10) {
        this.zza = zzfhmVar;
        this.zzb = zzfhbVar;
        this.zzc = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        zzfhb zzfhbVar = this.zzb;
        if (zzfhbVar.zzk()) {
            zzfhm zzfhmVar = this.zza;
            zzfhbVar.zzh(th);
            zzfhbVar.zzg(false);
            zzfhmVar.zza(zzfhbVar);
            if (this.zzc) {
                zzfhmVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zzb(Object obj) {
        zzfhb zzfhbVar = this.zzb;
        zzfhbVar.zzg(true);
        zzfhm zzfhmVar = this.zza;
        zzfhmVar.zza(zzfhbVar);
        if (this.zzc) {
            zzfhmVar.zzh();
        }
    }
}
