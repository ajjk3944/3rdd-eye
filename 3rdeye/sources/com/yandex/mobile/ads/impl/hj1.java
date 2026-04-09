package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class hj1 implements yd0 {

    /* renamed from: a, reason: collision with root package name */
    private final w00<ExtendedNativeAdView> f28236a;

    /* renamed from: b, reason: collision with root package name */
    private final mp1 f28237b;

    /* renamed from: c, reason: collision with root package name */
    private final pq f28238c;

    public hj1(zp adTypeSpecificBinder, mp1 reporter, pq commonComponentsBinderProvider) {
        kotlin.jvm.internal.l.f(adTypeSpecificBinder, "adTypeSpecificBinder");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(commonComponentsBinderProvider, "commonComponentsBinderProvider");
        this.f28236a = adTypeSpecificBinder;
        this.f28237b = reporter;
        this.f28238c = commonComponentsBinderProvider;
    }

    @Override // com.yandex.mobile.ads.impl.yd0
    public final sq0<ExtendedNativeAdView> a(Context context, a8<?> adResponse, h61 nativeAdPrivate, tr contentCloseListener, lt nativeAdEventListener, C4070a1 eventController) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        kotlin.jvm.internal.l.f(nativeAdEventListener, "nativeAdEventListener");
        kotlin.jvm.internal.l.f(eventController, "eventController");
        kt adAssets = nativeAdPrivate.getAdAssets();
        pq pqVar = this.f28238c;
        w00<ExtendedNativeAdView> w00Var = this.f28236a;
        mp1 mp1Var = this.f28237b;
        pqVar.getClass();
        return new sq0<>(R.layout.monetization_ads_internal_native_interstitial_portrait, new uq(pq.a(nativeAdPrivate, contentCloseListener, nativeAdEventListener, w00Var, mp1Var), new yv0(adAssets, new r41(), new mu0(adAssets)), new wi2(), new mn(nativeAdPrivate, new a41()), new kn(context, new a41(), new jn(context))), new gf1(1));
    }
}
