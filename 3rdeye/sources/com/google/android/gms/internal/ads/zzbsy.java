package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbsy extends zzbhq {
    final /* synthetic */ zzbtb zza;

    public /* synthetic */ zzbsy(zzbtb zzbtbVar, zzbta zzbtaVar) {
        this.zza = zzbtbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhr
    public final void zze(zzbhh zzbhhVar, String str) {
        zzbtb zzbtbVar = this.zza;
        if (zzbtbVar.zzb == null) {
            return;
        }
        zzbtbVar.zzb.onCustomClick(zzbtbVar.zzf(zzbhhVar), str);
    }
}
