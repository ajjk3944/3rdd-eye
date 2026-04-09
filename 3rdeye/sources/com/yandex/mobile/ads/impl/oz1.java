package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class oz1 implements w00<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    private final pz1 f31534a;

    /* renamed from: b, reason: collision with root package name */
    private final tr f31535b;

    /* renamed from: c, reason: collision with root package name */
    private final lt f31536c;

    /* renamed from: d, reason: collision with root package name */
    private final oo f31537d;

    /* renamed from: e, reason: collision with root package name */
    private final mp1 f31538e;

    /* renamed from: f, reason: collision with root package name */
    private final z31 f31539f;

    /* renamed from: g, reason: collision with root package name */
    private final xg f31540g;

    public oz1(pz1 sliderAd, tr contentCloseListener, lt nativeAdEventListener, oo clickConnector, mp1 reporter, z31 nativeAdAssetViewProvider, i61 divKitDesignAssetNamesProvider, xg assetsNativeAdViewProviderCreator) {
        kotlin.jvm.internal.l.f(sliderAd, "sliderAd");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        kotlin.jvm.internal.l.f(nativeAdEventListener, "nativeAdEventListener");
        kotlin.jvm.internal.l.f(clickConnector, "clickConnector");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        kotlin.jvm.internal.l.f(divKitDesignAssetNamesProvider, "divKitDesignAssetNamesProvider");
        kotlin.jvm.internal.l.f(assetsNativeAdViewProviderCreator, "assetsNativeAdViewProviderCreator");
        this.f31534a = sliderAd;
        this.f31535b = contentCloseListener;
        this.f31536c = nativeAdEventListener;
        this.f31537d = clickConnector;
        this.f31538e = reporter;
        this.f31539f = nativeAdAssetViewProvider;
        this.f31540g = assetsNativeAdViewProviderCreator;
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView nativeAdView = (ExtendedNativeAdView) viewGroup;
        kotlin.jvm.internal.l.f(nativeAdView, "nativeAdView");
        try {
            this.f31534a.a(this.f31540g.a(nativeAdView, this.f31539f), this.f31537d);
            y22 y22Var = new y22(this.f31536c);
            Iterator it = this.f31534a.d().iterator();
            while (it.hasNext()) {
                ((h61) it.next()).a(y22Var);
            }
            this.f31534a.b(this.f31536c);
        } catch (v51 e4) {
            this.f31535b.f();
            this.f31538e.reportError("Failed to bind DivKit Slider Ad", e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
        this.f31534a.b((lt) null);
        Iterator it = this.f31534a.d().iterator();
        while (it.hasNext()) {
            ((h61) it.next()).a((lt) null);
        }
    }
}
