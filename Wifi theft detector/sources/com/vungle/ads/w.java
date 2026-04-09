package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.AdInternal;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class w extends BaseFullscreenAd {
    public /* synthetic */ w(Context context, String str, AdConfig adConfig, int i10, kotlin.jvm.internal.i iVar) {
        this(context, str, (i10 & 4) != 0 ? new AdConfig() : adConfig);
    }

    private final com.vungle.ads.internal.h getRewardedAdInternal() {
        AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        kotlin.jvm.internal.p.c(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.RewardedAdInternal");
        return (com.vungle.ads.internal.h) adInternal$vungle_ads_release;
    }

    public final void setAlertBodyText(@NotNull String bodyText) {
        kotlin.jvm.internal.p.e(bodyText, "bodyText");
        getRewardedAdInternal().setAlertBodyText$vungle_ads_release(bodyText);
    }

    public final void setAlertCloseButtonText(@NotNull String closeButtonText) {
        kotlin.jvm.internal.p.e(closeButtonText, "closeButtonText");
        getRewardedAdInternal().setAlertCloseButtonText$vungle_ads_release(closeButtonText);
    }

    public final void setAlertContinueButtonText(@NotNull String continueButtonText) {
        kotlin.jvm.internal.p.e(continueButtonText, "continueButtonText");
        getRewardedAdInternal().setAlertContinueButtonText$vungle_ads_release(continueButtonText);
    }

    public final void setAlertTitleText(@NotNull String titleText) {
        kotlin.jvm.internal.p.e(titleText, "titleText");
        getRewardedAdInternal().setAlertTitleText$vungle_ads_release(titleText);
    }

    public final void setUserId(@NotNull String userId) {
        kotlin.jvm.internal.p.e(userId, "userId");
        getRewardedAdInternal().setUserId$vungle_ads_release(userId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@NotNull Context context, @NotNull String placementId, @NotNull AdConfig adConfig) {
        super(context, placementId, adConfig);
        kotlin.jvm.internal.p.e(context, "context");
        kotlin.jvm.internal.p.e(placementId, "placementId");
        kotlin.jvm.internal.p.e(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.BaseAd
    @NotNull
    public com.vungle.ads.internal.h constructAdInternal$vungle_ads_release(@NotNull Context context) {
        kotlin.jvm.internal.p.e(context, "context");
        return new com.vungle.ads.internal.h(context);
    }
}
