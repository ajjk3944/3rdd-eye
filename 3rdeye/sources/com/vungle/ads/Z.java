package com.vungle.ads;

import android.content.Context;

/* compiled from: RewardedAd.kt */
/* loaded from: classes2.dex */
public final class Z extends AbstractC4062u {
    public /* synthetic */ Z(Context context, String str, C4045c c4045c, int i, kotlin.jvm.internal.g gVar) {
        this(context, str, (i & 4) != 0 ? new C4045c() : c4045c);
    }

    private final a0 getRewardedAdInternal() {
        com.vungle.ads.internal.a adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        kotlin.jvm.internal.l.d(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.RewardedAdInternal");
        return (a0) adInternal$vungle_ads_release;
    }

    public final void setAlertBodyText(String bodyText) {
        kotlin.jvm.internal.l.f(bodyText, "bodyText");
        getRewardedAdInternal().setAlertBodyText$vungle_ads_release(bodyText);
    }

    public final void setAlertCloseButtonText(String closeButtonText) {
        kotlin.jvm.internal.l.f(closeButtonText, "closeButtonText");
        getRewardedAdInternal().setAlertCloseButtonText$vungle_ads_release(closeButtonText);
    }

    public final void setAlertContinueButtonText(String continueButtonText) {
        kotlin.jvm.internal.l.f(continueButtonText, "continueButtonText");
        getRewardedAdInternal().setAlertContinueButtonText$vungle_ads_release(continueButtonText);
    }

    public final void setAlertTitleText(String titleText) {
        kotlin.jvm.internal.l.f(titleText, "titleText");
        getRewardedAdInternal().setAlertTitleText$vungle_ads_release(titleText);
    }

    public final void setUserId(String userId) {
        kotlin.jvm.internal.l.f(userId, "userId");
        getRewardedAdInternal().setUserId$vungle_ads_release(userId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(Context context, String placementId, C4045c adConfig) {
        super(context, placementId, adConfig);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(placementId, "placementId");
        kotlin.jvm.internal.l.f(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.AbstractC4059q
    public a0 constructAdInternal$vungle_ads_release(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return new a0(context);
    }
}
