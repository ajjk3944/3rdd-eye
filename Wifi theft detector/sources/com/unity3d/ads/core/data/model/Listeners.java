package com.unity3d.ads.core.data.model;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/data/model/Listeners;", "", "", HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID, "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "error", PglCryptUtils.KEY_MESSAGE, "Ly8/s;", "onError", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAds$UnityAdsShowError;Ljava/lang/String;)V", "onStart", "(Ljava/lang/String;)V", "onClick", "Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;", "state", "onComplete", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;)V", "onLeftApplication", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Listeners {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onClick(@NotNull Listeners listeners, @NotNull String placementId) {
            p.e(placementId, "placementId");
        }

        public static void onComplete(@NotNull Listeners listeners, @NotNull String placementId, @NotNull UnityAds.UnityAdsShowCompletionState state) {
            p.e(placementId, "placementId");
            p.e(state, "state");
        }

        public static void onError(@NotNull Listeners listeners, @NotNull String placementId, @NotNull UnityAds.UnityAdsShowError error, @NotNull String message) {
            p.e(placementId, "placementId");
            p.e(error, "error");
            p.e(message, "message");
        }

        public static void onLeftApplication(@NotNull Listeners listeners, @NotNull String placementId) {
            p.e(placementId, "placementId");
        }

        public static void onStart(@NotNull Listeners listeners, @NotNull String placementId) {
            p.e(placementId, "placementId");
        }
    }

    void onClick(@NotNull String placementId);

    void onComplete(@NotNull String placementId, @NotNull UnityAds.UnityAdsShowCompletionState state);

    void onError(@NotNull String placementId, @NotNull UnityAds.UnityAdsShowError error, @NotNull String message);

    void onLeftApplication(@NotNull String placementId);

    void onStart(@NotNull String placementId);
}
