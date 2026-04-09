package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.signals.SignalManager;
import kotlin.LazyThreadSafetyMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class BaseAd implements com.vungle.ads.a {

    @NotNull
    private final AdConfig adConfig;

    @NotNull
    private final y8.h adInternal$delegate;

    @Nullable
    private g adListener;

    @NotNull
    private final Context context;

    @Nullable
    private String creativeId;

    @NotNull
    private final z displayToClickMetric;

    @Nullable
    private String eventId;

    @NotNull
    private final y leaveApplicationMetric;

    @NotNull
    private final com.vungle.ads.internal.util.o logEntry;

    @NotNull
    private final String placementId;

    @NotNull
    private final z presentToDisplayMetric;

    @NotNull
    private final z responseToShowMetric;

    @NotNull
    private final y rewardedMetric;

    @NotNull
    private final z showToCloseMetric;

    @NotNull
    private final z showToFailMetric;

    @NotNull
    private final y8.h signalManager$delegate;

    @Nullable
    private com.vungle.ads.internal.signals.b signaledAd;

    public static final class a implements com.vungle.ads.internal.load.a {
        final /* synthetic */ String $adMarkup;

        public a(String str) {
            this.$adMarkup = str;
        }

        @Override // com.vungle.ads.internal.load.a
        public void onFailure(@NotNull VungleError error) {
            kotlin.jvm.internal.p.e(error, "error");
            BaseAd baseAd = BaseAd.this;
            baseAd.onLoadFailure$vungle_ads_release(baseAd, error);
        }

        @Override // com.vungle.ads.internal.load.a
        public void onSuccess(@NotNull q7.a advertisement) {
            kotlin.jvm.internal.p.e(advertisement, "advertisement");
            BaseAd.this.onAdLoaded$vungle_ads_release(advertisement);
            BaseAd baseAd = BaseAd.this;
            baseAd.onLoadSuccess$vungle_ads_release(baseAd, this.$adMarkup);
        }
    }

    public BaseAd(@NotNull final Context context, @NotNull String placementId, @NotNull AdConfig adConfig) {
        kotlin.jvm.internal.p.e(context, "context");
        kotlin.jvm.internal.p.e(placementId, "placementId");
        kotlin.jvm.internal.p.e(adConfig, "adConfig");
        this.context = context;
        this.placementId = placementId;
        this.adConfig = adConfig;
        this.adInternal$delegate = kotlin.b.b(new l9.a() { // from class: com.vungle.ads.BaseAd$adInternal$2
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final AdInternal invoke() {
                BaseAd baseAd = this.this$0;
                AdInternal adInternalConstructAdInternal$vungle_ads_release = baseAd.constructAdInternal$vungle_ads_release(baseAd.getContext());
                adInternalConstructAdInternal$vungle_ads_release.setLogEntry$vungle_ads_release(this.this$0.getLogEntry$vungle_ads_release());
                return adInternalConstructAdInternal$vungle_ads_release;
            }
        });
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.signalManager$delegate = kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.BaseAd$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
            @Override // l9.a
            @NotNull
            public final SignalManager invoke() {
                return ServiceLocator.Companion.getInstance(context).getService(SignalManager.class);
            }
        });
        com.vungle.ads.internal.util.o oVar = new com.vungle.ads.internal.util.o();
        oVar.setPlacementRefId$vungle_ads_release(placementId);
        this.logEntry = oVar;
        this.responseToShowMetric = new z(Sdk$SDKMetric.SDKMetricType.AD_RESPONSE_TO_SHOW_DURATION_MS);
        this.presentToDisplayMetric = new z(Sdk$SDKMetric.SDKMetricType.AD_PRESENT_TO_DISPLAY_DURATION_MS);
        this.showToFailMetric = new z(Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_FAIL_DURATION_MS);
        this.displayToClickMetric = new z(Sdk$SDKMetric.SDKMetricType.AD_DISPLAY_TO_CLICK_DURATION_MS);
        this.leaveApplicationMetric = new y(Sdk$SDKMetric.SDKMetricType.AD_LEAVE_APPLICATION);
        this.rewardedMetric = new y(Sdk$SDKMetric.SDKMetricType.AD_REWARD_USER);
        this.showToCloseMetric = new z(Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_CLOSE_DURATION_MS);
    }

    private final void onLoadEnd() {
        this.responseToShowMetric.markStart();
    }

    @Override // com.vungle.ads.a
    @NotNull
    public Boolean canPlayAd() {
        return Boolean.valueOf(AdInternal.canPlayAd$default(getAdInternal$vungle_ads_release(), false, 1, null) == null);
    }

    @NotNull
    public abstract AdInternal constructAdInternal$vungle_ads_release(@NotNull Context context);

    @NotNull
    public final AdConfig getAdConfig() {
        return this.adConfig;
    }

    @NotNull
    public final AdInternal getAdInternal$vungle_ads_release() {
        return (AdInternal) this.adInternal$delegate.getValue();
    }

    @Nullable
    public final g getAdListener() {
        return this.adListener;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final String getCreativeId() {
        return this.creativeId;
    }

    @NotNull
    public final z getDisplayToClickMetric$vungle_ads_release() {
        return this.displayToClickMetric;
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    public final y getLeaveApplicationMetric$vungle_ads_release() {
        return this.leaveApplicationMetric;
    }

    @NotNull
    public final com.vungle.ads.internal.util.o getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    @NotNull
    public final z getPresentToDisplayMetric$vungle_ads_release() {
        return this.presentToDisplayMetric;
    }

    @NotNull
    public final z getResponseToShowMetric$vungle_ads_release() {
        return this.responseToShowMetric;
    }

    @NotNull
    public final y getRewardedMetric$vungle_ads_release() {
        return this.rewardedMetric;
    }

    @NotNull
    public final z getShowToCloseMetric$vungle_ads_release() {
        return this.showToCloseMetric;
    }

    @NotNull
    public final z getShowToFailMetric$vungle_ads_release() {
        return this.showToFailMetric;
    }

    @NotNull
    public final SignalManager getSignalManager$vungle_ads_release() {
        return (SignalManager) this.signalManager$delegate.getValue();
    }

    @Nullable
    public final com.vungle.ads.internal.signals.b getSignaledAd$vungle_ads_release() {
        return this.signaledAd;
    }

    @Override // com.vungle.ads.a
    public void load(@Nullable String str) throws Throwable {
        getAdInternal$vungle_ads_release().loadAd(this.placementId, str, new a(str));
    }

    public void onAdLoaded$vungle_ads_release(@NotNull q7.a advertisement) {
        kotlin.jvm.internal.p.e(advertisement, "advertisement");
        advertisement.setAdConfig(this.adConfig);
        this.creativeId = advertisement.getCreativeId();
        String strEventId = advertisement.eventId();
        this.eventId = strEventId;
        com.vungle.ads.internal.signals.b bVar = this.signaledAd;
        if (bVar == null) {
            return;
        }
        bVar.setEventId(strEventId);
    }

    public void onLoadFailure$vungle_ads_release(@NotNull BaseAd baseAd, @NotNull final VungleError vungleError) {
        kotlin.jvm.internal.p.e(baseAd, "baseAd");
        kotlin.jvm.internal.p.e(vungleError, "vungleError");
        onLoadEnd();
        com.vungle.ads.internal.util.v.INSTANCE.runOnUiThread(new l9.a() { // from class: com.vungle.ads.BaseAd$onLoadFailure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m254invoke();
                return y8.s.f25199a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m254invoke() {
                g adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToLoad(this.this$0, vungleError);
                }
            }
        });
    }

    public void onLoadSuccess$vungle_ads_release(@NotNull BaseAd baseAd, @Nullable String str) {
        kotlin.jvm.internal.p.e(baseAd, "baseAd");
        onLoadEnd();
        com.vungle.ads.internal.util.v.INSTANCE.runOnUiThread(new l9.a() { // from class: com.vungle.ads.BaseAd$onLoadSuccess$1
            {
                super(0);
            }

            @Override // l9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m255invoke();
                return y8.s.f25199a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m255invoke() {
                g adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdLoaded(this.this$0);
                }
            }
        });
    }

    public final void setAdListener(@Nullable g gVar) {
        this.adListener = gVar;
    }

    public final void setSignaledAd$vungle_ads_release(@Nullable com.vungle.ads.internal.signals.b bVar) {
        this.signaledAd = bVar;
    }
}
