package com.unity3d.ads.beta;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/beta/ShowListener;", "UnityAd", "", "unityAd", "Ly8/s;", "showStart", "(Ljava/lang/Object;)V", "showImpression", "showClick", "Lcom/unity3d/ads/beta/ShowFinishState;", "state", "showComplete", "(Ljava/lang/Object;Lcom/unity3d/ads/beta/ShowFinishState;)V", "Lcom/unity3d/ads/beta/UnityAdsError;", "error", "showFailed", "(Ljava/lang/Object;Lcom/unity3d/ads/beta/UnityAdsError;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ShowListener<UnityAd> {
    void showClick(UnityAd unityAd);

    void showComplete(UnityAd unityAd, @NotNull ShowFinishState state);

    void showFailed(UnityAd unityAd, @NotNull UnityAdsError error);

    void showImpression(UnityAd unityAd);

    void showStart(UnityAd unityAd);
}
