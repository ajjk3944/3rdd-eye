package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfky extends zzbwz {
    final /* synthetic */ zzgdv zza;
    final /* synthetic */ zzbwt zzb;
    final /* synthetic */ zzfkz zzc;

    public zzfky(zzfkz zzfkzVar, zzgdv zzgdvVar, zzbwt zzbwtVar) {
        this.zza = zzgdvVar;
        this.zzb = zzbwtVar;
        this.zzc = zzfkzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String string = zzeVar.zzb().toString();
        zzfkz zzfkzVar = this.zzc;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load rewarded ad with error: " + string + ", adUnitId: " + zzfkzVar.zze.zza);
        zzfkzVar.zzL(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zzg() {
        zzfjt.zza(this.zzb, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zze(int i) {
    }
}
