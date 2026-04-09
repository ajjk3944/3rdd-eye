package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfbj implements zzelf {
    final /* synthetic */ zzfbk zza;

    public zzfbj(zzfbk zzfbkVar) {
        this.zza = zzfbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final void zza() {
        zzfbk zzfbkVar = this.zza;
        synchronized (zzfbkVar) {
            zzfbkVar.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfbk zzfbkVar = this.zza;
        zzdog zzdogVar = (zzdog) obj;
        synchronized (zzfbkVar) {
            try {
                zzfbkVar.zzi = zzdogVar;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdN)).booleanValue()) {
                    zzdogVar.zzd().zza = zzfbkVar.zzd;
                }
                zzfbkVar.zzi.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
