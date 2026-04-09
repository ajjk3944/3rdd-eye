package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class v9 implements lg2 {

    /* renamed from: a, reason: collision with root package name */
    private final x61 f34418a;

    /* renamed from: b, reason: collision with root package name */
    private final vo f34419b;

    public v9(x61 nativeAdViewAdapter, vo clickListenerConfigurator) {
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        kotlin.jvm.internal.l.f(clickListenerConfigurator, "clickListenerConfigurator");
        this.f34418a = nativeAdViewAdapter;
        this.f34419b = clickListenerConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.lg2
    public final void a(ag<?> asset, uo clickListenerConfigurable) {
        kotlin.jvm.internal.l.f(asset, "asset");
        kotlin.jvm.internal.l.f(clickListenerConfigurable, "clickListenerConfigurable");
        this.f34419b.a(asset, asset.a(), this.f34418a, clickListenerConfigurable);
    }

    @Override // com.yandex.mobile.ads.impl.lg2
    public final void a(View view, ag asset) {
        kotlin.jvm.internal.l.f(asset, "asset");
        kotlin.jvm.internal.l.f(view, "view");
    }
}
