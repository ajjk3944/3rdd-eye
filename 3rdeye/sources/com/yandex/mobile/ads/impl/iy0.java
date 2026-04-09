package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes3.dex */
public final class iy0 implements MediatedNativeAdViewProvider {

    /* renamed from: a, reason: collision with root package name */
    private final View f28897a;

    /* renamed from: b, reason: collision with root package name */
    private final h71 f28898b;

    public iy0(View nativeAdView, h71 nativeAdWeakViewProvider) {
        kotlin.jvm.internal.l.f(nativeAdView, "nativeAdView");
        kotlin.jvm.internal.l.f(nativeAdWeakViewProvider, "nativeAdWeakViewProvider");
        this.f28897a = nativeAdView;
        this.f28898b = nativeAdWeakViewProvider;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getAgeView() {
        View viewA = this.f28898b.a("age");
        if (viewA instanceof TextView) {
            return (TextView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getBodyView() {
        View viewA = this.f28898b.a("body");
        if (viewA instanceof TextView) {
            return (TextView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getCallToActionView() {
        View viewA = this.f28898b.a("call_to_action");
        if (viewA instanceof TextView) {
            return (TextView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getDomainView() {
        View viewA = this.f28898b.a("domain");
        if (viewA instanceof TextView) {
            return (TextView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final ImageView getFeedbackView() {
        View viewA = this.f28898b.a("feedback");
        if (viewA instanceof ImageView) {
            return (ImageView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final ImageView getIconView() {
        View viewA = this.f28898b.a("icon");
        if (viewA instanceof ImageView) {
            return (ImageView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final FrameLayout getMediaView() {
        View viewA = this.f28898b.a("media");
        if (viewA instanceof CustomizableMediaView) {
            return (CustomizableMediaView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final View getNativeAdView() {
        return this.f28897a;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getPriceView() {
        View viewA = this.f28898b.a("price");
        if (viewA instanceof TextView) {
            return (TextView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final View getRatingView() {
        return this.f28898b.a("rating");
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getReviewCountView() {
        View viewA = this.f28898b.a("review_count");
        if (viewA instanceof TextView) {
            return (TextView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getSponsoredView() {
        View viewA = this.f28898b.a("sponsored");
        if (viewA instanceof TextView) {
            return (TextView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getTitleView() {
        View viewA = this.f28898b.a(AppIntroBaseFragmentKt.ARG_TITLE);
        if (viewA instanceof TextView) {
            return (TextView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getWarningView() {
        View viewA = this.f28898b.a("warning");
        if (viewA instanceof TextView) {
            return (TextView) viewA;
        }
        return null;
    }
}
