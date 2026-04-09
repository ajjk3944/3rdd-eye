package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class pq0 implements yd0 {

    /* renamed from: a, reason: collision with root package name */
    private final w00<ExtendedNativeAdView> f31879a;

    /* renamed from: b, reason: collision with root package name */
    private final mp1 f31880b;

    /* renamed from: c, reason: collision with root package name */
    private final oq1 f31881c;

    /* renamed from: d, reason: collision with root package name */
    private final pq f31882d;

    public pq0(zp adTypeSpecificBinder, mp1 reporter, oq1 resourceUtils, pq commonComponentsBinderProvider) {
        kotlin.jvm.internal.l.f(adTypeSpecificBinder, "adTypeSpecificBinder");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(resourceUtils, "resourceUtils");
        kotlin.jvm.internal.l.f(commonComponentsBinderProvider, "commonComponentsBinderProvider");
        this.f31879a = adTypeSpecificBinder;
        this.f31880b = reporter;
        this.f31881c = resourceUtils;
        this.f31882d = commonComponentsBinderProvider;
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
        oq1 oq1Var = this.f31881c;
        int i = R.dimen.monetization_ads_internal_landscape_vertical_icon_size;
        oq1Var.getClass();
        wq wqVar = new wq(adAssets, com.google.gson.internal.c.y(context.getResources().getDimension(i)));
        pq pqVar = this.f31882d;
        w00<ExtendedNativeAdView> w00Var = this.f31879a;
        mp1 mp1Var = this.f31880b;
        pqVar.getClass();
        uq uqVar = new uq(wqVar, pq.a(nativeAdPrivate, contentCloseListener, nativeAdEventListener, w00Var, mp1Var), new lu0(adAssets, new r41(), new mu0(adAssets)), new hh1(adAssets, new x31(), new a41()), new wi2(), new mn(nativeAdPrivate, new a41()));
        kt adAssets2 = nativeAdPrivate.getAdAssets();
        oq1 oq1Var2 = this.f31881c;
        int i10 = R.dimen.monetization_ads_internal_landscape_vertical_media_content_min_width;
        oq1Var2.getClass();
        return new sq0<>(R.layout.monetization_ads_internal_native_interstitial_landscape_vetrical_media, uqVar, new vq(new gf1(2), new su0(adAssets2, com.google.gson.internal.c.y(context.getResources().getDimension(i10)), new mu0(adAssets2))));
    }
}
