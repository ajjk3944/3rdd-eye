package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class gh implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f27686a;

    public gh(ViewTreeObserver.OnGlobalLayoutListener listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f27686a = listener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v10) {
        kotlin.jvm.internal.l.f(v10, "v");
        v10.getViewTreeObserver().addOnGlobalLayoutListener(this.f27686a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v10) {
        kotlin.jvm.internal.l.f(v10, "v");
        v10.getViewTreeObserver().removeOnGlobalLayoutListener(this.f27686a);
    }
}
