package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfbo implements zzelf {
    final /* synthetic */ zzfbq zza;

    public zzfbo(zzfbq zzfbqVar) {
        this.zza = zzfbqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final void zza() {
        zzfbq zzfbqVar = this.zza;
        synchronized (zzfbqVar) {
            zzfbqVar.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfbq zzfbqVar = this.zza;
        zzdog zzdogVar = (zzdog) obj;
        synchronized (zzfbqVar) {
            try {
                zzfbqVar.zzd = zzdogVar;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdN)).booleanValue()) {
                    zzdogVar.zzd().zza = zzfbqVar.zzc;
                }
                zzfbqVar.zzd.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
