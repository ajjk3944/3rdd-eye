package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.n71;

/* loaded from: classes3.dex */
public final class mz1 {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f30626a;

    /* renamed from: b, reason: collision with root package name */
    private final t9 f30627b;

    /* renamed from: c, reason: collision with root package name */
    private final f41 f30628c;

    /* renamed from: d, reason: collision with root package name */
    private final da1 f30629d;

    public /* synthetic */ mz1(vu1 vu1Var) {
        qa qaVar = new qa();
        this(vu1Var, qaVar, new t9(), new f41(qaVar), new da1(qaVar));
    }

    public final el a(Context context, j41 nativeAdBlock, z71 nativeCompositeAd, j51 nativeAdFactoriesProvider, ac0 noticeForceTrackingController) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAdBlock, "nativeAdBlock");
        kotlin.jvm.internal.l.f(nativeCompositeAd, "nativeCompositeAd");
        kotlin.jvm.internal.l.f(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        kotlin.jvm.internal.l.f(noticeForceTrackingController, "noticeForceTrackingController");
        vb1 vb1VarA = this.f30627b.a(nativeAdBlock);
        n71 n71VarA = n71.a.a();
        q71 q71VarA = this.f30628c.a(context, nativeAdBlock.a().b(), vb1VarA.b(), n71VarA);
        return new el(nativeAdBlock, this.f30629d.a(context, nativeAdBlock.a().b(), nativeCompositeAd, q71VarA, ew1.a.a(), nativeAdBlock.b()), vb1VarA, new rz1(vb1VarA.b()), nativeAdFactoriesProvider, new s9(noticeForceTrackingController), new d71(context, q71VarA, n71VarA), this.f30626a, null, e9.f26736c);
    }

    public mz1(vu1 sdkEnvironmentModule, qa adaptiveValidationRulesProvider, t9 adUnitNativeVisualBlockCreator, f41 nativeAdAssetsValidatorFactory, da1 nativeValidatorFactory) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adaptiveValidationRulesProvider, "adaptiveValidationRulesProvider");
        kotlin.jvm.internal.l.f(adUnitNativeVisualBlockCreator, "adUnitNativeVisualBlockCreator");
        kotlin.jvm.internal.l.f(nativeAdAssetsValidatorFactory, "nativeAdAssetsValidatorFactory");
        kotlin.jvm.internal.l.f(nativeValidatorFactory, "nativeValidatorFactory");
        this.f30626a = sdkEnvironmentModule;
        this.f30627b = adUnitNativeVisualBlockCreator;
        this.f30628c = nativeAdAssetsValidatorFactory;
        this.f30629d = nativeValidatorFactory;
    }
}
