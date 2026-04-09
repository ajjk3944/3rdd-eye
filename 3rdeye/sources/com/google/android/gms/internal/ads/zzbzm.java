package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbzm extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzbzq zza;

    public zzbzm(zzbzq zzbzqVar) {
        this.zza = zzbzqVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzbzq zzbzqVar = this.zza;
        zzbdf zzbdfVar = new zzbdf(zzbzqVar.zze, zzbzqVar.zzf.afmaVersion);
        synchronized (zzbzqVar.zza) {
            try {
                com.google.android.gms.ads.internal.zzv.zze();
                zzbdi.zza(zzbzqVar.zzh, zzbdfVar);
            } catch (IllegalArgumentException e4) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot config CSI reporter.", e4);
            }
        }
    }
}
