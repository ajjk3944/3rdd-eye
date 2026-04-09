package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.gu0;

/* loaded from: classes3.dex */
public final class yv0<V extends ViewGroup> implements w00<V> {

    /* renamed from: a, reason: collision with root package name */
    private final r41 f35989a;

    /* renamed from: b, reason: collision with root package name */
    private final mu0 f35990b;

    public yv0(kt nativeAdAssets, r41 nativeAdContainerViewProvider, mu0 mediaAspectRatioProvider) {
        kotlin.jvm.internal.l.f(nativeAdAssets, "nativeAdAssets");
        kotlin.jvm.internal.l.f(nativeAdContainerViewProvider, "nativeAdContainerViewProvider");
        kotlin.jvm.internal.l.f(mediaAspectRatioProvider, "mediaAspectRatioProvider");
        this.f35989a = nativeAdContainerViewProvider;
        this.f35990b = mediaAspectRatioProvider;
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(V container) {
        kotlin.jvm.internal.l.f(container, "container");
        this.f35989a.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) container.findViewById(R.id.media_container);
        Float fA = this.f35990b.a();
        if (extendedViewContainer == null || fA == null) {
            return;
        }
        fm1 fm1Var = new fm1(Math.min(Math.max(fA.floatValue(), 1.0f), 1.7777778f), new gu0.a());
        Context applicationContext = container.getContext().getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        extendedViewContainer.setMeasureSpecProvider(new yq(fm1Var, new du0(container, 0.5f, applicationContext)));
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
    }
}
