package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class d31 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final w21 f25938a;

    /* renamed from: b, reason: collision with root package name */
    private final long f25939b;

    public d31(w21 multiBannerAutoSwipeController, long j4) {
        kotlin.jvm.internal.l.f(multiBannerAutoSwipeController, "multiBannerAutoSwipeController");
        this.f25938a = multiBannerAutoSwipeController;
        this.f25939b = j4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v10) {
        kotlin.jvm.internal.l.f(v10, "v");
        this.f25938a.a(this.f25939b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v10) {
        kotlin.jvm.internal.l.f(v10, "v");
        this.f25938a.b();
    }
}
