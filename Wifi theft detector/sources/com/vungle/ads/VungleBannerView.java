package com.vungle.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.BannerAdImpl;
import com.vungle.ads.internal.e;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.presenter.WebViewManager;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.util.RingerModeReceiver;
import com.vungle.ads.internal.util.p;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s7.c;

/* loaded from: classes3.dex */
public final class VungleBannerView extends RelativeLayout {

    @NotNull
    public static final b Companion = new b(null);

    @NotNull
    private static final String TAG = "VungleBannerView";

    @Nullable
    private com.vungle.ads.f adListener;

    @NotNull
    private final a0 adSize;

    @NotNull
    private final BannerAdImpl adViewImpl;

    @Nullable
    private MRAIDAdWidget adWidget;
    private int calculatedPixelHeight;
    private int calculatedPixelWidth;

    @NotNull
    private final AtomicBoolean destroyed;

    @Nullable
    private com.vungle.ads.internal.ui.o imageView;

    @NotNull
    private final y8.h impressionTracker$delegate;

    @NotNull
    private final AtomicBoolean isAdAttachedToWindow;

    @NotNull
    private final AtomicBoolean isAdDownloaded;

    @NotNull
    private final AtomicBoolean isInvisibleLogged;
    private boolean isOnImpressionCalled;
    private boolean isReceiverRegistered;

    @NotNull
    private final String placementId;

    @Nullable
    private MRAIDPresenter presenter;

    @NotNull
    private final AtomicBoolean presenterStarted;

    @NotNull
    private final RingerModeReceiver ringerModeReceiver;

    public static final class a implements com.vungle.ads.f {
        public a() {
        }

        @Override // com.vungle.ads.f, com.vungle.ads.g
        public void onAdClicked(@NotNull BaseAd baseAd) {
            kotlin.jvm.internal.p.e(baseAd, "baseAd");
            com.vungle.ads.f adListener = VungleBannerView.this.getAdListener();
            if (adListener != null) {
                adListener.onAdClicked(baseAd);
            }
        }

        @Override // com.vungle.ads.f, com.vungle.ads.g
        public void onAdEnd(@NotNull BaseAd baseAd) {
            kotlin.jvm.internal.p.e(baseAd, "baseAd");
            com.vungle.ads.f adListener = VungleBannerView.this.getAdListener();
            if (adListener != null) {
                adListener.onAdEnd(baseAd);
            }
        }

        @Override // com.vungle.ads.f, com.vungle.ads.g
        public void onAdFailedToLoad(@NotNull BaseAd baseAd, @NotNull VungleError adError) {
            kotlin.jvm.internal.p.e(baseAd, "baseAd");
            kotlin.jvm.internal.p.e(adError, "adError");
            com.vungle.ads.f adListener = VungleBannerView.this.getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToLoad(baseAd, adError);
            }
        }

