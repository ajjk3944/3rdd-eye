package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.n71;

/* loaded from: classes3.dex */
public final class h41 {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f28092a;

    /* renamed from: b, reason: collision with root package name */
    private final f41 f28093b;

    /* renamed from: c, reason: collision with root package name */
    private final da1 f28094c;

    public /* synthetic */ h41(vu1 vu1Var) {
        qa qaVar = new qa();
        this(vu1Var, qaVar, new f41(qaVar), new da1(qaVar));
    }

    public final el a(Context context, j41 nativeAdBlock, vb1 nativeVisualBlock, tb1 viewRenderer, j51 nativeAdFactoriesProvider, ac0 noticeForceTrackingController, w31 nativeAd, e9 adStructureType) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAdBlock, "nativeAdBlock");
        kotlin.jvm.internal.l.f(nativeVisualBlock, "nativeVisualBlock");
        kotlin.jvm.internal.l.f(viewRenderer, "viewRenderer");
        kotlin.jvm.internal.l.f(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        kotlin.jvm.internal.l.f(noticeForceTrackingController, "noticeForceTrackingController");
        kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
        kotlin.jvm.internal.l.f(adStructureType, "adStructureType");
        n71 n71VarA = n71.a.a();
        q71 q71VarA = this.f28093b.a(context, nativeAdBlock.a().b(), nativeVisualBlock.b(), n71VarA);
        return new el(nativeAdBlock, this.f28094c.a(context, nativeAdBlock.a().b(), q71VarA, nativeAdBlock.b()), nativeVisualBlock, viewRenderer, nativeAdFactoriesProvider, new C4226w4(noticeForceTrackingController), new d71(context, q71VarA, n71VarA), this.f28092a, nativeAd, adStructureType);
    }

    public h41(vu1 sdkEnvironmentModule, qa adaptiveValidationRulesProvider, f41 nativeAdAssetsValidatorFactory, da1 nativeValidatorFactory) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adaptiveValidationRulesProvider, "adaptiveValidationRulesProvider");
        kotlin.jvm.internal.l.f(nativeAdAssetsValidatorFactory, "nativeAdAssetsValidatorFactory");
        kotlin.jvm.internal.l.f(nativeValidatorFactory, "nativeValidatorFactory");
        this.f28092a = sdkEnvironmentModule;
        this.f28093b = nativeAdAssetsValidatorFactory;
        this.f28094c = nativeValidatorFactory;
    }
}
