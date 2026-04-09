package com.vungle.ads;

import a6.C1653b;
import a6.C1661j;
import android.content.Context;
import android.content.IntentFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import b9.C2001h;
import b9.InterfaceC2000g;
import c6.C2070c;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.a;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.k;
import g6.C4393a;
import java.util.concurrent.atomic.AtomicBoolean;
import p9.InterfaceC5480a;

/* compiled from: VungleBannerView.kt */
/* loaded from: classes2.dex */
public final class j0 extends RelativeLayout {
    public static final b Companion = new b(null);
    private static final String TAG = "VungleBannerView";
    private InterfaceC4058p adListener;
    private final i0 adSize;
    private final com.vungle.ads.internal.c adViewImpl;
    private C4393a adWidget;
    private int calculatedPixelHeight;
    private int calculatedPixelWidth;
    private final AtomicBoolean destroyed;
    private com.vungle.ads.internal.ui.f imageView;
    private final InterfaceC2000g impressionTracker$delegate;
    private final AtomicBoolean isAdAttachedToWindow;
    private final AtomicBoolean isAdDownloaded;
    private boolean isOnImpressionCalled;
    private final String placementId;
    private com.vungle.ads.internal.presenter.g presenter;
    private final AtomicBoolean presenterStarted;
    private final com.vungle.ads.internal.util.n ringerModeReceiver;

    /* compiled from: VungleBannerView.kt */
    public static final class a implements InterfaceC4058p {
        public a() {
        }

        @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
        public void onAdClicked(AbstractC4059q baseAd) {
            kotlin.jvm.internal.l.f(baseAd, "baseAd");
            InterfaceC4058p adListener = j0.this.getAdListener();
            if (adListener != null) {
                adListener.onAdClicked(baseAd);
            }
        }

        @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
        public void onAdEnd(AbstractC4059q baseAd) {
            kotlin.jvm.internal.l.f(baseAd, "baseAd");
            InterfaceC4058p adListener = j0.this.getAdListener();
            if (adListener != null) {
                adListener.onAdEnd(baseAd);
            }
        }

        @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
        public void onAdFailedToLoad(AbstractC4059q baseAd, k0 adError) {
            kotlin.jvm.internal.l.f(baseAd, "baseAd");
            kotlin.jvm.internal.l.f(adError, "adError");
            InterfaceC4058p adListener = j0.this.getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToLoad(baseAd, adError);
            }
        }

