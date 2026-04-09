package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class k51 {

    /* renamed from: a, reason: collision with root package name */
    private final n81 f29500a;

    /* renamed from: b, reason: collision with root package name */
    private final h41 f29501b;

    public /* synthetic */ k51(vu1 vu1Var) {
        this(vu1Var, new n81(), new h41(vu1Var));
    }

    public final h61 a(Context context, j41 nativeAdBlock, ej0 imageProvider, i41 nativeAdBinderFactory, j51 nativeAdFactoriesProvider, v41 nativeAdControllers, w31 w31Var) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAdBlock, "nativeAdBlock");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(nativeAdBinderFactory, "nativeAdBinderFactory");
        kotlin.jvm.internal.l.f(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        kotlin.jvm.internal.l.f(nativeAdControllers, "nativeAdControllers");
        if (w31Var == null) {
            return null;
        }
        m81 m81VarA = this.f29500a.a(w31Var.g());
        tb1 tb1VarA = nativeAdFactoriesProvider.d().a(w31Var);
        ac0 ac0Var = new ac0();
        return m81VarA.a(context, w31Var, new d61(context, w31Var, imageProvider, tb1VarA), imageProvider, this.f29501b.a(context, nativeAdBlock, nativeAdBinderFactory.a(nativeAdBlock, w31Var), tb1VarA, nativeAdFactoriesProvider, ac0Var, w31Var, e9.f26735b), nativeAdControllers);
    }

    public k51(vu1 sdkEnvironmentModule, n81 nativeGenericAdCreatorProvider, h41 nativeAdBinderConfigurationCreator) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(nativeGenericAdCreatorProvider, "nativeGenericAdCreatorProvider");
        kotlin.jvm.internal.l.f(nativeAdBinderConfigurationCreator, "nativeAdBinderConfigurationCreator");
        this.f29500a = nativeGenericAdCreatorProvider;
        this.f29501b = nativeAdBinderConfigurationCreator;
    }
}
