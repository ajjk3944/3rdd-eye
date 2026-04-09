package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* loaded from: classes3.dex */
public final class d51 implements w00<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    private final h61 f25962a;

    /* renamed from: b, reason: collision with root package name */
    private final tr f25963b;

    /* renamed from: c, reason: collision with root package name */
    private final lt f25964c;

    /* renamed from: d, reason: collision with root package name */
    private final oo f25965d;

    /* renamed from: e, reason: collision with root package name */
    private final mp1 f25966e;

    /* renamed from: f, reason: collision with root package name */
    private final z31 f25967f;

    /* renamed from: g, reason: collision with root package name */
    private final xg f25968g;

    public d51(h61 nativeAd, tr contentCloseListener, lt nativeAdEventListener, oo clickConnector, mp1 reporter, z31 nativeAdAssetViewProvider, i61 divKitDesignAssetNamesProvider, xg assetsNativeAdViewProviderCreator) {
        kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        kotlin.jvm.internal.l.f(nativeAdEventListener, "nativeAdEventListener");
        kotlin.jvm.internal.l.f(clickConnector, "clickConnector");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        kotlin.jvm.internal.l.f(divKitDesignAssetNamesProvider, "divKitDesignAssetNamesProvider");
        kotlin.jvm.internal.l.f(assetsNativeAdViewProviderCreator, "assetsNativeAdViewProviderCreator");
        this.f25962a = nativeAd;
        this.f25963b = contentCloseListener;
        this.f25964c = nativeAdEventListener;
        this.f25965d = clickConnector;
        this.f25966e = reporter;
        this.f25967f = nativeAdAssetViewProvider;
        this.f25968g = assetsNativeAdViewProviderCreator;
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView nativeAdView = (ExtendedNativeAdView) viewGroup;
        kotlin.jvm.internal.l.f(nativeAdView, "nativeAdView");
        try {
            this.f25962a.b(this.f25968g.a(nativeAdView, this.f25967f), this.f25965d);
            this.f25962a.a(this.f25964c);
        } catch (v51 e4) {
            this.f25963b.f();
            this.f25966e.reportError("Failed to bind DivKit Native Ad", e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
        this.f25962a.a((lt) null);
    }
}
