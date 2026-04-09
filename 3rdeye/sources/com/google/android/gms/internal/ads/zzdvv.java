package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdvv extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdvy zzb;

    public zzdvv(zzdvy zzdvyVar, String str) {
        this.zza = str;
        this.zzb = zzdvyVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzb.zzm(zzdvy.zzl(loadAdError), this.zza);
    }
}
