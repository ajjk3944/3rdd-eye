package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* loaded from: classes3.dex */
public final class fj {

    /* renamed from: a, reason: collision with root package name */
    private final ej<ExtendedNativeAdView> f27347a;

    public fj(ej<ExtendedNativeAdView> layoutDesignsController) {
        kotlin.jvm.internal.l.f(layoutDesignsController, "layoutDesignsController");
        this.f27347a = layoutDesignsController;
    }

    public final void a() {
        this.f27347a.a();
    }

    public final void a(vy1 vy1Var, wi attachEventListener) {
        kotlin.jvm.internal.l.f(attachEventListener, "attachEventListener");
        if (this.f27347a.a(vy1Var)) {
            attachEventListener.a();
        } else {
            attachEventListener.a(i7.i());
        }
    }
}
