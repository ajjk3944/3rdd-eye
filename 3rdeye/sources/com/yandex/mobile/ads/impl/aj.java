package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    private final N7.U3 f24689a;

    /* renamed from: b, reason: collision with root package name */
    private final C4072a3 f24690b;

    /* renamed from: c, reason: collision with root package name */
    private final h20 f24691c;

    /* renamed from: d, reason: collision with root package name */
    private final r10 f24692d;

    /* renamed from: e, reason: collision with root package name */
    private final vq0<ExtendedNativeAdView> f24693e;

    public aj(N7.U3 divData, C4072a3 adConfiguration, h20 divKitAdBinderFactory, r10 divConfigurationCreator, vq0<ExtendedNativeAdView> layoutDesignFactory) {
        kotlin.jvm.internal.l.f(divData, "divData");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(divKitAdBinderFactory, "divKitAdBinderFactory");
        kotlin.jvm.internal.l.f(divConfigurationCreator, "divConfigurationCreator");
        kotlin.jvm.internal.l.f(layoutDesignFactory, "layoutDesignFactory");
        this.f24689a = divData;
        this.f24690b = adConfiguration;
        this.f24691c = divKitAdBinderFactory;
        this.f24692d = divConfigurationCreator;
        this.f24693e = layoutDesignFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a() {
    }

    public final sq0 a(Context context, a8 adResponse, h61 nativeAdPrivate, r71 nativeAdEventListener, de2 videoEventController) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        kotlin.jvm.internal.l.f(nativeAdEventListener, "nativeAdEventListener");
        kotlin.jvm.internal.l.f(videoEventController, "videoEventController");
        oo ooVar = new oo();
        E e4 = new E(0);
        zi ziVar = new zi();
        g01 g01VarC = this.f24690b.q().c();
        this.f24691c.getClass();
        w00 w00VarA = h20.a(nativeAdPrivate, e4, nativeAdEventListener, ooVar, g01VarC);
        q20 q20Var = new q20(ooVar);
        uq uqVar = new uq(new p20(this.f24689a, new f20(context, this.f24690b, adResponse, e4, ziVar, q20Var), this.f24692d.a(context, this.f24689a, nativeAdPrivate, q20Var), g01VarC, new mb0()), w00VarA, new s71(nativeAdPrivate.b(), videoEventController));
        z20 z20Var = new z20(adResponse);
        vq0<ExtendedNativeAdView> vq0Var = this.f24693e;
        int i = R.layout.monetization_ads_internal_divkit;
        vq0Var.getClass();
        return new sq0(i, uqVar, z20Var);
    }
}
