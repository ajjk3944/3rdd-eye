package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdlu implements zzgcx {
    final /* synthetic */ zzcai zza;

    public zzdlu(zzdlv zzdlvVar, zzcai zzcaiVar) {
        this.zza = zzcaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load media data due to video view load failure.");
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcfe zzcfeVar = (zzcfe) obj;
        if (zzcfeVar == null) {
            this.zza.zzd(new zzegx(1, "Missing webview from video view future."));
        } else {
            zzcfeVar.zzag("/video", new zzccx(new zzdlt(this.zza)));
            zzcfeVar.zzaa();
        }
    }
}
