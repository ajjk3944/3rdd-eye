package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class da implements lg2 {

    /* renamed from: a, reason: collision with root package name */
    private final x61 f26029a;

    /* renamed from: b, reason: collision with root package name */
    private final vo f26030b;

    /* renamed from: c, reason: collision with root package name */
    private final ir0 f26031c;

    /* renamed from: d, reason: collision with root package name */
    private final hh2 f26032d;

    public da(x61 nativeAdViewAdapter, vo clickListenerConfigurator, ir0 ir0Var, hh2 tagCreator) {
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        kotlin.jvm.internal.l.f(clickListenerConfigurator, "clickListenerConfigurator");
        kotlin.jvm.internal.l.f(tagCreator, "tagCreator");
        this.f26029a = nativeAdViewAdapter;
        this.f26030b = clickListenerConfigurator;
        this.f26031c = ir0Var;
        this.f26032d = tagCreator;
    }

    @Override // com.yandex.mobile.ads.impl.lg2
    public final void a(ag<?> asset, uo clickListenerConfigurable) {
        kotlin.jvm.internal.l.f(asset, "asset");
        kotlin.jvm.internal.l.f(clickListenerConfigurable, "clickListenerConfigurable");
        ir0 ir0VarA = asset.a();
        if (ir0VarA == null) {
            ir0VarA = this.f26031c;
        }
        this.f26030b.a(asset, ir0VarA, this.f26029a, clickListenerConfigurable);
    }

    @Override // com.yandex.mobile.ads.impl.lg2
    public final void a(View view, ag asset) {
        kotlin.jvm.internal.l.f(asset, "asset");
        kotlin.jvm.internal.l.f(view, "view");
        if (view.getTag() == null) {
            hh2 hh2Var = this.f26032d;
            String strB = asset.b();
            hh2Var.getClass();
            view.setTag(hh2.a(strB));
        }
    }
}
