package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdue implements zzgcx {
    final /* synthetic */ zzdug zza;

    public zzdue(zzdug zzdugVar) {
        this.zza = zzdugVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        synchronized (this) {
            zzdug zzdugVar = this.zza;
            zzdugVar.zzc = true;
            zzdugVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime() - zzdugVar.zzd));
            zzdugVar.zze.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            zzdug zzdugVar = this.zza;
            zzdugVar.zzc = true;
            zzdugVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime() - zzdugVar.zzd));
            zzdugVar.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdud
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    zzdug.zzo(this.zza.zza, str);
                }
            });
        }
    }
}
