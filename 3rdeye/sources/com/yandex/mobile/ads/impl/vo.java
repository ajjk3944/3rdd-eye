package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class vo {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4217v2 f34639a;

    /* renamed from: b, reason: collision with root package name */
    private final qo1 f34640b;

    /* renamed from: c, reason: collision with root package name */
    private final bc0 f34641c;

    public vo(C4210u2 adClickable, qo1 renderedTimer, bc0 forceImpressionTrackingListener) {
        kotlin.jvm.internal.l.f(adClickable, "adClickable");
        kotlin.jvm.internal.l.f(renderedTimer, "renderedTimer");
        kotlin.jvm.internal.l.f(forceImpressionTrackingListener, "forceImpressionTrackingListener");
        this.f34639a = adClickable;
        this.f34640b = renderedTimer;
        this.f34641c = forceImpressionTrackingListener;
    }

    public final void a(ag<?> asset, ir0 ir0Var, x61 nativeAdViewAdapter, uo clickListenerConfigurable) {
        kotlin.jvm.internal.l.f(asset, "asset");
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        kotlin.jvm.internal.l.f(clickListenerConfigurable, "clickListenerConfigurable");
        if (!asset.e() || ir0Var == null) {
            return;
        }
        clickListenerConfigurable.a(ir0Var, new wo(asset, this.f34639a, nativeAdViewAdapter, this.f34640b, this.f34641c));
    }
}
