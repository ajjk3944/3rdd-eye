package com.vungle.ads;

import a6.C1653b;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b9.C1992A;
import b9.C2001h;
import b9.InterfaceC2000g;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.a;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import g6.C4394b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p9.InterfaceC5480a;

/* compiled from: NativeAd.kt */
/* loaded from: classes2.dex */
public final class L extends AbstractC4059q {
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    public static final a Companion = new a(null);
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;
    private C4394b adContentView;
    private ImageView adIconView;
    private int adOptionsPosition;
    private P adOptionsView;
    private final b adPlayCallback;
    private FrameLayout adRootView;
    private Collection<? extends View> clickableViews;
    private final InterfaceC2000g executors$delegate;
    private final InterfaceC2000g imageLoader$delegate;
    private final InterfaceC2000g impressionTracker$delegate;
    private Map<String, String> nativeAdAssetMap;
    private com.vungle.ads.internal.presenter.h presenter;

    /* compiled from: NativeAd.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: NativeAd.kt */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<Bitmap, C1992A> {
        final /* synthetic */ ImageView $imageView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ImageView imageView) {
            super(1);
            this.$imageView = imageView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda-0, reason: not valid java name */
        public static final void m24invoke$lambda0(ImageView imageView, Bitmap it) {
            kotlin.jvm.internal.l.f(it, "$it");
            imageView.setImageBitmap(it);
        }

        @Override // p9.l
        public /* bridge */ /* synthetic */ C1992A invoke(Bitmap bitmap) {
            invoke2(bitmap);
            return C1992A.f18074a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Bitmap it) {
            kotlin.jvm.internal.l.f(it, "it");
            ImageView imageView = this.$imageView;
            if (imageView != null) {
                com.vungle.ads.internal.util.q.INSTANCE.runOnUiThread(new B.c(27, imageView, it));
            }
        }
    }

    /* compiled from: NativeAd.kt */
    public static final class d extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.util.h> {
        public d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.util.h invoke() {
            com.vungle.ads.internal.util.h bVar = com.vungle.ads.internal.util.h.Companion.getInstance();
            bVar.init(L.this.getExecutors().getIoExecutor());
            return bVar;
        }
    }

    /* compiled from: NativeAd.kt */
    public static final class e extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.i> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
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

