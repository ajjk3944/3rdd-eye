package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class f51 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final ag<?> f27199a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4217v2 f27200b;

    /* renamed from: c, reason: collision with root package name */
    private final x61 f27201c;

    /* renamed from: d, reason: collision with root package name */
    private final qo1 f27202d;

    /* renamed from: e, reason: collision with root package name */
    private final ir0 f27203e;

    /* renamed from: f, reason: collision with root package name */
    private final bc0 f27204f;

    public f51(ag asset, ir0 ir0Var, InterfaceC4217v2 adClickable, x61 nativeAdViewAdapter, qo1 renderedTimer, bc0 forceImpressionTrackingListener) {
        kotlin.jvm.internal.l.f(asset, "asset");
        kotlin.jvm.internal.l.f(adClickable, "adClickable");
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        kotlin.jvm.internal.l.f(renderedTimer, "renderedTimer");
        kotlin.jvm.internal.l.f(forceImpressionTrackingListener, "forceImpressionTrackingListener");
        this.f27199a = asset;
        this.f27200b = adClickable;
        this.f27201c = nativeAdViewAdapter;
        this.f27202d = renderedTimer;
        this.f27203e = ir0Var;
        this.f27204f = forceImpressionTrackingListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        long jB = this.f27202d.b();
        ir0 ir0Var = this.f27203e;
        if (ir0Var == null || jB < ir0Var.b() || !this.f27199a.e() || !this.f27200b.a(view, this.f27199a, this.f27203e, this.f27201c).a()) {
            return;
        }
        this.f27204f.a();
    }
}
