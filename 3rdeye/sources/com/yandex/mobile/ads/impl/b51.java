package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class b51 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f25085a;

    /* renamed from: b, reason: collision with root package name */
    private final v41 f25086b;

    /* renamed from: c, reason: collision with root package name */
    private final i41 f25087c;

    /* renamed from: d, reason: collision with root package name */
    private final l41 f25088d;

    public /* synthetic */ b51(C4072a3 c4072a3, vu1 vu1Var, v41 v41Var) {
        this(c4072a3, vu1Var, v41Var, new i41(vu1Var), new l41(vu1Var));
    }

    public final void a(Context context, j41 nativeAdBlock, ej0 imageProvider, j51 nativeAdFactoriesProvider, x41 nativeAdCreationListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAdBlock, "nativeAdBlock");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        kotlin.jvm.internal.l.f(nativeAdCreationListener, "nativeAdCreationListener");
        k41 k41VarA = this.f25088d.a(this.f25085a.p());
        if (k41VarA != null) {
            k41VarA.a(context, nativeAdBlock, imageProvider, this.f25087c, nativeAdFactoriesProvider, this.f25086b, nativeAdCreationListener);
        } else {
            nativeAdCreationListener.a(i7.x());
        }
    }

    public b51(C4072a3 adConfiguration, vu1 sdkEnvironmentModule, v41 nativeAdControllers, i41 nativeAdBinderFactory, l41 nativeAdBlockCreatorProvider) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(nativeAdControllers, "nativeAdControllers");
        kotlin.jvm.internal.l.f(nativeAdBinderFactory, "nativeAdBinderFactory");
        kotlin.jvm.internal.l.f(nativeAdBlockCreatorProvider, "nativeAdBlockCreatorProvider");
        this.f25085a = adConfiguration;
        this.f25086b = nativeAdControllers;
        this.f25087c = nativeAdBinderFactory;
        this.f25088d = nativeAdBlockCreatorProvider;
    }
}
