package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdre implements zzfgt {
    private final Map zza;
    private final zzbca zzb;

    public zzdre(zzbca zzbcaVar, Map map) {
        this.zza = map;
        this.zzb = zzbcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzd(zzfgm zzfgmVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfgmVar)) {
            this.zzb.zzc(((zzdrd) map.get(zzfgmVar)).zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdF(zzfgm zzfgmVar, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfgmVar)) {
            this.zzb.zzc(((zzdrd) map.get(zzfgmVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdG(zzfgm zzfgmVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfgmVar)) {
            this.zzb.zzc(((zzdrd) map.get(zzfgmVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdE(zzfgm zzfgmVar, String str) {
    }
}
