package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleError;
import com.vungle.ads.a0;
import com.vungle.ads.internal.util.v;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

/* loaded from: classes3.dex */
public final class BannerAdImpl extends BaseAd {

    @NotNull
    private final com.vungle.ads.internal.presenter.c adPlayCallback;

    @NotNull
    private final a0 adSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdImpl(@NotNull Context context, @NotNull String placementId, @NotNull a0 adSize, @NotNull AdConfig adConfig) {
        super(context, placementId, adConfig);
        p.e(context, "context");
        p.e(placementId, "placementId");
        p.e(adSize, "adSize");
        p.e(adConfig, "adConfig");
        this.adSize = adSize;
        AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        p.c(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        this.adPlayCallback = ((a) adInternal$vungle_ads_release).wrapCallback$vungle_ads_release(new com.vungle.ads.internal.presenter.b() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1
            @Override // com.vungle.ads.internal.presenter.b
            public void onAdClick(@Nullable String str) throws Throwable {
                v vVar = v.INSTANCE;
                final BannerAdImpl bannerAdImpl = this.this$0;
                vVar.runOnUiThread(new l9.a() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1$onAdClick$1
                    {
                        super(0);
                    }

                    @Override // l9.a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m283invoke();
                        return s.f25199a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m283invoke() {
                        com.vungle.ads.g adListener = bannerAdImpl.getAdListener();
                        if (adListener != null) {
                            adListener.onAdClicked(bannerAdImpl);
                        }
                    }
                });
                this.this$0.getDisplayToClickMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getDisplayToClickMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdEnd(@Nullable String str) throws Throwable {
                v vVar = v.INSTANCE;
                final BannerAdImpl bannerAdImpl = this.this$0;
                vVar.runOnUiThread(new l9.a() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1$onAdEnd$1
                    {
                        super(0);
                    }

                    @Override // l9.a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m284invoke();
                        return s.f25199a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m284invoke() {
                        com.vungle.ads.g adListener = bannerAdImpl.getAdListener();
                        if (adListener != null) {
                            adListener.onAdEnd(bannerAdImpl);
                        }
                    }
                });
                this.this$0.getShowToCloseMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getShowToCloseMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdImpression(@Nullable String str) throws Throwable {
                v vVar = v.INSTANCE;
                final BannerAdImpl bannerAdImpl = this.this$0;
                vVar.runOnUiThread(new l9.a() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1$onAdImpression$1
                    {
                        super(0);
                    }

                    @Override // l9.a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m285invoke();
                        return s.f25199a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m285invoke() {
                        com.vungle.ads.g adListener = bannerAdImpl.getAdListener();
                        if (adListener != null) {
                            adListener.onAdImpression(bannerAdImpl);
                        }
                    }
                });
                this.this$0.getPresentToDisplayMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getPresentToDisplayMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                this.this$0.getDisplayToClickMetric$vungle_ads_release().markStart();
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdLeftApplication(@Nullable String str) throws Throwable {
                v vVar = v.INSTANCE;
                final BannerAdImpl bannerAdImpl = this.this$0;
                vVar.runOnUiThread(new l9.a() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1$onAdLeftApplication$1
                    {
                        super(0);
                    }

                    @Override // l9.a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m286invoke();
                        return s.f25199a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m286invoke() {
                        com.vungle.ads.g adListener = bannerAdImpl.getAdListener();
                        if (adListener != null) {
                            adListener.onAdLeftApplication(bannerAdImpl);
                        }
                    }
                });
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getLeaveApplicationMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdRewarded(@Nullable String str) {
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdStart(@Nullable String str) throws Throwable {
                this.this$0.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
                this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                this.this$0.getPresentToDisplayMetric$vungle_ads_release().markStart();
                v vVar = v.INSTANCE;
                final BannerAdImpl bannerAdImpl = this.this$0;
                vVar.runOnUiThread(new l9.a() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1$onAdStart$1
                    {
                        super(0);
                    }

                    @Override // l9.a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m287invoke();
                        return s.f25199a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m287invoke() {
                        com.vungle.ads.g adListener = bannerAdImpl.getAdListener();
                        if (adListener != null) {
                            adListener.onAdStart(bannerAdImpl);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onFailure(@NotNull final VungleError error) throws Throwable {
                p.e(error, "error");
                v vVar = v.INSTANCE;
                final BannerAdImpl bannerAdImpl = this.this$0;
                vVar.runOnUiThread(new l9.a() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1$onFailure$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m288invoke();
                        return s.f25199a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m288invoke() {
                        com.vungle.ads.g adListener = bannerAdImpl.getAdListener();
                        if (adListener != null) {
                            adListener.onAdFailedToPlay(bannerAdImpl, error);
                        }
                    }
                });
                this.this$0.getShowToFailMetric$vungle_ads_release().markEnd();
                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this.this$0.getShowToFailMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), error.getCode() + '-' + error.getErrorMessage());
            }
        });
    }

    @NotNull
    public final com.vungle.ads.internal.presenter.c getAdPlayCallback$vungle_ads_release() {
        return this.adPlayCallback;
    }

    @NotNull
    public final a0 getAdViewSize() {
        AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        p.c(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        a0 updatedAdSize$vungle_ads_release = ((a) adInternal$vungle_ads_release).getUpdatedAdSize$vungle_ads_release();
        return updatedAdSize$vungle_ads_release == null ? this.adSize : updatedAdSize$vungle_ads_release;
    }

    @Override // com.vungle.ads.BaseAd
    @NotNull
    public a constructAdInternal$vungle_ads_release(@NotNull Context context) {
        p.e(context, "context");
        return new a(context, this.adSize);
    }
}
