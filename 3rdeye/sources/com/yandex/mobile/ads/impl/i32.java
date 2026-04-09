package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class i32 implements gq0 {

    /* renamed from: b, reason: collision with root package name */
    private final View f28458b;

    public i32(sf1 htmlWebView) {
        kotlin.jvm.internal.l.f(htmlWebView, "htmlWebView");
        this.f28458b = htmlWebView;
    }

    @Override // com.yandex.mobile.ads.impl.gq0
    public final String a() {
        return C4215v0.a(new Object[]{Boolean.valueOf(this.f28458b.isHardwareAccelerated())}, 1, "supports: {inlineVideo: %s}", "format(...)");
    }
}
