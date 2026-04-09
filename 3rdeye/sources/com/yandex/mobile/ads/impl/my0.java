package com.yandex.mobile.ads.impl;

import android.view.View;
import com.monetization.ads.mediation.nativeads.MediatedNativeAd;

/* loaded from: classes3.dex */
public final class my0 implements tb1 {

    /* renamed from: a, reason: collision with root package name */
    private final tb1 f30577a;

    /* renamed from: b, reason: collision with root package name */
    private final MediatedNativeAd f30578b;

    /* renamed from: c, reason: collision with root package name */
    private final ly0 f30579c;

    /* renamed from: d, reason: collision with root package name */
    private final x6 f30580d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30581e;

    public my0(tb1 nativeAdViewRenderer, MediatedNativeAd mediatedNativeAd, ly0 mediatedNativeRenderingTracker, x6 adQualityVerifierController) {
        kotlin.jvm.internal.l.f(nativeAdViewRenderer, "nativeAdViewRenderer");
        kotlin.jvm.internal.l.f(mediatedNativeAd, "mediatedNativeAd");
        kotlin.jvm.internal.l.f(mediatedNativeRenderingTracker, "mediatedNativeRenderingTracker");
        kotlin.jvm.internal.l.f(adQualityVerifierController, "adQualityVerifierController");
        this.f30577a = nativeAdViewRenderer;
        this.f30578b = mediatedNativeAd;
        this.f30579c = mediatedNativeRenderingTracker;
        this.f30580d = adQualityVerifierController;
    }

    @Override // com.yandex.mobile.ads.impl.tb1
    public final void a(x61 nativeAdViewAdapter) {
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        this.f30577a.a(nativeAdViewAdapter);
        h71 h71VarG = nativeAdViewAdapter.g();
        View viewE = nativeAdViewAdapter.e();
        if (viewE != null) {
            this.f30578b.unbindNativeAd(new iy0(viewE, h71VarG));
        }
        if (this.f30581e) {
            this.f30580d.d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.tb1
    public final void a(x61 nativeAdViewAdapter, vo clickListenerConfigurator) {
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        kotlin.jvm.internal.l.f(clickListenerConfigurator, "clickListenerConfigurator");
        this.f30577a.a(nativeAdViewAdapter, clickListenerConfigurator);
        h71 h71VarG = nativeAdViewAdapter.g();
        View viewE = nativeAdViewAdapter.e();
        if (viewE != null) {
            this.f30578b.bindNativeAd(new iy0(viewE, h71VarG));
        }
        this.f30580d.c();
        if (nativeAdViewAdapter.e() == null || this.f30581e) {
            return;
        }
        this.f30581e = true;
        this.f30579c.a();
    }

    @Override // com.yandex.mobile.ads.impl.tb1
    public final void a() {
        this.f30577a.a();
    }
}
