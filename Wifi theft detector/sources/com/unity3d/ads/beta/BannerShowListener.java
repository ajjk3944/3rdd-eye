package com.unity3d.ads.beta;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/beta/BannerShowListener;", "", "Lcom/unity3d/ads/beta/BannerAd;", "banner", "Ly8/s;", "unityAdsBannerImpression", "(Lcom/unity3d/ads/beta/BannerAd;)V", "unityAdsBannerDidClick", "Lcom/unity3d/ads/beta/UnityAdsError;", "error", "unityAdsBannerDidFailShow", "(Lcom/unity3d/ads/beta/BannerAd;Lcom/unity3d/ads/beta/UnityAdsError;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BannerShowListener {
    void unityAdsBannerDidClick(@NotNull BannerAd banner);

    void unityAdsBannerDidFailShow(@NotNull BannerAd banner, @NotNull UnityAdsError error);

    void unityAdsBannerImpression(@NotNull BannerAd banner);
}
