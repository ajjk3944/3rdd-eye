package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* loaded from: classes3.dex */
public final class vd0 implements w00<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    private final h61 f34462a;

    /* renamed from: b, reason: collision with root package name */
    private final tr f34463b;

    /* renamed from: c, reason: collision with root package name */
    private final lt f34464c;

    /* renamed from: d, reason: collision with root package name */
    private final mp1 f34465d;

    /* renamed from: e, reason: collision with root package name */
    private final xg f34466e;

    /* renamed from: f, reason: collision with root package name */
    private final a41 f34467f;

    public vd0(h61 nativeAd, tr contentCloseListener, lt nativeAdEventListener, mp1 reporter, xg assetsNativeAdViewProviderCreator, a41 nativeAdAssetViewProviderById) {
        kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        kotlin.jvm.internal.l.f(nativeAdEventListener, "nativeAdEventListener");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(assetsNativeAdViewProviderCreator, "assetsNativeAdViewProviderCreator");
        kotlin.jvm.internal.l.f(nativeAdAssetViewProviderById, "nativeAdAssetViewProviderById");
        this.f34462a = nativeAd;
        this.f34463b = contentCloseListener;
        this.f34464c = nativeAdEventListener;
        this.f34465d = reporter;
        this.f34466e = assetsNativeAdViewProviderCreator;
        this.f34467f = nativeAdAssetViewProviderById;
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView nativeAdView = (ExtendedNativeAdView) viewGroup;
        kotlin.jvm.internal.l.f(nativeAdView, "nativeAdView");
        try {
            this.f34462a.b(this.f34466e.a(nativeAdView, this.f34467f));
            this.f34462a.a(this.f34464c);
        } catch (v51 e4) {
            this.f34463b.f();
            this.f34465d.reportError("Failed to bind DivKit Fullscreen Native Ad", e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
        this.f34462a.a((lt) null);
    }
}
