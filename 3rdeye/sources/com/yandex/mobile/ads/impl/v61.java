package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes3.dex */
public final class v61 implements View.OnTouchListener, View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final no f34398a;

    /* renamed from: b, reason: collision with root package name */
    private final p51 f34399b;

    public v61(Context context, View.OnClickListener onClickListener, no clickAreaVerificationListener, p51 nativeAdHighlightingController) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(onClickListener, "onClickListener");
        kotlin.jvm.internal.l.f(clickAreaVerificationListener, "clickAreaVerificationListener");
        kotlin.jvm.internal.l.f(nativeAdHighlightingController, "nativeAdHighlightingController");
        this.f34398a = clickAreaVerificationListener;
        this.f34399b = nativeAdHighlightingController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f34398a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent event) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(event, "event");
        this.f34399b.b(view, event);
        return this.f34398a.onTouch(view, event);
    }
}
