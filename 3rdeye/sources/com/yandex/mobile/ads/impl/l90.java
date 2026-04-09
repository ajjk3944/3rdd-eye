package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class l90 {

    /* renamed from: a, reason: collision with root package name */
    private final pk1 f29925a;

    /* renamed from: b, reason: collision with root package name */
    private final C4072a3 f29926b;

    /* renamed from: c, reason: collision with root package name */
    private final h20 f29927c;

    /* renamed from: d, reason: collision with root package name */
    private final vq0<ExtendedNativeAdView> f29928d;

    public l90(pk1 divKitDesign, C4072a3 adConfiguration, h20 divKitAdBinderFactory, vq0<ExtendedNativeAdView> layoutDesignFactory) {
        kotlin.jvm.internal.l.f(divKitDesign, "divKitDesign");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(divKitAdBinderFactory, "divKitAdBinderFactory");
        kotlin.jvm.internal.l.f(layoutDesignFactory, "layoutDesignFactory");
        this.f29925a = divKitDesign;
        this.f29926b = adConfiguration;
        this.f29927c = divKitAdBinderFactory;
        this.f29928d = layoutDesignFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a() {
    }

    public final sq0 a(Context context, a8 adResponse, pz1 nativeAdPrivate, lt nativeAdEventListener, de2 videoEventController) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        kotlin.jvm.internal.l.f(nativeAdEventListener, "nativeAdEventListener");
        kotlin.jvm.internal.l.f(videoEventController, "videoEventController");
        oo ooVarA = this.f29925a.a();
        q20 q20VarB = this.f29925a.b();
        E e4 = new E(1);
        zi ziVar = new zi();
        g01 g01VarC = this.f29926b.q().c();
        this.f29927c.getClass();
        uq uqVar = new uq(new ba0(this.f29925a, new f20(context, this.f29926b, adResponse, e4, ziVar, q20VarB), g01VarC), h20.a(nativeAdPrivate, e4, nativeAdEventListener, ooVarA, g01VarC), new s71(nativeAdPrivate.b(), videoEventController));
        z20 z20Var = new z20(adResponse);
        vq0<ExtendedNativeAdView> vq0Var = this.f29928d;
        int i = R.layout.monetization_ads_internal_divkit;
        vq0Var.getClass();
        return new sq0(i, uqVar, z20Var);
    }
}
