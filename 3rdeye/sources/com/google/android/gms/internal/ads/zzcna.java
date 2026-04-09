package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcna implements zzbkd {
    final /* synthetic */ zzcnd zza;

    public zzcna(zzcnd zzcndVar) {
        this.zza = zzcndVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzcnd zzcndVar = this.zza;
        if (zzcnd.zzg(zzcndVar, map)) {
            zzcndVar.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmz
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza.zzd.zzg();
                }
            });
        }
    }
}
