package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.g;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdop implements zzhfy {
    private final zzhgh zza;

    public zzdop(zzhgh zzhghVar) {
        this.zza = zzhghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzcvi) this.zza).zza().zzo.zza == 3 ? "rewarded_interstitial" : g.PLACEMENT_TYPE_REWARDED;
    }
}
