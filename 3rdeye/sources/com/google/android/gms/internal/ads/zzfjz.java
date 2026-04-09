package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfjz extends com.google.android.gms.ads.internal.client.zzbm {
    final /* synthetic */ zzgdv zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbx zzb;
    final /* synthetic */ zzfka zzc;

    public zzfjz(zzfka zzfkaVar, zzgdv zzgdvVar, com.google.android.gms.ads.internal.client.zzbx zzbxVar) {
        this.zza = zzgdvVar;
        this.zzb = zzbxVar;
        this.zzc = zzfkaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String string = zzeVar.zzb().toString();
        zzfka zzfkaVar = this.zzc;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load interstitial ad with error: " + string + " for ad unit: " + zzfkaVar.zze.zza);
        zzfkaVar.zzL(zzeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzc() {
        zzfjt.zza(this.zzb, this.zza);
    }
}
