package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* loaded from: classes3.dex */
public final class l81 implements k41 {

    /* renamed from: a, reason: collision with root package name */
    private final k51 f29922a;

    public /* synthetic */ l81(vu1 vu1Var) {
        this(vu1Var, new k51(vu1Var));
    }

    @Override // com.yandex.mobile.ads.impl.k41
    public final void a(Context context, j41 nativeAdBlock, ej0 imageProvider, i41 nativeAdBinderFactory, j51 nativeAdFactoriesProvider, v41 nativeAdControllers, x41 nativeAdCreationListener) {
        h61 h61VarA;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAdBlock, "nativeAdBlock");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(nativeAdBinderFactory, "nativeAdBinderFactory");
        kotlin.jvm.internal.l.f(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        kotlin.jvm.internal.l.f(nativeAdControllers, "nativeAdControllers");
        kotlin.jvm.internal.l.f(nativeAdCreationListener, "nativeAdCreationListener");
        List<w31> listE = nativeAdBlock.c().e();
        if (listE == null || listE.isEmpty()) {
            h61VarA = null;
        } else if (listE.size() > 1) {
            h61VarA = nativeAdBinderFactory.a(context, nativeAdBlock, imageProvider, nativeAdFactoriesProvider, nativeAdControllers);
        } else {
            h61VarA = this.f29922a.a(context, nativeAdBlock, imageProvider, nativeAdBinderFactory, nativeAdFactoriesProvider, nativeAdControllers, listE.get(0));
        }
        if (h61VarA != null) {
            nativeAdCreationListener.a(h61VarA);
        } else {
            nativeAdCreationListener.a(i7.x());
        }
    }

    public l81(vu1 sdkEnvironmentModule, k51 nativeAdFactory) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(nativeAdFactory, "nativeAdFactory");
        this.f29922a = nativeAdFactory;
    }
}
