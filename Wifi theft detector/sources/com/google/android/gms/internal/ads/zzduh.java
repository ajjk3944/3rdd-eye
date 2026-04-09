package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbgj;

/* loaded from: classes2.dex */
public final class zzduh implements zzikg {
    private final zzikp zza;

    private zzduh(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzduh zza(zzikp zzikpVar) {
        return new zzduh(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbgj.zza.EnumC0198zza enumC0198zza = ((zzdaw) this.zza).zza().zzp.zza == 3 ? zzbgj.zza.EnumC0198zza.REWARDED_INTERSTITIAL : zzbgj.zza.EnumC0198zza.REWARD_BASED_VIDEO_AD;
        zziko.zzb(enumC0198zza);
        return enumC0198zza;
    }
}
