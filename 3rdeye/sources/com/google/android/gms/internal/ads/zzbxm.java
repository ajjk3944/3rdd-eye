package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbxm extends zzbwz {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbxn zzb;

    public zzbxm(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbxn zzbxnVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zzg() {
        zzbxn zzbxnVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzbxnVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzbxnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zze(int i) {
    }
}
