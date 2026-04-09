package com.vungle.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.e;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class NativeAd extends BaseAd {
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final String TAG = "NativeAd";
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;

    @Nullable
    private com.vungle.ads.internal.ui.view.d adContentView;

    @Nullable
    private ImageView adIconView;
    private int adOptionsPosition;

    @Nullable
    private s adOptionsView;

    @NotNull
    private final NativeAd$adPlayCallback$1 adPlayCallback;

    @Nullable
    private FrameLayout adRootView;
    private float aspectRatio;

    @Nullable
    private Collection<? extends View> clickableViews;

    @NotNull
    private final y8.h executors$delegate;

    @NotNull
    private final y8.h imageLoader$delegate;

    @NotNull
    private final y8.h impressionTracker$delegate;

    @NotNull
    private final AtomicBoolean isInvisibleLogged;

    @Nullable
    private Map<String, String> nativeAdAssetMap;

    @Nullable
    private NativeAdPresenter presenter;

    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/vungle/ads/NativeAd$AdOptionsPosition;", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public @interface AdOptionsPosition {
    }

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements e.b {
        public b() {
        }

        @Override // com.vungle.ads.internal.e.b
        public void onImpression(@Nullable View view) throws Throwable {
            com.vungle.ads.internal.util.p.Companion.d(NativeAd.TAG, "ImpressionTracker checked the native ad view become visible.");
            NativeAdPresenter nativeAdPresenter = NativeAd.this.presenter;
            if (nativeAdPresenter != null) {
                NativeAdPresenter.processCommand$default(nativeAdPresenter, NativeAdPresenter.VIDEO_VIEWED, null, 2, null);
            }
            NativeAdPresenter nativeAdPresenter2 = NativeAd.this.presenter;
            if (nativeAdPresenter2 != null) {
                nativeAdPresenter2.processCommand("tpat", com.vungle.ads.internal.b.CHECKPOINT_0);
            }
            NativeAdPresenter nativeAdPresenter3 = NativeAd.this.presenter;
            if (nativeAdPresenter3 != null) {
                nativeAdPresenter3.onImpression();
            }
            NativeAd.this.logViewVisibleOnPlay();
        }

        @Override // com.vungle.ads.internal.e.b
        public void onViewInvisible(@Nullable View view) throws Throwable {
            if (NativeAd.this.isInvisibleLogged.getAndSet(true)) {
                return;
            }
            com.vungle.ads.internal.util.p.Companion.d(NativeAd.TAG, "ImpressionTracker checked the native ad view invisible on play, log AD_VISIBILITY_INVISIBLE.");
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            y yVar = new y(Sdk$SDKMetric.SDKMetricType.AD_VISIBILITY);
            yVar.setValue(1L);
            AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, yVar, NativeAd.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.vungle.ads.NativeAd$adPlayCallback$1] */
    private NativeAd(final Context context, String str, AdConfig adConfig) {
        super(context, str, adConfig);
        this.imageLoader$delegate = kotlin.b.b(new l9.a() { // from class: com.vungle.ads.NativeAd$imageLoader$2
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final com.vungle.ads.internal.util.l invoke() {
                com.vungle.ads.internal.util.l aVar = com.vungle.ads.internal.util.l.Companion.getInstance();
                aVar.init(this.this$0.getExecutors().getIoExecutor());
                return aVar;
            }
        });
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.executors$delegate = kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.NativeAd$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
            @Override // l9.a
            @NotNull
            public final com.vungle.ads.internal.executor.a invoke() {
                return ServiceLocator.Companion.getInstance(context).getService(com.vungle.ads.internal.executor.a.class);
            }
        });
        this.impressionTracker$delegate = kotlin.b.b(new l9.a() { // from class: com.vungle.ads.NativeAd$impressionTracker$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final com.vungle.ads.internal.e invoke() {
                return new com.vungle.ads.internal.e(context);
            }
        });
        this.isInvisibleLogged = new AtomicBoolean(false);
        this.adOptionsPosition = 1;
        this.adOptionsView = new s(context);
        this.adPlayCallback = new com.vungle.ads.internal.presenter.b() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1
            @Override // com.vungle.ads.internal.presenter.b
            public void onAdClick(@Nullable String str2) throws Throwable {
                com.vungle.ads.internal.util.v vVar = com.vungle.ads.internal.util.v.INSTANCE;
                final NativeAd nativeAd = this.this$0;
                vVar.runOnUiThread(new l9.a() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdClick$1
                    {
                        super(0);
                    }

                    @Override // l9.a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m266invoke();
                        return y8.s.f25199a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m266invoke() {
                        g adListener = nativeAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdClicked(nativeAd);
                        }
                    }
                });
                this.this$0.getDisplayToClickMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getDisplayToClickMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdEnd(@Nullable String str2) throws Throwable {
                this.this$0.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.FINISHED);
                com.vungle.ads.internal.util.v vVar = com.vungle.ads.internal.util.v.INSTANCE;
                final NativeAd nativeAd = this.this$0;
                vVar.runOnUiThread(new l9.a() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdEnd$1
                    {
                        super(0);
                    }

                    @Override // l9.a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m267invoke();
                        return y8.s.f25199a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m267invoke() {
                        g adListener = nativeAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdEnd(nativeAd);
                        }
                    }
                });
                this.this$0.getShowToCloseMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getShowToCloseMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdImpression(@Nullable String str2) throws Throwable {
                com.vungle.ads.internal.util.v vVar = com.vungle.ads.internal.util.v.INSTANCE;
                final NativeAd nativeAd = this.this$0;
                vVar.runOnUiThread(new l9.a() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdImpression$1
                    {
                        super(0);
                    }

                    @Override // l9.a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m268invoke();
                        return y8.s.f25199a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m268invoke() {
                        g adListener = nativeAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdImpression(nativeAd);
                        }
                    }
                });
                this.this$0.getPresentToDisplayMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getPresentToDisplayMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                this.this$0.getDisplayToClickMetric$vungle_ads_release().markStart();
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdLeftApplication(@Nullable String str2) throws Throwable {
                com.vungle.ads.internal.util.v vVar = com.vungle.ads.internal.util.v.INSTANCE;
                final NativeAd nativeAd = this.this$0;
                vVar.runOnUiThread(new l9.a() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdLeftApplication$1
                    {
                        super(0);
                    }

                    @Override // l9.a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m269invoke();
                        return y8.s.f25199a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m269invoke() {
                        g adListener = nativeAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdLeftApplication(nativeAd);
                        }
                    }
                });
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getLeaveApplicationMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdRewarded(@Nullable String str2) {
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdStart(@Nullable String str2) throws Throwable {
                this.this$0.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.PLAYING);
                this.this$0.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
                this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                this.this$0.getPresentToDisplayMetric$vungle_ads_release().markStart();
                com.vungle.ads.internal.util.v vVar = com.vungle.ads.internal.util.v.INSTANCE;
                final NativeAd nativeAd = this.this$0;
                vVar.runOnUiThread(new l9.a() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdStart$1
                    {
                        super(0);
                    }

                    @Override // l9.a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m270invoke();
                        return y8.s.f25199a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m270invoke() {
                        g adListener = nativeAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdStart(nativeAd);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onFailure(@NotNull final VungleError error) throws Throwable {
                kotlin.jvm.internal.p.e(error, "error");
                this.this$0.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.ERROR);
                com.vungle.ads.internal.util.v vVar = com.vungle.ads.internal.util.v.INSTANCE;
                final NativeAd nativeAd = this.this$0;
                vVar.runOnUiThread(new l9.a() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onFailure$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // l9.a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m271invoke();
                        return y8.s.f25199a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m271invoke() {
                        g adListener = nativeAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdFailedToPlay(nativeAd, error);
                        }
                    }
                });
                this.this$0.getShowToFailMetric$vungle_ads_release().markEnd();
                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this.this$0.getShowToFailMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), error.getCode() + '-' + error.getErrorMessage());
            }
        };
    }

    private final void createMediaAspectRatio() {
        getImageLoader().getImageSize(getMainImagePath(), new l9.p() { // from class: com.vungle.ads.NativeAd.createMediaAspectRatio.1
            {
                super(2);
            }

            @Override // l9.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
                return y8.s.f25199a;
            }

            public final void invoke(int i10, int i11) {
                NativeAd.this.aspectRatio = i10 / i11;
            }
        });
    }

    private final void displayImage(String str, final ImageView imageView) {
        getImageLoader().displayImage(str, new l9.l() { // from class: com.vungle.ads.NativeAd.displayImage.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Bitmap) obj);
                return y8.s.f25199a;
            }

            public final void invoke(@NotNull final Bitmap it) {
                kotlin.jvm.internal.p.e(it, "it");
                final ImageView imageView2 = imageView;
                if (imageView2 != null) {
                    com.vungle.ads.internal.util.v.INSTANCE.runOnUiThread(new l9.a() { // from class: com.vungle.ads.NativeAd.displayImage.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // l9.a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m272invoke();
                            return y8.s.f25199a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m272invoke() {
                            imageView2.setImageBitmap(it);
                        }
                    });
                }
            }
        });
    }

    @AdOptionsPosition
    public static /* synthetic */ void getAdOptionsPosition$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vungle.ads.internal.executor.a getExecutors() {
        return (com.vungle.ads.internal.executor.a) this.executors$delegate.getValue();
    }

    private final com.vungle.ads.internal.util.l getImageLoader() {
        return (com.vungle.ads.internal.util.l) this.imageLoader$delegate.getValue();
    }

    private final com.vungle.ads.internal.e getImpressionTracker() {
        return (com.vungle.ads.internal.e) this.impressionTracker$delegate.getValue();
    }

    private final String getMainImagePath() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(com.vungle.ads.internal.g.TOKEN_MAIN_IMAGE)) == null) ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewVisibleOnPlay() throws Throwable {
        long j10 = this.isInvisibleLogged.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        y yVar = new y(Sdk$SDKMetric.SDKMetricType.AD_VISIBILITY);
        yVar.setValue(Long.valueOf(j10));
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, yVar, getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        com.vungle.ads.internal.util.p.Companion.d(TAG, "Log metric AD_VISIBILITY: " + j10);
    }

    /* renamed from: registerViewForInteraction$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.platform.d m263registerViewForInteraction$lambda1(y8.h hVar) {
        return (com.vungle.ads.internal.platform.d) hVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerViewForInteraction$lambda-2, reason: not valid java name */
    public static final void m264registerViewForInteraction$lambda2(NativeAd this$0, View view) throws Throwable {
        kotlin.jvm.internal.p.e(this$0, "this$0");
        NativeAdPresenter nativeAdPresenter = this$0.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.processCommand("openPrivacy", this$0.getPrivacyUrl$vungle_ads_release());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerViewForInteraction$lambda-4$lambda-3, reason: not valid java name */
    public static final void m265registerViewForInteraction$lambda4$lambda3(NativeAd this$0, View view) throws Throwable {
        kotlin.jvm.internal.p.e(this$0, "this$0");
        NativeAdPresenter nativeAdPresenter = this$0.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.processCommand(NativeAdPresenter.DOWNLOAD, this$0.getCtaUrl$vungle_ads_release());
        }
    }

    @NotNull
    public final String getAdBodyText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(com.vungle.ads.internal.g.TOKEN_APP_DESCRIPTION)) == null) ? "" : str;
    }

    @NotNull
    public final String getAdCallToActionText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(com.vungle.ads.internal.g.TOKEN_CTA_BUTTON_TEXT)) == null) ? "" : str;
    }

    public final int getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    @NotNull
    public final String getAdSponsoredText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(com.vungle.ads.internal.g.TOKEN_SPONSORED_BY)) == null) ? "" : str;
    }

    @Nullable
    public final Double getAdStarRating() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(com.vungle.ads.internal.g.TOKEN_APP_RATING_VALUE)) == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Double.valueOf(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    public final String getAdTitle() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(com.vungle.ads.internal.g.TOKEN_APP_NAME)) == null) ? "" : str;
    }

    @NotNull
    public final String getAppIcon() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(com.vungle.ads.internal.g.TOKEN_APP_ICON)) == null) ? "" : str;
    }

    @NotNull
    public final String getCtaUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(com.vungle.ads.internal.g.TOKEN_CTA_BUTTON_URL)) == null) ? "" : str;
    }

    public final float getMediaAspectRatio() {
        return this.aspectRatio;
    }

    @NotNull
    public final String getPrivacyIconUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get("VUNGLE_PRIVACY_ICON_URL")) == null) ? "" : str;
    }

    @NotNull
    public final String getPrivacyUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(com.vungle.ads.internal.g.TOKEN_VUNGLE_PRIVACY_URL)) == null) ? "" : str;
    }

    public final boolean hasCallToAction() {
        return getCtaUrl$vungle_ads_release().length() > 0;
    }

    @Override // com.vungle.ads.BaseAd
    public void onAdLoaded$vungle_ads_release(@NotNull q7.a advertisement) {
        kotlin.jvm.internal.p.e(advertisement, "advertisement");
        super.onAdLoaded$vungle_ads_release(advertisement);
        this.nativeAdAssetMap = advertisement.getMRAIDArgsInMap();
        createMediaAspectRatio();
    }

    public final void performCTA() throws Throwable {
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.processCommand(NativeAdPresenter.DOWNLOAD, getCtaUrl$vungle_ads_release());
        }
    }

    public final void registerViewForInteraction(@NotNull FrameLayout rootView, @NotNull com.vungle.ads.internal.ui.view.d mediaView, @Nullable ImageView imageView, @Nullable Collection<? extends View> collection) throws Throwable {
        String str;
        kotlin.jvm.internal.p.e(rootView, "rootView");
        kotlin.jvm.internal.p.e(mediaView, "mediaView");
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, new y(Sdk$SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getResponseToShowMetric$vungle_ads_release().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, getResponseToShowMetric$vungle_ads_release(), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markStart();
        getShowToFailMetric$vungle_ads_release().markStart();
        getShowToCloseMetric$vungle_ads_release().markStart();
        VungleError vungleErrorCanPlayAd = getAdInternal$vungle_ads_release().canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            if (getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.ERROR);
                Map<String, String> map = this.nativeAdAssetMap;
                if (map != null) {
                    map.clear();
                }
            }
            g adListener = getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(this, vungleErrorCanPlayAd);
                return;
            }
            return;
        }
        this.adRootView = rootView;
        this.adContentView = mediaView;
        this.adIconView = imageView;
        this.clickableViews = collection;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        final Context context = getContext();
        y8.h hVarA = kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.NativeAd$registerViewForInteraction$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.d, java.lang.Object] */
            @Override // l9.a
            @NotNull
            public final com.vungle.ads.internal.platform.d invoke() {
                return ServiceLocator.Companion.getInstance(context).getService(com.vungle.ads.internal.platform.d.class);
            }
        });
        Context context2 = getContext();
        com.vungle.ads.internal.load.a adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        kotlin.jvm.internal.p.c(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.presenter.NativePresenterDelegate");
        this.presenter = new NativeAdPresenter(context2, (com.vungle.ads.internal.presenter.i) adInternal$vungle_ads_release, getAdInternal$vungle_ads_release().getAdvertisement(), m263registerViewForInteraction$lambda1(hVarA));
        Map<String, String> map2 = this.nativeAdAssetMap;
        if (map2 == null || (str = map2.get(com.vungle.ads.internal.g.TOKEN_OM_SDK_DATA)) == null) {
            str = "";
        }
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.initOMTracker(str);
        }
        NativeAdPresenter nativeAdPresenter2 = this.presenter;
        if (nativeAdPresenter2 != null) {
            nativeAdPresenter2.startTracking(rootView);
        }
        NativeAdPresenter nativeAdPresenter3 = this.presenter;
        if (nativeAdPresenter3 != null) {
            nativeAdPresenter3.setEventListener(new com.vungle.ads.internal.presenter.a(this.adPlayCallback, getAdInternal$vungle_ads_release().getPlacement()));
        }
        s sVar = this.adOptionsView;
        if (sVar != null) {
            sVar.setOnClickListener(new View.OnClickListener() { // from class: com.vungle.ads.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    NativeAd.m264registerViewForInteraction$lambda2(this.f20252a, view);
                }
            });
        }
        if (collection == null) {
            collection = z8.q.e(mediaView);
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener() { // from class: com.vungle.ads.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    NativeAd.m265registerViewForInteraction$lambda4$lambda3(this.f20253a, view);
                }
            });
        }
        s sVar2 = this.adOptionsView;
        if (sVar2 != null) {
            sVar2.renderTo(rootView, this.adOptionsPosition);
        }
        getImpressionTracker().addView(rootView, new b());
        displayImage(getMainImagePath(), mediaView.getMainImage$vungle_ads_release());
        displayImage(getAppIcon(), imageView);
        String privacyIconUrl$vungle_ads_release = getPrivacyIconUrl$vungle_ads_release();
        s sVar3 = this.adOptionsView;
        displayImage(privacyIconUrl$vungle_ads_release, sVar3 != null ? sVar3.getPrivacyIcon$vungle_ads_release() : null);
        String watermark$vungle_ads_release = getAdConfig().getWatermark$vungle_ads_release();
        if (watermark$vungle_ads_release != null) {
            Context context3 = rootView.getContext();
            kotlin.jvm.internal.p.d(context3, "rootView.context");
            com.vungle.ads.internal.ui.o oVar = new com.vungle.ads.internal.ui.o(context3, watermark$vungle_ads_release);
            rootView.addView(oVar);
            oVar.bringToFront();
        }
        getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release(), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markStart();
        NativeAdPresenter nativeAdPresenter4 = this.presenter;
        if (nativeAdPresenter4 != null) {
            nativeAdPresenter4.prepare();
        }
    }

    public final void setAdOptionsPosition(int i10) {
        this.adOptionsPosition = i10;
    }

    public final void unregisterView() {
        if (getAdInternal$vungle_ads_release().getAdState() == AdInternal.AdState.FINISHED) {
            return;
        }
        Collection<? extends View> collection = this.clickableViews;
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setOnClickListener(null);
            }
        }
        this.clickableViews = null;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map != null) {
            map.clear();
        }
        getImpressionTracker().destroy();
        com.vungle.ads.internal.ui.view.d dVar = this.adContentView;
        if (dVar != null) {
            dVar.destroy();
        }
        this.adContentView = null;
        s sVar = this.adOptionsView;
        if (sVar != null) {
            sVar.destroy();
        }
        this.adOptionsView = null;
        try {
            ImageView imageView = this.adIconView;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.w(TAG, "error msg: " + e10.getLocalizedMessage());
        }
        ImageView imageView2 = this.adIconView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        this.adIconView = null;
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.detach();
        }
    }

    @Override // com.vungle.ads.BaseAd
    @NotNull
    public com.vungle.ads.internal.g constructAdInternal$vungle_ads_release(@NotNull Context context) {
        kotlin.jvm.internal.p.e(context, "context");
        return new com.vungle.ads.internal.g(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAd(@NotNull Context context, @NotNull String placementId) {
        this(context, placementId, new AdConfig());
        kotlin.jvm.internal.p.e(context, "context");
        kotlin.jvm.internal.p.e(placementId, "placementId");
    }
}
