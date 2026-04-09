package com.vungle.ads;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface f extends g {
    @Override // com.vungle.ads.g
    /* synthetic */ void onAdClicked(@NotNull BaseAd baseAd);

    @Override // com.vungle.ads.g
    /* synthetic */ void onAdEnd(@NotNull BaseAd baseAd);

    @Override // com.vungle.ads.g
    /* synthetic */ void onAdFailedToLoad(@NotNull BaseAd baseAd, @NotNull VungleError vungleError);

    @Override // com.vungle.ads.g
    /* synthetic */ void onAdFailedToPlay(@NotNull BaseAd baseAd, @NotNull VungleError vungleError);

    @Override // com.vungle.ads.g
    /* synthetic */ void onAdImpression(@NotNull BaseAd baseAd);

    @Override // com.vungle.ads.g
    /* synthetic */ void onAdLeftApplication(@NotNull BaseAd baseAd);

    @Override // com.vungle.ads.g
    /* synthetic */ void onAdLoaded(@NotNull BaseAd baseAd);

    @Override // com.vungle.ads.g
    /* synthetic */ void onAdStart(@NotNull BaseAd baseAd);
}
