package com.facebook.ads.internal.api;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements AdComponentViewParentApi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdNativeComponentView f8911a;

    public b(AdNativeComponentView adNativeComponentView) {
        this.f8911a = adNativeComponentView;
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super/*android.widget.RelativeLayout*/.addView(view, i4, layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(View view) {
        super/*android.widget.RelativeLayout*/.bringChildToFront(view);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super/*android.widget.RelativeLayout*/.onAttachedToWindow();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super/*android.widget.RelativeLayout*/.onDetachedFromWindow();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onMeasure(int i4, int i10) {
        super/*android.widget.RelativeLayout*/.onMeasure(i4, i10);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i4) {
        super/*android.widget.RelativeLayout*/.onVisibilityChanged(view, i4);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z3) {
        super/*android.widget.RelativeLayout*/.onWindowFocusChanged(z3);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super/*android.widget.RelativeLayout*/.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void setMeasuredDimension(int i4, int i10) {
        super/*android.widget.RelativeLayout*/.setMeasuredDimension(i4, i10);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view) {
        super/*android.widget.RelativeLayout*/.addView(view);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view, int i4) {
        super/*android.widget.RelativeLayout*/.addView(view, i4);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super/*android.widget.RelativeLayout*/.addView(view, layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view, int i4, int i10) {
        super/*android.widget.RelativeLayout*/.addView(view, i4, i10);
    }
}
