package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfjp implements zzgcx {
    final /* synthetic */ zzfhb zza;
    final /* synthetic */ zzfhm zzb;
    final /* synthetic */ zzcyb zzc;
    final /* synthetic */ zzfjq zzd;

    public zzfjp(zzfjq zzfjqVar, zzfhb zzfhbVar, zzfhm zzfhmVar, zzcyb zzcybVar) {
        this.zza = zzfhbVar;
        this.zzb = zzfhmVar;
        this.zzc = zzcybVar;
        this.zzd = zzfjqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        zzfhb zzfhbVar = this.zza;
        if (zzfhbVar == null) {
            return;
        }
        zzfhbVar.zzg(false);
        zzfhm zzfhmVar = this.zzb;
        if (zzfhmVar == null) {
            this.zzd.zzf.zzc(zzfhbVar.zzm());
        } else {
            zzfhmVar.zza(zzfhbVar);
            zzfhmVar.zzh();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    @Override // com.google.android.gms.internal.ads.zzgcx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjp.zzb(java.lang.Object):void");
    }
}