        @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
        public void onAdFailedToPlay(AbstractC4059q baseAd, k0 adError) {
            kotlin.jvm.internal.l.f(baseAd, "baseAd");
            kotlin.jvm.internal.l.f(adError, "adError");
            InterfaceC4058p adListener = j0.this.getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(baseAd, adError);
            }
        }

        @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
        public void onAdImpression(AbstractC4059q baseAd) {
            kotlin.jvm.internal.l.f(baseAd, "baseAd");
            InterfaceC4058p adListener = j0.this.getAdListener();
            if (adListener != null) {
                adListener.onAdImpression(baseAd);
            }
        }

        @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
        public void onAdLeftApplication(AbstractC4059q baseAd) {
            kotlin.jvm.internal.l.f(baseAd, "baseAd");
            InterfaceC4058p adListener = j0.this.getAdListener();
            if (adListener != null) {
                adListener.onAdLeftApplication(baseAd);
            }
        }

        @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
        public void onAdLoaded(AbstractC4059q baseAd) throws Throwable {
            kotlin.jvm.internal.l.f(baseAd, "baseAd");
            j0.this.onBannerAdLoaded(baseAd);
        }

        @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
        public void onAdStart(AbstractC4059q baseAd) {
            kotlin.jvm.internal.l.f(baseAd, "baseAd");
            InterfaceC4058p adListener = j0.this.getAdListener();
            if (adListener != null) {
                adListener.onAdStart(baseAd);
            }
        }
    }

    /* compiled from: VungleBannerView.kt */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: VungleBannerView.kt */
    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.i> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.i invoke() {
            return new com.vungle.ads.internal.i(this.$context);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class d extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.executor.a> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.executor.a invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class e extends kotlin.jvm.internal.m implements InterfaceC5480a<C2070c.b> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [c6.c$b, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final C2070c.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(C2070c.b.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class f extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.platform.b> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.b, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.platform.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.platform.b.class);
        }
    }

    /* compiled from: VungleBannerView.kt */
    public static final class g implements C4393a.InterfaceC0460a {
        public g() {
        }

        @Override // g6.C4393a.InterfaceC0460a
        public void close() {
            j0.this.finishAdInternal(false);
        }
    }

    /* compiled from: VungleBannerView.kt */
    public static final class h extends com.vungle.ads.internal.presenter.a {
        public h(com.vungle.ads.internal.presenter.c cVar, C1661j c1661j) {
            super(cVar, c1661j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Context context, String placementId, i0 adSize) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(placementId, "placementId");
        kotlin.jvm.internal.l.f(adSize, "adSize");
        this.placementId = placementId;
        this.adSize = adSize;
        this.ringerModeReceiver = new com.vungle.ads.internal.util.n();
        com.vungle.ads.internal.c cVar = new com.vungle.ads.internal.c(context, placementId, adSize, new C4045c());
        this.adViewImpl = cVar;
        this.destroyed = new AtomicBoolean(false);
        this.presenterStarted = new AtomicBoolean(false);
        this.isAdDownloaded = new AtomicBoolean(false);
        this.isAdAttachedToWindow = new AtomicBoolean(false);
        this.impressionTracker$delegate = C2001h.b(new c(context));
        cVar.setAdListener(new a());
    }

    private final void checkHardwareAcceleration() {
        com.vungle.ads.internal.util.k.Companion.w(TAG, "hardwareAccelerated = " + isHardwareAccelerated());
        if (isHardwareAccelerated()) {
            return;
        }
        C4055m.INSTANCE.logMetric$vungle_ads_release(Sdk$SDKMetric.b.HARDWARE_ACCELERATE_DISABLED, (58 & 2) != 0 ? 0L : 0L, (58 & 4) != 0 ? null : this.placementId, (58 & 8) != 0 ? null : getCreativeId(), (58 & 16) != 0 ? null : getEventId(), (58 & 32) != 0 ? null : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishAdInternal(boolean z10) {
        if (this.destroyed.get()) {
            return;
        }
        this.destroyed.set(true);
        int i = (z10 ? 4 : 0) | 2;
        com.vungle.ads.internal.presenter.g gVar = this.presenter;
        if (gVar != null) {
            gVar.stop();
        }
        com.vungle.ads.internal.presenter.g gVar2 = this.presenter;
        if (gVar2 != null) {
            gVar2.detach(i);
        }
        getImpressionTracker().destroy();
        try {
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this);
            }
            removeAllViews();
        } catch (Exception e4) {
            com.vungle.ads.internal.util.k.Companion.d(TAG, "Removing webView error: " + e4);
        }
    }

    private final com.vungle.ads.internal.i getImpressionTracker() {
        return (com.vungle.ads.internal.i) this.impressionTracker$delegate.getValue();
    }

    public static /* synthetic */ void load$default(j0 j0Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        j0Var.load(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBannerAdLoaded(AbstractC4059q abstractC4059q) throws Throwable {
        C4055m c4055m = C4055m.INSTANCE;
        C4055m.logMetric$vungle_ads_release$default(c4055m, new e0(Sdk$SDKMetric.b.PLAY_AD_API), this.placementId, getCreativeId(), getEventId(), (String) null, 16, (Object) null);
        k0 k0VarCanPlayAd = this.adViewImpl.getAdInternal$vungle_ads_release().canPlayAd(true);
        if (k0VarCanPlayAd != null) {
            if (this.adViewImpl.getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(k0VarCanPlayAd.getCode())) {
                this.adViewImpl.getAdInternal$vungle_ads_release().setAdState(a.EnumC0369a.ERROR);
            }
            InterfaceC4058p interfaceC4058p = this.adListener;
            if (interfaceC4058p != null) {
                interfaceC4058p.onAdFailedToPlay(abstractC4059q, k0VarCanPlayAd);
                return;
            }
            return;
        }
        C1653b advertisement = this.adViewImpl.getAdInternal$vungle_ads_release().getAdvertisement();
        C1661j placement = this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement();
        if (advertisement == null || placement == null) {
            InterfaceC4058p interfaceC4058p2 = this.adListener;
            if (interfaceC4058p2 != null) {
                interfaceC4058p2.onAdFailedToPlay(abstractC4059q, new C(k0.AD_UNABLE_TO_PLAY, null, 2, 0 == true ? 1 : 0));
                return;
            }
            return;
        }
        this.adViewImpl.getAdInternal$vungle_ads_release().cancelDownload$vungle_ads_release();
        willPresentAdView(advertisement, placement, getAdViewSize());
        this.adViewImpl.getResponseToShowMetric$vungle_ads_release().markEnd();
        C4055m.logMetric$vungle_ads_release$default(c4055m, this.adViewImpl.getResponseToShowMetric$vungle_ads_release(), this.placementId, getCreativeId(), getEventId(), (String) null, 16, (Object) null);
        this.adViewImpl.getShowToPresentMetric$vungle_ads_release().markStart();
        this.adViewImpl.getShowToFailMetric$vungle_ads_release().markStart();
        this.isAdDownloaded.set(true);
        InterfaceC4058p interfaceC4058p3 = this.adListener;
        if (interfaceC4058p3 != null) {
            interfaceC4058p3.onAdLoaded(abstractC4059q);
        }
        renderAd();
    }

    private final void renderAd() {
        if (!this.isAdDownloaded.get() || !this.isAdAttachedToWindow.get() || this.destroyed.get()) {
            com.vungle.ads.internal.util.k.Companion.d(TAG, "renderAd() - not ready");
            return;
        }
        if (!this.presenterStarted.getAndSet(true)) {
            com.vungle.ads.internal.presenter.g gVar = this.presenter;
            if (gVar != null) {
                gVar.prepare();
            }
            getImpressionTracker().addView(this, new B.d(this, 18));
        }
        C4393a c4393a = this.adWidget;
        if (c4393a != null && !kotlin.jvm.internal.l.b(c4393a.getParent(), this)) {
            addView(this.adWidget, this.calculatedPixelWidth, this.calculatedPixelHeight);
            com.vungle.ads.internal.ui.f fVar = this.imageView;
            if (fVar != null) {
                addView(fVar, this.calculatedPixelWidth, this.calculatedPixelHeight);
                com.vungle.ads.internal.ui.f fVar2 = this.imageView;
                if (fVar2 != null) {
                    fVar2.bringToFront();
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.calculatedPixelHeight;
            layoutParams.width = this.calculatedPixelWidth;
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: renderAd$lambda-1, reason: not valid java name */
    public static final void m114renderAd$lambda1(j0 this$0, View view) throws Throwable {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        com.vungle.ads.internal.util.k.Companion.d(TAG, "ImpressionTracker checked the banner view become visible.");
        this$0.isOnImpressionCalled = true;
        this$0.checkHardwareAcceleration();
        com.vungle.ads.internal.presenter.g gVar = this$0.presenter;
        if (gVar != null) {
            gVar.start();
        }
    }

    private final void setAdVisibility(boolean z10) {
        com.vungle.ads.internal.presenter.g gVar;
        if (!this.isOnImpressionCalled || this.destroyed.get() || (gVar = this.presenter) == null) {
            return;
        }
        gVar.setAdVisibility(z10);
    }

    private final void willPresentAdView(C1653b c1653b, C1661j c1661j, i0 i0Var) throws InstantiationException {
        com.vungle.ads.internal.util.s sVar = com.vungle.ads.internal.util.s.INSTANCE;
        Context context = getContext();
        kotlin.jvm.internal.l.e(context, "context");
        this.calculatedPixelHeight = sVar.dpToPixels(context, i0Var.getHeight());
        Context context2 = getContext();
        kotlin.jvm.internal.l.e(context2, "context");
        this.calculatedPixelWidth = sVar.dpToPixels(context2, i0Var.getWidth());
        h hVar = new h(this.adViewImpl.getAdPlayCallback$vungle_ads_release(), this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement());
        try {
            Context context3 = getContext();
            kotlin.jvm.internal.l.e(context3, "context");
            C4393a c4393a = new C4393a(context3);
            this.adWidget = c4393a;
            c4393a.setCloseDelegate(new g());
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            Context context4 = getContext();
            kotlin.jvm.internal.l.e(context4, "context");
            b9.i iVar = b9.i.SYNCHRONIZED;
            InterfaceC2000g interfaceC2000gA = C2001h.a(iVar, new d(context4));
            Context context5 = getContext();
            kotlin.jvm.internal.l.e(context5, "context");
            C2070c c2070cMake = m116willPresentAdView$lambda4(C2001h.a(iVar, new e(context5))).make(com.vungle.ads.internal.f.INSTANCE.omEnabled() && c1653b.omEnabled());
            Context context6 = getContext();
            kotlin.jvm.internal.l.e(context6, "context");
            InterfaceC2000g interfaceC2000gA2 = C2001h.a(iVar, new f(context6));
            com.vungle.ads.internal.ui.e eVar = new com.vungle.ads.internal.ui.e(c1653b, c1661j, m115willPresentAdView$lambda3(interfaceC2000gA).getOffloadExecutor(), null, m117willPresentAdView$lambda5(interfaceC2000gA2), 8, null);
            this.ringerModeReceiver.setWebClient(eVar);
            eVar.setWebViewObserver(c2070cMake);
            com.vungle.ads.internal.presenter.g gVar = new com.vungle.ads.internal.presenter.g(c4393a, c1653b, c1661j, eVar, m115willPresentAdView$lambda3(interfaceC2000gA).getJobExecutor(), c2070cMake, this.adViewImpl.getAdInternal$vungle_ads_release().getBidPayload(), m117willPresentAdView$lambda5(interfaceC2000gA2));
            gVar.setEventListener(hVar);
            this.presenter = gVar;
            String watermark$vungle_ads_release = getAdConfig().getWatermark$vungle_ads_release();
            if (watermark$vungle_ads_release != null) {
                Context context7 = getContext();
                kotlin.jvm.internal.l.e(context7, "context");
                this.imageView = new com.vungle.ads.internal.ui.f(context7, watermark$vungle_ads_release);
            }
        } catch (InstantiationException e4) {
            C4044b c4044b = new C4044b();
            c4044b.setPlacementId$vungle_ads_release(c4044b.getPlacementId());
            c4044b.setEventId$vungle_ads_release(c4044b.getEventId());
            c4044b.setCreativeId$vungle_ads_release(c4044b.getCreativeId());
            hVar.onError(c4044b.logError$vungle_ads_release(), this.placementId);
            throw e4;
        }
    }

    /* renamed from: willPresentAdView$lambda-3, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m115willPresentAdView$lambda3(InterfaceC2000g<? extends com.vungle.ads.internal.executor.a> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: willPresentAdView$lambda-4, reason: not valid java name */
    private static final C2070c.b m116willPresentAdView$lambda4(InterfaceC2000g<C2070c.b> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: willPresentAdView$lambda-5, reason: not valid java name */
    private static final com.vungle.ads.internal.platform.b m117willPresentAdView$lambda5(InterfaceC2000g<? extends com.vungle.ads.internal.platform.b> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    public final void finishAd() {
        finishAdInternal(true);
    }

    public final C4045c getAdConfig() {
        return this.adViewImpl.getAdConfig();
    }

    public final InterfaceC4058p getAdListener() {
        return this.adListener;
    }

    public final i0 getAdSize() {
        return this.adSize;
    }

    public final i0 getAdViewSize() {
        return this.adViewImpl.getAdViewSize();
    }

    public final String getCreativeId() {
        return this.adViewImpl.getCreativeId();
    }

    public final String getEventId() {
        return this.adViewImpl.getEventId();
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final void load(String str) {
        this.adViewImpl.load(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.a aVar = com.vungle.ads.internal.util.k.Companion;
        aVar.d(TAG, "onAttachedToWindow(): " + hashCode());
        this.isAdAttachedToWindow.set(true);
        if (this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement() != null) {
            getContext().registerReceiver(this.ringerModeReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
            aVar.d(TAG, "registerReceiver(): " + this.ringerModeReceiver.hashCode());
        }
        renderAd();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.vungle.ads.internal.util.k.Companion.d(TAG, "onDetachedFromWindow(): " + hashCode());
        this.isAdAttachedToWindow.set(false);
        if (this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement() != null) {
            getContext().unregisterReceiver(this.ringerModeReceiver);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        setAdVisibility(i == 0);
    }

    public final void setAdListener(InterfaceC4058p interfaceC4058p) {
        this.adListener = interfaceC4058p;
    }
}
