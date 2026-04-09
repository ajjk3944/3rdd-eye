package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdxx implements zzgcx {
    final /* synthetic */ Context zza;

    public zzdxx(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        if (((Boolean) zzbeu.zzh.zze()).booleanValue() && (th instanceof com.google.android.gms.ads.internal.util.zzba)) {
            zzbcm.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbeu.zzj.zze()).booleanValue()) {
            zzbcm.zze(this.zza);
        }
    }
}
