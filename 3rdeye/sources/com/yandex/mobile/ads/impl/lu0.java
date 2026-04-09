package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.gu0;

/* loaded from: classes3.dex */
public final class lu0<V extends ViewGroup> implements w00<V> {

    /* renamed from: a, reason: collision with root package name */
    private final r41 f30102a;

    /* renamed from: b, reason: collision with root package name */
    private final mu0 f30103b;

    public lu0(kt nativeAdAssets, r41 nativeAdContainerViewProvider, mu0 mediaAspectRatioProvider) {
        kotlin.jvm.internal.l.f(nativeAdAssets, "nativeAdAssets");
        kotlin.jvm.internal.l.f(nativeAdContainerViewProvider, "nativeAdContainerViewProvider");
        kotlin.jvm.internal.l.f(mediaAspectRatioProvider, "mediaAspectRatioProvider");
        this.f30102a = nativeAdContainerViewProvider;
        this.f30103b = mediaAspectRatioProvider;
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(V container) {
        kotlin.jvm.internal.l.f(container, "container");
        this.f30102a.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) container.findViewById(R.id.media_container);
        Float fA = this.f30103b.a();
        if (extendedViewContainer == null || fA == null) {
            return;
        }
        extendedViewContainer.setMeasureSpecProvider(new fm1(fA.floatValue(), new gu0.a()));
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
    }
}
