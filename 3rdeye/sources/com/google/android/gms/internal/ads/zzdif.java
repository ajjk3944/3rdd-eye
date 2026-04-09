package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdif implements zzgcx {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdih zzb;

    public zzdif(zzdih zzdihVar, String str, boolean z10) {
        this.zzb = zzdihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfC)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdih zzdihVar = this.zzb;
        zzdihVar.zze.zzT((zzcfe) obj);
        zzcai zzcaiVarZzp = zzdihVar.zze.zzp();
        zzecz zzeczVarZzf = zzdihVar.zzf(this.zza, true);
        if (zzeczVarZzf != null && zzcaiVarZzp != null) {
            zzcaiVarZzp.zzc(zzeczVarZzf);
        } else if (zzcaiVarZzp != null) {
            zzcaiVarZzp.cancel(false);
        }
    }
}
