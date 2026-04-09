package com.unity3d.ads.beta;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/beta/LoadListener;", "UnityAd", "", "unityAd", "Lcom/unity3d/ads/beta/UnityAdsError;", "error", "Ly8/s;", "onAdLoaded", "(Ljava/lang/Object;Lcom/unity3d/ads/beta/UnityAdsError;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LoadListener<UnityAd> {
    void onAdLoaded(@Nullable UnityAd unityAd, @Nullable UnityAdsError error);
}
