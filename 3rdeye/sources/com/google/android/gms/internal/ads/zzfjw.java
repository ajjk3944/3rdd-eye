package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfjw extends zzbaw {
    final /* synthetic */ zzgdv zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzfv zzb;
    final /* synthetic */ zzfjx zzc;

    public zzfjw(zzfjx zzfjxVar, zzgdv zzgdvVar, com.google.android.gms.ads.internal.client.zzfv zzfvVar) {
        this.zza = zzgdvVar;
        this.zzb = zzfvVar;
        this.zzc = zzfjxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load app open ad with error parcel: " + zzeVar.zzb().toString() + " for ad unit: " + this.zzb.zza);
        this.zzc.zzL(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void zzd(zzbau zzbauVar) {
        zzfjt.zza(zzbauVar, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void zzb(int i) {
    }
}