    /* compiled from: ServiceLocator.kt */
    public static final class g extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.executor.a> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.executor.a invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
        }
    }

    private L(Context context, String str, C4045c c4045c) {
        super(context, str, c4045c);
        this.imageLoader$delegate = C2001h.b(new d());
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.executors$delegate = C2001h.a(b9.i.SYNCHRONIZED, new g(context));
        this.impressionTracker$delegate = C2001h.b(new e(context));
        this.adOptionsPosition = 1;
        this.adOptionsView = new P(context);
        this.adPlayCallback = new b(str);
    }

    private final void displayImage(String str, ImageView imageView) {
        getImageLoader().displayImage(str, new c(imageView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vungle.ads.internal.executor.a getExecutors() {
        return (com.vungle.ads.internal.executor.a) this.executors$delegate.getValue();
    }

    private final com.vungle.ads.internal.util.h getImageLoader() {
        return (com.vungle.ads.internal.util.h) this.imageLoader$delegate.getValue();
    }

    private final com.vungle.ads.internal.i getImpressionTracker() {
        return (com.vungle.ads.internal.i) this.impressionTracker$delegate.getValue();
    }

    private final String getMainImagePath() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(N.TOKEN_MAIN_IMAGE)) == null) ? "" : str;
    }

    /* renamed from: registerViewForInteraction$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.platform.b m14registerViewForInteraction$lambda1(InterfaceC2000g<? extends com.vungle.ads.internal.platform.b> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerViewForInteraction$lambda-2, reason: not valid java name */
    public static final void m15registerViewForInteraction$lambda2(L this$0, View view) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        com.vungle.ads.internal.presenter.h hVar = this$0.presenter;
        if (hVar != null) {
            hVar.processCommand("openPrivacy", this$0.getPrivacyUrl$vungle_ads_release());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerViewForInteraction$lambda-4$lambda-3, reason: not valid java name */
    public static final void m16registerViewForInteraction$lambda4$lambda3(L this$0, View view) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        com.vungle.ads.internal.presenter.h hVar = this$0.presenter;
        if (hVar != null) {
            hVar.processCommand(com.vungle.ads.internal.presenter.h.DOWNLOAD, this$0.getCtaUrl$vungle_ads_release());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerViewForInteraction$lambda-5, reason: not valid java name */
    public static final void m17registerViewForInteraction$lambda5(L this$0, View view) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        com.vungle.ads.internal.presenter.h hVar = this$0.presenter;
        if (hVar != null) {
            com.vungle.ads.internal.presenter.h.processCommand$default(hVar, "videoViewed", null, 2, null);
        }
        com.vungle.ads.internal.presenter.h hVar2 = this$0.presenter;
        if (hVar2 != null) {
            hVar2.processCommand("tpat", com.vungle.ads.internal.g.CHECKPOINT_0);
        }
        com.vungle.ads.internal.presenter.h hVar3 = this$0.presenter;
        if (hVar3 != null) {
            hVar3.onImpression();
        }
    }

    public final String getAdBodyText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(N.TOKEN_APP_DESCRIPTION)) == null) ? "" : str;
    }

    public final String getAdCallToActionText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(N.TOKEN_CTA_BUTTON_TEXT)) == null) ? "" : str;
    }

    public final int getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    public final String getAdSponsoredText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(N.TOKEN_SPONSORED_BY)) == null) ? "" : str;
    }

    public final Double getAdStarRating() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(N.TOKEN_APP_RATING_VALUE)) == null) {
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

    public final String getAdTitle() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(N.TOKEN_APP_NAME)) == null) ? "" : str;
    }

    public final String getAppIcon() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(N.TOKEN_APP_ICON)) == null) ? "" : str;
    }

    public final String getCtaUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(N.TOKEN_CTA_BUTTON_URL)) == null) ? "" : str;
    }

    public final String getPrivacyIconUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(N.TOKEN_VUNGLE_PRIVACY_ICON_URL)) == null) ? "" : str;
    }

    public final String getPrivacyUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(N.TOKEN_VUNGLE_PRIVACY_URL)) == null) ? "" : str;
    }

    public final boolean hasCallToAction() {
        return getCtaUrl$vungle_ads_release().length() > 0;
    }

    @Override // com.vungle.ads.AbstractC4059q
    public void onAdLoaded$vungle_ads_release(C1653b advertisement) {
        kotlin.jvm.internal.l.f(advertisement, "advertisement");
        super.onAdLoaded$vungle_ads_release(advertisement);
        this.nativeAdAssetMap = advertisement.getMRAIDArgsInMap();
    }

    public final void performCTA() {
        com.vungle.ads.internal.presenter.h hVar = this.presenter;
        if (hVar != null) {
            hVar.processCommand(com.vungle.ads.internal.presenter.h.DOWNLOAD, getCtaUrl$vungle_ads_release());
        }
    }

    public final void registerViewForInteraction(FrameLayout rootView, C4394b mediaView, ImageView imageView, Collection<? extends View> collection) throws Throwable {
        String str;
        kotlin.jvm.internal.l.f(rootView, "rootView");
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        C4055m c4055m = C4055m.INSTANCE;
        C4055m.logMetric$vungle_ads_release$default(c4055m, new e0(Sdk$SDKMetric.b.PLAY_AD_API), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
        getResponseToShowMetric$vungle_ads_release().markEnd();
        C4055m.logMetric$vungle_ads_release$default(c4055m, getResponseToShowMetric$vungle_ads_release(), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
        getShowToPresentMetric$vungle_ads_release().markStart();
        getShowToFailMetric$vungle_ads_release().markStart();
        k0 k0VarCanPlayAd = getAdInternal$vungle_ads_release().canPlayAd(true);
        if (k0VarCanPlayAd != null) {
            if (getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(k0VarCanPlayAd.getCode())) {
                getAdInternal$vungle_ads_release().setAdState(a.EnumC0369a.ERROR);
                Map<String, String> map = this.nativeAdAssetMap;
                if (map != null) {
                    map.clear();
                }
            }
            r adListener = getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(this, k0VarCanPlayAd);
                return;
            }
            return;
        }
        this.adRootView = rootView;
        this.adContentView = mediaView;
        this.adIconView = imageView;
        this.clickableViews = collection;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        InterfaceC2000g interfaceC2000gA = C2001h.a(b9.i.SYNCHRONIZED, new f(getContext()));
        Context context = getContext();
        com.vungle.ads.internal.load.a adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        kotlin.jvm.internal.l.d(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.presenter.NativePresenterDelegate");
        this.presenter = new com.vungle.ads.internal.presenter.h(context, (com.vungle.ads.internal.presenter.i) adInternal$vungle_ads_release, getAdInternal$vungle_ads_release().getAdvertisement(), getExecutors().getJobExecutor(), m14registerViewForInteraction$lambda1(interfaceC2000gA));
        Map<String, String> map2 = this.nativeAdAssetMap;
        if (map2 == null || (str = map2.get(N.TOKEN_OM_SDK_DATA)) == null) {
            str = "";
        }
        com.vungle.ads.internal.presenter.h hVar = this.presenter;
        if (hVar != null) {
            hVar.initOMTracker(str);
        }
        com.vungle.ads.internal.presenter.h hVar2 = this.presenter;
        if (hVar2 != null) {
            hVar2.startTracking(rootView);
        }
        com.vungle.ads.internal.presenter.h hVar3 = this.presenter;
        if (hVar3 != null) {
            hVar3.setEventListener(new com.vungle.ads.internal.presenter.a(this.adPlayCallback, getAdInternal$vungle_ads_release().getPlacement()));
        }
        this.adOptionsView.setOnClickListener(new D8.e(this, 6));
        if (collection == null) {
            collection = E.u.G(mediaView);
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new B2.r(this, 4));
        }
        this.adOptionsView.renderTo(rootView, this.adOptionsPosition);
        getImpressionTracker().addView(rootView, new B.f(this, 12));
        displayImage(getMainImagePath(), mediaView.getMainImage$vungle_ads_release());
        displayImage(getAppIcon(), imageView);
        displayImage(getPrivacyIconUrl$vungle_ads_release(), this.adOptionsView.getPrivacyIcon$vungle_ads_release());
        String watermark$vungle_ads_release = getAdConfig().getWatermark$vungle_ads_release();
        if (watermark$vungle_ads_release != null) {
            Context context2 = rootView.getContext();
            kotlin.jvm.internal.l.e(context2, "rootView.context");
            com.vungle.ads.internal.ui.f fVar = new com.vungle.ads.internal.ui.f(context2, watermark$vungle_ads_release);
            rootView.addView(fVar);
            fVar.bringToFront();
        }
        com.vungle.ads.internal.presenter.h hVar4 = this.presenter;
        if (hVar4 != null) {
            hVar4.prepare();
        }
    }

    public final void setAdOptionsPosition(int i) {
        this.adOptionsPosition = i;
    }

    public final void unregisterView() {
        if (getAdInternal$vungle_ads_release().getAdState() == a.EnumC0369a.FINISHED) {
            return;
        }
        Collection<? extends View> collection = this.clickableViews;
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setOnClickListener(null);
            }
        }
        Map<String, String> map = this.nativeAdAssetMap;
        if (map != null) {
            map.clear();
        }
        getImpressionTracker().destroy();
        C4394b c4394b = this.adContentView;
        if (c4394b != null) {
            c4394b.destroy();
        }
        this.adOptionsView.destroy();
        com.vungle.ads.internal.presenter.h hVar = this.presenter;
        if (hVar != null) {
            hVar.detach();
        }
    }

    @Override // com.vungle.ads.AbstractC4059q
    public N constructAdInternal$vungle_ads_release(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return new N(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public L(Context context, String placementId) {
        this(context, placementId, new C4045c());
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(placementId, "placementId");
    }

    public static /* synthetic */ void getAdOptionsPosition$annotations() {
    }

    /* compiled from: NativeAd.kt */
    public static final class b implements com.vungle.ads.internal.presenter.b {
        final /* synthetic */ String $placementId;

        public b(String str) {
            this.$placementId = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdClick$lambda-3, reason: not valid java name */
        public static final void m18onAdClick$lambda3(L this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            r adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdClicked(this$0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdEnd$lambda-2, reason: not valid java name */
        public static final void m19onAdEnd$lambda2(L this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            r adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdEnd(this$0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdImpression$lambda-1, reason: not valid java name */
        public static final void m20onAdImpression$lambda1(L this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            r adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdImpression(this$0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdLeftApplication$lambda-4, reason: not valid java name */
        public static final void m21onAdLeftApplication$lambda4(L this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            r adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdLeftApplication(this$0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdStart$lambda-0, reason: not valid java name */
        public static final void m22onAdStart$lambda0(L this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            r adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdStart(this$0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onFailure$lambda-5, reason: not valid java name */
        public static final void m23onFailure$lambda5(L this$0, k0 error) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            kotlin.jvm.internal.l.f(error, "$error");
            r adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(this$0, error);
            }
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdClick(String str) throws Throwable {
            com.vungle.ads.internal.util.q.INSTANCE.runOnUiThread(new M(L.this, 1));
            L.this.getDisplayToClickMetric$vungle_ads_release().markEnd();
            C4055m.logMetric$vungle_ads_release$default(C4055m.INSTANCE, L.this.getDisplayToClickMetric$vungle_ads_release(), this.$placementId, L.this.getCreativeId(), L.this.getEventId(), (String) null, 16, (Object) null);
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdEnd(String str) {
            L.this.getAdInternal$vungle_ads_release().setAdState(a.EnumC0369a.FINISHED);
            com.vungle.ads.internal.util.q.INSTANCE.runOnUiThread(new C.V(L.this, 19));
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdImpression(String str) throws Throwable {
            com.vungle.ads.internal.util.q.INSTANCE.runOnUiThread(new M(L.this, 0));
            L.this.getPresentToDisplayMetric$vungle_ads_release().markEnd();
            C4055m.logMetric$vungle_ads_release$default(C4055m.INSTANCE, L.this.getPresentToDisplayMetric$vungle_ads_release(), this.$placementId, L.this.getCreativeId(), L.this.getEventId(), (String) null, 16, (Object) null);
            L.this.getDisplayToClickMetric$vungle_ads_release().markStart();
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdLeftApplication(String str) {
            com.vungle.ads.internal.util.q.INSTANCE.runOnUiThread(new C.g0(L.this, 19));
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdStart(String str) throws Throwable {
            L.this.getAdInternal$vungle_ads_release().setAdState(a.EnumC0369a.PLAYING);
            L.this.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
            L.this.getShowToPresentMetric$vungle_ads_release().markEnd();
            C4055m.logMetric$vungle_ads_release$default(C4055m.INSTANCE, L.this.getShowToPresentMetric$vungle_ads_release(), this.$placementId, L.this.getCreativeId(), L.this.getEventId(), (String) null, 16, (Object) null);
            L.this.getPresentToDisplayMetric$vungle_ads_release().markStart();
            com.vungle.ads.internal.util.q.INSTANCE.runOnUiThread(new C8.a(L.this, 14));
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onFailure(k0 error) throws Throwable {
            kotlin.jvm.internal.l.f(error, "error");
            L.this.getAdInternal$vungle_ads_release().setAdState(a.EnumC0369a.ERROR);
            com.vungle.ads.internal.util.q.INSTANCE.runOnUiThread(new C.E(14, L.this, error));
            L.this.getShowToFailMetric$vungle_ads_release().markEnd();
            C4055m.logMetric$vungle_ads_release$default(C4055m.INSTANCE, L.this.getShowToFailMetric$vungle_ads_release(), this.$placementId, L.this.getCreativeId(), L.this.getEventId(), (String) null, 16, (Object) null);
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdRewarded(String str) {
        }
    }
}
