package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class lv0<V extends ViewGroup> implements w00<V> {

    /* renamed from: a, reason: collision with root package name */
    private final kt f30105a;

    /* renamed from: b, reason: collision with root package name */
    private final r41 f30106b;

    public lv0(kt nativeAdAssets, r41 nativeAdContainerViewProvider) {
        kotlin.jvm.internal.l.f(nativeAdAssets, "nativeAdAssets");
        kotlin.jvm.internal.l.f(nativeAdContainerViewProvider, "nativeAdContainerViewProvider");
        this.f30105a = nativeAdAssets;
        this.f30106b = nativeAdContainerViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(V container) {
        kotlin.jvm.internal.l.f(container, "container");
        this.f30106b.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) container.findViewById(R.id.media_container);
        if (extendedViewContainer != null && this.f30105a.h() == null && this.f30105a.i() == null) {
            extendedViewContainer.setVisibility(8);
        }
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
    }
}
