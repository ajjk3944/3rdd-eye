package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* loaded from: classes3.dex */
public final class wd0 implements sd0 {

    /* renamed from: a, reason: collision with root package name */
    private final xq0<ExtendedNativeAdView> f34908a;

    /* renamed from: b, reason: collision with root package name */
    private final tr f34909b;

    public wd0(xq0<ExtendedNativeAdView> layoutDesignsController, tr contentCloseListener) {
        kotlin.jvm.internal.l.f(layoutDesignsController, "layoutDesignsController");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        this.f34908a = layoutDesignsController;
        this.f34909b = contentCloseListener;
    }

    @Override // com.yandex.mobile.ads.impl.sd0
    public final void c() {
        if (this.f34908a.a()) {
            return;
        }
        this.f34909b.f();
    }

    @Override // com.yandex.mobile.ads.impl.sd0
    public final void invalidate() {
        this.f34908a.b();
    }
}
