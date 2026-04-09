package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class i41 {

    /* renamed from: a, reason: collision with root package name */
    private final x52 f28469a;

    /* renamed from: b, reason: collision with root package name */
    private final o81 f28470b;

    /* renamed from: c, reason: collision with root package name */
    private final mz1 f28471c;

    public /* synthetic */ i41(vu1 vu1Var) {
        this(vu1Var, new x52(), new o81(vu1Var), new mz1(vu1Var));
    }

    public final a81 a(Context context, j41 nativeAdBlock, ej0 imageProvider, j51 nativeAdFactoriesProvider, v41 nativeAdControllers) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAdBlock, "nativeAdBlock");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        kotlin.jvm.internal.l.f(nativeAdControllers, "nativeAdControllers");
        ac0 ac0Var = new ac0();
        z71 z71Var = new z71(this.f28470b.a(context, nativeAdBlock, imageProvider, nativeAdFactoriesProvider, ac0Var, nativeAdControllers));
        return new a81(context, z71Var, imageProvider, this.f28471c.a(context, nativeAdBlock, z71Var, nativeAdFactoriesProvider, ac0Var), nativeAdControllers);
    }

    public i41(vu1 sdkEnvironmentModule, x52 trackingDataCreator, o81 nativeGenericAdsCreator, mz1 sliderAdBinderConfigurationCreator) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(trackingDataCreator, "trackingDataCreator");
        kotlin.jvm.internal.l.f(nativeGenericAdsCreator, "nativeGenericAdsCreator");
        kotlin.jvm.internal.l.f(sliderAdBinderConfigurationCreator, "sliderAdBinderConfigurationCreator");
        this.f28469a = trackingDataCreator;
        this.f28470b = nativeGenericAdsCreator;
        this.f28471c = sliderAdBinderConfigurationCreator;
    }

    public final vb1 a(j41 nativeAdBlock, w31 nativeAd) {
        kotlin.jvm.internal.l.f(nativeAdBlock, "nativeAdBlock");
        kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
        x52 x52Var = this.f28469a;
        List<tx1> listH = nativeAd.h();
        List<tx1> listI = nativeAdBlock.c().i();
        x52Var.getClass();
        ArrayList arrayListA = x52.a(listH, listI);
        x52 x52Var2 = this.f28469a;
        List<String> listF = nativeAd.f();
        List<String> listG = nativeAdBlock.c().g();
        x52Var2.getClass();
        return new vb1(nativeAd.b(), arrayListA, x52.a(listF, listG), nativeAd.a(), nativeAd.c());
    }
}
