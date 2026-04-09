package com.bytedance.adsdk.ugeno.le;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends ouw<com.bytedance.adsdk.ugeno.vt.lh> {

    /* renamed from: cf, reason: collision with root package name */
    public com.bytedance.adsdk.ugeno.yu f6904cf;

    public vt(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.yu yuVar = this.f6904cf;
        if (yuVar != null) {
            yuVar.le();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.yu yuVar = this.f6904cf;
        if (yuVar != null) {
            yuVar.ra();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        com.bytedance.adsdk.ugeno.yu yuVar = this.f6904cf;
        if (yuVar != null) {
            yuVar.yu();
        }
        super.onLayout(z3, i4, i10, i11, i12);
        com.bytedance.adsdk.ugeno.yu yuVar2 = this.f6904cf;
        if (yuVar2 != null) {
            yuVar2.fkw();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        com.bytedance.adsdk.ugeno.yu yuVar = this.f6904cf;
        if (yuVar != null) {
            int[] iArrOuw = yuVar.ouw(i4, i10);
            super.onMeasure(iArrOuw[0], iArrOuw[1]);
        } else {
            super.onMeasure(i4, i10);
        }
        com.bytedance.adsdk.ugeno.yu yuVar2 = this.f6904cf;
        if (yuVar2 != null) {
            yuVar2.lh();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        com.bytedance.adsdk.ugeno.yu yuVar = this.f6904cf;
        if (yuVar != null) {
            yuVar.vt(i4, i10);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
    }

    @Override // com.bytedance.adsdk.ugeno.le.ouw
    public final View pno(int i4) {
        return ((com.bytedance.adsdk.ugeno.vt.lh) this.ouw.get(i4)).fkw;
    }
}
