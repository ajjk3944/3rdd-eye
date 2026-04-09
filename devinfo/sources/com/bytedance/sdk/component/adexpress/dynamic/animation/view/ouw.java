package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends TextView implements IAnimation {
    private float fkw;

    /* renamed from: lh, reason: collision with root package name */
    private float f7226lh;
    lh ouw;
    private float vt;
    private float yu;

    public ouw(Context context) {
        super(context);
        this.ouw = new lh();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final float getMarqueeValue() {
        return this.yu;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final float getRippleValue() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final float getShineValue() {
        return this.f7226lh;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final float getStretchValue() {
        return this.fkw;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.ouw.ouw(canvas, this, this);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        this.ouw.ouw(this, i4, i10);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final void setMarqueeValue(float f10) {
        this.yu = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final void setRippleValue(float f10) {
        this.vt = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final void setShineValue(float f10) {
        this.f7226lh = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final void setStretchValue(float f10) {
        this.fkw = f10;
        this.ouw.ouw(this, f10);
    }
}