        @Override // com.vungle.ads.f, com.vungle.ads.g
        public void onAdFailedToPlay(@NotNull BaseAd baseAd, @NotNull VungleError adError) {
            kotlin.jvm.internal.p.e(baseAd, "baseAd");
            kotlin.jvm.internal.p.e(adError, "adError");
            com.vungle.ads.f adListener = VungleBannerView.this.getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(baseAd, adError);
            }
        }

        @Override // com.vungle.ads.f, com.vungle.ads.g
        public void onAdImpression(@NotNull BaseAd baseAd) {
            kotlin.jvm.internal.p.e(baseAd, "baseAd");
            com.vungle.ads.f adListener = VungleBannerView.this.getAdListener();
            if (adListener != null) {
                adListener.onAdImpression(baseAd);
            }
        }

        @Override // com.vungle.ads.f, com.vungle.ads.g
        public void onAdLeftApplication(@NotNull BaseAd baseAd) {
            kotlin.jvm.internal.p.e(baseAd, "baseAd");
            com.vungle.ads.f adListener = VungleBannerView.this.getAdListener();
            if (adListener != null) {
                adListener.onAdLeftApplication(baseAd);
            }
        }

        @Override // com.vungle.ads.f, com.vungle.ads.g
        public void onAdLoaded(@NotNull BaseAd baseAd) throws Throwable {
            kotlin.jvm.internal.p.e(baseAd, "baseAd");
            VungleBannerView.this.onBannerAdLoaded(baseAd);
        }

        @Override // com.vungle.ads.f, com.vungle.ads.g
        public void onAdStart(@NotNull BaseAd baseAd) {
            kotlin.jvm.internal.p.e(baseAd, "baseAd");
            com.vungle.ads.f adListener = VungleBannerView.this.getAdListener();
            if (adListener != null) {
                adListener.onAdStart(baseAd);
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
            this();
        }

        private b() {
        }
    }

    public static final class c implements e.b {
        public c() {
        }

        @Override // com.vungle.ads.internal.e.b
        public void onImpression(@Nullable View view) throws Throwable {
            com.vungle.ads.internal.util.p.Companion.d(VungleBannerView.TAG, "ImpressionTracker checked the banner view become visible.");
            VungleBannerView.this.isOnImpressionCalled = true;
            VungleBannerView.this.logViewVisibleOnPlay();
            VungleBannerView.this.checkHardwareAcceleration();
            MRAIDPresenter mRAIDPresenter = VungleBannerView.this.presenter;
            if (mRAIDPresenter != null) {
                mRAIDPresenter.start();
            }
        }

        @Override // com.vungle.ads.internal.e.b
        public void onViewInvisible(@Nullable View view) throws Throwable {
            VungleBannerView.this.logViewInvisibleOnPlay();
        }
    }

    public static final class d implements MRAIDAdWidget.a {
        public d() {
        }

        @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.a
        public void close() {
            VungleBannerView.this.finishAdInternal(false);
        }
    }

    public static final class e implements MRAIDAdWidget.d {
        public e() {
        }

        @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.d
        public boolean onTouch(@Nullable MotionEvent motionEvent) {
            MRAIDPresenter mRAIDPresenter = VungleBannerView.this.presenter;
            if (mRAIDPresenter == null) {
                return false;
            }
            mRAIDPresenter.onViewTouched(motionEvent);
            return false;
        }
    }

    public static final class f extends com.vungle.ads.internal.presenter.a {
        public f(com.vungle.ads.internal.presenter.c cVar, q7.h hVar) {
            super(cVar, hVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleBannerView(@NotNull final Context context, @NotNull String placementId, @NotNull a0 adSize) {
        super(context);
        kotlin.jvm.internal.p.e(context, "context");
        kotlin.jvm.internal.p.e(placementId, "placementId");
        kotlin.jvm.internal.p.e(adSize, "adSize");
        this.placementId = placementId;
        this.adSize = adSize;
        this.ringerModeReceiver = new RingerModeReceiver();
        BannerAdImpl bannerAdImpl = new BannerAdImpl(context, placementId, adSize, new AdConfig());
        this.adViewImpl = bannerAdImpl;
        this.destroyed = new AtomicBoolean(false);
        this.presenterStarted = new AtomicBoolean(false);
        this.isAdDownloaded = new AtomicBoolean(false);
        this.isAdAttachedToWindow = new AtomicBoolean(false);
        this.isInvisibleLogged = new AtomicBoolean(false);
        this.impressionTracker$delegate = kotlin.b.b(new l9.a() { // from class: com.vungle.ads.VungleBannerView$impressionTracker$2
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
        bannerAdImpl.setAdListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkHardwareAcceleration() throws Throwable {
        com.vungle.ads.internal.util.p.Companion.w(TAG, "hardwareAccelerated = " + isHardwareAccelerated());
        if (isHardwareAccelerated()) {
            return;
        }
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk$SDKMetric.SDKMetricType.HARDWARE_ACCELERATE_DISABLED, 0L, this.adViewImpl.getLogEntry$vungle_ads_release(), null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishAdInternal(boolean z10) {
        if (this.destroyed.get()) {
            return;
        }
        this.destroyed.set(true);
        int i10 = (z10 ? 4 : 0) | 2;
        MRAIDPresenter mRAIDPresenter = this.presenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.stop();
        }
        MRAIDPresenter mRAIDPresenter2 = this.presenter;
        if (mRAIDPresenter2 != null) {
            mRAIDPresenter2.detach(i10);
        }
        getImpressionTracker().destroy();
        try {
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this);
            }
            removeAllViews();
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.d(TAG, "Removing webView error: " + e10);
        }
    }

    private final com.vungle.ads.internal.e getImpressionTracker() {
        return (com.vungle.ads.internal.e) this.impressionTracker$delegate.getValue();
    }

    public static /* synthetic */ void load$default(VungleBannerView vungleBannerView, String str, int i10, Object obj) throws Throwable {
        if ((i10 & 1) != 0) {
            str = null;
        }
        vungleBannerView.load(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewInvisibleOnPlay() throws Throwable {
        if (this.isInvisibleLogged.getAndSet(true)) {
            return;
        }
        com.vungle.ads.internal.util.p.Companion.d(TAG, "ImpressionTracker checked the banner view invisible on play, log AD_VISIBILITY_INVISIBLE. " + hashCode());
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        y yVar = new y(Sdk$SDKMetric.SDKMetricType.AD_VISIBILITY);
        yVar.setValue(1L);
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, yVar, this.adViewImpl.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewVisibleOnPlay() throws Throwable {
        long j10 = this.isInvisibleLogged.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        y yVar = new y(Sdk$SDKMetric.SDKMetricType.AD_VISIBILITY);
        yVar.setValue(Long.valueOf(j10));
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, yVar, this.adViewImpl.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        com.vungle.ads.internal.util.p.Companion.d(TAG, "Log metric AD_VISIBILITY: " + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBannerAdLoaded(BaseAd baseAd) throws Throwable {
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, new y(Sdk$SDKMetric.SDKMetricType.PLAY_AD_API), this.adViewImpl.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        this.adViewImpl.getResponseToShowMetric$vungle_ads_release().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, this.adViewImpl.getResponseToShowMetric$vungle_ads_release(), this.adViewImpl.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markStart();
        this.adViewImpl.getShowToCloseMetric$vungle_ads_release().markStart();
        this.adViewImpl.getShowToFailMetric$vungle_ads_release().markStart();
        VungleError vungleErrorCanPlayAd = this.adViewImpl.getAdInternal$vungle_ads_release().canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            if (this.adViewImpl.getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                this.adViewImpl.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.ERROR);
            }
            com.vungle.ads.f fVar = this.adListener;
            if (fVar != null) {
                fVar.onAdFailedToPlay(baseAd, vungleErrorCanPlayAd);
                return;
            }
            return;
        }
        q7.a advertisement = this.adViewImpl.getAdInternal$vungle_ads_release().getAdvertisement();
        q7.h placement = this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement();
        if (advertisement == null || placement == null) {
            com.vungle.ads.f fVar2 = this.adListener;
            if (fVar2 != null) {
                fVar2.onAdFailedToPlay(baseAd, new AdNotLoadedCantPlay("Ad or Placement is null").setLogEntry$vungle_ads_release(this.adViewImpl.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                return;
            }
            return;
        }
        this.adViewImpl.getAdInternal$vungle_ads_release().cancelDownload$vungle_ads_release();
        this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release(), this.adViewImpl.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        this.adViewImpl.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markStart();
        try {
            willPresentAdView(advertisement, placement, getAdViewSize());
            this.isAdDownloaded.set(true);
            com.vungle.ads.f fVar3 = this.adListener;
            if (fVar3 != null) {
                fVar3.onAdLoaded(baseAd);
            }
            renderAd();
        } catch (InstantiationException unused) {
        }
    }

    private final void renderAd() {
        if (this.destroyed.get()) {
            com.vungle.ads.internal.util.p.Companion.w(TAG, "renderAd() - destroyed");
            return;
        }
        if (!this.isAdDownloaded.get()) {
            com.vungle.ads.internal.util.p.Companion.d(TAG, "renderAd() - not ready: not downloaded.");
            return;
        }
        if (!this.isAdAttachedToWindow.get()) {
            com.vungle.ads.internal.util.p.Companion.d(TAG, "renderAd() - not ready: not attached.");
            return;
        }
        if (!this.presenterStarted.getAndSet(true)) {
            MRAIDPresenter mRAIDPresenter = this.presenter;
            if (mRAIDPresenter != null) {
                mRAIDPresenter.prepare();
            }
            getImpressionTracker().addView(this, new c());
        }
        MRAIDAdWidget mRAIDAdWidget = this.adWidget;
        if (mRAIDAdWidget != null && !kotlin.jvm.internal.p.a(mRAIDAdWidget.getParent(), this)) {
            ViewParent parent = mRAIDAdWidget.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(mRAIDAdWidget);
            }
            addView(mRAIDAdWidget, this.calculatedPixelWidth, this.calculatedPixelHeight);
        }
        com.vungle.ads.internal.ui.o oVar = this.imageView;
        if (oVar != null && !kotlin.jvm.internal.p.a(oVar.getParent(), this)) {
            ViewParent parent2 = oVar.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(oVar);
            }
            addView(oVar, this.calculatedPixelWidth, this.calculatedPixelHeight);
            oVar.bringToFront();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.calculatedPixelHeight;
            layoutParams.width = this.calculatedPixelWidth;
            requestLayout();
        }
    }

    private final void setAdVisibility(boolean z10) {
        MRAIDPresenter mRAIDPresenter;
        if (!this.isOnImpressionCalled || this.destroyed.get() || (mRAIDPresenter = this.presenter) == null) {
            return;
        }
        mRAIDPresenter.setAdVisibility(z10);
    }

    private final void willPresentAdView(q7.a aVar, q7.h hVar, a0 a0Var) throws InstantiationException {
        com.vungle.ads.internal.util.x xVar = com.vungle.ads.internal.util.x.INSTANCE;
        Context context = getContext();
        kotlin.jvm.internal.p.d(context, "context");
        this.calculatedPixelHeight = xVar.dpToPixels(context, a0Var.getHeight());
        Context context2 = getContext();
        kotlin.jvm.internal.p.d(context2, "context");
        this.calculatedPixelWidth = xVar.dpToPixels(context2, a0Var.getWidth());
        f fVar = new f(this.adViewImpl.getAdPlayCallback$vungle_ads_release(), this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement());
        try {
            Context context3 = getContext();
            kotlin.jvm.internal.p.d(context3, "context");
            MRAIDAdWidget mRAIDAdWidget = new MRAIDAdWidget(context3, aVar.eventId());
            this.adWidget = mRAIDAdWidget;
            mRAIDAdWidget.setCloseDelegate(new d());
            mRAIDAdWidget.setOnViewTouchListener(new e());
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            final Context context4 = getContext();
            kotlin.jvm.internal.p.d(context4, "context");
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f21907a;
            y8.h hVarA = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
                @Override // l9.a
                @NotNull
                public final com.vungle.ads.internal.executor.a invoke() {
                    return ServiceLocator.Companion.getInstance(context4).getService(com.vungle.ads.internal.executor.a.class);
                }
            });
            final Context context5 = getContext();
            kotlin.jvm.internal.p.d(context5, "context");
            s7.c cVarMake = m274willPresentAdView$lambda6(kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, s7.c$b] */
                @Override // l9.a
                @NotNull
                public final c.b invoke() {
                    return ServiceLocator.Companion.getInstance(context5).getService(c.b.class);
                }
            })).make(aVar.omEnabled());
            final Context context6 = getContext();
            kotlin.jvm.internal.p.d(context6, "context");
            y8.h hVarA2 = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$$inlined$inject$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.d, java.lang.Object] */
                @Override // l9.a
                @NotNull
                public final com.vungle.ads.internal.platform.d invoke() {
                    return ServiceLocator.Companion.getInstance(context6).getService(com.vungle.ads.internal.platform.d.class);
                }
            });
            VungleWebClient orCreateWebViewClient = WebViewManager.INSTANCE.getOrCreateWebViewClient(aVar, hVar, m273willPresentAdView$lambda5(hVarA).getOffloadExecutor(), m275willPresentAdView$lambda7(hVarA2));
            this.ringerModeReceiver.setWebClient(orCreateWebViewClient);
            orCreateWebViewClient.setWebViewObserver(cVarMake);
            MRAIDPresenter mRAIDPresenter = new MRAIDPresenter(mRAIDAdWidget, aVar, hVar, orCreateWebViewClient, m273willPresentAdView$lambda5(hVarA).getJobExecutor(), cVarMake, m275willPresentAdView$lambda7(hVarA2));
            mRAIDPresenter.setEventListener(fVar);
            this.presenter = mRAIDPresenter;
            String watermark$vungle_ads_release = getAdConfig().getWatermark$vungle_ads_release();
            if (watermark$vungle_ads_release != null) {
                Context context7 = getContext();
                kotlin.jvm.internal.p.d(context7, "context");
                this.imageView = new com.vungle.ads.internal.ui.o(context7, watermark$vungle_ads_release);
            }
        } catch (InstantiationException e10) {
            fVar.onError(new AdCantPlayWithoutWebView(e10.getMessage()).setLogEntry$vungle_ads_release(this.adViewImpl.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), this.placementId);
            throw e10;
        }
    }

    /* renamed from: willPresentAdView$lambda-5, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m273willPresentAdView$lambda5(y8.h hVar) {
        return (com.vungle.ads.internal.executor.a) hVar.getValue();
    }

    /* renamed from: willPresentAdView$lambda-6, reason: not valid java name */
    private static final c.b m274willPresentAdView$lambda6(y8.h hVar) {
        return (c.b) hVar.getValue();
    }

    /* renamed from: willPresentAdView$lambda-7, reason: not valid java name */
    private static final com.vungle.ads.internal.platform.d m275willPresentAdView$lambda7(y8.h hVar) {
        return (com.vungle.ads.internal.platform.d) hVar.getValue();
    }

    public final void finishAd() {
        com.vungle.ads.internal.util.v.INSTANCE.runOnUiThread(new l9.a() { // from class: com.vungle.ads.VungleBannerView.finishAd.1
            {
                super(0);
            }

            @Override // l9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m276invoke();
                return y8.s.f25199a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m276invoke() {
                VungleBannerView.this.finishAdInternal(true);
            }
        });
    }

    @NotNull
    public final AdConfig getAdConfig() {
        return this.adViewImpl.getAdConfig();
    }

    @Nullable
    public final com.vungle.ads.f getAdListener() {
        return this.adListener;
    }

    @NotNull
    public final a0 getAdSize() {
        return this.adSize;
    }

    @NotNull
    public final a0 getAdViewSize() {
        return this.adViewImpl.getAdViewSize();
    }

    @Nullable
    public final String getCreativeId() {
        return this.adViewImpl.getCreativeId();
    }

    @Nullable
    public final String getEventId() {
        return this.adViewImpl.getEventId();
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    public final void load(@Nullable String str) throws Throwable {
        this.adViewImpl.load(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        p.a aVar = com.vungle.ads.internal.util.p.Companion;
        aVar.d(TAG, "onAttachedToWindow(): " + hashCode());
        this.isAdAttachedToWindow.set(true);
        if (this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement() != null) {
            try {
                if (!this.isReceiverRegistered) {
                    getContext().registerReceiver(this.ringerModeReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
                    this.isReceiverRegistered = true;
                    aVar.d(TAG, "registerReceiver(): " + this.ringerModeReceiver.hashCode());
                }
            } catch (Exception e10) {
                com.vungle.ads.internal.util.p.Companion.e(TAG, "registerReceiver error: " + e10.getLocalizedMessage());
            }
        }
        renderAd();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.vungle.ads.internal.util.p.Companion.d(TAG, "onDetachedFromWindow(): " + hashCode());
        this.isAdAttachedToWindow.set(false);
        if (this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement() != null) {
            try {
                if (this.isReceiverRegistered) {
                    getContext().unregisterReceiver(this.ringerModeReceiver);
                    this.isReceiverRegistered = false;
                }
            } catch (Exception e10) {
                com.vungle.ads.internal.util.p.Companion.e(TAG, "unregisterReceiver error: " + e10.getLocalizedMessage());
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        setAdVisibility(i10 == 0);
    }

    public final void setAdListener(@Nullable com.vungle.ads.f fVar) {
        this.adListener = fVar;
    }
}
