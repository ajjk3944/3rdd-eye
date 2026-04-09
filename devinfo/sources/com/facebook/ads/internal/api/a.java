package com.facebook.ads.internal.api;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements AdComponentViewParentApi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdComponentFrameLayout f8910a;

    public a(AdComponentFrameLayout adComponentFrameLayout) {
        this.f8910a = adComponentFrameLayout;
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super/*android.widget.FrameLayout*/.addView(view, i4, layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(View view) {
        super/*android.widget.FrameLayout*/.bringChildToFront(view);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super/*android.widget.FrameLayout*/.onAttachedToWindow();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super/*android.widget.FrameLayout*/.onDetachedFromWindow();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onMeasure(int i4, int i10) {
        super/*android.widget.FrameLayout*/.onMeasure(i4, i10);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i4) {
        super/*android.widget.FrameLayout*/.onVisibilityChanged(view, i4);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z3) {
        super/*android.widget.FrameLayout*/.onWindowFocusChanged(z3);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super/*android.widget.FrameLayout*/.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void setMeasuredDimension(int i4, int i10) {
        super/*android.widget.FrameLayout*/.setMeasuredDimension(i4, i10);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view) {
        super/*android.widget.FrameLayout*/.addView(view);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view, int i4) {
        super/*android.widget.FrameLayout*/.addView(view, i4);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super/*android.widget.FrameLayout*/.addView(view, layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view, int i4, int i10) {
        super/*android.widget.FrameLayout*/.addView(view, i4, i10);
    }
}
