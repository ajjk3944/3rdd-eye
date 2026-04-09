package com.vungle.ads;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface g {
    void onAdClicked(@NotNull BaseAd baseAd);

    void onAdEnd(@NotNull BaseAd baseAd);

    void onAdFailedToLoad(@NotNull BaseAd baseAd, @NotNull VungleError vungleError);

    void onAdFailedToPlay(@NotNull BaseAd baseAd, @NotNull VungleError vungleError);

    void onAdImpression(@NotNull BaseAd baseAd);

    void onAdLeftApplication(@NotNull BaseAd baseAd);

    void onAdLoaded(@NotNull BaseAd baseAd);

    void onAdStart(@NotNull BaseAd baseAd);
}
