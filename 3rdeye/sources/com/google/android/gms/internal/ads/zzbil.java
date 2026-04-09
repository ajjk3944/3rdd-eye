package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbil extends zzbhq {
    final /* synthetic */ zzbio zza;

    public /* synthetic */ zzbil(zzbio zzbioVar, zzbin zzbinVar) {
        this.zza = zzbioVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhr
    public final void zze(zzbhh zzbhhVar, String str) {
        zzbio zzbioVar = this.zza;
        if (zzbioVar.zzb == null) {
            return;
        }
        zzbioVar.zzb.zzb(zzbioVar.zzf(zzbhhVar), str);
    }
}
