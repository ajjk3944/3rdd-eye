package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbch;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdoo implements zzhfy {
    private final zzhgh zza;

    public zzdoo(zzhgh zzhghVar) {
        this.zza = zzhghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbch.zza.EnumC0333zza enumC0333zza = ((zzcvi) this.zza).zza().zzo.zza == 3 ? zzbch.zza.EnumC0333zza.REWARDED_INTERSTITIAL : zzbch.zza.EnumC0333zza.REWARD_BASED_VIDEO_AD;
        zzhgg.zzb(enumC0333zza);
        return enumC0333zza;
    }
}
