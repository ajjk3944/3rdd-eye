package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcmp implements zzcvu {
    private final zzfbw zza;
    private final zzfcf zzb;
    private final zzfjm zzc;
    private final zzfjq zzd;

    public zzcmp(zzfcf zzfcfVar, zzfjq zzfjqVar, zzfjm zzfjmVar) {
        this.zzb = zzfcfVar;
        this.zzd = zzfjqVar;
        this.zzc = zzfjmVar;
        this.zza = zzfcfVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final void zzdD(com.google.android.gms.ads.internal.client.zze zzeVar) {
        List list = this.zza.zza;
        this.zzd.zze(this.zzc.zzd(this.zzb, null, list), null);
    }
}
