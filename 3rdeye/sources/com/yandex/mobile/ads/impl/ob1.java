package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.impl.gu0;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class ob1 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ne2 f31332a;

    /* renamed from: b, reason: collision with root package name */
    private final TextureView f31333b;

    /* renamed from: c, reason: collision with root package name */
    private final ga1 f31334c;

    /* renamed from: d, reason: collision with root package name */
    private wa1 f31335d;

    /* renamed from: e, reason: collision with root package name */
    private gu0 f31336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob1(Context context, ne2 placeholderView, TextureView textureView, ga1 actionViewsContainer) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(placeholderView, "placeholderView");
        kotlin.jvm.internal.l.f(textureView, "textureView");
        kotlin.jvm.internal.l.f(actionViewsContainer, "actionViewsContainer");
        this.f31332a = placeholderView;
        this.f31333b = textureView;
        this.f31334c = actionViewsContainer;
        this.f31336e = new gy1();
    }

    public final ga1 a() {
        return this.f31334c;
    }

    public final ne2 b() {
        return this.f31332a;
    }

    public final TextureView c() {
        return this.f31333b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wa1 wa1Var = this.f31335d;
        if (wa1Var != null) {
            wa1Var.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wa1 wa1Var = this.f31335d;
        if (wa1Var != null) {
            wa1Var.a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        gu0.a aVarA = this.f31336e.a(i, i10);
        super.onMeasure(aVarA.f27985a, aVarA.f27986b);
    }

    public final void setAspectRatio(float f10) {
        this.f31336e = new fm1(f10);
    }

    public final void setOnAttachStateChangeListener(wa1 wa1Var) {
        this.f31335d = wa1Var;
    }
}
