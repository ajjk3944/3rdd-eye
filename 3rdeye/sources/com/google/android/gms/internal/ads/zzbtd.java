package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbtd extends zzbia {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbtd(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbib
    public final void zze(zzbih zzbihVar) {
        this.zza.onNativeAdLoaded(new zzbsx(zzbihVar));
    }
}
