package com.unity3d.ads.beta;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0005\u0010\n\u001a\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/beta/UnityAdsPrivacyFlag;", "privacy", "Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ly8/s;", "set", "(Lcom/unity3d/ads/beta/UnityAdsPrivacyFlag;Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;)V", "Lcom/unity3d/ads/beta/UnityAdsPrivacyConsent;", "consent", "Lcom/unity3d/ads/beta/UnityAdsPrivacyConsentValue;", "(Lcom/unity3d/ads/beta/UnityAdsPrivacyConsent;Lcom/unity3d/ads/beta/UnityAdsPrivacyConsentValue;)V", "", "flag", "setPrivacy", "(Ljava/lang/String;Lcom/unity3d/ads/beta/UnityAdsPrivacyValue;)V", "(Ljava/lang/String;Lcom/unity3d/ads/beta/UnityAdsPrivacyConsentValue;)V", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = "UnityAdsPrivacy")
/* loaded from: classes3.dex */
public final class UnityAdsPrivacy {
    public static final void set(@NotNull UnityAdsPrivacyConsent consent, @NotNull UnityAdsPrivacyConsentValue value) {
        p.e(consent, "consent");
        p.e(value, "value");
    }

    public static final void setPrivacy(@NotNull String flag, @NotNull UnityAdsPrivacyConsentValue value) {
        p.e(flag, "flag");
        p.e(value, "value");
    }

    public static final void set(@NotNull UnityAdsPrivacyFlag privacy, @NotNull UnityAdsPrivacyValue value) {
        p.e(privacy, "privacy");
        p.e(value, "value");
    }

    public static final void setPrivacy(@NotNull String flag, @NotNull UnityAdsPrivacyValue consent) {
        p.e(flag, "flag");
        p.e(consent, "consent");
    }
}
