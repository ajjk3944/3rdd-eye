package com.vungle.ads;

import a6.C1653b;
import android.content.Context;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;

/* compiled from: BaseFullscreenAd.kt */
/* renamed from: com.vungle.ads.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4062u extends AbstractC4059q implements InterfaceC4066y {

    /* compiled from: BaseFullscreenAd.kt */
    /* renamed from: com.vungle.ads.u$a */
    public static final class a implements com.vungle.ads.internal.presenter.b {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdClick$lambda-3, reason: not valid java name */
        public static final void m124onAdClick$lambda3(AbstractC4062u this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            r adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdClicked(this$0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdEnd$lambda-2, reason: not valid java name */
        public static final void m125onAdEnd$lambda2(AbstractC4062u this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            r adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdEnd(this$0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdImpression$lambda-1, reason: not valid java name */
        public static final void m126onAdImpression$lambda1(AbstractC4062u this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            r adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdImpression(this$0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdLeftApplication$lambda-5, reason: not valid java name */
        public static final void m127onAdLeftApplication$lambda5(AbstractC4062u this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            r adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdLeftApplication(this$0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdRewarded$lambda-4, reason: not valid java name */
        public static final void m128onAdRewarded$lambda4(AbstractC4062u this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            r adListener = this$0.getAdListener();
            b0 b0Var = adListener instanceof b0 ? (b0) adListener : null;
            if (b0Var != null) {
                b0Var.onAdRewarded(this$0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdStart$lambda-0, reason: not valid java name */
        public static final void m129onAdStart$lambda0(AbstractC4062u this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            r adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdStart(this$0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onFailure$lambda-6, reason: not valid java name */
        public static final void m130onFailure$lambda6(AbstractC4062u this$0, k0 error) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            kotlin.jvm.internal.l.f(error, "$error");
            r adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(this$0, error);
            }
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdClick(String str) throws Throwable {
            com.vungle.ads.internal.util.q.INSTANCE.runOnUiThread(new C2.h(AbstractC4062u.this, 27));
            AbstractC4062u.this.getDisplayToClickMetric$vungle_ads_release().markEnd();
            C4055m.logMetric$vungle_ads_release$default(C4055m.INSTANCE, AbstractC4062u.this.getDisplayToClickMetric$vungle_ads_release(), AbstractC4062u.this.getPlacementId(), AbstractC4062u.this.getCreativeId(), AbstractC4062u.this.getEventId(), (String) null, 16, (Object) null);
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdEnd(String str) {
            com.vungle.ads.internal.util.q.INSTANCE.runOnUiThread(new C8.a(AbstractC4062u.this, 13));
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdImpression(String str) throws Throwable {
            com.vungle.ads.internal.util.q.INSTANCE.runOnUiThread(new RunnableC4061t(AbstractC4062u.this, 1));
            AbstractC4062u.this.getPresentToDisplayMetric$vungle_ads_release().markEnd();
            C4055m.logMetric$vungle_ads_release$default(C4055m.INSTANCE, AbstractC4062u.this.getPresentToDisplayMetric$vungle_ads_release(), AbstractC4062u.this.getPlacementId(), AbstractC4062u.this.getCreativeId(), AbstractC4062u.this.getEventId(), (String) null, 16, (Object) null);
            AbstractC4062u.this.getDisplayToClickMetric$vungle_ads_release().markStart();
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdLeftApplication(String str) {
            com.vungle.ads.internal.util.q.INSTANCE.runOnUiThread(new RunnableC4061t(AbstractC4062u.this, 0));
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdRewarded(String str) {
            com.vungle.ads.internal.util.q.INSTANCE.runOnUiThread(new RunnableC4060s(AbstractC4062u.this, 1));
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdStart(String str) throws Throwable {
            AbstractC4062u.this.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
            AbstractC4062u.this.getShowToPresentMetric$vungle_ads_release().markEnd();
            C4055m.logMetric$vungle_ads_release$default(C4055m.INSTANCE, AbstractC4062u.this.getShowToPresentMetric$vungle_ads_release(), AbstractC4062u.this.getPlacementId(), AbstractC4062u.this.getCreativeId(), AbstractC4062u.this.getEventId(), (String) null, 16, (Object) null);
            AbstractC4062u.this.getPresentToDisplayMetric$vungle_ads_release().markStart();
            com.vungle.ads.internal.util.q.INSTANCE.runOnUiThread(new RunnableC4060s(AbstractC4062u.this, 0));
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onFailure(k0 error) throws Throwable {
            kotlin.jvm.internal.l.f(error, "error");
            com.vungle.ads.internal.util.q.INSTANCE.runOnUiThread(new B.a(17, AbstractC4062u.this, error));
            AbstractC4062u.this.getShowToFailMetric$vungle_ads_release().markEnd();
            C4055m.logMetric$vungle_ads_release$default(C4055m.INSTANCE, AbstractC4062u.this.getShowToFailMetric$vungle_ads_release(), AbstractC4062u.this.getPlacementId(), AbstractC4062u.this.getCreativeId(), AbstractC4062u.this.getEventId(), (String) null, 16, (Object) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4062u(Context context, String placementId, C4045c adConfig) {
        super(context, placementId, adConfig);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(placementId, "placementId");
        kotlin.jvm.internal.l.f(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.AbstractC4059q, com.vungle.ads.InterfaceC4043a
    public void load(String str) {
        setSignaledAd$vungle_ads_release(getSignalManager$vungle_ads_release().getSignaledAd(getPlacementId()));
        super.load(str);
    }

    @Override // com.vungle.ads.AbstractC4059q
    public void onAdLoaded$vungle_ads_release(C1653b advertisement) {
        kotlin.jvm.internal.l.f(advertisement, "advertisement");
        super.onAdLoaded$vungle_ads_release(advertisement);
        com.vungle.ads.internal.signals.c signaledAd$vungle_ads_release = getSignaledAd$vungle_ads_release();
        if (signaledAd$vungle_ads_release == null) {
            return;
        }
        signaledAd$vungle_ads_release.setAdAvailabilityCallbackTime(System.currentTimeMillis());
    }

    @Override // com.vungle.ads.InterfaceC4066y
    public void play(Context context) throws Throwable {
        C4055m c4055m = C4055m.INSTANCE;
        C4055m.logMetric$vungle_ads_release$default(c4055m, new e0(Sdk$SDKMetric.b.PLAY_AD_API), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
        getResponseToShowMetric$vungle_ads_release().markEnd();
        C4055m.logMetric$vungle_ads_release$default(c4055m, getResponseToShowMetric$vungle_ads_release(), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
        getShowToPresentMetric$vungle_ads_release().markStart();
        getShowToFailMetric$vungle_ads_release().markStart();
        com.vungle.ads.internal.signals.c signaledAd$vungle_ads_release = getSignaledAd$vungle_ads_release();
        if (signaledAd$vungle_ads_release != null) {
            signaledAd$vungle_ads_release.setPlayAdTime(System.currentTimeMillis());
            signaledAd$vungle_ads_release.calculateTimeBetweenAdAvailabilityAndPlayAd();
            getSignalManager$vungle_ads_release().registerSignaledAd(context, signaledAd$vungle_ads_release);
        }
        getAdInternal$vungle_ads_release().play(context, new a());
    }
}
