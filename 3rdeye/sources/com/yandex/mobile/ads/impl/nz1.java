package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class nz1 implements k41 {
    @Override // com.yandex.mobile.ads.impl.k41
    public final void a(Context context, j41 nativeAdBlock, ej0 imageProvider, i41 nativeAdBinderFactory, j51 nativeAdFactoriesProvider, v41 nativeAdControllers, x41 nativeAdCreationListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAdBlock, "nativeAdBlock");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(nativeAdBinderFactory, "nativeAdBinderFactory");
        kotlin.jvm.internal.l.f(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        kotlin.jvm.internal.l.f(nativeAdControllers, "nativeAdControllers");
        kotlin.jvm.internal.l.f(nativeAdCreationListener, "nativeAdCreationListener");
        nativeAdCreationListener.a(nativeAdBinderFactory.a(context, nativeAdBlock, imageProvider, nativeAdFactoriesProvider, nativeAdControllers));
    }
}
