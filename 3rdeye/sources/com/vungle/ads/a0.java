package com.vungle.ads;

import a6.C1653b;
import a6.C1661j;
import android.content.Context;

/* compiled from: RewardedAd.kt */
/* loaded from: classes2.dex */
public final class a0 extends AbstractC4067z implements com.vungle.ads.internal.presenter.j {
    private String alertBodyText;
    private String alertCloseButtonText;
    private String alertContinueButtonText;
    private String alertTitleText;
    private String userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
    }

    @Override // com.vungle.ads.internal.presenter.j
    public String getAlertBodyText() {
        return this.alertBodyText;
    }

    public final String getAlertBodyText$vungle_ads_release() {
        return this.alertBodyText;
    }

    @Override // com.vungle.ads.internal.presenter.j
    public String getAlertCloseButtonText() {
        return this.alertCloseButtonText;
    }

    public final String getAlertCloseButtonText$vungle_ads_release() {
        return this.alertCloseButtonText;
    }

    @Override // com.vungle.ads.internal.presenter.j
    public String getAlertContinueButtonText() {
        return this.alertContinueButtonText;
    }

    public final String getAlertContinueButtonText$vungle_ads_release() {
        return this.alertContinueButtonText;
    }

    @Override // com.vungle.ads.internal.presenter.j
    public String getAlertTitleText() {
        return this.alertTitleText;
    }

    public final String getAlertTitleText$vungle_ads_release() {
        return this.alertTitleText;
    }

    @Override // com.vungle.ads.internal.presenter.j
    public String getUserId() {
        return this.userId;
    }

    public final String getUserId$vungle_ads_release() {
        return this.userId;
    }

    @Override // com.vungle.ads.internal.a
    public boolean isValidAdTypeForPlacement(C1661j placement) {
        kotlin.jvm.internal.l.f(placement, "placement");
        return placement.isRewardedVideo();
    }

    @Override // com.vungle.ads.internal.a
    public void renderAd$vungle_ads_release(com.vungle.ads.internal.presenter.b bVar, C1653b advertisement) {
        kotlin.jvm.internal.l.f(advertisement, "advertisement");
        com.vungle.ads.internal.ui.a.Companion.setPresenterDelegate$vungle_ads_release(this);
        super.renderAd$vungle_ads_release(bVar, advertisement);
    }

    public final void setAlertBodyText$vungle_ads_release(String str) {
        this.alertBodyText = str;
    }

    public final void setAlertCloseButtonText$vungle_ads_release(String str) {
        this.alertCloseButtonText = str;
    }

    public final void setAlertContinueButtonText$vungle_ads_release(String str) {
        this.alertContinueButtonText = str;
    }

    public final void setAlertTitleText$vungle_ads_release(String str) {
        this.alertTitleText = str;
    }

    public final void setUserId$vungle_ads_release(String str) {
        this.userId = str;
    }
}
