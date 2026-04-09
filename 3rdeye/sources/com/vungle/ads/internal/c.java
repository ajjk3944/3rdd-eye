package com.vungle.ads.internal;

import C.E;
import C.V;
import C.g0;
import android.content.Context;
import com.vungle.ads.AbstractC4059q;
import com.vungle.ads.C4045c;
import com.vungle.ads.C4055m;
import com.vungle.ads.i0;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.k0;
import com.vungle.ads.r;

/* compiled from: BannerAdImpl.kt */
/* loaded from: classes2.dex */
public final class c extends AbstractC4059q {
    private final com.vungle.ads.internal.presenter.c adPlayCallback;
    private final i0 adSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, String placementId, i0 adSize, C4045c adConfig) {
        super(context, placementId, adConfig);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(placementId, "placementId");
        kotlin.jvm.internal.l.f(adSize, "adSize");
        kotlin.jvm.internal.l.f(adConfig, "adConfig");
        this.adSize = adSize;
        com.vungle.ads.internal.a adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        kotlin.jvm.internal.l.d(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        this.adPlayCallback = ((d) adInternal$vungle_ads_release).wrapCallback$vungle_ads_release(new a(placementId));
    }

    public final com.vungle.ads.internal.presenter.c getAdPlayCallback$vungle_ads_release() {
        return this.adPlayCallback;
    }

    public final i0 getAdViewSize() {
        com.vungle.ads.internal.a adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        kotlin.jvm.internal.l.d(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        i0 updatedAdSize$vungle_ads_release = ((d) adInternal$vungle_ads_release).getUpdatedAdSize$vungle_ads_release();
        return updatedAdSize$vungle_ads_release == null ? this.adSize : updatedAdSize$vungle_ads_release;
    }

    @Override // com.vungle.ads.AbstractC4059q
    public d constructAdInternal$vungle_ads_release(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return new d(context, this.adSize);
    }

    /* compiled from: BannerAdImpl.kt */
    public static final class a implements com.vungle.ads.internal.presenter.b {
        final /* synthetic */ String $placementId;

        public a(String str) {
            this.$placementId = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdClick$lambda-3, reason: not valid java name */
        public static final void m34onAdClick$lambda3(c this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            r adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdClicked(this$0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdEnd$lambda-2, reason: not valid java name */
        public static final void m35onAdEnd$lambda2(c this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            r adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdEnd(this$0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdImpression$lambda-1, reason: not valid java name */
        public static final void m36onAdImpression$lambda1(c this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            r adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdImpression(this$0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdLeftApplication$lambda-4, reason: not valid java name */
        public static final void m37onAdLeftApplication$lambda4(c this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            r adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdLeftApplication(this$0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onAdStart$lambda-0, reason: not valid java name */
        public static final void m38onAdStart$lambda0(c this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            r adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdStart(this$0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onFailure$lambda-5, reason: not valid java name */
        public static final void m39onFailure$lambda5(c this$0, k0 error) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            kotlin.jvm.internal.l.f(error, "$error");
            r adListener = this$0.getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(this$0, error);
            }
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdClick(String str) throws Throwable {
            q.INSTANCE.runOnUiThread(new b(c.this, 0));
            c.this.getDisplayToClickMetric$vungle_ads_release().markEnd();
            C4055m.logMetric$vungle_ads_release$default(C4055m.INSTANCE, c.this.getDisplayToClickMetric$vungle_ads_release(), this.$placementId, c.this.getCreativeId(), c.this.getEventId(), (String) null, 16, (Object) null);
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdEnd(String str) {
            q.INSTANCE.runOnUiThread(new B.b(c.this, 28));
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdImpression(String str) throws Throwable {
            q.INSTANCE.runOnUiThread(new V(c.this, 20));
            c.this.getPresentToDisplayMetric$vungle_ads_release().markEnd();
            C4055m.logMetric$vungle_ads_release$default(C4055m.INSTANCE, c.this.getPresentToDisplayMetric$vungle_ads_release(), this.$placementId, c.this.getCreativeId(), c.this.getEventId(), (String) null, 16, (Object) null);
            c.this.getDisplayToClickMetric$vungle_ads_release().markStart();
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdLeftApplication(String str) {
            q.INSTANCE.runOnUiThread(new g0(c.this, 20));
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdStart(String str) throws Throwable {
            c.this.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
            c.this.getShowToPresentMetric$vungle_ads_release().markEnd();
            C4055m.logMetric$vungle_ads_release$default(C4055m.INSTANCE, c.this.getShowToPresentMetric$vungle_ads_release(), this.$placementId, c.this.getCreativeId(), c.this.getEventId(), (String) null, 16, (Object) null);
            c.this.getPresentToDisplayMetric$vungle_ads_release().markStart();
            q.INSTANCE.runOnUiThread(new b(c.this, 1));
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onFailure(k0 error) throws Throwable {
            kotlin.jvm.internal.l.f(error, "error");
            q.INSTANCE.runOnUiThread(new E(15, c.this, error));
            c.this.getShowToFailMetric$vungle_ads_release().markEnd();
            C4055m.logMetric$vungle_ads_release$default(C4055m.INSTANCE, c.this.getShowToFailMetric$vungle_ads_release(), this.$placementId, c.this.getCreativeId(), c.this.getEventId(), (String) null, 16, (Object) null);
        }

        @Override // com.vungle.ads.internal.presenter.b
        public void onAdRewarded(String str) {
        }
    }
}
