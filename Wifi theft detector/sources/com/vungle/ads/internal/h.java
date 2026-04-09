package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.internal.presenter.l;
import com.vungle.ads.internal.ui.AdActivity;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class h extends c implements l {

    @Nullable
    private String alertBodyText;

    @Nullable
    private String alertCloseButtonText;

    @Nullable
    private String alertContinueButtonText;

    @Nullable
    private String alertTitleText;

    @Nullable
    private String userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context) {
        super(context);
        p.e(context, "context");
    }

    @Override // com.vungle.ads.internal.presenter.l
    @Nullable
    public String getAlertBodyText() {
        return this.alertBodyText;
    }

    @Nullable
    public final String getAlertBodyText$vungle_ads_release() {
        return this.alertBodyText;
    }

    @Override // com.vungle.ads.internal.presenter.l
    @Nullable
    public String getAlertCloseButtonText() {
        return this.alertCloseButtonText;
    }

    @Nullable
    public final String getAlertCloseButtonText$vungle_ads_release() {
        return this.alertCloseButtonText;
    }

    @Override // com.vungle.ads.internal.presenter.l
    @Nullable
    public String getAlertContinueButtonText() {
        return this.alertContinueButtonText;
    }

    @Nullable
    public final String getAlertContinueButtonText$vungle_ads_release() {
        return this.alertContinueButtonText;
    }

    @Override // com.vungle.ads.internal.presenter.l
    @Nullable
    public String getAlertTitleText() {
        return this.alertTitleText;
    }

    @Nullable
    public final String getAlertTitleText$vungle_ads_release() {
        return this.alertTitleText;
    }

    @Override // com.vungle.ads.internal.presenter.l
    @Nullable
    public String getUserId() {
        return this.userId;
    }

    @Nullable
    public final String getUserId$vungle_ads_release() {
        return this.userId;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(@NotNull q7.h placement) {
        p.e(placement, "placement");
        return placement.isRewardedVideo();
    }

    @Override // com.vungle.ads.internal.AdInternal
    public void renderAd$vungle_ads_release(@Nullable com.vungle.ads.internal.presenter.b bVar, @NotNull q7.a advertisement) throws Throwable {
        p.e(advertisement, "advertisement");
        AdActivity.INSTANCE.setPresenterDelegate$vungle_ads_release(this);
        super.renderAd$vungle_ads_release(bVar, advertisement);
    }

    public final void setAlertBodyText$vungle_ads_release(@Nullable String str) {
        this.alertBodyText = str;
    }

    public final void setAlertCloseButtonText$vungle_ads_release(@Nullable String str) {
        this.alertCloseButtonText = str;
    }

    public final void setAlertContinueButtonText$vungle_ads_release(@Nullable String str) {
        this.alertContinueButtonText = str;
    }

    public final void setAlertTitleText$vungle_ads_release(@Nullable String str) {
        this.alertTitleText = str;
    }

    public final void setUserId$vungle_ads_release(@Nullable String str) {
        this.userId = str;
    }
}
