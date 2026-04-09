package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class wo {

    /* renamed from: a, reason: collision with root package name */
    private final ag<?> f35032a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4217v2 f35033b;

    /* renamed from: c, reason: collision with root package name */
    private final x61 f35034c;

    /* renamed from: d, reason: collision with root package name */
    private final qo1 f35035d;

    /* renamed from: e, reason: collision with root package name */
    private final bc0 f35036e;

    public wo(ag<?> asset, InterfaceC4217v2 adClickable, x61 nativeAdViewAdapter, qo1 renderedTimer, bc0 forceImpressionTrackingListener) {
        kotlin.jvm.internal.l.f(asset, "asset");
        kotlin.jvm.internal.l.f(adClickable, "adClickable");
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        kotlin.jvm.internal.l.f(renderedTimer, "renderedTimer");
        kotlin.jvm.internal.l.f(forceImpressionTrackingListener, "forceImpressionTrackingListener");
        this.f35032a = asset;
        this.f35033b = adClickable;
        this.f35034c = nativeAdViewAdapter;
        this.f35035d = renderedTimer;
        this.f35036e = forceImpressionTrackingListener;
    }

    public final View.OnClickListener a(ir0 link) {
        kotlin.jvm.internal.l.f(link, "link");
        return this.f35034c.f().a(this.f35032a, link, this.f35033b, this.f35034c, this.f35035d, this.f35036e);
    }
}
