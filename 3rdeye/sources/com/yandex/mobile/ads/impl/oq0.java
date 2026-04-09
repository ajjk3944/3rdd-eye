package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class oq0 implements yd0 {

    /* renamed from: a, reason: collision with root package name */
    private final w00<ExtendedNativeAdView> f31482a;

    /* renamed from: b, reason: collision with root package name */
    private final mp1 f31483b;

    /* renamed from: c, reason: collision with root package name */
    private final oq1 f31484c;

    /* renamed from: d, reason: collision with root package name */
    private final pq f31485d;

    public oq0(zp adTypeSpecificBinder, mp1 reporter, oq1 resourceUtils, pq commonComponentsBinderProvider) {
        kotlin.jvm.internal.l.f(adTypeSpecificBinder, "adTypeSpecificBinder");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(resourceUtils, "resourceUtils");
        kotlin.jvm.internal.l.f(commonComponentsBinderProvider, "commonComponentsBinderProvider");
        this.f31482a = adTypeSpecificBinder;
        this.f31483b = reporter;
        this.f31484c = resourceUtils;
        this.f31485d = commonComponentsBinderProvider;
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
        oq1 oq1Var = this.f31484c;
        int i = R.dimen.monetization_ads_internal_landscape_horizontal_icon_size;
        oq1Var.getClass();
        wq wqVar = new wq(adAssets, com.google.gson.internal.c.y(context.getResources().getDimension(i)));
        pq pqVar = this.f31485d;
        w00<ExtendedNativeAdView> w00Var = this.f31482a;
        mp1 mp1Var = this.f31483b;
        pqVar.getClass();
        return new sq0<>(R.layout.monetization_ads_internal_native_interstitial_landscape_horizontal_media, new uq(wqVar, pq.a(nativeAdPrivate, contentCloseListener, nativeAdEventListener, w00Var, mp1Var), new lu0(adAssets, new r41(), new mu0(adAssets)), new hh1(adAssets, new x31(), new a41()), new wi2(), new mn(nativeAdPrivate, new a41())), new gf1(2));
    }
}
